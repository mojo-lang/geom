package geom

import (
	"fmt"
)

type GeometryType int

const (
	UnknownType GeometryType = iota
	PointType
	MultiPointType
	LineStringType
	MultiLineStringType
	PolygonType
	MultiPolygonType
	GeometryCollectionType
)

func NewGeometry(val interface{}) *Geometry {
	geometry := &Geometry{}
	_ = geometry.SetValue(val)
	return geometry
}

func NewPointGeometryFrom(coordinates ...float64) *Geometry {
	return NewGeometry(NewPointFrom(coordinates...))
}

func NewPointGeometry(ll *LngLat) *Geometry {
	return NewGeometry(NewPoint(ll))
}

func NewMultiPointGeometry(points ...*Point) *Geometry {
	return NewGeometry(NewMultiPoint(points...))
}

func NewMultiPointGeometryFrom(points ...*LngLat) *Geometry {
	return NewGeometry(NewMultiPointFrom(points...))
}

func NewLineStringGeometry(coordinates ...*LngLat) *Geometry {
	return NewGeometry(NewLineString(coordinates...))
}

func NewMultiLineStringGeometry(lineStrings ...*LineString) *Geometry {
	return NewGeometry(NewMultiLineString(lineStrings...))
}

func NewMultiLineStringGeometryFrom(coordinates ...[]*LngLat) *Geometry {
	return NewGeometry(NewMultiLineStringFrom(coordinates...))
}

func NewPolygonGeometry(lineStrings ...*LineString) *Geometry {
	return NewGeometry(NewPolygon(lineStrings...))
}

func NewPolygonGeometryFrom(coordinates ...*LngLat) *Geometry {
	return NewGeometry(NewPolygonFrom(coordinates...))
}

func NewMultiPolygonGeometry(p ...*Polygon) *Geometry {
	return NewGeometry(NewMultiPolygon(p...))
}

func NewGeometryCollectionGeometry(geometries ...*Geometry) *Geometry {
	return NewGeometry(NewGeometryCollection(geometries...))
}

func (x *Geometry) Type() GeometryType {
	switch x.Geometry.(type) {
	case *Geometry_Point:
		return PointType
	case *Geometry_MultiPoint:
		return MultiPointType
	case *Geometry_LineString:
		return LineStringType
	case *Geometry_MultiLineString:
		return MultiLineStringType
	case *Geometry_Polygon:
		return PolygonType
	case *Geometry_MultiPolygon:
		return MultiPolygonType
	case *Geometry_GeometryCollection:
		return GeometryCollectionType
	default:
		return UnknownType
	}
}

func (x *Geometry) TypeString() string {
	switch x.Geometry.(type) {
	case *Geometry_Point:
		return "Point"
	case *Geometry_MultiPoint:
		return "MultiPoint"
	case *Geometry_LineString:
		return "LineString"
	case *Geometry_MultiLineString:
		return "MultiLineString"
	case *Geometry_Polygon:
		return "Polygon"
	case *Geometry_MultiPolygon:
		return "MultiPolygon"
	case *Geometry_GeometryCollection:
		return "GeometryCollection"
	default:
		return ""
	}
}

func (x *Geometry) SetValue(val interface{}) error {
	switch m := val.(type) {
	case *Point:
		x.Geometry = &Geometry_Point{Point: m}
	case *MultiPoint:
		x.Geometry = &Geometry_MultiPoint{MultiPoint: m}
	case *LineString:
		x.Geometry = &Geometry_LineString{LineString: m}
	case *MultiLineString:
		x.Geometry = &Geometry_MultiLineString{MultiLineString: m}
	case *Polygon:
		x.Geometry = &Geometry_Polygon{Polygon: m}
	case *MultiPolygon:
		x.Geometry = &Geometry_MultiPolygon{m}
	case *GeometryCollection:
		x.Geometry = &Geometry_GeometryCollection{GeometryCollection: m}
	default:
		return fmt.Errorf("Place.Value has unexpected type %T", m)
	}
	return nil
}
