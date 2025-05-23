// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.fluent.models.AzureMLServiceLinkedServiceTypeProperties;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Azure ML Service linked service.
 */
@Fluent
public final class AzureMLServiceLinkedService extends LinkedService {
    /*
     * Type of linked service.
     */
    private String type = "AzureMLService";

    /*
     * Azure ML Service linked service properties.
     */
    private AzureMLServiceLinkedServiceTypeProperties innerTypeProperties
        = new AzureMLServiceLinkedServiceTypeProperties();

    /**
     * Creates an instance of AzureMLServiceLinkedService class.
     */
    public AzureMLServiceLinkedService() {
    }

    /**
     * Get the type property: Type of linked service.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the innerTypeProperties property: Azure ML Service linked service properties.
     * 
     * @return the innerTypeProperties value.
     */
    AzureMLServiceLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureMLServiceLinkedService withVersion(String version) {
        super.withVersion(version);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureMLServiceLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureMLServiceLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureMLServiceLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureMLServiceLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the subscriptionId property: Azure ML Service workspace subscription ID. Type: string (or Expression with
     * resultType string).
     * 
     * @return the subscriptionId value.
     */
    public Object subscriptionId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().subscriptionId();
    }

    /**
     * Set the subscriptionId property: Azure ML Service workspace subscription ID. Type: string (or Expression with
     * resultType string).
     * 
     * @param subscriptionId the subscriptionId value to set.
     * @return the AzureMLServiceLinkedService object itself.
     */
    public AzureMLServiceLinkedService withSubscriptionId(Object subscriptionId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureMLServiceLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withSubscriptionId(subscriptionId);
        return this;
    }

    /**
     * Get the resourceGroupName property: Azure ML Service workspace resource group name. Type: string (or Expression
     * with resultType string).
     * 
     * @return the resourceGroupName value.
     */
    public Object resourceGroupName() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().resourceGroupName();
    }

    /**
     * Set the resourceGroupName property: Azure ML Service workspace resource group name. Type: string (or Expression
     * with resultType string).
     * 
     * @param resourceGroupName the resourceGroupName value to set.
     * @return the AzureMLServiceLinkedService object itself.
     */
    public AzureMLServiceLinkedService withResourceGroupName(Object resourceGroupName) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureMLServiceLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withResourceGroupName(resourceGroupName);
        return this;
    }

    /**
     * Get the mlWorkspaceName property: Azure ML Service workspace name. Type: string (or Expression with resultType
     * string).
     * 
     * @return the mlWorkspaceName value.
     */
    public Object mlWorkspaceName() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().mlWorkspaceName();
    }

    /**
     * Set the mlWorkspaceName property: Azure ML Service workspace name. Type: string (or Expression with resultType
     * string).
     * 
     * @param mlWorkspaceName the mlWorkspaceName value to set.
     * @return the AzureMLServiceLinkedService object itself.
     */
    public AzureMLServiceLinkedService withMlWorkspaceName(Object mlWorkspaceName) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureMLServiceLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withMlWorkspaceName(mlWorkspaceName);
        return this;
    }

    /**
     * Get the authentication property: Type of authentication (Required to specify MSI) used to connect to AzureML.
     * Type: string (or Expression with resultType string).
     * 
     * @return the authentication value.
     */
    public Object authentication() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().authentication();
    }

    /**
     * Set the authentication property: Type of authentication (Required to specify MSI) used to connect to AzureML.
     * Type: string (or Expression with resultType string).
     * 
     * @param authentication the authentication value to set.
     * @return the AzureMLServiceLinkedService object itself.
     */
    public AzureMLServiceLinkedService withAuthentication(Object authentication) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureMLServiceLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAuthentication(authentication);
        return this;
    }

    /**
     * Get the servicePrincipalId property: The ID of the service principal used to authenticate against the endpoint of
     * a published Azure ML Service pipeline. Type: string (or Expression with resultType string).
     * 
     * @return the servicePrincipalId value.
     */
    public Object servicePrincipalId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().servicePrincipalId();
    }

    /**
     * Set the servicePrincipalId property: The ID of the service principal used to authenticate against the endpoint of
     * a published Azure ML Service pipeline. Type: string (or Expression with resultType string).
     * 
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the AzureMLServiceLinkedService object itself.
     */
    public AzureMLServiceLinkedService withServicePrincipalId(Object servicePrincipalId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureMLServiceLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withServicePrincipalId(servicePrincipalId);
        return this;
    }

    /**
     * Get the servicePrincipalKey property: The key of the service principal used to authenticate against the endpoint
     * of a published Azure ML Service pipeline.
     * 
     * @return the servicePrincipalKey value.
     */
    public SecretBase servicePrincipalKey() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().servicePrincipalKey();
    }

    /**
     * Set the servicePrincipalKey property: The key of the service principal used to authenticate against the endpoint
     * of a published Azure ML Service pipeline.
     * 
     * @param servicePrincipalKey the servicePrincipalKey value to set.
     * @return the AzureMLServiceLinkedService object itself.
     */
    public AzureMLServiceLinkedService withServicePrincipalKey(SecretBase servicePrincipalKey) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureMLServiceLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withServicePrincipalKey(servicePrincipalKey);
        return this;
    }

    /**
     * Get the tenant property: The name or ID of the tenant to which the service principal belongs. Type: string (or
     * Expression with resultType string).
     * 
     * @return the tenant value.
     */
    public Object tenant() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().tenant();
    }

    /**
     * Set the tenant property: The name or ID of the tenant to which the service principal belongs. Type: string (or
     * Expression with resultType string).
     * 
     * @param tenant the tenant value to set.
     * @return the AzureMLServiceLinkedService object itself.
     */
    public AzureMLServiceLinkedService withTenant(Object tenant) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureMLServiceLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withTenant(tenant);
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     * 
     * @return the encryptedCredential value.
     */
    public String encryptedCredential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().encryptedCredential();
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the AzureMLServiceLinkedService object itself.
     */
    public AzureMLServiceLinkedService withEncryptedCredential(String encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureMLServiceLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEncryptedCredential(encryptedCredential);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (innerTypeProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerTypeProperties in model AzureMLServiceLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
        if (connectVia() != null) {
            connectVia().validate();
        }
        if (parameters() != null) {
            parameters().values().forEach(e -> {
                if (e != null) {
                    e.validate();
                }
            });
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureMLServiceLinkedService.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("version", version());
        jsonWriter.writeJsonField("connectVia", connectVia());
        jsonWriter.writeStringField("description", description());
        jsonWriter.writeMapField("parameters", parameters(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("annotations", annotations(), (writer, element) -> writer.writeUntyped(element));
        jsonWriter.writeJsonField("typeProperties", this.innerTypeProperties);
        jsonWriter.writeStringField("type", this.type);
        if (additionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureMLServiceLinkedService from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureMLServiceLinkedService if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AzureMLServiceLinkedService.
     */
    public static AzureMLServiceLinkedService fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureMLServiceLinkedService deserializedAzureMLServiceLinkedService = new AzureMLServiceLinkedService();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("version".equals(fieldName)) {
                    deserializedAzureMLServiceLinkedService.withVersion(reader.getString());
                } else if ("connectVia".equals(fieldName)) {
                    deserializedAzureMLServiceLinkedService
                        .withConnectVia(IntegrationRuntimeReference.fromJson(reader));
                } else if ("description".equals(fieldName)) {
                    deserializedAzureMLServiceLinkedService.withDescription(reader.getString());
                } else if ("parameters".equals(fieldName)) {
                    Map<String, ParameterSpecification> parameters
                        = reader.readMap(reader1 -> ParameterSpecification.fromJson(reader1));
                    deserializedAzureMLServiceLinkedService.withParameters(parameters);
                } else if ("annotations".equals(fieldName)) {
                    List<Object> annotations = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedAzureMLServiceLinkedService.withAnnotations(annotations);
                } else if ("typeProperties".equals(fieldName)) {
                    deserializedAzureMLServiceLinkedService.innerTypeProperties
                        = AzureMLServiceLinkedServiceTypeProperties.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    deserializedAzureMLServiceLinkedService.type = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedAzureMLServiceLinkedService.withAdditionalProperties(additionalProperties);

            return deserializedAzureMLServiceLinkedService;
        });
    }
}
