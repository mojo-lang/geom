// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/geom/line_string.proto

package org.mojolang.mojo.geom;

public final class LineStringProto {
  private LineStringProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_geom_LineString_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_geom_LineString_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_geom_LineStringCoordinates_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_geom_LineStringCoordinates_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033mojo/geom/line_string.proto\022\tmojo.geom" +
      "\032\027mojo/geom/lng_lat.proto\032\025mojo/geom/poi" +
      "nt.proto\"B\n\nLineString\022\014\n\004type\030\001 \001(\t\022&\n\013" +
      "coordinates\030\005 \003(\0132\021.mojo.geom.LngLat\"B\n\025" +
      "LineStringCoordinates\022)\n\004vals\030\001 \003(\0132\033.mo" +
      "jo.geom.PointCoordinatesB\\\n\026org.mojolang" +
      ".mojo.geomB\017LineStringProtoP\001Z/github.co" +
      "m/mojo-lang/geom/go/pkg/mojo/geom;geomb\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.mojolang.mojo.geom.LngLatProto.getDescriptor(),
          org.mojolang.mojo.geom.PointProto.getDescriptor(),
        });
    internal_static_mojo_geom_LineString_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mojo_geom_LineString_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_geom_LineString_descriptor,
        new java.lang.String[] { "Type", "Coordinates", });
    internal_static_mojo_geom_LineStringCoordinates_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_mojo_geom_LineStringCoordinates_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_geom_LineStringCoordinates_descriptor,
        new java.lang.String[] { "Vals", });
    org.mojolang.mojo.geom.LngLatProto.getDescriptor();
    org.mojolang.mojo.geom.PointProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
