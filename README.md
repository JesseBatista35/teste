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
SISOU-sac-okd
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
SISOU

SISOU-sac-okd
Download secure file
Task version
1.*
Display name
Download secure file
Secure File
caixa-truststore-acteste-nprd-sisou-20261126.jks
Retry Count
8
Socket Timeout

Control Options
Output Variables
Showing filters 1 through 2

Showing 26 deployments

Row 2

Row 2

Row 3

Row 14

Showing filters 1 through 2

Showing filters 1 through 2

1 pipelines found

Row 2

Row 2

Showing filters 1 through 2

Expanded

Collapsed

Task disabled

Task added


Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
/
Library
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

Library

SISOU-SAC-OKD-DES

Variable group
Properties
Variable group name
SISOU-SAC-OKD-DES
Description
Grupo de variáveis de SISOU-SAC-OKD-DES


Variables
_ENV.KEYCLOAK_AUTH_SERVER_URL
https://login.des.caixa/auth
DATASOURCE_CONNECTION_URL
jdbc:oracle:thin:@oracle-nprd-1000.caixa:1521/prim_D01NGSRV
DATASOURCE_JNDI_NAME
java:/jdbc/OracleSisouDS
DATASOURCE_MAX_POOL_SIZE
40
DATASOURCE_MIN_POOL_SIZE
2
DATASOURCE_PASSWORD
********
DATASOURCE_POOL_NAME
OracleSisouDS
DATASOURCE_USER_NAME
SSOUDB03
JVM_HEAP_MAX
2048m
JVM_HEAP_MIN
1024m
JVM_METASPACE_MAX
512m
JVM_METASPACE_MIN
96m
JVM_PASSWORD_TRUSTSTORE
********
JVM_PROXY_HOST
proxydes.caixa
JVM_PROXY_PORT
80
JVM_TRUSTSTORE
caixa-truststore-acteste-nprd-sisou-20261126.jks
KEYCLOAK_AUTH_SERVER_URL
https://login.des.caixa/auth
KEYCLOAK_BEARER_ONLY
true
KEYCLOAK_CREDENTIAL_SECRET
********
KEYCLOAK_REALM
intranet
KEYCLOAK_RESOURCE
cli-ser-sou
KEYCLOAK_SSL_REQUIRED
EXTERNAL
LEVEL_LOG
DEBUG
SECURE_DEPLOYMENT
sisou-sac-api.war
SISOU-CONSUMIDOR_GOV_CLIENT_ID
20140206000002000
SISOU-CONSUMIDOR_GOV_CLIENT_SECRET
********
SISOU-CONSUMIDOR_GOV_CODE
********
SISOU-CONSUMIDOR_GOV_CPF_AUTORIZADO
********
SISOU-CONSUMIDOR_GOV_GRANT_TYPE
client_credentials
SISOU-CONSUMIDOR_GOV_HOST
api-treinamento.consumidor.gov.br
SISOU-CONSUMIDOR_GOV_URL_API
https://api-treinamento.consumidor.gov.br/api/servico/
SISOU-CONSUMIDOR_GOV_USER_AGENT
api-consumidor
SISOU-CONSUMIDOR_GOV_VERSAO
1.0
SISOU-EMAIL_ENVIO_RECURSO_BACEN
gtrja.deati@bcb.gov.br
SISOU-INDECX_ACTION_ID_TEMPLATE
********
SISOU-INDECX_COMPANY_KEY
********
SISOU-INDECX_URL_API
https://indecx.com
SISOU-INT_API_KEY
l7f5b8a9e462a14e56a0f7feab3992f33a
SISOU-INT_B2B_CORREIOS
ssourd01
SISOU-INT_IP_SERV_GED
${env.HOSTIP:10.116.222.199}
SISOU-INT_SEN_BACEN
Senha123
SISOU-INT_URL_API_MANAGER
https://api.des.caixa:8443/
SISOU-INT_URL_GED
https://siecm.des.caixa/siecm-web/ECM
SISOU-RECLAME_AQUI_SECRET
a3cab9ea-a6fc-4ad3-89d0-e17a8b2bf17b
SISOU-RECLAME_AQUI_USER
3080
SISOU-REMETENTE_INT
vivavoz@caixa.gov.br
SISOU-REMETENTE_OUV
ouvidoria@caixa.gov.br
SISOU-REMETENTE_SAC
sac@caixa.gov.br
SISOU-SEC_TEMPO_MAX_IDLE
60
SISOU-SEC_TEMPO_VIDA_TOKEN
5
SISOU-SIBKO_CANAL
17
SISOU-SIBKO_CATEGORIA
245
SISOU-SUFIXO_EMAIL_CAIXA
@corp.caixa.gov.br
SISOU-URL_API_B2B
https://resolve.b2b.des.corerj.caixa/v1/uploadinterno?
SISOU-URL_API_RECLAME_AQUI
https://app.hugme.com.br:443
SISOU-URL_FRONTEND
https://sisou-front-des.apps.nprd.caixa
SISOU-URL_RESPOSTA_IA
https://teams.microsoft.com/l/app/?source=app-header-share-entrypoint&amp;titleId=T_e4cc0d78-e8f8-d7b5-b058-bbb73b7ff73a&amp;message=
SMTP_PORT
25
SMTP_URL
smtptest.correiolivre.caixa


troquei aqui


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
SISOU-sac-okd
/
SISOU-sac-okd-2.7.0.16-SNAPSHOT(2)
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
SISOU-sac-okd

SISOU-sac-okd-2.7.0.16-SNAPSHOT(2)


EC DES

In progress


Pipeline

Tasks

Variables

Logs

Tests
Agent job
Started: 26/11/2026, 10:48:42
Pool:
Release-Linux-OKD4
·
Agent: azp-ads-agent-release-5cd876f98-zxzcb
21s

Initialize job
·
succeeded
<1s

Pre-job: Download secure file
·
succeeded
<1s

Pre-job: Download secure file
·
succeeded
<1s

Download Artifacts
·
succeeded
1 warning

<1s

Exportando as variáveis do arquivo Trust Store
·
succeeded
<1s

Valida Variáveis Obrigatórias
·
succeeded
<1s

Recuperando URL Pacote Nexus
·
succeeded
3s

Recupera Pacote
·
succeeded
1s

Recuperando nome do repositório
·
succeeded
1s

Convertendo Minúsculo e Definindo nome do Projeto/Repositório
·
succeeded
<1s

Corrigindo Codificação Arquivos dos2unix
·
succeeded
<1s

Alterando Valores placeholders nos arquivos de config
·
succeeded
<1s

Git clone https://devops.caixa/projetos/Infraestrutura/_git/esteira-logs
·
succeeded
<1s

Cria Streams Graylog
·
succeeded
3s

Recupera VEC
·
succeeded
1s

VEC - Aferição
·
succeeded
1 warning
<1s

Login OpenShift
·
succeeded
<1s

Exportando Variáveis de Ambiente "_ENV."
·
succeeded
<1s

Criando novo Projeto
·
succeeded
<1s

Adicionando ISTIO_INJECTION
·
skipped


Criando nova APP
·
succeeded
<1s

Atualizando Variáveis de Ambiente
·
succeeded
<1s

Criando Rota Customizada
·
succeeded
<1s

Aplicando Service Mesh
·
skipped


Excluindo Secret ACcaixav4
·
succeeded
<1s

Criando o Secret ACcaixav4
·
succeeded
<1s

Adicionando Multiplas Secrets
·
succeeded
1s

Excluindo ConfigMap jboss-config
·
succeeded
<1s

Excluindo ConfigMap java-config
·
succeeded
<1s

Criando o ConfigMap jboss-config
·
succeeded
<1s

Criando o ConfigMap java-config
·
succeeded
<1s

Configurando o ConfigMap jboss-config
·
pending

Configurando o ConfigMap java-config
·
pending

Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP
·
pending

Concedendo Acesso OKD
·
pending

Verificando IP de Saída
·
pending

Configurando IP de Saída - deployment
·
pending

Configurando IP de Saída - deploymentconfig
·
pending

Cadastrando no Portal IIF
·
pending

Verificando Status do Deployment
·
pending

Logs da Aplicação
·
pending

Resumo da Release
·
pending

Coletando dados da imagem
·
pending

Atualizando versão no PortalIF
·
pending

Realizando Logout OKD
·
pending
Showing filters 1 through 2

Showing 26 deployments

Row 3

Row 14

Showing filters 1 through 2

Showing filters 1 through 2

1 pipelines found

Row 2

Row 2

Showing filters 1 through 2

Expanded

Collapsed

Task disabled

Task added

Showing filters 1 through 2

Showing 26 deployments

Row 2

Row 2


estou rodnao a release>>

me ajdau co m os cmondaso para vlaidar no pod
