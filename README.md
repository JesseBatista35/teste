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
SILIC-v2-backend
/
SILIC-v2-backend-0.0.0.72(1)
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
SILIC-v2-backend

SILIC-v2-backend-0.0.0.72(1)


EC DES

Succeeded

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
EGRESS_IP_OKD (81)
WO0000072264656 - Config Portal Infrafácil NO_PROXY
Scopes: Release
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)
Scopes: Release
OKD-4-NPRD (12)
Credenciais para o Cluster OKD4 de NPRD (DES/TQS/HMP)
Scopes: EC DES,EC TQS,EC HMP,EC TQS_2
SILIC-v2-backend-des (62)
Scopes: EC DES
APIKEY
********
CLIENT_CREDENTIALS_SECRET
********
ECMD_PASS
********
SAP_ODATA_PASSWORD
********
SAP_PI_PASSWORD
********
SENHA_BD_SAP_SISRH
********
SENHA_DB
********
_ENV.AMBIENTE
des
_ENV.API_CAIXA_URL
https://api.des.caixa:8443
_ENV.API_GED_URL
https://siecm.des.caixa/siecm-web/ECM
_ENV.API_SAP_URL
https://integramaisepq.caixaintegrada.caixa/sap/bc/rest
_ENV.API_SAP_USERNAME
SRFOBH01
_ENV.API_SICLG_URL
https://des.siclg.caixa/rest
_ENV.API_SILIC_URL
https://silic-v2-frontend-des.apps.nprd.caixa/silic
_ENV.APPLICATION_SERVER_IP
10.116.220.182
_ENV.DB_SAP_SISRH_URL
jdbc:oracle:thin:@//cnpexdadvm01-scan4.extra.caixa.gov.br:1521/CDBD08NGPDB003
_ENV.DB_SAP_SISRH_USERNAME
SLICPGED
_ENV.DB_SILIC_URL
jdbc:oracle:thin:@cnpexdadvm01-scan4.extra.caixa.gov.br:1521/orad02ng
_ENV.DB_SILIC_USERNAME
SLICDB01
_ENV.ECMD_USER
SLICECMD
_ENV.EMAIL_ENVIAR
false
_ENV.EMAIL_GECOT
gecot@caixa.gov.br
_ENV.EMAIL_HOST
smtptest.correiolivre.caixa
_ENV.EMAIL_PORT
25
_ENV.EMAIL_REMETENTE
gecot06@caixa.gov.br
_ENV.EMAIL_SSL
false
_ENV.EMAIL_SUCOT
sucot@caixa.gov.br
_ENV.JDBC_MAX_SIZE
20
_ENV.JDBC_MIN_SIZE
5
_ENV.JVM_ARGS_XMS
-Xms512m
_ENV.JVM_ARGS_XMX
-Xmx2048m
_ENV.LOTE_ATESTE_MANUAL_IDGED
6088109C-0000-C21E-88FC-D21A6F659AE8
_ENV.LOTE_ATESTE_MODELO_IDGED
3087109C-0000-CD16-8B25-32A643E23498
_ENV.LOTE_FORNECEDOR_RELEVANTE_MANUAL_IDGED
9092589C-0000-CB16-93B7-4F3F53EEC0F7
_ENV.LOTE_FORNECEDOR_RELEVANTE_MODELO_IDGED
30C3589C-0000-C51B-92DB-BBA7F7263FDC
_ENV.LOTE_ORCAMENTO_MANUAL_IDGED
30670B9D-0000-C21E-A8F3-256277F8BB39
_ENV.LOTE_ORCAMENTO_MODELO_IDGED
8089109C-0000-C411-9FD2-DCB73985FE4B
_ENV.LOTE_PLANOAQUISICAO_MANUAL_IDGED
9055109C-0000-CA13-A86B-C3E1D2402D6F
_ENV.LOTE_PLANOAQUISICAO_MODELO_IDGED
B0A8B89F-0000-CD18-91B2-2EA8F6808016
_ENV.MANUAL_SILIC_IDGED
D0FD5F9E-0000-C61B-A399-04C18C57A77D
_ENV.PARCEIROS.CAIXA.APIM.URI
https://apim-parceiros-sandbox.azure-api.net
_ENV.POOL_CORE_THREADS
20
_ENV.POOL_MAX_THREADS
50
_ENV.PORTAL_TRANSPARENCIA_API_KEY
chave-api-dados
_ENV.PORTAL_TRANSPARENCIA_API_URL
https://api.portaldatransparencia.gov.br
_ENV.PORTAL_TRANSPARENCIA_API_VALUE
7ac5b0ea7471646e3f4550c2681b28c3
_ENV.QUARKUS_HTTP_CORS_ORIGINS
https://silic-v2-frontend-des.apps.nprd.caixa
_ENV.QUARKUS_PROFILE
des
_ENV.SAP_USER
SRFOBP01
_ENV.SHOW_SQL
false
_ENV.SHOW_SQL_LOG_LEVEL
INFO
_ENV.SILIC_AUTH_CLIENT_ID
cli-ser-lic
_ENV.SILIC_AUTH_URL
https://login.des.caixa/auth/realms/intranet
_ENV_JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd-silic.jks -Djdk.tls.client.protocols=TLSv1,TLSv1.1,TLSv1.2"
_SECRET.API_CAIXA_KEY
#{APIKEY}#
_SECRET.API_SAP_PASSWORD
Caixa@2016
_SECRET.BD_SAP_SISRH_PASSWORD
#{SENHA_BD_SAP_SISRH}#
_SECRET.DB_SILIC_PASSWORD
#{SENHA_DB}#
_SECRET.ECMD_PASSWORD
#{ECMD_PASS}#
_SECRET.SAP_ODATA_PASSWORD
#{SAP_ODATA_PASSWORD}#
_SECRET.SAP_PI_PASSWORD
#{SAP_PI_PASSWORD}#
_SECRET.SILIC_AUTH_CLIENT_SECRET
#{CLIENT_CREDENTIALS_SECRET}#
SILIC-V2-BT-VAULT-DES (3)
SILIC-V2-BT-VAULT-DES WO0000080292412
Scopes: EC DES
BT_CLIENT_ID
BT_CLIENT_SECRET
BT_SECRETS_LIST
SILIC-v2-backend-tqs (61)
Scopes: EC TQS,EC TQS_2
SILIC-V2-BT-VAULT-TQS (3)
SILIC-V2-BT-VAULT-TQS WO0000080292412
Scopes: EC TQS,EC TQS_2
SILIC-v2-backend-tqs_2 (62)
WO0000081073164
Scopes: EC TQS_2
OKD-4-APL (12)
Scopes: EC PRD
SILIC-v2-backend-prd (54)
Scopes: EC PRD
Row 2

Showing filters 1 through 2

Showing filters 1 through 2



2026-08-28T21:36:00.9976494Z ##[section]Starting: Resumo da Release
2026-08-28T21:36:00.9979364Z ==============================================================================
2026-08-28T21:36:00.9979455Z Task         : Bash
2026-08-28T21:36:00.9979499Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-28T21:36:00.9979572Z Version      : 3.227.0
2026-08-28T21:36:00.9979615Z Author       : Microsoft Corporation
2026-08-28T21:36:00.9979667Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-28T21:36:00.9979746Z ==============================================================================
2026-08-28T21:36:01.7807197Z Generating script.
2026-08-28T21:36:01.7818430Z ========================== Starting Command Output ===========================
2026-08-28T21:36:01.7824310Z [command]/bin/bash /opt/ads-agent/_work/_temp/0588a2a3-0d50-47d8-99ef-ddd5cfec4341.sh
2026-08-28T21:36:01.7890336Z URL do Projeto no OKD: api.nprd.caixa:6443/console/project/silic-des/overview
2026-08-28T21:36:01.7893087Z /opt/ads-agent/_work/_temp/0588a2a3-0d50-47d8-99ef-ddd5cfec4341.sh: line 82: ISTIO_INJECTION: comando não encontrado
2026-08-28T21:36:01.7897821Z /opt/ads-agent/_work/_temp/0588a2a3-0d50-47d8-99ef-ddd5cfec4341.sh: line 92: CONTEXTO_JBOSS: comando não encontrado
2026-08-28T21:36:02.0140222Z APP Publicada na URL: https://silic-v2-backend-des.apps.nprd.caixa
2026-08-28T21:36:02.0214908Z ##[section]Finishing: Resumo da Release




{"Id":"49938bf8-3659-4954-b4e4-47e3e3ee8782","Descriptor":{"IdentityType":"System.Security.Principal.WindowsIdentity","Identifier":"S-1-5-21-2994637511-790031978-1797744665-1430737"},"ProviderDisplayName":"Cledson Moreira Parente","CustomDisplayName":"Cledson Parente","DisplayName":"Cledson Parente","IsActive":true,"UniqueUserId":0,"IsContainer":false,"Members":[],"MemberOf":[],"Properties":{"SchemaClassName":"User","Description":"PRESTADOR","Domain":"CORPCAIXA","Account":"p590589","DN":"CN=Cledson Moreira Parente,OU=Prestadores,OU=Usuarios,OU=CAIXA,DC=corp,DC=caixa,DC=gov,DC=br","Mail":"p590589@corp.caixa.gov.br","SpecialType":"Generic","ComplianceValidated":"2026-08-26T00:00:00Z","DirectoryAlias":"p590589"}}
