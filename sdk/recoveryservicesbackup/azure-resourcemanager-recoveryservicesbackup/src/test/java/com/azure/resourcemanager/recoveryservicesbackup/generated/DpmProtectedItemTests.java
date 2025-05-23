// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.CreateMode;
import com.azure.resourcemanager.recoveryservicesbackup.models.DpmProtectedItem;
import com.azure.resourcemanager.recoveryservicesbackup.models.DpmProtectedItemExtendedInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectedItemState;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DpmProtectedItemTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DpmProtectedItem model = BinaryData.fromString(
            "{\"protectedItemType\":\"DPMProtectedItem\",\"friendlyName\":\"kwfbkgo\",\"backupEngineName\":\"wopdbydpiz\",\"protectionState\":\"BackupsSuspended\",\"extendedInfo\":{\"protectableObjectLoadPath\":{\"fcttuxuuyilfl\":\"pxbiygnugjknfs\",\"jztczytqj\":\"oiquvrehmrnjhvs\"},\"protected\":false,\"isPresentOnCloud\":true,\"lastBackupStatus\":\"nfprnjletlxs\",\"lastRefreshedAt\":\"2021-08-25T23:38:29Z\",\"oldestRecoveryPoint\":\"2021-01-20T22:12:31Z\",\"recoveryPointCount\":2070557844,\"onPremiseOldestRecoveryPoint\":\"2021-04-29T17:32:24Z\",\"onPremiseLatestRecoveryPoint\":\"2021-06-14T11:53:50Z\",\"onPremiseRecoveryPointCount\":1329774917,\"isCollocated\":false,\"protectionGroupName\":\"yn\",\"diskStorageUsedInBytes\":\"lqwzdvpiwhxqsz\",\"totalDiskStorageSizeInBytes\":\"maajquhuxylr\"},\"backupManagementType\":\"AzureWorkload\",\"workloadType\":\"SAPHanaDatabase\",\"containerName\":\"jbmzyospspsh\",\"sourceResourceId\":\"fkyjpmspbpssdfpp\",\"policyId\":\"gt\",\"lastRecoveryPoint\":\"2021-10-15T21:25:34Z\",\"backupSetName\":\"jtvczkcnyxrxmun\",\"createMode\":\"Default\",\"deferredDeleteTimeInUTC\":\"2021-10-31T10:07:09Z\",\"isScheduledForDeferredDelete\":true,\"deferredDeleteTimeRemaining\":\"vxlx\",\"isDeferredDeleteScheduleUpcoming\":true,\"isRehydrate\":true,\"resourceGuardOperationRequests\":[\"bgkc\",\"khpzvuqdflv\",\"niypfpubcpzg\"],\"isArchiveEnabled\":true,\"policyName\":\"vhjknidi\",\"softDeleteRetentionPeriodInDays\":1404757265,\"vaultId\":\"xgpnr\"}")
            .toObject(DpmProtectedItem.class);
        Assertions.assertEquals("jbmzyospspsh", model.containerName());
        Assertions.assertEquals("fkyjpmspbpssdfpp", model.sourceResourceId());
        Assertions.assertEquals("gt", model.policyId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-15T21:25:34Z"), model.lastRecoveryPoint());
        Assertions.assertEquals("jtvczkcnyxrxmun", model.backupSetName());
        Assertions.assertEquals(CreateMode.DEFAULT, model.createMode());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-31T10:07:09Z"), model.deferredDeleteTimeInUtc());
        Assertions.assertEquals(true, model.isScheduledForDeferredDelete());
        Assertions.assertEquals("vxlx", model.deferredDeleteTimeRemaining());
        Assertions.assertEquals(true, model.isDeferredDeleteScheduleUpcoming());
        Assertions.assertEquals(true, model.isRehydrate());
        Assertions.assertEquals("bgkc", model.resourceGuardOperationRequests().get(0));
        Assertions.assertEquals(true, model.isArchiveEnabled());
        Assertions.assertEquals("vhjknidi", model.policyName());
        Assertions.assertEquals(1404757265, model.softDeleteRetentionPeriod());
        Assertions.assertEquals("kwfbkgo", model.friendlyName());
        Assertions.assertEquals("wopdbydpiz", model.backupEngineName());
        Assertions.assertEquals(ProtectedItemState.BACKUPS_SUSPENDED, model.protectionState());
        Assertions.assertEquals("pxbiygnugjknfs",
            model.extendedInfo().protectableObjectLoadPath().get("fcttuxuuyilfl"));
        Assertions.assertEquals(false, model.extendedInfo().protectedProperty());
        Assertions.assertEquals(true, model.extendedInfo().isPresentOnCloud());
        Assertions.assertEquals("nfprnjletlxs", model.extendedInfo().lastBackupStatus());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-25T23:38:29Z"), model.extendedInfo().lastRefreshedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-20T22:12:31Z"),
            model.extendedInfo().oldestRecoveryPoint());
        Assertions.assertEquals(2070557844, model.extendedInfo().recoveryPointCount());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-29T17:32:24Z"),
            model.extendedInfo().onPremiseOldestRecoveryPoint());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-14T11:53:50Z"),
            model.extendedInfo().onPremiseLatestRecoveryPoint());
        Assertions.assertEquals(1329774917, model.extendedInfo().onPremiseRecoveryPointCount());
        Assertions.assertEquals(false, model.extendedInfo().isCollocated());
        Assertions.assertEquals("yn", model.extendedInfo().protectionGroupName());
        Assertions.assertEquals("lqwzdvpiwhxqsz", model.extendedInfo().diskStorageUsedInBytes());
        Assertions.assertEquals("maajquhuxylr", model.extendedInfo().totalDiskStorageSizeInBytes());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DpmProtectedItem model = new DpmProtectedItem().withContainerName("jbmzyospspsh")
            .withSourceResourceId("fkyjpmspbpssdfpp")
            .withPolicyId("gt")
            .withLastRecoveryPoint(OffsetDateTime.parse("2021-10-15T21:25:34Z"))
            .withBackupSetName("jtvczkcnyxrxmun")
            .withCreateMode(CreateMode.DEFAULT)
            .withDeferredDeleteTimeInUtc(OffsetDateTime.parse("2021-10-31T10:07:09Z"))
            .withIsScheduledForDeferredDelete(true)
            .withDeferredDeleteTimeRemaining("vxlx")
            .withIsDeferredDeleteScheduleUpcoming(true)
            .withIsRehydrate(true)
            .withResourceGuardOperationRequests(Arrays.asList("bgkc", "khpzvuqdflv", "niypfpubcpzg"))
            .withIsArchiveEnabled(true)
            .withPolicyName("vhjknidi")
            .withSoftDeleteRetentionPeriod(1404757265)
            .withFriendlyName("kwfbkgo")
            .withBackupEngineName("wopdbydpiz")
            .withProtectionState(ProtectedItemState.BACKUPS_SUSPENDED)
            .withExtendedInfo(new DpmProtectedItemExtendedInfo()
                .withProtectableObjectLoadPath(mapOf("fcttuxuuyilfl", "pxbiygnugjknfs", "jztczytqj", "oiquvrehmrnjhvs"))
                .withProtectedProperty(false)
                .withIsPresentOnCloud(true)
                .withLastBackupStatus("nfprnjletlxs")
                .withLastRefreshedAt(OffsetDateTime.parse("2021-08-25T23:38:29Z"))
                .withOldestRecoveryPoint(OffsetDateTime.parse("2021-01-20T22:12:31Z"))
                .withRecoveryPointCount(2070557844)
                .withOnPremiseOldestRecoveryPoint(OffsetDateTime.parse("2021-04-29T17:32:24Z"))
                .withOnPremiseLatestRecoveryPoint(OffsetDateTime.parse("2021-06-14T11:53:50Z"))
                .withOnPremiseRecoveryPointCount(1329774917)
                .withIsCollocated(false)
                .withProtectionGroupName("yn")
                .withDiskStorageUsedInBytes("lqwzdvpiwhxqsz")
                .withTotalDiskStorageSizeInBytes("maajquhuxylr"));
        model = BinaryData.fromObject(model).toObject(DpmProtectedItem.class);
        Assertions.assertEquals("jbmzyospspsh", model.containerName());
        Assertions.assertEquals("fkyjpmspbpssdfpp", model.sourceResourceId());
        Assertions.assertEquals("gt", model.policyId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-15T21:25:34Z"), model.lastRecoveryPoint());
        Assertions.assertEquals("jtvczkcnyxrxmun", model.backupSetName());
        Assertions.assertEquals(CreateMode.DEFAULT, model.createMode());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-31T10:07:09Z"), model.deferredDeleteTimeInUtc());
        Assertions.assertEquals(true, model.isScheduledForDeferredDelete());
        Assertions.assertEquals("vxlx", model.deferredDeleteTimeRemaining());
        Assertions.assertEquals(true, model.isDeferredDeleteScheduleUpcoming());
        Assertions.assertEquals(true, model.isRehydrate());
        Assertions.assertEquals("bgkc", model.resourceGuardOperationRequests().get(0));
        Assertions.assertEquals(true, model.isArchiveEnabled());
        Assertions.assertEquals("vhjknidi", model.policyName());
        Assertions.assertEquals(1404757265, model.softDeleteRetentionPeriod());
        Assertions.assertEquals("kwfbkgo", model.friendlyName());
        Assertions.assertEquals("wopdbydpiz", model.backupEngineName());
        Assertions.assertEquals(ProtectedItemState.BACKUPS_SUSPENDED, model.protectionState());
        Assertions.assertEquals("pxbiygnugjknfs",
            model.extendedInfo().protectableObjectLoadPath().get("fcttuxuuyilfl"));
        Assertions.assertEquals(false, model.extendedInfo().protectedProperty());
        Assertions.assertEquals(true, model.extendedInfo().isPresentOnCloud());
        Assertions.assertEquals("nfprnjletlxs", model.extendedInfo().lastBackupStatus());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-25T23:38:29Z"), model.extendedInfo().lastRefreshedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-20T22:12:31Z"),
            model.extendedInfo().oldestRecoveryPoint());
        Assertions.assertEquals(2070557844, model.extendedInfo().recoveryPointCount());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-29T17:32:24Z"),
            model.extendedInfo().onPremiseOldestRecoveryPoint());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-14T11:53:50Z"),
            model.extendedInfo().onPremiseLatestRecoveryPoint());
        Assertions.assertEquals(1329774917, model.extendedInfo().onPremiseRecoveryPointCount());
        Assertions.assertEquals(false, model.extendedInfo().isCollocated());
        Assertions.assertEquals("yn", model.extendedInfo().protectionGroupName());
        Assertions.assertEquals("lqwzdvpiwhxqsz", model.extendedInfo().diskStorageUsedInBytes());
        Assertions.assertEquals("maajquhuxylr", model.extendedInfo().totalDiskStorageSizeInBytes());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
