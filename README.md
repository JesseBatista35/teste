cara vamos la  

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

SIGPD-backend
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
SIGPD-backend

.jpb
api
batch
core
ear
lib
.gitignore
pom.xml
README.md
RESUMO_FLUXOS_DECLARACAO.txt

release/sp58-ronaldo

/
pom.xml
pom.xml

Edit

Contents
History
Compare
Blame


You updated release/sp58-ronaldo 19m ago
Create a pull request

Updated pom.xml
c27be670
Jesse Mouta Pereira Batista
Today at 09:10
edit
Updated pom.xml
05f0c48a
Jesse Mouta Pereira Batista
Today at 09:00
edit
succeeded
Updated pom.xml
90944c81
Jesse Mouta Pereira Batista
Yesterday at 19:48
edit
succeeded

Ajusta POM version
71c779fa
f710695
21 de mai. at 11:33
edit
mudar versao
a887e227
f710695
14 de jan. at 16:26
edit
failed
retrona pom
ad9fd016
f710695
14 de jan. at 14:47
edit
Ajuste versionapp no pom
de4a84dc
f710695
14 de jan. at 10:11
edit
succeeded
WIP
8b5d9b1b
f710695
8 de dez. de 2025 at 10:04
edit
sonar.coverage.exclusions src/test/java/br/gov/caixa/**/*
c2cd3257
f756415
1 de out. de 2024 at 09:59
edit
Habilitar Testes unitários
071d08a8
f756415
9 de ago. de 2024 at 08:17
edit
Versão anterior está com vulnerabilidades públicas.
ed0a2e74
f756415
23 de nov. de 2023 at 16:50
edit
[FIX] Ajustes do SONAR para a aplicação voltar a funcionar após os MERGES dos '45 dias'
20199f9c
CesarDraw
17 de jul. de 2023 at 08:49
edit
[Merge] Primeiro Merge da develop com a versão de TQS
398a0533
CesarDraw
25 de abr. de 2023 at 17:47
edit
Cannot edit in read-only editor
Row 2. Clickable

Row 4. Clickable

Row 4. Clickable

Row 6. Clickable

Row 4. Clickable

Row 6. Clickable

Row 4. Clickable

Row 4. Clickable

Row 5. Clickable


foi mudado no pom:

de 1.9.0.1-SNAPSHOT 

PARA:
	<groupId>br.gov.caixa.sigpd</groupId>
	<artifactId>sigpd</artifactId>
	<version>3.4.2.10</version>
	<packaging>pom</packaging>

	DIA 21 DE MAIO AS 11:33.

	AGORA VAMOS LA SEGUE TUDO QUE TEM NA TAKS Java- Build


	primeiro elas tem essas varaiveis setadas aqui.. para ver os scritis tem que ir em editar.


	Java-Build
Task version
5.*
Display name
Java-Build
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
GradleVersion
$(GradleVersion)
JAVA_VERSION
jdk1.8.0_221
KEYSTORE_SECUREFILEPATH
$(KEYSTORE_SECUREFILEPATH)
lista_versao
$(lista_versao)
MAVEN_VERSION
3.9.9
MVN_GOAL
clean compile install -DskipTests=false
nexus_interno_pass
$(nexus_interno_pass)
nexus_interno_user
$(nexus_interno_user)
NEXUS_REPOSITORY_ID
$(NEXUS_REPOSITORY_ID)
NEXUS_URL_RELEASE
$(NEXUS_URL_MAVEN_RELEASE)
NEXUS_URL_SNAPSHOT
$(NEXUS_URL_MAVEN_SNAPSHOT)
NEXUS_URL_SNAPSHOT_ALIAS
SNAPSHOT
NODE_EXTRA_CA_CERTS
$(NODE_EXTRA_CA_CERTS)
p_language
$(p_language)
POM_PATH
pom.xml
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

dentro do edide ela tem isso:

 Task groups  Java-Build
Tasks History References  Refresh  Sav 
 
Java-Build
Version 5.*
Task group: Validação VEC
Validação VEC
Configurando Registry NPM
Bash
Copy Files to: $(Agent.BuildDirectory)/fortify
Copy files
Maven
Maven
Recupera versão projeto (groupId:artifactId:type:version
Bash
Recupera repositório nexus
Bash
Task group: Build Default
Build Default
Delete files from $(Agent.BuildDirectory)/fortify
Delete files
Publica o resultado do teste
Publish Test Results



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
Java-Build

Tasks

History

References
Task group : Java-Build
Version
Properties
Name
Java-Build
Description
Realiza a build, validação do código no SonarQube e publicação no Nexus de aplicação Java-Maven.
Category
Parameters
NameDefault valueDescription
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
Define authentication token of type CIToken as a variable.
FORTIFY_CLIENT_AUTH_TOKEN
$(FORTIFY_CLIENT_AUTH_TOKEN)
fortify_disable
$(fortify_disable)
FORTIFY_FPR_NAME
$(FORTIFY_FPR_NAME)
FORTIFY_NEW_VERSION
$(FORTIFY_NEW_VERSION)
Specify the SSC application version name.
FORTIFY_PASS
$(FORTIFY_PASS)
FORTIFY_POOL_GOLD_NOVO
$(FORTIFY_POOL_GOLD_NOVO)
FORTIFY_POOL_SILVER_NOVO
$(FORTIFY_POOL_SILVER_NOVO)
FORTIFY_REGEX
$(FORTIFY_REGEX)
Regex 3 dígitos
FORTIFY_SENSOR_POOL
$(FORTIFY_SENSOR_POOL)
Specify the UUID for the sensor pool to use for the scan request.
FORTIFY_UPTOKEN
$(FORTIFY_UPTOKEN)
FORTIFY_URL
$(FORTIFY_URL)
Specify the SSC URL.
FORTIFY_URL_CONTROLLER
$(FORTIFY_URL_CONTROLLER)
Specify the controller URL.
FORTIFY_USER
$(FORTIFY_USER)
FORTIFY_VERSION_BUILD
$(FORTIFY_VERSION_BUILD)
GradleVersion
$(GradleVersion)
JAVA_VERSION
jdk1.8.0_221
Versão do Java (jdk1.7.0_79 jdk1.8.0_221 jdk-11.0.11 open-jdk-1.8.0 open-jdk-11 open-jdk-17.0.8)
KEYSTORE_SECUREFILEPATH
$(KEYSTORE_SECUREFILEPATH)
lista_versao
$(lista_versao)
MAVEN_VERSION
3.8.5
MVN_GOAL
clean compile install
Maven GOAL
nexus_interno_pass
$(nexus_interno_pass)
Senha usuário nexus
nexus_interno_user
$(nexus_interno_user)
Usuario interno nexus
NEXUS_REPOSITORY_ID
$(NEXUS_REPOSITORY_ID)
Variável do ID do repositório do nexus
NEXUS_URL_RELEASE
$(NEXUS_URL_MAVEN_RELEASE)
Url de release no nexus
NEXUS_URL_SNAPSHOT
$(NEXUS_URL_MAVEN_SNAPSHOT)
Url de snapshot no nexus
NEXUS_URL_SNAPSHOT_ALIAS
SNAPSHOT
Alias SNAPSHOT (Ex: alpha, snapshot)
NODE_EXTRA_CA_CERTS
$(NODE_EXTRA_CA_CERTS)
p_language
$(p_language)
POM_PATH
pom.xml
project.extension
$(project.extension)
Extensão do binário
project.file
$(project.file)
Caminho do binário
project.group
$(project.group)
Define o grupo do projeto
project.name
$(project.name)
Define nome do projeto
project.release
$(project.release)
Define se projeto é release ou snapshot (true ou false)
project.version
$(project.version)
Define versão do projeto
REPOSITORIO
$(REPOSITORIO)
SCANCENTRAL_URL
$(SCANCENTRAL_URL)
SONAR_LOGIN
$(SONAR_LOGIN)
Login do sonar
SONAR_PASSWORD
$(SONAR_PASSWORD)
Password do sonar
SONAR_PROPERTIES
$(SONAR_PROPERTIES)
SONAR_URL
$(SONAR_URL)
Url do sonar
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
Showing filters 1 through 1



configurando registry NPM 

tem esse script:
npm config set email pipeline-agil@mail.caixa
npm config set registry http://binario.caixa:8081/repository/npm-all/
npm config set sass_binary_site http://binario.caixa:8081/repository/node-sass/
npm config set strict-ssl false

npm config list

Copy files
Task version
2.*
Display name
Copy Files to: $(Agent.BuildDirectory)/fortify
Source Folder
$(Build.SourcesDirectory)
Contents
**
Target Folder
$(Agent.BuildDirectory)/fortify
Advanced
Control Options


Maven
Task version
4.*
Display name
Maven
Maven POM file
$(POM_PATH)
Goal(s)
$(MVN_GOAL)
Options
JUnit Test Results
Publish to Azure Pipelines
Code Coverage
Code coverage tool
None
Advanced
Code Analysis
Run SonarQube or SonarCloud analysis
Run Checkstyle
Run PMD
Run FindBugs
Run SpotBugs analysis
Control Options



Bash
Task version
3.*
Display name
Recupera versão projeto (groupId:artifactId:type:version)
Type


Script
cd $(Build.SourcesDirectory)

find . -name maven-wrapper.jar -delete

echo "Entrando no diretório: $(Build.SourcesDirectory)"
echo "Arquivos encontrados: `ls -la`"

if [ -z "$TARGET_PATH" ]; then 
	TARGET_PATH="." 
fi

for extension in ear war jar
do
   file=`find $TARGET_PATH -name "*.${extension}"`
   if [ -n "${file}" ]
   then
			PROJECT_FILE="${file}"
			p_extension="${extension}"
			break
   fi
done

echo "Encontrado o arquivo: $file\n"

export PROJECT_DIR=`dirname ${PROJECT_FILE}`
export PROJECT_POM_PROPERTIES_FILE=`find ${PROJECT_DIR} -name pom.properties`

echo "Diretório do projeto: $PROJECT_DIR"
echo "Conteúdo do diretório: `ls -la $PROJECT_DIR`"
echo "Arquivo POM: $PROJECT_POM_PROPERTIES_FILE"

#if [ -z $PROJECT_POM_PROPERTIES_FILE ]
#then
#      echo "Arquivo pom.properties não encontrado, favor verificar a versão da TAG <maven-ear-plugin-version> no pom.properties, algumas versões #possuem BUG e não gera o arquivo."
#      exit 1
#fi


p_version=`egrep version ${PROJECT_POM_PROPERTIES_FILE} | awk -F = {'print $2'}`		 
p_group=`egrep groupId ${PROJECT_POM_PROPERTIES_FILE} | awk -F = {'print $2'}`
p_artifact=`egrep artifactId ${PROJECT_POM_PROPERTIES_FILE} | awk -F = {'print $2'}`
p_projectKey=`echo $p_artifact | tr -cd '[:alnum:]'` 

echo "${p_group}:${p_artifact}:${p_extension}:${p_version}"

echo "##vso[task.setvariable variable=project.group;]$p_group"

echo "##vso[task.setvariable variable=project.name;]$p_artifact"

echo "##vso[task.setvariable variable=project.version;]$p_version"

echo "##vso[task.setvariable variable=project.extension;]$p_extension"

echo "##vso[task.setvariable variable=project.key;]$p_projectKey"

echo "##vso[task.setvariable variable=project.file;]${PROJECT_FILE}"

if [[ ! -z ${PROJECT_RELEASE} ]] && ([ ${PROJECT_RELEASE} == false ] || [ ${PROJECT_RELEASE} == true ]) ; then

echo "##vso[task.setvariable variable=project.release;]${PROJECT_RELEASE}"

else

echo "##vso[task.setvariable variable=project.release;]true"

if [[ ${p_version} == *"$(NEXUS_URL_SNAPSHOT_ALIAS)"* ]]; then
  echo "##vso[task.setvariable variable=project.release;]false"
fi

fi

echo "##vso[task.setvariable variable=POM_PATH;]$(POM_PATH)"


Advanced
Control Options
Environment Variables




Bash
Task version
3.*
Display name
Recupera repositório nexus
Type


Script
#tudo que não for padrão VEC é snapshot
if [ $(valida.vec) = true ]; then
NEXUS_URL=$(NEXUS_URL_RELEASE)
else
NEXUS_URL=$(NEXUS_URL_SNAPSHOT)
fi


p_repository=`echo ${NEXUS_URL##*/}`
echo "##vso[task.setvariable variable=project.repository;]$p_repository"
Advanced
Control Options
Environment Variables



Build Default
Task version
5.*
Display name
Task group: Build Default
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
$(NEXUS_URL_RELEASE)
NEXUS_URL_SNAPSHOT
$(NEXUS_URL_SNAPSHOT)
NODE_EXTRA_CA_CERTS
$(NODE_EXTRA_CA_CERTS)
p_language
$(p_language)
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


Delete files
Task version
1.*
Display name
Delete files from $(Agent.BuildDirectory)/fortify
Source Folder
$(Agent.BuildDirectory)/fortify
Contents
*
Remove SourceFolder
Advanced
Control Options


Publish Test Results
Task version
2.*
Display name
Publica o resultado do teste
Test result format
JUnit
Test results files
**/TEST-*.xml
Search folder
$(System.DefaultWorkingDirectory)
Merge test results
Fail if there are test failures
Test run title
Advanced
Control Options



pronto e isso te mandei pra vocer se voce para de insistir que o problema ta aqui
