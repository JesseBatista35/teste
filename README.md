oc set env dc/sicbc-backend-des -n sicbc-des \
  QUARKUS_OIDC_CREDENTIALS_SECRET="bef84ba6-cc6e-435b-9b2f-2f2248a6887f" \
  QUARKUS_HTTP_CORS_ORIGINS="https://sicbc-frontend-des.apps.nprd.caixa" \
  QUARKUS_OIDC_AUTH_SERVER_URL="https://login.des.caixa/auth/realms/intranet" \
  QUARKUS_OIDC_CLIENT_ID="cli-web-cbc" \
  JAVA_TOOL_OPTIONS="-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit"
