Prezados, bom dia.

Realizada a implementação da variável ENDPOINT_MICRO no servidor JBoss EAP do sistema SIFPP (ambiente DES, VM srjdeapllx158), conforme solicitado.

Resumo da execução:

Servidor identificado como operando em Domain Mode (não Standalone), com configuração centralizada via domain.xml/host.xml através do domain controller.
Variável criada a nível de server-group "sifpp" (dedicado exclusivamente aos deployments sifpp-ear.ear e DBConnect.ear), via jboss-cli, com o seguinte conteúdo:

ENDPOINT_MICRO = https://sifpp-micro-des.apps.nprd.caixa

Por se tratar de propriedade do tipo boot-time, foi necessário efetuar stop/start completo do server-config srjdeapllx158_sifpp_intra_8081 para que a variável fosse carregada na JVM (reload isolado não é suficiente para esse tipo de propriedade).
Validação pós-implementação:
Confirmada a presença da variável na linha de comando do processo Java (ps -ef)
Confirmado status OK do deployment sifpp-ear.ear via jboss-cli
Log de aplicação (server-srjdeapllx158_sifpp_intra_8081.log) sem ocorrências de erro, com mensagem WFLYSRV0025 indicando start completo do servidor (1193 de 1527 serviços iniciados)
Pools de conexão a bancos de dados (db2qcc, mssfpp, db2ico, db2ogu, db2igf, db2iof, db2iso) operando normalmente

Observação: houve indisponibilidade momentânea do servidor srjdeapllx158_sifpp_intra_8081 durante a janela de restart, necessária para efetivação da variável.

Servidor operacional e validado. Solicito encerramento da demanda.

Atenciosamente,
Jessé Batista
