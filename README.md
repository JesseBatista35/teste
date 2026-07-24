#path
quarkus.http.root-path=/cartoes/cartao-credito/digital-pay/provisionamento/visa
quarkus.http.non-application-root-path=/q
quarkus.smallrye-health.liveness-path=live
quarkus.default-locale=pt_BR

#datasource
# quarkus.datasource.db-kind= db2
# quarkus.datasource.jdbc.url = ${DATASOURCE_URL}
# quarkus.datasource.jdbc.driver = com.ibm.db2.jcc.DB2Driver
# quarkus.datasource.username = ${DATASOURCE_USERNAME}
# quarkus.datasource.password = ${DATASOURCE_PASSWORD}
# quarkus.datasource.jdbc.max-size = ${DATASOURCE_MAX_SIZE}
# quarkus.datasource.jdbc.initial-size = ${DATASOURCE_INITIAL_SIZE}
# quarkus.datasource.jdbc.min-size = ${DATASOURCE_MIN_SIZE}
# quarkus.datasource.metrics.enabled=true
# quarkus.datasource.jdbc.enable-metrics=true

#hibernate
quarkus.hibernate-orm.dialect=br.gov.caixa.sipcs.repository.dialect.NativeDB2Dialect
quarkus.hibernate-orm.validate-in-dev-mode=false
#quarkus.hibernate-orm.log.sql=true
quarkus.hibernate-orm.jdbc.timezone=-03:00

#antif-fraude
# quarkus.rest-client.antifraude-api.url=${SIPCS_MS_ANTI_FRAUDE_URL:https://sipcs-anti-fraude-des.apps.nprd.caixa/cartoes/cartao-credito/anti-fraude}
# #quarkus.rest-client.antifraude-api.url=${SIPCS_MS_ANTI_FRAUDE_URL:https://api.des.caixa:8443/cartoes/cartao-credito/anti-fraude}
# quarkus.rest-client.antifraude-api.scope=jakarta.inject.Singleton
# org.eclipse.microprofile.rest.client.propagateHeaders=Authorization
# config-sipcs-caixa.api-apikey=${SIPCS_MS_ANTI_FRAUDE_APIKEY:l77aa8c65ec6e1437bbc562961d6f96b01}

#ssl e tls
quarkus.ssl.native=true
quarkus.tls.trust-all=true

#log
#quarkus.rest-client.logging.scope=request-response
#quarkus.rest-client.logging.body-limit=5000
#quarkus.log.category."org.jboss.resteasy.reactive.client.logging".level=DEBUG
#quarkus.log.category."org.apache.http".level=DEBUG

# LIBs indexadas para carregamento de dependencias
quarkus.index-dependency.sipcs-base.group-id=br.gov.caixa
quarkus.index-dependency.sipcs-base.artifact-id=sipcs-base

############ Log ####################
#quarkus.log.level=ALL
caixa.sipcs.log.filter.entity.hidden=${LOG_FILTER_ENTITY_HIDDEN:false}
quarkus.log.category."br.gov.caixa.sipcs.filter.log".level=${LOG_FILTER_CATEGORY_LEVEL:INFO}

####### SSO Internet ##############
caixa.mp.jwt.verify.ssointer.publicKey=${SSO_INTERNET_PUBLICKEY:MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxz8PNmiUW5J1669pWY0APB4flqqDnghAv/QV5DIHyXE39fj9u1DPXbgfDUhUfK0i/B0CHJukbI44Rgo/vuhCMImTnLjS49XuTH6GI4lU/CtdzE/qACMO/GUky73m0Uszo2Bh1wNV+fvw/mMQVAGKj6/qXjSB9npRZKydoXnwGPIepcrqF6KkMJIFtZ+0w35J9SYwgLNezUbAJgs9dq3yMj4ussSfxMFcUC9UKziJJSg0UQfl0fOQGMsrsnUbS2GgXeDqdskbZq9/wfL0ikU2pWf0hKjX+PXtqZI0SVWurVyydc0efbTE7qIlrwF8lWZ8NZ8zcV2oVk7TjoIktZ4zBwIDAQAB}
caixa.mp.jwt.verify.ssointer.issuer=${SSO_INTERNET_ISSUER:https://logindes.caixa.gov.br/auth/realms/internet}

######### SSO Intranet ###############
caixa.mp.jwt.verify.ssointra.publicKey=${SSO_INTRANET_PUBLICKEY:MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzcYY/UbvrEldbQRd4TgLeP9bS8YnaL67MZUsfozWRyocBF3S0L7UEbkPaPoCoBnhoRv8VJHp0grqe3mqEmkMuDlt20Vx6q04ADDyS0c8xaU+Ot+g1Pgwjze944ATUjZogEMko6jvqqUGTt/Nt64yCCIaMaTB119vOBExQim7vPHNe/o7hLxh6VBYINxFA/esxjz8j28/uJWIiK0Gvt07Yx7ycn2DJlQHjnH2GzCSUL87AAYmjyYxW2JZaPLLvRlpcHIWrlr9GNtLiq0++xfJ0jFYxQWs1jxhlfXdqr8NE5vfA/RRRjRFnWzFOhIsOnIHPO9eEwwYzCZSoW2zXkFDYwIDAQAB}
caixa.mp.jwt.verify.ssointra.issuer=${SSO_INTRANET_ISSUER:https://login.des.caixa/auth/realms/intranet}

#Testes
quarkus.http.test-port=8888
quarkus.test.continuous-testing=enabled

#Swagger-ui
quarkus.swagger-ui.always-include=true

#auditoria
config.sipcs.rest-habilita-auditoria=${HABILITA_AUDITORIA:true}
quarkus.rest-client.auditoria-api.url=${URL_AUDITORIA_PRODUZ:https://sipcs-auditoria-produz-des.apps.nprd.caixa/cartoes/cartao-credito/auditoria/produz}


#APIs VISA
api.vts.basepath=https://apim-parceiros-sandbox.azure-api.net/cartoes/cartao-credito/visa-vts/vtis/
quarkus.rest-client.\"api.vts.tokeninquiry\".url=${SIPCS_MS_VISA_TOKEN_INQUIRY_URL:https://apim-parceiros-sandbox.azure-api.net/cartoes/cartao-credito/visa-vts/vtis/v1/tokenRequestors/}
