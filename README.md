
[p585600@cbrdeapllx473 tmp]$
[p585600@cbrdeapllx473 tmp]$
[p585600@cbrdeapllx473 tmp]$ ^C
[p585600@cbrdeapllx473 tmp]$ echo | openssl s_client -connect api.des.caixa:443 -showcerts 2>/dev/null | grep -E "^ *[0-9]+ s:|^ *i:"
[p585600@cbrdeapllx473 tmp]$
[p585600@cbrdeapllx473 tmp]$ sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -E "WFLYSRV0010|WFLYCTL0013|ERROR|PKIX|rural|RURAL|FileNotFound|keystore"

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

[sudo] password for p585600:
14:21:53,400 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 9) WFLYJPA0011: Interrompendo unidade de persistência (fase 1 de 2) Serviço 'rural-2.115.1.1-b2421.ear#fecDS'
14:21:53,400 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 113) WFLYJPA0011: Interrompendo unidade de persistência (fase 1 de 2) Serviço 'rural-2.115.1.1-b2421.ear/rural-ejb.jar#SiempEjbDB2'
14:21:53,400 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 115) WFLYJPA0011: Interrompendo unidade de persistência (fase 1 de 2) Serviço 'rural-2.115.1.1-b2421.ear/rural-ejb.jar#Siemp2EjbSybase'
14:21:53,406 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 116) WFLYCLINF0003: Cache rural-2.115.1.1-b2421.ear.rural-web.war encerrado a partir do recipiente web
14:21:53,419 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0208: Interrompendo a subimplantação (runtime-name: rural-ejb.jar) em 58ms
14:21:53,462 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0208: Interrompendo a subimplantação (runtime-name: rural-web.war) em 101ms
14:21:53,466 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0028: Implantação interrompida SIFEC-RURAL4 (runtime-name: rural-2.115.1.1-b2421.ear) em 106ms




[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] :read-children-names(child-type=deployment)
{
    "outcome" => "success",
    "result" => [
        "SIAEF",
        "SIAFC",
        "SIAOI",
        "SIAPC",
        "SIAPX_JavaWeb",
        "SIARA",
        "SIARC",
        "SIATD-INTERNET",
        "SIATD-INTRANET",
        "SIBAN-CONSTRUCARD",
        "SIBAN-MCM",
        "SIBAN-MCM2",
        "SICCR-BDCAIXA",
        "SICCR-DOCUMENTOS",
        "SICCR-DOCUMENTOS2",
        "SICCR-DOCUMENTOS3",
        "SICCR-HUB-BACKEND2",
        "SICCR-HUB-BACKEND3",
        "SICCR-HUB-BACKEND4",
        "SICCR-HUB-BACKEND5",
        "SICCR-HUB-FRONTEND",
        "SICCR-HUB-FRONTEND2",
        "SICCR-HUB-FRONTEND3",
        "SICCR-HUB-FRONTEND4",
        "SICCR-HUB-FRONTEND5",
        "SICCR-INTEGRACAO",
        "SICCR-MINUTAS",
        "SICCR-PARAMETROS",
        "SICCR-PARAMETROS2",
        "SICCR-PARAMETROS3",
        "SICCR-PARAMETROS4",
        "SICCR-PARAMETROS5",
        "SICCR-PJ",
        "SICCR-PJ-INTERNET",
        "SICCR-PJ2",
        "SICCR-PJ3",
        "SICCR-PJ4",
        "SICCR-PJ5",
        "SICCR-TRIBUTOS",
        "SICDT-FEC",
        "SICDT-FEC2",
        "SICDT-FEC3",
        "SICDT-FEC4",
        "SICDT-FEC5",
        "SICDU-CONVENIADO-INTERNET.ear",
        "SICEM",
        "SICLI-APP",
        "SICLI-NCC",
        "SICRS",
        "SICTD-APDCTD",
        "SICTD-DIGITALIZAR-INTRANET",
        "SICTD-JKLNCTD",
        "SICTD-SERVER",
        "SICVE",
        "SICVE-ANEXO",
        "SICVE-API",
        "SICVE-TIMER",
        "SIECM-PRE-DES",
        "SIEMP",
        "SIEMP-EMPRESAS",
        "SIEVJ",
        "SIFEC",
        "SIFEC-API",
        "SIFEC-BAN",
        "SIFEC-BAN2",
        "SIFEC-BAN3",
        "SIFEC-BAN4",
        "SIFEC-BAN5",
        "SIFEC-BATCH",
        "SIFEC-BNDES-ONLINE",
        "SIFEC-CCR",
        "SIFEC-CCR-API",
        "SIFEC-CCR2",
        "SIFEC-CCR3",
        "SIFEC-CCR4",
        "SIFEC-CCR5",
        "SIFEC-CONSTRUCARD",
        "SIFEC-EMP",
        "SIFEC-EMP-MGE",
        "SIFEC-EMP2",
        "SIFEC-EMP3",
        "SIFEC-EMP4",
        "SIFEC-EMP5",
        "SIFEC-FBN4",
        "SIFEC-GARANTIAS",
        "SIFEC-GARANTIAS2",
        "SIFEC-GARANTIAS3",
        "SIFEC-GARANTIAS4",
        "SIFEC-GARANTIAS5",
        "SIFEC-INTEGRACAO",
        "SIFEC-INTEGRACAO2",
        "SIFEC-INTEGRACAO3",
        "SIFEC-INTEGRACAO4",
        "SIFEC-INTEGRACAO5",
        "SIFEC-INTERNET",
        "SIFEC-INTERNET-EMP",
        "SIFEC-IR",
        "SIFEC-MINUTA-API2",
        "SIFEC-MINUTAS-FRONT",
        "SIFEC-NOVOEX",
        "SIFEC-ORIGINACAO2",
        "SIFEC-ORIGINACAO3",
        "SIFEC-ORIGINACAO5",
        "SIFEC-PEN",
        "SIFEC-RURAL",
        "SIFEC-RURAL2",
        "SIFEC-RURAL3",
        "SIFEC-RURAL4",
        "SIFEC-RURAL5",
        "SIFEC2",
        "SIFEC3",
        "SIFEC4",
        "SIFEC5",
        "SIFEC6",
        "SIFEC_ADDR",
        "SIFES",
        "SIFES-INTERNET",
        "SIFES2",
        "SIFES3",
        "SIFES4",
        "SIGCH",
        "SIGCR",
        "SIGCT",
        "SIGDF",
        "SIGDP",
        "SIGDR",
        "SIGEC-COMERCIAL",
        "SIGFI_ECR",
        "SIGRR_vTMP-JBOSS_EAP.9.ear",
        "SIGTC",
        "SILCR",
        "SINAD",
        "SINAF-VALIDADOR",
        "SINAF2-PRD-LEGADO",
        "SINAFWEB",
        "SIOPI-INTRANET",
        "SIOPI-JDBC-SYBASE-jconn3.jar",
        "SIOPI-WS",
        "SIOTP",
        "SIOUV",
        "SIPEN",
        "SIPES",
        "SIPGE",
        "SIPLD",
        "SIPLD-NARQ",
        "SIPLD-TESTE",
        "SIPMC-INTERNET",
        "SIPMC-INTRANET",
        "SIPON",
        "SIPRC",
        "SIRCL",
        "SIRIC",
        "SIRTA",
        "SIRTA2",
        "SIRUR",
        "SIRUR-INTERNET",
        "SIRUR2",
        "SISDU",
        "SISRS",
        "SITAH-MON",
        "SIVEP",
        "SIWIC",
        "SQLSERVER-sqljdbc4.jar",
        "conppwextratorjb.ear",
        "conppwservice.ear",
        "consoleppware.ear",
        "framework-2.0.1-des.jar",
        "framework_sisgd-1.0.0",
        "guia.ear",
        "idmsjdbc-17.1.4.0.jar",
        "idmsjdbc.jar",
        "jconn4.jar",
        "jconn42.jar",
        "ojdbc6-11.2.0.4.0.jar",
        "ojdbc6.jar",
        "ojdbc7-12.1.0.2.jar",
        "ojdbc8-19.19.0.0.jar",
        "postgresql-42.2.22.jre7.jar",
        "postgresql-42.2.29.jar",
        "postgresql-42.2.29.jre7.jar",
        "postgresql-42.6.0.jar",
        "postgresql-9.0-801.jdbc4.jar",
        "postgresql-9.1-901-1.jdbc4.jar",
        "postgresql-9.4.1212.jre7.jar",
        "sicdu-cliente.ear",
        "sicdu-conveniado.ear",
        "siefi-ear.ear",
        "siico.ear",
        "sipag_des.ear",
        "sisgdinternet.ear",
        "sitah_pmcmv_V1.0.8.8.ear",
        "wmq.jmsra-7.0.1.12-transaction.rar",
        "wmq.jmsra-7.5.0.8.rar",
        "wmq.jmsra.rar"
    ]
}

[domain@localhost:9999 /] /server-group=sifec-intranet:read-children-names(child-type=deployment)
{
    "outcome" => "success",
    "result" => [
        "SICCR-BDCAIXA",
        "SICCR-HUB-FRONTEND",
        "SICCR-PJ",
        "SICDT-FEC",
        "SIFEC",
        "SIFEC-CCR",
        "SIFEC-FBN4",
        "SIFEC-MINUTAS-FRONT",
        "SQLSERVER-sqljdbc4.jar",
        "framework-2.0.1-des.jar",
        "framework_sisgd-1.0.0",
        "idmsjdbc-17.1.4.0.jar",
        "idmsjdbc.jar",
        "jconn4.jar",
        "jconn42.jar",
        "ojdbc6.jar",
        "ojdbc7-12.1.0.2.jar",
        "ojdbc8-19.19.0.0.jar",
        "wmq.jmsra.rar"
    ]
}

[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] deploy --name=SIFEC-RURAL4 --server-groups=sifec-intranet
{"WFLYDC0074: Operation failed or was rolled back on all servers. Server failures:" => {"server-group" => {"sifec-intranet" => {"host" => {"hc_cbrdeapllx473" => {"sifec-intranet_node1_lx47
3" => {"WFLYCTL0062: A operação de composição falhou e foi revertida. Segue abaixo as etapas que falharam:" => {"Operação step-2" => {"WFLYCTL0080: Falha de serviços" => {"jboss.deployment.subunit.\"
rural-2.115.1.1-b2421.ear\".\"rural-web.war\".undertow-deployment" => "java.lang.RuntimeException: RESTEASY003940: Unable to instantiate MessageBodyReader
    Caused by: java.lang.RuntimeException: RESTEASY003940: Unable to instantiate MessageBodyReader
    Caused by: org.jboss.weld.exceptions.AmbiguousResolutionException: WELD-001318: Cannot resolve an ambiguous dependency between:
  - Managed Bean [class com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider] with qualifiers [@Any @Default],
  - Managed Bean [class com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider] with qualifiers [@Any @Default]"}}}}}}}}}}

[domain@localhost:9999 /] /server-group=sifec-intranet/deployment=SIFEC-RURAL4:deploy
{
    "outcome" => "failed",
    "failure-description" => {"domain-failure-description" => "WFLYCTL0216: Management resource '[
    (\"server-group\" => \"sifec-intranet\"),
    (\"deployment\" => \"SIFEC-RURAL4\")
]' not found"},
    "rolled-back" => true
}

[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
