// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/geom/multi_polygon.proto

// Protobuf Java Version: 3.25.1
package org.mojolang.mojo.geom;

public final class MultiPolygonProto {
  private MultiPolygonProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_geom_MultiPolygon_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_geom_MultiPolygon_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035mojo/geom/multi_polygon.proto\022\tmojo.ge" +
      "om\032\027mojo/geom/polygon.proto\032\017mojo/mojo.p" +
      "roto\"S\n\014MultiPolygon\022\014\n\004type\030\001 \001(\t\0225\n\010po" +
      "lygons\030\005 \003(\0132\022.mojo.geom.PolygonB\017\312\317$\013co" +
      "ordinatesB^\n\026org.mojolang.mojo.geomB\021Mul" +
      "tiPolygonProtoP\001Z/github.com/mojo-lang/g" +
      "eom/go/pkg/mojo/geom;geomb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.mojolang.mojo.geom.PolygonProto.getDescriptor(),
          com.google.protobuf.MojoProtos.getDescriptor(),
        });
    internal_static_mojo_geom_MultiPolygon_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mojo_geom_MultiPolygon_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_geom_MultiPolygon_descriptor,
        new java.lang.String[] { "Type", "Polygons", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.MojoProtos.alias);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    org.mojolang.mojo.geom.PolygonProto.getDescriptor();
    com.google.protobuf.MojoProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
