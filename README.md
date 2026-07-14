
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
OCP-NPRD (8)
Credenciais para o Cluster OCP de NPRD (DES/TQS/HMP)
Scopes: EC DES,EC TQS,EC HMP
SIMPI-MED-DES (19)
Grupo de variáveis de SIMPI-MED-DES
Scopes: EC DES
INIT
Criado via api
VAULT_LOCATION
********
_ENV.BACEN_MED_MAX_CONNECTIONS
50
_ENV.BACEN_V2_URL
https://dict-h.pi.rsfn.net.br/api/v2
_ENV.CERT_ASSINATURA_ISSUER_NAME
${simpi_issuer_cert}
_ENV.CERT_ASSINATURA_SERIAL_NUMBER
${simpi_sn_cert}
_ENV.HSM_HOSTNAME
hsmdes.extra.caixa.gov.br
_ENV.HSM_PASSWORD
${smpisd01_hsm}
_ENV.HSM_PRIVATE_KEY_NAME
${simpi_alias_cert}
_ENV.HSM_USER_ID
SMPISD01
_ENV.ISPB_CAIXA
00360305
_ENV.MED_KEYSTORE_PASSWORD
${simpi_kspix_01}
_ENV.MED_KEYSTORE_PATH
/deployments/simpi-des-keystore-092025.jks
_ENV.MED_TRUSTSTORE_PASSWORD
123456
_ENV.MED_TRUSTSTORE_PATH
/deployments/simpi-des-truststore-202602.jks
_ENV.PIX_FRAMEWORK_VALIDACAO_TOKEN_SSO_EMISSOR
https://login.des.caixa/auth/realms/intranet
_ENV.PIX_FRAMEWORK_VALIDACAO_TOKEN_SSO_URL
https://sispi-api-proxy-sso-des.apps.pixnprd4.caixa/auth/realms/intranet;https://login.des.caixa/auth/realms/intranet
_ENV.PIX_FRAMEWORK_VALIDACAO_TOKEN_VALIDACAO_GLOBAL
true
_SECRET.SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS
#{VAULT_LOCATION}#
SIMPI-BT-VAULT-SECRET-DES (2)
Scopes: EC DES
