#!/usr/bin/env groovy
@Library('my-shared-library')
import com.example.jenkins.shared.Deployer

def call(String imageTag, String containerName){
  Deployer.deployDockerContainer("${imageName}", "${imageTag}")
}


