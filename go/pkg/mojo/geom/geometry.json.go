package geom

import (
	jsoniter "github.com/json-iterator/go"
	"unsafe"
)

func init() {
	jsoniter.RegisterTypeDecoder("geom.Geometry", &GeometryCodec{})
	jsoniter.RegisterTypeEncoder("geom.Geometry", &GeometryCodec{})
}

type GeometryCodec struct {
}

func (codec *GeometryCodec) Decode(ptr unsafe.Pointer, iter *jsoniter.Iterator) {
	any := iter.ReadAny()
	if any.ValueType() == jsoniter.ObjectValue {
		t := any.Get("type").ToString()
		switch t {
		case "Point":
			val := &Point{}
			any.ToVal(val)
			((*Geometry)(ptr)).Geometry = &Geometry_Point{Point: val}
		case "MultiPoint":
			val := &MultiPoint{}
			any.ToVal(val)
			((*Geometry)(ptr)).Geometry = &Geometry_MultiPoint{MultiPoint: val}
		case "LineString":
			val := &LineString{}
			any.ToVal(val)
			((*Geometry)(ptr)).Geometry = &Geometry_LineString{LineString: val}
		case "MultiLineString":
			val := &MultiLineString{}
			any.ToVal(val)
			((*Geometry)(ptr)).Geometry = &Geometry_MultiLineString{MultiLineString: val}
		case "Polygon":
			val := &Polygon{}
			any.ToVal(val)
			((*Geometry)(ptr)).Geometry = &Geometry_Polygon{Polygon: val}
		case "MultiPolygon":
			val := &MultiPolygon{}
			any.ToVal(val)
			((*Geometry)(ptr)).Geometry = &Geometry_MultiPolygon{val}
		case "GeometryCollection":
			val := &GeometryCollection{}
			any.ToVal(val)
			((*Geometry)(ptr)).Geometry = &Geometry_GeometryCollection{GeometryCollection: val}
		}
	}
}

func (codec *GeometryCodec) IsEmpty(ptr unsafe.Pointer) bool {
	return ((*Geometry)(ptr)).Geometry == nil
}

func (codec *GeometryCodec) Encode(ptr unsafe.Pointer, stream *jsoniter.Stream) {
	geometry := (*Geometry)(ptr)

	switch x := geometry.Geometry.(type) {
	case *Geometry_Point:
		stream.WriteVal(x.Point)
	case *Geometry_MultiPoint:
		stream.WriteVal(x.MultiPoint)
	case *Geometry_LineString:
		stream.WriteVal(x.LineString)
	case *Geometry_MultiLineString:
		stream.WriteVal(x.MultiLineString)
	case *Geometry_Polygon:
		stream.WriteVal(x.Polygon)
	case *Geometry_MultiPolygon:
		stream.WriteVal(x.MultiPolygon)
	case *Geometry_GeometryCollection:
		stream.WriteVal(x.GeometryCollection)
	default:
		stream.WriteObjectStart()
		stream.WriteObjectEnd()
	}
}
