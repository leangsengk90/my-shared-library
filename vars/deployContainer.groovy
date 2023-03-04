#!/usr/bin/env groovy

import com.example.jenkins.shared.Deployer

def call(String imageTag, String containerName){
  Deployer.deployDockerContainer("${imageName}", "${imageTag}")
}


