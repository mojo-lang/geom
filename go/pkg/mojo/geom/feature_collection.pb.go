// Code generated by protoc-gen-gogo. DO NOT EDIT.
// source: mojo/geom/feature_collection.proto

package geom

import (
	fmt "fmt"
	proto "github.com/golang/protobuf/proto"
	core "github.com/mojo-lang/core/go/pkg/mojo/core"
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

type FeatureCollection struct {
	Type                 string        `protobuf:"bytes,1,opt,name=type,proto3" json:"type,omitempty"`
	Features             []*Feature    `protobuf:"bytes,5,rep,name=features,proto3" json:"features,omitempty"`
	Keys                 []string      `protobuf:"bytes,13,rep,name=keys,proto3" json:"keys,omitempty"`
	Values               []*core.Value `protobuf:"bytes,14,rep,name=values,proto3" json:"values,omitempty"`
	XXX_NoUnkeyedLiteral struct{}      `json:"-" gorm:"-" xml:"-" bson:"-"`
	XXX_unrecognized     []byte        `json:"-" gorm:"-" xml:"-" bson:"-"`
	XXX_sizecache        int32         `json:"-" gorm:"-" xml:"-" bson:"-"`
}

func (m *FeatureCollection) Reset()         { *m = FeatureCollection{} }
func (m *FeatureCollection) String() string { return proto.CompactTextString(m) }
func (*FeatureCollection) ProtoMessage()    {}
func (*FeatureCollection) Descriptor() ([]byte, []int) {
	return fileDescriptor_4d90c9356766b4e0, []int{0}
}
func (m *FeatureCollection) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_FeatureCollection.Unmarshal(m, b)
}
func (m *FeatureCollection) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_FeatureCollection.Marshal(b, m, deterministic)
}
func (m *FeatureCollection) XXX_Merge(src proto.Message) {
	xxx_messageInfo_FeatureCollection.Merge(m, src)
}
func (m *FeatureCollection) XXX_Size() int {
	return xxx_messageInfo_FeatureCollection.Size(m)
}
func (m *FeatureCollection) XXX_DiscardUnknown() {
	xxx_messageInfo_FeatureCollection.DiscardUnknown(m)
}

var xxx_messageInfo_FeatureCollection proto.InternalMessageInfo

func (m *FeatureCollection) GetType() string {
	if m != nil {
		return m.Type
	}
	return ""
}

func (m *FeatureCollection) GetFeatures() []*Feature {
	if m != nil {
		return m.Features
	}
	return nil
}

func (m *FeatureCollection) GetKeys() []string {
	if m != nil {
		return m.Keys
	}
	return nil
}

func (m *FeatureCollection) GetValues() []*core.Value {
	if m != nil {
		return m.Values
	}
	return nil
}

func init() {
	proto.RegisterType((*FeatureCollection)(nil), "mojo.geom.FeatureCollection")
}

func init() {
	proto.RegisterFile("mojo/geom/feature_collection.proto", fileDescriptor_4d90c9356766b4e0)
}

var fileDescriptor_4d90c9356766b4e0 = []byte{
	// 287 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xe2, 0x52, 0xca, 0xcd, 0xcf, 0xca,
	0xd7, 0x4f, 0x4f, 0xcd, 0xcf, 0xd5, 0x4f, 0x4b, 0x4d, 0x2c, 0x29, 0x2d, 0x4a, 0x8d, 0x4f, 0xce,
	0xcf, 0xc9, 0x49, 0x4d, 0x2e, 0xc9, 0xcc, 0xcf, 0xd3, 0x2b, 0x28, 0xca, 0x2f, 0xc9, 0x17, 0xe2,
	0x04, 0xa9, 0xd1, 0x03, 0xa9, 0x91, 0x12, 0x05, 0x2b, 0x4f, 0xce, 0x2f, 0x4a, 0xd5, 0x2f, 0x4b,
	0xcc, 0x29, 0x4d, 0x85, 0xa8, 0x90, 0x12, 0xc7, 0x30, 0x05, 0x22, 0xa1, 0xf4, 0x9a, 0x91, 0x4b,
	0xd0, 0x0d, 0x22, 0xe2, 0x0c, 0x37, 0x56, 0x48, 0x8d, 0x8b, 0xa5, 0xa4, 0xb2, 0x20, 0x55, 0x82,
	0x51, 0x81, 0x51, 0x83, 0xd3, 0x49, 0xe8, 0xd5, 0x3d, 0x79, 0x3e, 0x10, 0x5f, 0x27, 0x3f, 0x37,
	0xb3, 0x24, 0x35, 0xb7, 0xa0, 0xa4, 0x32, 0x08, 0x2c, 0x2f, 0xe4, 0xc6, 0xc5, 0x01, 0x35, 0xae,
	0x58, 0x82, 0x55, 0x81, 0x59, 0x83, 0xdb, 0x48, 0x48, 0x0f, 0xee, 0x16, 0x3d, 0xa8, 0xb9, 0x4e,
	0x62, 0xaf, 0xee, 0xc9, 0x0b, 0xc1, 0xd4, 0x21, 0x99, 0x01, 0xd7, 0x0b, 0xb2, 0x2f, 0x3b, 0xb5,
	0xb2, 0x58, 0x82, 0x57, 0x81, 0x19, 0x66, 0x1f, 0x88, 0x8f, 0x6c, 0x1f, 0x88, 0x2f, 0x64, 0xc7,
	0xc5, 0x06, 0xf6, 0x55, 0xb1, 0x04, 0x1f, 0xd8, 0x36, 0x01, 0x88, 0x6d, 0x20, 0xef, 0xea, 0x85,
	0x81, 0x24, 0x9c, 0x44, 0x5e, 0xdd, 0x93, 0x17, 0x80, 0xa8, 0x41, 0xd2, 0x0d, 0xd5, 0xe5, 0x94,
	0x3e, 0xe3, 0xb1, 0x1c, 0x03, 0x97, 0x58, 0x7e, 0x51, 0x3a, 0x58, 0x63, 0x4e, 0x62, 0x5e, 0x3a,
	0xc2, 0xbd, 0x4e, 0x62, 0x18, 0x01, 0x11, 0x00, 0x0a, 0xa3, 0x00, 0xc6, 0x28, 0xfd, 0xf4, 0xcc,
	0x92, 0x8c, 0xd2, 0x24, 0xbd, 0xe4, 0xfc, 0x5c, 0x7d, 0x90, 0x7a, 0x5d, 0x90, 0x4e, 0x48, 0x70,
	0xa6, 0xe7, 0xeb, 0x17, 0x64, 0xa7, 0xeb, 0xc3, 0xc3, 0xd7, 0x1a, 0x44, 0x24, 0xb1, 0x81, 0x43,
	0xd7, 0x18, 0x10, 0x00, 0x00, 0xff, 0xff, 0xe7, 0x63, 0xa1, 0x7e, 0xbe, 0x01, 0x00, 0x00,
}
