Skip to main content
projetos
/
Caixa
/
Pipelines
/
Releases
/
SICBP-avaliarisco-backend
/
SICBP-avaliarisco-backend-0.0.0.43(4)
Search








SICBP-avaliarisco-backend

SICBP-avaliarisco-backend-0.0.0.43(4)


EC TQS

Succeeded


Pipeline

Tasks

Variables

Logs

Tests
Agent job
Started: 23/09/2026, 10:59:11
Pool:
Release-Linux
·
Agent: cadsvaprlx071.intra.caixa.gov.br

2m 52s

Initialize job
·
succeeded
1s

Download Artifacts
·
succeeded
1 warning
<1s

Recuperando nome do repositório
·
succeeded
2s

Convertendo Minúsculo e Definindo nome do Projeto/Repositório
·
succeeded
<1s

Git clone https://devops.caixa/projetos/Infraestrutura/_git/esteira-logs
·
succeeded
1s

Cria Streams Graylog
·
succeeded
2s

Recupera VEC
·
succeeded
2s

VEC - Aferição
·
succeeded
<1s

Login OpenShift
·
succeeded
1s

Exportando Variáveis de Ambiente "_ENV."
·
succeeded
1s

Criando novo Projeto
·
succeeded
3s

Adicionando ISTIO_INJECTION
·
skipped


Criando nova APP
·
succeeded
1s

Atualizando Variáveis de Ambiente
·
succeeded
3s

Criando Rota Customizada
·
succeeded
<1s

Aplicando Service Mesh
·
skipped


Exporta Variáveis de Ambiente "_SECRET."
·
succeeded
<1s

Alterando valores placeholder no exec_secret.sh
·
succeeded
<1s

Criando Secrets
·
succeeded
1s

Vinculando Secrets
·
succeeded
1s

Adicionando Multiplas Secrets
·
succeeded
<1s

Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP
·
succeeded
21s

Concedendo Acesso OKD
·
succeeded
1s

Verificando IP de Saída
·
succeeded
1s

Configurando IP de Saída - deployment
·
skipped


Configurando IP de Saída - deploymentconfig
·
succeeded
1s

Cadastrando no Portal IIF
·
succeeded
1s

Verificando Status do Deployment
·
succeeded
1m 16s

Logs da Aplicação
·
succeeded
1s

Resumo da Release
·
succeeded
1s

Coletando dados da imagem
·
succeeded
34s

Atualizando versão no PortalIF
·
succeeded
<1s

Realizando Logout OKD
·
succeeded
1s

Finalize Job
·
succeeded
<1s
Showing filters 1 through 2

List item selected

Showing 13 deployments

Row 2

EC TQSDeploy release

Row 2

Row 2

Row 2



Skip to main content
projetos
/
Caixa
/
Pipelines
/
Releases
/
SICBP-avaliarisco-backend
/
SICBP-avaliarisco-backend-0.0.0.43(4)
Search








SICBP-avaliarisco-backend

SICBP-avaliarisco-backend-0.0.0.43(4)


EC TQS
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
Scopes: EC DES,EC TQS,EC HMP
SICBP-AVALIARISCO-BACKEND-DES (5)
Grupo de variáveis de SICBP-AVALIARISCO-BACKEND-DES
Scopes: EC DES
SICBP-COMMON-BACKEND-DES (45)
SICBP-COMMON-BACKEND-DES
Scopes: EC DES
CLIENT_SECRET
********
CLIENT_SECRET_INTRANET
********
CLIENT_SECRET_SERVICO
********
ORACLE_PASS
********
SICBP-COMMON
SICBP_API_KEY
********
_ENV.AMBIENTE
NACIONAL
_ENV.API_IDENTIFICACAO_POSITIVA_BASE_PATH
https://sicbp-correspondentes-api-des.apps.nprd.caixa
_ENV.API_IDENTIFICACAO_POSITIVA_DISABLED
true
_ENV.API_IDENTIFICACAO_POSITIVA_IGNORE_PATHS
_ENV.API_MANAGER_URL
https://api.des.caixa:8443
_ENV.API_TRILHA_BASEPATH
https://sicbp-trilha-api-des.apps.nprd.caixa
_ENV.APPLICATIONINSIGHTS_CONNECTION_STRING
"InstrumentationKey=b0142390-50c9-495e-85b4-7b2ade8fc1cf;IngestionEndpoint=https://brazilsoutheast-0.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsoutheast.livediagnostics.monitor.azure.com/"
_ENV.APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
INFO
_ENV.APPLICATIONINSIGHTS_PROXY
http://proxydes.caixa:80
_ENV.APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
100
_ENV.APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL
INFO
_ENV.BLOCK_OBJECT_TYPE
TRUE
_ENV.CLIENT_ID
cli-ser-cbp
_ENV.CLIENT_ID_INTRANET
cli-ser-cbp
_ENV.DATASOURCE_JDBC_URL
jdbc:oracle:thin:@cnpexdadvm01-scan8.extra.caixa.gov.br:1521/orad01bc
_ENV.ENABLE_SWAGGER
FALSE
_ENV.FLAG_CERTIFICADO_DIGITAL
false
_ENV.MESSAGE_ERRORS_COMPLETE
FALSE
_ENV.ORACLE_CONNECTIONTIMEOUT
30000
_ENV.ORACLE_IDLETIMEOUT
900000
_ENV.ORACLE_KEEPALIVETIME
0
_ENV.ORACLE_MAXIMUMPOOLSIZE
60
_ENV.ORACLE_MAXLIFETIME
1800000
_ENV.ORACLE_MINIMUMIDLE
3
_ENV.ORACLE_SHOW_SQL
false
_ENV.ORACLE_USER
SCBPDS01
_ENV.SITAE_OFFLINE
TRUE
_ENV.SPRING_PROFILES_ACTIVE
development
_ENV.SSL_VERIFICATION_DISABLED
true
_ENV.SSO_ISSUER_INTERNET
https://logindes.caixa.gov.br/auth/realms/internet
_ENV.SSO_ISSUER_INTRANET
https://login.des.caixa/auth/realms/intranet
_ENV.SSO_URL
https://logindes.caixa.gov.br
_ENV.SSO_URL_INTRANET
https://login.des.caixa
_ENV.SSO_URL_LOGIN2
https://login2des.caixa.gov.br
_SECRET.CLIENT_SECRET
#{CLIENT_SECRET}#
_SECRET.CLIENT_SECRET_INTRANET
#{CLIENT_SECRET_INTRANET}#
_SECRET.CLIENT_SECRET_SERVICO
#{CLIENT_SECRET_SERVICO}#
_SECRET.ORACLE_PASS
#{ORACLE_PASS}#
_SECRET.SICBP_API_KEY
#{SICBP_API_KEY}#
SICBP-AVALIARISCO-BACKEND-TQS (5)
Grupo de variáveis de SICBP-AVALIARISCO-BACKEND-TQS
Scopes: EC TQS
ADAPTER_VARIABLES (9)
Variáveis disponíveis para todas os projetos do tipo ADAPTER.
Scopes: EC TQS
SICBP-COMMON-BACKEND-TQS (45)
SICBP-COMMON-BACKEND-TQS
Scopes: EC TQS
CLIENT_SECRET
********
CLIENT_SECRET_INTRANET
********
CLIENT_SECRET_SERVICO
********
ORACLE_PASS
********
SICBP-COMMON
SICBP_API_KEY
********
_ENV.AMBIENTE
NACIONAL
_ENV.API_IDENTIFICACAO_POSITIVA_BASE_PATH
https://sicbp-correspondentes-api-des.apps.nprd.caixa
_ENV.API_IDENTIFICACAO_POSITIVA_DISABLED
true
_ENV.API_IDENTIFICACAO_POSITIVA_IGNORE_PATHS
_ENV.API_MANAGER_URL
https://api.des.caixa:8443
_ENV.API_TRILHA_BASEPATH
https://sicbp-trilha-api-des.apps.nprd.caixa
_ENV.APPLICATIONINSIGHTS_CONNECTION_STRING
"InstrumentationKey=b0142390-50c9-495e-85b4-7b2ade8fc1cf;IngestionEndpoint=https://brazilsoutheast-0.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsoutheast.livediagnostics.monitor.azure.com/"
_ENV.APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
INFO
_ENV.APPLICATIONINSIGHTS_PROXY
http://proxydes.caixa:80
_ENV.APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
100
_ENV.APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL
INFO
_ENV.BLOCK_OBJECT_TYPE
TRUE
_ENV.CLIENT_ID
cli-ser-cbp
_ENV.CLIENT_ID_INTRANET
cli-ser-cbp
_ENV.DATASOURCE_JDBC_URL
jdbc:oracle:thin:@cnpexdadvm01-scan8.extra.caixa.gov.br:1521/orad01bc
_ENV.ENABLE_SWAGGER
FALSE
_ENV.FLAG_CERTIFICADO_DIGITAL
false
_ENV.MESSAGE_ERRORS_COMPLETE
FALSE
_ENV.ORACLE_CONNECTIONTIMEOUT
30000
_ENV.ORACLE_IDLETIMEOUT
900000
_ENV.ORACLE_KEEPALIVETIME
0
_ENV.ORACLE_MAXIMUMPOOLSIZE
60
_ENV.ORACLE_MAXLIFETIME
1800000
_ENV.ORACLE_MINIMUMIDLE
3
_ENV.ORACLE_SHOW_SQL
false
_ENV.ORACLE_USER
SCBPDS01
_ENV.SITAE_OFFLINE
FALSE
_ENV.SPRING_PROFILES_ACTIVE
production
_ENV.SSL_VERIFICATION_DISABLED
true
_ENV.SSO_ISSUER_INTERNET
https://logindes.caixa.gov.br/auth/realms/internet
_ENV.SSO_ISSUER_INTRANET
https://login.des.caixa/auth/realms/intranet
_ENV.SSO_URL
https://logindes.caixa.gov.br
_ENV.SSO_URL_INTRANET
https://login.des.caixa
_ENV.SSO_URL_LOGIN2
https://login2des.caixa.gov.br
_SECRET.CLIENT_SECRET
#{CLIENT_SECRET}#
_SECRET.CLIENT_SECRET_INTRANET
#{CLIENT_SECRET_INTRANET}#
_SECRET.CLIENT_SECRET_SERVICO
#{CLIENT_SECRET_SERVICO}#
_SECRET.ORACLE_PASS
#{ORACLE_PASS}#
_SECRET.SICBP_API_KEY
#{SICBP_API_KEY}#
SICBP-AVALIARISCO-BACKEND-HMP (1)
Grupo de variáveis de SICBP-AVALIARISCO-BACKEND-HMP
Scopes: EC HMP
OKD-4-APL (12)
Scopes: EC PRD
SICBP-AVALIARISCO-BACKEND-PRD (1)
Grupo de variáveis de SICBP-AVALIARISCO-BACKEND-PRD
Scopes: EC PRD
Showing filters 1 through 2

List item selected

Showing 13 deployments

Row 2

EC TQSDeploy release

Row 2

Row 2

Row 2

Showing filters 1 through 2

s´oadicnei esse grupo de variavesiSICBP-COMMON-BACKEND-TQS (45)


deploy em tqs com sucesso
