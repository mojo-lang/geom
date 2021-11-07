package geom

import (
	jsoniter "github.com/json-iterator/go"
	"unsafe"
)

func init() {
	jsoniter.RegisterTypeDecoder("geom.LngLat", &LngLatCodec{})
}

type LngLatCodec struct {
}

func (codec *LngLatCodec) Decode(ptr unsafe.Pointer, iter *jsoniter.Iterator) {
	any := iter.ReadAny()
	lngLat := (*LngLat)(ptr)
	if any.ValueType() == jsoniter.ArrayValue {
		var points []float64
		any.ToVal(&points)
		if len(points) < 2 {
			iter.ReportError("LngLatCodec.Decode", "invalid format of the lngLat, at least two element")
			return
		}
		lngLat.Longitude = points[0]
		lngLat.Latitude = points[1]
		if len(points) > 2 {
			lngLat.Altitude = points[2]
		}
	} else if any.ValueType() == jsoniter.ObjectValue {
		lng := any.Get("longitude")
		if lng.ValueType() == jsoniter.NumberValue {
			lngLat.Longitude = lng.ToFloat64()
		} else {
				lngLat.Longitude = any.Get("lng").ToFloat64()
		}
		lat := any.Get("latitude")
		if lat.ValueType() == jsoniter.NumberValue {
			lngLat.Latitude = lat.ToFloat64()
		} else {
			lngLat.Latitude = any.Get("lat").ToFloat64()
		}
		alt := any.Get("altitude")
		if lng.ValueType() == jsoniter.NumberValue {
			lngLat.Altitude = alt.ToFloat64()
		} else {
			lngLat.Altitude = any.Get("alt").ToFloat64()
		}
	} else if any.ValueType() == jsoniter.StringValue {
		err := lngLat.Parse(any.ToString())
		if err != nil {
			iter.ReportError("LngLatCodec.Decode", err.Error())
		}
	}
}

func (codec *LngLatCodec) IsEmpty(ptr unsafe.Pointer) bool {
	lngLat := (*LngLat)(ptr)
	return lngLat == nil || lngLat.IsEmpty()
}
