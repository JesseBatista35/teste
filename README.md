
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$ sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -E "WFLYSRV0010|WFLYSRV0027|WFLYSRV0021|WFLYUT0021|WELD-00|ERROR|Caused by|hub"

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

[sudo] password for p585600:
14:45:08,378 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 236) WFLYJPA0011: Interrompendo unidade de persistência (fase 2 de 2) Serviço 'hub-api-2.2.0-b809.ear/hub-api.war#SIEMP-PU'
14:45:08,379 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 229) WFLYJPA0011: Interrompendo unidade de persistência (fase 1 de 2) Serviço 'hub-api-2.2.0-b809.ear/hub-api.war#HUB-PU'
14:45:08,383 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 237) WFLYJPA0011: Interrompendo unidade de persistência (fase 2 de 2) Serviço 'hub-api-2.2.0-b809.ear/hub-api.war#fecDS'
14:45:08,386 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 237) WFLYJPA0011: Interrompendo unidade de persistência (fase 1 de 2) Serviço 'hub-api-2.2.0-b809.ear/hub-api.war#SiempEjbDB2'
14:45:08,386 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 232) WFLYJPA0011: Interrompendo unidade de persistência (fase 1 de 2) Serviço 'hub-api-2.2.0-b809.ear/hub-api.war#fecDS'
14:45:08,386 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 236) WFLYJPA0011: Interrompendo unidade de persistência (fase 1 de 2) Serviço 'hub-api-2.2.0-b809.ear/hub-api.war#SIEMP-PU'
14:45:08,429 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0208: Interrompendo a subimplantação (runtime-name: hub-api.war) em 62ms
14:45:08,430 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0028: Implantação interrompida SICCR-HUB-BACKEND2 (runtime-name: hub-api-2.2.0-b809.ear) em 64ms
14:55:36,877 INFO  [org.jboss.modcluster] (ServerService Thread Pool -- 236) MODCLUSTER000021: All pending requests drained from default-host:/hub-web in 0,0 seconds
14:55:36,889 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 236) WFLYUT0022: Contexto web não registrado:'/hub-web' do servidor 'default-server'
14:55:36,947 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0208: Interrompendo a subimplantação (runtime-name: hub-web.war) em 101ms
14:55:36,953 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-5) WFLYSRV0028: Implantação interrompida SICCR-HUB-FRONTEND (runtime-name: hub-web-1.4.0-b378.ear) em 106ms
14:55:36,987 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 226) WFLYSRV0009: "SICCR-HUB-FRONTEND" teve sua implantação cancelada (runtime-name: "hub-web-1.4.0-b378.ear")
14:55:44,391 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-5) WFLYSRV0027: Iniciando a implantação do "SICCR-HUB-FRONTEND2" (runtime-name: "hub-web-1.10.0.1-b418.ear")
14:55:44,484 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-5) WFLYSRV0207: Iniciando a subimplantação (runtime-name: "hub-web.war")
14:55:44,573 INFO  [org.jboss.keycloak] (MSC service thread 1-8) Keycloak subsystem override for deployment hub-web.war
14:55:44,610 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 238) WFLYUT0021: Contexto web registrado: '/hub-web' para servidor 'default-server'
14:55:44,641 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 226) WFLYSRV0010: "SICCR-HUB-FRONTEND2" foi implantado (runtime-name: "hub-web-1.10.0.1-b418.ear")




pode melhorar esse hub-frontend
