
[root@caddeapllx2871 p585600]#
[root@caddeapllx2871 p585600]# date; ps -ef | grep [j]boss-modules | wc -l
ss -tlnp | grep -E ':8080|:9990'
tail -40 /opt/jboss-eap/standalone/log/server.log
grep -E "WFLYSRV0025|WFLYSRV0010|WFLYSRV0026|WF
ter 17 nov 2026 12:03:45 -03
1
LISTEN 0      10000        0.0.0.0:8080       0.0.0.0:*    users:(("java",pid=165108,fd=556))
LISTEN 0      50           0.0.0.0:9990       0.0.0.0:*    users:(("java",pid=165108,fd=553))
        user.country = BR
        user.dir = /
        user.home = /home/jboss
        user.language = pt
        user.name = jboss
        user.timezone = America/Sao_Paulo
2026-11-17 11:42:14,321 DEBUG [org.jboss.as.config] (MSC service thread 1-1) Argumentos da VM: -D[Standalone] -Xlog:gc*:file=/logs/jboss/jboss-eap/standalone/sigec-portabilidade/gc.log:time,uptimemillis:filecount=5,filesize=3M -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -Xms1024m -Xmx2048m -XX:MetaspaceSize=96m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -javaagent:/opt/apm_agent/elastic-apm-agent-1.15.0.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm-1.15.0.properties -Delastic.apm.service_name=sigec-portabilidade -Delastic.apm.environment=DES -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=sigec-portabilidade-des-esteiras --add-exports=java.base/sun.nio.ch=ALL-UNNAMED --add-exports=jdk.unsupported/sun.misc=ALL-UNNAMED --add-exports=jdk.unsupported/sun.reflect=ALL-UNNAMED --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/sigec-portabilidade/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties
2026-11-17 11:42:15,091 INFO  [org.wildfly.security] (ServerService Thread Pool -- 24) ELY00001: WildFly Elytron version 1.15.23.Final-redhat-00001
2026-11-17 11:42:15,750 INFO  [org.jboss.as.server.deployment.scanner] (DeploymentScanner-threads - 1) WFLYDS0015: A nova tentativa implantação de framework.jar falhou
2026-11-17 11:42:15,759 INFO  [org.jboss.as.server.deployment.scanner] (DeploymentScanner-threads - 1) WFLYDS0015: A nova tentativa implantação de framework_sisgd.jar falhou
2026-11-17 11:42:15,763 INFO  [org.jboss.as.server.deployment.scanner] (DeploymentScanner-threads - 1) WFLYDS0015: A nova tentativa implantação de wmq.jmsra.rar falhou
2026-11-17 11:42:15,764 INFO  [org.jboss.as.server.deployment.scanner] (DeploymentScanner-threads - 1) WFLYDS0015: A nova tentativa implantação de gec-ear.ear falhou
2026-11-17 11:42:16,272 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Criando serviço de gerenciamento http usando o socket-binding (management-http)
2026-11-17 11:42:16,289 INFO  [org.xnio] (MSC service thread 1-3) XNIO version 3.8.16.Final-redhat-00001
2026-11-17 11:42:16,301 INFO  [org.xnio.nio] (MSC service thread 1-3) XNIO NIO Implementation Version 3.8.16.Final-redhat-00001
2026-11-17 11:42:16,390 INFO  [org.jboss.remoting] (MSC service thread 1-4) JBoss Remoting version 5.0.29.Final-redhat-00001
2026-11-17 11:42:16,392 INFO  [org.wildfly.extension.health] (ServerService Thread Pool -- 55) WFLYHEALTH0001: Ativando o Subsistema Básico de integridade
2026-11-17 11:42:16,401 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 47) WFLYJCA0004: Implantação do driver compatível-JDBC class org.h2.Driver (versão 1.4)
2026-11-17 11:42:16,415 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 57) WFLYCLINF0001: Ativação do subsistema Infinispan.
2026-11-17 11:42:16,438 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 58) WFLYIO001: O operador 'default' configurou automaticamente para as threads de E/S 4 com o máximo de 32 threads de tarefas com base em seus 2 processadores disponíveis.
2026-11-17 11:42:16,442 INFO  [org.wildfly.iiop.openjdk] (ServerService Thread Pool -- 56) WFLYIIOP0001: Ativação de subsistema IIOP
2026-11-17 11:42:16,446 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 47) WFLYJCA0004: Implantação do driver compatível-JDBC class com.ibm.db2.jcc.DB2Driver (versão 4.16)
2026-11-17 11:42:16,495 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 59) WFLYRS0016: RESTEasy versão 3.15.9.Final-redhat-00001
2026-11-17 11:42:16,501 INFO  [org.jboss.as.clustering.jgroups] (ServerService Thread Pool -- 62) WFLYCLJG0001: Ativação do subsistema JGroups. Versão do JGroups 4.2.23
2026-11-17 11:42:16,517 INFO  [org.jboss.as.connector] (MSC service thread 1-3) WFLYJCA0009: Inicialização do Subsistema Jakarta Connectors (WildFly/IronJacamar 1.5.17.Final-redhat-00001)
2026-11-17 11:42:16,567 INFO  [org.jboss.as.jsf] (ServerService Thread Pool -- 65) WFLYJSF0007: Ativadas as seguintes implantações do Jakarta Server Faces: [main]
2026-11-17 11:42:16,571 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-3) WFLYELY00023: O arquivo '/opt/jboss-eap/standalone/configuration/application.keystore' da KeyStore não existe. Usado em branco.
2026-11-17 11:42:16,584 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-3) WFLYJCA0018: Serviço de driver iniciado com nome-do-driver = db2
2026-11-17 11:42:16,584 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-3) WFLYJCA0018: Serviço de driver iniciado com nome-do-driver = h2
2026-11-17 11:42:16,596 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-3) WFLYELY01084: KeyStore /opt/jboss-eap/standalone/configuration/application.keystore não encontrado; ele será gerado automaticamente na primeira utilização com um certificado autoassinado para o host localhost
2026-11-17 11:42:16,621 INFO  [org.wildfly.extension.metrics] (ServerService Thread Pool -- 70) WFLYMETRICS0001: Ativando o subsistema de métricas de base
2026-11-17 11:42:16,629 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 72) WFLYNAM0001: Ativação do Subsistema de Nomeação
2026-11-17 11:42:16,671 INFO  [org.jboss.as.ejb3] (MSC service thread 1-3) WFLYEJB0481: O pool estrito slsb-strict-max-pool está utilizando um tamanho de instância máximo de 32 (por classe) que é derivado do tamanho de pool do thead de trabalho.
2026-11-17 11:42:16,671 INFO  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0482: O pool estrito mdb-strict-max-pool está utilizando um tamanho de instância máximo de 8 (por classe) que é derivado do número de CPUs neste host.
2026-11-17 11:42:16,652 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 80) WFLYTX0013: O atributo node-identifier em /subsystem=transactions está definido com o valor padrão. Isso é perigoso para ambientes executando vários servidores. Certifique-se de que o valor do atributo é exclusivo.
2026-11-17 11:42:16,728 INFO  [org.jboss.as.webservices] (ServerService Thread Pool -- 82) WFLYWS0002: Ativação da Extensão WebServices
2026-11-17 11:42:16,915 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 81) WFLYUT0014: Criando identificador de arquivo para caminho de acesso '/opt/jboss-eap/welcome-content' com as opções [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
2026-11-17 11:42:17,070 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0003: Iniciando Undertow 2.2.33.SP1-redhat-00001
2026-11-17 11:42:17,102 INFO  [org.jboss.as.naming] (MSC service thread 1-4) WFLYNAM0003: Iniciando o Serviço de Nomeação
2026-11-17 11:42:17,122 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-4) WFLYMAIL0001: Sessão de e-mail associada [java:jboss/mail/Default]
> ^C
[root@caddeapllx2871 p585600]#
[root@caddeapllx2871 p585600]#
[root@caddeapllx2871 p585600]# grep -E "WFLYSRV0025|WFLYSRV0010|WFLYSRV0026|WFLYSRV0021|WFLYCTL0013|FATAL" /opt/jboss-eap/standalone/log/server.log | tail -20
systemctl status jboss-eap-standalone --no-pager
2026-11-17 11:09:55,670 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("add") - endereço ([
2026-11-17 11:09:55,671 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("add") - endereço ([
2026-11-17 11:09:55,821 ERROR [org.jboss.as.controller.management-operation] (ServerService Thread Pool -- 48) WFLYCTL0013: Falha na operação ("add") - endereço ([
2026-11-17 11:09:55,880 ERROR [org.jboss.as.controller.management-operation] (ServerService Thread Pool -- 48) WFLYCTL0013: Falha na operação ("add") - endereço ([
2026-11-17 11:09:55,880 ERROR [org.jboss.as.controller.management-operation] (ServerService Thread Pool -- 48) WFLYCTL0013: Falha na operação ("add") - endereço ([
2026-11-17 11:09:56,020 ERROR [org.jboss.as.controller.management-operation] (ServerService Thread Pool -- 79) WFLYCTL0013: Falha na operação ("add") - endereço ([("subsystem" => "security")]) - falha na descrição: "WFLYSEC0106: O recurso 'security' não tem suporte desde o Java 14"
2026-11-17 11:10:03,898 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 49) WFLYSRV0021: O procedimento da implantação "gec-ear.ear" foi revertido com mensagem de falha: undefined
2026-11-17 11:10:03,899 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 49) WFLYSRV0021: O procedimento da implantação "wmq.jmsra.rar" foi revertido com mensagem de falha: undefined
2026-11-17 11:10:03,899 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 49) WFLYSRV0021: O procedimento da implantação "framework_sisgd.jar" foi revertido com mensagem de falha: undefined
2026-11-17 11:10:03,899 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 49) WFLYSRV0021: O procedimento da implantação "framework.jar" foi revertido com mensagem de falha: undefined
2026-11-17 11:10:03,959 FATAL [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0056: A inicialização do servidor falhou numa maneira irrecuperável: encerrando. Consulte mensagens anteriores para maiores detalhes.
● jboss-eap-standalone.service - JBoss EAP Systemctl - STANDALONE
     Loaded: loaded (/etc/systemd/system/jboss-eap-standalone.service; enabled; preset: disabled)
     Active: active (running) since Tue 2026-11-17 11:48:13 -03; 15min ago
    Process: 164836 ExecStart=/opt/jboss-eap/bin/init.d/jboss-eap-standalone.sh start (code=exited, status=0/SUCCESS)
   Main PID: 164847 (runuser)
      Tasks: 128 (limit: 23083)
     Memory: 1.5G
        CPU: 52.230s
     CGroup: /system.slice/jboss-eap-standalone.service
             ├─164847 runuser jboss -c "LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/opt/jboss-eap/standalone/tmp/jboss-eap-standalone.pid /opt/jboss-eap/bin/standalone.sh                -b 0.0.0.0  …
             ├─164850 /bin/sh /opt/jboss-eap/bin/standalone.sh -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalo…
             └─165108 java "-D[Standalone]" "-Xlog:gc*:file=/logs/jboss/jboss-eap/standalone/sigec-portabilidade/gc.log:time,uptimemillis:filecount=5,filesize=3M" "-Djdk.serialFilter=maxbytes=104857…

nov 17 11:48:07 caddeapllx2871.agil.nprd.caixa.gov.br runuser[164838]: pam_unix(runuser:session): session closed for user jboss
nov 17 11:48:07 caddeapllx2871.agil.nprd.caixa.gov.br runuser[164843]: pam_unix(runuser:session): session opened for user jboss(uid=30000115) by (uid=0)
nov 17 11:48:07 caddeapllx2871.agil.nprd.caixa.gov.br runuser[164843]: pam_unix(runuser:session): session closed for user jboss
nov 17 11:48:07 caddeapllx2871.agil.nprd.caixa.gov.br runuser[164847]: pam_unix(runuser:session): session opened for user jboss(uid=30000115) by (uid=0)
nov 17 11:48:07 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[164836]: Starting JBoss EAP:
nov 17 11:48:07 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[165108]: nov. 17, 2026 11:48:07 AM java.lang.System$LoggerFinder lambda$accessProvider$0
nov 17 11:48:07 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[165108]: WARNING: Failed to instantiate LoggerFinder provider; Using default.
nov 17 11:48:07 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[165108]: OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstra…en appended
nov 17 11:48:13 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[165279]: /opt/jboss-eap/bin/common_start.sh: linha 58: success: comando não encontrado
nov 17 11:48:13 caddeapllx2871.agil.nprd.caixa.gov.br systemd[1]: Started JBoss EAP Systemctl - STANDALONE.
Hint: Some lines were ellipsized, use -l to show in full.
[root@caddeapllx2871 p585600]#
[root@caddeapllx2871 p585600]#
[root@caddeapllx2871 p585600]#
[root@caddeapllx2871 p585600]# /opt/jboss-eap/bin/jboss-cli.sh --connect --command="deployment-info"
NAME                RUNTIME-NAME        PERSISTENT ENABLED STATUS
framework.jar       framework.jar       false      true    OK
framework_sisgd.jar framework_sisgd.jar false      true    OK
gec-ear.ear         gec-ear.ear         false      true    FAILED
wmq.jmsra.rar       wmq.jmsra.rar       false      true    OK
[root@caddeapllx2871 p585600]#
[root@caddeapllx2871 p585600]#
[root@caddeapllx2871 p585600]#
