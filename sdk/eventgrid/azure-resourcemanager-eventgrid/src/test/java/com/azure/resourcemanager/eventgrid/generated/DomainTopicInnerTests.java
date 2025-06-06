// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.fluent.models.DomainTopicInner;

public final class DomainTopicInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DomainTopicInner model = BinaryData
            .fromString(
                "{\"properties\":{\"provisioningState\":\"Canceled\"},\"id\":\"lbg\",\"name\":\"cdui\",\"type\":\"r\"}")
            .toObject(DomainTopicInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DomainTopicInner model = new DomainTopicInner();
        model = BinaryData.fromObject(model).toObject(DomainTopicInner.class);
    }
}
