rodamos em TQS e passou, porem TQS, não tem beyundtrust e nao tem o apllicationinsinghts.


SISGF-backend-tqs
Description


Variables
_ENV.DB2_SIICO_SCHEMA
DESICO
_ENV.DB2_SIICO_URL
jdbc:db2://10.216.80.110:448/RJKDB2DSD0
_ENV.DB2_SIICO_USERNAME
ssgfrd01
_ENV.EMAIL_DESTINATARIOS
"jose.ibiapina@caixa.gov.br;daniel.e.araujo@caixa.gov.br"
_ENV.EMAIL_FROM
sisgf.teste@caixa.gov.br
_ENV.EMAIL_SMTP_PORT
25
_ENV.EMAIL_SMTP_URL
smtptest.correiolivre.caixa
_ENV.HORA_LIMITE_CONTABILIZACAO
18
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks"
_ENV.QUARKUS_DATASOURCE_DB_KIND
other
_ENV.QUARKUS_DATASOURCE_JDBC_DRIVER
oracle.jdbc.driver.OracleDriver
_ENV.QUARKUS_DATASOURCE_JDBC_MAX_SIZE
40
_ENV.QUARKUS_DATASOURCE_JDBC_URL
jdbc:oracle:thin:@cnpexdadvm01-scan2.extra.caixa.gov.br:1521/orat01sc
_ENV.QUARKUS_DATASOURCE_USERNAME
SSGFRT01
_ENV.QUARKUS_HIBERNATE_ORB_DIALECT
org.hibernate.dialect.Oracle10gDialect
_ENV.QUARKUS_HIBERNATE_ORM_LOG_BIND_PARAMETERS
true
_ENV.QUARKUS_HIBERNATE_ORM_LOG_SQL
true
_ENV.QUARKUS_HIBERNATE_ORM_PACKAGES
br.gov.caixa.sisgf.api.domain.model
_ENV.QUARKUS_HIBERNATE-ORM_DATABASE_DEFAULT_SCHEMA
SGF
_ENV.QUARKUS_LOG_LEVEL
INFO
_ENV.QUARKUS_OIDC_AUTH_SERVER_URL
"https://login.des.caixa/auth/realms/intranet"
_ENV.SIICO_API_PRIVADA_URL
https://api.des.caixa:8443/informacoes-corporativas-privadas/
_ENV.SIICO_API_PUBLICA_URL
https://api.des.caixa:8443/informacoes-corporativas-publicas/
_ENV.SINAF_API_EVENTO_URL
https://api.des.caixa:8443/sinaf-api-evento/
_ENV.SISGF_API_URL
https://sisgf-api-tqs.apps.nprd.caixa/financeiro-beneficios/faturamento/
_ENV.SISGF.BACKEND.ENVIO.EMAIL.URL
http://sisgf-backend-des-esteiras.sisgf-des.svc:8080/api/envioEmail/
_SECRET.API_KEY
#{SENHA_API_KEY}#
_SECRET.DB2_SIICO_PASSWORD
#{SENHA_DB2_SIICO}#
_SECRET.QUARKUS_DATASOURCE_PASSWORD
#{PASS_ORACLE}#
_SECRET.QUARKUS_HTTP_SSL_CERTIFICATE_KEY-STORE-PASSWORD
#{JKS_PASS}#
_SECRET.QUARKUS_OIDC_CREDENTIALS_SECRET
#{SECRET_SSO}#
JKS_PASS
changeit
PASS_ORACLE
********
SECRET_SSO
********
SENHA_API_KEY
********
SENHA_DB2_SIICO
********


Log do pod tqs:  
sisgf-backend-tqs-112-z4kd7
Running

exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
__ ____ __ _____ ___ __ ____ ______
--/ __ \/ / / / _ | / _ \/ //_/ / / / __/
-/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/
2026-05-28 09:47:27,496 INFO [io.agr.pool] (JPA Startup Thread: <default>) Datasource 'siico': Initial size smaller than min. Connections will be created when necessary




em des as vairaives estão assim:


_ENV.APPLICATIONINSIGHTS_CONNECTION_STRING
"InstrumentationKey=99ee6c02-0bc8-4c2e-8109-b744a54e07ae;IngestionEndpoint=https://brazilsouth-1.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsouth.livediagnostics.monitor.azure.com/"
_ENV.APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
INFO
_ENV.APPLICATIONINSIGHTS_ROLE_NAME
SISGF-backend-DES
_ENV.APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
3
_ENV.APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL
INFO
_ENV.CORS_ORIGINS
"https://sisgf-frontend-des.apps.nprd.caixa, https://sisgf-frontend-tqs.apps.nprd.caixa, https://sisgf.caixa/, http://localhost:4200"
_ENV.DB2_SIICO_SCHEMA
DESICO
_ENV.DB2_SIICO_URL
"jdbc:db2://10.216.80.110:448/RJKDB2DSD0"
_ENV.DB2_SIICO_USERNAME
"ssgfrd01"
_ENV.EMAIL_DESTINATARIOS
"jose.ibiapina@caixa.gov.br;daniel.e.araujo@caixa.gov.br"
_ENV.EMAIL_FROM
"sisgf.teste@caixa.gov.br"
_ENV.EMAIL_SMTP_PORT
25
_ENV.EMAIL_SMTP_URL
"smtptest.correiolivre.caixa"
_ENV.HORA_LIMITE_CONTABILIZACAO
18
_ENV.HTTPS_PROXY
http://proxydes.caixa:80
_ENV.NO_PROXY
"*.caixa,*.caixa.gov.br"
_ENV.QUARKUS_DATASOURCE_DB_KIND
"other"
_ENV.QUARKUS_DATASOURCE_JDBC_DRIVER
"oracle.jdbc.driver.OracleDriver"
_ENV.QUARKUS_DATASOURCE_JDBC_MAX_SIZE
"40"
_ENV.QUARKUS_DATASOURCE_JDBC_URL
"jdbc:oracle:thin:@10.116.101.7:1521/orad01sc"
_ENV.QUARKUS_DATASOURCE_USERNAME
"SSGFRD01"
_ENV.QUARKUS_HIBERNATE_ORB_DIALECT
"org.hibernate.dialect.Oracle10gDialect"
_ENV.QUARKUS_HIBERNATE_ORM_LOG_BIND_PARAMETERS
"false"
_ENV.QUARKUS_HIBERNATE_ORM_LOG_SQL
"false"
_ENV.QUARKUS_HIBERNATE_ORM_PACKAGES
"br.gov.caixa.sisgf.api.domain.model"
_ENV.QUARKUS_HIBERNATE-ORM_DATABASE_DEFAULT_SCHEMA
"SGF"
_ENV.QUARKUS_LOG_LEVEL
"INFO"
_ENV.QUARKUS_OIDC_AUTH_SERVER_URL
https://login.des.caixa/auth/realms/intranet
_ENV.SFTP_CLIENT_USER
ssgfdr01
_ENV.SFTP_PATH_DIR_LIST
"/SINAF,/SIPAS,/sipas"
_ENV.SFTP_PATH_ENTRADA
/sistemas/sisgf/arquivos/entrada/relatorios
_ENV.SFTP_SERVER_IP
10.116.89.226
_ENV.SFTP_SERVER_PORT
22
_ENV.SIICO_API_PRIVADA_URL
https://api.des.caixa:8443/informacoes-corporativas-privadas/
_ENV.SIICO_API_PUBLICA_URL
https://api.des.caixa:8443/informacoes-corporativas-publicas/
_ENV.SINAF_API_EVENTO_URL
https://api.des.caixa:8443/sinaf-api-evento/
_ENV.SISGF_API_URL
https://sisgf-api-des.apps.nprd.caixa/financeiro-beneficios/faturamento/
_ENV.SISGF_BATCH_UNIDADES_URL
https://sisgf-batch-des.apps.nprd.caixa
_SECRET.API_KEY
'${SISGF_APIKEY}'
_SECRET.DB2_SIICO_PASSWORD
'${SSGFRD01_DB2}'
_SECRET.QUARKUS_DATASOURCE_PASSWORD
'${SSGFRD02_ORA}'
_SECRET.QUARKUS_HTTP_SSL_CERTIFICATE_KEY-STORE-PASSWORD
#{JKS_PASS}#
_SECRET.QUARKUS_OIDC_CREDENTIALS_SECRET
'${CLISERSGF_SSO_INTRA}'
_SECRET.SFTP_CLIENT_SECRET
'${SSGFDR01_SFTP}'
_SECRET.SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS
#{VAULT_LOCATION}#
JKS_PASS
changeit
VAULT_LOCATION
/usr/src/app/secrets_files/SISGF_DES/
