package geom

func (x *FeatureCollection) AddFeatures(features ...*Feature) {
    x.Features = append(x.Features, features...)
}

func NewFeatureCollection(features ...*Feature) *FeatureCollection {
    fc := &FeatureCollection{}
    fc.AddFeatures(features...)
    return fc
}
