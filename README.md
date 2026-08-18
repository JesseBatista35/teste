caixa-base-chart:

#-------#
# IMAGE #
#-------#

  image:
    # variavel de imagem do tipo de aplicação
    repository: acrcentralcaixanprd.azurecr.io/siaci/api-worker-auditoria/siaci-api-worker-auditoria
    tag: "31217709994"
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
        - "siaci-api-worker-auditoria.apl.tqs-nprd.private.azure"
      - port:
         number: 443
         name: https-custom
         protocol: HTTPS
        tls:
          mode: SIMPLE
          credentialName: akvs-siaci-api-worker-auditoria-tqs-caixa 
        hosts:
          - siaci-api-worker-auditoria.tqs.caixa
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
    - name: cm-siaci-api-worker-auditoria-tqs
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
      value: "appshab"

#-------------# 
#   SECRETS   # 
#-------------# 

#  secretRefs:
  env:
    # CosmosDB Connection String
    - name: SIACI_CONNSTR_COSMO
      value: akvs-siaci-kv-cosmodb-conn-string@azurekeyvault
    
    # EventHub Connection String
    - name: EventHub__ConnectionString
      value: akvs-siaci-kv-eventhub-conn-string@azurekeyvault
    
    # Blob Storage Connection String (para checkpoint do EventHub)
    - name: BlobStorage__ConnectionString
      value: akvs-siaci-des-blobstorage-connection-string@azurekeyvault

    # Application insights Connection String
    - name: SIACI_CONNSTR_APPINSIGHTS
      value: akvs-siaci-apm-appinsights-conn-string@azurekeyvault
