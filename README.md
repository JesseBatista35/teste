1. Procure a classe no 7.4 (no 473; o nome das classes fica em texto puro dentro do jar, então o grep encontra):

sudo grep -rl "consultacontratos" /opt/jboss/jboss-eap/modules /opt/jboss/jboss-eap/hc/data/content 2>/dev/null

Se não voltar nada, a classe não existe em nenhum lugar deste servidor.

2. Veja o que o PJ registra no DEBUG durante a requisição (sem o ruído de SQL):

sudo sed -n '117700,$p' /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -E "br.gov.caixa.(wpj|intgr)|arqref|null" | grep -v "\[stdout\]" | tail -80
