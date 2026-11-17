
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$ sudo grep -n "Keycloak subsystem override for deployment ccr-api" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | tail -2

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

[sudo] password for p585600:
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$




-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ sudo find /logs/jboss-eap/hc/servers/sifec-intranet5_lx0067 /opt/jboss/jboss-eap/hc/servers/sifec-intranet5_lx0067/log -name "server.log*" 2>/dev/null | head
/logs/jboss-eap/hc/servers/sifec-intranet5_lx0067/server.log
/logs/jboss-eap/hc/servers/sifec-intranet5_lx0067/server.log.1
/logs/jboss-eap/hc/servers/sifec-intranet5_lx0067/server.log.2
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ sudo grep -nE "AdapterTokenVerifier|publicKey|kid:|Unauthorized" $(sudo find /logs/jboss-eap/hc/servers/sifec-intranet5_lx0067 /opt/jboss/jboss-eap/hc/servers/sifec-intranet5_lx0067/log -name "server.log*" 2>/dev/null) | tail -20
-sh-4.1$
-sh-4.1$
-sh-4.1$ sudo grep -nE "Keycloak subsystem override|ccr-api" $(sudo find /logs/jboss-eap/hc/servers/sifec-intranet5_lx0067 /opt/jboss/jboss-eap/hc/servers/sifec-intranet5_lx0067/log -name "server.log*" 2>/dev/null) | tail -10
/logs/jboss-eap/hc/servers/sifec-intranet5_lx0067/server.log.3:6433:15:42:52,237 INFO  [org.jboss.keycloak] (MSC service thread 1-5) Keycloak subsystem override for deployment sifec-cdt-web.war
/logs/jboss-eap/hc/servers/sifec-intranet5_lx0067/server.log.3:6475:15:42:52,636 INFO  [org.jboss.keycloak] (MSC service thread 1-1) Keycloak subsystem override for deployment sicdt-orig-api-rest.war
/logs/jboss-eap/hc/servers/sifec-intranet5_lx0067/server.log.3:7719:15:43:33,870 INFO  [org.jboss.web] (ServerService Thread Pool -- 101) JBAS018210: Registra o contexto da web: /ccr-api
/logs/jboss-eap/hc/servers/sifec-intranet5_lx0067/server.log.3:8231:15:43:39,605 INFO  [org.rhq.helpers.rtfilter.filter.RtFilter] (ServerService Thread Pool -- 101) Initialized response-time filter for webapp with context root 'ccr-api'.
/logs/jboss-eap/hc/servers/sifec-intranet5_lx0067/server.log.3:8232:15:43:39,606 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/ccr-api]] (ServerService Thread Pool -- 101) FilterLog initialized
/logs/jboss-eap/hc/servers/sifec-intranet5_lx0067/server.log.3:8235:15:43:44,846 INFO  [org.rhq.helpers.rtfilter.filter.RtFilter] (ajp-/10.116.94.187:10859-6) -- Filter openFile: Writing response-time log for webapp with context root 'ccr-api' to '/logs/jboss-eap/hc/servers/sifec-intranet5_lx0067/rt/sifec5.des.caixa_ccr-api_rt.log' (hashCode=255721693)...
/logs/jboss-eap/hc/servers/sifec-intranet5_lx0067/server.log.3:72115:15:44:52,505 INFO  [br.gov.caixa.ccr.negocio.api.simulacao.SimulacaoCreditoConsignadoBean] (ajp-/10.116.94.187:10859-6) [GL:cli-web-pnc#ccr-api#simularCreditoConsignadoTombamento#INICIO#25721916109]
/logs/jboss-eap/hc/servers/sifec-intranet5_lx0067/server.log.3:72116:15:44:52,505 INFO  [br.gov.caixa.ccr.negocio.api.simulacao.SimulacaoCreditoConsignadoBean] (ajp-/10.116.94.187:10859-6) [GL:cli-web-pnc#ccr-api#simularCreditoConsignadoTombamento#INICIO#25721916109]
/logs/jboss-eap/hc/servers/sifec-intranet5_lx0067/server.log.3:73267:15:45:07,376 INFO  [br.gov.caixa.ccr.negocio.api.simulacao.SimulacaoCreditoConsignadoBean] (ajp-/10.116.94.187:10859-7) [GL:cli-web-pnc#ccr-api#simularCreditoConsignadoTombamento#INICIO#25721916109]
/logs/jboss-eap/hc/servers/sifec-intranet5_lx0067/server.log.3:73268:15:45:07,376 INFO  [br.gov.caixa.ccr.negocio.api.simulacao.SimulacaoCreditoConsignadoBean] (ajp-/10.116.94.187:10859-7) [GL:cli-web-pnc#ccr-api#simularCreditoConsignadoTombamento#INICIO#25721916109]
-sh-4.1$
-sh-4.1$
-sh-4.1$
