#!/usr/bin/env groovy

import com.example.jenkins.shared.Deployer

def call(String imageName, String containerName){
  Deployer.deployDockerContainer("${imageName}", "${containerName}")
}


