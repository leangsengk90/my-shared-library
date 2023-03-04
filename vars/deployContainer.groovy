#!/usr/bin/env groovy
import docker.release.Deployer

Deployer.deployDockerContainer("${containerName}", "${imageTag}")


