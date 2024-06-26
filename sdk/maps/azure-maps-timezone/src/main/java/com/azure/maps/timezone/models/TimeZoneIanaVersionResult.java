// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.timezone.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This object is returned from a successful Timezone IANA Version call. */
@Immutable
public final class TimeZoneIanaVersionResult {
    /*
     * Version property
     */
    @JsonProperty(value = "Version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /** Set default TimeZoneIanaVersionResult constructor to private */
    private TimeZoneIanaVersionResult() {}

    /**
     * Get the version property: Version property.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }
}
