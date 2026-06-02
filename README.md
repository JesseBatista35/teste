o pod subiu

o log contnua errado mais o pod compleou 

/opt/jboss/bin/standalone.conf: line 37: =org.jboss.byteman: command not found
=========================================================================

  JBoss Bootstrap Environment

  JBOSS_HOME: /opt/jboss

  JAVA: /usr/lib/jvm/jre-17-openjdk-17.0.7.0.7-3.el8.x86_64/bin/java

  JAVA_OPTS:  -Xlog:gc*:file="/opt/jboss/standalone/log/gc.log":time,uptimemillis:filecount=5,filesize=3M -Djdk.serialFilter="maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000" -Xms1024m -Xmx2048m -XX:MetaspaceSize=96m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs= -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar:/opt/jboss/modules/system/layers/base/org/jboss/log4j/logmanager/main/log4j-jboss-logmanager-1.2.0.Final-redhat-00001.jar:/opt/jboss/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Dsun.util.logging.disableCallerCheck=true -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=sisou -Delastic.apm.environment=DES -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=https://apm-server-devops.apps.produtos4.caixa/ -Delastic.apm.global_labels=deployment=sisou-vivavoz-okd-des -Djava.net.useSystemProxies=false -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=localhost\|127.0.0.1\|*.caixa  --add-exports=java.base/sun.nio.ch=ALL-UNNAMED --add-exports=jdk.unsupported/sun.misc=ALL-UNNAMED --add-exports=jdk.unsupported/sun.reflect=ALL-UNNAMED --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED

=========================================================================

Jun 02, 2026 8:34:06 PM java.lang.System$LoggerFinder lambda$accessProvider$0
WARNING: Failed to instantiate LoggerFinder provider; Using default.
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-06-02 20:34:07.006 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
[0m20:34:07,827 INFO  [org.jboss.modules] (main) JBoss Modules version 1.12.2.Final-redhat-00001
[0m[0m20:34:08,231 INFO  [org.jboss.msc] (main) JBoss MSC version 1.4.12.Final-redhat-00001
[0m[0m20:34:08,239 INFO  [org.jboss.threads] (main) JBoss Threads version 2.4.0.Final-redhat-00001
[0m[0m20:34:08,439 INFO  [org.jboss.as] (MSC service thread 1-1) WFLYSRV0049: JBoss EAP 7.4.14.GA (WildFly Core 15.0.32.Final-redhat-00001) starting
[0m[0m20:34:10,238 INFO  [org.wildfly.security] (ServerService Thread Pool -- 26) ELY00001: WildFly Elytron version 1.15.20.Final-redhat-00001
[0m[0m20:34:12,024 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 32) WFLYDR0001: Content added at location /opt/jboss/standalone/data/content/d2/ef7fd5eb4fb2797429d07356f51bff1fac7e55/content
[0m[0m20:34:12,102 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Creating http management service using socket-binding (management-http)
[0m[0m20:34:12,111 INFO  [org.xnio] (MSC service thread 1-1) XNIO version 3.8.11.SP1-redhat-00001
[0m[0m20:34:12,115 INFO  [org.xnio.nio] (MSC service thread 1-1) XNIO NIO Implementation Version 3.8.11.SP1-redhat-00001
[0m[33m20:34:12,203 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 70) WFLYTX0013: The node-identifier attribute on the /subsystem=transactions is set to the default value. This is a danger for environments running multiple servers. Please make sure the attribute value is unique.
[0m[0m20:34:12,204 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 52) WFLYCLINF0001: Activating Infinispan subsystem.
[0m[0m20:34:12,205 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 53) WFLYIO001: Worker 'default' has auto-configured to 2 IO threads with 16 max task threads based on your 1 available processors
[0m[0m20:34:12,205 INFO  [org.wildfly.extension.health] (ServerService Thread Pool -- 50) WFLYHEALTH0001: Activating Base Health Subsystem
[0m[0m20:34:12,206 INFO  [org.jboss.as.clustering.jgroups] (ServerService Thread Pool -- 57) WFLYCLJG0001: Activating JGroups subsystem. JGroups version 4.2.23
[0m[0m20:34:12,303 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 63) WFLYNAM0001: Activating Naming Subsystem
[0m[0m20:34:12,303 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 54) WFLYRS0016: RESTEasy version 3.15.8.Final-redhat-00001
[0m[0m20:34:12,306 INFO  [org.jboss.as.webservices] (ServerService Thread Pool -- 72) WFLYWS0002: Activating WebServices Extension
[0m[0m20:34:12,306 INFO  [org.wildfly.extension.metrics] (ServerService Thread Pool -- 62) WFLYMETRICS0001: Activating Base Metrics Subsystem
[0m[0m20:34:12,307 INFO  [org.jboss.as.jsf] (ServerService Thread Pool -- 60) WFLYJSF0007: Activated the following Jakarta Server Faces Implementations: [main]
[0m[0m20:34:12,307 INFO  [org.wildfly.iiop.openjdk] (ServerService Thread Pool -- 51) WFLYIIOP0001: Activating IIOP Subsystem
[0m[0m20:34:12,503 INFO  [org.jboss.remoting] (MSC service thread 1-1) JBoss Remoting version 5.0.27.Final-redhat-00001
[0m[0m20:34:12,505 INFO  [org.jboss.as.connector] (MSC service thread 1-2) WFLYJCA0009: Starting Jakarta Connectors Subsystem (WildFly/IronJacamar 1.5.15.Final-redhat-00001)
[0m[0m20:34:12,810 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0003: Undertow 2.2.28.SP1-redhat-00001 starting
[0m[0m20:34:12,904 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 71) WFLYUT0014: Creating file handler for path '/opt/jboss/welcome-content' with options [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
[0m[0m20:34:13,040 INFO  [org.jboss.as.ejb3] (MSC service thread 1-1) WFLYEJB0482: Strict pool mdb-strict-max-pool is using a max instance size of 4 (per class), which is derived from the number of CPUs on this host.
[0m[0m20:34:13,040 INFO  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0481: Strict pool slsb-strict-max-pool is using a max instance size of 16 (per class), which is derived from thread worker pool sizing.
[0m[0m20:34:13,048 INFO  [org.jboss.as.naming] (MSC service thread 1-1) WFLYNAM0003: Starting Naming Service
[0m[0m20:34:13,202 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-2) WFLYMAIL0001: Bound mail session [java:jboss/mail/Default]
[0m[33m20:34:13,328 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-2) WFLYELY00023: KeyStore file '/opt/jboss/standalone/configuration/application.keystore' does not exist. Used blank.
[0m


o deploy passou


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
SISOU-vivavoz-okd
/
SISOU-vivavoz-okd-2.0.0.3-VIVA-SNAPSHOT(9)
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
SISOU-vivavoz-okd


SISOU-vivavoz-okd-2.0.0.3-VIVA-SNAPSHOT(9)


Pipeline

Variables

History
Release
Stages
Succeeded
Not deployed
Not deployed
Not deployed
Not deployed
1 pipelines found

Expanded

Row 3

Collapsed

Showing 8 deployments

16 pipelines found

Select a release pipeline to view its releases

16 pipelines found

Select a release pipeline to view its releases

1 pipelines found

Select a release pipeline to view its releases

1 pipelines found

Row 2

Row 2

Showing filters 1 through 2

Expanded

Row 3

Collapsed

Row 2

Row 2




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
SISOU-vivavoz-okd
/
SISOU-vivavoz-okd-2.0.0.3-VIVA-SNAPSHOT(9)
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
SISOU-vivavoz-okd

SISOU-vivavoz-okd-2.0.0.3-VIVA-SNAPSHOT(9)
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
Agent job
Started: 02/06/2026, 20:33:23
Pool:
Release-Linux-OKD4
·
Agent: azp-ads-agent-release-5cd876f98-4fmdt

3m 2s

Initialize job
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
1s

Recupera Pacote
·
succeeded
<1s

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
2s

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
succeeded
<1s

Configurando o ConfigMap java-config
·
succeeded
<1s

Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP
·
succeeded
20s

Concedendo Acesso OKD
·
succeeded
<1s

Verificando IP de Saída
·
succeeded
<1s

Configurando IP de Saída
·
succeeded
<1s

Cadastrando no Portal IIF
·
succeeded
<1s

Verificando Status do Deployment
·
succeeded
2m 14s

Logs da Aplicação
·
succeeded
<1s

Resumo da Release
·
succeeded
<1s

Coletando dados da imagem
·
succeeded
9s

Atualizando versão no PortalIF
·
succeeded
<1s

Realizando Logout OKD
·
succeeded
<1s

Finalize Job
·
succeeded
<1s
Expanded

Row 3

Collapsed

Showing 8 deployments

16 pipelines found

Select a release pipeline to view its releases

16 pipelines found

Select a release pipeline to view its releases

1 pipelines found

Select a release pipeline to view its releases

1 pipelines found

Row 2

Row 2

Showing filters 1 through 2

Expanded

Row 3

Collapsed

Row 2

Row 2

EC DES




