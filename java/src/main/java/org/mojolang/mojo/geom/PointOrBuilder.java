// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/geom/point.proto

// Protobuf Java Version: 3.25.1
package org.mojolang.mojo.geom;

public interface PointOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mojo.geom.Point)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string type = 1;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <code>string type = 1;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <code>.mojo.geom.LngLat coordinate = 5 [(.mojo.alias) = "coordinates"];</code>
   * @return Whether the coordinate field is set.
   */
  boolean hasCoordinate();
  /**
   * <code>.mojo.geom.LngLat coordinate = 5 [(.mojo.alias) = "coordinates"];</code>
   * @return The coordinate.
   */
  org.mojolang.mojo.geom.LngLat getCoordinate();
  /**
   * <code>.mojo.geom.LngLat coordinate = 5 [(.mojo.alias) = "coordinates"];</code>
   */
  org.mojolang.mojo.geom.LngLatOrBuilder getCoordinateOrBuilder();
}
