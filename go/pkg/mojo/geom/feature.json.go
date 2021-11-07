package geom

import (
	jsoniter "github.com/json-iterator/go"
	"github.com/mojo-lang/core/go/pkg/mojo/core"
	"sort"
	"unsafe"
)

func init() {
	jsoniter.RegisterTypeDecoder("geom.Feature", &FeatureCodec{})
	jsoniter.RegisterTypeEncoder("geom.Feature", &FeatureCodec{})
}

type FeatureCodec struct {
}

func (codec *FeatureCodec) Decode(ptr unsafe.Pointer, iter *jsoniter.Iterator) {
	any := iter.ReadAny()
	if any.ValueType() == jsoniter.ObjectValue {
		t := any.Get("type").ToString()
		if t != "Feature" {
			return
		}

		feature := (*Feature)(ptr)
		feature.Id, _ = core.NewIdCodec().DecodeAny(any.Get("id"))

		g := any.Get("geometry")
		if g.ValueType() == jsoniter.ObjectValue {
			feature.Geometry = &Geometry{}
			g.ToVal(feature.Geometry)
		} else {
			feature.Geometry = nil
		}

		p := any.Get("properties")
		feature.Properties = make(map[string]*core.Value)
		for _, key := range p.Keys() {
			value, err := core.NewValueCodec().DecodeAny(p.Get(key))
			if err != nil {
				iter.ReportError("Decode Feature Properties", err.Error())
			} else {
				feature.Properties[key] = value
			}
		}
	}
}

func (codec *FeatureCodec) IsEmpty(ptr unsafe.Pointer) bool {
	return ((*Feature)(ptr)).Geometry == nil
}

func (codec *FeatureCodec) Encode(ptr unsafe.Pointer, stream *jsoniter.Stream) {
	feature := (*Feature)(ptr)

	stream.WriteObjectStart()
	stream.WriteObjectField("type")
	stream.WriteString("Feature")

	if feature.Id != nil {
		stream.WriteMore()
		stream.WriteObjectField("id")
		stream.WriteVal(feature.Id)
	}

	stream.WriteMore()
	stream.WriteObjectField("geometry")
	stream.WriteVal(feature.Geometry)

	stream.WriteMore()
	stream.WriteObjectField("properties")

	properties := feature.Properties
	if len(properties) == 0 {
		stream.WriteVal(nil)
	} else {
		stream.WriteObjectStart()
		var keys []string
		for key, _ := range properties {
			keys = append(keys, key)
		}
		sort.Strings(keys)

		for i, key := range keys {
			if i > 0 {
				stream.WriteMore()
			}
			stream.WriteObjectField(key)
			stream.WriteVal(properties[key])
		}
		stream.WriteObjectEnd()
	}
	stream.WriteObjectEnd()
}