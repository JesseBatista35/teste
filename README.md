o log é esse


Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
siidp-backend-arquitetura-referencia
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
caixagithub/siidp-backend-arquitetura-referencia_develop_35361748176.2 #2
All jobs
Run details
Annotations
1 error and 1 warning
CI_DES / BUILD / BUILD
failed 4 days ago in 1m 15s
Search logs
10s
1s
0s
1s
23s
0s
0s
0s
0s
23s
Run caixagithub/DevSecOps-Actions/.github/chaintools/dockercontainer/build@main
  with:
    buildContext: /home/runner/_work/siidp-backend-arquitetura-referencia/siidp-backend-arquitetura-referencia
    sigla: siidp
    modulo: backend-arquitetura-referencia
    uses_packages: false
    uses_nexus: false
    client_id_runner: ***
    cloud_provider: aws
    github_token_org: ***
    repository: siidp-backend-arquitetura-referencia
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
10s
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
0s
9s
0s
1s
0s
1s
0s


------- 
siidp-backend-arquitetura-referencia-infranprd/des
/values.yaml




caixa-base-chart:
#-------#
# IMAGE #
#-------#
  image:
    # variavel de imagem do tipo de aplicação
    repository: registry/repo-app  ## Atualizados pela pipeline
    tag: "1.0.0" ## Atualizados pela pipeline
    pullPolicy: Always
#-----#
# HPA #
#-----#
  replicaCount: 1
  autoscaling:
    enabled: false
    minReplicas: 1
    maxReplicas: 3
    targetCPUUtilizationPercentage: 85
    targetMemoryUtilizationPercentage: 85
#-----------------#
# ROLLING UPDATE STRATEGY #
#-----------------#
  strategy:
    maxSurge: 25%
    maxUnavailable: 50%
#-----------#
#  SERVICE  #
#-----------#
  service:
    type: "ClusterIP"
    ports:
      - name: "port"
        protocol: TCP
        port: 80
        targetPort: 8080
#---------#
# INGRESS #
#---------#
  istio:  
    - name: internal
      enabled: true
      certificate: true
      gateway_prefix: eks
      servers:
      - port:
          number: 443
          name: https-default
          protocol: HTTPS
        tls:
          mode: SIMPLE
          credentialName: siidp-backend-arquitetura-referencia-hmp-nprd
        hosts:
        - "siidp-backend-arquitetura-referencia.apl.hmp.private.aws"
      #- port:
      #    number: 443
      #    name: https-custom
      #    protocol: HTTPS
      #  tls:
      #    mode: SIMPLE
      #    credentialName: akvs-siidp-backend-arquitetura-referencia-certificate # Nome do secret do certificado
      #  hosts:
      #    - siidp-backend-arquitetura-referencia.hmp-nprd.caixa
      prefix:
        - /
      targetPort: 80 
#-------------#
#  RESOURCES  #
#-------------#
  resources:
    requests:
      cpu: 250m
      memory: 256Mi
    limits:
      cpu: 500m
      memory: 512Mi
#----------#
#  PROBES  #
#----------#
  probes:  
    enabled: true
    useDefaults: false  
    livenessProbe: 
      initialDelaySeconds: 30
      periodSeconds: 15
      failureThreshold: 10
      successThreshold: 1
      httpGet:
        path: /q/health/live     
        port: 8080
    readinessProbe: 
      initialDelaySeconds: 15
      periodSeconds: 15
      failureThreshold: 3
      successThreshold: 1
      httpGet:
        path: /q/health/ready     
        port: 8080
#-------------#
#  CONFIGMAP  #
#-------------#
  configMapRefs:
    - name: cm-siidp-backend-arquitetura-referencia
#-------------# 
#   SECRETS   # 
#-------------# 
#  secretRefs:
#  env:
#    - name: <NOME_DA_VARIAVEL_NA_APLICACAO>
#      value: akvs-siidp-backend-arquitetura-referencia@azurekeyvault


siidp-backend-arquitetura-referencia-infranprd/des/templates
/cm-siidp-backend-arquitetura-referencia.yaml


apiVersion: v1
kind: ConfigMap
metadata:
  name: cm-siidp-backend-arquitetura-referencia
  labels:
    {{- include "caixa-base-chart.labels" . | nindent 4 }}
data:
  KEY: "VALUE"



Code
Issues
Pull requests
Actions
Projects
Wiki
Security and quality
Insights
Settings
Files
Go to file
t
T
templates content loaded
des
templates
akvs-siidp-backend-arquitetura-referencia.yaml
cm-siidp-backend-arquitetura-referencia.yaml
.helmignore
Chart.yaml
README.md
ci_cd_variables.yaml
values.yaml
hmp
tqs
tst
README.md
siidp-backend-arquitetura-referencia-infranprd/des/templates
/akvs-siidp-backend-arquitetura-referencia.yaml



gitops/apps/siidp-backend-arquitetura-referencia/des
/config.yaml

app:
  name: siidp-backend-arquitetura-referencia-hmp
project:
  name: hmp
labels:
  appName: siidp-backend-arquitetura-referencia
  environment: hmp
source:
  repo: "https://github.com/caixagithub/siidp-backend-arquitetura-referencia-infranprd"
  path: hmp
sourcevar:
  repo: "https://github.com/caixagithub/siidp-globalnprd"
  path: hmp
  values: global.yaml  
cluster:
  destination:  
    name: eks-siidp-nprd
    namespace: siidp-backend-arquitetura-referencia
