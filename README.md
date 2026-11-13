2026-11-12T20:32:11.5660544Z ##[section]Starting: Maven
2026-11-12T20:32:11.5668540Z ==============================================================================
2026-11-12T20:32:11.5668653Z Task         : Maven
2026-11-12T20:32:11.5668704Z Description  : Build, test, and deploy with Apache Maven
2026-11-12T20:32:11.5668808Z Version      : 4.225.0
2026-11-12T20:32:11.5668857Z Author       : Microsoft Corporation
2026-11-12T20:32:11.5668912Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/build/maven
2026-11-12T20:32:11.5669023Z ==============================================================================
2026-11-12T20:32:12.2145556Z [command]/opt/apache-maven/apache-maven-3.9.9/bin/mvn -version
2026-11-12T20:32:12.3642619Z Apache Maven 3.9.9 (8e8579a9e76f7d015ee5ec7bfcdc97d260186937)
2026-11-12T20:32:12.3643323Z Maven home: /opt/apache-maven/apache-maven-3.9.9
2026-11-12T20:32:12.3643636Z Java version: 21.0.5, vendor: Red Hat, Inc., runtime: /usr/java/open-jdk-21.0.5
2026-11-12T20:32:12.3643972Z Default locale: pt_BR, platform encoding: UTF-8
2026-11-12T20:32:12.3644337Z OS name: "linux", version: "5.18.5-100.fc35.x86_64", arch: "amd64", family: "unix"
2026-11-12T20:32:12.3863182Z [command]/opt/apache-maven/apache-maven-3.9.9/bin/mvn -f /opt/ads-agent/_work/9/s/mod-caixinhas/pom.xml clean install -Dversion.app=0.0.8-SNAPSHOT
2026-11-12T20:32:13.3998380Z [INFO] Scanning for projects...
2026-11-12T20:32:13.7265243Z [INFO] 
2026-11-12T20:32:13.7288277Z [INFO] -------------< br.gov.caixa.siifx.caixinhas:mod-caixinhas >-------------
2026-11-12T20:32:13.7288601Z [INFO] Building mod-caixinhas 1.0-SNAPSHOT
2026-11-12T20:32:13.7288759Z [INFO]   from pom.xml
2026-11-12T20:32:13.7289239Z [INFO] --------------------------------[ jar ]---------------------------------
2026-11-12T20:32:14.4447513Z [INFO] 
2026-11-12T20:32:14.4448748Z [INFO] --- clean:3.2.0:clean (default-clean) @ mod-caixinhas ---
2026-11-12T20:32:14.5079034Z [INFO] 
2026-11-12T20:32:14.5079625Z [INFO] --- dependency:3.6.1:properties (resolve-mockito-agent) @ mod-caixinhas ---
2026-11-12T20:32:15.7800477Z [INFO] 
2026-11-12T20:32:15.7801229Z [INFO] --- jacoco:0.8.12:prepare-agent (prepare-agent) @ mod-caixinhas ---
2026-11-12T20:32:15.8403599Z [INFO] argLine set to -javaagent:/opt/ads-agent/cache-tools/.m2/repository/org/jacoco/org.jacoco.agent/0.8.12/org.jacoco.agent-0.8.12-runtime.jar=destfile=/opt/ads-agent/_work/9/s/mod-caixinhas/target/jacoco.exec
2026-11-12T20:32:15.8404428Z [INFO] 
2026-11-12T20:32:15.8404779Z [INFO] --- resources:3.3.1:resources (default-resources) @ mod-caixinhas ---
2026-11-12T20:32:15.8891659Z [INFO] Copying 2 resources from src/main/resources to target/classes
2026-11-12T20:32:15.8936195Z [INFO] 
2026-11-12T20:32:15.8936976Z [INFO] --- compiler:3.13.0:compile (default-compile) @ mod-caixinhas ---
2026-11-12T20:32:16.0112886Z [INFO] Recompiling the module because of changed source code.
2026-11-12T20:32:16.0169948Z [INFO] Compiling 62 source files with javac [debug parameters release 21] to target/classes
2026-11-12T20:32:16.3719820Z [INFO] Annotation processing is enabled because one or more processors were found
2026-11-12T20:32:16.3720363Z   on the class path. A future release of javac may disable annotation processing
2026-11-12T20:32:16.3721008Z   unless at least one processor is specified by name (-processor), or a search
2026-11-12T20:32:16.3721557Z   path is specified (--processor-path, --processor-module-path), or annotation
2026-11-12T20:32:16.3722085Z   processing is enabled explicitly (-proc:only, -proc:full).
2026-11-12T20:32:16.3722454Z   Use -Xlint:-options to suppress this message.
2026-11-12T20:32:16.3722799Z   Use -proc:none to disable annotation processing.
2026-11-12T20:32:16.3723242Z [INFO] -------------------------------------------------------------
2026-11-12T20:32:16.3723467Z [ERROR] COMPILATION ERROR : 
2026-11-12T20:32:16.3724178Z [INFO] -------------------------------------------------------------
2026-11-12T20:32:16.3724696Z [ERROR] /opt/ads-agent/_work/9/s/mod-caixinhas/src/main/java/br/org/caixa/siifx/caixinhas/CaixinhasAutoConfiguration.java:[73,51] ';' expected
2026-11-12T20:32:16.3725629Z [ERROR] /opt/ads-agent/_work/9/s/mod-caixinhas/src/main/java/br/org/caixa/siifx/caixinhas/CaixinhasAutoConfiguration.java:[77,2] reached end of file while parsing
2026-11-12T20:32:16.3726039Z [INFO] 2 errors 
2026-11-12T20:32:16.3726389Z [INFO] -------------------------------------------------------------
2026-11-12T20:32:16.3726802Z [INFO] ------------------------------------------------------------------------
2026-11-12T20:32:16.3727070Z [INFO] BUILD FAILURE
2026-11-12T20:32:16.3727430Z [INFO] ------------------------------------------------------------------------
2026-11-12T20:32:16.3734392Z [INFO] Total time:  2.994 s
2026-11-12T20:32:16.3735048Z [INFO] Finished at: 2026-11-12T17:32:16-03:00
2026-11-12T20:32:16.3735462Z [INFO] ------------------------------------------------------------------------
2026-11-12T20:32:16.3747286Z [ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.13.0:compile (default-compile) on project mod-caixinhas: Compilation failure: Compilation failure: 
2026-11-12T20:32:16.3748231Z [ERROR] /opt/ads-agent/_work/9/s/mod-caixinhas/src/main/java/br/org/caixa/siifx/caixinhas/CaixinhasAutoConfiguration.java:[73,51] ';' expected
2026-11-12T20:32:16.3748752Z [ERROR] /opt/ads-agent/_work/9/s/mod-caixinhas/src/main/java/br/org/caixa/siifx/caixinhas/CaixinhasAutoConfiguration.java:[77,2] reached end of file while parsing
2026-11-12T20:32:16.3749140Z [ERROR] -> [Help 1]
2026-11-12T20:32:16.3749350Z [ERROR] 
2026-11-12T20:32:16.3749836Z [ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
2026-11-12T20:32:16.3750635Z [ERROR] Re-run Maven using the -X switch to enable full debug logging.
2026-11-12T20:32:16.3750892Z [ERROR] 
2026-11-12T20:32:16.3751251Z [ERROR] For more information about the errors and possible solutions, please read the following articles:
2026-11-12T20:32:16.3751601Z [ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
2026-11-12T20:32:16.4205781Z ##[error]Build failed.
2026-11-12T20:32:16.4212701Z The process '/opt/apache-maven/apache-maven-3.9.9/bin/mvn' failed with exit code 1
2026-11-12T20:32:16.4212978Z Could not retrieve code analysis results - Maven run failed.
2026-11-12T20:32:16.4291010Z ##[section]Finishing: Maven
