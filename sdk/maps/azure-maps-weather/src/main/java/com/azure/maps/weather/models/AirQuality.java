// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.weather.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Information about the air quality in a specific location at a specific time. */
@Fluent
public final class AirQuality {
    /*
     * Date and time of the current observation displayed in ISO 8601 format, for example, 2019-10-27T19:39:57-08:00.
     */
    @JsonProperty(value = "dateTime")
    private OffsetDateTime timestamp;

    /*
     * Air quality rating on a scale set by local regulating bodies. Scales can vary widely based on location. See
     * [Wikipedia](https://en.wikipedia.org/wiki/Air_quality_index) for more information.
     */
    @JsonProperty(value = "index")
    private Float index;

    /*
     * Internationally normalized air quality rating on a scale from 0 to 300 and up, with higher numbers representing
     * worse air quality.
     */
    @JsonProperty(value = "globalIndex")
    private Float globalIndex;

    /*
     * The pollutant with the highest concentration.
     */
    @JsonProperty(value = "dominantPollutant")
    private DominantPollutant dominantPollutant;

    /*
     * One-word description of the air quality in the requested language. For example, "Excellent".
     */
    @JsonProperty(value = "category")
    private String category;

    /*
     * A unique color corresponding to the category of this air quality result.
     */
    @JsonProperty(value = "categoryColor")
    private String categoryColor;

    /*
     * A textual explanation of this air quality result in the requested language.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Information about individual pollutants.
     */
    @JsonProperty(value = "pollutants")
    private List<Pollutant> pollutants;

    /** Set default AirQuality constructor to private */
    private AirQuality() {}

    /**
     * Get the timestamp property: Date and time of the current observation displayed in ISO 8601 format, for example,
     * 2019-10-27T19:39:57-08:00.
     *
     * @return the timestamp value.
     */
    public OffsetDateTime getTimestamp() {
        return this.timestamp;
    }

    /**
     * Get the index property: Air quality rating on a scale set by local regulating bodies. Scales can vary widely
     * based on location. See [Wikipedia](https://en.wikipedia.org/wiki/Air_quality_index) for more information.
     *
     * @return the index value.
     */
    public Float getIndex() {
        return this.index;
    }

    /**
     * Get the globalIndex property: Internationally normalized air quality rating on a scale from 0 to 300 and up, with
     * higher numbers representing worse air quality.
     *
     * @return the globalIndex value.
     */
    public Float getGlobalIndex() {
        return this.globalIndex;
    }

    /**
     * Get the dominantPollutant property: The pollutant with the highest concentration.
     *
     * @return the dominantPollutant value.
     */
    public DominantPollutant getDominantPollutant() {
        return this.dominantPollutant;
    }

    /**
     * Get the category property: One-word description of the air quality in the requested language. For example,
     * "Excellent".
     *
     * @return the category value.
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * Get the categoryColor property: A unique color corresponding to the category of this air quality result.
     *
     * @return the categoryColor value.
     */
    public String getCategoryColor() {
        return this.categoryColor;
    }

    /**
     * Get the description property: A textual explanation of this air quality result in the requested language.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Get the pollutants property: Information about individual pollutants.
     *
     * @return the pollutants value.
     */
    public List<Pollutant> getPollutants() {
        return this.pollutants;
    }
}
