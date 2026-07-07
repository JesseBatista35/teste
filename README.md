# TESTES
quarkus.http.test-port=8083
token.realms=https://logindes.caixa.gov.br/auth/realms/internet,https://login.des.caixa/auth/realms/intranetSSO_AUTH_SERVER_URLS
quarkus.datasource.db-kind=h2
quarkus.datasource.username=sa
quarkus.datasource.password=sa
quarkus.datasource.jdbc.url=jdbc:h2:mem:test;MODE=Oracle
quarkus.hibernate-orm.database.generation.create-schemas=true
quarkus.hibernate-orm.database.generation=update

quarkus.keycloak.devservices.enabled=false
quarkus.oidc.enabled=false

sso.auth.domain=localhost
