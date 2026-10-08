Verificar falha ao finalizar o deploy na pipeline de DES, aparentemente não está sendo criado os recursos de infra

Subscrição: BoxRelacionamentoDigitlal
aks- aks-gf-des (normalmente o Helm chart é criado erroneamente com aks-siagf-des)


Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
siagf-api-jornadas
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
caixagithub/siagf-api-jornadas_feature/health-check_37339961979.2 #2
All jobs
Run details
Annotations
1 warning
CI_DES / BUILD / BUILD
succeeded 14 hours ago in 7m 27s
Search logs
7s
Current runner version: '2.336.0'
Runner name: 'arc-runner-set-default-nprod-nqlwl-runner-qtv8b'
Runner group name: 'default'
Machine name: 'arc-runner-set-default-nprod-nqlwl-runner-qtv8b'
GITHUB_TOKEN Permissions
Secret source: Actions
Cache mode: write
Prepare workflow directory
Prepare all required actions
Getting action download info
Download action repository 'actions/create-github-app-token@v2' (SHA:fee1f7d63c2ff003460e3d139729b119787bc349)
Download action repository 'actions/checkout@v5' (SHA:fbc6f3992d24b796d5a048ff273f7fcc4a7b6c09)
Download action repository 'caixagithub/DevSecOps-Actions@main' (SHA:8f31b86d9bf06f7fd05a0835d654513383f70a9d)
Getting action download info
Download action repository 'actions/checkout@v6' (SHA:d23441a48e516b6c34aea4fa41551a30e30af803)
Getting action download info
Download action repository 'actions/setup-python@v4' (SHA:7f4fc3e22c37d6ff65e88745f38bd3157c663f7c)
Getting action download info
Getting action download info
Getting action download info
Download action repository 'docker/setup-qemu-action@v3' (SHA:c7c53464625b32c7a7e944ae62b3e17d2b600130)
Download action repository 'docker/setup-buildx-action@v3' (SHA:8d2750c68a42422c14e847fe6c8ac0403b4cbd6f)
Download action repository 'aws-actions/configure-aws-credentials@v4' (SHA:7474bc4690e29a8392af63c5b98e7449536d5c3a)
Download action repository 'aws-actions/amazon-ecr-login@v2' (SHA:03f1aad4c6c7ffd436567f42f9384779290529bd)
Download action repository 'docker/login-action@v3' (SHA:c94ce9fb468520275223c153574b00df6fe4bcc9)
Download action repository 'docker/metadata-action@v5' (SHA:c299e40c65443455700f0fdfc63efafe5b349051)
Download action repository 'docker/build-push-action@v6' (SHA:10e90e3645eae34f1e60eeb005ba3a3d33f178e8)
Uses: caixagithub/DevSecOps-Workflow-Jobs/.github/workflows/default-container-build-job.yaml@refs/heads/main (ade40669d345b0b0414fe9f3d9d5e5c1201f616b)
 Inputs
Complete job name: CI_DES / BUILD / BUILD
1s
Run actions/create-github-app-token@v2
Input 'repositories' is not set. Creating token for all repositories owned by caixagithub.
1s
0s
13s
0s
31s
5m 36s
0s
44s
0s
7s
0s
1s
0s
1s
0s

siagf-api-jornadas-infranprd/des/templates
/akvs-siagf-api-jornadas.yaml



apiVersion: spv.no/v2beta1
kind: AzureKeyVaultSecret
metadata:
  name: akvs-siagf-api-jornadas
  namespace: aks-istio-ingress
  labels:
    {{- include "caixa-base-chart.labels" . | nindent 4 }}
spec:
  vault:
    name: <NOME_DO_KEYVAULT>
    object:
      name: siagf-api-jornadas
      type: secret
  output: 
    secret:
      name: akvs-siagf-api-jornadas
      type: kubernetes.io/tls




siagf-api-jornadas-infranprd/des
/values.yaml



caixa-base-chart:
#-------#
# IMAGE #
#-------#
  image:
    # variavel de imagem do tipo de aplicação
    repository: acrcentralcaixanprd.azurecr.io/siagf/api-jornadas/siagf-api-jornadas
    tag: "37339961979"
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
      servers:
      - port:
          number: 80
          name: http-default
          protocol: HTTP
        hosts:
        - "siagf-api-jornadas.apl.des-nprd.private.azure"
      #- port:
      #    number: 443
      #    name: https-custom
      #    protocol: HTTPS
      #  tls:
      #    mode: SIMPLE
      #    credentialName: akvs-siagf-api-jornadas-certificate # Nome do secret do certificado
      #  hosts:
      #    - siagf-api-jornadas.des-nprd.caixa
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
        path: /healthz     
        port: 8080
    readinessProbe: 
      initialDelaySeconds: 15
      periodSeconds: 15
      failureThreshold: 3
      successThreshold: 1
      httpGet:
        path: /healthz     
        port: 8080
#-------------#
#  CONFIGMAP  #
#-------------#
  configMapRefs:
    - name: cm-siagf-api-jornadas
#---------------#
#  TOLERATIONS  #
#---------------#
  tolerations:
    - key: "kubernetes.azure.com/scalesetpriority"
      effect: "NoSchedule"
      operator: "Equal"
      value: "spot"
    - key: "nuvem.caixa/nodepoolname"
      effect: "NoSchedule"
      operator: "Equal"
      value: "workloads"
#-------------# 
#   SECRETS   # 
#-------------# 
#  secretRefs:
#  env:
#    - name: <NOME_DA_VARIAVEL_NA_APLICACAO>
#      value: akvs-siagf-api-jornadas@azurekeyvault


siagf-api-jornadas-infranprd/des/templates
/cm-siagf-api-jornadas.yaml




      apiVersion: v1
kind: ConfigMap
metadata:
  name: cm-siagf-api-jornadas
  labels:
    {{- include "caixa-base-chart.labels" . | nindent 4 }}
data:
  KEY: "VALUE"


  gitops/apps/siagf-api-jornadas/des
/config.yaml


app:
  name: siagf-api-jornadas-des
project:
  name: des
labels:
  appName: siagf-api-jornadas
  environment: des
source:
  repo: "https://github.com/caixagithub/siagf-api-jornadas-infranprd"
  path: des
sourcevar:
  repo: "https://github.com/caixagithub/siagf-globalnprd"
  path: des
  values: global.yaml  
cluster:
  destination:  
    name: aks-siagf-nprd
    namespace: siagf-api-jornadas



    <img width="1869" height="875" alt="image" src="https://github.com/user-attachments/assets/6a8ab34c-63ef-4dfb-9516-a7e84c35aef9" />


<img width="1856" height="648" alt="image" src="https://github.com/user-attachments/assets/3a2367b1-e2be-4231-9f6d-0f4b42cd3099" />




