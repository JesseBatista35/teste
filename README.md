
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ LOG=/logs/jboss/jboss-eap/standalone/simkt-backend-vm
-sh-4.2$ ls -l --time-style=full-iso /opt/jboss-eap/standalone/deployments/
total 114580
-rw-r--r-- 1 jboss jboss 37660416 2026-08-24 10:56:27.695121000 -0300 applicationinsights-agent.jar
-rw-r--r-- 1 jboss jboss       29 2026-08-24 10:56:27.695000000 -0300 applicationinsights-agent.jar.deployed
-rw-r--r-- 1 jboss jboss    46146 2026-10-08 16:03:22.903002303 -0300 applicationinsights.log
-rw-r--r-- 1 jboss jboss   658572 2026-08-24 10:56:25.898105000 -0300 postgresql.jar
-rw-r--r-- 1 jboss jboss       14 2026-08-24 10:56:25.898000000 -0300 postgresql.jar.deployed
-rwxrwxr-x 1 jboss jboss     8888 2021-06-23 08:26:28.000000000 -0300 README.txt
-rwxrw-rw- 1 jboss jboss 78932216 2026-10-08 16:03:16.336083000 -0300 simkt.war
-rw-r--r-- 1 jboss jboss        9 2026-10-08 16:03:16.336000000 -0300 simkt.war.deployed
-sh-4.2$
-sh-4.2$
-sh-4.2$ zgrep -E "WFLYSRV0010|WFLYSRV0013|WFLYSRV0016|WFLYSRV0025|WFLYSRV0050|WFLYSRV0049" $LOG/server.log.2026-10-08.gz
2026-10-08 16:03:20,304 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0050: JBoss EAP 7.4.8.GA (WildFly Core 15.0.19.Final-redhat-00001) interrompido em 1925ms
2026-10-08 16:03:25,703 INFO  [org.jboss.as] (MSC service thread 1-3) WFLYSRV0049: Inicializando JBoss EAP 7.4.8.GA (WildFly Core 15.0.19.Final-redhat-00001)
2026-10-08 16:03:48,608 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 44) WFLYSRV0010: "applicationinsights-agent.jar" foi implantado (runtime-name: "applicationinsights-agent.jar")
2026-10-08 16:03:48,608 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 44) WFLYSRV0010: "postgresql.jar" foi implantado (runtime-name: "postgresql.jar")
2026-10-08 16:03:48,608 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 44) WFLYSRV0010: "simkt.war" foi implantado (runtime-name: "simkt.war")
2026-10-08 16:03:48,675 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: JBoss EAP 7.4.8.GA (WildFly Core 15.0.19.Final-redhat-00001) iniciado em 25766ms - Iniciado(s) 763 de serviços 966 (os serviços 372 estão lentos, passivos ou sob demanda)
-sh-4.2$ zgrep -c "PermissionFilter" $LOG/server.log.2026-10-07.gz
0
-sh-4.2$ zgrep -c "PermissionFilter" $LOG/server.log.2026-10-08.gz
1
-sh-4.2$
-sh-4.2$
-sh-4.2$ zgrep -m1 "ErrorPageFilter" $LOG/server.log.2026-10-09.gz | cut -c1-200
2026-10-09 09:53:26,877 ERROR [org.springframework.boot.web.servlet.support.ErrorPageFilter] (default task-1) Forwarding to error page from request [/api/v1/privilege] due to exception [java.lang.Null
-sh-4.2$
-sh-4.2$
-sh-4.2$
