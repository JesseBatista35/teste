
Argo
v2.14.21+206a6ee
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
13
OutOfSync
0
HEALTH STATUS
Progressing
0
Suspended
0
Healthy
9
Degraded
0
Missing
0
Unknown
0
NAMESPACES
NAMESPACES
Show Orphaned
Applications
 sigaq-api-gestao-documental-des
Application Details List
Log out
APP HEALTH 
 Healthy
SYNC STATUS 

 Synced
to HEAD (e5a4749)
Auto sync is enabled.
Author:
ansible-connect-emu[bot] <230244411+ansible-connect-emu[bot]@users.noreply.github.com> -
Comment:
Merge pull request #299 from caixagithub/update-image-sigaq-api-
LAST SYNC 

 Sync OK
to e5a4749
Succeeded 4 days ago (Fri Sep 04 2026 10:38:26 GMT-0300)
Author:
ansible-connect-emu[bot] <230244411+ansible-connect-emu[bot]@users.noreply.github.com> -
Comment:
Merge pull request #299 from caixagithub/update-image-sigaq-api-
APP CONDITIONS
 1 Warning
Previous123Next
Items per page: 10 
NAME
GROUP/KIND
SYNC ORDER
NAMESPACE
CREATED AT
STATUS
AKVS
azurekeyvaultsecret
akvs-sigaq-redis-connection-string
spv.no/AzureKeyVaultSecret
-
sigaq-api-gestao-documental
20 days ago   08/19/26
 Synced
AKVS
azurekeyvaultsecret
akvs-sigaq-normasapikey
spv.no/AzureKeyVaultSecret
-
sigaq-api-gestao-documental
3 months ago   05/27/26
 Synced
AKVS
azurekeyvaultsecret
akvs-sigaq-siicoapikey
spv.no/AzureKeyVaultSecret
-
sigaq-api-gestao-documental
3 months ago   05/27/26
 Synced
AKVS
azurekeyvaultsecret
akvs-sigaq-database-password-default
spv.no/AzureKeyVaultSecret
-
sigaq-api-gestao-documental
4 months ago   05/12/26
 Synced
Previous123Next
Items per page: 10 

SUMMARYPARAMETERSMANIFESTEVENTS
SIGAQ-API-GESTAO-DOCUMENTAL-DES

PROJECT
des
LABELS
appName=sigaq-api-gestao-documental env=des
ANNOTATIONS
CLUSTER
aks-sipdd-des (https://dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io:443)
NAMESPACE
sigaq-api-gestao-documental   
CREATED AT
12/01/2025 13:24:52 (9 months ago)
REPO URL
https://github.com/caixagithub/sigaq-api-gestao-documental-infranprd
TARGET REVISION
HEAD
PATH
des
SYNC OPTIONS
 RespectIgnoreDifferences
 CreateNamespace
RETRY OPTIONS
Limit - 4Duration - 10sMax Duration - 10mFactor - 2
STATUS
 Synced to HEAD (e5a4749)
HEALTH
 Healthy
LINKS
IMAGES
acrcentralcaixanprd.azurecr.io/sigaq/api-gestao-documental/sigaq-api-gestao-documental:33878566539
spvest/azure-keyvault-env:1.7.3
SYNC POLICY

AUTOMATED
PRUNE RESOURCES
SELF HEAL
INFO




Argo
v2.14.21+206a6ee
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
13
OutOfSync
0
HEALTH STATUS
Progressing
0
Suspended
0
Healthy
9
Degraded
0
Missing
0
Unknown
0
NAMESPACES
NAMESPACES
Show Orphaned
Applications
 sigaq-api-gestao-documental-des
Application Details List
Log out
APP HEALTH 
 Healthy
SYNC STATUS 

 Synced
to HEAD (e5a4749)
Auto sync is enabled.
Author:
ansible-connect-emu[bot] <230244411+ansible-connect-emu[bot]@users.noreply.github.com> -
Comment:
Merge pull request #299 from caixagithub/update-image-sigaq-api-
LAST SYNC 

 Sync OK
to e5a4749
Succeeded 4 days ago (Fri Sep 04 2026 10:38:26 GMT-0300)
Author:
ansible-connect-emu[bot] <230244411+ansible-connect-emu[bot]@users.noreply.github.com> -
Comment:
Merge pull request #299 from caixagithub/update-image-sigaq-api-
APP CONDITIONS
 1 Warning
Previous123Next
Items per page: 10 
NAME
GROUP/KIND
SYNC ORDER
NAMESPACE
CREATED AT
STATUS
AKVS
azurekeyvaultsecret
akvs-sigaq-redis-connection-string
spv.no/AzureKeyVaultSecret
-
sigaq-api-gestao-documental
20 days ago   08/19/26
 Synced
AKVS
azurekeyvaultsecret
akvs-sigaq-normasapikey
spv.no/AzureKeyVaultSecret
-
sigaq-api-gestao-documental
3 months ago   05/27/26
 Synced
AKVS
azurekeyvaultsecret
akvs-sigaq-siicoapikey
spv.no/AzureKeyVaultSecret
-
sigaq-api-gestao-documental
3 months ago   05/27/26
 Synced
AKVS
azurekeyvaultsecret
akvs-sigaq-database-password-default
spv.no/AzureKeyVaultSecret
-
sigaq-api-gestao-documental
4 months ago   05/12/26
 Synced
Previous123Next
Items per page: 10 

SUMMARYPARAMETERSMANIFESTEVENTS
HELM

VALUES FILES
No values files selected
VALUES
caixa-base-chart:
  commonLabels:
    app.kubernetes.io/app: 'sigaq-api-gestao-documental-des'
    backstage.io/kubernetes-id: 'sigaq-api-gestao-documental'
    appName: 'sigaq-api-gestao-documental'
  commonAnnotations:
    backstage.io/kubernetes-cluster: 'aks-sipdd-des'
PARAMETERS

caixa-base-chart.autoscaling.enabled
false
caixa-base-chart.autoscaling.maxReplicas
3
caixa-base-chart.autoscaling.minReplicas
1
caixa-base-chart.autoscaling.targetCPUUtilizationPercentage
85
caixa-base-chart.autoscaling.targetMemoryUtilizationPercentage
85
caixa-base-chart.configMapRefs[0].name
cm-sigaq-api-gestao-documental
caixa-base-chart.env[0].name
ConnectionStrings__ConnectionStringSqlServer
caixa-base-chart.env[0].value
akvs-sigaq-database-connection-string@azurekeyvault
caixa-base-chart.env[1].name
Redis__ConnectionString
caixa-base-chart.env[1].value
akvs-sigaq-redis-connection-string@azurekeyvault
caixa-base-chart.env[2].name
SSO__ClientId
caixa-base-chart.env[2].value
akvs-sigaq-clientid@azurekeyvault
caixa-base-chart.env[3].name
SSO__ClientSecret
caixa-base-chart.env[3].value
akvs-sigaq-clientsecret@azurekeyvault
caixa-base-chart.env[4].name
SIICO__APIKEY
caixa-base-chart.env[4].value
akvs-sigaq-siicoapikey@azurekeyvault
caixa-base-chart.env[5].name
SIICO-PUB__APIKEY
caixa-base-chart.env[5].value
akvs-sigaq-siicoapikey@azurekeyvault
caixa-base-chart.env[6].name
Normas__APIKEY
caixa-base-chart.env[6].value
akvs-sigaq-normasapikey@azurekeyvault
caixa-base-chart.image.pullPolicy
Always
caixa-base-chart.image.repository
acrcentralcaixanprd.azurecr.io/sigaq/api-gestao-documental/sigaq-api-gestao-documental
caixa-base-chart.image.tag
33878566539
caixa-base-chart.istio[0].enabled
true
caixa-base-chart.istio[0].name
internal
caixa-base-chart.istio[0].prefix[0]
/
caixa-base-chart.istio[0].servers[0].hosts[0]
sigaq-api-gestao-documental.apl.des.private.azure
caixa-base-chart.istio[0].servers[0].port.name
http-default
caixa-base-chart.istio[0].servers[0].port.number
80
caixa-base-chart.istio[0].servers[0].port.protocol
HTTP
caixa-base-chart.istio[0].servers[1].hosts[0]
api.sigaq.des.caixa
caixa-base-chart.istio[0].servers[1].port.name
https-custom
caixa-base-chart.istio[0].servers[1].port.number
443
caixa-base-chart.istio[0].servers[1].port.protocol
HTTPS
caixa-base-chart.istio[0].servers[1].tls.credentialName
akvs-api-sigaq-des-caixa-ssl-certificate
caixa-base-chart.istio[0].servers[1].tls.mode
SIMPLE
caixa-base-chart.istio[0].targetPort
80
caixa-base-chart.probes.enabled
true
caixa-base-chart.probes.livenessProbe.failureThreshold
10
caixa-base-chart.probes.livenessProbe.httpGet.path
/healthz
caixa-base-chart.probes.livenessProbe.httpGet.port
8080
caixa-base-chart.probes.livenessProbe.initialDelaySeconds
30
caixa-base-chart.probes.livenessProbe.periodSeconds
15
caixa-base-chart.probes.livenessProbe.successThreshold
1
caixa-base-chart.probes.readinessProbe.failureThreshold
3
caixa-base-chart.probes.readinessProbe.httpGet.path
/healthz
caixa-base-chart.probes.readinessProbe.httpGet.port
8080
caixa-base-chart.probes.readinessProbe.initialDelaySeconds
15
caixa-base-chart.probes.readinessProbe.periodSeconds
15
caixa-base-chart.probes.readinessProbe.successThreshold
1
caixa-base-chart.probes.useDefaults
false
caixa-base-chart.replicaCount
1
caixa-base-chart.resources.limits.cpu
500m
caixa-base-chart.resources.limits.memory
512Mi
caixa-base-chart.resources.requests.cpu
250m
caixa-base-chart.resources.requests.memory
256Mi
caixa-base-chart.service.ports[0].name
port
caixa-base-chart.service.ports[0].port
80
caixa-base-chart.service.ports[0].protocol
TCP
caixa-base-chart.service.ports[0].targetPort
8080
caixa-base-chart.service.type
ClusterIP
caixa-base-chart.strategy.maxSurge
25%
caixa-base-chart.strategy.maxUnavailable
50%
caixa-base-chart.tolerations[0].effect
NoSchedule
caixa-base-chart.tolerations[0].key
kubernetes.azure.com/scalesetpriority
caixa-base-chart.tolerations[0].operator
Equal
caixa-base-chart.tolerations[0].value
spot
caixa-base-chart.tolerations[1].effect
NoSchedule
caixa-base-chart.tolerations[1].key
nuvem.caixa/nodepoolname
caixa-base-chart.tolerations[1].operator
Equal
caixa-base-chart.tolerations[1].value
workloads



project: des
source:
  repoURL: https://github.com/caixagithub/sigaq-api-gestao-documental-infranprd
  path: des
  targetRevision: HEAD
  helm:
    values: |
      caixa-base-chart:
        commonLabels:
          app.kubernetes.io/app: 'sigaq-api-gestao-documental-des'
          backstage.io/kubernetes-id: 'sigaq-api-gestao-documental'
          appName: 'sigaq-api-gestao-documental'
        commonAnnotations:
          backstage.io/kubernetes-cluster: 'aks-sipdd-des'
    ignoreMissingValueFiles: true
destination:
  namespace: sigaq-api-gestao-documental
  name: aks-sipdd-des
syncPolicy:
  automated:
    prune: true
    selfHeal: true
  syncOptions:
    - RespectIgnoreDifferences=true
    - CreateNamespace=true
  retry:
    limit: 4
    backoff:
      duration: 10s
      factor: 2
      maxDuration: 10m
  managedNamespaceMetadata:
    labels:
      argocd.argoproj.io/managed-by: openshift-gitops
      azure-key-vault-env-injection: enabled
ignoreDifferences:
  - group: '*'
    kind: Namespace
    jsonPointers:
      - /metadata/labels
      - /metadata/annotations
