Skip to main content
projetos
/
Caixa
/
Pipelines
/
Library
Search









Library

SISGF-api-des

Variable group
Properties
Variable group name
SISGF-api-des
Description



Variables
_ENV.API_KEY
'${SISGF_APIKEY}'
_ENV.APPLICATIONINSIGHTS_CONNECTION_STRING
"InstrumentationKey=99ee6c02-0bc8-4c2e-8109-b744a54e07ae;IngestionEndpoint=https://brazilsouth-1.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsouth.livediagnostics.monitor.azure.com/"
_ENV.APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
INFO
_ENV.APPLICATIONINSIGHTS_ROLE_NAME
SISGF-api-DES
_ENV.APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
3
_ENV.APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL
INFO
_ENV.HORA_LIMITE_CONTABILIZACAO
18
_ENV.HTTPS_PROXY
http://proxydes.caixa:80
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks  -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.2.7.jar"
_ENV.NO_PROXY
"*.caixa,*.caixa.gov.br"
_ENV.QUARKUS_DATASOURCE_DB_KIND
other
_ENV.QUARKUS_DATASOURCE_JDBC_DRIVER
oracle.jdbc.driver.OracleDriver
_ENV.QUARKUS_DATASOURCE_JDBC_MAX_SIZE
40
_ENV.QUARKUS_DATASOURCE_JDBC_URL
jdbc:oracle:thin:@10.116.101.7:1521/orad01sc
_ENV.QUARKUS_DATASOURCE_PASSWORD
'${SSGFRD02_ORA}'
_ENV.QUARKUS_DATASOURCE_USERNAME
"SSGFRD02"
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
https://login.des.caixa/auth/realms/intranet
_ENV.QUARKUS_OIDC_CREDENTIALS_SECRET
'${CLISERSGF_SSO_INTRA}'
_ENV.SIICO_API_PRIVADA_URL
https://api.des.caixa:8443/informacoes-corporativas-privadas
_ENV.SIICO_API_PUBLICA_URL
"https://api.des.caixa:8443/informacoes-corporativas-publicas/"
_SECRET.QUARKUS_HTTP_SSL_CERTIFICATE_KEY-STORE-PASSWORD
'${JKS_PASS}'
_SECRET.SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS
#{VAULT_LOCATION}#
JKS_PASS
changeit
PASS_ORACLE
********
SECRET_SSO
********
VAULT_LOCATION
/usr/src/app/secrets_files/SISGF_DES/
