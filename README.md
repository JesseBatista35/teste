Tem o serviço controlm_agent.service, então é só usar ele. Como root:

systemctl restart controlm_agent.service
systemctl status controlm_agent.service --no-pager
ps -ef | grep -E "p_ctmag|p_ctmat" | grep -v grep

Confira se os PIDs mudaram e se a hora de início é de agora.

Para validar, carregue o ambiente a partir do próprio serviço:

systemctl cat controlm_agent.service
export CONTROLM=/opt/ctmage/ctm
export PATH=$CONTROLM/scripts:$CONTROLM/exe:$PATH
ag_ping
ag_diag_comm

O systemctl cat mostra o Environment ou o script que o serviço usa. Se o CONTROLM lá for diferente de /opt/ctmage/ctm, ajuste o export.

Esperado: “Server is alive” no ag_ping. Manda a saída do status e do ag_ping.
