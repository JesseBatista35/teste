#CONFIG BASE
quarkus.log.level=${LOGS_LEVEL:DEBUG}
quarkus.jackson.timezone=America/Sao_Paulo
quarkus.smallrye-openapi.open-api-version=3.0.3
quarkus.http.cors.origins=*
quarkus.http.cors.enabled=true

quarkus.datasource.db-kind=oracle
#quarkus.datasource.jdbc.url=${DB_URL:jdbc:oracle:thin:@cnpexdadvm01-scan8.extra.caixa.gov.br:1521/ORAD05BC}
quarkus.datasource.jdbc.url=${DB_URL:jdbc:oracle:thin:@cnpexdadvm01-scan11.extra.caixa.gov.br:1521/ORAT07BC}
quarkus.datasource.username=${DB_USER}
quarkus.datasource.password=${DB_PASS}
quarkus.datasource.jdbc.driver=oracle.jdbc.driver.OracleDriver
quarkus.datasource.jdbc.acquisition-timeout=20
quarkus.hibernate-orm.database.generation=none
quarkus.datasource.jdbc.new-connection-sql=ALTER SESSION SET CURRENT_SCHEMA=GFA
quarkus.hibernate-orm.log.sql=${SQL_LOGAR:true}
quarkus.hibernate-orm.log.format-sql=${SQL_FORMATAR:true}


quarkus.oidc.auth-server-url=https://login.des.caixa/auth/realms/intranet
quarkus.oidc.roles.role-claim-path=realm_access/roles
quarkus.oidc.token.allow-jwt-introspection=false
quarkus.oidc.token.allow-opaque-token-introspection=false


#caixa.security.canais=false
DESLIGAR_REGISTRO_TRANSACAO=false
caixa.sigfa.autorizacao.canais-liberados=cli-ser-gfa,cli-web-gfa


