
[root@caddeapllx1441 p585600]# systemctl restart jboss-eap-standalone.service
[root@caddeapllx1441 p585600]# systemctl status jboss-eap-standalone.service
● jboss-eap-standalone.service - JBoss EAP Systemctl - STANDALONE
   Loaded: loaded (/etc/systemd/system/jboss-eap-standalone.service; enabled; vendor preset: disabled)
   Active: active (running) since Qua 2026-08-05 10:57:20 -03; 53s ago
  Process: 11273 ExecStop=/opt/jboss-eap/bin/init.d/jboss-eap-standalone.sh stop (code=exited, status=0/SUCCESS)
  Process: 11320 ExecStart=/opt/jboss-eap/bin/init.d/jboss-eap-standalone.sh start (code=exited, status=0/SUCCESS)
 Main PID: 11335 (runuser)
    Tasks: 233
   Memory: 1.8G
   CGroup: /system.slice/jboss-eap-standalone.service
           ├─11335 runuser jboss -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/opt/jboss-eap/standalone/tmp/jboss-eap-standalone.pid /opt/jboss-eap/bin/standalone.sh    ...
           ├─11338 /bin/sh /opt/jboss-eap/bin/standalone.sh -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs...
           └─11502 java -D[Standalone] -verbose:gc -Xloggc:/logs/jboss/jboss-eap/standalone/sisme/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotat...

Ago 05 10:57:14 caddeapllx1441.agil.nprd.caixa.gov.br systemd[1]: Starting JBoss EAP Systemctl - STANDALONE...
Ago 05 10:57:14 caddeapllx1441.agil.nprd.caixa.gov.br runuser[11325]: pam_unix(runuser:session): session opened for user jboss by (uid=0)
Ago 05 10:57:14 caddeapllx1441.agil.nprd.caixa.gov.br runuser[11325]: pam_unix(runuser:session): session closed for user jboss
Ago 05 10:57:14 caddeapllx1441.agil.nprd.caixa.gov.br runuser[11330]: pam_unix(runuser:session): session opened for user jboss by (uid=0)
Ago 05 10:57:14 caddeapllx1441.agil.nprd.caixa.gov.br runuser[11335]: pam_unix(runuser:session): session opened for user jboss by (uid=0)
Ago 05 10:57:20 caddeapllx1441.agil.nprd.caixa.gov.br systemd[1]: Started JBoss EAP Systemctl - STANDALONE.
Ago 05 10:57:20 caddeapllx1441.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[11320]: Starting JBoss EAP: [  OK  ]
[root@caddeapllx1441 p585600]#
[root@caddeapllx1441 p585600]#
[root@caddeapllx1441 p585600]# tail -f /logs/jboss/jboss-eap/standalone/sisme/server.log
2026-08-05 10:58:13,616 WARNING [javax.enterprise.resource.webcontainer.jsf.application] (ServerService Thread Pool -- 81) @FacesConverter is using both value and forClass, only value will be applied.
2026-08-05 10:58:14,013 INFO  [javax.enterprise.resource.webcontainer.jsf.config] (ServerService Thread Pool -- 81) Monitoring file:/opt/jboss-eap/standalone/tmp/vfs/deployment/deployment74299bc381411b6d/sisme-web-2.94.1.0.war-4db9c8aa9bc93ff7/WEB-INF/faces-config.xml for modifications
2026-08-05 10:58:14,111 INFO  [org.primefaces.webapp.PostConstructApplicationEventListener] (ServerService Thread Pool -- 81) Running on PrimeFaces 6.0
2026-08-05 10:58:14,203 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 81) WFLYUT0021: Contexto web registrado: '/sisme_intranet' para servidor 'default-server'
2026-08-05 10:58:14,306 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 44) WFLYSRV0010: "sisme-ear.ear" foi implantado (runtime-name: "sisme-ear.ear")
2026-08-05 10:58:14,306 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 44) WFLYSRV0010: "applicationinsights-agent.jar" foi implantado (runtime-name: "applicationinsights-agent.jar")
2026-08-05 10:58:14,374 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Retomando servidor
2026-08-05 10:58:14,390 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: JBoss EAP 7.4.8.GA (WildFly Core 15.0.19.Final-redhat-00001) iniciado em 30789ms - Iniciado(s) 9530 de serviços 9703 (os serviços 419 estão lentos, passivos ou sob demanda)
2026-08-05 10:58:14,394 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0060: A interface de gerenciamento http escutando em http://0.0.0.0:9990/management
2026-08-05 10:58:14,394 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0051: O console de administração escutando em http://0.0.0.0:9990


