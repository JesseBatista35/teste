tail -f /logs/jboss/jboss-eap/standalone/siatd-intranet-vm/console-stdout.log

tail -f /logs/jboss/jboss-eap/standalone/siatd-intranet-vm/server.log

ps -ef | grep java

watch -n 2 "ss -tlnp | grep 9990"

