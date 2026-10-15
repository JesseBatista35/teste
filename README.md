


Solicita-se suporte para análise do erro apresentado na esteira do projeto SIARX Backend Autoridade de Registro (siarx-backend-autoridade-registro), durante a execução do build na etapa Docker Container Build, visando identificar a causa da falha e orientar as ações necessárias para conclusão do build e disponibilização do ambiente DES.


Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
siarx-backend-autoridade-registro
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
caixagithub/siarx-backend-autoridade-registro_main_34386495130.1 #1
All jobs
Run details
Annotations
1 error and 1 warning
CI_DES / BUILD / BUILD
failed on Sep 9 in 1m 1s
Search logs
9s
0s
1s
1s
23s
0s
0s
0s
0s
14s
Run caixagithub/DevSecOps-Actions/.github/chaintools/dockercontainer/build@main
  with:
    buildContext: /home/runner/_work/siarx-backend-autoridade-registro/siarx-backend-autoridade-registro
    sigla: siarx
    modulo: backend-autoridade-registro
    uses_packages: false
    uses_nexus: false
    client_id_runner: ***
    github_token_org: ***
    repository: siarx-backend-autoridade-registro
    command: build
    Dockerfile: ./Dockerfile
  env:
    pythonLocation: /home/runner/_work/_tool/Python/3.11.16/x64
    PKG_CONFIG_PATH: /home/runner/_work/_tool/Python/3.11.16/x64/lib/pkgconfig
    Python_ROOT_DIR: /home/runner/_work/_tool/Python/3.11.16/x64
    Python2_ROOT_DIR: /home/runner/_work/_tool/Python/3.11.16/x64
    Python3_ROOT_DIR: /home/runner/_work/_tool/Python/3.11.16/x64
    LD_LIBRARY_PATH: /home/runner/_work/_tool/Python/3.11.16/x64/lib
    REPOSITORY_ARTIFACTS_APP: NEXUS
    LANGUAGES: ["java"]
    Informe o nome da variavel usada no projeto: Informe o valor referente a esta variavel
Set up QEMU
8s
  Node 20 is being deprecated. This workflow is running with Node 24 by default. If you need to temporarily use Node 20, you can set the ACTIONS_ALLOW_USE_UNSECURE_NODE_VERSION=true environment variable. For more information see: https://github.blog/changelog/2025-09-19-deprecation-of-node-20-on-github-actions-runners/
Run docker/setup-qemu-action@v3
Docker info
Pulling binfmt Docker image
Image info
Binfmt version
Installing QEMU static binaries
Extracting available platforms
Set up Docker Buildx
6s
  Node 20 is being deprecated. This workflow is running with Node 24 by default. If you need to temporarily use Node 20, you can set the ACTIONS_ALLOW_USE_UNSECURE_NODE_VERSION=true environment variable. For more information see: https://github.blog/changelog/2025-09-19-deprecation-of-node-20-on-github-actions-runners/
Run docker/setup-buildx-action@v3
  (node:704) [DEP0040] DeprecationWarning: The `punycode` module is deprecated. Please use a userland alternative instead.
  (Use `node --trace-deprecation ...` to show where the warning was created)
Docker info
Buildx version
Inspecting default docker context
Creating a new builder instance
Booting builder
Inspect builder
0s
6s
0s
0s
1s
0s
0s



GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
siarx-backend-autoridade-registro-infraprd
Repository navigation
Code
Issues
Pull requests
Actions
Projects
Wiki
Security and quality
Insights
Settings
caixagithub
siarx-backend-autoridade-registro-infraprd
Private
Go to file
t
T
ansible-connect-emu[bot]
ansible-connect-emu[bot]
Merge pull request #1 from caixagithub/feature/add-files-siarx-backen…
c866163
 · 
last month
Name		
plt
PR automático
last month
prd
PR automático
last month
README.md
Initial commit
last month
Repository files navigation
README
siarx-backend-autoridade-registro-infraprd
Adicionando aplicação: siarx-backend-autoridade-registro-infraprd

About

Adicionando aplicação: siarx-backend-autoridade-registro-infraprd

Topics
Resources
Readme
Activity
Custom properties
Stars
0 stars
Watchers
0 watching
Forks
0 forks
Releases
No releases published
Create a new release
Packages
No packages published
Publish your first package
Contributors
No contributors



 é outra w.o mais acho que é o mesmo problem tem que sanitizar
