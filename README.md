
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]# grep -n 'jconnector' /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
44:        <property name="br.gov.caixa.psc.connector.util.Config" value="/opt/jboss-eap/standalone/configuration/sicmu_jconnector.properties" />
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]# /opt/jboss-eap/bin/jboss-cli.sh -c --command="/subsystem=datasources/data-source=db2cmu:test-connection-in-pool"
{
    "outcome" => "failed",
    "failure-description" => "WFLYJCA0040: falha ao invocar a operação: WFLYJCA0047: A conexão não é válida",
    "rolled-back" => true
}
[root@caddeapllx2540 /]# grep -niE 'connector|jconnector|cics' /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | tail -20
18351:Code: Class: com.ibm.mq.connector.ResourceAdapterImpl Property: startupRetryCount Type: int
18356:Code: Class: com.ibm.mq.connector.outbound.ManagedTopicConnectionFactoryImpl Property: sslFipsRequired Type: boolean
18361:Code: Class: com.ibm.mq.connector.outbound.ManagedConnectionFactoryImpl Property: failIfQuiesce Type: boolean
18366:Code: Class: com.ibm.mq.connector.outbound.ManagedTopicConnectionFactoryImpl Property: sendCheckCount Type: int
18371:Code: Class: com.ibm.mq.connector.outbound.ManagedQueueConnectionFactoryImpl Property: sslResetCount Type: int
18376:Code: Class: com.ibm.mq.connector.outbound.ManagedConnectionFactoryImpl Property: pubAckInterval Type: int
18381:Code: Class: com.ibm.mq.connector.outbound.ManagedTopicConnectionFactoryImpl Property: cleanupInterval Type: long
18386:Code: Class: com.ibm.mq.connector.outbound.ManagedConnectionFactoryImpl Property: rescanInterval Type: int
18391:Code: Class: com.ibm.mq.connector.outbound.MQQueueProxy Property: unmappableReplacement Type: byte
18397:2026-11-27 10:58:05,235 WARN  [org.apache.activemq.artemis.jms.server] (ServerService Thread Pool -- 73) AMQ122005: Invalid "host" value "0.0.0.0" detected for "http-connector" connector. Switching to "caddeapllx2540.agil.nprd.caixa.gov.br". If this new address is incorrect please manually configure the connector to use the proper one.
18399:2026-11-27 10:58:05,242 INFO  [org.jboss.as.connector.deployers.RaXmlDeployer] (MSC service thread 1-3) IJ020002: Deployed: file:/opt/jboss-eap/standalone/tmp/vfs/temp/tempc8f22681ec907050/content-4eeef70a0437b54f/contents/
18400:2026-11-27 10:58:05,244 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-3) WFLYJCA0002: Conectores de Jakarta vinculados AdminObject [java:/jms/LQ_REQ_SICMU_ENV]
18401:2026-11-27 10:58:05,244 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-3) WFLYJCA0002: Conectores de Jakarta vinculados ConnectionFactory [java:/jms/SicmuConnectionFactory]
18402:2026-11-27 10:58:05,337 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-2) WFLYJCA0007: Criação de conexão registrada java:/JmsXA
18406:2026-11-27 10:58:05,673 INFO  [org.jboss.as.connector.services.resourceadapters.ResourceAdapterActivatorService$ResourceAdapterActivator] (MSC service thread 1-2) IJ020002: Deployed: file://RaActivatoractivemq-ra
18407:2026-11-27 10:58:05,689 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-2) WFLYJCA0002: Conectores de Jakarta vinculados ConnectionFactory [java:/JmsXA]
18408:2026-11-27 10:58:05,689 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-2) WFLYJCA0118: Vínculo de criação de conexão chamado java:/JmsXA para o alias java:jboss/DefaultJMSConnectionFactory
18423:  at org.jboss.as.connector.subsystems.datasources.WildFlyDataSource.getConnection(WildFlyDataSource.java:64)
18532:  at org.jboss.as.connector.subsystems.common.pool.PoolOperations$TestConnectionInPool.invokeCommandOn(PoolOperations.java:243)
18533:  at org.jboss.as.connector.subsystems.common.pool.PoolOperations$1.execute(PoolOperations.java:99)
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]#
