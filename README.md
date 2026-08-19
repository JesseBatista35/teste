
[p585600@scttqapllx0032 opt]$ exit
logout
Connection to 10.116.18.146 closed.
[p585600@cadsvitrlx100 ~]$ ssh 10.116.18.146
p585600@10.116.18.146's password:
Last login: Wed Aug 19 15:21:08 2026 from 10.122.150.31
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$ cat /usr/local/EAP-6.0.1/jboss-eap-6.0/lock/lock.file
cat: /usr/local/EAP-6.0.1/jboss-eap-6.0/lock/lock.file: Arquivo ou diretório não encontrado
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$ echo 125771 | sudo -u jboss tee /usr/local/EAP-6.0.1/jboss-eap-6.0/lock/lock.file
125771
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$ ps -ef | grep java
jboss    125771 125739 16 15:47 ?        00:00:48 /usr/lib/jvm/java-1.7.0-openjdk-1.7.0.261.x86_64/jre/bin/java -D[Standalone] -server -XX:+UseCompressedOops -Xms1303m -Xmx1303m -XX:MaxPermSize=256m -Djava.net.preferIPv4Stack=true -Dorg.jboss.resolver.warning=true -Dsun.rmi.dgc.client.gcInterval=3600000 -Dsun.rmi.dgc.server.gcInterval=3600000 -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djboss.server.default.config=standalone.xml -Dorg.jboss.boot.log.file=/usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/log/boot.log -Dlogging.configuration=file:/usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/configuration/logging.properties -jar /usr/local/EAP-6.0.1/jboss-eap-6.0/jboss-modules.jar -mp /usr/local/EAP-6.0.1/jboss-eap-6.0/modules -jaxpmodule javax.xml.jaxp-provider org.jboss.as.standalone -Djboss.home.dir=/usr/local/EAP-6.0.1/jboss-eap-6.0 -Djboss.server.base.dir=/usr/local/EAP-6.0.1/jboss-eap-6.0/standalone -Djboss.bind.address.management=0.0.0.0 -Djboss.socket.binding.port-offset=1
p585600  126375 126262  0 15:51 pts/2    00:00:00 grep java
[p585600@scttqapllx0032 ~]$
