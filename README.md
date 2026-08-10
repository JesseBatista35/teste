Por favor, verificar e ajustar
 Repositório: SISPI-batch-busca-pendencia
Erro para gerar pipeline (Build)
Link da pipeline (Build):
https://devops.caixa/projetos/Caixa/_build/results?buildId=792388&view=results



##[debug]Evaluating condition for step: 'Maven'
##[debug]Evaluating: succeeded()
##[debug]Evaluating succeeded:
##[debug]=> True
##[debug]Result: True
Starting: Maven
==============================================================================
Task         : Maven
Description  : Build, test, and deploy with Apache Maven
Version      : 3.225.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/build/maven
==============================================================================
##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
##[debug]loading inputs and endpoints
##[debug]loading INPUT_MAVENPOMFILE
##[debug]loading INPUT_GOALS
##[debug]loading INPUT_PUBLISHJUNITRESULTS
##[debug]loading INPUT_TESTRESULTSFILES
##[debug]loading INPUT_ALLOWBROKENSYMBOLICLINKS
##[debug]loading INPUT_CODECOVERAGETOOL
##[debug]loading INPUT_FAILIFCOVERAGEEMPTY
##[debug]loading INPUT_RESTOREORIGINALPOMXML
##[debug]loading INPUT_JAVAHOMESELECTION
##[debug]loading INPUT_JDKVERSION
##[debug]loading INPUT_JDKUSERINPUTPATH
##[debug]loading INPUT_JDKARCHITECTURE
##[debug]loading INPUT_MAVENVERSIONSELECTION
##[debug]loading INPUT_MAVENPATH
##[debug]loading INPUT_MAVENSETM2HOME
##[debug]loading INPUT_MAVENOPTS
##[debug]loading INPUT_MAVENFEEDAUTHENTICATE
##[debug]loading INPUT_SKIPEFFECTIVEPOM
##[debug]loading INPUT_SQANALYSISENABLED
##[debug]loading INPUT_ISJACOCOCOVERAGEREPORTXML
##[debug]loading INPUT_SQMAVENPLUGINVERSIONCHOICE
##[debug]loading INPUT_CHECKSTYLEANALYSISENABLED


##[debug]loading INPUT_ISJACOCOCOVERAGEREPORTXML
##[debug]loading INPUT_SQMAVENPLUGINVERSIONCHOICE
##[debug]loading INPUT_CHECKSTYLEANALYSISENABLED
##[debug]loading INPUT_PMDANALYSISENABLED
##[debug]loading INPUT_FINDBUGSANALYSISENABLED
##[debug]loading INPUT_SPOTBUGSANALYSISENABLED
##[debug]loading INPUT_SPOTBUGSMAVENPLUGINVERSION
##[debug]loading INPUT_SPOTBUGSGOAL
##[debug]loading INPUT_SPOTBUGSFAILWHENBUGSFOUND
##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
##[debug]loading SECRET_OKD_TOKEN_REGISTRY
##[debug]loading SECRET_BT_SECRETS_PATH
##[debug]loading SECRET_FORTIFY_CLIENT_AUTH_TOKEN
##[debug]loading SECRET_FORTIFY_TOKEN
##[debug]loading SECRET_FORTIFY_CI_TOKEN
##[debug]loading SECRET_FORTIFY_PASS
##[debug]loading SECRET_AZPAT
##[debug]loading SECRET_SONAR_PASSWORD
##[debug]loading SECRET_FORTIFY_APITOKEN
##[debug]loading SECRET_KEYSTORE_PWD
##[debug]loading SECRET_SCANCENTRAL_SSCCITOKEN
##[debug]loading SECRET_OKD_TOKEN_KAFKA
##[debug]loading SECRET_FORTIFY_REGISTRY_PASSWORD
##[debug]loading SECRET_NEXUS_INTERNO_PASS
##[debug]loading SECRET_FORTIFY_UPTOKEN
##[debug]loading SECRET_TOKEN_CRQ
##[debug]loading SECRET_SCANCENTRAL_CLIENTTOKEN
##[debug]loading SECRET_OKD_TOKEN
##[debug]loaded 49
##[debug]Agent.ProxyUrl=undefined
##[debug]Agent.CAInfo=undefined
##[debug]Agent.ClientCert=undefined
##[debug]Agent.SkipCertValidation=True
##[debug]check path : /opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.225.0/node_modules/azure-pipelines-tasks-codecoverage-tools/module.json
##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.225.0/node_modules/azure-pipelines-tasks-codecoverage-tools/module.json
##[debug]system.culture=en-US
##[debug]Resource file has already set to: /opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.225.0/node_modules/azure-pipelines-tasks-codecoverage-tools/module.json
##[debug]Resource file has already set to: /opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.225.0/node_modules/azure-pipelines-tasks-codecoverage-tools/module.json
##[debug]Resource file has already set to: /opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.225.0/node_modules/azure-pipelines-tasks-codecoverage-tools/module.json
##[debug]Resource file has already set to: /opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.225.0/node_modules/azure-pipelines-tasks-codecoverage-tools/module.json
##[debug]Resource file has already set to: /opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.225.0/node_modules/azure-pipelines-tasks-codecoverage-tools/module.json
##[debug]check path : /opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.225.0/node_modules/azure-pipelines-tasks-java-common/lib.json
##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.225.0/node_modules/azure-pipelines-tasks-java-common/lib.json
##[debug]system.culture=en-US
##[debug]check path : /opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.225.0/task.json
##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.225.0/task.json
##[debug]system.culture=en-US
##[debug]mavenPOMFile=/opt/ads-agent/_work/12201/s/pom.xml
##[debug]check path : /opt/ads-agent/_work/12201/s/pom.xml
##[debug]javaHomeSelection=Path
##[debug]mavenVersionSelection=Path
##[debug]goals=clean package -U
##[debug]options=undefined
##[debug]publishJUnitResults=false
##[debug]testResultsFiles=/opt/ads-agent/_work/12201/s/**/surefire-reports/TEST-*.xml
##[debug]codeCoverageTool=None
##[debug]mavenFeedAuthenticate=false
##[debug]skipEffectivePom=false
##[debug]failIfCoverageEmpty=false
##[debug]restoreOriginalPomXml=false
##[debug]spotBugsAnalysisEnabled=false
##[debug]spotBugsGoal=spotbugs
##[debug]spotBugsFailWhenBugsFound=true
##[debug]System.DefaultWorkingDirectory=/opt/ads-agent/_work/12201/s
##[debug]Using Maven path from user input
##[debug]mavenPath=/opt/apache-maven/apache-maven-3.8.5/
##[debug]check path : /opt/apache-maven/apache-maven-3.8.5/
##[debug]mavenSetM2Home=false
##[debug]check path : /opt/apache-maven/apache-maven-3.8.5/bin/mvn
##[debug]Maven executable: /opt/apache-maven/apache-maven-3.8.5/bin/mvn
##[debug]Setting JAVA_HOME to the path specified by user input
##[debug]jdkUserInputPath=/usr/java/open-jdk-21.0.5
##[debug]check path : /usr/java/open-jdk-21.0.5
##[debug]Agent.Version=3.225.2
##[debug]Processed: ##vso[telemetry.publish area=TaskHub;feature=Maven]{"jdkVersion":"custom"}
##[debug]set JAVA_HOME=/usr/java/open-jdk-21.0.5
##[debug]Processed: ##vso[task.setvariable variable=JAVA_HOME;isOutput=false;issecret=false;]/usr/java/open-jdk-21.0.5
##[debug]Enabled code coverage successfully
##[debug]which '/opt/apache-maven/apache-maven-3.8.5/bin/mvn'
##[debug]found: '/opt/apache-maven/apache-maven-3.8.5/bin/mvn'
##[debug]/opt/apache-maven/apache-maven-3.8.5/bin/mvn arg: -version
##[debug]mavenOpts=-Xmx4096m
##[debug]MAVEN_OPTS is now set to -Xmx4096m
##[debug]exec tool: /opt/apache-maven/apache-maven-3.8.5/bin/mvn
##[debug]arguments:
##[debug]   -version
/opt/apache-maven/apache-maven-3.8.5/bin/mvn -version
Apache Maven 3.8.5 (3599d3414f046de2324203b78ddcf9b5e4388aa0)
Maven home: /opt/apache-maven/apache-maven-3.8.5
Java version: 21.0.5, vendor: Red Hat, Inc., runtime: /usr/java/open-jdk-21.0.5
Default locale: pt_BR, platform encoding: UTF-8
OS name: "linux", version: "3.10.0-1062.9.1.el7.x86_64", arch: "amd64", family: "unix"
##[debug]Exit code 0 received from tool '/opt/apache-maven/apache-maven-3.8.5/bin/mvn'
##[debug]STDIO streams have closed for tool '/opt/apache-maven/apache-maven-3.8.5/bin/mvn'
##[debug]Built-in Maven feed authentication is disabled
##[debug]which '/opt/apache-maven/apache-maven-3.8.5/bin/mvn'
##[debug]found: '/opt/apache-maven/apache-maven-3.8.5/bin/mvn'
##[debug]/opt/apache-maven/apache-maven-3.8.5/bin/mvn arg: -f
##[debug]/opt/apache-maven/apache-maven-3.8.5/bin/mvn arg: /opt/ads-agent/_work/12201/s/pom.xml
##[debug]/opt/apache-maven/apache-maven-3.8.5/bin/mvn arg: ["clean","package","-U"]
##[debug]isJacocoCoverageReportXML=false
##[debug]sqAnalysisEnabled=false
##[debug]System.DefaultWorkingDirectory=/opt/ads-agent/_work/12201/s
##[debug]build.artifactStagingDirectory=/opt/ads-agent/_work/12201/a
##[debug]build.buildNumber=20260810.3
##[debug]checkstyleAnalysisEnabled=false
##[debug]findbugsAnalysisEnabled=false
##[debug]pmdAnalysisEnabled=false
##[debug]Getting credentials for local feeds
##[debug]SYSTEMVSSCONNECTION exists true
##[debug]Got auth token
##[debug]exec tool: /opt/apache-maven/apache-maven-3.8.5/bin/mvn
##[debug]arguments:
##[debug]   -f
##[debug]   /opt/ads-agent/_work/12201/s/pom.xml
##[debug]   clean
##[debug]   package
##[debug]   -U
/opt/apache-maven/apache-maven-3.8.5/bin/mvn -f /opt/ads-agent/_work/12201/s/pom.xml clean package -U
[INFO] Scanning for projects...
[INFO] 
[INFO] -----------< br.gov.caixa.sispi:sispi-batch-busca-p
[INFO] Building sispi-batch-busca-pendencia 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/br/gov/caixa/pix/suporte/pix-api-suporte/maven-metadata.xml
Progress (1): 2.0 kB
                    
Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/br/gov/caixa/pix/suporte/pix-api-suporte/maven-metadata.xml (2.0 kB at 3.1 kB/s)
Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/bouncycastle/bcutil-jdk18on/maven-metadata.xml
Progress (1): 1.4 kB
                    
Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/bouncycastle/bcutil-jdk18on/maven-metadata.xml (1.4 kB at 1.4 kB/s)
Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/bouncycastle/bcprov-jdk18on/maven-metadata.xml
Progress (1): 1.5 kB
                    
Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/bouncycastle/bcprov-jdk18on/maven-metadata.xml (1.5 kB at 2.5 kB/s)
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ sispi-batch-busca-pendencia ---
[INFO] Deleting /opt/ads-agent/_work/12201/s/target
[INFO] 
[INFO] --- jacoco-maven-plugin:0.8.5:prepare-agent (default) @ sispi-batch-busca-pendencia ---
[INFO] argLine set to -javaagent:/opt/ads-agent/.m2/repository/org/jacoco/org.jacoco.agent/0.8.5/org.jacoco.agent-0.8.5-runtime.jar=destfile=/opt/ads-agent/_work/12201/s/target/jacoco.exec
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ sispi-batch-busca-pendencia ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 8 resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ sispi-batch-busca-pendencia ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 122 source files to /opt/ads-agent/_work/12201/s/target/classes
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  7.176 s
[INFO] Finished at: 2026-08-10T09:05:08-03:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project sispi-batch-busca-pendencia: Fatal error compiling: java.lang.IllegalAccessError: class lombok.javac.apt.LombokProcessor (in unnamed module @0x214c51eb) cannot access class com.sun.tools.javac.processing.JavacProcessingEnvironment (in module jdk.compiler) because module jdk.compiler does not export com.sun.tools.javac.processing to unnamed module @0x214c51eb -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoExecutionException
##[debug]Exit code 1 received from tool '/opt/apache-maven/apache-maven-3.8.5/bin/mvn'
##[debug]STDIO streams have closed for tool '/opt/apache-maven/apache-maven-3.8.5/bin/mvn'
The process '/opt/apache-maven/apache-maven-3.8.5/bin/mvn' failed with exit code 1
##[debug]publishCodeCoverage userRunFailed=true
##[debug]task result: Failed
##[error]Build failed.
##[debug]Processed: ##vso[task.issue type=error;]Build failed.
##[debug]Processed: ##vso[task.complete result=Failed;]Build failed.
Could not retrieve code analysis results - Maven run failed.
Finishing: Maven
