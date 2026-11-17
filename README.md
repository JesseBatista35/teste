
[root@caddeapllx2871 p585600]#
[root@caddeapllx2871 p585600]#
[root@caddeapllx2871 p585600]# /logs/jboss/jboss-eap/standalone/sigec-portabilidade/server.log
bash: /logs/jboss/jboss-eap/standalone/sigec-portabilidade/server.log: Permissão negada
[root@caddeapllx2871 p585600]#
[root@caddeapllx2871 p585600]#
[root@caddeapllx2871 p585600]#
[root@caddeapllx2871 p585600]# L=/logs/jboss/jboss-eap/standalone/sigec-portabilidade/server.log
[root@caddeapllx2871 p585600]# ls -l $L
-rw-r--r-- 1 jboss jboss 1024780 nov 17 12:05 /logs/jboss/jboss-eap/standalone/sigec-portabilidade/server.log
[root@caddeapllx2871 p585600]# grep -nE "WFLYSRV0021|WFLYCTL0013|WFLYCTL0180|WFLYCTL0412|WFLYSRV0059|Services with missing|ERROR|FATAL" $L | tail -40
4103:2026-11-17 11:48:15,385 ERROR [stderr] (MSC service thread 1-1) 17 de novembro de 2026 11:48:15 BRT[MSC service thread 1-1] ResourceAdapterImpl
4104:2026-11-17 11:48:15,385 ERROR [stderr] (MSC service thread 1-1) Sistema de mensagens do WMQ: '9.0.4.0-p904-L171030.1'.
4105:2026-11-17 11:48:15,385 ERROR [stderr] (MSC service thread 1-1)
4106:2026-11-17 11:48:15,385 ERROR [stderr] (MSC service thread 1-1) EXPLICAÇÃO:
4107:2026-11-17 11:48:15,385 ERROR [stderr] (MSC service thread 1-1) null
4108:2026-11-17 11:48:15,385 ERROR [stderr] (MSC service thread 1-1)
4109:2026-11-17 11:48:15,385 ERROR [stderr] (MSC service thread 1-1) AÇÃO:
4110:2026-11-17 11:48:15,385 ERROR [stderr] (MSC service thread 1-1) null
4111:2026-11-17 11:48:15,385 ERROR [stderr] (MSC service thread 1-1) --------------------------------------------------------------------
4703:2026-11-17 11:48:20,703 ERROR [org.jboss.msc.service.fail] (MSC service thread 1-4) MSC000001: Failed to start service jboss.deployment.subunit."gec-ear.ear"."gec-web.war".POST_MODULE: org.jboss.msc.service.StartException in service jboss.deployment.subunit."gec-ear.ear"."gec-web.war".POST_MODULE: WFLYSRV0153: Falha ao processar a fase POST_MODULE de subdeployment "gec-web.war" of deployment "gec-ear.ear"
6226:2026-11-17 11:48:21,443 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("deploy") - endereço ([("deployment" => "gec-ear.ear")]) - falha na descrição: {
6231:    "WFLYCTL0412: Serviços necessários que não estão instalados:" => [
6404:    "WFLYCTL0180: Os serviços com falta/indisponibilidade de dependências " => [
7594:2026-11-17 11:48:21,711 ERROR [org.jboss.as] (Controller Boot Thread) WFLYSRV0026: JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001) iniciado (com erros) em 13283ms - Iniciado(s) 1106 de serviços 2365 (1015 serviços falharam ou tinham dependências ausentes, os serviços 545 estão lentos, passivos ou sob demanda)
7597:2026-11-17 11:48:38,176 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-11-17 11:48:38.176 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
7598:2026-11-17 11:48:53,132 INFO  [stdout] (elastic-apm-server-reporter) 2026-11-17 11:48:53.132 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: Connect timed out
7599:2026-11-17 11:49:23,122 INFO  [stdout] (elastic-apm-server-reporter) 2026-11-17 11:49:23.121 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: Connect timed out
7600:2026-11-17 11:49:53,126 INFO  [stdout] (elastic-apm-server-reporter) 2026-11-17 11:49:53.125 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: Connect timed out
7601:2026-11-17 11:50:23,132 INFO  [stdout] (elastic-apm-server-reporter) 2026-11-17 11:50:23.131 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: Connect timed out
7602:2026-11-17 11:50:53,125 INFO  [stdout] (elastic-apm-server-reporter) 2026-11-17 11:50:53.125 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: Connect timed out
7603:2026-11-17 11:51:24,294 INFO  [stdout] (elastic-apm-server-reporter) 2026-11-17 11:51:24.293 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: Connect timed out
7604:2026-11-17 11:52:05,053 INFO  [stdout] (elastic-apm-server-reporter) 2026-11-17 11:52:05.053 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: Connect timed out
7605:2026-11-17 11:52:59,166 INFO  [stdout] (elastic-apm-server-reporter) 2026-11-17 11:52:59.166 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: Connect timed out
7606:2026-11-17 11:53:49,922 INFO  [stdout] (elastic-apm-server-reporter) 2026-11-17 11:53:49.921 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: Connect timed out
7607:2026-11-17 11:54:08,207 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-11-17 11:54:08.207 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
7608:2026-11-17 11:54:37,478 INFO  [stdout] (elastic-apm-server-reporter) 2026-11-17 11:54:37.478 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: Connect timed out
7609:2026-11-17 11:55:31,374 INFO  [stdout] (elastic-apm-server-reporter) 2026-11-17 11:55:31.374 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: Connect timed out
7610:2026-11-17 11:56:24,654 INFO  [stdout] (elastic-apm-server-reporter) 2026-11-17 11:56:24.653 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: Connect timed out
7611:2026-11-17 11:57:18,984 INFO  [stdout] (elastic-apm-server-reporter) 2026-11-17 11:57:18.983 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: Connect timed out
7614:2026-11-17 11:58:11,613 INFO  [stdout] (elastic-apm-server-reporter) 2026-11-17 11:58:11.612 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: Connect timed out
7615:2026-11-17 11:59:05,328 INFO  [stdout] (elastic-apm-server-reporter) 2026-11-17 11:59:05.327 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: Connect timed out
7616:2026-11-17 11:59:38,239 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-11-17 11:59:38.239 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
7617:2026-11-17 11:59:59,575 INFO  [stdout] (elastic-apm-server-reporter) 2026-11-17 11:59:59.575 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: Connect timed out
7618:2026-11-17 12:00:50,481 INFO  [stdout] (elastic-apm-server-reporter) 2026-11-17 12:00:50.481 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: Connect timed out
7619:2026-11-17 12:01:39,231 INFO  [stdout] (elastic-apm-server-reporter) 2026-11-17 12:01:39.230 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: Connect timed out
7620:2026-11-17 12:02:28,783 INFO  [stdout] (elastic-apm-server-reporter) 2026-11-17 12:02:28.782 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: Connect timed out
7621:2026-11-17 12:03:19,650 INFO  [stdout] (elastic-apm-server-reporter) 2026-11-17 12:03:19.650 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: Connect timed out
7622:2026-11-17 12:04:07,611 INFO  [stdout] (elastic-apm-server-reporter) 2026-11-17 12:04:07.611 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: Connect timed out
7623:2026-11-17 12:04:55,792 INFO  [stdout] (elastic-apm-server-reporter) 2026-11-17 12:04:55.791 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: Connect timed out
7624:2026-11-17 12:05:08,271 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-11-17 12:05:08.271 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
[root@caddeapllx2871 p585600]# grep -n -B2 -A25 "WFLYCTL0013\|WFLYSRV0021" $L | tail -120
249-}
250:2026-11-17 11:10:03,756 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("add") - endereço ([
251-    ("subsystem" => "security"),
252-    ("security-domain" => "jboss-ejb-policy")
253-]) - falha na descrição: {
254-    "WFLYCTL0412: Serviços necessários que não estão instalados:" => [
255-        "jboss.security.security-management",
256-        "jboss.security.jaas"
257-    ],
258-    "WFLYCTL0180: Os serviços com falta/indisponibilidade de dependências " => ["jboss.security.security-domain.jboss-ejb-policy faltam [jboss.security.jaas, jboss.security.security-management]"]
259-}
260:2026-11-17 11:10:03,759 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("add") - endereço ([
261-    ("subsystem" => "undertow"),
262-    ("server" => "default-server"),
263-    ("https-listener" => "https")
264-]) - falha na descrição: {
265-    "WFLYCTL0412: Serviços necessários que não estão instalados:" => ["org.wildfly.core.management.security.realm.ApplicationRealm"],
266-    "WFLYCTL0180: Os serviços com falta/indisponibilidade de dependências " => ["org.wildfly.undertow.listener.https faltam [org.wildfly.core.management.security.realm.ApplicationRealm]"]
267-}
268:2026-11-17 11:10:03,759 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("add") - endereço ([
269-    ("subsystem" => "undertow"),
270-    ("server" => "default-server"),
271-    ("host" => "default-host"),
272-    ("setting" => "http-invoker")
273-]) - falha na descrição: {
274-    "WFLYCTL0412: Serviços necessários que não estão instalados:" => ["org.wildfly.core.management.security.realm.ApplicationRealm"],
275-    "WFLYCTL0180: Os serviços com falta/indisponibilidade de dependências " => ["org.wildfly.undertow.http-invoker.host.default-host.http-invoker faltam [org.wildfly.core.management.security.realm.ApplicationRealm]"]
276-}
277:2026-11-17 11:10:03,760 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("add") - endereço ([
278-    ("subsystem" => "messaging-activemq"),
279-    ("server" => "default")
280-]) - falha na descrição: {
281-    "WFLYCTL0412: Serviços necessários que não estão instalados:" => ["jboss.security.bootstrap"],
282-    "WFLYCTL0180: Os serviços com falta/indisponibilidade de dependências " => ["jboss.messaging-activemq.default faltam [jboss.security.bootstrap]"]
283-}
284-2026-11-17 11:10:03,761 ERROR [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0459: Acionando reversão devido à falta de serviços de gerenciamento.
285:2026-11-17 11:10:03,761 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("add") - endereço ([
286-    ("core-service" => "management"),
287-    ("management-interface" => "http-interface")
288-]) - falha na descrição: {
289-    "WFLYCTL0412: Serviços necessários que não estão instalados:" => [
290-        "org.wildfly.core.management.security.realm.ManagementRealm",
291-        "jboss.http-upgrade-registry.http-management"
292-    ],
293-    "WFLYCTL0180: Os serviços com falta/indisponibilidade de dependências " => [
294-        "jboss.remoting.remoting-http-upgrade-service.http-management faltam [org.wildfly.core.management.security.realm.ManagementRealm, jboss.http-upgrade-registry.http-management]",
295-        "org.wildfly.management.http.extensible faltam [org.wildfly.core.management.security.realm.ManagementRealm]"
296-    ]
297-}
298-2026-11-17 11:42:17,169 INFO  [org.jboss.as.patching] (MSC service thread 1-4) WFLYPAT0050: A ID de patch cumulativo de JBoss EAP é jboss-eap-7.4.18.CP, os patches únicos incluem: none
299-2026-11-17 11:42:17,353 INFO  [org.wildfly.iiop.openjdk] (MSC service thread 1-1) WFLYIIOP0009: Serviço CORBA ORB iniciado
300-2026-11-17 11:42:17,362 DEBUG [org.keycloak.crypto.def.DefaultCryptoProvider] (MSC service thread 1-3) Loaded org.bouncycastle.jce.provider.BouncyCastleProvider security provider
301-2026-11-17 11:42:17,366 DEBUG [org.keycloak.common.crypto.CryptoIntegration] (MSC service thread 1-3) Detected crypto provider: org.keycloak.crypto.def.DefaultCryptoProvider
302-2026-11-17 11:42:17,366 DEBUG [org.keycloak.common.crypto.CryptoIntegration] (MSC service thread 1-3) java security provider: BC
303-2026-11-17 11:42:17,416 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0027: Iniciando a implantação do "wmq.jmsra.rar" (runtime-name: "wmq.jmsra.rar")
304-2026-11-17 11:42:17,418 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0027: Iniciando a implantação do "framework.jar" (runtime-name: "framework.jar")
305-2026-11-17 11:42:17,418 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0027: Iniciando a implantação do "framework_sisgd.jar" (runtime-name: "framework_sisgd.jar")
306-2026-11-17 11:42:17,418 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0027: Iniciando a implantação do "gec-ear.ear" (runtime-name: "gec-ear.ear")
307-2026-11-17 11:42:17,419 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-4) WFLYDS0013: Foi iniciado FileSystemDeploymentService para o diretório /opt/jboss-eap/standalone/deployments
308-2026-11-17 11:42:17,434 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0012: Servidor default-server foi iniciado.
309-2026-11-17 11:42:17,434 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-4) WFLYJCA0098: Fonte de dados não transacional vinculada: java:/jdbc/DB2SiempDS
310-2026-11-17 11:42:17,823 DEBUG [org.keycloak.protocol.oidc.client.authentication.ClientCredentialsProviderUtils] (MSC service thread 1-3) Using provider 'secret' for authentication of client 'cli-api-gec'
--
2479-   java:module/ProcessadorACTC103Bean!br.gov.caixa.sigec.negocio.ProcessadorACTC103
2480-
2481:2026-11-17 11:42:29,364 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("deploy") - endereço ([("deployment" => "gec-ear.ear")]) - falha na descrição: {
2482-    "WFLYCTL0080: Falha de serviços" => {"jboss.deployment.subunit.\"gec-ear.ear\".\"gec-web.war\".POST_MODULE" => "WFLYSRV0153: Falha ao processar a fase POST_MODULE de subdeployment \"gec-web.war\" of deployment \"gec-ear.ear\"
2483-    Caused by: java.lang.RuntimeException: WFLYSRV0177: Ocorreu um erro ao obter a informação reflexiva para o class br.gov.caixa.arqrefcore.siemp.sisgd.api.impl.UpLoadDownloadImpl com o ClassLoader ModuleClassLoader for Module \"deployment.gec-ear.ear.gec-web.war\" from Service Module Loader
2484-    Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/bsb/sisgd/framework/cm/ConectorException
2485-    Caused by: java.lang.ClassNotFoundException: br.gov.caixa.bsb.sisgd.framework.cm.ConectorException from [Module \"deployment.gec-ear.ear.gec-web.war\" from Service Module Loader]"},
2486-    "WFLYCTL0412: Serviços necessários que não estão instalados:" => [
2487-        "jboss.naming.context.java.comp.gec-ear.gec-ejb.ProcessadorACTC303Bean",
2488-        "jboss.naming.context.java.comp.gec-ear.gec-ejb.ProspeccaoRegrasCapitalGiroBean",
2489-        "jboss.naming.context.java.comp.gec-ear.gec-ejb.ProcessadorACTC702Bean",
2490-        "jboss.naming.context.java.comp.gec-ear.gec-ejb.HistoricoSituacaoLiquidacaoBean",
2491-        "jboss.naming.context.java.comp.gec-ear.gec-ejb.ProcessadorLegacyCallTEDNCRBean",
2492-        "jboss.naming.context.java.comp.gec-ear.gec-ejb.ProcessadorACTC923Bean",
2493-        "jboss.naming.context.java.comp.gec-ear.gec-ejb.MovimentoSolicitacaoExternaBean",
2494-        "jboss.naming.context.java.comp.gec-ear.gec-ejb.ManterRegistroArquivoConsignadoBean",
2495-        "jboss.naming.context.java.comp.gec-ear.gec-ejb.RelatorioCTCBean",
2496-        "jboss.naming.context.java.comp.gec-ear.gec-ejb.ProcessadorAPCS102Bean",
2497-        "jboss.deployment.subunit.\"gec-ear.ear\".\"gec-ejb.jar\".beanmanager",
2498-        "jboss.naming.context.java.comp.gec-ear.gec-ejb.SicliAPIBean",
2499-        "jboss.naming.context.java.comp.gec-ear.gec-ejb.ProcessadorAPCS104Bean",
2500-        "jboss.naming.context.java.comp.gec-ear.gec-ejb.IntegracaoSIAPXConvenenteCanalBean",
2501-        "jboss.naming.context.java.comp.gec-ear.gec-ejb.ConsultaArquivoSinteticoBean",
2502-        "jboss.deployment.unit.\"gec-ear.ear\".beanmanager",
2503-        "jboss.naming.context.java.comp.gec-ear.gec-ejb.CemocProspeccaoBean",
2504-        "jboss.naming.context.java.comp.gec-ear.gec-ejb.ProcessadorEnvioTEDDesenrolaBean",
2505-        "jboss.naming.context.java.comp.gec-ear.gec-ejb.EvidenciaRetencaoPdfAPIBean",
2506-        "jboss.naming.context.java.comp.gec-ear.gec-ejb.DAOBarramentoFactory",
--
6224-   java:module/ProcessadorACTC103Bean!br.gov.caixa.sigec.negocio.ProcessadorACTC103Bean
6225-
6226:2026-11-17 11:48:21,443 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("deploy") - endereço ([("deployment" => "gec-ear.ear")]) - falha na descrição: {
6227-    "WFLYCTL0080: Falha de serviços" => {"jboss.deployment.subunit.\"gec-ear.ear\".\"gec-web.war\".POST_MODULE" => "WFLYSRV0153: Falha ao processar a fase POST_MODULE de subdeployment \"gec-web.war\" of deployment \"gec-ear.ear\"
6228-    Caused by: java.lang.RuntimeException: WFLYSRV0177: Ocorreu um erro ao obter a informação reflexiva para o class br.gov.caixa.arqrefcore.siemp.sisgd.api.impl.UpLoadDownloadImpl com o ClassLoader ModuleClassLoader for Module \"deployment.gec-ear.ear.gec-web.war\" from Service Module Loader
6229-    Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/bsb/sisgd/framework/cm/ConectorException
6230-    Caused by: java.lang.ClassNotFoundException: br.gov.caixa.bsb.sisgd.framework.cm.ConectorException from [Module \"deployment.gec-ear.ear.gec-web.war\" from Service Module Loader]"},
6231-    "WFLYCTL0412: Serviços necessários que não estão instalados:" => [
6232-        "jboss.naming.context.java.comp.gec-ear.gec-ejb.ProspeccaoRegrasCapitalGiroBean",
6233-        "jboss.naming.context.java.comp.gec-ear.gec-ejb.ProcessadorACTC303Bean",
6234-        "jboss.naming.context.java.comp.gec-ear.gec-ejb.ProcessadorACTC702Bean",
6235-        "jboss.naming.context.java.comp.gec-ear.gec-ejb.HistoricoSituacaoLiquidacaoBean",
6236-        "jboss.naming.context.java.comp.gec-ear.gec-ejb.ProcessadorLegacyCallTEDNCRBean",
6237-        "jboss.naming.context.java.comp.gec-ear.gec-ejb.ProcessadorACTC923Bean",
6238-        "jboss.naming.context.java.comp.gec-ear.gec-ejb.MovimentoSolicitacaoExternaBean",
6239-        "jboss.naming.context.java.comp.gec-ear.gec-ejb.ManterRegistroArquivoConsignadoBean",
6240-        "jboss.naming.context.java.comp.gec-ear.gec-ejb.RelatorioCTCBean",
6241-        "jboss.naming.context.java.comp.gec-ear.gec-ejb.ProcessadorAPCS102Bean",
6242-        "jboss.naming.context.java.comp.gec-ear.gec-ejb.SicliAPIBean",
6243-        "jboss.deployment.subunit.\"gec-ear.ear\".\"gec-ejb.jar\".beanmanager",
6244-        "jboss.naming.context.java.comp.gec-ear.gec-ejb.ProcessadorAPCS104Bean",
6245-        "jboss.naming.context.java.comp.gec-ear.gec-ejb.IntegracaoSIAPXConvenenteCanalBean",
6246-        "jboss.naming.context.java.comp.gec-ear.gec-ejb.ConsultaArquivoSinteticoBean",
6247-        "jboss.deployment.unit.\"gec-ear.ear\".beanmanager",
6248-        "jboss.naming.context.java.comp.gec-ear.gec-ejb.CemocProspeccaoBean",
6249-        "jboss.naming.context.java.comp.gec-ear.gec-ejb.ProcessadorEnvioTEDDesenrolaBean",
6250-        "jboss.naming.context.java.comp.gec-ear.gec-ejb.DAOBarramentoFactory",
6251-        "jboss.naming.context.java.comp.gec-ear.gec-ejb.EvidenciaRetencaoPdfAPIBean",
[root@caddeapllx2871 p585600]#
[root@caddeapllx2871 p585600]#
[root@caddeapllx2871 p585600]#
[root@caddeapllx2871 p585600]# ls -lt /logs/jboss/jboss-eap/standalone/sigec-portabilidade/
total 2188
-rw-r--r-- 1 root  root   496282 nov 17 12:05 console-stdout.log
-rw-r--r-- 1 jboss jboss 1025043 nov 17 12:05 server.log
-rw-r--r-- 1 jboss jboss   26466 nov 17 11:59 gc.log
-rw-r--r-- 1 jboss jboss   41327 nov 17 11:48 backupgc.log
-rw-r--r-- 1 jboss jboss  152931 nov 16 15:28 server.log.2026-11-16
-rw-r--r-- 1 jboss jboss       0 nov 16 12:26 sigec.log
-rw-r--r-- 1 jboss jboss       0 nov 16 12:26 audit.log
[root@caddeapllx2871 p585600]#
