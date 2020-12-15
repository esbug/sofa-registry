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

public interface AppRevisionInterfacePbOrBuilder extends
// @@protoc_insertion_point(interface_extends:AppRevisionInterfacePb)
                                                com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string dataId = 1;</code>
     */
    java.lang.String getDataId();

    /**
     * <code>string dataId = 1;</code>
     */
    com.google.protobuf.ByteString getDataIdBytes();

    /**
     * <code>string group = 2;</code>
     */
    java.lang.String getGroup();

    /**
     * <code>string group = 2;</code>
     */
    com.google.protobuf.ByteString getGroupBytes();

    /**
     * <code>string instanceId = 3;</code>
     */
    java.lang.String getInstanceId();

    /**
     * <code>string instanceId = 3;</code>
     */
    com.google.protobuf.ByteString getInstanceIdBytes();

    /**
     * <code>map&lt;string, .QueryValues&gt; serviceParams = 4;</code>
     */
    int getServiceParamsCount();

    /**
     * <code>map&lt;string, .QueryValues&gt; serviceParams = 4;</code>
     */
    boolean containsServiceParams(java.lang.String key);

    /**
     * Use {@link #getServiceParamsMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.String, com.alipay.sofa.registry.common.model.client.pb.QueryValues> getServiceParams();

    /**
     * <code>map&lt;string, .QueryValues&gt; serviceParams = 4;</code>
     */
    java.util.Map<java.lang.String, com.alipay.sofa.registry.common.model.client.pb.QueryValues> getServiceParamsMap();

    /**
     * <code>map&lt;string, .QueryValues&gt; serviceParams = 4;</code>
     */

    com.alipay.sofa.registry.common.model.client.pb.QueryValues getServiceParamsOrDefault(java.lang.String key,
                                                                                          com.alipay.sofa.registry.common.model.client.pb.QueryValues defaultValue);

    /**
     * <code>map&lt;string, .QueryValues&gt; serviceParams = 4;</code>
     */

    com.alipay.sofa.registry.common.model.client.pb.QueryValues getServiceParamsOrThrow(java.lang.String key);
}
