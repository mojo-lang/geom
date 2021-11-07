package geom

import (
	jsoniter "github.com/json-iterator/go"
	"unsafe"
)

func NewMultiLineString(linestring ...*LineString) *MultiLineString {
	multi := &MultiLineString{}
	multi.LineStrings = append(multi.LineStrings, linestring...)
	return multi
}

func NewMultiLineStringFrom(coordinates ...[]*LngLat) *MultiLineString {
	multi := &MultiLineString{}
	for _, coord := range coordinates {
		multi.LineStrings = append(multi.LineStrings, &LineString{Coordinates: coord})
	}

	return multi
}

func init() {
	jsoniter.RegisterTypeDecoder("geom.MultiLineString", &MultiLineStringCodec{})
	jsoniter.RegisterTypeEncoder("geom.MultiLineString", &MultiLineStringCodec{})
}

type MultiLineStringCodec struct {
}

func (codec *MultiLineStringCodec) Decode(ptr unsafe.Pointer, iter *jsoniter.Iterator) {
	any := iter.ReadAny()
	if any.ValueType() == jsoniter.ObjectValue {
		//t := any.Get("type")
		c := any.Get("coordinates")
		if c.ValueType() == jsoniter.ArrayValue {
			var coordinates [][][]float64
			c.ToVal(&coordinates)

			multiLineString := (*MultiLineString)(ptr)
			for index := 0; index < len(coordinates); index++ {
				if len(coordinates[index]) > 0 {
					ls := coordinates[index]
					linestring := LineString{}
					for _, point := range ls {
						if len(point) > 1 {
							lngLat := &LngLat{}
							lngLat.Longitude = point[0]
							lngLat.Latitude = point[1]

							if len(point) > 2 {
								lngLat.Altitude = point[2]
							}
							linestring.Coordinates = append(linestring.Coordinates, lngLat)
						}
					}

					multiLineString.LineStrings = append(multiLineString.LineStrings, &linestring)
				}
			}
		}
	}
}

func (codec *MultiLineStringCodec) IsEmpty(ptr unsafe.Pointer) bool {
	return len(((*MultiLineString)(ptr)).LineStrings) == 0
}

func (codec *MultiLineStringCodec) Encode(ptr unsafe.Pointer, stream *jsoniter.Stream) {
	mls := (*MultiLineString)(ptr)
	//if len(mls.LineStrings) == 0 {
	//	stream.WriteVal(nil)
	//}

	stream.WriteObjectStart()
	stream.WriteObjectField("type")
	stream.WriteString("MultiLineString")
	stream.WriteMore()
	stream.WriteObjectField("coordinates")
	stream.WriteArrayStart()
	for i, lineString := range mls.LineStrings {
		if i > 0 {
			stream.WriteMore()
		}
		stream.WriteArrayStart()
		for j, point := range lineString.Coordinates {
			if j > 0 {
				stream.WriteMore()
			}
			stream.WriteArrayStart()

			stream.WriteFloat64Lossy(point.GetLongitude())
			stream.WriteMore()
			stream.WriteFloat64Lossy(point.GetLatitude())
			if point.GetAltitude() != 0 {
				stream.WriteMore()
				stream.WriteFloat64Lossy(point.GetAltitude())
			}
			stream.WriteArrayEnd()
		}
		stream.WriteArrayEnd()
	}
	stream.WriteArrayEnd()
	stream.WriteObjectEnd()
}
