[p585600@scttqapllx0032 ~]$ ps -ef | grep jboss
root     128786      1  0 15:32 pts/2    00:00:00 su - jboss -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/usr/local/EAP-6.0.1/jboss-eap-6.0/lock/lock.file /usr/local/EAP-6.0.1/jboss-eap-6.0/bin/standalone.sh -Djboss.bind.address.management=0.0.0.0 -Djboss.socket.binding.port-offset=1
jboss    128789 128786  0 15:32 ?        00:00:00 /bin/sh /usr/local/EAP-6.0.1/jboss-eap-6.0/bin/standalone.sh -Djboss.bind.address.management=0.0.0.0 -Djboss.socket.binding.port-offset=1
jboss    128837 128789  3 15:32 ?        00:00:04 /usr/lib/jvm/java-1.7.0-openjdk-1.7.0.261.x86_64/jre/bin/java -D[Standalone] -server -XX:+UseCompressedOops -Xms1303m -Xmx1303m -XX:MaxPermSize=256m -Djava.net.preferIPv4Stack=true -Dorg.jboss.resolver.warning=true -Dsun.rmi.dgc.client.gcInterval=3600000 -Dsun.rmi.dgc.server.gcInterval=3600000 -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djboss.server.default.config=standalone.xml -Dorg.jboss.boot.log.file=/usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/log/boot.log -Dlogging.configuration=file:/usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/configuration/logging.properties -jar /usr/local/EAP-6.0.1/jboss-eap-6.0/jboss-modules.jar -mp /usr/local/EAP-6.0.1/jboss-eap-6.0/modules -jaxpmodule javax.xml.jaxp-provider org.jboss.as.standalone -Djboss.home.dir=/usr/local/EAP-6.0.1/jboss-eap-6.0 -Djboss.server.base.dir=/usr/local/EAP-6.0.1/jboss-eap-6.0/standalone -Djboss.bind.address.management=0.0.0.0 -Djboss.socket.binding.port-offset=1
p585600  129051 128566  0 15:34 pts/2    00:00:00 grep jboss
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$ tail -f /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/log/boot.log
        user.home = /home/jboss
        user.language = pt
        user.name = jboss
        user.timezone = America/Sao_Paulo
15:32:54,011 DEBUG [org.jboss.as.config] Argumentos VM: -D[Standalone] -XX:+UseCompressedOops -Xms1303m -Xmx1303m -XX:MaxPermSize=256m -Djava.net.preferIPv4Stack=true -Dorg.jboss.resolver.warning=true -Dsun.rmi.dgc.client.gcInterval=3600000 -Dsun.rmi.dgc.server.gcInterval=3600000 -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djboss.server.default.config=standalone.xml -Dorg.jboss.boot.log.file=/usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/log/boot.log -Dlogging.configuration=file:/usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/configuration/logging.properties
15:32:54,724 INFO  [org.xnio] XNIO Version 3.0.7.GA-redhat-1
15:32:54,729 INFO  [org.xnio.nio] XNIO NIO Implementation Version 3.0.7.GA-redhat-1
15:32:54,731 INFO  [org.jboss.as.server] JBAS015888: Criação de serviço de gerenciamento http usando o socket-binding (management-http)
15:32:54,744 INFO  [org.jboss.remoting] JBoss Remoting version 3.2.14.GA-redhat-1
15:32:54,767 INFO  [org.jboss.as.logging] JBAS011502: Remoção dos manuseadores de log bootstrap

