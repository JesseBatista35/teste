2026-10-29 01:56:45,536 ERROR [org.jboss.modcluster] (UndertowEventHandlerAdapterService - 1) MODCLUSTER000040: Failed to parse response header from localhost/127.0.0.1:6666 for INFO command: java.lang.NumberFormatException: For input string: "/"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:569)
	at java.lang.Integer.parseInt(Integer.java:615)
	at org.jboss.modcluster.mcmp.impl.DefaultMCMPHandler.sendRequest(DefaultMCMPHandler.java:585)
	at org.jboss.modcluster.mcmp.impl.DefaultMCMPHandler.status(DefaultMCMPHandler.java:336)
	at org.jboss.modcluster.mcmp.impl.DefaultMCMPHandler.status(DefaultMCMPHandler.java:315)
	at org.jboss.modcluster.ModClusterService.status(ModClusterService.java:414)
	at org.wildfly.mod_cluster.undertow.UndertowEventHandlerAdapterService.run(UndertowEventHandlerAdapterService.java:182)
	at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
	at java.util.concurrent.FutureTask.runAndReset(FutureTask.java:308)
	at java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.access$301(ScheduledThreadPoolExecutor.java:180)
	at java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:294)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at org.jboss.as.clustering.context.ContextReferenceExecutor.execute(ContextReferenceExecutor.java:49)
	at org.jboss.as.clustering.context.ContextualExecutor$1.run(ContextualExecutor.java:70)
	at java.lang.Thread.run(Thread.java:750)
	at org.jboss.threads.JBossThread.run(JBossThread.java:513)

2026-10-29 01:56:45,557 ERROR [org.jboss.modcluster] (UndertowEventHandlerAdapterService - 1) MODCLUSTER000042: Error null sending INFO command to localhost/127.0.0.1:6666, configuration will be reset: null
2026-10-29 09:58:24,550 INFO  [org.jboss.as.server] (Thread-4) WFLYSRV0272: Servidor suspenso
2026-10-29 09:58:24,585 INFO  [org.jboss.as.ejb3] (Thread-4) WFLYEJB0493: Suspensão completa do subsistema de Jakarta Enterprise Beans
2026-10-29 09:58:24,603 INFO  [org.jboss.as.server] (Thread-4) WFLYSRV0220: Foi solicitado o desligamento do servidor através de um sinal de OS
2026-10-29 09:58:24,708 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-3) WFLYJCA0019: Serviço de driver interrompido com nome-do-driver = ojdbc8.jar
2026-10-29 09:58:24,773 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-4) WFLYJCA0010: Fonte de dados sem limite [java:jboss/datasources/SIGSJ04]
2026-10-29 09:58:24,784 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-3) WFLYMAIL0002: Sessão de e-mail não associada [java:jboss/mail/Default]
2026-10-29 09:58:24,786 INFO  [org.wildfly.extension.messaging-activemq] (MSC service thread 1-2) WFLYMSGAMQ0006: Objeto de mensagem não vinculado ao nome jndi java:jboss/exported/jms/RemoteConnectionFactory
2026-10-29 09:58:24,810 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 111) WFLYUT0022: Contexto web não registrado:'/sigsjintrastatic' do servidor 'default-server' 
2026-10-29 09:58:24,812 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 112) WFLYUT0022: Contexto web não registrado:'/sigsj_intranet' do servidor 'default-server' 
2026-10-29 09:58:24,840 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-3) WFLYJCA0019: Serviço de driver interrompido com nome-do-driver = oracle
2026-10-29 09:58:24,940 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0019: Interrompendo host default-host
2026-10-29 09:58:24,955 INFO  [org.jboss.modcluster] (ServerService Thread Pool -- 122) MODCLUSTER000002: Initiating mod_cluster shutdown
2026-10-29 09:58:24,984 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-3) WFLYJCA0119: Desfazendo o vínculo da criação de conexão chamada java:/JmsXA para o alias java:jboss/DefaultJMSConnectionFactory
2026-10-29 09:58:24,985 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-3) WFLYJCA0010: Fonte de dados sem limite [java:jboss/datasources/ExampleDS]
2026-10-29 09:58:25,021 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-3) WFLYJCA0011: Sem limite de conectores de Jakarta ConnectionFactory [java:/JmsXA]
2026-10-29 09:58:25,025 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-2) WFLYJCA0019: Serviço de driver interrompido com nome-do-driver = h2
2026-10-29 09:58:25,149 INFO  [org.apache.activemq.artemis.ra] (ServerService Thread Pool -- 122) AMQ151003: resource adaptor stopped
2026-10-29 09:58:25,173 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0208: Interrompendo a subimplantação (runtime-name: sirotcon-ejb-2.3.0.1-farm.jar) em 547ms
2026-10-29 09:58:25,177 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0208: Interrompendo a subimplantação (runtime-name: sigsjintrastatic.war) em 554ms
2026-10-29 09:58:25,257 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 143) WFLYCLINF0003: Cache http-remoting-connector encerrado a partir do recipiente ejb
2026-10-29 09:58:25,261 INFO  [org.infinispan.manager.DefaultCacheManager] (ServerService Thread Pool -- 143) Stopping cache manager null on null
2026-10-29 09:58:25,346 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0028: Implantação interrompida ojdbc8.jar (runtime-name: ojdbc8.jar) em 726ms
2026-10-29 09:58:25,347 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0208: Interrompendo a subimplantação (runtime-name: sigsj_intranet.war) em 722ms
2026-10-29 09:58:25,350 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0028: Implantação interrompida sigsj_intranet-ear.ear (runtime-name: sigsj_intranet-ear.ear) em 725ms
2026-10-29 09:58:25,356 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0008: Undertow HTTPS ouvinte https está suspendendo
2026-10-29 09:58:25,356 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0008: Undertow AJP ouvinte ajp está suspendendo
2026-10-29 09:58:25,357 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0007: Undertow AJP ouvinte ajp interrompido, estava vinculado a 0.0.0.0:8009
2026-10-29 09:58:25,357 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0007: Undertow HTTPS ouvinte https interrompido, estava vinculado a 0.0.0.0:8443
2026-10-29 09:58:25,434 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 122) AMQ221002: Apache ActiveMQ Artemis Message Broker version 2.16.0.redhat-00052 [8c98d7d4-094e-11ee-abda-00505682f3d2] stopped, uptime 17 hours 1 minute
2026-10-29 09:58:25,434 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0008: Undertow HTTP ouvinte default está suspendendo
2026-10-29 09:58:25,435 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0007: Undertow HTTP ouvinte default interrompido, estava vinculado a 0.0.0.0:8080
2026-10-29 09:58:25,436 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0004: Interrompendo Undertow 2.2.33.SP1-redhat-00001
2026-10-29 09:58:25,448 INFO  [org.jboss.as] (MSC service thread 1-4) WFLYSRV0050: JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001) interrompido em 824ms
2026-10-29 09:58:28,767 INFO  [org.jboss.modules] (main) JBoss Modules version 1.12.3.Final-redhat-00001
2026-10-29 09:58:29,555 INFO  [org.jboss.msc] (main) JBoss MSC version 1.4.13.Final-redhat-00001
2026-10-29 09:58:29,562 INFO  [org.jboss.threads] (main) JBoss Threads version 2.4.0.Final-redhat-00001
2026-10-29 09:58:29,665 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0049: Inicializando JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001)
2026-10-29 09:58:29,668 DEBUG [org.jboss.as.config] (MSC service thread 1-2) Propriedades de sistema configurado:
	[Standalone] = 
	awt.toolkit = sun.awt.X11.XToolkit
	file.encoding = UTF-8
	file.encoding.pkg = sun.io
	file.separator = /
	java.awt.graphicsenv = sun.awt.X11GraphicsEnvironment
	java.awt.headless = true
	java.awt.printerjob = sun.print.PSPrinterJob
	java.class.path = /opt/jboss-eap/jboss-modules.jar:/opt/jmx_exporter/jmx_prometheus.jar
	java.class.version = 52.0
	java.endorsed.dirs = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/endorsed
	java.ext.dirs = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/ext:/usr/java/packages/lib/ext
	java.home = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre
	java.io.tmpdir = /tmp
	java.library.path = /usr/java/packages/lib/amd64:/usr/lib64:/lib64:/lib:/usr/lib
	java.net.preferIPv4Stack = true
	java.runtime.name = OpenJDK Runtime Environment
	java.runtime.version = 1.8.0_472-b08
	java.specification.maintenance.version = 6
	java.specification.name = Java Platform API Specification
	java.specification.vendor = Oracle Corporation
	java.specification.version = 1.8
	java.util.logging.manager = org.jboss.logmanager.LogManager
	java.vendor = Red Hat, Inc.
	java.vendor.url = https://www.redhat.com/
	java.vendor.url.bug = https://access.redhat.com/support/cases/
	java.version = 1.8.0_472
	java.vm.info = mixed mode
	java.vm.name = OpenJDK 64-Bit Server VM
	java.vm.specification.name = Java Virtual Machine Specification
	java.vm.specification.vendor = Oracle Corporation
	java.vm.specification.version = 1.8
	java.vm.vendor = Red Hat, Inc.
	java.vm.version = 25.472-b08
	javax.management.builder.initial = org.jboss.as.jmx.PluggableMBeanServerBuilder
	javax.net.ssl.trustStore = /opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks
	javax.net.ssl.trustStorePassword = <redacted>
	jboss.bind.address = 0.0.0.0
	jboss.bind.address.management = 0.0.0.0
	jboss.home.dir = /opt/jboss-eap
	jboss.host.name = caddeapllx955
	jboss.modules.dir = /opt/jboss-eap/modules
	jboss.modules.policy-permissions = true
	jboss.modules.system.pkgs = org.jboss.byteman,org.jboss.logmanager
	jboss.node.name = caddeapllx955
	jboss.qualified.host.name = caddeapllx955.agil.nprd.caixa.gov.br
	jboss.server.base.dir = /opt/jboss-eap/standalone
	jboss.server.config.dir = /opt/jboss-eap/standalone/configuration
	jboss.server.data.dir = /opt/jboss-eap/standalone/data
	jboss.server.deploy.dir = /opt/jboss-eap/standalone/data/content
	jboss.server.log.dir = /logs/jboss/jboss-eap/standalone/sigsj-intranet
	jboss.server.name = caddeapllx955
	jboss.server.persist.config = true
	jboss.server.temp.dir = /opt/jboss-eap/standalone/tmp
	jdk.serialFilter = maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000
	line.separator = 

	logging.configuration = file:/opt/jboss-eap/standalone/configuration/logging.properties
	module.path = /opt/jboss-eap/modules
	org.jboss.boot.log.file = /logs/jboss/jboss-eap/standalone/sigsj-intranet/server.log
	org.jboss.resolver.warning = true
	os.arch = amd64
	os.name = Linux
	os.version = 5.14.0-362.8.1.el9_3.x86_64
	path.separator = :
	sun.arch.data.model = 64
	sun.boot.class.path = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/resources.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/rt.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/sunrsasign.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/jsse.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/jce.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/charsets.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/jfr.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/classes:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar
	sun.boot.library.path = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/amd64
	sun.cpu.endian = little
	sun.cpu.isalist = 
	sun.io.unicode.encoding = UnicodeLittle
	sun.java.command = /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sigsj-intranet -c standalone-full-ha.xml
	sun.java.launcher = SUN_STANDARD
	sun.jnu.encoding = UTF-8
	sun.management.compiler = HotSpot 64-Bit Tiered Compilers
	sun.os.patch.level = unknown
	sun.util.logging.disableCallerCheck = true
	user.country = BR
	user.dir = /
	user.home = /home/jboss
	user.language = pt
	user.name = jboss
	user.timezone = America/Sao_Paulo
2026-10-29 09:58:29,668 DEBUG [org.jboss.as.config] (MSC service thread 1-2) Argumentos da VM: -D[Standalone] -verbose:gc -Xloggc:/logs/jboss/jboss-eap/standalone/sigsj-intranet/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -Xms1024m -Xmx2048m -XX:MetaspaceSize=256m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/sigsj-intranet/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties 
2026-10-29 09:58:30,333 INFO  [org.wildfly.security] (ServerService Thread Pool -- 29) ELY00001: WildFly Elytron version 1.15.23.Final-redhat-00001
2026-10-29 09:58:30,695 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 7) WFLYCTL0033: A extensão 'security' é obsoleta e talvez não seja suportada em versões futuras
2026-10-29 09:58:31,424 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Criando serviço de gerenciamento http usando o socket-binding (management-http)
2026-10-29 09:58:31,435 INFO  [org.xnio] (MSC service thread 1-1) XNIO version 3.8.16.Final-redhat-00001
2026-10-29 09:58:31,446 INFO  [org.xnio.nio] (MSC service thread 1-1) XNIO NIO Implementation Version 3.8.16.Final-redhat-00001
2026-10-29 09:58:31,480 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 43) WFLYJCA0004: Implantação do driver compatível-JDBC class org.h2.Driver (versão 1.4)
2026-10-29 09:58:31,516 INFO  [org.wildfly.extension.health] (ServerService Thread Pool -- 49) WFLYHEALTH0001: Ativando o Subsistema Básico de integridade
2026-10-29 09:58:31,546 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 51) WFLYCLINF0001: Ativação do subsistema Infinispan.
2026-10-29 09:58:31,556 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 52) WFLYIO001: O operador 'default' configurou automaticamente para as threads de E/S 4 com o máximo de 32 threads de tarefas com base em seus 2 processadores disponíveis.
2026-10-29 09:58:31,557 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-4) WFLYELY00023: O arquivo '/opt/jboss-eap/standalone/configuration/application.keystore' da KeyStore não existe. Usado em branco.
2026-10-29 09:58:31,559 INFO  [org.wildfly.iiop.openjdk] (ServerService Thread Pool -- 50) WFLYIIOP0001: Ativação de subsistema IIOP 
2026-10-29 09:58:31,575 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-4) WFLYELY01084: KeyStore /opt/jboss-eap/standalone/configuration/application.keystore não encontrado; ele será gerado automaticamente na primeira utilização com um certificado autoassinado para o host localhost
2026-10-29 09:58:31,587 INFO  [org.jboss.as.connector] (MSC service thread 1-3) WFLYJCA0009: Inicialização do Subsistema Jakarta Connectors (WildFly/IronJacamar 1.5.17.Final-redhat-00001)
2026-10-29 09:58:31,627 INFO  [org.jboss.as.ejb3] (MSC service thread 1-3) WFLYEJB0482: O pool estrito mdb-strict-max-pool está utilizando um tamanho de instância máximo de 8 (por classe) que é derivado do número de CPUs neste host. 
2026-10-29 09:58:31,629 INFO  [org.jboss.as.ejb3] (MSC service thread 1-1) WFLYEJB0481: O pool estrito slsb-strict-max-pool está utilizando um tamanho de instância máximo de 32 (por classe) que é derivado do tamanho de pool do thead de trabalho. 
2026-10-29 09:58:31,634 INFO  [org.jboss.as.jsf] (ServerService Thread Pool -- 58) WFLYJSF0007: Ativadas as seguintes implantações do Jakarta Server Faces: [main]
2026-10-29 09:58:31,682 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 53) WFLYRS0016: RESTEasy versão 3.15.9.Final-redhat-00001
2026-10-29 09:58:31,693 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-4) WFLYJCA0018: Serviço de driver iniciado com nome-do-driver = h2
2026-10-29 09:58:31,694 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 72) WFLYTX0013: O atributo node-identifier em /subsystem=transactions está definido com o valor padrão. Isso é perigoso para ambientes executando vários servidores. Certifique-se de que o valor do atributo é exclusivo.
2026-10-29 09:58:31,705 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 64) WFLYNAM0001: Ativação do Subsistema de Nomeação
2026-10-29 09:58:31,711 INFO  [org.jboss.remoting] (MSC service thread 1-1) JBoss Remoting version 5.0.29.Final-redhat-00001
2026-10-29 09:58:31,727 INFO  [org.jboss.as.webservices] (ServerService Thread Pool -- 74) WFLYWS0002: Ativação da Extensão WebServices
2026-10-29 09:58:31,737 WARN  [org.wildfly.clustering.web.undertow] (ServerService Thread Pool -- 73) WFLYCLWEBUT0007: Nenhum provedor de roteamento encontrado para default-server; usando o provedor herdado baseado na configuração estática
2026-10-29 09:58:31,746 INFO  [org.wildfly.extension.metrics] (ServerService Thread Pool -- 62) WFLYMETRICS0001: Ativando o subsistema de métricas de base
2026-10-29 09:58:31,756 INFO  [org.jboss.as.security] (ServerService Thread Pool -- 70) WFLYSEC0002: Ativação do Subsistema de Segurança
2026-10-29 09:58:31,831 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 73) WFLYUT0014: Criando identificador de arquivo para caminho de acesso '/opt/jboss-eap/welcome-content' com as opções [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
2026-10-29 09:58:31,878 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0003: Iniciando Undertow 2.2.33.SP1-redhat-00001
2026-10-29 09:58:31,939 INFO  [org.jboss.as.security] (MSC service thread 1-2) WFLYSEC0001: Versão =5.0.3.Final-redhat-00009 PicketBox atual
2026-10-29 09:58:31,950 INFO  [org.jboss.as.naming] (MSC service thread 1-1) WFLYNAM0003: Iniciando o Serviço de Nomeação
2026-10-29 09:58:31,984 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-3) WFLYMAIL0001: Sessão de e-mail associada [java:jboss/mail/Default]
2026-10-29 09:58:32,029 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0012: Servidor default-server foi iniciado. 
2026-10-29 09:58:32,095 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) Queuing requests.
2026-10-29 09:58:32,096 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0018: Iniciando host default-host
2026-10-29 09:58:32,113 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0006: UndertowHTTPS ouvinte https escutando em 0.0.0.0:8443
2026-10-29 09:58:32,115 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0006: UndertowAJP ouvinte ajp escutando em 0.0.0.0:8009
2026-10-29 09:58:32,118 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0006: UndertowHTTP ouvinte default escutando em 0.0.0.0:8080
2026-10-29 09:58:32,119 INFO  [org.wildfly.iiop.openjdk] (MSC service thread 1-4) WFLYIIOP0009: Serviço CORBA ORB iniciado
2026-10-29 09:58:32,129 INFO  [org.jboss.modcluster] (ServerService Thread Pool -- 76) MODCLUSTER000001: Initializing mod_cluster version 1.4.5.Final-redhat-00001
2026-10-29 09:58:32,147 INFO  [org.jboss.modcluster] (ServerService Thread Pool -- 76) MODCLUSTER000032: Listening to proxy advertisements on /224.0.1.105:23364
2026-10-29 09:58:32,199 INFO  [org.jboss.as.ejb3] (MSC service thread 1-3) WFLYEJB0493: Suspensão completa do subsistema de Jakarta Enterprise Beans
2026-10-29 09:58:32,265 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-1) WFLYJCA0001: Fonte de dados vinculada[java:jboss/datasources/ExampleDS]
2026-10-29 09:58:32,375 INFO  [org.jboss.as.patching] (MSC service thread 1-2) WFLYPAT0050: A ID de patch cumulativo de JBoss EAP é jboss-eap-7.4.18.CP, os patches únicos incluem: none
2026-10-29 09:58:32,410 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0027: Iniciando a implantação do "ojdbc8.jar" (runtime-name: "ojdbc8.jar")
2026-10-29 09:58:32,415 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0027: Iniciando a implantação do "sigsj_intranet-ear.ear" (runtime-name: "sigsj_intranet-ear.ear")
2026-10-29 09:58:32,416 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-1) WFLYDS0013: Foi iniciado FileSystemDeploymentService para o diretório /opt/jboss-eap/standalone/deployments
2026-10-29 09:58:32,485 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 76) AMQ221000: live Message Broker is starting with configuration Broker Configuration (clustered=false,journalDirectory=/opt/jboss-eap/standalone/data/activemq/journal,bindingsDirectory=/opt/jboss-eap/standalone/data/activemq/bindings,largeMessagesDirectory=/opt/jboss-eap/standalone/data/activemq/largemessages,pagingDirectory=/opt/jboss-eap/standalone/data/activemq/paging)
2026-10-29 09:58:32,561 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 76) AMQ221012: Using AIO Journal
2026-10-29 09:58:32,648 INFO  [org.jboss.ws.common.management] (MSC service thread 1-3) JBWS022052: Starting JBossWS 5.4.9.Final-redhat-00001 (Apache CXF 3.5.8.redhat-00001) 
2026-10-29 09:58:32,779 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 76) AMQ221043: Protocol module found: [artemis-server]. Adding protocol support for: CORE
2026-10-29 09:58:32,779 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 76) AMQ221043: Protocol module found: [artemis-hornetq-protocol]. Adding protocol support for: HORNETQ
2026-10-29 09:58:32,840 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 76) AMQ221034: Waiting indefinitely to obtain live lock
2026-10-29 09:58:32,840 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 76) AMQ221035: Live Server Obtained live lock
2026-10-29 09:58:33,166 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 76) AMQ221003: Deploying ANYCAST queue jms.queue.ExpiryQueue on address jms.queue.ExpiryQueue
2026-10-29 09:58:33,170 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 76) AMQ221003: Deploying ANYCAST queue jms.queue.DLQ on address jms.queue.DLQ
2026-10-29 09:58:33,192 INFO  [org.wildfly.extension.messaging-activemq] (MSC service thread 1-4) WFLYMSGAMQ0016: Atualização HTTP registrada para protocolo activemq-remoting manipulado pelo aceitador http-acceptor-throughput
2026-10-29 09:58:33,192 INFO  [org.wildfly.extension.messaging-activemq] (MSC service thread 1-4) WFLYMSGAMQ0016: Atualização HTTP registrada para protocolo activemq-remoting manipulado pelo aceitador http-acceptor
2026-10-29 09:58:33,192 INFO  [org.wildfly.extension.messaging-activemq] (MSC service thread 1-4) WFLYMSGAMQ0016: Atualização HTTP registrada para protocolo activemq-remoting manipulado pelo aceitador http-acceptor
2026-10-29 09:58:33,192 INFO  [org.wildfly.extension.messaging-activemq] (MSC service thread 1-3) WFLYMSGAMQ0016: Atualização HTTP registrada para protocolo activemq-remoting manipulado pelo aceitador http-acceptor-throughput
2026-10-29 09:58:33,504 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 76) AMQ221007: Server is now live
2026-10-29 09:58:33,504 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 76) AMQ221001: Apache ActiveMQ Artemis Message Broker version 2.16.0.redhat-00052 [default, nodeID=8c98d7d4-094e-11ee-abda-00505682f3d2] 
2026-10-29 09:58:33,545 INFO  [org.wildfly.extension.messaging-activemq] (ServerService Thread Pool -- 76) WFLYMSGAMQ0002: Objeto de mensagem vinculado ao nome jndi java:/ConnectionFactory
2026-10-29 09:58:33,559 WARN  [org.apache.activemq.artemis.jms.server] (ServerService Thread Pool -- 78) AMQ122005: Invalid "host" value "0.0.0.0" detected for "http-connector" connector. Switching to "caddeapllx955.agil.nprd.caixa.gov.br". If this new address is incorrect please manually configure the connector to use the proper one.
2026-10-29 09:58:33,559 INFO  [org.wildfly.extension.messaging-activemq] (ServerService Thread Pool -- 78) WFLYMSGAMQ0002: Objeto de mensagem vinculado ao nome jndi java:jboss/exported/jms/RemoteConnectionFactory
2026-10-29 09:58:33,606 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-4) WFLYJCA0007: Criação de conexão registrada java:/JmsXA
2026-10-29 09:58:33,660 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0059: A entrada do caminho da classe oraclepki.jar em /content/ojdbc8.jar não direciona a um jar válido para a referência do caminho da classe.
2026-10-29 09:58:33,743 INFO  [org.apache.activemq.artemis.ra] (MSC service thread 1-4) AMQ151007: Resource adaptor started
2026-10-29 09:58:33,744 INFO  [org.jboss.as.connector.services.resourceadapters.ResourceAdapterActivatorService$ResourceAdapterActivator] (MSC service thread 1-4) IJ020002: Deployed: file://RaActivatoractivemq-ra
2026-10-29 09:58:33,744 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-4) WFLYJCA0002: Conectores de Jakarta vinculados ConnectionFactory [java:/JmsXA]
2026-10-29 09:58:33,745 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-4) WFLYJCA0118: Vínculo de criação de conexão chamado java:/JmsXA para o alias java:jboss/DefaultJMSConnectionFactory
2026-10-29 09:58:34,104 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0207: Iniciando a subimplantação (runtime-name: "sigsj_intranet.war")
2026-10-29 09:58:34,109 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0207: Iniciando a subimplantação (runtime-name: "sigsjintrastatic.war")
2026-10-29 09:58:34,109 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0207: Iniciando a subimplantação (runtime-name: "sirotcon-ejb-2.3.0.1-farm.jar")
2026-10-29 09:58:34,126 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0001: /content/sigsj_intranet-ear.ear/sirotcon-ejb-2.3.0.1-farm.jar/META-INF/jboss-deployment-structure.xml na subimplantação ignorado. O jboss-deployment-structure.xml só é analisado para implantações de nível superior.
2026-10-29 09:58:34,341 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-2) WFLYJCA0004: Implantação do driver compatível-JDBC class oracle.jdbc.OracleDriver (versão 23.26)
2026-10-29 09:58:34,358 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-2) WFLYJCA0018: Serviço de driver iniciado com nome-do-driver = ojdbc8.jar
2026-10-29 09:58:34,364 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-1) WFLYJCA0001: Fonte de dados vinculada[java:jboss/datasources/SIGSJ04]
2026-10-29 09:58:34,642 INFO  [org.infinispan.CONTAINER] (ServerService Thread Pool -- 79) ISPN000128: Infinispan version: Infinispan 'Corona Extra' 11.0.19.Final-redhat-00001
2026-10-29 09:58:34,697 INFO  [org.infinispan.CONFIG] (MSC service thread 1-1) ISPN000152: Passivation configured without an eviction policy being selected. Only manually evicted entities will be passivated.
2026-10-29 09:58:34,698 INFO  [org.infinispan.CONFIG] (MSC service thread 1-1) ISPN000152: Passivation configured without an eviction policy being selected. Only manually evicted entities will be passivated.
2026-10-29 09:58:34,810 INFO  [org.infinispan.PERSISTENCE] (ServerService Thread Pool -- 79) ISPN000556: Starting user marshaller 'org.wildfly.clustering.infinispan.spi.marshalling.InfinispanProtoStreamMarshaller'
2026-10-29 09:58:35,103 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 79) WFLYCLINF0002: Cache http-remoting-connector inicializado a partir do recipiente ejb
2026-10-29 09:58:36,840 INFO  [org.jboss.weld.deployer] (MSC service thread 1-4) WFLYWELD0003: Processando da implantação weld sigsj_intranet-ear.ear
2026-10-29 09:58:36,940 INFO  [org.hibernate.validator.internal.util.Version] (MSC service thread 1-4) HV000001: Hibernate Validator 6.0.23.Final-redhat-00001
2026-10-29 09:58:37,044 INFO  [org.jboss.weld.deployer] (MSC service thread 1-4) WFLYWELD0003: Processando da implantação weld sigsjintrastatic.war
2026-10-29 09:58:37,076 INFO  [org.jboss.weld.deployer] (MSC service thread 1-3) WFLYWELD0003: Processando da implantação weld sirotcon-ejb-2.3.0.1-farm.jar
2026-10-29 09:58:37,087 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SIROTConBean' na unidade de implementação 'subdeployment "sirotcon-ejb-2.3.0.1-farm.jar" of deployment "sigsj_intranet-ear.ear"' são como segue:

	java:global/sigsj_intranet-ear/sirotcon-ejb-2.3.0.1-farm/SIROTConBean!br.gov.caixa.sirot.ejb.SIROTCon
	java:app/sirotcon-ejb-2.3.0.1-farm/SIROTConBean!br.gov.caixa.sirot.ejb.SIROTCon
	java:module/SIROTConBean!br.gov.caixa.sirot.ejb.SIROTCon
	java:jboss/exported/sigsj_intranet-ear/sirotcon-ejb-2.3.0.1-farm/SIROTConBean!br.gov.caixa.sirot.ejb.SIROTCon
	ejb:sigsj_intranet-ear/sirotcon-ejb-2.3.0.1-farm/SIROTConBean!br.gov.caixa.sirot.ejb.SIROTCon
	java:global/sigsj_intranet-ear/sirotcon-ejb-2.3.0.1-farm/SIROTConBean
	java:app/sirotcon-ejb-2.3.0.1-farm/SIROTConBean
	java:module/SIROTConBean

2026-10-29 09:58:37,088 ERROR [org.jboss.msc.service.fail] (MSC service thread 1-3) MSC000001: Failed to start service jboss.deployment.subunit."sigsj_intranet-ear.ear"."sirotcon-ejb-2.3.0.1-farm.jar".POST_MODULE: org.jboss.msc.service.StartException in service jboss.deployment.subunit."sigsj_intranet-ear.ear"."sirotcon-ejb-2.3.0.1-farm.jar".POST_MODULE: WFLYSRV0153: Falha ao processar a fase POST_MODULE de subdeployment "sirotcon-ejb-2.3.0.1-farm.jar" of deployment "sigsj_intranet-ear.ear"
	at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:189)
	at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1739)
	at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1701)
	at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1559)
	at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
	at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
	at java.lang.Thread.run(Thread.java:750)
Caused by: java.lang.NumberFormatException: For input string: "${CONNECTOR-FARM-PORT}"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:569)
	at java.lang.Integer.valueOf(Integer.java:766)
	at org.jboss.as.ee.component.deployers.ResourceReferenceProcessor.getEnvironmentEntries(ResourceReferenceProcessor.java:278)
	at org.jboss.as.ee.component.deployers.ResourceReferenceProcessor.processDescriptorEntries(ResourceReferenceProcessor.java:72)
	at org.jboss.as.ee.component.deployers.AbstractDeploymentDescriptorBindingsProcessor.deploy(AbstractDeploymentDescriptorBindingsProcessor.java:100)
	at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:182)
	... 8 more

2026-10-29 09:58:37,400 INFO  [org.jboss.weld.deployer] (MSC service thread 1-1) WFLYWELD0003: Processando da implantação weld sigsj_intranet.war
2026-10-29 09:58:37,563 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("deploy") - endereço ([("deployment" => "sigsj_intranet-ear.ear")]) - falha na descrição: {
    "WFLYCTL0080: Falha de serviços" => {"jboss.deployment.subunit.\"sigsj_intranet-ear.ear\".\"sirotcon-ejb-2.3.0.1-farm.jar\".POST_MODULE" => "WFLYSRV0153: Falha ao processar a fase POST_MODULE de subdeployment \"sirotcon-ejb-2.3.0.1-farm.jar\" of deployment \"sigsj_intranet-ear.ear\"
    Caused by: java.lang.NumberFormatException: For input string: \"${CONNECTOR-FARM-PORT}\""},
    "WFLYCTL0412: Serviços necessários que não estão instalados:" => [
        "jboss.deployment.unit.\"sigsj_intranet-ear.ear\".WeldStartService",
        "jboss.deployment.subunit.\"sigsj_intranet-ear.ear\".\"sigsjintrastatic.war\".beanmanager",
        "jboss.deployment.subunit.\"sigsj_intranet-ear.ear\".\"sigsj_intranet.war\".beanmanager",
        "jboss.deployment.unit.\"sigsj_intranet-ear.ear\".beanmanager"
    ],
    "WFLYCTL0180: Os serviços com falta/indisponibilidade de dependências " => [
        "jboss.deployment.unit.\"sigsj_intranet-ear.ear\".weld.weldClassIntrospector faltam [jboss.deployment.unit.\"sigsj_intranet-ear.ear\".beanmanager, jboss.deployment.unit.\"sigsj_intranet-ear.ear\".WeldStartService]",
        "jboss.deployment.subunit.\"sigsj_intranet-ear.ear\".\"sigsj_intranet.war\".batch.artifact.factory faltam [jboss.deployment.subunit.\"sigsj_intranet-ear.ear\".\"sigsj_intranet.war\".beanmanager]",
        "jboss.deployment.subunit.\"sigsj_intranet-ear.ear\".\"sigsjintrastatic.war\".batch.artifact.factory faltam [jboss.deployment.subunit.\"sigsj_intranet-ear.ear\".\"sigsjintrastatic.war\".beanmanager]"
    ]
}
2026-10-29 09:58:37,652 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 44) WFLYSRV0010: "sigsj_intranet-ear.ear" foi implantado (runtime-name: "sigsj_intranet-ear.ear")
2026-10-29 09:58:37,652 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 44) WFLYSRV0010: "ojdbc8.jar" foi implantado (runtime-name: "ojdbc8.jar")
2026-10-29 09:58:37,653 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0183: Relatório
 de status de serviçoWFLYCTL0184: Não falta/insatisfaz nenhuma das dependências:
service jboss.deployment.subunit."sigsj_intranet-ear.ear"."sigsj_intranet.war".beanmanager (faltam) dependentes: [service jboss.deployment.subunit."sigsj_intranet-ear.ear"."sigsj_intranet.war".batch.artifact.factory] 
service jboss.deployment.subunit."sigsj_intranet-ear.ear"."sigsjintrastatic.war".beanmanager (faltam) dependentes: [service jboss.deployment.subunit."sigsj_intranet-ear.ear"."sigsjintrastatic.war".batch.artifact.factory] 
service jboss.deployment.unit."sigsj_intranet-ear.ear".WeldStartService (faltam) dependentes: [service jboss.deployment.unit."sigsj_intranet-ear.ear".weld.weldClassIntrospector] 
service jboss.deployment.unit."sigsj_intranet-ear.ear".beanmanager (faltam) dependentes: [service jboss.deployment.unit."sigsj_intranet-ear.ear".weld.weldClassIntrospector] 
WFLYCTL0186: Serviços que falham na inicialização:      service jboss.deployment.subunit."sigsj_intranet-ear.ear"."sirotcon-ejb-2.3.0.1-farm.jar".POST_MODULE: WFLYSRV0153: Falha ao processar a fase POST_MODULE de subdeployment "sirotcon-ejb-2.3.0.1-farm.jar" of deployment "sigsj_intranet-ear.ear"
WFLYCTL0448: 5 serviços adicionais estão inativos devido a ausência ou falha das suas dependências
2026-10-29 09:58:37,688 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Retomando servidor 
2026-10-29 09:58:37,691 ERROR [org.jboss.as] (Controller Boot Thread) WFLYSRV0026: JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001) iniciado (com erros) em 9667ms - Iniciado(s) 539 de serviços 754 (11 serviços falharam ou tinham dependências ausentes, os serviços 369 estão lentos, passivos ou sob demanda)
2026-10-29 09:58:37,692 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0060: A interface de gerenciamento http escutando em http://0.0.0.0:9990/management
2026-10-29 09:58:37,693 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0051: O console de administração escutando em http://0.0.0.0:9990
2026-10-29 09:58:42,160 ERROR [org.jboss.modcluster] (UndertowEventHandlerAdapterService - 1) MODCLUSTER000043: Failed to send INFO command to localhost/127.0.0.1:6666: Conexão recusada (Connection refused)
2026-10-29 10:04:11,401 INFO  [org.jboss.as.server] (Thread-4) WFLYSRV0272: Servidor suspenso
2026-10-29 10:04:11,403 INFO  [org.jboss.as.ejb3] (Thread-4) WFLYEJB0493: Suspensão completa do subsistema de Jakarta Enterprise Beans
2026-10-29 10:04:11,405 INFO  [org.jboss.as.server] (Thread-4) WFLYSRV0220: Foi solicitado o desligamento do servidor através de um sinal de OS
2026-10-29 10:04:11,427 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-4) WFLYJCA0010: Fonte de dados sem limite [java:jboss/datasources/SIGSJ04]
2026-10-29 10:04:11,438 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-2) WFLYJCA0119: Desfazendo o vínculo da criação de conexão chamada java:/JmsXA para o alias java:jboss/DefaultJMSConnectionFactory
2026-10-29 10:04:11,438 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0019: Interrompendo host default-host
2026-10-29 10:04:11,439 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-1) WFLYJCA0010: Fonte de dados sem limite [java:jboss/datasources/ExampleDS]
2026-10-29 10:04:11,439 INFO  [org.wildfly.extension.messaging-activemq] (MSC service thread 1-2) WFLYMSGAMQ0006: Objeto de mensagem não vinculado ao nome jndi java:jboss/exported/jms/RemoteConnectionFactory
2026-10-29 10:04:11,440 INFO  [org.jboss.modcluster] (ServerService Thread Pool -- 21) MODCLUSTER000002: Initiating mod_cluster shutdown
2026-10-29 10:04:11,440 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-1) WFLYMAIL0002: Sessão de e-mail não associada [java:jboss/mail/Default]
2026-10-29 10:04:11,441 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-1) WFLYJCA0011: Sem limite de conectores de Jakarta ConnectionFactory [java:/JmsXA]
2026-10-29 10:04:11,443 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-2) WFLYJCA0019: Serviço de driver interrompido com nome-do-driver = ojdbc8.jar
2026-10-29 10:04:11,449 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-3) WFLYJCA0019: Serviço de driver interrompido com nome-do-driver = h2
2026-10-29 10:04:11,509 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0208: Interrompendo a subimplantação (runtime-name: sirotcon-ejb-2.3.0.1-farm.jar) em 80ms
2026-10-29 10:04:11,525 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0208: Interrompendo a subimplantação (runtime-name: sigsjintrastatic.war) em 96ms
2026-10-29 10:04:11,532 INFO  [org.apache.activemq.artemis.ra] (ServerService Thread Pool -- 21) AMQ151003: resource adaptor stopped
2026-10-29 10:04:11,576 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 83) WFLYCLINF0003: Cache http-remoting-connector encerrado a partir do recipiente ejb
2026-10-29 10:04:11,584 INFO  [org.infinispan.manager.DefaultCacheManager] (ServerService Thread Pool -- 83) Stopping cache manager null on null
2026-10-29 10:04:11,671 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0208: Interrompendo a subimplantação (runtime-name: sigsj_intranet.war) em 243ms
2026-10-29 10:04:11,673 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0028: Implantação interrompida sigsj_intranet-ear.ear (runtime-name: sigsj_intranet-ear.ear) em 244ms
2026-10-29 10:04:11,706 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0008: Undertow HTTPS ouvinte https está suspendendo
2026-10-29 10:04:11,707 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0008: Undertow AJP ouvinte ajp está suspendendo
2026-10-29 10:04:11,708 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0007: Undertow HTTPS ouvinte https interrompido, estava vinculado a 0.0.0.0:8443
2026-10-29 10:04:11,708 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0007: Undertow AJP ouvinte ajp interrompido, estava vinculado a 0.0.0.0:8009
2026-10-29 10:04:11,710 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0028: Implantação interrompida ojdbc8.jar (runtime-name: ojdbc8.jar) em 282ms
2026-10-29 10:04:11,749 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 21) AMQ221002: Apache ActiveMQ Artemis Message Broker version 2.16.0.redhat-00052 [8c98d7d4-094e-11ee-abda-00505682f3d2] stopped, uptime 5 minutes
2026-10-29 10:04:11,751 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0008: Undertow HTTP ouvinte default está suspendendo
2026-10-29 10:04:11,751 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0007: Undertow HTTP ouvinte default interrompido, estava vinculado a 0.0.0.0:8080
2026-10-29 10:04:11,754 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0004: Interrompendo Undertow 2.2.33.SP1-redhat-00001
2026-10-29 10:04:11,765 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0050: JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001) interrompido em 337ms
2026-10-29 10:04:13,667 INFO  [org.jboss.modules] (main) JBoss Modules version 1.12.3.Final-redhat-00001
2026-10-29 10:04:14,017 INFO  [org.jboss.msc] (main) JBoss MSC version 1.4.13.Final-redhat-00001
2026-10-29 10:04:14,023 INFO  [org.jboss.threads] (main) JBoss Threads version 2.4.0.Final-redhat-00001
2026-10-29 10:04:14,093 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0049: Inicializando JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001)
2026-10-29 10:04:14,094 DEBUG [org.jboss.as.config] (MSC service thread 1-2) Propriedades de sistema configurado:
	[Standalone] = 
	awt.toolkit = sun.awt.X11.XToolkit
	file.encoding = UTF-8
	file.encoding.pkg = sun.io
	file.separator = /
	java.awt.graphicsenv = sun.awt.X11GraphicsEnvironment
	java.awt.headless = true
	java.awt.printerjob = sun.print.PSPrinterJob
	java.class.path = /opt/jboss-eap/jboss-modules.jar:/opt/jmx_exporter/jmx_prometheus.jar
	java.class.version = 52.0
	java.endorsed.dirs = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/endorsed
	java.ext.dirs = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/ext:/usr/java/packages/lib/ext
	java.home = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre
	java.io.tmpdir = /tmp
	java.library.path = /usr/java/packages/lib/amd64:/usr/lib64:/lib64:/lib:/usr/lib
	java.net.preferIPv4Stack = true
	java.runtime.name = OpenJDK Runtime Environment
	java.runtime.version = 1.8.0_472-b08
	java.specification.maintenance.version = 6
	java.specification.name = Java Platform API Specification
	java.specification.vendor = Oracle Corporation
	java.specification.version = 1.8
	java.util.logging.manager = org.jboss.logmanager.LogManager
	java.vendor = Red Hat, Inc.
	java.vendor.url = https://www.redhat.com/
	java.vendor.url.bug = https://access.redhat.com/support/cases/
	java.version = 1.8.0_472
	java.vm.info = mixed mode
	java.vm.name = OpenJDK 64-Bit Server VM
	java.vm.specification.name = Java Virtual Machine Specification
	java.vm.specification.vendor = Oracle Corporation
	java.vm.specification.version = 1.8
	java.vm.vendor = Red Hat, Inc.
	java.vm.version = 25.472-b08
	javax.management.builder.initial = org.jboss.as.jmx.PluggableMBeanServerBuilder
	javax.net.ssl.trustStore = /opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks
	javax.net.ssl.trustStorePassword = <redacted>
	jboss.bind.address = 0.0.0.0
	jboss.bind.address.management = 0.0.0.0
	jboss.home.dir = /opt/jboss-eap
	jboss.host.name = caddeapllx955
	jboss.modules.dir = /opt/jboss-eap/modules
	jboss.modules.policy-permissions = true
	jboss.modules.system.pkgs = org.jboss.byteman,org.jboss.logmanager
	jboss.node.name = caddeapllx955
	jboss.qualified.host.name = caddeapllx955.agil.nprd.caixa.gov.br
	jboss.server.base.dir = /opt/jboss-eap/standalone
	jboss.server.config.dir = /opt/jboss-eap/standalone/configuration
	jboss.server.data.dir = /opt/jboss-eap/standalone/data
	jboss.server.deploy.dir = /opt/jboss-eap/standalone/data/content
	jboss.server.log.dir = /logs/jboss/jboss-eap/standalone/sigsj-intranet
	jboss.server.name = caddeapllx955
	jboss.server.persist.config = true
	jboss.server.temp.dir = /opt/jboss-eap/standalone/tmp
	jdk.serialFilter = maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000
	line.separator = 

	logging.configuration = file:/opt/jboss-eap/standalone/configuration/logging.properties
	module.path = /opt/jboss-eap/modules
	org.jboss.boot.log.file = /logs/jboss/jboss-eap/standalone/sigsj-intranet/server.log
	org.jboss.resolver.warning = true
	os.arch = amd64
	os.name = Linux
	os.version = 5.14.0-362.8.1.el9_3.x86_64
	path.separator = :
	sun.arch.data.model = 64
	sun.boot.class.path = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/resources.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/rt.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/sunrsasign.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/jsse.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/jce.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/charsets.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/jfr.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/classes:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar
	sun.boot.library.path = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/amd64
	sun.cpu.endian = little
	sun.cpu.isalist = 
	sun.io.unicode.encoding = UnicodeLittle
	sun.java.command = /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sigsj-intranet -c standalone-full-ha.xml
	sun.java.launcher = SUN_STANDARD
	sun.jnu.encoding = UTF-8
	sun.management.compiler = HotSpot 64-Bit Tiered Compilers
	sun.os.patch.level = unknown
	sun.util.logging.disableCallerCheck = true
	user.country = BR
	user.dir = /
	user.home = /home/jboss
	user.language = pt
	user.name = jboss
	user.timezone = America/Sao_Paulo
2026-10-29 10:04:14,095 DEBUG [org.jboss.as.config] (MSC service thread 1-2) Argumentos da VM: -D[Standalone] -verbose:gc -Xloggc:/logs/jboss/jboss-eap/standalone/sigsj-intranet/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -Xms1024m -Xmx2048m -XX:MetaspaceSize=256m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/sigsj-intranet/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties 
2026-10-29 10:04:14,704 INFO  [org.wildfly.security] (ServerService Thread Pool -- 29) ELY00001: WildFly Elytron version 1.15.23.Final-redhat-00001
2026-10-29 10:04:14,957 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 14) WFLYCTL0033: A extensão 'security' é obsoleta e talvez não seja suportada em versões futuras
2026-10-29 10:04:15,230 INFO  [org.jboss.as.server.deployment.scanner] (DeploymentScanner-threads - 1) WFLYDS0015: A nova tentativa implantação de sigsj_intranet-ear.ear falhou
2026-10-29 10:04:15,631 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Criando serviço de gerenciamento http usando o socket-binding (management-http)
2026-10-29 10:04:15,644 INFO  [org.xnio] (MSC service thread 1-3) XNIO version 3.8.16.Final-redhat-00001
2026-10-29 10:04:15,651 INFO  [org.xnio.nio] (MSC service thread 1-3) XNIO NIO Implementation Version 3.8.16.Final-redhat-00001
2026-10-29 10:04:15,684 INFO  [org.jboss.remoting] (MSC service thread 1-4) JBoss Remoting version 5.0.29.Final-redhat-00001
2026-10-29 10:04:15,704 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 43) WFLYJCA0004: Implantação do driver compatível-JDBC class org.h2.Driver (versão 1.4)
2026-10-29 10:04:15,768 INFO  [org.wildfly.extension.health] (ServerService Thread Pool -- 49) WFLYHEALTH0001: Ativando o Subsistema Básico de integridade
2026-10-29 10:04:15,783 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 51) WFLYCLINF0001: Ativação do subsistema Infinispan.
2026-10-29 10:04:15,788 INFO  [org.wildfly.iiop.openjdk] (ServerService Thread Pool -- 50) WFLYIIOP0001: Ativação de subsistema IIOP 
2026-10-29 10:04:15,799 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 52) WFLYIO001: O operador 'default' configurou automaticamente para as threads de E/S 4 com o máximo de 32 threads de tarefas com base em seus 2 processadores disponíveis.
2026-10-29 10:04:15,821 INFO  [org.jboss.as.connector] (MSC service thread 1-3) WFLYJCA0009: Inicialização do Subsistema Jakarta Connectors (WildFly/IronJacamar 1.5.17.Final-redhat-00001)
2026-10-29 10:04:15,825 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-3) WFLYJCA0018: Serviço de driver iniciado com nome-do-driver = h2
2026-10-29 10:04:15,830 INFO  [org.jboss.as.jsf] (ServerService Thread Pool -- 58) WFLYJSF0007: Ativadas as seguintes implantações do Jakarta Server Faces: [main]
2026-10-29 10:04:15,834 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 53) WFLYRS0016: RESTEasy versão 3.15.9.Final-redhat-00001
2026-10-29 10:04:15,857 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-3) WFLYELY00023: O arquivo '/opt/jboss-eap/standalone/configuration/application.keystore' da KeyStore não existe. Usado em branco.
2026-10-29 10:04:15,900 INFO  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0482: O pool estrito mdb-strict-max-pool está utilizando um tamanho de instância máximo de 8 (por classe) que é derivado do número de CPUs neste host. 
2026-10-29 10:04:15,905 INFO  [org.jboss.as.webservices] (ServerService Thread Pool -- 74) WFLYWS0002: Ativação da Extensão WebServices
2026-10-29 10:04:15,905 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 72) WFLYTX0013: O atributo node-identifier em /subsystem=transactions está definido com o valor padrão. Isso é perigoso para ambientes executando vários servidores. Certifique-se de que o valor do atributo é exclusivo.
2026-10-29 10:04:15,907 INFO  [org.jboss.as.security] (ServerService Thread Pool -- 70) WFLYSEC0002: Ativação do Subsistema de Segurança
2026-10-29 10:04:15,900 INFO  [org.jboss.as.ejb3] (MSC service thread 1-3) WFLYEJB0481: O pool estrito slsb-strict-max-pool está utilizando um tamanho de instância máximo de 32 (por classe) que é derivado do tamanho de pool do thead de trabalho. 
2026-10-29 10:04:15,902 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 64) WFLYNAM0001: Ativação do Subsistema de Nomeação
2026-10-29 10:04:15,925 INFO  [org.wildfly.extension.metrics] (ServerService Thread Pool -- 62) WFLYMETRICS0001: Ativando o subsistema de métricas de base
2026-10-29 10:04:15,943 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-2) WFLYELY01084: KeyStore /opt/jboss-eap/standalone/configuration/application.keystore não encontrado; ele será gerado automaticamente na primeira utilização com um certificado autoassinado para o host localhost
2026-10-29 10:04:15,971 INFO  [org.jboss.as.security] (MSC service thread 1-3) WFLYSEC0001: Versão =5.0.3.Final-redhat-00009 PicketBox atual
2026-10-29 10:04:15,989 WARN  [org.wildfly.clustering.web.undertow] (ServerService Thread Pool -- 73) WFLYCLWEBUT0007: Nenhum provedor de roteamento encontrado para default-server; usando o provedor herdado baseado na configuração estática
2026-10-29 10:04:16,121 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 73) WFLYUT0014: Criando identificador de arquivo para caminho de acesso '/opt/jboss-eap/welcome-content' com as opções [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
2026-10-29 10:04:16,252 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0003: Iniciando Undertow 2.2.33.SP1-redhat-00001
2026-10-29 10:04:16,267 INFO  [org.jboss.as.naming] (MSC service thread 1-1) WFLYNAM0003: Iniciando o Serviço de Nomeação
2026-10-29 10:04:16,279 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-1) WFLYMAIL0001: Sessão de e-mail associada [java:jboss/mail/Default]
2026-10-29 10:04:16,341 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0012: Servidor default-server foi iniciado. 
2026-10-29 10:04:16,341 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) Queuing requests.
2026-10-29 10:04:16,341 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0018: Iniciando host default-host
2026-10-29 10:04:16,349 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0006: UndertowHTTP ouvinte default escutando em 0.0.0.0:8080
2026-10-29 10:04:16,350 INFO  [org.wildfly.iiop.openjdk] (MSC service thread 1-4) WFLYIIOP0009: Serviço CORBA ORB iniciado
2026-10-29 10:04:16,352 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0006: UndertowAJP ouvinte ajp escutando em 0.0.0.0:8009
2026-10-29 10:04:16,368 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0006: UndertowHTTPS ouvinte https escutando em 0.0.0.0:8443
2026-10-29 10:04:16,370 INFO  [org.jboss.modcluster] (ServerService Thread Pool -- 76) MODCLUSTER000001: Initializing mod_cluster version 1.4.5.Final-redhat-00001
2026-10-29 10:04:16,385 INFO  [org.jboss.modcluster] (ServerService Thread Pool -- 76) MODCLUSTER000032: Listening to proxy advertisements on /224.0.1.105:23364
2026-10-29 10:04:16,456 INFO  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0493: Suspensão completa do subsistema de Jakarta Enterprise Beans
2026-10-29 10:04:16,515 INFO  [org.jboss.as.patching] (MSC service thread 1-2) WFLYPAT0050: A ID de patch cumulativo de JBoss EAP é jboss-eap-7.4.18.CP, os patches únicos incluem: none
2026-10-29 10:04:16,565 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0027: Iniciando a implantação do "ojdbc8.jar" (runtime-name: "ojdbc8.jar")
2026-10-29 10:04:16,567 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-4) WFLYDS0013: Foi iniciado FileSystemDeploymentService para o diretório /opt/jboss-eap/standalone/deployments
2026-10-29 10:04:16,568 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-4) WFLYJCA0001: Fonte de dados vinculada[java:jboss/datasources/ExampleDS]
2026-10-29 10:04:16,567 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0027: Iniciando a implantação do "sigsj_intranet-ear.ear" (runtime-name: "sigsj_intranet-ear.ear")
2026-10-29 10:04:16,593 INFO  [org.jboss.ws.common.management] (MSC service thread 1-2) JBWS022052: Starting JBossWS 5.4.9.Final-redhat-00001 (Apache CXF 3.5.8.redhat-00001) 
2026-10-29 10:04:16,604 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 76) AMQ221000: live Message Broker is starting with configuration Broker Configuration (clustered=false,journalDirectory=/opt/jboss-eap/standalone/data/activemq/journal,bindingsDirectory=/opt/jboss-eap/standalone/data/activemq/bindings,largeMessagesDirectory=/opt/jboss-eap/standalone/data/activemq/largemessages,pagingDirectory=/opt/jboss-eap/standalone/data/activemq/paging)
2026-10-29 10:04:16,673 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 76) AMQ221012: Using AIO Journal
2026-10-29 10:04:16,864 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 76) AMQ221043: Protocol module found: [artemis-server]. Adding protocol support for: CORE
2026-10-29 10:04:16,873 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 76) AMQ221043: Protocol module found: [artemis-hornetq-protocol]. Adding protocol support for: HORNETQ
2026-10-29 10:04:17,027 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 76) AMQ221034: Waiting indefinitely to obtain live lock
2026-10-29 10:04:17,028 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 76) AMQ221035: Live Server Obtained live lock
2026-10-29 10:04:17,338 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 76) AMQ221003: Deploying ANYCAST queue jms.queue.ExpiryQueue on address jms.queue.ExpiryQueue
2026-10-29 10:04:17,343 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 76) AMQ221003: Deploying ANYCAST queue jms.queue.DLQ on address jms.queue.DLQ
2026-10-29 10:04:17,355 INFO  [org.wildfly.extension.messaging-activemq] (MSC service thread 1-2) WFLYMSGAMQ0016: Atualização HTTP registrada para protocolo activemq-remoting manipulado pelo aceitador http-acceptor
2026-10-29 10:04:17,358 INFO  [org.wildfly.extension.messaging-activemq] (MSC service thread 1-2) WFLYMSGAMQ0016: Atualização HTTP registrada para protocolo activemq-remoting manipulado pelo aceitador http-acceptor-throughput
2026-10-29 10:04:17,358 INFO  [org.wildfly.extension.messaging-activemq] (MSC service thread 1-2) WFLYMSGAMQ0016: Atualização HTTP registrada para protocolo activemq-remoting manipulado pelo aceitador http-acceptor
2026-10-29 10:04:17,355 INFO  [org.wildfly.extension.messaging-activemq] (MSC service thread 1-3) WFLYMSGAMQ0016: Atualização HTTP registrada para protocolo activemq-remoting manipulado pelo aceitador http-acceptor-throughput
2026-10-29 10:04:17,535 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 76) AMQ221007: Server is now live
2026-10-29 10:04:17,535 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 76) AMQ221001: Apache ActiveMQ Artemis Message Broker version 2.16.0.redhat-00052 [default, nodeID=8c98d7d4-094e-11ee-abda-00505682f3d2] 
2026-10-29 10:04:17,553 INFO  [org.wildfly.extension.messaging-activemq] (ServerService Thread Pool -- 76) WFLYMSGAMQ0002: Objeto de mensagem vinculado ao nome jndi java:/ConnectionFactory
2026-10-29 10:04:17,578 WARN  [org.apache.activemq.artemis.jms.server] (ServerService Thread Pool -- 79) AMQ122005: Invalid "host" value "0.0.0.0" detected for "http-connector" connector. Switching to "caddeapllx955.agil.nprd.caixa.gov.br". If this new address is incorrect please manually configure the connector to use the proper one.
2026-10-29 10:04:17,579 INFO  [org.wildfly.extension.messaging-activemq] (ServerService Thread Pool -- 79) WFLYMSGAMQ0002: Objeto de mensagem vinculado ao nome jndi java:jboss/exported/jms/RemoteConnectionFactory
2026-10-29 10:04:17,584 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: A entrada do caminho da classe oraclepki.jar em /content/ojdbc8.jar não direciona a um jar válido para a referência do caminho da classe.
2026-10-29 10:04:17,618 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-2) WFLYJCA0007: Criação de conexão registrada java:/JmsXA
2026-10-29 10:04:17,673 INFO  [org.apache.activemq.artemis.ra] (MSC service thread 1-2) AMQ151007: Resource adaptor started
2026-10-29 10:04:17,677 INFO  [org.jboss.as.connector.services.resourceadapters.ResourceAdapterActivatorService$ResourceAdapterActivator] (MSC service thread 1-2) IJ020002: Deployed: file://RaActivatoractivemq-ra
2026-10-29 10:04:17,678 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-2) WFLYJCA0002: Conectores de Jakarta vinculados ConnectionFactory [java:/JmsXA]
2026-10-29 10:04:17,679 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-4) WFLYJCA0118: Vínculo de criação de conexão chamado java:/JmsXA para o alias java:jboss/DefaultJMSConnectionFactory
2026-10-29 10:04:17,955 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0207: Iniciando a subimplantação (runtime-name: "sigsjintrastatic.war")
2026-10-29 10:04:17,955 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0207: Iniciando a subimplantação (runtime-name: "sirotcon-ejb-2.3.0.1-farm.jar")
2026-10-29 10:04:17,955 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0207: Iniciando a subimplantação (runtime-name: "sigsj_intranet.war")
2026-10-29 10:04:17,959 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0001: /content/sigsj_intranet-ear.ear/sirotcon-ejb-2.3.0.1-farm.jar/META-INF/jboss-deployment-structure.xml na subimplantação ignorado. O jboss-deployment-structure.xml só é analisado para implantações de nível superior.
2026-10-29 10:04:18,240 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-4) WFLYJCA0004: Implantação do driver compatível-JDBC class oracle.jdbc.OracleDriver (versão 23.26)
2026-10-29 10:04:18,256 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-3) WFLYJCA0018: Serviço de driver iniciado com nome-do-driver = ojdbc8.jar
2026-10-29 10:04:18,259 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-3) WFLYJCA0001: Fonte de dados vinculada[java:jboss/datasources/SIGSJ04]
2026-10-29 10:04:18,629 INFO  [org.infinispan.CONTAINER] (ServerService Thread Pool -- 78) ISPN000128: Infinispan version: Infinispan 'Corona Extra' 11.0.19.Final-redhat-00001
2026-10-29 10:04:18,691 INFO  [org.infinispan.CONFIG] (MSC service thread 1-1) ISPN000152: Passivation configured without an eviction policy being selected. Only manually evicted entities will be passivated.
2026-10-29 10:04:18,694 INFO  [org.infinispan.CONFIG] (MSC service thread 1-1) ISPN000152: Passivation configured without an eviction policy being selected. Only manually evicted entities will be passivated.
2026-10-29 10:04:18,841 INFO  [org.infinispan.PERSISTENCE] (ServerService Thread Pool -- 78) ISPN000556: Starting user marshaller 'org.wildfly.clustering.infinispan.spi.marshalling.InfinispanProtoStreamMarshaller'
2026-10-29 10:04:19,099 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 78) WFLYCLINF0002: Cache http-remoting-connector inicializado a partir do recipiente ejb
2026-10-29 10:04:21,139 INFO  [org.jboss.weld.deployer] (MSC service thread 1-2) WFLYWELD0003: Processando da implantação weld sigsj_intranet-ear.ear
2026-10-29 10:04:21,187 INFO  [org.hibernate.validator.internal.util.Version] (MSC service thread 1-2) HV000001: Hibernate Validator 6.0.23.Final-redhat-00001
2026-10-29 10:04:21,280 INFO  [org.jboss.weld.deployer] (MSC service thread 1-2) WFLYWELD0003: Processando da implantação weld sigsjintrastatic.war
2026-10-29 10:04:21,321 INFO  [org.jboss.weld.deployer] (MSC service thread 1-1) WFLYWELD0003: Processando da implantação weld sirotcon-ejb-2.3.0.1-farm.jar
2026-10-29 10:04:21,341 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SIROTConBean' na unidade de implementação 'subdeployment "sirotcon-ejb-2.3.0.1-farm.jar" of deployment "sigsj_intranet-ear.ear"' são como segue:

	java:global/sigsj_intranet-ear/sirotcon-ejb-2.3.0.1-farm/SIROTConBean!br.gov.caixa.sirot.ejb.SIROTCon
	java:app/sirotcon-ejb-2.3.0.1-farm/SIROTConBean!br.gov.caixa.sirot.ejb.SIROTCon
	java:module/SIROTConBean!br.gov.caixa.sirot.ejb.SIROTCon
	java:jboss/exported/sigsj_intranet-ear/sirotcon-ejb-2.3.0.1-farm/SIROTConBean!br.gov.caixa.sirot.ejb.SIROTCon
	ejb:sigsj_intranet-ear/sirotcon-ejb-2.3.0.1-farm/SIROTConBean!br.gov.caixa.sirot.ejb.SIROTCon
	java:global/sigsj_intranet-ear/sirotcon-ejb-2.3.0.1-farm/SIROTConBean
	java:app/sirotcon-ejb-2.3.0.1-farm/SIROTConBean
	java:module/SIROTConBean

2026-10-29 10:04:21,342 ERROR [org.jboss.msc.service.fail] (MSC service thread 1-1) MSC000001: Failed to start service jboss.deployment.subunit."sigsj_intranet-ear.ear"."sirotcon-ejb-2.3.0.1-farm.jar".POST_MODULE: org.jboss.msc.service.StartException in service jboss.deployment.subunit."sigsj_intranet-ear.ear"."sirotcon-ejb-2.3.0.1-farm.jar".POST_MODULE: WFLYSRV0153: Falha ao processar a fase POST_MODULE de subdeployment "sirotcon-ejb-2.3.0.1-farm.jar" of deployment "sigsj_intranet-ear.ear"
	at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:189)
	at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1739)
	at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1701)
	at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1559)
	at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
	at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1363)
	at java.lang.Thread.run(Thread.java:750)
Caused by: java.lang.NumberFormatException: For input string: "${CONNECTOR-FARM-PORT}"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:569)
	at java.lang.Integer.valueOf(Integer.java:766)
	at org.jboss.as.ee.component.deployers.ResourceReferenceProcessor.getEnvironmentEntries(ResourceReferenceProcessor.java:278)
	at org.jboss.as.ee.component.deployers.ResourceReferenceProcessor.processDescriptorEntries(ResourceReferenceProcessor.java:72)
	at org.jboss.as.ee.component.deployers.AbstractDeploymentDescriptorBindingsProcessor.deploy(AbstractDeploymentDescriptorBindingsProcessor.java:100)
	at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:182)
	... 8 more

2026-10-29 10:04:21,644 INFO  [org.jboss.weld.deployer] (MSC service thread 1-4) WFLYWELD0003: Processando da implantação weld sigsj_intranet.war
2026-10-29 10:04:21,705 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("deploy") - endereço ([("deployment" => "sigsj_intranet-ear.ear")]) - falha na descrição: {
    "WFLYCTL0080: Falha de serviços" => {"jboss.deployment.subunit.\"sigsj_intranet-ear.ear\".\"sirotcon-ejb-2.3.0.1-farm.jar\".POST_MODULE" => "WFLYSRV0153: Falha ao processar a fase POST_MODULE de subdeployment \"sirotcon-ejb-2.3.0.1-farm.jar\" of deployment \"sigsj_intranet-ear.ear\"
    Caused by: java.lang.NumberFormatException: For input string: \"${CONNECTOR-FARM-PORT}\""},
    "WFLYCTL0412: Serviços necessários que não estão instalados:" => [
        "jboss.deployment.unit.\"sigsj_intranet-ear.ear\".WeldStartService",
        "jboss.deployment.subunit.\"sigsj_intranet-ear.ear\".\"sigsjintrastatic.war\".beanmanager",
        "jboss.deployment.subunit.\"sigsj_intranet-ear.ear\".\"sigsj_intranet.war\".beanmanager",
        "jboss.deployment.unit.\"sigsj_intranet-ear.ear\".beanmanager"
    ],
    "WFLYCTL0180: Os serviços com falta/indisponibilidade de dependências " => [
        "jboss.deployment.subunit.\"sigsj_intranet-ear.ear\".\"sigsjintrastatic.war\".batch.artifact.factory faltam [jboss.deployment.subunit.\"sigsj_intranet-ear.ear\".\"sigsjintrastatic.war\".beanmanager]",
        "jboss.deployment.subunit.\"sigsj_intranet-ear.ear\".\"sigsj_intranet.war\".batch.artifact.factory faltam [jboss.deployment.subunit.\"sigsj_intranet-ear.ear\".\"sigsj_intranet.war\".beanmanager]",
        "jboss.deployment.unit.\"sigsj_intranet-ear.ear\".weld.weldClassIntrospector faltam [jboss.deployment.unit.\"sigsj_intranet-ear.ear\".beanmanager, jboss.deployment.unit.\"sigsj_intranet-ear.ear\".WeldStartService]"
    ]
}
2026-10-29 10:04:21,765 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 44) WFLYSRV0010: "ojdbc8.jar" foi implantado (runtime-name: "ojdbc8.jar")
2026-10-29 10:04:21,765 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 44) WFLYSRV0010: "sigsj_intranet-ear.ear" foi implantado (runtime-name: "sigsj_intranet-ear.ear")
2026-10-29 10:04:21,766 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0183: Relatório
 de status de serviçoWFLYCTL0184: Não falta/insatisfaz nenhuma das dependências:
service jboss.deployment.subunit."sigsj_intranet-ear.ear"."sigsj_intranet.war".beanmanager (faltam) dependentes: [service jboss.deployment.subunit."sigsj_intranet-ear.ear"."sigsj_intranet.war".batch.artifact.factory] 
service jboss.deployment.subunit."sigsj_intranet-ear.ear"."sigsjintrastatic.war".beanmanager (faltam) dependentes: [service jboss.deployment.subunit."sigsj_intranet-ear.ear"."sigsjintrastatic.war".batch.artifact.factory] 
service jboss.deployment.unit."sigsj_intranet-ear.ear".WeldStartService (faltam) dependentes: [service jboss.deployment.unit."sigsj_intranet-ear.ear".weld.weldClassIntrospector] 
service jboss.deployment.unit."sigsj_intranet-ear.ear".beanmanager (faltam) dependentes: [service jboss.deployment.unit."sigsj_intranet-ear.ear".weld.weldClassIntrospector] 
WFLYCTL0186: Serviços que falham na inicialização:      service jboss.deployment.subunit."sigsj_intranet-ear.ear"."sirotcon-ejb-2.3.0.1-farm.jar".POST_MODULE: WFLYSRV0153: Falha ao processar a fase POST_MODULE de subdeployment "sirotcon-ejb-2.3.0.1-farm.jar" of deployment "sigsj_intranet-ear.ear"
WFLYCTL0448: 5 serviços adicionais estão inativos devido a ausência ou falha das suas dependências
2026-10-29 10:04:21,791 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Retomando servidor 
2026-10-29 10:04:21,793 ERROR [org.jboss.as] (Controller Boot Thread) WFLYSRV0026: JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001) iniciado (com erros) em 8617ms - Iniciado(s) 539 de serviços 754 (11 serviços falharam ou tinham dependências ausentes, os serviços 369 estão lentos, passivos ou sob demanda)
2026-10-29 10:04:21,794 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0060: A interface de gerenciamento http escutando em http://0.0.0.0:9990/management
2026-10-29 10:04:21,794 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0051: O console de administração escutando em http://0.0.0.0:9990
2026-10-29 10:04:26,410 ERROR [org.jboss.modcluster] (UndertowEventHandlerAdapterService - 1) MODCLUSTER000043: Failed to send INFO command to localhost/127.0.0.1:6666: Conexão recusada (Connection refused)
2026-10-29 10:10:11,549 INFO  [org.jboss.as.server] (Thread-4) WFLYSRV0272: Servidor suspenso
2026-10-29 10:10:11,552 INFO  [org.jboss.as.ejb3] (Thread-4) WFLYEJB0493: Suspensão completa do subsistema de Jakarta Enterprise Beans
2026-10-29 10:10:11,554 INFO  [org.jboss.as.server] (Thread-4) WFLYSRV0220: Foi solicitado o desligamento do servidor através de um sinal de OS
2026-10-29 10:10:11,577 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-4) WFLYMAIL0002: Sessão de e-mail não associada [java:jboss/mail/Default]
2026-10-29 10:10:11,577 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-2) WFLYJCA0010: Fonte de dados sem limite [java:jboss/datasources/SIGSJ04]
2026-10-29 10:10:11,578 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0019: Interrompendo host default-host
2026-10-29 10:10:11,579 INFO  [org.wildfly.extension.messaging-activemq] (MSC service thread 1-4) WFLYMSGAMQ0006: Objeto de mensagem não vinculado ao nome jndi java:jboss/exported/jms/RemoteConnectionFactory
2026-10-29 10:10:11,585 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-1) WFLYJCA0010: Fonte de dados sem limite [java:jboss/datasources/ExampleDS]
2026-10-29 10:10:11,585 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-1) WFLYJCA0119: Desfazendo o vínculo da criação de conexão chamada java:/JmsXA para o alias java:jboss/DefaultJMSConnectionFactory
2026-10-29 10:10:11,588 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-3) WFLYJCA0011: Sem limite de conectores de Jakarta ConnectionFactory [java:/JmsXA]
2026-10-29 10:10:11,590 INFO  [org.jboss.modcluster] (ServerService Thread Pool -- 82) MODCLUSTER000002: Initiating mod_cluster shutdown
2026-10-29 10:10:11,593 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-2) WFLYJCA0019: Serviço de driver interrompido com nome-do-driver = h2
2026-10-29 10:10:11,593 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-2) WFLYJCA0019: Serviço de driver interrompido com nome-do-driver = ojdbc8.jar
2026-10-29 10:10:11,629 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0208: Interrompendo a subimplantação (runtime-name: sirotcon-ejb-2.3.0.1-farm.jar) em 72ms
2026-10-29 10:10:11,652 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0208: Interrompendo a subimplantação (runtime-name: sigsjintrastatic.war) em 94ms
2026-10-29 10:10:11,683 INFO  [org.apache.activemq.artemis.ra] (ServerService Thread Pool -- 87) AMQ151003: resource adaptor stopped
2026-10-29 10:10:11,724 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 7) WFLYCLINF0003: Cache http-remoting-connector encerrado a partir do recipiente ejb
2026-10-29 10:10:11,729 INFO  [org.infinispan.manager.DefaultCacheManager] (ServerService Thread Pool -- 85) Stopping cache manager null on null
2026-10-29 10:10:11,761 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0208: Interrompendo a subimplantação (runtime-name: sigsj_intranet.war) em 205ms
2026-10-29 10:10:11,765 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0028: Implantação interrompida sigsj_intranet-ear.ear (runtime-name: sigsj_intranet-ear.ear) em 209ms
2026-10-29 10:10:11,873 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0028: Implantação interrompida ojdbc8.jar (runtime-name: ojdbc8.jar) em 317ms
2026-10-29 10:10:11,873 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 87) AMQ221002: Apache ActiveMQ Artemis Message Broker version 2.16.0.redhat-00052 [8c98d7d4-094e-11ee-abda-00505682f3d2] stopped, uptime 5 minutes
2026-10-29 10:10:11,874 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0008: Undertow AJP ouvinte ajp está suspendendo
2026-10-29 10:10:11,875 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0008: Undertow HTTPS ouvinte https está suspendendo
2026-10-29 10:10:11,875 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0008: Undertow HTTP ouvinte default está suspendendo
2026-10-29 10:10:11,875 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0007: Undertow HTTP ouvinte default interrompido, estava vinculado a 0.0.0.0:8080
2026-10-29 10:10:11,875 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0007: Undertow HTTPS ouvinte https interrompido, estava vinculado a 0.0.0.0:8443
2026-10-29 10:10:11,876 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0007: Undertow AJP ouvinte ajp interrompido, estava vinculado a 0.0.0.0:8009
2026-10-29 10:10:11,876 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0004: Interrompendo Undertow 2.2.33.SP1-redhat-00001
2026-10-29 10:10:11,884 INFO  [org.jboss.as] (MSC service thread 1-1) WFLYSRV0050: JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001) interrompido em 329ms
2026-10-29 10:10:13,538 INFO  [org.jboss.modules] (main) JBoss Modules version 1.12.3.Final-redhat-00001
2026-10-29 10:10:13,948 INFO  [org.jboss.msc] (main) JBoss MSC version 1.4.13.Final-redhat-00001
2026-10-29 10:10:13,956 INFO  [org.jboss.threads] (main) JBoss Threads version 2.4.0.Final-redhat-00001
2026-10-29 10:10:14,052 INFO  [org.jboss.as] (MSC service thread 1-1) WFLYSRV0049: Inicializando JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001)
2026-10-29 10:10:14,055 DEBUG [org.jboss.as.config] (MSC service thread 1-1) Propriedades de sistema configurado:
	[Standalone] = 
	awt.toolkit = sun.awt.X11.XToolkit
	file.encoding = UTF-8
	file.encoding.pkg = sun.io
	file.separator = /
	java.awt.graphicsenv = sun.awt.X11GraphicsEnvironment
	java.awt.headless = true
	java.awt.printerjob = sun.print.PSPrinterJob
	java.class.path = /opt/jboss-eap/jboss-modules.jar:/opt/jmx_exporter/jmx_prometheus.jar
	java.class.version = 52.0
	java.endorsed.dirs = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/endorsed
	java.ext.dirs = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/ext:/usr/java/packages/lib/ext
	java.home = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre
	java.io.tmpdir = /tmp
	java.library.path = /usr/java/packages/lib/amd64:/usr/lib64:/lib64:/lib:/usr/lib
	java.net.preferIPv4Stack = true
	java.runtime.name = OpenJDK Runtime Environment
	java.runtime.version = 1.8.0_472-b08
	java.specification.maintenance.version = 6
	java.specification.name = Java Platform API Specification
	java.specification.vendor = Oracle Corporation
	java.specification.version = 1.8
	java.util.logging.manager = org.jboss.logmanager.LogManager
	java.vendor = Red Hat, Inc.
	java.vendor.url = https://www.redhat.com/
	java.vendor.url.bug = https://access.redhat.com/support/cases/
	java.version = 1.8.0_472
	java.vm.info = mixed mode
	java.vm.name = OpenJDK 64-Bit Server VM
	java.vm.specification.name = Java Virtual Machine Specification
	java.vm.specification.vendor = Oracle Corporation
	java.vm.specification.version = 1.8
	java.vm.vendor = Red Hat, Inc.
	java.vm.version = 25.472-b08
	javax.management.builder.initial = org.jboss.as.jmx.PluggableMBeanServerBuilder
	javax.net.ssl.trustStore = /opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks
	javax.net.ssl.trustStorePassword = <redacted>
	jboss.bind.address = 0.0.0.0
	jboss.bind.address.management = 0.0.0.0
	jboss.home.dir = /opt/jboss-eap
	jboss.host.name = caddeapllx955
	jboss.modules.dir = /opt/jboss-eap/modules
	jboss.modules.policy-permissions = true
	jboss.modules.system.pkgs = org.jboss.byteman,org.jboss.logmanager
	jboss.node.name = caddeapllx955
	jboss.qualified.host.name = caddeapllx955.agil.nprd.caixa.gov.br
	jboss.server.base.dir = /opt/jboss-eap/standalone
	jboss.server.config.dir = /opt/jboss-eap/standalone/configuration
	jboss.server.data.dir = /opt/jboss-eap/standalone/data
	jboss.server.deploy.dir = /opt/jboss-eap/standalone/data/content
	jboss.server.log.dir = /logs/jboss/jboss-eap/standalone/sigsj-intranet
	jboss.server.name = caddeapllx955
	jboss.server.persist.config = true
	jboss.server.temp.dir = /opt/jboss-eap/standalone/tmp
	jdk.serialFilter = maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000
	line.separator = 

	logging.configuration = file:/opt/jboss-eap/standalone/configuration/logging.properties
	module.path = /opt/jboss-eap/modules
	org.jboss.boot.log.file = /logs/jboss/jboss-eap/standalone/sigsj-intranet/server.log
	org.jboss.resolver.warning = true
	os.arch = amd64
	os.name = Linux
	os.version = 5.14.0-362.8.1.el9_3.x86_64
	path.separator = :
	sun.arch.data.model = 64
	sun.boot.class.path = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/resources.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/rt.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/sunrsasign.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/jsse.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/jce.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/charsets.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/jfr.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/classes:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar
	sun.boot.library.path = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/amd64
	sun.cpu.endian = little
	sun.cpu.isalist = 
	sun.io.unicode.encoding = UnicodeLittle
	sun.java.command = /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sigsj-intranet -c standalone-full-ha.xml
	sun.java.launcher = SUN_STANDARD
	sun.jnu.encoding = UTF-8
	sun.management.compiler = HotSpot 64-Bit Tiered Compilers
	sun.os.patch.level = unknown
	sun.util.logging.disableCallerCheck = true
	user.country = BR
	user.dir = /
	user.home = /home/jboss
	user.language = pt
	user.name = jboss
	user.timezone = America/Sao_Paulo
2026-10-29 10:10:14,055 DEBUG [org.jboss.as.config] (MSC service thread 1-1) Argumentos da VM: -D[Standalone] -verbose:gc -Xloggc:/logs/jboss/jboss-eap/standalone/sigsj-intranet/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -Xms1024m -Xmx2048m -XX:MetaspaceSize=256m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/sigsj-intranet/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties 
2026-10-29 10:10:14,705 INFO  [org.wildfly.security] (ServerService Thread Pool -- 5) ELY00001: WildFly Elytron version 1.15.23.Final-redhat-00001
2026-10-29 10:10:14,992 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 21) WFLYCTL0033: A extensão 'security' é obsoleta e talvez não seja suportada em versões futuras
2026-10-29 10:10:15,208 INFO  [org.jboss.as.server.deployment.scanner] (DeploymentScanner-threads - 1) WFLYDS0015: A nova tentativa implantação de sigsj_intranet-ear.ear falhou
2026-10-29 10:10:15,554 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Criando serviço de gerenciamento http usando o socket-binding (management-http)
2026-10-29 10:10:15,564 INFO  [org.xnio] (MSC service thread 1-2) XNIO version 3.8.16.Final-redhat-00001
2026-10-29 10:10:15,569 INFO  [org.xnio.nio] (MSC service thread 1-2) XNIO NIO Implementation Version 3.8.16.Final-redhat-00001
2026-10-29 10:10:15,607 INFO  [org.jboss.remoting] (MSC service thread 1-4) JBoss Remoting version 5.0.29.Final-redhat-00001
2026-10-29 10:10:15,627 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 43) WFLYJCA0004: Implantação do driver compatível-JDBC class org.h2.Driver (versão 1.4)
2026-10-29 10:10:15,673 INFO  [org.wildfly.extension.health] (ServerService Thread Pool -- 49) WFLYHEALTH0001: Ativando o Subsistema Básico de integridade
2026-10-29 10:10:15,673 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 51) WFLYCLINF0001: Ativação do subsistema Infinispan.
2026-10-29 10:10:15,703 INFO  [org.wildfly.iiop.openjdk] (ServerService Thread Pool -- 50) WFLYIIOP0001: Ativação de subsistema IIOP 
2026-10-29 10:10:15,711 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 52) WFLYIO001: O operador 'default' configurou automaticamente para as threads de E/S 4 com o máximo de 32 threads de tarefas com base em seus 2 processadores disponíveis.
2026-10-29 10:10:15,727 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-2) WFLYELY00023: O arquivo '/opt/jboss-eap/standalone/configuration/application.keystore' da KeyStore não existe. Usado em branco.
2026-10-29 10:10:15,737 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 53) WFLYRS0016: RESTEasy versão 3.15.9.Final-redhat-00001
2026-10-29 10:10:15,760 INFO  [org.jboss.as.connector] (MSC service thread 1-4) WFLYJCA0009: Inicialização do Subsistema Jakarta Connectors (WildFly/IronJacamar 1.5.17.Final-redhat-00001)
2026-10-29 10:10:15,762 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-3) WFLYELY01084: KeyStore /opt/jboss-eap/standalone/configuration/application.keystore não encontrado; ele será gerado automaticamente na primeira utilização com um certificado autoassinado para o host localhost
2026-10-29 10:10:15,768 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-2) WFLYJCA0018: Serviço de driver iniciado com nome-do-driver = h2
2026-10-29 10:10:15,785 INFO  [org.jboss.as.jsf] (ServerService Thread Pool -- 58) WFLYJSF0007: Ativadas as seguintes implantações do Jakarta Server Faces: [main]
2026-10-29 10:10:15,814 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 72) WFLYTX0013: O atributo node-identifier em /subsystem=transactions está definido com o valor padrão. Isso é perigoso para ambientes executando vários servidores. Certifique-se de que o valor do atributo é exclusivo.
2026-10-29 10:10:15,823 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 64) WFLYNAM0001: Ativação do Subsistema de Nomeação
2026-10-29 10:10:15,824 INFO  [org.jboss.as.webservices] (ServerService Thread Pool -- 74) WFLYWS0002: Ativação da Extensão WebServices
2026-10-29 10:10:15,833 INFO  [org.jboss.as.security] (ServerService Thread Pool -- 70) WFLYSEC0002: Ativação do Subsistema de Segurança
2026-10-29 10:10:15,855 INFO  [org.wildfly.extension.metrics] (ServerService Thread Pool -- 62) WFLYMETRICS0001: Ativando o subsistema de métricas de base
2026-10-29 10:10:15,890 WARN  [org.wildfly.clustering.web.undertow] (ServerService Thread Pool -- 73) WFLYCLWEBUT0007: Nenhum provedor de roteamento encontrado para default-server; usando o provedor herdado baseado na configuração estática
2026-10-29 10:10:15,981 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 73) WFLYUT0014: Criando identificador de arquivo para caminho de acesso '/opt/jboss-eap/welcome-content' com as opções [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
2026-10-29 10:10:16,016 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0003: Iniciando Undertow 2.2.33.SP1-redhat-00001
2026-10-29 10:10:16,017 INFO  [org.jboss.as.security] (MSC service thread 1-4) WFLYSEC0001: Versão =5.0.3.Final-redhat-00009 PicketBox atual
2026-10-29 10:10:16,100 INFO  [org.jboss.as.ejb3] (MSC service thread 1-1) WFLYEJB0482: O pool estrito mdb-strict-max-pool está utilizando um tamanho de instância máximo de 8 (por classe) que é derivado do número de CPUs neste host. 
2026-10-29 10:10:16,100 INFO  [org.jboss.as.ejb3] (MSC service thread 1-1) WFLYEJB0481: O pool estrito slsb-strict-max-pool está utilizando um tamanho de instância máximo de 32 (por classe) que é derivado do tamanho de pool do thead de trabalho. 
2026-10-29 10:10:16,133 INFO  [org.jboss.as.naming] (MSC service thread 1-1) WFLYNAM0003: Iniciando o Serviço de Nomeação
2026-10-29 10:10:16,166 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-2) WFLYMAIL0001: Sessão de e-mail associada [java:jboss/mail/Default]
2026-10-29 10:10:16,231 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0012: Servidor default-server foi iniciado. 
2026-10-29 10:10:16,233 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0006: UndertowAJP ouvinte ajp escutando em 0.0.0.0:8009
2026-10-29 10:10:16,238 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0006: UndertowHTTP ouvinte default escutando em 0.0.0.0:8080
2026-10-29 10:10:16,239 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) Queuing requests.
2026-10-29 10:10:16,240 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0018: Iniciando host default-host
2026-10-29 10:10:16,245 INFO  [org.wildfly.iiop.openjdk] (MSC service thread 1-3) WFLYIIOP0009: Serviço CORBA ORB iniciado
2026-10-29 10:10:16,262 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0006: UndertowHTTPS ouvinte https escutando em 0.0.0.0:8443
2026-10-29 10:10:16,281 INFO  [org.jboss.modcluster] (ServerService Thread Pool -- 76) MODCLUSTER000001: Initializing mod_cluster version 1.4.5.Final-redhat-00001
2026-10-29 10:10:16,310 INFO  [org.jboss.modcluster] (ServerService Thread Pool -- 76) MODCLUSTER000032: Listening to proxy advertisements on /224.0.1.105:23364
2026-10-29 10:10:16,333 INFO  [org.jboss.as.ejb3] (MSC service thread 1-4) WFLYEJB0493: Suspensão completa do subsistema de Jakarta Enterprise Beans
2026-10-29 10:10:16,378 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-1) WFLYJCA0001: Fonte de dados vinculada[java:jboss/datasources/ExampleDS]
2026-10-29 10:10:16,428 INFO  [org.jboss.as.patching] (MSC service thread 1-2) WFLYPAT0050: A ID de patch cumulativo de JBoss EAP é jboss-eap-7.4.18.CP, os patches únicos incluem: none
2026-10-29 10:10:16,488 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-2) WFLYDS0013: Foi iniciado FileSystemDeploymentService para o diretório /opt/jboss-eap/standalone/deployments
2026-10-29 10:10:16,493 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0027: Iniciando a implantação do "ojdbc8.jar" (runtime-name: "ojdbc8.jar")
2026-10-29 10:10:16,494 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0027: Iniciando a implantação do "sigsj_intranet-ear.ear" (runtime-name: "sigsj_intranet-ear.ear")
2026-10-29 10:10:16,558 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 76) AMQ221000: live Message Broker is starting with configuration Broker Configuration (clustered=false,journalDirectory=/opt/jboss-eap/standalone/data/activemq/journal,bindingsDirectory=/opt/jboss-eap/standalone/data/activemq/bindings,largeMessagesDirectory=/opt/jboss-eap/standalone/data/activemq/largemessages,pagingDirectory=/opt/jboss-eap/standalone/data/activemq/paging)
2026-10-29 10:10:16,560 INFO  [org.jboss.ws.common.management] (MSC service thread 1-3) JBWS022052: Starting JBossWS 5.4.9.Final-redhat-00001 (Apache CXF 3.5.8.redhat-00001) 
2026-10-29 10:10:16,678 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 76) AMQ221012: Using AIO Journal
2026-10-29 10:10:16,821 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 76) AMQ221043: Protocol module found: [artemis-server]. Adding protocol support for: CORE
2026-10-29 10:10:16,821 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 76) AMQ221043: Protocol module found: [artemis-hornetq-protocol]. Adding protocol support for: HORNETQ
2026-10-29 10:10:16,936 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 76) AMQ221034: Waiting indefinitely to obtain live lock
2026-10-29 10:10:16,937 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 76) AMQ221035: Live Server Obtained live lock
2026-10-29 10:10:17,250 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 76) AMQ221003: Deploying ANYCAST queue jms.queue.ExpiryQueue on address jms.queue.ExpiryQueue
2026-10-29 10:10:17,254 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 76) AMQ221003: Deploying ANYCAST queue jms.queue.DLQ on address jms.queue.DLQ
2026-10-29 10:10:17,268 INFO  [org.wildfly.extension.messaging-activemq] (MSC service thread 1-4) WFLYMSGAMQ0016: Atualização HTTP registrada para protocolo activemq-remoting manipulado pelo aceitador http-acceptor
2026-10-29 10:10:17,268 INFO  [org.wildfly.extension.messaging-activemq] (MSC service thread 1-4) WFLYMSGAMQ0016: Atualização HTTP registrada para protocolo activemq-remoting manipulado pelo aceitador http-acceptor-throughput
2026-10-29 10:10:17,268 INFO  [org.wildfly.extension.messaging-activemq] (MSC service thread 1-4) WFLYMSGAMQ0016: Atualização HTTP registrada para protocolo activemq-remoting manipulado pelo aceitador http-acceptor
2026-10-29 10:10:17,261 INFO  [org.wildfly.extension.messaging-activemq] (MSC service thread 1-3) WFLYMSGAMQ0016: Atualização HTTP registrada para protocolo activemq-remoting manipulado pelo aceitador http-acceptor-throughput
2026-10-29 10:10:17,465 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 76) AMQ221007: Server is now live
2026-10-29 10:10:17,466 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 76) AMQ221001: Apache ActiveMQ Artemis Message Broker version 2.16.0.redhat-00052 [default, nodeID=8c98d7d4-094e-11ee-abda-00505682f3d2] 
2026-10-29 10:10:17,492 WARN  [org.apache.activemq.artemis.jms.server] (ServerService Thread Pool -- 77) AMQ122005: Invalid "host" value "0.0.0.0" detected for "http-connector" connector. Switching to "caddeapllx955.agil.nprd.caixa.gov.br". If this new address is incorrect please manually configure the connector to use the proper one.
2026-10-29 10:10:17,517 INFO  [org.wildfly.extension.messaging-activemq] (ServerService Thread Pool -- 77) WFLYMSGAMQ0002: Objeto de mensagem vinculado ao nome jndi java:jboss/exported/jms/RemoteConnectionFactory
2026-10-29 10:10:17,526 INFO  [org.wildfly.extension.messaging-activemq] (ServerService Thread Pool -- 79) WFLYMSGAMQ0002: Objeto de mensagem vinculado ao nome jndi java:/ConnectionFactory
2026-10-29 10:10:17,543 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-4) WFLYJCA0007: Criação de conexão registrada java:/JmsXA
2026-10-29 10:10:17,589 INFO  [org.apache.activemq.artemis.ra] (MSC service thread 1-4) AMQ151007: Resource adaptor started
2026-10-29 10:10:17,589 INFO  [org.jboss.as.connector.services.resourceadapters.ResourceAdapterActivatorService$ResourceAdapterActivator] (MSC service thread 1-4) IJ020002: Deployed: file://RaActivatoractivemq-ra
2026-10-29 10:10:17,594 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-4) WFLYJCA0002: Conectores de Jakarta vinculados ConnectionFactory [java:/JmsXA]
2026-10-29 10:10:17,594 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-4) WFLYJCA0118: Vínculo de criação de conexão chamado java:/JmsXA para o alias java:jboss/DefaultJMSConnectionFactory
2026-10-29 10:10:17,658 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: A entrada do caminho da classe oraclepki.jar em /content/ojdbc8.jar não direciona a um jar válido para a referência do caminho da classe.
2026-10-29 10:10:18,071 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0207: Iniciando a subimplantação (runtime-name: "sigsjintrastatic.war")
2026-10-29 10:10:18,071 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0207: Iniciando a subimplantação (runtime-name: "sigsj_intranet.war")
2026-10-29 10:10:18,071 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0207: Iniciando a subimplantação (runtime-name: "sirotcon-ejb-2.3.0.1-farm.jar")
2026-10-29 10:10:18,077 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0001: /content/sigsj_intranet-ear.ear/sirotcon-ejb-2.3.0.1-farm.jar/META-INF/jboss-deployment-structure.xml na subimplantação ignorado. O jboss-deployment-structure.xml só é analisado para implantações de nível superior.
2026-10-29 10:10:18,236 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-4) WFLYJCA0004: Implantação do driver compatível-JDBC class oracle.jdbc.OracleDriver (versão 23.26)
2026-10-29 10:10:18,245 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-1) WFLYJCA0018: Serviço de driver iniciado com nome-do-driver = ojdbc8.jar
2026-10-29 10:10:18,247 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-1) WFLYJCA0001: Fonte de dados vinculada[java:jboss/datasources/SIGSJ04]
2026-10-29 10:10:18,433 INFO  [org.infinispan.CONTAINER] (ServerService Thread Pool -- 79) ISPN000128: Infinispan version: Infinispan 'Corona Extra' 11.0.19.Final-redhat-00001
2026-10-29 10:10:18,472 INFO  [org.infinispan.CONFIG] (MSC service thread 1-1) ISPN000152: Passivation configured without an eviction policy being selected. Only manually evicted entities will be passivated.
2026-10-29 10:10:18,473 INFO  [org.infinispan.CONFIG] (MSC service thread 1-1) ISPN000152: Passivation configured without an eviction policy being selected. Only manually evicted entities will be passivated.
2026-10-29 10:10:18,542 INFO  [org.infinispan.PERSISTENCE] (ServerService Thread Pool -- 79) ISPN000556: Starting user marshaller 'org.wildfly.clustering.infinispan.spi.marshalling.InfinispanProtoStreamMarshaller'
2026-10-29 10:10:18,719 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 79) WFLYCLINF0002: Cache http-remoting-connector inicializado a partir do recipiente ejb
2026-10-29 10:10:20,942 INFO  [org.jboss.weld.deployer] (MSC service thread 1-1) WFLYWELD0003: Processando da implantação weld sigsj_intranet-ear.ear
2026-10-29 10:10:21,002 INFO  [org.hibernate.validator.internal.util.Version] (MSC service thread 1-1) HV000001: Hibernate Validator 6.0.23.Final-redhat-00001
2026-10-29 10:10:21,092 INFO  [org.jboss.weld.deployer] (MSC service thread 1-4) WFLYWELD0003: Processando da implantação weld sigsjintrastatic.war
2026-10-29 10:10:21,120 INFO  [org.jboss.weld.deployer] (MSC service thread 1-2) WFLYWELD0003: Processando da implantação weld sirotcon-ejb-2.3.0.1-farm.jar
2026-10-29 10:10:21,125 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SIROTConBean' na unidade de implementação 'subdeployment "sirotcon-ejb-2.3.0.1-farm.jar" of deployment "sigsj_intranet-ear.ear"' são como segue:

	java:global/sigsj_intranet-ear/sirotcon-ejb-2.3.0.1-farm/SIROTConBean!br.gov.caixa.sirot.ejb.SIROTCon
	java:app/sirotcon-ejb-2.3.0.1-farm/SIROTConBean!br.gov.caixa.sirot.ejb.SIROTCon
	java:module/SIROTConBean!br.gov.caixa.sirot.ejb.SIROTCon
	java:jboss/exported/sigsj_intranet-ear/sirotcon-ejb-2.3.0.1-farm/SIROTConBean!br.gov.caixa.sirot.ejb.SIROTCon
	ejb:sigsj_intranet-ear/sirotcon-ejb-2.3.0.1-farm/SIROTConBean!br.gov.caixa.sirot.ejb.SIROTCon
	java:global/sigsj_intranet-ear/sirotcon-ejb-2.3.0.1-farm/SIROTConBean
	java:app/sirotcon-ejb-2.3.0.1-farm/SIROTConBean
	java:module/SIROTConBean

2026-10-29 10:10:21,568 INFO  [org.jboss.weld.deployer] (MSC service thread 1-3) WFLYWELD0003: Processando da implantação weld sigsj_intranet.war
2026-10-29 10:10:21,701 INFO  [org.jboss.weld.Version] (MSC service thread 1-1) WELD-000900: 3.1.10 (redhat)
2026-10-29 10:10:21,887 WARN  [org.jboss.as.ee] (MSC service thread 1-4) WFLYEE0007: Nenhuma instalação do componente opcional org.springframework.http.server.ServletServerHttpAsyncRequestControl devido à uma exceção (habilite o nível do log DEPURAR para verificar a causa)
2026-10-29 10:10:21,888 WARN  [org.jboss.as.ee] (MSC service thread 1-4) WFLYEE0007: Nenhuma instalação do componente opcional org.springframework.web.context.request.async.StandardServletAsyncWebRequest devido à uma exceção (habilite o nível do log DEPURAR para verificar a causa)
2026-10-29 10:10:21,889 WARN  [org.jboss.as.ee] (MSC service thread 1-4) WFLYEE0007: Nenhuma instalação do componente opcional render-kit-factory.org.ajax4jsf.renderkit.ChameleonRenderKitFactory devido à uma exceção (habilite o nível do log DEPURAR para verificar a causa)
2026-10-29 10:10:21,903 WARN  [org.jboss.as.ee] (MSC service thread 1-4) WFLYEE0007: Nenhuma instalação do componente opcional state-manager.org.ajax4jsf.application.AjaxStateManager devido à uma exceção (habilite o nível do log DEPURAR para verificar a causa)
2026-10-29 10:10:21,913 WARN  [org.jboss.as.ee] (MSC service thread 1-4) WFLYEE0007: Nenhuma instalação do componente opcional view-handler.com.sun.facelets.FaceletViewHandler devido à uma exceção (habilite o nível do log DEPURAR para verificar a causa)
2026-10-29 10:10:21,964 WARN  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-4) WFLYJCA0003: Não foi possível instanciar a classe do driver "org.olap4j.driver.xmla.XmlaOlap4jDriver": java.lang.NoSuchMethodException: org.olap4j.driver.xmla.XmlaOlap4jDriver.<init>()
2026-10-29 10:10:22,961 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 152) WFLYUT0021: Contexto web registrado: '/sigsjintrastatic' para servidor 'default-server'
2026-10-29 10:10:23,011 INFO  [javax.enterprise.resource.webcontainer.jsf.config] (ServerService Thread Pool -- 151) Initializing Mojarra (1.2_15-20100816-SNAPSHOT) for context '/sigsj_intranet'
2026-10-29 10:10:23,463 INFO  [javax.enterprise.resource.webcontainer.jsf.application] (ServerService Thread Pool -- 151) JSF1048: PostConstruct/PreDestroy annotations present.  ManagedBeans methods marked with these annotations will have said annotations processed.
2026-10-29 10:10:23,707 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 151) WFLYUT0021: Contexto web registrado: '/sigsj_intranet' para servidor 'default-server'
2026-10-29 10:10:23,839 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 44) WFLYSRV0010: "ojdbc8.jar" foi implantado (runtime-name: "ojdbc8.jar")
2026-10-29 10:10:23,841 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 44) WFLYSRV0010: "sigsj_intranet-ear.ear" foi implantado (runtime-name: "sigsj_intranet-ear.ear")
2026-10-29 10:10:23,899 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Retomando servidor 
2026-10-29 10:10:23,906 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001) iniciado em 10717ms - Iniciado(s) 2218 de serviços 2421 (os serviços 377 estão lentos, passivos ou sob demanda)
2026-10-29 10:10:23,910 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0060: A interface de gerenciamento http escutando em http://0.0.0.0:9990/management
2026-10-29 10:10:23,911 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0051: O console de administração escutando em http://0.0.0.0:9990
2026-10-29 10:10:26,338 ERROR [org.jboss.modcluster] (UndertowEventHandlerAdapterService - 1) MODCLUSTER000043: Failed to send INFO command to localhost/127.0.0.1:6666: Conexão recusada (Connection refused)
2026-10-29 10:15:59,185 INFO  [org.jboss.as.server] (Thread-4) WFLYSRV0272: Servidor suspenso
2026-10-29 10:15:59,189 INFO  [org.jboss.as.ejb3] (Thread-4) WFLYEJB0493: Suspensão completa do subsistema de Jakarta Enterprise Beans
2026-10-29 10:15:59,191 INFO  [org.jboss.as.server] (Thread-4) WFLYSRV0220: Foi solicitado o desligamento do servidor através de um sinal de OS
2026-10-29 10:15:59,433 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-2) WFLYJCA0010: Fonte de dados sem limite [java:jboss/datasources/SIGSJ04]
2026-10-29 10:15:59,437 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-4) WFLYMAIL0002: Sessão de e-mail não associada [java:jboss/mail/Default]
2026-10-29 10:15:59,446 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 158) WFLYUT0022: Contexto web não registrado:'/sigsjintrastatic' do servidor 'default-server' 
2026-10-29 10:15:59,447 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 159) WFLYUT0022: Contexto web não registrado:'/sigsj_intranet' do servidor 'default-server' 
2026-10-29 10:15:59,456 INFO  [org.wildfly.extension.messaging-activemq] (MSC service thread 1-1) WFLYMSGAMQ0006: Objeto de mensagem não vinculado ao nome jndi java:jboss/exported/jms/RemoteConnectionFactory
2026-10-29 10:15:59,465 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-4) WFLYJCA0019: Serviço de driver interrompido com nome-do-driver = ojdbc8.jar
2026-10-29 10:15:59,495 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0019: Interrompendo host default-host
2026-10-29 10:15:59,509 INFO  [org.jboss.modcluster] (ServerService Thread Pool -- 166) MODCLUSTER000002: Initiating mod_cluster shutdown
2026-10-29 10:15:59,525 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-1) WFLYJCA0010: Fonte de dados sem limite [java:jboss/datasources/ExampleDS]
2026-10-29 10:15:59,525 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-1) WFLYJCA0119: Desfazendo o vínculo da criação de conexão chamada java:/JmsXA para o alias java:jboss/DefaultJMSConnectionFactory
2026-10-29 10:15:59,535 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-3) WFLYJCA0011: Sem limite de conectores de Jakarta ConnectionFactory [java:/JmsXA]
2026-10-29 10:15:59,543 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-3) WFLYJCA0019: Serviço de driver interrompido com nome-do-driver = h2
2026-10-29 10:15:59,566 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0208: Interrompendo a subimplantação (runtime-name: sirotcon-ejb-2.3.0.1-farm.jar) em 340ms
2026-10-29 10:15:59,597 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0208: Interrompendo a subimplantação (runtime-name: sigsjintrastatic.war) em 388ms
2026-10-29 10:15:59,636 INFO  [org.apache.activemq.artemis.ra] (ServerService Thread Pool -- 157) AMQ151003: resource adaptor stopped
2026-10-29 10:15:59,686 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 166) WFLYCLINF0003: Cache http-remoting-connector encerrado a partir do recipiente ejb
2026-10-29 10:15:59,692 INFO  [org.infinispan.manager.DefaultCacheManager] (ServerService Thread Pool -- 166) Stopping cache manager null on null
2026-10-29 10:15:59,719 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0208: Interrompendo a subimplantação (runtime-name: sigsj_intranet.war) em 494ms
2026-10-29 10:15:59,721 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0028: Implantação interrompida sigsj_intranet-ear.ear (runtime-name: sigsj_intranet-ear.ear) em 496ms
2026-10-29 10:15:59,777 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0008: Undertow AJP ouvinte ajp está suspendendo
2026-10-29 10:15:59,777 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0008: Undertow HTTPS ouvinte https está suspendendo
2026-10-29 10:15:59,777 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0028: Implantação interrompida ojdbc8.jar (runtime-name: ojdbc8.jar) em 571ms
2026-10-29 10:15:59,778 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0007: Undertow HTTPS ouvinte https interrompido, estava vinculado a 0.0.0.0:8443
2026-10-29 10:15:59,778 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0007: Undertow AJP ouvinte ajp interrompido, estava vinculado a 0.0.0.0:8009
2026-10-29 10:15:59,847 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 157) AMQ221002: Apache ActiveMQ Artemis Message Broker version 2.16.0.redhat-00052 [8c98d7d4-094e-11ee-abda-00505682f3d2] stopped, uptime 5 minutes
2026-10-29 10:15:59,848 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0008: Undertow HTTP ouvinte default está suspendendo
2026-10-29 10:15:59,849 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0007: Undertow HTTP ouvinte default interrompido, estava vinculado a 0.0.0.0:8080
2026-10-29 10:15:59,850 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0004: Interrompendo Undertow 2.2.33.SP1-redhat-00001
2026-10-29 10:15:59,856 INFO  [org.jboss.as] (MSC service thread 1-1) WFLYSRV0050: JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001) interrompido em 638ms
2026-10-29 10:16:01,039 INFO  [org.jboss.modules] (main) JBoss Modules version 1.12.3.Final-redhat-00001
2026-10-29 10:16:01,336 INFO  [org.jboss.msc] (main) JBoss MSC version 1.4.13.Final-redhat-00001
2026-10-29 10:16:01,343 INFO  [org.jboss.threads] (main) JBoss Threads version 2.4.0.Final-redhat-00001
2026-10-29 10:16:01,423 INFO  [org.jboss.as] (MSC service thread 1-1) WFLYSRV0049: Inicializando JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001)
2026-10-29 10:16:01,424 DEBUG [org.jboss.as.config] (MSC service thread 1-1) Propriedades de sistema configurado:
	[Standalone] = 
	awt.toolkit = sun.awt.X11.XToolkit
	file.encoding = UTF-8
	file.encoding.pkg = sun.io
	file.separator = /
	java.awt.graphicsenv = sun.awt.X11GraphicsEnvironment
	java.awt.headless = true
	java.awt.printerjob = sun.print.PSPrinterJob
	java.class.path = /opt/jboss-eap/jboss-modules.jar:/opt/jmx_exporter/jmx_prometheus.jar
	java.class.version = 52.0
	java.endorsed.dirs = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/endorsed
	java.ext.dirs = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/ext:/usr/java/packages/lib/ext
	java.home = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre
	java.io.tmpdir = /tmp
	java.library.path = /usr/java/packages/lib/amd64:/usr/lib64:/lib64:/lib:/usr/lib
	java.net.preferIPv4Stack = true
	java.runtime.name = OpenJDK Runtime Environment
	java.runtime.version = 1.8.0_472-b08
	java.specification.maintenance.version = 6
	java.specification.name = Java Platform API Specification
	java.specification.vendor = Oracle Corporation
	java.specification.version = 1.8
	java.util.logging.manager = org.jboss.logmanager.LogManager
	java.vendor = Red Hat, Inc.
	java.vendor.url = https://www.redhat.com/
	java.vendor.url.bug = https://access.redhat.com/support/cases/
	java.version = 1.8.0_472
	java.vm.info = mixed mode
	java.vm.name = OpenJDK 64-Bit Server VM
	java.vm.specification.name = Java Virtual Machine Specification
	java.vm.specification.vendor = Oracle Corporation
	java.vm.specification.version = 1.8
	java.vm.vendor = Red Hat, Inc.
	java.vm.version = 25.472-b08
	javax.management.builder.initial = org.jboss.as.jmx.PluggableMBeanServerBuilder
	javax.net.ssl.trustStore = /opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks
	javax.net.ssl.trustStorePassword = <redacted>
	jboss.bind.address = 0.0.0.0
	jboss.bind.address.management = 0.0.0.0
	jboss.home.dir = /opt/jboss-eap
	jboss.host.name = caddeapllx955
	jboss.modules.dir = /opt/jboss-eap/modules
	jboss.modules.policy-permissions = true
	jboss.modules.system.pkgs = org.jboss.byteman,org.jboss.logmanager
	jboss.node.name = caddeapllx955
	jboss.qualified.host.name = caddeapllx955.agil.nprd.caixa.gov.br
	jboss.server.base.dir = /opt/jboss-eap/standalone
	jboss.server.config.dir = /opt/jboss-eap/standalone/configuration
	jboss.server.data.dir = /opt/jboss-eap/standalone/data
	jboss.server.deploy.dir = /opt/jboss-eap/standalone/data/content
	jboss.server.log.dir = /logs/jboss/jboss-eap/standalone/sigsj-intranet
	jboss.server.name = caddeapllx955
	jboss.server.persist.config = true
	jboss.server.temp.dir = /opt/jboss-eap/standalone/tmp
	jdk.serialFilter = maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000
	line.separator = 

	logging.configuration = file:/opt/jboss-eap/standalone/configuration/logging.properties
	module.path = /opt/jboss-eap/modules
	org.jboss.boot.log.file = /logs/jboss/jboss-eap/standalone/sigsj-intranet/server.log
	org.jboss.resolver.warning = true
	os.arch = amd64
	os.name = Linux
	os.version = 5.14.0-362.8.1.el9_3.x86_64
	path.separator = :
	sun.arch.data.model = 64
	sun.boot.class.path = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/resources.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/rt.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/sunrsasign.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/jsse.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/jce.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/charsets.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/jfr.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/classes:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar
	sun.boot.library.path = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/amd64
	sun.cpu.endian = little
	sun.cpu.isalist = 
	sun.io.unicode.encoding = UnicodeLittle
	sun.java.command = /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sigsj-intranet -c standalone-full-ha.xml
	sun.java.launcher = SUN_STANDARD
	sun.jnu.encoding = UTF-8
	sun.management.compiler = HotSpot 64-Bit Tiered Compilers
	sun.os.patch.level = unknown
	sun.util.logging.disableCallerCheck = true
	user.country = BR
	user.dir = /
	user.home = /home/jboss
	user.language = pt
	user.name = jboss
	user.timezone = America/Sao_Paulo
2026-10-29 10:16:01,424 DEBUG [org.jboss.as.config] (MSC service thread 1-1) Argumentos da VM: -D[Standalone] -verbose:gc -Xloggc:/logs/jboss/jboss-eap/standalone/sigsj-intranet/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -Xms1024m -Xmx2048m -XX:MetaspaceSize=256m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/sigsj-intranet/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties 
2026-10-29 10:16:02,048 INFO  [org.wildfly.security] (ServerService Thread Pool -- 7) ELY00001: WildFly Elytron version 1.15.23.Final-redhat-00001
2026-10-29 10:16:02,310 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 3) WFLYCTL0033: A extensão 'security' é obsoleta e talvez não seja suportada em versões futuras
2026-10-29 10:16:02,953 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Criando serviço de gerenciamento http usando o socket-binding (management-http)
2026-10-29 10:16:02,964 INFO  [org.xnio] (MSC service thread 1-2) XNIO version 3.8.16.Final-redhat-00001
2026-10-29 10:16:02,969 INFO  [org.xnio.nio] (MSC service thread 1-2) XNIO NIO Implementation Version 3.8.16.Final-redhat-00001
2026-10-29 10:16:03,016 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 43) WFLYJCA0004: Implantação do driver compatível-JDBC class org.h2.Driver (versão 1.4)
2026-10-29 10:16:03,038 INFO  [org.jboss.remoting] (MSC service thread 1-4) JBoss Remoting version 5.0.29.Final-redhat-00001
2026-10-29 10:16:03,073 INFO  [org.wildfly.extension.health] (ServerService Thread Pool -- 49) WFLYHEALTH0001: Ativando o Subsistema Básico de integridade
2026-10-29 10:16:03,078 INFO  [org.wildfly.iiop.openjdk] (ServerService Thread Pool -- 50) WFLYIIOP0001: Ativação de subsistema IIOP 
2026-10-29 10:16:03,085 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 51) WFLYCLINF0001: Ativação do subsistema Infinispan.
2026-10-29 10:16:03,104 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 52) WFLYIO001: O operador 'default' configurou automaticamente para as threads de E/S 4 com o máximo de 32 threads de tarefas com base em seus 2 processadores disponíveis.
2026-10-29 10:16:03,124 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 43) WFLYJCA0004: Implantação do driver compatível-JDBC class oracle.jdbc.OracleDriver (versão 19.3)
2026-10-29 10:16:03,130 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 53) WFLYRS0016: RESTEasy versão 3.15.9.Final-redhat-00001
2026-10-29 10:16:03,153 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-2) WFLYELY00023: O arquivo '/opt/jboss-eap/standalone/configuration/application.keystore' da KeyStore não existe. Usado em branco.
2026-10-29 10:16:03,164 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-1) WFLYELY01084: KeyStore /opt/jboss-eap/standalone/configuration/application.keystore não encontrado; ele será gerado automaticamente na primeira utilização com um certificado autoassinado para o host localhost
2026-10-29 10:16:03,231 INFO  [org.wildfly.extension.metrics] (ServerService Thread Pool -- 62) WFLYMETRICS0001: Ativando o subsistema de métricas de base
2026-10-29 10:16:03,266 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 72) WFLYTX0013: O atributo node-identifier em /subsystem=transactions está definido com o valor padrão. Isso é perigoso para ambientes executando vários servidores. Certifique-se de que o valor do atributo é exclusivo.
2026-10-29 10:16:03,270 INFO  [org.jboss.as.security] (ServerService Thread Pool -- 70) WFLYSEC0002: Ativação do Subsistema de Segurança
2026-10-29 10:16:03,278 INFO  [org.jboss.as.webservices] (ServerService Thread Pool -- 74) WFLYWS0002: Ativação da Extensão WebServices
2026-10-29 10:16:03,284 INFO  [org.jboss.as.jsf] (ServerService Thread Pool -- 58) WFLYJSF0007: Ativadas as seguintes implantações do Jakarta Server Faces: [main]
2026-10-29 10:16:03,293 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 64) WFLYNAM0001: Ativação do Subsistema de Nomeação
2026-10-29 10:16:03,308 WARN  [org.wildfly.clustering.web.undertow] (ServerService Thread Pool -- 73) WFLYCLWEBUT0007: Nenhum provedor de roteamento encontrado para default-server; usando o provedor herdado baseado na configuração estática
2026-10-29 10:16:03,319 INFO  [org.jboss.as.connector] (MSC service thread 1-1) WFLYJCA0009: Inicialização do Subsistema Jakarta Connectors (WildFly/IronJacamar 1.5.17.Final-redhat-00001)
2026-10-29 10:16:03,383 INFO  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0482: O pool estrito mdb-strict-max-pool está utilizando um tamanho de instância máximo de 8 (por classe) que é derivado do número de CPUs neste host. 
2026-10-29 10:16:03,383 INFO  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0481: O pool estrito slsb-strict-max-pool está utilizando um tamanho de instância máximo de 32 (por classe) que é derivado do tamanho de pool do thead de trabalho. 
2026-10-29 10:16:03,449 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 73) WFLYUT0014: Criando identificador de arquivo para caminho de acesso '/opt/jboss-eap/welcome-content' com as opções [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
2026-10-29 10:16:03,458 INFO  [org.jboss.as.security] (MSC service thread 1-2) WFLYSEC0001: Versão =5.0.3.Final-redhat-00009 PicketBox atual
2026-10-29 10:16:03,477 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-3) WFLYJCA0018: Serviço de driver iniciado com nome-do-driver = h2
2026-10-29 10:16:03,478 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-3) WFLYJCA0018: Serviço de driver iniciado com nome-do-driver = oracle
2026-10-29 10:16:03,486 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0003: Iniciando Undertow 2.2.33.SP1-redhat-00001
2026-10-29 10:16:03,554 INFO  [org.jboss.as.naming] (MSC service thread 1-1) WFLYNAM0003: Iniciando o Serviço de Nomeação
2026-10-29 10:16:03,571 INFO  [org.wildfly.iiop.openjdk] (MSC service thread 1-4) WFLYIIOP0009: Serviço CORBA ORB iniciado
2026-10-29 10:16:03,587 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-4) WFLYMAIL0001: Sessão de e-mail associada [java:jboss/mail/Default]
2026-10-29 10:16:03,609 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0012: Servidor default-server foi iniciado. 
2026-10-29 10:16:03,612 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0006: UndertowHTTP ouvinte default escutando em 0.0.0.0:8080
2026-10-29 10:16:03,620 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0006: UndertowAJP ouvinte ajp escutando em 0.0.0.0:8009
2026-10-29 10:16:03,633 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0006: UndertowHTTPS ouvinte https escutando em 0.0.0.0:8443
2026-10-29 10:16:03,633 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) Queuing requests.
2026-10-29 10:16:03,634 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0018: Iniciando host default-host
2026-10-29 10:16:03,643 INFO  [org.jboss.modcluster] (ServerService Thread Pool -- 76) MODCLUSTER000001: Initializing mod_cluster version 1.4.5.Final-redhat-00001
2026-10-29 10:16:03,655 INFO  [org.jboss.modcluster] (ServerService Thread Pool -- 76) MODCLUSTER000032: Listening to proxy advertisements on /224.0.1.105:23364
2026-10-29 10:16:03,730 INFO  [org.jboss.as.ejb3] (MSC service thread 1-4) WFLYEJB0493: Suspensão completa do subsistema de Jakarta Enterprise Beans
2026-10-29 10:16:03,777 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-2) WFLYJCA0001: Fonte de dados vinculada[java:jboss/datasources/SIGSJ04]
2026-10-29 10:16:03,780 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-4) WFLYJCA0001: Fonte de dados vinculada[java:jboss/datasources/ExampleDS]
2026-10-29 10:16:03,806 INFO  [org.jboss.as.patching] (MSC service thread 1-4) WFLYPAT0050: A ID de patch cumulativo de JBoss EAP é jboss-eap-7.4.18.CP, os patches únicos incluem: none
2026-10-29 10:16:03,834 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-2) WFLYDS0013: Foi iniciado FileSystemDeploymentService para o diretório /opt/jboss-eap/standalone/deployments
2026-10-29 10:16:03,849 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0027: Iniciando a implantação do "sigsj_intranet-ear.ear" (runtime-name: "sigsj_intranet-ear.ear")
2026-10-29 10:16:03,856 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0027: Iniciando a implantação do "ojdbc8.jar" (runtime-name: "ojdbc8.jar")
2026-10-29 10:16:03,907 INFO  [org.jboss.ws.common.management] (MSC service thread 1-1) JBWS022052: Starting JBossWS 5.4.9.Final-redhat-00001 (Apache CXF 3.5.8.redhat-00001) 
2026-10-29 10:16:03,924 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 76) AMQ221000: live Message Broker is starting with configuration Broker Configuration (clustered=false,journalDirectory=/opt/jboss-eap/standalone/data/activemq/journal,bindingsDirectory=/opt/jboss-eap/standalone/data/activemq/bindings,largeMessagesDirectory=/opt/jboss-eap/standalone/data/activemq/largemessages,pagingDirectory=/opt/jboss-eap/standalone/data/activemq/paging)
2026-10-29 10:16:03,970 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 76) AMQ221012: Using AIO Journal
2026-10-29 10:16:04,095 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 76) AMQ221043: Protocol module found: [artemis-server]. Adding protocol support for: CORE
2026-10-29 10:16:04,095 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 76) AMQ221043: Protocol module found: [artemis-hornetq-protocol]. Adding protocol support for: HORNETQ
2026-10-29 10:16:04,207 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 76) AMQ221034: Waiting indefinitely to obtain live lock
2026-10-29 10:16:04,207 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 76) AMQ221035: Live Server Obtained live lock
2026-10-29 10:16:04,684 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 76) AMQ221003: Deploying ANYCAST queue jms.queue.ExpiryQueue on address jms.queue.ExpiryQueue
2026-10-29 10:16:04,687 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 76) AMQ221003: Deploying ANYCAST queue jms.queue.DLQ on address jms.queue.DLQ
2026-10-29 10:16:04,699 INFO  [org.wildfly.extension.messaging-activemq] (MSC service thread 1-1) WFLYMSGAMQ0016: Atualização HTTP registrada para protocolo activemq-remoting manipulado pelo aceitador http-acceptor
2026-10-29 10:16:04,699 INFO  [org.wildfly.extension.messaging-activemq] (MSC service thread 1-3) WFLYMSGAMQ0016: Atualização HTTP registrada para protocolo activemq-remoting manipulado pelo aceitador http-acceptor
2026-10-29 10:16:04,700 INFO  [org.wildfly.extension.messaging-activemq] (MSC service thread 1-1) WFLYMSGAMQ0016: Atualização HTTP registrada para protocolo activemq-remoting manipulado pelo aceitador http-acceptor-throughput
2026-10-29 10:16:04,700 INFO  [org.wildfly.extension.messaging-activemq] (MSC service thread 1-1) WFLYMSGAMQ0016: Atualização HTTP registrada para protocolo activemq-remoting manipulado pelo aceitador http-acceptor-throughput
2026-10-29 10:16:04,847 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 76) AMQ221007: Server is now live
2026-10-29 10:16:04,847 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 76) AMQ221001: Apache ActiveMQ Artemis Message Broker version 2.16.0.redhat-00052 [default, nodeID=8c98d7d4-094e-11ee-abda-00505682f3d2] 
2026-10-29 10:16:04,869 WARN  [org.apache.activemq.artemis.jms.server] (ServerService Thread Pool -- 77) AMQ122005: Invalid "host" value "0.0.0.0" detected for "http-connector" connector. Switching to "caddeapllx955.agil.nprd.caixa.gov.br". If this new address is incorrect please manually configure the connector to use the proper one.
2026-10-29 10:16:04,881 INFO  [org.wildfly.extension.messaging-activemq] (ServerService Thread Pool -- 77) WFLYMSGAMQ0002: Objeto de mensagem vinculado ao nome jndi java:jboss/exported/jms/RemoteConnectionFactory
2026-10-29 10:16:04,882 INFO  [org.wildfly.extension.messaging-activemq] (ServerService Thread Pool -- 78) WFLYMSGAMQ0002: Objeto de mensagem vinculado ao nome jndi java:/ConnectionFactory
2026-10-29 10:16:04,951 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-3) WFLYJCA0007: Criação de conexão registrada java:/JmsXA
2026-10-29 10:16:04,961 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0059: A entrada do caminho da classe oraclepki.jar em /content/ojdbc8.jar não direciona a um jar válido para a referência do caminho da classe.
2026-10-29 10:16:05,017 INFO  [org.apache.activemq.artemis.ra] (MSC service thread 1-3) AMQ151007: Resource adaptor started
2026-10-29 10:16:05,017 INFO  [org.jboss.as.connector.services.resourceadapters.ResourceAdapterActivatorService$ResourceAdapterActivator] (MSC service thread 1-3) IJ020002: Deployed: file://RaActivatoractivemq-ra
2026-10-29 10:16:05,023 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-3) WFLYJCA0002: Conectores de Jakarta vinculados ConnectionFactory [java:/JmsXA]
2026-10-29 10:16:05,025 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-3) WFLYJCA0118: Vínculo de criação de conexão chamado java:/JmsXA para o alias java:jboss/DefaultJMSConnectionFactory
2026-10-29 10:16:05,467 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0207: Iniciando a subimplantação (runtime-name: "sigsj_intranet.war")
2026-10-29 10:16:05,467 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0207: Iniciando a subimplantação (runtime-name: "sirotcon-ejb-2.3.0.1-farm.jar")
2026-10-29 10:16:05,467 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0207: Iniciando a subimplantação (runtime-name: "sigsjintrastatic.war")
2026-10-29 10:16:05,474 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0001: /content/sigsj_intranet-ear.ear/sirotcon-ejb-2.3.0.1-farm.jar/META-INF/jboss-deployment-structure.xml na subimplantação ignorado. O jboss-deployment-structure.xml só é analisado para implantações de nível superior.
2026-10-29 10:16:05,490 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-4) WFLYJCA0004: Implantação do driver compatível-JDBC class oracle.jdbc.OracleDriver (versão 23.26)
2026-10-29 10:16:05,509 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-2) WFLYJCA0018: Serviço de driver iniciado com nome-do-driver = ojdbc8.jar
2026-10-29 10:16:05,910 INFO  [org.infinispan.CONTAINER] (ServerService Thread Pool -- 77) ISPN000128: Infinispan version: Infinispan 'Corona Extra' 11.0.19.Final-redhat-00001
2026-10-29 10:16:05,942 INFO  [org.infinispan.CONFIG] (MSC service thread 1-4) ISPN000152: Passivation configured without an eviction policy being selected. Only manually evicted entities will be passivated.
2026-10-29 10:16:05,943 INFO  [org.infinispan.CONFIG] (MSC service thread 1-4) ISPN000152: Passivation configured without an eviction policy being selected. Only manually evicted entities will be passivated.
2026-10-29 10:16:06,002 INFO  [org.infinispan.PERSISTENCE] (ServerService Thread Pool -- 77) ISPN000556: Starting user marshaller 'org.wildfly.clustering.infinispan.spi.marshalling.InfinispanProtoStreamMarshaller'
2026-10-29 10:16:06,176 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 77) WFLYCLINF0002: Cache http-remoting-connector inicializado a partir do recipiente ejb
2026-10-29 10:16:08,312 INFO  [org.jboss.weld.deployer] (MSC service thread 1-2) WFLYWELD0003: Processando da implantação weld sigsj_intranet-ear.ear
2026-10-29 10:16:08,376 INFO  [org.hibernate.validator.internal.util.Version] (MSC service thread 1-2) HV000001: Hibernate Validator 6.0.23.Final-redhat-00001
2026-10-29 10:16:08,473 INFO  [org.jboss.weld.deployer] (MSC service thread 1-4) WFLYWELD0003: Processando da implantação weld sigsjintrastatic.war
2026-10-29 10:16:08,519 INFO  [org.jboss.weld.deployer] (MSC service thread 1-3) WFLYWELD0003: Processando da implantação weld sirotcon-ejb-2.3.0.1-farm.jar
2026-10-29 10:16:08,526 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SIROTConBean' na unidade de implementação 'subdeployment "sirotcon-ejb-2.3.0.1-farm.jar" of deployment "sigsj_intranet-ear.ear"' são como segue:

	java:global/sigsj_intranet-ear/sirotcon-ejb-2.3.0.1-farm/SIROTConBean!br.gov.caixa.sirot.ejb.SIROTCon
	java:app/sirotcon-ejb-2.3.0.1-farm/SIROTConBean!br.gov.caixa.sirot.ejb.SIROTCon
	java:module/SIROTConBean!br.gov.caixa.sirot.ejb.SIROTCon
	java:jboss/exported/sigsj_intranet-ear/sirotcon-ejb-2.3.0.1-farm/SIROTConBean!br.gov.caixa.sirot.ejb.SIROTCon
	ejb:sigsj_intranet-ear/sirotcon-ejb-2.3.0.1-farm/SIROTConBean!br.gov.caixa.sirot.ejb.SIROTCon
	java:global/sigsj_intranet-ear/sirotcon-ejb-2.3.0.1-farm/SIROTConBean
	java:app/sirotcon-ejb-2.3.0.1-farm/SIROTConBean
	java:module/SIROTConBean

2026-10-29 10:16:08,874 INFO  [org.jboss.weld.deployer] (MSC service thread 1-1) WFLYWELD0003: Processando da implantação weld sigsj_intranet.war
2026-10-29 10:16:08,975 INFO  [org.jboss.weld.Version] (MSC service thread 1-3) WELD-000900: 3.1.10 (redhat)
2026-10-29 10:16:09,086 WARN  [org.jboss.as.ee] (MSC service thread 1-2) WFLYEE0007: Nenhuma instalação do componente opcional org.springframework.http.server.ServletServerHttpAsyncRequestControl devido à uma exceção (habilite o nível do log DEPURAR para verificar a causa)
2026-10-29 10:16:09,087 WARN  [org.jboss.as.ee] (MSC service thread 1-2) WFLYEE0007: Nenhuma instalação do componente opcional org.springframework.web.context.request.async.StandardServletAsyncWebRequest devido à uma exceção (habilite o nível do log DEPURAR para verificar a causa)
2026-10-29 10:16:09,088 WARN  [org.jboss.as.ee] (MSC service thread 1-2) WFLYEE0007: Nenhuma instalação do componente opcional render-kit-factory.org.ajax4jsf.renderkit.ChameleonRenderKitFactory devido à uma exceção (habilite o nível do log DEPURAR para verificar a causa)
2026-10-29 10:16:09,092 WARN  [org.jboss.as.ee] (MSC service thread 1-2) WFLYEE0007: Nenhuma instalação do componente opcional state-manager.org.ajax4jsf.application.AjaxStateManager devido à uma exceção (habilite o nível do log DEPURAR para verificar a causa)
2026-10-29 10:16:09,101 WARN  [org.jboss.as.ee] (MSC service thread 1-2) WFLYEE0007: Nenhuma instalação do componente opcional view-handler.com.sun.facelets.FaceletViewHandler devido à uma exceção (habilite o nível do log DEPURAR para verificar a causa)
2026-10-29 10:16:09,157 WARN  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-2) WFLYJCA0003: Não foi possível instanciar a classe do driver "org.olap4j.driver.xmla.XmlaOlap4jDriver": java.lang.NoSuchMethodException: org.olap4j.driver.xmla.XmlaOlap4jDriver.<init>()
2026-10-29 10:16:10,107 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 87) WFLYUT0021: Contexto web registrado: '/sigsjintrastatic' para servidor 'default-server'
2026-10-29 10:16:10,147 INFO  [javax.enterprise.resource.webcontainer.jsf.config] (ServerService Thread Pool -- 119) Initializing Mojarra (1.2_15-20100816-SNAPSHOT) for context '/sigsj_intranet'
2026-10-29 10:16:10,507 INFO  [javax.enterprise.resource.webcontainer.jsf.application] (ServerService Thread Pool -- 119) JSF1048: PostConstruct/PreDestroy annotations present.  ManagedBeans methods marked with these annotations will have said annotations processed.
2026-10-29 10:16:10,708 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 119) WFLYUT0021: Contexto web registrado: '/sigsj_intranet' para servidor 'default-server'
2026-10-29 10:16:10,772 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 44) WFLYSRV0010: "sigsj_intranet-ear.ear" foi implantado (runtime-name: "sigsj_intranet-ear.ear")
2026-10-29 10:16:10,773 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 44) WFLYSRV0010: "ojdbc8.jar" foi implantado (runtime-name: "ojdbc8.jar")
2026-10-29 10:16:10,797 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Retomando servidor 
2026-10-29 10:16:10,799 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001) iniciado em 10066ms - Iniciado(s) 2220 de serviços 2423 (os serviços 377 estão lentos, passivos ou sob demanda)
2026-10-29 10:16:10,801 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0060: A interface de gerenciamento http escutando em http://0.0.0.0:9990/management
2026-10-29 10:16:10,801 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0051: O console de administração escutando em http://0.0.0.0:9990
2026-10-29 10:16:13,663 ERROR [org.jboss.modcluster] (UndertowEventHandlerAdapterService - 1) MODCLUSTER000043: Failed to send INFO command to localhost/127.0.0.1:6666: Conexão recusada (Connection refused)



<img width="1907" height="1000" alt="image" src="https://github.com/user-attachments/assets/c4ed2ade-4f07-4690-87e8-1e9c4ee5e659" />


Gisele Cristina Dias adicionou Marcio Aparecido Sitoni e Jesse Mouta Pereira Batista ao chat.

 
09:41 Chamada iniciada

 
standalone-full-ha.xml
 
Jesse Mouta Pereira Batista adicionou Thiago Jeferson de Sousa Silva ao chat.

 
https://sigsj-intranet.esteiras.des.caixa/sigsj_intranet
 
https://logesteirasageis.nprd.caixa/
 
server 7.log
 
10:27 Chamada encerrada 48min 46s 

 
Thiago Jeferson de Sousa Silva No log que enviou vi apenas o erro do mod_cluster (MODCLUSTER000043) e não consegui identificar a causa da página retornada pela URL. Conseguem me enviar o trecho do log exatamente no momento em que a URL é acessada e confirmar se a requisição está chegando ao JBoss?
 
Thiago Jeferson de Sousa Silva adicionou Evandro Alves de Souza ao chat e compartilhou todo o histórico de chats.

 
Gisele Cristina Dias, em conversa com o Evandro Alves de Souza, identificamos que a URL está sendo direcionada para um VIP do OKD. Podemos nos reunir mais tarde para tratar sobre essa questão? Para ver se iremos precisar de um VIP exclusivo. 
 
Jesse Mouta Pereira Batista PC 
 

