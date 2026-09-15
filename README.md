

Avaliar erro de comunicação (Time out - RC 504) no seleniumGrid (https://selenium-router-selenium-grid.apps.produtos4.caixa/ui). No começo do mês utilizando o mesmo teste, mesma página alvo, o erro não ocorria (vide - https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=523051&environmentId=2428959), porém na semana seguinte o erro começou a ocorrer (vide - https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=526850&environmentId=2447601)


Sobre o exposto na REQ000145919145, o problema está na comunicação da ferramenta Selenium Grid com o site alvo do teste.



<img width="1359" height="716" alt="imagem+(15) (1)" src="https://github.com/user-attachments/assets/8b7dcb6f-4510-4f75-9fb7-546f883c08a8" />



2026-09-14T20:42:10.9115557Z ##[debug]Evaluating condition for step: 'Task Maven'
2026-09-14T20:42:10.9116354Z ##[debug]Evaluating: succeeded()
2026-09-14T20:42:10.9116611Z ##[debug]Evaluating succeeded:
2026-09-14T20:42:10.9117164Z ##[debug]=> True
2026-09-14T20:42:10.9117426Z ##[debug]Result: True
2026-09-14T20:42:10.9117687Z ##[section]Starting: Task Maven
2026-09-14T20:42:10.9124387Z ==============================================================================
2026-09-14T20:42:10.9124527Z Task         : Maven
2026-09-14T20:42:10.9124604Z Description  : Build, test, and deploy with Apache Maven
2026-09-14T20:42:10.9124721Z Version      : 3.225.0
2026-09-14T20:42:10.9124798Z Author       : Microsoft Corporation
2026-09-14T20:42:10.9124890Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/build/maven
2026-09-14T20:42:10.9125024Z ==============================================================================
2026-09-14T20:42:10.9657365Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-09-14T20:42:10.9750369Z ##[debug]Agent environment resources - Disk: / Available 29498.00 MB out of 122356.00 MB, Memory: Used 25982.00 MB out of 64300.00 MB, CPU: Usage 61.54%
2026-09-14T20:42:11.0340298Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-09-14T20:42:11.0352013Z ##[debug]loading inputs and endpoints
2026-09-14T20:42:11.0442016Z ##[debug]loading INPUT_MAVENPOMFILE
2026-09-14T20:42:11.0442338Z ##[debug]loading INPUT_GOALS
2026-09-14T20:42:11.0442574Z ##[debug]loading INPUT_OPTIONS
2026-09-14T20:42:11.0442813Z ##[debug]loading INPUT_PUBLISHJUNITRESULTS
2026-09-14T20:42:11.0443056Z ##[debug]loading INPUT_TESTRESULTSFILES
2026-09-14T20:42:11.0443303Z ##[debug]loading INPUT_ALLOWBROKENSYMBOLICLINKS
2026-09-14T20:42:11.0443544Z ##[debug]loading INPUT_CODECOVERAGETOOL
2026-09-14T20:42:11.0443770Z ##[debug]loading INPUT_FAILIFCOVERAGEEMPTY
2026-09-14T20:42:11.0444203Z ##[debug]loading INPUT_RESTOREORIGINALPOMXML
2026-09-14T20:42:11.0444441Z ##[debug]loading INPUT_JAVAHOMESELECTION
2026-09-14T20:42:11.0444685Z ##[debug]loading INPUT_JDKVERSION
2026-09-14T20:42:11.0444922Z ##[debug]loading INPUT_JDKUSERINPUTPATH
2026-09-14T20:42:11.0445146Z ##[debug]loading INPUT_JDKARCHITECTURE
2026-09-14T20:42:11.0445391Z ##[debug]loading INPUT_MAVENVERSIONSELECTION
2026-09-14T20:42:11.0445627Z ##[debug]loading INPUT_MAVENSETM2HOME
2026-09-14T20:42:11.0445846Z ##[debug]loading INPUT_MAVENOPTS
2026-09-14T20:42:11.0446080Z ##[debug]loading INPUT_MAVENFEEDAUTHENTICATE
2026-09-14T20:42:11.0446318Z ##[debug]loading INPUT_SKIPEFFECTIVEPOM
2026-09-14T20:42:11.0446594Z ##[debug]loading INPUT_SQANALYSISENABLED
2026-09-14T20:42:11.0446832Z ##[debug]loading INPUT_ISJACOCOCOVERAGEREPORTXML
2026-09-14T20:42:11.0447073Z ##[debug]loading INPUT_SQMAVENPLUGINVERSIONCHOICE
2026-09-14T20:42:11.0447304Z ##[debug]loading INPUT_CHECKSTYLEANALYSISENABLED
2026-09-14T20:42:11.0447536Z ##[debug]loading INPUT_PMDANALYSISENABLED
2026-09-14T20:42:11.0447771Z ##[debug]loading INPUT_FINDBUGSANALYSISENABLED
2026-09-14T20:42:11.0447995Z ##[debug]loading INPUT_SPOTBUGSANALYSISENABLED
2026-09-14T20:42:11.0448237Z ##[debug]loading INPUT_SPOTBUGSMAVENPLUGINVERSION
2026-09-14T20:42:11.0448473Z ##[debug]loading INPUT_SPOTBUGSGOAL
2026-09-14T20:42:11.0448703Z ##[debug]loading INPUT_SPOTBUGSFAILWHENBUGSFOUND
2026-09-14T20:42:11.0448950Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-09-14T20:42:11.0449201Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-09-14T20:42:11.0449462Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-09-14T20:42:11.0449718Z ##[debug]loading SECRET_NEXUS_INTERNO_PASS
2026-09-14T20:42:11.0449954Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-09-14T20:42:11.0450179Z ##[debug]loading SECRET_FORTIFY_PASS
2026-09-14T20:42:11.0450406Z ##[debug]loading SECRET_AZPAT
2026-09-14T20:42:11.0450629Z ##[debug]loading SECRET_SCANCENTRAL_SSCCITOKEN
2026-09-14T20:42:11.0450864Z ##[debug]loading SECRET_FORTIFY_UPTOKEN
2026-09-14T20:42:11.0451094Z ##[debug]loading SECRET_FORTIFY_CI_TOKEN
2026-09-14T20:42:11.0451699Z ##[debug]loading SECRET_FORTIFY_CLIENT_AUTH_TOKEN
2026-09-14T20:42:11.0451942Z ##[debug]loading SECRET_FORTIFY_REGISTRY_PASSWORD
2026-09-14T20:42:11.0452251Z ##[debug]loading SECRET_DB_PASSWORD
2026-09-14T20:42:11.0452473Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-09-14T20:42:11.0452699Z ##[debug]loading SECRET_TOKEN_CRQ
2026-09-14T20:42:11.0452925Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-09-14T20:42:11.0453145Z ##[debug]loading SECRET_FORTIFY_TOKEN
2026-09-14T20:42:11.0453371Z ##[debug]loading SECRET_KEYSTORE_PWD
2026-09-14T20:42:11.0453608Z ##[debug]loading SECRET_SCANCENTRAL_CLIENTTOKEN
2026-09-14T20:42:11.0453826Z ##[debug]loaded 47
2026-09-14T20:42:11.0454248Z ##[debug]Agent.ProxyUrl=http://proxynuvem.caixa:80
2026-09-14T20:42:11.0454494Z ##[debug]Agent.ProxyUsername=undefined
2026-09-14T20:42:11.0454713Z ##[debug]Agent.ProxyPassword=undefined
2026-09-14T20:42:11.0455035Z ##[debug]Agent.ProxyBypassList=["\\.caixa","\\.caixa\\.gov\\.br","\\.corecaixa","\\.local","localhost","10\\.0\\.0\\.0/8","25\\.0\\.0\\.0/8","cadsvgerlx080\\.intra\\.caixa\\.gov\\.br","10\\.122\\.146\\.248","mirrors\\.fedoraproject\\.org","packages\\.microsoft\\.com"]
2026-09-14T20:42:11.0455359Z ##[debug]expose agent proxy configuration.
2026-09-14T20:42:11.0455580Z ##[debug]Agent.CAInfo=undefined
2026-09-14T20:42:11.0455810Z ##[debug]Agent.ClientCert=undefined
2026-09-14T20:42:11.0456039Z ##[debug]Agent.SkipCertValidation=True
2026-09-14T20:42:11.1093265Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.225.0/node_modules/azure-pipelines-tasks-codecoverage-tools/module.json
2026-09-14T20:42:11.1093709Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.225.0/node_modules/azure-pipelines-tasks-codecoverage-tools/module.json
2026-09-14T20:42:11.1094104Z ##[debug]system.culture=en-US
2026-09-14T20:42:11.1118594Z ##[debug]Resource file has already set to: /opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.225.0/node_modules/azure-pipelines-tasks-codecoverage-tools/module.json
2026-09-14T20:42:11.1119030Z ##[debug]Resource file has already set to: /opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.225.0/node_modules/azure-pipelines-tasks-codecoverage-tools/module.json
2026-09-14T20:42:11.1119394Z ##[debug]Resource file has already set to: /opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.225.0/node_modules/azure-pipelines-tasks-codecoverage-tools/module.json
2026-09-14T20:42:11.1123288Z ##[debug]Resource file has already set to: /opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.225.0/node_modules/azure-pipelines-tasks-codecoverage-tools/module.json
2026-09-14T20:42:11.1127131Z ##[debug]Resource file has already set to: /opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.225.0/node_modules/azure-pipelines-tasks-codecoverage-tools/module.json
2026-09-14T20:42:11.1273343Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.225.0/node_modules/azure-pipelines-tasks-java-common/lib.json
2026-09-14T20:42:11.1273752Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.225.0/node_modules/azure-pipelines-tasks-java-common/lib.json
2026-09-14T20:42:11.1274154Z ##[debug]system.culture=en-US
2026-09-14T20:42:11.4318887Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.225.0/task.json
2026-09-14T20:42:11.4319285Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.225.0/task.json
2026-09-14T20:42:11.4319563Z ##[debug]system.culture=en-US
2026-09-14T20:42:11.4327894Z ##[debug]mavenPOMFile=/opt/ads-agent/_work/r2/a/_AxeAutomator-ferramenta-teste/axe-automator-teste/pom.xml
2026-09-14T20:42:11.4328325Z ##[debug]check path : /opt/ads-agent/_work/r2/a/_AxeAutomator-ferramenta-teste/axe-automator-teste/pom.xml
2026-09-14T20:42:11.4329673Z ##[debug]javaHomeSelection=JDKVersion
2026-09-14T20:42:11.4330450Z ##[debug]mavenVersionSelection=Default
2026-09-14T20:42:11.4331184Z ##[debug]goals=clean compile test-compile org.apache.maven.plugins:maven-surefire-plugin:3.5.3:test
2026-09-14T20:42:11.4332076Z ##[debug]options=-Dtest.resources.dir=/opt/ads-agent/_work/r2/a/_sicbs-qualidade/teste-acessibilidade/SICBS-frontend -Dtest.output.dir=/opt/ads-agent/_work/r2/a/_AxeAutomator-ferramenta-teste/axe-automator-teste/relatorios -Dselenium.grid.url=https://selenium-router-selenium-grid.apps.produtos4.caixa
2026-09-14T20:42:11.4332613Z ##[debug]publishJUnitResults=false
2026-09-14T20:42:11.4333711Z ##[debug]testResultsFiles=/opt/ads-agent/_work/r2/a/**/surefire-reports/TEST-*.xml
2026-09-14T20:42:11.4334386Z ##[debug]codeCoverageTool=None
2026-09-14T20:42:11.4334891Z ##[debug]mavenFeedAuthenticate=false
2026-09-14T20:42:11.4335469Z ##[debug]skipEffectivePom=false
2026-09-14T20:42:11.4335964Z ##[debug]failIfCoverageEmpty=false
2026-09-14T20:42:11.4336440Z ##[debug]restoreOriginalPomXml=false
2026-09-14T20:42:11.4337447Z ##[debug]spotBugsAnalysisEnabled=false
2026-09-14T20:42:11.4337887Z ##[debug]spotBugsGoal=spotbugs
2026-09-14T20:42:11.4338339Z ##[debug]spotBugsFailWhenBugsFound=true
2026-09-14T20:42:11.4338617Z ##[debug]System.DefaultWorkingDirectory=/opt/ads-agent/_work/r2/a
2026-09-14T20:42:11.4340110Z ##[debug]M2_HOME=/opt/apache-maven/apache-maven-3.8.5
2026-09-14T20:42:11.4340376Z ##[debug]Using M2_HOME environment variable value for Maven path: /opt/apache-maven/apache-maven-3.8.5
2026-09-14T20:42:11.4340697Z ##[debug]check path : /opt/apache-maven/apache-maven-3.8.5/bin/mvn
2026-09-14T20:42:11.4340952Z ##[debug]Maven executable: /opt/apache-maven/apache-maven-3.8.5/bin/mvn
2026-09-14T20:42:11.4341196Z ##[debug]Using the specified JDK version to find and set JAVA_HOME
2026-09-14T20:42:11.4341433Z ##[debug]jdkVersion=default
2026-09-14T20:42:11.4341649Z ##[debug]jdkArchitecture=x86
2026-09-14T20:42:11.4341941Z ##[debug]Agent.Version=3.236.1
2026-09-14T20:42:11.4551605Z ##[debug]Processed: ##vso[telemetry.publish area=TaskHub;feature=Maven]{"jdkVersion":"default"}
2026-09-14T20:42:11.4552188Z ##[debug]Enabled code coverage successfully
2026-09-14T20:42:11.4552456Z ##[debug]which '/opt/apache-maven/apache-maven-3.8.5/bin/mvn'
2026-09-14T20:42:11.4552710Z ##[debug]found: '/opt/apache-maven/apache-maven-3.8.5/bin/mvn'
2026-09-14T20:42:11.4552972Z ##[debug]/opt/apache-maven/apache-maven-3.8.5/bin/mvn arg: -version
2026-09-14T20:42:11.4553217Z ##[debug]mavenOpts=-Xmx1024m
2026-09-14T20:42:11.4553441Z ##[debug]MAVEN_OPTS is now set to -Xmx1024m
2026-09-14T20:42:11.4553682Z ##[debug]exec tool: /opt/apache-maven/apache-maven-3.8.5/bin/mvn
2026-09-14T20:42:11.4554001Z ##[debug]arguments:
2026-09-14T20:42:11.4554213Z ##[debug]   -version
2026-09-14T20:42:11.4554653Z [command]/opt/apache-maven/apache-maven-3.8.5/bin/mvn -version
2026-09-14T20:42:11.5640849Z Apache Maven 3.8.5 (3599d3414f046de2324203b78ddcf9b5e4388aa0)
2026-09-14T20:42:11.5641346Z Maven home: /opt/apache-maven/apache-maven-3.8.5
2026-09-14T20:42:11.5641586Z Java version: 17.0.8, vendor: OpenLogic, runtime: /usr/java/open-jdk-17.0.8
2026-09-14T20:42:11.5641729Z Default locale: pt_BR, platform encoding: UTF-8
2026-09-14T20:42:11.5641964Z OS name: "linux", version: "5.18.5-100.fc35.x86_64", arch: "amd64", family: "unix"
2026-09-14T20:42:11.5785038Z ##[debug]Exit code 0 received from tool '/opt/apache-maven/apache-maven-3.8.5/bin/mvn'
2026-09-14T20:42:11.5787873Z ##[debug]STDIO streams have closed for tool '/opt/apache-maven/apache-maven-3.8.5/bin/mvn'
2026-09-14T20:42:11.5791328Z ##[debug]Built-in Maven feed authentication is disabled
2026-09-14T20:42:11.5792339Z ##[debug]which '/opt/apache-maven/apache-maven-3.8.5/bin/mvn'
2026-09-14T20:42:11.5793795Z ##[debug]found: '/opt/apache-maven/apache-maven-3.8.5/bin/mvn'
2026-09-14T20:42:11.5794129Z ##[debug]/opt/apache-maven/apache-maven-3.8.5/bin/mvn arg: -f
2026-09-14T20:42:11.5794719Z ##[debug]/opt/apache-maven/apache-maven-3.8.5/bin/mvn arg: /opt/ads-agent/_work/r2/a/_AxeAutomator-ferramenta-teste/axe-automator-teste/pom.xml
2026-09-14T20:42:11.5795456Z ##[debug]/opt/apache-maven/apache-maven-3.8.5/bin/mvn arg: -Dtest.resources.dir=/opt/ads-agent/_work/r2/a/_sicbs-qualidade/teste-acessibilidade/SICBS-frontend -Dtest.output.dir=/opt/ads-agent/_work/r2/a/_AxeAutomator-ferramenta-teste/axe-automator-teste/relatorios -Dselenium.grid.url=https://selenium-router-selenium-grid.apps.produtos4.caixa
2026-09-14T20:42:11.5796447Z ##[debug]/opt/apache-maven/apache-maven-3.8.5/bin/mvn arg: ["clean","compile","test-compile","org.apache.maven.plugins:maven-surefire-plugin:3.5.3:test"]
2026-09-14T20:42:11.5799108Z ##[debug]isJacocoCoverageReportXML=false
2026-09-14T20:42:11.5799764Z ##[debug]sqAnalysisEnabled=false
2026-09-14T20:42:11.5801104Z ##[debug]System.DefaultWorkingDirectory=/opt/ads-agent/_work/r2/a
2026-09-14T20:42:11.5801362Z ##[debug]build.artifactStagingDirectory=undefined
2026-09-14T20:42:11.5801701Z Code analysis is disabled outside of the build environment. Could not find a value for: build.artifactStagingDirectory
2026-09-14T20:42:11.5802787Z ##[debug]Getting credentials for local feeds
2026-09-14T20:42:11.5804078Z ##[debug]SYSTEMVSSCONNECTION exists true
2026-09-14T20:42:11.5804557Z ##[debug]Got auth token
2026-09-14T20:42:11.5810690Z ##[debug]exec tool: /opt/apache-maven/apache-maven-3.8.5/bin/mvn
2026-09-14T20:42:11.5811054Z ##[debug]arguments:
2026-09-14T20:42:11.5811291Z ##[debug]   -f
2026-09-14T20:42:11.5811533Z ##[debug]   /opt/ads-agent/_work/r2/a/_AxeAutomator-ferramenta-teste/axe-automator-teste/pom.xml
2026-09-14T20:42:11.5811828Z ##[debug]   -Dtest.resources.dir=/opt/ads-agent/_work/r2/a/_sicbs-qualidade/teste-acessibilidade/SICBS-frontend
2026-09-14T20:42:11.5812123Z ##[debug]   -Dtest.output.dir=/opt/ads-agent/_work/r2/a/_AxeAutomator-ferramenta-teste/axe-automator-teste/relatorios
2026-09-14T20:42:11.5812408Z ##[debug]   -Dselenium.grid.url=https://selenium-router-selenium-grid.apps.produtos4.caixa
2026-09-14T20:42:11.5812641Z ##[debug]   clean
2026-09-14T20:42:11.5812850Z ##[debug]   compile
2026-09-14T20:42:11.5813055Z ##[debug]   test-compile
2026-09-14T20:42:11.5813306Z ##[debug]   org.apache.maven.plugins:maven-surefire-plugin:3.5.3:test
2026-09-14T20:42:11.5814351Z [command]/opt/apache-maven/apache-maven-3.8.5/bin/mvn -f /opt/ads-agent/_work/r2/a/_AxeAutomator-ferramenta-teste/axe-automator-teste/pom.xml -Dtest.resources.dir=/opt/ads-agent/_work/r2/a/_sicbs-qualidade/teste-acessibilidade/SICBS-frontend -Dtest.output.dir=/opt/ads-agent/_work/r2/a/_AxeAutomator-ferramenta-teste/axe-automator-teste/relatorios -Dselenium.grid.url=https://selenium-router-selenium-grid.apps.produtos4.caixa clean compile test-compile org.apache.maven.plugins:maven-surefire-plugin:3.5.3:test
2026-09-14T20:42:12.2094715Z [INFO] Scanning for projects...
2026-09-14T20:42:12.2795300Z [INFO] 
2026-09-14T20:42:12.2796348Z [INFO] -----------------------< com.deque:axe-selenium >-----------------------
2026-09-14T20:42:12.2796517Z [INFO] Building aXe Selenium Integration 3.1
2026-09-14T20:42:12.2796746Z [INFO] --------------------------------[ jar ]---------------------------------
2026-09-14T20:42:12.5796618Z [WARNING] The artifact com.itextpdf:itext7-core:pom:9.1.0 has been relocated to com.itextpdf:itext-core:pom:9.1.0
2026-09-14T20:42:12.5872355Z [INFO] 
2026-09-14T20:42:12.5873924Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ axe-selenium ---
2026-09-14T20:42:12.6176860Z [INFO] 
2026-09-14T20:42:12.6177646Z [INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ axe-selenium ---
2026-09-14T20:42:12.6773386Z [INFO] Using 'UTF-8' encoding to copy filtered resources.
2026-09-14T20:42:12.6790934Z [INFO] Copying 1 resource
2026-09-14T20:42:12.6828498Z [INFO] 
2026-09-14T20:42:12.6829537Z [INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ axe-selenium ---
2026-09-14T20:42:12.7729230Z [INFO] Changes detected - recompiling the module!
2026-09-14T20:42:12.7748345Z [INFO] Compiling 9 source files to /opt/ads-agent/_work/r2/a/_AxeAutomator-ferramenta-teste/axe-automator-teste/target/classes
2026-09-14T20:42:13.5226661Z [WARNING] /opt/ads-agent/_work/r2/a/_AxeAutomator-ferramenta-teste/axe-automator-teste/src/main/java/com/deque/axe/AXE.java: /opt/ads-agent/_work/r2/a/_AxeAutomator-ferramenta-teste/axe-automator-teste/src/main/java/com/deque/axe/AXE.java uses or overrides a deprecated API.
2026-09-14T20:42:13.5228298Z [WARNING] /opt/ads-agent/_work/r2/a/_AxeAutomator-ferramenta-teste/axe-automator-teste/src/main/java/com/deque/axe/AXE.java: Recompile with -Xlint:deprecation for details.
2026-09-14T20:42:13.5229313Z [WARNING] /opt/ads-agent/_work/r2/a/_AxeAutomator-ferramenta-teste/axe-automator-teste/src/main/java/com/deque/axe/AXE.java: /opt/ads-agent/_work/r2/a/_AxeAutomator-ferramenta-teste/axe-automator-teste/src/main/java/com/deque/axe/AXE.java uses unchecked or unsafe operations.
2026-09-14T20:42:13.5230392Z [WARNING] /opt/ads-agent/_work/r2/a/_AxeAutomator-ferramenta-teste/axe-automator-teste/src/main/java/com/deque/axe/AXE.java: Recompile with -Xlint:unchecked for details.
2026-09-14T20:42:13.5230906Z [INFO] 
2026-09-14T20:42:13.5231766Z [INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ axe-selenium ---
2026-09-14T20:42:13.5241466Z [INFO] Using 'UTF-8' encoding to copy filtered resources.
2026-09-14T20:42:13.5244332Z [INFO] Copying 1 resource
2026-09-14T20:42:13.5246823Z [INFO] 
2026-09-14T20:42:13.5247227Z [INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ axe-selenium ---
2026-09-14T20:42:13.5294554Z [INFO] Nothing to compile - all classes are up to date
2026-09-14T20:42:13.5295014Z [INFO] 
2026-09-14T20:42:13.5297343Z [INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ axe-selenium ---
2026-09-14T20:42:13.5309131Z [INFO] Using 'UTF-8' encoding to copy filtered resources.
2026-09-14T20:42:13.5309968Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/r2/a/_AxeAutomator-ferramenta-teste/axe-automator-teste/src/test/resources
2026-09-14T20:42:13.5311244Z [INFO] 
2026-09-14T20:42:13.5311551Z [INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ axe-selenium ---
2026-09-14T20:42:13.5336988Z [INFO] Changes detected - recompiling the module!
2026-09-14T20:42:13.5387958Z [INFO] Compiling 2 source files to /opt/ads-agent/_work/r2/a/_AxeAutomator-ferramenta-teste/axe-automator-teste/target/test-classes
2026-09-14T20:42:13.8006757Z [INFO] 
2026-09-14T20:42:13.8007540Z [INFO] --- maven-surefire-plugin:3.5.3:test (default-cli) @ axe-selenium ---
2026-09-14T20:42:13.8820122Z [INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
2026-09-14T20:42:13.9054056Z [INFO] 
2026-09-14T20:42:13.9054597Z [INFO] -------------------------------------------------------
2026-09-14T20:42:13.9054759Z [INFO]  T E S T S
2026-09-14T20:42:13.9054970Z [INFO] -------------------------------------------------------
2026-09-14T20:42:14.2796041Z [INFO] Running com.deque.axe.AcessibilidadeTest
2026-09-14T20:42:14.3602990Z set. 14, 2026 5:42:14 PM com.deque.axe.AcessibilidadeTest setUpOnce
2026-09-14T20:42:14.3603643Z INFORMAÇÕES: Diretório de recursos configurado: /opt/ads-agent/_work/r2/a/_sicbs-qualidade/teste-acessibilidade/SICBS-frontend
2026-09-14T20:42:14.3603951Z set. 14, 2026 5:42:14 PM com.deque.axe.AcessibilidadeTest setUpOnce
2026-09-14T20:42:14.3604278Z INFORMAÇÕES: Diretório de saída configurado: /opt/ads-agent/_work/r2/a/_AxeAutomator-ferramenta-teste/axe-automator-teste/relatorios
2026-09-14T20:42:14.3604473Z set. 14, 2026 5:42:14 PM com.deque.axe.AcessibilidadeTest setUpOnce
2026-09-14T20:42:14.3604746Z INFORMAÇÕES: Diretório de saída criado: /opt/ads-agent/_work/r2/a/_AxeAutomator-ferramenta-teste/axe-automator-teste/relatorios
2026-09-14T20:42:14.3604935Z set. 14, 2026 5:42:14 PM com.deque.axe.AcessibilidadeTest setUpOnce
2026-09-14T20:42:14.3605136Z INFORMAÇÕES: Iniciando configuração inicial (setUpOnce).
2026-09-14T20:42:14.3605323Z set. 14, 2026 5:42:14 PM com.deque.axe.AcessibilidadeTest setUpOnce
2026-09-14T20:42:14.3605576Z INFORMAÇÕES: Iniciando configuração inicial (setUpOnce).
2026-09-14T20:42:14.3605990Z set. 14, 2026 5:42:14 PM com.deque.axe.AcessibilidadeTest setUpOnce
2026-09-14T20:42:14.3606237Z INFORMAÇÕES: URL do Selenium Grid configurada: https://selenium-router-selenium-grid.apps.produtos4.caixa
2026-09-14T20:42:14.3606488Z set. 14, 2026 5:42:14 PM com.deque.axe.AcessibilidadeTest setUpOnce
2026-09-14T20:42:14.3606720Z INFORMAÇÕES: URL do Selenium Grid configurada: https://selenium-router-selenium-grid.apps.produtos4.caixa
2026-09-14T20:42:14.3606898Z set. 14, 2026 5:42:14 PM com.deque.axe.DriverInitializer initializeDriver
2026-09-14T20:42:14.3607144Z INFORMAÇÕES: URL do Selenium Grid configurada: https://selenium-router-selenium-grid.apps.produtos4.caixa
2026-09-14T20:42:14.3607310Z set. 14, 2026 5:42:14 PM com.deque.axe.DriverInitializer initializeDriver
2026-09-14T20:42:14.3607644Z INFORMAÇÕES: Capacidades configuradas: Capabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 122.0, moz:firefoxOptions: {binary: /usr/bin/firefox}, platformName: linux}
2026-09-14T20:42:14.3607890Z set. 14, 2026 5:42:14 PM org.openqa.selenium.remote.tracing.opentelemetry.OpenTelemetryTracer createTracer
2026-09-14T20:42:14.3608101Z INFORMAÇÕES: Using OpenTelemetry for tracing
2026-09-14T20:42:15.9765961Z ##[debug]Agent environment resources - Disk: / Available 29494.00 MB out of 122356.00 MB, Memory: Used 26427.00 MB out of 64300.00 MB, CPU: Usage 35.26%
2026-09-14T20:42:16.4658503Z set. 14, 2026 5:42:16 PM com.deque.axe.DriverInitializer initializeDriver
2026-09-14T20:42:16.4659022Z INFORMAÇÕES: WebDriver inicializado com sucesso no Selenium Grid.
2026-09-14T20:42:16.4659193Z set. 14, 2026 5:42:16 PM com.deque.axe.AcessibilidadeTest setUpOnce
2026-09-14T20:42:16.4659386Z INFORMAÇÕES: WebDriver inicializado com sucesso.
2026-09-14T20:42:16.4659561Z set. 14, 2026 5:42:16 PM com.deque.axe.AcessibilidadeTest setUpOnce
2026-09-14T20:42:16.4659759Z INFORMAÇÕES: WebDriver inicializado com sucesso.
2026-09-14T20:42:16.4659918Z set. 14, 2026 5:42:16 PM com.deque.axe.AcessibilidadeTest setUpOnce
2026-09-14T20:42:16.4660185Z INFORMAÇÕES: URL carregada do arquivo JSON: https://sicbs-frontend-des.apps.nprd.caixa/home
2026-09-14T20:42:16.4660367Z set. 14, 2026 5:42:16 PM com.deque.axe.AcessibilidadeTest setUpOnce
2026-09-14T20:42:16.4660583Z INFORMAÇÕES: URL carregada do arquivo JSON: https://sicbs-frontend-des.apps.nprd.caixa/home
2026-09-14T20:42:16.4660749Z set. 14, 2026 5:42:16 PM com.deque.axe.AcessibilidadeTest setUpOnce
2026-09-14T20:42:16.4660949Z INFORMAÇÕES: Verificando se o login é necessário...
2026-09-14T20:42:16.4661105Z set. 14, 2026 5:42:16 PM com.deque.axe.AcessibilidadeTest setUpOnce
2026-09-14T20:42:16.4661299Z INFORMAÇÕES: Verificando se o login é necessário...
2026-09-14T20:42:16.4661744Z Carregando arquivo JSON: /opt/ads-agent/_work/r2/a/_sicbs-qualidade/teste-acessibilidade/SICBS-frontend/parametros-login.json
2026-09-14T20:42:16.4661964Z Chamada feita por: com.deque.axe.SSOLoginAutomation.performLoginIfRequired(SSOLoginAutomation.java:27)
2026-09-14T20:42:16.4662351Z URL de login construída: https://logindes.caixa.gov.br/auth/realms/internet/protocol/openid-connect/auth?response_type=code&client_id=cli-web-cbs&redirect_uri=https%3A%2F%2Fsicbs-frontend-des.apps.nprd.caixa%2Fhome&scope=openid
2026-09-14T20:42:20.9779453Z ##[debug]Agent environment resources - Disk: / Available 29492.00 MB out of 122356.00 MB, Memory: Used 26583.00 MB out of 64300.00 MB, CPU: Usage 24.17%
2026-09-14T20:42:25.9854809Z ##[debug]Agent environment resources - Disk: / Available 29471.00 MB out of 122356.00 MB, Memory: Used 25223.00 MB out of 64300.00 MB, CPU: Usage 18.38%
2026-09-14T20:42:30.9880300Z ##[debug]Agent environment resources - Disk: / Available 29459.00 MB out of 122356.00 MB, Memory: Used 24007.00 MB out of 64300.00 MB, CPU: Usage 14.84%
2026-09-14T20:42:35.9896832Z ##[debug]Agent environment resources - Disk: / Available 29470.00 MB out of 122356.00 MB, Memory: Used 24356.00 MB out of 64300.00 MB, CPU: Usage 12.46%
2026-09-14T20:42:40.9914938Z ##[debug]Agent environment resources - Disk: / Available 29369.00 MB out of 122356.00 MB, Memory: Used 24789.00 MB out of 64300.00 MB, CPU: Usage 10.77%
2026-09-14T20:42:45.9942759Z ##[debug]Agent environment resources - Disk: / Available 29427.00 MB out of 122356.00 MB, Memory: Used 24296.00 MB out of 64300.00 MB, CPU: Usage 9.45%
2026-09-14T20:42:49.5224559Z org.openqa.selenium.TimeoutException: Expected condition failed: waiting for com.deque.axe.SSOLoginAutomation$$Lambda$730/0x00007f4608314030@566d0c69 (tried for 30 second(s) with 500 milliseconds interval)
2026-09-14T20:42:49.5225181Z Build info: version: '4.11.0', revision: '040bc5406b'
2026-09-14T20:42:49.5225432Z System info: os.name: 'Linux', os.arch: 'amd64', os.version: '5.18.5-100.fc35.x86_64', java.version: '17.0.8'
2026-09-14T20:42:49.5225685Z Driver info: org.openqa.selenium.remote.RemoteWebDriver
2026-09-14T20:42:49.5235865Z Capabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 122.0, moz:accessibilityChecks: false, moz:buildID: 20240118164516, moz:firefoxOptions: {binary: /usr/bin/firefox}, moz:geckodriverVersion: 0.34.0, moz:headless: false, moz:platformVersion: 5.18.5-100.fc35.x86_64, moz:processID: 482323, moz:profile: /tmp/rust_mozprofile5aWGrL, moz:shutdownTimeout: 60000, moz:webdriverClick: true, moz:windowless: false, pageLoadStrategy: normal, platformName: linux, proxy: Proxy(), se:bidiEnabled: false, se:cdp: ws://25.3.17.221:4444/sessi..., se:noVncPort: 7900, se:vnc: ws://25.3.17.221:4444/sessi..., se:vncEnabled: true, se:vncLocalAddress: ws://25.3.17.221:7900, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}
2026-09-14T20:42:49.5236718Z Session ID: ad3acbde-1b93-41bf-b105-6a5bfff674e5
2026-09-14T20:42:49.5236902Z 	at org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:84)
2026-09-14T20:42:49.5237127Z 	at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:230)
2026-09-14T20:42:49.5237315Z 	at com.deque.axe.SSOLoginAutomation.performLoginIfRequired(SSOLoginAutomation.java:125)
2026-09-14T20:42:49.5237502Z 	at com.deque.axe.AcessibilidadeTest.setUpOnce(AcessibilidadeTest.java:123)
2026-09-14T20:42:49.5237676Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-09-14T20:42:49.5237862Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-09-14T20:42:49.5238076Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-09-14T20:42:49.5238264Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-09-14T20:42:49.5238442Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-09-14T20:42:49.5238632Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-09-14T20:42:49.5238849Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-09-14T20:42:49.5239074Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-09-14T20:42:49.5239286Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptLifecycleMethod(TimeoutExtension.java:128)
2026-09-14T20:42:49.5239505Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptBeforeAllMethod(TimeoutExtension.java:70)
2026-09-14T20:42:49.5239749Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-09-14T20:42:49.5240004Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-09-14T20:42:49.5240244Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-09-14T20:42:49.5240466Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-09-14T20:42:49.5241032Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-09-14T20:42:49.5241357Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-09-14T20:42:49.5241578Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-09-14T20:42:49.5241803Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-09-14T20:42:49.5242034Z 	at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$invokeBeforeAllMethods$13(ClassBasedTestDescriptor.java:412)
2026-09-14T20:42:49.5242264Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-09-14T20:42:49.5242483Z 	at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.invokeBeforeAllMethods(ClassBasedTestDescriptor.java:410)
2026-09-14T20:42:49.5242714Z 	at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.before(ClassBasedTestDescriptor.java:216)
2026-09-14T20:42:49.5242931Z 	at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.before(ClassBasedTestDescriptor.java:85)
2026-09-14T20:42:49.5243150Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:148)
2026-09-14T20:42:49.5243369Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-09-14T20:42:49.5243584Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-09-14T20:42:49.5243783Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-09-14T20:42:49.5244130Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-09-14T20:42:49.5244348Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-09-14T20:42:49.5244557Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-09-14T20:42:49.5244765Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-09-14T20:42:49.5244946Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
2026-09-14T20:42:49.5245162Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-09-14T20:42:49.5245411Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-09-14T20:42:49.5245622Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-09-14T20:42:49.5245861Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-09-14T20:42:49.5246060Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-09-14T20:42:49.5246257Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-09-14T20:42:49.5246467Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-09-14T20:42:49.5246672Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-09-14T20:42:49.5246873Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-09-14T20:42:49.5247097Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-09-14T20:42:49.5247337Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-09-14T20:42:49.5247675Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-09-14T20:42:49.5247968Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:198)
2026-09-14T20:42:49.5248178Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:169)
2026-09-14T20:42:49.5248389Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:93)
2026-09-14T20:42:49.5248606Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:58)
2026-09-14T20:42:49.5248832Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:141)
2026-09-14T20:42:49.5249046Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:57)
2026-09-14T20:42:49.5249245Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:103)
2026-09-14T20:42:49.5249561Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:85)
2026-09-14T20:42:49.5249773Z 	at org.junit.platform.launcher.core.DelegatingLauncher.execute(DelegatingLauncher.java:47)
2026-09-14T20:42:49.5249968Z 	at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:56)
2026-09-14T20:42:49.5250170Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:194)
2026-09-14T20:42:49.5250385Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:150)
2026-09-14T20:42:49.5250601Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:124)
2026-09-14T20:42:49.5250804Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-09-14T20:42:49.5250994Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-09-14T20:42:49.5251174Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-09-14T20:42:49.5251353Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-09-14T20:42:49.5251515Z set. 14, 2026 5:42:49 PM com.deque.axe.AcessibilidadeTest setUpOnce
2026-09-14T20:42:49.5251782Z GRAVE: Erro durante a configuração inicial (setUpOnce): Erro ao realizar o login.
2026-09-14T20:42:49.5251949Z set. 14, 2026 5:42:49 PM com.deque.axe.AcessibilidadeTest setUpOnce
2026-09-14T20:42:49.5252166Z GRAVE: Erro durante a configuração inicial (setUpOnce): Erro ao realizar o login.
2026-09-14T20:42:49.5252329Z set. 14, 2026 5:42:49 PM com.deque.axe.AcessibilidadeTest tearDownOnce
2026-09-14T20:42:49.5252530Z INFORMAÇÕES: Finalizando o WebDriver.
2026-09-14T20:42:49.5252669Z set. 14, 2026 5:42:49 PM com.deque.axe.AcessibilidadeTest tearDownOnce
2026-09-14T20:42:49.5252851Z INFORMAÇÕES: Finalizando o WebDriver.
2026-09-14T20:42:49.5253007Z set. 14, 2026 5:42:49 PM com.deque.axe.DriverInitializer quitDriver
2026-09-14T20:42:49.5253198Z INFORMAÇÕES: Finalizando o WebDriver...
2026-09-14T20:42:50.0823444Z set. 14, 2026 5:42:50 PM com.deque.axe.DriverInitializer quitDriver
2026-09-14T20:42:50.0824125Z INFORMAÇÕES: WebDriver finalizado com sucesso.
2026-09-14T20:42:50.0824296Z set. 14, 2026 5:42:50 PM com.deque.axe.AcessibilidadeTest tearDownOnce
2026-09-14T20:42:50.0824505Z INFORMAÇÕES: WebDriver finalizado com sucesso.
2026-09-14T20:42:50.0824659Z set. 14, 2026 5:42:50 PM com.deque.axe.AcessibilidadeTest tearDownOnce
2026-09-14T20:42:50.0824855Z INFORMAÇÕES: WebDriver finalizado com sucesso.
2026-09-14T20:42:50.1074218Z [ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 35.81 s <<< FAILURE! -- in com.deque.axe.AcessibilidadeTest
2026-09-14T20:42:50.1080819Z [ERROR] com.deque.axe.AcessibilidadeTest -- Time elapsed: 35.81 s <<< ERROR!
2026-09-14T20:42:50.1081113Z java.lang.RuntimeException: Erro durante a configuração inicial (setUpOnce).
2026-09-14T20:42:50.1081518Z 	at com.deque.axe.AcessibilidadeTest.setUpOnce(AcessibilidadeTest.java:132)
2026-09-14T20:42:50.1081795Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-09-14T20:42:50.1081959Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
2026-09-14T20:42:50.1082113Z Caused by: java.lang.RuntimeException: Erro ao realizar o login.
2026-09-14T20:42:50.1082277Z 	at com.deque.axe.SSOLoginAutomation.performLoginIfRequired(SSOLoginAutomation.java:136)
2026-09-14T20:42:50.1082464Z 	at com.deque.axe.AcessibilidadeTest.setUpOnce(AcessibilidadeTest.java:123)
2026-09-14T20:42:50.1082599Z 	... 2 more
2026-09-14T20:42:50.1082794Z Caused by: org.openqa.selenium.TimeoutException: Expected condition failed: waiting for com.deque.axe.SSOLoginAutomation$$Lambda$730/0x00007f4608314030@566d0c69 (tried for 30 second(s) with 500 milliseconds interval)
2026-09-14T20:42:50.1083067Z Build info: version: '4.11.0', revision: '040bc5406b'
2026-09-14T20:42:50.1083318Z System info: os.name: 'Linux', os.arch: 'amd64', os.version: '5.18.5-100.fc35.x86_64', java.version: '17.0.8'
2026-09-14T20:42:50.1083479Z Driver info: org.openqa.selenium.remote.RemoteWebDriver
2026-09-14T20:42:50.1084633Z Capabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 122.0, moz:accessibilityChecks: false, moz:buildID: 20240118164516, moz:firefoxOptions: {binary: /usr/bin/firefox}, moz:geckodriverVersion: 0.34.0, moz:headless: false, moz:platformVersion: 5.18.5-100.fc35.x86_64, moz:processID: 482323, moz:profile: /tmp/rust_mozprofile5aWGrL, moz:shutdownTimeout: 60000, moz:webdriverClick: true, moz:windowless: false, pageLoadStrategy: normal, platformName: linux, proxy: Proxy(), se:bidiEnabled: false, se:cdp: ws://25.3.17.221:4444/sessi..., se:noVncPort: 7900, se:vnc: ws://25.3.17.221:4444/sessi..., se:vncEnabled: true, se:vncLocalAddress: ws://25.3.17.221:7900, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}
2026-09-14T20:42:50.1085287Z Session ID: ad3acbde-1b93-41bf-b105-6a5bfff674e5
2026-09-14T20:42:50.1085460Z 	at org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:84)
2026-09-14T20:42:50.1085642Z 	at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:230)
2026-09-14T20:42:50.1085817Z 	at com.deque.axe.SSOLoginAutomation.performLoginIfRequired(SSOLoginAutomation.java:125)
2026-09-14T20:42:50.1085957Z 	... 3 more
2026-09-14T20:42:50.1086004Z 
2026-09-14T20:42:50.4444548Z [INFO] 
2026-09-14T20:42:50.4444713Z [INFO] Results:
2026-09-14T20:42:50.4444821Z [INFO] 
2026-09-14T20:42:50.4444919Z [ERROR] Errors: 
2026-09-14T20:42:50.4445396Z [ERROR]   AcessibilidadeTest.setUpOnce:132 Runtime Erro durante a configuração inicial (setUpOnce).
2026-09-14T20:42:50.4445547Z [INFO] 
2026-09-14T20:42:50.4445665Z [ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0
2026-09-14T20:42:50.4445775Z [INFO] 
2026-09-14T20:42:50.4468074Z [INFO] ------------------------------------------------------------------------
2026-09-14T20:42:50.4468604Z [INFO] BUILD FAILURE
2026-09-14T20:42:50.4469056Z [INFO] ------------------------------------------------------------------------
2026-09-14T20:42:50.4478672Z [INFO] Total time:  38.251 s
2026-09-14T20:42:50.4481240Z [INFO] Finished at: 2026-09-14T17:42:50-03:00
2026-09-14T20:42:50.4481921Z [INFO] ------------------------------------------------------------------------
2026-09-14T20:42:50.4488906Z [ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:3.5.3:test (default-cli) on project axe-selenium: 
2026-09-14T20:42:50.4489106Z [ERROR] 
2026-09-14T20:42:50.4489365Z [ERROR] See /opt/ads-agent/_work/r2/a/_AxeAutomator-ferramenta-teste/axe-automator-teste/target/surefire-reports for the individual test results.
2026-09-14T20:42:50.4489633Z [ERROR] See dump files (if any exist) [date].dump, [date]-jvmRun[N].dump and [date].dumpstream.
2026-09-14T20:42:50.4489807Z [ERROR] -> [Help 1]
2026-09-14T20:42:50.4490118Z [ERROR] 
2026-09-14T20:42:50.4490667Z [ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
2026-09-14T20:42:50.4492892Z [ERROR] Re-run Maven using the -X switch to enable full debug logging.
2026-09-14T20:42:50.4493021Z [ERROR] 
2026-09-14T20:42:50.4493163Z [ERROR] For more information about the errors and possible solutions, please read the following articles:
2026-09-14T20:42:50.4493332Z [ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
2026-09-14T20:42:50.4750726Z ##[debug]Exit code 1 received from tool '/opt/apache-maven/apache-maven-3.8.5/bin/mvn'
2026-09-14T20:42:50.4751279Z ##[debug]STDIO streams have closed for tool '/opt/apache-maven/apache-maven-3.8.5/bin/mvn'
2026-09-14T20:42:50.4761865Z The process '/opt/apache-maven/apache-maven-3.8.5/bin/mvn' failed with exit code 1
2026-09-14T20:42:50.4762282Z Could not retrieve code analysis results - Maven run failed.
2026-09-14T20:42:50.4764641Z ##[debug]publishCodeCoverage userRunFailed=true
2026-09-14T20:42:50.4764990Z ##[debug]task result: Failed
2026-09-14T20:42:50.4795278Z ##[error]Build failed.
2026-09-14T20:42:50.4800806Z ##[debug]Processed: ##vso[task.issue type=error;]Build failed.
2026-09-14T20:42:50.4801762Z ##[debug]Processed: ##vso[task.complete result=Failed;]Build failed.
2026-09-14T20:42:50.4832727Z ##[section]Finishing: Task Maven
