// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.SnapshotBackupAdditionalDetails;
import com.azure.resourcemanager.recoveryservicesbackup.models.UserAssignedIdentityProperties;
import com.azure.resourcemanager.recoveryservicesbackup.models.UserAssignedManagedIdentityDetails;
import org.junit.jupiter.api.Assertions;

public final class SnapshotBackupAdditionalDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SnapshotBackupAdditionalDetails model = BinaryData.fromString(
            "{\"instantRpRetentionRangeInDays\":10785400,\"instantRPDetails\":\"mczuo\",\"userAssignedManagedIdentityDetails\":{\"identityArmId\":\"wcw\",\"identityName\":\"ioknssxmoj\",\"userAssignedIdentityProperties\":{\"clientId\":\"p\",\"principalId\":\"prvkwcfzqljyxgtc\"}}}")
            .toObject(SnapshotBackupAdditionalDetails.class);
        Assertions.assertEquals(10785400, model.instantRpRetentionRangeInDays());
        Assertions.assertEquals("mczuo", model.instantRPDetails());
        Assertions.assertEquals("wcw", model.userAssignedManagedIdentityDetails().identityArmId());
        Assertions.assertEquals("ioknssxmoj", model.userAssignedManagedIdentityDetails().identityName());
        Assertions.assertEquals("p",
            model.userAssignedManagedIdentityDetails().userAssignedIdentityProperties().clientId());
        Assertions.assertEquals("prvkwcfzqljyxgtc",
            model.userAssignedManagedIdentityDetails().userAssignedIdentityProperties().principalId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SnapshotBackupAdditionalDetails model = new SnapshotBackupAdditionalDetails()
            .withInstantRpRetentionRangeInDays(10785400).withInstantRPDetails("mczuo")
            .withUserAssignedManagedIdentityDetails(new UserAssignedManagedIdentityDetails().withIdentityArmId("wcw")
                .withIdentityName("ioknssxmoj").withUserAssignedIdentityProperties(
                    new UserAssignedIdentityProperties().withClientId("p").withPrincipalId("prvkwcfzqljyxgtc")));
        model = BinaryData.fromObject(model).toObject(SnapshotBackupAdditionalDetails.class);
        Assertions.assertEquals(10785400, model.instantRpRetentionRangeInDays());
        Assertions.assertEquals("mczuo", model.instantRPDetails());
        Assertions.assertEquals("wcw", model.userAssignedManagedIdentityDetails().identityArmId());
        Assertions.assertEquals("ioknssxmoj", model.userAssignedManagedIdentityDetails().identityName());
        Assertions.assertEquals("p",
            model.userAssignedManagedIdentityDetails().userAssignedIdentityProperties().clientId());
        Assertions.assertEquals("prvkwcfzqljyxgtc",
            model.userAssignedManagedIdentityDetails().userAssignedIdentityProperties().principalId());
    }
}
