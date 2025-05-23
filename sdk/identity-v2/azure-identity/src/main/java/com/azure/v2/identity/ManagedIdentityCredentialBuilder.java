// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.v2.identity;

import com.azure.v2.identity.implementation.models.ClientOptions;
import com.azure.v2.identity.implementation.models.ManagedIdentityClientOptions;
import com.azure.v2.identity.implementation.util.ValidationUtil;
import io.clientcore.core.instrumentation.logging.ClientLogger;
import io.clientcore.core.utils.SharedExecutorService;

import java.util.concurrent.ExecutorService;

/**
 * <p>Fluent credential builder for instantiating a {@link ManagedIdentityCredential}.</p>
 *
 * <p><a href="https://learn.microsoft.com/entra/identity/managed-identities-azure-resources/">Azure
 * Managed Identity</a> is a feature in
 * <a href="https://learn.microsoft.com/entra/fundamentals/">Microsoft Entra ID</a>
 * that provides a way for applications running on Azure to authenticate themselves with Azure resources without
 * needing to manage or store any secrets like passwords or keys.
 * The {@link ManagedIdentityCredential} authenticates the configured managed identity (system or user assigned) of an
 * Azure resource. So, if the application is running inside an Azure resource that supports Managed Identity through
 * IDENTITY/MSI, IMDS endpoints, or both, then this credential will get your application authenticated, and offers a
 * great secretless authentication experience. For more information refer to the
 * <a href="https://aka.ms/azsdk/java/identity/managedidentitycredential/docs">managed identity authentication
 * documentation</a>.</p>
 *
 * <p><strong>Sample: Construct a simple ManagedIdentityCredential</strong></p>
 *
 * <p>The following code sample demonstrates the creation of a {@link ManagedIdentityCredential},
 * using the ManagedIdentityCredentialBuilder to configure it. Once this credential is created, it may be passed into
 * the builder of many of the Azure SDK for Java client builders as the 'credential' parameter.</p>
 *
 * <pre>
 * TokenCredential managedIdentityCredential = new ManagedIdentityCredentialBuilder&#40;&#41;.build&#40;&#41;;
 * </pre>
 *
 * <p><strong>Sample: Construct a User Assigned ManagedIdentityCredential</strong></p>
 *
 * <p>User-Assigned Managed Identity (UAMI) in Azure is a feature that allows you to create an identity in
 * <a href="https://learn.microsoft.com/entra/fundamentals/">Microsoft Entra ID</a>
 * that is associated with one or more Azure resources. This identity can then be used to authenticate and
 * authorize access to various Azure services and resources. The following code sample demonstrates the creation of a
 * {@link ManagedIdentityCredential} to target a user assigned managed identity, using the
 * ManagedIdentityCredentialBuilder to configure it. Once this credential is created, it may be passed into the
 * builder of many of the Azure SDK for Java client builders as the 'credential' parameter.</p>
 *
 * <pre>
 * TokenCredential managedIdentityCredentialUserAssigned = new ManagedIdentityCredentialBuilder&#40;&#41;.clientId&#40;
 *         clientId&#41; &#47;&#47; specify client id of user-assigned managed identity.
 *     .build&#40;&#41;;
 * </pre>
 *
 * @see ManagedIdentityCredential
 */
public class ManagedIdentityCredentialBuilder extends EntraIdCredentialBuilderBase<ManagedIdentityCredentialBuilder> {
    private static final ClientLogger LOGGER = new ClientLogger(ManagedIdentityCredentialBuilder.class);

    private final ManagedIdentityClientOptions miClientOptions;

    /**
     * Constructs an instance of ManagedIdentityCredentialBuilder.
     */
    public ManagedIdentityCredentialBuilder() {
        super();
        this.miClientOptions = new ManagedIdentityClientOptions();
    }

    /**
     * Specifies the client ID of a user-assigned or system-assigned managed identity.
     *
     * Only one of clientId, resourceId, or objectId can be specified.
     *
     * @param clientId the client ID
     * @return the ManagedIdentityCredentialBuilder itself
     */
    public ManagedIdentityCredentialBuilder clientId(String clientId) {
        getClientOptions().setClientId(clientId);
        return this;
    }

    /**
     * Specifies the resource ID of a user-assigned or system-assigned managed identity.
     *
     * Only one of clientId, resourceId, or objectId can be specified.
     *
     * @param resourceId the resource ID
     * @return the ManagedIdentityCredentialBuilder itself
     */
    public ManagedIdentityCredentialBuilder resourceId(String resourceId) {
        miClientOptions.setResourceId(resourceId);
        return this;
    }

    /**
     * Specifies the object ID of a user-assigned or system-assigned managed identity.
     *
     * Only one of clientId, resourceId, or objectId can be specified.
     *
     * @param objectId the object ID
     * @return the ManagedIdentityCredentialBuilder itself
     */
    public ManagedIdentityCredentialBuilder objectId(String objectId) {
        miClientOptions.setObjectId(objectId);
        return this;
    }

    /**
     * Specifies the ExecutorService to be used to execute the authentication requests.
     * Developer is responsible for maintaining the lifecycle of the ExecutorService.
     *
     * <p>
     * If this is not configured, the {@link SharedExecutorService} will be used which is
     * also shared with other SDK libraries. If there are many concurrent SDK tasks occurring, authentication
     * requests might starve and configuring a separate executor service should be considered.
     * </p>
     *
     * <p> The executor service and can be safely shutdown if the TokenCredential is no longer being used by the
     * Azure SDK clients and should be shutdown before the application exits. </p>
     *
     * @param executorService the executor service to use for executing authentication requests.
     * @return the ManagedIdentityCredentialBuilder itself
     */
    public ManagedIdentityCredentialBuilder executorService(ExecutorService executorService) {
        getClientOptions().setExecutorService(executorService);
        return this;
    }

    /**
     * Creates a new {@link ManagedIdentityCredential} with the current configurations.
     *
     * @return a {@link ManagedIdentityCredential} with the current configurations.
     * @throws IllegalStateException if clientId and resourceId are both set.
     */
    public ManagedIdentityCredential build() {
        ValidationUtil.validateManagedIdentityIdParams(miClientOptions, LOGGER);

        return new ManagedIdentityCredential(miClientOptions);
    }

    @Override
    ClientOptions getClientOptions() {
        return miClientOptions;
    }
}
