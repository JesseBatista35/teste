Estou tomando erro no okd pela versão do compilador do java. Estou usando JDK25 no meu projeto, mas não sei se já está funcional. Se puder analisar se tenho que voltar para uma versão antiga.

WARNING: sun.reflect.Reflection.getCallerClass is not supported. This will impact performance.
Exception in thread "main" java.lang.UnsupportedClassVersionError: br/gov/caixa/sifgd/SifgdBackendApplication has been compiled by a more recent version of the Java Runtime (class file version 69.0), this version of the Java Runtime only recognizes class file versions up to 61.0
at java.base/java.lang.ClassLoader.defineClass1(Native Method)
at java.base/java.lang.ClassLoader.defineClass(ClassLoader.java:1012)
at java.base/java.security.SecureClassLoader.defineClass(SecureClassLoader.java:150)
at java.base/java.net.URLClassLoader.defineClass(URLClassLoader.java:524)
at java.base/java.net.URLClassLoader$1.run(URLClassLoader.java:427)
at java.base/java.net.URLClassLoader$1.run(URLClassLoader.java:421)
at java.base/java.security.AccessController.doPrivileged(AccessController.java:712)
at java.base/java.net.URLClassLoader.findClass(URLClassLoader.java:420)
at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:587)
at org.springframework.boot.loader.net.protocol.jar.JarUrlClassLoader.loadClass(JarUrlClassLoader.java:107)
at org.springframework.boot.loader.launch.LaunchedClassLoader.loadClass(LaunchedClassLoader.java:91)
at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:520)
at java.base/java.lang.Class.forName0(Native Method)
at java.base/java.lang.Class.forName(Class.java:467)
at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:99)
at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:64)
at org.springframework.boot.loader.launch.JarLauncher.main(JarLauncher.java:40)


2026-10-08T16:01:25.0727500Z ##[section]Starting: Logs da Aplicação
2026-10-08T16:01:25.0730833Z ==============================================================================
2026-10-08T16:01:25.0730920Z Task         : Bash
2026-10-08T16:01:25.0730965Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-08T16:01:25.0731025Z Version      : 3.227.0
2026-10-08T16:01:25.0731075Z Author       : Microsoft Corporation
2026-10-08T16:01:25.0731286Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-08T16:01:25.0731352Z ==============================================================================
2026-10-08T16:01:25.1855919Z Generating script.
2026-10-08T16:01:25.1866057Z ========================== Starting Command Output ===========================
2026-10-08T16:01:25.1902174Z [command]/bin/bash /opt/ads-agent/_work/_temp/ef888d66-0f94-48f5-9d77-93fa5ee497a7.sh
2026-10-08T16:01:25.1938828Z + shopt -s expand_aliases
2026-10-08T16:01:25.1939023Z + [[ -n okd4_nprd ]]
2026-10-08T16:01:25.1939186Z + [[ okd4_nprd =~ ocp ]]
2026-10-08T16:01:25.1939315Z + [[ -n okd4_nprd ]]
2026-10-08T16:01:25.1939456Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-10-08T16:01:25.1939628Z + app=sifgd-backend-des
2026-10-08T16:01:25.1940345Z + oc version
2026-10-08T16:01:25.3529552Z oc v3.11.0+0cbc58b
2026-10-08T16:01:25.3530139Z kubernetes v1.11.0+d4cacc0
2026-10-08T16:01:25.3530823Z features: Basic-Auth GSSAPI Kerberos SPNEGO
2026-10-08T16:01:25.3691223Z 
2026-10-08T16:01:25.3691847Z Server https://api.nprd.caixa:6443
2026-10-08T16:01:25.3692167Z kubernetes v1.25.0-2824+27e744f55d2e99-dirty
2026-10-08T16:01:25.3726269Z ++ oc get pod -l name=sifgd-backend-des -n sifgd-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-10-08T16:01:25.3726909Z ++ grep -v '^$'
2026-10-08T16:01:25.3727217Z ++ head -n1
2026-10-08T16:01:25.3728194Z ++ tac
2026-10-08T16:01:26.5499820Z + last_pod=sifgd-backend-des-1-z4ppx
2026-10-08T16:01:26.5500490Z + echo 'Logs do POD: sifgd-backend-des-1-z4ppx'
2026-10-08T16:01:26.5500915Z + oc logs sifgd-backend-des-1-z4ppx -c sifgd-backend-des -n sifgd-des
2026-10-08T16:01:26.5501622Z Logs do POD: sifgd-backend-des-1-z4ppx
2026-10-08T16:01:26.9303193Z exec java -Dserver.address=0.0.0.0 -Dserver.port=8080 -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=sifgd-backend -Delastic.apm.environment=des -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=sifgd-backend -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/sifgd-backend-0.0.1-SNAPSHOT.jar
2026-10-08T16:01:26.9304050Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-10-08T16:01:26.9304634Z WARNING: sun.reflect.Reflection.getCallerClass is not supported. This will impact performance.
2026-10-08T16:01:26.9304968Z Exception in thread "main" java.lang.UnsupportedClassVersionError: br/gov/caixa/sifgd/SifgdBackendApplication has been compiled by a more recent version of the Java Runtime (class file version 69.0), this version of the Java Runtime only recognizes class file versions up to 61.0
2026-10-08T16:01:26.9305249Z 	at java.base/java.lang.ClassLoader.defineClass1(Native Method)
2026-10-08T16:01:26.9305426Z 	at java.base/java.lang.ClassLoader.defineClass(ClassLoader.java:1012)
2026-10-08T16:01:26.9305612Z 	at java.base/java.security.SecureClassLoader.defineClass(SecureClassLoader.java:150)
2026-10-08T16:01:26.9306110Z 	at java.base/java.net.URLClassLoader.defineClass(URLClassLoader.java:524)
2026-10-08T16:01:26.9306284Z 	at java.base/java.net.URLClassLoader$1.run(URLClassLoader.java:427)
2026-10-08T16:01:26.9306450Z 	at java.base/java.net.URLClassLoader$1.run(URLClassLoader.java:421)
2026-10-08T16:01:26.9306608Z 	at java.base/java.security.AccessController.doPrivileged(AccessController.java:712)
2026-10-08T16:01:26.9308323Z 	at java.base/java.net.URLClassLoader.findClass(URLClassLoader.java:420)
2026-10-08T16:01:26.9308861Z 	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:587)
2026-10-08T16:01:26.9309055Z 	at org.springframework.boot.loader.net.protocol.jar.JarUrlClassLoader.loadClass(JarUrlClassLoader.java:107)
2026-10-08T16:01:26.9309282Z 	at org.springframework.boot.loader.launch.LaunchedClassLoader.loadClass(LaunchedClassLoader.java:91)
2026-10-08T16:01:26.9309587Z 	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:520)
2026-10-08T16:01:26.9309740Z 	at java.base/java.lang.Class.forName0(Native Method)
2026-10-08T16:01:26.9309884Z 	at java.base/java.lang.Class.forName(Class.java:467)
2026-10-08T16:01:26.9310063Z 	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:99)
2026-10-08T16:01:26.9310334Z 	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:64)
2026-10-08T16:01:26.9310515Z 	at org.springframework.boot.loader.launch.JarLauncher.main(JarLauncher.java:40)
2026-10-08T16:01:26.9383944Z ##[section]Finishing: Logs da Aplicação



