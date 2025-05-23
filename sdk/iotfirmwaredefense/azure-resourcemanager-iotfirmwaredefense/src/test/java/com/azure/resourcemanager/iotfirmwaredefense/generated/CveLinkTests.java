// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iotfirmwaredefense.models.CveLink;
import org.junit.jupiter.api.Assertions;

public final class CveLinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CveLink model = BinaryData.fromString("{\"href\":\"lfbxzpuzycisp\",\"label\":\"zahmgkbrpyydhibn\"}")
            .toObject(CveLink.class);
        Assertions.assertEquals("lfbxzpuzycisp", model.href());
        Assertions.assertEquals("zahmgkbrpyydhibn", model.label());
    }
}
