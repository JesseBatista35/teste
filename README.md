Os comandos foram digitados no bash, não no CLI do JBoss. O prompt mudou para [root@cbrdeapllx471 ...]#, ou seja, você saiu do CLI. Entre de novo e rode lá dentro:

/opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=localhost:9999

Quando o prompt voltar para [domain@localhost:9999 /], rode:

/profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/SybaseSibanDS":write-attribute(name=password,value="adsads")

Confira:

/profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/SybaseSibanDS":read-attribute(name=password)

O resultado tem que ser "adsads".

Depois de avisar a sala, faça o restart e o teste:

/server-group=sifec-intranet:restart-servers(blocking=true)
/host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473/subsystem=datasources/data-source="jdbc/SybaseSibanDS":test-connection-in-pool

O esperado é "result" => [true].
