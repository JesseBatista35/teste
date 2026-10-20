
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$ grep -nE "ERROR|FATAL|OPVDX|WFLYCTL|Unexpected" /opt/jboss-eap/standalone/log/server.log | tail -30
11:     co.elastic.apm.agent.shaded.slf4j.simpleLogger.log.co.elastic.apm = ERROR
105:2026-10-20 14:06:43,525 ERROR [org.jboss.as.controller] (Controller Boot Thread)
107:OPVDX001: erro de validação em standalone-full-ha.xml --------------------------
112:|       ^^^^ Unexpected element '{urn:jboss:domain:modcluster:5.0}subsystem'
120:| > Message: Unexpected element
125:2026-10-20 14:06:43,526 ERROR [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0055: Foi vista uma exceção durante a inicialização: org.jboss.as.controller.persistence.ConfigurationPersistenceException: WFLYCTL0085: Falha ao pesquisar a configuração
131:2026-10-20 14:06:43,527 FATAL [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0056: A inicialização do servidor falhou numa maneira irrecuperável: encerrando. Consulte mensagens anteriores para maiores detalhes.
143:    co.elastic.apm.agent.shaded.slf4j.simpleLogger.log.co.elastic.apm = ERROR
237:2026-10-20 14:10:22,636 ERROR [org.jboss.as.controller] (Controller Boot Thread)
239:OPVDX001: erro de validação em standalone-full-ha.xml --------------------------
244:|       ^^^^ Unexpected element '{urn:jboss:domain:modcluster:5.0}subsystem'
252:| > Message: Unexpected element
257:2026-10-20 14:10:22,636 ERROR [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0055: Foi vista uma exceção durante a inicialização: org.jboss.as.controller.persistence.ConfigurationPersistenceException: WFLYCTL0085: Falha ao pesquisar a configuração
263:2026-10-20 14:10:22,637 FATAL [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0056: A inicialização do servidor falhou numa maneira irrecuperável: encerrando. Consulte mensagens anteriores para maiores detalhes.
275:    co.elastic.apm.agent.shaded.slf4j.simpleLogger.log.co.elastic.apm = ERROR
370:2026-10-20 15:01:25,902 ERROR [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0362: As funcionalidades exigidas pelo recurso '/subsystem=modcluster/proxy=default' não estão disponíveis:
373:2026-10-20 15:01:25,905 FATAL [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0056: A inicialização do servidor falhou numa maneira irrecuperável: encerrando. Consulte mensagens anteriores para maiores detalhes.
385:    co.elastic.apm.agent.shaded.slf4j.simpleLogger.log.co.elastic.apm = ERROR
480:2026-10-20 15:05:06,268 ERROR [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0362: As funcionalidades exigidas pelo recurso '/subsystem=modcluster/proxy=default' não estão disponíveis:
483:2026-10-20 15:05:06,272 FATAL [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0056: A inicialização do servidor falhou numa maneira irrecuperável: encerrando. Consulte mensagens anteriores para maiores detalhes.
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$ grep -nE "ERROR|FATAL|OPVDX|WFLYCTL" /logs/jboss/jboss-eap/standalone/sigsj-intranet/server.log | tail -30
grep: /logs/jboss/jboss-eap/standalone/sigsj-intranet/server.log: Arquivo ou diretório inexistente
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$ grep -n "modcluster" /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml | head
5:        <extension module="org.jboss.as.modcluster"/>
455:        <subsystem xmlns="urn:jboss:domain:modcluster:5.0">
456:            <proxy name="default" advertise-socket="modcluster" listener="ajp">
[p585600@caddeapllx955 ~]$
