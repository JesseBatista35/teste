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



Every 1,0s: ss -tn '( sport = :7016 or dport = :7015 )'; echo; ls -ltr /opt/ctmage/ctm/dailylog | tail -2...  caddeapllx2501.agil.nprd.caixa.gov.br: Thu Nov 26 14:21:34 2026

State Recv-Q Send-Q Local Address:Port Peer Address:PortProcess

-rwxr--r-- 1 ctmagelx ctmagelx 4041 nov 11 17:12 daily_ctmag_20261111.log
-rwxr--r-- 1 ctmagelx ctmagelx  960 nov 19 11:41 daily_ctmag_20261119.log
-rw-r--r-- 1 root          root           1557 set 27  2024 094NG_1
-rw------- 1 jboss         jboss         18595 set 27  2024 CMD.LOG_0094xj_00001

-rwxr-xr-x 1 ctmagelx controlm  877 out 15 12:32 /producao/export_variables.sh
-rwxr-xr-x 1 ctmagelx controlm    0 mar 11  2026 /producao/sample.sh
-rwxr-xr-x 1 ctmagelx controlm 1339 out 15 12:32 /producao/script_simil_rotinas.sh
-rwxr-xr-x 1 ctmagelx controlm  657 mar 11  2026 /producao/script_simil.sh
-rwxr-xr-x 1 ctmagelx controlm 1339 nov 19 11:41 /producao/simil-precificacao-rotinas-batch.sh

