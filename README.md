[p585600@scttqapllx0032 ~]$ ps -ef | grep jboss
root     128786      1  0 15:32 pts/2    00:00:00 su - jboss -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/usr/local/EAP-6.0.1/jboss-eap-6.0/lock/lock.file /usr/local/EAP-6.0.1/jboss-eap-6.0/bin/standalone.sh -Djboss.bind.address.management=0.0.0.0 -Djboss.socket.binding.port-offset=1
jboss    128789 128786  0 15:32 ?        00:00:00 /bin/sh /usr/local/EAP-6.0.1/jboss-eap-6.0/bin/standalone.sh -Djboss.bind.address.management=0.0.0.0 -Djboss.socket.binding.port-offset=1
jboss    128837 128789  3 15:32 ?        00:00:04 /usr/lib/jvm/java-1.7.0-openjdk-1.7.0.261.x86_64/jre/bin/java -D[Standalone] -server -XX:+UseCompressedOops -Xms1303m -Xmx1303m -XX:MaxPermSize=256m -Djava.net.preferIPv4Stack=true -Dorg.jboss.resolver.warning=true -Dsun.rmi.dgc.client.gcInterval=3600000 -Dsun.rmi.dgc.server.gcInterval=3600000 -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djboss.server.default.config=standalone.xml -Dorg.jboss.boot.log.file=/usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/log/boot.log -Dlogging.configuration=file:/usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/configuration/logging.properties -jar /usr/local/EAP-6.0.1/jboss-eap-6.0/jboss-modules.jar -mp /usr/local/EAP-6.0.1/jboss-eap-6.0/modules -jaxpmodule javax.xml.jaxp-provider org.jboss.as.standalone -Djboss.home.dir=/usr/local/EAP-6.0.1/jboss-eap-6.0 -Djboss.server.base.dir=/usr/local/EAP-6.0.1/jboss-eap-6.0/standalone -Djboss.bind.address.management=0.0.0.0 -Djboss.socket.binding.port-offset=1
p585600  129051 128566  0 15:34 pts/2    00:00:00 grep jboss
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$ tail -f /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/log/boot.log
        user.home = /home/jboss
        user.language = pt
        user.name = jboss
        user.timezone = America/Sao_Paulo
15:32:54,011 DEBUG [org.jboss.as.config] Argumentos VM: -D[Standalone] -XX:+UseCompressedOops -Xms1303m -Xmx1303m -XX:MaxPermSize=256m -Djava.net.preferIPv4Stack=true -Dorg.jboss.resolver.warning=true -Dsun.rmi.dgc.client.gcInterval=3600000 -Dsun.rmi.dgc.server.gcInterval=3600000 -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djboss.server.default.config=standalone.xml -Dorg.jboss.boot.log.file=/usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/log/boot.log -Dlogging.configuration=file:/usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/configuration/logging.properties
15:32:54,724 INFO  [org.xnio] XNIO Version 3.0.7.GA-redhat-1
15:32:54,729 INFO  [org.xnio.nio] XNIO NIO Implementation Version 3.0.7.GA-redhat-1
15:32:54,731 INFO  [org.jboss.as.server] JBAS015888: Criação de serviço de gerenciamento http usando o socket-binding (management-http)
15:32:54,744 INFO  [org.jboss.remoting] JBoss Remoting version 3.2.14.GA-redhat-1
15:32:54,767 INFO  [org.jboss.as.logging] JBAS011502: Remoção dos manuseadores de log bootstrap
^C
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$ tail -f /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/log/server.log
15:32:55,306 INFO  [com.arjuna.ats.jbossatx] (MSC service thread 1-3) ARJUNA032017: JBossTS Transaction Service (JTA version - tag: JBOSSTS_4_16_6_Final) - JBoss Inc.
15:32:55,390 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-2) JBAS010400: Limite da fonte de dados [java:/SiicoDS]
15:32:55,391 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-1) JBAS010400: Limite da fonte de dados [java:/SismhDS]
15:32:55,589 INFO  [org.apache.coyote.http11.Http11Protocol] (MSC service thread 1-4) Starting Coyote HTTP/1.1 on http-/0.0.0.0:8444
15:32:55,683 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-4) JBAS015012: Foi iniciado o FileSystemDeploymentService para o diretório /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/deployments
15:32:55,688 INFO  [org.jboss.as.remoting] (MSC service thread 1-2) JBAS017100: Escutando no 0.0.0.0:10000
15:32:55,689 INFO  [org.jboss.as.remoting] (MSC service thread 1-1) JBAS017100: Escutando no 0.0.0.0:4448
15:32:55,772 INFO  [org.jboss.as] (Controller Boot Thread) JBAS015961: A interface do gerenciamento ouvindo no http://0.0.0.0:9991/management
15:32:55,772 INFO  [org.jboss.as] (Controller Boot Thread) JBAS015951: O console de administração ouvindo no http://0.0.0.0:9991
15:32:55,772 INFO  [org.jboss.as] (Controller Boot Thread) JBAS015874: JBoss EAP 6.0.1.GA (AS 7.1.3.Final-redhat-4) iniciado em 2125ms - Iniciado 147 de serviços 230 (os serviços 81 são passivos ou em demanda)
^C
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$ grep -i -E "sismh|deployed|started in|ERROR" /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/log/server.log | tail -50
14:03:50,921 INFO  [org.jboss.as.ejb3.deployment.processors.EjbJndiBindingsDeploymentUnitProcessor] (MSC service thread 1-4) JNDI bindings for session bean named ProdutoDAO in deployment unit subdeployment "siico-ejb-1.0.57.jar" of deployment "sismh.ear" are as follows:
        java:global/sismh/siico-ejb-1.0.57/ProdutoDAO!br.gov.cef.siico.dao.produto.ProdutoDAOLocal
        java:global/sismh/siico-ejb-1.0.57/ProdutoDAO
14:03:50,921 INFO  [org.jboss.as.ejb3.deployment.processors.EjbJndiBindingsDeploymentUnitProcessor] (MSC service thread 1-4) JNDI bindings for session bean named AtendimentoProdutoDAO in deployment unit subdeployment "siico-ejb-1.0.57.jar" of deployment "sismh.ear" are as follows:
        java:global/sismh/siico-ejb-1.0.57/AtendimentoProdutoDAO!br.gov.cef.siico.dao.produto.AtendimentoProdutoDAOLocal
        java:global/sismh/siico-ejb-1.0.57/AtendimentoProdutoDAO
14:03:50,921 INFO  [org.jboss.as.ejb3.deployment.processors.EjbJndiBindingsDeploymentUnitProcessor] (MSC service thread 1-4) JNDI bindings for session bean named TipoCanalDAO in deployment unit subdeployment "siico-ejb-1.0.57.jar" of deployment "sismh.ear" are as follows:
        java:global/sismh/siico-ejb-1.0.57/TipoCanalDAO!br.gov.cef.siico.dao.produto.TipoCanalDAOLocal
        java:global/sismh/siico-ejb-1.0.57/TipoCanalDAO
14:03:50,922 INFO  [org.jboss.as.ejb3.deployment.processors.EjbJndiBindingsDeploymentUnitProcessor] (MSC service thread 1-4) JNDI bindings for session bean named UnidadeDAO in deployment unit subdeployment "siico-ejb-1.0.57.jar" of deployment "sismh.ear" are as follows:
        java:global/sismh/siico-ejb-1.0.57/UnidadeDAO!br.gov.cef.siico.dao.unidade.UnidadeDAOLocal
        java:global/sismh/siico-ejb-1.0.57/UnidadeDAO
14:03:50,922 INFO  [org.jboss.as.ejb3.deployment.processors.EjbJndiBindingsDeploymentUnitProcessor] (MSC service thread 1-4) JNDI bindings for session bean named UFDAO in deployment unit subdeployment "siico-ejb-1.0.57.jar" of deployment "sismh.ear" are as follows:
        java:global/sismh/siico-ejb-1.0.57/UFDAO!br.gov.cef.siico.dao.endereco.UFDAOLocal
        java:global/sismh/siico-ejb-1.0.57/UFDAO
14:03:50,922 INFO  [org.jboss.as.ejb3.deployment.processors.EjbJndiBindingsDeploymentUnitProcessor] (MSC service thread 1-4) JNDI bindings for session bean named FeriadoService in deployment unit subdeployment "siico-ejb-1.0.57.jar" of deployment "sismh.ear" are as follows:
        java:global/sismh/siico-ejb-1.0.57/FeriadoService!br.gov.cef.siico.service.FeriadoServiceLocal
        java:global/sismh/siico-ejb-1.0.57/FeriadoService
14:03:52,161 INFO  [org.jboss.as.ejb3.deployment.processors.EjbJndiBindingsDeploymentUnitProcessor] (MSC service thread 1-3) JNDI bindings for session bean named AutoCompleteParagrafoComponent in deployment unit subdeployment "sismh-web-2.59.36.11.war" of deployment "sismh.ear" are as follows:
        java:global/sismh/sismh-web-2.59.36.11/AutoCompleteParagrafoComponent!br.gov.cef.sismh.web.component.api.AutoCompleteParagrafoComponentLocal
        java:app/sismh-web-2.59.36.11/AutoCompleteParagrafoComponent!br.gov.cef.sismh.web.component.api.AutoCompleteParagrafoComponentLocal
        java:module/AutoCompleteParagrafoComponent!br.gov.cef.sismh.web.component.api.AutoCompleteParagrafoComponentLocal
        java:global/sismh/sismh-web-2.59.36.11/AutoCompleteParagrafoComponent
        java:app/sismh-web-2.59.36.11/AutoCompleteParagrafoComponent
14:03:52,161 INFO  [org.jboss.as.ejb3.deployment.processors.EjbJndiBindingsDeploymentUnitProcessor] (MSC service thread 1-3) JNDI bindings for session bean named ConfiguracaoRestfullAplicacao in deployment unit subdeployment "sismh-web-2.59.36.11.war" of deployment "sismh.ear" are as follows:
        java:global/sismh/sismh-web-2.59.36.11/ConfiguracaoRestfullAplicacao!br.gov.cef.sismh.web.rest.ConfiguracaoRestfullAplicacao
        java:app/sismh-web-2.59.36.11/ConfiguracaoRestfullAplicacao!br.gov.cef.sismh.web.rest.ConfiguracaoRestfullAplicacao
        java:module/ConfiguracaoRestfullAplicacao!br.gov.cef.sismh.web.rest.ConfiguracaoRestfullAplicacao
        java:global/sismh/sismh-web-2.59.36.11/ConfiguracaoRestfullAplicacao
        java:app/sismh-web-2.59.36.11/ConfiguracaoRestfullAplicacao
14:03:56,759 ERROR [org.jboss.msc.service.fail] (MSC service thread 1-2) MSC000001: Failed to start service jboss.deployment.subunit."sismh.ear"."sismh-ejb-2.59.36.11.jar".POST_MODULE: org.jboss.msc.service.StartException in service jboss.deployment.subunit."sismh.ear"."sismh-ejb-2.59.36.11.jar".POST_MODULE: JBAS018733: Falha ao processar a fase POST_MODULE do subdeployment "sismh-ejb-2.59.36.11.jar" of deployment "sismh.ear"
Caused by: java.lang.RuntimeException: JBAS018757: Ocorreu um erro ao obter a informação refletiva para o class br.gov.cef.sismh.service.comercial.SistemaComercialService com o ClassLoader ModuleClassLoader for Module "deployment.sismh.ear.sismh-ejb-2.59.36.11.jar:main" from Service Module Loader
Caused by: java.lang.OutOfMemoryError: PermGen space
14:03:58,341 WARN  [org.jboss.modules] (HttpManagementService-threads - 16) Failed to define class org.jboss.as.controller.ContainerStateMonitor$MissingDependencyInfo in Module "org.jboss.as.controller:main" from local module loader @9695ed7 (roots: /usr/local/EAP-6.0.1/jboss-eap-6.0/modules): java.lang.OutOfMemoryError: PermGen space
14:03:58,978 ERROR [org.jboss.as.controller.management-operation] (HttpManagementService-threads - 16) JBAS014612: Falha na operação ("deploy") - endereço ([("deployment" => "sismh.ear")]): java.lang.NoClassDefFoundError: org/jboss/as/controller/ContainerStateMonitor$MissingDependencyInfo
14:03:58,980 ERROR [org.jboss.as.controller.management-operation] (HttpManagementService-threads - 16) JBAS014612: Falha na operação ("deploy") - endereço ([("deployment" => "sismh.ear")]): java.lang.NoClassDefFoundError: org/jboss/as/controller/ContainerStateMonitor$MissingDependencyInfo
14:04:19,135 ERROR [org.jboss.as.controller.management-operation] (HttpManagementService-threads - 16) JBAS014612: Falha na operação ("deploy") - endereço ([("deployment" => "sismh.ear")]): java.lang.NoClassDefFoundError: org/jboss/as/controller/ContainerStateMonitor$MissingDependencyInfo
14:04:19,137 ERROR [org.jboss.as.controller.management-operation] (HttpManagementService-threads - 16) JBAS014612: Falha na operação ("deploy") - endereço ([("deployment" => "sismh.ear")]): java.lang.NoClassDefFoundError: org/jboss/as/controller/ContainerStateMonitor$MissingDependencyInfo
14:05:35,505 ERROR [org.jboss.as.controller.management-operation] (HttpManagementService-threads - 16) JBAS014612: Falha na operação ("add") - endereço ([{"deployment" => "sismh.ear"}]): java.lang.OutOfMemoryError: PermGen space
14:06:14,250 ERROR [org.jboss.as.controller.management-operation] (HttpManagementService-threads - 16) JBAS014612: Falha na operação ("add") - endereço ([{"deployment" => "sismh.ear"}]): java.lang.OutOfMemoryError: PermGen space
14:11:27,143 ERROR [org.jboss.as.controller.management-operation] (HttpManagementService-threads - 19) JBAS014612: Falha na operação ("add") - endereço ([{"deployment" => "sismh_2.59.36.11.ear"}]): java.lang.OutOfMemoryError: PermGen space
14:11:45,109 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-4) JBAS015876: Iniciando a implantação do "sismh_2.59.35.11a.ear"
14:12:08,529 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-4) JBAS015852: Não foi possível classificar o índice module-info.class no /content/sismh_2.59.35.11a.ear/lib/lombok-1.18.8.jar: java.lang.IllegalStateException: Unknown tag! pos=2 poolCount = 44
14:12:10,053 ERROR [org.jboss.msc.service.fail] (MSC service thread 1-4) MSC000001: Failed to start service jboss.deployment.unit."sismh_2.59.35.11a.ear".STRUCTURE: org.jboss.msc.service.StartException in service jboss.deployment.unit."sismh_2.59.35.11a.ear".STRUCTURE: JBAS018733: Falha ao processar a fase STRUCTURE do deployment "sismh_2.59.35.11a.ear"
Caused by: java.lang.OutOfMemoryError: PermGen space
14:12:10,054 ERROR [org.jboss.as.controller.management-operation] (HttpManagementService-threads - 17) JBAS014612: Falha na operação ("deploy") - endereço ([("deployment" => "sismh_2.59.35.11a.ear")]): java.lang.NoClassDefFoundError: org/jboss/as/controller/ContainerStateMonitor$MissingDependencyInfo
14:12:10,055 ERROR [org.jboss.as.controller.management-operation] (HttpManagementService-threads - 17) JBAS014612: Falha na operação ("deploy") - endereço ([("deployment" => "sismh_2.59.35.11a.ear")]): java.lang.NoClassDefFoundError: org/jboss/as/controller/ContainerStateMonitor$MissingDependencyInfo
14:18:02,567 ERROR [org.apache.catalina.connector.CoyoteAdapter] (thread_size-threads - 7933) An exception or error occurred in the container during the request processing: java.lang.OutOfMemoryError: PermGen space
14:18:05,447 ERROR [org.apache.coyote.http11.Http11Processor] (thread_size-threads - 7933) Error finishing response: java.lang.OutOfMemoryError: PermGen space
15:32:55,391 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-1) JBAS010400: Limite da fonte de dados [java:/SismhDS]
[p585600@scttqapllx0032 ~]$
