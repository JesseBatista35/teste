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




/opt/jboss/bin/standalone.conf: line 37: =org.jboss.byteman: command not found
=========================================================================

  JBoss Bootstrap Environment

  JBOSS_HOME: /opt/jboss

  JAVA: /usr/lib/jvm/jre-17-openjdk-17.0.7.0.7-3.el8.x86_64/bin/java

  JAVA_OPTS:  -Xlog:gc*:file="/opt/jboss/standalone/log/gc.log":time,uptimemillis:filecount=5,filesize=3M -Djdk.serialFilter="maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000" -Xms1024m -Xmx2048m -XX:MetaspaceSize=96m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs= -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd-sisou-20261126.jks -Djavax.net.ssl.trustStorePassword=changeit -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar:/opt/jboss/modules/system/layers/base/org/jboss/log4j/logmanager/main/log4j-jboss-logmanager-1.2.0.Final-redhat-00001.jar:/opt/jboss/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Dsun.util.logging.disableCallerCheck=true -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -Djava.net.useSystemProxies=false -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=localhost\|127.0.0.1\|*.caixa  --add-exports=java.base/sun.nio.ch=ALL-UNNAMED --add-exports=jdk.unsupported/sun.misc=ALL-UNNAMED --add-exports=jdk.unsupported/sun.reflect=ALL-UNNAMED --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED

=========================================================================

Nov 26, 2026 10:49:32 AM java.lang.System$LoggerFinder lambda$accessProvider$0
WARNING: Failed to instantiate LoggerFinder provider; Using default.
[0m10:49:32,954 INFO  [org.jboss.modules] (main) JBoss Modules version 1.12.2.Final-redhat-00001
[0m[0m10:49:33,569 INFO  [org.jboss.msc] (main) JBoss MSC version 1.4.12.Final-redhat-00001
[0m[0m10:49:33,578 INFO  [org.jboss.threads] (main) JBoss Threads version 2.4.0.Final-redhat-00001
[0m[0m10:49:33,762 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0049: JBoss EAP 7.4.14.GA (WildFly Core 15.0.32.Final-redhat-00001) starting
[0m[0m10:49:33,887 INFO  [org.jboss.vfs] (MSC service thread 1-2) VFS000002: Failed to clean existing content for temp file provider of type temp. Enable DEBUG level log to find what caused this
[0m[0m10:49:35,461 INFO  [org.wildfly.security] (ServerService Thread Pool -- 28) ELY00001: WildFly Elytron version 1.15.20.Final-redhat-00001
[0m[0m10:49:37,689 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 6) WFLYDR0001: Content added at location /opt/jboss/standalone/data/content/be/d328925408cee177cd65516874dce45a8ca654/content
[0m[0m10:49:37,755 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Creating http management service using socket-binding (management-http)
[0m[0m10:49:37,763 INFO  [org.xnio] (MSC service thread 1-1) XNIO version 3.8.11.SP1-redhat-00001
[0m[0m10:49:37,766 INFO  [org.xnio.nio] (MSC service thread 1-1) XNIO NIO Implementation Version 3.8.11.SP1-redhat-00001
[0m[0m10:49:37,853 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 50) WFLYCLINF0001: Activating Infinispan subsystem.
[0m[33m10:49:37,855 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 68) WFLYTX0013: The node-identifier attribute on the /subsystem=transactions is set to the default value. This is a danger for environments running multiple servers. Please make sure the attribute value is unique.
[0m[0m10:49:37,855 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 51) WFLYIO001: Worker 'default' has auto-configured to 2 IO threads with 16 max task threads based on your 1 available processors
[0m[0m10:49:37,856 INFO  [org.wildfly.extension.health] (ServerService Thread Pool -- 49) WFLYHEALTH0001: Activating Base Health Subsystem
[0m[0m10:49:37,949 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 52) WFLYRS0016: RESTEasy version 3.15.8.Final-redhat-00001
[0m[0m10:49:37,949 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 61) WFLYNAM0001: Activating Naming Subsystem
[0m[0m10:49:37,951 INFO  [org.jboss.as.jsf] (ServerService Thread Pool -- 57) WFLYJSF0007: Activated the following Jakarta Server Faces Implementations: [main]
[0m[0m10:49:37,954 INFO  [org.jboss.as.webservices] (ServerService Thread Pool -- 70) WFLYWS0002: Activating WebServices Extension
[0m[0m10:49:37,957 INFO  [org.jboss.remoting] (MSC service thread 1-2) JBoss Remoting version 5.0.27.Final-redhat-00001
[0m[0m10:49:38,048 INFO  [org.wildfly.extension.metrics] (ServerService Thread Pool -- 60) WFLYMETRICS0001: Activating Base Metrics Subsystem
[0m[0m10:49:38,155 INFO  [org.jboss.as.connector] (MSC service thread 1-2) WFLYJCA0009: Starting Jakarta Connectors Subsystem (WildFly/IronJacamar 1.5.15.Final-redhat-00001)
[0m[0m10:49:38,454 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 41) WFLYJCA0004: Deploying JDBC-compliant driver class oracle.jdbc.OracleDriver (version 12.1)
[0m[0m10:49:38,552 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 69) WFLYUT0014: Creating file handler for path '/opt/jboss/welcome-content' with options [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
[0m[0m10:49:38,553 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 41) WFLYJCA0004: Deploying JDBC-compliant driver class org.h2.Driver (version 1.4)
[0m[0m10:49:38,553 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0003: Undertow 2.2.28.SP1-redhat-00001 starting
[0m[0m10:49:38,658 INFO  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0482: Strict pool mdb-strict-max-pool is using a max instance size of 4 (per class), which is derived from the number of CPUs on this host.
[0m[0m10:49:38,659 INFO  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0481: Strict pool slsb-strict-max-pool is using a max instance size of 16 (per class), which is derived from thread worker pool sizing.
[0m[0m10:49:38,659 INFO  [org.jboss.as.naming] (MSC service thread 1-2) WFLYNAM0003: Starting Naming Service
[0m[0m10:49:38,749 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-2) WFLYJCA0018: Started Driver service with driver-name = oracle
[0m[0m10:49:38,749 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-2) WFLYJCA0018: Started Driver service with driver-name = h2
[0m[0m10:49:38,768 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-2) WFLYMAIL0001: Bound mail session [java:jboss/mail/Default]
[0m[0m10:49:38,768 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-2) WFLYMAIL0001: Bound mail session [java:jboss/mail/sisou]
[0m[33m10:49:39,052 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-2) WFLYELY00023: KeyStore file '/opt/jboss/standalone/configuration/application.keystore' does not exist. Used blank.
[0m[33m10:49:39,268 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-2) WFLYELY01084: KeyStore /opt/jboss/standalone/configuration/application.keystore not found, it will be auto generated on first use with a self-signed certificate for host localhost
[0m[0m10:49:39,270 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0012: Started server default-server.
[0m[0m10:49:39,349 INFO  [org.jboss.as.patching] (MSC service thread 1-2) WFLYPAT0050: JBoss EAP cumulative patch ID is: jboss-eap-7.4.14.CP, one-off patches include: none
[0m[0m10:49:39,561 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0006: Undertow HTTP listener default listening on 0.0.0.0:8080
[0m[0m10:49:39,563 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) Queuing requests.
[0m[0m10:49:39,564 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0018: Host default-host starting
[0m[0m10:49:39,598 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0027: Starting deployment of "sisou-sac-okd.ear" (runtime-name: "sisou-sac-okd.ear")
[0m[0m10:49:39,600 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-1) WFLYDS0013: Started FileSystemDeploymentService for directory /opt/jboss/standalone/deployments
[0m[0m10:49:39,650 INFO  [org.jboss.as.ejb3] (MSC service thread 1-1) WFLYEJB0493: Jakarta Enterprise Beans subsystem suspension complete
[0m[0m10:49:39,666 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0006: Undertow HTTPS listener https listening on 0.0.0.0:8443
[0m[0m10:49:40,075 INFO  [org.jboss.ws.common.management] (MSC service thread 1-2) JBWS022052: Starting JBossWS 5.4.9.Final-redhat-00001 (Apache CXF 3.4.10.redhat-00001) 
[0m[0m10:49:40,154 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-2) WFLYJCA0001: Bound data source [java:jboss/jdbc/sisouDS]
[0m[0m10:49:40,154 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-2) WFLYJCA0001: Bound data source [java:/jdbc/OracleSisouDS]
[0m[33m10:49:43,464 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0059: Class Path entry oraclepki.jar in /content/sisou-sac-okd.ear/lib/ojdbc8.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m10:49:43,464 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0059: Class Path entry hk2.jar in /content/sisou-sac-okd.ear/lib/ha-api.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m10:49:43,465 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0059: Class Path entry hk2-core.jar in /content/sisou-sac-okd.ear/lib/ha-api.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m10:49:43,465 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0059: Class Path entry class-model.jar in /content/sisou-sac-okd.ear/lib/ha-api.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m10:49:43,465 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0059: Class Path entry config.jar in /content/sisou-sac-okd.ear/lib/ha-api.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m10:49:43,465 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0059: Class Path entry tiger-types.jar in /content/sisou-sac-okd.ear/lib/ha-api.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m10:49:43,465 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0059: Class Path entry bean-validator.jar in /content/sisou-sac-okd.ear/lib/ha-api.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m10:49:43,465 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0059: Class Path entry jtype.jar in /content/sisou-sac-okd.ear/lib/ha-api.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m10:49:43,465 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0059: Class Path entry auto-depends.jar in /content/sisou-sac-okd.ear/lib/ha-api.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m10:49:43,465 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0059: Class Path entry javax.inject.jar in /content/sisou-sac-okd.ear/lib/ha-api.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m10:49:43,465 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0059: Class Path entry asm-all-repackaged.jar in /content/sisou-sac-okd.ear/lib/ha-api.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m10:49:43,465 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0059: Class Path entry hk2-api.jar in /content/sisou-sac-okd.ear/lib/ha-api.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m10:49:43,466 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0059: Class Path entry osgi-resource-locator.jar in /content/sisou-sac-okd.ear/lib/ha-api.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m10:49:43,466 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0059: Class Path entry javax.inject.jar in /content/sisou-sac-okd.ear/lib/ha-api.jar  does not point to a valid jar for a Class-Path reference.
[0m[0m10:49:43,476 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0207: Starting subdeployment (runtime-name: "sisou-sac-api.war")
[0m[33m10:49:50,924 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0001: /content/sisou-sac-okd.ear/sisou-sac-api.war/WEB-INF/jboss-deployment-structure.xml in subdeployment ignored. jboss-deployment-structure.xml is only parsed for top level deployments.
[0m[33m10:49:51,098 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0059: Class Path entry oraclepki.jar in /content/sisou-sac-okd.ear/sisou-sac-api.war/WEB-INF/lib/ojdbc8-19.28.0.0.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m10:49:51,102 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0059: Class Path entry hk2.jar in /content/sisou-sac-okd.ear/sisou-sac-api.war/WEB-INF/lib/ha-api-3.1.12.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m10:49:51,102 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0059: Class Path entry hk2-core.jar in /content/sisou-sac-okd.ear/sisou-sac-api.war/WEB-INF/lib/ha-api-3.1.12.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m10:49:51,102 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0059: Class Path entry class-model.jar in /content/sisou-sac-okd.ear/sisou-sac-api.war/WEB-INF/lib/ha-api-3.1.12.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m10:49:51,102 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0059: Class Path entry config.jar in /content/sisou-sac-okd.ear/sisou-sac-api.war/WEB-INF/lib/ha-api-3.1.12.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m10:49:51,102 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0059: Class Path entry tiger-types.jar in /content/sisou-sac-okd.ear/sisou-sac-api.war/WEB-INF/lib/ha-api-3.1.12.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m10:49:51,148 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0059: Class Path entry bean-validator.jar in /content/sisou-sac-okd.ear/sisou-sac-api.war/WEB-INF/lib/ha-api-3.1.12.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m10:49:51,148 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0059: Class Path entry jtype.jar in /content/sisou-sac-okd.ear/sisou-sac-api.war/WEB-INF/lib/ha-api-3.1.12.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m10:49:51,148 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0059: Class Path entry auto-depends.jar in /content/sisou-sac-okd.ear/sisou-sac-api.war/WEB-INF/lib/ha-api-3.1.12.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m10:49:51,148 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0059: Class Path entry javax.inject.jar in /content/sisou-sac-okd.ear/sisou-sac-api.war/WEB-INF/lib/ha-api-3.1.12.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m10:49:51,148 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0059: Class Path entry asm-all-repackaged.jar in /content/sisou-sac-okd.ear/sisou-sac-api.war/WEB-INF/lib/ha-api-3.1.12.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m10:49:51,148 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0059: Class Path entry hk2-api.jar in /content/sisou-sac-okd.ear/sisou-sac-api.war/WEB-INF/lib/ha-api-3.1.12.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m10:49:51,148 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0059: Class Path entry osgi-resource-locator.jar in /content/sisou-sac-okd.ear/sisou-sac-api.war/WEB-INF/lib/ha-api-3.1.12.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m10:49:51,148 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0059: Class Path entry javax.inject.jar in /content/sisou-sac-okd.ear/sisou-sac-api.war/WEB-INF/lib/ha-api-3.1.12.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m10:49:51,765 WARN  [org.jboss.weld.deployer] (MSC service thread 1-1) WFLYWELD0018: Found both WEB-INF/beans.xml and WEB-INF/classes/META-INF/beans.xml. It is not portable to use both locations at the same time. Weld is going to use the former location for this deployment.
[0m[0m10:49:51,771 INFO  [org.jboss.as.jpa] (MSC service thread 1-1) WFLYJPA0002: Read persistence.xml for sisouDB
[0m[33m10:49:52,363 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-2) WFLYSRV0018: Deployment "deployment.sisou-sac-okd.ear.sisou-sac-api.war" is using a private module ("org.apache.httpcomponents") which may be changed or removed in future versions without notice.
[0m[0m10:49:52,371 INFO  [org.jipijapa] (MSC service thread 1-1) JIPIORMV53020253: Second level cache enabled for sisou-sac-okd.ear/sisou-sac-api.war#sisouDB
[0m[0m10:49:52,475 INFO  [org.jboss.weld.deployer] (MSC service thread 1-1) WFLYWELD0003: Processing weld deployment sisou-sac-okd.ear
[0m[0m10:49:52,674 INFO  [org.hibernate.validator.internal.util.Version] (MSC service thread 1-1) HV000001: Hibernate Validator 6.0.23.Final-redhat-00001
[0m[0m10:49:53,251 INFO  [org.infinispan.CONTAINER] (ServerService Thread Pool -- 73) ISPN000128: Infinispan version: Infinispan 'Corona Extra' 11.0.18.Final-redhat-00001
[0m[0m10:49:53,362 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 74) WFLYJPA0010: Starting Persistence Unit (phase 1 of 2) Service 'sisou-sac-okd.ear/sisou-sac-api.war#sisouDB'
[0m[0m10:49:53,364 INFO  [org.infinispan.CONFIG] (MSC service thread 1-2) ISPN000152: Passivation configured without an eviction policy being selected. Only manually evicted entities will be passivated.
[0m[0m10:49:53,365 INFO  [org.infinispan.CONFIG] (MSC service thread 1-2) ISPN000152: Passivation configured without an eviction policy being selected. Only manually evicted entities will be passivated.
[0m[0m10:49:53,452 INFO  [org.hibernate.jpa.internal.util.LogHelper] (ServerService Thread Pool -- 74) HHH000204: Processing PersistenceUnitInfo [
	name: sisouDB
	...]
[0m[0m10:49:53,570 INFO  [org.infinispan.PERSISTENCE] (ServerService Thread Pool -- 73) ISPN000556: Starting user marshaller 'org.wildfly.clustering.infinispan.spi.marshalling.InfinispanProtoStreamMarshaller'
[0m[0m10:49:53,574 INFO  [org.hibernate.Version] (ServerService Thread Pool -- 74) HHH000412: Hibernate Core {5.3.32.Final-redhat-00001}
[0m[0m10:49:53,649 INFO  [org.hibernate.cfg.Environment] (ServerService Thread Pool -- 74) HHH000206: hibernate.properties not found
[0m[0m10:49:54,063 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 73) WFLYCLINF0002: Started http-remoting-connector cache from ejb container
[0m[0m10:49:54,066 INFO  [org.hibernate.annotations.common.Version] (ServerService Thread Pool -- 74) HCANN000001: Hibernate Commons Annotations {5.0.5.Final-redhat-00002}
[0m[0m10:49:54,959 INFO  [org.jboss.keycloak] (MSC service thread 1-1) Keycloak subsystem override for deployment sisou-sac-api.war
[0m[0m10:49:54,960 INFO  [org.jboss.weld.deployer] (MSC service thread 1-1) WFLYWELD0003: Processing weld deployment sisou-sac-api.war
[0m[0m10:49:55,156 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MatrizArquivoCartaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/MatrizArquivoCartaAS!br.gov.caixa.bsb.sisou.core.correios.MatrizArquivoCartaAS
	java:app/sisou-sac-api/MatrizArquivoCartaAS!br.gov.caixa.bsb.sisou.core.correios.MatrizArquivoCartaAS
	java:module/MatrizArquivoCartaAS!br.gov.caixa.bsb.sisou.core.correios.MatrizArquivoCartaAS
	java:global/sisou-sac-okd/sisou-sac-api/MatrizArquivoCartaAS
	java:app/sisou-sac-api/MatrizArquivoCartaAS
	java:module/MatrizArquivoCartaAS

[0m[0m10:49:55,156 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ProdutoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ProdutoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ProdutoAS
	java:app/sisou-sac-api/ProdutoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ProdutoAS
	java:module/ProdutoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ProdutoAS
	java:global/sisou-sac-okd/sisou-sac-api/ProdutoAS
	java:app/sisou-sac-api/ProdutoAS
	java:module/ProdutoAS

[0m[0m10:49:55,156 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PerguntaRespostaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PerguntaRespostaAS!br.gov.caixa.bsb.sisou.core.ajuda.PerguntaRespostaAS
	java:app/sisou-sac-api/PerguntaRespostaAS!br.gov.caixa.bsb.sisou.core.ajuda.PerguntaRespostaAS
	java:module/PerguntaRespostaAS!br.gov.caixa.bsb.sisou.core.ajuda.PerguntaRespostaAS
	java:global/sisou-sac-okd/sisou-sac-api/PerguntaRespostaAS
	java:app/sisou-sac-api/PerguntaRespostaAS
	java:module/PerguntaRespostaAS

[0m[0m10:49:55,156 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PerguntaAvaliacaoConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PerguntaAvaliacaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.PerguntaAvaliacaoConverter
	java:app/sisou-sac-api/PerguntaAvaliacaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.PerguntaAvaliacaoConverter
	java:module/PerguntaAvaliacaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.PerguntaAvaliacaoConverter
	java:global/sisou-sac-okd/sisou-sac-api/PerguntaAvaliacaoConverter
	java:app/sisou-sac-api/PerguntaAvaliacaoConverter
	java:module/PerguntaAvaliacaoConverter

[0m[0m10:49:55,156 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'RelatorioAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/RelatorioAS!br.gov.caixa.arquitetura.javaee.core.relatorio.RelatorioAS
	java:app/sisou-sac-api/RelatorioAS!br.gov.caixa.arquitetura.javaee.core.relatorio.RelatorioAS
	java:module/RelatorioAS!br.gov.caixa.arquitetura.javaee.core.relatorio.RelatorioAS
	java:global/sisou-sac-okd/sisou-sac-api/RelatorioAS
	java:app/sisou-sac-api/RelatorioAS
	java:module/RelatorioAS

[0m[0m10:49:55,156 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'NotificacaoOcorrenciaExternaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/NotificacaoOcorrenciaExternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.NotificacaoOcorrenciaExternaAS
	java:app/sisou-sac-api/NotificacaoOcorrenciaExternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.NotificacaoOcorrenciaExternaAS
	java:module/NotificacaoOcorrenciaExternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.NotificacaoOcorrenciaExternaAS
	java:global/sisou-sac-okd/sisou-sac-api/NotificacaoOcorrenciaExternaAS
	java:app/sisou-sac-api/NotificacaoOcorrenciaExternaAS
	java:module/NotificacaoOcorrenciaExternaAS

[0m[0m10:49:55,156 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'LoteCorrespondenciaCartaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/LoteCorrespondenciaCartaAS!br.gov.caixa.bsb.sisou.core.correios.LoteCorrespondenciaCartaAS
	java:app/sisou-sac-api/LoteCorrespondenciaCartaAS!br.gov.caixa.bsb.sisou.core.correios.LoteCorrespondenciaCartaAS
	java:module/LoteCorrespondenciaCartaAS!br.gov.caixa.bsb.sisou.core.correios.LoteCorrespondenciaCartaAS
	java:global/sisou-sac-okd/sisou-sac-api/LoteCorrespondenciaCartaAS
	java:app/sisou-sac-api/LoteCorrespondenciaCartaAS
	java:module/LoteCorrespondenciaCartaAS

[0m[0m10:49:55,157 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ConsoleProtalExternoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ConsoleProtalExternoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ConsoleProtalExternoAS
	java:app/sisou-sac-api/ConsoleProtalExternoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ConsoleProtalExternoAS
	java:module/ConsoleProtalExternoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ConsoleProtalExternoAS
	java:global/sisou-sac-okd/sisou-sac-api/ConsoleProtalExternoAS
	java:app/sisou-sac-api/ConsoleProtalExternoAS
	java:module/ConsoleProtalExternoAS

[0m[0m10:49:55,157 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ClassificacaoOcorrenciaExternaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ClassificacaoOcorrenciaExternaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ClassificacaoOcorrenciaExternaAS
	java:app/sisou-sac-api/ClassificacaoOcorrenciaExternaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ClassificacaoOcorrenciaExternaAS
	java:module/ClassificacaoOcorrenciaExternaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ClassificacaoOcorrenciaExternaAS
	java:global/sisou-sac-okd/sisou-sac-api/ClassificacaoOcorrenciaExternaAS
	java:app/sisou-sac-api/ClassificacaoOcorrenciaExternaAS
	java:module/ClassificacaoOcorrenciaExternaAS

[0m[0m10:49:55,157 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TipoAtendimentoZeroOitocentosConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TipoAtendimentoZeroOitocentosConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.TipoAtendimentoZeroOitocentosConverter
	java:app/sisou-sac-api/TipoAtendimentoZeroOitocentosConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.TipoAtendimentoZeroOitocentosConverter
	java:module/TipoAtendimentoZeroOitocentosConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.TipoAtendimentoZeroOitocentosConverter
	java:global/sisou-sac-okd/sisou-sac-api/TipoAtendimentoZeroOitocentosConverter
	java:app/sisou-sac-api/TipoAtendimentoZeroOitocentosConverter
	java:module/TipoAtendimentoZeroOitocentosConverter

[0m[0m10:49:55,157 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'AnexoOcorrenciaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/AnexoOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.AnexoOcorrenciaConverter
	java:app/sisou-sac-api/AnexoOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.AnexoOcorrenciaConverter
	java:module/AnexoOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.AnexoOcorrenciaConverter
	java:global/sisou-sac-okd/sisou-sac-api/AnexoOcorrenciaConverter
	java:app/sisou-sac-api/AnexoOcorrenciaConverter
	java:module/AnexoOcorrenciaConverter

[0m[0m10:49:55,157 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ErroPlataformaGovernoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ErroPlataformaGovernoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ErroPlataformaGovernoAS
	java:app/sisou-sac-api/ErroPlataformaGovernoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ErroPlataformaGovernoAS
	java:module/ErroPlataformaGovernoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ErroPlataformaGovernoAS
	java:global/sisou-sac-okd/sisou-sac-api/ErroPlataformaGovernoAS
	java:app/sisou-sac-api/ErroPlataformaGovernoAS
	java:module/ErroPlataformaGovernoAS

[0m[0m10:49:55,157 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'SolicitacaoUnidadeConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/SolicitacaoUnidadeConverter!br.gov.caixa.bsb.sisou.core.comum.converter.solicitacao.SolicitacaoUnidadeConverter
	java:app/sisou-sac-api/SolicitacaoUnidadeConverter!br.gov.caixa.bsb.sisou.core.comum.converter.solicitacao.SolicitacaoUnidadeConverter
	java:module/SolicitacaoUnidadeConverter!br.gov.caixa.bsb.sisou.core.comum.converter.solicitacao.SolicitacaoUnidadeConverter
	java:global/sisou-sac-okd/sisou-sac-api/SolicitacaoUnidadeConverter
	java:app/sisou-sac-api/SolicitacaoUnidadeConverter
	java:module/SolicitacaoUnidadeConverter

[0m[0m10:49:55,157 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TipoOcorrenciaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TipoOcorrenciaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoOcorrenciaAS
	java:app/sisou-sac-api/TipoOcorrenciaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoOcorrenciaAS
	java:module/TipoOcorrenciaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoOcorrenciaAS
	java:global/sisou-sac-okd/sisou-sac-api/TipoOcorrenciaAS
	java:app/sisou-sac-api/TipoOcorrenciaAS
	java:module/TipoOcorrenciaAS

[0m[0m10:49:55,157 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PerguntaOcorrenciaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PerguntaOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PerguntaOcorrenciaAS
	java:app/sisou-sac-api/PerguntaOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PerguntaOcorrenciaAS
	java:module/PerguntaOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PerguntaOcorrenciaAS
	java:global/sisou-sac-okd/sisou-sac-api/PerguntaOcorrenciaAS
	java:app/sisou-sac-api/PerguntaOcorrenciaAS
	java:module/PerguntaOcorrenciaAS

[0m[0m10:49:55,158 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PenalidadeSacOuvAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PenalidadeSacOuvAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.PenalidadeSacOuvAS
	java:app/sisou-sac-api/PenalidadeSacOuvAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.PenalidadeSacOuvAS
	java:module/PenalidadeSacOuvAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.PenalidadeSacOuvAS
	java:global/sisou-sac-okd/sisou-sac-api/PenalidadeSacOuvAS
	java:app/sisou-sac-api/PenalidadeSacOuvAS
	java:module/PenalidadeSacOuvAS

[0m[0m10:49:55,158 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ContatoRespostaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ContatoRespostaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.ContatoRespostaConverter
	java:app/sisou-sac-api/ContatoRespostaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.ContatoRespostaConverter
	java:module/ContatoRespostaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.ContatoRespostaConverter
	java:global/sisou-sac-okd/sisou-sac-api/ContatoRespostaConverter
	java:app/sisou-sac-api/ContatoRespostaConverter
	java:module/ContatoRespostaConverter

[0m[0m10:49:55,158 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'UsuarioUnidadeAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/UsuarioUnidadeAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.UsuarioUnidadeAS
	java:app/sisou-sac-api/UsuarioUnidadeAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.UsuarioUnidadeAS
	java:module/UsuarioUnidadeAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.UsuarioUnidadeAS
	java:global/sisou-sac-okd/sisou-sac-api/UsuarioUnidadeAS
	java:app/sisou-sac-api/UsuarioUnidadeAS
	java:module/UsuarioUnidadeAS

[0m[0m10:49:55,158 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MarcarOcorrenciaComoLida' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/MarcarOcorrenciaComoLida!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.MarcarOcorrenciaComoLida
	java:app/sisou-sac-api/MarcarOcorrenciaComoLida!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.MarcarOcorrenciaComoLida
	java:module/MarcarOcorrenciaComoLida!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.MarcarOcorrenciaComoLida
	java:global/sisou-sac-okd/sisou-sac-api/MarcarOcorrenciaComoLida
	java:app/sisou-sac-api/MarcarOcorrenciaComoLida
	java:module/MarcarOcorrenciaComoLida

[0m[0m10:49:55,158 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PenalidadeTarefaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PenalidadeTarefaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PenalidadeTarefaAS
	java:app/sisou-sac-api/PenalidadeTarefaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PenalidadeTarefaAS
	java:module/PenalidadeTarefaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PenalidadeTarefaAS
	java:global/sisou-sac-okd/sisou-sac-api/PenalidadeTarefaAS
	java:app/sisou-sac-api/PenalidadeTarefaAS
	java:module/PenalidadeTarefaAS

[0m[0m10:49:55,158 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MotivoAvaliacaoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/MotivoAvaliacaoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.MotivoAvaliacaoAS
	java:app/sisou-sac-api/MotivoAvaliacaoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.MotivoAvaliacaoAS
	java:module/MotivoAvaliacaoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.MotivoAvaliacaoAS
	java:global/sisou-sac-okd/sisou-sac-api/MotivoAvaliacaoAS
	java:app/sisou-sac-api/MotivoAvaliacaoAS
	java:module/MotivoAvaliacaoAS

[0m[0m10:49:55,158 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'OcorrenciaInternaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaInternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.OcorrenciaInternaConverter
	java:app/sisou-sac-api/OcorrenciaInternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.OcorrenciaInternaConverter
	java:module/OcorrenciaInternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.OcorrenciaInternaConverter
	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaInternaConverter
	java:app/sisou-sac-api/OcorrenciaInternaConverter
	java:module/OcorrenciaInternaConverter

[0m[0m10:49:55,158 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TransmissaoArquivoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TransmissaoArquivoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.TransmissaoArquivoAS
	java:app/sisou-sac-api/TransmissaoArquivoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.TransmissaoArquivoAS
	java:module/TransmissaoArquivoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.TransmissaoArquivoAS
	java:global/sisou-sac-okd/sisou-sac-api/TransmissaoArquivoAS
	java:app/sisou-sac-api/TransmissaoArquivoAS
	java:module/TransmissaoArquivoAS

[0m[0m10:49:55,159 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ProrrogacaoTarefaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ProrrogacaoTarefaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ProrrogacaoTarefaAS
	java:app/sisou-sac-api/ProrrogacaoTarefaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ProrrogacaoTarefaAS
	java:module/ProrrogacaoTarefaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ProrrogacaoTarefaAS
	java:global/sisou-sac-okd/sisou-sac-api/ProrrogacaoTarefaAS
	java:app/sisou-sac-api/ProrrogacaoTarefaAS
	java:module/ProrrogacaoTarefaAS

[0m[0m10:49:55,159 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'JustificativaMovimentacaoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/JustificativaMovimentacaoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.JustificativaMovimentacaoAS
	java:app/sisou-sac-api/JustificativaMovimentacaoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.JustificativaMovimentacaoAS
	java:module/JustificativaMovimentacaoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.JustificativaMovimentacaoAS
	java:global/sisou-sac-okd/sisou-sac-api/JustificativaMovimentacaoAS
	java:app/sisou-sac-api/JustificativaMovimentacaoAS
	java:module/JustificativaMovimentacaoAS

[0m[0m10:49:55,159 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'OcorrenciaInternaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaInternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaInternaAS
	java:app/sisou-sac-api/OcorrenciaInternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaInternaAS
	java:module/OcorrenciaInternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaInternaAS
	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaInternaAS
	java:app/sisou-sac-api/OcorrenciaInternaAS
	java:module/OcorrenciaInternaAS

[0m[0m10:49:55,159 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'AvaliacaoOcorrenciaExternaNovoConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/AvaliacaoOcorrenciaExternaNovoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.AvaliacaoOcorrenciaExternaNovoConverter
	java:app/sisou-sac-api/AvaliacaoOcorrenciaExternaNovoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.AvaliacaoOcorrenciaExternaNovoConverter
	java:module/AvaliacaoOcorrenciaExternaNovoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.AvaliacaoOcorrenciaExternaNovoConverter
	java:global/sisou-sac-okd/sisou-sac-api/AvaliacaoOcorrenciaExternaNovoConverter
	java:app/sisou-sac-api/AvaliacaoOcorrenciaExternaNovoConverter
	java:module/AvaliacaoOcorrenciaExternaNovoConverter

[0m[0m10:49:55,159 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'EnvioRespostaComArquivoAoBacenAs' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/EnvioRespostaComArquivoAoBacenAs!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.EnvioRespostaComArquivoAoBacenAs
	java:app/sisou-sac-api/EnvioRespostaComArquivoAoBacenAs!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.EnvioRespostaComArquivoAoBacenAs
	java:module/EnvioRespostaComArquivoAoBacenAs!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.EnvioRespostaComArquivoAoBacenAs
	java:global/sisou-sac-okd/sisou-sac-api/EnvioRespostaComArquivoAoBacenAs
	java:app/sisou-sac-api/EnvioRespostaComArquivoAoBacenAs
	java:module/EnvioRespostaComArquivoAoBacenAs

[0m[0m10:49:55,159 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TerceirizadoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TerceirizadoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TerceirizadoAS
	java:app/sisou-sac-api/TerceirizadoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TerceirizadoAS
	java:module/TerceirizadoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TerceirizadoAS
	java:global/sisou-sac-okd/sisou-sac-api/TerceirizadoAS
	java:app/sisou-sac-api/TerceirizadoAS
	java:module/TerceirizadoAS

[0m[0m10:49:55,160 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'SolicitacaoUnidadeAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/SolicitacaoUnidadeAS!br.gov.caixa.bsb.sisou.core.solicitacao.SolicitacaoUnidadeAS
	java:app/sisou-sac-api/SolicitacaoUnidadeAS!br.gov.caixa.bsb.sisou.core.solicitacao.SolicitacaoUnidadeAS
	java:module/SolicitacaoUnidadeAS!br.gov.caixa.bsb.sisou.core.solicitacao.SolicitacaoUnidadeAS
	java:global/sisou-sac-okd/sisou-sac-api/SolicitacaoUnidadeAS
	java:app/sisou-sac-api/SolicitacaoUnidadeAS
	java:module/SolicitacaoUnidadeAS

[0m[0m10:49:55,160 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'OcorrenciaBloqueadaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaBloqueadaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaBloqueadaAS
	java:app/sisou-sac-api/OcorrenciaBloqueadaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaBloqueadaAS
	java:module/OcorrenciaBloqueadaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaBloqueadaAS
	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaBloqueadaAS
	java:app/sisou-sac-api/OcorrenciaBloqueadaAS
	java:module/OcorrenciaBloqueadaAS

[0m[0m10:49:55,160 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'NotificacaoOcorrenciaExternaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/NotificacaoOcorrenciaExternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.notificacao.NotificacaoOcorrenciaExternaConverter
	java:app/sisou-sac-api/NotificacaoOcorrenciaExternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.notificacao.NotificacaoOcorrenciaExternaConverter
	java:module/NotificacaoOcorrenciaExternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.notificacao.NotificacaoOcorrenciaExternaConverter
	java:global/sisou-sac-okd/sisou-sac-api/NotificacaoOcorrenciaExternaConverter
	java:app/sisou-sac-api/NotificacaoOcorrenciaExternaConverter
	java:module/NotificacaoOcorrenciaExternaConverter

[0m[0m10:49:55,160 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PostoAtendimentoProconAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PostoAtendimentoProconAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.PostoAtendimentoProconAS
	java:app/sisou-sac-api/PostoAtendimentoProconAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.PostoAtendimentoProconAS
	java:module/PostoAtendimentoProconAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.PostoAtendimentoProconAS
	java:global/sisou-sac-okd/sisou-sac-api/PostoAtendimentoProconAS
	java:app/sisou-sac-api/PostoAtendimentoProconAS
	java:module/PostoAtendimentoProconAS

[0m[0m10:49:55,160 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MovimentacaoOcorrenciaInternaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/MovimentacaoOcorrenciaInternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.tratarocorrencia.MovimentacaoOcorrenciaInternaConverter
	java:app/sisou-sac-api/MovimentacaoOcorrenciaInternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.tratarocorrencia.MovimentacaoOcorrenciaInternaConverter
	java:module/MovimentacaoOcorrenciaInternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.tratarocorrencia.MovimentacaoOcorrenciaInternaConverter
	java:global/sisou-sac-okd/sisou-sac-api/MovimentacaoOcorrenciaInternaConverter
	java:app/sisou-sac-api/MovimentacaoOcorrenciaInternaConverter
	java:module/MovimentacaoOcorrenciaInternaConverter

[0m[0m10:49:55,160 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PreOcorrenciaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PreOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PreOcorrenciaAS
	java:app/sisou-sac-api/PreOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PreOcorrenciaAS
	java:module/PreOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PreOcorrenciaAS
	java:global/sisou-sac-okd/sisou-sac-api/PreOcorrenciaAS
	java:app/sisou-sac-api/PreOcorrenciaAS
	java:module/PreOcorrenciaAS

[0m[0m10:49:55,161 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'SubsidioOcorrenciaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/SubsidioOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.SubsidioOcorrenciaAS
	java:app/sisou-sac-api/SubsidioOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.SubsidioOcorrenciaAS
	java:module/SubsidioOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.SubsidioOcorrenciaAS
	java:global/sisou-sac-okd/sisou-sac-api/SubsidioOcorrenciaAS
	java:app/sisou-sac-api/SubsidioOcorrenciaAS
	java:module/SubsidioOcorrenciaAS

[0m[0m10:49:55,161 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'UnidadeBloqueadaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/UnidadeBloqueadaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.UnidadeBloqueadaAS
	java:app/sisou-sac-api/UnidadeBloqueadaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.UnidadeBloqueadaAS
	java:module/UnidadeBloqueadaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.UnidadeBloqueadaAS
	java:global/sisou-sac-okd/sisou-sac-api/UnidadeBloqueadaAS
	java:app/sisou-sac-api/UnidadeBloqueadaAS
	java:module/UnidadeBloqueadaAS

[0m[0m10:49:55,161 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'IntegracaoOutcomingSisouBacenAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/IntegracaoOutcomingSisouBacenAS!br.gov.caixa.bsb.sisou.core.integracao.bacen.IIntegracaoOutcomingSisouBacenAs
	java:app/sisou-sac-api/IntegracaoOutcomingSisouBacenAS!br.gov.caixa.bsb.sisou.core.integracao.bacen.IIntegracaoOutcomingSisouBacenAs
	java:module/IntegracaoOutcomingSisouBacenAS!br.gov.caixa.bsb.sisou.core.integracao.bacen.IIntegracaoOutcomingSisouBacenAs
	java:global/sisou-sac-okd/sisou-sac-api/IntegracaoOutcomingSisouBacenAS
	java:app/sisou-sac-api/IntegracaoOutcomingSisouBacenAS
	java:module/IntegracaoOutcomingSisouBacenAS

[0m[0m10:49:55,161 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MensagemEmailAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/MensagemEmailAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.MensagemEmailAS
	java:app/sisou-sac-api/MensagemEmailAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.MensagemEmailAS
	java:module/MensagemEmailAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.MensagemEmailAS
	java:global/sisou-sac-okd/sisou-sac-api/MensagemEmailAS
	java:app/sisou-sac-api/MensagemEmailAS
	java:module/MensagemEmailAS

[0m[0m10:49:55,161 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'LoteCorrespondenciaInconsistenciaCartaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/LoteCorrespondenciaInconsistenciaCartaAS!br.gov.caixa.bsb.sisou.core.correios.LoteCorrespondenciaInconsistenciaCartaAS
	java:app/sisou-sac-api/LoteCorrespondenciaInconsistenciaCartaAS!br.gov.caixa.bsb.sisou.core.correios.LoteCorrespondenciaInconsistenciaCartaAS
	java:module/LoteCorrespondenciaInconsistenciaCartaAS!br.gov.caixa.bsb.sisou.core.correios.LoteCorrespondenciaInconsistenciaCartaAS
	java:global/sisou-sac-okd/sisou-sac-api/LoteCorrespondenciaInconsistenciaCartaAS
	java:app/sisou-sac-api/LoteCorrespondenciaInconsistenciaCartaAS
	java:module/LoteCorrespondenciaInconsistenciaCartaAS

[0m[0m10:49:55,161 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'SituacaoPortalExternoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/SituacaoPortalExternoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.SituacaoPortalExternoAS
	java:app/sisou-sac-api/SituacaoPortalExternoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.SituacaoPortalExternoAS
	java:module/SituacaoPortalExternoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.SituacaoPortalExternoAS
	java:global/sisou-sac-okd/sisou-sac-api/SituacaoPortalExternoAS
	java:app/sisou-sac-api/SituacaoPortalExternoAS
	java:module/SituacaoPortalExternoAS

[0m[0m10:49:55,161 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TipoFormatoRespostaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TipoFormatoRespostaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoFormatoRespostaAS
	java:app/sisou-sac-api/TipoFormatoRespostaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoFormatoRespostaAS
	java:module/TipoFormatoRespostaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoFormatoRespostaAS
	java:global/sisou-sac-okd/sisou-sac-api/TipoFormatoRespostaAS
	java:app/sisou-sac-api/TipoFormatoRespostaAS
	java:module/TipoFormatoRespostaAS

[0m[0m10:49:55,161 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'EmailUtil' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/EmailUtil!br.gov.caixa.arquitetura.javaee.core.comum.util.EmailUtil
	java:app/sisou-sac-api/EmailUtil!br.gov.caixa.arquitetura.javaee.core.comum.util.EmailUtil
	java:module/EmailUtil!br.gov.caixa.arquitetura.javaee.core.comum.util.EmailUtil
	java:global/sisou-sac-okd/sisou-sac-api/EmailUtil
	java:app/sisou-sac-api/EmailUtil
	java:module/EmailUtil

[0m[0m10:49:55,161 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PerguntaRespostaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PerguntaRespostaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ajuda.PerguntaRespostaConverter
	java:app/sisou-sac-api/PerguntaRespostaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ajuda.PerguntaRespostaConverter
	java:module/PerguntaRespostaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ajuda.PerguntaRespostaConverter
	java:global/sisou-sac-okd/sisou-sac-api/PerguntaRespostaConverter
	java:app/sisou-sac-api/PerguntaRespostaConverter
	java:module/PerguntaRespostaConverter

[0m[0m10:49:55,162 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'SolicitarProrrogacaoPrazoIntegracaoBacenAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/SolicitarProrrogacaoPrazoIntegracaoBacenAS!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.SolicitarProrrogacaoPrazoIntegracaoBacenAS
	java:app/sisou-sac-api/SolicitarProrrogacaoPrazoIntegracaoBacenAS!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.SolicitarProrrogacaoPrazoIntegracaoBacenAS
	java:module/SolicitarProrrogacaoPrazoIntegracaoBacenAS!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.SolicitarProrrogacaoPrazoIntegracaoBacenAS
	java:global/sisou-sac-okd/sisou-sac-api/SolicitarProrrogacaoPrazoIntegracaoBacenAS
	java:app/sisou-sac-api/SolicitarProrrogacaoPrazoIntegracaoBacenAS
	java:module/SolicitarProrrogacaoPrazoIntegracaoBacenAS

[0m[0m10:49:55,162 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ErroPlataformaPrivadoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ErroPlataformaPrivadoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ErroPlataformaPrivadoAS
	java:app/sisou-sac-api/ErroPlataformaPrivadoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ErroPlataformaPrivadoAS
	java:module/ErroPlataformaPrivadoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ErroPlataformaPrivadoAS
	java:global/sisou-sac-okd/sisou-sac-api/ErroPlataformaPrivadoAS
	java:app/sisou-sac-api/ErroPlataformaPrivadoAS
	java:module/ErroPlataformaPrivadoAS

[0m[0m10:49:55,162 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ItemConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ItemConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ItemConverter
	java:app/sisou-sac-api/ItemConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ItemConverter
	java:module/ItemConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ItemConverter
	java:global/sisou-sac-okd/sisou-sac-api/ItemConverter
	java:app/sisou-sac-api/ItemConverter
	java:module/ItemConverter

[0m[0m10:49:55,162 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'OcorrenciaPedidoClienteConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaPedidoClienteConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.OcorrenciaPedidoClienteConverter
	java:app/sisou-sac-api/OcorrenciaPedidoClienteConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.OcorrenciaPedidoClienteConverter
	java:module/OcorrenciaPedidoClienteConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.OcorrenciaPedidoClienteConverter
	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaPedidoClienteConverter
	java:app/sisou-sac-api/OcorrenciaPedidoClienteConverter
	java:module/OcorrenciaPedidoClienteConverter

[0m[0m10:49:55,162 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'SolicitacaoOcorrenciaInternaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/SolicitacaoOcorrenciaInternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.SolicitacaoOcorrenciaInternaAS
	java:app/sisou-sac-api/SolicitacaoOcorrenciaInternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.SolicitacaoOcorrenciaInternaAS
	java:module/SolicitacaoOcorrenciaInternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.SolicitacaoOcorrenciaInternaAS
	java:global/sisou-sac-okd/sisou-sac-api/SolicitacaoOcorrenciaInternaAS
	java:app/sisou-sac-api/SolicitacaoOcorrenciaInternaAS
	java:module/SolicitacaoOcorrenciaInternaAS

[0m[0m10:49:55,162 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'EmailTemplateOuvidoriaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/EmailTemplateOuvidoriaAS!br.gov.caixa.bsb.sisou.core.comum.EmailTemplateOuvidoriaAS
	java:app/sisou-sac-api/EmailTemplateOuvidoriaAS!br.gov.caixa.bsb.sisou.core.comum.EmailTemplateOuvidoriaAS
	java:module/EmailTemplateOuvidoriaAS!br.gov.caixa.bsb.sisou.core.comum.EmailTemplateOuvidoriaAS
	java:global/sisou-sac-okd/sisou-sac-api/EmailTemplateOuvidoriaAS
	java:app/sisou-sac-api/EmailTemplateOuvidoriaAS
	java:module/EmailTemplateOuvidoriaAS

[0m[0m10:49:55,162 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'OcorrenciaOuvidoriaWSAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaOuvidoriaWSAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaOuvidoriaWSAS
	java:app/sisou-sac-api/OcorrenciaOuvidoriaWSAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaOuvidoriaWSAS
	java:module/OcorrenciaOuvidoriaWSAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaOuvidoriaWSAS
	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaOuvidoriaWSAS
	java:app/sisou-sac-api/OcorrenciaOuvidoriaWSAS
	java:module/OcorrenciaOuvidoriaWSAS

[0m[0m10:49:55,162 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TipoMensagemSMSAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TipoMensagemSMSAS!br.gov.caixa.bsb.sisou.core.sms.TipoMensagemSMSAS
	java:app/sisou-sac-api/TipoMensagemSMSAS!br.gov.caixa.bsb.sisou.core.sms.TipoMensagemSMSAS
	java:module/TipoMensagemSMSAS!br.gov.caixa.bsb.sisou.core.sms.TipoMensagemSMSAS
	java:global/sisou-sac-okd/sisou-sac-api/TipoMensagemSMSAS
	java:app/sisou-sac-api/TipoMensagemSMSAS
	java:module/TipoMensagemSMSAS

[0m[0m10:49:55,162 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TarefaSacAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TarefaSacAS!br.gov.caixa.bsb.sisou.core.ocorrencia.TarefaSacAS
	java:app/sisou-sac-api/TarefaSacAS!br.gov.caixa.bsb.sisou.core.ocorrencia.TarefaSacAS
	java:module/TarefaSacAS!br.gov.caixa.bsb.sisou.core.ocorrencia.TarefaSacAS
	java:global/sisou-sac-okd/sisou-sac-api/TarefaSacAS
	java:app/sisou-sac-api/TarefaSacAS
	java:module/TarefaSacAS

[0m[0m10:49:55,163 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PenalidadeAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PenalidadeAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.PenalidadeAS
	java:app/sisou-sac-api/PenalidadeAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.PenalidadeAS
	java:module/PenalidadeAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.PenalidadeAS
	java:global/sisou-sac-okd/sisou-sac-api/PenalidadeAS
	java:app/sisou-sac-api/PenalidadeAS
	java:module/PenalidadeAS

[0m[0m10:49:55,163 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'AvaliacaoNaturezaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/AvaliacaoNaturezaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.AvaliacaoNaturezaConverter
	java:app/sisou-sac-api/AvaliacaoNaturezaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.AvaliacaoNaturezaConverter
	java:module/AvaliacaoNaturezaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.AvaliacaoNaturezaConverter
	java:global/sisou-sac-okd/sisou-sac-api/AvaliacaoNaturezaConverter
	java:app/sisou-sac-api/AvaliacaoNaturezaConverter
	java:module/AvaliacaoNaturezaConverter

[0m[0m10:49:55,163 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'DiarioBordoConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/DiarioBordoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.DiarioBordoConverter
	java:app/sisou-sac-api/DiarioBordoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.DiarioBordoConverter
	java:module/DiarioBordoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.DiarioBordoConverter
	java:global/sisou-sac-okd/sisou-sac-api/DiarioBordoConverter
	java:app/sisou-sac-api/DiarioBordoConverter
	java:module/DiarioBordoConverter

[0m[0m10:49:55,163 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'AvaliacaoOcorrenciaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/AvaliacaoOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.AvaliacaoOcorrenciaAS
	java:app/sisou-sac-api/AvaliacaoOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.AvaliacaoOcorrenciaAS
	java:module/AvaliacaoOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.AvaliacaoOcorrenciaAS
	java:global/sisou-sac-okd/sisou-sac-api/AvaliacaoOcorrenciaAS
	java:app/sisou-sac-api/AvaliacaoOcorrenciaAS
	java:module/AvaliacaoOcorrenciaAS

[0m[0m10:49:55,163 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ReclameAquiIntegracaoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ReclameAquiIntegracaoAS!br.gov.caixa.bsb.sisou.core.integracao.reclameAqui.ReclameAquiIntegracaoAS
	java:app/sisou-sac-api/ReclameAquiIntegracaoAS!br.gov.caixa.bsb.sisou.core.integracao.reclameAqui.ReclameAquiIntegracaoAS
	java:module/ReclameAquiIntegracaoAS!br.gov.caixa.bsb.sisou.core.integracao.reclameAqui.ReclameAquiIntegracaoAS
	java:global/sisou-sac-okd/sisou-sac-api/ReclameAquiIntegracaoAS
	java:app/sisou-sac-api/ReclameAquiIntegracaoAS
	java:module/ReclameAquiIntegracaoAS

[0m[0m10:49:55,163 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TrabalhoEquipeAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TrabalhoEquipeAS!br.gov.caixa.bsb.sisou.core.ocorrencia.TrabalhoEquipeAS
	java:app/sisou-sac-api/TrabalhoEquipeAS!br.gov.caixa.bsb.sisou.core.ocorrencia.TrabalhoEquipeAS
	java:module/TrabalhoEquipeAS!br.gov.caixa.bsb.sisou.core.ocorrencia.TrabalhoEquipeAS
	java:global/sisou-sac-okd/sisou-sac-api/TrabalhoEquipeAS
	java:app/sisou-sac-api/TrabalhoEquipeAS
	java:module/TrabalhoEquipeAS

[0m[0m10:49:55,163 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MotivoEncerramentoConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/MotivoEncerramentoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.MotivoEncerramentoConverter
	java:app/sisou-sac-api/MotivoEncerramentoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.MotivoEncerramentoConverter
	java:module/MotivoEncerramentoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.MotivoEncerramentoConverter
	java:global/sisou-sac-okd/sisou-sac-api/MotivoEncerramentoConverter
	java:app/sisou-sac-api/MotivoEncerramentoConverter
	java:module/MotivoEncerramentoConverter

[0m[0m10:49:55,163 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MovimentacaoSolicitacaoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/MovimentacaoSolicitacaoAS!br.gov.caixa.bsb.sisou.core.solicitacao.MovimentacaoSolicitacaoAS
	java:app/sisou-sac-api/MovimentacaoSolicitacaoAS!br.gov.caixa.bsb.sisou.core.solicitacao.MovimentacaoSolicitacaoAS
	java:module/MovimentacaoSolicitacaoAS!br.gov.caixa.bsb.sisou.core.solicitacao.MovimentacaoSolicitacaoAS
	java:global/sisou-sac-okd/sisou-sac-api/MovimentacaoSolicitacaoAS
	java:app/sisou-sac-api/MovimentacaoSolicitacaoAS
	java:module/MovimentacaoSolicitacaoAS

[0m[0m10:49:55,163 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TratamentoOcorrenciaInternaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TratamentoOcorrenciaInternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.tratarocorrencia.TratamentoOcorrenciaInternaConverter
	java:app/sisou-sac-api/TratamentoOcorrenciaInternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.tratarocorrencia.TratamentoOcorrenciaInternaConverter
	java:module/TratamentoOcorrenciaInternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.tratarocorrencia.TratamentoOcorrenciaInternaConverter
	java:global/sisou-sac-okd/sisou-sac-api/TratamentoOcorrenciaInternaConverter
	java:app/sisou-sac-api/TratamentoOcorrenciaInternaConverter
	java:module/TratamentoOcorrenciaInternaConverter

[0m[0m10:49:55,164 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TipoSolicitacaoOcorrenciaInternaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TipoSolicitacaoOcorrenciaInternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.TipoSolicitacaoOcorrenciaInternaAS
	java:app/sisou-sac-api/TipoSolicitacaoOcorrenciaInternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.TipoSolicitacaoOcorrenciaInternaAS
	java:module/TipoSolicitacaoOcorrenciaInternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.TipoSolicitacaoOcorrenciaInternaAS
	java:global/sisou-sac-okd/sisou-sac-api/TipoSolicitacaoOcorrenciaInternaAS
	java:app/sisou-sac-api/TipoSolicitacaoOcorrenciaInternaAS
	java:module/TipoSolicitacaoOcorrenciaInternaAS

[0m[0m10:49:55,164 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PaginaInicialSubsidiariaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PaginaInicialSubsidiariaAS!br.gov.caixa.bsb.sisou.core.subsidiaria.PaginaInicialSubsidiariaAS
	java:app/sisou-sac-api/PaginaInicialSubsidiariaAS!br.gov.caixa.bsb.sisou.core.subsidiaria.PaginaInicialSubsidiariaAS
	java:module/PaginaInicialSubsidiariaAS!br.gov.caixa.bsb.sisou.core.subsidiaria.PaginaInicialSubsidiariaAS
	java:global/sisou-sac-okd/sisou-sac-api/PaginaInicialSubsidiariaAS
	java:app/sisou-sac-api/PaginaInicialSubsidiariaAS
	java:module/PaginaInicialSubsidiariaAS

[0m[0m10:49:55,164 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'SituacaoOcorrenciaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/SituacaoOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.SituacaoOcorrenciaAS
	java:app/sisou-sac-api/SituacaoOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.SituacaoOcorrenciaAS
	java:module/SituacaoOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.SituacaoOcorrenciaAS
	java:global/sisou-sac-okd/sisou-sac-api/SituacaoOcorrenciaAS
	java:app/sisou-sac-api/SituacaoOcorrenciaAS
	java:module/SituacaoOcorrenciaAS

[0m[0m10:49:55,164 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'SolicitanteAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/SolicitanteAS!br.gov.caixa.bsb.sisou.core.ocorrencia.SolicitanteAS
	java:app/sisou-sac-api/SolicitanteAS!br.gov.caixa.bsb.sisou.core.ocorrencia.SolicitanteAS
	java:module/SolicitanteAS!br.gov.caixa.bsb.sisou.core.ocorrencia.SolicitanteAS
	java:global/sisou-sac-okd/sisou-sac-api/SolicitanteAS
	java:app/sisou-sac-api/SolicitanteAS
	java:module/SolicitanteAS

[0m[0m10:49:55,164 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MotivoAvaliacaoConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/MotivoAvaliacaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.MotivoAvaliacaoConverter
	java:app/sisou-sac-api/MotivoAvaliacaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.MotivoAvaliacaoConverter
	java:module/MotivoAvaliacaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.MotivoAvaliacaoConverter
	java:global/sisou-sac-okd/sisou-sac-api/MotivoAvaliacaoConverter
	java:app/sisou-sac-api/MotivoAvaliacaoConverter
	java:module/MotivoAvaliacaoConverter

[0m[0m10:49:55,164 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ParametroConsoleConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ParametroConsoleConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ParametroConsoleConverter
	java:app/sisou-sac-api/ParametroConsoleConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ParametroConsoleConverter
	java:module/ParametroConsoleConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ParametroConsoleConverter
	java:global/sisou-sac-okd/sisou-sac-api/ParametroConsoleConverter
	java:app/sisou-sac-api/ParametroConsoleConverter
	java:module/ParametroConsoleConverter

[0m[0m10:49:55,164 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'CartilhaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/CartilhaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ajuda.CartilhaConverter
	java:app/sisou-sac-api/CartilhaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ajuda.CartilhaConverter
	java:module/CartilhaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ajuda.CartilhaConverter
	java:global/sisou-sac-okd/sisou-sac-api/CartilhaConverter
	java:app/sisou-sac-api/CartilhaConverter
	java:module/CartilhaConverter

[0m[0m10:49:55,164 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ReaberturaOcorrenciaOuvidoriaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ReaberturaOcorrenciaOuvidoriaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.reaberturaocorrencia.ReaberturaOcorrenciaOuvidoriaConverter
	java:app/sisou-sac-api/ReaberturaOcorrenciaOuvidoriaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.reaberturaocorrencia.ReaberturaOcorrenciaOuvidoriaConverter
	java:module/ReaberturaOcorrenciaOuvidoriaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.reaberturaocorrencia.ReaberturaOcorrenciaOuvidoriaConverter
	java:global/sisou-sac-okd/sisou-sac-api/ReaberturaOcorrenciaOuvidoriaConverter
	java:app/sisou-sac-api/ReaberturaOcorrenciaOuvidoriaConverter
	java:module/ReaberturaOcorrenciaOuvidoriaConverter

[0m[0m10:49:55,164 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PosicionamentoexternoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PosicionamentoexternoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PosicionamentoexternoAS
	java:app/sisou-sac-api/PosicionamentoexternoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PosicionamentoexternoAS
	java:module/PosicionamentoexternoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PosicionamentoexternoAS
	java:global/sisou-sac-okd/sisou-sac-api/PosicionamentoexternoAS
	java:app/sisou-sac-api/PosicionamentoexternoAS
	java:module/PosicionamentoexternoAS

[0m[0m10:49:55,164 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TipoDirecionamentoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TipoDirecionamentoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoDirecionamentoAS
	java:app/sisou-sac-api/TipoDirecionamentoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoDirecionamentoAS
	java:module/TipoDirecionamentoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoDirecionamentoAS
	java:global/sisou-sac-okd/sisou-sac-api/TipoDirecionamentoAS
	java:app/sisou-sac-api/TipoDirecionamentoAS
	java:module/TipoDirecionamentoAS

[0m[0m10:49:55,165 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'EquipeUnidadeCaixaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/EquipeUnidadeCaixaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.EquipeUnidadeCaixaAS
	java:app/sisou-sac-api/EquipeUnidadeCaixaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.EquipeUnidadeCaixaAS
	java:module/EquipeUnidadeCaixaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.EquipeUnidadeCaixaAS
	java:global/sisou-sac-okd/sisou-sac-api/EquipeUnidadeCaixaAS
	java:app/sisou-sac-api/EquipeUnidadeCaixaAS
	java:module/EquipeUnidadeCaixaAS

[0m[0m10:49:55,165 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ReaberturaOcorrenciaSacConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ReaberturaOcorrenciaSacConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.reaberturaocorrencia.ReaberturaOcorrenciaSacConverter
	java:app/sisou-sac-api/ReaberturaOcorrenciaSacConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.reaberturaocorrencia.ReaberturaOcorrenciaSacConverter
	java:module/ReaberturaOcorrenciaSacConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.reaberturaocorrencia.ReaberturaOcorrenciaSacConverter
	java:global/sisou-sac-okd/sisou-sac-api/ReaberturaOcorrenciaSacConverter
	java:app/sisou-sac-api/ReaberturaOcorrenciaSacConverter
	java:module/ReaberturaOcorrenciaSacConverter

[0m[0m10:49:55,165 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'HabilitacaoEquipeTratamentoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/HabilitacaoEquipeTratamentoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.HabilitacaoEquipeTratamentoAS
	java:app/sisou-sac-api/HabilitacaoEquipeTratamentoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.HabilitacaoEquipeTratamentoAS
	java:module/HabilitacaoEquipeTratamentoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.HabilitacaoEquipeTratamentoAS
	java:global/sisou-sac-okd/sisou-sac-api/HabilitacaoEquipeTratamentoAS
	java:app/sisou-sac-api/HabilitacaoEquipeTratamentoAS
	java:module/HabilitacaoEquipeTratamentoAS

[0m[0m10:49:55,165 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'SolicitacaoOcorrenciaInternaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/SolicitacaoOcorrenciaInternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.SolicitacaoOcorrenciaInternaConverter
	java:app/sisou-sac-api/SolicitacaoOcorrenciaInternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.SolicitacaoOcorrenciaInternaConverter
	java:module/SolicitacaoOcorrenciaInternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.SolicitacaoOcorrenciaInternaConverter
	java:global/sisou-sac-okd/sisou-sac-api/SolicitacaoOcorrenciaInternaConverter
	java:app/sisou-sac-api/SolicitacaoOcorrenciaInternaConverter
	java:module/SolicitacaoOcorrenciaInternaConverter

[0m[0m10:49:55,165 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MotivoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/MotivoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.MotivoAS
	java:app/sisou-sac-api/MotivoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.MotivoAS
	java:module/MotivoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.MotivoAS
	java:global/sisou-sac-okd/sisou-sac-api/MotivoAS
	java:app/sisou-sac-api/MotivoAS
	java:module/MotivoAS

[0m[0m10:49:55,165 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ProblemaComunicacaoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ProblemaComunicacaoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ProblemaComunicacaoAS
	java:app/sisou-sac-api/ProblemaComunicacaoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ProblemaComunicacaoAS
	java:module/ProblemaComunicacaoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ProblemaComunicacaoAS
	java:global/sisou-sac-okd/sisou-sac-api/ProblemaComunicacaoAS
	java:app/sisou-sac-api/ProblemaComunicacaoAS
	java:module/ProblemaComunicacaoAS

[0m[0m10:49:55,165 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'GrupoTratamentoConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/GrupoTratamentoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.GrupoTratamentoConverter
	java:app/sisou-sac-api/GrupoTratamentoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.GrupoTratamentoConverter
	java:module/GrupoTratamentoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.GrupoTratamentoConverter
	java:global/sisou-sac-okd/sisou-sac-api/GrupoTratamentoConverter
	java:app/sisou-sac-api/GrupoTratamentoConverter
	java:module/GrupoTratamentoConverter

[0m[0m10:49:55,165 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'FaleConoscoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/FaleConoscoAS!br.gov.caixa.bsb.sisou.core.faleconosco.FaleConoscoAS
	java:app/sisou-sac-api/FaleConoscoAS!br.gov.caixa.bsb.sisou.core.faleconosco.FaleConoscoAS
	java:module/FaleConoscoAS!br.gov.caixa.bsb.sisou.core.faleconosco.FaleConoscoAS
	java:global/sisou-sac-okd/sisou-sac-api/FaleConoscoAS
	java:app/sisou-sac-api/FaleConoscoAS
	java:module/FaleConoscoAS

[0m[0m10:49:55,165 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TemplateConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TemplateConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.TemplateConverter
	java:app/sisou-sac-api/TemplateConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.TemplateConverter
	java:module/TemplateConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.TemplateConverter
	java:global/sisou-sac-okd/sisou-sac-api/TemplateConverter
	java:app/sisou-sac-api/TemplateConverter
	java:module/TemplateConverter

[0m[0m10:49:55,165 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'OrigemAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/OrigemAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.OrigemAS
	java:app/sisou-sac-api/OrigemAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.OrigemAS
	java:module/OrigemAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.OrigemAS
	java:global/sisou-sac-okd/sisou-sac-api/OrigemAS
	java:app/sisou-sac-api/OrigemAS
	java:module/OrigemAS

[0m[0m10:49:55,166 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MensagemSMSConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/MensagemSMSConverter!br.gov.caixa.bsb.sisou.core.comum.converter.sms.MensagemSMSConverter
	java:app/sisou-sac-api/MensagemSMSConverter!br.gov.caixa.bsb.sisou.core.comum.converter.sms.MensagemSMSConverter
	java:module/MensagemSMSConverter!br.gov.caixa.bsb.sisou.core.comum.converter.sms.MensagemSMSConverter
	java:global/sisou-sac-okd/sisou-sac-api/MensagemSMSConverter
	java:app/sisou-sac-api/MensagemSMSConverter
	java:module/MensagemSMSConverter

[0m[0m10:49:55,166 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'LoteReciboServicoRastreioCartaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/LoteReciboServicoRastreioCartaAS!br.gov.caixa.bsb.sisou.core.correios.LoteReciboServicoRastreioCartaAS
	java:app/sisou-sac-api/LoteReciboServicoRastreioCartaAS!br.gov.caixa.bsb.sisou.core.correios.LoteReciboServicoRastreioCartaAS
	java:module/LoteReciboServicoRastreioCartaAS!br.gov.caixa.bsb.sisou.core.correios.LoteReciboServicoRastreioCartaAS
	java:global/sisou-sac-okd/sisou-sac-api/LoteReciboServicoRastreioCartaAS
	java:app/sisou-sac-api/LoteReciboServicoRastreioCartaAS
	java:module/LoteReciboServicoRastreioCartaAS

[0m[0m10:49:55,166 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PriorizacaoDistribuicaoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PriorizacaoDistribuicaoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.PriorizacaoDistribuicaoAS
	java:app/sisou-sac-api/PriorizacaoDistribuicaoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.PriorizacaoDistribuicaoAS
	java:module/PriorizacaoDistribuicaoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.PriorizacaoDistribuicaoAS
	java:global/sisou-sac-okd/sisou-sac-api/PriorizacaoDistribuicaoAS
	java:app/sisou-sac-api/PriorizacaoDistribuicaoAS
	java:module/PriorizacaoDistribuicaoAS

[0m[0m10:49:55,166 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PainelEquipeOrigemAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PainelEquipeOrigemAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PainelEquipeOrigemAS
	java:app/sisou-sac-api/PainelEquipeOrigemAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PainelEquipeOrigemAS
	java:module/PainelEquipeOrigemAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PainelEquipeOrigemAS
	java:global/sisou-sac-okd/sisou-sac-api/PainelEquipeOrigemAS
	java:app/sisou-sac-api/PainelEquipeOrigemAS
	java:module/PainelEquipeOrigemAS

[0m[0m10:49:55,166 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'SituacaoArquivoCartaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/SituacaoArquivoCartaAS!br.gov.caixa.bsb.sisou.core.correios.SituacaoArquivoCartaAS
	java:app/sisou-sac-api/SituacaoArquivoCartaAS!br.gov.caixa.bsb.sisou.core.correios.SituacaoArquivoCartaAS
	java:module/SituacaoArquivoCartaAS!br.gov.caixa.bsb.sisou.core.correios.SituacaoArquivoCartaAS
	java:global/sisou-sac-okd/sisou-sac-api/SituacaoArquivoCartaAS
	java:app/sisou-sac-api/SituacaoArquivoCartaAS
	java:module/SituacaoArquivoCartaAS

[0m[0m10:49:55,166 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ProrrogacaoOcorrenciaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ProrrogacaoOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.ProrrogacaoOcorrenciaConverter
	java:app/sisou-sac-api/ProrrogacaoOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.ProrrogacaoOcorrenciaConverter
	java:module/ProrrogacaoOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.ProrrogacaoOcorrenciaConverter
	java:global/sisou-sac-okd/sisou-sac-api/ProrrogacaoOcorrenciaConverter
	java:app/sisou-sac-api/ProrrogacaoOcorrenciaConverter
	java:module/ProrrogacaoOcorrenciaConverter

[0m[0m10:49:55,166 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TratarOcorrenciaInternaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TratarOcorrenciaInternaAS!br.gov.caixa.bsb.sisou.core.tratarocorrencia.TratarOcorrenciaInternaAS
	java:app/sisou-sac-api/TratarOcorrenciaInternaAS!br.gov.caixa.bsb.sisou.core.tratarocorrencia.TratarOcorrenciaInternaAS
	java:module/TratarOcorrenciaInternaAS!br.gov.caixa.bsb.sisou.core.tratarocorrencia.TratarOcorrenciaInternaAS
	java:global/sisou-sac-okd/sisou-sac-api/TratarOcorrenciaInternaAS
	java:app/sisou-sac-api/TratarOcorrenciaInternaAS
	java:module/TratarOcorrenciaInternaAS

[0m[0m10:49:55,166 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ParametroSistemaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ParametroSistemaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ParametroSistemaConverter
	java:app/sisou-sac-api/ParametroSistemaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ParametroSistemaConverter
	java:module/ParametroSistemaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ParametroSistemaConverter
	java:global/sisou-sac-okd/sisou-sac-api/ParametroSistemaConverter
	java:app/sisou-sac-api/ParametroSistemaConverter
	java:module/ParametroSistemaConverter

[0m[0m10:49:55,166 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'DadosProconConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/DadosProconConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.DadosProconConverter
	java:app/sisou-sac-api/DadosProconConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.DadosProconConverter
	java:module/DadosProconConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.DadosProconConverter
	java:global/sisou-sac-okd/sisou-sac-api/DadosProconConverter
	java:app/sisou-sac-api/DadosProconConverter
	java:module/DadosProconConverter

[0m[0m10:49:55,166 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'CartilhaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/CartilhaAS!br.gov.caixa.bsb.sisou.core.ajuda.CartilhaAS
	java:app/sisou-sac-api/CartilhaAS!br.gov.caixa.bsb.sisou.core.ajuda.CartilhaAS
	java:module/CartilhaAS!br.gov.caixa.bsb.sisou.core.ajuda.CartilhaAS
	java:global/sisou-sac-okd/sisou-sac-api/CartilhaAS
	java:app/sisou-sac-api/CartilhaAS
	java:module/CartilhaAS

[0m[0m10:49:55,167 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ProblemaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ProblemaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ProblemaConverter
	java:app/sisou-sac-api/ProblemaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ProblemaConverter
	java:module/ProblemaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ProblemaConverter
	java:global/sisou-sac-okd/sisou-sac-api/ProblemaConverter
	java:app/sisou-sac-api/ProblemaConverter
	java:module/ProblemaConverter

[0m[0m10:49:55,167 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TemplateAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TemplateAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TemplateAS
	java:app/sisou-sac-api/TemplateAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TemplateAS
	java:module/TemplateAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TemplateAS
	java:global/sisou-sac-okd/sisou-sac-api/TemplateAS
	java:app/sisou-sac-api/TemplateAS
	java:module/TemplateAS

[0m[0m10:49:55,167 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TarefaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TarefaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.TarefaAS
	java:app/sisou-sac-api/TarefaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.TarefaAS
	java:module/TarefaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.TarefaAS
	java:global/sisou-sac-okd/sisou-sac-api/TarefaAS
	java:app/sisou-sac-api/TarefaAS
	java:module/TarefaAS

[0m[0m10:49:55,167 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ConsoleB2bSituacaoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ConsoleB2bSituacaoAS!br.gov.caixa.bsb.sisou.core.administracao.consoleb2b.ConsoleB2bSituacaoAS
	java:app/sisou-sac-api/ConsoleB2bSituacaoAS!br.gov.caixa.bsb.sisou.core.administracao.consoleb2b.ConsoleB2bSituacaoAS
	java:module/ConsoleB2bSituacaoAS!br.gov.caixa.bsb.sisou.core.administracao.consoleb2b.ConsoleB2bSituacaoAS
	java:global/sisou-sac-okd/sisou-sac-api/ConsoleB2bSituacaoAS
	java:app/sisou-sac-api/ConsoleB2bSituacaoAS
	java:module/ConsoleB2bSituacaoAS

[0m[0m10:49:55,167 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'RecuperarOcorrenciaExternaSisou' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/RecuperarOcorrenciaExternaSisou!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.RecuperarOcorrenciaExternaSisou
	java:app/sisou-sac-api/RecuperarOcorrenciaExternaSisou!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.RecuperarOcorrenciaExternaSisou
	java:module/RecuperarOcorrenciaExternaSisou!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.RecuperarOcorrenciaExternaSisou
	java:global/sisou-sac-okd/sisou-sac-api/RecuperarOcorrenciaExternaSisou
	java:app/sisou-sac-api/RecuperarOcorrenciaExternaSisou
	java:module/RecuperarOcorrenciaExternaSisou

[0m[0m10:49:55,167 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PainelControleSacAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PainelControleSacAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PainelControleSacAS
	java:app/sisou-sac-api/PainelControleSacAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PainelControleSacAS
	java:module/PainelControleSacAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PainelControleSacAS
	java:global/sisou-sac-okd/sisou-sac-api/PainelControleSacAS
	java:app/sisou-sac-api/PainelControleSacAS
	java:module/PainelControleSacAS

[0m[0m10:49:55,167 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'IndecxIntegracaoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/IndecxIntegracaoAS!br.gov.caixa.bsb.sisou.core.integracao.indecx.IndecxIntegracaoAS
	java:app/sisou-sac-api/IndecxIntegracaoAS!br.gov.caixa.bsb.sisou.core.integracao.indecx.IndecxIntegracaoAS
	java:module/IndecxIntegracaoAS!br.gov.caixa.bsb.sisou.core.integracao.indecx.IndecxIntegracaoAS
	java:global/sisou-sac-okd/sisou-sac-api/IndecxIntegracaoAS
	java:app/sisou-sac-api/IndecxIntegracaoAS
	java:module/IndecxIntegracaoAS

[0m[0m10:49:55,167 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'OrigemFormatoRespostaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/OrigemFormatoRespostaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.OrigemFormatoRespostaConverter
	java:app/sisou-sac-api/OrigemFormatoRespostaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.OrigemFormatoRespostaConverter
	java:module/OrigemFormatoRespostaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.OrigemFormatoRespostaConverter
	java:global/sisou-sac-okd/sisou-sac-api/OrigemFormatoRespostaConverter
	java:app/sisou-sac-api/OrigemFormatoRespostaConverter
	java:module/OrigemFormatoRespostaConverter

[0m[0m10:49:55,167 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TratamentoOcorrenciaExternaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TratamentoOcorrenciaExternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.TratamentoOcorrenciaExternaAS
	java:app/sisou-sac-api/TratamentoOcorrenciaExternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.TratamentoOcorrenciaExternaAS
	java:module/TratamentoOcorrenciaExternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.TratamentoOcorrenciaExternaAS
	java:global/sisou-sac-okd/sisou-sac-api/TratamentoOcorrenciaExternaAS
	java:app/sisou-sac-api/TratamentoOcorrenciaExternaAS
	java:module/TratamentoOcorrenciaExternaAS

[0m[0m10:49:55,167 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'CategorizacaoOcorrenciaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/CategorizacaoOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.CategorizacaoOcorrenciaConverter
	java:app/sisou-sac-api/CategorizacaoOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.CategorizacaoOcorrenciaConverter
	java:module/CategorizacaoOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.CategorizacaoOcorrenciaConverter
	java:global/sisou-sac-okd/sisou-sac-api/CategorizacaoOcorrenciaConverter
	java:app/sisou-sac-api/CategorizacaoOcorrenciaConverter
	java:module/CategorizacaoOcorrenciaConverter

[0m[0m10:49:55,167 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TipoMovimentacaoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TipoMovimentacaoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoMovimentacaoAS
	java:app/sisou-sac-api/TipoMovimentacaoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoMovimentacaoAS
	java:module/TipoMovimentacaoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoMovimentacaoAS
	java:global/sisou-sac-okd/sisou-sac-api/TipoMovimentacaoAS
	java:app/sisou-sac-api/TipoMovimentacaoAS
	java:module/TipoMovimentacaoAS

[0m[0m10:49:55,168 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ParametroAvaliacaoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ParametroAvaliacaoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ParametroAvaliacaoAS
	java:app/sisou-sac-api/ParametroAvaliacaoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ParametroAvaliacaoAS
	java:module/ParametroAvaliacaoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ParametroAvaliacaoAS
	java:global/sisou-sac-okd/sisou-sac-api/ParametroAvaliacaoAS
	java:app/sisou-sac-api/ParametroAvaliacaoAS
	java:module/ParametroAvaliacaoAS

[0m[0m10:49:55,168 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MovimentacaoOcorrenciaSacAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/MovimentacaoOcorrenciaSacAS!br.gov.caixa.bsb.sisou.core.ocorrencia.MovimentacaoOcorrenciaSacAS
	java:app/sisou-sac-api/MovimentacaoOcorrenciaSacAS!br.gov.caixa.bsb.sisou.core.ocorrencia.MovimentacaoOcorrenciaSacAS
	java:module/MovimentacaoOcorrenciaSacAS!br.gov.caixa.bsb.sisou.core.ocorrencia.MovimentacaoOcorrenciaSacAS
	java:global/sisou-sac-okd/sisou-sac-api/MovimentacaoOcorrenciaSacAS
	java:app/sisou-sac-api/MovimentacaoOcorrenciaSacAS
	java:module/MovimentacaoOcorrenciaSacAS

[0m[0m10:49:55,168 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PalavraProibidaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PalavraProibidaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.PalavraProibidaAS
	java:app/sisou-sac-api/PalavraProibidaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.PalavraProibidaAS
	java:module/PalavraProibidaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.PalavraProibidaAS
	java:global/sisou-sac-okd/sisou-sac-api/PalavraProibidaAS
	java:app/sisou-sac-api/PalavraProibidaAS
	java:module/PalavraProibidaAS

[0m[0m10:49:55,168 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TemplatePerguntaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TemplatePerguntaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.TemplatePerguntaConverter
	java:app/sisou-sac-api/TemplatePerguntaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.TemplatePerguntaConverter
	java:module/TemplatePerguntaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.TemplatePerguntaConverter
	java:global/sisou-sac-okd/sisou-sac-api/TemplatePerguntaConverter
	java:app/sisou-sac-api/TemplatePerguntaConverter
	java:module/TemplatePerguntaConverter

[0m[0m10:49:55,168 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'EmpregadoVinculadoConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/EmpregadoVinculadoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.EmpregadoVinculadoConverter
	java:app/sisou-sac-api/EmpregadoVinculadoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.EmpregadoVinculadoConverter
	java:module/EmpregadoVinculadoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.EmpregadoVinculadoConverter
	java:global/sisou-sac-okd/sisou-sac-api/EmpregadoVinculadoConverter
	java:app/sisou-sac-api/EmpregadoVinculadoConverter
	java:module/EmpregadoVinculadoConverter

[0m[0m10:49:55,168 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'CriarOuAtualizarSolicitante' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/CriarOuAtualizarSolicitante!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.CriarOuAtualizarSolicitante
	java:app/sisou-sac-api/CriarOuAtualizarSolicitante!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.CriarOuAtualizarSolicitante
	java:module/CriarOuAtualizarSolicitante!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.CriarOuAtualizarSolicitante
	java:global/sisou-sac-okd/sisou-sac-api/CriarOuAtualizarSolicitante
	java:app/sisou-sac-api/CriarOuAtualizarSolicitante
	java:module/CriarOuAtualizarSolicitante

[0m[0m10:49:55,168 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'RecuperarSolicitacaoProrrogacaoPrazo' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/RecuperarSolicitacaoProrrogacaoPrazo!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.RecuperarSolicitacaoProrrogacaoPrazo
	java:app/sisou-sac-api/RecuperarSolicitacaoProrrogacaoPrazo!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.RecuperarSolicitacaoProrrogacaoPrazo
	java:module/RecuperarSolicitacaoProrrogacaoPrazo!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.RecuperarSolicitacaoProrrogacaoPrazo
	java:global/sisou-sac-okd/sisou-sac-api/RecuperarSolicitacaoProrrogacaoPrazo
	java:app/sisou-sac-api/RecuperarSolicitacaoProrrogacaoPrazo
	java:module/RecuperarSolicitacaoProrrogacaoPrazo

[0m[0m10:49:55,168 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ConsumidorGovAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ConsumidorGovAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ConsumidorGovAS
	java:app/sisou-sac-api/ConsumidorGovAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ConsumidorGovAS
	java:module/ConsumidorGovAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ConsumidorGovAS
	java:global/sisou-sac-okd/sisou-sac-api/ConsumidorGovAS
	java:app/sisou-sac-api/ConsumidorGovAS
	java:module/ConsumidorGovAS

[0m[0m10:49:55,168 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ParametrizacaoAtendimentoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ParametrizacaoAtendimentoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ParametrizacaoAtendimentoAS
	java:app/sisou-sac-api/ParametrizacaoAtendimentoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ParametrizacaoAtendimentoAS
	java:module/ParametrizacaoAtendimentoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ParametrizacaoAtendimentoAS
	java:global/sisou-sac-okd/sisou-sac-api/ParametrizacaoAtendimentoAS
	java:app/sisou-sac-api/ParametrizacaoAtendimentoAS
	java:module/ParametrizacaoAtendimentoAS

[0m[0m10:49:55,168 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'OcorrenciaExternaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaExternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.OcorrenciaExternaConverter
	java:app/sisou-sac-api/OcorrenciaExternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.OcorrenciaExternaConverter
	java:module/OcorrenciaExternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.OcorrenciaExternaConverter
	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaExternaConverter
	java:app/sisou-sac-api/OcorrenciaExternaConverter
	java:module/OcorrenciaExternaConverter

[0m[0m10:49:55,168 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'AssuntoConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/AssuntoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.AssuntoConverter
	java:app/sisou-sac-api/AssuntoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.AssuntoConverter
	java:module/AssuntoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.AssuntoConverter
	java:global/sisou-sac-okd/sisou-sac-api/AssuntoConverter
	java:app/sisou-sac-api/AssuntoConverter
	java:module/AssuntoConverter

[0m[0m10:49:55,169 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ParametroConsoleAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ParametroConsoleAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ParametroConsoleAS
	java:app/sisou-sac-api/ParametroConsoleAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ParametroConsoleAS
	java:module/ParametroConsoleAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ParametroConsoleAS
	java:global/sisou-sac-okd/sisou-sac-api/ParametroConsoleAS
	java:app/sisou-sac-api/ParametroConsoleAS
	java:module/ParametroConsoleAS

[0m[0m10:49:55,248 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'IndicadoresConsolesAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/IndicadoresConsolesAS!br.gov.caixa.bsb.sisou.core.ocorrencia.IndicadoresConsolesAS
	java:app/sisou-sac-api/IndicadoresConsolesAS!br.gov.caixa.bsb.sisou.core.ocorrencia.IndicadoresConsolesAS
	java:module/IndicadoresConsolesAS!br.gov.caixa.bsb.sisou.core.ocorrencia.IndicadoresConsolesAS
	java:global/sisou-sac-okd/sisou-sac-api/IndicadoresConsolesAS
	java:app/sisou-sac-api/IndicadoresConsolesAS
	java:module/IndicadoresConsolesAS

[0m[0m10:49:55,248 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'LoteArquivoCartaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/LoteArquivoCartaAS!br.gov.caixa.bsb.sisou.core.correios.LoteArquivoCartaAS
	java:app/sisou-sac-api/LoteArquivoCartaAS!br.gov.caixa.bsb.sisou.core.correios.LoteArquivoCartaAS
	java:module/LoteArquivoCartaAS!br.gov.caixa.bsb.sisou.core.correios.LoteArquivoCartaAS
	java:global/sisou-sac-okd/sisou-sac-api/LoteArquivoCartaAS
	java:app/sisou-sac-api/LoteArquivoCartaAS
	java:module/LoteArquivoCartaAS

[0m[0m10:49:55,248 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'InteracaoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/InteracaoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.InteracaoAS
	java:app/sisou-sac-api/InteracaoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.InteracaoAS
	java:module/InteracaoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.InteracaoAS
	java:global/sisou-sac-okd/sisou-sac-api/InteracaoAS
	java:app/sisou-sac-api/InteracaoAS
	java:module/InteracaoAS

[0m[0m10:49:55,248 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PedidoClienteAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PedidoClienteAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.PedidoClienteAS
	java:app/sisou-sac-api/PedidoClienteAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.PedidoClienteAS
	java:module/PedidoClienteAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.PedidoClienteAS
	java:global/sisou-sac-okd/sisou-sac-api/PedidoClienteAS
	java:app/sisou-sac-api/PedidoClienteAS
	java:module/PedidoClienteAS

[0m[0m10:49:55,248 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TrabalhoEquipeConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TrabalhoEquipeConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.TrabalhoEquipeConverter
	java:app/sisou-sac-api/TrabalhoEquipeConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.TrabalhoEquipeConverter
	java:module/TrabalhoEquipeConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.TrabalhoEquipeConverter
	java:global/sisou-sac-okd/sisou-sac-api/TrabalhoEquipeConverter
	java:app/sisou-sac-api/TrabalhoEquipeConverter
	java:module/TrabalhoEquipeConverter

[0m[0m10:49:55,248 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MovimentacaoOcorrenciaSacConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/MovimentacaoOcorrenciaSacConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.MovimentacaoOcorrenciaSacConverter
	java:app/sisou-sac-api/MovimentacaoOcorrenciaSacConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.MovimentacaoOcorrenciaSacConverter
	java:module/MovimentacaoOcorrenciaSacConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.MovimentacaoOcorrenciaSacConverter
	java:global/sisou-sac-okd/sisou-sac-api/MovimentacaoOcorrenciaSacConverter
	java:app/sisou-sac-api/MovimentacaoOcorrenciaSacConverter
	java:module/MovimentacaoOcorrenciaSacConverter

[0m[0m10:49:55,248 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'GrauSigiloConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/GrauSigiloConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ged.GrauSigiloConverter
	java:app/sisou-sac-api/GrauSigiloConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ged.GrauSigiloConverter
	java:module/GrauSigiloConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ged.GrauSigiloConverter
	java:global/sisou-sac-okd/sisou-sac-api/GrauSigiloConverter
	java:app/sisou-sac-api/GrauSigiloConverter
	java:module/GrauSigiloConverter

[0m[0m10:49:55,248 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'NaturezaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/NaturezaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.NaturezaAS
	java:app/sisou-sac-api/NaturezaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.NaturezaAS
	java:module/NaturezaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.NaturezaAS
	java:global/sisou-sac-okd/sisou-sac-api/NaturezaAS
	java:app/sisou-sac-api/NaturezaAS
	java:module/NaturezaAS

[0m[0m10:49:55,248 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'InteracaoConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/InteracaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.InteracaoConverter
	java:app/sisou-sac-api/InteracaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.InteracaoConverter
	java:module/InteracaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.InteracaoConverter
	java:global/sisou-sac-okd/sisou-sac-api/InteracaoConverter
	java:app/sisou-sac-api/InteracaoConverter
	java:module/InteracaoConverter

[0m[0m10:49:55,248 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TipoFormatoRespostaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TipoFormatoRespostaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.TipoFormatoRespostaConverter
	java:app/sisou-sac-api/TipoFormatoRespostaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.TipoFormatoRespostaConverter
	java:module/TipoFormatoRespostaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.TipoFormatoRespostaConverter
	java:global/sisou-sac-okd/sisou-sac-api/TipoFormatoRespostaConverter
	java:app/sisou-sac-api/TipoFormatoRespostaConverter
	java:module/TipoFormatoRespostaConverter

[0m[0m10:49:55,249 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PainelInformacaoInternaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PainelInformacaoInternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.tratarocorrencia.PainelInformacaoInternaConverter
	java:app/sisou-sac-api/PainelInformacaoInternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.tratarocorrencia.PainelInformacaoInternaConverter
	java:module/PainelInformacaoInternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.tratarocorrencia.PainelInformacaoInternaConverter
	java:global/sisou-sac-okd/sisou-sac-api/PainelInformacaoInternaConverter
	java:app/sisou-sac-api/PainelInformacaoInternaConverter
	java:module/PainelInformacaoInternaConverter

[0m[0m10:49:55,249 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'OcorrenciaExternaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaExternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaExternaAS
	java:app/sisou-sac-api/OcorrenciaExternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaExternaAS
	java:module/OcorrenciaExternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaExternaAS
	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaExternaAS
	java:app/sisou-sac-api/OcorrenciaExternaAS
	java:module/OcorrenciaExternaAS

[0m[0m10:49:55,249 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'AvaliacaoOcorrenciaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/AvaliacaoOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.AvaliacaoOcorrenciaConverter
	java:app/sisou-sac-api/AvaliacaoOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.AvaliacaoOcorrenciaConverter
	java:module/AvaliacaoOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.AvaliacaoOcorrenciaConverter
	java:global/sisou-sac-okd/sisou-sac-api/AvaliacaoOcorrenciaConverter
	java:app/sisou-sac-api/AvaliacaoOcorrenciaConverter
	java:module/AvaliacaoOcorrenciaConverter

[0m[0m10:49:55,249 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PostoAtendimentoProconConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PostoAtendimentoProconConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.PostoAtendimentoProconConverter
	java:app/sisou-sac-api/PostoAtendimentoProconConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.PostoAtendimentoProconConverter
	java:module/PostoAtendimentoProconConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.PostoAtendimentoProconConverter
	java:global/sisou-sac-okd/sisou-sac-api/PostoAtendimentoProconConverter
	java:app/sisou-sac-api/PostoAtendimentoProconConverter
	java:module/PostoAtendimentoProconConverter

[0m[0m10:49:55,249 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'AvaliacaoOcorrenciaExternaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/AvaliacaoOcorrenciaExternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.AvaliacaoOcorrenciaExternaConverter
	java:app/sisou-sac-api/AvaliacaoOcorrenciaExternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.AvaliacaoOcorrenciaExternaConverter
	java:module/AvaliacaoOcorrenciaExternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.AvaliacaoOcorrenciaExternaConverter
	java:global/sisou-sac-okd/sisou-sac-api/AvaliacaoOcorrenciaExternaConverter
	java:app/sisou-sac-api/AvaliacaoOcorrenciaExternaConverter
	java:module/AvaliacaoOcorrenciaExternaConverter

[0m[0m10:49:55,249 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MovimentacaoDominioAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/MovimentacaoDominioAS!br.gov.caixa.bsb.sisou.core.administracao.MovimentacaoDominioAS
	java:app/sisou-sac-api/MovimentacaoDominioAS!br.gov.caixa.bsb.sisou.core.administracao.MovimentacaoDominioAS
	java:module/MovimentacaoDominioAS!br.gov.caixa.bsb.sisou.core.administracao.MovimentacaoDominioAS
	java:global/sisou-sac-okd/sisou-sac-api/MovimentacaoDominioAS
	java:app/sisou-sac-api/MovimentacaoDominioAS
	java:module/MovimentacaoDominioAS

[0m[0m10:49:55,249 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'IntegracaoSibkoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/IntegracaoSibkoAS!br.gov.caixa.bsb.sisou.core.integracao.sibko.IntegracaoSibkoAS
	java:app/sisou-sac-api/IntegracaoSibkoAS!br.gov.caixa.bsb.sisou.core.integracao.sibko.IntegracaoSibkoAS
	java:module/IntegracaoSibkoAS!br.gov.caixa.bsb.sisou.core.integracao.sibko.IntegracaoSibkoAS
	java:global/sisou-sac-okd/sisou-sac-api/IntegracaoSibkoAS
	java:app/sisou-sac-api/IntegracaoSibkoAS
	java:module/IntegracaoSibkoAS

[0m[0m10:49:55,249 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MensagemSMSAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/MensagemSMSAS!br.gov.caixa.bsb.sisou.core.sms.MensagemSMSAS
	java:app/sisou-sac-api/MensagemSMSAS!br.gov.caixa.bsb.sisou.core.sms.MensagemSMSAS
	java:module/MensagemSMSAS!br.gov.caixa.bsb.sisou.core.sms.MensagemSMSAS
	java:global/sisou-sac-okd/sisou-sac-api/MensagemSMSAS
	java:app/sisou-sac-api/MensagemSMSAS
	java:module/MensagemSMSAS

[0m[0m10:49:55,249 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TratarOcorrenciaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TratarOcorrenciaAS!br.gov.caixa.bsb.sisou.core.tratarocorrencia.TratarOcorrenciaAS
	java:app/sisou-sac-api/TratarOcorrenciaAS!br.gov.caixa.bsb.sisou.core.tratarocorrencia.TratarOcorrenciaAS
	java:module/TratarOcorrenciaAS!br.gov.caixa.bsb.sisou.core.tratarocorrencia.TratarOcorrenciaAS
	java:global/sisou-sac-okd/sisou-sac-api/TratarOcorrenciaAS
	java:app/sisou-sac-api/TratarOcorrenciaAS
	java:module/TratarOcorrenciaAS

[0m[0m10:49:55,249 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'EnvioOcorrenciaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/EnvioOcorrenciaAS!br.gov.caixa.bsb.sisou.core.administracao.rdrbacen.EnvioOcorrenciaAS
	java:app/sisou-sac-api/EnvioOcorrenciaAS!br.gov.caixa.bsb.sisou.core.administracao.rdrbacen.EnvioOcorrenciaAS
	java:module/EnvioOcorrenciaAS!br.gov.caixa.bsb.sisou.core.administracao.rdrbacen.EnvioOcorrenciaAS
	java:global/sisou-sac-okd/sisou-sac-api/EnvioOcorrenciaAS
	java:app/sisou-sac-api/EnvioOcorrenciaAS
	java:module/EnvioOcorrenciaAS

[0m[0m10:49:55,249 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ErroIntegracaoInternoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ErroIntegracaoInternoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ErroIntegracaoInternoAS
	java:app/sisou-sac-api/ErroIntegracaoInternoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ErroIntegracaoInternoAS
	java:module/ErroIntegracaoInternoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ErroIntegracaoInternoAS
	java:global/sisou-sac-okd/sisou-sac-api/ErroIntegracaoInternoAS
	java:app/sisou-sac-api/ErroIntegracaoInternoAS
	java:module/ErroIntegracaoInternoAS

[0m[0m10:49:55,249 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'EquipeOcorrenciaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/EquipeOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.EquipeOcorrenciaConverter
	java:app/sisou-sac-api/EquipeOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.EquipeOcorrenciaConverter
	java:module/EquipeOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.EquipeOcorrenciaConverter
	java:global/sisou-sac-okd/sisou-sac-api/EquipeOcorrenciaConverter
	java:app/sisou-sac-api/EquipeOcorrenciaConverter
	java:module/EquipeOcorrenciaConverter

[0m[0m10:49:55,249 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'OrigemConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/OrigemConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.OrigemConverter
	java:app/sisou-sac-api/OrigemConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.OrigemConverter
	java:module/OrigemConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.OrigemConverter
	java:global/sisou-sac-okd/sisou-sac-api/OrigemConverter
	java:app/sisou-sac-api/OrigemConverter
	java:module/OrigemConverter

[0m[0m10:49:55,249 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ProdutoConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ProdutoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ProdutoConverter
	java:app/sisou-sac-api/ProdutoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ProdutoConverter
	java:module/ProdutoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ProdutoConverter
	java:global/sisou-sac-okd/sisou-sac-api/ProdutoConverter
	java:app/sisou-sac-api/ProdutoConverter
	java:module/ProdutoConverter

[0m[0m10:49:55,249 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ContestacaoDecursoPrazoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ContestacaoDecursoPrazoAS!br.gov.caixa.bsb.sisou.core.contestacao.ContestacaoDecursoPrazoAS
	java:app/sisou-sac-api/ContestacaoDecursoPrazoAS!br.gov.caixa.bsb.sisou.core.contestacao.ContestacaoDecursoPrazoAS
	java:module/ContestacaoDecursoPrazoAS!br.gov.caixa.bsb.sisou.core.contestacao.ContestacaoDecursoPrazoAS
	java:global/sisou-sac-okd/sisou-sac-api/ContestacaoDecursoPrazoAS
	java:app/sisou-sac-api/ContestacaoDecursoPrazoAS
	java:module/ContestacaoDecursoPrazoAS

[0m[0m10:49:55,250 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'UnidadeBloqueadaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/UnidadeBloqueadaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.UnidadeBloqueadaConverter
	java:app/sisou-sac-api/UnidadeBloqueadaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.UnidadeBloqueadaConverter
	java:module/UnidadeBloqueadaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.UnidadeBloqueadaConverter
	java:global/sisou-sac-okd/sisou-sac-api/UnidadeBloqueadaConverter
	java:app/sisou-sac-api/UnidadeBloqueadaConverter
	java:module/UnidadeBloqueadaConverter

[0m[0m10:49:55,250 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'SituacaoTarefaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/SituacaoTarefaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.SituacaoTarefaAS
	java:app/sisou-sac-api/SituacaoTarefaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.SituacaoTarefaAS
	java:module/SituacaoTarefaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.SituacaoTarefaAS
	java:global/sisou-sac-okd/sisou-sac-api/SituacaoTarefaAS
	java:app/sisou-sac-api/SituacaoTarefaAS
	java:module/SituacaoTarefaAS

[0m[0m10:49:55,250 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TipoEventoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TipoEventoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoEventoAS
	java:app/sisou-sac-api/TipoEventoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoEventoAS
	java:module/TipoEventoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoEventoAS
	java:global/sisou-sac-okd/sisou-sac-api/TipoEventoAS
	java:app/sisou-sac-api/TipoEventoAS
	java:module/TipoEventoAS

[0m[0m10:49:55,250 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'OcorrenciaFaleConoscoWSAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaFaleConoscoWSAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaFaleConoscoWSAS
	java:app/sisou-sac-api/OcorrenciaFaleConoscoWSAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaFaleConoscoWSAS
	java:module/OcorrenciaFaleConoscoWSAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaFaleConoscoWSAS
	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaFaleConoscoWSAS
	java:app/sisou-sac-api/OcorrenciaFaleConoscoWSAS
	java:module/OcorrenciaFaleConoscoWSAS

[0m[0m10:49:55,250 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'LegadoIntegracaoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/LegadoIntegracaoAS!br.gov.caixa.bsb.sisou.core.integracao.legado.ILegadoIntegracaoAS
	java:app/sisou-sac-api/LegadoIntegracaoAS!br.gov.caixa.bsb.sisou.core.integracao.legado.ILegadoIntegracaoAS
	java:module/LegadoIntegracaoAS!br.gov.caixa.bsb.sisou.core.integracao.legado.ILegadoIntegracaoAS
	java:global/sisou-sac-okd/sisou-sac-api/LegadoIntegracaoAS
	java:app/sisou-sac-api/LegadoIntegracaoAS
	java:module/LegadoIntegracaoAS

[0m[0m10:49:55,250 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PrazoSistemaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PrazoSistemaAS!br.gov.caixa.bsb.sisou.core.ajuda.PrazoSistemaAS
	java:app/sisou-sac-api/PrazoSistemaAS!br.gov.caixa.bsb.sisou.core.ajuda.PrazoSistemaAS
	java:module/PrazoSistemaAS!br.gov.caixa.bsb.sisou.core.ajuda.PrazoSistemaAS
	java:global/sisou-sac-okd/sisou-sac-api/PrazoSistemaAS
	java:app/sisou-sac-api/PrazoSistemaAS
	java:module/PrazoSistemaAS

[0m[0m10:49:55,250 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'OcorrenciaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaAS!br.gov.caixa.bsb.sisou.core.sipqv.OcorrenciaAS
	java:app/sisou-sac-api/OcorrenciaAS!br.gov.caixa.bsb.sisou.core.sipqv.OcorrenciaAS
	java:module/OcorrenciaAS!br.gov.caixa.bsb.sisou.core.sipqv.OcorrenciaAS
	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaAS
	java:app/sisou-sac-api/OcorrenciaAS
	java:module/OcorrenciaAS

[0m[0m10:49:55,250 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'IndicadoresIndividualAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/IndicadoresIndividualAS!br.gov.caixa.bsb.sisou.core.ocorrencia.IndicadoresIndividualAS
	java:app/sisou-sac-api/IndicadoresIndividualAS!br.gov.caixa.bsb.sisou.core.ocorrencia.IndicadoresIndividualAS
	java:module/IndicadoresIndividualAS!br.gov.caixa.bsb.sisou.core.ocorrencia.IndicadoresIndividualAS
	java:global/sisou-sac-okd/sisou-sac-api/IndicadoresIndividualAS
	java:app/sisou-sac-api/IndicadoresIndividualAS
	java:module/IndicadoresIndividualAS

[0m[0m10:49:55,250 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'GrupoTratamentoMetaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/GrupoTratamentoMetaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.GrupoTratamentoMetaConverter
	java:app/sisou-sac-api/GrupoTratamentoMetaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.GrupoTratamentoMetaConverter
	java:module/GrupoTratamentoMetaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.GrupoTratamentoMetaConverter
	java:global/sisou-sac-okd/sisou-sac-api/GrupoTratamentoMetaConverter
	java:app/sisou-sac-api/GrupoTratamentoMetaConverter
	java:module/GrupoTratamentoMetaConverter

[0m[0m10:49:55,250 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'OcorrenciaOuvidoriaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaOuvidoriaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaOuvidoriaAS
	java:app/sisou-sac-api/OcorrenciaOuvidoriaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaOuvidoriaAS
	java:module/OcorrenciaOuvidoriaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaOuvidoriaAS
	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaOuvidoriaAS
	java:app/sisou-sac-api/OcorrenciaOuvidoriaAS
	java:module/OcorrenciaOuvidoriaAS

[0m[0m10:49:55,250 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'CanalConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/CanalConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.CanalConverter
	java:app/sisou-sac-api/CanalConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.CanalConverter
	java:module/CanalConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.CanalConverter
	java:global/sisou-sac-okd/sisou-sac-api/CanalConverter
	java:app/sisou-sac-api/CanalConverter
	java:module/CanalConverter

[0m[0m10:49:55,250 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'IntegracaoInternoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/IntegracaoInternoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.IntegracaoInternoAS
	java:app/sisou-sac-api/IntegracaoInternoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.IntegracaoInternoAS
	java:module/IntegracaoInternoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.IntegracaoInternoAS
	java:global/sisou-sac-okd/sisou-sac-api/IntegracaoInternoAS
	java:app/sisou-sac-api/IntegracaoInternoAS
	java:module/IntegracaoInternoAS

[0m[0m10:49:55,250 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PerguntaAvaliacaoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PerguntaAvaliacaoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.PerguntaAvaliacaoAS
	java:app/sisou-sac-api/PerguntaAvaliacaoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.PerguntaAvaliacaoAS
	java:module/PerguntaAvaliacaoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.PerguntaAvaliacaoAS
	java:global/sisou-sac-okd/sisou-sac-api/PerguntaAvaliacaoAS
	java:app/sisou-sac-api/PerguntaAvaliacaoAS
	java:module/PerguntaAvaliacaoAS

[0m[0m10:49:55,250 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ProblemaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ProblemaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ProblemaAS
	java:app/sisou-sac-api/ProblemaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ProblemaAS
	java:module/ProblemaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ProblemaAS
	java:global/sisou-sac-okd/sisou-sac-api/ProblemaAS
	java:app/sisou-sac-api/ProblemaAS
	java:module/ProblemaAS

[0m[0m10:49:55,251 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'CanalAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/CanalAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.CanalAS
	java:app/sisou-sac-api/CanalAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.CanalAS
	java:module/CanalAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.CanalAS
	java:global/sisou-sac-okd/sisou-sac-api/CanalAS
	java:app/sisou-sac-api/CanalAS
	java:module/CanalAS

[0m[0m10:49:55,251 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MovimentacaoOcorrenciaInternaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/MovimentacaoOcorrenciaInternaAS!br.gov.caixa.bsb.sisou.core.tratarocorrencia.MovimentacaoOcorrenciaInternaAS
	java:app/sisou-sac-api/MovimentacaoOcorrenciaInternaAS!br.gov.caixa.bsb.sisou.core.tratarocorrencia.MovimentacaoOcorrenciaInternaAS
	java:module/MovimentacaoOcorrenciaInternaAS!br.gov.caixa.bsb.sisou.core.tratarocorrencia.MovimentacaoOcorrenciaInternaAS
	java:global/sisou-sac-okd/sisou-sac-api/MovimentacaoOcorrenciaInternaAS
	java:app/sisou-sac-api/MovimentacaoOcorrenciaInternaAS
	java:module/MovimentacaoOcorrenciaInternaAS

[0m[0m10:49:55,251 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'UnidadeAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/UnidadeAS!br.gov.caixa.bsb.sisou.core.administracao.UnidadeAS
	java:app/sisou-sac-api/UnidadeAS!br.gov.caixa.bsb.sisou.core.administracao.UnidadeAS
	java:module/UnidadeAS!br.gov.caixa.bsb.sisou.core.administracao.UnidadeAS
	java:global/sisou-sac-okd/sisou-sac-api/UnidadeAS
	java:app/sisou-sac-api/UnidadeAS
	java:module/UnidadeAS

[0m[0m10:49:55,251 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'OrientacaoAtendimentoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/OrientacaoAtendimentoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.OrientacaoAtendimentoAS
	java:app/sisou-sac-api/OrientacaoAtendimentoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.OrientacaoAtendimentoAS
	java:module/OrientacaoAtendimentoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.OrientacaoAtendimentoAS
	java:global/sisou-sac-okd/sisou-sac-api/OrientacaoAtendimentoAS
	java:app/sisou-sac-api/OrientacaoAtendimentoAS
	java:module/OrientacaoAtendimentoAS

[0m[0m10:49:55,251 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ReaberturaOcorrenciaInternaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ReaberturaOcorrenciaInternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.reaberturaocorrencia.ReaberturaOcorrenciaInternaConverter
	java:app/sisou-sac-api/ReaberturaOcorrenciaInternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.reaberturaocorrencia.ReaberturaOcorrenciaInternaConverter
	java:module/ReaberturaOcorrenciaInternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.reaberturaocorrencia.ReaberturaOcorrenciaInternaConverter
	java:global/sisou-sac-okd/sisou-sac-api/ReaberturaOcorrenciaInternaConverter
	java:app/sisou-sac-api/ReaberturaOcorrenciaInternaConverter
	java:module/ReaberturaOcorrenciaInternaConverter

[0m[0m10:49:55,251 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ProrrogacaoTarefaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ProrrogacaoTarefaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.tarefa.ProrrogacaoTarefaConverter
	java:app/sisou-sac-api/ProrrogacaoTarefaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.tarefa.ProrrogacaoTarefaConverter
	java:module/ProrrogacaoTarefaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.tarefa.ProrrogacaoTarefaConverter
	java:global/sisou-sac-okd/sisou-sac-api/ProrrogacaoTarefaConverter
	java:app/sisou-sac-api/ProrrogacaoTarefaConverter
	java:module/ProrrogacaoTarefaConverter

[0m[0m10:49:55,251 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'AnexoOcorrenciaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/AnexoOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.AnexoOcorrenciaAS
	java:app/sisou-sac-api/AnexoOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.AnexoOcorrenciaAS
	java:module/AnexoOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.AnexoOcorrenciaAS
	java:global/sisou-sac-okd/sisou-sac-api/AnexoOcorrenciaAS
	java:app/sisou-sac-api/AnexoOcorrenciaAS
	java:module/AnexoOcorrenciaAS

[0m[0m10:49:55,251 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'OcorrenciaSacAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaSacAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaSacAS
	java:app/sisou-sac-api/OcorrenciaSacAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaSacAS
	java:module/OcorrenciaSacAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaSacAS
	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaSacAS
	java:app/sisou-sac-api/OcorrenciaSacAS
	java:module/OcorrenciaSacAS

[0m[0m10:49:55,251 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'FormaRecebimentoRespostaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/FormaRecebimentoRespostaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.FormaRecebimentoRespostaAS
	java:app/sisou-sac-api/FormaRecebimentoRespostaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.FormaRecebimentoRespostaAS
	java:module/FormaRecebimentoRespostaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.FormaRecebimentoRespostaAS
	java:global/sisou-sac-okd/sisou-sac-api/FormaRecebimentoRespostaAS
	java:app/sisou-sac-api/FormaRecebimentoRespostaAS
	java:module/FormaRecebimentoRespostaAS

[0m[0m10:49:55,251 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ConsoleCorreiosAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ConsoleCorreiosAS!br.gov.caixa.bsb.sisou.core.correios.ConsoleCorreiosAS
	java:app/sisou-sac-api/ConsoleCorreiosAS!br.gov.caixa.bsb.sisou.core.correios.ConsoleCorreiosAS
	java:module/ConsoleCorreiosAS!br.gov.caixa.bsb.sisou.core.correios.ConsoleCorreiosAS
	java:global/sisou-sac-okd/sisou-sac-api/ConsoleCorreiosAS
	java:app/sisou-sac-api/ConsoleCorreiosAS
	java:module/ConsoleCorreiosAS

[0m[0m10:49:55,251 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PainelInformacaoInternaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PainelInformacaoInternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PainelInformacaoInternaAS
	java:app/sisou-sac-api/PainelInformacaoInternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PainelInformacaoInternaAS
	java:module/PainelInformacaoInternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PainelInformacaoInternaAS
	java:global/sisou-sac-okd/sisou-sac-api/PainelInformacaoInternaAS
	java:app/sisou-sac-api/PainelInformacaoInternaAS
	java:module/PainelInformacaoInternaAS

[0m[0m10:49:55,251 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MovimentacaoOcorrenciaOuvConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/MovimentacaoOcorrenciaOuvConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.MovimentacaoOcorrenciaOuvConverter
	java:app/sisou-sac-api/MovimentacaoOcorrenciaOuvConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.MovimentacaoOcorrenciaOuvConverter
	java:module/MovimentacaoOcorrenciaOuvConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.MovimentacaoOcorrenciaOuvConverter
	java:global/sisou-sac-okd/sisou-sac-api/MovimentacaoOcorrenciaOuvConverter
	java:app/sisou-sac-api/MovimentacaoOcorrenciaOuvConverter
	java:module/MovimentacaoOcorrenciaOuvConverter

[0m[0m10:49:55,251 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PenalidadeConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PenalidadeConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.PenalidadeConverter
	java:app/sisou-sac-api/PenalidadeConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.PenalidadeConverter
	java:module/PenalidadeConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.PenalidadeConverter
	java:global/sisou-sac-okd/sisou-sac-api/PenalidadeConverter
	java:app/sisou-sac-api/PenalidadeConverter
	java:module/PenalidadeConverter

[0m[0m10:49:55,251 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'UraManagerAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/UraManagerAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.UraManagerAS
	java:app/sisou-sac-api/UraManagerAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.UraManagerAS
	java:module/UraManagerAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.UraManagerAS
	java:global/sisou-sac-okd/sisou-sac-api/UraManagerAS
	java:app/sisou-sac-api/UraManagerAS
	java:module/UraManagerAS

[0m[0m10:49:55,252 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'JustificativaMovimentacaoConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/JustificativaMovimentacaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.JustificativaMovimentacaoConverter
	java:app/sisou-sac-api/JustificativaMovimentacaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.JustificativaMovimentacaoConverter
	java:module/JustificativaMovimentacaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.JustificativaMovimentacaoConverter
	java:global/sisou-sac-okd/sisou-sac-api/JustificativaMovimentacaoConverter
	java:app/sisou-sac-api/JustificativaMovimentacaoConverter
	java:module/JustificativaMovimentacaoConverter

[0m[0m10:49:55,252 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'UraAtendimentoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/UraAtendimentoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.UraAtendimentoAS
	java:app/sisou-sac-api/UraAtendimentoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.UraAtendimentoAS
	java:module/UraAtendimentoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.UraAtendimentoAS
	java:global/sisou-sac-okd/sisou-sac-api/UraAtendimentoAS
	java:app/sisou-sac-api/UraAtendimentoAS
	java:module/UraAtendimentoAS

[0m[0m10:49:55,252 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'SolicitanteConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/SolicitanteConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.SolicitanteConverter
	java:app/sisou-sac-api/SolicitanteConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.SolicitanteConverter
	java:module/SolicitanteConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.SolicitanteConverter
	java:global/sisou-sac-okd/sisou-sac-api/SolicitanteConverter
	java:app/sisou-sac-api/SolicitanteConverter
	java:module/SolicitanteConverter

[0m[0m10:49:55,252 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PesquisaSatisfacaoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PesquisaSatisfacaoAS!br.gov.caixa.bsb.sisou.core.faleconosco.PesquisaSatisfacaoAS
	java:app/sisou-sac-api/PesquisaSatisfacaoAS!br.gov.caixa.bsb.sisou.core.faleconosco.PesquisaSatisfacaoAS
	java:module/PesquisaSatisfacaoAS!br.gov.caixa.bsb.sisou.core.faleconosco.PesquisaSatisfacaoAS
	java:global/sisou-sac-okd/sisou-sac-api/PesquisaSatisfacaoAS
	java:app/sisou-sac-api/PesquisaSatisfacaoAS
	java:module/PesquisaSatisfacaoAS

[0m[0m10:49:55,252 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'AvaliacaoNaturezaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/AvaliacaoNaturezaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.AvaliacaoNaturezaAS
	java:app/sisou-sac-api/AvaliacaoNaturezaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.AvaliacaoNaturezaAS
	java:module/AvaliacaoNaturezaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.AvaliacaoNaturezaAS
	java:global/sisou-sac-okd/sisou-sac-api/AvaliacaoNaturezaAS
	java:app/sisou-sac-api/AvaliacaoNaturezaAS
	java:module/AvaliacaoNaturezaAS

[0m[0m10:49:55,252 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'AssuntoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/AssuntoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.AssuntoAS
	java:app/sisou-sac-api/AssuntoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.AssuntoAS
	java:module/AssuntoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.AssuntoAS
	java:global/sisou-sac-okd/sisou-sac-api/AssuntoAS
	java:app/sisou-sac-api/AssuntoAS
	java:module/AssuntoAS

[0m[0m10:49:55,252 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'LoteCorrespondenciaArquivoComplCartaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/LoteCorrespondenciaArquivoComplCartaAS!br.gov.caixa.bsb.sisou.core.correios.LoteCorrespondenciaArquivoComplCartaAS
	java:app/sisou-sac-api/LoteCorrespondenciaArquivoComplCartaAS!br.gov.caixa.bsb.sisou.core.correios.LoteCorrespondenciaArquivoComplCartaAS
	java:module/LoteCorrespondenciaArquivoComplCartaAS!br.gov.caixa.bsb.sisou.core.correios.LoteCorrespondenciaArquivoComplCartaAS
	java:global/sisou-sac-okd/sisou-sac-api/LoteCorrespondenciaArquivoComplCartaAS
	java:app/sisou-sac-api/LoteCorrespondenciaArquivoComplCartaAS
	java:module/LoteCorrespondenciaArquivoComplCartaAS

[0m[0m10:49:55,252 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PrazoSistemaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PrazoSistemaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ajuda.PrazoSistemaConverter
	java:app/sisou-sac-api/PrazoSistemaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ajuda.PrazoSistemaConverter
	java:module/PrazoSistemaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ajuda.PrazoSistemaConverter
	java:global/sisou-sac-okd/sisou-sac-api/PrazoSistemaConverter
	java:app/sisou-sac-api/PrazoSistemaConverter
	java:module/PrazoSistemaConverter

[0m[0m10:49:55,252 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'RelatoriosAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/RelatoriosAS!br.gov.caixa.bsb.sisou.core.ocorrencia.RelatoriosAS
	java:app/sisou-sac-api/RelatoriosAS!br.gov.caixa.bsb.sisou.core.ocorrencia.RelatoriosAS
	java:module/RelatoriosAS!br.gov.caixa.bsb.sisou.core.ocorrencia.RelatoriosAS
	java:global/sisou-sac-okd/sisou-sac-api/RelatoriosAS
	java:app/sisou-sac-api/RelatoriosAS
	java:module/RelatoriosAS

[0m[0m10:49:55,252 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'GrupoTratamentoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/GrupoTratamentoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.GrupoTratamentoAS
	java:app/sisou-sac-api/GrupoTratamentoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.GrupoTratamentoAS
	java:module/GrupoTratamentoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.GrupoTratamentoAS
	java:global/sisou-sac-okd/sisou-sac-api/GrupoTratamentoAS
	java:app/sisou-sac-api/GrupoTratamentoAS
	java:module/GrupoTratamentoAS

[0m[0m10:49:55,252 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TextoComplementarAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TextoComplementarAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TextoComplementarAS
	java:app/sisou-sac-api/TextoComplementarAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TextoComplementarAS
	java:module/TextoComplementarAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TextoComplementarAS
	java:global/sisou-sac-okd/sisou-sac-api/TextoComplementarAS
	java:app/sisou-sac-api/TextoComplementarAS
	java:module/TextoComplementarAS

[0m[0m10:49:55,252 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ParametroAvaliacaoConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ParametroAvaliacaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ParametroAvaliacaoConverter
	java:app/sisou-sac-api/ParametroAvaliacaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ParametroAvaliacaoConverter
	java:module/ParametroAvaliacaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ParametroAvaliacaoConverter
	java:global/sisou-sac-okd/sisou-sac-api/ParametroAvaliacaoConverter
	java:app/sisou-sac-api/ParametroAvaliacaoConverter
	java:module/ParametroAvaliacaoConverter

[0m[0m10:49:55,252 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'LocalidadeConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/LocalidadeConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.LocalidadeConverter
	java:app/sisou-sac-api/LocalidadeConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.LocalidadeConverter
	java:module/LocalidadeConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.LocalidadeConverter
	java:global/sisou-sac-okd/sisou-sac-api/LocalidadeConverter
	java:app/sisou-sac-api/LocalidadeConverter
	java:module/LocalidadeConverter

[0m[0m10:49:55,252 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'AvaliacaoOcorrenciaExternaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/AvaliacaoOcorrenciaExternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.AvaliacaoOcorrenciaExternaAS
	java:app/sisou-sac-api/AvaliacaoOcorrenciaExternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.AvaliacaoOcorrenciaExternaAS
	java:module/AvaliacaoOcorrenciaExternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.AvaliacaoOcorrenciaExternaAS
	java:global/sisou-sac-okd/sisou-sac-api/AvaliacaoOcorrenciaExternaAS
	java:app/sisou-sac-api/AvaliacaoOcorrenciaExternaAS
	java:module/AvaliacaoOcorrenciaExternaAS

[0m[0m10:49:55,252 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ItemAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ItemAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ItemAS
	java:app/sisou-sac-api/ItemAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ItemAS
	java:module/ItemAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ItemAS
	java:global/sisou-sac-okd/sisou-sac-api/ItemAS
	java:app/sisou-sac-api/ItemAS
	java:module/ItemAS

[0m[0m10:49:55,253 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MotivoEncerramentoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/MotivoEncerramentoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.MotivoEncerramentoAS
	java:app/sisou-sac-api/MotivoEncerramentoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.MotivoEncerramentoAS
	java:module/MotivoEncerramentoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.MotivoEncerramentoAS
	java:global/sisou-sac-okd/sisou-sac-api/MotivoEncerramentoAS
	java:app/sisou-sac-api/MotivoEncerramentoAS
	java:module/MotivoEncerramentoAS

[0m[0m10:49:55,253 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MotivoRetornoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/MotivoRetornoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.MotivoRetornoAS
	java:app/sisou-sac-api/MotivoRetornoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.MotivoRetornoAS
	java:module/MotivoRetornoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.MotivoRetornoAS
	java:global/sisou-sac-okd/sisou-sac-api/MotivoRetornoAS
	java:app/sisou-sac-api/MotivoRetornoAS
	java:module/MotivoRetornoAS

[0m[0m10:49:55,253 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'UnidadePenalidadeOcorrenciaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/UnidadePenalidadeOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.UnidadePenalidadeOcorrenciaConverter
	java:app/sisou-sac-api/UnidadePenalidadeOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.UnidadePenalidadeOcorrenciaConverter
	java:module/UnidadePenalidadeOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.UnidadePenalidadeOcorrenciaConverter
	java:global/sisou-sac-okd/sisou-sac-api/UnidadePenalidadeOcorrenciaConverter
	java:app/sisou-sac-api/UnidadePenalidadeOcorrenciaConverter
	java:module/UnidadePenalidadeOcorrenciaConverter

[0m[0m10:49:55,253 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'OcorrenciaExternaRespostaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaExternaRespostaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.OcorrenciaExternaRespostaConverter
	java:app/sisou-sac-api/OcorrenciaExternaRespostaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.OcorrenciaExternaRespostaConverter
	java:module/OcorrenciaExternaRespostaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.OcorrenciaExternaRespostaConverter
	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaExternaRespostaConverter
	java:app/sisou-sac-api/OcorrenciaExternaRespostaConverter
	java:module/OcorrenciaExternaRespostaConverter

[0m[0m10:49:55,253 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'EnderecoService' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/EnderecoService!br.gov.caixa.bsb.sisou.core.EnderecoService
	java:app/sisou-sac-api/EnderecoService!br.gov.caixa.bsb.sisou.core.EnderecoService
	java:module/EnderecoService!br.gov.caixa.bsb.sisou.core.EnderecoService
	java:global/sisou-sac-okd/sisou-sac-api/EnderecoService
	java:app/sisou-sac-api/EnderecoService
	java:module/EnderecoService

[0m[0m10:49:55,253 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MotivoConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/MotivoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.MotivoConverter
	java:app/sisou-sac-api/MotivoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.MotivoConverter
	java:module/MotivoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.MotivoConverter
	java:global/sisou-sac-okd/sisou-sac-api/MotivoConverter
	java:app/sisou-sac-api/MotivoConverter
	java:module/MotivoConverter

[0m[0m10:49:55,253 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TipoArquivoCartaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TipoArquivoCartaAS!br.gov.caixa.bsb.sisou.core.correios.TipoArquivoCartaAS
	java:app/sisou-sac-api/TipoArquivoCartaAS!br.gov.caixa.bsb.sisou.core.correios.TipoArquivoCartaAS
	java:module/TipoArquivoCartaAS!br.gov.caixa.bsb.sisou.core.correios.TipoArquivoCartaAS
	java:global/sisou-sac-okd/sisou-sac-api/TipoArquivoCartaAS
	java:app/sisou-sac-api/TipoArquivoCartaAS
	java:module/TipoArquivoCartaAS

[0m[0m10:49:55,253 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'DiarioBordoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/DiarioBordoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.DiarioBordoAS
	java:app/sisou-sac-api/DiarioBordoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.DiarioBordoAS
	java:module/DiarioBordoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.DiarioBordoAS
	java:global/sisou-sac-okd/sisou-sac-api/DiarioBordoAS
	java:app/sisou-sac-api/DiarioBordoAS
	java:module/DiarioBordoAS

[0m[0m10:49:55,253 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PriorizacaoDistribuicaoConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PriorizacaoDistribuicaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.PriorizacaoDistribuicaoConverter
	java:app/sisou-sac-api/PriorizacaoDistribuicaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.PriorizacaoDistribuicaoConverter
	java:module/PriorizacaoDistribuicaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.PriorizacaoDistribuicaoConverter
	java:global/sisou-sac-okd/sisou-sac-api/PriorizacaoDistribuicaoConverter
	java:app/sisou-sac-api/PriorizacaoDistribuicaoConverter
	java:module/PriorizacaoDistribuicaoConverter

[0m[0m10:49:55,253 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'EmailTemplateRendererAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/EmailTemplateRendererAS!br.gov.caixa.bsb.sisou.core.comum.EmailTemplateRendererAS
	java:app/sisou-sac-api/EmailTemplateRendererAS!br.gov.caixa.bsb.sisou.core.comum.EmailTemplateRendererAS
	java:module/EmailTemplateRendererAS!br.gov.caixa.bsb.sisou.core.comum.EmailTemplateRendererAS
	java:global/sisou-sac-okd/sisou-sac-api/EmailTemplateRendererAS
	java:app/sisou-sac-api/EmailTemplateRendererAS
	java:module/EmailTemplateRendererAS

[0m[0m10:49:55,253 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PalavraProibidaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PalavraProibidaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.PalavraProibidaConverter
	java:app/sisou-sac-api/PalavraProibidaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.PalavraProibidaConverter
	java:module/PalavraProibidaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.PalavraProibidaConverter
	java:global/sisou-sac-okd/sisou-sac-api/PalavraProibidaConverter
	java:app/sisou-sac-api/PalavraProibidaConverter
	java:module/PalavraProibidaConverter

[0m[0m10:49:55,253 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ClassificacaoOcorrenciaExternaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ClassificacaoOcorrenciaExternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ClassificacaoOcorrenciaExternaConverter
	java:app/sisou-sac-api/ClassificacaoOcorrenciaExternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ClassificacaoOcorrenciaExternaConverter
	java:module/ClassificacaoOcorrenciaExternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ClassificacaoOcorrenciaExternaConverter
	java:global/sisou-sac-okd/sisou-sac-api/ClassificacaoOcorrenciaExternaConverter
	java:app/sisou-sac-api/ClassificacaoOcorrenciaExternaConverter
	java:module/ClassificacaoOcorrenciaExternaConverter

[0m[0m10:49:55,253 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ManualNormativoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ManualNormativoAS!br.gov.caixa.bsb.sisou.core.ajuda.ManualNormativoAS
	java:app/sisou-sac-api/ManualNormativoAS!br.gov.caixa.bsb.sisou.core.ajuda.ManualNormativoAS
	java:module/ManualNormativoAS!br.gov.caixa.bsb.sisou.core.ajuda.ManualNormativoAS
	java:global/sisou-sac-okd/sisou-sac-api/ManualNormativoAS
	java:app/sisou-sac-api/ManualNormativoAS
	java:module/ManualNormativoAS

[0m[0m10:49:55,253 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PedidoClienteConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PedidoClienteConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.PedidoClienteConverter
	java:app/sisou-sac-api/PedidoClienteConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.PedidoClienteConverter
	java:module/PedidoClienteConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.PedidoClienteConverter
	java:global/sisou-sac-okd/sisou-sac-api/PedidoClienteConverter
	java:app/sisou-sac-api/PedidoClienteConverter
	java:module/PedidoClienteConverter

[0m[0m10:49:55,254 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'CategorizacaoOcorrenciaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/CategorizacaoOcorrenciaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.CategorizacaoOcorrenciaAS
	java:app/sisou-sac-api/CategorizacaoOcorrenciaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.CategorizacaoOcorrenciaAS
	java:module/CategorizacaoOcorrenciaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.CategorizacaoOcorrenciaAS
	java:global/sisou-sac-okd/sisou-sac-api/CategorizacaoOcorrenciaAS
	java:app/sisou-sac-api/CategorizacaoOcorrenciaAS
	java:module/CategorizacaoOcorrenciaAS

[0m[0m10:49:55,254 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TarefaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TarefaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.tarefa.TarefaConverter
	java:app/sisou-sac-api/TarefaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.tarefa.TarefaConverter
	java:module/TarefaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.tarefa.TarefaConverter
	java:global/sisou-sac-okd/sisou-sac-api/TarefaConverter
	java:app/sisou-sac-api/TarefaConverter
	java:module/TarefaConverter

[0m[0m10:49:55,254 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TipoAtendimentoProconAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TipoAtendimentoProconAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoAtendimentoProconAS
	java:app/sisou-sac-api/TipoAtendimentoProconAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoAtendimentoProconAS
	java:module/TipoAtendimentoProconAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoAtendimentoProconAS
	java:global/sisou-sac-okd/sisou-sac-api/TipoAtendimentoProconAS
	java:app/sisou-sac-api/TipoAtendimentoProconAS
	java:module/TipoAtendimentoProconAS

[0m[0m10:49:55,254 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ManualNormativoConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ManualNormativoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ajuda.ManualNormativoConverter
	java:app/sisou-sac-api/ManualNormativoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ajuda.ManualNormativoConverter
	java:module/ManualNormativoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ajuda.ManualNormativoConverter
	java:global/sisou-sac-okd/sisou-sac-api/ManualNormativoConverter
	java:app/sisou-sac-api/ManualNormativoConverter
	java:module/ManualNormativoConverter

[0m[0m10:49:55,254 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TipoAtendimentoZeroOitocentosAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TipoAtendimentoZeroOitocentosAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoAtendimentoZeroOitocentosAS
	java:app/sisou-sac-api/TipoAtendimentoZeroOitocentosAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoAtendimentoZeroOitocentosAS
	java:module/TipoAtendimentoZeroOitocentosAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoAtendimentoZeroOitocentosAS
	java:global/sisou-sac-okd/sisou-sac-api/TipoAtendimentoZeroOitocentosAS
	java:app/sisou-sac-api/TipoAtendimentoZeroOitocentosAS
	java:module/TipoAtendimentoZeroOitocentosAS

[0m[0m10:49:55,254 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TipoInconsistenciaArquivoCartaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TipoInconsistenciaArquivoCartaAS!br.gov.caixa.bsb.sisou.core.correios.TipoInconsistenciaArquivoCartaAS
	java:app/sisou-sac-api/TipoInconsistenciaArquivoCartaAS!br.gov.caixa.bsb.sisou.core.correios.TipoInconsistenciaArquivoCartaAS
	java:module/TipoInconsistenciaArquivoCartaAS!br.gov.caixa.bsb.sisou.core.correios.TipoInconsistenciaArquivoCartaAS
	java:global/sisou-sac-okd/sisou-sac-api/TipoInconsistenciaArquivoCartaAS
	java:app/sisou-sac-api/TipoInconsistenciaArquivoCartaAS
	java:module/TipoInconsistenciaArquivoCartaAS

[0m[0m10:49:55,254 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'EnvioOcorrenciaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/EnvioOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.EnvioOcorrenciaConverter
	java:app/sisou-sac-api/EnvioOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.EnvioOcorrenciaConverter
	java:module/EnvioOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.EnvioOcorrenciaConverter
	java:global/sisou-sac-okd/sisou-sac-api/EnvioOcorrenciaConverter
	java:app/sisou-sac-api/EnvioOcorrenciaConverter
	java:module/EnvioOcorrenciaConverter

[0m[0m10:49:55,254 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'EquipeOcorrenciaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/EquipeOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.EquipeOcorrenciaAS
	java:app/sisou-sac-api/EquipeOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.EquipeOcorrenciaAS
	java:module/EquipeOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.EquipeOcorrenciaAS
	java:global/sisou-sac-okd/sisou-sac-api/EquipeOcorrenciaAS
	java:app/sisou-sac-api/EquipeOcorrenciaAS
	java:module/EquipeOcorrenciaAS

[0m[0m10:49:55,254 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ConsumidorGovIntegracaoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ConsumidorGovIntegracaoAS!br.gov.caixa.bsb.sisou.core.integracao.consumidorGov.ConsumidorGovIntegracaoAS
	java:app/sisou-sac-api/ConsumidorGovIntegracaoAS!br.gov.caixa.bsb.sisou.core.integracao.consumidorGov.ConsumidorGovIntegracaoAS
	java:module/ConsumidorGovIntegracaoAS!br.gov.caixa.bsb.sisou.core.integracao.consumidorGov.ConsumidorGovIntegracaoAS
	java:global/sisou-sac-okd/sisou-sac-api/ConsumidorGovIntegracaoAS
	java:app/sisou-sac-api/ConsumidorGovIntegracaoAS
	java:module/ConsumidorGovIntegracaoAS

[0m[0m10:49:55,254 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'GrupoTratamentoMetaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/GrupoTratamentoMetaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.GrupoTratamentoMetaAS
	java:app/sisou-sac-api/GrupoTratamentoMetaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.GrupoTratamentoMetaAS
	java:module/GrupoTratamentoMetaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.GrupoTratamentoMetaAS
	java:global/sisou-sac-okd/sisou-sac-api/GrupoTratamentoMetaAS
	java:app/sisou-sac-api/GrupoTratamentoMetaAS
	java:module/GrupoTratamentoMetaAS

[0m[0m10:49:55,254 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PainelIndicadorPessoalAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PainelIndicadorPessoalAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PainelIndicadorPessoalAS
	java:app/sisou-sac-api/PainelIndicadorPessoalAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PainelIndicadorPessoalAS
	java:module/PainelIndicadorPessoalAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PainelIndicadorPessoalAS
	java:global/sisou-sac-okd/sisou-sac-api/PainelIndicadorPessoalAS
	java:app/sisou-sac-api/PainelIndicadorPessoalAS
	java:module/PainelIndicadorPessoalAS

[0m[0m10:49:55,254 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'DadosProconAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/DadosProconAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.DadosProconAS
	java:app/sisou-sac-api/DadosProconAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.DadosProconAS
	java:module/DadosProconAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.DadosProconAS
	java:global/sisou-sac-okd/sisou-sac-api/DadosProconAS
	java:app/sisou-sac-api/DadosProconAS
	java:module/DadosProconAS

[0m[0m10:49:55,254 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'IndicadoresMembrosAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/IndicadoresMembrosAS!br.gov.caixa.bsb.sisou.core.ocorrencia.IndicadoresMembrosAS
	java:app/sisou-sac-api/IndicadoresMembrosAS!br.gov.caixa.bsb.sisou.core.ocorrencia.IndicadoresMembrosAS
	java:module/IndicadoresMembrosAS!br.gov.caixa.bsb.sisou.core.ocorrencia.IndicadoresMembrosAS
	java:global/sisou-sac-okd/sisou-sac-api/IndicadoresMembrosAS
	java:app/sisou-sac-api/IndicadoresMembrosAS
	java:module/IndicadoresMembrosAS

[0m[0m10:49:55,254 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TemplatePerguntaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TemplatePerguntaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TemplatePerguntaAS
	java:app/sisou-sac-api/TemplatePerguntaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TemplatePerguntaAS
	java:module/TemplatePerguntaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TemplatePerguntaAS
	java:global/sisou-sac-okd/sisou-sac-api/TemplatePerguntaAS
	java:app/sisou-sac-api/TemplatePerguntaAS
	java:module/TemplatePerguntaAS

[0m[0m10:49:55,254 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'EmpregadoVinculadoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/EmpregadoVinculadoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.EmpregadoVinculadoAS
	java:app/sisou-sac-api/EmpregadoVinculadoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.EmpregadoVinculadoAS
	java:module/EmpregadoVinculadoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.EmpregadoVinculadoAS
	java:global/sisou-sac-okd/sisou-sac-api/EmpregadoVinculadoAS
	java:app/sisou-sac-api/EmpregadoVinculadoAS
	java:module/EmpregadoVinculadoAS

[0m[0m10:49:55,254 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PromessaRespostaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PromessaRespostaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.PromessaRespostaConverter
	java:app/sisou-sac-api/PromessaRespostaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.PromessaRespostaConverter
	java:module/PromessaRespostaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.PromessaRespostaConverter
	java:global/sisou-sac-okd/sisou-sac-api/PromessaRespostaConverter
	java:app/sisou-sac-api/PromessaRespostaConverter
	java:module/PromessaRespostaConverter

[0m[0m10:49:55,255 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'RecuperarOcorrenciaExternaBacen' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/RecuperarOcorrenciaExternaBacen!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.RecuperarOcorrenciaExternaBacen
	java:app/sisou-sac-api/RecuperarOcorrenciaExternaBacen!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.RecuperarOcorrenciaExternaBacen
	java:module/RecuperarOcorrenciaExternaBacen!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.RecuperarOcorrenciaExternaBacen
	java:global/sisou-sac-okd/sisou-sac-api/RecuperarOcorrenciaExternaBacen
	java:app/sisou-sac-api/RecuperarOcorrenciaExternaBacen
	java:module/RecuperarOcorrenciaExternaBacen

[0m[0m10:49:55,255 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'EquipeAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/EquipeAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.EquipeAS
	java:app/sisou-sac-api/EquipeAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.EquipeAS
	java:module/EquipeAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.EquipeAS
	java:global/sisou-sac-okd/sisou-sac-api/EquipeAS
	java:app/sisou-sac-api/EquipeAS
	java:module/EquipeAS

[0m[0m10:49:55,255 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TipoMensagemSMSConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TipoMensagemSMSConverter!br.gov.caixa.bsb.sisou.core.comum.converter.sms.TipoMensagemSMSConverter
	java:app/sisou-sac-api/TipoMensagemSMSConverter!br.gov.caixa.bsb.sisou.core.comum.converter.sms.TipoMensagemSMSConverter
	java:module/TipoMensagemSMSConverter!br.gov.caixa.bsb.sisou.core.comum.converter.sms.TipoMensagemSMSConverter
	java:global/sisou-sac-okd/sisou-sac-api/TipoMensagemSMSConverter
	java:app/sisou-sac-api/TipoMensagemSMSConverter
	java:module/TipoMensagemSMSConverter

[0m[0m10:49:55,255 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'JustificativaProrrogacaoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/JustificativaProrrogacaoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.JustificativaProrrogacaoAS
	java:app/sisou-sac-api/JustificativaProrrogacaoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.JustificativaProrrogacaoAS
	java:module/JustificativaProrrogacaoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.JustificativaProrrogacaoAS
	java:global/sisou-sac-okd/sisou-sac-api/JustificativaProrrogacaoAS
	java:app/sisou-sac-api/JustificativaProrrogacaoAS
	java:module/JustificativaProrrogacaoAS

[0m[0m10:49:55,255 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'CausaRaizAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/CausaRaizAS!br.gov.caixa.bsb.sisou.core.administracao.especificacoes.CausaRaizAS
	java:app/sisou-sac-api/CausaRaizAS!br.gov.caixa.bsb.sisou.core.administracao.especificacoes.CausaRaizAS
	java:module/CausaRaizAS!br.gov.caixa.bsb.sisou.core.administracao.especificacoes.CausaRaizAS
	java:global/sisou-sac-okd/sisou-sac-api/CausaRaizAS
	java:app/sisou-sac-api/CausaRaizAS
	java:module/CausaRaizAS

[0m[0m10:49:55,255 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'NaturezaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/NaturezaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.NaturezaConverter
	java:app/sisou-sac-api/NaturezaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.NaturezaConverter
	java:module/NaturezaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.NaturezaConverter
	java:global/sisou-sac-okd/sisou-sac-api/NaturezaConverter
	java:app/sisou-sac-api/NaturezaConverter
	java:module/NaturezaConverter

[0m[0m10:49:55,255 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ParametroSistemaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ParametroSistemaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ParametroSistemaAS
	java:app/sisou-sac-api/ParametroSistemaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ParametroSistemaAS
	java:module/ParametroSistemaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ParametroSistemaAS
	java:global/sisou-sac-okd/sisou-sac-api/ParametroSistemaAS
	java:app/sisou-sac-api/ParametroSistemaAS
	java:module/ParametroSistemaAS

[0m[0m10:49:55,255 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ProblemaComunicacaoConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ProblemaComunicacaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ProblemaComunicacaoConverter
	java:app/sisou-sac-api/ProblemaComunicacaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ProblemaComunicacaoConverter
	java:module/ProblemaComunicacaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ProblemaComunicacaoConverter
	java:global/sisou-sac-okd/sisou-sac-api/ProblemaComunicacaoConverter
	java:app/sisou-sac-api/ProblemaComunicacaoConverter
	java:module/ProblemaComunicacaoConverter

[0m[0m10:49:55,255 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TipoAtendimentoProconConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TipoAtendimentoProconConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.TipoAtendimentoProconConverter
	java:app/sisou-sac-api/TipoAtendimentoProconConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.TipoAtendimentoProconConverter
	java:module/TipoAtendimentoProconConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.TipoAtendimentoProconConverter
	java:global/sisou-sac-okd/sisou-sac-api/TipoAtendimentoProconConverter
	java:app/sisou-sac-api/TipoAtendimentoProconConverter
	java:module/TipoAtendimentoProconConverter

[0m[0m10:49:55,255 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TratamentoOcorrenciaExternaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TratamentoOcorrenciaExternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.tratarocorrencia.TratamentoOcorrenciaExternaConverter
	java:app/sisou-sac-api/TratamentoOcorrenciaExternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.tratarocorrencia.TratamentoOcorrenciaExternaConverter
	java:module/TratamentoOcorrenciaExternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.tratarocorrencia.TratamentoOcorrenciaExternaConverter
	java:global/sisou-sac-okd/sisou-sac-api/TratamentoOcorrenciaExternaConverter
	java:app/sisou-sac-api/TratamentoOcorrenciaExternaConverter
	java:module/TratamentoOcorrenciaExternaConverter

[0m[0m10:49:55,255 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TipoMovimentacaoTextoComplementarAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TipoMovimentacaoTextoComplementarAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoMovimentacaoTextoComplementarAS
	java:app/sisou-sac-api/TipoMovimentacaoTextoComplementarAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoMovimentacaoTextoComplementarAS
	java:module/TipoMovimentacaoTextoComplementarAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoMovimentacaoTextoComplementarAS
	java:global/sisou-sac-okd/sisou-sac-api/TipoMovimentacaoTextoComplementarAS
	java:app/sisou-sac-api/TipoMovimentacaoTextoComplementarAS
	java:module/TipoMovimentacaoTextoComplementarAS

[0m[0m10:49:55,255 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'LoteReciboServicoCartaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/LoteReciboServicoCartaAS!br.gov.caixa.bsb.sisou.core.correios.LoteReciboServicoCartaAS
	java:app/sisou-sac-api/LoteReciboServicoCartaAS!br.gov.caixa.bsb.sisou.core.correios.LoteReciboServicoCartaAS
	java:module/LoteReciboServicoCartaAS!br.gov.caixa.bsb.sisou.core.correios.LoteReciboServicoCartaAS
	java:global/sisou-sac-okd/sisou-sac-api/LoteReciboServicoCartaAS
	java:app/sisou-sac-api/LoteReciboServicoCartaAS
	java:module/LoteReciboServicoCartaAS

[0m[0m10:49:55,255 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MovimentacaoOcorrenciaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/MovimentacaoOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.MovimentacaoOcorrenciaAS
	java:app/sisou-sac-api/MovimentacaoOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.MovimentacaoOcorrenciaAS
	java:module/MovimentacaoOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.MovimentacaoOcorrenciaAS
	java:global/sisou-sac-okd/sisou-sac-api/MovimentacaoOcorrenciaAS
	java:app/sisou-sac-api/MovimentacaoOcorrenciaAS
	java:module/MovimentacaoOcorrenciaAS

[0m[0m10:49:55,255 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ParametroOcorrenciaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ParametroOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ParametroOcorrenciaAS
	java:app/sisou-sac-api/ParametroOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ParametroOcorrenciaAS
	java:module/ParametroOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ParametroOcorrenciaAS
	java:global/sisou-sac-okd/sisou-sac-api/ParametroOcorrenciaAS
	java:app/sisou-sac-api/ParametroOcorrenciaAS
	java:module/ParametroOcorrenciaAS

[0m[0m10:49:55,255 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'GerarMinuta' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/GerarMinuta!br.gov.caixa.bsb.sisou.core.ocorrencia.minuta.GerarMinuta
	java:app/sisou-sac-api/GerarMinuta!br.gov.caixa.bsb.sisou.core.ocorrencia.minuta.GerarMinuta
	java:module/GerarMinuta!br.gov.caixa.bsb.sisou.core.ocorrencia.minuta.GerarMinuta
	java:global/sisou-sac-okd/sisou-sac-api/GerarMinuta
	java:app/sisou-sac-api/GerarMinuta
	java:module/GerarMinuta

[0m[0m10:49:55,255 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'EmailTemplateInternaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/EmailTemplateInternaAS!br.gov.caixa.bsb.sisou.core.comum.EmailTemplateInternaAS
	java:app/sisou-sac-api/EmailTemplateInternaAS!br.gov.caixa.bsb.sisou.core.comum.EmailTemplateInternaAS
	java:module/EmailTemplateInternaAS!br.gov.caixa.bsb.sisou.core.comum.EmailTemplateInternaAS
	java:global/sisou-sac-okd/sisou-sac-api/EmailTemplateInternaAS
	java:app/sisou-sac-api/EmailTemplateInternaAS
	java:module/EmailTemplateInternaAS

[0m[0m10:49:55,256 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MensagemOcorrenciaSMSAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/MensagemOcorrenciaSMSAS!br.gov.caixa.bsb.sisou.core.sms.MensagemOcorrenciaSMSAS
	java:app/sisou-sac-api/MensagemOcorrenciaSMSAS!br.gov.caixa.bsb.sisou.core.sms.MensagemOcorrenciaSMSAS
	java:module/MensagemOcorrenciaSMSAS!br.gov.caixa.bsb.sisou.core.sms.MensagemOcorrenciaSMSAS
	java:global/sisou-sac-okd/sisou-sac-api/MensagemOcorrenciaSMSAS
	java:app/sisou-sac-api/MensagemOcorrenciaSMSAS
	java:module/MensagemOcorrenciaSMSAS

[0m[0m10:49:55,256 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ProrrogacaoOcorrenciaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ProrrogacaoOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ProrrogacaoOcorrenciaAS
	java:app/sisou-sac-api/ProrrogacaoOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ProrrogacaoOcorrenciaAS
	java:module/ProrrogacaoOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ProrrogacaoOcorrenciaAS
	java:global/sisou-sac-okd/sisou-sac-api/ProrrogacaoOcorrenciaAS
	java:app/sisou-sac-api/ProrrogacaoOcorrenciaAS
	java:module/ProrrogacaoOcorrenciaAS

[0m[0m10:49:55,256 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'SecurityConfig' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/SecurityConfig!br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig
	java:app/sisou-sac-api/SecurityConfig!br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig
	java:module/SecurityConfig!br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig
	java:global/sisou-sac-okd/sisou-sac-api/SecurityConfig
	java:app/sisou-sac-api/SecurityConfig
	java:module/SecurityConfig

[0m[0m10:49:55,256 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'IntegracaoIncomingBacenSisouAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/IntegracaoIncomingBacenSisouAS!br.gov.caixa.bsb.sisou.core.integracao.bacen.IIntegracaoIncomingBacenSisouAS
	java:app/sisou-sac-api/IntegracaoIncomingBacenSisouAS!br.gov.caixa.bsb.sisou.core.integracao.bacen.IIntegracaoIncomingBacenSisouAS
	java:module/IntegracaoIncomingBacenSisouAS!br.gov.caixa.bsb.sisou.core.integracao.bacen.IIntegracaoIncomingBacenSisouAS
	java:global/sisou-sac-okd/sisou-sac-api/IntegracaoIncomingBacenSisouAS
	java:app/sisou-sac-api/IntegracaoIncomingBacenSisouAS
	java:module/IntegracaoIncomingBacenSisouAS

[0m[0m10:49:55,256 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'LoteCartaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/LoteCartaAS!br.gov.caixa.bsb.sisou.core.correios.LoteCartaAS
	java:app/sisou-sac-api/LoteCartaAS!br.gov.caixa.bsb.sisou.core.correios.LoteCartaAS
	java:module/LoteCartaAS!br.gov.caixa.bsb.sisou.core.correios.LoteCartaAS
	java:global/sisou-sac-okd/sisou-sac-api/LoteCartaAS
	java:app/sisou-sac-api/LoteCartaAS
	java:module/LoteCartaAS

[0m[0m10:49:55,256 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'JustificativaProrrogacaoConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/JustificativaProrrogacaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.justificativaprorrogacao.JustificativaProrrogacaoConverter
	java:app/sisou-sac-api/JustificativaProrrogacaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.justificativaprorrogacao.JustificativaProrrogacaoConverter
	java:module/JustificativaProrrogacaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.justificativaprorrogacao.JustificativaProrrogacaoConverter
	java:global/sisou-sac-okd/sisou-sac-api/JustificativaProrrogacaoConverter
	java:app/sisou-sac-api/JustificativaProrrogacaoConverter
	java:module/JustificativaProrrogacaoConverter

[0m[0m10:49:55,256 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ReclameAquiAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ReclameAquiAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ReclameAquiAS
	java:app/sisou-sac-api/ReclameAquiAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ReclameAquiAS
	java:module/ReclameAquiAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ReclameAquiAS
	java:global/sisou-sac-okd/sisou-sac-api/ReclameAquiAS
	java:app/sisou-sac-api/ReclameAquiAS
	java:module/ReclameAquiAS

[0m[0m10:49:55,256 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'OcorrenciaOuvidoriaSacWSAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaOuvidoriaSacWSAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaOuvidoriaSacWSAS
	java:app/sisou-sac-api/OcorrenciaOuvidoriaSacWSAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaOuvidoriaSacWSAS
	java:module/OcorrenciaOuvidoriaSacWSAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaOuvidoriaSacWSAS
	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaOuvidoriaSacWSAS
	java:app/sisou-sac-api/OcorrenciaOuvidoriaSacWSAS
	java:module/OcorrenciaOuvidoriaSacWSAS

[0m[0m10:49:55,256 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'OrientacaoAtendimentoConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/OrientacaoAtendimentoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.OrientacaoAtendimentoConverter
	java:app/sisou-sac-api/OrientacaoAtendimentoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.OrientacaoAtendimentoConverter
	java:module/OrientacaoAtendimentoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.OrientacaoAtendimentoConverter
	java:global/sisou-sac-okd/sisou-sac-api/OrientacaoAtendimentoConverter
	java:app/sisou-sac-api/OrientacaoAtendimentoConverter
	java:module/OrientacaoAtendimentoConverter

[0m[0m10:49:55,256 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'OrigemTipoFormatoRespostaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/OrigemTipoFormatoRespostaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.OrigemTipoFormatoRespostaAS
	java:app/sisou-sac-api/OrigemTipoFormatoRespostaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.OrigemTipoFormatoRespostaAS
	java:module/OrigemTipoFormatoRespostaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.OrigemTipoFormatoRespostaAS
	java:global/sisou-sac-okd/sisou-sac-api/OrigemTipoFormatoRespostaAS
	java:app/sisou-sac-api/OrigemTipoFormatoRespostaAS
	java:module/OrigemTipoFormatoRespostaAS

[0m[0m10:49:55,256 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'CancelarProrrogacaoPrazoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/CancelarProrrogacaoPrazoAS!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.CancelarProrrogacaoPrazoAS
	java:app/sisou-sac-api/CancelarProrrogacaoPrazoAS!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.CancelarProrrogacaoPrazoAS
	java:module/CancelarProrrogacaoPrazoAS!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.CancelarProrrogacaoPrazoAS
	java:global/sisou-sac-okd/sisou-sac-api/CancelarProrrogacaoPrazoAS
	java:app/sisou-sac-api/CancelarProrrogacaoPrazoAS
	java:module/CancelarProrrogacaoPrazoAS

[0m[0m10:49:55,256 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'EquipeTratamentoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/EquipeTratamentoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.EquipeTratamentoAS
	java:app/sisou-sac-api/EquipeTratamentoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.EquipeTratamentoAS
	java:module/EquipeTratamentoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.EquipeTratamentoAS
	java:global/sisou-sac-okd/sisou-sac-api/EquipeTratamentoAS
	java:app/sisou-sac-api/EquipeTratamentoAS
	java:module/EquipeTratamentoAS

[0m[0m10:49:55,256 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TipoOcorrenciaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TipoOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.TipoOcorrenciaConverter
	java:app/sisou-sac-api/TipoOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.TipoOcorrenciaConverter
	java:module/TipoOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.TipoOcorrenciaConverter
	java:global/sisou-sac-okd/sisou-sac-api/TipoOcorrenciaConverter
	java:app/sisou-sac-api/TipoOcorrenciaConverter
	java:module/TipoOcorrenciaConverter

[0m[0m10:49:55,256 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MotivoRetornoConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/MotivoRetornoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.MotivoRetornoConverter
	java:app/sisou-sac-api/MotivoRetornoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.MotivoRetornoConverter
	java:module/MotivoRetornoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.MotivoRetornoConverter
	java:global/sisou-sac-okd/sisou-sac-api/MotivoRetornoConverter
	java:app/sisou-sac-api/MotivoRetornoConverter
	java:module/MotivoRetornoConverter

[0m[0m10:49:55,256 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'CriarOcorrenciaExternaBacen' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/CriarOcorrenciaExternaBacen!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.CriarOcorrenciaExternaBacen
	java:app/sisou-sac-api/CriarOcorrenciaExternaBacen!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.CriarOcorrenciaExternaBacen
	java:module/CriarOcorrenciaExternaBacen!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.CriarOcorrenciaExternaBacen
	java:global/sisou-sac-okd/sisou-sac-api/CriarOcorrenciaExternaBacen
	java:app/sisou-sac-api/CriarOcorrenciaExternaBacen
	java:module/CriarOcorrenciaExternaBacen

[0m[0m10:49:55,256 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ComboAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ComboAS!br.gov.caixa.bsb.sisou.core.comum.ComboAS
	java:app/sisou-sac-api/ComboAS!br.gov.caixa.bsb.sisou.core.comum.ComboAS
	java:module/ComboAS!br.gov.caixa.bsb.sisou.core.comum.ComboAS
	java:global/sisou-sac-okd/sisou-sac-api/ComboAS
	java:app/sisou-sac-api/ComboAS
	java:module/ComboAS

[0m[0m10:49:55,668 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-1) WFLYJCA0004: Deploying JDBC-compliant driver class oracle.jdbc.OracleDriver (version 19.28)
[0m[0m10:49:55,764 INFO  [org.jboss.weld.Version] (MSC service thread 1-1) WELD-000900: 3.1.10 (redhat)
[0m[0m10:49:55,852 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-1) WFLYJCA0018: Started Driver service with driver-name = sisou-sac-okd.ear_oracle.jdbc.OracleDriver_19_28
[0m[33m10:49:56,885 WARN  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0131: Jakarta Enterprise Beans br.gov.caixa.bsb.sisou.core.ocorrencia.TratamentoOcorrenciaExternaAS should not have a final or static method (verificaSeHouveAlteracaoCancelamentoClassificacao)
[0m[33m10:49:57,177 WARN  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0131: Jakarta Enterprise Beans br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaOuvidoriaAS should not have a final or static method (instanciarArrayParaSetAnexos)
[0m[33m10:49:57,264 WARN  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0131: Jakarta Enterprise Beans br.gov.caixa.bsb.sisou.core.comum.converter.tarefa.ProrrogacaoTarefaConverter should not have a final or static method (convertToProrrogacaoOcorrenciaDTO)
[0m[33m10:49:57,267 WARN  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0131: Jakarta Enterprise Beans br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaSacAS should not have a final or static method (guessMimeTypeFromName)
[0m[33m10:49:57,267 WARN  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0131: Jakarta Enterprise Beans br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaSacAS should not have a final or static method (extrairExtensaoFromName)
[0m[33m10:49:57,267 WARN  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0131: Jakarta Enterprise Beans br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaSacAS should not have a final or static method (removerAcentoLocal)
[0m[33m10:49:57,578 WARN  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0131: Jakarta Enterprise Beans br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.CriarOcorrenciaExternaBacen should not have a final or static method (matchDeatiUser)
[0m[0m10:49:57,653 INFO  [org.jipijapa] (MSC service thread 1-2) JIPIORMV53020253: Second level cache enabled for sisou-sac-okd.ear/sisou-sac-api.war#sisouDB
[0m[33m10:49:58,055 WARN  [org.jboss.as.jaxrs] (MSC service thread 1-2) WFLYRS0018: Explicit usage of Jackson annotation in a Jakarta RESTful Web Services deployment; the system will disable Jakarta JSON Binding processing for the current deployment. Consider setting the 'resteasy.preferJacksonOverJsonB' property to 'false' to restore Jakarta JSON Binding.
[0m[0m10:49:58,080 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-2) WFLYJCA0004: Deploying JDBC-compliant driver class oracle.jdbc.OracleDriver (version 19.28)
[0m[0m10:49:58,181 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-1) WFLYJCA0018: Started Driver service with driver-name = sisou-sac-api.war_oracle.jdbc.OracleDriver_19_28
[0m[0m10:49:58,257 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 74) WFLYJPA0010: Starting Persistence Unit (phase 2 of 2) Service 'sisou-sac-okd.ear/sisou-sac-api.war#sisouDB'
[0m[0m10:49:58,353 INFO  [org.hibernate.dialect.Dialect] (ServerService Thread Pool -- 74) HHH000400: Using dialect: org.hibernate.dialect.Oracle12cDialect
[0m[0m10:49:58,361 INFO  [org.hibernate.engine.jdbc.env.internal.LobCreatorBuilderImpl] (ServerService Thread Pool -- 74) HHH000422: Disabling contextual LOB creation as connection was null
[0m[0m10:49:58,364 INFO  [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 74) HHH000270: Type registration [byte[]] overrides previous : org.hibernate.type.BinaryType@592e56f1
[0m[0m10:49:58,364 INFO  [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 74) HHH000270: Type registration [[B] overrides previous : org.hibernate.type.BinaryType@592e56f1
[0m[0m10:49:58,364 INFO  [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 74) HHH000270: Type registration [Byte[]] overrides previous : org.hibernate.type.WrapperBinaryType@5415bb2
[0m[0m10:49:58,364 INFO  [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 74) HHH000270: Type registration [[Ljava.lang.Byte;] overrides previous : org.hibernate.type.WrapperBinaryType@5415bb2
[0m[0m10:49:58,368 INFO  [org.hibernate.envers.boot.internal.EnversServiceImpl] (ServerService Thread Pool -- 74) Envers integration enabled? : true
[0m[33m10:50:00,279 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 74) HHH000038: Composite-id class does not override equals(): br.gov.caixa.bsb.sisou.core.comum.persistencia.modelo.administracao.parametrizacao.ParametroAvaliacaoOrigem
[0m[33m10:50:00,280 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 74) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.bsb.sisou.core.comum.persistencia.modelo.administracao.parametrizacao.ParametroAvaliacaoOrigem
[0m[33m10:50:00,284 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 74) HHH000038: Composite-id class does not override equals(): br.gov.caixa.bsb.sisou.core.comum.persistencia.modelo.administracao.parametrizacao.ParametroAvaliacaoNatureza
[0m[33m10:50:00,284 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 74) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.bsb.sisou.core.comum.persistencia.modelo.administracao.parametrizacao.ParametroAvaliacaoNatureza
[0m[33m10:50:00,284 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 74) HHH000038: Composite-id class does not override equals(): br.gov.caixa.bsb.sisou.core.comum.persistencia.modelo.administracao.parametrizacao.ParametroAvaliacaoUnidade
[0m[33m10:50:00,284 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 74) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.bsb.sisou.core.comum.persistencia.modelo.administracao.parametrizacao.ParametroAvaliacaoUnidade
[0m[33m10:50:04,167 WARN  [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (ServerService Thread Pool -- 74) IJ000407: No lazy enlistment available for OracleSisouDS
[0m
