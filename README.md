
-sh-4.2$
-sh-4.2$ POD=sigsj-alvara-des-666-2zzkm; NS=sigsj-des
-sh-4.2$ oc exec $POD -n $NS -- env | grep -Ei 'JAVA_OPT|JAVA_OPTIONS|JAVA_TOOL'
JAVA_OPTIONS_APPEND=-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd-sigsj-20260707.jks -Dotel.exporter.otlp.endpoint=https://otel-collector-nprd.cemot.cloud.caixa
JAVA_OPTIONS=-Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc sigsj-alvara-des -n $NS -o yaml | grep -B1 -A2 -Ei 'JAVA_OPT|javaagent'
                    f:value: {}
                  k:{"name":"JAVA_OPTIONS_APPEND"}:
                    .: {}
                    f:name: {}
--
          value: http://proxydes.caixa:80
        - name: JAVA_OPTIONS_APPEND
          value: -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd-sigsj-20260707.jks
            -Dotel.exporter.otlp.endpoint=https://otel-collector-nprd.cemot.cloud.caixa
-sh-4.2$ oc exec $POD -n $NS -- ls /deployments/lib/main | grep -i applicationinsights
com.microsoft.azure.applicationinsights-agent-3.7.1.jar
-sh-4.2$
