
-sh-4.2$
-sh-4.2$ oc project sisns-tqs oc get pods | grep -i backend
]error: Only one argument is supported (project name or context name).
-sh-4.2$ oc project sisns-tqs oc get pods | grep -i backend
error: Only one argument is supported (project name or context name).
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc sisns-backend -o yaml | grep -A 15 volumeMounts oc get dc sisns-backend -o yaml | grep -A 10 "nfs|SISNS_TQS_FGW"
grep: oc: Arquivo ou diretório não encontrado
grep: get: Arquivo ou diretório não encontrado
grep: dc: Arquivo ou diretório não encontrado
grep: sisns-backend: Arquivo ou diretório não encontrado
grep: yaml: Arquivo ou diretório não encontrado
Error from server (NotFound): deploymentconfigs.apps.openshift.io "sisns-backend" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pv | grep -i sisns oc get pvc -n sisns-tqs oc describe pvc -n sisns-tqs
grep: oc: Arquivo ou diretório não encontrado
grep: get: Arquivo ou diretório não encontrado
grep: pvc: Arquivo ou diretório não encontrado
grep: sisns-tqs: Arquivo ou diretório não encontrado
grep: oc: Arquivo ou diretório não encontrado
grep: describe: Arquivo ou diretório não encontrado
grep: pvc: Arquivo ou diretório não encontrado
grep: sisns-tqs: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -it -n sisns-tqs -- df -h | grep -i SISNS oc exec -it -n sisns-tqs -- ls -la /opt/SISNS/SIB2B/GECIN/DOWNLOAD
grep: invalid option -- 't'
Uso: grep [OPÇÃO]... PADRÃO [ARQUIVO]...
Experimente "grep --help" para mais informações.
error: expected 'exec POD_NAME COMMAND [ARG1] [ARG2] ... [ARGN]'.
POD_NAME and COMMAND are required arguments for the exec command
See 'oc exec -h' for help and examples.
-sh-4.2$
