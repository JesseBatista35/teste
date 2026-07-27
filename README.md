
-sh-4.2$ oc get deployment sigfa-api-openfinance-des -n sigfa-des -o yaml | grep -A5 -i secret
Error from server (NotFound): deployments.apps "sigfa-api-openfinance-des" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get configmap -n sigfa-des | grep -i secret oc describe configmap -n sigfa-des
grep: oc: Arquivo ou diretório não encontrado
grep: describe: Arquivo ou diretório não encontrado
grep: configmap: Arquivo ou diretório não encontrado
grep: sigfa-des: Arquivo ou diretório não encontrado
-sh-4.2$



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
SIGFA-api-openfinance
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
SIGFA

SIGFA-api-openfinance
Predefined variables
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
Usuario-Azure-DevOps (12)
Scopes: Release
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
EGRESS_IP_OKD (74)
WO0000072264656 - Config Portal Infrafácil NO_PROXY
Scopes: Release
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)
Scopes: Release
QA-PERFORMANCE-SIGFA-api-openfinance (7)
Variaveis para execução da automação de testes de API nas releases da Aplicação.
Scopes: Release
OKD-4-NPRD (12)
Credenciais para o Cluster OKD4 de NPRD (DES/TQS/HMP)
Scopes: EC DES,EC TQS,EC TGE,EC HMP,EC PRD
SIGFA-api-openfinance-des (33)
Scopes: EC DES
SIGFA-API-OPENFINANCE-BT-VAULT-DES (1)
SIGFA-API-OPENFINANCE-BT-VAULT-DES

Scopes: EC DES
BT_SECRETS_LIST
0
SIGFA-BT-VAULT-SECRET-DES (2)
Scopes: EC DES
BT_CLIENT_ID
d20bd381-12a9-43e1-9eb1-c6a7dcd6f1c6
BT_CLIENT_SECRET
********
SIGFA-api-openfinance-tqs (33)
Scopes: EC TQS
SIGFA-API-OPENFINANCE-BT-VAULT-TQS (1)
SIGFA-API-OPENFINANCE-BT-VAULT-TQS

Scopes: EC TQS
SIGFA-api-openfinance-tge (33)
Scopes: EC TGE
SIGFA-API-OPENFINANCE-BT-VAULT-TGE (1)
SIGFA-API-OPENFINANCE-BT-VAULT-TGE
Scopes: EC TGE
OKD-4-APL (12)
Scopes: EC PRD
SIGFA-api-openfinance-prd (31)
Scopes: EC PRD
SIGFA-BT-VAULT-SECRET-PRD (2)
Scopes: EC PRD
BT_CLIENT_ID
9efd6926-5c05-41c4-b6fd-87eb273b5f23
BT_CLIENT_SECRET
********
|Manage variable groups
Row 9

Showing filters 1 through 2

Row 10

Showing filters 1 through 2

Row 14

Showing filters 1 through 2

Showing filters 1 through 2



aqui na variavel da esteira ta 0 o secret list
