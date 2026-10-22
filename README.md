root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]# LOG=/logs/jboss/jboss-eap/standalone/sigsj-internet/server.log
JH=/opt/jboss-eap
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]# grep -nE "WFLYCTL0412|WFLYCTL0180|SIGSJ04|WFLYJCA" $LOG | tail -20
338:2026-10-22 14:19:16,432 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-4) WFLYJCA0011: Sem limite de conectores de Jakarta ConnectionFactory [java:/JmsXA]
339:2026-10-22 14:19:16,439 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-2) WFLYJCA0019: Serviço de driver interrompido com nome-do-driver = h2
464:2026-10-22 14:19:27,633 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 42) WFLYJCA0004: Implantação do driver compatível-JDBC class org.h2.Driver (versão 1.4)
471:2026-10-22 14:19:27,748 INFO  [org.jboss.as.connector] (MSC service thread 1-4) WFLYJCA0009: Inicialização do Subsistema Jakarta Connectors (WildFly/IronJacamar 1.5.17.Final-redhat-00001)
473:2026-10-22 14:19:27,749 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-4) WFLYJCA0018: Serviço de driver iniciado com nome-do-driver = h2
496:2026-10-22 14:19:28,761 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-3) WFLYJCA0001: Fonte de dados vinculada[java:jboss/datasources/ExampleDS]
533:2026-10-22 14:19:31,237 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-2) WFLYJCA0007: Criação de conexão registrada java:/JmsXA
536:2026-10-22 14:19:31,379 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-2) WFLYJCA0002: Conectores de Jakarta vinculados ConnectionFactory [java:/JmsXA]
537:2026-10-22 14:19:31,379 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-2) WFLYJCA0118: Vínculo de criação de conexão chamado java:/JmsXA para o alias java:jboss/DefaultJMSConnectionFactory
548:2026-10-22 14:19:35,270 INFO  [org.jboss.as.jpa] (MSC service thread 1-2) WFLYJPA0002: Ler persistence.xml para SIGSJ04
549:2026-10-22 14:19:35,527 INFO  [org.jipijapa] (MSC service thread 1-1) JIPIORMV53020253: Cache de segundo nível habilitado para sigsj_internet-ear.ear/sigsj_internet-war-2.67.war#SIGSJ04
555:2026-10-22 14:19:36,141 INFO  [org.jipijapa] (MSC service thread 1-4) JIPIORMV53020253: Cache de segundo nível habilitado para sigsj_internet-ear.ear/sigsj_internet-war-2.67.war#SIGSJ04
556:2026-10-22 14:19:36,212 WARN  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-4) WFLYJCA0003: Não foi possível instanciar a classe do driver "org.olap4j.driver.xmla.XmlaOlap4jDriver": java.lang.NoSuchMethodException: org.olap4j.driver.xmla.XmlaOlap4jDriver.<init>()
557:2026-10-22 14:19:36,341 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-4) WFLYJCA0004: Implantação do driver compatível-JDBC class oracle.jdbc.OracleDriver (versão 23.26)
558:2026-10-22 14:19:36,406 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-2) WFLYJCA0018: Serviço de driver iniciado com nome-do-driver = sigsj_internet-war-2.67.war_oracle.jdbc.OracleDriver_23_26
560:    "WFLYCTL0412: Serviços necessários que não estão instalados:" => ["jboss.naming.context.java.jboss.datasources.SIGSJ04"],
561:    "WFLYCTL0180: Os serviços com falta/indisponibilidade de dependências " => [
562:        "jboss.persistenceunit.\"sigsj_internet-ear.ear/sigsj_internet-war-2.67.war#SIGSJ04\".__FIRST_PHASE__ faltam [jboss.naming.context.java.jboss.datasources.SIGSJ04]",
563:        "jboss.persistenceunit.\"sigsj_internet-ear.ear/sigsj_internet-war-2.67.war#SIGSJ04\" faltam [jboss.naming.context.java.jboss.datasources.SIGSJ04]"
570:service jboss.naming.context.java.jboss.datasources.SIGSJ04 (faltam) dependentes: [service jboss.persistenceunit."sigsj_internet-ear.ear/sigsj_internet-war-2.67.war#SIGSJ04", service jboss.persistenceunit."sigsj_internet-ear.ear/sigsj_internet-war-2.67.war#SIGSJ04".__FIRST_PHASE__]
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]# grep -nE "<datasource |<xa-datasource |<driver name" $JH/standalone/configuration/standalone-full-ha.xml
152:                <datasource jndi-name="java:jboss/datasources/ExampleDS" pool-name="ExampleDS" enabled="true" use-java-context="true" statistics-enabled="true">
161:                    <driver name="h2" module="com.h2database.h2">
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]# ls -d $JH/modules/com/* $JH/modules/system/layers/base/com/* 2>/dev/null | grep -iE "oracle|ibm|db2|microsoft|sqlserver|postgres"
/opt/jboss-eap/modules/system/layers/base/com/ibm
/opt/jboss-eap/modules/system/layers/base/com/microsoft
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]# cd /tmp && rm -rf intchk && mkdir intchk && cd intchk
[root@caddeapllx2854 intchk]#
[root@caddeapllx2854 intchk]#
[root@caddeapllx2854 intchk]#
[root@caddeapllx2854 intchk]# EAR=$(ls $JH/standalone/deployments/*.ear | head -1); echo $EAR
/opt/jboss-eap/standalone/deployments/sigsj_internet-ear.ear
[root@caddeapllx2854 intchk]#
[root@caddeapllx2854 intchk]#
[root@caddeapllx2854 intchk]#
[root@caddeapllx2854 intchk]# unzip -l $EAR | grep -iE "\.war|\.jar" | head
 59897381  10-22-2026 05:09   sigsj_internet-war-2.67.war
[root@caddeapllx2854 intchk]#
