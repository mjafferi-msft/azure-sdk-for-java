// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storageimportexport.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.storageimportexport.fluent.models.ExportBlobList;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * A property containing information about the blobs to be exported for an export job. This property is required for
 * export jobs, but must not be specified for import jobs.
 */
@Fluent
public final class Export {
    /*
     * A list of the blobs to be exported.
     */
    @JsonProperty(value = "blobList")
    private ExportBlobList innerBlobList;

    /*
     * The relative URI to the block blob that contains the list of blob paths or blob path prefixes as defined above,
     * beginning with the container name. If the blob is in root container, the URI must begin with $root.
     */
    @JsonProperty(value = "blobListBlobPath")
    private String blobListBlobPath;

    /** Creates an instance of Export class. */
    public Export() {
    }

    /**
     * Get the innerBlobList property: A list of the blobs to be exported.
     *
     * @return the innerBlobList value.
     */
    private ExportBlobList innerBlobList() {
        return this.innerBlobList;
    }

    /**
     * Get the blobListBlobPath property: The relative URI to the block blob that contains the list of blob paths or
     * blob path prefixes as defined above, beginning with the container name. If the blob is in root container, the URI
     * must begin with $root.
     *
     * @return the blobListBlobPath value.
     */
    public String blobListBlobPath() {
        return this.blobListBlobPath;
    }

    /**
     * Set the blobListBlobPath property: The relative URI to the block blob that contains the list of blob paths or
     * blob path prefixes as defined above, beginning with the container name. If the blob is in root container, the URI
     * must begin with $root.
     *
     * @param blobListBlobPath the blobListBlobPath value to set.
     * @return the Export object itself.
     */
    public Export withBlobListBlobPath(String blobListBlobPath) {
        this.blobListBlobPath = blobListBlobPath;
        return this;
    }

    /**
     * Get the blobPath property: A collection of blob-path strings.
     *
     * @return the blobPath value.
     */
    public List<String> blobPath() {
        return this.innerBlobList() == null ? null : this.innerBlobList().blobPath();
    }

    /**
     * Set the blobPath property: A collection of blob-path strings.
     *
     * @param blobPath the blobPath value to set.
     * @return the Export object itself.
     */
    public Export withBlobPath(List<String> blobPath) {
        if (this.innerBlobList() == null) {
            this.innerBlobList = new ExportBlobList();
        }
        this.innerBlobList().withBlobPath(blobPath);
        return this;
    }

    /**
     * Get the blobPathPrefix property: A collection of blob-prefix strings.
     *
     * @return the blobPathPrefix value.
     */
    public List<String> blobPathPrefix() {
        return this.innerBlobList() == null ? null : this.innerBlobList().blobPathPrefix();
    }

    /**
     * Set the blobPathPrefix property: A collection of blob-prefix strings.
     *
     * @param blobPathPrefix the blobPathPrefix value to set.
     * @return the Export object itself.
     */
    public Export withBlobPathPrefix(List<String> blobPathPrefix) {
        if (this.innerBlobList() == null) {
            this.innerBlobList = new ExportBlobList();
        }
        this.innerBlobList().withBlobPathPrefix(blobPathPrefix);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerBlobList() != null) {
            innerBlobList().validate();
        }
    }
}
