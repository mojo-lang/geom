package geom

import (
	"github.com/golang/geo/s2"
	"math"
)

func NewPolygon(lineStrings ...*LineString) *Polygon {
	polygon := &Polygon{}
	polygon.LineStrings = append(polygon.LineStrings, lineStrings...)
	return polygon
}

func NewPolygonFrom(coordinates ...*LngLat) *Polygon {
	polygon := &Polygon{}
	polygon.LineStrings = []*LineString{NewLinearRing(coordinates...)}
	return polygon
}

func NewPolygonFromCell(cell s2.Cell) *Polygon {
	points := CellVertexesFromCell(cell)
	return NewPolygonFrom(points[0], points[1], points[2], points[3], points[0])
}

func NewPolygonFromCellID(cid s2.CellID) *Polygon {
	return NewPolygonFromCell(s2.CellFromCellID(cid))
}

func NewPolygonFromGeoHash(geohash string) *Polygon {
	points := GeoHashVertexes(geohash)
	return NewPolygonFrom(points[0], points[1], points[2], points[3], points[0])
}

// Add: Appends the passed in contour to the current Polygon.
// Notice: point is add to first LineString of the Polygon.
func (m *Polygon) Add(point *LngLat) *Polygon {
	if m != nil && len(m.LineStrings) > 0 {
		m.LineStrings[0].Coordinates = append(m.LineStrings[0].Coordinates, point)
	}

	return m
}

// Invert: Invert all LineStrings in the Polygon.
func (m *Polygon) Invert() {
	// For non-special loops, reverse the slice of vertices.
	for _, line := range m.LineStrings {
		for i := len(line.Coordinates)/2 - 1; i >= 0; i-- {
			opp := len(line.Coordinates) - 1 - i
			line.Coordinates[i], line.Coordinates[opp] = line.Coordinates[opp], line.Coordinates[i]
		}
	}
}

// IsClosed returns whether or not the polygon is closed.
// TODO:  This can obviously be improved, but for now,
//        this should be sufficient for detecting if points
//        are contained using the raycast algorithm.
func (m *Polygon) IsClosed() bool {
	for _, line := range m.LineStrings {
		if len(line.Coordinates) < 3 {
			return false
		}
	}

	return true
}

// Contains returns whether or not the current Polygon contains the passed in Point.
// If the Point is contained by only one LineString, it's contained by the Polygon.
func (m *Polygon) Contains(point *LngLat) bool {
	if !m.IsClosed() {
		return false
	}

	contains := false
	for _, line := range m.LineStrings {
		start := len(line.Coordinates) - 1
		end := 0

		if m.intersectsWithRaycast(point, line.Coordinates[start], line.Coordinates[end]) {
			contains = !contains
		}

		for i := 1; i < len(line.Coordinates); i++ {
			if m.intersectsWithRaycast(point, line.Coordinates[i-1], line.Coordinates[i]) {
				contains = !contains
			}
		}
	}

	return contains
}

// Assumption: The holes are not intersected with each other.
func (m *Polygon) Area() float64 {
	var area float64
	for idx, line := range m.LineStrings {
		var pts []s2.Point
		for _, pt := range line.Coordinates {
			pts = append(pts, s2.PointFromLatLng(s2.LatLngFromDegrees(pt.Latitude, pt.Longitude)))
		}
		if len(pts) > 0 && pts[0] == pts[len(pts)-1] {
			pts = pts[:len(pts)-1]
		}
		loop := s2.LoopFromPoints(pts)

		if idx == 0 {
			area += loop.Area()
		} else {
			area -= loop.Area()
		}
	}
	return area
}

// Using the raycast algorithm, this returns whether or not the passed in point
// Intersects with the edge drawn by the passed in start and end points.
// Original implementation: http://rosettacode.org/wiki/Ray-casting_algorithm#Go
func (m *Polygon) intersectsWithRaycast(point *LngLat, start *LngLat, end *LngLat) bool {
	// Always ensure that the the first point
	// has a y coordinate that is less than the second point
	if start.Longitude > end.Longitude {

		// Switch the points if otherwise.
		start, end = end, start

	}

	// Move the point's y coordinate
	// outside of the bounds of the testing region
	// so we can start drawing a ray
	for point.Longitude == start.Longitude || point.Longitude == end.Longitude {
		newLng := math.Nextafter(point.Longitude, math.Inf(1))
		point = NewLngLat(newLng, point.Latitude)
	}

	// If we are outside of the polygon, indicate so.
	if point.Longitude < start.Longitude || point.Longitude > end.Longitude {
		return false
	}

	if start.Latitude > end.Latitude {
		if point.Latitude > start.Latitude {
			return false
		}
		if point.Latitude < end.Latitude {
			return true
		}

	} else {
		if point.Latitude > end.Latitude {
			return false
		}
		if point.Latitude < start.Latitude {
			return true
		}
	}

	raySlope := (point.Longitude - start.Longitude) / (point.Latitude - start.Latitude)
	diagSlope := (end.Longitude - start.Longitude) / (end.Latitude - start.Latitude)

	return raySlope >= diagSlope
}
