grep -A1 "socket-binding-group" /home/jboss-eap-6.4/standaloneCSD6/configuration/standaloneCSD6.xml | head -3


mkdir -p /var/log/jboss-as
nohup /home/jboss-eap-6.4/bin/standalone.sh \
  -Djboss.node.name=CSD2 \
  -Djboss.server.base.dir=/home/jboss-eap-6.4/standaloneCSD2 \
  -b 0.0.0.0 -bmanagement 0.0.0.0 \
  -c standaloneCSD2.xml \
  > /var/log/jboss-as/consoleCSD2.log 2>&1 &

sleep 20
tail -60 /var/log/jboss-as/consoleCSD2.log
ps -ef | grep -i CSD2





[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]# grep -A1 "socket-binding-group" /home/jboss-eap-6.4/standaloneCSD6/configuration/standaloneCSD6.xml | head -3
    <socket-binding-group name="standard-sockets" default-interface="public" port-offset="${jboss.socket.binding.port-offset:550}">
        <socket-binding name="management-native" interface="management" port="${jboss.management.native.port:8499}"/>
--
[root@caddeapllx698 p585600]#






[root@caddeapllx698 p585600]# mkdir -p /var/log/jboss-as
[root@caddeapllx698 p585600]# nohup /home/jboss-eap-6.4/bin/standalone.sh \
>   -Djboss.node.name=CSD2 \
>   -Djboss.server.base.dir=/home/jboss-eap-6.4/standaloneCSD2 \
>   -b 0.0.0.0 -bmanagement 0.0.0.0 \
>   -c standaloneCSD2.xml \
>   > /var/log/jboss-as/consoleCSD2.log 2>&1 &
[1] 14595
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]# sleep 20
[root@caddeapllx698 p585600]# tail -60 /var/log/jboss-as/consoleCSD2.log
16:50:32,898 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for jmx subsystem MODEL stage boot operations
16:50:32,898 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for jpa subsystem MODEL stage boot operations
16:50:32,898 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for jsf subsystem MODEL stage boot operations
16:50:32,898 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for mail subsystem MODEL stage boot operations
16:50:32,898 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for naming subsystem MODEL stage boot operations
16:50:32,898 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for pojo subsystem MODEL stage boot operations
16:50:32,898 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for remoting subsystem MODEL stage boot operations
16:50:32,898 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for resource-adapters subsystem MODEL stage boot operations
16:50:32,899 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for sar subsystem MODEL stage boot operations
16:50:32,899 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for security subsystem MODEL stage boot operations
16:50:32,899 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for threads subsystem MODEL stage boot operations
16:50:32,899 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for transactions subsystem MODEL stage boot operations
16:50:32,899 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for web subsystem MODEL stage boot operations
16:50:32,899 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for webservices subsystem MODEL stage boot operations
16:50:32,899 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for weld subsystem MODEL stage boot operations
16:50:32,900 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 30) JBAS015859: Deployed "wmq.jmsra-7.5.0.8.rar" (runtime-name : "wmq.jmsra-7.5.0.8.rar")
16:50:32,900 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 30) JBAS015859: Deployed "siaoi.ear" (runtime-name : "siaoi.ear")
16:50:32,901 INFO  [org.jboss.as.controller] (Controller Boot Thread) JBAS014774: Service status report
JBAS014777:   Services which failed to start:      service jboss.serverManagement.controller.management.http: org.jboss.msc.service.StartException in service jboss.serverManagement.controller.management.http: java.io.IOException: Unable to load resource handler

16:50:32,901 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for keycloak subsystem RUNTIME stage boot operations
16:50:32,901 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for logging subsystem RUNTIME stage boot operations
16:50:32,901 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for datasources subsystem RUNTIME stage boot operations
16:50:32,901 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for deployment-scanner subsystem RUNTIME stage boot operations
16:50:32,901 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for ee subsystem RUNTIME stage boot operations
16:50:32,901 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for ejb3 subsystem RUNTIME stage boot operations
16:50:32,901 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for infinispan subsystem RUNTIME stage boot operations
16:50:32,901 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for jaxrs subsystem RUNTIME stage boot operations
16:50:32,901 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for jca subsystem RUNTIME stage boot operations
16:50:32,901 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for jdr subsystem RUNTIME stage boot operations
16:50:32,901 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for jmx subsystem RUNTIME stage boot operations
16:50:32,901 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for jpa subsystem RUNTIME stage boot operations
16:50:32,901 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for jsf subsystem RUNTIME stage boot operations
16:50:32,901 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for mail subsystem RUNTIME stage boot operations
16:50:32,901 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for naming subsystem RUNTIME stage boot operations
16:50:32,901 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for pojo subsystem RUNTIME stage boot operations
16:50:32,901 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for remoting subsystem RUNTIME stage boot operations
16:50:32,901 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for resource-adapters subsystem RUNTIME stage boot operations
16:50:32,901 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for sar subsystem RUNTIME stage boot operations
16:50:32,901 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for security subsystem RUNTIME stage boot operations
16:50:32,901 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for threads subsystem RUNTIME stage boot operations
16:50:32,901 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for transactions subsystem RUNTIME stage boot operations
16:50:32,901 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for web subsystem RUNTIME stage boot operations
16:50:32,901 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for webservices subsystem RUNTIME stage boot operations
16:50:32,901 DEBUG [org.jboss.as.controller.management-operation] (Controller Boot Thread) Committed transaction for weld subsystem RUNTIME stage boot operations
16:50:32,936 INFO  [org.jboss.as] (Controller Boot Thread) JBAS015964: Http management interface is not enabled
16:50:32,936 INFO  [org.jboss.as] (Controller Boot Thread) JBAS015954: Admin console is not enabled
16:50:32,936 ERROR [org.jboss.as] (Controller Boot Thread) JBAS015875: JBoss AS 7.5.0.Final-redhat-21 "Janus" started (with errors) in 15205ms - Started 531 of 573 services (2 services failed or missing dependencies, 68 services are lazy, passive or on-demand)
16:50:33,091 DEBUG [net.sf.ehcache.util.UpdateChecker] (net.sf.ehcache.CacheManager@50a9f6f0) Update check failed: java.net.SocketTimeoutException: connect timed out
16:50:38,749 DEBUG [br.com.viverebrasil.framework.container.scheduler.JobCargaContratoEmpreendimentoDispatcher] (defaultScheduler-1) Executando Scheduler [1]
16:50:38,749 DEBUG [br.com.viverebrasil.framework.config.ConfigurationContextImpl] (defaultScheduler-1) O parametro com a chave [negocio.carga.contrato.empreendimento.enable.7] nao foi localizado em nenhum ConfigResolver. Devolvendo nulo
16:50:38,749 DEBUG [br.com.viverebrasil.framework.config.ConfigurationContextImpl] (defaultScheduler-1) O parametro com a chave [negocio.carga.contrato.empreendimento.enable] nao foi localizado em nenhum ConfigResolver. Devolvendo nulo
16:50:38,749 DEBUG [br.com.viverebrasil.framework.container.scheduler.JobCargaContratoEmpreendimentoDispatcher] (defaultScheduler-1) A de carga de contratos de empreendimento está desabilitada: negocio.carga.contrato.empreendimento.enable = N
16:50:38,750 DEBUG [br.com.viverebrasil.framework.container.scheduler.JobCargaContratoEmpreendimentoDispatcher] (defaultScheduler-1) Exeucao [2] do Scheduler finalizada com exito
16:50:38,750 DEBUG [br.com.viverebrasil.framework.container.scheduler.JobRecebeReutilizacaoUnidadeDispatcher] (defaultScheduler-1) Executando Scheduler [1]
16:50:38,750 DEBUG [br.com.viverebrasil.framework.config.ConfigurationContextImpl] (defaultScheduler-1) O parametro com a chave [negocio.recebe.reutilizacao.unidade.enable.7] nao foi localizado em nenhum ConfigResolver. Devolvendo nulo
16:50:38,750 DEBUG [br.com.viverebrasil.framework.config.ConfigurationContextImpl] (defaultScheduler-1) O parametro com a chave [negocio.recebe.reutilizacao.unidade.enable] nao foi localizado em nenhum ConfigResolver. Devolvendo nulo
16:50:38,750 DEBUG [br.com.viverebrasil.framework.container.scheduler.JobRecebeReutilizacaoUnidadeDispatcher] (defaultScheduler-1) A carga de recebe reutilizacao unidade está desabilitada: negocio.recebe.reutilizacao.unidade.enable = N
16:50:38,750 DEBUG [br.com.viverebrasil.framework.container.scheduler.JobRecebeReutilizacaoUnidadeDispatcher] (defaultScheduler-1) Exeucao [2] do Scheduler finalizada com exito
[root@caddeapllx698 p585600]# ps -ef | grep -i CSD2
root      14595   1074  0 16:50 pts/0    00:00:00 /bin/sh /home/jboss-eap-6.4/bin/standalone.sh -Djboss.node.name=CSD2 -Djboss.server.base.dir=/home/jboss-eap-6.4/standaloneCSD2 -b 0.0.0.0 -bmanagement 0.0.0.0 -c standaloneCSD2.xml
root      14702  14595 59 16:50 pts/0    00:00:26 java -D[Standalone] -server -XX:+UseCompressedOops -verbose:gc -Xloggc:/home/jboss-eap-6.4/standaloneCSD2/log/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms1303m -Xmx1303m -XX:MaxPermSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djboss.modules.policy-permissions=true -Dorg.jboss.boot.log.file=/home/jboss-eap-6.4/standaloneCSD2/log/server.log -Dlogging.configuration=file:/home/jboss-eap-6.4/standaloneCSD2/configuration/logging.properties -jar /home/jboss-eap-6.4/jboss-modules.jar -mp /home/jboss-eap-6.4/modules -jaxpmodule javax.xml.jaxp-provider org.jboss.as.standalone -Djboss.home.dir=/home/jboss-eap-6.4 -Djboss.server.base.dir=/home/jboss-eap-6.4/standaloneCSD2 -Djboss.node.name=CSD2 -Djboss.server.base.dir=/home/jboss-eap-6.4/standaloneCSD2 -b 0.0.0.0 -bmanagement 0.0.0.0 -c standaloneCSD2.xml
root      14974   1074  0 16:51 pts/0    00:00:00 grep --color=auto -i CSD2
[root@caddeapllx698 p585600]#
