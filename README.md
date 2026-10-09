O projeto sipcs-login-unico-jboss-okd,subiu com sucesso no OKD, porém ainda está dando varios, já foram abertas várias reqs para correção e nenhuma delas funcionou. portanto solicito uma reunião com o setor responsável para prosseguir com a correção.
Segue link da release contendo o html estatico: https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-pipeline-progress&releaseId=535648


segue dados da reunião:
data: 13/10
Horario: 15:00
link: https://teams.microsoft.com/meet/269186797000423?p=r1b6GJ9iE4FWk2ObHq

Segue lista de reqs já abertas para correção:
REQ000146385298
REQ000146297101
REQ000146191619



Criando diretorio '/opt/jboss/standalone/configuration/.secrets'...
Configuracao do vault realizada
Arquivo secrets.properties encontrado, carregando propriedades...
/opt/jboss/bin/standalone.conf: line 37: =org.jboss.byteman: command not found
=========================================================================

  JBoss Bootstrap Environment

  JBOSS_HOME: /opt/jboss

  JAVA: /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.372.b07-1.el7_9.x86_64/jre/bin/java

  JAVA_OPTS:  -verbose:gc -Xloggc:"/opt/jboss/standalone/log/gc.log" -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms2048m -Xmx2048m -XX:MetaspaceSize=1024m -XX:MaxMetaspaceSize=1024m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs= -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/p:/opt/jboss/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/p:/opt/jboss/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=sipcs -Delastic.apm.environment=DES -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=sipcs-login-unico-jboss-okd-des -Djava.net.useSystemProxies=false -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=localhost\|127.0.0.1\|*.caixa 

=========================================================================

OpenJDK 64-Bit Server VM warning: If the number of processors is expected to increase from one, then you should configure the number of parallel GC threads appropriately using -XX:ParallelGCThreads=N
2026-10-02 18:55:26.955 [main] INFO co.elastic.apm.agent.util.JmxUtils - Found JVM-specific OperatingSystemMXBean interface: com.sun.management.OperatingSystemMXBean
2026-10-02 18:55:27.034 [main] INFO co.elastic.apm.agent.configuration.StartupInfo - Starting Elastic APM 1.15.0 as sipcs on Java 1.8.0_372 (Red Hat, Inc.) Linux 6.1.18-200.fc37.x86_64
2026-10-02 18:55:27.047 [main] INFO co.elastic.apm.agent.impl.ElasticApmTracer - Tracer switched to RUNNING state
[0m18:55:28,683 INFO  [org.jboss.modules] (main) JBoss Modules version 1.12.0.Final-redhat-00001
[0m[0m18:55:29,193 INFO  [org.jboss.msc] (main) JBoss MSC version 1.4.12.Final-redhat-00001
[0m[0m18:55:29,281 INFO  [org.jboss.threads] (main) JBoss Threads version 2.4.0.Final-redhat-00001
[0m[0m18:55:29,583 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0049: JBoss EAP 7.4.11.GA (WildFly Core 15.0.26.Final-redhat-00001) starting
[0m[0m18:55:29,755 INFO  [org.jboss.vfs] (MSC service thread 1-1) VFS000002: Failed to clean existing content for temp file provider of type temp. Enable DEBUG level log to find what caused this
[0m[0m18:55:31,767 INFO  [org.wildfly.security] (ServerService Thread Pool -- 30) ELY00001: WildFly Elytron version 1.15.16.Final-redhat-00001
[0m[0m18:55:31,952 INFO  [stdout] (elastic-apm-server-healthcheck) 2026-10-02 18:55:31.952 [elastic-apm-server-healthcheck] WARN co.elastic.apm.agent.report.ApmServerHealthChecker - Elastic APM server http://apm-server-devops.produtos.caixa/ is not available (connect timed out)
[0m[0m18:55:32,360 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 8) WFLYCTL0033: Extension 'security' is deprecated and may not be supported in future versions
[0m[0m18:55:33,453 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/core-service=management/management-interface=http-interface' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[0m[0m18:55:33,551 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 17) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/subsystem=undertow/server=default-server/https-listener=https' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[0m[0m18:55:34,285 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 10) WFLYDR0001: Content added at location /opt/jboss/standalone/data/content/64/87bf49c6c8e8e0edb2ab731b4290ba4172e29a/content
[0m[0m18:55:34,353 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Creating http management service using socket-binding (management-http)
[0m[0m18:55:34,366 INFO  [org.xnio] (MSC service thread 1-2) XNIO version 3.8.9.Final-redhat-00001
[0m[0m18:55:34,372 INFO  [org.xnio.nio] (MSC service thread 1-2) XNIO NIO Implementation Version 3.8.9.Final-redhat-00001
[0m[33m18:55:34,557 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 74) WFLYTX0013: The node-identifier attribute on the /subsystem=transactions is set to the default value. This is a danger for environments running multiple servers. Please make sure the attribute value is unique.
[0m[0m18:55:34,560 INFO  [org.jboss.as.clustering.jgroups] (ServerService Thread Pool -- 59) WFLYCLJG0001: Activating JGroups subsystem. JGroups version 4.2.11
[0m[0m18:55:34,563 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 54) WFLYCLINF0001: Activating Infinispan subsystem.
[0m[0m18:55:34,565 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 56) WFLYRS0016: RESTEasy version 3.15.7.Final-redhat-00001
[0m[0m18:55:34,566 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 55) WFLYIO001: Worker 'default' has auto-configured to 2 IO threads with 16 max task threads based on your 1 available processors
[0m[0m18:55:34,573 INFO  [org.wildfly.extension.health] (ServerService Thread Pool -- 52) WFLYHEALTH0001: Activating Base Health Subsystem
[0m[0m18:55:34,653 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 66) WFLYNAM0001: Activating Naming Subsystem
[0m[0m18:55:34,654 INFO  [org.jboss.as.security] (ServerService Thread Pool -- 72) WFLYSEC0002: Activating Security Subsystem
[0m[0m18:55:34,658 INFO  [org.wildfly.extension.metrics] (ServerService Thread Pool -- 65) WFLYMETRICS0001: Activating Base Metrics Subsystem
[0m[0m18:55:34,659 INFO  [org.jboss.as.jsf] (ServerService Thread Pool -- 62) WFLYJSF0007: Activated the following Jakarta Server Faces Implementations: [main]
[0m[0m18:55:34,663 INFO  [org.jboss.as.webservices] (ServerService Thread Pool -- 76) WFLYWS0002: Activating WebServices Extension
[0m[0m18:55:34,752 INFO  [org.wildfly.iiop.openjdk] (ServerService Thread Pool -- 53) WFLYIIOP0001: Activating IIOP Subsystem
[0m[0m18:55:34,972 INFO  [org.jboss.as.security] (MSC service thread 1-2) WFLYSEC0001: Current PicketBox version=5.0.3.Final-redhat-00009
[0m[0m18:55:34,972 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 44) WFLYJCA0004: Deploying JDBC-compliant driver class org.h2.Driver (version 1.4)
[0m[0m18:55:35,069 INFO  [org.jboss.as.connector] (MSC service thread 1-1) WFLYJCA0009: Starting Jakarta Connectors Subsystem (WildFly/IronJacamar 1.5.11.Final-redhat-00001)
[0m[0m18:55:35,259 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0003: Undertow 2.2.24.SP1-redhat-00001 starting
[0m[0m18:55:35,463 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 75) WFLYUT0014: Creating file handler for path '/opt/jboss/welcome-content' with options [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
[0m[0m18:55:35,556 INFO  [org.jboss.remoting] (MSC service thread 1-1) JBoss Remoting version 5.0.27.Final-redhat-00001
[0m[0m18:55:36,055 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 44) WFLYJCA0004: Deploying JDBC-compliant driver class oracle.jdbc.OracleDriver (version 12.1)
[0m[0m18:55:36,065 INFO  [org.jboss.as.ejb3] (MSC service thread 1-1) WFLYEJB0481: Strict pool slsb-strict-max-pool is using a max instance size of 16 (per class), which is derived from thread worker pool sizing.
[0m[0m18:55:36,065 INFO  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0482: Strict pool mdb-strict-max-pool is using a max instance size of 4 (per class), which is derived from the number of CPUs on this host.
[0m[0m18:55:36,066 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-1) WFLYJCA0018: Started Driver service with driver-name = h2
[0m[0m18:55:36,163 INFO  [org.jboss.as.naming] (MSC service thread 1-2) WFLYNAM0003: Starting Naming Service
[0m[0m18:55:36,259 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-1) WFLYJCA0018: Started Driver service with driver-name = oracle
[0m[0m18:55:36,356 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-2) WFLYMAIL0001: Bound mail session [java:jboss/mail/Default]
[0m[33m18:55:36,368 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-2) WFLYELY00023: KeyStore file '/opt/jboss/standalone/configuration/application.keystore' does not exist. Used blank.
[0m




Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000081794785
Criado em	 02/10/2026 19:13:48
Criado por	 P744064
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Boa noite!

Conforme analisado, a aplicação está sem contexto, e por este motivo direciona para a página do jboss conforme anexo. Favor verificar.

At.te,

Wellington Silva
ID da Ordem de Trabalho	 WO0000081794785
Criado em	 02/10/2026 18:32:14
Criado por	 P507043
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado(a),



Informamos que sua solicitação foi recebida.  



Nosso SLA para atendimento é de até 24h úteis, analisaremos a solicitação para nos certificarmos que o atendimento está dentro do escopo de atuação da nossa equipe.



Caso seja identificado que o atendimento não corresponde ao nosso escopo, a solicitação será redirecionada à equipe responsável.



Novas informações e atualizações serão registradas diretamente nesta WO.



Atte.



Esteira Devops DES TQS NPRD

ID da Ordem de Trabalho	 WO0000081794785
Criado em	 02/10/2026 18:19:47
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Sexta-feira, 09/10/2026 15:04:05



Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000081750724
Criado em	 29/09/2026 16:11:36
Criado por	 P564449
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Boa tarde, Danilo.

Verificamos que o projeto sipcs-login-unico-jboss-okd foi implantado com sucesso no OKD, e a aplicação responde normalmente pela rota disponibilizada.

Porém, ao acrescentar o contexto /login2, conforme informado, não há resposta. Dessa forma, é necessário verificar a configuração do context root da aplicação no JBoss, pois o contexto /login2 não está sendo disponibilizado no deploy atual.

Qualquer dúvida estou à disposição.

At.te,
Kallebe M. Vieira
Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD
ID da Ordem de Trabalho	 WO0000081750724
Criado em	 29/09/2026 15:45:20
Criado por	 P779123
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Demanda inicial sem viés de falha, erro, degradação ou esgotamento de infraestrutura, serviço, máquina, armazenamento, rotina ou situação que não esteja na iminência de tornar-se incidente. Previsto atendimento em até 24 horas.[CENTRAL-SID]
OBS: Saneamento realizado considerando a nota anterior da equipe técnica que informa atendimento em até 24 horas
ID da Ordem de Trabalho	 WO0000081750724
Criado em	 29/09/2026 15:18:45
Criado por	 P507043
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado(a),



Informamos que sua solicitação foi recebida.  



Nosso SLA para atendimento é de até 24h úteis, analisaremos a solicitação para nos certificarmos que o atendimento está dentro do escopo de atuação da nossa equipe.



Caso seja identificado que o atendimento não corresponde ao nosso escopo, a solicitação será redirecionada à equipe responsável.



Novas informações e atualizações serão registradas diretamente nesta WO.



Atte.



Esteira Devops DES TQS NPRD

ID da Ordem de Trabalho	 WO0000081750724
Criado em	 29/09/2026 15:13:05
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Sexta-feira, 09/10/2026 15:04:24


Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000081719133
Criado em	 24/09/2026 17:09:21
Criado por	 P780925
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezados,

Foi verificado erro no datasource, necessário verificar a configuração e variáveis.

17:52:44,698 INFO [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 44) WFLYJCA0004: Deploying JDBC-compliant driver class org.h2.Driver (version 1.4)
17:52:44,701 ERROR [org.jboss.as.controller.management-operation] (ServerService Thread Pool -- 44) WFLYCTL0013: Operation ("add") failed - address: ([
("subsystem" => "datasources"),
("jdbc-driver" => "oracle")
]) - failure description: "WFLYJCA0115: Module for driver [com.oracle.ojdbc8] or one of it dependencies is missing: [com.oracle.ojdbc8]"
17:52:44,991 INFO [org.jboss.as.security] (MSC service thread 1-2) WFLYSEC0001: Current PicketBox version=5.0.3.Final-redhat-00009
17:52:45,087 INFO [org.jboss.as.connector] (MSC service thread 1-1) WFLYJCA0009: Starting Jakarta Connectors Subsystem (WildFly/IronJacamar 1.5.11.Final-redhat-00001)

At.te,
ID da Ordem de Trabalho	 WO0000081719133
Criado em	 24/09/2026 15:49:56
Criado por	 P779123
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Demanda inicial com viés de falha, erro, degradação ou esgotamento de infraestrutura, serviço, máquina, armazenamento, rotina ou situação que esteja na iminência de tornar-se incidente. Previsto atendimento no prazo indicado pelo demandante. [CENTRAL-SID]
ID da Ordem de Trabalho	 WO0000081719133
Criado em	 24/09/2026 15:17:16
Criado por	 P768728
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado(a),

Informamos que sua solicitação foi recebida.

Nosso SLA para atendimento é de até 24h úteis, analisaremos a solicitação para nos certificarmos que o atendimento está dentro do escopo de atuação da nossa equipe.

Caso seja identificado que o atendimento não corresponde ao nosso escopo, a solicitação será redirecionada à equipe responsável.

Novas informações e atualizações serão registradas diretamente nesta WO.

Atte.

Esteira Devops DES TQS NPRD
ID da Ordem de Trabalho	 WO0000081719133
Criado em	 24/09/2026 15:11:35
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Sexta-feira, 09/10/2026 15:04:50



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
SIPCS-login-unico-jboss-okd
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
SIPCS

SIPCS-login-unico-jboss-okd
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
MUDANCA_GSC (3)
WO0000079495945
Scopes: Release
ADAPTER_VARIABLES (9)
Variáveis disponíveis para todas os projetos do tipo ADAPTER.
Scopes: Release
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)
Scopes: Release
OKD-4-NPRD (12)
Credenciais para o Cluster OKD4 de NPRD (DES/TQS/HMP)
Scopes: EC DES,EC TQS,EC HMP
SIPCS-LOGIN-UNICO-JBOSS-OKD-DES (24)
Grupo de variáveis de SIPCS-LOGIN-UNICO-JBOSS-OKD-DES
Scopes: EC DES
ANALYTICS_URL
https://des.analytics.mobilidade.caixa.gov.br/analytics/
EXTRA_LDAP_HOST_IP
cxextrlx002.desenvolvimento.extracaixa
EXTRA_LDAP_HOST_PORT
389
EXTRA_LDAP_ROLES_ATTR
cn
EXTRA_LDAP_ROLES_EXCLUDE
SIPCS
EXTRA_LDAP_ROLES_FILTER
(objectClass=*)
EXTRA_LDAP_ROLES_QUERY
cn=SIPCS,ou=Groups,o=caixa
INTRA_LDAP_HOST_IP
cxextrlx002.desenvolvimento.extracaixa
INTRA_LDAP_HOST_PORT
389
INTRA_LDAP_ROLES_ATTR
cn
INTRA_LDAP_ROLES_EXCLUDE
SIPCS
INTRA_LDAP_ROLES_FILTER
(objectClass=*)
INTRA_LDAP_ROLES_QUERY
cn=SIPCS,ou=Groups,o=caixa
JVM_HEAP_MAX
2048m
JVM_HEAP_MIN
2048m
JVM_METASPACE_MAX
1024m
JVM_METASPACE_MIN
1024m
JVM_PROXY_HOST
proxydes.caixa
JVM_PROXY_PORT
80
ORG_JBOSS_AS_LOGGING_PER-DEPLOYMENT
false
PERFIS_PAINEL
AA00,AA01,GS06
SISTEMAS
Cobranca:/cobranca/;Integracao:/sipcs/;SIFDL:/sifdl/;SAT:/sat/servlet/ServletAjena;SIA:/smp/servlet/ServletAjena;SIEPA:/SiepaWeb/;SIACH:/siach/public/auth;PAINEL:/painel-web/;SIATC:/siatc-web/
URI_ENCODING
UTF-8
USE_BODY_ENCODING_FOR_QUERY_STRING
true
SIPCS-LOGIN-UNICO-JBOSS-BT-VAULT-DES (1)
SIDMF
Scopes: EC DES
BT_SECRETS_LIST
SIPCS-BT-VAULT-SECRET-DES (2)

Scopes: EC DES
BT_CLIENT_ID
21415d13-3700-456b-9738-31ff2dece4d5
BT_CLIENT_SECRET
********
SIPCS-LOGIN-UNICO-JBOSS-OKD-TQS (1)
Grupo de variáveis de SIPCS-LOGIN-UNICO-JBOSS-OKD-TQS
Scopes: EC TQS
SIPCS-LOGIN-UNICO-JBOSS-OKD-HMP (1)
Grupo de variáveis de SIPCS-LOGIN-UNICO-JBOSS-OKD-HMP
Scopes: EC HMP
OKD-4-APL (12)
Scopes: EC PRD
SIPCS-LOGIN-UNICO-JBOSS-OKD-PRD (1)
Grupo de variáveis de SIPCS-LOGIN-UNICO-JBOSS-OKD-PRD
Scopes: EC PRD
|Manage variable groups
Row 2

Showing filters 1 through 2

a pagina acessa normamente no modo desevolvedro ano tem nenhum erro

URL da Solicitação
https://sipcs-login-unico-jboss-okd-des.apps.nprd.caixa/
Request method
GET
Status code
200 OK
Remote address
10.116.180.64:443
Referrer policy
strict-origin-when-cross-origin
accept-ranges
bytes
connection
close
content-length
1531
content-type
text/html
date
Fri, 09 Oct 2026 18:01:28 GMT
last-modified
Wed, 23 Jun 2021 11:26:28 GMT
accept
text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7
accept-encoding
gzip, deflate, br, zstd
accept-language
pt-BR,pt;q=0.9,en;q=0.8,en-GB;q=0.7,en-US;q=0.6
cache-control
no-cache
connection
keep-alive
cookie
b74e0357336914820fd39378c77e6da4=1114801c604620b093cd0713c077c76d
host
sipcs-login-unico-jboss-okd-des.apps.nprd.caixa
pragma
no-cache
referer
https://devops.caixa/
sec-ch-ua
"Chromium";v="154", "Microsoft Edge";v="154", "Not A(Brand";v="99"
sec-ch-ua-mobile
?0
sec-ch-ua-platform
"Windows"
sec-fetch-dest
document
sec-fetch-mode
navigate
sec-fetch-site
cross-site
sec-fetch-user
?1
upgrade-insecure-requests
1
user-agent
Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/154.0.0.0 Safari/537.36 Edg/154.0.0.0
