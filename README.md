APLICATION.PRPERTIES

# Quarkus port
quarkus.http.port=8080
quarkus.vertx.cluster.port=7268

# CORS
quarkus.http.cors=true
quarkus.http.cors.headers=Origin, X-Request-Width, Content-Type, Accept, Authorization, Accept-Encoding, Accept-Language, authCode, Connection, Host, Referer, Sec-Fetch-Dest, Sec-Fetch-Mode, Sec-Fetch-Site, User-Agent, Access-Control-Allow-Origin
quarkus.http.cors.origins=${CORS_ORIGINS}
quarkus.http.cors.methods=GET, POST, OPTIONS, PUT, DELETE
quarkus.http.cors.access-control-max-age=1209600

# Swagger
quarkus.smallrye-openapi.path=/swagger
quarkus.swagger-ui.always-include=true

# JWT Configuration
quarkus.smallrye-jwt.enabled=false

# Token duration (7 days in seconds)
jwt.expiration=604800

# OIDC Configuration
#https://quarkus.io/guides/security-authorization
#https://quarkus.io/guides/security-openid-connect
quarkus.oidc.auth-server-url=https://login.des.caixa/auth/realms/intranet
quarkus.oidc.client-id=cli-ser-sgf
quarkus.oidc.credentials.secret=6e580ccf-f80e-4314-84eb-bffe070c05c4
quarkus.oidc.application-type=service
quarkus.oidc.roles.source=accesstoken
quarkus.oidc.token.auto-refresh-interval=18000

# HTTP Configuration
quarkus.http.auth.permission.authenticated.paths=/*
quarkus.http.auth.permission.authenticated.policy=authenticated
quarkus.http.auth.permission.health.paths=/q/*
quarkus.http.auth.permission.health.policy=permit
quarkus.http.auth.permission.health.methods=GET

# HTTP UTF-8
quarkus.http.encoding.default-charset=utf-8
quarkus.http.encoding.force=true

# OIDC Client
quarkus.oidc-client.auth-server-url=${quarkus.oidc.auth-server-url}
quarkus.oidc-client.client-id=${quarkus.oidc.client-id}
quarkus.oidc-client.credentials.secret=${quarkus.oidc.credentials.secret}
quarkus.oidc-client.token-path=/protocol/openid-connect/tokens

# Log Configuration for Debugging Transactions
quarkus.log.category."io.quarkus".level=ERROR
quarkus.log.level=ERROR
quarkus.log.category."org.hibernate".level=ERROR
quarkus.log.category."org.hibernate.SQL".min-level=ERROR
quarkus.log.category."org.jboss.res-teasy".level=ERROR
quarkus.log.category."com.arjuna.ats.jta".level=ERROR
quarkus.log.category."io.agroal.narayana".level=ERROR

# REST Client Configuration
api.key=${API_KEY}

siico.api.publica.url=https://api.des.caixa:8443/informacoes-corporativas-publicas/
br.gov.caixa.sisgf.api.restclient.informacoescorporativaspublica.InformacoesCorporativaPublicaService/mp-rest/url=${siico.api.publica.url}
br.gov.caixa.sisgf.api.restclient.informacoescorporativaspublica.InformacoesCorporativaPublicaService/mp-rest/scope=jakarta.inject.Singleton

siico.api.privada.url=https://api.des.caixa:8443/informacoes-corporativas-privadas/
br.gov.caixa.sisgf.api.restclient.informacoescorporativasprivada.InformacoesCorporativaPrivadaService/mp-rest/url=${siico.api.privada.url}
br.gov.caixa.sisgf.api.restclient.informacoescorporativasprivada.InformacoesCorporativaPrivadaService/mp-rest/scope=jakarta.inject.Singleton

sinaf.api.evento.url=https://api.des.caixa:8443/sinaf-api-evento
br.gov.caixa.sisgf.api.restclient.sinafapievento.SinafApiEventoService/mp-rest/url=${sinaf.api.evento.url}
br.gov.caixa.sisgf.api.restclient.sinafapievento.SinafApiEventoService/mp-rest/scope=jakarta.inject.Singleton

sisgf.api.url=http://localhost:8060/financeiro-beneficios/faturamento/
br.gov.caixa.sisgf.api.restclient.sisgf.sisgfapi.SISGFApi/mp-rest/url=${sisgf.api.url}
br.gov.caixa.sisgf.api.restclient.sisgf.sisgfapi.SISGFApi/mp-rest/scope=jakarta.inject.Singleton

sisgf.batch.url=http://localhost:8070/financeiro-beneficios/faturamento/
br.gov.caixa.sisgf.api.restclient.sisgf.sisgfbatch.SISGFBatch/mp-rest/url=${sisgf.batch.url}
br.gov.caixa.sisgf.api.restclient.sisgf.sisgfbatch.SISGFBatch/mp-rest/scope=jakarta.inject.Singleton

sisgf.batch.unidades.url=http://localhost:8050
br.gov.caixa.sisgf.api.restclient.sisgf.sisgfbatchunidade.SISGFBatchUnidades/mp-rest/url=${sisgf.batch.unidades.url}
br.gov.caixa.sisgf.api.restclient.sisgf.sisgfbatchunidade.SISGFBatchUnidades/mp-rest/scope=jakarta.inject.Singleton

# Database Configuration for SIICO
db2.siico.url=jdbc:db2://10.216.80.110:448/RJKDB2DSD0
db2.siico.username=Teste1
db2.siico.password=Teste2
db2.siico.schema=ICO

# Narayana Transaction Manager Configuration
quarkus.transaction-manager.enable-recovery=true
quarkus.transaction-manager.recovery-interval=600
quarkus.transaction-manager.default-timeout=600

# Hibernate XA
quarkus.hibernate-orm.transaction.jta-data-source=java:/jdbc/siico
quarkus.hibernate-orm.transaction.coordinator-strategy=jdbc

# Database Configuration for SIGF (Oracle)
quarkus.datasource.db-kind=oracle
quarkus.datasource.jdbc.driver=oracle.jdbc.driver.OracleDriver
quarkus.datasource.db-version=12.2.0
quarkus.datasource.jdbc.url=jdbc:oracle:thin:@10.116.101.7:1521/ORAD01SC
quarkus.datasource.username=Teste1
quarkus.datasource.password=Teste2
quarkus.datasource.xa=true
quarkus.datasource.jdbc.max-size=40
quarkus.datasource.jdbc.xa-datasource-class=oracle.jdbc.xa.client.OracleXADataSource

# Persistence Configuration for SIGF
quarkus.hibernate-orm.dialect=org.hibernate.dialect.OracleDialect
quarkus.hibernate-orm.packages=br.gov.caixa.sisgf.api.domain.model
quarkus.hibernate-orm.log.bind-parameters=true
quarkus.hibernate-orm.log.sql=true
quarkus.hibernate-orm.database.default-schema=SGF
quarkus.hibernate-orm.validate-in-dev-mode=false

# Database Configuration for SIICO (DB2)
quarkus.datasource."siico".db-kind=db2
quarkus.datasource."siico".jdbc.driver=com.ibm.db2.jcc.DB2Driver
quarkus.datasource."siico".jdbc.url=${db2.siico.url}
quarkus.datasource."siico".username=${db2.siico.username}
quarkus.datasource."siico".password=${db2.siico.password}
quarkus.datasource."siico".jdbc.max-size=20
quarkus.datasource."siico".jdbc.min-size=5
quarkus.datasource."siico".xa=true
quarkus.datasource."siico".jdbc.xa-datasource-class=com.ibm.db2.jcc.DB2XADataSource

# Persistence Configuration for SIICO
quarkus.hibernate-orm."siico".dialect=br.gov.caixa.sisgf.api.utils.DB2ZOSDialect
quarkus.hibernate-orm."siico".packages=br.gov.caixa.siico.api.domain.model
quarkus.hibernate-orm."siico".log.bind-parameters=true
quarkus.hibernate-orm."siico".log.sql=true
quarkus.hibernate-orm."siico".database.default-schema=${db2.siico.schema}
quarkus.hibernate-orm."siico".datasource=siico
quarkus.hibernate-orm."siico".validate-in-dev-mode=false

# Configuracao envio de email
quarkus.mailer.auth-methods=mailerDIGEST-MD5 CRAM-SHA256 CRAM-SHA1 CRAM-MD5
quarkus.mailer.from=${email.from}
quarkus.mailer.host=${email.smtp.url}
quarkus.mailer.port=${email.smtp.port}
quarkus.mailer.ssl=false
destinatarios.email=${email.destinatarios}



E AS VAIRVES ESTAO ASSIM:


SIFUG-siofg-api-des (41)
Scopes: EC DES
VAULT_LOCATION
/usr/src/app/secrets_files/SIOFG_DES/
_ENV.AMBIENTE
des
_ENV.APPLICATIONINSIGHTS_CONFIGURATION_CONTENT
'{"sampling":{"overrides":[{"telemetryType":"request","attributes":[{"key":"url.path","value":"^(\/q)?\/health\/.*","matchType":"regexp"}],"percentage":0}]}}'
_ENV.APPLICATIONINSIGHTS_CONNECTION_STRING
"InstrumentationKey=8148a712-eee7-4c41-95ef-5153b19d0497;IngestionEndpoint=https://southcentralus-3.in.applicationinsights.azure.com/;LiveEndpoint=https://southcentralus.livediagnostics.monitor.azure.com/"
_ENV.APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
INFO
_ENV.APPLICATIONINSIGHTS_PROXY
http://proxydes.caixa:80
_ENV.APPLICATIONINSIGHTS_ROLE_NAME
SIFUG-siofg-api-DES
_ENV.APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
100
_ENV.APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL
INFO
_ENV.DATASOURCE_CONSULTAPEF_JDBC_URL
"jdbc:idms://10.216.80.110:3922/DSQLSFG"
_ENV.DATASOURCE_CONSULTAPEF_USERNAME
SFUGDR02
_ENV.DATASOURCE_CONSULTA_JDBC_URL
"jdbc:idms://10.216.80.110:3922/DSQLSFG"
_ENV.DATASOURCE_CONSULTA_USERNAME
SFUGDR02
_ENV.DATASOURCE_DB2_JDBC_URL
"jdbc:db2://10.216.80.110:448/RJKDB2DSD0"
_ENV.DATASOURCE_DB2_USERNAME
SFUGDR15
_ENV.DATASOURCE_MQ_CHANNEL
SIOFG.SVRCONN
_ENV.DATASOURCE_MQ_HOST
10.216.80.110
_ENV.DATASOURCE_MQ_PORT
1414
_ENV.DATASOURCE_MQ_QMGR
RJDA
_ENV.DATASOURCE_MQ_USERNAME
SFUGDR15
_ENV.HTTPS_PROXY
http://proxydes.caixa:80
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.3.1.jar"
_ENV.KEY_CODIGO_IDMS_DIALOGO
515
_ENV.KEY_IDMS_ALIAS_BASE
PEF
_ENV.KEY_IDMS_SUREG
TA
_ENV.KEY_TOKEN_CAIXA_TEM
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzcYY/UbvrEldbQRd4TgLeP9bS8YnaL67MZUsfozWRyocBF3S0L7UEbkPaPoCoBnhoRv8VJHp0grqe3mqEmkMuDlt20Vx6q04ADDyS0c8xaU+Ot+g1Pgwjze944ATUjZogEMko6jvqqUGTt/Nt64yCCIaMaTB119vOBExQim7vPHNe/o7hLxh6VBYINxFA/esxjz8j28/uJWIiK0Gvt07Yx7ycn2DJlQHjnH2GzCSUL87AAYmjyYxW2JZaPLLvRlpcHIWrlr9GNtLiq0++xfJ0jFYxQWs1jxhlfXdqr8NE5vfA/RRRjRFnWzFOhIsOnIHPO9eEwwYzCZSoW2zXkFDYwIDAQAB
_ENV.KEY_TOKEN_INTERNET
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxz8PNmiUW5J1669pWY0APB4flqqDnghAv/QV5DIHyXE39fj9u1DPXbgfDUhUfK0i/B0CHJukbI44Rgo/vuhCMImTnLjS49XuTH6GI4lU/CtdzE/qACMO/GUky73m0Uszo2Bh1wNV+fvw/mMQVAGKj6/qXjSB9npRZKydoXnwGPIepcrqF6KkMJIFtZ+0w35J9SYwgLNezUbAJgs9dq3yMj4ussSfxMFcUC9UKziJJSg0UQfl0fOQGMsrsnUbS2GgXeDqdskbZq9/wfL0ikU2pWf0hKjX+PXtqZI0SVWurVyydc0efbTE7qIlrwF8lWZ8NZ8zcV2oVk7TjoIktZ4zBwIDAQAB
_ENV.KEY_TOKEN_INTRANET
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzcYY/UbvrEldbQRd4TgLeP9bS8YnaL67MZUsfozWRyocBF3S0L7UEbkPaPoCoBnhoRv8VJHp0grqe3mqEmkMuDlt20Vx6q04ADDyS0c8xaU+Ot+g1Pgwjze944ATUjZogEMko6jvqqUGTt/Nt64yCCIaMaTB119vOBExQim7vPHNe/o7hLxh6VBYINxFA/esxjz8j28/uJWIiK0Gvt07Yx7ycn2DJlQHjnH2GzCSUL87AAYmjyYxW2JZaPLLvRlpcHIWrlr9GNtLiq0++xfJ0jFYxQWs1jxhlfXdqr8NE5vfA/RRRjRFnWzFOhIsOnIHPO9eEwwYzCZSoW2zXkFDYwIDAQAB
_ENV.MQ_CONNECTION_FACTORY_NAME
siofg
_ENV.MQ_DESTINATION_DADOS_CONTRATO
LQ.REQ.SIFUG.LISTA_CONTA_CONTRATO
_ENV.MQ_DESTINATION_LISTA_CONTA
LQ.REQ.SIFUG.LISTA_CONTA
_ENV.MQ_DESTINATION_LISTA_CONTA_EXTRATO
LQ.REQ.SIFUG.LISTA_CONTA_EXTRATO
_ENV.MQ_DESTINATION_LISTA_CONTA_OPTANTE
LQ.REQ.SIFUG.LISTA_CONTA_OPTANTE
_ENV.NO_PROXY
"*.caixa,*.caixa.gov.br,*.applicationinsights.azure.com,*.livediagnostics.monitor.azure.com"
_ENV.QUARKUS_LOG_LEVEL
********
_ENV_LEVEL_LOG_APP
DEBUG
_SECRET.DATASOURCE_CONSULTAPEF_PASSWORD
'${SIFUG_DATASOURCE_02}'
_SECRET.DATASOURCE_CONSULTA_PASSWORD
'${SIFUG_DATASOURCE_02}'
_SECRET.DATASOURCE_DB2_PASSWORD
'${SIFUG_DATASOURCE_02}'
_SECRET.QUARKUS_SIOFG_IBM_MQ_PASSWORD
'${SIFUG_DATASOURCE_15}'
_SECRET.SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS
#{VAULT_LOCATION}#



COMO VOCE SABE SOU DE ESTEIRAS NAO TENHO VALOR NENHUM, PRA COLCOAR AI


