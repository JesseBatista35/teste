
  500  history
root@cadtqapllx046:/home/p585600# cd /etc/init.d
root@cadtqapllx046:/etc/init.d# ./nginx force-reload
[....] Reloading nginx configuration (via systemctl): nginx.serviceFailed to reload-or-try-restart nginx.service: Connection reset by peer
 failed!
root@cadtqapllx046:/etc/init.d# ./nginx force-stop
Usage: nginx {start|stop|restart|reload|force-reload|status|configtest|rotate|upgrade}
root@cadtqapllx046:/etc/init.d# ./nginx force-restart
Usage: nginx {start|stop|restart|reload|force-reload|status|configtest|rotate|upgrade}
root@cadtqapllx046:/etc/init.d# ./nginx restart
[....] Restarting nginx (via systemctl): nginx.serviceFailed to restart nginx.service: Connection reset by peer
 failed!
root@cadtqapllx046:/etc/init.d# ps auxw | grep nginx
root       3360  0.0  0.0  12732  2200 pts/0    S+   11:47   0:00 grep nginx
root      70525  0.0  0.0  82996  2524 ?        Ss   May11   0:00 nginx: master process nginx
www-data  70526  0.0  0.0  84424  6456 ?        S    May11   7:06 nginx: worker process
www-data  70527  0.0  0.0  84364  6192 ?        S    May11   6:29 nginx: worker process
www-data  70528  0.0  0.0  84416  6452 ?        S    May11   7:31 nginx: worker process
www-data  70529  0.0  0.0  84204  6192 ?        S    May11   7:15 nginx: worker process
root@cadtqapllx046:/etc/init.d# ps -ef | grep nginx
root       3362   3208  0 11:47 pts/0    00:00:00 grep nginx
root      70525      1  0 May11 ?        00:00:00 nginx: master process nginx
www-data  70526  70525  0 May11 ?        00:07:06 nginx: worker process
www-data  70527  70525  0 May11 ?        00:06:29 nginx: worker process
www-data  70528  70525  0 May11 ?        00:07:31 nginx: worker process
www-data  70529  70525  0 May11 ?        00:07:15 nginx: worker process
root@cadtqapllx046:/etc/init.d# cd ..
root@cadtqapllx046:/etc# cd ..
root@cadtqapllx046:/# systemclt restart jboss
bash: systemclt: command not found
root@cadtqapllx046:/# ps -ef | grep jboss
root       3373   3208  0 11:48 pts/0    00:00:00 grep jboss
jboss     85982      1  0 Jul16 ?        00:00:00 /bin/sh /opt/jboss/jboss//bin/standalone.sh -Djboss.bind.address.management=0.0.0.0
jboss     86105  85982  0 Jul16 ?        11:03:33 /opt/java/java8/jdk1.8.0_201/bin/java -D[Standalone] -server -XX:+UseCompressedOops -verbose:gc -Xloggc:/opt/jboss/jboss/standalone/log/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms1303m -Xmx1303m -XX:MaxPermSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djboss.modules.policy-permissions=true -Dorg.jboss.boot.log.file=/opt/jboss/jboss/standalone/log/server.log -Dlogging.configuration=file:/opt/jboss/jboss/standalone/configuration/logging.properties -jar /opt/jboss/jboss/jboss-modules.jar -mp /opt/jboss/jboss/modules -jaxpmodule javax.xml.jaxp-provider org.jboss.as.standalone -Djboss.home.dir=/opt/jboss/jboss -Djboss.server.base.dir=/opt/jboss/jboss/standalone -Djboss.bind.address.management=0.0.0.0
root@cadtqapllx046:/# systemctl -a | grep -i jboss
Failed to list units: Connection reset by peer
root@cadtqapllx046:/#
