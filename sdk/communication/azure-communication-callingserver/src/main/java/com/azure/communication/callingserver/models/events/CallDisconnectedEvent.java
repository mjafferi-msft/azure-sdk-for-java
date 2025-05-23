// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.callingserver.models.events;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;

import java.io.IOException;

/** The CallDisconnectedEvent model. */
@Immutable
public final class CallDisconnectedEvent extends CallAutomationEventBase {
    private CallDisconnectedEvent() {
        super();
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        return toJsonShared(jsonWriter.writeStartObject()).writeEndObject();
    }

    /**
     * Reads an instance of {@link CallDisconnectedEvent} from the {@link JsonReader}.
     *
     * @param jsonReader The {@link JsonReader} to read from.
     * @return An instance of {@link CallDisconnectedEvent}, or null if the {@link JsonReader} was pointing to
     * {@link JsonToken#NULL}.
     * @throws IOException If an error occurs while reading the {@link JsonReader}.
     */
    public static CallDisconnectedEvent fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CallDisconnectedEvent event = new CallDisconnectedEvent();

            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if (!fromJsonShared(event, fieldName, reader)) {
                    reader.skipChildren();
                }
            }

            return event;
        });
    }
}
