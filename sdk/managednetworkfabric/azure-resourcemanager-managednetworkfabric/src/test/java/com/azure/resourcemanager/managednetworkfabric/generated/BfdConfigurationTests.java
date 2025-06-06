// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.models.BfdConfiguration;
import org.junit.jupiter.api.Assertions;

public final class BfdConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BfdConfiguration model = BinaryData
            .fromString(
                "{\"administrativeState\":\"RMA\",\"intervalInMilliSeconds\":1056742134,\"multiplier\":1974850281}")
            .toObject(BfdConfiguration.class);
        Assertions.assertEquals(1056742134, model.intervalInMilliSeconds());
        Assertions.assertEquals(1974850281, model.multiplier());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BfdConfiguration model
            = new BfdConfiguration().withIntervalInMilliSeconds(1056742134).withMultiplier(1974850281);
        model = BinaryData.fromObject(model).toObject(BfdConfiguration.class);
        Assertions.assertEquals(1056742134, model.intervalInMilliSeconds());
        Assertions.assertEquals(1974850281, model.multiplier());
    }
}
