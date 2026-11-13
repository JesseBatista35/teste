Recupera versão projeto (groupId:artifactId:type:version)


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



Recupera repositório nexus



#tudo que não for padrão VEC é snapshot
if [ $(valida.vec) = true ]; then
NEXUS_URL=$(NEXUS_URL_RELEASE)
else
NEXUS_URL=$(NEXUS_URL_SNAPSHOT)
fi


p_repository=`echo ${NEXUS_URL##*/}`
echo "##vso[task.setvariable variable=project.repository;]$p_repository"



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
Showing filters 1 through 1

<img width="1687" height="911" alt="image" src="https://github.com/user-attachments/assets/fd36f27b-e606-4b40-b201-17b56dfebd6d" />
