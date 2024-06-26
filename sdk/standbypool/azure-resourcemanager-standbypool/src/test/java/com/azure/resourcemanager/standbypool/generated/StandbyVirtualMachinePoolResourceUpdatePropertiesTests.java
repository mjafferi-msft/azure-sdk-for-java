// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.standbypool.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.standbypool.models.StandbyVirtualMachinePoolElasticityProfileUpdate;
import com.azure.resourcemanager.standbypool.models.StandbyVirtualMachinePoolResourceUpdateProperties;
import com.azure.resourcemanager.standbypool.models.VirtualMachineState;
import org.junit.jupiter.api.Assertions;

public final class StandbyVirtualMachinePoolResourceUpdatePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StandbyVirtualMachinePoolResourceUpdateProperties model = BinaryData.fromString(
            "{\"elasticityProfile\":{\"maxReadyCapacity\":1699471784577737162},\"virtualMachineState\":\"Running\",\"attachedVirtualMachineScaleSetId\":\"ppofmxaxcfjpgdd\"}")
            .toObject(StandbyVirtualMachinePoolResourceUpdateProperties.class);
        Assertions.assertEquals(1699471784577737162L, model.elasticityProfile().maxReadyCapacity());
        Assertions.assertEquals(VirtualMachineState.RUNNING, model.virtualMachineState());
        Assertions.assertEquals("ppofmxaxcfjpgdd", model.attachedVirtualMachineScaleSetId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StandbyVirtualMachinePoolResourceUpdateProperties model
            = new StandbyVirtualMachinePoolResourceUpdateProperties()
                .withElasticityProfile(
                    new StandbyVirtualMachinePoolElasticityProfileUpdate().withMaxReadyCapacity(1699471784577737162L))
                .withVirtualMachineState(VirtualMachineState.RUNNING)
                .withAttachedVirtualMachineScaleSetId("ppofmxaxcfjpgdd");
        model = BinaryData.fromObject(model).toObject(StandbyVirtualMachinePoolResourceUpdateProperties.class);
        Assertions.assertEquals(1699471784577737162L, model.elasticityProfile().maxReadyCapacity());
        Assertions.assertEquals(VirtualMachineState.RUNNING, model.virtualMachineState());
        Assertions.assertEquals("ppofmxaxcfjpgdd", model.attachedVirtualMachineScaleSetId());
    }
}
