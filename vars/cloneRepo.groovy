def call(String repoUrl, String branch = 'main') {
    echo "Cloning repo: ${repoUrl} (branch: ${branch})"
    git url: repoUrl, branch: branch
}
