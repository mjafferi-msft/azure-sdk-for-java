// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.DailyRetentionSchedule;
import com.azure.resourcemanager.recoveryservicesbackup.models.RetentionDuration;
import com.azure.resourcemanager.recoveryservicesbackup.models.RetentionDurationType;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DailyRetentionScheduleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DailyRetentionSchedule model = BinaryData.fromString(
            "{\"retentionTimes\":[\"2021-10-14T17:32:27Z\"],\"retentionDuration\":{\"count\":139843072,\"durationType\":\"Invalid\"}}")
            .toObject(DailyRetentionSchedule.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-14T17:32:27Z"), model.retentionTimes().get(0));
        Assertions.assertEquals(139843072, model.retentionDuration().count());
        Assertions.assertEquals(RetentionDurationType.INVALID, model.retentionDuration().durationType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DailyRetentionSchedule model = new DailyRetentionSchedule()
            .withRetentionTimes(Arrays.asList(OffsetDateTime.parse("2021-10-14T17:32:27Z")))
            .withRetentionDuration(
                new RetentionDuration().withCount(139843072).withDurationType(RetentionDurationType.INVALID));
        model = BinaryData.fromObject(model).toObject(DailyRetentionSchedule.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-14T17:32:27Z"), model.retentionTimes().get(0));
        Assertions.assertEquals(139843072, model.retentionDuration().count());
        Assertions.assertEquals(RetentionDurationType.INVALID, model.retentionDuration().durationType());
    }
}
