Boa tarde, pessoal!

Verifiquei o caddeapllx2501 com o monitoramento ativo:

O agente está no ar e configurado para o servidor cxextrlx038.
O script /producao/simil-precificacao-rotinas-batch.sh foi publicado pela release de 19/11 e está no servidor.
Nenhuma execução do job chegou à máquina até agora, em nenhum dos testes.

Pelo print, o job CRIACAO_OS_SIGDU está em "Wait Condition". Nesse estado o Control-M ainda não enviou o job ao agente, porque está aguardando alguma condição. Pontos para verificar do lado do Control-M:

A aba Waiting Info do job, para ver quais condições estão pendentes.
A janela de execução (11:51–11:56) configurada no job. Fora desse horário ele fica aguardando.
O Run Now foi rejeitado (CTM5366 – Bypass command is rejected). É preciso pedir ao administrador do Control-M a liberação do bypass para o usuário, ou testar dentro da janela.

Assim que o job sair de Wait Condition, o monitoramento mostra se a execução chegou ao agente. Se chegar e falhar, analiso o erro na hora.
