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
	geometry.SetValue(val)
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


func (m Geometry) Type() GeometryType {
	switch m.Geometry.(type) {
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

func (m Geometry) TypeString() string {
	switch m.Geometry.(type) {
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

func (m *Geometry) SetValue(val interface{}) error {
	switch x := val.(type) {
	case *Point:
		m.Geometry = &Geometry_Point{Point: x}
	case *MultiPoint:
		m.Geometry = &Geometry_MultiPoint{MultiPoint: x}
	case *LineString:
		m.Geometry = &Geometry_LineString{LineString: x}
	case *MultiLineString:
		m.Geometry = &Geometry_MultiLineString{MultiLineString: x}
	case *Polygon:
		m.Geometry = &Geometry_Polygon{Polygon: x}
	case *MultiPolygon:
		m.Geometry = &Geometry_MultiPolygon{x}
	case *GeometryCollection:
		m.Geometry = &Geometry_GeometryCollection{GeometryCollection: x}
	default:
		return fmt.Errorf("Place.Value has unexpected type %T", x)
	}
	return nil
}
