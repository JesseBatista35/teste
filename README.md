🔧 PRÓXIMOS PASSOS DE DIAGNÓSTICO:
Execute estes comandos para ver por que o server abortou:
1️⃣ Ver logs completos do servidor (com mais contexto):
bashtail -500 /opt/jboss/jboss-eap/hc/log/servers/siosp_node1_lx099/server.log
2️⃣ Ver se há arquivo de erro:
bashls -la /opt/jboss/jboss-eap/hc/log/servers/siosp_node1_lx099/
3️⃣ Verificar configuração do domain (onde está a SIMCN):
bashls -la /opt/jboss/jboss-eap/hc/deployments/
4️⃣ Ver se há aplicação em outro lugar:
bashfind /opt -name "*simcn*" -type f 2>/dev/null

Compartilhe o output do comando 1️⃣ que vai mostrar exatamente por que o servidor parou!
