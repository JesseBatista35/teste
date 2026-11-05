1. Confirmar que SIFEC e PJ subiram no reload. O tail -12 cortou as linhas deles:

bash
sudo grep -E "WFLYSRV0010: \"(SIFEC|SICCR-PJ)\"|WFLYSRV0021" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | tail -4

O esperado são as duas linhas 11:00:xx ... foi implantado, sem WFLYSRV0021.

2. Pedir para o Pablo testar agora. Como houve reload, a sessão antiga caiu. Ele precisa:

fechar a aba ou fazer logout do SIFEC;
entrar de novo em https://migracaosifec.des.caixa/fec-web/, de preferência com Ctrl+F5;
abrir o PJ e consultar a lista de clientes.

3. Logo depois do teste, no 476:

bash
sudo grep "workflow-credito-pj-web/api/perfil-acesso-usuario" /logs/apache2/SIFEC-INTRANET/sifec1.des.caixa-access.log | tail -3

Olhe o horário: precisa ser depois das 11:00:41. E veja se, depois do 200, vem um número de bytes em vez de -.

Como o Claude está se saindo nesta sessão?
