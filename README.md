Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
/
Releases
/
SIDCE-conta-destino
Search


Caixa

Overview

Boards

Repos

Pipelines
Pipelines
Environments
Releases
Library
Task groups
Deployment groups
Portal Infra

Test Plans

Artifacts
Project settings
All pipelines

SIDCE

SIDCE-conta-destino
Predefined variables
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
Usuario-Azure-DevOps (12)
Scopes: Release
EGRESS_IP_OKD (74)
WO0000072264656 - Config Portal Infrafácil NO_PROXY
Scopes: Release
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
OKD-4-NPRD (12)
Credenciais para o Cluster OKD4 de NPRD (DES/TQS/HMP)
Scopes: Release
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)
Scopes: Release
SIDCE-CONTA-DESTINO-DES (23)
Grupo de variáveis de SIDCE-CONTA-DESTINO-DES
Scopes: EC DES
API_KEY
********
API_KEY_BT
'${SIDCE_BT_APIKEY}'
DATABASE_PASSWD_BT
'${SDCEDB02_MSSQL}'
SSO_CLIENT
********
SSO_CLIENT_BT
'${CLISERDCE_SSO_INTRA}'
_ENV.DATABASE_URL
"jdbc:sqlserver://10.116.93.93:1433;databaseName=DCEDB001;encrypt=false"
_ENV.DATABASE_USERNAME
SDCEDB02
_ENV.ENVIRONMENT
DES
_ENV.HTTPS_PROXY
http://proxydes.caixa:80
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks"
_ENV.NO_PROXY
"*.caixa,*.caixa.gov.br"
_ENV.ROLE_NAME_GET
DCE_CONTA_DESTINO_CONSULTA
_ENV.ROLE_NAME_POST
DCE_CONTA_DESTINO_CADASTRO
_ENV.SID09_SEGMENTO
3054
_ENV.SSERVER_PORT
1433
_ENV.SSO_CLIENT_ID
cli-ser-dce
_ENV.SSO_URL
https://login.des.caixa/auth
_ENV.URL_API_CAIXA
https://api.des.caixa:8443
_ENV.USER_BASIC_AUTH
SDCESD01
_ENV.VAULT_LOCATION
/usr/src/app/secrets_files/SIDCE_DES/
_SECRET.API_KEY
#{API_KEY_BT}#
_SECRET.DATABASE_PASSWORD
#{DATABASE_PASSWD_BT}#
_SECRET.SSO_CLIENT_SECRET
#{SSO_CLIENT_BT}#
SIDCE-CONTA-DESTINO-BT-VAULT-DES (3)
Scopes: EC DES
SIDCE-CONTA-DESTINO-TQS (21)
Grupo de variáveis de SIDCE-CONTA-DESTINO-TQS

Scopes: EC TQS
API_KEY_BT
'${SIDCE_BT_APIKEY}'
DATABASE_PASSWD
********
DATABASE_PASSWD_BT
'${SDCETB01_MSSQL}'
SSO_CLIENT
2dd4a956-f045-44cb-a872-ef4c63fc45f2
SSO_CLIENT_BT
'${CLISERDCE_SSO_INTRA}'
_ENV.DATABASE_URL
"jdbc:sqlserver://10.116.93.93:1433;databaseName=DCEDB001;encrypt=false"
_ENV.DATABASE_USERNAME
SDCETB01
_ENV.ENVIRONMENT
DES
_ENV.HTTPS_PROXY
http://proxydes.caixa:80
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks"
_ENV.NO_PROXY
"*.caixa,*.caixa.gov.br"
_ENV.ROLE_NAME_GET
DCE_CONTA_DESTINO_CONSULTA
_ENV.ROLE_NAME_POST
DCE_CONTA_DESTINO_CADASTRO
_ENV.SSERVER_PORT
1433
_ENV.SSO_CLIENT_ID
cli-ser-dce
_ENV.SSO_URL
https://login.des.caixa/auth
_ENV.USER_BASIC_AUTH
SDCESD01
_ENV.VAULT_LOCATION
/usr/src/app/secrets_files/SIDCE_TQS/
_SECRET.API_KEY
#{API_KEY_BT}#
_SECRET.DATABASE_PASSWORD
#{DATABASE_PASSWD_BT}#
_SECRET.SSO_CLIENT_SECRET
#{SSO_CLIENT_BT}#
SIDCE-CONTA-DESTINO-BT-VAULT-TQS (3)
WO0000080473436
Scopes: EC TQS
NEXUS_VARIABLES (19)
Variáveis disponíveis para todas as builds.
Scopes: QA-APITEST
SIDCE-conta-destino-QA-AUTOAPI (7)
Variaveis para execução da automação de testes de API nas releases da Aplicação
Scopes: QA-APITEST
SIDCE-CONTA-DESTINO-HMP (1)
Grupo de variáveis de SIDCE-CONTA-DESTINO-HMP
Scopes: EC HMP
SIDCE-CONTA-DESTINO-PRD (18)
Grupo de variáveis de SIDCE-CONTA-DESTINO-PRD
Scopes: EC PRD
OKD-4-APL (12)
Scopes: EC PRD
|Manage variable groups
Showing filters 1 through 2

Showing filters 1 through 2

Expanded

Collapsed

Showing 26 deployments

Row 2

EC TQSDeploy release

Row 2

Row 4

Row 3

Row 2

Row 2

Row 5

Row 4

Showing filters 1 through 2


acabei de rodar um novo deploy


exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/sidce-conta-destino-1.131.0.0.jar
Could not load Logmanager "org.jboss.logmanager.LogManager"
java.lang.ClassNotFoundException: org.jboss.logmanager.LogManager
	at java.base/java.net.URLClassLoader.findClass(URLClassLoader.java:445)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:587)
	at org.springframework.boot.loader.net.protocol.jar.JarUrlClassLoader.loadClass(JarUrlClassLoader.java:107)
	at org.springframework.boot.loader.launch.LaunchedClassLoader.loadClass(LaunchedClassLoader.java:91)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:520)
	at java.logging/java.util.logging.LogManager$1.run(LogManager.java:239)
	at java.logging/java.util.logging.LogManager$1.run(LogManager.java:223)
	at java.base/java.security.AccessController.doPrivileged(AccessController.java:318)
	at java.logging/java.util.logging.LogManager.<clinit>(LogManager.java:222)
	at org.springframework.boot.logging.logback.LogbackLoggingSystem.isJulUsingASingleConsoleHandlerAtMost(LogbackLoggingSystem.java:159)
	at org.springframework.boot.logging.logback.LogbackLoggingSystem.isBridgeJulIntoSlf4j(LogbackLoggingSystem.java:151)
	at org.springframework.boot.logging.logback.LogbackLoggingSystem.configureJdkLoggingBridgeHandler(LogbackLoggingSystem.java:140)
	at org.springframework.boot.logging.logback.LogbackLoggingSystem.beforeInitialize(LogbackLoggingSystem.java:134)
	at org.springframework.boot.context.logging.LoggingApplicationListener.onApplicationStartingEvent(LoggingApplicationListener.java:238)
	at org.springframework.boot.context.logging.LoggingApplicationListener.onApplicationEvent(LoggingApplicationListener.java:220)
	at org.springframework.context.event.SimpleApplicationEventMulticaster.doInvokeListener(SimpleApplicationEventMulticaster.java:185)
	at org.springframework.context.event.SimpleApplicationEventMulticaster.invokeListener(SimpleApplicationEventMulticaster.java:178)
	at org.springframework.context.event.SimpleApplicationEventMulticaster.multicastEvent(SimpleApplicationEventMulticaster.java:156)
	at org.springframework.context.event.SimpleApplicationEventMulticaster.multicastEvent(SimpleApplicationEventMulticaster.java:138)
	at org.springframework.boot.context.event.EventPublishingRunListener.multicastInitialEvent(EventPublishingRunListener.java:136)
	at org.springframework.boot.context.event.EventPublishingRunListener.starting(EventPublishingRunListener.java:75)
	at org.springframework.boot.SpringApplicationRunListeners.lambda$starting$0(SpringApplicationRunListeners.java:54)
	at java.base/java.lang.Iterable.forEach(Iterable.java:75)
	at org.springframework.boot.SpringApplicationRunListeners.doWithListeners(SpringApplicationRunListeners.java:118)
	at org.springframework.boot.SpringApplicationRunListeners.starting(SpringApplicationRunListeners.java:54)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:310)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1361)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1350)
	at br.com.caixa.sidcecontadestino.SidceContaDestinoApplication.main(SidceContaDestinoApplication.java:18)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:102)
	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:64)
	at org.springframework.boot.loader.launch.JarLauncher.main(JarLauncher.java:40)

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v3.5.3)

2026-07-16T13:46:26.664-03:00  INFO 8 --- [           main] b.c.c.s.SidceContaDestinoApplication     : Starting SidceContaDestinoApplication v1.131.0.0 using Java 17.0.7 with PID 8 (/deployments/sidce-conta-destino-1.131.0.0.jar started by 1001 in /deployments)
2026-07-16T13:46:26.667-03:00  INFO 8 --- [           main] b.c.c.s.SidceContaDestinoApplication     : The following 1 profile is active: "DES"
2026-07-16T13:46:28.467-03:00  INFO 8 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Overriding bean definition for bean 'customRequestInterceptor' with a different definition: replacing [Generic bean: class=br.com.caixa.sidcecontadestino.core.client.config.CustomRequestInterceptor; scope=singleton; abstract=false; lazyInit=null; autowireMode=0; dependencyCheck=0; autowireCandidate=true; primary=false; fallback=false; factoryBeanName=null; factoryMethodName=null; initMethodNames=null; destroyMethodNames=null; defined in URL [jar:nested:/deployments/sidce-conta-destino-1.131.0.0.jar/!BOOT-INF/classes/!/br/com/caixa/sidcecontadestino/core/client/config/CustomRequestInterceptor.class]] with [Root bean: class=null; scope=; abstract=false; lazyInit=null; autowireMode=3; dependencyCheck=0; autowireCandidate=true; primary=false; fallback=false; factoryBeanName=feignGlobalConfig; factoryMethodName=customRequestInterceptor; initMethodNames=null; destroyMethodNames=[(inferred)]; defined in class path resource [br/com/caixa/sidcecontadestino/core/client/config/FeignGlobalConfig.class]]
2026-07-16T13:46:28.550-03:00  WARN 8 --- [           main] ConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: java.lang.IllegalArgumentException: http://${URL_API_CAIXA}/conta-deposito/consultas-zos/v1/conta/funcionalidades-especiais is malformed
2026-07-16T13:46:28.572-03:00  INFO 8 --- [           main] .s.b.a.l.ConditionEvaluationReportLogger : 

Error starting ApplicationContext. To display the condition evaluation report re-run your application with 'debug' enabled.
2026-07-16T13:46:28.591-03:00 ERROR 8 --- [           main] o.s.boot.SpringApplication               : Application run failed

java.lang.IllegalArgumentException: http://${URL_API_CAIXA}/conta-deposito/consultas-zos/v1/conta/funcionalidades-especiais is malformed
	at org.springframework.cloud.openfeign.FeignClientsRegistrar.getUrl(FeignClientsRegistrar.java:127) ~[spring-cloud-openfeign-core-4.3.0.jar!/:4.3.0]
	at org.springframework.cloud.openfeign.FeignClientsRegistrar.getUrl(FeignClientsRegistrar.java:370) ~[spring-cloud-openfeign-core-4.3.0.jar!/:4.3.0]
	at org.springframework.cloud.openfeign.FeignClientsRegistrar.eagerlyRegisterFeignClientBeanDefinition(FeignClientsRegistrar.java:226) ~[spring-cloud-openfeign-core-4.3.0.jar!/:4.3.0]
	at org.springframework.cloud.openfeign.FeignClientsRegistrar.registerFeignClient(FeignClientsRegistrar.java:215) ~[spring-cloud-openfeign-core-4.3.0.jar!/:4.3.0]
	at org.springframework.cloud.openfeign.FeignClientsRegistrar.registerFeignClients(FeignClientsRegistrar.java:204) ~[spring-cloud-openfeign-core-4.3.0.jar!/:4.3.0]
	at org.springframework.cloud.openfeign.FeignClientsRegistrar.registerBeanDefinitions(FeignClientsRegistrar.java:154) ~[spring-cloud-openfeign-core-4.3.0.jar!/:4.3.0]
	at org.springframework.context.annotation.ImportBeanDefinitionRegistrar.registerBeanDefinitions(ImportBeanDefinitionRegistrar.java:86) ~[spring-context-6.2.8.jar!/:6.2.8]
	at org.springframework.context.annotation.ConfigurationClassBeanDefinitionReader.lambda$loadBeanDefinitionsFromRegistrars$1(ConfigurationClassBeanDefinitionReader.java:398) ~[spring-context-6.2.8.jar!/:6.2.8]
	at java.base/java.util.LinkedHashMap.forEach(LinkedHashMap.java:721) ~[na:na]
	at org.springframework.context.annotation.ConfigurationClassBeanDefinitionReader.loadBeanDefinitionsFromRegistrars(ConfigurationClassBeanDefinitionReader.java:397) ~[spring-context-6.2.8.jar!/:6.2.8]
	at org.springframework.context.annotation.ConfigurationClassBeanDefinitionReader.loadBeanDefinitionsForConfigurationClass(ConfigurationClassBeanDefinitionReader.java:151) ~[spring-context-6.2.8.jar!/:6.2.8]
	at org.springframework.context.annotation.ConfigurationClassBeanDefinitionReader.loadBeanDefinitions(ConfigurationClassBeanDefinitionReader.java:123) ~[spring-context-6.2.8.jar!/:6.2.8]
	at org.springframework.context.annotation.ConfigurationClassPostProcessor.processConfigBeanDefinitions(ConfigurationClassPostProcessor.java:430) ~[spring-context-6.2.8.jar!/:6.2.8]
	at org.springframework.context.annotation.ConfigurationClassPostProcessor.postProcessBeanDefinitionRegistry(ConfigurationClassPostProcessor.java:290) ~[spring-context-6.2.8.jar!/:6.2.8]
	at org.springframework.context.support.PostProcessorRegistrationDelegate.invokeBeanDefinitionRegistryPostProcessors(PostProcessorRegistrationDelegate.java:349) ~[spring-context-6.2.8.jar!/:6.2.8]
	at org.springframework.context.support.PostProcessorRegistrationDelegate.invokeBeanFactoryPostProcessors(PostProcessorRegistrationDelegate.java:118) ~[spring-context-6.2.8.jar!/:6.2.8]
	at org.springframework.context.support.AbstractApplicationContext.invokeBeanFactoryPostProcessors(AbstractApplicationContext.java:791) ~[spring-context-6.2.8.jar!/:6.2.8]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:609) ~[spring-context-6.2.8.jar!/:6.2.8]
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[spring-boot-3.5.3.jar!/:3.5.3]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:752) ~[spring-boot-3.5.3.jar!/:3.5.3]
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:439) ~[spring-boot-3.5.3.jar!/:3.5.3]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:318) ~[spring-boot-3.5.3.jar!/:3.5.3]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1361) ~[spring-boot-3.5.3.jar!/:3.5.3]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1350) ~[spring-boot-3.5.3.jar!/:3.5.3]
	at br.com.caixa.sidcecontadestino.SidceContaDestinoApplication.main(SidceContaDestinoApplication.java:18) ~[!/:1.131.0.0]
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77) ~[na:na]
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:na]
	at java.base/java.lang.reflect.Method.invoke(Method.java:568) ~[na:na]
	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:102) ~[sidce-conta-destino-1.131.0.0.jar:1.131.0.0]
	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:64) ~[sidce-conta-destino-1.131.0.0.jar:1.131.0.0]
	at org.springframework.boot.loader.launch.JarLauncher.main(JarLauncher.java:40) ~[sidce-conta-destino-1.131.0.0.jar:1.131.0.0]
Caused by: java.net.URISyntaxException: Illegal character in authority at index 7: http://${URL_API_CAIXA}/conta-deposito/consultas-zos/v1/conta/funcionalidades-especiais
	at java.base/java.net.URI$Parser.fail(URI.java:2976) ~[na:na]
	at java.base/java.net.URI$Parser.parseAuthority(URI.java:3310) ~[na:na]
	at java.base/java.net.URI$Parser.parseHierarchical(URI.java:3221) ~[na:na]
	at java.base/java.net.URI$Parser.parse(URI.java:3177) ~[na:na]
	at java.base/java.net.URI.<init>(URI.java:623) ~[na:na]
	at org.springframework.cloud.openfeign.FeignClientsRegistrar.getUrl(FeignClientsRegistrar.java:124) ~[spring-cloud-openfeign-core-4.3.0.jar!/:4.3.0]
	... 31 common frames omitted



