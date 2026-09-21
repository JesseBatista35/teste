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

SIIFX-caixinhas-batch
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
SIIFX-caixinhas-batch

.mvn
batch-launcher

src
.env
.env_exemplo
pom.xml
batch-platform
core-starter
io-starter
platform-bom
pom.xml
mod-caixinhas
src
main
test
pom.xml
scripts
.gitattributes
.gitignore
img.png
README.md

develop

/
Type to find a file or folder...
Files
failed

Clone

Contents
History

.mvn
25 de jun.
5015686c
Atualizar versão do mvn c160696
batch-launcher
1h ago
0b02ac24
Adicionando Jacoco Report para cobertura de testes c158543
batch-platform
sábado
d7f57d9c
STRY00104740 - Atualização modelo físico de tabelas Spring Batch c158543
mod-caixinhas
1h ago
0b02ac24
Adicionando Jacoco Report para cobertura de testes c158543
scripts
4 de set.
f6171b33
STRY00095836 - SIIFX - Caixinha - Arquitetura de código inicial [BATCH] c158543
.gitattributes
25 de jun.
73f509ba
Criar projeto batch para teste esteira DevOps c160696
.gitignore
4 de set.
f6171b33
STRY00095836 - SIIFX - Caixinha - Arquitetura de código inicial [BATCH] c158543
img.png
4 de set.
0442aa19
STRY00095836 - SIIFX - Caixinha - Arquitetura de código inicial [BATCH] c158543
README.md
quinta-feira
610ac2cd
SONAR - Cobertura de testes c158543
Introduction
Aplicação SIIFX-caixinhas-batch executada pelo BMC Control-M com contrato via exit code do processo — determinístico, nunca 1.

Topologia
Três reactors Maven independentes:

batch-platform/ — plataforma (platform-bom, core-starter, io-starter)
mod-caixinhas/ — módulo funcional (domínio de caixinhas de investimento)
batch-launcher/ — launcher (main + YAMLs por perfil + empacotamento)
O launcher não conhece nenhum módulo funcional: a descoberta de jobs é 100% por auto-configuração no classpath (META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports).

Build and Test
Cada reactor é construído e instalado na ordem de dependência:

cd batch-platform && mvn -q install -DskipTests
cd ../mod-caixinhas && mvn -q install -DskipTests
cd ../batch-launcher && mvn -q package -DskipTests
O artefato final é batch-launcher/target/siifx-caixinhas-batch.jar (fat jar, com mod-caixinhas empacotado como dependência).

Contrato de exit code com o Control-M
Código	Situação
0	COMPLETED, zero itens rejeitados
4	COMPLETED com itens rejeitados dentro do limite configurado
8	FAILED por regra de negócio (conferência divergente, saldo negativo, etc.)
12	FAILED técnico (banco, I/O, rede, exceção não classificada)
16	Parâmetro inválido, job inexistente ou variável de ambiente ausente
20	Job já em execução, instância já COMPLETED para o odate, ou conflito de negócio equivalente
Variáveis de ambiente
Variável	Obrigatória	Descrição
__ORA_DRIVE__	hmp/tgs/prd	String do Driver JDBC Oracle
DB_URL	hmp/tgs/prd	URL JDBC Oracle
DB_USER	hmp/tgs/prd	usuário de conexão (SIFXDS01,SIFXTS01,SIFXHS01)
DB_PASS	hmp/tgs/prd	senha (via Vault/variável de ambiente do agente, nunca em YAML)
BATCH_HOME	sim (wrapper)	raiz da instalação (lib/, locks/)
BATCH_PROFILE	sim (wrapper)	des, hmp, tgs ou prd
BATCH_LOG_DIR	sim (wrapper)	diretório de log por execução
PUSHGATEWAY_URL	não	endpoint do Prometheus Pushgateway
DB_POOL_MAX, SKIP_LIMITE_ABSOLUTO, GRAU_PARTICIONAMENTO, ...	não	overrides pontuais, ver application*.yml
Em des, DB_URL/DB_USER/DB_PASS têm default local; em hmp/tgs/prd a ausência de qualquer uma delas falha a subida com exit code 16 (VariaveisObrigatoriasEnvironmentPostProcessor), antes mesmo da tentativa de conexão ao banco.

Executando um job
export BATCH_HOME=/opt/batch-caixinhas
export BATCH_PROFILE=prd
export BATCH_LOG_DIR=/var/log/batch-caixinhas
scripts/executa-job.sh 201-transicao-saldo-caixinha 20260825
Jobs do mod-caixinhas
Job	Faixa	Tipo
101-abertura-novo-movimento	100	tasklets
201-transicao-saldo-caixinha	200	chunk particionado (referência do módulo)
202-registro-ativos-renda-fixa	200	chunk
203-atualiza-saldos-movimento	200	chunk
401-relatorio-fechamento-diario	400	tasklet
501-reprocessa-rejeitados	500	tasklet eventual
502-expurgo-metadados-batch	500	tasklet eventual
Schema
O SchemaContratoValidator confere, antes de qualquer step, que os objetos declarados em META-INF/schema-contrato/*.yml (agregados de todos os módulos no classpath) existem no owner IFX, com colunas críticas e grants compatíveis. Modo FALHA em hmp/tgs/prd, WARN em des.

Splitter expanded


entedi olha como ta o repo deles



<img width="1896" height="920" alt="image" src="https://github.com/user-attachments/assets/c618d900-7427-425c-8deb-c0e5897eaff7" />



atualemtne tem 3 java build assim


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
SIIFX

SIIFX-caixinhas-batch

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
open-jdk-21.0.5/
KEYSTORE_SECUREFILEPATH
$(KEYSTORE_SECUREFILEPATH)
lista_versao
$(lista_versao)
MAVEN_VERSION
3.9.9
MVN_GOAL
clean install -Dversion.app=$(version.app)
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
batch-platform/pom.xml
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
Expanded

Collapsed

Row 7. Clickable

Row 2. Clickable

Showing 25 filtered items.

Showing 27 filtered items.

Showing 25 filtered items.

Get started and run this pipeline for the first time!

Row 2. Clickable

Showing 14 filtered items.

Get started and run this pipeline for the first time!

Row 2. Clickable

Row 2. Clickable

Showing 14 filtered items.

Get started and run this pipeline for the first time!

Row 2. Clickable

Showing 14 filtered items.

Get started and run this pipeline for the first time!

Row 2. Clickable

Row 2. Clickable




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
SIIFX

SIIFX-caixinhas-batch

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
open-jdk-21.0.5/
KEYSTORE_SECUREFILEPATH
$(KEYSTORE_SECUREFILEPATH)
lista_versao
$(lista_versao)
MAVEN_VERSION
3.9.9
MVN_GOAL
clean install -Dversion.app=$(version.app)
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
mod-caixinhas/pom.xml
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
Expanded

Collapsed

Row 7. Clickable

Row 2. Clickable

Showing 25 filtered items.

Showing 27 filtered items.

Showing 25 filtered items.

Get started and run this pipeline for the first time!

Row 2. Clickable

Showing 14 filtered items.

Get started and run this pipeline for the first time!

Row 2. Clickable

Row 2. Clickable

Showing 14 filtered items.

Get started and run this pipeline for the first time!

Row 2. Clickable

Showing 14 filtered items.

Get started and run this pipeline for the first time!

Row 2. Clickable

Row 2. Clickable




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
SIIFX

SIIFX-caixinhas-batch

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
open-jdk-21.0.5/
KEYSTORE_SECUREFILEPATH
$(KEYSTORE_SECUREFILEPATH)
lista_versao
$(lista_versao)
MAVEN_VERSION
3.9.9
MVN_GOAL
clean package -Dversion.app=$(version.app)
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
batch-launcher/pom.xml
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
Expanded

Collapsed

Row 7. Clickable

Row 2. Clickable

Showing 25 filtered items.

Showing 27 filtered items.

Showing 25 filtered items.

Get started and run this pipeline for the first time!

Row 2. Clickable

Showing 14 filtered items.

Get started and run this pipeline for the first time!

Row 2. Clickable

Row 2. Clickable

Showing 14 filtered items.

Get started and run this pipeline for the first time!

Row 2. Clickable

Showing 14 filtered items.

Get started and run this pipeline for the first time!

Row 2. Clickable

Row 2. Clickable



