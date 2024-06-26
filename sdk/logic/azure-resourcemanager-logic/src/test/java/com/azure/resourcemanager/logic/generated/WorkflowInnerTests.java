// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.logic.fluent.models.WorkflowInner;
import com.azure.resourcemanager.logic.models.FlowAccessControlConfiguration;
import com.azure.resourcemanager.logic.models.FlowEndpointsConfiguration;
import com.azure.resourcemanager.logic.models.ManagedServiceIdentity;
import com.azure.resourcemanager.logic.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.logic.models.ParameterType;
import com.azure.resourcemanager.logic.models.ResourceReference;
import com.azure.resourcemanager.logic.models.UserAssignedIdentity;
import com.azure.resourcemanager.logic.models.WorkflowParameter;
import com.azure.resourcemanager.logic.models.WorkflowState;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class WorkflowInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkflowInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"provisioningState\":\"Completed\",\"createdTime\":\"2021-06-19T13:57:47Z\",\"changedTime\":\"2021-06-14T11:48:10Z\",\"state\":\"Completed\",\"version\":\"mjgr\",\"accessEndpoint\":\"wvukx\",\"endpointsConfiguration\":{},\"accessControl\":{},\"sku\":{\"name\":\"Shared\"},\"integrationAccount\":{\"id\":\"ejhkry\",\"name\":\"napczwlokjy\",\"type\":\"kkvnipjox\"},\"integrationServiceEnvironment\":{\"id\":\"chgejspodm\",\"name\":\"lzydehojwyahux\",\"type\":\"pmqnja\"},\"definition\":\"dataixjsprozvcputeg\",\"parameters\":{\"pslwejdpvw\":{\"type\":\"Array\",\"value\":\"dataatscmd\",\"metadata\":\"datajhulsuuvmkjo\",\"description\":\"rwfndiod\"},\"jhcrz\":{\"type\":\"Bool\",\"value\":\"datapsoacctazakljl\",\"metadata\":\"databcryffdfd\",\"description\":\"ygexpaojakhmsb\"},\"tfell\":{\"type\":\"SecureObject\",\"value\":\"datahlxaolthqtr\",\"metadata\":\"datajbp\",\"description\":\"fsinzgvfcjrwzoxx\"},\"i\":{\"type\":\"String\",\"value\":\"datait\",\"metadata\":\"datapeqfpjkjl\",\"description\":\"fpdvhpfxxypi\"}}},\"identity\":{\"type\":\"SystemAssigned\",\"tenantId\":\"3d71b7b3-626d-43c1-98f7-e52d1c0c7f78\",\"principalId\":\"9f07daac-50d1-437d-9e1b-3889141438c5\",\"userAssignedIdentities\":{\"xzxtheo\":{\"principalId\":\"bkpodepooginuv\",\"clientId\":\"iheogna\"}}},\"location\":\"usivye\",\"tags\":{\"un\":\"iqihn\",\"fygxgispemvtzfk\":\"bwjzr\",\"fxqeof\":\"fublj\"},\"id\":\"aeqjhqjbasvms\",\"name\":\"jqul\",\"type\":\"gsntnbybkzgcwr\"}")
                .toObject(WorkflowInner.class);
        Assertions.assertEquals("usivye", model.location());
        Assertions.assertEquals("iqihn", model.tags().get("un"));
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED, model.identity().type());
        Assertions.assertEquals(WorkflowState.COMPLETED, model.state());
        Assertions.assertEquals("ejhkry", model.integrationAccount().id());
        Assertions.assertEquals("chgejspodm", model.integrationServiceEnvironment().id());
        Assertions.assertEquals(ParameterType.ARRAY, model.parameters().get("pslwejdpvw").type());
        Assertions.assertEquals("rwfndiod", model.parameters().get("pslwejdpvw").description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkflowInner model =
            new WorkflowInner()
                .withLocation("usivye")
                .withTags(mapOf("un", "iqihn", "fygxgispemvtzfk", "bwjzr", "fxqeof", "fublj"))
                .withIdentity(
                    new ManagedServiceIdentity()
                        .withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED)
                        .withUserAssignedIdentities(mapOf("xzxtheo", new UserAssignedIdentity())))
                .withState(WorkflowState.COMPLETED)
                .withEndpointsConfiguration(new FlowEndpointsConfiguration())
                .withAccessControl(new FlowAccessControlConfiguration())
                .withIntegrationAccount(new ResourceReference().withId("ejhkry"))
                .withIntegrationServiceEnvironment(new ResourceReference().withId("chgejspodm"))
                .withDefinition("dataixjsprozvcputeg")
                .withParameters(
                    mapOf(
                        "pslwejdpvw",
                        new WorkflowParameter()
                            .withType(ParameterType.ARRAY)
                            .withValue("dataatscmd")
                            .withMetadata("datajhulsuuvmkjo")
                            .withDescription("rwfndiod"),
                        "jhcrz",
                        new WorkflowParameter()
                            .withType(ParameterType.BOOL)
                            .withValue("datapsoacctazakljl")
                            .withMetadata("databcryffdfd")
                            .withDescription("ygexpaojakhmsb"),
                        "tfell",
                        new WorkflowParameter()
                            .withType(ParameterType.SECURE_OBJECT)
                            .withValue("datahlxaolthqtr")
                            .withMetadata("datajbp")
                            .withDescription("fsinzgvfcjrwzoxx"),
                        "i",
                        new WorkflowParameter()
                            .withType(ParameterType.STRING)
                            .withValue("datait")
                            .withMetadata("datapeqfpjkjl")
                            .withDescription("fpdvhpfxxypi")));
        model = BinaryData.fromObject(model).toObject(WorkflowInner.class);
        Assertions.assertEquals("usivye", model.location());
        Assertions.assertEquals("iqihn", model.tags().get("un"));
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED, model.identity().type());
        Assertions.assertEquals(WorkflowState.COMPLETED, model.state());
        Assertions.assertEquals("ejhkry", model.integrationAccount().id());
        Assertions.assertEquals("chgejspodm", model.integrationServiceEnvironment().id());
        Assertions.assertEquals(ParameterType.ARRAY, model.parameters().get("pslwejdpvw").type());
        Assertions.assertEquals("rwfndiod", model.parameters().get("pslwejdpvw").description());
    }

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
