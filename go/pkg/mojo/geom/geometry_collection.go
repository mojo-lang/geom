package geom

func NewGeometryCollection(geometries ...*Geometry) *GeometryCollection {
    geometryCollection := &GeometryCollection{}
    geometryCollection.Geometries = geometries
    return geometryCollection
}

func (x *GeometryCollection) AddGeometries(geometries ...*Geometry) {
    x.Geometries = append(x.Geometries, geometries...)
}
