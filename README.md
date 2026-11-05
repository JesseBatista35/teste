usuário (principal) em cada chamada. Com isso dá para saber se o PJ está recebendo o usuário. No 473:

bash
sudo grep -n "URI=/workflow-credito-pj-web/api/perfil-acesso-usuario" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | tail -1

Com o número da linha, rode:

bash
sudo sed -n '<linha-15>,<linha+40>p' /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -iE "URI=|principal|authType|status=|Content-Length|Authorization|Cookie=" | grep -viE "SECRET|TOKEN"

Como ler:

principal=null ou authType=null: o PJ não está recebendo o usuário. Problema de SSO ou sessão entre fec-web e PJ.
principal=c999999 (uma matrícula): o usuário chega, e o null vem da lógica de perfil.

Ligar o DEBUG do PJ (agora o servidor está running). No jboss-cli do 471:

/profile=full-ha-sifec-intranet/subsystem=logging/logger=br.gov.caixa.wpj:add(level=DEBUG)
/profile=full-ha-sifec-intranet/subsystem=logging/logger=br.gov.caixa.intgr:add(level=DEBUG)

Peça para o Thiago ou o Pablo abrirem o PJ de novo e acompanhe no 473:

bash
sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log 
