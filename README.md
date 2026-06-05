quarkus:
  http:
    cors:
      origins: ${QUARKUS_HTTP_CORS_ORIGINS}
      enabled: false
    limits:
      max-body-size: 1024M
    port: 8080
  oidc:
    devservices:
      enabled: false
    enabled: true
    discovery-enabled: true
    client-id: ${QUARKUS_OIDC_CLIENT-ID}
    auth-server-url: ${QUARKUS_OIDC_AUTH-SERVER-URL}
    tls:
      verification: none
    roles:
      role-claim-path: realm_access/roles
      source: accesstoken
    application-type: service
