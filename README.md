2026-11-16T20:32:03.7647407Z ##[section]Starting: Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP
2026-11-16T20:32:03.7650808Z ==============================================================================
2026-11-16T20:32:03.7650896Z Task         : Bash
2026-11-16T20:32:03.7650956Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-16T20:32:03.7651024Z Version      : 3.227.0
2026-11-16T20:32:03.7651074Z Author       : Microsoft Corporation
2026-11-16T20:32:03.7651139Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-16T20:32:03.7651294Z ==============================================================================
2026-11-16T20:32:04.8073554Z Generating script.
2026-11-16T20:32:04.8084080Z ========================== Starting Command Output ===========================
2026-11-16T20:32:04.8090897Z [command]/bin/bash /opt/ads-agent/_work/_temp/a53f7943-c448-491e-b6d4-cc3a9e414e6c.sh
2026-11-16T20:32:04.8145131Z + echo ocp_nprd
2026-11-16T20:32:04.8145731Z + egrep -q '^(okd4|ocp|openshift)'
2026-11-16T20:32:04.8170692Z ++ check_status_code https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads//manifests/20261116.1231-1.0.0-SNAPSHOT
2026-11-16T20:32:04.8171080Z ++ local url=https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads//manifests/20261116.1231-1.0.0-SNAPSHOT
2026-11-16T20:32:04.8173999Z ++ curl --location --request GET https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads//manifests/20261116.1231-1.0.0-SNAPSHOT --header 'Authorization: Bearer ***' --header 'Content-Type: text/plain' -s -k -o /dev/null -w '%{http_code}'
2026-11-16T20:32:04.9749127Z + status_code=400
2026-11-16T20:32:04.9749491Z + [[ 400 -ne 200 ]]
2026-11-16T20:32:04.9749607Z + [[ des != \p\r\d ]]
2026-11-16T20:32:04.9749832Z + handle_image_not_found 20261116.1231-1.0.0-SNAPSHOT build-images-ads ''
2026-11-16T20:32:04.9750044Z + local build_number=20261116.1231-1.0.0-SNAPSHOT
2026-11-16T20:32:04.9750333Z + local project_build=build-images-ads
2026-11-16T20:32:04.9750461Z + local build_name=
2026-11-16T20:32:04.9750564Z + echo ''
2026-11-16T20:32:04.9750885Z + echo 'A tag 20261116.1231-1.0.0-SNAPSHOT não foi encontrada no ImageStream de Build: https://console-openshift-console.apps.produtos4.caixa/k8s/ns/build-images-ads/imagestreams/'
2026-11-16T20:32:04.9751188Z + echo 'Verifique se a tag 20261116.1231-1.0.0-SNAPSHOT foi gerada corretamente durante a Build'
2026-11-16T20:32:04.9751337Z + exit 1
2026-11-16T20:32:04.9751407Z 
2026-11-16T20:32:04.9751695Z A tag 20261116.1231-1.0.0-SNAPSHOT não foi encontrada no ImageStream de Build: https://console-openshift-console.apps.produtos4.caixa/k8s/ns/build-images-ads/imagestreams/
2026-11-16T20:32:04.9751986Z Verifique se a tag 20261116.1231-1.0.0-SNAPSHOT foi gerada corretamente durante a Build
2026-11-16T20:32:04.9769262Z ##[error]Bash exited with code '1'.
2026-11-16T20:32:04.9797491Z ##[section]Finishing: Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP



2026-11-16T20:31:32.9244874Z ##[section]Starting: Exportando Variáveis de Ambiente "_ENV."
2026-11-16T20:31:32.9247954Z ==============================================================================
2026-11-16T20:31:32.9248105Z Task         : Bash
2026-11-16T20:31:32.9248165Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-16T20:31:32.9248232Z Version      : 3.227.0
2026-11-16T20:31:32.9248278Z Author       : Microsoft Corporation
2026-11-16T20:31:32.9248341Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-16T20:31:32.9248419Z ==============================================================================
2026-11-16T20:31:33.8225762Z Generating script.
2026-11-16T20:31:33.8237522Z ========================== Starting Command Output ===========================
2026-11-16T20:31:33.8244531Z [command]/bin/bash /opt/ads-agent/_work/_temp/b10a6499-954e-4d1a-a4d8-358cb7775a4d.sh
2026-11-16T20:31:33.8330984Z APPLICATION_NAME="(SISPI) DICT REINVINDICACOES - DES"
2026-11-16T20:31:33.8332333Z JAVA_OPTIONS_APPEND="-Xms1280m -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -Djavaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.5.1.jar -Djavax.net.ssl.keyStore=/deployments/caixa-keystore-mpi-mq-plexd-nprd.jks"
2026-11-16T20:31:33.8332704Z JAVA_TOOL_OPTIONS="-Dfile.encoding=UTF8"
2026-11-16T20:31:33.8332892Z PIX_API_MANAGER=https://api.des.caixa:8443
2026-11-16T20:31:33.8333031Z PIX_ENVIRONMENT=DES
2026-11-16T20:31:33.8333149Z PIX_ISPB_CAIXA=00360305
2026-11-16T20:31:33.8333299Z PIX_LOGIN_CAIXA_INTERNET_URL=https://logindes.caixa.gov.br/auth/realms/internet
2026-11-16T20:31:33.8333458Z PIX_LOGIN_CAIXA_INTRANET_READTIMEOUT=1000
2026-11-16T20:31:33.8333595Z PIX_LOGIN_CAIXA_INTRANET_TIMEOUT=1000
2026-11-16T20:31:33.8333753Z PIX_LOGIN_CAIXA_INTRANET_URL=https://login.des.caixa/auth/realms/intranet
2026-11-16T20:31:33.8333929Z PIX_LOGIN_CAIXA_LOGIN2_URL=https://login2des.caixa.gov.br/auth/realms/internet
2026-11-16T20:31:33.8334108Z PIX_LOGIN_CAIXA_LOGINX_URL=https://loginxdes.caixa.gov.br/auth/realms/r_inter_siper
2026-11-16T20:31:33.8334387Z PIX_LOGIN_CAIXA_SSO_PROXY_INTRANET_URL=https://sispi-api-proxy-sso-des.apps.pixnprd4.caixa/auth/realms/intranet
2026-11-16T20:31:33.8334562Z PIX_LOGIN_PROXY_CAIXA_INTERNET_READTIMEOUT=1000
2026-11-16T20:31:33.8334698Z PIX_LOGIN_PROXY_CAIXA_INTERNET_TIMEOUT=1000
2026-11-16T20:31:33.8335095Z PIX_LOGIN_PROXY_CAIXA_INTERNET_URL=http://sispi-api-proxy-sso-des:8080/auth/realms/internet
2026-11-16T20:31:33.8335272Z PIX_LOGIN_PROXY_CAIXA_INTRANET_READTIMEOUT=1000
2026-11-16T20:31:33.8335403Z PIX_LOGIN_PROXY_CAIXA_INTRANET_TIMEOUT=1000
2026-11-16T20:31:33.8335643Z PIX_LOGIN_PROXY_CAIXA_INTRANET_URL=http://sispi-api-proxy-sso-des:8080/auth/realms/intranet
2026-11-16T20:31:33.8336240Z PIX_LOGIN_PROXY_LOGINX_READTIMEOUT=1000
2026-11-16T20:31:33.8336494Z PIX_LOGIN_PROXY_LOGINX_TIMEOUT=1000
2026-11-16T20:31:33.8337367Z PIX_LOGIN_PROXY_LOGINX_URL=http://sispi-api-proxy-sso-des:8080/auth/realms/r_inter_siper
2026-11-16T20:31:33.8337773Z PIX_SUPORTE_DATABASE_CHECKCONNECTION_SCHEDUDLE="0 * * ? * * *"
2026-11-16T20:31:33.8338746Z PIX_SUPORTE_DEPENDENCY_MONITOR_SSOINTER_ENABLED=true
2026-11-16T20:31:33.8339238Z PIX_SUPORTE_DEPENDENCY_MONITOR_SSOINTRA_ENABLED=true
2026-11-16T20:31:33.8339980Z PIX_SUPORTE_DEPENDENCY_MONITOR_SSO_NAME="SSO Caixa"
2026-11-16T20:31:33.8340263Z PIX_SUPORTE_DEPENDENCY_SCHEDULE="0 * * ? * * *"
2026-11-16T20:31:33.8341114Z PIX_SUPORTE_LOG_LEVEL=br.gov.caixa:INFO
2026-11-16T20:31:33.8341558Z PIX_SUPORTE_PROXY_HOST=proxydes.caixa
2026-11-16T20:31:33.8342327Z PIX_SUPORTE_PROXY_PORTA=80
2026-11-16T20:31:33.8342721Z PIX_SUPORTE_PROXY_USUARIO=s739019
2026-11-16T20:31:33.8343475Z PIX_SUPORTE_REQUEST_TIMEOUT=5000
2026-11-16T20:31:33.8344833Z PIX_SUPORTE_SERVICE_RELOAD="0/59 * * * * ?"
2026-11-16T20:31:33.8344975Z PIX_TENTANT_IDENTIFIER=.caixa.gov.br
2026-11-16T20:31:33.8345181Z PUSH_CAIXA_PROXY_HOST=proxydes.caixa
2026-11-16T20:31:33.8345786Z PUSH_CAIXA_PROXY_PORTA=80
2026-11-16T20:31:33.8346391Z PUSH_CAIXA_PROXY_PROTOCOLO=http
2026-11-16T20:31:33.8347147Z PUSH_CAIXA_URL=https://apppushcaixadev.azurewebsites.net/
2026-11-16T20:31:33.8348059Z QUARKUS_DATASOURCE_DATAGUARD_JDBC_URL="jdbc:oracle:thin:@(DESCRIPTION=(LOAD_BALANCE=off)(ADDRESS=(PROTOCOL=TCP)(HOST=10.116.101.16)(PORT=1521))(CONNECT_DATA=(SERVICE_NAME=CDBD08NGPDB017)(SERVER=DEDICATED)))"
2026-11-16T20:31:33.8348722Z QUARKUS_DATASOURCE_DATAGUARD_USERNAME=SSPIBD03
2026-11-16T20:31:33.8349708Z QUARKUS_DATASOURCE_JDBC_URL="jdbc:oracle:thin:@(DESCRIPTION=(LOAD_BALANCE=off)(ADDRESS=(PROTOCOL=TCP)(HOST=10.116.101.16)(PORT=1521))(CONNECT_DATA=(SERVICE_NAME=CDBD08NGPDB017)(SERVER=DEDICATED)))"
2026-11-16T20:31:33.8350394Z QUARKUS_DATASOURCE_USERNAME=SSPIBD03
2026-11-16T20:31:33.8351427Z QUARKUS_LOG_CONSOLE_FORMAT="%d{yyyy-MM-dd HH:mm:ss,SSS} %-5p %X{correlation-id}  [%c{3.}] (%t) %s%e%n"
2026-11-16T20:31:33.8351933Z SISPI_AMBIENTE=dev
2026-11-16T20:31:33.8352709Z SISPI_API_KEY=l7b6c6112c1ff84516b6dd91cca165e3bc
2026-11-16T20:31:33.8353459Z SISPI_API_MANAGER=https://api.des.caixa:8443
2026-11-16T20:31:33.8354201Z SISPI_CLIENT_ID_SPI=cli-ser-spi
2026-11-16T20:31:33.8354936Z SISPI-DICT_HTTP_CONN_TIMEOUT_PUSH=5000
2026-11-16T20:31:33.8355685Z SISPI-DICT_HTTP_SOCKET_TIMEOUT_PUSH=5000
2026-11-16T20:31:33.8356419Z SISPI-DICT_POLLING_QTD_MINUTOS_FRENTE=1
2026-11-16T20:31:33.8357155Z SISPI-DICT_POLLING_QTD_MINUTOS_TRAS=1
2026-11-16T20:31:33.8357986Z SISPI-DICT_QTD_PROCESSAMENTOS_REIVINDICACOES_SIMULTANEOS=8
2026-11-16T20:31:33.8358876Z SISPI-DICT_QTD_REGISTROS_RESOLUCAO_REIVINDICACAO_BATCH=400
2026-11-16T20:31:33.8359563Z SISPI_ISPB_CAIXA=00360305
2026-11-16T20:31:33.8360574Z SISPI_LOGIN_CAIXA_INTRANET_SECRET=1938b188-42c7-4889-bf3a-7d95e4432fe9
2026-11-16T20:31:33.8361301Z SISPI_LOGIN_CAIXA_INTRANET_URL=https://login.des.caixa/auth/realms/intranet
2026-11-16T20:31:33.8362243Z SISPI_MPI_DICT_URL=http://simpi-container-dict-des-esteiras.simpi-des.svc:8080
2026-11-16T20:31:33.8362998Z SISPI_REMOTE_UPDATE_KEY=28c42e35cb0fac64df009f380efe3b3f
2026-11-16T20:31:33.8363832Z SISPI_SUPORTE_LOG_LEVEL=br.gov.caixa.sispi:INFO
2026-11-16T20:31:33.8419493Z ##[section]Finishing: Exportando Variáveis de Ambiente "_ENV."



2026-11-16T20:31:33.8442802Z ##[section]Starting: Criando novo Projeto
2026-11-16T20:31:33.8446250Z ==============================================================================
2026-11-16T20:31:33.8446352Z Task         : Bash
2026-11-16T20:31:33.8446410Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-16T20:31:33.8446488Z Version      : 3.227.0
2026-11-16T20:31:33.8446544Z Author       : Microsoft Corporation
2026-11-16T20:31:33.8446618Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-16T20:31:33.8446695Z ==============================================================================
2026-11-16T20:31:34.7994246Z Generating script.
2026-11-16T20:31:34.8012139Z ========================== Starting Command Output ===========================
2026-11-16T20:31:34.8013485Z [command]/bin/bash /opt/ads-agent/_work/_temp/6991e641-ccac-49b2-a9c4-c0bd6691104e.sh
2026-11-16T20:31:34.9235257Z NAME        DISPLAY NAME   STATUS
2026-11-16T20:31:34.9235632Z sispi-des                  Active
2026-11-16T20:31:35.0244319Z namespace/sispi-des not labeled
2026-11-16T20:31:35.1209017Z namespace/sispi-des not labeled
2026-11-16T20:31:35.2168764Z namespace/sispi-des not labeled
2026-11-16T20:31:35.3132573Z netnamespace.network.openshift.io/sispi-des not labeled
2026-11-16T20:31:35.3212691Z ##[section]Finishing: Criando novo Projeto
