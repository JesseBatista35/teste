
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$ sudo /opt/jboss/jboss-4.2.3.GA-jdk6/jboss.sh sinac01 start
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$ ps -ef | grep sinac01
jboss4    23156      1  0 17:36 ?        00:00:00 /bin/sh /opt/jboss/jboss-4.2.3.GA-jdk6/jboss.sh sinac01 start
jboss4    23157  23156  0 17:36 ?        00:00:00 /bin/sh /opt/jboss/jboss-4.2.3.GA-jdk6/bin/run.sh -c sinac01 -b cspdeapllx011
jboss4    23166  23157 99 17:36 ?        00:00:29 /opt/jboss/jdk/bin/java -Dprogram.name=run.sh -server -Xms3072m -Xmx3072m -XX:PermSize=1024m -Xdebug -Xrunjdwp:transport=dt_socket,address=8787,server=y,suspend=n -Djboss.cef.instance=sinac01 -Djboss.cef.ajp=9001 -Djboss.cef.jnp=1099 -Dsun.rmi.dgc.client.gcInterval=3600000 -Dsun.rmi.dgc.server.gcInterval=3600000 -Djboss.partition.name=sinac-dsv-rhel -DappName=sinac01-lx011 -Djava.security.egd=file:/dev/./urandom -Djava.net.preferIPv4Stack=true -Djava.endorsed.dirs=/opt/jboss/jboss-4.2.3.GA-jdk6/lib/endorsed -classpath /opt/jboss/jboss-4.2.3.GA-jdk6/bin/run.jar:/opt/jboss/jdk/lib/tools.jar org.jboss.Main -c sinac01 -b cspdeapllx011
p585600   23390  19058  0 17:37 pts/1    00:00:00 grep sinac01
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$ tail -100 /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/log/server.log
tail: n▒o foi poss▒vel abrir "/opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/log/server.log" para leitura: Arquivo ou diret▒rio n▒o encontrado
[p585600@cspdeapllx011 ~]$
