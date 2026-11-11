
    "result" => "sccd"
}

[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/SybaseSibanDS_ORIGINAL":read-attribute(name=password)
{
    "outcome" => "success",
    "result" => "adsads"
}

[domain@localhost:9999 /]
[root@cbrdeapllx471 p585600]# /profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/SybaseSibanDS":write-attribute(name=password,value="adsads")
bash: syntax error near unexpected token `name=password,value="adsads"'
[root@cbrdeapllx471 p585600]# /profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/SybaseSibanDS":write-attribute(name=password,value=adsads)
bash: syntax error near unexpected token `name=password,value=adsads'
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
