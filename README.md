
-sh-4.2$ oc project sifgd-des
Now using project "sifgd-des" on server "https://api.nprd.caixa:6443".
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc set env dc/sifgd-pagamentos-backend-des -n sifgd-des --list
# deploymentconfigs/sifgd-pagamentos-backend-des, container sifgd-pagamentos-backend-des
TZ=America/Sao_Paulo
DB_SCHEMA=FUG
DB_URL=jdbc:db2://10.216.80.110:448/RJKDB2DSD0
DB_USERNAME=SFUGDR02
-sh-4.2$



2026-10-05T16:54:53.8734646Z ##[section]Starting: Logs da Aplicação
2026-10-05T16:54:53.8737857Z ==============================================================================
2026-10-05T16:54:53.8737950Z Task         : Bash
2026-10-05T16:54:53.8737997Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-05T16:54:53.8738063Z Version      : 3.227.0
2026-10-05T16:54:53.8738121Z Author       : Microsoft Corporation
2026-10-05T16:54:53.8738171Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-05T16:54:53.8738244Z ==============================================================================
2026-10-05T16:54:54.9331000Z Generating script.
2026-10-05T16:54:54.9341281Z ========================== Starting Command Output ===========================
2026-10-05T16:54:54.9350561Z [command]/bin/bash /opt/ads-agent/_work/_temp/5e2c77f0-3ba8-4201-83cb-7a0e4b9af672.sh
2026-10-05T16:54:54.9396347Z + shopt -s expand_aliases
2026-10-05T16:54:54.9396907Z + [[ -n okd4_nprd ]]
2026-10-05T16:54:54.9397124Z + [[ okd4_nprd =~ ocp ]]
2026-10-05T16:54:54.9397287Z + [[ -n okd4_nprd ]]
2026-10-05T16:54:54.9397409Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-10-05T16:54:54.9398037Z + app=sifgd-pagamentos-backend-des
2026-10-05T16:54:54.9398471Z + oc version
2026-10-05T16:54:55.0841038Z oc v3.11.0+0cbc58b
2026-10-05T16:54:55.0841509Z kubernetes v1.11.0+d4cacc0
2026-10-05T16:54:55.0842581Z features: Basic-Auth GSSAPI Kerberos SPNEGO
2026-10-05T16:54:55.0955815Z 
2026-10-05T16:54:55.0956199Z Server https://api.nprd.caixa:6443
2026-10-05T16:54:55.0956665Z kubernetes v1.25.0-2824+27e744f55d2e99-dirty
2026-10-05T16:54:55.0996660Z ++ oc get pod -l name=sifgd-pagamentos-backend-des -n sifgd-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-10-05T16:54:55.0997426Z ++ tac
2026-10-05T16:54:55.0998601Z ++ grep -v '^$'
2026-10-05T16:54:55.0999817Z ++ head -n1
2026-10-05T16:54:55.9412143Z + last_pod=sifgd-pagamentos-backend-des-9-h22gq
2026-10-05T16:54:55.9412955Z + echo 'Logs do POD: sifgd-pagamentos-backend-des-9-h22gq'
2026-10-05T16:54:55.9413284Z + oc logs sifgd-pagamentos-backend-des-9-h22gq -c sifgd-pagamentos-backend-des -n sifgd-des
2026-10-05T16:54:55.9413494Z Logs do POD: sifgd-pagamentos-backend-des-9-h22gq
2026-10-05T16:54:56.2577296Z exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
2026-10-05T16:54:56.2658633Z ##[section]Finishing: Logs da Aplicação


novo deploy

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
SIFGD-pagamentos-backend-DES (4)
Grupo de variáveis criadas pela WO0000081780569
Scopes: EC DES
ENV_DB_PASSWORD
********
_ENV.DB_SCHEMA
FUG
_ENV.DB_URL
jdbc:db2://10.216.80.110:448/RJKDB2DSD0
_ENV.DB_USERNAME
SFUGDR02
SIFGD-pagamentos-backend-TQS (5)
Grupo de variáveis criadas pela WO0000081780569
Scopes: EC TQS
ENV_DB_PASSWORD
********
ENV_DB_SCHEMA
FUG
ENV_DB_URL
jdbc:db2://10.216.80.111:446/RJKDB2DSDH
ENV_DB_USERNAME
SFUGTR02
INIT
SIFGD-pagamentos-backend-HMP (1)
Grupo de variáveis criadas pela WO0000081780569

Scopes: EC HMP
INIT
OKD-4-APL (12)
Scopes: EC PRD
SIFGD-pagamentos-backend-PRD (1)
Grupo de variáveis criadas pela WO0000081780569
Scopes: EC PRD
|Manage variable groups
1 pipelines found

Showing filters 1 through 2

Showing filters 1 through 2

Showing filters 1 through 2

2 pipelines found

Row 3

Expanded

Collapsed

Expanded

Collapsed

Expanded

Collapsed

1 pipelines found

Row 2

Row 2

Row 2

Showing filters 1 through 2



corigi so em DES a que ta como secret nao consigo corrigir


