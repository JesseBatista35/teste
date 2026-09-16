2026-09-16T15:15:24.2538037Z ##[section]Starting: Verificando Status do Deployment
2026-09-16T15:15:24.2541582Z ==============================================================================
2026-09-16T15:15:24.2541662Z Task         : Bash
2026-09-16T15:15:24.2541714Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-16T15:15:24.2541776Z Version      : 3.227.0
2026-09-16T15:15:24.2541832Z Author       : Microsoft Corporation
2026-09-16T15:15:24.2541891Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-16T15:15:24.2541963Z ==============================================================================
2026-09-16T15:15:24.3868254Z Generating script.
2026-09-16T15:15:24.3879370Z ========================== Starting Command Output ===========================
2026-09-16T15:15:24.3886807Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/682063fe-e60f-4af8-ab11-ad901fcde590.sh
2026-09-16T15:15:24.4849096Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-09-16T15:15:26.6967116Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-09-16T15:21:31.7636941Z ##[error]The task has timed out.
2026-09-16T15:21:31.7637797Z ##[section]Finishing: Verificando Status do Deployment



2026-09-16T15:21:31.7655664Z ##[section]Starting: Logs da Aplicação
2026-09-16T15:21:31.7658831Z ==============================================================================
2026-09-16T15:21:31.7659036Z Task         : Bash
2026-09-16T15:21:31.7659090Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-16T15:21:31.7659152Z Version      : 3.227.0
2026-09-16T15:21:31.7659195Z Author       : Microsoft Corporation
2026-09-16T15:21:31.7659253Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-16T15:21:31.7659326Z ==============================================================================
2026-09-16T15:21:31.8986300Z Generating script.
2026-09-16T15:21:31.8997024Z ========================== Starting Command Output ===========================
2026-09-16T15:21:31.9005478Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/f3ac5bca-fee9-4752-bdb8-828e7aa0386d.sh
2026-09-16T15:21:31.9059320Z + shopt -s expand_aliases
2026-09-16T15:21:31.9059637Z + [[ -n okd4_nprd ]]
2026-09-16T15:21:31.9059878Z + [[ okd4_nprd =~ ocp ]]
2026-09-16T15:21:31.9060087Z + [[ -n okd4_nprd ]]
2026-09-16T15:21:31.9060275Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-09-16T15:21:31.9063763Z + app=sipge-webhook-des
2026-09-16T15:21:31.9063927Z + oc version
2026-09-16T15:21:31.9825370Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-09-16T15:21:31.9825645Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-09-16T15:21:31.9825838Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-09-16T15:21:31.9860948Z ++ oc get pod -l name=sipge-webhook-des -n sipge-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-09-16T15:21:31.9861794Z ++ tac
2026-09-16T15:21:31.9862053Z ++ grep -v '^$'
2026-09-16T15:21:31.9862319Z ++ head -n1
2026-09-16T15:21:32.0629303Z + last_pod=sipge-webhook-des-11-rwrrh
2026-09-16T15:21:32.0629606Z + echo 'Logs do POD: sipge-webhook-des-11-rwrrh'
2026-09-16T15:21:32.0629811Z + oc logs sipge-webhook-des-11-rwrrh -c sipge-webhook-des -n sipge-des
2026-09-16T15:21:32.0630004Z Logs do POD: sipge-webhook-des-11-rwrrh
2026-09-16T15:21:32.1641706Z exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
2026-09-16T15:21:32.1642063Z __  ____  __  _____   ___  __ ____  ______ 
2026-09-16T15:21:32.1642233Z  --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
2026-09-16T15:21:32.1642399Z  -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
2026-09-16T15:21:32.1642555Z --\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-09-16T15:21:32.1642936Z 2026-09-08 16:58:57,425 WARN  [io.qua.run.log.LoggingSetupRecorder] (main) Log level TRACE for category 'io.quarkus.oidc' set below minimum logging level INFO, promoting it to INFO
2026-09-16T15:21:32.1643523Z 2026-09-08 16:58:57,626 INFO  [io.quarkus] (main) sipge-webhook 1.0.0-SNAPSHOT on JVM (powered by Quarkus 2.13.2.Final) started in 1.771s. Listening on: http://0.0.0.0:8080
2026-09-16T15:21:32.1643813Z 2026-09-08 16:58:57,626 INFO  [io.quarkus] (main) Profile prod activated. 
2026-09-16T15:21:32.1644183Z 2026-09-08 16:58:57,626 INFO  [io.quarkus] (main) Installed features: [cdi, rest-client, resteasy, resteasy-jackson, smallrye-context-propagation, smallrye-health, smallrye-openapi, swagger-ui, vertx]
2026-09-16T15:21:32.1644597Z 2026-09-08 17:00:15,662 INFO  [br.gov.cai.sip.int.val.ValidarXClientCertInterceptor] (executor-thread-1) Header x-client-cert ausente ou em branco na chamada de recebimentoCobranca
2026-09-16T15:21:32.1644990Z 2026-09-08 17:00:30,157 INFO  [br.gov.cai.sip.int.val.ValidarXClientCertInterceptor] (executor-thread-0) Header x-client-cert ausente ou em branco na chamada de recebimentoCobranca
2026-09-16T15:21:32.1645317Z 2026-09-08 17:00:36,562 INFO  [br.gov.cai.sip.int.val.ValidarXClientCertInterceptor] (executor-thread-0) Header x-client-cert enviado
2026-09-16T15:21:32.1645727Z 2026-09-08 17:00:36,809 INFO  [br.gov.cai.sip.con.SsoClientConfig] (executor-thread-0) SSO gerarToken request. path=/auth/realms/intranet/protocol/openid-connect/token, clientId=cli-ser-pge, grantType=client_credentials, secretPresent=true, secretLength=36
2026-09-16T15:21:32.1646564Z 2026-09-08 17:13:44,182 INFO  [br.gov.cai.sip.int.val.ValidarXClientCertInterceptor] (executor-thread-0) Header x-client-cert enviado
2026-09-16T15:21:32.1646973Z 2026-09-08 17:13:44,183 INFO  [br.gov.cai.sip.con.SsoClientConfig] (executor-thread-0) SSO gerarToken request. path=/auth/realms/intranet/protocol/openid-connect/token, clientId=cli-ser-pge, grantType=client_credentials, secretPresent=true, secretLength=36
2026-09-16T15:21:32.1647325Z 2026-09-09 11:57:22,324 INFO  [br.gov.cai.sip.int.val.ValidarXClientCertInterceptor] (executor-thread-62) Header x-client-cert enviado
2026-09-16T15:21:32.1647739Z 2026-09-09 11:57:22,324 INFO  [br.gov.cai.sip.con.SsoClientConfig] (executor-thread-62) SSO gerarToken request. path=/auth/realms/intranet/protocol/openid-connect/token, clientId=cli-ser-pge, grantType=client_credentials, secretPresent=true, secretLength=36
2026-09-16T15:21:32.1648222Z 2026-09-09 11:57:22,415 INFO  [br.gov.cai.sip.int.val.ValidarXClientCertInterceptor] (executor-thread-63) Header x-client-cert enviado
2026-09-16T15:21:32.1648549Z 2026-09-09 11:57:22,941 INFO  [br.gov.cai.sip.int.val.ValidarXClientCertInterceptor] (executor-thread-63) Header x-client-cert enviado
2026-09-16T15:21:32.1648902Z 2026-09-09 11:57:23,081 INFO  [br.gov.cai.sip.ser.WebhookService] (executor-thread-63) SIPGE API retornou erro ao processar webhook. status=403, hasEntity=false
2026-09-16T15:21:32.1649212Z 2026-09-09 11:57:23,113 INFO  [br.gov.cai.sip.int.val.ValidarXClientCertInterceptor] (executor-thread-63) Header x-client-cert enviado
2026-09-16T15:21:32.1649530Z 2026-09-09 11:57:23,923 INFO  [br.gov.cai.sip.int.val.ValidarXClientCertInterceptor] (executor-thread-62) Header x-client-cert enviado
2026-09-16T15:21:32.1649856Z 2026-09-09 11:57:24,070 INFO  [br.gov.cai.sip.int.val.ValidarXClientCertInterceptor] (executor-thread-62) Header x-client-cert enviado
2026-09-16T15:21:32.1650142Z 2026-09-09 14:33:49,293 INFO  [br.gov.cai.sip.int.val.ValidarXClientCertInterceptor] (executor-thread-77) Header x-client-cert enviado
2026-09-16T15:21:32.1650577Z 2026-09-09 14:33:49,294 INFO  [br.gov.cai.sip.con.SsoClientConfig] (executor-thread-77) SSO gerarToken request. path=/auth/realms/intranet/protocol/openid-connect/token, clientId=cli-ser-pge, grantType=client_credentials, secretPresent=true, secretLength=36
2026-09-16T15:21:32.1650958Z 2026-09-09 14:33:49,544 INFO  [br.gov.cai.sip.int.val.ValidarXClientCertInterceptor] (executor-thread-77) Header x-client-cert enviado
2026-09-16T15:21:32.1651246Z 2026-09-09 14:33:49,718 INFO  [br.gov.cai.sip.int.val.ValidarXClientCertInterceptor] (executor-thread-77) Header x-client-cert enviado
2026-09-16T15:21:32.1651577Z 2026-09-09 17:07:01,677 INFO  [br.gov.cai.sip.int.val.ValidarXClientCertInterceptor] (executor-thread-90) Header x-client-cert enviado
2026-09-16T15:21:32.1652173Z 2026-09-09 17:07:01,677 INFO  [br.gov.cai.sip.con.SsoClientConfig] (executor-thread-90) SSO gerarToken request. path=/auth/realms/intranet/protocol/openid-connect/token, clientId=cli-ser-pge, grantType=client_credentials, secretPresent=true, secretLength=36
2026-09-16T15:21:32.1652569Z 2026-09-09 17:07:02,349 INFO  [br.gov.cai.sip.int.val.ValidarXClientCertInterceptor] (executor-thread-90) Header x-client-cert enviado
2026-09-16T15:21:32.1652941Z 2026-09-09 17:07:02,556 INFO  [br.gov.cai.sip.int.val.ValidarXClientCertInterceptor] (executor-thread-90) Header x-client-cert enviado
2026-09-16T15:21:32.1653255Z 2026-09-10 15:05:52,482 INFO  [br.gov.cai.sip.int.val.ValidarXClientCertInterceptor] (executor-thread-163) Header x-client-cert enviado
2026-09-16T15:21:32.1653664Z 2026-09-10 15:05:52,483 INFO  [br.gov.cai.sip.con.SsoClientConfig] (executor-thread-163) SSO gerarToken request. path=/auth/realms/intranet/protocol/openid-connect/token, clientId=cli-ser-pge, grantType=client_credentials, secretPresent=true, secretLength=36
2026-09-16T15:21:32.1654056Z 2026-09-10 15:12:51,305 INFO  [br.gov.cai.sip.int.val.ValidarXClientCertInterceptor] (executor-thread-167) Header x-client-cert enviado
2026-09-16T15:21:32.1654578Z 2026-09-10 15:12:51,305 INFO  [br.gov.cai.sip.con.SsoClientConfig] (executor-thread-167) SSO gerarToken request. path=/auth/realms/intranet/protocol/openid-connect/token, clientId=cli-ser-pge, grantType=client_credentials, secretPresent=true, secretLength=36
2026-09-16T15:21:32.1654998Z 2026-09-10 15:20:09,086 INFO  [br.gov.cai.sip.int.val.ValidarXClientCertInterceptor] (executor-thread-168) Header x-client-cert ausente ou em branco na chamada de recebimentoCobranca
2026-09-16T15:21:32.1655357Z 2026-09-10 18:28:56,565 INFO  [br.gov.cai.sip.int.val.ValidarXClientCertInterceptor] (executor-thread-175) Header x-client-cert enviado
2026-09-16T15:21:32.1655762Z 2026-09-10 18:28:56,566 INFO  [br.gov.cai.sip.con.SsoClientConfig] (executor-thread-175) SSO gerarToken request. path=/auth/realms/intranet/protocol/openid-connect/token, clientId=cli-ser-pge, grantType=client_credentials, secretPresent=true, secretLength=36
2026-09-16T15:21:32.1656153Z 2026-09-11 14:52:03,915 INFO  [br.gov.cai.sip.int.val.ValidarXClientCertInterceptor] (executor-thread-258) Header x-client-cert enviado
2026-09-16T15:21:32.1656554Z 2026-09-11 14:52:03,915 INFO  [br.gov.cai.sip.con.SsoClientConfig] (executor-thread-258) SSO gerarToken request. path=/auth/realms/intranet/protocol/openid-connect/token, clientId=cli-ser-pge, grantType=client_credentials, secretPresent=true, secretLength=36
2026-09-16T15:21:32.1656940Z 2026-09-11 14:52:04,978 INFO  [br.gov.cai.sip.int.val.ValidarXClientCertInterceptor] (executor-thread-258) Header x-client-cert enviado
2026-09-16T15:21:32.1657282Z 2026-09-11 14:52:05,099 INFO  [br.gov.cai.sip.ser.WebhookService] (executor-thread-258) SIPGE API retornou erro ao processar webhook. status=403, hasEntity=false
2026-09-16T15:21:32.1657591Z 2026-09-11 14:52:05,137 INFO  [br.gov.cai.sip.int.val.ValidarXClientCertInterceptor] (executor-thread-258) Header x-client-cert enviado
2026-09-16T15:21:32.1657891Z 2026-09-11 15:06:45,027 INFO  [br.gov.cai.sip.int.val.ValidarXClientCertInterceptor] (executor-thread-261) Header x-client-cert enviado
2026-09-16T15:21:32.1658297Z 2026-09-11 15:06:45,027 INFO  [br.gov.cai.sip.con.SsoClientConfig] (executor-thread-261) SSO gerarToken request. path=/auth/realms/intranet/protocol/openid-connect/token, clientId=cli-ser-pge, grantType=client_credentials, secretPresent=true, secretLength=36
2026-09-16T15:21:32.1658643Z 2026-09-11 15:06:45,439 INFO  [br.gov.cai.sip.int.val.ValidarXClientCertInterceptor] (executor-thread-261) Header x-client-cert enviado
2026-09-16T15:21:32.1658957Z 2026-09-11 15:06:45,540 INFO  [br.gov.cai.sip.ser.WebhookService] (executor-thread-261) SIPGE API retornou erro ao processar webhook. status=403, hasEntity=false
2026-09-16T15:21:32.1659257Z 2026-09-11 15:06:45,570 INFO  [br.gov.cai.sip.int.val.ValidarXClientCertInterceptor] (executor-thread-261) Header x-client-cert enviado
2026-09-16T15:21:32.1659541Z 2026-09-11 15:07:45,029 INFO  [br.gov.cai.sip.int.val.ValidarXClientCertInterceptor] (executor-thread-261) Header x-client-cert enviado
2026-09-16T15:21:32.1659835Z 2026-09-11 15:07:45,271 INFO  [br.gov.cai.sip.int.val.ValidarXClientCertInterceptor] (executor-thread-261) Header x-client-cert enviado
2026-09-16T15:21:32.1660125Z 2026-09-11 15:07:45,435 INFO  [br.gov.cai.sip.int.val.ValidarXClientCertInterceptor] (executor-thread-261) Header x-client-cert enviado
2026-09-16T15:21:32.1660417Z 2026-09-11 15:13:48,080 INFO  [br.gov.cai.sip.int.val.ValidarXClientCertInterceptor] (executor-thread-260) Header x-client-cert enviado
2026-09-16T15:21:32.1660889Z 2026-09-11 15:13:48,081 INFO  [br.gov.cai.sip.con.SsoClientConfig] (executor-thread-260) SSO gerarToken request. path=/auth/realms/intranet/protocol/openid-connect/token, clientId=cli-ser-pge, grantType=client_credentials, secretPresent=true, secretLength=36
2026-09-16T15:21:32.1661235Z 2026-09-11 15:13:48,312 INFO  [br.gov.cai.sip.int.val.ValidarXClientCertInterceptor] (executor-thread-260) Header x-client-cert enviado
2026-09-16T15:21:32.1661606Z 2026-09-11 15:13:48,501 INFO  [br.gov.cai.sip.int.val.ValidarXClientCertInterceptor] (executor-thread-260) Header x-client-cert enviado
2026-09-16T15:21:32.1661884Z 2026-09-11 15:18:38,122 INFO  [br.gov.cai.sip.int.val.ValidarXClientCertInterceptor] (executor-thread-261) Header x-client-cert enviado
2026-09-16T15:21:32.1662290Z 2026-09-11 15:18:38,122 INFO  [br.gov.cai.sip.con.SsoClientConfig] (executor-thread-261) SSO gerarToken request. path=/auth/realms/intranet/protocol/openid-connect/token, clientId=cli-ser-pge, grantType=client_credentials, secretPresent=true, secretLength=36
2026-09-16T15:21:32.1662682Z 2026-09-11 15:18:38,785 INFO  [br.gov.cai.sip.int.val.ValidarXClientCertInterceptor] (executor-thread-261) Header x-client-cert enviado
2026-09-16T15:21:32.1663045Z 2026-09-11 15:18:38,879 INFO  [br.gov.cai.sip.ser.WebhookService] (executor-thread-261) SIPGE API retornou erro ao processar webhook. status=403, hasEntity=false
2026-09-16T15:21:32.1663355Z 2026-09-11 15:18:38,915 INFO  [br.gov.cai.sip.int.val.ValidarXClientCertInterceptor] (executor-thread-261) Header x-client-cert enviado
2026-09-16T15:21:32.1747561Z ##[section]Finishing: Logs da Aplicação


secrest-chek


--- Resultados da Comparacao ---
Sucesso! O conteudo do diretorio corresponde a lista esperada.


2026-09-16 15:23:10,086 INFO Getting secrets just once, POLLING_WAIT_BETWEEN_REQUESTS_MINUTES was not configured
2026-09-16 15:23:10,086 INFO (8667ac1a-b1e2-11f1-9c56-0a58190218f6) APP VERSION: 2.1.0
2026-09-16 15:23:10,086 INFO (8667ac1a-b1e2-11f1-9c56-0a58190218f6) Starting Execution...8667ac1a-b1e2-11f1-9c56-0a58190218f6
2026-09-16 15:23:10,086 INFO (8667ac1a-b1e2-11f1-9c56-0a58190218f6) You are using: <,> as List delimiter
2026-09-16 15:23:10,086 WARNING (8667ac1a-b1e2-11f1-9c56-0a58190218f6) InsecureRequestWarning: Unverified HTTPS request is being made to host https://sicsn.caixa/BeyondTrust/api/public/v3'. Adding certificate verification isstrongly advised. See: https://urllib3.readthedocs.io/en/1.26.x/advanced-usage.html#ssl-warnings
2026-09-16 15:23:10,086 INFO (8667ac1a-b1e2-11f1-9c56-0a58190218f6) Certificate was not configured
2026-09-16 15:23:10,089 DEBUG (8667ac1a-b1e2-11f1-9c56-0a58190218f6) How long to wait for the server to connect and send data before giving up: connection timeout: 30 seconds, request timeout 30 seconds
2026-09-16 15:23:10,090 WARNING (8667ac1a-b1e2-11f1-9c56-0a58190218f6) verify_ca=false is insecure, it instructs the caller to not verify the certificate authority when making API calls.
2026-09-16 15:23:10,145 INFO (8667ac1a-b1e2-11f1-9c56-0a58190218f6) Calling sign_app_in endpoint: https://sicsn.caixa/BeyondTrust/api/public/v3
2026-09-16 15:23:10,185 DEBUG (8667ac1a-b1e2-11f1-9c56-0a58190218f6) Running get_secret method in SecretsSafe class
2026-09-16 15:23:10,185 INFO (8667ac1a-b1e2-11f1-9c56-0a58190218f6) **************** secret path: SIPGE_DES/CLISERPGE_SSO_INTRA *****************
2026-09-16 15:23:10,190 DEBUG (8667ac1a-b1e2-11f1-9c56-0a58190218f6) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SIPGE_DES&separator=%2F&version=3.1&title=CLISERPGE_SSO_INTRA
2026-09-16 15:23:10,191 DEBUG (8667ac1a-b1e2-11f1-9c56-0a58190218f6) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SIPGE_DES&separator=%2F&version=3.1&title=CLISERPGE_SSO_INTRA
2026-09-16 15:23:10,282 DEBUG (8667ac1a-b1e2-11f1-9c56-0a58190218f6) Secret type: Text
2026-09-16 15:23:10,282 INFO (8667ac1a-b1e2-11f1-9c56-0a58190218f6) Secret was successfully retrieved
2026-09-16 15:23:10,282 INFO (8667ac1a-b1e2-11f1-9c56-0a58190218f6) Secrets folder Path /usr/src/app/secrets_files
2026-09-16 15:23:10,282 INFO (8667ac1a-b1e2-11f1-9c56-0a58190218f6) Creating files with the secrets as content, number of files 2
2026-09-16 15:23:10,282 INFO (8667ac1a-b1e2-11f1-9c56-0a58190218f6) File saved succesfully: /usr/src/app/secrets_files/SIPGE_DES/CLISERPGE_SSO_INTRA_Metadata
2026-09-16 15:23:10,283 INFO (8667ac1a-b1e2-11f1-9c56-0a58190218f6) File saved succesfully: /usr/src/app/secrets_files/SIPGE_DES/CLISERPGE_SSO_INTRA
2026-09-16 15:23:10,283 DEBUG (8667ac1a-b1e2-11f1-9c56-0a58190218f6) Calling sign_app_out endpoint: https://sicsn.caixa/BeyondTrust/api/public/v3/Auth/Signout
2026-09-16 15:23:10,294 INFO (8667ac1a-b1e2-11f1-9c56-0a58190218f6) {
    "execution_id": "8667ac1a-b1e2-11f1-9c56-0a58190218f6",
    "input": {
        "secret_list": [
            "SIPGE_DES/CLISERPGE_SSO_INTRA"
        ],
        "folder_list": [],
        "managed_account_list": [],
        "secret_safe_url": "https://sicsn.caixa/BeyondTrust/api/public/v3",
        "user": {
            "UserId": 1911,
            "SID": null,
            "EmailAddress": null,
            "UserName": "SPGEDB01",
            "Name": "SPGEDB01"
        }
    },
    "output": {
        "secrets": [
            {
                "path": "SIPGE_DES/CLISERPGE_SSO_INTRA_Metadata",
                "content": "{\"Username\": null, \"Group\": null, \"FileName\": null, \"FileHash\": null, \"Text\": null, \"SecretType\": \"Text\", \"Id\": \"f551337f-bab9-4a12-1268-08dedd1badd2\", \"Title\": \"CLISERPGE_SSO_INTRA\", \"Description\": \"\", \"OwnerId\": null, \"GroupId\": null, \"FolderId\": \"f16f2cb0-aecf-4f14-8eb5-08deddfd5d20\", \"CreatedOn\": \"2026-07-09T21:46:42Z\", \"CreatedBy\": \"Lucas Santos\", \"ModifiedOn\": \"2026-09-14T12:33:32.8082359Z\", \"ModifiedBy\": \"Pedro Souza\", \"Owner\": null, \"Folder\": \"SIPGE_DES\", \"FolderPath\": \"SIPGE_DES\", \"Owners\": [{\"OwnerId\": null, \"GroupId\": null, \"UserId\": 1911, \"Owner\": null, \"Name\": \"SPGEDB01\", \"Email\": null}], \"OwnerType\": null, \"Notes\": \"\", \"Urls\": []}"
            },
            {
                "path": "SIPGE_DES/CLISERPGE_SSO_INTRA",
                "content": "***************"
            }
        ],
        "messages": [
            {
                "message": "Creating files with the secrets as content, number of files 2",
                "type": "INFO"
            }
        ],
        "errors": []
    }
}
2026-09-16 15:23:10,294 INFO (8667ac1a-b1e2-11f1-9c56-0a58190218f6) Ending Execution...8667ac1a-b1e2-11f1-9c56-0a58190218f6



o pod esta saudavel mais a release quebrou

