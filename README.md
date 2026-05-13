
p585600@10.122.155.62's password:
Last login: Wed May 13 17:36:59 2026 from 10.122.150.31
-sh-4.2$ oc login --token=sha256~CiusgyUCRrIrl2d_cM-nDw-Qk2nSzju9bTOgB8AIgfI --server=https://api.nprd.caixa:6443
Logged into "https://api.nprd.caixa:6443" as "p585600@corp.caixa.gov.br" using the token provided.

You have access to 944 projects, the list has been suppressed. You can list all projects with 'oc projects'

Using project "sitop-des".
-sh-4.2$ oc get pods
NAME                          READY     STATUS             RESTARTS       AGE
sitop-backend-des-13-deploy   0/1       Completed          0              8d
sitop-backend-des-14-deploy   0/1       Completed          0              4h21m
sitop-backend-des-14-dzqdl    1/1       Running            0              4h21m
sitop-frontend-des-5-deploy   0/1       Completed          0              120m
sitop-frontend-des-5-mzzkd    0/2       CrashLoopBackOff   56 (89s ago)   119m
-sh-4.2$ oc get pod sitop-frontend-des-5-mzzkd -o jsonpath='{.spec.containers[*].name}{"\n"}'
sitop-frontend-des sitop-frontend-des-exporter
-sh-4.2$ oc logs sitop-frontend-des-5-mzzkd -c NOME_REAL_DO_CONTAINER --previous --tail=200 7. Entrar no container oc exec -it sitop-frontend-des-5-mzzkd -c NOME_REAL_DO_CONTAINER -- shNOME_REAL_DO_CONTAINER^C
-sh-4.2$ oc logs sitop-frontend-des-5-mzzkd -c NOME_REAL_DO_CONTAINER --previous --tail=200 7. Entrar no container oc exec -it sitop-frontend-des-5-mzzkd -c NOME_REAL_DO_CONTAINER -- sh
Error: unknown shorthand flag: 'i' in -it


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

-sh-4.2$ pwd ls -la / find / -name ".js" 2>/dev/null | head -100 find / -name "main.js" 2>/dev/null | head -50
-sh-4.2$

