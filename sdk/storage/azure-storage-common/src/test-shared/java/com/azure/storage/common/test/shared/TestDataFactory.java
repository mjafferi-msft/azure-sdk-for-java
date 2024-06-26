// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.common.test.shared;

import com.azure.core.util.BinaryData;
import reactor.core.publisher.Flux;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public final class TestDataFactory {
    private static final TestDataFactory INSTANCE = new TestDataFactory();

    private final String defaultText;
    private final byte[] defaultBytes;
    private final BinaryData defaultBinaryData;
    private final Path defaultFile;

    private TestDataFactory() {
        defaultText = "default";
        defaultBytes = defaultText.getBytes(StandardCharsets.UTF_8);
        defaultBinaryData = BinaryData.fromString(defaultText);
        try {
            defaultFile = Files.createTempFile("storage-default-file", null);
            defaultFile.toFile().deleteOnExit();
            Files.write(defaultFile, defaultBytes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static TestDataFactory getInstance() {
        return INSTANCE;
    }

    public String getDefaultText() {
        return defaultText;
    }

    public byte[] getDefaultBytes() {
        return Arrays.copyOf(defaultBytes, defaultBytes.length);
    }

    public ByteBuffer getDefaultData() {
        return ByteBuffer.wrap(defaultBytes).asReadOnlyBuffer();
    }

    public InputStream getDefaultInputStream() {
        return new ByteArrayInputStream(defaultBytes);
    }

    public BinaryData getDefaultBinaryData() {
        return defaultBinaryData;
    }

    public int getDefaultDataSize() {
        return defaultBytes.length;
    }

    public long getDefaultDataSizeLong() {
        return defaultBytes.length;
    }

    public Flux<ByteBuffer> getDefaultFlux() {
        return Flux.just(getDefaultData());
    }

    public Path getDefaultFile() {
        return defaultFile;
    }
}
