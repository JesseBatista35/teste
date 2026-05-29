ci_cd_variables.yaml

local-variables:
  ci-cd-workflow:
    - name: REPOSITORY_ARTIFACTS_APP
      value: "NEXUS"
    - name: LANGUAGES
      value: '["java"]'
    - name: "Informe o nome da variavel usada no projeto"
      value: "Informe o valor referente a esta variavel"


values.yaml:

      caixa-base-chart:

#-------#
# IMAGE #
#-------#

  image:
    # variavel de imagem do tipo de aplicação
    repository: acrcentralcaixanprd.azurecr.io/sigms/motor-decisao/sigms-motor-decisao
    tag: "25735956354"
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
        - host: "sigms-motor-decisao.apl.des-nprd.private.azure"
          paths:
            - path: "/"
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
    - name: cm-sigms-motor-decisao
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
      value: ""

#-------------# 
#   SECRETS   # 
#-------------# 

#  secretRefs:
#  env:
#    - name: <NOME_DA_VARIAVEL_NA_APLICACAO>
#      value: akvs-sigms-motor-decisao@azurekeyvault

=: 


Argo
Applications
Settings
User Info
Documentation
Resource filters
NAME
NAME
KINDS
KINDS
SYNC STATUS
Synced
0
OutOfSync
0
HEALTH STATUS
Progressing
0
Suspended
0
Healthy
0
Degraded
0
Missing
0
Unknown
0
Applications
 sigms-motor-decisao-des
Application Details List
Log out
APP HEALTH 
 Healthy
SYNC STATUS 

 Unknown
HEAD
Auto sync is enabled.
LAST SYNC 

 Sync error
Error 17 days ago (Tue May 12 2026 10:09:34 GMT-0300)
ComparisonError: Failed to load target state: failed to generate manifest for source 1 of 1: rpc error: code = Unknown desc = Manifest generation error (cached): failed to execute helm template command: failed to get command args to log: `helm template . --name-template sigms-motor-decisao-des --namespace sigms-motor-decisao --kube-version 1.33 --values /tmp/bf34e316-5657-467b-a638-b2d52a3bf58a <api versions removed> --include-crds` failed exit status 1: Error: YAML parse error on caixa-base-chart/templates/cm-sigms-motor-decisao.yaml: error converting YAML to JSON: yaml: line 44: mapping values are not allowed in this context Use --debug flag to render out invalid YAML (retried 4 times).
APP CONDITIONS
 1 Error
No resources found
Try to change filter criteria



Application conditions
ComparisonError
Failed to load target state: failed to generate manifest for source 1 of 1: rpc error: code = Unknown desc = Manifest generation error (cached): failed to execute helm template command: failed to get command args to log: `helm template . --name-template sigms-motor-decisao-des --namespace sigms-motor-decisao --kube-version 1.33 --values /tmp/211aee2d-9e68-4fdc-aece-f40e2cf13513 <api versions removed> --include-crds` failed exit status 1: Error: YAML parse error on caixa-base-chart/templates/cm-sigms-motor-decisao.yaml: error converting YAML to JSON: yaml: line 44: mapping values are not allowed in this context Use --debug flag to render out invalid YAML
