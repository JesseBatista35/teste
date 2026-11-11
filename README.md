Vamos subir o SICCR-HUB-BACKEND2 (b809).

No 6.4, nenhum hub-api está atribuído ao sifec-intranet: as linhas 58082 em diante ficam depois do bloco dele, que termina em 58040. O sifec-intranet do 6.4 tem só as propriedades SICCR_HUB_WS_* (linhas 57884 a 57894). Antes do deploy, então, vamos confirmar duas coisas no 7.4.

1. Na 471: as propriedades HUB existem no 7.4?
grep -n 'SICCR_HUB' /opt/jboss/jboss-eap/dc/configuration/domain.xml

E em qual profile está o Keycloak do hub-api.war (linha 1592):

awk 'NR<=1592 && /<profile name=/ {l=$0} NR==1592 {print l; exit}' /opt/jboss/jboss-eap/dc/configuration/domain.xml

O resultado esperado é full-ha-sifec-intranet.

2. Se o grep do passo 1 vier vazio: criar as propriedades

Use os valores do sifec-intranet do 6.4 (linhas 57884 a 57894). No CLI da 471:

batch
/server-group=sifec-intranet/system-property=SICCR_HUB_WS_SERPRO_PROTOCOLO:add(value="https")
/server-group=sifec-intranet/system-property=SICCR_HUB_WS_SERPRO_HOST:add(value="hom5.siapenet.gov.br")
/server-group=sifec-intranet/system-property=SICCR_HUB_WS_SERPRO_URL_BASE:add(value="/wssiapeconsig")
/server-group=sifec-intranet/system-property=SICCR_HUB_WS_SERPRO_CD_CONSIGNATARIA:add(value="104")
/server-group=sifec-intranet/system-property=SICCR_HUB_WS_SERPRO_CD_PASSWORD_CONSIGNATARIA:add(value="UB15W3NUCO")
/server-group=sifec-intranet/system-property=SICCR_HUB_WS_DB1_PROTOCOLO:add(value="https")
/server-group=sifec-intranet/system-property=SICCR_HUB_WS_DB1_HOST:add(value="www1.consignet.com.br")
/server-group=sifec-intranet/system-property=SICCR_HUB_WS_DB1_PORTA:add(value="8585")
/server-group=sifec-intranet/system-property=SICCR_HUB_WS_DB1_URL_BASE:add(value="/DB1ConsignetWebService")
/server-group=sifec-intranet/system-property=SICCR_HUB_WS_DB1_USUARIO:add(value="TESTE_INTEGRADO@CAIXA")
/server-group=sifec-intranet/system-property=SICCR_HUB_WS_DB1_PASSWORD:add(value="46e25a8be134eee544fcc68c9ddbf10f")
run-batch

Se o grep já trouxer as propriedades, pule este passo. Rodar de novo daria erro de “duplicate resource”.

3. Deploy pela console

Deployments → Server Groups → sifec-intranet → Add → Deploy Existing Content → marque SICCR-HUB-BACKEND2 → Deploy.

Antes de clicar, deixe o log aberto na 473:

sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -E "WFLYSRV0010|WFLYSRV0027|WFLYSRV0021|WFLYUT0021|WELD-00|ERROR|Caused by|hub"
4. Teste depois do deploy (na sua estação)
curl -k -s -o /dev/null -w "%{http_code}\n" https://migracaosifec.des.caixa/hub-api/

Não cole essas senhas na sala. Se precisar citar as propriedades, use só os nomes.
