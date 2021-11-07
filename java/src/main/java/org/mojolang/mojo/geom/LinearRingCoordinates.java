// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/geom/polygon.proto

package org.mojolang.mojo.geom;

/**
 * Protobuf type {@code mojo.geom.LinearRingCoordinates}
 */
public final class LinearRingCoordinates extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:mojo.geom.LinearRingCoordinates)
    LinearRingCoordinatesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LinearRingCoordinates.newBuilder() to construct.
  private LinearRingCoordinates(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LinearRingCoordinates() {
    values_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LinearRingCoordinates();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LinearRingCoordinates(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              values_ = new java.util.ArrayList<org.mojolang.mojo.geom.PointCoordinates>();
              mutable_bitField0_ |= 0x00000001;
            }
            values_.add(
                input.readMessage(org.mojolang.mojo.geom.PointCoordinates.parser(), extensionRegistry));
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
        values_ = java.util.Collections.unmodifiableList(values_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.mojolang.mojo.geom.PolygonProto.internal_static_mojo_geom_LinearRingCoordinates_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.mojolang.mojo.geom.PolygonProto.internal_static_mojo_geom_LinearRingCoordinates_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.mojolang.mojo.geom.LinearRingCoordinates.class, org.mojolang.mojo.geom.LinearRingCoordinates.Builder.class);
  }

  public static final int VALUES_FIELD_NUMBER = 1;
  private java.util.List<org.mojolang.mojo.geom.PointCoordinates> values_;
  /**
   * <code>repeated .mojo.geom.PointCoordinates values = 1;</code>
   */
  @java.lang.Override
  public java.util.List<org.mojolang.mojo.geom.PointCoordinates> getValuesList() {
    return values_;
  }
  /**
   * <code>repeated .mojo.geom.PointCoordinates values = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.mojolang.mojo.geom.PointCoordinatesOrBuilder> 
      getValuesOrBuilderList() {
    return values_;
  }
  /**
   * <code>repeated .mojo.geom.PointCoordinates values = 1;</code>
   */
  @java.lang.Override
  public int getValuesCount() {
    return values_.size();
  }
  /**
   * <code>repeated .mojo.geom.PointCoordinates values = 1;</code>
   */
  @java.lang.Override
  public org.mojolang.mojo.geom.PointCoordinates getValues(int index) {
    return values_.get(index);
  }
  /**
   * <code>repeated .mojo.geom.PointCoordinates values = 1;</code>
   */
  @java.lang.Override
  public org.mojolang.mojo.geom.PointCoordinatesOrBuilder getValuesOrBuilder(
      int index) {
    return values_.get(index);
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
    for (int i = 0; i < values_.size(); i++) {
      output.writeMessage(1, values_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < values_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, values_.get(i));
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
    if (!(obj instanceof org.mojolang.mojo.geom.LinearRingCoordinates)) {
      return super.equals(obj);
    }
    org.mojolang.mojo.geom.LinearRingCoordinates other = (org.mojolang.mojo.geom.LinearRingCoordinates) obj;

    if (!getValuesList()
        .equals(other.getValuesList())) return false;
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
    if (getValuesCount() > 0) {
      hash = (37 * hash) + VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getValuesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.mojolang.mojo.geom.LinearRingCoordinates parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.geom.LinearRingCoordinates parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.geom.LinearRingCoordinates parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.geom.LinearRingCoordinates parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.geom.LinearRingCoordinates parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.geom.LinearRingCoordinates parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.geom.LinearRingCoordinates parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.geom.LinearRingCoordinates parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.geom.LinearRingCoordinates parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.geom.LinearRingCoordinates parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.geom.LinearRingCoordinates parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.geom.LinearRingCoordinates parseFrom(
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
  public static Builder newBuilder(org.mojolang.mojo.geom.LinearRingCoordinates prototype) {
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
   * Protobuf type {@code mojo.geom.LinearRingCoordinates}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:mojo.geom.LinearRingCoordinates)
      org.mojolang.mojo.geom.LinearRingCoordinatesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.mojolang.mojo.geom.PolygonProto.internal_static_mojo_geom_LinearRingCoordinates_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.mojolang.mojo.geom.PolygonProto.internal_static_mojo_geom_LinearRingCoordinates_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.mojolang.mojo.geom.LinearRingCoordinates.class, org.mojolang.mojo.geom.LinearRingCoordinates.Builder.class);
    }

    // Construct using org.mojolang.mojo.geom.LinearRingCoordinates.newBuilder()
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
        getValuesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (valuesBuilder_ == null) {
        values_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        valuesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.mojolang.mojo.geom.PolygonProto.internal_static_mojo_geom_LinearRingCoordinates_descriptor;
    }

    @java.lang.Override
    public org.mojolang.mojo.geom.LinearRingCoordinates getDefaultInstanceForType() {
      return org.mojolang.mojo.geom.LinearRingCoordinates.getDefaultInstance();
    }

    @java.lang.Override
    public org.mojolang.mojo.geom.LinearRingCoordinates build() {
      org.mojolang.mojo.geom.LinearRingCoordinates result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.mojolang.mojo.geom.LinearRingCoordinates buildPartial() {
      org.mojolang.mojo.geom.LinearRingCoordinates result = new org.mojolang.mojo.geom.LinearRingCoordinates(this);
      int from_bitField0_ = bitField0_;
      if (valuesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          values_ = java.util.Collections.unmodifiableList(values_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.values_ = values_;
      } else {
        result.values_ = valuesBuilder_.build();
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
      if (other instanceof org.mojolang.mojo.geom.LinearRingCoordinates) {
        return mergeFrom((org.mojolang.mojo.geom.LinearRingCoordinates)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.mojolang.mojo.geom.LinearRingCoordinates other) {
      if (other == org.mojolang.mojo.geom.LinearRingCoordinates.getDefaultInstance()) return this;
      if (valuesBuilder_ == null) {
        if (!other.values_.isEmpty()) {
          if (values_.isEmpty()) {
            values_ = other.values_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureValuesIsMutable();
            values_.addAll(other.values_);
          }
          onChanged();
        }
      } else {
        if (!other.values_.isEmpty()) {
          if (valuesBuilder_.isEmpty()) {
            valuesBuilder_.dispose();
            valuesBuilder_ = null;
            values_ = other.values_;
            bitField0_ = (bitField0_ & ~0x00000001);
            valuesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getValuesFieldBuilder() : null;
          } else {
            valuesBuilder_.addAllMessages(other.values_);
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
      org.mojolang.mojo.geom.LinearRingCoordinates parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.mojolang.mojo.geom.LinearRingCoordinates) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<org.mojolang.mojo.geom.PointCoordinates> values_ =
      java.util.Collections.emptyList();
    private void ensureValuesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        values_ = new java.util.ArrayList<org.mojolang.mojo.geom.PointCoordinates>(values_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.mojolang.mojo.geom.PointCoordinates, org.mojolang.mojo.geom.PointCoordinates.Builder, org.mojolang.mojo.geom.PointCoordinatesOrBuilder> valuesBuilder_;

    /**
     * <code>repeated .mojo.geom.PointCoordinates values = 1;</code>
     */
    public java.util.List<org.mojolang.mojo.geom.PointCoordinates> getValuesList() {
      if (valuesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(values_);
      } else {
        return valuesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .mojo.geom.PointCoordinates values = 1;</code>
     */
    public int getValuesCount() {
      if (valuesBuilder_ == null) {
        return values_.size();
      } else {
        return valuesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .mojo.geom.PointCoordinates values = 1;</code>
     */
    public org.mojolang.mojo.geom.PointCoordinates getValues(int index) {
      if (valuesBuilder_ == null) {
        return values_.get(index);
      } else {
        return valuesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .mojo.geom.PointCoordinates values = 1;</code>
     */
    public Builder setValues(
        int index, org.mojolang.mojo.geom.PointCoordinates value) {
      if (valuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValuesIsMutable();
        values_.set(index, value);
        onChanged();
      } else {
        valuesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.geom.PointCoordinates values = 1;</code>
     */
    public Builder setValues(
        int index, org.mojolang.mojo.geom.PointCoordinates.Builder builderForValue) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.set(index, builderForValue.build());
        onChanged();
      } else {
        valuesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .mojo.geom.PointCoordinates values = 1;</code>
     */
    public Builder addValues(org.mojolang.mojo.geom.PointCoordinates value) {
      if (valuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValuesIsMutable();
        values_.add(value);
        onChanged();
      } else {
        valuesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.geom.PointCoordinates values = 1;</code>
     */
    public Builder addValues(
        int index, org.mojolang.mojo.geom.PointCoordinates value) {
      if (valuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValuesIsMutable();
        values_.add(index, value);
        onChanged();
      } else {
        valuesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.geom.PointCoordinates values = 1;</code>
     */
    public Builder addValues(
        org.mojolang.mojo.geom.PointCoordinates.Builder builderForValue) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.add(builderForValue.build());
        onChanged();
      } else {
        valuesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .mojo.geom.PointCoordinates values = 1;</code>
     */
    public Builder addValues(
        int index, org.mojolang.mojo.geom.PointCoordinates.Builder builderForValue) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.add(index, builderForValue.build());
        onChanged();
      } else {
        valuesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .mojo.geom.PointCoordinates values = 1;</code>
     */
    public Builder addAllValues(
        java.lang.Iterable<? extends org.mojolang.mojo.geom.PointCoordinates> values) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, values_);
        onChanged();
      } else {
        valuesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.geom.PointCoordinates values = 1;</code>
     */
    public Builder clearValues() {
      if (valuesBuilder_ == null) {
        values_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        valuesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .mojo.geom.PointCoordinates values = 1;</code>
     */
    public Builder removeValues(int index) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.remove(index);
        onChanged();
      } else {
        valuesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.geom.PointCoordinates values = 1;</code>
     */
    public org.mojolang.mojo.geom.PointCoordinates.Builder getValuesBuilder(
        int index) {
      return getValuesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .mojo.geom.PointCoordinates values = 1;</code>
     */
    public org.mojolang.mojo.geom.PointCoordinatesOrBuilder getValuesOrBuilder(
        int index) {
      if (valuesBuilder_ == null) {
        return values_.get(index);  } else {
        return valuesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .mojo.geom.PointCoordinates values = 1;</code>
     */
    public java.util.List<? extends org.mojolang.mojo.geom.PointCoordinatesOrBuilder> 
         getValuesOrBuilderList() {
      if (valuesBuilder_ != null) {
        return valuesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(values_);
      }
    }
    /**
     * <code>repeated .mojo.geom.PointCoordinates values = 1;</code>
     */
    public org.mojolang.mojo.geom.PointCoordinates.Builder addValuesBuilder() {
      return getValuesFieldBuilder().addBuilder(
          org.mojolang.mojo.geom.PointCoordinates.getDefaultInstance());
    }
    /**
     * <code>repeated .mojo.geom.PointCoordinates values = 1;</code>
     */
    public org.mojolang.mojo.geom.PointCoordinates.Builder addValuesBuilder(
        int index) {
      return getValuesFieldBuilder().addBuilder(
          index, org.mojolang.mojo.geom.PointCoordinates.getDefaultInstance());
    }
    /**
     * <code>repeated .mojo.geom.PointCoordinates values = 1;</code>
     */
    public java.util.List<org.mojolang.mojo.geom.PointCoordinates.Builder> 
         getValuesBuilderList() {
      return getValuesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.mojolang.mojo.geom.PointCoordinates, org.mojolang.mojo.geom.PointCoordinates.Builder, org.mojolang.mojo.geom.PointCoordinatesOrBuilder> 
        getValuesFieldBuilder() {
      if (valuesBuilder_ == null) {
        valuesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.mojolang.mojo.geom.PointCoordinates, org.mojolang.mojo.geom.PointCoordinates.Builder, org.mojolang.mojo.geom.PointCoordinatesOrBuilder>(
                values_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        values_ = null;
      }
      return valuesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:mojo.geom.LinearRingCoordinates)
  }

  // @@protoc_insertion_point(class_scope:mojo.geom.LinearRingCoordinates)
  private static final org.mojolang.mojo.geom.LinearRingCoordinates DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.mojolang.mojo.geom.LinearRingCoordinates();
  }

  public static org.mojolang.mojo.geom.LinearRingCoordinates getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LinearRingCoordinates>
      PARSER = new com.google.protobuf.AbstractParser<LinearRingCoordinates>() {
    @java.lang.Override
    public LinearRingCoordinates parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LinearRingCoordinates(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LinearRingCoordinates> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LinearRingCoordinates> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.mojolang.mojo.geom.LinearRingCoordinates getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

