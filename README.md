
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/762ceb67-728e-452c-83aa-b6aec994ef7d.sh
QG Script --> Using SonarQube instance http://sonar-esteira.apps.produtos4.caixa
QG Script --> Using SonarQube access login ads-sa
QG Script --> Using task id of AaHmJle2Pmqzl3Vc7Aa4
QG Script --> Status of SonarQube task is PENDING
QG Script --> Status of SonarQube task is PENDING
QG Script --> Status of SonarQube task is PENDING
QG Script --> Status of SonarQube task is PENDING
QG Script --> Status of SonarQube task is PENDING
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is SUCCESS
QG Script --> Using analysis id of AaHmJraOFkwt0Lh6zr6G
QG Script --> Quality Gate status is ERROR
##[error]QG Script --> Ocorrência prevista na TE102 - Não atendimento aos critérios de qualidade
##[error]Bash exited with code '1'.
Finishing: Publish Quality Gate Result






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
SIEMP

SIEMP-java-web

Tasks

Variables

Triggers

Options

History
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
open-jdk-17.0.8
KEYSTORE_SECUREFILEPATH
$(KEYSTORE_SECUREFILEPATH)
lista_versao
$(lista_versao)
MAVEN_VERSION
3.8.5
MVN_GOAL
clean package -Dversion.app=$(version.app) -DskipTests=true -U
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
Row 3. Clickable

Get started and run this pipeline for the first time!

Showing 6 items.

Finished loading items

Expanded

Collapsed

Row 2. Clickable

Showing 14 filtered items.

Get started and run this pipeline for the first time!

Row 2. Clickable

Row 2. Clickable

Showing 14 filtered items.

Get started and run this pipeline for the first time!

Row 2. Clickable

Showing 21 filtered items.

Get started and run this pipeline for the first time!

Row 2. Clickable

Row 2. Clickable

Showing 21 filtered items.

Get started and run this pipeline for the first time!




O conteúdo gerado por IA pode estar incorreto
Jesse Mouta Pereira Batista começou a transcrição
Sosthenes Estrela Soares
14:22
das bibliotecas que são legadas inversão de Java ele é a ideia que a gente não fizesse implementação de nada apenas a modernização do sistema é o que faz parte do projeto então se ele não tem
Jesse Mouta Pereira Batista
14:22
Cert.
Mhm.
Uh-huh.
Sosthenes Estrela Soares
14:22
Cobertura desde a sua conceção, ele está está vindo para cá sem essa cobertura também.
Jesse Mouta Pereira Batista
14:22
Entendi.
Sosthenes Estrela Soares
14:22
O time não vai implementar cobertura de teste para esse sistema, sabe?
Jesse Mouta Pereira Batista
14:22
Tá, mas aí eu já não sei, não sei se o Paulo Henrique pode informar, é porque hoje a esteira, ela tem a variável obrigatória de sonar. Aí eu não consigo assim, explicar pra vocês se é realmente obrigatório.
Denilson Socrates de Sousa
14:22
Mhm.
Jesse Mouta Pereira Batista
14:22
Ou não agora, assim, o dentro do.
Sosthenes Estrela Soares
14:22
Head.
Denilson Socrates de Sousa
14:22
De qualquer forma, a gente fez a cobertura com as é não, a gente acabou, a gente fez como a gente viu lá que estava apontando para as coisas que a gente mexeu nas linhas novas que ele aponta, a gente fez até a cobertura, só que aí que quando.
Sosthenes Estrela Soares
14:22
Ah, vocês fizeram?
Jesse Mouta Pereira Batista
14:22
No.
Isso.
O código novo né, Denise? Show!

