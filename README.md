a) Ver onde estão as propriedades parecidas, para criar no mesmo lugar:

/server-group=sifec-intranet/system-property=SSO_INTRANET_SERVICE_CCR_RESOURCE_NAME:read-resource
/server-group=sifec-intranet/system-property=SSO_INTRANET_SERVICE_RESOURCE_NAME:read-resource

O esperado é a primeira retornar success e a segunda retornar “not found”.

b) Criar as duas no server-group (use o secret completo que o Pablo mandou):

/server-group=sifec-intranet/system-property=SSO_INTRANET_SERVICE_RESOURCE_NAME:add(value=cli-ser-fec)
/server-group=sifec-intranet/system-property=SSO_INTRANET_SERVICE_SECRET:add(value=<SECRET-QUE-O-PABLO-MANDOU>)

c) Aplicar. Propriedades de server-group só entram em vigor no restart do JVM. Avise a sala:

/server-group=sifec-intranet:restart-servers(blocking=true)
/host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473:read-attribute(name=server-state)

Se o passo (a) mostrar que as propriedades parecidas ficam em outro lugar (por exemplo, no host=hc_cbrdeapllx473 ou no server-config), me mande antes de criar.

Aproveitando o restart: se quiser, dá para aplicar junto a truststore do RURAL, numa parada só. Se preferir não misturar, faça só isso agora.

Depois do restart: peça para testarem o PJ. No F12, o perfil-acesso-usuario deve trazer as roles (FEC0126...), como no 6.4.

Sobre o secret: ele é uma credencial do SSO. Não deixe em print nem cole no chat da ADDR. Só use no comando.

Frase para a sala:




[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] /server-group=sifec-intranet/system-property=SSO_INTRANET_SERVICE_RESOURCE_NAME:read-resource
{
    "outcome" => "failed",
    "failure-description" => "WFLYCTL0216: Management resource '[
    (\"server-group\" => \"sifec-intranet\"),
    (\"system-property\" => \"SSO_INTRANET_SERVICE_RESOURCE_NAME\")
]' not found",
    "rolled-back" => true
}

[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] /server-group=sifec-intranet/system-property=SSO_INTRANET_SERVICE_CCR_RESOURCE_NAME:read-resource
{
    "outcome" => "success",
    "result" => {
        "boot-time" => true,
        "value" => "cli-ser-ccr"
    }
}

[domain@localhost:9999 /]
