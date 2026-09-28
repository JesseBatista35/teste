ps -ef | grep -E "p_ctmag|p_ctmat|p_ctmar" | grep -v grep
ss -lntp | grep -E "7016|7036"

/opt/ctmag/ctm/scripts/start-ag -u ctmagelx -p ALL

hostname -I
getent hosts caddeapllx2695.agil.nprd.caixa.gov.br
nslookup caddeapllx2695.agil.nprd.caixa.gov.br
getent hosts crjdeaprlx038 crjdeaprlx039

timeout 5 bash -c "</dev/tcp/crjdeaprlx038/7015" && echo OK || echo FALHA
timeout 5 bash -c "</dev/tcp/crjdeaprlx039/7015" && echo OK || echo FALHA

firewall-cmd --list-ports ; systemctl is-active firewalld

ag_ping
ag_diag_comm


cat /producao/env_config.sh
ls -laR /producao/configuration
