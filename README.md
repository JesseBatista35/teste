1. Os erros do server.log:
bashsudo tail -300 /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | grep -E "ERROR|FAILED|Exception|Caused by" | tail -50
2. Se quiser ver mais contexto:
bashsudo tail -500 /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | tail -100
3. Ver arquivos .failed no lugar certo:
bashls -lah /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/
O processo Java está rodando (PID 6602), mas os deployments estão com status FAILED na API de management — o log vai mostrar exatamente qual exceção está impedindo o boot da aplicação.
