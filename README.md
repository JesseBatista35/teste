sudo tail -100 /opt/jboss-eap/standalone/log/server.log | grep -E "ERROR|FAILED|Exception|Caused|iniciado|interrompido|implantado"





[root@caddeapllx2540 p585600]# tail -100 /opt/jboss-eap/standalone/log/server.log | grep -E "ERROR|FAILED|Exception|Caused|iniciado|interrompido|implantado"
2026-06-11 15:58:18,878 ERROR [org.jboss.as.controller.management-operation] (DeploymentScanner-threads - 1) WFLYCTL0013: Falha na operação ("deploy") - endereço ([("deployment" => "SICMU-ear.ear")]) - falha na descrição: {
2026-06-11 15:58:18,968 INFO  [org.jboss.as.server] (DeploymentScanner-threads - 1) WFLYSRV0010: "SICMU-ear.ear" foi implantado (runtime-name: "SICMU-ear.ear")
[root@caddeapllx2540 p585600]#
[root@caddeapllx2540 p585600]#
[root@caddeapllx2540 p585600]#
[root@caddeapllx2540 p585600]#
