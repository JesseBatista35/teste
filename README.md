
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc -n selenium-grid get dc firefox -o yaml | grep -iE 'argocd|helm|managed-by|last-applied|app.kubernetes.io/instance'
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$


<img width="1815" height="868" alt="image" src="https://github.com/user-attachments/assets/8e0ad172-3df1-46fd-bed4-1ea5bb3cc1fc" />



2026-09-22T22:41:01.0117671Z ##[debug]Evaluating condition for step: 'Task Maven'
2026-09-22T22:41:01.0118238Z ##[debug]Evaluating: succeeded()
2026-09-22T22:41:01.0118412Z ##[debug]Evaluating succeeded:
2026-09-22T22:41:01.0118718Z ##[debug]=> True
2026-09-22T22:41:01.0118891Z ##[debug]Result: True
2026-09-22T22:41:01.0119055Z ##[section]Starting: Task Maven
2026-09-22T22:41:01.0123674Z ==============================================================================
2026-09-22T22:41:01.0123759Z Task         : Maven
2026-09-22T22:41:01.0123808Z Description  : Build, test, and deploy with Apache Maven
2026-09-22T22:41:01.0123882Z Version      : 3.225.0
2026-09-22T22:41:01.0123928Z Author       : Microsoft Corporation
2026-09-22T22:41:01.0123983Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/build/maven
2026-09-22T22:41:01.0124065Z ==============================================================================
2026-09-22T22:41:01.0678918Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-09-22T22:41:01.1372643Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-09-22T22:41:01.1380523Z ##[debug]loading inputs and endpoints
2026-09-22T22:41:01.1385757Z ##[debug]loading INPUT_MAVENPOMFILE
2026-09-22T22:41:01.1393392Z ##[debug]loading INPUT_GOALS
2026-09-22T22:41:01.1393988Z ##[debug]loading INPUT_OPTIONS
2026-09-22T22:41:01.1394884Z ##[debug]loading INPUT_PUBLISHJUNITRESULTS
2026-09-22T22:41:01.1395406Z ##[debug]loading INPUT_TESTRESULTSFILES
2026-09-22T22:41:01.1396398Z ##[debug]loading INPUT_ALLOWBROKENSYMBOLICLINKS
2026-09-22T22:41:01.1396921Z ##[debug]loading INPUT_CODECOVERAGETOOL
2026-09-22T22:41:01.1398991Z ##[debug]loading INPUT_FAILIFCOVERAGEEMPTY
2026-09-22T22:41:01.1399504Z ##[debug]loading INPUT_RESTOREORIGINALPOMXML
2026-09-22T22:41:01.1400779Z ##[debug]loading INPUT_JAVAHOMESELECTION
2026-09-22T22:41:01.1402113Z ##[debug]loading INPUT_JDKVERSION
2026-09-22T22:41:01.1403859Z ##[debug]loading INPUT_JDKUSERINPUTPATH
2026-09-22T22:41:01.1405215Z ##[debug]loading INPUT_JDKARCHITECTURE
2026-09-22T22:41:01.1406315Z ##[debug]loading INPUT_MAVENVERSIONSELECTION
2026-09-22T22:41:01.1406867Z ##[debug]loading INPUT_MAVENSETM2HOME
2026-09-22T22:41:01.1407449Z ##[debug]loading INPUT_MAVENOPTS
2026-09-22T22:41:01.1407944Z ##[debug]loading INPUT_MAVENFEEDAUTHENTICATE
2026-09-22T22:41:01.1408448Z ##[debug]loading INPUT_SKIPEFFECTIVEPOM
2026-09-22T22:41:01.1408925Z ##[debug]loading INPUT_SQANALYSISENABLED
2026-09-22T22:41:01.1409406Z ##[debug]loading INPUT_ISJACOCOCOVERAGEREPORTXML
2026-09-22T22:41:01.1410579Z ##[debug]loading INPUT_SQMAVENPLUGINVERSIONCHOICE
2026-09-22T22:41:01.1410938Z ##[debug]loading INPUT_CHECKSTYLEANALYSISENABLED
2026-09-22T22:41:01.1411508Z ##[debug]loading INPUT_PMDANALYSISENABLED
2026-09-22T22:41:01.1411943Z ##[debug]loading INPUT_FINDBUGSANALYSISENABLED
2026-09-22T22:41:01.1413138Z ##[debug]loading INPUT_SPOTBUGSANALYSISENABLED
2026-09-22T22:41:01.1413468Z ##[debug]loading INPUT_SPOTBUGSMAVENPLUGINVERSION
2026-09-22T22:41:01.1413975Z ##[debug]loading INPUT_SPOTBUGSGOAL
2026-09-22T22:41:01.1414347Z ##[debug]loading INPUT_SPOTBUGSFAILWHENBUGSFOUND
2026-09-22T22:41:01.1414950Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-09-22T22:41:01.1415420Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-09-22T22:41:01.1415877Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-09-22T22:41:01.1420436Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-09-22T22:41:01.1420937Z ##[debug]loading SECRET_FORTIFY_UPTOKEN
2026-09-22T22:41:01.1421558Z ##[debug]loading SECRET_AZPAT
2026-09-22T22:41:01.1422880Z ##[debug]loading SECRET_SCANCENTRAL_CLIENTTOKEN
2026-09-22T22:41:01.1423272Z ##[debug]loading SECRET_FORTIFY_TOKEN
2026-09-22T22:41:01.1423807Z ##[debug]loading SECRET_TOKEN_CRQ
2026-09-22T22:41:01.1424252Z ##[debug]loading SECRET_FORTIFY_PASS
2026-09-22T22:41:01.1424776Z ##[debug]loading SECRET_SCANCENTRAL_SSCCITOKEN
2026-09-22T22:41:01.1425230Z ##[debug]loading SECRET_FORTIFY_REGISTRY_PASSWORD
2026-09-22T22:41:01.1425785Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-09-22T22:41:01.1426358Z ##[debug]loading SECRET_FORTIFY_CLIENT_AUTH_TOKEN
2026-09-22T22:41:01.1426726Z ##[debug]loading SECRET_FORTIFY_CI_TOKEN
2026-09-22T22:41:01.1427299Z ##[debug]loading SECRET_DB_PASSWORD
2026-09-22T22:41:01.1427779Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-09-22T22:41:01.1428442Z ##[debug]loading SECRET_NEXUS_INTERNO_PASS
2026-09-22T22:41:01.1428774Z ##[debug]loading SECRET_KEYSTORE_PWD
2026-09-22T22:41:01.1429144Z ##[debug]loaded 47
2026-09-22T22:41:01.1435753Z ##[debug]Agent.ProxyUrl=http://proxynuvem.caixa:80
2026-09-22T22:41:01.1436009Z ##[debug]Agent.ProxyUsername=undefined
2026-09-22T22:41:01.1436253Z ##[debug]Agent.ProxyPassword=undefined
2026-09-22T22:41:01.1436566Z ##[debug]Agent.ProxyBypassList=["\\.caixa","\\.caixa\\.gov\\.br","\\.corecaixa","\\.local","localhost","10\\.0\\.0\\.0/8","25\\.0\\.0\\.0/8","cadsvgerlx080\\.intra\\.caixa\\.gov\\.br","10\\.122\\.146\\.248","mirrors\\.fedoraproject\\.org","packages\\.microsoft\\.com"]
2026-09-22T22:41:01.1436907Z ##[debug]expose agent proxy configuration.
2026-09-22T22:41:01.1437140Z ##[debug]Agent.CAInfo=undefined
2026-09-22T22:41:01.1437357Z ##[debug]Agent.ClientCert=undefined
2026-09-22T22:41:01.1437583Z ##[debug]Agent.SkipCertValidation=True
2026-09-22T22:41:01.2152453Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.225.0/node_modules/azure-pipelines-tasks-codecoverage-tools/module.json
2026-09-22T22:41:01.2153341Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.225.0/node_modules/azure-pipelines-tasks-codecoverage-tools/module.json
2026-09-22T22:41:01.2153652Z ##[debug]system.culture=en-US
2026-09-22T22:41:01.2170550Z ##[debug]Resource file has already set to: /opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.225.0/node_modules/azure-pipelines-tasks-codecoverage-tools/module.json
2026-09-22T22:41:01.2174122Z ##[debug]Resource file has already set to: /opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.225.0/node_modules/azure-pipelines-tasks-codecoverage-tools/module.json
2026-09-22T22:41:01.2177355Z ##[debug]Resource file has already set to: /opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.225.0/node_modules/azure-pipelines-tasks-codecoverage-tools/module.json
2026-09-22T22:41:01.2182985Z ##[debug]Resource file has already set to: /opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.225.0/node_modules/azure-pipelines-tasks-codecoverage-tools/module.json
2026-09-22T22:41:01.2186707Z ##[debug]Resource file has already set to: /opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.225.0/node_modules/azure-pipelines-tasks-codecoverage-tools/module.json
2026-09-22T22:41:01.2350283Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.225.0/node_modules/azure-pipelines-tasks-java-common/lib.json
2026-09-22T22:41:01.2350979Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.225.0/node_modules/azure-pipelines-tasks-java-common/lib.json
2026-09-22T22:41:01.2351280Z ##[debug]system.culture=en-US
2026-09-22T22:41:01.5391909Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.225.0/task.json
2026-09-22T22:41:01.5392335Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Maven_ac4ee482-65da-4485-a532-7b085873e532/3.225.0/task.json
2026-09-22T22:41:01.5392623Z ##[debug]system.culture=en-US
2026-09-22T22:41:01.5400842Z ##[debug]mavenPOMFile=/opt/ads-agent/_work/r1/a/_AxeAutomator-ferramenta-teste/axe-automator-teste/pom.xml
2026-09-22T22:41:01.5401156Z ##[debug]check path : /opt/ads-agent/_work/r1/a/_AxeAutomator-ferramenta-teste/axe-automator-teste/pom.xml
2026-09-22T22:41:01.5402582Z ##[debug]javaHomeSelection=JDKVersion
2026-09-22T22:41:01.5403472Z ##[debug]mavenVersionSelection=Default
2026-09-22T22:41:01.5404052Z ##[debug]goals=clean compile test-compile org.apache.maven.plugins:maven-surefire-plugin:3.5.3:test
2026-09-22T22:41:01.5404936Z ##[debug]options=-Dtest.resources.dir=/opt/ads-agent/_work/r1/a/_sicbs-qualidade/teste-acessibilidade/SICBS-frontend -Dtest.output.dir=/opt/ads-agent/_work/r1/a/_AxeAutomator-ferramenta-teste/axe-automator-teste/relatorios -Dselenium.grid.url=https://selenium-router-selenium-grid.apps.produtos4.caixa
2026-09-22T22:41:01.5405455Z ##[debug]publishJUnitResults=false
2026-09-22T22:41:01.5406663Z ##[debug]testResultsFiles=/opt/ads-agent/_work/r1/a/**/surefire-reports/TEST-*.xml
2026-09-22T22:41:01.5407048Z ##[debug]codeCoverageTool=None
2026-09-22T22:41:01.5407642Z ##[debug]mavenFeedAuthenticate=false
2026-09-22T22:41:01.5408134Z ##[debug]skipEffectivePom=false
2026-09-22T22:41:01.5408563Z ##[debug]failIfCoverageEmpty=false
2026-09-22T22:41:01.5409110Z ##[debug]restoreOriginalPomXml=false
2026-09-22T22:41:01.5410168Z ##[debug]spotBugsAnalysisEnabled=false
2026-09-22T22:41:01.5410493Z ##[debug]spotBugsGoal=spotbugs
2026-09-22T22:41:01.5410850Z ##[debug]spotBugsFailWhenBugsFound=true
2026-09-22T22:41:01.5411111Z ##[debug]System.DefaultWorkingDirectory=/opt/ads-agent/_work/r1/a
2026-09-22T22:41:01.5412446Z ##[debug]M2_HOME=/opt/apache-maven/apache-maven-3.8.5
2026-09-22T22:41:01.5412718Z ##[debug]Using M2_HOME environment variable value for Maven path: /opt/apache-maven/apache-maven-3.8.5
2026-09-22T22:41:01.5412992Z ##[debug]check path : /opt/apache-maven/apache-maven-3.8.5/bin/mvn
2026-09-22T22:41:01.5413258Z ##[debug]Maven executable: /opt/apache-maven/apache-maven-3.8.5/bin/mvn
2026-09-22T22:41:01.5413510Z ##[debug]Using the specified JDK version to find and set JAVA_HOME
2026-09-22T22:41:01.5413751Z ##[debug]jdkVersion=default
2026-09-22T22:41:01.5413979Z ##[debug]jdkArchitecture=x86
2026-09-22T22:41:01.5414481Z ##[debug]Agent.Version=3.236.1
2026-09-22T22:41:01.5630704Z ##[debug]Processed: ##vso[telemetry.publish area=TaskHub;feature=Maven]{"jdkVersion":"default"}
2026-09-22T22:41:01.5631334Z ##[debug]Enabled code coverage successfully
2026-09-22T22:41:01.5631617Z ##[debug]which '/opt/apache-maven/apache-maven-3.8.5/bin/mvn'
2026-09-22T22:41:01.5632085Z ##[debug]found: '/opt/apache-maven/apache-maven-3.8.5/bin/mvn'
2026-09-22T22:41:01.5632365Z ##[debug]/opt/apache-maven/apache-maven-3.8.5/bin/mvn arg: -version
2026-09-22T22:41:01.5632613Z ##[debug]mavenOpts=-Xmx1024m
2026-09-22T22:41:01.5632839Z ##[debug]MAVEN_OPTS is now set to -Xmx1024m
2026-09-22T22:41:01.5633091Z ##[debug]exec tool: /opt/apache-maven/apache-maven-3.8.5/bin/mvn
2026-09-22T22:41:01.5633325Z ##[debug]arguments:
2026-09-22T22:41:01.5633531Z ##[debug]   -version
2026-09-22T22:41:01.5634034Z [command]/opt/apache-maven/apache-maven-3.8.5/bin/mvn -version
2026-09-22T22:41:01.6834870Z Apache Maven 3.8.5 (3599d3414f046de2324203b78ddcf9b5e4388aa0)
2026-09-22T22:41:01.6835346Z Maven home: /opt/apache-maven/apache-maven-3.8.5
2026-09-22T22:41:01.6835569Z Java version: 17.0.8, vendor: OpenLogic, runtime: /usr/java/open-jdk-17.0.8
2026-09-22T22:41:01.6835924Z Default locale: pt_BR, platform encoding: UTF-8
2026-09-22T22:41:01.6836153Z OS name: "linux", version: "5.18.5-100.fc35.x86_64", arch: "amd64", family: "unix"
2026-09-22T22:41:01.6981581Z ##[debug]Exit code 0 received from tool '/opt/apache-maven/apache-maven-3.8.5/bin/mvn'
2026-09-22T22:41:01.6986403Z ##[debug]STDIO streams have closed for tool '/opt/apache-maven/apache-maven-3.8.5/bin/mvn'
2026-09-22T22:41:01.6988822Z ##[debug]Built-in Maven feed authentication is disabled
2026-09-22T22:41:01.6992504Z ##[debug]which '/opt/apache-maven/apache-maven-3.8.5/bin/mvn'
2026-09-22T22:41:01.6992763Z ##[debug]found: '/opt/apache-maven/apache-maven-3.8.5/bin/mvn'
2026-09-22T22:41:01.6993046Z ##[debug]/opt/apache-maven/apache-maven-3.8.5/bin/mvn arg: -f
2026-09-22T22:41:01.6993357Z ##[debug]/opt/apache-maven/apache-maven-3.8.5/bin/mvn arg: /opt/ads-agent/_work/r1/a/_AxeAutomator-ferramenta-teste/axe-automator-teste/pom.xml
2026-09-22T22:41:01.6993791Z ##[debug]/opt/apache-maven/apache-maven-3.8.5/bin/mvn arg: -Dtest.resources.dir=/opt/ads-agent/_work/r1/a/_sicbs-qualidade/teste-acessibilidade/SICBS-frontend -Dtest.output.dir=/opt/ads-agent/_work/r1/a/_AxeAutomator-ferramenta-teste/axe-automator-teste/relatorios -Dselenium.grid.url=https://selenium-router-selenium-grid.apps.produtos4.caixa
2026-09-22T22:41:01.6995319Z ##[debug]/opt/apache-maven/apache-maven-3.8.5/bin/mvn arg: ["clean","compile","test-compile","org.apache.maven.plugins:maven-surefire-plugin:3.5.3:test"]
2026-09-22T22:41:01.6996484Z ##[debug]isJacocoCoverageReportXML=false
2026-09-22T22:41:01.6996951Z ##[debug]sqAnalysisEnabled=false
2026-09-22T22:41:01.6998848Z ##[debug]System.DefaultWorkingDirectory=/opt/ads-agent/_work/r1/a
2026-09-22T22:41:01.6999195Z ##[debug]build.artifactStagingDirectory=undefined
2026-09-22T22:41:01.6999406Z Code analysis is disabled outside of the build environment. Could not find a value for: build.artifactStagingDirectory
2026-09-22T22:41:01.6999821Z ##[debug]Getting credentials for local feeds
2026-09-22T22:41:01.7000915Z ##[debug]SYSTEMVSSCONNECTION exists true
2026-09-22T22:41:01.7001232Z ##[debug]Got auth token
2026-09-22T22:41:01.7007947Z ##[debug]exec tool: /opt/apache-maven/apache-maven-3.8.5/bin/mvn
2026-09-22T22:41:01.7008186Z ##[debug]arguments:
2026-09-22T22:41:01.7008408Z ##[debug]   -f
2026-09-22T22:41:01.7008663Z ##[debug]   /opt/ads-agent/_work/r1/a/_AxeAutomator-ferramenta-teste/axe-automator-teste/pom.xml
2026-09-22T22:41:01.7008958Z ##[debug]   -Dtest.resources.dir=/opt/ads-agent/_work/r1/a/_sicbs-qualidade/teste-acessibilidade/SICBS-frontend
2026-09-22T22:41:01.7009266Z ##[debug]   -Dtest.output.dir=/opt/ads-agent/_work/r1/a/_AxeAutomator-ferramenta-teste/axe-automator-teste/relatorios
2026-09-22T22:41:01.7009560Z ##[debug]   -Dselenium.grid.url=https://selenium-router-selenium-grid.apps.produtos4.caixa
2026-09-22T22:41:01.7009810Z ##[debug]   clean
2026-09-22T22:41:01.7010013Z ##[debug]   compile
2026-09-22T22:41:01.7010226Z ##[debug]   test-compile
2026-09-22T22:41:01.7010470Z ##[debug]   org.apache.maven.plugins:maven-surefire-plugin:3.5.3:test
2026-09-22T22:41:01.7011465Z [command]/opt/apache-maven/apache-maven-3.8.5/bin/mvn -f /opt/ads-agent/_work/r1/a/_AxeAutomator-ferramenta-teste/axe-automator-teste/pom.xml -Dtest.resources.dir=/opt/ads-agent/_work/r1/a/_sicbs-qualidade/teste-acessibilidade/SICBS-frontend -Dtest.output.dir=/opt/ads-agent/_work/r1/a/_AxeAutomator-ferramenta-teste/axe-automator-teste/relatorios -Dselenium.grid.url=https://selenium-router-selenium-grid.apps.produtos4.caixa clean compile test-compile org.apache.maven.plugins:maven-surefire-plugin:3.5.3:test
2026-09-22T22:41:02.3652694Z [INFO] Scanning for projects...
2026-09-22T22:41:02.4399229Z [INFO] 
2026-09-22T22:41:02.4399797Z [INFO] -----------------------< com.deque:axe-selenium >-----------------------
2026-09-22T22:41:02.4400777Z [INFO] Building aXe Selenium Integration 3.1
2026-09-22T22:41:02.4401350Z [INFO] --------------------------------[ jar ]---------------------------------
2026-09-22T22:41:02.7413033Z [WARNING] The artifact com.itextpdf:itext7-core:pom:9.1.0 has been relocated to com.itextpdf:itext-core:pom:9.1.0
2026-09-22T22:41:02.7491555Z [INFO] 
2026-09-22T22:41:02.7493008Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ axe-selenium ---
2026-09-22T22:41:02.7794478Z [INFO] 
2026-09-22T22:41:02.7795012Z [INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ axe-selenium ---
2026-09-22T22:41:02.8606290Z [INFO] Using 'UTF-8' encoding to copy filtered resources.
2026-09-22T22:41:02.8626828Z [INFO] Copying 1 resource
2026-09-22T22:41:02.8667392Z [INFO] 
2026-09-22T22:41:02.8668317Z [INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ axe-selenium ---
2026-09-22T22:41:02.9729202Z [INFO] Changes detected - recompiling the module!
2026-09-22T22:41:02.9748640Z [INFO] Compiling 9 source files to /opt/ads-agent/_work/r1/a/_AxeAutomator-ferramenta-teste/axe-automator-teste/target/classes
2026-09-22T22:41:03.7265264Z [WARNING] /opt/ads-agent/_work/r1/a/_AxeAutomator-ferramenta-teste/axe-automator-teste/src/main/java/com/deque/axe/AXE.java: /opt/ads-agent/_work/r1/a/_AxeAutomator-ferramenta-teste/axe-automator-teste/src/main/java/com/deque/axe/AXE.java uses or overrides a deprecated API.
2026-09-22T22:41:03.7266187Z [WARNING] /opt/ads-agent/_work/r1/a/_AxeAutomator-ferramenta-teste/axe-automator-teste/src/main/java/com/deque/axe/AXE.java: Recompile with -Xlint:deprecation for details.
2026-09-22T22:41:03.7266708Z [WARNING] /opt/ads-agent/_work/r1/a/_AxeAutomator-ferramenta-teste/axe-automator-teste/src/main/java/com/deque/axe/AXE.java: /opt/ads-agent/_work/r1/a/_AxeAutomator-ferramenta-teste/axe-automator-teste/src/main/java/com/deque/axe/AXE.java uses unchecked or unsafe operations.
2026-09-22T22:41:03.7267114Z [WARNING] /opt/ads-agent/_work/r1/a/_AxeAutomator-ferramenta-teste/axe-automator-teste/src/main/java/com/deque/axe/AXE.java: Recompile with -Xlint:unchecked for details.
2026-09-22T22:41:03.7267273Z [INFO] 
2026-09-22T22:41:03.7267482Z [INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ axe-selenium ---
2026-09-22T22:41:03.7282644Z [INFO] Using 'UTF-8' encoding to copy filtered resources.
2026-09-22T22:41:03.7284638Z [INFO] Copying 1 resource
2026-09-22T22:41:03.7285841Z [INFO] 
2026-09-22T22:41:03.7286241Z [INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ axe-selenium ---
2026-09-22T22:41:03.7385630Z [INFO] Nothing to compile - all classes are up to date
2026-09-22T22:41:03.7385885Z [INFO] 
2026-09-22T22:41:03.7386115Z [INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ axe-selenium ---
2026-09-22T22:41:03.7400285Z [INFO] Using 'UTF-8' encoding to copy filtered resources.
2026-09-22T22:41:03.7400683Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/r1/a/_AxeAutomator-ferramenta-teste/axe-automator-teste/src/test/resources
2026-09-22T22:41:03.7401309Z [INFO] 
2026-09-22T22:41:03.7401726Z [INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ axe-selenium ---
2026-09-22T22:41:03.7429233Z [INFO] Changes detected - recompiling the module!
2026-09-22T22:41:03.7430489Z [INFO] Compiling 2 source files to /opt/ads-agent/_work/r1/a/_AxeAutomator-ferramenta-teste/axe-automator-teste/target/test-classes
2026-09-22T22:41:03.9934556Z [INFO] 
2026-09-22T22:41:03.9935155Z [INFO] --- maven-surefire-plugin:3.5.3:test (default-cli) @ axe-selenium ---
2026-09-22T22:41:04.0744815Z [INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
2026-09-22T22:41:04.0992850Z [INFO] 
2026-09-22T22:41:04.0993757Z [INFO] -------------------------------------------------------
2026-09-22T22:41:04.0993931Z [INFO]  T E S T S
2026-09-22T22:41:04.0994116Z [INFO] -------------------------------------------------------
2026-09-22T22:41:04.4856212Z [INFO] Running com.deque.axe.AcessibilidadeTest
2026-09-22T22:41:04.5678040Z set. 22, 2026 7:41:04 PM com.deque.axe.AcessibilidadeTest setUpOnce
2026-09-22T22:41:04.5678724Z INFORMAÇÕES: Diretório de recursos configurado: /opt/ads-agent/_work/r1/a/_sicbs-qualidade/teste-acessibilidade/SICBS-frontend
2026-09-22T22:41:04.5679247Z set. 22, 2026 7:41:04 PM com.deque.axe.AcessibilidadeTest setUpOnce
2026-09-22T22:41:04.5679562Z INFORMAÇÕES: Diretório de saída configurado: /opt/ads-agent/_work/r1/a/_AxeAutomator-ferramenta-teste/axe-automator-teste/relatorios
2026-09-22T22:41:04.5679759Z set. 22, 2026 7:41:04 PM com.deque.axe.AcessibilidadeTest setUpOnce
2026-09-22T22:41:04.5680027Z INFORMAÇÕES: Diretório de saída criado: /opt/ads-agent/_work/r1/a/_AxeAutomator-ferramenta-teste/axe-automator-teste/relatorios
2026-09-22T22:41:04.5680214Z set. 22, 2026 7:41:04 PM com.deque.axe.AcessibilidadeTest setUpOnce
2026-09-22T22:41:04.5680414Z INFORMAÇÕES: Iniciando configuração inicial (setUpOnce).
2026-09-22T22:41:04.5680570Z set. 22, 2026 7:41:04 PM com.deque.axe.AcessibilidadeTest setUpOnce
2026-09-22T22:41:04.5680771Z INFORMAÇÕES: Iniciando configuração inicial (setUpOnce).
2026-09-22T22:41:04.5680920Z set. 22, 2026 7:41:04 PM com.deque.axe.AcessibilidadeTest setUpOnce
2026-09-22T22:41:04.5681169Z INFORMAÇÕES: URL do Selenium Grid configurada: https://selenium-router-selenium-grid.apps.produtos4.caixa
2026-09-22T22:41:04.5681444Z set. 22, 2026 7:41:04 PM com.deque.axe.AcessibilidadeTest setUpOnce
2026-09-22T22:41:04.5681678Z INFORMAÇÕES: URL do Selenium Grid configurada: https://selenium-router-selenium-grid.apps.produtos4.caixa
2026-09-22T22:41:04.5681936Z set. 22, 2026 7:41:04 PM com.deque.axe.DriverInitializer initializeDriver
2026-09-22T22:41:04.5682187Z INFORMAÇÕES: URL do Selenium Grid configurada: https://selenium-router-selenium-grid.apps.produtos4.caixa
2026-09-22T22:41:04.5682356Z set. 22, 2026 7:41:04 PM com.deque.axe.DriverInitializer initializeDriver
2026-09-22T22:41:04.5682758Z INFORMAÇÕES: Capacidades configuradas: Capabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 122.0, moz:firefoxOptions: {binary: /usr/bin/firefox}, platformName: linux}
2026-09-22T22:41:04.5683096Z set. 22, 2026 7:41:04 PM org.openqa.selenium.remote.tracing.opentelemetry.OpenTelemetryTracer createTracer
2026-09-22T22:41:04.5683323Z INFORMAÇÕES: Using OpenTelemetry for tracing
2026-09-22T22:41:05.9756692Z ##[debug]Agent environment resources - Disk: / Available 60723.00 MB out of 122356.00 MB, Memory: Used 8832.00 MB out of 64399.00 MB, CPU: Usage 36.22%
2026-09-22T22:41:06.5691874Z set. 22, 2026 7:41:06 PM com.deque.axe.DriverInitializer initializeDriver
2026-09-22T22:41:06.5692419Z INFORMAÇÕES: WebDriver inicializado com sucesso no Selenium Grid.
2026-09-22T22:41:06.5692612Z set. 22, 2026 7:41:06 PM com.deque.axe.AcessibilidadeTest setUpOnce
2026-09-22T22:41:06.5692812Z INFORMAÇÕES: WebDriver inicializado com sucesso.
2026-09-22T22:41:06.5692967Z set. 22, 2026 7:41:06 PM com.deque.axe.AcessibilidadeTest setUpOnce
2026-09-22T22:41:06.5693165Z INFORMAÇÕES: WebDriver inicializado com sucesso.
2026-09-22T22:41:06.5693321Z set. 22, 2026 7:41:06 PM com.deque.axe.AcessibilidadeTest setUpOnce
2026-09-22T22:41:06.5693549Z INFORMAÇÕES: URL carregada do arquivo JSON: https://sicbs-frontend-des.apps.nprd.caixa/home
2026-09-22T22:41:06.5693753Z set. 22, 2026 7:41:06 PM com.deque.axe.AcessibilidadeTest setUpOnce
2026-09-22T22:41:06.5693979Z INFORMAÇÕES: URL carregada do arquivo JSON: https://sicbs-frontend-des.apps.nprd.caixa/home
2026-09-22T22:41:06.5694146Z set. 22, 2026 7:41:06 PM com.deque.axe.AcessibilidadeTest setUpOnce
2026-09-22T22:41:06.5694343Z INFORMAÇÕES: Verificando se o login é necessário...
2026-09-22T22:41:06.5694486Z set. 22, 2026 7:41:06 PM com.deque.axe.AcessibilidadeTest setUpOnce
2026-09-22T22:41:06.5694682Z INFORMAÇÕES: Verificando se o login é necessário...
2026-09-22T22:41:06.5694944Z Carregando arquivo JSON: /opt/ads-agent/_work/r1/a/_sicbs-qualidade/teste-acessibilidade/SICBS-frontend/parametros-login.json
2026-09-22T22:41:06.5695153Z Chamada feita por: com.deque.axe.SSOLoginAutomation.performLoginIfRequired(SSOLoginAutomation.java:34)
2026-09-22T22:41:06.5695545Z [SSO] URL de login construída: https://logindes.caixa.gov.br/auth/realms/internet/protocol/openid-connect/auth?response_type=code&client_id=cli-web-cbs&redirect_uri=https%3A%2F%2Fsicbs-frontend-des.apps.nprd.caixa%2Fhome&scope=openid
2026-09-22T22:41:06.9698990Z [SSO] URL atual após abrir login: https://logindes.caixa.gov.br/auth/realms/internet/protocol/openid-connect/auth?response_type=code&client_id=cli-web-cbs&redirect_uri=https%3A%2F%2Fsicbs-frontend-des.apps.nprd.caixa%2Fhome&scope=openid
2026-09-22T22:41:07.0699554Z [SSO] Título: Login CAIXA - Informe seu CPF
2026-09-22T22:41:07.0699810Z [SSO] Campo CPF encontrado
2026-09-22T22:41:07.2702618Z [SSO] Botão avançar encontrado
2026-09-22T22:41:08.4724130Z [SSO] Campo senha encontrado
2026-09-22T22:41:08.5725800Z [SSO] Botão Entrar encontrado
2026-09-22T22:41:10.9779836Z ##[debug]Agent environment resources - Disk: / Available 60722.00 MB out of 122356.00 MB, Memory: Used 8813.00 MB out of 64399.00 MB, CPU: Usage 24.90%
2026-09-22T22:41:12.4781205Z [SSO] Falha na etapa: BOTAO_ENTRAR
2026-09-22T22:41:12.4782114Z [SSO] URL atual: https://logindes.caixa.gov.br/auth/realms/internet/login-actions/authenticate?execution=939b3be6-f791-489f-a749-a2a9dfcdaecd&client_id=cli-web-cbs&tab_id=ty9hCfmC_Q8
2026-09-22T22:41:12.4782650Z [SSO] Título atual: Login CAIXA - Informe sua senha
2026-09-22T22:41:12.4782846Z [SSO] Primeiros 1000 caracteres da página:
2026-09-22T22:41:12.4783004Z <html lang="pt-BR"><head>
2026-09-22T22:41:12.4783134Z     <meta charset="utf-8">
2026-09-22T22:41:12.4783317Z     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
2026-09-22T22:41:12.4783548Z     <meta name="robots" content="noindex, nofollow">
2026-09-22T22:41:12.4783753Z 	<meta http-equiv="X-UA-Compatible" content="IE=Edge">	
2026-09-22T22:41:12.4783815Z 
2026-09-22T22:41:12.4784004Z             <meta name="viewport" content="width=device-width,initial-scale=1">
2026-09-22T22:41:12.4784213Z     <title>      Login CAIXA - Informe sua senha
2026-09-22T22:41:12.4784395Z </title>
2026-09-22T22:41:12.4784538Z     <link rel="icon" href="/auth/resources/7.3.3.ga/login/LoginCaixa2Passos/images/icons/favicon.ico">
2026-09-22T22:41:12.4784858Z             <link href="/auth/resources/7.3.3.ga/login/LoginCaixa2Passos/css/main.css?version=4" rel="stylesheet" type="text/css">
2026-09-22T22:41:12.4785124Z             <link href="/auth/resources/7.3.3.ga/login/LoginCaixa2Passos/fonts/fsso/fsso.css" rel="stylesheet" type="text/css">
2026-09-22T22:41:12.4785218Z 
2026-09-22T22:41:12.4785660Z             <script async="" src="https://cdn.perfdrive.com/aperture/aperture.js"></script><script src="/auth/resources/7.3.3.ga/login/LoginCaixa2Passos/vendor/jquery/jquery-3.5.0.min.js" type="text/javascript"></script>
2026-09-22T22:41:12.4785871Z             <script src="/auth/resources/7.
2026-09-22T22:41:12.4786034Z set. 22, 2026 7:41:12 PM com.deque.axe.AcessibilidadeTest setUpOnce
2026-09-22T22:41:12.4786378Z GRAVE: Erro durante a configuração inicial (setUpOnce): Erro ao realizar login. Etapa: BOTAO_ENTRAR
2026-09-22T22:41:12.5783106Z set. 22, 2026 7:41:12 PM com.deque.axe.AcessibilidadeTest setUpOnce
2026-09-22T22:41:12.5783702Z GRAVE: Erro durante a configuração inicial (setUpOnce): Erro ao realizar login. Etapa: BOTAO_ENTRAR
2026-09-22T22:41:12.5783910Z set. 22, 2026 7:41:12 PM com.deque.axe.AcessibilidadeTest tearDownOnce
2026-09-22T22:41:12.5784098Z INFORMAÇÕES: Finalizando o WebDriver.
2026-09-22T22:41:12.5784254Z set. 22, 2026 7:41:12 PM com.deque.axe.AcessibilidadeTest tearDownOnce
2026-09-22T22:41:12.5784441Z INFORMAÇÕES: Finalizando o WebDriver.
2026-09-22T22:41:12.5784585Z set. 22, 2026 7:41:12 PM com.deque.axe.DriverInitializer quitDriver
2026-09-22T22:41:12.5784776Z INFORMAÇÕES: Finalizando o WebDriver...
2026-09-22T22:41:13.8739229Z set. 22, 2026 7:41:13 PM com.deque.axe.DriverInitializer quitDriver
2026-09-22T22:41:13.8739800Z INFORMAÇÕES: WebDriver finalizado com sucesso.
2026-09-22T22:41:13.8739963Z set. 22, 2026 7:41:13 PM com.deque.axe.AcessibilidadeTest tearDownOnce
2026-09-22T22:41:13.8740176Z INFORMAÇÕES: WebDriver finalizado com sucesso.
2026-09-22T22:41:13.8740333Z set. 22, 2026 7:41:13 PM com.deque.axe.AcessibilidadeTest tearDownOnce
2026-09-22T22:41:13.8740813Z INFORMAÇÕES: WebDriver finalizado com sucesso.
2026-09-22T22:41:13.9016271Z [ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 9.393 s <<< FAILURE! -- in com.deque.axe.AcessibilidadeTest
2026-09-22T22:41:13.9017715Z [ERROR] com.deque.axe.AcessibilidadeTest -- Time elapsed: 9.393 s <<< ERROR!
2026-09-22T22:41:13.9017963Z java.lang.RuntimeException: Erro durante a configuração inicial (setUpOnce).
2026-09-22T22:41:13.9018180Z 	at com.deque.axe.AcessibilidadeTest.setUpOnce(AcessibilidadeTest.java:132)
2026-09-22T22:41:13.9018361Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-09-22T22:41:13.9018527Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
2026-09-22T22:41:13.9018689Z Caused by: java.lang.RuntimeException: Erro ao realizar login. Etapa: BOTAO_ENTRAR
2026-09-22T22:41:13.9018871Z 	at com.deque.axe.SSOLoginAutomation.performLoginIfRequired(SSOLoginAutomation.java:140)
2026-09-22T22:41:13.9019084Z 	at com.deque.axe.AcessibilidadeTest.setUpOnce(AcessibilidadeTest.java:123)
2026-09-22T22:41:13.9019442Z 	... 2 more
2026-09-22T22:41:13.9019657Z Caused by: java.lang.RuntimeException: LoginDES retornou erro de autenticação: Senha inválida.
2026-09-22T22:41:13.9019847Z 	at com.deque.axe.SSOLoginAutomation.performLoginIfRequired(SSOLoginAutomation.java:100)
2026-09-22T22:41:13.9019980Z 	... 3 more
2026-09-22T22:41:13.9020029Z 
2026-09-22T22:41:14.2302584Z [INFO] 
2026-09-22T22:41:14.2302766Z [INFO] Results:
2026-09-22T22:41:14.2302886Z [INFO] 
2026-09-22T22:41:14.2302985Z [ERROR] Errors: 
2026-09-22T22:41:14.2303479Z [ERROR]   AcessibilidadeTest.setUpOnce:132 Runtime Erro durante a configuração inicial (setUpOnce).
2026-09-22T22:41:14.2303632Z [INFO] 
2026-09-22T22:41:14.2303746Z [ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0
2026-09-22T22:41:14.2303866Z [INFO] 
2026-09-22T22:41:14.2329080Z [INFO] ------------------------------------------------------------------------
2026-09-22T22:41:14.2329270Z [INFO] BUILD FAILURE
2026-09-22T22:41:14.2329476Z [INFO] ------------------------------------------------------------------------
2026-09-22T22:41:14.2339826Z [INFO] Total time:  11.882 s
2026-09-22T22:41:14.2341937Z [INFO] Finished at: 2026-09-22T19:41:14-03:00
2026-09-22T22:41:14.2342217Z [INFO] ------------------------------------------------------------------------
2026-09-22T22:41:14.2349686Z [ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:3.5.3:test (default-cli) on project axe-selenium: 
2026-09-22T22:41:14.2349897Z [ERROR] 
2026-09-22T22:41:14.2350155Z [ERROR] See /opt/ads-agent/_work/r1/a/_AxeAutomator-ferramenta-teste/axe-automator-teste/target/surefire-reports for the individual test results.
2026-09-22T22:41:14.2350426Z [ERROR] See dump files (if any exist) [date].dump, [date]-jvmRun[N].dump and [date].dumpstream.
2026-09-22T22:41:14.2350603Z [ERROR] -> [Help 1]
2026-09-22T22:41:14.2350695Z [ERROR] 
2026-09-22T22:41:14.2350890Z [ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
2026-09-22T22:41:14.2351653Z [ERROR] Re-run Maven using the -X switch to enable full debug logging.
2026-09-22T22:41:14.2351902Z [ERROR] 
2026-09-22T22:41:14.2352063Z [ERROR] For more information about the errors and possible solutions, please read the following articles:
2026-09-22T22:41:14.2352246Z [ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
2026-09-22T22:41:14.2783318Z ##[debug]Exit code 1 received from tool '/opt/apache-maven/apache-maven-3.8.5/bin/mvn'
2026-09-22T22:41:14.2783680Z ##[debug]STDIO streams have closed for tool '/opt/apache-maven/apache-maven-3.8.5/bin/mvn'
2026-09-22T22:41:14.2793819Z The process '/opt/apache-maven/apache-maven-3.8.5/bin/mvn' failed with exit code 1
2026-09-22T22:41:14.2794041Z Could not retrieve code analysis results - Maven run failed.
2026-09-22T22:41:14.2795626Z ##[debug]publishCodeCoverage userRunFailed=true
2026-09-22T22:41:14.2795889Z ##[debug]task result: Failed
2026-09-22T22:41:14.2822601Z ##[error]Build failed.
2026-09-22T22:41:14.2828954Z ##[debug]Processed: ##vso[task.issue type=error;]Build failed.
2026-09-22T22:41:14.2829886Z ##[debug]Processed: ##vso[task.complete result=Failed;]Build failed.
2026-09-22T22:41:14.2869035Z ##[section]Finishing: Task Maven



