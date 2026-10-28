
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$ ls -l /opt/jboss-eap/standalone/deployments/
total 51528
-rwxrwxr-x 1 jboss jboss     8888 jun 23  2021 README.txt
-rwxrw-rw- 1 jboss jboss 51856831 out 28 16:00 sigsj_intranet-ear.ear
-rw-r--r-- 1 jboss jboss     3015 out 28 16:06 sigsj_intranet-ear.ear.failed
-rw-r--r-- 1 jboss jboss   884041 out 23 11:54 sirotcon-ejb.jar
-rw-r--r-- 1 jboss jboss       16 out 23 11:54 sirotcon-ejb.jar.deployed
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$ LOG=/logs/jboss/jboss-eap/standalone/sigsj-intranet/server.log
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$ grep -nE "ERROR|WFLYCTL0412|WFLYCTL0180|WFLYSRV0153|ClassNotFound|NoClassDefFound|DuplicateService|Caused by" $LOG | awk -F: '$1>0' | tail -40
1:2026-10-28 04:42:23,472 ERROR [org.jboss.modcluster] (UndertowEventHandlerAdapterService - 1) MODCLUSTER000040: Failed to parse response header from localhost/127.0.0.1:6666 for INFO command: java.lang.NumberFormatException: For input string: "/"
21:2026-10-28 04:42:23,473 ERROR [org.jboss.modcluster] (UndertowEventHandlerAdapterService - 1) MODCLUSTER000042: Error null sending INFO command to localhost/127.0.0.1:6666, configuration will be reset: null
22:2026-10-28 06:28:33,717 ERROR [org.jboss.modcluster] (UndertowEventHandlerAdapterService - 1) MODCLUSTER000040: Failed to parse response header from localhost/127.0.0.1:6666 for INFO command: java.lang.NumberFormatException: For input string: "/"
42:2026-10-28 06:28:33,718 ERROR [org.jboss.modcluster] (UndertowEventHandlerAdapterService - 1) MODCLUSTER000042: Error null sending INFO command to localhost/127.0.0.1:6666, configuration will be reset: null
467:2026-10-28 11:23:06,343 ERROR [org.jboss.msc.service.fail] (MSC service thread 1-1) MSC000001: Failed to start service jboss.deployment.subunit."sigsj_intranet-ear.ear"."sirotcon-ejb-2.3.0.1-farm.jar".INSTALL: org.jboss.msc.service.StartException in service jboss.deployment.subunit."sigsj_intranet-ear.ear"."sirotcon-ejb-2.3.0.1-farm.jar".INSTALL: WFLYSRV0153: Falha ao processar a fase INSTALL de subdeployment "sirotcon-ejb-2.3.0.1-farm.jar" of deployment "sigsj_intranet-ear.ear"
477:Caused by: java.lang.IllegalArgumentException: WFLYEE0047: Conflito de incompatibilidade de vínculo na java:global/SERVER fonte:org.jboss.as.ee.component.EnvEntryInjectionSource@ca49a78c
486:2026-10-28 11:23:06,526 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("deploy") - endereço ([("deployment" => "sigsj_intranet-ear.ear")]) - falha na descrição: {
487:    "WFLYCTL0080: Falha de serviços" => {"jboss.deployment.subunit.\"sigsj_intranet-ear.ear\".\"sirotcon-ejb-2.3.0.1-farm.jar\".INSTALL" => "WFLYSRV0153: Falha ao processar a fase INSTALL de subdeployment \"sirotcon-ejb-2.3.0.1-farm.jar\" of deployment \"sigsj_intranet-ear.ear\"
488:    Caused by: java.lang.IllegalArgumentException: WFLYEE0047: Conflito de incompatibilidade de vínculo na java:global/SERVER fonte:org.jboss.as.ee.component.EnvEntryInjectionSource@ca49a78c"},
489:    "WFLYCTL0412: Serviços necessários que não estão instalados:" => [
495:    "WFLYCTL0180: Os serviços com falta/indisponibilidade de dependências " => [
514:WFLYCTL0186: Serviços que falham na inicialização:      service jboss.deployment.subunit."sigsj_intranet-ear.ear"."sirotcon-ejb-2.3.0.1-farm.jar".INSTALL: WFLYSRV0153: Falha ao processar a fase INSTALL de subdeployment "sirotcon-ejb-2.3.0.1-farm.jar" of deployment "sigsj_intranet-ear.ear"
517:2026-10-28 11:23:06,618 ERROR [org.jboss.as] (Controller Boot Thread) WFLYSRV0026: JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001) iniciado (com erros) em 7099ms - Iniciado(s) 1584 de serviços 1814 (28 serviços falharam ou tinham dependências ausentes, os serviços 361 estão lentos, passivos ou sob demanda)
722:2026-10-28 11:28:42,118 ERROR [org.jboss.msc.service.fail] (MSC service thread 1-1) MSC000001: Failed to start service jboss.deployment.subunit."sigsj_intranet-ear.ear"."sirotcon-ejb-2.3.0.1-farm.jar".INSTALL: org.jboss.msc.service.StartException in service jboss.deployment.subunit."sigsj_intranet-ear.ear"."sirotcon-ejb-2.3.0.1-farm.jar".INSTALL: WFLYSRV0153: Falha ao processar a fase INSTALL de subdeployment "sirotcon-ejb-2.3.0.1-farm.jar" of deployment "sigsj_intranet-ear.ear"
732:Caused by: java.lang.IllegalArgumentException: WFLYEE0047: Conflito de incompatibilidade de vínculo na java:global/SERVER fonte:org.jboss.as.ee.component.EnvEntryInjectionSource@ca49a78c
741:2026-10-28 11:28:42,261 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("deploy") - endereço ([("deployment" => "sigsj_intranet-ear.ear")]) - falha na descrição: {
742:    "WFLYCTL0080: Falha de serviços" => {"jboss.deployment.subunit.\"sigsj_intranet-ear.ear\".\"sirotcon-ejb-2.3.0.1-farm.jar\".INSTALL" => "WFLYSRV0153: Falha ao processar a fase INSTALL de subdeployment \"sirotcon-ejb-2.3.0.1-farm.jar\" of deployment \"sigsj_intranet-ear.ear\"
743:    Caused by: java.lang.IllegalArgumentException: WFLYEE0047: Conflito de incompatibilidade de vínculo na java:global/SERVER fonte:org.jboss.as.ee.component.EnvEntryInjectionSource@ca49a78c"},
744:    "WFLYCTL0412: Serviços necessários que não estão instalados:" => [
750:    "WFLYCTL0180: Os serviços com falta/indisponibilidade de dependências " => [
769:WFLYCTL0186: Serviços que falham na inicialização:      service jboss.deployment.subunit."sigsj_intranet-ear.ear"."sirotcon-ejb-2.3.0.1-farm.jar".INSTALL: WFLYSRV0153: Falha ao processar a fase INSTALL de subdeployment "sirotcon-ejb-2.3.0.1-farm.jar" of deployment "sigsj_intranet-ear.ear"
772:2026-10-28 11:28:42,365 ERROR [org.jboss.as] (Controller Boot Thread) WFLYSRV0026: JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001) iniciado (com erros) em 7559ms - Iniciado(s) 1584 de serviços 1814 (28 serviços falharam ou tinham dependências ausentes, os serviços 361 estão lentos, passivos ou sob demanda)
979:2026-10-28 16:00:24,811 ERROR [org.jboss.msc.service.fail] (MSC service thread 1-4) MSC000001: Failed to start service jboss.deployment.subunit."sigsj_intranet-ear.ear"."sirotcon-ejb-2.3.0.1-farm.jar".INSTALL: org.jboss.msc.service.StartException in service jboss.deployment.subunit."sigsj_intranet-ear.ear"."sirotcon-ejb-2.3.0.1-farm.jar".INSTALL: WFLYSRV0153: Falha ao processar a fase INSTALL de subdeployment "sirotcon-ejb-2.3.0.1-farm.jar" of deployment "sigsj_intranet-ear.ear"
989:Caused by: java.lang.IllegalArgumentException: WFLYEE0047: Conflito de incompatibilidade de vínculo na java:global/SERVER fonte:org.jboss.as.ee.component.EnvEntryInjectionSource@ca49a78c
998:2026-10-28 16:00:24,933 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("deploy") - endereço ([("deployment" => "sigsj_intranet-ear.ear")]) - falha na descrição: {
999:    "WFLYCTL0080: Falha de serviços" => {"jboss.deployment.subunit.\"sigsj_intranet-ear.ear\".\"sirotcon-ejb-2.3.0.1-farm.jar\".INSTALL" => "WFLYSRV0153: Falha ao processar a fase INSTALL de subdeployment \"sirotcon-ejb-2.3.0.1-farm.jar\" of deployment \"sigsj_intranet-ear.ear\"
1000:    Caused by: java.lang.IllegalArgumentException: WFLYEE0047: Conflito de incompatibilidade de vínculo na java:global/SERVER fonte:org.jboss.as.ee.component.EnvEntryInjectionSource@ca49a78c"},
1001:    "WFLYCTL0412: Serviços necessários que não estão instalados:" => [
1007:    "WFLYCTL0180: Os serviços com falta/indisponibilidade de dependências " => [
1026:WFLYCTL0186: Serviços que falham na inicialização:      service jboss.deployment.subunit."sigsj_intranet-ear.ear"."sirotcon-ejb-2.3.0.1-farm.jar".INSTALL: WFLYSRV0153: Falha ao processar a fase INSTALL de subdeployment "sirotcon-ejb-2.3.0.1-farm.jar" of deployment "sigsj_intranet-ear.ear"
1029:2026-10-28 16:00:25,027 ERROR [org.jboss.as] (Controller Boot Thread) WFLYSRV0026: JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001) iniciado (com erros) em 7139ms - Iniciado(s) 1584 de serviços 1814 (28 serviços falharam ou tinham dependências ausentes, os serviços 361 estão lentos, passivos ou sob demanda)
1234:2026-10-28 16:06:00,636 ERROR [org.jboss.msc.service.fail] (MSC service thread 1-4) MSC000001: Failed to start service jboss.deployment.subunit."sigsj_intranet-ear.ear"."sirotcon-ejb-2.3.0.1-farm.jar".INSTALL: org.jboss.msc.service.StartException in service jboss.deployment.subunit."sigsj_intranet-ear.ear"."sirotcon-ejb-2.3.0.1-farm.jar".INSTALL: WFLYSRV0153: Falha ao processar a fase INSTALL de subdeployment "sirotcon-ejb-2.3.0.1-farm.jar" of deployment "sigsj_intranet-ear.ear"
1244:Caused by: java.lang.IllegalArgumentException: WFLYEE0047: Conflito de incompatibilidade de vínculo na java:global/SERVER fonte:org.jboss.as.ee.component.EnvEntryInjectionSource@ca49a78c
1253:2026-10-28 16:06:00,785 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("deploy") - endereço ([("deployment" => "sigsj_intranet-ear.ear")]) - falha na descrição: {
1254:    "WFLYCTL0080: Falha de serviços" => {"jboss.deployment.subunit.\"sigsj_intranet-ear.ear\".\"sirotcon-ejb-2.3.0.1-farm.jar\".INSTALL" => "WFLYSRV0153: Falha ao processar a fase INSTALL de subdeployment \"sirotcon-ejb-2.3.0.1-farm.jar\" of deployment \"sigsj_intranet-ear.ear\"
1255:    Caused by: java.lang.IllegalArgumentException: WFLYEE0047: Conflito de incompatibilidade de vínculo na java:global/SERVER fonte:org.jboss.as.ee.component.EnvEntryInjectionSource@ca49a78c"},
1256:    "WFLYCTL0412: Serviços necessários que não estão instalados:" => [
1262:    "WFLYCTL0180: Os serviços com falta/indisponibilidade de dependências " => [
1281:WFLYCTL0186: Serviços que falham na inicialização:      service jboss.deployment.subunit."sigsj_intranet-ear.ear"."sirotcon-ejb-2.3.0.1-farm.jar".INSTALL: WFLYSRV0153: Falha ao processar a fase INSTALL de subdeployment "sirotcon-ejb-2.3.0.1-farm.jar" of deployment "sigsj_intranet-ear.ear"
1284:2026-10-28 16:06:00,902 ERROR [org.jboss.as] (Controller Boot Thread) WFLYSRV0026: JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001) iniciado (com erros) em 7435ms - Iniciado(s) 1584 de serviços 1814 (28 serviços falharam ou tinham dependências ausentes, os serviços 361 estão lentos, passivos ou sob demanda)
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$ grep -nE "WFLYSRV0010|WFLYSRV0026|WFLYSRV0025|foi implantado|falhou" $LOG | tail -10
761:2026-10-28 11:28:42,332 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 40) WFLYSRV0010: "sirotcon-ejb.jar" foi implantado (runtime-name: "sirotcon-ejb.jar")
762:2026-10-28 11:28:42,332 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 40) WFLYSRV0010: "sigsj_intranet-ear.ear" foi implantado (runtime-name: "sigsj_intranet-ear.ear")
772:2026-10-28 11:28:42,365 ERROR [org.jboss.as] (Controller Boot Thread) WFLYSRV0026: JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001) iniciado (com erros) em 7559ms - Iniciado(s) 1584 de serviços 1814 (28 serviços falharam ou tinham dependências ausentes, os serviços 361 estão lentos, passivos ou sob demanda)
1018:2026-10-28 16:00:24,986 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 40) WFLYSRV0010: "sirotcon-ejb.jar" foi implantado (runtime-name: "sirotcon-ejb.jar")
1019:2026-10-28 16:00:24,986 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 40) WFLYSRV0010: "sigsj_intranet-ear.ear" foi implantado (runtime-name: "sigsj_intranet-ear.ear")
1029:2026-10-28 16:00:25,027 ERROR [org.jboss.as] (Controller Boot Thread) WFLYSRV0026: JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001) iniciado (com erros) em 7139ms - Iniciado(s) 1584 de serviços 1814 (28 serviços falharam ou tinham dependências ausentes, os serviços 361 estão lentos, passivos ou sob demanda)
1148:2026-10-28 16:05:54,853 INFO  [org.jboss.as.server.deployment.scanner] (DeploymentScanner-threads - 1) WFLYDS0015: A nova tentativa implantação de sigsj_intranet-ear.ear falhou
1273:2026-10-28 16:06:00,870 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 40) WFLYSRV0010: "sirotcon-ejb.jar" foi implantado (runtime-name: "sirotcon-ejb.jar")
1274:2026-10-28 16:06:00,871 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 40) WFLYSRV0010: "sigsj_intranet-ear.ear" foi implantado (runtime-name: "sigsj_intranet-ear.ear")
1284:2026-10-28 16:06:00,902 ERROR [org.jboss.as] (Controller Boot Thread) WFLYSRV0026: JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001) iniciado (com erros) em 7435ms - Iniciado(s) 1584 de serviços 1814 (28 serviços falharam ou tinham dependências ausentes, os serviços 361 estão lentos, passivos ou sob demanda)
[p585600@caddeapllx955 ~]$
