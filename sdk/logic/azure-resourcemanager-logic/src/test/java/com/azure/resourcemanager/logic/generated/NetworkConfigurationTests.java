// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.logic.models.IntegrationServiceEnvironmentAccessEndpoint;
import com.azure.resourcemanager.logic.models.IntegrationServiceEnvironmentAccessEndpointType;
import com.azure.resourcemanager.logic.models.NetworkConfiguration;
import com.azure.resourcemanager.logic.models.ResourceReference;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class NetworkConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkConfiguration model =
            BinaryData
                .fromString(
                    "{\"virtualNetworkAddressSpace\":\"osfjbjsv\",\"accessEndpoint\":{\"type\":\"Internal\"},\"subnets\":[{\"id\":\"vyc\",\"name\":\"dclxgc\",\"type\":\"nfnw\"}]}")
                .toObject(NetworkConfiguration.class);
        Assertions.assertEquals("osfjbjsv", model.virtualNetworkAddressSpace());
        Assertions
            .assertEquals(IntegrationServiceEnvironmentAccessEndpointType.INTERNAL, model.accessEndpoint().type());
        Assertions.assertEquals("vyc", model.subnets().get(0).id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkConfiguration model =
            new NetworkConfiguration()
                .withVirtualNetworkAddressSpace("osfjbjsv")
                .withAccessEndpoint(
                    new IntegrationServiceEnvironmentAccessEndpoint()
                        .withType(IntegrationServiceEnvironmentAccessEndpointType.INTERNAL))
                .withSubnets(Arrays.asList(new ResourceReference().withId("vyc")));
        model = BinaryData.fromObject(model).toObject(NetworkConfiguration.class);
        Assertions.assertEquals("osfjbjsv", model.virtualNetworkAddressSpace());
        Assertions
            .assertEquals(IntegrationServiceEnvironmentAccessEndpointType.INTERNAL, model.accessEndpoint().type());
        Assertions.assertEquals("vyc", model.subnets().get(0).id());
    }
}
