# a JVM está de pé? em qual endereço a 9990 escuta?
ps -ef | grep [j]ava | cut -c1-300
sudo ss -ltnp | grep -E ":9990|:8080|:8443"

# logs de boot (o console.log pega erros que nem chegam ao server.log)
ls -lt --time-style=long-iso /opt/jboss-eap/standalone/log/
sudo tail -60 /opt/jboss-eap/standalone/log/console.log
sudo tail -80 /opt/jboss-eap/standalone/log/server.log

# configuração do serviço: usuário, bind e log de console
cat /opt/jboss-eap/bin/init.d/jboss-eap.conf 2>/dev/null || cat /etc/default/jboss-eap.conf 2>/dev/null
