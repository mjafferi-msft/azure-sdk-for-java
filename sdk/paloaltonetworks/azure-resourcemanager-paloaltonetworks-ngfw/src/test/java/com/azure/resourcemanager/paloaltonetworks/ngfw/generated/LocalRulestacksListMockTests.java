// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.DefaultMode;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.LocalRulestackResource;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.ManagedIdentityType;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.ScopeType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class LocalRulestacksListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"panEtag\":\"fayorpravkjoges\",\"panLocation\":\"bnsmjkwynqxaek\",\"scope\":\"GLOBAL\",\"associatedSubscriptions\":[\"wjtq\",\"kev\",\"yltjcrspxklu\",\"cclfgxannn\"],\"description\":\"t\",\"defaultMode\":\"NONE\",\"minAppIdVersion\":\"ewxigpxvk\",\"provisioningState\":\"Failed\",\"securityServices\":{\"vulnerabilityProfile\":\"xvpif\",\"antiSpywareProfile\":\"aifyzyzeyuubeids\",\"antiVirusProfile\":\"fytoi\",\"urlFilteringProfile\":\"gygvfltgvdiho\",\"fileBlockingProfile\":\"krxwet\",\"dnsSubscription\":\"drcyrucpcun\",\"outboundUnTrustCertificate\":\"zdqumoe\",\"outboundTrustCertificate\":\"dnaienhqhskndnel\"}},\"identity\":{\"tenantId\":\"adlknwfoanni\",\"principalId\":\"petxivcnrlyxnu\",\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{\"zqymtuowogtgits\":{\"clientId\":\"blkwqpatvbqs\",\"principalId\":\"cjbctviv\"}}},\"location\":\"zvbrzcdbanfzndsc\",\"tags\":{\"ibqbnaomhjrm\":\"eatkdbmwnrdj\",\"maxljalfihcj\":\"u\"},\"id\":\"obcancdexxqcw\",\"name\":\"a\",\"type\":\"fgvaknokzwj\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        PaloAltoNetworksNgfwManager manager = PaloAltoNetworksNgfwManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<LocalRulestackResource> response
            = manager.localRulestacks().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("zvbrzcdbanfzndsc", response.iterator().next().location());
        Assertions.assertEquals("eatkdbmwnrdj", response.iterator().next().tags().get("ibqbnaomhjrm"));
        Assertions.assertEquals(ManagedIdentityType.SYSTEM_ASSIGNED, response.iterator().next().identity().type());
        Assertions.assertEquals("blkwqpatvbqs",
            response.iterator().next().identity().userAssignedIdentities().get("zqymtuowogtgits").clientId());
        Assertions.assertEquals("cjbctviv",
            response.iterator().next().identity().userAssignedIdentities().get("zqymtuowogtgits").principalId());
        Assertions.assertEquals("fayorpravkjoges", response.iterator().next().panEtag());
        Assertions.assertEquals("bnsmjkwynqxaek", response.iterator().next().panLocation());
        Assertions.assertEquals(ScopeType.GLOBAL, response.iterator().next().scope());
        Assertions.assertEquals("wjtq", response.iterator().next().associatedSubscriptions().get(0));
        Assertions.assertEquals("t", response.iterator().next().description());
        Assertions.assertEquals(DefaultMode.NONE, response.iterator().next().defaultMode());
        Assertions.assertEquals("ewxigpxvk", response.iterator().next().minAppIdVersion());
        Assertions.assertEquals("xvpif", response.iterator().next().securityServices().vulnerabilityProfile());
        Assertions.assertEquals("aifyzyzeyuubeids", response.iterator().next().securityServices().antiSpywareProfile());
        Assertions.assertEquals("fytoi", response.iterator().next().securityServices().antiVirusProfile());
        Assertions.assertEquals("gygvfltgvdiho", response.iterator().next().securityServices().urlFilteringProfile());
        Assertions.assertEquals("krxwet", response.iterator().next().securityServices().fileBlockingProfile());
        Assertions.assertEquals("drcyrucpcun", response.iterator().next().securityServices().dnsSubscription());
        Assertions.assertEquals("zdqumoe", response.iterator().next().securityServices().outboundUnTrustCertificate());
        Assertions.assertEquals("dnaienhqhskndnel",
            response.iterator().next().securityServices().outboundTrustCertificate());
    }
}
