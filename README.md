grep -i -A 30 "siamc" /logs/jboss/jboss-eap/standalone/siamc-dev-internet/server.log | tail -100

grep -iE "ERROR|Failed to start|MSC0" /logs/jboss/jboss-eap/standalone/siamc-dev-internet/server.log | tail -40

find /opt/jboss-eap -maxdepth 3 -iname "deployments"

/opt/jboss-eap/bin/jboss-cli.sh -c --controller=127.0.0.1:9990 "deployment-info --name=siamc-ear.ear"

/opt/jboss-eap/bin/jboss-cli.sh --connect --controller=127.0.0.1:9990
[standalone@127.0.0.1:9990 /] deployment-info --name=siamc-ear.ear


