
[p585600@caddeapllx955 ~]$ LOG=/logs/jboss/jboss-eap/standalone/sigsj-intranet/server.log
[p585600@caddeapllx955 ~]$ ls -l /opt/jboss-eap/standalone/deployments/
total 57988
-rw-r--r-- 1 jboss jboss  7497817 out 28 16:23 ojdbc8.jar
-rw-r--r-- 1 jboss jboss       10 out 28 16:23 ojdbc8.jar.deployed
-rwxrwxr-x 1 jboss jboss     8888 jun 23  2021 README.txt
-rwxrw-rw- 1 jboss jboss 51856831 out 28 16:00 sigsj_intranet-ear.ear
-rw-r--r-- 1 jboss jboss     1656 out 29 09:58 sigsj_intranet-ear.ear.failed
[p585600@caddeapllx955 ~]$ grep -nE "WFLYSRV0025|WFLYSRV0026|WFLYEE0047|WFLYCTL0412|SIGSJ04|ORA-|Caused by|WFLYUT0021" $LOG | tail -25
26:2026-10-29 09:58:24,773 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-4) WFLYJCA0010: Fonte de dados sem limite [java:jboss/datasources/SIGSJ04]
219:2026-10-29 09:58:34,364 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-1) WFLYJCA0001: Fonte de dados vinculada[java:jboss/datasources/SIGSJ04]
250:Caused by: java.lang.NumberFormatException: For input string: "${CONNECTOR-FARM-PORT}"
263:    Caused by: java.lang.NumberFormatException: For input string: \"${CONNECTOR-FARM-PORT}\""},
264:    "WFLYCTL0412: Serviços necessários que não estão instalados:" => [
287:2026-10-29 09:58:37,691 ERROR [org.jboss.as] (Controller Boot Thread) WFLYSRV0026: JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001) iniciado (com erros) em 9667ms - Iniciado(s) 539 de serviços 754 (11 serviços falharam ou tinham dependências ausentes, os serviços 369 estão lentos, passivos ou sob demanda)
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$ tail -f $LOG
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

