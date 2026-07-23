coloquei o aks correto:


app:
  name: silce-backend-valida-assinatura-des
project:
  name: des
labels:
  appName: silce-backend-valida-assinatura
  environment: des
source:
  repo: "https://github.com/caixagithub/silce-backend-valida-assinatura-infranprd"
  path: des
sourcevar:
  repo: "https://github.com/caixagithub/silce-globalnprd"
  path: des
  values: global.yaml  
cluster:
  destination:  
    name: aks-silce-des
    namespace: silce-backend-valida-assinatura

    E agora ele aparece no arhgo cd  tanto des como tqs

    
Argo
v2.14.21+206a6ee
Argo
Applications
Settings
User Info
Documentation
Application filters
Favorites Only
SYNC STATUS
Unknown
95
Synced
845
OutOfSync
129
HEALTH STATUS
Progressing
43
Suspended
0
Healthy
779
Degraded
228
Missing
15
Unknown
4
LABELS
LABELS
PROJECTS
PROJECTS
CLUSTERS
CLUSTERS
NAMESPACES
NAMESPACES
AUTO SYNC
Applications
Applications Tiles
silce-ba
/
Log out
Sort: name  
Items per page: 10 
silce-backend-valida-assinatura-des

Project:
des
Labels:
appName=silce-backend-valida-assinatura, env=des
Status:
 Degraded  Synced 
Repository:
https://github.com/caixagithub/silce-backend-valida-assinatura-infranprd
Target Revision:
HEAD
Path:
des
Destination:
aks-silce-des
Namespace:
silce-backend-valida-assinatura
Created At:
07/23/2026 11:25:21 (3 hours ago)
Last Sync:
07/23/2026 11:27:48 (3 hours ago)
  
silce-backend-valida-assinatura-tqs

Project:
tqs
Labels:
appName=silce-backend-valida-assinatura, env=tqs
Status:
 Degraded  Synced 
Repository:
https://github.com/caixagithub/silce-backend-valida-assinatura-infranprd
Target Revision:
HEAD
Path:
tqs
Destination:
aks-silce-tqs
Namespace:
silce-backend-valida-assinatura
Created At:
07/23/2026 11:25:21 (3 hours ago)
Last Sync:
07/23/2026 11:25:33 (3 hours ago)
  




mais esta com erro:




log do pod:  
silce-backend-valida-assinatura-des-675777c7b9-469bj

I0723 14:03:59.503494       1 version.go:31] "version info" version="" commit="1e11cd2" buildDate="2024-10-04T10:20:06Z" component="vaultenv"
I0723 14:03:59.503601       1 main.go:184] "azure key vault env injector initializing"
I0723 14:03:59.503793       1 main.go:253] "found original container command" cmd="/usr/bin/java" args=["java","-jar","/opt/deploy/quarkus-run.jar"]
I0723 14:03:59.503843       1 authentication.go:110] "checking if current auth service credentials are stale" url="http://akv2k8s-envinjector.akv2k8s.svc:80/auth/silce-backend-valida-assinatura/silce-backend-valida-assinatura-des-675777c7b9-469bj?secret=akv2k8s-silce-backend-valida-assinatura-des"
I0723 14:03:59.577382       1 authentication.go:123] "auth service credentials ok" url="http://akv2k8s-envinjector.akv2k8s.svc:80/auth/silce-backend-valida-assinatura/silce-backend-valida-assinatura-des-675777c7b9-469bj?secret=akv2k8s-silce-backend-valida-assinatura-des"
I0723 14:03:59.577669       1 authentication.go:159] "requesting azure key vault oauth token" url="https://akv2k8s-envinjector.akv2k8s.svc:9443/auth/silce-backend-valida-assinatura/silce-backend-valida-assinatura-des-675777c7b9-469bj"
I0723 14:03:59.622523       1 authentication.go:179] "successfully received oauth token"
I0723 14:03:59.757495       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="silce-backend-valida-assinatura/akvs-env-siper-password" env="CICS_PASSWORD"
I0723 14:03:59.757528       1 main.go:343] "starting process with secrets in env vars" cmd="/usr/bin/java" args=["java","-jar","/opt/deploy/quarkus-run.jar"]
__  ____  __  _____   ___  __ ____  ______
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/
2026-07-23 14:04:03,140 WARN  [io.qua.cxf.fea.dep.log.DeprecatedLoggingRecorder] (main) io.quarkiverse.cxf:quarkus-cxf-rt-features-logging is deprecated and will be removed in the future. Use io.quarkiverse.cxf:quarkus-cxf instead.
2026-07-23 14:04:04,034 INFO  [io.quarkus] (main) backend-valida-assinatura 1.0.0 on JVM (powered by Quarkus 3.27.1) started in 4.189s. Listening on: http://0.0.0.0:8080
2026-07-23 14:04:04,034 INFO  [io.quarkus] (main) Profile prod activated.
2026-07-23 14:04:04,034 INFO  [io.quarkus] (main) Installed features: [cdi, cxf, hibernate-validator, rest, rest-jackson, smallrye-context-propagation, vertx]
2026-07-23 14:05:39,038 INFO  [io.quarkus] (Shutdown thread) backend-valida-assinatura stopped in 0.053s


events:



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
0
HEALTH STATUS
Progressing
1
Suspended
0
Healthy
2
Degraded
2
Missing
0
Unknown
0
Show Orphaned
Applications
 silce-backend-valida-assinatura-des
Application Details List
Log out
APP HEALTH 
 Degraded
SYNC STATUS 

 Synced
to HEAD (f75c74a)
Auto sync is enabled.
Author:
ansible-connect-emu[bot] <230244411+ansible-connect-emu[bot]@users.noreply.github.com> -
Comment:
Merge pull request #5 from caixagithub/update-image-silce-backen
LAST SYNC 

 Sync OK
to f75c74a
Succeeded 3 hours ago (Thu Jul 23 2026 11:27:48 GMT-0300)
Author:
ansible-connect-emu[bot] <230244411+ansible-connect-emu[bot]@users.noreply.github.com> -
Comment:
Merge pull request #5 from caixagithub/update-image-silce-backen
APP CONDITIONS
 1 Warning
Items per page: 10 
NAME
GROUP/KIND
SYNC ORDER
NAMESPACE
CREATED AT
STATUS
Pod
pod
silce-backend-valida-assinatura-des-675777c7b9-469bj
Pod
-
silce-backend-valida-assinatura
an hour ago   07/23/26
 Degraded  
Secret
secret
akv2k8s-silce-backend-valida-assinatura-des
Secret
-
silce-backend-valida-assinatura
3 hours ago   07/23/26
AKVS
azurekeyvaultsecret
akvs-env-siper-password
spv.no/AzureKeyVaultSecret
-
silce-backend-valida-assinatura
3 hours ago   07/23/26
 Synced
ConfigMap
cm
cm-silce-backend-valida-assinatura
ConfigMap
-
silce-backend-valida-assinatura
3 hours ago   07/23/26
 Synced
Endpoints
ep
silce-backend-valida-assinatura-des
Endpoints
-
silce-backend-valida-assinatura
3 hours ago   07/23/26
Service
svc
silce-backend-valida-assinatura-des
Service
-
silce-backend-valida-assinatura
3 hours ago   07/23/26
 Healthy   Synced
Deployment
deploy
silce-backend-valida-assinatura-des
apps/Deployment
-
silce-backend-valida-assinatura
3 hours ago   07/23/26
 Degraded   Synced
ReplicaSet
rs
silce-backend-valida-assinatura-des-675777c7b9
apps/ReplicaSet
-
silce-backend-valida-assinatura
3 hours ago   07/23/26
 Progressing  
EndpointSlice
endpointslice
silce-backend-valida-assinatura-des-zd2qb
discovery.k8s.io/EndpointSlice
-
silce-backend-valida-assinatura
3 hours ago   07/23/26
Ingress
ing
silce-backend-valida-assinatura-des-internal
networking.k8s.io/Ingress
-
silce-backend-valida-assinatura
3 hours ago   07/23/26
 Healthy   Synced

Podpod
silce-backend-valida-assinatura-des-675777c7b9-469bj
 SUMMARY EVENTS LOGS
REASON
MESSAGE
COUNT
FIRST OCCURRED
LAST OCCURRED
Unhealthy
Readiness probe failed: HTTP probe failed with statuscode: 404
66
59m ago
Today at 1:09 PM
3m ago
Today at 2:05 PM
Killing
Container silce-backend-valida-assinatura-des failed liveness probe, will be restarted
17
58m ago
Today at 1:09 PM
4m ago
Today at 2:03 PM
Pulling
Pulling image "acrcentralcaixanprd.azurecr.io/silce/backend-valida-assinatura/silce-backend-valida-assinatura:29947332614"
17
1h ago
Today at 1:08 PM
6m ago
Today at 2:02 PM
BackOff
Back-off restarting failed container silce-backend-valida-assinatura-des in pod silce-backend-valida-assinatura-des-675777c7b9-469bj_silce-backend-valida-assinatura(67cf406c-8d42-495f-862f-8c1e24b6c6e1)
29
48m ago
Today at 1:19 PM
8m ago
Today at 1:59 PM
Unhealthy
Liveness probe failed: HTTP probe failed with statuscode: 404
13
59m ago
Today at 1:09 PM
49m ago
Today at 1:19 PM
Pulled
Successfully pulled image "acrcentralcaixanprd.azurecr.io/silce/backend-valida-assinatura/silce-backend-valida-assinatura:29947332614" in 76ms (76ms including waiting). Image size: 303322207 bytes.
1
50m ago
Today at 1:17 PM
50m ago
Today at 1:17 PM
Created
Container created
5
1h ago
Today at 1:08 PM
53m ago
Today at 1:14 PM
Pulled
Successfully pulled image "acrcentralcaixanprd.azurecr.io/silce/backend-valida-assinatura/silce-backend-valida-assinatura:29947332614" in 78ms (78ms including waiting). Image size: 303322207 bytes.
1
53m ago
Today at 1:14 PM
53m ago
Today at 1:14 PM
Started
Container started
4
1h ago
Today at 1:08 PM
55m ago
Today at 1:12 PM
Pulled
Successfully pulled image "acrcentralcaixanprd.azurecr.io/silce/backend-valida-assinatura/silce-backend-valida-assinatura:29947332614" in 129ms (129ms including waiting). Image size: 303322207 bytes.
1
55m ago
Today at 1:12 PM
55m ago
Today at 1:12 PM
Pulled
Successfully pulled image "acrcentralcaixanprd.azurecr.io/silce/backend-valida-assinatura/silce-backend-valida-assinatura:29947332614" in 89ms (89ms including waiting). Image size: 303322207 bytes.
1
57m ago
Today at 1:11 PM
57m ago
Today at 1:11 PM
Pulled
Successfully pulled image "acrcentralcaixanprd.azurecr.io/silce/backend-valida-assinatura/silce-backend-valida-assinatura:29947332614" in 86ms (86ms including waiting). Image size: 303322207 bytes.
1
58m ago
Today at 1:09 PM
58m ago
Today at 1:09 PM
Pulled
Successfully pulled image "acrcentralcaixanprd.azurecr.io/silce/backend-valida-assinatura/silce-backend-valida-assinatura:29947332614" in 2.153s (2.153s including waiting). Image size: 303322207 bytes.
1
1h ago
Today at 1:08 PM
1h ago
Today at 1:08 PM
Pulled
Container image "spvest/azure-keyvault-env:1.7.3" already present on machine and can be accessed by the pod
1
1h ago
Today at 1:07 PM
1h ago
Today at 1:07 PM
Created
Container created
1
1h ago
Today at 1:07 PM
1h ago
Today at 1:07 PM
Started
Container started
1
1h ago
Today at 1:07 PM
1h ago
Today at 1:07 PM
Scheduled
Successfully assigned silce-backend-valida-assinatura/silce-backend-valida-assinatura-des-675777c7b9-469bj to aks-workloads-39813772-vmss00024o
1h ago
Today at 1:07 PM
1h ago
Today at 1:07 PM
FailedScheduling
0/8 nodes are available: 3 node(s) had untolerated taint(s), 5 Insufficient cpu. no new claims to deallocate, preemption: 0/8 nodes are available: 3 Preemption is not helpful for scheduling, 5 No preemption victims found for incoming pod.
1h ago
Today at 1:07 PM
1h ago
Today at 1:07 PM


