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
