

<img width="1832" height="901" alt="image" src="https://github.com/user-attachments/assets/9e413227-6fdc-4eb8-80af-4a048ea2766e" />


Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
sisph-api-painel-ddd
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
caixagithub/sisph-api-painel-ddd_main_35875692408.2 #2
All jobs
Run details
Annotations
1 warning
CI_DES / ArgoCD_Deploy / ArgoCD_Deploy (DES)
succeeded 2 hours ago in 12m 27s
Search logs
11s
0s
1s
0s
0s
0s
0s
0s
0s
0s
0s
0s
0s
1m 20s
0s
6s
0s
0s
0s
6s
0s
0s
0s
0s
0s
21s
8s
0s
0s
0s
Run caixagithub/DevSecOps-Actions/.github/integrations/argocd/sync@main
Sync ArgoCD Application
0s
10m 4s
Run caixagithub/DevSecOps-Actions/.github/integrations/argocd/health@main
Logging image tag
0s
Aguardando processo de SYNC finalizar
10m 4s
0s
Run caixagithub/DevSecOps-Actions/.github/integrations/argocd/logs@main
Formate ARGO REPOSITORY
0s
Run echo "REPO_NAME=$(echo 'caixagithub/sisph-api-painel-ddd' | cut -d'/' -f2)" >> $GITHUB_ENV
  INPUT_IMAGE_TAG: '35875692408'
Coletando logs dos pods
0s
Run RESOURCE_TREE_URL="https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/sisph-api-painel-ddd-des/resource-tree?appNamespace=openshift-gitops"
  Fazendo requisição para: https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/sisph-api-painel-ddd-des/resource-tree?appNamespace=openshift-gitops
  Resource-tree obtido com sucesso
  Filtrando pods e encontrando o mais recente...
  Nenhum pod encontrado ou JSON não contém dados esperados
0s
0s
0s
0s
0s
0s
0s
1s
0s
1s
0s


<img width="1557" height="792" alt="image" src="https://github.com/user-attachments/assets/d9446bef-b2ca-4a61-9f91-e30a7af4d796" />


gitops/apps/sisph-api-painel-ddd/des
/config.yaml


app:
  name: sisph-api-painel-ddd-hmp
project:
  name: hmp
labels:
  appName: sisph-api-painel-ddd
  environment: hmp
source:
  repo: "https://github.com/caixagithub/sisph-api-painel-ddd-infranprd"
  path: hmp
sourcevar:
  repo: "https://github.com/caixagithub/sisph-globalnprd"
  path: hmp
  values: global.yaml  
cluster:
  destination:  
    name: aks-sisph-nprd
    namespace: sisph-api-painel-ddd


    ja corriji

    


    app:
  name: sisph-api-painel-ddd-des
project:
  name: des
labels:
  appName: sisph-api-painel-ddd
  environment: des
source:
  repo: "https://github.com/caixagithub/sisph-api-painel-ddd-infranprd"
  path: des
sourcevar:
  repo: "https://github.com/caixagithub/sisph-globalnprd"
  path: des
  values: global.yaml  
cluster:
  destination:  
    name: aks-sisph-nprd
    namespace: sisph-api-painel-ddd



sisph-api-painel-ddd-infranprd/des
/values.yaml


caixa-base-chart:
#-------#
# IMAGE #
#-------#
  image:
    # variavel de imagem do tipo de aplicação
    repository: acrcentralcaixanprd.azurecr.io/sisph/api-painel-ddd/sisph-api-painel-ddd
    tag: "35875692408"
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
        - "sisph-api-painel-ddd.apl.hmp-nprd.private.azure"
      #- port:
      #    number: 443
      #    name: https-custom
      #    protocol: HTTPS
      #  tls:
      #    mode: SIMPLE
      #    credentialName: akvs-sisph-api-painel-ddd-certificate # Nome do secret do certificado
      #  hosts:
      #    - sisph-api-painel-ddd.hmp-nprd.caixa
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
    - name: cm-sisph-api-painel-ddd
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
      value: "node"
#-------------# 
#   SECRETS   # 
#-------------# 
#  secretRefs:
#  env:
#    - name: <NOME_DA_VARIAVEL_NA_APLICACAO>
#      value: akvs-sisph-api-painel-ddd@azurekeyvault


des/templates/akvs-sisph-api-painel-ddd.yaml


apiVersion: spv.no/v2beta1
kind: AzureKeyVaultSecret
metadata:
  name: akvs-sisph-api-painel-ddd
  namespace: aks-istio-ingress
  labels:
    {{- include "caixa-base-chart.labels" . | nindent 4 }}
spec:
  vault:
    name: <NOME_DO_KEYVAULT>
    object:
      name: sisph-api-painel-ddd
      type: secret
  output: 
    secret:
      name: akvs-sisph-api-painel-ddd
      type: kubernetes.io/tls

des/templates/cm-sisph-api-painel-ddd.yaml

      apiVersion: v1
kind: ConfigMap
metadata:
  name: cm-sisph-api-painel-ddd
  labels:
    {{- include "caixa-base-chart.labels" . | nindent 4 }}
data:
  KEY: "VALUE"
