// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/geom/geom.proto

// Protobuf Java Version: 3.25.1
package org.mojolang.mojo.geom;

public final class GeomProto {
  private GeomProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_geom_Geometry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_geom_Geometry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_geom_GeometryCollection_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_geom_GeometryCollection_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024mojo/geom/geom.proto\022\tmojo.geom\032\033mojo/" +
      "geom/line_string.proto\032!mojo/geom/multi_" +
      "line_string.proto\032\033mojo/geom/multi_point" +
      ".proto\032\035mojo/geom/multi_polygon.proto\032\025m" +
      "ojo/geom/point.proto\032\027mojo/geom/polygon." +
      "proto\"\345\002\n\010Geometry\022!\n\005point\030\001 \001(\0132\020.mojo" +
      ".geom.PointH\000\022,\n\013multi_point\030\002 \001(\0132\025.moj" +
      "o.geom.MultiPointH\000\022,\n\013line_string\030\003 \001(\013" +
      "2\025.mojo.geom.LineStringH\000\0227\n\021multi_line_" +
      "string\030\004 \001(\0132\032.mojo.geom.MultiLineString" +
      "H\000\022%\n\007polygon\030\005 \001(\0132\022.mojo.geom.PolygonH" +
      "\000\0220\n\rmulti_polygon\030\006 \001(\0132\027.mojo.geom.Mul" +
      "tiPolygonH\000\022<\n\023geometry_collection\030\007 \001(\013" +
      "2\035.mojo.geom.GeometryCollectionH\000B\n\n\010geo" +
      "metry\"K\n\022GeometryCollection\022\014\n\004type\030\001 \001(" +
      "\t\022\'\n\ngeometries\030\005 \003(\0132\023.mojo.geom.Geomet" +
      "ryBV\n\026org.mojolang.mojo.geomB\tGeomProtoP" +
      "\001Z/github.com/mojo-lang/geom/go/pkg/mojo" +
      "/geom;geomb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.mojolang.mojo.geom.LineStringProto.getDescriptor(),
          org.mojolang.mojo.geom.MultiLineStringProto.getDescriptor(),
          org.mojolang.mojo.geom.MultiPointProto.getDescriptor(),
          org.mojolang.mojo.geom.MultiPolygonProto.getDescriptor(),
          org.mojolang.mojo.geom.PointProto.getDescriptor(),
          org.mojolang.mojo.geom.PolygonProto.getDescriptor(),
        });
    internal_static_mojo_geom_Geometry_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mojo_geom_Geometry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_geom_Geometry_descriptor,
        new java.lang.String[] { "Point", "MultiPoint", "LineString", "MultiLineString", "Polygon", "MultiPolygon", "GeometryCollection", "Geometry", });
    internal_static_mojo_geom_GeometryCollection_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_mojo_geom_GeometryCollection_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_geom_GeometryCollection_descriptor,
        new java.lang.String[] { "Type", "Geometries", });
    org.mojolang.mojo.geom.LineStringProto.getDescriptor();
    org.mojolang.mojo.geom.MultiLineStringProto.getDescriptor();
    org.mojolang.mojo.geom.MultiPointProto.getDescriptor();
    org.mojolang.mojo.geom.MultiPolygonProto.getDescriptor();
    org.mojolang.mojo.geom.PointProto.getDescriptor();
    org.mojolang.mojo.geom.PolygonProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
