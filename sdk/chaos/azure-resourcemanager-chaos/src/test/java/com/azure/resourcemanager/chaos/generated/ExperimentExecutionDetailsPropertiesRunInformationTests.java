// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.chaos.models.ExperimentExecutionDetailsPropertiesRunInformation;

public final class ExperimentExecutionDetailsPropertiesRunInformationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExperimentExecutionDetailsPropertiesRunInformation model = BinaryData.fromString(
            "{\"steps\":[{\"stepName\":\"efuzmuvpbttd\",\"stepId\":\"orppxebmnzbtb\",\"status\":\"pglkf\",\"branches\":[{\"branchName\":\"neuelfphsdyhtoz\",\"branchId\":\"kd\",\"status\":\"wq\",\"actions\":[{}]},{\"branchName\":\"zx\",\"branchId\":\"vithh\",\"status\":\"o\",\"actions\":[{}]},{\"branchName\":\"gbhcohfwdsj\",\"branchId\":\"aljutiiswac\",\"status\":\"gdkz\",\"actions\":[{},{},{},{}]}]},{\"stepName\":\"fvhqc\",\"stepId\":\"ilvpnppfuflrwd\",\"status\":\"dlxyjrxs\",\"branches\":[{\"branchName\":\"cnihgwqapnedgfbc\",\"branchId\":\"cvqvpkeqdcv\",\"status\":\"hvoodsotbobzd\",\"actions\":[{},{}]},{\"branchName\":\"wvnhdldwmgx\",\"branchId\":\"rslpmutwuoeg\",\"status\":\"khjwn\",\"actions\":[{},{}]}]}]}")
            .toObject(ExperimentExecutionDetailsPropertiesRunInformation.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExperimentExecutionDetailsPropertiesRunInformation model
            = new ExperimentExecutionDetailsPropertiesRunInformation();
        model = BinaryData.fromObject(model).toObject(ExperimentExecutionDetailsPropertiesRunInformation.class);
    }
}
