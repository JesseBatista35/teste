de DES

caixa-base-chart:

#-------#
# IMAGE #
#-------#

  image:
    # variavel de imagem do tipo de aplicação
    repository: acrcentralcaixanprd.azurecr.io/silce/backend-valida-assinatura/silce-backend-valida-assinatura
    tag: "30045899652"
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
        - host: "silce-backend-valida-assinatura.apl.des.private.azure"
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



    DE TQS



    caixa-base-chart:

#-------#
# IMAGE #
#-------#

  image:
    # variavel de imagem do tipo de aplicação
    repository: acrcentralcaixanprd.azurecr.io/silce/backend-valida-assinatura/silce-backend-valida-assinatura
    tag: "30044722659"
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
  istio:  
    - name: internal
      enabled: true
      servers:
      - port:
          number: 80
          name: http-default
          protocol: HTTP
        hosts:
        - "silce-backend-valida-assinatura.apl.des-nprd.private.azure"
      #- port:
      #    number: 443
      #    name: https-custom
      #    protocol: HTTPS
      #  tls:
      #    mode: SIMPLE
      #    credentialName: akvs-silce-backend-valida-assinatura-certificate # Nome do secret do certificado
      #  hosts:
      #    - silce-backend-valida-assinatura.des-nprd.caixa
      prefix:
        - /
      targetPort: 8080
  
#-----------

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
