Prezados,

Estamos com o erro ao tentar gerar a pipeline SIREP-frontend-novo. Podem nos ajudar a investigar a causa?

Error during parsing of generic test execution report '/opt/ads-agent/_work/8/s/reports/sonarqubeTestReport.xml'. Look at the SonarQube documentation to know the expected XML format.
 
Caused by: java.io.FileNotFoundException: /opt/ads-agent/_work/8/s/reports/sonarqubeTestReport.xml (Arquivo ou diretório inexistente)


https://devops.caixa/projetos/Caixa/_build/results?buildId=828381&view=logs&j=275f1d19-1bd8-5591-b06b-07d489ea915a&t=f2aaf95d-5624-5a01-afca-797db0d5de68


2026-09-18T13:46:28.1158644Z ##[section]Starting: Run Code Analisis
2026-09-18T13:46:28.1162058Z ==============================================================================
2026-09-18T13:46:28.1162138Z Task         : Bash
2026-09-18T13:46:28.1162219Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-18T13:46:28.1162281Z Version      : 3.227.0
2026-09-18T13:46:28.1162324Z Author       : Microsoft Corporation
2026-09-18T13:46:28.1162694Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-18T13:46:28.1162764Z ==============================================================================
2026-09-18T13:46:28.2690533Z Generating script.
2026-09-18T13:46:28.2703568Z ========================== Starting Command Output ===========================
2026-09-18T13:46:28.2710101Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/140bba52-9586-4e43-b2d6-1f94a9f16edb.sh
2026-09-18T13:46:28.2760547Z sonar-scanner -Dsonar.host.url=http://sonar-esteira.apps.produtos4.caixa -Dsonar.login=ads-sa -Dsonar.password=*** -Dsonar.projectKey=SIREP-frontend-novo -Dsonar.projectName=SIREP-frontend-novo -Dsonar.projectVersion=1.0.0-snapshot -Dsonar.sources=. -Dproject.settings=NONE -Dsonar.scm.disabled=true -Dsonar.branch.name=develop -Dsonar.sourceEncoding=UTF-8 -Dsonar.language=ts -Dsonar.sources=src -Dsonar.tests=src -Dsonar.typescript.exclusions=**/node_modules/**,**/typings.d.ts,**/main.ts,**/environments,**/environments*.ts,**/*routing.module.ts,**/assets/**,**/mocks/**,**/i18n/**,**/single-spa/**,**/*spa.ts, -Dsonar.test.inclusions=**/*.spec.ts -Dsonar.ts.tslintconfigpath=tslint.json -Dsonar.testExecutionReportPaths=reports/sonarqubeTestReport.xml -Dsonar.javascript.lcov.reportPaths=coverage/lcov.info -X
2026-09-18T13:46:28.3716052Z 10:46:28.370 INFO: Scanner configuration file: /opt/sonar-scanner/sonar-scanner-4.2.0.1873-linux/conf/sonar-scanner.properties
2026-09-18T13:46:28.3718240Z 10:46:28.371 INFO: Project root configuration file: NONE
2026-09-18T13:46:28.3894086Z 10:46:28.389 INFO: SonarQube Scanner 4.2.0.1873
2026-09-18T13:46:28.3895302Z 10:46:28.389 INFO: Java 11.0.3 AdoptOpenJDK (64-bit)
2026-09-18T13:46:28.3895712Z 10:46:28.389 INFO: Linux 5.18.5-100.fc35.x86_64 amd64
2026-09-18T13:46:28.4635956Z 10:46:28.463 DEBUG: keyStore is : 
2026-09-18T13:46:28.4636186Z 10:46:28.463 DEBUG: keyStore type is : pkcs12
2026-09-18T13:46:28.4636315Z 10:46:28.463 DEBUG: keyStore provider is : 
2026-09-18T13:46:28.4636475Z 10:46:28.463 DEBUG: init keystore
2026-09-18T13:46:28.4636861Z 10:46:28.463 DEBUG: init keymanager of type SunX509
2026-09-18T13:46:28.5285778Z 10:46:28.525 DEBUG: Create: /opt/ads-agent/cache-tools/.sonar/cache
2026-09-18T13:46:28.5286136Z 10:46:28.525 INFO: User cache: /opt/ads-agent/cache-tools/.sonar/cache
2026-09-18T13:46:28.5286384Z 10:46:28.525 DEBUG: Create: /opt/ads-agent/cache-tools/.sonar/cache/_tmp
2026-09-18T13:46:28.5286619Z 10:46:28.527 DEBUG: Extract sonar-scanner-api-batch in temp...
2026-09-18T13:46:28.5304447Z 10:46:28.530 DEBUG: Get bootstrap index...
2026-09-18T13:46:28.5306741Z 10:46:28.530 DEBUG: Download: http://sonar-esteira.apps.produtos4.caixa/batch/index
2026-09-18T13:46:28.5672921Z 10:46:28.566 DEBUG: Get bootstrap completed
2026-09-18T13:46:28.5694978Z 10:46:28.569 DEBUG: Create isolated classloader...
2026-09-18T13:46:28.5746822Z 10:46:28.574 DEBUG: Start temp cleaning...
2026-09-18T13:46:28.5768501Z 10:46:28.576 DEBUG: Temp cleaning done
2026-09-18T13:46:28.5769499Z 10:46:28.576 DEBUG: Execution getVersion
2026-09-18T13:46:28.5870189Z 10:46:28.586 INFO: SonarQube server 9.9.5.90363
2026-09-18T13:46:28.5870579Z 10:46:28.586 INFO: Default locale: "pt_BR", source code encoding: "UTF-8"
2026-09-18T13:46:28.5875086Z 10:46:28.587 DEBUG: Work directory: /opt/ads-agent/_work/8/s/.scannerwork
2026-09-18T13:46:28.5881400Z 10:46:28.587 DEBUG: Execution execute
2026-09-18T13:46:28.7670071Z 10:46:28.766 DEBUG: Community 9.9.5.90363
2026-09-18T13:46:28.9310081Z 10:46:28.930 INFO: Load global settings
2026-09-18T13:46:29.0663796Z 10:46:29.065 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/settings/values.protobuf | time=134ms
2026-09-18T13:46:29.1191119Z 10:46:29.118 INFO: Load global settings (done) | time=188ms
2026-09-18T13:46:29.1270401Z 10:46:29.126 INFO: Server id: C6CBE574-AZHFQ0zM20SUQoMxtCv9
2026-09-18T13:46:29.1318702Z 10:46:29.131 INFO: User cache: /opt/ads-agent/cache-tools/.sonar/cache
2026-09-18T13:46:29.1340931Z 10:46:29.133 INFO: Load/download plugins
2026-09-18T13:46:29.1341251Z 10:46:29.134 INFO: Load plugins index
2026-09-18T13:46:29.2447795Z 10:46:29.244 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/plugins/installed | time=110ms
2026-09-18T13:46:29.2644471Z 10:46:29.264 INFO: Load plugins index (done) | time=131ms
2026-09-18T13:46:29.3106594Z 10:46:29.310 INFO: Load/download plugins (done) | time=177ms
2026-09-18T13:46:29.3541416Z 10:46:29.353 DEBUG: Plugins:
2026-09-18T13:46:29.3541662Z 10:46:29.353 DEBUG:   * Python Code Quality and Security 3.24.1.11916 (python)
2026-09-18T13:46:29.3542011Z 10:46:29.353 DEBUG:   * Go Code Quality and Security 1.11.0.3905 (go)
2026-09-18T13:46:29.3542219Z 10:46:29.354 DEBUG:   * JaCoCo 1.3.0.1538 (jacoco)
2026-09-18T13:46:29.3542430Z 10:46:29.354 DEBUG:   * Kotlin Code Quality and Security 2.12.0.1956 (kotlin)
2026-09-18T13:46:29.3542627Z 10:46:29.354 DEBUG:   * IaC Code Quality and Security 1.11.0.2847 (iac)
2026-09-18T13:46:29.3543183Z 10:46:29.354 DEBUG:   * JavaScript/TypeScript/CSS Code Quality and Security 9.13.0.20537 (javascript)
2026-09-18T13:46:29.3543399Z 10:46:29.354 DEBUG:   * Ruby Code Quality and Security 1.11.0.3905 (ruby)
2026-09-18T13:46:29.3544385Z 10:46:29.354 DEBUG:   * Scala Code Quality and Security 1.11.0.3905 (sonarscala)
2026-09-18T13:46:29.3544920Z 10:46:29.354 DEBUG:   * C# Code Quality and Security 8.51.0.59060 (csharp)
2026-09-18T13:46:29.3545473Z 10:46:29.354 DEBUG:   * Java Code Quality and Security 7.16.0.30901 (java)
2026-09-18T13:46:29.3545776Z 10:46:29.354 DEBUG:   * HTML Code Quality and Security 3.7.1.3306 (web)
2026-09-18T13:46:29.3547161Z 10:46:29.354 DEBUG:   * Flex Code Quality and Security 2.8.0.3166 (flex)
2026-09-18T13:46:29.3547904Z 10:46:29.354 DEBUG:   * XML Code Quality and Security 2.7.0.3820 (xml)
2026-09-18T13:46:29.3548165Z 10:46:29.354 DEBUG:   * PHP Code Quality and Security 3.27.1.9352 (php)
2026-09-18T13:46:29.3548355Z 10:46:29.354 DEBUG:   * Text Code Quality and Security 2.0.2.1090 (text)
2026-09-18T13:46:29.3548617Z 10:46:29.354 DEBUG:   * VB.NET Code Quality and Security 8.51.0.59060 (vbnet)
2026-09-18T13:46:29.3549042Z 10:46:29.354 DEBUG:   * Configuration detection fot Code Quality and Security 1.2.0.267 (config)
2026-09-18T13:46:29.3549556Z 10:46:29.354 DEBUG:   * Community Branch Plugin 1.14.0 (communityBranchPlugin)
2026-09-18T13:46:29.6913877Z 10:46:29.680 INFO: Process project properties
2026-09-18T13:46:29.6965405Z 10:46:29.696 INFO: Process project properties (done) | time=17ms
2026-09-18T13:46:29.6982315Z 10:46:29.698 INFO: Execute project builders
2026-09-18T13:46:29.6984644Z 10:46:29.698 DEBUG: Execute project builder: org.sonar.plugins.csharp.CSharpGlobalProtobufFileProcessor
2026-09-18T13:46:29.6989247Z 10:46:29.698 DEBUG: Execute project builder: org.sonar.plugins.vbnet.VbNetGlobalProtobufFileProcessor
2026-09-18T13:46:29.6993074Z 10:46:29.699 INFO: Execute project builders (done) | time=1ms
2026-09-18T13:46:29.7011890Z 10:46:29.700 INFO: Project key: SIREP-frontend-novo
2026-09-18T13:46:29.7014465Z 10:46:29.701 INFO: Base dir: /opt/ads-agent/_work/8/s
2026-09-18T13:46:29.7016053Z 10:46:29.701 INFO: Working dir: /opt/ads-agent/_work/8/s/.scannerwork
2026-09-18T13:46:29.7020850Z 10:46:29.701 DEBUG: Project global encoding: UTF-8, default locale: pt_BR
2026-09-18T13:46:29.7067625Z 10:46:29.706 INFO: Load project settings for component key: 'SIREP-frontend-novo'
2026-09-18T13:46:29.8386290Z 10:46:29.838 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/settings/values.protobuf?component=SIREP-frontend-novo | time=132ms
2026-09-18T13:46:29.8408967Z 10:46:29.840 INFO: Load project settings for component key: 'SIREP-frontend-novo' (done) | time=134ms
2026-09-18T13:46:30.0315683Z 10:46:30.031 INFO: Load project branches
2026-09-18T13:46:30.1485549Z 10:46:30.148 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/project_branches/list?project=SIREP-frontend-novo | time=117ms
2026-09-18T13:46:30.1553566Z 10:46:30.155 INFO: Load project branches (done) | time=124ms
2026-09-18T13:46:30.1556722Z 10:46:30.155 INFO: Load branch configuration
2026-09-18T13:46:30.1574393Z 10:46:30.157 INFO: Load branch configuration (done) | time=2ms
2026-09-18T13:46:30.1625709Z 10:46:30.162 DEBUG: Creating module hierarchy
2026-09-18T13:46:30.1626085Z 10:46:30.162 DEBUG:   Init module 'SIREP-frontend-novo'
2026-09-18T13:46:30.1631318Z 10:46:30.162 DEBUG:     Base dir: /opt/ads-agent/_work/8/s
2026-09-18T13:46:30.1631657Z 10:46:30.162 DEBUG:     Working dir: /opt/ads-agent/_work/8/s/.scannerwork
2026-09-18T13:46:30.1632117Z 10:46:30.162 DEBUG:     Module global encoding: UTF-8, default locale: pt_BR
2026-09-18T13:46:30.1713546Z 10:46:30.170 DEBUG: Available languages:
2026-09-18T13:46:30.1713934Z 10:46:30.170 DEBUG:   * Python => "py"
2026-09-18T13:46:30.1714090Z 10:46:30.170 DEBUG:   * Go => "go"
2026-09-18T13:46:30.1714276Z 10:46:30.171 DEBUG:   * Kotlin => "kotlin"
2026-09-18T13:46:30.1714476Z 10:46:30.171 DEBUG:   * Terraform => "terraform"
2026-09-18T13:46:30.1714645Z 10:46:30.171 DEBUG:   * CloudFormation => "cloudformation"
2026-09-18T13:46:30.1714816Z 10:46:30.171 DEBUG:   * Kubernetes => "kubernetes"
2026-09-18T13:46:30.1714950Z 10:46:30.171 DEBUG:   * Docker => "docker"
2026-09-18T13:46:30.1715203Z 10:46:30.171 DEBUG:   * JavaScript => "js"
2026-09-18T13:46:30.1715372Z 10:46:30.171 DEBUG:   * TypeScript => "ts"
2026-09-18T13:46:30.1715554Z 10:46:30.171 DEBUG:   * CSS => "css"
2026-09-18T13:46:30.1715829Z 10:46:30.171 DEBUG:   * Ruby => "ruby"
2026-09-18T13:46:30.1716014Z 10:46:30.171 DEBUG:   * Scala => "scala"
2026-09-18T13:46:30.1717614Z 10:46:30.171 DEBUG:   * C# => "cs"
2026-09-18T13:46:30.1718046Z 10:46:30.171 DEBUG:   * Java => "java"
2026-09-18T13:46:30.1718211Z 10:46:30.171 DEBUG:   * HTML => "web"
2026-09-18T13:46:30.1723028Z 10:46:30.171 DEBUG:   * JSP => "jsp"
2026-09-18T13:46:30.1723222Z 10:46:30.171 DEBUG:   * Flex => "flex"
2026-09-18T13:46:30.1723380Z 10:46:30.171 DEBUG:   * XML => "xml"
2026-09-18T13:46:30.1723623Z 10:46:30.171 DEBUG:   * PHP => "php"
2026-09-18T13:46:30.1723735Z 10:46:30.171 DEBUG:   * Text => "text"
2026-09-18T13:46:30.1723890Z 10:46:30.171 DEBUG:   * Secrets => "secrets"
2026-09-18T13:46:30.1724250Z 10:46:30.172 DEBUG:   * VB.NET => "vbnet"
2026-09-18T13:46:30.1724463Z 10:46:30.172 DEBUG:   * YAML => "yaml"
2026-09-18T13:46:30.1724644Z 10:46:30.172 DEBUG:   * JSON => "json"
2026-09-18T13:46:30.1825012Z 10:46:30.182 DEBUG: SCM Step is disabled by configuration
2026-09-18T13:46:30.1862933Z 10:46:30.186 INFO: Auto-configuring with CI 'Azure DevOps'
2026-09-18T13:46:30.1876863Z 10:46:30.187 INFO: Load quality profiles
2026-09-18T13:46:30.3096388Z 10:46:30.309 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/qualityprofiles/search.protobuf?project=SIREP-frontend-novo | time=122ms
2026-09-18T13:46:30.3208642Z 10:46:30.320 INFO: Load quality profiles (done) | time=133ms
2026-09-18T13:46:30.3263252Z 10:46:30.324 INFO: Load active rules
2026-09-18T13:46:30.4448092Z 10:46:30.444 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZIrNz10anXPr7nodh1z&ps=500&p=1 | time=120ms
2026-09-18T13:46:30.5876480Z 10:46:30.587 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZHFRDT420SUQoMxtGQK&ps=500&p=1 | time=118ms
2026-09-18T13:46:30.7171835Z 10:46:30.716 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZHFRDaA20SUQoMxtGRn&ps=500&p=1 | time=124ms
2026-09-18T13:46:30.8278667Z 10:46:30.827 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZHFRDeJ20SUQoMxtGSH&ps=500&p=1 | time=107ms
2026-09-18T13:46:30.9442058Z 10:46:30.943 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZHFRDmC20SUQoMxtGUp&ps=500&p=1 | time=116ms
2026-09-18T13:46:31.1147704Z 10:46:31.114 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZHFRDf220SUQoMxtGTP&ps=500&p=1 | time=168ms
2026-09-18T13:46:31.2713911Z 10:46:31.270 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZHFRDql20SUQoMxtGaP&ps=500&p=1 | time=147ms
2026-09-18T13:46:31.4521816Z 10:46:31.451 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZHFRD1c20SUQoMxtGhM&ps=500&p=1 | time=149ms
2026-09-18T13:46:31.5682541Z 10:46:31.567 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZIrN0k7anXPr7nodh-3&ps=500&p=1 | time=110ms
2026-09-18T13:46:31.6867785Z 10:46:31.686 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZIrN0ozanXPr7nodh_P&ps=500&p=1 | time=118ms
2026-09-18T13:46:31.8011689Z 10:46:31.800 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZHFRD9Z20SUQoMxtGkY&ps=500&p=1 | time=114ms
2026-09-18T13:46:31.9486782Z 10:46:31.948 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZHFREDp20SUQoMxtGs9&ps=500&p=1 | time=147ms
2026-09-18T13:46:32.1282005Z 10:46:32.127 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZ0llT84CVU8CgTziLc5&ps=500&p=1 | time=175ms
2026-09-18T13:46:32.2519957Z 10:46:32.251 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZ5vKpA2CVU8CgTzi7k0&ps=500&p=1 | time=115ms
2026-09-18T13:46:32.3678731Z 10:46:32.367 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZHFREw020SUQoMxtHKD&ps=500&p=1 | time=115ms
2026-09-18T13:46:32.4864622Z 10:46:32.485 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZHFREkh20SUQoMxtHIR&ps=500&p=1 | time=117ms
2026-09-18T13:46:32.5961462Z 10:46:32.595 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZIrN1BOanXPr7nodiCo&ps=500&p=1 | time=109ms
2026-09-18T13:46:32.7428611Z 10:46:32.742 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZHFRFDk20SUQoMxtHPJ&ps=500&p=1 | time=147ms
2026-09-18T13:46:32.8661897Z 10:46:32.865 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZIrN1I5anXPr7nodiHH&ps=500&p=1 | time=120ms
2026-09-18T13:46:32.9763705Z 10:46:32.975 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZIrN1LFanXPr7nodiH8&ps=500&p=1 | time=109ms
2026-09-18T13:46:33.1030698Z 10:46:33.102 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZHFRFpD20SUQoMxtHXp&ps=500&p=1 | time=126ms
2026-09-18T13:46:33.2247496Z 10:46:33.224 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZIrN1QKanXPr7nodiJN&ps=500&p=1 | time=119ms
2026-09-18T13:46:33.3693515Z 10:46:33.368 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZHFRFyf20SUQoMxtHeS&ps=500&p=1 | time=143ms
2026-09-18T13:46:33.4767793Z 10:46:33.476 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZIrN1SLanXPr7nodiJp&ps=500&p=1 | time=105ms
2026-09-18T13:46:33.4843608Z 10:46:33.483 INFO: Load active rules (done) | time=3159ms
2026-09-18T13:46:33.4869996Z 10:46:33.486 INFO: Load analysis cache
2026-09-18T13:46:33.6069453Z 10:46:33.606 DEBUG: GET 404 http://sonar-esteira.apps.produtos4.caixa/api/analysis_cache/get?project=SIREP-frontend-novo&branch=develop | time=120ms
2026-09-18T13:46:33.6076112Z 10:46:33.607 INFO: Load analysis cache (404) | time=121ms
2026-09-18T13:46:33.6283748Z 10:46:33.628 INFO: Branch name: develop
2026-09-18T13:46:33.6291051Z 10:46:33.628 WARN: Property 'sonar.password' is deprecated. It will not be supported in the future. Please instead use the 'sonar.login' parameter with a token.
2026-09-18T13:46:33.6434000Z 10:46:33.643 INFO: Load project repositories
2026-09-18T13:46:33.8201829Z 10:46:33.819 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/batch/project.protobuf?key=SIREP-frontend-novo&branch=develop | time=176ms
2026-09-18T13:46:33.8269332Z 10:46:33.826 INFO: Load project repositories (done) | time=183ms
2026-09-18T13:46:33.8372680Z 10:46:33.836 DEBUG: Declared extensions of language Python were converted to sonar.lang.patterns.py : **/*.py
2026-09-18T13:46:33.8373517Z 10:46:33.837 DEBUG: Declared extensions of language Go were converted to sonar.lang.patterns.go : **/*.go
2026-09-18T13:46:33.8374067Z 10:46:33.837 DEBUG: Declared extensions of language Kotlin were converted to sonar.lang.patterns.kotlin : **/*.kt
2026-09-18T13:46:33.8374382Z 10:46:33.837 DEBUG: Declared extensions of language Terraform were converted to sonar.lang.patterns.terraform : **/*.tf
2026-09-18T13:46:33.8379947Z 10:46:33.837 DEBUG: Declared extensions of language CloudFormation were converted to sonar.lang.patterns.cloudformation : 
2026-09-18T13:46:33.8380292Z 10:46:33.837 DEBUG: Declared extensions of language Kubernetes were converted to sonar.lang.patterns.kubernetes : 
2026-09-18T13:46:33.8380595Z 10:46:33.837 DEBUG: Declared extensions of language Docker were converted to sonar.lang.patterns.docker : 
2026-09-18T13:46:33.8381098Z 10:46:33.837 DEBUG: Declared extensions of language JavaScript were converted to sonar.lang.patterns.js : **/*.js,**/*.jsx,**/*.cjs,**/*.mjs,**/*.vue
2026-09-18T13:46:33.8381370Z 10:46:33.837 DEBUG: Declared extensions of language TypeScript were converted to sonar.lang.patterns.ts : **/*.ts,**/*.tsx,**/*.cts,**/*.mts
2026-09-18T13:46:33.8381616Z 10:46:33.837 DEBUG: Declared extensions of language CSS were converted to sonar.lang.patterns.css : **/*.css,**/*.less,**/*.scss
2026-09-18T13:46:33.8383362Z 10:46:33.838 DEBUG: Declared extensions of language Ruby were converted to sonar.lang.patterns.ruby : **/*.rb
2026-09-18T13:46:33.8383639Z 10:46:33.838 DEBUG: Declared extensions of language Scala were converted to sonar.lang.patterns.scala : **/*.scala
2026-09-18T13:46:33.8383886Z 10:46:33.838 DEBUG: Declared extensions of language C# were converted to sonar.lang.patterns.cs : **/*.cs
2026-09-18T13:46:33.8384235Z 10:46:33.838 DEBUG: Declared extensions of language Java were converted to sonar.lang.patterns.java : **/*.java,**/*.jav
2026-09-18T13:46:33.8391001Z 10:46:33.838 DEBUG: Declared extensions of language HTML were converted to sonar.lang.patterns.web : **/*.html,**/*.xhtml,**/*.cshtml,**/*.vbhtml,**/*.aspx,**/*.ascx,**/*.rhtml,**/*.erb,**/*.shtm,**/*.shtml,**/*.cmp,**/*.twig
2026-09-18T13:46:33.8391359Z 10:46:33.838 DEBUG: Declared extensions of language JSP were converted to sonar.lang.patterns.jsp : **/*.jsp,**/*.jspf,**/*.jspx
2026-09-18T13:46:33.8391554Z 10:46:33.838 DEBUG: Declared extensions of language Flex were converted to sonar.lang.patterns.flex : **/*.as
2026-09-18T13:46:33.8391892Z 10:46:33.839 DEBUG: Declared extensions of language XML were converted to sonar.lang.patterns.xml : **/*.xml,**/*.xsd,**/*.xsl
2026-09-18T13:46:33.8395646Z 10:46:33.839 DEBUG: Declared extensions of language PHP were converted to sonar.lang.patterns.php : **/*.php,**/*.php3,**/*.php4,**/*.php5,**/*.phtml,**/*.inc
2026-09-18T13:46:33.8396035Z 10:46:33.839 DEBUG: Declared extensions of language Text were converted to sonar.lang.patterns.text : 
2026-09-18T13:46:33.8396256Z 10:46:33.839 DEBUG: Declared extensions of language Secrets were converted to sonar.lang.patterns.secrets : 
2026-09-18T13:46:33.8396473Z 10:46:33.839 DEBUG: Declared extensions of language VB.NET were converted to sonar.lang.patterns.vbnet : **/*.vb
2026-09-18T13:46:33.8396892Z 10:46:33.839 DEBUG: Declared extensions of language YAML were converted to sonar.lang.patterns.yaml : **/*.yaml,**/*.yml
2026-09-18T13:46:33.8397123Z 10:46:33.839 DEBUG: Declared extensions of language JSON were converted to sonar.lang.patterns.json : **/*.json
2026-09-18T13:46:33.8508802Z 10:46:33.850 DEBUG: Will ignore generated code
2026-09-18T13:46:33.8520320Z 10:46:33.851 DEBUG: Will ignore generated code
2026-09-18T13:46:33.8537521Z 10:46:33.853 INFO: Indexing files...
2026-09-18T13:46:33.8537867Z 10:46:33.853 INFO: Project configuration:
2026-09-18T13:46:33.8542091Z 10:46:33.853 INFO:   Excluded sources: **/node_modules/**, **/dist/**, **/coverage/**, **/junit/**, **/reports/**, **/*.tmp, **/*.spec.ts
2026-09-18T13:46:33.8542334Z 10:46:33.854 INFO:   Included tests: **/*.spec.ts
2026-09-18T13:46:33.8545642Z 10:46:33.854 INFO:   Excluded sources for coverage: **/*.xml, **/repository/**, **/dto/**, **/entity/**, **/model/**, **/dao/**, **/*DAO.java, **/test/**, **/*Test.java, **/*.spec.ts, **/*setup-jest.ts, **/src/assets/css/fonts/**, **/src/assets/imgs/**, **/src/assets/js/**, **/src/environments/**, **/src/keycloak-angular/**, **/src/app/directives/**, **/src/app/guards/**, **/src/app/modelo/**, **/src/app/validators/**, **/src/app/components/shared/**
2026-09-18T13:46:33.8546172Z 10:46:33.854 INFO:   Excluded sources for duplication: **/**/environment*.ts, **/**/environment*.prod.ts
2026-09-18T13:46:33.8685883Z 10:46:33.868 DEBUG: 'src/app/app.api.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:33.8739266Z 10:46:33.873 DEBUG: 'src/app/app.api.ts' indexed with language 'ts'
2026-09-18T13:46:33.8822335Z 10:46:33.882 DEBUG: 'src/app/app.component.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:33.8832496Z 10:46:33.883 DEBUG: Average line length for src/app/app.component.css is 15
2026-09-18T13:46:33.8848949Z 10:46:33.884 DEBUG: 'src/app/app.component.css' indexed with language 'css'
2026-09-18T13:46:33.8859045Z 10:46:33.885 DEBUG: 'src/app/app.component.html' indexed with language 'web'
2026-09-18T13:46:33.8875979Z 10:46:33.887 DEBUG: 'src/app/app.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:33.8882689Z 10:46:33.888 DEBUG: 'src/app/app.component.ts' indexed with language 'ts'
2026-09-18T13:46:33.8904751Z 10:46:33.890 DEBUG: 'src/app/app.error-handler.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:33.8916626Z 10:46:33.891 DEBUG: 'src/app/app.error-handler.ts' indexed with language 'ts'
2026-09-18T13:46:33.8929273Z 10:46:33.892 DEBUG: 'src/app/app.location-helper.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:33.8938418Z 10:46:33.893 DEBUG: 'src/app/app.location-helper.ts' indexed with language 'ts'
2026-09-18T13:46:33.8954744Z 10:46:33.894 DEBUG: 'src/app/app.module.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:33.8961574Z 10:46:33.895 DEBUG: 'src/app/app.module.ts' indexed with language 'ts'
2026-09-18T13:46:33.8966095Z 10:46:33.896 DEBUG: File src/app/app.routing.module.ts was excluded by sonar.javascript.exclusions or sonar.typescript.exclusions
2026-09-18T13:46:33.8966484Z 10:46:33.896 DEBUG: 'src/app/app.routing.module.ts' excluded by org.sonar.plugins.javascript.filter.JavaScriptExclusionsFileFilter
2026-09-18T13:46:33.8978271Z 10:46:33.897 DEBUG: 'src/app/app.test-helper.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:33.8988766Z 10:46:33.898 DEBUG: 'src/app/app.test-helper.ts' indexed with language 'ts'
2026-09-18T13:46:33.9000953Z 10:46:33.899 DEBUG: 'src/app/components/adapters/app-date-adapter.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:33.9007836Z 10:46:33.900 DEBUG: 'src/app/components/adapters/app-date-adapter.ts' indexed with language 'ts'
2026-09-18T13:46:33.9015986Z 10:46:33.901 DEBUG: 'src/app/components/alert/alert-type.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:33.9018968Z 10:46:33.901 DEBUG: 'src/app/components/alert/alert-type.model.ts' indexed with language 'ts'
2026-09-18T13:46:33.9024822Z 10:46:33.902 DEBUG: 'src/app/components/alert/alert.component.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:33.9027405Z 10:46:33.902 DEBUG: Average line length for src/app/components/alert/alert.component.css is 0
2026-09-18T13:46:33.9028779Z 10:46:33.902 DEBUG: 'src/app/components/alert/alert.component.css' indexed with language 'css'
2026-09-18T13:46:33.9034806Z 10:46:33.903 DEBUG: 'src/app/components/alert/alert.component.html' indexed with language 'web'
2026-09-18T13:46:33.9044869Z 10:46:33.904 DEBUG: 'src/app/components/alert/alert.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:33.9050044Z 10:46:33.904 DEBUG: 'src/app/components/alert/alert.component.ts' indexed with language 'ts'
2026-09-18T13:46:33.9060169Z 10:46:33.905 DEBUG: 'src/app/components/alert/alert.module.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:33.9063778Z 10:46:33.906 DEBUG: 'src/app/components/alert/alert.module.ts' indexed with language 'ts'
2026-09-18T13:46:33.9073235Z 10:46:33.907 DEBUG: 'src/app/components/alert/alert.service.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:33.9077779Z 10:46:33.907 DEBUG: 'src/app/components/alert/alert.service.ts' indexed with language 'ts'
2026-09-18T13:46:33.9087546Z 10:46:33.908 DEBUG: 'src/app/components/campo-excludente/campo-excludente-form.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:33.9091305Z 10:46:33.908 DEBUG: 'src/app/components/campo-excludente/campo-excludente-form.model.ts' indexed with language 'ts'
2026-09-18T13:46:33.9102890Z 10:46:33.910 DEBUG: 'src/app/components/campo-excludente/campo-excludente.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:33.9107443Z 10:46:33.910 DEBUG: 'src/app/components/campo-excludente/campo-excludente.component.ts' indexed with language 'ts'
2026-09-18T13:46:33.9118316Z 10:46:33.911 DEBUG: 'src/app/components/campo-excludente/campo-excludente.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:33.9124027Z 10:46:33.912 DEBUG: 'src/app/components/campo-excludente/campo-excludente.model.ts' indexed with language 'ts'
2026-09-18T13:46:33.9133275Z 10:46:33.913 DEBUG: 'src/app/components/campo-excludente/campo-excludente.module.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:33.9136004Z 10:46:33.913 DEBUG: 'src/app/components/campo-excludente/campo-excludente.module.ts' indexed with language 'ts'
2026-09-18T13:46:33.9146500Z 10:46:33.914 DEBUG: 'src/app/components/campo-excludente/campo-excludente.service.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:33.9259360Z 10:46:33.925 DEBUG: 'src/app/components/campo-excludente/campo-excludente.service.ts' indexed with language 'ts'
2026-09-18T13:46:33.9272754Z 10:46:33.926 DEBUG: 'src/app/components/cessao/cessao-autorizar/autorizar-caixa/liberar-cessao/liberar-cessao-caixa.component.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:33.9273452Z 10:46:33.927 DEBUG: Average line length for src/app/components/cessao/cessao-autorizar/autorizar-caixa/liberar-cessao/liberar-cessao-caixa.component.css is 14
2026-09-18T13:46:33.9277172Z 10:46:33.927 DEBUG: 'src/app/components/cessao/cessao-autorizar/autorizar-caixa/liberar-cessao/liberar-cessao-caixa.component.css' indexed with language 'css'
2026-09-18T13:46:33.9287557Z 10:46:33.928 DEBUG: 'src/app/components/cessao/cessao-autorizar/autorizar-caixa/liberar-cessao/liberar-cessao-caixa.component.html' indexed with language 'web'
2026-09-18T13:46:33.9303370Z 10:46:33.930 DEBUG: 'src/app/components/cessao/cessao-autorizar/autorizar-caixa/liberar-cessao/liberar-cessao-caixa.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:33.9309341Z 10:46:33.930 DEBUG: 'src/app/components/cessao/cessao-autorizar/autorizar-caixa/liberar-cessao/liberar-cessao-caixa.component.ts' indexed with language 'ts'
2026-09-18T13:46:33.9321573Z 10:46:33.931 DEBUG: 'src/app/components/cessao/cessao-autorizar/autorizar-caixa/lista-cessoes/cessoes-caixa.component.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:33.9322042Z 10:46:33.932 DEBUG: Average line length for src/app/components/cessao/cessao-autorizar/autorizar-caixa/lista-cessoes/cessoes-caixa.component.css is 16
2026-09-18T13:46:33.9337051Z 10:46:33.933 DEBUG: 'src/app/components/cessao/cessao-autorizar/autorizar-caixa/lista-cessoes/cessoes-caixa.component.css' indexed with language 'css'
2026-09-18T13:46:33.9370649Z 10:46:33.936 DEBUG: 'src/app/components/cessao/cessao-autorizar/autorizar-caixa/lista-cessoes/cessoes-caixa.component.html' indexed with language 'web'
2026-09-18T13:46:33.9406847Z 10:46:33.940 DEBUG: 'src/app/components/cessao/cessao-autorizar/autorizar-caixa/lista-cessoes/cessoes-caixa.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:33.9427274Z 10:46:33.941 DEBUG: 'src/app/components/cessao/cessao-autorizar/autorizar-caixa/lista-cessoes/cessoes-caixa.component.ts' indexed with language 'ts'
2026-09-18T13:46:33.9450486Z 10:46:33.944 DEBUG: 'src/app/components/cessao/cessao-autorizar/autorizar-convenente/lista-cessoes/cessoes-convenente.component.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:33.9450920Z 10:46:33.944 DEBUG: Average line length for src/app/components/cessao/cessao-autorizar/autorizar-convenente/lista-cessoes/cessoes-convenente.component.css is 16
2026-09-18T13:46:33.9472974Z 10:46:33.946 DEBUG: 'src/app/components/cessao/cessao-autorizar/autorizar-convenente/lista-cessoes/cessoes-convenente.component.css' indexed with language 'css'
2026-09-18T13:46:33.9499972Z 10:46:33.949 DEBUG: 'src/app/components/cessao/cessao-autorizar/autorizar-convenente/lista-cessoes/cessoes-convenente.component.html' indexed with language 'web'
2026-09-18T13:46:33.9539852Z 10:46:33.953 DEBUG: 'src/app/components/cessao/cessao-autorizar/autorizar-convenente/lista-cessoes/cessoes-convenente.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:33.9552096Z 10:46:33.955 DEBUG: 'src/app/components/cessao/cessao-autorizar/autorizar-convenente/lista-cessoes/cessoes-convenente.component.ts' indexed with language 'ts'
2026-09-18T13:46:33.9581061Z 10:46:33.957 DEBUG: 'src/app/components/cessao/cessao-autorizar/autorizar-convenente/validar-cessao/validar-cessao-convenente.component.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:33.9581449Z 10:46:33.958 DEBUG: Average line length for src/app/components/cessao/cessao-autorizar/autorizar-convenente/validar-cessao/validar-cessao-convenente.component.css is 13
2026-09-18T13:46:33.9930701Z 10:46:33.992 DEBUG: 'src/app/components/cessao/cessao-autorizar/autorizar-convenente/validar-cessao/validar-cessao-convenente.component.css' indexed with language 'css'
2026-09-18T13:46:33.9962765Z 10:46:33.996 DEBUG: 'src/app/components/cessao/cessao-autorizar/autorizar-convenente/validar-cessao/validar-cessao-convenente.component.html' indexed with language 'web'
2026-09-18T13:46:33.9997223Z 10:46:33.999 DEBUG: 'src/app/components/cessao/cessao-autorizar/autorizar-convenente/validar-cessao/validar-cessao-convenente.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0014638Z 10:46:34.000 DEBUG: 'src/app/components/cessao/cessao-autorizar/autorizar-convenente/validar-cessao/validar-cessao-convenente.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.0040813Z 10:46:34.003 DEBUG: 'src/app/components/cessao/cessao-autorizar/dados-cessao.component.html' indexed with language 'web'
2026-09-18T13:46:34.0063062Z 10:46:34.006 DEBUG: 'src/app/components/cessao/cessao-autorizar/dados-cessao.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0072526Z 10:46:34.007 DEBUG: 'src/app/components/cessao/cessao-autorizar/dados-cessao.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.0093488Z 10:46:34.009 DEBUG: 'src/app/components/cessao/cessao-cadastro/cessao-selecao/cessao-selecao.component.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0094254Z 10:46:34.009 DEBUG: Average line length for src/app/components/cessao/cessao-cadastro/cessao-selecao/cessao-selecao.component.css is 23
2026-09-18T13:46:34.0104604Z 10:46:34.010 DEBUG: 'src/app/components/cessao/cessao-cadastro/cessao-selecao/cessao-selecao.component.css' indexed with language 'css'
2026-09-18T13:46:34.0132295Z 10:46:34.013 DEBUG: 'src/app/components/cessao/cessao-cadastro/cessao-selecao/cessao-selecao.component.html' indexed with language 'web'
2026-09-18T13:46:34.0150971Z 10:46:34.014 DEBUG: 'src/app/components/cessao/cessao-cadastro/cessao-selecao/cessao-selecao.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0157360Z 10:46:34.015 DEBUG: 'src/app/components/cessao/cessao-cadastro/cessao-selecao/cessao-selecao.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.0164181Z 10:46:34.015 DEBUG: 'src/app/components/cessao/cessao-cadastro/cessao-simulacao/cessao-simulacao.component.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0165555Z 10:46:34.016 DEBUG: Average line length for src/app/components/cessao/cessao-cadastro/cessao-simulacao/cessao-simulacao.component.css is 15
2026-09-18T13:46:34.0166212Z 10:46:34.016 DEBUG: 'src/app/components/cessao/cessao-cadastro/cessao-simulacao/cessao-simulacao.component.css' indexed with language 'css'
2026-09-18T13:46:34.0169503Z 10:46:34.016 DEBUG: 'src/app/components/cessao/cessao-cadastro/cessao-simulacao/cessao-simulacao.component.html' indexed with language 'web'
2026-09-18T13:46:34.0187197Z 10:46:34.017 DEBUG: 'src/app/components/cessao/cessao-cadastro/cessao-simulacao/cessao-simulacao.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0187741Z 10:46:34.018 DEBUG: 'src/app/components/cessao/cessao-cadastro/cessao-simulacao/cessao-simulacao.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.0192123Z 10:46:34.019 DEBUG: 'src/app/components/cessao/cessao-calculo-cet-lista/cessao-calculo-cet-lista.component.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0197846Z 10:46:34.019 DEBUG: Average line length for src/app/components/cessao/cessao-calculo-cet-lista/cessao-calculo-cet-lista.component.css is 16
2026-09-18T13:46:34.0198324Z 10:46:34.019 DEBUG: 'src/app/components/cessao/cessao-calculo-cet-lista/cessao-calculo-cet-lista.component.css' indexed with language 'css'
2026-09-18T13:46:34.0205909Z 10:46:34.020 DEBUG: 'src/app/components/cessao/cessao-calculo-cet-lista/cessao-calculo-cet-lista.component.html' indexed with language 'web'
2026-09-18T13:46:34.0214678Z 10:46:34.021 DEBUG: 'src/app/components/cessao/cessao-calculo-cet-lista/cessao-calculo-cet-lista.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0218391Z 10:46:34.021 DEBUG: 'src/app/components/cessao/cessao-calculo-cet-lista/cessao-calculo-cet-lista.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.0224726Z 10:46:34.022 DEBUG: 'src/app/components/cessao/cessao-detalhe/cessao-detalhe.component.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0225164Z 10:46:34.022 DEBUG: Average line length for src/app/components/cessao/cessao-detalhe/cessao-detalhe.component.css is 15
2026-09-18T13:46:34.0227921Z 10:46:34.022 DEBUG: 'src/app/components/cessao/cessao-detalhe/cessao-detalhe.component.css' indexed with language 'css'
2026-09-18T13:46:34.0237452Z 10:46:34.023 DEBUG: 'src/app/components/cessao/cessao-detalhe/cessao-detalhe.component.html' indexed with language 'web'
2026-09-18T13:46:34.0253734Z 10:46:34.025 DEBUG: 'src/app/components/cessao/cessao-detalhe/cessao-detalhe.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0261455Z 10:46:34.026 DEBUG: 'src/app/components/cessao/cessao-detalhe/cessao-detalhe.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.0266193Z 10:46:34.026 DEBUG: 'src/app/components/cessao/cessao-lista/cessao-lista.component.html' indexed with language 'web'
2026-09-18T13:46:34.0285620Z 10:46:34.028 DEBUG: 'src/app/components/cessao/cessao-lista/cessao-lista.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0289194Z 10:46:34.028 DEBUG: 'src/app/components/cessao/cessao-lista/cessao-lista.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.0296448Z 10:46:34.029 DEBUG: 'src/app/components/cessao/cessao.module.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0299615Z 10:46:34.029 DEBUG: 'src/app/components/cessao/cessao.module.ts' indexed with language 'ts'
2026-09-18T13:46:34.0304155Z 10:46:34.030 DEBUG: File src/app/components/cessao/cessao.routing.module.ts was excluded by sonar.javascript.exclusions or sonar.typescript.exclusions
2026-09-18T13:46:34.0304903Z 10:46:34.030 DEBUG: 'src/app/components/cessao/cessao.routing.module.ts' excluded by org.sonar.plugins.javascript.filter.JavaScriptExclusionsFileFilter
2026-09-18T13:46:34.0319155Z 10:46:34.031 DEBUG: 'src/app/components/cessao/cessao.service.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0321447Z 10:46:34.032 DEBUG: 'src/app/components/cessao/cessao.service.ts' indexed with language 'ts'
2026-09-18T13:46:34.0326822Z 10:46:34.032 DEBUG: 'src/app/components/cessao/lista-recebiveis/lista-recebiveis.component.html' indexed with language 'web'
2026-09-18T13:46:34.0341578Z 10:46:34.034 DEBUG: 'src/app/components/cessao/lista-recebiveis/lista-recebiveis.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0346086Z 10:46:34.034 DEBUG: 'src/app/components/cessao/lista-recebiveis/lista-recebiveis.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.0355641Z 10:46:34.035 DEBUG: 'src/app/components/conformidade/conformidade-dados-cadastrais/conformidade-convenio-convenente-dados/conformidade-convenio-convenente-dados.component.html' indexed with language 'web'
2026-09-18T13:46:34.0360660Z 10:46:34.035 DEBUG: 'src/app/components/conformidade/conformidade-dados-cadastrais/conformidade-convenio-convenente-dados/conformidade-convenio-convenente-dados.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0364183Z 10:46:34.036 DEBUG: 'src/app/components/conformidade/conformidade-dados-cadastrais/conformidade-convenio-convenente-dados/conformidade-convenio-convenente-dados.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.0370392Z 10:46:34.036 DEBUG: 'src/app/components/conformidade/conformidade-dados-cadastrais/conformidade-convenio-dados/conformidade-convenio-dados.component.html' indexed with language 'web'
2026-09-18T13:46:34.0376665Z 10:46:34.037 DEBUG: 'src/app/components/conformidade/conformidade-dados-cadastrais/conformidade-convenio-dados/conformidade-convenio-dados.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0381732Z 10:46:34.037 DEBUG: 'src/app/components/conformidade/conformidade-dados-cadastrais/conformidade-convenio-dados/conformidade-convenio-dados.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.0387597Z 10:46:34.038 DEBUG: 'src/app/components/conformidade/conformidade-dados-cadastrais/conformidade-dados-cadastrais.component.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0388012Z 10:46:34.038 DEBUG: Average line length for src/app/components/conformidade/conformidade-dados-cadastrais/conformidade-dados-cadastrais.component.css is 22
2026-09-18T13:46:34.0400182Z 10:46:34.038 DEBUG: 'src/app/components/conformidade/conformidade-dados-cadastrais/conformidade-dados-cadastrais.component.css' indexed with language 'css'
2026-09-18T13:46:34.0400511Z 10:46:34.039 DEBUG: 'src/app/components/conformidade/conformidade-dados-cadastrais/conformidade-dados-cadastrais.component.html' indexed with language 'web'
2026-09-18T13:46:34.0433809Z 10:46:34.040 DEBUG: 'src/app/components/conformidade/conformidade-dados-cadastrais/conformidade-dados-cadastrais.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0434316Z 10:46:34.040 DEBUG: 'src/app/components/conformidade/conformidade-dados-cadastrais/conformidade-dados-cadastrais.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.0434700Z 10:46:34.041 DEBUG: 'src/app/components/conformidade/conformidade-dados-cadastrais/conformidade-dados/conformidade-dados.component.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0435073Z 10:46:34.041 DEBUG: Average line length for src/app/components/conformidade/conformidade-dados-cadastrais/conformidade-dados/conformidade-dados.component.css is 17
2026-09-18T13:46:34.0435614Z 10:46:34.041 DEBUG: 'src/app/components/conformidade/conformidade-dados-cadastrais/conformidade-dados/conformidade-dados.component.css' indexed with language 'css'
2026-09-18T13:46:34.0435989Z 10:46:34.041 DEBUG: 'src/app/components/conformidade/conformidade-dados-cadastrais/conformidade-dados/conformidade-dados.component.html' indexed with language 'web'
2026-09-18T13:46:34.0436353Z 10:46:34.042 DEBUG: 'src/app/components/conformidade/conformidade-dados-cadastrais/conformidade-dados/conformidade-dados.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0436711Z 10:46:34.042 DEBUG: 'src/app/components/conformidade/conformidade-dados-cadastrais/conformidade-dados/conformidade-dados.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.0439294Z 10:46:34.043 DEBUG: 'src/app/components/conformidade/conformidade-dados-cadastrais/conformidade-endereco-convenente-dados/conformidade-endereco-convenente-dados.component.html' indexed with language 'web'
2026-09-18T13:46:34.0448322Z 10:46:34.044 DEBUG: 'src/app/components/conformidade/conformidade-dados-cadastrais/conformidade-endereco-convenente-dados/conformidade-endereco-convenente-dados.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0450285Z 10:46:34.044 DEBUG: 'src/app/components/conformidade/conformidade-dados-cadastrais/conformidade-endereco-convenente-dados/conformidade-endereco-convenente-dados.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.0459725Z 10:46:34.045 DEBUG: 'src/app/components/conformidade/conformidade-dados-cadastrais/conformidade-vinculacao-dados/conformidade-vinculacao-dados.component.html' indexed with language 'web'
2026-09-18T13:46:34.0466680Z 10:46:34.046 DEBUG: 'src/app/components/conformidade/conformidade-dados-cadastrais/conformidade-vinculacao-dados/conformidade-vinculacao-dados.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0467086Z 10:46:34.046 DEBUG: 'src/app/components/conformidade/conformidade-dados-cadastrais/conformidade-vinculacao-dados/conformidade-vinculacao-dados.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.0488986Z 10:46:34.047 DEBUG: 'src/app/components/conformidade/conformidade-detalhe/acoes-detalhe/acoes-detalhe-conformidade.component.html' indexed with language 'web'
2026-09-18T13:46:34.0489407Z 10:46:34.047 DEBUG: 'src/app/components/conformidade/conformidade-detalhe/acoes-detalhe/acoes-detalhe-conformidade.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0489881Z 10:46:34.048 DEBUG: 'src/app/components/conformidade/conformidade-detalhe/acoes-detalhe/acoes-detalhe-conformidade.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.0501176Z 10:46:34.048 DEBUG: 'src/app/components/conformidade/conformidade-detalhe/conformidade-detalhe.component.html' indexed with language 'web'
2026-09-18T13:46:34.0502734Z 10:46:34.049 DEBUG: 'src/app/components/conformidade/conformidade-detalhe/conformidade-detalhe.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0503109Z 10:46:34.049 DEBUG: 'src/app/components/conformidade/conformidade-detalhe/conformidade-detalhe.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.0513772Z 10:46:34.050 DEBUG: 'src/app/components/conformidade/conformidade-lista/conformidade-lista.component.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0514171Z 10:46:34.050 DEBUG: Average line length for src/app/components/conformidade/conformidade-lista/conformidade-lista.component.css is 15
2026-09-18T13:46:34.0515511Z 10:46:34.051 DEBUG: 'src/app/components/conformidade/conformidade-lista/conformidade-lista.component.css' indexed with language 'css'
2026-09-18T13:46:34.0517301Z 10:46:34.051 DEBUG: 'src/app/components/conformidade/conformidade-lista/conformidade-lista.component.html' indexed with language 'web'
2026-09-18T13:46:34.0531938Z 10:46:34.053 DEBUG: 'src/app/components/conformidade/conformidade-lista/conformidade-lista.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0536416Z 10:46:34.053 DEBUG: 'src/app/components/conformidade/conformidade-lista/conformidade-lista.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.0543765Z 10:46:34.054 DEBUG: 'src/app/components/conformidade/conformidade-tratar/perfil-agencia/perfil-agencia.component.html' indexed with language 'web'
2026-09-18T13:46:34.0553136Z 10:46:34.055 DEBUG: 'src/app/components/conformidade/conformidade-tratar/perfil-agencia/perfil-agencia.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0560384Z 10:46:34.055 DEBUG: 'src/app/components/conformidade/conformidade-tratar/perfil-agencia/perfil-agencia.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.0566617Z 10:46:34.056 DEBUG: 'src/app/components/conformidade/conformidade-tratar/perfil-agencia/termo-cadastramento-fornecedor/alterar/termo-cadastramento-fornecedor-alterar.component.html' indexed with language 'web'
2026-09-18T13:46:34.0577491Z 10:46:34.056 DEBUG: 'src/app/components/conformidade/conformidade-tratar/perfil-agencia/termo-cadastramento-fornecedor/alterar/termo-cadastramento-fornecedor-alterar.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0577986Z 10:46:34.057 DEBUG: 'src/app/components/conformidade/conformidade-tratar/perfil-agencia/termo-cadastramento-fornecedor/alterar/termo-cadastramento-fornecedor-alterar.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.0580942Z 10:46:34.057 DEBUG: 'src/app/components/conformidade/conformidade-tratar/perfil-agencia/termo-cadastramento-fornecedor/termo-cadastramento-fornecedor.component.html' indexed with language 'web'
2026-09-18T13:46:34.0587294Z 10:46:34.058 DEBUG: 'src/app/components/conformidade/conformidade-tratar/perfil-agencia/termo-cadastramento-fornecedor/termo-cadastramento-fornecedor.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0596414Z 10:46:34.058 DEBUG: 'src/app/components/conformidade/conformidade-tratar/perfil-agencia/termo-cadastramento-fornecedor/termo-cadastramento-fornecedor.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.0596973Z 10:46:34.059 DEBUG: 'src/app/components/conformidade/conformidade-tratar/perfil-conformidade/perfil-conformidade.component.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0599489Z 10:46:34.059 DEBUG: Average line length for src/app/components/conformidade/conformidade-tratar/perfil-conformidade/perfil-conformidade.component.css is 16
2026-09-18T13:46:34.0599941Z 10:46:34.059 DEBUG: 'src/app/components/conformidade/conformidade-tratar/perfil-conformidade/perfil-conformidade.component.css' indexed with language 'css'
2026-09-18T13:46:34.0607379Z 10:46:34.060 DEBUG: 'src/app/components/conformidade/conformidade-tratar/perfil-conformidade/perfil-conformidade.component.html' indexed with language 'web'
2026-09-18T13:46:34.0617535Z 10:46:34.061 DEBUG: 'src/app/components/conformidade/conformidade-tratar/perfil-conformidade/perfil-conformidade.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0618036Z 10:46:34.061 DEBUG: 'src/app/components/conformidade/conformidade-tratar/perfil-conformidade/perfil-conformidade.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.0632072Z 10:46:34.062 DEBUG: 'src/app/components/conformidade/conformidade.module.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0633542Z 10:46:34.062 DEBUG: 'src/app/components/conformidade/conformidade.module.ts' indexed with language 'ts'
2026-09-18T13:46:34.0633804Z 10:46:34.062 DEBUG: File src/app/components/conformidade/conformidade.routing.module.ts was excluded by sonar.javascript.exclusions or sonar.typescript.exclusions
2026-09-18T13:46:34.0634183Z 10:46:34.062 DEBUG: 'src/app/components/conformidade/conformidade.routing.module.ts' excluded by org.sonar.plugins.javascript.filter.JavaScriptExclusionsFileFilter
2026-09-18T13:46:34.0638242Z 10:46:34.063 DEBUG: 'src/app/components/conformidade/conformidade.service.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0640734Z 10:46:34.063 DEBUG: 'src/app/components/conformidade/conformidade.service.ts' indexed with language 'ts'
2026-09-18T13:46:34.0646884Z 10:46:34.064 DEBUG: 'src/app/components/consultas/avaliacao-risco/avaliacao-risco-detalhe/avaliacao-risco-detalhe.component.html' indexed with language 'web'
2026-09-18T13:46:34.0653526Z 10:46:34.065 DEBUG: 'src/app/components/consultas/avaliacao-risco/avaliacao-risco-detalhe/avaliacao-risco-detalhe.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0655155Z 10:46:34.065 DEBUG: 'src/app/components/consultas/avaliacao-risco/avaliacao-risco-detalhe/avaliacao-risco-detalhe.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.0661016Z 10:46:34.065 DEBUG: 'src/app/components/consultas/avaliacao-risco/avaliacao-risco.component.html' indexed with language 'web'
2026-09-18T13:46:34.0667923Z 10:46:34.066 DEBUG: 'src/app/components/consultas/avaliacao-risco/avaliacao-risco.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0668499Z 10:46:34.066 DEBUG: 'src/app/components/consultas/avaliacao-risco/avaliacao-risco.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.0675309Z 10:46:34.067 DEBUG: 'src/app/components/consultas/avaliacao-risco/avaliacao-risco.service.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0679060Z 10:46:34.067 DEBUG: 'src/app/components/consultas/avaliacao-risco/avaliacao-risco.service.ts' indexed with language 'ts'
2026-09-18T13:46:34.0686427Z 10:46:34.068 DEBUG: 'src/app/components/consultas/conceito/conceito.component.html' indexed with language 'web'
2026-09-18T13:46:34.0686974Z 10:46:34.068 DEBUG: 'src/app/components/consultas/conceito/conceito.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0689597Z 10:46:34.068 DEBUG: 'src/app/components/consultas/conceito/conceito.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.0696279Z 10:46:34.069 DEBUG: 'src/app/components/consultas/conceito/conceito.service.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0696653Z 10:46:34.069 DEBUG: 'src/app/components/consultas/conceito/conceito.service.ts' indexed with language 'ts'
2026-09-18T13:46:34.0701944Z 10:46:34.070 DEBUG: 'src/app/components/consultas/consultas.module.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0713783Z 10:46:34.070 DEBUG: 'src/app/components/consultas/consultas.module.ts' indexed with language 'ts'
2026-09-18T13:46:34.0721160Z 10:46:34.070 DEBUG: File src/app/components/consultas/consultas.routing.module.ts was excluded by sonar.javascript.exclusions or sonar.typescript.exclusions
2026-09-18T13:46:34.0721613Z 10:46:34.070 DEBUG: 'src/app/components/consultas/consultas.routing.module.ts' excluded by org.sonar.plugins.javascript.filter.JavaScriptExclusionsFileFilter
2026-09-18T13:46:34.0721953Z 10:46:34.071 DEBUG: 'src/app/components/consultas/plataforma-externa/plataforma-externa.component.html' indexed with language 'web'
2026-09-18T13:46:34.0734900Z 10:46:34.073 DEBUG: 'src/app/components/consultas/plataforma-externa/plataforma-externa.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0736815Z 10:46:34.073 DEBUG: 'src/app/components/consultas/plataforma-externa/plataforma-externa.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.0753729Z 10:46:34.074 DEBUG: 'src/app/components/consultas/plataforma-externa/plataforma-externa.service.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0762628Z 10:46:34.074 DEBUG: 'src/app/components/consultas/plataforma-externa/plataforma-externa.service.ts' indexed with language 'ts'
2026-09-18T13:46:34.0767117Z 10:46:34.075 DEBUG: 'src/app/components/consultas/plataforma-externa/resultado-pesquisa-cessao/resultado-pesquisa-cessao.component.html' indexed with language 'web'
2026-09-18T13:46:34.0767557Z 10:46:34.076 DEBUG: 'src/app/components/consultas/plataforma-externa/resultado-pesquisa-cessao/resultado-pesquisa-cessao.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0768145Z 10:46:34.076 DEBUG: 'src/app/components/consultas/plataforma-externa/resultado-pesquisa-cessao/resultado-pesquisa-cessao.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.0776762Z 10:46:34.077 DEBUG: 'src/app/components/consultas/plataforma-externa/resultado-pesquisa-desvincular-fornecedor/resultado-pesquisa-desvincular-fornecedor.component.html' indexed with language 'web'
2026-09-18T13:46:34.0795503Z 10:46:34.078 DEBUG: 'src/app/components/consultas/plataforma-externa/resultado-pesquisa-desvincular-fornecedor/resultado-pesquisa-desvincular-fornecedor.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0795944Z 10:46:34.078 DEBUG: 'src/app/components/consultas/plataforma-externa/resultado-pesquisa-desvincular-fornecedor/resultado-pesquisa-desvincular-fornecedor.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.0796337Z 10:46:34.078 DEBUG: 'src/app/components/consultas/plataforma-externa/resultado-pesquisa-fornecedor/resultado-pesquisa-fornecedor.component.html' indexed with language 'web'
2026-09-18T13:46:34.0796735Z 10:46:34.079 DEBUG: 'src/app/components/consultas/plataforma-externa/resultado-pesquisa-fornecedor/resultado-pesquisa-fornecedor.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0799634Z 10:46:34.079 DEBUG: 'src/app/components/consultas/plataforma-externa/resultado-pesquisa-fornecedor/resultado-pesquisa-fornecedor.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.0805482Z 10:46:34.080 DEBUG: 'src/app/components/consultas/plataforma-externa/resultado-pesquisa-recebivel/resultado-pesquisa-recebivel.component.html' indexed with language 'web'
2026-09-18T13:46:34.0812083Z 10:46:34.081 DEBUG: 'src/app/components/consultas/plataforma-externa/resultado-pesquisa-recebivel/resultado-pesquisa-recebivel.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0818988Z 10:46:34.081 DEBUG: 'src/app/components/consultas/plataforma-externa/resultado-pesquisa-recebivel/resultado-pesquisa-recebivel.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.0819800Z 10:46:34.081 DEBUG: 'src/app/components/consultas/plataforma-externa/resultado-pesquisa-solicitacaorecebida/resultado-pesquisa-solicitacaorecebida.component.html' indexed with language 'web'
2026-09-18T13:46:34.0828640Z 10:46:34.082 DEBUG: 'src/app/components/consultas/plataforma-externa/resultado-pesquisa-solicitacaorecebida/resultado-pesquisa-solicitacaorecebida.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0834521Z 10:46:34.082 DEBUG: 'src/app/components/consultas/plataforma-externa/resultado-pesquisa-solicitacaorecebida/resultado-pesquisa-solicitacaorecebida.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.0917322Z 10:46:34.091 DEBUG: 'src/app/components/consultas/plataforma-externa/resultado-pesquisa-vazio/resultado-pesquisa-vazio.component.html' indexed with language 'web'
2026-09-18T13:46:34.0922673Z 10:46:34.092 DEBUG: 'src/app/components/consultas/plataforma-externa/resultado-pesquisa-vazio/resultado-pesquisa-vazio.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0927069Z 10:46:34.092 DEBUG: 'src/app/components/consultas/plataforma-externa/resultado-pesquisa-vazio/resultado-pesquisa-vazio.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.0933803Z 10:46:34.093 DEBUG: 'src/app/components/convenente-shared/convenente-shared.module.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0934437Z 10:46:34.093 DEBUG: 'src/app/components/convenente-shared/convenente-shared.module.ts' indexed with language 'ts'
2026-09-18T13:46:34.0939148Z 10:46:34.093 DEBUG: 'src/app/components/convenente-shared/dados-detalhe/convenente-dados-detalhe.component.html' indexed with language 'web'
2026-09-18T13:46:34.0944279Z 10:46:34.094 DEBUG: 'src/app/components/convenente-shared/dados-detalhe/convenente-dados-detalhe.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0946339Z 10:46:34.094 DEBUG: 'src/app/components/convenente-shared/dados-detalhe/convenente-dados-detalhe.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.0950760Z 10:46:34.094 DEBUG: 'src/app/components/convenente/arquivo-lista/arquivo-lista.component.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0951546Z 10:46:34.095 DEBUG: Average line length for src/app/components/convenente/arquivo-lista/arquivo-lista.component.css is 12
2026-09-18T13:46:34.0954177Z 10:46:34.095 DEBUG: 'src/app/components/convenente/arquivo-lista/arquivo-lista.component.css' indexed with language 'css'
2026-09-18T13:46:34.0957758Z 10:46:34.095 DEBUG: 'src/app/components/convenente/arquivo-lista/arquivo-lista.component.html' indexed with language 'web'
2026-09-18T13:46:34.0967824Z 10:46:34.096 DEBUG: 'src/app/components/convenente/arquivo-lista/arquivo-lista.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0971966Z 10:46:34.096 DEBUG: 'src/app/components/convenente/arquivo-lista/arquivo-lista.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.0976336Z 10:46:34.097 DEBUG: 'src/app/components/convenente/arquivo-recebivel-detalhe/arquivo-recebivel-detalhe.component.html' indexed with language 'web'
2026-09-18T13:46:34.0981694Z 10:46:34.098 DEBUG: 'src/app/components/convenente/arquivo-recebivel-detalhe/arquivo-recebivel-detalhe.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0987168Z 10:46:34.098 DEBUG: 'src/app/components/convenente/arquivo-recebivel-detalhe/arquivo-recebivel-detalhe.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.0991051Z 10:46:34.098 DEBUG: 'src/app/components/convenente/arquivo-recebivel-detalhe/arquivo-recebivel-detalhe.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.0991537Z 10:46:34.098 DEBUG: Average line length for src/app/components/convenente/arquivo-recebivel-detalhe/arquivo-recebivel-detalhe.css is 13
2026-09-18T13:46:34.0993110Z 10:46:34.099 DEBUG: 'src/app/components/convenente/arquivo-recebivel-detalhe/arquivo-recebivel-detalhe.css' indexed with language 'css'
2026-09-18T13:46:34.0997333Z 10:46:34.099 DEBUG: 'src/app/components/convenente/convenente-alteracao/convenente-alteracao.component.html' indexed with language 'web'
2026-09-18T13:46:34.1006874Z 10:46:34.100 DEBUG: 'src/app/components/convenente/convenente-alteracao/convenente-alteracao.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1008830Z 10:46:34.100 DEBUG: 'src/app/components/convenente/convenente-alteracao/convenente-alteracao.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1015558Z 10:46:34.101 DEBUG: 'src/app/components/convenente/convenente-detalhe/convenente-detalhe.component.html' indexed with language 'web'
2026-09-18T13:46:34.1034638Z 10:46:34.103 DEBUG: 'src/app/components/convenente/convenente-detalhe/convenente-detalhe.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1037298Z 10:46:34.103 DEBUG: 'src/app/components/convenente/convenente-detalhe/convenente-detalhe.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1041596Z 10:46:34.104 DEBUG: 'src/app/components/convenente/convenente-inclusao/convenente-inclusao.component.html' indexed with language 'web'
2026-09-18T13:46:34.1053207Z 10:46:34.105 DEBUG: 'src/app/components/convenente/convenente-inclusao/convenente-inclusao.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1055826Z 10:46:34.105 DEBUG: 'src/app/components/convenente/convenente-inclusao/convenente-inclusao.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1059642Z 10:46:34.105 DEBUG: 'src/app/components/convenente/convenente-lista/convenente-lista.component.html' indexed with language 'web'
2026-09-18T13:46:34.1066839Z 10:46:34.106 DEBUG: 'src/app/components/convenente/convenente-lista/convenente-lista.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1071564Z 10:46:34.106 DEBUG: 'src/app/components/convenente/convenente-lista/convenente-lista.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1074553Z 10:46:34.107 DEBUG: 'src/app/components/convenente/convenente.module.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1081653Z 10:46:34.107 DEBUG: 'src/app/components/convenente/convenente.module.ts' indexed with language 'ts'
2026-09-18T13:46:34.1081863Z 10:46:34.107 DEBUG: File src/app/components/convenente/convenente.routing.module.ts was excluded by sonar.javascript.exclusions or sonar.typescript.exclusions
2026-09-18T13:46:34.1082229Z 10:46:34.107 DEBUG: 'src/app/components/convenente/convenente.routing.module.ts' excluded by org.sonar.plugins.javascript.filter.JavaScriptExclusionsFileFilter
2026-09-18T13:46:34.1086892Z 10:46:34.108 DEBUG: 'src/app/components/convenente/convenente.service.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1089201Z 10:46:34.108 DEBUG: 'src/app/components/convenente/convenente.service.ts' indexed with language 'ts'
2026-09-18T13:46:34.1093718Z 10:46:34.109 DEBUG: 'src/app/components/convenente/receber-arquivo-recebivel/receber-arquivo-recebivel.component.html' indexed with language 'web'
2026-09-18T13:46:34.1103901Z 10:46:34.110 DEBUG: 'src/app/components/convenente/receber-arquivo-recebivel/receber-arquivo-recebivel.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1106385Z 10:46:34.110 DEBUG: 'src/app/components/convenente/receber-arquivo-recebivel/receber-arquivo-recebivel.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1110730Z 10:46:34.110 DEBUG: 'src/app/components/convenio-shared/avaliacao-de-risco-dados-detalhe/avaliacao-risco-dados-detalhe.component.html' indexed with language 'web'
2026-09-18T13:46:34.1116575Z 10:46:34.111 DEBUG: 'src/app/components/convenio-shared/avaliacao-de-risco-dados-detalhe/avaliacao-risco-dados-detalhe.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1118883Z 10:46:34.111 DEBUG: 'src/app/components/convenio-shared/avaliacao-de-risco-dados-detalhe/avaliacao-risco-dados-detalhe.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1123017Z 10:46:34.112 DEBUG: 'src/app/components/convenio-shared/convenio-shared.module.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1130322Z 10:46:34.112 DEBUG: 'src/app/components/convenio-shared/convenio-shared.module.ts' indexed with language 'ts'
2026-09-18T13:46:34.1131998Z 10:46:34.112 DEBUG: 'src/app/components/convenio-shared/dados-detalhe/convenio-dados-detalhe.component.html' indexed with language 'web'
2026-09-18T13:46:34.1135001Z 10:46:34.113 DEBUG: 'src/app/components/convenio-shared/dados-detalhe/convenio-dados-detalhe.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1137153Z 10:46:34.113 DEBUG: 'src/app/components/convenio-shared/dados-detalhe/convenio-dados-detalhe.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1142867Z 10:46:34.114 DEBUG: 'src/app/components/convenio-shared/vinculos-convenio/desvinculos-convenio-dados-detalhe.component.html' indexed with language 'web'
2026-09-18T13:46:34.1149576Z 10:46:34.114 DEBUG: 'src/app/components/convenio-shared/vinculos-convenio/desvinculos-convenio-dados-detalhe.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1150107Z 10:46:34.114 DEBUG: 'src/app/components/convenio-shared/vinculos-convenio/desvinculos-convenio-dados-detalhe.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1164601Z 10:46:34.115 DEBUG: 'src/app/components/convenio-shared/vinculos-convenio/vinculos-convenio-dados-detalhe.component.html' indexed with language 'web'
2026-09-18T13:46:34.1170521Z 10:46:34.115 DEBUG: 'src/app/components/convenio-shared/vinculos-convenio/vinculos-convenio-dados-detalhe.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1171068Z 10:46:34.116 DEBUG: 'src/app/components/convenio-shared/vinculos-convenio/vinculos-convenio-dados-detalhe.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1180413Z 10:46:34.116 DEBUG: 'src/app/components/convenio/autorizar-fornecedor-caixa/autorizar-fornecedor-caixa-detalhe/autorizar-fornecedor-caixa-detalhe.component.html' indexed with language 'web'
2026-09-18T13:46:34.1180872Z 10:46:34.117 DEBUG: 'src/app/components/convenio/autorizar-fornecedor-caixa/autorizar-fornecedor-caixa-detalhe/autorizar-fornecedor-caixa-detalhe.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1183301Z 10:46:34.117 DEBUG: 'src/app/components/convenio/autorizar-fornecedor-caixa/autorizar-fornecedor-caixa-detalhe/autorizar-fornecedor-caixa-detalhe.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1183886Z 10:46:34.117 DEBUG: 'src/app/components/convenio/autorizar-fornecedor-caixa/autorizar-fornecedor-caixa.component.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1193283Z 10:46:34.118 DEBUG: Average line length for src/app/components/convenio/autorizar-fornecedor-caixa/autorizar-fornecedor-caixa.component.css is 14
2026-09-18T13:46:34.1193792Z 10:46:34.118 DEBUG: 'src/app/components/convenio/autorizar-fornecedor-caixa/autorizar-fornecedor-caixa.component.css' indexed with language 'css'
2026-09-18T13:46:34.1203645Z 10:46:34.119 DEBUG: 'src/app/components/convenio/autorizar-fornecedor-caixa/autorizar-fornecedor-caixa.component.html' indexed with language 'web'
2026-09-18T13:46:34.1204071Z 10:46:34.120 DEBUG: 'src/app/components/convenio/autorizar-fornecedor-caixa/autorizar-fornecedor-caixa.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1204421Z 10:46:34.120 DEBUG: 'src/app/components/convenio/autorizar-fornecedor-caixa/autorizar-fornecedor-caixa.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1210181Z 10:46:34.120 DEBUG: 'src/app/components/convenio/autorizar-fornecedor-convenente/autorizar-fornecedor-convenente-detalhe/autorizar-fornecedor-convenente-detalhe.component.html' indexed with language 'web'
2026-09-18T13:46:34.1216552Z 10:46:34.121 DEBUG: 'src/app/components/convenio/autorizar-fornecedor-convenente/autorizar-fornecedor-convenente-detalhe/autorizar-fornecedor-convenente-detalhe.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1224570Z 10:46:34.121 DEBUG: 'src/app/components/convenio/autorizar-fornecedor-convenente/autorizar-fornecedor-convenente-detalhe/autorizar-fornecedor-convenente-detalhe.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1228422Z 10:46:34.122 DEBUG: 'src/app/components/convenio/autorizar-fornecedor-convenente/autorizar-fornecedor-convenente.component.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1229526Z 10:46:34.122 DEBUG: Average line length for src/app/components/convenio/autorizar-fornecedor-convenente/autorizar-fornecedor-convenente.component.css is 15
2026-09-18T13:46:34.1229895Z 10:46:34.122 DEBUG: 'src/app/components/convenio/autorizar-fornecedor-convenente/autorizar-fornecedor-convenente.component.css' indexed with language 'css'
2026-09-18T13:46:34.1235060Z 10:46:34.123 DEBUG: 'src/app/components/convenio/autorizar-fornecedor-convenente/autorizar-fornecedor-convenente.component.html' indexed with language 'web'
2026-09-18T13:46:34.1243757Z 10:46:34.124 DEBUG: 'src/app/components/convenio/autorizar-fornecedor-convenente/autorizar-fornecedor-convenente.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1248470Z 10:46:34.124 DEBUG: 'src/app/components/convenio/autorizar-fornecedor-convenente/autorizar-fornecedor-convenente.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1250509Z 10:46:34.124 DEBUG: 'src/app/components/convenio/contrato-convenio-contrato/contrato-convenio-contrato.component.html' indexed with language 'web'
2026-09-18T13:46:34.1258323Z 10:46:34.125 DEBUG: 'src/app/components/convenio/contrato-convenio-contrato/contrato-convenio-contrato.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1259888Z 10:46:34.125 DEBUG: 'src/app/components/convenio/contrato-convenio-contrato/contrato-convenio-contrato.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1264072Z 10:46:34.126 DEBUG: 'src/app/components/convenio/convenio-detalhe/convenio-contrato-lista/convenio-contrato-lista.component.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1269509Z 10:46:34.126 DEBUG: Average line length for src/app/components/convenio/convenio-detalhe/convenio-contrato-lista/convenio-contrato-lista.component.css is 31
2026-09-18T13:46:34.1270052Z 10:46:34.126 DEBUG: 'src/app/components/convenio/convenio-detalhe/convenio-contrato-lista/convenio-contrato-lista.component.css' indexed with language 'css'
2026-09-18T13:46:34.1270414Z 10:46:34.126 DEBUG: 'src/app/components/convenio/convenio-detalhe/convenio-contrato-lista/convenio-contrato-lista.component.html' indexed with language 'web'
2026-09-18T13:46:34.1274979Z 10:46:34.127 DEBUG: 'src/app/components/convenio/convenio-detalhe/convenio-contrato-lista/convenio-contrato-lista.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1279961Z 10:46:34.127 DEBUG: 'src/app/components/convenio/convenio-detalhe/convenio-contrato-lista/convenio-contrato-lista.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1280291Z 10:46:34.127 DEBUG: 'src/app/components/convenio/convenio-detalhe/convenio-detalhe.component.html' indexed with language 'web'
2026-09-18T13:46:34.1287742Z 10:46:34.128 DEBUG: 'src/app/components/convenio/convenio-detalhe/convenio-detalhe.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1289671Z 10:46:34.128 DEBUG: 'src/app/components/convenio/convenio-detalhe/convenio-detalhe.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1300502Z 10:46:34.129 DEBUG: 'src/app/components/convenio/convenio-lista/convenio-lista.component.html' indexed with language 'web'
2026-09-18T13:46:34.1302312Z 10:46:34.130 DEBUG: 'src/app/components/convenio/convenio-lista/convenio-lista.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1304903Z 10:46:34.130 DEBUG: 'src/app/components/convenio/convenio-lista/convenio-lista.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1309051Z 10:46:34.130 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-autorizacao/convenio-autorizacao.component.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1309629Z 10:46:34.130 DEBUG: Average line length for src/app/components/convenio/convenio-wizard/convenio-autorizacao/convenio-autorizacao.component.css is 16
2026-09-18T13:46:34.1312434Z 10:46:34.131 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-autorizacao/convenio-autorizacao.component.css' indexed with language 'css'
2026-09-18T13:46:34.1315013Z 10:46:34.131 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-autorizacao/convenio-autorizacao.component.html' indexed with language 'web'
2026-09-18T13:46:34.1323561Z 10:46:34.132 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-autorizacao/convenio-autorizacao.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1324122Z 10:46:34.132 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-autorizacao/convenio-autorizacao.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1333993Z 10:46:34.132 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-acoes-botoes/cadastro-convenio-acoes-botoes/cadastro-convenio-acoes-botoes.component.html' indexed with language 'web'
2026-09-18T13:46:34.1349955Z 10:46:34.134 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-acoes-botoes/cadastro-convenio-acoes-botoes/cadastro-convenio-acoes-botoes.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1350597Z 10:46:34.134 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-acoes-botoes/cadastro-convenio-acoes-botoes/cadastro-convenio-acoes-botoes.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1393554Z 10:46:34.135 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-avaliacao/cadastro-convenio-avaliacao-vencida/cadastro-convenio-avaliacao-vencida.component.html' indexed with language 'web'
2026-09-18T13:46:34.1394197Z 10:46:34.135 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-avaliacao/cadastro-convenio-avaliacao-vencida/cadastro-convenio-avaliacao-vencida.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1394769Z 10:46:34.136 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-avaliacao/cadastro-convenio-avaliacao-vencida/cadastro-convenio-avaliacao-vencida.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1395198Z 10:46:34.136 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-avaliacao/cadastro-convenio-avaliacao/cadastro-convenio-avaliacao.component.html' indexed with language 'web'
2026-09-18T13:46:34.1395630Z 10:46:34.137 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-avaliacao/cadastro-convenio-avaliacao/cadastro-convenio-avaliacao.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1396045Z 10:46:34.137 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-avaliacao/cadastro-convenio-avaliacao/cadastro-convenio-avaliacao.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1396463Z 10:46:34.138 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-convenente/cadastro-convenio-convenente/cadastro-convenio-convenente.component.html' indexed with language 'web'
2026-09-18T13:46:34.1396917Z 10:46:34.139 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-convenente/cadastro-convenio-convenente/cadastro-convenio-convenente.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1397442Z 10:46:34.139 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-convenente/cadastro-convenio-convenente/cadastro-convenio-convenente.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1425998Z 10:46:34.139 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-dados/cadastro-convenio-dados/cadastro-convenio-dados.component.html' indexed with language 'web'
2026-09-18T13:46:34.1426464Z 10:46:34.141 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-dados/cadastro-convenio-dados/cadastro-convenio-dados.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1426887Z 10:46:34.141 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-dados/cadastro-convenio-dados/cadastro-convenio-dados.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1427315Z 10:46:34.142 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-em-alteracao-conformidade/cadastro-convenio-em-alteracao-conformidade.component.html' indexed with language 'web'
2026-09-18T13:46:34.1428604Z 10:46:34.142 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-em-alteracao-conformidade/cadastro-convenio-em-alteracao-conformidade.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1432246Z 10:46:34.143 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-em-alteracao-conformidade/cadastro-convenio-em-alteracao-conformidade.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1439781Z 10:46:34.143 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-em-alteracao/cadastro-em-alteracao/cadastro-convenio-em-alteracao.component.html' indexed with language 'web'
2026-09-18T13:46:34.1446744Z 10:46:34.144 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-em-alteracao/cadastro-em-alteracao/cadastro-convenio-em-alteracao.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1450602Z 10:46:34.144 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-em-alteracao/cadastro-em-alteracao/cadastro-convenio-em-alteracao.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1451465Z 10:46:34.145 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-em-cadastramento/cadastro-em-cadastramento/cadastro-convenio-em-cadastramento.component.html' indexed with language 'web'
2026-09-18T13:46:34.1462757Z 10:46:34.145 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-em-cadastramento/cadastro-em-cadastramento/cadastro-convenio-em-cadastramento.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1463585Z 10:46:34.145 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-em-cadastramento/cadastro-em-cadastramento/cadastro-convenio-em-cadastramento.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1469057Z 10:46:34.146 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-novo/cadastro-novo/cadastro-convenio-novo.component.html' indexed with language 'web'
2026-09-18T13:46:34.1471108Z 10:46:34.146 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-novo/cadastro-novo/cadastro-convenio-novo.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1472286Z 10:46:34.147 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-novo/cadastro-novo/cadastro-convenio-novo.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1478969Z 10:46:34.147 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/convenio-cadastro.component.html' indexed with language 'web'
2026-09-18T13:46:34.1503736Z 10:46:34.150 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/convenio-cadastro.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1506600Z 10:46:34.150 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/convenio-cadastro.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1511716Z 10:46:34.151 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/convenio-cadastro.service.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1514428Z 10:46:34.151 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/convenio-cadastro.service.ts' indexed with language 'ts'
2026-09-18T13:46:34.1517309Z 10:46:34.151 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-contrato/convenio-contrato.component.html' indexed with language 'web'
2026-09-18T13:46:34.1529343Z 10:46:34.152 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-contrato/convenio-contrato.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1536686Z 10:46:34.153 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-contrato/convenio-contrato.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1537071Z 10:46:34.153 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-wizard.component.html' indexed with language 'web'
2026-09-18T13:46:34.1540733Z 10:46:34.153 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-wizard.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1545998Z 10:46:34.154 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-wizard.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1555788Z 10:46:34.154 DEBUG: 'src/app/components/convenio/convenio.module.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1556237Z 10:46:34.155 DEBUG: 'src/app/components/convenio/convenio.module.ts' indexed with language 'ts'
2026-09-18T13:46:34.1556487Z 10:46:34.155 DEBUG: File src/app/components/convenio/convenio.routing.module.ts was excluded by sonar.javascript.exclusions or sonar.typescript.exclusions
2026-09-18T13:46:34.1556986Z 10:46:34.155 DEBUG: 'src/app/components/convenio/convenio.routing.module.ts' excluded by org.sonar.plugins.javascript.filter.JavaScriptExclusionsFileFilter
2026-09-18T13:46:34.1566579Z 10:46:34.156 DEBUG: 'src/app/components/convenio/convenio.service.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1566975Z 10:46:34.156 DEBUG: 'src/app/components/convenio/convenio.service.ts' indexed with language 'ts'
2026-09-18T13:46:34.1572829Z 10:46:34.157 DEBUG: 'src/app/components/convenio/termo-cadastramento-fornecedor/modal-assinar-termo-cadastramento-fornecedor/modal-assinar-termo-cadastramento-fornecedor.component.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1573430Z 10:46:34.157 DEBUG: Average line length for src/app/components/convenio/termo-cadastramento-fornecedor/modal-assinar-termo-cadastramento-fornecedor/modal-assinar-termo-cadastramento-fornecedor.component.css is 15
2026-09-18T13:46:34.1575377Z 10:46:34.157 DEBUG: 'src/app/components/convenio/termo-cadastramento-fornecedor/modal-assinar-termo-cadastramento-fornecedor/modal-assinar-termo-cadastramento-fornecedor.component.css' indexed with language 'css'
2026-09-18T13:46:34.1580537Z 10:46:34.157 DEBUG: 'src/app/components/convenio/termo-cadastramento-fornecedor/modal-assinar-termo-cadastramento-fornecedor/modal-assinar-termo-cadastramento-fornecedor.component.html' indexed with language 'web'
2026-09-18T13:46:34.1587552Z 10:46:34.158 DEBUG: 'src/app/components/convenio/termo-cadastramento-fornecedor/modal-assinar-termo-cadastramento-fornecedor/modal-assinar-termo-cadastramento-fornecedor.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1590156Z 10:46:34.158 DEBUG: 'src/app/components/convenio/termo-cadastramento-fornecedor/modal-assinar-termo-cadastramento-fornecedor/modal-assinar-termo-cadastramento-fornecedor.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1596126Z 10:46:34.159 DEBUG: 'src/app/components/convenio/termo-cadastramento-fornecedor/termo-cadastramento-fornecedor-detalhe/termo-cadastramento-fornecedor-detalhe.component.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1596768Z 10:46:34.159 DEBUG: Average line length for src/app/components/convenio/termo-cadastramento-fornecedor/termo-cadastramento-fornecedor-detalhe/termo-cadastramento-fornecedor-detalhe.component.css is 15
2026-09-18T13:46:34.1599186Z 10:46:34.159 DEBUG: 'src/app/components/convenio/termo-cadastramento-fornecedor/termo-cadastramento-fornecedor-detalhe/termo-cadastramento-fornecedor-detalhe.component.css' indexed with language 'css'
2026-09-18T13:46:34.1604139Z 10:46:34.160 DEBUG: 'src/app/components/convenio/termo-cadastramento-fornecedor/termo-cadastramento-fornecedor-detalhe/termo-cadastramento-fornecedor-detalhe.component.html' indexed with language 'web'
2026-09-18T13:46:34.1610534Z 10:46:34.160 DEBUG: 'src/app/components/convenio/termo-cadastramento-fornecedor/termo-cadastramento-fornecedor-detalhe/termo-cadastramento-fornecedor-detalhe.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1613410Z 10:46:34.161 DEBUG: 'src/app/components/convenio/termo-cadastramento-fornecedor/termo-cadastramento-fornecedor-detalhe/termo-cadastramento-fornecedor-detalhe.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1618299Z 10:46:34.161 DEBUG: 'src/app/components/convenio/termo-cadastramento-fornecedor/termo-cadastramento-fornecedor.component.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1622910Z 10:46:34.161 DEBUG: Average line length for src/app/components/convenio/termo-cadastramento-fornecedor/termo-cadastramento-fornecedor.component.css is 0
2026-09-18T13:46:34.1623266Z 10:46:34.161 DEBUG: 'src/app/components/convenio/termo-cadastramento-fornecedor/termo-cadastramento-fornecedor.component.css' indexed with language 'css'
2026-09-18T13:46:34.1625163Z 10:46:34.162 DEBUG: 'src/app/components/convenio/termo-cadastramento-fornecedor/termo-cadastramento-fornecedor.component.html' indexed with language 'web'
2026-09-18T13:46:34.1635031Z 10:46:34.163 DEBUG: 'src/app/components/convenio/termo-cadastramento-fornecedor/termo-cadastramento-fornecedor.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1635387Z 10:46:34.163 DEBUG: 'src/app/components/convenio/termo-cadastramento-fornecedor/termo-cadastramento-fornecedor.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1639194Z 10:46:34.163 DEBUG: 'src/app/components/data-table-custom/data-table-custom.service.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1640623Z 10:46:34.163 DEBUG: 'src/app/components/data-table-custom/data-table-custom.service.ts' indexed with language 'ts'
2026-09-18T13:46:34.1645009Z 10:46:34.164 DEBUG: 'src/app/components/data-table-custom/messages-data-table.service.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1646597Z 10:46:34.164 DEBUG: 'src/app/components/data-table-custom/messages-data-table.service.ts' indexed with language 'ts'
2026-09-18T13:46:34.1652511Z 10:46:34.165 DEBUG: 'src/app/components/fornecedor-shared/fornecedor-dados-detalhe/contas-fornecedor/contas-fornecedor-dados-detalhe-cabecalho.component.html' indexed with language 'web'
2026-09-18T13:46:34.1656122Z 10:46:34.165 DEBUG: 'src/app/components/fornecedor-shared/fornecedor-dados-detalhe/contas-fornecedor/contas-fornecedor-dados-detalhe-cabecalho.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1658434Z 10:46:34.165 DEBUG: 'src/app/components/fornecedor-shared/fornecedor-dados-detalhe/contas-fornecedor/contas-fornecedor-dados-detalhe-cabecalho.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1666444Z 10:46:34.166 DEBUG: 'src/app/components/fornecedor-shared/fornecedor-dados-detalhe/contato-fornecedor/contato-fornecedor-dados-detalhe-cabecalho.component.html' indexed with language 'web'
2026-09-18T13:46:34.1673209Z 10:46:34.166 DEBUG: 'src/app/components/fornecedor-shared/fornecedor-dados-detalhe/contato-fornecedor/contato-fornecedor-dados-detalhe-cabecalho.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1673735Z 10:46:34.167 DEBUG: 'src/app/components/fornecedor-shared/fornecedor-dados-detalhe/contato-fornecedor/contato-fornecedor-dados-detalhe-cabecalho.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1675451Z 10:46:34.167 DEBUG: 'src/app/components/fornecedor-shared/fornecedor-dados-detalhe/dados-detalhe-cabecalho/fornecedor-dados-detalhe-cabecalho.component.html' indexed with language 'web'
2026-09-18T13:46:34.1680163Z 10:46:34.167 DEBUG: 'src/app/components/fornecedor-shared/fornecedor-dados-detalhe/dados-detalhe-cabecalho/fornecedor-dados-detalhe-cabecalho.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1682553Z 10:46:34.168 DEBUG: 'src/app/components/fornecedor-shared/fornecedor-dados-detalhe/dados-detalhe-cabecalho/fornecedor-dados-detalhe-cabecalho.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1687463Z 10:46:34.168 DEBUG: 'src/app/components/fornecedor-shared/fornecedor-dados-detalhe/endereco-correspondencia-fornecedor/endereco-correspondencia-fornecedor-dados-detalhe-cabecalho.component.html' indexed with language 'web'
2026-09-18T13:46:34.1692928Z 10:46:34.169 DEBUG: 'src/app/components/fornecedor-shared/fornecedor-dados-detalhe/endereco-correspondencia-fornecedor/endereco-correspondencia-fornecedor-dados-detalhe-cabecalho.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1698666Z 10:46:34.169 DEBUG: 'src/app/components/fornecedor-shared/fornecedor-dados-detalhe/endereco-correspondencia-fornecedor/endereco-correspondencia-fornecedor-dados-detalhe-cabecalho.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1699360Z 10:46:34.169 DEBUG: 'src/app/components/fornecedor-shared/fornecedor-dados-detalhe/endereco-fornecedor/endereco-fornecedor-dados-detalhe-cabecalho.component.html' indexed with language 'web'
2026-09-18T13:46:34.1704396Z 10:46:34.170 DEBUG: 'src/app/components/fornecedor-shared/fornecedor-dados-detalhe/endereco-fornecedor/endereco-fornecedor-dados-detalhe-cabecalho.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1706770Z 10:46:34.170 DEBUG: 'src/app/components/fornecedor-shared/fornecedor-dados-detalhe/endereco-fornecedor/endereco-fornecedor-dados-detalhe-cabecalho.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1710182Z 10:46:34.170 DEBUG: 'src/app/components/fornecedor-shared/fornecedor-dados-detalhe/fornecedor-dados-detalhe.component.html' indexed with language 'web'
2026-09-18T13:46:34.1713564Z 10:46:34.171 DEBUG: 'src/app/components/fornecedor-shared/fornecedor-dados-detalhe/fornecedor-dados-detalhe.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1715533Z 10:46:34.171 DEBUG: 'src/app/components/fornecedor-shared/fornecedor-dados-detalhe/fornecedor-dados-detalhe.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1724073Z 10:46:34.171 DEBUG: 'src/app/components/fornecedor-shared/fornecedor-dados-detalhe/representante-fornecedor/representante-fornecedor-detalhe.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1724483Z 10:46:34.171 DEBUG: Average line length for src/app/components/fornecedor-shared/fornecedor-dados-detalhe/representante-fornecedor/representante-fornecedor-detalhe.css is 12
2026-09-18T13:46:34.1724866Z 10:46:34.172 DEBUG: 'src/app/components/fornecedor-shared/fornecedor-dados-detalhe/representante-fornecedor/representante-fornecedor-detalhe.css' indexed with language 'css'
2026-09-18T13:46:34.1726384Z 10:46:34.172 DEBUG: 'src/app/components/fornecedor-shared/fornecedor-dados-detalhe/representante-fornecedor/representante-fornecedor-detalhe.html' indexed with language 'web'
2026-09-18T13:46:34.1731859Z 10:46:34.173 DEBUG: 'src/app/components/fornecedor-shared/fornecedor-dados-detalhe/representante-fornecedor/representante-fornecedor-detalhe.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1734183Z 10:46:34.173 DEBUG: 'src/app/components/fornecedor-shared/fornecedor-dados-detalhe/representante-fornecedor/representante-fornecedor-detalhe.ts' indexed with language 'ts'
2026-09-18T13:46:34.1740135Z 10:46:34.173 DEBUG: 'src/app/components/fornecedor-shared/fornecedor-dados-detalhe/vinculos-fornecedor/desvinculos-fornecedor-dados-detalhe-cabecalho.component.html' indexed with language 'web'
2026-09-18T13:46:34.1746835Z 10:46:34.174 DEBUG: 'src/app/components/fornecedor-shared/fornecedor-dados-detalhe/vinculos-fornecedor/desvinculos-fornecedor-dados-detalhe-cabecalho.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1749362Z 10:46:34.174 DEBUG: 'src/app/components/fornecedor-shared/fornecedor-dados-detalhe/vinculos-fornecedor/desvinculos-fornecedor-dados-detalhe-cabecalho.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1753498Z 10:46:34.175 DEBUG: 'src/app/components/fornecedor-shared/fornecedor-dados-detalhe/vinculos-fornecedor/vinculos-fornecedor-dados-detalhe-cabecalho.component.html' indexed with language 'web'
2026-09-18T13:46:34.1758644Z 10:46:34.175 DEBUG: 'src/app/components/fornecedor-shared/fornecedor-dados-detalhe/vinculos-fornecedor/vinculos-fornecedor-dados-detalhe-cabecalho.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1760945Z 10:46:34.176 DEBUG: 'src/app/components/fornecedor-shared/fornecedor-dados-detalhe/vinculos-fornecedor/vinculos-fornecedor-dados-detalhe-cabecalho.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1768790Z 10:46:34.176 DEBUG: 'src/app/components/fornecedor-shared/fornecedor-shared.module.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1769673Z 10:46:34.176 DEBUG: 'src/app/components/fornecedor-shared/fornecedor-shared.module.ts' indexed with language 'ts'
2026-09-18T13:46:34.1774041Z 10:46:34.177 DEBUG: 'src/app/components/fornecedor/fornecedor-alteracao/contaCaixaSelecionavel.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1776220Z 10:46:34.177 DEBUG: 'src/app/components/fornecedor/fornecedor-alteracao/contaCaixaSelecionavel.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.1778660Z 10:46:34.177 DEBUG: 'src/app/components/fornecedor/fornecedor-alteracao/fornecedor-alteracao.component.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1779195Z 10:46:34.177 DEBUG: Average line length for src/app/components/fornecedor/fornecedor-alteracao/fornecedor-alteracao.component.css is 12
2026-09-18T13:46:34.1780954Z 10:46:34.178 DEBUG: 'src/app/components/fornecedor/fornecedor-alteracao/fornecedor-alteracao.component.css' indexed with language 'css'
2026-09-18T13:46:34.1783919Z 10:46:34.178 DEBUG: 'src/app/components/fornecedor/fornecedor-alteracao/fornecedor-alteracao.component.html' indexed with language 'web'
2026-09-18T13:46:34.1795520Z 10:46:34.179 DEBUG: 'src/app/components/fornecedor/fornecedor-alteracao/fornecedor-alteracao.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1797555Z 10:46:34.179 DEBUG: 'src/app/components/fornecedor/fornecedor-alteracao/fornecedor-alteracao.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1801141Z 10:46:34.180 DEBUG: 'src/app/components/fornecedor/fornecedor-detalhe/fornecedor-detalhe.component.html' indexed with language 'web'
2026-09-18T13:46:34.1805980Z 10:46:34.180 DEBUG: 'src/app/components/fornecedor/fornecedor-detalhe/fornecedor-detalhe.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1807791Z 10:46:34.180 DEBUG: 'src/app/components/fornecedor/fornecedor-detalhe/fornecedor-detalhe.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1811434Z 10:46:34.181 DEBUG: 'src/app/components/fornecedor/fornecedor-lista/fornecedor-lista.component.html' indexed with language 'web'
2026-09-18T13:46:34.1817013Z 10:46:34.181 DEBUG: 'src/app/components/fornecedor/fornecedor-lista/fornecedor-lista.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1818442Z 10:46:34.181 DEBUG: 'src/app/components/fornecedor/fornecedor-lista/fornecedor-lista.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1822119Z 10:46:34.182 DEBUG: 'src/app/components/fornecedor/fornecedor-resumo/fornecedor-resumo.component.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1822652Z 10:46:34.182 DEBUG: Average line length for src/app/components/fornecedor/fornecedor-resumo/fornecedor-resumo.component.css is 0
2026-09-18T13:46:34.1823996Z 10:46:34.182 DEBUG: 'src/app/components/fornecedor/fornecedor-resumo/fornecedor-resumo.component.css' indexed with language 'css'
2026-09-18T13:46:34.1826821Z 10:46:34.182 DEBUG: 'src/app/components/fornecedor/fornecedor-resumo/fornecedor-resumo.component.html' indexed with language 'web'
2026-09-18T13:46:34.1831414Z 10:46:34.183 DEBUG: 'src/app/components/fornecedor/fornecedor-resumo/fornecedor-resumo.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1838161Z 10:46:34.183 DEBUG: 'src/app/components/fornecedor/fornecedor-resumo/fornecedor-resumo.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.1840578Z 10:46:34.183 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-contas/contas-caixa/fornecedor-vinculacao-contas-caixa-alteracao.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1843132Z 10:46:34.184 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-contas/contas-caixa/fornecedor-vinculacao-contas-caixa-alteracao.ts' indexed with language 'ts'
2026-09-18T13:46:34.1848486Z 10:46:34.184 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-contas/contas-caixa/fornecedor-vinculacao-contas-caixa-inclusao.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1851247Z 10:46:34.185 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-contas/contas-caixa/fornecedor-vinculacao-contas-caixa-inclusao.ts' indexed with language 'ts'
2026-09-18T13:46:34.1855355Z 10:46:34.185 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-contas/contas-caixa/fornecedor-vinculacao-contas-caixa.html' indexed with language 'web'
2026-09-18T13:46:34.1862604Z 10:46:34.186 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-contas/contas-outros-bancos/fornecedor-vinculacao-contas-outros-bancos-alteracao.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1865390Z 10:46:34.186 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-contas/contas-outros-bancos/fornecedor-vinculacao-contas-outros-bancos-alteracao.ts' indexed with language 'ts'
2026-09-18T13:46:34.1871686Z 10:46:34.187 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-contas/contas-outros-bancos/fornecedor-vinculacao-contas-outros-bancos-inclusao.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1874479Z 10:46:34.187 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-contas/contas-outros-bancos/fornecedor-vinculacao-contas-outros-bancos-inclusao.ts' indexed with language 'ts'
2026-09-18T13:46:34.1878998Z 10:46:34.187 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-contas/contas-outros-bancos/fornecedor-vinculacao-contas-outros-bancos.html' indexed with language 'web'
2026-09-18T13:46:34.1883222Z 10:46:34.188 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-contato/fornecedor-vinculacao-manter-contato.html' indexed with language 'web'
2026-09-18T13:46:34.1888937Z 10:46:34.188 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-contato/fornecedor-vinculacao-manter-contato.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1890421Z 10:46:34.188 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-contato/fornecedor-vinculacao-manter-contato.ts' indexed with language 'ts'
2026-09-18T13:46:34.1895610Z 10:46:34.189 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-dados-basicos-fornecedor/fornecedor-vinculacao-manter-dados-basicos-fornecedor.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1896247Z 10:46:34.189 DEBUG: Average line length for src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-dados-basicos-fornecedor/fornecedor-vinculacao-manter-dados-basicos-fornecedor.css is 12
2026-09-18T13:46:34.1949490Z 10:46:34.189 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-dados-basicos-fornecedor/fornecedor-vinculacao-manter-dados-basicos-fornecedor.css' indexed with language 'css'
2026-09-18T13:46:34.1950219Z 10:46:34.190 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-dados-basicos-fornecedor/fornecedor-vinculacao-manter-dados-basicos-fornecedor.html' indexed with language 'web'
2026-09-18T13:46:34.1950678Z 10:46:34.190 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-dados-basicos-fornecedor/fornecedor-vinculacao-manter-dados-basicos-fornecedor.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1951142Z 10:46:34.191 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-dados-basicos-fornecedor/fornecedor-vinculacao-manter-dados-basicos-fornecedor.ts' indexed with language 'ts'
2026-09-18T13:46:34.1951575Z 10:46:34.191 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-dados-convenio/fornecedor-vinculacao-manter-dados-convenio.html' indexed with language 'web'
2026-09-18T13:46:34.1952003Z 10:46:34.191 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-dados-convenio/fornecedor-vinculacao-manter-dados-convenio.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1952549Z 10:46:34.192 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-dados-convenio/fornecedor-vinculacao-manter-dados-convenio.ts' indexed with language 'ts'
2026-09-18T13:46:34.1953011Z 10:46:34.192 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-endereco-correspondencia/fornecedor-vinculacao-manter-endereco-correspondencia.html' indexed with language 'web'
2026-09-18T13:46:34.1953579Z 10:46:34.193 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-endereco-correspondencia/fornecedor-vinculacao-manter-endereco-correspondencia.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1954216Z 10:46:34.193 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-endereco-correspondencia/fornecedor-vinculacao-manter-endereco-correspondencia.ts' indexed with language 'ts'
2026-09-18T13:46:34.1954635Z 10:46:34.193 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-representante/fornecedor-vinculacao-manter-representante.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1955051Z 10:46:34.194 DEBUG: Average line length for src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-representante/fornecedor-vinculacao-manter-representante.css is 12
2026-09-18T13:46:34.1955456Z 10:46:34.194 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-representante/fornecedor-vinculacao-manter-representante.css' indexed with language 'css'
2026-09-18T13:46:34.1955863Z 10:46:34.194 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-representante/fornecedor-vinculacao-manter-representante.html' indexed with language 'web'
2026-09-18T13:46:34.1956712Z 10:46:34.195 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-representante/fornecedor-vinculacao-manter-representante.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1958404Z 10:46:34.195 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-representante/fornecedor-vinculacao-manter-representante.ts' indexed with language 'ts'
2026-09-18T13:46:34.1965184Z 10:46:34.196 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-representantes-assinam-externa/fornecedor-vinculacao-manter-representantes-assinam-externa.html' indexed with language 'web'
2026-09-18T13:46:34.1970525Z 10:46:34.196 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-representantes-assinam-externa/fornecedor-vinculacao-manter-representantes-assinam-externa.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1972551Z 10:46:34.197 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-representantes-assinam-externa/fornecedor-vinculacao-manter-representantes-assinam-externa.ts' indexed with language 'ts'
2026-09-18T13:46:34.1979091Z 10:46:34.197 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-testemunhas/fornecedor-vinculacao-manter-testemunhas.html' indexed with language 'web'
2026-09-18T13:46:34.1985976Z 10:46:34.198 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-testemunhas/fornecedor-vinculacao-manter-testemunhas.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1989647Z 10:46:34.198 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-testemunhas/fornecedor-vinculacao-manter-testemunhas.ts' indexed with language 'ts'
2026-09-18T13:46:34.1993573Z 10:46:34.199 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter.component.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.1994281Z 10:46:34.199 DEBUG: Average line length for src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter.component.css is 17
2026-09-18T13:46:34.1995950Z 10:46:34.199 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter.component.css' indexed with language 'css'
2026-09-18T13:46:34.2000469Z 10:46:34.199 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter.component.html' indexed with language 'web'
2026-09-18T13:46:34.2008152Z 10:46:34.200 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2010712Z 10:46:34.200 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.2014690Z 10:46:34.201 DEBUG: 'src/app/components/fornecedor/fornecedor.module.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2017599Z 10:46:34.201 DEBUG: 'src/app/components/fornecedor/fornecedor.module.ts' indexed with language 'ts'
2026-09-18T13:46:34.2018769Z 10:46:34.201 DEBUG: File src/app/components/fornecedor/fornecedor.routing.module.ts was excluded by sonar.javascript.exclusions or sonar.typescript.exclusions
2026-09-18T13:46:34.2019243Z 10:46:34.201 DEBUG: 'src/app/components/fornecedor/fornecedor.routing.module.ts' excluded by org.sonar.plugins.javascript.filter.JavaScriptExclusionsFileFilter
2026-09-18T13:46:34.2024464Z 10:46:34.202 DEBUG: 'src/app/components/fornecedor/fornecedor.service.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2026963Z 10:46:34.202 DEBUG: 'src/app/components/fornecedor/fornecedor.service.ts' indexed with language 'ts'
2026-09-18T13:46:34.2030986Z 10:46:34.203 DEBUG: 'src/app/components/fornecedor/representante.service.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2033781Z 10:46:34.203 DEBUG: 'src/app/components/fornecedor/representante.service.ts' indexed with language 'ts'
2026-09-18T13:46:34.2043277Z 10:46:34.204 DEBUG: 'src/app/components/fornecedor/vinculacao.service.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2044620Z 10:46:34.204 DEBUG: 'src/app/components/fornecedor/vinculacao.service.ts' indexed with language 'ts'
2026-09-18T13:46:34.2050454Z 10:46:34.204 DEBUG: 'src/app/components/historico/historico.component.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2050636Z 10:46:34.204 DEBUG: Average line length for src/app/components/historico/historico.component.css is 12
2026-09-18T13:46:34.2050943Z 10:46:34.205 DEBUG: 'src/app/components/historico/historico.component.css' indexed with language 'css'
2026-09-18T13:46:34.2054558Z 10:46:34.205 DEBUG: 'src/app/components/historico/historico.component.html' indexed with language 'web'
2026-09-18T13:46:34.2057865Z 10:46:34.205 DEBUG: 'src/app/components/historico/historico.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2060465Z 10:46:34.205 DEBUG: 'src/app/components/historico/historico.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.2062697Z 10:46:34.206 DEBUG: 'src/app/components/historico/historico.module.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2068841Z 10:46:34.206 DEBUG: 'src/app/components/historico/historico.module.ts' indexed with language 'ts'
2026-09-18T13:46:34.2069132Z 10:46:34.206 DEBUG: 'src/app/components/historico/historico.service.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2069417Z 10:46:34.206 DEBUG: 'src/app/components/historico/historico.service.ts' indexed with language 'ts'
2026-09-18T13:46:34.2074746Z 10:46:34.207 DEBUG: 'src/app/components/home/home.component.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2077311Z 10:46:34.207 DEBUG: Average line length for src/app/components/home/home.component.css is 14
2026-09-18T13:46:34.2079677Z 10:46:34.207 DEBUG: 'src/app/components/home/home.component.css' indexed with language 'css'
2026-09-18T13:46:34.2081894Z 10:46:34.208 DEBUG: 'src/app/components/home/home.component.html' indexed with language 'web'
2026-09-18T13:46:34.2086845Z 10:46:34.208 DEBUG: 'src/app/components/home/home.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2088829Z 10:46:34.208 DEBUG: 'src/app/components/home/home.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.2092040Z 10:46:34.209 DEBUG: 'src/app/components/home/home.module.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2093738Z 10:46:34.209 DEBUG: 'src/app/components/home/home.module.ts' indexed with language 'ts'
2026-09-18T13:46:34.2095676Z 10:46:34.209 DEBUG: File src/app/components/home/home.routing.module.ts was excluded by sonar.javascript.exclusions or sonar.typescript.exclusions
2026-09-18T13:46:34.2096190Z 10:46:34.209 DEBUG: 'src/app/components/home/home.routing.module.ts' excluded by org.sonar.plugins.javascript.filter.JavaScriptExclusionsFileFilter
2026-09-18T13:46:34.2098501Z 10:46:34.209 DEBUG: 'src/app/components/input/input.component.html' indexed with language 'web'
2026-09-18T13:46:34.2102759Z 10:46:34.210 DEBUG: 'src/app/components/input/input.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2104516Z 10:46:34.210 DEBUG: 'src/app/components/input/input.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.2107405Z 10:46:34.210 DEBUG: 'src/app/components/input/input.module.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2108792Z 10:46:34.210 DEBUG: 'src/app/components/input/input.module.ts' indexed with language 'ts'
2026-09-18T13:46:34.2112878Z 10:46:34.211 DEBUG: 'src/app/components/menu-funcionalidades/menu-funcionalidades.component.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2113651Z 10:46:34.211 DEBUG: Average line length for src/app/components/menu-funcionalidades/menu-funcionalidades.component.css is 20
2026-09-18T13:46:34.2115551Z 10:46:34.211 DEBUG: 'src/app/components/menu-funcionalidades/menu-funcionalidades.component.css' indexed with language 'css'
2026-09-18T13:46:34.2118313Z 10:46:34.211 DEBUG: 'src/app/components/menu-funcionalidades/menu-funcionalidades.component.html' indexed with language 'web'
2026-09-18T13:46:34.2122040Z 10:46:34.212 DEBUG: 'src/app/components/menu-funcionalidades/menu-funcionalidades.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2123609Z 10:46:34.212 DEBUG: 'src/app/components/menu-funcionalidades/menu-funcionalidades.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.2126888Z 10:46:34.212 DEBUG: 'src/app/components/menu-funcionalidades/menu-funcionalidades.module.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2129749Z 10:46:34.212 DEBUG: 'src/app/components/menu-funcionalidades/menu-funcionalidades.module.ts' indexed with language 'ts'
2026-09-18T13:46:34.2131956Z 10:46:34.213 DEBUG: 'src/app/components/menu-funcionalidades/menu-internet/menu-internet.component.html' indexed with language 'web'
2026-09-18T13:46:34.2135835Z 10:46:34.213 DEBUG: 'src/app/components/menu-funcionalidades/menu-internet/menu-internet.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2137188Z 10:46:34.213 DEBUG: 'src/app/components/menu-funcionalidades/menu-internet/menu-internet.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.2140931Z 10:46:34.214 DEBUG: 'src/app/components/menu-funcionalidades/menu-internet/menu-internet.module.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2142704Z 10:46:34.214 DEBUG: 'src/app/components/menu-funcionalidades/menu-internet/menu-internet.module.ts' indexed with language 'ts'
2026-09-18T13:46:34.2145880Z 10:46:34.214 DEBUG: 'src/app/components/menu-funcionalidades/menu-intranet/menu-intranet.component.html' indexed with language 'web'
2026-09-18T13:46:34.2152190Z 10:46:34.214 DEBUG: 'src/app/components/menu-funcionalidades/menu-intranet/menu-intranet.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2152562Z 10:46:34.215 DEBUG: 'src/app/components/menu-funcionalidades/menu-intranet/menu-intranet.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.2155253Z 10:46:34.215 DEBUG: 'src/app/components/menu-funcionalidades/menu-intranet/menu-intranet.module.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2156688Z 10:46:34.215 DEBUG: 'src/app/components/menu-funcionalidades/menu-intranet/menu-intranet.module.ts' indexed with language 'ts'
2026-09-18T13:46:34.2162555Z 10:46:34.216 DEBUG: 'src/app/components/menu/menu-item/menu-item.component.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2162960Z 10:46:34.216 DEBUG: Average line length for src/app/components/menu/menu-item/menu-item.component.css is 16
2026-09-18T13:46:34.2164123Z 10:46:34.216 DEBUG: 'src/app/components/menu/menu-item/menu-item.component.css' indexed with language 'css'
2026-09-18T13:46:34.2167031Z 10:46:34.216 DEBUG: 'src/app/components/menu/menu-item/menu-item.component.html' indexed with language 'web'
2026-09-18T13:46:34.2172497Z 10:46:34.217 DEBUG: 'src/app/components/menu/menu-item/menu-item.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2174119Z 10:46:34.217 DEBUG: 'src/app/components/menu/menu-item/menu-item.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.2176519Z 10:46:34.217 DEBUG: 'src/app/components/menu/menu.component.html' indexed with language 'web'
2026-09-18T13:46:34.2180281Z 10:46:34.217 DEBUG: 'src/app/components/menu/menu.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2181594Z 10:46:34.218 DEBUG: 'src/app/components/menu/menu.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.2185119Z 10:46:34.218 DEBUG: 'src/app/components/menu/menu.module.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2186097Z 10:46:34.218 DEBUG: 'src/app/components/menu/menu.module.ts' indexed with language 'ts'
2026-09-18T13:46:34.2189335Z 10:46:34.218 DEBUG: 'src/app/components/menu/menu.service.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2190325Z 10:46:34.218 DEBUG: 'src/app/components/menu/menu.service.ts' indexed with language 'ts'
2026-09-18T13:46:34.2193961Z 10:46:34.219 DEBUG: 'src/app/components/modal/modal.component.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2194326Z 10:46:34.219 DEBUG: Average line length for src/app/components/modal/modal.component.css is 0
2026-09-18T13:46:34.2195539Z 10:46:34.219 DEBUG: 'src/app/components/modal/modal.component.css' indexed with language 'css'
2026-09-18T13:46:34.2197630Z 10:46:34.219 DEBUG: 'src/app/components/modal/modal.component.html' indexed with language 'web'
2026-09-18T13:46:34.2200835Z 10:46:34.220 DEBUG: 'src/app/components/modal/modal.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2203071Z 10:46:34.220 DEBUG: 'src/app/components/modal/modal.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.2205908Z 10:46:34.220 DEBUG: 'src/app/components/modal/modal.module.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2207779Z 10:46:34.220 DEBUG: 'src/app/components/modal/modal.module.ts' indexed with language 'ts'
2026-09-18T13:46:34.2211851Z 10:46:34.220 DEBUG: 'src/app/components/modal/modal.service.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2212512Z 10:46:34.221 DEBUG: 'src/app/components/modal/modal.service.ts' indexed with language 'ts'
2026-09-18T13:46:34.2215192Z 10:46:34.221 DEBUG: 'src/app/components/otp/otp-envio-email/otp-envio-email.component.html' indexed with language 'web'
2026-09-18T13:46:34.2218516Z 10:46:34.221 DEBUG: 'src/app/components/otp/otp-envio-email/otp-envio-email.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2231559Z 10:46:34.221 DEBUG: 'src/app/components/otp/otp-envio-email/otp-envio-email.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.2232239Z 10:46:34.222 DEBUG: 'src/app/components/otp/otp.component.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2232663Z 10:46:34.222 DEBUG: Average line length for src/app/components/otp/otp.component.css is 0
2026-09-18T13:46:34.2233065Z 10:46:34.222 DEBUG: 'src/app/components/otp/otp.component.css' indexed with language 'css'
2026-09-18T13:46:34.2233484Z 10:46:34.222 DEBUG: 'src/app/components/otp/otp.component.html' indexed with language 'web'
2026-09-18T13:46:34.2233948Z 10:46:34.222 DEBUG: 'src/app/components/otp/otp.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2234443Z 10:46:34.223 DEBUG: 'src/app/components/otp/otp.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.2236007Z 10:46:34.223 DEBUG: 'src/app/components/otp/otp.module.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2236465Z 10:46:34.223 DEBUG: 'src/app/components/otp/otp.module.ts' indexed with language 'ts'
2026-09-18T13:46:34.2238851Z 10:46:34.223 DEBUG: 'src/app/components/otp/otp.service.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2239516Z 10:46:34.223 DEBUG: 'src/app/components/otp/otp.service.ts' indexed with language 'ts'
2026-09-18T13:46:34.2244537Z 10:46:34.224 DEBUG: 'src/app/components/page-error/page-403/page-403.component.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2245111Z 10:46:34.224 DEBUG: Average line length for src/app/components/page-error/page-403/page-403.component.css is 15
2026-09-18T13:46:34.2245556Z 10:46:34.224 DEBUG: 'src/app/components/page-error/page-403/page-403.component.css' indexed with language 'css'
2026-09-18T13:46:34.2252612Z 10:46:34.224 DEBUG: 'src/app/components/page-error/page-403/page-403.component.html' indexed with language 'web'
2026-09-18T13:46:34.2254974Z 10:46:34.224 DEBUG: 'src/app/components/page-error/page-403/page-403.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2255296Z 10:46:34.225 DEBUG: 'src/app/components/page-error/page-403/page-403.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.2255609Z 10:46:34.225 DEBUG: 'src/app/components/page-error/page-error.module.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2256000Z 10:46:34.225 DEBUG: 'src/app/components/page-error/page-error.module.ts' indexed with language 'ts'
2026-09-18T13:46:34.2257726Z 10:46:34.225 DEBUG: File src/app/components/page-error/page-error.routing.module.ts was excluded by sonar.javascript.exclusions or sonar.typescript.exclusions
2026-09-18T13:46:34.2258061Z 10:46:34.225 DEBUG: 'src/app/components/page-error/page-error.routing.module.ts' excluded by org.sonar.plugins.javascript.filter.JavaScriptExclusionsFileFilter
2026-09-18T13:46:34.2260633Z 10:46:34.225 DEBUG: 'src/app/components/paginacao/consulta-paginada.interface.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2262502Z 10:46:34.226 DEBUG: 'src/app/components/paginacao/consulta-paginada.interface.ts' indexed with language 'ts'
2026-09-18T13:46:34.2265229Z 10:46:34.226 DEBUG: 'src/app/components/paginacao/consulta-paginada.service.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2266658Z 10:46:34.226 DEBUG: 'src/app/components/paginacao/consulta-paginada.service.ts' indexed with language 'ts'
2026-09-18T13:46:34.2271384Z 10:46:34.226 DEBUG: 'src/app/components/paginacao/page-data.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2271714Z 10:46:34.226 DEBUG: 'src/app/components/paginacao/page-data.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.2274013Z 10:46:34.227 DEBUG: 'src/app/components/paginacao/page.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2274924Z 10:46:34.227 DEBUG: 'src/app/components/paginacao/page.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.2277809Z 10:46:34.227 DEBUG: 'src/app/components/paginacao/paginacao-convenio-detalhe.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2278799Z 10:46:34.227 DEBUG: 'src/app/components/paginacao/paginacao-convenio-detalhe.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.2281808Z 10:46:34.228 DEBUG: 'src/app/components/paginacao/paginacao.module.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2283140Z 10:46:34.228 DEBUG: 'src/app/components/paginacao/paginacao.module.ts' indexed with language 'ts'
2026-09-18T13:46:34.2288501Z 10:46:34.228 DEBUG: 'src/app/components/paginacao/paginacao.service.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2289284Z 10:46:34.228 DEBUG: 'src/app/components/paginacao/paginacao.service.ts' indexed with language 'ts'
2026-09-18T13:46:34.2297000Z 10:46:34.229 DEBUG: 'src/app/components/parametros/encargos-atraso/encargos-atraso-alterar/encargos-atraso-alterar.component.html' indexed with language 'web'
2026-09-18T13:46:34.2300053Z 10:46:34.229 DEBUG: 'src/app/components/parametros/encargos-atraso/encargos-atraso-alterar/encargos-atraso-alterar.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2307157Z 10:46:34.230 DEBUG: 'src/app/components/parametros/encargos-atraso/encargos-atraso-alterar/encargos-atraso-alterar.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.2307502Z 10:46:34.230 DEBUG: 'src/app/components/parametros/encargos-atraso/encargos-atraso.component.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2307871Z 10:46:34.230 DEBUG: Average line length for src/app/components/parametros/encargos-atraso/encargos-atraso.component.css is 25
2026-09-18T13:46:34.2308186Z 10:46:34.230 DEBUG: 'src/app/components/parametros/encargos-atraso/encargos-atraso.component.css' indexed with language 'css'
2026-09-18T13:46:34.2393828Z 10:46:34.230 DEBUG: 'src/app/components/parametros/encargos-atraso/encargos-atraso.component.html' indexed with language 'web'
2026-09-18T13:46:34.2394337Z 10:46:34.231 DEBUG: 'src/app/components/parametros/encargos-atraso/encargos-atraso.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2394661Z 10:46:34.231 DEBUG: 'src/app/components/parametros/encargos-atraso/encargos-atraso.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.2394990Z 10:46:34.231 DEBUG: 'src/app/components/parametros/encargos-atraso/encargos-atraso.service.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2395302Z 10:46:34.232 DEBUG: 'src/app/components/parametros/encargos-atraso/encargos-atraso.service.ts' indexed with language 'ts'
2026-09-18T13:46:34.2395599Z 10:46:34.232 DEBUG: 'src/app/components/parametros/parametro-produto-criar/parametro-produto-criar.component.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2396116Z 10:46:34.232 DEBUG: Average line length for src/app/components/parametros/parametro-produto-criar/parametro-produto-criar.component.css is 12
2026-09-18T13:46:34.2396447Z 10:46:34.232 DEBUG: 'src/app/components/parametros/parametro-produto-criar/parametro-produto-criar.component.css' indexed with language 'css'
2026-09-18T13:46:34.2396798Z 10:46:34.233 DEBUG: 'src/app/components/parametros/parametro-produto-criar/parametro-produto-criar.component.html' indexed with language 'web'
2026-09-18T13:46:34.2397154Z 10:46:34.234 DEBUG: 'src/app/components/parametros/parametro-produto-criar/parametro-produto-criar.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2397515Z 10:46:34.234 DEBUG: 'src/app/components/parametros/parametro-produto-criar/parametro-produto-criar.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.2397866Z 10:46:34.234 DEBUG: 'src/app/components/parametros/parametro-produto/parametro-produto.component.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2398196Z 10:46:34.234 DEBUG: Average line length for src/app/components/parametros/parametro-produto/parametro-produto.component.css is 11
2026-09-18T13:46:34.2398691Z 10:46:34.235 DEBUG: 'src/app/components/parametros/parametro-produto/parametro-produto.component.css' indexed with language 'css'
2026-09-18T13:46:34.2399053Z 10:46:34.235 DEBUG: 'src/app/components/parametros/parametro-produto/parametro-produto.component.html' indexed with language 'web'
2026-09-18T13:46:34.2399344Z 10:46:34.236 DEBUG: 'src/app/components/parametros/parametro-produto/parametro-produto.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2399675Z 10:46:34.236 DEBUG: 'src/app/components/parametros/parametro-produto/parametro-produto.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.2400051Z 10:46:34.236 DEBUG: 'src/app/components/parametros/parametro-produto/parametro-produto.service.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2400421Z 10:46:34.236 DEBUG: 'src/app/components/parametros/parametro-produto/parametro-produto.service.ts' indexed with language 'ts'
2026-09-18T13:46:34.2400757Z 10:46:34.237 DEBUG: 'src/app/components/parametros/parametros-lista/parametro-lista.component.html' indexed with language 'web'
2026-09-18T13:46:34.2401072Z 10:46:34.237 DEBUG: 'src/app/components/parametros/parametros-lista/parametro-lista.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2401443Z 10:46:34.238 DEBUG: 'src/app/components/parametros/parametros-lista/parametro-lista.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.2401937Z 10:46:34.239 DEBUG: 'src/app/components/parametros/parametros.module.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2402259Z 10:46:34.239 DEBUG: 'src/app/components/parametros/parametros.module.ts' indexed with language 'ts'
2026-09-18T13:46:34.2402684Z 10:46:34.239 DEBUG: File src/app/components/parametros/parametros.routing.module.ts was excluded by sonar.javascript.exclusions or sonar.typescript.exclusions
2026-09-18T13:46:34.2403103Z 10:46:34.239 DEBUG: 'src/app/components/parametros/parametros.routing.module.ts' excluded by org.sonar.plugins.javascript.filter.JavaScriptExclusionsFileFilter
2026-09-18T13:46:34.2403423Z 10:46:34.240 DEBUG: 'src/app/components/parametros/programa.service.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2403812Z 10:46:34.240 DEBUG: 'src/app/components/parametros/programa.service.ts' indexed with language 'ts'
2026-09-18T13:46:34.2513514Z 10:46:34.240 DEBUG: 'src/app/components/perfil-acesso/perfil-acesso.component.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2623701Z 10:46:34.240 DEBUG: Average line length for src/app/components/perfil-acesso/perfil-acesso.component.css is 15
2026-09-18T13:46:34.2624245Z 10:46:34.240 DEBUG: 'src/app/components/perfil-acesso/perfil-acesso.component.css' indexed with language 'css'
2026-09-18T13:46:34.2624551Z 10:46:34.241 DEBUG: 'src/app/components/perfil-acesso/perfil-acesso.component.html' indexed with language 'web'
2026-09-18T13:46:34.2625259Z 10:46:34.241 DEBUG: 'src/app/components/perfil-acesso/perfil-acesso.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2625590Z 10:46:34.241 DEBUG: 'src/app/components/perfil-acesso/perfil-acesso.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.2625882Z 10:46:34.242 DEBUG: 'src/app/components/perfil-selecao/perfil-selecao.component.html' indexed with language 'web'
2026-09-18T13:46:34.2626193Z 10:46:34.242 DEBUG: 'src/app/components/perfil-selecao/perfil-selecao.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2626485Z 10:46:34.242 DEBUG: 'src/app/components/perfil-selecao/perfil-selecao.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.2626748Z 10:46:34.243 DEBUG: 'src/app/components/perfil-selecao/perfil-selecao.module.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2627078Z 10:46:34.243 DEBUG: 'src/app/components/perfil-selecao/perfil-selecao.module.ts' indexed with language 'ts'
2026-09-18T13:46:34.2627433Z 10:46:34.243 DEBUG: 'src/app/components/recebivel/recebivel-detalhe/recebivel-detalhe-cessao.component.html' indexed with language 'web'
2026-09-18T13:46:34.2627769Z 10:46:34.244 DEBUG: 'src/app/components/recebivel/recebivel-detalhe/recebivel-detalhe-cessao.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2628163Z 10:46:34.244 DEBUG: 'src/app/components/recebivel/recebivel-detalhe/recebivel-detalhe-cessao.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.2628510Z 10:46:34.244 DEBUG: 'src/app/components/recebivel/recebivel-detalhe/recebivel-detalhe-convenente.component.html' indexed with language 'web'
2026-09-18T13:46:34.2628848Z 10:46:34.244 DEBUG: 'src/app/components/recebivel/recebivel-detalhe/recebivel-detalhe-convenente.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2629178Z 10:46:34.245 DEBUG: 'src/app/components/recebivel/recebivel-detalhe/recebivel-detalhe-convenente.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.2629502Z 10:46:34.245 DEBUG: 'src/app/components/recebivel/recebivel-detalhe/recebivel-detalhe-dados.component.html' indexed with language 'web'
2026-09-18T13:46:34.2629915Z 10:46:34.245 DEBUG: 'src/app/components/recebivel/recebivel-detalhe/recebivel-detalhe-dados.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2630205Z 10:46:34.245 DEBUG: 'src/app/components/recebivel/recebivel-detalhe/recebivel-detalhe-dados.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.2630608Z 10:46:34.246 DEBUG: 'src/app/components/recebivel/recebivel-detalhe/recebivel-detalhe-estorno.component.html' indexed with language 'web'
2026-09-18T13:46:34.2630937Z 10:46:34.246 DEBUG: 'src/app/components/recebivel/recebivel-detalhe/recebivel-detalhe-estorno.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2631301Z 10:46:34.246 DEBUG: 'src/app/components/recebivel/recebivel-detalhe/recebivel-detalhe-estorno.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.2631629Z 10:46:34.246 DEBUG: 'src/app/components/recebivel/recebivel-detalhe/recebivel-detalhe-fornecedor.component.html' indexed with language 'web'
2026-09-18T13:46:34.2631993Z 10:46:34.247 DEBUG: 'src/app/components/recebivel/recebivel-detalhe/recebivel-detalhe-fornecedor.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2632349Z 10:46:34.247 DEBUG: 'src/app/components/recebivel/recebivel-detalhe/recebivel-detalhe-fornecedor.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.2632799Z 10:46:34.247 DEBUG: 'src/app/components/recebivel/recebivel-detalhe/recebivel-detalhe-identificacao.component.html' indexed with language 'web'
2026-09-18T13:46:34.2633171Z 10:46:34.248 DEBUG: 'src/app/components/recebivel/recebivel-detalhe/recebivel-detalhe-identificacao.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2633504Z 10:46:34.248 DEBUG: 'src/app/components/recebivel/recebivel-detalhe/recebivel-detalhe-identificacao.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.2633889Z 10:46:34.248 DEBUG: 'src/app/components/recebivel/recebivel-detalhe/recebivel-detalhe-liquidado.component.html' indexed with language 'web'
2026-09-18T13:46:34.2634245Z 10:46:34.248 DEBUG: 'src/app/components/recebivel/recebivel-detalhe/recebivel-detalhe-liquidado.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2634597Z 10:46:34.249 DEBUG: 'src/app/components/recebivel/recebivel-detalhe/recebivel-detalhe-liquidado.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.2634918Z 10:46:34.249 DEBUG: 'src/app/components/recebivel/recebivel-detalhe/recebivel-detalhe-vencido.component.html' indexed with language 'web'
2026-09-18T13:46:34.2635247Z 10:46:34.249 DEBUG: 'src/app/components/recebivel/recebivel-detalhe/recebivel-detalhe-vencido.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2635569Z 10:46:34.249 DEBUG: 'src/app/components/recebivel/recebivel-detalhe/recebivel-detalhe-vencido.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.2635886Z 10:46:34.250 DEBUG: 'src/app/components/recebivel/recebivel-detalhe/recebivel-detalhe.component.html' indexed with language 'web'
2026-09-18T13:46:34.2636207Z 10:46:34.250 DEBUG: 'src/app/components/recebivel/recebivel-detalhe/recebivel-detalhe.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2636528Z 10:46:34.250 DEBUG: 'src/app/components/recebivel/recebivel-detalhe/recebivel-detalhe.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.2636847Z 10:46:34.251 DEBUG: 'src/app/components/recebivel/recebivel-lista/recebivel-lista.component.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2637129Z 10:46:34.251 DEBUG: Average line length for src/app/components/recebivel/recebivel-lista/recebivel-lista.component.css is 20
2026-09-18T13:46:34.2637455Z 10:46:34.251 DEBUG: 'src/app/components/recebivel/recebivel-lista/recebivel-lista.component.css' indexed with language 'css'
2026-09-18T13:46:34.2637830Z 10:46:34.251 DEBUG: 'src/app/components/recebivel/recebivel-lista/recebivel-lista.component.html' indexed with language 'web'
2026-09-18T13:46:34.2638185Z 10:46:34.253 DEBUG: 'src/app/components/recebivel/recebivel-lista/recebivel-lista.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2638514Z 10:46:34.253 DEBUG: 'src/app/components/recebivel/recebivel-lista/recebivel-lista.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.2638848Z 10:46:34.253 DEBUG: 'src/app/components/recebivel/recebivel.module.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2639134Z 10:46:34.254 DEBUG: 'src/app/components/recebivel/recebivel.module.ts' indexed with language 'ts'
2026-09-18T13:46:34.2639385Z 10:46:34.254 DEBUG: File src/app/components/recebivel/recebivel.routing.module.ts was excluded by sonar.javascript.exclusions or sonar.typescript.exclusions
2026-09-18T13:46:34.2639746Z 10:46:34.254 DEBUG: 'src/app/components/recebivel/recebivel.routing.module.ts' excluded by org.sonar.plugins.javascript.filter.JavaScriptExclusionsFileFilter
2026-09-18T13:46:34.2640024Z 10:46:34.254 DEBUG: 'src/app/components/recebivel/recebivel.service.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2640322Z 10:46:34.255 DEBUG: 'src/app/components/recebivel/recebivel.service.ts' indexed with language 'ts'
2026-09-18T13:46:34.2640596Z 10:46:34.255 DEBUG: 'src/app/components/sair/sair.component.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2640801Z 10:46:34.255 DEBUG: Average line length for src/app/components/sair/sair.component.css is 0
2026-09-18T13:46:34.2641141Z 10:46:34.255 DEBUG: 'src/app/components/sair/sair.component.css' indexed with language 'css'
2026-09-18T13:46:34.2641405Z 10:46:34.255 DEBUG: 'src/app/components/sair/sair.component.html' indexed with language 'web'
2026-09-18T13:46:34.2641684Z 10:46:34.256 DEBUG: 'src/app/components/sair/sair.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2641947Z 10:46:34.256 DEBUG: 'src/app/components/sair/sair.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.2642213Z 10:46:34.256 DEBUG: 'src/app/components/sair/sair.module.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2642544Z 10:46:34.256 DEBUG: 'src/app/components/sair/sair.module.ts' indexed with language 'ts'
2026-09-18T13:46:34.2642845Z 10:46:34.257 DEBUG: 'src/app/components/shared/shared.module.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2643113Z 10:46:34.257 DEBUG: 'src/app/components/shared/shared.module.ts' indexed with language 'ts'
2026-09-18T13:46:34.2643305Z 10:46:34.257 DEBUG: File src/app/components/shared/shared.module.ts excluded for coverage
2026-09-18T13:46:34.2643592Z 10:46:34.257 DEBUG: 'src/app/components/teste/teste.component.html' indexed with language 'web'
2026-09-18T13:46:34.2643911Z 10:46:34.258 DEBUG: 'src/app/components/teste/teste.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2644182Z 10:46:34.258 DEBUG: 'src/app/components/teste/teste.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.2644424Z 10:46:34.258 DEBUG: 'src/app/components/teste/teste.module.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2644686Z 10:46:34.258 DEBUG: 'src/app/components/teste/teste.module.ts' indexed with language 'ts'
2026-09-18T13:46:34.2644907Z 10:46:34.259 DEBUG: File src/app/components/teste/teste.routing.module.ts was excluded by sonar.javascript.exclusions or sonar.typescript.exclusions
2026-09-18T13:46:34.2645261Z 10:46:34.259 DEBUG: 'src/app/components/teste/teste.routing.module.ts' excluded by org.sonar.plugins.javascript.filter.JavaScriptExclusionsFileFilter
2026-09-18T13:46:34.2645559Z 10:46:34.259 DEBUG: 'src/app/components/unidade/unidade-filtro.component.html' indexed with language 'web'
2026-09-18T13:46:34.2645881Z 10:46:34.259 DEBUG: 'src/app/components/unidade/unidade-filtro.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2646175Z 10:46:34.259 DEBUG: 'src/app/components/unidade/unidade-filtro.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.2646453Z 10:46:34.260 DEBUG: 'src/app/components/unidade/unidade.module.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2646688Z 10:46:34.260 DEBUG: 'src/app/components/unidade/unidade.module.ts' indexed with language 'ts'
2026-09-18T13:46:34.2646962Z 10:46:34.260 DEBUG: 'src/app/components/versao/versao.component.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2647206Z 10:46:34.260 DEBUG: Average line length for src/app/components/versao/versao.component.css is 13
2026-09-18T13:46:34.2647471Z 10:46:34.260 DEBUG: 'src/app/components/versao/versao.component.css' indexed with language 'css'
2026-09-18T13:46:34.2647755Z 10:46:34.261 DEBUG: 'src/app/components/versao/versao.component.html' indexed with language 'web'
2026-09-18T13:46:34.2648033Z 10:46:34.261 DEBUG: 'src/app/components/versao/versao.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2648313Z 10:46:34.261 DEBUG: 'src/app/components/versao/versao.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.2648583Z 10:46:34.261 DEBUG: 'src/app/components/versao/versao.module.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2648814Z 10:46:34.261 DEBUG: 'src/app/components/versao/versao.module.ts' indexed with language 'ts'
2026-09-18T13:46:34.2649108Z 10:46:34.262 DEBUG: 'src/app/components/wizard-step/wizard-step.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2649389Z 10:46:34.262 DEBUG: 'src/app/components/wizard-step/wizard-step.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.2649642Z 10:46:34.263 DEBUG: 'src/app/components/wizard/LICENSE' indexed with no language
2026-09-18T13:46:34.2649928Z 10:46:34.263 DEBUG: 'src/app/components/wizard/README.MD' indexed with no language
2026-09-18T13:46:34.2650325Z 10:46:34.263 DEBUG: 'src/app/components/wizard/img/stepAndamento.png' indexed with no language
2026-09-18T13:46:34.2650764Z 10:46:34.264 DEBUG: 'src/app/components/wizard/img/stepComplete.png' indexed with no language
2026-09-18T13:46:34.2651094Z 10:46:34.264 DEBUG: 'src/app/components/wizard/img/stepPendente.png' indexed with no language
2026-09-18T13:46:34.2651905Z 10:46:34.265 DEBUG: 'src/app/components/wizard/wizard.component.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2652121Z 10:46:34.265 DEBUG: Average line length for src/app/components/wizard/wizard.component.css is 24
2026-09-18T13:46:34.2655078Z 10:46:34.265 DEBUG: 'src/app/components/wizard/wizard.component.css' indexed with language 'css'
2026-09-18T13:46:34.2657453Z 10:46:34.265 DEBUG: 'src/app/components/wizard/wizard.component.html' indexed with language 'web'
2026-09-18T13:46:34.2663815Z 10:46:34.266 DEBUG: 'src/app/components/wizard/wizard.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2665401Z 10:46:34.266 DEBUG: 'src/app/components/wizard/wizard.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.2669894Z 10:46:34.266 DEBUG: 'src/app/components/xml-contrato/xml-contrato.component.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2670342Z 10:46:34.266 DEBUG: Average line length for src/app/components/xml-contrato/xml-contrato.component.css is 14
2026-09-18T13:46:34.2671769Z 10:46:34.267 DEBUG: 'src/app/components/xml-contrato/xml-contrato.component.css' indexed with language 'css'
2026-09-18T13:46:34.2674474Z 10:46:34.267 DEBUG: 'src/app/components/xml-contrato/xml-contrato.component.html' indexed with language 'web'
2026-09-18T13:46:34.2678281Z 10:46:34.267 DEBUG: 'src/app/components/xml-contrato/xml-contrato.component.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2680129Z 10:46:34.267 DEBUG: 'src/app/components/xml-contrato/xml-contrato.component.ts' indexed with language 'ts'
2026-09-18T13:46:34.2683191Z 10:46:34.268 DEBUG: 'src/app/components/xml-contrato/xml-contrato.module.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2685137Z 10:46:34.268 DEBUG: 'src/app/components/xml-contrato/xml-contrato.module.ts' indexed with language 'ts'
2026-09-18T13:46:34.2689285Z 10:46:34.268 DEBUG: 'src/app/directives/base-pattern-mask.directive.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2691713Z 10:46:34.269 DEBUG: 'src/app/directives/base-pattern-mask.directive.ts' indexed with language 'ts'
2026-09-18T13:46:34.2692291Z 10:46:34.269 DEBUG: File src/app/directives/base-pattern-mask.directive.ts excluded for coverage
2026-09-18T13:46:34.2695080Z 10:46:34.269 DEBUG: 'src/app/directives/directive.module.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2696634Z 10:46:34.269 DEBUG: 'src/app/directives/directive.module.ts' indexed with language 'ts'
2026-09-18T13:46:34.2696916Z 10:46:34.269 DEBUG: File src/app/directives/directive.module.ts excluded for coverage
2026-09-18T13:46:34.2700518Z 10:46:34.269 DEBUG: 'src/app/directives/has.permissao.exibir.directive.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2722195Z 10:46:34.270 DEBUG: 'src/app/directives/has.permissao.exibir.directive.ts' indexed with language 'ts'
2026-09-18T13:46:34.2722591Z 10:46:34.270 DEBUG: File src/app/directives/has.permissao.exibir.directive.ts excluded for coverage
2026-09-18T13:46:34.2722907Z 10:46:34.270 DEBUG: 'src/app/directives/has.permissao.habilitar.directive.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2723194Z 10:46:34.270 DEBUG: 'src/app/directives/has.permissao.habilitar.directive.ts' indexed with language 'ts'
2026-09-18T13:46:34.2723411Z 10:46:34.270 DEBUG: File src/app/directives/has.permissao.habilitar.directive.ts excluded for coverage
2026-09-18T13:46:34.2723688Z 10:46:34.271 DEBUG: 'src/app/directives/mask-cep.directive.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2723952Z 10:46:34.271 DEBUG: 'src/app/directives/mask-cep.directive.ts' indexed with language 'ts'
2026-09-18T13:46:34.2724179Z 10:46:34.271 DEBUG: File src/app/directives/mask-cep.directive.ts excluded for coverage
2026-09-18T13:46:34.2724451Z 10:46:34.271 DEBUG: 'src/app/directives/mask-cnpj.directive.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2724899Z 10:46:34.271 DEBUG: 'src/app/directives/mask-cnpj.directive.ts' indexed with language 'ts'
2026-09-18T13:46:34.2725167Z 10:46:34.271 DEBUG: File src/app/directives/mask-cnpj.directive.ts excluded for coverage
2026-09-18T13:46:34.2725442Z 10:46:34.271 DEBUG: 'src/app/directives/mask-cpf.directive.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2725710Z 10:46:34.272 DEBUG: 'src/app/directives/mask-cpf.directive.ts' indexed with language 'ts'
2026-09-18T13:46:34.2725971Z 10:46:34.272 DEBUG: File src/app/directives/mask-cpf.directive.ts excluded for coverage
2026-09-18T13:46:34.2726406Z 10:46:34.272 DEBUG: 'src/app/directives/mask-data.directive.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2726863Z 10:46:34.272 DEBUG: 'src/app/directives/mask-data.directive.ts' indexed with language 'ts'
2026-09-18T13:46:34.2727216Z 10:46:34.272 DEBUG: File src/app/directives/mask-data.directive.ts excluded for coverage
2026-09-18T13:46:34.2729822Z 10:46:34.272 DEBUG: 'src/app/directives/mask-ddd.directive.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2730914Z 10:46:34.273 DEBUG: 'src/app/directives/mask-ddd.directive.ts' indexed with language 'ts'
2026-09-18T13:46:34.2731179Z 10:46:34.273 DEBUG: File src/app/directives/mask-ddd.directive.ts excluded for coverage
2026-09-18T13:46:34.2734120Z 10:46:34.273 DEBUG: 'src/app/directives/mask-money.directive.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2735347Z 10:46:34.273 DEBUG: 'src/app/directives/mask-money.directive.ts' indexed with language 'ts'
2026-09-18T13:46:34.2735706Z 10:46:34.273 DEBUG: File src/app/directives/mask-money.directive.ts excluded for coverage
2026-09-18T13:46:34.2738200Z 10:46:34.273 DEBUG: 'src/app/directives/mask-number.directive.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2739197Z 10:46:34.273 DEBUG: 'src/app/directives/mask-number.directive.ts' indexed with language 'ts'
2026-09-18T13:46:34.2739594Z 10:46:34.273 DEBUG: File src/app/directives/mask-number.directive.ts excluded for coverage
2026-09-18T13:46:34.2742132Z 10:46:34.274 DEBUG: 'src/app/directives/mask-percent.directive.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2743652Z 10:46:34.274 DEBUG: 'src/app/directives/mask-percent.directive.ts' indexed with language 'ts'
2026-09-18T13:46:34.2744323Z 10:46:34.274 DEBUG: File src/app/directives/mask-percent.directive.ts excluded for coverage
2026-09-18T13:46:34.2746529Z 10:46:34.274 DEBUG: 'src/app/directives/mask-telefone-ddd.directive.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2747856Z 10:46:34.274 DEBUG: 'src/app/directives/mask-telefone-ddd.directive.ts' indexed with language 'ts'
2026-09-18T13:46:34.2748150Z 10:46:34.274 DEBUG: File src/app/directives/mask-telefone-ddd.directive.ts excluded for coverage
2026-09-18T13:46:34.2751927Z 10:46:34.275 DEBUG: 'src/app/directives/mask-telefone.directive.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2752559Z 10:46:34.275 DEBUG: 'src/app/directives/mask-telefone.directive.ts' indexed with language 'ts'
2026-09-18T13:46:34.2752856Z 10:46:34.275 DEBUG: File src/app/directives/mask-telefone.directive.ts excluded for coverage
2026-09-18T13:46:34.2755124Z 10:46:34.275 DEBUG: 'src/app/directives/simple-mask-money/LICENSE' indexed with no language
2026-09-18T13:46:34.2755477Z 10:46:34.275 DEBUG: File src/app/directives/simple-mask-money/LICENSE excluded for coverage
2026-09-18T13:46:34.2761699Z 10:46:34.276 DEBUG: 'src/app/directives/simple-mask-money/simple-mask-money.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2763922Z 10:46:34.276 DEBUG: 'src/app/directives/simple-mask-money/simple-mask-money.ts' indexed with language 'ts'
2026-09-18T13:46:34.2764214Z 10:46:34.276 DEBUG: File src/app/directives/simple-mask-money/simple-mask-money.ts excluded for coverage
2026-09-18T13:46:34.2767870Z 10:46:34.276 DEBUG: 'src/app/directives/valida-cnpj.directive.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2769603Z 10:46:34.276 DEBUG: 'src/app/directives/valida-cnpj.directive.ts' indexed with language 'ts'
2026-09-18T13:46:34.2769878Z 10:46:34.276 DEBUG: File src/app/directives/valida-cnpj.directive.ts excluded for coverage
2026-09-18T13:46:34.2772674Z 10:46:34.277 DEBUG: 'src/app/directives/zero-esquerda.directive.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2774349Z 10:46:34.277 DEBUG: 'src/app/directives/zero-esquerda.directive.ts' indexed with language 'ts'
2026-09-18T13:46:34.2774634Z 10:46:34.277 DEBUG: File src/app/directives/zero-esquerda.directive.ts excluded for coverage
2026-09-18T13:46:34.2778752Z 10:46:34.277 DEBUG: 'src/app/guards/auth.guard.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2781217Z 10:46:34.277 DEBUG: 'src/app/guards/auth.guard.ts' indexed with language 'ts'
2026-09-18T13:46:34.2781409Z 10:46:34.277 DEBUG: File src/app/guards/auth.guard.ts excluded for coverage
2026-09-18T13:46:34.2786598Z 10:46:34.278 DEBUG: 'src/app/messages.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2787828Z 10:46:34.278 DEBUG: 'src/app/messages.ts' indexed with language 'ts'
2026-09-18T13:46:34.2789776Z 10:46:34.278 DEBUG: File src/app/mocks/mock-contato.ts was excluded by sonar.javascript.exclusions or sonar.typescript.exclusions
2026-09-18T13:46:34.2790168Z 10:46:34.278 DEBUG: 'src/app/mocks/mock-contato.ts' excluded by org.sonar.plugins.javascript.filter.JavaScriptExclusionsFileFilter
2026-09-18T13:46:34.2790707Z 10:46:34.279 DEBUG: File src/app/mocks/mock-convenio.ts was excluded by sonar.javascript.exclusions or sonar.typescript.exclusions
2026-09-18T13:46:34.2791035Z 10:46:34.279 DEBUG: 'src/app/mocks/mock-convenio.ts' excluded by org.sonar.plugins.javascript.filter.JavaScriptExclusionsFileFilter
2026-09-18T13:46:34.2791797Z 10:46:34.279 DEBUG: File src/app/mocks/mock-dados-cessao.ts was excluded by sonar.javascript.exclusions or sonar.typescript.exclusions
2026-09-18T13:46:34.2792128Z 10:46:34.279 DEBUG: 'src/app/mocks/mock-dados-cessao.ts' excluded by org.sonar.plugins.javascript.filter.JavaScriptExclusionsFileFilter
2026-09-18T13:46:34.2792935Z 10:46:34.279 DEBUG: File src/app/mocks/mock-fornecedor.ts was excluded by sonar.javascript.exclusions or sonar.typescript.exclusions
2026-09-18T13:46:34.2793266Z 10:46:34.279 DEBUG: 'src/app/mocks/mock-fornecedor.ts' excluded by org.sonar.plugins.javascript.filter.JavaScriptExclusionsFileFilter
2026-09-18T13:46:34.2793953Z 10:46:34.279 DEBUG: File src/app/mocks/mock-geral.ts was excluded by sonar.javascript.exclusions or sonar.typescript.exclusions
2026-09-18T13:46:34.2794374Z 10:46:34.279 DEBUG: 'src/app/mocks/mock-geral.ts' excluded by org.sonar.plugins.javascript.filter.JavaScriptExclusionsFileFilter
2026-09-18T13:46:34.2795236Z 10:46:34.279 DEBUG: File src/app/mocks/mock-programa-plataforma-externa.ts was excluded by sonar.javascript.exclusions or sonar.typescript.exclusions
2026-09-18T13:46:34.2795589Z 10:46:34.279 DEBUG: 'src/app/mocks/mock-programa-plataforma-externa.ts' excluded by org.sonar.plugins.javascript.filter.JavaScriptExclusionsFileFilter
2026-09-18T13:46:34.2796262Z 10:46:34.279 DEBUG: File src/app/mocks/mock-recebiveis.ts was excluded by sonar.javascript.exclusions or sonar.typescript.exclusions
2026-09-18T13:46:34.2796586Z 10:46:34.279 DEBUG: 'src/app/mocks/mock-recebiveis.ts' excluded by org.sonar.plugins.javascript.filter.JavaScriptExclusionsFileFilter
2026-09-18T13:46:34.2797619Z 10:46:34.279 DEBUG: File src/app/mocks/mock-tipo-plataforma-externa.ts was excluded by sonar.javascript.exclusions or sonar.typescript.exclusions
2026-09-18T13:46:34.2797977Z 10:46:34.279 DEBUG: 'src/app/mocks/mock-tipo-plataforma-externa.ts' excluded by org.sonar.plugins.javascript.filter.JavaScriptExclusionsFileFilter
2026-09-18T13:46:34.2798515Z 10:46:34.279 DEBUG: File src/app/mocks/mock-token-internet.ts was excluded by sonar.javascript.exclusions or sonar.typescript.exclusions
2026-09-18T13:46:34.2798815Z 10:46:34.279 DEBUG: 'src/app/mocks/mock-token-internet.ts' excluded by org.sonar.plugins.javascript.filter.JavaScriptExclusionsFileFilter
2026-09-18T13:46:34.2799551Z 10:46:34.279 DEBUG: File src/app/mocks/mock-token-intranet.ts was excluded by sonar.javascript.exclusions or sonar.typescript.exclusions
2026-09-18T13:46:34.2799885Z 10:46:34.279 DEBUG: 'src/app/mocks/mock-token-intranet.ts' excluded by org.sonar.plugins.javascript.filter.JavaScriptExclusionsFileFilter
2026-09-18T13:46:34.2803998Z 10:46:34.280 DEBUG: 'src/app/modelo/arquivo-recebivel.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2806533Z 10:46:34.280 DEBUG: 'src/app/modelo/arquivo-recebivel.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.2806806Z 10:46:34.280 DEBUG: File src/app/modelo/arquivo-recebivel.model.ts excluded for coverage
2026-09-18T13:46:34.2807893Z 10:46:34.280 DEBUG: 'src/app/modelo/avaliacao-risco.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2808974Z 10:46:34.280 DEBUG: 'src/app/modelo/avaliacao-risco.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.2809324Z 10:46:34.280 DEBUG: File src/app/modelo/avaliacao-risco.model.ts excluded for coverage
2026-09-18T13:46:34.2811913Z 10:46:34.281 DEBUG: 'src/app/modelo/campo-funcionalidade-historico.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2813162Z 10:46:34.281 DEBUG: 'src/app/modelo/campo-funcionalidade-historico.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.2813416Z 10:46:34.281 DEBUG: File src/app/modelo/campo-funcionalidade-historico.model.ts excluded for coverage
2026-09-18T13:46:34.2815832Z 10:46:34.281 DEBUG: 'src/app/modelo/cessao-selecao-recebiveis.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2816810Z 10:46:34.281 DEBUG: 'src/app/modelo/cessao-selecao-recebiveis.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.2817253Z 10:46:34.281 DEBUG: File src/app/modelo/cessao-selecao-recebiveis.model.ts excluded for coverage
2026-09-18T13:46:34.2819770Z 10:46:34.281 DEBUG: 'src/app/modelo/cessao.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2820965Z 10:46:34.282 DEBUG: 'src/app/modelo/cessao.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.2821569Z 10:46:34.282 DEBUG: File src/app/modelo/cessao.model.ts excluded for coverage
2026-09-18T13:46:34.2824214Z 10:46:34.282 DEBUG: 'src/app/modelo/cliente.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2825025Z 10:46:34.282 DEBUG: 'src/app/modelo/cliente.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.2825379Z 10:46:34.282 DEBUG: File src/app/modelo/cliente.model.ts excluded for coverage
2026-09-18T13:46:34.2827980Z 10:46:34.282 DEBUG: 'src/app/modelo/componente.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2830790Z 10:46:34.282 DEBUG: 'src/app/modelo/componente.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.2830981Z 10:46:34.282 DEBUG: File src/app/modelo/componente.model.ts excluded for coverage
2026-09-18T13:46:34.2831248Z 10:46:34.283 DEBUG: 'src/app/modelo/conceito.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2832191Z 10:46:34.283 DEBUG: 'src/app/modelo/conceito.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.2832488Z 10:46:34.283 DEBUG: File src/app/modelo/conceito.model.ts excluded for coverage
2026-09-18T13:46:34.2834882Z 10:46:34.283 DEBUG: 'src/app/modelo/configuracao-assinatura-automatica.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2835988Z 10:46:34.283 DEBUG: 'src/app/modelo/configuracao-assinatura-automatica.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.2836283Z 10:46:34.283 DEBUG: File src/app/modelo/configuracao-assinatura-automatica.model.ts excluded for coverage
2026-09-18T13:46:34.2838736Z 10:46:34.283 DEBUG: 'src/app/modelo/conformidade.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2840361Z 10:46:34.283 DEBUG: 'src/app/modelo/conformidade.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.2840555Z 10:46:34.283 DEBUG: File src/app/modelo/conformidade.model.ts excluded for coverage
2026-09-18T13:46:34.2842135Z 10:46:34.284 DEBUG: 'src/app/modelo/conjuge-model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2843281Z 10:46:34.284 DEBUG: 'src/app/modelo/conjuge-model.ts' indexed with language 'ts'
2026-09-18T13:46:34.2843504Z 10:46:34.284 DEBUG: File src/app/modelo/conjuge-model.ts excluded for coverage
2026-09-18T13:46:34.2845668Z 10:46:34.284 DEBUG: 'src/app/modelo/constantes.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2846749Z 10:46:34.284 DEBUG: 'src/app/modelo/constantes.ts' indexed with language 'ts'
2026-09-18T13:46:34.2847020Z 10:46:34.284 DEBUG: File src/app/modelo/constantes.ts excluded for coverage
2026-09-18T13:46:34.2849586Z 10:46:34.284 DEBUG: 'src/app/modelo/conta-corrente.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2850793Z 10:46:34.285 DEBUG: 'src/app/modelo/conta-corrente.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.2851133Z 10:46:34.285 DEBUG: File src/app/modelo/conta-corrente.model.ts excluded for coverage
2026-09-18T13:46:34.2853968Z 10:46:34.285 DEBUG: 'src/app/modelo/contato.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2854984Z 10:46:34.285 DEBUG: 'src/app/modelo/contato.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.2855255Z 10:46:34.285 DEBUG: File src/app/modelo/contato.model.ts excluded for coverage
2026-09-18T13:46:34.2857974Z 10:46:34.285 DEBUG: 'src/app/modelo/contrato-convenio.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2859121Z 10:46:34.285 DEBUG: 'src/app/modelo/contrato-convenio.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.2859539Z 10:46:34.285 DEBUG: File src/app/modelo/contrato-convenio.model.ts excluded for coverage
2026-09-18T13:46:34.2862098Z 10:46:34.286 DEBUG: 'src/app/modelo/convenente.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2864537Z 10:46:34.286 DEBUG: 'src/app/modelo/convenente.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.2864700Z 10:46:34.286 DEBUG: File src/app/modelo/convenente.model.ts excluded for coverage
2026-09-18T13:46:34.2873762Z 10:46:34.286 DEBUG: 'src/app/modelo/convenio.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2874063Z 10:46:34.286 DEBUG: 'src/app/modelo/convenio.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.2874256Z 10:46:34.286 DEBUG: File src/app/modelo/convenio.model.ts excluded for coverage
2026-09-18T13:46:34.2874528Z 10:46:34.286 DEBUG: 'src/app/modelo/dados-cessao-simulada.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2874899Z 10:46:34.287 DEBUG: 'src/app/modelo/dados-cessao-simulada.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.2875167Z 10:46:34.287 DEBUG: File src/app/modelo/dados-cessao-simulada.model.ts excluded for coverage
2026-09-18T13:46:34.2875452Z 10:46:34.287 DEBUG: 'src/app/modelo/dados-convenio-arquivo.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2875860Z 10:46:34.287 DEBUG: 'src/app/modelo/dados-convenio-arquivo.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.2876101Z 10:46:34.287 DEBUG: File src/app/modelo/dados-convenio-arquivo.model.ts excluded for coverage
2026-09-18T13:46:34.2878335Z 10:46:34.287 DEBUG: 'src/app/modelo/dados-fornecedor-recebivel.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2890198Z 10:46:34.287 DEBUG: 'src/app/modelo/dados-fornecedor-recebivel.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.2890489Z 10:46:34.287 DEBUG: File src/app/modelo/dados-fornecedor-recebivel.model.ts excluded for coverage
2026-09-18T13:46:34.2890782Z 10:46:34.288 DEBUG: 'src/app/modelo/dados-retorno.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2891074Z 10:46:34.288 DEBUG: 'src/app/modelo/dados-retorno.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.2891336Z 10:46:34.288 DEBUG: File src/app/modelo/dados-retorno.model.ts excluded for coverage
2026-09-18T13:46:34.2891605Z 10:46:34.288 DEBUG: 'src/app/modelo/detalhe-componente-cet.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2891892Z 10:46:34.288 DEBUG: 'src/app/modelo/detalhe-componente-cet.ts' indexed with language 'ts'
2026-09-18T13:46:34.2892205Z 10:46:34.288 DEBUG: File src/app/modelo/detalhe-componente-cet.ts excluded for coverage
2026-09-18T13:46:34.2892575Z 10:46:34.288 DEBUG: 'src/app/modelo/encargo-recebivel.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2892845Z 10:46:34.288 DEBUG: 'src/app/modelo/encargo-recebivel.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.2893172Z 10:46:34.289 DEBUG: File src/app/modelo/encargo-recebivel.model.ts excluded for coverage
2026-09-18T13:46:34.2894609Z 10:46:34.289 DEBUG: 'src/app/modelo/encargo.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2895224Z 10:46:34.289 DEBUG: 'src/app/modelo/encargo.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.2895425Z 10:46:34.289 DEBUG: File src/app/modelo/encargo.model.ts excluded for coverage
2026-09-18T13:46:34.2897070Z 10:46:34.289 DEBUG: 'src/app/modelo/endereco.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2897819Z 10:46:34.289 DEBUG: 'src/app/modelo/endereco.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.2898116Z 10:46:34.289 DEBUG: File src/app/modelo/endereco.model.ts excluded for coverage
2026-09-18T13:46:34.2901102Z 10:46:34.289 DEBUG: 'src/app/modelo/enum-abrangencia.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2902077Z 10:46:34.290 DEBUG: 'src/app/modelo/enum-abrangencia.ts' indexed with language 'ts'
2026-09-18T13:46:34.2902554Z 10:46:34.290 DEBUG: File src/app/modelo/enum-abrangencia.ts excluded for coverage
2026-09-18T13:46:34.2904492Z 10:46:34.290 DEBUG: 'src/app/modelo/enum-descricao-cet.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2905494Z 10:46:34.290 DEBUG: 'src/app/modelo/enum-descricao-cet.ts' indexed with language 'ts'
2026-09-18T13:46:34.2905762Z 10:46:34.290 DEBUG: File src/app/modelo/enum-descricao-cet.ts excluded for coverage
2026-09-18T13:46:34.2907890Z 10:46:34.290 DEBUG: 'src/app/modelo/enum-encargo.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2908675Z 10:46:34.290 DEBUG: 'src/app/modelo/enum-encargo.ts' indexed with language 'ts'
2026-09-18T13:46:34.2909248Z 10:46:34.290 DEBUG: File src/app/modelo/enum-encargo.ts excluded for coverage
2026-09-18T13:46:34.2911296Z 10:46:34.291 DEBUG: 'src/app/modelo/enum-funcionalidade-historico.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2912302Z 10:46:34.291 DEBUG: 'src/app/modelo/enum-funcionalidade-historico.ts' indexed with language 'ts'
2026-09-18T13:46:34.2912798Z 10:46:34.291 DEBUG: File src/app/modelo/enum-funcionalidade-historico.ts excluded for coverage
2026-09-18T13:46:34.2914882Z 10:46:34.291 DEBUG: 'src/app/modelo/enum-funcionalidade.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2915745Z 10:46:34.291 DEBUG: 'src/app/modelo/enum-funcionalidade.ts' indexed with language 'ts'
2026-09-18T13:46:34.2916091Z 10:46:34.291 DEBUG: File src/app/modelo/enum-funcionalidade.ts excluded for coverage
2026-09-18T13:46:34.2919295Z 10:46:34.291 DEBUG: 'src/app/modelo/enum-motivo-reprovacao-recebivel-externo.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2921203Z 10:46:34.292 DEBUG: 'src/app/modelo/enum-motivo-reprovacao-recebivel-externo.ts' indexed with language 'ts'
2026-09-18T13:46:34.2922083Z 10:46:34.292 DEBUG: File src/app/modelo/enum-motivo-reprovacao-recebivel-externo.ts excluded for coverage
2026-09-18T13:46:34.2927620Z 10:46:34.292 DEBUG: 'src/app/modelo/enum-perfil-sirep.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2929067Z 10:46:34.292 DEBUG: 'src/app/modelo/enum-perfil-sirep.ts' indexed with language 'ts'
2026-09-18T13:46:34.2929341Z 10:46:34.292 DEBUG: File src/app/modelo/enum-perfil-sirep.ts excluded for coverage
2026-09-18T13:46:34.2931394Z 10:46:34.293 DEBUG: 'src/app/modelo/enum-sistemas.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2932281Z 10:46:34.293 DEBUG: 'src/app/modelo/enum-sistemas.ts' indexed with language 'ts'
2026-09-18T13:46:34.2932679Z 10:46:34.293 DEBUG: File src/app/modelo/enum-sistemas.ts excluded for coverage
2026-09-18T13:46:34.2935195Z 10:46:34.293 DEBUG: 'src/app/modelo/enum-situacao-arquivo-recebivel.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2936046Z 10:46:34.293 DEBUG: 'src/app/modelo/enum-situacao-arquivo-recebivel.ts' indexed with language 'ts'
2026-09-18T13:46:34.2936411Z 10:46:34.293 DEBUG: File src/app/modelo/enum-situacao-arquivo-recebivel.ts excluded for coverage
2026-09-18T13:46:34.2938639Z 10:46:34.293 DEBUG: 'src/app/modelo/enum-situacao-avaliacao-risco.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2939620Z 10:46:34.293 DEBUG: 'src/app/modelo/enum-situacao-avaliacao-risco.ts' indexed with language 'ts'
2026-09-18T13:46:34.2939976Z 10:46:34.293 DEBUG: File src/app/modelo/enum-situacao-avaliacao-risco.ts excluded for coverage
2026-09-18T13:46:34.2942954Z 10:46:34.294 DEBUG: 'src/app/modelo/enum-situacao-cessao.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2944596Z 10:46:34.294 DEBUG: 'src/app/modelo/enum-situacao-cessao.ts' indexed with language 'ts'
2026-09-18T13:46:34.2945000Z 10:46:34.294 DEBUG: File src/app/modelo/enum-situacao-cessao.ts excluded for coverage
2026-09-18T13:46:34.2947193Z 10:46:34.294 DEBUG: 'src/app/modelo/enum-situacao-conformidade.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2948123Z 10:46:34.294 DEBUG: 'src/app/modelo/enum-situacao-conformidade.ts' indexed with language 'ts'
2026-09-18T13:46:34.2948448Z 10:46:34.294 DEBUG: File src/app/modelo/enum-situacao-conformidade.ts excluded for coverage
2026-09-18T13:46:34.2955200Z 10:46:34.295 DEBUG: 'src/app/modelo/enum-situacao-convenio.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2955474Z 10:46:34.295 DEBUG: 'src/app/modelo/enum-situacao-convenio.ts' indexed with language 'ts'
2026-09-18T13:46:34.2955743Z 10:46:34.295 DEBUG: File src/app/modelo/enum-situacao-convenio.ts excluded for coverage
2026-09-18T13:46:34.2956015Z 10:46:34.295 DEBUG: 'src/app/modelo/enum-situacao-encargo.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2956342Z 10:46:34.295 DEBUG: 'src/app/modelo/enum-situacao-encargo.ts' indexed with language 'ts'
2026-09-18T13:46:34.2956602Z 10:46:34.295 DEBUG: File src/app/modelo/enum-situacao-encargo.ts excluded for coverage
2026-09-18T13:46:34.2959926Z 10:46:34.295 DEBUG: 'src/app/modelo/enum-situacao-recebivel.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2961722Z 10:46:34.296 DEBUG: 'src/app/modelo/enum-situacao-recebivel.ts' indexed with language 'ts'
2026-09-18T13:46:34.2962334Z 10:46:34.296 DEBUG: File src/app/modelo/enum-situacao-recebivel.ts excluded for coverage
2026-09-18T13:46:34.2964892Z 10:46:34.296 DEBUG: 'src/app/modelo/enum-situacao-solicitacao-externa.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2967002Z 10:46:34.296 DEBUG: 'src/app/modelo/enum-situacao-solicitacao-externa.ts' indexed with language 'ts'
2026-09-18T13:46:34.2967278Z 10:46:34.296 DEBUG: File src/app/modelo/enum-situacao-solicitacao-externa.ts excluded for coverage
2026-09-18T13:46:34.2969339Z 10:46:34.296 DEBUG: 'src/app/modelo/enum-situacao-vinculacao.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2970652Z 10:46:34.297 DEBUG: 'src/app/modelo/enum-situacao-vinculacao.ts' indexed with language 'ts'
2026-09-18T13:46:34.2971006Z 10:46:34.297 DEBUG: File src/app/modelo/enum-situacao-vinculacao.ts excluded for coverage
2026-09-18T13:46:34.2979404Z 10:46:34.297 DEBUG: 'src/app/modelo/enum-tipo-arquivo.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2979672Z 10:46:34.297 DEBUG: 'src/app/modelo/enum-tipo-arquivo.ts' indexed with language 'ts'
2026-09-18T13:46:34.2979940Z 10:46:34.297 DEBUG: File src/app/modelo/enum-tipo-arquivo.ts excluded for coverage
2026-09-18T13:46:34.2980211Z 10:46:34.297 DEBUG: 'src/app/modelo/enum-tipo-cobranca-tarifa.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2980478Z 10:46:34.297 DEBUG: 'src/app/modelo/enum-tipo-cobranca-tarifa.ts' indexed with language 'ts'
2026-09-18T13:46:34.2980829Z 10:46:34.297 DEBUG: File src/app/modelo/enum-tipo-cobranca-tarifa.ts excluded for coverage
2026-09-18T13:46:34.2981138Z 10:46:34.297 DEBUG: 'src/app/modelo/enum-tipo-contrato-conformidade.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2981562Z 10:46:34.298 DEBUG: 'src/app/modelo/enum-tipo-contrato-conformidade.ts' indexed with language 'ts'
2026-09-18T13:46:34.2981806Z 10:46:34.298 DEBUG: File src/app/modelo/enum-tipo-contrato-conformidade.ts excluded for coverage
2026-09-18T13:46:34.2983860Z 10:46:34.298 DEBUG: 'src/app/modelo/enum-tipo-contrato-convenio.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2984674Z 10:46:34.298 DEBUG: 'src/app/modelo/enum-tipo-contrato-convenio.ts' indexed with language 'ts'
2026-09-18T13:46:34.2985038Z 10:46:34.298 DEBUG: File src/app/modelo/enum-tipo-contrato-convenio.ts excluded for coverage
2026-09-18T13:46:34.2987314Z 10:46:34.298 DEBUG: 'src/app/modelo/enum-tipo-geracao-contrato-convenio.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2988418Z 10:46:34.298 DEBUG: 'src/app/modelo/enum-tipo-geracao-contrato-convenio.ts' indexed with language 'ts'
2026-09-18T13:46:34.2988780Z 10:46:34.298 DEBUG: File src/app/modelo/enum-tipo-geracao-contrato-convenio.ts excluded for coverage
2026-09-18T13:46:34.2990945Z 10:46:34.299 DEBUG: 'src/app/modelo/enum-tipo-operacao.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2991897Z 10:46:34.299 DEBUG: 'src/app/modelo/enum-tipo-operacao.ts' indexed with language 'ts'
2026-09-18T13:46:34.2992256Z 10:46:34.299 DEBUG: File src/app/modelo/enum-tipo-operacao.ts excluded for coverage
2026-09-18T13:46:34.2994474Z 10:46:34.299 DEBUG: 'src/app/modelo/enum-tipo-ordem.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2995297Z 10:46:34.299 DEBUG: 'src/app/modelo/enum-tipo-ordem.ts' indexed with language 'ts'
2026-09-18T13:46:34.2995742Z 10:46:34.299 DEBUG: File src/app/modelo/enum-tipo-ordem.ts excluded for coverage
2026-09-18T13:46:34.2998121Z 10:46:34.299 DEBUG: 'src/app/modelo/enum-tipo-validacao-campo.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.2999006Z 10:46:34.299 DEBUG: 'src/app/modelo/enum-tipo-validacao-campo.ts' indexed with language 'ts'
2026-09-18T13:46:34.2999376Z 10:46:34.299 DEBUG: File src/app/modelo/enum-tipo-validacao-campo.ts excluded for coverage
2026-09-18T13:46:34.3005646Z 10:46:34.300 DEBUG: 'src/app/modelo/enum-transacao-sirep.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3006519Z 10:46:34.300 DEBUG: 'src/app/modelo/enum-transacao-sirep.ts' indexed with language 'ts'
2026-09-18T13:46:34.3006840Z 10:46:34.300 DEBUG: File src/app/modelo/enum-transacao-sirep.ts excluded for coverage
2026-09-18T13:46:34.3010912Z 10:46:34.301 DEBUG: 'src/app/modelo/enum-transacao.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3013116Z 10:46:34.301 DEBUG: 'src/app/modelo/enum-transacao.ts' indexed with language 'ts'
2026-09-18T13:46:34.3013382Z 10:46:34.301 DEBUG: File src/app/modelo/enum-transacao.ts excluded for coverage
2026-09-18T13:46:34.3015797Z 10:46:34.301 DEBUG: 'src/app/modelo/estorno.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3016896Z 10:46:34.301 DEBUG: 'src/app/modelo/estorno.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3017119Z 10:46:34.301 DEBUG: File src/app/modelo/estorno.model.ts excluded for coverage
2026-09-18T13:46:34.3019526Z 10:46:34.301 DEBUG: 'src/app/modelo/exportar-plataforma-externa.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3020679Z 10:46:34.301 DEBUG: 'src/app/modelo/exportar-plataforma-externa.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3020926Z 10:46:34.302 DEBUG: File src/app/modelo/exportar-plataforma-externa.model.ts excluded for coverage
2026-09-18T13:46:34.3023205Z 10:46:34.302 DEBUG: 'src/app/modelo/fiador-avalista.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3024445Z 10:46:34.302 DEBUG: 'src/app/modelo/fiador-avalista.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3025219Z 10:46:34.302 DEBUG: File src/app/modelo/fiador-avalista.model.ts excluded for coverage
2026-09-18T13:46:34.3027506Z 10:46:34.302 DEBUG: 'src/app/modelo/forma-credito-cessao.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3028713Z 10:46:34.302 DEBUG: 'src/app/modelo/forma-credito-cessao.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3029112Z 10:46:34.302 DEBUG: File src/app/modelo/forma-credito-cessao.model.ts excluded for coverage
2026-09-18T13:46:34.3031644Z 10:46:34.303 DEBUG: 'src/app/modelo/fornecedor-vinculado-convenio.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3033103Z 10:46:34.303 DEBUG: 'src/app/modelo/fornecedor-vinculado-convenio.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3033389Z 10:46:34.303 DEBUG: File src/app/modelo/fornecedor-vinculado-convenio.model.ts excluded for coverage
2026-09-18T13:46:34.3036066Z 10:46:34.303 DEBUG: 'src/app/modelo/fornecedor.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3037499Z 10:46:34.303 DEBUG: 'src/app/modelo/fornecedor.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3037693Z 10:46:34.303 DEBUG: File src/app/modelo/fornecedor.model.ts excluded for coverage
2026-09-18T13:46:34.3039773Z 10:46:34.303 DEBUG: 'src/app/modelo/fornecedores-autorizados.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3040918Z 10:46:34.304 DEBUG: 'src/app/modelo/fornecedores-autorizados.ts' indexed with language 'ts'
2026-09-18T13:46:34.3041190Z 10:46:34.304 DEBUG: File src/app/modelo/fornecedores-autorizados.ts excluded for coverage
2026-09-18T13:46:34.3043830Z 10:46:34.304 DEBUG: 'src/app/modelo/garantia.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3044704Z 10:46:34.304 DEBUG: 'src/app/modelo/garantia.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3044974Z 10:46:34.304 DEBUG: File src/app/modelo/garantia.model.ts excluded for coverage
2026-09-18T13:46:34.3047521Z 10:46:34.304 DEBUG: 'src/app/modelo/limites-calculados.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3048375Z 10:46:34.304 DEBUG: 'src/app/modelo/limites-calculados.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3048719Z 10:46:34.304 DEBUG: File src/app/modelo/limites-calculados.model.ts excluded for coverage
2026-09-18T13:46:34.3051705Z 10:46:34.305 DEBUG: 'src/app/modelo/linha-arquivo-recebivel.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3052958Z 10:46:34.305 DEBUG: 'src/app/modelo/linha-arquivo-recebivel.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3053627Z 10:46:34.305 DEBUG: File src/app/modelo/linha-arquivo-recebivel.model.ts excluded for coverage
2026-09-18T13:46:34.3055953Z 10:46:34.305 DEBUG: 'src/app/modelo/liquidacao.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3057074Z 10:46:34.305 DEBUG: 'src/app/modelo/liquidacao.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3057270Z 10:46:34.305 DEBUG: File src/app/modelo/liquidacao.model.ts excluded for coverage
2026-09-18T13:46:34.3059574Z 10:46:34.305 DEBUG: 'src/app/modelo/meio-liquidacao.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3060407Z 10:46:34.305 DEBUG: 'src/app/modelo/meio-liquidacao.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3060745Z 10:46:34.306 DEBUG: File src/app/modelo/meio-liquidacao.model.ts excluded for coverage
2026-09-18T13:46:34.3064156Z 10:46:34.306 DEBUG: 'src/app/modelo/operacao-historico.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3064803Z 10:46:34.306 DEBUG: 'src/app/modelo/operacao-historico.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3065162Z 10:46:34.306 DEBUG: File src/app/modelo/operacao-historico.model.ts excluded for coverage
2026-09-18T13:46:34.3067618Z 10:46:34.306 DEBUG: 'src/app/modelo/ordenacao.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3068305Z 10:46:34.306 DEBUG: 'src/app/modelo/ordenacao.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3068574Z 10:46:34.306 DEBUG: File src/app/modelo/ordenacao.model.ts excluded for coverage
2026-09-18T13:46:34.3071324Z 10:46:34.307 DEBUG: 'src/app/modelo/otp.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3071843Z 10:46:34.307 DEBUG: 'src/app/modelo/otp.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3072085Z 10:46:34.307 DEBUG: File src/app/modelo/otp.model.ts excluded for coverage
2026-09-18T13:46:34.3074616Z 10:46:34.307 DEBUG: 'src/app/modelo/pagamento-recebivel.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3076196Z 10:46:34.307 DEBUG: 'src/app/modelo/pagamento-recebivel.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3076865Z 10:46:34.307 DEBUG: File src/app/modelo/pagamento-recebivel.model.ts excluded for coverage
2026-09-18T13:46:34.3078795Z 10:46:34.307 DEBUG: 'src/app/modelo/paginacao-entrada.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3079810Z 10:46:34.307 DEBUG: 'src/app/modelo/paginacao-entrada.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3080152Z 10:46:34.307 DEBUG: File src/app/modelo/paginacao-entrada.model.ts excluded for coverage
2026-09-18T13:46:34.3082538Z 10:46:34.308 DEBUG: 'src/app/modelo/paginacao-retorno.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3083654Z 10:46:34.308 DEBUG: 'src/app/modelo/paginacao-retorno.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3096532Z 10:46:34.308 DEBUG: File src/app/modelo/paginacao-retorno.model.ts excluded for coverage
2026-09-18T13:46:34.3096868Z 10:46:34.308 DEBUG: 'src/app/modelo/parametro-produto-cessao.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3097157Z 10:46:34.308 DEBUG: 'src/app/modelo/parametro-produto-cessao.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3097393Z 10:46:34.308 DEBUG: File src/app/modelo/parametro-produto-cessao.model.ts excluded for coverage
2026-09-18T13:46:34.3097674Z 10:46:34.308 DEBUG: 'src/app/modelo/parametro-produto-conformidade.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3098019Z 10:46:34.309 DEBUG: 'src/app/modelo/parametro-produto-conformidade.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3098292Z 10:46:34.309 DEBUG: File src/app/modelo/parametro-produto-conformidade.model.ts excluded for coverage
2026-09-18T13:46:34.3098624Z 10:46:34.309 DEBUG: 'src/app/modelo/parametro-produto-convenio.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3098910Z 10:46:34.309 DEBUG: 'src/app/modelo/parametro-produto-convenio.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3099304Z 10:46:34.309 DEBUG: File src/app/modelo/parametro-produto-convenio.model.ts excluded for coverage
2026-09-18T13:46:34.3099581Z 10:46:34.309 DEBUG: 'src/app/modelo/parametro-produto.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3099843Z 10:46:34.309 DEBUG: 'src/app/modelo/parametro-produto.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3100070Z 10:46:34.309 DEBUG: File src/app/modelo/parametro-produto.model.ts excluded for coverage
2026-09-18T13:46:34.3100718Z 10:46:34.310 DEBUG: 'src/app/modelo/perfil.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3134064Z 10:46:34.310 DEBUG: 'src/app/modelo/perfil.ts' indexed with language 'ts'
2026-09-18T13:46:34.3134365Z 10:46:34.310 DEBUG: File src/app/modelo/perfil.ts excluded for coverage
2026-09-18T13:46:34.3134643Z 10:46:34.310 DEBUG: 'src/app/modelo/pessoa-fisica.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3134920Z 10:46:34.310 DEBUG: 'src/app/modelo/pessoa-fisica.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3135334Z 10:46:34.310 DEBUG: File src/app/modelo/pessoa-fisica.model.ts excluded for coverage
2026-09-18T13:46:34.3135577Z 10:46:34.310 DEBUG: 'src/app/modelo/pessoa-juridica.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3135856Z 10:46:34.310 DEBUG: 'src/app/modelo/pessoa-juridica.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3136119Z 10:46:34.310 DEBUG: File src/app/modelo/pessoa-juridica.model.ts excluded for coverage
2026-09-18T13:46:34.3136602Z 10:46:34.311 DEBUG: 'src/app/modelo/plataforma-externa.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3136869Z 10:46:34.311 DEBUG: 'src/app/modelo/plataforma-externa.ts' indexed with language 'ts'
2026-09-18T13:46:34.3137123Z 10:46:34.311 DEBUG: File src/app/modelo/plataforma-externa.ts excluded for coverage
2026-09-18T13:46:34.3137382Z 10:46:34.311 DEBUG: 'src/app/modelo/produto.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3137719Z 10:46:34.311 DEBUG: 'src/app/modelo/produto.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3137875Z 10:46:34.311 DEBUG: File src/app/modelo/produto.model.ts excluded for coverage
2026-09-18T13:46:34.3138159Z 10:46:34.311 DEBUG: 'src/app/modelo/programa-plataforma-externa.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3138520Z 10:46:34.311 DEBUG: 'src/app/modelo/programa-plataforma-externa.ts' indexed with language 'ts'
2026-09-18T13:46:34.3138807Z 10:46:34.312 DEBUG: File src/app/modelo/programa-plataforma-externa.ts excluded for coverage
2026-09-18T13:46:34.3139083Z 10:46:34.312 DEBUG: 'src/app/modelo/recebivel-retorno.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3139349Z 10:46:34.312 DEBUG: 'src/app/modelo/recebivel-retorno.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3139614Z 10:46:34.312 DEBUG: File src/app/modelo/recebivel-retorno.model.ts excluded for coverage
2026-09-18T13:46:34.3139846Z 10:46:34.312 DEBUG: 'src/app/modelo/recebivel.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3140099Z 10:46:34.312 DEBUG: 'src/app/modelo/recebivel.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3140325Z 10:46:34.312 DEBUG: File src/app/modelo/recebivel.model.ts excluded for coverage
2026-09-18T13:46:34.3140605Z 10:46:34.313 DEBUG: 'src/app/modelo/rejeicao-arquivorecebivel.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3140886Z 10:46:34.313 DEBUG: 'src/app/modelo/rejeicao-arquivorecebivel.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3141175Z 10:46:34.313 DEBUG: File src/app/modelo/rejeicao-arquivorecebivel.model.ts excluded for coverage
2026-09-18T13:46:34.3141451Z 10:46:34.313 DEBUG: 'src/app/modelo/representante.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3141705Z 10:46:34.313 DEBUG: 'src/app/modelo/representante.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3141938Z 10:46:34.313 DEBUG: File src/app/modelo/representante.model.ts excluded for coverage
2026-09-18T13:46:34.3142212Z 10:46:34.313 DEBUG: 'src/app/modelo/representanteLegalMonkey.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3142569Z 10:46:34.313 DEBUG: 'src/app/modelo/representanteLegalMonkey.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3142803Z 10:46:34.313 DEBUG: File src/app/modelo/representanteLegalMonkey.model.ts excluded for coverage
2026-09-18T13:46:34.3143084Z 10:46:34.314 DEBUG: 'src/app/modelo/resultado-historico.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3143570Z 10:46:34.314 DEBUG: 'src/app/modelo/resultado-historico.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3143845Z 10:46:34.314 DEBUG: File src/app/modelo/resultado-historico.model.ts excluded for coverage
2026-09-18T13:46:34.3145845Z 10:46:34.314 DEBUG: 'src/app/modelo/situacao.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3146753Z 10:46:34.314 DEBUG: 'src/app/modelo/situacao.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3147067Z 10:46:34.314 DEBUG: File src/app/modelo/situacao.model.ts excluded for coverage
2026-09-18T13:46:34.3149192Z 10:46:34.314 DEBUG: 'src/app/modelo/socio.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3150131Z 10:46:34.314 DEBUG: 'src/app/modelo/socio.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3150490Z 10:46:34.314 DEBUG: File src/app/modelo/socio.model.ts excluded for coverage
2026-09-18T13:46:34.3152699Z 10:46:34.315 DEBUG: 'src/app/modelo/tarifa.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3153563Z 10:46:34.315 DEBUG: 'src/app/modelo/tarifa.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3153814Z 10:46:34.315 DEBUG: File src/app/modelo/tarifa.model.ts excluded for coverage
2026-09-18T13:46:34.3156171Z 10:46:34.315 DEBUG: 'src/app/modelo/termo-cadastramento.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3157141Z 10:46:34.315 DEBUG: 'src/app/modelo/termo-cadastramento.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3157497Z 10:46:34.315 DEBUG: File src/app/modelo/termo-cadastramento.model.ts excluded for coverage
2026-09-18T13:46:34.3159584Z 10:46:34.315 DEBUG: 'src/app/modelo/testemunha-model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3160384Z 10:46:34.315 DEBUG: 'src/app/modelo/testemunha-model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3160720Z 10:46:34.316 DEBUG: File src/app/modelo/testemunha-model.ts excluded for coverage
2026-09-18T13:46:34.3162902Z 10:46:34.316 DEBUG: 'src/app/modelo/tipo-cobranca.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3163923Z 10:46:34.316 DEBUG: 'src/app/modelo/tipo-cobranca.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3164192Z 10:46:34.316 DEBUG: File src/app/modelo/tipo-cobranca.model.ts excluded for coverage
2026-09-18T13:46:34.3166274Z 10:46:34.316 DEBUG: 'src/app/modelo/tipo-documento.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3166974Z 10:46:34.316 DEBUG: 'src/app/modelo/tipo-documento.ts' indexed with language 'ts'
2026-09-18T13:46:34.3167423Z 10:46:34.316 DEBUG: File src/app/modelo/tipo-documento.ts excluded for coverage
2026-09-18T13:46:34.3169443Z 10:46:34.316 DEBUG: 'src/app/modelo/tipo-encargo.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3170369Z 10:46:34.316 DEBUG: 'src/app/modelo/tipo-encargo.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3171112Z 10:46:34.317 DEBUG: File src/app/modelo/tipo-encargo.model.ts excluded for coverage
2026-09-18T13:46:34.3172890Z 10:46:34.317 DEBUG: 'src/app/modelo/tipo-liquidacao.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3173917Z 10:46:34.317 DEBUG: 'src/app/modelo/tipo-liquidacao.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3174180Z 10:46:34.317 DEBUG: File src/app/modelo/tipo-liquidacao.model.ts excluded for coverage
2026-09-18T13:46:34.3176230Z 10:46:34.317 DEBUG: 'src/app/modelo/tipo-plataforma-externa.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3177123Z 10:46:34.317 DEBUG: 'src/app/modelo/tipo-plataforma-externa.ts' indexed with language 'ts'
2026-09-18T13:46:34.3177488Z 10:46:34.317 DEBUG: File src/app/modelo/tipo-plataforma-externa.ts excluded for coverage
2026-09-18T13:46:34.3180394Z 10:46:34.317 DEBUG: 'src/app/modelo/tipo-unidade-contabil.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3183601Z 10:46:34.318 DEBUG: 'src/app/modelo/tipo-unidade-contabil.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3183873Z 10:46:34.318 DEBUG: File src/app/modelo/tipo-unidade-contabil.model.ts excluded for coverage
2026-09-18T13:46:34.3184150Z 10:46:34.318 DEBUG: 'src/app/modelo/tipo-unidade.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3185282Z 10:46:34.318 DEBUG: 'src/app/modelo/tipo-unidade.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3187595Z 10:46:34.318 DEBUG: File src/app/modelo/tipo-unidade.model.ts excluded for coverage
2026-09-18T13:46:34.3187859Z 10:46:34.318 DEBUG: 'src/app/modelo/tipo.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3188781Z 10:46:34.318 DEBUG: 'src/app/modelo/tipo.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3188972Z 10:46:34.318 DEBUG: File src/app/modelo/tipo.model.ts excluded for coverage
2026-09-18T13:46:34.3190989Z 10:46:34.319 DEBUG: 'src/app/modelo/transferencia-curso-anormal.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3191998Z 10:46:34.319 DEBUG: 'src/app/modelo/transferencia-curso-anormal.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3192494Z 10:46:34.319 DEBUG: File src/app/modelo/transferencia-curso-anormal.model.ts excluded for coverage
2026-09-18T13:46:34.3194686Z 10:46:34.319 DEBUG: 'src/app/modelo/unidade.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3195613Z 10:46:34.319 DEBUG: 'src/app/modelo/unidade.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3195881Z 10:46:34.319 DEBUG: File src/app/modelo/unidade.model.ts excluded for coverage
2026-09-18T13:46:34.3198036Z 10:46:34.319 DEBUG: 'src/app/modelo/usuario-logado.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3198964Z 10:46:34.319 DEBUG: 'src/app/modelo/usuario-logado.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3199299Z 10:46:34.319 DEBUG: File src/app/modelo/usuario-logado.model.ts excluded for coverage
2026-09-18T13:46:34.3201580Z 10:46:34.320 DEBUG: 'src/app/modelo/usuario.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3203386Z 10:46:34.320 DEBUG: 'src/app/modelo/usuario.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3203655Z 10:46:34.320 DEBUG: File src/app/modelo/usuario.model.ts excluded for coverage
2026-09-18T13:46:34.3205981Z 10:46:34.320 DEBUG: 'src/app/modelo/validar-rejeitar-cessao-lote.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3206893Z 10:46:34.320 DEBUG: 'src/app/modelo/validar-rejeitar-cessao-lote.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3207287Z 10:46:34.320 DEBUG: File src/app/modelo/validar-rejeitar-cessao-lote.model.ts excluded for coverage
2026-09-18T13:46:34.3209306Z 10:46:34.320 DEBUG: 'src/app/modelo/vencido.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3210021Z 10:46:34.320 DEBUG: 'src/app/modelo/vencido.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3210262Z 10:46:34.320 DEBUG: File src/app/modelo/vencido.model.ts excluded for coverage
2026-09-18T13:46:34.3212598Z 10:46:34.321 DEBUG: 'src/app/modelo/vinculacao-fornecedores.model.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3213752Z 10:46:34.321 DEBUG: 'src/app/modelo/vinculacao-fornecedores.model.ts' indexed with language 'ts'
2026-09-18T13:46:34.3214025Z 10:46:34.321 DEBUG: File src/app/modelo/vinculacao-fornecedores.model.ts excluded for coverage
2026-09-18T13:46:34.3217621Z 10:46:34.321 DEBUG: 'src/app/pipes/conta-corrente-op.pipe.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3218293Z 10:46:34.321 DEBUG: 'src/app/pipes/conta-corrente-op.pipe.ts' indexed with language 'ts'
2026-09-18T13:46:34.3222299Z 10:46:34.322 DEBUG: 'src/app/pipes/conta-corrente.pipe.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3222619Z 10:46:34.322 DEBUG: 'src/app/pipes/conta-corrente.pipe.ts' indexed with language 'ts'
2026-09-18T13:46:34.3225193Z 10:46:34.322 DEBUG: 'src/app/pipes/cpf-cnpj.pipe.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3231305Z 10:46:34.322 DEBUG: 'src/app/pipes/cpf-cnpj.pipe.ts' indexed with language 'ts'
2026-09-18T13:46:34.3231587Z 10:46:34.322 DEBUG: 'src/app/pipes/data.pipe.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3231802Z 10:46:34.322 DEBUG: 'src/app/pipes/data.pipe.ts' indexed with language 'ts'
2026-09-18T13:46:34.3233237Z 10:46:34.323 DEBUG: 'src/app/pipes/ddd.pipe.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3234104Z 10:46:34.323 DEBUG: 'src/app/pipes/ddd.pipe.ts' indexed with language 'ts'
2026-09-18T13:46:34.3236981Z 10:46:34.323 DEBUG: 'src/app/pipes/pipes.module.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3298649Z 10:46:34.323 DEBUG: 'src/app/pipes/pipes.module.ts' indexed with language 'ts'
2026-09-18T13:46:34.3298994Z 10:46:34.324 DEBUG: 'src/app/pipes/telefone.pipe.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3299388Z 10:46:34.324 DEBUG: 'src/app/pipes/telefone.pipe.ts' indexed with language 'ts'
2026-09-18T13:46:34.3299657Z 10:46:34.324 DEBUG: 'src/app/pipes/zero-a-esquerda.pipe.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3300095Z 10:46:34.325 DEBUG: 'src/app/pipes/zero-a-esquerda.pipe.ts' indexed with language 'ts'
2026-09-18T13:46:34.3300449Z 10:46:34.325 DEBUG: 'src/app/services/contrato.service.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3300723Z 10:46:34.325 DEBUG: 'src/app/services/contrato.service.ts' indexed with language 'ts'
2026-09-18T13:46:34.3301008Z 10:46:34.326 DEBUG: 'src/app/services/produto.service.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3301275Z 10:46:34.326 DEBUG: 'src/app/services/produto.service.ts' indexed with language 'ts'
2026-09-18T13:46:34.3301560Z 10:46:34.326 DEBUG: 'src/app/services/sid09.service.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3301957Z 10:46:34.326 DEBUG: 'src/app/services/sid09.service.ts' indexed with language 'ts'
2026-09-18T13:46:34.3302332Z 10:46:34.327 DEBUG: 'src/app/services/siico.service.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3302702Z 10:46:34.327 DEBUG: 'src/app/services/siico.service.ts' indexed with language 'ts'
2026-09-18T13:46:34.3302975Z 10:46:34.327 DEBUG: 'src/app/services/siiso.service.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3303234Z 10:46:34.327 DEBUG: 'src/app/services/siiso.service.ts' indexed with language 'ts'
2026-09-18T13:46:34.3303494Z 10:46:34.328 DEBUG: 'src/app/services/sirep.service.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3303766Z 10:46:34.328 DEBUG: 'src/app/services/sirep.service.ts' indexed with language 'ts'
2026-09-18T13:46:34.3304025Z 10:46:34.328 DEBUG: 'src/app/services/titulo.service.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3304282Z 10:46:34.328 DEBUG: 'src/app/services/titulo.service.ts' indexed with language 'ts'
2026-09-18T13:46:34.3304509Z 10:46:34.328 DEBUG: 'src/app/services/unidade.service.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3304773Z 10:46:34.329 DEBUG: 'src/app/services/unidade.service.ts' indexed with language 'ts'
2026-09-18T13:46:34.3305064Z 10:46:34.329 DEBUG: 'src/app/services/usuario.service.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3305329Z 10:46:34.329 DEBUG: 'src/app/services/usuario.service.ts' indexed with language 'ts'
2026-09-18T13:46:34.3305586Z 10:46:34.330 DEBUG: 'src/app/services/versao.service.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3305855Z 10:46:34.330 DEBUG: 'src/app/services/versao.service.ts' indexed with language 'ts'
2026-09-18T13:46:34.3356617Z 10:46:34.330 DEBUG: 'src/app/utils/mensagem-formatacao.util.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3357078Z 10:46:34.330 DEBUG: 'src/app/utils/mensagem-formatacao.util.ts' indexed with language 'ts'
2026-09-18T13:46:34.3357402Z 10:46:34.331 DEBUG: 'src/app/validators/generic-validator.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3357815Z 10:46:34.331 DEBUG: 'src/app/validators/generic-validator.ts' indexed with language 'ts'
2026-09-18T13:46:34.3358092Z 10:46:34.331 DEBUG: File src/app/validators/generic-validator.ts excluded for coverage
2026-09-18T13:46:34.3358325Z 10:46:34.332 DEBUG: File src/assets/css/app.css was excluded by sonar.javascript.exclusions or sonar.typescript.exclusions
2026-09-18T13:46:34.3358641Z 10:46:34.332 DEBUG: 'src/assets/css/app.css' excluded by org.sonar.plugins.javascript.filter.JavaScriptExclusionsFileFilter
2026-09-18T13:46:34.3358845Z 10:46:34.332 DEBUG: File src/assets/css/bootstrap.css was excluded by sonar.javascript.exclusions or sonar.typescript.exclusions
2026-09-18T13:46:34.3359177Z 10:46:34.332 DEBUG: 'src/assets/css/bootstrap.css' excluded by org.sonar.plugins.javascript.filter.JavaScriptExclusionsFileFilter
2026-09-18T13:46:34.3359502Z 10:46:34.332 DEBUG: File src/assets/css/custom-fonts.css was excluded by sonar.javascript.exclusions or sonar.typescript.exclusions
2026-09-18T13:46:34.3359833Z 10:46:34.332 DEBUG: 'src/assets/css/custom-fonts.css' excluded by org.sonar.plugins.javascript.filter.JavaScriptExclusionsFileFilter
2026-09-18T13:46:34.3360136Z 10:46:34.332 DEBUG: 'src/assets/css/fonts/CAIXAStd-Bold.eot' indexed with no language
2026-09-18T13:46:34.3360590Z 10:46:34.332 DEBUG: File src/assets/css/fonts/CAIXAStd-Bold.eot excluded for coverage
2026-09-18T13:46:34.3360846Z 10:46:34.332 DEBUG: 'src/assets/css/fonts/CAIXAStd-Bold.woff' indexed with no language
2026-09-18T13:46:34.3361101Z 10:46:34.332 DEBUG: File src/assets/css/fonts/CAIXAStd-Bold.woff excluded for coverage
2026-09-18T13:46:34.3361365Z 10:46:34.332 DEBUG: 'src/assets/css/fonts/CAIXAStd-Bold.woff2' indexed with no language
2026-09-18T13:46:34.3361593Z 10:46:34.332 DEBUG: File src/assets/css/fonts/CAIXAStd-Bold.woff2 excluded for coverage
2026-09-18T13:46:34.3361850Z 10:46:34.333 DEBUG: 'src/assets/css/fonts/CAIXAStd-BoldItalic.eot' indexed with no language
2026-09-18T13:46:34.3362133Z 10:46:34.333 DEBUG: File src/assets/css/fonts/CAIXAStd-BoldItalic.eot excluded for coverage
2026-09-18T13:46:34.3362474Z 10:46:34.333 DEBUG: 'src/assets/css/fonts/CAIXAStd-BoldItalic.woff' indexed with no language
2026-09-18T13:46:34.3362773Z 10:46:34.333 DEBUG: File src/assets/css/fonts/CAIXAStd-BoldItalic.woff excluded for coverage
2026-09-18T13:46:34.3363035Z 10:46:34.333 DEBUG: 'src/assets/css/fonts/CAIXAStd-BoldItalic.woff2' indexed with no language
2026-09-18T13:46:34.3363295Z 10:46:34.333 DEBUG: File src/assets/css/fonts/CAIXAStd-BoldItalic.woff2 excluded for coverage
2026-09-18T13:46:34.3363514Z 10:46:34.333 DEBUG: 'src/assets/css/fonts/CAIXAStd-Book.eot' indexed with no language
2026-09-18T13:46:34.3363767Z 10:46:34.333 DEBUG: File src/assets/css/fonts/CAIXAStd-Book.eot excluded for coverage
2026-09-18T13:46:34.3364023Z 10:46:34.333 DEBUG: 'src/assets/css/fonts/CAIXAStd-Book.woff' indexed with no language
2026-09-18T13:46:34.3364278Z 10:46:34.333 DEBUG: File src/assets/css/fonts/CAIXAStd-Book.woff excluded for coverage
2026-09-18T13:46:34.3364626Z 10:46:34.333 DEBUG: 'src/assets/css/fonts/CAIXAStd-Book.woff2' indexed with no language
2026-09-18T13:46:34.3364880Z 10:46:34.333 DEBUG: File src/assets/css/fonts/CAIXAStd-Book.woff2 excluded for coverage
2026-09-18T13:46:34.3365153Z 10:46:34.334 DEBUG: 'src/assets/css/fonts/CAIXAStd-BookItalic.eot' indexed with no language
2026-09-18T13:46:34.3365383Z 10:46:34.334 DEBUG: File src/assets/css/fonts/CAIXAStd-BookItalic.eot excluded for coverage
2026-09-18T13:46:34.3365643Z 10:46:34.334 DEBUG: 'src/assets/css/fonts/CAIXAStd-BookItalic.woff' indexed with no language
2026-09-18T13:46:34.3365970Z 10:46:34.334 DEBUG: File src/assets/css/fonts/CAIXAStd-BookItalic.woff excluded for coverage
2026-09-18T13:46:34.3366231Z 10:46:34.334 DEBUG: 'src/assets/css/fonts/CAIXAStd-BookItalic.woff2' indexed with no language
2026-09-18T13:46:34.3366496Z 10:46:34.334 DEBUG: File src/assets/css/fonts/CAIXAStd-BookItalic.woff2 excluded for coverage
2026-09-18T13:46:34.3366768Z 10:46:34.334 DEBUG: 'src/assets/css/fonts/CAIXAStd-ExtraBold.eot' indexed with no language
2026-09-18T13:46:34.3367047Z 10:46:34.334 DEBUG: File src/assets/css/fonts/CAIXAStd-ExtraBold.eot excluded for coverage
2026-09-18T13:46:34.3367306Z 10:46:34.334 DEBUG: 'src/assets/css/fonts/CAIXAStd-ExtraBold.woff' indexed with no language
2026-09-18T13:46:34.3367530Z 10:46:34.334 DEBUG: File src/assets/css/fonts/CAIXAStd-ExtraBold.woff excluded for coverage
2026-09-18T13:46:34.3367814Z 10:46:34.335 DEBUG: 'src/assets/css/fonts/CAIXAStd-ExtraBold.woff2' indexed with no language
2026-09-18T13:46:34.3368083Z 10:46:34.335 DEBUG: File src/assets/css/fonts/CAIXAStd-ExtraBold.woff2 excluded for coverage
2026-09-18T13:46:34.3368352Z 10:46:34.335 DEBUG: 'src/assets/css/fonts/CAIXAStd-ExtraBoldItalic.eot' indexed with no language
2026-09-18T13:46:34.3368620Z 10:46:34.335 DEBUG: File src/assets/css/fonts/CAIXAStd-ExtraBoldItalic.eot excluded for coverage
2026-09-18T13:46:34.3368905Z 10:46:34.335 DEBUG: 'src/assets/css/fonts/CAIXAStd-ExtraBoldItalic.woff' indexed with no language
2026-09-18T13:46:34.3369175Z 10:46:34.335 DEBUG: File src/assets/css/fonts/CAIXAStd-ExtraBoldItalic.woff excluded for coverage
2026-09-18T13:46:34.3369455Z 10:46:34.335 DEBUG: 'src/assets/css/fonts/CAIXAStd-ExtraBoldItalic.woff2' indexed with no language
2026-09-18T13:46:34.3369734Z 10:46:34.335 DEBUG: File src/assets/css/fonts/CAIXAStd-ExtraBoldItalic.woff2 excluded for coverage
2026-09-18T13:46:34.3370012Z 10:46:34.335 DEBUG: 'src/assets/css/fonts/CAIXAStd-Italic.eot' indexed with no language
2026-09-18T13:46:34.3370267Z 10:46:34.335 DEBUG: File src/assets/css/fonts/CAIXAStd-Italic.eot excluded for coverage
2026-09-18T13:46:34.3370527Z 10:46:34.336 DEBUG: 'src/assets/css/fonts/CAIXAStd-Italic.woff' indexed with no language
2026-09-18T13:46:34.3370784Z 10:46:34.336 DEBUG: File src/assets/css/fonts/CAIXAStd-Italic.woff excluded for coverage
2026-09-18T13:46:34.3371050Z 10:46:34.336 DEBUG: 'src/assets/css/fonts/CAIXAStd-Italic.woff2' indexed with no language
2026-09-18T13:46:34.3371307Z 10:46:34.336 DEBUG: File src/assets/css/fonts/CAIXAStd-Italic.woff2 excluded for coverage
2026-09-18T13:46:34.3371526Z 10:46:34.336 DEBUG: 'src/assets/css/fonts/CAIXAStd-Light.eot' indexed with no language
2026-09-18T13:46:34.3371784Z 10:46:34.336 DEBUG: File src/assets/css/fonts/CAIXAStd-Light.eot excluded for coverage
2026-09-18T13:46:34.3372035Z 10:46:34.336 DEBUG: 'src/assets/css/fonts/CAIXAStd-Light.woff' indexed with no language
2026-09-18T13:46:34.3372308Z 10:46:34.336 DEBUG: File src/assets/css/fonts/CAIXAStd-Light.woff excluded for coverage
2026-09-18T13:46:34.3372637Z 10:46:34.336 DEBUG: 'src/assets/css/fonts/CAIXAStd-Light.woff2' indexed with no language
2026-09-18T13:46:34.3372898Z 10:46:34.336 DEBUG: File src/assets/css/fonts/CAIXAStd-Light.woff2 excluded for coverage
2026-09-18T13:46:34.3373362Z 10:46:34.337 DEBUG: 'src/assets/css/fonts/CAIXAStd-LightItalic.eot' indexed with no language
2026-09-18T13:46:34.3373651Z 10:46:34.337 DEBUG: File src/assets/css/fonts/CAIXAStd-LightItalic.eot excluded for coverage
2026-09-18T13:46:34.3373882Z 10:46:34.337 DEBUG: 'src/assets/css/fonts/CAIXAStd-LightItalic.woff' indexed with no language
2026-09-18T13:46:34.3374147Z 10:46:34.337 DEBUG: File src/assets/css/fonts/CAIXAStd-LightItalic.woff excluded for coverage
2026-09-18T13:46:34.3374594Z 10:46:34.337 DEBUG: 'src/assets/css/fonts/CAIXAStd-LightItalic.woff2' indexed with no language
2026-09-18T13:46:34.3374871Z 10:46:34.337 DEBUG: File src/assets/css/fonts/CAIXAStd-LightItalic.woff2 excluded for coverage
2026-09-18T13:46:34.3403269Z 10:46:34.337 DEBUG: 'src/assets/css/fonts/CAIXAStd-Regular.eot' indexed with no language
2026-09-18T13:46:34.3404063Z 10:46:34.337 DEBUG: File src/assets/css/fonts/CAIXAStd-Regular.eot excluded for coverage
2026-09-18T13:46:34.3404357Z 10:46:34.337 DEBUG: 'src/assets/css/fonts/CAIXAStd-Regular.woff' indexed with no language
2026-09-18T13:46:34.3404629Z 10:46:34.337 DEBUG: File src/assets/css/fonts/CAIXAStd-Regular.woff excluded for coverage
2026-09-18T13:46:34.3404891Z 10:46:34.337 DEBUG: 'src/assets/css/fonts/CAIXAStd-Regular.woff2' indexed with no language
2026-09-18T13:46:34.3405160Z 10:46:34.337 DEBUG: File src/assets/css/fonts/CAIXAStd-Regular.woff2 excluded for coverage
2026-09-18T13:46:34.3405430Z 10:46:34.338 DEBUG: 'src/assets/css/fonts/CAIXAStd-SemiBold.eot' indexed with no language
2026-09-18T13:46:34.3405834Z 10:46:34.338 DEBUG: File src/assets/css/fonts/CAIXAStd-SemiBold.eot excluded for coverage
2026-09-18T13:46:34.3406099Z 10:46:34.338 DEBUG: 'src/assets/css/fonts/CAIXAStd-SemiBold.woff' indexed with no language
2026-09-18T13:46:34.3406328Z 10:46:34.338 DEBUG: File src/assets/css/fonts/CAIXAStd-SemiBold.woff excluded for coverage
2026-09-18T13:46:34.3406696Z 10:46:34.338 DEBUG: 'src/assets/css/fonts/CAIXAStd-SemiBold.woff2' indexed with no language
2026-09-18T13:46:34.3406968Z 10:46:34.338 DEBUG: File src/assets/css/fonts/CAIXAStd-SemiBold.woff2 excluded for coverage
2026-09-18T13:46:34.3407241Z 10:46:34.338 DEBUG: 'src/assets/css/fonts/CAIXAStd-SemiBoldItalic.eot' indexed with no language
2026-09-18T13:46:34.3407503Z 10:46:34.338 DEBUG: File src/assets/css/fonts/CAIXAStd-SemiBoldItalic.eot excluded for coverage
2026-09-18T13:46:34.3407769Z 10:46:34.338 DEBUG: 'src/assets/css/fonts/CAIXAStd-SemiBoldItalic.woff' indexed with no language
2026-09-18T13:46:34.3408119Z 10:46:34.338 DEBUG: File src/assets/css/fonts/CAIXAStd-SemiBoldItalic.woff excluded for coverage
2026-09-18T13:46:34.3408359Z 10:46:34.339 DEBUG: 'src/assets/css/fonts/CAIXAStd-SemiBoldItalic.woff2' indexed with no language
2026-09-18T13:46:34.3408658Z 10:46:34.339 DEBUG: File src/assets/css/fonts/CAIXAStd-SemiBoldItalic.woff2 excluded for coverage
2026-09-18T13:46:34.3408923Z 10:46:34.339 DEBUG: 'src/assets/css/fonts/data-table.eot' indexed with no language
2026-09-18T13:46:34.3409181Z 10:46:34.339 DEBUG: File src/assets/css/fonts/data-table.eot excluded for coverage
2026-09-18T13:46:34.3409445Z 10:46:34.339 DEBUG: 'src/assets/css/fonts/data-table.svg' indexed with no language
2026-09-18T13:46:34.3409698Z 10:46:34.339 DEBUG: File src/assets/css/fonts/data-table.svg excluded for coverage
2026-09-18T13:46:34.3409943Z 10:46:34.339 DEBUG: 'src/assets/css/fonts/data-table.ttf' indexed with no language
2026-09-18T13:46:34.3410199Z 10:46:34.339 DEBUG: File src/assets/css/fonts/data-table.ttf excluded for coverage
2026-09-18T13:46:34.3410410Z 10:46:34.339 DEBUG: 'src/assets/css/fonts/data-table.woff' indexed with no language
2026-09-18T13:46:34.3410660Z 10:46:34.339 DEBUG: File src/assets/css/fonts/data-table.woff excluded for coverage
2026-09-18T13:46:34.3410889Z 10:46:34.339 DEBUG: File src/assets/css/icons.css was excluded by sonar.javascript.exclusions or sonar.typescript.exclusions
2026-09-18T13:46:34.3411207Z 10:46:34.339 DEBUG: 'src/assets/css/icons.css' excluded by org.sonar.plugins.javascript.filter.JavaScriptExclusionsFileFilter
2026-09-18T13:46:34.3411437Z 10:46:34.339 DEBUG: File src/assets/css/index.css was excluded by sonar.javascript.exclusions or sonar.typescript.exclusions
2026-09-18T13:46:34.3411747Z 10:46:34.339 DEBUG: 'src/assets/css/index.css' excluded by org.sonar.plugins.javascript.filter.JavaScriptExclusionsFileFilter
2026-09-18T13:46:34.3411976Z 10:46:34.340 DEBUG: File src/assets/css/material.css was excluded by sonar.javascript.exclusions or sonar.typescript.exclusions
2026-09-18T13:46:34.3412292Z 10:46:34.340 DEBUG: 'src/assets/css/material.css' excluded by org.sonar.plugins.javascript.filter.JavaScriptExclusionsFileFilter
2026-09-18T13:46:34.3412714Z 10:46:34.340 DEBUG: File src/assets/css/multiple-select-style.css was excluded by sonar.javascript.exclusions or sonar.typescript.exclusions
2026-09-18T13:46:34.3413138Z 10:46:34.340 DEBUG: 'src/assets/css/multiple-select-style.css' excluded by org.sonar.plugins.javascript.filter.JavaScriptExclusionsFileFilter
2026-09-18T13:46:34.3413372Z 10:46:34.340 DEBUG: File src/assets/css/style.css was excluded by sonar.javascript.exclusions or sonar.typescript.exclusions
2026-09-18T13:46:34.3413707Z 10:46:34.340 DEBUG: 'src/assets/css/style.css' excluded by org.sonar.plugins.javascript.filter.JavaScriptExclusionsFileFilter
2026-09-18T13:46:34.3413983Z 10:46:34.340 DEBUG: 'src/assets/csv/SIREP_Gerador_CSV_v1.5.xlsm' indexed with no language
2026-09-18T13:46:34.3414237Z 10:46:34.340 DEBUG: 'src/assets/imgs/1.gif' indexed with no language
2026-09-18T13:46:34.3414421Z 10:46:34.340 DEBUG: File src/assets/imgs/1.gif excluded for coverage
2026-09-18T13:46:34.3414656Z 10:46:34.340 DEBUG: 'src/assets/imgs/2.gif' indexed with no language
2026-09-18T13:46:34.3414798Z 10:46:34.340 DEBUG: File src/assets/imgs/2.gif excluded for coverage
2026-09-18T13:46:34.3415193Z 10:46:34.340 DEBUG: 'src/assets/imgs/arrow-down.png' indexed with no language
2026-09-18T13:46:34.3415458Z 10:46:34.340 DEBUG: File src/assets/imgs/arrow-down.png excluded for coverage
2026-09-18T13:46:34.3415707Z 10:46:34.341 DEBUG: 'src/assets/imgs/arrow-left.png' indexed with no language
2026-09-18T13:46:34.3415962Z 10:46:34.341 DEBUG: File src/assets/imgs/arrow-left.png excluded for coverage
2026-09-18T13:46:34.3416203Z 10:46:34.341 DEBUG: 'src/assets/imgs/arrow-right.png' indexed with no language
2026-09-18T13:46:34.3416444Z 10:46:34.341 DEBUG: File src/assets/imgs/arrow-right.png excluded for coverage
2026-09-18T13:46:34.3416730Z 10:46:34.341 DEBUG: 'src/assets/imgs/arrow-up.png' indexed with no language
2026-09-18T13:46:34.3416938Z 10:46:34.341 DEBUG: File src/assets/imgs/arrow-up.png excluded for coverage
2026-09-18T13:46:34.3417191Z 10:46:34.341 DEBUG: 'src/assets/imgs/bg.png' indexed with no language
2026-09-18T13:46:34.3417369Z 10:46:34.341 DEBUG: File src/assets/imgs/bg.png excluded for coverage
2026-09-18T13:46:34.3417721Z 10:46:34.341 DEBUG: 'src/assets/imgs/chosen-sprite.png' indexed with no language
2026-09-18T13:46:34.3418628Z 10:46:34.341 DEBUG: File src/assets/imgs/chosen-sprite.png excluded for coverage
2026-09-18T13:46:34.3418945Z 10:46:34.341 DEBUG: 'src/assets/imgs/chosen-sprite@2x.png' indexed with no language
2026-09-18T13:46:34.3419173Z 10:46:34.341 DEBUG: File src/assets/imgs/chosen-sprite@2x.png excluded for coverage
2026-09-18T13:46:34.3476611Z 10:46:34.341 DEBUG: 'src/assets/imgs/construcao.png' indexed with no language
2026-09-18T13:46:34.3476903Z 10:46:34.341 DEBUG: File src/assets/imgs/construcao.png excluded for coverage
2026-09-18T13:46:34.3477201Z 10:46:34.342 DEBUG: 'src/assets/imgs/details_close.png' indexed with no language
2026-09-18T13:46:34.3477392Z 10:46:34.342 DEBUG: File src/assets/imgs/details_close.png excluded for coverage
2026-09-18T13:46:34.3477747Z 10:46:34.342 DEBUG: 'src/assets/imgs/details_open.png' indexed with no language
2026-09-18T13:46:34.3477899Z 10:46:34.342 DEBUG: File src/assets/imgs/details_open.png excluded for coverage
2026-09-18T13:46:34.3478172Z 10:46:34.342 DEBUG: 'src/assets/imgs/elemento-da-marca.png' indexed with no language
2026-09-18T13:46:34.3478436Z 10:46:34.342 DEBUG: File src/assets/imgs/elemento-da-marca.png excluded for coverage
2026-09-18T13:46:34.3478697Z 10:46:34.342 DEBUG: 'src/assets/imgs/glyphicons-halflings-white.png' indexed with no language
2026-09-18T13:46:34.3478969Z 10:46:34.342 DEBUG: File src/assets/imgs/glyphicons-halflings-white.png excluded for coverage
2026-09-18T13:46:34.3479226Z 10:46:34.342 DEBUG: 'src/assets/imgs/glyphicons-halflings.png' indexed with no language
2026-09-18T13:46:34.3479502Z 10:46:34.342 DEBUG: File src/assets/imgs/glyphicons-halflings.png excluded for coverage
2026-09-18T13:46:34.3479718Z 10:46:34.342 DEBUG: 'src/assets/imgs/ico_status_ok.gif' indexed with no language
2026-09-18T13:46:34.3479928Z 10:46:34.342 DEBUG: File src/assets/imgs/ico_status_ok.gif excluded for coverage
2026-09-18T13:46:34.3480170Z 10:46:34.343 DEBUG: 'src/assets/imgs/icon-info.png' indexed with no language
2026-09-18T13:46:34.3480570Z 10:46:34.343 DEBUG: File src/assets/imgs/icon-info.png excluded for coverage
2026-09-18T13:46:34.3480817Z 10:46:34.343 DEBUG: 'src/assets/imgs/icone-usuario.png' indexed with no language
2026-09-18T13:46:34.3481062Z 10:46:34.343 DEBUG: File src/assets/imgs/icone-usuario.png excluded for coverage
2026-09-18T13:46:34.3481304Z 10:46:34.343 DEBUG: 'src/assets/imgs/icone_pdf.png' indexed with no language
2026-09-18T13:46:34.3481452Z 10:46:34.343 DEBUG: File src/assets/imgs/icone_pdf.png excluded for coverage
2026-09-18T13:46:34.3481723Z 10:46:34.343 DEBUG: 'src/assets/imgs/lnDivisoriaSimulacaoPJ.png' indexed with no language
2026-09-18T13:46:34.3481920Z 10:46:34.343 DEBUG: File src/assets/imgs/lnDivisoriaSimulacaoPJ.png excluded for coverage
2026-09-18T13:46:34.3482183Z 10:46:34.343 DEBUG: 'src/assets/imgs/loading.gif' indexed with no language
2026-09-18T13:46:34.3482437Z 10:46:34.343 DEBUG: File src/assets/imgs/loading.gif excluded for coverage
2026-09-18T13:46:34.3482708Z 10:46:34.343 DEBUG: 'src/assets/imgs/localizacaoSimulacaoPJ.png' indexed with no language
2026-09-18T13:46:34.3482903Z 10:46:34.343 DEBUG: File src/assets/imgs/localizacaoSimulacaoPJ.png excluded for coverage
2026-09-18T13:46:34.3483114Z 10:46:34.344 DEBUG: 'src/assets/imgs/logo.gif' indexed with no language
2026-09-18T13:46:34.3483319Z 10:46:34.344 DEBUG: File src/assets/imgs/logo.gif excluded for coverage
2026-09-18T13:46:34.3483563Z 10:46:34.344 DEBUG: 'src/assets/imgs/logo.png' indexed with no language
2026-09-18T13:46:34.3483738Z 10:46:34.344 DEBUG: File src/assets/imgs/logo.png excluded for coverage
2026-09-18T13:46:34.3484039Z 10:46:34.344 DEBUG: 'src/assets/imgs/logoCaixaSimulacaoPJ.png' indexed with no language
2026-09-18T13:46:34.3484327Z 10:46:34.344 DEBUG: File src/assets/imgs/logoCaixaSimulacaoPJ.png excluded for coverage
2026-09-18T13:46:34.3484580Z 10:46:34.344 DEBUG: 'src/assets/imgs/logo_impressao.gif' indexed with no language
2026-09-18T13:46:34.3484766Z 10:46:34.344 DEBUG: File src/assets/imgs/logo_impressao.gif excluded for coverage
2026-09-18T13:46:34.3484978Z 10:46:34.344 DEBUG: 'src/assets/imgs/logocaixa.jpg' indexed with no language
2026-09-18T13:46:34.3485166Z 10:46:34.344 DEBUG: File src/assets/imgs/logocaixa.jpg excluded for coverage
2026-09-18T13:46:34.3485421Z 10:46:34.344 DEBUG: 'src/assets/imgs/lupa.png' indexed with no language
2026-09-18T13:46:34.3485596Z 10:46:34.344 DEBUG: File src/assets/imgs/lupa.png excluded for coverage
2026-09-18T13:46:34.3485846Z 10:46:34.344 DEBUG: 'src/assets/imgs/mapaSimulacaoPj.png' indexed with no language
2026-09-18T13:46:34.3486038Z 10:46:34.344 DEBUG: File src/assets/imgs/mapaSimulacaoPj.png excluded for coverage
2026-09-18T13:46:34.3486310Z 10:46:34.345 DEBUG: 'src/assets/imgs/obrigadoSimulacaoPJ.png' indexed with no language
2026-09-18T13:46:34.3486472Z 10:46:34.345 DEBUG: File src/assets/imgs/obrigadoSimulacaoPJ.png excluded for coverage
2026-09-18T13:46:34.3486718Z 10:46:34.345 DEBUG: 'src/assets/imgs/sort_asc.png' indexed with no language
2026-09-18T13:46:34.3486916Z 10:46:34.345 DEBUG: File src/assets/imgs/sort_asc.png excluded for coverage
2026-09-18T13:46:34.3487169Z 10:46:34.345 DEBUG: 'src/assets/imgs/sort_asc_disabled.png' indexed with no language
2026-09-18T13:46:34.3487376Z 10:46:34.345 DEBUG: File src/assets/imgs/sort_asc_disabled.png excluded for coverage
2026-09-18T13:46:34.3487614Z 10:46:34.345 DEBUG: 'src/assets/imgs/sort_both.png' indexed with no language
2026-09-18T13:46:34.3487797Z 10:46:34.345 DEBUG: File src/assets/imgs/sort_both.png excluded for coverage
2026-09-18T13:46:34.3488005Z 10:46:34.345 DEBUG: 'src/assets/imgs/sort_desc.png' indexed with no language
2026-09-18T13:46:34.3488186Z 10:46:34.345 DEBUG: File src/assets/imgs/sort_desc.png excluded for coverage
2026-09-18T13:46:34.3488451Z 10:46:34.345 DEBUG: 'src/assets/imgs/sort_desc_disabled.png' indexed with no language
2026-09-18T13:46:34.3488638Z 10:46:34.345 DEBUG: File src/assets/imgs/sort_desc_disabled.png excluded for coverage
2026-09-18T13:46:34.3488925Z 10:46:34.346 DEBUG: 'src/assets/imgs/stepComplete.png' indexed with no language
2026-09-18T13:46:34.3489118Z 10:46:34.346 DEBUG: File src/assets/imgs/stepComplete.png excluded for coverage
2026-09-18T13:46:34.3489329Z 10:46:34.346 DEBUG: File src/assets/js/bootstrap.js was excluded by sonar.javascript.exclusions or sonar.typescript.exclusions
2026-09-18T13:46:34.3489613Z 10:46:34.346 DEBUG: 'src/assets/js/bootstrap.js' excluded by org.sonar.plugins.javascript.filter.JavaScriptExclusionsFileFilter
2026-09-18T13:46:34.3489930Z 10:46:34.346 DEBUG: File src/assets/js/jquery-ui.min.js was excluded by sonar.javascript.exclusions or sonar.typescript.exclusions
2026-09-18T13:46:34.3490258Z 10:46:34.346 DEBUG: 'src/assets/js/jquery-ui.min.js' excluded by org.sonar.plugins.javascript.filter.JavaScriptExclusionsFileFilter
2026-09-18T13:46:34.3490489Z 10:46:34.346 DEBUG: File src/assets/js/jquery.js was excluded by sonar.javascript.exclusions or sonar.typescript.exclusions
2026-09-18T13:46:34.3490819Z 10:46:34.346 DEBUG: 'src/assets/js/jquery.js' excluded by org.sonar.plugins.javascript.filter.JavaScriptExclusionsFileFilter
2026-09-18T13:46:34.3491112Z 10:46:34.346 DEBUG: 'src/environments/environment.dev.inter.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3491389Z 10:46:34.346 DEBUG: 'src/environments/environment.dev.inter.ts' indexed with language 'ts'
2026-09-18T13:46:34.3491584Z 10:46:34.346 DEBUG: File src/environments/environment.dev.inter.ts excluded for coverage
2026-09-18T13:46:34.3491782Z 10:46:34.346 DEBUG: File src/environments/environment.dev.inter.ts excluded for duplication
2026-09-18T13:46:34.3492052Z 10:46:34.347 DEBUG: 'src/environments/environment.dev.intra.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3492318Z 10:46:34.347 DEBUG: 'src/environments/environment.dev.intra.ts' indexed with language 'ts'
2026-09-18T13:46:34.3492584Z 10:46:34.347 DEBUG: File src/environments/environment.dev.intra.ts excluded for coverage
2026-09-18T13:46:34.3492856Z 10:46:34.347 DEBUG: File src/environments/environment.dev.intra.ts excluded for duplication
2026-09-18T13:46:34.3493144Z 10:46:34.347 DEBUG: 'src/environments/environment.prod.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3493415Z 10:46:34.347 DEBUG: 'src/environments/environment.prod.ts' indexed with language 'ts'
2026-09-18T13:46:34.3493609Z 10:46:34.347 DEBUG: File src/environments/environment.prod.ts excluded for coverage
2026-09-18T13:46:34.3493766Z 10:46:34.347 DEBUG: File src/environments/environment.prod.ts excluded for duplication
2026-09-18T13:46:34.3494037Z 10:46:34.347 DEBUG: 'src/environments/environment.test.inter.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3494303Z 10:46:34.348 DEBUG: 'src/environments/environment.test.inter.ts' indexed with language 'ts'
2026-09-18T13:46:34.3494498Z 10:46:34.348 DEBUG: File src/environments/environment.test.inter.ts excluded for coverage
2026-09-18T13:46:34.3494698Z 10:46:34.348 DEBUG: File src/environments/environment.test.inter.ts excluded for duplication
2026-09-18T13:46:34.3495133Z 10:46:34.348 DEBUG: 'src/environments/environment.test.intra.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3495421Z 10:46:34.348 DEBUG: 'src/environments/environment.test.intra.ts' indexed with language 'ts'
2026-09-18T13:46:34.3495696Z 10:46:34.348 DEBUG: File src/environments/environment.test.intra.ts excluded for coverage
2026-09-18T13:46:34.3495902Z 10:46:34.348 DEBUG: File src/environments/environment.test.intra.ts excluded for duplication
2026-09-18T13:46:34.3499927Z 10:46:34.349 DEBUG: 'src/environments/environment.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3500243Z 10:46:34.349 DEBUG: 'src/environments/environment.ts' indexed with language 'ts'
2026-09-18T13:46:34.3500436Z 10:46:34.349 DEBUG: File src/environments/environment.ts excluded for coverage
2026-09-18T13:46:34.3500634Z 10:46:34.349 DEBUG: File src/environments/environment.ts excluded for duplication
2026-09-18T13:46:34.3501549Z 10:46:34.350 DEBUG: 'src/environments/version.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3502461Z 10:46:34.350 DEBUG: 'src/environments/version.ts' indexed with language 'ts'
2026-09-18T13:46:34.3502775Z 10:46:34.350 DEBUG: File src/environments/version.ts excluded for coverage
2026-09-18T13:46:34.3504961Z 10:46:34.350 DEBUG: 'src/favicon.ico' indexed with no language
2026-09-18T13:46:34.3505296Z 10:46:34.350 DEBUG: 'src/index.html' indexed with language 'web'
2026-09-18T13:46:34.3507398Z 10:46:34.350 DEBUG: 'src/json-typings.d.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3508018Z 10:46:34.350 DEBUG: 'src/json-typings.d.ts' indexed with language 'ts'
2026-09-18T13:46:34.3510221Z 10:46:34.350 DEBUG: File src/main.ts was excluded by sonar.javascript.exclusions or sonar.typescript.exclusions
2026-09-18T13:46:34.3510530Z 10:46:34.350 DEBUG: 'src/main.ts' excluded by org.sonar.plugins.javascript.filter.JavaScriptExclusionsFileFilter
2026-09-18T13:46:34.3511727Z 10:46:34.351 DEBUG: 'src/polyfills.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3513913Z 10:46:34.351 DEBUG: 'src/polyfills.ts' indexed with language 'ts'
2026-09-18T13:46:34.3522511Z 10:46:34.351 DEBUG: 'src/styles.css' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3522756Z 10:46:34.351 DEBUG: Average line length for src/styles.css is 20
2026-09-18T13:46:34.3522998Z 10:46:34.351 DEBUG: 'src/styles.css' indexed with language 'css'
2026-09-18T13:46:34.3523241Z 10:46:34.352 DEBUG: 'src/test.ts' generated metadata with charset 'UTF-8'
2026-09-18T13:46:34.3523473Z 10:46:34.352 DEBUG: 'src/test.ts' indexed with language 'ts'
2026-09-18T13:46:34.3524072Z 10:46:34.352 DEBUG: 'src/tsconfig.app.json' indexed with language 'json'
2026-09-18T13:46:34.3528771Z 10:46:34.352 DEBUG: 'src/tsconfig.spec.json' indexed with language 'json'
2026-09-18T13:46:34.3529412Z 10:46:34.352 DEBUG: File src/typings.d.ts was excluded by sonar.javascript.exclusions or sonar.typescript.exclusions
2026-09-18T13:46:34.3529750Z 10:46:34.352 DEBUG: 'src/typings.d.ts' excluded by org.sonar.plugins.javascript.filter.JavaScriptExclusionsFileFilter
2026-09-18T13:46:34.3550497Z 10:46:34.354 DEBUG: 'src/app/app.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.3552770Z 10:46:34.355 DEBUG: 'src/app/app.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.3552973Z 10:46:34.355 DEBUG: File src/app/app.component.spec.ts excluded for coverage
2026-09-18T13:46:34.3557617Z 10:46:34.355 DEBUG: 'src/app/app.error-handler.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.3559307Z 10:46:34.355 DEBUG: 'src/app/app.error-handler.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.3559639Z 10:46:34.355 DEBUG: File src/app/app.error-handler.spec.ts excluded for coverage
2026-09-18T13:46:34.3619146Z 10:46:34.361 DEBUG: 'src/app/components/adapters/app-date-adapter.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.3620287Z 10:46:34.361 DEBUG: 'src/app/components/adapters/app-date-adapter.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.3620547Z 10:46:34.361 DEBUG: File src/app/components/adapters/app-date-adapter.spec.ts excluded for coverage
2026-09-18T13:46:34.3629521Z 10:46:34.362 DEBUG: 'src/app/components/alert/alert-type.model.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.3630598Z 10:46:34.363 DEBUG: 'src/app/components/alert/alert-type.model.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.3630997Z 10:46:34.363 DEBUG: File src/app/components/alert/alert-type.model.spec.ts excluded for coverage
2026-09-18T13:46:34.3635524Z 10:46:34.363 DEBUG: 'src/app/components/alert/alert.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.3637182Z 10:46:34.363 DEBUG: 'src/app/components/alert/alert.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.3637437Z 10:46:34.363 DEBUG: File src/app/components/alert/alert.component.spec.ts excluded for coverage
2026-09-18T13:46:34.3640359Z 10:46:34.363 DEBUG: 'src/app/components/alert/alert.service.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.3641982Z 10:46:34.364 DEBUG: 'src/app/components/alert/alert.service.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.3642194Z 10:46:34.364 DEBUG: File src/app/components/alert/alert.service.spec.ts excluded for coverage
2026-09-18T13:46:34.3645561Z 10:46:34.364 DEBUG: 'src/app/components/campo-excludente/campo-excludente-form.model.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.3647624Z 10:46:34.364 DEBUG: 'src/app/components/campo-excludente/campo-excludente-form.model.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.3647976Z 10:46:34.364 DEBUG: File src/app/components/campo-excludente/campo-excludente-form.model.spec.ts excluded for coverage
2026-09-18T13:46:34.3651837Z 10:46:34.365 DEBUG: 'src/app/components/campo-excludente/campo-excludente.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.3653858Z 10:46:34.365 DEBUG: 'src/app/components/campo-excludente/campo-excludente.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.3654215Z 10:46:34.365 DEBUG: File src/app/components/campo-excludente/campo-excludente.component.spec.ts excluded for coverage
2026-09-18T13:46:34.3656518Z 10:46:34.365 DEBUG: 'src/app/components/campo-excludente/campo-excludente.model.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.3657764Z 10:46:34.365 DEBUG: 'src/app/components/campo-excludente/campo-excludente.model.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.3658107Z 10:46:34.365 DEBUG: File src/app/components/campo-excludente/campo-excludente.model.spec.ts excluded for coverage
2026-09-18T13:46:34.3660713Z 10:46:34.366 DEBUG: 'src/app/components/campo-excludente/campo-excludente.service.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.3662093Z 10:46:34.366 DEBUG: 'src/app/components/campo-excludente/campo-excludente.service.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.3662559Z 10:46:34.366 DEBUG: File src/app/components/campo-excludente/campo-excludente.service.spec.ts excluded for coverage
2026-09-18T13:46:34.3702639Z 10:46:34.366 DEBUG: 'src/app/components/cessao/cessao-autorizar/autorizar-caixa/liberar-cessao/liberar-cessao-caixa-component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.3703234Z 10:46:34.367 DEBUG: 'src/app/components/cessao/cessao-autorizar/autorizar-caixa/liberar-cessao/liberar-cessao-caixa-component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.3703644Z 10:46:34.367 DEBUG: File src/app/components/cessao/cessao-autorizar/autorizar-caixa/liberar-cessao/liberar-cessao-caixa-component.spec.ts excluded for coverage
2026-09-18T13:46:34.3704017Z 10:46:34.368 DEBUG: 'src/app/components/cessao/cessao-autorizar/autorizar-caixa/lista-cessoes/cessoes-caixa.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.3704378Z 10:46:34.368 DEBUG: 'src/app/components/cessao/cessao-autorizar/autorizar-caixa/lista-cessoes/cessoes-caixa.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.3704724Z 10:46:34.368 DEBUG: File src/app/components/cessao/cessao-autorizar/autorizar-caixa/lista-cessoes/cessoes-caixa.component.spec.ts excluded for coverage
2026-09-18T13:46:34.3705094Z 10:46:34.369 DEBUG: 'src/app/components/cessao/cessao-autorizar/autorizar-convenente/lista-cessoes/cessoes-convenente.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.3705473Z 10:46:34.369 DEBUG: 'src/app/components/cessao/cessao-autorizar/autorizar-convenente/lista-cessoes/cessoes-convenente.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.3705934Z 10:46:34.369 DEBUG: File src/app/components/cessao/cessao-autorizar/autorizar-convenente/lista-cessoes/cessoes-convenente.component.spec.ts excluded for coverage
2026-09-18T13:46:34.3713497Z 10:46:34.371 DEBUG: 'src/app/components/cessao/cessao-autorizar/dados-cessao.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.3713971Z 10:46:34.371 DEBUG: 'src/app/components/cessao/cessao-autorizar/dados-cessao.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.3714300Z 10:46:34.371 DEBUG: File src/app/components/cessao/cessao-autorizar/dados-cessao.component.spec.ts excluded for coverage
2026-09-18T13:46:34.3717699Z 10:46:34.371 DEBUG: 'src/app/components/cessao/cessao-cadastro/cessao-selecao/cessao-selecao.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.3718809Z 10:46:34.371 DEBUG: 'src/app/components/cessao/cessao-cadastro/cessao-selecao/cessao-selecao.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.3719152Z 10:46:34.371 DEBUG: File src/app/components/cessao/cessao-cadastro/cessao-selecao/cessao-selecao.component.spec.ts excluded for coverage
2026-09-18T13:46:34.3737478Z 10:46:34.373 DEBUG: 'src/app/components/cessao/cessao-detalhe/cessao-detalhe.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.3740587Z 10:46:34.373 DEBUG: 'src/app/components/cessao/cessao-detalhe/cessao-detalhe.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.3740904Z 10:46:34.373 DEBUG: File src/app/components/cessao/cessao-detalhe/cessao-detalhe.component.spec.ts excluded for coverage
2026-09-18T13:46:34.3744450Z 10:46:34.374 DEBUG: 'src/app/components/cessao/cessao-lista/cessao-lista.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.3746182Z 10:46:34.374 DEBUG: 'src/app/components/cessao/cessao-lista/cessao-lista.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.3746500Z 10:46:34.374 DEBUG: File src/app/components/cessao/cessao-lista/cessao-lista.component.spec.ts excluded for coverage
2026-09-18T13:46:34.3749997Z 10:46:34.374 DEBUG: 'src/app/components/cessao/cessao.routing.module.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.3752022Z 10:46:34.375 DEBUG: 'src/app/components/cessao/cessao.routing.module.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.3753669Z 10:46:34.375 DEBUG: File src/app/components/cessao/cessao.routing.module.spec.ts excluded for coverage
2026-09-18T13:46:34.3759084Z 10:46:34.375 DEBUG: 'src/app/components/cessao/cessao.service.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.3760753Z 10:46:34.375 DEBUG: 'src/app/components/cessao/cessao.service.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.3760972Z 10:46:34.376 DEBUG: File src/app/components/cessao/cessao.service.spec.ts excluded for coverage
2026-09-18T13:46:34.3773753Z 10:46:34.377 DEBUG: 'src/app/components/cessao/lista-recebiveis/lista-recebiveis.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.3776364Z 10:46:34.377 DEBUG: 'src/app/components/cessao/lista-recebiveis/lista-recebiveis.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.3776689Z 10:46:34.377 DEBUG: File src/app/components/cessao/lista-recebiveis/lista-recebiveis.component.spec.ts excluded for coverage
2026-09-18T13:46:34.3783220Z 10:46:34.378 DEBUG: 'src/app/components/conformidade/conformidade-dados-cadastrais/conformidade-dados/conformidade-dados.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.3785367Z 10:46:34.378 DEBUG: 'src/app/components/conformidade/conformidade-dados-cadastrais/conformidade-dados/conformidade-dados.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.3785746Z 10:46:34.378 DEBUG: File src/app/components/conformidade/conformidade-dados-cadastrais/conformidade-dados/conformidade-dados.component.spec.ts excluded for coverage
2026-09-18T13:46:34.3792639Z 10:46:34.379 DEBUG: 'src/app/components/conformidade/conformidade-detalhe/conformidade-detalhe.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.3795762Z 10:46:34.379 DEBUG: 'src/app/components/conformidade/conformidade-detalhe/conformidade-detalhe.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.3796118Z 10:46:34.379 DEBUG: File src/app/components/conformidade/conformidade-detalhe/conformidade-detalhe.component.spec.ts excluded for coverage
2026-09-18T13:46:34.3833828Z 10:46:34.380 DEBUG: 'src/app/components/conformidade/conformidade-lista/conformidade-lista.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.3834321Z 10:46:34.380 DEBUG: 'src/app/components/conformidade/conformidade-lista/conformidade-lista.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.3834669Z 10:46:34.380 DEBUG: File src/app/components/conformidade/conformidade-lista/conformidade-lista.component.spec.ts excluded for coverage
2026-09-18T13:46:34.3835072Z 10:46:34.381 DEBUG: 'src/app/components/conformidade/conformidade-tratar/perfil-agencia/termo-cadastramento-fornecedor/termo-cadastramento-fornecedor.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.3835672Z 10:46:34.381 DEBUG: 'src/app/components/conformidade/conformidade-tratar/perfil-agencia/termo-cadastramento-fornecedor/termo-cadastramento-fornecedor.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.3836099Z 10:46:34.381 DEBUG: File src/app/components/conformidade/conformidade-tratar/perfil-agencia/termo-cadastramento-fornecedor/termo-cadastramento-fornecedor.component.spec.ts excluded for coverage
2026-09-18T13:46:34.3836665Z 10:46:34.381 DEBUG: 'src/app/components/conformidade/conformidade.routing.module.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.3836993Z 10:46:34.382 DEBUG: 'src/app/components/conformidade/conformidade.routing.module.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.3837185Z 10:46:34.382 DEBUG: File src/app/components/conformidade/conformidade.routing.module.spec.ts excluded for coverage
2026-09-18T13:46:34.3837516Z 10:46:34.382 DEBUG: 'src/app/components/conformidade/conformidade.service.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.3837819Z 10:46:34.382 DEBUG: 'src/app/components/conformidade/conformidade.service.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.3838034Z 10:46:34.382 DEBUG: File src/app/components/conformidade/conformidade.service.spec.ts excluded for coverage
2026-09-18T13:46:34.3838383Z 10:46:34.383 DEBUG: 'src/app/components/consultas/avaliacao-risco/avaliacao-risco-detalhe/avaliacao-risco-detalhe.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.3838781Z 10:46:34.383 DEBUG: 'src/app/components/consultas/avaliacao-risco/avaliacao-risco-detalhe/avaliacao-risco-detalhe.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.3839144Z 10:46:34.383 DEBUG: File src/app/components/consultas/avaliacao-risco/avaliacao-risco-detalhe/avaliacao-risco-detalhe.component.spec.ts excluded for coverage
2026-09-18T13:46:34.3913008Z 10:46:34.383 DEBUG: 'src/app/components/consultas/avaliacao-risco/avaliacao-risco.service.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.3913748Z 10:46:34.384 DEBUG: 'src/app/components/consultas/avaliacao-risco/avaliacao-risco.service.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.3914282Z 10:46:34.384 DEBUG: File src/app/components/consultas/avaliacao-risco/avaliacao-risco.service.spec.ts excluded for coverage
2026-09-18T13:46:34.3919262Z 10:46:34.391 DEBUG: 'src/app/components/consultas/consultas.routing.module.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.3921938Z 10:46:34.391 DEBUG: 'src/app/components/consultas/consultas.routing.module.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.3922338Z 10:46:34.391 DEBUG: File src/app/components/consultas/consultas.routing.module.spec.ts excluded for coverage
2026-09-18T13:46:34.3934324Z 10:46:34.393 DEBUG: 'src/app/components/consultas/plataforma-externa/plataforma-externa.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.3935734Z 10:46:34.393 DEBUG: 'src/app/components/consultas/plataforma-externa/plataforma-externa.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.3936291Z 10:46:34.393 DEBUG: File src/app/components/consultas/plataforma-externa/plataforma-externa.component.spec.ts excluded for coverage
2026-09-18T13:46:34.3940140Z 10:46:34.393 DEBUG: 'src/app/components/consultas/plataforma-externa/plataforma-externa.service.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.3942016Z 10:46:34.394 DEBUG: 'src/app/components/consultas/plataforma-externa/plataforma-externa.service.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.3942637Z 10:46:34.394 DEBUG: File src/app/components/consultas/plataforma-externa/plataforma-externa.service.spec.ts excluded for coverage
2026-09-18T13:46:34.3946621Z 10:46:34.394 DEBUG: 'src/app/components/consultas/plataforma-externa/resultado-pesquisa-cessao/resultado-pesquisa-cessao.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.3948935Z 10:46:34.394 DEBUG: 'src/app/components/consultas/plataforma-externa/resultado-pesquisa-cessao/resultado-pesquisa-cessao.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.3949665Z 10:46:34.394 DEBUG: File src/app/components/consultas/plataforma-externa/resultado-pesquisa-cessao/resultado-pesquisa-cessao.component.spec.ts excluded for coverage
2026-09-18T13:46:34.3953631Z 10:46:34.395 DEBUG: 'src/app/components/consultas/plataforma-externa/resultado-pesquisa-desvincular-fornecedor/resultado-pesquisa-desvincular-fornecedor.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.3955989Z 10:46:34.395 DEBUG: 'src/app/components/consultas/plataforma-externa/resultado-pesquisa-desvincular-fornecedor/resultado-pesquisa-desvincular-fornecedor.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.3956644Z 10:46:34.395 DEBUG: File src/app/components/consultas/plataforma-externa/resultado-pesquisa-desvincular-fornecedor/resultado-pesquisa-desvincular-fornecedor.component.spec.ts excluded for coverage
2026-09-18T13:46:34.3962877Z 10:46:34.396 DEBUG: 'src/app/components/consultas/plataforma-externa/resultado-pesquisa-solicitacaorecebida/resultado-pesquisa-solicitacaorecebida.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.3965225Z 10:46:34.396 DEBUG: 'src/app/components/consultas/plataforma-externa/resultado-pesquisa-solicitacaorecebida/resultado-pesquisa-solicitacaorecebida.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.3965947Z 10:46:34.396 DEBUG: File src/app/components/consultas/plataforma-externa/resultado-pesquisa-solicitacaorecebida/resultado-pesquisa-solicitacaorecebida.component.spec.ts excluded for coverage
2026-09-18T13:46:34.3972713Z 10:46:34.397 DEBUG: 'src/app/components/convenente/arquivo-lista/arquivo-lista.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.3973761Z 10:46:34.397 DEBUG: 'src/app/components/convenente/arquivo-lista/arquivo-lista.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.3974288Z 10:46:34.397 DEBUG: File src/app/components/convenente/arquivo-lista/arquivo-lista.component.spec.ts excluded for coverage
2026-09-18T13:46:34.3980396Z 10:46:34.397 DEBUG: 'src/app/components/convenente/convenente.routing.module.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.3982160Z 10:46:34.398 DEBUG: 'src/app/components/convenente/convenente.routing.module.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.3982623Z 10:46:34.398 DEBUG: File src/app/components/convenente/convenente.routing.module.spec.ts excluded for coverage
2026-09-18T13:46:34.3991249Z 10:46:34.399 DEBUG: 'src/app/components/convenente/receber-arquivo-recebivel/receber-arquivo-recebivel.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.3993285Z 10:46:34.399 DEBUG: 'src/app/components/convenente/receber-arquivo-recebivel/receber-arquivo-recebivel.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.3993838Z 10:46:34.399 DEBUG: File src/app/components/convenente/receber-arquivo-recebivel/receber-arquivo-recebivel.component.spec.ts excluded for coverage
2026-09-18T13:46:34.3998065Z 10:46:34.399 DEBUG: 'src/app/components/convenio-shared/avaliacao-de-risco-dados-detalhe/avaliacao-risco-dados-detalhe.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.3999971Z 10:46:34.399 DEBUG: 'src/app/components/convenio-shared/avaliacao-de-risco-dados-detalhe/avaliacao-risco-dados-detalhe.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4000606Z 10:46:34.399 DEBUG: File src/app/components/convenio-shared/avaliacao-de-risco-dados-detalhe/avaliacao-risco-dados-detalhe.component.spec.ts excluded for coverage
2026-09-18T13:46:34.4007658Z 10:46:34.400 DEBUG: 'src/app/components/convenio-shared/dados-detalhe/convenio-dados-detalhe.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4009277Z 10:46:34.400 DEBUG: 'src/app/components/convenio-shared/dados-detalhe/convenio-dados-detalhe.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4009860Z 10:46:34.400 DEBUG: File src/app/components/convenio-shared/dados-detalhe/convenio-dados-detalhe.component.spec.ts excluded for coverage
2026-09-18T13:46:34.4017650Z 10:46:34.401 DEBUG: 'src/app/components/convenio/contrato-convenio-contrato/contrato-convenio-contrato.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4019472Z 10:46:34.401 DEBUG: 'src/app/components/convenio/contrato-convenio-contrato/contrato-convenio-contrato.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4020068Z 10:46:34.401 DEBUG: File src/app/components/convenio/contrato-convenio-contrato/contrato-convenio-contrato.component.spec.ts excluded for coverage
2026-09-18T13:46:34.4054016Z 10:46:34.405 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-acoes-botoes/cadastro-convenio-acoes-botoes/cadastro-convenio-acoes-botoes.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4056776Z 10:46:34.405 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-acoes-botoes/cadastro-convenio-acoes-botoes/cadastro-convenio-acoes-botoes.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4057550Z 10:46:34.405 DEBUG: File src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-acoes-botoes/cadastro-convenio-acoes-botoes/cadastro-convenio-acoes-botoes.component.spec.ts excluded for coverage
2026-09-18T13:46:34.4064540Z 10:46:34.406 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-avaliacao/cadastro-convenio-avaliacao-vencida/cadastro-convenio-avaliacao-vencida.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4065358Z 10:46:34.406 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-avaliacao/cadastro-convenio-avaliacao-vencida/cadastro-convenio-avaliacao-vencida.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4066109Z 10:46:34.406 DEBUG: File src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-avaliacao/cadastro-convenio-avaliacao-vencida/cadastro-convenio-avaliacao-vencida.component.spec.ts excluded for coverage
2026-09-18T13:46:34.4088085Z 10:46:34.408 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-convenente/cadastro-convenio-convenente/cadastro-convenio-convenente.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4090413Z 10:46:34.408 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-convenente/cadastro-convenio-convenente/cadastro-convenio-convenente.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4091337Z 10:46:34.408 DEBUG: File src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-convenente/cadastro-convenio-convenente/cadastro-convenio-convenente.component.spec.ts excluded for coverage
2026-09-18T13:46:34.4098365Z 10:46:34.409 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-dados/cadastro-convenio-dados/cadastro-convenio-dados.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4099490Z 10:46:34.409 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-dados/cadastro-convenio-dados/cadastro-convenio-dados.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4100181Z 10:46:34.409 DEBUG: File src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-dados/cadastro-convenio-dados/cadastro-convenio-dados.component.spec.ts excluded for coverage
2026-09-18T13:46:34.4106582Z 10:46:34.410 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-em-alteracao-conformidade/cadastro-convenio-em-alteracao-conformidade.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4109108Z 10:46:34.410 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-em-alteracao-conformidade/cadastro-convenio-em-alteracao-conformidade.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4110058Z 10:46:34.410 DEBUG: File src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-em-alteracao-conformidade/cadastro-convenio-em-alteracao-conformidade.component.spec.ts excluded for coverage
2026-09-18T13:46:34.4116576Z 10:46:34.411 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-em-alteracao/cadastro-em-alteracao/cadastro-convenio-em-alteracao.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4119488Z 10:46:34.411 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-em-alteracao/cadastro-em-alteracao/cadastro-convenio-em-alteracao.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4120214Z 10:46:34.411 DEBUG: File src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-em-alteracao/cadastro-em-alteracao/cadastro-convenio-em-alteracao.component.spec.ts excluded for coverage
2026-09-18T13:46:34.4126802Z 10:46:34.412 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-em-cadastramento/cadastro-em-cadastramento/cadastro-convenio-em-cadastramento.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4128142Z 10:46:34.412 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-em-cadastramento/cadastro-em-cadastramento/cadastro-convenio-em-cadastramento.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4128899Z 10:46:34.412 DEBUG: File src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-em-cadastramento/cadastro-em-cadastramento/cadastro-convenio-em-cadastramento.component.spec.ts excluded for coverage
2026-09-18T13:46:34.4134179Z 10:46:34.413 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-novo/cadastro-novo/cadastro-convenio-novo.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4136420Z 10:46:34.413 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-novo/cadastro-novo/cadastro-convenio-novo.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4137100Z 10:46:34.413 DEBUG: File src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-novo/cadastro-novo/cadastro-convenio-novo.component.spec.ts excluded for coverage
2026-09-18T13:46:34.4158738Z 10:46:34.415 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/convenio-cadastro.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4160491Z 10:46:34.415 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/convenio-cadastro.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4161029Z 10:46:34.415 DEBUG: File src/app/components/convenio/convenio-wizard/convenio-cadastro/convenio-cadastro.component.spec.ts excluded for coverage
2026-09-18T13:46:34.4167665Z 10:46:34.416 DEBUG: 'src/app/components/convenio/convenio.routing.module.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4169848Z 10:46:34.416 DEBUG: 'src/app/components/convenio/convenio.routing.module.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4170351Z 10:46:34.416 DEBUG: File src/app/components/convenio/convenio.routing.module.spec.ts excluded for coverage
2026-09-18T13:46:34.4182221Z 10:46:34.418 DEBUG: 'src/app/components/fornecedor/fornecedor-alteracao/fornecedor-alteracao.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4184413Z 10:46:34.418 DEBUG: 'src/app/components/fornecedor/fornecedor-alteracao/fornecedor-alteracao.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4184987Z 10:46:34.418 DEBUG: File src/app/components/fornecedor/fornecedor-alteracao/fornecedor-alteracao.component.spec.ts excluded for coverage
2026-09-18T13:46:34.4192319Z 10:46:34.419 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-contas/contas-caixa/fornecedor-vinculacao-contas-caixa-alteracao.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4194912Z 10:46:34.419 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-contas/contas-caixa/fornecedor-vinculacao-contas-caixa-alteracao.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4195633Z 10:46:34.419 DEBUG: File src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-contas/contas-caixa/fornecedor-vinculacao-contas-caixa-alteracao.spec.ts excluded for coverage
2026-09-18T13:46:34.4200271Z 10:46:34.419 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-contas/contas-caixa/fornecedor-vinculacao-contas-caixa-inclusao.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4202925Z 10:46:34.420 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-contas/contas-caixa/fornecedor-vinculacao-contas-caixa-inclusao.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4203656Z 10:46:34.420 DEBUG: File src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-contas/contas-caixa/fornecedor-vinculacao-contas-caixa-inclusao.spec.ts excluded for coverage
2026-09-18T13:46:34.4209513Z 10:46:34.420 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-contas/contas-outros-bancos/fornecedor-vinculacao-contas-outros-bancos-alteracao.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4211981Z 10:46:34.421 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-contas/contas-outros-bancos/fornecedor-vinculacao-contas-outros-bancos-alteracao.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4212825Z 10:46:34.421 DEBUG: File src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-contas/contas-outros-bancos/fornecedor-vinculacao-contas-outros-bancos-alteracao.spec.ts excluded for coverage
2026-09-18T13:46:34.4218138Z 10:46:34.421 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-contas/contas-outros-bancos/fornecedor-vinculacao-contas-outros-bancos-inclusao.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4220675Z 10:46:34.421 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-contas/contas-outros-bancos/fornecedor-vinculacao-contas-outros-bancos-inclusao.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4221749Z 10:46:34.421 DEBUG: File src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-contas/contas-outros-bancos/fornecedor-vinculacao-contas-outros-bancos-inclusao.spec.ts excluded for coverage
2026-09-18T13:46:34.4226223Z 10:46:34.422 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-contato/fornecedor-vinculacao-manter-contato.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4228596Z 10:46:34.422 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-contato/fornecedor-vinculacao-manter-contato.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4229279Z 10:46:34.422 DEBUG: File src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-contato/fornecedor-vinculacao-manter-contato.spec.ts excluded for coverage
2026-09-18T13:46:34.4234811Z 10:46:34.423 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-dados-basicos-fornecedor/fornecedor-vinculacao-manter-dados-basicos-fornecedor.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4237337Z 10:46:34.423 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-dados-basicos-fornecedor/fornecedor-vinculacao-manter-dados-basicos-fornecedor.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4240121Z 10:46:34.423 DEBUG: File src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-dados-basicos-fornecedor/fornecedor-vinculacao-manter-dados-basicos-fornecedor.spec.ts excluded for coverage
2026-09-18T13:46:34.4255234Z 10:46:34.425 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-representante/fornecedor-vinculacao-manter-representante.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4256346Z 10:46:34.425 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-representante/fornecedor-vinculacao-manter-representante.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4257067Z 10:46:34.425 DEBUG: File src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-representante/fornecedor-vinculacao-manter-representante.spec.ts excluded for coverage
2026-09-18T13:46:34.4263295Z 10:46:34.426 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4265350Z 10:46:34.426 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4265961Z 10:46:34.426 DEBUG: File src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter.component.spec.ts excluded for coverage
2026-09-18T13:46:34.4268990Z 10:46:34.426 DEBUG: 'src/app/components/fornecedor/fornecedor.routing.module.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4270751Z 10:46:34.426 DEBUG: 'src/app/components/fornecedor/fornecedor.routing.module.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4271226Z 10:46:34.426 DEBUG: File src/app/components/fornecedor/fornecedor.routing.module.spec.ts excluded for coverage
2026-09-18T13:46:34.4274639Z 10:46:34.427 DEBUG: 'src/app/components/fornecedor/vinculacao.service.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4276632Z 10:46:34.427 DEBUG: 'src/app/components/fornecedor/vinculacao.service.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4277013Z 10:46:34.427 DEBUG: File src/app/components/fornecedor/vinculacao.service.spec.ts excluded for coverage
2026-09-18T13:46:34.4291104Z 10:46:34.428 DEBUG: 'src/app/components/home/home.routing.module.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4291637Z 10:46:34.428 DEBUG: 'src/app/components/home/home.routing.module.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4291988Z 10:46:34.428 DEBUG: File src/app/components/home/home.routing.module.spec.ts excluded for coverage
2026-09-18T13:46:34.4297150Z 10:46:34.429 DEBUG: 'src/app/components/input/input.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4298954Z 10:46:34.429 DEBUG: 'src/app/components/input/input.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4299321Z 10:46:34.429 DEBUG: File src/app/components/input/input.component.spec.ts excluded for coverage
2026-09-18T13:46:34.4309282Z 10:46:34.430 DEBUG: 'src/app/components/menu/menu.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4309759Z 10:46:34.430 DEBUG: 'src/app/components/menu/menu.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4310003Z 10:46:34.430 DEBUG: File src/app/components/menu/menu.component.spec.ts excluded for coverage
2026-09-18T13:46:34.4312648Z 10:46:34.431 DEBUG: 'src/app/components/menu/menu.service.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4313974Z 10:46:34.431 DEBUG: 'src/app/components/menu/menu.service.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4314192Z 10:46:34.431 DEBUG: File src/app/components/menu/menu.service.spec.ts excluded for coverage
2026-09-18T13:46:34.4337070Z 10:46:34.433 DEBUG: 'src/app/components/modal/modal.service.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4338230Z 10:46:34.433 DEBUG: 'src/app/components/modal/modal.service.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4338491Z 10:46:34.433 DEBUG: File src/app/components/modal/modal.service.spec.ts excluded for coverage
2026-09-18T13:46:34.4342663Z 10:46:34.434 DEBUG: 'src/app/components/otp/otp.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4344426Z 10:46:34.434 DEBUG: 'src/app/components/otp/otp.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4344603Z 10:46:34.434 DEBUG: File src/app/components/otp/otp.component.spec.ts excluded for coverage
2026-09-18T13:46:34.4347603Z 10:46:34.434 DEBUG: 'src/app/components/otp/otp.service.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4349279Z 10:46:34.434 DEBUG: 'src/app/components/otp/otp.service.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4349484Z 10:46:34.434 DEBUG: File src/app/components/otp/otp.service.spec.ts excluded for coverage
2026-09-18T13:46:34.4352871Z 10:46:34.435 DEBUG: 'src/app/components/page-error/page-error.routing.module.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4354475Z 10:46:34.435 DEBUG: 'src/app/components/page-error/page-error.routing.module.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4354897Z 10:46:34.435 DEBUG: File src/app/components/page-error/page-error.routing.module.spec.ts excluded for coverage
2026-09-18T13:46:34.4377585Z 10:46:34.437 DEBUG: 'src/app/components/parametros/encargos-atraso/encargos-atraso-alterar/encargos-atraso-alterar.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4379247Z 10:46:34.437 DEBUG: 'src/app/components/parametros/encargos-atraso/encargos-atraso-alterar/encargos-atraso-alterar.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4379745Z 10:46:34.437 DEBUG: File src/app/components/parametros/encargos-atraso/encargos-atraso-alterar/encargos-atraso-alterar.component.spec.ts excluded for coverage
2026-09-18T13:46:34.4397295Z 10:46:34.439 DEBUG: 'src/app/components/parametros/parametro-produto-criar/parametro-produto-criar.componente.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4399429Z 10:46:34.439 DEBUG: 'src/app/components/parametros/parametro-produto-criar/parametro-produto-criar.componente.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4399951Z 10:46:34.439 DEBUG: File src/app/components/parametros/parametro-produto-criar/parametro-produto-criar.componente.spec.ts excluded for coverage
2026-09-18T13:46:34.4406126Z 10:46:34.440 DEBUG: 'src/app/components/parametros/parametro-produto/parametro-produto.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4408207Z 10:46:34.440 DEBUG: 'src/app/components/parametros/parametro-produto/parametro-produto.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4408539Z 10:46:34.440 DEBUG: File src/app/components/parametros/parametro-produto/parametro-produto.component.spec.ts excluded for coverage
2026-09-18T13:46:34.4414282Z 10:46:34.441 DEBUG: 'src/app/components/parametros/parametro-produto/parametro-produto.service.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4416422Z 10:46:34.441 DEBUG: 'src/app/components/parametros/parametro-produto/parametro-produto.service.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4416749Z 10:46:34.441 DEBUG: File src/app/components/parametros/parametro-produto/parametro-produto.service.spec.ts excluded for coverage
2026-09-18T13:46:34.4426651Z 10:46:34.442 DEBUG: 'src/app/components/parametros/parametros.routing.module.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4428600Z 10:46:34.442 DEBUG: 'src/app/components/parametros/parametros.routing.module.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4429115Z 10:46:34.442 DEBUG: File src/app/components/parametros/parametros.routing.module.spec.ts excluded for coverage
2026-09-18T13:46:34.4436964Z 10:46:34.443 DEBUG: 'src/app/components/perfil-acesso/perfil-acesso.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4440117Z 10:46:34.443 DEBUG: 'src/app/components/perfil-acesso/perfil-acesso.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4440494Z 10:46:34.443 DEBUG: File src/app/components/perfil-acesso/perfil-acesso.component.spec.ts excluded for coverage
2026-09-18T13:46:34.4448285Z 10:46:34.444 DEBUG: 'src/app/components/perfil-selecao/perfil-selecao.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4448993Z 10:46:34.444 DEBUG: 'src/app/components/perfil-selecao/perfil-selecao.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4449329Z 10:46:34.444 DEBUG: File src/app/components/perfil-selecao/perfil-selecao.component.spec.ts excluded for coverage
2026-09-18T13:46:34.4472841Z 10:46:34.446 DEBUG: 'src/app/components/recebivel/recebivel-lista/recebivel-lista.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4488818Z 10:46:34.446 DEBUG: 'src/app/components/recebivel/recebivel-lista/recebivel-lista.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4489163Z 10:46:34.446 DEBUG: File src/app/components/recebivel/recebivel-lista/recebivel-lista.component.spec.ts excluded for coverage
2026-09-18T13:46:34.4489496Z 10:46:34.447 DEBUG: 'src/app/components/recebivel/recebivel.routing.module.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4489808Z 10:46:34.447 DEBUG: 'src/app/components/recebivel/recebivel.routing.module.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4490030Z 10:46:34.447 DEBUG: File src/app/components/recebivel/recebivel.routing.module.spec.ts excluded for coverage
2026-09-18T13:46:34.4490333Z 10:46:34.447 DEBUG: 'src/app/components/recebivel/recebivel.service.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4490651Z 10:46:34.447 DEBUG: 'src/app/components/recebivel/recebivel.service.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4490829Z 10:46:34.447 DEBUG: File src/app/components/recebivel/recebivel.service.spec.ts excluded for coverage
2026-09-18T13:46:34.4493356Z 10:46:34.449 DEBUG: 'src/app/components/teste/teste.routing.module.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4493984Z 10:46:34.449 DEBUG: 'src/app/components/teste/teste.routing.module.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4494194Z 10:46:34.449 DEBUG: File src/app/components/teste/teste.routing.module.spec.ts excluded for coverage
2026-09-18T13:46:34.4502560Z 10:46:34.449 DEBUG: 'src/app/components/versao/versao.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4503032Z 10:46:34.450 DEBUG: 'src/app/components/versao/versao.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4503249Z 10:46:34.450 DEBUG: File src/app/components/versao/versao.component.spec.ts excluded for coverage
2026-09-18T13:46:34.4505071Z 10:46:34.450 DEBUG: 'src/app/components/wizard-step/wizard-step.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4507294Z 10:46:34.450 DEBUG: 'src/app/components/wizard-step/wizard-step.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4507647Z 10:46:34.450 DEBUG: File src/app/components/wizard-step/wizard-step.component.spec.ts excluded for coverage
2026-09-18T13:46:34.4511099Z 10:46:34.450 DEBUG: 'src/app/components/wizard/wizard.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4511881Z 10:46:34.451 DEBUG: 'src/app/components/wizard/wizard.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4512234Z 10:46:34.451 DEBUG: File src/app/components/wizard/wizard.component.spec.ts excluded for coverage
2026-09-18T13:46:34.4517035Z 10:46:34.451 DEBUG: 'src/app/components/xml-contrato/xml-contrato.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4519051Z 10:46:34.451 DEBUG: 'src/app/components/xml-contrato/xml-contrato.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4519495Z 10:46:34.451 DEBUG: File src/app/components/xml-contrato/xml-contrato.component.spec.ts excluded for coverage
2026-09-18T13:46:34.4525010Z 10:46:34.452 DEBUG: 'src/app/directives/base-pattern-mask.directive.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4528549Z 10:46:34.452 DEBUG: 'src/app/directives/base-pattern-mask.directive.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4528906Z 10:46:34.452 DEBUG: File src/app/directives/base-pattern-mask.directive.spec.ts excluded for coverage
2026-09-18T13:46:34.4543320Z 10:46:34.454 DEBUG: 'src/app/directives/simple-mask-money/simple-mask-money.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4545666Z 10:46:34.454 DEBUG: 'src/app/directives/simple-mask-money/simple-mask-money.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4545970Z 10:46:34.454 DEBUG: File src/app/directives/simple-mask-money/simple-mask-money.spec.ts excluded for coverage
2026-09-18T13:46:34.4549698Z 10:46:34.454 DEBUG: 'src/app/dummy.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4550036Z 10:46:34.454 DEBUG: 'src/app/dummy.component.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4550377Z 10:46:34.454 DEBUG: File src/app/dummy.component.spec.ts excluded for coverage
2026-09-18T13:46:34.4567903Z 10:46:34.456 DEBUG: 'src/app/pipes/conta-corrente-op.pipe.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4569713Z 10:46:34.456 DEBUG: 'src/app/pipes/conta-corrente-op.pipe.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4570138Z 10:46:34.456 DEBUG: File src/app/pipes/conta-corrente-op.pipe.spec.ts excluded for coverage
2026-09-18T13:46:34.4572656Z 10:46:34.457 DEBUG: 'src/app/pipes/conta-corrente.pipe.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4574082Z 10:46:34.457 DEBUG: 'src/app/pipes/conta-corrente.pipe.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4574563Z 10:46:34.457 DEBUG: File src/app/pipes/conta-corrente.pipe.spec.ts excluded for coverage
2026-09-18T13:46:34.4577087Z 10:46:34.457 DEBUG: 'src/app/pipes/cpf-cnpj.pipe.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4578541Z 10:46:34.457 DEBUG: 'src/app/pipes/cpf-cnpj.pipe.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4578814Z 10:46:34.457 DEBUG: File src/app/pipes/cpf-cnpj.pipe.spec.ts excluded for coverage
2026-09-18T13:46:34.4581146Z 10:46:34.458 DEBUG: 'src/app/pipes/data.pipe.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4582281Z 10:46:34.458 DEBUG: 'src/app/pipes/data.pipe.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4582509Z 10:46:34.458 DEBUG: File src/app/pipes/data.pipe.spec.ts excluded for coverage
2026-09-18T13:46:34.4584860Z 10:46:34.458 DEBUG: 'src/app/pipes/ddd.pipe.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4585959Z 10:46:34.458 DEBUG: 'src/app/pipes/ddd.pipe.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4586161Z 10:46:34.458 DEBUG: File src/app/pipes/ddd.pipe.spec.ts excluded for coverage
2026-09-18T13:46:34.4588427Z 10:46:34.458 DEBUG: 'src/app/pipes/telefone.pipe.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4589629Z 10:46:34.458 DEBUG: 'src/app/pipes/telefone.pipe.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4589868Z 10:46:34.458 DEBUG: File src/app/pipes/telefone.pipe.spec.ts excluded for coverage
2026-09-18T13:46:34.4592083Z 10:46:34.459 DEBUG: 'src/app/pipes/zero-a-esquerda.pipe.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4593588Z 10:46:34.459 DEBUG: 'src/app/pipes/zero-a-esquerda.pipe.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4594720Z 10:46:34.459 DEBUG: File src/app/pipes/zero-a-esquerda.pipe.spec.ts excluded for coverage
2026-09-18T13:46:34.4599187Z 10:46:34.459 DEBUG: 'src/app/services/contrato.service.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4599983Z 10:46:34.459 DEBUG: 'src/app/services/contrato.service.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4600201Z 10:46:34.459 DEBUG: File src/app/services/contrato.service.spec.ts excluded for coverage
2026-09-18T13:46:34.4606936Z 10:46:34.460 DEBUG: 'src/app/services/unidade.service.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4608407Z 10:46:34.460 DEBUG: 'src/app/services/unidade.service.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4608662Z 10:46:34.460 DEBUG: File src/app/services/unidade.service.spec.ts excluded for coverage
2026-09-18T13:46:34.4614220Z 10:46:34.461 DEBUG: 'src/app/services/usuario.service.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4614565Z 10:46:34.461 DEBUG: 'src/app/services/usuario.service.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4614783Z 10:46:34.461 DEBUG: File src/app/services/usuario.service.spec.ts excluded for coverage
2026-09-18T13:46:34.4623718Z 10:46:34.461 DEBUG: 'src/app/utils/mensagem-formatacao.util.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4624104Z 10:46:34.461 DEBUG: 'src/app/utils/mensagem-formatacao.util.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4624382Z 10:46:34.461 DEBUG: File src/app/utils/mensagem-formatacao.util.spec.ts excluded for coverage
2026-09-18T13:46:34.4634349Z 10:46:34.463 DEBUG: 'src/app/validators/generic-validator.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-09-18T13:46:34.4634708Z 10:46:34.463 DEBUG: 'src/app/validators/generic-validator.spec.ts' indexed as test with language 'ts'
2026-09-18T13:46:34.4635000Z 10:46:34.463 DEBUG: File src/app/validators/generic-validator.spec.ts excluded for coverage
2026-09-18T13:46:34.4668877Z 10:46:34.466 INFO: 721 files indexed
2026-09-18T13:46:34.4669638Z 10:46:34.466 INFO: 756 files ignored because of inclusion/exclusion patterns
2026-09-18T13:46:34.4763523Z 10:46:34.468 INFO: Quality profile for css: Sonar way
2026-09-18T13:46:34.4766109Z 10:46:34.468 INFO: Quality profile for json: Sonar way
2026-09-18T13:46:34.4768965Z 10:46:34.468 INFO: Quality profile for ts: Sonar way
2026-09-18T13:46:34.4769137Z 10:46:34.468 INFO: Quality profile for web: HTML ACESSIBILIDADE
2026-09-18T13:46:34.4770122Z 10:46:34.468 INFO: ------------- Run sensors on module SIREP-frontend-novo
2026-09-18T13:46:34.5344788Z 10:46:34.534 INFO: Load metrics repository
2026-09-18T13:46:34.6446793Z 10:46:34.643 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/metrics/search?ps=500&p=1 | time=108ms
2026-09-18T13:46:34.6480039Z 10:46:34.647 INFO: Load metrics repository (done) | time=113ms
2026-09-18T13:46:35.7289682Z 10:46:35.727 DEBUG: 'JavaSensor' skipped because there is no related file in current project
2026-09-18T13:46:35.7290072Z 10:46:35.727 DEBUG: 'Import external issues report' skipped because one of the required properties is missing
2026-09-18T13:46:35.7290409Z 10:46:35.727 DEBUG: 'Import external issues report from SARIF file.' skipped because one of the required properties is missing
2026-09-18T13:46:35.7290667Z 10:46:35.728 DEBUG: 'Python Sensor' skipped because there is no related file in current project
2026-09-18T13:46:35.7290964Z 10:46:35.728 DEBUG: 'Cobertura Sensor for Python coverage' skipped because there is no related file in current project
2026-09-18T13:46:35.7291250Z 10:46:35.728 DEBUG: 'PythonXUnitSensor' skipped because there is no related file in current project
2026-09-18T13:46:35.7321166Z 10:46:35.729 DEBUG: 'Import of Pylint issues' skipped because there is no related file in current project
2026-09-18T13:46:35.7321900Z 10:46:35.729 DEBUG: 'Import of Bandit issues' skipped because there is no related file in current project
2026-09-18T13:46:35.7322281Z 10:46:35.729 DEBUG: 'Import of Flake8 issues' skipped because there is no related file in current project
2026-09-18T13:46:35.7322720Z 10:46:35.729 DEBUG: 'Code Quality and Security for Go' skipped because there is no related file in current project
2026-09-18T13:46:35.7323013Z 10:46:35.730 DEBUG: 'Go Unit Test Report' skipped because there is no related file in current project
2026-09-18T13:46:35.7323304Z 10:46:35.730 DEBUG: 'Go Cover sensor for Go coverage' skipped because one of the required properties is missing
2026-09-18T13:46:35.7323553Z 10:46:35.730 DEBUG: 'Import of go vet issues' skipped because there is no related file in current project
2026-09-18T13:46:35.7323833Z 10:46:35.730 DEBUG: 'Import of Golint issues' skipped because there is no related file in current project
2026-09-18T13:46:35.7324249Z 10:46:35.730 DEBUG: 'Import of GoMetaLinter issues' skipped because there is no related file in current project
2026-09-18T13:46:35.7324582Z 10:46:35.731 DEBUG: 'Import of GolangCI-Lint issues' skipped because there is no related file in current project
2026-09-18T13:46:35.7324859Z 10:46:35.731 DEBUG: 'Kotlin Sensor' skipped because there is no related file in current project
2026-09-18T13:46:35.7325144Z 10:46:35.731 DEBUG: 'KotlinSurefireSensor' skipped because there is no related file in current project
2026-09-18T13:46:35.7325424Z 10:46:35.731 DEBUG: 'Import of detekt issues' skipped because there is no related file in current project
2026-09-18T13:46:35.7325860Z 10:46:35.732 DEBUG: 'Import of Android Lint issues' skipped because one of the required properties is missing
2026-09-18T13:46:35.7326349Z 10:46:35.732 DEBUG: 'Import of ktlint issues' skipped because there is no related file in current project
2026-09-18T13:46:35.7327290Z 10:46:35.732 DEBUG: 'IaC Terraform Sensor' skipped because there is no related file in current project
2026-09-18T13:46:35.7333943Z 10:46:35.732 DEBUG: 'JavaScript analysis' skipped because there is no related file in current project
2026-09-18T13:46:35.7334289Z 10:46:35.732 DEBUG: 'JavaScript inside YAML analysis' skipped because there is no related file in current project
2026-09-18T13:46:35.7351838Z 10:46:35.733 DEBUG: 'Import of ESLint issues' skipped because one of the required properties is missing
2026-09-18T13:46:35.7352753Z 10:46:35.733 DEBUG: 'Import of TSLint issues' skipped because one of the required properties is missing
2026-09-18T13:46:35.7353066Z 10:46:35.733 DEBUG: 'Import of stylelint issues' skipped because one of the required properties is missing
2026-09-18T13:46:35.7353344Z 10:46:35.734 DEBUG: 'Ruby Sensor' skipped because there is no related file in current project
2026-09-18T13:46:35.7353623Z 10:46:35.734 DEBUG: 'Import of RuboCop issues' skipped because there is no related file in current project
2026-09-18T13:46:35.7353931Z 10:46:35.734 DEBUG: 'SimpleCov Sensor for Ruby coverage' skipped because there is no related file in current project
2026-09-18T13:46:35.7354209Z 10:46:35.734 DEBUG: 'Scala Sensor' skipped because there is no related file in current project
2026-09-18T13:46:35.7354614Z 10:46:35.734 DEBUG: 'Scoverage sensor for Scala coverage' skipped because there is no related file in current project
2026-09-18T13:46:35.7357135Z 10:46:35.735 DEBUG: 'Import of Scalastyle issues' skipped because there is no related file in current project
2026-09-18T13:46:35.7357544Z 10:46:35.735 DEBUG: 'Import of Scapegoat issues' skipped because there is no related file in current project
2026-09-18T13:46:35.7363344Z 10:46:35.736 DEBUG: 'Import of Checkstyle issues' skipped because there is no related file in current project
2026-09-18T13:46:35.7363731Z 10:46:35.736 DEBUG: 'Import of PMD issues' skipped because one of the required properties is missing
2026-09-18T13:46:35.7365536Z 10:46:35.736 DEBUG: 'Import of SpotBugs issues' skipped because there is no related file in current project
2026-09-18T13:46:35.7366942Z 10:46:35.736 DEBUG: 'SurefireSensor' skipped because there is no related file in current project
2026-09-18T13:46:35.7369359Z 10:46:35.736 DEBUG: 'Removed properties sensor' skipped because there is no related file in current project
2026-09-18T13:46:35.7372708Z 10:46:35.737 DEBUG: 'Flex' skipped because there is no related file in current project
2026-09-18T13:46:35.7373984Z 10:46:35.737 DEBUG: 'Flex Cobertura' skipped because there is no related file in current project
2026-09-18T13:46:35.7375944Z 10:46:35.737 DEBUG: 'XML Sensor' skipped because there is no related file in current project
2026-09-18T13:46:35.7377899Z 10:46:35.737 DEBUG: 'PHP sensor' skipped because there is no related file in current project
2026-09-18T13:46:35.7379066Z 10:46:35.737 DEBUG: 'Analyzer for "php.ini" files' skipped because there is no related file in current project
2026-09-18T13:46:35.7417465Z 10:46:35.738 DEBUG: 'Import of PHPStan issues' skipped because there is no related file in current project
2026-09-18T13:46:35.7418145Z 10:46:35.738 DEBUG: 'Import of Psalm issues' skipped because there is no related file in current project
2026-09-18T13:46:35.7458673Z 10:46:35.740 DEBUG: Sensors : JaCoCo XML Report Importer -> IaC CloudFormation Sensor -> IaC Kubernetes Sensor -> TypeScript analysis -> CSS Rules -> JavaScript/TypeScript Coverage -> CSS Metrics -> C# Project Type Information -> C# Analysis Log -> C# Properties -> HTML -> TextAndSecretsSensor -> VB.NET Project Type Information -> VB.NET Analysis Log -> VB.NET Properties -> com.github.mc1arke.sonarqube.plugin.scanner.ScannerPullRequestPropertySensor -> IaC Docker Sensor -> Generic Test Executions Report
2026-09-18T13:46:35.7459284Z 10:46:35.740 INFO: Sensor JaCoCo XML Report Importer [jacoco]
2026-09-18T13:46:35.7459668Z 10:46:35.741 INFO: 'sonar.coverage.jacoco.xmlReportPaths' is not defined. Using default locations: target/site/jacoco/jacoco.xml,target/site/jacoco-it/jacoco.xml,build/reports/jacoco/test/jacocoTestReport.xml
2026-09-18T13:46:35.7459939Z 10:46:35.742 INFO: No report imported, no coverage information will be imported by JaCoCo XML Report Importer
2026-09-18T13:46:35.7460148Z 10:46:35.742 INFO: Sensor JaCoCo XML Report Importer [jacoco] (done) | time=2ms
2026-09-18T13:46:35.7460323Z 10:46:35.742 INFO: Sensor IaC CloudFormation Sensor [iac]
2026-09-18T13:46:35.7460576Z 10:46:35.743 DEBUG: 'src/tsconfig.spec.json' generated metadata with charset 'UTF-8'
2026-09-18T13:46:35.7461001Z 10:46:35.744 DEBUG: 'src/tsconfig.app.json' generated metadata with charset 'UTF-8'
2026-09-18T13:46:35.7474783Z 10:46:35.747 INFO: 0 source files to be analyzed
2026-09-18T13:46:35.7543937Z 10:46:35.753 INFO: 0/0 source files have been analyzed
2026-09-18T13:46:35.7544778Z 10:46:35.753 INFO: Sensor IaC CloudFormation Sensor [iac] (done) | time=11ms
2026-09-18T13:46:35.7545516Z 10:46:35.753 INFO: Sensor IaC Kubernetes Sensor [iac]
2026-09-18T13:46:35.7574168Z 10:46:35.755 INFO: 0 source files to be analyzed
2026-09-18T13:46:35.7575209Z 10:46:35.757 INFO: 0/0 source files have been analyzed
2026-09-18T13:46:35.7575587Z 10:46:35.757 INFO: Sensor IaC Kubernetes Sensor [iac] (done) | time=4ms
2026-09-18T13:46:35.7575894Z 10:46:35.757 INFO: Sensor TypeScript analysis [javascript]
2026-09-18T13:46:35.7631080Z 10:46:35.762 DEBUG: Deploying bundle
2026-09-18T13:46:35.7631809Z 10:46:35.762 DEBUG: Deploying eslint-bridge into /opt/ads-agent/_work/8/s/.scannerwork/.sonartmp/eslint-bridge-bundle
2026-09-18T13:46:38.0268201Z 10:46:38.026 DEBUG: Deploying bundle (done) | time=2264ms
2026-09-18T13:46:38.0271212Z 10:46:38.027 DEBUG: Starting server
2026-09-18T13:46:38.0289543Z 10:46:38.028 DEBUG: Using default Node.js executable: 'node'.
2026-09-18T13:46:38.0289729Z 10:46:38.028 DEBUG: Checking Node.js version
2026-09-18T13:46:38.0292991Z 10:46:38.029 DEBUG: Launching command node -v
2026-09-18T13:46:38.0401550Z 10:46:38.039 ERROR: Only Node.js v14.17 or later is supported, got 12.22.12.
2026-09-18T13:46:38.0402216Z org.sonarsource.nodejs.NodeCommandException: Only Node.js v14.17 or later is supported, got 12.22.12.
2026-09-18T13:46:38.0402488Z 	at org.sonarsource.nodejs.NodeCommandBuilderImpl.checkNodeCompatibility(NodeCommandBuilderImpl.java:172)
2026-09-18T13:46:38.0402741Z 	at org.sonarsource.nodejs.NodeCommandBuilderImpl.build(NodeCommandBuilderImpl.java:143)
2026-09-18T13:46:38.0402978Z 	at org.sonar.plugins.javascript.eslint.EslintBridgeServerImpl.initNodeCommand(EslintBridgeServerImpl.java:201)
2026-09-18T13:46:38.0403257Z 	at org.sonar.plugins.javascript.eslint.EslintBridgeServerImpl.startServer(EslintBridgeServerImpl.java:142)
2026-09-18T13:46:38.0403503Z 	at org.sonar.plugins.javascript.eslint.EslintBridgeServerImpl.startServerLazily(EslintBridgeServerImpl.java:233)
2026-09-18T13:46:38.0403758Z 	at org.sonar.plugins.javascript.eslint.AbstractEslintSensor.execute(AbstractEslintSensor.java:68)
2026-09-18T13:46:38.0403980Z 	at org.sonar.scanner.sensor.AbstractSensorWrapper.analyse(AbstractSensorWrapper.java:64)
2026-09-18T13:46:38.0404238Z 	at org.sonar.scanner.sensor.ModuleSensorsExecutor.execute(ModuleSensorsExecutor.java:88)
2026-09-18T13:46:38.0404467Z 	at org.sonar.scanner.sensor.ModuleSensorsExecutor.lambda$execute$1(ModuleSensorsExecutor.java:61)
2026-09-18T13:46:38.0404666Z 	at org.sonar.scanner.sensor.ModuleSensorsExecutor.withModuleStrategy(ModuleSensorsExecutor.java:79)
2026-09-18T13:46:38.0404888Z 	at org.sonar.scanner.sensor.ModuleSensorsExecutor.execute(ModuleSensorsExecutor.java:61)
2026-09-18T13:46:38.0405117Z 	at org.sonar.scanner.scan.SpringModuleScanContainer.doAfterStart(SpringModuleScanContainer.java:82)
2026-09-18T13:46:38.0405346Z 	at org.sonar.core.platform.SpringComponentContainer.startComponents(SpringComponentContainer.java:188)
2026-09-18T13:46:38.0405573Z 	at org.sonar.core.platform.SpringComponentContainer.execute(SpringComponentContainer.java:167)
2026-09-18T13:46:38.0405804Z 	at org.sonar.scanner.scan.SpringProjectScanContainer.scan(SpringProjectScanContainer.java:403)
2026-09-18T13:46:38.0406040Z 	at org.sonar.scanner.scan.SpringProjectScanContainer.scanRecursively(SpringProjectScanContainer.java:399)
2026-09-18T13:46:38.0406293Z 	at org.sonar.scanner.scan.SpringProjectScanContainer.doAfterStart(SpringProjectScanContainer.java:368)
2026-09-18T13:46:38.0406492Z 	at org.sonar.core.platform.SpringComponentContainer.startComponents(SpringComponentContainer.java:188)
2026-09-18T13:46:38.0406717Z 	at org.sonar.core.platform.SpringComponentContainer.execute(SpringComponentContainer.java:167)
2026-09-18T13:46:38.0407021Z 	at org.sonar.scanner.bootstrap.SpringGlobalContainer.doAfterStart(SpringGlobalContainer.java:137)
2026-09-18T13:46:38.0407253Z 	at org.sonar.core.platform.SpringComponentContainer.startComponents(SpringComponentContainer.java:188)
2026-09-18T13:46:38.0407476Z 	at org.sonar.core.platform.SpringComponentContainer.execute(SpringComponentContainer.java:167)
2026-09-18T13:46:38.0407692Z 	at org.sonar.batch.bootstrapper.Batch.doExecute(Batch.java:72)
2026-09-18T13:46:38.0407875Z 	at org.sonar.batch.bootstrapper.Batch.execute(Batch.java:66)
2026-09-18T13:46:38.0408058Z 	at org.sonarsource.scanner.api.internal.batch.BatchIsolatedLauncher.execute(BatchIsolatedLauncher.java:46)
2026-09-18T13:46:38.0408271Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-09-18T13:46:38.0408473Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)
2026-09-18T13:46:38.0408660Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)
2026-09-18T13:46:38.0408843Z 	at java.base/java.lang.reflect.Method.invoke(Unknown Source)
2026-09-18T13:46:38.0409040Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherProxy.invoke(IsolatedLauncherProxy.java:60)
2026-09-18T13:46:38.0409239Z 	at com.sun.proxy.$Proxy0.execute(Unknown Source)
2026-09-18T13:46:38.0409392Z 	at org.sonarsource.scanner.api.EmbeddedScanner.doExecute(EmbeddedScanner.java:189)
2026-09-18T13:46:38.0409600Z 	at org.sonarsource.scanner.api.EmbeddedScanner.execute(EmbeddedScanner.java:138)
2026-09-18T13:46:38.0409892Z 	at org.sonarsource.scanner.cli.Main.execute(Main.java:112)
2026-09-18T13:46:38.0410075Z 	at org.sonarsource.scanner.cli.Main.execute(Main.java:75)
2026-09-18T13:46:38.0410272Z 	at org.sonarsource.scanner.cli.Main.main(Main.java:61)
2026-09-18T13:46:38.0410340Z 
2026-09-18T13:46:38.0410704Z 10:46:38.040 INFO: Hit the cache for 0 out of 0
2026-09-18T13:46:38.0411040Z 10:46:38.040 INFO: Miss the cache for 0 out of 0
2026-09-18T13:46:38.0411246Z 10:46:38.041 INFO: Sensor TypeScript analysis [javascript] (done) | time=2284ms
2026-09-18T13:46:38.0411422Z 10:46:38.041 INFO: Sensor CSS Rules [javascript]
2026-09-18T13:46:38.0481722Z 10:46:38.042 DEBUG: Skipping the start of eslint-bridge server as it failed to start during the first analysis or it's not answering anymore
2026-09-18T13:46:38.0482098Z 10:46:38.042 DEBUG: No rules will be executed
2026-09-18T13:46:38.0482275Z 10:46:38.042 INFO: Hit the cache for 0 out of 0
2026-09-18T13:46:38.0482537Z 10:46:38.042 INFO: Miss the cache for 0 out of 0
2026-09-18T13:46:38.0482855Z 10:46:38.042 INFO: Sensor CSS Rules [javascript] (done) | time=1ms
2026-09-18T13:46:38.0483045Z 10:46:38.042 INFO: Sensor JavaScript/TypeScript Coverage [javascript]
2026-09-18T13:46:38.0483235Z 10:46:38.042 DEBUG: Property sonar.javascript.lcov.reportPaths is used.
2026-09-18T13:46:38.0483452Z 10:46:38.042 DEBUG: Using 'coverage/lcov.info' to resolve LCOV files
2026-09-18T13:46:38.7093701Z 10:46:38.708 INFO: No LCOV files were found using coverage/lcov.info
2026-09-18T13:46:38.7093931Z 10:46:38.709 WARN: No coverage information will be saved because all LCOV files cannot be found.
2026-09-18T13:46:38.7094149Z 10:46:38.709 INFO: Sensor JavaScript/TypeScript Coverage [javascript] (done) | time=667ms
2026-09-18T13:46:38.7094336Z 10:46:38.709 INFO: Sensor CSS Metrics [javascript]
2026-09-18T13:46:38.8054987Z 10:46:38.805 INFO: Sensor CSS Metrics [javascript] (done) | time=96ms
2026-09-18T13:46:38.8055542Z 10:46:38.805 INFO: Sensor C# Project Type Information [csharp]
2026-09-18T13:46:38.8104309Z 10:46:38.806 INFO: Sensor C# Project Type Information [csharp] (done) | time=1ms
2026-09-18T13:46:38.8104559Z 10:46:38.806 INFO: Sensor C# Analysis Log [csharp]
2026-09-18T13:46:38.8158471Z 10:46:38.815 INFO: Sensor C# Analysis Log [csharp] (done) | time=9ms
2026-09-18T13:46:38.8158674Z 10:46:38.815 INFO: Sensor C# Properties [csharp]
2026-09-18T13:46:38.8159154Z 10:46:38.815 DEBUG: Project 'SIREP-frontend-novo': No Roslyn issues reports have been found.
2026-09-18T13:46:38.8159587Z 10:46:38.815 INFO: Sensor C# Properties [csharp] (done) | time=0ms
2026-09-18T13:46:38.8159758Z 10:46:38.815 INFO: Sensor HTML [web]
2026-09-18T13:46:38.8179052Z 10:46:38.817 DEBUG: 'src/app/components/conformidade/conformidade-tratar/perfil-agencia/termo-cadastramento-fornecedor/termo-cadastramento-fornecedor.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:38.8387025Z 10:46:38.838 DEBUG: 'src/app/components/consultas/avaliacao-risco/avaliacao-risco-detalhe/avaliacao-risco-detalhe.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:38.8559916Z 10:46:38.855 DEBUG: 'src/app/components/conformidade/conformidade-tratar/perfil-conformidade/perfil-conformidade.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:38.8619630Z 10:46:38.861 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:38.8962015Z 10:46:38.895 DEBUG: 'src/app/components/menu-funcionalidades/menu-intranet/menu-intranet.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:38.9208386Z 10:46:38.920 DEBUG: 'src/app/components/recebivel/recebivel-detalhe/recebivel-detalhe-estorno.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:38.9240578Z 10:46:38.923 DEBUG: 'src/app/components/recebivel/recebivel-detalhe/recebivel-detalhe-vencido.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:38.9295111Z 10:46:38.928 DEBUG: 'src/app/components/fornecedor/fornecedor-lista/fornecedor-lista.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:38.9926297Z 10:46:38.992 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-contas/contas-outros-bancos/fornecedor-vinculacao-contas-outros-bancos.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.0014109Z 10:46:39.001 DEBUG: 'src/app/components/conformidade/conformidade-dados-cadastrais/conformidade-endereco-convenente-dados/conformidade-endereco-convenente-dados.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.0069129Z 10:46:39.006 DEBUG: 'src/app/components/consultas/avaliacao-risco/avaliacao-risco.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.0148891Z 10:46:39.014 DEBUG: 'src/app/components/consultas/plataforma-externa/resultado-pesquisa-recebivel/resultado-pesquisa-recebivel.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.0234045Z 10:46:39.023 DEBUG: 'src/app/components/fornecedor-shared/fornecedor-dados-detalhe/fornecedor-dados-detalhe.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.0245707Z 10:46:39.024 DEBUG: Not enough content in 'src/app/components/fornecedor-shared/fornecedor-dados-detalhe/fornecedor-dados-detalhe.component.html' to have CPD blocks, it will not be part of the duplication detection
2026-09-18T13:46:39.0258512Z 10:46:39.025 DEBUG: 'src/app/components/convenente/convenente-lista/convenente-lista.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.0300769Z 10:46:39.029 DEBUG: 'src/app/components/menu-funcionalidades/menu-internet/menu-internet.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.0347163Z 10:46:39.034 DEBUG: 'src/app/components/versao/versao.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.0363088Z 10:46:39.036 DEBUG: 'src/app/components/fornecedor-shared/fornecedor-dados-detalhe/vinculos-fornecedor/desvinculos-fornecedor-dados-detalhe-cabecalho.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.0398023Z 10:46:39.039 DEBUG: 'src/app/components/cessao/cessao-cadastro/cessao-simulacao/cessao-simulacao.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.1006310Z 10:46:39.100 DEBUG: 'src/app/components/recebivel/recebivel-lista/recebivel-lista.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.1103404Z 10:46:39.109 DEBUG: 'src/app/components/conformidade/conformidade-dados-cadastrais/conformidade-dados-cadastrais.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.1108905Z 10:46:39.110 DEBUG: Not enough content in 'src/app/components/conformidade/conformidade-dados-cadastrais/conformidade-dados-cadastrais.component.html' to have CPD blocks, it will not be part of the duplication detection
2026-09-18T13:46:39.1114625Z 10:46:39.111 DEBUG: 'src/app/components/convenio/contrato-convenio-contrato/contrato-convenio-contrato.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.1146206Z 10:46:39.114 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-wizard.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.1160302Z 10:46:39.115 DEBUG: 'src/app/components/fornecedor/fornecedor-detalhe/fornecedor-detalhe.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.1170946Z 10:46:39.116 DEBUG: Not enough content in 'src/app/components/fornecedor/fornecedor-detalhe/fornecedor-detalhe.component.html' to have CPD blocks, it will not be part of the duplication detection
2026-09-18T13:46:39.1180888Z 10:46:39.117 DEBUG: 'src/app/components/convenio/convenio-lista/convenio-lista.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.1304650Z 10:46:39.130 DEBUG: 'src/app/components/fornecedor-shared/fornecedor-dados-detalhe/endereco-correspondencia-fornecedor/endereco-correspondencia-fornecedor-dados-detalhe-cabecalho.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.1331682Z 10:46:39.132 DEBUG: 'src/app/components/modal/modal.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.1337753Z 10:46:39.133 DEBUG: Not enough content in 'src/app/components/modal/modal.component.html' to have CPD blocks, it will not be part of the duplication detection
2026-09-18T13:46:39.1342073Z 10:46:39.134 DEBUG: 'src/app/components/consultas/conceito/conceito.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.1360657Z 10:46:39.135 DEBUG: 'src/app/components/convenio/convenio-detalhe/convenio-contrato-lista/convenio-contrato-lista.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.1386743Z 10:46:39.138 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-em-alteracao/cadastro-em-alteracao/cadastro-convenio-em-alteracao.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.1388316Z 10:46:39.138 DEBUG: Not enough content in 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-em-alteracao/cadastro-em-alteracao/cadastro-convenio-em-alteracao.component.html' to have CPD blocks, it will not be part of the duplication detection
2026-09-18T13:46:39.1391382Z 10:46:39.139 DEBUG: 'src/app/components/conformidade/conformidade-dados-cadastrais/conformidade-vinculacao-dados/conformidade-vinculacao-dados.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.1401463Z 10:46:39.139 DEBUG: Not enough content in 'src/app/components/conformidade/conformidade-dados-cadastrais/conformidade-vinculacao-dados/conformidade-vinculacao-dados.component.html' to have CPD blocks, it will not be part of the duplication detection
2026-09-18T13:46:39.1406857Z 10:46:39.140 DEBUG: 'src/app/components/recebivel/recebivel-detalhe/recebivel-detalhe-convenente.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.1427456Z 10:46:39.142 DEBUG: 'src/app/app.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.2074069Z 10:46:39.196 DEBUG: 'src/app/components/home/home.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.2074625Z 10:46:39.199 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-contrato/convenio-contrato.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.2204183Z 10:46:39.219 DEBUG: 'src/app/components/convenio/autorizar-fornecedor-caixa/autorizar-fornecedor-caixa-detalhe/autorizar-fornecedor-caixa-detalhe.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.2280142Z 10:46:39.220 DEBUG: 'src/app/components/fornecedor-shared/fornecedor-dados-detalhe/contato-fornecedor/contato-fornecedor-dados-detalhe-cabecalho.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.2314465Z 10:46:39.223 DEBUG: 'src/app/components/conformidade/conformidade-lista/conformidade-lista.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.2351807Z 10:46:39.234 DEBUG: 'src/app/components/recebivel/recebivel-detalhe/recebivel-detalhe-identificacao.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.2927083Z 10:46:39.292 DEBUG: 'src/app/components/recebivel/recebivel-detalhe/recebivel-detalhe.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.2939346Z 10:46:39.293 DEBUG: 'src/app/components/conformidade/conformidade-dados-cadastrais/conformidade-convenio-dados/conformidade-convenio-dados.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.2948503Z 10:46:39.294 DEBUG: Not enough content in 'src/app/components/conformidade/conformidade-dados-cadastrais/conformidade-convenio-dados/conformidade-convenio-dados.component.html' to have CPD blocks, it will not be part of the duplication detection
2026-09-18T13:46:39.2953677Z 10:46:39.295 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-representantes-assinam-externa/fornecedor-vinculacao-manter-representantes-assinam-externa.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.2970953Z 10:46:39.296 DEBUG: 'src/app/components/cessao/cessao-cadastro/cessao-selecao/cessao-selecao.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.3072789Z 10:46:39.306 DEBUG: 'src/app/components/cessao/cessao-autorizar/autorizar-convenente/validar-cessao/validar-cessao-convenente.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.3107722Z 10:46:39.310 DEBUG: 'src/app/components/convenente/convenente-detalhe/convenente-detalhe.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.3187086Z 10:46:39.318 DEBUG: 'src/app/components/parametros/encargos-atraso/encargos-atraso-alterar/encargos-atraso-alterar.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.3222130Z 10:46:39.321 DEBUG: 'src/app/components/consultas/plataforma-externa/resultado-pesquisa-fornecedor/resultado-pesquisa-fornecedor.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.3278325Z 10:46:39.327 DEBUG: 'src/app/components/input/input.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.3296862Z 10:46:39.329 DEBUG: 'src/app/components/convenio/autorizar-fornecedor-convenente/autorizar-fornecedor-convenente-detalhe/autorizar-fornecedor-convenente-detalhe.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.3328823Z 10:46:39.332 DEBUG: 'src/app/components/consultas/plataforma-externa/resultado-pesquisa-desvincular-fornecedor/resultado-pesquisa-desvincular-fornecedor.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.3375668Z 10:46:39.337 DEBUG: 'src/app/components/convenente-shared/dados-detalhe/convenente-dados-detalhe.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.3400870Z 10:46:39.339 DEBUG: 'src/app/components/convenente/convenente-inclusao/convenente-inclusao.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.3998674Z 10:46:39.399 DEBUG: 'src/app/components/recebivel/recebivel-detalhe/recebivel-detalhe-fornecedor.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.4014563Z 10:46:39.401 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-dados-convenio/fornecedor-vinculacao-manter-dados-convenio.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.4033595Z 10:46:39.403 DEBUG: 'src/app/components/convenio-shared/avaliacao-de-risco-dados-detalhe/avaliacao-risco-dados-detalhe.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.4074119Z 10:46:39.407 DEBUG: 'src/app/components/fornecedor/fornecedor-resumo/fornecedor-resumo.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.4091862Z 10:46:39.409 DEBUG: 'src/app/components/parametros/encargos-atraso/encargos-atraso.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.4142089Z 10:46:39.413 DEBUG: 'src/app/components/convenente/arquivo-recebivel-detalhe/arquivo-recebivel-detalhe.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.4268183Z 10:46:39.426 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-dados/cadastro-convenio-dados/cadastro-convenio-dados.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.4446642Z 10:46:39.444 DEBUG: 'src/app/components/convenio/convenio-detalhe/convenio-detalhe.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.4465060Z 10:46:39.446 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-contas/contas-caixa/fornecedor-vinculacao-contas-caixa.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.4488935Z 10:46:39.448 DEBUG: 'src/app/components/consultas/plataforma-externa/resultado-pesquisa-cessao/resultado-pesquisa-cessao.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.4541175Z 10:46:39.453 DEBUG: 'src/app/components/convenio/termo-cadastramento-fornecedor/termo-cadastramento-fornecedor.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.4587562Z 10:46:39.458 DEBUG: 'src/app/components/alert/alert.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.4592465Z 10:46:39.459 DEBUG: Not enough content in 'src/app/components/alert/alert.component.html' to have CPD blocks, it will not be part of the duplication detection
2026-09-18T13:46:39.4925949Z 10:46:39.492 DEBUG: 'src/app/components/convenio/autorizar-fornecedor-convenente/autorizar-fornecedor-convenente.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.5003166Z 10:46:39.499 DEBUG: 'src/app/components/conformidade/conformidade-detalhe/acoes-detalhe/acoes-detalhe-conformidade.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.5011461Z 10:46:39.500 DEBUG: Not enough content in 'src/app/components/conformidade/conformidade-detalhe/acoes-detalhe/acoes-detalhe-conformidade.component.html' to have CPD blocks, it will not be part of the duplication detection
2026-09-18T13:46:39.5018336Z 10:46:39.501 DEBUG: 'src/app/components/fornecedor-shared/fornecedor-dados-detalhe/vinculos-fornecedor/vinculos-fornecedor-dados-detalhe-cabecalho.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.5050523Z 10:46:39.504 DEBUG: 'src/app/components/convenente/arquivo-lista/arquivo-lista.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.5112584Z 10:46:39.510 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/convenio-cadastro.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.5142899Z 10:46:39.514 DEBUG: 'src/app/components/cessao/lista-recebiveis/lista-recebiveis.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.5182656Z 10:46:39.518 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-avaliacao/cadastro-convenio-avaliacao/cadastro-convenio-avaliacao.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.5224683Z 10:46:39.522 DEBUG: 'src/app/components/consultas/plataforma-externa/resultado-pesquisa-vazio/resultado-pesquisa-vazio.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.5242622Z 10:46:39.524 DEBUG: 'src/index.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.5256874Z 10:46:39.525 DEBUG: 'src/app/components/convenente/receber-arquivo-recebivel/receber-arquivo-recebivel.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.5294175Z 10:46:39.529 DEBUG: 'src/app/components/menu-funcionalidades/menu-funcionalidades.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.5299838Z 10:46:39.529 DEBUG: Not enough content in 'src/app/components/menu-funcionalidades/menu-funcionalidades.component.html' to have CPD blocks, it will not be part of the duplication detection
2026-09-18T13:46:39.5311684Z 10:46:39.530 DEBUG: 'src/app/components/consultas/plataforma-externa/plataforma-externa.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.5467324Z 10:46:39.546 DEBUG: 'src/app/components/otp/otp.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.5479507Z 10:46:39.547 DEBUG: 'src/app/components/convenio-shared/dados-detalhe/convenio-dados-detalhe.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.5556955Z 10:46:39.555 DEBUG: 'src/app/components/conformidade/conformidade-dados-cadastrais/conformidade-dados/conformidade-dados.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.5934508Z 10:46:39.593 DEBUG: 'src/app/components/historico/historico.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.5985831Z 10:46:39.598 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-testemunhas/fornecedor-vinculacao-manter-testemunhas.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.6005765Z 10:46:39.600 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-endereco-correspondencia/fornecedor-vinculacao-manter-endereco-correspondencia.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.6033125Z 10:46:39.603 DEBUG: 'src/app/components/unidade/unidade-filtro.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.7082156Z 10:46:39.707 DEBUG: 'src/app/components/fornecedor-shared/fornecedor-dados-detalhe/representante-fornecedor/representante-fornecedor-detalhe.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.7110334Z 10:46:39.710 DEBUG: 'src/app/components/menu/menu-item/menu-item.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.7113665Z 10:46:39.711 DEBUG: Not enough content in 'src/app/components/menu/menu-item/menu-item.component.html' to have CPD blocks, it will not be part of the duplication detection
2026-09-18T13:46:39.7117180Z 10:46:39.711 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-em-cadastramento/cadastro-em-cadastramento/cadastro-convenio-em-cadastramento.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.7118242Z 10:46:39.711 DEBUG: Not enough content in 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-em-cadastramento/cadastro-em-cadastramento/cadastro-convenio-em-cadastramento.component.html' to have CPD blocks, it will not be part of the duplication detection
2026-09-18T13:46:39.7122975Z 10:46:39.712 DEBUG: 'src/app/components/convenio/autorizar-fornecedor-caixa/autorizar-fornecedor-caixa.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.7169354Z 10:46:39.716 DEBUG: 'src/app/components/xml-contrato/xml-contrato.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.7182824Z 10:46:39.717 DEBUG: 'src/app/components/conformidade/conformidade-tratar/perfil-agencia/termo-cadastramento-fornecedor/alterar/termo-cadastramento-fornecedor-alterar.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.7254329Z 10:46:39.725 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-acoes-botoes/cadastro-convenio-acoes-botoes/cadastro-convenio-acoes-botoes.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.7268130Z 10:46:39.726 DEBUG: 'src/app/components/conformidade/conformidade-tratar/perfil-agencia/perfil-agencia.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.7279530Z 10:46:39.727 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-convenente/cadastro-convenio-convenente/cadastro-convenio-convenente.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.7322123Z 10:46:39.731 DEBUG: 'src/app/components/convenente/convenente-alteracao/convenente-alteracao.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.7367236Z 10:46:39.736 DEBUG: 'src/app/components/parametros/parametro-produto-criar/parametro-produto-criar.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.7492994Z 10:46:39.748 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-representante/fornecedor-vinculacao-manter-representante.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.7532175Z 10:46:39.752 DEBUG: 'src/app/components/sair/sair.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.7534497Z 10:46:39.753 DEBUG: Not enough content in 'src/app/components/sair/sair.component.html' to have CPD blocks, it will not be part of the duplication detection
2026-09-18T13:46:39.7540675Z 10:46:39.753 DEBUG: 'src/app/components/cessao/cessao-calculo-cet-lista/cessao-calculo-cet-lista.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.7608164Z 10:46:39.760 DEBUG: 'src/app/components/fornecedor/fornecedor-alteracao/fornecedor-alteracao.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.7976604Z 10:46:39.797 DEBUG: 'src/app/components/conformidade/conformidade-detalhe/conformidade-detalhe.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.7980924Z 10:46:39.797 DEBUG: Not enough content in 'src/app/components/conformidade/conformidade-detalhe/conformidade-detalhe.component.html' to have CPD blocks, it will not be part of the duplication detection
2026-09-18T13:46:39.7999679Z 10:46:39.798 DEBUG: 'src/app/components/cessao/cessao-autorizar/autorizar-convenente/lista-cessoes/cessoes-convenente.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.8029238Z 10:46:39.802 DEBUG: 'src/app/components/cessao/cessao-autorizar/dados-cessao.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.8067056Z 10:46:39.806 DEBUG: 'src/app/components/convenio-shared/vinculos-convenio/vinculos-convenio-dados-detalhe.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.8099715Z 10:46:39.809 DEBUG: 'src/app/components/perfil-selecao/perfil-selecao.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.8149643Z 10:46:39.811 DEBUG: 'src/app/components/convenio/termo-cadastramento-fornecedor/modal-assinar-termo-cadastramento-fornecedor/modal-assinar-termo-cadastramento-fornecedor.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.8150293Z 10:46:39.813 DEBUG: 'src/app/components/convenio/termo-cadastramento-fornecedor/termo-cadastramento-fornecedor-detalhe/termo-cadastramento-fornecedor-detalhe.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.8151048Z 10:46:39.814 DEBUG: 'src/app/components/fornecedor-shared/fornecedor-dados-detalhe/dados-detalhe-cabecalho/fornecedor-dados-detalhe-cabecalho.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.8172629Z 10:46:39.817 DEBUG: 'src/app/components/conformidade/conformidade-dados-cadastrais/conformidade-convenio-convenente-dados/conformidade-convenio-convenente-dados.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.8188643Z 10:46:39.818 DEBUG: 'src/app/components/parametros/parametros-lista/parametro-lista.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.8211327Z 10:46:39.820 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-novo/cadastro-novo/cadastro-convenio-novo.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.8212321Z 10:46:39.821 DEBUG: Not enough content in 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-novo/cadastro-novo/cadastro-convenio-novo.component.html' to have CPD blocks, it will not be part of the duplication detection
2026-09-18T13:46:39.8218639Z 10:46:39.821 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-autorizacao/convenio-autorizacao.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.8328774Z 10:46:39.827 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-dados-basicos-fornecedor/fornecedor-vinculacao-manter-dados-basicos-fornecedor.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.8330642Z 10:46:39.830 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-em-alteracao-conformidade/cadastro-convenio-em-alteracao-conformidade.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.8331671Z 10:46:39.831 DEBUG: Not enough content in 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-em-alteracao-conformidade/cadastro-convenio-em-alteracao-conformidade.component.html' to have CPD blocks, it will not be part of the duplication detection
2026-09-18T13:46:39.8332309Z 10:46:39.831 DEBUG: 'src/app/components/page-error/page-403/page-403.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.8332828Z 10:46:39.832 DEBUG: 'src/app/components/wizard/wizard.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.8338171Z 10:46:39.833 DEBUG: 'src/app/components/cessao/cessao-detalhe/cessao-detalhe.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.8388858Z 10:46:39.838 DEBUG: 'src/app/components/otp/otp-envio-email/otp-envio-email.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.8391625Z 10:46:39.839 DEBUG: Not enough content in 'src/app/components/otp/otp-envio-email/otp-envio-email.component.html' to have CPD blocks, it will not be part of the duplication detection
2026-09-18T13:46:39.8394113Z 10:46:39.839 DEBUG: 'src/app/components/perfil-acesso/perfil-acesso.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.8402809Z 10:46:39.840 DEBUG: 'src/app/components/menu/menu.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.8404590Z 10:46:39.840 DEBUG: Not enough content in 'src/app/components/menu/menu.component.html' to have CPD blocks, it will not be part of the duplication detection
2026-09-18T13:46:39.8407802Z 10:46:39.840 DEBUG: 'src/app/components/teste/teste.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.8428475Z 10:46:39.842 DEBUG: 'src/app/components/consultas/plataforma-externa/resultado-pesquisa-solicitacaorecebida/resultado-pesquisa-solicitacaorecebida.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.8446692Z 10:46:39.844 DEBUG: 'src/app/components/recebivel/recebivel-detalhe/recebivel-detalhe-liquidado.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.8507865Z 10:46:39.845 DEBUG: 'src/app/components/convenio-shared/vinculos-convenio/desvinculos-convenio-dados-detalhe.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.8510970Z 10:46:39.848 DEBUG: 'src/app/components/parametros/parametro-produto/parametro-produto.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.8557560Z 10:46:39.855 DEBUG: 'src/app/components/recebivel/recebivel-detalhe/recebivel-detalhe-dados.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.8561928Z 10:46:39.856 DEBUG: Not enough content in 'src/app/components/recebivel/recebivel-detalhe/recebivel-detalhe-dados.component.html' to have CPD blocks, it will not be part of the duplication detection
2026-09-18T13:46:39.8566229Z 10:46:39.856 DEBUG: 'src/app/components/fornecedor-shared/fornecedor-dados-detalhe/contas-fornecedor/contas-fornecedor-dados-detalhe-cabecalho.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.8577948Z 10:46:39.857 DEBUG: 'src/app/components/cessao/cessao-autorizar/autorizar-caixa/lista-cessoes/cessoes-caixa.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.8612339Z 10:46:39.861 DEBUG: 'src/app/components/cessao/cessao-lista/cessao-lista.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.8669256Z 10:46:39.866 DEBUG: 'src/app/components/cessao/cessao-autorizar/autorizar-caixa/liberar-cessao/liberar-cessao-caixa.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.8685023Z 10:46:39.868 DEBUG: 'src/app/components/recebivel/recebivel-detalhe/recebivel-detalhe-cessao.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.8707295Z 10:46:39.870 DEBUG: 'src/app/components/fornecedor-shared/fornecedor-dados-detalhe/endereco-fornecedor/endereco-fornecedor-dados-detalhe-cabecalho.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.8718344Z 10:46:39.871 DEBUG: 'src/app/components/fornecedor/fornecedor-vinculacao-manter/fornecedor-vinculacao-manter-contato/fornecedor-vinculacao-manter-contato.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.8731142Z 10:46:39.872 DEBUG: 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-avaliacao/cadastro-convenio-avaliacao-vencida/cadastro-convenio-avaliacao-vencida.component.html' generated metadata with charset 'UTF-8'
2026-09-18T13:46:39.8732944Z 10:46:39.873 DEBUG: Not enough content in 'src/app/components/convenio/convenio-wizard/convenio-cadastro/cadastro-convenio-avaliacao/cadastro-convenio-avaliacao-vencida/cadastro-convenio-avaliacao-vencida.component.html' to have CPD blocks, it will not be part of the duplication detection
2026-09-18T13:46:39.8735828Z 10:46:39.873 INFO: Sensor HTML [web] (done) | time=1058ms
2026-09-18T13:46:39.8736020Z 10:46:39.873 INFO: Sensor TextAndSecretsSensor [text]
2026-09-18T13:46:39.8863202Z 10:46:39.885 INFO: 637 source files to be analyzed
2026-09-18T13:46:40.3074172Z 10:46:40.307 INFO: 637/637 source files have been analyzed
2026-09-18T13:46:40.3083197Z 10:46:40.307 INFO: Sensor TextAndSecretsSensor [text] (done) | time=434ms
2026-09-18T13:46:40.3083528Z 10:46:40.307 INFO: Sensor VB.NET Project Type Information [vbnet]
2026-09-18T13:46:40.3083734Z 10:46:40.308 INFO: Sensor VB.NET Project Type Information [vbnet] (done) | time=1ms
2026-09-18T13:46:40.3083927Z 10:46:40.308 INFO: Sensor VB.NET Analysis Log [vbnet]
2026-09-18T13:46:40.3170162Z 10:46:40.316 INFO: Sensor VB.NET Analysis Log [vbnet] (done) | time=8ms
2026-09-18T13:46:40.3170424Z 10:46:40.316 INFO: Sensor VB.NET Properties [vbnet]
2026-09-18T13:46:40.3171110Z 10:46:40.316 DEBUG: Project 'SIREP-frontend-novo': No Roslyn issues reports have been found.
2026-09-18T13:46:40.3171275Z 10:46:40.316 INFO: Sensor VB.NET Properties [vbnet] (done) | time=0ms
2026-09-18T13:46:40.3171488Z 10:46:40.316 INFO: Sensor com.github.mc1arke.sonarqube.plugin.scanner.ScannerPullRequestPropertySensor
2026-09-18T13:46:40.3173472Z 10:46:40.317 INFO: Sensor com.github.mc1arke.sonarqube.plugin.scanner.ScannerPullRequestPropertySensor (done) | time=1ms
2026-09-18T13:46:40.3173787Z 10:46:40.317 INFO: Sensor IaC Docker Sensor [iac]
2026-09-18T13:46:40.3225762Z 10:46:40.322 INFO: 0 source files to be analyzed
2026-09-18T13:46:40.3585899Z 10:46:40.358 INFO: 0/0 source files have been analyzed
2026-09-18T13:46:40.3586162Z 10:46:40.358 INFO: Sensor IaC Docker Sensor [iac] (done) | time=41ms
2026-09-18T13:46:40.3586370Z 10:46:40.358 INFO: Sensor Generic Test Executions Report
2026-09-18T13:46:40.3588963Z 10:46:40.358 INFO: Parsing /opt/ads-agent/_work/8/s/reports/sonarqubeTestReport.xml
2026-09-18T13:46:42.5087420Z 10:46:42.508 INFO: ------------------------------------------------------------------------
2026-09-18T13:46:42.5087682Z 10:46:42.508 INFO: EXECUTION FAILURE
2026-09-18T13:46:42.5087940Z 10:46:42.508 INFO: ------------------------------------------------------------------------
2026-09-18T13:46:42.5088523Z 10:46:42.508 INFO: Total time: 14.151s
2026-09-18T13:46:42.5938059Z 10:46:42.593 INFO: Final Memory: 18M/176M
2026-09-18T13:46:42.5938563Z 10:46:42.593 INFO: ------------------------------------------------------------------------
2026-09-18T13:46:42.5938919Z 10:46:42.593 ERROR: Error during SonarQube Scanner execution
2026-09-18T13:46:42.5939263Z Error during parsing of generic test execution report '/opt/ads-agent/_work/8/s/reports/sonarqubeTestReport.xml'. Look at the SonarQube documentation to know the expected XML format.
2026-09-18T13:46:42.5942000Z Caused by: java.io.FileNotFoundException: /opt/ads-agent/_work/8/s/reports/sonarqubeTestReport.xml (Arquivo ou diretório inexistente)
2026-09-18T13:46:42.5942272Z 	at java.base/java.io.FileInputStream.open0(Native Method)
2026-09-18T13:46:42.5942523Z 	at java.base/java.io.FileInputStream.open(Unknown Source)
2026-09-18T13:46:42.5942698Z 	at java.base/java.io.FileInputStream.<init>(Unknown Source)
2026-09-18T13:46:42.5942930Z 	at org.sonar.scanner.genericcoverage.GenericTestExecutionReportParser.parse(GenericTestExecutionReportParser.java:75)
2026-09-18T13:46:42.5943183Z 	at org.sonar.scanner.genericcoverage.GenericTestExecutionSensor.execute(GenericTestExecutionSensor.java:87)
2026-09-18T13:46:42.5943463Z 	at org.sonar.scanner.sensor.AbstractSensorWrapper.analyse(AbstractSensorWrapper.java:64)
2026-09-18T13:46:42.5943696Z 	at org.sonar.scanner.sensor.ModuleSensorsExecutor.execute(ModuleSensorsExecutor.java:88)
2026-09-18T13:46:42.5943910Z 	at org.sonar.scanner.sensor.ModuleSensorsExecutor.execute(ModuleSensorsExecutor.java:64)
2026-09-18T13:46:42.5944343Z 	at org.sonar.scanner.scan.SpringModuleScanContainer.doAfterStart(SpringModuleScanContainer.java:82)
2026-09-18T13:46:42.5944608Z 	at org.sonar.core.platform.SpringComponentContainer.startComponents(SpringComponentContainer.java:188)
2026-09-18T13:46:42.5944833Z 	at org.sonar.core.platform.SpringComponentContainer.execute(SpringComponentContainer.java:167)
2026-09-18T13:46:42.5945060Z 	at org.sonar.scanner.scan.SpringProjectScanContainer.scan(SpringProjectScanContainer.java:403)
2026-09-18T13:46:42.5945298Z 	at org.sonar.scanner.scan.SpringProjectScanContainer.scanRecursively(SpringProjectScanContainer.java:399)
2026-09-18T13:46:42.5945535Z 	at org.sonar.scanner.scan.SpringProjectScanContainer.doAfterStart(SpringProjectScanContainer.java:368)
2026-09-18T13:46:42.5945810Z 	at org.sonar.core.platform.SpringComponentContainer.startComponents(SpringComponentContainer.java:188)
2026-09-18T13:46:42.5946004Z 	at org.sonar.core.platform.SpringComponentContainer.execute(SpringComponentContainer.java:167)
2026-09-18T13:46:42.5946232Z 	at org.sonar.scanner.bootstrap.SpringGlobalContainer.doAfterStart(SpringGlobalContainer.java:137)
2026-09-18T13:46:42.5946461Z 	at org.sonar.core.platform.SpringComponentContainer.startComponents(SpringComponentContainer.java:188)
2026-09-18T13:46:42.5946684Z 	at org.sonar.core.platform.SpringComponentContainer.execute(SpringComponentContainer.java:167)
2026-09-18T13:46:42.5946892Z 	at org.sonar.batch.bootstrapper.Batch.doExecute(Batch.java:72)
2026-09-18T13:46:42.5947076Z 	at org.sonar.batch.bootstrapper.Batch.execute(Batch.java:66)
2026-09-18T13:46:42.5947287Z 	at org.sonarsource.scanner.api.internal.batch.BatchIsolatedLauncher.execute(BatchIsolatedLauncher.java:46)
2026-09-18T13:46:42.5947495Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-09-18T13:46:42.5947651Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)
2026-09-18T13:46:42.5947876Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)
2026-09-18T13:46:42.5948054Z 	at java.base/java.lang.reflect.Method.invoke(Unknown Source)
2026-09-18T13:46:42.5948250Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherProxy.invoke(IsolatedLauncherProxy.java:60)
2026-09-18T13:46:42.5948439Z 	at com.sun.proxy.$Proxy0.execute(Unknown Source)
2026-09-18T13:46:42.5948689Z 	at org.sonarsource.scanner.api.EmbeddedScanner.doExecute(EmbeddedScanner.java:189)
2026-09-18T13:46:42.5948921Z 	at org.sonarsource.scanner.api.EmbeddedScanner.execute(EmbeddedScanner.java:138)
2026-09-18T13:46:42.5949081Z 	at org.sonarsource.scanner.cli.Main.execute(Main.java:112)
2026-09-18T13:46:42.5949262Z 	at org.sonarsource.scanner.cli.Main.execute(Main.java:75)
2026-09-18T13:46:42.5949458Z 	at org.sonarsource.scanner.cli.Main.main(Main.java:61)
2026-09-18T13:46:42.9441626Z ##[error]Bash exited with code '2'.
2026-09-18T13:46:42.9454232Z ##[section]Finishing: Run Code Analisis
