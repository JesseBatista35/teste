Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
/
Releases
/
SIABM-autenticacao-24horas
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
All pipelines

SIABM

SIABM-autenticacao-24horas
Predefined variables
Filter by keywords
Scope


_ENV.JAVA_OPTIONS
"-Dserver.address=0.0.0.0 -Dserver.port=8080"
_ENV.JAVA_OPTS_MONITORING
"-javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=$(REPOSITORIO) -Delastic.apm.environment=$(AMBIENTE) -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=$(URL_APM_SERVER) -Delastic.apm.global_labels=deployment=$(REPOSITORIO) -Delastic.apm.verify_server_cert=false"
AMBIENTE
des
AMBIENTE
tqs
AMBIENTE
des
AMBIENTE
hmp
AMBIENTE
prd
AMBIENTE_BUILD
build-images-ads
CGC_UNIDADE_DES
7390
CGC_UNIDADE_OPS
7259
PASSWORD_TRUSTSTORE
changeit
SISTEMAAMBIENTE
des
SISTEMAAMBIENTE
tqs
SISTEMAAMBIENTE
des
SISTEMAAMBIENTE
hmp
SISTEMAAMBIENTE
prd
SISTEMANOME
siabm-autenticacao-24horas

SITE
okd4_nprd
SITE
okd4_prd
TemplateRelease_OKD
openshift/springboot-caixa-release
UNIDADE
BR
URL_APM_SERVER
https://apm-server-devops.apps.produtos4.caixa

Row 2

Showing filters 1 through 2

Showing filters 1 through 2

Change variable type to secret


as cofniguraçoes ficama aqui na variavel de pipilne se for para t tirar posso tirar aqui
