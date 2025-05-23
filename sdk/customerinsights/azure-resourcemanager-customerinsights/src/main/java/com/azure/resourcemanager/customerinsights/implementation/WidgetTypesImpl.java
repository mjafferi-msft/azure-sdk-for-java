// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.customerinsights.fluent.WidgetTypesClient;
import com.azure.resourcemanager.customerinsights.fluent.models.WidgetTypeResourceFormatInner;
import com.azure.resourcemanager.customerinsights.models.WidgetTypeResourceFormat;
import com.azure.resourcemanager.customerinsights.models.WidgetTypes;

public final class WidgetTypesImpl implements WidgetTypes {
    private static final ClientLogger LOGGER = new ClientLogger(WidgetTypesImpl.class);

    private final WidgetTypesClient innerClient;

    private final com.azure.resourcemanager.customerinsights.CustomerInsightsManager serviceManager;

    public WidgetTypesImpl(WidgetTypesClient innerClient,
        com.azure.resourcemanager.customerinsights.CustomerInsightsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<WidgetTypeResourceFormat> listByHub(String resourceGroupName, String hubName) {
        PagedIterable<WidgetTypeResourceFormatInner> inner = this.serviceClient().listByHub(resourceGroupName, hubName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new WidgetTypeResourceFormatImpl(inner1, this.manager()));
    }

    public PagedIterable<WidgetTypeResourceFormat> listByHub(String resourceGroupName, String hubName,
        Context context) {
        PagedIterable<WidgetTypeResourceFormatInner> inner
            = this.serviceClient().listByHub(resourceGroupName, hubName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new WidgetTypeResourceFormatImpl(inner1, this.manager()));
    }

    public Response<WidgetTypeResourceFormat> getWithResponse(String resourceGroupName, String hubName,
        String widgetTypeName, Context context) {
        Response<WidgetTypeResourceFormatInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, hubName, widgetTypeName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new WidgetTypeResourceFormatImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public WidgetTypeResourceFormat get(String resourceGroupName, String hubName, String widgetTypeName) {
        WidgetTypeResourceFormatInner inner = this.serviceClient().get(resourceGroupName, hubName, widgetTypeName);
        if (inner != null) {
            return new WidgetTypeResourceFormatImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private WidgetTypesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.customerinsights.CustomerInsightsManager manager() {
        return this.serviceManager;
    }
}
