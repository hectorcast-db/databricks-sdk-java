// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.tokens;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class PublicTokenInfo {
    /**
     * Comment the token was created with, if applicable.
     */
    @JsonProperty("comment")
    private String comment;
    
    /**
     * Server time (in epoch milliseconds) when the token was created.
     */
    @JsonProperty("creation_time")
    private Long creationTime;
    
    /**
     * Server time (in epoch milliseconds) when the token will expire, or -1 if
     * not applicable.
     */
    @JsonProperty("expiry_time")
    private Long expiryTime;
    
    /**
     * The ID of this token.
     */
    @JsonProperty("token_id")
    private String tokenId;
    
    public PublicTokenInfo setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getComment() {
        return comment;
    }
    
    public PublicTokenInfo setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public Long getCreationTime() {
        return creationTime;
    }
    
    public PublicTokenInfo setExpiryTime(Long expiryTime) {
        this.expiryTime = expiryTime;
        return this;
    }

    public Long getExpiryTime() {
        return expiryTime;
    }
    
    public PublicTokenInfo setTokenId(String tokenId) {
        this.tokenId = tokenId;
        return this;
    }

    public String getTokenId() {
        return tokenId;
    }
    
}
