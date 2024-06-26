// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureVmWorkloadSapHanaSystemWorkloadItem;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionStatus;
import org.junit.jupiter.api.Assertions;

public final class AzureVmWorkloadSapHanaSystemWorkloadItemTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureVmWorkloadSapHanaSystemWorkloadItem model = BinaryData.fromString(
            "{\"workloadItemType\":\"SAPHanaSystem\",\"parentName\":\"x\",\"serverName\":\"fihwu\",\"isAutoProtectable\":true,\"subinquireditemcount\":255649927,\"subWorkloadItemCount\":64697059,\"backupManagementType\":\"bxrblmliowxihspn\",\"workloadType\":\"qagnepzwakl\",\"friendlyName\":\"sbq\",\"protectionState\":\"NotProtected\"}")
            .toObject(AzureVmWorkloadSapHanaSystemWorkloadItem.class);
        Assertions.assertEquals("bxrblmliowxihspn", model.backupManagementType());
        Assertions.assertEquals("qagnepzwakl", model.workloadType());
        Assertions.assertEquals("sbq", model.friendlyName());
        Assertions.assertEquals(ProtectionStatus.NOT_PROTECTED, model.protectionState());
        Assertions.assertEquals("x", model.parentName());
        Assertions.assertEquals("fihwu", model.serverName());
        Assertions.assertEquals(true, model.isAutoProtectable());
        Assertions.assertEquals(255649927, model.subinquireditemcount());
        Assertions.assertEquals(64697059, model.subWorkloadItemCount());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureVmWorkloadSapHanaSystemWorkloadItem model = new AzureVmWorkloadSapHanaSystemWorkloadItem()
            .withBackupManagementType("bxrblmliowxihspn").withWorkloadType("qagnepzwakl").withFriendlyName("sbq")
            .withProtectionState(ProtectionStatus.NOT_PROTECTED).withParentName("x").withServerName("fihwu")
            .withIsAutoProtectable(true).withSubinquireditemcount(255649927).withSubWorkloadItemCount(64697059);
        model = BinaryData.fromObject(model).toObject(AzureVmWorkloadSapHanaSystemWorkloadItem.class);
        Assertions.assertEquals("bxrblmliowxihspn", model.backupManagementType());
        Assertions.assertEquals("qagnepzwakl", model.workloadType());
        Assertions.assertEquals("sbq", model.friendlyName());
        Assertions.assertEquals(ProtectionStatus.NOT_PROTECTED, model.protectionState());
        Assertions.assertEquals("x", model.parentName());
        Assertions.assertEquals("fihwu", model.serverName());
        Assertions.assertEquals(true, model.isAutoProtectable());
        Assertions.assertEquals(255649927, model.subinquireditemcount());
        Assertions.assertEquals(64697059, model.subWorkloadItemCount());
    }
}
