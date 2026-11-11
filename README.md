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




-sh-4.1$ sudo grep -n -iE 'hub-web|HUB-FRONTEND' /opt/jboss/jboss-eap/dc/configuration/domain.xml
[sudo] password for p585600:
20413:                <secure-deployment name="hub-web.war">
22057:                <secure-deployment name="hub-web.war">
23703:                <secure-deployment name="hub-web.war">
25353:                <secure-deployment name="hub-web.war">
26997:                <secure-deployment name="hub-web.war">
56744:        <deployment name="SICCR-HUB-FRONTEND" runtime-name="hub-web-1.4.0-b378.ear">
56753:        <deployment name="SICCR-HUB-FRONTEND4" runtime-name="hub-web-1.4.0-b383.ear">
56765:        <deployment name="SICCR-HUB-FRONTEND3" runtime-name="hub-web-1.7.0-b397.ear">
56840:        <deployment name="SICCR-HUB-FRONTEND5" runtime-name="hub-web-1.10.0.1-b417.ear">
56951:        <deployment name="SICCR-HUB-FRONTEND2" runtime-name="hub-web-1.10.0.1-b418.ear">
57748:                <deployment name="SICCR-HUB-FRONTEND" runtime-name="hub-web-1.4.0-b378.ear"/>
58081:                <deployment name="SICCR-HUB-FRONTEND2" runtime-name="hub-web-1.10.0.1-b418.ear"/>
58379:                <deployment name="SICCR-HUB-FRONTEND3" runtime-name="hub-web-1.7.0-b397.ear"/>
58682:                <deployment name="SICCR-HUB-FRONTEND4" runtime-name="hub-web-1.4.0-b383.ear"/>
58985:                <deployment name="SICCR-HUB-FRONTEND5" runtime-name="hub-web-1.10.0.1-b417.ear"/>
-sh-4.1$






[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]# grep -n -iE 'hub-web|HUB-FRONTEND' /opt/jboss/jboss-eap/dc/configuration/domain.xml
1434:                <secure-deployment name="hub-web.war">
4138:        <deployment name="SICCR-HUB-FRONTEND" runtime-name="hub-web-1.4.0-b378.ear">
4147:        <deployment name="SICCR-HUB-FRONTEND4" runtime-name="hub-web-1.4.0-b383.ear">
4159:        <deployment name="SICCR-HUB-FRONTEND3" runtime-name="hub-web-1.7.0-b397.ear">
4234:        <deployment name="SICCR-HUB-FRONTEND5" runtime-name="hub-web-1.10.0.1-b417.ear">
4393:        <deployment name="SICCR-HUB-FRONTEND2" runtime-name="hub-web-1.10.0.1-b418.ear">
4486:                <deployment name="SICCR-HUB-FRONTEND" runtime-name="hub-web-1.4.0-b378.ear"/>
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
