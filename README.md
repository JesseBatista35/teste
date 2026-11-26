ORIGEM:
10.116.223.11
 
DESTINO:
cnpexdadvm01-scan4.extra.caixa.gov.br port=1521
sicns.caixa porta 443
 
 
 
 
 
 
REQ000147185286
	Por favor, verificar e ajustar
 
Repositório: SISPI-api-tarifacao
 
Erro  para gerar pipeline (Build)
 
Erro no passo: Login Cluster
 
Link da pipeline (Build)
https://devops.caixa/projetos/Caixa/_build/results?buildId=889716&view=logs&j=275f1d19-1bd8-5591-b06b-07d489ea915a&t=c02c59fe-b179-526b-4b13-fb4141c1ec4e
 
Impacto: migração para o GIT HUB
 
Emilio Luiz Ribeiro
 
estamos nessa sala
 
Joao, consegue dar uma força aqui, o SPX está fora em DES
 
 
 
sh-4.4$ curl -v telnet://sicsn.caixa

* Rebuilt URL to: telnet://sicsn.caixa/

*   Trying 10.221.142.2...

* TCP_NODELAY set

* Connected to sicsn.caixa (10.221.142.2) port 23 (#0)
 
sh-4.4$ curl -kv https://sicsn.caixa

* Rebuilt URL to: https://sicsn.caixa/

*   Trying 10.221.142.2...

* TCP_NODELAY set

* Connected to sicsn.caixa (10.221.142.2) port 443 (#0)

* ALPN, offering h2

* ALPN, offering http/1.1

* successfully set certificate verify locations:

*   CAfile: /etc/pki/tls/certs/ca-bundle.crt

  CApath: none

* TLSv1.3 (OUT), TLS handshake, Client hello (1):

* OpenSSL SSL_connect: SSL_ERROR_SYSCALL in connection to sicsn.caixa:443 

* Closing connection 0

curl: (35) OpenSSL SSL_connect: SSL_ERROR_SYSCALL in connection to sicsn.caixa:443 

sh-4.4$
 
2026-11-25T20:02:23.8565709Z O IP de Saída do projeto: sispx-des já estava configurado com o IP: 10.116.223.11
 
sh-4.4$ curl -v telnet://sicsn.caixa

* Rebuilt URL to: telnet://sicsn.caixa/

*   Trying 10.221.142.2...

* TCP_NODELAY set

* Connected to sicsn.caixa (10.221.142.2) port 23 (#0)

^C

sh-4.4$
 
 
 
10.116.208.0 255.255.240.0 /20
 
host range	10.116.208.1-10.116.223.254
 
 
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
connection options=[host=cnpexdadvm01-scan4.extra.caixa.gov.br port=1521 protocol=TCP service_name=CDBD08NGPDB017 addr=(ADDRESS=(PROTOCOL=TCP)(HOST=cnpexdadvm01-scan4.extra.caixa.gov.br)(PORT=1521)) conn_data=(DESCRIPTION=(ADDRESS=(PROTOCOL=TCP)(PORT=1521)(HOST=240.240.180.182)(HOSTNAME=cnpexdadvm01-scan4.extra.caixa.gov.br))(CONNECT_DATA=(CID=(PROGRAM=QuarkusEntryPoint)(HOST=sispx-pix-gestao-des-391-ld6h8)(USER=1001))(SERVICE_NAME=CDBD08NGPDB017))) done=true]
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-11-25 18:09:37,367 INFO [ora.jdbc] (agroal-21) traceId=7A5C3AB2, anoEnabled=true.
2026-11-25 18:09:37,368 FINEST [ora.jdbc] (agroal-21) 74 bytes written to the Socket.
2026-11-25 18:09:37,369 FINEST [ora.jdbc] (agroal-21) 294 bytes written to the Socket.
2026-11-25 18:09:42,350 INFO [ora.jdbc] (agroal-21) Connection establishment interrupted externally, exiting.
2026-11-25 18:09:42,351 INFO [ora.jdbc] (agroal-21) throwing: java.sql.SQLRecoverableException: ORA-17002: I/O error: Socket read interrupted, Authentication lapse 0 ms.
 
só reforçando, rodei um rotina aqui agora do spx e se conectou com o banco normalmente, então não é o banco  
 
Ontem 19:05 Reunião encerrada: 4h 17min 12s 

 
Alguma resposta?
 
Tentei aqui e continua com erro
 
Continua com o mesmo problema
 
bom dia pessoal. precisamos do ambiente funcionando hoje.
 
se puderem nos ajudar
 
09:01 Reunião encerrada: 4s 

 
Daniel Correa Paula.

2026-11-26T11:49:49.4283603Z ##[section]Starting: Verificando Status do Deployment
2026-11-26T11:49:49.4286756Z ==============================================================================
2026-11-26T11:49:49.4286834Z Task         : Bash
2026-11-26T11:49:49.4286876Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-26T11:49:49.4286949Z Version      : 3.227.0
2026-11-26T11:49:49.4286992Z Author       : Microsoft Corporation
2026-11-26T11:49:49.4287041Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-26T11:49:49.4287121Z ==============================================================================
2026-11-26T11:49:50.5517340Z Generating script.
2026-11-26T11:49:50.5554595Z ========================== Starting Command Output ===========================
2026-11-26T11:49:50.5558247Z [command]/bin/bash /opt/ads-agent/_work/_temp/20fcd7f0-a70e-44e5-bf06-3ef12e23a000.sh
2026-11-26T11:49:50.7862426Z Waiting for rollout to finish: 1 old replicas are pending termination...
2026-11-26T11:54:50.7869450Z E1126 08:54:50.786096   61987 streamwatcher.go:109] Unable to decode an event from the watch stream: net/http: request canceled (Client.Timeout exceeded while reading body)
2026-11-26T11:54:50.7870042Z error: watch closed before Until timeout
2026-11-26T11:54:50.7916111Z A aplicação não foi iniciada com sucesso!
2026-11-26T11:54:50.7917808Z Os logs da aplicação estão disponíveis na próxima task: Logs da Aplicação
2026-11-26T11:54:50.7940796Z ##[error]Bash exited with code '1'.
2026-11-26T11:54:50.7969192Z ##[section]Finishing: Verificando Status do Deployment




2026-11-26T11:54:50.7992017Z ##[section]Starting: Logs da Aplicação
2026-11-26T11:54:50.7995187Z ==============================================================================
2026-11-26T11:54:50.7995324Z Task         : Bash
2026-11-26T11:54:50.7995366Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-26T11:54:50.7995439Z Version      : 3.227.0
2026-11-26T11:54:50.7995481Z Author       : Microsoft Corporation
2026-11-26T11:54:50.7995530Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-26T11:54:50.7995610Z ==============================================================================
2026-11-26T11:54:51.6663004Z Generating script.
2026-11-26T11:54:51.6673833Z ========================== Starting Command Output ===========================
2026-11-26T11:54:51.6680329Z [command]/bin/bash /opt/ads-agent/_work/_temp/de6f944b-ddf4-49aa-b3f5-5e2c925e0801.sh
2026-11-26T11:54:51.6728336Z + shopt -s expand_aliases
2026-11-26T11:54:51.6728494Z + [[ -n ocp_nprd ]]
2026-11-26T11:54:51.6728660Z + [[ ocp_nprd =~ ocp ]]
2026-11-26T11:54:51.6729816Z + app=sispx-pix-gestao-des
2026-11-26T11:54:51.6729981Z + arquivo=/usr/local/bin/oc-v4.13
2026-11-26T11:54:51.6731174Z + '[' -e /usr/local/bin/oc-v4.13 ']'
2026-11-26T11:54:51.6731942Z + alias oc=/usr/local/bin/oc-v4.13
2026-11-26T11:54:51.6732160Z + /usr/local/bin/oc-v4.13 version
2026-11-26T11:54:51.7784294Z Client Version: 4.13.0-202307282024.p0.ge251b5e.assembly.stream-e251b5e
2026-11-26T11:54:51.7784508Z Kustomize Version: v4.5.7
2026-11-26T11:54:51.7784625Z Server Version: 4.15.59
2026-11-26T11:54:51.7785576Z Kubernetes Version: v1.28.15+d227d65
2026-11-26T11:54:51.7819786Z ++ /usr/local/bin/oc-v4.13 get pod -l name=sispx-pix-gestao-des -n sispx-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-11-26T11:54:51.7820698Z ++ tac
2026-11-26T11:54:51.7821215Z ++ grep -v '^$'
2026-11-26T11:54:51.7821356Z ++ head -n1
2026-11-26T11:54:51.9069221Z + last_pod=sispx-pix-gestao-des-410-dtnfj
2026-11-26T11:54:51.9069502Z + echo 'Logs do POD: sispx-pix-gestao-des-410-dtnfj'
2026-11-26T11:54:51.9070050Z + /usr/local/bin/oc-v4.13 logs sispx-pix-gestao-des-410-dtnfj -c sispx-pix-gestao-des -n sispx-des
2026-11-26T11:54:51.9070263Z Logs do POD: sispx-pix-gestao-des-410-dtnfj
2026-11-26T11:54:52.0579039Z Error from server (BadRequest): container "sispx-pix-gestao-des" in pod "sispx-pix-gestao-des-410-dtnfj" is waiting to start: PodInitializing
2026-11-26T11:54:52.0638674Z ##[error]Bash exited with code '1'.
2026-11-26T11:54:52.0674880Z ##[section]Finishing: Logs da Aplicação






ERRO: Nao foram encontrados arquivos com segredos no diretorio '/usr/src/app/secrets_files'.

Red Hat OpenShift



p585600@corp.caixa.gov.br

Administrator
Home
Operators
Workloads
Networking
Storage
Builds
Observe
Compute
User Management
Administration
Service Mesh

Project: sispx-des
Pods
Pod details
Pod
P
sispx-pix-gestao-des-412-tbckt
Init:Error

Actions
Details
Metrics
YAML
Environment
Logs
Events
Terminal
Aggregated Logs
Service Mesh
Log stream ended.

Container
C
secrets-check

Current log
Search
Debug container

Show full log

Wrap lines
Raw
Download
2 lines
ERRO: Nao foram encontrados arquivos com segredos no diretorio '/usr/src/app/secrets_files'.
 
Red Hat OpenShift



p585600@corp.caixa.gov.br

Administrator
Home
Operators
Workloads
Networking
Storage
Builds
Observe
Compute
User Management
Administration
Service Mesh

Project: sispx-des
Pods
Pod details
Pod
P
sispx-pix-gestao-des-412-tbckt
Init:CrashLoopBackOff

Actions
Details
Metrics
YAML
Environment
Logs
Events
Terminal
Aggregated Logs
Service Mesh
Log stream ended.

Container
C
secrets-agent-sidecar

Current log
Search
Debug container

Show full log

Wrap lines
Raw
Download
120 lines
^
File "/usr/local/lib/python3.13/site-packages/urllib3/connectionpool.py", line 841, in urlopen
retries = retries.increment(
method, url, error=new_e, _pool=self, _stacktrace=sys.exc_info()[2]
)
File "/usr/local/lib/python3.13/site-packages/urllib3/util/retry.py", line 519, in increment
raise MaxRetryError(_pool, url, reason) from reason # type: ignore[arg-type]
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
urllib3.exceptions.MaxRetryError: HTTPSConnectionPool(host='sicsn.caixa', port=443): Max retries exceeded with url: /BeyondTrust/api/public/v3/Auth/connect/token (Caused by ConnectTimeoutError(<urllib3.connection.HTTPSConnection object at 0x7f79fc20ccd0>, 'Connection to sicsn.caixa timed out. (connect timeout=30)'))
During handling of the above exception, another exception occurred:
Traceback (most recent call last):
File "/usr/src/app/get_secrets_from_secret_safe.py", line 82, in main
get_api_access_response = authentication_obj.get_api_access()
File "/usr/local/lib/python3.13/site-packages/secrets_safe_library/authentication.py", line 159, in get_api_access
oauth_response = self.oauth()
File "/usr/local/lib/python3.13/site-packages/secrets_safe_library/authentication.py", line 125, in oauth
response = self._req.post(
endpoint_url,
...<3 lines>...
timeout=(self._timeout_connection_seconds, self._timeout_request_seconds),
)
File "/usr/local/lib/python3.13/site-packages/requests/sessions.py", line 637, in post
return self.request("POST", url, data=data, json=json, **kwargs)
~~~~~~~~~~~~^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
File "/usr/local/lib/python3.13/site-packages/requests/sessions.py", line 589, in request
resp = self.send(prep, **send_kwargs)
File "/usr/local/lib/python3.13/site-packages/requests/sessions.py", line 703, in send
r = adapter.send(request, **kwargs)
File "/usr/local/lib/python3.13/site-packages/requests/adapters.py", line 688, in send
raise ConnectTimeout(e, request=request)
requests.exceptions.ConnectTimeout: HTTPSConnectionPool(host='sicsn.caixa', port=443): Max retries exceeded with url: /BeyondTrust/api/public/v3/Auth/connect/token (Caused by ConnectTimeoutError(<urllib3.connection.HTTPSConnection object at 0x7f79fc20ccd0>, 'Connection to sicsn.caixa timed out. (connect timeout=30)'))
2026-11-26 12:37:39,328 ERROR (e233e78a-e995-11f1-bff0-0a5819820eae) There was an error in the execution: HTTPSConnectionPool(host='sicsn.caixa', port=443): Max retries exceeded with url: /BeyondTrust/api/public/v3/Auth/connect/token (Caused by ConnectTimeoutError(<urllib3.connection.HTTPSConnection object at 0x7f79fc20ccd0>, 'Connection to sicsn.caixa timed out. (connect timeout=30)'))




Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
/
Releases
/
SISPX-pix-gestao
/
SISPX-pix-gestao-20261125.1430-1.0.0-SNAPSHOT(7)
Search


Caixa

Overview

Boards

Repos

Pipelines
Pipelines
Environments
Releases
Library
Task groups
Deployment groups
Portal Infra

Test Plans

Artifacts
Project settings
SISPX-pix-gestao

SISPX-pix-gestao-20261125.1430-1.0.0-SNAPSHOT(7)


OCP4 EC DES

Failed


Pipeline

Tasks

Variables

Logs

Tests
Predefined variables
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
Usuario-Azure-DevOps (12)
Scopes: Release
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
EGRESS_IP_OKD (88)
WO0000072264656 - Config Portal Infrafácil NO_PROXY
Scopes: Release
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)
Scopes: Release
SISPX-PIX-GESTAO-DES (44)
Grupo de variáveis de SISPX-PIX-GESTAO-DES
Scopes: OCP4 EC DES
BACKUP.QUARKUS_DATASOURCE_PASSWORD
#{SISPX_DB_PASSWORD}#
BACKUP.SECRET_ID_SPX
#{SECRET_SPX}#
BACKUP.SIBAR_APIKEY
l76138e827bd9d4f87aea4ff7f54a5607c
SECRET_SPX
********
SISPX_DB_PASSWORD
********
VAULT_LOCATION
********
_ENV.API_KEY
'${sispi_api_key}'
_ENV.CLIENT_ID_SPX
cli-ser-spx
_ENV.DATASOURCE_SISPI_PASSWORD
'${sspibd03_oracle}'
_ENV.DATASOURCE_SISPI_URL
"jdbc:oracle:thin:@(DESCRIPTION=(LOAD_BALANCE=off)(ADDRESS=(PROTOCOL=TCP)(HOST=10.116.101.16)(PORT=1521))(CONNECT_DATA=(SERVICE_NAME=CDBD08NGPDB017)(SERVER=DEDICATED)))"
_ENV.DATASOURCE_SISPI_USERNAME
SSPIBD03
_ENV.ISPB_CAIXA
00360305
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks"
_ENV.MQ_ANTIFRAUDE_CHANNEL
SISPX.SVRCONN
_ENV.MQ_ANTIFRAUDE_FILA_RECORRENCIA
SIAAF.REQ.SISPX.PIX_RECORRENTE
_ENV.MQ_ANTIFRAUDE_HOSTNAME
ibmspdes.caixa
_ENV.MQ_ANTIFRAUDE_MAXIMO_CONEXOES
1
_ENV.MQ_ANTIFRAUDE_MAXIMO_SESSOES
300
_ENV.MQ_ANTIFRAUDE_PORT
1420
_ENV.MQ_ANTIFRAUDE_QUEUE_MANAGER
QSDA
_ENV.MQ_ANTIFRAUDE_TIMEOUT
1000
_ENV.MQ_ANTIFRAUDE_USERID
MQSSTCSP
_ENV.PIX.FRAMEWORK.VALIDACAO_TOKEN.VALIDACAO_GLOBAL
true
_ENV.PIX_FRAMEWORK_TOKEN_URL
"https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token"
_ENV.PIX_FRAMEWORK_VALIDACAO_TOKEN_SSO_EMISSOR_0
"https://login.des.caixa/auth/realms/intranet"
_ENV.PIX_FRAMEWORK_VALIDACAO_TOKEN_SSO_URL_0
"http://sispi-api-proxy-sso-des.sispi-des.svc:8080/auth/realms/intranet;https://login.des.caixa/auth/realms/intranet"
_ENV.QUARKUS_DATASOURCE_JDBC_URL
jdbc:oracle:thin:@cnpexdadvm01-scan4.extra.caixa.gov.br:1521/CDBD08NGPDB017
_ENV.QUARKUS_DATASOURCE_PASSWORD
'${sspxbd01_oracle}'
_ENV.QUARKUS_DATASOURCE_USERNAME
sspxbd01
_ENV.SECRET_ID_SPX
'${sispx_secret_intranet}'
_ENV.SIBAR_APIKEY
'${sispi_api_key}'
_ENV.SISPI_DATA_NOVA_CONSULTA
"02/05/2023"
_ENV.SISPX_ENVIRONMENT
DES
_ENV.SPI_URL_FABRICA_IDS
http://sispi-api-fabrica-ids-des.sispi-des.svc:8080
_ENV.SPX_URL_API_CONTAS_MIGRADAS
https://sispi-container-dict-des.apps.pixnprd4.caixa/sispi-dict-war/api
_ENV.SPX_URL_API_LIMITES
https://sispx-gestao-limites-des.apps.pixnprd4.caixa/pix/limites/v1/
_ENV.SPX_URL_API_SIBAR
https://api.des.caixa:8443
_ENV.SPX_URL_FABRICA_ID
http://sispx-fabrica-id-recorrencia-des.apps.pixnprd4.caixa
_ENV.SPX_URL_FERIADOS
https://api.des.caixa:8443
_ENV.SPX_URL_IBGE
https://api.des.caixa:8443
_ENV.SPX_URL_MUNICIPIOS
https://sispi-parametrizacoes-pix-des.apps.pixnprd4.caixa
_ENV.VALIDACAO_CNPJ_CAIXA
false
_ENV.VERSAO
$(Build.BuildNumber)
_SECRET.SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS
#{VAULT_LOCATION}#
OCP-NPRD (8)
Credenciais para o Cluster OCP de NPRD (DES/TQS/HMP)
Scopes: OCP4 EC DES,OCP4 EC TQS,OCP4 EC HMP
ISTIO_INJECTION
enabled
KIND_DEPLOY
deploymentconfig
OCP_API
api.pixnprd4.caixa:6443
OCP_REGISTRY
default-route-openshift-image-registry.apps.pixnprd4.caixa
OCP_TOKEN
********
OCP_URL_SUFFIX
apps.pixnprd4.caixa
OCP_USER_SERVICE
ads
TIMEOUT_DEPLOY
300
SISPX-PIX-GESTAO-BT-VAULT-DES (1)
SISPX-PIX-GESTAO-BT-VAULT-DES
Scopes: OCP4 EC DES
BT_SECRETS_LIST
sispx_des/sspxbd01_oracle,sispx_des/sispi/sispi_api_key,sispx_des/sispx_secret_intranet,sispx_des/sispi/sspibd03_oracle
SISPX-BT-VAULT-SECRET-DES (2)
Scopes: OCP4 EC DES
BT_CLIENT_ID
700800ce-0869-4e6d-9108-16f3593f0bad
BT_CLIENT_SECRET
********
SISPX-PIX-GESTAO-TQS (1)
Grupo de variáveis de SISPX-PIX-GESTAO-TQS
Scopes: OCP4 EC TQS
INIT
Criado via api
SISPX-PIX-GESTAO-HMP (1)
Grupo de variáveis de SISPX-PIX-GESTAO-HMP
Scopes: OCP4 EC HMP
INIT
Criado via api
SISPX-PIX-GESTAO-PRD (47)
Grupo de variáveis de SISPX-PIX-GESTAO-PRD
Scopes: OCP4 EC PRD CANAIS
BACKUP.QUARKUS_DATASOURCE_PASSWORD
#{SISPX_DB_PASSWORD}#
BACKUP.SECRET_ID_SPX
#{SECRET_SPX}#
BACKUP.SIBAR_APIKEY
#{SIBAR_APIKEY_PASS}
MQ_ANTIFRAUDE_PASSWORD
********
SECRET_SPX
********
SIBAR_APIKEY_PASS
********
SISPX_DB_PASSWORD
********
VAULT_LOCATION
********
_ENV.API_KEY
'${sispi_api_key}'
_ENV.CLIENT_ID_SPX
cli-ser-spx
_ENV.DATASOURCE_SISPI_PASSWORD
'${sspisp01_oracle}'
_ENV.DATASOURCE_SISPI_URL
"jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(FAILOVER=ON)(LOAD_BALANCE=OFF)(ADDRESS=(PROTOCOL=TCP)(HOST=cadecrk01cl01scan.intra.caixa.gov.br)(PORT=1521))(ADDRESS=(PROTOCOL=TCP)(HOST=dadecrk01cl01scan.intra.caixa.gov.br)(PORT=1521)))(CONNECT_DATA=(SERVICE_NAME=prim_SPISRV)(FAILOVER_MODE=(TYPE=SELECT)(METHOD=BASIC)(RETRIES=3)(DELAY=2))))"
_ENV.DATASOURCE_SISPI_USERNAME
SSPISP01
_ENV.ISPB_CAIXA
00360305
_ENV.JAVA_OPTIONS_APPEND
"-Xms1280m -Xmx1280m -Djavax.net.ssl.trustStore=/deployments/sispi_interno_prd_2026.jks"
_ENV.MQ_ANTIFRAUDE_CHANNEL
SISPI.SVRCONN
_ENV.MQ_ANTIFRAUDE_FILA_RECORRENCIA
SIAAF.REQ.SISPX.PIX_RECORRENTE
_ENV.MQ_ANTIFRAUDE_HOSTNAME
mqsg.qspi-plexp.intra.caixa
_ENV.MQ_ANTIFRAUDE_MAXIMO_CONEXOES
1
_ENV.MQ_ANTIFRAUDE_MAXIMO_SESSOES
300
_ENV.MQ_ANTIFRAUDE_PORT
1426
_ENV.MQ_ANTIFRAUDE_QUEUE_MANAGER
QSPI
_ENV.MQ_ANTIFRAUDE_TIMEOUT
5000
_ENV.MQ_ANTIFRAUDE_USERID
SSPISP01
_ENV.PIX.FRAMEWORK.VALIDACAO_TOKEN.VALIDACAO_GLOBAL
true
_ENV.PIX_FRAMEWORK_TOKEN_URL
"https://login.prd.caixa/auth/realms/intranet/protocol/openid-connect/token"
_ENV.PIX_FRAMEWORK_VALIDACAO_TOKEN_SSO_EMISSOR_0
"https://login.prd.caixa/auth/realms/intranet"
_ENV.PIX_FRAMEWORK_VALIDACAO_TOKEN_SSO_URL_0
"http://sispi-api-proxy-sso-prd.sispi-prd.svc:8080/auth/realms/intranet;https://login.prd.caixa/auth/realms/intranet"
_ENV.QUARKUS_DATASOURCE_JDBC_URL
"jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(FAILOVER=ON)(LOAD_BALANCE=OFF)(ADDRESS=(PROTOCOL=TCP)(HOST=cadecrk01cl01scan.intra.caixa.gov.br)(PORT=1521))(ADDRESS=(PROTOCOL=TCP)(HOST=dadecrk01cl01scan.intra.caixa.gov.br)(PORT=1521)))(CONNECT_DATA=(SERVICE_NAME=prim_SPXSRV)(FAILOVER_MODE=(TYPE=SELECT)(METHOD=BASIC)(RETRIES=3)(DELAY=2))))"
_ENV.QUARKUS_DATASOURCE_PASSWORD
'${sspxsp01_oracle}'
_ENV.QUARKUS_DATASOURCE_USERNAME
SSPXSP01
_ENV.SECRET_ID_SPX
'${cliserspx_sso_intra}'
_ENV.SIBAR_APIKEY
'${sispi_api_key}'
_ENV.SISPI_DATA_NOVA_CONSULTA
"02/05/2023"
_ENV.SISPX_ENVIRONMENT
PRD
_ENV.SPI_URL_FABRICA_IDS
http://sispi-api-fabrica-ids-prd.sispi-prd.svc:8080/
_ENV.SPX_URL_API_CONTAS_MIGRADAS
http://sispi-container-dict-prd.sispi-prd.svc:8080/sispi-dict-war/api
_ENV.SPX_URL_API_LIMITES
https://sispx-gestao-limites-prd.apps.pix4.caixa/pix/limites/v1/
_ENV.SPX_URL_API_SIBAR
https://api.caixa:8443
_ENV.SPX_URL_FABRICA_ID
http://sispx-fabrica-id-recorrencia-prd:8080/
_ENV.SPX_URL_FERIADOS
https://api.caixa:8443
_ENV.SPX_URL_IBGE
https://api.caixa:8443
_ENV.SPX_URL_MUNICIPIOS
http://sispi-parametrizacoes-pix-prd-esteiras.sispi-prd.svc:8080
_ENV.VALIDACAO_CNPJ_CAIXA
false
_ENV.VERSAO
$(Build.BuildNumber)
_SECRET.MQ_ANTIFRAUDE_PASSWORD
#{MQ_ANTIFRAUDE_PASSWORD}#
_SECRET.SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS
#{VAULT_LOCATION}#
OCP-PRD (16)
Credenciais para o Cluster OCP de PRD
Scopes: OCP4 EC PRD CANAIS
SISPX-PIX-GESTAO-BT-VAULT-PRD (1)
SISPX-PIX-GESTAO-BT-VAULT-PRD
Scopes: OCP4 EC PRD CANAIS
sispx-BT-VAULT-SECRET-PRD (2)
Scopes: OCP4 EC PRD CANAIS
Showing filters 1 through 2
