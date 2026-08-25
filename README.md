

sigos-backend-processamento-arquivos-infranprd/des
/Chart.yaml


apiVersion: v2
name: caixa-base-chart
description: A Helm chart for Kubernetes

type: application

version: 1.0.0

appVersion: "1.16.0"

dependencies:
   - name: caixa-base-chart
     version: 1.1.9
     repository: oci://acrportalidpprd.azurecr.io/helm


sigos-backend-processamento-arquivos-infranprd/des
/values.yaml


	 caixa-base-chart:

#-------#
# IMAGE #
#-------#

  image:
    # variavel de imagem do tipo de aplicação
    repository: acrcentralcaixanprd.azurecr.io/sigos/backend-processamento-arquivos/sigos-backend-processamento-arquivos
    tag: "32857504712"
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
        - "sigos-backend-processamento-arquivos.apl.des.private.azure"
      - port:
          number: 443
          name: https-custom
          protocol: HTTPS
        tls:
          mode: SIMPLE
          credentialName: akvs-sigos-backend-processamento-arquivos-des-certificate # Nome do secret do certificado
        hosts:
          - sigos-backend-processamento-arquivos.des.caixa
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
      initialDelaySeconds: 120
      periodSeconds: 15
      failureThreshold: 10
      successThreshold: 1
      httpGet:
        path: /q/health/live     
        port: 8080
    readinessProbe: 
      initialDelaySeconds: 120
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
    - name: cm-sigos-backend-processamento-arquivos-des
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
#      value: akvs-sigos-backend-processamento-arquivos@azurekeyvault
  env:
    - name: KEYCLOAKSECRET
      value: akvs-keycloak-secret-des@azurekeyvault
    - name: APIKEYCLIENTID
      value: akvs-api-key-client-id-des@azurekeyvault 
    - name: APIKEYCLIENTSECRET
      value: akvs-api-key-client-secret-des@azurekeyvault
    - name: DBPASSWORD 
      value: akvs-mssqlsrv-sigos-des-key@azurekeyvault
    - name: STORAGECONNECTIONSTRING
      value: akvs-azure-storage-connection-string-des@azurekeyvault
