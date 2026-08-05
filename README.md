ls -la /etc/init.d/ | grep -i jboss


find /opt/jboss-eap -maxdepth 2 -iname "*start*" -o -iname "*stop*"


systemctl list-units --all | grep -i jboss


kill -15 14566

runuser jboss -c 'LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/opt/jboss-eap/standalone/tmp/jboss-eap-standalone.pid /opt/jboss-eap/bin/standalone.sh -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sisme -c standalone-full-ha.xml' &
