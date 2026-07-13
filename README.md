sudo -u jboss env LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/usr/local/EAP-6.0.1/jboss-eap-6.0/lock/lock.file /usr/local/EAP-6.0.1/jboss-eap-6.0/bin/standalone.sh -Djboss.bind.address.management=0.0.0.0 -Djboss.socket.binding.port-offset=1 &


tail -n 0 -f /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/log/server.log

ps -ef | grep -i jboss

