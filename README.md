Para ter certeza, teste direto no JBoss, sem passar pelo Apache.

1. Na 471, no CLI: descobrir o offset de porta do servidor

/host=hc_cbrdeapllx473/server-config=sifec-intranet_node1_lx473:read-attribute(name=socket-binding-port-offset)

2. Na 473: testar direto na porta do servidor

A porta é 8080 mais o offset que apareceu. Exemplo: com offset 100, a porta é 8180.

sudo ss -ltnp | grep java

Esse comando lista as portas abertas pelo JBoss, para você confirmar a porta HTTP. Depois:

curl -s -o /dev/null -w "%{http_code}\n" http://localhost:8180/ccr-parametros-web/
curl -s -o /dev/null -w "%{http_code}\n" http://localhost:8180/ccr-parametros-api/

(troque 8180 pela porta que você confirmou)

API 200 e web 404 direto no JBoss: o web não tem página na raiz. Só o João Pedro sabe a rota certa, e não é problema de ambiente.
Web 200/302 direto no JBoss, mas 404 pela URL: é o Apache que não encaminha o contexto web. Aí a correção é nossa.
O hash na 471

O grep não achou nada porque o find pegou outro domain.xml primeiro. Rode procurando em todos:

sudo grep -H -A2 'deployment name="SICCR-PARAMETROS"' $(sudo find /opt/jboss -name domain.xml)

O -H mostra de qual arquivo veio cada linha. Compare o sha1 com o do 6.4: 17eb02c18df167b8c50d388445f7a02cd4dd2c9e.
