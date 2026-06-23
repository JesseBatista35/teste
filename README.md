no repositori do nexus tem ela:

Sonatype
Sonatype Nexus RepositoryOSS 3.70.1-02
3.4.2.10
/
Repository	releases
Format	maven2
Group	br.gov.caixa.sigpd
Name	sigpd-ear
Version	3.4.2.10
Most popular version	
Age	
Popularity	





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
