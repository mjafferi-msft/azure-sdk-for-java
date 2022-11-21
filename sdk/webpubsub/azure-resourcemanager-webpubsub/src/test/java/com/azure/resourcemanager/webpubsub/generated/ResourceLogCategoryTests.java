// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.webpubsub.models.ResourceLogCategory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ResourceLogCategoryTests {
    @Test
    public void testDeserialize() {
        ResourceLogCategory model =
            BinaryData
                .fromString("{\"name\":\"vjtoqnermclfp\",\"enabled\":\"hoxus\"}")
                .toObject(ResourceLogCategory.class);
        Assertions.assertEquals("vjtoqnermclfp", model.name());
        Assertions.assertEquals("hoxus", model.enabled());
    }

    @Test
    public void testSerialize() {
        ResourceLogCategory model = new ResourceLogCategory().withName("vjtoqnermclfp").withEnabled("hoxus");
        model = BinaryData.fromObject(model).toObject(ResourceLogCategory.class);
        Assertions.assertEquals("vjtoqnermclfp", model.name());
        Assertions.assertEquals("hoxus", model.enabled());
    }
}