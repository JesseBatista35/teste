Prezados, desde a semana passada estamos tentando fazer deploy via pipeline e a esteira da error.

Exemplo:
  #13 22.40 [ERROR]     Unresolveable build extension: Plugin io.quarkus.platform:quarkus-maven-plugin:3.27.2 or one of its dependencies could not be resolved:
  #13 22.40 [ERROR]     Failed to read artifact descriptor for io.quarkus.platform:quarkus-maven-plugin:jar:3.27.2
  #13 22.40 [ERROR]     -> [Help 2]
  #13 22.40 [ERROR]     Non-resolvable import POM: The following artifacts could not be resolved: io.quarkus.platform:quarkus-bom:pom:3.27.2 (absent): Could not transfer artifact io.quarkus.platform:quarkus-bom:pom:3.27.2 from/to Nexus Caixa (https://binario.caixa/repository/caixa-group-br): Connect to binario.caixa:443 [binario.caixa/10.122.155.40] failed: Connect timed out @ line 31, column 25 -> [Help 3]

https://github.com/caixagithub/sisfm-backend-painelconta/actions/runs/34846602950/job/104011298622


Esse problema ocorre ha quase 2 semanas, não há correção, e está afetando o desenvolvimento e entrega de sistemas.




Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
sisfm-backend-painelconta
Repository navigation
Code
Issues
Pull requests
1
 (1)
Actions
Projects
Wiki
Security and quality
1
 (1)
Insights
Settings
CI/CD Workflow Generic
caixagithub/sisfm-backend-painelconta_develop_34846602950.14 #14
All jobs
Run details
Annotations
1 error and 1 warning
CI_DES / BUILD / BUILD
failed 5 hours ago in 1m 50s
Search logs
8s
1s
0s
1s
25s
0s
0s
0s
0s
59s
Configure AWS Credentials
1s
Assume role in PAAS account
0s
Login to ECR
0s
Connecting on Registry
0s
Docker meta
2s
Checkout DevSecOps config repo
1s
Localiza arquivos nexus
0s
Show nexus
0s
Inject nexus repo
0s
Build and push
39s
  Node 20 is being deprecated. This workflow is running with Node 24 by default. If you need to temporarily use Node 20, you can set the ACTIONS_ALLOW_USE_UNSECURE_NODE_VERSION=true environment variable. For more information see: https://github.blog/changelog/2025-09-19-deprecation-of-node-20-on-github-actions-runners/
Run docker/build-push-action@v6
  (node:1448) [DEP0040] DeprecationWarning: The `punycode` module is deprecated. Please use a userland alternative instead.
  (Use `node --trace-deprecation ...` to show where the warning was created)
GitHub Actions runtime token ACs
Docker info
Proxy configuration
Buildx version
Builder info
  /usr/bin/docker buildx build --cache-from type=registry,ref=027574771582.dkr.ecr.sa-east-1.amazonaws.com/sisfm/backend-painelconta/sisfm-backend-painelconta:buildcache --cache-to type=registry,ref=027574771582.dkr.ecr.sa-east-1.amazonaws.com/sisfm/backend-painelconta/sisfm-backend-painelconta:cache,mode=max --file ./Dockerfile --iidfile /home/runner/_work/_temp/docker-actions-toolkit-hmOiuG/build-iidfile-4510dea6b9.txt --label org.opencontainers.image.created=2026-09-14T14:19:29.346Z --label org.opencontainers.image.description=Adicionando aplicação: sisfm-backend-painelconta --label org.opencontainers.image.licenses= --label org.opencontainers.image.revision=63bf636545d6950588c89619662cad3143449380 --label org.opencontainers.image.source=https://github.com/caixagithub/sisfm-backend-painelconta --label org.opencontainers.image.title=sisfm-backend-painelconta --label org.opencontainers.image.url=https://github.com/caixagithub/sisfm-backend-painelconta --label org.opencontainers.image.version=34846602950 --platform linux/amd64 --attest type=provenance,mode=min,inline-only=true,builder-id=https://github.com/caixagithub/sisfm-backend-painelconta/actions/runs/34846602950/attempts/2 --tag 027574771582.dkr.ecr.sa-east-1.amazonaws.com/sisfm/backend-painelconta/sisfm-backend-painelconta:34846602950 --metadata-file /home/runner/_work/_temp/docker-actions-toolkit-hmOiuG/build-metadata-40cb438fea.json --push .
  #0 building with "builder-88338838-e846-4ba3-93f4-f50fcabff001" instance using docker-container driver
  
  #1 [internal] load build definition from Dockerfile
  #1 transferring dockerfile: 1.20kB done
  #1 DONE 0.0s
  
  #2 [internal] load metadata for docker.io/library/maven:3-eclipse-temurin-21
  #2 ...
  
  #3 [internal] load metadata for registry.access.redhat.com/ubi8/openjdk-21:1.21
  #3 DONE 1.0s
  
  #2 [internal] load metadata for docker.io/library/maven:3-eclipse-temurin-21
  #2 DONE 1.3s
  
  #4 [internal] load .dockerignore
  #4 transferring context: 162B done
  #4 DONE 0.0s
  
  #5 [internal] load build context
  #5 DONE 0.0s
  
  #6 [deploy 1/6] FROM registry.access.redhat.com/ubi8/openjdk-21:1.21@sha256:3b7cce76a6a4ece683ea698e9bc5bf929cce4f46d680959b62f88adf66a84531
  #6 resolve registry.access.redhat.com/ubi8/openjdk-21:1.21@sha256:3b7cce76a6a4ece683ea698e9bc5bf929cce4f46d680959b62f88adf66a84531 done
  #6 DONE 0.0s
  
  #7 [auth] sharing credentials for 027574771582.dkr.ecr.sa-east-1.amazonaws.com
  #7 DONE 0.0s
  
  #8 importing cache manifest from 027574771582.dkr.ecr.sa-east-1.amazonaws.com/sisfm/backend-painelconta/sisfm-backend-painelconta:buildcache
  #8 ERROR: failed to configure registry cache importer: 027574771582.dkr.ecr.sa-east-1.amazonaws.com/sisfm/backend-painelconta/sisfm-backend-painelconta:buildcache: not found
  
  #9 [build 1/5] FROM docker.io/library/maven:3-eclipse-temurin-21@sha256:a972570be789ee5c9fa23446a8914ac7327560b5c022f662cfa9452aef829f18
  #9 resolve docker.io/library/maven:3-eclipse-temurin-21@sha256:a972570be789ee5c9fa23446a8914ac7327560b5c022f662cfa9452aef829f18 0.0s done
  #9 DONE 0.1s
  
  #6 [deploy 1/6] FROM registry.access.redhat.com/ubi8/openjdk-21:1.21@sha256:3b7cce76a6a4ece683ea698e9bc5bf929cce4f46d680959b62f88adf66a84531
  #6 ...
  
  #5 [internal] load build context
  #5 transferring context: 1.24MB 0.1s done
  #5 DONE 0.2s
  
  #6 [deploy 1/6] FROM registry.access.redhat.com/ubi8/openjdk-21:1.21@sha256:3b7cce76a6a4ece683ea698e9bc5bf929cce4f46d680959b62f88adf66a84531
  #6 sha256:2f1f0f48d0c4d92bc7b8fec1bc7a93d3e634341058fbc3fe43f0c8c5496a8255 0B / 123.88MB 0.2s
  #6 sha256:d477d8e686b60be3fdf5408547054e112042c9b4f8dc45c5f30fa2db4fdc5956 0B / 39.51MB 0.2s
  #6 sha256:2f1f0f48d0c4d92bc7b8fec1bc7a93d3e634341058fbc3fe43f0c8c5496a8255 8.39MB / 123.88MB 0.3s
  #6 sha256:2f1f0f48d0c4d92bc7b8fec1bc7a93d3e634341058fbc3fe43f0c8c5496a8255 23.07MB / 123.88MB 0.5s
  #6 sha256:2f1f0f48d0c4d92bc7b8fec1bc7a93d3e634341058fbc3fe43f0c8c5496a8255 35.65MB / 123.88MB 0.6s
  #6 sha256:d477d8e686b60be3fdf5408547054e112042c9b4f8dc45c5f30fa2db4fdc5956 12.58MB / 39.51MB 0.6s
  #6 sha256:2f1f0f48d0c4d92bc7b8fec1bc7a93d3e634341058fbc3fe43f0c8c5496a8255 44.04MB / 123.88MB 0.8s
  #6 sha256:d477d8e686b60be3fdf5408547054e112042c9b4f8dc45c5f30fa2db4fdc5956 22.02MB / 39.51MB 0.8s
  #6 sha256:2f1f0f48d0c4d92bc7b8fec1bc7a93d3e634341058fbc3fe43f0c8c5496a8255 56.62MB / 123.88MB 0.9s
0s
7s
0s
0s
1s
1s
0s





