/docker-entrypoint.sh: /docker-entrypoint.d/ is not empty, will attempt to perform configuration
/docker-entrypoint.sh: Looking for shell scripts in /docker-entrypoint.d/
/docker-entrypoint.sh: Launching /docker-entrypoint.d/10-listen-on-ipv6-by-default.sh
10-listen-on-ipv6-by-default.sh: info: Getting the checksum of /etc/nginx/conf.d/default.conf
10-listen-on-ipv6-by-default.sh: info: /etc/nginx/conf.d/default.conf differs from the packaged version
/docker-entrypoint.sh: Sourcing /docker-entrypoint.d/15-local-resolvers.envsh
/docker-entrypoint.sh: Launching /docker-entrypoint.d/20-envsubst-on-templates.sh
/docker-entrypoint.sh: Launching /docker-entrypoint.d/30-tune-worker-processes.sh
/docker-entrypoint.sh: Configuration complete; ready for start up
2026/11/03 18:01:13 [notice] 1#1: using the "epoll" event method
2026/11/03 18:01:13 [notice] 1#1: nginx/1.31.8
2026/11/03 18:01:13 [notice] 1#1: built by gcc 15.2.0 (Alpine 15.2.0)
2026/11/03 18:01:13 [notice] 1#1: OS: Linux 6.8.0-1071-azure
2026/11/03 18:01:13 [notice] 1#1: getrlimit(RLIMIT_NOFILE): 1048576:1048576
2026/11/03 18:01:13 [notice] 1#1: start worker processes
2026/11/03 18:01:13 [notice] 1#1: start worker process 29
2026/11/03 18:01:13 [notice] 1#1: start worker process 30
2026/11/03 18:01:13 [notice] 1#1: start worker process 31
2026/11/03 18:01:13 [notice] 1#1: start worker process 32
2026/11/03 18:01:13 [notice] 1#1: start worker process 33
2026/11/03 18:01:13 [notice] 1#1: start worker process 34
2026/11/03 18:01:13 [notice] 1#1: start worker process 35
2026/11/03 18:01:13 [notice] 1#1: start worker process 36
2026/11/03 18:01:29 [error] 29#29: *1 open() "/usr/share/nginx/html/q/health/live" failed (2: No such file or directory), client: 192.168.9.1, server: localhost, request: "GET /q/health/live HTTP/1.1", host: "192.168.9.30:8080"
192.168.9.1 - - [03/Nov/2026:18:01:29 +0000] "GET /q/health/live HTTP/1.1" 404 153 "-" "kube-probe/1.35" "-"
2026/11/03 18:01:43 [error] 30#30: *2 open() "/usr/share/nginx/html/q/health/live" failed (2: No such file or directory), client: 192.168.9.1, server: localhost, request: "GET /q/health/live HTTP/1.1", host: "192.168.9.30:8080"
192.168.9.1 - - [03/Nov/2026:18:01:43 +0000] "GET /q/health/live HTTP/1.1" 404 153 "-" "kube-probe/1.35" "-"
2026/11/03 18:01:44 [error] 31#31: *3 open() "/usr/share/nginx/html/q/health/live" failed (2: No such file or directory), client: 192.168.9.1, server: localhost, request: "GET /q/health/live HTTP/1.1", host: "192.168.9.30:8080"
192.168.9.1 - - [03/Nov/2026:18:01:44 +0000] "GET /q/health/live HTTP/1.1" 404 153 "-" "kube-probe/1.35" "-"
2026/11/03 18:01:58 [error] 32#32: *4 open() "/usr/share/nginx/html/q/health/live" failed (2: No such file or directory), client: 192.168.9.1, server: localhost, request: "GET /q/health/live HTTP/1.1", host: "192.168.9.30:8080"
192.168.9.1 - - [03/Nov/2026:18:01:58 +0000] "GET /q/health/live HTTP/1.1" 404 153 "-" "kube-probe/1.35" "-"
2026/11/03 18:01:59 [error] 33#33: *5 open() "/usr/share/nginx/html/q/health/live" failed (2: No such file or directory), client: 192.168.9.1, server: localhost, request: "GET /q/health/live HTTP/1.1", host: "192.168.9.30:8080"
192.168.9.1 - - [03/Nov/2026:18:01:59 +0000] "GET /q/health/live HTTP/1.1" 404 153 "-" "kube-probe/1.35" "-"




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
6
OutOfSync
0
HEALTH STATUS
Progressing
1
Suspended
0
Healthy
4
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
 vitec-sda8c-frontend-hub-ciaussp-frontend-2026-des
Application Details List
Log out
APP HEALTH 
 Degraded
SYNC STATUS 

 Synced
to HEAD (b53e6e3)
Auto sync is enabled.
Author:
Cledson Moreira Parente <p590589@corp.caixa.gov.br> -
Comment:
Update values.yaml
LAST SYNC 

 Sync OK
to b53e6e3
Succeeded 2 hours ago (Tue Nov 03 2026 12:42:26 GMT-0300)
Author:
Cledson Moreira Parente <p590589@corp.caixa.gov.br> -
Comment:
Update values.yaml
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
vitec-sda8c-frontend-hub-ciaussp-frontend-2026-des-75b7fcfbfk4k
Pod
-
vitec-sda8c-frontend-hub-ciaussp-frontend-2026-nprd
2 hours ago   11/03/26
 Degraded  
Pod
pod
vitec-sda8c-frontend-hub-ciaussp-frontend-2026-des-54cb864hbgv9
Pod
-
vitec-sda8c-frontend-hub-ciaussp-frontend-2026-nprd
2 hours ago   11/03/26
 Healthy  
Endpoints
ep
vitec-sda8c-frontend-hub-ciaussp-frontend-2026-des
Endpoints
-
vitec-sda8c-frontend-hub-ciaussp-frontend-2026-nprd
2 hours ago   11/03/26
Service
svc
vitec-sda8c-frontend-hub-ciaussp-frontend-2026-des
Service
-
vitec-sda8c-frontend-hub-ciaussp-frontend-2026-nprd
2 hours ago   11/03/26
 Healthy   Synced
ReplicaSet
rs
vitec-sda8c-frontend-hub-ciaussp-frontend-2026-des-6f89bdcb6d
apps/ReplicaSet
-
vitec-sda8c-frontend-hub-ciaussp-frontend-2026-nprd
4 days ago   10/30/26
 Healthy  
ReplicaSet
rs
vitec-sda8c-frontend-hub-ciaussp-frontend-2026-des-75b7fcffb7
apps/ReplicaSet
-
vitec-sda8c-frontend-hub-ciaussp-frontend-2026-nprd
5 days ago   10/29/26
 Progressing  
ConfigMap
cm
cm-vitec-sda8c-frontend-hub-ciaussp-frontend-2026
ConfigMap
-
vitec-sda8c-frontend-hub-ciaussp-frontend-2026-nprd
2 months ago   08/20/26
 Synced
Secret
secret
akv2k8s-vitec-sda8c-frontend-hub-ciaussp-frontend-2026-des
Secret
-
vitec-sda8c-frontend-hub-ciaussp-frontend-2026-nprd
2 months ago   08/20/26
Deployment
deploy
vitec-sda8c-frontend-hub-ciaussp-frontend-2026-des
apps/Deployment
-
vitec-sda8c-frontend-hub-ciaussp-frontend-2026-nprd
2 months ago   08/20/26
 Degraded   Synced
ReplicaSet
rs
vitec-sda8c-frontend-hub-ciaussp-frontend-2026-des-54cb864df8
apps/ReplicaSet
-
vitec-sda8c-frontend-hub-ciaussp-frontend-2026-nprd
2 months ago   08/20/26
 Healthy  
Previous12Next
Items per page: 10 

Podpod
vitec-sda8c-frontend-hub-ciaussp-frontend-2026-des-75b7fcfbfk4k
 SUMMARY EVENTS LOGS
REASON
MESSAGE
COUNT
FIRST OCCURRED
LAST OCCURRED
Unhealthy
Readiness probe failed: HTTP probe failed with statuscode: 404
354
2h ago
Today at 12:42 PM
3m ago
Today at 2:58 PM
Pulling
Pulling image "acrcentralcaixanprd.azurecr.io/vitec/sda8c-frontend-hub-ciaussp-frontend-2026/vitec-sda8c-frontend-hub-ciaussp-frontend-2026:40890595504"
29
2h ago
Today at 12:42 PM
4m ago
Today at 2:58 PM
BackOff
Back-off restarting failed container vitec-sda8c-frontend-hub-ciaussp-frontend-2026-des in pod vitec-sda8c-frontend-hub-ciaussp-frontend-2026-des-75b7fcfbfk4k_vitec-sda8c-frontend-hub-ciaussp-frontend-2026-nprd(abf88af4-2060-45b0-b1a6-0a4092c4920c)
57
1h ago
Today at 1:04 PM
8m ago
Today at 2:54 PM
Killing
Container vitec-sda8c-frontend-hub-ciaussp-frontend-2026-des failed liveness probe, will be restarted
28
2h ago
Today at 12:45 PM
9m ago
Today at 2:52 PM
Pulled
(combined from similar events): Successfully pulled image "acrcentralcaixanprd.azurecr.io/vitec/sda8c-frontend-hub-ciaussp-frontend-2026/vitec-sda8c-frontend-hub-ciaussp-frontend-2026:40890595504" in 86ms (86ms including waiting). Image size: 26621594 bytes.
11
1h ago
Today at 1:20 PM
44m ago
Today at 2:17 PM
