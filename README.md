/server-group=sifec-intranet:reload-servers(blocking=true)

sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -iE --line-buffered "WFLYSRV0025|WFLYSRV0010|ERROR"

sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -iE --line-buffered "WFLYSRV0025|WFLYSRV0010|ERROR"

/host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473:read-attribute(name=server-state)





[domain@localhost:9443 /] /server-group=sifec-intranet:reload-servers(blocking=true)
{
    "outcome" => "success",
    "result" => undefined,
    "server-groups" => undefined
}

[domain@localhost:9443 /]
[domain@localhost:9443 /]
[domain@localhost:9443 /]
[domain@localhost:9443 /]
[domain@localhost:9443 /] sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -iE --line-buffered "WFLYSRV0025|WFLYSRV0010|ERROR"
Unexpected command 'sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -iE --line-buffered "WFLYSRV0025|WFLYSRV0010|ERROR"'. Type 'help --comma
nds' for the list of supported commands.

[domain@localhost:9443 /]
[domain@localhost:9443 /]
[domain@localhost:9443 /] /host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473:read-attribute(name=server-state)
{
    "outcome" => "success",
    "result" => "running"
}

[domain@localhost:9443 /]
[domain@localhost:9443 /]
[domain@localhost:9443 /]
[domain@localhost:9443 /]






    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

[sudo] password for p585600:
15:34:18,317 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "ojdbc7-12.1.0.2.jar" foi implantado (runtime-name: "ojdbc7-12.1.0.2.jar")
15:34:18,317 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "ojdbc8-19.19.0.0.jar" foi implantado (runtime-name: "ojdbc8-19.19.0.0.jar")
15:34:18,317 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "wmq.jmsra.rar" foi implantado (runtime-name: "wmq.jmsra.rar")
15:34:18,317 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SICCR-BDCAIXA" foi implantado (runtime-name: "sifec-bdcaixa-2.0.1-b39.ear")
15:34:18,317 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SICCR-HUB-FRONTEND" foi implantado (runtime-name: "hub-web-1.4.0-b378.ear")
15:34:18,317 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SIFEC-MINUTAS-FRONT" foi implantado (runtime-name: "gerenciador-minutas-web-1.0.0-b14.ear")
15:34:18,317 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SQLSERVER-sqljdbc4.jar" foi implantado (runtime-name: "SQLSERVER-sqljdbc4.jar")
15:34:18,317 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SIFEC-CCR" foi implantado (runtime-name: "SIFEC-CCR-6.3.0-b4587.ear")
15:34:18,342 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: JBoss EAP 7.4.23.GA (WildFly Core 15.0.43.Final-redhat-00001) iniciado em 10543ms - Iniciado(s) 9224 de serviços 9493 (os serviços 574 estão lentos, passivos ou sob demanda)
^C
[p585600@cbrdeapllx473 ~]$ sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -iE --line-buffered "WFLYSRV0025|WFLYSRV0010|ERROR"
15:34:18,317 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "ojdbc7-12.1.0.2.jar" foi implantado (runtime-name: "ojdbc7-12.1.0.2.jar")
15:34:18,317 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "ojdbc8-19.19.0.0.jar" foi implantado (runtime-name: "ojdbc8-19.19.0.0.jar")
15:34:18,317 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "wmq.jmsra.rar" foi implantado (runtime-name: "wmq.jmsra.rar")
15:34:18,317 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SICCR-BDCAIXA" foi implantado (runtime-name: "sifec-bdcaixa-2.0.1-b39.ear")
15:34:18,317 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SICCR-HUB-FRONTEND" foi implantado (runtime-name: "hub-web-1.4.0-b378.ear")
15:34:18,317 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SIFEC-MINUTAS-FRONT" foi implantado (runtime-name: "gerenciador-minutas-web-1.0.0-b14.ear")
15:34:18,317 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SQLSERVER-sqljdbc4.jar" foi implantado (runtime-name: "SQLSERVER-sqljdbc4.jar")
15:34:18,317 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SIFEC-CCR" foi implantado (runtime-name: "SIFEC-CCR-6.3.0-b4587.ear")
15:34:18,342 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: JBoss EAP 7.4.23.GA (WildFly Core 15.0.43.Final-redhat-00001) iniciado em 10543ms - Iniciado(s) 9224 de serviços 9493 (os serviços 574 estão lentos, passivos ou sob demanda)

