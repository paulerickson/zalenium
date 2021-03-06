package de.zalando.ep.zalenium.container;

import java.io.InputStream;
import java.net.URL;
import java.util.Map;

public interface ContainerClient {
    
    String NODE_MOUNT_POINT = "/tmp/node";

    void setNodeId(String nodeId);

    ContainerClientRegistration registerNode(String zaleniumContainerName, URL remoteHost);

    InputStream copyFiles(String containerId, String folderName);

    void stopContainer(String containerId);

    void executeCommand(String containerId, String[] command, boolean waitForExecution);

    String getLatestDownloadedImage(String imageName);

    String getLabelValue(String image, String label);

    int getRunningContainers(String image);

    boolean createContainer(String zaleniumContainerName, String image, Map<String, String> envVars, String nodePort);

    void initialiseContainerEnvironment();

    String getContainerIp(String containerName);
}
