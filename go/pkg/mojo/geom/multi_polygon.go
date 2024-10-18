package geom

func NewMultiPolygon(coordinates ...*Polygon) *MultiPolygon {
	multipolygon := &MultiPolygon{}
	multipolygon.Polygons = append(multipolygon.Polygons, coordinates...)
	return multipolygon
}

func (x *MultiPolygon) Contains(point *LngLat) bool {
	for _, polygon := range x.Polygons {
		if polygon.Contains(point) {
			return true
		}
	}
	return false
}

func (x *MultiPolygon) Invert() {
	for i := 0; i < len(x.Polygons); i++ {
		x.Polygons[i].Invert()
	}
}

func (x *MultiPolygon) Area() float64 {
	if x != nil {
		area := 0.0
		for _, p := range x.Polygons {
			area += p.Area()
		}
		return area
	}
	return 0
}
