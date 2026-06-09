🔧 SOLUÇÃO - Execute estes comandos:
1️⃣ Remover o EAR com problema:
bashsudo rm -f /opt/jboss/jboss-eap/hc/deployments/SIOSP.ear.deployed
sudo rm -f /opt/jboss/jboss-eap/hc/deployments/siosp-1.0.0.59-1.0.0.59-b370.ear
2️⃣ Ver o diretório correto de deployments:
bashls -la /opt/jboss/jboss-eap/hc/deployments.d/
3️⃣ Procurar onde está o EAR correto:
bashfind /opt/jboss -name "*siosp*.ear" -o -name "*SIOSP*.ear"
4️⃣ Reiniciar o JBOSS como root:
bashsudo systemctl restart jboss-eap-hc
5️⃣ Monitore o reinício:
bashtail -f /opt/jboss/jboss-eap/hc/log/servers/siosp_node1_lx099/server.log

Execute esses comandos e compartilhe o resultado do comando 3️⃣! Vou ajudar a identificar e redeployer a aplicação corretamente.
