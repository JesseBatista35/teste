
'read-attribute)name=profile)' is not a valid operation name.

[domain@localhost:9443 /] /server-group=sifec-intranet:read-attribute(name=profile)
{
    "outcome" => "success",
    "result" => "full-ha-sifec-intranet"
}

[domain@localhost:9443 /]
[domain@localhost:9443 /]
[domain@localhost:9443 /]
[domain@localhost:9443 /] /profile=*/subsystem=security/security-domain=jaas-sifec:read-resource
{
    "outcome" => "success",
    "result" => [{
        "address" => [
            ("profile" => "full-ha-sifec-intranet2"),
            ("subsystem" => "security"),
            ("security-domain" => "jaas-sifec")
        ],
        "outcome" => "success",
        "result" => {
            "cache-type" => "default",
            "acl" => undefined,
            "audit" => undefined,
            "authentication" => {"classic" => undefined},
            "authorization" => undefined,
            "identity-trust" => undefined,
            "jsse" => undefined,
            "mapping" => undefined
        }
    }]
}

[domain@localhost:9443 /] /profile=*/subsystem=mail
/  :
[domain@localhost:9443 /] /profile=*/subsystem=mail/mail-session=*read-resource
The operation name is missing or the format of the operation request is wrong.

[domain@localhost:9443 /] /profile=*/subsystem=mail/mail-session=*:read-resource
{
    "outcome" => "success",
    "result" => [
        {
            "address" => [
                ("profile" => "full-ha-sipen"),
                ("subsystem" => "mail"),
                ("mail-session" => "default")
            ],
            "outcome" => "success",
            "result" => {
                "debug" => false,
                "from" => undefined,
                "jndi-name" => "java:jboss/mail/Default",
                "custom" => undefined,
                "server" => {"smtp" => undefined}
            }
        },
        {
            "address" => [
                ("profile" => "full-ha-sifec-intranet"),
                ("subsystem" => "mail"),
                ("mail-session" => "default")
            ],
            "outcome" => "success",
            "result" => {
                "debug" => false,
                "from" => undefined,
                "jndi-name" => "java:jboss/mail/Default",
                "custom" => undefined,
                "server" => {"smtp" => undefined}
            },
            "rolled-back" => undefined
        },
        {
            "address" => [
                ("profile" => "full-ha-sifec-intranet2"),
                ("subsystem" => "mail"),
                ("mail-session" => "default")
            ],
            "outcome" => "success",
            "result" => {
                "debug" => false,
                "from" => undefined,
                "jndi-name" => "java:jboss/mail/Default",
                "custom" => undefined,
                "server" => {"smtp" => undefined}
            },
            "rolled-back" => undefined
        },
        {
            "address" => [
                ("profile" => "full-ha-siemp"),
                ("subsystem" => "mail"),
                ("mail-session" => "default")
            ],
            "outcome" => "success",
            "result" => {
                "debug" => false,
                "from" => undefined,
                "jndi-name" => "java:jboss/mail/Default",
                "custom" => undefined,
                "server" => {"smtp" => undefined}
            },
            "rolled-back" => undefined
        }
    ]
}

[domain@localhost:9443 /]
