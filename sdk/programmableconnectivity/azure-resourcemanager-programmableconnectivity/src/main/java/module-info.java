// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

module com.azure.resourcemanager.programmableconnectivity {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.programmableconnectivity;
    exports com.azure.resourcemanager.programmableconnectivity.fluent;
    exports com.azure.resourcemanager.programmableconnectivity.fluent.models;
    exports com.azure.resourcemanager.programmableconnectivity.models;

    opens com.azure.resourcemanager.programmableconnectivity.fluent.models to com.azure.core;
    opens com.azure.resourcemanager.programmableconnectivity.models to com.azure.core;
    opens com.azure.resourcemanager.programmableconnectivity.implementation.models to com.azure.core;
}
