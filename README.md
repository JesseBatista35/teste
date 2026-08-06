Favor verificar o  Erro na hora do BUILD em DES

Repositório: siaci-api-integracao-padrao-java

https://github.com/caixagithub/siaci-api-integracao-padrao-java/actions/runs/31044766822/job/92437744197

Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
siaci-api-integracao-padrao-java
Repository navigation
Code
Issues
Pull requests
Actions
Projects
Wiki
Security and quality
2
 (2)
Insights
Settings
CI/CD Workflow Generic
caixagithub/siaci-api-integracao-padrao-java_main_31044766822.7 #7
All jobs
Run details
Annotations
1 error and 1 warning
CI_DES / BUILD / BUILD
failed 16 hours ago in 2m 41s
Search logs
7s
1s
0s
1s
14s
0s
9s
23s
0s
1m 31s
Run caixagithub/DevSecOps-Actions/.github/chaintools/dockercontainer/build@main
  with:
    buildContext: /home/runner/_work/siaci-api-integracao-padrao-java/siaci-api-integracao-padrao-java
    sigla: siaci
    modulo: api-integracao-padrao-java
    uses_packages: true
    uses_nexus: false
    client_id_runner: ***
    cloud_provider: azure
    github_token_org: ***
    repository: siaci-api-integracao-padrao-java
    command: build
    Dockerfile: ./Dockerfile
  env:
    pythonLocation: /home/runner/_work/_tool/Python/3.11.15/x64
    PKG_CONFIG_PATH: /home/runner/_work/_tool/Python/3.11.15/x64/lib/pkgconfig
    Python_ROOT_DIR: /home/runner/_work/_tool/Python/3.11.15/x64
    Python2_ROOT_DIR: /home/runner/_work/_tool/Python/3.11.15/x64
    Python3_ROOT_DIR: /home/runner/_work/_tool/Python/3.11.15/x64
    LD_LIBRARY_PATH: /home/runner/_work/_tool/Python/3.11.15/x64/lib
    LANGUAGES: ["java"]
    REPOSITORY_ARTIFACTS_APP: PACKAGES
Package Connect Dotnet
0s
Package Connect Java
0s
Run cat > settings.xml <<'EOF'
Set up QEMU
9s
  Node 20 is being deprecated. This workflow is running with Node 24 by default. If you need to temporarily use Node 20, you can set the ACTIONS_ALLOW_USE_UNSECURE_NODE_VERSION=true environment variable. For more information see: https://github.blog/changelog/2025-09-19-deprecation-of-node-20-on-github-actions-runners/
Run docker/setup-qemu-action@v3
Docker info
Pulling binfmt Docker image
Image info
Binfmt version
Installing QEMU static binaries
0s
8s
0s
1s
0s
1s
0s




