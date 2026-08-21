
[root@srjdeapllx158 configuration]#
[root@srjdeapllx158 configuration]# /opt/open/jboss/7.0.0/bin/jboss-cli.sh --connect controller=srjdeapllx158:9990
[domain@srjdeapllx158:9990 /]
[domain@srjdeapllx158:9990 /]
[domain@srjdeapllx158:9990 /]
[domain@srjdeapllx158:9990 /] /host=srjdeapllx158/server-config=srjdeapllx158_sifpp_intra_8081:stop(blocking=true)
{
    "outcome" => "success",
    "result" => "STOPPED"
}
[domain@srjdeapllx158:9990 /]
[domain@srjdeapllx158:9990 /]
[domain@srjdeapllx158:9990 /]
[domain@srjdeapllx158:9990 /] /host=srjdeapllx158/server-config=srjdeapllx158_sifpp_intra_8081:read-attribute(name=status)
{
    "outcome" => "success",
    "result" => "STOPPED"
}
[domain@srjdeapllx158:9990 /]
[domain@srjdeapllx158:9990 /]
[domain@srjdeapllx158:9990 /]
[domain@srjdeapllx158:9990 /]
[domain@srjdeapllx158:9990 /] /host=srjdeapllx158/server-config=srjdeapllx158_sifpp_intra_8081:start(blocking=true)
{
    "outcome" => "success",
    "result" => "STARTED"
}
[domain@srjdeapllx158:9990 /] /host=srjdeapllx158/server-config=srjdeapllx158_sifpp_intra_8081:read-attribute(name=status)
{
    "outcome" => "success",
    "result" => "STARTED"
}
[domain@srjdeapllx158:9990 /]
[domain@srjdeapllx158:9990 /]
[domain@srjdeapllx158:9990 /]
