585600@cbrdeapllx471 ~]$
[p585600@cbrdeapllx471 ~]$ awk 'NR<=1592 && /<profile name=/ {l=$0} NR==1592 {print l; exit}' /opt/jboss/jboss-eap/dc/configuration/domain.xml
        <profile name="full-ha-sifec-intranet">
[p585600@cbrdeapllx471 ~]$
[p585600@cbrdeapllx471 ~]$
[p585600@cbrdeapllx471 ~]$
[p585600@cbrdeapllx471 ~]$ sudo su

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

[sudo] password for p585600:
[root@cbrdeapllx471 p585600]# /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=localhost:9999
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] /server-group=sifec-intranet/system-property=SICCR_HUB_WS_SERPRO_PROTOCOLO:add(value="https")
{
    "outcome" => "success",
    "result" => undefined,
    "server-groups" => {"sifec-intranet" => {"host" => {"hc_cbrdeapllx473" => {"sifec-intranet_node1_lx473" => {"response" => {
        "outcome" => "success",
        "result" => undefined
    }}}}}}
}

[domain@localhost:9999 /] /server-group=sifec-intranet/system-property=SICCR_HUB_WS_SERPRO_HOST:add(value="hom5.siapenet.gov.br")
{
    "outcome" => "success",
    "result" => undefined,
    "server-groups" => {"sifec-intranet" => {"host" => {"hc_cbrdeapllx473" => {"sifec-intranet_node1_lx473" => {"response" => {
        "outcome" => "success",
        "result" => undefined
    }}}}}}
}

[domain@localhost:9999 /] /server-group=sifec-intranet/system-property=SICCR_HUB_WS_SERPRO_URL_BASE:add(value="/wssiapeconsig")
{
    "outcome" => "success",
    "result" => undefined,
    "server-groups" => {"sifec-intranet" => {"host" => {"hc_cbrdeapllx473" => {"sifec-intranet_node1_lx473" => {"response" => {
        "outcome" => "success",
        "result" => undefined
    }}}}}}
}

[domain@localhost:9999 /] /server-group=sifec-intranet/system-property=SICCR_HUB_WS_SERPRO_CD_CONSIGNATARIA:add(value="104")
{
    "outcome" => "success",
    "result" => undefined,
    "server-groups" => {"sifec-intranet" => {"host" => {"hc_cbrdeapllx473" => {"sifec-intranet_node1_lx473" => {"response" => {
        "outcome" => "success",
        "result" => undefined
    }}}}}}
}

[domain@localhost:9999 /] /server-group=sifec-intranet/system-property=SICCR_HUB_WS_SERPRO_CD_PASSWORD_CONSIGNATARIA:add(value="UB15W3NUCO")
{
    "outcome" => "success",
    "result" => undefined,
    "server-groups" => {"sifec-intranet" => {"host" => {"hc_cbrdeapllx473" => {"sifec-intranet_node1_lx473" => {"response" => {
        "outcome" => "success",
        "result" => undefined
    }}}}}}
}

[domain@localhost:9999 /] /server-group=sifec-intranet/system-property=SICCR_HUB_WS_DB1_PROTOCOLO:add(value="https")
{
    "outcome" => "success",
    "result" => undefined,
    "server-groups" => {"sifec-intranet" => {"host" => {"hc_cbrdeapllx473" => {"sifec-intranet_node1_lx473" => {"response" => {
        "outcome" => "success",
        "result" => undefined
    }}}}}}
}

[domain@localhost:9999 /] /server-group=sifec-intranet/system-property=SICCR_HUB_WS_DB1_HOST:add(value="www1.consignet.com.br")
{
    "outcome" => "success",
    "result" => undefined,
    "server-groups" => {"sifec-intranet" => {"host" => {"hc_cbrdeapllx473" => {"sifec-intranet_node1_lx473" => {"response" => {
        "outcome" => "success",
        "result" => undefined
    }}}}}}
}

[domain@localhost:9999 /] /server-group=sifec-intranet/system-property=SICCR_HUB_WS_DB1_PORTA:add(value="8585")
{
    "outcome" => "success",
    "result" => undefined,
    "server-groups" => {"sifec-intranet" => {"host" => {"hc_cbrdeapllx473" => {"sifec-intranet_node1_lx473" => {"response" => {
        "outcome" => "success",
        "result" => undefined
    }}}}}}
}

[domain@localhost:9999 /] /server-group=sifec-intranet/system-property=SICCR_HUB_WS_DB1_URL_BASE:add(value="/DB1ConsignetWebService")
{
    "outcome" => "success",
    "result" => undefined,
    "server-groups" => {"sifec-intranet" => {"host" => {"hc_cbrdeapllx473" => {"sifec-intranet_node1_lx473" => {"response" => {
        "outcome" => "success",
        "result" => undefined
    }}}}}}
}

[domain@localhost:9999 /] /server-group=sifec-intranet/system-property=SICCR_HUB_WS_DB1_USUARIO:add(value="TESTE_INTEGRADO@CAIXA")
{
    "outcome" => "success",
    "result" => undefined,
    "server-groups" => {"sifec-intranet" => {"host" => {"hc_cbrdeapllx473" => {"sifec-intranet_node1_lx473" => {"response" => {
        "outcome" => "success",
        "result" => undefined
    }}}}}}
}

[domain@localhost:9999 /] /server-group=sifec-intranet/system-property=SICCR_HUB_WS_DB1_PASSWORD:add(value="46e25a8be134eee544fcc68c9ddbf10f")
{
    "outcome" => "success",
    "result" => undefined,
    "server-groups" => {"sifec-intranet" => {"host" => {"hc_cbrdeapllx473" => {"sifec-intranet_node1_lx473" => {"response" => {
        "outcome" => "success",
        "result" => undefined
    }}}}}}
}

[domain@localhost:9999 /] run-batch
The batch failed with the following error (you are remaining in the batch editing mode to have a chance to correct the error): Without arguments the command can be executed only in the bat
ch mode.

[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
