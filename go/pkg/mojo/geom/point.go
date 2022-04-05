package geom

func NewPoint(coordinate *LngLat) *Point {
    return &Point{Coordinate: coordinate}
}

func NewPointFrom(coordinates ...float64) *Point {
    return &Point{Coordinate: NewLngLat(coordinates...)}
}

func (x *Point) GetLongitude() float64 {
    return x.GetCoordinate().GetLongitude()
}

func (x *Point) GetLatitude() float64 {
    return x.GetCoordinate().GetLatitude()
}

func (x *Point) GetAltitude() float64 {
    return x.GetCoordinate().GetAltitude()
}
