Agora: deploy pela console

Deployments → Server Groups → sifec-intranet → Add → Deploy Existing Content → marque SICCR-HUB-BACKEND2 (hub-api-2.2.0-b809) → Deploy.

Antes de clicar, deixe o log aberto na 473:

sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -E "WFLYSRV0010|WFLYSRV0027|WFLYSRV0021|WFLYUT0021|WELD-00|ERROR|Caused by|hub"

Depois do deploy, teste na sua estação:

curl -k -s -o /dev/null -w "%{http_code}\n" https://migracaosifec.des.caixa/hub-api/
