
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
8
OutOfSync
0
HEALTH STATUS
Progressing
1
Suspended
0
Healthy
5
Degraded
2
Missing
0
Unknown
0
NAMESPACES
NAMESPACES
Show Orphaned
Applications
 sinsh-backend-simulador-pj-des
Application Details List
Log out
APP HEALTH 
 Degraded
SYNC STATUS 

 Synced
to HEAD (37b1231)
Auto sync is enabled.
Author:
ansible-connect-emu[bot] <230244411+ansible-connect-emu[bot]@users.noreply.github.com> -
Comment:
Merge pull request #6 from caixagithub/update-image-sinsh-backen
LAST SYNC 

 Sync OK
to 37b1231
Succeeded 16 minutes ago (Thu Jul 09 2026 16:56:14 GMT-0300)
Author:
ansible-connect-emu[bot] <230244411+ansible-connect-emu[bot]@users.noreply.github.com> -
Comment:
Merge pull request #6 from caixagithub/update-image-sinsh-backen
APP CONDITIONS
 1 Warning
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
sinsh-backend-simulador-pj-des-f8c44986-2kh9m
Pod
-
sinsh-backend-simulador-pj
16 minutes ago   07/09/26
 Degraded  
ReplicaSet
rs
sinsh-backend-simulador-pj-des-7c867bf478
apps/ReplicaSet
-
sinsh-backend-simulador-pj
25 minutes ago   07/09/26
 Healthy  
Pod
pod
sinsh-backend-simulador-pj-des-6476c6545b-bm52g
Pod
-
sinsh-backend-simulador-pj
5 hours ago   07/09/26
 Healthy  
ReplicaSet
rs
sinsh-backend-simulador-pj-des-6476c6545b
apps/ReplicaSet
-
sinsh-backend-simulador-pj
2 days ago   07/07/26
 Healthy  
ConfigMap
cm
cm-sinsh-backend-simulador-pj
ConfigMap
-
sinsh-backend-simulador-pj
2 days ago   07/07/26
 Synced
Endpoints
ep
sinsh-backend-simulador-pj-des
Endpoints
-
sinsh-backend-simulador-pj
2 days ago   07/07/26
Secret
secret
akv2k8s-sinsh-backend-simulador-pj-des
Secret
-
sinsh-backend-simulador-pj
2 days ago   07/07/26
Service
svc
sinsh-backend-simulador-pj-des
Service
-
sinsh-backend-simulador-pj
2 days ago   07/07/26
 Healthy   Synced
Deployment
deploy
sinsh-backend-simulador-pj-des
apps/Deployment
-
sinsh-backend-simulador-pj
2 days ago   07/07/26
 Degraded   Synced
ReplicaSet
rs
sinsh-backend-simulador-pj-des-85f5d794b8
apps/ReplicaSet
-
sinsh-backend-simulador-pj
2 days ago   07/07/26
 Healthy  
Previous12Next
Items per page: 10 

Podpod
sinsh-backend-simulador-pj-des-f8c44986-2kh9m
 SUMMARY EVENTS LOGS
REASON
MESSAGE
COUNT
FIRST OCCURRED
LAST OCCURRED
BackOff
Back-off restarting failed container sinsh-backend-simulador-pj-des in pod sinsh-backend-simulador-pj-des-f8c44986-2kh9m_sinsh-backend-simulador-pj(a8f329e0-52b2-42f5-9f8a-ca33ce080618)
73
15m ago
Today at 4:56 PM
47s ago
Today at 5:11 PM
Pulling
Pulling image "acrcentralcaixanprd.azurecr.io/sinsh/backend-simulador-pj/sinsh-backend-simulador-pj:29045779966"
8
15m ago
Today at 4:56 PM
4m ago
Today at 5:07 PM
Pulled
Successfully pulled image "acrcentralcaixanprd.azurecr.io/sinsh/backend-simulador-pj/sinsh-backend-simulador-pj:29045779966" in 66ms (66ms including waiting). Image size: 109547588 bytes.
1
12m ago
Today at 4:59 PM
12m ago
Today at 4:59 PM
Created
Created container: sinsh-backend-simulador-pj-des
5
15m ago
Today at 4:56 PM
14m ago
Today at 4:58 PM
Started
Started container sinsh-backend-simulador-pj-des
5
15m ago
Today at 4:56 PM
14m ago
Today at 4:58 PM
Pulled
Successfully pulled image "acrcentralcaixanprd.azurecr.io/sinsh/backend-simulador-pj/sinsh-backend-simulador-pj:29045779966" in 70ms (70ms including waiting). Image size: 109547588 bytes.
1
14m ago
Today at 4:58 PM
14m ago
Today at 4:58 PM
Pulled
Successfully pulled image "acrcentralcaixanprd.azurecr.io/sinsh/backend-simulador-pj/sinsh-backend-simulador-pj:29045779966" in 86ms (86ms including waiting). Image size: 109547588 bytes.
1
14m ago
Today at 4:57 PM
14m ago
Today at 4:57 PM
Pulled
Successfully pulled image "acrcentralcaixanprd.azurecr.io/sinsh/backend-simulador-pj/sinsh-backend-simulador-pj:29045779966" in 46ms (46ms including waiting). Image size: 109547588 bytes.
1
15m ago
Today at 4:56 PM
15m ago
Today at 4:56 PM
Pulled
Successfully pulled image "acrcentralcaixanprd.azurecr.io/sinsh/backend-simulador-pj/sinsh-backend-simulador-pj:29045779966" in 44ms (44ms including waiting). Image size: 109547588 bytes.
1
15m ago
Today at 4:56 PM
15m ago
Today at 4:56 PM
Pulled
Successfully pulled image "acrcentralcaixanprd.azurecr.io/sinsh/backend-simulador-pj/sinsh-backend-simulador-pj:29045779966" in 695ms (695ms including waiting). Image size: 109547588 bytes.
1
15m ago
Today at 4:56 PM
15m ago
Today at 4:56 PM
Pulled
Container image "spvest/azure-keyvault-env:1.7.4" already present on machine
1
15m ago
Today at 4:56 PM
15m ago
Today at 4:56 PM
Created
Created container: copy-azurekeyvault-env
1
15m ago
Today at 4:56 PM
15m ago
Today at 4:56 PM
Started
Started container copy-azurekeyvault-env
1
15m ago
Today at 4:56 PM
15m ago
Today at 4:56 PM
Scheduled
Successfully assigned sinsh-backend-simulador-pj/sinsh-backend-simulador-pj-des-f8c44986-2kh9m to aks-appshab-39542064-vmss00022i
15m ago
Today at 4:56 PM
15m ago
Today at 4:56 PM


1s
5m 4s
Run caixagithub/DevSecOps-Actions/.github/integrations/argocd/health@main
Run echo "REPO_NAME=$(echo 'caixagithub/sinsh-backend-simulador-pj' | cut -d'/' -f2)" >> $GITHUB_ENV
INPUT_IMAGE_TAG: '29045779966'
Run for i in {1..30}; do
Tentativa 1 - Phase: null, Health: Progressing, Sync: Synced, Argo_Tag: 28896781733, Image_Tag: 29045779966
Tentativa 2 - Phase: Running, Health: Progressing, Sync: Synced, Argo_Tag: 28896781733, Image_Tag: 29045779966
Sync ainda em execução, aguardando...
Tentativa 3 - Phase: Succeeded, Health: Progressing, Sync: Synced, Argo_Tag: 28896781733, Image_Tag: 29045779966
Tentativa 4 - Phase: Succeeded, Health: Progressing, Sync: Synced, Argo_Tag: 28896781733, Image_Tag: 29045779966
Tentativa 5 - Phase: Succeeded, Health: Progressing, Sync: Synced, Argo_Tag: 28896781733, Image_Tag: 29045779966
Tentativa 6 - Phase: Succeeded, Health: Progressing, Sync: Synced, Argo_Tag: 28896781733, Image_Tag: 29045779966
Tentativa 7 - Phase: Succeeded, Health: Progressing, Sync: Synced, Argo_Tag: 28896781733, Image_Tag: 29045779966
Tentativa 8 - Phase: Succeeded, Health: Progressing, Sync: Synced, Argo_Tag: 28896781733, Image_Tag: 29045779966
Tentativa 9 - Phase: Succeeded, Health: Progressing, Sync: Synced, Argo_Tag: 28896781733, Image_Tag: 29045779966
Tentativa 10 - Phase: Succeeded, Health: Progressing, Sync: Synced, Argo_Tag: 28896781733, Image_Tag: 29045779966
Tentativa 11 - Phase: Succeeded, Health: Progressing, Sync: Synced, Argo_Tag: 28896781733, Image_Tag: 29045779966
Tentativa 12 - Phase: Succeeded, Health: Progressing, Sync: Synced, Argo_Tag: 28896781733, Image_Tag: 29045779966
Tentativa 13 - Phase: Succeeded, Health: Progressing, Sync: Synced, Argo_Tag: 28896781733, Image_Tag: 29045779966
Tentativa 14 - Phase: Succeeded, Health: Progressing, Sync: Synced, Argo_Tag: 28896781733, Image_Tag: 29045779966
Tentativa 15 - Phase: Succeeded, Health: Progressing, Sync: Synced, Argo_Tag: 28896781733, Image_Tag: 29045779966
jq: parse error: Invalid numeric literal at line 1, column 7
Error: Process completed with exit code 5.
