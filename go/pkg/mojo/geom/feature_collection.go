package geom

import (
	"github.com/json-iterator/go"
	"unsafe"
)

func init() {
	jsoniter.RegisterTypeDecoder("geom.FeatureCollection", &FeatureCollectionCodec{})
	jsoniter.RegisterTypeEncoder("geom.FeatureCollection", &FeatureCollectionCodec{})
}

func (p *FeatureCollection) AddFeatures(features ...*Feature) {
	p.Features = append(p.Features, features...)
}

func NewFeatureCollection(features ...*Feature) *FeatureCollection {
	fc := &FeatureCollection{}
	fc.AddFeatures(features...)
	return fc
}

type FeatureCollectionCodec struct {
}

func (codec *FeatureCollectionCodec) Decode(ptr unsafe.Pointer, iter *jsoniter.Iterator) {
	any := iter.ReadAny()
	if any.ValueType() == jsoniter.ObjectValue {
		t := any.Get("type").ToString()
		if t == "FeatureCollection" {
			features := any.Get("features")
			features.ToVal(&((*FeatureCollection)(ptr)).Features)
		} else {
			iter.ReportError("FeatureCollectionDecode", "the type field is invalid")
		}
	}
}

func (codec *FeatureCollectionCodec) IsEmpty(ptr unsafe.Pointer) bool {
	return len(((*FeatureCollection)(ptr)).Features) == 0
}

func (codec *FeatureCollectionCodec) Encode(ptr unsafe.Pointer, stream *jsoniter.Stream) {
	fc := (*FeatureCollection)(ptr)

	stream.WriteObjectStart()

	stream.WriteObjectField("type")
	stream.WriteString("FeatureCollection")

	stream.WriteMore()
	stream.WriteObjectField("features")
	if len(fc.Features) == 0 {
		stream.WriteArrayStart()
		stream.WriteArrayEnd()
	} else {
		stream.WriteVal(fc.Features)
	}

	stream.WriteObjectEnd()
}
