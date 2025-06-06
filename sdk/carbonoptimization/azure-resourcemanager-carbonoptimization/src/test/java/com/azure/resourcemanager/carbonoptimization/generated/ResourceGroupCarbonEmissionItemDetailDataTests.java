// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.carbonoptimization.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.carbonoptimization.models.CategoryTypeEnum;
import com.azure.resourcemanager.carbonoptimization.models.ResourceGroupCarbonEmissionItemDetailData;
import org.junit.jupiter.api.Assertions;

public final class ResourceGroupCarbonEmissionItemDetailDataTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceGroupCarbonEmissionItemDetailData model = BinaryData.fromString(
            "{\"dataType\":\"ResourceGroupItemDetailsData\",\"itemName\":\"tbzsgfyccs\",\"categoryType\":\"Location\",\"subscriptionId\":\"wmdwzjeiachboo\",\"resourceGroupUrl\":\"flnrosfqpteehzz\",\"latestMonthEmissions\":67.05551920666015,\"previousMonthEmissions\":45.17035712965603,\"monthOverMonthEmissionsChangeRatio\":0.45290535725276415,\"monthlyEmissionsChangeValue\":96.27415947539853}")
            .toObject(ResourceGroupCarbonEmissionItemDetailData.class);
        Assertions.assertEquals(67.05551920666015, model.latestMonthEmissions());
        Assertions.assertEquals(45.17035712965603, model.previousMonthEmissions());
        Assertions.assertEquals(0.45290535725276415D, model.monthOverMonthEmissionsChangeRatio());
        Assertions.assertEquals(96.27415947539853D, model.monthlyEmissionsChangeValue());
        Assertions.assertEquals("tbzsgfyccs", model.itemName());
        Assertions.assertEquals(CategoryTypeEnum.LOCATION, model.categoryType());
        Assertions.assertEquals("wmdwzjeiachboo", model.subscriptionId());
        Assertions.assertEquals("flnrosfqpteehzz", model.resourceGroupUrl());
    }
}
