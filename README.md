[p585600@caddeapllx2725 deployments]$ ls -ltrh
total 66M
-rwxrwxr-x 1 jboss jboss 8,7K jun 23  2021 README.txt
-rw-r--r-- 1 jboss jboss  36M jul 23 15:17 applicationinsights-agent.jar
-rwxrw-rw- 1 jboss jboss  30M ago  7 21:27 siacc-ear.ear
-rw-r--r-- 1 jboss jboss   57 ago 10 07:40 applicationinsights-agent.jar.failed
-rw-r--r-- 1 jboss jboss   57 ago 10 07:40 siacc-ear.ear.failed
[p585600@caddeapllx2725 deployments]$ cat /opt/jboss-eap/standalone/deployments/siacc-ear.ear.failed
"WFLYCTL0063: A operação de composição foi revertida"[p585600@caddeapllx2725 deployments]$
[p585600@caddeapllx2725 deployments]$ cat /opt/jboss-eap/standalone/deployments/applicationinsights-agent.jar.failed
"WFLYCTL0063: A operação de composição foi revertida"[p585600@caddeapllx2725 deployments]$
[p585600@caddeapllx2725 deployments]$
[p585600@caddeapllx2725 deployments]$
[p585600@caddeapllx2725 deployments]$ grep -i -E "DEPLOYMENT_FALIED|ERROR|Exeception" /logs/jboss/jboss-eap/standalone/siacc-tela-branca/server.log | tail -80
2026-08-10 07:40:50,331 ERROR [org.jboss.msc.service.fail] (MSC service thread 1-2) MSC000001: Failed to start service org.wildfly.undertow.listener.default: org.jboss.msc.service.StartException in service org.wildfly.undertow.listener.default: Endereço já em uso /0.0.0.0:8080
2026-08-10 07:40:50,331 ERROR [org.jboss.msc.service.fail] (MSC service thread 1-1) MSC000001: Failed to start service org.wildfly.undertow.listener.ajp: org.jboss.msc.service.StartException in service org.wildfly.undertow.listener.ajp: Endereço já em uso /0.0.0.0:8009
2026-08-10 07:40:50,391 ERROR [org.jboss.msc.service.fail] (MSC service thread 1-4) MSC000001: Failed to start service org.wildfly.management.http.extensible: org.jboss.msc.service.StartException in service org.wildfly.management.http.extensible: java.net.BindException: Endereço já em uso /0.0.0.0:9990
2026-08-10 07:40:53,426 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("add") - endereço ([
2026-08-10 07:40:53,426 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("add") - endereço ([
2026-08-10 07:40:53,471 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("add") - endereço ([
2026-08-10 07:40:53,472 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("add") - endereço ([
2026-08-10 07:40:53,472 ERROR [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0459: Acionando reversão devido à falta de serviços de gerenciamento.
2026-08-10 07:40:53,472 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("add") - endereço ([
2026-08-10 07:40:53,513 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 42) WFLYSRV0021: O procedimento da implantação "siacc-ear.ear" foi revertido com mensagem de falha: undefined
2026-08-10 07:40:53,513 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 42) WFLYSRV0021: O procedimento da implantação "applicationinsights-agent.jar" foi revertido com mensagem de falha: undefined
[p585600@caddeapllx2725 deployments]$
[p585600@caddeapllx2725 deployments]$
[p585600@caddeapllx2725 deployments]$
[p585600@caddeapllx2725 deployments]$
[p585600@caddeapllx2725 deployments]$
