#DATASOURCE
quarkus.datasource.db-kind=oracle
quarkus.datasource.jdbc.driver=oracle.jdbc.OracleDriver
quarkus.datasource.metrics.enabled=true
quarkus.hibernate-orm.log.sql=false
quarkus.hibernate-orm.log.bind-parameters=false

#HIBERNATE
quarkus.hibernate-orm.database.default-schema=INP
quarkus.hibernate-orm.dialect=org.hibernate.dialect.Oracle12cDialect

#QUARKUS PATH
quarkus.http.non-application-root-path=/q

#QUARKUS RESOURCES
org.eclipse.microprofile.rest.client.propagateHeaders=Authorization,apikey
br.gov.caixa.inp.restclient.ParticipantsRestClient/mp-rest/uri=${OPEN_BANKING_BRASIL_URI_PARTICIPANTS}

quarkus.tls.trust-all=true

quarkus.http.encoding.enabled=true
quarkus.http.encoding.charset=UTF-8
quarkus.http.encoding.force=true

# CAIXA APIM
caixa-api-manager.url=${CAIXA_SIINP_APIM_URL}
caixa-siinp-apim.api-key=${CAIXA_SIINP_APIM_APIKEY}
caixa-siinp-apim.client-id=${CAIXA_SSO_INTRANET_CLIENT_ID}
caixa-siinp-apim.client-secret=${CAIXA_SSO_INTRANET_CLIENT_SECRET}

# PIX DICT API REST CLIENT
caixa-api-pix-dict.path=${CAIXA_PIXAPI_DICT_PATH}

#QUARKUS INDEX PAGE
quarkus.index-page.enabled=false

# HYBRID PCM
pcm.lista-convenios-skip-sweeping=${LISTA_CONVENIOS_SKIP_SWEEPING:}


# REDIS LOCAL
%dev.quarkus.redis.devservices.enabled=false
%dev.quarkus.redis.hosts=redis://localhost:52708


# SSO INTER 2
caixa.mp.jwt.verify.ssointer2.publicKey=${CAIXA_MP_JWT_VERIFY_SSOINTER2_PUBLICKEY:xxxxx}
caixa.mp.jwt.verify.ssointer2.issuer=${CAIXA_MP_JWT_VERIFY_SSOINTER2_ISSUER:xxxxx}
