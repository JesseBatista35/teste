
-sh-4.2$ oc set env dc/sigfa-api-aplicacao-okd4-pos-tqs --list -n sigfa-tqs | grep -i client_id
TOKEN_CLIENT_ID=cli-ser-gfa
-sh-4.2$ oc get secret <nome-do-secret-bt> -n sigfa-tqs -o yaml
-sh: nome-do-secret-bt: Arquivo ou diretório não encontrado
-sh-4.2$



Skip to main content
projetos
/
Caixa
/
Pipelines
/
Releases
/
SIGFA-api-aplicacao-OKD4
Search








All pipelines

SIGFA

SIGFA-api-aplicacao-OKD4
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
OKD-4-NPRD (12)
Credenciais para o Cluster OKD4 de NPRD (DES/TQS/HMP)
Scopes: EC DES,EC TQS,EC TGE,EC HMP,EC HOTFIX +1
SIGFA-api-aplicacao-des (79)
Scopes: EC DES
sigfa-api-aplicacao-BT-VAULT-DES (1)
sigfa-api-aplicacao-BT-VAULT-DES
Scopes: EC DES
BT_SECRETS_LIST
SIGFA_DES/CLISERGFA_SSO_INTRA,SIGFA_DES/SGFADS01_ORACLE,SIGFA_DES/SIGFA_APIKEY
SIGFA-BT-VAULT-SECRET-DES (2)
Scopes: EC DES
BT_CLIENT_ID
d20bd381-12a9-43e1-9eb1-c6a7dcd6f1c6
BT_CLIENT_SECRET
********
SIGFA-api-aplicacao-tqs (78)
Scopes: EC TQS,EC HOTFIX
ADAPTER_VARIABLES (9)
Variáveis disponíveis para todas os projetos do tipo ADAPTER.
Scopes: EC TQS
ADAPTER_VARIABLES - SIACM Cartões (7)
Variáveis disponíveis para todas os projetos do tipo ADAPTER.
Scopes: EC TQS
SIGFA-API-APLICACAO-BT-VAULT-TQS (3)
sigfa-api-aplicacao-BT-VAULT-TQS WO0000080550744
Scopes: EC TQS
SIGFA-api-aplicacao-tge (74)
Scopes: EC TGE
SIGFA-API-APLICACAO-BT-VAULT-TGE (1)
WO0000081157285

Scopes: EC TGE
BT_SECRETS_LIST
SIGFA_TGE/CLISERGFA_SSO_INTRA,SIGFA_TGE/SGFATS01_ORACLE,SIGFA_TGE/SIGFA_APIKEY,SIGFA_TGE/SIGFA_BT_APIKEY
OKD-4-APL (12)
Scopes: EC PRD
SIGFA-api-aplicacao-prd (75)
ajustado o nome do jks 22/01/24 - c067581
Scopes: EC PRD
sigfa-api-aplicacao-BT-VAULT-PRD (1)
sigfa-api-aplicacao-BT-VAULT-PRD
Scopes: EC PRD
SIGFA-BT-VAULT-SECRET-PRD (2)
Scopes: EC PRD
BT_CLIENT_ID
9efd6926-5c05-41c4-b6fd-87eb273b5f23
BT_CLIENT_SECRET
********
|Manage variable groups
Showing 26 deployments

EC TGEDeploy release

Showing filters 1 through 2

Showing filters 1 through 2

Showing filters 1 through 2

Showing filters 1 through 2

Showing filters 1 through 2

Showing 26 deployments

EC TGEDeploy release

Row 3

Row 3

Row 4

Row 2

Row 2

Row 2

Row 4

Row 2

Showing filters 1 through 2

Expanded

Collapsed





fano uma olhada nas variaves ta fantod a de secrets do TGE CERTO?
