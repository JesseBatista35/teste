Criando diretorio '/opt/jboss/standalone/configuration/.secrets'...
Configuracao do vault realizada
Arquivo secrets.properties encontrado, carregando propriedades...
=========================================================================

  JBoss Bootstrap Environment

  JBOSS_HOME: /opt/jboss

  JAVA: /usr/java/latest/bin/java

  JAVA_OPTS:  -verbose:gc -Xloggc:"/opt/jboss/standalone/log/gc.log" -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms96m -Xmx900m -XX:MetaspaceSize=256M -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/p:/opt/jboss/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/p:/opt/jboss/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=siabm-autenticacao-api -Delastic.apm.environment=DES -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=siabm-autenticacao-api-des -Djava.security.provider.6=br.com.trueaccess.provider.netdfence.ND -Djava.net.useSystemProxies=false

=========================================================================

Could not load Logmanager "org.jboss.logmanager.LogManager"
java.lang.ClassNotFoundException: org.jboss.logmanager.LogManager
	at java.net.URLClassLoader.findClass(URLClassLoader.java:382)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:418)
	at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:355)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:351)
	at java.util.logging.LogManager$1.run(LogManager.java:195)
	at java.util.logging.LogManager$1.run(LogManager.java:181)
	at java.security.AccessController.doPrivileged(Native Method)
	at java.util.logging.LogManager.<clinit>(LogManager.java:181)
	at java.util.logging.Logger.demandLogger(Logger.java:448)
	at java.util.logging.Logger.getLogger(Logger.java:502)
	at io.prometheus.jmx.shaded.io.prometheus.jmx.JmxCollector.<clinit>(JmxCollector.java:38)
	at io.prometheus.jmx.shaded.io.prometheus.jmx.JavaAgent.premain(JavaAgent.java:29)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at sun.instrument.InstrumentationImpl.loadClassAndStartAgent(InstrumentationImpl.java:386)
	at sun.instrument.InstrumentationImpl.loadClassAndCallPremain(InstrumentationImpl.java:401)
2026-07-15 09:49:27.519 [main] INFO co.elastic.apm.agent.util.JmxUtils - Found JVM-specific OperatingSystemMXBean interface: com.sun.management.OperatingSystemMXBean
2026-07-15 09:49:27.595 [main] INFO co.elastic.apm.agent.configuration.StartupInfo - Starting Elastic APM 1.15.0 as siabm-autenticacao-api on Java 1.8.0_301 (Oracle Corporation) Linux 6.1.18-200.fc37.x86_64
2026-07-15 09:49:27.600 [main] INFO co.elastic.apm.agent.impl.ElasticApmTracer - Tracer switched to RUNNING state
WARNING: Failed to load the specified log manager class org.jboss.logmanager.LogManager
Exception in thread "main" java.lang.NoClassDefFoundError: org/jboss/logmanager/Level
	at java.lang.Class.forName0(Native Method)
	at java.lang.Class.forName(Class.java:348)
	at org.jboss.modules.Module.run(Module.java:329)
	at org.jboss.modules.Main.main(Main.java:525)
Caused by: java.lang.ClassNotFoundException: org.jboss.logmanager.Level
	at java.net.URLClassLoader.findClass(URLClassLoader.java:382)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:418)
	at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:355)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:351)
	at org.jboss.modules.JDKSpecific.getSystemClass(JDKSpecific.java:183)
	at org.jboss.modules.ConcurrentClassLoader.performLoadClass(ConcurrentClassLoader.java:397)
	at org.jboss.modules.ConcurrentClassLoader.loadClass(ConcurrentClassLoader.java:116)
	... 4 more
2026-07-15 09:49:30.138 [elastic-apm-init-instrumentation-shutdown-hook] INFO co.elastic.apm.agent.impl.ElasticApmTracer - Tracer switched to STOPPED state
2026-07-15 09:49:30.138 [elastic-apm-init-instrumentation-shutdown-hook] INFO co.elastic.apm.agent.report.ApmServerReporter - dropped events because of full queue: 0
2026-07-15 09:49:30.328 [elastic-apm-init-instrumentation-shutdown-hook] INFO co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Reported events: 0
2026-07-15 09:49:30.329 [elastic-apm-init-instrumentation-shutdown-hook] INFO co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Dropped events: 0
2026-07-15 09:49:30.329 [elastic-apm-circuit-breaker] INFO co.elastic.apm.agent.impl.circuitbreaker.CircuitBreaker - Stopping the Circuit Breaker thread.
