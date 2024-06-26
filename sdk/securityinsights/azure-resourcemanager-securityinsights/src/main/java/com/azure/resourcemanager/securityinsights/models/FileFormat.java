// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The format of the file. */
public final class FileFormat extends ExpandableStringEnum<FileFormat> {
    /** Static value CSV for FileFormat. */
    public static final FileFormat CSV = fromString("CSV");

    /** Static value JSON for FileFormat. */
    public static final FileFormat JSON = fromString("JSON");

    /** Static value Unspecified for FileFormat. */
    public static final FileFormat UNSPECIFIED = fromString("Unspecified");

    /**
     * Creates or finds a FileFormat from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FileFormat.
     */
    @JsonCreator
    public static FileFormat fromString(String name) {
        return fromString(name, FileFormat.class);
    }

    /**
     * Gets known FileFormat values.
     *
     * @return known FileFormat values.
     */
    public static Collection<FileFormat> values() {
        return values(FileFormat.class);
    }
}
