Prezados bom dia

Solicitamos a verificação da geração da release do Módulo SIMTR-Parametrizacao o mesmo está apontando erro no JAVA gerado na build, as variaveis das builds foram todas ajustadas na sexta feira dia 03/07/26 com valores padrões de execução.

Poderiam verificar por gentileza

Evidências
https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=498231&environmentId=2315845

Obrigado !!

==========================================


2026-07-09T12:13:33.5151803Z ##[section]Starting: Verificando Status do Deployment
2026-07-09T12:13:33.5155193Z ==============================================================================
2026-07-09T12:13:33.5155282Z Task         : Bash
2026-07-09T12:13:33.5155326Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-09T12:13:33.5155402Z Version      : 3.227.0
2026-07-09T12:13:33.5155448Z Author       : Microsoft Corporation
2026-07-09T12:13:33.5155511Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-09T12:13:33.5155586Z ==============================================================================
2026-07-09T12:13:33.6250097Z Generating script.
2026-07-09T12:13:33.6251070Z ========================== Starting Command Output ===========================
2026-07-09T12:13:33.6252665Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/87f85e8b-72c6-4280-96f9-8c636d7a59b0.sh
2026-07-09T12:13:33.7686922Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-07-09T12:13:35.3337029Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-07-09T12:13:35.4412086Z Waiting for rollout to finish: 1 old replicas are pending termination...
2026-07-09T12:19:41.0241059Z ##[error]The task has timed out.
2026-07-09T12:19:41.0242606Z ##[section]Finishing: Verificando Status do Deployment

======

2026-07-09T12:19:41.0271178Z ##[section]Starting: Logs da Aplicação
2026-07-09T12:19:41.0275185Z ==============================================================================
2026-07-09T12:19:41.0275269Z Task         : Bash
2026-07-09T12:19:41.0275316Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-09T12:19:41.0275390Z Version      : 3.227.0
2026-07-09T12:19:41.0275436Z Author       : Microsoft Corporation
2026-07-09T12:19:41.0275489Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-09T12:19:41.0275574Z ==============================================================================
2026-07-09T12:19:41.1481762Z Generating script.
2026-07-09T12:19:41.1496669Z ========================== Starting Command Output ===========================
2026-07-09T12:19:41.1502007Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/7de9a84a-7bd8-4a2f-b5f1-d315f8b47aac.sh
2026-07-09T12:19:41.1550778Z + shopt -s expand_aliases
2026-07-09T12:19:41.1551153Z + [[ -n okd4_nprd ]]
2026-07-09T12:19:41.1551632Z + [[ okd4_nprd =~ ocp ]]
2026-07-09T12:19:41.1551990Z + [[ -n okd4_nprd ]]
2026-07-09T12:19:41.1552321Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-07-09T12:19:41.1552753Z + app=simtr-parametrizacao-des
2026-07-09T12:19:41.1560740Z + oc version
2026-07-09T12:19:41.2580300Z oc v3.11.0+0cbc58b
2026-07-09T12:19:41.2581799Z kubernetes v1.11.0+d4cacc0
2026-07-09T12:19:41.2583715Z features: Basic-Auth GSSAPI Kerberos SPNEGO
2026-07-09T12:19:41.2704931Z 
2026-07-09T12:19:41.2705898Z Server https://api.nprd.caixa:6443
2026-07-09T12:19:41.2706600Z kubernetes v1.25.0-2824+27e744f55d2e99-dirty
2026-07-09T12:19:41.2735492Z ++ oc get pod -l name=simtr-parametrizacao-des -n simtr-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-07-09T12:19:41.2735891Z ++ tac
2026-07-09T12:19:41.2741984Z ++ grep -v '^$'
2026-07-09T12:19:41.2781715Z ++ head -n1
2026-07-09T12:19:41.4309197Z + last_pod=simtr-parametrizacao-des-132-ck295
2026-07-09T12:19:41.4310156Z + echo 'Logs do POD: simtr-parametrizacao-des-132-ck295'
2026-07-09T12:19:41.4310561Z + oc logs simtr-parametrizacao-des-132-ck295 -c simtr-parametrizacao-des -n simtr-des
2026-07-09T12:19:41.4310799Z Logs do POD: simtr-parametrizacao-des-132-ck295
2026-07-09T12:19:41.5865965Z exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Dfile.encoding=UTF-8 -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -Xms512m -Xmx1024m -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=simtr-parametrizacao -Delastic.apm.environment=des -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=simtr-parametrizacao -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
2026-07-09T12:19:41.5866825Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-07-09T12:19:41.5867202Z WARNING: sun.reflect.Reflection.getCallerClass is not supported. This will impact performance.
2026-07-09T12:19:41.5867419Z Exception in thread "main" java.lang.reflect.InvocationTargetException
2026-07-09T12:19:41.5867697Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-09T12:19:41.5867930Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-09T12:19:41.5868250Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-09T12:19:41.5868482Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
2026-07-09T12:19:41.5869011Z 	at io.quarkus.bootstrap.runner.QuarkusEntryPoint.doRun(QuarkusEntryPoint.java:61)
2026-07-09T12:19:41.5869232Z 	at io.quarkus.bootstrap.runner.QuarkusEntryPoint.main(QuarkusEntryPoint.java:32)
2026-07-09T12:19:41.5869533Z Caused by: java.lang.UnsupportedClassVersionError: br/gov/caixa/simtr/arquitetura/configuracao/LogFiltroConfiguracao has been compiled by a more recent version of the Java Runtime (class file version 61.0), this version of the Java Runtime only recognizes class file versions up to 55.0
2026-07-09T12:19:41.5869901Z 	at java.base/java.lang.ClassLoader.defineClass1(Native Method)
2026-07-09T12:19:41.5870097Z 	at java.base/java.lang.ClassLoader.defineClass(ClassLoader.java:1017)
2026-07-09T12:19:41.5873361Z 	at io.quarkus.bootstrap.runner.RunnerClassLoader.loadClass(RunnerClassLoader.java:105)
2026-07-09T12:19:41.5873907Z 	at io.quarkus.bootstrap.runner.RunnerClassLoader.loadClass(RunnerClassLoader.java:65)
2026-07-09T12:19:41.5874355Z 	at io.quarkus.runtime.configuration.MappingsConfigBuilder.addMapping(MappingsConfigBuilder.java:13)
2026-07-09T12:19:41.5874839Z 	at io.quarkus.runtime.generated.StaticInitMappingsConfigBuilder.configBuilder(Unknown Source)
2026-07-09T12:19:41.5875259Z 	at io.quarkus.runtime.configuration.ConfigUtils.configBuilder(ConfigUtils.java:205)
2026-07-09T12:19:41.5875661Z 	at io.quarkus.runtime.generated.Config.<clinit>(Unknown Source)
2026-07-09T12:19:41.5875964Z 	at io.quarkus.runner.ApplicationImpl.<clinit>(Unknown Source)
2026-07-09T12:19:41.5876294Z 	at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
2026-07-09T12:19:41.5876726Z 	at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
2026-07-09T12:19:41.5877160Z 	at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
2026-07-09T12:19:41.5877583Z 	at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)
2026-07-09T12:19:41.5877936Z 	at io.quarkus.runtime.Quarkus.run(Quarkus.java:70)
2026-07-09T12:19:41.5878240Z 	at io.quarkus.runtime.Quarkus.run(Quarkus.java:44)
2026-07-09T12:19:41.5878551Z 	at io.quarkus.runtime.Quarkus.run(Quarkus.java:124)
2026-07-09T12:19:41.5878854Z 	at io.quarkus.runner.GeneratedMain.main(Unknown Source)
2026-07-09T12:19:41.5879090Z 	... 6 more
2026-07-09T12:19:41.5944151Z ##[section]Finishing: Logs da Aplicação


=====



exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Dfile.encoding=UTF-8 -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -Xms512m -Xmx1024m -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=simtr-parametrizacao -Delastic.apm.environment=des -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=simtr-parametrizacao -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: sun.reflect.Reflection.getCallerClass is not supported. This will impact performance.
Exception in thread "main" java.lang.reflect.InvocationTargetException
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at io.quarkus.bootstrap.runner.QuarkusEntryPoint.doRun(QuarkusEntryPoint.java:61)
	at io.quarkus.bootstrap.runner.QuarkusEntryPoint.main(QuarkusEntryPoint.java:32)
Caused by: java.lang.UnsupportedClassVersionError: br/gov/caixa/simtr/arquitetura/configuracao/LogFiltroConfiguracao has been compiled by a more recent version of the Java Runtime (class file version 61.0), this version of the Java Runtime only recognizes class file versions up to 55.0
	at java.base/java.lang.ClassLoader.defineClass1(Native Method)
	at java.base/java.lang.ClassLoader.defineClass(ClassLoader.java:1017)
	at io.quarkus.bootstrap.runner.RunnerClassLoader.loadClass(RunnerClassLoader.java:105)
	at io.quarkus.bootstrap.runner.RunnerClassLoader.loadClass(RunnerClassLoader.java:65)
	at io.quarkus.runtime.configuration.MappingsConfigBuilder.addMapping(MappingsConfigBuilder.java:13)
	at io.quarkus.runtime.generated.StaticInitMappingsConfigBuilder.configBuilder(Unknown Source)
	at io.quarkus.runtime.configuration.ConfigUtils.configBuilder(ConfigUtils.java:205)
	at io.quarkus.runtime.generated.Config.<clinit>(Unknown Source)
	at io.quarkus.runner.ApplicationImpl.<clinit>(Unknown Source)
	at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
	at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
	at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)
	at io.quarkus.runtime.Quarkus.run(Quarkus.java:70)
	at io.quarkus.runtime.Quarkus.run(Quarkus.java:44)
	at io.quarkus.runtime.Quarkus.run(Quarkus.java:124)
	at io.quarkus.runner.GeneratedMain.main(Unknown Source)
	... 6 more





