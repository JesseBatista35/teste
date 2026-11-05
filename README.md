
[p585600@cbrdeapllx473 ~]$ sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -iE --line-buffered "workflow-credito|ERROR|Exception"
10:01:14,609 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 128) WFLYUT0021: Contexto web registrado: '/workflow-credito-pj-web' para servidor 'default-server'
10:01:14,637 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 103) WFLYSRV0010: "SICCR-PJ" foi implantado (runtime-name: "workflow-credito-pj-ear-8.40.1-20261105.100217-6.ear")
               URI=/fec-web/resources/js/comp/error.js
10:10:28,794 WARN  [org.hibernate.engine.jdbc.spi.SqlExceptionHelper] (default task-3) SQL Warning Code: 4223, SQLState: null
10:10:28,794 WARN  [org.hibernate.engine.jdbc.spi.SqlExceptionHelper] (default task-3) Origination unknown: [10228][11541][4.16.53] Ocorreram exceções de segurança ao carregar o driver. ERRORCODE=4223, SQLSTATE=null
               URI=/fec-web/emprest/app/login/workflow-credito-pj-web
               URI=/fec-web/resources/js/comp/error.js
               URI=/fec-web/emprest/app/login/workflow-credito-pj-web

