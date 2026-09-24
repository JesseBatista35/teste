################################################################################
# SIRTA - Configurações da aplicação (Quarkus)
################################################################################

################################################################################
# GERAL / DEV SERVICES
################################################################################
# Desativa Dev Services em desenvolvimento corporativo
quarkus.devservices.enabled=false
%dev.quarkus.devservices.enabled=true

################################################################################
# DATASOURCE - ORACLE via variáveis de ambiente
################################################################################
quarkus.datasource.db-kind=oracle
quarkus.datasource.jdbc.url=${DATABASE_DATASOURCE_JDBC_URL}
quarkus.datasource.username=${DATABASE_USERNAME}
quarkus.datasource.password=${DATABASE_PASSWORD}

################################################################################
# HIBERNATE ORM
################################################################################
quarkus.hibernate-orm.database.default-schema=RTAGTT
quarkus.hibernate-orm.schema-management.strategy=none

################################################################################
# HTTP / CORS / TLS
################################################################################
quarkus.http.cors.enabled=true
quarkus.http.cors.origins=*
quarkus.http.cors.headers=origin, accept, authorization, content-type, x-requested-with
quarkus.http.cors.access-control-allow-credentials=true
quarkus.http.cors.methods=GET,PUT,POST,DELETE
quarkus.tls.trust-all=true
quarkus.http.port=8081

################################################################################
# PERFIS: TEST (base H2) e H2 (herda de test)
################################################################################
# Perfil de TEST: usa H2 em memória e Flyway padrão RTA
%test.quarkus.datasource.db-kind=h2
%test.quarkus.datasource.jdbc.url=jdbc:h2:mem:RTA;
#%test.quarkus.datasource.jdbc.url=jdbc:h2:file:./data/rta-db;
%test.quarkus.hibernate-orm.dialect=org.hibernate.dialect.H2Dialect
%test.quarkus.hibernate-orm.validate-in-dev-mode=false
%test.quarkus.datasource.username=
%test.quarkus.datasource.password=
#%test.quarkus.flyway.migrate-at-start=true
#%test.quarkus.flyway.default-schema=RTA
%test.quarkus.oidc.auth-server-url=https://login.des.caixa/auth/realms/intranet
%test.quarkus.oidc.client-id=cli-web-rta
#%test.quarkus.hibernate-orm.log.format-sql=true
#%test.quarkus.hibernate-orm.log.sql=true
# Perfil H2 herda do TEST
%h2.quarkus.config.profile.parent=test

################################################################################
# OIDC / KEYCLOAK
################################################################################
quarkus.oidc.auth-server-url=${QUARKUS_OIDC_AUTH_SERVER_URL}
quarkus.oidc.client-id=${QUARKUS_OIDC_CLIENT_ID}
quarkus.oidc.application-type=service
quarkus.oidc.roles.source=accesstoken
