// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.GatewayContractProperties;
import com.azure.resourcemanager.apimanagement.models.ResourceLocationDataContract;
import org.junit.jupiter.api.Assertions;

public final class GatewayContractPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GatewayContractProperties model = BinaryData.fromString(
            "{\"locationData\":{\"name\":\"shksny\",\"city\":\"spamwbwmbnls\",\"district\":\"efiqdktwtkv\",\"countryOrRegion\":\"lpfliwoyn\"},\"description\":\"uzhwvladpcmhjhau\"}")
            .toObject(GatewayContractProperties.class);
        Assertions.assertEquals("shksny", model.locationData().name());
        Assertions.assertEquals("spamwbwmbnls", model.locationData().city());
        Assertions.assertEquals("efiqdktwtkv", model.locationData().district());
        Assertions.assertEquals("lpfliwoyn", model.locationData().countryOrRegion());
        Assertions.assertEquals("uzhwvladpcmhjhau", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GatewayContractProperties model
            = new GatewayContractProperties().withLocationData(new ResourceLocationDataContract().withName("shksny")
                .withCity("spamwbwmbnls")
                .withDistrict("efiqdktwtkv")
                .withCountryOrRegion("lpfliwoyn")).withDescription("uzhwvladpcmhjhau");
        model = BinaryData.fromObject(model).toObject(GatewayContractProperties.class);
        Assertions.assertEquals("shksny", model.locationData().name());
        Assertions.assertEquals("spamwbwmbnls", model.locationData().city());
        Assertions.assertEquals("efiqdktwtkv", model.locationData().district());
        Assertions.assertEquals("lpfliwoyn", model.locationData().countryOrRegion());
        Assertions.assertEquals("uzhwvladpcmhjhau", model.description());
    }
}
