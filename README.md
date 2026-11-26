
-sh-4.2$ POD=sisou-sac-okd-des-253-bn9c7
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -n sisou-des $POD -c sisou-sac-okd-des -- \
>   sha256sum /opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd-sisou-20261126.jks
3ce3284e8611f116dca761cadbc5a93e8068f5340b8d6a5e129bb4374ea3151d  /opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd-sisou-20261126.jks
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -n sisou-des $POD -c sisou-sac-okd-des -- keytool -list -v -storepass changeit \
>   -keystore /opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd-sisou-20261126.jks \
>   | grep -E "contains|Owner: CN=Amazon Root"
Your keystore contains 40 entries
Owner: CN=Amazon Root CA 1, O=Amazon, C=US
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -n sisou-des $POD -c sisou-sac-okd-des -- sh -c "ps -ef | grep -o 'trustStore=[^ ]*' | head -1"
trustStore=/opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd-sisou-20261126.jks
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs -n sisou-des $POD -c sisou-sac-okd-des | grep -E "WFLYSRV0025|WFLYSRV0026|WFLYCTL0186|ERROR" | tail -20
10:50:13,765 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: JBoss EAP 7.4.14.GA (WildFly Core 15.0.32.Final-redhat-00001) started in 41204ms - Started 4193 of 4376 services (355 services are lazy, passive or on-demand)
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs -f -n sisou-des $POD -c sisou-sac-okd-des | grep -i -E "indecx|PKIX|SSLHandshake"
10:49:55,167 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'IndecxIntegracaoAS' in deployment unit 'subdeployment "sisou-sac-api.war" of deployment "sisou-sac-okd.ear"' are as follows:
        java:global/sisou-sac-okd/sisou-sac-api/IndecxIntegracaoAS!br.gov.caixa.bsb.sisou.core.integracao.indecx.IndecxIntegracaoAS
        java:app/sisou-sac-api/IndecxIntegracaoAS!br.gov.caixa.bsb.sisou.core.integracao.indecx.IndecxIntegracaoAS
        java:module/IndecxIntegracaoAS!br.gov.caixa.bsb.sisou.core.integracao.indecx.IndecxIntegracaoAS
        java:global/sisou-sac-okd/sisou-sac-api/IndecxIntegracaoAS
        java:app/sisou-sac-api/IndecxIntegracaoAS
        java:module/IndecxIntegracaoAS

