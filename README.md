Mostrar mais
16:55
Temos arquivos .failed! Vamos ver o conteúdo deles para entender o erro:

bash
cat /opt/jboss-eap/standalone/deployments/SICMU-ear.ear.failed
bash
cat /opt/jboss-eap/standalone/deployments/wmq.jmsra.rar.failed
bash
sudo find /logs -name "server.log" 2>/dev/null
bash
sudo systemctl status jboss-eap-standalone
