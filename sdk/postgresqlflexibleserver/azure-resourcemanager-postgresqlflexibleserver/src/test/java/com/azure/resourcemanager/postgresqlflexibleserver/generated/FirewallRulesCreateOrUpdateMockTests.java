// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager;
import com.azure.resourcemanager.postgresqlflexibleserver.models.FirewallRule;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class FirewallRulesCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"properties\":{\"startIpAddress\":\"sdtmcdzs\",\"endIpAddress\":\"fcohdxbzlmcmu\"},\"id\":\"cvhd\",\"name\":\"evwqqxeyskonq\",\"type\":\"inkfkbgbz\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        PostgreSqlManager manager = PostgreSqlManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        FirewallRule response = manager.firewallRules()
            .define("mftpmdtz")
            .withExistingFlexibleServer("jkavl", "or")
            .withStartIpAddress("jltfvnzcyjtotpv")
            .withEndIpAddress("pvpbdbzqgqqiheds")
            .create();

        Assertions.assertEquals("sdtmcdzs", response.startIpAddress());
        Assertions.assertEquals("fcohdxbzlmcmu", response.endIpAddress());
    }
}
