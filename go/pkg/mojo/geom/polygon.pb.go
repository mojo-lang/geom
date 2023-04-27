// Code generated by mojo. DO NOT EDIT.

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.0
// 	protoc        v3.21.12
// source: mojo/geom/polygon.proto

package geom

import (
	_ "github.com/mojo-lang/core/go/pkg/mojo"
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

type Polygon struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Type        string        `protobuf:"bytes,1,opt,name=type,proto3" json:"type,omitempty"`
	LineStrings []*LineString `protobuf:"bytes,5,rep,name=line_strings,json=lineStrings,proto3" json:"coordinates,omitempty"`
}

func (x *Polygon) Reset() {
	*x = Polygon{}
	if protoimpl.UnsafeEnabled {
		mi := &file_mojo_geom_polygon_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Polygon) ToText() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Polygon) ProtoMessage() {}

func (x *Polygon) ProtoReflect() protoreflect.Message {
	mi := &file_mojo_geom_polygon_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Polygon.ProtoReflect.Descriptor instead.
func (*Polygon) Descriptor() ([]byte, []int) {
	return file_mojo_geom_polygon_proto_rawDescGZIP(), []int{0}
}

func (x *Polygon) GetType() string {
	if x != nil {
		return x.Type
	}
	return ""
}

func (x *Polygon) GetLineStrings() []*LineString {
	if x != nil {
		return x.LineStrings
	}
	return nil
}

var File_mojo_geom_polygon_proto protoreflect.FileDescriptor

var file_mojo_geom_polygon_proto_rawDesc = []byte{
	0x0a, 0x17, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x67, 0x65, 0x6f, 0x6d, 0x2f, 0x70, 0x6f, 0x6c, 0x79,
	0x67, 0x6f, 0x6e, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x09, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e,
	0x67, 0x65, 0x6f, 0x6d, 0x1a, 0x1b, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x67, 0x65, 0x6f, 0x6d, 0x2f,
	0x6c, 0x69, 0x6e, 0x65, 0x5f, 0x73, 0x74, 0x72, 0x69, 0x6e, 0x67, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x1a, 0x15, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x67, 0x65, 0x6f, 0x6d, 0x2f, 0x70, 0x6f, 0x69,
	0x6e, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x0f, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x6d,
	0x6f, 0x6a, 0x6f, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x68, 0x0a, 0x07, 0x50, 0x6f, 0x6c,
	0x79, 0x67, 0x6f, 0x6e, 0x12, 0x12, 0x0a, 0x04, 0x74, 0x79, 0x70, 0x65, 0x18, 0x01, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x04, 0x74, 0x79, 0x70, 0x65, 0x12, 0x49, 0x0a, 0x0c, 0x6c, 0x69, 0x6e, 0x65,
	0x5f, 0x73, 0x74, 0x72, 0x69, 0x6e, 0x67, 0x73, 0x18, 0x05, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x15,
	0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x67, 0x65, 0x6f, 0x6d, 0x2e, 0x4c, 0x69, 0x6e, 0x65, 0x53,
	0x74, 0x72, 0x69, 0x6e, 0x67, 0x42, 0x0f, 0xca, 0xcf, 0x24, 0x0b, 0x63, 0x6f, 0x6f, 0x72, 0x64,
	0x69, 0x6e, 0x61, 0x74, 0x65, 0x73, 0x52, 0x0b, 0x6c, 0x69, 0x6e, 0x65, 0x53, 0x74, 0x72, 0x69,
	0x6e, 0x67, 0x73, 0x42, 0x59, 0x0a, 0x16, 0x6f, 0x72, 0x67, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x6c,
	0x61, 0x6e, 0x67, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x67, 0x65, 0x6f, 0x6d, 0x42, 0x0c, 0x50,
	0x6f, 0x6c, 0x79, 0x67, 0x6f, 0x6e, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x2f, 0x67,
	0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x6d, 0x6f, 0x6a, 0x6f, 0x2d, 0x6c,
	0x61, 0x6e, 0x67, 0x2f, 0x67, 0x65, 0x6f, 0x6d, 0x2f, 0x67, 0x6f, 0x2f, 0x70, 0x6b, 0x67, 0x2f,
	0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x67, 0x65, 0x6f, 0x6d, 0x3b, 0x67, 0x65, 0x6f, 0x6d, 0x62, 0x06,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_mojo_geom_polygon_proto_rawDescOnce sync.Once
	file_mojo_geom_polygon_proto_rawDescData = file_mojo_geom_polygon_proto_rawDesc
)

func file_mojo_geom_polygon_proto_rawDescGZIP() []byte {
	file_mojo_geom_polygon_proto_rawDescOnce.Do(func() {
		file_mojo_geom_polygon_proto_rawDescData = protoimpl.X.CompressGZIP(file_mojo_geom_polygon_proto_rawDescData)
	})
	return file_mojo_geom_polygon_proto_rawDescData
}

var file_mojo_geom_polygon_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_mojo_geom_polygon_proto_goTypes = []interface{}{
	(*Polygon)(nil),    // 0: mojo.geom.Polygon
	(*LineString)(nil), // 1: mojo.geom.LineString
}
var file_mojo_geom_polygon_proto_depIdxs = []int32{
	1, // 0: mojo.geom.Polygon.line_strings:type_name -> mojo.geom.LineString
	1, // [1:1] is the sub-list for method output_type
	1, // [1:1] is the sub-list for method input_type
	1, // [1:1] is the sub-list for extension type_name
	1, // [1:1] is the sub-list for extension extendee
	0, // [0:1] is the sub-list for field type_name
}

func init() { file_mojo_geom_polygon_proto_init() }
func file_mojo_geom_polygon_proto_init() {
	if File_mojo_geom_polygon_proto != nil {
		return
	}
	file_mojo_geom_line_string_proto_init()
	file_mojo_geom_point_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_mojo_geom_polygon_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Polygon); i {
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
			RawDescriptor: file_mojo_geom_polygon_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_mojo_geom_polygon_proto_goTypes,
		DependencyIndexes: file_mojo_geom_polygon_proto_depIdxs,
		MessageInfos:      file_mojo_geom_polygon_proto_msgTypes,
	}.Build()
	File_mojo_geom_polygon_proto = out.File
	file_mojo_geom_polygon_proto_rawDesc = nil
	file_mojo_geom_polygon_proto_goTypes = nil
	file_mojo_geom_polygon_proto_depIdxs = nil
}
