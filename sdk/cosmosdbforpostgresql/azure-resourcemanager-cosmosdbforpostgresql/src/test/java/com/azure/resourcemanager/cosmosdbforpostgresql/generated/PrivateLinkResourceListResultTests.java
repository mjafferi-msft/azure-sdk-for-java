// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmosdbforpostgresql.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cosmosdbforpostgresql.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.PrivateLinkResourceListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PrivateLinkResourceListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkResourceListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"groupId\":\"ovplw\",\"requiredMembers\":[\"vgyuguos\",\"mkfssxqukkfplgm\",\"sxnkjzkdeslpvlo\"],\"requiredZoneNames\":[\"yighxpk\"]},\"id\":\"zb\",\"name\":\"iuebbaumny\",\"type\":\"upedeojnabckhs\"},{\"properties\":{\"groupId\":\"psiebtfhvpes\",\"requiredMembers\":[\"krdqmh\",\"jdhtldwkyzxu\",\"tkncwsc\"],\"requiredZoneNames\":[\"lxotogtwrupq\",\"xvnmicykvceov\",\"ilovnot\",\"fj\"]},\"id\":\"njbkcnxdhbttkph\",\"name\":\"wpn\",\"type\":\"jtoqne\"}]}")
            .toObject(PrivateLinkResourceListResult.class);
        Assertions.assertEquals("yighxpk", model.value().get(0).requiredZoneNames().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateLinkResourceListResult model = new PrivateLinkResourceListResult()
            .withValue(Arrays.asList(new PrivateLinkResourceInner().withRequiredZoneNames(Arrays.asList("yighxpk")),
                new PrivateLinkResourceInner()
                    .withRequiredZoneNames(Arrays.asList("lxotogtwrupq", "xvnmicykvceov", "ilovnot", "fj"))));
        model = BinaryData.fromObject(model).toObject(PrivateLinkResourceListResult.class);
        Assertions.assertEquals("yighxpk", model.value().get(0).requiredZoneNames().get(0));
    }
}
