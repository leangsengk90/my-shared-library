#!/usr/bin/env groovy
import docker.release.Deployer

def call(String imageTag, String containerName){
  Deployer.deployDockerContainer("${imageName}", "${imageTag}")
}


