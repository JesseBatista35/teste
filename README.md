
[p585600@srjdeapllx158 opt]$ cd /opt/open/jboss/7.0.0/domain/configuration grep -n "SICPU_APLICATIVO|AUTHENTICATION_SERVER_URL|sifpp_intra" domain.xml host.xml
[p585600@srjdeapllx158 configuration]$ /opt/open/jboss/7.0.0/bin/jboss-cli.sh --connect controller=srjdeapllx158:9990
Authenticating against security realm: ManagementRealm
Username: p585600
Password:
Failed to connect to the controller: Unable to authenticate against controller at srjdeapllx158:9990: Authentication failed: all available authentication mechanisms failed:
   JBOSS-LOCAL-USER: javax.security.sasl.SaslException: Failed to read server challenge [Caused by java.io.FileNotFoundException: /opt/open/jboss/7.0.0/domain/tmp/auth/local1578743252134412394.challenge (Permission denied)]
   DIGEST-MD5: Server rejected authentication
[p585600@srjdeapllx158 configuration]$
[p585600@srjdeapllx158 configuration]$
[p585600@srjdeapllx158 configuration]$
[p585600@srjdeapllx158 configuration]$ /opt/open/jboss/7.0.0/bin/jboss-cli.sh --connect controller=srjdeapllx158:9990
Authenticating against security realm: ManagementRealm
Username: admin
Password:
Failed to connect to the controller: Unable to authenticate against controller at srjdeapllx158:9990: Authentication failed: all available authentication mechanisms failed:
   JBOSS-LOCAL-USER: javax.security.sasl.SaslException: Failed to read server challenge [Caused by java.io.FileNotFoundException: /opt/open/jboss/7.0.0/domain/tmp/auth/local1424752793997975484.challenge (Permission denied)]
   DIGEST-MD5: Server rejected authentication
[p585600@srjdeapllx158 configuration]$ sudo su
[root@srjdeapllx158 configuration]# /opt/open/jboss/7.0.0/bin/jboss-cli.sh --connect controller=srjdeapllx158:9990
[domain@srjdeapllx158:9990 /]
[domain@srjdeapllx158:9990 /]
[domain@srjdeapllx158:9990 /]
[domain@srjdeapllx158:9990 /] :read-children-names(child-type=host)
{
    "outcome" => "success",
    "result" => ["srjdeapllx158"]
}
[domain@srjdeapllx158:9990 /] /host=srjdeapllx158:read-children-names(child-type=server-config)
{
    "outcome" => "success",
    "result" => [
        "srjdeapllx158_siaud_intra_8084",
        "srjdeapllx158_sicnl_intra_8087",
        "srjdeapllx158_sicrf_intra_8080",
        "srjdeapllx158_sifpp_intra_8081",
        "srjdeapllx158_siopf_intra_8085",
        "srjdeapllx158_sisde_intra_8088",
        "srjdeapllx158_sisem_intra_8082",
        "srjdeapllx158_siurb-ao_intra_8089",
        "srjdeapllx158_suoco_intra_8083"
    ]
}
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
[domain@srjdeapllx158:9990 /]
