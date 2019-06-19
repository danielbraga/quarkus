/*
 * Copyright 2018 Red Hat, Inc.
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

package io.quarkus.camel.activemq.component.deployment;

import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;

public class CamelActiveMQProcessor {

    private static final String CAMEL_ACTIVEMQ = "camel-activemq";

    //    @Inject
    //    BuildProducer<ReflectiveClassBuildItem> reflectiveClass;

    //    @BuildStep
    //    ReflectiveClassBuildItem reflection() {
    ////        org.apache.camel.core.xml.util.jsse.Cli
    //        return new ReflectiveClassBuildItem(true, true, BrokerComponent.class);
    //    }

    //    @BuildStep
    //    void process() {
    ////        org.apache.camel.core.xml.util.jsse.Cli
    //        reflectiveClass.produce(new ReflectiveClassBuildItem(true, true, BrokerComponent.class));
    //
    //        //        reflectiveClass.produce(new ReflectiveClassBuildItem(false, false, "org.apache.camel.core.xml.util.jsse.ClientAuthenticationDefinition"));
    //    }

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(CAMEL_ACTIVEMQ);
    }

}
