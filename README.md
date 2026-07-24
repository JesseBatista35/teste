
[root@cadtqapllx044 p585600]# cat /etc/rc.d/init.d/connector | head -60
#!/bin/sh

### BEGIN INIT INFO
# Provides: connector
# Required-Start: $local_fs
# Required-Stop: $local_fs
# Default-Start: 345
# Default-Stop: 0 6
# Short-Description:
# Description: Connector com CICS
#
#
### END INIT INFO

case $1 in
'start')
        echo "Start connector"
        su - sirot -c "/connector/start.sh &"
        ;;
'stop')
        PIDS=`ps -u sirot | grep start | cut -d' ' -f2`
        [ "${PIDS}" != "" ] && kill -9 ${PIDS}
        echo "Shutdown connector"
        /connector/stop.sh
        ;;
*)
        echo "Uso: $0 stop | start"
        ;;
esac
[root@cadtqapllx044 p585600]# /connector/stop.sh
Shutdown connector sirotconEjb2

        kSUN=cadtqapllx044.intra.caixa.gov.br
   JAVA_HOME=/opt/jboss/jdk
java version "1.8.0_371"
Java(TM) SE Runtime Environment (build 1.8.0_371-b11)
Java HotSpot(TM) 64-Bit Server VM (build 25.371-b11, mixed mode)

[root@cadtqapllx044 p585600]# echo "EXIT CODE: $?"
EXIT CODE: 0
[root@cadtqapllx044 p585600]#
[root@cadtqapllx044 p585600]#
[root@cadtqapllx044 p585600]# ps -ef | grep jboss
sirot    1989284 1989255  0 Apr17 ?        01:07:44 /opt/jboss/jdk/bin/java -server -classpath /connector/lib/ceflib2.0.5.jar:/connector/lib/connector-2.2.2.jar:/connector/lib/parser.jar:/connector/lib/xercesImpl.jar:/connector/lib/xml-apis.jar:/connector/lib/crimson.jar:/connector/lib/jaxp-api.jar:/connector/lib/ceflog2.0.1.jar:/connector/lib/mail.jar:/connector/lib/activation.jar:/connector/lib/sirotconEjb-lib_v2.2.7.jar:/connector/lib/log4j-1.2.8.jar:/connector/config:/connector/lib/jcert.jar:/connector/lib/jnet.jar:/connector/lib/jsse.jar:/connector/lib/ceflib2.0.5.jar:/connector/lib/connector-2.2.2.jar:/connector/lib/parser.jar:/connector/lib/xercesImpl.jar:/connector/lib/xml-apis.jar:/connector/lib/crimson.jar:/connector/lib/jaxp-api.jar:/connector/lib/ceflog2.0.1.jar:/connector/lib/mail.jar:/connector/lib/activation.jar:/connector/lib/sirotconEjb-lib_v2.2.7.jar:/connector/lib/log4j-1.2.8.jar:/connector/config:/connector/lib/jcert.jar:/connector/lib/jnet.jar:/connector/lib/jsse.jar: br.gov.caixa.sirot.connector.Connector /connector/config/connector.properties /connector/config/map.properties
root     3034387 3012881  0 13:45 pts/3    00:00:00 grep --color=auto jboss
[root@cadtqapllx044 p585600]# kill 1989284
[root@cadtqapllx044 p585600]# sleep 3
[root@cadtqapllx044 p585600]# ps -ef | grep jboss   # se ainda estiver lá, kill -9 1989284
sirot    3034532 3034503 30 13:46 ?        00:00:00 /opt/jboss/jdk/bin/java -server -classpath /connector/lib/ceflib2.0.5.jar:/connector/lib/connector-2.2.2.jar:/connector/lib/parser.jar:/connector/lib/xercesImpl.jar:/connector/lib/xml-apis.jar:/connector/lib/crimson.jar:/connector/lib/jaxp-api.jar:/connector/lib/ceflog2.0.1.jar:/connector/lib/mail.jar:/connector/lib/activation.jar:/connector/lib/sirotconEjb-lib_v2.2.7.jar:/connector/lib/log4j-1.2.8.jar:/connector/config:/connector/lib/jcert.jar:/connector/lib/jnet.jar:/connector/lib/jsse.jar:/connector/lib/ceflib2.0.5.jar:/connector/lib/connector-2.2.2.jar:/connector/lib/parser.jar:/connector/lib/xercesImpl.jar:/connector/lib/xml-apis.jar:/connector/lib/crimson.jar:/connector/lib/jaxp-api.jar:/connector/lib/ceflog2.0.1.jar:/connector/lib/mail.jar:/connector/lib/activation.jar:/connector/lib/sirotconEjb-lib_v2.2.7.jar:/connector/lib/log4j-1.2.8.jar:/connector/config:/connector/lib/jcert.jar:/connector/lib/jnet.jar:/connector/lib/jsse.jar: br.gov.caixa.sirot.connector.Connector /connector/config/connector.properties /connector/config/map.properties
root     3035622 3012881  0 13:46 pts/3    00:00:00 grep --color=auto jboss
[root@cadtqapllx044 p585600]#
[root@cadtqapllx044 p585600]#
[root@cadtqapllx044 p585600]# /connector/start.sh
Start connector sirotconEjb2
[root@cadtqapllx044 p585600]# echo "EXIT CODE: $?"
        kSUN=cadtqapllx044.intra.caixa.gov.br
   JAVA_HOME=/opt/jboss/jdk
java version "1.8.0_371"
Java(TM) SE Runtime Environment (build 1.8.0_371-b11)
Java HotSpot(TM) 64-Bit Server VM (build 25.371-b11, mixed mode)

ERRO *** O SERVICO CONNECTOR JA ESTA ATIVO !!!! script em execu▒▒o: start-connector.sh com PID=19892

EXIT CODE: 0
[root@cadtqapllx044 p585600]# ps -ef | grep jboss   # confirma PID novo
sirot    3034532 3034503  3 13:46 ?        00:00:00 /opt/jboss/jdk/bin/java -server -classpath /connector/lib/ceflib2.0.5.jar:/connector/lib/connector-2.2.2.jar:/connector/lib/parser.jar:/connector/lib/xercesImpl.jar:/connector/lib/xml-apis.jar:/connector/lib/crimson.jar:/connector/lib/jaxp-api.jar:/connector/lib/ceflog2.0.1.jar:/connector/lib/mail.jar:/connector/lib/activation.jar:/connector/lib/sirotconEjb-lib_v2.2.7.jar:/connector/lib/log4j-1.2.8.jar:/connector/config:/connector/lib/jcert.jar:/connector/lib/jnet.jar:/connector/lib/jsse.jar:/connector/lib/ceflib2.0.5.jar:/connector/lib/connector-2.2.2.jar:/connector/lib/parser.jar:/connector/lib/xercesImpl.jar:/connector/lib/xml-apis.jar:/connector/lib/crimson.jar:/connector/lib/jaxp-api.jar:/connector/lib/ceflog2.0.1.jar:/connector/lib/mail.jar:/connector/lib/activation.jar:/connector/lib/sirotconEjb-lib_v2.2.7.jar:/connector/lib/log4j-1.2.8.jar:/connector/config:/connector/lib/jcert.jar:/connector/lib/jnet.jar:/connector/lib/jsse.jar: br.gov.caixa.sirot.connector.Connector /connector/config/connector.properties /connector/config/map.properties
root     3035862 3012881  0 13:46 pts/3    00:00:00 grep --color=auto jboss
[root@cadtqapllx044 p585600]#
