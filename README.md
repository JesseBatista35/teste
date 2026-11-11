Próximo: hub-web-ear-1.10.0.1 (linha 14 da planilha). No 7.4 está ativo o SICCR-HUB-FRONTEND com hub-web-1.4.0-b378, então primeiro vamos ver se a 1.10.0.1 existe.

1. Na 471 (10.116.97.59): quais hub-web existem no 7.4
grep -n -iE 'hub-web|HUB-FRONTEND' /opt/jboss/jboss-eap/dc/configuration/domain.xml
2. No 6.4 (10.116.88.20): qual roda no sifec-intranet
sudo grep -n -iE 'hub-web|HUB-FRONTEND' /opt/jboss/jboss-eap/dc/configuration/domain.xml

As linhas entre 57701 e 58040 mostram o que o 6.4 tem no sifec-intranet.

3. Se a 1.10.0.1 existir no 7.4

Ela vai aparecer com um nome de deployment diferente, por exemplo SICCR-HUB-FRONTEND2 a 5. Nesse caso, a troca é feita em dois passos no CLI da 471: tirar a versão atual do server-group e colocar a nova. Vou te passar os comandos exatos com o nome certo assim que você me mandar a saída do passo 1.

Deixe o log aberto na 473:

sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -E "WFLYSRV0010|WFLYSRV0027|WFLYSRV0021|WFLYUT0021|WELD-00|ERROR|Caused by|hub"

Me mande as saídas dos passos 1 e 2.

Como o Claude está se saindo nesta sessão?
