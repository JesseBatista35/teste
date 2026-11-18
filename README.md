Quando o CLI responder

1. O servidor voltou?

/host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473:read-attribute(name=server-state)

Tem que vir running, e não mais reload-required.

2. As aplicações subiram? No 473:

bash
grep -aE "WFLYSRV0010|WFLYSRV0021|WFLYSRV0025|WFLYSRV0026" $LOG | tail -25
Cada aplicação ativa deve aparecer com WFLYSRV0010 ... foi implantado: SIFEC, CCR, APX, GARANTIAS, ORIGINAÇÃO, MINUTAS, BAN, SICDT, PJ, MCM, BDCAIXA, FBN4, HUB-FRONTEND2, MINUTAS-FRONT e PARÂMETROS.
No final deve vir WFLYSRV0025 (iniciado) ou WFLYSRV0026 (iniciado com erros).

3. O IDMS está ok?

/host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473/subsystem=datasources/data-source="jdbc/IdmsSiapxDS":test-connection-in-pool

Me mande as três saídas. Se der WFLYSRV0026, vemos qual aplicação não voltou.
