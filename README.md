Qual o tipo de serviço?*:	Ajustar ambiente ou parametrização de software
Informar o Ambiente:*:	DES
Nome do serviço ou sistema:*:	SIABM-autenticacao-24horas
Janela de atendimento:*:	10/9/2026 00:00:00
Prazo final da janela de atendimento:*:	14/9/2026 00:00:00
Haverá previsão de indisponibilidade durante a execução do serviço:*:	Não
Contato do responsável pela validação do ambiente após alteração:*:	f782514
Descrição da solicitação:*:	Segui o tutorial de integração do appInsigth nas aplicações springboot.

Erro na release:
https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=527336&environmentId=2449836


Nele pede para remover o apm mas não faço ideia onde fica essa configuração.
Alguém consegue me dar um help?


https://devops.caixa/projetos/Caixa/_wiki/wikis/Caixa.wiki/2937/CONFIGURA%C3%87%C3%83O-do-Application-Insights-no-Spring-Boot

https://devops.caixa/projetos/Caixa/_wiki/wikis/Caixa.wiki/428/Configura%C3%A7%C3%A3o-do-Application-Insights-no-Quarkus-via-arquivo-JSON?anchor=2.-liberar-o-acesso-aos-endpoints-da-azure-no-proxy
Informar formas de contato:*:	TEAMS


2026-09-10T22:26:15.1386574Z ##[section]Starting: Atualizando Variáveis de Ambiente
2026-09-10T22:26:15.1493391Z ==============================================================================
2026-09-10T22:26:15.1493493Z Task         : Bash
2026-09-10T22:26:15.1493568Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-10T22:26:15.1493634Z Version      : 3.227.0
2026-09-10T22:26:15.1493676Z Author       : Microsoft Corporation
2026-09-10T22:26:15.1493731Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-10T22:26:15.1493865Z ==============================================================================
2026-09-10T22:26:16.3282949Z Generating script.
2026-09-10T22:26:16.3294083Z ========================== Starting Command Output ===========================
2026-09-10T22:26:16.3301993Z [command]/bin/bash /opt/ads-agent/_work/_temp/1598ea0b-c653-4955-899a-1867ca9502a9.sh
2026-09-10T22:26:16.3355843Z Nova APP: false
2026-09-10T22:26:16.9271899Z deploymentconfig.apps.openshift.io/siabm-autenticacao-24horas-des updated
2026-09-10T22:26:17.2223211Z deploymentconfig.apps.openshift.io/siabm-autenticacao-24horas-des updated
2026-09-10T22:26:17.5108458Z deploymentconfig.apps.openshift.io/siabm-autenticacao-24horas-des updated
2026-09-10T22:26:17.8106353Z deploymentconfig.apps.openshift.io/siabm-autenticacao-24horas-des updated
2026-09-10T22:26:18.1083442Z deploymentconfig.apps.openshift.io/siabm-autenticacao-24horas-des updated
2026-09-10T22:26:18.4018340Z deploymentconfig.apps.openshift.io/siabm-autenticacao-24horas-des updated
2026-09-10T22:26:18.6882851Z deploymentconfig.apps.openshift.io/siabm-autenticacao-24horas-des updated
2026-09-10T22:26:18.9638707Z deploymentconfig.apps.openshift.io/siabm-autenticacao-24horas-des updated
2026-09-10T22:26:19.2411286Z deploymentconfig.apps.openshift.io/siabm-autenticacao-24horas-des updated
2026-09-10T22:26:19.5272671Z deploymentconfig.apps.openshift.io/siabm-autenticacao-24horas-des updated
2026-09-10T22:26:19.8038424Z deploymentconfig.apps.openshift.io/siabm-autenticacao-24horas-des updated
2026-09-10T22:26:20.0917306Z deploymentconfig.apps.openshift.io/siabm-autenticacao-24horas-des updated
2026-09-10T22:26:20.3842178Z deploymentconfig.apps.openshift.io/siabm-autenticacao-24horas-des updated
2026-09-10T22:26:20.6742669Z deploymentconfig.apps.openshift.io/siabm-autenticacao-24horas-des updated
2026-09-10T22:26:20.9741782Z deploymentconfig.apps.openshift.io/siabm-autenticacao-24horas-des updated
2026-09-10T22:26:21.2542976Z deploymentconfig.apps.openshift.io/siabm-autenticacao-24horas-des updated
2026-09-10T22:26:21.5316150Z deploymentconfig.apps.openshift.io/siabm-autenticacao-24horas-des updated
2026-09-10T22:26:22.0882118Z deploymentconfig.apps.openshift.io/siabm-autenticacao-24horas-des updated
2026-09-10T22:26:22.0929715Z /opt/ads-agent/_work/_temp/1598ea0b-c653-4955-899a-1867ca9502a9.sh: line 23: syntax error in conditional expression: unexpected token `;'
2026-09-10T22:26:22.0956816Z ##[error]Bash exited with code '2'.
2026-09-10T22:26:22.0982688Z ##[section]Finishing: Atualizando Variáveis de Ambiente



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
SIABM-autenticacao-24horas
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
SIABM

SIABM-autenticacao-24horas
Predefined variables
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
Usuario-Azure-DevOps (12)
Scopes: Release
EGRESS_IP_OKD (81)
WO0000072264656 - Config Portal Infrafácil NO_PROXY
Scopes: Release
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)
Scopes: Release
OKD-4-NPRD (12)
Credenciais para o Cluster OKD4 de NPRD (DES/TQS/HMP)
Scopes: EC DES,EC TQS,EC DES-sandbox,EC HMP
SIABM-AUTENTICACAO-24HORAS-DES (26)
Grupo de variáveis de SIABM-AUTENTICACAO-24HORAS-DES

Scopes: EC DES
VAULT_LOCATION
/usr/src/app/secrets_files/SIABM_DES/
_ENV.APPLICATIONINSIGHTS_CONFIGURATION_CONTENT
'{"sampling":{"overrides":[{"telemetryType":"request","attributes":[{"key":"url.path","value":"^(?:/actuator/health)(?:\\?.*)?$","matchType":"regexp"}],"percentage":0}]}}'
_ENV.APPLICATIONINSIGHTS_CONNECTION_STRING
'InstrumentationKey=63baa68e-6551-4fb0-99db-52f8d1efd964;IngestionEndpoint=https://brazilsoutheast-0.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsoutheast.livediagnostics.monitor.azure.com/;ApplicationId=f94af886-cd60-4c6e-b856-7185f640fe46'
_ENV.APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
INFO
_ENV.APPLICATIONINSIGHTS_PROXY
http://proxydes.caixa:80
_ENV.APPLICATIONINSIGHTS_ROLE_NAME
SIABM-AUTENTICACAO-24HORAS-DES
_ENV.APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
100
_ENV.APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL
INFO
_ENV.CONEXAO_HSM_IP
hsmdes.extra.caixa.gov.br
_ENV.CONEXAO_HSM_PWD
'${SABMSD01_HSM}'
_ENV.CONEXAO_HSM_USR
SABMSD01
_ENV.DB_PASSWORD
'${SABMDS08_ORACLE}'
_ENV.DB_URL
jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(ADDRESS=(PROTOCOL=TCP)(HOST=cnpexdadvm01-scan8.extra.caixa.gov.br)(PORT=1521)))(CONNECT_DATA=(SERVICE_NAME=orad01bc)))
_ENV.DB_USER
sabmds08
_ENV.HSM_AES_INCLUSAO_BIOMETRICA
siabm/AES_SIABM_K_001
_ENV.HSM_AES_INCLUSAO_BIOMETRICA_V2
SABMSD01/AES_SIABM_K_002
_ENV.HSM_ENCRYPT_KEY
abm_tecban_001
_ENV.HSM_HMACKEYNAME
abm_mac_001
_ENV.HTTPS_PROXY
http://proxydes.caixa:80
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks"
_ENV.NO_PROXY
".caixa,.caixa.gov.br"
_ENV.REALM
intranet
_ENV.SIABM_SSO_CLIENT_ID
cli-ser-abm
_ENV.SIABM_SSO_CLIENT_SECRET
'${CLISERABM_SSO_INTRA}'
_ENV.URL_SSO
https://login.des.caixa/auth
_SECRET.SIABM_VAULT
#{VAULT_LOCATION}#
SIABM-AUTENTICACAO-24HORAS-BT-VAULT-DES (1)
SIABM-AUTENTICACAO-24HORAS-BT-VAULT-DES WO0000079871011
Scopes: EC DES
SIABM-BT-VAULT-SECRET-DES (2)
Scopes: EC DES,EC DES-sandbox
SIABM-AUTENTICACAO-24HORAS-TQS (16)
Grupo de variáveis de SIABM-AUTENTICACAO-24HORAS-TQS
Scopes: EC TQS
SIABM-AUTENTICACAO-24HORAS-BT-VAULT-TQS (1)
SIABM-AUTENTICACAO-24HORAS-BT-VAULT-TQS WO0000079857611
Scopes: EC TQS
SIABM-BT-VAULT-SECRET-TQS (2)
Scopes: EC TQS
ADAPTER_VARIABLES (9)
Variáveis disponíveis para todas os projetos do tipo ADAPTER.
Scopes: EC DES-sandbox
SIABM-AUTENTICACAO-24HORAS-DES-Sandbox (26)
Grupo de variáveis de SIABM-AUTENTICACAO-24HORAS-DES
Scopes: EC DES-sandbox
SIABM-AUTENTICACAO-24HORAS-BT-VAULT-SANDBOX-DES (3)
WO0000080286256
Scopes: EC DES-sandbox
SIABM-AUTENTICACAO-24HORAS-HMP (1)
Grupo de variáveis de SIABM-AUTENTICACAO-24HORAS-HMP
Scopes: EC HMP
OKD-4-APL (12)
Scopes: EC PRD
SIABM-AUTENTICACAO-24HORAS-PRD (18)
Grupo de variáveis de SIABM-AUTENTICACAO-24HORAS-PRD
Scopes: EC PRD
SIABM-AUTENTICACAO-24HORAS-BT-VAULT-PRD (3)
SIABM-AUTENTICACAO-24HORAS-BT-VAULT-PRD
Scopes: EC PRD
|Manage variable groups
Row 2

Showing filters 1 through 2


