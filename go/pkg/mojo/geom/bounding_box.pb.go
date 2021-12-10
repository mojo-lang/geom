// Code generated by protoc-gen-gogo. DO NOT EDIT.
// source: mojo/geom/bounding_box.proto

package geom

import (
	fmt "fmt"
	proto "github.com/golang/protobuf/proto"
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

type BoundingBox struct {
	LeftBottom           *LngLat  `protobuf:"bytes,1,opt,name=left_bottom,json=leftBottom,proto3" json:"leftBottom,omitempty"`
	RightTop             *LngLat  `protobuf:"bytes,2,opt,name=right_top,json=rightTop,proto3" json:"rightTop,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-" gorm:"-" xml:"-" bson:"-"`
	XXX_unrecognized     []byte   `json:"-" gorm:"-" xml:"-" bson:"-"`
	XXX_sizecache        int32    `json:"-" gorm:"-" xml:"-" bson:"-"`
}

func (m *BoundingBox) Reset()         { *m = BoundingBox{} }
func (m *BoundingBox) String() string { return proto.CompactTextString(m) }
func (*BoundingBox) ProtoMessage()    {}
func (*BoundingBox) Descriptor() ([]byte, []int) {
	return fileDescriptor_c94d8405097f53ee, []int{0}
}
func (m *BoundingBox) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_BoundingBox.Unmarshal(m, b)
}
func (m *BoundingBox) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_BoundingBox.Marshal(b, m, deterministic)
}
func (m *BoundingBox) XXX_Merge(src proto.Message) {
	xxx_messageInfo_BoundingBox.Merge(m, src)
}
func (m *BoundingBox) XXX_Size() int {
	return xxx_messageInfo_BoundingBox.Size(m)
}
func (m *BoundingBox) XXX_DiscardUnknown() {
	xxx_messageInfo_BoundingBox.DiscardUnknown(m)
}

var xxx_messageInfo_BoundingBox proto.InternalMessageInfo

func (m *BoundingBox) GetLeftBottom() *LngLat {
	if m != nil {
		return m.LeftBottom
	}
	return nil
}

func (m *BoundingBox) GetRightTop() *LngLat {
	if m != nil {
		return m.RightTop
	}
	return nil
}

func init() {
	proto.RegisterType((*BoundingBox)(nil), "mojo.geom.BoundingBox")
}

func init() { proto.RegisterFile("mojo/geom/bounding_box.proto", fileDescriptor_c94d8405097f53ee) }

var fileDescriptor_c94d8405097f53ee = []byte{
	// 243 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xe2, 0x92, 0xc9, 0xcd, 0xcf, 0xca,
	0xd7, 0x4f, 0x4f, 0xcd, 0xcf, 0xd5, 0x4f, 0xca, 0x2f, 0xcd, 0x4b, 0xc9, 0xcc, 0x4b, 0x8f, 0x4f,
	0xca, 0xaf, 0xd0, 0x2b, 0x28, 0xca, 0x2f, 0xc9, 0x17, 0xe2, 0x04, 0xc9, 0xea, 0x81, 0x64, 0xa5,
	0xc4, 0x11, 0x0a, 0x73, 0xf2, 0xd2, 0xe3, 0x73, 0x12, 0x4b, 0x20, 0x6a, 0x94, 0x16, 0x33, 0x72,
	0x71, 0x3b, 0x41, 0xb5, 0x3a, 0xe5, 0x57, 0x08, 0xf9, 0x70, 0x71, 0xe7, 0xa4, 0xa6, 0x95, 0xc4,
	0x27, 0xe5, 0x97, 0x94, 0xe4, 0xe7, 0x4a, 0x30, 0x2a, 0x30, 0x6a, 0x70, 0x1b, 0x09, 0xea, 0xc1,
	0x4d, 0xd2, 0xf3, 0xc9, 0x4b, 0xf7, 0x49, 0x2c, 0x71, 0x92, 0x78, 0x75, 0x4f, 0x5e, 0x04, 0xa4,
	0xd2, 0x09, 0xac, 0x50, 0x27, 0x3f, 0x37, 0xb3, 0x24, 0x35, 0xb7, 0xa0, 0xa4, 0x32, 0x88, 0x0b,
	0x21, 0x2a, 0xe4, 0xc6, 0xc5, 0x59, 0x94, 0x99, 0x9e, 0x51, 0x12, 0x5f, 0x92, 0x5f, 0x20, 0xc1,
	0x84, 0xcb, 0x2c, 0xb1, 0x57, 0xf7, 0xe4, 0x85, 0xc0, 0xea, 0x42, 0xf2, 0x0b, 0x90, 0x4c, 0xe2,
	0x80, 0x89, 0x39, 0x25, 0xce, 0x78, 0x2c, 0xc7, 0xc0, 0x25, 0x96, 0x5f, 0x94, 0x0e, 0xd6, 0x9d,
	0x93, 0x98, 0x97, 0x8e, 0x30, 0xc6, 0x49, 0x00, 0xc9, 0x03, 0x01, 0x20, 0x5f, 0x05, 0x30, 0x46,
	0xe9, 0xa7, 0x67, 0x96, 0x64, 0x94, 0x26, 0xe9, 0x25, 0xe7, 0xe7, 0xea, 0x83, 0x54, 0xea, 0x82,
	0xf4, 0x40, 0x02, 0x20, 0x3d, 0x5f, 0xbf, 0x20, 0x3b, 0x5d, 0x1f, 0x1e, 0x22, 0xd6, 0x20, 0x22,
	0x89, 0x0d, 0x1c, 0x1e, 0xc6, 0x80, 0x00, 0x00, 0x00, 0xff, 0xff, 0x72, 0xab, 0xfa, 0x72, 0x53,
	0x01, 0x00, 0x00,
}
