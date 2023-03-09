// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ipaccesslists;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get access list
 */
public class Get {
    /**
     * The ID for the corresponding IP access list to modify.
     */
    
    private String ipAccessListId;
    
    public Get setIpAccessListId(String ipAccessListId) {
        this.ipAccessListId = ipAccessListId;
        return this;
    }

    public String getIpAccessListId() {
        return ipAccessListId;
    }
    
}
