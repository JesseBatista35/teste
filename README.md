


Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
sisva-frontend-transacional
Repository navigation
Code
Issues
Pull requests
Actions
Projects
Models
Wiki
Security and quality
16
 (16)
Insights
Settings
CI/CD Workflow Generic
caixagithub/sisva-frontend-transacional_feat/adaptacao-frontend_29850860726.4 #4
All jobs
Run details
Annotations
1 error and 1 warning
CI_DES / ArgoCD_Deploy / ArgoCD_Deploy (DES)
failed yesterday in 1m 20s
Search logs
10s
0s
0s
0s
0s
0s
0s
0s
0s
0s
0s
0s
27s
0s
5s
0s
3s
0s
1s
0s
21s
5s
0s
Run caixagithub/DevSecOps-Actions/.github/integrations/argocd/argocd-get-destination@main
  with:
    argocd_server: https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io
    app_name: sisva-frontend-transacional
    environment: DES
  env:
    APIM_VERSIONAPI: 
    APIM_displaynameAPI: 
    APIM_PATH: 
    APIM_SWAGGERPATH: 
    APIM_TAGSAPI: 
    APIM_POLICIESALLOPERATIONSPATH: 
    environment: des
    repository_suffix: infranprd
    REPO: sisva-frontend-transacional
    JOB_ID: 120920
    ARGOCD_AUTH_TOKEN: ***
Run set -euo pipefail
  set -euo pipefail
  
  # Converte environment para lowercase
  ENVIRONMENT_LOWER=$(echo "${ENVIRONMENT}" | tr '[:upper:]' '[:lower:]')
  
  echo "ENVIRONMENT_LOWER=${ENVIRONMENT_LOWER}"
  
  APP_NAME_LOWER=$(echo "${APP_NAME}" | tr '[:upper:]' '[:lower:]')
  
  echo "APP_NAME_LOWER=${APP_NAME_LOWER}"
  
  # Concatena app_name com ambiente
  FULL_APP_NAME="${APP_NAME_LOWER}-${ENVIRONMENT_LOWER}"
  
  # Monta a URL
  URL="${ARGOCD_SERVER}/api/v1/applications/${FULL_APP_NAME}"
  
  # Consulta a API
  RESP="$(curl -sS -H "Authorization: ***" -H "Content-Type: application/json" "$URL")"
  
  # Valida resposta básica
  if [ -z "$RESP" ] || echo "$RESP" | jq -e '.code, .status, .error' >/dev/null 2>&1; then
    echo "Falha ao obter Application ou erro retornado:"
    echo "$RESP"
    exit 1
  fi
  
  echo "::group::Resposta bruta da API"
  echo "$RESP" | jq .
  echo "::endgroup::"
  
0s
0s
0s
0s
0s
0s
0s
0s
0s
0s
0s
1s
0s
0s
<img width="1889" height="954" alt="image" src="https://github.com/user-attachments/assets/b8135266-061c-4963-a8be-7ec8bf541f6f" />


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
5
OutOfSync
1
HEALTH STATUS
Progressing
2
Suspended
0
Healthy
3
Degraded
1
Missing
1
Unknown
0
NAMESPACES
NAMESPACES
Applications
 sisva-frontend-transacional-des
Application Details Tree
Log out
APP HEALTH 
 Degraded
SYNC STATUS 

 OutOfSync
from HEAD (ffaab11)
Auto sync is enabled.
Author:
ansible-connect-emu[bot] <230244411+ansible-connect-emu[bot]@users.noreply.github.com> -
Comment:
Merge pull request #3 from caixagithub/update-image-sisva-fronte
LAST SYNC 

 Sync failed
to ffaab11
Failed a day ago (Tue Jul 21 2026 15:10:43 GMT-0300)
Author:
ansible-connect-emu[bot] <230244411+ansible-connect-emu[bot]@users.noreply.github.com> -
Comment:
Merge pull request #3 from caixagithub/update-image-sisva-fronte
APP CONDITIONS
 1 Error
ConfigMap
cm
cm-sisva-frontend-transacional
a day

sisva-frontend-transacional-des
  
a day
Service
svc
sisva-frontend-transacional-des
a day
Endpoints
ep
sisva-frontend-transacional-des
a day
EndpointSlice
endpointslice
sisva-frontend-transacional-des-72zr5
a day
Deployment
deploy
sisva-frontend-transacional-des
a dayRev:1
ReplicaSet
rs
sisva-frontend-transacional-des-d565dc848
a dayRev:1
Pod
pod
sisva-frontend-transacional-des-d565dc848-ssgqp
2 hoursContainerCreating0/1
Secret
secret
akv2k8s-sisva-frontend-transacional-des
a day
Ingress
ing
sisva-frontend-transacional-des-custom
 
a day
Ingress
ing
sisva-frontend-transacional-des-internal
 
a day
AKVS
azurekeyvaultsecret
akvs-sisva-transacional-des-caixa-ssl-certificate

Podpod
sisva-frontend-transacional-des-d565dc848-ssgqp
 SUMMARY EVENTS LOGS
REASON
MESSAGE
COUNT
FIRST OCCURRED
LAST OCCURRED
FailedMount
MountVolume.SetUp failed for volume "config-volume" : configmap "cm-siacx-chatcaixa-frontend" not found
55
1h ago
Today at 2:20 PM
2m ago
Today at 3:56 PM


container "sisva-frontend-transacional-des" in pod "sisva-frontend-transacional-des-d565dc848-ssgqp" is waiting to start: ContainerCreating

