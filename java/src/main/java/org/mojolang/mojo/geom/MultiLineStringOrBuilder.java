// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/geom/multi_line_string.proto

// Protobuf Java Version: 3.25.1
package org.mojolang.mojo.geom;

public interface MultiLineStringOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mojo.geom.MultiLineString)
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
   * <code>repeated .mojo.geom.LineString line_strings = 5 [(.mojo.alias) = "coordinates"];</code>
   */
  java.util.List<org.mojolang.mojo.geom.LineString> 
      getLineStringsList();
  /**
   * <code>repeated .mojo.geom.LineString line_strings = 5 [(.mojo.alias) = "coordinates"];</code>
   */
  org.mojolang.mojo.geom.LineString getLineStrings(int index);
  /**
   * <code>repeated .mojo.geom.LineString line_strings = 5 [(.mojo.alias) = "coordinates"];</code>
   */
  int getLineStringsCount();
  /**
   * <code>repeated .mojo.geom.LineString line_strings = 5 [(.mojo.alias) = "coordinates"];</code>
   */
  java.util.List<? extends org.mojolang.mojo.geom.LineStringOrBuilder> 
      getLineStringsOrBuilderList();
  /**
   * <code>repeated .mojo.geom.LineString line_strings = 5 [(.mojo.alias) = "coordinates"];</code>
   */
  org.mojolang.mojo.geom.LineStringOrBuilder getLineStringsOrBuilder(
      int index);
}
