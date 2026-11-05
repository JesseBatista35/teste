<img width="1876" height="894" alt="image" src="https://github.com/user-attachments/assets/9a7f62a7-286c-48e8-beb9-39c745b0852c" />


[p585600@cbrdeapllx473 ~]$ sudo grep -E "WFLYSRV0010: \"(SIFEC|SICCR-PJ)\"|WFLYSRV0021" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | tail -4

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

[sudo] password for p585600:
11:00:41,614 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SICCR-PJ" foi implantado (runtime-name: "workflow-credito-pj-ear-8.40.1-20261105.100217-6.ear")
11:00:41,615 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SIFEC" foi implantado (runtime-name: "sifec-2.160.3.0.ear")
11:46:22,070 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SICCR-PJ" foi implantado (runtime-name: "workflow-credito-pj-ear-8.40.1-20261105.100217-6.ear")
11:46:22,071 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SIFEC" foi implantado (runtime-name: "sifec-2.160.3.0.ear")
[p585600@cbrdeapllx473 ~]$ sudo grep -E "WFLYSRV0010: \"(SIFEC|SICCR-PJ)\"|WFLYSRV0021" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | tail -4
11:00:41,614 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SICCR-PJ" foi implantado (runtime-name: "workflow-credito-pj-ear-8.40.1-20261105.100217-6.ear")
11:00:41,615 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SIFEC" foi implantado (runtime-name: "sifec-2.160.3.0.ear")
11:46:22,070 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SICCR-PJ" foi implantado (runtime-name: "workflow-credito-pj-ear-8.40.1-20261105.100217-6.ear")
11:46:22,071 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SIFEC" foi implantado (runtime-name: "sifec-2.160.3.0.ear")
[p585600@cbrdeapllx473 ~]$






**
[domain@localhost:9999 /] /server-group=sifec-intranet/system-property=SSO_INTRANET_SERVICE_RESOURCE_NAME:add(value=cli-ser-fec,boot-time=true)
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
[domain@localhost:9999 /] /server-group=sifec-intranet/system-property=SSO_INTRANET_SERVICE_SECRET:add(value=<SECRET-DO-PABLO>,boot-time=true)
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
[domain@localhost:9999 /] /server-group=sifec-intranet/system-property=SSO_INTRANET_SERVICE_RESOURCE_NAME:read-resource
{
    "outcome" => "success",
    "result" => {
        "boot-time" => true,
        "value" => "cli-ser-fec"
    }
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
**


