Tipo do Serviço:	Disponibilização/Remoção de Espaço em Disco
Qual o atendimento a ser realizado?:	Solicitação de Armazenamento
----------------------------------------------------
Solicitante: c159528
Centro de Custo: CESOA
Opção NAS: Sistema
Nome Sistema: sisns
Ambiente: TQS
Esteira OKD
Plataforma Armazenamento: OPEN
Path Compartilhamento: nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISNS_TQS_FGW
Tipo de Disco: NAS
Compartilhamento EXISTENTE
Tipo de Solicitação: INCLUSÃO DE MÓDULO

----------------------------------------------------
Ponto de Montagem: opt/SISNS/SIB2B/GECIN/DOWNLOAD
Tipo de Compartilhamento: NFS/SMB
Responsáveis por Gerenciar o Compartilhamento
Matrícula: c159528@caixa.gov.br
Matrícula: c135636@caixa.gov.br
Vai se Comunicar com Mainframe: NÃO

---------------------------------
HOSTS OKD
---------------------------------
Módulo: sisns-backend
Ip Real: 10.116.220.96
Ip de Backup: 192.168.230.209, 192.168.230.210, 192.168.240.201, 192.168.235.248, 192.168.236.12, 192.168.236.13, 192.168.236.14, 192.168.236.15, 192.168.236.16, 192.168.236.17, 192.168.236.18, 192.168.236.20, 192.168.236.23, 192.168.236.28, 192.168.236.30, 192.168.236.35, 192.168.236.34, 192.168.236.39, 192.168.236.47, 192.168.229.250, 192.168.230.116, 192.168.230.137, 192.168.230.187, 192.168.231.31, 192.168.234.186, 192.168.236.143, 192.168.236.144, 192.168.236.145, 192.168.236.146, 192.168.236.147, 192.168.236.148, 192.168.236.149, 192.168.236.150, 192.168.236.151, 192.168.236.152, 192.168.236.153, 192.168.236.154, 192.168.236.200, 192.168.236.155, 192.168.236.156, 192.168.236.157, 192.168.236.158, 192.168.236.159, 192.168.236.160, 192.168.236.168, 192.168.236.161, 192.168.236.162, 192.168.236.163, 192.168.236.164, 192.168.236.165, 192.168.236.166, 192.168.236.167, 192.168.236.168, 192.168.236.170, 192.168.236.171, 192.168.236.172, 192.168.236.173, 192.168.251.90, 192.168.251.91, 192.168.251.92, 192.168.251.93, 192.168.251.94, 192.168.251.95, 192.168.251.96, 192.168.251.97, 192.168.251.98, 192.168.251.99, 192.168.231.135, 192.168.240.182, 192.168.240.183, 192.168.240.184, 192.168.240.185, 192.168.240.186, 192.168.240.187, 192.168.240.188, 192.168.240.189, 192.168.240.190, 192.168.240.191, 192.168.240.192, 192.168.240.193, 192.168.240.194, 192.168.240.195, 192.168.240.196, 192.168.240.197, 192.168.240.198, 192.168.240.199, 192.168.240.200
Hostname: sisns-backend
----------------------------------------------------
Observações: nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISNS_TQS_FGW 5.0G 0 5.0G 0% /NFS/PARCEIROS/SISNS


Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
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
SISNS

SISNS-backend
Predefined variables
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
Usuario-Azure-DevOps (12)
Scopes: Release
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
EGRESS_IP_OKD (74)
WO0000072264656 - Config Portal Infrafácil NO_PROXY
Scopes: Release
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)
Scopes: Release
Compartilhamentos (4)
Scopes: Release
OKD-4-NPRD (12)
Credenciais para o Cluster OKD4 de NPRD (DES/TQS/HMP)
Scopes: EC DES,EC TQS,EC HMP
SISNS-backend-des (23)
Scopes: EC DES
SISNS-backend-tqs (17)

Scopes: EC TQS
DATASOURCESRH.PASSWORD
********
_ENV.AMBIENTE
tqs
_ENV.API_KEY_SIICO
l7957dbbbe298447c8b020cfba38f09475
_ENV.API_SIICO_URL
https://api.des.caixa:8443/informacoes-corporativas-
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks"
_ENV.QUARKUS_HTTP_CORS
true
_ENV.QUARKUS_LOG_BASICBINDER
TRACE
_ENV.QUARKUS_LOG_CATEGORY
INFO
_ENV.QUARKUS_LOG_LEVEL
INFO
_ENV.QUARKUS_LOG_MIN
TRACE
_ENV.SISNS.DATASOURCE.DBUSER
SSNSTB01
_ENV.SISNS.DATASOURCE.JDBC.URL
jdbc:oracle:thin:@cnpexdadvm01-scan5.extra.caixa.gov.br/PDBT001NG
_ENV.SISNS.SSO_URL
https://login.tqs.caixa/auth/realms/intranet
_ENV.SISNS_URL_NFS
/SISNS/
_ENV.SISRH.DATASOURCE.DBUSER
SSNSSRHD
_ENV.SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS
/usr/src/app/secrets_files/SISNS_TQS/
_SECRET.SISNS.DATASOURCE.PASSWORD
'${SSNSTB01_ORACLE}'
SISNS-backend-BT-VAULT-TQS (4)
SISNS-backend-BT-VAULT-TQS
Scopes: EC TQS
OKD-4-APL (12)
Scopes: EC PRD
SISNS-backend-prd (27)
Library de PRD - CRQ000000943719
Scopes: EC PRD
SISNS-BACKEND-BT-VAULT-PRD (3)
SISNS-BACKEND-BT-VAULT-DES
Scopes: EC PRD
|Manage variable groups
Expanded

Expanded

Collapsed

Collapsed

1 pipelines found

Row 2

Showing filters 1 through 2





You have access to 973 projects, the list has been suppressed. You can list all projects with 'oc projects'

Using project "sisou-des".
-sh-4.2$ oc get project sisns-tqs
NAME        DISPLAY NAME   STATUS
sisns-tqs                  Active
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$

