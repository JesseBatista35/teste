Vamos diagnosticar:
1️⃣ Verifique se há múltiplas rotas e teste outra que sabemos que funciona:
bashoc get routes -n siinp-tqs
Pelos screenshots anteriores, existe siinp-nucleo-tqs.apps.nprd.caixa. Tente:
bashcurl -v -X POST https://siinp-nucleo-tqs.apps.nprd.caixa/inic-pagto/nucleo/v1/jornada \
  -H "Content-Type: application/json" \
  -d '{"valor": "25.00"}' -k
(Use -k para ignorar certificado auto-assinado)
2️⃣ Se funcionar nessa rota, o problema é específico da rota integra.iniciadora:
bash# Delete e recrie a rota problemática
oc delete route integra.iniciadora
oc expose svc siinp-nucleo-tqs --hostname=integra.iniciadora.caixa.gov.br --path=/ --name=integra.iniciadora
3️⃣ Ou verifique se a rota tem alguma anotação estranha:
bashoc describe route integra.iniciadora

Manda aí o resultado da primeira rota alternativa! Se funcionar lá, a gente recriad a rota problemática. 🔍
