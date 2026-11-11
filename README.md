1. Descobrir o servidor do BR DES - Negocial

Você precisa do hostname e do IP do servidor primário (e do secundário, se houver) que substituem o crjdeaprlx038 e o crjdeaprlx039. Pegue de outra release de batch Terraform que já aponte para o Negocial, procurando a variável CTMSHOST, ou peça ao time do Control-M.

2. Olhar o agente atual no caddeapllx2501

ps -ef | grep -E "p_ctmag|p_ctmat|ag_" | grep -v grep
getent passwd | grep -i ctm
sudo find / -name CONFIG.dat -path "*ctm*" 2>/dev/null

O primeiro comando mostra o usuário dono do processo e o caminho do agente. Depois:

sudo su - <usuario_ctm>
grep -E "CTMSHOST|CTMPERMHOSTS|ATCMNDATA|AGCMNDATA" <caminho>/data/CONFIG.dat
grep -i crjdeaprlx /etc/hosts

3. Testar a rede para o servidor novo (antes de mexer em qualquer coisa)

getent hosts <servidor_novo>
nc -zv <servidor_novo> 7015
ss -lntp | grep 7016
Se o nc para a porta 7015 falhar, é firewall. Registre a regra (2501 para o servidor Negocial na 7015, e o servidor Negocial para o 2501 na 7016) vinculada à REQ e espere a liberação antes de seguir.
O ss mostra se o agente está escutando na 7016.

4. Ajustar no DevOps

Release SIMIL-precificacao-rotinas-batch, stage EC DES: troque CTMSHOST e CTMPERMHOSTS para o servidor novo. Veja se elas estão nas variáveis da release ou em um grupo de variáveis.
Repositório SIMIL-precificacao-rotinas-batch-config (branch main): no etc/hosts-des, troque as linhas do crjdeaprlx038 e do crjdeaprlx039 pelas do servidor novo.

5. Rodar a release EC DES

Acompanhe no log a task que configura o Control-M e confirme que ela usou o host novo.

6. Validar no 2501

sudo su - <usuario_ctm>
grep -E "CTMSHOST|CTMPERMHOSTS" <caminho>/data/CONFIG.dat
grep <servidor_novo> /etc/hosts
ag_diag_comm
ag_ping

O ag_ping precisa responder “Server is alive”.

7. Lado servidor

Peça ao time do Control-M para confirmar que o agente caddeapllx2501 está cadastrado e “Available” no BR DES - Negocial. Depois, o Iury roda um job de teste.

Um alerta à parte: nesse log, SPRING_DATASOURCE_PASSWORD, _ENV_SIICO_CLIENT_SECRET e _ENV_SIICO_API_KEY aparecem em texto claro. Essas variáveis não estão marcadas como secretas na release. Vale marcar o cadeado nelas ou mover para o BeyondTrust, e avisar o dev.

Cola aqui a saída do passo 2 e do nc do passo 3 que eu te digo o próximo comando exato.
