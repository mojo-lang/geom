package geom

func NewMultiLineString(linestring ...*LineString) *MultiLineString {
	multi := &MultiLineString{}
	multi.LineStrings = append(multi.LineStrings, linestring...)
	return multi
}

func NewMultiLineStringFrom(coordinates ...[]*LngLat) *MultiLineString {
	multi := &MultiLineString{}
	for _, c := range coordinates {
		multi.LineStrings = append(multi.LineStrings, &LineString{Coordinates: c})
	}

	return multi
}
