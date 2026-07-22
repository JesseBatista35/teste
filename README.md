caixa-base-chart:

#-------#
# IMAGE #
#-------#

  image:
    # variavel de imagem do tipo de aplicação
    repository: acrcentralcaixanprd.azurecr.io/sisva/frontend-transacional/sisva-frontend-transacional
    tag: "29949175368"
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
        targetPort: 80

#---------#
# INGRESS #
#---------#
  ingress:
    - name: custom
      enabled: true
      className: "azure-application-gateway"
      annotations:
        appgw.ingress.kubernetes.io/backend-path-prefix: "/"
        appgw.ingress.kubernetes.io/backend-protocol: "http"
        appgw.ingress.kubernetes.io/request-timeout: "60"
        appgw.ingress.kubernetes.io/ssl-redirect: "true"
        appgw.ingress.kubernetes.io/connection-draining: "true"
        appgw.ingress.kubernetes.io/connection-draining-timeout: "60"
        appgw.ingress.kubernetes.io/use-private-ip: "true"
        appgw.ingress.kubernetes.io/appgw-ssl-certificate: "sisva-transacional-des-caixa"
      rules:
        - host: "sisva-transacional.des.caixa"
          paths:
            - path: "/"
              targetPort: 80

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
        - host: "sisva-frontend-transacional.apl.des.private.azure"
          paths:
            - path: "/"
              targetPort: 80 

  istio:  
    - name: internal
      enabled: false
      servers:
      - port:
          number: 80
          name: http-default
          protocol: HTTP
        hosts:
        - "sisva-frontend-transacional.apl.des.private.azure"
      #- port:
      #    number: 443
      #    name: https-custom
      #    protocol: HTTPS
      #  tls:
      #    mode: SIMPLE
      #    credentialName: akvs-sisva-frontend-transacional-certificate # Nome do secret do certificado
      #  hosts:
      #    - sisva-frontend-transacional.des-nprd.caixa
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
        path: /
        port: 80
    readinessProbe: 
      initialDelaySeconds: 15
      periodSeconds: 15
      failureThreshold: 3
      successThreshold: 1
      httpGet:
        path: /
        port: 80


#-------------#
#  CONFIGMAP  #
#-------------#

  configMapRefs:
    - name: cm-sisva-frontend-transacional
#---------------#
#  TOLERATIONS  #
#---------------#

  tolerations:
    - key: "kubernetes.azure.com/scalesetpriority"
      effect: "NoSchedule"
      operator: "Equal"
      value: "spot"

#-------------# 
#   VOLUME    # 
#-------------# 
# Volumes para configuracao de ambiente
  volumes:
    - name: config-volume
      configMap:
          name: cm-siacx-chatcaixa-frontend
          items:
            - key: config.js
              path: config.js

  volumeMounts:
    - name: config-volume
      mountPath: /usr/share/nginx/html/config.js
      subPath: config.js
      readOnly: true
