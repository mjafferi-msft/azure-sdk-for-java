// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.implementation;

import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.ValidateBackupResponseInner;
import com.azure.resourcemanager.mysqlflexibleserver.models.ValidateBackupResponse;

public final class ValidateBackupResponseImpl implements ValidateBackupResponse {
    private ValidateBackupResponseInner innerObject;

    private final com.azure.resourcemanager.mysqlflexibleserver.MySqlManager serviceManager;

    ValidateBackupResponseImpl(
        ValidateBackupResponseInner innerObject,
        com.azure.resourcemanager.mysqlflexibleserver.MySqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Integer numberOfContainers() {
        return this.innerModel().numberOfContainers();
    }

    public ValidateBackupResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mysqlflexibleserver.MySqlManager manager() {
        return this.serviceManager;
    }
}
