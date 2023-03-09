// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class ModelVersion {
    /**
     * Timestamp recorded when this `model_version` was created.
     */
    @JsonProperty("creation_timestamp")
    private Long creationTimestamp;
    
    /**
     * Current stage for this `model_version`.
     */
    @JsonProperty("current_stage")
    private String currentStage;
    
    /**
     * Description of this `model_version`.
     */
    @JsonProperty("description")
    private String description;
    
    /**
     * Timestamp recorded when metadata for this `model_version` was last
     * updated.
     */
    @JsonProperty("last_updated_timestamp")
    private Long lastUpdatedTimestamp;
    
    /**
     * Unique name of the model
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * MLflow run ID used when creating `model_version`, if `source` was
     * generated by an experiment run stored in MLflow tracking server.
     */
    @JsonProperty("run_id")
    private String runId;
    
    /**
     * Run Link: Direct link to the run that generated this version
     */
    @JsonProperty("run_link")
    private String runLink;
    
    /**
     * URI indicating the location of the source model artifacts, used when
     * creating `model_version`
     */
    @JsonProperty("source")
    private String source;
    
    /**
     * Current status of `model_version`
     */
    @JsonProperty("status")
    private ModelVersionStatus status;
    
    /**
     * Details on current `status`, if it is pending or failed.
     */
    @JsonProperty("status_message")
    private String statusMessage;
    
    /**
     * Tags: Additional metadata key-value pairs for this `model_version`.
     */
    @JsonProperty("tags")
    private java.util.List<ModelVersionTag> tags;
    
    /**
     * User that created this `model_version`.
     */
    @JsonProperty("user_id")
    private String userId;
    
    /**
     * Model's version number.
     */
    @JsonProperty("version")
    private String version;
    
    public ModelVersion setCreationTimestamp(Long creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    public Long getCreationTimestamp() {
        return creationTimestamp;
    }
    
    public ModelVersion setCurrentStage(String currentStage) {
        this.currentStage = currentStage;
        return this;
    }

    public String getCurrentStage() {
        return currentStage;
    }
    
    public ModelVersion setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }
    
    public ModelVersion setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        return this;
    }

    public Long getLastUpdatedTimestamp() {
        return lastUpdatedTimestamp;
    }
    
    public ModelVersion setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public ModelVersion setRunId(String runId) {
        this.runId = runId;
        return this;
    }

    public String getRunId() {
        return runId;
    }
    
    public ModelVersion setRunLink(String runLink) {
        this.runLink = runLink;
        return this;
    }

    public String getRunLink() {
        return runLink;
    }
    
    public ModelVersion setSource(String source) {
        this.source = source;
        return this;
    }

    public String getSource() {
        return source;
    }
    
    public ModelVersion setStatus(ModelVersionStatus status) {
        this.status = status;
        return this;
    }

    public ModelVersionStatus getStatus() {
        return status;
    }
    
    public ModelVersion setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    public String getStatusMessage() {
        return statusMessage;
    }
    
    public ModelVersion setTags(java.util.List<ModelVersionTag> tags) {
        this.tags = tags;
        return this;
    }

    public java.util.List<ModelVersionTag> getTags() {
        return tags;
    }
    
    public ModelVersion setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getUserId() {
        return userId;
    }
    
    public ModelVersion setVersion(String version) {
        this.version = version;
        return this;
    }

    public String getVersion() {
        return version;
    }
    
}
