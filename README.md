2026-10-19T16:00:42.4491216Z ##[section]Starting: Run Code Analisis
2026-10-19T16:00:42.4494741Z ==============================================================================
2026-10-19T16:00:42.4494839Z Task         : Bash
2026-10-19T16:00:42.4494882Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-19T16:00:42.4494944Z Version      : 3.227.0
2026-10-19T16:00:42.4495003Z Author       : Microsoft Corporation
2026-10-19T16:00:42.4495056Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-19T16:00:42.4495215Z ==============================================================================
2026-10-19T16:00:42.5778989Z Generating script.
2026-10-19T16:00:42.5791451Z ========================== Starting Command Output ===========================
2026-10-19T16:00:42.5798632Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/fdc93395-628b-4405-bd09-a9f3821a9b11.sh
2026-10-19T16:00:42.5850746Z sonar-scanner -Dsonar.host.url=http://sonar-esteira.apps.produtos4.caixa -Dsonar.login=ads-sa -Dsonar.password=*** -Dsonar.projectKey=SIPNC-conta1288judi-microfront -Dsonar.projectName=SIPNC-conta1288judi-microfront -Dsonar.projectVersion=1.0.0-snapshot -Dsonar.sources=. -Dproject.settings=NONE -Dsonar.scm.disabled=true -Dsonar.branch.name=origin/feature/STSK00002828 -Dsonar.sourceEncoding=UTF-8 -Dsonar.language=ts -Dsonar.sources=src -Dsonar.tests=src -Dsonar.typescript.exclusions=**/node_modules/**,**/typings.d.ts,**/main.ts,**/environments,**/environments*.ts,**/*routing.module.ts -Dsonar.test.inclusions=**/*.spec.ts -Dsonar.ts.tslintconfigpath=tslint.json -Dsonar.testExecutionReportPaths=reports/sonarqubeTestReport.xml -Dsonar.javascript.lcov.reportPaths=coverage/lcov.info -X
2026-10-19T16:00:42.7082947Z 13:00:42.706 INFO: Scanner configuration file: /opt/sonar-scanner/sonar-scanner-4.2.0.1873-linux/conf/sonar-scanner.properties
2026-10-19T16:00:42.7085992Z 13:00:42.708 INFO: Project root configuration file: NONE
2026-10-19T16:00:42.7269505Z 13:00:42.726 INFO: SonarQube Scanner 4.2.0.1873
2026-10-19T16:00:42.7271354Z 13:00:42.726 INFO: Java 11.0.3 AdoptOpenJDK (64-bit)
2026-10-19T16:00:42.7271573Z 13:00:42.726 INFO: Linux 5.18.5-100.fc35.x86_64 amd64
2026-10-19T16:00:42.8176102Z 13:00:42.817 DEBUG: keyStore is : 
2026-10-19T16:00:42.8176438Z 13:00:42.817 DEBUG: keyStore type is : pkcs12
2026-10-19T16:00:42.8176668Z 13:00:42.817 DEBUG: keyStore provider is : 
2026-10-19T16:00:42.8176865Z 13:00:42.817 DEBUG: init keystore
2026-10-19T16:00:42.8178617Z 13:00:42.817 DEBUG: init keymanager of type SunX509
2026-10-19T16:00:42.8916257Z 13:00:42.891 DEBUG: Create: /opt/ads-agent/cache-tools/.sonar/cache
2026-10-19T16:00:42.8918594Z 13:00:42.891 INFO: User cache: /opt/ads-agent/cache-tools/.sonar/cache
2026-10-19T16:00:42.8920058Z 13:00:42.891 DEBUG: Create: /opt/ads-agent/cache-tools/.sonar/cache/_tmp
2026-10-19T16:00:42.8934126Z 13:00:42.893 DEBUG: Extract sonar-scanner-api-batch in temp...
2026-10-19T16:00:42.8954515Z 13:00:42.895 DEBUG: Get bootstrap index...
2026-10-19T16:00:42.8956009Z 13:00:42.895 DEBUG: Download: http://sonar-esteira.apps.produtos4.caixa/batch/index
2026-10-19T16:00:42.9439850Z 13:00:42.943 DEBUG: Get bootstrap completed
2026-10-19T16:00:42.9464567Z 13:00:42.946 DEBUG: Create isolated classloader...
2026-10-19T16:00:42.9530062Z 13:00:42.951 DEBUG: Start temp cleaning...
2026-10-19T16:00:42.9576060Z 13:00:42.957 DEBUG: Temp cleaning done
2026-10-19T16:00:42.9576536Z 13:00:42.957 DEBUG: Execution getVersion
2026-10-19T16:00:42.9996819Z 13:00:42.999 INFO: SonarQube server 9.9.5.90363
2026-10-19T16:00:42.9998155Z 13:00:42.999 INFO: Default locale: "pt_BR", source code encoding: "UTF-8"
2026-10-19T16:00:43.0005362Z 13:00:43.000 DEBUG: Work directory: /opt/ads-agent/_work/21/s/.scannerwork
2026-10-19T16:00:43.0015726Z 13:00:43.001 DEBUG: Execution execute
2026-10-19T16:00:43.3988729Z 13:00:43.395 DEBUG: Community 9.9.5.90363
2026-10-19T16:00:43.5852039Z 13:00:43.584 INFO: Load global settings
2026-10-19T16:00:43.7250707Z 13:00:43.724 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/settings/values.protobuf | time=139ms
2026-10-19T16:00:43.7802821Z 13:00:43.779 INFO: Load global settings (done) | time=195ms
2026-10-19T16:00:43.7879158Z 13:00:43.787 INFO: Server id: C6CBE574-AZHFQ0zM20SUQoMxtCv9
2026-10-19T16:00:43.7929316Z 13:00:43.792 INFO: User cache: /opt/ads-agent/cache-tools/.sonar/cache
2026-10-19T16:00:43.7952381Z 13:00:43.795 INFO: Load/download plugins
2026-10-19T16:00:43.7953076Z 13:00:43.795 INFO: Load plugins index
2026-10-19T16:00:43.9091283Z 13:00:43.908 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/plugins/installed | time=113ms
2026-10-19T16:00:43.9295364Z 13:00:43.929 INFO: Load plugins index (done) | time=134ms
2026-10-19T16:00:44.2957335Z 13:00:44.295 INFO: Load/download plugins (done) | time=501ms
2026-10-19T16:00:44.3857850Z 13:00:44.385 DEBUG: Plugins:
2026-10-19T16:00:44.3858077Z 13:00:44.385 DEBUG:   * Python Code Quality and Security 3.24.1.11916 (python)
2026-10-19T16:00:44.3858252Z 13:00:44.385 DEBUG:   * Go Code Quality and Security 1.11.0.3905 (go)
2026-10-19T16:00:44.3858417Z 13:00:44.385 DEBUG:   * JaCoCo 1.3.0.1538 (jacoco)
2026-10-19T16:00:44.3858615Z 13:00:44.385 DEBUG:   * Kotlin Code Quality and Security 2.12.0.1956 (kotlin)
2026-10-19T16:00:44.3859125Z 13:00:44.385 DEBUG:   * IaC Code Quality and Security 1.11.0.2847 (iac)
2026-10-19T16:00:44.3859898Z 13:00:44.385 DEBUG:   * JavaScript/TypeScript/CSS Code Quality and Security 9.13.0.20537 (javascript)
2026-10-19T16:00:44.3860591Z 13:00:44.385 DEBUG:   * Ruby Code Quality and Security 1.11.0.3905 (ruby)
2026-10-19T16:00:44.3861366Z 13:00:44.386 DEBUG:   * Scala Code Quality and Security 1.11.0.3905 (sonarscala)
2026-10-19T16:00:44.3862293Z 13:00:44.386 DEBUG:   * C# Code Quality and Security 8.51.0.59060 (csharp)
2026-10-19T16:00:44.3862976Z 13:00:44.386 DEBUG:   * Java Code Quality and Security 7.16.0.30901 (java)
2026-10-19T16:00:44.3863416Z 13:00:44.386 DEBUG:   * HTML Code Quality and Security 3.7.1.3306 (web)
2026-10-19T16:00:44.3865227Z 13:00:44.386 DEBUG:   * Flex Code Quality and Security 2.8.0.3166 (flex)
2026-10-19T16:00:44.3865397Z 13:00:44.386 DEBUG:   * XML Code Quality and Security 2.7.0.3820 (xml)
2026-10-19T16:00:44.3865555Z 13:00:44.386 DEBUG:   * PHP Code Quality and Security 3.27.1.9352 (php)
2026-10-19T16:00:44.3865709Z 13:00:44.386 DEBUG:   * Text Code Quality and Security 2.0.2.1090 (text)
2026-10-19T16:00:44.3866060Z 13:00:44.386 DEBUG:   * VB.NET Code Quality and Security 8.51.0.59060 (vbnet)
2026-10-19T16:00:44.3866940Z 13:00:44.386 DEBUG:   * Configuration detection fot Code Quality and Security 1.2.0.267 (config)
2026-10-19T16:00:44.3867149Z 13:00:44.386 DEBUG:   * Community Branch Plugin 1.14.0 (communityBranchPlugin)
2026-10-19T16:00:45.0284338Z 13:00:45.027 INFO: Process project properties
2026-10-19T16:00:45.0360396Z 13:00:45.034 INFO: Process project properties (done) | time=7ms
2026-10-19T16:00:45.0409983Z 13:00:45.036 INFO: Execute project builders
2026-10-19T16:00:45.0410290Z 13:00:45.037 DEBUG: Execute project builder: org.sonar.plugins.csharp.CSharpGlobalProtobufFileProcessor
2026-10-19T16:00:45.0410624Z 13:00:45.037 DEBUG: Execute project builder: org.sonar.plugins.vbnet.VbNetGlobalProtobufFileProcessor
2026-10-19T16:00:45.0410800Z 13:00:45.038 INFO: Execute project builders (done) | time=2ms
2026-10-19T16:00:45.0420367Z 13:00:45.040 INFO: Project key: SIPNC-conta1288judi-microfront
2026-10-19T16:00:45.0420596Z 13:00:45.040 INFO: Base dir: /opt/ads-agent/_work/21/s
2026-10-19T16:00:45.0420821Z 13:00:45.040 INFO: Working dir: /opt/ads-agent/_work/21/s/.scannerwork
2026-10-19T16:00:45.0421053Z 13:00:45.040 DEBUG: Project global encoding: UTF-8, default locale: pt_BR
2026-10-19T16:00:45.0470642Z 13:00:45.046 INFO: Load project settings for component key: 'SIPNC-conta1288judi-microfront'
2026-10-19T16:00:45.1835543Z 13:00:45.182 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/settings/values.protobuf?component=SIPNC-conta1288judi-microfront | time=136ms
2026-10-19T16:00:45.1836209Z 13:00:45.183 INFO: Load project settings for component key: 'SIPNC-conta1288judi-microfront' (done) | time=137ms
2026-10-19T16:00:45.3147259Z 13:00:45.312 INFO: Load project branches
2026-10-19T16:00:45.4335277Z 13:00:45.431 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/project_branches/list?project=SIPNC-conta1288judi-microfront | time=119ms
2026-10-19T16:00:45.4444807Z 13:00:45.438 INFO: Load project branches (done) | time=126ms
2026-10-19T16:00:45.4445043Z 13:00:45.438 INFO: Load branch configuration
2026-10-19T16:00:45.4445194Z 13:00:45.440 INFO: Load branch configuration (done) | time=2ms
2026-10-19T16:00:45.4514807Z 13:00:45.446 DEBUG: Creating module hierarchy
2026-10-19T16:00:45.4515652Z 13:00:45.446 DEBUG:   Init module 'SIPNC-conta1288judi-microfront'
2026-10-19T16:00:45.4536729Z 13:00:45.446 DEBUG:     Base dir: /opt/ads-agent/_work/21/s
2026-10-19T16:00:45.4537450Z 13:00:45.446 DEBUG:     Working dir: /opt/ads-agent/_work/21/s/.scannerwork
2026-10-19T16:00:45.4537996Z 13:00:45.447 DEBUG:     Module global encoding: UTF-8, default locale: pt_BR
2026-10-19T16:00:45.4566525Z 13:00:45.456 DEBUG: Available languages:
2026-10-19T16:00:45.4568953Z 13:00:45.456 DEBUG:   * Python => "py"
2026-10-19T16:00:45.4569550Z 13:00:45.456 DEBUG:   * Go => "go"
2026-10-19T16:00:45.4570013Z 13:00:45.456 DEBUG:   * Kotlin => "kotlin"
2026-10-19T16:00:45.4570256Z 13:00:45.456 DEBUG:   * Terraform => "terraform"
2026-10-19T16:00:45.4570711Z 13:00:45.456 DEBUG:   * CloudFormation => "cloudformation"
2026-10-19T16:00:45.4572838Z 13:00:45.457 DEBUG:   * Kubernetes => "kubernetes"
2026-10-19T16:00:45.4574578Z 13:00:45.457 DEBUG:   * Docker => "docker"
2026-10-19T16:00:45.4574760Z 13:00:45.457 DEBUG:   * JavaScript => "js"
2026-10-19T16:00:45.4574892Z 13:00:45.457 DEBUG:   * TypeScript => "ts"
2026-10-19T16:00:45.4575011Z 13:00:45.457 DEBUG:   * CSS => "css"
2026-10-19T16:00:45.4577593Z 13:00:45.457 DEBUG:   * Ruby => "ruby"
2026-10-19T16:00:45.4590800Z 13:00:45.457 DEBUG:   * Scala => "scala"
2026-10-19T16:00:45.4590931Z 13:00:45.457 DEBUG:   * C# => "cs"
2026-10-19T16:00:45.4591061Z 13:00:45.457 DEBUG:   * Java => "java"
2026-10-19T16:00:45.4591205Z 13:00:45.457 DEBUG:   * HTML => "web"
2026-10-19T16:00:45.4591318Z 13:00:45.457 DEBUG:   * JSP => "jsp"
2026-10-19T16:00:45.4591441Z 13:00:45.457 DEBUG:   * Flex => "flex"
2026-10-19T16:00:45.4591560Z 13:00:45.457 DEBUG:   * XML => "xml"
2026-10-19T16:00:45.4591674Z 13:00:45.457 DEBUG:   * PHP => "php"
2026-10-19T16:00:45.4591787Z 13:00:45.457 DEBUG:   * Text => "text"
2026-10-19T16:00:45.4591918Z 13:00:45.457 DEBUG:   * Secrets => "secrets"
2026-10-19T16:00:45.4592040Z 13:00:45.458 DEBUG:   * VB.NET => "vbnet"
2026-10-19T16:00:45.4592163Z 13:00:45.458 DEBUG:   * YAML => "yaml"
2026-10-19T16:00:45.4592281Z 13:00:45.458 DEBUG:   * JSON => "json"
2026-10-19T16:00:45.4705274Z 13:00:45.470 DEBUG: SCM Step is disabled by configuration
2026-10-19T16:00:45.4845482Z 13:00:45.474 INFO: Auto-configuring with CI 'Azure DevOps'
2026-10-19T16:00:45.4954977Z 13:00:45.476 INFO: Load quality profiles
2026-10-19T16:00:45.6197913Z 13:00:45.619 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/qualityprofiles/search.protobuf?project=SIPNC-conta1288judi-microfront | time=143ms
2026-10-19T16:00:45.6311429Z 13:00:45.630 INFO: Load quality profiles (done) | time=154ms
2026-10-19T16:00:45.6352887Z 13:00:45.634 INFO: Load active rules
2026-10-19T16:00:45.7499028Z 13:00:45.749 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZIrNz10anXPr7nodh1z&ps=500&p=1 | time=114ms
2026-10-19T16:00:45.9040803Z 13:00:45.903 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZHFRDT420SUQoMxtGQK&ps=500&p=1 | time=120ms
2026-10-19T16:00:46.0290522Z 13:00:46.028 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZHFRDaA20SUQoMxtGRn&ps=500&p=1 | time=120ms
2026-10-19T16:00:46.1385950Z 13:00:46.138 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZHFRDeJ20SUQoMxtGSH&ps=500&p=1 | time=105ms
2026-10-19T16:00:46.2557013Z 13:00:46.254 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZHFRDmC20SUQoMxtGUp&ps=500&p=1 | time=116ms
2026-10-19T16:00:46.3847232Z 13:00:46.384 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZHFRDf220SUQoMxtGTP&ps=500&p=1 | time=127ms
2026-10-19T16:00:46.5484325Z 13:00:46.547 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZHFRDql20SUQoMxtGaP&ps=500&p=1 | time=155ms
2026-10-19T16:00:46.7036752Z 13:00:46.703 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZHFRD1c20SUQoMxtGhM&ps=500&p=1 | time=143ms
2026-10-19T16:00:46.8225633Z 13:00:46.821 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZIrN0k7anXPr7nodh-3&ps=500&p=1 | time=112ms
2026-10-19T16:00:46.9355547Z 13:00:46.935 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZIrN0ozanXPr7nodh_P&ps=500&p=1 | time=111ms
2026-10-19T16:00:47.0523503Z 13:00:47.051 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZHFRD9Z20SUQoMxtGkY&ps=500&p=1 | time=116ms
2026-10-19T16:00:47.2035910Z 13:00:47.203 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZHFREDp20SUQoMxtGs9&ps=500&p=1 | time=151ms
2026-10-19T16:00:47.3872705Z 13:00:47.386 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZ0llT84CVU8CgTziLc5&ps=500&p=1 | time=179ms
2026-10-19T16:00:47.5518074Z 13:00:47.551 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZ5vKpA2CVU8CgTzi7k0&ps=500&p=1 | time=156ms
2026-10-19T16:00:47.6727041Z 13:00:47.672 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZHFREw020SUQoMxtHKD&ps=500&p=1 | time=120ms
2026-10-19T16:00:47.7984270Z 13:00:47.797 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZHFREkh20SUQoMxtHIR&ps=500&p=1 | time=124ms
2026-10-19T16:00:47.9192340Z 13:00:47.918 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZIrN1BOanXPr7nodiCo&ps=500&p=1 | time=120ms
2026-10-19T16:00:48.0735564Z 13:00:48.070 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZHFRFDk20SUQoMxtHPJ&ps=500&p=1 | time=150ms
2026-10-19T16:00:48.2262741Z 13:00:48.225 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZIrN1I5anXPr7nodiHH&ps=500&p=1 | time=131ms
2026-10-19T16:00:48.3365285Z 13:00:48.335 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZIrN1LFanXPr7nodiH8&ps=500&p=1 | time=109ms
2026-10-19T16:00:48.4639467Z 13:00:48.463 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZHFRFpD20SUQoMxtHXp&ps=500&p=1 | time=127ms
2026-10-19T16:00:48.5822481Z 13:00:48.581 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZIrN1QKanXPr7nodiJN&ps=500&p=1 | time=116ms
2026-10-19T16:00:48.7268459Z 13:00:48.726 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZHFRFyf20SUQoMxtHeS&ps=500&p=1 | time=144ms
2026-10-19T16:00:48.8371792Z 13:00:48.836 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt,deprecatedKeys&activation=true&qprofile=AZIrN1SLanXPr7nodiJp&ps=500&p=1 | time=107ms
2026-10-19T16:00:48.8452969Z 13:00:48.845 INFO: Load active rules (done) | time=3210ms
2026-10-19T16:00:48.8490823Z 13:00:48.848 INFO: Load analysis cache
2026-10-19T16:00:48.9815496Z 13:00:48.981 DEBUG: GET 404 http://sonar-esteira.apps.produtos4.caixa/api/analysis_cache/get?project=SIPNC-conta1288judi-microfront&branch=main | time=131ms
2026-10-19T16:00:48.9820027Z 13:00:48.981 INFO: Load analysis cache (404) | time=133ms
2026-10-19T16:00:49.0075641Z 13:00:49.007 INFO: Branch name: origin/feature/STSK00002828
2026-10-19T16:00:49.0083554Z 13:00:49.008 WARN: Property 'sonar.password' is deprecated. It will not be supported in the future. Please instead use the 'sonar.login' parameter with a token.
2026-10-19T16:00:49.0226919Z 13:00:49.022 INFO: Load project repositories
2026-10-19T16:00:49.1707793Z 13:00:49.170 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/batch/project.protobuf?key=SIPNC-conta1288judi-microfront&branch=main | time=148ms
2026-10-19T16:00:49.1745180Z 13:00:49.174 INFO: Load project repositories (done) | time=152ms
2026-10-19T16:00:49.1974853Z 13:00:49.197 DEBUG: Declared extensions of language Python were converted to sonar.lang.patterns.py : **/*.py
2026-10-19T16:00:49.1975488Z 13:00:49.197 DEBUG: Declared extensions of language Go were converted to sonar.lang.patterns.go : **/*.go
2026-10-19T16:00:49.1976667Z 13:00:49.197 DEBUG: Declared extensions of language Kotlin were converted to sonar.lang.patterns.kotlin : **/*.kt
2026-10-19T16:00:49.1977298Z 13:00:49.197 DEBUG: Declared extensions of language Terraform were converted to sonar.lang.patterns.terraform : **/*.tf
2026-10-19T16:00:49.1977845Z 13:00:49.197 DEBUG: Declared extensions of language CloudFormation were converted to sonar.lang.patterns.cloudformation : 
2026-10-19T16:00:49.1978062Z 13:00:49.197 DEBUG: Declared extensions of language Kubernetes were converted to sonar.lang.patterns.kubernetes : 
2026-10-19T16:00:49.1978621Z 13:00:49.197 DEBUG: Declared extensions of language Docker were converted to sonar.lang.patterns.docker : 
2026-10-19T16:00:49.1980016Z 13:00:49.197 DEBUG: Declared extensions of language JavaScript were converted to sonar.lang.patterns.js : **/*.js,**/*.jsx,**/*.cjs,**/*.mjs,**/*.vue
2026-10-19T16:00:49.1981796Z 13:00:49.198 DEBUG: Declared extensions of language TypeScript were converted to sonar.lang.patterns.ts : **/*.ts,**/*.tsx,**/*.cts,**/*.mts
2026-10-19T16:00:49.1988632Z 13:00:49.198 DEBUG: Declared extensions of language CSS were converted to sonar.lang.patterns.css : **/*.css,**/*.less,**/*.scss
2026-10-19T16:00:49.1988941Z 13:00:49.198 DEBUG: Declared extensions of language Ruby were converted to sonar.lang.patterns.ruby : **/*.rb
2026-10-19T16:00:49.1989252Z 13:00:49.198 DEBUG: Declared extensions of language Scala were converted to sonar.lang.patterns.scala : **/*.scala
2026-10-19T16:00:49.1989688Z 13:00:49.198 DEBUG: Declared extensions of language C# were converted to sonar.lang.patterns.cs : **/*.cs
2026-10-19T16:00:49.1990010Z 13:00:49.198 DEBUG: Declared extensions of language Java were converted to sonar.lang.patterns.java : **/*.java,**/*.jav
2026-10-19T16:00:49.2000868Z 13:00:49.199 DEBUG: Declared extensions of language HTML were converted to sonar.lang.patterns.web : **/*.html,**/*.xhtml,**/*.cshtml,**/*.vbhtml,**/*.aspx,**/*.ascx,**/*.rhtml,**/*.erb,**/*.shtm,**/*.shtml,**/*.cmp,**/*.twig
2026-10-19T16:00:49.2001369Z 13:00:49.199 DEBUG: Declared extensions of language JSP were converted to sonar.lang.patterns.jsp : **/*.jsp,**/*.jspf,**/*.jspx
2026-10-19T16:00:49.2001597Z 13:00:49.199 DEBUG: Declared extensions of language Flex were converted to sonar.lang.patterns.flex : **/*.as
2026-10-19T16:00:49.2001797Z 13:00:49.199 DEBUG: Declared extensions of language XML were converted to sonar.lang.patterns.xml : **/*.xml,**/*.xsd,**/*.xsl
2026-10-19T16:00:49.2002049Z 13:00:49.199 DEBUG: Declared extensions of language PHP were converted to sonar.lang.patterns.php : **/*.php,**/*.php3,**/*.php4,**/*.php5,**/*.phtml,**/*.inc
2026-10-19T16:00:49.2002262Z 13:00:49.199 DEBUG: Declared extensions of language Text were converted to sonar.lang.patterns.text : 
2026-10-19T16:00:49.2002453Z 13:00:49.199 DEBUG: Declared extensions of language Secrets were converted to sonar.lang.patterns.secrets : 
2026-10-19T16:00:49.2002633Z 13:00:49.199 DEBUG: Declared extensions of language VB.NET were converted to sonar.lang.patterns.vbnet : **/*.vb
2026-10-19T16:00:49.2002827Z 13:00:49.199 DEBUG: Declared extensions of language YAML were converted to sonar.lang.patterns.yaml : **/*.yaml,**/*.yml
2026-10-19T16:00:49.2003022Z 13:00:49.199 DEBUG: Declared extensions of language JSON were converted to sonar.lang.patterns.json : **/*.json
2026-10-19T16:00:49.2135810Z 13:00:49.213 DEBUG: Will ignore generated code
2026-10-19T16:00:49.2148694Z 13:00:49.214 DEBUG: Will ignore generated code
2026-10-19T16:00:49.2163026Z 13:00:49.216 INFO: Indexing files...
2026-10-19T16:00:49.2164487Z 13:00:49.216 INFO: Project configuration:
2026-10-19T16:00:49.2168344Z 13:00:49.216 INFO:   Excluded sources: **/node_modules/**, **/dist/**, **/coverage/**, **/junit/**, **/reports/**, **/build/**, **/target/**, **/Dockerfile, **/*.tmp, **/*.spec.ts
2026-10-19T16:00:49.2168889Z 13:00:49.216 INFO:   Included tests: **/*.spec.ts
2026-10-19T16:00:49.2170306Z 13:00:49.216 INFO:   Excluded sources for coverage: **/*.xml, **/repository/**, **/dto/**, **/entity/**, **/model/**, **/dao/**, **/*DAO.java, **/test/**, **/*Test.java, **/*.spec.ts, **/*setup-jest.ts, **/*Dto.java, **/*DTO.java, **/*Dao.java, **/*Repository.java
2026-10-19T16:00:49.2170762Z 13:00:49.216 INFO:   Excluded sources for duplication: **/**/environment*.ts, **/**/environment*.prod.ts
2026-10-19T16:00:49.2248500Z 13:00:49.224 DEBUG: File src/app/app-routing.module.ts was excluded by sonar.javascript.exclusions or sonar.typescript.exclusions
2026-10-19T16:00:49.2249125Z 13:00:49.224 DEBUG: 'src/app/app-routing.module.ts' excluded by org.sonar.plugins.javascript.filter.JavaScriptExclusionsFileFilter
2026-10-19T16:00:49.2345195Z 13:00:49.234 DEBUG: 'src/app/app.component.css' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.2356624Z 13:00:49.234 DEBUG: Average line length for src/app/app.component.css is 16
2026-10-19T16:00:49.2447733Z 13:00:49.244 DEBUG: 'src/app/app.component.css' indexed with language 'css'
2026-10-19T16:00:49.2485203Z 13:00:49.248 DEBUG: 'src/app/app.component.html' indexed with language 'web'
2026-10-19T16:00:49.2510655Z 13:00:49.250 DEBUG: 'src/app/app.component.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.2519286Z 13:00:49.251 DEBUG: 'src/app/app.component.ts' indexed with language 'ts'
2026-10-19T16:00:49.2551223Z 13:00:49.254 DEBUG: 'src/app/app.module.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.2560330Z 13:00:49.255 DEBUG: 'src/app/app.module.ts' indexed with language 'ts'
2026-10-19T16:00:49.2579241Z 13:00:49.257 DEBUG: 'src/app/enums/consultas-cadastrais/consultas-cadastrais.enum.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.2587447Z 13:00:49.258 DEBUG: 'src/app/enums/consultas-cadastrais/consultas-cadastrais.enum.ts' indexed with language 'ts'
2026-10-19T16:00:49.2601432Z 13:00:49.260 DEBUG: 'src/app/enums/consultas-cadastrais/receita-regularidade.enum.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.2605468Z 13:00:49.260 DEBUG: 'src/app/enums/consultas-cadastrais/receita-regularidade.enum.ts' indexed with language 'ts'
2026-10-19T16:00:49.2616531Z 13:00:49.261 DEBUG: 'src/app/enums/documento-identificacao.enum.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.2620137Z 13:00:49.261 DEBUG: 'src/app/enums/documento-identificacao.enum.ts' indexed with language 'ts'
2026-10-19T16:00:49.2631852Z 13:00:49.263 DEBUG: 'src/app/enums/indicador-conta.enum.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.2635848Z 13:00:49.263 DEBUG: 'src/app/enums/indicador-conta.enum.ts' indexed with language 'ts'
2026-10-19T16:00:49.2644737Z 13:00:49.264 DEBUG: 'src/app/enums/situacao-menor.enum.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.2651006Z 13:00:49.264 DEBUG: 'src/app/enums/situacao-menor.enum.ts' indexed with language 'ts'
2026-10-19T16:00:49.2660036Z 13:00:49.265 DEBUG: 'src/app/enums/tipo-assinatura-detalhe-conta.enum.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.2661877Z 13:00:49.266 DEBUG: 'src/app/enums/tipo-assinatura-detalhe-conta.enum.ts' indexed with language 'ts'
2026-10-19T16:00:49.2669502Z 13:00:49.266 DEBUG: 'src/app/enums/tipo-cliente.enum.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.2671143Z 13:00:49.267 DEBUG: 'src/app/enums/tipo-cliente.enum.ts' indexed with language 'ts'
2026-10-19T16:00:49.2687457Z 13:00:49.268 DEBUG: 'src/app/enums/tipo-conta.enum.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.2692431Z 13:00:49.269 DEBUG: 'src/app/enums/tipo-conta.enum.ts' indexed with language 'ts'
2026-10-19T16:00:49.2700072Z 13:00:49.269 DEBUG: 'src/app/enums/tipo-endereco.enum.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.2702274Z 13:00:49.270 DEBUG: 'src/app/enums/tipo-endereco.enum.ts' indexed with language 'ts'
2026-10-19T16:00:49.2709261Z 13:00:49.270 DEBUG: 'src/app/enums/tipo-mandato.enum.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.2711166Z 13:00:49.271 DEBUG: 'src/app/enums/tipo-mandato.enum.ts' indexed with language 'ts'
2026-10-19T16:00:49.2718919Z 13:00:49.271 DEBUG: 'src/app/enums/tipo-meio-comunicacao.enum.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.2722078Z 13:00:49.272 DEBUG: 'src/app/enums/tipo-meio-comunicacao.enum.ts' indexed with language 'ts'
2026-10-19T16:00:49.2728087Z 13:00:49.272 DEBUG: 'src/app/enums/tipo-movimentacao.enum.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.2730146Z 13:00:49.272 DEBUG: 'src/app/enums/tipo-movimentacao.enum.ts' indexed with language 'ts'
2026-10-19T16:00:49.2739811Z 13:00:49.273 DEBUG: 'src/app/enums/tipo-operacao.enum.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.2743333Z 13:00:49.274 DEBUG: 'src/app/enums/tipo-operacao.enum.ts' indexed with language 'ts'
2026-10-19T16:00:49.2750717Z 13:00:49.274 DEBUG: 'src/app/interface/api-response.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.2752776Z 13:00:49.275 DEBUG: 'src/app/interface/api-response.ts' indexed with language 'ts'
2026-10-19T16:00:49.2761202Z 13:00:49.276 DEBUG: 'src/app/models/abert-seletor-dados-conta.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.2763806Z 13:00:49.276 DEBUG: 'src/app/models/abert-seletor-dados-conta.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.2771102Z 13:00:49.277 DEBUG: 'src/app/models/api-response.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.2773814Z 13:00:49.277 DEBUG: 'src/app/models/api-response.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.2787568Z 13:00:49.278 DEBUG: 'src/app/models/consultas-cadastrais/cliente-comercial.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.2792420Z 13:00:49.279 DEBUG: 'src/app/models/consultas-cadastrais/cliente-comercial.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.2801339Z 13:00:49.280 DEBUG: 'src/app/models/consultas-cadastrais/consulta-cadastral-impeditivos.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.2804121Z 13:00:49.280 DEBUG: 'src/app/models/consultas-cadastrais/consulta-cadastral-impeditivos.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.2824584Z 13:00:49.282 DEBUG: 'src/app/models/consultas-cadastrais/consulta-cadastral.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.2830579Z 13:00:49.282 DEBUG: 'src/app/models/consultas-cadastrais/consulta-cadastral.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.2849607Z 13:00:49.284 DEBUG: 'src/app/models/consultas-cadastrais/response-receita-pf-old.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.2853106Z 13:00:49.285 DEBUG: 'src/app/models/consultas-cadastrais/response-receita-pf-old.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.2873212Z 13:00:49.287 DEBUG: 'src/app/models/consultas-cadastrais/response-receita-pj.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.2877130Z 13:00:49.287 DEBUG: 'src/app/models/consultas-cadastrais/response-receita-pj.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.2896294Z 13:00:49.289 DEBUG: 'src/app/models/consultas-cadastrais/response-validacao-sicli.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.2898842Z 13:00:49.289 DEBUG: 'src/app/models/consultas-cadastrais/response-validacao-sicli.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.2919108Z 13:00:49.291 DEBUG: 'src/app/models/consultas-cadastrais/resultados-consultas-cadastrais.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.2923117Z 13:00:49.292 DEBUG: 'src/app/models/consultas-cadastrais/resultados-consultas-cadastrais.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.3485318Z 13:00:49.348 DEBUG: 'src/app/models/consultas-cadastrais/validacao-impeditiva.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.3487745Z 13:00:49.348 DEBUG: 'src/app/models/consultas-cadastrais/validacao-impeditiva.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.3505508Z 13:00:49.350 DEBUG: 'src/app/models/dados-card-pessoa-conta.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.3507927Z 13:00:49.350 DEBUG: 'src/app/models/dados-card-pessoa-conta.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.3521530Z 13:00:49.351 DEBUG: 'src/app/models/dados-storage.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.3523637Z 13:00:49.352 DEBUG: 'src/app/models/dados-storage.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.3539193Z 13:00:49.353 DEBUG: 'src/app/models/documento-constitutivo.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.3541126Z 13:00:49.354 DEBUG: 'src/app/models/documento-constitutivo.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.3555201Z 13:00:49.355 DEBUG: 'src/app/models/historico-consultas.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.3557886Z 13:00:49.355 DEBUG: 'src/app/models/historico-consultas.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.3571949Z 13:00:49.357 DEBUG: 'src/app/models/mensagem-fim-fluxo.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.3574970Z 13:00:49.357 DEBUG: 'src/app/models/mensagem-fim-fluxo.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.3589734Z 13:00:49.358 DEBUG: 'src/app/models/modal/modal-options.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.3592710Z 13:00:49.359 DEBUG: 'src/app/models/modal/modal-options.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.3606294Z 13:00:49.360 DEBUG: 'src/app/models/modalidade.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.3608459Z 13:00:49.360 DEBUG: 'src/app/models/modalidade.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.3624670Z 13:00:49.362 DEBUG: 'src/app/models/props-abertura-conta-form.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.3627429Z 13:00:49.362 DEBUG: 'src/app/models/props-abertura-conta-form.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.3639825Z 13:00:49.363 DEBUG: 'src/app/models/receita-pessoa-fisica.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.3642121Z 13:00:49.364 DEBUG: 'src/app/models/receita-pessoa-fisica.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.3647014Z 13:00:49.364 DEBUG: 'src/app/models/relatorios/request-ficha-abertura-autografo.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.3650838Z 13:00:49.364 DEBUG: 'src/app/models/relatorios/request-ficha-abertura-autografo.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.3656664Z 13:00:49.365 DEBUG: 'src/app/models/request-abrir-conta-nsgd-sinda.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.3658852Z 13:00:49.365 DEBUG: 'src/app/models/request-abrir-conta-nsgd-sinda.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.3666786Z 13:00:49.366 DEBUG: 'src/app/models/request-abrir-conta-nsgd.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.3670693Z 13:00:49.366 DEBUG: 'src/app/models/request-abrir-conta-nsgd.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.3676068Z 13:00:49.367 DEBUG: 'src/app/models/request-cadastrar-senha.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.3677670Z 13:00:49.367 DEBUG: 'src/app/models/request-cadastrar-senha.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.3682770Z 13:00:49.368 DEBUG: 'src/app/models/request-comprovante-operacao.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.3684788Z 13:00:49.368 DEBUG: 'src/app/models/request-comprovante-operacao.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.3689279Z 13:00:49.368 DEBUG: 'src/app/models/request-consultar-tipo-categoria.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.3690724Z 13:00:49.368 DEBUG: 'src/app/models/request-consultar-tipo-categoria.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.3695407Z 13:00:49.369 DEBUG: 'src/app/models/request-consultar-traducao.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.3697037Z 13:00:49.369 DEBUG: 'src/app/models/request-consultar-traducao.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.3701474Z 13:00:49.370 DEBUG: 'src/app/models/request-contratar-sms.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.3703177Z 13:00:49.370 DEBUG: 'src/app/models/request-contratar-sms.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.3707977Z 13:00:49.370 DEBUG: 'src/app/models/request-gerar-arqv-contrato-rel-empr-financ.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.3709634Z 13:00:49.370 DEBUG: 'src/app/models/request-gerar-arqv-contrato-rel-empr-financ.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.3715539Z 13:00:49.371 DEBUG: 'src/app/models/request-gerar-arqv-faa.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.3718149Z 13:00:49.371 DEBUG: 'src/app/models/request-gerar-arqv-faa.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.3723659Z 13:00:49.372 DEBUG: 'src/app/models/request-gerar-ass-eletronica.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.3725508Z 13:00:49.372 DEBUG: 'src/app/models/request-gerar-ass-eletronica.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.3729843Z 13:00:49.372 DEBUG: 'src/app/models/request-reservar-conta-nsgd.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.3732036Z 13:00:49.373 DEBUG: 'src/app/models/request-reservar-conta-nsgd.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.3735920Z 13:00:49.373 DEBUG: 'src/app/models/response-abrir-conta-nsgd-sinda.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.3737411Z 13:00:49.373 DEBUG: 'src/app/models/response-abrir-conta-nsgd-sinda.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.3741805Z 13:00:49.374 DEBUG: 'src/app/models/response-abrir-conta-nsgd.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.3743225Z 13:00:49.374 DEBUG: 'src/app/models/response-abrir-conta-nsgd.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.3747539Z 13:00:49.374 DEBUG: 'src/app/models/response-buscar-dados-agencia.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.3750924Z 13:00:49.375 DEBUG: 'src/app/models/response-buscar-dados-agencia.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.3759307Z 13:00:49.375 DEBUG: 'src/app/models/response-cadastrar-senha.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.3760654Z 13:00:49.375 DEBUG: 'src/app/models/response-cadastrar-senha.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.3766833Z 13:00:49.376 DEBUG: 'src/app/models/response-consulta-cep.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.3809006Z 13:00:49.376 DEBUG: 'src/app/models/response-consulta-cep.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.3809550Z 13:00:49.377 DEBUG: 'src/app/models/response-consulta-sicli.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.3810005Z 13:00:49.377 DEBUG: 'src/app/models/response-consulta-sicli.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.3810467Z 13:00:49.378 DEBUG: 'src/app/models/response-consultar-imagem-dossie.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.3810939Z 13:00:49.378 DEBUG: 'src/app/models/response-consultar-imagem-dossie.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.3811433Z 13:00:49.378 DEBUG: 'src/app/models/response-consultar-parametros-publicos.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.3811919Z 13:00:49.378 DEBUG: 'src/app/models/response-consultar-parametros-publicos.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.3812370Z 13:00:49.379 DEBUG: 'src/app/models/response-consultar-tipo-categoria.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.3812838Z 13:00:49.379 DEBUG: 'src/app/models/response-consultar-tipo-categoria.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.3813279Z 13:00:49.379 DEBUG: 'src/app/models/response-consultar-traducao.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.3813683Z 13:00:49.380 DEBUG: 'src/app/models/response-consultar-traducao.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.3814198Z 13:00:49.380 DEBUG: 'src/app/models/response-contratar-sms.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.3814599Z 13:00:49.380 DEBUG: 'src/app/models/response-contratar-sms.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.3815024Z 13:00:49.381 DEBUG: 'src/app/models/response-documentos-dossie.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.3815457Z 13:00:49.381 DEBUG: 'src/app/models/response-documentos-dossie.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.3822033Z 13:00:49.381 DEBUG: 'src/app/models/response-gerar-ass-eletronica.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.3822501Z 13:00:49.381 DEBUG: 'src/app/models/response-gerar-ass-eletronica.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.3825361Z 13:00:49.382 DEBUG: 'src/app/models/response-receita-pf.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.3827470Z 13:00:49.382 DEBUG: 'src/app/models/response-receita-pf.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.3831638Z 13:00:49.383 DEBUG: 'src/app/models/response-relatorios-base64.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.3834967Z 13:00:49.383 DEBUG: 'src/app/models/response-relatorios-base64.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.3839138Z 13:00:49.383 DEBUG: 'src/app/models/response-reservar-conta-nsgd.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.3840155Z 13:00:49.383 DEBUG: 'src/app/models/response-reservar-conta-nsgd.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.3844334Z 13:00:49.384 DEBUG: 'src/app/models/response-resumo-cliente-pf.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.3845784Z 13:00:49.384 DEBUG: 'src/app/models/response-resumo-cliente-pf.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.3851274Z 13:00:49.385 DEBUG: 'src/app/models/response-resumo-cliente-pj.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.3852439Z 13:00:49.385 DEBUG: 'src/app/models/response-resumo-cliente-pj.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.3856842Z 13:00:49.385 DEBUG: 'src/app/models/response-tipo-conta.model.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.3858065Z 13:00:49.385 DEBUG: 'src/app/models/response-tipo-conta.model.ts' indexed with language 'ts'
2026-10-19T16:00:49.3968746Z 13:00:49.386 DEBUG: 'src/app/pages/abert-comprovante-operacao/business/abert-comprovante-operacao.business.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.3970931Z 13:00:49.397 DEBUG: 'src/app/pages/abert-comprovante-operacao/business/abert-comprovante-operacao.business.ts' indexed with language 'ts'
2026-10-19T16:00:49.3979636Z 13:00:49.397 DEBUG: 'src/app/pages/abert-comprovante-operacao/business/modal-config-contrato-relacionamento.business.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.3981223Z 13:00:49.398 DEBUG: 'src/app/pages/abert-comprovante-operacao/business/modal-config-contrato-relacionamento.business.ts' indexed with language 'ts'
2026-10-19T16:00:49.3988238Z 13:00:49.398 DEBUG: 'src/app/pages/abert-comprovante-operacao/business/modal-config-faa.business.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.3989913Z 13:00:49.398 DEBUG: 'src/app/pages/abert-comprovante-operacao/business/modal-config-faa.business.ts' indexed with language 'ts'
2026-10-19T16:00:49.4008154Z 13:00:49.400 DEBUG: 'src/app/pages/abert-comprovante-operacao/components/abert-comprovante-operacao/abert-comprovante-operacao.component.css' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4010012Z 13:00:49.400 DEBUG: Average line length for src/app/pages/abert-comprovante-operacao/components/abert-comprovante-operacao/abert-comprovante-operacao.component.css is 24
2026-10-19T16:00:49.4020316Z 13:00:49.401 DEBUG: 'src/app/pages/abert-comprovante-operacao/components/abert-comprovante-operacao/abert-comprovante-operacao.component.css' indexed with language 'css'
2026-10-19T16:00:49.4033722Z 13:00:49.402 DEBUG: 'src/app/pages/abert-comprovante-operacao/components/abert-comprovante-operacao/abert-comprovante-operacao.component.html' indexed with language 'web'
2026-10-19T16:00:49.4034250Z 13:00:49.403 DEBUG: 'src/app/pages/abert-comprovante-operacao/components/abert-comprovante-operacao/abert-comprovante-operacao.component.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4036570Z 13:00:49.403 DEBUG: 'src/app/pages/abert-comprovante-operacao/components/abert-comprovante-operacao/abert-comprovante-operacao.component.ts' indexed with language 'ts'
2026-10-19T16:00:49.4064389Z 13:00:49.405 DEBUG: 'src/app/pages/abert-comprovante-operacao/components/modal-config-contrato/modal-config-contrato.component.css' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4064981Z 13:00:49.405 DEBUG: Average line length for src/app/pages/abert-comprovante-operacao/components/modal-config-contrato/modal-config-contrato.component.css is 20
2026-10-19T16:00:49.4065506Z 13:00:49.405 DEBUG: 'src/app/pages/abert-comprovante-operacao/components/modal-config-contrato/modal-config-contrato.component.css' indexed with language 'css'
2026-10-19T16:00:49.4066273Z 13:00:49.406 DEBUG: 'src/app/pages/abert-comprovante-operacao/components/modal-config-contrato/modal-config-contrato.component.html' indexed with language 'web'
2026-10-19T16:00:49.4071424Z 13:00:49.406 DEBUG: 'src/app/pages/abert-comprovante-operacao/components/modal-config-contrato/modal-config-contrato.component.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4073270Z 13:00:49.407 DEBUG: 'src/app/pages/abert-comprovante-operacao/components/modal-config-contrato/modal-config-contrato.component.ts' indexed with language 'ts'
2026-10-19T16:00:49.4093500Z 13:00:49.409 DEBUG: 'src/app/pages/abert-comprovante-operacao/components/modal-config-faa/modal-config-faa.component.css' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4094143Z 13:00:49.409 DEBUG: Average line length for src/app/pages/abert-comprovante-operacao/components/modal-config-faa/modal-config-faa.component.css is 20
2026-10-19T16:00:49.4096809Z 13:00:49.409 DEBUG: 'src/app/pages/abert-comprovante-operacao/components/modal-config-faa/modal-config-faa.component.css' indexed with language 'css'
2026-10-19T16:00:49.4101389Z 13:00:49.410 DEBUG: 'src/app/pages/abert-comprovante-operacao/components/modal-config-faa/modal-config-faa.component.html' indexed with language 'web'
2026-10-19T16:00:49.4109014Z 13:00:49.410 DEBUG: 'src/app/pages/abert-comprovante-operacao/components/modal-config-faa/modal-config-faa.component.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4111173Z 13:00:49.410 DEBUG: 'src/app/pages/abert-comprovante-operacao/components/modal-config-faa/modal-config-faa.component.ts' indexed with language 'ts'
2026-10-19T16:00:49.4117846Z 13:00:49.411 DEBUG: 'src/app/pages/abert-comprovante-operacao/components/toggle-resumo-operacao/toggle-resumo-operacao.component.css' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4118210Z 13:00:49.411 DEBUG: Average line length for src/app/pages/abert-comprovante-operacao/components/toggle-resumo-operacao/toggle-resumo-operacao.component.css is 0
2026-10-19T16:00:49.4119730Z 13:00:49.411 DEBUG: 'src/app/pages/abert-comprovante-operacao/components/toggle-resumo-operacao/toggle-resumo-operacao.component.css' indexed with language 'css'
2026-10-19T16:00:49.4124824Z 13:00:49.412 DEBUG: 'src/app/pages/abert-comprovante-operacao/components/toggle-resumo-operacao/toggle-resumo-operacao.component.html' indexed with language 'web'
2026-10-19T16:00:49.4132983Z 13:00:49.413 DEBUG: 'src/app/pages/abert-comprovante-operacao/components/toggle-resumo-operacao/toggle-resumo-operacao.component.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4134514Z 13:00:49.413 DEBUG: 'src/app/pages/abert-comprovante-operacao/components/toggle-resumo-operacao/toggle-resumo-operacao.component.ts' indexed with language 'ts'
2026-10-19T16:00:49.4146905Z 13:00:49.414 DEBUG: 'src/app/pages/abert-dados-gerais/business/abert-dados-gerais-conta.business.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4148960Z 13:00:49.414 DEBUG: 'src/app/pages/abert-dados-gerais/business/abert-dados-gerais-conta.business.ts' indexed with language 'ts'
2026-10-19T16:00:49.4166088Z 13:00:49.415 DEBUG: 'src/app/pages/abert-dados-gerais/business/abert-dados-gerais.business.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4166415Z 13:00:49.415 DEBUG: 'src/app/pages/abert-dados-gerais/business/abert-dados-gerais.business.ts' indexed with language 'ts'
2026-10-19T16:00:49.4176332Z 13:00:49.417 DEBUG: 'src/app/pages/abert-dados-gerais/components/abert-dados-gerais-conta/abert-dados-gerais-conta.component.css' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4177005Z 13:00:49.417 DEBUG: Average line length for src/app/pages/abert-dados-gerais/components/abert-dados-gerais-conta/abert-dados-gerais-conta.component.css is 15
2026-10-19T16:00:49.4179081Z 13:00:49.417 DEBUG: 'src/app/pages/abert-dados-gerais/components/abert-dados-gerais-conta/abert-dados-gerais-conta.component.css' indexed with language 'css'
2026-10-19T16:00:49.4183174Z 13:00:49.418 DEBUG: 'src/app/pages/abert-dados-gerais/components/abert-dados-gerais-conta/abert-dados-gerais-conta.component.html' indexed with language 'web'
2026-10-19T16:00:49.4192959Z 13:00:49.419 DEBUG: 'src/app/pages/abert-dados-gerais/components/abert-dados-gerais-conta/abert-dados-gerais-conta.component.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4195790Z 13:00:49.419 DEBUG: 'src/app/pages/abert-dados-gerais/components/abert-dados-gerais-conta/abert-dados-gerais-conta.component.ts' indexed with language 'ts'
2026-10-19T16:00:49.4204458Z 13:00:49.420 DEBUG: 'src/app/pages/abert-dados-gerais/factory/abert-dados-gerais-conta.factory.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4206623Z 13:00:49.420 DEBUG: 'src/app/pages/abert-dados-gerais/factory/abert-dados-gerais-conta.factory.ts' indexed with language 'ts'
2026-10-19T16:00:49.4218311Z 13:00:49.421 DEBUG: 'src/app/pages/abert-dados-representantes-procuradores/business/abert-dados-representantes-procuradores.business.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4220184Z 13:00:49.421 DEBUG: 'src/app/pages/abert-dados-representantes-procuradores/business/abert-dados-representantes-procuradores.business.ts' indexed with language 'ts'
2026-10-19T16:00:49.4230839Z 13:00:49.422 DEBUG: 'src/app/pages/abert-dados-representantes-procuradores/business/modal-incluir-titular.business.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4231599Z 13:00:49.423 DEBUG: 'src/app/pages/abert-dados-representantes-procuradores/business/modal-incluir-titular.business.ts' indexed with language 'ts'
2026-10-19T16:00:49.4253997Z 13:00:49.425 DEBUG: 'src/app/pages/abert-dados-representantes-procuradores/components/abert-dados-representante-legal/abert-dados-representantes-procuradores.component.css' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4254676Z 13:00:49.425 DEBUG: Average line length for src/app/pages/abert-dados-representantes-procuradores/components/abert-dados-representante-legal/abert-dados-representantes-procuradores.component.css is 16
2026-10-19T16:00:49.4256739Z 13:00:49.425 DEBUG: 'src/app/pages/abert-dados-representantes-procuradores/components/abert-dados-representante-legal/abert-dados-representantes-procuradores.component.css' indexed with language 'css'
2026-10-19T16:00:49.4261410Z 13:00:49.426 DEBUG: 'src/app/pages/abert-dados-representantes-procuradores/components/abert-dados-representante-legal/abert-dados-representantes-procuradores.component.html' indexed with language 'web'
2026-10-19T16:00:49.4270480Z 13:00:49.426 DEBUG: 'src/app/pages/abert-dados-representantes-procuradores/components/abert-dados-representante-legal/abert-dados-representantes-procuradores.component.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4272705Z 13:00:49.427 DEBUG: 'src/app/pages/abert-dados-representantes-procuradores/components/abert-dados-representante-legal/abert-dados-representantes-procuradores.component.ts' indexed with language 'ts'
2026-10-19T16:00:49.4277629Z 13:00:49.427 DEBUG: 'src/app/pages/abert-dados-representantes-procuradores/components/abert-dados-representante-legal/card-pessoa-conta/card-pessoa-conta.component.html' indexed with language 'web'
2026-10-19T16:00:49.4282740Z 13:00:49.428 DEBUG: 'src/app/pages/abert-dados-representantes-procuradores/components/abert-dados-representante-legal/card-pessoa-conta/card-pessoa-conta.component.scss' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4284034Z 13:00:49.428 DEBUG: 'src/app/pages/abert-dados-representantes-procuradores/components/abert-dados-representante-legal/card-pessoa-conta/card-pessoa-conta.component.scss' indexed with language 'css'
2026-10-19T16:00:49.4291600Z 13:00:49.429 DEBUG: 'src/app/pages/abert-dados-representantes-procuradores/components/abert-dados-representante-legal/card-pessoa-conta/card-pessoa-conta.component.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4294028Z 13:00:49.429 DEBUG: 'src/app/pages/abert-dados-representantes-procuradores/components/abert-dados-representante-legal/card-pessoa-conta/card-pessoa-conta.component.ts' indexed with language 'ts'
2026-10-19T16:00:49.4306646Z 13:00:49.430 DEBUG: 'src/app/pages/abert-dados-representantes-procuradores/components/modal-incluir-titular/modal-incluir-titular.component.css' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4307086Z 13:00:49.430 DEBUG: Average line length for src/app/pages/abert-dados-representantes-procuradores/components/modal-incluir-titular/modal-incluir-titular.component.css is 15
2026-10-19T16:00:49.4309136Z 13:00:49.430 DEBUG: 'src/app/pages/abert-dados-representantes-procuradores/components/modal-incluir-titular/modal-incluir-titular.component.css' indexed with language 'css'
2026-10-19T16:00:49.4313215Z 13:00:49.431 DEBUG: 'src/app/pages/abert-dados-representantes-procuradores/components/modal-incluir-titular/modal-incluir-titular.component.html' indexed with language 'web'
2026-10-19T16:00:49.4323266Z 13:00:49.432 DEBUG: 'src/app/pages/abert-dados-representantes-procuradores/components/modal-incluir-titular/modal-incluir-titular.component.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4324455Z 13:00:49.432 DEBUG: 'src/app/pages/abert-dados-representantes-procuradores/components/modal-incluir-titular/modal-incluir-titular.component.ts' indexed with language 'ts'
2026-10-19T16:00:49.4330926Z 13:00:49.432 DEBUG: 'src/app/pages/abert-dados-representantes-procuradores/factory/abert-dados-representantes-procuradores.factory.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4332228Z 13:00:49.433 DEBUG: 'src/app/pages/abert-dados-representantes-procuradores/factory/abert-dados-representantes-procuradores.factory.ts' indexed with language 'ts'
2026-10-19T16:00:49.4339713Z 13:00:49.433 DEBUG: 'src/app/services/abertura-conta.service.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4341646Z 13:00:49.434 DEBUG: 'src/app/services/abertura-conta.service.ts' indexed with language 'ts'
2026-10-19T16:00:49.4346125Z 13:00:49.434 DEBUG: 'src/app/services/agencia.service.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4347078Z 13:00:49.434 DEBUG: 'src/app/services/agencia.service.ts' indexed with language 'ts'
2026-10-19T16:00:49.4353485Z 13:00:49.435 DEBUG: 'src/app/services/consultas-cadastrais.service.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4354849Z 13:00:49.435 DEBUG: 'src/app/services/consultas-cadastrais.service.ts' indexed with language 'ts'
2026-10-19T16:00:49.4471309Z 13:00:49.436 DEBUG: 'src/app/services/dados-abertura.service.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4471611Z 13:00:49.436 DEBUG: 'src/app/services/dados-abertura.service.ts' indexed with language 'ts'
2026-10-19T16:00:49.4471871Z 13:00:49.437 DEBUG: 'src/app/services/dados-relatorios.service.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4473691Z 13:00:49.447 DEBUG: 'src/app/services/dados-relatorios.service.ts' indexed with language 'ts'
2026-10-19T16:00:49.4480817Z 13:00:49.447 DEBUG: 'src/app/services/dialog.service.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4482467Z 13:00:49.448 DEBUG: 'src/app/services/dialog.service.ts' indexed with language 'ts'
2026-10-19T16:00:49.4487338Z 13:00:49.448 DEBUG: 'src/app/services/dossie-digital-service.service.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4488532Z 13:00:49.448 DEBUG: 'src/app/services/dossie-digital-service.service.ts' indexed with language 'ts'
2026-10-19T16:00:49.4492113Z 13:00:49.449 DEBUG: 'src/app/services/http-config-interceptor.service.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4493185Z 13:00:49.449 DEBUG: 'src/app/services/http-config-interceptor.service.ts' indexed with language 'ts'
2026-10-19T16:00:49.4496807Z 13:00:49.449 DEBUG: 'src/app/services/loading-caixa.service.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4497976Z 13:00:49.449 DEBUG: 'src/app/services/loading-caixa.service.ts' indexed with language 'ts'
2026-10-19T16:00:49.4502834Z 13:00:49.450 DEBUG: 'src/app/services/modal-dialogo.service.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4503098Z 13:00:49.450 DEBUG: 'src/app/services/modal-dialogo.service.ts' indexed with language 'ts'
2026-10-19T16:00:49.4506521Z 13:00:49.450 DEBUG: 'src/app/services/relatorios.service.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4507730Z 13:00:49.450 DEBUG: 'src/app/services/relatorios.service.ts' indexed with language 'ts'
2026-10-19T16:00:49.4512081Z 13:00:49.451 DEBUG: 'src/app/services/storage.service.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4512971Z 13:00:49.451 DEBUG: 'src/app/services/storage.service.ts' indexed with language 'ts'
2026-10-19T16:00:49.4529126Z 13:00:49.452 DEBUG: 'src/app/shared/components/common/constantes-testes-unitarios.factory.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4530250Z 13:00:49.452 DEBUG: 'src/app/shared/components/common/constantes-testes-unitarios.factory.ts' indexed with language 'ts'
2026-10-19T16:00:49.4536033Z 13:00:49.453 DEBUG: 'src/app/shared/components/common/constants.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4537454Z 13:00:49.453 DEBUG: 'src/app/shared/components/common/constants.ts' indexed with language 'ts'
2026-10-19T16:00:49.4541930Z 13:00:49.454 DEBUG: 'src/app/shared/components/common/value-acessor-base.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4543437Z 13:00:49.454 DEBUG: 'src/app/shared/components/common/value-acessor-base.ts' indexed with language 'ts'
2026-10-19T16:00:49.4548060Z 13:00:49.454 DEBUG: 'src/app/shared/components/consultas-cadastrais/constantes.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4549750Z 13:00:49.454 DEBUG: 'src/app/shared/components/consultas-cadastrais/constantes.ts' indexed with language 'ts'
2026-10-19T16:00:49.4552719Z 13:00:49.455 DEBUG: 'src/app/shared/components/consultas-cadastrais/consultas-cadastrais.component.html' indexed with language 'web'
2026-10-19T16:00:49.4577384Z 13:00:49.457 DEBUG: 'src/app/shared/components/consultas-cadastrais/consultas-cadastrais.component.scss' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4580379Z 13:00:49.457 DEBUG: 'src/app/shared/components/consultas-cadastrais/consultas-cadastrais.component.scss' indexed with language 'css'
2026-10-19T16:00:49.4595127Z 13:00:49.459 DEBUG: 'src/app/shared/components/consultas-cadastrais/consultas-cadastrais.component.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4596589Z 13:00:49.459 DEBUG: 'src/app/shared/components/consultas-cadastrais/consultas-cadastrais.component.ts' indexed with language 'ts'
2026-10-19T16:00:49.4601016Z 13:00:49.460 DEBUG: 'src/app/shared/components/consultas-cadastrais/consultas-cadastrais.module.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4602211Z 13:00:49.460 DEBUG: 'src/app/shared/components/consultas-cadastrais/consultas-cadastrais.module.ts' indexed with language 'ts'
2026-10-19T16:00:49.4607510Z 13:00:49.460 DEBUG: 'src/app/shared/components/consultas-cadastrais/factory/mensagens-customizadas.factory.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4608964Z 13:00:49.460 DEBUG: 'src/app/shared/components/consultas-cadastrais/factory/mensagens-customizadas.factory.ts' indexed with language 'ts'
2026-10-19T16:00:49.4659376Z 13:00:49.465 DEBUG: 'src/app/shared/components/lista-editavel-telefones/lista-editavel-telefones.component.css' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4659936Z 13:00:49.465 DEBUG: Average line length for src/app/shared/components/lista-editavel-telefones/lista-editavel-telefones.component.css is 11
2026-10-19T16:00:49.4660377Z 13:00:49.465 DEBUG: 'src/app/shared/components/lista-editavel-telefones/lista-editavel-telefones.component.css' indexed with language 'css'
2026-10-19T16:00:49.4666977Z 13:00:49.466 DEBUG: 'src/app/shared/components/lista-editavel-telefones/lista-editavel-telefones.component.html' indexed with language 'web'
2026-10-19T16:00:49.4668859Z 13:00:49.466 DEBUG: 'src/app/shared/components/lista-editavel-telefones/lista-editavel-telefones.component.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4670492Z 13:00:49.466 DEBUG: 'src/app/shared/components/lista-editavel-telefones/lista-editavel-telefones.component.ts' indexed with language 'ts'
2026-10-19T16:00:49.4674087Z 13:00:49.467 DEBUG: 'src/app/shared/components/lista-editavel-telefones/lista-editavel-telefones.module.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4675577Z 13:00:49.467 DEBUG: 'src/app/shared/components/lista-editavel-telefones/lista-editavel-telefones.module.ts' indexed with language 'ts'
2026-10-19T16:00:49.4701397Z 13:00:49.468 DEBUG: 'src/app/shared/components/loading-caixa/loading-caixa.component.css' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4701705Z 13:00:49.468 DEBUG: Average line length for src/app/shared/components/loading-caixa/loading-caixa.component.css is 14
2026-10-19T16:00:49.4701984Z 13:00:49.468 DEBUG: 'src/app/shared/components/loading-caixa/loading-caixa.component.css' indexed with language 'css'
2026-10-19T16:00:49.4702254Z 13:00:49.469 DEBUG: 'src/app/shared/components/loading-caixa/loading-caixa.component.html' indexed with language 'web'
2026-10-19T16:00:49.4702538Z 13:00:49.469 DEBUG: 'src/app/shared/components/loading-caixa/loading-caixa.component.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4702811Z 13:00:49.469 DEBUG: 'src/app/shared/components/loading-caixa/loading-caixa.component.ts' indexed with language 'ts'
2026-10-19T16:00:49.4728509Z 13:00:49.472 DEBUG: 'src/app/shared/components/modal-alerta/modal-alerta.component.css' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4728822Z 13:00:49.472 DEBUG: Average line length for src/app/shared/components/modal-alerta/modal-alerta.component.css is 31
2026-10-19T16:00:49.4729676Z 13:00:49.472 DEBUG: 'src/app/shared/components/modal-alerta/modal-alerta.component.css' indexed with language 'css'
2026-10-19T16:00:49.4732554Z 13:00:49.473 DEBUG: 'src/app/shared/components/modal-alerta/modal-alerta.component.html' indexed with language 'web'
2026-10-19T16:00:49.4736998Z 13:00:49.473 DEBUG: 'src/app/shared/components/modal-alerta/modal-alerta.component.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4738120Z 13:00:49.473 DEBUG: 'src/app/shared/components/modal-alerta/modal-alerta.component.ts' indexed with language 'ts'
2026-10-19T16:00:49.4752255Z 13:00:49.475 DEBUG: 'src/app/shared/components/stepper-dsc/stepper-dsc.component.css' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4752691Z 13:00:49.475 DEBUG: Average line length for src/app/shared/components/stepper-dsc/stepper-dsc.component.css is 20
2026-10-19T16:00:49.4773256Z 13:00:49.475 DEBUG: 'src/app/shared/components/stepper-dsc/stepper-dsc.component.css' indexed with language 'css'
2026-10-19T16:00:49.4773800Z 13:00:49.475 DEBUG: 'src/app/shared/components/stepper-dsc/stepper-dsc.component.html' indexed with language 'web'
2026-10-19T16:00:49.4774156Z 13:00:49.476 DEBUG: 'src/app/shared/components/stepper-dsc/stepper-dsc.component.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4774442Z 13:00:49.476 DEBUG: 'src/app/shared/components/stepper-dsc/stepper-dsc.component.ts' indexed with language 'ts'
2026-10-19T16:00:49.4774698Z 13:00:49.476 DEBUG: 'src/app/shared/directives/apenas-numeros.directive.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4774961Z 13:00:49.476 DEBUG: 'src/app/shared/directives/apenas-numeros.directive.ts' indexed with language 'ts'
2026-10-19T16:00:49.4775446Z 13:00:49.477 DEBUG: 'src/app/shared/directives/celular.mask.directive.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4775707Z 13:00:49.477 DEBUG: 'src/app/shared/directives/celular.mask.directive.ts' indexed with language 'ts'
2026-10-19T16:00:49.4776942Z 13:00:49.477 DEBUG: 'src/app/shared/directives/cep.mask.directive.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4777882Z 13:00:49.477 DEBUG: 'src/app/shared/directives/cep.mask.directive.ts' indexed with language 'ts'
2026-10-19T16:00:49.4780953Z 13:00:49.478 DEBUG: 'src/app/shared/directives/mes-ano.mask.directive.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4781906Z 13:00:49.478 DEBUG: 'src/app/shared/directives/mes-ano.mask.directive.ts' indexed with language 'ts'
2026-10-19T16:00:49.4785290Z 13:00:49.478 DEBUG: 'src/app/shared/shared.module.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4786350Z 13:00:49.478 DEBUG: 'src/app/shared/shared.module.ts' indexed with language 'ts'
2026-10-19T16:00:49.4807686Z 13:00:49.479 DEBUG: 'src/app/shared/utils/mocks/logradouro.mock.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4807997Z 13:00:49.479 DEBUG: 'src/app/shared/utils/mocks/logradouro.mock.ts' indexed with language 'ts'
2026-10-19T16:00:49.4808254Z 13:00:49.480 DEBUG: 'src/app/shared/utils/utils.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4808497Z 13:00:49.480 DEBUG: 'src/app/shared/utils/utils.ts' indexed with language 'ts'
2026-10-19T16:00:49.4823947Z 13:00:49.480 DEBUG: 'src/assets/fonts/futuraBold.eot' indexed with no language
2026-10-19T16:00:49.4824235Z 13:00:49.481 DEBUG: 'src/assets/fonts/futuraBold.svg' indexed with no language
2026-10-19T16:00:49.4824460Z 13:00:49.481 DEBUG: 'src/assets/fonts/futuraBold.ttf' indexed with no language
2026-10-19T16:00:49.4824681Z 13:00:49.481 DEBUG: 'src/assets/fonts/futuraBold.woff' indexed with no language
2026-10-19T16:00:49.4824921Z 13:00:49.481 DEBUG: 'src/assets/fonts/futuraBook.eot' indexed with no language
2026-10-19T16:00:49.4825132Z 13:00:49.481 DEBUG: 'src/assets/fonts/futuraBook.svg' indexed with no language
2026-10-19T16:00:49.4825350Z 13:00:49.482 DEBUG: 'src/assets/fonts/futuraBook.ttf' indexed with no language
2026-10-19T16:00:49.4825570Z 13:00:49.482 DEBUG: 'src/assets/fonts/futuraBook.woff' indexed with no language
2026-10-19T16:00:49.4825835Z 13:00:49.482 DEBUG: 'src/assets/fonts/glyphicons-halflings-regular.eot' indexed with no language
2026-10-19T16:00:49.4827681Z 13:00:49.482 DEBUG: 'src/assets/fonts/glyphicons-halflings-regular.svg' indexed with no language
2026-10-19T16:00:49.4829841Z 13:00:49.482 DEBUG: 'src/assets/fonts/glyphicons-halflings-regular.ttf' indexed with no language
2026-10-19T16:00:49.4831747Z 13:00:49.483 DEBUG: 'src/assets/fonts/glyphicons-halflings-regular.woff' indexed with no language
2026-10-19T16:00:49.4850722Z 13:00:49.483 DEBUG: 'src/assets/fonts/glyphicons-halflings-regular.woff2' indexed with no language
2026-10-19T16:00:49.4854813Z 13:00:49.483 DEBUG: 'src/assets/fonts/helvetica-webfont.eot' indexed with no language
2026-10-19T16:00:49.4855067Z 13:00:49.483 DEBUG: 'src/assets/fonts/helvetica-webfont.svg' indexed with no language
2026-10-19T16:00:49.4855308Z 13:00:49.483 DEBUG: 'src/assets/fonts/helvetica-webfont.ttf' indexed with no language
2026-10-19T16:00:49.4855544Z 13:00:49.484 DEBUG: 'src/assets/fonts/helvetica-webfont.woff' indexed with no language
2026-10-19T16:00:49.4860878Z 13:00:49.485 DEBUG: 'src/assets/js/vanilla-masker.js' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4862775Z 13:00:49.486 DEBUG: Average line length for src/assets/js/vanilla-masker.js is 33
2026-10-19T16:00:49.4865203Z 13:00:49.486 DEBUG: 'src/assets/js/vanilla-masker.js' indexed with language 'js'
2026-10-19T16:00:49.4868373Z 13:00:49.486 DEBUG: 'src/assets/webfonts/fa-brands-400.eot' indexed with no language
2026-10-19T16:00:49.4869973Z 13:00:49.486 DEBUG: 'src/assets/webfonts/fa-brands-400.svg' indexed with no language
2026-10-19T16:00:49.4872008Z 13:00:49.487 DEBUG: 'src/assets/webfonts/fa-brands-400.ttf' indexed with no language
2026-10-19T16:00:49.4873968Z 13:00:49.487 DEBUG: 'src/assets/webfonts/fa-brands-400.woff' indexed with no language
2026-10-19T16:00:49.4876305Z 13:00:49.487 DEBUG: 'src/assets/webfonts/fa-brands-400.woff2' indexed with no language
2026-10-19T16:00:49.4882105Z 13:00:49.487 DEBUG: 'src/assets/webfonts/fa-regular-400.eot' indexed with no language
2026-10-19T16:00:49.4882431Z 13:00:49.487 DEBUG: 'src/assets/webfonts/fa-regular-400.svg' indexed with no language
2026-10-19T16:00:49.4882665Z 13:00:49.488 DEBUG: 'src/assets/webfonts/fa-regular-400.ttf' indexed with no language
2026-10-19T16:00:49.4884337Z 13:00:49.488 DEBUG: 'src/assets/webfonts/fa-regular-400.woff' indexed with no language
2026-10-19T16:00:49.4886279Z 13:00:49.488 DEBUG: 'src/assets/webfonts/fa-regular-400.woff2' indexed with no language
2026-10-19T16:00:49.4888097Z 13:00:49.488 DEBUG: 'src/assets/webfonts/fa-solid-900.eot' indexed with no language
2026-10-19T16:00:49.4889794Z 13:00:49.488 DEBUG: 'src/assets/webfonts/fa-solid-900.svg' indexed with no language
2026-10-19T16:00:49.4891922Z 13:00:49.489 DEBUG: 'src/assets/webfonts/fa-solid-900.ttf' indexed with no language
2026-10-19T16:00:49.4893287Z 13:00:49.489 DEBUG: 'src/assets/webfonts/fa-solid-900.woff' indexed with no language
2026-10-19T16:00:49.4895253Z 13:00:49.489 DEBUG: 'src/assets/webfonts/fa-solid-900.woff2' indexed with no language
2026-10-19T16:00:49.4899405Z 13:00:49.489 DEBUG: 'src/environments/environment.prod.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4900573Z 13:00:49.489 DEBUG: 'src/environments/environment.prod.ts' indexed with language 'ts'
2026-10-19T16:00:49.4901370Z 13:00:49.490 DEBUG: File src/environments/environment.prod.ts excluded for duplication
2026-10-19T16:00:49.4905278Z 13:00:49.490 DEBUG: 'src/environments/environment.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4906548Z 13:00:49.490 DEBUG: 'src/environments/environment.ts' indexed with language 'ts'
2026-10-19T16:00:49.4907467Z 13:00:49.490 DEBUG: File src/environments/environment.ts excluded for duplication
2026-10-19T16:00:49.4909778Z 13:00:49.490 DEBUG: 'src/favicon.ico' indexed with no language
2026-10-19T16:00:49.4915345Z 13:00:49.491 DEBUG: 'src/i18n/label.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4916691Z 13:00:49.491 DEBUG: 'src/i18n/label.ts' indexed with language 'ts'
2026-10-19T16:00:49.4919102Z 13:00:49.491 DEBUG: 'src/index.html' indexed with language 'web'
2026-10-19T16:00:49.4922527Z 13:00:49.492 DEBUG: 'src/main.single-spa.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4924216Z 13:00:49.492 DEBUG: 'src/main.single-spa.ts' indexed with language 'ts'
2026-10-19T16:00:49.4925658Z 13:00:49.492 DEBUG: File src/main.ts was excluded by sonar.javascript.exclusions or sonar.typescript.exclusions
2026-10-19T16:00:49.4925939Z 13:00:49.492 DEBUG: 'src/main.ts' excluded by org.sonar.plugins.javascript.filter.JavaScriptExclusionsFileFilter
2026-10-19T16:00:49.4928911Z 13:00:49.492 DEBUG: 'src/polyfills.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4955450Z 13:00:49.493 DEBUG: 'src/polyfills.ts' indexed with language 'ts'
2026-10-19T16:00:49.4955750Z 13:00:49.493 DEBUG: 'src/single-spa/asset-url.pipe.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4955980Z 13:00:49.493 DEBUG: 'src/single-spa/asset-url.pipe.ts' indexed with language 'ts'
2026-10-19T16:00:49.4956210Z 13:00:49.493 DEBUG: 'src/single-spa/asset-url.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4956446Z 13:00:49.493 DEBUG: 'src/single-spa/asset-url.ts' indexed with language 'ts'
2026-10-19T16:00:49.4956679Z 13:00:49.494 DEBUG: 'src/single-spa/single-spa-props.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4956900Z 13:00:49.494 DEBUG: 'src/single-spa/single-spa-props.ts' indexed with language 'ts'
2026-10-19T16:00:49.4957145Z 13:00:49.494 DEBUG: 'src/single-spa/webpack-public-path.ts' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4957609Z 13:00:49.494 DEBUG: 'src/single-spa/webpack-public-path.ts' indexed with language 'ts'
2026-10-19T16:00:49.4959998Z 13:00:49.495 DEBUG: 'src/styles.scss' generated metadata with charset 'UTF-8'
2026-10-19T16:00:49.4961438Z 13:00:49.496 DEBUG: 'src/styles.scss' indexed with language 'css'
2026-10-19T16:00:49.4976545Z 13:00:49.497 DEBUG: 'src/app/app.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-10-19T16:00:49.4978322Z 13:00:49.497 DEBUG: 'src/app/app.component.spec.ts' indexed as test with language 'ts'
2026-10-19T16:00:49.4978494Z 13:00:49.497 DEBUG: File src/app/app.component.spec.ts excluded for coverage
2026-10-19T16:00:49.4999181Z 13:00:49.499 DEBUG: 'src/app/pages/abert-comprovante-operacao/business/abert-comprovante-operacao.business.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-10-19T16:00:49.5000843Z 13:00:49.500 DEBUG: 'src/app/pages/abert-comprovante-operacao/business/abert-comprovante-operacao.business.spec.ts' indexed as test with language 'ts'
2026-10-19T16:00:49.5001165Z 13:00:49.500 DEBUG: File src/app/pages/abert-comprovante-operacao/business/abert-comprovante-operacao.business.spec.ts excluded for coverage
2026-10-19T16:00:49.5007504Z 13:00:49.500 DEBUG: 'src/app/pages/abert-comprovante-operacao/business/modal-config-contrato-relacionamento.business.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-10-19T16:00:49.5009191Z 13:00:49.500 DEBUG: 'src/app/pages/abert-comprovante-operacao/business/modal-config-contrato-relacionamento.business.spec.ts' indexed as test with language 'ts'
2026-10-19T16:00:49.5009530Z 13:00:49.500 DEBUG: File src/app/pages/abert-comprovante-operacao/business/modal-config-contrato-relacionamento.business.spec.ts excluded for coverage
2026-10-19T16:00:49.5015391Z 13:00:49.501 DEBUG: 'src/app/pages/abert-comprovante-operacao/business/modal-config-faa.business.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-10-19T16:00:49.5022960Z 13:00:49.501 DEBUG: 'src/app/pages/abert-comprovante-operacao/business/modal-config-faa.business.spec.ts' indexed as test with language 'ts'
2026-10-19T16:00:49.5023275Z 13:00:49.501 DEBUG: File src/app/pages/abert-comprovante-operacao/business/modal-config-faa.business.spec.ts excluded for coverage
2026-10-19T16:00:49.5024026Z 13:00:49.502 DEBUG: 'src/app/pages/abert-comprovante-operacao/components/abert-comprovante-operacao/abert-comprovante-operacao.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-10-19T16:00:49.5026162Z 13:00:49.502 DEBUG: 'src/app/pages/abert-comprovante-operacao/components/abert-comprovante-operacao/abert-comprovante-operacao.component.spec.ts' indexed as test with language 'ts'
2026-10-19T16:00:49.5026635Z 13:00:49.502 DEBUG: File src/app/pages/abert-comprovante-operacao/components/abert-comprovante-operacao/abert-comprovante-operacao.component.spec.ts excluded for coverage
2026-10-19T16:00:49.5031461Z 13:00:49.503 DEBUG: 'src/app/pages/abert-comprovante-operacao/components/modal-config-contrato/modal-config-contrato.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-10-19T16:00:49.5033662Z 13:00:49.503 DEBUG: 'src/app/pages/abert-comprovante-operacao/components/modal-config-contrato/modal-config-contrato.component.spec.ts' indexed as test with language 'ts'
2026-10-19T16:00:49.5034065Z 13:00:49.503 DEBUG: File src/app/pages/abert-comprovante-operacao/components/modal-config-contrato/modal-config-contrato.component.spec.ts excluded for coverage
2026-10-19T16:00:49.5039386Z 13:00:49.503 DEBUG: 'src/app/pages/abert-comprovante-operacao/components/modal-config-faa/modal-config-faa.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-10-19T16:00:49.5041120Z 13:00:49.504 DEBUG: 'src/app/pages/abert-comprovante-operacao/components/modal-config-faa/modal-config-faa.component.spec.ts' indexed as test with language 'ts'
2026-10-19T16:00:49.5041450Z 13:00:49.504 DEBUG: File src/app/pages/abert-comprovante-operacao/components/modal-config-faa/modal-config-faa.component.spec.ts excluded for coverage
2026-10-19T16:00:49.5046122Z 13:00:49.504 DEBUG: 'src/app/pages/abert-comprovante-operacao/components/toggle-resumo-operacao/toggle-resumo-operacao.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-10-19T16:00:49.5047352Z 13:00:49.504 DEBUG: 'src/app/pages/abert-comprovante-operacao/components/toggle-resumo-operacao/toggle-resumo-operacao.component.spec.ts' indexed as test with language 'ts'
2026-10-19T16:00:49.5047805Z 13:00:49.504 DEBUG: File src/app/pages/abert-comprovante-operacao/components/toggle-resumo-operacao/toggle-resumo-operacao.component.spec.ts excluded for coverage
2026-10-19T16:00:49.5058565Z 13:00:49.505 DEBUG: 'src/app/pages/abert-dados-gerais/business/abert-dados-gerais-conta.business.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-10-19T16:00:49.5065369Z 13:00:49.506 DEBUG: 'src/app/pages/abert-dados-gerais/business/abert-dados-gerais-conta.business.spec.ts' indexed as test with language 'ts'
2026-10-19T16:00:49.5065688Z 13:00:49.506 DEBUG: File src/app/pages/abert-dados-gerais/business/abert-dados-gerais-conta.business.spec.ts excluded for coverage
2026-10-19T16:00:49.5159183Z 13:00:49.507 DEBUG: 'src/app/pages/abert-dados-gerais/components/abert-dados-gerais-conta/abert-dados-gerais-conta.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-10-19T16:00:49.5159617Z 13:00:49.507 DEBUG: 'src/app/pages/abert-dados-gerais/components/abert-dados-gerais-conta/abert-dados-gerais-conta.component.spec.ts' indexed as test with language 'ts'
2026-10-19T16:00:49.5159973Z 13:00:49.507 DEBUG: File src/app/pages/abert-dados-gerais/components/abert-dados-gerais-conta/abert-dados-gerais-conta.component.spec.ts excluded for coverage
2026-10-19T16:00:49.5160283Z 13:00:49.508 DEBUG: 'src/app/pages/abert-dados-gerais/factory/abert-dados-gerais-conta.factory.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-10-19T16:00:49.5160590Z 13:00:49.508 DEBUG: 'src/app/pages/abert-dados-gerais/factory/abert-dados-gerais-conta.factory.spec.ts' indexed as test with language 'ts'
2026-10-19T16:00:49.5160892Z 13:00:49.508 DEBUG: File src/app/pages/abert-dados-gerais/factory/abert-dados-gerais-conta.factory.spec.ts excluded for coverage
2026-10-19T16:00:49.5161235Z 13:00:49.509 DEBUG: 'src/app/pages/abert-dados-representantes-procuradores/business/abert-dados-representantes-procuradores.business.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-10-19T16:00:49.5161593Z 13:00:49.509 DEBUG: 'src/app/pages/abert-dados-representantes-procuradores/business/abert-dados-representantes-procuradores.business.spec.ts' indexed as test with language 'ts'
2026-10-19T16:00:49.5161942Z 13:00:49.509 DEBUG: File src/app/pages/abert-dados-representantes-procuradores/business/abert-dados-representantes-procuradores.business.spec.ts excluded for coverage
2026-10-19T16:00:49.5162289Z 13:00:49.510 DEBUG: 'src/app/pages/abert-dados-representantes-procuradores/business/modal-incluir-titular.business.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-10-19T16:00:49.5162623Z 13:00:49.510 DEBUG: 'src/app/pages/abert-dados-representantes-procuradores/business/modal-incluir-titular.business.spec.ts' indexed as test with language 'ts'
2026-10-19T16:00:49.5162940Z 13:00:49.510 DEBUG: File src/app/pages/abert-dados-representantes-procuradores/business/modal-incluir-titular.business.spec.ts excluded for coverage
2026-10-19T16:00:49.5163327Z 13:00:49.511 DEBUG: 'src/app/pages/abert-dados-representantes-procuradores/components/abert-dados-representante-legal/abert-dados-representantes-procuradores.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-10-19T16:00:49.5163755Z 13:00:49.511 DEBUG: 'src/app/pages/abert-dados-representantes-procuradores/components/abert-dados-representante-legal/abert-dados-representantes-procuradores.component.spec.ts' indexed as test with language 'ts'
2026-10-19T16:00:49.5164222Z 13:00:49.511 DEBUG: File src/app/pages/abert-dados-representantes-procuradores/components/abert-dados-representante-legal/abert-dados-representantes-procuradores.component.spec.ts excluded for coverage
2026-10-19T16:00:49.5164820Z 13:00:49.512 DEBUG: 'src/app/pages/abert-dados-representantes-procuradores/components/modal-incluir-titular/modal-incluir-titular.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-10-19T16:00:49.5165169Z 13:00:49.512 DEBUG: 'src/app/pages/abert-dados-representantes-procuradores/components/modal-incluir-titular/modal-incluir-titular.component.spec.ts' indexed as test with language 'ts'
2026-10-19T16:00:49.5165620Z 13:00:49.512 DEBUG: File src/app/pages/abert-dados-representantes-procuradores/components/modal-incluir-titular/modal-incluir-titular.component.spec.ts excluded for coverage
2026-10-19T16:00:49.5166021Z 13:00:49.512 DEBUG: 'src/app/services/agencia.service.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-10-19T16:00:49.5166284Z 13:00:49.512 DEBUG: 'src/app/services/agencia.service.spec.ts' indexed as test with language 'ts'
2026-10-19T16:00:49.5166462Z 13:00:49.513 DEBUG: File src/app/services/agencia.service.spec.ts excluded for coverage
2026-10-19T16:00:49.5166721Z 13:00:49.513 DEBUG: 'src/app/services/dados-abertura.service.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-10-19T16:00:49.5166985Z 13:00:49.514 DEBUG: 'src/app/services/dados-abertura.service.spec.ts' indexed as test with language 'ts'
2026-10-19T16:00:49.5167232Z 13:00:49.514 DEBUG: File src/app/services/dados-abertura.service.spec.ts excluded for coverage
2026-10-19T16:00:49.5167497Z 13:00:49.514 DEBUG: 'src/app/services/dados-relatorios.service.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-10-19T16:00:49.5167746Z 13:00:49.514 DEBUG: 'src/app/services/dados-relatorios.service.spec.ts' indexed as test with language 'ts'
2026-10-19T16:00:49.5167992Z 13:00:49.514 DEBUG: File src/app/services/dados-relatorios.service.spec.ts excluded for coverage
2026-10-19T16:00:49.5168244Z 13:00:49.515 DEBUG: 'src/app/services/dialog.service.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-10-19T16:00:49.5168490Z 13:00:49.515 DEBUG: 'src/app/services/dialog.service.spec.ts' indexed as test with language 'ts'
2026-10-19T16:00:49.5168662Z 13:00:49.515 DEBUG: File src/app/services/dialog.service.spec.ts excluded for coverage
2026-10-19T16:00:49.5168927Z 13:00:49.516 DEBUG: 'src/app/services/loading-caixa.service.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-10-19T16:00:49.5169182Z 13:00:49.516 DEBUG: 'src/app/services/loading-caixa.service.spec.ts' indexed as test with language 'ts'
2026-10-19T16:00:49.5169425Z 13:00:49.516 DEBUG: File src/app/services/loading-caixa.service.spec.ts excluded for coverage
2026-10-19T16:00:49.5169744Z 13:00:49.516 DEBUG: 'src/app/services/modal-dialogo.service.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-10-19T16:00:49.5169990Z 13:00:49.516 DEBUG: 'src/app/services/modal-dialogo.service.spec.ts' indexed as test with language 'ts'
2026-10-19T16:00:49.5170235Z 13:00:49.516 DEBUG: File src/app/services/modal-dialogo.service.spec.ts excluded for coverage
2026-10-19T16:00:49.5175734Z 13:00:49.517 DEBUG: 'src/app/shared/components/consultas-cadastrais/consultas-cadastrais.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-10-19T16:00:49.5177249Z 13:00:49.517 DEBUG: 'src/app/shared/components/consultas-cadastrais/consultas-cadastrais.component.spec.ts' indexed as test with language 'ts'
2026-10-19T16:00:49.5177552Z 13:00:49.517 DEBUG: File src/app/shared/components/consultas-cadastrais/consultas-cadastrais.component.spec.ts excluded for coverage
2026-10-19T16:00:49.5184707Z 13:00:49.518 DEBUG: 'src/app/shared/components/lista-editavel-telefones/lista-editavel-telefones.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-10-19T16:00:49.5186207Z 13:00:49.518 DEBUG: 'src/app/shared/components/lista-editavel-telefones/lista-editavel-telefones.component.spec.ts' indexed as test with language 'ts'
2026-10-19T16:00:49.5186696Z 13:00:49.518 DEBUG: File src/app/shared/components/lista-editavel-telefones/lista-editavel-telefones.component.spec.ts excluded for coverage
2026-10-19T16:00:49.5191206Z 13:00:49.519 DEBUG: 'src/app/shared/components/lista-editavel-telefones/lista-editavel-telefones.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-10-19T16:00:49.5193311Z 13:00:49.519 DEBUG: 'src/app/shared/components/lista-editavel-telefones/lista-editavel-telefones.spec.ts' indexed as test with language 'ts'
2026-10-19T16:00:49.5193616Z 13:00:49.519 DEBUG: File src/app/shared/components/lista-editavel-telefones/lista-editavel-telefones.spec.ts excluded for coverage
2026-10-19T16:00:49.5198160Z 13:00:49.519 DEBUG: 'src/app/shared/components/loading-caixa/loading-caixa.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-10-19T16:00:49.5199936Z 13:00:49.519 DEBUG: 'src/app/shared/components/loading-caixa/loading-caixa.component.spec.ts' indexed as test with language 'ts'
2026-10-19T16:00:49.5200216Z 13:00:49.519 DEBUG: File src/app/shared/components/loading-caixa/loading-caixa.component.spec.ts excluded for coverage
2026-10-19T16:00:49.5204581Z 13:00:49.520 DEBUG: 'src/app/shared/components/modal-alerta/modal-alerta.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-10-19T16:00:49.5205879Z 13:00:49.520 DEBUG: 'src/app/shared/components/modal-alerta/modal-alerta.component.spec.ts' indexed as test with language 'ts'
2026-10-19T16:00:49.5206161Z 13:00:49.520 DEBUG: File src/app/shared/components/modal-alerta/modal-alerta.component.spec.ts excluded for coverage
2026-10-19T16:00:49.5211913Z 13:00:49.521 DEBUG: 'src/app/shared/components/stepper-dsc/stepper-dsc.component.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-10-19T16:00:49.5213259Z 13:00:49.521 DEBUG: 'src/app/shared/components/stepper-dsc/stepper-dsc.component.spec.ts' indexed as test with language 'ts'
2026-10-19T16:00:49.5213544Z 13:00:49.521 DEBUG: File src/app/shared/components/stepper-dsc/stepper-dsc.component.spec.ts excluded for coverage
2026-10-19T16:00:49.5219730Z 13:00:49.521 DEBUG: 'src/app/shared/utils/utils.spec.ts' generated metadata as test  with charset 'UTF-8'
2026-10-19T16:00:49.5221150Z 13:00:49.522 DEBUG: 'src/app/shared/utils/utils.spec.ts' indexed as test with language 'ts'
2026-10-19T16:00:49.5221326Z 13:00:49.522 DEBUG: File src/app/shared/utils/utils.spec.ts excluded for coverage
2026-10-19T16:00:49.5252942Z 13:00:49.525 INFO: 215 files indexed
2026-10-19T16:00:49.5253155Z 13:00:49.525 INFO: 217 files ignored because of inclusion/exclusion patterns
2026-10-19T16:00:49.5265020Z 13:00:49.526 INFO: Quality profile for css: Sonar way
2026-10-19T16:00:49.5265179Z 13:00:49.526 INFO: Quality profile for js: Sonar way
2026-10-19T16:00:49.5265322Z 13:00:49.526 INFO: Quality profile for ts: Sonar way
2026-10-19T16:00:49.5265471Z 13:00:49.526 INFO: Quality profile for web: HTML ACESSIBILIDADE
2026-10-19T16:00:49.5265785Z 13:00:49.526 INFO: ------------- Run sensors on module SIPNC-conta1288judi-microfront
2026-10-19T16:00:49.6986721Z 13:00:49.698 INFO: Load metrics repository
2026-10-19T16:00:49.8063645Z 13:00:49.806 DEBUG: GET 200 http://sonar-esteira.apps.produtos4.caixa/api/metrics/search?ps=500&p=1 | time=106ms
2026-10-19T16:00:49.8114766Z 13:00:49.810 INFO: Load metrics repository (done) | time=112ms
2026-10-19T16:00:51.3469472Z 13:00:51.346 DEBUG: 'JavaSensor' skipped because there is no related file in current project
2026-10-19T16:00:51.3469942Z 13:00:51.346 DEBUG: 'Import external issues report' skipped because one of the required properties is missing
2026-10-19T16:00:51.3472110Z 13:00:51.346 DEBUG: 'Import external issues report from SARIF file.' skipped because one of the required properties is missing
2026-10-19T16:00:51.3472387Z 13:00:51.347 DEBUG: 'Python Sensor' skipped because there is no related file in current project
2026-10-19T16:00:51.3474716Z 13:00:51.347 DEBUG: 'Cobertura Sensor for Python coverage' skipped because there is no related file in current project
2026-10-19T16:00:51.3476358Z 13:00:51.347 DEBUG: 'PythonXUnitSensor' skipped because there is no related file in current project
2026-10-19T16:00:51.3482905Z 13:00:51.348 DEBUG: 'Import of Pylint issues' skipped because there is no related file in current project
2026-10-19T16:00:51.3483439Z 13:00:51.348 DEBUG: 'Import of Bandit issues' skipped because there is no related file in current project
2026-10-19T16:00:51.3484140Z 13:00:51.348 DEBUG: 'Import of Flake8 issues' skipped because there is no related file in current project
2026-10-19T16:00:51.3486725Z 13:00:51.348 DEBUG: 'Code Quality and Security for Go' skipped because there is no related file in current project
2026-10-19T16:00:51.3489221Z 13:00:51.348 DEBUG: 'Go Unit Test Report' skipped because there is no related file in current project
2026-10-19T16:00:51.3490611Z 13:00:51.348 DEBUG: 'Go Cover sensor for Go coverage' skipped because one of the required properties is missing
2026-10-19T16:00:51.3492937Z 13:00:51.349 DEBUG: 'Import of go vet issues' skipped because there is no related file in current project
2026-10-19T16:00:51.3493464Z 13:00:51.349 DEBUG: 'Import of Golint issues' skipped because there is no related file in current project
2026-10-19T16:00:51.3494135Z 13:00:51.349 DEBUG: 'Import of GoMetaLinter issues' skipped because there is no related file in current project
2026-10-19T16:00:51.3495063Z 13:00:51.349 DEBUG: 'Import of GolangCI-Lint issues' skipped because there is no related file in current project
2026-10-19T16:00:51.3500111Z 13:00:51.349 DEBUG: 'Kotlin Sensor' skipped because there is no related file in current project
2026-10-19T16:00:51.3500373Z 13:00:51.349 DEBUG: 'KotlinSurefireSensor' skipped because there is no related file in current project
2026-10-19T16:00:51.3503179Z 13:00:51.350 DEBUG: 'Import of detekt issues' skipped because there is no related file in current project
2026-10-19T16:00:51.3504864Z 13:00:51.350 DEBUG: 'Import of Android Lint issues' skipped because one of the required properties is missing
2026-10-19T16:00:51.3505628Z 13:00:51.350 DEBUG: 'Import of ktlint issues' skipped because there is no related file in current project
2026-10-19T16:00:51.3511960Z 13:00:51.350 DEBUG: 'IaC Terraform Sensor' skipped because there is no related file in current project
2026-10-19T16:00:51.3512211Z 13:00:51.351 DEBUG: 'IaC CloudFormation Sensor' skipped because there is no related file in current project
2026-10-19T16:00:51.3512821Z 13:00:51.351 DEBUG: 'IaC Kubernetes Sensor' skipped because there is no related file in current project
2026-10-19T16:00:51.3514504Z 13:00:51.351 DEBUG: 'JavaScript inside YAML analysis' skipped because there is no related file in current project
2026-10-19T16:00:51.3520665Z 13:00:51.351 DEBUG: 'Import of ESLint issues' skipped because one of the required properties is missing
2026-10-19T16:00:51.3520999Z 13:00:51.352 DEBUG: 'Import of TSLint issues' skipped because one of the required properties is missing
2026-10-19T16:00:51.3523154Z 13:00:51.352 DEBUG: 'Import of stylelint issues' skipped because one of the required properties is missing
2026-10-19T16:00:51.3525424Z 13:00:51.352 DEBUG: 'Ruby Sensor' skipped because there is no related file in current project
2026-10-19T16:00:51.3528900Z 13:00:51.352 DEBUG: 'Import of RuboCop issues' skipped because there is no related file in current project
2026-10-19T16:00:51.3529568Z 13:00:51.352 DEBUG: 'SimpleCov Sensor for Ruby coverage' skipped because there is no related file in current project
2026-10-19T16:00:51.3531267Z 13:00:51.353 DEBUG: 'Scala Sensor' skipped because there is no related file in current project
2026-10-19T16:00:51.3533762Z 13:00:51.353 DEBUG: 'Scoverage sensor for Scala coverage' skipped because there is no related file in current project
2026-10-19T16:00:51.3538420Z 13:00:51.353 DEBUG: 'Import of Scalastyle issues' skipped because there is no related file in current project
2026-10-19T16:00:51.3538677Z 13:00:51.353 DEBUG: 'Import of Scapegoat issues' skipped because there is no related file in current project
2026-10-19T16:00:51.3543183Z 13:00:51.354 DEBUG: 'Import of Checkstyle issues' skipped because there is no related file in current project
2026-10-19T16:00:51.3549423Z 13:00:51.354 DEBUG: 'Import of PMD issues' skipped because one of the required properties is missing
2026-10-19T16:00:51.3549691Z 13:00:51.354 DEBUG: 'Import of SpotBugs issues' skipped because there is no related file in current project
2026-10-19T16:00:51.3549944Z 13:00:51.354 DEBUG: 'SurefireSensor' skipped because there is no related file in current project
2026-10-19T16:00:51.3550201Z 13:00:51.354 DEBUG: 'Removed properties sensor' skipped because there is no related file in current project
2026-10-19T16:00:51.3551973Z 13:00:51.355 DEBUG: 'Flex' skipped because there is no related file in current project
2026-10-19T16:00:51.3552831Z 13:00:51.355 DEBUG: 'Flex Cobertura' skipped because there is no related file in current project
2026-10-19T16:00:51.3554267Z 13:00:51.355 DEBUG: 'XML Sensor' skipped because there is no related file in current project
2026-10-19T16:00:51.3561720Z 13:00:51.355 DEBUG: 'PHP sensor' skipped because there is no related file in current project
2026-10-19T16:00:51.3561994Z 13:00:51.355 DEBUG: 'Analyzer for "php.ini" files' skipped because there is no related file in current project
2026-10-19T16:00:51.3562257Z 13:00:51.355 DEBUG: 'Import of PHPStan issues' skipped because there is no related file in current project
2026-10-19T16:00:51.3562513Z 13:00:51.355 DEBUG: 'Import of Psalm issues' skipped because there is no related file in current project
2026-10-19T16:00:51.3585520Z 13:00:51.358 DEBUG: Sensors : JaCoCo XML Report Importer -> JavaScript analysis -> TypeScript analysis -> CSS Rules -> JavaScript/TypeScript Coverage -> CSS Metrics -> C# Project Type Information -> C# Analysis Log -> C# Properties -> HTML -> TextAndSecretsSensor -> VB.NET Project Type Information -> VB.NET Analysis Log -> VB.NET Properties -> com.github.mc1arke.sonarqube.plugin.scanner.ScannerPullRequestPropertySensor -> IaC Docker Sensor -> Generic Test Executions Report
2026-10-19T16:00:51.3590374Z 13:00:51.358 INFO: Sensor JaCoCo XML Report Importer [jacoco]
2026-10-19T16:00:51.3601499Z 13:00:51.360 INFO: 'sonar.coverage.jacoco.xmlReportPaths' is not defined. Using default locations: target/site/jacoco/jacoco.xml,target/site/jacoco-it/jacoco.xml,build/reports/jacoco/test/jacocoTestReport.xml
2026-10-19T16:00:51.3606943Z 13:00:51.360 INFO: No report imported, no coverage information will be imported by JaCoCo XML Report Importer
2026-10-19T16:00:51.3607137Z 13:00:51.360 INFO: Sensor JaCoCo XML Report Importer [jacoco] (done) | time=2ms
2026-10-19T16:00:51.3607687Z 13:00:51.360 INFO: Sensor JavaScript analysis [javascript]
2026-10-19T16:00:51.3724856Z 13:00:51.363 DEBUG: Deploying bundle
2026-10-19T16:00:51.3725386Z 13:00:51.363 DEBUG: Deploying eslint-bridge into /opt/ads-agent/_work/21/s/.scannerwork/.sonartmp/eslint-bridge-bundle
2026-10-19T16:00:52.9680150Z 13:00:52.967 DEBUG: Deploying bundle (done) | time=1604ms
2026-10-19T16:00:52.9684355Z 13:00:52.968 DEBUG: Starting server
2026-10-19T16:00:52.9702738Z 13:00:52.970 DEBUG: Using default Node.js executable: 'node'.
2026-10-19T16:00:52.9702943Z 13:00:52.970 DEBUG: Checking Node.js version
2026-10-19T16:00:52.9705677Z 13:00:52.970 DEBUG: Launching command node -v
2026-10-19T16:00:53.0204557Z 13:00:53.020 DEBUG: Using Node.js v16.14.0.
2026-10-19T16:00:53.0205890Z 13:00:53.020 DEBUG: Starting Node.js process to start eslint-bridge server at port 41357
2026-10-19T16:00:53.0206277Z 13:00:53.020 DEBUG: Launching command node /opt/ads-agent/_work/21/s/.scannerwork/.sonartmp/eslint-bridge-bundle/package/bin/server 41357 127.0.0.1 /opt/ads-agent/_work/21/s/.scannerwork true false 
2026-10-19T16:00:54.3813237Z 13:00:54.380 DEBUG: starting eslint-bridge server at port 41357
2026-10-19T16:00:54.3854534Z 13:00:54.385 DEBUG: eslint-bridge server is running at port 41357
2026-10-19T16:00:54.4369696Z 13:00:54.436 DEBUG: Starting server (done) | time=1468ms
2026-10-19T16:00:54.4427914Z 13:00:54.442 DEBUG: Using generated tsconfig.json file /opt/ads-agent/_work/21/s/.scannerwork/.sonartmp/3755637265209325370.tmp
2026-10-19T16:00:54.4450714Z 13:00:54.444 DEBUG: Analysis of unchanged files will not be skipped (current analysis requires all files to be analyzed)
2026-10-19T16:00:54.4483214Z 13:00:54.448 INFO: 1 source file to be analyzed
2026-10-19T16:00:54.4653548Z 13:00:54.464 DEBUG: Initializing linter "default" with no-vue-bypass-sanitization,hashing,for-loop-increment-sign,no-globals-shadowing,null-dereference,unverified-hostname,no-extra-arguments,no-redeclare,constructor-for-side-effects,post-message,cookie-no-httponly,weak-ssl,no-throw-literal,no-useless-increment,pseudo-random,session-regeneration,no-use-of-empty-return-value,no-associative-arrays,no-weak-keys,confidential-information-logging,no-ip-forward,single-character-alternation,unused-named-groups,aws-ec2-unencrypted-ebs-volume,single-char-in-character-classes,dns-prefetching,certificate-transparency,no-same-argument-assert,arguments-order,inconsistent-function-call,file-uploads,sonar-no-misleading-character-class,no-inverted-boolean-check,duplicates-in-character-class,todo-tag,fixme-tag,aws-s3-bucket-public-access,aws-s3-bucket-granted-access,no-mixed-content,anchor-precedence,frame-ancestors,no-angular-bypass-sanitization,array-callback-without-return,slow-regex,no-mime-sniff,prefer-default-last,no-commented-code,no-gratuitous-expressions,no-referrer-policy,sonar-no-fallthrough,no-empty-pattern,sonar-no-invalid-regexp,strict-transport-security,aws-iam-public-access,no-unsafe-finally,prefer-while,sonar-no-unused-vars,index-of-compare-to-positive-number,argument-type,empty-string-repetition,in-operator-type-error,prefer-promise-shorthand,regex-complexity,assertions-in-tests,no-intrusive-permissions,disabled-resource-integrity,no-empty-after-reluctant,content-security-policy,no-labels,no-uniq-key,aws-s3-bucket-server-encryption,no-unenclosed-multiline-block,call-argument-line,aws-s3-bucket-insecure-http,generator-without-yield,no-ignored-return,no-caller,csrf,cognitive-complexity,use-isnan,no-nested-template-literals,inverted-assertion-arguments,max-switch-cases,test-check-exception,production-debug,unused-import,prefer-single-boolean-return,no-redundant-boolean,no-nested-assignment,aws-s3-bucket-versioning,no-unsafe-unzip,concise-regex,no-array-index-key,jsx-key,updated-loop-counter,link-with-target-blank,no-unstable-nested-components,no-setter-return,different-types-comparison,no-case-label-in-switch,no-in-misuse,jsx-no-constructed-context-values,no-misleading-array-reverse,no-redundant-assignments,os-command,no-invariant-returns,no-parameter-reassignment,stateful-regex,aws-efs-unencrypted,aws-apigateway-public-api,aws-sqs-unencrypted-queue,cors,no-empty-group,no-accessor-field-mismatch,no-os-command-from-path,no-collection-size-mischeck,unverified-certificate,no-empty-collection,disabled-auto-escaping,updated-const-var,no-duplicate-imports,no-unthrown-error,no-var,no-redundant-jump,no-octal,no-hardcoded-ip,aws-restricted-ip-admin-access,no-hook-setter-in-body,no-useless-react-setstate,no-identical-functions,rules-of-hooks,sonar-no-unused-class-component-methods,no-element-overwrite,prefer-regex-literals,sonar-no-regex-spaces,no-empty-alternatives,sonar-no-control-regex,no-same-line-conditional,aws-ec2-rds-dms-public,aws-sns-unencrypted-topics,super-invocation,no-try-promise,existing-groups,void-use,comma-or-logical-or-case,label-position,no-with,insecure-cookie,no-unused-collection,sql-queries,require-render-return,no-sequences,no-global-this,no-array-delete,no-alphabetical-sort,sonar-jsx-no-leaked-render,prefer-for-of,aws-sagemaker-unencrypted-notebook,aws-iam-privilege-escalation,jsx-no-comment-textnodes,xml-parser-xxe,default-param-last,new-operator-misuse,non-existent-operator,no-sparse-arrays,content-length,no-clear-text-protocols,aws-rds-unencrypted-databases,no-invalid-await,no-equals-in-for-termination,no-hardcoded-credentials,no-infinite-loop,valid-typeof,aws-iam-all-privileges,aws-opensearchservice-domain,no-primitive-wrappers,no-exclusive-tests,sonar-no-dupe-keys,no-self-assign,no-new-symbol,no-dupe-args,no-small-switch,publicly-writable-directories,no-incomplete-assertions,no-unreachable,x-powered-by,no-identical-expressions,code-eval,file-permissions,future-reserved-words,no-useless-catch,bitwise-operators,hidden-files,no-unused-expressions,no-empty,sonar-max-params,no-duplicated-branches,no-one-iteration-loop,misplaced-loop-counter,deprecation,no-unsafe-negation,function-inside-loop,no-multi-str,class-name,chai-determinate-assertion,no-code-after-done,sonar-block-scoped-var,no-delete-var,encryption-secure-mode,no-weak-cipher,no-identical-conditions,function-return-type,no-all-duplicated-branches,disabled-timeout,no-nested-conditional,insecure-jwt-token,no-dead-store,no-implicit-global,no-empty-function
2026-10-19T16:00:54.4763757Z 13:00:54.476 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/assets/js/vanilla-masker.js' as current analysis requires all files to be analyzed
2026-10-19T16:00:54.4764516Z 13:00:54.476 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/assets/js/vanilla-masker.js
2026-10-19T16:00:54.4797284Z 13:00:54.479 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/assets/js/vanilla-masker.js" with linterId "default"
2026-10-19T16:00:56.4890873Z 13:00:56.488 DEBUG: Saving issue for rule updated-const-var on line 15
2026-10-19T16:00:56.5015123Z 13:00:56.501 DEBUG: Saving issue for rule single-char-in-character-classes on line 30
2026-10-19T16:00:56.5015603Z 13:00:56.501 DEBUG: Saving issue for rule single-char-in-character-classes on line 31
2026-10-19T16:00:56.5017005Z 13:00:56.501 DEBUG: Saving issue for rule updated-const-var on line 53
2026-10-19T16:00:56.5019910Z 13:00:56.501 DEBUG: Saving issue for rule deprecation on line 67
2026-10-19T16:00:56.5022343Z 13:00:56.502 DEBUG: Saving issue for rule updated-const-var on line 82
2026-10-19T16:00:56.5026964Z 13:00:56.502 DEBUG: Saving issue for rule no-nested-conditional on line 119
2026-10-19T16:00:56.5028252Z 13:00:56.502 DEBUG: Saving issue for rule single-char-in-character-classes on line 135
2026-10-19T16:00:56.5034017Z 13:00:56.503 DEBUG: Saving issue for rule updated-const-var on line 142
2026-10-19T16:00:56.5034317Z 13:00:56.503 DEBUG: Saving issue for rule updated-const-var on line 143
2026-10-19T16:00:56.5035360Z 13:00:56.503 DEBUG: Saving issue for rule updated-const-var on line 145
2026-10-19T16:00:56.5037326Z 13:00:56.503 DEBUG: Saving issue for rule updated-const-var on line 147
2026-10-19T16:00:56.5038778Z 13:00:56.503 DEBUG: Saving issue for rule updated-const-var on line 149
2026-10-19T16:00:56.5040428Z 13:00:56.503 DEBUG: Saving issue for rule updated-const-var on line 150
2026-10-19T16:00:56.5042078Z 13:00:56.504 DEBUG: Saving issue for rule updated-const-var on line 153
2026-10-19T16:00:56.5043929Z 13:00:56.504 DEBUG: Saving issue for rule updated-const-var on line 161
2026-10-19T16:00:56.5045697Z 13:00:56.504 DEBUG: Saving issue for rule single-char-in-character-classes on line 172
2026-10-19T16:00:56.5047128Z 13:00:56.504 DEBUG: Saving issue for rule single-char-in-character-classes on line 176
2026-10-19T16:00:56.5048103Z 13:00:56.504 DEBUG: Saving issue for rule updated-const-var on line 197
2026-10-19T16:00:56.5049862Z 13:00:56.504 DEBUG: Saving issue for rule updated-const-var on line 197
2026-10-19T16:00:56.5051662Z 13:00:56.505 DEBUG: Saving issue for rule concise-regex on line 219
2026-10-19T16:00:56.5053460Z 13:00:56.505 DEBUG: Saving issue for rule concise-regex on line 233
2026-10-19T16:00:56.5471985Z 13:00:56.522 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/assets/js/vanilla-masker.js' containing 0 file(s)
2026-10-19T16:00:56.5472455Z 13:00:56.522 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/assets/js/vanilla-masker.js'
2026-10-19T16:00:56.5520709Z 13:00:56.551 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/assets/js/vanilla-masker.js'
2026-10-19T16:00:56.5552180Z 13:00:56.555 INFO: 1/1 source file has been analyzed
2026-10-19T16:00:56.5553089Z 13:00:56.555 INFO: Hit the cache for 0 out of 1
2026-10-19T16:00:56.5567778Z 13:00:56.556 INFO: Miss the cache for 1 out of 1: ANALYSIS_MODE_INELIGIBLE [1/1]
2026-10-19T16:00:56.5567950Z 13:00:56.556 INFO: Sensor JavaScript analysis [javascript] (done) | time=5196ms
2026-10-19T16:00:56.5568131Z 13:00:56.556 INFO: Sensor TypeScript analysis [javascript]
2026-10-19T16:00:56.5635217Z 13:00:56.563 DEBUG: eslint-bridge server is up, no need to start.
2026-10-19T16:00:56.5638610Z 13:00:56.563 DEBUG: Analysis of unchanged files will not be skipped (current analysis requires all files to be analyzed)
2026-10-19T16:00:56.5678158Z 13:00:56.567 DEBUG: Initializing linter "default" with no-commented-code,sonar-no-fallthrough,duplicates-in-character-class,no-inverted-boolean-check,file-uploads,sonar-no-misleading-character-class,dns-prefetching,no-same-argument-assert,certificate-transparency,arguments-order,single-char-in-character-classes,aws-ec2-unencrypted-ebs-volume,no-unsafe-finally,prefer-while,unused-named-groups,single-character-alternation,aws-iam-public-access,no-ip-forward,session-regeneration,no-use-of-empty-return-value,no-associative-arrays,no-weak-keys,confidential-information-logging,no-throw-literal,weak-ssl,no-useless-increment,pseudo-random,no-redundant-optional,cookie-no-httponly,aws-s3-bucket-public-access,post-message,constructor-for-side-effects,no-globals-shadowing,unverified-hostname,hashing,for-loop-increment-sign,no-vue-bypass-sanitization,no-nested-conditional,no-unnecessary-type-assertion,insecure-jwt-token,no-dead-store,prefer-type-guard,use-type-alias,no-in-misuse,no-parameter-reassignment,no-unstable-nested-components,jsx-key,updated-loop-counter,link-with-target-blank,no-array-index-key,concise-regex,stateful-regex,test-check-exception,max-switch-cases,production-debug,csrf,no-undefined-argument,cognitive-complexity,no-labels,use-isnan,inverted-assertion-arguments,no-nested-template-literals,aws-s3-bucket-insecure-http,generator-without-yield,no-duplicate-in-composite,no-ignored-return,no-caller,aws-s3-bucket-server-encryption,call-argument-line,no-unenclosed-multiline-block,no-uniq-key,jsx-no-constructed-context-values,no-redundant-boolean,content-security-policy,prefer-promise-shorthand,regex-complexity,no-empty-after-reluctant,assertions-in-tests,no-intrusive-permissions,disabled-resource-integrity,unused-import,empty-string-repetition,no-nested-assignment,index-of-compare-to-positive-number,no-unsafe-unzip,aws-s3-bucket-versioning,todo-tag,strict-transport-security,no-mime-sniff,prefer-default-last,no-gratuitous-expressions,no-referrer-policy,no-empty-pattern,sonar-no-invalid-regexp,no-mixed-content,anchor-precedence,no-angular-bypass-sanitization,frame-ancestors,slow-regex,fixme-tag,aws-s3-bucket-granted-access,new-operator-misuse,non-existent-operator,no-small-switch,aws-iam-privilege-escalation,jsx-no-comment-textnodes,prefer-for-of,aws-sagemaker-unencrypted-notebook,sonar-jsx-no-leaked-render,xml-parser-xxe,default-param-last,sql-queries,no-global-this,no-array-delete,no-alphabetical-sort,require-render-return,no-sequences,no-octal,void-use,no-hardcoded-ip,comma-or-logical-or-case,existing-groups,label-position,aws-sns-unencrypted-topics,super-invocation,no-try-promise,aws-ec2-rds-dms-public,sonar-no-control-regex,no-empty-alternatives,sonar-no-regex-spaces,prefer-regex-literals,no-same-line-conditional,sonar-no-unused-class-component-methods,rules-of-hooks,no-identical-functions,no-useless-react-setstate,aws-restricted-ip-admin-access,no-hook-setter-in-body,no-element-overwrite,no-equals-in-for-termination,no-sparse-arrays,no-var,no-redundant-jump,no-duplicate-imports,no-unthrown-error,no-os-command-from-path,no-collection-size-mischeck,prefer-namespace-keyword,unverified-certificate,no-empty-collection,disabled-auto-escaping,no-empty-group,aws-sqs-unencrypted-queue,aws-apigateway-public-api,cors,aws-efs-unencrypted,no-accessor-field-mismatch,insecure-cookie,no-unused-collection,no-invariant-returns,no-case-label-in-switch,os-command,no-misleading-array-reverse,no-redundant-assignments,no-all-duplicated-branches,no-identical-conditions,no-weak-cipher,no-delete-var,encryption-secure-mode,no-useless-intersection,sonar-block-scoped-var,no-empty-function,no-code-after-done,no-unsafe-negation,deprecation,misplaced-loop-counter,no-one-iteration-loop,no-multi-str,function-inside-loop,no-duplicated-branches,disabled-timeout,bitwise-operators,class-name,code-eval,no-identical-expressions,no-unreachable,no-useless-catch,x-powered-by,file-permissions,publicly-writable-directories,no-incomplete-assertions,chai-determinate-assertion,sonar-no-dupe-keys,no-primitive-wrappers,no-exclusive-tests,aws-opensearchservice-domain,no-self-assign,no-misused-new,aws-iam-all-privileges,no-invalid-await,no-hardcoded-credentials,aws-rds-unencrypted-databases,content-length,no-clear-text-protocols,no-empty,sonar-max-params,hidden-files,no-unused-expressions
2026-10-19T16:00:56.5730604Z 13:00:56.572 DEBUG: Analysis of unchanged files will not be skipped (current analysis requires all files to be analyzed)
2026-10-19T16:00:56.5870174Z 13:00:56.586 INFO: Found 1 tsconfig.json file(s): [/opt/ads-agent/_work/21/s/tsconfig.json]
2026-10-19T16:00:56.5873151Z 13:00:56.587 INFO: 151 source files to be analyzed
2026-10-19T16:00:56.5873630Z 13:00:56.587 INFO: Creating TypeScript program
2026-10-19T16:00:56.5878761Z 13:00:56.587 INFO: TypeScript configuration file /opt/ads-agent/_work/21/s/tsconfig.json
2026-10-19T16:00:57.9665652Z 13:00:57.965 DEBUG: program from /opt/ads-agent/_work/21/s/tsconfig.json with id 1 is created
2026-10-19T16:00:57.9744780Z 13:00:57.969 INFO: Creating TypeScript program (done) | time=1382ms
2026-10-19T16:00:57.9745286Z 13:00:57.969 INFO: Starting analysis with current program
2026-10-19T16:00:57.9746386Z 13:00:57.970 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/.scannerwork/.sonartmp/eslint-bridge-bundle/package/node_modules/typescript/lib/lib.es5.d.ts'
2026-10-19T16:00:57.9746808Z 13:00:57.970 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/.scannerwork/.sonartmp/eslint-bridge-bundle/package/node_modules/typescript/lib/lib.es2015.d.ts'
2026-10-19T16:00:57.9747182Z 13:00:57.970 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/.scannerwork/.sonartmp/eslint-bridge-bundle/package/node_modules/typescript/lib/lib.es2016.d.ts'
2026-10-19T16:00:57.9747536Z 13:00:57.970 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/.scannerwork/.sonartmp/eslint-bridge-bundle/package/node_modules/typescript/lib/lib.es2017.d.ts'
2026-10-19T16:00:57.9747880Z 13:00:57.970 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/.scannerwork/.sonartmp/eslint-bridge-bundle/package/node_modules/typescript/lib/lib.es2018.d.ts'
2026-10-19T16:00:57.9748236Z 13:00:57.970 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/.scannerwork/.sonartmp/eslint-bridge-bundle/package/node_modules/typescript/lib/lib.dom.d.ts'
2026-10-19T16:00:57.9748595Z 13:00:57.970 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/.scannerwork/.sonartmp/eslint-bridge-bundle/package/node_modules/typescript/lib/lib.dom.iterable.d.ts'
2026-10-19T16:00:57.9748961Z 13:00:57.970 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/.scannerwork/.sonartmp/eslint-bridge-bundle/package/node_modules/typescript/lib/lib.es2015.core.d.ts'
2026-10-19T16:00:57.9749502Z 13:00:57.970 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/.scannerwork/.sonartmp/eslint-bridge-bundle/package/node_modules/typescript/lib/lib.es2015.collection.d.ts'
2026-10-19T16:00:57.9749932Z 13:00:57.970 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/.scannerwork/.sonartmp/eslint-bridge-bundle/package/node_modules/typescript/lib/lib.es2015.generator.d.ts'
2026-10-19T16:00:57.9750302Z 13:00:57.970 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/.scannerwork/.sonartmp/eslint-bridge-bundle/package/node_modules/typescript/lib/lib.es2015.iterable.d.ts'
2026-10-19T16:00:57.9750661Z 13:00:57.970 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/.scannerwork/.sonartmp/eslint-bridge-bundle/package/node_modules/typescript/lib/lib.es2015.promise.d.ts'
2026-10-19T16:00:57.9751369Z 13:00:57.970 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/.scannerwork/.sonartmp/eslint-bridge-bundle/package/node_modules/typescript/lib/lib.es2015.proxy.d.ts'
2026-10-19T16:00:57.9751733Z 13:00:57.970 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/.scannerwork/.sonartmp/eslint-bridge-bundle/package/node_modules/typescript/lib/lib.es2015.reflect.d.ts'
2026-10-19T16:00:57.9752163Z 13:00:57.970 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/.scannerwork/.sonartmp/eslint-bridge-bundle/package/node_modules/typescript/lib/lib.es2015.symbol.d.ts'
2026-10-19T16:00:57.9752530Z 13:00:57.970 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/.scannerwork/.sonartmp/eslint-bridge-bundle/package/node_modules/typescript/lib/lib.es2015.symbol.wellknown.d.ts'
2026-10-19T16:00:57.9753470Z 13:00:57.970 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/.scannerwork/.sonartmp/eslint-bridge-bundle/package/node_modules/typescript/lib/lib.es2016.array.include.d.ts'
2026-10-19T16:00:57.9753895Z 13:00:57.970 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/.scannerwork/.sonartmp/eslint-bridge-bundle/package/node_modules/typescript/lib/lib.es2017.object.d.ts'
2026-10-19T16:00:57.9754276Z 13:00:57.970 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/.scannerwork/.sonartmp/eslint-bridge-bundle/package/node_modules/typescript/lib/lib.es2017.sharedmemory.d.ts'
2026-10-19T16:00:57.9754633Z 13:00:57.970 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/.scannerwork/.sonartmp/eslint-bridge-bundle/package/node_modules/typescript/lib/lib.es2017.string.d.ts'
2026-10-19T16:00:57.9754979Z 13:00:57.970 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/.scannerwork/.sonartmp/eslint-bridge-bundle/package/node_modules/typescript/lib/lib.es2017.intl.d.ts'
2026-10-19T16:00:57.9755335Z 13:00:57.970 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/.scannerwork/.sonartmp/eslint-bridge-bundle/package/node_modules/typescript/lib/lib.es2017.typedarrays.d.ts'
2026-10-19T16:00:57.9755694Z 13:00:57.970 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/.scannerwork/.sonartmp/eslint-bridge-bundle/package/node_modules/typescript/lib/lib.es2018.asyncgenerator.d.ts'
2026-10-19T16:00:57.9756052Z 13:00:57.970 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/.scannerwork/.sonartmp/eslint-bridge-bundle/package/node_modules/typescript/lib/lib.es2018.asynciterable.d.ts'
2026-10-19T16:00:57.9756404Z 13:00:57.970 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/.scannerwork/.sonartmp/eslint-bridge-bundle/package/node_modules/typescript/lib/lib.es2018.intl.d.ts'
2026-10-19T16:00:57.9756753Z 13:00:57.970 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/.scannerwork/.sonartmp/eslint-bridge-bundle/package/node_modules/typescript/lib/lib.es2018.promise.d.ts'
2026-10-19T16:00:57.9757101Z 13:00:57.970 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/.scannerwork/.sonartmp/eslint-bridge-bundle/package/node_modules/typescript/lib/lib.es2018.regexp.d.ts'
2026-10-19T16:00:57.9757451Z 13:00:57.970 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/.scannerwork/.sonartmp/eslint-bridge-bundle/package/node_modules/typescript/lib/lib.es2020.bigint.d.ts'
2026-10-19T16:00:57.9757795Z 13:00:57.970 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/.scannerwork/.sonartmp/eslint-bridge-bundle/package/node_modules/typescript/lib/lib.es2020.intl.d.ts'
2026-10-19T16:00:57.9758143Z 13:00:57.970 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/.scannerwork/.sonartmp/eslint-bridge-bundle/package/node_modules/typescript/lib/lib.esnext.intl.d.ts'
2026-10-19T16:00:57.9758438Z 13:00:57.970 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/tslib/tslib.d.ts'
2026-10-19T16:00:57.9758679Z 13:00:57.970 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/caixa-sipnc-core.ts'
2026-10-19T16:00:57.9758984Z 13:00:57.970 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/setup-jest.ts'
2026-10-19T16:00:57.9759271Z 13:00:57.970 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/Subscription.d.ts'
2026-10-19T16:00:57.9759562Z 13:00:57.970 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/Subscriber.d.ts'
2026-10-19T16:00:57.9759892Z 13:00:57.970 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/Operator.d.ts'
2026-10-19T16:00:57.9760181Z 13:00:57.970 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/Observable.d.ts'
2026-10-19T16:00:57.9760467Z 13:00:57.971 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/types.d.ts'
2026-10-19T16:00:57.9760773Z 13:00:57.971 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/audit.d.ts'
2026-10-19T16:00:57.9761077Z 13:00:57.971 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/auditTime.d.ts'
2026-10-19T16:00:57.9761358Z 13:00:57.971 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/buffer.d.ts'
2026-10-19T16:00:57.9761660Z 13:00:57.971 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/bufferCount.d.ts'
2026-10-19T16:00:57.9761963Z 13:00:57.971 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/bufferTime.d.ts'
2026-10-19T16:00:57.9762277Z 13:00:57.971 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/bufferToggle.d.ts'
2026-10-19T16:00:57.9762578Z 13:00:57.971 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/bufferWhen.d.ts'
2026-10-19T16:00:57.9762877Z 13:00:57.971 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/catchError.d.ts'
2026-10-19T16:00:57.9763178Z 13:00:57.971 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/combineLatestAll.d.ts'
2026-10-19T16:00:57.9763484Z 13:00:57.971 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/combineAll.d.ts'
2026-10-19T16:00:57.9763788Z 13:00:57.971 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/combineLatest.d.ts'
2026-10-19T16:00:57.9764210Z 13:00:57.971 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/combineLatestWith.d.ts'
2026-10-19T16:00:57.9764517Z 13:00:57.971 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/concat.d.ts'
2026-10-19T16:00:57.9764801Z 13:00:57.971 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/concatAll.d.ts'
2026-10-19T16:00:57.9765101Z 13:00:57.971 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/concatMap.d.ts'
2026-10-19T16:00:57.9765401Z 13:00:57.971 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/concatMapTo.d.ts'
2026-10-19T16:00:57.9765701Z 13:00:57.971 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/concatWith.d.ts'
2026-10-19T16:00:57.9765998Z 13:00:57.971 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/connect.d.ts'
2026-10-19T16:00:57.9766338Z 13:00:57.971 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/count.d.ts'
2026-10-19T16:00:57.9766636Z 13:00:57.971 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/debounce.d.ts'
2026-10-19T16:00:57.9766944Z 13:00:57.971 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/debounceTime.d.ts'
2026-10-19T16:00:57.9767249Z 13:00:57.971 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/defaultIfEmpty.d.ts'
2026-10-19T16:00:57.9767584Z 13:00:57.971 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/delay.d.ts'
2026-10-19T16:00:57.9767867Z 13:00:57.971 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/delayWhen.d.ts'
2026-10-19T16:00:57.9768171Z 13:00:57.971 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/dematerialize.d.ts'
2026-10-19T16:00:57.9768470Z 13:00:57.971 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/distinct.d.ts'
2026-10-19T16:00:57.9768780Z 13:00:57.971 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/distinctUntilChanged.d.ts'
2026-10-19T16:00:57.9769102Z 13:00:57.971 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/distinctUntilKeyChanged.d.ts'
2026-10-19T16:00:57.9769413Z 13:00:57.971 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/elementAt.d.ts'
2026-10-19T16:00:57.9769709Z 13:00:57.971 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/endWith.d.ts'
2026-10-19T16:00:57.9770003Z 13:00:57.971 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/every.d.ts'
2026-10-19T16:00:57.9770432Z 13:00:57.971 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/exhaustAll.d.ts'
2026-10-19T16:00:57.9770729Z 13:00:57.971 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/exhaust.d.ts'
2026-10-19T16:00:57.9771024Z 13:00:57.971 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/exhaustMap.d.ts'
2026-10-19T16:00:57.9771305Z 13:00:57.971 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/expand.d.ts'
2026-10-19T16:00:57.9771594Z 13:00:57.971 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/filter.d.ts'
2026-10-19T16:00:57.9771889Z 13:00:57.972 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/finalize.d.ts'
2026-10-19T16:00:57.9772179Z 13:00:57.972 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/find.d.ts'
2026-10-19T16:00:57.9772470Z 13:00:57.972 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/findIndex.d.ts'
2026-10-19T16:00:57.9772760Z 13:00:57.972 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/first.d.ts'
2026-10-19T16:00:57.9773049Z 13:00:57.972 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/Subject.d.ts'
2026-10-19T16:00:57.9773343Z 13:00:57.972 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/groupBy.d.ts'
2026-10-19T16:00:57.9773648Z 13:00:57.972 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/ignoreElements.d.ts'
2026-10-19T16:00:57.9774089Z 13:00:57.972 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/isEmpty.d.ts'
2026-10-19T16:00:57.9774378Z 13:00:57.972 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/last.d.ts'
2026-10-19T16:00:57.9774676Z 13:00:57.972 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/map.d.ts'
2026-10-19T16:00:57.9775007Z 13:00:57.972 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/mapTo.d.ts'
2026-10-19T16:00:57.9775298Z 13:00:57.972 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/Notification.d.ts'
2026-10-19T16:00:57.9775600Z 13:00:57.972 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/materialize.d.ts'
2026-10-19T16:00:57.9775898Z 13:00:57.972 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/max.d.ts'
2026-10-19T16:00:57.9776194Z 13:00:57.972 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/merge.d.ts'
2026-10-19T16:00:57.9776494Z 13:00:57.972 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/mergeAll.d.ts'
2026-10-19T16:00:57.9776797Z 13:00:57.972 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/mergeMap.d.ts'
2026-10-19T16:00:57.9777090Z 13:00:57.972 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/flatMap.d.ts'
2026-10-19T16:00:57.9777369Z 13:00:57.972 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/mergeMapTo.d.ts'
2026-10-19T16:00:57.9777667Z 13:00:57.972 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/mergeScan.d.ts'
2026-10-19T16:00:57.9777967Z 13:00:57.972 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/mergeWith.d.ts'
2026-10-19T16:00:57.9778258Z 13:00:57.972 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/min.d.ts'
2026-10-19T16:00:57.9778567Z 13:00:57.972 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/observable/ConnectableObservable.d.ts'
2026-10-19T16:00:57.9778872Z 13:00:57.972 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/multicast.d.ts'
2026-10-19T16:00:57.9779170Z 13:00:57.972 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/observeOn.d.ts'
2026-10-19T16:00:57.9779478Z 13:00:57.972 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/onErrorResumeNextWith.d.ts'
2026-10-19T16:00:57.9779783Z 13:00:57.972 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/pairwise.d.ts'
2026-10-19T16:00:57.9780077Z 13:00:57.972 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/partition.d.ts'
2026-10-19T16:00:57.9780367Z 13:00:57.972 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/pluck.d.ts'
2026-10-19T16:00:57.9780655Z 13:00:57.972 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/publish.d.ts'
2026-10-19T16:00:57.9780956Z 13:00:57.972 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/publishBehavior.d.ts'
2026-10-19T16:00:57.9781297Z 13:00:57.972 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/publishLast.d.ts'
2026-10-19T16:00:57.9781604Z 13:00:57.972 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/publishReplay.d.ts'
2026-10-19T16:00:57.9781900Z 13:00:57.972 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/race.d.ts'
2026-10-19T16:00:57.9782232Z 13:00:57.972 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/raceWith.d.ts'
2026-10-19T16:00:57.9782526Z 13:00:57.972 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/reduce.d.ts'
2026-10-19T16:00:57.9782821Z 13:00:57.972 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/repeat.d.ts'
2026-10-19T16:00:57.9783130Z 13:00:57.972 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/repeatWhen.d.ts'
2026-10-19T16:00:57.9783413Z 13:00:57.972 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/retry.d.ts'
2026-10-19T16:00:57.9783710Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/retryWhen.d.ts'
2026-10-19T16:00:57.9784074Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/refCount.d.ts'
2026-10-19T16:00:57.9784372Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/sample.d.ts'
2026-10-19T16:00:57.9784671Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/sampleTime.d.ts'
2026-10-19T16:00:57.9784969Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/scan.d.ts'
2026-10-19T16:00:57.9785269Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/sequenceEqual.d.ts'
2026-10-19T16:00:57.9785562Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/share.d.ts'
2026-10-19T16:00:57.9785867Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/shareReplay.d.ts'
2026-10-19T16:00:57.9786170Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/single.d.ts'
2026-10-19T16:00:57.9786457Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/skip.d.ts'
2026-10-19T16:00:57.9786755Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/skipLast.d.ts'
2026-10-19T16:00:57.9787060Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/skipUntil.d.ts'
2026-10-19T16:00:57.9787353Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/skipWhile.d.ts'
2026-10-19T16:00:57.9787659Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/startWith.d.ts'
2026-10-19T16:00:57.9787954Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/subscribeOn.d.ts'
2026-10-19T16:00:57.9788253Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/switchAll.d.ts'
2026-10-19T16:00:57.9788637Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/switchMap.d.ts'
2026-10-19T16:00:57.9788938Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/switchMapTo.d.ts'
2026-10-19T16:00:57.9789238Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/switchScan.d.ts'
2026-10-19T16:00:57.9789556Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/take.d.ts'
2026-10-19T16:00:57.9789850Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/takeLast.d.ts'
2026-10-19T16:00:57.9790147Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/takeUntil.d.ts'
2026-10-19T16:00:57.9790451Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/takeWhile.d.ts'
2026-10-19T16:00:57.9790744Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/tap.d.ts'
2026-10-19T16:00:57.9791036Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/throttle.d.ts'
2026-10-19T16:00:57.9791343Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/throttleTime.d.ts'
2026-10-19T16:00:57.9791648Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/throwIfEmpty.d.ts'
2026-10-19T16:00:57.9791946Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/timeInterval.d.ts'
2026-10-19T16:00:57.9792251Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/timeout.d.ts'
2026-10-19T16:00:57.9792535Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/timeoutWith.d.ts'
2026-10-19T16:00:57.9792831Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/timestamp.d.ts'
2026-10-19T16:00:57.9793126Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/toArray.d.ts'
2026-10-19T16:00:57.9793420Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/window.d.ts'
2026-10-19T16:00:57.9793714Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/windowCount.d.ts'
2026-10-19T16:00:57.9794124Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/windowTime.d.ts'
2026-10-19T16:00:57.9794430Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/windowToggle.d.ts'
2026-10-19T16:00:57.9794724Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/windowWhen.d.ts'
2026-10-19T16:00:57.9795025Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/withLatestFrom.d.ts'
2026-10-19T16:00:57.9795322Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/zip.d.ts'
2026-10-19T16:00:57.9795598Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/zipAll.d.ts'
2026-10-19T16:00:57.9795932Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/operators/zipWith.d.ts'
2026-10-19T16:00:57.9796216Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/operators/index.d.ts'
2026-10-19T16:00:57.9796504Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/scheduler/Action.d.ts'
2026-10-19T16:00:57.9796830Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/Scheduler.d.ts'
2026-10-19T16:00:57.9797128Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/testing/TestMessage.d.ts'
2026-10-19T16:00:57.9797426Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/testing/SubscriptionLog.d.ts'
2026-10-19T16:00:57.9797734Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/testing/SubscriptionLoggable.d.ts'
2026-10-19T16:00:57.9798036Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/testing/ColdObservable.d.ts'
2026-10-19T16:00:57.9798331Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/testing/HotObservable.d.ts'
2026-10-19T16:00:57.9798620Z 13:00:57.973 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/scheduler/AsyncScheduler.d.ts'
2026-10-19T16:00:57.9798921Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/scheduler/timerHandle.d.ts'
2026-10-19T16:00:57.9799220Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/scheduler/AsyncAction.d.ts'
2026-10-19T16:00:57.9799532Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/scheduler/VirtualTimeScheduler.d.ts'
2026-10-19T16:00:57.9799838Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/testing/TestScheduler.d.ts'
2026-10-19T16:00:57.9800123Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/testing/index.d.ts'
2026-10-19T16:00:57.9800415Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/symbol/observable.d.ts'
2026-10-19T16:00:57.9800721Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/observable/dom/animationFrames.d.ts'
2026-10-19T16:00:57.9801019Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/BehaviorSubject.d.ts'
2026-10-19T16:00:57.9801310Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/ReplaySubject.d.ts'
2026-10-19T16:00:57.9801586Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/AsyncSubject.d.ts'
2026-10-19T16:00:57.9801886Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/scheduler/AsapScheduler.d.ts'
2026-10-19T16:00:57.9802181Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/scheduler/asap.d.ts'
2026-10-19T16:00:57.9802470Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/scheduler/async.d.ts'
2026-10-19T16:00:57.9802767Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/scheduler/QueueScheduler.d.ts'
2026-10-19T16:00:57.9803108Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/scheduler/queue.d.ts'
2026-10-19T16:00:57.9803413Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/scheduler/AnimationFrameScheduler.d.ts'
2026-10-19T16:00:57.9803724Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/scheduler/animationFrame.d.ts'
2026-10-19T16:00:57.9804143Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/util/identity.d.ts'
2026-10-19T16:00:57.9804434Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/util/pipe.d.ts'
2026-10-19T16:00:57.9804711Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/util/noop.d.ts'
2026-10-19T16:00:57.9805011Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/util/isObservable.d.ts'
2026-10-19T16:00:57.9805303Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/lastValueFrom.d.ts'
2026-10-19T16:00:57.9805599Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/firstValueFrom.d.ts'
2026-10-19T16:00:57.9805904Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/util/ArgumentOutOfRangeError.d.ts'
2026-10-19T16:00:57.9806212Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/util/EmptyError.d.ts'
2026-10-19T16:00:57.9806511Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/util/NotFoundError.d.ts'
2026-10-19T16:00:57.9806822Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/util/ObjectUnsubscribedError.d.ts'
2026-10-19T16:00:57.9807126Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/util/SequenceError.d.ts'
2026-10-19T16:00:57.9807430Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/util/UnsubscriptionError.d.ts'
2026-10-19T16:00:57.9807727Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/observable/bindCallback.d.ts'
2026-10-19T16:00:57.9808036Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/observable/bindNodeCallback.d.ts'
2026-10-19T16:00:57.9808334Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/AnyCatcher.d.ts'
2026-10-19T16:00:57.9808728Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/observable/combineLatest.d.ts'
2026-10-19T16:00:57.9809027Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/observable/concat.d.ts'
2026-10-19T16:00:57.9809327Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/observable/connectable.d.ts'
2026-10-19T16:00:57.9809621Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/observable/defer.d.ts'
2026-10-19T16:00:57.9809914Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/observable/empty.d.ts'
2026-10-19T16:00:57.9810209Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/observable/forkJoin.d.ts'
2026-10-19T16:00:57.9810547Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/observable/from.d.ts'
2026-10-19T16:00:57.9810832Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/observable/fromEvent.d.ts'
2026-10-19T16:00:57.9811138Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/observable/fromEventPattern.d.ts'
2026-10-19T16:00:57.9811474Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/observable/generate.d.ts'
2026-10-19T16:00:57.9811765Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/observable/iif.d.ts'
2026-10-19T16:00:57.9812059Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/observable/interval.d.ts'
2026-10-19T16:00:57.9812353Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/observable/merge.d.ts'
2026-10-19T16:00:57.9812645Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/observable/never.d.ts'
2026-10-19T16:00:57.9812933Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/observable/of.d.ts'
2026-10-19T16:00:57.9813234Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/observable/onErrorResumeNext.d.ts'
2026-10-19T16:00:57.9813536Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/observable/pairs.d.ts'
2026-10-19T16:00:57.9813829Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/observable/partition.d.ts'
2026-10-19T16:00:57.9814185Z 13:00:57.974 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/observable/race.d.ts'
2026-10-19T16:00:57.9814478Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/observable/range.d.ts'
2026-10-19T16:00:57.9814776Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/observable/throwError.d.ts'
2026-10-19T16:00:57.9815075Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/observable/timer.d.ts'
2026-10-19T16:00:57.9815367Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/observable/using.d.ts'
2026-10-19T16:00:57.9815659Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/observable/zip.d.ts'
2026-10-19T16:00:57.9815954Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/scheduled/scheduled.d.ts'
2026-10-19T16:00:57.9816241Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/internal/config.d.ts'
2026-10-19T16:00:57.9816517Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/rxjs/dist/types/index.d.ts'
2026-10-19T16:00:57.9816775Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@angular/core/index.d.ts'
2026-10-19T16:00:57.9817062Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@angular/platform-browser-dynamic/index.d.ts'
2026-10-19T16:00:57.9817338Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@angular/common/index.d.ts'
2026-10-19T16:00:57.9817615Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@angular/platform-browser/index.d.ts'
2026-10-19T16:00:57.9817928Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@angular/router/index.d.ts'
2026-10-19T16:00:57.9818207Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@angular/common/http/index.d.ts'
2026-10-19T16:00:57.9818480Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@angular/forms/index.d.ts'
2026-10-19T16:00:57.9818759Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@angular/animations/index.d.ts'
2026-10-19T16:00:57.9819064Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@angular/cdk/portal/index.d.ts'
2026-10-19T16:00:57.9819326Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@angular/cdk/coercion/index.d.ts'
2026-10-19T16:00:57.9819605Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@angular/cdk/collections/index.d.ts'
2026-10-19T16:00:57.9819883Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@angular/cdk/bidi/index.d.ts'
2026-10-19T16:00:57.9820162Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@angular/cdk/platform/index.d.ts'
2026-10-19T16:00:57.9820441Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@angular/cdk/scrolling/index.d.ts'
2026-10-19T16:00:57.9820718Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@angular/cdk/overlay/index.d.ts'
2026-10-19T16:00:57.9820998Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@angular/cdk/observers/index.d.ts'
2026-10-19T16:00:57.9821273Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@angular/cdk/a11y/index.d.ts'
2026-10-19T16:00:57.9821545Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@angular/cdk/dialog/index.d.ts'
2026-10-19T16:00:57.9821807Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@angular/material/core/index.d.ts'
2026-10-19T16:00:57.9822091Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@angular/material/dialog/index.d.ts'
2026-10-19T16:00:57.9822400Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@angular/animations/browser/index.d.ts'
2026-10-19T16:00:57.9822704Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@angular/platform-browser/animations/index.d.ts'
2026-10-19T16:00:57.9822997Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@ng-select/ng-select/lib/console.service.d.ts'
2026-10-19T16:00:57.9823290Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@ng-select/ng-select/lib/ng-select.types.d.ts'
2026-10-19T16:00:57.9823586Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@ng-select/ng-select/lib/selection-model.d.ts'
2026-10-19T16:00:57.9823932Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@ng-select/ng-select/lib/items-list.d.ts'
2026-10-19T16:00:57.9824246Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@ng-select/ng-select/lib/ng-dropdown-panel.service.d.ts'
2026-10-19T16:00:57.9824559Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@ng-select/ng-select/lib/ng-dropdown-panel.component.d.ts'
2026-10-19T16:00:57.9824849Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@ng-select/ng-select/lib/ng-option.component.d.ts'
2026-10-19T16:00:57.9825141Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@ng-select/ng-select/lib/config.service.d.ts'
2026-10-19T16:00:57.9825478Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@ng-select/ng-select/lib/ng-select.component.d.ts'
2026-10-19T16:00:57.9825787Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@ng-select/ng-select/lib/ng-templates.directive.d.ts'
2026-10-19T16:00:57.9826082Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@ng-select/ng-select/lib/ng-select.module.d.ts'
2026-10-19T16:00:57.9826399Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@ng-select/ng-select/public-api.d.ts'
2026-10-19T16:00:57.9826679Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@ng-select/ng-select/index.d.ts'
2026-10-19T16:00:57.9826968Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/locale/locale.class.d.ts'
2026-10-19T16:00:57.9827261Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/moment/calendar.d.ts'
2026-10-19T16:00:57.9827539Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/duration/constructor.d.ts'
2026-10-19T16:00:57.9827828Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/testing/chain.d.ts'
2026-10-19T16:00:57.9828118Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/create/parsing.types.d.ts'
2026-10-19T16:00:57.9828472Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/types.d.ts'
2026-10-19T16:00:57.9828760Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/units/aliases.d.ts'
2026-10-19T16:00:57.9829047Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/units/constants.d.ts'
2026-10-19T16:00:57.9829339Z 13:00:57.975 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/units/day-of-month.d.ts'
2026-10-19T16:00:57.9829628Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/units/day-of-week.d.ts'
2026-10-19T16:00:57.9829920Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/units/day-of-year.d.ts'
2026-10-19T16:00:57.9830205Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/units/hour.d.ts'
2026-10-19T16:00:57.9830478Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/units/millisecond.d.ts'
2026-10-19T16:00:57.9830763Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/units/minute.d.ts'
2026-10-19T16:00:57.9831048Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/units/month.d.ts'
2026-10-19T16:00:57.9831333Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/units/offset.d.ts'
2026-10-19T16:00:57.9831619Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/units/priorities.d.ts'
2026-10-19T16:00:57.9831905Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/units/quarter.d.ts'
2026-10-19T16:00:57.9832191Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/units/second.d.ts'
2026-10-19T16:00:57.9832475Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/units/timestamp.d.ts'
2026-10-19T16:00:57.9832798Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/units/week.d.ts'
2026-10-19T16:00:57.9833093Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/units/week-calendar-utils.d.ts'
2026-10-19T16:00:57.9833374Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/units/week-year.d.ts'
2026-10-19T16:00:57.9833663Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/units/year.d.ts'
2026-10-19T16:00:57.9834071Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/units/index.d.ts'
2026-10-19T16:00:57.9834377Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/moment/add-subtract.d.ts'
2026-10-19T16:00:57.9834676Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/utils/date-getters.d.ts'
2026-10-19T16:00:57.9834973Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/create/local.d.ts'
2026-10-19T16:00:57.9835261Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/format.d.ts'
2026-10-19T16:00:57.9835548Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/locale/locales.d.ts'
2026-10-19T16:00:57.9835846Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/utils/date-compare.d.ts'
2026-10-19T16:00:57.9836124Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/utils/type-checks.d.ts'
2026-10-19T16:00:57.9836419Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/utils/date-setters.d.ts'
2026-10-19T16:00:57.9836715Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/utils/start-end-of.d.ts'
2026-10-19T16:00:57.9837001Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/ar.d.ts'
2026-10-19T16:00:57.9837282Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/bg.d.ts'
2026-10-19T16:00:57.9837564Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/ca.d.ts'
2026-10-19T16:00:57.9837845Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/cs.d.ts'
2026-10-19T16:00:57.9838117Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/da.d.ts'
2026-10-19T16:00:57.9838392Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/de.d.ts'
2026-10-19T16:00:57.9838658Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/en-gb.d.ts'
2026-10-19T16:00:57.9838940Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/es-do.d.ts'
2026-10-19T16:00:57.9839221Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/es.d.ts'
2026-10-19T16:00:57.9839509Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/es-pr.d.ts'
2026-10-19T16:00:57.9839791Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/es-us.d.ts'
2026-10-19T16:00:57.9840064Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/et.d.ts'
2026-10-19T16:00:57.9840385Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/fi.d.ts'
2026-10-19T16:00:57.9840658Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/fr.d.ts'
2026-10-19T16:00:57.9840928Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/gl.d.ts'
2026-10-19T16:00:57.9843528Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/he.d.ts'
2026-10-19T16:00:57.9843788Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/hi.d.ts'
2026-10-19T16:00:57.9844141Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/hu.d.ts'
2026-10-19T16:00:57.9844428Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/hr.d.ts'
2026-10-19T16:00:57.9844704Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/id.d.ts'
2026-10-19T16:00:57.9844980Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/it.d.ts'
2026-10-19T16:00:57.9845252Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/ja.d.ts'
2026-10-19T16:00:57.9845531Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/ka.d.ts'
2026-10-19T16:00:57.9845807Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/kk.d.ts'
2026-10-19T16:00:57.9846083Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/ko.d.ts'
2026-10-19T16:00:57.9846344Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/lt.d.ts'
2026-10-19T16:00:57.9846617Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/lv.d.ts'
2026-10-19T16:00:57.9846895Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/mn.d.ts'
2026-10-19T16:00:57.9847173Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/nb.d.ts'
2026-10-19T16:00:57.9847456Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/nl-be.d.ts'
2026-10-19T16:00:57.9847733Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/nl.d.ts'
2026-10-19T16:00:57.9848009Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/pl.d.ts'
2026-10-19T16:00:57.9848288Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/pt-br.d.ts'
2026-10-19T16:00:57.9848563Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/ro.d.ts'
2026-10-19T16:00:57.9848821Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/ru.d.ts'
2026-10-19T16:00:57.9849094Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/sk.d.ts'
2026-10-19T16:00:57.9849366Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/sl.d.ts'
2026-10-19T16:00:57.9849716Z 13:00:57.976 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/sq.d.ts'
2026-10-19T16:00:57.9850062Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/sv.d.ts'
2026-10-19T16:00:57.9850334Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/th.d.ts'
2026-10-19T16:00:57.9850612Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/th-be.d.ts'
2026-10-19T16:00:57.9850891Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/tr.d.ts'
2026-10-19T16:00:57.9851202Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/uk.d.ts'
2026-10-19T16:00:57.9851471Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/vi.d.ts'
2026-10-19T16:00:57.9851747Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/i18n/zh-cn.d.ts'
2026-10-19T16:00:57.9852028Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/public_api.d.ts'
2026-10-19T16:00:57.9852289Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/chronos/index.d.ts'
2026-10-19T16:00:57.9852573Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/datepicker/models/index.d.ts'
2026-10-19T16:00:57.9852889Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/datepicker/themes/bs/bs-custom-dates-view.component.d.ts'
2026-10-19T16:00:57.9853199Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/datepicker/bs-datepicker.config.d.ts'
2026-10-19T16:00:57.9853497Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/positioning/models/index.d.ts'
2026-10-19T16:00:57.9853792Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/positioning/ng-positioning.d.ts'
2026-10-19T16:00:57.9854173Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/positioning/positioning.service.d.ts'
2026-10-19T16:00:57.9854476Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/positioning/utils/checkMargin.d.ts'
2026-10-19T16:00:57.9854770Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/positioning/public_api.d.ts'
2026-10-19T16:00:57.9855052Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/positioning/index.d.ts'
2026-10-19T16:00:57.9855324Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/timepicker/models/index.d.ts'
2026-10-19T16:00:57.9855612Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/mini-ngrx/state.class.d.ts'
2026-10-19T16:00:57.9855896Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/mini-ngrx/store.class.d.ts'
2026-10-19T16:00:57.9856180Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/mini-ngrx/public_api.d.ts'
2026-10-19T16:00:57.9856456Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/mini-ngrx/index.d.ts'
2026-10-19T16:00:57.9856748Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/timepicker/timepicker.models.d.ts'
2026-10-19T16:00:57.9857053Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/timepicker/reducer/timepicker.actions.d.ts'
2026-10-19T16:00:57.9857398Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/timepicker/reducer/timepicker.reducer.d.ts'
2026-10-19T16:00:57.9857701Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/timepicker/reducer/timepicker.store.d.ts'
2026-10-19T16:00:57.9857984Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/timepicker/timepicker.config.d.ts'
2026-10-19T16:00:57.9858348Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/timepicker/timepicker.component.d.ts'
2026-10-19T16:00:57.9858736Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/timepicker/timepicker.module.d.ts'
2026-10-19T16:00:57.9859025Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/timepicker/public_api.d.ts'
2026-10-19T16:00:57.9859311Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/timepicker/index.d.ts'
2026-10-19T16:00:57.9859603Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/datepicker/bs-locale.service.d.ts'
2026-10-19T16:00:57.9859912Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/datepicker/reducer/bs-datepicker.actions.d.ts'
2026-10-19T16:00:57.9860228Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/datepicker/reducer/bs-datepicker.state.d.ts'
2026-10-19T16:00:57.9860539Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/datepicker/reducer/bs-datepicker.store.d.ts'
2026-10-19T16:00:57.9860844Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/datepicker/reducer/bs-datepicker.effects.d.ts'
2026-10-19T16:00:57.9861156Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/datepicker/base/bs-datepicker-container.d.ts'
2026-10-19T16:00:57.9861466Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/datepicker/themes/bs/bs-datepicker-container.component.d.ts'
2026-10-19T16:00:57.9861783Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/component-loader/bs-component-ref.class.d.ts'
2026-10-19T16:00:57.9862092Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/component-loader/listen-options.model.d.ts'
2026-10-19T16:00:57.9862400Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/component-loader/component-loader.class.d.ts'
2026-10-19T16:00:57.9862710Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/component-loader/component-loader.factory.d.ts'
2026-10-19T16:00:57.9863020Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/component-loader/content-ref.class.d.ts'
2026-10-19T16:00:57.9863318Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/component-loader/public_api.d.ts'
2026-10-19T16:00:57.9863612Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/component-loader/index.d.ts'
2026-10-19T16:00:57.9863972Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/datepicker/bs-datepicker.component.d.ts'
2026-10-19T16:00:57.9864291Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/datepicker/bs-datepicker-inline.config.d.ts'
2026-10-19T16:00:57.9864606Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/datepicker/themes/bs/bs-datepicker-inline-container.component.d.ts'
2026-10-19T16:00:57.9864976Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/datepicker/bs-datepicker-inline.component.d.ts'
2026-10-19T16:00:57.9865287Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/datepicker/bs-daterangepicker-inline.config.d.ts'
2026-10-19T16:00:57.9865618Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/datepicker/themes/bs/bs-daterangepicker-container.component.d.ts'
2026-10-19T16:00:57.9865994Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/datepicker/themes/bs/bs-daterangepicker-inline-container.component.d.ts'
2026-10-19T16:00:57.9866325Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/datepicker/bs-daterangepicker-inline.component.d.ts'
2026-10-19T16:00:57.9866639Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/datepicker/bs-datepicker-input.directive.d.ts'
2026-10-19T16:00:57.9866947Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/datepicker/bs-daterangepicker.config.d.ts'
2026-10-19T16:00:57.9867255Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/datepicker/bs-daterangepicker.component.d.ts'
2026-10-19T16:00:57.9867573Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/datepicker/bs-daterangepicker-input.directive.d.ts'
2026-10-19T16:00:57.9867895Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/datepicker/themes/bs/bs-calendar-layout.component.d.ts'
2026-10-19T16:00:57.9868220Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/datepicker/themes/bs/bs-current-date-view.component.d.ts'
2026-10-19T16:00:57.9868538Z 13:00:57.977 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/datepicker/themes/bs/bs-datepicker-day-decorator.directive.d.ts'
2026-10-19T16:00:57.9868878Z 13:00:57.978 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/datepicker/themes/bs/bs-datepicker-navigation-view.component.d.ts'
2026-10-19T16:00:57.9869208Z 13:00:57.978 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/datepicker/themes/bs/bs-days-calendar-view.component.d.ts'
2026-10-19T16:00:57.9869537Z 13:00:57.978 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/datepicker/themes/bs/bs-months-calendar-view.component.d.ts'
2026-10-19T16:00:57.9869863Z 13:00:57.978 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/datepicker/themes/bs/bs-timepicker-view.component.d.ts'
2026-10-19T16:00:57.9870187Z 13:00:57.978 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/datepicker/themes/bs/bs-years-calendar-view.component.d.ts'
2026-10-19T16:00:57.9870486Z 13:00:57.978 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/tooltip/tooltip.config.d.ts'
2026-10-19T16:00:57.9870771Z 13:00:57.978 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/utils/trigger.class.d.ts'
2026-10-19T16:00:57.9871051Z 13:00:57.978 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/utils/triggers.d.ts'
2026-10-19T16:00:57.9871335Z 13:00:57.978 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/utils/theme-provider.d.ts'
2026-10-19T16:00:57.9871623Z 13:00:57.978 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/utils/linked-list.class.d.ts'
2026-10-19T16:00:57.9871928Z 13:00:57.978 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/utils/decorators.d.ts'
2026-10-19T16:00:57.9872208Z 13:00:57.978 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/utils/utils.class.d.ts'
2026-10-19T16:00:57.9872490Z 13:00:57.978 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/utils/facade/browser.d.ts'
2026-10-19T16:00:57.9872769Z 13:00:57.978 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/utils/warn-once.d.ts'
2026-10-19T16:00:57.9873072Z 13:00:57.978 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/utils/public_api.d.ts'
2026-10-19T16:00:57.9873346Z 13:00:57.978 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/utils/index.d.ts'
2026-10-19T16:00:57.9873641Z 13:00:57.978 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/tooltip/tooltip-container.component.d.ts'
2026-10-19T16:00:57.9874041Z 13:00:57.978 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/tooltip/tooltip.directive.d.ts'
2026-10-19T16:00:57.9874347Z 13:00:57.978 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/tooltip/tooltip.module.d.ts'
2026-10-19T16:00:57.9874615Z 13:00:57.978 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/tooltip/public_api.d.ts'
2026-10-19T16:00:57.9874893Z 13:00:57.978 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/tooltip/index.d.ts'
2026-10-19T16:00:57.9875184Z 13:00:57.978 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/datepicker/bs-datepicker.module.d.ts'
2026-10-19T16:00:57.9875475Z 13:00:57.978 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/datepicker/public_api.d.ts'
2026-10-19T16:00:57.9876869Z 13:00:57.978 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-bootstrap/datepicker/index.d.ts'
2026-10-19T16:00:57.9877173Z 13:00:57.978 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-mask/lib/ngx-mask.config.d.ts'
2026-10-19T16:00:57.9877456Z 13:00:57.978 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-mask/lib/ngx-mask.providers.d.ts'
2026-10-19T16:00:57.9877739Z 13:00:57.978 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-mask/lib/custom-keyboard-event.d.ts'
2026-10-19T16:00:57.9878029Z 13:00:57.978 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-mask/lib/ngx-mask-applier.service.d.ts'
2026-10-19T16:00:57.9878297Z 13:00:57.978 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-mask/lib/ngx-mask.service.d.ts'
2026-10-19T16:00:57.9878576Z 13:00:57.978 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-mask/lib/ngx-mask.directive.d.ts'
2026-10-19T16:00:57.9878857Z 13:00:57.978 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-mask/lib/ngx-mask.pipe.d.ts'
2026-10-19T16:00:57.9879123Z 13:00:57.978 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-mask/index.d.ts'
2026-10-19T16:00:57.9879405Z 13:00:57.978 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-pagination/lib/pagination-instance.d.ts'
2026-10-19T16:00:57.9879698Z 13:00:57.978 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-pagination/lib/pagination.service.d.ts'
2026-10-19T16:00:57.9879980Z 13:00:57.978 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-pagination/lib/paginate.pipe.d.ts'
2026-10-19T16:00:57.9880276Z 13:00:57.978 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-pagination/lib/pagination-controls.component.d.ts'
2026-10-19T16:00:57.9880631Z 13:00:57.978 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-pagination/lib/pagination-controls.directive.d.ts'
2026-10-19T16:00:57.9880927Z 13:00:57.978 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-pagination/lib/ngx-pagination.module.d.ts'
2026-10-19T16:00:57.9881195Z 13:00:57.978 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-pagination/public-api.d.ts'
2026-10-19T16:00:57.9881508Z 13:00:57.978 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/ngx-pagination/ngx-pagination.d.ts'
2026-10-19T16:00:57.9881791Z 13:00:57.978 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@angular/core/rxjs-interop/index.d.ts'
2026-10-19T16:00:57.9882096Z 13:00:57.978 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/enums/tipo-cliente.enum.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:57.9882377Z 13:00:57.978 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/enums/tipo-cliente.enum.ts
2026-10-19T16:00:57.9882660Z 13:00:57.986 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/enums/tipo-cliente.enum.ts" with linterId "default"
2026-10-19T16:00:58.3399184Z 13:00:58.339 DEBUG: Not enough content in 'src/app/enums/tipo-cliente.enum.ts' to have CPD blocks, it will not be part of the duplication detection
2026-10-19T16:00:58.3399665Z 13:00:58.339 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/enums/tipo-cliente.enum.ts' containing 0 file(s)
2026-10-19T16:00:58.3403262Z 13:00:58.340 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/enums/tipo-cliente.enum.ts'
2026-10-19T16:00:58.3409393Z 13:00:58.340 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/enums/tipo-cliente.enum.ts'
2026-10-19T16:00:58.3412074Z 13:00:58.341 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/api-response.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:58.3412379Z 13:00:58.341 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/api-response.model.ts
2026-10-19T16:00:58.3437364Z 13:00:58.343 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/api-response.model.ts" with linterId "default"
2026-10-19T16:00:58.3593328Z 13:00:58.358 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/api-response.model.ts' containing 0 file(s)
2026-10-19T16:00:58.3594029Z 13:00:58.358 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/api-response.model.ts'
2026-10-19T16:00:58.3595034Z 13:00:58.359 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/api-response.model.ts'
2026-10-19T16:00:58.3598916Z 13:00:58.359 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/consultas-cadastrais/response-receita-pj.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:58.3599308Z 13:00:58.359 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/consultas-cadastrais/response-receita-pj.model.ts
2026-10-19T16:00:58.3620811Z 13:00:58.361 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/consultas-cadastrais/response-receita-pj.model.ts" with linterId "default"
2026-10-19T16:00:58.3826236Z 13:00:58.379 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/consultas-cadastrais/response-receita-pj.model.ts' containing 0 file(s)
2026-10-19T16:00:58.3826775Z 13:00:58.380 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/consultas-cadastrais/response-receita-pj.model.ts'
2026-10-19T16:00:58.3827429Z 13:00:58.381 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/consultas-cadastrais/response-receita-pj.model.ts'
2026-10-19T16:00:58.3827820Z 13:00:58.381 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/consultas-cadastrais/response-validacao-sicli.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:58.3828195Z 13:00:58.381 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/consultas-cadastrais/response-validacao-sicli.model.ts
2026-10-19T16:00:58.3833359Z 13:00:58.383 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/consultas-cadastrais/response-validacao-sicli.model.ts" with linterId "default"
2026-10-19T16:00:58.3919712Z 13:00:58.391 DEBUG: Not enough content in 'src/app/models/consultas-cadastrais/response-validacao-sicli.model.ts' to have CPD blocks, it will not be part of the duplication detection
2026-10-19T16:00:58.3928013Z 13:00:58.391 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/consultas-cadastrais/response-validacao-sicli.model.ts' containing 0 file(s)
2026-10-19T16:00:58.3928635Z 13:00:58.392 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/consultas-cadastrais/response-validacao-sicli.model.ts'
2026-10-19T16:00:58.3931601Z 13:00:58.393 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/consultas-cadastrais/response-validacao-sicli.model.ts'
2026-10-19T16:00:58.3933536Z 13:00:58.393 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/environments/environment.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:58.3933907Z 13:00:58.393 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/environments/environment.ts
2026-10-19T16:00:58.3950388Z 13:00:58.394 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/environments/environment.ts" with linterId "default"
2026-10-19T16:00:58.5584892Z 13:00:58.558 DEBUG: Saving issue for rule no-commented-code on line 5
2026-10-19T16:00:58.5589763Z 13:00:58.558 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/environments/environment.ts' containing 0 file(s)
2026-10-19T16:00:58.5594000Z 13:00:58.559 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/environments/environment.ts'
2026-10-19T16:00:58.5598650Z 13:00:58.559 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/environments/environment.ts'
2026-10-19T16:00:58.5605584Z 13:00:58.559 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/enums/consultas-cadastrais/consultas-cadastrais.enum.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:58.5606959Z 13:00:58.559 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/enums/consultas-cadastrais/consultas-cadastrais.enum.ts
2026-10-19T16:00:58.5616750Z 13:00:58.561 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/enums/consultas-cadastrais/consultas-cadastrais.enum.ts" with linterId "default"
2026-10-19T16:00:58.5738482Z 13:00:58.573 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/enums/consultas-cadastrais/consultas-cadastrais.enum.ts' containing 0 file(s)
2026-10-19T16:00:58.5741299Z 13:00:58.574 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/enums/consultas-cadastrais/consultas-cadastrais.enum.ts'
2026-10-19T16:00:58.5746897Z 13:00:58.574 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/enums/consultas-cadastrais/consultas-cadastrais.enum.ts'
2026-10-19T16:00:58.5748470Z 13:00:58.574 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/consultas-cadastrais/consulta-cadastral-impeditivos.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:58.5749053Z 13:00:58.574 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/consultas-cadastrais/consulta-cadastral-impeditivos.model.ts
2026-10-19T16:00:58.5763804Z 13:00:58.576 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/consultas-cadastrais/consulta-cadastral-impeditivos.model.ts" with linterId "default"
2026-10-19T16:00:58.5859565Z 13:00:58.585 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/consultas-cadastrais/consulta-cadastral-impeditivos.model.ts' containing 0 file(s)
2026-10-19T16:00:58.5861459Z 13:00:58.586 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/consultas-cadastrais/consulta-cadastral-impeditivos.model.ts'
2026-10-19T16:00:58.5866574Z 13:00:58.586 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/consultas-cadastrais/consulta-cadastral-impeditivos.model.ts'
2026-10-19T16:00:58.5867937Z 13:00:58.586 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/receita-pessoa-fisica.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:58.5868476Z 13:00:58.586 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/receita-pessoa-fisica.model.ts
2026-10-19T16:00:58.5884802Z 13:00:58.588 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/receita-pessoa-fisica.model.ts" with linterId "default"
2026-10-19T16:00:58.6007652Z 13:00:58.600 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/receita-pessoa-fisica.model.ts' containing 0 file(s)
2026-10-19T16:00:58.6009929Z 13:00:58.600 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/receita-pessoa-fisica.model.ts'
2026-10-19T16:00:58.6016434Z 13:00:58.601 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/receita-pessoa-fisica.model.ts'
2026-10-19T16:00:58.6017495Z 13:00:58.601 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/consultas-cadastrais/consulta-cadastral.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:58.6018030Z 13:00:58.601 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/consultas-cadastrais/consulta-cadastral.model.ts
2026-10-19T16:00:58.6039366Z 13:00:58.603 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/consultas-cadastrais/consulta-cadastral.model.ts" with linterId "default"
2026-10-19T16:00:58.7865893Z 13:00:58.786 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/consultas-cadastrais/consulta-cadastral.model.ts' containing 0 file(s)
2026-10-19T16:00:58.7867650Z 13:00:58.786 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/consultas-cadastrais/consulta-cadastral.model.ts'
2026-10-19T16:00:58.7904658Z 13:00:58.790 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/consultas-cadastrais/consulta-cadastral.model.ts'
2026-10-19T16:00:58.7905761Z 13:00:58.790 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/consultas-cadastrais/validacao-impeditiva.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:58.7906669Z 13:00:58.790 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/consultas-cadastrais/validacao-impeditiva.model.ts
2026-10-19T16:00:58.7925593Z 13:00:58.792 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/consultas-cadastrais/validacao-impeditiva.model.ts" with linterId "default"
2026-10-19T16:00:58.8011458Z 13:00:58.800 DEBUG: Not enough content in 'src/app/models/consultas-cadastrais/validacao-impeditiva.model.ts' to have CPD blocks, it will not be part of the duplication detection
2026-10-19T16:00:58.8012170Z 13:00:58.800 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/consultas-cadastrais/validacao-impeditiva.model.ts' containing 0 file(s)
2026-10-19T16:00:58.8014226Z 13:00:58.801 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/consultas-cadastrais/validacao-impeditiva.model.ts'
2026-10-19T16:00:58.8017738Z 13:00:58.801 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/consultas-cadastrais/validacao-impeditiva.model.ts'
2026-10-19T16:00:58.8019720Z 13:00:58.801 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/single-spa/webpack-public-path.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:58.8020315Z 13:00:58.801 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/single-spa/webpack-public-path.ts
2026-10-19T16:00:58.8041221Z 13:00:58.803 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/single-spa/webpack-public-path.ts" with linterId "default"
2026-10-19T16:00:58.8121946Z 13:00:58.811 DEBUG: Not enough content in 'src/single-spa/webpack-public-path.ts' to have CPD blocks, it will not be part of the duplication detection
2026-10-19T16:00:58.8129610Z 13:00:58.811 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/single-spa/webpack-public-path.ts' containing 0 file(s)
2026-10-19T16:00:58.8149849Z 13:00:58.812 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/single-spa/webpack-public-path.ts'
2026-10-19T16:00:58.8191093Z 13:00:58.812 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/single-spa/webpack-public-path.ts'
2026-10-19T16:00:58.8191475Z 13:00:58.812 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/dados-storage.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:58.8191786Z 13:00:58.812 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/dados-storage.model.ts
2026-10-19T16:00:58.8192077Z 13:00:58.814 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/dados-storage.model.ts" with linterId "default"
2026-10-19T16:00:58.8253667Z 13:00:58.820 DEBUG: Not enough content in 'src/app/models/dados-storage.model.ts' to have CPD blocks, it will not be part of the duplication detection
2026-10-19T16:00:58.8254211Z 13:00:58.820 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/dados-storage.model.ts' containing 0 file(s)
2026-10-19T16:00:58.8254611Z 13:00:58.821 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/dados-storage.model.ts'
2026-10-19T16:00:58.8254983Z 13:00:58.821 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/dados-storage.model.ts'
2026-10-19T16:00:58.8255346Z 13:00:58.821 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/services/storage.service.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:58.8255633Z 13:00:58.821 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/services/storage.service.ts
2026-10-19T16:00:58.8255963Z 13:00:58.823 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/services/storage.service.ts" with linterId "default"
2026-10-19T16:00:58.8595176Z 13:00:58.859 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/storage.service.ts' containing 0 file(s)
2026-10-19T16:00:58.8596657Z 13:00:58.859 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/storage.service.ts'
2026-10-19T16:00:58.8625795Z 13:00:58.860 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/storage.service.ts'
2026-10-19T16:00:58.8626649Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sipnc-componentes/lib/components/stepper/stepper-orientation.d.ts'
2026-10-19T16:00:58.8627020Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sipnc-componentes/lib/components/stepper/stepper-component/stepper-item.d.ts'
2026-10-19T16:00:58.8627383Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sipnc-componentes/lib/components/stepper/stepper-component/stepper.component.d.ts'
2026-10-19T16:00:58.8627797Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sipnc-componentes/lib/components/stepper/stepper-directive.d.ts'
2026-10-19T16:00:58.8628136Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sipnc-componentes/lib/components/stepper/tabber-component/tabber-item.d.ts'
2026-10-19T16:00:58.8628487Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sipnc-componentes/lib/components/stepper/tabber-component/tabber.component.d.ts'
2026-10-19T16:00:58.8628837Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sipnc-componentes/lib/components/stepper/stepper.module.d.ts'
2026-10-19T16:00:58.8629167Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sipnc-componentes/lib/components/pick-list-items/pick-list-items.model.d.ts'
2026-10-19T16:00:58.8629511Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sipnc-componentes/lib/components/pick-list-items/pick-list-items.component.d.ts'
2026-10-19T16:00:58.8629814Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@angular/material/icon/index.d.ts'
2026-10-19T16:00:58.8630099Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@angular/cdk/text-field/index.d.ts'
2026-10-19T16:00:58.8630393Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@angular/material/form-field/index.d.ts'
2026-10-19T16:00:58.8630672Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@angular/material/input/index.d.ts'
2026-10-19T16:00:58.8630949Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@angular/material/tooltip/index.d.ts'
2026-10-19T16:00:58.8631271Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sipnc-componentes/lib/components/pick-list-items/pick-list-items.module.d.ts'
2026-10-19T16:00:58.8631593Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sipnc-componentes/lib/components/list-box-items/list-box-items.model.d.ts'
2026-10-19T16:00:58.8631928Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sipnc-componentes/lib/components/list-box-items/list-box-items.component.d.ts'
2026-10-19T16:00:58.8632263Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sipnc-componentes/lib/components/list-box-items/list-box-items.module.d.ts'
2026-10-19T16:00:58.8632589Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sipnc-componentes/lib/components/tab-navigation/tab-navigation.model.d.ts'
2026-10-19T16:00:58.8632920Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sipnc-componentes/lib/components/tab-navigation/tab-navigation.component.d.ts'
2026-10-19T16:00:58.8633250Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sipnc-componentes/lib/components/tab-navigation/tab-navigation.module.d.ts'
2026-10-19T16:00:58.8633568Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sipnc-componentes/lib/components/modal/modal-options-model.d.ts'
2026-10-19T16:00:58.8634012Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sipnc-componentes/lib/components/modal/modal-alerta/modal-alerta.component.d.ts'
2026-10-19T16:00:58.8634376Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sipnc-componentes/lib/components/modal/modal-confirmacao/modal-confirmacao.component.d.ts'
2026-10-19T16:00:58.8634702Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sipnc-componentes/lib/components/modal/modal.module.d.ts'
2026-10-19T16:00:58.8635053Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sipnc-componentes/lib/components/modal/modal-message.service.d.ts'
2026-10-19T16:00:58.8635342Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/jquery/JQueryStatic.d.ts'
2026-10-19T16:00:58.8635612Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/jquery/JQuery.d.ts'
2026-10-19T16:00:58.8635883Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/jquery/misc.d.ts'
2026-10-19T16:00:58.8636152Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/jquery/legacy.d.ts'
2026-10-19T16:00:58.8636419Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/jquery/index.d.ts'
2026-10-19T16:00:58.8636694Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/datatables.net/index.d.ts'
2026-10-19T16:00:58.8636985Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/angular-datatables/src/models/settings.d.ts'
2026-10-19T16:00:58.8637290Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/angular-datatables/src/angular-datatables.directive.d.ts'
2026-10-19T16:00:58.8637602Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/angular-datatables/src/angular-datatables.module.d.ts'
2026-10-19T16:00:58.8637889Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/angular-datatables/index.d.ts'
2026-10-19T16:00:58.8638181Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sipnc-componentes/lib/components/datatable/datatable-definitions.d.ts'
2026-10-19T16:00:58.8638504Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sipnc-componentes/lib/components/datatable/datatable.component.d.ts'
2026-10-19T16:00:58.8638825Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sipnc-componentes/lib/components/datatable/datatable.module.d.ts'
2026-10-19T16:00:58.8639115Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/moment/ts3.1-typings/moment.d.ts'
2026-10-19T16:00:58.8639402Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sipnc-componentes/lib/utils/utils.d.ts'
2026-10-19T16:00:58.8639688Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sipnc-componentes/lib/utils/constants.d.ts'
2026-10-19T16:00:58.8639987Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sipnc-componentes/lib/utils/mask-constants.d.ts'
2026-10-19T16:00:58.8640286Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sipnc-componentes/lib/parcels/submfe/SubMFE.d.ts'
2026-10-19T16:00:58.8640591Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sipnc-componentes/lib/parcels/submfe/submfe.component.d.ts'
2026-10-19T16:00:58.8640897Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sipnc-componentes/lib/parcels/submfe/submfe.module.d.ts'
2026-10-19T16:00:58.8641268Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sipnc-componentes/lib/components/button-control/button-control/button-control-checked-event.d.ts'
2026-10-19T16:00:58.8641626Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sipnc-componentes/lib/components/button-control/button-control/button-control.component.d.ts'
2026-10-19T16:00:58.8641965Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sipnc-componentes/lib/components/button-control/button-control.module.d.ts'
2026-10-19T16:00:58.8642325Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sipnc-componentes/lib/components/card-button/cx-card-button-check-event.d.ts'
2026-10-19T16:00:58.8642654Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sipnc-componentes/lib/components/card-button/cx-card-button-model.d.ts'
2026-10-19T16:00:58.8642984Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sipnc-componentes/lib/components/card-button/cx-card-button.component.d.ts'
2026-10-19T16:00:58.8643309Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sipnc-componentes/lib/components/card-button/cx-card-button.module.d.ts'
2026-10-19T16:00:58.8643603Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sipnc-componentes/public-api.d.ts'
2026-10-19T16:00:58.8644040Z 13:00:58.860 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sipnc-componentes/index.d.ts'
2026-10-19T16:00:58.8644506Z 13:00:58.861 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/enums/tipo-meio-comunicacao.enum.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:58.8644913Z 13:00:58.861 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/enums/tipo-meio-comunicacao.enum.ts
2026-10-19T16:00:58.8700225Z 13:00:58.864 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/enums/tipo-meio-comunicacao.enum.ts" with linterId "default"
2026-10-19T16:00:58.8734833Z 13:00:58.871 DEBUG: Not enough content in 'src/app/enums/tipo-meio-comunicacao.enum.ts' to have CPD blocks, it will not be part of the duplication detection
2026-10-19T16:00:58.8735449Z 13:00:58.871 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/enums/tipo-meio-comunicacao.enum.ts' containing 0 file(s)
2026-10-19T16:00:58.8735882Z 13:00:58.872 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/enums/tipo-meio-comunicacao.enum.ts'
2026-10-19T16:00:58.8736259Z 13:00:58.872 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/enums/tipo-meio-comunicacao.enum.ts'
2026-10-19T16:00:58.8736647Z 13:00:58.872 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/props-abertura-conta-form.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:58.8736959Z 13:00:58.872 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/props-abertura-conta-form.model.ts
2026-10-19T16:00:58.8746002Z 13:00:58.874 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/props-abertura-conta-form.model.ts" with linterId "default"
2026-10-19T16:00:58.8985236Z 13:00:58.897 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/props-abertura-conta-form.model.ts' containing 0 file(s)
2026-10-19T16:00:58.8985725Z 13:00:58.898 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/props-abertura-conta-form.model.ts'
2026-10-19T16:00:58.9026755Z 13:00:58.899 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/props-abertura-conta-form.model.ts'
2026-10-19T16:00:58.9027466Z 13:00:58.899 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/response-consulta-sicli.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:58.9027760Z 13:00:58.899 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/response-consulta-sicli.model.ts
2026-10-19T16:00:58.9028063Z 13:00:58.901 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/response-consulta-sicli.model.ts" with linterId "default"
2026-10-19T16:00:58.9478186Z 13:00:58.947 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-consulta-sicli.model.ts' containing 0 file(s)
2026-10-19T16:00:58.9479066Z 13:00:58.947 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-consulta-sicli.model.ts'
2026-10-19T16:00:58.9496404Z 13:00:58.949 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-consulta-sicli.model.ts'
2026-10-19T16:00:58.9498107Z 13:00:58.949 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/response-relatorios-base64.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:58.9499069Z 13:00:58.949 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/response-relatorios-base64.model.ts
2026-10-19T16:00:58.9519294Z 13:00:58.951 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/response-relatorios-base64.model.ts" with linterId "default"
2026-10-19T16:00:58.9609248Z 13:00:58.960 DEBUG: Not enough content in 'src/app/models/response-relatorios-base64.model.ts' to have CPD blocks, it will not be part of the duplication detection
2026-10-19T16:00:58.9609711Z 13:00:58.960 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-relatorios-base64.model.ts' containing 0 file(s)
2026-10-19T16:00:58.9610131Z 13:00:58.960 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-relatorios-base64.model.ts'
2026-10-19T16:00:58.9611897Z 13:00:58.961 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-relatorios-base64.model.ts'
2026-10-19T16:00:58.9613415Z 13:00:58.961 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/shared/utils/mocks/logradouro.mock.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:58.9613735Z 13:00:58.961 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/shared/utils/mocks/logradouro.mock.ts
2026-10-19T16:00:58.9632130Z 13:00:58.963 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/shared/utils/mocks/logradouro.mock.ts" with linterId "default"
2026-10-19T16:00:59.0536367Z 13:00:59.045 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/utils/mocks/logradouro.mock.ts' containing 0 file(s)
2026-10-19T16:00:59.0536846Z 13:00:59.046 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/utils/mocks/logradouro.mock.ts'
2026-10-19T16:00:59.0537227Z 13:00:59.049 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/utils/mocks/logradouro.mock.ts'
2026-10-19T16:00:59.0537591Z 13:00:59.049 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/documento-constitutivo.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:59.0537910Z 13:00:59.049 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/documento-constitutivo.model.ts
2026-10-19T16:00:59.0538209Z 13:00:59.051 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/documento-constitutivo.model.ts" with linterId "default"
2026-10-19T16:00:59.0707365Z 13:00:59.070 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/documento-constitutivo.model.ts' containing 0 file(s)
2026-10-19T16:00:59.0709625Z 13:00:59.070 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/documento-constitutivo.model.ts'
2026-10-19T16:00:59.0715012Z 13:00:59.071 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/documento-constitutivo.model.ts'
2026-10-19T16:00:59.0716045Z 13:00:59.071 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/enums/tipo-movimentacao.enum.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:59.0716635Z 13:00:59.071 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/enums/tipo-movimentacao.enum.ts
2026-10-19T16:00:59.0733789Z 13:00:59.073 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/enums/tipo-movimentacao.enum.ts" with linterId "default"
2026-10-19T16:00:59.0845217Z 13:00:59.083 DEBUG: Not enough content in 'src/app/enums/tipo-movimentacao.enum.ts' to have CPD blocks, it will not be part of the duplication detection
2026-10-19T16:00:59.0845660Z 13:00:59.084 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/enums/tipo-movimentacao.enum.ts' containing 0 file(s)
2026-10-19T16:00:59.0846083Z 13:00:59.084 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/enums/tipo-movimentacao.enum.ts'
2026-10-19T16:00:59.0848603Z 13:00:59.084 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/enums/tipo-movimentacao.enum.ts'
2026-10-19T16:00:59.0850074Z 13:00:59.084 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/enums/tipo-endereco.enum.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:59.0850367Z 13:00:59.084 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/enums/tipo-endereco.enum.ts
2026-10-19T16:00:59.0865189Z 13:00:59.086 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/enums/tipo-endereco.enum.ts" with linterId "default"
2026-10-19T16:00:59.0924375Z 13:00:59.092 DEBUG: Not enough content in 'src/app/enums/tipo-endereco.enum.ts' to have CPD blocks, it will not be part of the duplication detection
2026-10-19T16:00:59.0924771Z 13:00:59.092 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/enums/tipo-endereco.enum.ts' containing 0 file(s)
2026-10-19T16:00:59.0927794Z 13:00:59.092 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/enums/tipo-endereco.enum.ts'
2026-10-19T16:00:59.0931207Z 13:00:59.093 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/enums/tipo-endereco.enum.ts'
2026-10-19T16:00:59.0932751Z 13:00:59.093 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/modalidade.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:59.0933048Z 13:00:59.093 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/modalidade.model.ts
2026-10-19T16:00:59.0946241Z 13:00:59.094 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/modalidade.model.ts" with linterId "default"
2026-10-19T16:00:59.1072255Z 13:00:59.106 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/modalidade.model.ts' containing 0 file(s)
2026-10-19T16:00:59.1075599Z 13:00:59.107 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/modalidade.model.ts'
2026-10-19T16:00:59.1080608Z 13:00:59.107 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/modalidade.model.ts'
2026-10-19T16:00:59.1082070Z 13:00:59.108 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/shared/utils/utils.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:59.1082612Z 13:00:59.108 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/shared/utils/utils.ts
2026-10-19T16:00:59.1094646Z 13:00:59.109 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/shared/utils/utils.ts" with linterId "default"
2026-10-19T16:00:59.3276563Z 13:00:59.327 DEBUG: Saving issue for rule no-dead-store on line 121
2026-10-19T16:00:59.3278037Z 13:00:59.327 DEBUG: Saving issue for rule no-misleading-array-reverse on line 139
2026-10-19T16:00:59.3280172Z 13:00:59.327 DEBUG: Saving issue for rule no-nested-conditional on line 140
2026-10-19T16:00:59.3281795Z 13:00:59.328 DEBUG: Saving issue for rule concise-regex on line 287
2026-10-19T16:00:59.3282065Z 13:00:59.328 DEBUG: Saving issue for rule no-misleading-array-reverse on line 327
2026-10-19T16:00:59.3299786Z 13:00:59.329 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/utils/utils.ts' containing 0 file(s)
2026-10-19T16:00:59.3303113Z 13:00:59.330 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/utils/utils.ts'
2026-10-19T16:00:59.3324371Z 13:00:59.332 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/utils/utils.ts'
2026-10-19T16:00:59.3325359Z 13:00:59.332 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/mensagem-fim-fluxo.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:59.3325687Z 13:00:59.332 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/mensagem-fim-fluxo.model.ts
2026-10-19T16:00:59.3348537Z 13:00:59.334 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/mensagem-fim-fluxo.model.ts" with linterId "default"
2026-10-19T16:00:59.3416761Z 13:00:59.341 DEBUG: Not enough content in 'src/app/models/mensagem-fim-fluxo.model.ts' to have CPD blocks, it will not be part of the duplication detection
2026-10-19T16:00:59.3417220Z 13:00:59.341 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/mensagem-fim-fluxo.model.ts' containing 0 file(s)
2026-10-19T16:00:59.3435210Z 13:00:59.341 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/mensagem-fim-fluxo.model.ts'
2026-10-19T16:00:59.3435643Z 13:00:59.342 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/mensagem-fim-fluxo.model.ts'
2026-10-19T16:00:59.3436002Z 13:00:59.342 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-button/dsc-button.component.d.ts'
2026-10-19T16:00:59.3436309Z 13:00:59.342 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-button/public-api.d.ts'
2026-10-19T16:00:59.3437538Z 13:00:59.342 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-button/index.d.ts'
2026-10-19T16:00:59.3437867Z 13:00:59.342 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-dialog/shared/dsc-dialog-data.d.ts'
2026-10-19T16:00:59.3438172Z 13:00:59.342 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-dialog/shared/dsc-dialog-config.d.ts'
2026-10-19T16:00:59.3438486Z 13:00:59.342 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-dialog/dsc-dialog.component.d.ts'
2026-10-19T16:00:59.3438806Z 13:00:59.342 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-dialog/shared/dsc-dialog.service.d.ts'
2026-10-19T16:00:59.3439097Z 13:00:59.342 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@angular/cdk/layout/index.d.ts'
2026-10-19T16:00:59.3439398Z 13:00:59.342 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-tooltip/dsc-tooltip.component.d.ts'
2026-10-19T16:00:59.3439922Z 13:00:59.342 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-tooltip/dsc-tooltip.directive.d.ts'
2026-10-19T16:00:59.3440235Z 13:00:59.342 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-tooltip/dsc-tooltip.module.d.ts'
2026-10-19T16:00:59.3440542Z 13:00:59.342 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-tooltip/public-api.d.ts'
2026-10-19T16:00:59.3440917Z 13:00:59.342 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-tooltip/index.d.ts'
2026-10-19T16:00:59.3441217Z 13:00:59.342 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-dialog/dsc-dialog.module.d.ts'
2026-10-19T16:00:59.3441512Z 13:00:59.342 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-dialog/public-api.d.ts'
2026-10-19T16:00:59.3441793Z 13:00:59.342 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-dialog/index.d.ts'
2026-10-19T16:00:59.3442105Z 13:00:59.342 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/services/dialog.service.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:59.3442388Z 13:00:59.342 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/services/dialog.service.ts
2026-10-19T16:00:59.3442662Z 13:00:59.343 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/services/dialog.service.ts" with linterId "default"
2026-10-19T16:00:59.4074503Z 13:00:59.407 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/dialog.service.ts' containing 0 file(s)
2026-10-19T16:00:59.4076366Z 13:00:59.407 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/dialog.service.ts'
2026-10-19T16:00:59.4085797Z 13:00:59.408 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/dialog.service.ts'
2026-10-19T16:00:59.4086154Z 13:00:59.408 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@angular/cdk/stepper/index.d.ts'
2026-10-19T16:00:59.4086458Z 13:00:59.408 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@angular/material/stepper/index.d.ts'
2026-10-19T16:00:59.4086788Z 13:00:59.408 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-stepper/shared/dsc-stepper-button.model.d.ts'
2026-10-19T16:00:59.4087108Z 13:00:59.408 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-stepper/shared/dsc-step.model.d.ts'
2026-10-19T16:00:59.4087431Z 13:00:59.408 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-stepper/shared/dsc-stepper.model.d.ts'
2026-10-19T16:00:59.4087735Z 13:00:59.408 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-stepper/dsc-stepper.component.d.ts'
2026-10-19T16:00:59.4088044Z 13:00:59.408 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-stepper/public-api.d.ts'
2026-10-19T16:00:59.4088340Z 13:00:59.408 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-stepper/index.d.ts'
2026-10-19T16:00:59.4088651Z 13:00:59.408 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/app.component.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:59.4088928Z 13:00:59.408 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/app.component.ts
2026-10-19T16:00:59.4105217Z 13:00:59.410 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/app.component.ts" with linterId "default"
2026-10-19T16:00:59.4425259Z 13:00:59.442 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/app.component.ts' containing 0 file(s)
2026-10-19T16:00:59.4431192Z 13:00:59.442 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/app.component.ts'
2026-10-19T16:00:59.4433285Z 13:00:59.443 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/app.component.ts'
2026-10-19T16:00:59.4435234Z 13:00:59.443 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/response-buscar-dados-agencia.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:59.4435736Z 13:00:59.443 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/response-buscar-dados-agencia.model.ts
2026-10-19T16:00:59.4447931Z 13:00:59.444 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/response-buscar-dados-agencia.model.ts" with linterId "default"
2026-10-19T16:00:59.4514676Z 13:00:59.451 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-buscar-dados-agencia.model.ts' containing 0 file(s)
2026-10-19T16:00:59.4626863Z 13:00:59.451 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-buscar-dados-agencia.model.ts'
2026-10-19T16:00:59.4627321Z 13:00:59.452 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-buscar-dados-agencia.model.ts'
2026-10-19T16:00:59.4627717Z 13:00:59.452 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/response-resumo-cliente-pf.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:59.4628018Z 13:00:59.452 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/response-resumo-cliente-pf.model.ts
2026-10-19T16:00:59.4628321Z 13:00:59.461 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/response-resumo-cliente-pf.model.ts" with linterId "default"
2026-10-19T16:00:59.4676099Z 13:00:59.466 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-resumo-cliente-pf.model.ts' containing 0 file(s)
2026-10-19T16:00:59.4676572Z 13:00:59.466 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-resumo-cliente-pf.model.ts'
2026-10-19T16:00:59.4676945Z 13:00:59.467 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-resumo-cliente-pf.model.ts'
2026-10-19T16:00:59.4677327Z 13:00:59.467 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/historico-consultas.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:59.4677657Z 13:00:59.467 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/historico-consultas.model.ts
2026-10-19T16:00:59.4731240Z 13:00:59.472 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/historico-consultas.model.ts" with linterId "default"
2026-10-19T16:00:59.4791997Z 13:00:59.478 DEBUG: Not enough content in 'src/app/models/historico-consultas.model.ts' to have CPD blocks, it will not be part of the duplication detection
2026-10-19T16:00:59.4792431Z 13:00:59.478 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/historico-consultas.model.ts' containing 0 file(s)
2026-10-19T16:00:59.4794170Z 13:00:59.479 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/historico-consultas.model.ts'
2026-10-19T16:00:59.4797880Z 13:00:59.479 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/historico-consultas.model.ts'
2026-10-19T16:00:59.4799644Z 13:00:59.479 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/request-gerar-arqv-contrato-rel-empr-financ.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:59.4800213Z 13:00:59.479 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/request-gerar-arqv-contrato-rel-empr-financ.model.ts
2026-10-19T16:00:59.4814110Z 13:00:59.481 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/request-gerar-arqv-contrato-rel-empr-financ.model.ts" with linterId "default"
2026-10-19T16:00:59.4891274Z 13:00:59.488 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/request-gerar-arqv-contrato-rel-empr-financ.model.ts' containing 0 file(s)
2026-10-19T16:00:59.4892314Z 13:00:59.489 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/request-gerar-arqv-contrato-rel-empr-financ.model.ts'
2026-10-19T16:00:59.4896913Z 13:00:59.489 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/request-gerar-arqv-contrato-rel-empr-financ.model.ts'
2026-10-19T16:00:59.4899132Z 13:00:59.489 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/request-gerar-arqv-faa.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:59.4899438Z 13:00:59.489 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/request-gerar-arqv-faa.model.ts
2026-10-19T16:00:59.4911645Z 13:00:59.491 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/request-gerar-arqv-faa.model.ts" with linterId "default"
2026-10-19T16:00:59.5061940Z 13:00:59.505 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/request-gerar-arqv-faa.model.ts' containing 0 file(s)
2026-10-19T16:00:59.5065157Z 13:00:59.506 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/request-gerar-arqv-faa.model.ts'
2026-10-19T16:00:59.5070723Z 13:00:59.506 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/request-gerar-arqv-faa.model.ts'
2026-10-19T16:00:59.5072605Z 13:00:59.507 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/request-reservar-conta-nsgd.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:59.5072922Z 13:00:59.507 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/request-reservar-conta-nsgd.model.ts
2026-10-19T16:00:59.5142799Z 13:00:59.514 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/request-reservar-conta-nsgd.model.ts" with linterId "default"
2026-10-19T16:00:59.5148105Z 13:00:59.514 DEBUG: Not enough content in 'src/app/models/request-reservar-conta-nsgd.model.ts' to have CPD blocks, it will not be part of the duplication detection
2026-10-19T16:00:59.5149282Z 13:00:59.514 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/request-reservar-conta-nsgd.model.ts' containing 0 file(s)
2026-10-19T16:00:59.5152440Z 13:00:59.515 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/request-reservar-conta-nsgd.model.ts'
2026-10-19T16:00:59.5156129Z 13:00:59.515 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/request-reservar-conta-nsgd.model.ts'
2026-10-19T16:00:59.5157386Z 13:00:59.515 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/response-consulta-cep.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:59.5157703Z 13:00:59.515 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/response-consulta-cep.model.ts
2026-10-19T16:00:59.5182117Z 13:00:59.518 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/response-consulta-cep.model.ts" with linterId "default"
2026-10-19T16:00:59.5247919Z 13:00:59.524 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-consulta-cep.model.ts' containing 0 file(s)
2026-10-19T16:00:59.5254983Z 13:00:59.524 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-consulta-cep.model.ts'
2026-10-19T16:00:59.5255395Z 13:00:59.525 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-consulta-cep.model.ts'
2026-10-19T16:00:59.5255922Z 13:00:59.525 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/response-reservar-conta-nsgd.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:59.5256239Z 13:00:59.525 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/response-reservar-conta-nsgd.model.ts
2026-10-19T16:00:59.5267212Z 13:00:59.526 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/response-reservar-conta-nsgd.model.ts" with linterId "default"
2026-10-19T16:00:59.5319096Z 13:00:59.531 DEBUG: Not enough content in 'src/app/models/response-reservar-conta-nsgd.model.ts' to have CPD blocks, it will not be part of the duplication detection
2026-10-19T16:00:59.5319520Z 13:00:59.531 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-reservar-conta-nsgd.model.ts' containing 0 file(s)
2026-10-19T16:00:59.5323217Z 13:00:59.532 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-reservar-conta-nsgd.model.ts'
2026-10-19T16:00:59.5326573Z 13:00:59.532 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-reservar-conta-nsgd.model.ts'
2026-10-19T16:00:59.5328082Z 13:00:59.532 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/response-tipo-conta.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:59.5328394Z 13:00:59.532 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/response-tipo-conta.model.ts
2026-10-19T16:00:59.5339569Z 13:00:59.533 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/response-tipo-conta.model.ts" with linterId "default"
2026-10-19T16:00:59.5436072Z 13:00:59.543 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-tipo-conta.model.ts' containing 0 file(s)
2026-10-19T16:00:59.5439741Z 13:00:59.543 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-tipo-conta.model.ts'
2026-10-19T16:00:59.5446183Z 13:00:59.544 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-tipo-conta.model.ts'
2026-10-19T16:00:59.5447998Z 13:00:59.544 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/response-consultar-tipo-categoria.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:59.5448335Z 13:00:59.544 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/response-consultar-tipo-categoria.model.ts
2026-10-19T16:00:59.5463564Z 13:00:59.546 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/response-consultar-tipo-categoria.model.ts" with linterId "default"
2026-10-19T16:00:59.5544192Z 13:00:59.552 DEBUG: Not enough content in 'src/app/models/response-consultar-tipo-categoria.model.ts' to have CPD blocks, it will not be part of the duplication detection
2026-10-19T16:00:59.5544745Z 13:00:59.552 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-consultar-tipo-categoria.model.ts' containing 0 file(s)
2026-10-19T16:00:59.5545146Z 13:00:59.553 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-consultar-tipo-categoria.model.ts'
2026-10-19T16:00:59.5545756Z 13:00:59.553 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-consultar-tipo-categoria.model.ts'
2026-10-19T16:00:59.5546127Z 13:00:59.553 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/request-consultar-tipo-categoria.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:59.5546442Z 13:00:59.553 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/request-consultar-tipo-categoria.model.ts
2026-10-19T16:00:59.5597802Z 13:00:59.556 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/request-consultar-tipo-categoria.model.ts" with linterId "default"
2026-10-19T16:00:59.5625764Z 13:00:59.560 DEBUG: Not enough content in 'src/app/models/request-consultar-tipo-categoria.model.ts' to have CPD blocks, it will not be part of the duplication detection
2026-10-19T16:00:59.5626184Z 13:00:59.560 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/request-consultar-tipo-categoria.model.ts' containing 0 file(s)
2026-10-19T16:00:59.5626596Z 13:00:59.560 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/request-consultar-tipo-categoria.model.ts'
2026-10-19T16:00:59.5635321Z 13:00:59.562 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/request-consultar-tipo-categoria.model.ts'
2026-10-19T16:00:59.5635703Z 13:00:59.563 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/request-comprovante-operacao.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:59.5636020Z 13:00:59.563 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/request-comprovante-operacao.model.ts
2026-10-19T16:00:59.5685060Z 13:00:59.564 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/request-comprovante-operacao.model.ts" with linterId "default"
2026-10-19T16:00:59.5699523Z 13:00:59.569 DEBUG: Not enough content in 'src/app/models/request-comprovante-operacao.model.ts' to have CPD blocks, it will not be part of the duplication detection
2026-10-19T16:00:59.5699979Z 13:00:59.569 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/request-comprovante-operacao.model.ts' containing 0 file(s)
2026-10-19T16:00:59.5701992Z 13:00:59.570 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/request-comprovante-operacao.model.ts'
2026-10-19T16:00:59.5705662Z 13:00:59.570 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/request-comprovante-operacao.model.ts'
2026-10-19T16:00:59.5707435Z 13:00:59.570 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/enums/situacao-menor.enum.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:59.5707731Z 13:00:59.570 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/enums/situacao-menor.enum.ts
2026-10-19T16:00:59.5720298Z 13:00:59.571 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/enums/situacao-menor.enum.ts" with linterId "default"
2026-10-19T16:00:59.5833619Z 13:00:59.580 DEBUG: Not enough content in 'src/app/enums/situacao-menor.enum.ts' to have CPD blocks, it will not be part of the duplication detection
2026-10-19T16:00:59.5853554Z 13:00:59.580 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/enums/situacao-menor.enum.ts' containing 0 file(s)
2026-10-19T16:00:59.5854027Z 13:00:59.581 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/enums/situacao-menor.enum.ts'
2026-10-19T16:00:59.5854411Z 13:00:59.581 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/enums/situacao-menor.enum.ts'
2026-10-19T16:00:59.5862872Z 13:00:59.581 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/request-abrir-conta-nsgd-sinda.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:59.5863194Z 13:00:59.581 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/request-abrir-conta-nsgd-sinda.model.ts
2026-10-19T16:00:59.5927107Z 13:00:59.592 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/request-abrir-conta-nsgd-sinda.model.ts" with linterId "default"
2026-10-19T16:00:59.5937131Z 13:00:59.593 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/request-abrir-conta-nsgd-sinda.model.ts' containing 0 file(s)
2026-10-19T16:00:59.5940592Z 13:00:59.593 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/request-abrir-conta-nsgd-sinda.model.ts'
2026-10-19T16:00:59.5946727Z 13:00:59.594 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/request-abrir-conta-nsgd-sinda.model.ts'
2026-10-19T16:00:59.5947990Z 13:00:59.594 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/request-abrir-conta-nsgd.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:59.5948308Z 13:00:59.594 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/request-abrir-conta-nsgd.model.ts
2026-10-19T16:00:59.5962055Z 13:00:59.596 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/request-abrir-conta-nsgd.model.ts" with linterId "default"
2026-10-19T16:00:59.6170937Z 13:00:59.616 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/request-abrir-conta-nsgd.model.ts' containing 0 file(s)
2026-10-19T16:00:59.6172737Z 13:00:59.617 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/request-abrir-conta-nsgd.model.ts'
2026-10-19T16:00:59.6178893Z 13:00:59.617 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/request-abrir-conta-nsgd.model.ts'
2026-10-19T16:00:59.6180463Z 13:00:59.617 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/abert-seletor-dados-conta.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:59.6180778Z 13:00:59.618 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/abert-seletor-dados-conta.model.ts
2026-10-19T16:00:59.6244489Z 13:00:59.624 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/abert-seletor-dados-conta.model.ts" with linterId "default"
2026-10-19T16:00:59.6299130Z 13:00:59.629 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/abert-seletor-dados-conta.model.ts' containing 0 file(s)
2026-10-19T16:00:59.6301584Z 13:00:59.630 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/abert-seletor-dados-conta.model.ts'
2026-10-19T16:00:59.6305453Z 13:00:59.630 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/abert-seletor-dados-conta.model.ts'
2026-10-19T16:00:59.6325037Z 13:00:59.630 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/services/agencia.service.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:59.6325351Z 13:00:59.630 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/services/agencia.service.ts
2026-10-19T16:00:59.6394546Z 13:00:59.639 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/services/agencia.service.ts" with linterId "default"
2026-10-19T16:00:59.6617961Z 13:00:59.661 DEBUG: Not enough content in 'src/app/services/agencia.service.ts' to have CPD blocks, it will not be part of the duplication detection
2026-10-19T16:00:59.6618426Z 13:00:59.661 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/agencia.service.ts' containing 0 file(s)
2026-10-19T16:00:59.6621726Z 13:00:59.662 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/agencia.service.ts'
2026-10-19T16:00:59.6631291Z 13:00:59.663 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/agencia.service.ts'
2026-10-19T16:00:59.6633098Z 13:00:59.663 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/services/loading-caixa.service.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:59.6633524Z 13:00:59.663 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/services/loading-caixa.service.ts
2026-10-19T16:00:59.6652199Z 13:00:59.665 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/services/loading-caixa.service.ts" with linterId "default"
2026-10-19T16:00:59.6779982Z 13:00:59.677 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/loading-caixa.service.ts' containing 0 file(s)
2026-10-19T16:00:59.6789239Z 13:00:59.678 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/loading-caixa.service.ts'
2026-10-19T16:00:59.6789638Z 13:00:59.678 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/loading-caixa.service.ts'
2026-10-19T16:00:59.6789987Z 13:00:59.678 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/interface/api-response.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:59.6790319Z 13:00:59.678 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/interface/api-response.ts
2026-10-19T16:00:59.6801738Z 13:00:59.680 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/interface/api-response.ts" with linterId "default"
2026-10-19T16:00:59.6879887Z 13:00:59.687 DEBUG: Not enough content in 'src/app/interface/api-response.ts' to have CPD blocks, it will not be part of the duplication detection
2026-10-19T16:00:59.6880317Z 13:00:59.687 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/interface/api-response.ts' containing 0 file(s)
2026-10-19T16:00:59.6880679Z 13:00:59.687 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/interface/api-response.ts'
2026-10-19T16:00:59.6881152Z 13:00:59.688 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/interface/api-response.ts'
2026-10-19T16:00:59.6882625Z 13:00:59.688 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/services/relatorios.service.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:59.6882925Z 13:00:59.688 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/services/relatorios.service.ts
2026-10-19T16:00:59.6897729Z 13:00:59.689 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/services/relatorios.service.ts" with linterId "default"
2026-10-19T16:00:59.7523176Z 13:00:59.751 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/relatorios.service.ts' containing 0 file(s)
2026-10-19T16:00:59.7523686Z 13:00:59.752 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/relatorios.service.ts'
2026-10-19T16:00:59.7528389Z 13:00:59.752 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/relatorios.service.ts'
2026-10-19T16:00:59.7529224Z 13:00:59.752 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/pages/abert-comprovante-operacao/business/modal-config-faa.business.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:59.7529869Z 13:00:59.752 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-comprovante-operacao/business/modal-config-faa.business.ts
2026-10-19T16:00:59.7559610Z 13:00:59.755 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/pages/abert-comprovante-operacao/business/modal-config-faa.business.ts" with linterId "default"
2026-10-19T16:00:59.8107482Z 13:00:59.810 DEBUG: Saving issue for rule no-commented-code on line 64
2026-10-19T16:00:59.8115974Z 13:00:59.811 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-comprovante-operacao/business/modal-config-faa.business.ts' containing 0 file(s)
2026-10-19T16:00:59.8118000Z 13:00:59.811 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-comprovante-operacao/business/modal-config-faa.business.ts'
2026-10-19T16:00:59.8122876Z 13:00:59.812 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-comprovante-operacao/business/modal-config-faa.business.ts'
2026-10-19T16:00:59.8124156Z 13:00:59.812 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/pages/abert-comprovante-operacao/components/modal-config-faa/modal-config-faa.component.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:59.8124548Z 13:00:59.812 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-comprovante-operacao/components/modal-config-faa/modal-config-faa.component.ts
2026-10-19T16:00:59.8140612Z 13:00:59.813 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/pages/abert-comprovante-operacao/components/modal-config-faa/modal-config-faa.component.ts" with linterId "default"
2026-10-19T16:00:59.9273512Z 13:00:59.927 DEBUG: Saving issue for rule no-commented-code on line 105
2026-10-19T16:00:59.9281730Z 13:00:59.928 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-comprovante-operacao/components/modal-config-faa/modal-config-faa.component.ts' containing 0 file(s)
2026-10-19T16:00:59.9285169Z 13:00:59.928 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-comprovante-operacao/components/modal-config-faa/modal-config-faa.component.ts'
2026-10-19T16:00:59.9294433Z 13:00:59.929 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-comprovante-operacao/components/modal-config-faa/modal-config-faa.component.ts'
2026-10-19T16:00:59.9296237Z 13:00:59.929 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/relatorios/request-ficha-abertura-autografo.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:59.9297135Z 13:00:59.929 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/relatorios/request-ficha-abertura-autografo.model.ts
2026-10-19T16:00:59.9313156Z 13:00:59.931 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/relatorios/request-ficha-abertura-autografo.model.ts" with linterId "default"
2026-10-19T16:00:59.9385223Z 13:00:59.938 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/relatorios/request-ficha-abertura-autografo.model.ts' containing 0 file(s)
2026-10-19T16:00:59.9387513Z 13:00:59.938 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/relatorios/request-ficha-abertura-autografo.model.ts'
2026-10-19T16:00:59.9391067Z 13:00:59.939 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/relatorios/request-ficha-abertura-autografo.model.ts'
2026-10-19T16:00:59.9392301Z 13:00:59.939 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/services/dados-relatorios.service.ts' as current analysis requires all files to be analyzed
2026-10-19T16:00:59.9392611Z 13:00:59.939 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/services/dados-relatorios.service.ts
2026-10-19T16:00:59.9406087Z 13:00:59.940 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/services/dados-relatorios.service.ts" with linterId "default"
2026-10-19T16:01:00.1184140Z 13:01:00.118 DEBUG: Saving issue for rule unused-import on line 11
2026-10-19T16:01:00.1185408Z 13:01:00.118 DEBUG: Saving issue for rule no-dead-store on line 78
2026-10-19T16:01:00.1191838Z 13:01:00.118 DEBUG: Saving issue for rule no-dead-store on line 80
2026-10-19T16:01:00.1192080Z 13:01:00.118 DEBUG: Saving issue for rule no-dead-store on line 85
2026-10-19T16:01:00.1192567Z 13:01:00.118 DEBUG: Saving issue for rule no-dead-store on line 86
2026-10-19T16:01:00.1192795Z 13:01:00.118 DEBUG: Saving issue for rule no-commented-code on line 122
2026-10-19T16:01:00.1193018Z 13:01:00.118 DEBUG: Saving issue for rule no-commented-code on line 151
2026-10-19T16:01:00.1193250Z 13:01:00.118 DEBUG: Saving issue for rule no-commented-code on line 203
2026-10-19T16:01:00.1193465Z 13:01:00.118 DEBUG: Saving issue for rule no-dead-store on line 242
2026-10-19T16:01:00.1200738Z 13:01:00.119 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/dados-relatorios.service.ts' containing 0 file(s)
2026-10-19T16:01:00.1203968Z 13:01:00.120 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/dados-relatorios.service.ts'
2026-10-19T16:01:00.1218271Z 13:01:00.121 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/dados-relatorios.service.ts'
2026-10-19T16:01:00.1219536Z 13:01:00.121 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/pages/abert-dados-gerais/factory/abert-dados-gerais-conta.factory.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:00.1219890Z 13:01:00.121 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-dados-gerais/factory/abert-dados-gerais-conta.factory.ts
2026-10-19T16:01:00.1234900Z 13:01:00.123 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/pages/abert-dados-gerais/factory/abert-dados-gerais-conta.factory.ts" with linterId "default"
2026-10-19T16:01:00.1460566Z 13:01:00.145 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-gerais/factory/abert-dados-gerais-conta.factory.ts' containing 0 file(s)
2026-10-19T16:01:00.1461334Z 13:01:00.145 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-gerais/factory/abert-dados-gerais-conta.factory.ts'
2026-10-19T16:01:00.1465593Z 13:01:00.146 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-gerais/factory/abert-dados-gerais-conta.factory.ts'
2026-10-19T16:01:00.1466236Z 13:01:00.146 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@angular/material/select/index.d.ts'
2026-10-19T16:01:00.1466775Z 13:01:00.146 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/core/utils/string.util.d.ts'
2026-10-19T16:01:00.1467305Z 13:01:00.146 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/core/utils/array.util.d.ts'
2026-10-19T16:01:00.1467839Z 13:01:00.146 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/core/services/field-error-messenger.service.d.ts'
2026-10-19T16:01:00.1469575Z 13:01:00.146 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/core/base-control-value-accessor.d.ts'
2026-10-19T16:01:00.1470168Z 13:01:00.146 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/core/custom-error-state-matcher.d.ts'
2026-10-19T16:01:00.1470720Z 13:01:00.146 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/core/base-component.component.d.ts'
2026-10-19T16:01:00.1471521Z 13:01:00.146 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/core/services/breakpoint-matcher.service.d.ts'
2026-10-19T16:01:00.1472102Z 13:01:00.146 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/core/utils/common.util.d.ts'
2026-10-19T16:01:00.1472607Z 13:01:00.146 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/core/formatters/format-cpf-cnpj.d.ts'
2026-10-19T16:01:00.1473268Z 13:01:00.146 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/core/formatters/format-phone.d.ts'
2026-10-19T16:01:00.1473809Z 13:01:00.146 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/core/formatters/format-zip-code.d.ts'
2026-10-19T16:01:00.1474413Z 13:01:00.146 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/core/pipes/cpf-cnpj.pipe.d.ts'
2026-10-19T16:01:00.1474934Z 13:01:00.146 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/core/pipes/phone.pipe.d.ts'
2026-10-19T16:01:00.1475449Z 13:01:00.146 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/core/pipes/zip-code.pipe.d.ts'
2026-10-19T16:01:00.1475999Z 13:01:00.146 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/core/validators/dsc-validators.d.ts'
2026-10-19T16:01:00.1476515Z 13:01:00.146 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/core/public-api.d.ts'
2026-10-19T16:01:00.1476971Z 13:01:00.147 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/core/index.d.ts'
2026-10-19T16:01:00.1477446Z 13:01:00.147 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-select/shared/option.d.ts'
2026-10-19T16:01:00.1477959Z 13:01:00.147 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-select/dsc-select.component.d.ts'
2026-10-19T16:01:00.1478489Z 13:01:00.147 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-select/public-api.d.ts'
2026-10-19T16:01:00.1479057Z 13:01:00.147 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-select/index.d.ts'
2026-10-19T16:01:00.1479627Z 13:01:00.147 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/enums/tipo-conta.enum.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:00.1480086Z 13:01:00.147 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/enums/tipo-conta.enum.ts
2026-10-19T16:01:00.1489574Z 13:01:00.148 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/enums/tipo-conta.enum.ts" with linterId "default"
2026-10-19T16:01:00.1679379Z 13:01:00.167 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/enums/tipo-conta.enum.ts' containing 0 file(s)
2026-10-19T16:01:00.1680594Z 13:01:00.167 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/enums/tipo-conta.enum.ts'
2026-10-19T16:01:00.1686365Z 13:01:00.168 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/enums/tipo-conta.enum.ts'
2026-10-19T16:01:00.1688825Z 13:01:00.168 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/pages/abert-dados-gerais/components/abert-dados-gerais-conta/abert-dados-gerais-conta.component.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:00.1689238Z 13:01:00.168 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-dados-gerais/components/abert-dados-gerais-conta/abert-dados-gerais-conta.component.ts
2026-10-19T16:01:00.1702245Z 13:01:00.170 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/pages/abert-dados-gerais/components/abert-dados-gerais-conta/abert-dados-gerais-conta.component.ts" with linterId "default"
2026-10-19T16:01:00.2965812Z 13:01:00.296 DEBUG: Saving issue for rule unused-import on line 1
2026-10-19T16:01:00.2968496Z 13:01:00.296 DEBUG: Saving issue for rule unused-import on line 9
2026-10-19T16:01:00.2972690Z 13:01:00.296 DEBUG: Saving issue for rule no-duplicate-imports on line 13
2026-10-19T16:01:00.2980945Z 13:01:00.297 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-gerais/components/abert-dados-gerais-conta/abert-dados-gerais-conta.component.ts' containing 0 file(s)
2026-10-19T16:01:00.2984509Z 13:01:00.298 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-gerais/components/abert-dados-gerais-conta/abert-dados-gerais-conta.component.ts'
2026-10-19T16:01:00.2994184Z 13:01:00.299 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-gerais/components/abert-dados-gerais-conta/abert-dados-gerais-conta.component.ts'
2026-10-19T16:01:00.2995430Z 13:01:00.299 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/pages/abert-dados-gerais/business/abert-dados-gerais-conta.business.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:00.2995793Z 13:01:00.299 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-dados-gerais/business/abert-dados-gerais-conta.business.ts
2026-10-19T16:01:00.3017054Z 13:01:00.301 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/pages/abert-dados-gerais/business/abert-dados-gerais-conta.business.ts" with linterId "default"
2026-10-19T16:01:00.4115703Z 13:01:00.411 DEBUG: Saving issue for rule unused-import on line 3
2026-10-19T16:01:00.4117225Z 13:01:00.411 DEBUG: Saving issue for rule unused-import on line 5
2026-10-19T16:01:00.4118623Z 13:01:00.411 DEBUG: Saving issue for rule unused-import on line 14
2026-10-19T16:01:00.4127691Z 13:01:00.412 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-gerais/business/abert-dados-gerais-conta.business.ts' containing 0 file(s)
2026-10-19T16:01:00.4130645Z 13:01:00.412 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-gerais/business/abert-dados-gerais-conta.business.ts'
2026-10-19T16:01:00.4142187Z 13:01:00.414 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-gerais/business/abert-dados-gerais-conta.business.ts'
2026-10-19T16:01:00.4143687Z 13:01:00.414 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/services/dados-abertura.service.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:00.4144145Z 13:01:00.414 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/services/dados-abertura.service.ts
2026-10-19T16:01:00.4158085Z 13:01:00.415 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/services/dados-abertura.service.ts" with linterId "default"
2026-10-19T16:01:00.6096094Z 13:01:00.609 DEBUG: Saving issue for rule unused-import on line 11
2026-10-19T16:01:00.6097673Z 13:01:00.609 DEBUG: Saving issue for rule unused-import on line 13
2026-10-19T16:01:00.6098283Z 13:01:00.609 DEBUG: Saving issue for rule no-commented-code on line 32
2026-10-19T16:01:00.6099101Z 13:01:00.609 DEBUG: Saving issue for rule no-commented-code on line 218
2026-10-19T16:01:00.6110184Z 13:01:00.610 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/dados-abertura.service.ts' containing 0 file(s)
2026-10-19T16:01:00.6113352Z 13:01:00.611 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/dados-abertura.service.ts'
2026-10-19T16:01:00.6129549Z 13:01:00.612 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/dados-abertura.service.ts'
2026-10-19T16:01:00.6130595Z 13:01:00.612 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/response-abrir-conta-nsgd-sinda.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:00.6131189Z 13:01:00.612 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/response-abrir-conta-nsgd-sinda.model.ts
2026-10-19T16:01:00.6147182Z 13:01:00.614 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/response-abrir-conta-nsgd-sinda.model.ts" with linterId "default"
2026-10-19T16:01:00.6213368Z 13:01:00.620 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-abrir-conta-nsgd-sinda.model.ts' containing 0 file(s)
2026-10-19T16:01:00.6215014Z 13:01:00.621 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-abrir-conta-nsgd-sinda.model.ts'
2026-10-19T16:01:00.6217752Z 13:01:00.621 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-abrir-conta-nsgd-sinda.model.ts'
2026-10-19T16:01:00.6218505Z 13:01:00.621 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/response-abrir-conta-nsgd.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:00.6218823Z 13:01:00.621 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/response-abrir-conta-nsgd.model.ts
2026-10-19T16:01:00.6247174Z 13:01:00.624 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/response-abrir-conta-nsgd.model.ts" with linterId "default"
2026-10-19T16:01:00.6352262Z 13:01:00.635 DEBUG: Not enough content in 'src/app/models/response-abrir-conta-nsgd.model.ts' to have CPD blocks, it will not be part of the duplication detection
2026-10-19T16:01:00.6352678Z 13:01:00.635 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-abrir-conta-nsgd.model.ts' containing 0 file(s)
2026-10-19T16:01:00.6354874Z 13:01:00.635 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-abrir-conta-nsgd.model.ts'
2026-10-19T16:01:00.6357950Z 13:01:00.635 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-abrir-conta-nsgd.model.ts'
2026-10-19T16:01:00.6359111Z 13:01:00.635 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/services/abertura-conta.service.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:00.6359489Z 13:01:00.635 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/services/abertura-conta.service.ts
2026-10-19T16:01:00.6373469Z 13:01:00.637 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/services/abertura-conta.service.ts" with linterId "default"
2026-10-19T16:01:00.7096256Z 13:01:00.709 DEBUG: Saving issue for rule no-dead-store on line 124
2026-10-19T16:01:00.7098527Z 13:01:00.709 DEBUG: Saving issue for rule no-dead-store on line 169
2026-10-19T16:01:00.7110616Z 13:01:00.710 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/abertura-conta.service.ts' containing 0 file(s)
2026-10-19T16:01:00.7114219Z 13:01:00.711 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/abertura-conta.service.ts'
2026-10-19T16:01:00.7127570Z 13:01:00.712 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/abertura-conta.service.ts'
2026-10-19T16:01:00.7128662Z 13:01:00.712 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/services/consultas-cadastrais.service.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:00.7129042Z 13:01:00.712 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/services/consultas-cadastrais.service.ts
2026-10-19T16:01:00.7222202Z 13:01:00.721 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/services/consultas-cadastrais.service.ts" with linterId "default"
2026-10-19T16:01:00.8039616Z 13:01:00.803 DEBUG: Saving issue for rule no-commented-code on line 99
2026-10-19T16:01:00.8049057Z 13:01:00.804 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/consultas-cadastrais.service.ts' containing 0 file(s)
2026-10-19T16:01:00.8051726Z 13:01:00.805 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/consultas-cadastrais.service.ts'
2026-10-19T16:01:00.8063802Z 13:01:00.806 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/consultas-cadastrais.service.ts'
2026-10-19T16:01:00.8065206Z 13:01:00.806 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/enums/consultas-cadastrais/receita-regularidade.enum.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:00.8065555Z 13:01:00.806 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/enums/consultas-cadastrais/receita-regularidade.enum.ts
2026-10-19T16:01:00.8090200Z 13:01:00.807 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/enums/consultas-cadastrais/receita-regularidade.enum.ts" with linterId "default"
2026-10-19T16:01:00.8148083Z 13:01:00.814 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/enums/consultas-cadastrais/receita-regularidade.enum.ts' containing 0 file(s)
2026-10-19T16:01:00.8149299Z 13:01:00.814 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/enums/consultas-cadastrais/receita-regularidade.enum.ts'
2026-10-19T16:01:00.8153114Z 13:01:00.815 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/enums/consultas-cadastrais/receita-regularidade.enum.ts'
2026-10-19T16:01:00.8154163Z 13:01:00.815 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/shared/components/consultas-cadastrais/constantes.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:00.8154979Z 13:01:00.815 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/shared/components/consultas-cadastrais/constantes.ts
2026-10-19T16:01:00.8168266Z 13:01:00.816 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/shared/components/consultas-cadastrais/constantes.ts" with linterId "default"
2026-10-19T16:01:00.8233588Z 13:01:00.823 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/consultas-cadastrais/constantes.ts' containing 0 file(s)
2026-10-19T16:01:00.8235199Z 13:01:00.823 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/consultas-cadastrais/constantes.ts'
2026-10-19T16:01:00.8238609Z 13:01:00.823 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/consultas-cadastrais/constantes.ts'
2026-10-19T16:01:00.8239670Z 13:01:00.823 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/shared/components/consultas-cadastrais/factory/mensagens-customizadas.factory.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:00.8240148Z 13:01:00.823 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/shared/components/consultas-cadastrais/factory/mensagens-customizadas.factory.ts
2026-10-19T16:01:00.8271228Z 13:01:00.826 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/shared/components/consultas-cadastrais/factory/mensagens-customizadas.factory.ts" with linterId "default"
2026-10-19T16:01:00.8706747Z 13:01:00.870 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/consultas-cadastrais/factory/mensagens-customizadas.factory.ts' containing 0 file(s)
2026-10-19T16:01:00.8707948Z 13:01:00.870 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/consultas-cadastrais/factory/mensagens-customizadas.factory.ts'
2026-10-19T16:01:00.8714083Z 13:01:00.871 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/consultas-cadastrais/factory/mensagens-customizadas.factory.ts'
2026-10-19T16:01:00.8715843Z 13:01:00.871 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/consultas-cadastrais/cliente-comercial.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:00.8716311Z 13:01:00.871 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/consultas-cadastrais/cliente-comercial.model.ts
2026-10-19T16:01:00.8731152Z 13:01:00.872 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/consultas-cadastrais/cliente-comercial.model.ts" with linterId "default"
2026-10-19T16:01:00.9135098Z 13:01:00.911 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/consultas-cadastrais/cliente-comercial.model.ts' containing 0 file(s)
2026-10-19T16:01:00.9135602Z 13:01:00.911 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/consultas-cadastrais/cliente-comercial.model.ts'
2026-10-19T16:01:00.9136105Z 13:01:00.912 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/consultas-cadastrais/cliente-comercial.model.ts'
2026-10-19T16:01:00.9136484Z 13:01:00.912 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-accordion/shared/dsc-accordion-item.d.ts'
2026-10-19T16:01:00.9136825Z 13:01:00.912 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/enums/documento-identificacao.enum.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:00.9137167Z 13:01:00.912 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/enums/documento-identificacao.enum.ts
2026-10-19T16:01:00.9151070Z 13:01:00.914 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/enums/documento-identificacao.enum.ts" with linterId "default"
2026-10-19T16:01:00.9209924Z 13:01:00.920 DEBUG: Not enough content in 'src/app/enums/documento-identificacao.enum.ts' to have CPD blocks, it will not be part of the duplication detection
2026-10-19T16:01:00.9210397Z 13:01:00.920 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/enums/documento-identificacao.enum.ts' containing 0 file(s)
2026-10-19T16:01:00.9212917Z 13:01:00.921 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/enums/documento-identificacao.enum.ts'
2026-10-19T16:01:00.9215248Z 13:01:00.921 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/enums/documento-identificacao.enum.ts'
2026-10-19T16:01:00.9216231Z 13:01:00.921 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/response-documentos-dossie.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:00.9216678Z 13:01:00.921 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/response-documentos-dossie.model.ts
2026-10-19T16:01:00.9228871Z 13:01:00.922 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/response-documentos-dossie.model.ts" with linterId "default"
2026-10-19T16:01:00.9380345Z 13:01:00.937 DEBUG: Saving issue for rule unused-import on line 1
2026-10-19T16:01:00.9387147Z 13:01:00.938 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-documentos-dossie.model.ts' containing 0 file(s)
2026-10-19T16:01:00.9390873Z 13:01:00.938 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-documentos-dossie.model.ts'
2026-10-19T16:01:00.9396461Z 13:01:00.939 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-documentos-dossie.model.ts'
2026-10-19T16:01:00.9397680Z 13:01:00.939 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/services/dossie-digital-service.service.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:00.9398180Z 13:01:00.939 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/services/dossie-digital-service.service.ts
2026-10-19T16:01:00.9413249Z 13:01:00.941 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/services/dossie-digital-service.service.ts" with linterId "default"
2026-10-19T16:01:00.9572285Z 13:01:00.956 DEBUG: Not enough content in 'src/app/services/dossie-digital-service.service.ts' to have CPD blocks, it will not be part of the duplication detection
2026-10-19T16:01:00.9572772Z 13:01:00.957 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/dossie-digital-service.service.ts' containing 0 file(s)
2026-10-19T16:01:00.9574309Z 13:01:00.957 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/dossie-digital-service.service.ts'
2026-10-19T16:01:00.9578122Z 13:01:00.957 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/dossie-digital-service.service.ts'
2026-10-19T16:01:00.9579350Z 13:01:00.957 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/shared/components/consultas-cadastrais/consultas-cadastrais.component.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:00.9579806Z 13:01:00.957 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/shared/components/consultas-cadastrais/consultas-cadastrais.component.ts
2026-10-19T16:01:00.9592980Z 13:01:00.959 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/shared/components/consultas-cadastrais/consultas-cadastrais.component.ts" with linterId "default"
2026-10-19T16:01:01.3037706Z 13:01:01.303 DEBUG: Saving issue for rule unused-import on line 1
2026-10-19T16:01:01.3038517Z 13:01:01.303 DEBUG: Saving issue for rule unused-import on line 1
2026-10-19T16:01:01.3039510Z 13:01:01.303 DEBUG: Saving issue for rule no-associative-arrays on line 673
2026-10-19T16:01:01.3040284Z 13:01:01.303 DEBUG: Saving issue for rule no-associative-arrays on line 674
2026-10-19T16:01:01.3041226Z 13:01:01.304 DEBUG: Saving issue for rule no-associative-arrays on line 675
2026-10-19T16:01:01.3041868Z 13:01:01.304 DEBUG: Saving issue for rule no-associative-arrays on line 676
2026-10-19T16:01:01.3042497Z 13:01:01.304 DEBUG: Saving issue for rule no-associative-arrays on line 677
2026-10-19T16:01:01.3043137Z 13:01:01.304 DEBUG: Saving issue for rule no-associative-arrays on line 678
2026-10-19T16:01:01.3043768Z 13:01:01.304 DEBUG: Saving issue for rule no-associative-arrays on line 679
2026-10-19T16:01:01.3044573Z 13:01:01.304 DEBUG: Saving issue for rule no-associative-arrays on line 680
2026-10-19T16:01:01.3045172Z 13:01:01.304 DEBUG: Saving issue for rule no-associative-arrays on line 681
2026-10-19T16:01:01.3045979Z 13:01:01.304 DEBUG: Saving issue for rule no-associative-arrays on line 682
2026-10-19T16:01:01.3068667Z 13:01:01.306 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/consultas-cadastrais/consultas-cadastrais.component.ts' containing 0 file(s)
2026-10-19T16:01:01.3072370Z 13:01:01.307 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/consultas-cadastrais/consultas-cadastrais.component.ts'
2026-10-19T16:01:01.3103629Z 13:01:01.310 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/consultas-cadastrais/consultas-cadastrais.component.ts'
2026-10-19T16:01:01.3104320Z 13:01:01.310 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-accordion/dsc-accordion.component.d.ts'
2026-10-19T16:01:01.3104644Z 13:01:01.310 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-accordion/public-api.d.ts'
2026-10-19T16:01:01.3104945Z 13:01:01.310 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-accordion/index.d.ts'
2026-10-19T16:01:01.3105373Z 13:01:01.310 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-progress-spinner/dsc-progress-spinner.component.d.ts'
2026-10-19T16:01:01.3105717Z 13:01:01.310 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-progress-spinner/shared/dsc-progress-spinner-item.d.ts'
2026-10-19T16:01:01.3106052Z 13:01:01.310 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-progress-spinner/public-api.d.ts'
2026-10-19T16:01:01.3106351Z 13:01:01.310 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-progress-spinner/index.d.ts'
2026-10-19T16:01:01.3106705Z 13:01:01.310 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/shared/components/consultas-cadastrais/consultas-cadastrais.module.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:01.3107048Z 13:01:01.310 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/shared/components/consultas-cadastrais/consultas-cadastrais.module.ts
2026-10-19T16:01:01.3164964Z 13:01:01.312 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/shared/components/consultas-cadastrais/consultas-cadastrais.module.ts" with linterId "default"
2026-10-19T16:01:01.3311489Z 13:01:01.330 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/consultas-cadastrais/consultas-cadastrais.module.ts' containing 0 file(s)
2026-10-19T16:01:01.3313164Z 13:01:01.331 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/consultas-cadastrais/consultas-cadastrais.module.ts'
2026-10-19T16:01:01.3319108Z 13:01:01.331 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/consultas-cadastrais/consultas-cadastrais.module.ts'
2026-10-19T16:01:01.3320477Z 13:01:01.331 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/pages/abert-comprovante-operacao/business/modal-config-contrato-relacionamento.business.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:01.3320871Z 13:01:01.332 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-comprovante-operacao/business/modal-config-contrato-relacionamento.business.ts
2026-10-19T16:01:01.3335090Z 13:01:01.333 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/pages/abert-comprovante-operacao/business/modal-config-contrato-relacionamento.business.ts" with linterId "default"
2026-10-19T16:01:01.3682736Z 13:01:01.367 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-comprovante-operacao/business/modal-config-contrato-relacionamento.business.ts' containing 0 file(s)
2026-10-19T16:01:01.3683332Z 13:01:01.368 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-comprovante-operacao/business/modal-config-contrato-relacionamento.business.ts'
2026-10-19T16:01:01.3687754Z 13:01:01.368 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-comprovante-operacao/business/modal-config-contrato-relacionamento.business.ts'
2026-10-19T16:01:01.3689060Z 13:01:01.368 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/pages/abert-comprovante-operacao/components/modal-config-contrato/modal-config-contrato.component.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:01.3689693Z 13:01:01.368 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-comprovante-operacao/components/modal-config-contrato/modal-config-contrato.component.ts
2026-10-19T16:01:01.3703359Z 13:01:01.370 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/pages/abert-comprovante-operacao/components/modal-config-contrato/modal-config-contrato.component.ts" with linterId "default"
2026-10-19T16:01:01.4297414Z 13:01:01.429 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-comprovante-operacao/components/modal-config-contrato/modal-config-contrato.component.ts' containing 0 file(s)
2026-10-19T16:01:01.4298220Z 13:01:01.429 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-comprovante-operacao/components/modal-config-contrato/modal-config-contrato.component.ts'
2026-10-19T16:01:01.4303553Z 13:01:01.430 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-comprovante-operacao/components/modal-config-contrato/modal-config-contrato.component.ts'
2026-10-19T16:01:01.4304761Z 13:01:01.430 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/modal/modal-options.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:01.4305246Z 13:01:01.430 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/modal/modal-options.model.ts
2026-10-19T16:01:01.4321505Z 13:01:01.432 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/modal/modal-options.model.ts" with linterId "default"
2026-10-19T16:01:01.4418257Z 13:01:01.441 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/modal/modal-options.model.ts' containing 0 file(s)
2026-10-19T16:01:01.4419820Z 13:01:01.441 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/modal/modal-options.model.ts'
2026-10-19T16:01:01.4426664Z 13:01:01.442 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/modal/modal-options.model.ts'
2026-10-19T16:01:01.4427988Z 13:01:01.442 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/pages/abert-comprovante-operacao/business/abert-comprovante-operacao.business.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:01.4428364Z 13:01:01.442 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-comprovante-operacao/business/abert-comprovante-operacao.business.ts
2026-10-19T16:01:01.4441780Z 13:01:01.444 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/pages/abert-comprovante-operacao/business/abert-comprovante-operacao.business.ts" with linterId "default"
2026-10-19T16:01:01.5495879Z 13:01:01.542 DEBUG: Saving issue for rule no-commented-code on line 89
2026-10-19T16:01:01.5496309Z 13:01:01.542 DEBUG: Saving issue for rule no-commented-code on line 113
2026-10-19T16:01:01.5496854Z 13:01:01.543 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-comprovante-operacao/business/abert-comprovante-operacao.business.ts' containing 0 file(s)
2026-10-19T16:01:01.5497328Z 13:01:01.543 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-comprovante-operacao/business/abert-comprovante-operacao.business.ts'
2026-10-19T16:01:01.5497780Z 13:01:01.544 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-comprovante-operacao/business/abert-comprovante-operacao.business.ts'
2026-10-19T16:01:01.5498184Z 13:01:01.544 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/shared/components/modal-alerta/modal-alerta.component.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:01.5498810Z 13:01:01.544 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/shared/components/modal-alerta/modal-alerta.component.ts
2026-10-19T16:01:01.5499128Z 13:01:01.546 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/shared/components/modal-alerta/modal-alerta.component.ts" with linterId "default"
2026-10-19T16:01:01.5749251Z 13:01:01.574 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/modal-alerta/modal-alerta.component.ts' containing 0 file(s)
2026-10-19T16:01:01.5750603Z 13:01:01.574 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/modal-alerta/modal-alerta.component.ts'
2026-10-19T16:01:01.5752936Z 13:01:01.575 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/modal-alerta/modal-alerta.component.ts'
2026-10-19T16:01:01.5754090Z 13:01:01.575 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/services/modal-dialogo.service.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:01.5754527Z 13:01:01.575 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/services/modal-dialogo.service.ts
2026-10-19T16:01:01.5774008Z 13:01:01.577 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/services/modal-dialogo.service.ts" with linterId "default"
2026-10-19T16:01:01.6043723Z 13:01:01.603 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/modal-dialogo.service.ts' containing 0 file(s)
2026-10-19T16:01:01.6044425Z 13:01:01.604 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/modal-dialogo.service.ts'
2026-10-19T16:01:01.6048616Z 13:01:01.604 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/modal-dialogo.service.ts'
2026-10-19T16:01:01.6049896Z 13:01:01.604 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/pages/abert-dados-representantes-procuradores/factory/abert-dados-representantes-procuradores.factory.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:01.6050326Z 13:01:01.604 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-dados-representantes-procuradores/factory/abert-dados-representantes-procuradores.factory.ts
2026-10-19T16:01:01.6067464Z 13:01:01.606 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/pages/abert-dados-representantes-procuradores/factory/abert-dados-representantes-procuradores.factory.ts" with linterId "default"
2026-10-19T16:01:01.6306560Z 13:01:01.630 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-representantes-procuradores/factory/abert-dados-representantes-procuradores.factory.ts' containing 0 file(s)
2026-10-19T16:01:01.6308035Z 13:01:01.630 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-representantes-procuradores/factory/abert-dados-representantes-procuradores.factory.ts'
2026-10-19T16:01:01.6322228Z 13:01:01.631 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-representantes-procuradores/factory/abert-dados-representantes-procuradores.factory.ts'
2026-10-19T16:01:01.6322821Z 13:01:01.631 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/consultas-cadastrais/resultados-consultas-cadastrais.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:01.6323177Z 13:01:01.631 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/consultas-cadastrais/resultados-consultas-cadastrais.model.ts
2026-10-19T16:01:01.6330416Z 13:01:01.632 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/consultas-cadastrais/resultados-consultas-cadastrais.model.ts" with linterId "default"
2026-10-19T16:01:01.6405501Z 13:01:01.639 DEBUG: Not enough content in 'src/app/models/consultas-cadastrais/resultados-consultas-cadastrais.model.ts' to have CPD blocks, it will not be part of the duplication detection
2026-10-19T16:01:01.6406050Z 13:01:01.639 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/consultas-cadastrais/resultados-consultas-cadastrais.model.ts' containing 0 file(s)
2026-10-19T16:01:01.6406792Z 13:01:01.640 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/consultas-cadastrais/resultados-consultas-cadastrais.model.ts'
2026-10-19T16:01:01.6407322Z 13:01:01.640 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/consultas-cadastrais/resultados-consultas-cadastrais.model.ts'
2026-10-19T16:01:01.6407793Z 13:01:01.640 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/pages/abert-dados-representantes-procuradores/business/modal-incluir-titular.business.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:01.6408355Z 13:01:01.640 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-dados-representantes-procuradores/business/modal-incluir-titular.business.ts
2026-10-19T16:01:01.6444002Z 13:01:01.642 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/pages/abert-dados-representantes-procuradores/business/modal-incluir-titular.business.ts" with linterId "default"
2026-10-19T16:01:01.7647605Z 13:01:01.764 DEBUG: Saving issue for rule no-commented-code on line 6
2026-10-19T16:01:01.7648115Z 13:01:01.764 DEBUG: Saving issue for rule no-commented-code on line 52
2026-10-19T16:01:01.7657731Z 13:01:01.765 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-representantes-procuradores/business/modal-incluir-titular.business.ts' containing 0 file(s)
2026-10-19T16:01:01.7662579Z 13:01:01.766 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-representantes-procuradores/business/modal-incluir-titular.business.ts'
2026-10-19T16:01:01.7679749Z 13:01:01.767 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-representantes-procuradores/business/modal-incluir-titular.business.ts'
2026-10-19T16:01:01.7680734Z 13:01:01.767 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/pages/abert-dados-representantes-procuradores/components/modal-incluir-titular/modal-incluir-titular.component.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:01.7681321Z 13:01:01.768 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-dados-representantes-procuradores/components/modal-incluir-titular/modal-incluir-titular.component.ts
2026-10-19T16:01:01.7699123Z 13:01:01.769 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/pages/abert-dados-representantes-procuradores/components/modal-incluir-titular/modal-incluir-titular.component.ts" with linterId "default"
2026-10-19T16:01:01.8646849Z 13:01:01.863 DEBUG: Saving issue for rule no-commented-code on line 80
2026-10-19T16:01:01.8653732Z 13:01:01.865 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-representantes-procuradores/components/modal-incluir-titular/modal-incluir-titular.component.ts' containing 0 file(s)
2026-10-19T16:01:01.8656290Z 13:01:01.865 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-representantes-procuradores/components/modal-incluir-titular/modal-incluir-titular.component.ts'
2026-10-19T16:01:01.8666959Z 13:01:01.866 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-representantes-procuradores/components/modal-incluir-titular/modal-incluir-titular.component.ts'
2026-10-19T16:01:01.8669628Z 13:01:01.866 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/pages/abert-dados-representantes-procuradores/business/abert-dados-representantes-procuradores.business.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:01.8670053Z 13:01:01.866 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-dados-representantes-procuradores/business/abert-dados-representantes-procuradores.business.ts
2026-10-19T16:01:01.8685380Z 13:01:01.868 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/pages/abert-dados-representantes-procuradores/business/abert-dados-representantes-procuradores.business.ts" with linterId "default"
2026-10-19T16:01:02.0252828Z 13:01:02.024 DEBUG: Saving issue for rule no-commented-code on line 84
2026-10-19T16:01:02.0253248Z 13:01:02.025 DEBUG: Saving issue for rule no-commented-code on line 263
2026-10-19T16:01:02.0267763Z 13:01:02.026 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-representantes-procuradores/business/abert-dados-representantes-procuradores.business.ts' containing 0 file(s)
2026-10-19T16:01:02.0270861Z 13:01:02.026 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-representantes-procuradores/business/abert-dados-representantes-procuradores.business.ts'
2026-10-19T16:01:02.0290263Z 13:01:02.028 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-representantes-procuradores/business/abert-dados-representantes-procuradores.business.ts'
2026-10-19T16:01:02.0291098Z 13:01:02.029 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/dados-card-pessoa-conta.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.0291497Z 13:01:02.029 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/dados-card-pessoa-conta.model.ts
2026-10-19T16:01:02.0333190Z 13:01:02.033 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/dados-card-pessoa-conta.model.ts" with linterId "default"
2026-10-19T16:01:02.0406273Z 13:01:02.040 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/dados-card-pessoa-conta.model.ts' containing 0 file(s)
2026-10-19T16:01:02.0409150Z 13:01:02.040 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/dados-card-pessoa-conta.model.ts'
2026-10-19T16:01:02.0409639Z 13:01:02.040 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/dados-card-pessoa-conta.model.ts'
2026-10-19T16:01:02.0413508Z 13:01:02.040 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/pages/abert-dados-representantes-procuradores/components/abert-dados-representante-legal/abert-dados-representantes-procuradores.component.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.0424964Z 13:01:02.040 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-dados-representantes-procuradores/components/abert-dados-representante-legal/abert-dados-representantes-procuradores.component.ts
2026-10-19T16:01:02.0427560Z 13:01:02.042 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/pages/abert-dados-representantes-procuradores/components/abert-dados-representante-legal/abert-dados-representantes-procuradores.component.ts" with linterId "default"
2026-10-19T16:01:02.1345680Z 13:01:02.134 DEBUG: Saving issue for rule no-primitive-wrappers on line 52
2026-10-19T16:01:02.1360681Z 13:01:02.135 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-representantes-procuradores/components/abert-dados-representante-legal/abert-dados-representantes-procuradores.component.ts' containing 0 file(s)
2026-10-19T16:01:02.1365465Z 13:01:02.136 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-representantes-procuradores/components/abert-dados-representante-legal/abert-dados-representantes-procuradores.component.ts'
2026-10-19T16:01:02.1375932Z 13:01:02.137 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-representantes-procuradores/components/abert-dados-representante-legal/abert-dados-representantes-procuradores.component.ts'
2026-10-19T16:01:02.1376551Z 13:01:02.137 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@angular/cdk/table/index.d.ts'
2026-10-19T16:01:02.1376922Z 13:01:02.137 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@angular/material/sort/index.d.ts'
2026-10-19T16:01:02.1377680Z 13:01:02.137 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@angular/material/table/index.d.ts'
2026-10-19T16:01:02.1378043Z 13:01:02.137 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@angular/material/button/index.d.ts'
2026-10-19T16:01:02.1378336Z 13:01:02.137 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@angular/material/paginator/index.d.ts'
2026-10-19T16:01:02.1378652Z 13:01:02.137 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-paginator/dsc-paginator.component.d.ts'
2026-10-19T16:01:02.1378966Z 13:01:02.137 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-paginator/public-api.d.ts'
2026-10-19T16:01:02.1379268Z 13:01:02.137 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-paginator/index.d.ts'
2026-10-19T16:01:02.1379579Z 13:01:02.137 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-table/shared/dsc-table-column.d.ts'
2026-10-19T16:01:02.1379894Z 13:01:02.137 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-table/dsc-table.component.d.ts'
2026-10-19T16:01:02.1380535Z 13:01:02.137 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-table/shared/dsc-table-column-builder.d.ts'
2026-10-19T16:01:02.1383665Z 13:01:02.137 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-table/public-api.d.ts'
2026-10-19T16:01:02.1384312Z 13:01:02.137 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-table/index.d.ts'
2026-10-19T16:01:02.1384706Z 13:01:02.137 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/pages/abert-comprovante-operacao/components/abert-comprovante-operacao/abert-comprovante-operacao.component.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.1385135Z 13:01:02.137 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-comprovante-operacao/components/abert-comprovante-operacao/abert-comprovante-operacao.component.ts
2026-10-19T16:01:02.1397988Z 13:01:02.139 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/pages/abert-comprovante-operacao/components/abert-comprovante-operacao/abert-comprovante-operacao.component.ts" with linterId "default"
2026-10-19T16:01:02.2037264Z 13:01:02.203 DEBUG: Saving issue for rule unused-import on line 1
2026-10-19T16:01:02.2039173Z 13:01:02.203 DEBUG: Saving issue for rule unused-import on line 1
2026-10-19T16:01:02.2040557Z 13:01:02.203 DEBUG: Saving issue for rule unused-import on line 1
2026-10-19T16:01:02.2042610Z 13:01:02.204 DEBUG: Saving issue for rule unused-import on line 2
2026-10-19T16:01:02.2042924Z 13:01:02.204 DEBUG: Saving issue for rule no-empty-function on line 36
2026-10-19T16:01:02.2052966Z 13:01:02.205 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-comprovante-operacao/components/abert-comprovante-operacao/abert-comprovante-operacao.component.ts' containing 0 file(s)
2026-10-19T16:01:02.2057386Z 13:01:02.205 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-comprovante-operacao/components/abert-comprovante-operacao/abert-comprovante-operacao.component.ts'
2026-10-19T16:01:02.2064497Z 13:01:02.206 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-comprovante-operacao/components/abert-comprovante-operacao/abert-comprovante-operacao.component.ts'
2026-10-19T16:01:02.2066040Z 13:01:02.206 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/src/app/app-routing.module.ts'
2026-10-19T16:01:02.2066459Z 13:01:02.206 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/services/http-config-interceptor.service.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.2066777Z 13:01:02.206 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/services/http-config-interceptor.service.ts
2026-10-19T16:01:02.2121240Z 13:01:02.211 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/services/http-config-interceptor.service.ts" with linterId "default"
2026-10-19T16:01:02.2307616Z 13:01:02.230 DEBUG: Not enough content in 'src/app/services/http-config-interceptor.service.ts' to have CPD blocks, it will not be part of the duplication detection
2026-10-19T16:01:02.2314447Z 13:01:02.230 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/http-config-interceptor.service.ts' containing 0 file(s)
2026-10-19T16:01:02.2314881Z 13:01:02.230 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/http-config-interceptor.service.ts'
2026-10-19T16:01:02.2315343Z 13:01:02.230 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/http-config-interceptor.service.ts'
2026-10-19T16:01:02.2315731Z 13:01:02.231 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/shared/components/loading-caixa/loading-caixa.component.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.2316061Z 13:01:02.231 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/shared/components/loading-caixa/loading-caixa.component.ts
2026-10-19T16:01:02.2329835Z 13:01:02.232 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/shared/components/loading-caixa/loading-caixa.component.ts" with linterId "default"
2026-10-19T16:01:02.2476965Z 13:01:02.247 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/loading-caixa/loading-caixa.component.ts' containing 0 file(s)
2026-10-19T16:01:02.2504025Z 13:01:02.247 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/loading-caixa/loading-caixa.component.ts'
2026-10-19T16:01:02.2504531Z 13:01:02.248 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/loading-caixa/loading-caixa.component.ts'
2026-10-19T16:01:02.2504904Z 13:01:02.248 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/shared/components/common/constants.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.2505233Z 13:01:02.248 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/shared/components/common/constants.ts
2026-10-19T16:01:02.2505695Z 13:01:02.249 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/shared/components/common/constants.ts" with linterId "default"
2026-10-19T16:01:02.2649521Z 13:01:02.264 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/common/constants.ts' containing 0 file(s)
2026-10-19T16:01:02.2650543Z 13:01:02.264 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/common/constants.ts'
2026-10-19T16:01:02.2655352Z 13:01:02.265 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/common/constants.ts'
2026-10-19T16:01:02.2656828Z 13:01:02.265 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/shared/directives/cep.mask.directive.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.2657236Z 13:01:02.265 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/shared/directives/cep.mask.directive.ts
2026-10-19T16:01:02.2673422Z 13:01:02.267 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/shared/directives/cep.mask.directive.ts" with linterId "default"
2026-10-19T16:01:02.2813236Z 13:01:02.280 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/directives/cep.mask.directive.ts' containing 0 file(s)
2026-10-19T16:01:02.2813719Z 13:01:02.281 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/directives/cep.mask.directive.ts'
2026-10-19T16:01:02.2817464Z 13:01:02.281 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/directives/cep.mask.directive.ts'
2026-10-19T16:01:02.2819065Z 13:01:02.281 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/shared/directives/mes-ano.mask.directive.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.2819384Z 13:01:02.281 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/shared/directives/mes-ano.mask.directive.ts
2026-10-19T16:01:02.2833236Z 13:01:02.283 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/shared/directives/mes-ano.mask.directive.ts" with linterId "default"
2026-10-19T16:01:02.3034852Z 13:01:02.303 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/directives/mes-ano.mask.directive.ts' containing 0 file(s)
2026-10-19T16:01:02.3035370Z 13:01:02.303 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/directives/mes-ano.mask.directive.ts'
2026-10-19T16:01:02.3038945Z 13:01:02.303 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/directives/mes-ano.mask.directive.ts'
2026-10-19T16:01:02.3040091Z 13:01:02.303 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/shared/directives/apenas-numeros.directive.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.3040411Z 13:01:02.303 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/shared/directives/apenas-numeros.directive.ts
2026-10-19T16:01:02.3057027Z 13:01:02.305 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/shared/directives/apenas-numeros.directive.ts" with linterId "default"
2026-10-19T16:01:02.3210459Z 13:01:02.320 DEBUG: Saving issue for rule concise-regex on line 8
2026-10-19T16:01:02.3214600Z 13:01:02.321 DEBUG: Not enough content in 'src/app/shared/directives/apenas-numeros.directive.ts' to have CPD blocks, it will not be part of the duplication detection
2026-10-19T16:01:02.3215216Z 13:01:02.321 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/directives/apenas-numeros.directive.ts' containing 0 file(s)
2026-10-19T16:01:02.3221089Z 13:01:02.321 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/directives/apenas-numeros.directive.ts'
2026-10-19T16:01:02.3222900Z 13:01:02.322 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/directives/apenas-numeros.directive.ts'
2026-10-19T16:01:02.3223797Z 13:01:02.322 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/shared/shared.module.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.3224782Z 13:01:02.322 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/shared/shared.module.ts
2026-10-19T16:01:02.3243411Z 13:01:02.324 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/shared/shared.module.ts" with linterId "default"
2026-10-19T16:01:02.3440459Z 13:01:02.343 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/shared.module.ts' containing 0 file(s)
2026-10-19T16:01:02.3441308Z 13:01:02.343 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/shared.module.ts'
2026-10-19T16:01:02.3445353Z 13:01:02.344 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/shared.module.ts'
2026-10-19T16:01:02.3446143Z 13:01:02.344 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/pages/abert-comprovante-operacao/components/toggle-resumo-operacao/toggle-resumo-operacao.component.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.3446756Z 13:01:02.344 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-comprovante-operacao/components/toggle-resumo-operacao/toggle-resumo-operacao.component.ts
2026-10-19T16:01:02.3465638Z 13:01:02.346 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/pages/abert-comprovante-operacao/components/toggle-resumo-operacao/toggle-resumo-operacao.component.ts" with linterId "default"
2026-10-19T16:01:02.3597371Z 13:01:02.359 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-comprovante-operacao/components/toggle-resumo-operacao/toggle-resumo-operacao.component.ts' containing 0 file(s)
2026-10-19T16:01:02.3598373Z 13:01:02.359 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-comprovante-operacao/components/toggle-resumo-operacao/toggle-resumo-operacao.component.ts'
2026-10-19T16:01:02.3601391Z 13:01:02.360 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-comprovante-operacao/components/toggle-resumo-operacao/toggle-resumo-operacao.component.ts'
2026-10-19T16:01:02.3602753Z 13:01:02.360 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/shared/components/lista-editavel-telefones/lista-editavel-telefones.component.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.3603133Z 13:01:02.360 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/shared/components/lista-editavel-telefones/lista-editavel-telefones.component.ts
2026-10-19T16:01:02.3616614Z 13:01:02.361 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/shared/components/lista-editavel-telefones/lista-editavel-telefones.component.ts" with linterId "default"
2026-10-19T16:01:02.4137405Z 13:01:02.413 DEBUG: Saving issue for rule no-commented-code on line 76
2026-10-19T16:01:02.4144220Z 13:01:02.414 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/lista-editavel-telefones/lista-editavel-telefones.component.ts' containing 0 file(s)
2026-10-19T16:01:02.4147028Z 13:01:02.414 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/lista-editavel-telefones/lista-editavel-telefones.component.ts'
2026-10-19T16:01:02.4156394Z 13:01:02.415 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/lista-editavel-telefones/lista-editavel-telefones.component.ts'
2026-10-19T16:01:02.4157443Z 13:01:02.415 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/shared/directives/celular.mask.directive.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.4158066Z 13:01:02.415 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/shared/directives/celular.mask.directive.ts
2026-10-19T16:01:02.4173632Z 13:01:02.417 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/shared/directives/celular.mask.directive.ts" with linterId "default"
2026-10-19T16:01:02.4364803Z 13:01:02.436 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/directives/celular.mask.directive.ts' containing 0 file(s)
2026-10-19T16:01:02.4365511Z 13:01:02.436 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/directives/celular.mask.directive.ts'
2026-10-19T16:01:02.4368519Z 13:01:02.436 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/directives/celular.mask.directive.ts'
2026-10-19T16:01:02.4368881Z 13:01:02.436 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-input/dsc-input.component.d.ts'
2026-10-19T16:01:02.4369208Z 13:01:02.436 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-input/public-api.d.ts'
2026-10-19T16:01:02.4369505Z 13:01:02.436 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-input/index.d.ts'
2026-10-19T16:01:02.4370259Z 13:01:02.436 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/shared/components/lista-editavel-telefones/lista-editavel-telefones.module.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.4370622Z 13:01:02.436 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/shared/components/lista-editavel-telefones/lista-editavel-telefones.module.ts
2026-10-19T16:01:02.4383194Z 13:01:02.438 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/shared/components/lista-editavel-telefones/lista-editavel-telefones.module.ts" with linterId "default"
2026-10-19T16:01:02.4516859Z 13:01:02.451 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/lista-editavel-telefones/lista-editavel-telefones.module.ts' containing 0 file(s)
2026-10-19T16:01:02.4517687Z 13:01:02.451 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/lista-editavel-telefones/lista-editavel-telefones.module.ts'
2026-10-19T16:01:02.4520800Z 13:01:02.451 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/lista-editavel-telefones/lista-editavel-telefones.module.ts'
2026-10-19T16:01:02.4521184Z 13:01:02.452 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-card/dsc-card.component.d.ts'
2026-10-19T16:01:02.4521501Z 13:01:02.452 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-card/public-api.d.ts'
2026-10-19T16:01:02.4522146Z 13:01:02.452 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-card/index.d.ts'
2026-10-19T16:01:02.4522471Z 13:01:02.452 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-alert/dsc-alert.component.d.ts'
2026-10-19T16:01:02.4522782Z 13:01:02.452 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-alert/public-api.d.ts'
2026-10-19T16:01:02.4523089Z 13:01:02.452 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-alert/index.d.ts'
2026-10-19T16:01:02.4523406Z 13:01:02.452 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-textarea/dsc-textarea.component.d.ts'
2026-10-19T16:01:02.4523723Z 13:01:02.452 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-textarea/public-api.d.ts'
2026-10-19T16:01:02.4524367Z 13:01:02.452 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/sidsc-components/dsc-textarea/index.d.ts'
2026-10-19T16:01:02.4524791Z 13:01:02.452 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/pages/abert-dados-representantes-procuradores/components/abert-dados-representante-legal/card-pessoa-conta/card-pessoa-conta.component.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.4525262Z 13:01:02.452 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-dados-representantes-procuradores/components/abert-dados-representante-legal/card-pessoa-conta/card-pessoa-conta.component.ts
2026-10-19T16:01:02.4539389Z 13:01:02.453 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/pages/abert-dados-representantes-procuradores/components/abert-dados-representante-legal/card-pessoa-conta/card-pessoa-conta.component.ts" with linterId "default"
2026-10-19T16:01:02.5093348Z 13:01:02.506 DEBUG: Saving issue for rule unused-import on line 1
2026-10-19T16:01:02.5093641Z 13:01:02.506 DEBUG: Saving issue for rule unused-import on line 6
2026-10-19T16:01:02.5094229Z 13:01:02.507 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-representantes-procuradores/components/abert-dados-representante-legal/card-pessoa-conta/card-pessoa-conta.component.ts' containing 0 file(s)
2026-10-19T16:01:02.5094779Z 13:01:02.507 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-representantes-procuradores/components/abert-dados-representante-legal/card-pessoa-conta/card-pessoa-conta.component.ts'
2026-10-19T16:01:02.5095299Z 13:01:02.508 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-representantes-procuradores/components/abert-dados-representante-legal/card-pessoa-conta/card-pessoa-conta.component.ts'
2026-10-19T16:01:02.5095778Z 13:01:02.508 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/shared/components/stepper-dsc/stepper-dsc.component.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.5096108Z 13:01:02.508 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/shared/components/stepper-dsc/stepper-dsc.component.ts
2026-10-19T16:01:02.5104865Z 13:01:02.510 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/shared/components/stepper-dsc/stepper-dsc.component.ts" with linterId "default"
2026-10-19T16:01:02.5605858Z 13:01:02.560 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/stepper-dsc/stepper-dsc.component.ts' containing 0 file(s)
2026-10-19T16:01:02.5606589Z 13:01:02.560 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/stepper-dsc/stepper-dsc.component.ts'
2026-10-19T16:01:02.5612308Z 13:01:02.561 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/stepper-dsc/stepper-dsc.component.ts'
2026-10-19T16:01:02.5613828Z 13:01:02.561 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/app.module.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.5614187Z 13:01:02.561 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/app.module.ts
2026-10-19T16:01:02.5630734Z 13:01:02.562 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/app.module.ts" with linterId "default"
2026-10-19T16:01:02.6118127Z 13:01:02.610 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/app.module.ts' containing 0 file(s)
2026-10-19T16:01:02.6118558Z 13:01:02.610 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/app.module.ts'
2026-10-19T16:01:02.6118905Z 13:01:02.610 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/app.module.ts'
2026-10-19T16:01:02.6119470Z 13:01:02.611 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/single-spa-angular/src/prod-mode.d.ts'
2026-10-19T16:01:02.6119748Z 13:01:02.611 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/single-spa/typings/single-spa.d.ts'
2026-10-19T16:01:02.6120047Z 13:01:02.611 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/single-spa-angular/internals/types.d.ts'
2026-10-19T16:01:02.6120479Z 13:01:02.611 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/single-spa-angular/internals/dom.d.ts'
2026-10-19T16:01:02.6120778Z 13:01:02.611 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/single-spa-angular/internals/index.d.ts'
2026-10-19T16:01:02.6121067Z 13:01:02.611 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/single-spa-angular/src/types.d.ts'
2026-10-19T16:01:02.6121362Z 13:01:02.611 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/single-spa-angular/src/single-spa-angular.d.ts'
2026-10-19T16:01:02.6121697Z 13:01:02.611 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/single-spa-angular/src/extra-providers.d.ts'
2026-10-19T16:01:02.6122113Z 13:01:02.611 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/single-spa-angular/src/public_api.d.ts'
2026-10-19T16:01:02.6122398Z 13:01:02.611 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/single-spa-angular/index.d.ts'
2026-10-19T16:01:02.6122717Z 13:01:02.611 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/single-spa/single-spa-props.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.6122986Z 13:01:02.611 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/single-spa/single-spa-props.ts
2026-10-19T16:01:02.6137568Z 13:01:02.613 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/single-spa/single-spa-props.ts" with linterId "default"
2026-10-19T16:01:02.6222872Z 13:01:02.621 DEBUG: Not enough content in 'src/single-spa/single-spa-props.ts' to have CPD blocks, it will not be part of the duplication detection
2026-10-19T16:01:02.6223405Z 13:01:02.622 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/single-spa/single-spa-props.ts' containing 0 file(s)
2026-10-19T16:01:02.6229117Z 13:01:02.622 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/single-spa/single-spa-props.ts'
2026-10-19T16:01:02.6229512Z 13:01:02.622 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/single-spa/single-spa-props.ts'
2026-10-19T16:01:02.6229849Z 13:01:02.622 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/main.single-spa.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.6230127Z 13:01:02.622 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/main.single-spa.ts
2026-10-19T16:01:02.6251711Z 13:01:02.624 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/main.single-spa.ts" with linterId "default"
2026-10-19T16:01:02.6466542Z 13:01:02.645 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/main.single-spa.ts' containing 0 file(s)
2026-10-19T16:01:02.6466975Z 13:01:02.646 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/main.single-spa.ts'
2026-10-19T16:01:02.6467351Z 13:01:02.646 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/main.single-spa.ts'
2026-10-19T16:01:02.6467703Z 13:01:02.646 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/src/main.ts'
2026-10-19T16:01:02.6467992Z 13:01:02.646 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/polyfills.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.6468482Z 13:01:02.646 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/polyfills.ts
2026-10-19T16:01:02.6483634Z 13:01:02.648 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/polyfills.ts" with linterId "default"
2026-10-19T16:01:02.6584036Z 13:01:02.658 DEBUG: Not enough content in 'src/polyfills.ts' to have CPD blocks, it will not be part of the duplication detection
2026-10-19T16:01:02.6584761Z 13:01:02.658 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/polyfills.ts' containing 0 file(s)
2026-10-19T16:01:02.6586243Z 13:01:02.658 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/polyfills.ts'
2026-10-19T16:01:02.6588683Z 13:01:02.658 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/polyfills.ts'
2026-10-19T16:01:02.6589019Z 13:01:02.658 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@angular/core/testing/index.d.ts'
2026-10-19T16:01:02.6589982Z 13:01:02.658 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/app.component.spec.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.6590274Z 13:01:02.658 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/app.component.spec.ts
2026-10-19T16:01:02.6608340Z 13:01:02.660 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/app.component.spec.ts" with linterId "default"
2026-10-19T16:01:02.6753277Z 13:01:02.674 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/app.component.spec.ts' containing 0 file(s)
2026-10-19T16:01:02.6755412Z 13:01:02.675 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/app.component.spec.ts'
2026-10-19T16:01:02.6759767Z 13:01:02.675 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/app.component.spec.ts'
2026-10-19T16:01:02.6761527Z 13:01:02.676 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/enums/indicador-conta.enum.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.6761836Z 13:01:02.676 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/enums/indicador-conta.enum.ts
2026-10-19T16:01:02.6776735Z 13:01:02.677 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/enums/indicador-conta.enum.ts" with linterId "default"
2026-10-19T16:01:02.6844807Z 13:01:02.684 DEBUG: Not enough content in 'src/app/enums/indicador-conta.enum.ts' to have CPD blocks, it will not be part of the duplication detection
2026-10-19T16:01:02.6845287Z 13:01:02.684 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/enums/indicador-conta.enum.ts' containing 0 file(s)
2026-10-19T16:01:02.6845853Z 13:01:02.684 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/enums/indicador-conta.enum.ts'
2026-10-19T16:01:02.6848791Z 13:01:02.684 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/enums/indicador-conta.enum.ts'
2026-10-19T16:01:02.6850036Z 13:01:02.684 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/enums/tipo-assinatura-detalhe-conta.enum.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.6850485Z 13:01:02.684 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/enums/tipo-assinatura-detalhe-conta.enum.ts
2026-10-19T16:01:02.6866375Z 13:01:02.686 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/enums/tipo-assinatura-detalhe-conta.enum.ts" with linterId "default"
2026-10-19T16:01:02.6939073Z 13:01:02.693 DEBUG: Not enough content in 'src/app/enums/tipo-assinatura-detalhe-conta.enum.ts' to have CPD blocks, it will not be part of the duplication detection
2026-10-19T16:01:02.6939534Z 13:01:02.693 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/enums/tipo-assinatura-detalhe-conta.enum.ts' containing 0 file(s)
2026-10-19T16:01:02.6940336Z 13:01:02.693 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/enums/tipo-assinatura-detalhe-conta.enum.ts'
2026-10-19T16:01:02.6956303Z 13:01:02.694 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/enums/tipo-assinatura-detalhe-conta.enum.ts'
2026-10-19T16:01:02.6956720Z 13:01:02.694 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/enums/tipo-mandato.enum.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.6957180Z 13:01:02.694 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/enums/tipo-mandato.enum.ts
2026-10-19T16:01:02.7065481Z 13:01:02.695 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/enums/tipo-mandato.enum.ts" with linterId "default"
2026-10-19T16:01:02.7065991Z 13:01:02.703 DEBUG: Not enough content in 'src/app/enums/tipo-mandato.enum.ts' to have CPD blocks, it will not be part of the duplication detection
2026-10-19T16:01:02.7066381Z 13:01:02.703 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/enums/tipo-mandato.enum.ts' containing 0 file(s)
2026-10-19T16:01:02.7066757Z 13:01:02.703 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/enums/tipo-mandato.enum.ts'
2026-10-19T16:01:02.7067139Z 13:01:02.703 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/enums/tipo-mandato.enum.ts'
2026-10-19T16:01:02.7067473Z 13:01:02.704 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/enums/tipo-operacao.enum.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.7067765Z 13:01:02.704 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/enums/tipo-operacao.enum.ts
2026-10-19T16:01:02.7145517Z 13:01:02.709 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/enums/tipo-operacao.enum.ts" with linterId "default"
2026-10-19T16:01:02.7148877Z 13:01:02.714 DEBUG: Not enough content in 'src/app/enums/tipo-operacao.enum.ts' to have CPD blocks, it will not be part of the duplication detection
2026-10-19T16:01:02.7149313Z 13:01:02.714 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/enums/tipo-operacao.enum.ts' containing 0 file(s)
2026-10-19T16:01:02.7150730Z 13:01:02.714 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/enums/tipo-operacao.enum.ts'
2026-10-19T16:01:02.7153403Z 13:01:02.715 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/enums/tipo-operacao.enum.ts'
2026-10-19T16:01:02.7154956Z 13:01:02.715 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/request-cadastrar-senha.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.7155296Z 13:01:02.715 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/request-cadastrar-senha.model.ts
2026-10-19T16:01:02.7168698Z 13:01:02.716 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/request-cadastrar-senha.model.ts" with linterId "default"
2026-10-19T16:01:02.7260363Z 13:01:02.724 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/request-cadastrar-senha.model.ts' containing 0 file(s)
2026-10-19T16:01:02.7260958Z 13:01:02.724 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/request-cadastrar-senha.model.ts'
2026-10-19T16:01:02.7261354Z 13:01:02.724 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/request-cadastrar-senha.model.ts'
2026-10-19T16:01:02.7262250Z 13:01:02.724 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/request-consultar-traducao.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.7262788Z 13:01:02.724 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/request-consultar-traducao.model.ts
2026-10-19T16:01:02.7265613Z 13:01:02.726 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/request-consultar-traducao.model.ts" with linterId "default"
2026-10-19T16:01:02.7335236Z 13:01:02.733 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/request-consultar-traducao.model.ts' containing 0 file(s)
2026-10-19T16:01:02.7336622Z 13:01:02.733 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/request-consultar-traducao.model.ts'
2026-10-19T16:01:02.7339712Z 13:01:02.733 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/request-consultar-traducao.model.ts'
2026-10-19T16:01:02.7340749Z 13:01:02.734 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/request-contratar-sms.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.7341076Z 13:01:02.734 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/request-contratar-sms.model.ts
2026-10-19T16:01:02.7355938Z 13:01:02.735 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/request-contratar-sms.model.ts" with linterId "default"
2026-10-19T16:01:02.7416314Z 13:01:02.741 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/request-contratar-sms.model.ts' containing 0 file(s)
2026-10-19T16:01:02.7422952Z 13:01:02.741 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/request-contratar-sms.model.ts'
2026-10-19T16:01:02.7423411Z 13:01:02.742 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/request-contratar-sms.model.ts'
2026-10-19T16:01:02.7425772Z 13:01:02.742 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/request-gerar-ass-eletronica.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.7426355Z 13:01:02.742 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/request-gerar-ass-eletronica.model.ts
2026-10-19T16:01:02.7438446Z 13:01:02.743 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/request-gerar-ass-eletronica.model.ts" with linterId "default"
2026-10-19T16:01:02.7514994Z 13:01:02.750 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/request-gerar-ass-eletronica.model.ts' containing 0 file(s)
2026-10-19T16:01:02.7515475Z 13:01:02.750 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/request-gerar-ass-eletronica.model.ts'
2026-10-19T16:01:02.7515865Z 13:01:02.750 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/request-gerar-ass-eletronica.model.ts'
2026-10-19T16:01:02.7516256Z 13:01:02.751 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/response-cadastrar-senha.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.7516574Z 13:01:02.751 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/response-cadastrar-senha.model.ts
2026-10-19T16:01:02.7541026Z 13:01:02.753 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/response-cadastrar-senha.model.ts" with linterId "default"
2026-10-19T16:01:02.7594946Z 13:01:02.759 DEBUG: Not enough content in 'src/app/models/response-cadastrar-senha.model.ts' to have CPD blocks, it will not be part of the duplication detection
2026-10-19T16:01:02.7595593Z 13:01:02.759 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-cadastrar-senha.model.ts' containing 0 file(s)
2026-10-19T16:01:02.7598091Z 13:01:02.759 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-cadastrar-senha.model.ts'
2026-10-19T16:01:02.7601191Z 13:01:02.759 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-cadastrar-senha.model.ts'
2026-10-19T16:01:02.7601957Z 13:01:02.760 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/response-consultar-imagem-dossie.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.7602414Z 13:01:02.760 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/response-consultar-imagem-dossie.model.ts
2026-10-19T16:01:02.7616366Z 13:01:02.761 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/response-consultar-imagem-dossie.model.ts" with linterId "default"
2026-10-19T16:01:02.7704001Z 13:01:02.768 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-consultar-imagem-dossie.model.ts' containing 0 file(s)
2026-10-19T16:01:02.7704669Z 13:01:02.768 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-consultar-imagem-dossie.model.ts'
2026-10-19T16:01:02.7705209Z 13:01:02.769 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-consultar-imagem-dossie.model.ts'
2026-10-19T16:01:02.7705723Z 13:01:02.769 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/response-consultar-parametros-publicos.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.7706166Z 13:01:02.769 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/response-consultar-parametros-publicos.model.ts
2026-10-19T16:01:02.7710455Z 13:01:02.770 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/response-consultar-parametros-publicos.model.ts" with linterId "default"
2026-10-19T16:01:02.7765223Z 13:01:02.776 DEBUG: Not enough content in 'src/app/models/response-consultar-parametros-publicos.model.ts' to have CPD blocks, it will not be part of the duplication detection
2026-10-19T16:01:02.7765956Z 13:01:02.776 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-consultar-parametros-publicos.model.ts' containing 0 file(s)
2026-10-19T16:01:02.7767959Z 13:01:02.776 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-consultar-parametros-publicos.model.ts'
2026-10-19T16:01:02.7771846Z 13:01:02.777 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-consultar-parametros-publicos.model.ts'
2026-10-19T16:01:02.7773065Z 13:01:02.777 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/response-consultar-traducao.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.7773393Z 13:01:02.777 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/response-consultar-traducao.model.ts
2026-10-19T16:01:02.7786741Z 13:01:02.778 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/response-consultar-traducao.model.ts" with linterId "default"
2026-10-19T16:01:02.7843776Z 13:01:02.784 DEBUG: Not enough content in 'src/app/models/response-consultar-traducao.model.ts' to have CPD blocks, it will not be part of the duplication detection
2026-10-19T16:01:02.7844294Z 13:01:02.784 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-consultar-traducao.model.ts' containing 0 file(s)
2026-10-19T16:01:02.7861936Z 13:01:02.784 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-consultar-traducao.model.ts'
2026-10-19T16:01:02.7862615Z 13:01:02.784 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-consultar-traducao.model.ts'
2026-10-19T16:01:02.7862981Z 13:01:02.784 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/response-contratar-sms.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.7863287Z 13:01:02.785 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/response-contratar-sms.model.ts
2026-10-19T16:01:02.7863779Z 13:01:02.786 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/response-contratar-sms.model.ts" with linterId "default"
2026-10-19T16:01:02.7919745Z 13:01:02.791 DEBUG: Not enough content in 'src/app/models/response-contratar-sms.model.ts' to have CPD blocks, it will not be part of the duplication detection
2026-10-19T16:01:02.7920192Z 13:01:02.791 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-contratar-sms.model.ts' containing 0 file(s)
2026-10-19T16:01:02.7924769Z 13:01:02.792 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-contratar-sms.model.ts'
2026-10-19T16:01:02.7934766Z 13:01:02.792 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-contratar-sms.model.ts'
2026-10-19T16:01:02.7935180Z 13:01:02.792 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/response-gerar-ass-eletronica.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.7937579Z 13:01:02.792 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/response-gerar-ass-eletronica.model.ts
2026-10-19T16:01:02.7976261Z 13:01:02.797 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/response-gerar-ass-eletronica.model.ts" with linterId "default"
2026-10-19T16:01:02.8051048Z 13:01:02.804 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-gerar-ass-eletronica.model.ts' containing 0 file(s)
2026-10-19T16:01:02.8053112Z 13:01:02.805 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-gerar-ass-eletronica.model.ts'
2026-10-19T16:01:02.8055913Z 13:01:02.805 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-gerar-ass-eletronica.model.ts'
2026-10-19T16:01:02.8058307Z 13:01:02.805 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/response-receita-pf.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.8058618Z 13:01:02.805 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/response-receita-pf.model.ts
2026-10-19T16:01:02.8075799Z 13:01:02.807 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/response-receita-pf.model.ts" with linterId "default"
2026-10-19T16:01:02.8159527Z 13:01:02.815 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-receita-pf.model.ts' containing 0 file(s)
2026-10-19T16:01:02.8161420Z 13:01:02.816 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-receita-pf.model.ts'
2026-10-19T16:01:02.8165062Z 13:01:02.816 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-receita-pf.model.ts'
2026-10-19T16:01:02.8166455Z 13:01:02.816 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/response-resumo-cliente-pj.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.8166771Z 13:01:02.816 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/response-resumo-cliente-pj.model.ts
2026-10-19T16:01:02.8184394Z 13:01:02.818 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/response-resumo-cliente-pj.model.ts" with linterId "default"
2026-10-19T16:01:02.8268307Z 13:01:02.826 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-resumo-cliente-pj.model.ts' containing 0 file(s)
2026-10-19T16:01:02.8269546Z 13:01:02.826 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-resumo-cliente-pj.model.ts'
2026-10-19T16:01:02.8278132Z 13:01:02.827 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/response-resumo-cliente-pj.model.ts'
2026-10-19T16:01:02.8278933Z 13:01:02.827 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/models/consultas-cadastrais/response-receita-pf-old.model.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.8279630Z 13:01:02.827 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/models/consultas-cadastrais/response-receita-pf-old.model.ts
2026-10-19T16:01:02.8319843Z 13:01:02.829 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/models/consultas-cadastrais/response-receita-pf-old.model.ts" with linterId "default"
2026-10-19T16:01:02.8383798Z 13:01:02.835 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/consultas-cadastrais/response-receita-pf-old.model.ts' containing 0 file(s)
2026-10-19T16:01:02.8384385Z 13:01:02.836 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/consultas-cadastrais/response-receita-pf-old.model.ts'
2026-10-19T16:01:02.8384933Z 13:01:02.836 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/models/consultas-cadastrais/response-receita-pf-old.model.ts'
2026-10-19T16:01:02.8385332Z 13:01:02.836 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/pages/abert-comprovante-operacao/business/abert-comprovante-operacao.business.spec.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.8385703Z 13:01:02.836 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-comprovante-operacao/business/abert-comprovante-operacao.business.spec.ts
2026-10-19T16:01:02.8395519Z 13:01:02.839 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/pages/abert-comprovante-operacao/business/abert-comprovante-operacao.business.spec.ts" with linterId "default"
2026-10-19T16:01:02.8566995Z 13:01:02.856 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-comprovante-operacao/business/abert-comprovante-operacao.business.spec.ts' containing 0 file(s)
2026-10-19T16:01:02.8567916Z 13:01:02.856 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-comprovante-operacao/business/abert-comprovante-operacao.business.spec.ts'
2026-10-19T16:01:02.8572380Z 13:01:02.857 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-comprovante-operacao/business/abert-comprovante-operacao.business.spec.ts'
2026-10-19T16:01:02.8573082Z 13:01:02.857 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/pages/abert-comprovante-operacao/business/modal-config-contrato-relacionamento.business.spec.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.8573661Z 13:01:02.857 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-comprovante-operacao/business/modal-config-contrato-relacionamento.business.spec.ts
2026-10-19T16:01:02.8670121Z 13:01:02.866 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/pages/abert-comprovante-operacao/business/modal-config-contrato-relacionamento.business.spec.ts" with linterId "default"
2026-10-19T16:01:02.8830755Z 13:01:02.882 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-comprovante-operacao/business/modal-config-contrato-relacionamento.business.spec.ts' containing 0 file(s)
2026-10-19T16:01:02.8831600Z 13:01:02.882 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-comprovante-operacao/business/modal-config-contrato-relacionamento.business.spec.ts'
2026-10-19T16:01:02.8834262Z 13:01:02.883 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-comprovante-operacao/business/modal-config-contrato-relacionamento.business.spec.ts'
2026-10-19T16:01:02.8835839Z 13:01:02.883 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/pages/abert-comprovante-operacao/business/modal-config-faa.business.spec.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.8836244Z 13:01:02.883 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-comprovante-operacao/business/modal-config-faa.business.spec.ts
2026-10-19T16:01:02.8850355Z 13:01:02.884 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/pages/abert-comprovante-operacao/business/modal-config-faa.business.spec.ts" with linterId "default"
2026-10-19T16:01:02.9042537Z 13:01:02.903 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-comprovante-operacao/business/modal-config-faa.business.spec.ts' containing 0 file(s)
2026-10-19T16:01:02.9043083Z 13:01:02.904 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-comprovante-operacao/business/modal-config-faa.business.spec.ts'
2026-10-19T16:01:02.9046432Z 13:01:02.904 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-comprovante-operacao/business/modal-config-faa.business.spec.ts'
2026-10-19T16:01:02.9047834Z 13:01:02.904 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/pages/abert-comprovante-operacao/components/abert-comprovante-operacao/abert-comprovante-operacao.component.spec.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.9048276Z 13:01:02.904 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-comprovante-operacao/components/abert-comprovante-operacao/abert-comprovante-operacao.component.spec.ts
2026-10-19T16:01:02.9064137Z 13:01:02.906 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/pages/abert-comprovante-operacao/components/abert-comprovante-operacao/abert-comprovante-operacao.component.spec.ts" with linterId "default"
2026-10-19T16:01:02.9190542Z 13:01:02.918 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-comprovante-operacao/components/abert-comprovante-operacao/abert-comprovante-operacao.component.spec.ts' containing 0 file(s)
2026-10-19T16:01:02.9191418Z 13:01:02.919 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-comprovante-operacao/components/abert-comprovante-operacao/abert-comprovante-operacao.component.spec.ts'
2026-10-19T16:01:02.9203162Z 13:01:02.919 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-comprovante-operacao/components/abert-comprovante-operacao/abert-comprovante-operacao.component.spec.ts'
2026-10-19T16:01:02.9203683Z 13:01:02.919 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/pages/abert-comprovante-operacao/components/modal-config-contrato/modal-config-contrato.component.spec.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.9204147Z 13:01:02.919 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-comprovante-operacao/components/modal-config-contrato/modal-config-contrato.component.spec.ts
2026-10-19T16:01:02.9210930Z 13:01:02.920 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/pages/abert-comprovante-operacao/components/modal-config-contrato/modal-config-contrato.component.spec.ts" with linterId "default"
2026-10-19T16:01:02.9274014Z 13:01:02.927 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-comprovante-operacao/components/modal-config-contrato/modal-config-contrato.component.spec.ts' containing 0 file(s)
2026-10-19T16:01:02.9275610Z 13:01:02.927 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-comprovante-operacao/components/modal-config-contrato/modal-config-contrato.component.spec.ts'
2026-10-19T16:01:02.9278150Z 13:01:02.927 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-comprovante-operacao/components/modal-config-contrato/modal-config-contrato.component.spec.ts'
2026-10-19T16:01:02.9280332Z 13:01:02.927 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/pages/abert-comprovante-operacao/components/modal-config-faa/modal-config-faa.component.spec.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.9280725Z 13:01:02.927 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-comprovante-operacao/components/modal-config-faa/modal-config-faa.component.spec.ts
2026-10-19T16:01:02.9320324Z 13:01:02.929 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/pages/abert-comprovante-operacao/components/modal-config-faa/modal-config-faa.component.spec.ts" with linterId "default"
2026-10-19T16:01:02.9363643Z 13:01:02.936 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-comprovante-operacao/components/modal-config-faa/modal-config-faa.component.spec.ts' containing 0 file(s)
2026-10-19T16:01:02.9364983Z 13:01:02.936 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-comprovante-operacao/components/modal-config-faa/modal-config-faa.component.spec.ts'
2026-10-19T16:01:02.9368084Z 13:01:02.936 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-comprovante-operacao/components/modal-config-faa/modal-config-faa.component.spec.ts'
2026-10-19T16:01:02.9369691Z 13:01:02.936 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/pages/abert-comprovante-operacao/components/toggle-resumo-operacao/toggle-resumo-operacao.component.spec.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.9370098Z 13:01:02.936 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-comprovante-operacao/components/toggle-resumo-operacao/toggle-resumo-operacao.component.spec.ts
2026-10-19T16:01:02.9383769Z 13:01:02.938 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/pages/abert-comprovante-operacao/components/toggle-resumo-operacao/toggle-resumo-operacao.component.spec.ts" with linterId "default"
2026-10-19T16:01:02.9441311Z 13:01:02.943 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-comprovante-operacao/components/toggle-resumo-operacao/toggle-resumo-operacao.component.spec.ts' containing 0 file(s)
2026-10-19T16:01:02.9450759Z 13:01:02.944 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-comprovante-operacao/components/toggle-resumo-operacao/toggle-resumo-operacao.component.spec.ts'
2026-10-19T16:01:02.9451287Z 13:01:02.944 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-comprovante-operacao/components/toggle-resumo-operacao/toggle-resumo-operacao.component.spec.ts'
2026-10-19T16:01:02.9451673Z 13:01:02.944 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@angular/common/http/testing/index.d.ts'
2026-10-19T16:01:02.9452036Z 13:01:02.944 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/pages/abert-dados-gerais/business/abert-dados-gerais-conta.business.spec.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.9452660Z 13:01:02.944 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-dados-gerais/business/abert-dados-gerais-conta.business.spec.ts
2026-10-19T16:01:02.9476341Z 13:01:02.947 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/pages/abert-dados-gerais/business/abert-dados-gerais-conta.business.spec.ts" with linterId "default"
2026-10-19T16:01:02.9776715Z 13:01:02.977 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-gerais/business/abert-dados-gerais-conta.business.spec.ts' containing 0 file(s)
2026-10-19T16:01:02.9777222Z 13:01:02.977 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-gerais/business/abert-dados-gerais-conta.business.spec.ts'
2026-10-19T16:01:02.9784426Z 13:01:02.978 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-gerais/business/abert-dados-gerais-conta.business.spec.ts'
2026-10-19T16:01:02.9785566Z 13:01:02.978 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/pages/abert-dados-gerais/business/abert-dados-gerais.business.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:02.9786162Z 13:01:02.978 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-dados-gerais/business/abert-dados-gerais.business.ts
2026-10-19T16:01:02.9804096Z 13:01:02.980 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/pages/abert-dados-gerais/business/abert-dados-gerais.business.ts" with linterId "default"
2026-10-19T16:01:03.0808719Z 13:01:03.080 DEBUG: Saving issue for rule unused-import on line 3
2026-10-19T16:01:03.0810048Z 13:01:03.080 DEBUG: Saving issue for rule unused-import on line 5
2026-10-19T16:01:03.0811022Z 13:01:03.081 DEBUG: Saving issue for rule unused-import on line 14
2026-10-19T16:01:03.0819334Z 13:01:03.081 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-gerais/business/abert-dados-gerais.business.ts' containing 0 file(s)
2026-10-19T16:01:03.0822519Z 13:01:03.082 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-gerais/business/abert-dados-gerais.business.ts'
2026-10-19T16:01:03.0833792Z 13:01:03.083 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-gerais/business/abert-dados-gerais.business.ts'
2026-10-19T16:01:03.0836768Z 13:01:03.083 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/pages/abert-dados-gerais/components/abert-dados-gerais-conta/abert-dados-gerais-conta.component.spec.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:03.0837792Z 13:01:03.083 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-dados-gerais/components/abert-dados-gerais-conta/abert-dados-gerais-conta.component.spec.ts
2026-10-19T16:01:03.0856834Z 13:01:03.085 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/pages/abert-dados-gerais/components/abert-dados-gerais-conta/abert-dados-gerais-conta.component.spec.ts" with linterId "default"
2026-10-19T16:01:03.0998105Z 13:01:03.099 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-gerais/components/abert-dados-gerais-conta/abert-dados-gerais-conta.component.spec.ts' containing 0 file(s)
2026-10-19T16:01:03.0998947Z 13:01:03.099 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-gerais/components/abert-dados-gerais-conta/abert-dados-gerais-conta.component.spec.ts'
2026-10-19T16:01:03.1011067Z 13:01:03.100 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-gerais/components/abert-dados-gerais-conta/abert-dados-gerais-conta.component.spec.ts'
2026-10-19T16:01:03.1012124Z 13:01:03.100 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/pages/abert-dados-gerais/factory/abert-dados-gerais-conta.factory.spec.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:03.1012716Z 13:01:03.100 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-dados-gerais/factory/abert-dados-gerais-conta.factory.spec.ts
2026-10-19T16:01:03.1022400Z 13:01:03.101 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/pages/abert-dados-gerais/factory/abert-dados-gerais-conta.factory.spec.ts" with linterId "default"
2026-10-19T16:01:03.1117868Z 13:01:03.111 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-gerais/factory/abert-dados-gerais-conta.factory.spec.ts' containing 0 file(s)
2026-10-19T16:01:03.1120026Z 13:01:03.111 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-gerais/factory/abert-dados-gerais-conta.factory.spec.ts'
2026-10-19T16:01:03.1124905Z 13:01:03.112 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-gerais/factory/abert-dados-gerais-conta.factory.spec.ts'
2026-10-19T16:01:03.1125751Z 13:01:03.112 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/pages/abert-dados-representantes-procuradores/business/abert-dados-representantes-procuradores.business.spec.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:03.1126525Z 13:01:03.112 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-dados-representantes-procuradores/business/abert-dados-representantes-procuradores.business.spec.ts
2026-10-19T16:01:03.1185793Z 13:01:03.116 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/pages/abert-dados-representantes-procuradores/business/abert-dados-representantes-procuradores.business.spec.ts" with linterId "default"
2026-10-19T16:01:03.1660182Z 13:01:03.158 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-representantes-procuradores/business/abert-dados-representantes-procuradores.business.spec.ts' containing 0 file(s)
2026-10-19T16:01:03.1660984Z 13:01:03.158 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-representantes-procuradores/business/abert-dados-representantes-procuradores.business.spec.ts'
2026-10-19T16:01:03.1661604Z 13:01:03.158 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-representantes-procuradores/business/abert-dados-representantes-procuradores.business.spec.ts'
2026-10-19T16:01:03.1662169Z 13:01:03.159 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/pages/abert-dados-representantes-procuradores/business/modal-incluir-titular.business.spec.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:03.1662675Z 13:01:03.159 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-dados-representantes-procuradores/business/modal-incluir-titular.business.spec.ts
2026-10-19T16:01:03.1687957Z 13:01:03.167 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/pages/abert-dados-representantes-procuradores/business/modal-incluir-titular.business.spec.ts" with linterId "default"
2026-10-19T16:01:03.1847056Z 13:01:03.184 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-representantes-procuradores/business/modal-incluir-titular.business.spec.ts' containing 0 file(s)
2026-10-19T16:01:03.1865537Z 13:01:03.184 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-representantes-procuradores/business/modal-incluir-titular.business.spec.ts'
2026-10-19T16:01:03.1866965Z 13:01:03.185 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-representantes-procuradores/business/modal-incluir-titular.business.spec.ts'
2026-10-19T16:01:03.1868165Z 13:01:03.185 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/pages/abert-dados-representantes-procuradores/components/abert-dados-representante-legal/abert-dados-representantes-procuradores.component.spec.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:03.1869361Z 13:01:03.185 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-dados-representantes-procuradores/components/abert-dados-representante-legal/abert-dados-representantes-procuradores.component.spec.ts
2026-10-19T16:01:03.1872478Z 13:01:03.187 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/pages/abert-dados-representantes-procuradores/components/abert-dados-representante-legal/abert-dados-representantes-procuradores.component.spec.ts" with linterId "default"
2026-10-19T16:01:03.1947657Z 13:01:03.194 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-representantes-procuradores/components/abert-dados-representante-legal/abert-dados-representantes-procuradores.component.spec.ts' containing 0 file(s)
2026-10-19T16:01:03.1948498Z 13:01:03.194 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-representantes-procuradores/components/abert-dados-representante-legal/abert-dados-representantes-procuradores.component.spec.ts'
2026-10-19T16:01:03.1949916Z 13:01:03.194 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-representantes-procuradores/components/abert-dados-representante-legal/abert-dados-representantes-procuradores.component.spec.ts'
2026-10-19T16:01:03.1951167Z 13:01:03.195 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/pages/abert-dados-representantes-procuradores/components/modal-incluir-titular/modal-incluir-titular.component.spec.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:03.1952192Z 13:01:03.195 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-dados-representantes-procuradores/components/modal-incluir-titular/modal-incluir-titular.component.spec.ts
2026-10-19T16:01:03.1964774Z 13:01:03.196 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/pages/abert-dados-representantes-procuradores/components/modal-incluir-titular/modal-incluir-titular.component.spec.ts" with linterId "default"
2026-10-19T16:01:03.2086957Z 13:01:03.208 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-representantes-procuradores/components/modal-incluir-titular/modal-incluir-titular.component.spec.ts' containing 0 file(s)
2026-10-19T16:01:03.2087607Z 13:01:03.208 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-representantes-procuradores/components/modal-incluir-titular/modal-incluir-titular.component.spec.ts'
2026-10-19T16:01:03.2092887Z 13:01:03.209 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/pages/abert-dados-representantes-procuradores/components/modal-incluir-titular/modal-incluir-titular.component.spec.ts'
2026-10-19T16:01:03.2093352Z 13:01:03.209 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/services/agencia.service.spec.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:03.2093759Z 13:01:03.209 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/services/agencia.service.spec.ts
2026-10-19T16:01:03.2105010Z 13:01:03.210 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/services/agencia.service.spec.ts" with linterId "default"
2026-10-19T16:01:03.2164704Z 13:01:03.216 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/agencia.service.spec.ts' containing 0 file(s)
2026-10-19T16:01:03.2166956Z 13:01:03.216 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/agencia.service.spec.ts'
2026-10-19T16:01:03.2171281Z 13:01:03.216 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/agencia.service.spec.ts'
2026-10-19T16:01:03.2171849Z 13:01:03.216 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/services/dados-abertura.service.spec.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:03.2172161Z 13:01:03.216 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/services/dados-abertura.service.spec.ts
2026-10-19T16:01:03.2205721Z 13:01:03.220 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/services/dados-abertura.service.spec.ts" with linterId "default"
2026-10-19T16:01:03.2482129Z 13:01:03.247 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/dados-abertura.service.spec.ts' containing 0 file(s)
2026-10-19T16:01:03.2483002Z 13:01:03.248 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/dados-abertura.service.spec.ts'
2026-10-19T16:01:03.2490146Z 13:01:03.248 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/dados-abertura.service.spec.ts'
2026-10-19T16:01:03.2491220Z 13:01:03.249 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/services/dados-relatorios.service.spec.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:03.2492171Z 13:01:03.249 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/services/dados-relatorios.service.spec.ts
2026-10-19T16:01:03.2507513Z 13:01:03.250 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/services/dados-relatorios.service.spec.ts" with linterId "default"
2026-10-19T16:01:03.2650633Z 13:01:03.260 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/dados-relatorios.service.spec.ts' containing 0 file(s)
2026-10-19T16:01:03.2651154Z 13:01:03.260 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/dados-relatorios.service.spec.ts'
2026-10-19T16:01:03.2651551Z 13:01:03.260 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/dados-relatorios.service.spec.ts'
2026-10-19T16:01:03.2651907Z 13:01:03.261 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/services/dialog.service.spec.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:03.2652201Z 13:01:03.261 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/services/dialog.service.spec.ts
2026-10-19T16:01:03.2652491Z 13:01:03.264 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/services/dialog.service.spec.ts" with linterId "default"
2026-10-19T16:01:03.2842255Z 13:01:03.283 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/dialog.service.spec.ts' containing 0 file(s)
2026-10-19T16:01:03.2842858Z 13:01:03.284 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/dialog.service.spec.ts'
2026-10-19T16:01:03.2853793Z 13:01:03.284 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/dialog.service.spec.ts'
2026-10-19T16:01:03.2854375Z 13:01:03.284 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/services/loading-caixa.service.spec.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:03.2854934Z 13:01:03.284 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/services/loading-caixa.service.spec.ts
2026-10-19T16:01:03.2873640Z 13:01:03.286 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/services/loading-caixa.service.spec.ts" with linterId "default"
2026-10-19T16:01:03.2919049Z 13:01:03.291 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/loading-caixa.service.spec.ts' containing 0 file(s)
2026-10-19T16:01:03.2929288Z 13:01:03.291 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/loading-caixa.service.spec.ts'
2026-10-19T16:01:03.2929905Z 13:01:03.292 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/loading-caixa.service.spec.ts'
2026-10-19T16:01:03.2930262Z 13:01:03.292 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/services/modal-dialogo.service.spec.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:03.2930587Z 13:01:03.292 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/services/modal-dialogo.service.spec.ts
2026-10-19T16:01:03.2957544Z 13:01:03.293 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/services/modal-dialogo.service.spec.ts" with linterId "default"
2026-10-19T16:01:03.2989953Z 13:01:03.298 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/modal-dialogo.service.spec.ts' containing 0 file(s)
2026-10-19T16:01:03.2991228Z 13:01:03.299 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/modal-dialogo.service.spec.ts'
2026-10-19T16:01:03.2999288Z 13:01:03.299 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/services/modal-dialogo.service.spec.ts'
2026-10-19T16:01:03.2999738Z 13:01:03.299 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/shared/components/common/constantes-testes-unitarios.factory.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:03.3000085Z 13:01:03.299 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/shared/components/common/constantes-testes-unitarios.factory.ts
2026-10-19T16:01:03.3007829Z 13:01:03.300 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/shared/components/common/constantes-testes-unitarios.factory.ts" with linterId "default"
2026-10-19T16:01:03.3663349Z 13:01:03.362 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/common/constantes-testes-unitarios.factory.ts' containing 0 file(s)
2026-10-19T16:01:03.3664062Z 13:01:03.363 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/common/constantes-testes-unitarios.factory.ts'
2026-10-19T16:01:03.3664531Z 13:01:03.365 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/common/constantes-testes-unitarios.factory.ts'
2026-10-19T16:01:03.3664947Z 13:01:03.365 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/shared/components/common/value-acessor-base.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:03.3665291Z 13:01:03.365 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/shared/components/common/value-acessor-base.ts
2026-10-19T16:01:03.3677032Z 13:01:03.367 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/shared/components/common/value-acessor-base.ts" with linterId "default"
2026-10-19T16:01:03.3974422Z 13:01:03.396 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/common/value-acessor-base.ts' containing 0 file(s)
2026-10-19T16:01:03.3974914Z 13:01:03.396 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/common/value-acessor-base.ts'
2026-10-19T16:01:03.3975538Z 13:01:03.397 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/common/value-acessor-base.ts'
2026-10-19T16:01:03.3975932Z 13:01:03.397 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/shared/components/consultas-cadastrais/consultas-cadastrais.component.spec.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:03.3976264Z 13:01:03.397 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/shared/components/consultas-cadastrais/consultas-cadastrais.component.spec.ts
2026-10-19T16:01:03.3990175Z 13:01:03.398 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/shared/components/consultas-cadastrais/consultas-cadastrais.component.spec.ts" with linterId "default"
2026-10-19T16:01:03.4138491Z 13:01:03.412 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/consultas-cadastrais/consultas-cadastrais.component.spec.ts' containing 0 file(s)
2026-10-19T16:01:03.4139091Z 13:01:03.412 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/consultas-cadastrais/consultas-cadastrais.component.spec.ts'
2026-10-19T16:01:03.4139569Z 13:01:03.412 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/consultas-cadastrais/consultas-cadastrais.component.spec.ts'
2026-10-19T16:01:03.4140032Z 13:01:03.413 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/shared/components/lista-editavel-telefones/lista-editavel-telefones.component.spec.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:03.4140430Z 13:01:03.413 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/shared/components/lista-editavel-telefones/lista-editavel-telefones.component.spec.ts
2026-10-19T16:01:03.4148402Z 13:01:03.414 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/shared/components/lista-editavel-telefones/lista-editavel-telefones.component.spec.ts" with linterId "default"
2026-10-19T16:01:03.4288105Z 13:01:03.427 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/lista-editavel-telefones/lista-editavel-telefones.component.spec.ts' containing 0 file(s)
2026-10-19T16:01:03.4288659Z 13:01:03.427 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/lista-editavel-telefones/lista-editavel-telefones.component.spec.ts'
2026-10-19T16:01:03.4289122Z 13:01:03.428 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/lista-editavel-telefones/lista-editavel-telefones.component.spec.ts'
2026-10-19T16:01:03.4289541Z 13:01:03.428 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/shared/components/lista-editavel-telefones/lista-editavel-telefones.spec.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:03.4289978Z 13:01:03.428 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/shared/components/lista-editavel-telefones/lista-editavel-telefones.spec.ts
2026-10-19T16:01:03.4297592Z 13:01:03.429 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/shared/components/lista-editavel-telefones/lista-editavel-telefones.spec.ts" with linterId "default"
2026-10-19T16:01:03.4393301Z 13:01:03.438 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/lista-editavel-telefones/lista-editavel-telefones.spec.ts' containing 0 file(s)
2026-10-19T16:01:03.4393954Z 13:01:03.438 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/lista-editavel-telefones/lista-editavel-telefones.spec.ts'
2026-10-19T16:01:03.4394408Z 13:01:03.438 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/lista-editavel-telefones/lista-editavel-telefones.spec.ts'
2026-10-19T16:01:03.4395013Z 13:01:03.438 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/shared/components/loading-caixa/loading-caixa.component.spec.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:03.4395354Z 13:01:03.438 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/shared/components/loading-caixa/loading-caixa.component.spec.ts
2026-10-19T16:01:03.4400131Z 13:01:03.439 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/shared/components/loading-caixa/loading-caixa.component.spec.ts" with linterId "default"
2026-10-19T16:01:03.4474511Z 13:01:03.446 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/loading-caixa/loading-caixa.component.spec.ts' containing 0 file(s)
2026-10-19T16:01:03.4475021Z 13:01:03.446 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/loading-caixa/loading-caixa.component.spec.ts'
2026-10-19T16:01:03.4475435Z 13:01:03.446 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/loading-caixa/loading-caixa.component.spec.ts'
2026-10-19T16:01:03.4475822Z 13:01:03.446 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/shared/components/modal-alerta/modal-alerta.component.spec.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:03.4476161Z 13:01:03.446 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/shared/components/modal-alerta/modal-alerta.component.spec.ts
2026-10-19T16:01:03.4483010Z 13:01:03.448 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/shared/components/modal-alerta/modal-alerta.component.spec.ts" with linterId "default"
2026-10-19T16:01:03.4548709Z 13:01:03.453 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/modal-alerta/modal-alerta.component.spec.ts' containing 0 file(s)
2026-10-19T16:01:03.4549190Z 13:01:03.454 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/modal-alerta/modal-alerta.component.spec.ts'
2026-10-19T16:01:03.4549589Z 13:01:03.454 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/modal-alerta/modal-alerta.component.spec.ts'
2026-10-19T16:01:03.4549982Z 13:01:03.454 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/shared/components/stepper-dsc/stepper-dsc.component.spec.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:03.4550305Z 13:01:03.454 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/shared/components/stepper-dsc/stepper-dsc.component.spec.ts
2026-10-19T16:01:03.4569628Z 13:01:03.456 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/shared/components/stepper-dsc/stepper-dsc.component.spec.ts" with linterId "default"
2026-10-19T16:01:03.4733465Z 13:01:03.472 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/stepper-dsc/stepper-dsc.component.spec.ts' containing 0 file(s)
2026-10-19T16:01:03.4734091Z 13:01:03.472 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/stepper-dsc/stepper-dsc.component.spec.ts'
2026-10-19T16:01:03.4734516Z 13:01:03.472 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/components/stepper-dsc/stepper-dsc.component.spec.ts'
2026-10-19T16:01:03.4734867Z 13:01:03.472 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/app/shared/utils/utils.spec.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:03.4735382Z 13:01:03.472 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/shared/utils/utils.spec.ts
2026-10-19T16:01:03.4743124Z 13:01:03.474 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/app/shared/utils/utils.spec.ts" with linterId "default"
2026-10-19T16:01:03.4839021Z 13:01:03.483 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/utils/utils.spec.ts' containing 0 file(s)
2026-10-19T16:01:03.4850754Z 13:01:03.483 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/utils/utils.spec.ts'
2026-10-19T16:01:03.4851402Z 13:01:03.484 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/app/shared/utils/utils.spec.ts'
2026-10-19T16:01:03.4851755Z 13:01:03.484 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/environments/environment.prod.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:03.4852057Z 13:01:03.484 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/environments/environment.prod.ts
2026-10-19T16:01:03.4859673Z 13:01:03.485 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/environments/environment.prod.ts" with linterId "default"
2026-10-19T16:01:03.4931288Z 13:01:03.491 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/environments/environment.prod.ts' containing 0 file(s)
2026-10-19T16:01:03.4931724Z 13:01:03.492 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/environments/environment.prod.ts'
2026-10-19T16:01:03.4934941Z 13:01:03.492 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/environments/environment.prod.ts'
2026-10-19T16:01:03.4935515Z 13:01:03.492 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/i18n/label.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:03.4935922Z 13:01:03.492 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/i18n/label.ts
2026-10-19T16:01:03.4950914Z 13:01:03.494 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/i18n/label.ts" with linterId "default"
2026-10-19T16:01:03.5059683Z 13:01:03.505 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/i18n/label.ts' containing 0 file(s)
2026-10-19T16:01:03.5060115Z 13:01:03.505 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/i18n/label.ts'
2026-10-19T16:01:03.5062720Z 13:01:03.506 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/i18n/label.ts'
2026-10-19T16:01:03.5063923Z 13:01:03.506 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/single-spa/asset-url.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:03.5064216Z 13:01:03.506 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/single-spa/asset-url.ts
2026-10-19T16:01:03.5079368Z 13:01:03.507 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/single-spa/asset-url.ts" with linterId "default"
2026-10-19T16:01:03.5214284Z 13:01:03.521 DEBUG: Not enough content in 'src/single-spa/asset-url.ts' to have CPD blocks, it will not be part of the duplication detection
2026-10-19T16:01:03.5214754Z 13:01:03.521 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/single-spa/asset-url.ts' containing 0 file(s)
2026-10-19T16:01:03.5217123Z 13:01:03.521 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/single-spa/asset-url.ts'
2026-10-19T16:01:03.5221385Z 13:01:03.522 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/single-spa/asset-url.ts'
2026-10-19T16:01:03.5223280Z 13:01:03.522 DEBUG: Cache strategy set to 'WRITE_ONLY' for file 'src/single-spa/asset-url.pipe.ts' as current analysis requires all files to be analyzed
2026-10-19T16:01:03.5223820Z 13:01:03.522 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/single-spa/asset-url.pipe.ts
2026-10-19T16:01:03.5237138Z 13:01:03.523 DEBUG: Analyzing file "/opt/ads-agent/_work/21/s/src/single-spa/asset-url.pipe.ts" with linterId "default"
2026-10-19T16:01:03.5326156Z 13:01:03.532 DEBUG: Not enough content in 'src/single-spa/asset-url.pipe.ts' to have CPD blocks, it will not be part of the duplication detection
2026-10-19T16:01:03.5326617Z 13:01:03.532 DEBUG: Cache entry created for key 'jssecurity:ucfgs:SEQ:9.13.0.20537:SIPNC-conta1288judi-microfront:src/single-spa/asset-url.pipe.ts' containing 0 file(s)
2026-10-19T16:01:03.5327935Z 13:01:03.532 DEBUG: Cache entry created for key 'jssecurity:ucfgs:JSON:9.13.0.20537:SIPNC-conta1288judi-microfront:src/single-spa/asset-url.pipe.ts'
2026-10-19T16:01:03.5330432Z 13:01:03.532 DEBUG: Cache entry created for key 'js:filemetadata:9.13.0.20537:SIPNC-conta1288judi-microfront:src/single-spa/asset-url.pipe.ts'
2026-10-19T16:01:03.5330904Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@babel/types/lib/index.d.ts'
2026-10-19T16:01:03.5331333Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/babel__generator/index.d.ts'
2026-10-19T16:01:03.5331651Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@babel/parser/typings/babel-parser.d.ts'
2026-10-19T16:01:03.5331940Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/babel__template/index.d.ts'
2026-10-19T16:01:03.5332229Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/babel__traverse/index.d.ts'
2026-10-19T16:01:03.5332496Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/babel__core/index.d.ts'
2026-10-19T16:01:03.5332774Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/node/assert.d.ts'
2026-10-19T16:01:03.5333061Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/node/globals.d.ts'
2026-10-19T16:01:03.5333335Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/node/async_hooks.d.ts'
2026-10-19T16:01:03.5333601Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/node/buffer.d.ts'
2026-10-19T16:01:03.5333932Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/node/child_process.d.ts'
2026-10-19T16:01:03.5334220Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/node/cluster.d.ts'
2026-10-19T16:01:03.5334485Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/node/console.d.ts'
2026-10-19T16:01:03.5334750Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/node/constants.d.ts'
2026-10-19T16:01:03.5335005Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/node/crypto.d.ts'
2026-10-19T16:01:03.5335273Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/node/dgram.d.ts'
2026-10-19T16:01:03.5335539Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/node/dns.d.ts'
2026-10-19T16:01:03.5335810Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/node/domain.d.ts'
2026-10-19T16:01:03.5336080Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/node/events.d.ts'
2026-10-19T16:01:03.5336337Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/node/fs.d.ts'
2026-10-19T16:01:03.5336599Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/node/http.d.ts'
2026-10-19T16:01:03.5336972Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/node/http2.d.ts'
2026-10-19T16:01:03.5337239Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/node/https.d.ts'
2026-10-19T16:01:03.5337513Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/node/inspector.d.ts'
2026-10-19T16:01:03.5337765Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/node/module.d.ts'
2026-10-19T16:01:03.5338062Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/node/net.d.ts'
2026-10-19T16:01:03.5338320Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/node/os.d.ts'
2026-10-19T16:01:03.5338587Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/node/path.d.ts'
2026-10-19T16:01:03.5338860Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/node/perf_hooks.d.ts'
2026-10-19T16:01:03.5339130Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/node/process.d.ts'
2026-10-19T16:01:03.5339400Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/node/punycode.d.ts'
2026-10-19T16:01:03.5339668Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/node/querystring.d.ts'
2026-10-19T16:01:03.5339924Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/node/readline.d.ts'
2026-10-19T16:01:03.5340186Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/node/repl.d.ts'
2026-10-19T16:01:03.5340443Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/node/stream.d.ts'
2026-10-19T16:01:03.5340715Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/node/string_decoder.d.ts'
2026-10-19T16:01:03.5340986Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/node/timers.d.ts'
2026-10-19T16:01:03.5341245Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/node/tls.d.ts'
2026-10-19T16:01:03.5341508Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/node/trace_events.d.ts'
2026-10-19T16:01:03.5341769Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/node/tty.d.ts'
2026-10-19T16:01:03.5342033Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/node/url.d.ts'
2026-10-19T16:01:03.5342282Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/node/util.d.ts'
2026-10-19T16:01:03.5342536Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/node/v8.d.ts'
2026-10-19T16:01:03.5342791Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/node/vm.d.ts'
2026-10-19T16:01:03.5343048Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/node/wasi.d.ts'
2026-10-19T16:01:03.5343316Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/node/worker_threads.d.ts'
2026-10-19T16:01:03.5343592Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/node/zlib.d.ts'
2026-10-19T16:01:03.5343913Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/node/globals.global.d.ts'
2026-10-19T16:01:03.5344198Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/node/index.d.ts'
2026-10-19T16:01:03.5344450Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/connect/index.d.ts'
2026-10-19T16:01:03.5344881Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/body-parser/index.d.ts'
2026-10-19T16:01:03.5345151Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/bonjour/index.d.ts'
2026-10-19T16:01:03.5345409Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/send/index.d.ts'
2026-10-19T16:01:03.5345706Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/qs/index.d.ts'
2026-10-19T16:01:03.5345978Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/range-parser/index.d.ts'
2026-10-19T16:01:03.5346269Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/express-serve-static-core/index.d.ts'
2026-10-19T16:01:03.5346568Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/connect-history-api-fallback/index.d.ts'
2026-10-19T16:01:03.5346864Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/datatables.net-buttons/index.d.ts'
2026-10-19T16:01:03.5347125Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/estree/index.d.ts'
2026-10-19T16:01:03.5347394Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/http-errors/index.d.ts'
2026-10-19T16:01:03.5347663Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/mime/index.d.ts'
2026-10-19T16:01:03.5347986Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/serve-static/node_modules/@types/send/index.d.ts'
2026-10-19T16:01:03.5348275Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/serve-static/index.d.ts'
2026-10-19T16:01:03.5348593Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/express/node_modules/@types/express-serve-static-core/index.d.ts'
2026-10-19T16:01:03.5348882Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/express/index.d.ts'
2026-10-19T16:01:03.5349155Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/graceful-fs/index.d.ts'
2026-10-19T16:01:03.5349480Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/html-minifier-terser/index.d.ts'
2026-10-19T16:01:03.5349759Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/http-proxy/index.d.ts'
2026-10-19T16:01:03.5350043Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/istanbul-lib-coverage/index.d.ts'
2026-10-19T16:01:03.5350333Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/istanbul-lib-report/index.d.ts'
2026-10-19T16:01:03.5350605Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/istanbul-reports/index.d.ts'
2026-10-19T16:01:03.5350889Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@jest/expect-utils/build/index.d.ts'
2026-10-19T16:01:03.5351160Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/chalk/index.d.ts'
2026-10-19T16:01:03.5351434Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@sinclair/typebox/typebox.d.ts'
2026-10-19T16:01:03.5351709Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@jest/schemas/build/index.d.ts'
2026-10-19T16:01:03.5351983Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/pretty-format/build/index.d.ts'
2026-10-19T16:01:03.5352289Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/jest-diff/build/index.d.ts'
2026-10-19T16:01:03.5352568Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/jest-matcher-utils/build/index.d.ts'
2026-10-19T16:01:03.5352838Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/expect/build/index.d.ts'
2026-10-19T16:01:03.5353087Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/jest/index.d.ts'
2026-10-19T16:01:03.5353386Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/parse5/dist/common/html.d.ts'
2026-10-19T16:01:03.5353660Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/parse5/dist/common/token.d.ts'
2026-10-19T16:01:03.5354038Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/parse5/dist/common/error-codes.d.ts'
2026-10-19T16:01:03.5354340Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/parse5/dist/tokenizer/preprocessor.d.ts'
2026-10-19T16:01:03.5354658Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/parse5/node_modules/entities/dist/commonjs/generated/decode-data-html.d.ts'
2026-10-19T16:01:03.5354998Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/parse5/node_modules/entities/dist/commonjs/generated/decode-data-xml.d.ts'
2026-10-19T16:01:03.5355325Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/parse5/node_modules/entities/dist/commonjs/decode-codepoint.d.ts'
2026-10-19T16:01:03.5355634Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/parse5/node_modules/entities/dist/commonjs/decode.d.ts'
2026-10-19T16:01:03.5355928Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/parse5/node_modules/entities/decode.d.ts'
2026-10-19T16:01:03.5356196Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/parse5/dist/tokenizer/index.d.ts'
2026-10-19T16:01:03.5356481Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/parse5/dist/tree-adapters/interface.d.ts'
2026-10-19T16:01:03.5356770Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/parse5/dist/parser/open-element-stack.d.ts'
2026-10-19T16:01:03.5357066Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/parse5/dist/parser/formatting-element-list.d.ts'
2026-10-19T16:01:03.5357348Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/parse5/dist/parser/index.d.ts'
2026-10-19T16:01:03.5357629Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/parse5/dist/tree-adapters/default.d.ts'
2026-10-19T16:01:03.5357910Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/parse5/dist/serializer/index.d.ts'
2026-10-19T16:01:03.5358196Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/parse5/dist/common/foreign-content.d.ts'
2026-10-19T16:01:03.5358470Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/parse5/dist/index.d.ts'
2026-10-19T16:01:03.5358725Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/tough-cookie/index.d.ts'
2026-10-19T16:01:03.5358997Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/jsdom/base.d.ts'
2026-10-19T16:01:03.5359261Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/jsdom/index.d.ts'
2026-10-19T16:01:03.5359534Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/json-schema/index.d.ts'
2026-10-19T16:01:03.5359858Z 13:01:03.533 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/node-forge/index.d.ts'
2026-10-19T16:01:03.5360122Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/q/index.d.ts'
2026-10-19T16:01:03.5360390Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/retry/index.d.ts'
2026-10-19T16:01:03.5360666Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/selenium-webdriver/http.d.ts'
2026-10-19T16:01:03.5360985Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/selenium-webdriver/remote.d.ts'
2026-10-19T16:01:03.5361255Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/selenium-webdriver/chrome.d.ts'
2026-10-19T16:01:03.5361530Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/selenium-webdriver/edge.d.ts'
2026-10-19T16:01:03.5361808Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/selenium-webdriver/firefox.d.ts'
2026-10-19T16:01:03.5362208Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/selenium-webdriver/ie.d.ts'
2026-10-19T16:01:03.5362489Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/selenium-webdriver/opera.d.ts'
2026-10-19T16:01:03.5362770Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/selenium-webdriver/safari.d.ts'
2026-10-19T16:01:03.5363054Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/selenium-webdriver/index.d.ts'
2026-10-19T16:01:03.5363334Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/semver/functions/inc.d.ts'
2026-10-19T16:01:03.5363614Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/semver/classes/semver.d.ts'
2026-10-19T16:01:03.5363972Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/semver/functions/parse.d.ts'
2026-10-19T16:01:03.5364269Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/semver/functions/valid.d.ts'
2026-10-19T16:01:03.5364545Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/semver/functions/clean.d.ts'
2026-10-19T16:01:03.5364817Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/semver/functions/diff.d.ts'
2026-10-19T16:01:03.5365093Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/semver/functions/major.d.ts'
2026-10-19T16:01:03.5365367Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/semver/functions/minor.d.ts'
2026-10-19T16:01:03.5365638Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/semver/functions/patch.d.ts'
2026-10-19T16:01:03.5365911Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/semver/functions/prerelease.d.ts'
2026-10-19T16:01:03.5366189Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/semver/functions/compare.d.ts'
2026-10-19T16:01:03.5366452Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/semver/functions/rcompare.d.ts'
2026-10-19T16:01:03.5366740Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/semver/functions/compare-loose.d.ts'
2026-10-19T16:01:03.5367031Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/semver/functions/compare-build.d.ts'
2026-10-19T16:01:03.5367314Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/semver/functions/sort.d.ts'
2026-10-19T16:01:03.5367662Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/semver/functions/rsort.d.ts'
2026-10-19T16:01:03.5367939Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/semver/functions/truncate.d.ts'
2026-10-19T16:01:03.5368213Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/semver/functions/gt.d.ts'
2026-10-19T16:01:03.5368526Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/semver/functions/lt.d.ts'
2026-10-19T16:01:03.5368799Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/semver/functions/eq.d.ts'
2026-10-19T16:01:03.5369056Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/semver/functions/neq.d.ts'
2026-10-19T16:01:03.5369331Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/semver/functions/gte.d.ts'
2026-10-19T16:01:03.5369603Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/semver/functions/lte.d.ts'
2026-10-19T16:01:03.5369877Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/semver/functions/cmp.d.ts'
2026-10-19T16:01:03.5370151Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/semver/functions/coerce.d.ts'
2026-10-19T16:01:03.5370432Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/semver/classes/comparator.d.ts'
2026-10-19T16:01:03.5370707Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/semver/classes/range.d.ts'
2026-10-19T16:01:03.5370986Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/semver/functions/satisfies.d.ts'
2026-10-19T16:01:03.5371272Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/semver/ranges/max-satisfying.d.ts'
2026-10-19T16:01:03.5371542Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/semver/ranges/min-satisfying.d.ts'
2026-10-19T16:01:03.5371823Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/semver/ranges/to-comparators.d.ts'
2026-10-19T16:01:03.5372100Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/semver/ranges/min-version.d.ts'
2026-10-19T16:01:03.5372370Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/semver/ranges/valid.d.ts'
2026-10-19T16:01:03.5372644Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/semver/ranges/outside.d.ts'
2026-10-19T16:01:03.5372919Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/semver/ranges/gtr.d.ts'
2026-10-19T16:01:03.5373193Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/semver/ranges/ltr.d.ts'
2026-10-19T16:01:03.5373471Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/semver/ranges/intersects.d.ts'
2026-10-19T16:01:03.5373744Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/semver/ranges/simplify.d.ts'
2026-10-19T16:01:03.5374079Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/semver/ranges/subset.d.ts'
2026-10-19T16:01:03.5374353Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/semver/internals/identifiers.d.ts'
2026-10-19T16:01:03.5374626Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/semver/index.d.ts'
2026-10-19T16:01:03.5374937Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/serve-index/index.d.ts'
2026-10-19T16:01:03.5375210Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/sockjs/index.d.ts'
2026-10-19T16:01:03.5375481Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/stack-utils/index.d.ts'
2026-10-19T16:01:03.5375746Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/ws/index.d.ts'
2026-10-19T16:01:03.5376046Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/yargs-parser/index.d.ts'
2026-10-19T16:01:03.5376314Z 13:01:03.534 DEBUG: File not part of the project: '/opt/ads-agent/_work/21/s/node_modules/@types/yargs/index.d.ts'
2026-10-19T16:01:03.5376472Z 13:01:03.534 INFO: Analyzed 151 file(s) with current program
2026-10-19T16:01:03.5494864Z 13:01:03.539 INFO: 151/151 source files have been analyzed
2026-10-19T16:01:03.5495087Z 13:01:03.539 INFO: Hit the cache for 0 out of 151
2026-10-19T16:01:03.5495248Z 13:01:03.539 INFO: Miss the cache for 151 out of 151: ANALYSIS_MODE_INELIGIBLE [151/151]
2026-10-19T16:01:03.5495432Z 13:01:03.539 INFO: Sensor TypeScript analysis [javascript] (done) | time=6983ms
2026-10-19T16:01:03.5495593Z 13:01:03.539 INFO: Sensor CSS Rules [javascript]
2026-10-19T16:01:03.5495945Z 13:01:03.541 DEBUG: eslint-bridge server is up, no need to start.
2026-10-19T16:01:03.5496107Z 13:01:03.544 INFO: 30 source files to be analyzed
2026-10-19T16:01:03.5496429Z 13:01:03.545 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-dados-representantes-procuradores/components/modal-incluir-titular/modal-incluir-titular.component.html
2026-10-19T16:01:03.5496801Z 13:01:03.546 DEBUG: 'src/app/pages/abert-dados-representantes-procuradores/components/modal-incluir-titular/modal-incluir-titular.component.html' generated metadata with charset 'UTF-8'
2026-10-19T16:01:03.6182293Z 13:01:03.617 DEBUG: Found 0 issue(s)
2026-10-19T16:01:03.6191007Z 13:01:03.618 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/shared/components/modal-alerta/modal-alerta.component.css
2026-10-19T16:01:03.6282611Z 13:01:03.627 DEBUG: Found 0 issue(s)
2026-10-19T16:01:03.6297567Z 13:01:03.628 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/index.html
2026-10-19T16:01:03.6297859Z 13:01:03.629 DEBUG: 'src/index.html' generated metadata with charset 'UTF-8'
2026-10-19T16:01:03.6352556Z 13:01:03.635 DEBUG: Found 0 issue(s)
2026-10-19T16:01:03.6361937Z 13:01:03.636 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-comprovante-operacao/components/toggle-resumo-operacao/toggle-resumo-operacao.component.css
2026-10-19T16:01:03.6404006Z 13:01:03.640 DEBUG: Found 1 issue(s)
2026-10-19T16:01:03.6417309Z 13:01:03.641 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-dados-representantes-procuradores/components/abert-dados-representante-legal/card-pessoa-conta/card-pessoa-conta.component.scss
2026-10-19T16:01:03.6473074Z 13:01:03.647 DEBUG: Found 1 issue(s)
2026-10-19T16:01:03.6484347Z 13:01:03.648 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-dados-representantes-procuradores/components/modal-incluir-titular/modal-incluir-titular.component.css
2026-10-19T16:01:03.6566820Z 13:01:03.656 DEBUG: Found 1 issue(s)
2026-10-19T16:01:03.6577067Z 13:01:03.657 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-dados-representantes-procuradores/components/abert-dados-representante-legal/abert-dados-representantes-procuradores.component.html
2026-10-19T16:01:03.6579680Z 13:01:03.657 DEBUG: 'src/app/pages/abert-dados-representantes-procuradores/components/abert-dados-representante-legal/abert-dados-representantes-procuradores.component.html' generated metadata with charset 'UTF-8'
2026-10-19T16:01:03.6655880Z 13:01:03.665 DEBUG: Found 0 issue(s)
2026-10-19T16:01:03.6665035Z 13:01:03.666 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/shared/components/loading-caixa/loading-caixa.component.html
2026-10-19T16:01:03.6666168Z 13:01:03.666 DEBUG: 'src/app/shared/components/loading-caixa/loading-caixa.component.html' generated metadata with charset 'UTF-8'
2026-10-19T16:01:03.6718782Z 13:01:03.671 DEBUG: Found 0 issue(s)
2026-10-19T16:01:03.6729400Z 13:01:03.672 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-comprovante-operacao/components/modal-config-contrato/modal-config-contrato.component.html
2026-10-19T16:01:03.6730994Z 13:01:03.673 DEBUG: 'src/app/pages/abert-comprovante-operacao/components/modal-config-contrato/modal-config-contrato.component.html' generated metadata with charset 'UTF-8'
2026-10-19T16:01:03.6799847Z 13:01:03.679 DEBUG: Found 0 issue(s)
2026-10-19T16:01:03.6809178Z 13:01:03.680 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/shared/components/loading-caixa/loading-caixa.component.css
2026-10-19T16:01:03.6888746Z 13:01:03.688 DEBUG: Found 0 issue(s)
2026-10-19T16:01:03.6901437Z 13:01:03.689 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-comprovante-operacao/components/abert-comprovante-operacao/abert-comprovante-operacao.component.css
2026-10-19T16:01:03.7025089Z 13:01:03.702 DEBUG: Found 0 issue(s)
2026-10-19T16:01:03.7035685Z 13:01:03.703 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/shared/components/stepper-dsc/stepper-dsc.component.html
2026-10-19T16:01:03.7037219Z 13:01:03.703 DEBUG: 'src/app/shared/components/stepper-dsc/stepper-dsc.component.html' generated metadata with charset 'UTF-8'
2026-10-19T16:01:03.7100340Z 13:01:03.709 DEBUG: Found 0 issue(s)
2026-10-19T16:01:03.7109739Z 13:01:03.710 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/shared/components/lista-editavel-telefones/lista-editavel-telefones.component.css
2026-10-19T16:01:03.7149404Z 13:01:03.714 DEBUG: Found 0 issue(s)
2026-10-19T16:01:03.7158544Z 13:01:03.715 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-comprovante-operacao/components/modal-config-faa/modal-config-faa.component.css
2026-10-19T16:01:03.7258246Z 13:01:03.725 DEBUG: Found 0 issue(s)
2026-10-19T16:01:03.7267638Z 13:01:03.726 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/shared/components/modal-alerta/modal-alerta.component.html
2026-10-19T16:01:03.7269580Z 13:01:03.726 DEBUG: 'src/app/shared/components/modal-alerta/modal-alerta.component.html' generated metadata with charset 'UTF-8'
2026-10-19T16:01:03.7316566Z 13:01:03.731 DEBUG: Found 0 issue(s)
2026-10-19T16:01:03.7328171Z 13:01:03.732 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/app.component.html
2026-10-19T16:01:03.7328596Z 13:01:03.732 DEBUG: 'src/app/app.component.html' generated metadata with charset 'UTF-8'
2026-10-19T16:01:03.7387508Z 13:01:03.738 DEBUG: Found 0 issue(s)
2026-10-19T16:01:03.7395998Z 13:01:03.739 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/shared/components/consultas-cadastrais/consultas-cadastrais.component.scss
2026-10-19T16:01:03.7508479Z 13:01:03.750 DEBUG: Found 0 issue(s)
2026-10-19T16:01:03.7519814Z 13:01:03.751 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-comprovante-operacao/components/toggle-resumo-operacao/toggle-resumo-operacao.component.html
2026-10-19T16:01:03.7521098Z 13:01:03.752 DEBUG: 'src/app/pages/abert-comprovante-operacao/components/toggle-resumo-operacao/toggle-resumo-operacao.component.html' generated metadata with charset 'UTF-8'
2026-10-19T16:01:03.7584165Z 13:01:03.758 DEBUG: Found 0 issue(s)
2026-10-19T16:01:03.7594877Z 13:01:03.759 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-dados-gerais/components/abert-dados-gerais-conta/abert-dados-gerais-conta.component.html
2026-10-19T16:01:03.7598405Z 13:01:03.759 DEBUG: 'src/app/pages/abert-dados-gerais/components/abert-dados-gerais-conta/abert-dados-gerais-conta.component.html' generated metadata with charset 'UTF-8'
2026-10-19T16:01:03.7658655Z 13:01:03.765 DEBUG: Found 0 issue(s)
2026-10-19T16:01:03.7669988Z 13:01:03.766 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-dados-representantes-procuradores/components/abert-dados-representante-legal/card-pessoa-conta/card-pessoa-conta.component.html
2026-10-19T16:01:03.7673355Z 13:01:03.767 DEBUG: 'src/app/pages/abert-dados-representantes-procuradores/components/abert-dados-representante-legal/card-pessoa-conta/card-pessoa-conta.component.html' generated metadata with charset 'UTF-8'
2026-10-19T16:01:03.7750791Z 13:01:03.774 DEBUG: Found 0 issue(s)
2026-10-19T16:01:03.7773034Z 13:01:03.777 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/styles.scss
2026-10-19T16:01:03.7958196Z 13:01:03.795 DEBUG: Found 0 issue(s)
2026-10-19T16:01:03.7969428Z 13:01:03.796 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/shared/components/lista-editavel-telefones/lista-editavel-telefones.component.html
2026-10-19T16:01:03.7971207Z 13:01:03.797 DEBUG: 'src/app/shared/components/lista-editavel-telefones/lista-editavel-telefones.component.html' generated metadata with charset 'UTF-8'
2026-10-19T16:01:03.8038881Z 13:01:03.803 DEBUG: Found 0 issue(s)
2026-10-19T16:01:03.8048826Z 13:01:03.804 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-comprovante-operacao/components/modal-config-contrato/modal-config-contrato.component.css
2026-10-19T16:01:03.8134657Z 13:01:03.813 DEBUG: Found 0 issue(s)
2026-10-19T16:01:03.8143978Z 13:01:03.814 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/shared/components/stepper-dsc/stepper-dsc.component.css
2026-10-19T16:01:03.8313214Z 13:01:03.830 DEBUG: Found 0 issue(s)
2026-10-19T16:01:03.8325654Z 13:01:03.832 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-dados-representantes-procuradores/components/abert-dados-representante-legal/abert-dados-representantes-procuradores.component.css
2026-10-19T16:01:03.8457239Z 13:01:03.845 DEBUG: Found 0 issue(s)
2026-10-19T16:01:03.8475135Z 13:01:03.847 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-dados-gerais/components/abert-dados-gerais-conta/abert-dados-gerais-conta.component.css
2026-10-19T16:01:03.8532636Z 13:01:03.852 DEBUG: Found 0 issue(s)
2026-10-19T16:01:03.8542730Z 13:01:03.854 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/app.component.css
2026-10-19T16:01:03.8597111Z 13:01:03.859 DEBUG: Found 0 issue(s)
2026-10-19T16:01:03.8607102Z 13:01:03.860 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-comprovante-operacao/components/abert-comprovante-operacao/abert-comprovante-operacao.component.html
2026-10-19T16:01:03.8610070Z 13:01:03.860 DEBUG: 'src/app/pages/abert-comprovante-operacao/components/abert-comprovante-operacao/abert-comprovante-operacao.component.html' generated metadata with charset 'UTF-8'
2026-10-19T16:01:03.8676304Z 13:01:03.867 DEBUG: Found 0 issue(s)
2026-10-19T16:01:03.8688411Z 13:01:03.868 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/pages/abert-comprovante-operacao/components/modal-config-faa/modal-config-faa.component.html
2026-10-19T16:01:03.8731321Z 13:01:03.872 DEBUG: 'src/app/pages/abert-comprovante-operacao/components/modal-config-faa/modal-config-faa.component.html' generated metadata with charset 'UTF-8'
2026-10-19T16:01:03.8815047Z 13:01:03.881 DEBUG: Found 0 issue(s)
2026-10-19T16:01:03.8828806Z 13:01:03.882 DEBUG: Analyzing file: file:///opt/ads-agent/_work/21/s/src/app/shared/components/consultas-cadastrais/consultas-cadastrais.component.html
2026-10-19T16:01:03.8832754Z 13:01:03.883 DEBUG: 'src/app/shared/components/consultas-cadastrais/consultas-cadastrais.component.html' generated metadata with charset 'UTF-8'
2026-10-19T16:01:03.8895427Z 13:01:03.889 DEBUG: Found 0 issue(s)
2026-10-19T16:01:03.8895756Z 13:01:03.889 INFO: 30/30 source files have been analyzed
2026-10-19T16:01:03.8930105Z 13:01:03.889 INFO: Hit the cache for 0 out of 0
2026-10-19T16:01:03.8930551Z 13:01:03.889 INFO: Miss the cache for 0 out of 0
2026-10-19T16:01:03.8930706Z 13:01:03.889 INFO: Sensor CSS Rules [javascript] (done) | time=350ms
2026-10-19T16:01:03.8930874Z 13:01:03.889 INFO: Sensor JavaScript/TypeScript Coverage [javascript]
2026-10-19T16:01:03.8931026Z 13:01:03.889 DEBUG: Property sonar.javascript.lcov.reportPaths is used.
2026-10-19T16:01:03.8931426Z 13:01:03.890 DEBUG: Using 'coverage/lcov.info' to resolve LCOV files
2026-10-19T16:01:03.8931655Z 13:01:03.890 INFO: Analysing [/opt/ads-agent/_work/21/s/coverage/lcov.info]
2026-10-19T16:01:03.9157271Z 13:01:03.915 WARN: Could not resolve 2 file paths in [/opt/ads-agent/_work/21/s/coverage/lcov.info]
2026-10-19T16:01:03.9157974Z 13:01:03.915 DEBUG: Unresolved paths:
2026-10-19T16:01:03.9158222Z caixa-sipnc-core.ts
2026-10-19T16:01:03.9158462Z src/app/app-routing.module.ts
2026-10-19T16:01:03.9158703Z 13:01:03.915 INFO: Sensor JavaScript/TypeScript Coverage [javascript] (done) | time=26ms
2026-10-19T16:01:03.9158990Z 13:01:03.915 INFO: Sensor CSS Metrics [javascript]
2026-10-19T16:01:03.9490588Z 13:01:03.947 INFO: Sensor CSS Metrics [javascript] (done) | time=32ms
2026-10-19T16:01:03.9522541Z 13:01:03.947 INFO: Sensor C# Project Type Information [csharp]
2026-10-19T16:01:03.9522865Z 13:01:03.948 INFO: Sensor C# Project Type Information [csharp] (done) | time=1ms
2026-10-19T16:01:03.9523038Z 13:01:03.948 INFO: Sensor C# Analysis Log [csharp]
2026-10-19T16:01:03.9678575Z 13:01:03.957 INFO: Sensor C# Analysis Log [csharp] (done) | time=9ms
2026-10-19T16:01:03.9679024Z 13:01:03.958 INFO: Sensor C# Properties [csharp]
2026-10-19T16:01:03.9679528Z 13:01:03.958 DEBUG: Project 'SIPNC-conta1288judi-microfront': No Roslyn issues reports have been found.
2026-10-19T16:01:03.9679793Z 13:01:03.958 INFO: Sensor C# Properties [csharp] (done) | time=0ms
2026-10-19T16:01:03.9679962Z 13:01:03.958 INFO: Sensor HTML [web]
2026-10-19T16:01:04.0550532Z 13:01:04.051 DEBUG: Not enough content in 'src/app/shared/components/loading-caixa/loading-caixa.component.html' to have CPD blocks, it will not be part of the duplication detection
2026-10-19T16:01:04.1735587Z 13:01:04.163 INFO: Sensor HTML [web] (done) | time=205ms
2026-10-19T16:01:04.1878973Z 13:01:04.163 INFO: Sensor TextAndSecretsSensor [text]
2026-10-19T16:01:04.1879209Z 13:01:04.171 INFO: 182 source files to be analyzed
2026-10-19T16:01:04.3594626Z 13:01:04.351 INFO: 182/182 source files have been analyzed
2026-10-19T16:01:04.3594906Z 13:01:04.351 INFO: Sensor TextAndSecretsSensor [text] (done) | time=188ms
2026-10-19T16:01:04.3595098Z 13:01:04.351 INFO: Sensor VB.NET Project Type Information [vbnet]
2026-10-19T16:01:04.3595280Z 13:01:04.352 INFO: Sensor VB.NET Project Type Information [vbnet] (done) | time=1ms
2026-10-19T16:01:04.3595447Z 13:01:04.352 INFO: Sensor VB.NET Analysis Log [vbnet]
2026-10-19T16:01:04.3614573Z 13:01:04.361 INFO: Sensor VB.NET Analysis Log [vbnet] (done) | time=9ms
2026-10-19T16:01:04.3614768Z 13:01:04.361 INFO: Sensor VB.NET Properties [vbnet]
2026-10-19T16:01:04.3615253Z 13:01:04.361 DEBUG: Project 'SIPNC-conta1288judi-microfront': No Roslyn issues reports have been found.
2026-10-19T16:01:04.3615421Z 13:01:04.361 INFO: Sensor VB.NET Properties [vbnet] (done) | time=0ms
2026-10-19T16:01:04.3615605Z 13:01:04.361 INFO: Sensor com.github.mc1arke.sonarqube.plugin.scanner.ScannerPullRequestPropertySensor
2026-10-19T16:01:04.3618587Z 13:01:04.361 INFO: Sensor com.github.mc1arke.sonarqube.plugin.scanner.ScannerPullRequestPropertySensor (done) | time=0ms
2026-10-19T16:01:04.3618977Z 13:01:04.361 INFO: Sensor IaC Docker Sensor [iac]
2026-10-19T16:01:04.3648592Z 13:01:04.364 INFO: 0 source files to be analyzed
2026-10-19T16:01:04.4113184Z 13:01:04.410 INFO: 0/0 source files have been analyzed
2026-10-19T16:01:04.4113555Z 13:01:04.411 INFO: Sensor IaC Docker Sensor [iac] (done) | time=49ms
2026-10-19T16:01:04.4113815Z 13:01:04.411 INFO: Sensor Generic Test Executions Report
2026-10-19T16:01:04.4114844Z 13:01:04.411 INFO: Parsing /opt/ads-agent/_work/21/s/reports/sonarqubeTestReport.xml
2026-10-19T16:01:04.4225335Z 13:01:04.421 DEBUG: eslint-bridge server will shutdown
2026-10-19T16:01:09.4258616Z 13:01:09.425 DEBUG: eslint-bridge server closed
2026-10-19T16:01:10.2072306Z 13:01:10.206 INFO: ------------------------------------------------------------------------
2026-10-19T16:01:10.2072549Z 13:01:10.206 INFO: EXECUTION FAILURE
2026-10-19T16:01:10.2072773Z 13:01:10.206 INFO: ------------------------------------------------------------------------
2026-10-19T16:01:10.2072957Z 13:01:10.207 INFO: Total time: 27.513s
2026-10-19T16:01:10.2626244Z 13:01:10.262 INFO: Final Memory: 18M/108M
2026-10-19T16:01:10.2626755Z 13:01:10.262 INFO: ------------------------------------------------------------------------
2026-10-19T16:01:10.2626931Z 13:01:10.262 ERROR: Error during SonarQube Scanner execution
2026-10-19T16:01:10.2627252Z Error during parsing of generic test execution report '/opt/ads-agent/_work/21/s/reports/sonarqubeTestReport.xml'. Look at the SonarQube documentation to know the expected XML format.
2026-10-19T16:01:10.2629726Z Caused by: java.io.FileNotFoundException: /opt/ads-agent/_work/21/s/reports/sonarqubeTestReport.xml (Arquivo ou diretório inexistente)
2026-10-19T16:01:10.2629960Z 	at java.base/java.io.FileInputStream.open0(Native Method)
2026-10-19T16:01:10.2630121Z 	at java.base/java.io.FileInputStream.open(Unknown Source)
2026-10-19T16:01:10.2630270Z 	at java.base/java.io.FileInputStream.<init>(Unknown Source)
2026-10-19T16:01:10.2630475Z 	at org.sonar.scanner.genericcoverage.GenericTestExecutionReportParser.parse(GenericTestExecutionReportParser.java:75)
2026-10-19T16:01:10.2632231Z 	at org.sonar.scanner.genericcoverage.GenericTestExecutionSensor.execute(GenericTestExecutionSensor.java:87)
2026-10-19T16:01:10.2632461Z 	at org.sonar.scanner.sensor.AbstractSensorWrapper.analyse(AbstractSensorWrapper.java:64)
2026-10-19T16:01:10.2632649Z 	at org.sonar.scanner.sensor.ModuleSensorsExecutor.execute(ModuleSensorsExecutor.java:88)
2026-10-19T16:01:10.2632854Z 	at org.sonar.scanner.sensor.ModuleSensorsExecutor.execute(ModuleSensorsExecutor.java:64)
2026-10-19T16:01:10.2633070Z 	at org.sonar.scanner.scan.SpringModuleScanContainer.doAfterStart(SpringModuleScanContainer.java:82)
2026-10-19T16:01:10.2633310Z 	at org.sonar.core.platform.SpringComponentContainer.startComponents(SpringComponentContainer.java:188)
2026-10-19T16:01:10.2633523Z 	at org.sonar.core.platform.SpringComponentContainer.execute(SpringComponentContainer.java:167)
2026-10-19T16:01:10.2633727Z 	at org.sonar.scanner.scan.SpringProjectScanContainer.scan(SpringProjectScanContainer.java:403)
2026-10-19T16:01:10.2634020Z 	at org.sonar.scanner.scan.SpringProjectScanContainer.scanRecursively(SpringProjectScanContainer.java:399)
2026-10-19T16:01:10.2634239Z 	at org.sonar.scanner.scan.SpringProjectScanContainer.doAfterStart(SpringProjectScanContainer.java:368)
2026-10-19T16:01:10.2634447Z 	at org.sonar.core.platform.SpringComponentContainer.startComponents(SpringComponentContainer.java:188)
2026-10-19T16:01:10.2634637Z 	at org.sonar.core.platform.SpringComponentContainer.execute(SpringComponentContainer.java:167)
2026-10-19T16:01:10.2634843Z 	at org.sonar.scanner.bootstrap.SpringGlobalContainer.doAfterStart(SpringGlobalContainer.java:137)
2026-10-19T16:01:10.2635052Z 	at org.sonar.core.platform.SpringComponentContainer.startComponents(SpringComponentContainer.java:188)
2026-10-19T16:01:10.2635254Z 	at org.sonar.core.platform.SpringComponentContainer.execute(SpringComponentContainer.java:167)
2026-10-19T16:01:10.2635436Z 	at org.sonar.batch.bootstrapper.Batch.doExecute(Batch.java:72)
2026-10-19T16:01:10.2635606Z 	at org.sonar.batch.bootstrapper.Batch.execute(Batch.java:66)
2026-10-19T16:01:10.2635797Z 	at org.sonarsource.scanner.api.internal.batch.BatchIsolatedLauncher.execute(BatchIsolatedLauncher.java:46)
2026-10-19T16:01:10.2635976Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-10-19T16:01:10.2636143Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)
2026-10-19T16:01:10.2636595Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)
2026-10-19T16:01:10.2636756Z 	at java.base/java.lang.reflect.Method.invoke(Unknown Source)
2026-10-19T16:01:10.2636937Z 	at org.sonarsource.scanner.api.internal.IsolatedLauncherProxy.invoke(IsolatedLauncherProxy.java:60)
2026-10-19T16:01:10.2637112Z 	at com.sun.proxy.$Proxy0.execute(Unknown Source)
2026-10-19T16:01:10.2637282Z 	at org.sonarsource.scanner.api.EmbeddedScanner.doExecute(EmbeddedScanner.java:189)
2026-10-19T16:01:10.2637528Z 	at org.sonarsource.scanner.api.EmbeddedScanner.execute(EmbeddedScanner.java:138)
2026-10-19T16:01:10.2637702Z 	at org.sonarsource.scanner.cli.Main.execute(Main.java:112)
2026-10-19T16:01:10.2637865Z 	at org.sonarsource.scanner.cli.Main.execute(Main.java:75)
2026-10-19T16:01:10.2638025Z 	at org.sonarsource.scanner.cli.Main.main(Main.java:61)
2026-10-19T16:01:10.6112186Z ##[error]Bash exited with code '2'.
2026-10-19T16:01:10.6120719Z ##[section]Finishing: Run Code Analisis
