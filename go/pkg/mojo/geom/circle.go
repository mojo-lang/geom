package geom

import (
	"math"
)

func (m Circle) ToPolygon(numberOfSegments int) *Polygon {
	if numberOfSegments == 0 {
		numberOfSegments = 32
	}

	lineString := &LineString{}
	lineString.Coordinates = make([]*LngLat, numberOfSegments)
	for i := 0; i < numberOfSegments; i++ {
		lineString.Coordinates[i] = m.destination(2 * math.Pi * float64(-i) / float64(numberOfSegments))
	}
	lineString.Coordinates = append(lineString.Coordinates, lineString.Coordinates[0])

	polygon := &Polygon{}
	polygon.LineStrings = []*LineString{lineString}
	return polygon
}

func (m Circle) destination(bearing float64) *LngLat {
	lat := toRadians(m.Center.Latitude)
	lng := toRadians(m.Center.Longitude)
	var dByR = float64(m.Radius / 6378137.0) // distance divided by 6378137 (radius of the earth) wgs84

	lat = math.Asin(math.Sin(lat)*math.Cos(dByR) + math.Cos(lat)*math.Sin(dByR)*math.Cos(bearing))
	lng = lng + math.Atan2(math.Sin(bearing)*math.Sin(dByR)*math.Cos(lat), math.Cos(dByR)-math.Sin(lat)*math.Sin(lat))
	return &LngLat{Longitude: toDegrees(lng), Latitude: toDegrees(lat)}
}

func toRadians(angleInDegrees float64) float64 {
	return angleInDegrees * math.Pi / 180
}

func toDegrees(angleInRadians float64) float64 {
	return angleInRadians * 180 / math.Pi
}
