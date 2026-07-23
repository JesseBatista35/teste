app:
  name: silce-backend-valida-assinatura-des
project:
  name: des
labels:
  appName: silce-backend-valida-assinatura
  environment: des
source:
  repo: "https://github.com/caixagithub/silce-backend-valida-assinatura-infranprd"
  path: des
sourcevar:
  repo: "https://github.com/caixagithub/silce-globalnprd"
  path: des
  values: global.yaml  
cluster:
  destination:  
    name: aks-silce-des
    namespace: silce-backend-valida-assinatura



    no repo de infranprd

silce-backend-valida-assinatura-infranprd/des
/values.yaml

    caixa-base-chart:

#-------#
# IMAGE #
#-------#

  image:
    # variavel de imagem do tipo de aplicação
    repository: acrcentralcaixanprd.azurecr.io/silce/backend-valida-assinatura/silce-backend-valida-assinatura
    tag: "29947332614"
    pullPolicy: Always

#-----#
# HPA #
#-----#
  replicaCount: 1

  autoscaling:
    enabled: false
    minReplicas: 1
    maxReplicas: 1
    targetCPUUtilizationPercentage: 85
    targetMemoryUtilizationPercentage: 85
    behavior:
      scaleUp:
        stabilizationWindowSeconds: 0
        selectPolicy: Max
        policies:
        - type: Pods
          value: 15
          periodSeconds: 30
      scaleDown:
        stabilizationWindowSeconds: 800
        selectPolicy: Max
        policies:
        - type: Pods
          value: 1
          periodSeconds: 60

#-----#
# PDB #
#-----#

  pdb:
    enabled: true
    minAvailable: 1

#-----------------#
# ROLLING UPDATE STRATEGY #
#-----------------#

  strategy:
    maxSurge: 25%
    maxUnavailable: 50%

#-----------------------------#
#  topologySpreadConstraints  #
#-----------------------------#
  topologySpreadConstraints:
  - maxSkew: 1
    topologyKey: topology.kubernetes.io/zone
    whenUnsatisfiable: ScheduleAnyway
    labelSelector:
      matchLabels:
        appName: silce-backend-valida-assinatura
        
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

  ingress:

    - name: internal
      enabled: true
      className: "azure-application-gateway"
      annotations:
        appgw.ingress.kubernetes.io/backend-path-prefix: "/"
        appgw.ingress.kubernetes.io/backend-protocol: "http"
        appgw.ingress.kubernetes.io/request-timeout: "60"
        appgw.ingress.kubernetes.io/ssl-redirect: "false"
        appgw.ingress.kubernetes.io/connection-draining: "true"
        appgw.ingress.kubernetes.io/connection-draining-timeout: "60"
        appgw.ingress.kubernetes.io/use-private-ip: "true"
      rules:
        # variavel do nome do projeto
        - host: "silce-backend-valida-assinatura.apl.des-nprd.private.azure"
          paths:
            - path: "/"
              targetPort: 8080

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
      initialDelaySeconds: 60
      periodSeconds: 20
      failureThreshold: 2
      successThreshold: 1
      httpGet:
        path: /q/health/live
        port: 8080
    readinessProbe: 
      initialDelaySeconds: 60
      periodSeconds: 20
      failureThreshold: 1
      successThreshold: 1
      httpGet:
        path: /q/health/ready    
        port: 8080
    startupProbe:
      httpGet:
        enabled: true
        path: '/q/health/live'
      initialDelaySeconds: 60             # Tempo de delay inicial para o startupProbe
      periodSeconds: 20                   # Tempo entre as verificações do startupProbe
      failureThreshold: 3                 # Número de falhas consecutivas antes de considerar o pod como não saudável   


#-------------#
#  CONFIGMAP  #
#-------------#

  configMapRefs:
    - name: cm-silce-backend-valida-assinatura
#---------------#
#  TOLERATIONS  #
#---------------#

  tolerations:
    - key: "kubernetes.azure.com/scalesetpriority"
      effect: "NoSchedule"
      operator: "Equal"
      value: "spot"

#-------------# 
#   SECRETS   # 
#-------------# 

#  secretRefs:
  env:
  - name: CICS_PASSWORD
    value: akvs-env-siper-password@azurekeyvault




silce-backend-valida-assinatura-infranprd/des/templates
/akvs-env-siper-password.yaml



-- apiVersion: spv.no/v2beta1
kind: AzureKeyVaultSecret
metadata:
  name: akvs-env-siper-password
  labels:
    {{- include "caixa-base-chart.labels" . | nindent 4 }}
spec:
  vault:
    name: kv-silce-des
    object:
      name: VALIDA-ASSINATURA-APP-DES--ENV-SIPER-PASSWORD
      type: secret


      segeu restante da estrutura

      
templates content loaded
des
templates
akvs-env-siper-password.yaml
cm-silce-backend-valida-assinatura.yaml
.helmignore
Chart.yaml
README.md
ci_cd_variables.yaml
values.yaml
hmp
tqs
tst
README.md
    
