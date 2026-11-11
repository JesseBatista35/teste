Para fazer o deploy pelo CLI da 471, você já está conectado ([domain@localhost:9999 /]):

/server-group=sifec-intranet/deployment=SICCR-HUB-BACKEND2:add(enabled=true)

Antes de rodar, deixe o log aberto na 473:

sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -E "WFLYSRV0010|WFLYSRV0027|WFLYSRV0021|WFLYUT0021|WELD-00|ERROR|Caused by|hub"

Depois, confira o status no CLI:

/server-group=sifec-intranet/deployment=SICCR-HUB-BACKEND2:read-resource

E teste na sua estação:

curl -k -s -o /dev/null -w "%{http_code}\n" https://migracaosifec.des.caixa/hub-api/

Se der erro e precisar desfazer:

/server-group=sifec-intranet/deployment=SICCR-HUB-BACKEND2:remove
