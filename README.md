
-sh-4.2$
-sh-4.2$ oc set env dc/simpi-dict-api-des -n simpi-des --list | grep -i PIX_FRAMEWORK
PIX_FRAMEWORK_VALIDACAO_TOKEN_SSO_EMISSOR=https://login.des.caixa/auth/realms/intranet
PIX_FRAMEWORK_VALIDACAO_TOKEN_SSO_URL=https://sispi-api-proxy-sso-des.apps.pixnprd4.caixa/auth/realms/intranet;https://login.des.caixa/auth/realms/intranet
PIX_FRAMEWORK_VALIDACAO_TOKEN_VALIDACAO_GLOBAL=true
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc set env dc/simpi-dict-api-des -n simpi-des --list | grep -i "BT_CLIENT\|CLIENT_ID\|SECRET_ID"
-sh-4.2$
-sh-4.2$
-sh-4.2$
