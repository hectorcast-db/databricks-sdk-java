// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.secrets;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class PutAcl {
    /**
     * The permission level applied to the principal.
     */
    @JsonProperty("permission")
    private AclPermission permission;
    
    /**
     * The principal in which the permission is applied.
     */
    @JsonProperty("principal")
    private String principal;
    
    /**
     * The name of the scope to apply permissions to.
     */
    @JsonProperty("scope")
    private String scope;
    
    public PutAcl setPermission(AclPermission permission) {
        this.permission = permission;
        return this;
    }

    public AclPermission getPermission() {
        return permission;
    }
    
    public PutAcl setPrincipal(String principal) {
        this.principal = principal;
        return this;
    }

    public String getPrincipal() {
        return principal;
    }
    
    public PutAcl setScope(String scope) {
        this.scope = scope;
        return this;
    }

    public String getScope() {
        return scope;
    }
    
}
