// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservices.models.CapabilitiesResponseProperties;
import com.azure.resourcemanager.recoveryservices.models.DnsZoneResponse;
import com.azure.resourcemanager.recoveryservices.models.VaultSubResourceType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class CapabilitiesResponsePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CapabilitiesResponseProperties model =
            BinaryData
                .fromString(
                    "{\"dnsZones\":[{\"requiredZoneNames\":[\"olniwpwcukjf\",\"giawx\",\"lryplwckbasyy\",\"nddhsgcbacph\"],\"subResource\":\"AzureBackup\"},{\"requiredZoneNames\":[\"ynqgoulzndlikwyq\",\"gfgibm\"],\"subResource\":\"AzureBackup\"},{\"requiredZoneNames\":[\"eqsrxybzqqedqyt\",\"ciqfou\",\"lmmnkzsmodmglo\",\"gpbkwtmut\"],\"subResource\":\"AzureSiteRecovery\"}]}")
                .toObject(CapabilitiesResponseProperties.class);
        Assertions.assertEquals(VaultSubResourceType.AZURE_BACKUP, model.dnsZones().get(0).subResource());
        Assertions.assertEquals("olniwpwcukjf", model.dnsZones().get(0).requiredZoneNames().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CapabilitiesResponseProperties model =
            new CapabilitiesResponseProperties()
                .withDnsZones(
                    Arrays
                        .asList(
                            new DnsZoneResponse()
                                .withSubResource(VaultSubResourceType.AZURE_BACKUP)
                                .withRequiredZoneNames(
                                    Arrays.asList("olniwpwcukjf", "giawx", "lryplwckbasyy", "nddhsgcbacph")),
                            new DnsZoneResponse()
                                .withSubResource(VaultSubResourceType.AZURE_BACKUP)
                                .withRequiredZoneNames(Arrays.asList("ynqgoulzndlikwyq", "gfgibm")),
                            new DnsZoneResponse()
                                .withSubResource(VaultSubResourceType.AZURE_SITE_RECOVERY)
                                .withRequiredZoneNames(
                                    Arrays.asList("eqsrxybzqqedqyt", "ciqfou", "lmmnkzsmodmglo", "gpbkwtmut"))));
        model = BinaryData.fromObject(model).toObject(CapabilitiesResponseProperties.class);
        Assertions.assertEquals(VaultSubResourceType.AZURE_BACKUP, model.dnsZones().get(0).subResource());
        Assertions.assertEquals("olniwpwcukjf", model.dnsZones().get(0).requiredZoneNames().get(0));
    }
}
