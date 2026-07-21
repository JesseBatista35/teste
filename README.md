2026-07-21T14:29:20.7435629Z ##[section]Starting: Verificando Status do Deployment
2026-07-21T14:29:20.7438526Z ==============================================================================
2026-07-21T14:29:20.7438602Z Task         : Bash
2026-07-21T14:29:20.7438653Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-21T14:29:20.7438716Z Version      : 3.227.0
2026-07-21T14:29:20.7438757Z Author       : Microsoft Corporation
2026-07-21T14:29:20.7438817Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-21T14:29:20.7438898Z ==============================================================================
2026-07-21T14:29:21.4222044Z Generating script.
2026-07-21T14:29:21.4232351Z ========================== Starting Command Output ===========================
2026-07-21T14:29:21.4239618Z [command]/bin/bash /opt/ads-agent/_work/_temp/b0df0f7a-6d98-43f0-9839-2404b5983539.sh
2026-07-21T14:29:21.6520754Z Waiting for rollout to finish: 0 of 1 updated replicas are available...
2026-07-21T14:35:28.2528560Z ##[error]The task has timed out.
2026-07-21T14:35:28.2529909Z ##[section]Finishing: Verificando Status do Deployment



2026-07-21T14:35:28.2553062Z ##[section]Starting: Logs da Aplicação
2026-07-21T14:35:28.2556783Z ==============================================================================
2026-07-21T14:35:28.2556939Z Task         : Bash
2026-07-21T14:35:28.2557003Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-21T14:35:28.2557122Z Version      : 3.227.0
2026-07-21T14:35:28.2557456Z Author       : Microsoft Corporation
2026-07-21T14:35:28.2557534Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-21T14:35:28.2557644Z ==============================================================================
2026-07-21T14:35:29.1415750Z Generating script.
2026-07-21T14:35:29.1426344Z ========================== Starting Command Output ===========================
2026-07-21T14:35:29.1456527Z [command]/bin/bash /opt/ads-agent/_work/_temp/a36bbe1e-628e-4fc0-b025-678c3f494a42.sh
2026-07-21T14:35:29.1480158Z + shopt -s expand_aliases
2026-07-21T14:35:29.1480347Z + [[ -n okd4_nprd ]]
2026-07-21T14:35:29.1481337Z + [[ okd4_nprd =~ ocp ]]
2026-07-21T14:35:29.1481584Z + [[ -n okd4_nprd ]]
2026-07-21T14:35:29.1481697Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-07-21T14:35:29.1481855Z + app=siavl-gerencial-backend-des
2026-07-21T14:35:29.1481963Z + oc version
2026-07-21T14:35:29.2989452Z oc v3.11.0+0cbc58b
2026-07-21T14:35:29.2989657Z kubernetes v1.11.0+d4cacc0
2026-07-21T14:35:29.2989975Z features: Basic-Auth GSSAPI Kerberos SPNEGO
2026-07-21T14:35:29.3101654Z 
2026-07-21T14:35:29.3102209Z Server https://api.nprd.caixa:6443
2026-07-21T14:35:29.3102559Z kubernetes v1.25.0-2824+27e744f55d2e99-dirty
2026-07-21T14:35:29.3140133Z ++ oc get pod -l name=siavl-gerencial-backend-des -n siavl-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-07-21T14:35:29.3140576Z ++ tac
2026-07-21T14:35:29.3140793Z ++ grep -v '^$'
2026-07-21T14:35:29.3140952Z ++ head -n1
2026-07-21T14:35:29.5604101Z + last_pod=siavl-gerencial-backend-des-9-9zlts
2026-07-21T14:35:29.5604361Z + echo 'Logs do POD: siavl-gerencial-backend-des-9-9zlts'
2026-07-21T14:35:29.5604612Z + oc logs siavl-gerencial-backend-des-9-9zlts -c siavl-gerencial-backend-des -n siavl-des
2026-07-21T14:35:29.5604898Z Logs do POD: siavl-gerencial-backend-des-9-9zlts
2026-07-21T14:35:29.9198663Z exec java -Dserver.address=0.0.0.0 -Dserver.port=8080 -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-ac***-nprd.jks -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=siavl-gerencial-backend -Delastic.apm.environment=des -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos4.caixa -Delastic.apm.global_labels=deployment=siavl-gerencial-backend -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/SIAVL-gerencial-backend.jar
2026-07-21T14:35:29.9199344Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-07-21T14:35:29.9199553Z WARNING: sun.reflect.Reflection.getCallerClass is not supported. This will impact performance.
2026-07-21T14:35:29.9199890Z 2026-07-21 11:33:26,590 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - apm-server-devops.produtos4.caixa
2026-07-21T14:35:29.9200195Z Exception in thread "main" java.lang.UnsupportedClassVersionError: br/gov/caixa/siavl/gerencial/RunApplication has been compiled by a more recent version of the Java Runtime (class file version 65.0), this version of the Java Runtime only recognizes class file versions up to 61.0
2026-07-21T14:35:29.9200586Z 	at java.base/java.lang.ClassLoader.defineClass1(Native Method)
2026-07-21T14:35:29.9200755Z 	at java.base/java.lang.ClassLoader.defineClass(ClassLoader.java:1012)
2026-07-21T14:35:29.9200947Z 	at java.base/java.security.SecureClassLoader.defineClass(SecureClassLoader.java:150)
2026-07-21T14:35:29.9201131Z 	at java.base/java.net.URLClassLoader.defineClass(URLClassLoader.java:524)
2026-07-21T14:35:29.9201622Z 	at java.base/java.net.URLClassLoader$1.run(URLClassLoader.java:427)
2026-07-21T14:35:29.9201780Z 	at java.base/java.net.URLClassLoader$1.run(URLClassLoader.java:421)
2026-07-21T14:35:29.9202061Z 	at java.base/java.security.AccessController.doPrivileged(AccessController.java:712)
2026-07-21T14:35:29.9202243Z 	at java.base/java.net.URLClassLoader.findClass(URLClassLoader.java:420)
2026-07-21T14:35:29.9202477Z 	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:587)
2026-07-21T14:35:29.9202670Z 	at org.springframework.boot.loader.net.protocol.jar.JarUrlClassLoader.loadClass(JarUrlClassLoader.java:107)
2026-07-21T14:35:29.9202891Z 	at org.springframework.boot.loader.launch.LaunchedClassLoader.loadClass(LaunchedClassLoader.java:91)
2026-07-21T14:35:29.9203066Z 	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:520)
2026-07-21T14:35:29.9203219Z 	at java.base/java.lang.Class.forName0(Native Method)
2026-07-21T14:35:29.9203363Z 	at java.base/java.lang.Class.forName(Class.java:467)
2026-07-21T14:35:29.9203529Z 	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:99)
2026-07-21T14:35:29.9203705Z 	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:64)
2026-07-21T14:35:29.9203878Z 	at org.springframework.boot.loader.launch.JarLauncher.main(JarLauncher.java:40)
2026-07-21T14:35:29.9279970Z ##[section]Finishing: Logs da Aplicação
