
[p585600@caddeapllx2854 ~]$ sudo su

Presumimos que você recebeu as instruções de sempre do administrador
de sistema local. Basicamente, resume-se a estas três coisas:

    #1) Respeite a privacidade dos outros.
    #2) Pense antes de digitar.
    #3) Com grandes poderes vêm grandes responsabilidades.

[sudo] senha para p585600:
[root@caddeapllx2854 p585600]# ps -ef | grep [j]ava | grep -oE "jboss.home.dir=[^ ]*|jboss.server.log.dir=[^ ]*|-c [^ ]*"
jboss.home.dir=/opt/jboss-eap
jboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sigsj-internet
-c standalone-full-ha.xml
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]# LOG=<jboss.server.log.dir>/server.log
bash: jboss.server.log.dir: Arquivo ou diretório inexistente
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]# grep -nE "WFLYCTL0412|WFLYCTL0180|missing|SIGSJ04|datasources|WFLYJCA|Driver" $LOG | tail -40
^C
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]# grep -nE "WFLYCTL0412|WFLYCTL0180|missing|SIGSJ04|datasources|WFLYJCA|Driver" $LOG | tail -40



^C
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]# JH=<jboss.home.dir>
bash: erro de sintaxe próximo ao token inesperado `newline'
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]# $JH/bin/jboss-cli.sh --connect --controller=10.116.202.45:9990 --commands="/subsystem=datasources:read-children-names(child-type=data-source),/subsystem=datasources:read-children-names(child-type=xa-data-source),/subsystem=datasources:read-children-names(child-type=jdbc-driver)"
ls $JH/modules/com/oracle* $JH/modules/system/layers/base/com/oracle* 2>/dev/null
bash: /bin/jboss-cli.sh: Arquivo ou diretório inexistente
[root@caddeapllx2854 p585600]#






em paralento o ajuse feito no intranet nao deu bom olha  olog da release que ta rodando agroa

2026-10-22 15:39:41,129 ERROR [org.jboss.msc.service.fail] (MSC service thread 1-1) MSC000001: Failed to start service jboss.deployment.subunit."sigsj_intranet-ear.ear"."sigsj_intranet.war".POST_MODULE: org.jboss.msc.service.StartException in service jboss.deployment.subunit."sigsj_intranet-ear.ear"."sigsj_intranet.war".POST_MODULE: WFLYSRV0153: Falha ao processar a fase POST_MODULE de subdeployment "sigsj_intranet.war" of deployment "sigsj_intranet-ear.ear"
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:189)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1739)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1701)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1559)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1363)
        at java.lang.Thread.run(Thread.java:750)
Caused by: java.lang.RuntimeException: WFLYSRV0177: Ocorreu um erro ao obter a informação reflexiva para o class br.gov.caixa.sirot.ejb.SIROTConImpl com o ClassLoader ModuleClassLoader for Module "deployment.sigsj_intranet-ear.ear.sigsj_intranet.war" from Service Module Loader
        at org.jboss.as.server.deployment.reflect.DeploymentReflectionIndex.getClassIndex(DeploymentReflectionIndex.java:78)
        at org.jboss.as.server.deployment.reflect.ClassReflectionIndexUtil.findMethod(ClassReflectionIndexUtil.java:57)
        at org.jboss.as.ejb3.deployment.processors.dd.DeploymentDescriptorMethodProcessor.handleStatelessSessionBean(DeploymentDescriptorMethodProcessor.java:99)
        at org.jboss.as.ejb3.deployment.processors.dd.DeploymentDescriptorMethodProcessor.deploy(DeploymentDescriptorMethodProcessor.java:76)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:182)
        ... 8 more
Caused by: java.lang.NoClassDefFoundError: Lbr/gov/caixa/log/Log;
        at java.lang.Class.getDeclaredFields0(Native Method)
        at java.lang.Class.privateGetDeclaredFields(Class.java:2583)
        at java.lang.Class.getDeclaredFields(Class.java:1916)
        at org.jboss.as.server.deployment.reflect.ClassReflectionIndex.<init>(ClassReflectionIndex.java:72)
        at org.jboss.as.server.deployment.reflect.DeploymentReflectionIndex.getClassIndex(DeploymentReflectionIndex.java:70)
        ... 12 more
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.log.Log from [Module "deployment.sigsj_intranet-ear.ear.sigsj_intranet.war" from Service Module Loader]
        at org.jboss.modules.ModuleClassLoader.findClass(ModuleClassLoader.java:255)
        at org.jboss.modules.ConcurrentClassLoader.performLoadClassUnchecked(ConcurrentClassLoader.java:410)
        at org.jboss.modules.ConcurrentClassLoader.performLoadClass(ConcurrentClassLoader.java:398)
        at org.jboss.modules.ConcurrentClassLoader.loadClass(ConcurrentClassLoader.java:116)
        ... 17 more

2026-10-22 15:39:41,132 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("deploy") - endereço ([("deployment" => "sigsj_intranet-ear.ear")]) - falha na descrição: {
    "WFLYCTL0080: Falha de serviços" => {"jboss.deployment.subunit.\"sigsj_intranet-ear.ear\".\"sigsj_intranet.war\".POST_MODULE" => "WFLYSRV0153: Falha ao processar a fase POST_MODULE de subdeployment \"sigsj_intranet.war\" of deployment \"sigsj_intranet-ear.ear\"
    Caused by: java.lang.RuntimeException: WFLYSRV0177: Ocorreu um erro ao obter a informação reflexiva para o class br.gov.caixa.sirot.ejb.SIROTConImpl com o ClassLoader ModuleClassLoader for Module \"deployment.sigsj_intranet-ear.ear.sigsj_intranet.war\" from Service Module Loader
    Caused by: java.lang.NoClassDefFoundError: Lbr/gov/caixa/log/Log;
    Caused by: java.lang.ClassNotFoundException: br.gov.caixa.log.Log from [Module \"deployment.sigsj_intranet-ear.ear.sigsj_intranet.war\" from Service Module Loader]"},
    "WFLYCTL0412: Serviços necessários que não estão instalados:" => [
        "jboss.deployment.unit.\"sigsj_intranet-ear.ear\".WeldStartService",
        "jboss.deployment.subunit.\"sigsj_intranet-ear.ear\".\"sigsjintrastatic.war\".beanmanager",
        "jboss.deployment.unit.\"sigsj_intranet-ear.ear\".beanmanager"
    ],
    "WFLYCTL0180: Os serviços com falta/indisponibilidade de dependências " => [
        "jboss.deployment.unit.\"sigsj_intranet-ear.ear\".weld.weldClassIntrospector faltam [jboss.deployment.unit.\"sigsj_intranet-ear.ear\".WeldStartService, jboss.deployment.unit.\"sigsj_intranet-ear.ear\".beanmanager]",
        "jboss.deployment.subunit.\"sigsj_intranet-ear.ear\".\"sigsjintrastatic.war\".batch.artifact.factory faltam [jboss.deployment.subunit.\"sigsj_intranet-ear.ear\".\"sigsjintrastatic.war\".beanmanager]"
    ]
}
2026-10-22 15:39:41,210 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 43) WFLYSRV0010: "sirotcon-ejb.jar" foi implantado (runtime-name: "sirotcon-ejb.jar")
2026-10-22 15:39:41,211 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 43) WFLYSRV0010: "sigsj_intranet-ear.ear" foi implantado (runtime-name: "sigsj_intranet-ear.ear")
2026-10-22 15:39:41,214 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0183: Relatório
de status de serviçoWFLYCTL0184: Não falta/insatisfaz nenhuma das dependências:
service jboss.deployment.subunit."sigsj_intranet-ear.ear"."sigsjintrastatic.war".beanmanager (faltam) dependentes: [service jboss.deployment.subunit."sigsj_intranet-ear.ear"."sigsjintrastatic.war".batch.artifact.factory]
service jboss.deployment.unit."sigsj_intranet-ear.ear".WeldStartService (faltam) dependentes: [service jboss.deployment.unit."sigsj_intranet-ear.ear".weld.weldClassIntrospector]
service jboss.deployment.unit."sigsj_intranet-ear.ear".beanmanager (faltam) dependentes: [service jboss.deployment.unit."sigsj_intranet-ear.ear".weld.weldClassIntrospector]
WFLYCTL0186: Serviços que falham na inicialização:      service jboss.deployment.subunit."sigsj_intranet-ear.ear"."sigsj_intranet.war".POST_MODULE: WFLYSRV0153: Falha ao processar a fase POST_MODULE de subdeployment "sigsj_intranet.war" of deployment "sigsj_intranet-ear.ear"
WFLYCTL0448: 3 serviços adicionais estão inativos devido a ausência ou falha das suas dependências
2026-10-22 15:39:41,245 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Retomando servidor
2026-10-22 15:39:41,248 ERROR [org.jboss.as] (Controller Boot Thread) WFLYSRV0026: JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001) iniciado (com erros) em 8210ms - Iniciado(s) 571 de serviços 778 (7 serviços falharam ou tinham dependências ausentes, os serviços 366 estão lentos, passivos ou sob demanda)
2026-10-22 15:39:41,250 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0060: A interface de gerenciamento http escutando em http://0.0.0.0:9990/management
2026-10-22 15:39:41,250 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0051: O console de administração escutando em http://0.0.0.0:9990
2026-10-22 15:39:45,664 ERROR [org.jboss.modcluster] (UndertowEventHandlerAdapterService - 1) MODCLUSTER000043: Failed to send INFO command to localhost/127.0.0.1:6666: Conexão recusada (Connection refused)

 
