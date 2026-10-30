src/main/resources/application.yaml

spring:
  jackson:
    deserialization:
      fail-on-unknown-properties: true
  application:
    name: SIAVL-gestaomodelonota-backend
  version: 1.0.0
  datasource:
    url: ${SPRING_DATASOURCE_URL}
    username: ${SPRING_DATASOURCE_USERNAME}
    password: ${SPRING_DATASOURCE_PASSWORD}
    driver-class-name: oracle.jdbc.OracleDriver
  jpa:
    database-platform: org.hibernate.dialect.OracleDialect
    hibernate:
      ddl-auto: validate
      naming.physical-strategy: org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl
      naming.implicit-strategy: org.hibernate.boot.model.naming.ImplicitNamingStrategyLegacyJpaImpl
    properties:
      hibernate:
        globally_quoted_identifiers: true
        format_sql: true
        hbm2ddl:
          auto: none
        jdbc:
          time_zone: America/Sao_Paulo

management:
  endpoints:
    web:
      exposure:
        include: health,info,metrics
  health:
    livenessstate:
      enabled: true
    readinessstate:
      enabled: true
  endpoint:
    health:
      show-details: when_authorized
      probes:
        enabled: true

env:
  apimanager:
    url: ${APIMANAGER_URL}
    key: ${APIMANAGER_KEY}
    connect-timeout-ms: ${APIMANAGER_CONNECT_TIMEOUT_MS:5000}
    read-timeout-ms: ${APIMANAGER_READ_TIMEOUT_MS:15000}
  certificadodigital:
    validar: ${CERT_REQUIRED}

api:
  caixa:
    issuers: ${SSO_ISSUER}
    cors:
      allowed-origins: ${CORS_ALLOWED_ORIGINS:http://localhost:3002,https://siavl-gestaomodelonota-backend-des.apps.nprd.caixa}

server:
  servlet:
    encoding:
      charset: UTF-8
      enabled: true
      force: true

logging:
  pattern:
    level: "%5p [correlationId=%X{correlationId:-}]"
