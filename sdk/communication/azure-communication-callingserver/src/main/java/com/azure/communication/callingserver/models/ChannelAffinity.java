// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.models;

import com.azure.communication.callingserver.implementation.converters.CommunicationIdentifierConverter;
import com.azure.communication.callingserver.implementation.models.CommunicationIdentifierModel;
import com.azure.communication.common.CommunicationIdentifier;
import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;

import java.io.IOException;

/** Channel affinity for a participant. */
@Fluent
public final class ChannelAffinity implements JsonSerializable<ChannelAffinity> {
    /*
     * Channel number to which bitstream from a particular participant will be written.
     */
    private final Integer channel;

    /*
     * The identifier for the participant whose bitstream will be written to the channel represented by the channel
     * number.
     */
    private final CommunicationIdentifier participant;

    /**
     * Constructor
     *
     * @param channel Either a {@link GroupCallLocator} or {@link ServerCallLocator} for locating the call.
     * @param participant Either a {@link GroupCallLocator} or {@link ServerCallLocator} for locating the call.
     */
    public ChannelAffinity(Integer channel, CommunicationIdentifier participant) {
        this.channel = channel;
        this.participant = participant;
    }

    /**
     * Get the channel property: Channel number to which bitstream from a particular participant will be written.
     *
     * @return the channel value.
     */
    public Integer getChannel() {
        return this.channel;
    }

    /**
     * Get the participant property: The identifier for the participant whose bitstream will be written to the channel
     * represented by the channel number.
     *
     * @return the participant value.
     */
    public CommunicationIdentifier getParticipant() {
        return this.participant;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        return jsonWriter.writeStartObject()
            .writeNumberField("channel", channel)
            .writeJsonField("participant", CommunicationIdentifierConverter.convert(participant))
            .writeEndObject();
    }

    /**
     * Reads an instance of {@link ChannelAffinity} from the {@link JsonReader}.
     *
     * @param jsonReader The {@link JsonReader} to read.
     * @return An instance of {@link ChannelAffinity}, or null if the {@link JsonReader} was pointing to
     * {@link JsonToken#NULL}.
     * @throws IOException If an error occurs while reading the {@link JsonReader}.
     */
    public static ChannelAffinity fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Integer channel = null;
            CommunicationIdentifier participant = null;

            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("channel".equals(fieldName)) {
                    channel = reader.getNullable(JsonReader::getInt);
                } else if ("participant".equals(fieldName)) {
                    participant
                        = CommunicationIdentifierConverter.convert(CommunicationIdentifierModel.fromJson(reader));
                } else {
                    reader.skipChildren();
                }
            }

            return new ChannelAffinity(channel, participant);
        });
    }
}
