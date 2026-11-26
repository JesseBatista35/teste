Para ter certeza do lado do agente, deixe isto rodando como root no 2501 (10.116.200.250) enquanto o Karlismar testa:

bash
watch -n1 "ss -tn '( sport = :7016 or dport = :7015 )'; echo; ls -ltr /opt/ctmage/ctm/dailylog | tail -2; ls -ltr /opt/ctmage/ctm/sysout | tail -2; echo; ls -l /producao/*.sh"

Se aparecer uma conexão vinda de 10.192.224.54 ou um sysout novo, o job chegou ao agente. Se não aparecer nada e o job continuar em Wait Condition, fica confirmado que o problema está no job.

Resposta sugerida:

Bom dia, pessoal! Obrigado por aplicarem a regra.

Pelo último print, o job CRIACAO_OS_SIGDU está em "Wait Condition". Nesse estado o Control-M ainda não enviou o job ao agente, porque está esperando uma condição. Por isso a regra de firewall não mudou o resultado. Dois pontos chamam atenção:

O job tem uma janela de execução (11:51–11:56). Fora desse horário ele fica aguardando.
O "Run Now" foi rejeitado pelo servidor (CTM5366 – Bypass command is rejected), então não dá para ignorar a janela nem as condições com o usuário atual.

Sugiro verificar a aba Waiting Info do job, ajustar ou remover a janela de horário para o teste e, se precisar do Run Now, pedir a liberação do bypass ao administrador do Control-M.

Já deixei o monitoramento ativo no caddeapllx2501. Podem forçar o job dentro da janela (ou após o ajuste) e me avisar aqui? Se o job sair de Wait Condition e mesmo assim não chegar à máquina, aí marcamos uma call rápida para olharmos juntos.

Assim você mostra boa vontade, deixa o próximo passo com eles e só aceita a call se a comunicação realmente falhar.
