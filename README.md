<img width="1656" height="909" alt="image" src="https://github.com/user-attachments/assets/7af9b8ba-5b96-40a5-b586-b69282edf72b" />



[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] /server-group=sifec-intranet/system-property=SSO_INTRANET_SERVICE_SECRET:read-attribute(name=value)
{
    "outcome" => "success",
    "result" => "cf65ddca-84c5-4548-81f2-163d245edf04"
}

[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] /server-group=sifec-intranet:restart-servers(blocking=true)
{
    "outcome" => "success",
    "result" => undefined,
    "server-groups" => undefined
}

[domain@localhost:9999 /] /host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473:read-attribute(name=server-state)
{
    "outcome" => "success",
    "result" => "running"
}

[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]



<img width="1587" height="776" alt="image" src="https://github.com/user-attachments/assets/59235bc1-1f60-4a68-8822-e674b1a49b22" />




