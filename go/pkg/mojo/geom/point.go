package geom

import (
	"github.com/json-iterator/go"
	"unsafe"
)

func init() {
	jsoniter.RegisterTypeDecoder("geom.Point", &PointCodec{})
	jsoniter.RegisterTypeEncoder("geom.Point", &PointCodec{})
}

func NewPoint(coordinate *LngLat) *Point {
	return &Point{Coordinate: coordinate}
}

func NewPointFrom(coordinates ...float64) *Point {
	return &Point{Coordinate: NewLngLat(coordinates...)}
}

func (m *Point) GetLongitude() float64 {
	return m.GetCoordinate().GetLongitude()
}

func (m *Point) GetLatitude() float64 {
	return m.GetCoordinate().GetLatitude()
}

func (m *Point) GetAltitude() float64 {
	return m.GetCoordinate().GetAltitude()
}

type PointCodec struct {
}

func (codec *PointCodec) Decode(ptr unsafe.Pointer, iter *jsoniter.Iterator) {
	any := iter.ReadAny()
	if any.ValueType() == jsoniter.ObjectValue {
		c := any.Get("coordinates")
		if c.ValueType() == jsoniter.ArrayValue {
			var coordinates []float64
			c.ToVal(&coordinates)

			point := (*Point)(ptr)
			if len(coordinates) > 1 {
				lngLat := &LngLat{}
				lngLat.Longitude = coordinates[0]
				lngLat.Latitude = coordinates[1]

				if len(coordinates) > 2 {
					lngLat.Altitude = coordinates[2]
				}
				point.Coordinate = lngLat
			}
		}
	}
}

func (codec *PointCodec) IsEmpty(ptr unsafe.Pointer) bool {
	return ((*Point)(ptr)).Coordinate.Latitude == 0
}

func (codec *PointCodec) Encode(ptr unsafe.Pointer, stream *jsoniter.Stream) {
	point := (*Point)(ptr)

	//if point.Coordinates.IsEmpty() {
	//	stream.WriteVal(nil)
	//}

	stream.WriteObjectStart()
	stream.WriteObjectField("type")
	stream.WriteString("Point")
	stream.WriteMore()
	stream.WriteObjectField("coordinates")

	coord := point.Coordinate
	stream.WriteArrayStart()
	if coord != nil {
		stream.WriteFloat64Lossy(coord.Longitude)
		stream.WriteMore()
		stream.WriteFloat64Lossy(coord.Latitude)
		if coord.Altitude != 0 {
			stream.WriteMore()
			stream.WriteFloat64Lossy(coord.Altitude)
		}
	}
	stream.WriteArrayEnd()
	stream.WriteObjectEnd()
}
