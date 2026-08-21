
[domain@srjdeapllx158:9990 /]
[domain@srjdeapllx158:9990 /] /server-group=si
siaud  sicnl  sicrf  sifpp  siopf  sisde  sisem  siurb-ao
[domain@srjdeapllx158:9990 /] /server-group=sifpp/system-property=ENDPOINT_MICRO:add(value="https://sifpp-micro-des.apps.nprd.caixa")
{
    "outcome" => "success",
    "result" => undefined,
    "server-groups" => {"sifpp" => {"host" => {"srjdeapllx158" => {"srjdeapllx158_sifpp_intra_8081" => {"response" => {"outcome" => "success"}}}}}}
}
[domain@srjdeapllx158:9990 /] /server-group=sifpp/system-property=ENDPOINT_MICRO:read-resource
{
    "outcome" => "success",
    "result" => {
        "boot-time" => true,
        "value" => "https://sifpp-micro-des.apps.nprd.caixa"
    }
}
[domain@srjdeapllx158:9990 /]
[domain@srjdeapllx158:9990 /]
[domain@srjdeapllx158:9990 /]
[domain@srjdeapllx158:9990 /]
[domain@srjdeapllx158:9990 /] /host=srjdeapllx158/server-config=srjdeapllx158_sifpp_intra_8081:reload
{
    "outcome" => "success",
    "result" => "STARTING"
}
[domain@srjdeapllx158:9990 /] ps -ef | grep sifpp_intra_8081 | grep -o "DENDPOINT_MICRO=[^ ]*"
Unexpected command 'ps -ef | grep sifpp_intra_8081 | grep -o "DENDPOINT_MICRO=[^ ]*"'. Type 'help --commands' for the list of supported commands.
[domain@srjdeapllx158:9990 /]
[domain@srjdeapllx158:9990 /]
[domain@srjdeapllx158:9990 /]
