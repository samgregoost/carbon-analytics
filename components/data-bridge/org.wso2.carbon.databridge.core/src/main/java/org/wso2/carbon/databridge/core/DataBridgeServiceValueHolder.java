package org.wso2.carbon.databridge.core;

/*
* Copyright 2004,2005 The Apache Software Foundation.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

import org.wso2.carbon.databridge.core.definitionstore.AbstractStreamDefinitionStore;
import org.wso2.carbon.databridge.core.definitionstore.InMemoryStreamDefinitionStore;
import org.wso2.carbon.kernel.CarbonRuntime;

public class DataBridgeServiceValueHolder {
    // TODO: 2/14/17 DataBridgeDS only references carbon runtime (may have to change later)

    private static CarbonRuntime carbonRuntime;
//    private static RealmService realmService;
//    private static AbstractStreamDefinitionStore streamDefinitionStore;
//    private static ConfigurationContextService configurationContextService;

    /*public static void setRealmService(RealmService realmService) {
        DataBridgeServiceValueHolder.realmService = realmService;
    }*/

    /*public static RealmService getRealmService() {
        return realmService;
    }*/

    /*public static void setStreamDefinitionStore(InMemoryStreamDefinitionStore streamDefinitionStore) {
        DataBridgeServiceValueHolder.streamDefinitionStore = streamDefinitionStore;
    }

    public static InMemoryStreamDefinitionStore getStreamDefinitionStore() {
        return streamDefinitionStore;
    }*/

    /*public static void setConfigurationContextService(ConfigurationContextService configurationContextService) {
        DataBridgeServiceValueHolder.configurationContextService = configurationContextService;
    }

    public static ConfigurationContextService getConfigurationContextService() {
        return configurationContextService;
    }*/

    public static CarbonRuntime getCarbonRuntime() {
        return carbonRuntime;
    }

    public static void setCarbonRuntime(CarbonRuntime carbonRuntime) {
        DataBridgeServiceValueHolder.carbonRuntime = carbonRuntime;
    }
}
