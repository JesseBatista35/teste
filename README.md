O comando já está pronto. Na 471, dentro do CLI ([domain@localhost:9999 /]):

/profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/OracleSirurDS":write-attribute(name=password,value="usururng")

Confira se gravou:

/profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/OracleSirurDS":read-attribute(name=password)

Depois de avisar a sala, reinicie:

/server-group=sifec-intranet:restart-servers(blocking=true)

E teste a conexão:

/host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473/subsystem=datasources/data-source="jdbc/OracleSirurDS":test-connection-in-pool

Se voltar "result" => [true], o banco do SIRUR está ok.
