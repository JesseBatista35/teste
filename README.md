Necessito alteração na configuração das releases do:
SIFGD-pagamentos-backend

A release aparentemente não está com as configurações corretas. 

A release está com um erro em uma tarefa e não está subindo os pods para o okd

2026-10-05T14:01:34.3717936Z ##[section]Starting: Verificando Status do Deployment
2026-10-05T14:01:34.3721044Z ==============================================================================
2026-10-05T14:01:34.3721135Z Task         : Bash
2026-10-05T14:01:34.3721186Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-05T14:01:34.3721256Z Version      : 3.227.0
2026-10-05T14:01:34.3721302Z Author       : Microsoft Corporation
2026-10-05T14:01:34.3721355Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-05T14:01:34.3721421Z ==============================================================================
2026-10-05T14:01:35.4114489Z Generating script.
2026-10-05T14:01:35.4124840Z ========================== Starting Command Output ===========================
2026-10-05T14:01:35.4131571Z [command]/bin/bash /opt/ads-agent/_work/_temp/add44fb9-14e5-48fd-aa47-474719deffd1.sh
2026-10-05T14:01:35.5194029Z Waiting for rollout to finish: 1 old replicas are pending termination...
2026-10-05T14:07:41.8813672Z ##[error]The task has timed out.
2026-10-05T14:07:41.8814842Z ##[section]Finishing: Verificando Status do Deployment


2026-10-05T14:07:41.8831605Z ##[section]Starting: Logs da Aplicação
2026-10-05T14:07:41.8834971Z ==============================================================================
2026-10-05T14:07:41.8835113Z Task         : Bash
2026-10-05T14:07:41.8835165Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-05T14:07:41.8835230Z Version      : 3.227.0
2026-10-05T14:07:41.8835287Z Author       : Microsoft Corporation
2026-10-05T14:07:41.8835340Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-05T14:07:41.8835414Z ==============================================================================
2026-10-05T14:07:42.7823804Z Generating script.
2026-10-05T14:07:42.7834222Z ========================== Starting Command Output ===========================
2026-10-05T14:07:42.7841077Z [command]/bin/bash /opt/ads-agent/_work/_temp/81dcde16-eab0-4b71-8f8e-657706180d41.sh
2026-10-05T14:07:42.7885714Z + shopt -s expand_aliases
2026-10-05T14:07:42.7885919Z + [[ -n okd4_nprd ]]
2026-10-05T14:07:42.7886079Z + [[ okd4_nprd =~ ocp ]]
2026-10-05T14:07:42.7886202Z + [[ -n okd4_nprd ]]
2026-10-05T14:07:42.7886310Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-10-05T14:07:42.7889187Z + app=sifgd-pagamentos-backend-des
2026-10-05T14:07:42.7889342Z + oc version
2026-10-05T14:07:42.8702749Z Client Version: 4.20.0-202605260442.p2.g02b0b2d.assembly.stream.el9-02b0b2d
2026-10-05T14:07:42.8702980Z Kustomize Version: v5.6.0
2026-10-05T14:07:42.8703154Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-10-05T14:07:42.8703405Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-10-05T14:07:42.8728631Z ++ oc get pod -l name=sifgd-pagamentos-backend-des -n sifgd-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-10-05T14:07:42.8730148Z ++ tac
2026-10-05T14:07:42.8730751Z ++ grep -v '^$'
2026-10-05T14:07:42.8731063Z ++ head -n1
2026-10-05T14:07:42.9648442Z + last_pod=sifgd-pagamentos-backend-des-8-xltb4
2026-10-05T14:07:42.9648949Z + echo 'Logs do POD: sifgd-pagamentos-backend-des-8-xltb4'
2026-10-05T14:07:42.9649605Z + oc logs sifgd-pagamentos-backend-des-8-xltb4 -c sifgd-pagamentos-backend-des -n sifgd-des
2026-10-05T14:07:42.9649888Z Logs do POD: sifgd-pagamentos-backend-des-8-xltb4
2026-10-05T14:07:43.0557542Z exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
2026-10-05T14:07:43.0558220Z __  ____  __  _____   ___  __ ____  ______ 
2026-10-05T14:07:43.0558934Z  --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
2026-10-05T14:07:43.0559171Z  -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
2026-10-05T14:07:43.0559327Z --\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-10-05T14:07:43.0559622Z 2026-10-05 11:04:58,851 WARN  [org.hib.map.RootClass] (main) HHH000038: Composite-id class does not override equals(): caixa.gov.br.domain.entity.PessoaCNPJ
2026-10-05T14:07:43.0559992Z 2026-10-05 11:04:58,851 WARN  [org.hib.map.RootClass] (main) HHH000039: Composite-id class does not override hashCode(): caixa.gov.br.domain.entity.PessoaCNPJ
2026-10-05T14:07:43.0561100Z 2026-10-05 11:04:58,851 WARN  [org.hib.map.RootClass] (main) HHH000038: Composite-id class does not override equals(): caixa.gov.br.domain.entity.PessoaCPF
2026-10-05T14:07:43.0561476Z 2026-10-05 11:04:58,851 WARN  [org.hib.map.RootClass] (main) HHH000039: Composite-id class does not override hashCode(): caixa.gov.br.domain.entity.PessoaCPF
2026-10-05T14:07:43.0561832Z 2026-10-05 11:04:58,851 WARN  [org.hib.map.RootClass] (main) HHH000038: Composite-id class does not override equals(): caixa.gov.br.domain.entity.ProprietarioPessoaVinculo
2026-10-05T14:07:43.0562238Z 2026-10-05 11:04:58,851 WARN  [org.hib.map.RootClass] (main) HHH000039: Composite-id class does not override hashCode(): caixa.gov.br.domain.entity.ProprietarioPessoaVinculo
2026-10-05T14:07:43.0562556Z Model classes are defined for the default persistence unit <default> but configured datasource <default> not found: the default EntityManagerFactory will not be created. To solve this, configure the default datasource. Refer to https://quarkus.io/guides/datasource for guidance.
2026-10-05T14:07:43.0625188Z ##[section]Finishing: Logs da Aplicação


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
SIFGD-pagamentos-backend
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
sifgd

SIFGD-pagamentos-backend
Predefined variables
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
Usuario-Azure-DevOps (12)
Scopes: Release
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
EGRESS_IP_OKD (81)
WO0000072264656 - Config Portal Infrafácil NO_PROXY
Scopes: Release
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)
Scopes: Release
OKD-4-NPRD (12)
Credenciais para o Cluster OKD4 de NPRD (DES/TQS/HMP)
Scopes: EC DES,EC TQS,EC HMP
SIFGD-pagamentos-backend-DES (5)
Grupo de variáveis criadas pela WO0000081780569
Scopes: EC DES
ENV_DB_PASSWORD
********
INIT
_ENV_DB_SCHEMA
FUG
_ENV_DB_URL
jdbc:db2://10.216.80.110:448/RJKDB2DSD0
_ENV_DB_USERNAME
SFUGDR02
SIFGD-pagamentos-backend-TQS (5)
Grupo de variáveis criadas pela WO0000081780569
Scopes: EC TQS
SIFGD-pagamentos-backend-HMP (1)
Grupo de variáveis criadas pela WO0000081780569
Scopes: EC HMP
OKD-4-APL (12)
Scopes: EC PRD
SIFGD-pagamentos-backend-PRD (1)
Grupo de variáveis criadas pela WO0000081780569
Scopes: EC PRD
|Manage variable groups
Expanded

Collapsed

1 pipelines found

Row 2

Row 2

Row 2

Row 2

Showing filters 1 through 2

Showing filters 1 through 2

