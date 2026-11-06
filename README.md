LOG=/opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log
sudo grep -nE "^12:0[0-1]:" $LOG | grep -iE "ERROR|Exception|Caused by|sicdt" | head -40

sudo sed -n 'NUM,+40p' $LOG | grep -vi "authorization"

Valeu pelo teste, Inocêncio! Que bom que o contexto web está ok. Vou pegar no log do servidor o erro da requisição das 12:00:03 (15:00:03 GMT) da API REST e te retorno com a causa.
