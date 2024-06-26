// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.RestorableTimeRange;
import org.junit.jupiter.api.Assertions;

public final class RestorableTimeRangeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RestorableTimeRange model
            = BinaryData.fromString("{\"startTime\":\"gdkz\",\"endTime\":\"ewkfvhqcrai\",\"objectType\":\"pnppfuf\"}")
                .toObject(RestorableTimeRange.class);
        Assertions.assertEquals("gdkz", model.startTime());
        Assertions.assertEquals("ewkfvhqcrai", model.endTime());
        Assertions.assertEquals("pnppfuf", model.objectType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RestorableTimeRange model
            = new RestorableTimeRange().withStartTime("gdkz").withEndTime("ewkfvhqcrai").withObjectType("pnppfuf");
        model = BinaryData.fromObject(model).toObject(RestorableTimeRange.class);
        Assertions.assertEquals("gdkz", model.startTime());
        Assertions.assertEquals("ewkfvhqcrai", model.endTime());
        Assertions.assertEquals("pnppfuf", model.objectType());
    }
}
