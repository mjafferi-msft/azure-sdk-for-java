// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.DayOfWeek;
import com.azure.resourcemanager.recoveryservicesbackup.models.WeekOfMonth;
import com.azure.resourcemanager.recoveryservicesbackup.models.WeeklyRetentionFormat;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class WeeklyRetentionFormatTests {
    @Test
    public void testDeserialize() {
        WeeklyRetentionFormat model =
            BinaryData
                .fromString("{\"daysOfTheWeek\":[\"Friday\"],\"weeksOfTheMonth\":[\"Last\"]}")
                .toObject(WeeklyRetentionFormat.class);
        Assertions.assertEquals(DayOfWeek.FRIDAY, model.daysOfTheWeek().get(0));
        Assertions.assertEquals(WeekOfMonth.LAST, model.weeksOfTheMonth().get(0));
    }

    @Test
    public void testSerialize() {
        WeeklyRetentionFormat model =
            new WeeklyRetentionFormat()
                .withDaysOfTheWeek(Arrays.asList(DayOfWeek.FRIDAY))
                .withWeeksOfTheMonth(Arrays.asList(WeekOfMonth.LAST));
        model = BinaryData.fromObject(model).toObject(WeeklyRetentionFormat.class);
        Assertions.assertEquals(DayOfWeek.FRIDAY, model.daysOfTheWeek().get(0));
        Assertions.assertEquals(WeekOfMonth.LAST, model.weeksOfTheMonth().get(0));
    }
}