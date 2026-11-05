
[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=security/security-domain=keycloak:read-resource(recursive=true)
{
    "outcome" => "success",
    "result" => {
        "cache-type" => undefined,
        "acl" => undefined,
        "audit" => undefined,
        "authentication" => {"classic" => {
            "login-modules" => [{
                "code" => "org.keycloak.adapters.jboss.KeycloakLoginModule",
                "flag" => "required",
                "module" => undefined,
                "module-options" => undefined
            }],
            "login-module" => {"org.keycloak.adapters.jboss.KeycloakLoginModule" => {
                "code" => "org.keycloak.adapters.jboss.KeycloakLoginModule",
                "flag" => "required",
                "module" => undefined,
                "module-options" => undefined
            }}
        }},
        "authorization" => undefined,
        "identity-trust" => undefined,
        "jsse" => undefined,
        "mapping" => undefined
    }
}

[domain@localhost:9999 /]


[domain@localhost:9999 /]
