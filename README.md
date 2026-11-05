O nome é só um rótulo e não atrapalha. O aviso do DB2 4223 é o mesmo de sempre, do fec-web, e não tem relação com o SICDT.

Confirmação (CLI do 471):

/server-group=sifec-intranet/deployment=SICDT-FEC:read-attribute(name=enabled)
/deployment=SICDT-FEC/subdeployment=*:read-attribute(name=runtime-name)

O esperado é true e os módulos do .ear listados.

E veja se os dois contextos web registraram (no 473):

sudo grep -E "WFLYUT0021.*(sifec-cdt-web|sicdt-orig-api-rest)" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | tail -2

Devem aparecer duas linhas, uma para /sifec-cdt-web e outra para /sicdt-orig-api-rest.




[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] /server-group=sifec-intranet/deployment=SICDT-FEC:read-attribute(name=enabled)
{
    "outcome" => "success",
    "result" => true
}

[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] /deployment=SICDT-FEC/subdeployment=*:read-attribute(name=runtime-name)
Failed to get the list of the operation properties: "WFLYCTL0030: No resource definition is registered for address [
    ("deployment" => "SICDT-FEC"),
    ("subdeployment" => "*")
]"

[domain@localhost:9999 /]



[p585600@cbrdeapllx473 ~]$ sudo grep -E "WFLYUT0021.*(sifec-cdt-web|sicdt-orig-api-rest)" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | tail -2
16:30:28,898 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 118) WFLYUT0021: Contexto web registrado: '/sifec-cdt-web' para servidor 'default-server'
16:30:29,182 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 112) WFLYUT0021: Contexto web registrado: '/sicdt-orig-api-rest' para servidor 'default-server'
[p585600@cbrdeapllx473 ~]$


