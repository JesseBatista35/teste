2026-07-14T19:37:47.0146718Z ##[section]Starting: Bash Script
2026-07-14T19:37:47.0150270Z ==============================================================================
2026-07-14T19:37:47.0150352Z Task         : Bash
2026-07-14T19:37:47.0150526Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-14T19:37:47.0150617Z Version      : 3.227.0
2026-07-14T19:37:47.0150664Z Author       : Microsoft Corporation
2026-07-14T19:37:47.0150717Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-14T19:37:47.0150813Z ==============================================================================
2026-07-14T19:37:47.1721971Z Generating script.
2026-07-14T19:37:47.1733760Z ========================== Starting Command Output ===========================
2026-07-14T19:37:47.1741317Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/4c9db281-5dd1-4adf-b4bc-594e0474f137.sh
2026-07-14T19:37:47.1806365Z ===== VALOR REAL DE Enviroment ANTES DO GRUPO Cria_APP_OKD =====
2026-07-14T19:37:47.1808489Z Enviroment=[ -e BACEN_MED_MAX_CONNECTIONS=50 -e BACEN_V2_URL=https://dict-h.pi.rsfn.net.br/api/v2 -e CERT_ASSINATURA_ISSUER_NAME= -e CERT_ASSINATURA_SERIAL_NUMBER= -e HSM_HOSTNAME=hsmdes.extra.caixa.gov.br -e HSM_PASSWORD= -e HSM_PRIVATE_KEY_NAME= -e HSM_USER_ID=SMPISD01 -e ISPB_CAIXA=00360305 -e MED_KEYSTORE_PASSWORD= -e MED_KEYSTORE_PATH=/deployments/simpi-des-keystore-092025.jks -e MED_TRUSTSTORE_PASSWORD=123456 -e MED_TRUSTSTORE_PATH=/deployments/simpi-des-truststore-202602.jks -e PIX_FRAMEWORK_VALIDACAO_TOKEN_SSO_EMISSOR=https://login.des.caixa/auth/realms/intranet -e PIX_FRAMEWORK_VALIDACAO_TOKEN_SSO_URL=https://sispi-api-proxy-sso-des.apps.pixnprd4.caixa/auth/realms/intranet;https://login.des.caixa/auth/realms/intranet -e PIX_FRAMEWORK_VALIDACAO_TOKEN_VALIDACAO_GLOBAL=true]
2026-07-14T19:37:47.1809113Z KIND_DEPLOY=[deploymentconfig]
2026-07-14T19:37:47.1809284Z resource_app=[simpi-med-des]
2026-07-14T19:37:47.1809429Z ==================================================================
2026-07-14T19:37:47.1885597Z ##[section]Finishing: Bash Script


2026-07-14T19:37:47.7513486Z ##[section]Starting: Atualizando Variáveis de Ambiente
2026-07-14T19:37:47.7517334Z ==============================================================================
2026-07-14T19:37:47.7517431Z Task         : Bash
2026-07-14T19:37:47.7517477Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-14T19:37:47.7517676Z Version      : 3.227.0
2026-07-14T19:37:47.7517740Z Author       : Microsoft Corporation
2026-07-14T19:37:47.7517795Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-14T19:37:47.7517870Z ==============================================================================
2026-07-14T19:37:47.8971106Z Generating script.
2026-07-14T19:37:47.8982559Z ========================== Starting Command Output ===========================
2026-07-14T19:37:47.8990094Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/39c5e360-d30f-4e6f-8809-728ccdefee9b.sh
2026-07-14T19:37:47.9048867Z Nova APP: false
2026-07-14T19:37:47.9802984Z Warning: apps.openshift.io/v1 DeploymentConfig is deprecated in v4.14+, unavailable in v4.10000+
2026-07-14T19:37:48.0676003Z Warning: apps.openshift.io/v1 DeploymentConfig is deprecated in v4.14+, unavailable in v4.10000+
2026-07-14T19:37:48.1234955Z error: one or more resources must be specified as <resource> <name> or <resource>/<name>
2026-07-14T19:37:48.1235836Z See 'oc set env -h' for help and examples
2026-07-14T19:37:48.1306885Z ##[error]Bash exited with code '1'.
2026-07-14T19:37:48.1362628Z ##[section]Finishing: Atualizando Variáveis de Ambiente
