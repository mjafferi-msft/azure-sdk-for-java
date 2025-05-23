// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.alertsmanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.alertsmanagement.fluent.models.AlertInner;
import com.azure.resourcemanager.alertsmanagement.models.ActionStatus;
import com.azure.resourcemanager.alertsmanagement.models.AlertProperties;
import com.azure.resourcemanager.alertsmanagement.models.AlertsList;
import com.azure.resourcemanager.alertsmanagement.models.Essentials;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AlertsListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AlertsList model = BinaryData.fromString(
            "{\"nextLink\":\"m\",\"value\":[{\"properties\":{\"essentials\":{\"severity\":\"Sev2\",\"signalType\":\"Metric\",\"alertState\":\"New\",\"monitorCondition\":\"Resolved\",\"targetResource\":\"xrwlyc\",\"targetResourceName\":\"uhpkxkgymar\",\"targetResourceGroup\":\"n\",\"targetResourceType\":\"xqugjhkycubedd\",\"monitorService\":\"Application Insights\",\"alertRule\":\"fwqmzqalkrmn\",\"sourceCreatedId\":\"jpxac\",\"smartGroupId\":\"udfnbyxba\",\"smartGroupingReason\":\"bjyvay\",\"startDateTime\":\"2021-08-20T18:15:33Z\",\"lastModifiedDateTime\":\"2021-02-06T13:57:26Z\",\"monitorConditionResolvedDateTime\":\"2021-07-11T14:35:31Z\",\"lastModifiedUserName\":\"uzqogsexnevf\",\"actionStatus\":{\"isSuppressed\":false},\"description\":\"mewzsyyc\"},\"context\":\"datazsoibjudpfrxtr\",\"egressConfig\":\"datazvaytdwkqbr\"},\"id\":\"ubpaxhe\",\"name\":\"iilivpdtiirqtd\",\"type\":\"oaxoruzfgsqu\"},{\"properties\":{\"essentials\":{\"severity\":\"Sev3\",\"signalType\":\"Unknown\",\"alertState\":\"Closed\",\"monitorCondition\":\"Resolved\",\"targetResource\":\"mxjezwlw\",\"targetResourceName\":\"xuqlcvydypat\",\"targetResourceGroup\":\"oa\",\"targetResourceType\":\"kniod\",\"monitorService\":\"Log Analytics\",\"alertRule\":\"bw\",\"sourceCreatedId\":\"jhemms\",\"smartGroupId\":\"dkcrodt\",\"smartGroupingReason\":\"nfwjlfltkacjvefk\",\"startDateTime\":\"2021-05-26T04:23:15Z\",\"lastModifiedDateTime\":\"2021-04-07T03:26:36Z\",\"monitorConditionResolvedDateTime\":\"2021-03-28T14:05:44Z\",\"lastModifiedUserName\":\"kfpagao\",\"actionStatus\":{\"isSuppressed\":true},\"description\":\"qblylsyxkqj\"},\"context\":\"datajervtia\",\"egressConfig\":\"datasdszue\"},\"id\":\"psbzkfzbeyvpn\",\"name\":\"icvi\",\"type\":\"v\"}]}")
            .toObject(AlertsList.class);
        Assertions.assertEquals("m", model.nextLink());
        Assertions.assertEquals("xrwlyc", model.value().get(0).properties().essentials().targetResource());
        Assertions.assertEquals("uhpkxkgymar", model.value().get(0).properties().essentials().targetResourceName());
        Assertions.assertEquals("n", model.value().get(0).properties().essentials().targetResourceGroup());
        Assertions.assertEquals("xqugjhkycubedd", model.value().get(0).properties().essentials().targetResourceType());
        Assertions.assertEquals(false, model.value().get(0).properties().essentials().actionStatus().isSuppressed());
        Assertions.assertEquals("mewzsyyc", model.value().get(0).properties().essentials().description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AlertsList model = new AlertsList().withNextLink("m")
            .withValue(Arrays.asList(
                new AlertInner()
                    .withProperties(new AlertProperties().withEssentials(new Essentials().withTargetResource("xrwlyc")
                        .withTargetResourceName("uhpkxkgymar")
                        .withTargetResourceGroup("n")
                        .withTargetResourceType("xqugjhkycubedd")
                        .withActionStatus(new ActionStatus().withIsSuppressed(false))
                        .withDescription("mewzsyyc"))),
                new AlertInner()
                    .withProperties(new AlertProperties().withEssentials(new Essentials().withTargetResource("mxjezwlw")
                        .withTargetResourceName("xuqlcvydypat")
                        .withTargetResourceGroup("oa")
                        .withTargetResourceType("kniod")
                        .withActionStatus(new ActionStatus().withIsSuppressed(true))
                        .withDescription("qblylsyxkqj")))));
        model = BinaryData.fromObject(model).toObject(AlertsList.class);
        Assertions.assertEquals("m", model.nextLink());
        Assertions.assertEquals("xrwlyc", model.value().get(0).properties().essentials().targetResource());
        Assertions.assertEquals("uhpkxkgymar", model.value().get(0).properties().essentials().targetResourceName());
        Assertions.assertEquals("n", model.value().get(0).properties().essentials().targetResourceGroup());
        Assertions.assertEquals("xqugjhkycubedd", model.value().get(0).properties().essentials().targetResourceType());
        Assertions.assertEquals(false, model.value().get(0).properties().essentials().actionStatus().isSuppressed());
        Assertions.assertEquals("mewzsyyc", model.value().get(0).properties().essentials().description());
    }
}
