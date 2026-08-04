2026-08-03T13:46:57.1238909Z ##[section]Starting: Verificando Status do Deployment
2026-08-03T13:46:57.1242060Z ==============================================================================
2026-08-03T13:46:57.1242139Z Task         : Bash
2026-08-03T13:46:57.1242185Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-03T13:46:57.1242260Z Version      : 3.227.0
2026-08-03T13:46:57.1242306Z Author       : Microsoft Corporation
2026-08-03T13:46:57.1242359Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-03T13:46:57.1242440Z ==============================================================================
2026-08-03T13:46:57.8797414Z Generating script.
2026-08-03T13:46:57.8804411Z ========================== Starting Command Output ===========================
2026-08-03T13:46:57.8818870Z [command]/bin/bash /opt/ads-agent/_work/_temp/27675495-5d11-4c89-9ed2-a4058a5f98c3.sh
2026-08-03T13:46:58.0947113Z Waiting for rollout to finish: 1 old replicas are pending termination...
2026-08-03T13:53:04.6335524Z ##[error]The task has timed out.
2026-08-03T13:53:04.6336763Z ##[section]Finishing: Verificando Status do Deployment



2026-08-03T13:53:04.6357818Z ##[section]Starting: Logs da Aplicação
2026-08-03T13:53:04.6362084Z ==============================================================================
2026-08-03T13:53:04.6362171Z Task         : Bash
2026-08-03T13:53:04.6362217Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-03T13:53:04.6362293Z Version      : 3.227.0
2026-08-03T13:53:04.6362339Z Author       : Microsoft Corporation
2026-08-03T13:53:04.6362390Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-03T13:53:04.6362472Z ==============================================================================
2026-08-03T13:53:05.3982262Z Generating script.
2026-08-03T13:53:05.3999735Z ========================== Starting Command Output ===========================
2026-08-03T13:53:05.4002669Z [command]/bin/bash /opt/ads-agent/_work/_temp/d5023bab-852c-4452-96bb-d21b23c58452.sh
2026-08-03T13:53:05.4047625Z + shopt -s expand_aliases
2026-08-03T13:53:05.4050600Z + [[ -n okd4_nprd ]]
2026-08-03T13:53:05.4050836Z + [[ okd4_nprd =~ ocp ]]
2026-08-03T13:53:05.4051077Z + [[ -n okd4_nprd ]]
2026-08-03T13:53:05.4051213Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-08-03T13:53:05.4051406Z + app=sipnc-beneficiossociais-backend-des
2026-08-03T13:53:05.4051543Z + oc version
2026-08-03T13:53:05.5563063Z oc v3.11.0+0cbc58b
2026-08-03T13:53:05.5563259Z kubernetes v1.11.0+d4cacc0
2026-08-03T13:53:05.5563570Z features: Basic-Auth GSSAPI Kerberos SPNEGO
2026-08-03T13:53:05.5648052Z 
2026-08-03T13:53:05.5648751Z Server https://api.nprd.caixa:6443
2026-08-03T13:53:05.5649334Z kubernetes v1.25.0-2824+27e744f55d2e99-dirty
2026-08-03T13:53:05.5684368Z ++ oc get pod -l name=sipnc-beneficiossociais-backend-des -n sipnc-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-08-03T13:53:05.5685077Z ++ tac
2026-08-03T13:53:05.5685386Z ++ grep -v '^$'
2026-08-03T13:53:05.5695600Z ++ head -n1
2026-08-03T13:53:07.1649702Z + last_pod=sipnc-beneficiossociais-backend-des-12-86hmq
2026-08-03T13:53:07.1650189Z + echo 'Logs do POD: sipnc-beneficiossociais-backend-des-12-86hmq'
2026-08-03T13:53:07.1651033Z + oc logs sipnc-beneficiossociais-backend-des-12-86hmq -c sipnc-beneficiossociais-backend-des -n sipnc-des
2026-08-03T13:53:07.1651346Z Logs do POD: sipnc-beneficiossociais-backend-des-12-86hmq
2026-08-03T13:53:07.4880538Z exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -Xms512m -Xmx512m -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/SIPNC-beneficiossociais-backend.jar
2026-08-03T13:53:07.4881212Z Could not load Logmanager "org.jboss.logmanager.LogManager"
2026-08-03T13:53:07.4881882Z java.lang.ClassNotFoundException: org.jboss.logmanager.LogManager
2026-08-03T13:53:07.4882139Z 	at java.base/java.net.URLClassLoader.findClass(URLClassLoader.java:445)
2026-08-03T13:53:07.4882333Z 	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:587)
2026-08-03T13:53:07.4882563Z 	at org.springframework.boot.loader.LaunchedURLClassLoader.loadClass(LaunchedURLClassLoader.java:151)
2026-08-03T13:53:07.4882769Z 	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:520)
2026-08-03T13:53:07.4882956Z 	at java.logging/java.util.logging.LogManager$1.run(LogManager.java:239)
2026-08-03T13:53:07.4883129Z 	at java.logging/java.util.logging.LogManager$1.run(LogManager.java:223)
2026-08-03T13:53:07.4883324Z 	at java.base/java.security.AccessController.doPrivileged(AccessController.java:318)
2026-08-03T13:53:07.4883520Z 	at java.logging/java.util.logging.LogManager.<clinit>(LogManager.java:222)
2026-08-03T13:53:07.4883700Z 	at java.logging/java.util.logging.Logger.demandLogger(Logger.java:649)
2026-08-03T13:53:07.4883877Z 	at java.logging/java.util.logging.Logger.getLogger(Logger.java:718)
2026-08-03T13:53:07.4884046Z 	at java.logging/java.util.logging.Logger.getLogger(Logger.java:702)
2026-08-03T13:53:07.4884236Z 	at com.microsoft.applicationinsights.attach.ApplicationInsights.<clinit>(ApplicationInsights.java:28)
2026-08-03T13:53:07.4884751Z 	at br.gov.caixa.sipnc.beneficiossociais.RunApplication.main(RunApplication.java:25)
2026-08-03T13:53:07.4884930Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-08-03T13:53:07.4885124Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-08-03T13:53:07.4885345Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-08-03T13:53:07.4885541Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-08-03T13:53:07.4885720Z 	at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:49)
2026-08-03T13:53:07.4885916Z 	at org.springframework.boot.loader.Launcher.launch(Launcher.java:108)
2026-08-03T13:53:07.4886094Z 	at org.springframework.boot.loader.Launcher.launch(Launcher.java:58)
2026-08-03T13:53:07.4886271Z 	at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:65)
2026-08-03T13:53:07.4886636Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-08-03T13:53:07.4886985Z 2026-08-03 10:53:01.757-03:00 INFO  c.m.applicationinsights.agent - Application Insights Java Agent 3.4.13 started successfully (PID 8, JVM running for 4.059 s)
2026-08-03T13:53:07.4887358Z 2026-08-03 10:53:01.762-03:00 INFO  c.m.applicationinsights.agent - Java version: 17.0.7, vendor: Red Hat, Inc., home: /usr/lib/jvm/java-17-openjdk-17.0.7.0.7-3.el8.x86_64
2026-08-03T13:53:07.4887698Z 2026-08-03 10:53:04.754-03:00 WARN  c.m.a.a.i.p.PerformanceMonitoringService - INITIALISING JFR PROFILING SUBSYSTEM THIS FEATURE IS IN BETA
2026-08-03T13:53:07.4887880Z 
2026-08-03T13:53:07.4887991Z   .   ____          _            __ _ _
2026-08-03T13:53:07.4888142Z  /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
2026-08-03T13:53:07.4888413Z ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
2026-08-03T13:53:07.4888539Z  \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
2026-08-03T13:53:07.4888698Z   '  |____| .__|_| |_|_| |_\__, | / / / /
2026-08-03T13:53:07.4888817Z  =========|_|==============|___/=/_/_/_/
2026-08-03T13:53:07.4888949Z  :: Spring Boot ::                (v2.7.7)
2026-08-03T13:53:07.4889000Z 
2026-08-03T13:53:07.4960580Z ##[section]Finishing: Logs da Aplicação
