// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.FileServerLocation;

public final class FileServerLocationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FileServerLocation model = BinaryData.fromString(
            "{\"type\":\"FileServerLocation\",\"folderPath\":\"datavwdtgckzdqiqdl\",\"fileName\":\"datatrkwxo\",\"\":{\"lglh\":\"dataxsuykznhrfg\",\"f\":\"datary\"}}")
            .toObject(FileServerLocation.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FileServerLocation model
            = new FileServerLocation().withFolderPath("datavwdtgckzdqiqdl").withFileName("datatrkwxo");
        model = BinaryData.fromObject(model).toObject(FileServerLocation.class);
    }
}
