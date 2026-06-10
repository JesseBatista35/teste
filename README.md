# Arquivo de configuração quarkus
# App
quarkus.application.name=SICIM-INTRANET
quarkus.devservices.enabled=false

# HTTP, Configurações de CORS
quarkus.http.root-path=/api
quarkus.http.cors.enabled=true
quarkus.http.cors.origins=${CORS_ALLOWED_ORIGINS}
quarkus.http.cors.methods=GET,POST,PUT,DELETE,OPTIONS
quarkus.http.cors.headers=Origin,X-Requested-With,Accept,Content-Type,Access-Control-Request-Headers,Access-Control-Request-Method,Authorization

# ========================================
# AUTENTICAÇÃO E AUTORIZAÇÃO (ORDEM IMPORTA!)
# ========================================

# 1. Health checks - SEM autenticação (DEVE VIR PRIMEIRO!)
# IMPORTANTE: Incluir /api porque root-path=/api
quarkus.http.auth.permission.health.paths=/api/q/health,/api/q/health/*
quarkus.http.auth.permission.health.policy=permit

# 2. OIDC keycloak - Configuração de autenticação da aplicação
quarkus.oidc.auth-server-url=${SSO_URL}
quarkus.oidc.client-id=cli-web-cim

# 3. Todas as outras rotas - REQUEREM autenticação
quarkus.http.auth.permission.authenticated.paths=/*
quarkus.http.auth.permission.authenticated.policy=authenticated

# ========================================
# CLIENT CREDENTIALS PARA CHAMAR OUTRAS APIS
# ========================================
quarkus.oidc-client.auth-server-url=${SSO_URL}
quarkus.oidc-client.client-id=cli-ser-cim
quarkus.oidc-client.credentials.secret=${SSO_SECRET}
quarkus.oidc-client.grant.type=client
quarkus.oidc-client.scopes=openid

# ========================================
# CONFIGURAÇÃO DATABASE
# ========================================
quarkus.datasource.db-kind=oracle
quarkus.datasource.jdbc.driver=oracle.jdbc.driver.OracleDriver
quarkus.datasource.jdbc.url=${DATASOURCE_URL}
quarkus.datasource.username=${DATASOURCE_USERNAME}
quarkus.datasource.password=${DATASOURCE_PASSWORD}
quarkus.datasource.jdbc.initial-size=1
quarkus.datasource.jdbc.min-size=1
quarkus.datasource.jdbc.max-size=50
quarkus.transaction-manager.default-transaction-timeout=60s

# ========================================
# HIBERNATE
# ========================================
quarkus.hibernate-orm.jdbc.statement-fetch-size=100

# ========================================
# MÉTRICAS E HEALTH
# ========================================
quarkus.datasource.jdbc.acquisition-timeout=10s
quarkus.datasource.jdbc.leak-detection-interval=60S
quarkus.datasource.metrics.enabled=true
quarkus.datasource.jdbc.detect-statement-leaks=true
# Validação interna se os DataSources estão no ar na chamada de Health
quarkus.datasource.health.enabled=true
# Validação agendada para validar o pool a cada 2 minutos
quarkus.datasource.jdbc.validation-query-sql=SELECT 1 FROM DUAL
quarkus.datasource.jdbc.background-validation-interval=2M

# ========================================
# LOG
# ========================================
quarkus.log.console.format=%d{yyyy-MM-dd HH:mm:ss,SSS} %-5p [%C] (%t) %s%e%n
# Rotation do arquivo de log
#quarkus.log.file.rotation.max-file-size=100M
#quarkus.log.file.rotation.max-backup-index=15
# Log requests
quarkus.http.access-log.enabled=true
quarkus.http.access-log.pattern=combined

# ========================================
# REST CLIENT E APIs
# ========================================
# RestClient
app.sicim.api-key=${API_KEY}
# API Manager
quarkus.rest-client.api-manager.url=${APIM_URL}
