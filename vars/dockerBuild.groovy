def call(String ImageName, String ImageTag, String DockerHubUser) {
    echo "Creating docker build (docker image)"
    sh "docker build -t ${DockerHubUser}/${ImageName}:${ImageTag} ."
}
