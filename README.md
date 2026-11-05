
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=keycloak/secure-deployment=workflow-credito-pj-web.war:read-resource(recursive=true)
{
    "outcome" => "success",
    "result" => {
        "allow-any-hostname" => false,
        "always-refresh-token" => false,
        "auth-server-url" => undefined,
        "auth-server-url-for-backend-requests" => undefined,
        "autodetect-bearer-only" => false,
        "bearer-only" => false,
        "client-key-password" => undefined,
        "client-keystore" => undefined,
        "client-keystore-password" => undefined,
        "connection-pool-size" => undefined,
        "cors-allowed-headers" => undefined,
        "cors-allowed-methods" => undefined,
        "cors-max-age" => undefined,
        "disable-trust-manager" => false,
        "enable-basic-auth" => false,
        "enable-cors" => false,
        "expose-token" => false,
        "min-time-between-jwks-requests" => undefined,
        "principal-attribute" => undefined,
        "public-client" => false,
        "realm" => "intranet",
        "realm-public-key" => undefined,
        "register-node-at-startup" => false,
        "register-node-period" => undefined,
        "resource" => "cli-web-fec",
        "ssl-required" => "external",
        "token-minimum-time-to-live" => undefined,
        "token-store" => undefined,
        "truststore" => undefined,
        "truststore-password" => undefined,
        "turn-off-change-session-id-on-login" => false,
        "use-resource-role-mappings" => false,
        "credential" => {"secret" => {"value" => "36ab01d0-f1a5-4b1b-9a76-839553c7a6a9"}}
    }
}

[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=keycloak/secure-deployment=fec-web.war:read-resource(recursive=true)
{
    "outcome" => "success",
    "result" => {
        "allow-any-hostname" => true,
        "always-refresh-token" => false,
        "auth-server-url" => "https://login.des.caixa/auth",
        "auth-server-url-for-backend-requests" => undefined,
        "autodetect-bearer-only" => false,
        "bearer-only" => false,
        "client-key-password" => undefined,
        "client-keystore" => undefined,
        "client-keystore-password" => undefined,
        "connection-pool-size" => undefined,
        "cors-allowed-headers" => undefined,
        "cors-allowed-methods" => undefined,
        "cors-max-age" => undefined,
        "disable-trust-manager" => false,
        "enable-basic-auth" => false,
        "enable-cors" => false,
        "expose-token" => false,
        "min-time-between-jwks-requests" => undefined,
        "principal-attribute" => undefined,
        "public-client" => false,
        "realm" => "intranet",
        "realm-public-key" => undefined,
        "register-node-at-startup" => false,
        "register-node-period" => undefined,
        "resource" => "cli-web-fec",
        "ssl-required" => "all",
        "token-minimum-time-to-live" => undefined,
        "token-store" => undefined,
        "truststore" => undefined,
        "truststore-password" => undefined,
        "turn-off-change-session-id-on-login" => false,
        "use-resource-role-mappings" => false,
        "credential" => {"secret" => {"value" => "36ab01d0-f1a5-4b1b-9a76-839553c7a6a9"}}
    }
}

[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=keycloak/secure-deployment=ccr-parametros-web.war:read-resource
{
    "outcome" => "success",
    "result" => {
        "allow-any-hostname" => false,
        "always-refresh-token" => false,
        "auth-server-url" => undefined,
        "auth-server-url-for-backend-requests" => undefined,
        "autodetect-bearer-only" => false,
        "bearer-only" => false,
        "client-key-password" => undefined,
        "client-keystore" => undefined,
        "client-keystore-password" => undefined,
        "connection-pool-size" => undefined,
        "cors-allowed-headers" => undefined,
        "cors-allowed-methods" => undefined,
        "cors-max-age" => undefined,
        "disable-trust-manager" => false,
        "enable-basic-auth" => false,
        "enable-cors" => false,
        "expose-token" => false,
        "min-time-between-jwks-requests" => undefined,
        "principal-attribute" => undefined,
        "public-client" => false,
        "realm" => "intranet",
        "realm-public-key" => undefined,
        "register-node-at-startup" => false,
        "register-node-period" => undefined,
        "resource" => "cli-web-fec",
        "ssl-required" => "external",
        "token-minimum-time-to-live" => undefined,
        "token-store" => undefined,
        "truststore" => undefined,
        "truststore-password" => undefined,
        "turn-off-change-session-id-on-login" => false,
        "use-resource-role-mappings" => false,
        "credential" => {"secret" => undefined}
    }
}

[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=keycloak/secure-deployment=workflow-credito-pj-web.war:read-attribute(name=token-store)
{
    "outcome" => "success",
    "result" => undefined
}

[domain@localhost:9999 /]
