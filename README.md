[domain@srjdeapllx158:9990 /] /host=srjdeapllx158/server-config=srjdeapllx158_sifpp_intra_8081:read-resource(include-runtime=false)
{
    "outcome" => "success",
    "result" => {
        "auto-start" => true,
        "cpu-affinity" => undefined,
        "group" => "sifpp",
        "name" => "srjdeapllx158_sifpp_intra_8081",
        "priority" => undefined,
        "socket-binding-default-interface" => undefined,
        "socket-binding-group" => "sifpp",
        "socket-binding-port-offset" => 1,
        "update-auto-start-with-server-status" => false,
        "interface" => undefined,
        "jvm" => undefined,
        "path" => undefined,
        "ssl" => undefined,
        "system-property" => undefined
    }
}
[domain@srjdeapllx158:9990 /] /server-group=si
siaud  sicnl  sicrf  sifpp  siopf  sisde  sisem  siurb-ao
[domain@srjdeapllx158:9990 /] /server-group=si
siaud  sicnl  sicrf  sifpp  siopf  sisde  sisem  siurb-ao
[domain@srjdeapllx158:9990 /] /server-group=sifpp:re
read-attribute              read-children-names         read-operation-description  read-resource-description   replace-deployment
read-attribute-group        read-children-resources     read-operation-names        reload-servers              restart-servers
read-attribute-group-names  read-children-types         read-resource               remove                      resume-servers
[domain@srjdeapllx158:9990 /] /server-group=sifpp:read-resource(include-runtime=false)
{
    "outcome" => "success",
    "result" => {
        "management-subsystem-endpoint" => false,
        "profile" => "sifpp",
        "socket-binding-default-interface" => undefined,
        "socket-binding-group" => "sifpp",
        "socket-binding-port-offset" => 0,
        "deployment" => {
            "DBConnect.ear" => undefined,
            "sifpp-ear.ear" => undefined
        },
        "deployment-overlay" => undefined,
        "jvm" => {"sifpp" => undefined},
        "system-property" => {
            "simma.local" => undefined,
            "sisit.local" => undefined,
            "CLIENT_ID" => undefined,
            "CLIENT_SECRET" => undefined,
            "AUTHENTICATION_SERVER_URL" => undefined,
            "RESOURCE_SERVER_URL" => undefined,
            "SICPU_USER" => undefined,
            "SICPU_PASSWORD" => undefined,
            "sicpu.local" => undefined,
            "SICPU_APP" => undefined,
            "SICPU_APLICATIVO" => undefined,
            "sigdb.transmite" => undefined,
            "sigdb.recebe" => undefined
        }
    }
}
[domain@srjdeapllx158:9990 /] /server-group=sifpp:re
read-attribute              read-children-names         read-operation-description  read-resource-description   replace-deployment
read-attribute-group        read-children-resources     read-operation-names        reload-servers              restart-servers
read-attribute-group-names  read-children-types         read-resource               remove                      resume-servers
[domain@srjdeapllx158:9990 /] /server-group=sifpp:read-children-names(child-type=system-property
{
    "outcome" => "success",
    "result" => [
        "AUTHENTICATION_SERVER_URL",
        "CLIENT_ID",
        "CLIENT_SECRET",
        "RESOURCE_SERVER_URL",
        "SICPU_APLICATIVO",
        "SICPU_APP",
        "SICPU_PASSWORD",
        "SICPU_USER",
        "sicpu.local",
        "sigdb.recebe",
        "sigdb.transmite",
        "simma.local",
        "sisit.local"
    ]
}
[domain@srjdeapllx158:9990 /]

