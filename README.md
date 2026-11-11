Para confirmar no log da 473 que subiu limpo:

sudo grep -nE "WFLYSRV0010.*HUB-FRONTEND2|WFLYSRV0021.*hub-web" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | tail -3
Mensagem para a sala

hub-web atualizado no JBoss 7.4 (sifec-intranet): saiu a 1.4.0-b378 e entrou a 1.10.0.1-b418, versão da planilha. A URL /hub-web/ está respondendo (redireciona para o login). As telas que dependem do hub-api só vão funcionar depois do build novo do backend, com o ajuste das queries.

Próximo da lista: mcm-ear-1.0.1.23 (linha 15)

Na 471:

grep -n -iE 'mcm' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -iE 'deployment name|secure-deployment'

No 6.4:

sudo grep -n -iE 'mcm' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -iE 'deployment name|secure-deployment'
Como o Claude está se saindo nesta sessão?
