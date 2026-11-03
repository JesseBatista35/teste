/docker-entrypoint.sh: /docker-entrypoint.d/ is not empty, will attempt to perform configuration
/docker-entrypoint.sh: Looking for shell scripts in /docker-entrypoint.d/
/docker-entrypoint.sh: Launching /docker-entrypoint.d/10-listen-on-ipv6-by-default.sh
10-listen-on-ipv6-by-default.sh: info: Getting the checksum of /etc/nginx/conf.d/default.conf
10-listen-on-ipv6-by-default.sh: info: /etc/nginx/conf.d/default.conf differs from the packaged version
/docker-entrypoint.sh: Sourcing /docker-entrypoint.d/15-local-resolvers.envsh
/docker-entrypoint.sh: Launching /docker-entrypoint.d/20-envsubst-on-templates.sh
/docker-entrypoint.sh: Launching /docker-entrypoint.d/30-tune-worker-processes.sh
/docker-entrypoint.sh: Configuration complete; ready for start up
2026/11/03 18:18:21 [notice] 1#1: using the "epoll" event method
2026/11/03 18:18:21 [notice] 1#1: nginx/1.31.8
2026/11/03 18:18:21 [notice] 1#1: built by gcc 15.2.0 (Alpine 15.2.0)
2026/11/03 18:18:21 [notice] 1#1: OS: Linux 6.8.0-1071-azure
2026/11/03 18:18:21 [notice] 1#1: getrlimit(RLIMIT_NOFILE): 1048576:1048576
2026/11/03 18:18:21 [notice] 1#1: start worker processes
2026/11/03 18:18:21 [notice] 1#1: start worker process 29
2026/11/03 18:18:21 [notice] 1#1: start worker process 30
2026/11/03 18:18:21 [notice] 1#1: start worker process 31
2026/11/03 18:18:21 [notice] 1#1: start worker process 32
2026/11/03 18:18:21 [notice] 1#1: start worker process 33
2026/11/03 18:18:21 [notice] 1#1: start worker process 34
2026/11/03 18:18:21 [notice] 1#1: start worker process 35
2026/11/03 18:18:21 [notice] 1#1: start worker process 36
2026/11/03 18:18:38 [error] 29#29: *1 open() "/usr/share/nginx/html/q/health/live" failed (2: No such file or directory), client: 192.168.9.1, server: localhost, request: "GET /q/health/live HTTP/1.1", host: "192.168.9.31:8080"
192.168.9.1 - - [03/Nov/2026:18:18:38 +0000] "GET /q/health/live HTTP/1.1" 404 153 "-" "kube-probe/1.35" "-"
2026/11/03 18:18:51 [error] 30#30: *2 open() "/usr/share/nginx/html/q/health/live" failed (2: No such file or directory), client: 192.168.9.1, server: localhost, request: "GET /q/health/live HTTP/1.1", host: "192.168.9.31:8080"
192.168.9.1 - - [03/Nov/2026:18:18:51 +0000] "GET /q/health/live HTTP/1.1" 404 153 "-" "kube-probe/1.35" "-"
2026/11/03 18:18:53 [error] 31#31: *3 open() "/usr/share/nginx/html/q/health/live" failed (2: No such file or directory), client: 192.168.9.1, server: localhost, request: "GET /q/health/live HTTP/1.1", host: "192.168.9.31:8080"
192.168.9.1 - - [03/Nov/2026:18:18:53 +0000] "GET /q/health/live HTTP/1.1" 404 153 "-" "kube-probe/1.35" "-"
2026/11/03 18:19:06 [error] 32#32: *4 open() "/usr/share/nginx/html/q/health/live" failed (2: No such file or directory), client: 192.168.9.1, server: localhost, request: "GET /q/health/live HTTP/1.1", host: "192.168.9.31:8080"
192.168.9.1 - - [03/Nov/2026:18:19:06 +0000] "GET /q/health/live HTTP/1.1" 404 153 "-" "kube-probe/1.35" "-"
2026/11/03 18:19:08 [error] 33#33: *5 open() "/usr/share/nginx/html/q/health/live" failed (2: No such file or directory), client: 192.168.9.1, server: localhost, request: "GET /q/health/live HTTP/1.1", host: "192.168.9.31:8080"
192.168.9.1 - - [03/Nov/2026:18:19:08 +0000] "GET /q/health/live HTTP/1.1" 404 153 "-" "kube-probe/1.35" "-"
192.168.9.1 - - [03/Nov/2026:18:19:21 +0000] "GET /q/health/live HTTP/1.1" 404 153 "-" "kube-probe/1.35" "-"
2026/11/03 18:19:21 [error] 34#34: *6 open() "/usr/share/nginx/html/q/health/live" failed (2: No such file or directory), client: 192.168.9.1, server: localhost, request: "GET /q/health/live HTTP/1.1", host: "192.168.9.31:8080"
2026/11/03 18:19:23 [error] 35#35: *7 open() "/usr/share/nginx/html/q/health/live" failed (2: No such file or directory), client: 192.168.9.1, server: localhost, request: "GET /q/health/live HTTP/1.1", host: "192.168.9.31:8080"
192.168.9.1 - - [03/Nov/2026:18:19:23 +0000] "GET /q/health/live HTTP/1.1" 404 153 "-" "kube-probe/1.35" "-"
