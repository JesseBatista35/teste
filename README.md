	https://github.com/caixagithub/sigos-backend-processamento-arquivos
Selecione a sua Comunidade*:	Fundos de Governo
Formas de contato*:	teams - c101476
Descrição da necessidade*:	  ENVIRONMENT_LOWER=des
  APP_NAME_LOWER=sigos-backend-processamento-arquivos
  Falha ao obter Application ou erro retornado:
  {"error":"permission denied","code":7,"message":"permission denied"}
  Error: Process completed with exit code 1.


o erro inicial foi resolvido com o cluster aks correto:

aks-mcmv-nprd

porem agora ta dando esse erro,

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
11
OutOfSync
0
HEALTH STATUS
Progressing
2
Suspended
0
Healthy
1
Degraded
1
Missing
0
Unknown
0
NAMESPACES
NAMESPACES
Show Orphaned
Applications
 sigos-backend-processamento-arquivos-des
Application Details List
Log out
APP HEALTH 
 Degraded
SYNC STATUS 

 Synced
to HEAD (7b45a46)
Auto sync is enabled.
Author:
ansible-connect-emu[bot] <230244411+ansible-connect-emu[bot]@users.noreply.github.com> -
Comment:
Merge pull request #3 from caixagithub/update-image-sigos-backen
LAST SYNC 

 Sync OK
to 7b45a46
Succeeded 10 minutes ago (Tue Aug 25 2026 12:41:57 GMT-0300)
Author:
ansible-connect-emu[bot] <230244411+ansible-connect-emu[bot]@users.noreply.github.com> -
Comment:
Merge pull request #3 from caixagithub/update-image-sigos-backen
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
sigos-backend-processamento-arquivos-des-5969d6f7c8-d2svv
Pod
-
sigos-backend-processamento-arquivos
18 minutes ago   08/25/26
 Progressing  
G
gateway
sigos-backend-processamento-arquivos-des-internal
networking.istio.io/Gateway
-
sigos-backend-processamento-arquivos
18 minutes ago   08/25/26
 Synced
ConfigMap
cm
cm-sigos-backend-processamento-arquivos-des
ConfigMap
-
sigos-backend-processamento-arquivos
18 minutes ago   08/25/26
 Synced
Endpoints
ep
sigos-backend-processamento-arquivos-des
Endpoints
-
sigos-backend-processamento-arquivos
18 minutes ago   08/25/26
Secret
secret
akv2k8s-sigos-backend-processamento-arquivos-des
Secret
-
sigos-backend-processamento-arquivos
18 minutes ago   08/25/26
Service
svc
sigos-backend-processamento-arquivos-des
Service
-
sigos-backend-processamento-arquivos
18 minutes ago   08/25/26
 Healthy   Synced
Deployment
deploy
sigos-backend-processamento-arquivos-des
apps/Deployment
-
sigos-backend-processamento-arquivos
18 minutes ago   08/25/26
 Degraded   Synced
ReplicaSet
rs
sigos-backend-processamento-arquivos-des-5969d6f7c8
apps/ReplicaSet
-
sigos-backend-processamento-arquivos
18 minutes ago   08/25/26
 Progressing  
EndpointSlice
endpointslice
sigos-backend-processamento-arquivos-des-rfhqj
discovery.k8s.io/EndpointSlice
-
sigos-backend-processamento-arquivos
18 minutes ago   08/25/26
VS
virtualservice
sigos-backend-processamento-arquivos-des-internal
networking.istio.io/VirtualService
-
sigos-backend-processamento-arquivos
18 minutes ago   08/25/26
 Synced
Previous12Next
Items per page: 10 

Podpod
sigos-backend-processamento-arquivos-des-5969d6f7c8-d2svv
 SUMMARY EVENTS LOGS
REASON
MESSAGE
COUNT
FIRST OCCURRED
LAST OCCURRED
NotTriggerScaleUp
pod didn't trigger scale-up: 4 node(s) had untolerated taint(s)
91
17m ago
Today at 12:33 PM
2m ago
Today at 12:49 PM
FailedScheduling
0/5 nodes are available: 5 node(s) had untolerated taint(s). no new claims to deallocate, preemption: 0/5 nodes are available: 5 Preemption is not helpful for scheduling.
12m ago
Today at 12:39 PM
12m ago
Today at 12:39 PM
FailedScheduling
0/5 nodes are available: 5 node(s) had untolerated taint(s). no new claims to deallocate, preemption: 0/5 nodes are available: 5 Preemption is not helpful for scheduling.
17m ago
Today at 12:33 PM
17m ago
Today at 12:33 PM
