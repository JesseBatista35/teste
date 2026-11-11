Rede ok: o cxextrlx038 resolve pelo /etc/hosts e a porta 7015 está aberta. O agente fica em /opt/ctmage/ctm e roda como root desde 09/11, ou seja, ainda com a configuração daquela release, que apontava para o crjdeaprlx038.

1. Ver o que o agente está usando

sudo grep -E "CTMSHOST|CTMPERMHOSTS|ATCMNDATA|AGCMNDATA" /opt/ctmage/ctm/data/CONFIG.dat
sudo ss -lntp | grep 7016
ls /opt/ctmage/ctm/scripts | grep -E "ag_ping|ag_diag_comm|shut-ag|start-ag"

2. Se o CONFIG.dat ainda tiver o crjdeaprlx038

O caminho certo é pela release, porque o grupo já está com cxextrlx038:

No repositório SIMIL-precificacao-rotinas-batch-config, branch main, confirme que o etc/hosts-des tem 10.192.224.54 cxextrlx038 e não tem linhas ativas do crjdeaprlx. O /etc/hosts do host está assim, mas pode ter sido editado à mão; se o repositório estiver diferente, a release desfaz.
Crie uma nova release e faça o deploy no EC DES.

Se quiser testar antes da release, edite manualmente. A release vai gravar a mesma coisa depois.

sudo cp /opt/ctmage/ctm/data/CONFIG.dat /opt/ctmage/ctm/data/CONFIG.dat.bkp_20261111
sudo sed -i -E 's/^(CTMSHOST[[:space:]]+).*/\1cxextrlx038/; s/^(CTMPERMHOSTS[[:space:]]+).*/\1cxextrlx038/' /opt/ctmage/ctm/data/CONFIG.dat
sudo grep -E "CTMSHOST|CTMPERMHOSTS" /opt/ctmage/ctm/data/CONFIG.dat
sudo /opt/ctmage/ctm/scripts/shut-ag -u root -p ALL
sudo /opt/ctmage/ctm/scripts/start-ag -u root -p ALL

3. Validar

sudo su -
/opt/ctmage/ctm/scripts/ag_ping
/opt/ctmage/ctm/scripts/ag_diag_comm

O ag_ping tem que responder “Server is alive”. Se os scripts reclamarem de variável de ambiente, rode antes um source no profile do agente (ls -a /opt/ctmage mostra o .bash_profile ou o .cshrc).

Depois disso, peça ao time do Control-M para confirmar o agente “Available” no BR DES - Negocial e ao Iury para rodar o job de teste.

Manda a saída do passo 1.
