O próximo passo é conferir o usuário antes de trocar a URL.

No 6.4:

sudo sed -n '19236,19252p' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -iE 'user-name|security-domain'

Na 471 (CLI):

/profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/SybaseSibanDS":read-attribute(name=user-name)

Me manda as duas saídas. Se o usuário for o mesmo, você roda o write-attribute da URL e combinamos o restart na sala.




[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/SybaseSibanDS":read-attribute(name=user-name)
{
    "outcome" => "success",
    "result" => "banonline"
}

[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
