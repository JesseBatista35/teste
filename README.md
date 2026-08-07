

--- Resultados da Comparacao ---
ERRO na validacao: Os seguintes arquivos obrigatorios estao FALTANDO:
SICFD_TQS/CLISERCFD_TQS
SICFD_TQS/SCFDTR01_ORA

ERRO: Verificacao nao foi bem-sucedida.

ERRO: Diagnostico. Arquivos vazios encontrados.



ERRO: Diagnostico. IP do POD.
1: lo: <LOOPBACK,UP,LOWER_UP> mtu 65536 qdisc noqueue state UNKNOWN group default qlen 1000
    link/loopback 00:00:00:00:00:00 brd 00:00:00:00:00:00
    inet 127.0.0.1/8 scope host lo
       valid_lft forever preferred_lft forever
    inet6 ::1/128 scope host 
       valid_lft forever preferred_lft forever
3: eth0@if20088: <BROADCAST,MULTICAST,UP,LOWER_UP> mtu 1450 qdisc noqueue state UP group default 
    link/ether 0a:58:19:01:09:2e brd ff:ff:ff:ff:ff:ff link-netnsid 0
    inet 25.1.9.46/23 brd 25.1.9.255 scope global eth0
       valid_lft forever preferred_lft forever
    inet6 fe80::84d9:48ff:fe1b:9bb/64 scope link 
       valid_lft forever preferred_lft forever



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
SICFD-after-game-okd4
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
All pipelines

SICFD

SICFD-after-game-okd4
Predefined variables
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
Usuario-Azure-DevOps (12)
Scopes: Release
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
EGRESS_IP_OKD (81)
WO0000072264656 - Config Portal Infrafácil NO_PROXY
Scopes: Release
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)

Scopes: Release
OKD-4-NPRD (12)
Credenciais para o Cluster OKD4 de NPRD (DES/TQS/HMP)
Scopes: EC DES,EC TQS,EC HMP
SICFD-after-game-des (40)

Scopes: EC DES
DB2_PASS
********
FGD_SSO_PASSWORD
********
PASS
********
PASS_CERTIFICATE
********
SPRING_PASS
********
_ENV.AMBIENTE
des
_ENV.APP_DATASOURCE_JDBCURL
"jdbc:oracle:thin:@10.116.101.7:1521/ORAD01SC"
_ENV.APP_DATASOURCE_USERNAME
SCFDRD01
_ENV.CERTIFICATE_ALIAS
signer
_ENV.CERTIFICATE_PASSWORD
secret
_ENV.CERTIFICATE_PATH
/deployments/test.pfx
_ENV.CRON_EXPR
"0 */5 * * * ?"
_ENV.DB2.DATASOURCE.HIKARI.MAXLIFETIME
600000
_ENV.DB2_DATASOURCE_JDBCURL
"jdbc:db2://10.216.80.110:448/RJKDB2DSD0:currentFunctionPath=DESFUG;"
_ENV.DB2_DATASOURCE_USERNAME
SCFDDR02
_ENV.FGD-CLIENT-ID
cli-ser-cfd
_ENV.FGD_DB2_DATASOURCE_JDBC_URL
"jdbc:db2://10.216.80.110:448/RJKDB2DSD0:currentFunctionPath=DESFUG;"
_ENV.FGD_DB2_DATASOURCE_USERNAME
SCFDDR02
_ENV.JAVA_OPTIONS_APPEND
"-Doracle.jdbc.javaNetNio=false"
_ENV.SISTEMA_AMBIENT
SICFD-des
_ENV.SISTEMA_NOME
SICFD-after-game
_ENV.SPRING_BATCH_INITIALIZE-SCHEMA
always
_ENV.SPRING_DATASOURCE_DRIVERCLASSNAME
"oracle.jdbc.OracleDriver"
_ENV.SPRING_DATASOURCE_JDBCURL
"jdbc:oracle:thin:@10.116.101.7:1521/orad01sc"
_ENV.SPRING_DATASOURCE_USERNAME
SCFDRD01
_ENV.URL-RESP-ASSINC
http://sicfd-resposta-assincrona-des:8080/ecaixa/respostaassincrona/
_ENV.URL-SSO
https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token
_ENV.URL_MONITORAMENTO
http://sicfd-monitoramento-des:8080/monitor/indiv
_ENV.URL_RECOVERY
http://sicfd-recovery-des.apps.nprd.caixa/recuperar/individualizacao/enviarresposta
_ENV.URL_RESPOSTA_ASSINCRONA
http://sicfd-resposta-assincrona-des:8080/ecaixa/respostaassincrona/recomposicaoVinculo
_ENV.URL_SONDA
http://sicfd-individualizacao-des.apps.nprd.caixa/
_ENV.URL_VINCULO
http://sicfd-des.apps.nprd.caixa/ecaixa/vinculo?origemToken=2
_ENV.intervaloHeartBeat
100000
_ENV.intervaloRepouso
10000
_SECRET.APP_DATASOURCE_PASSWORD
#{PASS}#
_SECRET.CERTIFICATE_PASSWORD
#{PASS_CERTIFICATE}#
_SECRET.DB2_DATASOURCE_PASSWORD
#{DB2_PASS}#
_SECRET.FGD-SSO-PASSWORD
#{FGD_SSO_PASSWORD}#
_SECRET.FGD_DB2_DATASOURCE_PASSWORD
#{DB2_PASS}#
_SECRET.SPRING_DATASOURCE_PASSWORD
#{SPRING_PASS}#
SICFD-AFTER-GAME-VAULT-DES (3)
Scopes: EC DES
BT_CLIENT_ID
c3afb881-c503-4e4d-b741-447c74fbf762
BT_CLIENT_SECRET
********
BT_SECRETS_LIST
SICFD_DES/SCFDDR02_DB2,SICFD_DES/SCFDRD01_ORACLE,SICFD_DES/CLISERCFD_SSO_INTRA
SICFD-after-game-tqs (38)
Scopes: EC TQS
DB2_PASS
********
FGD_SSO_PASSWORD
********
PASS
********
PASS_CERTIFICATE
********
SPRING_PASS
********
_ENV.AMBIENTE
tqs
_ENV.APP_DATASOURCE_JDBCURL
"jdbc:oracle:thin:@10.116.33.7:1521/orat01sc"
_ENV.APP_DATASOURCE_USERNAME
SCFDTR01
_ENV.CERTIFICATE_ALIAS
signer
_ENV.CERTIFICATE_PATH
/deployments/test.pfx
_ENV.CRON_EXPR
"0 */5 * * * ?"
_ENV.DB2_DATASOURCE_JDBCURL
"jdbc:db2://10.216.80.111:446/RJKDB2DSDH:currentFunctionPath=FUG;"
_ENV.DB2_DATASOURCE_USERNAME
SCFDTR02
_ENV.FGD-CLIENT-ID
cli-ser-cfd
_ENV.FGD_DB2_DATASOURCE_JDBC_URL
"jdbc:db2://10.216.80.111:446/RJKDB2DSDH:currentFunctionPath=FUG;"
_ENV.FGD_DB2_DATASOURCE_USERNAME
SCFDTR02
_ENV.JAVA_OPTIONS_APPEND
"-Doracle.jdbc.javaNetNio=false"
_ENV.SISTEMA_AMBIENT
SICFD-tqs
_ENV.SISTEMA_NOME
SICFD-after-game
_ENV.SPRING_BATCH_INITIALIZE-SCHEMA
always
_ENV.SPRING_DATASOURCE_DRIVERCLASSNAME
"oracle.jdbc.OracleDriver"
_ENV.SPRING_DATASOURCE_JDBCURL
"jdbc:oracle:thin:@10.116.33.1:1521/orat01sc"
_ENV.SPRING_DATASOURCE_USERNAME
SCFDTR01
_ENV.URL-RESP-ASSINC
http://sicfd-resposta-assincrona-tqs:8080/ecaixa/respostaassincrona/
_ENV.URL-SSO
https://login.tqs.caixa/auth/realms/intranet/protocol/openid-connect/token
_ENV.URL_MONITORAMENTO
http://sicfd-monitoramento-tqs:8080/monitor/indiv
_ENV.URL_RECOVERY
http://sicfd-recovery-tqs.apps.nprd.caixa/recuperar/individualizacao/enviarresposta
_ENV.URL_RESPOSTA_ASSINCRONA
http://sicfd-resposta-assincrona-tqs:8080/ecaixa/respostaassincrona/recomposicaoVinculo
_ENV.URL_SONDA
https://sicfd-individualizacao-tqs.apps.nprd.caixa
_ENV.URL_VINCULO
http://sicfd-tqs.apps.nprd.caixa/ecaixa/vinculo?origemToken=2
_ENV.intervaloHeartBeat
100000
_ENV.intervaloRepouso
10000
_SECRET.APP_DATASOURCE_PASSWORD
#{PASS}#
_SECRET.CERTIFICATE_PASSWORD
#{PASS_CERTIFICATE}#
_SECRET.DB2_DATASOURCE_PASSWORD
#{DB2_PASS}#
_SECRET.FGD-SSO-PASSWORD
#{FGD_SSO_PASSWORD}#
_SECRET.FGD_DB2_DATASOURCE_PASSWORD
#{DB2_PASS}#
_SECRET.SPRING_DATASOURCE_PASSWORD
#{SPRING_PASS}#
SICFD-AFTER-GAME-BT-VAULT-TQS (3)
SICFD-AFTER-GAME-BT-VAULT-TQS WO0000080202014
Scopes: EC TQS
BT_CLIENT_ID
1ae9bada-9b3f-45a7-b76c-93ace0da4642
BT_CLIENT_SECRET
********
BT_SECRETS_LIST
SICFD_TQS/SCFDTR02_DB2,SICFD_TQS/SCFDTR01_ORA,SICFD_TQS/CLISERCFD_TQS
SICFD-after-game-hmp (38)
Scopes: EC HMP
OKD-4-APL (12)
Scopes: EC PRD
SICFD-after-game-prd (39)
WO0000067829575
Scopes: EC PRD
|Manage variable groups
548 pipelines found

Select a release pipeline to view its releases

21 pipelines found

Select a release pipeline to view its releases

20 pipelines found

Row 3

1 pipelines found

Select a release pipeline to view its releases

Row 2

Showing filters 1 through 2

