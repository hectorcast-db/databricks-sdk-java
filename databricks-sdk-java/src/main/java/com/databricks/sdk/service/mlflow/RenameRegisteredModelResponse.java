// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class RenameRegisteredModelResponse {
    /**
     
     */
    @JsonProperty("registered_model")
    private RegisteredModel registeredModel;
    
    public RenameRegisteredModelResponse setRegisteredModel(RegisteredModel registeredModel) {
        this.registeredModel = registeredModel;
        return this;
    }

    public RegisteredModel getRegisteredModel() {
        return registeredModel;
    }
    
}