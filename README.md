Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000081666793
Criado em	 17/09/2026 10:12:59
Criado por	 P655225
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À

CTIS / ESTEIRA DEVOPS DES E TQS

01 - 1. Para solicitações referente ao proxy favor abrir demanda no catálogo abaixo:

https://servicos.caixa/
Tecnologia da Informação e Comunicação
Redes e Telecomunicações
Serviços de Rede
Proxy

Atenciosamente.

Anderson Campelo Serpa Gama
Preposto
CTIS / CETEL / DHCP, DNS e Proxy de Serviços
ID da Ordem de Trabalho	 WO0000081666793
Criado em	 17/09/2026 09:30:21
Criado por	 P739639
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezados,

Conforme análises das notas apresentadas, o retorno abaixo informa que a origem não possui regra de proxy para acessar o destino especifico. Nesse caso sendo necessario abertura de solicitação de proxy para liberação.

HTTP/1.1 502 Proxy Error
Forefront TMG denied the specified Uniform Resource Locator (URL)

Caso já tenha sido aberto favor informar a requisição informando qual origem esta tendo problema de acesso. Caso não tenha sido aberto, favor solicitar no catálogo abaixo.

Atenciosamente.

CETEL08 - Integração e Serviços de Rede
ID da Ordem de Trabalho	 WO0000081666793
Criado em	 17/09/2026 01:43:54
Criado por	 P584553
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezados,

1. Para análise é necessário que informem o endereço de IP do servidor que está apresentando falha.

2. Próximo turno, favor realizar contato para análise.

3. À disposição para esclarecimentos.

Atenciosamente,

CETEL08/CETEL960
----------------------------------
ID da Ordem de Trabalho	 WO0000081666793
Criado em	 16/09/2026 16:13:14
Criado por	 P981778
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À CETEL
 
Solicitamos apoio na análise do acesso à URL da integração Reclame Aqui/HugMe utilizada pela aplicação SISOU SAC no ambiente TQS.
 
URL acessada:
https://app.hugme.com.br:443
 
Proxy utilizado pela aplicação:
proxydes.caixa:80
 
Evidências levantadas:
 
1. A aplicação SISOU está apresentando erro na geração de token da integração Reclame Aqui:
 
HTTP 502 Bad Gateway
ReclameAquiIntegracaoAS.gerarToken()
 
2. Teste realizado diretamente no pod do ambiente TQS utilizando o mesmo proxy configurado na JVM:
 
curl -x http://proxydes.caixa:80 -vk https://app.hugme.com.br
 
Retorno:
 
HTTP/1.1 502 Proxy Error
Forefront TMG denied the specified Uniform Resource Locator (URL)
 
3. Foi realizada comparação com o ambiente DES, que possui a mesma configuração de URL, credenciais e proxy.
 
No ambiente DES, o mesmo teste retornou:
 
HTTP/1.1 200 Connection established
 
seguido de handshake TLS válido com o destino.
 
4. As configurações da aplicação entre TQS e DES são equivalentes:
 
JVM_PROXY_HOST=proxydes.caixa
JVM_PROXY_PORT=80
SISOU-URL_API_RECLAME_AQUI=https://app.hugme.com.br:443
 
Solicitamos verificar:
 
- Existência de bloqueio, restrição ou política diferenciada para o tráfego originado do ambiente TQS;
- Liberação efetiva do domínio app.hugme.com.br;
- Regras do Forefront TMG/proxy aplicadas ao ambiente TQS;
- Diferenças de tratamento entre os acessos provenientes dos ambientes DES e TQS;

 
Att
 CTIS / CESTI Esteira DEVOPS DES TQS NPRD
ID da Ordem de Trabalho	 WO0000081666793
Criado em	 16/09/2026 13:23:28
Criado por	 P558217
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado(a),


Informamos que por ter reaberto sua solicitação hoje o atendimento será retomado nesta data.  

Iremos realizar uma nova análise conforme as informações adicionais registradas na sua última nota.

Ressaltamos que um novo SLA de 24h úteis passa a vigorar a partir de agora.

Todas as atualizações e evoluções do atendimento serão registradas diretamente nesta WO.


Atte.  

CTIS / CESTI Esteira DEVOPS DES TQS NPRD
ID da Ordem de Trabalho	 WO0000081666793
Criado em	 16/09/2026 13:19:20
Criado por	 C110509
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Informamos que o erro persiste. Para gerar evidência do erro é necessário executar a ação de captura da informação do site externo. Apenas rodar a aplicação não é necessário para executar a funcionalidade.
ID da Ordem de Trabalho	 WO0000081666793
Criado em	 16/09/2026 12:38:11
Criado por	 P981778
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À CAIXA,

Após a reciclagem do pod, foi validado o novo log do ambiente e não foram identificados erros relacionados à integração externa do Reclame Aqui ou à geração de token.
A aplicação iniciou normalmente, realizou autenticações e integrações sem falhas aparentes.
Até o momento da análise não há evidências de recorrência do erro HTTP 502 anteriormente observado


Thiago Silva
Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD    
ID da Ordem de Trabalho	 WO0000081666793
Criado em	 16/09/2026 11:20:59
Criado por	 P730708
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Demanda inicial sem viés de falha, erro, degradação ou

esgotamento de infraestrutura, serviço, máquina, armazenamento,

rotina ou situação que não esteja na iminência de tornar-se

incidente. Previsto atendimento em até 24 horas úteis.

[CENTRAL-SID]
ID da Ordem de Trabalho	 WO0000081666793
Criado em	 16/09/2026 10:38:11
Criado por	 P558217
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado(a),



Informamos que sua solicitação foi recebida.  



Nosso SLA para atendimento é de até 24h úteis, analisaremos a solicitação para nos certificarmos que o atendimento está dentro do escopo de atuação da nossa equipe.



Caso seja identificado que o atendimento não corresponde ao nosso escopo, a solicitação será redirecionada à equipe responsável.



Novas informações e atualizações serão registradas diretamente nesta WO.



Atte.



Esteira Devops DES TQS NPRD
ID da Ordem de Trabalho	 WO0000081666793
Criado em	 16/09/2026 10:34:09
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Quinta-feira, 17/09/2026 11:09:00





/opt/jboss/bin/standalone.conf: line 37: =org.jboss.byteman: command not found
=========================================================================

  JBoss Bootstrap Environment

  JBOSS_HOME: /opt/jboss

  JAVA: /usr/lib/jvm/jre-17-openjdk-17.0.7.0.7-3.el8.x86_64/bin/java

  JAVA_OPTS:  -Xlog:gc*:file="/opt/jboss/standalone/log/gc.log":time,uptimemillis:filecount=5,filesize=3M -Djdk.serialFilter="maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000" -Xms1024m -Xmx2048m -XX:MetaspaceSize=96m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs= -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd-sisou-20260825.jks -Djavax.net.ssl.trustStorePassword=changeit -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar:/opt/jboss/modules/system/layers/base/org/jboss/log4j/logmanager/main/log4j-jboss-logmanager-1.2.0.Final-redhat-00001.jar:/opt/jboss/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Dsun.util.logging.disableCallerCheck=true -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -Djava.net.useSystemProxies=false -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=localhost\|127.0.0.1\|*.caixa  --add-exports=java.base/sun.nio.ch=ALL-UNNAMED --add-exports=jdk.unsupported/sun.misc=ALL-UNNAMED --add-exports=jdk.unsupported/sun.reflect=ALL-UNNAMED --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED

=========================================================================

Sep 16, 2026 11:31:47 AM java.lang.System$LoggerFinder lambda$accessProvider$0
WARNING: Failed to instantiate LoggerFinder provider; Using default.
[0m11:31:48,088 INFO  [org.jboss.modules] (main) JBoss Modules version 1.12.2.Final-redhat-00001
[0m[0m11:31:48,700 INFO  [org.jboss.msc] (main) JBoss MSC version 1.4.12.Final-redhat-00001
[0m[0m11:31:48,707 INFO  [org.jboss.threads] (main) JBoss Threads version 2.4.0.Final-redhat-00001
[0m[0m11:31:48,892 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0049: JBoss EAP 7.4.14.GA (WildFly Core 15.0.32.Final-redhat-00001) starting
[0m[0m11:31:49,072 INFO  [org.jboss.vfs] (MSC service thread 1-1) VFS000002: Failed to clean existing content for temp file provider of type temp. Enable DEBUG level log to find what caused this
[0m[0m11:31:50,290 INFO  [org.wildfly.security] (ServerService Thread Pool -- 28) ELY00001: WildFly Elytron version 1.15.20.Final-redhat-00001
[0m[0m11:31:52,208 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 14) WFLYDR0001: Content added at location /opt/jboss/standalone/data/content/53/6ef55d3113684825d5cf454dd8f95106ac9de7/content
[0m[0m11:31:52,274 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Creating http management service using socket-binding (management-http)
[0m[0m11:31:52,283 INFO  [org.xnio] (MSC service thread 1-1) XNIO version 3.8.11.SP1-redhat-00001
[0m[0m11:31:52,286 INFO  [org.xnio.nio] (MSC service thread 1-1) XNIO NIO Implementation Version 3.8.11.SP1-redhat-00001
[0m[0m11:31:52,373 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 50) WFLYCLINF0001: Activating Infinispan subsystem.
[0m[0m11:31:52,375 INFO  [org.wildfly.extension.health] (ServerService Thread Pool -- 49) WFLYHEALTH0001: Activating Base Health Subsystem
[0m[33m11:31:52,375 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 68) WFLYTX0013: The node-identifier attribute on the /subsystem=transactions is set to the default value. This is a danger for environments running multiple servers. Please make sure the attribute value is unique.
[0m[0m11:31:52,376 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 51) WFLYIO001: Worker 'default' has auto-configured to 2 IO threads with 16 max task threads based on your 1 available processors
[0m[0m11:31:52,376 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 61) WFLYNAM0001: Activating Naming Subsystem
[0m[0m11:31:52,465 INFO  [org.jboss.as.webservices] (ServerService Thread Pool -- 70) WFLYWS0002: Activating WebServices Extension
[0m[0m11:31:52,465 INFO  [org.wildfly.extension.metrics] (ServerService Thread Pool -- 60) WFLYMETRICS0001: Activating Base Metrics Subsystem
[0m[0m11:31:52,467 INFO  [org.jboss.as.jsf] (ServerService Thread Pool -- 57) WFLYJSF0007: Activated the following Jakarta Server Faces Implementations: [main]
[0m[0m11:31:52,482 INFO  [org.jboss.remoting] (MSC service thread 1-2) JBoss Remoting version 5.0.27.Final-redhat-00001
[0m[0m11:31:52,565 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 52) WFLYRS0016: RESTEasy version 3.15.8.Final-redhat-00001
[0m[0m11:31:52,874 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0003: Undertow 2.2.28.SP1-redhat-00001 starting
[0m[0m11:31:52,879 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 41) WFLYJCA0004: Deploying JDBC-compliant driver class oracle.jdbc.OracleDriver (version 12.1)
[0m[0m11:31:52,965 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 41) WFLYJCA0004: Deploying JDBC-compliant driver class org.h2.Driver (version 1.4)
[0m[0m11:31:53,077 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 69) WFLYUT0014: Creating file handler for path '/opt/jboss/welcome-content' with options [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
[0m[0m11:31:53,173 INFO  [org.jboss.as.connector] (MSC service thread 1-2) WFLYJCA0009: Starting Jakarta Connectors Subsystem (WildFly/IronJacamar 1.5.15.Final-redhat-00001)
[0m[0m11:31:53,372 INFO  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0482: Strict pool mdb-strict-max-pool is using a max instance size of 4 (per class), which is derived from the number of CPUs on this host.
[0m[0m11:31:53,373 INFO  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0481: Strict pool slsb-strict-max-pool is using a max instance size of 16 (per class), which is derived from thread worker pool sizing.
[0m[0m11:31:53,375 INFO  [org.jboss.as.naming] (MSC service thread 1-2) WFLYNAM0003: Starting Naming Service
[0m[0m11:31:53,383 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-2) WFLYJCA0018: Started Driver service with driver-name = oracle
[0m[0m11:31:53,383 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-2) WFLYJCA0018: Started Driver service with driver-name = h2
[0m[0m11:31:53,389 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-2) WFLYMAIL0001: Bound mail session [java:jboss/mail/sisou]
[0m[0m11:31:53,464 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-2) WFLYMAIL0001: Bound mail session [java:jboss/mail/Default]
[0m[0m11:31:53,472 INFO  [org.jboss.as.patching] (MSC service thread 1-2) WFLYPAT0050: JBoss EAP cumulative patch ID is: jboss-eap-7.4.14.CP, one-off patches include: none
[0m[33m11:31:53,596 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-2) WFLYELY00023: KeyStore file '/opt/jboss/standalone/configuration/application.keystore' does not exist. Used blank.
[0m[33m11:31:53,784 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-1) WFLYELY01084: KeyStore /opt/jboss/standalone/configuration/application.keystore not found, it will be auto generated on first use with a self-signed certificate for host localhost
[0m[0m11:31:53,870 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0027: Starting deployment of "sisou-sac-okd.ear" (runtime-name: "sisou-sac-okd.ear")
[0m[0m11:31:53,872 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-1) WFLYDS0013: Started FileSystemDeploymentService for directory /opt/jboss/standalone/deployments
[0m[0m11:31:53,880 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0012: Started server default-server.
[0m[0m11:31:54,078 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) Queuing requests.
[0m[0m11:31:54,079 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0018: Host default-host starting
[0m[0m11:31:54,172 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0006: Undertow HTTP listener default listening on 0.0.0.0:8080
[0m[0m11:31:54,183 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0006: Undertow HTTPS listener https listening on 0.0.0.0:8443
[0m[0m11:31:54,184 INFO  [org.jboss.as.ejb3] (MSC service thread 1-1) WFLYEJB0493: Jakarta Enterprise Beans subsystem suspension complete
[0m[0m11:31:54,515 INFO  [org.jboss.ws.common.management] (MSC service thread 1-1) JBWS022052: Starting JBossWS 5.4.9.Final-redhat-00001 (Apache CXF 3.4.10.redhat-00001) 
[0m[0m11:31:54,685 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-1) WFLYJCA0001: Bound data source [java:/jdbc/OracleSisouDS]
[0m[0m11:31:54,686 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-1) WFLYJCA0001: Bound data source [java:jboss/jdbc/sisouDS]
[0m[33m11:31:57,885 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: Class Path entry oraclepki.jar in /content/sisou-sac-okd.ear/lib/ojdbc8.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m11:31:57,886 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: Class Path entry hk2.jar in /content/sisou-sac-okd.ear/lib/ha-api.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m11:31:57,886 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: Class Path entry hk2-core.jar in /content/sisou-sac-okd.ear/lib/ha-api.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m11:31:57,886 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: Class Path entry class-model.jar in /content/sisou-sac-okd.ear/lib/ha-api.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m11:31:57,886 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: Class Path entry config.jar in /content/sisou-sac-okd.ear/lib/ha-api.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m11:31:57,886 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: Class Path entry tiger-types.jar in /content/sisou-sac-okd.ear/lib/ha-api.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m11:31:57,886 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: Class Path entry bean-validator.jar in /content/sisou-sac-okd.ear/lib/ha-api.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m11:31:57,886 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: Class Path entry jtype.jar in /content/sisou-sac-okd.ear/lib/ha-api.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m11:31:57,886 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: Class Path entry auto-depends.jar in /content/sisou-sac-okd.ear/lib/ha-api.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m11:31:57,886 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: Class Path entry javax.inject.jar in /content/sisou-sac-okd.ear/lib/ha-api.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m11:31:57,886 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: Class Path entry asm-all-repackaged.jar in /content/sisou-sac-okd.ear/lib/ha-api.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m11:31:57,887 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: Class Path entry hk2-api.jar in /content/sisou-sac-okd.ear/lib/ha-api.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m11:31:57,887 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: Class Path entry osgi-resource-locator.jar in /content/sisou-sac-okd.ear/lib/ha-api.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m11:31:57,887 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: Class Path entry javax.inject.jar in /content/sisou-sac-okd.ear/lib/ha-api.jar  does not point to a valid jar for a Class-Path reference.
[0m[0m11:31:57,897 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0207: Starting subdeployment (runtime-name: "sisou-sac-api.war")
[0m[33m11:32:05,217 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0001: /content/sisou-sac-okd.ear/sisou-sac-api.war/WEB-INF/jboss-deployment-structure.xml in subdeployment ignored. jboss-deployment-structure.xml is only parsed for top level deployments.
[0m[33m11:32:05,349 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: Class Path entry oraclepki.jar in /content/sisou-sac-okd.ear/sisou-sac-api.war/WEB-INF/lib/ojdbc8-19.28.0.0.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m11:32:05,353 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: Class Path entry hk2.jar in /content/sisou-sac-okd.ear/sisou-sac-api.war/WEB-INF/lib/ha-api-3.1.12.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m11:32:05,353 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: Class Path entry hk2-core.jar in /content/sisou-sac-okd.ear/sisou-sac-api.war/WEB-INF/lib/ha-api-3.1.12.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m11:32:05,353 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: Class Path entry class-model.jar in /content/sisou-sac-okd.ear/sisou-sac-api.war/WEB-INF/lib/ha-api-3.1.12.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m11:32:05,353 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: Class Path entry config.jar in /content/sisou-sac-okd.ear/sisou-sac-api.war/WEB-INF/lib/ha-api-3.1.12.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m11:32:05,353 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: Class Path entry tiger-types.jar in /content/sisou-sac-okd.ear/sisou-sac-api.war/WEB-INF/lib/ha-api-3.1.12.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m11:32:05,353 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: Class Path entry bean-validator.jar in /content/sisou-sac-okd.ear/sisou-sac-api.war/WEB-INF/lib/ha-api-3.1.12.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m11:32:05,353 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: Class Path entry jtype.jar in /content/sisou-sac-okd.ear/sisou-sac-api.war/WEB-INF/lib/ha-api-3.1.12.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m11:32:05,353 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: Class Path entry auto-depends.jar in /content/sisou-sac-okd.ear/sisou-sac-api.war/WEB-INF/lib/ha-api-3.1.12.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m11:32:05,353 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: Class Path entry javax.inject.jar in /content/sisou-sac-okd.ear/sisou-sac-api.war/WEB-INF/lib/ha-api-3.1.12.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m11:32:05,353 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: Class Path entry asm-all-repackaged.jar in /content/sisou-sac-okd.ear/sisou-sac-api.war/WEB-INF/lib/ha-api-3.1.12.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m11:32:05,354 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: Class Path entry hk2-api.jar in /content/sisou-sac-okd.ear/sisou-sac-api.war/WEB-INF/lib/ha-api-3.1.12.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m11:32:05,354 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: Class Path entry osgi-resource-locator.jar in /content/sisou-sac-okd.ear/sisou-sac-api.war/WEB-INF/lib/ha-api-3.1.12.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m11:32:05,354 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: Class Path entry javax.inject.jar in /content/sisou-sac-okd.ear/sisou-sac-api.war/WEB-INF/lib/ha-api-3.1.12.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m11:32:05,982 WARN  [org.jboss.weld.deployer] (MSC service thread 1-1) WFLYWELD0018: Found both WEB-INF/beans.xml and WEB-INF/classes/META-INF/beans.xml. It is not portable to use both locations at the same time. Weld is going to use the former location for this deployment.
[0m[0m11:32:05,993 INFO  [org.jboss.as.jpa] (MSC service thread 1-1) WFLYJPA0002: Read persistence.xml for sisouDB
[0m[33m11:32:06,479 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-2) WFLYSRV0018: Deployment "deployment.sisou-sac-okd.ear.sisou-sac-api.war" is using a private module ("org.apache.httpcomponents") which may be changed or removed in future versions without notice.
[0m[0m11:32:06,487 INFO  [org.jipijapa] (MSC service thread 1-1) JIPIORMV53020253: Second level cache enabled for sisou-sac-okd.ear/sisou-sac-api.war#sisouDB
[0m[0m11:32:06,599 INFO  [org.jboss.weld.deployer] (MSC service thread 1-1) WFLYWELD0003: Processing weld deployment sisou-sac-okd.ear
[0m[0m11:32:06,795 INFO  [org.hibernate.validator.internal.util.Version] (MSC service thread 1-1) HV000001: Hibernate Validator 6.0.23.Final-redhat-00001
[0m[0m11:32:07,465 INFO  [org.infinispan.CONTAINER] (ServerService Thread Pool -- 74) ISPN000128: Infinispan version: Infinispan 'Corona Extra' 11.0.18.Final-redhat-00001
[0m[0m11:32:07,575 INFO  [org.infinispan.CONFIG] (MSC service thread 1-2) ISPN000152: Passivation configured without an eviction policy being selected. Only manually evicted entities will be passivated.
[0m[0m11:32:07,576 INFO  [org.infinispan.CONFIG] (MSC service thread 1-2) ISPN000152: Passivation configured without an eviction policy being selected. Only manually evicted entities will be passivated.
[0m[0m11:32:07,594 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 74) WFLYJPA0010: Starting Persistence Unit (phase 1 of 2) Service 'sisou-sac-okd.ear/sisou-sac-api.war#sisouDB'
[0m[0m11:32:07,674 INFO  [org.hibernate.jpa.internal.util.LogHelper] (ServerService Thread Pool -- 74) HHH000204: Processing PersistenceUnitInfo [
	name: sisouDB
	...]
[0m[0m11:32:07,781 INFO  [org.infinispan.PERSISTENCE] (ServerService Thread Pool -- 73) ISPN000556: Starting user marshaller 'org.wildfly.clustering.infinispan.spi.marshalling.InfinispanProtoStreamMarshaller'
[0m[0m11:32:07,879 INFO  [org.hibernate.Version] (ServerService Thread Pool -- 74) HHH000412: Hibernate Core {5.3.32.Final-redhat-00001}
[0m[0m11:32:07,880 INFO  [org.hibernate.cfg.Environment] (ServerService Thread Pool -- 74) HHH000206: hibernate.properties not found
[0m[0m11:32:08,183 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 73) WFLYCLINF0002: Started http-remoting-connector cache from ejb container
[0m[0m11:32:08,767 INFO  [org.hibernate.annotations.common.Version] (ServerService Thread Pool -- 74) HCANN000001: Hibernate Commons Annotations {5.0.5.Final-redhat-00002}
[0m[0m11:32:08,984 INFO  [org.jboss.keycloak] (MSC service thread 1-1) Keycloak subsystem override for deployment sisou-sac-api.war
[0m[0m11:32:08,985 INFO  [org.jboss.weld.deployer] (MSC service thread 1-1) WFLYWELD0003: Processing weld deployment sisou-sac-api.war
[0m[0m11:32:09,194 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MatrizArquivoCartaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/MatrizArquivoCartaAS!br.gov.caixa.bsb.sisou.core.correios.MatrizArquivoCartaAS
	java:app/sisou-sac-api/MatrizArquivoCartaAS!br.gov.caixa.bsb.sisou.core.correios.MatrizArquivoCartaAS
	java:module/MatrizArquivoCartaAS!br.gov.caixa.bsb.sisou.core.correios.MatrizArquivoCartaAS
	java:global/sisou-sac-okd/sisou-sac-api/MatrizArquivoCartaAS
	java:app/sisou-sac-api/MatrizArquivoCartaAS
	java:module/MatrizArquivoCartaAS

[0m[0m11:32:09,194 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ProdutoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ProdutoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ProdutoAS
	java:app/sisou-sac-api/ProdutoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ProdutoAS
	java:module/ProdutoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ProdutoAS
	java:global/sisou-sac-okd/sisou-sac-api/ProdutoAS
	java:app/sisou-sac-api/ProdutoAS
	java:module/ProdutoAS

[0m[0m11:32:09,194 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PerguntaRespostaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PerguntaRespostaAS!br.gov.caixa.bsb.sisou.core.ajuda.PerguntaRespostaAS
	java:app/sisou-sac-api/PerguntaRespostaAS!br.gov.caixa.bsb.sisou.core.ajuda.PerguntaRespostaAS
	java:module/PerguntaRespostaAS!br.gov.caixa.bsb.sisou.core.ajuda.PerguntaRespostaAS
	java:global/sisou-sac-okd/sisou-sac-api/PerguntaRespostaAS
	java:app/sisou-sac-api/PerguntaRespostaAS
	java:module/PerguntaRespostaAS

[0m[0m11:32:09,194 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PerguntaAvaliacaoConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PerguntaAvaliacaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.PerguntaAvaliacaoConverter
	java:app/sisou-sac-api/PerguntaAvaliacaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.PerguntaAvaliacaoConverter
	java:module/PerguntaAvaliacaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.PerguntaAvaliacaoConverter
	java:global/sisou-sac-okd/sisou-sac-api/PerguntaAvaliacaoConverter
	java:app/sisou-sac-api/PerguntaAvaliacaoConverter
	java:module/PerguntaAvaliacaoConverter

[0m[0m11:32:09,195 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'RelatorioAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/RelatorioAS!br.gov.caixa.arquitetura.javaee.core.relatorio.RelatorioAS
	java:app/sisou-sac-api/RelatorioAS!br.gov.caixa.arquitetura.javaee.core.relatorio.RelatorioAS
	java:module/RelatorioAS!br.gov.caixa.arquitetura.javaee.core.relatorio.RelatorioAS
	java:global/sisou-sac-okd/sisou-sac-api/RelatorioAS
	java:app/sisou-sac-api/RelatorioAS
	java:module/RelatorioAS

[0m[0m11:32:09,195 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'NotificacaoOcorrenciaExternaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/NotificacaoOcorrenciaExternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.NotificacaoOcorrenciaExternaAS
	java:app/sisou-sac-api/NotificacaoOcorrenciaExternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.NotificacaoOcorrenciaExternaAS
	java:module/NotificacaoOcorrenciaExternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.NotificacaoOcorrenciaExternaAS
	java:global/sisou-sac-okd/sisou-sac-api/NotificacaoOcorrenciaExternaAS
	java:app/sisou-sac-api/NotificacaoOcorrenciaExternaAS
	java:module/NotificacaoOcorrenciaExternaAS

[0m[0m11:32:09,195 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'LoteCorrespondenciaCartaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/LoteCorrespondenciaCartaAS!br.gov.caixa.bsb.sisou.core.correios.LoteCorrespondenciaCartaAS
	java:app/sisou-sac-api/LoteCorrespondenciaCartaAS!br.gov.caixa.bsb.sisou.core.correios.LoteCorrespondenciaCartaAS
	java:module/LoteCorrespondenciaCartaAS!br.gov.caixa.bsb.sisou.core.correios.LoteCorrespondenciaCartaAS
	java:global/sisou-sac-okd/sisou-sac-api/LoteCorrespondenciaCartaAS
	java:app/sisou-sac-api/LoteCorrespondenciaCartaAS
	java:module/LoteCorrespondenciaCartaAS

[0m[0m11:32:09,195 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ClassificacaoOcorrenciaExternaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ClassificacaoOcorrenciaExternaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ClassificacaoOcorrenciaExternaAS
	java:app/sisou-sac-api/ClassificacaoOcorrenciaExternaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ClassificacaoOcorrenciaExternaAS
	java:module/ClassificacaoOcorrenciaExternaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ClassificacaoOcorrenciaExternaAS
	java:global/sisou-sac-okd/sisou-sac-api/ClassificacaoOcorrenciaExternaAS
	java:app/sisou-sac-api/ClassificacaoOcorrenciaExternaAS
	java:module/ClassificacaoOcorrenciaExternaAS

[0m[0m11:32:09,195 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TipoAtendimentoZeroOitocentosConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TipoAtendimentoZeroOitocentosConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.TipoAtendimentoZeroOitocentosConverter
	java:app/sisou-sac-api/TipoAtendimentoZeroOitocentosConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.TipoAtendimentoZeroOitocentosConverter
	java:module/TipoAtendimentoZeroOitocentosConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.TipoAtendimentoZeroOitocentosConverter
	java:global/sisou-sac-okd/sisou-sac-api/TipoAtendimentoZeroOitocentosConverter
	java:app/sisou-sac-api/TipoAtendimentoZeroOitocentosConverter
	java:module/TipoAtendimentoZeroOitocentosConverter

[0m[0m11:32:09,195 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'AnexoOcorrenciaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/AnexoOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.AnexoOcorrenciaConverter
	java:app/sisou-sac-api/AnexoOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.AnexoOcorrenciaConverter
	java:module/AnexoOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.AnexoOcorrenciaConverter
	java:global/sisou-sac-okd/sisou-sac-api/AnexoOcorrenciaConverter
	java:app/sisou-sac-api/AnexoOcorrenciaConverter
	java:module/AnexoOcorrenciaConverter

[0m[0m11:32:09,195 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ErroPlataformaGovernoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ErroPlataformaGovernoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ErroPlataformaGovernoAS
	java:app/sisou-sac-api/ErroPlataformaGovernoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ErroPlataformaGovernoAS
	java:module/ErroPlataformaGovernoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ErroPlataformaGovernoAS
	java:global/sisou-sac-okd/sisou-sac-api/ErroPlataformaGovernoAS
	java:app/sisou-sac-api/ErroPlataformaGovernoAS
	java:module/ErroPlataformaGovernoAS

[0m[0m11:32:09,195 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'SolicitacaoUnidadeConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/SolicitacaoUnidadeConverter!br.gov.caixa.bsb.sisou.core.comum.converter.solicitacao.SolicitacaoUnidadeConverter
	java:app/sisou-sac-api/SolicitacaoUnidadeConverter!br.gov.caixa.bsb.sisou.core.comum.converter.solicitacao.SolicitacaoUnidadeConverter
	java:module/SolicitacaoUnidadeConverter!br.gov.caixa.bsb.sisou.core.comum.converter.solicitacao.SolicitacaoUnidadeConverter
	java:global/sisou-sac-okd/sisou-sac-api/SolicitacaoUnidadeConverter
	java:app/sisou-sac-api/SolicitacaoUnidadeConverter
	java:module/SolicitacaoUnidadeConverter

[0m[0m11:32:09,195 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TipoOcorrenciaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TipoOcorrenciaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoOcorrenciaAS
	java:app/sisou-sac-api/TipoOcorrenciaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoOcorrenciaAS
	java:module/TipoOcorrenciaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoOcorrenciaAS
	java:global/sisou-sac-okd/sisou-sac-api/TipoOcorrenciaAS
	java:app/sisou-sac-api/TipoOcorrenciaAS
	java:module/TipoOcorrenciaAS

[0m[0m11:32:09,195 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PerguntaOcorrenciaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PerguntaOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PerguntaOcorrenciaAS
	java:app/sisou-sac-api/PerguntaOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PerguntaOcorrenciaAS
	java:module/PerguntaOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PerguntaOcorrenciaAS
	java:global/sisou-sac-okd/sisou-sac-api/PerguntaOcorrenciaAS
	java:app/sisou-sac-api/PerguntaOcorrenciaAS
	java:module/PerguntaOcorrenciaAS

[0m[0m11:32:09,195 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PenalidadeSacOuvAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PenalidadeSacOuvAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.PenalidadeSacOuvAS
	java:app/sisou-sac-api/PenalidadeSacOuvAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.PenalidadeSacOuvAS
	java:module/PenalidadeSacOuvAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.PenalidadeSacOuvAS
	java:global/sisou-sac-okd/sisou-sac-api/PenalidadeSacOuvAS
	java:app/sisou-sac-api/PenalidadeSacOuvAS
	java:module/PenalidadeSacOuvAS

[0m[0m11:32:09,195 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ContatoRespostaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ContatoRespostaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.ContatoRespostaConverter
	java:app/sisou-sac-api/ContatoRespostaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.ContatoRespostaConverter
	java:module/ContatoRespostaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.ContatoRespostaConverter
	java:global/sisou-sac-okd/sisou-sac-api/ContatoRespostaConverter
	java:app/sisou-sac-api/ContatoRespostaConverter
	java:module/ContatoRespostaConverter

[0m[0m11:32:09,196 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'UsuarioUnidadeAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/UsuarioUnidadeAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.UsuarioUnidadeAS
	java:app/sisou-sac-api/UsuarioUnidadeAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.UsuarioUnidadeAS
	java:module/UsuarioUnidadeAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.UsuarioUnidadeAS
	java:global/sisou-sac-okd/sisou-sac-api/UsuarioUnidadeAS
	java:app/sisou-sac-api/UsuarioUnidadeAS
	java:module/UsuarioUnidadeAS

[0m[0m11:32:09,196 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MarcarOcorrenciaComoLida' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/MarcarOcorrenciaComoLida!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.MarcarOcorrenciaComoLida
	java:app/sisou-sac-api/MarcarOcorrenciaComoLida!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.MarcarOcorrenciaComoLida
	java:module/MarcarOcorrenciaComoLida!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.MarcarOcorrenciaComoLida
	java:global/sisou-sac-okd/sisou-sac-api/MarcarOcorrenciaComoLida
	java:app/sisou-sac-api/MarcarOcorrenciaComoLida
	java:module/MarcarOcorrenciaComoLida

[0m[0m11:32:09,196 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PenalidadeTarefaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PenalidadeTarefaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PenalidadeTarefaAS
	java:app/sisou-sac-api/PenalidadeTarefaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PenalidadeTarefaAS
	java:module/PenalidadeTarefaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PenalidadeTarefaAS
	java:global/sisou-sac-okd/sisou-sac-api/PenalidadeTarefaAS
	java:app/sisou-sac-api/PenalidadeTarefaAS
	java:module/PenalidadeTarefaAS

[0m[0m11:32:09,196 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MotivoAvaliacaoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/MotivoAvaliacaoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.MotivoAvaliacaoAS
	java:app/sisou-sac-api/MotivoAvaliacaoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.MotivoAvaliacaoAS
	java:module/MotivoAvaliacaoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.MotivoAvaliacaoAS
	java:global/sisou-sac-okd/sisou-sac-api/MotivoAvaliacaoAS
	java:app/sisou-sac-api/MotivoAvaliacaoAS
	java:module/MotivoAvaliacaoAS

[0m[0m11:32:09,196 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'OcorrenciaInternaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaInternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.OcorrenciaInternaConverter
	java:app/sisou-sac-api/OcorrenciaInternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.OcorrenciaInternaConverter
	java:module/OcorrenciaInternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.OcorrenciaInternaConverter
	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaInternaConverter
	java:app/sisou-sac-api/OcorrenciaInternaConverter
	java:module/OcorrenciaInternaConverter

[0m[0m11:32:09,196 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TransmissaoArquivoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TransmissaoArquivoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.TransmissaoArquivoAS
	java:app/sisou-sac-api/TransmissaoArquivoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.TransmissaoArquivoAS
	java:module/TransmissaoArquivoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.TransmissaoArquivoAS
	java:global/sisou-sac-okd/sisou-sac-api/TransmissaoArquivoAS
	java:app/sisou-sac-api/TransmissaoArquivoAS
	java:module/TransmissaoArquivoAS

[0m[0m11:32:09,196 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ProrrogacaoTarefaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ProrrogacaoTarefaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ProrrogacaoTarefaAS
	java:app/sisou-sac-api/ProrrogacaoTarefaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ProrrogacaoTarefaAS
	java:module/ProrrogacaoTarefaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ProrrogacaoTarefaAS
	java:global/sisou-sac-okd/sisou-sac-api/ProrrogacaoTarefaAS
	java:app/sisou-sac-api/ProrrogacaoTarefaAS
	java:module/ProrrogacaoTarefaAS

[0m[0m11:32:09,196 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'JustificativaMovimentacaoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/JustificativaMovimentacaoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.JustificativaMovimentacaoAS
	java:app/sisou-sac-api/JustificativaMovimentacaoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.JustificativaMovimentacaoAS
	java:module/JustificativaMovimentacaoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.JustificativaMovimentacaoAS
	java:global/sisou-sac-okd/sisou-sac-api/JustificativaMovimentacaoAS
	java:app/sisou-sac-api/JustificativaMovimentacaoAS
	java:module/JustificativaMovimentacaoAS

[0m[0m11:32:09,196 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'OcorrenciaInternaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaInternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaInternaAS
	java:app/sisou-sac-api/OcorrenciaInternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaInternaAS
	java:module/OcorrenciaInternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaInternaAS
	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaInternaAS
	java:app/sisou-sac-api/OcorrenciaInternaAS
	java:module/OcorrenciaInternaAS

[0m[0m11:32:09,196 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'AvaliacaoOcorrenciaExternaNovoConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/AvaliacaoOcorrenciaExternaNovoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.AvaliacaoOcorrenciaExternaNovoConverter
	java:app/sisou-sac-api/AvaliacaoOcorrenciaExternaNovoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.AvaliacaoOcorrenciaExternaNovoConverter
	java:module/AvaliacaoOcorrenciaExternaNovoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.AvaliacaoOcorrenciaExternaNovoConverter
	java:global/sisou-sac-okd/sisou-sac-api/AvaliacaoOcorrenciaExternaNovoConverter
	java:app/sisou-sac-api/AvaliacaoOcorrenciaExternaNovoConverter
	java:module/AvaliacaoOcorrenciaExternaNovoConverter

[0m[0m11:32:09,196 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'EnvioRespostaComArquivoAoBacenAs' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/EnvioRespostaComArquivoAoBacenAs!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.EnvioRespostaComArquivoAoBacenAs
	java:app/sisou-sac-api/EnvioRespostaComArquivoAoBacenAs!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.EnvioRespostaComArquivoAoBacenAs
	java:module/EnvioRespostaComArquivoAoBacenAs!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.EnvioRespostaComArquivoAoBacenAs
	java:global/sisou-sac-okd/sisou-sac-api/EnvioRespostaComArquivoAoBacenAs
	java:app/sisou-sac-api/EnvioRespostaComArquivoAoBacenAs
	java:module/EnvioRespostaComArquivoAoBacenAs

[0m[0m11:32:09,196 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TerceirizadoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TerceirizadoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TerceirizadoAS
	java:app/sisou-sac-api/TerceirizadoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TerceirizadoAS
	java:module/TerceirizadoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TerceirizadoAS
	java:global/sisou-sac-okd/sisou-sac-api/TerceirizadoAS
	java:app/sisou-sac-api/TerceirizadoAS
	java:module/TerceirizadoAS

[0m[0m11:32:09,196 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'SolicitacaoUnidadeAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/SolicitacaoUnidadeAS!br.gov.caixa.bsb.sisou.core.solicitacao.SolicitacaoUnidadeAS
	java:app/sisou-sac-api/SolicitacaoUnidadeAS!br.gov.caixa.bsb.sisou.core.solicitacao.SolicitacaoUnidadeAS
	java:module/SolicitacaoUnidadeAS!br.gov.caixa.bsb.sisou.core.solicitacao.SolicitacaoUnidadeAS
	java:global/sisou-sac-okd/sisou-sac-api/SolicitacaoUnidadeAS
	java:app/sisou-sac-api/SolicitacaoUnidadeAS
	java:module/SolicitacaoUnidadeAS

[0m[0m11:32:09,197 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'OcorrenciaBloqueadaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaBloqueadaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaBloqueadaAS
	java:app/sisou-sac-api/OcorrenciaBloqueadaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaBloqueadaAS
	java:module/OcorrenciaBloqueadaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaBloqueadaAS
	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaBloqueadaAS
	java:app/sisou-sac-api/OcorrenciaBloqueadaAS
	java:module/OcorrenciaBloqueadaAS

[0m[0m11:32:09,197 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'NotificacaoOcorrenciaExternaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/NotificacaoOcorrenciaExternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.notificacao.NotificacaoOcorrenciaExternaConverter
	java:app/sisou-sac-api/NotificacaoOcorrenciaExternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.notificacao.NotificacaoOcorrenciaExternaConverter
	java:module/NotificacaoOcorrenciaExternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.notificacao.NotificacaoOcorrenciaExternaConverter
	java:global/sisou-sac-okd/sisou-sac-api/NotificacaoOcorrenciaExternaConverter
	java:app/sisou-sac-api/NotificacaoOcorrenciaExternaConverter
	java:module/NotificacaoOcorrenciaExternaConverter

[0m[0m11:32:09,197 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PostoAtendimentoProconAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PostoAtendimentoProconAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.PostoAtendimentoProconAS
	java:app/sisou-sac-api/PostoAtendimentoProconAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.PostoAtendimentoProconAS
	java:module/PostoAtendimentoProconAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.PostoAtendimentoProconAS
	java:global/sisou-sac-okd/sisou-sac-api/PostoAtendimentoProconAS
	java:app/sisou-sac-api/PostoAtendimentoProconAS
	java:module/PostoAtendimentoProconAS

[0m[0m11:32:09,197 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MovimentacaoOcorrenciaInternaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/MovimentacaoOcorrenciaInternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.tratarocorrencia.MovimentacaoOcorrenciaInternaConverter
	java:app/sisou-sac-api/MovimentacaoOcorrenciaInternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.tratarocorrencia.MovimentacaoOcorrenciaInternaConverter
	java:module/MovimentacaoOcorrenciaInternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.tratarocorrencia.MovimentacaoOcorrenciaInternaConverter
	java:global/sisou-sac-okd/sisou-sac-api/MovimentacaoOcorrenciaInternaConverter
	java:app/sisou-sac-api/MovimentacaoOcorrenciaInternaConverter
	java:module/MovimentacaoOcorrenciaInternaConverter

[0m[0m11:32:09,197 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PreOcorrenciaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PreOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PreOcorrenciaAS
	java:app/sisou-sac-api/PreOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PreOcorrenciaAS
	java:module/PreOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PreOcorrenciaAS
	java:global/sisou-sac-okd/sisou-sac-api/PreOcorrenciaAS
	java:app/sisou-sac-api/PreOcorrenciaAS
	java:module/PreOcorrenciaAS

[0m[0m11:32:09,197 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'SubsidioOcorrenciaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/SubsidioOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.SubsidioOcorrenciaAS
	java:app/sisou-sac-api/SubsidioOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.SubsidioOcorrenciaAS
	java:module/SubsidioOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.SubsidioOcorrenciaAS
	java:global/sisou-sac-okd/sisou-sac-api/SubsidioOcorrenciaAS
	java:app/sisou-sac-api/SubsidioOcorrenciaAS
	java:module/SubsidioOcorrenciaAS

[0m[0m11:32:09,197 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'UnidadeBloqueadaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/UnidadeBloqueadaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.UnidadeBloqueadaAS
	java:app/sisou-sac-api/UnidadeBloqueadaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.UnidadeBloqueadaAS
	java:module/UnidadeBloqueadaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.UnidadeBloqueadaAS
	java:global/sisou-sac-okd/sisou-sac-api/UnidadeBloqueadaAS
	java:app/sisou-sac-api/UnidadeBloqueadaAS
	java:module/UnidadeBloqueadaAS

[0m[0m11:32:09,197 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'IntegracaoOutcomingSisouBacenAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/IntegracaoOutcomingSisouBacenAS!br.gov.caixa.bsb.sisou.core.integracao.bacen.IIntegracaoOutcomingSisouBacenAs
	java:app/sisou-sac-api/IntegracaoOutcomingSisouBacenAS!br.gov.caixa.bsb.sisou.core.integracao.bacen.IIntegracaoOutcomingSisouBacenAs
	java:module/IntegracaoOutcomingSisouBacenAS!br.gov.caixa.bsb.sisou.core.integracao.bacen.IIntegracaoOutcomingSisouBacenAs
	java:global/sisou-sac-okd/sisou-sac-api/IntegracaoOutcomingSisouBacenAS
	java:app/sisou-sac-api/IntegracaoOutcomingSisouBacenAS
	java:module/IntegracaoOutcomingSisouBacenAS

[0m[0m11:32:09,197 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MensagemEmailAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/MensagemEmailAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.MensagemEmailAS
	java:app/sisou-sac-api/MensagemEmailAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.MensagemEmailAS
	java:module/MensagemEmailAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.MensagemEmailAS
	java:global/sisou-sac-okd/sisou-sac-api/MensagemEmailAS
	java:app/sisou-sac-api/MensagemEmailAS
	java:module/MensagemEmailAS

[0m[0m11:32:09,197 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'LoteCorrespondenciaInconsistenciaCartaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/LoteCorrespondenciaInconsistenciaCartaAS!br.gov.caixa.bsb.sisou.core.correios.LoteCorrespondenciaInconsistenciaCartaAS
	java:app/sisou-sac-api/LoteCorrespondenciaInconsistenciaCartaAS!br.gov.caixa.bsb.sisou.core.correios.LoteCorrespondenciaInconsistenciaCartaAS
	java:module/LoteCorrespondenciaInconsistenciaCartaAS!br.gov.caixa.bsb.sisou.core.correios.LoteCorrespondenciaInconsistenciaCartaAS
	java:global/sisou-sac-okd/sisou-sac-api/LoteCorrespondenciaInconsistenciaCartaAS
	java:app/sisou-sac-api/LoteCorrespondenciaInconsistenciaCartaAS
	java:module/LoteCorrespondenciaInconsistenciaCartaAS

[0m[0m11:32:09,197 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TipoFormatoRespostaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TipoFormatoRespostaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoFormatoRespostaAS
	java:app/sisou-sac-api/TipoFormatoRespostaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoFormatoRespostaAS
	java:module/TipoFormatoRespostaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoFormatoRespostaAS
	java:global/sisou-sac-okd/sisou-sac-api/TipoFormatoRespostaAS
	java:app/sisou-sac-api/TipoFormatoRespostaAS
	java:module/TipoFormatoRespostaAS

[0m[0m11:32:09,197 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'EmailUtil' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/EmailUtil!br.gov.caixa.arquitetura.javaee.core.comum.util.EmailUtil
	java:app/sisou-sac-api/EmailUtil!br.gov.caixa.arquitetura.javaee.core.comum.util.EmailUtil
	java:module/EmailUtil!br.gov.caixa.arquitetura.javaee.core.comum.util.EmailUtil
	java:global/sisou-sac-okd/sisou-sac-api/EmailUtil
	java:app/sisou-sac-api/EmailUtil
	java:module/EmailUtil

[0m[0m11:32:09,198 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PerguntaRespostaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PerguntaRespostaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ajuda.PerguntaRespostaConverter
	java:app/sisou-sac-api/PerguntaRespostaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ajuda.PerguntaRespostaConverter
	java:module/PerguntaRespostaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ajuda.PerguntaRespostaConverter
	java:global/sisou-sac-okd/sisou-sac-api/PerguntaRespostaConverter
	java:app/sisou-sac-api/PerguntaRespostaConverter
	java:module/PerguntaRespostaConverter

[0m[0m11:32:09,198 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'SolicitarProrrogacaoPrazoIntegracaoBacenAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/SolicitarProrrogacaoPrazoIntegracaoBacenAS!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.SolicitarProrrogacaoPrazoIntegracaoBacenAS
	java:app/sisou-sac-api/SolicitarProrrogacaoPrazoIntegracaoBacenAS!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.SolicitarProrrogacaoPrazoIntegracaoBacenAS
	java:module/SolicitarProrrogacaoPrazoIntegracaoBacenAS!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.SolicitarProrrogacaoPrazoIntegracaoBacenAS
	java:global/sisou-sac-okd/sisou-sac-api/SolicitarProrrogacaoPrazoIntegracaoBacenAS
	java:app/sisou-sac-api/SolicitarProrrogacaoPrazoIntegracaoBacenAS
	java:module/SolicitarProrrogacaoPrazoIntegracaoBacenAS

[0m[0m11:32:09,198 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ErroPlataformaPrivadoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ErroPlataformaPrivadoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ErroPlataformaPrivadoAS
	java:app/sisou-sac-api/ErroPlataformaPrivadoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ErroPlataformaPrivadoAS
	java:module/ErroPlataformaPrivadoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ErroPlataformaPrivadoAS
	java:global/sisou-sac-okd/sisou-sac-api/ErroPlataformaPrivadoAS
	java:app/sisou-sac-api/ErroPlataformaPrivadoAS
	java:module/ErroPlataformaPrivadoAS

[0m[0m11:32:09,198 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ItemConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ItemConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ItemConverter
	java:app/sisou-sac-api/ItemConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ItemConverter
	java:module/ItemConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ItemConverter
	java:global/sisou-sac-okd/sisou-sac-api/ItemConverter
	java:app/sisou-sac-api/ItemConverter
	java:module/ItemConverter

[0m[0m11:32:09,198 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'OcorrenciaPedidoClienteConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaPedidoClienteConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.OcorrenciaPedidoClienteConverter
	java:app/sisou-sac-api/OcorrenciaPedidoClienteConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.OcorrenciaPedidoClienteConverter
	java:module/OcorrenciaPedidoClienteConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.OcorrenciaPedidoClienteConverter
	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaPedidoClienteConverter
	java:app/sisou-sac-api/OcorrenciaPedidoClienteConverter
	java:module/OcorrenciaPedidoClienteConverter

[0m[0m11:32:09,198 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'SolicitacaoOcorrenciaInternaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/SolicitacaoOcorrenciaInternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.SolicitacaoOcorrenciaInternaAS
	java:app/sisou-sac-api/SolicitacaoOcorrenciaInternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.SolicitacaoOcorrenciaInternaAS
	java:module/SolicitacaoOcorrenciaInternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.SolicitacaoOcorrenciaInternaAS
	java:global/sisou-sac-okd/sisou-sac-api/SolicitacaoOcorrenciaInternaAS
	java:app/sisou-sac-api/SolicitacaoOcorrenciaInternaAS
	java:module/SolicitacaoOcorrenciaInternaAS

[0m[0m11:32:09,198 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'EmailTemplateOuvidoriaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/EmailTemplateOuvidoriaAS!br.gov.caixa.bsb.sisou.core.comum.EmailTemplateOuvidoriaAS
	java:app/sisou-sac-api/EmailTemplateOuvidoriaAS!br.gov.caixa.bsb.sisou.core.comum.EmailTemplateOuvidoriaAS
	java:module/EmailTemplateOuvidoriaAS!br.gov.caixa.bsb.sisou.core.comum.EmailTemplateOuvidoriaAS
	java:global/sisou-sac-okd/sisou-sac-api/EmailTemplateOuvidoriaAS
	java:app/sisou-sac-api/EmailTemplateOuvidoriaAS
	java:module/EmailTemplateOuvidoriaAS

[0m[0m11:32:09,198 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'OcorrenciaOuvidoriaWSAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaOuvidoriaWSAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaOuvidoriaWSAS
	java:app/sisou-sac-api/OcorrenciaOuvidoriaWSAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaOuvidoriaWSAS
	java:module/OcorrenciaOuvidoriaWSAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaOuvidoriaWSAS
	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaOuvidoriaWSAS
	java:app/sisou-sac-api/OcorrenciaOuvidoriaWSAS
	java:module/OcorrenciaOuvidoriaWSAS

[0m[0m11:32:09,198 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TipoMensagemSMSAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TipoMensagemSMSAS!br.gov.caixa.bsb.sisou.core.sms.TipoMensagemSMSAS
	java:app/sisou-sac-api/TipoMensagemSMSAS!br.gov.caixa.bsb.sisou.core.sms.TipoMensagemSMSAS
	java:module/TipoMensagemSMSAS!br.gov.caixa.bsb.sisou.core.sms.TipoMensagemSMSAS
	java:global/sisou-sac-okd/sisou-sac-api/TipoMensagemSMSAS
	java:app/sisou-sac-api/TipoMensagemSMSAS
	java:module/TipoMensagemSMSAS

[0m[0m11:32:09,198 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TarefaSacAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TarefaSacAS!br.gov.caixa.bsb.sisou.core.ocorrencia.TarefaSacAS
	java:app/sisou-sac-api/TarefaSacAS!br.gov.caixa.bsb.sisou.core.ocorrencia.TarefaSacAS
	java:module/TarefaSacAS!br.gov.caixa.bsb.sisou.core.ocorrencia.TarefaSacAS
	java:global/sisou-sac-okd/sisou-sac-api/TarefaSacAS
	java:app/sisou-sac-api/TarefaSacAS
	java:module/TarefaSacAS

[0m[0m11:32:09,198 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PenalidadeAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PenalidadeAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.PenalidadeAS
	java:app/sisou-sac-api/PenalidadeAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.PenalidadeAS
	java:module/PenalidadeAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.PenalidadeAS
	java:global/sisou-sac-okd/sisou-sac-api/PenalidadeAS
	java:app/sisou-sac-api/PenalidadeAS
	java:module/PenalidadeAS

[0m[0m11:32:09,264 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'AvaliacaoNaturezaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/AvaliacaoNaturezaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.AvaliacaoNaturezaConverter
	java:app/sisou-sac-api/AvaliacaoNaturezaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.AvaliacaoNaturezaConverter
	java:module/AvaliacaoNaturezaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.AvaliacaoNaturezaConverter
	java:global/sisou-sac-okd/sisou-sac-api/AvaliacaoNaturezaConverter
	java:app/sisou-sac-api/AvaliacaoNaturezaConverter
	java:module/AvaliacaoNaturezaConverter

[0m[0m11:32:09,264 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'DiarioBordoConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/DiarioBordoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.DiarioBordoConverter
	java:app/sisou-sac-api/DiarioBordoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.DiarioBordoConverter
	java:module/DiarioBordoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.DiarioBordoConverter
	java:global/sisou-sac-okd/sisou-sac-api/DiarioBordoConverter
	java:app/sisou-sac-api/DiarioBordoConverter
	java:module/DiarioBordoConverter

[0m[0m11:32:09,264 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'AvaliacaoOcorrenciaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/AvaliacaoOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.AvaliacaoOcorrenciaAS
	java:app/sisou-sac-api/AvaliacaoOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.AvaliacaoOcorrenciaAS
	java:module/AvaliacaoOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.AvaliacaoOcorrenciaAS
	java:global/sisou-sac-okd/sisou-sac-api/AvaliacaoOcorrenciaAS
	java:app/sisou-sac-api/AvaliacaoOcorrenciaAS
	java:module/AvaliacaoOcorrenciaAS

[0m[0m11:32:09,264 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ReclameAquiIntegracaoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ReclameAquiIntegracaoAS!br.gov.caixa.bsb.sisou.core.integracao.reclameAqui.ReclameAquiIntegracaoAS
	java:app/sisou-sac-api/ReclameAquiIntegracaoAS!br.gov.caixa.bsb.sisou.core.integracao.reclameAqui.ReclameAquiIntegracaoAS
	java:module/ReclameAquiIntegracaoAS!br.gov.caixa.bsb.sisou.core.integracao.reclameAqui.ReclameAquiIntegracaoAS
	java:global/sisou-sac-okd/sisou-sac-api/ReclameAquiIntegracaoAS
	java:app/sisou-sac-api/ReclameAquiIntegracaoAS
	java:module/ReclameAquiIntegracaoAS

[0m[0m11:32:09,264 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TrabalhoEquipeAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TrabalhoEquipeAS!br.gov.caixa.bsb.sisou.core.ocorrencia.TrabalhoEquipeAS
	java:app/sisou-sac-api/TrabalhoEquipeAS!br.gov.caixa.bsb.sisou.core.ocorrencia.TrabalhoEquipeAS
	java:module/TrabalhoEquipeAS!br.gov.caixa.bsb.sisou.core.ocorrencia.TrabalhoEquipeAS
	java:global/sisou-sac-okd/sisou-sac-api/TrabalhoEquipeAS
	java:app/sisou-sac-api/TrabalhoEquipeAS
	java:module/TrabalhoEquipeAS

[0m[0m11:32:09,265 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MotivoEncerramentoConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/MotivoEncerramentoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.MotivoEncerramentoConverter
	java:app/sisou-sac-api/MotivoEncerramentoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.MotivoEncerramentoConverter
	java:module/MotivoEncerramentoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.MotivoEncerramentoConverter
	java:global/sisou-sac-okd/sisou-sac-api/MotivoEncerramentoConverter
	java:app/sisou-sac-api/MotivoEncerramentoConverter
	java:module/MotivoEncerramentoConverter

[0m[0m11:32:09,265 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MovimentacaoSolicitacaoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/MovimentacaoSolicitacaoAS!br.gov.caixa.bsb.sisou.core.solicitacao.MovimentacaoSolicitacaoAS
	java:app/sisou-sac-api/MovimentacaoSolicitacaoAS!br.gov.caixa.bsb.sisou.core.solicitacao.MovimentacaoSolicitacaoAS
	java:module/MovimentacaoSolicitacaoAS!br.gov.caixa.bsb.sisou.core.solicitacao.MovimentacaoSolicitacaoAS
	java:global/sisou-sac-okd/sisou-sac-api/MovimentacaoSolicitacaoAS
	java:app/sisou-sac-api/MovimentacaoSolicitacaoAS
	java:module/MovimentacaoSolicitacaoAS

[0m[0m11:32:09,265 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TratamentoOcorrenciaInternaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TratamentoOcorrenciaInternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.tratarocorrencia.TratamentoOcorrenciaInternaConverter
	java:app/sisou-sac-api/TratamentoOcorrenciaInternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.tratarocorrencia.TratamentoOcorrenciaInternaConverter
	java:module/TratamentoOcorrenciaInternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.tratarocorrencia.TratamentoOcorrenciaInternaConverter
	java:global/sisou-sac-okd/sisou-sac-api/TratamentoOcorrenciaInternaConverter
	java:app/sisou-sac-api/TratamentoOcorrenciaInternaConverter
	java:module/TratamentoOcorrenciaInternaConverter

[0m[0m11:32:09,265 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TipoSolicitacaoOcorrenciaInternaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TipoSolicitacaoOcorrenciaInternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.TipoSolicitacaoOcorrenciaInternaAS
	java:app/sisou-sac-api/TipoSolicitacaoOcorrenciaInternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.TipoSolicitacaoOcorrenciaInternaAS
	java:module/TipoSolicitacaoOcorrenciaInternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.TipoSolicitacaoOcorrenciaInternaAS
	java:global/sisou-sac-okd/sisou-sac-api/TipoSolicitacaoOcorrenciaInternaAS
	java:app/sisou-sac-api/TipoSolicitacaoOcorrenciaInternaAS
	java:module/TipoSolicitacaoOcorrenciaInternaAS

[0m[0m11:32:09,265 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PaginaInicialSubsidiariaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PaginaInicialSubsidiariaAS!br.gov.caixa.bsb.sisou.core.subsidiaria.PaginaInicialSubsidiariaAS
	java:app/sisou-sac-api/PaginaInicialSubsidiariaAS!br.gov.caixa.bsb.sisou.core.subsidiaria.PaginaInicialSubsidiariaAS
	java:module/PaginaInicialSubsidiariaAS!br.gov.caixa.bsb.sisou.core.subsidiaria.PaginaInicialSubsidiariaAS
	java:global/sisou-sac-okd/sisou-sac-api/PaginaInicialSubsidiariaAS
	java:app/sisou-sac-api/PaginaInicialSubsidiariaAS
	java:module/PaginaInicialSubsidiariaAS

[0m[0m11:32:09,265 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'SituacaoOcorrenciaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/SituacaoOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.SituacaoOcorrenciaAS
	java:app/sisou-sac-api/SituacaoOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.SituacaoOcorrenciaAS
	java:module/SituacaoOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.SituacaoOcorrenciaAS
	java:global/sisou-sac-okd/sisou-sac-api/SituacaoOcorrenciaAS
	java:app/sisou-sac-api/SituacaoOcorrenciaAS
	java:module/SituacaoOcorrenciaAS

[0m[0m11:32:09,265 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'SolicitanteAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/SolicitanteAS!br.gov.caixa.bsb.sisou.core.ocorrencia.SolicitanteAS
	java:app/sisou-sac-api/SolicitanteAS!br.gov.caixa.bsb.sisou.core.ocorrencia.SolicitanteAS
	java:module/SolicitanteAS!br.gov.caixa.bsb.sisou.core.ocorrencia.SolicitanteAS
	java:global/sisou-sac-okd/sisou-sac-api/SolicitanteAS
	java:app/sisou-sac-api/SolicitanteAS
	java:module/SolicitanteAS

[0m[0m11:32:09,265 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MotivoAvaliacaoConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/MotivoAvaliacaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.MotivoAvaliacaoConverter
	java:app/sisou-sac-api/MotivoAvaliacaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.MotivoAvaliacaoConverter
	java:module/MotivoAvaliacaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.MotivoAvaliacaoConverter
	java:global/sisou-sac-okd/sisou-sac-api/MotivoAvaliacaoConverter
	java:app/sisou-sac-api/MotivoAvaliacaoConverter
	java:module/MotivoAvaliacaoConverter

[0m[0m11:32:09,265 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ParametroConsoleConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ParametroConsoleConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ParametroConsoleConverter
	java:app/sisou-sac-api/ParametroConsoleConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ParametroConsoleConverter
	java:module/ParametroConsoleConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ParametroConsoleConverter
	java:global/sisou-sac-okd/sisou-sac-api/ParametroConsoleConverter
	java:app/sisou-sac-api/ParametroConsoleConverter
	java:module/ParametroConsoleConverter

[0m[0m11:32:09,265 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'CartilhaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/CartilhaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ajuda.CartilhaConverter
	java:app/sisou-sac-api/CartilhaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ajuda.CartilhaConverter
	java:module/CartilhaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ajuda.CartilhaConverter
	java:global/sisou-sac-okd/sisou-sac-api/CartilhaConverter
	java:app/sisou-sac-api/CartilhaConverter
	java:module/CartilhaConverter

[0m[0m11:32:09,265 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ReaberturaOcorrenciaOuvidoriaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ReaberturaOcorrenciaOuvidoriaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.reaberturaocorrencia.ReaberturaOcorrenciaOuvidoriaConverter
	java:app/sisou-sac-api/ReaberturaOcorrenciaOuvidoriaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.reaberturaocorrencia.ReaberturaOcorrenciaOuvidoriaConverter
	java:module/ReaberturaOcorrenciaOuvidoriaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.reaberturaocorrencia.ReaberturaOcorrenciaOuvidoriaConverter
	java:global/sisou-sac-okd/sisou-sac-api/ReaberturaOcorrenciaOuvidoriaConverter
	java:app/sisou-sac-api/ReaberturaOcorrenciaOuvidoriaConverter
	java:module/ReaberturaOcorrenciaOuvidoriaConverter

[0m[0m11:32:09,265 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PosicionamentoexternoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PosicionamentoexternoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PosicionamentoexternoAS
	java:app/sisou-sac-api/PosicionamentoexternoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PosicionamentoexternoAS
	java:module/PosicionamentoexternoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PosicionamentoexternoAS
	java:global/sisou-sac-okd/sisou-sac-api/PosicionamentoexternoAS
	java:app/sisou-sac-api/PosicionamentoexternoAS
	java:module/PosicionamentoexternoAS

[0m[0m11:32:09,265 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TipoDirecionamentoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TipoDirecionamentoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoDirecionamentoAS
	java:app/sisou-sac-api/TipoDirecionamentoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoDirecionamentoAS
	java:module/TipoDirecionamentoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoDirecionamentoAS
	java:global/sisou-sac-okd/sisou-sac-api/TipoDirecionamentoAS
	java:app/sisou-sac-api/TipoDirecionamentoAS
	java:module/TipoDirecionamentoAS

[0m[0m11:32:09,266 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'EquipeUnidadeCaixaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/EquipeUnidadeCaixaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.EquipeUnidadeCaixaAS
	java:app/sisou-sac-api/EquipeUnidadeCaixaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.EquipeUnidadeCaixaAS
	java:module/EquipeUnidadeCaixaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.EquipeUnidadeCaixaAS
	java:global/sisou-sac-okd/sisou-sac-api/EquipeUnidadeCaixaAS
	java:app/sisou-sac-api/EquipeUnidadeCaixaAS
	java:module/EquipeUnidadeCaixaAS

[0m[0m11:32:09,266 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ReaberturaOcorrenciaSacConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ReaberturaOcorrenciaSacConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.reaberturaocorrencia.ReaberturaOcorrenciaSacConverter
	java:app/sisou-sac-api/ReaberturaOcorrenciaSacConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.reaberturaocorrencia.ReaberturaOcorrenciaSacConverter
	java:module/ReaberturaOcorrenciaSacConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.reaberturaocorrencia.ReaberturaOcorrenciaSacConverter
	java:global/sisou-sac-okd/sisou-sac-api/ReaberturaOcorrenciaSacConverter
	java:app/sisou-sac-api/ReaberturaOcorrenciaSacConverter
	java:module/ReaberturaOcorrenciaSacConverter

[0m[0m11:32:09,266 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'HabilitacaoEquipeTratamentoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/HabilitacaoEquipeTratamentoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.HabilitacaoEquipeTratamentoAS
	java:app/sisou-sac-api/HabilitacaoEquipeTratamentoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.HabilitacaoEquipeTratamentoAS
	java:module/HabilitacaoEquipeTratamentoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.HabilitacaoEquipeTratamentoAS
	java:global/sisou-sac-okd/sisou-sac-api/HabilitacaoEquipeTratamentoAS
	java:app/sisou-sac-api/HabilitacaoEquipeTratamentoAS
	java:module/HabilitacaoEquipeTratamentoAS

[0m[0m11:32:09,266 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'SolicitacaoOcorrenciaInternaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/SolicitacaoOcorrenciaInternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.SolicitacaoOcorrenciaInternaConverter
	java:app/sisou-sac-api/SolicitacaoOcorrenciaInternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.SolicitacaoOcorrenciaInternaConverter
	java:module/SolicitacaoOcorrenciaInternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.SolicitacaoOcorrenciaInternaConverter
	java:global/sisou-sac-okd/sisou-sac-api/SolicitacaoOcorrenciaInternaConverter
	java:app/sisou-sac-api/SolicitacaoOcorrenciaInternaConverter
	java:module/SolicitacaoOcorrenciaInternaConverter

[0m[0m11:32:09,266 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MotivoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/MotivoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.MotivoAS
	java:app/sisou-sac-api/MotivoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.MotivoAS
	java:module/MotivoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.MotivoAS
	java:global/sisou-sac-okd/sisou-sac-api/MotivoAS
	java:app/sisou-sac-api/MotivoAS
	java:module/MotivoAS

[0m[0m11:32:09,266 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ProblemaComunicacaoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ProblemaComunicacaoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ProblemaComunicacaoAS
	java:app/sisou-sac-api/ProblemaComunicacaoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ProblemaComunicacaoAS
	java:module/ProblemaComunicacaoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ProblemaComunicacaoAS
	java:global/sisou-sac-okd/sisou-sac-api/ProblemaComunicacaoAS
	java:app/sisou-sac-api/ProblemaComunicacaoAS
	java:module/ProblemaComunicacaoAS

[0m[0m11:32:09,266 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'GrupoTratamentoConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/GrupoTratamentoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.GrupoTratamentoConverter
	java:app/sisou-sac-api/GrupoTratamentoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.GrupoTratamentoConverter
	java:module/GrupoTratamentoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.GrupoTratamentoConverter
	java:global/sisou-sac-okd/sisou-sac-api/GrupoTratamentoConverter
	java:app/sisou-sac-api/GrupoTratamentoConverter
	java:module/GrupoTratamentoConverter

[0m[0m11:32:09,266 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'FaleConoscoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/FaleConoscoAS!br.gov.caixa.bsb.sisou.core.faleconosco.FaleConoscoAS
	java:app/sisou-sac-api/FaleConoscoAS!br.gov.caixa.bsb.sisou.core.faleconosco.FaleConoscoAS
	java:module/FaleConoscoAS!br.gov.caixa.bsb.sisou.core.faleconosco.FaleConoscoAS
	java:global/sisou-sac-okd/sisou-sac-api/FaleConoscoAS
	java:app/sisou-sac-api/FaleConoscoAS
	java:module/FaleConoscoAS

[0m[0m11:32:09,266 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TemplateConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TemplateConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.TemplateConverter
	java:app/sisou-sac-api/TemplateConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.TemplateConverter
	java:module/TemplateConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.TemplateConverter
	java:global/sisou-sac-okd/sisou-sac-api/TemplateConverter
	java:app/sisou-sac-api/TemplateConverter
	java:module/TemplateConverter

[0m[0m11:32:09,266 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'OrigemAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/OrigemAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.OrigemAS
	java:app/sisou-sac-api/OrigemAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.OrigemAS
	java:module/OrigemAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.OrigemAS
	java:global/sisou-sac-okd/sisou-sac-api/OrigemAS
	java:app/sisou-sac-api/OrigemAS
	java:module/OrigemAS

[0m[0m11:32:09,266 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MensagemSMSConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/MensagemSMSConverter!br.gov.caixa.bsb.sisou.core.comum.converter.sms.MensagemSMSConverter
	java:app/sisou-sac-api/MensagemSMSConverter!br.gov.caixa.bsb.sisou.core.comum.converter.sms.MensagemSMSConverter
	java:module/MensagemSMSConverter!br.gov.caixa.bsb.sisou.core.comum.converter.sms.MensagemSMSConverter
	java:global/sisou-sac-okd/sisou-sac-api/MensagemSMSConverter
	java:app/sisou-sac-api/MensagemSMSConverter
	java:module/MensagemSMSConverter

[0m[0m11:32:09,266 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'LoteReciboServicoRastreioCartaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/LoteReciboServicoRastreioCartaAS!br.gov.caixa.bsb.sisou.core.correios.LoteReciboServicoRastreioCartaAS
	java:app/sisou-sac-api/LoteReciboServicoRastreioCartaAS!br.gov.caixa.bsb.sisou.core.correios.LoteReciboServicoRastreioCartaAS
	java:module/LoteReciboServicoRastreioCartaAS!br.gov.caixa.bsb.sisou.core.correios.LoteReciboServicoRastreioCartaAS
	java:global/sisou-sac-okd/sisou-sac-api/LoteReciboServicoRastreioCartaAS
	java:app/sisou-sac-api/LoteReciboServicoRastreioCartaAS
	java:module/LoteReciboServicoRastreioCartaAS

[0m[0m11:32:09,266 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PriorizacaoDistribuicaoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PriorizacaoDistribuicaoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.PriorizacaoDistribuicaoAS
	java:app/sisou-sac-api/PriorizacaoDistribuicaoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.PriorizacaoDistribuicaoAS
	java:module/PriorizacaoDistribuicaoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.PriorizacaoDistribuicaoAS
	java:global/sisou-sac-okd/sisou-sac-api/PriorizacaoDistribuicaoAS
	java:app/sisou-sac-api/PriorizacaoDistribuicaoAS
	java:module/PriorizacaoDistribuicaoAS

[0m[0m11:32:09,266 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PainelEquipeOrigemAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PainelEquipeOrigemAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PainelEquipeOrigemAS
	java:app/sisou-sac-api/PainelEquipeOrigemAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PainelEquipeOrigemAS
	java:module/PainelEquipeOrigemAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PainelEquipeOrigemAS
	java:global/sisou-sac-okd/sisou-sac-api/PainelEquipeOrigemAS
	java:app/sisou-sac-api/PainelEquipeOrigemAS
	java:module/PainelEquipeOrigemAS

[0m[0m11:32:09,266 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'SituacaoArquivoCartaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/SituacaoArquivoCartaAS!br.gov.caixa.bsb.sisou.core.correios.SituacaoArquivoCartaAS
	java:app/sisou-sac-api/SituacaoArquivoCartaAS!br.gov.caixa.bsb.sisou.core.correios.SituacaoArquivoCartaAS
	java:module/SituacaoArquivoCartaAS!br.gov.caixa.bsb.sisou.core.correios.SituacaoArquivoCartaAS
	java:global/sisou-sac-okd/sisou-sac-api/SituacaoArquivoCartaAS
	java:app/sisou-sac-api/SituacaoArquivoCartaAS
	java:module/SituacaoArquivoCartaAS

[0m[0m11:32:09,266 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ProrrogacaoOcorrenciaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ProrrogacaoOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.ProrrogacaoOcorrenciaConverter
	java:app/sisou-sac-api/ProrrogacaoOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.ProrrogacaoOcorrenciaConverter
	java:module/ProrrogacaoOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.ProrrogacaoOcorrenciaConverter
	java:global/sisou-sac-okd/sisou-sac-api/ProrrogacaoOcorrenciaConverter
	java:app/sisou-sac-api/ProrrogacaoOcorrenciaConverter
	java:module/ProrrogacaoOcorrenciaConverter

[0m[0m11:32:09,267 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TratarOcorrenciaInternaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TratarOcorrenciaInternaAS!br.gov.caixa.bsb.sisou.core.tratarocorrencia.TratarOcorrenciaInternaAS
	java:app/sisou-sac-api/TratarOcorrenciaInternaAS!br.gov.caixa.bsb.sisou.core.tratarocorrencia.TratarOcorrenciaInternaAS
	java:module/TratarOcorrenciaInternaAS!br.gov.caixa.bsb.sisou.core.tratarocorrencia.TratarOcorrenciaInternaAS
	java:global/sisou-sac-okd/sisou-sac-api/TratarOcorrenciaInternaAS
	java:app/sisou-sac-api/TratarOcorrenciaInternaAS
	java:module/TratarOcorrenciaInternaAS

[0m[0m11:32:09,267 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ParametroSistemaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ParametroSistemaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ParametroSistemaConverter
	java:app/sisou-sac-api/ParametroSistemaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ParametroSistemaConverter
	java:module/ParametroSistemaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ParametroSistemaConverter
	java:global/sisou-sac-okd/sisou-sac-api/ParametroSistemaConverter
	java:app/sisou-sac-api/ParametroSistemaConverter
	java:module/ParametroSistemaConverter

[0m[0m11:32:09,267 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'DadosProconConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/DadosProconConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.DadosProconConverter
	java:app/sisou-sac-api/DadosProconConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.DadosProconConverter
	java:module/DadosProconConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.DadosProconConverter
	java:global/sisou-sac-okd/sisou-sac-api/DadosProconConverter
	java:app/sisou-sac-api/DadosProconConverter
	java:module/DadosProconConverter

[0m[0m11:32:09,267 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'CartilhaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/CartilhaAS!br.gov.caixa.bsb.sisou.core.ajuda.CartilhaAS
	java:app/sisou-sac-api/CartilhaAS!br.gov.caixa.bsb.sisou.core.ajuda.CartilhaAS
	java:module/CartilhaAS!br.gov.caixa.bsb.sisou.core.ajuda.CartilhaAS
	java:global/sisou-sac-okd/sisou-sac-api/CartilhaAS
	java:app/sisou-sac-api/CartilhaAS
	java:module/CartilhaAS

[0m[0m11:32:09,267 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ProblemaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ProblemaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ProblemaConverter
	java:app/sisou-sac-api/ProblemaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ProblemaConverter
	java:module/ProblemaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ProblemaConverter
	java:global/sisou-sac-okd/sisou-sac-api/ProblemaConverter
	java:app/sisou-sac-api/ProblemaConverter
	java:module/ProblemaConverter

[0m[0m11:32:09,267 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TemplateAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TemplateAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TemplateAS
	java:app/sisou-sac-api/TemplateAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TemplateAS
	java:module/TemplateAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TemplateAS
	java:global/sisou-sac-okd/sisou-sac-api/TemplateAS
	java:app/sisou-sac-api/TemplateAS
	java:module/TemplateAS

[0m[0m11:32:09,267 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TarefaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TarefaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.TarefaAS
	java:app/sisou-sac-api/TarefaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.TarefaAS
	java:module/TarefaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.TarefaAS
	java:global/sisou-sac-okd/sisou-sac-api/TarefaAS
	java:app/sisou-sac-api/TarefaAS
	java:module/TarefaAS

[0m[0m11:32:09,267 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ConsoleB2bSituacaoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ConsoleB2bSituacaoAS!br.gov.caixa.bsb.sisou.core.administracao.consoleb2b.ConsoleB2bSituacaoAS
	java:app/sisou-sac-api/ConsoleB2bSituacaoAS!br.gov.caixa.bsb.sisou.core.administracao.consoleb2b.ConsoleB2bSituacaoAS
	java:module/ConsoleB2bSituacaoAS!br.gov.caixa.bsb.sisou.core.administracao.consoleb2b.ConsoleB2bSituacaoAS
	java:global/sisou-sac-okd/sisou-sac-api/ConsoleB2bSituacaoAS
	java:app/sisou-sac-api/ConsoleB2bSituacaoAS
	java:module/ConsoleB2bSituacaoAS

[0m[0m11:32:09,267 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'RecuperarOcorrenciaExternaSisou' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/RecuperarOcorrenciaExternaSisou!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.RecuperarOcorrenciaExternaSisou
	java:app/sisou-sac-api/RecuperarOcorrenciaExternaSisou!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.RecuperarOcorrenciaExternaSisou
	java:module/RecuperarOcorrenciaExternaSisou!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.RecuperarOcorrenciaExternaSisou
	java:global/sisou-sac-okd/sisou-sac-api/RecuperarOcorrenciaExternaSisou
	java:app/sisou-sac-api/RecuperarOcorrenciaExternaSisou
	java:module/RecuperarOcorrenciaExternaSisou

[0m[0m11:32:09,267 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PainelControleSacAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PainelControleSacAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PainelControleSacAS
	java:app/sisou-sac-api/PainelControleSacAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PainelControleSacAS
	java:module/PainelControleSacAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PainelControleSacAS
	java:global/sisou-sac-okd/sisou-sac-api/PainelControleSacAS
	java:app/sisou-sac-api/PainelControleSacAS
	java:module/PainelControleSacAS

[0m[0m11:32:09,267 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'IndecxIntegracaoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/IndecxIntegracaoAS!br.gov.caixa.bsb.sisou.core.integracao.indecx.IndecxIntegracaoAS
	java:app/sisou-sac-api/IndecxIntegracaoAS!br.gov.caixa.bsb.sisou.core.integracao.indecx.IndecxIntegracaoAS
	java:module/IndecxIntegracaoAS!br.gov.caixa.bsb.sisou.core.integracao.indecx.IndecxIntegracaoAS
	java:global/sisou-sac-okd/sisou-sac-api/IndecxIntegracaoAS
	java:app/sisou-sac-api/IndecxIntegracaoAS
	java:module/IndecxIntegracaoAS

[0m[0m11:32:09,267 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'OrigemFormatoRespostaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/OrigemFormatoRespostaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.OrigemFormatoRespostaConverter
	java:app/sisou-sac-api/OrigemFormatoRespostaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.OrigemFormatoRespostaConverter
	java:module/OrigemFormatoRespostaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.OrigemFormatoRespostaConverter
	java:global/sisou-sac-okd/sisou-sac-api/OrigemFormatoRespostaConverter
	java:app/sisou-sac-api/OrigemFormatoRespostaConverter
	java:module/OrigemFormatoRespostaConverter

[0m[0m11:32:09,267 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TratamentoOcorrenciaExternaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TratamentoOcorrenciaExternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.TratamentoOcorrenciaExternaAS
	java:app/sisou-sac-api/TratamentoOcorrenciaExternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.TratamentoOcorrenciaExternaAS
	java:module/TratamentoOcorrenciaExternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.TratamentoOcorrenciaExternaAS
	java:global/sisou-sac-okd/sisou-sac-api/TratamentoOcorrenciaExternaAS
	java:app/sisou-sac-api/TratamentoOcorrenciaExternaAS
	java:module/TratamentoOcorrenciaExternaAS

[0m[0m11:32:09,267 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'CategorizacaoOcorrenciaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/CategorizacaoOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.CategorizacaoOcorrenciaConverter
	java:app/sisou-sac-api/CategorizacaoOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.CategorizacaoOcorrenciaConverter
	java:module/CategorizacaoOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.CategorizacaoOcorrenciaConverter
	java:global/sisou-sac-okd/sisou-sac-api/CategorizacaoOcorrenciaConverter
	java:app/sisou-sac-api/CategorizacaoOcorrenciaConverter
	java:module/CategorizacaoOcorrenciaConverter

[0m[0m11:32:09,268 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TipoMovimentacaoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TipoMovimentacaoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoMovimentacaoAS
	java:app/sisou-sac-api/TipoMovimentacaoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoMovimentacaoAS
	java:module/TipoMovimentacaoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoMovimentacaoAS
	java:global/sisou-sac-okd/sisou-sac-api/TipoMovimentacaoAS
	java:app/sisou-sac-api/TipoMovimentacaoAS
	java:module/TipoMovimentacaoAS

[0m[0m11:32:09,268 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ParametroAvaliacaoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ParametroAvaliacaoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ParametroAvaliacaoAS
	java:app/sisou-sac-api/ParametroAvaliacaoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ParametroAvaliacaoAS
	java:module/ParametroAvaliacaoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ParametroAvaliacaoAS
	java:global/sisou-sac-okd/sisou-sac-api/ParametroAvaliacaoAS
	java:app/sisou-sac-api/ParametroAvaliacaoAS
	java:module/ParametroAvaliacaoAS

[0m[0m11:32:09,268 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MovimentacaoOcorrenciaSacAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/MovimentacaoOcorrenciaSacAS!br.gov.caixa.bsb.sisou.core.ocorrencia.MovimentacaoOcorrenciaSacAS
	java:app/sisou-sac-api/MovimentacaoOcorrenciaSacAS!br.gov.caixa.bsb.sisou.core.ocorrencia.MovimentacaoOcorrenciaSacAS
	java:module/MovimentacaoOcorrenciaSacAS!br.gov.caixa.bsb.sisou.core.ocorrencia.MovimentacaoOcorrenciaSacAS
	java:global/sisou-sac-okd/sisou-sac-api/MovimentacaoOcorrenciaSacAS
	java:app/sisou-sac-api/MovimentacaoOcorrenciaSacAS
	java:module/MovimentacaoOcorrenciaSacAS

[0m[0m11:32:09,268 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PalavraProibidaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PalavraProibidaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.PalavraProibidaAS
	java:app/sisou-sac-api/PalavraProibidaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.PalavraProibidaAS
	java:module/PalavraProibidaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.PalavraProibidaAS
	java:global/sisou-sac-okd/sisou-sac-api/PalavraProibidaAS
	java:app/sisou-sac-api/PalavraProibidaAS
	java:module/PalavraProibidaAS

[0m[0m11:32:09,268 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TemplatePerguntaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TemplatePerguntaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.TemplatePerguntaConverter
	java:app/sisou-sac-api/TemplatePerguntaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.TemplatePerguntaConverter
	java:module/TemplatePerguntaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.TemplatePerguntaConverter
	java:global/sisou-sac-okd/sisou-sac-api/TemplatePerguntaConverter
	java:app/sisou-sac-api/TemplatePerguntaConverter
	java:module/TemplatePerguntaConverter

[0m[0m11:32:09,268 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'EmpregadoVinculadoConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/EmpregadoVinculadoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.EmpregadoVinculadoConverter
	java:app/sisou-sac-api/EmpregadoVinculadoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.EmpregadoVinculadoConverter
	java:module/EmpregadoVinculadoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.EmpregadoVinculadoConverter
	java:global/sisou-sac-okd/sisou-sac-api/EmpregadoVinculadoConverter
	java:app/sisou-sac-api/EmpregadoVinculadoConverter
	java:module/EmpregadoVinculadoConverter

[0m[0m11:32:09,268 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'CriarOuAtualizarSolicitante' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/CriarOuAtualizarSolicitante!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.CriarOuAtualizarSolicitante
	java:app/sisou-sac-api/CriarOuAtualizarSolicitante!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.CriarOuAtualizarSolicitante
	java:module/CriarOuAtualizarSolicitante!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.CriarOuAtualizarSolicitante
	java:global/sisou-sac-okd/sisou-sac-api/CriarOuAtualizarSolicitante
	java:app/sisou-sac-api/CriarOuAtualizarSolicitante
	java:module/CriarOuAtualizarSolicitante

[0m[0m11:32:09,268 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'RecuperarSolicitacaoProrrogacaoPrazo' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/RecuperarSolicitacaoProrrogacaoPrazo!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.RecuperarSolicitacaoProrrogacaoPrazo
	java:app/sisou-sac-api/RecuperarSolicitacaoProrrogacaoPrazo!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.RecuperarSolicitacaoProrrogacaoPrazo
	java:module/RecuperarSolicitacaoProrrogacaoPrazo!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.RecuperarSolicitacaoProrrogacaoPrazo
	java:global/sisou-sac-okd/sisou-sac-api/RecuperarSolicitacaoProrrogacaoPrazo
	java:app/sisou-sac-api/RecuperarSolicitacaoProrrogacaoPrazo
	java:module/RecuperarSolicitacaoProrrogacaoPrazo

[0m[0m11:32:09,268 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ConsumidorGovAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ConsumidorGovAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ConsumidorGovAS
	java:app/sisou-sac-api/ConsumidorGovAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ConsumidorGovAS
	java:module/ConsumidorGovAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ConsumidorGovAS
	java:global/sisou-sac-okd/sisou-sac-api/ConsumidorGovAS
	java:app/sisou-sac-api/ConsumidorGovAS
	java:module/ConsumidorGovAS

[0m[0m11:32:09,268 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ParametrizacaoAtendimentoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ParametrizacaoAtendimentoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ParametrizacaoAtendimentoAS
	java:app/sisou-sac-api/ParametrizacaoAtendimentoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ParametrizacaoAtendimentoAS
	java:module/ParametrizacaoAtendimentoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ParametrizacaoAtendimentoAS
	java:global/sisou-sac-okd/sisou-sac-api/ParametrizacaoAtendimentoAS
	java:app/sisou-sac-api/ParametrizacaoAtendimentoAS
	java:module/ParametrizacaoAtendimentoAS

[0m[0m11:32:09,268 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'OcorrenciaExternaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaExternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.OcorrenciaExternaConverter
	java:app/sisou-sac-api/OcorrenciaExternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.OcorrenciaExternaConverter
	java:module/OcorrenciaExternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.OcorrenciaExternaConverter
	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaExternaConverter
	java:app/sisou-sac-api/OcorrenciaExternaConverter
	java:module/OcorrenciaExternaConverter

[0m[0m11:32:09,268 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'AssuntoConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/AssuntoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.AssuntoConverter
	java:app/sisou-sac-api/AssuntoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.AssuntoConverter
	java:module/AssuntoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.AssuntoConverter
	java:global/sisou-sac-okd/sisou-sac-api/AssuntoConverter
	java:app/sisou-sac-api/AssuntoConverter
	java:module/AssuntoConverter

[0m[0m11:32:09,268 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ParametroConsoleAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ParametroConsoleAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ParametroConsoleAS
	java:app/sisou-sac-api/ParametroConsoleAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ParametroConsoleAS
	java:module/ParametroConsoleAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ParametroConsoleAS
	java:global/sisou-sac-okd/sisou-sac-api/ParametroConsoleAS
	java:app/sisou-sac-api/ParametroConsoleAS
	java:module/ParametroConsoleAS

[0m[0m11:32:09,268 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'IndicadoresConsolesAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/IndicadoresConsolesAS!br.gov.caixa.bsb.sisou.core.ocorrencia.IndicadoresConsolesAS
	java:app/sisou-sac-api/IndicadoresConsolesAS!br.gov.caixa.bsb.sisou.core.ocorrencia.IndicadoresConsolesAS
	java:module/IndicadoresConsolesAS!br.gov.caixa.bsb.sisou.core.ocorrencia.IndicadoresConsolesAS
	java:global/sisou-sac-okd/sisou-sac-api/IndicadoresConsolesAS
	java:app/sisou-sac-api/IndicadoresConsolesAS
	java:module/IndicadoresConsolesAS

[0m[0m11:32:09,268 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'LoteArquivoCartaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/LoteArquivoCartaAS!br.gov.caixa.bsb.sisou.core.correios.LoteArquivoCartaAS
	java:app/sisou-sac-api/LoteArquivoCartaAS!br.gov.caixa.bsb.sisou.core.correios.LoteArquivoCartaAS
	java:module/LoteArquivoCartaAS!br.gov.caixa.bsb.sisou.core.correios.LoteArquivoCartaAS
	java:global/sisou-sac-okd/sisou-sac-api/LoteArquivoCartaAS
	java:app/sisou-sac-api/LoteArquivoCartaAS
	java:module/LoteArquivoCartaAS

[0m[0m11:32:09,268 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'InteracaoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/InteracaoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.InteracaoAS
	java:app/sisou-sac-api/InteracaoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.InteracaoAS
	java:module/InteracaoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.InteracaoAS
	java:global/sisou-sac-okd/sisou-sac-api/InteracaoAS
	java:app/sisou-sac-api/InteracaoAS
	java:module/InteracaoAS

[0m[0m11:32:09,269 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PedidoClienteAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PedidoClienteAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.PedidoClienteAS
	java:app/sisou-sac-api/PedidoClienteAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.PedidoClienteAS
	java:module/PedidoClienteAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.PedidoClienteAS
	java:global/sisou-sac-okd/sisou-sac-api/PedidoClienteAS
	java:app/sisou-sac-api/PedidoClienteAS
	java:module/PedidoClienteAS

[0m[0m11:32:09,269 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TrabalhoEquipeConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TrabalhoEquipeConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.TrabalhoEquipeConverter
	java:app/sisou-sac-api/TrabalhoEquipeConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.TrabalhoEquipeConverter
	java:module/TrabalhoEquipeConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.TrabalhoEquipeConverter
	java:global/sisou-sac-okd/sisou-sac-api/TrabalhoEquipeConverter
	java:app/sisou-sac-api/TrabalhoEquipeConverter
	java:module/TrabalhoEquipeConverter

[0m[0m11:32:09,269 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MovimentacaoOcorrenciaSacConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/MovimentacaoOcorrenciaSacConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.MovimentacaoOcorrenciaSacConverter
	java:app/sisou-sac-api/MovimentacaoOcorrenciaSacConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.MovimentacaoOcorrenciaSacConverter
	java:module/MovimentacaoOcorrenciaSacConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.MovimentacaoOcorrenciaSacConverter
	java:global/sisou-sac-okd/sisou-sac-api/MovimentacaoOcorrenciaSacConverter
	java:app/sisou-sac-api/MovimentacaoOcorrenciaSacConverter
	java:module/MovimentacaoOcorrenciaSacConverter

[0m[0m11:32:09,269 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'GrauSigiloConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/GrauSigiloConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ged.GrauSigiloConverter
	java:app/sisou-sac-api/GrauSigiloConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ged.GrauSigiloConverter
	java:module/GrauSigiloConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ged.GrauSigiloConverter
	java:global/sisou-sac-okd/sisou-sac-api/GrauSigiloConverter
	java:app/sisou-sac-api/GrauSigiloConverter
	java:module/GrauSigiloConverter

[0m[0m11:32:09,269 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'NaturezaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/NaturezaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.NaturezaAS
	java:app/sisou-sac-api/NaturezaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.NaturezaAS
	java:module/NaturezaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.NaturezaAS
	java:global/sisou-sac-okd/sisou-sac-api/NaturezaAS
	java:app/sisou-sac-api/NaturezaAS
	java:module/NaturezaAS

[0m[0m11:32:09,269 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'InteracaoConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/InteracaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.InteracaoConverter
	java:app/sisou-sac-api/InteracaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.InteracaoConverter
	java:module/InteracaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.InteracaoConverter
	java:global/sisou-sac-okd/sisou-sac-api/InteracaoConverter
	java:app/sisou-sac-api/InteracaoConverter
	java:module/InteracaoConverter

[0m[0m11:32:09,269 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TipoFormatoRespostaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TipoFormatoRespostaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.TipoFormatoRespostaConverter
	java:app/sisou-sac-api/TipoFormatoRespostaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.TipoFormatoRespostaConverter
	java:module/TipoFormatoRespostaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.TipoFormatoRespostaConverter
	java:global/sisou-sac-okd/sisou-sac-api/TipoFormatoRespostaConverter
	java:app/sisou-sac-api/TipoFormatoRespostaConverter
	java:module/TipoFormatoRespostaConverter

[0m[0m11:32:09,269 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PainelInformacaoInternaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PainelInformacaoInternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.tratarocorrencia.PainelInformacaoInternaConverter
	java:app/sisou-sac-api/PainelInformacaoInternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.tratarocorrencia.PainelInformacaoInternaConverter
	java:module/PainelInformacaoInternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.tratarocorrencia.PainelInformacaoInternaConverter
	java:global/sisou-sac-okd/sisou-sac-api/PainelInformacaoInternaConverter
	java:app/sisou-sac-api/PainelInformacaoInternaConverter
	java:module/PainelInformacaoInternaConverter

[0m[0m11:32:09,269 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'OcorrenciaExternaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaExternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaExternaAS
	java:app/sisou-sac-api/OcorrenciaExternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaExternaAS
	java:module/OcorrenciaExternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaExternaAS
	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaExternaAS
	java:app/sisou-sac-api/OcorrenciaExternaAS
	java:module/OcorrenciaExternaAS

[0m[0m11:32:09,269 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'AvaliacaoOcorrenciaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/AvaliacaoOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.AvaliacaoOcorrenciaConverter
	java:app/sisou-sac-api/AvaliacaoOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.AvaliacaoOcorrenciaConverter
	java:module/AvaliacaoOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.AvaliacaoOcorrenciaConverter
	java:global/sisou-sac-okd/sisou-sac-api/AvaliacaoOcorrenciaConverter
	java:app/sisou-sac-api/AvaliacaoOcorrenciaConverter
	java:module/AvaliacaoOcorrenciaConverter

[0m[0m11:32:09,269 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PostoAtendimentoProconConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PostoAtendimentoProconConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.PostoAtendimentoProconConverter
	java:app/sisou-sac-api/PostoAtendimentoProconConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.PostoAtendimentoProconConverter
	java:module/PostoAtendimentoProconConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.PostoAtendimentoProconConverter
	java:global/sisou-sac-okd/sisou-sac-api/PostoAtendimentoProconConverter
	java:app/sisou-sac-api/PostoAtendimentoProconConverter
	java:module/PostoAtendimentoProconConverter

[0m[0m11:32:09,269 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'AvaliacaoOcorrenciaExternaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/AvaliacaoOcorrenciaExternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.AvaliacaoOcorrenciaExternaConverter
	java:app/sisou-sac-api/AvaliacaoOcorrenciaExternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.AvaliacaoOcorrenciaExternaConverter
	java:module/AvaliacaoOcorrenciaExternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.AvaliacaoOcorrenciaExternaConverter
	java:global/sisou-sac-okd/sisou-sac-api/AvaliacaoOcorrenciaExternaConverter
	java:app/sisou-sac-api/AvaliacaoOcorrenciaExternaConverter
	java:module/AvaliacaoOcorrenciaExternaConverter

[0m[0m11:32:09,269 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MovimentacaoDominioAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/MovimentacaoDominioAS!br.gov.caixa.bsb.sisou.core.administracao.MovimentacaoDominioAS
	java:app/sisou-sac-api/MovimentacaoDominioAS!br.gov.caixa.bsb.sisou.core.administracao.MovimentacaoDominioAS
	java:module/MovimentacaoDominioAS!br.gov.caixa.bsb.sisou.core.administracao.MovimentacaoDominioAS
	java:global/sisou-sac-okd/sisou-sac-api/MovimentacaoDominioAS
	java:app/sisou-sac-api/MovimentacaoDominioAS
	java:module/MovimentacaoDominioAS

[0m[0m11:32:09,269 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MensagemSMSAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/MensagemSMSAS!br.gov.caixa.bsb.sisou.core.sms.MensagemSMSAS
	java:app/sisou-sac-api/MensagemSMSAS!br.gov.caixa.bsb.sisou.core.sms.MensagemSMSAS
	java:module/MensagemSMSAS!br.gov.caixa.bsb.sisou.core.sms.MensagemSMSAS
	java:global/sisou-sac-okd/sisou-sac-api/MensagemSMSAS
	java:app/sisou-sac-api/MensagemSMSAS
	java:module/MensagemSMSAS

[0m[0m11:32:09,269 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TratarOcorrenciaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TratarOcorrenciaAS!br.gov.caixa.bsb.sisou.core.tratarocorrencia.TratarOcorrenciaAS
	java:app/sisou-sac-api/TratarOcorrenciaAS!br.gov.caixa.bsb.sisou.core.tratarocorrencia.TratarOcorrenciaAS
	java:module/TratarOcorrenciaAS!br.gov.caixa.bsb.sisou.core.tratarocorrencia.TratarOcorrenciaAS
	java:global/sisou-sac-okd/sisou-sac-api/TratarOcorrenciaAS
	java:app/sisou-sac-api/TratarOcorrenciaAS
	java:module/TratarOcorrenciaAS

[0m[0m11:32:09,270 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'EnvioOcorrenciaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/EnvioOcorrenciaAS!br.gov.caixa.bsb.sisou.core.administracao.rdrbacen.EnvioOcorrenciaAS
	java:app/sisou-sac-api/EnvioOcorrenciaAS!br.gov.caixa.bsb.sisou.core.administracao.rdrbacen.EnvioOcorrenciaAS
	java:module/EnvioOcorrenciaAS!br.gov.caixa.bsb.sisou.core.administracao.rdrbacen.EnvioOcorrenciaAS
	java:global/sisou-sac-okd/sisou-sac-api/EnvioOcorrenciaAS
	java:app/sisou-sac-api/EnvioOcorrenciaAS
	java:module/EnvioOcorrenciaAS

[0m[0m11:32:09,270 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'EquipeOcorrenciaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/EquipeOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.EquipeOcorrenciaConverter
	java:app/sisou-sac-api/EquipeOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.EquipeOcorrenciaConverter
	java:module/EquipeOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.EquipeOcorrenciaConverter
	java:global/sisou-sac-okd/sisou-sac-api/EquipeOcorrenciaConverter
	java:app/sisou-sac-api/EquipeOcorrenciaConverter
	java:module/EquipeOcorrenciaConverter

[0m[0m11:32:09,270 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'OrigemConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/OrigemConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.OrigemConverter
	java:app/sisou-sac-api/OrigemConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.OrigemConverter
	java:module/OrigemConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.OrigemConverter
	java:global/sisou-sac-okd/sisou-sac-api/OrigemConverter
	java:app/sisou-sac-api/OrigemConverter
	java:module/OrigemConverter

[0m[0m11:32:09,270 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ProdutoConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ProdutoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ProdutoConverter
	java:app/sisou-sac-api/ProdutoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ProdutoConverter
	java:module/ProdutoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ProdutoConverter
	java:global/sisou-sac-okd/sisou-sac-api/ProdutoConverter
	java:app/sisou-sac-api/ProdutoConverter
	java:module/ProdutoConverter

[0m[0m11:32:09,270 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ContestacaoDecursoPrazoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ContestacaoDecursoPrazoAS!br.gov.caixa.bsb.sisou.core.contestacao.ContestacaoDecursoPrazoAS
	java:app/sisou-sac-api/ContestacaoDecursoPrazoAS!br.gov.caixa.bsb.sisou.core.contestacao.ContestacaoDecursoPrazoAS
	java:module/ContestacaoDecursoPrazoAS!br.gov.caixa.bsb.sisou.core.contestacao.ContestacaoDecursoPrazoAS
	java:global/sisou-sac-okd/sisou-sac-api/ContestacaoDecursoPrazoAS
	java:app/sisou-sac-api/ContestacaoDecursoPrazoAS
	java:module/ContestacaoDecursoPrazoAS

[0m[0m11:32:09,270 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'UnidadeBloqueadaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/UnidadeBloqueadaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.UnidadeBloqueadaConverter
	java:app/sisou-sac-api/UnidadeBloqueadaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.UnidadeBloqueadaConverter
	java:module/UnidadeBloqueadaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.UnidadeBloqueadaConverter
	java:global/sisou-sac-okd/sisou-sac-api/UnidadeBloqueadaConverter
	java:app/sisou-sac-api/UnidadeBloqueadaConverter
	java:module/UnidadeBloqueadaConverter

[0m[0m11:32:09,270 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'SituacaoTarefaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/SituacaoTarefaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.SituacaoTarefaAS
	java:app/sisou-sac-api/SituacaoTarefaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.SituacaoTarefaAS
	java:module/SituacaoTarefaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.SituacaoTarefaAS
	java:global/sisou-sac-okd/sisou-sac-api/SituacaoTarefaAS
	java:app/sisou-sac-api/SituacaoTarefaAS
	java:module/SituacaoTarefaAS

[0m[0m11:32:09,270 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TipoEventoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TipoEventoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoEventoAS
	java:app/sisou-sac-api/TipoEventoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoEventoAS
	java:module/TipoEventoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoEventoAS
	java:global/sisou-sac-okd/sisou-sac-api/TipoEventoAS
	java:app/sisou-sac-api/TipoEventoAS
	java:module/TipoEventoAS

[0m[0m11:32:09,270 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'OcorrenciaFaleConoscoWSAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaFaleConoscoWSAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaFaleConoscoWSAS
	java:app/sisou-sac-api/OcorrenciaFaleConoscoWSAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaFaleConoscoWSAS
	java:module/OcorrenciaFaleConoscoWSAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaFaleConoscoWSAS
	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaFaleConoscoWSAS
	java:app/sisou-sac-api/OcorrenciaFaleConoscoWSAS
	java:module/OcorrenciaFaleConoscoWSAS

[0m[0m11:32:09,270 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'LegadoIntegracaoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/LegadoIntegracaoAS!br.gov.caixa.bsb.sisou.core.integracao.legado.ILegadoIntegracaoAS
	java:app/sisou-sac-api/LegadoIntegracaoAS!br.gov.caixa.bsb.sisou.core.integracao.legado.ILegadoIntegracaoAS
	java:module/LegadoIntegracaoAS!br.gov.caixa.bsb.sisou.core.integracao.legado.ILegadoIntegracaoAS
	java:global/sisou-sac-okd/sisou-sac-api/LegadoIntegracaoAS
	java:app/sisou-sac-api/LegadoIntegracaoAS
	java:module/LegadoIntegracaoAS

[0m[0m11:32:09,270 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PrazoSistemaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PrazoSistemaAS!br.gov.caixa.bsb.sisou.core.ajuda.PrazoSistemaAS
	java:app/sisou-sac-api/PrazoSistemaAS!br.gov.caixa.bsb.sisou.core.ajuda.PrazoSistemaAS
	java:module/PrazoSistemaAS!br.gov.caixa.bsb.sisou.core.ajuda.PrazoSistemaAS
	java:global/sisou-sac-okd/sisou-sac-api/PrazoSistemaAS
	java:app/sisou-sac-api/PrazoSistemaAS
	java:module/PrazoSistemaAS

[0m[0m11:32:09,270 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'OcorrenciaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaAS!br.gov.caixa.bsb.sisou.core.sipqv.OcorrenciaAS
	java:app/sisou-sac-api/OcorrenciaAS!br.gov.caixa.bsb.sisou.core.sipqv.OcorrenciaAS
	java:module/OcorrenciaAS!br.gov.caixa.bsb.sisou.core.sipqv.OcorrenciaAS
	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaAS
	java:app/sisou-sac-api/OcorrenciaAS
	java:module/OcorrenciaAS

[0m[0m11:32:09,270 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'IndicadoresIndividualAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/IndicadoresIndividualAS!br.gov.caixa.bsb.sisou.core.ocorrencia.IndicadoresIndividualAS
	java:app/sisou-sac-api/IndicadoresIndividualAS!br.gov.caixa.bsb.sisou.core.ocorrencia.IndicadoresIndividualAS
	java:module/IndicadoresIndividualAS!br.gov.caixa.bsb.sisou.core.ocorrencia.IndicadoresIndividualAS
	java:global/sisou-sac-okd/sisou-sac-api/IndicadoresIndividualAS
	java:app/sisou-sac-api/IndicadoresIndividualAS
	java:module/IndicadoresIndividualAS

[0m[0m11:32:09,270 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'GrupoTratamentoMetaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/GrupoTratamentoMetaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.GrupoTratamentoMetaConverter
	java:app/sisou-sac-api/GrupoTratamentoMetaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.GrupoTratamentoMetaConverter
	java:module/GrupoTratamentoMetaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.GrupoTratamentoMetaConverter
	java:global/sisou-sac-okd/sisou-sac-api/GrupoTratamentoMetaConverter
	java:app/sisou-sac-api/GrupoTratamentoMetaConverter
	java:module/GrupoTratamentoMetaConverter

[0m[0m11:32:09,270 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'OcorrenciaOuvidoriaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaOuvidoriaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaOuvidoriaAS
	java:app/sisou-sac-api/OcorrenciaOuvidoriaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaOuvidoriaAS
	java:module/OcorrenciaOuvidoriaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaOuvidoriaAS
	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaOuvidoriaAS
	java:app/sisou-sac-api/OcorrenciaOuvidoriaAS
	java:module/OcorrenciaOuvidoriaAS

[0m[0m11:32:09,271 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'CanalConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/CanalConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.CanalConverter
	java:app/sisou-sac-api/CanalConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.CanalConverter
	java:module/CanalConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.CanalConverter
	java:global/sisou-sac-okd/sisou-sac-api/CanalConverter
	java:app/sisou-sac-api/CanalConverter
	java:module/CanalConverter

[0m[0m11:32:09,271 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PerguntaAvaliacaoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PerguntaAvaliacaoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.PerguntaAvaliacaoAS
	java:app/sisou-sac-api/PerguntaAvaliacaoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.PerguntaAvaliacaoAS
	java:module/PerguntaAvaliacaoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.PerguntaAvaliacaoAS
	java:global/sisou-sac-okd/sisou-sac-api/PerguntaAvaliacaoAS
	java:app/sisou-sac-api/PerguntaAvaliacaoAS
	java:module/PerguntaAvaliacaoAS

[0m[0m11:32:09,271 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ProblemaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ProblemaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ProblemaAS
	java:app/sisou-sac-api/ProblemaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ProblemaAS
	java:module/ProblemaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ProblemaAS
	java:global/sisou-sac-okd/sisou-sac-api/ProblemaAS
	java:app/sisou-sac-api/ProblemaAS
	java:module/ProblemaAS

[0m[0m11:32:09,271 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'CanalAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/CanalAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.CanalAS
	java:app/sisou-sac-api/CanalAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.CanalAS
	java:module/CanalAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.CanalAS
	java:global/sisou-sac-okd/sisou-sac-api/CanalAS
	java:app/sisou-sac-api/CanalAS
	java:module/CanalAS

[0m[0m11:32:09,271 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MovimentacaoOcorrenciaInternaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/MovimentacaoOcorrenciaInternaAS!br.gov.caixa.bsb.sisou.core.tratarocorrencia.MovimentacaoOcorrenciaInternaAS
	java:app/sisou-sac-api/MovimentacaoOcorrenciaInternaAS!br.gov.caixa.bsb.sisou.core.tratarocorrencia.MovimentacaoOcorrenciaInternaAS
	java:module/MovimentacaoOcorrenciaInternaAS!br.gov.caixa.bsb.sisou.core.tratarocorrencia.MovimentacaoOcorrenciaInternaAS
	java:global/sisou-sac-okd/sisou-sac-api/MovimentacaoOcorrenciaInternaAS
	java:app/sisou-sac-api/MovimentacaoOcorrenciaInternaAS
	java:module/MovimentacaoOcorrenciaInternaAS

[0m[0m11:32:09,271 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'UnidadeAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/UnidadeAS!br.gov.caixa.bsb.sisou.core.administracao.UnidadeAS
	java:app/sisou-sac-api/UnidadeAS!br.gov.caixa.bsb.sisou.core.administracao.UnidadeAS
	java:module/UnidadeAS!br.gov.caixa.bsb.sisou.core.administracao.UnidadeAS
	java:global/sisou-sac-okd/sisou-sac-api/UnidadeAS
	java:app/sisou-sac-api/UnidadeAS
	java:module/UnidadeAS

[0m[0m11:32:09,271 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'OrientacaoAtendimentoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/OrientacaoAtendimentoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.OrientacaoAtendimentoAS
	java:app/sisou-sac-api/OrientacaoAtendimentoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.OrientacaoAtendimentoAS
	java:module/OrientacaoAtendimentoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.OrientacaoAtendimentoAS
	java:global/sisou-sac-okd/sisou-sac-api/OrientacaoAtendimentoAS
	java:app/sisou-sac-api/OrientacaoAtendimentoAS
	java:module/OrientacaoAtendimentoAS

[0m[0m11:32:09,271 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ReaberturaOcorrenciaInternaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ReaberturaOcorrenciaInternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.reaberturaocorrencia.ReaberturaOcorrenciaInternaConverter
	java:app/sisou-sac-api/ReaberturaOcorrenciaInternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.reaberturaocorrencia.ReaberturaOcorrenciaInternaConverter
	java:module/ReaberturaOcorrenciaInternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.reaberturaocorrencia.ReaberturaOcorrenciaInternaConverter
	java:global/sisou-sac-okd/sisou-sac-api/ReaberturaOcorrenciaInternaConverter
	java:app/sisou-sac-api/ReaberturaOcorrenciaInternaConverter
	java:module/ReaberturaOcorrenciaInternaConverter

[0m[0m11:32:09,271 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ProrrogacaoTarefaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ProrrogacaoTarefaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.tarefa.ProrrogacaoTarefaConverter
	java:app/sisou-sac-api/ProrrogacaoTarefaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.tarefa.ProrrogacaoTarefaConverter
	java:module/ProrrogacaoTarefaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.tarefa.ProrrogacaoTarefaConverter
	java:global/sisou-sac-okd/sisou-sac-api/ProrrogacaoTarefaConverter
	java:app/sisou-sac-api/ProrrogacaoTarefaConverter
	java:module/ProrrogacaoTarefaConverter

[0m[0m11:32:09,271 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'AnexoOcorrenciaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/AnexoOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.AnexoOcorrenciaAS
	java:app/sisou-sac-api/AnexoOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.AnexoOcorrenciaAS
	java:module/AnexoOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.AnexoOcorrenciaAS
	java:global/sisou-sac-okd/sisou-sac-api/AnexoOcorrenciaAS
	java:app/sisou-sac-api/AnexoOcorrenciaAS
	java:module/AnexoOcorrenciaAS

[0m[0m11:32:09,271 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'OcorrenciaSacAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaSacAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaSacAS
	java:app/sisou-sac-api/OcorrenciaSacAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaSacAS
	java:module/OcorrenciaSacAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaSacAS
	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaSacAS
	java:app/sisou-sac-api/OcorrenciaSacAS
	java:module/OcorrenciaSacAS

[0m[0m11:32:09,271 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'FormaRecebimentoRespostaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/FormaRecebimentoRespostaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.FormaRecebimentoRespostaAS
	java:app/sisou-sac-api/FormaRecebimentoRespostaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.FormaRecebimentoRespostaAS
	java:module/FormaRecebimentoRespostaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.FormaRecebimentoRespostaAS
	java:global/sisou-sac-okd/sisou-sac-api/FormaRecebimentoRespostaAS
	java:app/sisou-sac-api/FormaRecebimentoRespostaAS
	java:module/FormaRecebimentoRespostaAS

[0m[0m11:32:09,271 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ConsoleCorreiosAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ConsoleCorreiosAS!br.gov.caixa.bsb.sisou.core.correios.ConsoleCorreiosAS
	java:app/sisou-sac-api/ConsoleCorreiosAS!br.gov.caixa.bsb.sisou.core.correios.ConsoleCorreiosAS
	java:module/ConsoleCorreiosAS!br.gov.caixa.bsb.sisou.core.correios.ConsoleCorreiosAS
	java:global/sisou-sac-okd/sisou-sac-api/ConsoleCorreiosAS
	java:app/sisou-sac-api/ConsoleCorreiosAS
	java:module/ConsoleCorreiosAS

[0m[0m11:32:09,271 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PainelInformacaoInternaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PainelInformacaoInternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PainelInformacaoInternaAS
	java:app/sisou-sac-api/PainelInformacaoInternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PainelInformacaoInternaAS
	java:module/PainelInformacaoInternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PainelInformacaoInternaAS
	java:global/sisou-sac-okd/sisou-sac-api/PainelInformacaoInternaAS
	java:app/sisou-sac-api/PainelInformacaoInternaAS
	java:module/PainelInformacaoInternaAS

[0m[0m11:32:09,272 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MovimentacaoOcorrenciaOuvConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/MovimentacaoOcorrenciaOuvConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.MovimentacaoOcorrenciaOuvConverter
	java:app/sisou-sac-api/MovimentacaoOcorrenciaOuvConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.MovimentacaoOcorrenciaOuvConverter
	java:module/MovimentacaoOcorrenciaOuvConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.MovimentacaoOcorrenciaOuvConverter
	java:global/sisou-sac-okd/sisou-sac-api/MovimentacaoOcorrenciaOuvConverter
	java:app/sisou-sac-api/MovimentacaoOcorrenciaOuvConverter
	java:module/MovimentacaoOcorrenciaOuvConverter

[0m[0m11:32:09,272 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PenalidadeConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PenalidadeConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.PenalidadeConverter
	java:app/sisou-sac-api/PenalidadeConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.PenalidadeConverter
	java:module/PenalidadeConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.PenalidadeConverter
	java:global/sisou-sac-okd/sisou-sac-api/PenalidadeConverter
	java:app/sisou-sac-api/PenalidadeConverter
	java:module/PenalidadeConverter

[0m[0m11:32:09,272 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'UraManagerAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/UraManagerAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.UraManagerAS
	java:app/sisou-sac-api/UraManagerAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.UraManagerAS
	java:module/UraManagerAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.UraManagerAS
	java:global/sisou-sac-okd/sisou-sac-api/UraManagerAS
	java:app/sisou-sac-api/UraManagerAS
	java:module/UraManagerAS

[0m[0m11:32:09,272 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'JustificativaMovimentacaoConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/JustificativaMovimentacaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.JustificativaMovimentacaoConverter
	java:app/sisou-sac-api/JustificativaMovimentacaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.JustificativaMovimentacaoConverter
	java:module/JustificativaMovimentacaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.JustificativaMovimentacaoConverter
	java:global/sisou-sac-okd/sisou-sac-api/JustificativaMovimentacaoConverter
	java:app/sisou-sac-api/JustificativaMovimentacaoConverter
	java:module/JustificativaMovimentacaoConverter

[0m[0m11:32:09,272 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'UraAtendimentoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/UraAtendimentoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.UraAtendimentoAS
	java:app/sisou-sac-api/UraAtendimentoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.UraAtendimentoAS
	java:module/UraAtendimentoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.UraAtendimentoAS
	java:global/sisou-sac-okd/sisou-sac-api/UraAtendimentoAS
	java:app/sisou-sac-api/UraAtendimentoAS
	java:module/UraAtendimentoAS

[0m[0m11:32:09,272 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'SolicitanteConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/SolicitanteConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.SolicitanteConverter
	java:app/sisou-sac-api/SolicitanteConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.SolicitanteConverter
	java:module/SolicitanteConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.SolicitanteConverter
	java:global/sisou-sac-okd/sisou-sac-api/SolicitanteConverter
	java:app/sisou-sac-api/SolicitanteConverter
	java:module/SolicitanteConverter

[0m[0m11:32:09,272 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PesquisaSatisfacaoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PesquisaSatisfacaoAS!br.gov.caixa.bsb.sisou.core.faleconosco.PesquisaSatisfacaoAS
	java:app/sisou-sac-api/PesquisaSatisfacaoAS!br.gov.caixa.bsb.sisou.core.faleconosco.PesquisaSatisfacaoAS
	java:module/PesquisaSatisfacaoAS!br.gov.caixa.bsb.sisou.core.faleconosco.PesquisaSatisfacaoAS
	java:global/sisou-sac-okd/sisou-sac-api/PesquisaSatisfacaoAS
	java:app/sisou-sac-api/PesquisaSatisfacaoAS
	java:module/PesquisaSatisfacaoAS

[0m[0m11:32:09,272 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'AvaliacaoNaturezaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/AvaliacaoNaturezaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.AvaliacaoNaturezaAS
	java:app/sisou-sac-api/AvaliacaoNaturezaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.AvaliacaoNaturezaAS
	java:module/AvaliacaoNaturezaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.AvaliacaoNaturezaAS
	java:global/sisou-sac-okd/sisou-sac-api/AvaliacaoNaturezaAS
	java:app/sisou-sac-api/AvaliacaoNaturezaAS
	java:module/AvaliacaoNaturezaAS

[0m[0m11:32:09,272 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'AssuntoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/AssuntoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.AssuntoAS
	java:app/sisou-sac-api/AssuntoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.AssuntoAS
	java:module/AssuntoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.AssuntoAS
	java:global/sisou-sac-okd/sisou-sac-api/AssuntoAS
	java:app/sisou-sac-api/AssuntoAS
	java:module/AssuntoAS

[0m[0m11:32:09,272 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'LoteCorrespondenciaArquivoComplCartaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/LoteCorrespondenciaArquivoComplCartaAS!br.gov.caixa.bsb.sisou.core.correios.LoteCorrespondenciaArquivoComplCartaAS
	java:app/sisou-sac-api/LoteCorrespondenciaArquivoComplCartaAS!br.gov.caixa.bsb.sisou.core.correios.LoteCorrespondenciaArquivoComplCartaAS
	java:module/LoteCorrespondenciaArquivoComplCartaAS!br.gov.caixa.bsb.sisou.core.correios.LoteCorrespondenciaArquivoComplCartaAS
	java:global/sisou-sac-okd/sisou-sac-api/LoteCorrespondenciaArquivoComplCartaAS
	java:app/sisou-sac-api/LoteCorrespondenciaArquivoComplCartaAS
	java:module/LoteCorrespondenciaArquivoComplCartaAS

[0m[0m11:32:09,272 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PrazoSistemaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PrazoSistemaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ajuda.PrazoSistemaConverter
	java:app/sisou-sac-api/PrazoSistemaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ajuda.PrazoSistemaConverter
	java:module/PrazoSistemaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ajuda.PrazoSistemaConverter
	java:global/sisou-sac-okd/sisou-sac-api/PrazoSistemaConverter
	java:app/sisou-sac-api/PrazoSistemaConverter
	java:module/PrazoSistemaConverter

[0m[0m11:32:09,272 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'RelatoriosAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/RelatoriosAS!br.gov.caixa.bsb.sisou.core.ocorrencia.RelatoriosAS
	java:app/sisou-sac-api/RelatoriosAS!br.gov.caixa.bsb.sisou.core.ocorrencia.RelatoriosAS
	java:module/RelatoriosAS!br.gov.caixa.bsb.sisou.core.ocorrencia.RelatoriosAS
	java:global/sisou-sac-okd/sisou-sac-api/RelatoriosAS
	java:app/sisou-sac-api/RelatoriosAS
	java:module/RelatoriosAS

[0m[0m11:32:09,272 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'GrupoTratamentoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/GrupoTratamentoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.GrupoTratamentoAS
	java:app/sisou-sac-api/GrupoTratamentoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.GrupoTratamentoAS
	java:module/GrupoTratamentoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.GrupoTratamentoAS
	java:global/sisou-sac-okd/sisou-sac-api/GrupoTratamentoAS
	java:app/sisou-sac-api/GrupoTratamentoAS
	java:module/GrupoTratamentoAS

[0m[0m11:32:09,272 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TextoComplementarAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TextoComplementarAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TextoComplementarAS
	java:app/sisou-sac-api/TextoComplementarAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TextoComplementarAS
	java:module/TextoComplementarAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TextoComplementarAS
	java:global/sisou-sac-okd/sisou-sac-api/TextoComplementarAS
	java:app/sisou-sac-api/TextoComplementarAS
	java:module/TextoComplementarAS

[0m[0m11:32:09,273 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ParametroAvaliacaoConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ParametroAvaliacaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ParametroAvaliacaoConverter
	java:app/sisou-sac-api/ParametroAvaliacaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ParametroAvaliacaoConverter
	java:module/ParametroAvaliacaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ParametroAvaliacaoConverter
	java:global/sisou-sac-okd/sisou-sac-api/ParametroAvaliacaoConverter
	java:app/sisou-sac-api/ParametroAvaliacaoConverter
	java:module/ParametroAvaliacaoConverter

[0m[0m11:32:09,273 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'LocalidadeConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/LocalidadeConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.LocalidadeConverter
	java:app/sisou-sac-api/LocalidadeConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.LocalidadeConverter
	java:module/LocalidadeConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.LocalidadeConverter
	java:global/sisou-sac-okd/sisou-sac-api/LocalidadeConverter
	java:app/sisou-sac-api/LocalidadeConverter
	java:module/LocalidadeConverter

[0m[0m11:32:09,273 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'AvaliacaoOcorrenciaExternaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/AvaliacaoOcorrenciaExternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.AvaliacaoOcorrenciaExternaAS
	java:app/sisou-sac-api/AvaliacaoOcorrenciaExternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.AvaliacaoOcorrenciaExternaAS
	java:module/AvaliacaoOcorrenciaExternaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.AvaliacaoOcorrenciaExternaAS
	java:global/sisou-sac-okd/sisou-sac-api/AvaliacaoOcorrenciaExternaAS
	java:app/sisou-sac-api/AvaliacaoOcorrenciaExternaAS
	java:module/AvaliacaoOcorrenciaExternaAS

[0m[0m11:32:09,273 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ItemAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ItemAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ItemAS
	java:app/sisou-sac-api/ItemAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ItemAS
	java:module/ItemAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ItemAS
	java:global/sisou-sac-okd/sisou-sac-api/ItemAS
	java:app/sisou-sac-api/ItemAS
	java:module/ItemAS

[0m[0m11:32:09,273 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MotivoEncerramentoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/MotivoEncerramentoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.MotivoEncerramentoAS
	java:app/sisou-sac-api/MotivoEncerramentoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.MotivoEncerramentoAS
	java:module/MotivoEncerramentoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.MotivoEncerramentoAS
	java:global/sisou-sac-okd/sisou-sac-api/MotivoEncerramentoAS
	java:app/sisou-sac-api/MotivoEncerramentoAS
	java:module/MotivoEncerramentoAS

[0m[0m11:32:09,273 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MotivoRetornoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/MotivoRetornoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.MotivoRetornoAS
	java:app/sisou-sac-api/MotivoRetornoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.MotivoRetornoAS
	java:module/MotivoRetornoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.MotivoRetornoAS
	java:global/sisou-sac-okd/sisou-sac-api/MotivoRetornoAS
	java:app/sisou-sac-api/MotivoRetornoAS
	java:module/MotivoRetornoAS

[0m[0m11:32:09,273 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'UnidadePenalidadeOcorrenciaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/UnidadePenalidadeOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.UnidadePenalidadeOcorrenciaConverter
	java:app/sisou-sac-api/UnidadePenalidadeOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.UnidadePenalidadeOcorrenciaConverter
	java:module/UnidadePenalidadeOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.UnidadePenalidadeOcorrenciaConverter
	java:global/sisou-sac-okd/sisou-sac-api/UnidadePenalidadeOcorrenciaConverter
	java:app/sisou-sac-api/UnidadePenalidadeOcorrenciaConverter
	java:module/UnidadePenalidadeOcorrenciaConverter

[0m[0m11:32:09,273 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'OcorrenciaExternaRespostaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaExternaRespostaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.OcorrenciaExternaRespostaConverter
	java:app/sisou-sac-api/OcorrenciaExternaRespostaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.OcorrenciaExternaRespostaConverter
	java:module/OcorrenciaExternaRespostaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.OcorrenciaExternaRespostaConverter
	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaExternaRespostaConverter
	java:app/sisou-sac-api/OcorrenciaExternaRespostaConverter
	java:module/OcorrenciaExternaRespostaConverter

[0m[0m11:32:09,273 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'EnderecoService' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/EnderecoService!br.gov.caixa.bsb.sisou.core.EnderecoService
	java:app/sisou-sac-api/EnderecoService!br.gov.caixa.bsb.sisou.core.EnderecoService
	java:module/EnderecoService!br.gov.caixa.bsb.sisou.core.EnderecoService
	java:global/sisou-sac-okd/sisou-sac-api/EnderecoService
	java:app/sisou-sac-api/EnderecoService
	java:module/EnderecoService

[0m[0m11:32:09,273 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MotivoConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/MotivoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.MotivoConverter
	java:app/sisou-sac-api/MotivoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.MotivoConverter
	java:module/MotivoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.MotivoConverter
	java:global/sisou-sac-okd/sisou-sac-api/MotivoConverter
	java:app/sisou-sac-api/MotivoConverter
	java:module/MotivoConverter

[0m[0m11:32:09,273 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TipoArquivoCartaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TipoArquivoCartaAS!br.gov.caixa.bsb.sisou.core.correios.TipoArquivoCartaAS
	java:app/sisou-sac-api/TipoArquivoCartaAS!br.gov.caixa.bsb.sisou.core.correios.TipoArquivoCartaAS
	java:module/TipoArquivoCartaAS!br.gov.caixa.bsb.sisou.core.correios.TipoArquivoCartaAS
	java:global/sisou-sac-okd/sisou-sac-api/TipoArquivoCartaAS
	java:app/sisou-sac-api/TipoArquivoCartaAS
	java:module/TipoArquivoCartaAS

[0m[0m11:32:09,273 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'DiarioBordoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/DiarioBordoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.DiarioBordoAS
	java:app/sisou-sac-api/DiarioBordoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.DiarioBordoAS
	java:module/DiarioBordoAS!br.gov.caixa.bsb.sisou.core.ocorrencia.DiarioBordoAS
	java:global/sisou-sac-okd/sisou-sac-api/DiarioBordoAS
	java:app/sisou-sac-api/DiarioBordoAS
	java:module/DiarioBordoAS

[0m[0m11:32:09,273 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PriorizacaoDistribuicaoConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PriorizacaoDistribuicaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.PriorizacaoDistribuicaoConverter
	java:app/sisou-sac-api/PriorizacaoDistribuicaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.PriorizacaoDistribuicaoConverter
	java:module/PriorizacaoDistribuicaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.PriorizacaoDistribuicaoConverter
	java:global/sisou-sac-okd/sisou-sac-api/PriorizacaoDistribuicaoConverter
	java:app/sisou-sac-api/PriorizacaoDistribuicaoConverter
	java:module/PriorizacaoDistribuicaoConverter

[0m[0m11:32:09,273 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PalavraProibidaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PalavraProibidaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.PalavraProibidaConverter
	java:app/sisou-sac-api/PalavraProibidaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.PalavraProibidaConverter
	java:module/PalavraProibidaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.PalavraProibidaConverter
	java:global/sisou-sac-okd/sisou-sac-api/PalavraProibidaConverter
	java:app/sisou-sac-api/PalavraProibidaConverter
	java:module/PalavraProibidaConverter

[0m[0m11:32:09,274 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ClassificacaoOcorrenciaExternaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ClassificacaoOcorrenciaExternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ClassificacaoOcorrenciaExternaConverter
	java:app/sisou-sac-api/ClassificacaoOcorrenciaExternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ClassificacaoOcorrenciaExternaConverter
	java:module/ClassificacaoOcorrenciaExternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ClassificacaoOcorrenciaExternaConverter
	java:global/sisou-sac-okd/sisou-sac-api/ClassificacaoOcorrenciaExternaConverter
	java:app/sisou-sac-api/ClassificacaoOcorrenciaExternaConverter
	java:module/ClassificacaoOcorrenciaExternaConverter

[0m[0m11:32:09,274 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ManualNormativoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ManualNormativoAS!br.gov.caixa.bsb.sisou.core.ajuda.ManualNormativoAS
	java:app/sisou-sac-api/ManualNormativoAS!br.gov.caixa.bsb.sisou.core.ajuda.ManualNormativoAS
	java:module/ManualNormativoAS!br.gov.caixa.bsb.sisou.core.ajuda.ManualNormativoAS
	java:global/sisou-sac-okd/sisou-sac-api/ManualNormativoAS
	java:app/sisou-sac-api/ManualNormativoAS
	java:module/ManualNormativoAS

[0m[0m11:32:09,274 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PedidoClienteConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PedidoClienteConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.PedidoClienteConverter
	java:app/sisou-sac-api/PedidoClienteConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.PedidoClienteConverter
	java:module/PedidoClienteConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.PedidoClienteConverter
	java:global/sisou-sac-okd/sisou-sac-api/PedidoClienteConverter
	java:app/sisou-sac-api/PedidoClienteConverter
	java:module/PedidoClienteConverter

[0m[0m11:32:09,274 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'CategorizacaoOcorrenciaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/CategorizacaoOcorrenciaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.CategorizacaoOcorrenciaAS
	java:app/sisou-sac-api/CategorizacaoOcorrenciaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.CategorizacaoOcorrenciaAS
	java:module/CategorizacaoOcorrenciaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.CategorizacaoOcorrenciaAS
	java:global/sisou-sac-okd/sisou-sac-api/CategorizacaoOcorrenciaAS
	java:app/sisou-sac-api/CategorizacaoOcorrenciaAS
	java:module/CategorizacaoOcorrenciaAS

[0m[0m11:32:09,274 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TarefaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TarefaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.tarefa.TarefaConverter
	java:app/sisou-sac-api/TarefaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.tarefa.TarefaConverter
	java:module/TarefaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.tarefa.TarefaConverter
	java:global/sisou-sac-okd/sisou-sac-api/TarefaConverter
	java:app/sisou-sac-api/TarefaConverter
	java:module/TarefaConverter

[0m[0m11:32:09,274 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TipoAtendimentoProconAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TipoAtendimentoProconAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoAtendimentoProconAS
	java:app/sisou-sac-api/TipoAtendimentoProconAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoAtendimentoProconAS
	java:module/TipoAtendimentoProconAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoAtendimentoProconAS
	java:global/sisou-sac-okd/sisou-sac-api/TipoAtendimentoProconAS
	java:app/sisou-sac-api/TipoAtendimentoProconAS
	java:module/TipoAtendimentoProconAS

[0m[0m11:32:09,274 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ManualNormativoConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ManualNormativoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ajuda.ManualNormativoConverter
	java:app/sisou-sac-api/ManualNormativoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ajuda.ManualNormativoConverter
	java:module/ManualNormativoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ajuda.ManualNormativoConverter
	java:global/sisou-sac-okd/sisou-sac-api/ManualNormativoConverter
	java:app/sisou-sac-api/ManualNormativoConverter
	java:module/ManualNormativoConverter

[0m[0m11:32:09,274 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TipoAtendimentoZeroOitocentosAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TipoAtendimentoZeroOitocentosAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoAtendimentoZeroOitocentosAS
	java:app/sisou-sac-api/TipoAtendimentoZeroOitocentosAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoAtendimentoZeroOitocentosAS
	java:module/TipoAtendimentoZeroOitocentosAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoAtendimentoZeroOitocentosAS
	java:global/sisou-sac-okd/sisou-sac-api/TipoAtendimentoZeroOitocentosAS
	java:app/sisou-sac-api/TipoAtendimentoZeroOitocentosAS
	java:module/TipoAtendimentoZeroOitocentosAS

[0m[0m11:32:09,274 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TipoInconsistenciaArquivoCartaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TipoInconsistenciaArquivoCartaAS!br.gov.caixa.bsb.sisou.core.correios.TipoInconsistenciaArquivoCartaAS
	java:app/sisou-sac-api/TipoInconsistenciaArquivoCartaAS!br.gov.caixa.bsb.sisou.core.correios.TipoInconsistenciaArquivoCartaAS
	java:module/TipoInconsistenciaArquivoCartaAS!br.gov.caixa.bsb.sisou.core.correios.TipoInconsistenciaArquivoCartaAS
	java:global/sisou-sac-okd/sisou-sac-api/TipoInconsistenciaArquivoCartaAS
	java:app/sisou-sac-api/TipoInconsistenciaArquivoCartaAS
	java:module/TipoInconsistenciaArquivoCartaAS

[0m[0m11:32:09,274 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'EnvioOcorrenciaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/EnvioOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.EnvioOcorrenciaConverter
	java:app/sisou-sac-api/EnvioOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.EnvioOcorrenciaConverter
	java:module/EnvioOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.EnvioOcorrenciaConverter
	java:global/sisou-sac-okd/sisou-sac-api/EnvioOcorrenciaConverter
	java:app/sisou-sac-api/EnvioOcorrenciaConverter
	java:module/EnvioOcorrenciaConverter

[0m[0m11:32:09,274 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'EquipeOcorrenciaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/EquipeOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.EquipeOcorrenciaAS
	java:app/sisou-sac-api/EquipeOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.EquipeOcorrenciaAS
	java:module/EquipeOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.EquipeOcorrenciaAS
	java:global/sisou-sac-okd/sisou-sac-api/EquipeOcorrenciaAS
	java:app/sisou-sac-api/EquipeOcorrenciaAS
	java:module/EquipeOcorrenciaAS

[0m[0m11:32:09,274 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ConsumidorGovIntegracaoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ConsumidorGovIntegracaoAS!br.gov.caixa.bsb.sisou.core.integracao.consumidorGov.ConsumidorGovIntegracaoAS
	java:app/sisou-sac-api/ConsumidorGovIntegracaoAS!br.gov.caixa.bsb.sisou.core.integracao.consumidorGov.ConsumidorGovIntegracaoAS
	java:module/ConsumidorGovIntegracaoAS!br.gov.caixa.bsb.sisou.core.integracao.consumidorGov.ConsumidorGovIntegracaoAS
	java:global/sisou-sac-okd/sisou-sac-api/ConsumidorGovIntegracaoAS
	java:app/sisou-sac-api/ConsumidorGovIntegracaoAS
	java:module/ConsumidorGovIntegracaoAS

[0m[0m11:32:09,274 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'GrupoTratamentoMetaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/GrupoTratamentoMetaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.GrupoTratamentoMetaAS
	java:app/sisou-sac-api/GrupoTratamentoMetaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.GrupoTratamentoMetaAS
	java:module/GrupoTratamentoMetaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.GrupoTratamentoMetaAS
	java:global/sisou-sac-okd/sisou-sac-api/GrupoTratamentoMetaAS
	java:app/sisou-sac-api/GrupoTratamentoMetaAS
	java:module/GrupoTratamentoMetaAS

[0m[0m11:32:09,274 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PainelIndicadorPessoalAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PainelIndicadorPessoalAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PainelIndicadorPessoalAS
	java:app/sisou-sac-api/PainelIndicadorPessoalAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PainelIndicadorPessoalAS
	java:module/PainelIndicadorPessoalAS!br.gov.caixa.bsb.sisou.core.ocorrencia.PainelIndicadorPessoalAS
	java:global/sisou-sac-okd/sisou-sac-api/PainelIndicadorPessoalAS
	java:app/sisou-sac-api/PainelIndicadorPessoalAS
	java:module/PainelIndicadorPessoalAS

[0m[0m11:32:09,274 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'DadosProconAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/DadosProconAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.DadosProconAS
	java:app/sisou-sac-api/DadosProconAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.DadosProconAS
	java:module/DadosProconAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.DadosProconAS
	java:global/sisou-sac-okd/sisou-sac-api/DadosProconAS
	java:app/sisou-sac-api/DadosProconAS
	java:module/DadosProconAS

[0m[0m11:32:09,274 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'IndicadoresMembrosAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/IndicadoresMembrosAS!br.gov.caixa.bsb.sisou.core.ocorrencia.IndicadoresMembrosAS
	java:app/sisou-sac-api/IndicadoresMembrosAS!br.gov.caixa.bsb.sisou.core.ocorrencia.IndicadoresMembrosAS
	java:module/IndicadoresMembrosAS!br.gov.caixa.bsb.sisou.core.ocorrencia.IndicadoresMembrosAS
	java:global/sisou-sac-okd/sisou-sac-api/IndicadoresMembrosAS
	java:app/sisou-sac-api/IndicadoresMembrosAS
	java:module/IndicadoresMembrosAS

[0m[0m11:32:09,275 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TemplatePerguntaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TemplatePerguntaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TemplatePerguntaAS
	java:app/sisou-sac-api/TemplatePerguntaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TemplatePerguntaAS
	java:module/TemplatePerguntaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TemplatePerguntaAS
	java:global/sisou-sac-okd/sisou-sac-api/TemplatePerguntaAS
	java:app/sisou-sac-api/TemplatePerguntaAS
	java:module/TemplatePerguntaAS

[0m[0m11:32:09,275 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'EmpregadoVinculadoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/EmpregadoVinculadoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.EmpregadoVinculadoAS
	java:app/sisou-sac-api/EmpregadoVinculadoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.EmpregadoVinculadoAS
	java:module/EmpregadoVinculadoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.EmpregadoVinculadoAS
	java:global/sisou-sac-okd/sisou-sac-api/EmpregadoVinculadoAS
	java:app/sisou-sac-api/EmpregadoVinculadoAS
	java:module/EmpregadoVinculadoAS

[0m[0m11:32:09,275 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PromessaRespostaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/PromessaRespostaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.PromessaRespostaConverter
	java:app/sisou-sac-api/PromessaRespostaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.PromessaRespostaConverter
	java:module/PromessaRespostaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.ocorrencia.PromessaRespostaConverter
	java:global/sisou-sac-okd/sisou-sac-api/PromessaRespostaConverter
	java:app/sisou-sac-api/PromessaRespostaConverter
	java:module/PromessaRespostaConverter

[0m[0m11:32:09,275 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'RecuperarOcorrenciaExternaBacen' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/RecuperarOcorrenciaExternaBacen!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.RecuperarOcorrenciaExternaBacen
	java:app/sisou-sac-api/RecuperarOcorrenciaExternaBacen!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.RecuperarOcorrenciaExternaBacen
	java:module/RecuperarOcorrenciaExternaBacen!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.RecuperarOcorrenciaExternaBacen
	java:global/sisou-sac-okd/sisou-sac-api/RecuperarOcorrenciaExternaBacen
	java:app/sisou-sac-api/RecuperarOcorrenciaExternaBacen
	java:module/RecuperarOcorrenciaExternaBacen

[0m[0m11:32:09,275 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'EquipeAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/EquipeAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.EquipeAS
	java:app/sisou-sac-api/EquipeAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.EquipeAS
	java:module/EquipeAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.EquipeAS
	java:global/sisou-sac-okd/sisou-sac-api/EquipeAS
	java:app/sisou-sac-api/EquipeAS
	java:module/EquipeAS

[0m[0m11:32:09,275 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TipoMensagemSMSConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TipoMensagemSMSConverter!br.gov.caixa.bsb.sisou.core.comum.converter.sms.TipoMensagemSMSConverter
	java:app/sisou-sac-api/TipoMensagemSMSConverter!br.gov.caixa.bsb.sisou.core.comum.converter.sms.TipoMensagemSMSConverter
	java:module/TipoMensagemSMSConverter!br.gov.caixa.bsb.sisou.core.comum.converter.sms.TipoMensagemSMSConverter
	java:global/sisou-sac-okd/sisou-sac-api/TipoMensagemSMSConverter
	java:app/sisou-sac-api/TipoMensagemSMSConverter
	java:module/TipoMensagemSMSConverter

[0m[0m11:32:09,275 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'JustificativaProrrogacaoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/JustificativaProrrogacaoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.JustificativaProrrogacaoAS
	java:app/sisou-sac-api/JustificativaProrrogacaoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.JustificativaProrrogacaoAS
	java:module/JustificativaProrrogacaoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.JustificativaProrrogacaoAS
	java:global/sisou-sac-okd/sisou-sac-api/JustificativaProrrogacaoAS
	java:app/sisou-sac-api/JustificativaProrrogacaoAS
	java:module/JustificativaProrrogacaoAS

[0m[0m11:32:09,275 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'CausaRaizAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/CausaRaizAS!br.gov.caixa.bsb.sisou.core.administracao.especificacoes.CausaRaizAS
	java:app/sisou-sac-api/CausaRaizAS!br.gov.caixa.bsb.sisou.core.administracao.especificacoes.CausaRaizAS
	java:module/CausaRaizAS!br.gov.caixa.bsb.sisou.core.administracao.especificacoes.CausaRaizAS
	java:global/sisou-sac-okd/sisou-sac-api/CausaRaizAS
	java:app/sisou-sac-api/CausaRaizAS
	java:module/CausaRaizAS

[0m[0m11:32:09,275 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'NaturezaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/NaturezaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.NaturezaConverter
	java:app/sisou-sac-api/NaturezaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.NaturezaConverter
	java:module/NaturezaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.NaturezaConverter
	java:global/sisou-sac-okd/sisou-sac-api/NaturezaConverter
	java:app/sisou-sac-api/NaturezaConverter
	java:module/NaturezaConverter

[0m[0m11:32:09,275 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ParametroSistemaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ParametroSistemaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ParametroSistemaAS
	java:app/sisou-sac-api/ParametroSistemaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ParametroSistemaAS
	java:module/ParametroSistemaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.ParametroSistemaAS
	java:global/sisou-sac-okd/sisou-sac-api/ParametroSistemaAS
	java:app/sisou-sac-api/ParametroSistemaAS
	java:module/ParametroSistemaAS

[0m[0m11:32:09,275 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ProblemaComunicacaoConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ProblemaComunicacaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ProblemaComunicacaoConverter
	java:app/sisou-sac-api/ProblemaComunicacaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ProblemaComunicacaoConverter
	java:module/ProblemaComunicacaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.ProblemaComunicacaoConverter
	java:global/sisou-sac-okd/sisou-sac-api/ProblemaComunicacaoConverter
	java:app/sisou-sac-api/ProblemaComunicacaoConverter
	java:module/ProblemaComunicacaoConverter

[0m[0m11:32:09,275 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TipoAtendimentoProconConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TipoAtendimentoProconConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.TipoAtendimentoProconConverter
	java:app/sisou-sac-api/TipoAtendimentoProconConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.TipoAtendimentoProconConverter
	java:module/TipoAtendimentoProconConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.TipoAtendimentoProconConverter
	java:global/sisou-sac-okd/sisou-sac-api/TipoAtendimentoProconConverter
	java:app/sisou-sac-api/TipoAtendimentoProconConverter
	java:module/TipoAtendimentoProconConverter

[0m[0m11:32:09,275 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TratamentoOcorrenciaExternaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TratamentoOcorrenciaExternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.tratarocorrencia.TratamentoOcorrenciaExternaConverter
	java:app/sisou-sac-api/TratamentoOcorrenciaExternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.tratarocorrencia.TratamentoOcorrenciaExternaConverter
	java:module/TratamentoOcorrenciaExternaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.tratarocorrencia.TratamentoOcorrenciaExternaConverter
	java:global/sisou-sac-okd/sisou-sac-api/TratamentoOcorrenciaExternaConverter
	java:app/sisou-sac-api/TratamentoOcorrenciaExternaConverter
	java:module/TratamentoOcorrenciaExternaConverter

[0m[0m11:32:09,275 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TipoMovimentacaoTextoComplementarAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TipoMovimentacaoTextoComplementarAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoMovimentacaoTextoComplementarAS
	java:app/sisou-sac-api/TipoMovimentacaoTextoComplementarAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoMovimentacaoTextoComplementarAS
	java:module/TipoMovimentacaoTextoComplementarAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.TipoMovimentacaoTextoComplementarAS
	java:global/sisou-sac-okd/sisou-sac-api/TipoMovimentacaoTextoComplementarAS
	java:app/sisou-sac-api/TipoMovimentacaoTextoComplementarAS
	java:module/TipoMovimentacaoTextoComplementarAS

[0m[0m11:32:09,275 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'LoteReciboServicoCartaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/LoteReciboServicoCartaAS!br.gov.caixa.bsb.sisou.core.correios.LoteReciboServicoCartaAS
	java:app/sisou-sac-api/LoteReciboServicoCartaAS!br.gov.caixa.bsb.sisou.core.correios.LoteReciboServicoCartaAS
	java:module/LoteReciboServicoCartaAS!br.gov.caixa.bsb.sisou.core.correios.LoteReciboServicoCartaAS
	java:global/sisou-sac-okd/sisou-sac-api/LoteReciboServicoCartaAS
	java:app/sisou-sac-api/LoteReciboServicoCartaAS
	java:module/LoteReciboServicoCartaAS

[0m[0m11:32:09,276 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MovimentacaoOcorrenciaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/MovimentacaoOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.MovimentacaoOcorrenciaAS
	java:app/sisou-sac-api/MovimentacaoOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.MovimentacaoOcorrenciaAS
	java:module/MovimentacaoOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.MovimentacaoOcorrenciaAS
	java:global/sisou-sac-okd/sisou-sac-api/MovimentacaoOcorrenciaAS
	java:app/sisou-sac-api/MovimentacaoOcorrenciaAS
	java:module/MovimentacaoOcorrenciaAS

[0m[0m11:32:09,276 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ParametroOcorrenciaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ParametroOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ParametroOcorrenciaAS
	java:app/sisou-sac-api/ParametroOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ParametroOcorrenciaAS
	java:module/ParametroOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ParametroOcorrenciaAS
	java:global/sisou-sac-okd/sisou-sac-api/ParametroOcorrenciaAS
	java:app/sisou-sac-api/ParametroOcorrenciaAS
	java:module/ParametroOcorrenciaAS

[0m[0m11:32:09,276 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'GerarMinuta' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/GerarMinuta!br.gov.caixa.bsb.sisou.core.ocorrencia.minuta.GerarMinuta
	java:app/sisou-sac-api/GerarMinuta!br.gov.caixa.bsb.sisou.core.ocorrencia.minuta.GerarMinuta
	java:module/GerarMinuta!br.gov.caixa.bsb.sisou.core.ocorrencia.minuta.GerarMinuta
	java:global/sisou-sac-okd/sisou-sac-api/GerarMinuta
	java:app/sisou-sac-api/GerarMinuta
	java:module/GerarMinuta

[0m[0m11:32:09,276 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'EmailTemplateInternaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/EmailTemplateInternaAS!br.gov.caixa.bsb.sisou.core.comum.EmailTemplateInternaAS
	java:app/sisou-sac-api/EmailTemplateInternaAS!br.gov.caixa.bsb.sisou.core.comum.EmailTemplateInternaAS
	java:module/EmailTemplateInternaAS!br.gov.caixa.bsb.sisou.core.comum.EmailTemplateInternaAS
	java:global/sisou-sac-okd/sisou-sac-api/EmailTemplateInternaAS
	java:app/sisou-sac-api/EmailTemplateInternaAS
	java:module/EmailTemplateInternaAS

[0m[0m11:32:09,276 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MensagemOcorrenciaSMSAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/MensagemOcorrenciaSMSAS!br.gov.caixa.bsb.sisou.core.sms.MensagemOcorrenciaSMSAS
	java:app/sisou-sac-api/MensagemOcorrenciaSMSAS!br.gov.caixa.bsb.sisou.core.sms.MensagemOcorrenciaSMSAS
	java:module/MensagemOcorrenciaSMSAS!br.gov.caixa.bsb.sisou.core.sms.MensagemOcorrenciaSMSAS
	java:global/sisou-sac-okd/sisou-sac-api/MensagemOcorrenciaSMSAS
	java:app/sisou-sac-api/MensagemOcorrenciaSMSAS
	java:module/MensagemOcorrenciaSMSAS

[0m[0m11:32:09,276 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ProrrogacaoOcorrenciaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ProrrogacaoOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ProrrogacaoOcorrenciaAS
	java:app/sisou-sac-api/ProrrogacaoOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ProrrogacaoOcorrenciaAS
	java:module/ProrrogacaoOcorrenciaAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ProrrogacaoOcorrenciaAS
	java:global/sisou-sac-okd/sisou-sac-api/ProrrogacaoOcorrenciaAS
	java:app/sisou-sac-api/ProrrogacaoOcorrenciaAS
	java:module/ProrrogacaoOcorrenciaAS

[0m[0m11:32:09,276 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'SecurityConfig' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/SecurityConfig!br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig
	java:app/sisou-sac-api/SecurityConfig!br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig
	java:module/SecurityConfig!br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig
	java:global/sisou-sac-okd/sisou-sac-api/SecurityConfig
	java:app/sisou-sac-api/SecurityConfig
	java:module/SecurityConfig

[0m[0m11:32:09,276 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'IntegracaoIncomingBacenSisouAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/IntegracaoIncomingBacenSisouAS!br.gov.caixa.bsb.sisou.core.integracao.bacen.IIntegracaoIncomingBacenSisouAS
	java:app/sisou-sac-api/IntegracaoIncomingBacenSisouAS!br.gov.caixa.bsb.sisou.core.integracao.bacen.IIntegracaoIncomingBacenSisouAS
	java:module/IntegracaoIncomingBacenSisouAS!br.gov.caixa.bsb.sisou.core.integracao.bacen.IIntegracaoIncomingBacenSisouAS
	java:global/sisou-sac-okd/sisou-sac-api/IntegracaoIncomingBacenSisouAS
	java:app/sisou-sac-api/IntegracaoIncomingBacenSisouAS
	java:module/IntegracaoIncomingBacenSisouAS

[0m[0m11:32:09,276 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'LoteCartaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/LoteCartaAS!br.gov.caixa.bsb.sisou.core.correios.LoteCartaAS
	java:app/sisou-sac-api/LoteCartaAS!br.gov.caixa.bsb.sisou.core.correios.LoteCartaAS
	java:module/LoteCartaAS!br.gov.caixa.bsb.sisou.core.correios.LoteCartaAS
	java:global/sisou-sac-okd/sisou-sac-api/LoteCartaAS
	java:app/sisou-sac-api/LoteCartaAS
	java:module/LoteCartaAS

[0m[0m11:32:09,276 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'JustificativaProrrogacaoConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/JustificativaProrrogacaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.justificativaprorrogacao.JustificativaProrrogacaoConverter
	java:app/sisou-sac-api/JustificativaProrrogacaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.justificativaprorrogacao.JustificativaProrrogacaoConverter
	java:module/JustificativaProrrogacaoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.justificativaprorrogacao.JustificativaProrrogacaoConverter
	java:global/sisou-sac-okd/sisou-sac-api/JustificativaProrrogacaoConverter
	java:app/sisou-sac-api/JustificativaProrrogacaoConverter
	java:module/JustificativaProrrogacaoConverter

[0m[0m11:32:09,276 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ReclameAquiAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ReclameAquiAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ReclameAquiAS
	java:app/sisou-sac-api/ReclameAquiAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ReclameAquiAS
	java:module/ReclameAquiAS!br.gov.caixa.bsb.sisou.core.ocorrencia.ReclameAquiAS
	java:global/sisou-sac-okd/sisou-sac-api/ReclameAquiAS
	java:app/sisou-sac-api/ReclameAquiAS
	java:module/ReclameAquiAS

[0m[0m11:32:09,276 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'OcorrenciaOuvidoriaSacWSAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaOuvidoriaSacWSAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaOuvidoriaSacWSAS
	java:app/sisou-sac-api/OcorrenciaOuvidoriaSacWSAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaOuvidoriaSacWSAS
	java:module/OcorrenciaOuvidoriaSacWSAS!br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaOuvidoriaSacWSAS
	java:global/sisou-sac-okd/sisou-sac-api/OcorrenciaOuvidoriaSacWSAS
	java:app/sisou-sac-api/OcorrenciaOuvidoriaSacWSAS
	java:module/OcorrenciaOuvidoriaSacWSAS

[0m[0m11:32:09,276 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'OrientacaoAtendimentoConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/OrientacaoAtendimentoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.OrientacaoAtendimentoConverter
	java:app/sisou-sac-api/OrientacaoAtendimentoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.OrientacaoAtendimentoConverter
	java:module/OrientacaoAtendimentoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.OrientacaoAtendimentoConverter
	java:global/sisou-sac-okd/sisou-sac-api/OrientacaoAtendimentoConverter
	java:app/sisou-sac-api/OrientacaoAtendimentoConverter
	java:module/OrientacaoAtendimentoConverter

[0m[0m11:32:09,276 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'OrigemTipoFormatoRespostaAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/OrigemTipoFormatoRespostaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.OrigemTipoFormatoRespostaAS
	java:app/sisou-sac-api/OrigemTipoFormatoRespostaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.OrigemTipoFormatoRespostaAS
	java:module/OrigemTipoFormatoRespostaAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.OrigemTipoFormatoRespostaAS
	java:global/sisou-sac-okd/sisou-sac-api/OrigemTipoFormatoRespostaAS
	java:app/sisou-sac-api/OrigemTipoFormatoRespostaAS
	java:module/OrigemTipoFormatoRespostaAS

[0m[0m11:32:09,276 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'CancelarProrrogacaoPrazoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/CancelarProrrogacaoPrazoAS!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.CancelarProrrogacaoPrazoAS
	java:app/sisou-sac-api/CancelarProrrogacaoPrazoAS!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.CancelarProrrogacaoPrazoAS
	java:module/CancelarProrrogacaoPrazoAS!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.CancelarProrrogacaoPrazoAS
	java:global/sisou-sac-okd/sisou-sac-api/CancelarProrrogacaoPrazoAS
	java:app/sisou-sac-api/CancelarProrrogacaoPrazoAS
	java:module/CancelarProrrogacaoPrazoAS

[0m[0m11:32:09,277 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'EquipeTratamentoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/EquipeTratamentoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.EquipeTratamentoAS
	java:app/sisou-sac-api/EquipeTratamentoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.EquipeTratamentoAS
	java:module/EquipeTratamentoAS!br.gov.caixa.bsb.sisou.core.administracao.parametrizacao.EquipeTratamentoAS
	java:global/sisou-sac-okd/sisou-sac-api/EquipeTratamentoAS
	java:app/sisou-sac-api/EquipeTratamentoAS
	java:module/EquipeTratamentoAS

[0m[0m11:32:09,277 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TipoOcorrenciaConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/TipoOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.TipoOcorrenciaConverter
	java:app/sisou-sac-api/TipoOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.TipoOcorrenciaConverter
	java:module/TipoOcorrenciaConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.TipoOcorrenciaConverter
	java:global/sisou-sac-okd/sisou-sac-api/TipoOcorrenciaConverter
	java:app/sisou-sac-api/TipoOcorrenciaConverter
	java:module/TipoOcorrenciaConverter

[0m[0m11:32:09,277 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MotivoRetornoConverter' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/MotivoRetornoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.MotivoRetornoConverter
	java:app/sisou-sac-api/MotivoRetornoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.MotivoRetornoConverter
	java:module/MotivoRetornoConverter!br.gov.caixa.bsb.sisou.core.comum.converter.administracao.parametrizacao.MotivoRetornoConverter
	java:global/sisou-sac-okd/sisou-sac-api/MotivoRetornoConverter
	java:app/sisou-sac-api/MotivoRetornoConverter
	java:module/MotivoRetornoConverter

[0m[0m11:32:09,277 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'CriarOcorrenciaExternaBacen' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/CriarOcorrenciaExternaBacen!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.CriarOcorrenciaExternaBacen
	java:app/sisou-sac-api/CriarOcorrenciaExternaBacen!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.CriarOcorrenciaExternaBacen
	java:module/CriarOcorrenciaExternaBacen!br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.CriarOcorrenciaExternaBacen
	java:global/sisou-sac-okd/sisou-sac-api/CriarOcorrenciaExternaBacen
	java:app/sisou-sac-api/CriarOcorrenciaExternaBacen
	java:module/CriarOcorrenciaExternaBacen

[0m[0m11:32:09,277 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ComboAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:

	java:global/sisou-sac-okd/sisou-sac-api/ComboAS!br.gov.caixa.bsb.sisou.core.comum.ComboAS
	java:app/sisou-sac-api/ComboAS!br.gov.caixa.bsb.sisou.core.comum.ComboAS
	java:module/ComboAS!br.gov.caixa.bsb.sisou.core.comum.ComboAS
	java:global/sisou-sac-okd/sisou-sac-api/ComboAS
	java:app/sisou-sac-api/ComboAS
	java:module/ComboAS

[0m[0m11:32:09,786 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-2) WFLYJCA0004: Deploying JDBC-compliant driver class oracle.jdbc.OracleDriver (version 19.28)
[0m[0m11:32:09,876 INFO  [org.jboss.weld.Version] (MSC service thread 1-2) WELD-000900: 3.1.10 (redhat)
[0m[0m11:32:09,971 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-1) WFLYJCA0018: Started Driver service with driver-name = sisou-sac-okd.ear_oracle.jdbc.OracleDriver_19_28
[0m[33m11:32:11,074 WARN  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0131: Jakarta Enterprise Beans br.gov.caixa.bsb.sisou.core.ocorrencia.TratamentoOcorrenciaExternaAS should not have a final or static method (verificaSeHouveAlteracaoCancelamentoClassificacao)
[0m[33m11:32:11,288 WARN  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0131: Jakarta Enterprise Beans br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaOuvidoriaAS should not have a final or static method (instanciarArrayParaSetAnexos)
[0m[33m11:32:11,371 WARN  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0131: Jakarta Enterprise Beans br.gov.caixa.bsb.sisou.core.comum.converter.tarefa.ProrrogacaoTarefaConverter should not have a final or static method (convertToProrrogacaoOcorrenciaDTO)
[0m[33m11:32:11,375 WARN  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0131: Jakarta Enterprise Beans br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaSacAS should not have a final or static method (guessMimeTypeFromName)
[0m[33m11:32:11,375 WARN  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0131: Jakarta Enterprise Beans br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaSacAS should not have a final or static method (extrairExtensaoFromName)
[0m[33m11:32:11,375 WARN  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0131: Jakarta Enterprise Beans br.gov.caixa.bsb.sisou.core.ocorrencia.OcorrenciaSacAS should not have a final or static method (removerAcentoLocal)
[0m[33m11:32:11,681 WARN  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0131: Jakarta Enterprise Beans br.gov.caixa.bsb.sisou.core.integracao.bacen.ocorrencia.CriarOcorrenciaExternaBacen should not have a final or static method (matchDeatiUser)
[0m[0m11:32:11,701 INFO  [org.jipijapa] (MSC service thread 1-2) JIPIORMV53020253: Second level cache enabled for sisou-sac-okd.ear/sisou-sac-api.war#sisouDB
[0m[33m11:32:12,211 WARN  [org.jboss.as.jaxrs] (MSC service thread 1-2) WFLYRS0018: Explicit usage of Jackson annotation in a Jakarta RESTful Web Services deployment; the system will disable Jakarta JSON Binding processing for the current deployment. Consider setting the 'resteasy.preferJacksonOverJsonB' property to 'false' to restore Jakarta JSON Binding.
[0m[0m11:32:12,279 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-2) WFLYJCA0004: Deploying JDBC-compliant driver class oracle.jdbc.OracleDriver (version 19.28)
[0m[0m11:32:12,387 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-1) WFLYJCA0018: Started Driver service with driver-name = sisou-sac-api.war_oracle.jdbc.OracleDriver_19_28
[0m[0m11:32:12,474 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 74) WFLYJPA0010: Starting Persistence Unit (phase 2 of 2) Service 'sisou-sac-okd.ear/sisou-sac-api.war#sisouDB'
[0m[0m11:32:12,573 INFO  [org.hibernate.dialect.Dialect] (ServerService Thread Pool -- 74) HHH000400: Using dialect: org.hibernate.dialect.Oracle12cDialect
[0m[0m11:32:12,665 INFO  [org.hibernate.engine.jdbc.env.internal.LobCreatorBuilderImpl] (ServerService Thread Pool -- 74) HHH000422: Disabling contextual LOB creation as connection was null
[0m[0m11:32:12,668 INFO  [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 74) HHH000270: Type registration [byte[]] overrides previous : org.hibernate.type.BinaryType@1fe6ff76
[0m[0m11:32:12,668 INFO  [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 74) HHH000270: Type registration [[B] overrides previous : org.hibernate.type.BinaryType@1fe6ff76
[0m[0m11:32:12,668 INFO  [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 74) HHH000270: Type registration [Byte[]] overrides previous : org.hibernate.type.WrapperBinaryType@958772
[0m[0m11:32:12,668 INFO  [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 74) HHH000270: Type registration [[Ljava.lang.Byte;] overrides previous : org.hibernate.type.WrapperBinaryType@958772
[0m[0m11:32:12,672 INFO  [org.hibernate.envers.boot.internal.EnversServiceImpl] (ServerService Thread Pool -- 74) Envers integration enabled? : true
[0m[33m11:32:14,268 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 74) HHH000038: Composite-id class does not override equals(): br.gov.caixa.bsb.sisou.core.comum.persistencia.modelo.administracao.parametrizacao.ParametroAvaliacaoOrigem
[0m[33m11:32:14,268 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 74) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.bsb.sisou.core.comum.persistencia.modelo.administracao.parametrizacao.ParametroAvaliacaoOrigem
[0m[33m11:32:14,274 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 74) HHH000038: Composite-id class does not override equals(): br.gov.caixa.bsb.sisou.core.comum.persistencia.modelo.administracao.parametrizacao.ParametroAvaliacaoNatureza
[0m[33m11:32:14,274 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 74) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.bsb.sisou.core.comum.persistencia.modelo.administracao.parametrizacao.ParametroAvaliacaoNatureza
[0m[33m11:32:14,274 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 74) HHH000038: Composite-id class does not override equals(): br.gov.caixa.bsb.sisou.core.comum.persistencia.modelo.administracao.parametrizacao.ParametroAvaliacaoUnidade
[0m[33m11:32:14,274 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 74) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.bsb.sisou.core.comum.persistencia.modelo.administracao.parametrizacao.ParametroAvaliacaoUnidade
[0m[33m11:32:18,186 WARN  [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (ServerService Thread Pool -- 74) IJ000407: No lazy enlistment available for OracleSisouDS
[0m[0m11:32:25,084 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) Atualizando o cache de ' PERFIL_RECURSO '
[0m[0m11:32:25,084 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_SERVICO' => recurso 'Dados-Gerais-Consulta'
[0m[0m11:32:25,084 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_SERVICO' => recurso 'Dados-Gerais-Listar'
[0m[0m11:32:25,084 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_SERVICO' => recurso 'Ocorrencia-Solicitante-Exclusao'
[0m[0m11:32:25,084 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_SERVICO' => recurso 'Ocorrencia-Solicitante-Alteracao'
[0m[0m11:32:25,084 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_SERVICO' => recurso 'Ocorrencia-Solicitante-Consulta'
[0m[0m11:32:25,084 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_SERVICO' => recurso 'Ocorrencia-Solicitante-Listar'
[0m[0m11:32:25,084 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_SERVICO' => recurso 'Ocorrencia-Solicitante-Inclusao'
[0m[0m11:32:25,084 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_SERVICO' => recurso 'Administracao-Parametrizacao-Origem-Consulta'
[0m[0m11:32:25,084 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_SERVICO' => recurso 'Administracao-Parametrizacao-Origem-Listar'
[0m[0m11:32:25,085 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_SERVICO' => recurso 'Administracao-Parametrizacao-Natureza-Consulta'
[0m[0m11:32:25,085 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_SERVICO' => recurso 'Administracao-Parametrizacao-Natureza-Listar'
[0m[0m11:32:25,085 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_SERVICO' => recurso 'Ocorrencia-Ocorrencia-Ouvidoria-Consulta'
[0m[0m11:32:25,085 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_SERVICO' => recurso 'Ocorrencia-Ocorrencia-Ouvidoria-Listar'
[0m[0m11:32:25,085 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_SERVICO' => recurso 'Ocorrencia-Ocorrencia-Ouvidoria-Inclusao'
[0m[0m11:32:25,085 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_SERVICO' => recurso 'Ocorrencia-Externa-Penalidade-Exclusao'
[0m[0m11:32:25,085 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_SERVICO' => recurso 'Ocorrencia-Externa-Penalidade-Alteracao'
[0m[0m11:32:25,085 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_SERVICO' => recurso 'Ocorrencia-Externa-Penalidade-Consulta'
[0m[0m11:32:25,085 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_SERVICO' => recurso 'Ocorrencia-Externa-Penalidade-Listar'
[0m[0m11:32:25,085 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_SERVICO' => recurso 'Ocorrencia-Externa-Penalidade-Inclusao'
[0m[0m11:32:25,085 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_SERVICO' => recurso 'Subsidiaria-Pagina-Inicial-Consulta'
[0m[0m11:32:25,085 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_SERVICO' => recurso 'Subsidiaria-Pagina-Inicial-Listar'
[0m[0m11:32:25,085 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_SERVICO' => recurso 'Ocorrencia-Ocorrencia-Interna-Consulta'
[0m[0m11:32:25,085 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_SERVICO' => recurso 'Ocorrencia-Ocorrencia-Interna-Listar'
[0m[0m11:32:25,085 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_SERVICO' => recurso 'Ocorrencia-Ocorrencia-Interna-Inclusao'
[0m[0m11:32:25,085 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_SERVICO' => recurso 'Administracao-Parametrizacao-Assunto-Consulta'
[0m[0m11:32:25,085 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_SERVICO' => recurso 'Administracao-Parametrizacao-Assunto-Listar'
[0m[0m11:32:25,085 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_SERVICO' => recurso 'Administracao-Parametrizacao-Motivo-Consulta'
[0m[0m11:32:25,085 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_SERVICO' => recurso 'Administracao-Parametrizacao-Motivo-Listar'
[0m[0m11:32:25,085 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_SERVICO' => recurso 'Administracao-Parametrizacao-Item-Consulta'
[0m[0m11:32:25,085 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_SERVICO' => recurso 'Administracao-Parametrizacao-Item-Listar'
[0m[0m11:32:25,085 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_SERVICO' => recurso 'Ocorrencia-Situacao-Consulta'
[0m[0m11:32:25,085 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_SERVICO' => recurso 'Ocorrencia-Situacao-Listar'
[0m[0m11:32:25,085 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_SERVICO' => recurso 'Administracao-Parametrizacao-MotivoRetorno-Consulta'
[0m[0m11:32:25,085 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_SERVICO' => recurso 'Administracao-Parametrizacao-MotivoRetorno-Listar'
[0m[0m11:32:25,085 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_SERVICO' => recurso 'Fale-Conosco-Consulta'
[0m[0m11:32:25,085 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_SERVICO' => recurso 'Fale-Conosco-Listar'
[0m[0m11:32:25,085 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_SERVICO' => recurso 'Fale-Conosco-Inclusao'
[0m[0m11:32:25,085 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAOP' => recurso 'Subsidiaria-Pagina-Inicial-Consulta'
[0m[0m11:32:25,086 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAOP' => recurso 'Subsidiaria-Pagina-Inicial-Listar'
[0m[0m11:32:25,086 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAOP' => recurso 'Ocorrencia-Tarefa-Consulta'
[0m[0m11:32:25,086 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAOP' => recurso 'Ocorrencia-Tarefa-Listar'
[0m[0m11:32:25,086 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAOP' => recurso 'Ocorrencia-SituacaoTarefa-Consulta'
[0m[0m11:32:25,086 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAOP' => recurso 'Ocorrencia-SituacaoTarefa-Listar'
[0m[0m11:32:25,086 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAOP' => recurso 'Administracao-Parametrizacao-TipoOcorrencia-Consulta'
[0m[0m11:32:25,086 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAOP' => recurso 'Administracao-Parametrizacao-TipoOcorrencia-Listar'
[0m[0m11:32:25,086 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAOP' => recurso 'Ocorrencia-Movimentacao-Consulta'
[0m[0m11:32:25,086 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAOP' => recurso 'Ocorrencia-Movimentacao-Listar'
[0m[0m11:32:25,086 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAOP' => recurso 'Administracao-Parametrizacao-JustificativaProrrogacao-Consulta'
[0m[0m11:32:25,086 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAOP' => recurso 'Administracao-Parametrizacao-JustificativaProrrogacao-Listar'
[0m[0m11:32:25,086 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAOP' => recurso 'Administracao-Parametrizacao-Terceirizada-Consulta'
[0m[0m11:32:25,086 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAOP' => recurso 'Administracao-Parametrizacao-Terceirizada-Listar'
[0m[0m11:32:25,086 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAOP' => recurso 'Ocorrencia-SubsidioOcorrencia-Exclusao'
[0m[0m11:32:25,086 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAOP' => recurso 'Ocorrencia-SubsidioOcorrencia-Alteracao'
[0m[0m11:32:25,086 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAOP' => recurso 'Ocorrencia-SubsidioOcorrencia-Consulta'
[0m[0m11:32:25,086 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAOP' => recurso 'Ocorrencia-SubsidioOcorrencia-Listar'
[0m[0m11:32:25,086 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAOP' => recurso 'Ocorrencia-SubsidioOcorrencia-Inclusao'
[0m[0m11:32:25,086 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAOP' => recurso 'Ocorrencia-Solicitante-Consulta'
[0m[0m11:32:25,086 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAOP' => recurso 'Ocorrencia-Solicitante-Listar'
[0m[0m11:32:25,086 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAOP' => recurso 'Solicitacao-Solicitacao-Unidade-Consulta'
[0m[0m11:32:25,086 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAOP' => recurso 'Solicitacao-Solicitacao-Unidade-Listar'
[0m[0m11:32:25,086 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_SERVICO' => recurso 'Dados-Gerais-Consulta'
[0m[0m11:32:25,086 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_SERVICO' => recurso 'Dados-Gerais-Listar'
[0m[0m11:32:25,086 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_SERVICO' => recurso 'Ocorrencia-Solicitante-Exclusao'
[0m[0m11:32:25,086 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_SERVICO' => recurso 'Ocorrencia-Solicitante-Alteracao'
[0m[0m11:32:25,086 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_SERVICO' => recurso 'Ocorrencia-Solicitante-Consulta'
[0m[0m11:32:25,086 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_SERVICO' => recurso 'Ocorrencia-Solicitante-Listar'
[0m[0m11:32:25,086 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_SERVICO' => recurso 'Ocorrencia-Solicitante-Inclusao'
[0m[0m11:32:25,086 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_SERVICO' => recurso 'Fale-Conosco-Consulta'
[0m[0m11:32:25,086 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_SERVICO' => recurso 'Fale-Conosco-Listar'
[0m[0m11:32:25,086 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_SERVICO' => recurso 'Fale-Conosco-Inclusao'
[0m[0m11:32:25,086 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Origem-Consulta'
[0m[0m11:32:25,086 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Origem-Listar'
[0m[0m11:32:25,087 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Natureza-Consulta'
[0m[0m11:32:25,087 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Natureza-Listar'
[0m[0m11:32:25,087 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Produto-Consulta'
[0m[0m11:32:25,087 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Produto-Listar'
[0m[0m11:32:25,087 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Problema-Consulta'
[0m[0m11:32:25,087 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Problema-Listar'
[0m[0m11:32:25,087 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Canal-Consulta'
[0m[0m11:32:25,087 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Canal-Listar'
[0m[0m11:32:25,087 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-CategorizacaoOcorrencia-Exclusao'
[0m[0m11:32:25,087 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-CategorizacaoOcorrencia-Alteracao'
[0m[0m11:32:25,087 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-CategorizacaoOcorrencia-Consulta'
[0m[0m11:32:25,087 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-CategorizacaoOcorrencia-Listar'
[0m[0m11:32:25,087 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-CategorizacaoOcorrencia-Inclusao'
[0m[0m11:32:25,087 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-TipoDirecionamento-Consulta'
[0m[0m11:32:25,087 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-TipoDirecionamento-Listar'
[0m[0m11:32:25,087 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-OrientacaoAtendimento-Exclusao'
[0m[0m11:32:25,087 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-OrientacaoAtendimento-Alteracao'
[0m[0m11:32:25,087 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-OrientacaoAtendimento-Consulta'
[0m[0m11:32:25,087 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-OrientacaoAtendimento-Listar'
[0m[0m11:32:25,087 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-OrientacaoAtendimento-Inclusao'
[0m[0m11:32:25,087 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Template-Consulta'
[0m[0m11:32:25,087 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Template-Listar'
[0m[0m11:32:25,087 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Motivo-Avaliacao-Consulta'
[0m[0m11:32:25,087 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Motivo-Avaliacao-Listar'
[0m[0m11:32:25,087 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-Ocorrencia-Sac-Exclusao'
[0m[0m11:32:25,087 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-Ocorrencia-Sac-Alteracao'
[0m[0m11:32:25,087 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-Ocorrencia-Sac-Consulta'
[0m[0m11:32:25,087 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-Ocorrencia-Sac-Listar'
[0m[0m11:32:25,087 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-Ocorrencia-Sac-Inclusao'
[0m[0m11:32:25,087 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-Movimentacao-Consulta'
[0m[0m11:32:25,087 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-Movimentacao-Listar'
[0m[0m11:32:25,087 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-DiarioBordo-Exclusao'
[0m[0m11:32:25,087 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-DiarioBordo-Alteracao'
[0m[0m11:32:25,087 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-DiarioBordo-Consulta'
[0m[0m11:32:25,087 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-DiarioBordo-Listar'
[0m[0m11:32:25,087 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-DiarioBordo-Inclusao'
[0m[0m11:32:25,087 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-Tarefa-Sac-Exclusao'
[0m[0m11:32:25,088 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-Tarefa-Sac-Alteracao'
[0m[0m11:32:25,088 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-Tarefa-Sac-Consulta'
[0m[0m11:32:25,088 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-Tarefa-Sac-Listar'
[0m[0m11:32:25,088 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-Tarefa-Sac-Inclusao'
[0m[0m11:32:25,088 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-PedidoCliente-Exclusao'
[0m[0m11:32:25,088 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-PedidoCliente-Alteracao'
[0m[0m11:32:25,088 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-PedidoCliente-Consulta'
[0m[0m11:32:25,088 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-PedidoCliente-Listar'
[0m[0m11:32:25,088 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-PedidoCliente-Inclusao'
[0m[0m11:32:25,088 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-EquipeTratamento-Exclusao'
[0m[0m11:32:25,088 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-EquipeTratamento-Alteracao'
[0m[0m11:32:25,088 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-EquipeTratamento-Consulta'
[0m[0m11:32:25,088 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-EquipeTratamento-Listar'
[0m[0m11:32:25,088 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-EquipeTratamento-Inclusao'
[0m[0m11:32:25,088 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-SituacaoTarefa-Consulta'
[0m[0m11:32:25,088 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-SituacaoTarefa-Listar'
[0m[0m11:32:25,088 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-Pre-Ocorrencia-Exclusao'
[0m[0m11:32:25,088 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-Pre-Ocorrencia-Alteracao'
[0m[0m11:32:25,088 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-Pre-Ocorrencia-Consulta'
[0m[0m11:32:25,088 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-Pre-Ocorrencia-Listar'
[0m[0m11:32:25,088 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-Pre-Ocorrencia-Inclusao'
[0m[0m11:32:25,088 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-MotivoEncerramento-Exclusao'
[0m[0m11:32:25,088 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-MotivoEncerramento-Alteracao'
[0m[0m11:32:25,088 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-MotivoEncerramento-Consulta'
[0m[0m11:32:25,088 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-MotivoEncerramento-Listar'
[0m[0m11:32:25,088 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-MotivoEncerramento-Inclusao'
[0m[0m11:32:25,088 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Dados-Gerais-Consulta'
[0m[0m11:32:25,089 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Dados-Gerais-Listar'
[0m[0m11:32:25,089 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-Solicitante-Exclusao'
[0m[0m11:32:25,089 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-Solicitante-Alteracao'
[0m[0m11:32:25,089 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-Solicitante-Consulta'
[0m[0m11:32:25,089 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-Solicitante-Listar'
[0m[0m11:32:25,089 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-Solicitante-Inclusao'
[0m[0m11:32:25,089 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'ModuloComum-Unidade-Exclusao'
[0m[0m11:32:25,089 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'ModuloComum-Unidade-Alteracao'
[0m[0m11:32:25,089 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'ModuloComum-Unidade-Consulta'
[0m[0m11:32:25,089 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'ModuloComum-Unidade-Listar'
[0m[0m11:32:25,089 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'ModuloComum-Unidade-Inclusao'
[0m[0m11:32:25,089 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Equipe-Ocorrencia-Exclusao'
[0m[0m11:32:25,089 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Equipe-Ocorrencia-Alteracao'
[0m[0m11:32:25,089 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Equipe-Ocorrencia-Consulta'
[0m[0m11:32:25,089 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Equipe-Ocorrencia-Listar'
[0m[0m11:32:25,089 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Equipe-Ocorrencia-Inclusao'
[0m[0m11:32:25,089 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ajuda-Consulta'
[0m[0m11:32:25,089 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ajuda-Listar'
[0m[0m11:32:25,089 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-UnidadeBloqueada-Exclusao'
[0m[0m11:32:25,089 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-UnidadeBloqueada-Alteracao'
[0m[0m11:32:25,089 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-UnidadeBloqueada-Consulta'
[0m[0m11:32:25,089 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-UnidadeBloqueada-Listar'
[0m[0m11:32:25,089 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-UnidadeBloqueada-Inclusao'
[0m[0m11:32:25,089 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-notificacao-Exclusao'
[0m[0m11:32:25,089 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-notificacao-Alteracao'
[0m[0m11:32:25,089 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-notificacao-Consulta'
[0m[0m11:32:25,089 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-notificacao-Listar'
[0m[0m11:32:25,089 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-notificacao-Inclusao'
[0m[0m11:32:25,089 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-SMS-Consulta'
[0m[0m11:32:25,089 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-SMS-Listar'
[0m[0m11:32:25,089 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-Externa-Penalidade-Exclusao'
[0m[0m11:32:25,089 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-Externa-Penalidade-Alteracao'
[0m[0m11:32:25,089 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-Externa-Penalidade-Consulta'
[0m[0m11:32:25,089 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-Externa-Penalidade-Listar'
[0m[0m11:32:25,089 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-Externa-Penalidade-Inclusao'
[0m[0m11:32:25,089 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Solicitacao-Solicitacao-Unidade-Consulta'
[0m[0m11:32:25,089 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Solicitacao-Solicitacao-Unidade-Listar'
[0m[0m11:32:25,089 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Solicitacao-Solicitacao-Unidade-Inclusao'
[0m[0m11:32:25,089 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Terceirizada-Exclusao'
[0m[0m11:32:25,089 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Terceirizada-Alteracao'
[0m[0m11:32:25,089 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Terceirizada-Consulta'
[0m[0m11:32:25,089 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Terceirizada-Listar'
[0m[0m11:32:25,089 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Terceirizada-Inclusao'
[0m[0m11:32:25,089 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-Ocorrencia-Ouvidoria-Consulta'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-Ocorrencia-Ouvidoria-Listar'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-Ocorrencia-Ouvidoria-Inclusao'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Subsidiaria-Pagina-Inicial-Consulta'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Subsidiaria-Pagina-Inicial-Listar'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-Ocorrencia-Interna-Consulta'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-Ocorrencia-Interna-Listar'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-Ocorrencia-Interna-Inclusao'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Assunto-Consulta'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Assunto-Listar'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Motivo-Consulta'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Motivo-Listar'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Item-Consulta'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Item-Listar'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-Situacao-Consulta'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Ocorrencia-Situacao-Listar'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-MotivoRetorno-Consulta'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Administracao-Parametrizacao-MotivoRetorno-Listar'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Fale-Conosco-Consulta'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Fale-Conosco-Listar'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_UNID_ATEND' => recurso 'Fale-Conosco-Inclusao'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Ocorrencia-Tratar-Ocorrencia-Interna-Exclusao'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Ocorrencia-Tratar-Ocorrencia-Interna-Alteracao'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Ocorrencia-Tratar-Ocorrencia-Interna-Consulta'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Ocorrencia-Tratar-Ocorrencia-Interna-Listar'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Ocorrencia-Tratar-Ocorrencia-Interna-Inclusao'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-Assunto-Exclusao'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-Assunto-Alteracao'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-Assunto-Consulta'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-Assunto-Listar'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-Assunto-Inclusao'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-AvaliacaoNatureza-Exclusao'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-AvaliacaoNatureza-Alteracao'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-AvaliacaoNatureza-Consulta'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-AvaliacaoNatureza-Listar'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-AvaliacaoNatureza-Inclusao'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-CategorizacaoOcorrencia-Exclusao'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-CategorizacaoOcorrencia-Alteracao'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-CategorizacaoOcorrencia-Consulta'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-CategorizacaoOcorrencia-Listar'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-CategorizacaoOcorrencia-Inclusao'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-CorreioEletronico-Exclusao'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-CorreioEletronico-Alteracao'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-CorreioEletronico-Consulta'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-CorreioEletronico-Listar'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-CorreioEletronico-Inclusao'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-SMS-Exclusao'
[0m[0m11:32:25,090 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-SMS-Alteracao'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-SMS-Consulta'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-SMS-Listar'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-SMS-Inclusao'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-Item-Exclusao'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-Item-Alteracao'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-Item-Consulta'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-Item-Listar'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-Item-Inclusao'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-JustificativaMovimentacao-Exclusao'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-JustificativaMovimentacao-Alteracao'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-JustificativaMovimentacao-Consulta'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-JustificativaMovimentacao-Listar'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-JustificativaMovimentacao-Inclusao'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-Motivo-Exclusao'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-Motivo-Alteracao'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-Motivo-Consulta'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-Motivo-Listar'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-Motivo-Inclusao'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-Natureza-Exclusao'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-Natureza-Alteracao'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-Natureza-Consulta'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-Natureza-Listar'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-Natureza-Inclusao'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-Produto-Consulta'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-Produto-Listar'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-OrientacaoAtendimento-Exclusao'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-OrientacaoAtendimento-Alteracao'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-OrientacaoAtendimento-Consulta'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-OrientacaoAtendimento-Listar'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-OrientacaoAtendimento-Inclusao'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-Origem-Exclusao'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-Origem-Alteracao'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-Origem-Consulta'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-Origem-Listar'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-Origem-Inclusao'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-UnidadeBloqueada-Exclusao'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-UnidadeBloqueada-Alteracao'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-UnidadeBloqueada-Consulta'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-UnidadeBloqueada-Listar'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-UnidadeBloqueada-Inclusao'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Painel-Informacao-Interna-Consulta'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Painel-Informacao-Interna-Listar'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Ocorrencia-Solicitacao-Ocorrencia-Interna-Exclusao'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Ocorrencia-Solicitacao-Ocorrencia-Interna-Alteracao'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Ocorrencia-Solicitacao-Ocorrencia-Interna-Consulta'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Ocorrencia-Solicitacao-Ocorrencia-Interna-Listar'
[0m[0m11:32:25,091 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Ocorrencia-Solicitacao-Ocorrencia-Interna-Inclusao'
[0m[0m11:32:25,094 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Ocorrencia-Ocorrencia-Interna-Exclusao'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Ocorrencia-Ocorrencia-Interna-Alteracao'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Ocorrencia-Ocorrencia-Interna-Consulta'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Ocorrencia-Ocorrencia-Interna-Listar'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Ocorrencia-Ocorrencia-Interna-Inclusao'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Ajuda-Exclusao'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Ajuda-Alteracao'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Ajuda-Consulta'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Ajuda-Listar'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Ajuda-Inclusao'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'ModuloComum-Unidade-Exclusao'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'ModuloComum-Unidade-Alteracao'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'ModuloComum-Unidade-Consulta'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'ModuloComum-Unidade-Listar'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'ModuloComum-Unidade-Inclusao'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Tratar-Ocorrencia-Movimentacao-Ocorrencia-Interna-Consulta'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Tratar-Ocorrencia-Movimentacao-Ocorrencia-Interna-Listar'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'ModuloComum-Correspondente-Exclusao'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'ModuloComum-Correspondente-Alteracao'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'ModuloComum-Correspondente-Consulta'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'ModuloComum-Correspondente-Listar'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'ModuloComum-Correspondente-Inclusao'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Ocorrencia-Situacao-Consulta'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Ocorrencia-Situacao-Listar'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-TipoOcorrencia-Exclusao'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-TipoOcorrencia-Alteracao'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-TipoOcorrencia-Consulta'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-TipoOcorrencia-Listar'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-TipoOcorrencia-Inclusao'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Hoje-Caixa-Ocorrencia-Interna-Exclusao'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Hoje-Caixa-Ocorrencia-Interna-Alteracao'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Hoje-Caixa-Ocorrencia-Interna-Consulta'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Hoje-Caixa-Ocorrencia-Interna-Listar'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Hoje-Caixa-Ocorrencia-Interna-Inclusao'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Dados-Gerais-Exclusao'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Dados-Gerais-Alteracao'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Dados-Gerais-Consulta'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Dados-Gerais-Listar'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Dados-Gerais-Inclusao'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Subsidiaria-Pagina-Inicial-Exclusao'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Subsidiaria-Pagina-Inicial-Alteracao'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Subsidiaria-Pagina-Inicial-Consulta'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Subsidiaria-Pagina-Inicial-Listar'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Subsidiaria-Pagina-Inicial-Inclusao'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Ocorrencia-Externa-Penalidade-Exclusao'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Ocorrencia-Externa-Penalidade-Alteracao'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Ocorrencia-Externa-Penalidade-Consulta'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Ocorrencia-Externa-Penalidade-Listar'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Ocorrencia-Externa-Penalidade-Inclusao'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Ocorrencia-Tarefa-Exclusao'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Ocorrencia-Tarefa-Alteracao'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Ocorrencia-Tarefa-Consulta'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Ocorrencia-Tarefa-Listar'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Ocorrencia-Tarefa-Inclusao'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Solicitacao-Solicitacao-Unidade-Exclusao'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Solicitacao-Solicitacao-Unidade-Alteracao'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Solicitacao-Solicitacao-Unidade-Consulta'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Solicitacao-Solicitacao-Unidade-Listar'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Solicitacao-Solicitacao-Unidade-Inclusao'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Ocorrencia-Ocorrencia-Ouvidoria-Consulta'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Ocorrencia-Ocorrencia-Ouvidoria-Listar'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Ocorrencia-Ocorrencia-Ouvidoria-Inclusao'
[0m[0m11:32:25,095 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-MotivoRetorno-Consulta'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Administracao-Parametrizacao-MotivoRetorno-Listar'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Fale-Conosco-Consulta'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Fale-Conosco-Listar'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'VIVA_SOLI' => recurso 'Fale-Conosco-Inclusao'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ajuda-Consulta'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ajuda-Listar'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Origem-Consulta'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Origem-Listar'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Natureza-Consulta'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Natureza-Listar'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Produto-Consulta'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Produto-Listar'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Problema-Consulta'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Problema-Listar'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Canal-Consulta'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Canal-Listar'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-CategorizacaoOcorrencia-Consulta'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-CategorizacaoOcorrencia-Listar'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-TipoDirecionamento-Consulta'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-TipoDirecionamento-Listar'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-OrientacaoAtendimento-Exclusao'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-OrientacaoAtendimento-Alteracao'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-OrientacaoAtendimento-Consulta'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-OrientacaoAtendimento-Listar'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-OrientacaoAtendimento-Inclusao'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Template-Consulta'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Template-Listar'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Motivo-Avaliacao-Consulta'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Motivo-Avaliacao-Listar'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-Ocorrencia-Sac-Exclusao'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-Ocorrencia-Sac-Alteracao'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-Ocorrencia-Sac-Consulta'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-Ocorrencia-Sac-Listar'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-Ocorrencia-Sac-Inclusao'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-Movimentacao-Consulta'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-Movimentacao-Listar'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-DiarioBordo-Exclusao'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-DiarioBordo-Alteracao'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-DiarioBordo-Consulta'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-DiarioBordo-Listar'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-DiarioBordo-Inclusao'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-Tarefa-Sac-Exclusao'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-Tarefa-Sac-Alteracao'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-Tarefa-Sac-Consulta'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-Tarefa-Sac-Listar'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-Tarefa-Sac-Inclusao'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-EquipeTratamento-Consulta'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-EquipeTratamento-Listar'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-PedidoCliente-Exclusao'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-PedidoCliente-Alteracao'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-PedidoCliente-Consulta'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-PedidoCliente-Listar'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-PedidoCliente-Inclusao'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-SituacaoTarefa-Consulta'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-SituacaoTarefa-Listar'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-MotivoEncerramento-Exclusao'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-MotivoEncerramento-Alteracao'
[0m[0m11:32:25,096 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-MotivoEncerramento-Consulta'
[0m[0m11:32:25,164 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-MotivoEncerramento-Listar'
[0m[0m11:32:25,164 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-MotivoEncerramento-Inclusao'
[0m[0m11:32:25,164 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-Tarefa-Consulta'
[0m[0m11:32:25,164 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-Tarefa-Listar'
[0m[0m11:32:25,164 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-Tarefa-Alteracao'
[0m[0m11:32:25,164 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-SubsidioOcorrencia-Inclusao'
[0m[0m11:32:25,164 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-SubsidioOcorrencia-Alteracao'
[0m[0m11:32:25,164 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-SubsidioOcorrencia-Consulta'
[0m[0m11:32:25,164 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-SubsidioOcorrencia-Listar'
[0m[0m11:32:25,164 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-Solicitante-Exclusao'
[0m[0m11:32:25,164 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-Solicitante-Alteracao'
[0m[0m11:32:25,164 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-Solicitante-Consulta'
[0m[0m11:32:25,164 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-Solicitante-Listar'
[0m[0m11:32:25,164 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-Solicitante-Inclusao'
[0m[0m11:32:25,164 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'ModuloComum-Unidade-Consulta'
[0m[0m11:32:25,164 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'ModuloComum-Unidade-Listar'
[0m[0m11:32:25,164 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'ModuloComum-Unidade-Inclusao'
[0m[0m11:32:25,164 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-UnidadeBloqueada-Exclusao'
[0m[0m11:32:25,164 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-UnidadeBloqueada-Alteracao'
[0m[0m11:32:25,164 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-UnidadeBloqueada-Consulta'
[0m[0m11:32:25,164 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-UnidadeBloqueada-Listar'
[0m[0m11:32:25,164 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-UnidadeBloqueada-Inclusao'
[0m[0m11:32:25,164 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-notificacao-Exclusao'
[0m[0m11:32:25,164 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-notificacao-Alteracao'
[0m[0m11:32:25,164 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-notificacao-Consulta'
[0m[0m11:32:25,164 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-notificacao-Listar'
[0m[0m11:32:25,164 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-notificacao-Inclusao'
[0m[0m11:32:25,164 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-SMS-Consulta'
[0m[0m11:32:25,164 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-SMS-Listar'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-Externa-Penalidade-Exclusao'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-Externa-Penalidade-Alteracao'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-Externa-Penalidade-Consulta'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-Externa-Penalidade-Listar'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-Externa-Penalidade-Inclusao'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Solicitacao-Solicitacao-Unidade-Consulta'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Solicitacao-Solicitacao-Unidade-Listar'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Solicitacao-Solicitacao-Unidade-Inclusao'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-Pre-Ocorrencia-Exclusao'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-Pre-Ocorrencia-Alteracao'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-Pre-Ocorrencia-Consulta'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-Pre-Ocorrencia-Listar'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-Pre-Ocorrencia-Inclusao'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Terceirizada-Exclusao'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Terceirizada-Alteracao'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Terceirizada-Consulta'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Terceirizada-Listar'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Terceirizada-Inclusao'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-Ocorrencia-Ouvidoria-Consulta'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-Ocorrencia-Ouvidoria-Listar'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-Ocorrencia-Ouvidoria-Inclusao'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Subsidiaria-Pagina-Inicial-Consulta'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Subsidiaria-Pagina-Inicial-Listar'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-Ocorrencia-Interna-Consulta'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-Ocorrencia-Interna-Listar'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-Ocorrencia-Interna-Inclusao'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Assunto-Consulta'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Assunto-Listar'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Motivo-Consulta'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Motivo-Listar'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Item-Consulta'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-Item-Listar'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-Situacao-Consulta'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Ocorrencia-Situacao-Listar'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-MotivoRetorno-Consulta'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Administracao-Parametrizacao-MotivoRetorno-Listar'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Fale-Conosco-Consulta'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Fale-Conosco-Listar'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_OPER_UNID_ATEND' => recurso 'Fale-Conosco-Inclusao'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_ESTRATEGIA' => recurso 'Ocorrencia-Ocorrencia-Ouvidoria-Consulta'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_ESTRATEGIA' => recurso 'Ocorrencia-Ocorrencia-Ouvidoria-Listar'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_ESTRATEGIA' => recurso 'Ocorrencia-Externa-Penalidade-Exclusao'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_ESTRATEGIA' => recurso 'Ocorrencia-Externa-Penalidade-Alteracao'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_ESTRATEGIA' => recurso 'Ocorrencia-Externa-Penalidade-Consulta'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_ESTRATEGIA' => recurso 'Ocorrencia-Externa-Penalidade-Listar'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_ESTRATEGIA' => recurso 'Ocorrencia-Externa-Penalidade-Inclusao'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_ESTRATEGIA' => recurso 'Ocorrencia-Tratar-Ocorrencia-Interna-Exclusao'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_ESTRATEGIA' => recurso 'Ocorrencia-Tratar-Ocorrencia-Interna-Alteracao'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_ESTRATEGIA' => recurso 'Ocorrencia-Tratar-Ocorrencia-Interna-Consulta'
[0m[0m11:32:25,165 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_ESTRATEGIA' => recurso 'Ocorrencia-Tratar-Ocorrencia-Interna-Listar'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'OUV_ESTRATEGIA' => recurso 'Ocorrencia-Tratar-Ocorrencia-Interna-Inclusao'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAGE' => recurso 'Subsidiaria-Pagina-Inicial-Consulta'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAGE' => recurso 'Subsidiaria-Pagina-Inicial-Listar'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAGE' => recurso 'Ocorrencia-Tarefa-Consulta'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAGE' => recurso 'Ocorrencia-Tarefa-Listar'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAGE' => recurso 'Ocorrencia-SituacaoTarefa-Consulta'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAGE' => recurso 'Ocorrencia-SituacaoTarefa-Listar'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAGE' => recurso 'Administracao-Parametrizacao-TipoOcorrencia-Consulta'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAGE' => recurso 'Administracao-Parametrizacao-TipoOcorrencia-Listar'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAGE' => recurso 'Ocorrencia-Movimentacao-Consulta'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAGE' => recurso 'Ocorrencia-Movimentacao-Listar'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAGE' => recurso 'Administracao-Parametrizacao-JustificativaProrrogacao-Consulta'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAGE' => recurso 'Administracao-Parametrizacao-JustificativaProrrogacao-Listar'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAGE' => recurso 'Administracao-Parametrizacao-Terceirizada-Consulta'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAGE' => recurso 'Administracao-Parametrizacao-Terceirizada-Listar'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAGE' => recurso 'Ocorrencia-SubsidioOcorrencia-Exclusao'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAGE' => recurso 'Ocorrencia-SubsidioOcorrencia-Alteracao'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAGE' => recurso 'Ocorrencia-SubsidioOcorrencia-Consulta'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAGE' => recurso 'Ocorrencia-SubsidioOcorrencia-Listar'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAGE' => recurso 'Ocorrencia-SubsidioOcorrencia-Inclusao'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAGE' => recurso 'Ocorrencia-Solicitante-Consulta'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAGE' => recurso 'Ocorrencia-Solicitante-Listar'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAGE' => recurso 'Solicitacao-Solicitacao-Unidade-Consulta'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SOU_TERCEIRIZADAGE' => recurso 'Solicitacao-Solicitacao-Unidade-Listar'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Origem-Exclusao'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Origem-Alteracao'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Origem-Consulta'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Origem-Listar'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Origem-Inclusao'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Natureza-Exclusao'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Natureza-Alteracao'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Natureza-Consulta'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Natureza-Listar'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Natureza-Inclusao'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Produto-Exclusao'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Produto-Alteracao'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Produto-Consulta'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Produto-Listar'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Produto-Inclusao'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Problema-Exclusao'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Problema-Alteracao'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Problema-Consulta'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Problema-Listar'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Problema-Inclusao'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Canal-Exclusao'
[0m[0m11:32:25,166 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Canal-Alteracao'
[0m[0m11:32:25,167 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Canal-Consulta'
[0m[0m11:32:25,167 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Canal-Listar'
[0m[0m11:32:25,167 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Canal-Inclusao'
[0m[0m11:32:25,167 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-CategorizacaoOcorrencia-Exclusao'
[0m[0m11:32:25,167 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-CategorizacaoOcorrencia-Alteracao'
[0m[0m11:32:25,167 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-CategorizacaoOcorrencia-Consulta'
[0m[0m11:32:25,167 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-CategorizacaoOcorrencia-Listar'
[0m[0m11:32:25,167 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-CategorizacaoOcorrencia-Inclusao'
[0m[0m11:32:25,167 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Terceirizada-Exclusao'
[0m[0m11:32:25,167 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Terceirizada-Alteracao'
[0m[0m11:32:25,167 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Terceirizada-Consulta'
[0m[0m11:32:25,167 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Terceirizada-Listar'
[0m[0m11:32:25,167 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Terceirizada-Inclusao'
[0m[0m11:32:25,167 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-TipoDirecionamento-Consulta'
[0m[0m11:32:25,167 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-TipoDirecionamento-Listar'
[0m[0m11:32:25,167 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-OrientacaoAtendimento-Exclusao'
[0m[0m11:32:25,167 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-OrientacaoAtendimento-Alteracao'
[0m[0m11:32:25,167 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-OrientacaoAtendimento-Consulta'
[0m[0m11:32:25,167 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-OrientacaoAtendimento-Listar'
[0m[0m11:32:25,167 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-OrientacaoAtendimento-Inclusao'
[0m[0m11:32:25,167 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Template-Exclusao'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Template-Alteracao'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Template-Consulta'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Template-Listar'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Template-Inclusao'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Motivo-Avaliacao-Exclusao'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Motivo-Avaliacao-Alteracao'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Motivo-Avaliacao-Consulta'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Motivo-Avaliacao-Listar'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Motivo-Avaliacao-Inclusao'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-ParametroAvaliacaoSac-Exclusao'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-ParametroAvaliacaoSac-Alteracao'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-ParametroAvaliacaoSac-Consulta'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-ParametroAvaliacaoSac-Listar'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-ParametroAvaliacaoSac-Inclusao'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-Ocorrencia-Sac-Exclusao'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-Ocorrencia-Sac-Alteracao'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-Ocorrencia-Sac-Consulta'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-Ocorrencia-Sac-Listar'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-Ocorrencia-Sac-Inclusao'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-Movimentacao-Consulta'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-Movimentacao-Listar'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-DiarioBordo-Exclusao'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-DiarioBordo-Alteracao'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-DiarioBordo-Consulta'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-DiarioBordo-Listar'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-DiarioBordo-Inclusao'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-Tarefa-Sac-Exclusao'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-Tarefa-Sac-Alteracao'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-Tarefa-Sac-Consulta'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-Tarefa-Sac-Listar'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-Tarefa-Sac-Inclusao'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Manter-Grupo-Tratamento-Exclusao'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Manter-Grupo-Tratamento-Alteracao'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Manter-Grupo-Tratamento-Consulta'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Manter-Grupo-Tratamento-Listar'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Manter-Grupo-Tratamento-Inclusao'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-PedidoCliente-Exclusao'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-PedidoCliente-Alteracao'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-PedidoCliente-Consulta'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-PedidoCliente-Listar'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-PedidoCliente-Inclusao'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ajuda-Exclusao'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ajuda-Alteracao'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ajuda-Consulta'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ajuda-Listar'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ajuda-Inclusao'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-EquipeTratamento-Exclusao'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-EquipeTratamento-Alteracao'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-EquipeTratamento-Consulta'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-EquipeTratamento-Listar'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-EquipeTratamento-Inclusao'
[0m[0m11:32:25,168 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-PriorizacaoDistribuicao-Consulta'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-PriorizacaoDistribuicao-Listar'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-PenalidadeSavOuv-Exclusao'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-PenalidadeSavOuv-Alteracao'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-PenalidadeSavOuv-Consulta'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-PenalidadeSavOuv-Listar'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-PenalidadeSavOuv-Inclusao'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-SituacaoTarefa-Consulta'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-SituacaoTarefa-Listar'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-Pre-Ocorrencia-Exclusao'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-Pre-Ocorrencia-Alteracao'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-Pre-Ocorrencia-Consulta'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-Pre-Ocorrencia-Listar'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-Pre-Ocorrencia-Inclusao'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-MotivoEncerramento-Exclusao'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-MotivoEncerramento-Alteracao'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-MotivoEncerramento-Consulta'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-MotivoEncerramento-Listar'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-MotivoEncerramento-Inclusao'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-SMS-Exclusao'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-SMS-Alteracao'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-SMS-Consulta'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-SMS-Listar'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-SMS-Inclusao'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Dados-Gerais-Consulta'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Dados-Gerais-Listar'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-Solicitante-Exclusao'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-Solicitante-Alteracao'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-Solicitante-Consulta'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-Solicitante-Listar'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-Solicitante-Inclusao'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-UnidadeBloqueada-Exclusao'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-UnidadeBloqueada-Alteracao'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-UnidadeBloqueada-Consulta'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-UnidadeBloqueada-Listar'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-UnidadeBloqueada-Inclusao'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Minha-Ocorrencia-Sac-Exclusao'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Minha-Ocorrencia-Sac-Alteracao'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Minha-Ocorrencia-Sac-Consulta'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Minha-Ocorrencia-Sac-Listar'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Minha-Ocorrencia-Sac-Inclusao'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Solicitacao-Solicitacao-Unidade-Consulta'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Solicitacao-Solicitacao-Unidade-Listar'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Solicitacao-Solicitacao-Unidade-Inclusao'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-Externa-Penalidade-Exclusao'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-Externa-Penalidade-Alteracao'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-Externa-Penalidade-Consulta'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-Externa-Penalidade-Listar'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-Externa-Penalidade-Inclusao'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-notificacao-Exclusao'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-notificacao-Alteracao'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-notificacao-Consulta'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-notificacao-Listar'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-notificacao-Inclusao'
[0m[0m11:32:25,169 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'ModuloComum-Unidade-Consulta'
[0m[0m11:32:25,170 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'ModuloComum-Unidade-Listar'
[0m[0m11:32:25,170 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'ModuloComum-Unidade-Inclusao'
[0m[0m11:32:25,170 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-Bloqueada-Sac-Exclusao'
[0m[0m11:32:25,170 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-Bloqueada-Sac-Alteracao'
[0m[0m11:32:25,170 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-Bloqueada-Sac-Consulta'
[0m[0m11:32:25,170 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-Bloqueada-Sac-Listar'
[0m[0m11:32:25,170 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-Bloqueada-Sac-Inclusao'
[0m[0m11:32:25,170 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-Ocorrencia-Ouvidoria-Consulta'
[0m[0m11:32:25,170 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-Ocorrencia-Ouvidoria-Listar'
[0m[0m11:32:25,170 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-Ocorrencia-Ouvidoria-Inclusao'
[0m[0m11:32:25,170 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Subsidiaria-Pagina-Inicial-Consulta'
[0m[0m11:32:25,170 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Subsidiaria-Pagina-Inicial-Listar'
[0m[0m11:32:25,170 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-Ocorrencia-Interna-Consulta'
[0m[0m11:32:25,170 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-Ocorrencia-Interna-Listar'
[0m[0m11:32:25,170 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-Ocorrencia-Interna-Inclusao'
[0m[0m11:32:25,170 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Assunto-Consulta'
[0m[0m11:32:25,170 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Assunto-Listar'
[0m[0m11:32:25,170 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Motivo-Consulta'
[0m[0m11:32:25,170 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Motivo-Listar'
[0m[0m11:32:25,170 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Item-Consulta'
[0m[0m11:32:25,170 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-Item-Listar'
[0m[0m11:32:25,170 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-Situacao-Consulta'
[0m[0m11:32:25,170 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Ocorrencia-Situacao-Listar'
[0m[0m11:32:25,170 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-MotivoRetorno-Consulta'
[0m[0m11:32:25,170 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Administracao-Parametrizacao-MotivoRetorno-Listar'
[0m[0m11:32:25,170 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Fale-Conosco-Consulta'
[0m[0m11:32:25,170 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig] (ServerService Thread Pool -- 79) - Permissão: perfil 'SAC_GEST_ADM_SISTEMA' => recurso 'Fale-Conosco-Listar'






	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
	at org.jboss.as.ee@7.4.14.GA-redhat-00002//org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3@7.4.14.GA-redhat-00002//org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3@7.4.14.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:54)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3@7.4.14.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:254)
	... 131 more
Caused by: org.hibernate.exception.ConstraintViolationException: could not execute batch
	at org.hibernate@5.3.32.Final-redhat-00001//org.hibernate.exception.internal.SQLStateConversionDelegate.convert(SQLStateConversionDelegate.java:112)
	at org.hibernate@5.3.32.Final-redhat-00001//org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:42)
	at org.hibernate@5.3.32.Final-redhat-00001//org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:113)
	at org.hibernate@5.3.32.Final-redhat-00001//org.hibernate.engine.jdbc.batch.internal.BatchingBatch.performExecution(BatchingBatch.java:129)
	at org.hibernate@5.3.32.Final-redhat-00001//org.hibernate.engine.jdbc.batch.internal.BatchingBatch.doExecuteBatch(BatchingBatch.java:105)
	at org.hibernate@5.3.32.Final-redhat-00001//org.hibernate.engine.jdbc.batch.internal.AbstractBatchImpl.execute(AbstractBatchImpl.java:148)
	at org.hibernate@5.3.32.Final-redhat-00001//org.hibernate.engine.jdbc.internal.JdbcCoordinatorImpl.executeBatch(JdbcCoordinatorImpl.java:198)
	at org.hibernate@5.3.32.Final-redhat-00001//org.hibernate.engine.spi.ActionQueue.executeActions(ActionQueue.java:633)
	at org.hibernate@5.3.32.Final-redhat-00001//org.hibernate.engine.spi.ActionQueue.executeActions(ActionQueue.java:478)
	at org.hibernate@5.3.32.Final-redhat-00001//org.hibernate.event.internal.AbstractFlushingEventListener.performExecutions(AbstractFlushingEventListener.java:356)
	at org.hibernate@5.3.32.Final-redhat-00001//org.hibernate.event.internal.DefaultFlushEventListener.onFlush(DefaultFlushEventListener.java:39)
	at org.hibernate@5.3.32.Final-redhat-00001//org.hibernate.internal.SessionImpl.doFlush(SessionImpl.java:1472)
	... 170 more
Caused by: java.sql.BatchUpdateException: ORA-02291: integrity constraint (SOU.FK_SOUTB056_SOUTB045) violated - parent key not found

	at com.oracle.jdbc@12.1.0.2.0//oracle.jdbc.driver.OraclePreparedStatement.executeBatch(OraclePreparedStatement.java:12296)
	at com.oracle.jdbc@12.1.0.2.0//oracle.jdbc.driver.OracleStatementWrapper.executeBatch(OracleStatementWrapper.java:246)
	at org.jboss.ironjacamar.jdbcadapters@1.5.15.Final-redhat-00001//org.jboss.jca.adapters.jdbc.WrappedStatement.executeBatch(WrappedStatement.java:1180)
	at org.hibernate@5.3.32.Final-redhat-00001//org.hibernate.engine.jdbc.batch.internal.BatchingBatch.performExecution(BatchingBatch.java:119)
	... 178 more

[0m[0m13:15:59,160 INFO  [br.gov.caixa.arquitetura.javaee.api.comum.seguranca.AuthorizationFilter] (default task-19) Usuário autenticado com sucesso [c891061]
[0m[31m13:15:59,186 ERROR [br.gov.caixa.bsb.sisou.core.integracao.reclameAqui.ReclameAquiIntegracaoAS] (default task-19) Ocorreu um erro ao gerar um bearer token do Reclame Aqui: HTTP 502 Bad Gateway: org.jboss.resteasy.client.exception.ResteasyServerErrorException: HTTP 502 Bad Gateway
	at org.jboss.resteasy.resteasy-jaxrs@3.15.8.Final-redhat-00001//org.jboss.resteasy.client.exception.WebApplicationExceptionWrapper.wrap(WebApplicationExceptionWrapper.java:107)
	at org.jboss.resteasy.resteasy-jaxrs@3.15.8.Final-redhat-00001//org.jboss.resteasy.client.jaxrs.internal.ClientInvocation.handleErrorStatus(ClientInvocation.java:265)
	at org.jboss.resteasy.resteasy-jaxrs@3.15.8.Final-redhat-00001//org.jboss.resteasy.client.jaxrs.internal.ClientInvocation.extractResult(ClientInvocation.java:217)
	at org.jboss.resteasy.resteasy-jaxrs@3.15.8.Final-redhat-00001//org.jboss.resteasy.client.jaxrs.internal.ClientInvocation.invoke(ClientInvocation.java:484)
	at org.jboss.resteasy.resteasy-jaxrs@3.15.8.Final-redhat-00001//org.jboss.resteasy.client.jaxrs.internal.ClientInvocationBuilder.post(ClientInvocationBuilder.java:238)
	at deployment.sisou-sac-okd.ear.sisou-sac-api.war//br.gov.caixa.bsb.sisou.core.integracao.reclameAqui.ReclameAquiIntegracaoAS.gerarToken(ReclameAquiIntegracaoAS.java:95)
	at deployment.sisou-sac-okd.ear.sisou-sac-api.war//br.gov.caixa.bsb.sisou.core.integracao.reclameAqui.ReclameAquiIntegracaoAS.capturarOcorrencias(ReclameAquiIntegracaoAS.java:116)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.jboss.as.ee@7.4.14.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
	at org.jboss.as.weld.common@7.4.14.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
	at org.jboss.as.weld.common@7.4.14.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:89)
	at org.jboss.as.weld.common@7.4.14.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:102)
	at org.jboss.as.ee@7.4.14.GA-redhat-00002//org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3@7.4.14.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:43)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.jpa@7.4.14.GA-redhat-00002//org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ee@7.4.14.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:40)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
	at org.jboss.as.ee@7.4.14.GA-redhat-00002//org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3@7.4.14.GA-redhat-00002//org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3@7.4.14.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:54)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3@7.4.14.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInNoTx(CMTTxInterceptor.java:232)
	at org.jboss.as.ejb3@7.4.14.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.notSupported(CMTTxInterceptor.java:373)
	at org.jboss.as.ejb3@7.4.14.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:149)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
	at org.jboss.weld.core@3.1.10.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:72)
	at org.jboss.as.weld.common@7.4.14.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3@7.4.14.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3@7.4.14.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3@7.4.14.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityOutflowInterceptor.processInvocation(IdentityOutflowInterceptor.java:73)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3@7.4.14.GA-redhat-00002//org.jboss.as.ejb3.security.SecurityDomainInterceptor.processInvocation(SecurityDomainInterceptor.java:44)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3@7.4.14.GA-redhat-00002//org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3@7.4.14.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3@7.4.14.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ee@7.4.14.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
	at org.wildfly.security.elytron-private@1.15.20.Final-redhat-00001//org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:633)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
	at org.jboss.as.ee@7.4.14.GA-redhat-00002//org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
	at org.jboss.as.ee@7.4.14.GA-redhat-00002//org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:191)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3@7.4.14.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.lambda$processInvocation$0(IdentityInterceptor.java:47)
	at org.wildfly.security.elytron-private@1.15.20.Final-redhat-00001//org.wildfly.security.auth.server.SecurityIdentity.runAsFunctionEx(SecurityIdentity.java:421)
	at org.wildfly.security.elytron-private@1.15.20.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsFunctionEx(Scoped.java:161)
	at org.wildfly.security.elytron-private@1.15.20.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsSupplierEx(Scoped.java:229)
	at org.jboss.as.ejb3@7.4.14.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.processInvocation(IdentityInterceptor.java:47)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
	at org.jboss.as.ee@7.4.14.GA-redhat-00002//org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
	at deployment.sisou-sac-okd.ear.sisou-sac-api.war//br.gov.caixa.bsb.sisou.core.integracao.reclameAqui.ReclameAquiIntegracaoAS$$$view56.capturarOcorrencias(Unknown Source)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.jboss.weld.core@3.1.10.Final-redhat-00001//org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:410)
	at org.jboss.weld.core@3.1.10.Final-redhat-00001//org.jboss.weld.module.ejb.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:134)
	at org.jboss.weld.core@3.1.10.Final-redhat-00001//org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:56)
	at org.jboss.weld.core@3.1.10.Final-redhat-00001//org.jboss.weld.module.ejb.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:68)
	at org.jboss.weld.core@3.1.10.Final-redhat-00001//org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:106)
	at deployment.sisou-sac-okd.ear.sisou-sac-api.war//br.gov.caixa.bsb.sisou.core.integracao.reclameAqui.ReclameAquiIntegracaoAS$Proxy$_$$_Weld$EnterpriseProxy$.capturarOcorrencias(Unknown Source)
	at deployment.sisou-sac-okd.ear.sisou-sac-api.war//br.gov.caixa.bsb.sisou.api.ocorrencia.ReclameAquiController.lambda$capturarOcorrencia$1(ReclameAquiController.java:47)
	at deployment.sisou-sac-okd.ear.sisou-sac-api.war//br.gov.caixa.arquitetura.javaee.api.comum.web.BaseRestJsonController.buildResponse(BaseRestJsonController.java:45)
	at deployment.sisou-sac-okd.ear.sisou-sac-api.war//br.gov.caixa.bsb.sisou.api.ocorrencia.ReclameAquiController.capturarOcorrencia(ReclameAquiController.java:47)
	at deployment.sisou-sac-okd.ear.sisou-sac-api.war//br.gov.caixa.bsb.sisou.api.ocorrencia.ReclameAquiController$Proxy$_$$_WeldClientProxy.capturarOcorrencia(Unknown Source)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.jboss.resteasy.resteasy-jaxrs@3.15.8.Final-redhat-00001//org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:138)
	at org.jboss.resteasy.resteasy-jaxrs@3.15.8.Final-redhat-00001//org.jboss.resteasy.core.ResourceMethodInvoker.internalInvokeOnTarget(ResourceMethodInvoker.java:546)
	at org.jboss.resteasy.resteasy-jaxrs@3.15.8.Final-redhat-00001//org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTargetAfterFilter(ResourceMethodInvoker.java:435)
	at org.jboss.resteasy.resteasy-jaxrs@3.15.8.Final-redhat-00001//org.jboss.resteasy.core.ResourceMethodInvoker.lambda$invokeOnTarget$0(ResourceMethodInvoker.java:396)
	at org.jboss.resteasy.resteasy-jaxrs@3.15.8.Final-redhat-00001//org.jboss.resteasy.core.interception.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:358)
	at org.jboss.resteasy.resteasy-jaxrs@3.15.8.Final-redhat-00001//org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:398)
	at org.jboss.resteasy.resteasy-jaxrs@3.15.8.Final-redhat-00001//org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:365)
	at org.jboss.resteasy.resteasy-jaxrs@3.15.8.Final-redhat-00001//org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:338)
	at org.jboss.resteasy.resteasy-jaxrs@3.15.8.Final-redhat-00001//org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:440)
	at org.jboss.resteasy.resteasy-jaxrs@3.15.8.Final-redhat-00001//org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:229)
	at org.jboss.resteasy.resteasy-jaxrs@3.15.8.Final-redhat-00001//org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:135)
	at org.jboss.resteasy.resteasy-jaxrs@3.15.8.Final-redhat-00001//org.jboss.resteasy.core.interception.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:358)
	at org.jboss.resteasy.resteasy-jaxrs@3.15.8.Final-redhat-00001//org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:138)
	at org.jboss.resteasy.resteasy-jaxrs@3.15.8.Final-redhat-00001//org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:215)
	at org.jboss.resteasy.resteasy-jaxrs@3.15.8.Final-redhat-00001//org.jboss.resteasy.plugins.server.servlet.ServletContainerDispatcher.service(ServletContainerDispatcher.java:245)
	at org.jboss.resteasy.resteasy-jaxrs@3.15.8.Final-redhat-00001//org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher.service(HttpServletDispatcher.java:61)
	at org.jboss.resteasy.resteasy-jaxrs@3.15.8.Final-redhat-00001//org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher.service(HttpServletDispatcher.java:56)
	at javax.servlet.api@2.0.0.Final-redhat-00001//javax.servlet.http.HttpServlet.service(HttpServlet.java:590)
	at io.undertow.servlet@2.2.28.SP1-redhat-00001//io.undertow.servlet.handlers.ServletHandler.handleRequest(ServletHandler.java:74)
	at io.undertow.servlet@2.2.28.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:129)
	at io.undertow.websocket@2.2.28.SP1-redhat-00001//io.undertow.websockets.jsr.JsrWebSocketFilter.doFilter(JsrWebSocketFilter.java:173)
	at io.undertow.servlet@2.2.28.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:67)
	at io.undertow.servlet@2.2.28.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
	at io.undertow.servlet@2.2.28.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler.handleRequest(FilterHandler.java:84)
	at io.undertow.servlet@2.2.28.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletSecurityRoleHandler.handleRequest(ServletSecurityRoleHandler.java:62)
	at io.undertow.servlet@2.2.28.SP1-redhat-00001//io.undertow.servlet.handlers.ServletChain$1.handleRequest(ServletChain.java:68)
	at io.undertow.servlet@2.2.28.SP1-redhat-00001//io.undertow.servlet.handlers.ServletDispatchingHandler.handleRequest(ServletDispatchingHandler.java:36)
	at org.wildfly.security.elytron-web.undertow-server@1.9.3.Final-redhat-00001//org.wildfly.elytron.web.undertow.server.ElytronRunAsHandler.lambda$handleRequest$1(ElytronRunAsHandler.java:68)
	at org.wildfly.security.elytron-private@1.15.20.Final-redhat-00001//org.wildfly.security.auth.server.FlexibleIdentityAssociation.runAsFunctionEx(FlexibleIdentityAssociation.java:103)
	at org.wildfly.security.elytron-private@1.15.20.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsFunctionEx(Scoped.java:161)
	at org.wildfly.security.elytron-private@1.15.20.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAs(Scoped.java:73)
	at org.wildfly.security.elytron-web.undertow-server@1.9.3.Final-redhat-00001//org.wildfly.elytron.web.undertow.server.ElytronRunAsHandler.handleRequest(ElytronRunAsHandler.java:67)
	at io.undertow.servlet@2.2.28.SP1-redhat-00001//io.undertow.servlet.handlers.RedirectDirHandler.handleRequest(RedirectDirHandler.java:68)
	at io.undertow.servlet@2.2.28.SP1-redhat-00001//io.undertow.servlet.handlers.security.SSLInformationAssociationHandler.handleRequest(SSLInformationAssociationHandler.java:117)
	at io.undertow.servlet@2.2.28.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletAuthenticationCallHandler.handleRequest(ServletAuthenticationCallHandler.java:57)
	at io.undertow.core@2.2.28.SP1-redhat-00001//io.undertow.server.handlers.DisableCacheHandler.handleRequest(DisableCacheHandler.java:33)
	at io.undertow.core@2.2.28.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at io.undertow.core@2.2.28.SP1-redhat-00001//io.undertow.security.handlers.AuthenticationConstraintHandler.handleRequest(AuthenticationConstraintHandler.java:53)
	at io.undertow.core@2.2.28.SP1-redhat-00001//io.undertow.security.handlers.AbstractConfidentialityHandler.handleRequest(AbstractConfidentialityHandler.java:46)
	at io.undertow.servlet@2.2.28.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletConfidentialityConstraintHandler.handleRequest(ServletConfidentialityConstraintHandler.java:64)
	at io.undertow.servlet@2.2.28.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletSecurityConstraintHandler.handleRequest(ServletSecurityConstraintHandler.java:60)
	at io.undertow.core@2.2.28.SP1-redhat-00001//io.undertow.security.handlers.AbstractSecurityContextAssociationHandler.handleRequest(AbstractSecurityContextAssociationHandler.java:43)
	at org.wildfly.security.elytron-web.undertow-server-servlet@1.9.3.Final-redhat-00001//org.wildfly.elytron.web.undertow.server.servlet.CleanUpHandler.handleRequest(CleanUpHandler.java:38)
	at io.undertow.core@2.2.28.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at org.wildfly.extension.undertow@7.4.14.GA-redhat-00002//org.wildfly.extension.undertow.security.jacc.JACCContextIdHandler.handleRequest(JACCContextIdHandler.java:61)
	at io.undertow.core@2.2.28.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at org.wildfly.extension.undertow@7.4.14.GA-redhat-00002//org.wildfly.extension.undertow.deployment.GlobalRequestControllerHandler.handleRequest(GlobalRequestControllerHandler.java:68)
	at org.keycloak.keycloak-wildfly-elytron-oidc-adapter@9.0.3.redhat-00002//org.keycloak.adapters.elytron.KeycloakServletExtension.lambda$null$0(KeycloakServletExtension.java:39)
	at io.undertow.servlet@2.2.28.SP1-redhat-00001//io.undertow.servlet.handlers.SendErrorPageHandler.handleRequest(SendErrorPageHandler.java:52)
	at io.undertow.core@2.2.28.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at io.undertow.servlet@2.2.28.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.handleFirstRequest(ServletInitialHandler.java:275)
	at io.undertow.servlet@2.2.28.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.access$100(ServletInitialHandler.java:79)
	at io.undertow.servlet@2.2.28.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:134)
	at io.undertow.servlet@2.2.28.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:131)
	at io.undertow.servlet@2.2.28.SP1-redhat-00001//io.undertow.servlet.core.ServletRequestContextThreadSetupAction$1.call(ServletRequestContextThreadSetupAction.java:48)
	at io.undertow.servlet@2.2.28.SP1-redhat-00001//io.undertow.servlet.core.ContextClassLoaderSetupAction$1.call(ContextClassLoaderSetupAction.java:43)
	at org.wildfly.extension.undertow@7.4.14.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
	at org.wildfly.extension.undertow@7.4.14.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
	at org.wildfly.extension.undertow@7.4.14.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
	at org.wildfly.extension.undertow@7.4.14.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
	at org.wildfly.extension.undertow@7.4.14.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
	at io.undertow.servlet@2.2.28.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.dispatchRequest(ServletInitialHandler.java:255)
	at io.undertow.servlet@2.2.28.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.access$000(ServletInitialHandler.java:79)
	at io.undertow.servlet@2.2.28.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$1.handleRequest(ServletInitialHandler.java:100)
	at io.undertow.core@2.2.28.SP1-redhat-00001//io.undertow.server.Connectors.executeRootHandler(Connectors.java:393)
	at io.undertow.core@2.2.28.SP1-redhat-00001//io.undertow.server.HttpServerExchange$1.run(HttpServerExchange.java:852)
	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
	at org.jboss.xnio@3.8.11.SP1-redhat-00001//org.xnio.XnioWorker$WorkerThreadFactory$1$1.run(XnioWorker.java:1282)
	at java.base/java.lang.Thread.run(Thread.java:833)

[0m[31m13:15:59,191 ERROR [br.gov.caixa.bsb.sisou.core.integracao.reclameAqui.ReclameAquiIntegracaoAS] (default task-19) Ocorreu um erro ao capturar uma ocorrência do Reclame Aqui: HTTP 502 Bad Gateway: org.jboss.resteasy.client.exception.ResteasyServerErrorException: HTTP 502 Bad Gateway
	at org.jboss.resteasy.resteasy-jaxrs@3.15.8.Final-redhat-00001//org.jboss.resteasy.client.exception.WebApplicationExceptionWrapper.wrap(WebApplicationExceptionWrapper.java:107)
	at org.jboss.resteasy.resteasy-jaxrs@3.15.8.Final-redhat-00001//org.jboss.resteasy.client.jaxrs.internal.ClientInvocation.handleErrorStatus(ClientInvocation.java:265)
	at org.jboss.resteasy.resteasy-jaxrs@3.15.8.Final-redhat-00001//org.jboss.resteasy.client.jaxrs.internal.ClientInvocation.extractResult(ClientInvocation.java:217)
	at org.jboss.resteasy.resteasy-jaxrs@3.15.8.Final-redhat-00001//org.jboss.resteasy.client.jaxrs.internal.ClientInvocation.invoke(ClientInvocation.java:484)
	at org.jboss.resteasy.resteasy-jaxrs@3.15.8.Final-redhat-00001//org.jboss.resteasy.client.jaxrs.internal.ClientInvocationBuilder.get(ClientInvocationBuilder.java:202)
	at deployment.sisou-sac-okd.ear.sisou-sac-api.war//br.gov.caixa.bsb.sisou.core.integracao.reclameAqui.ReclameAquiIntegracaoAS.capturarOcorrencias(ReclameAquiIntegracaoAS.java:123)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.jboss.as.ee@7.4.14.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
	at org.jboss.as.weld.common@7.4.14.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
	at org.jboss.as.weld.common@7.4.14.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:89)
	at org.jboss.as.weld.common@7.4.14.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:102)
	at org.jboss.as.ee@7.4.14.GA-redhat-00002//org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3@7.4.14.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:43)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.jpa@7.4.14.GA-redhat-00002//org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ee@7.4.14.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:40)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
	at org.jboss.as.ee@7.4.14.GA-redhat-00002//org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3@7.4.14.GA-redhat-00002//org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3@7.4.14.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:54)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3@7.4.14.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInNoTx(CMTTxInterceptor.java:232)
	at org.jboss.as.ejb3@7.4.14.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.notSupported(CMTTxInterceptor.java:373)
	at org.jboss.as.ejb3@7.4.14.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:149)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
	at org.jboss.weld.core@3.1.10.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:72)
	at org.jboss.as.weld.common@7.4.14.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3@7.4.14.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3@7.4.14.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3@7.4.14.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityOutflowInterceptor.processInvocation(IdentityOutflowInterceptor.java:73)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3@7.4.14.GA-redhat-00002//org.jboss.as.ejb3.security.SecurityDomainInterceptor.processInvocation(SecurityDomainInterceptor.java:44)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3@7.4.14.GA-redhat-00002//org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3@7.4.14.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3@7.4.14.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ee@7.4.14.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
	at org.wildfly.security.elytron-private@1.15.20.Final-redhat-00001//org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:633)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
	at org.jboss.as.ee@7.4.14.GA-redhat-00002//org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
	at org.jboss.as.ee@7.4.14.GA-redhat-00002//org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:191)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3@7.4.14.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.lambda$processInvocation$0(IdentityInterceptor.java:47)
	at org.wildfly.security.elytron-private@1.15.20.Final-redhat-00001//org.wildfly.security.auth.server.SecurityIdentity.runAsFunctionEx(SecurityIdentity.java:421)
	at org.wildfly.security.elytron-private@1.15.20.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsFunctionEx(Scoped.java:161)
	at org.wildfly.security.elytron-private@1.15.20.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsSupplierEx(Scoped.java:229)
	at org.jboss.as.ejb3@7.4.14.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.processInvocation(IdentityInterceptor.java:47)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation@1.6.3.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
	at org.jboss.as.ee@7.4.14.GA-redhat-00002//org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
	at deployment.sisou-sac-okd.ear.sisou-sac-api.war//br.gov.caixa.bsb.sisou.core.integracao.reclameAqui.ReclameAquiIntegracaoAS$$$view56.capturarOcorrencias(Unknown Source)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.jboss.weld.core@3.1.10.Final-redhat-00001//org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:410)
	at org.jboss.weld.core@3.1.10.Final-redhat-00001//org.jboss.weld.module.ejb.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:134)
	at org.jboss.weld.core@3.1.10.Final-redhat-00001//org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:56)
	at org.jboss.weld.core@3.1.10.Final-redhat-00001//org.jboss.weld.module.ejb.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:68)
	at org.jboss.weld.core@3.1.10.Final-redhat-00001//org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:106)
	at deployment.sisou-sac-okd.ear.sisou-sac-api.war//br.gov.caixa.bsb.sisou.core.integracao.reclameAqui.ReclameAquiIntegracaoAS$Proxy$_$$_Weld$EnterpriseProxy$.capturarOcorrencias(Unknown Source)
	at deployment.sisou-sac-okd.ear.sisou-sac-api.war//br.gov.caixa.bsb.sisou.api.ocorrencia.ReclameAquiController.lambda$capturarOcorrencia$1(ReclameAquiController.java:47)
	at deployment.sisou-sac-okd.ear.sisou-sac-api.war//br.gov.caixa.arquitetura.javaee.api.comum.web.BaseRestJsonController.buildResponse(BaseRestJsonController.java:45)
	at deployment.sisou-sac-okd.ear.sisou-sac-api.war//br.gov.caixa.bsb.sisou.api.ocorrencia.ReclameAquiController.capturarOcorrencia(ReclameAquiController.java:47)
	at deployment.sisou-sac-okd.ear.sisou-sac-api.war//br.gov.caixa.bsb.sisou.api.ocorrencia.ReclameAquiController$Proxy$_$$_WeldClientProxy.capturarOcorrencia(Unknown Source)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.jboss.resteasy.resteasy-jaxrs@3.15.8.Final-redhat-00001//org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:138)
	at org.jboss.resteasy.resteasy-jaxrs@3.15.8.Final-redhat-00001//org.jboss.resteasy.core.ResourceMethodInvoker.internalInvokeOnTarget(ResourceMethodInvoker.java:546)
	at org.jboss.resteasy.resteasy-jaxrs@3.15.8.Final-redhat-00001//org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTargetAfterFilter(ResourceMethodInvoker.java:435)
	at org.jboss.resteasy.resteasy-jaxrs@3.15.8.Final-redhat-00001//org.jboss.resteasy.core.ResourceMethodInvoker.lambda$invokeOnTarget$0(ResourceMethodInvoker.java:396)
	at org.jboss.resteasy.resteasy-jaxrs@3.15.8.Final-redhat-00001//org.jboss.resteasy.core.interception.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:358)
	at org.jboss.resteasy.resteasy-jaxrs@3.15.8.Final-redhat-00001//org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:398)
	at org.jboss.resteasy.resteasy-jaxrs@3.15.8.Final-redhat-00001//org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:365)
	at org.jboss.resteasy.resteasy-jaxrs@3.15.8.Final-redhat-00001//org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:338)
	at org.jboss.resteasy.resteasy-jaxrs@3.15.8.Final-redhat-00001//org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:440)
	at org.jboss.resteasy.resteasy-jaxrs@3.15.8.Final-redhat-00001//org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:229)
	at org.jboss.resteasy.resteasy-jaxrs@3.15.8.Final-redhat-00001//org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:135)
	at org.jboss.resteasy.resteasy-jaxrs@3.15.8.Final-redhat-00001//org.jboss.resteasy.core.interception.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:358)
	at org.jboss.resteasy.resteasy-jaxrs@3.15.8.Final-redhat-00001//org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:138)
	at org.jboss.resteasy.resteasy-jaxrs@3.15.8.Final-redhat-00001//org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:215)
	at org.jboss.resteasy.resteasy-jaxrs@3.15.8.Final-redhat-00001//org.jboss.resteasy.plugins.server.servlet.ServletContainerDispatcher.service(ServletContainerDispatcher.java:245)
	at org.jboss.resteasy.resteasy-jaxrs@3.15.8.Final-redhat-00001//org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher.service(HttpServletDispatcher.java:61)
	at org.jboss.resteasy.resteasy-jaxrs@3.15.8.Final-redhat-00001//org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher.service(HttpServletDispatcher.java:56)
	at javax.servlet.api@2.0.0.Final-redhat-00001//javax.servlet.http.HttpServlet.service(HttpServlet.java:590)
	at io.undertow.servlet@2.2.28.SP1-redhat-00001//io.undertow.servlet.handlers.ServletHandler.handleRequest(ServletHandler.java:74)
	at io.undertow.servlet@2.2.28.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:129)
	at io.undertow.websocket@2.2.28.SP1-redhat-00001//io.undertow.websockets.jsr.JsrWebSocketFilter.doFilter(JsrWebSocketFilter.java:173)
	at io.undertow.servlet@2.2.28.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:67)
	at io.undertow.servlet@2.2.28.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
	at io.undertow.servlet@2.2.28.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler.handleRequest(FilterHandler.java:84)
	at io.undertow.servlet@2.2.28.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletSecurityRoleHandler.handleRequest(ServletSecurityRoleHandler.java:62)
	at io.undertow.servlet@2.2.28.SP1-redhat-00001//io.undertow.servlet.handlers.ServletChain$1.handleRequest(ServletChain.java:68)
	at io.undertow.servlet@2.2.28.SP1-redhat-00001//io.undertow.servlet.handlers.ServletDispatchingHandler.handleRequest(ServletDispatchingHandler.java:36)
	at org.wildfly.security.elytron-web.undertow-server@1.9.3.Final-redhat-00001//org.wildfly.elytron.web.undertow.server.ElytronRunAsHandler.lambda$handleRequest$1(ElytronRunAsHandler.java:68)
	at org.wildfly.security.elytron-private@1.15.20.Final-redhat-00001//org.wildfly.security.auth.server.FlexibleIdentityAssociation.runAsFunctionEx(FlexibleIdentityAssociation.java:103)
	at org.wildfly.security.elytron-private@1.15.20.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsFunctionEx(Scoped.java:161)
	at org.wildfly.security.elytron-private@1.15.20.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAs(Scoped.java:73)
	at org.wildfly.security.elytron-web.undertow-server@1.9.3.Final-redhat-00001//org.wildfly.elytron.web.undertow.server.ElytronRunAsHandler.handleRequest(ElytronRunAsHandler.java:67)
	at io.undertow.servlet@2.2.28.SP1-redhat-00001//io.undertow.servlet.handlers.RedirectDirHandler.handleRequest(RedirectDirHandler.java:68)
	at io.undertow.servlet@2.2.28.SP1-redhat-00001//io.undertow.servlet.handlers.security.SSLInformationAssociationHandler.handleRequest(SSLInformationAssociationHandler.java:117)
	at io.undertow.servlet@2.2.28.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletAuthenticationCallHandler.handleRequest(ServletAuthenticationCallHandler.java:57)
	at io.undertow.core@2.2.28.SP1-redhat-00001//io.undertow.server.handlers.DisableCacheHandler.handleRequest(DisableCacheHandler.java:33)
	at io.undertow.core@2.2.28.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at io.undertow.core@2.2.28.SP1-redhat-00001//io.undertow.security.handlers.AuthenticationConstraintHandler.handleRequest(AuthenticationConstraintHandler.java:53)
	at io.undertow.core@2.2.28.SP1-redhat-00001//io.undertow.security.handlers.AbstractConfidentialityHandler.handleRequest(AbstractConfidentialityHandler.java:46)
	at io.undertow.servlet@2.2.28.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletConfidentialityConstraintHandler.handleRequest(ServletConfidentialityConstraintHandler.java:64)
	at io.undertow.servlet@2.2.28.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletSecurityConstraintHandler.handleRequest(ServletSecurityConstraintHandler.java:60)
	at io.undertow.core@2.2.28.SP1-redhat-00001//io.undertow.security.handlers.AbstractSecurityContextAssociationHandler.handleRequest(AbstractSecurityContextAssociationHandler.java:43)
	at org.wildfly.security.elytron-web.undertow-server-servlet@1.9.3.Final-redhat-00001//org.wildfly.elytron.web.undertow.server.servlet.CleanUpHandler.handleRequest(CleanUpHandler.java:38)
	at io.undertow.core@2.2.28.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at org.wildfly.extension.undertow@7.4.14.GA-redhat-00002//org.wildfly.extension.undertow.security.jacc.JACCContextIdHandler.handleRequest(JACCContextIdHandler.java:61)
	at io.undertow.core@2.2.28.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at org.wildfly.extension.undertow@7.4.14.GA-redhat-00002//org.wildfly.extension.undertow.deployment.GlobalRequestControllerHandler.handleRequest(GlobalRequestControllerHandler.java:68)
	at org.keycloak.keycloak-wildfly-elytron-oidc-adapter@9.0.3.redhat-00002//org.keycloak.adapters.elytron.KeycloakServletExtension.lambda$null$0(KeycloakServletExtension.java:39)
	at io.undertow.servlet@2.2.28.SP1-redhat-00001//io.undertow.servlet.handlers.SendErrorPageHandler.handleRequest(SendErrorPageHandler.java:52)
	at io.undertow.core@2.2.28.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at io.undertow.servlet@2.2.28.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.handleFirstRequest(ServletInitialHandler.java:275)
	at io.undertow.servlet@2.2.28.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.access$100(ServletInitialHandler.java:79)
	at io.undertow.servlet@2.2.28.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:134)
	at io.undertow.servlet@2.2.28.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:131)
	at io.undertow.servlet@2.2.28.SP1-redhat-00001//io.undertow.servlet.core.ServletRequestContextThreadSetupAction$1.call(ServletRequestContextThreadSetupAction.java:48)
	at io.undertow.servlet@2.2.28.SP1-redhat-00001//io.undertow.servlet.core.ContextClassLoaderSetupAction$1.call(ContextClassLoaderSetupAction.java:43)
	at org.wildfly.extension.undertow@7.4.14.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
	at org.wildfly.extension.undertow@7.4.14.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
	at org.wildfly.extension.undertow@7.4.14.GA-
