// Code generated by protoc-gen-gogo. DO NOT EDIT.
// source: mojo/geom/point.proto

package geom

import (
	fmt "fmt"
	proto "github.com/golang/protobuf/proto"
	_ "github.com/mojo-lang/core/go/pkg/mojo"
	math "math"
)

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.ProtoPackageIsVersion3 // please upgrade the proto package

type Point struct {
	Type                 string   `protobuf:"bytes,1,opt,name=type,proto3" json:"type,omitempty"`
	Coordinate           *LngLat  `protobuf:"bytes,5,opt,name=coordinate,proto3" json:"coordinates,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-" gorm:"-" xml:"-" bson:"-"`
	XXX_unrecognized     []byte   `json:"-" gorm:"-" xml:"-" bson:"-"`
	XXX_sizecache        int32    `json:"-" gorm:"-" xml:"-" bson:"-"`
}

func (m *Point) Reset()         { *m = Point{} }
func (m *Point) String() string { return proto.CompactTextString(m) }
func (*Point) ProtoMessage()    {}
func (*Point) Descriptor() ([]byte, []int) {
	return fileDescriptor_78cf2a47115095d9, []int{0}
}
func (m *Point) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Point.Unmarshal(m, b)
}
func (m *Point) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Point.Marshal(b, m, deterministic)
}
func (m *Point) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Point.Merge(m, src)
}
func (m *Point) XXX_Size() int {
	return xxx_messageInfo_Point.Size(m)
}
func (m *Point) XXX_DiscardUnknown() {
	xxx_messageInfo_Point.DiscardUnknown(m)
}

var xxx_messageInfo_Point proto.InternalMessageInfo

func (m *Point) GetType() string {
	if m != nil {
		return m.Type
	}
	return ""
}

func (m *Point) GetCoordinate() *LngLat {
	if m != nil {
		return m.Coordinate
	}
	return nil
}

func init() {
	proto.RegisterType((*Point)(nil), "mojo.geom.Point")
}

func init() { proto.RegisterFile("mojo/geom/point.proto", fileDescriptor_78cf2a47115095d9) }

var fileDescriptor_78cf2a47115095d9 = []byte{
	// 235 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xe2, 0x12, 0xcd, 0xcd, 0xcf, 0xca,
	0xd7, 0x4f, 0x4f, 0xcd, 0xcf, 0xd5, 0x2f, 0xc8, 0xcf, 0xcc, 0x2b, 0xd1, 0x2b, 0x28, 0xca, 0x2f,
	0xc9, 0x17, 0xe2, 0x04, 0x09, 0xeb, 0x81, 0x84, 0xa5, 0xc4, 0x11, 0x2a, 0x72, 0xf2, 0xd2, 0xe3,
	0x73, 0x12, 0xa1, 0x6a, 0xa4, 0xf8, 0xc1, 0x12, 0x60, 0x85, 0x60, 0x01, 0xa5, 0x1e, 0x46, 0x2e,
	0xd6, 0x00, 0x90, 0x21, 0x42, 0x6a, 0x5c, 0x2c, 0x25, 0x95, 0x05, 0xa9, 0x12, 0x8c, 0x0a, 0x8c,
	0x1a, 0x9c, 0x4e, 0x42, 0xaf, 0xee, 0xc9, 0xf3, 0x81, 0xf8, 0x3a, 0xf9, 0xb9, 0x99, 0x25, 0xa9,
	0xb9, 0x05, 0x25, 0x95, 0x41, 0x60, 0x79, 0xa1, 0x68, 0x2e, 0xae, 0xe4, 0xfc, 0xfc, 0xa2, 0x94,
	0xcc, 0xbc, 0xc4, 0x92, 0x54, 0x09, 0x56, 0x05, 0x46, 0x0d, 0x6e, 0x23, 0x41, 0x3d, 0xb8, 0xdd,
	0x7a, 0x3e, 0x79, 0xe9, 0x3e, 0x89, 0x25, 0x4e, 0x1a, 0xaf, 0xee, 0xc9, 0x8b, 0x22, 0x14, 0x16,
	0x23, 0xcc, 0x39, 0x75, 0x5e, 0x85, 0x1b, 0x49, 0x22, 0x08, 0xc9, 0x38, 0xa7, 0xe8, 0x19, 0x8f,
	0xe5, 0x18, 0xb8, 0xc4, 0xf2, 0x8b, 0xd2, 0xc1, 0x26, 0xe6, 0x24, 0xe6, 0xa5, 0x23, 0x8c, 0x76,
	0xe2, 0x02, 0xbb, 0x34, 0x00, 0xe4, 0xf0, 0x00, 0xc6, 0x28, 0xfd, 0xf4, 0xcc, 0x92, 0x8c, 0xd2,
	0x24, 0xbd, 0xe4, 0xfc, 0x5c, 0xb0, 0x8f, 0x74, 0x41, 0xaa, 0x21, 0x9e, 0x4e, 0xcf, 0xd7, 0x2f,
	0xc8, 0x4e, 0xd7, 0x87, 0x87, 0x82, 0x35, 0x88, 0x48, 0x62, 0x03, 0x7b, 0xd9, 0x18, 0x10, 0x00,
	0x00, 0xff, 0xff, 0xa2, 0xf7, 0x19, 0x0d, 0x40, 0x01, 0x00, 0x00,
}
