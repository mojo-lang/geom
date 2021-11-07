package geom

import (
	"github.com/json-iterator/go"
	"unsafe"
)

func init() {
	jsoniter.RegisterTypeDecoder("geom.LineString", &LineStringCodec{})
	jsoniter.RegisterTypeEncoder("geom.LineString", &LineStringCodec{})
}

// make sure LineString is a closed ring
func NewLinearRing(coordinates ...*LngLat) *LineString {
	coordsLen := len(coordinates)
	if coordsLen == 2 {
		box := NewBoundingBox(coordinates[0], coordinates[1])
		points := box.Vertexes()
		points = append(points, box.Vertex(0))
		return NewLineString(points...)
	} else if coordsLen > 2 {
		if !coordinates[0].Equal(coordinates[len(coordinates)-1]) {
			coordinates = append(coordinates, coordinates[0])
		}
		return NewLineString(coordinates...)
	}
	return nil
}

func NewLineString(coordinates ...*LngLat) *LineString {
	line := &LineString{}
	line.Coordinates = append(line.Coordinates, coordinates...)
	return line
}

func (l *LineString) Add(point *LngLat) {
	l.Coordinates = append(l.Coordinates, point)
}

type LineStringCodec struct {
}

func (codec *LineStringCodec) Decode(ptr unsafe.Pointer, iter *jsoniter.Iterator) {
	any := iter.ReadAny()
	if any.ValueType() == jsoniter.ObjectValue {
		c := any.Get("coordinates")
		if c.ValueType() == jsoniter.ArrayValue {
			var coordinates [][]float64
			c.ToVal(&coordinates)

			line := (*LineString)(ptr)
			for _, point := range coordinates {
				if len(point) > 1 {
					lngLat := &LngLat{}
					lngLat.Longitude = point[0]
					lngLat.Latitude = point[1]

					if len(point) > 2 {
						lngLat.Altitude = point[2]
					}
					line.Coordinates = append(line.Coordinates, lngLat)
				}
			}
		}
	}
}

func (codec *LineStringCodec) IsEmpty(ptr unsafe.Pointer) bool {
	return len(((*LineString)(ptr)).Coordinates) == 0
}

func (codec *LineStringCodec) Encode(ptr unsafe.Pointer, stream *jsoniter.Stream) {
	line := (*LineString)(ptr)

	//if len(line.Coordinates) == 0 {
	//	stream.WriteVal(nil)
	//}

	stream.WriteObjectStart()
	stream.WriteObjectField("type")
	stream.WriteString("LineString")
	stream.WriteMore()
	stream.WriteObjectField("coordinates")

	stream.WriteArrayStart()
	for idx, point := range line.Coordinates {
		if idx > 0 {
			stream.WriteMore()
		}

		stream.WriteArrayStart()
		stream.WriteFloat64Lossy(point.Longitude)

		stream.WriteMore()
		stream.WriteFloat64Lossy(point.Latitude)
		if point.Altitude != 0 {
			stream.WriteMore()
			stream.WriteFloat64Lossy(point.Altitude)
		}
		stream.WriteArrayEnd()
	}
	stream.WriteArrayEnd()
	stream.WriteObjectEnd()
}
