Isso pode ser ambiente, do nosso lado. Vamos testar o datasource no CLI do 471:

/host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473/subsystem=datasources/data-source="jdbc/IdmsSiapxDS":test-connection-in-pool

E, no 473, a causa detalhada:

bash
grep -a -B2 -A25 "16:16:42,457" $LOG | grep -aE "Caused by|IdmsSiapx|08003|Exception" | head -20

Me mande as duas saídas. Se o teste der [true], a conexão pode ter caído e se recuperado, e basta o Matheus testar de novo. Se der erro, ajustamos o datasource IDMS, comparando com o 6.4.

Antes de mandar algo na sala, me passe essas saídas. Assim a mensagem sobre o CCR já vai com o diagnóstico completo.
