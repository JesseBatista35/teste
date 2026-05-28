tr '\0' ' ' | head -c 200 syntax error. Last token seen: / Garbled time -sh-4.2$

20:33
O serviço está inactive dead — o JBoss não está rodando. Vamos reiniciar:

bash
sudo systemctl restart jboss-eap-standalone.service
Depois acompanha o log:

bash
tail -f /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log
