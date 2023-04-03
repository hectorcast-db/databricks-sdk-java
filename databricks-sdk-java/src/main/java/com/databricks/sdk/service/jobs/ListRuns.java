// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * List runs for a job
 */
public class ListRuns {
    /**
     * If active_only is `true`, only active runs are included in the results;
     * otherwise, lists both active and completed runs. An active run is a run
     * in the `PENDING`, `RUNNING`, or `TERMINATING`. This field cannot be
     * `true` when completed_only is `true`.
     */
    @QueryParam("active_only")
    private Boolean activeOnly;
    
    /**
     * If completed_only is `true`, only completed runs are included in the
     * results; otherwise, lists both active and completed runs. This field
     * cannot be `true` when active_only is `true`.
     */
    @QueryParam("completed_only")
    private Boolean completedOnly;
    
    /**
     * Whether to include task and cluster details in the response.
     */
    @QueryParam("expand_tasks")
    private Boolean expandTasks;
    
    /**
     * The job for which to list runs. If omitted, the Jobs service lists runs
     * from all jobs.
     */
    @QueryParam("job_id")
    private Long jobId;
    
    /**
     * The number of runs to return. This value must be greater than 0 and less
     * than 25. The default value is 25. If a request specifies a limit of 0,
     * the service instead uses the maximum limit.
     */
    @QueryParam("limit")
    private Long limit;
    
    /**
     * The offset of the first run to return, relative to the most recent run.
     */
    @QueryParam("offset")
    private Long offset;
    
    /**
     * The type of runs to return. For a description of run types, see
     * :method:jobs/getRun.
     */
    @QueryParam("run_type")
    private ListRunsRunType runType;
    
    /**
     * Show runs that started _at or after_ this value. The value must be a UTC
     * timestamp in milliseconds. Can be combined with _start_time_to_ to filter
     * by a time range.
     */
    @QueryParam("start_time_from")
    private Long startTimeFrom;
    
    /**
     * Show runs that started _at or before_ this value. The value must be a UTC
     * timestamp in milliseconds. Can be combined with _start_time_from_ to
     * filter by a time range.
     */
    @QueryParam("start_time_to")
    private Long startTimeTo;
    
    public ListRuns setActiveOnly(Boolean activeOnly) {
        this.activeOnly = activeOnly;
        return this;
    }

    public Boolean getActiveOnly() {
        return activeOnly;
    }
    
    public ListRuns setCompletedOnly(Boolean completedOnly) {
        this.completedOnly = completedOnly;
        return this;
    }

    public Boolean getCompletedOnly() {
        return completedOnly;
    }
    
    public ListRuns setExpandTasks(Boolean expandTasks) {
        this.expandTasks = expandTasks;
        return this;
    }

    public Boolean getExpandTasks() {
        return expandTasks;
    }
    
    public ListRuns setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }

    public Long getJobId() {
        return jobId;
    }
    
    public ListRuns setLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    public Long getLimit() {
        return limit;
    }
    
    public ListRuns setOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    public Long getOffset() {
        return offset;
    }
    
    public ListRuns setRunType(ListRunsRunType runType) {
        this.runType = runType;
        return this;
    }

    public ListRunsRunType getRunType() {
        return runType;
    }
    
    public ListRuns setStartTimeFrom(Long startTimeFrom) {
        this.startTimeFrom = startTimeFrom;
        return this;
    }

    public Long getStartTimeFrom() {
        return startTimeFrom;
    }
    
    public ListRuns setStartTimeTo(Long startTimeTo) {
        this.startTimeTo = startTimeTo;
        return this;
    }

    public Long getStartTimeTo() {
        return startTimeTo;
    }
    
}