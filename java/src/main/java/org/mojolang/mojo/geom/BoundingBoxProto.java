// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/geom/bounding_box.proto

package org.mojolang.mojo.geom;

public final class BoundingBoxProto {
  private BoundingBoxProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_geom_BoundingBox_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_geom_BoundingBox_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034mojo/geom/bounding_box.proto\022\tmojo.geo" +
      "m\032\027mojo/geom/lng_lat.proto\"[\n\013BoundingBo" +
      "x\022&\n\013left_bottom\030\001 \001(\0132\021.mojo.geom.LngLa" +
      "t\022$\n\tright_top\030\002 \001(\0132\021.mojo.geom.LngLatB" +
      "]\n\026org.mojolang.mojo.geomB\020BoundingBoxPr" +
      "otoP\001Z/github.com/mojo-lang/geom/go/pkg/" +
      "mojo/geom;geomb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.mojolang.mojo.geom.LngLatProto.getDescriptor(),
        });
    internal_static_mojo_geom_BoundingBox_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mojo_geom_BoundingBox_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_geom_BoundingBox_descriptor,
        new java.lang.String[] { "LeftBottom", "RightTop", });
    org.mojolang.mojo.geom.LngLatProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
