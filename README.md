pessoal da nuvem aumetou os recuros agora ta assim:

Applications
 sigec-opf-des
Application Details List
Log out
APP HEALTH 
 Healthy
SYNC STATUS 

 OutOfSync
from HEAD (3749106)
Auto sync is enabled.
Author:
Jesse Mouta Pereira Batista <p585600@corp.caixa.gov.br> -
Comment:
Update values.yaml
LAST SYNC 

 Sync OK
to 3749106
Succeeded a few seconds ago (Thu May 28 2026 18:36:50 GMT-0300)
Author:
Jesse Mouta Pereira Batista <p585600@corp.caixa.gov.br> -
Comment:
Update values.yaml
APP CONDITIONS
 5 Warnings
Previous123Next
Items per page: 10 
NAME
GROUP/KIND
SYNC ORDER
NAMESPACE
CREATED AT
STATUS
Pod
pod
sigec-opf-des-d994765f5-6mbfm
Pod
-
sigec-opf
2 hours ago   05/28/26
 Healthy  
ReplicaSet
rs
sigec-opf-des-7ffdb96d7c
apps/ReplicaSet
-
sigec-opf
4 hours ago   05/28/26
 Healthy  
Secret
secret
akv2k8s-sigec-opf-des
Secret
-
sigec-opf
5 hours ago   05/28/26
ReplicaSet
rs
sigec-opf-des-5b95cc7d47
apps/ReplicaSet
-
sigec-opf
5 hours ago   05/28/26
 Healthy  
Deployment
deploy
sigec-opf-des
apps/Deployment
-
sigec-opf
5 hours ago   05/28/26
 Healthy   Synced
Secret
secret
akvs-sigec-opf-api-des-caixa-certificate
Secret
-
aks-istio-ingress
7 months ago   10/23/25
Secret
secret
akvs-akvs-sigec-opf-api-des-caixa-certificate
Secret
-
aks-istio-ingress
9 months ago   08/18/25
ConfigMap
cm
cm-sigec-opf
ConfigMap
-
sigec-opf
10 months ago   07/16/25
 Synced
Endpoints
ep
sigec-opf-des
Endpoints
-
sigec-opf
10 months ago   07/16/25

REASON
MESSAGE
COUNT
FIRST OCCURRED
LAST OCCURRED
Unhealthy
Readiness probe failed: Get "http://192.168.17.9:8080/sigec-opf-api/actuator/health/readiness": context deadline exceeded (Client.Timeout exceeded while awaiting headers)
1
1m ago
Today at 6:36 PM
1m ago
Today at 6:36 PM
Unhealthy
Liveness probe failed: Get "http://192.168.17.9:8080/sigec-opf-api/actuator/health/liveness": dial tcp 192.168.17.9:8080: connect: connection refused
4
2m ago
Today at 6:35 PM
1m ago
Today at 6:36 PM
Unhealthy
Readiness probe failed: Get "http://192.168.17.9:8080/sigec-opf-api/actuator/health/readiness": dial tcp 192.168.17.9:8080: connect: connection refused
6
3m ago
Today at 6:34 PM
2m ago
Today at 6:36 PM
Pulled
Successfully pulled image "acrcentralcaixanprd.azurecr.io/sigec/opf/sigec-opf:26597911912" in 11.695s (11.695s including waiting). Image size: 272112420 bytes.
1
3m ago
Today at 6:34 PM
3m ago
Today at 6:34 PM
Created
Created container: sigec-opf-des
1
3m ago
Today at 6:34 PM
3m ago
Today at 6:34 PM
Started
Started container sigec-opf-des
1
3m ago
Today at 6:34 PM
3m ago
Today at 6:34 PM
Started
Started container copy-azurekeyvault-env
1
3m ago
Today at 6:34 PM

