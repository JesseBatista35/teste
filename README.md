1. Testar o _ORIGINAL (CLI da 471)
/host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473/subsystem=datasources/data-source="jdbc/SybaseSibanDS_ORIGINAL":test-connection-in-pool
/profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/SybaseSibanDS_ORIGINAL":read-attribute(name=user-name)
2a. Se o teste der [true]

Me manda o usuário que apareceu. Eu te passo os comandos para copiar usuário e senha dele para o SybaseSibanDS. Depois disso precisa de mais um restart.
