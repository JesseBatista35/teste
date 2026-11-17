
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ sudo /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.88.20:9999 --command="/host=*/server-config=*:read-attribute(name=group)" > /tmp/sc.txt 2>&1; grep -ic intranet5 /tmp/sc.txt; head -30 /tmp/sc.txt
0
Failed to get the list of the operation properties: "JBAS014883: No resource definition is registered for address [
    ("host" => "*"),
    ("server-config" => "*")
]"
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ sudo /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.88.20:9999 --command=":read-children-names(child-type=server-group)"
{
    "outcome" => "success",
    "result" => [
        "apdctd-sictd-intranet",
        "guia-sai",
        "jklnctd-sictd-digitalizar-intranet",
        "siaef",
        "siafc",
        "siaoi",
        "siapc",
        "siara",
        "siarc",
        "siatd",
        "siatd-analise-pauta",
        "siatd-internet",
        "siatd-intranet",
        "siatd-pauta-internet",
        "siatd-pauta-intranet",
        "siavl",
        "siccr",
        "sicdu-cliente-intranet",
        "sicdu-convenio-internet",
        "sicdu-convenio-intranet",
        "sicem",
        "sicli",
        "sicli-app",
        "sicrs",
        "sictd-digitalizar-intranet",
        "sictd-internet",
        "sictd-intranet",
        "sicve",
        "sicve-anexo",
        "sicve-api",
        "sicve-internet",
        "sicve-msw",
        "siecm-pre-des",
        "siefi",
        "siemp",
        "sievj",
        "siexc",
        "sifec-api",
        "sifec-batch",
        "sifec-internet",
        "sifec-intranet",
        "sifec-intranet2",
        "sifec-intranet3",
        "sifec-intranet4",
        "sifec-intranet5",
        "sifes-internet",
        "sifes-intranet",
        "sifes-intranet2",
        "sifes-intranet3",
        "sifes-intranet4",
        "sigch",
        "sigcr",
        "sigct",
        "sigdf",
        "sigdp",
        "sigdr",
        "sigec-comercial",
        "sigfi",
        "sigfi-ecr",
        "sigrr",
        "sigtc",
        "siico",
        "simcd",
        "simph",
        "sinad",
        "sinaf",
        "sinaf-validador",
        "sinaf2-prd-legado",
        "sinch",
        "sineb",
        "siopi-apps",
        "siopi-batch",
        "siotp",
        "siouv",
        "sipag",
        "sipen",
        "sipes",
        "sipge",
        "sipld",
        "sipld-teste",
        "sipmc-internet",
        "sipmc-intranet",
        "sipon",
        "siprc",
        "sircl",
        "siric",
        "sirta",
        "sirta2",
        "sirta3",
        "sirta4",
        "sirta5",
        "sisdu",
        "sisfw",
        "sisgd-internet",
        "sisgd-intranet",
        "sispe",
        "sisrh",
        "sisrs",
        "sitah-mcmv",
        "sitah-mon",
        "sivep",
        "siwic",
        "teste_log"
    ]
}
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ for u in https://logindes.caixa.gov.br/auth/realms/internet https://login.des.caixa/auth/realms/intranet; do echo "== $u"; curl --noproxy '*' -k -s -m 10 $u/protocol/openid-connect/certs | grep -o '"kid":"[^"]*"'; done
== https://logindes.caixa.gov.br/auth/realms/internet
"kid":"olg3hbVEM3_gRt1DdpXMwOXtS-E2MQQDb0Bhw6IvZdo"
== https://login.des.caixa/auth/realms/intranet
"kid":"MFeJ65_D-xqNy3VmkMHoMVKScfP7KmYk7mV0IhK-kAw"
-sh-4.1$



473


-DSSO_INTERNET_SECRET=de0ddc53-641c-4c38-bb48-0912d9d8227f
 
-DSSO_INTRANET_SECRET=36ab01d0-f1a5-4b1b-9a76-839553c7a6a9
 
-DSSO_INTRANET_SERVICE_CCR_SECRET=ed8dc39e-3fe6-4264-91c0-bf12be2a58eb
 
-DSSO_INTRANET_SERVICE_CDT_CLIENT_SECRET=f470c180-6fa5-4408-a78c-9b8a2e967c9a
 
-DSSO_INTRANET_SERVICE_SECRET=cf65ddca-84c5-4548-81f2-163d245edf04
 
-DSSO_SERVICO_CLIENT_SECRET=cf65ddca-84c5-4548-81f2-163d245edf04
 
Resource Names / Client IDs
-DSSO_INTERNET_RESOURCE_NAME=cli-web-fec
-DSSO_INTRANET_RESOURCE_NAME=cli-web-fec
-DSSO_INTRANET_SERVICE_RESOURCE_NAME=cli-ser-fec
-DSSO_INTRANET_SERVICE_CCR_RESOURCE_NAME=cli-ser-ccr
-DSSO_INTRANET_SERVICE_CDT_CLIENT_ID=cli-ser-cdt
-DSSO_SERVICO_CLIENT_ID=cli-ser-fec
 
