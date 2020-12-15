/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AppRevisionRegisterPb.proto

package com.alipay.sofa.registry.common.model.client.pb;

/**
 * Protobuf type {@code QueryValues}
 */
public final class QueryValues extends com.google.protobuf.GeneratedMessageV3 implements
// @@protoc_insertion_point(message_implements:QueryValues)
                                                                             QueryValuesOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use QueryValues.newBuilder() to construct.
    private QueryValues(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private QueryValues() {
        values_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private QueryValues(com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                                                                                    throws com.google.protobuf.InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
            throw new java.lang.NullPointerException();
        }
        int mutable_bitField0_ = 0;
        com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
            .newBuilder();
        try {
            boolean done = false;
            while (!done) {
                int tag = input.readTag();
                switch (tag) {
                    case 0:
                        done = true;
                        break;
                    default: {
                        if (!parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                            done = true;
                        }
                        break;
                    }
                    case 10: {
                        java.lang.String s = input.readStringRequireUtf8();
                        if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                            values_ = new com.google.protobuf.LazyStringArrayList();
                            mutable_bitField0_ |= 0x00000001;
                        }
                        values_.add(s);
                        break;
                    }
                }
            }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(this);
        } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(this);
        } finally {
            if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                values_ = values_.getUnmodifiableView();
            }
            this.unknownFields = unknownFields.build();
            makeExtensionsImmutable();
        }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.alipay.sofa.registry.common.model.client.pb.AppRevisionRegisterPbOuterClass.internal_static_QueryValues_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return com.alipay.sofa.registry.common.model.client.pb.AppRevisionRegisterPbOuterClass.internal_static_QueryValues_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.alipay.sofa.registry.common.model.client.pb.QueryValues.class,
                com.alipay.sofa.registry.common.model.client.pb.QueryValues.Builder.class);
    }

    public static final int                    VALUES_FIELD_NUMBER = 1;
    private com.google.protobuf.LazyStringList values_;

    /**
     * <code>repeated string values = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList getValuesList() {
        return values_;
    }

    /**
     * <code>repeated string values = 1;</code>
     */
    public int getValuesCount() {
        return values_.size();
    }

    /**
     * <code>repeated string values = 1;</code>
     */
    public java.lang.String getValues(int index) {
        return values_.get(index);
    }

    /**
     * <code>repeated string values = 1;</code>
     */
    public com.google.protobuf.ByteString getValuesBytes(int index) {
        return values_.getByteString(index);
    }

    private byte memoizedIsInitialized = -1;

    public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1)
            return true;
        if (isInitialized == 0)
            return false;

        memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
        for (int i = 0; i < values_.size(); i++) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 1, values_.getRaw(i));
        }
        unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1)
            return size;

        size = 0;
        {
            int dataSize = 0;
            for (int i = 0; i < values_.size(); i++) {
                dataSize += computeStringSizeNoTag(values_.getRaw(i));
            }
            size += dataSize;
            size += 1 * getValuesList().size();
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
        if (!(obj instanceof com.alipay.sofa.registry.common.model.client.pb.QueryValues)) {
            return super.equals(obj);
        }
        com.alipay.sofa.registry.common.model.client.pb.QueryValues other = (com.alipay.sofa.registry.common.model.client.pb.QueryValues) obj;

        boolean result = true;
        result = result && getValuesList().equals(other.getValuesList());
        result = result && unknownFields.equals(other.unknownFields);
        return result;
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

    public static com.alipay.sofa.registry.common.model.client.pb.QueryValues parseFrom(java.nio.ByteBuffer data)
                                                                                                                 throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.registry.common.model.client.pb.QueryValues parseFrom(java.nio.ByteBuffer data,
                                                                                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                                                                                                                                                    throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.registry.common.model.client.pb.QueryValues parseFrom(com.google.protobuf.ByteString data)
                                                                                                                            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.registry.common.model.client.pb.QueryValues parseFrom(com.google.protobuf.ByteString data,
                                                                                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                                                                                                                                                    throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.registry.common.model.client.pb.QueryValues parseFrom(byte[] data)
                                                                                                    throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.registry.common.model.client.pb.QueryValues parseFrom(byte[] data,
                                                                                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                                                                                                                                                    throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.registry.common.model.client.pb.QueryValues parseFrom(java.io.InputStream input)
                                                                                                                  throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.registry.common.model.client.pb.QueryValues parseFrom(java.io.InputStream input,
                                                                                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                                                                                                                                                    throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input,
            extensionRegistry);
    }

    public static com.alipay.sofa.registry.common.model.client.pb.QueryValues parseDelimitedFrom(java.io.InputStream input)
                                                                                                                           throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.registry.common.model.client.pb.QueryValues parseDelimitedFrom(java.io.InputStream input,
                                                                                                 com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                                                                                                                                                             throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input,
            extensionRegistry);
    }

    public static com.alipay.sofa.registry.common.model.client.pb.QueryValues parseFrom(com.google.protobuf.CodedInputStream input)
                                                                                                                                   throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.registry.common.model.client.pb.QueryValues parseFrom(com.google.protobuf.CodedInputStream input,
                                                                                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                                                                                                                                                    throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input,
            extensionRegistry);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(com.alipay.sofa.registry.common.model.client.pb.QueryValues prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    /**
     * Protobuf type {@code QueryValues}
     */
    public static final class Builder extends
                                     com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                                                                                            implements
                                                                                            // @@protoc_insertion_point(builder_implements:QueryValues)
                                                                                            com.alipay.sofa.registry.common.model.client.pb.QueryValuesOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return com.alipay.sofa.registry.common.model.client.pb.AppRevisionRegisterPbOuterClass.internal_static_QueryValues_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return com.alipay.sofa.registry.common.model.client.pb.AppRevisionRegisterPbOuterClass.internal_static_QueryValues_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                    com.alipay.sofa.registry.common.model.client.pb.QueryValues.class,
                    com.alipay.sofa.registry.common.model.client.pb.QueryValues.Builder.class);
        }

        // Construct using com.alipay.sofa.registry.common.model.client.pb.QueryValues.newBuilder()
        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
            }
        }

        public Builder clear() {
            super.clear();
            values_ = com.google.protobuf.LazyStringArrayList.EMPTY;
            bitField0_ = (bitField0_ & ~0x00000001);
            return this;
        }

        public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
            return com.alipay.sofa.registry.common.model.client.pb.AppRevisionRegisterPbOuterClass.internal_static_QueryValues_descriptor;
        }

        public com.alipay.sofa.registry.common.model.client.pb.QueryValues getDefaultInstanceForType() {
            return com.alipay.sofa.registry.common.model.client.pb.QueryValues.getDefaultInstance();
        }

        public com.alipay.sofa.registry.common.model.client.pb.QueryValues build() {
            com.alipay.sofa.registry.common.model.client.pb.QueryValues result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public com.alipay.sofa.registry.common.model.client.pb.QueryValues buildPartial() {
            com.alipay.sofa.registry.common.model.client.pb.QueryValues result = new com.alipay.sofa.registry.common.model.client.pb.QueryValues(
                this);
            int from_bitField0_ = bitField0_;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                values_ = values_.getUnmodifiableView();
                bitField0_ = (bitField0_ & ~0x00000001);
            }
            result.values_ = values_;
            onBuilt();
            return result;
        }

        public Builder clone() {
            return (Builder) super.clone();
        }

        public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field,
                                java.lang.Object value) {
            return (Builder) super.setField(field, value);
        }

        public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
            return (Builder) super.clearField(field);
        }

        public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
            return (Builder) super.clearOneof(oneof);
        }

        public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field,
                                        int index, java.lang.Object value) {
            return (Builder) super.setRepeatedField(field, index, value);
        }

        public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field,
                                        java.lang.Object value) {
            return (Builder) super.addRepeatedField(field, value);
        }

        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof com.alipay.sofa.registry.common.model.client.pb.QueryValues) {
                return mergeFrom((com.alipay.sofa.registry.common.model.client.pb.QueryValues) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(com.alipay.sofa.registry.common.model.client.pb.QueryValues other) {
            if (other == com.alipay.sofa.registry.common.model.client.pb.QueryValues
                .getDefaultInstance())
                return this;
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
            this.mergeUnknownFields(other.unknownFields);
            onChanged();
            return this;
        }

        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
                                 com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                                                                                             throws java.io.IOException {
            com.alipay.sofa.registry.common.model.client.pb.QueryValues parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (com.alipay.sofa.registry.common.model.client.pb.QueryValues) e
                    .getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private int                                bitField0_;

        private com.google.protobuf.LazyStringList values_ = com.google.protobuf.LazyStringArrayList.EMPTY;

        private void ensureValuesIsMutable() {
            if (!((bitField0_ & 0x00000001) == 0x00000001)) {
                values_ = new com.google.protobuf.LazyStringArrayList(values_);
                bitField0_ |= 0x00000001;
            }
        }

        /**
         * <code>repeated string values = 1;</code>
         */
        public com.google.protobuf.ProtocolStringList getValuesList() {
            return values_.getUnmodifiableView();
        }

        /**
         * <code>repeated string values = 1;</code>
         */
        public int getValuesCount() {
            return values_.size();
        }

        /**
         * <code>repeated string values = 1;</code>
         */
        public java.lang.String getValues(int index) {
            return values_.get(index);
        }

        /**
         * <code>repeated string values = 1;</code>
         */
        public com.google.protobuf.ByteString getValuesBytes(int index) {
            return values_.getByteString(index);
        }

        /**
         * <code>repeated string values = 1;</code>
         */
        public Builder setValues(int index, java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            ensureValuesIsMutable();
            values_.set(index, value);
            onChanged();
            return this;
        }

        /**
         * <code>repeated string values = 1;</code>
         */
        public Builder addValues(java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            ensureValuesIsMutable();
            values_.add(value);
            onChanged();
            return this;
        }

        /**
         * <code>repeated string values = 1;</code>
         */
        public Builder addAllValues(java.lang.Iterable<java.lang.String> values) {
            ensureValuesIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, values_);
            onChanged();
            return this;
        }

        /**
         * <code>repeated string values = 1;</code>
         */
        public Builder clearValues() {
            values_ = com.google.protobuf.LazyStringArrayList.EMPTY;
            bitField0_ = (bitField0_ & ~0x00000001);
            onChanged();
            return this;
        }

        /**
         * <code>repeated string values = 1;</code>
         */
        public Builder addValuesBytes(com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);
            ensureValuesIsMutable();
            values_.add(value);
            onChanged();
            return this;
        }

        public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.setUnknownFieldsProto3(unknownFields);
        }

        public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.mergeUnknownFields(unknownFields);
        }

        // @@protoc_insertion_point(builder_scope:QueryValues)
    }

    // @@protoc_insertion_point(class_scope:QueryValues)
    private static final com.alipay.sofa.registry.common.model.client.pb.QueryValues DEFAULT_INSTANCE;
    static {
        DEFAULT_INSTANCE = new com.alipay.sofa.registry.common.model.client.pb.QueryValues();
    }

    public static com.alipay.sofa.registry.common.model.client.pb.QueryValues getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<QueryValues> PARSER = new com.google.protobuf.AbstractParser<QueryValues>() {
                                                                            public QueryValues parsePartialFrom(com.google.protobuf.CodedInputStream input,
                                                                                                                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                                                                                                                                                                            throws com.google.protobuf.InvalidProtocolBufferException {
                                                                                return new QueryValues(
                                                                                    input,
                                                                                    extensionRegistry);
                                                                            }
                                                                        };

    public static com.google.protobuf.Parser<QueryValues> parser() {
        return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<QueryValues> getParserForType() {
        return PARSER;
    }

    public com.alipay.sofa.registry.common.model.client.pb.QueryValues getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}
