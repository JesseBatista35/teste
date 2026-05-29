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
quarkus.log.level=${QUARKUS_LOG_LEVEL}
quarkus.log.category."org.hibernate".level=ERROR
quarkus.log.category."org.hibernate.SQL".min-level=ERROR
quarkus.log.category."org.jboss.res-teasy".level=ERROR
quarkus.log.category."com.arjuna.ats.jta".level=ERROR
quarkus.log.category."io.agroal.narayana".level=ERROR

# SmallRye Config - Ler secrets dos arquivos do BeyondTrust
smallrye.config.source.file.locations=${SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS}

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
db2.siico.username=${DATASOURCE_DB2_USERNAME}
db2.siico.password=${DATASOURCE_DB2_PASSWORD}
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
quarkus.datasource.username=${DATASOURCE_ORACLE_USERNAME}
quarkus.datasource.password=${DATASOURCE_ORACLE_PASSWORD}
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
quarkus.mailer.from=${MAILER_FROM}
quarkus.mailer.host=${MAILER_HOST}
quarkus.mailer.port=${MAILER_PORT}
quarkus.mailer.ssl=false
destinatarios.email=${MAILER_DESTINATARIOS}
