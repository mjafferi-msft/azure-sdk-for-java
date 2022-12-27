// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.digitaltwins.fluent.models.DigitalTwinsDescriptionInner;
import com.azure.resourcemanager.digitaltwins.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.digitaltwins.models.DigitalTwinsIdentity;
import com.azure.resourcemanager.digitaltwins.models.DigitalTwinsIdentityType;
import com.azure.resourcemanager.digitaltwins.models.PublicNetworkAccess;
import com.azure.resourcemanager.digitaltwins.models.UserAssignedIdentity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DigitalTwinsDescriptionInnerTests {
    @Test
    public void testDeserialize() {
        DigitalTwinsDescriptionInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"createdTime\":\"2021-11-25T12:23:30Z\",\"lastUpdatedTime\":\"2021-08-21T06:38:48Z\",\"provisioningState\":\"Moving\",\"hostName\":\"xpyb\",\"privateEndpointConnections\":[{\"id\":\"hmtzopbsphrup\",\"name\":\"dgs\",\"type\":\"bb\"}],\"publicNetworkAccess\":\"Enabled\"},\"identity\":{\"type\":\"SystemAssigned,UserAssigned\",\"principalId\":\"cmsxaobhdxbm\",\"tenantId\":\"ioq\",\"userAssignedIdentities\":{\"lrxybqsoq\":{\"clientId\":\"tbmufpo\",\"principalId\":\"oizh\"},\"nrbtcqqjnq\":{\"clientId\":\"gkdmb\",\"principalId\":\"zlobcufpd\"}}},\"location\":\"hqgnufooojywif\",\"tags\":{\"glzlhjxrifkwmrv\":\"saagdf\",\"psqucmpoyf\":\"tsizntocipaoua\"},\"id\":\"kfo\",\"name\":\"knygjofjddeq\",\"type\":\"rd\"}")
                .toObject(DigitalTwinsDescriptionInner.class);
        Assertions.assertEquals("hqgnufooojywif", model.location());
        Assertions.assertEquals("saagdf", model.tags().get("glzlhjxrifkwmrv"));
        Assertions.assertEquals(DigitalTwinsIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED, model.identity().type());
        Assertions.assertEquals(PublicNetworkAccess.ENABLED, model.publicNetworkAccess());
    }

    @Test
    public void testSerialize() {
        DigitalTwinsDescriptionInner model =
            new DigitalTwinsDescriptionInner()
                .withLocation("hqgnufooojywif")
                .withTags(mapOf("glzlhjxrifkwmrv", "saagdf", "psqucmpoyf", "tsizntocipaoua"))
                .withIdentity(
                    new DigitalTwinsIdentity()
                        .withType(DigitalTwinsIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED)
                        .withUserAssignedIdentities(
                            mapOf("lrxybqsoq", new UserAssignedIdentity(), "nrbtcqqjnq", new UserAssignedIdentity())))
                .withPrivateEndpointConnections(Arrays.asList(new PrivateEndpointConnectionInner()))
                .withPublicNetworkAccess(PublicNetworkAccess.ENABLED);
        model = BinaryData.fromObject(model).toObject(DigitalTwinsDescriptionInner.class);
        Assertions.assertEquals("hqgnufooojywif", model.location());
        Assertions.assertEquals("saagdf", model.tags().get("glzlhjxrifkwmrv"));
        Assertions.assertEquals(DigitalTwinsIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED, model.identity().type());
        Assertions.assertEquals(PublicNetworkAccess.ENABLED, model.publicNetworkAccess());
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