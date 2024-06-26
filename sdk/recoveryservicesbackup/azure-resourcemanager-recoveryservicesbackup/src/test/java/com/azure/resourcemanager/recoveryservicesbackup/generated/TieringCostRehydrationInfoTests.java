// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.TieringCostRehydrationInfo;
import org.junit.jupiter.api.Assertions;

public final class TieringCostRehydrationInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TieringCostRehydrationInfo model = BinaryData.fromString(
            "{\"objectType\":\"TieringCostRehydrationInfo\",\"rehydrationSizeInBytes\":8184942715598755795,\"retailRehydrationCostPerGBPerMonth\":77.71046492041543}")
            .toObject(TieringCostRehydrationInfo.class);
        Assertions.assertEquals(8184942715598755795L, model.rehydrationSizeInBytes());
        Assertions.assertEquals(77.71046492041543, model.retailRehydrationCostPerGBPerMonth());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TieringCostRehydrationInfo model = new TieringCostRehydrationInfo()
            .withRehydrationSizeInBytes(8184942715598755795L).withRetailRehydrationCostPerGBPerMonth(77.71046492041543);
        model = BinaryData.fromObject(model).toObject(TieringCostRehydrationInfo.class);
        Assertions.assertEquals(8184942715598755795L, model.rehydrationSizeInBytes());
        Assertions.assertEquals(77.71046492041543, model.retailRehydrationCostPerGBPerMonth());
    }
}
