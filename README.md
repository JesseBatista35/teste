<img width="1846" height="985" alt="image" src="https://github.com/user-attachments/assets/7de8cf9a-ae1e-40ac-8ea5-aa973290c0b1" />


2026-07-14T18:27:07.5673125Z ##[section]Starting: Criando nova APP
2026-07-14T18:27:07.5676294Z ==============================================================================
2026-07-14T18:27:07.5676374Z Task         : Bash
2026-07-14T18:27:07.5676422Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-14T18:27:07.5676497Z Version      : 3.227.0
2026-07-14T18:27:07.5676541Z Author       : Microsoft Corporation
2026-07-14T18:27:07.5676593Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-14T18:27:07.5676679Z ==============================================================================
2026-07-14T18:27:07.7014083Z Generating script.
2026-07-14T18:27:07.7031139Z ========================== Starting Command Output ===========================
2026-07-14T18:27:07.7042636Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/3d680880-2e5f-453b-9db6-437a408f2038.sh
2026-07-14T18:27:07.7223331Z OCP NPRD - des, tqs ou hmp
2026-07-14T18:27:07.7224880Z /opt/ads-agent/_work/_temp/3d680880-2e5f-453b-9db6-437a408f2038.sh: line 58: [-e: command not found
2026-07-14T18:27:07.7841202Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-07-14T18:27:07.7841425Z Server Version: 4.15.59
2026-07-14T18:27:07.7841547Z Kubernetes Version: v1.28.15+d227d65
2026-07-14T18:27:07.8913715Z Warning: apps.openshift.io/v1 DeploymentConfig is deprecated in v4.14+, unavailable in v4.10000+
2026-07-14T18:27:07.9935081Z Essa aplicação já está criada.
2026-07-14T18:27:08.0767915Z Warning: apps.openshift.io/v1 DeploymentConfig is deprecated in v4.14+, unavailable in v4.10000+
2026-07-14T18:27:08.0956706Z deploymentconfig.apps.openshift.io/simpi-med-des patched (no change)
2026-07-14T18:27:08.1811777Z clusterrole.rbac.authorization.k8s.io/system:openshift:scc:anyuid added: "system:serviceaccounts:simpi-des"
2026-07-14T18:27:08.1900523Z ##[section]Finishing: Criando nova APP


2026-07-14T18:27:06.6724686Z ##[section]Starting: Criando novo Projeto
2026-07-14T18:27:06.6728338Z ==============================================================================
2026-07-14T18:27:06.6728520Z Task         : Bash
2026-07-14T18:27:06.6728578Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-14T18:27:06.6728655Z Version      : 3.227.0
2026-07-14T18:27:06.6728710Z Author       : Microsoft Corporation
2026-07-14T18:27:06.6728772Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-14T18:27:06.6728857Z ==============================================================================
2026-07-14T18:27:06.8180593Z Generating script.
2026-07-14T18:27:06.8191997Z ========================== Starting Command Output ===========================
2026-07-14T18:27:06.8199471Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/6e905ea2-f163-45f0-8fa4-1f91dd0f73f6.sh
2026-07-14T18:27:06.9010253Z NAME        DISPLAY NAME   STATUS
2026-07-14T18:27:06.9010957Z simpi-des                  Active
2026-07-14T18:27:07.0404543Z namespace/simpi-des not labeled
2026-07-14T18:27:07.1330564Z namespace/simpi-des not labeled
2026-07-14T18:27:07.2304440Z namespace/simpi-des not labeled
2026-07-14T18:27:07.3145450Z netnamespace.network.openshift.io/simpi-des not labeled
2026-07-14T18:27:07.3238308Z ##[section]Finishing: Criando novo Projeto



2026-07-14T18:27:06.5106989Z ##[section]Starting: Exportando Variáveis de Ambiente "_ENV."
2026-07-14T18:27:06.5110298Z ==============================================================================
2026-07-14T18:27:06.5110388Z Task         : Bash
2026-07-14T18:27:06.5110437Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-14T18:27:06.5110503Z Version      : 3.227.0
2026-07-14T18:27:06.5110557Z Author       : Microsoft Corporation
2026-07-14T18:27:06.5110609Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-14T18:27:06.5110685Z ==============================================================================
2026-07-14T18:27:06.6473934Z Generating script.
2026-07-14T18:27:06.6488954Z ========================== Starting Command Output ===========================
2026-07-14T18:27:06.6498915Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/46ad0acf-0dff-4db3-a149-b3a9f89882cf.sh
2026-07-14T18:27:06.6622411Z BACEN_MED_MAX_CONNECTIONS=50
2026-07-14T18:27:06.6624195Z BACEN_V2_URL=https://dict-h.pi.rsfn.net.br/api/v2
2026-07-14T18:27:06.6624609Z CERT_ASSINATURA_ISSUER_NAME=${simpi_issuer_cert}
2026-07-14T18:27:06.6624971Z CERT_ASSINATURA_SERIAL_NUMBER=${simpi_sn_cert}
2026-07-14T18:27:06.6625143Z HSM_HOSTNAME=hsmdes.extra.caixa.gov.br
2026-07-14T18:27:06.6625274Z HSM_PASSWORD=${smpisd01_hsm}
2026-07-14T18:27:06.6625398Z HSM_PRIVATE_KEY_NAME=${simpi_alias_cert}
2026-07-14T18:27:06.6625538Z HSM_USER_ID=SMPISD01
2026-07-14T18:27:06.6625641Z ISPB_CAIXA=00360305
2026-07-14T18:27:06.6625757Z MED_KEYSTORE_PASSWORD=${simpi_kspix_01}
2026-07-14T18:27:06.6626095Z MED_KEYSTORE_PATH=/deployments/simpi-des-keystore-092025.jks
2026-07-14T18:27:06.6626240Z MED_TRUSTSTORE_PASSWORD=123456
2026-07-14T18:27:06.6626439Z MED_TRUSTSTORE_PATH=/deployments/simpi-des-truststore-202602.jks
2026-07-14T18:27:06.6626617Z PIX_FRAMEWORK_VALIDACAO_TOKEN_SSO_EMISSOR=https://login.des.caixa/auth/realms/intranet
2026-07-14T18:27:06.6626939Z PIX_FRAMEWORK_VALIDACAO_TOKEN_SSO_URL=https://sispi-api-proxy-sso-des.apps.pixnprd4.caixa/auth/realms/intranet;https://login.des.caixa/auth/realms/intranet
2026-07-14T18:27:06.6627144Z PIX_FRAMEWORK_VALIDACAO_TOKEN_VALIDACAO_GLOBAL=true
2026-07-14T18:27:06.6684269Z ##[section]Finishing: Exportando Variáveis de Ambiente "_ENV."
