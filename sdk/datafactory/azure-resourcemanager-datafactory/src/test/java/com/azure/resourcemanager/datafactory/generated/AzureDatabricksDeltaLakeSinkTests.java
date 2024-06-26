// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureDatabricksDeltaLakeImportCommand;
import com.azure.resourcemanager.datafactory.models.AzureDatabricksDeltaLakeSink;

public final class AzureDatabricksDeltaLakeSinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureDatabricksDeltaLakeSink model = BinaryData.fromString(
            "{\"type\":\"AzureDatabricksDeltaLakeSink\",\"preCopyScript\":\"dataxpqrkeyhj\",\"importSettings\":{\"type\":\"AzureDatabricksDeltaLakeImportCommand\",\"dateFormat\":\"datazkbrvta\",\"timestampFormat\":\"datahtqvt\",\"\":{\"qjjxhijb\":\"datadijcndwoyqvc\",\"vpd\":\"dataiyuhoxul\",\"mphyacdhjmpnv\":\"datairhg\",\"hljtkuyvytfuq\":\"datakxs\"}},\"writeBatchSize\":\"datatqbxpy\",\"writeBatchTimeout\":\"datawkjeitkfhzv\",\"sinkRetryCount\":\"datandbklscoka\",\"sinkRetryWait\":\"dataqqipvnvdzssss\",\"maxConcurrentConnections\":\"datagh\",\"disableMetricsCollection\":\"datadqkotxodbxzh\",\"\":{\"yy\":\"datawjnnoot\"}}")
            .toObject(AzureDatabricksDeltaLakeSink.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureDatabricksDeltaLakeSink model = new AzureDatabricksDeltaLakeSink().withWriteBatchSize("datatqbxpy")
            .withWriteBatchTimeout("datawkjeitkfhzv").withSinkRetryCount("datandbklscoka")
            .withSinkRetryWait("dataqqipvnvdzssss").withMaxConcurrentConnections("datagh")
            .withDisableMetricsCollection("datadqkotxodbxzh").withPreCopyScript("dataxpqrkeyhj")
            .withImportSettings(new AzureDatabricksDeltaLakeImportCommand().withDateFormat("datazkbrvta")
                .withTimestampFormat("datahtqvt"));
        model = BinaryData.fromObject(model).toObject(AzureDatabricksDeltaLakeSink.class);
    }
}
