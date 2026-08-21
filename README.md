Prezados, bom dia.

Realizada a implementação da variável ENDPOINT_MICRO no servidor JBoss EAP do sistema SIFPP (ambiente TQS, VM crjtqapllx003), conforme solicitado.

Resumo da execução:

Servidor operando em Domain Mode, com configuração centralizada via domain.xml/host.xml através do domain controller.
Variável criada a nível de server-group "sifpp" (dedicado ao deployment sifpp-ear.ear), via jboss-cli, com o seguinte conteúdo:

ENDPOINT_MICRO = https://sifpp-micro-tqs.apps.nprd.caixa

Por se tratar de propriedade do tipo boot-time, foi efetuado stop/start completo do server-config crjtqapllx003_sifpp_intra_8080 para carregamento da variável na JVM.
Validação pós-implementação:
Confirmada a presença da variável na linha de comando do processo Java (ps -ef)
Confirmado status OK do deployment sifpp-ear.ear via jboss-cli
Log de aplicação (server-crjtqapllx003_sifpp_intra_8080.log) sem ocorrências de erro, com mensagem WFLYSRV0025 indicando start completo do servidor (1098 de 1420 serviços iniciados)

Observação: houve indisponibilidade momentânea do servidor crjtqapllx003_sifpp_intra_8080 durante a janela de restart, necessária para efetivação da variável.

Servidor operacional e validado. Solicito encerramento da demanda.

Atenciosamente,
Jessé Batista

Ajusto algo se precisar (horário, número da WO etc.).
