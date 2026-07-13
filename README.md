ps -ef | grep jboss
echo $JBOSS_HOME
find / -maxdepth 4 -iname "standalone.xml" 2>/dev/null

tail -n 500 $JBOSS_HOME/standalone/log/server.log | grep -i -A 30 "siamc"

ls -la $JBOSS_HOME/standalone/deployments/ | grep siamc
cat $JBOSS_HOME/standalone/deployments/siamc-ear.ear.failed 2>/dev/null

grep -iE "ERROR|Failed to start|MSC0" $JBOSS_HOME/standalone/log/server.log | tail -40

