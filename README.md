Prezados,

Informo que foi corrigido o erro do cria app, ajustando o projeto no OKD.

Após análise dos logs da aplicação SIAVL Gestão Modelo Nota, foi identificado que o pod não inicia devido a incompatibilidade entre a versão do Java utilizada na compilação do artefato e a versão disponível no ambiente de execução.

O artefato SIAVL-gestaomodelonota-backend.jar foi compilado em Java 21 (class file version 65.0), porém a imagem utilizada no ambiente reconhece apenas classes até a versão 61.0 (Java 17), ocasionando o erro "java.lang.UnsupportedClassVersionError" durante a inicialização da aplicação.
Para correção, recomenda-se adequar a imagem da aplicação para Java 21 ou recompilar o artefato utilizando Java 17, conforme padrão adotado pelo ambiente.

https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=548470&environmentId=2549007

At.te,


teve essa analise do leandor 

o erro é esse

2026-10-29T20:05:24.8589993Z ##[section]Starting: Logs da Aplicação
2026-10-29T20:05:24.8593412Z ==============================================================================
2026-10-29T20:05:24.8593502Z Task         : Bash
2026-10-29T20:05:24.8593542Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-29T20:05:24.8593602Z Version      : 3.227.0
2026-10-29T20:05:24.8593655Z Author       : Microsoft Corporation
2026-10-29T20:05:24.8593702Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-29T20:05:24.8593769Z ==============================================================================
2026-10-29T20:05:25.9522191Z Generating script.
2026-10-29T20:05:25.9533138Z ========================== Starting Command Output ===========================
2026-10-29T20:05:25.9540442Z [command]/bin/bash /opt/ads-agent/_work/_temp/568347b2-5f89-45de-9ff7-8d2445952476.sh
2026-10-29T20:05:25.9589450Z + shopt -s expand_aliases
2026-10-29T20:05:25.9589962Z + [[ -n okd4_nprd ]]
2026-10-29T20:05:25.9590252Z + [[ okd4_nprd =~ ocp ]]
2026-10-29T20:05:25.9591141Z + [[ -n okd4_nprd ]]
2026-10-29T20:05:25.9591254Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-10-29T20:05:25.9591415Z + app=siavl-gestaomodelonota-des
2026-10-29T20:05:25.9591524Z + oc version
2026-10-29T20:05:26.0380615Z Client Version: v4.2.0-alpha.0-1650-g31aa3e8
2026-10-29T20:05:26.0380859Z Kustomize Version: v4.5.7
2026-10-29T20:05:26.0381032Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-10-29T20:05:26.0381210Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-10-29T20:05:26.0409233Z ++ oc get pod -l name=siavl-gestaomodelonota-des -n siavl-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-10-29T20:05:26.0409529Z ++ tac
2026-10-29T20:05:26.0410180Z ++ grep -v '^$'
2026-10-29T20:05:26.0410364Z ++ head -n1
2026-10-29T20:05:26.1313673Z + last_pod=siavl-gestaomodelonota-des-1-g67tz
2026-10-29T20:05:26.1313930Z + echo 'Logs do POD: siavl-gestaomodelonota-des-1-g67tz'
2026-10-29T20:05:26.1314175Z + oc logs siavl-gestaomodelonota-des-1-g67tz -c siavl-gestaomodelonota-des -n siavl-des
2026-10-29T20:05:26.1314496Z Logs do POD: siavl-gestaomodelonota-des-1-g67tz
2026-10-29T20:05:26.2281752Z exec java -Dserver.address=0.0.0.0 -Dserver.port=8080 -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/SIAVL-gestaomodelonota-backend.jar
2026-10-29T20:05:26.2282156Z Exception in thread "main" java.lang.UnsupportedClassVersionError: br/gov/caixa/siavl/gestaomodelonota/RunApplication has been compiled by a more recent version of the Java Runtime (class file version 65.0), this version of the Java Runtime only recognizes class file versions up to 61.0
2026-10-29T20:05:26.2282553Z 	at java.base/java.lang.ClassLoader.defineClass1(Native Method)
2026-10-29T20:05:26.2282719Z 	at java.base/java.lang.ClassLoader.defineClass(ClassLoader.java:1012)
2026-10-29T20:05:26.2282902Z 	at java.base/java.security.SecureClassLoader.defineClass(SecureClassLoader.java:150)
2026-10-29T20:05:26.2283103Z 	at java.base/java.net.URLClassLoader.defineClass(URLClassLoader.java:524)
2026-10-29T20:05:26.2283279Z 	at java.base/java.net.URLClassLoader$1.run(URLClassLoader.java:427)
2026-10-29T20:05:26.2283447Z 	at java.base/java.net.URLClassLoader$1.run(URLClassLoader.java:421)
2026-10-29T20:05:26.2283604Z 	at java.base/java.security.AccessController.doPrivileged(AccessController.java:712)
2026-10-29T20:05:26.2283779Z 	at java.base/java.net.URLClassLoader.findClass(URLClassLoader.java:420)
2026-10-29T20:05:26.2283944Z 	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:587)
2026-10-29T20:05:26.2284135Z 	at org.springframework.boot.loader.net.protocol.jar.JarUrlClassLoader.loadClass(JarUrlClassLoader.java:107)
2026-10-29T20:05:26.2284446Z 	at org.springframework.boot.loader.launch.LaunchedClassLoader.loadClass(LaunchedClassLoader.java:91)
2026-10-29T20:05:26.2284796Z 	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:520)
2026-10-29T20:05:26.2285404Z 	at java.base/java.lang.Class.forName0(Native Method)
2026-10-29T20:05:26.2285550Z 	at java.base/java.lang.Class.forName(Class.java:467)
2026-10-29T20:05:26.2285698Z 	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:99)
2026-10-29T20:05:26.2286418Z 	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:64)
2026-10-29T20:05:26.2286666Z 	at org.springframework.boot.loader.launch.JarLauncher.main(JarLauncher.java:40)
2026-10-29T20:05:26.2360048Z ##[section]Finishing: Logs da Aplicação


Skip to main content
projetos
/
Caixa
/
Pipelines
Search









SIAVL

SIAVL-gestaomodelonota-backend

Tasks

Variables

Triggers

Options

History
Predefined variables
guardrail.sec
true
ImageBuild_OKD
quarkus-java-binary-s2i
nome_imagem
quarkus-java-binary-s2i
SITE
okd4_nprd

system.collectionId
7b4c9d5c-b041-4798-8dcb-fb11786a173b
system.definitionId
7131
system.teamProject
Caixa
tag_imagem
openjdk17
TemplateVersaoProduto_OKD
openjdk17
version.app

Showing 9 filtered items.

Get started and run this pipeline for the first time!

Starting: Run Code Analisis
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/87893ba3-a949-42c4-9e26-3b1d507c7a00.sh
15:46:14.159 INFO: Scanner configuration file: /opt/sonar-scanner/sonar-scanner-4.2.0.1873-linux/conf/sonar-scanner.properties
15:46:14.161 INFO: Project root configuration file: NONE
15:46:14.181 INFO: SonarQube Scanner 4.2.0.1873
15:46:14.181 INFO: Java 11.0.3 AdoptOpenJDK (64-bit)
15:46:14.181 INFO: Linux 5.18.5-100.fc35.x86_64 amd64
15:46:14.267 DEBUG: keyStore is : 
15:46:14.267 DEBUG: keyStore type is : pkcs12
15:46:14.267 DEBUG: keyStore provider is : 
15:46:14.267 DEBUG: init keystore
15:46:14.267 DEBUG: init keymanager of type SunX509
15:46:14.331 DEBUG: Create: /opt/ads-agent/cache-tools/.sonar/cache
15:46:14.332 INFO: User cache: /opt/ads-agent/cache-tools/.sonar/cache
15:46:14.332 DEBUG: Create: /opt/ads-agent/cache-tools/.sonar/cache/_tmp
15:46:14.333 DEBUG: Extract sonar-scanner-api-batch in temp...
15:46:14.335 DEBUG: Get bootstrap index...
15:46:14.335 DEBUG: Download: http://sonar.apps.produtos4.caixa/batch/index
15:46:14.379 DEBUG: Get bootstrap completed
15:46:14.382 DEBUG: Create isolated classloader...
15:46:14.388 DEBUG: Start temp cleaning...
15:46:14.391 DEBUG: Temp cleaning done
15:46:14.391 DEBUG: Execution getVersion
15:46:14.425 INFO: SonarQube server 9.9.2.77730
15:46:14.425 INFO: Default locale: "pt_BR", source code encoding: "UTF-8"
15:46:14.425 DEBUG: Work directory: /opt/ads-agent/_work/23/s/.scannerwork
15:46:14.426 DEBUG: Execution execute
15:46:14.871 DEBUG: Community 9.9.2.77730
15:46:15.074 INFO: Load global settings
15:46:15.208 DEBUG: GET 200 http://sonar.apps.produtos4.caixa/api/settings/values.protobuf | time=133ms
15:46:15.268 INFO: Load global settings (done) | time=194ms

ta certo a analise dele

?

Skip to main content
projetos
/
Caixa
/
Pipelines
Search









SIAVL

SIAVL-gestaomodelonota-backend

Tasks

Variables

Triggers

Options

History
BUILD_DEFAULT_SPRING
Task version
1.*
Display name
BUILD_DEFAULT_SPRING
AZPAT
$(AZPAT)
AZUSER
$(AZUSER)
DOTNET_VERSION
$(DOTNET_VERSION)
FORTIFY_API
$(FORTIFY_API)
FORTIFY_APITOKEN
$(FORTIFY_APITOKEN)
FORTIFY_BUILD
$(FORTIFY_BUILD)
FORTIFY_CI_TOKEN
$(FORTIFY_CI_TOKEN)
FORTIFY_CLIENT_AUTH_TOKEN
$(FORTIFY_CLIENT_AUTH_TOKEN)
fortify_disable
$(fortify_disable)
FORTIFY_FPR_NAME
$(FORTIFY_FPR_NAME)
FORTIFY_NEW_VERSION
$(FORTIFY_NEW_VERSION)
FORTIFY_PASS
$(FORTIFY_PASS)
FORTIFY_POOL_GOLD_NOVO
$(FORTIFY_POOL_GOLD_NOVO)
FORTIFY_POOL_SILVER_NOVO
$(FORTIFY_POOL_SILVER_NOVO)
FORTIFY_REGEX
$(FORTIFY_REGEX)
FORTIFY_SENSOR_POOL
$(FORTIFY_SENSOR_POOL)
FORTIFY_UPTOKEN
$(FORTIFY_UPTOKEN)
FORTIFY_URL
$(FORTIFY_URL)
FORTIFY_URL_CONTROLLER
$(FORTIFY_URL_CONTROLLER)
FORTIFY_USER
$(FORTIFY_USER)
FORTIFY_VERSION_BUILD
$(FORTIFY_VERSION_BUILD)
FRAMEWORK
$(FRAMEWORK)
FTFY_MVN_GOAL
$(FTFY_MVN_GOAL)
GradleVersion
$(GradleVersion)
JAVA_VERSION
open-jdk-21.0.5
KEYSTORE_SECUREFILEPATH
$(KEYSTORE_SECUREFILEPATH)
LENG
$(LENG)
lista_versao
$(lista_versao)
MAVEN_VERSION
3.8.5
MVN_GOAL
clean package -U
nexus_interno_pass
$(nexus_interno_pass)
nexus_interno_user
$(nexus_interno_user)
NEXUS_REPOSITORY_ID
$(NEXUS_REPOSITORY_ID)
NEXUS_URL_MAVEN_RELEASE
$(NEXUS_URL_MAVEN_RELEASE)
NEXUS_URL_MAVEN_SNAPSHOT
$(NEXUS_URL_MAVEN_SNAPSHOT)
NEXUS_URL_SNAPSHOT_ALIAS
SNAPSHOT
NODE_EXTRA_CA_CERTS
$(NODE_EXTRA_CA_CERTS)
p_language
$(p_language)
POM_PATH
pom.xml
POM_VERSION
$(POM_VERSION)
project.group
$(project.group)
project.name
$(project.name)
project.version
$(project.version)
REPO_FINAL_NAME
$(REPO_FINAL_NAME)
REPOSITORIO
$(REPOSITORIO)
SCANCENTRAL_URL
$(SCANCENTRAL_URL)
SONAR_LOGIN
$(SONAR_LOGIN)
SONAR_PASSWORD
$(SONAR_PASSWORD)
SONAR_PROPERTIES
$(SONAR_PROPERTIES)
SONAR_URL
$(SONAR_URL)
tbuild
$(tbuild)
token
$(token)
token_id
$(token_id)
valida.vec
$(valida.vec)
VER_TECNOLOGIA
$(VER_TECNOLOGIA)
VERSION_PADRAO
$(VERSION_PADRAO)
version.app
$(version.app)
versionApp
$(versionApp)
Control Options
Output Variables
Showing 9 filtered items.

Get started and run this pipeline for the first time!

Row 2. Clickable

Showing 9 filtered items.

Get started and run this pipeline for the first time!

Row 2. Clickable

Row 2. Clickable

Showing 9 filtered items.

Get started and run this pipeline for the first time!



eu ach oque é so trocar a tag_imagem para 212 cert?
