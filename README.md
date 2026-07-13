-sh-4.2$ grep -i -A 30 "siamc" /logs/jboss/jboss-eap/standalone/siamc-dev-internet/server.log | tail -100

        logging.configuration = file:/opt/jboss-eap/standalone/configuration/logging.properties
        module.path = /opt/jboss-eap/modules
        org.jboss.boot.log.file = /logs/jboss/jboss-eap/standalone/siamc-dev-internet/server.log
        org.jboss.resolver.warning = true
        os.arch = amd64
        os.name = Linux
        os.version = 3.10.0-1160.el7.x86_64
        path.separator = :
        sun.arch.data.model = 64
        sun.boot.library.path = /usr/lib/jvm/java-11-openjdk-11.0.25.0.9-1.el7_9.x86_64/lib
        sun.cpu.endian = little
        sun.cpu.isalist =
        sun.io.unicode.encoding = UnicodeLittle
        sun.java.command = /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/siamc-dev-internet -c standalone-full-ha.xml
        sun.java.launcher = SUN_STANDARD
        sun.jnu.encoding = UTF-8
        sun.management.compiler = HotSpot 64-Bit Tiered Compilers
        sun.os.patch.level = unknown
        sun.util.logging.disableCallerCheck = true
        user.country = BR
        user.dir = /
        user.home = /home/jboss
        user.language = pt
        user.name = jboss
        user.timezone = America/Sao_Paulo
2026-07-13 13:56:03,034 DEBUG [org.jboss.as.config] (MSC service thread 1-1) Argumentos da VM: -D[Standalone] -Xlog:gc*:file=/logs/jboss/jboss-eap/standalone/siamc-dev-internet/gc.log:time,uptimemillis:filecount=5,filesize=3M -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -Xms1024m -Xmx2048m -XX:MetaspaceSize=256m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager,sun.security.ec -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Dcom.redhat.fips=false -Djboss.modules.policy-permissions=true -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager --add-exports=java.base/sun.nio.ch=ALL-UNNAMED --add-exports=jdk.unsupported/sun.misc=ALL-UNNAMED --add-exports=jdk.unsupported/sun.reflect=ALL-UNNAMED --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-opens=java.base/com.sun.net.ssl.internal.ssl=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/siamc-dev-internet/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties
2026-07-13 13:56:03,864 INFO  [org.wildfly.security] (ServerService Thread Pool -- 29) ELY00001: WildFly Elytron version 1.15.23.Final-redhat-00001
2026-07-13 13:56:04,141 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 20) WFLYCTL0033: A extensão 'security' é obsoleta e talvez não seja suportada em versões futuras
2026-07-13 13:56:04,320 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: O atributo 'security-realm' no recurso, no endereço '/core-service=management/management-interface=http-interface', é obsoleto e pode ser removido em uma versão futura. Veja a descrição do atributo no resultado da operação read-resource-description para saber mais sobre a substituição.
2026-07-13 13:56:04,365 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 9) WFLYCTL0028: O atributo 'security-realm' no recurso, no endereço '/subsystem=undertow/server=default-server/https-listener=https', é obsoleto e pode ser removido em uma versão futura. Veja a descrição do atributo no resultado da operação read-resource-description para saber mais sobre a substituição.
2026-07-13 13:56:04,362 INFO  [org.jboss.as.server.deployment.scanner] (DeploymentScanner-threads - 1) WFLYDS0015: A nova tentativa implantação de siamc-ear.ear falhou
2026-07-13 13:56:04,566 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Criando serviço de gerenciamento http usando o socket-binding (management-http)
2026-07-13 13:56:04,579 INFO  [org.xnio] (MSC service thread 1-3) XNIO version 3.8.16.Final-redhat-00001
2026-07-13 13:56:04,592 INFO  [org.xnio.nio] (MSC service thread 1-3) XNIO NIO Implementation Version 3.8.16.Final-redhat-00001
2026-07-13 13:56:04,625 INFO  [org.jboss.remoting] (MSC service thread 1-4) JBoss Remoting version 5.0.29.Final-redhat-00001
2026-07-13 13:56:04,793 INFO  [org.wildfly.extension.health] (ServerService Thread Pool -- 50) WFLYHEALTH0001: Ativando o Subsistema Básico de integridade
2026-07-13 13:56:04,806 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 51) WFLYCLINF0001: Ativação do subsistema Infinispan.
2026-07-13 13:56:04,821 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 53) WFLYRS0016: RESTEasy versão 3.15.9.Final-redhat-00001
2026-07-13 13:56:04,757 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 42) WFLYJCA0005: Implantação do driver não compatível-JDBC class org.postgresql.Driver (versão 42.7)
2026-07-13 13:56:04,832 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 69) WFLYTX0013: O atributo node-identifier em /subsystem=transactions está definido com o valor padrão. Isso é perigoso para ambientes executando vários servidores. Certifique-se de que o valor do atributo é exclusivo.
2026-07-13 13:56:04,850 INFO  [org.jboss.as.jsf] (ServerService Thread Pool -- 58) WFLYJSF0007: Ativadas as seguintes implantações do Jakarta Server Faces: [main]
2026-07-13 13:56:04,852 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 61) WFLYNAM0001: Ativação do Subsistema de Nomeação
2026-07-13 13:56:04,855 INFO  [org.jboss.as.security] (ServerService Thread Pool -- 67) WFLYSEC0002: Ativação do Subsistema de Segurança
2026-07-13 13:56:04,874 INFO  [org.jboss.as.connector] (MSC service thread 1-2) WFLYJCA0009: Inicialização do Subsistema Jakarta Connectors (WildFly/IronJacamar 1.5.17.Final-redhat-00001)
2026-07-13 13:56:04,899 INFO  [org.jboss.as.webservices] (ServerService Thread Pool -- 71) WFLYWS0002: Ativação da Extensão WebServices
2026-07-13 13:56:04,932 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 52) WFLYIO001: O operador 'default' configurou automaticamente para as threads de E/S 4 com o máximo de 32 threads de tarefas com base em seus 2 processadores disponíveis.
2026-07-13 13:56:04,941 INFO  [org.wildfly.extension.metrics] (ServerService Thread Pool -- 60) WFLYMETRICS0001: Ativando o subsistema de métricas de base
2026-07-13 13:56:05,002 INFO  [org.jboss.as.security] (MSC service thread 1-3) WFLYSEC0001: Versão =5.0.3.Final-redhat-00009 PicketBox atual
2026-07-13 13:56:05,111 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-2) WFLYJCA0018: Serviço de driver iniciado com nome-do-driver = postgresql
2026-07-13 13:56:05,130 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0003: Iniciando Undertow 2.2.33.SP1-redhat-00001
2026-07-13 13:56:05,181 INFO  [org.jboss.as.naming] (MSC service thread 1-2) WFLYNAM0003: Iniciando o Serviço de Nomeação
2026-07-13 13:56:05,197 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 70) WFLYUT0014: Criando identificador de arquivo para caminho de acesso '/opt/jboss-eap/welcome-content' com as opções [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
2026-07-13 13:56:05,256 INFO  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0481: O pool estrito slsb-strict-max-pool está utilizando um tamanho de instância máximo de 32 (por classe) que é derivado do tamanho de pool do thead de trabalho.
2026-07-13 13:56:05,261 INFO  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0482: O pool estrito mdb-strict-max-pool está utilizando um tamanho de instância máximo de 8 (por classe) que é derivado do número de CPUs neste host.
2026-07-13 13:56:05,266 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-2) WFLYMAIL0001: Sessão de e-mail associada [java:jboss/mail/expresso]
2026-07-13 13:56:05,341 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-2) WFLYELY00023: O arquivo '/opt/jboss-eap/standalone/configuration/application.keystore' da KeyStore não existe. Usado em branco.
2026-07-13 13:56:05,364 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-2) WFLYELY01084: KeyStore /opt/jboss-eap/standalone/configuration/application.keystore não encontrado; ele será gerado automaticamente na primeira utilização com um certificado autoassinado para o host localhost
2026-07-13 13:56:05,370 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0012: Servidor default-server foi iniciado.
2026-07-13 13:56:05,501 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) Queuing requests.
2026-07-13 13:56:05,501 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0018: Iniciando host default-host
2026-07-13 13:56:05,545 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0006: UndertowHTTP ouvinte default escutando em 0.0.0.0:8080
--
2026-07-13 13:56:05,674 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0027: Iniciando a implantação do "siamc-ear.ear" (runtime-name: "siamc-ear.ear")
2026-07-13 13:56:05,687 ERROR [stderr] (MSC service thread 1-3) jul 13, 2026 1:56:05 PM java.io.ObjectInputFilter$Config lambda$static$0
2026-07-13 13:56:05,704 ERROR [stderr] (MSC service thread 1-3) INFO: Creating serialization filter from maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000
2026-07-13 13:56:05,733 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0006: UndertowHTTPS ouvinte https escutando em 0.0.0.0:8443
2026-07-13 13:56:05,827 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-3) WFLYJCA0001: Fonte de dados vinculada[java:/SiamcDS]
2026-07-13 13:56:05,914 INFO  [org.jboss.ws.common.management] (MSC service thread 1-2) JBWS022052: Starting JBossWS 5.4.9.Final-redhat-00001 (Apache CXF 3.5.8.redhat-00001)
2026-07-13 13:56:06,168 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0207: Iniciando a subimplantação (runtime-name: "siamc-web-3.0.0-SNAPSHOT.war")
2026-07-13 13:56:07,355 WARN  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0118: [Especificação Jakarta Enterprise Beans 3.1, seção 4.9.2] A classe da implementação do bean de sessão NÂO PODE ser uma interface - br.gov.cef.siamc.service.sisdu.LoginSisduServiceLocal é uma interface, portanto não poderá ser considerado como um bean de sessão
2026-07-13 13:56:07,495 INFO  [org.jboss.as.jpa] (MSC service thread 1-2) WFLYJPA0002: Ler persistence.xml para siamc
2026-07-13 13:56:07,506 ERROR [org.jboss.msc.service.fail] (MSC service thread 1-3) MSC000001: Failed to start service jboss.deployment.subunit."siamc-ear.ear"."siamc-web-3.0.0-SNAPSHOT.war".DEPENDENCIES: org.jboss.msc.service.StartException in service jboss.deployment.subunit."siamc-ear.ear"."siamc-web-3.0.0-SNAPSHOT.war".DEPENDENCIES: WFLYSRV0153: Falha ao processar a fase DEPENDENCIES de subdeployment "siamc-web-3.0.0-SNAPSHOT.war" of deployment "siamc-ear.ear"
        at org.jboss.as.server@15.0.37.Final-redhat-00001//org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:189)
        at org.jboss.msc@1.4.13.Final-redhat-00001//org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1739)
        at org.jboss.msc@1.4.13.Final-redhat-00001//org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1701)
        at org.jboss.msc@1.4.13.Final-redhat-00001//org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1559)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
        at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: java.lang.RuntimeException: Legacy WildFly security layer is no longer supported by the Keycloak WildFly adapter
        at org.keycloak.keycloak-wildfly-subsystem@22.0.5//org.keycloak.subsystem.adapter.extension.KeycloakDependencyProcessorWildFly.addPlatformSpecificModules(KeycloakDependencyProcessorWildFly.java:42)
        at org.keycloak.keycloak-wildfly-subsystem@22.0.5//org.keycloak.subsystem.adapter.extension.KeycloakDependencyProcessor.deploy(KeycloakDependencyProcessor.java:66)
        at org.jboss.as.server@15.0.37.Final-redhat-00001//org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:182)
        ... 8 more

2026-07-13 13:56:07,510 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("deploy") - endereço ([("deployment" => "siamc-ear.ear")]) - falha na descrição: {"WFLYCTL0080: Falha de serviços" => {"jboss.deployment.subunit.\"siamc-ear.ear\".\"siamc-web-3.0.0-SNAPSHOT.war\".DEPENDENCIES" => "WFLYSRV0153: Falha ao processar a fase DEPENDENCIES de subdeployment \"siamc-web-3.0.0-SNAPSHOT.war\" of deployment \"siamc-ear.ear\"
    Caused by: java.lang.RuntimeException: Legacy WildFly security layer is no longer supported by the Keycloak WildFly adapter"}}
2026-07-13 13:56:07,582 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 43) WFLYSRV0010: "siamc-ear.ear" foi implantado (runtime-name: "siamc-ear.ear")
2026-07-13 13:56:07,584 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0183: Relatório
 de status de serviçoWFLYCTL0186: Serviços que falham na inicialização:      service jboss.deployment.subunit."siamc-ear.ear"."siamc-web-3.0.0-SNAPSHOT.war".DEPENDENCIES: WFLYSRV0153: Falha ao processar a fase DEPENDENCIES de subdeployment "siamc-web-3.0.0-SNAPSHOT.war" of deployment "siamc-ear.ear"

2026-07-13 13:56:07,650 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Retomando servidor
2026-07-13 13:56:07,653 ERROR [org.jboss.as] (Controller Boot Thread) WFLYSRV0026: JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001) iniciado (com erros) em 5251ms - Iniciado(s) 335 de serviços 575 (2 serviços falharam ou tinham dependências ausentes, os serviços 343 estão lentos, passivos ou sob demanda)
2026-07-13 13:56:07,654 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0060: A interface de gerenciamento http escutando em http://0.0.0.0:9990/management
2026-07-13 13:56:07,654 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0051: O console de administração escutando em http://0.0.0.0:9990
2026-07-13 14:06:03,344 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 75) WFLYDR0009: O conteúdo /opt/jboss-eap/standalone/data/content/99/abaa02dd8728d935cb7952de22a322896fe002 é obsoleto e será removido
2026-07-13 14:06:03,354 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 75) WFLYDR0002: Conteúdo removido do local /opt/jboss-eap/standalone/data/content/99/abaa02dd8728d935cb7952de22a322896fe002/content
-sh-4.2$ grep -iE "ERROR|Failed to start|MSC0" /logs/jboss/jboss-eap/standalone/siamc-dev-internet/server.log | tail -40
2026-07-13 13:50:31,462 ERROR [stderr] (MSC service thread 1-2) jul 13, 2026 1:50:31 PM java.io.ObjectInputFilter$Config lambda$static$0
2026-07-13 13:50:31,462 ERROR [stderr] (MSC service thread 1-2) INFO: Creating serialization filter from maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000
2026-07-13 13:50:33,215 ERROR [org.jboss.msc.service.fail] (MSC service thread 1-1) MSC000001: Failed to start service jboss.deployment.subunit."siamc-ear.ear"."siamc-web-3.0.0-SNAPSHOT.war".DEPENDENCIES: org.jboss.msc.service.StartException in service jboss.deployment.subunit."siamc-ear.ear"."siamc-web-3.0.0-SNAPSHOT.war".DEPENDENCIES: WFLYSRV0153: Falha ao processar a fase DEPENDENCIES de subdeployment "siamc-web-3.0.0-SNAPSHOT.war" of deployment "siamc-ear.ear"
2026-07-13 13:50:33,218 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("deploy") - endereço ([("deployment" => "siamc-ear.ear")]) - falha na descrição: {"WFLYCTL0080: Falha de serviços" => {"jboss.deployment.subunit.\"siamc-ear.ear\".\"siamc-web-3.0.0-SNAPSHOT.war\".DEPENDENCIES" => "WFLYSRV0153: Falha ao processar a fase DEPENDENCIES de subdeployment \"siamc-web-3.0.0-SNAPSHOT.war\" of deployment \"siamc-ear.ear\"
2026-07-13 13:50:33,311 ERROR [org.jboss.as] (Controller Boot Thread) WFLYSRV0026: JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001) iniciado (com erros) em 5296ms - Iniciado(s) 335 de serviços 575 (2 serviços falharam ou tinham dependências ausentes, os serviços 343 estão lentos, passivos ou sob demanda)
2026-07-13 13:56:05,687 ERROR [stderr] (MSC service thread 1-3) jul 13, 2026 1:56:05 PM java.io.ObjectInputFilter$Config lambda$static$0
2026-07-13 13:56:05,704 ERROR [stderr] (MSC service thread 1-3) INFO: Creating serialization filter from maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000
2026-07-13 13:56:07,506 ERROR [org.jboss.msc.service.fail] (MSC service thread 1-3) MSC000001: Failed to start service jboss.deployment.subunit."siamc-ear.ear"."siamc-web-3.0.0-SNAPSHOT.war".DEPENDENCIES: org.jboss.msc.service.StartException in service jboss.deployment.subunit."siamc-ear.ear"."siamc-web-3.0.0-SNAPSHOT.war".DEPENDENCIES: WFLYSRV0153: Falha ao processar a fase DEPENDENCIES de subdeployment "siamc-web-3.0.0-SNAPSHOT.war" of deployment "siamc-ear.ear"
2026-07-13 13:56:07,510 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("deploy") - endereço ([("deployment" => "siamc-ear.ear")]) - falha na descrição: {"WFLYCTL0080: Falha de serviços" => {"jboss.deployment.subunit.\"siamc-ear.ear\".\"siamc-web-3.0.0-SNAPSHOT.war\".DEPENDENCIES" => "WFLYSRV0153: Falha ao processar a fase DEPENDENCIES de subdeployment \"siamc-web-3.0.0-SNAPSHOT.war\" of deployment \"siamc-ear.ear\"
2026-07-13 13:56:07,653 ERROR [org.jboss.as] (Controller Boot Thread) WFLYSRV0026: JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001) iniciado (com erros) em 5251ms - Iniciado(s) 335 de serviços 575 (2 serviços falharam ou tinham dependências ausentes, os serviços 343 estão lentos, passivos ou sob demanda)
-sh-4.2$ find /opt/jboss-eap -maxdepth 3 -iname "deployments"
/opt/jboss-eap/standalone/deployments
-sh-4.2$ /opt/jboss-eap/bin/jboss-cli.sh -c --controller=127.0.0.1:9990 "deployment-info --name=siamc-ear.ear"
NAME          RUNTIME-NAME  PERSISTENT ENABLED STATUS
siamc-ear.ear siamc-ear.ear false      true    FAILED
-sh-4.2$ /opt/jboss-eap/bin/jboss-cli.sh --connect --controller=127.0.0.1:9990 [standalone@127.0.0.1:9990 /] deployment-info --name=siamc-ear.ear
'/]' is assumed to be a command(s) but the commands to execute have been specified by another argument: [[standalone@127.0.0.1:9990]
-sh-4.2$ find /opt/jboss-eap/modules -iname "*keycloak*"
/opt/jboss-eap/modules/system/add-ons/keycloak
/opt/jboss-eap/modules/system/add-ons/keycloak/org/keycloak
/opt/jboss-eap/modules/system/add-ons/keycloak/org/keycloak/keycloak-authz-client
/opt/jboss-eap/modules/system/add-ons/keycloak/org/keycloak/keycloak-authz-client/main/keycloak-authz-client-22.0.5.jar
/opt/jboss-eap/modules/system/add-ons/keycloak/org/keycloak/keycloak-adapter-subsystem
/opt/jboss-eap/modules/system/add-ons/keycloak/org/keycloak/keycloak-undertow-adapter
/opt/jboss-eap/modules/system/add-ons/keycloak/org/keycloak/keycloak-undertow-adapter/main/keycloak-undertow-adapter-22.0.5.jar
/opt/jboss-eap/modules/system/add-ons/keycloak/org/keycloak/keycloak-wildfly-subsystem
/opt/jboss-eap/modules/system/add-ons/keycloak/org/keycloak/keycloak-wildfly-subsystem/main/keycloak-wildfly-subsystem-22.0.5.jar
/opt/jboss-eap/modules/system/add-ons/keycloak/org/keycloak/keycloak-adapter-core
/opt/jboss-eap/modules/system/add-ons/keycloak/org/keycloak/keycloak-adapter-core/main/keycloak-adapter-core-22.0.5.jar
/opt/jboss-eap/modules/system/add-ons/keycloak/org/keycloak/keycloak-adapter-spi
/opt/jboss-eap/modules/system/add-ons/keycloak/org/keycloak/keycloak-adapter-spi/main/keycloak-adapter-spi-22.0.5.jar
/opt/jboss-eap/modules/system/add-ons/keycloak/org/keycloak/keycloak-adapter-spi/main/keycloak-undertow-adapter-spi-22.0.5.jar
/opt/jboss-eap/modules/system/add-ons/keycloak/org/keycloak/keycloak-common
/opt/jboss-eap/modules/system/add-ons/keycloak/org/keycloak/keycloak-common/main/keycloak-common-22.0.5.jar
/opt/jboss-eap/modules/system/add-ons/keycloak/org/keycloak/keycloak-jboss-adapter-core
/opt/jboss-eap/modules/system/add-ons/keycloak/org/keycloak/keycloak-jboss-adapter-core/main/keycloak-jboss-adapter-core-22.0.5.jar
/opt/jboss-eap/modules/system/add-ons/keycloak/org/keycloak/keycloak-policy-enforcer
/opt/jboss-eap/modules/system/add-ons/keycloak/org/keycloak/keycloak-policy-enforcer/main/keycloak-policy-enforcer-22.0.5.jar
/opt/jboss-eap/modules/system/add-ons/keycloak/org/keycloak/keycloak-core
/opt/jboss-eap/modules/system/add-ons/keycloak/org/keycloak/keycloak-core/main/keycloak-core-22.0.5.jar
/opt/jboss-eap/modules/system/add-ons/keycloak/org/keycloak/keycloak-wildfly-elytron-oidc-adapter
/opt/jboss-eap/modules/system/add-ons/keycloak/org/keycloak/keycloak-wildfly-elytron-oidc-adapter/main/keycloak-wildfly-elytron-oidc-adapter-22.0.5.jar
/opt/jboss-eap/modules/system/add-ons/keycloak/org/keycloak/keycloak-crypto-default
/opt/jboss-eap/modules/system/add-ons/keycloak/org/keycloak/keycloak-crypto-default/main/keycloak-crypto-default-22.0.5.jar
-sh-4.2$ grep -R "22.0.5" /opt/jboss-eap/modules
/opt/jboss-eap/modules/system/add-ons/keycloak/org/keycloak/keycloak-authz-client/main/module.xml:        <resource-root path="keycloak-authz-client-22.0.5.jar"/>
/opt/jboss-eap/modules/system/add-ons/keycloak/org/keycloak/keycloak-undertow-adapter/main/module.xml:        <resource-root path="keycloak-undertow-adapter-22.0.5.jar"/>
/opt/jboss-eap/modules/system/add-ons/keycloak/org/keycloak/keycloak-wildfly-subsystem/main/module.xml:        <resource-root path="keycloak-wildfly-subsystem-22.0.5.jar"/>
/opt/jboss-eap/modules/system/add-ons/keycloak/org/keycloak/keycloak-adapter-core/main/module.xml:        <resource-root path="keycloak-adapter-core-22.0.5.jar"/>
/opt/jboss-eap/modules/system/add-ons/keycloak/org/keycloak/keycloak-adapter-spi/main/module.xml:        <resource-root path="keycloak-adapter-spi-22.0.5.jar"/>
/opt/jboss-eap/modules/system/add-ons/keycloak/org/keycloak/keycloak-adapter-spi/main/module.xml:        <resource-root path="keycloak-undertow-adapter-spi-22.0.5.jar"/>
/opt/jboss-eap/modules/system/add-ons/keycloak/org/keycloak/keycloak-common/main/module.xml:        <resource-root path="keycloak-common-22.0.5.jar"/>
/opt/jboss-eap/modules/system/add-ons/keycloak/org/keycloak/keycloak-jboss-adapter-core/main/module.xml:        <resource-root path="keycloak-jboss-adapter-core-22.0.5.jar"/>
/opt/jboss-eap/modules/system/add-ons/keycloak/org/keycloak/keycloak-policy-enforcer/main/module.xml:        <resource-root path="keycloak-policy-enforcer-22.0.5.jar"/>
/opt/jboss-eap/modules/system/add-ons/keycloak/org/keycloak/keycloak-core/main/module.xml:        <resource-root path="keycloak-core-22.0.5.jar"/>
/opt/jboss-eap/modules/system/add-ons/keycloak/org/keycloak/keycloak-wildfly-elytron-oidc-adapter/main/module.xml:        <resource-root path="keycloak-wildfly-elytron-oidc-adapter-22.0.5.jar"/>
/opt/jboss-eap/modules/system/add-ons/keycloak/org/keycloak/keycloak-crypto-default/main/module.xml:        <resource-root path="keycloak-crypto-default-22.0.5.jar"/>
-sh-4.2$


