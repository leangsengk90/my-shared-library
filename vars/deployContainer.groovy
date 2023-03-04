#!/usr/bin/env groovy
import docker.release.Deployer

def call(Map config=[:]) {
    if (config.type == "slack") {
        echo Deployer.SLACK_MESSAGE
        echo config.message
    } else {
        echo Deployer.EMAIL_MESSAGE
        echo config.message
    }
}



