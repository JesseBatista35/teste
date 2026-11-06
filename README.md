
Are you sure you want to continue connecting (yes/no/[fingerprint])? yes
Warning: Permanently added '10.116.202.37' (ED25519) to the list of known hosts.
p585600@10.116.202.37's password:
[p585600@caddeapllx2835 ~]$
[p585600@caddeapllx2835 ~]$
[p585600@caddeapllx2835 ~]$
[p585600@caddeapllx2835 ~]$ ps -ef | grep jboss
root      181037       1  0 out22 ?        00:00:00 runuser jboss -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/opt/jboss-eap/standalone/tmp/jboss-eap-standalone.pid /opt/jboss-eap/bin/standalone.sh                -b 0.0.0.0                -bmanagement 0.0.0.0                -Djboss.server.base.dir=/opt/jboss-eap/standalone                -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sibdo-web -c standalone-full-ha.xml
jboss     181040  181037  0 out22 ?        00:00:00 /bin/sh /opt/jboss-eap/bin/standalone.sh -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sibdo-web -c standalone-full-ha.xml
jboss     181286  181040  0 out22 ?        00:33:06 java -D[Standalone] -Xlog:gc*:file=/logs/jboss/jboss-eap/standalone/sibdo-web/gc.log:time,uptimemillis:filecount=5,filesize=3M -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -Xms1024m -Xmx2048m -XX:MetaspaceSize=96M -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.6.0.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.19.Final-redhat-00001.jar -Djboss.modules.policy-permissions=true -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -javaagent:/opt/apm_agent/elastic-apm-agent-1.15.0.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm-1.15.0.properties -Delastic.apm.service_name=sites -Delastic.apm.environment=DES -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=sample-java-des-esteiras --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-exports=jdk.naming.dns/com.sun.jndi.dns=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.net=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED -Djava.security.manager=allow -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/sibdo-web/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties -jar /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sibdo-web -c standalone-full-ha.xml
p585600   274317  274290  0 14:35 pts/1    00:00:00 grep --color=auto jboss
[p585600@caddeapllx2835 ~]$
[p585600@caddeapllx2835 ~]$
[p585600@caddeapllx2835 ~]$
[p585600@caddeapllx2835 ~]$


[
verificar: se o VIP 10.116.181.213 está aativo; se existe serviço associado ao VIP; se o backend 10.116.202.37 está vinculado ao pool; se o health-check do balanceador está aprovando o backend;
se a porta 443 está publicada e encaminhada corretamente. Conforme Solicitado em REQ
](https://devops.caixa/projetos/Caixa/_releaseProgress?releaseId=544866&_a=release-environment-logs&environmentId=2532020

Prezados,

Foram concluídas as configurações de DNS e certificado para:

Plain Text
sibdo-web.esteiras.des.caixa

O DNS resolve corretamente para:

Plain Text
10.116.181.213

O VIP responde ao ping e o traceroute alcança o endereço normalmente.

Entretanto o acesso HTTPS permanece indisponível:

Plain Text
curl -vk https://sibdo-web.esteiras.des.caixa

Retorno:

Plain Text
Failed to connect to server
connect to 10.116.181.213 port 443 failed: Timed out

Solicito verificar:

se o VIP 10.116.181.213 está ativo;
se existe serviço associado ao VIP;
se o backend 10.116.202.37 está vinculado ao pool;
se o health-check do balanceador está aprovando o backend;
se a porta 443 está publicada e encaminhada corretamente.)
