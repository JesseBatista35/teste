RELATÓRIO DE FECHAMENTO - SIMCN-WEB
DEMANDA: Verificação de indisponibilidade do ambiente DES - SIMCN-Web
DATA: 09/06/2026
STATUS: RESOLVIDO
DIAGNÓSTICO:
A aplicação SIMCN-Web estava indisponível. Após investigação, constatou-se que o servidor correto é sbrdeapllx105_corporativo (não sbrdeapllx099). A aplicação está configurada no servidor simcn_node1_lx103 no grupo de serviços simcn.
SOLUÇÃO APLICADA:
Reinicialização do JBOSS EAP 7.1 no servidor sbrdeapllx105_corporativo. Aplicação SIMCN iniciada com sucesso. Porta 8803 respondendo corretamente.
RESULTADO:
Aplicação SIMCN-Web operacional e respondendo normalmente. URL de acesso: https://conciliacao.des.caixa/simcn-web/ Servidor: sbrdeapllx105_corporativo. Status: ATIVO e FUNCIONANDO.
Responsável: p585600
Data de conclusão: 09/06/2026 15:32
