Correção no cxextrlx038, como root:

bash
# backup
cp -p /etc/hosts /etc/hosts.bkp_20261127

# inclui o agente no mesmo padrão dos demais
echo "10.116.200.250  caddeapllx2501  caddeapllx2501.agil.nprd.caixa.gov.br" >> /etc/hosts

# valida
getent hosts caddeapllx2501.agil.nprd.caixa.gov.br
getent hosts caddeapllx2501

Depois, com o usuário do Control-M (controlm):

bash
su - controlm
ctm_agstat -LIST caddeapllx2501.agil.nprd.caixa.gov.br
ctmping -HOSTID caddeapllx2501.agil.nprd.caixa.gov.br -DISCOVER Y
ctm_agstat -LIST caddeapllx2501.agil.nprd.caixa.gov.br

O ctmping precisa terminar com sucesso, e o ctm_agstat precisa mostrar o agente como Available. Se o primeiro agstat mostrar Disabled, me avisa antes de rodar o ping, porque nesse caso o agente precisa ser habilitado primeiro.

Quando o agente estiver Available, a equipe deles precisa:

tirar o job do Hold (Free);
forçar a execução de novo, de preferência dentro da janela, porque o Run Now continua bloqueado.

Deixe o watch rodando no 2501 durante o teste. Desta vez deve aparecer a conexão de 10.192.224.54 na 7016 e um sysout novo.
