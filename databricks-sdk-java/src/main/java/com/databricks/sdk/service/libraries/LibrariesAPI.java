// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.libraries;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * The Libraries API allows you to install and uninstall libraries and get the
 * status of libraries on a cluster.
 * 
 * To make third-party or custom code available to notebooks and jobs running on
 * your clusters, you can install a library. Libraries can be written in Python,
 * Java, Scala, and R. You can upload Java, Scala, and Python libraries and
 * point to external packages in PyPI, Maven, and CRAN repositories.
 * 
 * Cluster libraries can be used by all notebooks running on a cluster. You can
 * install a cluster library directly from a public repository such as PyPI or
 * Maven, using a previously installed workspace library, or using an init
 * script.
 * 
 * When you install a library on a cluster, a notebook already attached to that
 * cluster will not immediately see the new library. You must first detach and
 * then reattach the notebook to the cluster.
 * 
 * When you uninstall a library from a cluster, the library is removed only when
 * you restart the cluster. Until you restart the cluster, the status of the
 * uninstalled library appears as Uninstall pending restart.
 */
public class LibrariesAPI implements LibrariesService {
    private final ApiClient apiClient;

    public LibrariesAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Get all statuses.
     * 
     * Get the status of all libraries on all clusters. A status will be
     * available for all libraries installed on this cluster via the API or the
     * libraries UI as well as libraries set to be installed on all clusters via
     * the libraries UI.
     */
    @Override
    public ListAllClusterLibraryStatusesResponse allClusterStatuses() {
        String path = "/api/2.0/libraries/all-cluster-statuses";
        return apiClient.GET(path, ListAllClusterLibraryStatusesResponse.class);
    }
    
	/**
     * Get status.
     * 
     * Get the status of libraries on a cluster. A status will be available for
     * all libraries installed on this cluster via the API or the libraries UI
     * as well as libraries set to be installed on all clusters via the
     * libraries UI. The order of returned libraries will be as follows.
     * 
     * 1. Libraries set to be installed on this cluster will be returned first.
     * Within this group, the final order will be order in which the libraries
     * were added to the cluster.
     * 
     * 2. Libraries set to be installed on all clusters are returned next.
     * Within this group there is no order guarantee.
     * 
     * 3. Libraries that were previously requested on this cluster or on all
     * clusters, but now marked for removal. Within this group there is no order
     * guarantee.
     */
    @Override
    public ClusterLibraryStatuses clusterStatus(ClusterStatus request) {
        String path = "/api/2.0/libraries/cluster-status";
        return apiClient.GET(path, request, ClusterLibraryStatuses.class);
    }
    
	/**
     * Add a library.
     * 
     * Add libraries to be installed on a cluster. The installation is
     * asynchronous; it happens in the background after the completion of this
     * request.
     * 
     * **Note**: The actual set of libraries to be installed on a cluster is the
     * union of the libraries specified via this method and the libraries set to
     * be installed on all clusters via the libraries UI.
     */
    @Override
    public void install(InstallLibraries request) {
        String path = "/api/2.0/libraries/install";
        apiClient.POST(path, request, Void.class);
    }
    
	/**
     * Uninstall libraries.
     * 
     * Set libraries to be uninstalled on a cluster. The libraries won't be
     * uninstalled until the cluster is restarted. Uninstalling libraries that
     * are not installed on the cluster will have no impact but is not an error.
     */
    @Override
    public void uninstall(UninstallLibraries request) {
        String path = "/api/2.0/libraries/uninstall";
        apiClient.POST(path, request, Void.class);
    }
    
}