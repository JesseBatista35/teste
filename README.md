grep -n "MetaspaceSize" /opt/jboss-eap/bin/standalone.conf


ps -ef | grep MaxMetaspaceSize


systemctl status jboss-eap-standalone.service
tail -50 /logs/jboss/jboss-eap/standalone/sisme/server.log

watch -n 30 'jcmd $(pgrep -f sisme) VM.metaspace 2>/dev/null | head -20'

