585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$ ps -ef | grep [j]ava | tr ' ' '\n' | grep -E "^-Xm[sx]|MetaspaceSize|MaxMetaspaceSize"
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$ grep -E "Xms|Xmx|Metaspace" /opt/jboss*/bin/standalone.conf /opt/*/bin/standalone.conf 2>/dev/null
/opt/jboss-eap/bin/standalone.conf:   JAVA_OPTS="-Xms1303m -Xmx1303m -XX:MetaspaceSize=96M -Djava.net.preferIPv4Stack=true"
/opt/jboss-eap/bin/standalone.conf:   JAVA_OPTS="-Xms1303m -Xmx1303m -XX:MetaspaceSize=96M -Djava.net.preferIPv4Stack=true"
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$ grep -nE "JVM_HEAP|JVM_METASPACE" jboss/standalone.conf
grep: jboss/standalone.conf: Arquivo ou diretório inexistente
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
