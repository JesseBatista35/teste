### CORS
#quarkus.http.cors=true
#quarkus.http.cors.origins=http://localhost:4200,http://localhost:8080
#quarkus.http.cors.methods=GET,PUT,POST,PATCH,DELETE,OPTIONS
#quarkus.http.cors.headers=accept,authorization,content-type,x-requested-with
#quarkus.http.cors.exposed-headers=Content-Disposition
#quarkus.http.cors.access-control-max-age=24H
#quarkus.http.cors.access-control-allow-credentials=true

## Operacao
quarkus.smallrye-health.ui.always-include=true
quarkus.smallrye-openapi.path=/swagger
quarkus.smallrye-openapi.security-scheme=jwt
quarkus.http.test-port=8888
quarkus.http.port=8080

## OpenAPI
mp.openapi.extensions.smallrye.info.title=SIMPI-med
mp.openapi.extensions.smallrye.info.version=1.0.0
mp.openapi.extensions.smallrye.info.description=Mecanismo Especial de Devolucao (MED 2.0)
mp.openapi.extensions.smallrye.info.contact.email=pix@caixa.com.br
mp.openapi.extensions.smallrye.info.contact.url=https://pix.caixa.gov.br

## Log com correlacao
quarkus.console.color=false
quarkus.log.console.format=%d{HH:mm:ss} %-5p  [CORRELATION-ID - %X{correlation-id}] [%c{2.}] (%t) [SIMPI][MED] %s%e%n

## Validacao token JWT
PIX.FRAMEWORK.VALIDACAO_TOKEN.SSO.URL=
PIX.FRAMEWORK.VALIDACAO_TOKEN.SSO.EMISSOR=
PIX.FRAMEWORK.VALIDACAO_TOKEN.VALIDACAO_GLOBAL=true

## Integracao BACEN via RestClient
BACEN_V2_URL=
BACEN_MED_MAX_CONNECTIONS=50

quarkus.rest-client.bacen-v2.url=${BACEN_V2_URL}
quarkus.rest-client.bacen-v2.connect-timeout=5000
quarkus.rest-client.bacen-v2.read-timeout=5000
quarkus.rest-client.bacen-v2.connection-pool-size=${BACEN_MED_MAX_CONNECTIONS}
quarkus.rest-client.bacen-v2.connection-ttl=60
quarkus.rest-client.bacen-v2.tls-configuration-name=bacen-mtls

# HSM e CERTIFICADO
dict.hsm.hostname=${HSM_HOSTNAME}
dict.hsm.user-id=${HSM_USER_ID}
dict.hsm.password=${HSM_PASSWORD}
dict.hsm.private-key-name=${HSM_PRIVATE_KEY_NAME}
dict.certificado.assinatura.issuer-name=${CERT_ASSINATURA_ISSUER_NAME}
dict.certificado.assinatura.serial-number=${CERT_ASSINATURA_SERIAL_NUMBER}

################################################################################
# TLS REGISTRY - BACEN mTLS COM JKS
################################################################################
quarkus.tls.bacen-mtls.key-store.jks.path=${MED_KEYSTORE_PATH}
quarkus.tls.bacen-mtls.key-store.jks.password=${MED_KEYSTORE_PASSWORD}
quarkus.tls.bacen-mtls.trust-store.jks.path=${MED_TRUSTSTORE_PATH}
quarkus.tls.bacen-mtls.trust-store.jks.password=${MED_TRUSTSTORE_PASSWORD}
quarkus.tls.bacen-mtls.protocols=TLSv1.2

# Assinatura XML/HSM
HSM_HOSTNAME=teste
HSM_USER_ID=testse
HSM_PASSWORD=test
HSM_PRIVATE_KEY_NAME=testes
CERT_ASSINATURA_ISSUER_NAME=teste
CERT_ASSINATURA_SERIAL_NUMBER=testes

MED_KEYSTORE_PATH=/deployments/simpi-des-keystore-092025.jks
MED_KEYSTORE_PASSWORD='${SIMPI_KSPIX_01}'
MED_TRUSTSTORE_PATH=src/main/resources/keystore-local.jks
MED_TRUSTSTORE_PASSWORD=teste

## Outras configuracoes
database.checkconnection.query=select 1 from dual
ISPB_CAIXA=00360305

simpi.med.http.socket-timeout-sso=5000
simpi.med.http.conn-timeout-sso=3000

# Scheduler: meia-noite todos os dias
simpi.security.public-key.cron=0 0 0 * * ?


## Silencia logs do Hibernate
quarkus.log.category."org.hibernate".level=OFF
quarkus.log.category."org.hibernate.orm.boot".level=OFF
quarkus.log.category."org.hibernate.orm".level=OFF
