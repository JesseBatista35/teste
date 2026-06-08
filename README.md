O que você deseja?*:	Suporte ao ambiente de aplicação nas esteiras DevOps
Qual o nome do Sistema?*:	SIICO-unidades-legado
Qual o ambiente*:	DES
Selecione a sua Comunidade*:	ComunidadeClientes
Formas de contato*:	c159511
Descrição da necessidade*:	Solicito análise de erro no step SAST: Análise Java [Assíncrona] nas pipeline https://devops.caixa/projetos/Caixa/_build/results?buildId=739787&view=logs&j=275f1d19-1bd8-5591-b06b-07d489ea915a&t=86a571c0-da95-5be2-df37-cc1c8b2bccbe



Starting: SAST: Análise Java [Assíncrona]
==============================================================================
Task         : Fortify ScanCentral SAST Assessment
Description  : Installs ScanCentral client and performs a static analysis using ScanCentral
Version      : 7.5.0
Author       : Micro Focus
Help         : 
==============================================================================
ScanCentral Controller URL: http://sast.caixa/scancentral-ctrl
Caching tool: scancentral 24.4.0 x64
Prepending PATH environment variable with directory: /opt/ads-agent/_work/_tool/scancentral/24.4.0/x64/bin
Setting scancentral home
Skipping scan central home as it is self-hosted
Working Directory: /opt/ads-agent/_work/7581/s
/opt/ads-agent/_work/_tool/scancentral/24.4.0/x64/bin/scancentral -url http://sast.caixa/scancentral-ctrl start --upload-to-ssc --ssc-upload-token *** --application SIICO-unidades-legado --application-version 03.02.04 --build-tool mvn --build-command package -Dversion.app=03.02.04.004 -U -DskipTests=true --build-file /opt/ads-agent/_work/7581/s/siico/pom.xml --translation-args -Dcom.fortify.sca.NullPtrMaxFunctionTime=30000 --translation-args -Dcom.fortify.sca.exclude.unimported.node.modules=true --translation-args -Dcom.fortify.sca.EnableDOMModeling=true --translation-args -Dcom.fortify.sca.fileextensions.inc=PHP --translation-args -Dcom.fortify.sca.rules.password_regex.global=(?i)(s|_)?(user|usr|member|admin|guest|login|default|new|current|old|client|server|proxy|sqlserver|my|mysql|mongo|mongodb|db|database|ldap|smtp|email|email(_)?smtp)?(_|\.)?(pass(wd|word|phrase)|secret|senha) -exclude ./**/node_modules/**/* -exclude ./**/*.min.js -exclude ./**/dist/**/* --scan-args -build-label 03.02.04.004 --scan-args -build-version 03.02.04.004-03.02.04.004 -pool a4993bd3-4bb1-4460-810a-965981db9cae
launcher.log will be stored in "/home/sadscp01/.fortify/scancentral-24.4.0/log" directory.
Checking for updates...
No update available or auto update is disabled on the controller.
scancentral.log will be stored in "/home/sadscp01/.fortify/scancentral-24.4.0/log" directory.
Verifying controller URL...
The Controller at http://sast.caixa/scancentral-ctrl is UP
No email address detected. No status emails will be sent for this job.
Gathering project information...
Run packaging with MAVEN integration and /opt/ads-agent/_work/7581/s/siico/pom.xml build file.
[INFO] Scanning for projects...
[INFO] 
[INFO] ---------------< com.fortify.cloudscan:project-packager >---------------
[INFO] Building Fortify ScanCentral: project-packager 24.4.0.0060
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-install-plugin:2.4:install-file (default-cli) @ project-packager ---
[INFO] Installing /opt/ads-agent/_work/_tool/scancentral/24.4.0/x64/Core/lib/project-packager-24.4.0.0060.jar to /opt/ads-agent/.m2/repository/com/fortify/cloudscan/project-packager/24.4.0.0060/project-packager-24.4.0.0060.jar
[INFO] Installing /opt/ads-agent/_work/_tool/scancentral/24.4.0/x64/Core/resources/scancentral/project-packager/pom.xml to /opt/ads-agent/.m2/repository/com/fortify/cloudscan/project-packager/24.4.0.0060/project-packager-24.4.0.0060.pom
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.281 s
[INFO] Finished at: 2026-06-08T14:18:53-03:00
[INFO] ------------------------------------------------------------------------
[INFO] Scanning for projects...

	at com.google.inject.internal.InjectorShell$Builder.build(InjectorShell.java:137)
	at com.google.inject.internal.InternalInjectorCreator.build(InternalInjectorCreator.java:103)
	at com.google.inject.Guice.createInjector(Guice.java:87)
	at com.google.inject.Guice.createInjector(Guice.java:69)
	at com.google.inject.Guice.createInjector(Guice.java:59)
	at org.codehaus.plexus.DefaultPlexusContainer.addPlexusInjector(DefaultPlexusContainer.java:481)
	at org.codehaus.plexus.DefaultPlexusContainer.discoverComponents(DefaultPlexusContainer.java:460)
	at org.apache.maven.plugin.internal.DefaultMavenPluginManager.discoverPluginComponents(DefaultMavenPluginManager.java:436)
	at org.apache.maven.plugin.internal.DefaultMavenPluginManager.createPluginRealm(DefaultMavenPluginManager.java:415)
	at org.apache.maven.plugin.internal.DefaultMavenPluginManager.setupPluginRealm(DefaultMavenPluginManager.java:374)
	at org.apache.maven.plugin.DefaultBuildPluginManager.getPluginRealm(DefaultBuildPluginManager.java:234)
	at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo(DefaultBuildPluginManager.java:105)
	at org.apache.maven.lifecycle.internal.MojoExecutor.doExecute(MojoExecutor.java:301)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:211)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:165)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:157)
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:121)
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:81)
	at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build(SingleThreadedBuilder.java:56)
	at org.apache.maven.lifecycle.internal.LifecycleStarter.execute(LifecycleStarter.java:127)
	at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:294)
	at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:192)
	at org.apache.maven.DefaultMaven.execute(DefaultMaven.java:105)
	at org.apache.maven.cli.MavenCli.execute(MavenCli.java:960)
	at org.apache.maven.cli.MavenCli.doMain(MavenCli.java:293)
	at org.apache.maven.cli.MavenCli.main(MavenCli.java:196)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:606)
	at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced(Launcher.java:282)
	at org.codehaus.plexus.classworlds.launcher.Launcher.launch(Launcher.java:225)
	at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode(Launcher.java:406)
	at org.codehaus.plexus.classworlds.launcher.Launcher.main(Launcher.java:347)

	at com.google.inject.Guice.createInjector(Guice.java:87)
	at com.google.inject.Guice.createInjector(Guice.java:69)
	at com.google.inject.Guice.createInjector(Guice.java:59)
	at org.codehaus.plexus.DefaultPlexusContainer.addPlexusInjector(DefaultPlexusContainer.java:481)
	at org.codehaus.plexus.DefaultPlexusContainer.discoverComponents(DefaultPlexusContainer.java:460)
	at org.apache.maven.plugin.internal.DefaultMavenPluginManager.discoverPluginComponents(DefaultMavenPluginManager.java:436)
	at org.apache.maven.plugin.internal.DefaultMavenPluginManager.createPluginRealm(DefaultMavenPluginManager.java:415)
	at org.apache.maven.plugin.internal.DefaultMavenPluginManager.setupPluginRealm(DefaultMavenPluginManager.java:374)
	at org.apache.maven.plugin.DefaultBuildPluginManager.getPluginRealm(DefaultBuildPluginManager.java:234)
	at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo(DefaultBuildPluginManager.java:105)
	at org.apache.maven.lifecycle.internal.MojoExecutor.doExecute(MojoExecutor.java:301)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:211)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:165)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:157)
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:121)
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:81)
	at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build(SingleThreadedBuilder.java:56)
	at org.apache.maven.lifecycle.internal.LifecycleStarter.execute(LifecycleStarter.java:127)
	at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:294)
	at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:192)
	at org.apache.maven.DefaultMaven.execute(DefaultMaven.java:105)
	at org.apache.maven.cli.MavenCli.execute(MavenCli.java:960)
	at org.apache.maven.cli.MavenCli.doMain(MavenCli.java:293)
	at org.apache.maven.cli.MavenCli.main(MavenCli.java:196)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:606)
	at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced(Launcher.java:282)
	at org.codehaus.plexus.classworlds.launcher.Launcher.launch(Launcher.java:225)
	at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode(Launcher.java:406)
	at org.codehaus.plexus.classworlds.launcher.Launcher.main(Launcher.java:347)
Error generating scan specification
Command execution failure
Shutting down with errors. Please see log for details.
##[error]The process '/opt/ads-agent/_work/_tool/scancentral/24.4.0/x64/bin/scancentral' failed with exit code 1
Finishing: SAST: Análise Java [Assíncrona]




	at com.google.inject.Guice.createInjector(Guice.java:87)
	at com.google.inject.Guice.createInjector(Guice.java:69)
	at com.google.inject.Guice.createInjector(Guice.java:59)
	at org.codehaus.plexus.DefaultPlexusContainer.addPlexusInjector(DefaultPlexusContainer.java:481)
	at org.codehaus.plexus.DefaultPlexusContainer.discoverComponents(DefaultPlexusContainer.java:460)
	at org.apache.maven.plugin.internal.DefaultMavenPluginManager.discoverPluginComponents(DefaultMavenPluginManager.java:436)
	at org.apache.maven.plugin.internal.DefaultMavenPluginManager.createPluginRealm(DefaultMavenPluginManager.java:415)
	at org.apache.maven.plugin.internal.DefaultMavenPluginManager.setupPluginRealm(DefaultMavenPluginManager.java:374)
	at org.apache.maven.plugin.DefaultBuildPluginManager.getPluginRealm(DefaultBuildPluginManager.java:234)
	at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo(DefaultBuildPluginManager.java:105)
	at org.apache.maven.lifecycle.internal.MojoExecutor.doExecute(MojoExecutor.java:301)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:211)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:165)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:157)
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:121)
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:81)
	at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build(SingleThreadedBuilder.java:56)
	at org.apache.maven.lifecycle.internal.LifecycleStarter.execute(LifecycleStarter.java:127)
	at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:294)
	at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:192)
	at org.apache.maven.DefaultMaven.execute(DefaultMaven.java:105)
	at org.apache.maven.cli.MavenCli.execute(MavenCli.java:960)
	at org.apache.maven.cli.MavenCli.doMain(MavenCli.java:293)
	at org.apache.maven.cli.MavenCli.main(MavenCli.java:196)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:606)
	at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced(Launcher.java:282)
	at org.codehaus.plexus.classworlds.launcher.Launcher.launch(Launcher.java:225)
	at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode(Launcher.java:406)
	at org.codehaus.plexus.classworlds.launcher.Launcher.main(Launcher.java:347)
Error generating scan specification
Command execution failure
Shutting down with errors. Please see log for details.
##[error]The process '/opt/ads-agent/_work/_tool/scancentral/24.4.0/x64/bin/scancentral' failed with exit code 1
Finishing: SAST: Análise Java [Assíncrona]

