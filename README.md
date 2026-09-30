
Last login: Wed Sep 30 09:16:46 2026 from 10.111.14.45
[p585600@cadsvitrlx100 ~]$ ssh 10.116.18.146
p585600@10.116.18.146's password:
Last login: Fri Sep  4 15:27:55 2026 from 10.122.150.31
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$



me ajdua a dar um restrae nesse servidor ambiiende de tqs


p585600@10.116.18.146's password:
Last login: Fri Sep  4 15:27:55 2026 from 10.122.150.31
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$ ^C
[p585600@scttqapllx0032 ~]$ ps -ef | grep jboss
p585600    3101   3073  0 14:04 pts/1    00:00:00 grep jboss
root       9719      1  0 Sep23 ?        00:00:00 su - jboss -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/usr/local/EAP-6.0.1/jboss-eap-6.0/lock/lock.file /usr/local/EAP-6.0.1/jboss-eap-6.0/bin/standalone.sh -Djboss.bind.address.management=0.0.0.0 -Djboss.socket.binding.port-offset=1
jboss      9722   9719  0 Sep23 ?        00:00:00 /bin/sh /usr/local/EAP-6.0.1/jboss-eap-6.0/bin/standalone.sh -Djboss.bind.address.management=0.0.0.0 -Djboss.socket.binding.port-offset=1
jboss      9770   9722  1 Sep23 ?        02:02:53 /usr/lib/jvm/java-1.7.0-openjdk-1.7.0.261.x86_64/jre/bin/java -D[Standalone] -server -XX:+UseCompressedOops -Xms1303m -Xmx1303m -XX:MaxPermSize=256m -Djava.net.preferIPv4Stack=true -Dorg.jboss.resolver.warning=true -Dsun.rmi.dgc.client.gcInterval=3600000 -Dsun.rmi.dgc.server.gcInterval=3600000 -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djboss.server.default.config=standalone.xml -Dorg.jboss.boot.log.file=/usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/log/boot.log -Dlogging.configuration=file:/usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/configuration/logging.properties -jar /usr/local/EAP-6.0.1/jboss-eap-6.0/jboss-modules.jar -mp /usr/local/EAP-6.0.1/jboss-eap-6.0/modules -jaxpmodule javax.xml.jaxp-provider org.jboss.as.standalone -Djboss.home.dir=/usr/local/EAP-6.0.1/jboss-eap-6.0 -Djboss.server.base.dir=/usr/local/EAP-6.0.1/jboss-eap-6.0/standalone -Djboss.bind.address.management=0.0.0.0 -Djboss.socket.binding.port-offset=1
[p585600@scttqapllx0032 ~]$ ps -ef | grep java
p585600    3103   3073  0 14:05 pts/1    00:00:00 grep java
jboss      9770   9722  1 Sep23 ?        02:02:53 /usr/lib/jvm/java-1.7.0-openjdk-1.7.0.261.x86_64/jre/bin/java -D[Standalone] -server -XX:+UseCompressedOops -Xms1303m -Xmx1303m -XX:MaxPermSize=256m -Djava.net.preferIPv4Stack=true -Dorg.jboss.resolver.warning=true -Dsun.rmi.dgc.client.gcInterval=3600000 -Dsun.rmi.dgc.server.gcInterval=3600000 -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djboss.server.default.config=standalone.xml -Dorg.jboss.boot.log.file=/usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/log/boot.log -Dlogging.configuration=file:/usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/configuration/logging.properties -jar /usr/local/EAP-6.0.1/jboss-eap-6.0/jboss-modules.jar -mp /usr/local/EAP-6.0.1/jboss-eap-6.0/modules -jaxpmodule javax.xml.jaxp-provider org.jboss.as.standalone -Djboss.home.dir=/usr/local/EAP-6.0.1/jboss-eap-6.0 -Djboss.server.base.dir=/usr/local/EAP-6.0.1/jboss-eap-6.0/standalone -Djboss.bind.address.management=0.0.0.0 -Djboss.socket.binding.port-offset=1
[p585600@scttqapllx0032 ~]$

