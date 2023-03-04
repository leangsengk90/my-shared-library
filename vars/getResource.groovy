#!/usr/bin/env groovy

def call(String username){
  def deploy = libraryResource 'scripts/frontend/deploy.sh'
  writeFile(file: './deploy-script.sh', text: "${deploy}")
  sh "bash ./deploy-script.sh ${username}"
}
