O _ORIGINAL conecta ([true]) com o mesmo usuário sccd e no mesmo banco. A única diferença é a senha: a do 6.4 está desatualizada, e a do _ORIGINAL é a vigente.

1. Ver a senha que funciona (CLI da 471)
/profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/SybaseSibanDS_ORIGINAL":read-attribute(name=password)
2. Gravar essa senha no SybaseSibanDS

Use este comando, trocando somente o que está entre as aspas de value="..." pela senha que apareceu no passo 1:

/profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/SybaseSibanDS":write-attribute(name=password,value="COLE_A_SENHA_DO_PASSO_1")

Se preferir, me manda a saída do passo 1 que eu te devolvo o comando já montado.

Confira se as duas senhas ficaram iguais:

/profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/SybaseSibanDS":read-attribute(name=password)
3. Restart e teste (avise a sala de novo)
/server-group=sifec-intranet:restart-servers(blocking=true)
/host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473/subsystem=datasources/data-source="jdbc/SybaseSibanDS":test-connection-in-pool
