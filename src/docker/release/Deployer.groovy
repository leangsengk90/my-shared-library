package docker.release

class Deployer implements Serializable {
  static def deployDockerContainer(String imageTag, String containerName) {
    //sh "docker rm -f ${containerName} || true"
    sh "docker run -d -p 81:80 --name ${containerName} ${imageTag}"
  }
}
