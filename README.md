1. Confirmar que cxextrlx038 é o servidor do BR DES - Negocial

Confira com o time do Control-M ou em outra release que já aponte para o Negocial. Pergunte também se existe um servidor secundário. Se existir, ele precisa entrar no CTMPERMHOSTS, separado por vírgula, como era antes com o 039.

2. Testar resolução e porta a partir do 2501

getent hosts cxextrlx038
nslookup cxextrlx038
nc -zv cxextrlx038 7015
Se não resolver pelo DNS, o nome precisa obrigatoriamente estar no etc/hosts-des, com o FQDN, se houver.
Se o nc falhar na 7015, é firewall. Abra a regra do 2501 (10.116.200.250) para o cxextrlx038 na porta 7015 e do cxextrlx038 para o 2501 na porta 7016.

3. Repositório SIMIL-precificacao-rotinas-batch-config, branch main, arquivo etc/hosts-des

Remova as linhas do crjdeaprlx038 e do crjdeaprlx039 e inclua:

<IP_cxextrlx038>   cxextrlx038.<dominio>   cxextrlx038

4. Criar uma nova release e fazer deploy no EC DES

No log, confirme que CTMSHOST e CTMPERMHOSTS saíram com cxextrlx038 e que a task do Control-M terminou ok.

5. Validar no 2501

ps -ef | grep -E "p_ctmag|p_ctmat" | grep -v grep
sudo su - <usuario_dono_do_processo>
grep -E "CTMSHOST|CTMPERMHOSTS" $(find ~ -name CONFIG.dat 2>/dev/null)
grep cxextrlx038 /etc/hosts
ag_ping

O ag_ping precisa responder “Server is alive”.

6. Confirmar o lado servidor

Peça ao time do Control-M para confirmar que o agente aparece “Available” no BR DES - Negocial. Depois, o Iury roda um job de teste.

Me manda o resultado do passo 2 (getent e nc): é ele que diz se você segue direto para a release ou se precisa da regra de firewall antes.





[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$ getent hosts cxextrlx038
10.192.224.54   cxextrlx038
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$ nslookup cxextrlx038
;; Got SERVFAIL reply from 10.116.193.77, trying next server
Server:         10.116.193.78
Address:        10.116.193.78#53

** server can't find cxextrlx038: SERVFAIL

[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$ nc -zv cxextrlx038 7015
-sh: nc: comando não encontrado
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$


