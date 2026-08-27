[domain@10.116.89.0:9999 /] /server-group=simcn/deployment=SIMCN:read-resource

{

    "outcome" => "failed",

    "failure-description" => "WFLYCTL0216: Management resource '[

    (\"server-group\" => \"simcn\"),

    (\"deployment\" => \"SIMCN\")

]' not found",

    "rolled-back" => true

}

[domain@10.116.89.0:9999 /] deployment-info --name=SIMCN

NAME  RUNTIME-NAME

SIMCN simcn-2.110.11.7-b2189.ear
 
SERVER-GROUP              STATE

siaef                     not added

siafc                     not added

siaoi                     not added

siaoi-api                 not added

siaoi-mgi                 not added

siaoi-tge                 not added

siapc                     not added

siara                     not added

siarc                     not added

siatd-internet            not added

siatd-intranet            not added

siatd-pauta-internet      not added

siatd-pauta-intranet      not added

siavl                     not added

sicdu-cliente-intranet    not added

sicdu-convenio-internet   not added

sicdu-convenio-intranet   not added

sicli                     not added

sicli-app                 not added

sicrs                     not added

sictd-digitalizar         not added

sictd-internet            not added

sictd-intranet            not added

sicve                     not added

sicve-anexo               not added

sicve-internet            not added

sicve-msw                 not added

sidis                     not added

sidis-internet            not added

siecm                     not added

siedd                     not added

siefi                     not added

siemp                     not added

sierc                     not added

sievj                     not added

siexc                     not added

sifec-intranet            not added

sifes-internet            not added

sifes-intranet            not added

sifrs                     not added

sigch                     not added

sigcr                     not added

sigct                     not added

sigdf                     not added

sigdp                     not added

sigdr                     not added

sigec-comercial           not added

sigec-csc                 not added

sigec-portabilidade-batch not added

sigec-portabilidade2      not added

sigec-portabilidade3      not added

sigfi                     not added

sigfi-ecr                 not added

sigfi-fgc                 not added

sigip                     not added

sigpi                     not added

sigrr                     not added

sigtc                     not added

siico                     not added

siiga                     not added

sildg                     not added

simcd                     not added

simcn                     not added

simph                     not added

simpi                     not added

sinad                     not added

sinaf                     not added

sinaf-legado              not added

sinaf-validador           not added

sinch                     not added

sinda                     not added

sineb                     not added

siopi                     not added

siorm                     not added

siosp                     not added

siotp                     not added

siouv                     not added

sipag                     not added

sipen                     not added

sipes                     not added

sipge                     not added

sipld                     not added

sipon                     not added

sipqv                     not added

siprc                     not added

siric                     not added

siric-adm                 not added

siric-api                 not added

siric-api-servidor196     not added

siric2                    not added

siric2-adm                not added

siric2-api                not added

sirim                     not added

sirta                     not added

sisat                     not added

sisdu                     not added

sisfw                     not added

sisgc                     not added

sisgd-internet            not added

sisgd-intranet            not added

sisou                     not added

sisou-internet            not added

sispb                     not added

sispe                     not added

sispl                     not added

sisrh                     not added

sisrs                     not added

sitah-mcmv                not added

sitah-mon                 not added

sivep                     not added

siwic                     not added

[domain@10.116.89.0:9999 /]

 
/server-group=simcn/deployment=SIMCN:remove




[root@sbrdeapllx069 p585600]# /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --user='admin' --password='jboss!123' --controller=10.116.89.0:9999
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /] :read-children-names(child-type=deployment)
{
    "outcome" => "success",
    "result" => [
        "AUTORH",
        "ClienteSIECM_EAR.ear",
        "RoteadorSISGD.ear",
        "Roteador_SISGD.ear",
        "SIAEF",
        "SIAOI",
        "SIAOI-API",
        "SICRS",
        "SIECM",
        "SIEMP",
        "SIFEC-RURAL",
        "SIGEC-PORTABILIDADE-BATCH",
        "SIGEC-PORTABILIDADE2",
        "SIGIP",
        "SIMCN",
        "SINAD",
        "SINAFWEB",
        "SIOSP",
        "SIPLD",
        "SIRIC",
        "SIRIC-ADM",
        "SIRIC-API",
        "SIRIC2",
        "SIRIC2-ADM",
        "SIRIC2-API",
        "SISGD",
        "SISOU",
        "SISOU-INTERNET",
        "SISRH",
        "SQLSERVER-sqljdbc4.jar",
        "activemq-ra",
        "db2jcc4.jar",
        "framework-2.0.1.jar",
        "framework_sisgd-1.0.0.jar",
        "jconn4-16.jar",
        "jconn4.jar",
        "mssql-jdbc-9.4.1.jre8.jar",
        "ojdbc14.jar",
        "ojdbc6.jar",
        "ojdbc8.jar",
        "postgresql-42.0.0.jar",
        "postgresql-9.1-901.jdbc4.jar",
        "wmq.jmsra-7.0.1.12-transaction.rar",
        "wmq.jmsra-7.5.0.8.rar",
        "wmq.jmsra.rar"
    ]
}
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /] /host=sbrdeapllx105_corporativo:read-attribute(name=host-state)
Failed to get the list of the operation properties: "WFLYCTL0030: No resource definition is registered for address [("host" => "sbrdeapllx105_corporativo")]"
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /]


 
