Correção
Antes de mexer, teste no navegador: https://sicow-portal-okd-des.apps.nprd.caixa/sicow-portal-okd/pages/home.cef. Deve abrir o portal.
Na Library SICOW-PENHOR-OKD-DES, altere SICOWPORTALURL para:
   https://sicow-portal-okd-des.apps.nprd.caixa/sicow-portal-okd/pages/home.cef
Rode só a release do Penhor. Não precisa de build. Aproveite para vincular o grupo SICOW-BT-VAULT-SECRET-DES.


<img width="1874" height="933" alt="image" src="https://github.com/user-attachments/assets/6c9c2d0d-f0c3-49fe-a22c-a60621c3d68f" />

Skip to main content
projetos
/
Caixa
/
Pipelines
/
Releases
/
SICOW-penhor-okd
Search








All pipelines

sicow

SICOW-penhor-okd
Predefined variables
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
Usuario-Azure-DevOps (12)
Scopes: Release
EGRESS_IP_OKD (81)
WO0000072264656 - Config Portal Infrafácil NO_PROXY
Scopes: Release
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
MUDANCA_GSC (3)
WO0000079495945
Scopes: Release
ADAPTER_VARIABLES (9)
Variáveis disponíveis para todas os projetos do tipo ADAPTER.
Scopes: Release
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)
Scopes: Release
Compartilhamentos (4)
Scopes: Release
OKD-4-NPRD (12)
Credenciais para o Cluster OKD4 de NPRD (DES/TQS/HMP)
Scopes: EC DES,EC TQS,EC HMP
ADAPTER_VARIABLES - SIACM Cartões (7)
Variáveis disponíveis para todas os projetos do tipo ADAPTER.
Scopes: EC DES
SICOW-PENHOR-OKD-DES (33)
Grupo de variáveis de SICOW-PENHOR-OKD-DES
Scopes: EC DES
INIT
Criado via api
JKS_FILE
/opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd-sicow.jks
JVM_HEAP_MAX
1024m
JVM_HEAP_MIN
1024m
JVM_METASPACE_MAX
512m
JVM_METASPACE_MIN
96m
JVM_PROXY_HOST
proxydes.caixa
JVM_PROXY_PORT
80
MAIL_EXPRESSO_HOST
smtptest.correiolivre.caixa
MAIL_EXPRESSO_PORT
25
SICOWCONRES_WAR
https://sicow-conres-okd-des.apps.nprd.caixa/sicow-conres
SICOWIMP_WAR
https://sicow-imp-okd-des.apps.nprd.caixa/sicow-imp-okd
SICOWLG_WAR
https://sicow-lg-okd-des.apps.nprd.caixa/sicowlg
SICOWMTE_WAR
https://sicow-mte-okd-des.apps.nprd.caixa/sicow-mte-okd
SICOWNIA_WAR
https://sicow-nia-okd-des.apps.nprd.caixa/sicow-nia-okd
SICOWPENHOR_WAR
https://sicow-penhor-okd-des.apps.nprd.caixa/sicowpenhor
SICOWPORTALURL
https://sicow-portal-okd-des.apps.nprd.caixa/sicow-portal/pages/home.cef
SICOWSEG_WAR
https://sicow-seg-okd-des.apps.nprd.caixa/sicowseg
SICOW_DS
jdbc:postgresql://10.116.92.41:5116/cowdb001?autoReconnect=true
SICOW_DS_MAX_POLL_SIZE
10
SICOW_DS_MIN_POLL_SIZE
5
SICOW_DS_PASSWORD
${VAULT::SICOW::SCOWDB01::1}
SICOW_DS_USER
scowdb01
SIUSR_END_POINT
http://hmp.autentica.proinfo.caixa/siusr-service/SiusrService/SiusrWS
SIZE_VOLUME
50Gi
URL_PROXY
proxydes.caixa
USER_TIMEZONE
America/Buenos_Aires
VAULT_ITERATION_COUNT
44
VAULT_KEYSTORE_ALIAS
SecurityKey
VAULT_KEYSTORE_FILE
vault-sicow-des.keystore
VAULT_KEYSTORE_PASSWORD
MASK-lHQotGsUSmQ5YQRzdtNLD361rwn0c0oJ
VAULT_SALT
87654321
_ENV.APPLICATIONINSIGHTS_ROLE_NAME
SICOW-PENHOR-OKD-DES
SICOW-APPLICATIONINSIGHTS-DES (5)
Grupo de variáveis de APPLICATIONINSIGHTS-DES
Scopes: EC DES
ADAPTER_VARIABLES - SICTM SIBOT CaixaTem (8)
Variáveis disponíveis para todas os projetos do tipo ADAPTER.
Scopes: EC DES
SICOW-BT-VAULT-SECRET-DES (3)
WO0000081288532
Scopes: EC DES
SICOW-PENHOR-OKD-TQS (1)
Grupo de variáveis de SICOW-PENHOR-OKD-TQS
Scopes: EC TQS
SICOW-PORTAL-OKD-TQS (268)
Grupo de variáveis de SICOW-PORTAL-OKD-TQS
Scopes: EC TQS
SICOW-PENHOR-OKD-HMP (1)
Grupo de variáveis de SICOW-PENHOR-OKD-HMP
Scopes: EC HMP
OKD-4-APL (12)
Scopes: EC PRD
SICOW-PENHOR-OKD-PRD (1)
Grupo de variáveis de SICOW-PENHOR-OKD-PRD
Scopes: EC PRD
|Manage variable groups
Select a release pipeline to view its releases

10 pipelines found

Select a release pipeline to view its releases

4 pipelines found

Showing filters 1 through 2

Showing filters 1 through 2

Showing 26 deployments

Row 5

Collapsed

Expanded

Row 4

Collapsed

Expanded

Row 3

Collapsed

Showing 25 deployments

Showing 25 deployments

Row 2

Row 2

Showing filters 1 through 2





alterado
