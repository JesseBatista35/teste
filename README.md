
[domain@crjtqapllx003:9990 /]
[domain@crjtqapllx003:9990 /]
[domain@crjtqapllx003:9990 /] /server-group=sifpp/system-property=ENDPOINT_MICRO:add(value="https://sifpp-micro-tqs.apps.nprd.caixa")
{
    "outcome" => "success",
    "result" => undefined,
    "server-groups" => {"sifpp" => {"host" => {"crjtqapllx003" => {"crjtqapllx003_sifpp_intra_8080" => {"response" => {"outcome" => "success"}}}}}}
}
[domain@crjtqapllx003:9990 /]
[domain@crjtqapllx003:9990 /]
[domain@crjtqapllx003:9990 /]
[domain@crjtqapllx003:9990 /] /server-group=sifpp/system-property=ENDPOINT_MICRO:read-resource
{
    "outcome" => "success",
    "result" => {
        "boot-time" => true,
        "value" => "https://sifpp-micro-tqs.apps.nprd.caixa"
    }
}
[domain@crjtqapllx003:9990 /]
[domain@crjtqapllx003:9990 /]
[domain@crjtqapllx003:9990 /] /host=crjtqapllx003/server-config=crjtqapllx003_sifpp_intra_8080:stop(blocking=true)
{
    "outcome" => "success",
    "result" => "STOPPED"
}
[domain@crjtqapllx003:9990 /] /host=crjtqapllx003/server-config=crjtqapllx003_sifpp_intra_8080:start(blocking=true)
{
    "outcome" => "success",
    "result" => "STARTED"
}
[domain@crjtqapllx003:9990 /] exit
[root@crjtqapllx003 p585600]# ps -ef | grep "Server:crjtqapllx003_sifpp_intra_8080" | grep -v grep | grep -o "DENDPOINT_MICRO=[^ ]*"
DENDPOINT_MICRO=https://sifpp-micro-tqs.apps.nprd.caixa
[root@crjtqapllx003 p585600]#
