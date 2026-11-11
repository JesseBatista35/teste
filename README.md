
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
15:13:45,857 ERROR [org.keycloak.adapters.rotation.AdapterTokenVerifier] (default task-84) Didn't find publicKey for kid: MFeJ65_D-xqNy3VmkMHoMVKScfP7KmYk7mV0IhK-kAw
15:15:45,949 ERROR [org.keycloak.adapters.rotation.AdapterTokenVerifier] (default task-84) Didn't find publicKey for kid: MFeJ65_D-xqNy3VmkMHoMVKScfP7KmYk7mV0IhK-kAw
15:31:37,693 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-5) WFLYSRV0027: Iniciando a implantação do "SIBAN-MCM" (runtime-name: "mcm-1.0.1.23-b47.ear")
Caused by: java.sql.SQLException: JZ006: Caught IOException: java.net.ConnectException: Connection timed out (Connection timed out)
Caused by: java.net.ConnectException: Connection timed out (Connection timed out)
15:36:02,759 INFO  [org.jboss.weld.Bootstrap] (Weld Thread Pool -- 5) WELD-000119: Not generating any bean definitions from br.gov.caixa.arqrefcore.util.ArquillianHelper because of underlying class loading error: Type org.jboss.shrinkwrap.api.asset.Asset from [Module "deployment.mcm-1.0.1.23-b47.ear" from Service Module Loader] not found.  If this is unexpected, enable DEBUG logging to see the full error.
15:36:02,803 INFO  [org.jboss.weld.Bootstrap] (Weld Thread Pool -- 7) WELD-001125: Illegal bean type interface br.gov.caixa.arqrefcore.cache.Cache<java.lang.Class<?>,class br.gov.caixa.arqrefcore.reflexao.ReflectorClassCache> ignored on [EnhancedAnnotatedTypeImpl] public @Singleton class br.gov.caixa.arqrefcore.reflexao.ReflectorCache
15:36:02,804 INFO  [org.jboss.weld.Bootstrap] (Weld Thread Pool -- 7) WELD-001125: Illegal bean type br.gov.caixa.arqrefcore.cache.AbstractCache<java.lang.Class<?>, br.gov.caixa.arqrefcore.reflexao.ReflectorClassCache> ignored on [EnhancedAnnotatedTypeImpl] public @Singleton class br.gov.caixa.arqrefcore.reflexao.ReflectorCache
15:36:03,020 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 248) WFLYUT0021: Contexto web registrado: '/mcm-web' para servidor 'default-server'
15:36:03,047 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 238) WFLYSRV0010: "SIBAN-MCM" foi implantado (runtime-name: "mcm-1.0.1.23-b47.ear")

