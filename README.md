
Verificar motivo do POD no OKD4 por conta de não encontrar a URL do login caixa.

Prezados,

Não está subindo o POD no OKD4 por conta de não encontrar a URL do login caixa.

2026-09-14T14:09:17.5489172Z 2026-09-14 11:08:01,726 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.messaging.request-scoped.enabled" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-09-14T14:09:17.5489830Z 2026-09-14 11:08:04,040 WARN  [io.qua.oid.com.run.OidcCommonUtils] (vert.x-eventloop-thread-1) Discovery request https://logindes.caixa.gov.br/auth/realms/internet/.well-known/openid-configuration has failed, status code: 404
2026-09-14T14:09:17.5490489Z 2026-09-14 11:08:04,047 WARN  [io.qua.oid.com.run.OidcCommonUtils] (vert.x-eventloop-thread-1) OIDC Server is not available:: io.quarkus.oidc.common.runtime.OidcEndpointAccessException
2026-09-14T14:09:17.5490819Z 	at io.quarkus.oidc.common.runtime.OidcCommonUtils.lambda$doDiscoverMetadata$5(OidcCommonUtils.java:604)
2026-09-14T14:09:17.5491123Z 	at io.smallrye.context.impl.wrappers.SlowContextualFunction.apply(SlowContextualFunction.java:21)
2026-09-14T14:09:17.5491497Z 	at io.smallrye.mutiny.operators.uni.UniOnItemTransform$UniOnItemTransformProcessor.onItem(UniOnItemTransform.java:36)
2026-09-14T14:09:17.5491792Z 	at io.smallrye.mutiny.vertx.AsyncResultUni.lambda$subscribe$1(AsyncResultUni.java:35)
2026-09-14T14:09:17.5492053Z 	at io.smallrye.mutiny.vertx.DelegatingHandler.handle(DelegatingHandler.java:25)
2026-09-14T14:09:17.5492314Z 	at io.vertx.ext.web.client.impl.HttpContext.handleDispatchResponse(HttpContext.java:403)
2026-09-14T14:09:17.5492605Z 	at io.vertx.ext.web.client.impl.HttpContext.execute(HttpContext.java:385)
2026-09-14T14:09:17.5492864Z 	at io.vertx.ext.web.client.impl.HttpContext.next(HttpContext.java:363)
2026-09-14T14:09:17.5493105Z 	at io.vertx.ext.web.client.impl.HttpContext.fire(HttpContext.java:330)
2026-09-14T14:09:17.5493349Z 	at io.vertx.ext.web.client.impl.HttpContext.dispatchResponse(HttpContext.java:292)



fiz um start rolout pod rodando com sucesso

simtx-transferegov-processamento-des-272-9tq6s
Running

exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.7.7.jar -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-09-14 15:58:32.923-03:00 INFO  c.m.applicationinsights.agent - Application Insights Java Agent 3.7.7 started successfully (PID 8, JVM running for 5.543 s)
2026-09-14 15:58:32.925-03:00 INFO  c.m.applicationinsights.agent - Java version: 21.0.1, vendor: Oracle Corporation, home: /usr/java/jdk-21.0.1
2026-09-14 15:58:38.143-03:00 WARN  c.m.a.a.i.p.PerformanceMonitoringService - INITIALISING JFR PROFILING SUBSYSTEM THIS FEATURE IS IN BETA
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-09-14 15:58:40,329 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.messaging.request-scoped.enabled" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-09-14 15:58:47,025 WARN  [io.sma.rea.mes.jms] (main) Please add one of the additional mapping modules (-jsonb or -jackson) to be able to (de)serialize JSON messages.
2026-09-14 15:58:47,925 INFO  [io.sma.rea.mes.jms] (main) SRMSG15801: Creating queue SIMTX.REQ.TRANSFEREGOV_PROCESSAMENTO
2026-09-14 15:58:49,950 INFO  [io.sma.rea.mes.provider] (main) SRMSG00231: Incoming channel `transacao-assinada` disabled by configuration
2026-09-14 15:58:49,975 WARN  [io.sma.rea.mes.provider] (main) SRMSG00207: Some components are not connected to either downstream consumers or upstream producers:
	- SubscriberMethod{method:'br.gov.caixa.simtx.lib.core.mq.transacaoassinada.TransacaoAssinadaConsumer#consume', incoming:'transacao-assinada'} has no upstream

2026-09-14 15:58:50,045 INFO  [br.gov.cai.sim.lib.cor.mq.con.JmsConnectionLogger] (main) [JMS Config] ========== Configuracao MQ ==========
2026-09-14 15:58:50,045 INFO  [br.gov.cai.sim.lib.cor.mq.con.JmsConnectionLogger] (main) [JMS Config]   hostname .................. ibmspdes.caixa
2026-09-14 15:58:50,045 INFO  [br.gov.cai.sim.lib.cor.mq.con.JmsConnectionLogger] (main) [JMS Config]   port ...................... 1420
2026-09-14 15:58:50,046 INFO  [br.gov.cai.sim.lib.cor.mq.con.JmsConnectionLogger] (main) [JMS Config]   queuemanager .............. QSDA
2026-09-14 15:58:50,046 INFO  [br.gov.cai.sim.lib.cor.mq.con.JmsConnectionLogger] (main) [JMS Config]   channel ................... SIMTX.SVRCONN
2026-09-14 15:58:50,046 INFO  [br.gov.cai.sim.lib.cor.mq.con.JmsConnectionLogger] (main) [JMS Config]   channelsicco .............. SIMTX.CCO.SVRCONN
2026-09-14 15:58:50,046 INFO  [br.gov.cai.sim.lib.cor.mq.con.JmsConnectionLogger] (main) [JMS Config]   channelnegocial ........... -
2026-09-14 15:58:50,046 INFO  [br.gov.cai.sim.lib.cor.mq.con.JmsConnectionLogger] (main) [JMS Config]   username .................. SMTXSD01
2026-09-14 15:58:50,046 INFO  [br.gov.cai.sim.lib.cor.mq.con.JmsConnectionLogger] (main) [JMS Config]   maxpoolsize ............... 1
2026-09-14 15:58:50,046 INFO  [br.gov.cai.sim.lib.cor.mq.con.JmsConnectionLogger] (main) [JMS Config]   minpoolsize ............... 1
2026-09-14 15:58:50,046 INFO  [br.gov.cai.sim.lib.cor.mq.con.JmsConnectionLogger] (main) [JMS Config]   maxsessionsperconnection .. 300
2026-09-14 15:58:50,046 INFO  [br.gov.cai.sim.lib.cor.mq.con.JmsConnectionLogger] (main) [JMS Config]   sharingconversations ...... 300
2026-09-14 15:58:50,046 INFO  [br.gov.cai.sim.lib.cor.mq.con.JmsConnectionLogger] (main) [JMS Config]   timeoutconnection ......... 1
2026-09-14 15:58:50,047 INFO  [br.gov.cai.sim.lib.cor.mq.con.JmsConnectionLogger] (main) [JMS Config]   connectiontimeout ......... 100
2026-09-14 15:58:50,047 INFO  [br.gov.cai.sim.lib.cor.mq.con.JmsConnectionLogger] (main) [JMS Config]   receivetimeout ............ 100
2026-09-14 15:58:50,047 INFO  [br.gov.cai.sim.lib.cor.mq.con.JmsConnectionLogger] (main) [JMS Config]   poolisfulltimeout ......... 200
2026-09-14 15:58:50,047 INFO  [br.gov.cai.sim.lib.cor.mq.con.JmsConnectionLogger] (main) [JMS Config]   connectionidletimeout ..... 30000
2026-09-14 15:58:50,047 INFO  [br.gov.cai.sim.lib.cor.mq.con.JmsConnectionLogger] (main) [JMS Config]   connectioncheckinterval ... 3000
2026-09-14 15:58:50,047 INFO  [br.gov.cai.sim.lib.cor.mq.con.JmsConnectionLogger] (main) [JMS Config] ==========================================
2026-09-14 15:58:50,047 INFO  [br.gov.cai.sim.lib.cor.mq.con.JmsWarmup] (main) Criando conexoes Sicco
2026-09-14 15:58:50,061 INFO  [br.gov.cai.sim.lib.cor.mq.con.JmsConnectionFactorySicco] (main) Cria??o do pool de conexoes com a fila [SIMTX.CCO.SVRCONN] realizada com sucesso.
2026-09-14 15:58:50,121 INFO  [br.gov.cai.sim.lib.cor.mq.con.LoggingConnectionFactoryWrapper] (main) Nova conexao sendo criada no pool [SIMTX.CCO.SVRCONN]
2026-09-14 15:58:50,162 INFO  [br.gov.cai.sim.lib.cor.mq.con.JmsWarmup] (main) Warmup: conexao sicco 0 validada
2026-09-14 15:58:50,163 INFO  [br.gov.cai.sim.lib.cor.mq.con.JmsConnectionLogger] (main) [JMS Pool - sicco] Conexoes ativas: 1
2026-09-14 15:58:50,164 INFO  [br.gov.cai.sim.lib.cor.mq.con.JmsWarmup] (main) Criando conexoes Negocial
2026-09-14 15:58:50,166 INFO  [br.gov.cai.sim.lib.cor.mq.con.JmsConnectionFactory] (main) Cria??o do pool de conexoes com a fila [SIMTX.SVRCONN] realizada com sucesso.
2026-09-14 15:58:50,166 INFO  [br.gov.cai.sim.lib.cor.mq.con.LoggingConnectionFactoryWrapper] (main) Nova conexao sendo criada no pool [SIMTX.SVRCONN]
2026-09-14 15:58:50,176 INFO  [br.gov.cai.sim.lib.cor.mq.con.JmsWarmup] (main) Warmup: conexao negocial 0 validada
2026-09-14 15:58:50,176 INFO  [br.gov.cai.sim.lib.cor.mq.con.JmsConnectionLogger] (main) [JMS Pool - negocial] Conexoes ativas: 1
2026-09-14 15:58:50,343 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Iniciando Armazenamento de Dados em Cache
2026-09-14 15:58:50,344 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Buscar Canais e Armazenar em Cache
2026-09-14 15:58:50,352 INFO  [br.gov.cai.sim.lib.cor.per.rep.imp.Mtxtb004CanalRepositoryImpl] (executor-thread-1) Executando select para tabela 4
2026-09-14 15:58:50,436 INFO  [io.quarkus] (main) SIMTX-transferegov-processamento 1.1.0.5 on JVM (powered by Quarkus 3.20.2.redhat-00003) started in 17.501s. Listening on: http://0.0.0.0:8080
2026-09-14 15:58:50,436 INFO  [io.quarkus] (main) Profile prod activated. 
2026-09-14 15:58:50,436 INFO  [io.quarkus] (main) Installed features: [agroal, cache, cdi, cxf, cxf-rt-features-metrics, hibernate-orm, hibernate-validator, jdbc-oracle, messaging, narayana-jta, oidc, oidc-client, rest, rest-client, rest-client-jackson, rest-client-oidc-filter, rest-jackson, scheduler, security, smallrye-context-propagation, smallrye-health, smallrye-jwt, smallrye-metrics, smallrye-openapi, vertx]
2026-09-14 15:58:51,725 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Busca dos Vinculos de Servico e armazenamento em CACHE
2026-09-14 15:58:52,136 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb019SrvcoCnlMeioEntradaService] (executor-thread-1) Codigo de Servico: 110266, Versao do Servico: 1 Codigo do Canal: 114, Meio de Entrada: 0
2026-09-14 15:58:52,136 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb001ServicoService] (executor-thread-1) Buscando os Vinculos Entre Servico[110266], Versao[1], Canal[114] e Meio de Entrada[0] null
2026-09-14 15:58:52,380 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb019SrvcoCnlMeioEntradaService] (executor-thread-1) Codigo de Servico: 110298, Versao do Servico: 1 Codigo do Canal: 114, Meio de Entrada: 0
2026-09-14 15:58:52,380 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb001ServicoService] (executor-thread-1) Buscando os Vinculos Entre Servico[110298], Versao[1], Canal[114] e Meio de Entrada[0] null
2026-09-14 15:58:52,451 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb019SrvcoCnlMeioEntradaService] (executor-thread-1) Codigo de Servico: 110267, Versao do Servico: 1 Codigo do Canal: 114, Meio de Entrada: 0
2026-09-14 15:58:52,451 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb001ServicoService] (executor-thread-1) Buscando os Vinculos Entre Servico[110267], Versao[1], Canal[114] e Meio de Entrada[0] null
2026-09-14 15:58:52,523 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb019SrvcoCnlMeioEntradaService] (executor-thread-1) Codigo de Servico: 110297, Versao do Servico: 1 Codigo do Canal: 114, Meio de Entrada: 0
2026-09-14 15:58:52,523 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb001ServicoService] (executor-thread-1) Buscando os Vinculos Entre Servico[110297], Versao[1], Canal[114] e Meio de Entrada[0] null
2026-09-14 15:58:52,590 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb019SrvcoCnlMeioEntradaService] (executor-thread-1) Codigo de Servico: 110271, Versao do Servico: 1 Codigo do Canal: 114, Meio de Entrada: 0
2026-09-14 15:58:52,590 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb001ServicoService] (executor-thread-1) Buscando os Vinculos Entre Servico[110271], Versao[1], Canal[114] e Meio de Entrada[0] null
2026-09-14 15:58:52,666 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb019SrvcoCnlMeioEntradaService] (executor-thread-1) Codigo de Servico: 110291, Versao do Servico: 1 Codigo do Canal: 114, Meio de Entrada: 0
2026-09-14 15:58:52,667 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb001ServicoService] (executor-thread-1) Buscando os Vinculos Entre Servico[110291], Versao[1], Canal[114] e Meio de Entrada[0] null
2026-09-14 15:58:52,733 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb019SrvcoCnlMeioEntradaService] (executor-thread-1) Codigo de Servico: 110272, Versao do Servico: 1 Codigo do Canal: 114, Meio de Entrada: 0
2026-09-14 15:58:52,734 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb001ServicoService] (executor-thread-1) Buscando os Vinculos Entre Servico[110272], Versao[1], Canal[114] e Meio de Entrada[0] null
2026-09-14 15:58:52,748 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb019SrvcoCnlMeioEntradaService] (executor-thread-1) Codigo de Servico: 110275, Versao do Servico: 1 Codigo do Canal: 114, Meio de Entrada: 0
2026-09-14 15:58:52,748 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb001ServicoService] (executor-thread-1) Buscando os Vinculos Entre Servico[110275], Versao[1], Canal[114] e Meio de Entrada[0] null
2026-09-14 15:58:52,762 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb019SrvcoCnlMeioEntradaService] (executor-thread-1) Codigo de Servico: 110261, Versao do Servico: 1 Codigo do Canal: 126, Meio de Entrada: 0
2026-09-14 15:58:52,762 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb001ServicoService] (executor-thread-1) Buscando os Vinculos Entre Servico[110261], Versao[1], Canal[126] e Meio de Entrada[0] null
2026-09-14 15:58:52,777 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb019SrvcoCnlMeioEntradaService] (executor-thread-1) Codigo de Servico: 110293, Versao do Servico: 1 Codigo do Canal: 110, Meio de Entrada: 0
2026-09-14 15:58:52,777 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb001ServicoService] (executor-thread-1) Buscando os Vinculos Entre Servico[110293], Versao[1], Canal[110] e Meio de Entrada[0] null
2026-09-14 15:58:52,826 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb019SrvcoCnlMeioEntradaService] (executor-thread-1) Codigo de Servico: 110293, Versao do Servico: 1 Codigo do Canal: 126, Meio de Entrada: 0
2026-09-14 15:58:52,826 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb001ServicoService] (executor-thread-1) Buscando os Vinculos Entre Servico[110293], Versao[1], Canal[126] e Meio de Entrada[0] null
2026-09-14 15:58:52,837 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb019SrvcoCnlMeioEntradaService] (executor-thread-1) Codigo de Servico: 110263, Versao do Servico: 1 Codigo do Canal: 126, Meio de Entrada: 0
2026-09-14 15:58:52,837 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb001ServicoService] (executor-thread-1) Buscando os Vinculos Entre Servico[110263], Versao[1], Canal[126] e Meio de Entrada[0] null
2026-09-14 15:58:52,848 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb019SrvcoCnlMeioEntradaService] (executor-thread-1) Codigo de Servico: 110292, Versao do Servico: 1 Codigo do Canal: 110, Meio de Entrada: 0
2026-09-14 15:58:52,848 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb001ServicoService] (executor-thread-1) Buscando os Vinculos Entre Servico[110292], Versao[1], Canal[110] e Meio de Entrada[0] null
2026-09-14 15:58:52,853 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb019SrvcoCnlMeioEntradaService] (executor-thread-1) Codigo de Servico: 110292, Versao do Servico: 1 Codigo do Canal: 126, Meio de Entrada: 0
2026-09-14 15:58:52,853 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb001ServicoService] (executor-thread-1) Buscando os Vinculos Entre Servico[110292], Versao[1], Canal[126] e Meio de Entrada[0] null
2026-09-14 15:58:52,862 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb019SrvcoCnlMeioEntradaService] (executor-thread-1) Codigo de Servico: 110269, Versao do Servico: 1 Codigo do Canal: 126, Meio de Entrada: 0
2026-09-14 15:58:52,863 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb001ServicoService] (executor-thread-1) Buscando os Vinculos Entre Servico[110269], Versao[1], Canal[126] e Meio de Entrada[0] null
2026-09-14 15:58:52,926 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb019SrvcoCnlMeioEntradaService] (executor-thread-1) Codigo de Servico: 110289, Versao do Servico: 1 Codigo do Canal: 110, Meio de Entrada: 0
2026-09-14 15:58:52,926 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb001ServicoService] (executor-thread-1) Buscando os Vinculos Entre Servico[110289], Versao[1], Canal[110] e Meio de Entrada[0] null
2026-09-14 15:58:52,931 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb019SrvcoCnlMeioEntradaService] (executor-thread-1) Codigo de Servico: 110289, Versao do Servico: 1 Codigo do Canal: 126, Meio de Entrada: 0
2026-09-14 15:58:52,932 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb001ServicoService] (executor-thread-1) Buscando os Vinculos Entre Servico[110289], Versao[1], Canal[126] e Meio de Entrada[0] null
2026-09-14 15:58:52,941 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb019SrvcoCnlMeioEntradaService] (executor-thread-1) Codigo de Servico: 110270, Versao do Servico: 1 Codigo do Canal: 126, Meio de Entrada: 0
2026-09-14 15:58:52,942 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb001ServicoService] (executor-thread-1) Buscando os Vinculos Entre Servico[110270], Versao[1], Canal[126] e Meio de Entrada[0] null
2026-09-14 15:58:52,950 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb019SrvcoCnlMeioEntradaService] (executor-thread-1) Codigo de Servico: 110274, Versao do Servico: 1 Codigo do Canal: 126, Meio de Entrada: 0
2026-09-14 15:58:52,950 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb001ServicoService] (executor-thread-1) Buscando os Vinculos Entre Servico[110274], Versao[1], Canal[126] e Meio de Entrada[0] null
2026-09-14 15:58:52,955 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Buscar Parametros e Armazenar em Cache
2026-09-14 15:58:52,955 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Buscando Mensagens e Armazenando em Cache
2026-09-14 15:58:52,957 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Codigo da mensagem: 320
2026-09-14 15:58:53,036 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Codigo da mensagem: 324
2026-09-14 15:58:53,040 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Codigo da mensagem: 325
2026-09-14 15:58:53,044 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Codigo da mensagem: 389
2026-09-14 15:58:53,046 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Codigo da mensagem: 390
2026-09-14 15:58:53,048 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Codigo da mensagem: 326
2026-09-14 15:58:53,051 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Codigo da mensagem: 327
2026-09-14 15:58:53,053 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Codigo da mensagem: 391
2026-09-14 15:58:53,055 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Codigo da mensagem: 403
2026-09-14 15:58:53,057 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Codigo da mensagem: 408
2026-09-14 15:58:53,059 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Codigo da mensagem: 409
2026-09-14 15:58:53,062 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Codigo da mensagem: 411
2026-09-14 15:58:53,064 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Codigo da mensagem: 412
2026-09-14 15:58:53,066 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Codigo da mensagem: 353
2026-09-14 15:58:53,068 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Codigo da mensagem: 363
2026-09-14 15:58:53,071 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Codigo da mensagem: 300
2026-09-14 15:58:53,076 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Codigo da mensagem: 364
2026-09-14 15:58:53,122 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Codigo da mensagem: 301
2026-09-14 15:58:53,126 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Codigo da mensagem: 365
2026-09-14 15:58:53,131 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Codigo da mensagem: 302
2026-09-14 15:58:53,134 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Codigo da mensagem: 303
2026-09-14 15:58:53,136 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Codigo da mensagem: 367
2026-09-14 15:58:53,140 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Codigo da mensagem: 304
2026-09-14 15:58:53,143 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Codigo da mensagem: 369
2026-09-14 15:58:53,145 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Codigo da mensagem: 370
2026-09-14 15:58:53,147 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Codigo da mensagem: 306
2026-09-14 15:58:53,149 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Codigo da mensagem: 307
2026-09-14 15:58:53,151 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Codigo da mensagem: 308
2026-09-14 15:58:53,153 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Codigo da mensagem: 309
2026-09-14 15:58:53,155 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Codigo da mensagem: 310
2026-09-14 15:58:53,158 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Codigo da mensagem: 375
2026-09-14 15:58:53,160 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Codigo da mensagem: 311
2026-09-14 15:58:53,162 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Codigo da mensagem: 312
2026-09-14 15:58:53,164 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Codigo da mensagem: 313
2026-09-14 15:58:53,166 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Codigo da mensagem: 314
2026-09-14 15:58:53,168 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Codigo da mensagem: 315
2026-09-14 15:58:53,170 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Codigo da mensagem: 316
2026-09-14 15:58:53,172 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Codigo da mensagem: 317
2026-09-14 15:58:53,174 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Codigo da mensagem: 318
2026-09-14 15:58:53,176 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Codigo da mensagem: 319
2026-09-14 15:58:53,178 INFO  [br.gov.cai.sim.lib.cor.com.ser.CacheService] (executor-thread-1) Codigo da mensagem: 383
2026-09-14 16:00:03,789 INFO  [io.sma.rea.mes.pro.con.WorkerPoolRegistry] (vert.x-eventloop-thread-1) Created worker pool named pool-transferegov-processamento with concurrency of 10
2026-09-14 16:00:03,836 INFO  [br.gov.cai.sim.tra.pro.con.ProcessadorConsumer] (pool-transferegov-processamento-1) Mensagem lida da fila: {"nsuLote":73970652737,"dataLote":"2026-09-14","retentativa":true}
2026-09-14 16:00:03,845 INFO  [br.gov.cai.sim.tra.pro.pro.ser.ProcessadorLotes] (pool-transferegov-processamento-1)  ==== Recebimento de Lote Iniciada ==== 
2026-09-14 16:00:03,925 INFO  [br.gov.cai.sim.tra.pro.per.rep.Mtxtb044LoteControleRepositoryImpl] (pool-transferegov-processamento-1) Buscando lote nsuLote [ 73970652737 ] dtReferencia [ 2026-09-14 ] ...
2026-09-14 16:00:03,975 INFO  [br.gov.cai.sim.tra.pro.per.rep.Mtxtb045TransacaoLoteRepositoryImpl] (pool-transferegov-processamento-1) Buscando transacoes com situacao [ AGUARDANDO_REPROCESSAMENTO ] e situacao [ AUTORIZADA ]
2026-09-14 16:00:03,975 INFO  [br.gov.cai.sim.tra.pro.per.rep.Mtxtb045TransacaoLoteRepositoryImpl] (pool-transferegov-processamento-1) Buscando transacoes nsu [73970652737] dtReferencia [2026-09-14] situacoes [[AGUARDANDO_REPROCESSAMENTO, AUTORIZADA]]
2026-09-14 16:00:04,177 INFO  [br.gov.cai.sim.tra.pro.per.rep.Mtxtb044LoteControleRepositoryImpl] (pool-transferegov-processamento-1) Atualizando lote nsuLote [ 73970652737 ] dtReferencia [ 2026-09-14 ] situacao [ 2 ] ...
2026-09-14 16:00:04,651 INFO  [br.gov.cai.sim.lib.cor.com.ser.FluxoTransacionalService] (pool-transferegov-processamento-1) Mensagem recebida [identificadorTransacao: 1725eb56-bde2-40f9-8a9f-2a27d29573ac]
2026-09-14 16:00:04,652 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb004CanalService] (pool-transferegov-processamento-1) Buscando Canal pelo clienteId[cli-ser-mtx] [identificadorTransacao: 1725eb56-bde2-40f9-8a9f-2a27d29573ac]
2026-09-14 16:00:04,653 INFO  [br.gov.cai.sim.lib.cor.com.ser.ValidacaoService] (pool-transferegov-processamento-1) Validando campos de meio entrada [identificadorTransacao: 1725eb56-bde2-40f9-8a9f-2a27d29573ac]
2026-09-14 16:00:04,667 INFO  [br.gov.cai.sim.lib.cor.com.ser.def.FluxoTransacionalComplementoPadraoService] (pool-transferegov-processamento-1) Sem Regras Definidas!
2026-09-14 16:00:04,720 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb019SrvcoCnlMeioEntradaService] (pool-transferegov-processamento-1) Validando Vinculo de Codigo de Servico: 110298, Versao do Servico: 1, Codigo do Canal: 114, Meio de Entrada: 0 [identificadorTransacao: 1725eb56-bde2-40f9-8a9f-2a27d29573ac]
2026-09-14 16:00:04,722 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb001ServicoService] (pool-transferegov-processamento-1) Buscando os Vinculos Entre Servico[110298], Versao[1], Canal[114] e Meio de Entrada[0] [identificadorTransacao: 1725eb56-bde2-40f9-8a9f-2a27d29573ac]
2026-09-14 16:00:04,722 INFO  [br.gov.cai.sim.lib.cor.com.ser.ValidacaoService] (pool-transferegov-processamento-1) Validando Regras Negociais [identificadorTransacao: 1725eb56-bde2-40f9-8a9f-2a27d29573ac]
2026-09-14 16:00:04,723 INFO  [br.gov.cai.sim.lib.cor.com.ser.def.FluxoTransacionalComplementoPadraoService] (pool-transferegov-processamento-1) codigoTipoTransacaoRequisicao: [ 0001 ]
2026-09-14 16:00:04,724 INFO  [br.gov.cai.sim.lib.cor.com.ser.def.FluxoTransacionalComplementoPadraoService] (pool-transferegov-processamento-1) codigoTipoTransacao: [ 0001 ]
2026-09-14 16:00:04,724 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb014TransacaoService] (pool-transferegov-processamento-1) Gerando transacao [identificadorTransacao: 1725eb56-bde2-40f9-8a9f-2a27d29573ac]
2026-09-14 16:00:04,767 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb014TransacaoService] (pool-transferegov-processamento-1) NSU gerado 73970653251 [identificadorTransacao: 1725eb56-bde2-40f9-8a9f-2a27d29573ac]
2026-09-14 16:00:04,767 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb014TransacaoService] (pool-transferegov-processamento-1) Mtxtb014Transacao [nuNsuTransacao=73970653251, nuNsuTransacaoOrigem=73970652695, coCanalOrigem=114, icSituacao=0, icEnvio=0, icRetorno=0, coTransacaoExterna=null, coRetornoTransacao=null, deMensagemTransacao=null, tsAtualizacao=2026-09-14T16:00:04.724961145, dtReferencia=2026-09-14, dhMultiCanal=2026-09-14T16:00:04.724986945, dhTransacaoCanal=2026-09-14T16:00:04.630424446, dtContabil=null, vrTransacao=19, dtTransacaoOrigem=2026-09-14, nuServico=110298, nuVersaoServico=1, cpf=66970839567, cpf=66970839567, unidade=2, produto=2200, conta=592257937, dvConta=8, indicadorTipoConta=2, coTransacaoCaixa=20260311-0001-137f884e-4775-4913-81d8-087b0db6c1e2, icOpenBanking=0, deTransacaoReenvio=null]
2026-09-14 16:00:04,774 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb070TransacaoCaixaService] (pool-transferegov-processamento-1) Iniciando validacao do campo CoTransacaoCaixa da Transacao!
2026-09-14 16:00:04,774 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb070TransacaoCaixaService] (pool-transferegov-processamento-1) Transacao com NsuTransacao[73970653251] possui CoTransacaoCaixaOrigem[20260311-0001-137f884e-4775-4913-81d8-087b0db6c1e2] obtido pela requisicao
2026-09-14 16:00:04,775 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb070TransacaoCaixaService] (pool-transferegov-processamento-1) Iniciando persistencia do NSU[73970653251] CoTransacaoCaixa[20260311-0001-137f884e-4775-4913-81d8-087b0db6c1e2] na tabela 70 Idntr Transacao Caixa
2026-09-14 16:00:04,784 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb070TransacaoCaixaService] (pool-transferegov-processamento-1) Finalizando Idtr Transacao Caixa NsuTransacao[73970653251] CoTransacaoCaixaOrigem[20260311-0001-137f884e-4775-4913-81d8-087b0db6c1e2]
2026-09-14 16:00:04,785 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb070TransacaoCaixaService] (pool-transferegov-processamento-1) Finalizando validacao do campo CoTransacaoCaixa da Transacao!
2026-09-14 16:00:04,824 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb066ComplementoTransacaoService] (pool-transferegov-processamento-1) Gerando Complemento Transacao [identificadorTransacao: 1725eb56-bde2-40f9-8a9f-2a27d29573ac]
2026-09-14 16:00:04,827 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb066ComplementoTransacaoService] (pool-transferegov-processamento-1) Mtxtb066ComplementoTransacaoEntity{nuNsuTransacao=73970653251, dtReferencia=2026-09-14, dtEfetivacao=2026-09-14, nuServico=110298, nuVersaoServico=1, coHashTransacao='null', deComplementoTransacao='null', dhComplementoTransacao=2026-09-14T16:00:04.724986945} [identificadorTransacao: 1725eb56-bde2-40f9-8a9f-2a27d29573ac]
2026-09-14 16:00:04,827 INFO  [br.gov.cai.sim.lib.cor.com.ser.FluxoTransacionalService] (pool-transferegov-processamento-1) Montando parametros de requisicao para a tarefas [identificadorTransacao: 1725eb56-bde2-40f9-8a9f-2a27d29573ac]
2026-09-14 16:00:04,827 INFO  [br.gov.cai.sim.lib.cor.com.ser.def.FluxoTransacionalComplementoPadraoService] (pool-transferegov-processamento-1) Montando Requisicoes das Tarefas
2026-09-14 16:00:04,829 INFO  [br.gov.cai.sim.lib.cor.com.ser.TarefaService] (pool-transferegov-processamento-1) Executando tarefas -  nsu [ 73970653251 ] [identificadorTransacao: 1725eb56-bde2-40f9-8a9f-2a27d29573ac]
2026-09-14 16:00:04,830 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb065TransacaoTarefaService] (pool-transferegov-processamento-1) Montando Lista de Transacao Tarefa [identificadorTransacao: 1725eb56-bde2-40f9-8a9f-2a27d29573ac]
2026-09-14 16:00:04,830 INFO  [br.gov.cai.sim.lib.cor.com.ser.TarefaService] (pool-transferegov-processamento-1) Executando Tarefa [ 100239 ][ 1 ][ Processar Agendamento de Pix - OPP ] - Transacao Nsu[ 73970653251 ] [identificadorTransacao: 1725eb56-bde2-40f9-8a9f-2a27d29573ac]
2026-09-14 16:00:04,830 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb065TransacaoTarefaService] (pool-transferegov-processamento-1) Montando Registro da Transacao da Tarefa [100239][1][Processar Agendamento de Pix - OPP] - [identificadorTransacao: 1725eb56-bde2-40f9-8a9f-2a27d29573ac]
2026-09-14 16:00:05,142 INFO  [io.mic.cor.ins.pus.PushMeterRegistry] (pool-transferegov-processamento-1) publishing metrics for AzureMonitorMeterRegistry every 1m
2026-09-14 16:00:06,144 WARN  [br.gov.cai.sim.lib.cor.tar.con.TarefaApi] (pool-transferegov-processamento-1) M?todo executar da classe TarefaApi foi chamado. Considere criar uma implementa??o espec?fica para a API desejada, em vez de utilizar esta classe gen?rica, que ? preterida e pode n?o lidar adequadamente com tokens JWT OIDC em cen?rios multitenant.
2026-09-14 16:00:06,145 INFO  [br.gov.cai.sim.lib.cor.tar.con.TarefaApi] (pool-transferegov-processamento-1) Setando Token do SIMTX
2026-09-14 16:00:06,146 INFO  [br.gov.cai.sim.lib.cor.tar.con.TarefaApi] (pool-transferegov-processamento-1) HEADER [pagamentoSiaafDto] - [ew0KICAgICAgICAic2lzdE9wZXJhY2lvbmFsRGlzcG9zaXRpdm8iOiAiQW5kcm9pZCIsDQogICAgICAgICJ0aXR1bGFyaWRhZGUiOiAiMSIsDQogICAgICAgICJwb3J0YURpc3Bvc2l0aXZvIjogIjQ5OTIwIiwNCiAgICAgICAgInRpcG9EZURpc3Bvc2l0aXZvIjogIk1PQklMRSIsDQogICAgICAgICJpZGVudGlmaWNhY2FvIjogIlJlY29ycmVuY2lhIGZlcmlhZG8gbWVuc2FsIiwNCiAgICAgICAgInRpcG9EZUF1dGVudGljYWNhbyI6ICI0IiwNCiAgICAgICAgImNhdGVnb3JpYUNvbnRhIjogIk5TR0QiLA0KICAgICAgICAiaWRNb2JpbGVGaXJzdCI6ICJjM2YyODgxMi1jOWEzLTMzMzYtYWI5My0wY2EyZDg4YTFkMGEiLA0KICAgICAgICAiY29kaWdvQWNlc3NvIjogIjEyIiwNCiAgICAgICAgImlwRGlzcG9zaXRpdm8iOiAiMTAuMjExLjE2LjMzIg0KfQ==]
2026-09-14 16:00:06,146 INFO  [br.gov.cai.sim.lib.cor.tar.con.TarefaApi] (pool-transferegov-processamento-1) HEADER [meio-entrada] - [eyJ0aXBvIjoiTE9URV9PUFAiLCJkYWRvc0xvdGVPcHAiOnsiY2FuYWwiOiJTSVRHViIsInRpcG9BdXRlbnRpY2FjYW8iOiJTSU1QTEVTIiwibnN1TG90ZSI6NzM5NzA2NTI3MzcsIm5zdVRyYW5zYWNhb0xvdGUiOjczOTcwNjUyNjk1LCJkYXRhTG90ZSI6IjIwMjYtMDktMTQifX0=]
2026-09-14 16:00:06,241 INFO  [br.gov.cai.sim.lib.cor.tar.api.htt.HttpGenericoClient] (pool-transferegov-processamento-1) Request: POST https://simtx-pix-des.apps.nprd.caixa/simtx-pix/v1/agendamentos-opp
2026-09-14 16:00:06,242 INFO  [br.gov.cai.sim.lib.cor.tar.api.htt.HttpGenericoClient] (pool-transferegov-processamento-1) Timeout: 1000
2026-09-14 16:00:06,242 INFO  [br.gov.cai.sim.lib.cor.tar.api.htt.HttpGenericoClient] (pool-transferegov-processamento-1) Request body: {"nsuValidacao":73970652738,"dataValidacao":"2026-09-14","idFimAFim":"E003603052026091413393d56b60252e","dataEfetivacao":"2026-09-15","agendamento":true,"valor":19.0,"usuarioPagador":{"cpf":"66970839567","cnpj":"01511745000188","conta":{"agencia":"0002","numeroConta":"592257937","dv":"8","produto":"2200","tipoConta":"CACC","ispb":"00360305"},"nome":"EMPRESA RANDOMICA P. A. ORG"},"usuarioRecebedor":{"cpf":"34914374234","conta":{"agencia":"4010","numeroConta":"978427011","produto":"1288","dv":"6","tipoConta":"SVGS","ispb":"60701190"}},"informacoesEntreUsuarios":"Cross-platform intermediate budgetary management","participanteTarifado":"SLEV","metodoLiquidacao":"CLRG","transactionCurrency":"BRL","formaIniciacaoPagamento":"MANUAL_SEM_CHAVE","finalidadeTransacao":"IPAY","coTransacaoCaixa":"20260311-0001-137f884e-4775-4913-81d8-087b0db6c1e2"}
2026-09-14 16:00:06,243 INFO  [br.gov.cai.sim.lib.cor.tar.api.htt.HttpGenericoClient] (pool-transferegov-processamento-1) Gerando Headers
2026-09-14 16:00:06,465 INFO  [br.gov.cai.sim.lib.cor.tar.api.htt.HttpGenericoClient] (pool-transferegov-processamento-1) Response Status Code: 404
2026-09-14 16:00:06,465 INFO  [br.gov.cai.sim.lib.cor.tar.api.htt.HttpGenericoClient] (pool-transferegov-processamento-1) Response Body: <html><body><h1>Resource not found</h1></body></html>
2026-09-14 16:00:06,520 INFO  [br.gov.cai.sim.lib.cor.tar.con.TarefaApi] (pool-transferegov-processamento-1) Tratando Retorno de Erro!
2026-09-14 16:00:06,521 WARN  [br.gov.cai.sim.lib.cor.tar.con.TarefaApi] (pool-transferegov-processamento-1) N?o foi possivel converter a resposta para json!
2026-09-14 16:00:06,522 INFO  [br.gov.cai.sim.lib.cor.tar.con.TarefaApi] (pool-transferegov-processamento-1) Trantando Resposta Erro Api Externa!
2026-09-14 16:00:06,555 INFO  [br.gov.cai.sim.lib.cor.com.ser.TarefaService] (pool-transferegov-processamento-1) Atualizando Campos do Registro da Transacao da Tarefa [100239][1][Processar Agendamento de Pix - OPP] - [identificadorTransacao: 1725eb56-bde2-40f9-8a9f-2a27d29573ac]
2026-09-14 16:00:06,556 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb065TransacaoTarefaService] (pool-transferegov-processamento-1) Gravando requisi??o para tarefa [ 100239 ]
2026-09-14 16:00:06,556 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb065TransacaoTarefaService] (pool-transferegov-processamento-1) Gravando resposta para tarefa [ 100239 ]
2026-09-14 16:00:06,556 INFO  [br.gov.cai.sim.lib.cor.com.ser.TarefaService] (pool-transferegov-processamento-1) Incluindo Pendencia da Transacao
2026-09-14 16:00:06,557 INFO  [br.gov.cai.sim.lib.cor.com.ser.TarefaService] (pool-transferegov-processamento-1) Erro SemResultadoException: null
2026-09-14 16:00:06,557 WARN  [br.gov.cai.sim.lib.cor.com.ser.TratarExcecaoService] (pool-transferegov-processamento-1) Codigo de Retorno [ 404 ] nao encontrado para a Tarefa[ 100239 ]-[ 1 ]-[ Agendamento de Pix Opp ] 
2026-09-14 16:00:06,621 INFO  [br.gov.cai.sim.lib.cor.com.ser.TratarExcecaoService] (pool-transferegov-processamento-1) Validar Transacao Tarefa: false
2026-09-14 16:00:06,621 WARN  [br.gov.cai.sim.lib.cor.com.ser.FluxoTransacionalService] (pool-transferegov-processamento-1) Erro ServicoException: Status HTTP: 404
2026-09-14 16:00:06,624 INFO  [br.gov.cai.sim.lib.cor.mq.sic.EnvioSiccoService] (executor-thread-1)  ==== Processo Envio SICCO Iniciado [identificadorTransacao: 1725eb56-bde2-40f9-8a9f-2a27d29573ac] ==== 
2026-09-14 16:00:06,625 INFO  [br.gov.cai.sim.lib.cor.com.ser.def.FluxoTransacionalComplementoPadraoService] (pool-transferegov-processamento-1) Gravando tabelas da Transacao Nsu [ 73970653251 ] [identificadorTransacao: 1725eb56-bde2-40f9-8a9f-2a27d29573ac]
2026-09-14 16:00:06,625 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb014TransacaoService] (pool-transferegov-processamento-1) Atualizando Mtxtb014Transacao [nuNsuTransacao=73970653251, nuNsuTransacaoOrigem=73970652695, coCanalOrigem=114, icSituacao=2, icEnvio=0, icRetorno=0, coTransacaoExterna=null, coRetornoTransacao=404, deMensagemTransacao=Status HTTP: 404, tsAtualizacao=2026-09-14T16:00:04.724961145, dtReferencia=2026-09-14, dhMultiCanal=2026-09-14T16:00:04.724986945, dhTransacaoCanal=2026-09-14T16:00:04.630424446, dtContabil=null, vrTransacao=19, dtTransacaoOrigem=2026-09-14, nuServico=110298, nuVersaoServico=1, cpf=66970839567, cpf=66970839567, unidade=2, produto=2200, conta=592257937, dvConta=8, indicadorTipoConta=2, coTransacaoCaixa=20260311-0001-137f884e-4775-4913-81d8-087b0db6c1e2, icOpenBanking=0, deTransacaoReenvio=null] [identificadorTransacao: 1725eb56-bde2-40f9-8a9f-2a27d29573ac]
2026-09-14 16:00:06,630 INFO  [br.gov.cai.sim.lib.cor.mq.sic.EnvioSiccoService] (executor-thread-1) Gerando Transacao [identificadorTransacao: 1725eb56-bde2-40f9-8a9f-2a27d29573ac]
2026-09-14 16:00:06,631 INFO  [br.gov.cai.sim.lib.cor.mq.sic.EnvioSiccoService] (executor-thread-1) Gerando ListaTransacaoTarefa [identificadorTransacao: 1725eb56-bde2-40f9-8a9f-2a27d29573ac]
2026-09-14 16:00:06,632 INFO  [br.gov.cai.sim.lib.cor.mq.sic.EnvioSiccoService] (executor-thread-1) Gerando ListaTransacaoTarefa [identificadorTransacao: 1725eb56-bde2-40f9-8a9f-2a27d29573ac]
2026-09-14 16:00:06,644 INFO  [br.gov.cai.sim.lib.cor.mq.con.JmsConnectionLogger] (executor-thread-1) [JMS Pool - sicco] Conexoes ativas: 0
2026-09-14 16:00:06,645 INFO  [br.gov.cai.sim.lib.cor.mq.con.JmsConnectionLogger] (executor-thread-1) [JMS Pool - sicco] Criando JMSContext para operacao: executarEnvioOnline
2026-09-14 16:00:06,645 INFO  [br.gov.cai.sim.lib.cor.mq.con.LoggingConnectionFactoryWrapper] (executor-thread-1) Nova conexao sendo criada no pool [SIMTX.CCO.SVRCONN]
2026-09-14 16:00:06,923 INFO  [br.gov.cai.sim.lib.cor.com.ser.Mtxtb065TransacaoTarefaService] (pool-transferegov-processamento-1) Transacao Tarefa Mtxtb065TransacaoTarefaEntity{id=Mtxtb065TransacaoTarefaId{nuNsuTransacao=73970653251, nuTarefa=100239}, nuVersaoTarefa=1, deRequisicaoTarefa='{"nsuValidacao":73970652738,"dataValidacao":"2026-09-14","idFimAFim":"E003603052026091413393d56b60252e","dataEfetivacao":"2026-09-15","agendamento":true,"valor":19.0,"usuarioPagador":{"cpf":"66970839567","cnpj":"01511745000188","conta":{"agencia":"0002","numeroConta":"592257937","dv":"8","produto":"2200","tipoConta":"CACC","ispb":"00360305"},"nome":"EMPRESA RANDOMICA P. A. ORG"},"usuarioRecebedor":{"cpf":"34914374234","conta":{"agencia":"4010","numeroConta":"978427011","produto":"1288","dv":"6","tipoConta":"SVGS","ispb":"60701190"}},"informacoesEntreUsuarios":"Cross-platform intermediate budgetary management","participanteTarifado":"SLEV","metodoLiquidacao":"CLRG","transactionCurrency":"BRL","formaIniciacaoPagamento":"MANUAL_SEM_CHAVE","finalidadeTransacao":"IPAY","coTransacaoCaixa":"20260311-0001-137f884e-4775-4913-81d8-087b0db6c1e2"}', deRespostaTarefa='<html><body><h1>Resource not found</h1></body></html>', tsExecucaoTarefa=2026-09-14T16:00:04.830433126, dtReferencia=2026-09-14, nuNsuCorporativo=0, coRetornoTarefa='404', deMensagemTarefa='Status HTTP: 404', nuStatusTarefa=404, tsRetornoTarefa=2026-09-14T16:00:06.556728281} [identificadorTransacao: 1725eb56-bde2-40f9-8a9f-2a27d29573ac]
2026-09-14 16:00:06,931 INFO  [br.gov.cai.sim.lib.cor.com.ser.def.FluxoTransacionalComplementoPadraoService] (pool-transferegov-processamento-1) Flush Realizado: Mtxtb014Transacao [nuNsuTransacao=73970653251, nuNsuTransacaoOrigem=73970652695, coCanalOrigem=114, icSituacao=2, icEnvio=0, icRetorno=0, coTransacaoExterna=null, coRetornoTransacao=404, deMensagemTransacao=Status HTTP: 404, tsAtualizacao=2026-09-14T16:00:04.724961145, dtReferencia=2026-09-14, dhMultiCanal=2026-09-14T16:00:04.724986945, dhTransacaoCanal=2026-09-14T16:00:04.630424446, dtContabil=null, vrTransacao=19, dtTransacaoOrigem=2026-09-14, nuServico=110298, nuVersaoServico=1, cpf=66970839567, cpf=66970839567, unidade=2, produto=2200, conta=592257937, dvConta=8, indicadorTipoConta=2, coTransacaoCaixa=20260311-0001-137f884e-4775-4913-81d8-087b0db6c1e2, icOpenBanking=0, deTransacaoReenvio=null] [identificadorTransacao: 1725eb56-bde2-40f9-8a9f-2a27d29573ac]
2026-09-14 16:00:06,939 INFO  [br.gov.cai.sim.lib.cor.com.ser.FluxoTransacionalService] (pool-transferegov-processamento-1) Lista de respostas das tarefas: [RespostaTarefaDTO{statusCode=404, codigoRetorno='404', nsuCorp=0, mensagem='Status HTTP: 404', requisicao={"nsuValidacao":73970652738,"dataValidacao":"2026-09-14","idFimAFim":"E003603052026091413393d56b60252e","dataEfetivacao":"2026-09-15","agendamento":true,"valor":19.0,"usuarioPagador":{"cpf":"66970839567","cnpj":"01511745000188","conta":{"agencia":"0002","numeroConta":"592257937","dv":"8","produto":"2200","tipoConta":"CACC","ispb":"00360305"},"nome":"EMPRESA RANDOMICA P. A. ORG"},"usuarioRecebedor":{"cpf":"34914374234","conta":{"agencia":"4010","numeroConta":"978427011","produto":"1288","dv":"6","tipoConta":"SVGS","ispb":"60701190"}},"informacoesEntreUsuarios":"Cross-platform intermediate budgetary management","participanteTarifado":"SLEV","metodoLiquidacao":"CLRG","transactionCurrency":"BRL","formaIniciacaoPagamento":"MANUAL_SEM_CHAVE","finalidadeTransacao":"IPAY","coTransacaoCaixa":"20260311-0001-137f884e-4775-4913-81d8-087b0db6c1e2"}, resposta=<html><body><h1>Resource not found</h1></body></html>, complementoTransacao=null, tarefa=AGENDAMENTO_PIX_OPP, codigoRetornoTarefa='null', codigoHttpRetornoTarefa=404, origemRetorno='SIMTX', sucesso=false}]
2026-09-14 16:00:06,940 INFO  [br.gov.cai.sim.lib.cor.com.ser.FluxoTransacionalService] (pool-transferegov-processamento-1) Ultima tarefa executada: RespostaTarefaDTO{statusCode=404, codigoRetorno='404', nsuCorp=0, mensagem='Status HTTP: 404', requisicao={"nsuValidacao":73970652738,"dataValidacao":"2026-09-14","idFimAFim":"E003603052026091413393d56b60252e","dataEfetivacao":"2026-09-15","agendamento":true,"valor":19.0,"usuarioPagador":{"cpf":"66970839567","cnpj":"01511745000188","conta":{"agencia":"0002","numeroConta":"592257937","dv":"8","produto":"2200","tipoConta":"CACC","ispb":"00360305"},"nome":"EMPRESA RANDOMICA P. A. ORG"},"usuarioRecebedor":{"cpf":"34914374234","conta":{"agencia":"4010","numeroConta":"978427011","produto":"1288","dv":"6","tipoConta":"SVGS","ispb":"60701190"}},"informacoesEntreUsuarios":"Cross-platform intermediate budgetary management","participanteTarifado":"SLEV","metodoLiquidacao":"CLRG","transactionCurrency":"BRL","formaIniciacaoPagamento":"MANUAL_SEM_CHAVE","finalidadeTransacao":"IPAY","coTransacaoCaixa":"20260311-0001-137f884e-4775-4913-81d8-087b0db6c1e2"}, resposta=<html><body><h1>Resource not found</h1></body></html>, complementoTransacao=null, tarefa=AGENDAMENTO_PIX_OPP, codigoRetornoTarefa='null', codigoHttpRetornoTarefa=404, origemRetorno='SIMTX', sucesso=false}
2026-09-14 16:00:06,940 INFO  [br.gov.cai.sim.lib.cor.com.ser.FluxoTransacionalService] (pool-transferegov-processamento-1) Setando detalheErroNegocial na reposta de erro: <html><body><h1>Resource not found</h1></body></html>
2026-09-14 16:00:06,940 WARN  [br.gov.cai.sim.lib.cor.com.ser.FluxoTransacionalService] (pool-transferegov-processamento-1) Erro JsonProcessingException: Unexpected character ('<' (code 60)): expected a valid value (JSON String, Number, Array, Object or token 'null', 'true' or 'false')
 at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 1]
2026-09-14 16:00:06,940 INFO  [br.gov.cai.sim.tra.pro.pro.ser.ProcessadorComum] (pool-transferegov-processamento-1) Tratando erro padrao...
2026-09-14 16:00:06,940 INFO  [br.gov.cai.sim.lib.cor.com.ser.FluxoTransacionalService] (pool-transferegov-processamento-1) Verificando se ser? necess?rio executar novamente esse agendamento...
2026-09-14 16:00:06,941 INFO  [br.gov.cai.sim.lib.cor.com.ser.FluxoTransacionalService] (pool-transferegov-processamento-1) Ultima tarefa executada encontrada! nuTarefa [ 100239 ]
2026-09-14 16:00:06,941 INFO  [br.gov.cai.sim.tra.pro.pro.ser.ProcessadorComum] (pool-transferegov-processamento-1) icReprocessaAgendamento [ 0 ] 
2026-09-14 16:00:06,941 INFO  [br.gov.cai.sim.tra.pro.per.rep.Mtxtb045TransacaoLoteRepositoryImpl] (pool-transferegov-processamento-1) Atualizando transacao lote nsuTransacaoLote [ 73970652695 ], dataLote [ 2026-09-14 ], icSituacaoTransacao [ 3 ], motivo [ Status HTTP: 404 ], icEnvio [ 0 ]
2026-09-14 16:00:06,957 INFO  [br.gov.cai.sim.tra.pro.pro.ser.ProcessadorLotes] (pool-transferegov-processamento-1) Processamento realizado! status [ 404 ] 
2026-09-14 16:00:06,958 WARN  [br.gov.cai.sim.tra.pro.pro.ser.ProcessadorLotes] (pool-transferegov-processamento-1)  ==== Recebimento de Lote Finalizada ==== 
2026-09-14 16:00:07,099 INFO  [br.gov.cai.sim.lib.cor.mq.con.JmsConnectionLogger] (executor-thread-1) [JMS Pool - sicco] Conexoes ativas: 1
2026-09-14 16:00:07,100 INFO  [br.gov.cai.sim.lib.cor.mq.con.JmsConnectionLogger] (executor-thread-1) [JMS Pool - sicco] JMSContext criado para operacao: executarEnvioOnline em 454 ms
2026-09-14 16:00:07,235 INFO  [br.gov.cai.sim.lib.cor.mq.EnvioMensagemSiccoMQ] (executor-thread-1) Mensagem Enviada [ SICCO.REQ.RECEBE_TRANSACAO ]
2026-09-14 16:00:07,236 INFO  [br.gov.cai.sim.lib.cor.mq.EnvioMensagemSiccoMQ] (executor-thread-1) Mensagem Enviada [ {"transacao":{"nuNsuTransacao":73970653251,"nuNsuTransacaoPai":73970652695,"nuServico":110298,"nuVersaoServico":1,"coCanalOrigem":"114","icSituacao":2,"dtReferencia":"2026-09-14","dhMultiCanal":"2026-09-14T16:00:04.724986945","dhTransacaoCanal":"2026-09-14T16:00:04.630424446","vrTransacao":19,"dtTransacaoOrigem":"2026-09-14","coRetornoTransacao":"404","indicadorTipoConta":2,"conta":592257937,"produto":2200,"unidade":2,"dvConta":8,"cpf":66970839567,"tsAtualizacao":"2026-09-14T16:00:04.724961145","deMensagemTransacao":"Status HTTP: 404","coTransacaoCaixa":"20260311-0001-137f884e-4775-4913-81d8-087b0db6c1e2"},"listaTransacaoTarefa":[{"nuNsuTransacao":73970653251,"nuTarefa":100239,"nuVersaoTarefa":1,"dtReferencia":"2026-09-14","deRequisicaoTarefa":"{\"nsuValidacao\":73970652738,\"dataValidacao\":\"2026-09-14\",\"idFimAFim\":\"E003603052026091413393d56b60252e\",\"dataEfetivacao\":\"2026-09-15\",\"agendamento\":true,\"valor\":19.0,\"usuarioPagador\":{\"cpf\":\"66970839567\",\"cnpj\":\"01511745000188\",\"conta\":{\"agencia\":\"0002\",\"numeroConta\":\"592257937\",\"dv\":\"8\",\"produto\":\"2200\",\"tipoConta\":\"CACC\",\"ispb\":\"00360305\"},\"nome\":\"EMPRESA RANDOMICA P. A. ORG\"},\"usuarioRecebedor\":{\"cpf\":\"34914374234\",\"conta\":{\"agencia\":\"4010\",\"numeroConta\":\"978427011\",\"produto\":\"1288\",\"dv\":\"6\",\"tipoConta\":\"SVGS\",\"ispb\":\"60701190\"}},\"informacoesEntreUsuarios\":\"Cross-platform intermediate budgetary management\",\"participanteTarifado\":\"SLEV\",\"metodoLiquidacao\":\"CLRG\",\"transactionCurrency\":\"BRL\",\"formaIniciacaoPagamento\":\"MANUAL_SEM_CHAVE\",\"finalidadeTransacao\":\"IPAY\",\"coTransacaoCaixa\":\"20260311-0001-137f884e-4775-4913-81d8-087b0db6c1e2\"}","tsExecucaoTarefa":"2026-09-14T16:00:04.830433126","deMensagemTarefa":"Status HTTP: 404","nuStatusTarefa":404,"nuNsuCorporativo":0,"coRetornoTarefa":"404","deRespostaTarefa":"<html><body><h1>Resource not found</h1></body></html>","tsRetornoTarefa":"2026-09-14T16:00:06.556728281"}]} ]
2026-09-14 16:00:07,236 INFO  [br.gov.cai.sim.lib.cor.mq.sic.EnvioSiccoService] (executor-thread-1)  ==== Processo Envio SICCO Finalizado [identificadorTransacao: 1725eb56-bde2-40f9-8a9f-2a27d29573ac] ==== 



<img width="1781" height="869" alt="image" src="https://github.com/user-attachments/assets/80b5eef6-a978-4633-a038-9742c49888de" />


depoly tambem passou, me ajuda com texto para fechar a demanda]


