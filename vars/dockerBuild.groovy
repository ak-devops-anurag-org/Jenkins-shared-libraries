def call(String ImageName, String ImageTag, String DockerHubUser) {
    sh """
        // export DOCKER_BUILDKIT=1
        docker build -t ${DockerHubUser}/${ImageName}:${ImageTag} .
    """
}
