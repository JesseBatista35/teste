
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$ ps -ef | grep java
jboss     45082  45034  0 Aug05 ?        00:24:30 /usr/lib/jvm/java-1.7.0-openjdk-1.7.0.261.x86_64/jre/bin/java -D[Standalone] -server -XX:+UseCompressedOops -Xms1303m -Xmx1303m -XX:MaxPermSize=256m -Djava.net.preferIPv4Stack=true -Dorg.jboss.resolver.warning=true -Dsun.rmi.dgc.client.gcInterval=3600000 -Dsun.rmi.dgc.server.gcInterval=3600000 -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djboss.server.default.config=standalone.xml -Dorg.jboss.boot.log.file=/usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/log/boot.log -Dlogging.configuration=file:/usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/configuration/logging.properties -jar /usr/local/EAP-6.0.1/jboss-eap-6.0/jboss-modules.jar -mp /usr/local/EAP-6.0.1/jboss-eap-6.0/modules -jaxpmodule javax.xml.jaxp-provider org.jboss.as.standalone -Djboss.home.dir=/usr/local/EAP-6.0.1/jboss-eap-6.0 -Djboss.server.base.dir=/usr/local/EAP-6.0.1/jboss-eap-6.0/standalone -Djboss.bind.address.management=0.0.0.0 -Djboss.socket.binding.port-offset=1
p585600  125379 125354  0 15:21 pts/1    00:00:00 grep java
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$ ps -ef | grep sismh
p585600  125420 125354  0 15:22 pts/1    00:00:00 grep sismh
[p585600@scttqapllx0032 ~]$ -c standalone.xml
-bash: -c: comando não encontrado
[p585600@scttqapllx0032 ~]$ ls -la
total 28
drwx------.  3 p585600 G_IC0000_Padrao 4096 Mar 20 17:07 .
drwxr-xr-x. 48 root    root            4096 Jul 27 15:59 ..
-rw-------.  1 p585600 G_IC0000_Padrao 3034 Jul 13 14:33 .bash_history
-rw-------.  1 p585600 G_IC0000_Padrao   18 Mar 20 13:54 .bash_logout
-rw-------.  1 p585600 G_IC0000_Padrao  176 Mar 20 13:54 .bash_profile
-rw-------.  1 p585600 G_IC0000_Padrao  124 Mar 20 13:54 .bashrc
drwx------.  4 p585600 G_IC0000_Padrao 4096 Mar 20 13:54 .mozilla
[p585600@scttqapllx0032 ~]$ pwd
/home/p585600
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$ cd /opt/
[p585600@scttqapllx0032 opt]$ ls -la
total 28
drwxr-xr-x.  7 root     root     4096 Mar 31 11:50 .
dr-xr-xr-x. 31 root     root     4096 Jul  8 16:38 ..
drwxr-xr-x.  5 ctmagelx ctmagelx 4096 Out 29  2021 ctmage
drwxr-xr-x.  3 jboss    jboss    4096 Mar 26  2019 etc
drwxr-xr-x.  3 root     root     4096 Mar 10 14:23 https-client
drwx--x--x.  3 root     root     4096 Set 13  2023 PostgreSQL
drwxr-xr-x.  2 root     root     4096 Ago 10  2017 rh
[p585600@scttqapllx0032 opt]$
