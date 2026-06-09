1️⃣ Primeiro, vamos usar o jboss-cli para parar APENAS o servidor SIOSP (não todo o domain):
bashcd /opt/jboss/jboss-eap/bin
./jboss-cli.sh -c "/profile=default/server-config=siosp_node1_lx099:stop"
Espere 10-15 segundos e depois verifique:
bashps aux | grep "siosp_node1_lx099" | grep -v grep
Se ainda estiver rodando, execute:
bash./jboss-cli.sh -c "/host=sbrdeapllx099/server-config=siosp_node1_lx099:stop"

2️⃣ Depois reinicie APENAS este servidor:
bash./jboss-cli.sh -c "/host=sbrdeapllx099/server-config=siosp_node1_lx099:start"

3️⃣ Monitore o log para ver se inicia bem:
bashtail -f /opt/jboss/jboss-eap/hc/log/servers/siosp_node1_lx099/server.log
Procure por SUCCESS ou ERROR nos últimos 30 segundos

Execute apenas o comando 1️⃣ agora e compartilhe o resultado! Vamos com segurança! ✅
