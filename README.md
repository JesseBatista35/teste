Aplicar no 7.4 (CLI do 471), um por vez
/profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/IdmsSiapxDS":write-attribute(name=check-valid-connection-sql,value="SELECT CURRENT DATE FROM SYSCA.SINGLETON_NULL")
/profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/IdmsSiapxDS":write-attribute(name=validate-on-match,value=true)
/profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/IdmsSiapxDS":write-attribute(name=idle-timeout-minutes,value=1)
/profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/IdmsSiapxDS":write-attribute(name=allocation-retry,value=3)
/profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/IdmsSiapxDS":write-attribute(name=allocation-retry-wait-millis,value=500)

Cada um deve voltar "outcome" => "success". Repare se a resposta traz "process-state" => "reload-required". Isso é provável, porque mudanças de pool normalmente só valem depois de um reload do servidor.

Depois dos 5 comandos

1. Limpar agora as conexões mortas do pool. Não derruba nada e já evita o erro até o reload:

/host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473/subsystem=datasources/data-source="jdbc/IdmsSiapxDS":flush-all-connection-in-pool

2. Se apareceu reload-required, a configuração nova só entra com reload do servidor, que reinicia todo o SIFEC por alguns minutos. Não faça agora sem combinar. Avise na sala e escolha um horário, por exemplo o fim do dia:

/server-group=sifec-intranet:reload-servers(blocking=true)

Me mande as saídas dos 5 comandos e do flush.
