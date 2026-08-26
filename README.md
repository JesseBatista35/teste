
[root@caddeapllx2484 verificacao_sicmu2]# grep "ModuleNotFoundException" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | tail -5
    Caused by: org.jboss.modules.ModuleNotFoundException: br.gov.caixa.psc.connector"
Caused by: org.jboss.modules.ModuleNotFoundException: br.gov.caixa.psc.connector
Caused by: org.jboss.modules.ModuleNotFoundException: br.gov.caixa.psc.connector
    Caused by: org.jboss.modules.ModuleNotFoundException: br.gov.caixa.psc.connector",
    Caused by: org.jboss.modules.ModuleNotFoundException: br.gov.caixa.psc.connector"
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]# tail -f /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | grep --line-buffered "ISPN000299\|ERROR\|SEVERE"

