// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AmazonS3CompatibleReadSettings;

public final class AmazonS3CompatibleReadSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AmazonS3CompatibleReadSettings model = BinaryData.fromString(
            "{\"type\":\"AmazonS3CompatibleReadSettings\",\"recursive\":\"datakf\",\"wildcardFolderPath\":\"dataauihnb\",\"wildcardFileName\":\"datahkdwyehqnxuffgj\",\"prefix\":\"dataminhvdkqigppdqsq\",\"fileListPath\":\"datap\",\"enablePartitionDiscovery\":\"dataaxthuhuruo\",\"partitionRootPath\":\"datayotapstkdbn\",\"deleteFilesAfterCompletion\":\"datapcuzexoymfku\",\"modifiedDatetimeStart\":\"dataysgsqzpgrvf\",\"modifiedDatetimeEnd\":\"datayph\",\"maxConcurrentConnections\":\"datarxrpahp\",\"disableMetricsCollection\":\"dataikfenmiflkyf\",\"\":{\"tablilyoomgse\":\"dataolnxhsupilh\",\"kluqf\":\"dataisydhardx\",\"ierxu\":\"datafglftlqa\"}}")
            .toObject(AmazonS3CompatibleReadSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AmazonS3CompatibleReadSettings model = new AmazonS3CompatibleReadSettings()
            .withMaxConcurrentConnections("datarxrpahp").withDisableMetricsCollection("dataikfenmiflkyf")
            .withRecursive("datakf").withWildcardFolderPath("dataauihnb").withWildcardFileName("datahkdwyehqnxuffgj")
            .withPrefix("dataminhvdkqigppdqsq").withFileListPath("datap").withEnablePartitionDiscovery("dataaxthuhuruo")
            .withPartitionRootPath("datayotapstkdbn").withDeleteFilesAfterCompletion("datapcuzexoymfku")
            .withModifiedDatetimeStart("dataysgsqzpgrvf").withModifiedDatetimeEnd("datayph");
        model = BinaryData.fromObject(model).toObject(AmazonS3CompatibleReadSettings.class);
    }
}
