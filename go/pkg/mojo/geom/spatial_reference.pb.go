// Code generated by protoc-gen-gogo. DO NOT EDIT.
// source: mojo/geom/spatial_reference.proto

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

type SpatialReference int32

const (
	SpatialReference_SPATIAL_REFERENCE_UNSPECIFIED SpatialReference = 0
	SpatialReference_SPATIAL_REFERENCE_WGS84       SpatialReference = 1
	SpatialReference_SPATIAL_REFERENCE_GCJ02       SpatialReference = 2
	SpatialReference_SPATIAL_REFERENCE_BD09        SpatialReference = 3
	SpatialReference_SPATIAL_REFERENCE_CGCS2000    SpatialReference = 4
	SpatialReference_SPATIAL_REFERENCE_SH2000      SpatialReference = 5
)

var SpatialReference_name = map[int32]string{
	0: "SPATIAL_REFERENCE_UNSPECIFIED",
	1: "SPATIAL_REFERENCE_WGS84",
	2: "SPATIAL_REFERENCE_GCJ02",
	3: "SPATIAL_REFERENCE_BD09",
	4: "SPATIAL_REFERENCE_CGCS2000",
	5: "SPATIAL_REFERENCE_SH2000",
}

var SpatialReference_value = map[string]int32{
	"SPATIAL_REFERENCE_UNSPECIFIED": 0,
	"SPATIAL_REFERENCE_WGS84":       1,
	"SPATIAL_REFERENCE_GCJ02":       2,
	"SPATIAL_REFERENCE_BD09":        3,
	"SPATIAL_REFERENCE_CGCS2000":    4,
	"SPATIAL_REFERENCE_SH2000":      5,
}

func (x SpatialReference) String() string {
	return proto.EnumName(SpatialReference_name, int32(x))
}

func (SpatialReference) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_836c47e3d04cea32, []int{0}
}

func init() {
	proto.RegisterEnum("mojo.geom.SpatialReference", SpatialReference_name, SpatialReference_value)
}

func init() { proto.RegisterFile("mojo/geom/spatial_reference.proto", fileDescriptor_836c47e3d04cea32) }

var fileDescriptor_836c47e3d04cea32 = []byte{
	// 242 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xe2, 0x52, 0xcc, 0xcd, 0xcf, 0xca,
	0xd7, 0x4f, 0x4f, 0xcd, 0xcf, 0xd5, 0x2f, 0x2e, 0x48, 0x2c, 0xc9, 0x4c, 0xcc, 0x89, 0x2f, 0x4a,
	0x4d, 0x4b, 0x2d, 0x4a, 0xcd, 0x4b, 0x4e, 0xd5, 0x2b, 0x28, 0xca, 0x2f, 0xc9, 0x17, 0xe2, 0x04,
	0x29, 0xd1, 0x03, 0x29, 0xd1, 0x3a, 0xc9, 0xc8, 0x25, 0x10, 0x0c, 0x51, 0x16, 0x04, 0x53, 0x25,
	0xa4, 0xc8, 0x25, 0x1b, 0x1c, 0xe0, 0x18, 0xe2, 0xe9, 0xe8, 0x13, 0x1f, 0xe4, 0xea, 0xe6, 0x1a,
	0xe4, 0xea, 0xe7, 0xec, 0x1a, 0x1f, 0xea, 0x17, 0x1c, 0xe0, 0xea, 0xec, 0xe9, 0xe6, 0xe9, 0xea,
	0x22, 0xc0, 0x20, 0x24, 0xcd, 0x25, 0x8e, 0xa9, 0x24, 0xdc, 0x3d, 0xd8, 0xc2, 0x44, 0x80, 0x11,
	0xbb, 0xa4, 0xbb, 0xb3, 0x97, 0x81, 0x91, 0x00, 0x93, 0x90, 0x14, 0x97, 0x18, 0xa6, 0xa4, 0x93,
	0x8b, 0x81, 0xa5, 0x00, 0xb3, 0x90, 0x1c, 0x97, 0x14, 0xa6, 0x9c, 0xb3, 0xbb, 0x73, 0xb0, 0x91,
	0x81, 0x81, 0x81, 0x00, 0x8b, 0x90, 0x0c, 0x97, 0x04, 0xa6, 0x7c, 0xb0, 0x07, 0x58, 0x96, 0xd5,
	0x29, 0x6d, 0xc6, 0x63, 0x39, 0x06, 0x2e, 0xb1, 0xfc, 0xa2, 0x74, 0x3d, 0x90, 0x07, 0x73, 0x12,
	0xf3, 0x20, 0x0c, 0xb0, 0x4f, 0x9d, 0x44, 0xd1, 0xbd, 0x19, 0x00, 0x0a, 0x8b, 0x00, 0xc6, 0x28,
	0xfd, 0xf4, 0xcc, 0x92, 0x8c, 0xd2, 0x24, 0xbd, 0xe4, 0xfc, 0x5c, 0x7d, 0x90, 0x72, 0x5d, 0x90,
	0x46, 0x48, 0x00, 0xa6, 0xe7, 0xeb, 0x17, 0x64, 0xa7, 0xeb, 0xc3, 0x43, 0xd4, 0x1a, 0x44, 0x24,
	0xb1, 0x81, 0x43, 0xd1, 0x18, 0x10, 0x00, 0x00, 0xff, 0xff, 0xc9, 0x2f, 0x9a, 0x8b, 0x6a, 0x01,
	0x00, 0x00,
}
