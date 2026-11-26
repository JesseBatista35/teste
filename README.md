Boa tarde, pessoal!

Verifiquei o caddeapllx2501 com o monitoramento ativo:

O agente está no ar e configurado para o servidor cxextrlx038.
O script /producao/simil-precificacao-rotinas-batch.sh foi publicado pela release de 19/11 e está no servidor.
Nenhuma execução do job chegou à máquina até agora, mesmo depois da regra de firewall.

Podem me mandar o print do teste de hoje, com as abas Synopsis, Waiting Info e Log do job? No último print que recebi (23/11), o job estava em "Wait Condition". Nesse estado o Control-M nem envia o job ao agente, porque fica aguardando alguma condição. Além disso:

Há uma janela de execução (11:51–11:56) configurada no job. Fora desse horário ele fica aguardando.
O Run Now estava sendo rejeitado (CTM5366 – Bypass command is rejected). Pode ser necessário pedir a liberação do bypass ao administrador do Control-M, ou testar dentro da janela.

Se hoje o status for o mesmo, o ajuste está na definição do job no Control-M. Se for outro erro, analiso a partir do print.
