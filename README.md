esse ta funcionando
 silce-api-consulta-compras-des

app:
  name: silce-api-consulta-compras-des
project:
  name: des
labels:
  appName: silce-api-consulta-compras
  environment: des
source:
  repo: "https://github.com/caixagithub/silce-api-consulta-compras-infranprd"
  path: des
sourcevar:
  repo: "https://github.com/caixagithub/silce-globalnprd"
  path: des
  values: global.yaml  
cluster:
  destination:  
    name: aks-silce-des
    namespace: silce-api-consulta-compras



 caixa-base-chart:

#-------#
# IMAGE #
#-------#

  image:
    # variavel de imagem do tipo de aplicação
    repository: acrcentralcaixanprd.azurecr.io/silce/api-consulta-compras/silce-api-consulta-compras
    tag: "29928431999"
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
    enabled: false
    minAvailable: 1

#-----------------#
# ROLLING UPDATE STRATEGY #
#-----------------#

  strategy:
    maxSurge: "0%"
    maxUnavailable: 100%

#-----------------------------#
#  topologySpreadConstraints  #
#-----------------------------#

  topologySpreadConstraints:
  - maxSkew: 1
    topologyKey: topology.kubernetes.io/zone
    whenUnsatisfiable: ScheduleAnyway
    labelSelector:
      matchLabels:
        appName: silce-api-consulta-compras
        
#-----------#
#  SERVICE  #
#-----------#
  
  service:
    type: "ClusterIP"
    ports:
      - name: "port"
        protocol: TCP
        port: 8080
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
        - host: "silce-api-consulta-compras.apl.des.private.azure"
          paths:
            - path: "/"
              targetPort: 8080


#-------------#
#  RESOURCES  #
#-------------#

  resources:
    requests:
      cpu: 250m
      memory: 512Mi
    limits:
      cpu: 500m
      memory: 1Gi


#----------#
#  PROBES  #
#----------#

  probes:
    enabled: true
    useDefaults: false  
    livenessProbe: 
      initialDelaySeconds: 60
      periodSeconds: 20
      failureThreshold: 3
      successThreshold: 1
      httpGet:
        path: /q/health/live
        port: 8080
    readinessProbe: 
      initialDelaySeconds: 60
      periodSeconds: 20
      failureThreshold: 3
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
    - name: cm-silce-api-consulta-compras-des
    
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

  env:
    - name: DATABASE_PASSWORD
      value: akvs-env-database-password@azurekeyvault
