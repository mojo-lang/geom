// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/geom/geom.proto

package org.mojolang.mojo.geom;

/**
 * Protobuf type {@code mojo.geom.GeometryCollection}
 */
public final class GeometryCollection extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:mojo.geom.GeometryCollection)
    GeometryCollectionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GeometryCollection.newBuilder() to construct.
  private GeometryCollection(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GeometryCollection() {
    type_ = "";
    geometries_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GeometryCollection();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.mojolang.mojo.geom.GeomProto.internal_static_mojo_geom_GeometryCollection_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.mojolang.mojo.geom.GeomProto.internal_static_mojo_geom_GeometryCollection_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.mojolang.mojo.geom.GeometryCollection.class, org.mojolang.mojo.geom.GeometryCollection.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object type_ = "";
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

  public static final int GEOMETRIES_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private java.util.List<org.mojolang.mojo.geom.Geometry> geometries_;
  /**
   * <code>repeated .mojo.geom.Geometry geometries = 5;</code>
   */
  @java.lang.Override
  public java.util.List<org.mojolang.mojo.geom.Geometry> getGeometriesList() {
    return geometries_;
  }
  /**
   * <code>repeated .mojo.geom.Geometry geometries = 5;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.mojolang.mojo.geom.GeometryOrBuilder> 
      getGeometriesOrBuilderList() {
    return geometries_;
  }
  /**
   * <code>repeated .mojo.geom.Geometry geometries = 5;</code>
   */
  @java.lang.Override
  public int getGeometriesCount() {
    return geometries_.size();
  }
  /**
   * <code>repeated .mojo.geom.Geometry geometries = 5;</code>
   */
  @java.lang.Override
  public org.mojolang.mojo.geom.Geometry getGeometries(int index) {
    return geometries_.get(index);
  }
  /**
   * <code>repeated .mojo.geom.Geometry geometries = 5;</code>
   */
  @java.lang.Override
  public org.mojolang.mojo.geom.GeometryOrBuilder getGeometriesOrBuilder(
      int index) {
    return geometries_.get(index);
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
    for (int i = 0; i < geometries_.size(); i++) {
      output.writeMessage(5, geometries_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, type_);
    }
    for (int i = 0; i < geometries_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, geometries_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.mojolang.mojo.geom.GeometryCollection)) {
      return super.equals(obj);
    }
    org.mojolang.mojo.geom.GeometryCollection other = (org.mojolang.mojo.geom.GeometryCollection) obj;

    if (!getType()
        .equals(other.getType())) return false;
    if (!getGeometriesList()
        .equals(other.getGeometriesList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
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
    if (getGeometriesCount() > 0) {
      hash = (37 * hash) + GEOMETRIES_FIELD_NUMBER;
      hash = (53 * hash) + getGeometriesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.mojolang.mojo.geom.GeometryCollection parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.geom.GeometryCollection parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.geom.GeometryCollection parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.geom.GeometryCollection parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.geom.GeometryCollection parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.geom.GeometryCollection parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.geom.GeometryCollection parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.geom.GeometryCollection parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.geom.GeometryCollection parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.geom.GeometryCollection parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.geom.GeometryCollection parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.geom.GeometryCollection parseFrom(
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
  public static Builder newBuilder(org.mojolang.mojo.geom.GeometryCollection prototype) {
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
   * Protobuf type {@code mojo.geom.GeometryCollection}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:mojo.geom.GeometryCollection)
      org.mojolang.mojo.geom.GeometryCollectionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.mojolang.mojo.geom.GeomProto.internal_static_mojo_geom_GeometryCollection_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.mojolang.mojo.geom.GeomProto.internal_static_mojo_geom_GeometryCollection_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.mojolang.mojo.geom.GeometryCollection.class, org.mojolang.mojo.geom.GeometryCollection.Builder.class);
    }

    // Construct using org.mojolang.mojo.geom.GeometryCollection.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      type_ = "";
      if (geometriesBuilder_ == null) {
        geometries_ = java.util.Collections.emptyList();
      } else {
        geometries_ = null;
        geometriesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.mojolang.mojo.geom.GeomProto.internal_static_mojo_geom_GeometryCollection_descriptor;
    }

    @java.lang.Override
    public org.mojolang.mojo.geom.GeometryCollection getDefaultInstanceForType() {
      return org.mojolang.mojo.geom.GeometryCollection.getDefaultInstance();
    }

    @java.lang.Override
    public org.mojolang.mojo.geom.GeometryCollection build() {
      org.mojolang.mojo.geom.GeometryCollection result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.mojolang.mojo.geom.GeometryCollection buildPartial() {
      org.mojolang.mojo.geom.GeometryCollection result = new org.mojolang.mojo.geom.GeometryCollection(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(org.mojolang.mojo.geom.GeometryCollection result) {
      if (geometriesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          geometries_ = java.util.Collections.unmodifiableList(geometries_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.geometries_ = geometries_;
      } else {
        result.geometries_ = geometriesBuilder_.build();
      }
    }

    private void buildPartial0(org.mojolang.mojo.geom.GeometryCollection result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.type_ = type_;
      }
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
      if (other instanceof org.mojolang.mojo.geom.GeometryCollection) {
        return mergeFrom((org.mojolang.mojo.geom.GeometryCollection)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.mojolang.mojo.geom.GeometryCollection other) {
      if (other == org.mojolang.mojo.geom.GeometryCollection.getDefaultInstance()) return this;
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (geometriesBuilder_ == null) {
        if (!other.geometries_.isEmpty()) {
          if (geometries_.isEmpty()) {
            geometries_ = other.geometries_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureGeometriesIsMutable();
            geometries_.addAll(other.geometries_);
          }
          onChanged();
        }
      } else {
        if (!other.geometries_.isEmpty()) {
          if (geometriesBuilder_.isEmpty()) {
            geometriesBuilder_.dispose();
            geometriesBuilder_ = null;
            geometries_ = other.geometries_;
            bitField0_ = (bitField0_ & ~0x00000002);
            geometriesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getGeometriesFieldBuilder() : null;
          } else {
            geometriesBuilder_.addAllMessages(other.geometries_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              type_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 42: {
              org.mojolang.mojo.geom.Geometry m =
                  input.readMessage(
                      org.mojolang.mojo.geom.Geometry.parser(),
                      extensionRegistry);
              if (geometriesBuilder_ == null) {
                ensureGeometriesIsMutable();
                geometries_.add(m);
              } else {
                geometriesBuilder_.addMessage(m);
              }
              break;
            } // case 42
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
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
      if (value == null) { throw new NullPointerException(); }
      type_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      type_ = getDefaultInstance().getType();
      bitField0_ = (bitField0_ & ~0x00000001);
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
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      type_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<org.mojolang.mojo.geom.Geometry> geometries_ =
      java.util.Collections.emptyList();
    private void ensureGeometriesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        geometries_ = new java.util.ArrayList<org.mojolang.mojo.geom.Geometry>(geometries_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.mojolang.mojo.geom.Geometry, org.mojolang.mojo.geom.Geometry.Builder, org.mojolang.mojo.geom.GeometryOrBuilder> geometriesBuilder_;

    /**
     * <code>repeated .mojo.geom.Geometry geometries = 5;</code>
     */
    public java.util.List<org.mojolang.mojo.geom.Geometry> getGeometriesList() {
      if (geometriesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(geometries_);
      } else {
        return geometriesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .mojo.geom.Geometry geometries = 5;</code>
     */
    public int getGeometriesCount() {
      if (geometriesBuilder_ == null) {
        return geometries_.size();
      } else {
        return geometriesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .mojo.geom.Geometry geometries = 5;</code>
     */
    public org.mojolang.mojo.geom.Geometry getGeometries(int index) {
      if (geometriesBuilder_ == null) {
        return geometries_.get(index);
      } else {
        return geometriesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .mojo.geom.Geometry geometries = 5;</code>
     */
    public Builder setGeometries(
        int index, org.mojolang.mojo.geom.Geometry value) {
      if (geometriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGeometriesIsMutable();
        geometries_.set(index, value);
        onChanged();
      } else {
        geometriesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.geom.Geometry geometries = 5;</code>
     */
    public Builder setGeometries(
        int index, org.mojolang.mojo.geom.Geometry.Builder builderForValue) {
      if (geometriesBuilder_ == null) {
        ensureGeometriesIsMutable();
        geometries_.set(index, builderForValue.build());
        onChanged();
      } else {
        geometriesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .mojo.geom.Geometry geometries = 5;</code>
     */
    public Builder addGeometries(org.mojolang.mojo.geom.Geometry value) {
      if (geometriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGeometriesIsMutable();
        geometries_.add(value);
        onChanged();
      } else {
        geometriesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.geom.Geometry geometries = 5;</code>
     */
    public Builder addGeometries(
        int index, org.mojolang.mojo.geom.Geometry value) {
      if (geometriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGeometriesIsMutable();
        geometries_.add(index, value);
        onChanged();
      } else {
        geometriesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.geom.Geometry geometries = 5;</code>
     */
    public Builder addGeometries(
        org.mojolang.mojo.geom.Geometry.Builder builderForValue) {
      if (geometriesBuilder_ == null) {
        ensureGeometriesIsMutable();
        geometries_.add(builderForValue.build());
        onChanged();
      } else {
        geometriesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .mojo.geom.Geometry geometries = 5;</code>
     */
    public Builder addGeometries(
        int index, org.mojolang.mojo.geom.Geometry.Builder builderForValue) {
      if (geometriesBuilder_ == null) {
        ensureGeometriesIsMutable();
        geometries_.add(index, builderForValue.build());
        onChanged();
      } else {
        geometriesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .mojo.geom.Geometry geometries = 5;</code>
     */
    public Builder addAllGeometries(
        java.lang.Iterable<? extends org.mojolang.mojo.geom.Geometry> values) {
      if (geometriesBuilder_ == null) {
        ensureGeometriesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, geometries_);
        onChanged();
      } else {
        geometriesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.geom.Geometry geometries = 5;</code>
     */
    public Builder clearGeometries() {
      if (geometriesBuilder_ == null) {
        geometries_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        geometriesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .mojo.geom.Geometry geometries = 5;</code>
     */
    public Builder removeGeometries(int index) {
      if (geometriesBuilder_ == null) {
        ensureGeometriesIsMutable();
        geometries_.remove(index);
        onChanged();
      } else {
        geometriesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.geom.Geometry geometries = 5;</code>
     */
    public org.mojolang.mojo.geom.Geometry.Builder getGeometriesBuilder(
        int index) {
      return getGeometriesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .mojo.geom.Geometry geometries = 5;</code>
     */
    public org.mojolang.mojo.geom.GeometryOrBuilder getGeometriesOrBuilder(
        int index) {
      if (geometriesBuilder_ == null) {
        return geometries_.get(index);  } else {
        return geometriesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .mojo.geom.Geometry geometries = 5;</code>
     */
    public java.util.List<? extends org.mojolang.mojo.geom.GeometryOrBuilder> 
         getGeometriesOrBuilderList() {
      if (geometriesBuilder_ != null) {
        return geometriesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(geometries_);
      }
    }
    /**
     * <code>repeated .mojo.geom.Geometry geometries = 5;</code>
     */
    public org.mojolang.mojo.geom.Geometry.Builder addGeometriesBuilder() {
      return getGeometriesFieldBuilder().addBuilder(
          org.mojolang.mojo.geom.Geometry.getDefaultInstance());
    }
    /**
     * <code>repeated .mojo.geom.Geometry geometries = 5;</code>
     */
    public org.mojolang.mojo.geom.Geometry.Builder addGeometriesBuilder(
        int index) {
      return getGeometriesFieldBuilder().addBuilder(
          index, org.mojolang.mojo.geom.Geometry.getDefaultInstance());
    }
    /**
     * <code>repeated .mojo.geom.Geometry geometries = 5;</code>
     */
    public java.util.List<org.mojolang.mojo.geom.Geometry.Builder> 
         getGeometriesBuilderList() {
      return getGeometriesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.mojolang.mojo.geom.Geometry, org.mojolang.mojo.geom.Geometry.Builder, org.mojolang.mojo.geom.GeometryOrBuilder> 
        getGeometriesFieldBuilder() {
      if (geometriesBuilder_ == null) {
        geometriesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.mojolang.mojo.geom.Geometry, org.mojolang.mojo.geom.Geometry.Builder, org.mojolang.mojo.geom.GeometryOrBuilder>(
                geometries_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        geometries_ = null;
      }
      return geometriesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:mojo.geom.GeometryCollection)
  }

  // @@protoc_insertion_point(class_scope:mojo.geom.GeometryCollection)
  private static final org.mojolang.mojo.geom.GeometryCollection DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.mojolang.mojo.geom.GeometryCollection();
  }

  public static org.mojolang.mojo.geom.GeometryCollection getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GeometryCollection>
      PARSER = new com.google.protobuf.AbstractParser<GeometryCollection>() {
    @java.lang.Override
    public GeometryCollection parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<GeometryCollection> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GeometryCollection> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.mojolang.mojo.geom.GeometryCollection getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

