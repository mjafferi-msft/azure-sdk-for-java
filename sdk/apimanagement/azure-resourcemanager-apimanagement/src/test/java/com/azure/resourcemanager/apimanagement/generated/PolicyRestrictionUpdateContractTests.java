// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.models.PolicyRestrictionRequireBase;
import com.azure.resourcemanager.apimanagement.models.PolicyRestrictionUpdateContract;
import org.junit.jupiter.api.Assertions;

public final class PolicyRestrictionUpdateContractTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PolicyRestrictionUpdateContract model
            = BinaryData.fromString("{\"properties\":{\"scope\":\"chnzrsbkkzo\",\"requireBase\":\"false\"}}")
                .toObject(PolicyRestrictionUpdateContract.class);
        Assertions.assertEquals("chnzrsbkkzo", model.scope());
        Assertions.assertEquals(PolicyRestrictionRequireBase.FALSE, model.requireBase());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PolicyRestrictionUpdateContract model = new PolicyRestrictionUpdateContract().withScope("chnzrsbkkzo")
            .withRequireBase(PolicyRestrictionRequireBase.FALSE);
        model = BinaryData.fromObject(model).toObject(PolicyRestrictionUpdateContract.class);
        Assertions.assertEquals("chnzrsbkkzo", model.scope());
        Assertions.assertEquals(PolicyRestrictionRequireBase.FALSE, model.requireBase());
    }
}
