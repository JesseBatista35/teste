caixa-base-chart:

#-------#
# IMAGE #
#-------#

  image:
    # variavel de imagem do tipo de aplicação
    repository: acrcentralcaixanprd.azurecr.io/siplx/plataforma-geracao-relatorios/siplx-plataforma-geracao-relatorios
    tag: "39974702002"
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
    maxUnavailable: 0%

#-----------------#
# topologySpreadConstraints #
#-----------------#

  topologySpreadConstraints:
  - maxSkew: 1
    topologyKey: topology.kubernetes.io/zone
    whenUnsatisfiable: ScheduleAnyway
    labelSelector:
      matchLabels:
        appName: siplx-api-plataforma-geracao-relatorios

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

 #-------#
 # ISTIO #
 #-------#
  istio:  
    - name: internal
      enabled: true
      servers:
      - port:
          number: 80
          name: http-default
          protocol: HTTP
        hosts:
        - "siplx-api-plataforma-geracao-relatorios.apl.des.private.azure"
      #- port:
      #    number: 443
      #    name: https-custom
      #    protocol: HTTPS
      #  tls:
      #    mode: SIMPLE
      #    credentialName: akvs-siplx-api-plataforma-geracao-relatorios-certificate # Nome do secret do certificado
      #  hosts:
      #    - siplx-api-plataforma-geracao-relatorios.des-nprd.caixa
      prefix:
        - /
      targetPort: 80 
  
#-------------#
#  RESOURCES  #
#-------------#

  resources:
    requests:
      cpu: 250m
      memory: 500Mi
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
      initialDelaySeconds: 90
      periodSeconds: 20
      failureThreshold: 5
      successThreshold: 1
      httpGet:
        path: /q/health/live     
        port: 8080
    readinessProbe: 
      initialDelaySeconds: 90
      periodSeconds: 20
      failureThreshold: 5
      successThreshold: 1
      httpGet:
        path: /q/health/ready     
        port: 8080
    startupProbe:
      httpGet:
        enabled: true
        path: '/q/health/live'
      initialDelaySeconds: 90
      periodSeconds: 20
      failureThreshold: 15


#-------------#
#  CONFIGMAP  #
#-------------#

  configMapRefs:
    - name: cm-siplx-api-plataforma-geracao-relatorios-des

#---------------#
#  TOLERATIONS  #
#---------------#

  tolerations:
    - key: "nuvem.caixa/nodepoolname"
      operator: Equal
      value: "appsplx"
      effect: NoSchedule
    - key: "nuvem.caixa/nodepoolname"
      operator: "Equal"
      value: "siteplx"
      effect: "NoSchedule"
    - key: "kubernetes.azure.com/scalesetpriority"
      effect: "NoSchedule"
      operator: "Equal"
      value: "spot"
      

#-------------# 
#   SECRETS   # 
#-------------# 

  secretRefs:
  env:
    - name: DATASOURCE_PASSWORD
      value: akvs-siplx-api-plataforma-geracao-relatorios-sql-des@azurekeyvault
    - name: AUTH_SERVER_CLIENT_SECRET
      value: akvs-env-sso-secret-des@azurekeyvault
    - name: APPLICATION_CLIENT_SECRET
      value: akvs-env-sso-secret-des@azurekeyvault
    - name: REDIS_PASSWORD
      value: akvs-env-redis-password-des@azurekeyvault
    - name: NODE_IP
      valueFrom:
        fieldRef:
          apiVersion: v1
          fieldPath: status.hostIP
