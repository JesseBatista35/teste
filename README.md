[root@caddeapllx2484 verificacao_sicmu2]# grep -B 5 -A 30 "SICMU-ear" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | grep -A 30 "ERROR\|SEVERE" | tail -60
        at org.jboss.modules.ModuleLoader.loadModule(ModuleLoader.java:303)
        at org.jboss.modules.ModuleLoader.loadModule(ModuleLoader.java:287)
        at org.jboss.as.server.moduleservice.ModuleLoadService.start(ModuleLoadService.java:93)
        ... 8 more

2026-08-26 09:50:30,825 ERROR [org.jboss.msc.service.fail] (MSC service thread 1-4) MSC000001: Failed to start service jboss.module.service."deployment.SICMU-ear.ear.SICMU-ejb.jar".main: org.jboss.msc.service.StartException in service jboss.module.service."deployment.SICMU-ear.ear.SICMU-ejb.jar".main: WFLYSRV0179: Falha ao carregar o módulo: deployment.SICMU-ear.ear.SICMU-ejb.jar
        at org.jboss.as.server.moduleservice.ModuleLoadService.start(ModuleLoadService.java:116)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1739)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1701)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1559)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1363)
        at java.lang.Thread.run(Thread.java:748)
Caused by: org.jboss.modules.ModuleNotFoundException: br.gov.caixa.psc.connector
        at org.jboss.modules.Module.addPaths(Module.java:1288)
        at org.jboss.modules.Module.link(Module.java:1644)
        at org.jboss.modules.Module.relinkIfNecessary(Module.java:1672)
        at org.jboss.modules.ModuleLoader.loadModule(ModuleLoader.java:303)
        at org.jboss.modules.ModuleLoader.loadModule(ModuleLoader.java:287)
        at org.jboss.as.server.moduleservice.ModuleLoadService.start(ModuleLoadService.java:93)
        ... 8 more

2026-08-26 09:50:30,925 INFO  [org.infinispan.CONFIG] (MSC service thread 1-4) ISPN000152: Passivation configured without an eviction policy being selected. Only manually evicted entities will be passivated.
2026-08-26 09:50:30,935 INFO  [org.infinispan.CONFIG] (MSC service thread 1-4) ISPN000152: Passivation configured without an eviction policy being selected. Only manually evicted entities will be passivated.
2026-08-26 09:50:31,036 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 71) AMQ221000: live Message Broker is starting with configuration Broker Configuration (clustered=true,journalDirectory=/opt/jboss-eap/standalone/data/activemq/journal,bindingsDirectory=/opt/jboss-eap/standalone/data/activemq/bindings,largeMessagesDirectory=/opt/jboss-eap/standalone/data/activemq/largemessages,pagingDirectory=/opt/jboss-eap/standalone/data/activemq/paging)
2026-08-26 09:50:31,050 INFO  [org.jboss.as.connector.deployers.RADeployer] (MSC service thread 1-4) IJ020001: Required license terms for file:/opt/jboss-eap/standalone/tmp/vfs/temp/temp63e78c03ced1a11b/content-de357075d1fdc6e1/contents/
2026-08-26 09:50:31,221 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 71) AMQ221012: Using AIO Journal
2026-08-26 09:50:31,224 INFO  [org.infinispan.PERSISTENCE] (ServerService Thread Pool -- 70) ISPN000556: Starting user marshaller 'org.wildfly.clustering.infinispan.spi.marshalling.InfinispanProtoStreamMarshaller'
2026-08-26 09:50:31,592 ERROR [stderr] (MSC service thread 1-4) Could not initialize log file, java.nio.file.AccessDeniedException: mqjms.log.0.lck
2026-08-26 09:50:31,597 ERROR [stderr] (MSC service thread 1-4) 26 de Agosto de 2026 9h50min31s BRT[MSC service thread 1-4] ResourceAdapterImpl
2026-08-26 09:50:31,597 ERROR [stderr] (MSC service thread 1-4) Sistema de mensagens do WMQ: '9.0.4.0-p904-L171030.1'.
2026-08-26 09:50:31,597 ERROR [stderr] (MSC service thread 1-4)
2026-08-26 09:50:31,597 ERROR [stderr] (MSC service thread 1-4) EXPLICAÇÃO:
2026-08-26 09:50:31,597 ERROR [stderr] (MSC service thread 1-4) null
--
2026-08-26 09:50:32,841 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-3) WFLYJCA0007: Criação de conexão registrada java:/JmsXA
2026-08-26 09:50:32,925 INFO  [org.apache.activemq.artemis.ra] (MSC service thread 1-3) AMQ151007: Resource adaptor started
2026-08-26 09:50:32,925 INFO  [org.jboss.as.connector.services.resourceadapters.ResourceAdapterActivatorService$ResourceAdapterActivator] (MSC service thread 1-3) IJ020002: Deployed: file://RaActivatoractivemq-ra
2026-08-26 09:50:32,929 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-3) WFLYJCA0002: Conectores de Jakarta vinculados ConnectionFactory [java:/JmsXA]
2026-08-26 09:50:32,929 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-3) WFLYJCA0118: Vínculo de criação de conexão chamado java:/JmsXA para o alias java:jboss/DefaultJMSConnectionFactory
2026-08-26 09:50:32,936 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("deploy") - endereço ([("deployment" => "SICMU-ear.ear")]) - falha na descrição: {"WFLYCTL0080: Falha de serviços" => {
    "jboss.module.service.\"deployment.SICMU-ear.ear.SICMU-ejb.jar\".main" => "WFLYSRV0179: Falha ao carregar o módulo: deployment.SICMU-ear.ear.SICMU-ejb.jar
    Caused by: org.jboss.modules.ModuleNotFoundException: br.gov.caixa.psc.connector",
    "jboss.module.service.\"deployment.SICMU-ear.ear.SICMU-web.war\".main" => "WFLYSRV0179: Falha ao carregar o módulo: deployment.SICMU-ear.ear.SICMU-web.war
    Caused by: org.jboss.modules.ModuleNotFoundException: br.gov.caixa.psc.connector"
}}
2026-08-26 09:50:32,958 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 40) WFLYSRV0010: "applicationinsights-agent.jar" foi implantado (runtime-name: "applicationinsights-agent.jar")
2026-08-26 09:50:32,958 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 40) WFLYSRV0010: "framework.jar" foi implantado (runtime-name: "framework.jar")
2026-08-26 09:50:32,958 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 40) WFLYSRV0010: "wmq.jmsra.rar" foi implantado (runtime-name: "wmq.jmsra.rar")
2026-08-26 09:50:32,958 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 40) WFLYSRV0010: "SICMU-ear.ear" foi implantado (runtime-name: "SICMU-ear.ear")
2026-08-26 09:50:32,964 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0183: Relatório
 de status de serviçoWFLYCTL0186: Serviços que falham na inicialização:      service jboss.module.service."deployment.SICMU-ear.ear.SICMU-ejb.jar".main: WFLYSRV0179: Falha ao carregar o módulo: deployment.SICMU-ear.ear.SICMU-ejb.jar
      service jboss.module.service."deployment.SICMU-ear.ear.SICMU-web.war".main: WFLYSRV0179: Falha ao carregar o módulo: deployment.SICMU-ear.ear.SICMU-web.war
WFLYCTL0448: 2 serviços adicionais estão inativos devido a ausência ou falha das suas dependências
2026-08-26 09:50:33,000 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Retomando servidor
2026-08-26 09:50:33,003 ERROR [org.jboss.as] (Controller Boot Thread) WFLYSRV0026: JBoss EAP 7.4.8.GA (WildFly Core 15.0.19.Final-redhat-00001) iniciado (com erros) em 9947ms - Iniciado(s) 682 de serviços 889 (5 serviços falharam ou tinham dependências ausentes, os serviços 416 estão lentos, passivos ou sob demanda)
2026-08-26 09:50:33,004 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0060: A interface de gerenciamento http escutando em http://0.0.0.0:9990/management
2026-08-26 09:50:33,004 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0051: O console de administração escutando em http://0.0.0.0:9990
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]# grep -i "error\|exception\|failed" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | tail -30
2026-08-26 09:44:58,859 ERROR [stderr] (MSC service thread 1-3) EXPLICAÇÃO:
2026-08-26 09:44:58,859 ERROR [stderr] (MSC service thread 1-3) null
2026-08-26 09:44:58,859 ERROR [stderr] (MSC service thread 1-3)
2026-08-26 09:44:58,859 ERROR [stderr] (MSC service thread 1-3) AÇÃO:
2026-08-26 09:44:58,859 ERROR [stderr] (MSC service thread 1-3) null
2026-08-26 09:44:58,859 ERROR [stderr] (MSC service thread 1-3) --------------------------------------------------------------------
2026-08-26 09:44:59,380 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("deploy") - endereço ([("deployment" => "SICMU-ear.ear")]) - falha na descrição: {"WFLYCTL0080: Falha de serviços" => {
    Caused by: org.jboss.modules.ModuleNotFoundException: br.gov.caixa.psc.connector",
    Caused by: org.jboss.modules.ModuleNotFoundException: br.gov.caixa.psc.connector"
2026-08-26 09:44:59,531 ERROR [org.jboss.as] (Controller Boot Thread) WFLYSRV0026: JBoss EAP 7.4.8.GA (WildFly Core 15.0.19.Final-redhat-00001) iniciado (com erros) em 9748ms - Iniciado(s) 682 de serviços 889 (5 serviços falharam ou tinham dependências ausentes, os serviços 416 estão lentos, passivos ou sob demanda)
2026-08-26 09:50:26,655 ERROR [org.jboss.modcluster] (UndertowEventHandlerAdapterService - 1) MODCLUSTER000043: Failed to send INFO command to /127.0.0.1:6666: Conexão recusada (Connection refused)
2026-08-26 09:50:26,656 ERROR [org.jboss.modcluster] (UndertowEventHandlerAdapterService - 1) MODCLUSTER000043: Failed to send INFO command to /127.0.0.2:6666: Conexão recusada (Connection refused)
2026-08-26 09:50:30,820 ERROR [org.jboss.msc.service.fail] (MSC service thread 1-4) MSC000001: Failed to start service jboss.module.service."deployment.SICMU-ear.ear.SICMU-web.war".main: org.jboss.msc.service.StartException in service jboss.module.service."deployment.SICMU-ear.ear.SICMU-web.war".main: WFLYSRV0179: Falha ao carregar o módulo: deployment.SICMU-ear.ear.SICMU-web.war
Caused by: org.jboss.modules.ModuleNotFoundException: br.gov.caixa.psc.connector
2026-08-26 09:50:30,825 ERROR [org.jboss.msc.service.fail] (MSC service thread 1-4) MSC000001: Failed to start service jboss.module.service."deployment.SICMU-ear.ear.SICMU-ejb.jar".main: org.jboss.msc.service.StartException in service jboss.module.service."deployment.SICMU-ear.ear.SICMU-ejb.jar".main: WFLYSRV0179: Falha ao carregar o módulo: deployment.SICMU-ear.ear.SICMU-ejb.jar
Caused by: org.jboss.modules.ModuleNotFoundException: br.gov.caixa.psc.connector
2026-08-26 09:50:31,592 ERROR [stderr] (MSC service thread 1-4) Could not initialize log file, java.nio.file.AccessDeniedException: mqjms.log.0.lck
2026-08-26 09:50:31,597 ERROR [stderr] (MSC service thread 1-4) 26 de Agosto de 2026 9h50min31s BRT[MSC service thread 1-4] ResourceAdapterImpl
2026-08-26 09:50:31,597 ERROR [stderr] (MSC service thread 1-4) Sistema de mensagens do WMQ: '9.0.4.0-p904-L171030.1'.
2026-08-26 09:50:31,597 ERROR [stderr] (MSC service thread 1-4)
2026-08-26 09:50:31,597 ERROR [stderr] (MSC service thread 1-4) EXPLICAÇÃO:
2026-08-26 09:50:31,597 ERROR [stderr] (MSC service thread 1-4) null
2026-08-26 09:50:31,597 ERROR [stderr] (MSC service thread 1-4)
2026-08-26 09:50:31,597 ERROR [stderr] (MSC service thread 1-4) AÇÃO:
2026-08-26 09:50:31,597 ERROR [stderr] (MSC service thread 1-4) null
2026-08-26 09:50:31,597 ERROR [stderr] (MSC service thread 1-4) --------------------------------------------------------------------
2026-08-26 09:50:32,936 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("deploy") - endereço ([("deployment" => "SICMU-ear.ear")]) - falha na descrição: {"WFLYCTL0080: Falha de serviços" => {
    Caused by: org.jboss.modules.ModuleNotFoundException: br.gov.caixa.psc.connector",
    Caused by: org.jboss.modules.ModuleNotFoundException: br.gov.caixa.psc.connector"
2026-08-26 09:50:33,003 ERROR [org.jboss.as] (Controller Boot Thread) WFLYSRV0026: JBoss EAP 7.4.8.GA (WildFly Core 15.0.19.Final-redhat-00001) iniciado (com erros) em 9947ms - Iniciado(s) 682 de serviços 889 (5 serviços falharam ou tinham dependências ausentes, os serviços 416 estão lentos, passivos ou sob demanda)
[root@caddeapllx2484 verificacao_sicmu2]#
