Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
Search


Caixa

Overview

Boards

Repos

Pipelines
Pipelines
Environments
Releases
Library
Task groups
Deployment groups
Portal Infra

Test Plans

Artifacts
Project settings

SIMOV

SIMOV-imoveiscaixa-batch

Tasks

Variables

Triggers

Options

History
Predefined variables
DOTNET_BUILDARGS
--configuration Release
DOTNET_STARTUP_ASSEMBLY
Simov.Api.dll
DOTNET_TESTARGS
--configuration Release --collect:"XPlat Code Coverage" -- DataCollectionRunSettings.DataCollectors.DataCollector.Configuration.Format="cobertura%2copencover"
DOTNET_VERSION
8.0.303

SITE
okd4_nprd
SONAR_PROPERTIES
-Dsonar.branch.name=$(sonar_branch) -Dsonar.testExecutionReportPaths=reports/sonar-report.xml -Dsonar.javascript.lcov.reportPaths=coverage/lcov.info -Dsonar.javascript.lcov.reportPaths=coverage/lcov.info -Dsonar.sources=. -Dsonar.test=src -Dsonar.language=ts -Dsonar.test.inclusions=**/*.spec.ts,**/*.spec.js,**/*.js,**/*.spec.jsx,**/*.jsx
system.collectionId
7b4c9d5c-b041-4798-8dcb-fb11786a173b
system.debug
false
system.definitionId
6658
system.teamProject
Caixa
version.app

Showing 25 filtered items.

Get started and run this pipeline for the first time!

Showing 42 filtered items.

Showing 25 filtered items.

nao tinha essa varaivel do snoar colquei ela nao se se via dar certo porque pegeui de uma aplicação angular e eassa daui e .net

-Dsonar.branch.name=$(sonar_branch) -Dsonar.testExecutionReportPaths=reports/sonar-report.xml -Dsonar.javascript.lcov.reportPaths=coverage/lcov.info -Dsonar.javascript.lcov.reportPaths=coverage/lcov.info -Dsonar.sources=. -Dsonar.test=src -Dsonar.language=ts -Dsonar.test.inclusions=**/*.spec.ts,**/*.spec.js,**/*.js,**/*.spec.jsx,**/*.jsx
