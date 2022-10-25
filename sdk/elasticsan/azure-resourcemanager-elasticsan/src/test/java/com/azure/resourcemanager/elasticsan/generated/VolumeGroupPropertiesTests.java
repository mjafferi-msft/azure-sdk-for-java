// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elasticsan.fluent.models.VolumeGroupProperties;
import com.azure.resourcemanager.elasticsan.models.Action;
import com.azure.resourcemanager.elasticsan.models.EncryptionType;
import com.azure.resourcemanager.elasticsan.models.NetworkRuleSet;
import com.azure.resourcemanager.elasticsan.models.StorageTargetType;
import com.azure.resourcemanager.elasticsan.models.VirtualNetworkRule;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VolumeGroupPropertiesTests {
    @Test
    public void testDeserialize() {
        VolumeGroupProperties model =
            BinaryData
                .fromString(
                    "{\"provisioningState\":\"Pending\",\"protocolType\":\"None\",\"encryption\":\"EncryptionAtRestWithPlatformKey\",\"networkAcls\":{\"virtualNetworkRules\":[{\"id\":\"bzaqsqsycbkbfk\",\"action\":\"Allow\",\"state\":\"networkSourceDeleted\"},{\"id\":\"exxppofmxaxcfjp\",\"action\":\"Allow\",\"state\":\"failed\"},{\"id\":\"c\",\"action\":\"Allow\",\"state\":\"failed\"},{\"id\":\"pmouexhdz\",\"action\":\"Allow\",\"state\":\"failed\"}]}}")
                .toObject(VolumeGroupProperties.class);
        Assertions.assertEquals(StorageTargetType.NONE, model.protocolType());
        Assertions.assertEquals(EncryptionType.ENCRYPTION_AT_REST_WITH_PLATFORM_KEY, model.encryption());
        Assertions
            .assertEquals(
                "bzaqsqsycbkbfk", model.networkAcls().virtualNetworkRules().get(0).virtualNetworkResourceId());
        Assertions.assertEquals(Action.ALLOW, model.networkAcls().virtualNetworkRules().get(0).action());
    }

    @Test
    public void testSerialize() {
        VolumeGroupProperties model =
            new VolumeGroupProperties()
                .withProtocolType(StorageTargetType.NONE)
                .withEncryption(EncryptionType.ENCRYPTION_AT_REST_WITH_PLATFORM_KEY)
                .withNetworkAcls(
                    new NetworkRuleSet()
                        .withVirtualNetworkRules(
                            Arrays
                                .asList(
                                    new VirtualNetworkRule()
                                        .withVirtualNetworkResourceId("bzaqsqsycbkbfk")
                                        .withAction(Action.ALLOW),
                                    new VirtualNetworkRule()
                                        .withVirtualNetworkResourceId("exxppofmxaxcfjp")
                                        .withAction(Action.ALLOW),
                                    new VirtualNetworkRule().withVirtualNetworkResourceId("c").withAction(Action.ALLOW),
                                    new VirtualNetworkRule()
                                        .withVirtualNetworkResourceId("pmouexhdz")
                                        .withAction(Action.ALLOW))));
        model = BinaryData.fromObject(model).toObject(VolumeGroupProperties.class);
        Assertions.assertEquals(StorageTargetType.NONE, model.protocolType());
        Assertions.assertEquals(EncryptionType.ENCRYPTION_AT_REST_WITH_PLATFORM_KEY, model.encryption());
        Assertions
            .assertEquals(
                "bzaqsqsycbkbfk", model.networkAcls().virtualNetworkRules().get(0).virtualNetworkResourceId());
        Assertions.assertEquals(Action.ALLOW, model.networkAcls().virtualNetworkRules().get(0).action());
    }
}