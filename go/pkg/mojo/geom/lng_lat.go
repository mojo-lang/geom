package geom

import (
	"github.com/golang/geo/s2"
	"github.com/mmcloughlin/geohash"
	"math"
)

const (
	// According to Wikipedia, the Earth's radius is about 6,371,004 m
	EarthRadius = 6371000
)

func NewLngLat(coordinates ...float64) *LngLat {
	length := len(coordinates)
	switch length {
	case 0, 1:
		return nil
	case 2:
		return &LngLat{Longitude: coordinates[0], Latitude: coordinates[1]}
	case 3:
		return &LngLat{
			Longitude: coordinates[0],
			Latitude:  coordinates[1],
			Altitude:  coordinates[2],
		}
	default:
		return nil
	}
}

func (m *LngLat) Equal(ll *LngLat) bool {
	if m != nil && ll != nil {
		return lngLatEqual(m.Longitude, ll.Longitude) && lngLatEqual(m.Latitude, ll.Latitude)
	}
	return m == nil && ll == nil
}

func (m *LngLat) IsEmpty() bool {
	return m == nil || (m.Longitude == 0 && m.Latitude == 0 && m.Altitude == 0)
}

func (m LngLat) CellID() s2.CellID {
	return s2.CellFromLatLng(s2.LatLngFromDegrees(m.Latitude, m.Longitude)).ID()
}

func (m LngLat) CellIDWithLevel(level int) s2.CellID {
	return m.CellID().Parent(level)
}

func (m LngLat) GeoHash() string {
	return geohash.Encode(m.Latitude, m.Longitude)
}

func (m *LngLat) GeoHashWithLevel(level int) string {
	return geohash.EncodeWithPrecision(m.Latitude, m.Longitude, uint(level))
}

// Calculates the Haversine distance between two points in meters.
func (m LngLat) Distance(point *LngLat) float64 {
	if point == nil {
		return -1
	}
	return Distance(m.Longitude, m.Latitude, point.Longitude, point.Latitude)
}

// LngLatAtDistanceAndBearing returns a LngLat populated with the Latitude and Longitude coordinates
// by transposing the origin point the passed in distance (in meters)
// by the passed in compass bearing (in degrees).
// Original Implementation from: http://www.movable-type.co.uk/scripts/latlong.html
func (m *LngLat) PointAtDistanceAndBearing(dist float64, bearing float64) *LngLat {

	dr := dist / EarthRadius

	bearing = (bearing * (math.Pi / 180.0))

	lat1 := (m.Latitude * (math.Pi / 180.0))
	lng1 := (m.Longitude * (math.Pi / 180.0))

	lat2_part1 := math.Sin(lat1) * math.Cos(dr)
	lat2_part2 := math.Cos(lat1) * math.Sin(dr) * math.Cos(bearing)

	lat2 := math.Asin(lat2_part1 + lat2_part2)

	lng2_part1 := math.Sin(bearing) * math.Sin(dr) * math.Cos(lat1)
	lng2_part2 := math.Cos(dr) - (math.Sin(lat1) * math.Sin(lat2))

	lng2 := lng1 + math.Atan2(lng2_part1, lng2_part2)
	lng2 = math.Mod((lng2+3*math.Pi), (2*math.Pi)) - math.Pi

	lat2 = lat2 * (180.0 / math.Pi)
	lng2 = lng2 * (180.0 / math.Pi)

	return &LngLat{Latitude: lat2, Longitude: lng2}
}

// GreatCircleDistance: Calculates the Haversine distance between two points in meters.
// Original Implementation from: http://www.movable-type.co.uk/scripts/latlong.html
func (m *LngLat) GreatCircleDistance(p2 *LngLat) float64 {
	dLat := (p2.Latitude - m.Latitude) * (math.Pi / 180.0)
	dLon := (p2.Longitude - m.Longitude) * (math.Pi / 180.0)

	lat1 := m.Latitude * (math.Pi / 180.0)
	lat2 := p2.Latitude * (math.Pi / 180.0)

	a1 := math.Sin(dLat/2) * math.Sin(dLat/2)
	a2 := math.Sin(dLon/2) * math.Sin(dLon/2) * math.Cos(lat1) * math.Cos(lat2)

	a := a1 + a2

	c := 2 * math.Atan2(math.Sqrt(a), math.Sqrt(1-a))

	return EarthRadius * c
}

// BearingTo: Calculates the initial bearing (sometimes referred to as forward azimuth)
// Original Implementation from: http://www.movable-type.co.uk/scripts/latlong.html
func (m *LngLat) BearingTo(p2 *LngLat) float64 {

	dLon := (p2.Longitude - m.Longitude) * math.Pi / 180.0

	lat1 := m.Latitude * math.Pi / 180.0
	lat2 := p2.Latitude * math.Pi / 180.0

	y := math.Sin(dLon) * math.Cos(lat2)
	x := math.Cos(lat1)*math.Sin(lat2) -
		math.Sin(lat1)*math.Cos(lat2)*math.Cos(dLon)
	bearing := math.Atan2(y, x) * 180.0 / math.Pi

	return bearing
}

// MidpointTo: Calculates the midpoint between 'this' point and the supplied point.
// Original implementation from http://www.movable-type.co.uk/scripts/latlong.html
func (m *LngLat) MidpointTo(p2 *LngLat) *LngLat {
	lat1 := m.Latitude * math.Pi / 180.0
	lat2 := p2.Latitude * math.Pi / 180.0

	lon1 := m.Longitude * math.Pi / 180.0
	dLon := (p2.Longitude - m.Longitude) * math.Pi / 180.0

	bx := math.Cos(lat2) * math.Cos(dLon)
	by := math.Cos(lat2) * math.Sin(dLon)

	lat3Rad := math.Atan2(
		math.Sin(lat1)+math.Sin(lat2),
		math.Sqrt(math.Pow(math.Cos(lat1)+bx, 2)+math.Pow(by, 2)),
	)
	lon3Rad := lon1 + math.Atan2(by, math.Cos(lat1)+bx)

	lat3 := lat3Rad * 180.0 / math.Pi
	lon3 := lon3Rad * 180.0 / math.Pi

	return NewLngLat(lon3, lat3)
}

func DistanceBetween(pt1 *LngLat, pt2 *LngLat) float64 {
	if pt1 == nil {
		return -1
	}
	return pt1.Distance(pt2)
}

const float64EqualityThreshold = 1e-9
func lngLatEqual(a, b float64) bool {
	return math.Abs(a - b) <= float64EqualityThreshold
}