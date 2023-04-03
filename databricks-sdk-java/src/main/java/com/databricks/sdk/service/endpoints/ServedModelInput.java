// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.endpoints;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class ServedModelInput {
    /**
     * The name of the model in Databricks Model Registry to be served.
     */
    @JsonProperty("model_name")
    private String modelName;
    
    /**
     * The version of the model in Databricks Model Registry to be served.
     */
    @JsonProperty("model_version")
    private String modelVersion;
    
    /**
     * The name of a served model. It must be unique across an endpoint. If not
     * specified, this field will default to <model-name>-<model-version>. A
     * served model name can consist of alphanumeric characters, dashes, and
     * underscores.
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * Whether the compute resources for the served model should scale down to
     * zero.
     */
    @JsonProperty("scale_to_zero_enabled")
    private Boolean scaleToZeroEnabled;
    
    /**
     * The workload size of the served model. The workload size corresponds to a
     * range of provisioned concurrency that the compute will autoscale between.
     * A single unit of provisioned concurrency can process one request at a
     * time. Valid workload sizes are "Small" (4 - 4 provisioned concurrency),
     * "Medium" (8 - 16 provisioned concurrency), and "Large" (16 - 64
     * provisioned concurrency). If scale-to-zero is enabled, the lower bound of
     * the provisioned concurrency for each workload size will be 0.
     */
    @JsonProperty("workload_size")
    private String workloadSize;
    
    public ServedModelInput setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    public String getModelName() {
        return modelName;
    }
    
    public ServedModelInput setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }

    public String getModelVersion() {
        return modelVersion;
    }
    
    public ServedModelInput setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public ServedModelInput setScaleToZeroEnabled(Boolean scaleToZeroEnabled) {
        this.scaleToZeroEnabled = scaleToZeroEnabled;
        return this;
    }

    public Boolean getScaleToZeroEnabled() {
        return scaleToZeroEnabled;
    }
    
    public ServedModelInput setWorkloadSize(String workloadSize) {
        this.workloadSize = workloadSize;
        return this;
    }

    public String getWorkloadSize() {
        return workloadSize;
    }
    
}