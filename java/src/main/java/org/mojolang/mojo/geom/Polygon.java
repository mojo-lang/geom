// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/geom/polygon.proto

package org.mojolang.mojo.geom;

/**
 * Protobuf type {@code mojo.geom.Polygon}
 */
public final class Polygon extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:mojo.geom.Polygon)
    PolygonOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Polygon.newBuilder() to construct.
  private Polygon(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Polygon() {
    type_ = "";
    lineStrings_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Polygon();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Polygon(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            type_ = s;
            break;
          }
          case 42: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              lineStrings_ = new java.util.ArrayList<org.mojolang.mojo.geom.LineString>();
              mutable_bitField0_ |= 0x00000001;
            }
            lineStrings_.add(
                input.readMessage(org.mojolang.mojo.geom.LineString.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        lineStrings_ = java.util.Collections.unmodifiableList(lineStrings_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.mojolang.mojo.geom.PolygonProto.internal_static_mojo_geom_Polygon_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.mojolang.mojo.geom.PolygonProto.internal_static_mojo_geom_Polygon_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.mojolang.mojo.geom.Polygon.class, org.mojolang.mojo.geom.Polygon.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object type_;
  /**
   * <code>string type = 1;</code>
   * @return The type.
   */
  @java.lang.Override
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <code>string type = 1;</code>
   * @return The bytes for type.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LINE_STRINGS_FIELD_NUMBER = 5;
  private java.util.List<org.mojolang.mojo.geom.LineString> lineStrings_;
  /**
   * <code>repeated .mojo.geom.LineString line_strings = 5 [(.mojo.alias) = "coordinates"];</code>
   */
  @java.lang.Override
  public java.util.List<org.mojolang.mojo.geom.LineString> getLineStringsList() {
    return lineStrings_;
  }
  /**
   * <code>repeated .mojo.geom.LineString line_strings = 5 [(.mojo.alias) = "coordinates"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.mojolang.mojo.geom.LineStringOrBuilder> 
      getLineStringsOrBuilderList() {
    return lineStrings_;
  }
  /**
   * <code>repeated .mojo.geom.LineString line_strings = 5 [(.mojo.alias) = "coordinates"];</code>
   */
  @java.lang.Override
  public int getLineStringsCount() {
    return lineStrings_.size();
  }
  /**
   * <code>repeated .mojo.geom.LineString line_strings = 5 [(.mojo.alias) = "coordinates"];</code>
   */
  @java.lang.Override
  public org.mojolang.mojo.geom.LineString getLineStrings(int index) {
    return lineStrings_.get(index);
  }
  /**
   * <code>repeated .mojo.geom.LineString line_strings = 5 [(.mojo.alias) = "coordinates"];</code>
   */
  @java.lang.Override
  public org.mojolang.mojo.geom.LineStringOrBuilder getLineStringsOrBuilder(
      int index) {
    return lineStrings_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, type_);
    }
    for (int i = 0; i < lineStrings_.size(); i++) {
      output.writeMessage(5, lineStrings_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, type_);
    }
    for (int i = 0; i < lineStrings_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, lineStrings_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.mojolang.mojo.geom.Polygon)) {
      return super.equals(obj);
    }
    org.mojolang.mojo.geom.Polygon other = (org.mojolang.mojo.geom.Polygon) obj;

    if (!getType()
        .equals(other.getType())) return false;
    if (!getLineStringsList()
        .equals(other.getLineStringsList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    if (getLineStringsCount() > 0) {
      hash = (37 * hash) + LINE_STRINGS_FIELD_NUMBER;
      hash = (53 * hash) + getLineStringsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.mojolang.mojo.geom.Polygon parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.geom.Polygon parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.geom.Polygon parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.geom.Polygon parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.geom.Polygon parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.geom.Polygon parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.geom.Polygon parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.geom.Polygon parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.geom.Polygon parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.geom.Polygon parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.geom.Polygon parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.geom.Polygon parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.mojolang.mojo.geom.Polygon prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code mojo.geom.Polygon}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:mojo.geom.Polygon)
      org.mojolang.mojo.geom.PolygonOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.mojolang.mojo.geom.PolygonProto.internal_static_mojo_geom_Polygon_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.mojolang.mojo.geom.PolygonProto.internal_static_mojo_geom_Polygon_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.mojolang.mojo.geom.Polygon.class, org.mojolang.mojo.geom.Polygon.Builder.class);
    }

    // Construct using org.mojolang.mojo.geom.Polygon.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getLineStringsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      type_ = "";

      if (lineStringsBuilder_ == null) {
        lineStrings_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        lineStringsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.mojolang.mojo.geom.PolygonProto.internal_static_mojo_geom_Polygon_descriptor;
    }

    @java.lang.Override
    public org.mojolang.mojo.geom.Polygon getDefaultInstanceForType() {
      return org.mojolang.mojo.geom.Polygon.getDefaultInstance();
    }

    @java.lang.Override
    public org.mojolang.mojo.geom.Polygon build() {
      org.mojolang.mojo.geom.Polygon result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.mojolang.mojo.geom.Polygon buildPartial() {
      org.mojolang.mojo.geom.Polygon result = new org.mojolang.mojo.geom.Polygon(this);
      int from_bitField0_ = bitField0_;
      result.type_ = type_;
      if (lineStringsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          lineStrings_ = java.util.Collections.unmodifiableList(lineStrings_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.lineStrings_ = lineStrings_;
      } else {
        result.lineStrings_ = lineStringsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.mojolang.mojo.geom.Polygon) {
        return mergeFrom((org.mojolang.mojo.geom.Polygon)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.mojolang.mojo.geom.Polygon other) {
      if (other == org.mojolang.mojo.geom.Polygon.getDefaultInstance()) return this;
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        onChanged();
      }
      if (lineStringsBuilder_ == null) {
        if (!other.lineStrings_.isEmpty()) {
          if (lineStrings_.isEmpty()) {
            lineStrings_ = other.lineStrings_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLineStringsIsMutable();
            lineStrings_.addAll(other.lineStrings_);
          }
          onChanged();
        }
      } else {
        if (!other.lineStrings_.isEmpty()) {
          if (lineStringsBuilder_.isEmpty()) {
            lineStringsBuilder_.dispose();
            lineStringsBuilder_ = null;
            lineStrings_ = other.lineStrings_;
            bitField0_ = (bitField0_ & ~0x00000001);
            lineStringsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLineStringsFieldBuilder() : null;
          } else {
            lineStringsBuilder_.addAllMessages(other.lineStrings_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.mojolang.mojo.geom.Polygon parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.mojolang.mojo.geom.Polygon) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object type_ = "";
    /**
     * <code>string type = 1;</code>
     * @return The type.
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string type = 1;</code>
     * @return The bytes for type.
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = getDefaultInstance().getType();
      onChanged();
      return this;
    }
    /**
     * <code>string type = 1;</code>
     * @param value The bytes for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      type_ = value;
      onChanged();
      return this;
    }

    private java.util.List<org.mojolang.mojo.geom.LineString> lineStrings_ =
      java.util.Collections.emptyList();
    private void ensureLineStringsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        lineStrings_ = new java.util.ArrayList<org.mojolang.mojo.geom.LineString>(lineStrings_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.mojolang.mojo.geom.LineString, org.mojolang.mojo.geom.LineString.Builder, org.mojolang.mojo.geom.LineStringOrBuilder> lineStringsBuilder_;

    /**
     * <code>repeated .mojo.geom.LineString line_strings = 5 [(.mojo.alias) = "coordinates"];</code>
     */
    public java.util.List<org.mojolang.mojo.geom.LineString> getLineStringsList() {
      if (lineStringsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(lineStrings_);
      } else {
        return lineStringsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .mojo.geom.LineString line_strings = 5 [(.mojo.alias) = "coordinates"];</code>
     */
    public int getLineStringsCount() {
      if (lineStringsBuilder_ == null) {
        return lineStrings_.size();
      } else {
        return lineStringsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .mojo.geom.LineString line_strings = 5 [(.mojo.alias) = "coordinates"];</code>
     */
    public org.mojolang.mojo.geom.LineString getLineStrings(int index) {
      if (lineStringsBuilder_ == null) {
        return lineStrings_.get(index);
      } else {
        return lineStringsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .mojo.geom.LineString line_strings = 5 [(.mojo.alias) = "coordinates"];</code>
     */
    public Builder setLineStrings(
        int index, org.mojolang.mojo.geom.LineString value) {
      if (lineStringsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLineStringsIsMutable();
        lineStrings_.set(index, value);
        onChanged();
      } else {
        lineStringsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.geom.LineString line_strings = 5 [(.mojo.alias) = "coordinates"];</code>
     */
    public Builder setLineStrings(
        int index, org.mojolang.mojo.geom.LineString.Builder builderForValue) {
      if (lineStringsBuilder_ == null) {
        ensureLineStringsIsMutable();
        lineStrings_.set(index, builderForValue.build());
        onChanged();
      } else {
        lineStringsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .mojo.geom.LineString line_strings = 5 [(.mojo.alias) = "coordinates"];</code>
     */
    public Builder addLineStrings(org.mojolang.mojo.geom.LineString value) {
      if (lineStringsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLineStringsIsMutable();
        lineStrings_.add(value);
        onChanged();
      } else {
        lineStringsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.geom.LineString line_strings = 5 [(.mojo.alias) = "coordinates"];</code>
     */
    public Builder addLineStrings(
        int index, org.mojolang.mojo.geom.LineString value) {
      if (lineStringsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLineStringsIsMutable();
        lineStrings_.add(index, value);
        onChanged();
      } else {
        lineStringsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.geom.LineString line_strings = 5 [(.mojo.alias) = "coordinates"];</code>
     */
    public Builder addLineStrings(
        org.mojolang.mojo.geom.LineString.Builder builderForValue) {
      if (lineStringsBuilder_ == null) {
        ensureLineStringsIsMutable();
        lineStrings_.add(builderForValue.build());
        onChanged();
      } else {
        lineStringsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .mojo.geom.LineString line_strings = 5 [(.mojo.alias) = "coordinates"];</code>
     */
    public Builder addLineStrings(
        int index, org.mojolang.mojo.geom.LineString.Builder builderForValue) {
      if (lineStringsBuilder_ == null) {
        ensureLineStringsIsMutable();
        lineStrings_.add(index, builderForValue.build());
        onChanged();
      } else {
        lineStringsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .mojo.geom.LineString line_strings = 5 [(.mojo.alias) = "coordinates"];</code>
     */
    public Builder addAllLineStrings(
        java.lang.Iterable<? extends org.mojolang.mojo.geom.LineString> values) {
      if (lineStringsBuilder_ == null) {
        ensureLineStringsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, lineStrings_);
        onChanged();
      } else {
        lineStringsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.geom.LineString line_strings = 5 [(.mojo.alias) = "coordinates"];</code>
     */
    public Builder clearLineStrings() {
      if (lineStringsBuilder_ == null) {
        lineStrings_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        lineStringsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .mojo.geom.LineString line_strings = 5 [(.mojo.alias) = "coordinates"];</code>
     */
    public Builder removeLineStrings(int index) {
      if (lineStringsBuilder_ == null) {
        ensureLineStringsIsMutable();
        lineStrings_.remove(index);
        onChanged();
      } else {
        lineStringsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.geom.LineString line_strings = 5 [(.mojo.alias) = "coordinates"];</code>
     */
    public org.mojolang.mojo.geom.LineString.Builder getLineStringsBuilder(
        int index) {
      return getLineStringsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .mojo.geom.LineString line_strings = 5 [(.mojo.alias) = "coordinates"];</code>
     */
    public org.mojolang.mojo.geom.LineStringOrBuilder getLineStringsOrBuilder(
        int index) {
      if (lineStringsBuilder_ == null) {
        return lineStrings_.get(index);  } else {
        return lineStringsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .mojo.geom.LineString line_strings = 5 [(.mojo.alias) = "coordinates"];</code>
     */
    public java.util.List<? extends org.mojolang.mojo.geom.LineStringOrBuilder> 
         getLineStringsOrBuilderList() {
      if (lineStringsBuilder_ != null) {
        return lineStringsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(lineStrings_);
      }
    }
    /**
     * <code>repeated .mojo.geom.LineString line_strings = 5 [(.mojo.alias) = "coordinates"];</code>
     */
    public org.mojolang.mojo.geom.LineString.Builder addLineStringsBuilder() {
      return getLineStringsFieldBuilder().addBuilder(
          org.mojolang.mojo.geom.LineString.getDefaultInstance());
    }
    /**
     * <code>repeated .mojo.geom.LineString line_strings = 5 [(.mojo.alias) = "coordinates"];</code>
     */
    public org.mojolang.mojo.geom.LineString.Builder addLineStringsBuilder(
        int index) {
      return getLineStringsFieldBuilder().addBuilder(
          index, org.mojolang.mojo.geom.LineString.getDefaultInstance());
    }
    /**
     * <code>repeated .mojo.geom.LineString line_strings = 5 [(.mojo.alias) = "coordinates"];</code>
     */
    public java.util.List<org.mojolang.mojo.geom.LineString.Builder> 
         getLineStringsBuilderList() {
      return getLineStringsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.mojolang.mojo.geom.LineString, org.mojolang.mojo.geom.LineString.Builder, org.mojolang.mojo.geom.LineStringOrBuilder> 
        getLineStringsFieldBuilder() {
      if (lineStringsBuilder_ == null) {
        lineStringsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.mojolang.mojo.geom.LineString, org.mojolang.mojo.geom.LineString.Builder, org.mojolang.mojo.geom.LineStringOrBuilder>(
                lineStrings_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        lineStrings_ = null;
      }
      return lineStringsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:mojo.geom.Polygon)
  }

  // @@protoc_insertion_point(class_scope:mojo.geom.Polygon)
  private static final org.mojolang.mojo.geom.Polygon DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.mojolang.mojo.geom.Polygon();
  }

  public static org.mojolang.mojo.geom.Polygon getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Polygon>
      PARSER = new com.google.protobuf.AbstractParser<Polygon>() {
    @java.lang.Override
    public Polygon parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Polygon(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Polygon> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Polygon> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.mojolang.mojo.geom.Polygon getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

