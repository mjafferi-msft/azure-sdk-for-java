// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.machinelearning.models.CronTrigger;
import com.azure.resourcemanager.machinelearning.models.EndpointScheduleAction;
import com.azure.resourcemanager.machinelearning.models.ScheduleProperties;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/** Samples for Schedules CreateOrUpdate. */
public final class SchedulesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/stable/2022-10-01/examples/Schedule/createOrUpdate.json
     */
    /**
     * Sample code: CreateOrUpdate Schedule.
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void createOrUpdateSchedule(com.azure.resourcemanager.machinelearning.MachineLearningManager manager)
        throws IOException {
        manager
            .schedules()
            .define("string")
            .withExistingWorkspace("test-rg", "my-aml-workspace")
            .withProperties(
                new ScheduleProperties()
                    .withDescription("string")
                    .withProperties(mapOf("string", "string"))
                    .withTags(mapOf("string", "string"))
                    .withAction(
                        new EndpointScheduleAction()
                            .withEndpointInvocationDefinition(
                                SerializerFactory
                                    .createDefaultManagementSerializerAdapter()
                                    .deserialize(
                                        "{\"9965593e-526f-4b89-bb36-761138cf2794\":null}",
                                        Object.class,
                                        SerializerEncoding.JSON)))
                    .withDisplayName("string")
                    .withIsEnabled(false)
                    .withTrigger(
                        new CronTrigger()
                            .withEndTime("string")
                            .withStartTime("string")
                            .withTimeZone("string")
                            .withExpression("string")))
            .create();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}