// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.advisor.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.advisor.models.OperationDisplayInfo;
import org.junit.jupiter.api.Assertions;

public final class OperationDisplayInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationDisplayInfo model =
            BinaryData
                .fromString(
                    "{\"description\":\"ae\",\"operation\":\"fhyhltrpmopjmcma\",\"provider\":\"okth\",\"resource\":\"iuaod\"}")
                .toObject(OperationDisplayInfo.class);
        Assertions.assertEquals("ae", model.description());
        Assertions.assertEquals("fhyhltrpmopjmcma", model.operation());
        Assertions.assertEquals("okth", model.provider());
        Assertions.assertEquals("iuaod", model.resource());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationDisplayInfo model =
            new OperationDisplayInfo()
                .withDescription("ae")
                .withOperation("fhyhltrpmopjmcma")
                .withProvider("okth")
                .withResource("iuaod");
        model = BinaryData.fromObject(model).toObject(OperationDisplayInfo.class);
        Assertions.assertEquals("ae", model.description());
        Assertions.assertEquals("fhyhltrpmopjmcma", model.operation());
        Assertions.assertEquals("okth", model.provider());
        Assertions.assertEquals("iuaod", model.resource());
    }
}
