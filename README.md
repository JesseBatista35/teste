1️⃣ Verifique se a porta 8803 está respondendo:
bashcurl -v http://10.116.94.206:8803/ 2>&1 | head -20
2️⃣ Teste a URL original:
bashcurl -v http://10.116.94.206:8803/simcn-web/ 2>&1 | head -20
3️⃣ Se não responder, verifique quais aplicações estão deployadas:
bashls -la /opt/jboss/jboss-eap/hc/deployments/

Execute estes comandos e compartilhe os resultados!
Se a aplicação não estiver deployada, vamos fazer o deploy correto.
