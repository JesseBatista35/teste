
[root@caddeapllx1441 p585600]# grep -rn "MaxMetaspaceSize" /opt/jboss-eap/bin/ /opt/jboss-eap/standalone/configuration/ 2>/dev/null
/opt/jboss-eap/bin/domain.conf:49:   JAVA_OPTS="-Xms64m -Xmx512m -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true"
/opt/jboss-eap/bin/domain.conf.bat:46:set "JAVA_OPTS=-Xms64M -Xmx512M -XX:MaxMetaspaceSize=256m"
/opt/jboss-eap/bin/domain.conf.ps1:38:    $JAVA_OPTS += '-XX:MaxMetaspaceSize=256m'
/opt/jboss-eap/bin/standalone.conf:50:   JAVA_OPTS="-Xms1024m -Xmx2048m -XX:MetaspaceSize=96M -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true"
/opt/jboss-eap/bin/standalone.conf.bat:49:set "JAVA_OPTS=-Xms1G -Xmx1G -XX:MetaspaceSize=96M -XX:MaxMetaspaceSize=256m"
/opt/jboss-eap/bin/standalone.conf.ps1:45:$JAVA_OPTS += '-XX:MaxMetaspaceSize=256m'
/opt/jboss-eap/bin/appclient.conf:45:   JAVA_OPTS="-Xms64m -Xmx512m -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true"
/opt/jboss-eap/bin/appclient.conf.bat:43:set "JAVA_OPTS=-Xms64M -Xmx512M -XX:MaxMetaspaceSize=256m"
/opt/jboss-eap/bin/appclient.conf.ps1:44:$JAVA_OPTS += '-XX:MaxMetaspaceSize=256m'
[root@caddeapllx1441 p585600]#
[root@caddeapllx1441 p585600]#
[root@caddeapllx1441 p585600]#
[root@caddeapllx1441 p585600]#
