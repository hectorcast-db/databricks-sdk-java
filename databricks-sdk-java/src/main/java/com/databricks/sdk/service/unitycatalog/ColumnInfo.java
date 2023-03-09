// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class ColumnInfo {
    /**
     * User-provided free-form text description.
     */
    @JsonProperty("comment")
    private String comment;
    
    /**
     
     */
    @JsonProperty("mask")
    private ColumnMask mask;
    
    /**
     * Name of Column.
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * Whether field may be Null (default: true).
     */
    @JsonProperty("nullable")
    private Boolean nullable;
    
    /**
     * Partition index for column.
     */
    @JsonProperty("partition_index")
    private Long partitionIndex;
    
    /**
     * Ordinal position of column (starting at position 0).
     */
    @JsonProperty("position")
    private Long position;
    
    /**
     * Format of IntervalType.
     */
    @JsonProperty("type_interval_type")
    private String typeIntervalType;
    
    /**
     * Full data type specification, JSON-serialized.
     */
    @JsonProperty("type_json")
    private String typeJson;
    
    /**
     * Name of type (INT, STRUCT, MAP, etc.).
     */
    @JsonProperty("type_name")
    private ColumnTypeName typeName;
    
    /**
     * Digits of precision; required for DecimalTypes.
     */
    @JsonProperty("type_precision")
    private Long typePrecision;
    
    /**
     * Digits to right of decimal; Required for DecimalTypes.
     */
    @JsonProperty("type_scale")
    private Long typeScale;
    
    /**
     * Full data type specification as SQL/catalogString text.
     */
    @JsonProperty("type_text")
    private String typeText;
    
    public ColumnInfo setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getComment() {
        return comment;
    }
    
    public ColumnInfo setMask(ColumnMask mask) {
        this.mask = mask;
        return this;
    }

    public ColumnMask getMask() {
        return mask;
    }
    
    public ColumnInfo setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public ColumnInfo setNullable(Boolean nullable) {
        this.nullable = nullable;
        return this;
    }

    public Boolean getNullable() {
        return nullable;
    }
    
    public ColumnInfo setPartitionIndex(Long partitionIndex) {
        this.partitionIndex = partitionIndex;
        return this;
    }

    public Long getPartitionIndex() {
        return partitionIndex;
    }
    
    public ColumnInfo setPosition(Long position) {
        this.position = position;
        return this;
    }

    public Long getPosition() {
        return position;
    }
    
    public ColumnInfo setTypeIntervalType(String typeIntervalType) {
        this.typeIntervalType = typeIntervalType;
        return this;
    }

    public String getTypeIntervalType() {
        return typeIntervalType;
    }
    
    public ColumnInfo setTypeJson(String typeJson) {
        this.typeJson = typeJson;
        return this;
    }

    public String getTypeJson() {
        return typeJson;
    }
    
    public ColumnInfo setTypeName(ColumnTypeName typeName) {
        this.typeName = typeName;
        return this;
    }

    public ColumnTypeName getTypeName() {
        return typeName;
    }
    
    public ColumnInfo setTypePrecision(Long typePrecision) {
        this.typePrecision = typePrecision;
        return this;
    }

    public Long getTypePrecision() {
        return typePrecision;
    }
    
    public ColumnInfo setTypeScale(Long typeScale) {
        this.typeScale = typeScale;
        return this;
    }

    public Long getTypeScale() {
        return typeScale;
    }
    
    public ColumnInfo setTypeText(String typeText) {
        this.typeText = typeText;
        return this;
    }

    public String getTypeText() {
        return typeText;
    }
    
}
