Quando o CLI responder

1. O servidor voltou?

/host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473:read-attribute(name=server-state)

Tem que vir running, e não mais reload-required.

2. As aplicações subiram? No 473:

bash
grep -aE "WFLYSRV0010|WFLYSRV0021|WFLYSRV0025|WFLYSRV0026" $LOG | tail -25
Cada aplicação ativa deve aparecer com WFLYSRV0010 ... foi implantado: SIFEC, CCR, APX, GARANTIAS, ORIGINAÇÃO, MINUTAS, BAN, SICDT, PJ, MCM, BDCAIXA, FBN4, HUB-FRONTEND2, MINUTAS-FRONT e PARÂMETROS.
No final deve vir WFLYSRV0025 (iniciado) ou WFLYSRV0026 (iniciado com erros).

3. O IDMS está ok?

/host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473/subsystem=datasources/data-source="jdbc/IdmsSiapxDS":test-connection-in-pool

Me mande as três saídas. Se der WFLYSRV0026, vemos qual aplicação não voltou.



domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] /host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473/subsystem=datasources/data-source="jdbc/IdmsSiapxDS":test-connection-in-pool
{
    "outcome" => "success",
    "result" => [true]
}

[domain@localhost:9999 /]





[root@cbrdeapllx473 p585600]#
[root@cbrdeapllx473 p585600]#
[root@cbrdeapllx473 p585600]#
[root@cbrdeapllx473 p585600]# grep -aE "WFLYSRV0010|WFLYSRV0021|WFLYSRV0025|WFLYSRV0026" $LOG | tail -25
16:31:38,347 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SIFEC-ORIGINACAO2" foi implantado (runtime-name: "sifec-originacao-3.11.1-b344.ear")
16:31:38,347 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SIFEC-GARANTIAS4" foi implantado (runtime-name: "garantias-1.8.0.3-b183.ear")
16:31:38,347 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SIAPX_JavaWeb" foi implantado (runtime-name: "sifec-apx-1.7.9.4-b40.ear")
16:31:38,347 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SICCR-PARAMETROS" foi implantado (runtime-name: "sifec-ccr-parametros.ear")
16:31:38,347 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SIFEC" foi implantado (runtime-name: "sifec-2.161.2.0.ear")
16:31:38,347 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SIBAN-MCM" foi implantado (runtime-name: "mcm-1.0.1.23-b47.ear")
16:31:38,347 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SICCR-HUB-FRONTEND2" foi implantado (runtime-name: "hub-web-1.10.0.1-b418.ear")
16:31:38,347 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "framework-2.0.1-des.jar" foi implantado (runtime-name: "framework.jar")
16:31:38,347 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "framework_sisgd-1.0.0" foi implantado (runtime-name: "framework_sisgd.jar")
16:31:38,347 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "idmsjdbc-17.1.4.0.jar" foi implantado (runtime-name: "idmsjdbc-17.1.4.0.jar")
16:31:38,347 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "idmsjdbc.jar" foi implantado (runtime-name: "idmsjdbc.jar")
16:31:38,347 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "jconn4.jar" foi implantado (runtime-name: "jconn4.jar")
16:31:38,347 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "jconn42.jar" foi implantado (runtime-name: "jconn42.jar")
16:31:38,347 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "ojdbc6.jar" foi implantado (runtime-name: "ojdbc6.jar")
16:31:38,347 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "ojdbc7-12.1.0.2.jar" foi implantado (runtime-name: "ojdbc7-12.1.0.2.jar")
16:31:38,347 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "ojdbc8-19.19.0.0.jar" foi implantado (runtime-name: "ojdbc8-19.19.0.0.jar")
16:31:38,347 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "wmq.jmsra.rar" foi implantado (runtime-name: "wmq.jmsra.rar")
16:31:38,347 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SICCR-BDCAIXA" foi implantado (runtime-name: "sifec-bdcaixa-2.0.1-b39.ear")
16:31:38,347 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SIFEC-MINUTAS-FRONT" foi implantado (runtime-name: "gerenciador-minutas-web-1.0.0-b14.ear")
16:31:38,347 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SQLSERVER-sqljdbc4.jar" foi implantado (runtime-name: "SQLSERVER-sqljdbc4.jar")
16:31:38,347 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SIFEC-CCR" foi implantado (runtime-name: "SIFEC-CCR-6.3.0-b4587.ear")
16:31:38,347 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SIFEC-FBN4" foi implantado (runtime-name: "sifec-fbn-1.0.1.0-b84.ear")
16:31:38,347 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SICCR-PJ" foi implantado (runtime-name: "workflow-credito-pj-ear-8.40.1-20261105.202759-10.ear")
16:31:38,347 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SICDT-FEC" foi implantado (runtime-name: "sifec-cdt-3.24.3.004.ear")
16:31:38,410 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: JBoss EAP 7.4.23.GA (WildFly Core 15.0.43.Final-redhat-00001) iniciado em 57584ms - Iniciado(s) 23386 de serviços 23661 (os serviços 713 estão lentos, passivos ou sob demanda)
[root@cbrdeapllx473 p585600]#
[root@cbrdeapllx473 p585600]#
[root@cbrdeapllx473 p585600]#
[root@cbrdeapllx473 p585600]#
[root@cbrdeapllx473 p585600]#
[root@cbrdeapllx473 p585600]#

