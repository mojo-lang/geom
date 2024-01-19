package geom

import (
	"math"
)

// WGS84坐标系：即地球坐标系，国际上通用的坐标系。
// GCJ02坐标系：即火星坐标系，WGS84坐标系经加密后的坐标系。Google Maps，高德在用。
// BD09坐标系：即百度坐标系，GCJ02坐标系经加密后的坐标系。

const (
	XPI    = math.Pi * 3000.0 / 180.0
	OFFSET = 0.00669342162296594323
	AXIS   = 6378245.0
)

// BD09toGCJ02 百度坐标系->火星坐标系
func BD09toGCJ02(lon, lat float64) (float64, float64) {
	x := lon - 0.0065
	y := lat - 0.006

	z := math.Sqrt(x*x+y*y) - 0.00002*math.Sin(y*XPI)
	theta := math.Atan2(y, x) - 0.000003*math.Cos(x*XPI)

	gLon := z * math.Cos(theta)
	gLat := z * math.Sin(theta)

	return gLon, gLat
}

func BD09toGCJ02With(point *LngLat) *LngLat {
	lng, lat := BD09toGCJ02(point.Longitude, point.Latitude)
	return &LngLat{Longitude: lng, Latitude: lat}
}

// GCJ02toBD09 火星坐标系->百度坐标系
func GCJ02toBD09(lon, lat float64) (float64, float64) {
	z := math.Sqrt(lon*lon+lat*lat) + 0.00002*math.Sin(lat*XPI)
	theta := math.Atan2(lat, lon) + 0.000003*math.Cos(lon*XPI)

	bdLon := z*math.Cos(theta) + 0.0065
	bdLat := z*math.Sin(theta) + 0.006

	return bdLon, bdLat
}

func GCJ02toBD09With(point *LngLat) *LngLat {
	lng, lat := GCJ02toBD09(point.Longitude, point.Latitude)
	return &LngLat{Longitude: lng, Latitude: lat}
}

// WGS84toGCJ02 WGS84坐标系->火星坐标系
func WGS84toGCJ02(lon, lat float64) (float64, float64) {
	if isOutOFChina(lon, lat) {
		return lon, lat
	}

	mgLon, mgLat := delta(lon, lat)

	return mgLon, mgLat
}

func WGS84toGCJ02With(point *LngLat) *LngLat {
	lng, lat := WGS84toGCJ02(point.Longitude, point.Latitude)
	return &LngLat{Longitude: lng, Latitude: lat}
}

// GCJ02toWGS84 火星坐标系->WGS84坐标系
func GCJ02toWGS84(lon, lat float64) (float64, float64) {
	if isOutOFChina(lon, lat) {
		return lon, lat
	}

	mgLon, mgLat := delta(lon, lat)

	return lon*2 - mgLon, lat*2 - mgLat
}

func GCJ02toWGS84With(point *LngLat) *LngLat {
	lng, lat := GCJ02toWGS84(point.Longitude, point.Latitude)
	return &LngLat{Longitude: lng, Latitude: lat}
}

// BD09toWGS84 百度坐标系->WGS84坐标系
func BD09toWGS84(lon, lat float64) (float64, float64) {
	lon, lat = BD09toGCJ02(lon, lat)
	return GCJ02toWGS84(lon, lat)
}

func BD09toWGS84With(point *LngLat) *LngLat {
	lng, lat := BD09toWGS84(point.Longitude, point.Latitude)
	return &LngLat{Longitude: lng, Latitude: lat}
}

// WGS84toBD09 WGS84坐标系->百度坐标系
func WGS84toBD09(lon, lat float64) (float64, float64) {
	lon, lat = WGS84toGCJ02(lon, lat)
	return GCJ02toBD09(lon, lat)
}

func WGS84toBD09With(point *LngLat) *LngLat {
	lng, lat := WGS84toBD09(point.Longitude, point.Latitude)
	return &LngLat{Longitude: lng, Latitude: lat}
}

func delta(lon, lat float64) (float64, float64) {
	dLat := transformLat(lon-105.0, lat-35.0)
	dLon := transformLng(lon-105.0, lat-35.0)

	radLat := lat / 180.0 * math.Pi
	magic := math.Sin(radLat)
	magic = 1 - OFFSET*magic*magic
	sqrtMagic := math.Sqrt(magic)

	dLat = (dLat * 180.0) / ((AXIS * (1 - OFFSET)) / (magic * sqrtMagic) * math.Pi)
	dLon = (dLon * 180.0) / (AXIS / sqrtMagic * math.Cos(radLat) * math.Pi)

	mgLat := lat + dLat
	mgLon := lon + dLon

	return mgLon, mgLat
}

func transformLat(lon, lat float64) float64 {
	var ret = -100.0 + 2.0*lon + 3.0*lat + 0.2*lat*lat + 0.1*lon*lat + 0.2*math.Sqrt(math.Abs(lon))
	ret += (20.0*math.Sin(6.0*lon*math.Pi) + 20.0*math.Sin(2.0*lon*math.Pi)) * 2.0 / 3.0
	ret += (20.0*math.Sin(lat*math.Pi) + 40.0*math.Sin(lat/3.0*math.Pi)) * 2.0 / 3.0
	ret += (160.0*math.Sin(lat/12.0*math.Pi) + 320*math.Sin(lat*math.Pi/30.0)) * 2.0 / 3.0
	return ret
}

func transformLng(lon, lat float64) float64 {
	var ret = 300.0 + lon + 2.0*lat + 0.1*lon*lon + 0.1*lon*lat + 0.1*math.Sqrt(math.Abs(lon))
	ret += (20.0*math.Sin(6.0*lon*math.Pi) + 20.0*math.Sin(2.0*lon*math.Pi)) * 2.0 / 3.0
	ret += (20.0*math.Sin(lon*math.Pi) + 40.0*math.Sin(lon/3.0*math.Pi)) * 2.0 / 3.0
	ret += (150.0*math.Sin(lon/12.0*math.Pi) + 300.0*math.Sin(lon/30.0*math.Pi)) * 2.0 / 3.0
	return ret
}

func isOutOFChina(lon, lat float64) bool {
	return !(lon > 39.386 && lon < 135.05 && lat > 3.86 && lat < 53.55)
}
