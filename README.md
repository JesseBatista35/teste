isso na tag 1.0.0.0 

package gov.caixa.microfpp.infra.client;


import gov.caixa.microfpp.dto.request.IncluirBoletoRequest;
import gov.caixa.microfpp.dto.response.IncluirBoletoResponse;
import gov.caixa.microfpp.infra.filter.BoletoClientRequestFilter;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

/**
 * Cliente REST para a API de Boletos Caixa
 *
 * O header "apikey" é injetado automaticamente pelo BoletoClientRequestFilter,
 * eliminando a necessidade de passá-lo como parâmetro.
 *
 * Endpoint: POST /cobranca/boletos/v1/incluiBoleto
 */
@RegisterRestClient(configKey = "boleto.api")
@RegisterProvider(BoletoClientRequestFilter.class)
public interface IncluirBoletoApiClient {

    @POST
    @Path("/cobranca/boletos/v1/incluiBoleto")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    IncluirBoletoResponse incluiBoleto(
            @HeaderParam("Authorization") String token,
            IncluirBoletoRequest boletoRequest
    );
}






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
sso.keycloak.auth-server-url=${QUARKUS_OIDC_AUTH_SERVER_URL}
sso.keycloak.realm=intranet
sso.keycloak.client-id=${SSO_CLI_SER_FPP}
sso.keycloak.client-secret=${SSO_PASS_CLI_SER_FPP}
sso.keycloak.grant-type=client_credentials
sso.keycloak.scope=openid
sso.keycloak.retry.max-retries=3
sso.keycloak.retry.delay-millis=200
sso.token.cache-duration-minutes=55

# REST Client Configuration - Keycloak
# URL base: endpoint /token será anexado via @Path("/token") no cliente
quarkus.rest-client."sso.keycloak".url=https://login.des.caixa/auth/realms/intranet/protocol/openid-connect
%dev.quarkus.rest-client."sso.keycloak".insecure=true
%prod.quarkus.rest-client."sso.keycloak".insecure=false

# ==============================
# BOLETO API CONFIGURATION
# ==============================
boleto.api.base-url=${URL_BOLETO}
boleto.api.endpoint=${URL_BOLETO_ENDPOINT}
boleto.api.key=l7eb61df18ac414f8ab82f3abbe3577a78
boleto.api.connect-timeout=5000
boleto.api.read-timeout=10000
boleto.api.retry.max-retries=3
boleto.api.retry.delay-millis=200

# REST Client Configuration - Boleto API
# A API DES usa certificado que nao esta no truststore padrao da JVM.
# Para este cliente, configure um bucket TLS dedicado aceitando o certificado
# apenas neste ambiente controlado.
quarkus.rest-client."boleto.api".url=${URL_BOLETO}
quarkus.rest-client."boleto.api".proxy-address=none
quarkus.rest-client."boleto.api".tls-configuration-name=boleto-api-des

# TLS dedicado para a API de boleto em DES
quarkus.tls.boleto-api-des.trust-all=true
quarkus.tls.boleto-api-des.hostname-verification-algorithm=NONE

# Configuração global do Vert.x para aceitar certificados inválidos em DEV
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
quarkus.oidc.client-id=${SSO_CLI_SER_FPP}
quarkus.oidc.credentials.secret=${SSO_PASS_CLI_SER_FPP}
quarkus.oidc.enabled=false





ja na tag de DES estao usando essa  branch micro_sipp  - que ta funcionado


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
sso.keycloak.auth-server-url=${QUARKUS_OIDC_AUTH_SERVER_URL}
sso.keycloak.realm=intranet
sso.keycloak.client-id=${SSO_CLI_SER_FPP}
sso.keycloak.client-secret=${SSO_PASS_CLI_SER_FPP}
sso.keycloak.grant-type=client_credentials
sso.keycloak.scope=openid
sso.keycloak.retry.max-retries=3
sso.keycloak.retry.delay-millis=200
sso.token.cache-duration-minutes=55

# REST Client Configuration - Keycloak
# URL base: endpoint /token será anexado via @Path("/token") no cliente
quarkus.rest-client."sso.keycloak".url=https://login.des.caixa/auth/realms/intranet/protocol/openid-connect
%dev.quarkus.rest-client."sso.keycloak".insecure=true
%prod.quarkus.rest-client."sso.keycloak".insecure=false

# ==============================
# BOLETO API CONFIGURATION
# ==============================
boleto.api.base-url=${URL_BOLETO}
boleto.api.endpoint=${URL_BOLETO_ENDPOINT}
boleto.api.key=l7eb61df18ac414f8ab82f3abbe3577a78
boleto.api.connect-timeout=5000
boleto.api.read-timeout=10000
boleto.api.retry.max-retries=3
boleto.api.retry.delay-millis=200

# REST Client Configuration - Boleto API
# A API DES usa certificado que nao esta no truststore padrao da JVM.
# Para este cliente, configure um bucket TLS dedicado aceitando o certificado
# apenas neste ambiente controlado.
quarkus.rest-client."boleto.api".url=${URL_BOLETO}
quarkus.rest-client."boleto.api".proxy-address=none
quarkus.rest-client."boleto.api".tls-configuration-name=boleto-api-des

# TLS dedicado para a API de boleto em DES
quarkus.tls.boleto-api-des.trust-all=true
quarkus.tls.boleto-api-des.hostname-verification-algorithm=NONE

# Configuração global do Vert.x para aceitar certificados inválidos em DEV
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
quarkus.oidc.client-id=${SSO_CLI_SER_FPP}
quarkus.oidc.credentials.secret=${SSO_PASS_CLI_SER_FPP}
quarkus.oidc.enabled=false





package gov.caixa.microfpp.infra.client;


import gov.caixa.microfpp.dto.request.IncluirBoletoRequest;
import gov.caixa.microfpp.dto.response.IncluirBoletoResponse;
import gov.caixa.microfpp.infra.filter.BoletoClientRequestFilter;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

/**
 * Cliente REST para a API de Boletos Caixa
 *
 * O header "apikey" é injetado automaticamente pelo BoletoClientRequestFilter,
 * eliminando a necessidade de passá-lo como parâmetro.
 *
 * Endpoint: POST /cobranca/boletos/v1/incluiBoleto
 */
@RegisterRestClient(configKey = "boleto.api")
@RegisterProvider(BoletoClientRequestFilter.class)
public interface IncluirBoletoApiClient {

    @POST
    @Path("/cobranca/boletos/v1/incluiBoleto")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    IncluirBoletoResponse incluiBoleto(
            @HeaderParam("Authorization") String token,
            IncluirBoletoRequest boletoRequest
    );
}



