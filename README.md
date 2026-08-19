grep -A1 "sismh.api" /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/configuration/standalone.xml



# Parar (via CLI, como você já fez antes)
sudo -u jboss /usr/local/EAP-6.0.1/jboss-eap-6.0/bin/jboss-cli.sh --connect controller=127.0.0.1:9991 command=":shutdown"

# Confirmar que parou
ps -ef | grep java

# Se necessário, remover lock antigo
sudo -u jboss rm -f /usr/local/EAP-6.0.1/jboss-eap-6.0/lock/lock.file

# Subir novamente
sudo -u jboss bash -c 'LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/usr/local/EAP-6.0.1/jboss-eap-6.0/lock/lock.file /usr/local/EAP-6.0.1/jboss-eap-6.0/bin/standalone.sh -Djboss.bind.address.management=0.0.0.0 -Djboss.socket.binding.port-offset=1 &'




tail -n 0 -f /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/log/server.log


ps -ef | grep java



sudo -u jboss /usr/local/EAP-6.0.1/jboss-eap-6.0/bin/jboss-cli.sh --connect controller=127.0.0.1:9992 command=":shutdown"

ps -ef | grep java
netstat -tlnp 2>/dev/null | grep 999



ps -ef | grep java
# pega o PID da linha do jboss (era 45082 antes, mas pode ter mudado)
sudo -u jboss kill -15 <PID>
sleep 15
ps -p <PID> && echo "ainda vivo" || echo "morreu"

sudo -u jboss rm -f /usr/local/EAP-6.0.1/jboss-eap-6.0/lock/lock.file
sudo -u jboss bash -c 'LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/usr/local/EAP-6.0.1/jboss-eap-6.0/lock/lock.file /usr/local/EAP-6.0.1/jboss-eap-6.0/bin/standalone.sh -Djboss.bind.address.management=0.0.0.0 -Djboss.socket.binding.port-offset=1 &'
tail -n 0 -f /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/log/server.log
