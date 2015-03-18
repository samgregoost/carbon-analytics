/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.analytics.spark.core.internal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.spark.executor.CoarseGrainedExecutorBackend;

import java.util.Arrays;

/**
 * Creates different threads for each executor
 */
public class SparkBackendExecutor implements Runnable {
    private static final Log log = LogFactory.getLog(SparkBackendExecutor.class);
    private final String [] argArray;

    public SparkBackendExecutor(String [] argArray){
        this.argArray= argArray;
    }

    @Override
    public void run() {
//        log.info("Starting executor using args : "+ Arrays.toString(argArray));
        System.out.println("Starting executor using args : "+ Arrays.toString(argArray));
        CoarseGrainedExecutorBackend.main(argArray);
    }
}