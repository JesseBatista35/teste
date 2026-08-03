-Dproject.settings=NONE -Dsonar.branch.name=$(sonar_branch) -Dsonar.testExecutionReportPaths=reports/sonar-report.xml -Dsonar.javascript.lcov.reportPaths=coverage/lcov.info -Dsonar.test.inclusions=**/*.spec.ts,**/*.spec.js,**/*.js,**/*.spec.jsx,**/*.jsx



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
/bin/bash /opt/ads-agent/_work/_temp/61f8cb9c-906b-4f44-94e6-326f198af264.sh
sonar-scanner -Dsonar.host.url=http://sonar-esteira.apps.produtos4.caixa -Dsonar.login=ads-sa -Dsonar.password=*** -Dsonar.projectKey=SIMIL-precificacao-internet-frontend -Dsonar.projectName=SIMIL-precificacao-internet-frontend -Dsonar.projectVersion=1.0.0-snapshot -Dsonar.sources=. -Dproject.settings=NONE -Dsonar.branch.name=migracao-angular-19 -Dsonar.testExecutionReportPaths=reports/sonar-report.xml -Dsonar.javascript.lcov.reportPaths=coverage/lcov.info -Dsonar.test.inclusions=/*.spec.ts,/.spec.js,**/.js,/*.spec.jsx,/*.jsx
INFO: Scanner configuration file: /opt/sonar-scanner/sonar-scanner-4.2.0.1873-linux/conf/sonar-scanner.properties
INFO: Project root configuration file: NONE
INFO: SonarQube Scanner 4.2.0.1873
INFO: Java 11.0.3 AdoptOpenJDK (64-bit)
INFO: Linux 5.14.0-362.8.1.el9_3.x86_64 amd64
INFO: User cache: /home/sadscp01/.sonar/cache
INFO: SonarQube server 9.9.5.90363
INFO: Default locale: "pt_BR", source code encoding: "UTF-8"
INFO: Load global settings
INFO: Load global settings (done) | time=192ms
INFO: Server id: C6CBE574-AZHFQ0zM20SUQoMxtCv9
INFO: User cache: /home/sadscp01/.sonar/cache
INFO: Load/download plugins
INFO: Load plugins index
INFO: Load plugins index (done) | time=130ms
INFO: Load/download plugins (done) | time=178ms
INFO: Process project properties
INFO: Process project properties (done) | time=6ms
INFO: Execute project builders
INFO: Execute project builders (done) | time=0ms
INFO: Project key: SIMIL-precificacao-internet-frontend
INFO: Base dir: /opt/ads-agent/_work/378/s
INFO: Working dir: /opt/ads-agent/_work/378/s/.scannerwork
INFO: Load project settings for component key: 'SIMIL-precificacao-internet-frontend'
INFO: Load project settings for component key: 'SIMIL-precificacao-internet-frontend' (done) | time=185ms
INFO: Load project branches
INFO: Load project branches (done) | time=145ms
INFO: Load branch configuration

INFO: Load branch configuration (done) | time=2ms
INFO: Auto-configuring with CI 'Azure DevOps'
INFO: Load quality profiles
INFO: Load quality profiles (done) | time=230ms
INFO: Load active rules
INFO: Load active rules (done) | time=5652ms
INFO: Load analysis cache
INFO: Load analysis cache (404) | time=138ms
INFO: Branch name: migracao-angular-19
WARN: Property 'sonar.password' is deprecated. It will not be supported in the future. Please instead use the 'sonar.login' parameter with a token.
INFO: Load project repositories
INFO: Load project repositories (done) | time=143ms
INFO: Indexing files...
INFO: Project configuration:
INFO:   Excluded sources: **/node_modules/**, **/dist/**, **/coverage/**, **/junit/**, **/reports/**, **/*.tmp, /*.spec.ts, /.spec.js, **/.js, /*.spec.jsx, /*.jsx
INFO:   Included tests: /*.spec.ts, /.spec.js, **/.js, /*.spec.jsx, /*.jsx
INFO:   Excluded sources for coverage: **/*.xml, **/repository/**, **/dto/**, **/entity/**, **/model/**, **/dao/**, **/*DAO.java, **/test/**, **/*Test.java, **/*.spec.ts, **/*setup-jest.ts, **/*Dto.java, **/*DTO.java
INFO:   Excluded sources for duplication: **/**/environment*.ts, **/**/environment*.prod.ts
INFO: 55 files indexed
INFO: 51685 files ignored because of inclusion/exclusion patterns
INFO: 0 files ignored because of scm ignore settings
INFO: Quality profile for css: Sonar way
INFO: Quality profile for js: Sonar way
INFO: Quality profile for json: Sonar way
INFO: Quality profile for ts: Sonar way
INFO: Quality profile for web: HTML ACESSIBILIDADE
INFO: ------------- Run sensors on module SIMIL-precificacao-internet-frontend
INFO: Load metrics repository
INFO: Load metrics repository (done) | time=140ms
INFO: Sensor JaCoCo XML Report Importer [jacoco]
INFO: 'sonar.coverage.jacoco.xmlReportPaths' is not defined. Using default locations: target/site/jacoco/jacoco.xml,target/site/jacoco-it/jacoco.xml,build/reports/jacoco/test/jacocoTestReport.xml
INFO: No report imported, no coverage information will be imported by JaCoCo XML Report Importer

INFO: Sensor IaC Kubernetes Sensor [iac] (done) | time=102ms
INFO: Sensor JavaScript analysis [javascript]
WARN: Node.js version 22 is not recommended, you might experience issues. Please use a recommended version of Node.js [16, 18]
INFO: 2 source files to be analyzed
INFO: 2/2 source files have been analyzed
INFO: Hit the cache for 0 out of 2
INFO: Miss the cache for 2 out of 2: ANALYSIS_MODE_INELIGIBLE [2/2]
INFO: Sensor JavaScript analysis [javascript] (done) | time=3752ms
INFO: Sensor TypeScript analysis [javascript]
INFO: Found 1 tsconfig.json file(s): [/opt/ads-agent/_work/378/s/tsconfig.json]
INFO: 31 source files to be analyzed
INFO: Creating TypeScript program
INFO: TypeScript configuration file /opt/ads-agent/_work/378/s/tsconfig.json
ERROR: Error: Argument for '--moduleResolution' option must be: 'node', 'classic', 'node16', 'nodenext'.
ERROR:     at createProgramOptions (/opt/ads-agent/_work/378/s/.scannerwork/.sonartmp/eslint-bridge-bundle/package/lib/services/program/program.js:106:15)
ERROR:     at createProgram (/opt/ads-agent/_work/378/s/.scannerwork/.sonartmp/eslint-bridge-bundle/package/lib/services/program/program.js:132:28)
ERROR:     at default_1 (/opt/ads-agent/_work/378/s/.scannerwork/.sonartmp/eslint-bridge-bundle/package/lib/routing/on-create-program.js:10:57)
ERROR:     at Layer.handle [as handle_request] (/opt/ads-agent/_work/378/s/.scannerwork/.sonartmp/eslint-bridge-bundle/package/node_modules/express/lib/router/layer.js:95:5)
ERROR:     at next (/opt/ads-agent/_work/378/s/.scannerwork/.sonartmp/eslint-bridge-bundle/package/node_modules/express/lib/router/route.js:144:13)
ERROR:     at Route.dispatch (/opt/ads-agent/_work/378/s/.scannerwork/.sonartmp/eslint-bridge-bundle/package/node_modules/express/lib/router/route.js:114:3)
ERROR:     at Layer.handle [as handle_request] (/opt/ads-agent/_work/378/s/.scannerwork/.sonartmp/eslint-bridge-bundle/package/node_modules/express/lib/router/layer.js:95:5)
ERROR:     at /opt/ads-agent/_work/378/s/.scannerwork/.sonartmp/eslint-bridge-bundle/package/node_modules/express/lib/router/index.js:284:15
ERROR:     at Function.process_params (/opt/ads-agent/_work/378/s/.scannerwork/.sonartmp/eslint-bridge-bundle/package/node_modules/express/lib/router/index.js:346:12)
ERROR:     at next (/opt/ads-agent/_work/378/s/.scannerwork/.sonartmp/eslint-bridge-bundle/package/node_modules/express/lib/router/index.js:280:10)
ERROR: Failed to create program: Argument for '--moduleResolution' option must be: 'node', 'classic', 'node16', 'nodenext'.
INFO: Creating TypeScript program (done) | time=7ms

INFO: 12/12 source files have been analyzed
INFO: Hit the cache for 0 out of 0
INFO: Miss the cache for 0 out of 0
INFO: Sensor CSS Rules [javascript] (done) | time=188ms
INFO: Sensor JavaScript/TypeScript Coverage [javascript]
INFO: No LCOV files were found using coverage/lcov.info
WARN: No coverage information will be saved because all LCOV files cannot be found.
INFO: Sensor JavaScript/TypeScript Coverage [javascript] (done) | time=331ms
INFO: Sensor CSS Metrics [javascript]
INFO: Sensor CSS Metrics [javascript] (done) | time=21ms
INFO: Sensor C# Project Type Information [csharp]
INFO: Sensor C# Project Type Information [csharp] (done) | time=1ms
INFO: Sensor C# Analysis Log [csharp]
INFO: Sensor C# Analysis Log [csharp] (done) | time=8ms
INFO: Sensor C# Properties [csharp]
INFO: Sensor C# Properties [csharp] (done) | time=0ms
INFO: Sensor HTML [web]
INFO: Sensor HTML [web] (done) | time=33ms
INFO: Sensor TextAndSecretsSensor [text]
INFO: 52 source files to be analyzed
INFO: 52/52 source files have been analyzed
INFO: Sensor TextAndSecretsSensor [text] (done) | time=154ms
INFO: Sensor VB.NET Project Type Information [vbnet]
INFO: Sensor VB.NET Project Type Information [vbnet] (done) | time=1ms
INFO: Sensor VB.NET Analysis Log [vbnet]
INFO: Sensor VB.NET Analysis Log [vbnet] (done) | time=9ms
INFO: Sensor VB.NET Properties [vbnet]
INFO: Sensor VB.NET Properties [vbnet] (done) | time=0ms
INFO: Sensor com.github.mc1arke.sonarqube.plugin.scanner.ScannerPullRequestPropertySensor
INFO: Sensor com.github.mc1arke.sonarqube.plugin.scanner.ScannerPullRequestPropertySensor (done) | time=0ms
INFO: Sensor IaC Docker Sensor [iac]
INFO: 0 source files to be analyzed
INFO: 0/0 source files have been analyzed
INFO: Sensor IaC Docker Sensor [iac] (done) | time=33ms
INFO: Sensor Generic Test Executions Report
INFO: Parsing /opt/ads-agent/_work/378/s/reports/sonar-report.xml
INFO: ------------------------------------------------------------------------
INFO: EXECUTION FAILURE
INFO: ------------------------------------------------------------------------
INFO: Total time: 14.752s
INFO: Final Memory: 18M/67M
INFO: ------------------------------------------------------------------------
ERROR: Error during SonarQube Scanner execution
ERROR: Error during parsing of generic test execution report '/opt/ads-agent/_work/378/s/reports/sonar-report.xml'. Look at the SonarQube documentation to know the expected XML format.
ERROR: Caused by: /opt/ads-agent/_work/378/s/reports/sonar-report.xml (Arquivo ou diretório inexistente)
ERROR: 
ERROR: Re-run SonarQube Scanner using the -X switch to enable full debug logging.
##[error]Bash exited with code '2'.
Finishing: Run Code Analisis
