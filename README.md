
[root@cadtqapllx044 p585600]#
[root@cadtqapllx044 p585600]#
[root@cadtqapllx044 p585600]# systemctl restart connector.service
[root@cadtqapllx044 p585600]#
[root@cadtqapllx044 p585600]#
[root@cadtqapllx044 p585600]#
[root@cadtqapllx044 p585600]# ps -ef | grep jboss
sirot    1989284 1989255  0 Apr17 ?        01:07:43 /opt/jboss/jdk/bin/java -server -classpath /connector/lib/ceflib2.0.5.jar:/connector/lib/connector-2.2.2.jar:/connector/lib/parser.jar:/connector/lib/xercesImpl.jar:/connector/lib/xml-apis.jar:/connector/lib/crimson.jar:/connector/lib/jaxp-api.jar:/connector/lib/ceflog2.0.1.jar:/connector/lib/mail.jar:/connector/lib/activation.jar:/connector/lib/sirotconEjb-lib_v2.2.7.jar:/connector/lib/log4j-1.2.8.jar:/connector/config:/connector/lib/jcert.jar:/connector/lib/jnet.jar:/connector/lib/jsse.jar:/connector/lib/ceflib2.0.5.jar:/connector/lib/connector-2.2.2.jar:/connector/lib/parser.jar:/connector/lib/xercesImpl.jar:/connector/lib/xml-apis.jar:/connector/lib/crimson.jar:/connector/lib/jaxp-api.jar:/connector/lib/ceflog2.0.1.jar:/connector/lib/mail.jar:/connector/lib/activation.jar:/connector/lib/sirotconEjb-lib_v2.2.7.jar:/connector/lib/log4j-1.2.8.jar:/connector/config:/connector/lib/jcert.jar:/connector/lib/jnet.jar:/connector/lib/jsse.jar: br.gov.caixa.sirot.connector.Connector /connector/config/connector.properties /connector/config/map.properties
root     3014062 3012881  0 13:11 pts/3    00:00:00 grep --color=auto jboss
[root@cadtqapllx044 p585600]# date
Fri Jul 24 13:11:13 -03 2026
[root@cadtqapllx044 p585600]#
