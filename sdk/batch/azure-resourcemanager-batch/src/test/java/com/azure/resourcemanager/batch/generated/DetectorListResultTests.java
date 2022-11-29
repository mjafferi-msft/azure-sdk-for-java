// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.fluent.models.DetectorResponseInner;
import com.azure.resourcemanager.batch.models.DetectorListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DetectorListResultTests {
    @Test
    public void testDeserialize() {
        DetectorListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"value\":\"dpydn\"},\"etag\":\"hxdeoejz\",\"id\":\"cwif\",\"name\":\"jttgzf\",\"type\":\"ishc\"},{\"properties\":{\"value\":\"ajdeyeamdphaga\"},\"etag\":\"buxwgip\",\"id\":\"honowkgshwank\",\"name\":\"xzbinjeputt\",\"type\":\"rywn\"},{\"properties\":{\"value\":\"qftiy\"},\"etag\":\"rnkcqvyxlw\",\"id\":\"zlsico\",\"name\":\"oqqnwvlryav\",\"type\":\"hheunmmqhgyx\"},{\"properties\":{\"value\":\"noc\"},\"etag\":\"oklyaxuconuq\",\"id\":\"zf\",\"name\":\"beypewrmjmw\",\"type\":\"vjektcxsenh\"}],\"nextLink\":\"rsffrzpwvlqdqgbi\"}")
                .toObject(DetectorListResult.class);
        Assertions.assertEquals("dpydn", model.value().get(0).value());
        Assertions.assertEquals("rsffrzpwvlqdqgbi", model.nextLink());
    }

    @Test
    public void testSerialize() {
        DetectorListResult model =
            new DetectorListResult()
                .withValue(
                    Arrays
                        .asList(
                            new DetectorResponseInner().withValue("dpydn"),
                            new DetectorResponseInner().withValue("ajdeyeamdphaga"),
                            new DetectorResponseInner().withValue("qftiy"),
                            new DetectorResponseInner().withValue("noc")))
                .withNextLink("rsffrzpwvlqdqgbi");
        model = BinaryData.fromObject(model).toObject(DetectorListResult.class);
        Assertions.assertEquals("dpydn", model.value().get(0).value());
        Assertions.assertEquals("rsffrzpwvlqdqgbi", model.nextLink());
    }
}