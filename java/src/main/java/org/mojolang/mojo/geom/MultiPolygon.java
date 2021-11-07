// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/geom/multi_polygon.proto

package org.mojolang.mojo.geom;

/**
 * Protobuf type {@code mojo.geom.MultiPolygon}
 */
public final class MultiPolygon extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:mojo.geom.MultiPolygon)
    MultiPolygonOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MultiPolygon.newBuilder() to construct.
  private MultiPolygon(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MultiPolygon() {
    type_ = "";
    polygons_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MultiPolygon();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MultiPolygon(
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
              polygons_ = new java.util.ArrayList<org.mojolang.mojo.geom.Polygon>();
              mutable_bitField0_ |= 0x00000001;
            }
            polygons_.add(
                input.readMessage(org.mojolang.mojo.geom.Polygon.parser(), extensionRegistry));
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
        polygons_ = java.util.Collections.unmodifiableList(polygons_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.mojolang.mojo.geom.MultiPolygonProto.internal_static_mojo_geom_MultiPolygon_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.mojolang.mojo.geom.MultiPolygonProto.internal_static_mojo_geom_MultiPolygon_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.mojolang.mojo.geom.MultiPolygon.class, org.mojolang.mojo.geom.MultiPolygon.Builder.class);
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

  public static final int POLYGONS_FIELD_NUMBER = 5;
  private java.util.List<org.mojolang.mojo.geom.Polygon> polygons_;
  /**
   * <code>repeated .mojo.geom.Polygon polygons = 5 [(.mojo.alias) = "coordinates"];</code>
   */
  @java.lang.Override
  public java.util.List<org.mojolang.mojo.geom.Polygon> getPolygonsList() {
    return polygons_;
  }
  /**
   * <code>repeated .mojo.geom.Polygon polygons = 5 [(.mojo.alias) = "coordinates"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.mojolang.mojo.geom.PolygonOrBuilder> 
      getPolygonsOrBuilderList() {
    return polygons_;
  }
  /**
   * <code>repeated .mojo.geom.Polygon polygons = 5 [(.mojo.alias) = "coordinates"];</code>
   */
  @java.lang.Override
  public int getPolygonsCount() {
    return polygons_.size();
  }
  /**
   * <code>repeated .mojo.geom.Polygon polygons = 5 [(.mojo.alias) = "coordinates"];</code>
   */
  @java.lang.Override
  public org.mojolang.mojo.geom.Polygon getPolygons(int index) {
    return polygons_.get(index);
  }
  /**
   * <code>repeated .mojo.geom.Polygon polygons = 5 [(.mojo.alias) = "coordinates"];</code>
   */
  @java.lang.Override
  public org.mojolang.mojo.geom.PolygonOrBuilder getPolygonsOrBuilder(
      int index) {
    return polygons_.get(index);
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
    if (!getTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, type_);
    }
    for (int i = 0; i < polygons_.size(); i++) {
      output.writeMessage(5, polygons_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, type_);
    }
    for (int i = 0; i < polygons_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, polygons_.get(i));
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
    if (!(obj instanceof org.mojolang.mojo.geom.MultiPolygon)) {
      return super.equals(obj);
    }
    org.mojolang.mojo.geom.MultiPolygon other = (org.mojolang.mojo.geom.MultiPolygon) obj;

    if (!getType()
        .equals(other.getType())) return false;
    if (!getPolygonsList()
        .equals(other.getPolygonsList())) return false;
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
    if (getPolygonsCount() > 0) {
      hash = (37 * hash) + POLYGONS_FIELD_NUMBER;
      hash = (53 * hash) + getPolygonsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.mojolang.mojo.geom.MultiPolygon parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.geom.MultiPolygon parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.geom.MultiPolygon parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.geom.MultiPolygon parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.geom.MultiPolygon parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.geom.MultiPolygon parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.geom.MultiPolygon parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.geom.MultiPolygon parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.geom.MultiPolygon parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.geom.MultiPolygon parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.geom.MultiPolygon parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.geom.MultiPolygon parseFrom(
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
  public static Builder newBuilder(org.mojolang.mojo.geom.MultiPolygon prototype) {
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
   * Protobuf type {@code mojo.geom.MultiPolygon}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:mojo.geom.MultiPolygon)
      org.mojolang.mojo.geom.MultiPolygonOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.mojolang.mojo.geom.MultiPolygonProto.internal_static_mojo_geom_MultiPolygon_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.mojolang.mojo.geom.MultiPolygonProto.internal_static_mojo_geom_MultiPolygon_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.mojolang.mojo.geom.MultiPolygon.class, org.mojolang.mojo.geom.MultiPolygon.Builder.class);
    }

    // Construct using org.mojolang.mojo.geom.MultiPolygon.newBuilder()
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
        getPolygonsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      type_ = "";

      if (polygonsBuilder_ == null) {
        polygons_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        polygonsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.mojolang.mojo.geom.MultiPolygonProto.internal_static_mojo_geom_MultiPolygon_descriptor;
    }

    @java.lang.Override
    public org.mojolang.mojo.geom.MultiPolygon getDefaultInstanceForType() {
      return org.mojolang.mojo.geom.MultiPolygon.getDefaultInstance();
    }

    @java.lang.Override
    public org.mojolang.mojo.geom.MultiPolygon build() {
      org.mojolang.mojo.geom.MultiPolygon result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.mojolang.mojo.geom.MultiPolygon buildPartial() {
      org.mojolang.mojo.geom.MultiPolygon result = new org.mojolang.mojo.geom.MultiPolygon(this);
      int from_bitField0_ = bitField0_;
      result.type_ = type_;
      if (polygonsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          polygons_ = java.util.Collections.unmodifiableList(polygons_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.polygons_ = polygons_;
      } else {
        result.polygons_ = polygonsBuilder_.build();
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
      if (other instanceof org.mojolang.mojo.geom.MultiPolygon) {
        return mergeFrom((org.mojolang.mojo.geom.MultiPolygon)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.mojolang.mojo.geom.MultiPolygon other) {
      if (other == org.mojolang.mojo.geom.MultiPolygon.getDefaultInstance()) return this;
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        onChanged();
      }
      if (polygonsBuilder_ == null) {
        if (!other.polygons_.isEmpty()) {
          if (polygons_.isEmpty()) {
            polygons_ = other.polygons_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePolygonsIsMutable();
            polygons_.addAll(other.polygons_);
          }
          onChanged();
        }
      } else {
        if (!other.polygons_.isEmpty()) {
          if (polygonsBuilder_.isEmpty()) {
            polygonsBuilder_.dispose();
            polygonsBuilder_ = null;
            polygons_ = other.polygons_;
            bitField0_ = (bitField0_ & ~0x00000001);
            polygonsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPolygonsFieldBuilder() : null;
          } else {
            polygonsBuilder_.addAllMessages(other.polygons_);
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
      org.mojolang.mojo.geom.MultiPolygon parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.mojolang.mojo.geom.MultiPolygon) e.getUnfinishedMessage();
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

    private java.util.List<org.mojolang.mojo.geom.Polygon> polygons_ =
      java.util.Collections.emptyList();
    private void ensurePolygonsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        polygons_ = new java.util.ArrayList<org.mojolang.mojo.geom.Polygon>(polygons_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.mojolang.mojo.geom.Polygon, org.mojolang.mojo.geom.Polygon.Builder, org.mojolang.mojo.geom.PolygonOrBuilder> polygonsBuilder_;

    /**
     * <code>repeated .mojo.geom.Polygon polygons = 5 [(.mojo.alias) = "coordinates"];</code>
     */
    public java.util.List<org.mojolang.mojo.geom.Polygon> getPolygonsList() {
      if (polygonsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(polygons_);
      } else {
        return polygonsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .mojo.geom.Polygon polygons = 5 [(.mojo.alias) = "coordinates"];</code>
     */
    public int getPolygonsCount() {
      if (polygonsBuilder_ == null) {
        return polygons_.size();
      } else {
        return polygonsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .mojo.geom.Polygon polygons = 5 [(.mojo.alias) = "coordinates"];</code>
     */
    public org.mojolang.mojo.geom.Polygon getPolygons(int index) {
      if (polygonsBuilder_ == null) {
        return polygons_.get(index);
      } else {
        return polygonsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .mojo.geom.Polygon polygons = 5 [(.mojo.alias) = "coordinates"];</code>
     */
    public Builder setPolygons(
        int index, org.mojolang.mojo.geom.Polygon value) {
      if (polygonsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePolygonsIsMutable();
        polygons_.set(index, value);
        onChanged();
      } else {
        polygonsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.geom.Polygon polygons = 5 [(.mojo.alias) = "coordinates"];</code>
     */
    public Builder setPolygons(
        int index, org.mojolang.mojo.geom.Polygon.Builder builderForValue) {
      if (polygonsBuilder_ == null) {
        ensurePolygonsIsMutable();
        polygons_.set(index, builderForValue.build());
        onChanged();
      } else {
        polygonsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .mojo.geom.Polygon polygons = 5 [(.mojo.alias) = "coordinates"];</code>
     */
    public Builder addPolygons(org.mojolang.mojo.geom.Polygon value) {
      if (polygonsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePolygonsIsMutable();
        polygons_.add(value);
        onChanged();
      } else {
        polygonsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.geom.Polygon polygons = 5 [(.mojo.alias) = "coordinates"];</code>
     */
    public Builder addPolygons(
        int index, org.mojolang.mojo.geom.Polygon value) {
      if (polygonsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePolygonsIsMutable();
        polygons_.add(index, value);
        onChanged();
      } else {
        polygonsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.geom.Polygon polygons = 5 [(.mojo.alias) = "coordinates"];</code>
     */
    public Builder addPolygons(
        org.mojolang.mojo.geom.Polygon.Builder builderForValue) {
      if (polygonsBuilder_ == null) {
        ensurePolygonsIsMutable();
        polygons_.add(builderForValue.build());
        onChanged();
      } else {
        polygonsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .mojo.geom.Polygon polygons = 5 [(.mojo.alias) = "coordinates"];</code>
     */
    public Builder addPolygons(
        int index, org.mojolang.mojo.geom.Polygon.Builder builderForValue) {
      if (polygonsBuilder_ == null) {
        ensurePolygonsIsMutable();
        polygons_.add(index, builderForValue.build());
        onChanged();
      } else {
        polygonsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .mojo.geom.Polygon polygons = 5 [(.mojo.alias) = "coordinates"];</code>
     */
    public Builder addAllPolygons(
        java.lang.Iterable<? extends org.mojolang.mojo.geom.Polygon> values) {
      if (polygonsBuilder_ == null) {
        ensurePolygonsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, polygons_);
        onChanged();
      } else {
        polygonsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.geom.Polygon polygons = 5 [(.mojo.alias) = "coordinates"];</code>
     */
    public Builder clearPolygons() {
      if (polygonsBuilder_ == null) {
        polygons_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        polygonsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .mojo.geom.Polygon polygons = 5 [(.mojo.alias) = "coordinates"];</code>
     */
    public Builder removePolygons(int index) {
      if (polygonsBuilder_ == null) {
        ensurePolygonsIsMutable();
        polygons_.remove(index);
        onChanged();
      } else {
        polygonsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.geom.Polygon polygons = 5 [(.mojo.alias) = "coordinates"];</code>
     */
    public org.mojolang.mojo.geom.Polygon.Builder getPolygonsBuilder(
        int index) {
      return getPolygonsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .mojo.geom.Polygon polygons = 5 [(.mojo.alias) = "coordinates"];</code>
     */
    public org.mojolang.mojo.geom.PolygonOrBuilder getPolygonsOrBuilder(
        int index) {
      if (polygonsBuilder_ == null) {
        return polygons_.get(index);  } else {
        return polygonsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .mojo.geom.Polygon polygons = 5 [(.mojo.alias) = "coordinates"];</code>
     */
    public java.util.List<? extends org.mojolang.mojo.geom.PolygonOrBuilder> 
         getPolygonsOrBuilderList() {
      if (polygonsBuilder_ != null) {
        return polygonsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(polygons_);
      }
    }
    /**
     * <code>repeated .mojo.geom.Polygon polygons = 5 [(.mojo.alias) = "coordinates"];</code>
     */
    public org.mojolang.mojo.geom.Polygon.Builder addPolygonsBuilder() {
      return getPolygonsFieldBuilder().addBuilder(
          org.mojolang.mojo.geom.Polygon.getDefaultInstance());
    }
    /**
     * <code>repeated .mojo.geom.Polygon polygons = 5 [(.mojo.alias) = "coordinates"];</code>
     */
    public org.mojolang.mojo.geom.Polygon.Builder addPolygonsBuilder(
        int index) {
      return getPolygonsFieldBuilder().addBuilder(
          index, org.mojolang.mojo.geom.Polygon.getDefaultInstance());
    }
    /**
     * <code>repeated .mojo.geom.Polygon polygons = 5 [(.mojo.alias) = "coordinates"];</code>
     */
    public java.util.List<org.mojolang.mojo.geom.Polygon.Builder> 
         getPolygonsBuilderList() {
      return getPolygonsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.mojolang.mojo.geom.Polygon, org.mojolang.mojo.geom.Polygon.Builder, org.mojolang.mojo.geom.PolygonOrBuilder> 
        getPolygonsFieldBuilder() {
      if (polygonsBuilder_ == null) {
        polygonsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.mojolang.mojo.geom.Polygon, org.mojolang.mojo.geom.Polygon.Builder, org.mojolang.mojo.geom.PolygonOrBuilder>(
                polygons_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        polygons_ = null;
      }
      return polygonsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:mojo.geom.MultiPolygon)
  }

  // @@protoc_insertion_point(class_scope:mojo.geom.MultiPolygon)
  private static final org.mojolang.mojo.geom.MultiPolygon DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.mojolang.mojo.geom.MultiPolygon();
  }

  public static org.mojolang.mojo.geom.MultiPolygon getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MultiPolygon>
      PARSER = new com.google.protobuf.AbstractParser<MultiPolygon>() {
    @java.lang.Override
    public MultiPolygon parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MultiPolygon(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MultiPolygon> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MultiPolygon> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.mojolang.mojo.geom.MultiPolygon getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

