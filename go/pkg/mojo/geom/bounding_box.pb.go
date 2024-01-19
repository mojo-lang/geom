// Code generated by mojo. DO NOT EDIT.

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.32.0
// 	protoc        v4.25.1
// source: mojo/geom/bounding_box.proto

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

type BoundingBox struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	LeftBottom *LngLat `protobuf:"bytes,1,opt,name=left_bottom,json=leftBottom,proto3" json:"leftBottom,omitempty"`
	RightTop   *LngLat `protobuf:"bytes,2,opt,name=right_top,json=rightTop,proto3" json:"rightTop,omitempty"`
}

func (x *BoundingBox) Reset() {
	*x = BoundingBox{}
	if protoimpl.UnsafeEnabled {
		mi := &file_mojo_geom_bounding_box_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *BoundingBox) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*BoundingBox) ProtoMessage() {}

func (x *BoundingBox) ProtoReflect() protoreflect.Message {
	mi := &file_mojo_geom_bounding_box_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use BoundingBox.ProtoReflect.Descriptor instead.
func (*BoundingBox) Descriptor() ([]byte, []int) {
	return file_mojo_geom_bounding_box_proto_rawDescGZIP(), []int{0}
}

func (x *BoundingBox) GetLeftBottom() *LngLat {
	if x != nil {
		return x.LeftBottom
	}
	return nil
}

func (x *BoundingBox) GetRightTop() *LngLat {
	if x != nil {
		return x.RightTop
	}
	return nil
}

var File_mojo_geom_bounding_box_proto protoreflect.FileDescriptor

var file_mojo_geom_bounding_box_proto_rawDesc = []byte{
	0x0a, 0x1c, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x67, 0x65, 0x6f, 0x6d, 0x2f, 0x62, 0x6f, 0x75, 0x6e,
	0x64, 0x69, 0x6e, 0x67, 0x5f, 0x62, 0x6f, 0x78, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x09,
	0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x67, 0x65, 0x6f, 0x6d, 0x1a, 0x17, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f,
	0x67, 0x65, 0x6f, 0x6d, 0x2f, 0x6c, 0x6e, 0x67, 0x5f, 0x6c, 0x61, 0x74, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x22, 0x71, 0x0a, 0x0b, 0x42, 0x6f, 0x75, 0x6e, 0x64, 0x69, 0x6e, 0x67, 0x42, 0x6f,
	0x78, 0x12, 0x32, 0x0a, 0x0b, 0x6c, 0x65, 0x66, 0x74, 0x5f, 0x62, 0x6f, 0x74, 0x74, 0x6f, 0x6d,
	0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x11, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x67, 0x65,
	0x6f, 0x6d, 0x2e, 0x4c, 0x6e, 0x67, 0x4c, 0x61, 0x74, 0x52, 0x0a, 0x6c, 0x65, 0x66, 0x74, 0x42,
	0x6f, 0x74, 0x74, 0x6f, 0x6d, 0x12, 0x2e, 0x0a, 0x09, 0x72, 0x69, 0x67, 0x68, 0x74, 0x5f, 0x74,
	0x6f, 0x70, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x11, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e,
	0x67, 0x65, 0x6f, 0x6d, 0x2e, 0x4c, 0x6e, 0x67, 0x4c, 0x61, 0x74, 0x52, 0x08, 0x72, 0x69, 0x67,
	0x68, 0x74, 0x54, 0x6f, 0x70, 0x42, 0x5d, 0x0a, 0x16, 0x6f, 0x72, 0x67, 0x2e, 0x6d, 0x6f, 0x6a,
	0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x67, 0x65, 0x6f, 0x6d, 0x42,
	0x10, 0x42, 0x6f, 0x75, 0x6e, 0x64, 0x69, 0x6e, 0x67, 0x42, 0x6f, 0x78, 0x50, 0x72, 0x6f, 0x74,
	0x6f, 0x50, 0x01, 0x5a, 0x2f, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f,
	0x6d, 0x6f, 0x6a, 0x6f, 0x2d, 0x6c, 0x61, 0x6e, 0x67, 0x2f, 0x67, 0x65, 0x6f, 0x6d, 0x2f, 0x67,
	0x6f, 0x2f, 0x70, 0x6b, 0x67, 0x2f, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x67, 0x65, 0x6f, 0x6d, 0x3b,
	0x67, 0x65, 0x6f, 0x6d, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_mojo_geom_bounding_box_proto_rawDescOnce sync.Once
	file_mojo_geom_bounding_box_proto_rawDescData = file_mojo_geom_bounding_box_proto_rawDesc
)

func file_mojo_geom_bounding_box_proto_rawDescGZIP() []byte {
	file_mojo_geom_bounding_box_proto_rawDescOnce.Do(func() {
		file_mojo_geom_bounding_box_proto_rawDescData = protoimpl.X.CompressGZIP(file_mojo_geom_bounding_box_proto_rawDescData)
	})
	return file_mojo_geom_bounding_box_proto_rawDescData
}

var file_mojo_geom_bounding_box_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_mojo_geom_bounding_box_proto_goTypes = []interface{}{
	(*BoundingBox)(nil), // 0: mojo.geom.BoundingBox
	(*LngLat)(nil),      // 1: mojo.geom.LngLat
}
var file_mojo_geom_bounding_box_proto_depIdxs = []int32{
	1, // 0: mojo.geom.BoundingBox.left_bottom:type_name -> mojo.geom.LngLat
	1, // 1: mojo.geom.BoundingBox.right_top:type_name -> mojo.geom.LngLat
	2, // [2:2] is the sub-list for method output_type
	2, // [2:2] is the sub-list for method input_type
	2, // [2:2] is the sub-list for extension type_name
	2, // [2:2] is the sub-list for extension extendee
	0, // [0:2] is the sub-list for field type_name
}

func init() { file_mojo_geom_bounding_box_proto_init() }
func file_mojo_geom_bounding_box_proto_init() {
	if File_mojo_geom_bounding_box_proto != nil {
		return
	}
	file_mojo_geom_lng_lat_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_mojo_geom_bounding_box_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*BoundingBox); i {
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
			RawDescriptor: file_mojo_geom_bounding_box_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_mojo_geom_bounding_box_proto_goTypes,
		DependencyIndexes: file_mojo_geom_bounding_box_proto_depIdxs,
		MessageInfos:      file_mojo_geom_bounding_box_proto_msgTypes,
	}.Build()
	File_mojo_geom_bounding_box_proto = out.File
	file_mojo_geom_bounding_box_proto_rawDesc = nil
	file_mojo_geom_bounding_box_proto_goTypes = nil
	file_mojo_geom_bounding_box_proto_depIdxs = nil
}
