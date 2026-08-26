
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]# grep -B 3 "ModuleNotFoundException" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | grep "^2026" | tail -5
2026-08-26 09:44:59,361 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-2) WFLYJCA0118: Vínculo de criação de conexão chamado java:/JmsXA para o alias java:jboss/DefaultJMSConnectionFactory
2026-08-26 09:44:59,380 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("deploy") - endereço ([("deployment" => "SICMU-ear.ear")]) - falha na descrição: {"WFLYCTL0080: Falha de serviços" => {
2026-08-26 09:50:32,929 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-3) WFLYJCA0118: Vínculo de criação de conexão chamado java:/JmsXA para o alias java:jboss/DefaultJMSConnectionFactory
2026-08-26 09:50:32,936 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("deploy") - endereço ([("deployment" => "SICMU-ear.ear")]) - falha na descrição: {"WFLYCTL0080: Falha de serviços" => {
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]# tail -f /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | grep --line-buffered -E "ISPN000299|ERROR|SEVERE"
^C
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]# exit
exit
-sh-4.2$ grep -B 3 "ModuleNotFoundException" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | grep "^2026" | tail -5
2026-08-26 09:44:59,361 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-2) WFLYJCA0118: Vínculo de criação de conexão chamado java:/JmsXA para o alias java:jboss/DefaultJMSConnectionFactory
2026-08-26 09:44:59,380 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("deploy") - endereço ([("deployment" => "SICMU-ear.ear")]) - falha na descrição: {"WFLYCTL0080: Falha de serviços" => {
2026-08-26 09:50:32,929 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-3) WFLYJCA0118: Vínculo de criação de conexão chamado java:/JmsXA para o alias java:jboss/DefaultJMSConnectionFactory
2026-08-26 09:50:32,936 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("deploy") - endereço ([("deployment" => "SICMU-ear.ear")]) - falha na descrição: {"WFLYCTL0080: Falha de serviços" => {
-sh-4.2$
