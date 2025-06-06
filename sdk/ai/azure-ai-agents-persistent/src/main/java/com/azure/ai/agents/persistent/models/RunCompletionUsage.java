// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.agents.persistent.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Usage statistics related to the run. This value will be `null` if the run is not in a terminal state (i.e.
 * `in_progress`, `queued`, etc.).
 */
@Immutable
public final class RunCompletionUsage implements JsonSerializable<RunCompletionUsage> {

    /*
     * Number of completion tokens used over the course of the run.
     */
    @Generated
    private final long completionTokens;

    /*
     * Number of prompt tokens used over the course of the run.
     */
    @Generated
    private final long promptTokens;

    /*
     * Total number of tokens used (prompt + completion).
     */
    @Generated
    private final long totalTokens;

    /**
     * Creates an instance of RunCompletionUsage class.
     *
     * @param completionTokens the completionTokens value to set.
     * @param promptTokens the promptTokens value to set.
     * @param totalTokens the totalTokens value to set.
     */
    @Generated
    private RunCompletionUsage(long completionTokens, long promptTokens, long totalTokens) {
        this.completionTokens = completionTokens;
        this.promptTokens = promptTokens;
        this.totalTokens = totalTokens;
    }

    /**
     * Get the completionTokens property: Number of completion tokens used over the course of the run.
     *
     * @return the completionTokens value.
     */
    @Generated
    public long getCompletionTokens() {
        return this.completionTokens;
    }

    /**
     * Get the promptTokens property: Number of prompt tokens used over the course of the run.
     *
     * @return the promptTokens value.
     */
    @Generated
    public long getPromptTokens() {
        return this.promptTokens;
    }

    /**
     * Get the totalTokens property: Total number of tokens used (prompt + completion).
     *
     * @return the totalTokens value.
     */
    @Generated
    public long getTotalTokens() {
        return this.totalTokens;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeLongField("completion_tokens", this.completionTokens);
        jsonWriter.writeLongField("prompt_tokens", this.promptTokens);
        jsonWriter.writeLongField("total_tokens", this.totalTokens);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RunCompletionUsage from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of RunCompletionUsage if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RunCompletionUsage.
     */
    @Generated
    public static RunCompletionUsage fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            long completionTokens = 0L;
            long promptTokens = 0L;
            long totalTokens = 0L;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("completion_tokens".equals(fieldName)) {
                    completionTokens = reader.getLong();
                } else if ("prompt_tokens".equals(fieldName)) {
                    promptTokens = reader.getLong();
                } else if ("total_tokens".equals(fieldName)) {
                    totalTokens = reader.getLong();
                } else {
                    reader.skipChildren();
                }
            }
            return new RunCompletionUsage(completionTokens, promptTokens, totalTokens);
        });
    }
}
