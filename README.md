1. Corrigir a senha (CLI do 471):

/profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/OracleSicdtDS":write-attribute(name=password,value="pwcdtbd01")

2. Restart (ele aplica a senha nova e carrega as properties do SICDT):

/server-group=sifec-intranet:restart-servers(blocking=true)
/host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473:read-attribute(name=server-state)

Espere ficar running.

3. Testar de novo:

/host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473/subsystem=datasources/data-source="jdbc/OracleSicdtDS":test-connection-in-pool
[true]: pode seguir para o deploy do SICDT pela console (passo 4 da mensagem anterior).
Falhar de novo: me mande o erro. Pode ser senha diferente em DES, liberação de rede ou o nome do serviço do banco. Confirmamos com o Inocêncio.
