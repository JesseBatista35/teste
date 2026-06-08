oc set env dc/sicbc-backend-des -n sicbc-des \
  JAVA_TOOL_OPTIONS="-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit"
