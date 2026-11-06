Sobre o 404: o boleto é um web service e não tem página na raiz do contexto, então 404 ali é esperado. Para ter certeza de que o serviço responde, vamos chamar o WSDL. Primeiro, veja os endpoints que o JBoss publicou:

bash
grep -iE 'WSDL published|publish address' /logs/jboss/jboss-eap/standalone/sigsj-boleto/server.log | tail -5

Com o endereço que aparecer, teste pelo Apache (troque <caminho-do-endpoint> pelo que o log mostrar):

bash
curl -s -o /dev/null -w '%{http_code}\n' "http://localhost/boletoService/<caminho-do-endpoint>?wsdl"

Se voltar 200, o boleto TQS está validado de ponta a ponta. Me manda a saída do grep, se quiser que eu monte o curl certinho. Depois partimos para o intranet TQS.
