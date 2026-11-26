Na v22 é usado o vitest (compatível com a API do jest)
 
Consegue testar pra ver? 
 
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
SIDSC

SIDSC-storybook-v22

Tasks

Variables

Triggers

Options

History
Angular-Build
Task version
6.*
Display name
Angular-Build 
AZPAT
$(AZPAT)
FORTIFY_API
$(FORTIFY_API)
FORTIFY_APITOKEN
$(FORTIFY_APITOKEN)
FORTIFY_BUILD
$(FORTIFY_BUILD)
FORTIFY_CI_TOKEN
$(FORTIFY_CI_TOKEN)
FORTIFY_CLIENT_AUTH_TOKEN
$(FORTIFY_CLIENT_AUTH_TOKEN)
fortify_disable
$(fortify_disable)
FORTIFY_FPR_NAME
$(FORTIFY_FPR_NAME)
FORTIFY_NEW_VERSION
$(FORTIFY_NEW_VERSION)
FORTIFY_PASS
$(FORTIFY_PASS)
FORTIFY_POOL_GOLD_NOVO
$(FORTIFY_POOL_GOLD_NOVO)
FORTIFY_POOL_SILVER_NOVO
$(FORTIFY_POOL_SILVER_NOVO)
FORTIFY_REGEX
$(FORTIFY_REGEX)
FORTIFY_SENSOR_POOL
$(FORTIFY_SENSOR_POOL)
FORTIFY_UPTOKEN
$(FORTIFY_UPTOKEN)
FORTIFY_URL
$(FORTIFY_URL)
FORTIFY_URL_CONTROLLER
$(FORTIFY_URL_CONTROLLER)
FORTIFY_USER
$(FORTIFY_USER)
FORTIFY_VERSION_BUILD
$(FORTIFY_VERSION_BUILD)
FTFY_MVN_GOAL
$(FTFY_MVN_GOAL)
GradleVersion
$(GradleVersion)
KEYSTORE_SECUREFILEPATH
$(KEYSTORE_SECUREFILEPATH)
library
$(library)
lista_versao
$(lista_versao)
nexus_interno_pass
$(nexus_interno_pass)
nexus_interno_user
$(nexus_interno_user)
NEXUS_REPOSITORY_ID
$(NEXUS_REPOSITORY_ID)
NEXUS_URL_RELEASE
$(NEXUS_URL_ANGULAR_RELEASE)
NEXUS_URL_SNAPSHOT
$(NEXUS_URL_ANGULAR_SNAPSHOT)
NEXUS_URL_SNAPSHOT_ALIAS
snapshot
NG_GOAL
ng build --configuration production --build-optimizer --aot --output-path=dist
NODE_EXTRA_CA_CERTS
$(NODE_EXTRA_CA_CERTS)
NODE_VERSION
$(NODE_VERSION)
p_language
$(p_language)
PACKAGE_JSON_PATH
$(Build.Repository.LocalPath)
POM_PATH
$(POM_PATH)
project.extension
$(project.extension)
project.file
$(project.file)
project.group
$(project.group)
project.name
$(project.name)
project.release
$(project.release)
project.version
$(project.version)
REPO_FINAL_NAME
$(REPO_FINAL_NAME)
REPOSITORIO
$(REPOSITORIO)
SCANCENTRAL_URL
$(SCANCENTRAL_URL)
SONAR_LOGIN
$(SONAR_LOGIN)
SONAR_PASSWORD
$(SONAR_PASSWORD)
SONAR_PROPERTIES
$(SONAR_PROPERTIES)
SONAR_URL
$(SONAR_URL)
token
$(token)
token_id
$(token_id)
valida.vec
$(valida.vec)
version.app
$(version.app)
versionApp
$(versionApp)
Control Options
Output Variables
Showing 4 filtered items.

Get started and run this pipeline for the first time!

Showing 3 filtered items.

Get started and run this pipeline for the first time!

Row 2. Clickable

Showing 3 filtered items.

Get started and run this pipeline for the first time!

Row 6. Clickable

Showing 4 filtered items.

Get started and run this pipeline for the first time!



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
SIDSC

SIDSC-storybook-v22

Tasks

Variables

Triggers

Options

History
Predefined variables
ImageBuild_OKD
nginx
NODE_VERSION
24.x
nome_imagem
nginx
SITE
okd4_nprd

system.collectionId
7b4c9d5c-b041-4798-8dcb-fb11786a173b

system.debug
false
system.definitionId
7374
system.teamProject
Caixa
tag_imagem
1.26
TemplateBuild_OKD
openshift/angular-caixa-binary-ads
TemplateVersaoProduto_OKD
1.18
version.app
1.0.0-snapshot

Showing 4 filtered items.

Get started and run this pipeline for the first time!

Showing 3 filtered items.

Get started and run this pipeline for the first time!

Row 2. Clickable

Showing 3 filtered items.

Get started and run this pipeline for the first time!

Row 6. Clickable

Showing 4 filtered items.

Get started and run this pipeline for the first time!

troque a node para 22.x e deu isso aqui



Starting: Build Application
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/e2df54e8-ae89-45fd-98b8-3f92eeb415c3.sh
ng build --configuration production --build-optimizer --aot --output-path=dist
<----ANGULAR---->
Node.js version v22.13.1 detected.
The Angular CLI requires a minimum Node.js version of v22.22.3 or v24.15.0 or v26.0.0.

Please update your Node.js version or visit https://nodejs.org/ for additional instructions.

Node.js version v22.13.1 detected.
The Angular CLI requires a minimum of v22.22.3.

Please update your Node.js version or visit https://nodejs.org/ for additional instructions.
##[error]Bash exited with code '3'.
Finishing: Build Application
