// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.Compute;
import org.junit.jupiter.api.Assertions;

public final class ComputeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Compute model =
            BinaryData
                .fromString(
                    "{\"computeType\":\"Compute\",\"computeLocation\":\"tsthsucocm\",\"provisioningState\":\"Canceled\",\"description\":\"zt\",\"createdOn\":\"2021-04-09T08:14:29Z\",\"modifiedOn\":\"2021-08-28T10:19:16Z\",\"resourceId\":\"qpuedckzywbiex\",\"provisioningErrors\":[],\"isAttachedCompute\":false,\"disableLocalAuth\":false}")
                .toObject(Compute.class);
        Assertions.assertEquals("tsthsucocm", model.computeLocation());
        Assertions.assertEquals("zt", model.description());
        Assertions.assertEquals("qpuedckzywbiex", model.resourceId());
        Assertions.assertEquals(false, model.disableLocalAuth());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Compute model =
            new Compute()
                .withComputeLocation("tsthsucocm")
                .withDescription("zt")
                .withResourceId("qpuedckzywbiex")
                .withDisableLocalAuth(false);
        model = BinaryData.fromObject(model).toObject(Compute.class);
        Assertions.assertEquals("tsthsucocm", model.computeLocation());
        Assertions.assertEquals("zt", model.description());
        Assertions.assertEquals("qpuedckzywbiex", model.resourceId());
        Assertions.assertEquals(false, model.disableLocalAuth());
    }
}
