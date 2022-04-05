package geom

func NewMultiPoint(points ...*Point) *MultiPoint {
    multipoint := &MultiPoint{}
    multipoint.Points = append(multipoint.Points, points...)
    return multipoint
}

func NewMultiPointFrom(points ...*LngLat) *MultiPoint {
    multipoint := &MultiPoint{}
    for _, p := range points {
        multipoint.Points = append(multipoint.Points, NewPoint(p))
    }
    return multipoint
}

func (x *MultiPoint) GetLngLats() []*LngLat {
    var lngLats []*LngLat
    if x != nil {
        for _, p := range x.Points {
            lngLats = append(lngLats, p.Coordinate)
        }
    }
    return lngLats
}
