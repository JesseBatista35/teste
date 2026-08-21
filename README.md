
[p585600@crjtqapllx003 ~]$ sudo su
[root@crjtqapllx003 p585600]#
[root@crjtqapllx003 p585600]#
[root@crjtqapllx003 p585600]# /opt/open/j
java/  jboss/
[root@crjtqapllx003 p585600]# /opt/open/jboss/7.0.0/bin/jboss-cli.sh --connect controller=crjtqapllx003:9990
[domain@crjtqapllx003:9990 /]
[domain@crjtqapllx003:9990 /]
[domain@crjtqapllx003:9990 /] :read-children-names(child-type=host)
{
    "outcome" => "success",
    "result" => ["crjtqapllx003"]
}
[domain@crjtqapllx003:9990 /] /host
host  host-exclude
[domain@crjtqapllx003:9990 /] /host=crjtqapllx003/server-config=crjtqapllx003_sifpp_intra_8080:read-resource(include-runtime=false)
{
    "outcome" => "success",
    "result" => {
        "auto-start" => true,
        "cpu-affinity" => undefined,
        "group" => "sifpp",
        "name" => "crjtqapllx003_sifpp_intra_8080",
        "priority" => undefined,
        "socket-binding-default-interface" => undefined,
        "socket-binding-group" => "sifpp",
        "socket-binding-port-offset" => 0,
        "update-auto-start-with-server-status" => false,
        "interface" => undefined,
        "jvm" => undefined,
        "path" => undefined,
        "ssl" => undefined,
        "system-property" => undefined
    }
}
[domain@crjtqapllx003:9990 /]
