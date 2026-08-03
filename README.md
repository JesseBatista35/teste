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
/bin/bash /opt/ads-agent/_work/_temp/749d0a27-bf8c-47c4-9b80-0ae371076f6f.sh
sonar-scanner -Dsonar.host.url=http://sonar-esteira.apps.produtos4.caixa -Dsonar.login=ads-sa -Dsonar.password=*** -Dsonar.projectKey=SIMIL-precificacao-internet-frontend -Dsonar.projectName=SIMIL-precificacao-internet-frontend -Dsonar.projectVersion=1.0.0.6 -Dsonar.sources=. -Dproject.settings=NONE -Dsonar.branch.name=migracao-angular-19 -Dsonar.testExecutionReportPaths=reports/sonar-report.xml -Dsonar.javascript.lcov.reportPaths=coverage/lcov.info -Dsonar.test.inclusions=**/*.spec.ts,**/*.spec.js,**/*.js,**/*.spec.jsx,**/*.jsx-Dproject.settings=NONE -Dsonar.branch.name=migracao-angular-19 -Dsonar.testExecutionReportPaths=reports/sonar-report.xml -Dsonar.javascript.lcov.reportPaths=coverage/lcov.info -Dsonar.test.inclusions=**/*.spec.ts,**/*.spec.js,**/*.js,**/*.spec.jsx,**/*.jsx
INFO: Scanner configuration file: /opt/sonar-scanner/sonar-scanner-4.2.0.1873-linux/conf/sonar-scanner.properties
INFO: Project root configuration file: NONE
INFO: SonarQube Scanner 4.2.0.1873
INFO: Java 11.0.3 AdoptOpenJDK (64-bit)
INFO: Linux 5.14.0-362.8.1.el9_3.x86_64 amd64
INFO: User cache: /home/sadscp01/.sonar/cache
INFO: SonarQube server 9.9.5.90363
INFO: Default locale: "pt_BR", source code encoding: "UTF-8"
INFO: Load global settings
INFO: Load global settings (done) | time=196ms
INFO: Server id: C6CBE574-AZHFQ0zM20SUQoMxtCv9
INFO: User cache: /home/sadscp01/.sonar/cache
INFO: Load/download plugins
INFO: Load plugins index
INFO: Load plugins index (done) | time=128ms
INFO: Load/download plugins (done) | time=176ms
INFO: Process project properties
INFO: Process project properties (done) | time=5ms
INFO: Execute project builders
INFO: Execute project builders (done) | time=1ms
INFO: Project key: SIMIL-precificacao-internet-frontend
INFO: Base dir: /opt/ads-agent/_work/378/s
INFO: Working dir: /opt/ads-agent/_work/378/s/.scannerwork
INFO: Load project settings for component key: 'SIMIL-precificacao-internet-frontend'
INFO: Load project settings for component key: 'SIMIL-precificacao-internet-frontend' (done) | time=126ms
INFO: Load project branches
INFO: Load project branches (done) | time=142ms
INFO: Load branch configuration


