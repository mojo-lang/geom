package geom

// NewLinearRing make sure LineString is a closed ring
func NewLinearRing(coordinates ...*LngLat) *LineString {
    coordsLen := len(coordinates)
    if coordsLen == 2 {
        box := NewBoundingBox(coordinates[0], coordinates[1])
        points := box.Vertexes()
        points = append(points, box.Vertex(0))
        return NewLineString(points...)
    } else if coordsLen > 2 {
        if !coordinates[0].Equal(coordinates[len(coordinates)-1]) {
            coordinates = append(coordinates, coordinates[0])
        }
        return NewLineString(coordinates...)
    }
    return nil
}

func NewLineString(coordinates ...*LngLat) *LineString {
    line := &LineString{}
    line.Coordinates = append(line.Coordinates, coordinates...)
    return line
}

func (x *LineString) Add(point *LngLat) {
    x.Coordinates = append(x.Coordinates, point)
}
