root@cadtqapllx046:/#
root@cadtqapllx046:/#
root@cadtqapllx046:/#
root@cadtqapllx046:/# grep -n "JBOSS_HOME\|JBOSS_CONFIG\|jboss.home" /etc/init.d/jboss-700
5:JBOSS_HOME=/opt/jboss/jboss
7:export JBOSS_HOME
12:        su jboss -c "nohup $JBOSS_HOME/bin/standalone.sh -b 0.0.0.0 -Djboss.bind.address.management=0.0.0.0 > /dev/null 2> /dev/null &"
13:        #su - jboss -c "nohup $JBOSS_HOME/bin/standalone.sh -Djboss.bind.address.management=0.0.0.0 > /dev/null 2> /dev/null &"
18:        su - jboss -c "$JBOSS_HOME/bin/jboss-cli.sh --connect command=:shutdown"
root@cadtqapllx046:/#
root@cadtqapllx046:/#
root@cadtqapllx046:/# grep -n "JBOSS_HOME\|JBOSS_CONFIG\|jboss.home" /etc/init.d/jboss-640
5:JBOSS_HOME=/opt/jboss/jboss/
7:#export JBOSS_HOME JAVA_HOME
12:        #su jboss -c "nohup $JBOSS_HOME/bin/standalone.sh -b 0.0.0.0 -Djboss.bind.address.management=0.0.0.0 > /dev/null 2> /dev/null &"
13:        su - jboss -c "nohup $JBOSS_HOME/bin/standalone.sh -Djboss.bind.address.management=0.0.0.0 > /dev/null 2> /dev/null &"
18:        su - jboss -c "$JBOSS_HOME/bin/jboss-cli.sh --connect command=:shutdown"
root@cadtqapllx046:/#
root@cadtqapllx046:/#
root@cadtqapllx046:/# /etc/init.d/jboss-700 status
root@cadtqapllx046:/# /etc/init.d/jboss-640 status
root@cadtqapllx046:/#
root@cadtqapllx046:/#
root@cadtqapllx046:/#
