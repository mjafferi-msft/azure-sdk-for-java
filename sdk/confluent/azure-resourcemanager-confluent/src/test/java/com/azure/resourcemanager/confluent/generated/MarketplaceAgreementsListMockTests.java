// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.confluent.ConfluentManager;
import com.azure.resourcemanager.confluent.models.ConfluentAgreementResource;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class MarketplaceAgreementsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"publisher\":\"bth\",\"product\":\"tgk\",\"plan\":\"tvdxeclzedqb\",\"licenseTextLink\":\"hzlhplodqkdlww\",\"privacyPolicyLink\":\"bum\",\"retrieveDatetime\":\"2021-01-09T13:22:40Z\",\"signature\":\"rqjfsmlm\",\"accepted\":true},\"id\":\"hwgfwsrt\",\"name\":\"wcoezbrhub\",\"type\":\"kh\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ConfluentManager manager = ConfluentManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<ConfluentAgreementResource> response
            = manager.marketplaceAgreements().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("bth", response.iterator().next().publisher());
        Assertions.assertEquals("tgk", response.iterator().next().product());
        Assertions.assertEquals("tvdxeclzedqb", response.iterator().next().plan());
        Assertions.assertEquals("hzlhplodqkdlww", response.iterator().next().licenseTextLink());
        Assertions.assertEquals("bum", response.iterator().next().privacyPolicyLink());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-09T13:22:40Z"),
            response.iterator().next().retrieveDatetime());
        Assertions.assertEquals("rqjfsmlm", response.iterator().next().signature());
        Assertions.assertEquals(true, response.iterator().next().accepted());
    }
}
