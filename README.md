2. Restart (na 471, depois dos 5 minutos)
/server-group=sifec-intranet:restart-servers(blocking=true)
3. Teste do datasource
/host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473/subsystem=datasources/data-source="jdbc/SybaseSibanDS":test-connection-in-pool

O esperado é "result" => [true].

4. Confirmar que tudo voltou

Na 471:

/server-group=sifec-intranet:read-children-resources(child-type=deployment)

Na 473, procure erros no startup:

sudo grep -nE "WFLYSRV0021|JZ006|WFLYSRV0025" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | tail -10

O WFLYSRV0025 indica que o servidor subiu. Se não aparecer JZ006 depois do horário do restart, o timeout está resolvido.
