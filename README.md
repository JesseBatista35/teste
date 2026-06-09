[root@sbrdeapllx099 bin]# su - jboss -c "cd /opt/jboss/jboss-eap && nohup ./bin/domain.sh --host-config=host-slave.xml -b 10.116.94.206 -bmanagement 10.116.94.206 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.89.0 -Djboss.server.log.dir=/logs/jboss-eap/servers -c domain.xml > /tmp/jboss-restart.log 2>&1 &"
[root@sbrdeapllx099 bin]#
[root@sbrdeapllx099 bin]#
[root@sbrdeapllx099 bin]#
[root@sbrdeapllx099 bin]#
[root@sbrdeapllx099 bin]# ps aux | grep java | grep -v grep
jboss     26086  0.0  0.5 1262188 87832 ?       Sl   Jun03   4:54 java -D[Process Controller] -server -Xms64m -Xmx512m -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Dorg.jboss.boot.log.file=/opt/jboss/jboss-eap/hc/log/process-controller.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/configuration/logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules org.jboss.as.process-controller -jboss-home /opt/jboss/jboss-eap -jvm java -mp /opt/jboss/jboss-eap/modules -- -Dorg.jboss.boot.log.file=/opt/jboss/jboss-eap/hc/log/host-controller.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/configuration/logging.properties -server -Xms64m -Xmx512m -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -- -default-jvm java --host-config=host-slave.xml -b 10.116.94.206 -bmanagement 10.116.94.206 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.89.0 -Djboss.server.log.dir=/logs/jboss-eap/servers -c domain.xml
jboss     26105  0.0  1.7 1406432 283932 ?      Sl   Jun03   5:43 java -D[Host Controller] -Dorg.jboss.boot.log.file=/opt/jboss/jboss-eap/hc/log/host-controller.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/configuration/logging.properties -server -Xms64m -Xmx512m -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules org.jboss.as.host-controller -mp /opt/jboss/jboss-eap/modules --pc-address 127.0.0.1 --pc-port 40205 -default-jvm java --host-config=host-slave.xml -b 10.116.94.206 -bmanagement 10.116.94.206 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.89.0 -Djboss.server.log.dir=/logs/jboss-eap/servers -c domain.xml -Djboss.home.dir=/opt/jboss/jboss-eap
[root@sbrdeapllx099 bin]#
[root@sbrdeapllx099 bin]#
[root@sbrdeapllx099 bin]#
[root@sbrdeapllx099 bin]# tail -100 /opt/jboss/jboss-eap/hc/log/servers/siosp_node1_lx099/server.log
        java:app/siosp-api/Relatorio!br.gov.caixa.relatorio.Relatorio
        java:module/Relatorio!br.gov.caixa.relatorio.Relatorio
        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/Relatorio
        java:app/siosp-api/Relatorio
        java:module/Relatorio

2026-06-09 14:08:15,386 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para sessão bean chamada 'OperacaoCreditoAS' na unidade de implementação 'subdeployment "siosp-api.war" of deployment "siosp-1.0.0.59-1.0.0.59-b370.ear"' são como segue:

        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/OperacaoCreditoAS!br.gov.caixa.siosp.servicos.OperacaoCreditoAS
        java:app/siosp-api/OperacaoCreditoAS!br.gov.caixa.siosp.servicos.OperacaoCreditoAS
        java:module/OperacaoCreditoAS!br.gov.caixa.siosp.servicos.OperacaoCreditoAS
        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/OperacaoCreditoAS
        java:app/siosp-api/OperacaoCreditoAS
        java:module/OperacaoCreditoAS

2026-06-09 14:08:15,386 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para sessão bean chamada 'ExemploAS' na unidade de implementação 'subdeployment "siosp-api.war" of deployment "siosp-1.0.0.59-1.0.0.59-b370.ear"' são como segue:

        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/ExemploAS!br.gov.caixa.arquitetura.javaee.core.exemplo.ExemploAS
        java:app/siosp-api/ExemploAS!br.gov.caixa.arquitetura.javaee.core.exemplo.ExemploAS
        java:module/ExemploAS!br.gov.caixa.arquitetura.javaee.core.exemplo.ExemploAS
        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/ExemploAS
        java:app/siosp-api/ExemploAS
        java:module/ExemploAS

2026-06-09 14:08:15,463 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-3) WFLYJCA0004: Implantação do driver compatível-JDBC class oracle.jdbc.OracleDriver (versão 11.2)
2026-06-09 14:08:15,468 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-8) WFLYJCA0018: Serviço de driver iniciado com driver-name = siosp-api.war_oracle.jdbc.OracleDriver_11_2
2026-06-09 14:08:15,470 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 105) WFLYJPA0010: Iniciando unidade de persistência (fase 2 de 2) Serviço'siosp-1.0.0.59-1.0.0.59-b370.ear/siosp-api.war#OracleSiospDS'
2026-06-09 14:08:15,471 INFO  [org.hibernate.dialect.Dialect] (ServerService Thread Pool -- 105) HHH000400: Using dialect: org.hibernate.dialect.Oracle10gDialect
2026-06-09 14:08:15,471 INFO  [org.hibernate.engine.jdbc.env.internal.LobCreatorBuilderImpl] (ServerService Thread Pool -- 105) HHH000422: Disabling contextual LOB creation as connection was null
2026-06-09 14:08:15,473 INFO  [org.hibernate.envers.boot.internal.EnversServiceImpl] (ServerService Thread Pool -- 105) Envers integration enabled? : true
2026-06-09 14:08:15,489 ERROR [org.jboss.msc.service.fail] (ServerService Thread Pool -- 105) MSC000001: Failed to start service jboss.persistenceunit."siosp-1.0.0.59-1.0.0.59-b370.ear/siosp-api.war#OracleSiospDS": org.jboss.msc.service.StartException in service jboss.persistenceunit."siosp-1.0.0.59-1.0.0.59-b370.ear/siosp-api.war#OracleSiospDS": java.lang.ClassCastException: org.dom4j.DocumentFactory cannot be cast to org.dom4j.DocumentFactory
        at org.jboss.as.jpa.service.PersistenceUnitServiceImpl$1$1.run(PersistenceUnitServiceImpl.java:195)
        at org.jboss.as.jpa.service.PersistenceUnitServiceImpl$1$1.run(PersistenceUnitServiceImpl.java:125)
        at org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:640)
        at org.jboss.as.jpa.service.PersistenceUnitServiceImpl$1.run(PersistenceUnitServiceImpl.java:209)
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
        at java.lang.Thread.run(Thread.java:750)
        at org.jboss.threads.JBossThread.run(JBossThread.java:320)
Caused by: java.lang.ClassCastException: org.dom4j.DocumentFactory cannot be cast to org.dom4j.DocumentFactory
        at org.dom4j.DocumentFactory.getInstance(DocumentFactory.java:92)
        at org.hibernate.internal.util.xml.XMLHelper$1.doWork(XMLHelper.java:33)
        at org.hibernate.internal.util.xml.XMLHelper$1.doWork(XMLHelper.java:27)
        at org.hibernate.boot.registry.classloading.internal.ClassLoaderServiceImpl.workWithClassLoader(ClassLoaderServiceImpl.java:358)
        at org.hibernate.internal.util.xml.XMLHelper.<init>(XMLHelper.java:26)
        at org.hibernate.envers.boot.internal.EnversServiceImpl.initialize(EnversServiceImpl.java:115)
        at org.hibernate.envers.boot.internal.AdditionalJaxbMappingProducerImpl.produceAdditionalMappings(AdditionalJaxbMappingProducerImpl.java:99)
        at org.hibernate.boot.model.process.spi.MetadataBuildingProcess.complete(MetadataBuildingProcess.java:288)
        at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.metadata(EntityManagerFactoryBuilderImpl.java:848)
        at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:875)
        at org.jboss.as.jpa.hibernate5.TwoPhaseBootstrapImpl.build(TwoPhaseBootstrapImpl.java:44)
        at org.jboss.as.jpa.service.PersistenceUnitServiceImpl$1$1.run(PersistenceUnitServiceImpl.java:167)
        ... 7 more

2026-06-09 14:08:15,494 ERROR [org.jboss.as.controller.management-operation] (ServerService Thread Pool -- 102) WFLYCTL0013: Falha na operação ("deploy") - endereço ([("deployment" => "SIOSP")]) - falha na descrição: {"WFLYCTL0080: Falha de serviços" => {"jboss.persistenceunit.\"siosp-1.0.0.59-1.0.0.59-b370.ear/siosp-api.war#OracleSiospDS\"" => "java.lang.ClassCastException: org.dom4j.DocumentFactory cannot be cast to org.dom4j.DocumentFactory
    Caused by: java.lang.ClassCastException: org.dom4j.DocumentFactory cannot be cast to org.dom4j.DocumentFactory"}}
2026-06-09 14:08:15,495 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 102) WFLYSRV0021: O procedimento da implantação "siosp-1.0.0.59-1.0.0.59-b370.ear" foi revertido com falha de mensagem
{"WFLYCTL0080: Falha de serviços" => {"jboss.persistenceunit.\"siosp-1.0.0.59-1.0.0.59-b370.ear/siosp-api.war#OracleSiospDS\"" => "java.lang.ClassCastException: org.dom4j.DocumentFactory cannot be cast to org.dom4j.DocumentFactory
    Caused by: java.lang.ClassCastException: org.dom4j.DocumentFactory cannot be cast to org.dom4j.DocumentFactory"}}
2026-06-09 14:08:15,497 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 105) WFLYJPA0011: Interrompendo unidade de persistência (fase 1 de 2) Serviço 'siosp-1.0.0.59-1.0.0.59-b370.ear/siosp-api.war#OracleSiospDS'
2026-06-09 14:08:15,497 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-2) WFLYJCA0019: Serviço de driver interrompido com driver-name = siosp-api.war_oracle.jdbc.OracleDriver_11_2
2026-06-09 14:08:15,525 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0208: Interrompendo a subimplantação (runtime-name: siosp-web.war) em 30ms
2026-06-09 14:08:15,539 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0208: Interrompendo a subimplantação (runtime-name: siosp-api.war) em 43ms
2026-06-09 14:08:15,552 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0028: Implantação encerrada SIOSP (runtime-name: siosp-1.0.0.59-1.0.0.59-b370.ear) em 56ms
2026-06-09 14:30:28,161 INFO  [org.jboss.as.server] (Thread-2) WFLYSRV0220: Foi solicitado o desligamento do servidor através de um sinal de OS
2026-06-09 14:30:28,166 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-5) WFLYJCA0010: Fonte de dados sem limite [java:/jdbc/OracleSiospDS]
2026-06-09 14:30:28,171 INFO  [org.jboss.modcluster] (MSC service thread 1-8) MODCLUSTER000021: All pending requests drained from default-host:/wildfly-services in 0,0 seconds
2026-06-09 14:30:28,175 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-5) WFLYMAIL0002: Sessão de correio não limitado [java:jboss/mail/Default]
2026-06-09 14:30:28,176 INFO  [org.wildfly.extension.messaging-activemq] (MSC service thread 1-2) WFLYMSGAMQ0006: Objeto de mensagem não vinculado ao nome jndi java:jboss/DefaultJMSConnectionFactory
2026-06-09 14:30:28,177 INFO  [org.wildfly.extension.messaging-activemq] (ServerService Thread Pool -- 105) WFLYMSGAMQ0006: Objeto de mensagem não vinculado ao nome jndi java:/ConnectionFactory
2026-06-09 14:30:28,177 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-4) WFLYJCA0011: JCA sem limite ConnectionFactory [java:/JmsXA]
2026-06-09 14:30:28,184 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-6) WFLYUT0019: Interrompendo host default-host
2026-06-09 14:30:28,184 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-5) WFLYJCA0019: Serviço de driver interrompido com driver-name = ojdbc8.jar
2026-06-09 14:30:28,186 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-5) WFLYSRV0028: Implantação encerrada ojdbc8.jar (runtime-name: ojdbc8.jar) em 23ms
2026-06-09 14:30:28,187 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-5) WFLYUT0008: Ouvinte  HTTPS Undertow https está suspendendo
2026-06-09 14:30:28,187 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-6) WFLYUT0008: Ouvinte  AJP Undertow ajp está suspendendo
2026-06-09 14:30:28,187 INFO  [org.jboss.modcluster] (ServerService Thread Pool -- 102) MODCLUSTER000002: Initiating mod_cluster shutdown
2026-06-09 14:30:28,189 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-5) WFLYUT0007: Ouvinte HTTPS Undertow https interrompido, estava vinculado a  10.116.94.206:8803
2026-06-09 14:30:28,189 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-6) WFLYUT0007: Ouvinte AJP Undertow ajp interrompido, estava vinculado a  10.116.94.206:8369
2026-06-09 14:30:28,195 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 111) WFLYCLINF0003: Cache client-mappings encerrado a partir do recipiente ejb
2026-06-09 14:30:28,245 INFO  [org.apache.activemq.artemis.ra] (ServerService Thread Pool -- 103) AMQ151003: resource adaptor stopped
2026-06-09 14:30:28,283 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 103) AMQ221002: Apache ActiveMQ Artemis Message Broker version 1.5.5.015-redhat-00001 [3fa69272-53d0-11f1-89ef-00505686b59d] stopped, uptime 5 days 21 hours
2026-06-09 14:30:28,284 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-5) WFLYUT0008: Ouvinte  HTTP Undertow default está suspendendo
2026-06-09 14:30:28,285 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-5) WFLYUT0007: Ouvinte HTTP Undertow default interrompido, estava vinculado a  10.116.94.206:8440
2026-06-09 14:30:28,285 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0004: Interrompendo 1.4.18.SP11-redhat-00001 Undertow
2026-06-09 14:30:28,317 ERROR [stderr] (main) java.io.IOException: Descritor de arquivo inválido
2026-06-09 14:30:28,317 ERROR [stderr] (main)   at java.io.FileInputStream.available0(Native Method)
2026-06-09 14:30:28,317 ERROR [stderr] (main)   at java.io.FileInputStream.available(FileInputStream.java:306)
2026-06-09 14:30:28,317 ERROR [stderr] (main)   at java.io.BufferedInputStream.read(BufferedInputStream.java:353)
2026-06-09 14:30:28,317 ERROR [stderr] (main)   at java.io.FilterInputStream.read(FilterInputStream.java:107)
2026-06-09 14:30:28,317 ERROR [stderr] (main)   at org.jboss.as.process.stdin.BaseNCodecInputStream.read(BaseNCodecInputStream.java:161)
2026-06-09 14:30:28,317 ERROR [stderr] (main)   at org.jboss.as.process.stdin.Base64InputStream.read(Base64InputStream.java:44)
2026-06-09 14:30:28,317 ERROR [stderr] (main)   at org.jboss.as.process.stdin.BaseNCodecInputStream.read(BaseNCodecInputStream.java:100)
2026-06-09 14:30:28,317 ERROR [stderr] (main)   at org.jboss.as.process.stdin.Base64InputStream.read(Base64InputStream.java:44)
2026-06-09 14:30:28,317 ERROR [stderr] (main)   at org.jboss.as.process.protocol.StreamUtils.readUTFChar(StreamUtils.java:242)
2026-06-09 14:30:28,317 ERROR [stderr] (main)   at org.jboss.as.process.protocol.StreamUtils.readUTFZBytes(StreamUtils.java:233)
2026-06-09 14:30:28,317 ERROR [stderr] (main)   at org.jboss.as.server.DomainServerMain.main(DomainServerMain.java:136)
2026-06-09 14:30:28,317 ERROR [stderr] (main)   at org.jboss.modules.Module.run(Module.java:341)
2026-06-09 14:30:28,318 ERROR [stderr] (main)   at org.jboss.modules.Main.main(Main.java:525)
2026-06-09 14:30:28,318 INFO  [org.jboss.as] (MSC service thread 1-1) WFLYSRV0050: JBoss EAP 7.1.6.GA (WildFly Core 3.0.21.Final-redhat-00001) interrompido em 143ms
[root@sbrdeapllx099 bin]#
