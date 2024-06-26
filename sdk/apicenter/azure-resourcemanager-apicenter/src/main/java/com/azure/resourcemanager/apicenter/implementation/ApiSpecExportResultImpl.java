// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.implementation;

import com.azure.resourcemanager.apicenter.fluent.models.ApiSpecExportResultInner;
import com.azure.resourcemanager.apicenter.models.ApiSpecExportResult;
import com.azure.resourcemanager.apicenter.models.ApiSpecExportResultFormat;

public final class ApiSpecExportResultImpl implements ApiSpecExportResult {
    private ApiSpecExportResultInner innerObject;

    private final com.azure.resourcemanager.apicenter.ApiCenterManager serviceManager;

    ApiSpecExportResultImpl(ApiSpecExportResultInner innerObject,
        com.azure.resourcemanager.apicenter.ApiCenterManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public ApiSpecExportResultFormat format() {
        return this.innerModel().format();
    }

    public String value() {
        return this.innerModel().value();
    }

    public ApiSpecExportResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.apicenter.ApiCenterManager manager() {
        return this.serviceManager;
    }
}
