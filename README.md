À CAIXA, 


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
SIPNC-gestaousuario-backend
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
SIPNC

SIPNC-gestaousuario-backend
Predefined variables
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
Usuario-Azure-DevOps (12)
Scopes: Release
EGRESS_IP_OKD (81)
WO0000072264656 - Config Portal Infrafácil NO_PROXY
Scopes: Release
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)
Scopes: Release
OKD-4-NPRD (12)
Credenciais para o Cluster OKD4 de NPRD (DES/TQS/HMP)
Scopes: EC DES,EC TQS,EC HMP
SIPNC-GESTAOUSUARIO-BACKEND-DES (12)
Grupo de variáveis de SIPNC-GESTAOUSUARIO-BACKEND-DES
Scopes: EC DES
VAULT_LOCATION
/usr/src/app/secrets_files/SIPNC_DES/
_ENV.APPLICATIONINSIGHTS_ROLE_NAME
SIPNC-GESTAOUSUARIO-BACKEND-DES
_ENV.CAMPOS_OCULTAR_TRILHA
id
_ENV.CLIENT_INTER_X
'${CLISERPNC_SSO_LOGINX}'
_ENV.CLIENT_SECRET
'${CLISERPNC_SSO_INTRA}'
_ENV.CLIENT_SECRET_INTER
'${CLISERPNC_SSO_INTER}'
_ENV.CLIENT_SECRET_INTER_2
'${CLISERPNC_SSO_INTER2}'
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -Xms512m -Xmx512m"
_ENV.LOG_LEVEL
INFO
_ENV.ORACLE_PASS
'${SPANSD01_ORACLE}'
_ENV.SIPNC_API_KEY
'${SIPNC_BT_APIKEY}'
_SECRET.SIPNC_VAULT
#{VAULT_LOCATION}#
SIPNC-COMMON-BACKEND-DES (32)
Scopes: EC DES
CLIENT_SECRET
********
CLIENT_SECRET_INTER
********
CLIENT_SECRET_INTER_2
********
ORACLE_PASS
********
SIPNC_API_KEY
********
_ENV.AMBIENTE
NACIONAL
_ENV.API_MANAGER_URL
https://api.des.caixa:8443
_ENV.API_TRILHA_BASEPATH
/plataforma-unificada/trilha
_ENV.APPLICATIONINSIGHTS_CONNECTION_STRING
"InstrumentationKey=b0142390-50c9-495e-85b4-7b2ade8fc1cf;IngestionEndpoint=https://brazilsoutheast-0.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsoutheast.livediagnostics.monitor.azure.com/"
_ENV.APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
INFO
_ENV.APPLICATIONINSIGHTS_PROXY
http://proxydes.caixa:80
_ENV.APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
100
_ENV.APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL
INFO
_ENV.DATASOURCE_JDBC_URL
jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(FAILOVER=ON)(LOAD_BALANCE=OFF)(ADDRESS=(PROTOCOL=TCP)(HOST=cnpexdadvm01-scan8.extra.caixa.gov.br)(PORT=1521)))(CONNECT_DATA=(SERVICE_NAME=ORAD01BC)(FAILOVER_MODE=(TYPE=SELECT)(METHOD=BASIC)(RETRIES=5)(DELAY=5))))
_ENV.FLAG_CERTIFICADO_DIGITAL
false
_ENV.ORACLE_CONNECTIONTIMEOUT
30000
_ENV.ORACLE_IDLETIMEOUT
900000
_ENV.ORACLE_KEEPALIVETIME
0
_ENV.ORACLE_MAXIMUMPOOLSIZE
25
_ENV.ORACLE_MAXLIFETIME
1800000
_ENV.ORACLE_MINIMUMIDLE
3
_ENV.ORACLE_SHOW_SQL
false
_ENV.ORACLE_USER
spansd01
_ENV.SIPNC_SSO_URL
https://login.des.caixa
_ENV.SPRING_PROFILES_ACTIVE
production
_ENV.SSL_DISABLED
true
_ENV.SSO_ISSUER
https://login.des.caixa/auth/realms/intranet
_SECRET.CLIENT_SECRET
#{CLIENT_SECRET}#
_SECRET.CLIENT_SECRET_INTER
#{CLIENT_SECRET_INTER}#
_SECRET.CLIENT_SECRET_INTER_2
#{CLIENT_SECRET_INTER_2}#
_SECRET.ORACLE_PASS
#{ORACLE_PASS}#
_SECRET.SIPNC_API_KEY
#{SIPNC_API_KEY}#
SIPNC-BT-VAULT-DES (1)
Scopes: EC DES
BT_SECRETS_LIST
SIPNC_DES/CLISERPNC_SSO_INTER,SIPNC_DES/CLISERPNC_SSO_INTER2,SIPNC_DES/CLISERPNC_SSO_INTRA,SIPNC_DES/CLISERPNC_SSO_LOGINX,SIPNC_DES/SIPNC_BT_APIKEY,SIPNC_DES/SPANSD01_ORACLE
SIPNC-VAULT-SECRET-DES (2)

Scopes: EC DES
BT_CLIENT_ID
cf3f8e07-7ed0-4d5c-8a17-7cc1d0c8a46d
BT_CLIENT_SECRET
********
SIPNC-GESTAOUSUARIO-BACKEND-TQS (4)
Grupo de variáveis de SIPNC-GESTAOUSUARIO-BACKEND-TQS
Scopes: EC TQS
SIPNC-COMMON-BACKEND-TQS (32)
Scopes: EC TQS
SIPNC-GESTAOUSUARIO-BACKEND-HMP (1)
Grupo de variáveis de SIPNC-GESTAOUSUARIO-BACKEND-HMP
Scopes: EC HMP
OKD-4-APL (12)
Scopes: EC PRD,EC PRD2
SIPNC-GESTAOUSUARIO-BACKEND-OKD4-PRD (6)
SIPNC-GESTAOUSUARIO-BACKEND-OKD4-PRD
Scopes: EC PRD
SIPNC-COMMON-BACKEND-PRD (32)
Scopes: EC PRD
SIPNC-GESTAOUSUARIO-BACKEND-OKD4-PRD2 (6)
SIPNC-GESTAOUSUARIO-BACKEND-OKD4-PRD2
Scopes: EC PRD2
SIPNC-COMMON-BACKEND-PRD2 (32)
Scopes: EC PRD2
|Manage variable groups
1 pipelines found

Row 2

Showing 18 deployments

Showing filters 1 through 2

1 pipelines found

Row 2

Row 2

Row 2

Showing 19 deployments

Row 2

Showing filters 1 through 2



A análise realizada demonstrou que a alteração solicitada na WO0000081383292, referente à utilização da imagem 7.4.22-openjdk-17.0.15-bt-23, não foi homologada com sucesso pela pipeline. Durante a execução, observou-se que a imagem configurada estava associada ao builder Quarkus, resultando em incompatibilidade com a configuração esperada para o projeto e ocasionando a falha no estágio de Build S2I Binary.

Após os devidos ajustes, a referência à imagem foi substituída pela openjdk17, alinhando a esteira à stack adequada para a aplicação. Com essa alteração, a execução da pipeline transcorreu normalmente, culminando na conclusão bem-sucedida do processo de build.

Dessa forma, conclui-se que a indisponibilidade ou incompatibilidade da imagem 7.4.22-openjdk-17.0.15-bt-23 foi a causa do insucesso inicial, enquanto a adoção da imagem openjdk17 restabeleceu o funcionamento correto da esteira.

Thiago Silva
Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD

Boa noite entendi que foi retornada a configuração da imagem anterior porém estamos configurando o projeto para usar o BeyondTrust.

Por esse motivo temos que usar alguma das versões que atenda o openjdk17 que está listado na wiki https://devops.caixa/projetos/Caixa/_wiki/wikis/Caixa.wiki/2644/Configura%C3%A7%C3%A3o-Beyondtrust-JBoss-EAP-7

==================================
eles estou querendo uar uma wiki com imagem de jboss


Skip to main content
Azure DevOps
projetos
/
Caixa
/
Overview
/
Wiki
/
Azure Wiki
/
Configuração Beyondtrust JBoss EAP 7
Search


Caixa

Overview
Summary
Dashboards
Wiki

Boards

Repos

Pipelines

Test Plans

Artifacts
Project settings

Caixa.wiki

bey


New page
Configuração Beyondtrust JBoss EAP 7

Follow
1

Edit

Rafael Augusto Soares
30 de jan.
Vault Jboss
1 Abrir chamado para equipe de esteiras solicitando a alteração da imagem imagem do Jboss na Pipeline do projeto
(Serviços.caixa > Tecnologia da Informação > Centralizadoras de Tecnologia da Informação > Suporte à Aplicação Multiplataforma > Suporte aos produtos utilizados nas Esteiras DevOps)

Versões disponíveis:
7.0.0-bt-23
7.0.5-db2-bt-23
7.0.9-bt-23
7.1.0-bt-23
7.1.0-mscore-fonts-bt-23
7.1.6-appinsights-bt-23
7.1.6-bt-23
7.1.6-jdk8-301-bt-23
7.1.6-jdk8-301-bt-23.3.1
7.1.6-jdk8-301-hsm-4.10.2-bt-23.3.1
7.2.0-bt-23
7.2.8-bt-23
7.2.9-openjdk-1.8.0.452-bt-23
7.3.0-bt-23
7.3.1-bt-23
7.3.1-jdk11-bt-23
7.3.10-jdk-11.0.11-bt-23
7.3.10-openjdk-1.8.0.452-bt-23
7.4-update4-bt-23
7.4.11-jdk8-hsm-bt-23.3.1
7.4.11-openjdk-17-bt-23
7.4.11-openjdk-8-bt-23
7.4.11-openjdk-8-ubi9-bt-23
7.4.11-openjdk11-bt-23
7.4.11-openjdk17-bt-23
7.4.14-openjdk-17-bt-23
7.4.18-jdk8-301-hsm-4.10.2-bt-23
7.4.21-openjdk-17-bt-23
7.4.22-openjdk-1.8.0.452-bt-23
7.4.22-openjdk-11.0.25-bt-23
7.4.22-openjdk-17.0.15-bt-23
7.4.4-java11-bt-23
7.4.4-java11-fonts.1-bt-23

image.png

2 Ajustes na release do projeto
2.1 Abrir chamado para equipe de esteiras solicitando a inclusão da task na stage da release.*
(Serviços.caixa > Tecnologia da Informação > Centralizadoras de Tecnologia da Informação > Suporte à Aplicação Multiplataforma > Suporte aos produtos utilizados nas Esteiras DevOps)

O pedido deve ser feito para cada stage do projeto(EC DES, EC HMP, EC PRD).

image.png

2.2 Solicitar também que a task Cria_APP_OKD esteja na versão 13 ou superior.
3 Solicitar a criação da library do VAULT para cada ambiente(VAULT DES, VAULT HMP, VAULT PRD).
image.png

4 Abrir chamado para a segurança solicitando o cadastro das senhas na folder do projeto no Beyound Trust(SIGLA_DES, SIGLA_HMP, SIGLA_PRD).
(Serviços.caixa > Tecnologia da Informação > Segurança Tecnológica > Acesso > Inserir senha de usuário de serviço)

Exemplo de chamado:

Cadastro do usuário SPIBD01 da base do Oracle no Cofre.

Usuário de serviço: SPIBD01
Produto: Oracle
Sugestão de alias: SPIBD01_ORACLE

5 Abrir chamado para a segurança solicitando a configuração da library com as credenciais usadas pelo módulo.
image.png

6 Equipe de desenvolvimento altera a library do projeto
Obs.: O valor não utiliza aspas simples.

image.png

7 Equipe de desenvolvimento altera o standalone.xml do projeto
Sugestão de criar uma nova branch para a config.

image.png

image.png

8 Equipe de desenvolvimento deve verificar no Openshift se os valores foram substituídos corretamente no ConfigMap do projeto
image.png

62 visits in last 30 days
Showing 25 filtered items.

Get started and run this pipeline for the first time!

Showing 31 filtered items.

Showing 25 filtered items.

Showing 25 filtered items.

Get started and run this pipeline for the first time!

Showing 25 filtered items.

Showing 31 filtered items.

Collapsed

Expanded

Collapsed

Expanded

Collapsed

Collapsed

Showing filters 1 through 1

1 result found

337 results found

30 results found

5 results found


tem que usar essa

quarkus

Skip to main content
Azure DevOps
projetos
/
Caixa
/
Overview
/
Wiki
/
Azure Wiki
/
Configuração Beyondtrust Quarkus
Search


Caixa

Overview
Summary
Dashboards
Wiki

Boards

Repos

Pipelines

Test Plans

Artifacts
Project settings

Caixa.wiki

bey


New page
Configuração Beyondtrust Quarkus

Follow
6

Edit

Rafael Augusto Soares
30 de jul. de 2025
Instruções para Integração do BeyondTrust no Projeto Quarkus
1. A equipe de projeto deve abrir chamado para a equipe de esteiras.
Solicitar as seguintes ações:

Adicionar a task do BeyondTrust na release do projeto após a task Cria_APP_OKD.
⚠️ Certifique-se de que a task Cria_APP_OKD_ATUALIZA_VARIAVEIS esteja na última versão.

Criar uma library para o escopo desejado, que pode ser DES, TQS e/ou HMP, com o sufixo -BT-VAULT-<AMBIENTE>.
Exemplos:

meu-projeto-BT-VAULT-DES
meu-projeto-BT-VAULT-TQS
meu-projeto-BT-VAULT-HMP
A equipe da esteira deve informar à equipe de segurança o endereço IP do servidor de origem do sistema, que deverá ser configurado no BeyondTrust.

Caminho para abertura da requisição no servicos.caixa:

Tecnologia da Informação e Comunicação > Centralizadoras de Tecnologia da Informação > Suporte a Infraestrutura de TI NPRD > Suporte à Aplicação Multiplataforma > Suporte ao ambiente de aplicação nas esteiras DevOps

2. Abrir chamado para a Segurança: Cadastro de Senhas
Solicitar o cadastro das senhas na folder do projeto, conforme o(s) ambiente(s) desejado(s): SIGLA_DES, SIGLA_TQS, SIGLA_HMP.

Informar:

Nome do usuário: usuario
Produto: oracle
3. Abrir chamado para a Segurança: Preenchimento da Library
Solicitar o preenchimento da library criada (meu-projeto-BT-VAULT-<AMBIENTE>).

Informar os dados do cofre:

Preencher a variável BT_SECRETS_LIST com a lista de credenciais que serão utilizadas no módulo.
4. Adicionar dependência no pom.xml do projeto
Para projetos com Quarkus 3, adicionar:

<dependency>
  <groupId>io.smallrye.config</groupId>
  <artifactId>smallrye-config-source-file-system</artifactId>
  <version>3.13.2</version>
</dependency>
5. Configurar variável de ambiente na Library
Cadastrar a variável _ENV.SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS com o caminho das secrets no pod.

Composição do caminho
O caminho será composto por:

/usr/src/app/secrets_files/<nome_da_secret_em_minusculo>
Exemplo de configuração
BT_SECRETS_LIST=SIXXX_DES/SXXXBD01_Oracle,SIXXX_DES/SXXXSD01_MQ,SIXXX_DES/SIYYY/SYYYBD01
_ENV.SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS=/usr/src/app/secrets_files/sixxx_des/,/usr/src/app/secrets_files/sixxx_des/siyyy
6. Cadastrar senha no formato esperado
Na library do projeto, cadastrar a senha no seguinte formato:

_ENV.QUARKUS_DATASOURCE_PASSWORD='${sxxxbd01_oracle}'
_ENV.QUARKUS_MQ_PASSWORD='${sxxxsd01_mq}'
_ENV.QUARKUS_DATASOURCE_SIYYY_PASSWORD='${syyybd01}'
119 visits in last 30 days
Showing 25 filtered items.

Get started and run this pipeline for the first time!

Showing 31 filtered items.

Showing 25 filtered items.

Showing 25 filtered items.

Get started and run this pipeline for the first time!

Showing 25 filtered items.

Showing 31 filtered items.

Collapsed

Expanded

Collapsed

Expanded

Collapsed

Collapsed

Showing filters 1 through 1

1 result found

337 results found

30 results found

5 results found


exec java -Dserver.address=0.0.0.0 -Dserver.port=8080 -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -Xms512m -Xmx512m -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=sipnc-gestaousuario-backend -Delastic.apm.environment=des -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=sipnc-gestaousuario-backend -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/SIPNC-gestaousuario-backend.jar
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: sun.reflect.Reflection.getCallerClass is not supported. This will impact performance.
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-08-19 09:43:30.890-03:00 INFO  c.m.applicationinsights.agent - Application Insights Java Agent 3.4.13 started successfully (PID 8, JVM running for 7.297 s)
2026-08-19 09:43:30.894-03:00 INFO  c.m.applicationinsights.agent - Java version: 17.0.7, vendor: Red Hat, Inc., home: /usr/lib/jvm/java-17-openjdk-17.0.7.0.7-3.el8.x86_64
2026-08-19 09:43:33.891-03:00 WARN  c.m.a.a.i.p.PerformanceMonitoringService - INITIALISING JFR PROFILING SUBSYSTEM THIS FEATURE IS IN BETA

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.7.7)

2026-08-19 09:43:35,109 INFO  br.gov.caixa.sipnc.gestaousuario.RunApplication : Starting RunApplication v1.x.0.1 using Java 17.0.7 on sipnc-gestaousuario-backend-des-50-wjqrp with PID 8 (/deployments/SIPNC-gestaousuario-backend.jar started by 1001 in /deployments)
2026-08-19 09:43:35,115 INFO  br.gov.caixa.sipnc.gestaousuario.RunApplication : The following 1 profile is active: "production"
2026-08-19 09:43:39,289 INFO  org.springframework.cloud.context.scope.GenericScope : BeanFactory id=c9e878e6-7b0a-3b1d-b28e-34b8b798acfa
2026-08-19 09:43:40,908 INFO  org.springframework.boot.web.embedded.tomcat.TomcatWebServer : Tomcat initialized with port(s): 8080 (http)
2026-08-19 09:43:40,929 INFO  org.apache.catalina.core.StandardService : Starting service [Tomcat]
2026-08-19 09:43:40,930 INFO  org.apache.catalina.core.StandardEngine : Starting Servlet engine: [Apache Tomcat/9.0.70]
2026-08-19 09:43:41,107 INFO  org.apache.catalina.core.ContainerBase.[Tomcat].[localhost].[/] : Initializing Spring embedded WebApplicationContext
2026-08-19 09:43:41,108 INFO  org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 5818 ms
2026-08-19 09:43:41,426 INFO  io.micrometer.core.instrument.push.PushMeterRegistry : publishing metrics for AzureMonitorMeterRegistry every 1m
2026-08-19 09:43:44,587 WARN  org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'gestaoUsuarioServiceApi' defined in URL [jar:file:/deployments/SIPNC-gestaousuario-backend.jar!/BOOT-INF/classes!/br/gov/caixa/sipnc/gestaousuario/api/service/GestaoUsuarioServiceApi.class]: Unsatisfied dependency expressed through constructor parameter 0; nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'gestaoUsuarioService' defined in URL [jar:file:/deployments/SIPNC-gestaousuario-backend.jar!/BOOT-INF/classes!/br/gov/caixa/sipnc/gestaousuario/service/GestaoUsuarioService.class]: Unsatisfied dependency expressed through constructor parameter 3; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'tokenInternetRequisicaoService': Injection of autowired dependencies failed; nested exception is java.lang.IllegalArgumentException: Could not resolve placeholder 'CLISERPNC_SSO_LOGINX' in value "${CLISERPNC_SSO_LOGINX}"
2026-08-19 09:43:44,609 INFO  org.apache.catalina.core.StandardService : Stopping service [Tomcat]
2026-08-19 09:43:44,698 INFO  org.springframework.boot.autoconfigure.logging.ConditionEvaluationReportLoggingListener : 

Error starting ApplicationContext. To display the conditions report re-run your application with 'debug' enabled.
2026-08-19 09:43:44,723 ERROR org.springframework.boot.SpringApplication : Application run failed
org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'gestaoUsuarioServiceApi' defined in URL [jar:file:/deployments/SIPNC-gestaousuario-backend.jar!/BOOT-INF/classes!/br/gov/caixa/sipnc/gestaousuario/api/service/GestaoUsuarioServiceApi.class]: Unsatisfied dependency expressed through constructor parameter 0; nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'gestaoUsuarioService' defined in URL [jar:file:/deployments/SIPNC-gestaousuario-backend.jar!/BOOT-INF/classes!/br/gov/caixa/sipnc/gestaousuario/service/GestaoUsuarioService.class]: Unsatisfied dependency expressed through constructor parameter 3; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'tokenInternetRequisicaoService': Injection of autowired dependencies failed; nested exception is java.lang.IllegalArgumentException: Could not resolve placeholder 'CLISERPNC_SSO_LOGINX' in value "${CLISERPNC_SSO_LOGINX}"
	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:800)
	at org.springframework.beans.factory.support.ConstructorResolver.autowireConstructor(ConstructorResolver.java:229)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.autowireConstructor(AbstractAutowireCapableBeanFactory.java:1372)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1222)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:582)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542)
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335)
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:955)
	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:918)
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:583)
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:147)
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:731)
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:408)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:307)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1303)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1292)
	at br.gov.caixa.sipnc.gestaousuario.RunApplication.main(RunApplication.java:25)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:49)
	at org.springframework.boot.loader.Launcher.launch(Launcher.java:108)
	at org.springframework.boot.loader.Launcher.launch(Launcher.java:58)
	at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:65)
Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'gestaoUsuarioService' defined in URL [jar:file:/deployments/SIPNC-gestaousuario-backend.jar!/BOOT-INF/classes!/br/gov/caixa/sipnc/gestaousuario/service/GestaoUsuarioService.class]: Unsatisfied dependency expressed through constructor parameter 3; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'tokenInternetRequisicaoService': Injection of autowired dependencies failed; nested exception is java.lang.IllegalArgumentException: Could not resolve placeholder 'CLISERPNC_SSO_LOGINX' in value "${CLISERPNC_SSO_LOGINX}"
	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:800)
	at org.springframework.beans.factory.support.ConstructorResolver.autowireConstructor(ConstructorResolver.java:229)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.autowireConstructor(AbstractAutowireCapableBeanFactory.java:1372)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1222)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:582)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542)
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335)
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208)
	at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:276)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1391)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1311)
	at org.springframework.beans.factory.support.ConstructorResolver.resolveAutowiredArgument(ConstructorResolver.java:887)
	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:791)
	... 27 common frames omitted
Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'tokenInternetRequisicaoService': Injection of autowired dependencies failed; nested exception is java.lang.IllegalArgumentException: Could not resolve placeholder 'CLISERPNC_SSO_LOGINX' in value "${CLISERPNC_SSO_LOGINX}"
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessProperties(AutowiredAnnotationBeanPostProcessor.java:405)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1431)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:619)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542)
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335)
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208)
	at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:276)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1391)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1311)
	at org.springframework.beans.factory.support.ConstructorResolver.resolveAutowiredArgument(ConstructorResolver.java:887)
	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:791)
	... 41 common frames omitted
Caused by: java.lang.IllegalArgumentException: Could not resolve placeholder 'CLISERPNC_SSO_LOGINX' in value "${CLISERPNC_SSO_LOGINX}"
	at org.springframework.util.PropertyPlaceholderHelper.parseStringValue(PropertyPlaceholderHelper.java:180)
	at org.springframework.util.PropertyPlaceholderHelper.parseStringValue(PropertyPlaceholderHelper.java:168)
	at org.springframework.util.PropertyPlaceholderHelper.replacePlaceholders(PropertyPlaceholderHelper.java:126)
	at org.springframework.core.env.AbstractPropertyResolver.doResolvePlaceholders(AbstractPropertyResolver.java:239)
	at org.springframework.core.env.AbstractPropertyResolver.resolveRequiredPlaceholders(AbstractPropertyResolver.java:210)
	at org.springframework.core.env.AbstractPropertyResolver.resolveNestedPlaceholders(AbstractPropertyResolver.java:230)
	at org.springframework.boot.context.properties.source.ConfigurationPropertySourcesPropertyResolver.getProperty(ConfigurationPropertySourcesPropertyResolver.java:79)
	at org.springframework.boot.context.properties.source.ConfigurationPropertySourcesPropertyResolver.getProperty(ConfigurationPropertySourcesPropertyResolver.java:60)
	at org.springframework.core.env.AbstractEnvironment.getProperty(AbstractEnvironment.java:594)
	at org.springframework.context.support.PropertySourcesPlaceholderConfigurer$1.getProperty(PropertySourcesPlaceholderConfigurer.java:153)
	at org.springframework.context.support.PropertySourcesPlaceholderConfigurer$1.getProperty(PropertySourcesPlaceholderConfigurer.java:149)
	at org.springframework.core.env.PropertySourcesPropertyResolver.getProperty(PropertySourcesPropertyResolver.java:85)
	at org.springframework.core.env.PropertySourcesPropertyResolver.getPropertyAsRawString(PropertySourcesPropertyResolver.java:74)
	at org.springframework.util.PropertyPlaceholderHelper.parseStringValue(PropertyPlaceholderHelper.java:153)
	at org.springframework.util.PropertyPlaceholderHelper.replacePlaceholders(PropertyPlaceholderHelper.java:126)
	at org.springframework.core.env.AbstractPropertyResolver.doResolvePlaceholders(AbstractPropertyResolver.java:239)
	at org.springframework.core.env.AbstractPropertyResolver.resolveRequiredPlaceholders(AbstractPropertyResolver.java:210)
	at org.springframework.context.support.PropertySourcesPlaceholderConfigurer.lambda$processProperties$0(PropertySourcesPlaceholderConfigurer.java:191)
	at org.springframework.beans.factory.support.AbstractBeanFactory.resolveEmbeddedValue(AbstractBeanFactory.java:936)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1332)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1311)
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.resolveFieldValue(AutowiredAnnotationBeanPostProcessor.java:657)
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:640)
	at org.springframework.beans.factory.annotation.InjectionMetadata.inject(InjectionMetadata.java:119)
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessProperties(AutowiredAnnotationBeanPostProcessor.java:399)
	... 53 common frames omitted




os beyoiubdtrus esta funcionado 


2026-08-19 12:42:45,434 INFO Getting secrets just once, POLLING_WAIT_BETWEEN_REQUESTS_MINUTES was not configured
2026-08-19 12:42:45,435 INFO (7a1971be-9bcb-11f1-9a82-0a5819020f9e) APP VERSION: 2.1.0
2026-08-19 12:42:45,435 INFO (7a1971be-9bcb-11f1-9a82-0a5819020f9e) Starting Execution...7a1971be-9bcb-11f1-9a82-0a5819020f9e
2026-08-19 12:42:45,435 INFO (7a1971be-9bcb-11f1-9a82-0a5819020f9e) You are using: <,> as List delimiter
2026-08-19 12:42:45,435 WARNING (7a1971be-9bcb-11f1-9a82-0a5819020f9e) InsecureRequestWarning: Unverified HTTPS request is being made to host https://sicsn.caixa/BeyondTrust/api/public/v3'. Adding certificate verification isstrongly advised. See: https://urllib3.readthedocs.io/en/1.26.x/advanced-usage.html#ssl-warnings
2026-08-19 12:42:45,435 INFO (7a1971be-9bcb-11f1-9a82-0a5819020f9e) Certificate was not configured
2026-08-19 12:42:45,438 DEBUG (7a1971be-9bcb-11f1-9a82-0a5819020f9e) How long to wait for the server to connect and send data before giving up: connection timeout: 30 seconds, request timeout 30 seconds
2026-08-19 12:42:45,438 WARNING (7a1971be-9bcb-11f1-9a82-0a5819020f9e) verify_ca=false is insecure, it instructs the caller to not verify the certificate authority when making API calls.
2026-08-19 12:42:45,526 INFO (7a1971be-9bcb-11f1-9a82-0a5819020f9e) Calling sign_app_in endpoint: https://sicsn.caixa/BeyondTrust/api/public/v3
2026-08-19 12:42:45,646 DEBUG (7a1971be-9bcb-11f1-9a82-0a5819020f9e) Running get_secret method in SecretsSafe class
2026-08-19 12:42:45,646 INFO (7a1971be-9bcb-11f1-9a82-0a5819020f9e) **************** secret path: SIPNC_DES/CLISERPNC_SSO_INTER *****************
2026-08-19 12:42:45,651 DEBUG (7a1971be-9bcb-11f1-9a82-0a5819020f9e) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SIPNC_DES&separator=%2F&version=3.1&title=CLISERPNC_SSO_INTER
2026-08-19 12:42:45,652 DEBUG (7a1971be-9bcb-11f1-9a82-0a5819020f9e) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SIPNC_DES&separator=%2F&version=3.1&title=CLISERPNC_SSO_INTER
2026-08-19 12:42:45,812 DEBUG (7a1971be-9bcb-11f1-9a82-0a5819020f9e) Secret type: Text
2026-08-19 12:42:45,812 INFO (7a1971be-9bcb-11f1-9a82-0a5819020f9e) Secret was successfully retrieved
2026-08-19 12:42:45,812 DEBUG (7a1971be-9bcb-11f1-9a82-0a5819020f9e) Running get_secret method in SecretsSafe class
2026-08-19 12:42:45,812 INFO (7a1971be-9bcb-11f1-9a82-0a5819020f9e) **************** secret path: SIPNC_DES/CLISERPNC_SSO_INTER2 *****************
2026-08-19 12:42:45,813 DEBUG (7a1971be-9bcb-11f1-9a82-0a5819020f9e) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SIPNC_DES&separator=%2F&version=3.1&title=CLISERPNC_SSO_INTER2
2026-08-19 12:42:45,813 DEBUG (7a1971be-9bcb-11f1-9a82-0a5819020f9e) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SIPNC_DES&separator=%2F&version=3.1&title=CLISERPNC_SSO_INTER2
2026-08-19 12:42:45,952 DEBUG (7a1971be-9bcb-11f1-9a82-0a5819020f9e) Secret type: Text
2026-08-19 12:42:45,952 INFO (7a1971be-9bcb-11f1-9a82-0a5819020f9e) Secret was successfully retrieved
2026-08-19 12:42:45,952 DEBUG (7a1971be-9bcb-11f1-9a82-0a5819020f9e) Running get_secret method in SecretsSafe class
2026-08-19 12:42:45,952 INFO (7a1971be-9bcb-11f1-9a82-0a5819020f9e) **************** secret path: SIPNC_DES/CLISERPNC_SSO_INTRA *****************
2026-08-19 12:42:45,953 DEBUG (7a1971be-9bcb-11f1-9a82-0a5819020f9e) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SIPNC_DES&separator=%2F&version=3.1&title=CLISERPNC_SSO_INTRA
2026-08-19 12:42:45,953 DEBUG (7a1971be-9bcb-11f1-9a82-0a5819020f9e) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SIPNC_DES&separator=%2F&version=3.1&title=CLISERPNC_SSO_INTRA
2026-08-19 12:42:46,196 DEBUG (7a1971be-9bcb-11f1-9a82-0a5819020f9e) Secret type: Text
2026-08-19 12:42:46,196 INFO (7a1971be-9bcb-11f1-9a82-0a5819020f9e) Secret was successfully retrieved
2026-08-19 12:42:46,196 DEBUG (7a1971be-9bcb-11f1-9a82-0a5819020f9e) Running get_secret method in SecretsSafe class
2026-08-19 12:42:46,196 INFO (7a1971be-9bcb-11f1-9a82-0a5819020f9e) **************** secret path: SIPNC_DES/CLISERPNC_SSO_LOGINX *****************
2026-08-19 12:42:46,196 DEBUG (7a1971be-9bcb-11f1-9a82-0a5819020f9e) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SIPNC_DES&separator=%2F&version=3.1&title=CLISERPNC_SSO_LOGINX
2026-08-19 12:42:46,197 DEBUG (7a1971be-9bcb-11f1-9a82-0a5819020f9e) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SIPNC_DES&separator=%2F&version=3.1&title=CLISERPNC_SSO_LOGINX
2026-08-19 12:42:46,398 DEBUG (7a1971be-9bcb-11f1-9a82-0a5819020f9e) Secret type: Text
2026-08-19 12:42:46,398 INFO (7a1971be-9bcb-11f1-9a82-0a5819020f9e) Secret was successfully retrieved
2026-08-19 12:42:46,398 DEBUG (7a1971be-9bcb-11f1-9a82-0a5819020f9e) Running get_secret method in SecretsSafe class
2026-08-19 12:42:46,398 INFO (7a1971be-9bcb-11f1-9a82-0a5819020f9e) **************** secret path: SIPNC_DES/SIPNC_BT_APIKEY *****************
2026-08-19 12:42:46,398 DEBUG (7a1971be-9bcb-11f1-9a82-0a5819020f9e) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SIPNC_DES&separator=%2F&version=3.1&title=SIPNC_BT_APIKEY
2026-08-19 12:42:46,399 DEBUG (7a1971be-9bcb-11f1-9a82-0a5819020f9e) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SIPNC_DES&separator=%2F&version=3.1&title=SIPNC_BT_APIKEY
2026-08-19 12:42:46,582 DEBUG (7a1971be-9bcb-11f1-9a82-0a5819020f9e) Secret type: Text
2026-08-19 12:42:46,582 INFO (7a1971be-9bcb-11f1-9a82-0a5819020f9e) Secret was successfully retrieved
2026-08-19 12:42:46,582 DEBUG (7a1971be-9bcb-11f1-9a82-0a5819020f9e) Running get_secret method in SecretsSafe class
2026-08-19 12:42:46,583 INFO (7a1971be-9bcb-11f1-9a82-0a5819020f9e) **************** secret path: SIPNC_DES/SPANSD01_ORACLE *****************
2026-08-19 12:42:46,583 DEBUG (7a1971be-9bcb-11f1-9a82-0a5819020f9e) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SIPNC_DES&separator=%2F&version=3.1&title=SPANSD01_ORACLE
2026-08-19 12:42:46,583 DEBUG (7a1971be-9bcb-11f1-9a82-0a5819020f9e) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SIPNC_DES&separator=%2F&version=3.1&title=SPANSD01_ORACLE
2026-08-19 12:42:46,760 DEBUG (7a1971be-9bcb-11f1-9a82-0a5819020f9e) Secret type: Text
2026-08-19 12:42:46,760 INFO (7a1971be-9bcb-11f1-9a82-0a5819020f9e) Secret was successfully retrieved
2026-08-19 12:42:46,760 INFO (7a1971be-9bcb-11f1-9a82-0a5819020f9e) Secrets folder Path /usr/src/app/secrets_files
2026-08-19 12:42:46,760 INFO (7a1971be-9bcb-11f1-9a82-0a5819020f9e) Creating files with the secrets as content, number of files 12
2026-08-19 12:42:46,761 INFO (7a1971be-9bcb-11f1-9a82-0a5819020f9e) File saved succesfully: /usr/src/app/secrets_files/SIPNC_DES/CLISERPNC_SSO_INTER_Metadata
2026-08-19 12:42:46,761 INFO (7a1971be-9bcb-11f1-9a82-0a5819020f9e) File saved succesfully: /usr/src/app/secrets_files/SIPNC_DES/CLISERPNC_SSO_INTER
2026-08-19 12:42:46,761 INFO (7a1971be-9bcb-11f1-9a82-0a5819020f9e) File saved succesfully: /usr/src/app/secrets_files/SIPNC_DES/CLISERPNC_SSO_INTER2_Metadata
2026-08-19 12:42:46,761 INFO (7a1971be-9bcb-11f1-9a82-0a5819020f9e) File saved succesfully: /usr/src/app/secrets_files/SIPNC_DES/CLISERPNC_SSO_INTER2
2026-08-19 12:42:46,761 INFO (7a1971be-9bcb-11f1-9a82-0a5819020f9e) File saved succesfully: /usr/src/app/secrets_files/SIPNC_DES/CLISERPNC_SSO_INTRA_Metadata
2026-08-19 12:42:46,761 INFO (7a1971be-9bcb-11f1-9a82-0a5819020f9e) File saved succesfully: /usr/src/app/secrets_files/SIPNC_DES/CLISERPNC_SSO_INTRA
2026-08-19 12:42:46,761 INFO (7a1971be-9bcb-11f1-9a82-0a5819020f9e) File saved succesfully: /usr/src/app/secrets_files/SIPNC_DES/CLISERPNC_SSO_LOGINX_Metadata
2026-08-19 12:42:46,761 INFO (7a1971be-9bcb-11f1-9a82-0a5819020f9e) File saved succesfully: /usr/src/app/secrets_files/SIPNC_DES/CLISERPNC_SSO_LOGINX
2026-08-19 12:42:46,761 INFO (7a1971be-9bcb-11f1-9a82-0a5819020f9e) File saved succesfully: /usr/src/app/secrets_files/SIPNC_DES/SIPNC_BT_APIKEY_Metadata
2026-08-19 12:42:46,761 INFO (7a1971be-9bcb-11f1-9a82-0a5819020f9e) File saved succesfully: /usr/src/app/secrets_files/SIPNC_DES/SIPNC_BT_APIKEY
2026-08-19 12:42:46,761 INFO (7a1971be-9bcb-11f1-9a82-0a5819020f9e) File saved succesfully: /usr/src/app/secrets_files/SIPNC_DES/SPANSD01_ORACLE_Metadata
2026-08-19 12:42:46,761 INFO (7a1971be-9bcb-11f1-9a82-0a5819020f9e) File saved succesfully: /usr/src/app/secrets_files/SIPNC_DES/SPANSD01_ORACLE
2026-08-19 12:42:46,761 DEBUG (7a1971be-9bcb-11f1-9a82-0a5819020f9e) Calling sign_app_out endpoint: https://sicsn.caixa/BeyondTrust/api/public/v3/Auth/Signout
2026-08-19 12:42:46,783 INFO (7a1971be-9bcb-11f1-9a82-0a5819020f9e) {
    "execution_id": "7a1971be-9bcb-11f1-9a82-0a5819020f9e",
    "input": {
        "secret_list": [
            "SIPNC_DES/CLISERPNC_SSO_INTER",
            "SIPNC_DES/CLISERPNC_SSO_INTER2",
            "SIPNC_DES/CLISERPNC_SSO_INTRA",
            "SIPNC_DES/CLISERPNC_SSO_LOGINX",
            "SIPNC_DES/SIPNC_BT_APIKEY",
            "SIPNC_DES/SPANSD01_ORACLE"
        ],
        "folder_list": [],
        "managed_account_list": [],
        "secret_safe_url": "https://sicsn.caixa/BeyondTrust/api/public/v3",
        "user": {
            "UserId": 1941,
            "SID": null,
            "EmailAddress": null,
            "UserName": "SPNCDB01",
            "Name": "SPNCDB01"
        }
    },
    "output": {
        "secrets": [
            {
                "path": "SIPNC_DES/CLISERPNC_SSO_INTER_Metadata",
                "content": "{\"Username\": null, \"Group\": null, \"FileName\": null, \"FileHash\": null, \"Text\": null, \"SecretType\": \"Text\", \"Id\": \"70ab8bbb-62b1-4672-dbdb-08deed6d0c16\", \"Title\": \"CLISERPNC_SSO_INTER\", \"Description\": \"\", \"OwnerId\": null, \"GroupId\": null, \"FolderId\": \"e8374832-d42a-4226-d0d9-08deed729c63\", \"CreatedOn\": \"2026-07-29T13:29:44.6033333Z\", \"CreatedBy\": \"Pedro Souza\", \"ModifiedOn\": \"2026-07-29T17:45:22.7052424Z\", \"ModifiedBy\": \"Pedro Souza\", \"Owner\": null, \"Folder\": \"SIPNC_DES\", \"FolderPath\": \"SIPNC_DES\", \"Owners\": [{\"OwnerId\": null, \"GroupId\": null, \"UserId\": 1941, \"Owner\": null, \"Name\": \"SPNCDB01\", \"Email\": null}], \"OwnerType\": null, \"Notes\": \"\", \"Urls\": []}"
            },
            {
                "path": "SIPNC_DES/CLISERPNC_SSO_INTER",
                "content": "***************"
            },
            {
                "path": "SIPNC_DES/CLISERPNC_SSO_INTER2_Metadata",
                "content": "{\"Username\": null, \"Group\": null, \"FileName\": null, \"FileHash\": null, \"Text\": null, \"SecretType\": \"Text\", \"Id\": \"061e2a86-8724-435f-dbdd-08deed6d0c16\", \"Title\": \"CLISERPNC_SSO_INTER2\", \"Description\": \"\", \"OwnerId\": null, \"GroupId\": null, \"FolderId\": \"e8374832-d42a-4226-d0d9-08deed729c63\", \"CreatedOn\": \"2026-07-29T13:43:55.3466667Z\", \"CreatedBy\": \"Pedro Souza\", \"ModifiedOn\": \"2026-07-29T17:45:33.5045932Z\", \"ModifiedBy\": \"Pedro Souza\", \"Owner\": null, \"Folder\": \"SIPNC_DES\", \"FolderPath\": \"SIPNC_DES\", \"Owners\": [{\"OwnerId\": null, \"GroupId\": null, \"UserId\": 1941, \"Owner\": null, \"Name\": \"SPNCDB01\", \"Email\": null}], \"OwnerType\": null, \"Notes\": \"\", \"Urls\": []}"
            },
            {
                "path": "SIPNC_DES/CLISERPNC_SSO_INTER2",
                "content": "***************"
            },
            {
                "path": "SIPNC_DES/CLISERPNC_SSO_INTRA_Metadata",
                "content": "{\"Username\": null, \"Group\": null, \"FileName\": null, \"FileHash\": null, \"Text\": null, \"SecretType\": \"Text\", \"Id\": \"ddd1e23c-d8ca-4839-dbdc-08deed6d0c16\", \"Title\": \"CLISERPNC_SSO_INTRA\", \"Description\": \"\", \"OwnerId\": null, \"GroupId\": null, \"FolderId\": \"e8374832-d42a-4226-d0d9-08deed729c63\", \"CreatedOn\": \"2026-07-29T13:30:38.9733333Z\", \"CreatedBy\": \"Pedro Souza\", \"ModifiedOn\": \"2026-07-29T17:45:44.5757373Z\", \"ModifiedBy\": \"Pedro Souza\", \"Owner\": null, \"Folder\": \"SIPNC_DES\", \"FolderPath\": \"SIPNC_DES\", \"Owners\": [{\"OwnerId\": null, \"GroupId\": null, \"UserId\": 1941, \"Owner\": null, \"Name\": \"SPNCDB01\", \"Email\": null}], \"OwnerType\": null, \"Notes\": \"\", \"Urls\": []}"
            },
            {
                "path": "SIPNC_DES/CLISERPNC_SSO_INTRA",
                "content": "***************"
            },
            {
                "path": "SIPNC_DES/CLISERPNC_SSO_LOGINX_Metadata",
                "content": "{\"Username\": null, \"Group\": null, \"FileName\": null, \"FileHash\": null, \"Text\": null, \"SecretType\": \"Text\", \"Id\": \"272a2cc1-17f0-4728-dbe2-08deed6d0c16\", \"Title\": \"CLISERPNC_SSO_LOGINX\", \"Description\": \"\", \"OwnerId\": null, \"GroupId\": null, \"FolderId\": \"e8374832-d42a-4226-d0d9-08deed729c63\", \"CreatedOn\": \"2026-07-29T17:45:09.56Z\", \"CreatedBy\": \"Pedro Souza\", \"ModifiedOn\": \"2026-07-29T17:45:54.9053087Z\", \"ModifiedBy\": \"Pedro Souza\", \"Owner\": null, \"Folder\": \"SIPNC_DES\", \"FolderPath\": \"SIPNC_DES\", \"Owners\": [{\"OwnerId\": null, \"GroupId\": null, \"UserId\": 1941, \"Owner\": null, \"Name\": \"SPNCDB01\", \"Email\": null}], \"OwnerType\": null, \"Notes\": \"\", \"Urls\": []}"
            },
            {
                "path": "SIPNC_DES/CLISERPNC_SSO_LOGINX",
                "content": "***************"
            },
            {
                "path": "SIPNC_DES/SIPNC_BT_APIKEY_Metadata",
                "content": "{\"Username\": null, \"Group\": null, \"FileName\": null, \"FileHash\": null, \"Text\": null, \"SecretType\": \"Text\", \"Id\": \"78e20570-53a1-4207-dbda-08deed6d0c16\", \"Title\": \"SIPNC_BT_APIKEY\", \"Description\": \"\", \"OwnerId\": null, \"GroupId\": null, \"FolderId\": \"e8374832-d42a-4226-d0d9-08deed729c63\", \"CreatedOn\": \"2026-07-29T13:28:38.27Z\", \"CreatedBy\": \"Pedro Souza\", \"ModifiedOn\": \"2026-07-29T17:46:10.765426Z\", \"ModifiedBy\": \"Pedro Souza\", \"Owner\": null, \"Folder\": \"SIPNC_DES\", \"FolderPath\": \"SIPNC_DES\", \"Owners\": [{\"OwnerId\": null, \"GroupId\": null, \"UserId\": 1941, \"Owner\": null, \"Name\": \"SPNCDB01\", \"Email\": null}], \"OwnerType\": null, \"Notes\": \"\", \"Urls\": []}"
            },
            {
                "path": "SIPNC_DES/SIPNC_BT_APIKEY",
                "content": "***************"
            },
            {
                "path": "SIPNC_DES/SPANSD01_ORACLE_Metadata",
                "content": "{\"Username\": null, \"Group\": null, \"FileName\": null, \"FileHash\": null, \"Text\": null, \"SecretType\": \"Text\", \"Id\": \"60a4068d-f574-4225-dbde-08deed6d0c16\", \"Title\": \"SPANSD01_ORACLE\", \"Description\": \"\", \"OwnerId\": null, \"GroupId\": null, \"FolderId\": \"e8374832-d42a-4226-d0d9-08deed729c63\", \"CreatedOn\": \"2026-07-29T14:15:15.74Z\", \"CreatedBy\": \"Pedro Souza\", \"ModifiedOn\": \"2026-07-29T17:46:22.2983516Z\", \"ModifiedBy\": \"Pedro Souza\", \"Owner\": null, \"Folder\": \"SIPNC_DES\", \"FolderPath\": \"SIPNC_DES\", \"Owners\": [{\"OwnerId\": null, \"GroupId\": null, \"UserId\": 1941, \"Owner\": null, \"Name\": \"SPNCDB01\", \"Email\": null}], \"OwnerType\": null, \"Notes\": \"\", \"Urls\": []}"
            },
            {
                "path": "SIPNC_DES/SPANSD01_ORACLE",
                "content": "***************"
            }
        ],
        "messages": [
            {
                "message": "Creating files with the secrets as content, number of files 12",
                "type": "INFO"
            }
        ],
        "errors": []
    }
}
2026-08-19 12:42:46,783 INFO (7a1971be-9bcb-11f1-9a82-0a5819020f9e) Ending Execution...7a1971be-9bcb-11f1-9a82-0a5819020f9e



me ajdua a avaliar esse erro depois montar uma responsta formal com todos hitorico

