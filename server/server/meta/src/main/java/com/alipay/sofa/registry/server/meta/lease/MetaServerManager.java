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
package com.alipay.sofa.registry.server.meta.lease;

import com.alipay.sofa.registry.lifecycle.Lifecycle;
import com.alipay.sofa.registry.server.meta.MetaServer;

/**
 * @author chen.zhu
 * <p>
 * Nov 19, 2020
 */
public interface MetaServerManager extends Lifecycle {

    /**
     * Gets get or create.
     *
     * @param dc the dc
     * @return the get or create
     */
    MetaServer getOrCreate(String dc);

    /**
     * Remove.
     *
     * @param dc the dc
     */
    void remove(String dc);
}
