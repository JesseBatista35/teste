/server-group=sifec-intranet:reload-servers(blocking=true)
/host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473:read-attribute(name=server-state)

Dá para aproveitar a mesma parada para a truststore do RURAL, já que ela também precisa de restart. Se a sala liberar, primeiro monte a truststore (passos 1 a 4 de ontem, com os certificados que já estão em /tmp/certs no 473), aponte a propriedade e use restart-servers no lugar do reload-servers. O restart aplica as duas mudanças de uma vez:

/server-group=sifec-intranet:restart-servers(blocking=true)

Se preferir resolver só o PJ agora, faça apenas o reload-servers, e o RURAL fica para depois.

Depois que subir (running):

No 473, confirme que SIFEC e SICCR-PJ subiram:
bash
   sudo grep -E "WFLYSRV0010|WFLYSRV0021|WFLYSRV0025" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | tail -12
Peça para o Pablo testar a lista de clientes do PJ.
No 476, confirme que a API passou a devolver conteúdo:
bash
   sudo grep "workflow-credito-pj-web/api/perfil-acesso-usuario" /logs/apache2/SIFEC-INTRANET/sifec1.des.caixa-access.log | tail -3
Como o Claude está se saindo nesta sessão?



p585600@cbrdeapllx476 ~]$  sudo grep "workflow-credito-pj-web/api/perfil-acesso-usuario" /logs/apache2/SIFEC-INTRANET/sifec1.des.caixa-access.log | tail -3

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

[sudo] password for p585600:
10.116.3.28 - - [05/Nov/2026:10:59:17 -0300] "GET /workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793887157391 HTTP/1.1" 200 - "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:140.0) Gecko/20100101 Firefox/140.0" - 200 0 246 1139
10.116.3.26 - - [05/Nov/2026:10:59:17 -0300] "GET /workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793887157391 HTTP/1.1" 200 - "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:140.0) Gecko/20100101 Firefox/140.0" - 200 0 246 933
10.116.3.20 - - [05/Nov/2026:10:59:17 -0300] "GET /workflow-credito-pj-web/api/perfil-acesso-usuario?z=1793887157392 HTTP/1.1" 200 - "https://migracaosifec.des.caixa/fec-web/" "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:140.0) Gecko/20100101 Firefox/140.0" - 200 0 246 879
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$



[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] /server-group=sifec-intranet:reload-servers(blocking=true)
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


[p585600@cbrdeapllx473 ~]$  sudo grep -E "WFLYSRV0010|WFLYSRV0021|WFLYSRV0025" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | tail -12

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

[sudo] password for p585600:
11:00:41,617 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "jconn4.jar" foi implantado (runtime-name: "jconn4.jar")
11:00:41,617 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "jconn42.jar" foi implantado (runtime-name: "jconn42.jar")
11:00:41,617 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "ojdbc6.jar" foi implantado (runtime-name: "ojdbc6.jar")
11:00:41,617 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "ojdbc7-12.1.0.2.jar" foi implantado (runtime-name: "ojdbc7-12.1.0.2.jar")
11:00:41,617 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "ojdbc8-19.19.0.0.jar" foi implantado (runtime-name: "ojdbc8-19.19.0.0.jar")
11:00:41,617 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "wmq.jmsra.rar" foi implantado (runtime-name: "wmq.jmsra.rar")
11:00:41,617 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SICCR-BDCAIXA" foi implantado (runtime-name: "sifec-bdcaixa-2.0.1-b39.ear")
11:00:41,617 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SICCR-HUB-FRONTEND" foi implantado (runtime-name: "hub-web-1.4.0-b378.ear")
11:00:41,617 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SIFEC-MINUTAS-FRONT" foi implantado (runtime-name: "gerenciador-minutas-web-1.0.0-b14.ear")
11:00:41,617 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SQLSERVER-sqljdbc4.jar" foi implantado (runtime-name: "SQLSERVER-sqljdbc4.jar")
11:00:41,617 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SIFEC-CCR" foi implantado (runtime-name: "SIFEC-CCR-6.3.0-b4587.ear")
11:00:41,636 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: JBoss EAP 7.4.23.GA (WildFly Core 15.0.43.Final-redhat-00001) iniciado em 14799ms - Iniciado(s) 12994 de serviços 13267 (os serviços 588 estão lentos, passivos ou sob demanda)
[p585600@cbrdeapllx473 ~]$




