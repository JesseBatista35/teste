[root@sbrdeapllx099 bin]# ./jboss-cli.sh -c "/profile=default/server-config=siosp_node1_lx099:stop"
Failed to connect to the controller: The controller is not available at localhost:9990: java.net.ConnectException: WFLYPRT0053: Não foi possível conectar-se oa remote+http://localhost:9990. A conexão falhou: WFLYPRT0053: Não foi possível conectar-se oa remote+http://localhost:9990. A conexão falhou: Conexão recusada
[root@sbrdeapllx099 bin]#
[root@sbrdeapllx099 bin]#
[root@sbrdeapllx099 bin]#
[root@sbrdeapllx099 bin]#
[root@sbrdeapllx099 bin]# kill -TERM 26176
[root@sbrdeapllx099 bin]# ps aux | grep siosp_node1_lx099 | grep java
[root@sbrdeapllx099 bin]# ^C
[root@sbrdeapllx099 bin]# tail -50 /opt/jboss/jboss-eap/hc/log/servers/siosp_node1_lx099/server.log
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
