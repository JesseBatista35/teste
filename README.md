
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$ ls -l /opt/jboss-eap/standalone/deployments/ | grep -i framework
-rw-r--r-- 1 jboss jboss    63527 nov  9 10:45 framework.jar
-rw-r--r-- 1 jboss jboss       13 nov  9 10:45 framework.jar.deployed
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$ sudo tail -f /logs/jboss/jboss-eap/standalone/siemp-java-web/server.log | grep -E "WFLYSRV0010|WFLYSRV0025|WFLYSRV0026|WFLYCTL0013|WFLYCTL0412|ERROR|framework|modcluster"
[sudo] senha para p585600:
2026-11-09 10:46:09,058 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 43) WFLYSRV0010: "framework.jar" foi implantado (runtime-name: "framework.jar")
2026-11-09 10:46:09,058 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 43) WFLYSRV0010: "siemp-ear.ear" foi implantado (runtime-name: "siemp-ear.ear")
2026-11-09 10:46:09,091 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001) iniciado em 8379ms - Iniciado(s) 1425 de serviços 1627 (os serviços 367 estão lentos, passivos ou sob demanda)





me passa o resmuo para eu eu possa pasrar em sala. deu certo passou o deploy a relase subiu
