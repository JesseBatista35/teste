ps -ef | grep jboss
grep -n "MetaspaceSize" /opt/jboss-eap/bin/standalone.conf
tail -50 /logs/jboss/jboss-eap/standalone/sisme/server.log | grep -i "OutOfMemory"


