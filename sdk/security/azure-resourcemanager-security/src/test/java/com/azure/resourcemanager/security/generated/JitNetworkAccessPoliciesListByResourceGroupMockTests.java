// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.security.SecurityManager;
import com.azure.resourcemanager.security.models.JitNetworkAccessPolicy;
import com.azure.resourcemanager.security.models.Protocol;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class JitNetworkAccessPoliciesListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"value\":[{\"properties\":{\"virtualMachines\":[{\"id\":\"gne\",\"ports\":[{\"number\":1656906345,\"protocol\":\"*\",\"maxRequestAccessDuration\":\"crxlyzoahovu\"}],\"publicIpAddress\":\"kr\"},{\"id\":\"jjwnbrm\",\"ports\":[{\"number\":1220487573,\"protocol\":\"*\",\"maxRequestAccessDuration\":\"rnlsyiaanistc\"},{\"number\":1681020583,\"protocol\":\"*\",\"maxRequestAccessDuration\":\"tclpphcs\"}],\"publicIpAddress\":\"rycpanapfa\"}],\"requests\":[{\"virtualMachines\":[{\"id\":\"inlpxngzzxqbgqn\",\"ports\":[]}],\"startTimeUtc\":\"2021-04-09T15:57:21Z\",\"requestor\":\"zctbxzjkpifpu\",\"justification\":\"bdozwbskueafz\"},{\"virtualMachines\":[{\"id\":\"mbinpxmiwt\",\"ports\":[]},{\"id\":\"qi\",\"ports\":[]},{\"id\":\"pvrd\",\"ports\":[]}],\"startTimeUtc\":\"2021-05-14T00:33:56Z\",\"requestor\":\"cdnzoxl\",\"justification\":\"uxtwgbawshram\"},{\"virtualMachines\":[{\"id\":\"ugqcglmadfztof\",\"ports\":[]},{\"id\":\"vqlauuag\",\"ports\":[]},{\"id\":\"ayfmcerfxfeiqbas\",\"ports\":[]}],\"startTimeUtc\":\"2021-12-06T05:30:21Z\",\"requestor\":\"zwjipssvnon\",\"justification\":\"cqcjozzjku\"}],\"provisioningState\":\"dqqbt\"},\"kind\":\"vocu\",\"location\":\"llbpwarhwettohgp\",\"id\":\"wxyvtkzbhiz\",\"name\":\"pusddmw\",\"type\":\"f\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        SecurityManager manager = SecurityManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<JitNetworkAccessPolicy> response = manager.jitNetworkAccessPolicies()
            .listByResourceGroup("fwfiikqcdnzsfi", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("vocu", response.iterator().next().kind());
        Assertions.assertEquals("gne", response.iterator().next().virtualMachines().get(0).id());
        Assertions.assertEquals(1656906345,
            response.iterator().next().virtualMachines().get(0).ports().get(0).number());
        Assertions.assertEquals(Protocol.ASTERISK,
            response.iterator().next().virtualMachines().get(0).ports().get(0).protocol());
        Assertions.assertEquals("crxlyzoahovu",
            response.iterator().next().virtualMachines().get(0).ports().get(0).maxRequestAccessDuration());
        Assertions.assertEquals("kr", response.iterator().next().virtualMachines().get(0).publicIpAddress());
        Assertions.assertEquals("inlpxngzzxqbgqn",
            response.iterator().next().requests().get(0).virtualMachines().get(0).id());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-09T15:57:21Z"),
            response.iterator().next().requests().get(0).startTimeUtc());
        Assertions.assertEquals("zctbxzjkpifpu", response.iterator().next().requests().get(0).requestor());
        Assertions.assertEquals("bdozwbskueafz", response.iterator().next().requests().get(0).justification());
    }
}
