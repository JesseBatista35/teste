1. Confirmar que o 404 vem do JBoss. Isso mostra que o Apache entrega a requisição ao JBoss:

bash
curl -s -o /dev/null -w '%{http_code}\n' http://localhost:8080/boletoService/

Se também der 404, o caminho Apache → JBoss está funcionando e o contexto existe; só não há nada na raiz. Um problema de proxy apareceria como 503.

2. Descobrir o caminho REST e chamar de verdade:

bash
cd /tmp
unzip -l /opt/jboss-eap/standalone/deployments/boletoService-ear.ear | grep -i '\.war'
unzip -o -q /opt/jboss-eap/standalone/deployments/boletoService-ear.ear '*.war' -d /tmp/boleto
unzip -p /tmp/boleto/*.war WEB-INF/web.xml | grep -iE -A3 'url-pattern|resteasy'

O url-pattern do servlet REST mostra o prefixo, algo como /rest/* ou /api/*. Me manda a saída que eu monto o curl do endpoint.

Critério prático: se o mesmo curl na raiz também dá 404 no DES (2557), o TQS está se comportando igual ao DES, que a fábrica já testou. Dá para considerar o boleto TQS validado e seguir para o intranet:

bash
# no caddeapllx2557 (DES)
curl -s -o /dev/null -w '%{http_code}\n' http://localhost/boletoService/


