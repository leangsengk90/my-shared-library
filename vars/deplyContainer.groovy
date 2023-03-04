#!/usr/bin/env groovy

import com.example.jenkins.shared.Deployer

Deployer.deployDockerContainer('nginx:latest', 'my-nginx')
