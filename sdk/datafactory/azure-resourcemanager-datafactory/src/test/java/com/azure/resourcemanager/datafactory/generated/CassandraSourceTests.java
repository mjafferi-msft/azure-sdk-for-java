// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.CassandraSource;
import com.azure.resourcemanager.datafactory.models.CassandraSourceReadConsistencyLevels;
import org.junit.jupiter.api.Assertions;

public final class CassandraSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CassandraSource model = BinaryData.fromString(
            "{\"type\":\"CassandraSource\",\"query\":\"databymnfctorqzb\",\"consistencyLevel\":\"SERIAL\",\"queryTimeout\":\"datafqqrarolc\",\"additionalColumns\":\"datahbynlbwcnn\",\"sourceRetryCount\":\"datafgstdifbyfjsl\",\"sourceRetryWait\":\"datagee\",\"maxConcurrentConnections\":\"datasoj\",\"disableMetricsCollection\":\"dataarliig\",\"\":{\"xuuqcmunh\":\"dataqvidsjhx\"}}")
            .toObject(CassandraSource.class);
        Assertions.assertEquals(CassandraSourceReadConsistencyLevels.SERIAL, model.consistencyLevel());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CassandraSource model
            = new CassandraSource().withSourceRetryCount("datafgstdifbyfjsl").withSourceRetryWait("datagee")
                .withMaxConcurrentConnections("datasoj").withDisableMetricsCollection("dataarliig")
                .withQueryTimeout("datafqqrarolc").withAdditionalColumns("datahbynlbwcnn").withQuery("databymnfctorqzb")
                .withConsistencyLevel(CassandraSourceReadConsistencyLevels.SERIAL);
        model = BinaryData.fromObject(model).toObject(CassandraSource.class);
        Assertions.assertEquals(CassandraSourceReadConsistencyLevels.SERIAL, model.consistencyLevel());
    }
}
