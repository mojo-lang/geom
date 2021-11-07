package geom

func NewGeoJson(data interface{}) *GeoJson {
	switch t := data.(type) {
	case *Feature:
		return &GeoJson{GeoJson: &GeoJson_Feature{Feature: t}}
	case *FeatureCollection:
		return &GeoJson{GeoJson: &GeoJson_FeatureCollection{FeatureCollection: t}}
	case *Point:
		return &GeoJson{GeoJson: &GeoJson_Point{Point: t}}
	case *MultiPoint:
		return &GeoJson{GeoJson: &GeoJson_MultiPoint{MultiPoint: t}}
	case *LineString:
		return &GeoJson{GeoJson: &GeoJson_LineString{LineString: t}}
	case *MultiLineString:
		return &GeoJson{GeoJson: &GeoJson_MultiLineString{MultiLineString: t}}
	case *Polygon:
		return &GeoJson{GeoJson: &GeoJson_Polygon{Polygon: t}}
	case *MultiPolygon:
		return &GeoJson{GeoJson: &GeoJson_MultiPolygon{MultiPolygon: t}}
	case *GeometryCollection:
		return &GeoJson{GeoJson: &GeoJson_GeometryCollection{GeometryCollection: t}}
	default:
		return nil
	}
}

func NewFeatureCollectionGeoJson(features ...*Feature) *GeoJson {
	return NewGeoJson(NewFeatureCollection(features...))
}

func NewPointGeoJson(coordinates *LngLat) *GeoJson {
	return NewGeoJson(NewPoint(coordinates))
}

func NewPointGeoJsonFrom(coordinates ...float64) *GeoJson {
	return NewGeoJson(NewPointFrom(coordinates...))
}

func NewLineStringGeoJson(coordinates ...*LngLat) *GeoJson {
	return NewGeoJson(NewLineString(coordinates...))
}

func NewPolygonGeoJson(lineStrings ...*LineString) *GeoJson {
	return NewGeoJson(NewPolygon(lineStrings...))
}

func NewPolygonGeoJsonFrom(coordinates ...*LngLat) *GeoJson {
	return NewGeoJson(NewPolygonFrom(coordinates...))
}
