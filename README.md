[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=keycloak/realm=*:read-resource
{
    "outcome" => "success",
    "result" => [
        {
            "address" => [
                ("profile" => "full-ha-sifec-intranet"),
                ("subsystem" => "keycloak"),
                ("realm" => "intranet")
            ],
            "outcome" => "success",
            "result" => {
                "allow-any-hostname" => false,
                "always-refresh-token" => false,
                "auth-server-url" => "https://login.des.caixa/auth",
                "auth-server-url-for-backend-requests" => undefined,
                "autodetect-bearer-only" => false,
                "client-key-password" => undefined,
                "client-keystore" => undefined,
                "client-keystore-password" => undefined,
                "connection-pool-size" => undefined,
                "cors-allowed-headers" => undefined,
                "cors-allowed-methods" => undefined,
                "cors-max-age" => undefined,
                "disable-trust-manager" => true,
                "enable-cors" => false,
                "expose-token" => false,
                "principal-attribute" => undefined,
                "realm-public-key" => undefined,
                "register-node-at-startup" => false,
                "register-node-period" => undefined,
                "ssl-required" => "all",
                "token-store" => undefined,
                "truststore" => undefined,
                "truststore-password" => undefined
            }
        },
        {
            "address" => [
                ("profile" => "full-ha-sifec-intranet"),
                ("subsystem" => "keycloak"),
                ("realm" => "internet")
            ],
            "outcome" => "success",
            "result" => {
                "allow-any-hostname" => false,
                "always-refresh-token" => false,
                "auth-server-url" => "https://logindes.caixa.gov.br/auth",
                "auth-server-url-for-backend-requests" => undefined,
                "autodetect-bearer-only" => false,
                "client-key-password" => undefined,
                "client-keystore" => undefined,
                "client-keystore-password" => undefined,
                "connection-pool-size" => undefined,
                "cors-allowed-headers" => undefined,
                "cors-allowed-methods" => undefined,
                "cors-max-age" => undefined,
                "disable-trust-manager" => true,
                "enable-cors" => false,
                "expose-token" => false,
                "principal-attribute" => undefined,
                "realm-public-key" => undefined,
                "register-node-at-startup" => false,
                "register-node-period" => undefined,
                "ssl-required" => "external",
                "token-store" => undefined,
                "truststore" => undefined,
                "truststore-password" => undefined
            },
            "rolled-back" => undefined
        }
    ]
}

[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=keycloak/secure-deployment=fec-web.war/credential=*:read-resource
{
    "outcome" => "success",
    "result" => [{
        "address" => [
            ("profile" => "full-ha-sifec-intranet"),
            ("subsystem" => "keycloak"),
            ("secure-deployment" => "fec-web.war"),
            ("credential" => "secret")
        ],
        "outcome" => "success",
        "result" => {"value" => "36ab01d0-f1a5-4b1b-9a76-839553c7a6a9"}
    }]
}

[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=keycloak/secure-deployment=workflow-credito-pj-web.war/credential=*:read-resource
{
    "outcome" => "success",
    "result" => [{
        "address" => [
            ("profile" => "full-ha-sifec-intranet"),
            ("subsystem" => "keycloak"),
            ("secure-deployment" => "workflow-credito-pj-web.war"),
            ("credential" => "secret")
        ],
        "outcome" => "success",
        "result" => {"value" => "36ab01d0-f1a5-4b1b-9a76-839553c7a6a9"}
    }]
}

[domain@localhost:9999 /]






