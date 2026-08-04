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
SISOU

SISOU-lai-okd

Tasks

Variables

Triggers

Options

History
BUILD_DEFAULT_QUARKUS_OPENJDK
Task version
7.*
Display name
BUILD_DEFAULT_QUARKUS_OPENJDK
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
JAVA_VERSION
open-jdk-21.0.5/
KEYSTORE_SECUREFILEPATH
$(KEYSTORE_SECUREFILEPATH)
lista_versao
$(lista_versao)
MAVEN_VERSION
3.9.9
MVN_GOAL
clean package -U
nexus_interno_pass
$(nexus_interno_pass)
nexus_interno_user
$(nexus_interno_user)
NEXUS_REPOSITORY_ID
$(NEXUS_REPOSITORY_ID)
NEXUS_URL_MAVEN_RELEASE
$(NEXUS_URL_MAVEN_RELEASE)
NEXUS_URL_MAVEN_SNAPSHOT
$(NEXUS_URL_MAVEN_SNAPSHOT)
NODE_EXTRA_CA_CERTS
$(NODE_EXTRA_CA_CERTS)
p_language
$(p_language)
POM_PATH
pom.xml
POM_VERSION
$(POM_VERSION)
project.group
$(project.group)
project.name
$(project.name)
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
tbuild
$(tbuild)
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
Showing 9 filtered items.

Get started and run this pipeline for the first time!

Row 2. Clickable

Expanded

Collapsed

Showing 9 filtered items.

Showing 9 filtered items.

Showing 9 filtered items.

Collapsed

Expanded

Showing 9 filtered items.

Get started and run this pipeline for the first time!

Task removed

Expanded

Collapsed

Expanded

Collapsed





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
SISOU

SISOU-lai-okd

Tasks

Variables

Triggers

Options

History
CRIA_IMAGE_OKD_QUARKUS
Task version
4.*
Display name
CRIA_IMAGE_OKD_QUARKUS
IMAGE_NAME
$(IMAGE_NAME)
IMAGE_NAMESPACE
$(IMAGE_NAMESPACE)
IMAGE_TAG
$(IMAGE_TAG)
ImageBuild_OKD
$(ImageBuild_OKD)
nome_imagem
$(nome_imagem)
OCP_API_IBMCLOUD
$(OCP_API_IBMCLOUD)
OCP_TOKEN_IBMCLOUD
$(OCP_TOKEN_IBMCLOUD)
OKD_4_API
$(OKD_4_API)
OKD_4_API_APL
$(OKD_4_API_APL)
OKD_4_TOKEN
$(OKD_4_TOKEN)
OKD_4_TOKEN_APL
$(OKD_4_TOKEN_APL)
OKD_API
$(OKD_API)
OKD_API_APL
$(OKD_4_API_APL)
OKD_API_PRD_CANAIS_CTC
$(OKD_API_PRD_CANAIS_CTC)
OKD_API_PRD_CANAIS_DTC
$(OKD_API_PRD_CANAIS_DTC)
OKD_API_PRD_DTC
$(OKD_API_PRD_DTC)
OKD_API_REGISTRY
$(OKD_API_REGISTRY)
OKD_TOKEN
$(OKD_TOKEN)
OKD_TOKEN_APL
$(OKD_TOKEN_APL)
OKD_TOKEN_PRD_CANAIS_CTC
$(OKD_TOKEN_PRD_CANAIS_CTC)
OKD_TOKEN_PRD_CANAIS_DTC
$(OKD_TOKEN_PRD_CANAIS_DTC)
OKD_TOKEN_PRD_DTC
$(OKD_TOKEN_PRD_DTC)
OKD_TOKEN_REGISTRY
$(OKD_TOKEN_REGISTRY)
OPENSHIFT_API_URL
$(OPENSHIFT_API_URL)
ProjetoBuild
$(ProjetoBuild)
REPO_FINAL_NAME
$(REPO_FINAL_NAME)
REPOSITORIO
$(REPOSITORIO)
SITE
$(SITE)
tag_imagem
$(tag_imagem)
TemplateVersaoProduto_OKD
$(TemplateVersaoProduto_OKD)
TOKEN
$(TOKEN)
Control Options
Output Variables
Showing 9 filtered items.

Get started and run this pipeline for the first time!

Row 2. Clickable

Expanded

Collapsed

Showing 9 filtered items.

Showing 9 filtered items.

Showing 9 filtered items.

Collapsed

Expanded

Showing 9 filtered items.

Get started and run this pipeline for the first time!

Task removed

Expanded

Collapsed

Expanded

Collapsed





PROJECT_POM_PROPERTIES_FILE=`find . -name pom.properties`

p_version=`egrep version ${PROJECT_POM_PROPERTIES_FILE} | awk -F = {'print $2'}`	

echo "##vso[task.setvariable variable=POM_VERSION;]$p_version"

echo "##vso[task.setvariable variable=POM_PATH;]$(POM_PATH)"




Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
/
Task groups
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
Task groups

BUILD_DEFAULT_QUARKUS_OPENJDK

Tasks

History

References
Bash
Task version
3.*
Display name
Recupera Versão no POM
Type


Script
PROJECT_POM_PROPERTIES_FILE=`find . -name pom.properties`

p_version=`egrep version ${PROJECT_POM_PROPERTIES_FILE} | awk -F = {'print $2'}`	

echo "##vso[task.setvariable variable=POM_VERSION;]$p_version"

echo "##vso[task.setvariable variable=POM_PATH;]$(POM_PATH)"
Advanced
Control Options
Environment Variables
Showing filters 1 through 1




Skip to main content
Azure DevOps
projetos
/
Caixa
/
Repos
/
Files
/

SISOU-lai-okd
Search


Caixa

Overview

Boards

Repos
Files
Commits
Pushes
Branches
Tags
Pull requests

Pipelines

Test Plans

Artifacts
Project settings
SISOU-lai-okd

src

main
test
.dockerignore
.gitignore
pom.xml
README.md

eduardo-config-inicial

/
Type to find a file or folder...
Files
failed

Clone

Contents
History

You updated eduardo-config-inicial 2h ago
Create a pull request

src
6h ago
966eb09c
Estrutura base com endpoint de Teste /hello c159939
.dockerignore
6h ago
966eb09c
Estrutura base com endpoint de Teste /hello c159939
.gitignore
6h ago
966eb09c
Estrutura base com endpoint de Teste /hello c159939
pom.xml
2h ago
46d5752a
Updated pom.xml Jesse Mouta Pereira Batista
README.md
19 de mar. de 2024
45559b40
Added README.md Rafael Augusto Soares
Introduction
TODO: Give a short introduction of your project. Let this section explain the objectives or the motivation behind this project.

Getting Started
TODO: Guide users through getting your code up and running on their own system. In this section you can talk about:

Installation process
Software dependencies
Latest releases
API references
Build and Test
TODO: Describe and show how to build your code and run the tests.

Contribute
TODO: Explain how other users and developers can contribute to make your code better.

If you want to learn more about creating good readme files then refer the following guidelines . You can also seek inspiration from the below readme files:

ASP.NET Core 
Visual Studio Code 
Chakra Core 



PELO QUE TEM AQUI ELE PE QUARKUS MESMO TA CORRETO ESSA CONFIUGRAÇÃO??

