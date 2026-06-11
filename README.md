Vamos resolver o problema de permissão primeiro:
bashsudo ls -la /opt/jboss-eap/standalone/data/content/
bashsudo chown -R jboss:jboss /opt/jboss-eap/standalone/data/
bashsudo chmod -R 775 /opt/jboss-eap/standalone/data/
Depois reinicia o JBoss:
bashsudo systemctl restart jboss-eap-standalone
E acompanha o log:
bashsudo tail -f /logs/jboss/server.log
