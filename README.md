O comando já está pronto. Na 471, dentro do CLI ([domain@localhost:9999 /]):

/profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/OracleSirurDS":write-attribute(name=password,value="usururng")

Confira se gravou:

/profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/OracleSirurDS":read-attribute(name=password)

Depois de avisar a sala, reinicie:

/server-group=sifec-intranet:restart-servers(blocking=true)

E teste a conexão:

/host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473/subsystem=datasources/data-source="jdbc/OracleSirurDS":test-connection-in-pool

Se voltar "result" => [true], o banco do SIRUR está ok.




Foi concluída a análise do deploy do SIGEC Portabilidade. As dependências de aplicação foram regularizadas (framework.jar, framework_sisgd.jar, wmq.jmsra.rar e gec-ear.ear). O bloqueio atual não está relacionado aos artefatos da aplicação. Comparando com o ambiente legado, foram identificadas configurações de infraestrutura não migradas para o ambiente novo: os datasources java:/jdbc/DB2SigecDS e java:/jdbc/DB2SiempDS, além da configuração JMS baseada no binding java:global/remoteJMS, resource adapter generic-ra e arquivo azuresb.properties. Essas configurações existem no legado através de comandos CLI (commands.cli) e não estão presentes no ambiente atual, o que explica as dependências JNDI não atendidas reportadas no boot do JBoss.
 
