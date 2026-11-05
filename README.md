deploy --name=SICCR-PJ --server-groups=sifec-intranet
deployment-info --name=SICCR-PJ



[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
(failed reverse-i-search)`conee': ./jboss-cli.sh --^Cnect
[root@cbrdeapllx471 p585600]# /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=localhost:9999
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] deployment-info --name=SICCR-PJ
NAME     RUNTIME-NAME
SICCR-PJ workflow-credito-pj-ear-8.40.1-20261105.100217-6.ear

SERVER-GROUP    STATE
siemp           not added
sifec-intranet  enabled
sifec-intranet2 not added
sipen           not added

[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]




p585600@10.116.97.79's password:
Last login: Wed Nov  4 17:01:55 2026 from 10.122.150.31
[p585600@cbrdeapllx473 ~]$ sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -iE --line-buffered "workflow-credito|WFLYSRV0010|WFLYSRV0021|WELD-001408|QuerySyntax|faltam|Registered web context"

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

[sudo] password for p585600:
10:01:14,609 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 128) WFLYUT0021: Contexto web registrado: '/workflow-credito-pj-web' para servidor 'default-server'
10:01:14,637 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 103) WFLYSRV0010: "SICCR-PJ" foi implantado (runtime-name: "workflow-credito-pj-ear-8.40.1-20261105.100217-6.ear")

