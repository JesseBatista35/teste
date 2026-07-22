1s
Run caixagithub/DevSecOps-Actions/.github/integrations/argocd/logs@main
Run echo "REPO_NAME=$(echo 'caixagithub/sisva-frontend-transacional' | cut -d'/' -f2)" >> $GITHUB_ENV
INPUT_IMAGE_TAG: '29949175368'
Run RESOURCE_TREE_URL="https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/sisva-frontend-transacional-des/resource-tree?appNamespace=openshift-gitops"
Fazendo requisição para: https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/sisva-frontend-transacional-des/resource-tree?appNamespace=openshift-gitops
Resource-tree obtido com sucesso
Filtrando pods e encontrando o mais recente...
Pod mais recente encontrado: sisva-frontend-transacional-des-7c7d589cd7-4bmkj
URL dos logs: https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/sisva-frontend-transacional-des/logs?appNamespace=openshift-gitops&container=sisva-frontend-transacional-des&namespace=sisva-frontend-transacional&follow=false&podName=sisva-frontend-transacional-des-7c7d589cd7-4bmkj&tailLines=1000&sinceSeconds=0
Logs obtidos com sucesso
Logs do pod sisva-frontend-transacional-des-7c7d589cd7-4bmkj:
================================================
Exibindo os Logs:
/docker-entrypoint.sh: /docker-entrypoint.d/ is not empty, will attempt to perform configuration
/docker-entrypoint.sh: Looking for shell scripts in /docker-entrypoint.d/
/docker-entrypoint.sh: Launching /docker-entrypoint.d/10-listen-on-ipv6-by-default.sh
10-listen-on-ipv6-by-default.sh: info: Getting the checksum of /etc/nginx/conf.d/default.conf
10-listen-on-ipv6-by-default.sh: info: /etc/nginx/conf.d/default.conf differs from the packaged version
/docker-entrypoint.sh: Sourcing /docker-entrypoint.d/15-local-resolvers.envsh
/docker-entrypoint.sh: Launching /docker-entrypoint.d/20-envsubst-on-templates.sh
/docker-entrypoint.sh: Launching /docker-entrypoint.d/30-tune-worker-processes.sh
/docker-entrypoint.sh: Configuration complete; ready for start up
2026/07/22 19:24:17 [notice] 1#1: using the "epoll" event method
2026/07/22 19:24:17 [notice] 1#1: nginx/1.31.3
2026/07/22 19:24:17 [notice] 1#1: built by gcc 15.2.0 (Alpine 15.2.0)
2026/07/22 19:24:17 [notice] 1#1: OS: Linux 6.8.0-1059-azure
2026/07/22 19:24:17 [notice] 1#1: getrlimit(RLIMIT_NOFILE): 1048576:1048576
2026/07/22 19:24:17 [notice] 1#1: start worker processes
2026/07/22 19:24:17 [notice] 1#1: start worker process 29
2026/07/22 19:24:17 [notice] 1#1: start worker process 30
2026/07/22 19:24:17 [notice] 1#1: start worker process 31
2026/07/22 19:24:17 [notice] 1#1: start worker process 32
10.245.171.68 - - [22/Jul/2026:19:24:29 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:24:30 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:24:34 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:24:44 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:24:45 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:24:49 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:24:59 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:25:00 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:25:01 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
192.168.2.1 - - [22/Jul/2026:19:25:04 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:25:14 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:25:15 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:25:16 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
192.168.2.1 - - [22/Jul/2026:19:25:19 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:25:29 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:25:30 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:25:31 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
192.168.2.1 - - [22/Jul/2026:19:25:34 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:25:44 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:25:45 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:25:46 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
192.168.2.1 - - [22/Jul/2026:19:25:49 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:25:59 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:26:00 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:26:01 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
192.168.2.1 - - [22/Jul/2026:19:26:04 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:26:14 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:26:15 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:26:16 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
192.168.2.1 - - [22/Jul/2026:19:26:19 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:26:29 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:26:30 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:26:31 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
192.168.2.1 - - [22/Jul/2026:19:26:34 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:26:44 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:26:45 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:26:46 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
192.168.2.1 - - [22/Jul/2026:19:26:49 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:26:59 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:27:00 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:27:01 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
192.168.2.1 - - [22/Jul/2026:19:27:04 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:27:14 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:27:15 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:27:16 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
192.168.2.1 - - [22/Jul/2026:19:27:19 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:27:29 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:27:30 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:27:31 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
192.168.2.1 - - [22/Jul/2026:19:27:34 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:27:44 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:27:45 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:27:46 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
192.168.2.1 - - [22/Jul/2026:19:27:49 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:27:59 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:28:00 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:28:01 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
192.168.2.1 - - [22/Jul/2026:19:28:04 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:28:14 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:28:15 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:28:16 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
192.168.2.1 - - [22/Jul/2026:19:28:19 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:28:29 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:28:30 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:28:31 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
192.168.2.1 - - [22/Jul/2026:19:28:34 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:28:44 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:28:45 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:28:46 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
192.168.2.1 - - [22/Jul/2026:19:28:49 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:28:59 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:29:00 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:29:01 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
192.168.2.1 - - [22/Jul/2026:19:29:04 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:29:14 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:29:15 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:29:16 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
192.168.2.1 - - [22/Jul/2026:19:29:19 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:29:29 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:29:30 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:29:31 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
192.168.2.1 - - [22/Jul/2026:19:29:34 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
================================================
Script executado com sucesso!
Pod utilizado: sisva-frontend-transacional-des-7c7d589cd7-4bmkj
Falha na sincronização
Error: Process completed with exit code 1.

pod 

/docker-entrypoint.sh: /docker-entrypoint.d/ is not empty, will attempt to perform configuration
/docker-entrypoint.sh: Looking for shell scripts in /docker-entrypoint.d/
/docker-entrypoint.sh: Launching /docker-entrypoint.d/10-listen-on-ipv6-by-default.sh
10-listen-on-ipv6-by-default.sh: info: Getting the checksum of /etc/nginx/conf.d/default.conf
10-listen-on-ipv6-by-default.sh: info: /etc/nginx/conf.d/default.conf differs from the packaged version
/docker-entrypoint.sh: Sourcing /docker-entrypoint.d/15-local-resolvers.envsh
/docker-entrypoint.sh: Launching /docker-entrypoint.d/20-envsubst-on-templates.sh
/docker-entrypoint.sh: Launching /docker-entrypoint.d/30-tune-worker-processes.sh
/docker-entrypoint.sh: Configuration complete; ready for start up
2026/07/22 19:24:17 [notice] 1#1: using the "epoll" event method
2026/07/22 19:24:17 [notice] 1#1: nginx/1.31.3
2026/07/22 19:24:17 [notice] 1#1: built by gcc 15.2.0 (Alpine 15.2.0)
2026/07/22 19:24:17 [notice] 1#1: OS: Linux 6.8.0-1059-azure
2026/07/22 19:24:17 [notice] 1#1: getrlimit(RLIMIT_NOFILE): 1048576:1048576
2026/07/22 19:24:17 [notice] 1#1: start worker processes
2026/07/22 19:24:17 [notice] 1#1: start worker process 29
2026/07/22 19:24:17 [notice] 1#1: start worker process 30
2026/07/22 19:24:17 [notice] 1#1: start worker process 31
2026/07/22 19:24:17 [notice] 1#1: start worker process 32
10.245.171.68 - - [22/Jul/2026:19:24:29 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:24:30 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:24:34 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:24:44 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:24:45 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:24:49 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:24:59 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:25:00 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:25:01 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
192.168.2.1 - - [22/Jul/2026:19:25:04 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:25:14 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:25:15 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:25:16 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
192.168.2.1 - - [22/Jul/2026:19:25:19 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:25:29 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:25:30 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:25:31 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
192.168.2.1 - - [22/Jul/2026:19:25:34 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:25:44 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:25:45 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:25:46 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
192.168.2.1 - - [22/Jul/2026:19:25:49 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:25:59 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:26:00 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:26:01 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
192.168.2.1 - - [22/Jul/2026:19:26:04 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:26:14 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:26:15 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:26:16 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
192.168.2.1 - - [22/Jul/2026:19:26:19 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:26:29 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:26:30 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:26:31 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
192.168.2.1 - - [22/Jul/2026:19:26:34 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:26:44 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:26:45 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:26:46 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
192.168.2.1 - - [22/Jul/2026:19:26:49 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:26:59 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:27:00 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:27:01 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
192.168.2.1 - - [22/Jul/2026:19:27:04 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:27:14 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:27:15 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:27:16 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
192.168.2.1 - - [22/Jul/2026:19:27:19 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:27:29 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:27:30 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:27:31 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
192.168.2.1 - - [22/Jul/2026:19:27:34 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:27:44 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:27:45 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:27:46 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
192.168.2.1 - - [22/Jul/2026:19:27:49 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:27:59 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:28:00 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:28:01 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
192.168.2.1 - - [22/Jul/2026:19:28:04 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:28:14 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:28:15 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:28:16 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
192.168.2.1 - - [22/Jul/2026:19:28:19 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:28:29 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:28:30 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:28:31 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
192.168.2.1 - - [22/Jul/2026:19:28:34 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:28:44 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:28:45 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:28:46 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
192.168.2.1 - - [22/Jul/2026:19:28:49 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:28:59 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:29:00 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:29:01 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
192.168.2.1 - - [22/Jul/2026:19:29:04 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:29:14 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:29:15 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:29:16 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
192.168.2.1 - - [22/Jul/2026:19:29:19 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:29:29 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:29:30 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:29:31 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
192.168.2.1 - - [22/Jul/2026:19:29:34 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:29:44 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:29:45 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:29:46 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
192.168.2.1 - - [22/Jul/2026:19:29:49 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:30:00 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:30:01 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:30:01 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
192.168.2.1 - - [22/Jul/2026:19:30:04 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:30:14 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:30:16 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:30:16 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
192.168.2.1 - - [22/Jul/2026:19:30:19 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:30:29 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:30:31 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:30:31 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
192.168.2.1 - - [22/Jul/2026:19:30:34 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"
10.245.171.68 - - [22/Jul/2026:19:30:45 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
10.245.171.70 - - [22/Jul/2026:19:30:46 +0000] "GET / HTTP/1.1" 200 553 "-" "-" "-"
192.168.2.1 - - [22/Jul/2026:19:30:46 +0000] "GET / HTTP/1.1" 200 553 "-" "kube-probe/1.35" "-"





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
0
Suspended
0
Healthy
8
Degraded
0
Missing
1
Unknown
0
NAMESPACES
NAMESPACES
Applications
 sisva-frontend-transacional-des
Application Details List
Log out
APP HEALTH 
 Healthy
SYNC STATUS 

 OutOfSync
from HEAD (532e5ac)
Auto sync is enabled.
Author:
ansible-connect-emu[bot] <230244411+ansible-connect-emu[bot]@users.noreply.github.com> -
Comment:
Merge pull request #5 from caixagithub/update-image-sisva-fronte
LAST SYNC 

 Syncing
Running a few seconds ago (Wed Jul 22 2026 16:31:10 GMT-0300)
one or more objects failed to apply, reason: namespaces "aks-istio-ingress" not found due to application controller sync timeout. Retrying attempt #3 at 7:31PM.
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
sisva-frontend-transacional-des-7c7d589cd7-4bmkj
Pod
-
sisva-frontend-transacional
7 minutes ago   07/22/26
 Healthy  
ReplicaSet
rs
sisva-frontend-transacional-des-7c7d589cd7
apps/ReplicaSet
-
sisva-frontend-transacional
7 minutes ago   07/22/26
 Healthy  
ReplicaSet
rs
sisva-frontend-transacional-des-5d6f4c69d8
apps/ReplicaSet
-
sisva-frontend-transacional
21 minutes ago   07/22/26
 Healthy  
ConfigMap
cm
cm-sisva-frontend-transacional
ConfigMap
-
sisva-frontend-transacional
a day ago   07/21/26
 Synced
Endpoints
ep
sisva-frontend-transacional-des
Endpoints
-
sisva-frontend-transacional
a day ago   07/21/26
Secret
secret
akv2k8s-sisva-frontend-transacional-des
Secret
-
sisva-frontend-transacional
a day ago   07/21/26
Service
svc
sisva-frontend-transacional-des
Service
-
sisva-frontend-transacional
a day ago   07/21/26
 Healthy   Synced
Deployment
deploy
sisva-frontend-transacional-des
apps/Deployment
-
sisva-frontend-transacional
a day ago   07/21/26
 Healthy   Synced
ReplicaSet
rs
sisva-frontend-transacional-des-d565dc848
apps/ReplicaSet
-
sisva-frontend-transacional
a day ago   07/21/26
 Healthy  
EndpointSlice
endpointslice
sisva-frontend-transacional-des-72zr5
discovery.k8s.io/EndpointSlice
-
sisva-frontend-transacional
a day ago   07/21/26
Previous12Next
Items per page: 10 

Podpod
sisva-frontend-transacional-des-7c7d589cd7-4bmkj
 SUMMARY EVENTS LOGS
REASON
MESSAGE
COUNT
FIRST OCCURRED
LAST OCCURRED
Pulled
Successfully pulled image "acrcentralcaixanprd.azurecr.io/sisva/frontend-transacional/sisva-frontend-transacional:29949175368" in 1.31s (1.31s including waiting). Image size: 30032722 bytes.
1
6m ago
Today at 4:24 PM
6m ago
Today at 4:24 PM
Created
Container created
1
6m ago
Today at 4:24 PM
6m ago
Today at 4:24 PM
Started
Container started
1
6m ago
Today at 4:24 PM
6m ago
Today at 4:24 PM
Pulling
Pulling image "acrcentralcaixanprd.azurecr.io/sisva/frontend-transacional/sisva-frontend-transacional:29949175368"
1
6m ago
Today at 4:24 PM
6m ago
Today at 4:24 PM
Scheduled
Successfully assigned sisva-frontend-transacional/sisva-frontend-transacional-des-7c7d589cd7-4bmkj to aks-workloads-11139419-vmss0000fj
6m ago
Today at 4:24 PM
6m ago
Today at 4:24 PM
FailedScheduling
0/2 nodes are available: 1 Insufficient cpu, 1 node(s) had untolerated taint(s). no new claims to deallocate, preemption: 0/2 nodes are available: 1 No preemption victims found for incoming pod, 1 Preemption is not helpful for scheduling.
6m ago
Today at 4:24 PM
6m ago
Today at 4:24 PM

