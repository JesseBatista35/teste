sh-4.4$ env | grep JAVA_OPTIONS_APPEND
JAVA_OPTIONS_APPEND=-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd-sigsj-20260707.jks -Dotel.exporter.otlp.endpoint=https://otel-collector-nprd.cemot.cloud.caixa
sh-4.4$ tr '\0' ' ' < /proc/1/cmdline | grep -o 'javaagent[^ ]*'
sh-4.4$ 


