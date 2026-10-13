# 1. Log do boot de 08/out: erro no deploy, no datasource ou no carregamento de privilégios?
ls -ltr /logs/jboss/jboss-eap/standalone/simkt-backend-vm/
grep -iE "ERROR|WARN|Privilege|datasource|WFLYCTL" /logs/jboss/jboss-eap/standalone/simkt-backend-vm/server.log.2026-10-08 | head -100

# 2. Status do deployment e teste do datasource
/opt/jboss-eap/bin/jboss-cli.sh -c --command="deployment-info"
/opt/jboss-eap/bin/jboss-cli.sh -c --command="/subsystem=datasources:read-resource"
# depois, com o nome do DS:
/opt/jboss-eap/bin/jboss-cli.sh -c --command="/subsystem=datasources/data-source=<DS>:test-connection-in-pool"
