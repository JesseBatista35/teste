
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
0
Suspended
0
Healthy
7
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
 vitec-sda8c-frontend-hub-ciaussp-frontend-2026-des
Application Details List
Log out
APP HEALTH 
 Healthy
SYNC STATUS 

 Synced
to HEAD (90337f4)
Auto sync is enabled.
Author:
Jesse Mouta Pereira Batista <p585600@corp.caixa.gov.br> -
Comment:
Update values.yaml
LAST SYNC 

 Sync OK
to 90337f4
Succeeded 4 minutes ago (Tue Nov 03 2026 15:27:56 GMT-0300)
Author:
Jesse Mouta Pereira Batista <p585600@corp.caixa.gov.br> -
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
vitec-sda8c-frontend-hub-ciaussp-frontend-2026-des-7cd46f72kl4v
Pod
-
vitec-sda8c-frontend-hub-ciaussp-frontend-2026-nprd
4 minutes ago   11/03/26
 Healthy  
ReplicaSet
rs
vitec-sda8c-frontend-hub-ciaussp-frontend-2026-des-7cd46f778f
apps/ReplicaSet
-
vitec-sda8c-frontend-hub-ciaussp-frontend-2026-nprd
4 minutes ago   11/03/26
 Healthy  
Endpoints
ep
vitec-sda8c-frontend-hub-ciaussp-frontend-2026-des
Endpoints
-
vitec-sda8c-frontend-hub-ciaussp-frontend-2026-nprd
3 hours ago   11/03/26
Service
svc
vitec-sda8c-frontend-hub-ciaussp-frontend-2026-des
Service
-
vitec-sda8c-frontend-hub-ciaussp-frontend-2026-nprd
3 hours ago   11/03/26
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
 Healthy  
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
 Healthy   Synced
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
2026-11-03T15:42:26Z


ja sicnrnoxou mando

/docker-entrypoint.sh: /docker-entrypoint.d/ is not empty, will attempt to perform configuration
/docker-entrypoint.sh: Looking for shell scripts in /docker-entrypoint.d/
/docker-entrypoint.sh: Launching /docker-entrypoint.d/10-listen-on-ipv6-by-default.sh
10-listen-on-ipv6-by-default.sh: info: Getting the checksum of /etc/nginx/conf.d/default.conf
10-listen-on-ipv6-by-default.sh: info: /etc/nginx/conf.d/default.conf differs from the packaged version
/docker-entrypoint.sh: Sourcing /docker-entrypoint.d/15-local-resolvers.envsh
/docker-entrypoint.sh: Launching /docker-entrypoint.d/20-envsubst-on-templates.sh
/docker-entrypoint.sh: Launching /docker-entrypoint.d/30-tune-worker-processes.sh
/docker-entrypoint.sh: Configuration complete; ready for start up
2026/11/03 18:27:57 [notice] 1#1: using the "epoll" event method
2026/11/03 18:27:57 [notice] 1#1: nginx/1.31.8
2026/11/03 18:27:57 [notice] 1#1: built by gcc 15.2.0 (Alpine 15.2.0)
2026/11/03 18:27:57 [notice] 1#1: OS: Linux 6.8.0-1071-azure
2026/11/03 18:27:57 [notice] 1#1: getrlimit(RLIMIT_NOFILE): 1048576:1048576
2026/11/03 18:27:57 [notice] 1#1: start worker processes
2026/11/03 18:27:57 [notice] 1#1: start worker process 29
2026/11/03 18:27:57 [notice] 1#1: start worker process 30
2026/11/03 18:27:57 [notice] 1#1: start worker process 31
2026/11/03 18:27:57 [notice] 1#1: start worker process 32
2026/11/03 18:27:57 [notice] 1#1: start worker process 33
2026/11/03 18:27:57 [notice] 1#1: start worker process 34
2026/11/03 18:27:57 [notice] 1#1: start worker process 35
2026/11/03 18:27:57 [notice] 1#1: start worker process 36
192.168.9.1 - - [03/Nov/2026:18:28:09 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:28:12 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:28:19 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:28:27 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:28:29 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:28:39 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:28:42 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:28:49 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:28:57 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:28:59 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:29:09 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:29:12 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:29:19 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:29:27 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:29:29 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:29:39 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:29:42 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:29:49 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:29:57 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:29:59 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:30:09 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:30:12 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:30:19 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:30:27 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:30:29 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:30:39 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:30:42 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:30:49 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:30:57 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:30:59 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:31:09 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:31:12 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:31:19 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:31:27 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:31:29 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:31:39 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:31:42 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:31:49 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:31:57 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:31:59 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:32:09 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:32:12 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:32:19 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:32:27 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:32:29 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:32:39 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:32:42 +0000] "GET / HTTP/1.1" 200 575 "-" "kube-probe/1.35" "-"
