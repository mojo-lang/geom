// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/geom/bin_lng_lat.proto

// Protobuf Java Version: 3.25.1
package org.mojolang.mojo.geom;

public final class BinLngLatProto {
  private BinLngLatProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_geom_BinLngLat_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_geom_BinLngLat_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033mojo/geom/bin_lng_lat.proto\022\tmojo.geom" +
      "\"B\n\tBinLngLat\022\021\n\tlongitude\030\001 \001(\005\022\020\n\010lati" +
      "tude\030\002 \001(\005\022\020\n\010altitude\030\003 \001(\005B[\n\026org.mojo" +
      "lang.mojo.geomB\016BinLngLatProtoP\001Z/github" +
      ".com/mojo-lang/geom/go/pkg/mojo/geom;geo" +
      "mb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_mojo_geom_BinLngLat_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mojo_geom_BinLngLat_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_geom_BinLngLat_descriptor,
        new java.lang.String[] { "Longitude", "Latitude", "Altitude", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
