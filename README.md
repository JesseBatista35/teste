
You have access to 103 projects, the list has been suppressed. You can list all projects with 'oc projects'

Using project "default".
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get nodes -o wide
NAME                              STATUS    ROLES                  AGE       VERSION    INTERNAL-IP      EXTERNAL-IP      OS-IMAGE                                                KERNEL-VERSION                  CONTAINER-RUNTIME
nctvmrh001-scgft-infra-2dkq5      Ready     infra                  98d       v1.33.12   10.190.160.30    10.190.160.30    Red Hat Enterprise Linux CoreOS 9.6.20260623-0 (Plow)   5.14.0-570.124.1.el9_6.x86_64   cri-o://1.33.12-3.rhaos4.20.git64c6a00.el9
nctvmrh001-scgft-infra-5s2vl      Ready     infra                  98d       v1.33.12   10.190.160.29    10.190.160.29    Red Hat Enterprise Linux CoreOS 9.6.20260623-0 (Plow)   5.14.0-570.124.1.el9_6.x86_64   cri-o://1.33.12-3.rhaos4.20.git64c6a00.el9
nctvmrh001-scgft-infra-gmkfq      Ready     infra                  98d       v1.33.12   10.190.160.31    10.190.160.31    Red Hat Enterprise Linux CoreOS 9.6.20260623-0 (Plow)   5.14.0-570.124.1.el9_6.x86_64   cri-o://1.33.12-3.rhaos4.20.git64c6a00.el9
nctvmrh001-scgft-logging-6js76    Ready     infra,logging          39d       v1.33.12   10.190.160.185   10.190.160.185   Red Hat Enterprise Linux CoreOS 9.6.20260623-0 (Plow)   5.14.0-570.124.1.el9_6.x86_64   cri-o://1.33.12-3.rhaos4.20.git64c6a00.el9
nctvmrh001-scgft-logging-f9rjd    Ready     infra,logging          39d       v1.33.12   10.190.160.55    10.190.160.55    Red Hat Enterprise Linux CoreOS 9.6.20260623-0 (Plow)   5.14.0-570.124.1.el9_6.x86_64   cri-o://1.33.12-3.rhaos4.20.git64c6a00.el9
nctvmrh001-scgft-logging-xk9fq    Ready     infra,logging          39d       v1.33.12   10.190.160.97    10.190.160.97    Red Hat Enterprise Linux CoreOS 9.6.20260623-0 (Plow)   5.14.0-570.124.1.el9_6.x86_64   cri-o://1.33.12-3.rhaos4.20.git64c6a00.el9
nctvmrh001-scgft-master-0         Ready     control-plane,master   98d       v1.33.12   10.190.160.23    10.190.160.23    Red Hat Enterprise Linux CoreOS 9.6.20260623-0 (Plow)   5.14.0-570.124.1.el9_6.x86_64   cri-o://1.33.12-3.rhaos4.20.git64c6a00.el9
nctvmrh001-scgft-master-1         Ready     control-plane,master   98d       v1.33.12   10.190.160.22    10.190.160.22    Red Hat Enterprise Linux CoreOS 9.6.20260623-0 (Plow)   5.14.0-570.124.1.el9_6.x86_64   cri-o://1.33.12-3.rhaos4.20.git64c6a00.el9
nctvmrh001-scgft-master-2         Ready     control-plane,master   98d       v1.33.12   10.190.160.24    10.190.160.24    Red Hat Enterprise Linux CoreOS 9.6.20260623-0 (Plow)   5.14.0-570.124.1.el9_6.x86_64   cri-o://1.33.12-3.rhaos4.20.git64c6a00.el9
nctvmrh001-scgft-storage-6hpsx    Ready     infra,storage          95d       v1.33.12   10.190.160.45    10.190.160.45    Red Hat Enterprise Linux CoreOS 9.6.20260623-0 (Plow)   5.14.0-570.124.1.el9_6.x86_64   cri-o://1.33.12-3.rhaos4.20.git64c6a00.el9
nctvmrh001-scgft-storage-g667s    Ready     infra,storage          95d       v1.33.12   10.190.160.46    10.190.160.46    Red Hat Enterprise Linux CoreOS 9.6.20260623-0 (Plow)   5.14.0-570.124.1.el9_6.x86_64   cri-o://1.33.12-3.rhaos4.20.git64c6a00.el9
nctvmrh001-scgft-storage-wqlc5    Ready     infra,storage          95d       v1.33.12   10.190.160.47    10.190.160.47    Red Hat Enterprise Linux CoreOS 9.6.20260623-0 (Plow)   5.14.0-570.124.1.el9_6.x86_64   cri-o://1.33.12-3.rhaos4.20.git64c6a00.el9
nctvmrh001-scgft-worker-0-5k79t   Ready     worker                 98d       v1.33.12   10.190.160.26    10.190.160.26    Red Hat Enterprise Linux CoreOS 9.6.20260623-0 (Plow)   5.14.0-570.124.1.el9_6.x86_64   cri-o://1.33.12-3.rhaos4.20.git64c6a00.el9
nctvmrh001-scgft-worker-0-7lwkw   Ready     worker                 98d       v1.33.12   10.190.160.36    10.190.160.36    Red Hat Enterprise Linux CoreOS 9.6.20260623-0 (Plow)   5.14.0-570.124.1.el9_6.x86_64   cri-o://1.33.12-3.rhaos4.20.git64c6a00.el9
nctvmrh001-scgft-worker-0-bg5hq   Ready     worker                 98d       v1.33.12   10.190.160.37    10.190.160.37    Red Hat Enterprise Linux CoreOS 9.6.20260623-0 (Plow)   5.14.0-570.124.1.el9_6.x86_64   cri-o://1.33.12-3.rhaos4.20.git64c6a00.el9
nctvmrh001-scgft-worker-0-cs2xc   Ready     worker                 98d       v1.33.12   10.190.160.28    10.190.160.28    Red Hat Enterprise Linux CoreOS 9.6.20260623-0 (Plow)   5.14.0-570.124.1.el9_6.x86_64   cri-o://1.33.12-3.rhaos4.20.git64c6a00.el9
nctvmrh001-scgft-worker-0-txtg5   Ready     worker                 98d       v1.33.12   10.190.160.35    10.190.160.35    Red Hat Enterprise Linux CoreOS 9.6.20260623-0 (Plow)   5.14.0-570.124.1.el9_6.x86_64   cri-o://1.33.12-3.rhaos4.20.git64c6a00.el9
nctvmrh001-scgft-worker-0-x4nk9   Ready     worker                 98d       v1.33.12   10.190.160.27    10.190.160.27    Red Hat Enterprise Linux CoreOS 9.6.20260623-0 (Plow)   5.14.0-570.124.1.el9_6.x86_64   cri-o://1.33.12-3.rhaos4.20.git64c6a00.el9
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get egressip
NAME                EGRESSIPS        ASSIGNED NODE                     ASSIGNED EGRESSIPS
sample-des-egress   10.190.160.202   nctvmrh001-scgft-worker-0-cs2xc   10.190.160.202
sample-hmp-egress   10.190.160.204   nctvmrh001-scgft-worker-0-txtg5   10.190.160.204
sample-tqs-egress   10.190.160.203   nctvmrh001-scgft-worker-0-5k79t   10.190.160.203
silce-des-egress    10.190.160.205   nctvmrh001-scgft-worker-0-x4nk9   10.190.160.205
silce-hmp-egress    10.190.160.207   nctvmrh001-scgft-worker-0-7lwkw   10.190.160.207
silce-tqs-egress    10.190.160.206   nctvmrh001-scgft-worker-0-cs2xc   10.190.160.206
sispl-des-egress    10.190.160.208   nctvmrh001-scgft-worker-0-txtg5   10.190.160.208
sispl-hmp-egress    10.190.160.210   nctvmrh001-scgft-worker-0-5k79t   10.190.160.210
sispl-tqs-egress    10.190.160.209   nctvmrh001-scgft-worker-0-x4nk9   10.190.160.209
-sh-4.2$ oc get namespace sispl-des -o yaml | grep -i egress
-sh-4.2$ oc run nettest -n sispl-des --rm -it --image=<imagem-ubi-do-registry> -- bash
-sh: imagem-ubi-do-registry: Arquivo ou diretório não encontrado
-sh-4.2$ oc run nettest -n sispl-des --rm -it --image=<imagem-ubi-do-registry> -- bash
-sh: imagem-ubi-do-registry: Arquivo ou diretório não encontrado
-sh-4.2$   getent hosts sicsn.caixa
10.221.142.2    sicsn.gslb.caixa sicsn.caixa
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$  curl -v --connect-timeout 10 https://sicsn.caixa/BeyondTrust/api/public/v3/Auth/connect/token
* About to connect() to sicsn.caixa port 443 (#0)
*   Trying 10.221.142.2...
* Connected to sicsn.caixa (10.221.142.2) port 443 (#0)
* Initializing NSS with certpath: sql:/etc/pki/nssdb
*   CAfile: /etc/pki/tls/certs/ca-bundle.crt
  CApath: none
* NSS: client certificate not found (nickname not specified)
* SSL connection using TLS_RSA_WITH_AES_256_CBC_SHA
* Server certificate:
*       subject: CN=sicsn.caixa,O=Caixa Economica Federal,C=BR
*       start date: Jun 28 22:42:38 2025 GMT
*       expire date: Jun 27 22:42:38 2030 GMT
*       common name: sicsn.caixa
*       issuer: CN=AC Interna APL,O=Caixa Economica Federal,C=BR
> GET /BeyondTrust/api/public/v3/Auth/connect/token HTTP/1.1
> User-Agent: curl/7.29.0
> Host: sicsn.caixa
> Accept: */*
>
< HTTP/1.1 405 Method Not Allowed
< Cache-Control: no-cache
< Pragma: no-cache
< Allow: POST
< Content-Type: application/json; charset=utf-8
< Expires: -1
< Server:
< Set-Cookie: ASP.NET_SessionId=w5ibjbf2jbpemabjuaev0oav; path=/; secure; HttpOnly; SameSite=Lax
< X-Content-Type-Options: nosniff
< Content-Security-Policy: default-src 'unsafe-inline' 'unsafe-eval' *; frame-src 'self' blob: https data: https; img-src 'self' data: https:; font-src 'self' data:; connect-src 'self' data: https:; worker-src blob:; child-src blob:
< X-Frame-Options: SAMEORIGIN
< Strict-Transport-Security: max-age=31536000; includeSubDomains
< X-Permitted-Cross-Domain-Policies: none
< Referrer-Policy: strict-origin-when-cross-origin
< Cross-Origin-Embedder-Policy: require-corp
< Cross-Origin-Opener-Policy: same-origin
< Cross-Origin-Resource-Policy: same-origin
< x-xss-protection: 0
< Date: Wed, 30 Sep 2026 12:20:18 GMT
< Content-Length: 72
<
* Connection #0 to host sicsn.caixa left intact
{"Message":"The requested resource does not support http method 'GET'."}-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc describe pod "$last_pod" -n sispl-des | tail -n 30
error: resource name may not be empty
-sh-4.2$ oc logs "$last_pod" -n sispl-des --all-containers --prefix || true
Error: unknown flag: --prefix


Aliases:
logs, log

Usage:
  oc logs [-f] [-p] (POD | TYPE/NAME) [-c CONTAINER] [flags]

Examples:
  # Start streaming the logs of the most recent build of the openldap build config.
  oc logs -f bc/openldap

  # Start streaming the logs of the latest deployment of the mysql deployment config.
  oc logs -f dc/mysql

  # Get the logs of the first deployment for the mysql deployment config. Note that logs
  # from older deployments may not exist either because the deployment was successful
  # or due to deployment pruning or manual deletion of the deployment.
  oc logs --version=1 dc/mysql

  # Return a snapshot of ruby-container logs from pod backend.
  oc logs backend -c ruby-container

  # Start streaming of ruby-container logs from pod backend.
  oc logs -f pod/backend -c ruby-container

Options:
      --all-containers=false: Get all containers's logs in the pod(s).
  -c, --container='': Print the logs of this container
  -f, --follow=false: Specify if the logs should be streamed.
      --limit-bytes=0: Maximum bytes of logs to return. Defaults to no limit.
      --pod-running-timeout=20s: The length of time (like 5s, 2m, or 3h, higher than zero) to wait until at least one pod is running
  -p, --previous=false: If true, print the logs for the previous instance of the container in a pod if it exists.
  -l, --selector='': Selector (label query) to filter on.
      --since=0s: Only return logs newer than a relative duration like 5s, 2m, or 3h. Defaults to all logs. Only one of since-time / since may be used.
      --since-time='': Only return logs after a specific date (RFC3339). Defaults to all logs. Only one of since-time / since may be used.
      --tail=-1: Lines of recent log file to display. Defaults to -1 with no selector, showing all log lines otherwise 10, if a selector is provided.
      --timestamps=false: Include timestamps on each line in the log output
      --version=0: View the logs of a particular build or deployment by version if greater than zero

Use "oc options" for a list of global command-line options (applies to all commands).

-sh-4.2$
-sh-4.2$
-sh-4.2$
