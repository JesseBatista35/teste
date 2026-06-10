
Prezados,

Favor avaliar a "falha de sicronização" em deploy TQS abaixo:

https://github.com/caixagithub/siiga-frontend-mfe-gestao-canais/actions/runs/27280464913/job/80574016476

Muito obrigado!


0s
Run caixagithub/DevSecOps-Actions/.github/integrations/argocd/logs@main
  with:
    ARGOCD_SERVER: https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io
    ARGOCD_APP: caixagithub/siiga-frontend-mfe-gestao-canais
    AMBIENTE: TQS
    IMAGE_TAG: 27280464913
    HEALTH_CHECK_WAS_SUCCESSFUL: false
  env:
    APIM_VERSIONAPI: 
    APIM_displaynameAPI: 
    APIM_PATH: 
    APIM_SWAGGERPATH: 
    APIM_TAGSAPI: 
    APIM_POLICIESALLOPERATIONSPATH: 
    environment: tqs
    repository_suffix: infranprd
    REPO: siiga-frontend-mfe-gestao-canais
    JOB_ID: 105146
    ARGOCD_AUTH_TOKEN: ***
    REPO_NAME: siiga-frontend-mfe-gestao-canais
Run echo "REPO_NAME=$(echo 'caixagithub/siiga-frontend-mfe-gestao-canais' | cut -d'/' -f2)" >> $GITHUB_ENV
  echo "REPO_NAME=$(echo 'caixagithub/siiga-frontend-mfe-gestao-canais' | cut -d'/' -f2)" >> $GITHUB_ENV
  echo "INPUT_IMAGE_TAG: '27280464913'"
  echo "AMBIENTE_LOWER=$(echo 'TQS' | tr '[:upper:]' '[:lower:]')" >> $GITHUB_ENV
  shell: /usr/bin/bash --noprofile --norc -e -o pipefail {0}
  env:
    APIM_VERSIONAPI: 
    APIM_displaynameAPI: 
    APIM_PATH: 
    APIM_SWAGGERPATH: 
    APIM_TAGSAPI: 
    APIM_POLICIESALLOPERATIONSPATH: 
    environment: tqs
    repository_suffix: infranprd
    REPO: siiga-frontend-mfe-gestao-canais
    JOB_ID: 105146
    ARGOCD_AUTH_TOKEN: ***
    REPO_NAME: siiga-frontend-mfe-gestao-canais
INPUT_IMAGE_TAG: '27280464913'
Run RESOURCE_TREE_URL="https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/siiga-frontend-mfe-gestao-canais-tqs/resource-tree?appNamespace=openshift-gitops"
  RESOURCE_TREE_URL="https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/siiga-frontend-mfe-gestao-canais-tqs/resource-tree?appNamespace=openshift-gitops"
  echo "Fazendo requisição para: ${RESOURCE_TREE_URL}"
  
  RESOURCE_TREE_JSON=$(curl -s -H "Authorization: ***" "${RESOURCE_TREE_URL}")
  if [ $? -ne 0 ]; then
    echo "Erro ao fazer requisição para o resource-tree"
    exit 1
  fi
  
  echo "Resource-tree obtido com sucesso"
  
  echo "Filtrando pods e encontrando o mais recente..."
  
  LATEST_POD=$(echo "$RESOURCE_TREE_JSON" | jq -r '
    .nodes // [] |
    map(select(.kind == "Pod" and .createdAt != null)) |
    sort_by(.createdAt) |
    last |
    .name // empty
  ')
  
  if [ -z "$LATEST_POD" ]; then
    echo "Nenhum pod encontrado ou JSON não contém dados esperados"
    exit 0
  fi
  
  echo "Pod mais recente encontrado: ${LATEST_POD}"
  
  LOGS_URL="https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/siiga-frontend-mfe-gestao-canais-tqs/logs?appNamespace=openshift-gitops&container=siiga-frontend-mfe-gestao-canais-tqs&namespace=siiga-frontend-mfe-gestao-canais&follow=false&podName=${LATEST_POD}&tailLines=1000&sinceSeconds=0"
  echo "URL dos logs: ${LOGS_URL}"
  
  LOGS_RESPONSE=$(curl -s -H "Authorization: ***" "${LOGS_URL}")
  
  if [ $? -ne 0 ]; then
    echo "Erro ao obter logs do pod"
    exit 1
  fi
  
  echo "Logs obtidos com sucesso"
  echo "Logs do pod ${LATEST_POD}:"
  echo "================================================"
  
  echo "Exibindo os Logs:"
  echo "$LOGS_RESPONSE" | jq -r '.result.content'
  
  echo "================================================"
  echo "Script executado com sucesso!"
  echo "Pod utilizado: ${LATEST_POD}"
  
  if [ "false" = "false" ]; then
    echo "Falha na sincronização"
    exit 1
  fi
  shell: /usr/bin/bash --noprofile --norc -e -o pipefail {0}
  env:
    APIM_VERSIONAPI: 
    APIM_displaynameAPI: 
    APIM_PATH: 
    APIM_SWAGGERPATH: 
    APIM_TAGSAPI: 
    APIM_POLICIESALLOPERATIONSPATH: 
    environment: tqs
    repository_suffix: infranprd
    REPO: siiga-frontend-mfe-gestao-canais
    JOB_ID: 105146
    ARGOCD_AUTH_TOKEN: ***
    REPO_NAME: siiga-frontend-mfe-gestao-canais
    AMBIENTE_LOWER: tqs
Fazendo requisição para: https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/siiga-frontend-mfe-gestao-canais-tqs/resource-tree?appNamespace=openshift-gitops
Resource-tree obtido com sucesso
Filtrando pods e encontrando o mais recente...
Pod mais recente encontrado: siiga-frontend-mfe-gestao-canais-tqs-5479d54696-sgmkp
URL dos logs: https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/siiga-frontend-mfe-gestao-canais-tqs/logs?appNamespace=openshift-gitops&container=siiga-frontend-mfe-gestao-canais-tqs&namespace=siiga-frontend-mfe-gestao-canais&follow=false&podName=siiga-frontend-mfe-gestao-canais-tqs-5479d54696-sgmkp&tailLines=1000&sinceSeconds=0
Logs obtidos com sucesso
Logs do pod siiga-frontend-mfe-gestao-canais-tqs-5479d54696-sgmkp:
================================================
Exibindo os Logs:

================================================
Script executado com sucesso!
Pod utilizado: siiga-frontend-mfe-gestao-canais-tqs-5479d54696-sgmkp
Falha na sincronização
Error: Process completed with exit code 1.






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
4
OutOfSync
2
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
Applications
 siiga-frontend-mfe-gestao-canais-des
Application Details List
Log out
APP HEALTH 
 Healthy
SYNC STATUS 

 OutOfSync
from HEAD (3990bee)
Auto sync is enabled.
Author:
ansible-connect-emu[bot] <230244411+ansible-connect-emu[bot]@users.noreply.github.com> -
Comment:
Merge pull request #49 from caixagithub/update-image-siiga-front
LAST SYNC 

 Sync OK
to 3990bee
Succeeded 3 minutes ago (Wed Jun 10 2026 14:25:07 GMT-0300)
Author:
ansible-connect-emu[bot] <230244411+ansible-connect-emu[bot]@users.noreply.github.com> -
Comment:
Merge pull request #49 from caixagithub/update-image-siiga-front
APP CONDITIONS
 2 Warnings
Previous12Next
Items per page: 10 
NAME
GROUP/KIND
SYNC ORDER
NAMESPACE
CREATED AT
STATUS
Pod
pod
siiga-frontend-mfe-gestao-canais-des-55fc955d47-72tkz
Pod
-
siiga-frontend-mfe-gestao-canais
5 hours ago   06/10/26
 Healthy  
ReplicaSet
rs
siiga-frontend-mfe-gestao-canais-des-55fc955d47
apps/ReplicaSet
-
siiga-frontend-mfe-gestao-canais
21 hours ago   06/09/26
 Healthy  
ReplicaSet
rs
siiga-frontend-mfe-gestao-canais-des-566b495758
apps/ReplicaSet
-
siiga-frontend-mfe-gestao-canais
2 days ago   06/08/26
 Healthy  
ReplicaSet
rs
siiga-frontend-mfe-gestao-canais-des-5fdf799cd4
apps/ReplicaSet
-
siiga-frontend-mfe-gestao-canais
7 days ago   06/03/26
 Healthy  
Secret
secret
akvs-siiga-frontend-gestao-canais-des-caixa-ssl-certificate
Secret
-
aks-istio-ingress
8 days ago   06/02/26
ConfigMap
cm
cm-siiga-frontend-mfe-gestao-canais
ConfigMap
-
siiga-frontend-mfe-gestao-canais
8 days ago   06/02/26
 OutOfSync
Endpoints
ep
siiga-frontend-mfe-gestao-canais-des
Endpoints
-
siiga-frontend-mfe-gestao-canais
22 days ago   05/19/26
Secret
secret
akv2k8s-siiga-frontend-mfe-gestao-canais-des
Secret
-
siiga-frontend-mfe-gestao-canais
22 days ago   05/19/26
Service
svc
siiga-frontend-mfe-gestao-canais-des
Service
-
siiga-frontend-mfe-gestao-canais
22 days ago   05/19/26
 Healthy   Synced
Deployment
deploy
siiga-frontend-mfe-gestao-canais-des
apps/Deployment
-
siiga-frontend-mfe-gestao-canais
22 days ago   05/19/26
 Healthy   Synced
Previous12Next
Items per page: 10 

Application conditions
SharedResourceWarning
AzureKeyVaultSecret/akvs-siiga-frontend-mfe-gestao-canais is part of applications openshift-gitops/siiga-frontend-mfe-gestao-canais-des and siiga-frontend-mfe-gestao-canais-tqs
a minute ago (Wed Jun 10 2026 14:27:14 GMT-0300)
SharedResourceWarning
ConfigMap/cm-siiga-frontend-mfe-gestao-canais is part of applications openshift-gitops/siiga-frontend-mfe-gestao-canais-des and siiga-frontend-mfe-gestao-canais-tqs
a minute ago (Wed Jun 10 2026 14:27:14 GMT-0300)





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
4
OutOfSync
2
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
Applications
 siiga-frontend-mfe-gestao-canais-des
Application Details List
Log out
APP HEALTH 
 Healthy
SYNC STATUS 

 OutOfSync
from HEAD (3990bee)
Auto sync is enabled.
Author:
ansible-connect-emu[bot] <230244411+ansible-connect-emu[bot]@users.noreply.github.com> -
Comment:
Merge pull request #49 from caixagithub/update-image-siiga-front
LAST SYNC 

 Sync OK
to 3990bee
Succeeded 4 minutes ago (Wed Jun 10 2026 14:25:07 GMT-0300)
Author:
ansible-connect-emu[bot] <230244411+ansible-connect-emu[bot]@users.noreply.github.com> -
Comment:
Merge pull request #49 from caixagithub/update-image-siiga-front
APP CONDITIONS
 2 Warnings
Previous12Next
Items per page: 10 
NAME
GROUP/KIND
SYNC ORDER
NAMESPACE
CREATED AT
STATUS
Pod
pod
siiga-frontend-mfe-gestao-canais-des-55fc955d47-72tkz
Pod
-
siiga-frontend-mfe-gestao-canais
5 hours ago   06/10/26
 Healthy  
ReplicaSet
rs
siiga-frontend-mfe-gestao-canais-des-55fc955d47
apps/ReplicaSet
-
siiga-frontend-mfe-gestao-canais
21 hours ago   06/09/26
 Healthy  
ReplicaSet
rs
siiga-frontend-mfe-gestao-canais-des-566b495758
apps/ReplicaSet
-
siiga-frontend-mfe-gestao-canais
2 days ago   06/08/26
 Healthy  
ReplicaSet
rs
siiga-frontend-mfe-gestao-canais-des-5fdf799cd4
apps/ReplicaSet
-
siiga-frontend-mfe-gestao-canais
7 days ago   06/03/26
 Healthy  
Secret
secret
akvs-siiga-frontend-gestao-canais-des-caixa-ssl-certificate
Secret
-
aks-istio-ingress
8 days ago   06/02/26
ConfigMap
cm
cm-siiga-frontend-mfe-gestao-canais
ConfigMap
-
siiga-frontend-mfe-gestao-canais
8 days ago   06/02/26
 OutOfSync
Endpoints
ep
siiga-frontend-mfe-gestao-canais-des
Endpoints
-
siiga-frontend-mfe-gestao-canais
22 days ago   05/19/26
Secret
secret
akv2k8s-siiga-frontend-mfe-gestao-canais-des
Secret
-
siiga-frontend-mfe-gestao-canais
22 days ago   05/19/26
Service
svc
siiga-frontend-mfe-gestao-canais-des
Service
-
siiga-frontend-mfe-gestao-canais
22 days ago   05/19/26
 Healthy   Synced
Deployment
deploy
siiga-frontend-mfe-gestao-canais-des
apps/Deployment
-
siiga-frontend-mfe-gestao-canais
22 days ago   05/19/26
 Healthy   Synced
Previous12Next
Items per page: 10 

SUMMARYPARAMETERSMANIFEST DIFFEVENTS
Compact diffInline diff
/ConfigMap/siiga-frontend-mfe-gestao-canais/cm-siiga-frontend-mfe-gestao-canais

apiVersion: v1	apiVersion: v1
data:	data:
  KEY: VALUE	  KEY: VALUE
kind: ConfigMap	kind: ConfigMap
metadata:	metadata:
  annotations:	  annotations:
    kubectl.kubernetes.io/last-applied-configuration: >	    kubectl.kubernetes.io/last-applied-configuration: >
      {"apiVersion":"v1","data":{"KEY":"VALUE"},"kind":"ConfigMap","metadata":{"annotations":{},"labels":{"app.kubernetes.io/instance":"siiga-frontend-mfe-gestao-canais-tqs","app.kubernetes.io/managed-by":"Helm","app.kubernetes.io/name":"siiga-frontend-mfe-gestao-canais-tqs","app.kubernetes.io/version":"1.16.0","backstage.io/kubernetes-id":"siiga-frontend-mfe-gestao-canais","helm.sh/chart":"caixa-base-chart-1.0.0"},"name":"cm-siiga-frontend-mfe-gestao-canais","namespace":"siiga-frontend-mfe-gestao-canais"}}	      {"apiVersion":"v1","data":{"KEY":"VALUE"},"kind":"ConfigMap","metadata":{"annotations":{},"labels":{"app.kubernetes.io/instance":"siiga-frontend-mfe-gestao-canais-tqs","app.kubernetes.io/managed-by":"Helm","app.kubernetes.io/name":"siiga-frontend-mfe-gestao-canais-tqs","app.kubernetes.io/version":"1.16.0","backstage.io/kubernetes-id":"siiga-frontend-mfe-gestao-canais","helm.sh/chart":"caixa-base-chart-1.0.0"},"name":"cm-siiga-frontend-mfe-gestao-canais","namespace":"siiga-frontend-mfe-gestao-canais"}}
  labels:	  labels:
    app.kubernetes.io/instance: siiga-frontend-mfe-gestao-canais-tqs	    app.kubernetes.io/instance: siiga-frontend-mfe-gestao-canais-des
    app.kubernetes.io/managed-by: Helm	    app.kubernetes.io/managed-by: Helm
    app.kubernetes.io/name: siiga-frontend-mfe-gestao-canais-tqs	    app.kubernetes.io/name: siiga-frontend-mfe-gestao-canais-des
    app.kubernetes.io/version: 1.16.0	    app.kubernetes.io/version: 1.16.0
    backstage.io/kubernetes-id: siiga-frontend-mfe-gestao-canais	    backstage.io/kubernetes-id: siiga-frontend-mfe-gestao-canais
    helm.sh/chart: caixa-base-chart-1.0.0	    helm.sh/chart: caixa-base-chart-1.0.0
  managedFields:	  managedFields:
    - apiVersion: v1	    - apiVersion: v1
      fieldsType: FieldsV1	      fieldsType: FieldsV1
      fieldsV1:	      fieldsV1:
        f:data:	        f:data:
          .: {}	          .: {}
          f:KEY: {}	          f:KEY: {}
        f:metadata:	        f:metadata:
          f:annotations:	          f:annotations:
            .: {}	            .: {}
            f:kubectl.kubernetes.io/last-applied-configuration: {}	            f:kubectl.kubernetes.io/last-applied-configuration: {}
          f:labels:	          f:labels:
            .: {}	            .: {}
            f:app.kubernetes.io/instance: {}	            f:app.kubernetes.io/instance: {}
            f:app.kubernetes.io/managed-by: {}	            f:app.kubernetes.io/managed-by: {}
            f:app.kubernetes.io/name: {}	            f:app.kubernetes.io/name: {}
            f:app.kubernetes.io/version: {}	            f:app.kubernetes.io/version: {}
            f:backstage.io/kubernetes-id: {}	            f:backstage.io/kubernetes-id: {}
            f:helm.sh/chart: {}	            f:helm.sh/chart: {}
      manager: argocd-controller	      manager: argocd-controller
      operation: Update	      operation: Update
      time: '2026-06-10T17:27:14Z'	      time: '2026-06-10T17:27:14Z'
  name: cm-siiga-frontend-mfe-gestao-canais	  name: cm-siiga-frontend-mfe-gestao-canais
  namespace: siiga-frontend-mfe-gestao-canais	  namespace: siiga-frontend-mfe-gestao-canais
  resourceVersion: '89946442'	  resourceVersion: '89946442'
  uid: b31c07d1-2345-46b3-9847-33667b17f95f	  uid: b31c07d1-2345-46b3-9847-33667b17f95f
spv.no/AzureKeyVaultSecret/aks-istio-ingress/akvs-siiga-frontend-mfe-gestao-canais

apiVersion: spv.no/v2beta1	apiVersion: spv.no/v2beta1
kind: AzureKeyVaultSecret	kind: AzureKeyVaultSecret
metadata:	metadata:
  annotations:	  annotations:
    kubectl.kubernetes.io/last-applied-configuration: >	    kubectl.kubernetes.io/last-applied-configuration: >
      {"apiVersion":"spv.no/v2beta1","kind":"AzureKeyVaultSecret","metadata":{"annotations":{},"labels":{"app.kubernetes.io/instance":"siiga-frontend-mfe-gestao-canais-tqs","app.kubernetes.io/managed-by":"Helm","app.kubernetes.io/name":"siiga-frontend-mfe-gestao-canais-tqs","app.kubernetes.io/version":"1.16.0","backstage.io/kubernetes-id":"siiga-frontend-mfe-gestao-canais","helm.sh/chart":"caixa-base-chart-1.0.0"},"name":"akvs-siiga-frontend-mfe-gestao-canais","namespace":"aks-istio-ingress"},"spec":{"output":{"secret":{"name":"akvs-siiga-frontend-gestao-canais-tqs-caixa-ssl-certificate","type":"kubernetes.io/tls"}},"vault":{"name":"kv-pla-nprd","object":{"name":"siiga-frontend-gestao-canais-tqs-caixa","type":"certificate"}}}}	      {"apiVersion":"spv.no/v2beta1","kind":"AzureKeyVaultSecret","metadata":{"annotations":{},"labels":{"app.kubernetes.io/instance":"siiga-frontend-mfe-gestao-canais-tqs","app.kubernetes.io/managed-by":"Helm","app.kubernetes.io/name":"siiga-frontend-mfe-gestao-canais-tqs","app.kubernetes.io/version":"1.16.0","backstage.io/kubernetes-id":"siiga-frontend-mfe-gestao-canais","helm.sh/chart":"caixa-base-chart-1.0.0"},"name":"akvs-siiga-frontend-mfe-gestao-canais","namespace":"aks-istio-ingress"},"spec":{"output":{"secret":{"name":"akvs-siiga-frontend-gestao-canais-tqs-caixa-ssl-certificate","type":"kubernetes.io/tls"}},"vault":{"name":"kv-pla-nprd","object":{"name":"siiga-frontend-gestao-canais-tqs-caixa","type":"certificate"}}}}
  generation: 4302	  generation: 4302
  labels:	  labels:
    app.kubernetes.io/instance: siiga-frontend-mfe-gestao-canais-tqs	    app.kubernetes.io/instance: siiga-frontend-mfe-gestao-canais-des
    app.kubernetes.io/managed-by: Helm	    app.kubernetes.io/managed-by: Helm
    app.kubernetes.io/name: siiga-frontend-mfe-gestao-canais-tqs	    app.kubernetes.io/name: siiga-frontend-mfe-gestao-canais-des
    app.kubernetes.io/version: 1.16.0	    app.kubernetes.io/version: 1.16.0
    backstage.io/kubernetes-id: siiga-frontend-mfe-gestao-canais	    backstage.io/kubernetes-id: siiga-frontend-mfe-gestao-canais
    helm.sh/chart: caixa-base-chart-1.0.0	    helm.sh/chart: caixa-base-chart-1.0.0
  managedFields:	  managedFields:
    - apiVersion: spv.no/v2beta1	    - apiVersion: spv.no/v2beta1
      fieldsType: FieldsV1	      fieldsType: FieldsV1
      fieldsV1:	      fieldsV1:
        f:status:	        f:status:
          .: {}	          .: {}
          f:lastAzureUpdate: {}	          f:lastAzureUpdate: {}
          f:secretHash: {}	          f:secretHash: {}
          f:secretName: {}	          f:secretName: {}
      manager: azure-keyvault-controller	      manager: azure-keyvault-controller
      operation: Update	      operation: Update
      subresource: status	      subresource: status
      time: '2026-06-10T17:27:13Z'	      time: '2026-06-10T17:27:13Z'
    - apiVersion: spv.no/v2beta1	    - apiVersion: spv.no/v2beta1
      fieldsType: FieldsV1	      fieldsType: FieldsV1
      fieldsV1:	      fieldsV1:
        f:metadata:	        f:metadata:
          f:annotations:	          f:annotations:
            .: {}	            .: {}
            f:kubectl.kubernetes.io/last-applied-configuration: {}	            f:kubectl.kubernetes.io/last-applied-configuration: {}
          f:labels:	          f:labels:
            .: {}	            .: {}
            f:app.kubernetes.io/instance: {}	            f:app.kubernetes.io/instance: {}
            f:app.kubernetes.io/managed-by: {}	            f:app.kubernetes.io/managed-by: {}
            f:app.kubernetes.io/name: {}	            f:app.kubernetes.io/name: {}
            f:app.kubernetes.io/version: {}	            f:app.kubernetes.io/version: {}
            f:backstage.io/kubernetes-id: {}	            f:backstage.io/kubernetes-id: {}
            f:helm.sh/chart: {}	            f:helm.sh/chart: {}
        f:spec:	        f:spec:
          .: {}	          .: {}
          f:output:	          f:output:
            .: {}	            .: {}
            f:secret:	            f:secret:
              .: {}	              .: {}
              f:name: {}	              f:name: {}
              f:type: {}	              f:type: {}
          f:vault:	          f:vault:
            .: {}	            .: {}
            f:name: {}	            f:name: {}
            f:object:	            f:object:
              .: {}	              .: {}
              f:name: {}	              f:name: {}
              f:type: {}	              f:type: {}
      manager: argocd-controller	      manager: argocd-controller
      operation: Update	      operation: Update
      time: '2026-06-10T17:27:14Z'	      time: '2026-06-10T17:27:14Z'
  name: akvs-siiga-frontend-mfe-gestao-canais	  name: akvs-siiga-frontend-mfe-gestao-canais
  namespace: aks-istio-ingress	  namespace: aks-istio-ingress
  resourceVersion: '89946443'	  resourceVersion: '89946443'
  uid: a1b5d0d6-b977-44cc-97ba-95e02c6eadb5	  uid: a1b5d0d6-b977-44cc-97ba-95e02c6eadb5
spec:	spec:
  output:	  output:
    secret:	    secret:
      name: akvs-siiga-frontend-gestao-canais-tqs-caixa-ssl-certificate	      name: akvs-siiga-frontend-gestao-canais-des-caixa-ssl-certificate
      type: kubernetes.io/tls	      type: kubernetes.io/tls
  vault:	  vault:
    name: kv-pla-nprd	    name: kv-pla-nprd
    object:	    object:
      name: siiga-frontend-gestao-canais-tqs-caixa	      name: siiga-frontend-gestao-canais-des-caixa
      type: certificate	      type: certificate
status:	status:
  lastAzureUpdate: '2026-06-10T17:27:13Z'	  lastAzureUpdate: '2026-06-10T17:27:13Z'
  secretHash: 08f496d00a0e0188be3d922295b006b6	  secretHash: 08f496d00a0e0188be3d922295b006b6
  secretName: akvs-siiga-frontend-gestao-canais-des-caixa-ssl-certificate	  secretName: akvs-siiga-frontend-gestao-canais-des-caixa-ssl-certificate




