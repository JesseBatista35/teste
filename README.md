-sh-4.2$ oc rsh sifpp-micro-des-35-8bfs8 sh -c "/usr/java/jdk-21.0.1/bin/jar tf /deployments/app/sifpp-ms-0.0.0.1.jar | grep -i application"
application.properties
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh sifpp-micro-des-35-8bfs8 sh -c "cd /tmp && /usr/java/jdk-21.0.1/bin/jar xf /deployments/app/sifpp-ms-0.0.0.1.jar application.properties && cat /tmp/application.properties"
quarkus.console.color=true

# ==============================
# HTTP E DOCUMENTACAO
# ==============================
quarkus.http.port=8082
quarkus.swagger-ui.path=/swagger-ui
quarkus.swagger-ui.always-include=true
quarkus.swagger-ui.enable=true
quarkus.swagger-ui.theme=material

# ==============================
# HEALTH CHECK
# ==============================
quarkus.smallrye-health.root-path=/health

# ==============================
# SSO - KEYCLOAK CONFIGURATION
# ==============================
sso.keycloak.auth-server-url=https://login.des.caixa
sso.keycloak.realm=intranet
sso.keycloak.client-id=cli-ser-fpp
sso.keycloak.client-secret=e435c692-b526-434b-b0fc-3d486f51d632
sso.keycloak.grant-type=client_credentials
sso.keycloak.scope=openid
sso.keycloak.retry.max-retries=3
sso.keycloak.retry.delay-millis=200
sso.token.cache-duration-minutes=55

# REST Client Configuration - Keycloak
# URL base: endpoint /token ser▒ anexado via @Path("/token") no cliente
quarkus.rest-client."sso.keycloak".url=https://login.des.caixa/auth/realms/intranet/protocol/openid-connect
%dev.quarkus.rest-client."sso.keycloak".insecure=true
%prod.quarkus.rest-client."sso.keycloak".insecure=false

# ==============================
# BOLETO API CONFIGURATION
# ==============================
boleto.api.base-url=https://api.des.caixa:8443
boleto.api.endpoint=/cobranca/boletos/v1/incluiBoleto
boleto.api.key=l7eb61df18ac414f8ab82f3abbe3577a78
boleto.api.connect-timeout=5000
boleto.api.read-timeout=10000
boleto.api.retry.max-retries=3
boleto.api.retry.delay-millis=200

# REST Client Configuration - Boleto API
# A API DES usa certificado que nao esta no truststore padrao da JVM.
# Para este cliente, configure um bucket TLS dedicado aceitando o certificado
# apenas neste ambiente controlado.
quarkus.rest-client."boleto.api".url=https://api.des.caixa:8443
quarkus.rest-client."boleto.api".tls-configuration-name=boleto-api-des

# TLS dedicado para a API de boleto em DES
quarkus.tls.boleto-api-des.trust-all=true
quarkus.tls.boleto-api-des.hostname-verification-algorithm=NONE

# Configura▒▒o global do Vert.x para aceitar certificados inv▒lidos em DEV
%dev.vertx.tls.allow-insecure=true
%prod.vertx.tls.allow-insecure=false

# ==============================
# REST CLIENT LOGGING
# ==============================
quarkus.rest-client.logging.scope=request-response
quarkus.rest-client.logging.level=VERBOSE

# ==============================
# FAULT TOLERANCE - RETRY
# ==============================
#quarkus.fault-tolerance."gov.caixa.microfpp.services.apiService.retry.IncluirBoletoApiRetryService/incluiBoleto".retry.max-retries=${boleto.api.retry.max-retries}
#quarkus.fault-tolerance."gov.caixa.microfpp.services.apiService.retry.IncluirBoletoApiRetryService/incluiBoleto".retry.delay=${boleto.api.retry.delay-millis}
#quarkus.fault-tolerance."gov.caixa.microfpp.services.apiService.retry.IncluirBoletoApiRetryService/incluiBoleto".retry.delay-unit=millis

#quarkusquarkus.fault-tolerance."gov.caixa.microfpp.services.apiService.SSOTokenRetryService/solicitarNovoToken".retry.max-retries=${sso.keycloak.retry.max-retries}
#quarkusquarkus.fault-tolerance."gov.caixa.microfpp.services.apiService.SSOTokenRetryService/solicitarNovoToken".retry.delay=${sso.keycloak.retry.delay-millis}
#quarkusquarkus.fault-tolerance."gov.caixa.microfpp.services.apiService.SSOTokenRetryService/solicitarNovoToken".retry.delay-unit=millis


#CONFIG CORS
quarkus.http.cors=true
quarkus.http.cors.origins=*
quarkus.http.cors.methods=GET,PUT,POST,DELETE,OPTIONS
quarkus.http.cors.headers=accept,authorization,content-type,x-requested-with
quarkus.http.cors.exposed-headers=Content-Disposition
#quarkus.http.cors.origins=https://login.des.caixa/auth/realms/intranet


#######################
####    DATABASE   ####
#######################

quarkus.datasource.db-kind=mssql
quarkus.datasource.jdbc.driver=com.microsoft.sqlserver.jdbc.SQLServerDriver
quarkus.datasource.jdbc.url=${QUARKUS_DATASOURCE_JDBC_URL}
quarkus.datasource.username=${QUARKUS_DATASOURCE_USERNAME}
quarkus.datasource.password=${QUARKUS_DATASOURCE_PASSWORD}


##########################
####   LOGS CONFIG    ####
##########################


############################
#### API MANAGER CONFIG ####
############################

# Caixa API Manager
#api.manager.url=https://api.des.caixa:8443/
#api.manager.key=l7cf7839a6152c496da545ec6d05789810

#############################
#### INTERFACES EXTERNAS ####
#############################

#GARANTIA-MS
quarkus.rest-client.garantia.url=${ROUTES.MS-GARANTIA}


##############################
## CRIPTOGRAFIA DE RESPOSTA ##
##############################
#api.criptografia.secret-key=${SECRET_KEY_BASE64}
#api.criptografia.init-vector=${INIT_VECTOR_BASE64}

# SIISO
#siiso-api.url=${SIISO_URL}
#siiso-api.manager.url=${api.manager.url}informacoes-sociais/
#siiso-api/mp-rest/url=${siiso-api.manager.url:${siiso-api.url}}
#siiso-api/mp-rest/scope=javax.inject.Singleton
#%dev.siiso-api/mp-rest/trustStore=${truststore.file}
#%dev.siiso-api/mp-rest/trustStorePassword=${truststore.password}
#%dev.siiso-api/mp-rest/trustStoreFileType=JKS

# Open Telemetry Config
# quarkus.otel.enabled=true
# quarkus.otel.exporter.otlp.endpoint=http://localhost:4317
# quarkus.otel.exporter.otlp.protocol=http/protobuf

#SSO-Keycloak
quarkus.oidc.auth-server-url=https://login.des.caixa/auth/realms/intranet
quarkus.oidc.client-id=cli-ser-fpp
quarkus.oidc.credentials.secret=e435c692-b526-434b-b0fc-3d486f51d632
quarkus.oidc.enabled=false


-sh-4.2$
