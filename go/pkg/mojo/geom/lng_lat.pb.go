// Code generated by mojo. DO NOT EDIT.

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.0
// 	protoc        v3.21.12
// source: mojo/geom/lng_lat.proto

package geom

import (
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type LngLat struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Longitude float64 `protobuf:"fixed64,1,opt,name=longitude,proto3" json:"longitude,omitempty"`
	Latitude  float64 `protobuf:"fixed64,2,opt,name=latitude,proto3" json:"latitude,omitempty"`
	Altitude  float64 `protobuf:"fixed64,3,opt,name=altitude,proto3" json:"altitude,omitempty"`
}

func (x *LngLat) Reset() {
	*x = LngLat{}
	if protoimpl.UnsafeEnabled {
		mi := &file_mojo_geom_lng_lat_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *LngLat) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*LngLat) ProtoMessage() {}

func (x *LngLat) ProtoReflect() protoreflect.Message {
	mi := &file_mojo_geom_lng_lat_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use LngLat.ProtoReflect.Descriptor instead.
func (*LngLat) Descriptor() ([]byte, []int) {
	return file_mojo_geom_lng_lat_proto_rawDescGZIP(), []int{0}
}

func (x *LngLat) GetLongitude() float64 {
	if x != nil {
		return x.Longitude
	}
	return 0
}

func (x *LngLat) GetLatitude() float64 {
	if x != nil {
		return x.Latitude
	}
	return 0
}

func (x *LngLat) GetAltitude() float64 {
	if x != nil {
		return x.Altitude
	}
	return 0
}

var File_mojo_geom_lng_lat_proto protoreflect.FileDescriptor

var file_mojo_geom_lng_lat_proto_rawDesc = []byte{
	0x0a, 0x17, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x67, 0x65, 0x6f, 0x6d, 0x2f, 0x6c, 0x6e, 0x67, 0x5f,
	0x6c, 0x61, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x09, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e,
	0x67, 0x65, 0x6f, 0x6d, 0x22, 0x5e, 0x0a, 0x06, 0x4c, 0x6e, 0x67, 0x4c, 0x61, 0x74, 0x12, 0x1c,
	0x0a, 0x09, 0x6c, 0x6f, 0x6e, 0x67, 0x69, 0x74, 0x75, 0x64, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28,
	0x01, 0x52, 0x09, 0x6c, 0x6f, 0x6e, 0x67, 0x69, 0x74, 0x75, 0x64, 0x65, 0x12, 0x1a, 0x0a, 0x08,
	0x6c, 0x61, 0x74, 0x69, 0x74, 0x75, 0x64, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x01, 0x52, 0x08,
	0x6c, 0x61, 0x74, 0x69, 0x74, 0x75, 0x64, 0x65, 0x12, 0x1a, 0x0a, 0x08, 0x61, 0x6c, 0x74, 0x69,
	0x74, 0x75, 0x64, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x01, 0x52, 0x08, 0x61, 0x6c, 0x74, 0x69,
	0x74, 0x75, 0x64, 0x65, 0x42, 0x58, 0x0a, 0x16, 0x6f, 0x72, 0x67, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f,
	0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x67, 0x65, 0x6f, 0x6d, 0x42, 0x0b,
	0x4c, 0x6e, 0x67, 0x4c, 0x61, 0x74, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x2f, 0x67,
	0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x6d, 0x6f, 0x6a, 0x6f, 0x2d, 0x6c,
	0x61, 0x6e, 0x67, 0x2f, 0x67, 0x65, 0x6f, 0x6d, 0x2f, 0x67, 0x6f, 0x2f, 0x70, 0x6b, 0x67, 0x2f,
	0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x67, 0x65, 0x6f, 0x6d, 0x3b, 0x67, 0x65, 0x6f, 0x6d, 0x62, 0x06,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_mojo_geom_lng_lat_proto_rawDescOnce sync.Once
	file_mojo_geom_lng_lat_proto_rawDescData = file_mojo_geom_lng_lat_proto_rawDesc
)

func file_mojo_geom_lng_lat_proto_rawDescGZIP() []byte {
	file_mojo_geom_lng_lat_proto_rawDescOnce.Do(func() {
		file_mojo_geom_lng_lat_proto_rawDescData = protoimpl.X.CompressGZIP(file_mojo_geom_lng_lat_proto_rawDescData)
	})
	return file_mojo_geom_lng_lat_proto_rawDescData
}

var file_mojo_geom_lng_lat_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_mojo_geom_lng_lat_proto_goTypes = []interface{}{
	(*LngLat)(nil), // 0: mojo.geom.LngLat
}
var file_mojo_geom_lng_lat_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_mojo_geom_lng_lat_proto_init() }
func file_mojo_geom_lng_lat_proto_init() {
	if File_mojo_geom_lng_lat_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_mojo_geom_lng_lat_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*LngLat); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_mojo_geom_lng_lat_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_mojo_geom_lng_lat_proto_goTypes,
		DependencyIndexes: file_mojo_geom_lng_lat_proto_depIdxs,
		MessageInfos:      file_mojo_geom_lng_lat_proto_msgTypes,
	}.Build()
	File_mojo_geom_lng_lat_proto = out.File
	file_mojo_geom_lng_lat_proto_rawDesc = nil
	file_mojo_geom_lng_lat_proto_goTypes = nil
	file_mojo_geom_lng_lat_proto_depIdxs = nil
}
