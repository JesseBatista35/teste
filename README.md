sh-4.2$ ps -ef | grep jboss
185            3       1  0 17:24 ?        00:00:00 /bin/sh /opt/jboss/bin/standalone.sh -c standalone-okd.xml -b 0.0.0.0 -bmanagement 127.0.0.1
185          166       3  5 17:24 ?        00:00:45 /usr/java/latest/bin/java -D[Standalone] -verbose:gc -Xloggc:/opt/jboss/standalone/log/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms1024m -Xmx2048m -XX:MetaspaceSize=96m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/p:/opt/jboss/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.0.7.Final-redhat-1.jar -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -Dnetworkaddress.cache.ttl=720 -XX:+AggressiveOpts -Dhttp.maxConnections=128 -Dsun.net.http.errorstream.enableBuffering=true -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=sispl -Delastic.apm.environment=TQS -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=sispl-canal-webhook-pix-tqs-esteiras -Dorg.jboss.boot.log.file=/opt/jboss/standalone/log/server.log -Dlogging.configuration=file:/opt/jboss/standalone/configuration/logging.properties -jar /opt/jboss/jboss-modules.jar -mp /opt/jboss/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss -Djboss.server.base.dir=/opt/jboss/standalone -c standalone-okd.xml -b 0.0.0.0 -bmanagement 127.0.0.1
185         1796    1777  0 17:39 pts/1    00:00:00 grep jboss
sh-4.2$ 
sh-4.2$ 
sh-4.2$ ps -ef | grep java 
185          166       3  5 17:24 ?        00:00:45 /usr/java/latest/bin/java -D[Standalone] -verbose:gc -Xloggc:/opt/jboss/standalone/log/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms1024m -Xmx2048m -XX:MetaspaceSize=96m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/p:/opt/jboss/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.0.7.Final-redhat-1.jar -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -Dnetworkaddress.cache.ttl=720 -XX:+AggressiveOpts -Dhttp.maxConnections=128 -Dsun.net.http.errorstream.enableBuffering=true -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=sispl -Delastic.apm.environment=TQS -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=sispl-canal-webhook-pix-tqs-esteiras -Dorg.jboss.boot.log.file=/opt/jboss/standalone/log/server.log -Dlogging.configuration=file:/opt/jboss/standalone/configuration/logging.properties -jar /opt/jboss/jboss-modules.jar -mp /opt/jboss/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss -Djboss.server.base.dir=/opt/jboss/standalone -c standalone-okd.xml -b 0.0.0.0 -bmanagement 127.0.0.1
185         1825    1777  0 17:39 pts/1    00:00:00 grep java
sh-4.2$ ^C
sh-4.2$ 



<img width="1359" height="807" alt="image" src="https://github.com/user-attachments/assets/7e8ee818-543c-44d9-8746-1d70d48bff0b" />


<img width="806" height="596" alt="image" src="https://github.com/user-attachments/assets/9c460692-833b-48d1-a473-eb22555cda55" />



me ajuda a cverifricasr dentro desse pod o pqoeur ta dano esse erro>>


