# Corpo da resposta 500 (a página de erro costuma trazer a exceção)
oc exec $P -- curl -s http://localhost:8080/login2/ | head -60

# Stacktrace gerado no server.log logo após o curl
oc exec $P -- tail -150 /opt/jboss/standalone/log/server.log | grep -E -A25 "ERROR|Exception|Caused by" | head -120


oc exec $P -- /opt/jboss/bin/jboss-cli.sh -c --command="/subsystem=datasources:read-children-names(child-type=data-source)"
# depois, com o nome que aparecer:
oc exec $P -- /opt/jboss/bin/jboss-cli.sh -c --command="/subsystem=datasources/data-source=NOME:test-connection-in-pool"
