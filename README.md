caixa-base-chart:
#-------#
# IMAGE #
#-------#
  image:
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
#-------------------------#
# ROLLING UPDATE STRATEGY #
#-------------------------#
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
        - sisph-api-painel-ddd.apl.des.private.azure
      - port:
          number: 443
          name: https-custom
          protocol: HTTPS
        tls:
          mode: SIMPLE
          credentialName: akvs-sisph-api-painel-ddd-des-caixa-certificate
        hosts:
        - sisph-api-painel-ddd.des.caixa
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
      value: "appshab"
#-------------#
#   SECRETS   #
#-------------#
#  env:
#    - name: <NOME_DA_VARIAVEL_NA_APLICACAO>
#      value: akvs-<nome-do-secret>@azurekeyvault
