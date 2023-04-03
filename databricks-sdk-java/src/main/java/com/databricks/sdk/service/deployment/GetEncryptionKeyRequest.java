// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get encryption key configuration
 */
public class GetEncryptionKeyRequest {
    /**
     * Databricks encryption key configuration ID.
     */
    
    private String customerManagedKeyId;
    
    public GetEncryptionKeyRequest setCustomerManagedKeyId(String customerManagedKeyId) {
        this.customerManagedKeyId = customerManagedKeyId;
        return this;
    }

    public String getCustomerManagedKeyId() {
        return customerManagedKeyId;
    }
    
}