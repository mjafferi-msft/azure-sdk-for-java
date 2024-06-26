// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.fluent.models.PartnerTopicProperties;
import com.azure.resourcemanager.eventgrid.models.EventDefinitionKind;
import com.azure.resourcemanager.eventgrid.models.EventTypeInfo;
import com.azure.resourcemanager.eventgrid.models.InlineEventProperties;
import com.azure.resourcemanager.eventgrid.models.PartnerTopicActivationState;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;

public final class PartnerTopicPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PartnerTopicProperties model = BinaryData.fromString(
            "{\"partnerRegistrationImmutableId\":\"9757d065-c901-4ee4-aa3c-6770a25a8ea0\",\"source\":\"bzqgqqi\",\"eventTypeInfo\":{\"kind\":\"Inline\",\"inlineEventTypes\":{\"pcvhdbevwqqxeys\":{\"description\":\"thmkyib\",\"displayName\":\"sihsgqcwdhohsd\",\"documentationUrl\":\"cdzsu\",\"dataSchemaUrl\":\"ohdxbzlmcmu\"},\"ygvkzqkjj\":{\"description\":\"nqzi\",\"displayName\":\"fkbg\",\"documentationUrl\":\"bowxe\",\"dataSchemaUrl\":\"clj\"}}},\"expirationTimeIfNotActivatedUtc\":\"2021-09-05T08:47Z\",\"provisioningState\":\"Failed\",\"activationState\":\"NeverActivated\",\"partnerTopicFriendlyDescription\":\"zrxcczurt\",\"messageForActivation\":\"ipqxbkwvzgnzv\"}")
            .toObject(PartnerTopicProperties.class);
        Assertions.assertEquals(UUID.fromString("9757d065-c901-4ee4-aa3c-6770a25a8ea0"),
            model.partnerRegistrationImmutableId());
        Assertions.assertEquals("bzqgqqi", model.source());
        Assertions.assertEquals(EventDefinitionKind.INLINE, model.eventTypeInfo().kind());
        Assertions.assertEquals("thmkyib",
            model.eventTypeInfo().inlineEventTypes().get("pcvhdbevwqqxeys").description());
        Assertions.assertEquals("sihsgqcwdhohsd",
            model.eventTypeInfo().inlineEventTypes().get("pcvhdbevwqqxeys").displayName());
        Assertions.assertEquals("cdzsu",
            model.eventTypeInfo().inlineEventTypes().get("pcvhdbevwqqxeys").documentationUrl());
        Assertions.assertEquals("ohdxbzlmcmu",
            model.eventTypeInfo().inlineEventTypes().get("pcvhdbevwqqxeys").dataSchemaUrl());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-05T08:47Z"), model.expirationTimeIfNotActivatedUtc());
        Assertions.assertEquals(PartnerTopicActivationState.NEVER_ACTIVATED, model.activationState());
        Assertions.assertEquals("zrxcczurt", model.partnerTopicFriendlyDescription());
        Assertions.assertEquals("ipqxbkwvzgnzv", model.messageForActivation());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PartnerTopicProperties model = new PartnerTopicProperties()
            .withPartnerRegistrationImmutableId(UUID.fromString("9757d065-c901-4ee4-aa3c-6770a25a8ea0"))
            .withSource("bzqgqqi")
            .withEventTypeInfo(new EventTypeInfo().withKind(EventDefinitionKind.INLINE)
                .withInlineEventTypes(mapOf("pcvhdbevwqqxeys", new InlineEventProperties().withDescription("thmkyib")
                    .withDisplayName("sihsgqcwdhohsd").withDocumentationUrl("cdzsu").withDataSchemaUrl("ohdxbzlmcmu"),
                    "ygvkzqkjj",
                    new InlineEventProperties().withDescription("nqzi").withDisplayName("fkbg")
                        .withDocumentationUrl("bowxe").withDataSchemaUrl("clj"))))
            .withExpirationTimeIfNotActivatedUtc(OffsetDateTime.parse("2021-09-05T08:47Z"))
            .withActivationState(PartnerTopicActivationState.NEVER_ACTIVATED)
            .withPartnerTopicFriendlyDescription("zrxcczurt").withMessageForActivation("ipqxbkwvzgnzv");
        model = BinaryData.fromObject(model).toObject(PartnerTopicProperties.class);
        Assertions.assertEquals(UUID.fromString("9757d065-c901-4ee4-aa3c-6770a25a8ea0"),
            model.partnerRegistrationImmutableId());
        Assertions.assertEquals("bzqgqqi", model.source());
        Assertions.assertEquals(EventDefinitionKind.INLINE, model.eventTypeInfo().kind());
        Assertions.assertEquals("thmkyib",
            model.eventTypeInfo().inlineEventTypes().get("pcvhdbevwqqxeys").description());
        Assertions.assertEquals("sihsgqcwdhohsd",
            model.eventTypeInfo().inlineEventTypes().get("pcvhdbevwqqxeys").displayName());
        Assertions.assertEquals("cdzsu",
            model.eventTypeInfo().inlineEventTypes().get("pcvhdbevwqqxeys").documentationUrl());
        Assertions.assertEquals("ohdxbzlmcmu",
            model.eventTypeInfo().inlineEventTypes().get("pcvhdbevwqqxeys").dataSchemaUrl());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-05T08:47Z"), model.expirationTimeIfNotActivatedUtc());
        Assertions.assertEquals(PartnerTopicActivationState.NEVER_ACTIVATED, model.activationState());
        Assertions.assertEquals("zrxcczurt", model.partnerTopicFriendlyDescription());
        Assertions.assertEquals("ipqxbkwvzgnzv", model.messageForActivation());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
