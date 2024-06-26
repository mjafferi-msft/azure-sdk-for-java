// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dnsresolver.generated;

import com.azure.core.management.SubResource;
import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dnsresolver.fluent.models.VirtualNetworkLinkProperties;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VirtualNetworkLinkPropertiesTests {
    @Test
    public void testDeserialize() {
        VirtualNetworkLinkProperties model =
            BinaryData
                .fromString(
                    "{\"virtualNetwork\":{\"id\":\"ur\"},\"metadata\":{\"ptkoenkoukn\":\"xjnspy\",\"ngkpocipazy\":\"udwtiukbl\",\"gukgjnpiucgygevq\":\"o\"},\"provisioningState\":\"Updating\"}")
                .toObject(VirtualNetworkLinkProperties.class);
        Assertions.assertEquals("ur", model.virtualNetwork().id());
        Assertions.assertEquals("xjnspy", model.metadata().get("ptkoenkoukn"));
    }

    @Test
    public void testSerialize() {
        VirtualNetworkLinkProperties model =
            new VirtualNetworkLinkProperties()
                .withVirtualNetwork(new SubResource().withId("ur"))
                .withMetadata(mapOf("ptkoenkoukn", "xjnspy", "ngkpocipazy", "udwtiukbl", "gukgjnpiucgygevq", "o"));
        model = BinaryData.fromObject(model).toObject(VirtualNetworkLinkProperties.class);
        Assertions.assertEquals("ur", model.virtualNetwork().id());
        Assertions.assertEquals("xjnspy", model.metadata().get("ptkoenkoukn"));
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
