/*
 * Copyright 1999-2019 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.chaosblade.exec.common.model.prepare;

import java.util.List;

import com.alibaba.chaosblade.exec.common.model.FlagSpec;

/**
 * Prepare for creating experiment
 *
 * @author Changjun Xiao
 */
public interface PrepareSpec {
    /**
     * The prepare type, for example, jvm
     *
     * @return
     */
    String getType();

    /**
     * Get the prepare flags
     *
     * @return
     */
    List<FlagSpec> getFlags();

    /**
     * If necessary or not
     *
     * @return
     */
    boolean required();
}
