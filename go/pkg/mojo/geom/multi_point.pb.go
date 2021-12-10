// Code generated by protoc-gen-gogo. DO NOT EDIT.
// source: mojo/geom/multi_point.proto

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

type MultiPoint struct {
	Type                 string   `protobuf:"bytes,1,opt,name=type,proto3" json:"type,omitempty"`
	Points               []*Point `protobuf:"bytes,5,rep,name=points,proto3" json:"coordinates,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-" gorm:"-" xml:"-" bson:"-"`
	XXX_unrecognized     []byte   `json:"-" gorm:"-" xml:"-" bson:"-"`
	XXX_sizecache        int32    `json:"-" gorm:"-" xml:"-" bson:"-"`
}

func (m *MultiPoint) Reset()         { *m = MultiPoint{} }
func (m *MultiPoint) String() string { return proto.CompactTextString(m) }
func (*MultiPoint) ProtoMessage()    {}
func (*MultiPoint) Descriptor() ([]byte, []int) {
	return fileDescriptor_f894c37902cca559, []int{0}
}
func (m *MultiPoint) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_MultiPoint.Unmarshal(m, b)
}
func (m *MultiPoint) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_MultiPoint.Marshal(b, m, deterministic)
}
func (m *MultiPoint) XXX_Merge(src proto.Message) {
	xxx_messageInfo_MultiPoint.Merge(m, src)
}
func (m *MultiPoint) XXX_Size() int {
	return xxx_messageInfo_MultiPoint.Size(m)
}
func (m *MultiPoint) XXX_DiscardUnknown() {
	xxx_messageInfo_MultiPoint.DiscardUnknown(m)
}

var xxx_messageInfo_MultiPoint proto.InternalMessageInfo

func (m *MultiPoint) GetType() string {
	if m != nil {
		return m.Type
	}
	return ""
}

func (m *MultiPoint) GetPoints() []*Point {
	if m != nil {
		return m.Points
	}
	return nil
}

func init() {
	proto.RegisterType((*MultiPoint)(nil), "mojo.geom.MultiPoint")
}

func init() { proto.RegisterFile("mojo/geom/multi_point.proto", fileDescriptor_f894c37902cca559) }

var fileDescriptor_f894c37902cca559 = []byte{
	// 237 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xe2, 0x92, 0xce, 0xcd, 0xcf, 0xca,
	0xd7, 0x4f, 0x4f, 0xcd, 0xcf, 0xd5, 0xcf, 0x2d, 0xcd, 0x29, 0xc9, 0x8c, 0x2f, 0xc8, 0xcf, 0xcc,
	0x2b, 0xd1, 0x2b, 0x28, 0xca, 0x2f, 0xc9, 0x17, 0xe2, 0x04, 0x49, 0xea, 0x81, 0x24, 0xa5, 0x44,
	0x11, 0xea, 0x90, 0x54, 0x48, 0xf1, 0x83, 0x85, 0xc1, 0xca, 0xc0, 0x02, 0x4a, 0x1d, 0x8c, 0x5c,
	0x5c, 0xbe, 0x20, 0x83, 0x02, 0x40, 0xaa, 0x84, 0xd4, 0xb8, 0x58, 0x4a, 0x2a, 0x0b, 0x52, 0x25,
	0x18, 0x15, 0x18, 0x35, 0x38, 0x9d, 0x84, 0x5e, 0xdd, 0x93, 0xe7, 0x03, 0xf1, 0x75, 0xf2, 0x73,
	0x33, 0x4b, 0x52, 0x73, 0x0b, 0x4a, 0x2a, 0x83, 0xc0, 0xf2, 0x42, 0x41, 0x5c, 0x6c, 0x60, 0x63,
	0x8b, 0x25, 0x58, 0x15, 0x98, 0x35, 0xb8, 0x8d, 0x04, 0xf4, 0xe0, 0x56, 0xeb, 0x81, 0x4d, 0x72,
	0xd2, 0x78, 0x75, 0x4f, 0x5e, 0x34, 0x39, 0x3f, 0xbf, 0x28, 0x25, 0x33, 0x2f, 0xb1, 0x24, 0xb5,
	0x18, 0x61, 0xc4, 0xa9, 0xf3, 0x2a, 0xdc, 0x48, 0x12, 0x41, 0x50, 0x93, 0x9c, 0x12, 0x66, 0x3c,
	0x96, 0x63, 0xe0, 0x12, 0xcb, 0x2f, 0x4a, 0x07, 0x1b, 0x96, 0x93, 0x98, 0x97, 0x8e, 0x30, 0xd5,
	0x89, 0x1f, 0xe1, 0xca, 0x00, 0x90, 0xcb, 0x03, 0x18, 0xa3, 0xf4, 0xd3, 0x33, 0x4b, 0x32, 0x4a,
	0x93, 0xf4, 0x92, 0x41, 0x81, 0x91, 0x9f, 0x95, 0xaf, 0x0b, 0xd2, 0x02, 0xf1, 0x73, 0x7a, 0xbe,
	0x7e, 0x41, 0x76, 0xba, 0x3e, 0x3c, 0x10, 0xac, 0x41, 0x44, 0x12, 0x1b, 0xd8, 0xcf, 0xc6, 0x80,
	0x00, 0x00, 0x00, 0xff, 0xff, 0xfb, 0xe2, 0xd3, 0x1b, 0x45, 0x01, 0x00, 0x00,
}
