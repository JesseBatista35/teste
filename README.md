
[root@srjtqapllx0021 sifug]#
[root@srjtqapllx0021 sifug]# /opt/open/jboss/7.0.0/bin/jboss-cli.sh --connect --controller=srjtqapllx0021:9990
[domain@srjtqapllx0021:9990 /]
[domain@srjtqapllx0021:9990 /]
[domain@srjtqapllx0021:9990 /] /host=srjtqapllx0021/server-config=srjtqapllx0021_sifug_inter_8080:restart
{
    "outcome" => "success",
    "result" => "STARTING"
}
[domain@srjtqapllx0021:9990 /] /host=*:read-children-names(child-type=server-config)
{
    "outcome" => "failed",
    "failure-description" => "WFLYCTL0158: Operation handler failed: java.lang.NullPointerException",
    "rolled-back" => true
}
[domain@srjtqapllx0021:9990 /]
[domain@srjtqapllx0021:9990 /]
[domain@srjtqapllx0021:9990 /]
[domain@srjtqapllx0021:9990 /] :read-children-names(child-type=host)
{
    "outcome" => "success",
    "result" => ["srjtqapllx0021"]
}
[domain@srjtqapllx0021:9990 /] tail -f /opt/open/jboss/7.0.0/domain/servers/srjtqapllx0021_sifug_inter_8080/log/server.log
Unexpected command 'tail -f /opt/open/jboss/7.0.0/domain/servers/srjtqapllx0021_sifug_inter_8080/log/server.log'. Type 'help --commands' for the list of supported commands.
[domain@srjtqapllx0021:9990 /]
