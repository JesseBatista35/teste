a configuraçao da pilinete estava errada. usando quartco colcoamo a imgem para spring bott execultamos a build ela passou,,  

porem ao rodar a relse tem esse erro agora no pod

Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
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

SIPNC

SIPNC-gestaousuario-backend

Tasks

Variables

Triggers

Options

History
Predefined variables
ImageBuild_OKD
spring-boot
nome_imagem
spring-boot
SITE
okd4_nprd

system.collectionId
7b4c9d5c-b041-4798-8dcb-fb11786a173b
system.definitionId
5294
system.teamProject
Caixa
tag_imagem
8.2
TemplateVersaoProduto_OKD
8.2
version.app

Showing 14 filtered items.

Get started and run this pipeline for the first time!

exec java -Dserver.address=0.0.0.0 -Dserver.port=8080 -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -Xms512m -Xmx512m -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=sipnc-gestaousuario-backend -Delastic.apm.environment=des -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=sipnc-gestaousuario-backend -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/SIPNC-gestaousuario-backend.jar
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: sun.reflect.Reflection.getCallerClass is not supported. This will impact performance.
Exception in thread "main" java.lang.UnsupportedClassVersionError: br/gov/caixa/sipnc/gestaousuario/RunApplication has been compiled by a more recent version of the Java Runtime (class file version 61.0), this version of the Java Runtime only recognizes class file versions up to 55.0
	at java.base/java.lang.ClassLoader.defineClass1(Native Method)
	at java.base/java.lang.ClassLoader.defineClass(ClassLoader.java:1017)
	at java.base/java.security.SecureClassLoader.defineClass(SecureClassLoader.java:174)
	at java.base/java.net.URLClassLoader.defineClass(URLClassLoader.java:555)
	at java.base/java.net.URLClassLoader$1.run(URLClassLoader.java:458)
	at java.base/java.net.URLClassLoader$1.run(URLClassLoader.java:452)
	at java.base/java.security.AccessController.doPrivileged(Native Method)
	at java.base/java.net.URLClassLoader.findClass(URLClassLoader.java:451)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:589)
	at org.springframework.boot.loader.LaunchedURLClassLoader.loadClass(LaunchedURLClassLoader.java:151)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:522)
	at java.base/java.lang.Class.forName0(Native Method)
	at java.base/java.lang.Class.forName(Class.java:398)
	at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:46)
	at org.springframework.boot.loader.Launcher.launch(Launcher.java:108)
	at org.springframework.boot.loader.Launcher.launch(Launcher.java:58)
	at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:65)
