
[domain@localhost:9443 /]
[domain@localhost:9443 /] /profile=full-ha-sifec-intranet2/subsystem=security/security-domain=jaas-sifec:read-resource(recursive=true)
{
    "outcome" => "success",
    "result" => {
        "cache-type" => "default",
        "acl" => undefined,
        "audit" => undefined,
        "authentication" => {"classic" => {
            "login-modules" => [
                {
                    "code" => "Remoting",
                    "flag" => "optional",
                    "module" => undefined,
                    "module-options" => {"password-stacking" => "useFirstPass"}
                },
                {
                    "code" => "RealmDirect",
                    "flag" => "required",
                    "module" => undefined,
                    "module-options" => {"password-stacking" => "useFirstPass"}
                }
            ],
            "login-module" => {
                "Remoting" => {
                    "code" => "Remoting",
                    "flag" => "optional",
                    "module" => undefined,
                    "module-options" => {"password-stacking" => "useFirstPass"}
                },
                "RealmDirect" => {
                    "code" => "RealmDirect",
                    "flag" => "required",
                    "module" => undefined,
                    "module-options" => {"password-stacking" => "useFirstPass"}
                }
            }
        }},
        "authorization" => undefined,
        "identity-trust" => undefined,
        "jsse" => undefined,
        "mapping" => undefined
    }
}

[domain@localhost:9443 /]
[domain@localhost:9443 /]
