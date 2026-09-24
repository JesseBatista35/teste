################################################################################
# SIRTA - Configurações da aplicação (Quarkus)
################################################################################

# Dev Services: desligado por padrão, ligado apenas em dev local
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
# HTTP / CORS
################################################################################
quarkus.http.port=8081
quarkus.http.cors.enabled=true
quarkus.http.cors.origins=${CORS_ORIGINS:https://sirta.des.caixa}
quarkus.http.cors.headers=origin,accept,authorization,content-type,x-requested-with
quarkus.http.cors.methods=GET,PUT,POST,DELETE
quarkus.http.cors.access-control-allow-credentials=false
%dev.quarkus.http.cors.origins=http://localhost:4200

################################################################################
# TLS - usar truststore com a CA corporativa (sem trust-all fora de dev)
################################################################################
#quarkus.tls.trust-store.pem.certs=/deployments/certs/ca-caixa.pem
%dev.quarkus.tls.trust-all=true

################################################################################
# OIDC / KEYCLOAK
################################################################################
quarkus.oidc.auth-server-url=${QUARKUS_OIDC_AUTH_SERVER_URL}
quarkus.oidc.client-id=${QUARKUS_OIDC_CLIENT_ID}
quarkus.oidc.application-type=service
quarkus.oidc.roles.source=accesstoken

################################################################################
# PERFIL TEST (H2 em memória, sem dependência de Keycloak/rede)
################################################################################
%test.quarkus.datasource.db-kind=h2
%test.quarkus.datasource.jdbc.url=jdbc:h2:mem:RTA;DB_CLOSE_DELAY=-1;INIT=CREATE SCHEMA IF NOT EXISTS RTAGTT
%test.quarkus.datasource.username=sa
%test.quarkus.datasource.password=
%test.quarkus.hibernate-orm.schema-management.strategy=drop-and-create
%test.quarkus.oidc.enabled=false
#%test.quarkus.hibernate-orm.log.sql=true

# Perfil H2 herda do TEST
%h2.quarkus.config.profile.parent=test
