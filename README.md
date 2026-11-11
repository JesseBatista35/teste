Os comandos já estão prontos, é só colar no CLI da 471. A senha veio em texto simples, então ela vai direto no comando:

batch
/profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/SybaseSibanDS":write-attribute(name=connection-url,value="jdbc:sybase:Tds:10.116.92.132:4101/EMDB04?SERVER_INITIATED_TRANSACTIONS=false")
/profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/SybaseSibanDS":write-attribute(name=user-name,value="sccd")
/profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/SybaseSibanDS":write-attribute(name=password,value="abacaxi")
run-batch

Confira se ficou certo:

/profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/SybaseSibanDS":read-attribute(name=connection-url)

Depois de avisar a sala, faça o restart para aplicar:

/server-group=sifec-intranet:restart-servers(blocking=true)

E teste a conexão:

/host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473/subsystem=datasources/data-source="jdbc/SybaseSibanDS":test-connection-in-pool

Se voltar "result" => [true], o datasource do MCM está corrigido. Essa senha não deve ir para a sala.
