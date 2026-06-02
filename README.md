estou com essa demanda aqui. 



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
SIFUG-siofg-api
/
SIFUG-siofg-api-20260602.0324-1.0.0.1-SNAPSHOT(1)
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
SIFUG-siofg-api

SIFUG-siofg-api-20260602.0324-1.0.0.1-SNAPSHOT(1)


EC DES

Failed


Pipeline

Tasks

Variables

Logs

Tests
Agent job
Started: 02/06/2026, 03:26:32
Pool:
Release-Linux-OKD4
·
Agent: azp-ads-agent-release-5cd876f98-rjttk

6m 47s

Initialize job
·
succeeded
<1s

Pre-job: Download secure file
·
succeeded
<1s

Download Artifacts
·
succeeded
1 warning
<1s

Exportando as variáveis do arquivo Trust Store
·
succeeded
<1s

Recuperando nome do repositório
·
succeeded
1s

Convertendo Minúsculo e Definindo nome do Projeto/Repositório
·
succeeded
<1s

Git clone https://devops.caixa/projetos/Infraestrutura/_git/esteira-logs
·
succeeded
<1s

Cria Streams Graylog
·
succeeded
1s

Recupera VEC
·
succeeded
1s

VEC - Aferição
·
succeeded
1 warning
<1s

Login OpenShift
·
succeeded
<1s

Exportando Variáveis de Ambiente "_ENV."
·
succeeded
<1s

Criando novo Projeto
·
succeeded
<1s

Adicionando ISTIO_INJECTION
·
skipped


Criando nova APP
·
succeeded
<1s

Atualizando Variáveis de Ambiente
·
succeeded
4s

Criando Rota Customizada
·
succeeded
<1s

Aplicando Service Mesh
·
skipped


Git clone https://devops.caixa/projetos/Infraestrutura/_git/esteira-beyondtrust-check
·
succeeded
<1s

Create BT Secret
·
succeeded
<1s

Create BT Shared Volume
·
succeeded
<1s

Create BT Sidecar
·
succeeded
<1s

Create Secret Check Script
·
succeeded
<1s

Create Secret Check
·
succeeded
<1s

Create BT App Mount Volume
·
succeeded
<1s

Exporta Variáveis de Ambiente "_SECRET."
·
succeeded
<1s

Alterando valores placeholder no exec_secret.sh
·
succeeded
<1s

Criando Secrets
·
succeeded
<1s

Vinculando Secrets
·
succeeded
<1s

Adicionando Multiplas Secrets
·
succeeded
<1s

Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP
·
succeeded
20s

Concedendo Acesso OKD
·
succeeded
<1s

Verificando IP de Saída
·
succeeded
<1s

Configurando IP de Saída
·
succeeded
<1s

Cadastrando no Portal IIF
·
succeeded
<1s

Verificando Status do Deployment
·
1 error

6m 7s
The task has timed out.

Logs da Aplicação
·
succeeded
<1s

Resumo da Release
·
skipped


Coletando dados da imagem
·
skipped


Atualizando versão no PortalIF
·
skipped


Realizando Logout OKD
·
succeeded
<1s

Finalize Job
·
succeeded
<1s
Expanded

Expanded

Collapsed

Collapsed

24 pipelines found

Select a release pipeline to view its releases

24 pipelines found

Select a release pipeline to view its releases

19 pipelines found

Select a release pipeline to view its releases

4 pipelines found

Row 3

Row 2

Expanded

Collapsed





Erro na hora de sbubir a release:





2026-06-02T06:27:11.8310876Z ##[section]Starting: Verificando Status do Deployment
2026-06-02T06:27:11.8315432Z ==============================================================================
2026-06-02T06:27:11.8315552Z Task         : Bash
2026-06-02T06:27:11.8315601Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-02T06:27:11.8315707Z Version      : 3.227.0
2026-06-02T06:27:11.8315757Z Author       : Microsoft Corporation
2026-06-02T06:27:11.8315815Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-02T06:27:11.8315925Z ==============================================================================
2026-06-02T06:27:11.9785671Z Generating script.
2026-06-02T06:27:11.9797717Z ========================== Starting Command Output ===========================
2026-06-02T06:27:11.9804881Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/8e0abc24-872a-428e-8b0d-30d38eac1ee9.sh
2026-06-02T06:27:12.0688451Z Waiting for rollout to finish: 0 out of 2 new replicas have been updated...
2026-06-02T06:27:13.7117098Z Waiting for rollout to finish: 0 out of 2 new replicas have been updated...
2026-06-02T06:27:13.7894851Z Waiting for rollout to finish: 1 out of 2 new replicas have been updated...
2026-06-02T06:33:19.3416259Z ##[error]The task has timed out.
2026-06-02T06:33:19.3417253Z ##[section]Finishing: Verificando Status do Deployment



no okd tem esses pod:





OKD


Jesse Mouta Pereira Batista

Administrator
Home
Overview
Projects
Search
API Explorer
Events
Operators
OperatorHub
Installed Operators
Workloads
Pods
Deployments
DeploymentConfigs
StatefulSets
Secrets
ConfigMaps
CronJobs
Jobs
DaemonSets
ReplicaSets
ReplicationControllers
HorizontalPodAutoscalers
PodDisruptionBudgets
Networking
Storage
Builds
Observe
Compute
User Management
Administration

Project: sifug-des
Pods

Filter

Name
siofg-api-des
/
Name
siofg-api-des

Name

Status

Ready

Restarts

Owner

Memory

CPU

Created
Pod
P
sifug-siofg-api-des-213-deploy
Completed
0/1	0	
ReplicationController
RC
sifug-siofg-api-des-213
-	-	
30 de abr. de 2026, 13:55

Pod
P
sifug-siofg-api-des-214-deploy
Completed
0/1	0	
ReplicationController
RC
sifug-siofg-api-des-214
-	-	
13 de mai. de 2026, 12:02

Pod
P
sifug-siofg-api-des-214-jlkmq
Running
1/1	0	
ReplicationController
RC
sifug-siofg-api-des-214
1.828,1 MiB	0,014 cores	
13 de mai. de 2026, 12:05

Pod
P
sifug-siofg-api-des-214-wcbk4
Running
1/1	0	
ReplicationController
RC
sifug-siofg-api-des-214
1.712,4 MiB	0,015 cores	
13 de mai. de 2026, 12:02

Pod
P
sifug-siofg-api-des-258-tl8hd-debug-9m2lt
Running
1/1	0	No owner	2,1 MiB	-	
29 de mai. de 2026, 18:29

Pod
P
sifug-siofg-api-des-271-6b9x6
0/1	4	
ReplicationController
RC
sifug-siofg-api-des-271
1,4 MiB	0,094 cores	
2 de jun. de 2026, 09:07

Pod
P
sifug-siofg-api-des-271-deploy
Running
1/1	0	
ReplicationController
RC
sifug-siofg-api-des-271
101,6 MiB	0,002 cores	
2 de jun. de 2026, 09:07

log do pod:

exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.3.1.jar -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br|*.applicationinsights.azure.com|*.livediagnostics.monitor.azure.com -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-06-02 09:08:34.092-03:00 WARN  c.m.a.a.i.c.ConfigurationBuilder - Unrecognized field "overrides" (class com.microsoft.applicationinsights.agent.internal.configuration.Configuration$Sampling), not marked as ignorable (one known property: "percentage"])
 at [Source: (String)"{"sampling":{"overrides":[{"telemetryType":"request","attributes":[{"key":"url.path","value":"^(\/q)?\/health\/.*","matchType":"regexp"}],"percentage":0}]}}"; line: 1, column: 27] (through reference chain: com.microsoft.applicationinsights.agent.internal.configuration.Configuration["sampling"]->com.microsoft.applicationinsights.agent.internal.configuration.Configuration$Sampling["overrides"])
2026-06-02 09:08:35.708-03:00 INFO  c.m.applicationinsights.agent - ApplicationInsights Java Agent 3.3.1 started successfully (PID 8)
2026-06-02 09:08:35.708-03:00 INFO  c.m.applicationinsights.agent - Java version: 11.0.11, vendor: Red Hat, Inc., home: /usr/lib/jvm/java-11-openjdk-11.0.11.0.9-2.el8_4.x86_64
Running main method
Exception in thread "main" java.lang.reflect.InvocationTargetException
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at io.quarkus.bootstrap.runner.QuarkusEntryPoint.doRun(QuarkusEntryPoint.java:48)
	at io.quarkus.bootstrap.runner.QuarkusEntryPoint.main(QuarkusEntryPoint.java:25)
Caused by: java.lang.ExceptionInInitializerError
	at io.quarkus.runner.ApplicationImpl.<clinit>(ApplicationImpl.zig:65)
	at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
	at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
	at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)
	at java.base/java.lang.Class.newInstance(Class.java:584)
	at io.quarkus.runtime.Quarkus.run(Quarkus.java:65)
	at io.quarkus.runtime.Quarkus.run(Quarkus.java:42)
	at io.quarkus.runtime.Quarkus.run(Quarkus.java:119)
	at br.gov.caixa.siofg.suporte.Main.main(Main.java:16)
	... 6 more
Caused by: java.lang.IllegalStateException: io.smallrye.config.ConfigValidationException: Configuration validation failed:
	java.util.NoSuchElementException: SRCFG00011: Could not expand value SIFUG_XMQD1 in property quarkus.siofg.ibm.mq.password
	at io.smallrye.config.SmallRyeConfigBuilder.build(SmallRyeConfigBuilder.java:406)
	at io.quarkus.runtime.generated.Config.<clinit>(Config.zig:486)
	... 16 more
Caused by: io.smallrye.config.ConfigValidationException: Configuration validation failed:
	java.util.NoSuchElementException: SRCFG00011: Could not expand value SIFUG_XMQD1 in property quarkus.siofg.ibm.mq.password
	at io.smallrye.config.ConfigMappingProvider.mapConfiguration(ConfigMappingProvider.java:838)
	at io.smallrye.config.ConfigMappingProvider.mapConfiguration(ConfigMappingProvider.java:794)
	at io.smallrye.config.SmallRyeConfigBuilder.build(SmallRyeConfigBuilder.java:403)
	... 17 more



================================================================================================



log do sicrets_side-car


2026-06-02 12:07:31,961 INFO Getting secrets just once, POLLING_WAIT_BETWEEN_REQUESTS_MINUTES was not configured
2026-06-02 12:07:31,961 INFO (a226881e-5e7b-11f1-9637-0a5819022935) APP VERSION: 2.1.0
2026-06-02 12:07:31,962 INFO (a226881e-5e7b-11f1-9637-0a5819022935) Starting Execution...a226881e-5e7b-11f1-9637-0a5819022935
2026-06-02 12:07:31,962 INFO (a226881e-5e7b-11f1-9637-0a5819022935) You are using: <,> as List delimiter
2026-06-02 12:07:31,962 WARNING (a226881e-5e7b-11f1-9637-0a5819022935) InsecureRequestWarning: Unverified HTTPS request is being made to host https://sicsn.caixa/BeyondTrust/api/public/v3'. Adding certificate verification isstrongly advised. See: https://urllib3.readthedocs.io/en/1.26.x/advanced-usage.html#ssl-warnings
2026-06-02 12:07:31,962 INFO (a226881e-5e7b-11f1-9637-0a5819022935) Certificate was not configured
2026-06-02 12:07:31,965 DEBUG (a226881e-5e7b-11f1-9637-0a5819022935) How long to wait for the server to connect and send data before giving up: connection timeout: 30 seconds, request timeout 30 seconds
2026-06-02 12:07:31,965 WARNING (a226881e-5e7b-11f1-9637-0a5819022935) verify_ca=false is insecure, it instructs the caller to not verify the certificate authority when making API calls.
2026-06-02 12:07:32,038 INFO (a226881e-5e7b-11f1-9637-0a5819022935) Calling sign_app_in endpoint: https://sicsn.caixa/BeyondTrust/api/public/v3
2026-06-02 12:07:32,096 DEBUG (a226881e-5e7b-11f1-9637-0a5819022935) Running get_secret method in SecretsSafe class
2026-06-02 12:07:32,096 INFO (a226881e-5e7b-11f1-9637-0a5819022935) **************** secret path: SIOFG_DES/SIFUG_DATASOURCE_02 *****************
2026-06-02 12:07:32,101 DEBUG (a226881e-5e7b-11f1-9637-0a5819022935) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SIOFG_DES&separator=%2F&version=3.1&title=SIFUG_DATASOURCE_02
2026-06-02 12:07:32,102 DEBUG (a226881e-5e7b-11f1-9637-0a5819022935) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SIOFG_DES&separator=%2F&version=3.1&title=SIFUG_DATASOURCE_02
2026-06-02 12:07:32,212 DEBUG (a226881e-5e7b-11f1-9637-0a5819022935) Secret type: Text
2026-06-02 12:07:32,212 INFO (a226881e-5e7b-11f1-9637-0a5819022935) Secret was successfully retrieved
2026-06-02 12:07:32,212 DEBUG (a226881e-5e7b-11f1-9637-0a5819022935) Running get_secret method in SecretsSafe class
2026-06-02 12:07:32,212 INFO (a226881e-5e7b-11f1-9637-0a5819022935) **************** secret path: SIOFG_DES/SIFUG_DATASOURCE_15 *****************
2026-06-02 12:07:32,213 DEBUG (a226881e-5e7b-11f1-9637-0a5819022935) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SIOFG_DES&separator=%2F&version=3.1&title=SIFUG_DATASOURCE_15
2026-06-02 12:07:32,213 DEBUG (a226881e-5e7b-11f1-9637-0a5819022935) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SIOFG_DES&separator=%2F&version=3.1&title=SIFUG_DATASOURCE_15
2026-06-02 12:07:32,301 DEBUG (a226881e-5e7b-11f1-9637-0a5819022935) Secret type: Text
2026-06-02 12:07:32,301 INFO (a226881e-5e7b-11f1-9637-0a5819022935) Secret was successfully retrieved
2026-06-02 12:07:32,301 DEBUG (a226881e-5e7b-11f1-9637-0a5819022935) Running get_secret method in SecretsSafe class
2026-06-02 12:07:32,302 INFO (a226881e-5e7b-11f1-9637-0a5819022935) **************** secret path: SIOFG_DES/SIFUG_XMQD1 *****************
2026-06-02 12:07:32,302 DEBUG (a226881e-5e7b-11f1-9637-0a5819022935) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SIOFG_DES&separator=%2F&version=3.1&title=SIFUG_XMQD1
2026-06-02 12:07:32,302 DEBUG (a226881e-5e7b-11f1-9637-0a5819022935) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SIOFG_DES&separator=%2F&version=3.1&title=SIFUG_XMQD1
2026-06-02 12:07:32,390 DEBUG (a226881e-5e7b-11f1-9637-0a5819022935) Secret type: Text
2026-06-02 12:07:32,390 INFO (a226881e-5e7b-11f1-9637-0a5819022935) Secret was successfully retrieved
2026-06-02 12:07:32,390 DEBUG (a226881e-5e7b-11f1-9637-0a5819022935) Running get_secret method in SecretsSafe class
2026-06-02 12:07:32,390 INFO (a226881e-5e7b-11f1-9637-0a5819022935) **************** secret path: SIOFG_DES/SIFUG_BT_APIKEY *****************
2026-06-02 12:07:32,391 DEBUG (a226881e-5e7b-11f1-9637-0a5819022935) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SIOFG_DES&separator=%2F&version=3.1&title=SIFUG_BT_APIKEY
2026-06-02 12:07:32,391 DEBUG (a226881e-5e7b-11f1-9637-0a5819022935) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SIOFG_DES&separator=%2F&version=3.1&title=SIFUG_BT_APIKEY
2026-06-02 12:07:32,473 DEBUG (a226881e-5e7b-11f1-9637-0a5819022935) Secret type: Text
2026-06-02 12:07:32,473 INFO (a226881e-5e7b-11f1-9637-0a5819022935) Secret was successfully retrieved
2026-06-02 12:07:32,473 DEBUG (a226881e-5e7b-11f1-9637-0a5819022935) Running get_secret method in SecretsSafe class
2026-06-02 12:07:32,473 INFO (a226881e-5e7b-11f1-9637-0a5819022935) **************** secret path: SIOFG_DES/CLISERFUG_SSO_INTER *****************
2026-06-02 12:07:32,474 DEBUG (a226881e-5e7b-11f1-9637-0a5819022935) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SIOFG_DES&separator=%2F&version=3.1&title=CLISERFUG_SSO_INTER
2026-06-02 12:07:32,474 DEBUG (a226881e-5e7b-11f1-9637-0a5819022935) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SIOFG_DES&separator=%2F&version=3.1&title=CLISERFUG_SSO_INTER
2026-06-02 12:07:32,559 DEBUG (a226881e-5e7b-11f1-9637-0a5819022935) Secret type: Text
2026-06-02 12:07:32,560 INFO (a226881e-5e7b-11f1-9637-0a5819022935) Secret was successfully retrieved
2026-06-02 12:07:32,560 INFO (a226881e-5e7b-11f1-9637-0a5819022935) Secrets folder Path /usr/src/app/secrets_files
2026-06-02 12:07:32,560 INFO (a226881e-5e7b-11f1-9637-0a5819022935) Creating files with the secrets as content, number of files 10
2026-06-02 12:07:32,560 INFO (a226881e-5e7b-11f1-9637-0a5819022935) File saved succesfully: /usr/src/app/secrets_files/SIOFG_DES/SIFUG_DATASOURCE_02_Metadata
2026-06-02 12:07:32,560 INFO (a226881e-5e7b-11f1-9637-0a5819022935) File saved succesfully: /usr/src/app/secrets_files/SIOFG_DES/SIFUG_DATASOURCE_02
2026-06-02 12:07:32,560 INFO (a226881e-5e7b-11f1-9637-0a5819022935) File saved succesfully: /usr/src/app/secrets_files/SIOFG_DES/SIFUG_DATASOURCE_15_Metadata
2026-06-02 12:07:32,560 INFO (a226881e-5e7b-11f1-9637-0a5819022935) File saved succesfully: /usr/src/app/secrets_files/SIOFG_DES/SIFUG_DATASOURCE_15
2026-06-02 12:07:32,560 INFO (a226881e-5e7b-11f1-9637-0a5819022935) File saved succesfully: /usr/src/app/secrets_files/SIOFG_DES/SIFUG_XMQD1_Metadata
2026-06-02 12:07:32,560 INFO (a226881e-5e7b-11f1-9637-0a5819022935) File saved succesfully: /usr/src/app/secrets_files/SIOFG_DES/SIFUG_XMQD1
2026-06-02 12:07:32,560 INFO (a226881e-5e7b-11f1-9637-0a5819022935) File saved succesfully: /usr/src/app/secrets_files/SIOFG_DES/SIFUG_BT_APIKEY_Metadata
2026-06-02 12:07:32,560 INFO (a226881e-5e7b-11f1-9637-0a5819022935) File saved succesfully: /usr/src/app/secrets_files/SIOFG_DES/SIFUG_BT_APIKEY
2026-06-02 12:07:32,560 INFO (a226881e-5e7b-11f1-9637-0a5819022935) File saved succesfully: /usr/src/app/secrets_files/SIOFG_DES/CLISERFUG_SSO_INTER_Metadata
2026-06-02 12:07:32,561 INFO (a226881e-5e7b-11f1-9637-0a5819022935) File saved succesfully: /usr/src/app/secrets_files/SIOFG_DES/CLISERFUG_SSO_INTER
2026-06-02 12:07:32,561 DEBUG (a226881e-5e7b-11f1-9637-0a5819022935) Calling sign_app_out endpoint: https://sicsn.caixa/BeyondTrust/api/public/v3/Auth/Signout
2026-06-02 12:07:32,572 INFO (a226881e-5e7b-11f1-9637-0a5819022935) {
    "execution_id": "a226881e-5e7b-11f1-9637-0a5819022935",
    "input": {
        "secret_list": [
            "SIOFG_DES/SIFUG_DATASOURCE_02",
            "SIOFG_DES/SIFUG_DATASOURCE_15",
            "SIOFG_DES/SIFUG_XMQD1",
            "SIOFG_DES/SIFUG_BT_APIKEY",
            "SIOFG_DES/CLISERFUG_SSO_INTER"
        ],
        "folder_list": [],
        "managed_account_list": [],
        "secret_safe_url": "https://sicsn.caixa/BeyondTrust/api/public/v3",
        "user": {
            "UserId": 1612,
            "SID": null,
            "EmailAddress": null,
            "UserName": "clientid_SOFGD01",
            "Name": "clientid_SOFGD01"
        }
    },
    "output": {
        "secrets": [
            {
                "path": "SIOFG_DES/SIFUG_DATASOURCE_02_Metadata",
                "content": "{\"Username\": null, \"Group\": null, \"FileName\": null, \"FileHash\": null, \"Text\": null, \"SecretType\": \"Text\", \"Id\": \"b102b0c5-81b7-4ac2-fd5e-08deb1ca7e32\", \"Title\": \"SIFUG_DATASOURCE_02\", \"Description\": \"usu\\u00e1rio SFUGDR02 do RACF\", \"OwnerId\": null, \"GroupId\": null, \"FolderId\": \"033a310c-c67e-4068-121a-08deb1d51032\", \"CreatedOn\": \"2026-05-20T12:51:06.98Z\", \"CreatedBy\": \"Marco Silva\", \"ModifiedOn\": \"2026-05-20T12:55:39.4610229Z\", \"ModifiedBy\": \"Marco Silva\", \"Owner\": null, \"Folder\": \"SIOFG_DES\", \"FolderPath\": \"SIOFG_DES\", \"Owners\": [{\"OwnerId\": null, \"GroupId\": null, \"UserId\": 1612, \"Owner\": null, \"Name\": \"clientid_SOFGD01\", \"Email\": null}], \"OwnerType\": null, \"Notes\": \"\", \"Urls\": []}"
            },
            {
                "path": "SIOFG_DES/SIFUG_DATASOURCE_02",
                "content": "***************"
            },
            {
                "path": "SIOFG_DES/SIFUG_DATASOURCE_15_Metadata",
                "content": "{\"Username\": null, \"Group\": null, \"FileName\": null, \"FileHash\": null, \"Text\": null, \"SecretType\": \"Text\", \"Id\": \"87b9ffc6-0df1-456d-fd5f-08deb1ca7e32\", \"Title\": \"SIFUG_DATASOURCE_15\", \"Description\": \"usu\\u00e1rio SFUGDR15 do RACF\", \"OwnerId\": null, \"GroupId\": null, \"FolderId\": \"033a310c-c67e-4068-121a-08deb1d51032\", \"CreatedOn\": \"2026-05-20T12:51:50.59Z\", \"CreatedBy\": \"Marco Silva\", \"ModifiedOn\": \"2026-05-20T12:55:56.5482983Z\", \"ModifiedBy\": \"Marco Silva\", \"Owner\": null, \"Folder\": \"SIOFG_DES\", \"FolderPath\": \"SIOFG_DES\", \"Owners\": [{\"OwnerId\": null, \"GroupId\": null, \"UserId\": 1612, \"Owner\": null, \"Name\": \"clientid_SOFGD01\", \"Email\": null}], \"OwnerType\": null, \"Notes\": \"\", \"Urls\": []}"
            },
            {
                "path": "SIOFG_DES/SIFUG_DATASOURCE_15",
                "content": "***************"
            },
            {
                "path": "SIOFG_DES/SIFUG_XMQD1_Metadata",
                "content": "{\"Username\": null, \"Group\": null, \"FileName\": null, \"FileHash\": null, \"Text\": null, \"SecretType\": \"Text\", \"Id\": \"9d37ce75-be5d-4bfc-fd60-08deb1ca7e32\", \"Title\": \"SIFUG_XMQD1\", \"Description\": \"usu\\u00e1rio SPFUGDB1 do MQ de Baixa Plataforma de BSB\", \"OwnerId\": null, \"GroupId\": null, \"FolderId\": \"033a310c-c67e-4068-121a-08deb1d51032\", \"CreatedOn\": \"2026-05-20T12:52:44.08Z\", \"CreatedBy\": \"Marco Silva\", \"ModifiedOn\": \"2026-05-20T12:56:11.5332482Z\", \"ModifiedBy\": \"Marco Silva\", \"Owner\": null, \"Folder\": \"SIOFG_DES\", \"FolderPath\": \"SIOFG_DES\", \"Owners\": [{\"OwnerId\": null, \"GroupId\": null, \"UserId\": 1612, \"Owner\": null, \"Name\": \"clientid_SOFGD01\", \"Email\": null}], \"OwnerType\": null, \"Notes\": \"\", \"Urls\": []}"
            },
            {
                "path": "SIOFG_DES/SIFUG_XMQD1",
                "content": "***************"
            },
            {
                "path": "SIOFG_DES/SIFUG_BT_APIKEY_Metadata",
                "content": "{\"Username\": null, \"Group\": null, \"FileName\": null, \"FileHash\": null, \"Text\": null, \"SecretType\": \"Text\", \"Id\": \"40909b7e-c134-451b-fd61-08deb1ca7e32\", \"Title\": \"SIFUG_BT_APIKEY\", \"Description\": \"APIKey do SIFUG\", \"OwnerId\": null, \"GroupId\": null, \"FolderId\": \"033a310c-c67e-4068-121a-08deb1d51032\", \"CreatedOn\": \"2026-05-20T12:53:29.83Z\", \"CreatedBy\": \"Marco Silva\", \"ModifiedOn\": \"2026-05-20T12:55:05.718298Z\", \"ModifiedBy\": \"Marco Silva\", \"Owner\": null, \"Folder\": \"SIOFG_DES\", \"FolderPath\": \"SIOFG_DES\", \"Owners\": [{\"OwnerId\": null, \"GroupId\": null, \"UserId\": 1612, \"Owner\": null, \"Name\": \"clientid_SOFGD01\", \"Email\": null}], \"OwnerType\": null, \"Notes\": \"\", \"Urls\": []}"
            },
            {
                "path": "SIOFG_DES/SIFUG_BT_APIKEY",
                "content": "***************"
            },
            {
                "path": "SIOFG_DES/CLISERFUG_SSO_INTER_Metadata",
                "content": "{\"Username\": null, \"Group\": null, \"FileName\": null, \"FileHash\": null, \"Text\": null, \"SecretType\": \"Text\", \"Id\": \"2d637ca2-8a74-4d01-fd62-08deb1ca7e32\", \"Title\": \"CLISERFUG_SSO_INTER\", \"Description\": \"cli-ser-fug (SSO desenvolvimento Internet)\", \"OwnerId\": null, \"GroupId\": null, \"FolderId\": \"033a310c-c67e-4068-121a-08deb1d51032\", \"CreatedOn\": \"2026-05-20T12:54:13.83Z\", \"CreatedBy\": \"Marco Silva\", \"ModifiedOn\": \"2026-05-20T12:54:43.371318Z\", \"ModifiedBy\": \"Marco Silva\", \"Owner\": null, \"Folder\": \"SIOFG_DES\", \"FolderPath\": \"SIOFG_DES\", \"Owners\": [{\"OwnerId\": null, \"GroupId\": null, \"UserId\": 1612, \"Owner\": null, \"Name\": \"clientid_SOFGD01\", \"Email\": null}], \"OwnerType\": null, \"Notes\": \"\", \"Urls\": []}"
            },
            {
                "path": "SIOFG_DES/CLISERFUG_SSO_INTER",
                "content": "***************"
            }
        ],
        "messages": [
            {
                "message": "Creating files with the secrets as content, number of files 10",
                "type": "INFO"
            }
        ],
        "errors": []
    }
}
2026-06-02 12:07:32,572 INFO (a226881e-5e7b-11f1-9637-0a5819022935) Ending Execution...a226881e-5e7b-11f1-9637-0a5819022935




uam coisa que acehi estranh é que ele diz que nao tem certificado carregao nao sei se isso é normal..


bom essa aplicação funcionava antes e começou a travas apos a configuração do beyundtrus. me ajuda a verificar e corrigir esse problema





