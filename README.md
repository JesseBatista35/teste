-sh-4.2$ ls -la --time-style=+%H:%M /logs/jboss/jboss-eap/standalone/sigpd-backend/console-stdout.log
-rw-r--r-- 1 jboss jboss 376265 15:21 /logs/jboss/jboss-eap/standalone/sigpd-backend/console-stdout.log
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep -c '"default task' /logs/jboss/jboss-eap/standalone/sigpd-backend/console-stdout.log
27
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ systemctl status 8867 | head -3
]● jboss-eap-standalone.service - JBoss EAP Systemctl - STANDALONE
   Loaded: loaded (/etc/systemd/system/jboss-eap-standalone.service; enabled; vendor preset: disabled)
   Active: active (running) since Qua 2026-10-14 13:41:25 -03; 5 days ago
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ cp /logs/jboss/jboss-eap/standalone/sigpd-backend/console-stdout.log /tmp/sigpd_threaddump_$(date +%Y%m%d_%H%M).log
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep -A10 '"default task' /tmp/sigpd_threaddump_*.log | grep -E "^\s+at " | sort | uniq -c | sort -rn | head -15
     27         at sun.misc.Unsafe.park(Native Method)
     27         at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
     27         at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
     27         at java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1074)
     27         at java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
     27         at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2039)
     27         at java.util.concurrent.LinkedBlockingQueue.take(LinkedBlockingQueue.java:442)
     27         at java.lang.Thread.run(Thread.java:748)
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ sudo su -
Último login:Seg Out 19 15:18:24 -03 2026em pts/1
[root@caddeapllx929 ~]# runuser -u jboss -- /usr/java/jdk1.8.0_221/bin/jcmd 8867 GC.class_histogram > /tmp/sigpd_histo.txt; head -30 /tmp/sigpd_histo.txt
com.sun.tools.attach.AttachNotSupportedException: Unable to open socket file: target process not responding or HotSpot VM not loaded
        at sun.tools.attach.LinuxVirtualMachine.<init>(LinuxVirtualMachine.java:106)
        at sun.tools.attach.LinuxAttachProvider.attachVirtualMachine(LinuxAttachProvider.java:63)
        at com.sun.tools.attach.VirtualMachine.attach(VirtualMachine.java:208)
        at sun.tools.jcmd.JCmd.executeCommandForPid(JCmd.java:147)
        at sun.tools.jcmd.JCmd.main(JCmd.java:131)
8867:
[root@caddeapllx929 ~]# systemctl restart jboss-eap-standalone
[root@caddeapllx929 ~]# systemctl status jboss-eap-standalone | head -5
● jboss-eap-standalone.service - JBoss EAP Systemctl - STANDALONE
   Loaded: loaded (/etc/systemd/system/jboss-eap-standalone.service; enabled; vendor preset: disabled)
   Active: active (running) since Seg 2026-10-19 15:27:05 -03; 17s ago
  Process: 113079 ExecStop=/opt/jboss/jboss-eap/bin/init.d/jboss-eap-standalone.sh stop (code=exited, status=0/SUCCESS)
  Process: 113124 ExecStart=/opt/jboss/jboss-eap/bin/init.d/jboss-eap-standalone.sh start (code=exited, status=0/SUCCESS)
[root@caddeapllx929 ~]#
[root@caddeapllx929 ~]#
[root@caddeapllx929 ~]#
[root@caddeapllx929 ~]#
[root@caddeapllx929 ~]#
[root@caddeapllx929 ~]# tail -f /logs/jboss/jboss-eap/standalone/sigpd-backend/server.log    # aguarde o "WFLYSRV0025 ... started"
2026-10-19 14:27:21,806 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-3) 1.2 - ##### MultiTenancyConfigResolver->RealmCache.getDefaultKeycloakDeploymentConfig()
2026-10-19 14:27:21,806 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-3) 1 - ##### MultiTenancyConfigResolver->resolve
2026-10-19 14:27:21,806 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-3) 1.2 - ##### MultiTenancyConfigResolver->RealmCache.getDefaultKeycloakDeploymentConfig()
2026-10-19 14:27:25,540 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-26) 1 - ##### MultiTenancyConfigResolver->resolve
2026-10-19 14:27:25,540 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-26) 1.2 - ##### MultiTenancyConfigResolver->RealmCache.getDefaultKeycloakDeploymentConfig()
2026-10-19 14:27:25,540 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-26) 1 - ##### MultiTenancyConfigResolver->resolve
2026-10-19 14:27:25,540 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-26) 1.2 - ##### MultiTenancyConfigResolver->RealmCache.getDefaultKeycloakDeploymentConfig()
2026-10-19 15:27:28,676 INFO  [org.jboss.modules] (main) JBoss Modules version 1.6.7.Final-redhat-00001
2026-10-19 15:27:29,592 INFO  [org.jboss.msc] (main) JBoss MSC version 1.2.7.SP1-redhat-1
2026-10-19 15:27:29,963 INFO  [org.jboss.as] (MSC service thread 1-1) WFLYSRV0049: Iniciando JBoss EAP 7.1.6.GA (WildFly Core 3.0.21.Final-redhat-00001)
2026-10-19 15:27:32,463 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: O atributo 'security-realm' no recurso no endereço '/core-service=management/management-interface=http-interface' está  preterido e pode ser removido em uma versão futura. Veja a descrição de atributo no resultado da operação  read-resource-description para aprender mais sobre a  depreciação.
2026-10-19 15:27:32,516 INFO  [org.wildfly.security] (ServerService Thread Pool -- 17) ELY00001: WildFly Elytron version 1.1.12.Final-redhat-00001
2026-10-19 15:27:32,520 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 35) WFLYCTL0028: O atributo 'security-realm' no recurso no endereço '/subsystem=undertow/server=default-server/https-listener=https' está  preterido e pode ser removido em uma versão futura. Veja a descrição de atributo no resultado da operação  read-resource-description para aprender mais sobre a  depreciação.
2026-10-19 15:27:34,058 INFO  [org.jboss.security] (Controller Boot Thread) PBOX00361: Default Security Vault Implementation Initialized and Ready
2026-10-19 15:27:34,082 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Criação de serviço de gerenciamento http usando o socket-binding (management-http)
2026-10-19 15:27:34,122 INFO  [org.xnio] (MSC service thread 1-2) XNIO version 3.5.6.Final-redhat-00001
2026-10-19 15:27:34,142 INFO  [org.xnio.nio] (MSC service thread 1-2) XNIO NIO Implementation Version 3.5.6.Final-redhat-00001
2026-10-19 15:27:34,214 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 49) WFLYCLINF0001: Ativação do subsistema Infinispan.
2026-10-19 15:27:34,220 INFO  [org.wildfly.iiop.openjdk] (ServerService Thread Pool -- 50) WFLYIIOP0001: Ativação de subsistema IIOP
2026-10-19 15:27:34,247 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 62) WFLYNAM0001: Ativação do Subsistema de Nomeação
2026-10-19 15:27:34,311 INFO  [org.jboss.as.security] (ServerService Thread Pool -- 69) WFLYSEC0002: Ativação do Subsistema de Segurança
2026-10-19 15:27:34,331 INFO  [org.jboss.as.webservices] (ServerService Thread Pool -- 73) WFLYWS0002: Ativação da Extensão WebServices
2026-10-19 15:27:34,238 INFO  [org.jboss.as.jsf] (ServerService Thread Pool -- 57) WFLYJSF0007: As seguintes implantações JSF foram ativadas: [main]
2026-10-19 15:27:34,319 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 71) WFLYTX0013: O atributo node-identifier em /subsystem=transactions está definido com o valor padrão. Isso é perigoso para ambientes executando vários servidores. Certifique-se de que o valor do atributo é exclusivo.
2026-10-19 15:27:34,401 INFO  [org.jboss.as.clustering.jgroups] (ServerService Thread Pool -- 54) WFLYCLJG0001: Ativação do subsistema JGroups. Versão do JGroups 3.6.14
2026-10-19 15:27:34,495 INFO  [org.jboss.remoting] (MSC service thread 1-2) JBoss Remoting version 5.0.8.Final-redhat-1
2026-10-19 15:27:34,486 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 51) WFLYRS0016: RESTEasy versão 3.0.26.Final-redhat-1
2026-10-19 15:27:34,495 INFO  [org.jboss.as.security] (MSC service thread 1-1) WFLYSEC0001: Versão =5.0.3.Final-redhat-3 PicketBox Atual
2026-10-19 15:27:34,548 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 48) WFLYIO001: O trabalhador 'default' auto configurou threads essenciais 4 com  threads de tarefas 32 baseado em seus 2  disponíveis processadores.
2026-10-19 15:27:34,617 INFO  [org.jboss.as.connector] (MSC service thread 1-1) WFLYJCA0009: Inicialização JCA do Subsistema (WildFly/IronJacamar 1.4.12.Final-redhat-00001)
2026-10-19 15:27:34,579 INFO  [org.jboss.as.naming] (MSC service thread 1-2) WFLYNAM0003: Iniciando o Serviço de Nomeação
2026-10-19 15:27:34,743 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 43) WFLYJCA0004: Implantação do driver compatível-JDBC class oracle.jdbc.OracleDriver (versão 11.2)
2026-10-19 15:27:34,761 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0003: Iniciando 1.4.18.SP11-redhat-00001 Undertow
2026-10-19 15:27:34,830 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-2) WFLYJCA0018: Serviço de driver iniciado com driver-name = oracle
2026-10-19 15:27:34,898 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-2) WFLYMAIL0001: Sessão de correio limitado [java:jboss/mail/Default]
2026-10-19 15:27:34,970 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 43) WFLYJCA0004: Implantação do driver compatível-JDBC class org.h2.Driver (versão 1.4)
2026-10-19 15:27:35,055 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-2) WFLYJCA0018: Serviço de driver iniciado com driver-name = h2
2026-10-19 15:27:35,087 INFO  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0481: O pool estrito slsb-strict-max-pool está utilizando um tamanho de instância máximo de 32 (por classe) que é derivado do tamanho de pool do thead de trabalho.
2026-10-19 15:27:35,087 INFO  [org.jboss.as.ejb3] (MSC service thread 1-1) WFLYEJB0482: O  pool estrito mdb-strict-max-pool está utilizando um tamanho de instância máximo de 8 (por classe) que é derivado do número de CPUs neste host.
2026-10-19 15:27:35,511 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 72) WFLYUT0014: Criando manipulador de arquivo para caminho de acesso '/opt/jboss/jboss-eap/welcome-content' com as opções [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
2026-10-19 15:27:35,738 INFO  [org.jboss.as.connector.subsystems.datasources.AbstractDataSourceService$AS7DataSourceDeployer] (MSC service thread 1-4) IJ020018: Enabling <validate-on-match> for java:/jdbc/OracleSigpdDS
2026-10-19 15:27:36,027 INFO  [org.wildfly.iiop.openjdk] (MSC service thread 1-2) WFLYIIOP0009: Serviço CORBA ORB  iniciado
2026-10-19 15:27:36,031 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-4) WFLYJCA0098: Fonte de dados não transacional vinculada: java:/jdbc/OracleSigpdDS
2026-10-19 15:27:36,069 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0012: O servidor default-server foi iniciado.
2026-10-19 15:27:36,094 INFO  [org.jboss.as.patching] (MSC service thread 1-4) WFLYPAT0050: O ID de patch cumulativo de JBoss EAP é : jboss-eap-7.1.6.CP, os patches únicos incluem: eap-716-jbeap-16502
2026-10-19 15:27:36,127 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0018: Iniciando host default-host
2026-10-19 15:27:36,198 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0006: Ouvinte  AJP Undertow ajp escutando em  10.116.194.156:8009
2026-10-19 15:27:36,203 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0006: Ouvinte  HTTP Undertow default escutando em  10.116.194.156:8080
2026-10-19 15:27:36,251 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-4) WFLYDS0013: Foi iniciado o FileSystemDeploymentService para o diretório /opt/jboss/jboss-eap/standalone/deployments
2026-10-19 15:27:36,287 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0027: Iniciando a implantação do "wmq.jmsra.rar" (runtime-name: "wmq.jmsra.rar")
2026-10-19 15:27:36,287 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0027: Iniciando a implantação do "sigpd-ear.ear" (runtime-name: "sigpd-ear.ear")
2026-10-19 15:27:36,290 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0027: Iniciando a implantação do "applicationinsights-agent.jar" (runtime-name: "applicationinsights-agent.jar")
2026-10-19 15:27:36,423 INFO  [org.jboss.modcluster] (ServerService Thread Pool -- 76) MODCLUSTER000001: Initializing mod_cluster version 1.3.10.Final-redhat-1
2026-10-19 15:27:36,448 INFO  [org.jboss.modcluster] (ServerService Thread Pool -- 76) MODCLUSTER000032: Listening to proxy advertisements on /224.0.1.105:23364
2026-10-19 15:27:36,807 INFO  [org.jboss.as.ejb3] (MSC service thread 1-4) WFLYEJB0493: Suspensão do subsistema EJB concluída
2026-10-19 15:27:36,876 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0006: Ouvinte  HTTPS Undertow https escutando em  10.116.194.156:8443
2026-10-19 15:27:37,631 INFO  [org.jboss.ws.common.management] (MSC service thread 1-4) JBWS022052: Starting JBossWS 5.1.11.Final-redhat-00001 (Apache CXF 3.1.16.redhat-2)
2026-10-19 15:27:40,295 INFO  [org.jboss.as.connector.deployers.RADeployer] (MSC service thread 1-1) IJ020001: Required license terms for file:/opt/jboss/jboss-eap/standalone/tmp/vfs/temp/temp22f2fb4e27605970/content-7690f2ece9be0947/contents/
2026-10-19 15:27:40,933 WARN  [org.jboss.as.connector.deployers.RADeployer] (MSC service thread 1-1) IJ020017: Invalid archive: file:/opt/jboss/jboss-eap/standalone/tmp/vfs/temp/temp22f2fb4e27605970/content-7690f2ece9be0947/contents/
2026-10-19 15:27:40,949 INFO  [org.jboss.as.connector.deployers.RaXmlDeployer] (MSC service thread 1-1) IJ020001: Required license terms for file:/opt/jboss/jboss-eap/standalone/tmp/vfs/temp/temp22f2fb4e27605970/content-7690f2ece9be0947/contents/
2026-10-19 15:27:40,975 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-1) WFLYJCA0007: Fábrica de conexão registrada java:jboss/jms/SigpdConnectionFactory
2026-10-19 15:27:41,257 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-1) WFLYJCA0006: Objeto de admin registrado no java:jboss/jms/SIGPD.REQ.SRVCO_LOG
2026-10-19 15:27:41,261 WARN  [org.jboss.as.connector.deployers.RaXmlDeployer] (MSC service thread 1-1) IJ020017: Invalid archive: file:/opt/jboss/jboss-eap/standalone/tmp/vfs/temp/temp22f2fb4e27605970/content-7690f2ece9be0947/contents/
2026-10-19 15:27:41,358 INFO  [org.hibernate.validator.internal.util.Version] (MSC service thread 1-1) HV000001: Hibernate Validator 5.3.5.Final-redhat-2
2026-10-19 15:27:41,867 INFO  [org.jboss.as.connector.deployers.RaXmlDeployer] (MSC service thread 1-1) IJ020002: Deployed: file:/opt/jboss/jboss-eap/standalone/tmp/vfs/temp/temp22f2fb4e27605970/content-7690f2ece9be0947/contents/
2026-10-19 15:27:42,083 INFO  [org.infinispan.remoting.transport.jgroups.JGroupsTransport] (MSC service thread 1-4) ISPN000078: Starting JGroups channel ejb
2026-10-19 15:27:42,097 INFO  [org.infinispan.remoting.transport.jgroups.JGroupsTransport] (MSC service thread 1-2) ISPN000078: Starting JGroups channel ejb
2026-10-19 15:27:42,097 INFO  [org.infinispan.remoting.transport.jgroups.JGroupsTransport] (MSC service thread 1-1) ISPN000078: Starting JGroups channel ejb
2026-10-19 15:27:42,113 INFO  [org.infinispan.remoting.transport.jgroups.JGroupsTransport] (MSC service thread 1-2) ISPN000094: Received new cluster view for channel ejb: [caddeapllx929|0] (1) [caddeapllx929]
2026-10-19 15:27:42,116 INFO  [org.infinispan.remoting.transport.jgroups.JGroupsTransport] (MSC service thread 1-1) ISPN000094: Received new cluster view for channel ejb: [caddeapllx929|0] (1) [caddeapllx929]
2026-10-19 15:27:42,113 INFO  [org.infinispan.remoting.transport.jgroups.JGroupsTransport] (MSC service thread 1-4) ISPN000094: Received new cluster view for channel ejb: [caddeapllx929|0] (1) [caddeapllx929]
2026-10-19 15:27:42,163 INFO  [org.infinispan.remoting.transport.jgroups.JGroupsTransport] (MSC service thread 1-2) ISPN000079: Channel ejb local address is caddeapllx929, physical addresses are [10.116.194.156:7600]
2026-10-19 15:27:42,167 INFO  [org.infinispan.remoting.transport.jgroups.JGroupsTransport] (MSC service thread 1-4) ISPN000079: Channel ejb local address is caddeapllx929, physical addresses are [10.116.194.156:7600]
2026-10-19 15:27:42,167 INFO  [org.infinispan.remoting.transport.jgroups.JGroupsTransport] (MSC service thread 1-1) ISPN000079: Channel ejb local address is caddeapllx929, physical addresses are [10.116.194.156:7600]
2026-10-19 15:27:42,194 INFO  [org.infinispan.remoting.transport.jgroups.JGroupsTransport] (MSC service thread 1-3) ISPN000078: Starting JGroups channel ejb
2026-10-19 15:27:42,194 INFO  [org.infinispan.remoting.transport.jgroups.JGroupsTransport] (MSC service thread 1-3) ISPN000094: Received new cluster view for channel ejb: [caddeapllx929|0] (1) [caddeapllx929]
2026-10-19 15:27:42,194 INFO  [org.infinispan.remoting.transport.jgroups.JGroupsTransport] (MSC service thread 1-3) ISPN000079: Channel ejb local address is caddeapllx929, physical addresses are [10.116.194.156:7600]
2026-10-19 15:27:42,195 INFO  [org.infinispan.factories.GlobalComponentRegistry] (MSC service thread 1-2) ISPN000128: Infinispan version: Infinispan 'Chakra' 8.2.11.Final-redhat-1
2026-10-19 15:27:42,231 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0207: Inciando a subimplantação (runtime-name: "br.gov.caixa.sigpd.batch-sigpd-batch-3.7.0.0-SNAPSHOT.jar")
2026-10-19 15:27:42,238 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0207: Inciando a subimplantação (runtime-name: "br.gov.caixa.sigpd.api-sigpd-api-3.7.0.0-SNAPSHOT.war")
2026-10-19 15:27:42,269 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-1) WFLYJCA0002: Limite JCA AdminObject [java:jboss/jms/SIGPD.REQ.SRVCO_LOG]
2026-10-19 15:27:42,269 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-1) WFLYJCA0002: Limite JCA ConnectionFactory [java:jboss/jms/SigpdConnectionFactory]
2026-10-19 15:27:42,326 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 76) AMQ221000: live Message Broker is starting with configuration Broker Configuration (clustered=true,journalDirectory=/opt/jboss/jboss-eap/standalone/data/activemq/journal,bindingsDirectory=/opt/jboss/jboss-eap/standalone/data/activemq/bindings,largeMessagesDirectory=/opt/jboss/jboss-eap/standalone/data/activemq/largemessages,pagingDirectory=/opt/jboss/jboss-eap/standalone/data/activemq/pagin



2026-10-19 15:28:27,726 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 25) Executando método negocial inativa
2026-10-19 15:28:27,726 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 25) Inicio inativação de Conjuntos Tratamento.
2026-10-19 15:28:27,726 INFO  [br.gov.caixa.sigpd.api.commons.utils.JsonUtil] (default-threads - 25) Desserialização de json para InativacaoConjuntoTO realizada com sucesso
2026-10-19 15:28:27,726 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 25) InativacaoConjuntoTO desserializado: InativacaoConjuntoTO(idsVencidos=[1451], idsCancelados=[], trilhaAuditoria=null)
2026-10-19 15:28:27,726 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 25) TrilhaAuditoria recebida: null
2026-10-19 15:28:27,790 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 19) Tentando gravar trilha com objeto: null
2026-10-19 15:28:27,790 SEVERE [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 19) ATENÇÃO: TrilhaAuditoria é NULL!
2026-10-19 15:28:27,790 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.ConjuntoServiceHelperImpl] (default-threads - 19) gravaTrilha chamado com: null
2026-10-19 15:28:27,790 SEVERE [br.gov.caixa.sigpd.api.conjuntos.services.impl.ConjuntoServiceHelperImpl] (default-threads - 19) ERRO: TrilhaAuditoria nula ao chegar em gravaTrilha!
2026-10-19 15:28:27,790 INFO  [br.gov.caixa.sigpd.api.trilha_auditoria.services.impl.TrilhaAuditoriaServiceImpl] (default-threads - 19) TrilhaAuditoriaServiceImpl.insert() chamado com: null
2026-10-19 15:28:27,790 SEVERE [br.gov.caixa.sigpd.api.trilha_auditoria.services.impl.TrilhaAuditoriaServiceImpl] (default-threads - 19) ERRO CRÍTICO: entidade é NULL!
2026-10-19 15:28:27,790 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 14) Tentando gravar trilha com objeto: null
2026-10-19 15:28:27,790 SEVERE [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 14) ATENÇÃO: TrilhaAuditoria é NULL!
2026-10-19 15:28:27,790 SEVERE [br.gov.caixa.sigpd.api.conjuntos.services.impl.ConjuntoServiceHelperImpl] (default-threads - 19) Erro ao gravar trilha de auditoriabr.gov.caixa.sigpd.api.commons.exceptions.NegocioException: TrilhaAuditoria não pode ser nula
2026-10-19 15:28:27,790 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.ConjuntoServiceHelperImpl] (default-threads - 14) gravaTrilha chamado com: null
2026-10-19 15:28:27,790 SEVERE [br.gov.caixa.sigpd.api.conjuntos.services.impl.ConjuntoServiceHelperImpl] (default-threads - 14) ERRO: TrilhaAuditoria nula ao chegar em gravaTrilha!
2026-10-19 15:28:27,790 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 19) Fim inativação de Conjuntos Tratamento.
2026-10-19 15:28:27,790 INFO  [br.gov.caixa.sigpd.api.trilha_auditoria.services.impl.TrilhaAuditoriaServiceImpl] (default-threads - 14) TrilhaAuditoriaServiceImpl.insert() chamado com: null
2026-10-19 15:28:27,790 SEVERE [br.gov.caixa.sigpd.api.trilha_auditoria.services.impl.TrilhaAuditoriaServiceImpl] (default-threads - 14) ERRO CRÍTICO: entidade é NULL!
2026-10-19 15:28:27,790 SEVERE [br.gov.caixa.sigpd.api.conjuntos.services.impl.ConjuntoServiceHelperImpl] (default-threads - 14) Erro ao gravar trilha de auditoriabr.gov.caixa.sigpd.api.commons.exceptions.NegocioException: TrilhaAuditoria não pode ser nula
2026-10-19 15:28:27,790 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 14) Fim inativação de Conjuntos Tratamento.
2026-10-19 15:28:27,795 INFO  [org.jboss.as.connector.deployers.RaXmlDeployer] (default-threads - 19) wmq.jmsra.rar: MQJCA4026:A transação foi desfeita pelo motivo: 'O método 'xa_end' falhou com errorCode '100'.'.
2026-10-19 15:28:27,798 INFO  [org.jboss.as.connector.deployers.RaXmlDeployer] (default-threads - 14) wmq.jmsra.rar: MQJCA4026:A transação foi desfeita pelo motivo: 'O método 'xa_end' falhou com errorCode '100'.'.
2026-10-19 15:28:27,798 WARN  [com.arjuna.ats.jta] (default-threads - 19) ARJUNA016045: attempted rollback of < formatId=131077, gtrid_length=29, bqual_length=36, tx_uid=0:ffff0a74c29c:80bcb8:6ad66118:4df, node_name=1, branch_uid=0:ffff0a74c29c:80bcb8:6ad66118:4e2, subordinatenodename=null, eis_name=unknown eis name > (com.ibm.mq.connector.xa.XARWrapper@45469a5f) failed with exception code XAException.XAER_NOTA: javax.transaction.xa.XAException: O método 'xa_rollback' falhou com errorCode '-4'.
        at com.ibm.mq.jmqi.JmqiXAResource.rollback(JmqiXAResource.java:874) [com.ibm.mq.jmqi.jar:9.0.4.0 - p904-L171030.1]
        at com.ibm.mq.connector.xa.XARWrapper.rollback(XARWrapper.java:598) [com.ibm.mq.connector.jar:]
        at com.arjuna.ats.internal.jta.resources.arjunacore.XAResourceRecord.topLevelAbort(XAResourceRecord.java:362)
        at com.arjuna.ats.arjuna.coordinator.BasicAction.doAbort(BasicAction.java:3023)
        at com.arjuna.ats.arjuna.coordinator.BasicAction.doAbort(BasicAction.java:3002)
        at com.arjuna.ats.arjuna.coordinator.BasicAction.Abort(BasicAction.java:1674)
        at com.arjuna.ats.arjuna.coordinator.TwoPhaseCoordinator.cancel(TwoPhaseCoordinator.java:124)
        at com.arjuna.ats.arjuna.AtomicAction.abort(AtomicAction.java:186)
        at com.arjuna.ats.internal.jta.transaction.arjunacore.TransactionImple.rollbackAndDisassociate(TransactionImple.java:1371)
        at com.arjuna.ats.internal.jta.transaction.arjunacore.BaseTransaction.rollback(BaseTransaction.java:143)
        at com.arjuna.ats.jbossatx.BaseTransactionManagerDelegate.rollback(BaseTransactionManagerDelegate.java:134)
        at org.wildfly.transaction.client.LocalTransaction.rollbackAndDissociate(LocalTransaction.java:104) [wildfly-transaction-client-1.0.4.Final-redhat-1.jar:1.0.4.Final-redhat-1]
        at org.wildfly.transaction.client.ContextTransactionManager.rollback(ContextTransactionManager.java:83) [wildfly-transaction-client-1.0.4.Final-redhat-1.jar:1.0.4.Final-redhat-1]
        at org.jboss.as.ejb3.inflow.MessageEndpointInvocationHandler.afterDelivery(MessageEndpointInvocationHandler.java:69) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
        at sun.reflect.GeneratedMethodAccessor89.invoke(Unknown Source) [:1.8.0_221]
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) [rt.jar:1.8.0_221]
        at java.lang.reflect.Method.invoke(Method.java:498) [rt.jar:1.8.0_221]
        at org.jboss.as.ejb3.inflow.AbstractInvocationHandler.handle(AbstractInvocationHandler.java:60) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
        at org.jboss.as.ejb3.inflow.MessageEndpointInvocationHandler.doInvoke(MessageEndpointInvocationHandler.java:135) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
        at org.jboss.as.ejb3.inflow.AbstractInvocationHandler.invoke(AbstractInvocationHandler.java:73) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
        at br.gov.caixa.sigpd.api.mensageria.jms.consumer.impl.AuditoriaOperacaoJMSConsumerImpl$$$endpoint1.afterDelivery(Unknown Source)
        at com.ibm.mq.connector.inbound.AbstractWorkImpl.run(AbstractWorkImpl.java:343) [com.ibm.mq.connector.jar:]
        at org.jboss.jca.core.workmanager.WorkWrapper.runWork(WorkWrapper.java:445) [ironjacamar-core-impl-1.4.12.Final-redhat-00001.jar:1.4.12.Final-redhat-00001]
        at org.jboss.as.connector.services.workmanager.WildflyWorkWrapper.runWork(WildflyWorkWrapper.java:68)
        at org.jboss.jca.core.workmanager.WorkWrapper.run(WorkWrapper.java:223) [ironjacamar-core-impl-1.4.12.Final-redhat-00001.jar:1.4.12.Final-redhat-00001]
        at org.jboss.threads.SimpleDirectExecutor.execute(SimpleDirectExecutor.java:33)
        at org.jboss.threads.QueueExecutor.runTask(QueueExecutor.java:808)
        at org.jboss.threads.QueueExecutor.access$100(QueueExecutor.java:45)
        at org.jboss.threads.QueueExecutor$Worker.run(QueueExecutor.java:849)
        at java.lang.Thread.run(Thread.java:748) [rt.jar:1.8.0_221]
        at org.jboss.threads.JBossThread.run(JBossThread.java:320)

2026-10-19 15:28:27,799 WARN  [com.arjuna.ats.jta] (default-threads - 14) ARJUNA016045: attempted rollback of < formatId=131077, gtrid_length=29, bqual_length=36, tx_uid=0:ffff0a74c29c:80bcb8:6ad66118:492, node_name=1, branch_uid=0:ffff0a74c29c:80bcb8:6ad66118:495, subordinatenodename=null, eis_name=unknown eis name > (com.ibm.mq.connector.xa.XARWrapper@6846e37c) failed with exception code XAException.XAER_NOTA: javax.transaction.xa.XAException: O método 'xa_rollback' falhou com errorCode '-4'.
        at com.ibm.mq.jmqi.JmqiXAResource.rollback(JmqiXAResource.java:874) [com.ibm.mq.jmqi.jar:9.0.4.0 - p904-L171030.1]
        at com.ibm.mq.connector.xa.XARWrapper.rollback(XARWrapper.java:598) [com.ibm.mq.connector.jar:]
        at com.arjuna.ats.internal.jta.resources.arjunacore.XAResourceRecord.topLevelAbort(XAResourceRecord.java:362)
        at com.arjuna.ats.arjuna.coordinator.BasicAction.doAbort(BasicAction.java:3023)
        at com.arjuna.ats.arjuna.coordinator.BasicAction.doAbort(BasicAction.java:3002)
        at com.arjuna.ats.arjuna.coordinator.BasicAction.Abort(BasicAction.java:1674)
        at com.arjuna.ats.arjuna.coordinator.TwoPhaseCoordinator.cancel(TwoPhaseCoordinator.java:124)
        at com.arjuna.ats.arjuna.AtomicAction.abort(AtomicAction.java:186)
        at com.arjuna.ats.internal.jta.transaction.arjunacore.TransactionImple.rollbackAndDisassociate(TransactionImple.java:1371)
        at com.arjuna.ats.internal.jta.transaction.arjunacore.BaseTransaction.rollback(BaseTransaction.java:143)
        at com.arjuna.ats.jbossatx.BaseTransactionManagerDelegate.rollback(BaseTransactionManagerDelegate.java:134)
        at org.wildfly.transaction.client.LocalTransaction.rollbackAndDissociate(LocalTransaction.java:104) [wildfly-transaction-client-1.0.4.Final-redhat-1.jar:1.0.4.Final-redhat-1]
        at org.wildfly.transaction.client.ContextTransactionManager.rollback(ContextTransactionManager.java:83) [wildfly-transaction-client-1.0.4.Final-redhat-1.jar:1.0.4.Final-redhat-1]
        at org.jboss.as.ejb3.inflow.MessageEndpointInvocationHandler.afterDelivery(MessageEndpointInvocationHandler.java:69) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
        at sun.reflect.GeneratedMethodAccessor89.invoke(Unknown Source) [:1.8.0_221]
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) [rt.jar:1.8.0_221]
        at java.lang.reflect.Method.invoke(Method.java:498) [rt.jar:1.8.0_221]
        at org.jboss.as.ejb3.inflow.AbstractInvocationHandler.handle(AbstractInvocationHandler.java:60) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
        at org.jboss.as.ejb3.inflow.MessageEndpointInvocationHandler.doInvoke(MessageEndpointInvocationHandler.java:135) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
        at org.jboss.as.ejb3.inflow.AbstractInvocationHandler.invoke(AbstractInvocationHandler.java:73) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
        at br.gov.caixa.sigpd.api.mensageria.jms.consumer.impl.AuditoriaOperacaoJMSConsumerImpl$$$endpoint1.afterDelivery(Unknown Source)
        at com.ibm.mq.connector.inbound.AbstractWorkImpl.run(AbstractWorkImpl.java:343) [com.ibm.mq.connector.jar:]
        at org.jboss.jca.core.workmanager.WorkWrapper.runWork(WorkWrapper.java:445) [ironjacamar-core-impl-1.4.12.Final-redhat-00001.jar:1.4.12.Final-redhat-00001]
        at org.jboss.as.connector.services.workmanager.WildflyWorkWrapper.runWork(WildflyWorkWrapper.java:68)
        at org.jboss.jca.core.workmanager.WorkWrapper.run(WorkWrapper.java:223) [ironjacamar-core-impl-1.4.12.Final-redhat-00001.jar:1.4.12.Final-redhat-00001]
        at org.jboss.threads.SimpleDirectExecutor.execute(SimpleDirectExecutor.java:33)
        at org.jboss.threads.QueueExecutor.runTask(QueueExecutor.java:808)
        at org.jboss.threads.QueueExecutor.access$100(QueueExecutor.java:45)
        at org.jboss.threads.QueueExecutor$Worker.run(QueueExecutor.java:849)
        at java.lang.Thread.run(Thread.java:748) [rt.jar:1.8.0_221]
        at org.jboss.threads.JBossThread.run(JBossThread.java:320)

2026-10-19 15:28:27,800 INFO  [br.gov.caixa.sigpd.api.mensageria.jms.consumer.impl.AuditoriaOperacaoJMSConsumerImpl] (default-threads - 13) C002.X - [API] Mensagem recuperada com sucesso da fila JMS
2026-10-19 15:28:27,801 INFO  [br.gov.caixa.sigpd.api.commons.utils.JsonUtil] (default-threads - 13) Desserialização de json para BaseJMSTO realizada com sucesso
2026-10-19 15:28:27,801 INFO  [br.gov.caixa.sigpd.api.mensageria.jms.consumer.impl.AuditoriaOperacaoJMSConsumerImpl] (default-threads - 13) C002.X - [API] Executando Classe de Serviço da fila JMS
2026-10-19 15:28:27,801 INFO  [br.gov.caixa.sigpd.api.commons.utils.JsonUtil] (default-threads - 13) Desserialização de json para InativacaoPossibilidadeJMSTO realizada com sucesso
2026-10-19 15:28:27,801 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 13) Executando método negocial inativa
2026-10-19 15:28:27,801 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 13) Inicio inativação de Conjuntos Tratamento.
2026-10-19 15:28:27,801 INFO  [br.gov.caixa.sigpd.api.commons.utils.JsonUtil] (default-threads - 13) Desserialização de json para InativacaoConjuntoTO realizada com sucesso
2026-10-19 15:28:27,801 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 13) InativacaoConjuntoTO desserializado: InativacaoConjuntoTO(idsVencidos=[1365], idsCancelados=[], trilhaAuditoria=null)
2026-10-19 15:28:27,801 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 13) TrilhaAuditoria recebida: null
2026-10-19 15:28:27,803 INFO  [br.gov.caixa.sigpd.api.mensageria.jms.consumer.impl.AuditoriaOperacaoJMSConsumerImpl] (default-threads - 19) C002.X - [API] Mensagem recuperada com sucesso da fila JMS
2026-10-19 15:28:27,803 INFO  [br.gov.caixa.sigpd.api.commons.utils.JsonUtil] (default-threads - 19) Desserialização de json para BaseJMSTO realizada com sucesso
2026-10-19 15:28:27,803 INFO  [br.gov.caixa.sigpd.api.mensageria.jms.consumer.impl.AuditoriaOperacaoJMSConsumerImpl] (default-threads - 19) C002.X - [API] Executando Classe de Serviço da fila JMS
2026-10-19 15:28:27,803 INFO  [br.gov.caixa.sigpd.api.commons.utils.JsonUtil] (default-threads - 19) Desserialização de json para InativacaoPossibilidadeJMSTO realizada com sucesso
2026-10-19 15:28:27,804 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 19) Executando método negocial inativa
2026-10-19 15:28:27,804 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 19) Inicio inativação de Conjuntos Tratamento.
2026-10-19 15:28:27,804 INFO  [br.gov.caixa.sigpd.api.commons.utils.JsonUtil] (default-threads - 19) Desserialização de json para InativacaoConjuntoTO realizada com sucesso
2026-10-19 15:28:27,804 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 19) InativacaoConjuntoTO desserializado: InativacaoConjuntoTO(idsVencidos=[1451], idsCancelados=[], trilhaAuditoria=null)
2026-10-19 15:28:27,804 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 19) TrilhaAuditoria recebida: null
2026-10-19 15:28:27,959 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 19) Tentando gravar trilha com objeto: null
2026-10-19 15:28:27,959 SEVERE [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 19) ATENÇÃO: TrilhaAuditoria é NULL!
2026-10-19 15:28:27,959 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.ConjuntoServiceHelperImpl] (default-threads - 19) gravaTrilha chamado com: null
2026-10-19 15:28:27,959 SEVERE [br.gov.caixa.sigpd.api.conjuntos.services.impl.ConjuntoServiceHelperImpl] (default-threads - 19) ERRO: TrilhaAuditoria nula ao chegar em gravaTrilha!
2026-10-19 15:28:27,959 INFO  [br.gov.caixa.sigpd.api.trilha_auditoria.services.impl.TrilhaAuditoriaServiceImpl] (default-threads - 19) TrilhaAuditoriaServiceImpl.insert() chamado com: null
2026-10-19 15:28:27,959 SEVERE [br.gov.caixa.sigpd.api.trilha_auditoria.services.impl.TrilhaAuditoriaServiceImpl] (default-threads - 19) ERRO CRÍTICO: entidade é NULL!
2026-10-19 15:28:27,959 SEVERE [br.gov.caixa.sigpd.api.conjuntos.services.impl.ConjuntoServiceHelperImpl] (default-threads - 19) Erro ao gravar trilha de auditoriabr.gov.caixa.sigpd.api.commons.exceptions.NegocioException: TrilhaAuditoria não pode ser nula
2026-10-19 15:28:27,959 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 19) Fim inativação de Conjuntos Tratamento.
2026-10-19 15:28:27,964 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 13) Tentando gravar trilha com objeto: null
2026-10-19 15:28:27,964 SEVERE [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 13) ATENÇÃO: TrilhaAuditoria é NULL!
2026-10-19 15:28:27,964 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.ConjuntoServiceHelperImpl] (default-threads - 13) gravaTrilha chamado com: null
2026-10-19 15:28:27,964 SEVERE [br.gov.caixa.sigpd.api.conjuntos.services.impl.ConjuntoServiceHelperImpl] (default-threads - 13) ERRO: TrilhaAuditoria nula ao chegar em gravaTrilha!
2026-10-19 15:28:27,964 INFO  [br.gov.caixa.sigpd.api.trilha_auditoria.services.impl.TrilhaAuditoriaServiceImpl] (default-threads - 13) TrilhaAuditoriaServiceImpl.insert() chamado com: null
2026-10-19 15:28:27,964 SEVERE [br.gov.caixa.sigpd.api.trilha_auditoria.services.impl.TrilhaAuditoriaServiceImpl] (default-threads - 13) ERRO CRÍTICO: entidade é NULL!
2026-10-19 15:28:27,964 SEVERE [br.gov.caixa.sigpd.api.conjuntos.services.impl.ConjuntoServiceHelperImpl] (default-threads - 13) Erro ao gravar trilha de auditoriabr.gov.caixa.sigpd.api.commons.exceptions.NegocioException: TrilhaAuditoria não pode ser nula
2026-10-19 15:28:27,964 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 13) Fim inativação de Conjuntos Tratamento.
2026-10-19 15:28:27,965 INFO  [org.jboss.as.connector.deployers.RaXmlDeployer] (default-threads - 19) wmq.jmsra.rar: MQJCA4026:A transação foi desfeita pelo motivo: 'O método 'xa_end' falhou com errorCode '100'.'.
2026-10-19 15:28:27,969 INFO  [org.jboss.as.connector.deployers.RaXmlDeployer] (default-threads - 13) wmq.jmsra.rar: MQJCA4026:A transação foi desfeita pelo motivo: 'O método 'xa_end' falhou com errorCode '100'.'.
2026-10-19 15:28:27,971 INFO  [br.gov.caixa.sigpd.api.mensageria.jms.consumer.impl.AuditoriaOperacaoJMSConsumerImpl] (default-threads - 29) C002.X - [API] Mensagem recuperada com sucesso da fila JMS
2026-10-19 15:28:27,971 INFO  [br.gov.caixa.sigpd.api.commons.utils.JsonUtil] (default-threads - 29) Desserialização de json para BaseJMSTO realizada com sucesso
2026-10-19 15:28:27,971 INFO  [br.gov.caixa.sigpd.api.mensageria.jms.consumer.impl.AuditoriaOperacaoJMSConsumerImpl] (default-threads - 29) C002.X - [API] Executando Classe de Serviço da fila JMS
2026-10-19 15:28:27,971 INFO  [br.gov.caixa.sigpd.api.commons.utils.JsonUtil] (default-threads - 29) Desserialização de json para InativacaoPossibilidadeJMSTO realizada com sucesso
2026-10-19 15:28:27,971 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 29) Executando método negocial inativa
2026-10-19 15:28:27,971 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 29) Inicio inativação de Conjuntos Tratamento.
2026-10-19 15:28:27,972 INFO  [br.gov.caixa.sigpd.api.commons.utils.JsonUtil] (default-threads - 29) Desserialização de json para InativacaoConjuntoTO realizada com sucesso
2026-10-19 15:28:27,972 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 29) InativacaoConjuntoTO desserializado: InativacaoConjuntoTO(idsVencidos=[1451], idsCancelados=[], trilhaAuditoria=null)
2026-10-19 15:28:27,972 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 29) TrilhaAuditoria recebida: null
2026-10-19 15:28:27,973 WARN  [com.arjuna.ats.jta] (default-threads - 13) ARJUNA016045: attempted rollback of < formatId=131077, gtrid_length=29, bqual_length=36, tx_uid=0:ffff0a74c29c:80bcb8:6ad66118:4ed, node_name=1, branch_uid=0:ffff0a74c29c:80bcb8:6ad66118:4f0, subordinatenodename=null, eis_name=unknown eis name > (com.ibm.mq.connector.xa.XARWrapper@78c9d3a4) failed with exception code XAException.XAER_NOTA: javax.transaction.xa.XAException: O método 'xa_rollback' falhou com errorCode '-4'.
        at com.ibm.mq.jmqi.JmqiXAResource.rollback(JmqiXAResource.java:874) [com.ibm.mq.jmqi.jar:9.0.4.0 - p904-L171030.1]
        at com.ibm.mq.connector.xa.XARWrapper.rollback(XARWrapper.java:598) [com.ibm.mq.connector.jar:]
        at com.arjuna.ats.internal.jta.resources.arjunacore.XAResourceRecord.topLevelAbort(XAResourceRecord.java:362)
        at com.arjuna.ats.arjuna.coordinator.BasicAction.doAbort(BasicAction.java:3023)
        at com.arjuna.ats.arjuna.coordinator.BasicAction.doAbort(BasicAction.java:3002)
        at com.arjuna.ats.arjuna.coordinator.BasicAction.Abort(BasicAction.java:1674)
        at com.arjuna.ats.arjuna.coordinator.TwoPhaseCoordinator.cancel(TwoPhaseCoordinator.java:124)
        at com.arjuna.ats.arjuna.AtomicAction.abort(AtomicAction.java:186)
        at com.arjuna.ats.internal.jta.transaction.arjunacore.TransactionImple.rollbackAndDisassociate(TransactionImple.java:1371)
        at com.arjuna.ats.internal.jta.transaction.arjunacore.BaseTransaction.rollback(BaseTransaction.java:143)
        at com.arjuna.ats.jbossatx.BaseTransactionManagerDelegate.rollback(BaseTransactionManagerDelegate.java:134)
        at org.wildfly.transaction.client.LocalTransaction.rollbackAndDissociate(LocalTransaction.java:104) [wildfly-transaction-client-1.0.4.Final-redhat-1.jar:1.0.4.Final-redhat-1]
        at org.wildfly.transaction.client.ContextTransactionManager.rollback(ContextTransactionManager.java:83) [wildfly-transaction-client-1.0.4.Final-redhat-1.jar:1.0.4.Final-redhat-1]
        at org.jboss.as.ejb3.inflow.MessageEndpointInvocationHandler.afterDelivery(MessageEndpointInvocationHandler.java:69) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
        at sun.reflect.GeneratedMethodAccessor89.invoke(Unknown Source) [:1.8.0_221]
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) [rt.jar:1.8.0_221]
        at java.lang.reflect.Method.invoke(Method.java:498) [rt.jar:1.8.0_221]
        at org.jboss.as.ejb3.inflow.AbstractInvocationHandler.handle(AbstractInvocationHandler.java:60) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
        at org.jboss.as.ejb3.inflow.MessageEndpointInvocationHandler.doInvoke(MessageEndpointInvocationHandler.java:135) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
        at org.jboss.as.ejb3.inflow.AbstractInvocationHandler.invoke(AbstractInvocationHandler.java:73) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
        at br.gov.caixa.sigpd.api.mensageria.jms.consumer.impl.AuditoriaOperacaoJMSConsumerImpl$$$endpoint1.afterDelivery(Unknown Source)
        at com.ibm.mq.connector.inbound.AbstractWorkImpl.run(AbstractWorkImpl.java:343) [com.ibm.mq.connector.jar:]
        at org.jboss.jca.core.workmanager.WorkWrapper.runWork(WorkWrapper.java:445) [ironjacamar-core-impl-1.4.12.Final-redhat-00001.jar:1.4.12.Final-redhat-00001]
        at org.jboss.as.connector.services.workmanager.WildflyWorkWrapper.runWork(WildflyWorkWrapper.java:68)
        at org.jboss.jca.core.workmanager.WorkWrapper.run(WorkWrapper.java:223) [ironjacamar-core-impl-1.4.12.Final-redhat-00001.jar:1.4.12.Final-redhat-00001]
        at org.jboss.threads.SimpleDirectExecutor.execute(SimpleDirectExecutor.java:33)
        at org.jboss.threads.QueueExecutor.runTask(QueueExecutor.java:808)
        at org.jboss.threads.QueueExecutor.access$100(QueueExecutor.java:45)
        at org.jboss.threads.QueueExecutor$Worker.run(QueueExecutor.java:849)
        at java.lang.Thread.run(Thread.java:748) [rt.jar:1.8.0_221]
        at org.jboss.threads.JBossThread.run(JBossThread.java:320)

2026-10-19 15:28:27,974 INFO  [br.gov.caixa.sigpd.api.mensageria.jms.consumer.impl.AuditoriaOperacaoJMSConsumerImpl] (default-threads - 28) C002.X - [API] Mensagem recuperada com sucesso da fila JMS
2026-10-19 15:28:27,975 INFO  [br.gov.caixa.sigpd.api.commons.utils.JsonUtil] (default-threads - 28) Desserialização de json para BaseJMSTO realizada com sucesso
2026-10-19 15:28:27,975 INFO  [br.gov.caixa.sigpd.api.mensageria.jms.consumer.impl.AuditoriaOperacaoJMSConsumerImpl] (default-threads - 28) C002.X - [API] Executando Classe de Serviço da fila JMS
2026-10-19 15:28:27,975 INFO  [br.gov.caixa.sigpd.api.commons.utils.JsonUtil] (default-threads - 28) Desserialização de json para InativacaoPossibilidadeJMSTO realizada com sucesso
2026-10-19 15:28:27,975 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 28) Executando método negocial inativa
2026-10-19 15:28:27,975 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 28) Inicio inativação de Conjuntos Tratamento.
2026-10-19 15:28:27,975 INFO  [br.gov.caixa.sigpd.api.commons.utils.JsonUtil] (default-threads - 28) Desserialização de json para InativacaoConjuntoTO realizada com sucesso
2026-10-19 15:28:27,975 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 28) InativacaoConjuntoTO desserializado: InativacaoConjuntoTO(idsVencidos=[1365], idsCancelados=[], trilhaAuditoria=null)
2026-10-19 15:28:27,975 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 28) TrilhaAuditoria recebida: null
2026-10-19 15:28:27,970 WARN  [com.arjuna.ats.jta] (default-threads - 19) ARJUNA016045: attempted rollback of < formatId=131077, gtrid_length=29, bqual_length=36, tx_uid=0:ffff0a74c29c:80bcb8:6ad66118:4f3, node_name=1, branch_uid=0:ffff0a74c29c:80bcb8:6ad66118:4f6, subordinatenodename=null, eis_name=unknown eis name > (com.ibm.mq.connector.xa.XARWrapper@20888e59) failed with exception code XAException.XAER_NOTA: javax.transaction.xa.XAException: O método 'xa_rollback' falhou com errorCode '-4'.
        at com.ibm.mq.jmqi.JmqiXAResource.rollback(JmqiXAResource.java:874) [com.ibm.mq.jmqi.jar:9.0.4.0 - p904-L171030.1]
        at com.ibm.mq.connector.xa.XARWrapper.rollback(XARWrapper.java:598) [com.ibm.mq.connector.jar:]
        at com.arjuna.ats.internal.jta.resources.arjunacore.XAResourceRecord.topLevelAbort(XAResourceRecord.java:362)
        at com.arjuna.ats.arjuna.coordinator.BasicAction.doAbort(BasicAction.java:3023)
        at com.arjuna.ats.arjuna.coordinator.BasicAction.doAbort(BasicAction.java:3002)
        at com.arjuna.ats.arjuna.coordinator.BasicAction.Abort(BasicAction.java:1674)
        at com.arjuna.ats.arjuna.coordinator.TwoPhaseCoordinator.cancel(TwoPhaseCoordinator.java:124)
        at com.arjuna.ats.arjuna.AtomicAction.abort(AtomicAction.java:186)
        at com.arjuna.ats.internal.jta.transaction.arjunacore.TransactionImple.rollbackAndDisassociate(TransactionImple.java:1371)
        at com.arjuna.ats.internal.jta.transaction.arjunacore.BaseTransaction.rollback(BaseTransaction.java:143)
        at com.arjuna.ats.jbossatx.BaseTransactionManagerDelegate.rollback(BaseTransactionManagerDelegate.java:134)
        at org.wildfly.transaction.client.LocalTransaction.rollbackAndDissociate(LocalTransaction.java:104) [wildfly-transaction-client-1.0.4.Final-redhat-1.jar:1.0.4.Final-redhat-1]
        at org.wildfly.transaction.client.ContextTransactionManager.rollback(ContextTransactionManager.java:83) [wildfly-transaction-client-1.0.4.Final-redhat-1.jar:1.0.4.Final-redhat-1]
        at org.jboss.as.ejb3.inflow.MessageEndpointInvocationHandler.afterDelivery(MessageEndpointInvocationHandler.java:69) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
        at sun.reflect.GeneratedMethodAccessor89.invoke(Unknown Source) [:1.8.0_221]
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) [rt.jar:1.8.0_221]
        at java.lang.reflect.Method.invoke(Method.java:498) [rt.jar:1.8.0_221]
        at org.jboss.as.ejb3.inflow.AbstractInvocationHandler.handle(AbstractInvocationHandler.java:60) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
        at org.jboss.as.ejb3.inflow.MessageEndpointInvocationHandler.doInvoke(MessageEndpointInvocationHandler.java:135) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
        at org.jboss.as.ejb3.inflow.AbstractInvocationHandler.invoke(AbstractInvocationHandler.java:73) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
        at br.gov.caixa.sigpd.api.mensageria.jms.consumer.impl.AuditoriaOperacaoJMSConsumerImpl$$$endpoint1.afterDelivery(Unknown Source)
        at com.ibm.mq.connector.inbound.AbstractWorkImpl.run(AbstractWorkImpl.java:343) [com.ibm.mq.connector.jar:]
        at org.jboss.jca.core.workmanager.WorkWrapper.runWork(WorkWrapper.java:445) [ironjacamar-core-impl-1.4.12.Final-redhat-00001.jar:1.4.12.Final-redhat-00001]
        at org.jboss.as.connector.services.workmanager.WildflyWorkWrapper.runWork(WildflyWorkWrapper.java:68)
        at org.jboss.jca.core.workmanager.WorkWrapper.run(WorkWrapper.java:223) [ironjacamar-core-impl-1.4.12.Final-redhat-00001.jar:1.4.12.Final-redhat-00001]
        at org.jboss.threads.SimpleDirectExecutor.execute(SimpleDirectExecutor.java:33)
        at org.jboss.threads.QueueExecutor.runTask(QueueExecutor.java:808)
        at org.jboss.threads.QueueExecutor.access$100(QueueExecutor.java:45)
        at org.jboss.threads.QueueExecutor$Worker.run(QueueExecutor.java:849)
        at java.lang.Thread.run(Thread.java:748) [rt.jar:1.8.0_221]
        at org.jboss.threads.JBossThread.run(JBossThread.java:320)

2026-10-19 15:28:28,127 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 28) Tentando gravar trilha com objeto: null
2026-10-19 15:28:28,127 SEVERE [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 28) ATENÇÃO: TrilhaAuditoria é NULL!
2026-10-19 15:28:28,127 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.ConjuntoServiceHelperImpl] (default-threads - 28) gravaTrilha chamado com: null
2026-10-19 15:28:28,127 SEVERE [br.gov.caixa.sigpd.api.conjuntos.services.impl.ConjuntoServiceHelperImpl] (default-threads - 28) ERRO: TrilhaAuditoria nula ao chegar em gravaTrilha!
2026-10-19 15:28:28,127 INFO  [br.gov.caixa.sigpd.api.trilha_auditoria.services.impl.TrilhaAuditoriaServiceImpl] (default-threads - 28) TrilhaAuditoriaServiceImpl.insert() chamado com: null
2026-10-19 15:28:28,127 SEVERE [br.gov.caixa.sigpd.api.trilha_auditoria.services.impl.TrilhaAuditoriaServiceImpl] (default-threads - 28) ERRO CRÍTICO: entidade é NULL!
2026-10-19 15:28:28,128 SEVERE [br.gov.caixa.sigpd.api.conjuntos.services.impl.ConjuntoServiceHelperImpl] (default-threads - 28) Erro ao gravar trilha de auditoriabr.gov.caixa.sigpd.api.commons.exceptions.NegocioException: TrilhaAuditoria não pode ser nula
2026-10-19 15:28:28,128 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 28) Fim inativação de Conjuntos Tratamento.
2026-10-19 15:28:28,132 INFO  [org.jboss.as.connector.deployers.RaXmlDeployer] (default-threads - 28) wmq.jmsra.rar: MQJCA4026:A transação foi desfeita pelo motivo: 'O método 'xa_end' falhou com errorCode '100'.'.
2026-10-19 15:28:28,133 WARN  [com.arjuna.ats.jta] (default-threads - 28) ARJUNA016045: attempted rollback of < formatId=131077, gtrid_length=29, bqual_length=36, tx_uid=0:ffff0a74c29c:80bcb8:6ad66118:501, node_name=1, branch_uid=0:ffff0a74c29c:80bcb8:6ad66118:504, subordinatenodename=null, eis_name=unknown eis name > (com.ibm.mq.connector.xa.XARWrapper@5c2d023) failed with exception code XAException.XAER_NOTA: javax.transaction.xa.XAException: O método 'xa_rollback' falhou com errorCode '-4'.
        at com.ibm.mq.jmqi.JmqiXAResource.rollback(JmqiXAResource.java:874) [com.ibm.mq.jmqi.jar:9.0.4.0 - p904-L171030.1]
        at com.ibm.mq.connector.xa.XARWrapper.rollback(XARWrapper.java:598) [com.ibm.mq.connector.jar:]
        at com.arjuna.ats.internal.jta.resources.arjunacore.XAResourceRecord.topLevelAbort(XAResourceRecord.java:362)
        at com.arjuna.ats.arjuna.coordinator.BasicAction.doAbort(BasicAction.java:3023)
        at com.arjuna.ats.arjuna.coordinator.BasicAction.doAbort(BasicAction.java:3002)
        at com.arjuna.ats.arjuna.coordinator.BasicAction.Abort(BasicAction.java:1674)
        at com.arjuna.ats.arjuna.coordinator.TwoPhaseCoordinator.cancel(TwoPhaseCoordinator.java:124)
        at com.arjuna.ats.arjuna.AtomicAction.abort(AtomicAction.java:186)
        at com.arjuna.ats.internal.jta.transaction.arjunacore.TransactionImple.rollbackAndDisassociate(TransactionImple.java:1371)
        at com.arjuna.ats.internal.jta.transaction.arjunacore.BaseTransaction.rollback(BaseTransaction.java:143)
        at com.arjuna.ats.jbossatx.BaseTransactionManagerDelegate.rollback(BaseTransactionManagerDelegate.java:134)
        at org.wildfly.transaction.client.LocalTransaction.rollbackAndDissociate(LocalTransaction.java:104) [wildfly-transaction-client-1.0.4.Final-redhat-1.jar:1.0.4.Final-redhat-1]
        at org.wildfly.transaction.client.ContextTransactionManager.rollback(ContextTransactionManager.java:83) [wildfly-transaction-client-1.0.4.Final-redhat-1.jar:1.0.4.Final-redhat-1]
        at org.jboss.as.ejb3.inflow.MessageEndpointInvocationHandler.afterDelivery(MessageEndpointInvocationHandler.java:69) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
        at sun.reflect.GeneratedMethodAccessor89.invoke(Unknown Source) [:1.8.0_221]
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) [rt.jar:1.8.0_221]
        at java.lang.reflect.Method.invoke(Method.java:498) [rt.jar:1.8.0_221]
        at org.jboss.as.ejb3.inflow.AbstractInvocationHandler.handle(AbstractInvocationHandler.java:60) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
        at org.jboss.as.ejb3.inflow.MessageEndpointInvocationHandler.doInvoke(MessageEndpointInvocationHandler.java:135) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
        at org.jboss.as.ejb3.inflow.AbstractInvocationHandler.invoke(AbstractInvocationHandler.java:73) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
        at br.gov.caixa.sigpd.api.mensageria.jms.consumer.impl.AuditoriaOperacaoJMSConsumerImpl$$$endpoint1.afterDelivery(Unknown Source)
        at com.ibm.mq.connector.inbound.AbstractWorkImpl.run(AbstractWorkImpl.java:343) [com.ibm.mq.connector.jar:]
        at org.jboss.jca.core.workmanager.WorkWrapper.runWork(WorkWrapper.java:445) [ironjacamar-core-impl-1.4.12.Final-redhat-00001.jar:1.4.12.Final-redhat-00001]
        at org.jboss.as.connector.services.workmanager.WildflyWorkWrapper.runWork(WildflyWorkWrapper.java:68)
        at org.jboss.jca.core.workmanager.WorkWrapper.run(WorkWrapper.java:223) [ironjacamar-core-impl-1.4.12.Final-redhat-00001.jar:1.4.12.Final-redhat-00001]
        at org.jboss.threads.SimpleDirectExecutor.execute(SimpleDirectExecutor.java:33)
        at org.jboss.threads.QueueExecutor.runTask(QueueExecutor.java:808)
        at org.jboss.threads.QueueExecutor.access$100(QueueExecutor.java:45)
        at org.jboss.threads.QueueExecutor$Worker.run(QueueExecutor.java:849)
        at java.lang.Thread.run(Thread.java:748) [rt.jar:1.8.0_221]
        at org.jboss.threads.JBossThread.run(JBossThread.java:320)

2026-10-19 15:28:28,136 INFO  [br.gov.caixa.sigpd.api.mensageria.jms.consumer.impl.AuditoriaOperacaoJMSConsumerImpl] (default-threads - 33) C002.X - [API] Mensagem recuperada com sucesso da fila JMS
2026-10-19 15:28:28,136 INFO  [br.gov.caixa.sigpd.api.commons.utils.JsonUtil] (default-threads - 33) Desserialização de json para BaseJMSTO realizada com sucesso
2026-10-19 15:28:28,136 INFO  [br.gov.caixa.sigpd.api.mensageria.jms.consumer.impl.AuditoriaOperacaoJMSConsumerImpl] (default-threads - 33) C002.X - [API] Executando Classe de Serviço da fila JMS
2026-10-19 15:28:28,136 INFO  [br.gov.caixa.sigpd.api.commons.utils.JsonUtil] (default-threads - 33) Desserialização de json para InativacaoPossibilidadeJMSTO realizada com sucesso
2026-10-19 15:28:28,136 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 33) Executando método negocial inativa
2026-10-19 15:28:28,136 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 33) Inicio inativação de Conjuntos Tratamento.
2026-10-19 15:28:28,137 INFO  [br.gov.caixa.sigpd.api.commons.utils.JsonUtil] (default-threads - 33) Desserialização de json para InativacaoConjuntoTO realizada com sucesso
2026-10-19 15:28:28,137 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 33) InativacaoConjuntoTO desserializado: InativacaoConjuntoTO(idsVencidos=[1365], idsCancelados=[], trilhaAuditoria=null)
2026-10-19 15:28:28,137 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 33) TrilhaAuditoria recebida: null
2026-10-19 15:28:28,140 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 29) Tentando gravar trilha com objeto: null
2026-10-19 15:28:28,141 SEVERE [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 29) ATENÇÃO: TrilhaAuditoria é NULL!
2026-10-19 15:28:28,141 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.ConjuntoServiceHelperImpl] (default-threads - 29) gravaTrilha chamado com: null
2026-10-19 15:28:28,141 SEVERE [br.gov.caixa.sigpd.api.conjuntos.services.impl.ConjuntoServiceHelperImpl] (default-threads - 29) ERRO: TrilhaAuditoria nula ao chegar em gravaTrilha!
2026-10-19 15:28:28,141 INFO  [br.gov.caixa.sigpd.api.trilha_auditoria.services.impl.TrilhaAuditoriaServiceImpl] (default-threads - 29) TrilhaAuditoriaServiceImpl.insert() chamado com: null
2026-10-19 15:28:28,141 SEVERE [br.gov.caixa.sigpd.api.trilha_auditoria.services.impl.TrilhaAuditoriaServiceImpl] (default-threads - 29) ERRO CRÍTICO: entidade é NULL!
2026-10-19 15:28:28,141 SEVERE [br.gov.caixa.sigpd.api.conjuntos.services.impl.ConjuntoServiceHelperImpl] (default-threads - 29) Erro ao gravar trilha de auditoriabr.gov.caixa.sigpd.api.commons.exceptions.NegocioException: TrilhaAuditoria não pode ser nula
2026-10-19 15:28:28,141 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 29) Fim inativação de Conjuntos Tratamento.
2026-10-19 15:28:28,145 INFO  [org.jboss.as.connector.deployers.RaXmlDeployer] (default-threads - 29) wmq.jmsra.rar: MQJCA4026:A transação foi desfeita pelo motivo: 'O método 'xa_end' falhou com errorCode '100'.'.
2026-10-19 15:28:28,146 WARN  [com.arjuna.ats.jta] (default-threads - 29) ARJUNA016045: attempted rollback of < formatId=131077, gtrid_length=29, bqual_length=36, tx_uid=0:ffff0a74c29c:80bcb8:6ad66118:4fb, node_name=1, branch_uid=0:ffff0a74c29c:80bcb8:6ad66118:4fe, subordinatenodename=null, eis_name=unknown eis name > (com.ibm.mq.connector.xa.XARWrapper@111ecde3) failed with exception code XAException.XAER_NOTA: javax.transaction.xa.XAException: O método 'xa_rollback' falhou com errorCode '-4'.
        at com.ibm.mq.jmqi.JmqiXAResource.rollback(JmqiXAResource.java:874) [com.ibm.mq.jmqi.jar:9.0.4.0 - p904-L171030.1]
        at com.ibm.mq.connector.xa.XARWrapper.rollback(XARWrapper.java:598) [com.ibm.mq.connector.jar:]
        at com.arjuna.ats.internal.jta.resources.arjunacore.XAResourceRecord.topLevelAbort(XAResourceRecord.java:362)
        at com.arjuna.ats.arjuna.coordinator.BasicAction.doAbort(BasicAction.java:3023)
        at com.arjuna.ats.arjuna.coordinator.BasicAction.doAbort(BasicAction.java:3002)
        at com.arjuna.ats.arjuna.coordinator.BasicAction.Abort(BasicAction.java:1674)
        at com.arjuna.ats.arjuna.coordinator.TwoPhaseCoordinator.cancel(TwoPhaseCoordinator.java:124)
        at com.arjuna.ats.arjuna.AtomicAction.abort(AtomicAction.java:186)
        at com.arjuna.ats.internal.jta.transaction.arjunacore.TransactionImple.rollbackAndDisassociate(TransactionImple.java:1371)
        at com.arjuna.ats.internal.jta.transaction.arjunacore.BaseTransaction.rollback(BaseTransaction.java:143)
        at com.arjuna.ats.jbossatx.BaseTransactionManagerDelegate.rollback(BaseTransactionManagerDelegate.java:134)
        at org.wildfly.transaction.client.LocalTransaction.rollbackAndDissociate(LocalTransaction.java:104) [wildfly-transaction-client-1.0.4.Final-redhat-1.jar:1.0.4.Final-redhat-1]
        at org.wildfly.transaction.client.ContextTransactionManager.rollback(ContextTransactionManager.java:83) [wildfly-transaction-client-1.0.4.Final-redhat-1.jar:1.0.4.Final-redhat-1]
        at org.jboss.as.ejb3.inflow.MessageEndpointInvocationHandler.afterDelivery(MessageEndpointInvocationHandler.java:69) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
        at sun.reflect.GeneratedMethodAccessor89.invoke(Unknown Source) [:1.8.0_221]
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) [rt.jar:1.8.0_221]
        at java.lang.reflect.Method.invoke(Method.java:498) [rt.jar:1.8.0_221]
        at org.jboss.as.ejb3.inflow.AbstractInvocationHandler.handle(AbstractInvocationHandler.java:60) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
        at org.jboss.as.ejb3.inflow.MessageEndpointInvocationHandler.doInvoke(MessageEndpointInvocationHandler.java:135) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
        at org.jboss.as.ejb3.inflow.AbstractInvocationHandler.invoke(AbstractInvocationHandler.java:73) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
        at br.gov.caixa.sigpd.api.mensageria.jms.consumer.impl.AuditoriaOperacaoJMSConsumerImpl$$$endpoint1.afterDelivery(Unknown Source)
        at com.ibm.mq.connector.inbound.AbstractWorkImpl.run(AbstractWorkImpl.java:343) [com.ibm.mq.connector.jar:]
        at org.jboss.jca.core.workmanager.WorkWrapper.runWork(WorkWrapper.java:445) [ironjacamar-core-impl-1.4.12.Final-redhat-00001.jar:1.4.12.Final-redhat-00001]
        at org.jboss.as.connector.services.workmanager.WildflyWorkWrapper.runWork(WildflyWorkWrapper.java:68)
        at org.jboss.jca.core.workmanager.WorkWrapper.run(WorkWrapper.java:223) [ironjacamar-core-impl-1.4.12.Final-redhat-00001.jar:1.4.12.Final-redhat-00001]
        at org.jboss.threads.SimpleDirectExecutor.execute(SimpleDirectExecutor.java:33)
        at org.jboss.threads.QueueExecutor.runTask(QueueExecutor.java:808)
        at org.jboss.threads.QueueExecutor.access$100(QueueExecutor.java:45)
        at org.jboss.threads.QueueExecutor$Worker.run(QueueExecutor.java:849)
        at java.lang.Thread.run(Thread.java:748) [rt.jar:1.8.0_221]
        at org.jboss.threads.JBossThread.run(JBossThread.java:320)

2026-10-19 15:28:28,148 INFO  [br.gov.caixa.sigpd.api.mensageria.jms.consumer.impl.AuditoriaOperacaoJMSConsumerImpl] (default-threads - 32) C002.X - [API] Mensagem recuperada com sucesso da fila JMS
2026-10-19 15:28:28,148 INFO  [br.gov.caixa.sigpd.api.commons.utils.JsonUtil] (default-threads - 32) Desserialização de json para BaseJMSTO realizada com sucesso
2026-10-19 15:28:28,148 INFO  [br.gov.caixa.sigpd.api.mensageria.jms.consumer.impl.AuditoriaOperacaoJMSConsumerImpl] (default-threads - 32) C002.X - [API] Executando Classe de Serviço da fila JMS
2026-10-19 15:28:28,148 INFO  [br.gov.caixa.sigpd.api.commons.utils.JsonUtil] (default-threads - 32) Desserialização de json para InativacaoPossibilidadeJMSTO realizada com sucesso
2026-10-19 15:28:28,149 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 32) Executando método negocial inativa
2026-10-19 15:28:28,149 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 32) Inicio inativação de Conjuntos Tratamento.
2026-10-19 15:28:28,149 INFO  [br.gov.caixa.sigpd.api.commons.utils.JsonUtil] (default-threads - 32) Desserialização de json para InativacaoConjuntoTO realizada com sucesso
2026-10-19 15:28:28,149 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 32) InativacaoConjuntoTO desserializado: InativacaoConjuntoTO(idsVencidos=[1451], idsCancelados=[], trilhaAuditoria=null)
2026-10-19 15:28:28,149 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalProcessadorFilaServiceImpl] (default-threads - 32) TrilhaAuditoria recebida: null
^C
[root@caddeapllx929 ~]#
[root@caddeapllx929 ~]#
[root@caddeapllx929 ~]#
[root@caddeapllx929 ~]# curl -sv -m 10 http://10.116.194.156:8080/sigpd-api/v1/health-check/live
* About to connect() to 10.116.194.156 port 8080 (#0)
*   Trying 10.116.194.156...
* Connected to 10.116.194.156 (10.116.194.156) port 8080 (#0)
> GET /sigpd-api/v1/health-check/live HTTP/1.1
> User-Agent: curl/7.29.0
> Host: 10.116.194.156:8080
> Accept: */*
>
< HTTP/1.1 200 OK
< X-Powered-By: CAIXA TI
< Access-Control-Allow-Headers: origin, referer, referrer, content-type, accept, authorization, Access-Control-Request-Method, Access-Control-Request-Headers
< Server: SIGP-SERVER
< Date: Mon, 19 Oct 2026 18:28:35 GMT
< Connection: keep-alive
< Access-Control-Allow-Origin: *
< Access-Control-Allow-Credentials: true
< Content-Type: application/json
< Content-Length: 15
< Access-Control-Allow-Methods: GET, POST, PUT, PATCH, DELETE, OPTIONS, HEAD
<
* Connection #0 to host 10.116.194.156 left intact
{"status":"UP"}[root@caddeapllx929 ~]#
[root@caddeapllx929 ~]#
[root@caddeapllx929 ~]#
[root@caddeapllx929 ~]#
[root@caddeapllx929 ~]#
[root@caddeapllx929 ~]# curl -sk -m 10 -o /dev/null -w "%{http_code}\n" https://sigpd-backend.esteiras.des.caixa/sigpd-api/v1/health-check/live
200
[root@caddeapllx929 ~]#
[root@caddeapllx929 ~]#
[root@caddeapllx929 ~]#
[root@caddeapllx929 ~]#
[root@caddeapllx929 ~]# grep -c "Full GC" /logs/jboss/jboss-eap/standalone/sigpd-backend/gc.log*.current
0
[root@caddeapllx929 ~]#
