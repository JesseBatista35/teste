[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# grep -o "status code[^<]*\|Error Executing[^<]*" $(ls -t /opt/ctmage/ctm/cm/AI/CustomerLogs/*.xml | head -1) | sort -u
[root@caddeapllx2695 tmp]#



Environment information:
+-------------------------+--------------------------------------------------+
|Connection Profile Name  |IIFX                                              |
+-------------------------+--------------------------------------------------+
|Connection Profile Scope |Centralized                                       |
+-------------------------+--------------------------------------------------+
 
 
=============================================
Operation: Execute
Step name: 'Proxy'
=============================================
 
Command line: 
-------------
export no_proxy="$no_proxy,sicsn.caixa,sicsn.gerencia.caixa"
echo $no_proxy
 
 
Exit code is: 0
 
=============================================
Operation: Execute
Step name: 'Gerar token'
=============================================
REST service details: 
--------------------
 
[Extracted runtime parameter: 'SESSIONID' ==> '******'] 
[Extracted runtime parameter: 'TOKEN' ==> '******']
 
=============================================
Operation: Execute
Step name: 'Login no Beyond Trust'
=============================================
REST service details: 
--------------------
 
 
=============================================
Operation: Execute
Step name: 'Obter credencial'
=============================================
REST service details: 
--------------------
 
 
=============================================
Operation: Execute
Step name: 'Logout no Beyond Trust'
=============================================
REST service details: 
--------------------
 
 
=============================================
Operation: Execute
Step name: 'Executar job'
=============================================
 
Command line: 
-------------
#!/bin/bash -x
 
# Gera um id aleatorio para compor o filename no output do script
export ID=$(mktemp -u XXXXX)
#export ARQ_OUTPUT=/tmp/IIFX_${ID}.txt
 
export VARIAVEL_DO_SISTEMA="$(echo '' | base64 | tr -d '\n')"
 
/producao/executa-job.sh
 
Output:
-------
 
/bin/bash: which: linha 1: erro de sintaxe: fim prematuro do arquivo
/bin/bash: erro ao importar a definiÃ§Ã£o da funÃ§Ã£o para `which'
/bin/bash: which: linha 1: erro de sintaxe: fim prematuro do arquivo
/bin/bash: erro ao importar a definiÃ§Ã£o da funÃ§Ã£o para `which'
bash: which: linha 1: erro de sintaxe: fim prematuro do arquivo
bash: erro ao importar a definiÃ§Ã£o da funÃ§Ã£o para `which'
/producao/env_config.sh: linha 14: !VAR: variÃ¡vel nÃ£o associada
 
 
Exit code is: 1
 
 
Job failure message:
-------------------
Application Integrator plugin: UCM0001 = Application Integrator plugin: UCM0001 = REST request failed. status code: 401 response is\
: Unauthorized message: "User not authenticated"
 
 
Job statistics:
+-------------------------+-------------------------+
|Start Time               |20261006165545           |
+-------------------------+-------------------------+
|End Time                 |20261006165547           |
+-------------------------+-------------------------+
|Elapsed Time             |242                      |
+-------------------------+-------------------------+
Exit Code    = 1
Exit Message = Application Integrator plugin: UCM0001 = Application Integrator plugin: UCM0001 = REST request failed. status code: \
401 response is: Unauthorized message:  User not authenticated
