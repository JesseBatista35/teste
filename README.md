
-sh-4.1$
-sh-4.1$
-sh-4.1$ sudo grep -n 'SICCR-TRIBUTOS' /opt/jboss/jboss-eap/dc/configuration/domain.xml
[sudo] password for p585600:
Sorry, try again.
[sudo] password for p585600:
56582:        <deployment name="SICCR-TRIBUTOS" runtime-name="sifec-tributos-1.1.0-b7.ear">
57729:                <deployment name="SICCR-TRIBUTOS" runtime-name="sifec-tributos-1.1.0-b7.ear"/>
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$





    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

[sudo] password for p585600:
11:56:19,668 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0027: Iniciando a implantação do "SICCR-PARAMETROS" (runtime-name: "sifec-ccr-parametros.ear")
11:56:32,973 INFO  [org.jboss.weld.Bootstrap] (Weld Thread Pool -- 1) WELD-000119: Not generating any bean definitions from br.gov.caixa.arqrefcore.util.ArquillianHelper because of underlying class loading error: Type org.jboss.shrinkwrap.api.asset.Asset from [Module "deployment.sifec-ccr-parametros.ear" from Service Module Loader] not found.  If this is unexpected, enable DEBUG logging to see the full error.
11:56:33,246 WARN  [org.jboss.weld.Bootstrap] (Weld Thread Pool -- 5) WELD-000167: Class br.gov.caixa.ccr.parametros.rest.resource.concessao.ConcessaoResourceV3Simulacao is annotated with @RequestScoped but it does not declare an appropriate constructor therefore is not registered as a bean!
11:56:33,246 WARN  [org.jboss.weld.Bootstrap] (Weld Thread Pool -- 6) WELD-000167: Class br.gov.caixa.ccr.parametros.rest.resource.concessao.ConcessaoResourceV2 is annotated with @RequestScoped but it does not declare an appropriate constructor therefore is not registered as a bean!
11:56:33,248 WARN  [org.jboss.weld.Bootstrap] (Weld Thread Pool -- 3) WELD-000167: Class br.gov.caixa.ccr.parametros.rest.resource.concessao.ConcessaoResourceV3 is annotated with @RequestScoped but it does not declare an appropriate constructor therefore is not registered as a bean!
11:56:33,254 INFO  [org.jboss.weld.Bootstrap] (Weld Thread Pool -- 6) WELD-001125: Illegal bean type interface br.gov.caixa.arqrefcore.cache.Cache<java.lang.Class<?>,class br.gov.caixa.arqrefcore.reflexao.ReflectorClassCache> ignored on [EnhancedAnnotatedTypeImpl] public @Singleton class br.gov.caixa.arqrefcore.reflexao.ReflectorCache
11:56:33,259 INFO  [org.jboss.weld.Bootstrap] (Weld Thread Pool -- 6) WELD-001125: Illegal bean type br.gov.caixa.arqrefcore.cache.AbstractCache<java.lang.Class<?>, br.gov.caixa.arqrefcore.reflexao.ReflectorClassCache> ignored on [EnhancedAnnotatedTypeImpl] public @Singleton class br.gov.caixa.arqrefcore.reflexao.ReflectorCache
11:56:34,061 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 216) WFLYUT0021: Contexto web registrado: '/ccr-parametros-web' para servidor 'default-server'
11:56:34,705 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 218) WFLYUT0021: Contexto web registrado: '/ccr-parametros-api' para servidor 'default-server'
11:56:34,773 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 202) WFLYSRV0010: "SICCR-PARAMETROS" foi implantado (runtime-name: "sifec-ccr-parametros.ear")


<img width="1872" height="877" alt="image" src="https://github.com/user-attachments/assets/19b00bed-ec5a-4543-9cd1-b63110738f1c" />

