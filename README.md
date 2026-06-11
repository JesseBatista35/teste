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
/bin/bash /opt/ads-agent/_work/_temp/37c81d22-6391-4f35-91c7-5ac121d4ed26.sh
sonar-scanner -Dsonar.host.url=http://sonar.apps.produtos4.caixa -Dsonar.login=ads-sa -Dsonar.password=*** -Dsonar.projectKey=SIFAP-front-v2 -Dsonar.projectName=SIFAP-front-v2 -Dsonar.projectVersion=1.0.0-snapshot -Dsonar.sources=. -Dproject.settings=NONE -Dsonar.branch.name=hotfix-consulta_cadastro -Dsonar.tests=src -Dsonar.test.inclusions=**/*.spec.ts,**/*test.ts -Dsonar.coverage.exclusions=**/*.js,src/main.ts,**/*environment*.ts,**/*.module.ts -Dsonar.testExecutionReportPaths=reports/sonar-report.xml -Dsonar.javascript.lcov.reportPaths=coverage/lcov.info
INFO: Scanner configuration file: /opt/sonar-scanner/sonar-scanner-4.2.0.1873-linux/conf/sonar-scanner.properties
INFO: Project root configuration file: NONE
INFO: SonarQube Scanner 4.2.0.1873
INFO: Java 11.0.3 AdoptOpenJDK (64-bit)
INFO: Linux 5.14.0-362.8.1.el9_3.x86_64 amd64
INFO: User cache: /home/sadscp01/.sonar/cache
INFO: SonarQube server 9.9.2.77730
INFO: Default locale: "pt_BR", source code encoding: "UTF-8"
INFO: Load global settings
INFO: Load global settings (done) | time=207ms
INFO: Server id: 4153E000-AWtsHs6yK4o2sRjgkX27
INFO: User cache: /home/sadscp01/.sonar/cache
INFO: Load/download plugins
INFO: Load plugins index
INFO: Load plugins index (done) | time=136ms
INFO: Load/download plugins (done) | time=189ms
INFO: Process project properties
INFO: Process project properties (done) | time=6ms
INFO: Execute project builders
INFO: Execute project builders (done) | time=1ms
INFO: Project key: SIFAP-front-v2
INFO: Base dir: /opt/ads-agent/_work/156/s
INFO: Working dir: /opt/ads-agent/_work/156/s/.scannerwork
INFO: Load project settings for component key: 'SIFAP-front-v2'
INFO: Load project settings for component key: 'SIFAP-front-v2' (done) | time=134ms
INFO: Load project branches
INFO: Load project branches (done) | time=157ms
INFO: Load branch configuration
INFO: Sensor C# Analysis Log [csharp]
INFO: Sensor C# Analysis Log [csharp] (done) | time=9ms
INFO: Sensor C# Properties [csharp]
INFO: Sensor C# Properties [csharp] (done) | time=0ms
INFO: Sensor HTML [web]
INFO: Sensor HTML [web] (done) | time=113ms
INFO: Sensor TextAndSecretsSensor [text]
INFO: 163 source files to be analyzed
INFO: 163/163 source files have been analyzed
INFO: Sensor TextAndSecretsSensor [text] (done) | time=308ms
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
INFO: Sensor IaC Docker Sensor [iac] (done) | time=38ms
INFO: Sensor Generic Test Executions Report
INFO: Parsing /opt/ads-agent/_work/156/s/reports/sonar-report.xml
INFO: ------------------------------------------------------------------------
INFO: EXECUTION FAILURE
INFO: ------------------------------------------------------------------------
INFO: Total time: 15.228s
INFO: Final Memory: 18M/70M
INFO: ------------------------------------------------------------------------
ERROR: Error during SonarQube Scanner execution
ERROR: Error during parsing of generic test execution report '/opt/ads-agent/_work/156/s/reports/sonar-report.xml'. Look at the SonarQube documentation to know the expected XML format.
ERROR: Caused by: /opt/ads-agent/_work/156/s/reports/sonar-report.xml (Arquivo ou diretório inexistente)
ERROR: 
ERROR: Re-run SonarQube Scanner using the -X switch to enable full debug logging.
##[error]Bash exited with code '2'.
Finishing: Run Code Analisis
