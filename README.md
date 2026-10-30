A comparação precisa ser feita em outra máquina com agente de DES funcionando, como o caddeapllx2695. Faça ssh nele, troque para o ctmagelx e rode:

bash
grep -E "CTMSHOST|CTMPERMHOSTS|AGENT_TO_SERVER_PORT|SERVER_TO_AGENT_PORT" ~/ctm/data/CONFIG.dat
getent hosts crjdeaprlx038 crjdeaprlx039
grep -i crjdeaprlx /etc/hosts
ag_diag_comm | grep -iE "server host|port|ping"

Aqui no 2501 ainda falta testar a resolução pelo FQDN:

bash
getent hosts crjdeaprlx038.corerj.caixa
getent hosts crjdeaprlx038.agil.nprd.caixa.gov.br

O objetivo é descobrir qual IP o agente que funciona usa para chegar no crjdeaprlx038. Esse IP correto é o que vai no etc/hosts-des do config.



[p585600@caddeapllx2695 ~]$
[p585600@caddeapllx2695 ~]$ grep -E "CTMSHOST|CTMPERMHOSTS|AGENT_TO_SERVER_PORT|SERVER_TO_AGENT_PORT" ~/ctm/data/CONFIG.dat
grep: /home/p585600/ctm/data/CONFIG.dat: Arquivo ou diretório inexistente
[p585600@caddeapllx2695 ~]$
[p585600@caddeapllx2695 ~]$
[p585600@caddeapllx2695 ~]$ getent hosts crjdeaprlx038 crjdeaprlx039
[p585600@caddeapllx2695 ~]$
[p585600@caddeapllx2695 ~]$
[p585600@caddeapllx2695 ~]$ grep -i crjdeaprlx /etc/hosts
[p585600@caddeapllx2695 ~]$
[p585600@caddeapllx2695 ~]$
[p585600@caddeapllx2695 ~]$ ag_diag_comm | grep -iE "server host|port|ping"
-sh: ag_diag_comm: comando não encontrado
[p585600@caddeapllx2695 ~]$
[p585600@caddeapllx2695 ~]$
[p585600@caddeapllx2695 ~]$ sudo su
[sudo] senha para p585600:
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# grep -E "CTMSHOST|CTMPERMHOSTS|AGENT_TO_SERVER_PORT|SERVER_TO_AGENT_PORT" ~/ctm/data/CONFIG.dat
grep: /root/ctm/data/CONFIG.dat: Arquivo ou diretório inexistente
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# getent hosts crjdeaprlx038 crjdeaprlx039
grep -i crjdeaprlx /etc/hosts
ag_diag_comm | grep -iE "server host|port|ping"
bash: ag_diag_comm: comando não encontrado
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#







 Agent Ping to Control-M/Server : Failed
[ctmagelx@caddeapllx2501 ~]$ getent hosts crjdeaprlx038.corerj.caixa
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$ getent hosts crjdeaprlx038.agil.nprd.caixa.gov.br
[ctmagelx@caddeapllx2501 ~]$


