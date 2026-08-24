
[root@caddeapllx698 p585600]# mkdir -p /var/log/jboss-as
[root@caddeapllx698 p585600]# nohup /home/jboss-eap-6.4/bin/standalone.sh \
>   -Djboss.node.name=CSD6 \
>   -Djboss.server.base.dir=/home/jboss-eap-6.4/standaloneCSD6 \
>   -b 0.0.0.0 -bmanagement 0.0.0.0 \
>   -c standaloneCSD6.xml \
>   > /var/log/jboss-as/consoleCSD6.log 2>&1 &
[2] 15729
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]# sleep 20
[root@caddeapllx698 p585600]# tail -60 /var/log/jboss-as/consoleCSD6.log
    Caused by: org.jboss.modules.ModuleNotFoundException: org.jboss.as.domain-http-error-context:main"}}
16:58:08,984 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for keycloak subsystem MODEL stage boot operations
16:58:08,984 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for datasources subsystem MODEL stage boot operations
16:58:08,984 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for deployment-scanner subsystem MODEL stage boot operations
16:58:08,984 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for ee subsystem MODEL stage boot operations
16:58:08,984 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for ejb3 subsystem MODEL stage boot operations
16:58:08,984 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for infinispan subsystem MODEL stage boot operations
16:58:08,984 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for jaxrs subsystem MODEL stage boot operations
16:58:08,984 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for jca subsystem MODEL stage boot operations
16:58:08,984 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for jdr subsystem MODEL stage boot operations
16:58:08,984 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for jmx subsystem MODEL stage boot operations
16:58:08,984 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for jpa subsystem MODEL stage boot operations
16:58:08,984 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for jsf subsystem MODEL stage boot operations
16:58:08,984 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for mail subsystem MODEL stage boot operations
16:58:08,984 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for naming subsystem MODEL stage boot operations
16:58:08,984 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for pojo subsystem MODEL stage boot operations
16:58:08,984 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for remoting subsystem MODEL stage boot operations
16:58:08,984 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for resource-adapters subsystem MODEL stage boot operations
16:58:08,984 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for sar subsystem MODEL stage boot operations
16:58:08,984 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for security subsystem MODEL stage boot operations
16:58:08,984 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for threads subsystem MODEL stage boot operations
16:58:08,985 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for transactions subsystem MODEL stage boot operations
16:58:08,985 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for web subsystem MODEL stage boot operations
16:58:08,985 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for webservices subsystem MODEL stage boot operations
16:58:08,985 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for weld subsystem MODEL stage boot operations
16:58:08,985 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 30) JBAS015859: Deployed "siaoi.ear" (runtime-name : "siaoi.ear")
16:58:08,985 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 30) JBAS015859: Deployed "wmq.jmsra-7.5.0.8.rar" (runtime-name : "wmq.jmsra-7.5.0.8.rar")
16:58:08,987 INFO  [org.jboss.as.controller] (Controller Boot Thread) JBAS014774: Service status report
JBAS014777:   Services which failed to start:      service jboss.serverManagement.controller.management.http: org.jboss.msc.service.StartException in service jboss.serverManagement.controller.management.http: java.io.IOException: Unable to load resource handler

16:58:08,988 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for keycloak subsystem RUNTIME stage boot operations
16:58:08,988 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for logging subsystem RUNTIME stage boot operations
16:58:08,988 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for datasources subsystem RUNTIME stage boot operations
16:58:08,988 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for deployment-scanner subsystem RUNTIME stage boot operations
16:58:08,988 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for ee subsystem RUNTIME stage boot operations
16:58:08,988 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for ejb3 subsystem RUNTIME stage boot operations
16:58:08,988 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for infinispan subsystem RUNTIME stage boot operations
16:58:08,988 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for jaxrs subsystem RUNTIME stage boot operations
16:58:08,988 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for jca subsystem RUNTIME stage boot operations
16:58:08,988 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for jdr subsystem RUNTIME stage boot operations
16:58:08,988 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for jmx subsystem RUNTIME stage boot operations
16:58:08,988 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for jpa subsystem RUNTIME stage boot operations
16:58:08,988 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for jsf subsystem RUNTIME stage boot operations
16:58:08,988 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for mail subsystem RUNTIME stage boot operations
16:58:08,988 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for naming subsystem RUNTIME stage boot operations
16:58:08,988 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for pojo subsystem RUNTIME stage boot operations
16:58:08,988 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for remoting subsystem RUNTIME stage boot operations
16:58:08,988 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for resource-adapters subsystem RUNTIME stage boot operations
16:58:08,988 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for sar subsystem RUNTIME stage boot operations
16:58:08,988 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for security subsystem RUNTIME stage boot operations
16:58:08,988 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for threads subsystem RUNTIME stage boot operations
16:58:08,988 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for transactions subsystem RUNTIME stage boot operations
16:58:08,988 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for web subsystem RUNTIME stage boot operations
16:58:08,988 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for webservices subsystem RUNTIME stage boot operations
16:58:08,988 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for weld subsystem RUNTIME stage boot operations
16:58:09,016 INFO  [org.jboss.as] (Controller Boot Thread) JBAS015964: Http management interface is not enabled
16:58:09,016 INFO  [org.jboss.as] (Controller Boot Thread) JBAS015954: Admin console is not enabled
16:58:09,016 ERROR [org.jboss.as] (Controller Boot Thread) JBAS015875: JBoss AS 7.5.0.Final-redhat-21 "Janus" started (with errors) in 14555ms - Started 529 of 569 services (2 services failed or missing dependencies, 66 services are lazy, passive or on-demand)
16:58:09,210 DEBUG [net.sf.ehcache.util.UpdateChecker] (net.sf.ehcache.CacheManager@51b97320) Update check failed: java.net.SocketTimeoutException: connect timed out
[root@caddeapllx698 p585600]# ps -ef | grep -i CSD6
root      15729   1074  0 16:57 pts/0    00:00:00 /bin/sh /home/jboss-eap-6.4/bin/standalone.sh -Djboss.node.name=CSD6 -Djboss.server.base.dir=/home/jboss-eap-6.4/standaloneCSD6 -b 0.0.0.0 -bmanagement 0.0.0.0 -c standaloneCSD6.xml
root      15862  15729 99 16:57 pts/0    00:00:26 java -D[Standalone] -server -XX:+UseCompressedOops -verbose:gc -Xloggc:/home/jboss-eap-6.4/standaloneCSD6/log/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms1303m -Xmx1303m -XX:MaxPermSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djboss.modules.policy-permissions=true -Dorg.jboss.boot.log.file=/home/jboss-eap-6.4/standaloneCSD6/log/server.log -Dlogging.configuration=file:/home/jboss-eap-6.4/standaloneCSD6/configuration/logging.properties -jar /home/jboss-eap-6.4/jboss-modules.jar -mp /home/jboss-eap-6.4/modules -jaxpmodule javax.xml.jaxp-provider org.jboss.as.standalone -Djboss.home.dir=/home/jboss-eap-6.4 -Djboss.server.base.dir=/home/jboss-eap-6.4/standaloneCSD6 -Djboss.node.name=CSD6 -Djboss.server.base.dir=/home/jboss-eap-6.4/standaloneCSD6 -b 0.0.0.0 -bmanagement 0.0.0.0 -c standaloneCSD6.xml
root      16060   1074  0 16:58 pts/0    00:00:00 grep --color=auto -i CSD6
[root@caddeapllx698 p585600]#
