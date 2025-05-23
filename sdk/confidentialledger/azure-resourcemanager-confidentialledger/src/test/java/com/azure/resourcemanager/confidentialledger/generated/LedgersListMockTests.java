// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confidentialledger.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.confidentialledger.ConfidentialLedgerManager;
import com.azure.resourcemanager.confidentialledger.models.ApplicationType;
import com.azure.resourcemanager.confidentialledger.models.ConfidentialLedger;
import com.azure.resourcemanager.confidentialledger.models.EnclavePlatform;
import com.azure.resourcemanager.confidentialledger.models.LedgerRoleName;
import com.azure.resourcemanager.confidentialledger.models.LedgerSku;
import com.azure.resourcemanager.confidentialledger.models.LedgerType;
import com.azure.resourcemanager.confidentialledger.models.RunningState;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class LedgersListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"ledgerName\":\"hgyxzkonoc\",\"ledgerUri\":\"oklyaxuconuq\",\"identityServiceUri\":\"fkbey\",\"ledgerInternalNamespace\":\"wrmjmwvvjektc\",\"runningState\":\"Active\",\"ledgerType\":\"Public\",\"provisioningState\":\"Canceled\",\"ledgerSku\":\"Basic\",\"aadBasedSecurityPrincipals\":[{\"principalId\":\"zpwv\",\"tenantId\":\"dqgbiqylihkaetc\",\"ledgerRoleName\":\"Reader\"},{\"principalId\":\"civfsnkymuctq\",\"tenantId\":\"fbebrjcxer\",\"ledgerRoleName\":\"Contributor\"},{\"principalId\":\"tttxfvjrb\",\"tenantId\":\"phxepcyvahf\",\"ledgerRoleName\":\"Reader\"}],\"certBasedSecurityPrincipals\":[{\"cert\":\"xjvuujqgidokg\",\"ledgerRoleName\":\"Reader\"}],\"hostLevel\":\"oxgvclt\",\"maxBodySizeInMb\":794855452,\"subjectName\":\"c\",\"nodeCount\":1435851366,\"writeLBAddressPrefix\":\"esz\",\"workerThreads\":1005775827,\"enclavePlatform\":\"AmdSevSnp\",\"applicationType\":\"ConfidentialLedger\"},\"location\":\"fvgxbfsmxneh\",\"tags\":{\"godebfqkkrbmpu\":\"ec\",\"wflzlfbxzpuzy\":\"gr\",\"y\":\"ispnqzahmgkbrp\",\"rgvtqag\":\"hibnuqqkpika\"},\"id\":\"buynhijggm\",\"name\":\"bfs\",\"type\":\"arbu\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ConfidentialLedgerManager manager = ConfidentialLedgerManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PagedIterable<ConfidentialLedger> response = manager.ledgers().list("heun", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("fvgxbfsmxneh", response.iterator().next().location());
        Assertions.assertEquals("ec", response.iterator().next().tags().get("godebfqkkrbmpu"));
        Assertions.assertEquals(RunningState.ACTIVE, response.iterator().next().properties().runningState());
        Assertions.assertEquals(LedgerType.PUBLIC, response.iterator().next().properties().ledgerType());
        Assertions.assertEquals(LedgerSku.BASIC, response.iterator().next().properties().ledgerSku());
        Assertions.assertEquals("zpwv",
            response.iterator().next().properties().aadBasedSecurityPrincipals().get(0).principalId());
        Assertions.assertEquals("dqgbiqylihkaetc",
            response.iterator().next().properties().aadBasedSecurityPrincipals().get(0).tenantId());
        Assertions.assertEquals(LedgerRoleName.READER,
            response.iterator().next().properties().aadBasedSecurityPrincipals().get(0).ledgerRoleName());
        Assertions.assertEquals("xjvuujqgidokg",
            response.iterator().next().properties().certBasedSecurityPrincipals().get(0).cert());
        Assertions.assertEquals(LedgerRoleName.READER,
            response.iterator().next().properties().certBasedSecurityPrincipals().get(0).ledgerRoleName());
        Assertions.assertEquals("oxgvclt", response.iterator().next().properties().hostLevel());
        Assertions.assertEquals(794855452, response.iterator().next().properties().maxBodySizeInMb());
        Assertions.assertEquals("c", response.iterator().next().properties().subjectName());
        Assertions.assertEquals(1435851366, response.iterator().next().properties().nodeCount());
        Assertions.assertEquals("esz", response.iterator().next().properties().writeLBAddressPrefix());
        Assertions.assertEquals(1005775827, response.iterator().next().properties().workerThreads());
        Assertions.assertEquals(EnclavePlatform.AMD_SEV_SNP, response.iterator().next().properties().enclavePlatform());
        Assertions.assertEquals(ApplicationType.CONFIDENTIAL_LEDGER,
            response.iterator().next().properties().applicationType());
    }
}
