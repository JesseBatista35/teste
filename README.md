-sh-4.2$ sudo tail -300 /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | grep -E "ERROR|FAILED|Exception|Caused by" | tail -50
[sudo] senha para p585600:
2026-05-25 14:30:04,792 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("add") - endereço ([
2026-05-25 14:30:04,973 ERROR [org.jboss.as] (Controller Boot Thread) WFLYSRV0026: JBoss EAP 7.4.8.GA (WildFly Core 15.0.19.Final-redhat-00001) iniciado (com erros) em 9319ms - Iniciado(s) 2890 de serviços 3775 (648 serviços falharam ou tinham dependências ausentes, os serviços 437 estão lentos, passivos ou sob demanda)
-sh-4.2$ tail -500 /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | tail -100
Severity: WARNING
Section: 20.7
Description: Invalid config-property-type for ManagedConnectionFactory.
Code: Class: com.ibm.mq.connector.outbound.ManagedQueueConnectionFactoryImpl Property: rescanInterval Type: int

Severity: WARNING
Section: 20.7
Description: Invalid config-property-type for ResourceAdapter.
Code: Class: com.ibm.mq.connector.ResourceAdapterImpl Property: traceLevel Type: int

Severity: WARNING
Section: 20.7
Description: Invalid config-property-type for ManagedConnectionFactory.
Code: Class: com.ibm.mq.connector.outbound.ManagedTopicConnectionFactoryImpl Property: sslResetCount Type: int

Severity: WARNING
Section: 20.7
Description: Invalid config-property-type for ManagedConnectionFactory.
Code: Class: com.ibm.mq.connector.outbound.ManagedConnectionFactoryImpl Property: port Type: int

Severity: WARNING
Section: 20.7
Description: Invalid config-property-type for ManagedConnectionFactory.
Code: Class: com.ibm.mq.connector.outbound.ManagedTopicConnectionFactoryImpl Property: statusRefreshInterval Type: int

Severity: WARNING
Section: 20.7
Description: Invalid config-property-type for ResourceAdapter.
Code: Class: com.ibm.mq.connector.ResourceAdapterImpl Property: logWriterEnabled Type: boolean

Severity: WARNING
Section: 20.7
Description: Invalid config-property-type for ResourceAdapter.
Code: Class: com.ibm.mq.connector.ResourceAdapterImpl Property: startupRetryCount Type: int

Severity: WARNING
Section: 20.7
Description: Invalid config-property-type for ManagedConnectionFactory.
Code: Class: com.ibm.mq.connector.outbound.ManagedTopicConnectionFactoryImpl Property: sslFipsRequired Type: boolean

Severity: WARNING
Section: 20.7
Description: Invalid config-property-type for ManagedConnectionFactory.
Code: Class: com.ibm.mq.connector.outbound.ManagedConnectionFactoryImpl Property: failIfQuiesce Type: boolean

Severity: WARNING
Section: 20.7
Description: Invalid config-property-type for ManagedConnectionFactory.
Code: Class: com.ibm.mq.connector.outbound.ManagedTopicConnectionFactoryImpl Property: sendCheckCount Type: int

Severity: WARNING
Section: 20.7
Description: Invalid config-property-type for ManagedConnectionFactory.
Code: Class: com.ibm.mq.connector.outbound.ManagedQueueConnectionFactoryImpl Property: sslResetCount Type: int

Severity: WARNING
Section: 20.7
Description: Invalid config-property-type for ManagedConnectionFactory.
Code: Class: com.ibm.mq.connector.outbound.ManagedConnectionFactoryImpl Property: pubAckInterval Type: int

Severity: WARNING
Section: 20.7
Description: Invalid config-property-type for ManagedConnectionFactory.
Code: Class: com.ibm.mq.connector.outbound.ManagedTopicConnectionFactoryImpl Property: cleanupInterval Type: long

Severity: WARNING
Section: 20.7
Description: Invalid config-property-type for ManagedConnectionFactory.
Code: Class: com.ibm.mq.connector.outbound.ManagedConnectionFactoryImpl Property: rescanInterval Type: int

Severity: WARNING
Section: 20.7
Description: Invalid config-property-type for AdminObject.
Code: Class: com.ibm.mq.connector.outbound.MQQueueProxy Property: unmappableReplacement Type: byte

2026-05-25 14:30:03,784 INFO  [org.jboss.as.connector.deployers.RaXmlDeployer] (MSC service thread 1-1) IJ020002: Deployed: file:/opt/jboss-eap/standalone/tmp/vfs/temp/temp3cdc93a58dbe5382/content-80981c2e12178cb2/contents/
2026-05-25 14:30:03,848 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-1) WFLYJCA0002: Conectores de Jakarta vinculados AdminObject [java:/jms/LQ_REQ_SICMU_ENV]
2026-05-25 14:30:03,848 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-1) WFLYJCA0002: Conectores de Jakarta vinculados ConnectionFactory [java:/jms/SicmuConnectionFactory]
2026-05-25 14:30:03,961 WARN  [org.wildfly.clustering.web.undertow] (MSC service thread 1-3) WFLYCLWEBUT0005: Nenhum provedor de gerenciamento de sessão distribuível encontrado para SICMU-web.war; usando o provedor herdado baseado em <replication-config/>
2026-05-25 14:30:04,032 WARN  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0131: Jakarta Enterprise Beans br.gov.caixa.sicmu.operacaoHabitacional.service.IncluiOperacaoHabitacionalServiceBean não devem ter um método final ou estático (parseData)
2026-05-25 14:30:04,112 INFO  [org.jipijapa] (MSC service thread 1-2) JIPIORMV53020253: Cache de segundo nível habilitado para SICMU-ear.ear/SICMU-ejb.jar#SICMU-ejb
2026-05-25 14:30:04,792 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("add") - endereço ([
    ("subsystem" => "jgroups"),
    ("stack" => "tcp")
]) - falha na descrição: {
    "WFLYCTL0412: Serviços necessários que não estão instalados:" => ["org.wildfly.clustering.jgroups.channel-factory.tcp.\"org.jgroups.protocols.TCPPING\""],
    "WFLYCTL0180: Os serviços com falta/indisponibilidade de dependências " => ["org.wildfly.clustering.jgroups.channel-factory.tcp faltam [org.wildfly.clustering.jgroups.channel-factory.tcp.\"org.jgroups.protocols.TCPPING\"]"]
}
2026-05-25 14:30:04,803 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 40) WFLYSRV0010: "applicationinsights-agent.jar" foi implantado (runtime-name: "applicationinsights-agent.jar")
2026-05-25 14:30:04,804 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 40) WFLYSRV0010: "framework.jar" foi implantado (runtime-name: "framework.jar")
2026-05-25 14:30:04,804 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 40) WFLYSRV0010: "wmq.jmsra.rar" foi implantado (runtime-name: "wmq.jmsra.rar")
2026-05-25 14:30:04,804 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 40) WFLYSRV0010: "SICMU-ear.ear" foi implantado (runtime-name: "SICMU-ear.ear")
2026-05-25 14:30:04,911 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0183: Relatório
 de status de serviçoWFLYCTL0184: Não falta/insatisfaz nenhuma das dependências:
service org.wildfly.clustering.jgroups.channel-factory.tcp."org.jgroups.protocols.TCPPING" (faltam) dependentes: [service org.wildfly.clustering.jgroups.channel-factory.tcp]
WFLYCTL0448: 641 serviços adicionais estão inativos devido a ausência ou falha das suas dependências
2026-05-25 14:30:04,958 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Retomando servidor
2026-05-25 14:30:04,973 ERROR [org.jboss.as] (Controller Boot Thread) WFLYSRV0026: JBoss EAP 7.4.8.GA (WildFly Core 15.0.19.Final-redhat-00001) iniciado (com erros) em 9319ms - Iniciado(s) 2890 de serviços 3775 (648 serviços falharam ou tinham dependências ausentes, os serviços 437 estão lentos, passivos ou sob demanda)
2026-05-25 14:30:04,974 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0060: A interface de gerenciamento http escutando em http://0.0.0.0:9990/management
2026-05-25 14:30:04,974 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0051: O console de administração escutando em http://0.0.0.0:9990
-sh-4.2$ ls -lah /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/
total 328K
drwxr-xr-x 2 jboss jboss  195 Mai 25 14:29 .
drwxr-xr-x 3 jboss jboss   35 Mai 22 10:16 ..
-rw-r--r-- 1 jboss jboss 176K Mai 25 14:29 backupgc.log.current
-rw-r--r-- 1 root  root  1,4K Mai 25 14:29 console-stdout.log
-rw-r--r-- 1 jboss jboss  16K Mai 25 14:52 gc.log.0.current
-rw-r--r-- 1 jboss jboss  94K Mai 25 14:30 server.log
-rw-r--r-- 1 jboss jboss  23K Mai 22 10:22 server.log.2026-05-22.gz
-rw-r--r-- 1 jboss jboss  706 Mai 23 22:39 server.log.2026-05-23.gz
-rw-r--r-- 1 root  root  7,4K Mai 25 14:24 server.log.2026-05-24
-sh-4.2$
