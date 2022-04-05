package geom

func NewMultiLineString(linestring ...*LineString) *MultiLineString {
    multi := &MultiLineString{}
    multi.LineStrings = append(multi.LineStrings, linestring...)
    return multi
}

func NewMultiLineStringFrom(coordinates ...[]*LngLat) *MultiLineString {
    multi := &MultiLineString{}
    for _, coord := range coordinates {
        multi.LineStrings = append(multi.LineStrings, &LineString{Coordinates: coord})
    }

    return multi
}
