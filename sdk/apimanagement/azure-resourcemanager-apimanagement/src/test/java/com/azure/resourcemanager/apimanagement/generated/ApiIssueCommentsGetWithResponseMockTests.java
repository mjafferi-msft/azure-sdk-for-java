// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.apimanagement.ApiManagementManager;
import com.azure.resourcemanager.apimanagement.models.IssueCommentContract;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ApiIssueCommentsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"text\":\"dvmsnaosxsx\",\"createdDate\":\"2021-10-05T17:13:09Z\",\"userId\":\"imdvetq\"},\"id\":\"dbitqsbyujsgomri\",\"name\":\"u\",\"type\":\"grmsdbv\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ApiManagementManager manager = ApiManagementManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        IssueCommentContract response = manager.apiIssueComments()
            .getWithResponse("aqsos", "njlvgrghnh", "oxrqhjninpeswv", "hq", "gebzqzmcsviujo",
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("dvmsnaosxsx", response.text());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-05T17:13:09Z"), response.createdDate());
        Assertions.assertEquals("imdvetq", response.userId());
    }
}
