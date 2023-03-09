// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get storage configuration
 */
public class GetStorageRequest {
    /**
     * Databricks Account API storage configuration ID.
     */
    
    private String storageConfigurationId;
    
    public GetStorageRequest setStorageConfigurationId(String storageConfigurationId) {
        this.storageConfigurationId = storageConfigurationId;
        return this;
    }

    public String getStorageConfigurationId() {
        return storageConfigurationId;
    }
    
}
