package geom

import (
	"github.com/json-iterator/go"
	"unsafe"
)

func init() {
	jsoniter.RegisterTypeDecoder("geom.MultiPolygon", &MultiPolygonCodec{})
	jsoniter.RegisterTypeEncoder("geom.MultiPolygon", &MultiPolygonCodec{})
}

func NewMultiPolygon(coordinates ...*Polygon) *MultiPolygon {
	multipolygon := &MultiPolygon{}
	multipolygon.Polygons = append(multipolygon.Polygons, coordinates...)
	return multipolygon
}

func (p *MultiPolygon) Contains(point *LngLat) bool {
	for _, polygon := range p.Polygons {
		if polygon.Contains(point) {
			return true
		}
	}
	return false
}

func (p *MultiPolygon) Invert() {
	for i := 0; i < len(p.Polygons); i++ {
		p.Polygons[i].Invert()
	}
}

type MultiPolygonCodec struct {
}

func (codec *MultiPolygonCodec) Decode(ptr unsafe.Pointer, iter *jsoniter.Iterator) {
	any := iter.ReadAny()
	if any.ValueType() == jsoniter.ObjectValue {
		c := any.Get("coordinates")
		if c.ValueType() == jsoniter.ArrayValue {
			var coordinates [][][][]float64
			c.ToVal(&coordinates)

			multiPolygon := (*MultiPolygon)(ptr)
			for _, polygon := range coordinates {
				p := Polygon{}
				for _, line := range polygon {
					l := LineString{}
					for _, point := range line {
						if len(point) > 1 {
							lngLat := &LngLat{}
							lngLat.Longitude = point[0]
							lngLat.Latitude = point[1]

							if len(point) > 2 {
								lngLat.Altitude = point[2]
							}
							l.Coordinates = append(l.Coordinates, lngLat)
						}
					}
					p.LineStrings = append(p.LineStrings, &l)
				}
				multiPolygon.Polygons = append(multiPolygon.Polygons, &p)
			}
		}
	}
}

func (codec *MultiPolygonCodec) IsEmpty(ptr unsafe.Pointer) bool {
	return len(((*MultiPolygon)(ptr)).Polygons) == 0
}

func (codec *MultiPolygonCodec) Encode(ptr unsafe.Pointer, stream *jsoniter.Stream) {
	mp := (*MultiPolygon)(ptr)
	//if len(mp.Polygons) == 0 {
	//	stream.WriteVal(nil)
	//}

	stream.WriteObjectStart()
	stream.WriteObjectField("type")
	stream.WriteString("MultiPolygon")
	stream.WriteMore()
	stream.WriteObjectField("coordinates")
	stream.WriteArrayStart()
	for i, polygon := range mp.Polygons {

		if i > 0 {
			stream.WriteMore()
		}
		stream.WriteArrayStart()
		for j, line := range polygon.LineStrings {
			if j > 0 {
				stream.WriteMore()
			}
			stream.WriteArrayStart()
			for k, point := range line.Coordinates {
				if k > 0 {
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
	}
	stream.WriteArrayEnd()
	stream.WriteObjectEnd()
}
