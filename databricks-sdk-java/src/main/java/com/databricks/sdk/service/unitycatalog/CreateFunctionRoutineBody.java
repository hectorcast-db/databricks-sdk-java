// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Function language. When **EXTERNAL** is used, the language of the routine
 * function should be specified in the __external_language__ field, and the
 * __return_params__ of the function cannot be used (as **TABLE** return type is
 * not supported), and the __sql_data_access__ field must be **NO_SQL**.
 */
public enum CreateFunctionRoutineBody{
    EXTERNAL,
    SQL,
    
}