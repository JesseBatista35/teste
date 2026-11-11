No CLI, rode as 4 linhas na ordem. A primeira (batch) é obrigatória: ela faz a troca acontecer de uma vez, e se o novo falhar, o 1.4.0 volta sozinho.

batch
/server-group=sifec-intranet/deployment=SICCR-HUB-FRONTEND:remove
/server-group=sifec-intranet/deployment=SICCR-HUB-FRONTEND2:add(enabled=true)
run-batch

Confira se ficou ativo:

/server-group=sifec-intranet/deployment=SICCR-HUB-FRONTEND2:read-resource
Teste na sua estação
curl -k -s -o /dev/null -w "%{http_code}\n" https://migracaosifec.des.caixa/hub-web/

O front pode até abrir, mas as telas que chamam o hub-api vão falhar enquanto o build novo do backend não chegar, por causa do erro do ? na query. Isso não é problema do hub-web.

Se precisar voltar para o 1.4.0:

batch
/server-group=sifec-intranet/deployment=SICCR-HUB-FRONTEND2:remove
/server-group=sifec-intranet/deployment=SICCR-HUB-FRONTEND:add(enabled=true)
run-batch




C:\Users\p585600>curl -k -s -o /dev/null -w "%{http_code}\n" https://migracaosifec.des.caixa/hub-web/
302

C:\Users\p585600>




[domain@localhost:9999 /]
[domain@localhost:9999 /] /server-group=sifec-intranet/deployment=SICCR-HUB-FRONTEND:remove
{
    "outcome" => "success",
    "result" => undefined,
    "server-groups" => {"sifec-intranet" => {"host" => {"hc_cbrdeapllx473" => {"sifec-intranet_node1_lx473" => {"response" => {
        "outcome" => "success",
        "result" => undefined
    }}}}}}
}

[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] /server-group=sifec-intranet/deployment=SICCR-HUB-FRONTEND2:add(enabled=true)
{
    "outcome" => "success",
    "result" => undefined,
    "server-groups" => {"sifec-intranet" => {"host" => {"hc_cbrdeapllx473" => {"sifec-intranet_node1_lx473" => {"response" => {
        "outcome" => "success",
        "result" => undefined
    }}}}}}
}

[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] /server-group=sifec-intranet/deployment=SICCR-HUB-FRONTEND2:read-resource
{
    "outcome" => "success",
    "result" => {
        "enabled" => true,
        "name" => "SICCR-HUB-FRONTEND2",
        "runtime-name" => "hub-web-1.10.0.1-b418.ear"
    }
}

[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] curl -k -s -o /dev/null -w "%{http_code}\n" https://migracaosifec.des.caixa/hub-web/
Unexpected command 'curl -k -s -o /dev/null -w "%{http_code}\n" https://migracaosifec.des.caixa/hub-web/'. Type 'help --commands' for the list of supported commands.

[domain@localhost:9999 /]
