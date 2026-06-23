adicnionei aqui pipiline variables


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
SIGPD

SIGPD-backend

Tasks

Variables

Triggers

Options

History
Predefined variables
jboss.deploy.dir
target
system.collectionId
7b4c9d5c-b041-4798-8dcb-fb11786a173b
system.debug
false

system.definitionId
242
system.teamProject
Caixa
version.app

Showing 25 filtered items.

Showing 49 filtered items.

Row 2. Clickable

Collapsed

Collapsed

Row 5. Clickable

Expanded

Collapsed

Showing 25 filtered items.

Get started and run this pipeline for the first time!

Showing 50 filtered items.

Showing 25 filtered items.

Row 2. Clickable

Expanded

Collapsed

Collapsed

Showing 25 filtered items.

Get started and run this pipeline for the first time!

Showing 50 filtered items.

Showing 25 filtered items.



2026-06-23T23:03:06.1213115Z ##[section]Starting: Publica no Nexus
2026-06-23T23:03:06.1216849Z ==============================================================================
2026-06-23T23:03:06.1216973Z Task         : Bash
2026-06-23T23:03:06.1217023Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-23T23:03:06.1217092Z Version      : 3.227.0
2026-06-23T23:03:06.1217149Z Author       : Microsoft Corporation
2026-06-23T23:03:06.1217206Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-23T23:03:06.1217277Z ==============================================================================
2026-06-23T23:03:06.2407116Z Generating script.
2026-06-23T23:03:06.2419744Z ========================== Starting Command Output ===========================
2026-06-23T23:03:06.2426604Z [command]/bin/bash /opt/ads-agent/_work/_temp/459c978d-3715-467e-9c41-fd8a851f0300.sh
2026-06-23T23:03:06.2471964Z VEC false
2026-06-23T23:03:06.2825913Z ##[section]=== Info do pacote ===
2026-06-23T23:03:06.2826122Z ##[section]groupid= br.gov.caixa.sigpd
2026-06-23T23:03:06.2826235Z ##[section]artifact= sigpd-ear
2026-06-23T23:03:06.2826525Z ##[section]version= 3.4.2.10-SNAPSHOT
2026-06-23T23:03:06.2826651Z =========================================================
2026-06-23T23:03:06.2826914Z /opt/ads-agent/_work/_temp/459c978d-3715-467e-9c41-fd8a851f0300.sh: line 28: library: comando não encontrado
2026-06-23T23:03:06.2827207Z /opt/ads-agent/_work/_temp/459c978d-3715-467e-9c41-fd8a851f0300.sh: line 38: ./ear/${jboss.deploy.dir}/sigpd-ear.ear: substituição incorreta
2026-06-23T23:03:06.2829967Z ##[section]Async Command Start: Update Build Number
2026-06-23T23:03:06.3843176Z Update build number to 3.4.2.10-SNAPSHOT for build 754626
2026-06-23T23:03:06.3843371Z ##[section]Async Command End: Update Build Number
2026-06-23T23:03:06.3844248Z ##[section]Finishing: Publica no Nexus


