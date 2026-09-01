2026-09-01T23:31:35.6707880Z ##[section]Starting: Initialize job
2026-09-01T23:31:35.6709588Z Agent name: 'azp-ads-agent-release-5cd876f98-4fmdt'
2026-09-01T23:31:35.6710070Z Agent machine name: 'ads-agent-release-5cd876f98-4fmdt'
2026-09-01T23:31:35.6710241Z Current agent version: '3.236.1'
2026-09-01T23:31:35.6723306Z Agent running as: 'root'
2026-09-01T23:31:35.6730381Z Prepare release directory.
2026-09-01T23:31:35.6735291Z ReleaseId=523511, TeamProjectId=98fe0311-ffd2-418a-9d0d-507043380abd, ReleaseDefinitionName=SISPI-med-orquestrador
2026-09-01T23:31:35.6767565Z Release folder: /opt/ads-agent/_work/r926/a
2026-09-01T23:31:35.6819268Z Environment variables available are below.  Note that these environment variables can be referred to in the task (in the ReleaseDefinition) by replacing "_" with "." e.g. AGENT_NAME environment variable can be referenced using Agent.Name in the ReleaseDefinition: 
				[AGENT_ACCEPTTEEEULA] --> [True]
				[AGENT_CLOUDID] --> []
				[AGENT_DISABLELOGPLUGIN_TESTFILEPUBLISHERPLUGIN] --> [true]
				[AGENT_DISABLELOGPLUGIN_TESTRESULTLOGPLUGIN] --> [true]
				[AGENT_HOMEDIRECTORY] --> [/opt/ads-agent]
				[AGENT_ID] --> [3049]
				[AGENT_ISSELFHOSTED] --> [1]
				[AGENT_JOBNAME] --> [Agent job]
				[AGENT_MACHINENAME] --> [ads-agent-release-5cd876f98-4fmdt]
				[AGENT_NAME] --> [azp-ads-agent-release-5cd876f98-4fmdt]
				[AGENT_OS] --> [Linux]
				[AGENT_OSARCHITECTURE] --> [X64]
				[AGENT_READONLYVARIABLES] --> [true]
				[AGENT_RELEASEDIRECTORY] --> [/opt/ads-agent/_work/r926/a]
				[AGENT_RETAINDEFAULTENCODING] --> [false]
				[AGENT_ROOTDIRECTORY] --> [/opt/ads-agent/_work]
				[AGENT_SKIPCERTVALIDATION] --> [True]
				[AGENT_TASKRESTRICTIONSENFORCEMENTMODE] --> [Enabled]
				[AGENT_TEMPDIRECTORY] --> [/opt/ads-agent/_work/_temp]
				[AGENT_TOOLSDIRECTORY] --> [/opt/ads-agent/_work/_tool]
				[AGENT_USEWORKSPACEID] --> [true]
				[AGENT_VERSION] --> [3.236.1]
				[AGENT_WORKFOLDER] --> [/opt/ads-agent/_work]
				[ALOCAIP_AMBIENTE] --> [Aplicacao]
				[ALOCAIP_AMBIENTE_OCP] --> [Aplicacao]
				[ALOCAIP_AMBIENTE_OCP_LOTERIAS_PRD] --> [Cloud]
				[ALOCAIP_AMBIENTE_OCP_PRD] --> [Cloud]
				[ALOCAIP_AMBIENTE_OKD4] --> [Aplicacao]
				[ALOCAIP_AMBIENTE_OKD4_PRD_CTC] --> [Cloud]
				[ALOCAIP_AMBIENTE_OPENSHIFT_LOTERIAS_NPRD] --> [Desenvolvimento]
				[ALOCAIP_AMBIENTE_OPENSHIFT_LOTERIAS_PRD] --> [Cloud]
				[ALOCAIP_AMBIENTE_PRD_CANAIS] --> [Cloud]
				[ALOCAIP_AMBIENTE_PRD_DTC] --> [Cloud]
				[ALOCAIP_CATEGORIA] --> [Linux]
				[ALOCAIP_CATEGORIA_OKD4_PRD_CTC] --> [Linux]
				[ALOCAIP_FIM_RANGE_OCP] --> [10.116.223.250]
				[ALOCAIP_FIM_RANGE_OCP_LOTERIAS_PRD] --> [10.190.64.200]
				[ALOCAIP_FIM_RANGE_OCP_PRD] --> [10.118.121.250]
				[ALOCAIP_FIM_RANGE_OKD4] --> [10.116.215.250]
				[ALOCAIP_FIM_RANGE_OKD4_PRD_CTC] --> [10.121.103.250]
				[ALOCAIP_FIM_RANGE_OPENSHIFT_LOTERIAS_NPRD] --> [10.190.160.254]
				[ALOCAIP_FIM_RANGE_OPENSHIFT_LOTERIAS_PRD] --> [10.190.255.253]
				[ALOCAIP_FIM_RANGE_PRD_CANAIS_CTC] --> [10.118.97.255]
				[ALOCAIP_FIM_RANGE_PRD_CANAIS_CTC_OB] --> [10.118.97.254]
				[ALOCAIP_FIM_RANGE_PRD_CANAIS_DTC] --> [10.220.225.255]
				[ALOCAIP_FIM_RANGE_PRD_DTC] --> [10.221.101.250]
				[ALOCAIP_ID] --> ["C&t@d02"]
				[ALOCAIP_INICIO_RANGE_OCP] --> [10.116.223.1]
				[ALOCAIP_INICIO_RANGE_OCP_LOTERIAS_PRD] --> [10.190.64.161]
				[ALOCAIP_INICIO_RANGE_OCP_PRD] --> [10.118.121.1]
				[ALOCAIP_INICIO_RANGE_OKD4] --> [10.116.209.0]
				[ALOCAIP_INICIO_RANGE_OKD4_PRD_CTC] --> [10.121.101.1]
				[ALOCAIP_INICIO_RANGE_OPENSHIFT_LOTERIAS_NPRD] --> [10.190.160.201]
				[ALOCAIP_INICIO_RANGE_OPENSHIFT_LOTERIAS_PRD] --> [10.190.255.245]
				[ALOCAIP_INICIO_RANGE_PRD_CANAIS_CTC] --> [10.118.96.100]
				[ALOCAIP_INICIO_RANGE_PRD_CANAIS_CTC_OB] --> [10.118.97.100]
				[ALOCAIP_INICIO_RANGE_PRD_CANAIS_DTC] --> [10.220.224.100]
				[ALOCAIP_INICIO_RANGE_PRD_DTC] --> [10.221.100.100]
				[ALOCAIP_RED_NUM] --> [3022]
				[ALOCAIP_RED_NUM_OCP] --> [4995]
				[ALOCAIP_RED_NUM_OCP_LOTERIAS_PRD] --> [13616]
				[ALOCAIP_RED_NUM_OCP_PRD] --> [6053]
				[ALOCAIP_RED_NUM_OKD4] --> [4995]
				[ALOCAIP_RED_NUM_OKD4_PRD_CTC] --> [4996]
				[ALOCAIP_RED_NUM_OPENSHIFT_LOTERIAS_NPRD] --> [14583]
				[ALOCAIP_RED_NUM_OPENSHIFT_LOTERIAS_PRD] --> [14582]
				[ALOCAIP_RED_NUM_PRD] --> [4104]
				[ALOCAIP_RED_NUM_PRD_CANAIS_CTC] --> [6053]
				[ALOCAIP_RED_NUM_PRD_CANAIS_DTC] --> [6055]
				[ALOCAIP_RED_NUM_PRD_DTC] --> [5199]
				[ALOCAIP_SITE] --> [CTC]
				[ALOCAIP_SITE_DTC] --> [DTC]
				[ALOCAIP_SITE_OCP] --> [CTC]
				[ALOCAIP_SITE_OCP_LOTERIAS_PRD] --> [CTC]
				[ALOCAIP_SITE_OCP_PRD] --> [CTC]
				[ALOCAIP_SITE_OKD4] --> [CTC]
				[ALOCAIP_SITE_OKD4_PRD_CTC] --> [CTC]
				[ALOCAIP_SITE_OPENSHIFT_LOTERIAS_NPRD] --> [CTC]
				[ALOCAIP_SITE_OPENSHIFT_LOTERIAS_PRD] --> [CTC]
				[ALOCAIP_UNIDADE] --> [CEPTIBR]
				[ALOCAIP_UNIDADE_OCP] --> [CEPTI]
				[ALOCAIP_UNIDADE_OCP_LOTERIAS_PRD] --> [CETAD]
				[ALOCAIP_UNIDADE_OCP_PRD] --> [CETAD]
				[ALOCAIP_UNIDADE_OKD4] --> [CEPTI]
				[ALOCAIP_UNIDADE_OKD4_PRD_CTC] --> [CETAD]
				[ALOCAIP_UNIDADE_OPENSHIFT_LOTERIAS_NPRD] --> [CETAD]
				[ALOCAIP_UNIDADE_OPENSHIFT_LOTERIAS_PRD] --> [CETAD]
				[ALOCAIP_UNIDADE_PRD_CANAIS] --> [CETAD]
				[ALOCAIP_UNIDADE_PRD_DTC] --> [CETAD]
				[ALOCAIP_VERTICAL] --> [Desenvolvimento]
				[ALOCAIP_VERTICAL_OCP] --> [Desenvolvimento]
				[ALOCAIP_VERTICAL_OCP_LOTERIAS_PRD] --> [Cloud]
				[ALOCAIP_VERTICAL_OCP_PRD] --> [IBC]
				[ALOCAIP_VERTICAL_OKD4] --> [Desenvolvimento]
				[ALOCAIP_VERTICAL_OKD4_PRD_CTC] --> [Vertical_Nao_PCN]
				[ALOCAIP_VERTICAL_OPENSHIFT_LOTERIAS_NPRD] --> [Cloud]
				[ALOCAIP_VERTICAL_OPENSHIFT_LOTERIAS_PRD] --> [Cloud]
				[ALOCAIP_VERTICAL_PRD_CANAIS] --> [IBC]
				[ALOCAIP_VERTICAL_PRD_DTC] --> [Vertical Nao PCN]
				[AMBIENTE] --> [des]
				[AMBIENTE_BUILD] --> [build-images-ads]
				[APIALOCAIP] --> [https://api.alocaip.telecom.caixa]
				[AZURE_HTTP_USER_AGENT] --> [TFS_7b4c9d5c-b041-4798-8dcb-fb11786a173b_Release__523511_2431150_1]
				[AZUSER] --> [s736639]
				[BT_API_URL] --> [https://sicsn.caixa/BeyondTrust/api/public/v3]
				[BT_CLIENT_ID] --> [275c2d45-5b73-446b-a336-6fcf0103ecd4]
				[BT_SECRETS_LIST] --> [SISPI_DES/SISPI_KAFKA,SISPI_DES/SISPI_KAFKA_TRUSTSTORE,SISPI_DES/SISPI_USER_KEYSTORE]
				[BUILD_BUILDID] --> [812365]
				[BUILD_BUILDNUMBER] --> [20260831.1402-1.0.0-SNAPSHOT]
				[BUILD_BUILDURI] --> [vstfs:///Build/Build/812365]
				[BUILD_DEFINITIONID] --> [6809]
				[BUILD_DEFINITIONNAME] --> [SISPI-med-orquestrador]
				[BUILD_PROJECTID] --> [98fe0311-ffd2-418a-9d0d-507043380abd]
				[BUILD_PROJECTNAME] --> [Caixa]
				[BUILD_REPOSITORY_ID] --> [0e830c6f-3f8c-4b76-8202-276a3dfcc2dc]
				[BUILD_REPOSITORY_NAME] --> [SISPI-med-orquestrador]
				[BUILD_REPOSITORY_PROVIDER] --> [TfsGit]
				[BUILD_REQUESTEDFOR] --> [Gabriel Morais Marreiros]
				[BUILD_REQUESTEDFORID] --> [7528a3ca-63a4-4aca-bcda-53667397affe]
				[BUILD_SOURCEBRANCH] --> [refs/heads/develop-kafka]
				[BUILD_SOURCEBRANCHNAME] --> [develop-kafka]
				[BUILD_SOURCEVERSION] --> [1f6e88198c81225d0137b99ad8c72717e31830ed]
				[BUILD_TYPE] --> [Build]
				[CGC_UNIDADE_DES] --> [7390]
				[CGC_UNIDADE_OPS] --> [7259]
				[DIR_LOGS] --> [/opt/ads-agent/esteira-logs]
				[FORTIFY_API] --> [https://novocodigoseguro.caixa/ssc/api/v1]
				[FORTIFY_USER] --> [admin]
				[GIT_TERMINAL_PROMPT] --> [0]
				[GRAYLOG_USERNAME] --> [API_CLIENT]
				[ISTIO_INJECTION] --> [enabled]
				[KIND_DEPLOY] --> [deploymentconfig]
				[MSDEPLOY_HTTP_USER_AGENT] --> [TFS_7b4c9d5c-b041-4798-8dcb-fb11786a173b_Release__523511_2431150_1]
				[OCP_API] --> [api.pixnprd4.caixa:6443]
				[OCP_REGISTRY] --> [default-route-openshift-image-registry.apps.pixnprd4.caixa]
				[OCP_URL_SUFFIX] --> [apps.pixnprd4.caixa]
				[OCP_USER_SERVICE] --> [ads]
				[OKD_API_REGISTRY] --> [api.produtos4.caixa:6443]
				[OKD_KAFKA] --> [api.kafka-nprd.caixa:6443]
				[OKD_REGISTRY] --> [default-route-openshift-image-registry.apps.produtos4.caixa]
				[OKD_USER_SERVICE_REGISTRY] --> [ads-sa]
				[PASSWORD_TRUSTSTORE] --> [changeit]
				[PORTALIF] --> [https://infradevops-novoportal-backend-prd.apps.produtos4.caixa]
				[PROJETOBUILD] --> [build-images-ads]
				[RELEASE_ARTIFACTS__SISPI-MED-ORQUESTRADOR_BUILDID] --> [812365]
				[RELEASE_ARTIFACTS__SISPI-MED-ORQUESTRADOR_BUILDNUMBER] --> [20260831.1402-1.0.0-SNAPSHOT]
				[RELEASE_ARTIFACTS__SISPI-MED-ORQUESTRADOR_BUILDURI] --> [vstfs:///Build/Build/812365]
				[RELEASE_ARTIFACTS__SISPI-MED-ORQUESTRADOR_DEFINITIONID] --> [6809]
				[RELEASE_ARTIFACTS__SISPI-MED-ORQUESTRADOR_DEFINITIONNAME] --> [SISPI-med-orquestrador]
				[RELEASE_ARTIFACTS__SISPI-MED-ORQUESTRADOR_PROJECTID] --> [98fe0311-ffd2-418a-9d0d-507043380abd]
				[RELEASE_ARTIFACTS__SISPI-MED-ORQUESTRADOR_PROJECTNAME] --> [Caixa]
				[RELEASE_ARTIFACTS__SISPI-MED-ORQUESTRADOR_REPOSITORY_ID] --> [0e830c6f-3f8c-4b76-8202-276a3dfcc2dc]
				[RELEASE_ARTIFACTS__SISPI-MED-ORQUESTRADOR_REPOSITORY_NAME] --> [SISPI-med-orquestrador]
				[RELEASE_ARTIFACTS__SISPI-MED-ORQUESTRADOR_REPOSITORY_PROVIDER] --> [TfsGit]
				[RELEASE_ARTIFACTS__SISPI-MED-ORQUESTRADOR_REQUESTEDFOR] --> [Gabriel Morais Marreiros]
				[RELEASE_ARTIFACTS__SISPI-MED-ORQUESTRADOR_REQUESTEDFORID] --> [7528a3ca-63a4-4aca-bcda-53667397affe]
				[RELEASE_ARTIFACTS__SISPI-MED-ORQUESTRADOR_SOURCEBRANCH] --> [refs/heads/develop-kafka]
				[RELEASE_ARTIFACTS__SISPI-MED-ORQUESTRADOR_SOURCEBRANCHNAME] --> [develop-kafka]
				[RELEASE_ARTIFACTS__SISPI-MED-ORQUESTRADOR_SOURCEVERSION] --> [1f6e88198c81225d0137b99ad8c72717e31830ed]
				[RELEASE_ARTIFACTS__SISPI-MED-ORQUESTRADOR_TYPE] --> [Build]
				[RELEASE_ATTEMPTNUMBER] --> [1]
				[RELEASE_DEFINITIONENVIRONMENTID] --> [29693]
				[RELEASE_DEFINITIONID] --> [6479]
				[RELEASE_DEFINITIONNAME] --> [SISPI-med-orquestrador]
				[RELEASE_DEPLOYMENT_REQUESTEDFOR] --> [Jesse Mouta Pereira Batista]
				[RELEASE_DEPLOYMENT_REQUESTEDFOREMAIL] --> [p585600@corp.caixa.gov.br]
				[RELEASE_DEPLOYMENT_REQUESTEDFORID] --> [f384796d-04a2-4d1c-8749-e852ce923c87]
				[RELEASE_DEPLOYMENT_STARTTIME] --> [2026-09-01 23:31:27Z]
				[RELEASE_DEPLOYMENTID] --> [824174]
				[RELEASE_DEPLOYPHASEID] --> [810665]
				[RELEASE_ENVIRONMENTID] --> [2431150]
				[RELEASE_ENVIRONMENTNAME] --> [EC DES]
				[RELEASE_ENVIRONMENTS_EC_DES_STATUS] --> [InProgress]
				[RELEASE_ENVIRONMENTS_EC_HMP_STATUS] --> [NotStarted]
				[RELEASE_ENVIRONMENTS_EC_PRD_STATUS] --> [NotStarted]
				[RELEASE_ENVIRONMENTS_EC_TQS_STATUS] --> [NotStarted]
				[RELEASE_ENVIRONMENTURI] --> [vstfs:///ReleaseManagement/Environment/2431150]
				[RELEASE_PRIMARYARTIFACTSOURCEALIAS] --> [_SISPI-med-orquestrador]
				[RELEASE_REASON] --> [Manual]
				[RELEASE_RELEASEDESCRIPTION] --> []
				[RELEASE_RELEASEID] --> [523511]
				[RELEASE_RELEASENAME] --> [SISPI-med-orquestrador-20260831.1402-1.0.0-SNAPSHOT(16)]
				[RELEASE_RELEASEURI] --> [vstfs:///ReleaseManagement/Release/523511]
				[RELEASE_RELEASEWEBURL] --> [https://devops.caixa/projetos/98fe0311-ffd2-418a-9d0d-507043380abd/_release?releaseId=523511&_a=release-summary]
				[RELEASE_REQUESTEDFOR] --> [Jesse Mouta Pereira Batista]
				[RELEASE_REQUESTEDFOREMAIL] --> [p585600@corp.caixa.gov.br]
				[RELEASE_REQUESTEDFORID] --> [f384796d-04a2-4d1c-8749-e852ce923c87]
				[RELEASE_SKIPARTIFACTSDOWNLOAD] --> [False]
				[RELEASE_TRIGGERINGARTIFACT_ALIAS] --> []
				[REPOSITORY_LOGS] --> [https://devops.caixa/projetos/Infraestrutura/_git/esteira-logs]
				[REQUESTEDFORID] --> [f384796d-04a2-4d1c-8749-e852ce923c87]
				[SISTEMAAMBIENTE] --> [des]
				[SISTEMANOME] --> [sispi-med-orquestrador]
				[SITE] --> [ocp_nprd]
				[SONAR_URL] --> [http://sonar.produtos.caixa]
				[SYSTEM] --> [release]
				[SYSTEM_ARTIFACTSDIRECTORY] --> [/opt/ads-agent/_work/r926/a]
				[SYSTEM_COLLECTIONID] --> [7b4c9d5c-b041-4798-8dcb-fb11786a173b]
				[SYSTEM_COLLECTIONURI] --> [https://devops.caixa/projetos/]
				[SYSTEM_CULTURE] --> [en-US]
				[SYSTEM_DEBUG] --> [true]
				[SYSTEM_DEFAULTWORKINGDIRECTORY] --> [/opt/ads-agent/_work/r926/a]
				[SYSTEM_DEFINITIONID] --> [6479]
				[SYSTEM_DEFINITIONNAME] --> [SISPI-med-orquestrador]
				[SYSTEM_ENABLEACCESSTOKEN] --> [False]
				[SYSTEM_HOSTTYPE] --> [release]
				[SYSTEM_ISAZUREVM] --> [0]
				[SYSTEM_ISDOCKERCONTAINER] --> [0]
				[SYSTEM_ISSCHEDULED] --> [False]
				[SYSTEM_JOBATTEMPT] --> [1]
				[SYSTEM_JOBDISPLAYNAME] --> [Agent job]
				[SYSTEM_JOBID] --> [581fb220-dca5-5563-e177-8bdf4933c930]
				[SYSTEM_JOBIDENTIFIER] --> [Stage_98fe0311ffd2418a9d0d507043380abd_29693_1.Phase_1.__default]
				[SYSTEM_JOBNAME] --> [__default]
				[SYSTEM_JOBPARALLELISMTAG] --> [Private]
				[SYSTEM_JOBPOSITIONINPHASE] --> [1]
				[SYSTEM_JOBTIMEOUT] --> [0]
				[SYSTEM_PHASEATTEMPT] --> [1]
				[SYSTEM_PHASEDISPLAYNAME] --> [Agent job]
				[SYSTEM_PHASEID] --> [69cb8de5-4505-5708-6b48-bb3d486760af]
				[SYSTEM_PHASENAME] --> [Phase_1]
				[SYSTEM_PIPELINESTARTTIME] --> [2026-09-01 20:31:33-03:00]
				[SYSTEM_PLANID] --> [9db497b2-4f45-432a-a109-1058af440829]
				[SYSTEM_SERVERTYPE] --> [OnPremises]
				[SYSTEM_STAGEATTEMPT] --> [1]
				[SYSTEM_STAGEDISPLAYNAME] --> [EC DES]
				[SYSTEM_STAGEID] --> [4d38d38a-e2b9-58bb-e48b-c0eec28b5fe1]
				[SYSTEM_STAGENAME] --> [Stage_98fe0311ffd2418a9d0d507043380abd_29693_1]
				[SYSTEM_TASKDEFINITIONSURI] --> [https://devops.caixa/projetos/]
				[SYSTEM_TEAMFOUNDATIONCOLLECTIONURI] --> [https://devops.caixa/projetos/]
				[SYSTEM_TEAMFOUNDATIONSERVERURI] --> [https://devops.caixa/projetos/]
				[SYSTEM_TEAMPROJECT] --> [Caixa]
				[SYSTEM_TEAMPROJECTID] --> [98fe0311-ffd2-418a-9d0d-507043380abd]
				[SYSTEM_TIMELINEID] --> [9db497b2-4f45-432a-a109-1058af440829]
				[SYSTEM_TOTALJOBSINPHASE] --> [1]
				[SYSTEM_WORKFOLDER] --> [/opt/ads-agent/_work]
				[TEMPLATERELEASE_OKD] --> [openshift/quarkus-caixa-release]
				[TIMEOUT_DEPLOY] --> [300]
				[URL_CRQ] --> [https://infradevops-novoportal-backend-prd.apps.produtos4.caixa/api.php?acao=devopsCaixacriarMudancaPadrao]
				[USER_CGC] --> [USR_***]
				[_ENV_AZURE_SERVICEBUS_QUEUE_ENDPOINT] --> [sb://servicebus-eds-nprd.servicebus.windows.net/]
				[_ENV_AZURE_SERVICEBUS_QUEUE_NAME] --> ["sigcn-med-atualizacaorelatosinfracao-status"]
				[_ENV_AZURE_SERVICEBUS_QUEUE_SHAREDACCESSKEY] --> [=]
				[_ENV_AZURE_SERVICEBUS_QUEUE_SHAREDACCESSKEYNAME] --> [RootManageSharedAccessKey]
				[_ENV_JAVA_OPTIONS_APPEND] --> ["-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks"]
				[_ENV_KAFKA_BOOTSTRAP_PORT] --> [443]
				[_ENV_KAFKA_BOOTSTRAP_SERVER] --> ["development-kafka-bootstrap-cp4i.apps.pixnprd4.caixa"]
				[_ENV_KAFKA_PASS] --> ['${SISPI_KAFKA}']
				[_ENV_KAFKA_USER] --> [ dev]
				[_ENV_KEY_STORE_KAFKA_CLIENT_LOCATION] --> [/deployments/sispi_user_keystore_kafka_des.p12]
				[_ENV_KEY_STORE_KAFKA_CLIENT_PASSWORD] --> ['${SISPI_USER_KEYSTORE}']
				[_ENV_MQ_ANTIFRAUDE_CHANNEL] --> [SISPI.SVRCONN]
				[_ENV_MQ_ANTIFRAUDE_FILA_NOTIFICACAO_INFRACAO] --> [SIAAF.REQ.SISPI.PIX_NOTIFICACAO_INFRACAO]
				[_ENV_MQ_ANTIFRAUDE_MAXIMO_CONEXOES] --> [1]
				[_ENV_MQ_ANTIFRAUDE_MAXIMO_SESSOES] --> [300]
				[_ENV_MQ_ANTIFRAUDE_PASSWORD] --> [jh73wpqb]
				[_ENV_MQ_ANTIFRAUDE_PORT] --> [1414]
				[_ENV_MQ_ANTIFRAUDE_QUEUE_MANAGER] --> [XMQD1]
				[_ENV_MQ_ANTIFRAUDE_TIMEOUT] --> [1000]
				[_ENV_MQ_ANTIFRAUDE_USERID] --> [SSPIBD01]
				[_ENV_MQ_CONTROLE_TEMPO_CHANNEL] --> [SISPI.SVRCONN]
				[_ENV_MQ_CONTROLE_TEMPO_FILA_REGISTRO_ANS] --> [SISPI.REQ.REGISTRO_ANS]
				[_ENV_MQ_CONTROLE_TEMPO_HOSTNAME] --> [10.116.95.99]
				[_ENV_MQ_CONTROLE_TEMPO_MAXIMO_CONEXOES] --> [1]
				[_ENV_MQ_CONTROLE_TEMPO_MAXIMO_SESSOES] --> [300]
				[_ENV_MQ_CONTROLE_TEMPO_PASSWORD] --> [jh73wpqb]
				[_ENV_MQ_CONTROLE_TEMPO_PORT] --> [1414]
				[_ENV_MQ_CONTROLE_TEMPO_QUEUE_MANAGER] --> [XMQD1]
				[_ENV_MQ_CONTROLE_TEMPO_TIMEOUT] --> [1000]
				[_ENV_MQ_CONTROLE_TEMPO_USERID] --> [SSPIBD01]
				[_ENV_MQ_ANTIFRAUDE_HOSTNAME] --> [10.116.95.99]
				[_ENV_PIX_FRAMEWORK_TOKEN_CLIENT_ID] --> [cli-ser-spi]
				[_ENV_PIX_FRAMEWORK_TOKEN_SECRET_ID] --> [1938b188-42c7-4889-bf3a-7d95e4432fe9]
				[_ENV_PIX_FRAMEWORK_TOKEN_URL] --> [https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token]
				[_ENV_PIX_FRAMEWORK_VALIDACAO_TOKEN_SSO_EMISSOR] --> ["https://login.des.caixa/auth/realms/intranet"]
				[_ENV_PIX_FRAMEWORK_VALIDACAO_TOKEN_SSO_URL] --> ["https://sispi-api-proxy-sso-des.apps.pixnprd4.caixa/auth/realms/intranet;https://login.des.caixa/auth/realms/intranet"]
				[_ENV_PIX_FRAMEWORK_VALIDACAO_TOKEN_VALIDACAO_GLOBAL] --> [true]
				[_ENV_QUARKUS_DATASOURCE_JDBC_URL] --> ["jdbc:oracle:thin:@cnpexdadvm01-scan4.extra.caixa.gov.br:1521/CDBD08NGPDB017"]
				[_ENV_QUARKUS_DATASOURCE_PASSWORD] --> [sspibd0303]
				[_ENV_QUARKUS_DATASOURCE_USERNAME] --> [SSPIBD03]
				[_ENV_SIMPI_MED_URL] --> [https://simpi-med-des.apps.pixnprd4.caixa]
				[_ENV_SISPI_API_KEY] --> [l76138e827bd9d4f87aea4ff7f54a5607c]
				[_ENV_SISPI_API_MANAGER] --> [https://api.des.caixa:8443]
				[_ENV_SISPI_ISPB_CAIXA] --> [00360305]
				[_ENV_SISPI_LOGIN_CAIXA_INTRANET_URL] --> ["https://login.des.caixa/auth/realms/intranet"]
				[_ENV_TOPICO_MED_POLLING] --> [PIX.MED.POLLING.EVENTO]
				[_ENV_TRUST_STORE_KAFKA_LOCATION] --> [/deployments/keystore_event_streams.p12]
				[_ENV_TRUST_STORE_KAFKA_PASSWORD] --> ['${SISPI_KAFKA_TRUSTSTORE}']
				[_SECRET_SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS] --> [#{VAULT_LOCATION}#]
2026-09-01T23:31:35.8699884Z Download all required tasks.
2026-09-01T23:31:35.8803774Z ##[debug]Task 'DownloadSecureFile' already downloaded at '/opt/ads-agent/_work/_tasks/DownloadSecureFile_2a6ca863-f2ce-4f4d-8bcb-15e64608ec4b/1.220.0'.
2026-09-01T23:31:35.8805282Z ##[debug]Task 'Bash' already downloaded at '/opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0'.
2026-09-01T23:31:35.8806319Z ##[debug]Task 'PythonScript' already downloaded at '/opt/ads-agent/_work/_tasks/PythonScript_6392f95f-7e76-4a18-b3c7-7f078d2f7700/0.213.0'.
2026-09-01T23:31:35.8807387Z ##[debug]Task 'replacetokens' already downloaded at '/opt/ads-agent/_work/_tasks/replacetokens_a8515ec8-7254-4ffd-912c-86772e2b5962/3.3.1'.
2026-09-01T23:31:35.9392588Z ##[debug]Task 'Download secure file' has following condition: 'succeeded()'.
2026-09-01T23:31:35.9420822Z ##[debug]Parsing expression: <succeeded()>
2026-09-01T23:31:35.9448215Z ##[debug]succeeded
2026-09-01T23:31:35.9451038Z ##[debug](
2026-09-01T23:31:35.9454177Z ##[debug])
2026-09-01T23:31:35.9483846Z ##[debug]Task 'Exportando as variáveis do arquivo Trust Store' has following condition: 'succeeded()'.
2026-09-01T23:31:35.9484972Z ##[debug]Parsing expression: <succeeded()>
2026-09-01T23:31:35.9485193Z ##[debug]succeeded
2026-09-01T23:31:35.9485294Z ##[debug](
2026-09-01T23:31:35.9485493Z ##[debug])
2026-09-01T23:31:35.9506687Z ##[debug]Task 'Download secure file' has following condition: 'succeeded()'.
2026-09-01T23:31:35.9507169Z ##[debug]Parsing expression: <succeeded()>
2026-09-01T23:31:35.9507349Z ##[debug]succeeded
2026-09-01T23:31:35.9507482Z ##[debug](
2026-09-01T23:31:35.9507625Z ##[debug])
2026-09-01T23:31:35.9527171Z ##[debug]Task 'Download secure file' has following condition: 'succeeded()'.
2026-09-01T23:31:35.9527860Z ##[debug]Parsing expression: <succeeded()>
2026-09-01T23:31:35.9528040Z ##[debug]succeeded
2026-09-01T23:31:35.9528138Z ##[debug](
2026-09-01T23:31:35.9528286Z ##[debug])
2026-09-01T23:31:35.9547434Z ##[debug]Task 'Recuperando nome do repositório' has following condition: 'succeeded()'.
2026-09-01T23:31:35.9547992Z ##[debug]Parsing expression: <succeeded()>
2026-09-01T23:31:35.9548178Z ##[debug]succeeded
2026-09-01T23:31:35.9548306Z ##[debug](
2026-09-01T23:31:35.9548472Z ##[debug])
2026-09-01T23:31:35.9568360Z ##[debug]Task 'Convertendo Minúsculo e Definindo nome do Projeto/Repositório' has following condition: 'succeeded()'.
2026-09-01T23:31:35.9568828Z ##[debug]Parsing expression: <succeeded()>
2026-09-01T23:31:35.9569159Z ##[debug]succeeded
2026-09-01T23:31:35.9569317Z ##[debug](
2026-09-01T23:31:35.9569462Z ##[debug])
2026-09-01T23:31:35.9588791Z ##[debug]Task 'Git clone https://devops.caixa/projetos/Infraestrutura/_git/esteira-logs' has following condition: 'succeeded()'.
2026-09-01T23:31:35.9589327Z ##[debug]Parsing expression: <succeeded()>
2026-09-01T23:31:35.9589545Z ##[debug]succeeded
2026-09-01T23:31:35.9589676Z ##[debug](
2026-09-01T23:31:35.9589821Z ##[debug])
2026-09-01T23:31:35.9608998Z ##[debug]Task 'Cria Streams Graylog' has following condition: 'succeeded()'.
2026-09-01T23:31:35.9609515Z ##[debug]Parsing expression: <succeeded()>
2026-09-01T23:31:35.9609700Z ##[debug]succeeded
2026-09-01T23:31:35.9609833Z ##[debug](
2026-09-01T23:31:35.9609972Z ##[debug])
2026-09-01T23:31:35.9629971Z ##[debug]Task 'Recupera VEC' has following condition: 'succeeded()'.
2026-09-01T23:31:35.9630487Z ##[debug]Parsing expression: <succeeded()>
2026-09-01T23:31:35.9630688Z ##[debug]succeeded
2026-09-01T23:31:35.9630827Z ##[debug](
2026-09-01T23:31:35.9630982Z ##[debug])
2026-09-01T23:31:35.9650773Z ##[debug]Task 'VEC - Aferição' has following condition: 'succeeded()'.
2026-09-01T23:31:35.9651212Z ##[debug]Parsing expression: <succeeded()>
2026-09-01T23:31:35.9651388Z ##[debug]succeeded
2026-09-01T23:31:35.9651539Z ##[debug](
2026-09-01T23:31:35.9651678Z ##[debug])
2026-09-01T23:31:35.9671565Z ##[debug]Task 'Login OpenShift' has following condition: 'succeeded()'.
2026-09-01T23:31:35.9671976Z ##[debug]Parsing expression: <succeeded()>
2026-09-01T23:31:35.9672155Z ##[debug]succeeded
2026-09-01T23:31:35.9672299Z ##[debug](
2026-09-01T23:31:35.9672438Z ##[debug])
2026-09-01T23:31:35.9691939Z ##[debug]Task 'Exportando Variáveis de Ambiente "_ENV."' has following condition: 'succeeded()'.
2026-09-01T23:31:35.9692353Z ##[debug]Parsing expression: <succeeded()>
2026-09-01T23:31:35.9692530Z ##[debug]succeeded
2026-09-01T23:31:35.9692664Z ##[debug](
2026-09-01T23:31:35.9692879Z ##[debug])
2026-09-01T23:31:35.9712476Z ##[debug]Task 'Criando novo Projeto' has following condition: 'succeeded()'.
2026-09-01T23:31:35.9712875Z ##[debug]Parsing expression: <succeeded()>
2026-09-01T23:31:35.9713079Z ##[debug]succeeded
2026-09-01T23:31:35.9713210Z ##[debug](
2026-09-01T23:31:35.9713349Z ##[debug])
2026-09-01T23:31:35.9733105Z ##[debug]Task 'Adicionando ISTIO_INJECTION' has following condition: 'and(succeeded(), eq(variables['ISTIO_INJECTION'], 'enabled'))'.
2026-09-01T23:31:35.9733687Z ##[debug]Parsing expression: <and(succeeded(), eq(variables['ISTIO_INJECTION'], 'enabled'))>
2026-09-01T23:31:35.9733889Z ##[debug]and
2026-09-01T23:31:35.9734087Z ##[debug](
2026-09-01T23:31:35.9735298Z ##[debug]..succeeded
2026-09-01T23:31:35.9735465Z ##[debug](
2026-09-01T23:31:35.9736315Z ##[debug]..)
2026-09-01T23:31:35.9736471Z ##[debug]..,
2026-09-01T23:31:35.9737897Z ##[debug]..eq
2026-09-01T23:31:35.9738040Z ##[debug](
2026-09-01T23:31:35.9738447Z ##[debug]....variables
2026-09-01T23:31:35.9741594Z ##[debug]....[
2026-09-01T23:31:35.9752023Z ##[debug]......'ISTIO_INJECTION'
2026-09-01T23:31:35.9760551Z ##[debug]....]
2026-09-01T23:31:35.9761812Z ##[debug]....,
2026-09-01T23:31:35.9762114Z ##[debug]....'enabled'
2026-09-01T23:31:35.9762276Z ##[debug]..)
2026-09-01T23:31:35.9762470Z ##[debug])
2026-09-01T23:31:35.9782469Z ##[debug]Task 'Criando nova APP' has following condition: 'succeeded()'.
2026-09-01T23:31:35.9783043Z ##[debug]Parsing expression: <succeeded()>
2026-09-01T23:31:35.9783229Z ##[debug]succeeded
2026-09-01T23:31:35.9783364Z ##[debug](
2026-09-01T23:31:35.9783524Z ##[debug])
2026-09-01T23:31:35.9803177Z ##[debug]Task 'Atualizando Variáveis de Ambiente' has following condition: 'succeeded()'.
2026-09-01T23:31:35.9803696Z ##[debug]Parsing expression: <succeeded()>
2026-09-01T23:31:35.9803874Z ##[debug]succeeded
2026-09-01T23:31:35.9804020Z ##[debug](
2026-09-01T23:31:35.9804127Z ##[debug])
2026-09-01T23:31:35.9823345Z ##[debug]Task 'Criando Rota Customizada' has following condition: 'succeeded()'.
2026-09-01T23:31:35.9823765Z ##[debug]Parsing expression: <succeeded()>
2026-09-01T23:31:35.9824071Z ##[debug]succeeded
2026-09-01T23:31:35.9824217Z ##[debug](
2026-09-01T23:31:35.9824360Z ##[debug])
2026-09-01T23:31:35.9843697Z ##[debug]Task 'Aplicando Service Mesh' has following condition: 'and(succeeded(), eq(variables['ISTIO_INJECTION'], 'enabled'))'.
2026-09-01T23:31:35.9844213Z ##[debug]Parsing expression: <and(succeeded(), eq(variables['ISTIO_INJECTION'], 'enabled'))>
2026-09-01T23:31:35.9844419Z ##[debug]and
2026-09-01T23:31:35.9844550Z ##[debug](
2026-09-01T23:31:35.9844756Z ##[debug]..succeeded
2026-09-01T23:31:35.9845048Z ##[debug](
2026-09-01T23:31:35.9845195Z ##[debug]..)
2026-09-01T23:31:35.9845334Z ##[debug]..,
2026-09-01T23:31:35.9845479Z ##[debug]..eq
2026-09-01T23:31:35.9845603Z ##[debug](
2026-09-01T23:31:35.9845731Z ##[debug]....variables
2026-09-01T23:31:35.9845997Z ##[debug]....[
2026-09-01T23:31:35.9846198Z ##[debug]......'ISTIO_INJECTION'
2026-09-01T23:31:35.9846395Z ##[debug]....]
2026-09-01T23:31:35.9846537Z ##[debug]....,
2026-09-01T23:31:35.9846697Z ##[debug]....'enabled'
2026-09-01T23:31:35.9846910Z ##[debug]..)
2026-09-01T23:31:35.9847053Z ##[debug])
2026-09-01T23:31:35.9866451Z ##[debug]Task 'Git clone https://devops.caixa/projetos/Infraestrutura/_git/esteira-beyondtrust-check' has following condition: 'succeeded()'.
2026-09-01T23:31:35.9866998Z ##[debug]Parsing expression: <succeeded()>
2026-09-01T23:31:35.9867177Z ##[debug]succeeded
2026-09-01T23:31:35.9867309Z ##[debug](
2026-09-01T23:31:35.9867453Z ##[debug])
2026-09-01T23:31:35.9887639Z ##[debug]Task 'Create BT Secret' has following condition: 'succeeded()'.
2026-09-01T23:31:35.9888175Z ##[debug]Parsing expression: <succeeded()>
2026-09-01T23:31:35.9888361Z ##[debug]succeeded
2026-09-01T23:31:35.9888490Z ##[debug](
2026-09-01T23:31:35.9888637Z ##[debug])
2026-09-01T23:31:35.9908055Z ##[debug]Task 'Create BT Shared Volume' has following condition: 'succeeded()'.
2026-09-01T23:31:35.9908506Z ##[debug]Parsing expression: <succeeded()>
2026-09-01T23:31:35.9908692Z ##[debug]succeeded
2026-09-01T23:31:35.9908826Z ##[debug](
2026-09-01T23:31:35.9908988Z ##[debug])
2026-09-01T23:31:35.9927980Z ##[debug]Task 'Create BT Sidecar' has following condition: 'succeeded()'.
2026-09-01T23:31:35.9928387Z ##[debug]Parsing expression: <succeeded()>
2026-09-01T23:31:35.9928559Z ##[debug]succeeded
2026-09-01T23:31:35.9928711Z ##[debug](
2026-09-01T23:31:35.9928850Z ##[debug])
2026-09-01T23:31:35.9948202Z ##[debug]Task 'Create Secret Check Script' has following condition: 'succeeded()'.
2026-09-01T23:31:35.9948616Z ##[debug]Parsing expression: <succeeded()>
2026-09-01T23:31:35.9948815Z ##[debug]succeeded
2026-09-01T23:31:35.9948944Z ##[debug](
2026-09-01T23:31:35.9949084Z ##[debug])
2026-09-01T23:31:35.9968018Z ##[debug]Task 'Create Secret Check' has following condition: 'succeeded()'.
2026-09-01T23:31:35.9968418Z ##[debug]Parsing expression: <succeeded()>
2026-09-01T23:31:35.9968589Z ##[debug]succeeded
2026-09-01T23:31:35.9968722Z ##[debug](
2026-09-01T23:31:35.9968861Z ##[debug])
2026-09-01T23:31:35.9987984Z ##[debug]Task 'Create BT App Mount Volume' has following condition: 'succeeded()'.
2026-09-01T23:31:35.9988425Z ##[debug]Parsing expression: <succeeded()>
2026-09-01T23:31:35.9988597Z ##[debug]succeeded
2026-09-01T23:31:35.9988691Z ##[debug](
2026-09-01T23:31:35.9988829Z ##[debug])
2026-09-01T23:31:36.0008074Z ##[debug]Task 'Exporta Variáveis de Ambiente "_SECRET."' has following condition: 'succeeded()'.
2026-09-01T23:31:36.0008742Z ##[debug]Parsing expression: <succeeded()>
2026-09-01T23:31:36.0008920Z ##[debug]succeeded
2026-09-01T23:31:36.0009053Z ##[debug](
2026-09-01T23:31:36.0009203Z ##[debug])
2026-09-01T23:31:36.0028157Z ##[debug]Task 'Alterando valores placeholder no exec_secret.sh' has following condition: 'succeeded()'.
2026-09-01T23:31:36.0028774Z ##[debug]Parsing expression: <succeeded()>
2026-09-01T23:31:36.0028991Z ##[debug]succeeded
2026-09-01T23:31:36.0029170Z ##[debug](
2026-09-01T23:31:36.0029360Z ##[debug])
2026-09-01T23:31:36.0049931Z ##[debug]Task 'Criando Secrets' has following condition: 'succeeded()'.
2026-09-01T23:31:36.0050693Z ##[debug]Parsing expression: <succeeded()>
2026-09-01T23:31:36.0050905Z ##[debug]succeeded
2026-09-01T23:31:36.0051045Z ##[debug](
2026-09-01T23:31:36.0051261Z ##[debug])
2026-09-01T23:31:36.0071857Z ##[debug]Task 'Vinculando Secrets' has following condition: 'succeeded()'.
2026-09-01T23:31:36.0072425Z ##[debug]Parsing expression: <succeeded()>
2026-09-01T23:31:36.0072602Z ##[debug]succeeded
2026-09-01T23:31:36.0072754Z ##[debug](
2026-09-01T23:31:36.0072891Z ##[debug])
2026-09-01T23:31:36.0094131Z ##[debug]Task 'Adicionando Multiplas Secrets' has following condition: 'succeeded()'.
2026-09-01T23:31:36.0094766Z ##[debug]Parsing expression: <succeeded()>
2026-09-01T23:31:36.0094964Z ##[debug]succeeded
2026-09-01T23:31:36.0095102Z ##[debug](
2026-09-01T23:31:36.0095278Z ##[debug])
2026-09-01T23:31:36.0119533Z ##[debug]Task 'Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP' has following condition: 'succeeded()'.
2026-09-01T23:31:36.0120218Z ##[debug]Parsing expression: <succeeded()>
2026-09-01T23:31:36.0120549Z ##[debug]succeeded
2026-09-01T23:31:36.0120739Z ##[debug](
2026-09-01T23:31:36.0120922Z ##[debug])
2026-09-01T23:31:36.0141486Z ##[debug]Task 'Concedendo Acesso OKD' has following condition: 'succeeded()'.
2026-09-01T23:31:36.0142005Z ##[debug]Parsing expression: <succeeded()>
2026-09-01T23:31:36.0142184Z ##[debug]succeeded
2026-09-01T23:31:36.0142314Z ##[debug](
2026-09-01T23:31:36.0142420Z ##[debug])
2026-09-01T23:31:36.0162659Z ##[debug]Task 'Verificando IP de Saída ' has following condition: 'succeeded()'.
2026-09-01T23:31:36.0163116Z ##[debug]Parsing expression: <succeeded()>
2026-09-01T23:31:36.0163298Z ##[debug]succeeded
2026-09-01T23:31:36.0163430Z ##[debug](
2026-09-01T23:31:36.0163570Z ##[debug])
2026-09-01T23:31:36.0183991Z ##[debug]Task 'Configurando IP de Saída - deployment' has following condition: 'and(eq(variables['kind'], 'deployment'), succeeded())'.
2026-09-01T23:31:36.0184528Z ##[debug]Parsing expression: <and(eq(variables['kind'], 'deployment'), succeeded())>
2026-09-01T23:31:36.0184750Z ##[debug]and
2026-09-01T23:31:36.0184880Z ##[debug](
2026-09-01T23:31:36.0185052Z ##[debug]..eq
2026-09-01T23:31:36.0185199Z ##[debug](
2026-09-01T23:31:36.0185409Z ##[debug]....variables
2026-09-01T23:31:36.0185582Z ##[debug]....[
2026-09-01T23:31:36.0185754Z ##[debug]......'kind'
2026-09-01T23:31:36.0185988Z ##[debug]....]
2026-09-01T23:31:36.0186188Z ##[debug]....,
2026-09-01T23:31:36.0186429Z ##[debug]....'deployment'
2026-09-01T23:31:36.0186542Z ##[debug]..)
2026-09-01T23:31:36.0186676Z ##[debug]..,
2026-09-01T23:31:36.0186879Z ##[debug]..succeeded
2026-09-01T23:31:36.0187012Z ##[debug](
2026-09-01T23:31:36.0187143Z ##[debug]..)
2026-09-01T23:31:36.0187329Z ##[debug])
2026-09-01T23:31:36.0208313Z ##[debug]Task 'Configurando IP de Saída - deploymentconfig' has following condition: 'and(eq(variables['kind'], 'deploymentconfig'), succeeded())'.
2026-09-01T23:31:36.0208908Z ##[debug]Parsing expression: <and(eq(variables['kind'], 'deploymentconfig'), succeeded())>
2026-09-01T23:31:36.0209117Z ##[debug]and
2026-09-01T23:31:36.0209266Z ##[debug](
2026-09-01T23:31:36.0209421Z ##[debug]..eq
2026-09-01T23:31:36.0209555Z ##[debug](
2026-09-01T23:31:36.0209749Z ##[debug]....variables
2026-09-01T23:31:36.0209919Z ##[debug]....[
2026-09-01T23:31:36.0210087Z ##[debug]......'kind'
2026-09-01T23:31:36.0210271Z ##[debug]....]
2026-09-01T23:31:36.0210402Z ##[debug]....,
2026-09-01T23:31:36.0210634Z ##[debug]....'deploymentconfig'
2026-09-01T23:31:36.0210801Z ##[debug]..)
2026-09-01T23:31:36.0210900Z ##[debug]..,
2026-09-01T23:31:36.0211095Z ##[debug]..succeeded
2026-09-01T23:31:36.0211286Z ##[debug](
2026-09-01T23:31:36.0211457Z ##[debug]..)
2026-09-01T23:31:36.0211588Z ##[debug])
2026-09-01T23:31:36.0232597Z ##[debug]Task 'Cadastrando no Portal IIF' has following condition: 'succeeded()'.
2026-09-01T23:31:36.0233218Z ##[debug]Parsing expression: <succeeded()>
2026-09-01T23:31:36.0233364Z ##[debug]succeeded
2026-09-01T23:31:36.0233498Z ##[debug](
2026-09-01T23:31:36.0233811Z ##[debug])
2026-09-01T23:31:36.0253774Z ##[debug]Task 'Verificando Status do Deployment' has following condition: 'succeeded()'.
2026-09-01T23:31:36.0254253Z ##[debug]Parsing expression: <succeeded()>
2026-09-01T23:31:36.0254431Z ##[debug]succeeded
2026-09-01T23:31:36.0254563Z ##[debug](
2026-09-01T23:31:36.0254700Z ##[debug])
2026-09-01T23:31:36.0273659Z ##[debug]Task 'Logs da Aplicação' has following condition: 'always()'.
2026-09-01T23:31:36.0274037Z ##[debug]Parsing expression: <always()>
2026-09-01T23:31:36.0274206Z ##[debug]always
2026-09-01T23:31:36.0274435Z ##[debug](
2026-09-01T23:31:36.0276432Z ##[debug])
2026-09-01T23:31:36.0295823Z ##[debug]Task 'Resumo da Release' has following condition: 'succeeded()'.
2026-09-01T23:31:36.0296229Z ##[debug]Parsing expression: <succeeded()>
2026-09-01T23:31:36.0296475Z ##[debug]succeeded
2026-09-01T23:31:36.0296607Z ##[debug](
2026-09-01T23:31:36.0296744Z ##[debug])
2026-09-01T23:31:36.0316782Z ##[debug]Task 'Coletando dados da imagem' has following condition: 'succeeded()'.
2026-09-01T23:31:36.0317243Z ##[debug]Parsing expression: <succeeded()>
2026-09-01T23:31:36.0317384Z ##[debug]succeeded
2026-09-01T23:31:36.0317518Z ##[debug](
2026-09-01T23:31:36.0317659Z ##[debug])
2026-09-01T23:31:36.0336921Z ##[debug]Task 'Atualizando versão no PortalIF' has following condition: 'succeeded()'.
2026-09-01T23:31:36.0337346Z ##[debug]Parsing expression: <succeeded()>
2026-09-01T23:31:36.0337517Z ##[debug]succeeded
2026-09-01T23:31:36.0337666Z ##[debug](
2026-09-01T23:31:36.0337767Z ##[debug])
2026-09-01T23:31:36.0356803Z ##[debug]Task 'Realizando Logout OKD' has following condition: 'always()'.
2026-09-01T23:31:36.0357172Z ##[debug]Parsing expression: <always()>
2026-09-01T23:31:36.0357361Z ##[debug]always
2026-09-01T23:31:36.0357489Z ##[debug](
2026-09-01T23:31:36.0357642Z ##[debug])
2026-09-01T23:31:36.0376903Z Checking job knob settings.
2026-09-01T23:31:36.0391188Z Finished checking job knob settings.
2026-09-01T23:31:36.0705366Z ##[debug]Log plugin 'TestResultLogPlugin' is disabled.
2026-09-01T23:31:36.0705749Z ##[debug]Log plugin 'TestFilePublisherPlugin' is disabled.
2026-09-01T23:31:36.0706200Z Start tracking orphan processes.
2026-09-01T23:31:36.0749931Z ##[section]Finishing: Initialize job



2026-09-01T23:31:36.0924441Z ##[debug]Evaluating condition for step: 'Download secure file'
2026-09-01T23:31:36.0962670Z ##[debug]Evaluating: succeeded()
2026-09-01T23:31:36.0967051Z ##[debug]Evaluating succeeded:
2026-09-01T23:31:36.0988628Z ##[debug]=> True
2026-09-01T23:31:36.0995764Z ##[debug]Result: True
2026-09-01T23:31:36.1048725Z ##[section]Starting: Download secure file
2026-09-01T23:31:36.1194899Z ==============================================================================
2026-09-01T23:31:36.1195289Z Task         : Download secure file
2026-09-01T23:31:36.1195556Z Description  : Download a secure file to the agent machine
2026-09-01T23:31:36.1195652Z Version      : 1.220.0
2026-09-01T23:31:36.1195824Z Author       : Microsoft Corporation
2026-09-01T23:31:36.1195965Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/download-secure-file
2026-09-01T23:31:36.1196086Z ==============================================================================
2026-09-01T23:31:36.2691658Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-09-01T23:31:36.3412241Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-09-01T23:31:36.3413059Z ##[debug]loading inputs and endpoints
2026-09-01T23:31:36.3413567Z ##[debug]loading INPUT_SECUREFILE
2026-09-01T23:31:36.3414197Z ##[debug]loading INPUT_RETRYCOUNT
2026-09-01T23:31:36.3414613Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-09-01T23:31:36.3415419Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-09-01T23:31:36.3416000Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-09-01T23:31:36.3416459Z ##[debug]loading SECUREFILE_TICKET_625398e9-6445-4ce2-a28c-a2925c2d8bbf
2026-09-01T23:31:36.3416895Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-09-01T23:31:36.3417299Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-09-01T23:31:36.3417740Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-09-01T23:31:36.3419004Z ##[debug]loading SECRET_AZPAT
2026-09-01T23:31:36.3420137Z ##[debug]loading SECRET_PASSWORD_CGC
2026-09-01T23:31:36.3422302Z ##[debug]loading SECRET_BT_CLIENT_SECRET
2026-09-01T23:31:36.3423614Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-09-01T23:31:36.3424854Z ##[debug]loading SECRET_OCP_TOKEN
2026-09-01T23:31:36.3426489Z ##[debug]loading SECRET_TOKEN_CRQ
2026-09-01T23:31:36.3427009Z ##[debug]loading SECRET_VAULT_LOCATION
2026-09-01T23:31:36.3427820Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-09-01T23:31:36.3428283Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-09-01T23:31:36.3428707Z ##[debug]loading SECRET_FORTIFY_PASS
2026-09-01T23:31:36.3429096Z ##[debug]loaded 19
2026-09-01T23:31:36.3433892Z ##[debug]Agent.ProxyUrl=undefined
2026-09-01T23:31:36.3434325Z ##[debug]Agent.CAInfo=undefined
2026-09-01T23:31:36.3434725Z ##[debug]Agent.ClientCert=undefined
2026-09-01T23:31:36.3435232Z ##[debug]Agent.SkipCertValidation=True
2026-09-01T23:31:36.4142314Z ##[debug]check path : /opt/ads-agent/_work/_tasks/DownloadSecureFile_2a6ca863-f2ce-4f4d-8bcb-15e64608ec4b/1.220.0/task.json
2026-09-01T23:31:36.4143039Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/DownloadSecureFile_2a6ca863-f2ce-4f4d-8bcb-15e64608ec4b/1.220.0/task.json
2026-09-01T23:31:36.4143653Z ##[debug]system.culture=en-US
2026-09-01T23:31:36.4152389Z ##[debug]retryCount=8
2026-09-01T23:31:36.4153038Z ##[debug]socketTimeout=undefined
2026-09-01T23:31:36.4153476Z ##[debug]secureFile=625398e9-6445-4ce2-a28c-a2925c2d8bbf
2026-09-01T23:31:36.4153928Z ##[debug]System.TeamFoundationCollectionUri=https://devops.caixa/projetos/
2026-09-01T23:31:36.4155591Z ##[debug]SYSTEMVSSCONNECTION auth param ACCESSTOKEN = ***
2026-09-01T23:31:36.4156200Z ##[debug]Secure file retry count set to: 8
2026-09-01T23:31:36.4156682Z ##[debug]Agent.ProxyUrl=undefined
2026-09-01T23:31:36.4166655Z ##[debug]secure file name for id 625398e9-6445-4ce2-a28c-a2925c2d8bbf = caixa-truststore-acteste-nprd.jks
2026-09-01T23:31:36.4167202Z ##[debug]Agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-09-01T23:31:36.4167718Z ##[debug]Absolute path for pathSegments: /opt/ads-agent/_work/_temp,caixa-truststore-acteste-nprd.jks = /opt/ads-agent/_work/_temp/caixa-truststore-acteste-nprd.jks
2026-09-01T23:31:36.4168595Z ##[debug]Downloading secure file contents to: /opt/ads-agent/_work/_temp/caixa-truststore-acteste-nprd.jks
2026-09-01T23:31:36.4794664Z ##[debug]secure file ticket for id 625398e9-6445-4ce2-a28c-a2925c2d8bbf = ***
2026-09-01T23:31:36.4795479Z ##[debug]SYSTEM.TEAMPROJECT=Caixa
2026-09-01T23:31:36.5985854Z ##[debug]Downloaded secure file contents to: /opt/ads-agent/_work/_temp/caixa-truststore-acteste-nprd.jks
2026-09-01T23:31:36.5986654Z ##[debug]set secureFilePath=/opt/ads-agent/_work/_temp/caixa-truststore-acteste-nprd.jks
2026-09-01T23:31:36.6163892Z ##[debug]Processed: ##vso[task.setvariable variable=secureFilePath;isOutput=false;issecret=false;]/opt/ads-agent/_work/_temp/caixa-truststore-acteste-nprd.jks
2026-09-01T23:31:36.6186629Z ##[section]Finishing: Download secure file


2026-09-01T23:31:36.6226884Z ##[debug]Evaluating condition for step: 'Download secure file'
2026-09-01T23:31:36.6228239Z ##[debug]Evaluating: succeeded()
2026-09-01T23:31:36.6228618Z ##[debug]Evaluating succeeded:
2026-09-01T23:31:36.6229391Z ##[debug]=> True
2026-09-01T23:31:36.6229719Z ##[debug]Result: True
2026-09-01T23:31:36.6230043Z ##[section]Starting: Download secure file
2026-09-01T23:31:36.6235343Z ==============================================================================
2026-09-01T23:31:36.6235635Z Task         : Download secure file
2026-09-01T23:31:36.6235731Z Description  : Download a secure file to the agent machine
2026-09-01T23:31:36.6235895Z Version      : 1.220.0
2026-09-01T23:31:36.6235978Z Author       : Microsoft Corporation
2026-09-01T23:31:36.6236118Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/download-secure-file
2026-09-01T23:31:36.6236273Z ==============================================================================
2026-09-01T23:31:36.7369307Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-09-01T23:31:36.8073154Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-09-01T23:31:36.8092228Z ##[debug]loading inputs and endpoints
2026-09-01T23:31:36.8098595Z ##[debug]loading INPUT_SECUREFILE
2026-09-01T23:31:36.8105966Z ##[debug]loading INPUT_RETRYCOUNT
2026-09-01T23:31:36.8106994Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-09-01T23:31:36.8107774Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-09-01T23:31:36.8108978Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-09-01T23:31:36.8109460Z ##[debug]loading SECUREFILE_TICKET_8569de46-f616-4e7d-9ed0-fa15eeea6e94
2026-09-01T23:31:36.8113990Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-09-01T23:31:36.8116294Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-09-01T23:31:36.8116924Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-09-01T23:31:36.8118257Z ##[debug]loading SECRET_AZPAT
2026-09-01T23:31:36.8119627Z ##[debug]loading SECRET_PASSWORD_CGC
2026-09-01T23:31:36.8122576Z ##[debug]loading SECRET_BT_CLIENT_SECRET
2026-09-01T23:31:36.8124013Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-09-01T23:31:36.8125099Z ##[debug]loading SECRET_OCP_TOKEN
2026-09-01T23:31:36.8125743Z ##[debug]loading SECRET_TOKEN_CRQ
2026-09-01T23:31:36.8126387Z ##[debug]loading SECRET_VAULT_LOCATION
2026-09-01T23:31:36.8127160Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-09-01T23:31:36.8127676Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-09-01T23:31:36.8128343Z ##[debug]loading SECRET_FORTIFY_PASS
2026-09-01T23:31:36.8128762Z ##[debug]loaded 19
2026-09-01T23:31:36.8134453Z ##[debug]Agent.ProxyUrl=undefined
2026-09-01T23:31:36.8135056Z ##[debug]Agent.CAInfo=undefined
2026-09-01T23:31:36.8135545Z ##[debug]Agent.ClientCert=undefined
2026-09-01T23:31:36.8135941Z ##[debug]Agent.SkipCertValidation=True
2026-09-01T23:31:36.8774563Z ##[debug]check path : /opt/ads-agent/_work/_tasks/DownloadSecureFile_2a6ca863-f2ce-4f4d-8bcb-15e64608ec4b/1.220.0/task.json
2026-09-01T23:31:36.8775240Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/DownloadSecureFile_2a6ca863-f2ce-4f4d-8bcb-15e64608ec4b/1.220.0/task.json
2026-09-01T23:31:36.8775944Z ##[debug]system.culture=en-US
2026-09-01T23:31:36.8782722Z ##[debug]retryCount=8
2026-09-01T23:31:36.8783148Z ##[debug]socketTimeout=undefined
2026-09-01T23:31:36.8783574Z ##[debug]secureFile=8569de46-f616-4e7d-9ed0-fa15eeea6e94
2026-09-01T23:31:36.8784122Z ##[debug]System.TeamFoundationCollectionUri=https://devops.caixa/projetos/
2026-09-01T23:31:36.8786583Z ##[debug]SYSTEMVSSCONNECTION auth param ACCESSTOKEN = ***
2026-09-01T23:31:36.8787104Z ##[debug]Secure file retry count set to: 8
2026-09-01T23:31:36.8787535Z ##[debug]Agent.ProxyUrl=undefined
2026-09-01T23:31:36.8799020Z ##[debug]secure file name for id 8569de46-f616-4e7d-9ed0-fa15eeea6e94 = keystore_event_streams.p12
2026-09-01T23:31:36.8799507Z ##[debug]Agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-09-01T23:31:36.8799997Z ##[debug]Absolute path for pathSegments: /opt/ads-agent/_work/_temp,keystore_event_streams.p12 = /opt/ads-agent/_work/_temp/keystore_event_streams.p12
2026-09-01T23:31:36.8801114Z ##[debug]Downloading secure file contents to: /opt/ads-agent/_work/_temp/keystore_event_streams.p12
2026-09-01T23:31:36.9414975Z ##[debug]secure file ticket for id 8569de46-f616-4e7d-9ed0-fa15eeea6e94 = ***
2026-09-01T23:31:36.9423360Z ##[debug]SYSTEM.TEAMPROJECT=Caixa
2026-09-01T23:31:37.0613423Z ##[debug]Downloaded secure file contents to: /opt/ads-agent/_work/_temp/keystore_event_streams.p12
2026-09-01T23:31:37.0614498Z ##[debug]set secureFilePath=/opt/ads-agent/_work/_temp/keystore_event_streams.p12
2026-09-01T23:31:37.0617284Z ##[debug]Processed: ##vso[task.setvariable variable=secureFilePath;isOutput=false;issecret=false;]/opt/ads-agent/_work/_temp/keystore_event_streams.p12
2026-09-01T23:31:37.0671490Z ##[section]Finishing: Download secure file

2026-09-01T23:31:37.0699152Z ##[debug]Evaluating condition for step: 'Download secure file'
2026-09-01T23:31:37.0700108Z ##[debug]Evaluating: succeeded()
2026-09-01T23:31:37.0700412Z ##[debug]Evaluating succeeded:
2026-09-01T23:31:37.0701041Z ##[debug]=> True
2026-09-01T23:31:37.0701466Z ##[debug]Result: True
2026-09-01T23:31:37.0701761Z ##[section]Starting: Download secure file
2026-09-01T23:31:37.0707495Z ==============================================================================
2026-09-01T23:31:37.0707629Z Task         : Download secure file
2026-09-01T23:31:37.0707686Z Description  : Download a secure file to the agent machine
2026-09-01T23:31:37.0707845Z Version      : 1.220.0
2026-09-01T23:31:37.0707895Z Author       : Microsoft Corporation
2026-09-01T23:31:37.0707994Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/download-secure-file
2026-09-01T23:31:37.0708101Z ==============================================================================
2026-09-01T23:31:37.1873725Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-09-01T23:31:37.2580364Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-09-01T23:31:37.2587911Z ##[debug]loading inputs and endpoints
2026-09-01T23:31:37.2596430Z ##[debug]loading INPUT_SECUREFILE
2026-09-01T23:31:37.2603873Z ##[debug]loading INPUT_RETRYCOUNT
2026-09-01T23:31:37.2604344Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-09-01T23:31:37.2605163Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-09-01T23:31:37.2605806Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-09-01T23:31:37.2606605Z ##[debug]loading SECUREFILE_TICKET_8f7012bf-a7e8-4034-b434-e020ebb5fe60
2026-09-01T23:31:37.2611262Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-09-01T23:31:37.2613664Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-09-01T23:31:37.2614353Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-09-01T23:31:37.2615772Z ##[debug]loading SECRET_AZPAT
2026-09-01T23:31:37.2617363Z ##[debug]loading SECRET_PASSWORD_CGC
2026-09-01T23:31:37.2619155Z ##[debug]loading SECRET_BT_CLIENT_SECRET
2026-09-01T23:31:37.2620650Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-09-01T23:31:37.2621918Z ##[debug]loading SECRET_OCP_TOKEN
2026-09-01T23:31:37.2622603Z ##[debug]loading SECRET_TOKEN_CRQ
2026-09-01T23:31:37.2623211Z ##[debug]loading SECRET_VAULT_LOCATION
2026-09-01T23:31:37.2623919Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-09-01T23:31:37.2624697Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-09-01T23:31:37.2626144Z ##[debug]loading SECRET_FORTIFY_PASS
2026-09-01T23:31:37.2626636Z ##[debug]loaded 19
2026-09-01T23:31:37.2631582Z ##[debug]Agent.ProxyUrl=undefined
2026-09-01T23:31:37.2632009Z ##[debug]Agent.CAInfo=undefined
2026-09-01T23:31:37.2632484Z ##[debug]Agent.ClientCert=undefined
2026-09-01T23:31:37.2632837Z ##[debug]Agent.SkipCertValidation=True
2026-09-01T23:31:37.3264552Z ##[debug]check path : /opt/ads-agent/_work/_tasks/DownloadSecureFile_2a6ca863-f2ce-4f4d-8bcb-15e64608ec4b/1.220.0/task.json
2026-09-01T23:31:37.3265412Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/DownloadSecureFile_2a6ca863-f2ce-4f4d-8bcb-15e64608ec4b/1.220.0/task.json
2026-09-01T23:31:37.3266720Z ##[debug]system.culture=en-US
2026-09-01T23:31:37.3271813Z ##[debug]retryCount=8
2026-09-01T23:31:37.3272310Z ##[debug]socketTimeout=undefined
2026-09-01T23:31:37.3273145Z ##[debug]secureFile=8f7012bf-a7e8-4034-b434-e020ebb5fe60
2026-09-01T23:31:37.3273895Z ##[debug]System.TeamFoundationCollectionUri=https://devops.caixa/projetos/
2026-09-01T23:31:37.3276170Z ##[debug]SYSTEMVSSCONNECTION auth param ACCESSTOKEN = ***
2026-09-01T23:31:37.3277124Z ##[debug]Secure file retry count set to: 8
2026-09-01T23:31:37.3277639Z ##[debug]Agent.ProxyUrl=undefined
2026-09-01T23:31:37.3287799Z ##[debug]secure file name for id 8f7012bf-a7e8-4034-b434-e020ebb5fe60 = sispi_user_keystore_kafka_des.p12
2026-09-01T23:31:37.3288384Z ##[debug]Agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-09-01T23:31:37.3289148Z ##[debug]Absolute path for pathSegments: /opt/ads-agent/_work/_temp,sispi_user_keystore_kafka_des.p12 = /opt/ads-agent/_work/_temp/sispi_user_keystore_kafka_des.p12
2026-09-01T23:31:37.3290045Z ##[debug]Downloading secure file contents to: /opt/ads-agent/_work/_temp/sispi_user_keystore_kafka_des.p12
2026-09-01T23:31:37.3869884Z ##[debug]secure file ticket for id 8f7012bf-a7e8-4034-b434-e020ebb5fe60 = ***
2026-09-01T23:31:37.3870575Z ##[debug]SYSTEM.TEAMPROJECT=Caixa
2026-09-01T23:31:37.5078493Z ##[debug]Downloaded secure file contents to: /opt/ads-agent/_work/_temp/sispi_user_keystore_kafka_des.p12
2026-09-01T23:31:37.5079311Z ##[debug]set secureFilePath=/opt/ads-agent/_work/_temp/sispi_user_keystore_kafka_des.p12
2026-09-01T23:31:37.5082231Z ##[debug]Processed: ##vso[task.setvariable variable=secureFilePath;isOutput=false;issecret=false;]/opt/ads-agent/_work/_temp/sispi_user_keystore_kafka_des.p12
2026-09-01T23:31:37.5131981Z ##[section]Finishing: Download secure file


2026-09-01T23:31:37.5162532Z ##[debug]Evaluating condition for step: 'Download Artifacts'
2026-09-01T23:31:37.5164218Z ##[debug]Evaluating: SucceededNode()
2026-09-01T23:31:37.5164446Z ##[debug]Evaluating SucceededNode:
2026-09-01T23:31:37.5164922Z ##[debug]=> True
2026-09-01T23:31:37.5165203Z ##[debug]Result: True
2026-09-01T23:31:37.5165490Z ##[section]Starting: Download Artifacts
2026-09-01T23:31:37.5228733Z Creating artifacts directory: /opt/ads-agent/_work/r926/a
2026-09-01T23:31:37.5244777Z Created artifacts directory: /opt/ads-agent/_work/r926/a
2026-09-01T23:31:37.5244994Z Downloading artifact
2026-09-01T23:31:37.5253549Z Starting artifacts download...
2026-09-01T23:31:37.5263700Z Downloading linked artifact _SISPI-med-orquestrador of type Build...
2026-09-01T23:31:37.5281986Z Ensuring artifact folder /opt/ads-agent/_work/r926/a/_SISPI-med-orquestrador exists and is clean.
2026-09-01T23:31:37.5326730Z Preparing to get the list of available artifacts from build
2026-09-01T23:31:37.6796603Z ##[warning]No artifacts are available in the build 812365.
2026-09-01T23:31:37.6834535Z Downloaded linked artifact _SISPI-med-orquestrador
2026-09-01T23:31:37.6834789Z Finished artifacts download
2026-09-01T23:31:37.6859774Z ##[section]Finishing: Download Artifacts

2026-09-01T23:31:37.6885022Z ##[debug]Evaluating condition for step: 'Exportando as variáveis do arquivo Trust Store'
2026-09-01T23:31:37.6885805Z ##[debug]Evaluating: succeeded()
2026-09-01T23:31:37.6886024Z ##[debug]Evaluating succeeded:
2026-09-01T23:31:37.6886491Z ##[debug]=> True
2026-09-01T23:31:37.6886707Z ##[debug]Result: True
2026-09-01T23:31:37.6886931Z ##[section]Starting: Exportando as variáveis do arquivo Trust Store
2026-09-01T23:31:37.6891374Z ==============================================================================
2026-09-01T23:31:37.6891582Z Task         : Bash
2026-09-01T23:31:37.6891631Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-01T23:31:37.6891701Z Version      : 3.227.0
2026-09-01T23:31:37.6891789Z Author       : Microsoft Corporation
2026-09-01T23:31:37.6891847Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-01T23:31:37.6891925Z ==============================================================================
2026-09-01T23:31:37.7921289Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-09-01T23:31:37.8670081Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-09-01T23:31:37.8676124Z ##[debug]loading inputs and endpoints
2026-09-01T23:31:37.8683275Z ##[debug]loading INPUT_TARGETTYPE
2026-09-01T23:31:37.8691236Z ##[debug]loading INPUT_FILEPATH
2026-09-01T23:31:37.8691582Z ##[debug]loading INPUT_SCRIPT
2026-09-01T23:31:37.8692140Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-09-01T23:31:37.8692810Z ##[debug]loading INPUT_FAILONSTDERR
2026-09-01T23:31:37.8693491Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-09-01T23:31:37.8694170Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-09-01T23:31:37.8695959Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-09-01T23:31:37.8700361Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-09-01T23:31:37.8701935Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-09-01T23:31:37.8703428Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-09-01T23:31:37.8705262Z ##[debug]loading SECRET_AZPAT
2026-09-01T23:31:37.8706759Z ##[debug]loading SECRET_PASSWORD_CGC
2026-09-01T23:31:37.8707947Z ##[debug]loading SECRET_BT_CLIENT_SECRET
2026-09-01T23:31:37.8708408Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-09-01T23:31:37.8709069Z ##[debug]loading SECRET_OCP_TOKEN
2026-09-01T23:31:37.8709590Z ##[debug]loading SECRET_TOKEN_CRQ
2026-09-01T23:31:37.8710086Z ##[debug]loading SECRET_VAULT_LOCATION
2026-09-01T23:31:37.8711603Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-09-01T23:31:37.8712467Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-09-01T23:31:37.8713257Z ##[debug]loading SECRET_FORTIFY_PASS
2026-09-01T23:31:37.8714011Z ##[debug]loaded 21
2026-09-01T23:31:37.8717330Z ##[debug]Agent.ProxyUrl=undefined
2026-09-01T23:31:37.8718126Z ##[debug]Agent.CAInfo=undefined
2026-09-01T23:31:37.8718883Z ##[debug]Agent.ClientCert=undefined
2026-09-01T23:31:37.8719583Z ##[debug]Agent.SkipCertValidation=True
2026-09-01T23:31:37.8733248Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-01T23:31:37.8734548Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-01T23:31:37.8735152Z ##[debug]system.culture=en-US
2026-09-01T23:31:37.8742691Z ##[debug]failOnStderr=false
2026-09-01T23:31:37.8743552Z ##[debug]workingDirectory=/opt/ads-agent/_work/r926/a
2026-09-01T23:31:37.8744600Z ##[debug]check path : /opt/ads-agent/_work/r926/a
2026-09-01T23:31:37.8745186Z ##[debug]targetType=inline
2026-09-01T23:31:37.8745807Z ##[debug]bashEnvValue=undefined
2026-09-01T23:31:37.8747038Z ##[debug]script=if [ -z "$DOWNLOADSECUREFILE_SECUREFILEPATH" ]; then
download_path=`echo $DOWNLOADSECUREFILE1_SECUREFILEPATH`
else
download_path=`echo $DOWNLOADSECUREFILE_SECUREFILEPATH`
fi
env
JKS_FILE=`basename $download_path`
JKS_FILE_PATH=`echo $download_path`
echo $download_path
echo "##vso[task.setvariable variable=JKS_FILE]$JKS_FILE"
echo "##vso[task.setvariable variable=JKS_FILE_PATH]$JKS_FILE_PATH"
echo "##vso[task.setvariable variable=caCertificate.secureFilePath]$JKS_FILE_PATH"
2026-09-01T23:31:37.8754680Z Generating script.
2026-09-01T23:31:37.8756304Z ##[debug]which 'bash'
2026-09-01T23:31:37.8761687Z ##[debug]found: '/usr/bin/bash'
2026-09-01T23:31:37.8762121Z ##[debug]Agent.Version=3.236.1
2026-09-01T23:31:37.8762465Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-09-01T23:31:37.8762820Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-09-01T23:31:37.8765003Z ========================== Starting Command Output ===========================
2026-09-01T23:31:37.8766193Z ##[debug]which '/usr/bin/bash'
2026-09-01T23:31:37.8767122Z ##[debug]found: '/usr/bin/bash'
2026-09-01T23:31:37.8767856Z ##[debug]/usr/bin/bash arg: /opt/ads-agent/_work/_temp/ab005c24-382a-44da-83ac-e10176b30774.sh
2026-09-01T23:31:37.8770337Z ##[debug]exec tool: /usr/bin/bash
2026-09-01T23:31:37.8770795Z ##[debug]arguments:
2026-09-01T23:31:37.8771128Z ##[debug]   /opt/ads-agent/_work/_temp/ab005c24-382a-44da-83ac-e10176b30774.sh
2026-09-01T23:31:37.8867394Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/ab005c24-382a-44da-83ac-e10176b30774.sh
2026-09-01T23:31:37.8868139Z RELEASE_ARTIFACTS__SISPI-MED-ORQUESTRADOR_REPOSITORY_PROVIDER=TfsGit
2026-09-01T23:31:37.8868437Z RELEASE_ARTIFACTS__SISPI-MED-ORQUESTRADOR_REQUESTEDFORID=7528a3ca-63a4-4aca-bcda-53667397affe
2026-09-01T23:31:37.8868950Z RELEASE_ARTIFACTS__SISPI-MED-ORQUESTRADOR_SOURCEBRANCHNAME=develop-kafka
2026-09-01T23:31:37.8869323Z RELEASE_ARTIFACTS__SISPI-MED-ORQUESTRADOR_BUILDNUMBER=20260831.1402-1.0.0-SNAPSHOT
2026-09-01T23:31:37.8869628Z RELEASE_ARTIFACTS__SISPI-MED-ORQUESTRADOR_REPOSITORY_ID=0e830c6f-3f8c-4b76-8202-276a3dfcc2dc
2026-09-01T23:31:37.8869899Z RELEASE_ARTIFACTS__SISPI-MED-ORQUESTRADOR_BUILDURI=vstfs:///Build/Build/812365
2026-09-01T23:31:37.8870131Z RELEASE_ARTIFACTS__SISPI-MED-ORQUESTRADOR_TYPE=Build
2026-09-01T23:31:37.8870296Z agent.jobstatus=Succeeded
2026-09-01T23:31:37.8870597Z RELEASE_ARTIFACTS__SISPI-MED-ORQUESTRADOR_DEFINITIONID=6809
2026-09-01T23:31:37.8870854Z RELEASE_ARTIFACTS__SISPI-MED-ORQUESTRADOR_REQUESTEDFOR=Gabriel Morais Marreiros
2026-09-01T23:31:37.8871117Z RELEASE_ARTIFACTS__SISPI-MED-ORQUESTRADOR_REPOSITORY_NAME=SISPI-med-orquestrador
2026-09-01T23:31:37.8871361Z RELEASE_ARTIFACTS__SISPI-MED-ORQUESTRADOR_BUILDID=812365
2026-09-01T23:31:37.8871641Z RELEASE_ARTIFACTS__SISPI-MED-ORQUESTRADOR_PROJECTNAME=Caixa
2026-09-01T23:31:37.8871900Z RELEASE_ARTIFACTS__SISPI-MED-ORQUESTRADOR_SOURCEBRANCH=refs/heads/develop-kafka
2026-09-01T23:31:37.8872187Z RELEASE_ARTIFACTS__SISPI-MED-ORQUESTRADOR_SOURCEVERSION=1f6e88198c81225d0137b99ad8c72717e31830ed
2026-09-01T23:31:37.8872461Z RELEASE_ARTIFACTS__SISPI-MED-ORQUESTRADOR_DEFINITIONNAME=SISPI-med-orquestrador
2026-09-01T23:31:37.8872735Z RELEASE_ARTIFACTS__SISPI-MED-ORQUESTRADOR_PROJECTID=98fe0311-ffd2-418a-9d0d-507043380abd
2026-09-01T23:31:37.8872930Z ALOCAIP_VERTICAL_PRD_DTC=Vertical Nao PCN
2026-09-01T23:31:37.8873099Z ARGOCD_REDIS_HA_HAPROXY_PORT_6379_TCP_PROTO=tcp
2026-09-01T23:31:37.8873264Z KUBERNETES_SERVICE_PORT_HTTPS=443
2026-09-01T23:31:37.8873459Z ARGOCD_REDIS_HA_SERVICE_PORT_SERVER=6379
2026-09-01T23:31:37.8873611Z DOCKER_TLS_VERIFY=1
2026-09-01T23:31:37.8873769Z RELEASE_ENVIRONMENTS_EC_TQS_STATUS=NotStarted
2026-09-01T23:31:37.8873927Z BUILD_PROJECTNAME=Caixa
2026-09-01T23:31:37.8874076Z ARGOCD_DEX_SERVER_SERVICE_PORT=5556
2026-09-01T23:31:37.8874228Z SYSTEM_JOBNAME=__default
2026-09-01T23:31:37.8874522Z ARGOCD_REDIS_HA_ANNOUNCE_2_PORT_26379_TCP=tcp://25.128.19.115:26379
2026-09-01T23:31:37.8874905Z OKD_REGISTRY=default-route-openshift-image-registry.apps.produtos4.caixa
2026-09-01T23:31:37.8875117Z ALOCAIP_FIM_RANGE_OPENSHIFT_LOTERIAS_PRD=10.190.255.253
2026-09-01T23:31:37.8875287Z ALOCAIP_AMBIENTE_PRD_CANAIS=Cloud
2026-09-01T23:31:37.8875455Z ARGOCD_REDIS_HA_ANNOUNCE_2_SERVICE_HOST=25.128.19.115
2026-09-01T23:31:37.8875599Z ALOCAIP_AMBIENTE_OPENSHIFT_LOTERIAS_NPRD=Desenvolvimento
2026-09-01T23:31:37.8875771Z ARGOCD_DEX_SERVER_PORT_5557_TCP_PORT=5557
2026-09-01T23:31:37.8876038Z ARGOCD_REDIS_HA_ANNOUNCE_2_SERVICE_PORT_SERVER=6379
2026-09-01T23:31:37.8876203Z KUBERNETES_SERVICE_PORT=443
2026-09-01T23:31:37.8876375Z ARGOCD_SERVER_SERVICE_PORT_HTTPS=443
2026-09-01T23:31:37.8876533Z _ENV_MQ_CONTROLE_TEMPO_PORT=1414
2026-09-01T23:31:37.8876710Z AGENT_RETAINDEFAULTENCODING=false
2026-09-01T23:31:37.8876861Z ARGOCD_SERVER_PORT_80_TCP_PORT=80
2026-09-01T23:31:37.8877015Z ARGOCD_REDIS_HA_SERVICE_PORT=6379
2026-09-01T23:31:37.8877184Z ARGOCD_REDIS_HA_ANNOUNCE_2_SERVICE_PORT_SENTINEL=26379
2026-09-01T23:31:37.8877361Z ARGOCD_REDIS_HA_ANNOUNCE_1_SERVICE_HOST=25.128.180.101
2026-09-01T23:31:37.8877658Z URL_CRQ=https://infradevops-novoportal-backend-prd.apps.produtos4.caixa/api.php?acao=devopsCaixacriarMudancaPadrao
2026-09-01T23:31:37.8877941Z SYSTEM_PIPELINESTARTTIME=2026-09-01 20:31:33-03:00
2026-09-01T23:31:37.8878118Z ALOCAIP_SITE_OCP_LOTERIAS_PRD=CTC
2026-09-01T23:31:37.8878300Z ARGOCD_REDIS_HA_ANNOUNCE_0_PORT_26379_TCP_PROTO=tcp
2026-09-01T23:31:37.8878473Z APIALOCAIP=https://api.alocaip.telecom.caixa
2026-09-01T23:31:37.8878639Z ARGOCD_SERVER_PORT_80_TCP_ADDR=25.128.54.194
2026-09-01T23:31:37.8878796Z SYSTEM_TASKINSTANCENAME=Bash1
2026-09-01T23:31:37.8878995Z AGENT_HOMEDIRECTORY=/opt/ads-agent
2026-09-01T23:31:37.8879187Z ALOCAIP_INICIO_RANGE_OKD4_PRD_CTC=10.121.101.1
2026-09-01T23:31:37.8879334Z ARGOCD_REDIS_HA_HAPROXY_SERVICE_PORT=6379
2026-09-01T23:31:37.8879601Z AGENT_TEMPDIRECTORY=/opt/ads-agent/_work/_temp
2026-09-01T23:31:37.8879796Z ARGOCD_REDIS_HA_PORT_6379_TCP=tcp://25.128.63.5:6379
2026-09-01T23:31:37.8880007Z ARGOCD_REDIS_HA_HAPROXY_PORT_6379_TCP_ADDR=25.128.80.43
2026-09-01T23:31:37.8880255Z VSTS_PROCESS_LOOKUP_ID=vsts_9b9b0746-cb53-4e9a-a840-72382da00140
2026-09-01T23:31:37.8880520Z _ENV_MQ_ANTIFRAUDE_FILA_NOTIFICACAO_INFRACAO=SIAAF.REQ.SISPI.PIX_NOTIFICACAO_INFRACAO
2026-09-01T23:31:37.8880775Z OKD_KAFKA=api.kafka-nprd.caixa:6443
2026-09-01T23:31:37.8880960Z ALOCAIP_VERTICAL_OCP_LOTERIAS_PRD=Cloud
2026-09-01T23:31:37.8881131Z ARGOCD_METRICS_PORT_8082_TCP_ADDR=25.128.21.0
2026-09-01T23:31:37.8881380Z SYSTEM_COLLECTIONURI=https://devops.caixa/projetos/
2026-09-01T23:31:37.8881538Z ALOCAIP_UNIDADE=CEPTIBR
2026-09-01T23:31:37.8881721Z ALOCAIP_FIM_RANGE_PRD_CANAIS_CTC=10.118.97.255
2026-09-01T23:31:37.8881942Z HOSTNAME=ads-agent-release-5cd876f98-4fmdt
2026-09-01T23:31:37.8882106Z RELEASE_ENVIRONMENTNAME=EC DES
2026-09-01T23:31:37.8882600Z USER_CGC=USR_***
2026-09-01T23:31:37.8882776Z ARGOCD_METRICS_SERVICE_HOST=25.128.21.0
2026-09-01T23:31:37.8882986Z BUILD_DEFINITIONNAME=SISPI-med-orquestrador
2026-09-01T23:31:37.8883142Z RELEASE_DEPLOYPHASEID=810665
2026-09-01T23:31:37.8883314Z ENDPOINT_URL_SYSTEMVSSCONNECTION=https://devops.caixa/projetos/
2026-09-01T23:31:37.8883523Z ARGOCD_APPLICATIONSET_CONTROLLER_SERVICE_PORT_WEBHOOK=7000
2026-09-01T23:31:37.8883721Z ARGOCD_REDIS_HA_ANNOUNCE_1_PORT_6379_TCP=tcp://25.128.180.101:6379
2026-09-01T23:31:37.8883940Z TEMPLATERELEASE_OKD=openshift/quarkus-caixa-release
2026-09-01T23:31:37.8884170Z _ENV_SIMPI_MED_URL=https://simpi-med-des.apps.pixnprd4.caixa
2026-09-01T23:31:37.8884379Z ARGOCD_APPLICATIONSET_CONTROLLER_PORT=tcp://25.128.33.89:7000
2026-09-01T23:31:37.8884551Z NSS_SDB_USE_CACHE=no
2026-09-01T23:31:37.8884706Z ARGOCD_REDIS_HA_ANNOUNCE_0_SERVICE_PORT=6379
2026-09-01T23:31:37.8884863Z _ENV_MQ_ANTIFRAUDE_PORT=1414
2026-09-01T23:31:37.8885020Z ARGOCD_REDIS_HA_PORT_6379_TCP_PORT=6379
2026-09-01T23:31:37.8885199Z ALOCAIP_RED_NUM_OCP_LOTERIAS_PRD=13616
2026-09-01T23:31:37.8885357Z RELEASE_DEFINITIONID=6479
2026-09-01T23:31:37.8885499Z RELEASE_RELEASEID=523511
2026-09-01T23:31:37.8885662Z ARGOCD_DEX_SERVER_SERVICE_PORT_GRPC=5557
2026-09-01T23:31:37.8885816Z RELEASE_ENVIRONMENTID=2431150
2026-09-01T23:31:37.8885986Z ARGOCD_APPLICATIONSET_CONTROLLER_PORT_7000_TCP_ADDR=25.128.33.89
2026-09-01T23:31:37.8886229Z NODE_EXTRA_CA_CERTS=/etc/pki/ca-trust/source/anchors/AC-V4.cer
2026-09-01T23:31:37.8886467Z _ENV_KEY_STORE_KAFKA_CLIENT_PASSWORD='${SISPI_USER_KEYSTORE}'
2026-09-01T23:31:37.8886650Z ALOCAIP_RED_NUM_OKD4_PRD_CTC=4996
2026-09-01T23:31:37.8886859Z _ENV_MQ_ANTIFRAUDE_MAXIMO_SESSOES=300
2026-09-01T23:31:37.8887024Z _ENV_MQ_ANTIFRAUDE_PASSWORD=jh73wpqb
2026-09-01T23:31:37.8887199Z SYSTEM_STAGENAME=Stage_98fe0311ffd2418a9d0d507043380abd_29693_1
2026-09-01T23:31:37.8887353Z ARGOCD_SERVER_METRICS_PORT=tcp://25.128.30.126:8083
2026-09-01T23:31:37.8887531Z ALOCAIP_INICIO_RANGE_PRD_CANAIS_CTC=10.118.96.100
2026-09-01T23:31:37.8887776Z ARGOCD_REDIS_HA_PORT_6379_TCP_ADDR=25.128.63.5
2026-09-01T23:31:37.8887936Z SYSTEM_JOBPARALLELISMTAG=Private
2026-09-01T23:31:37.8888115Z ARGOCD_REPO_SERVER_PORT_8081_TCP=tcp://25.128.157.73:8081
2026-09-01T23:31:37.8888301Z AGENT_OS=Linux
2026-09-01T23:31:37.8888470Z ARGOCD_REDIS_HA_SERVICE_PORT_SENTINEL=26379
2026-09-01T23:31:37.8888640Z ALOCAIP_INICIO_RANGE_PRD_CANAIS_DTC=10.220.224.100
2026-09-01T23:31:37.8888943Z _ENV_SISPI_LOGIN_CAIXA_INTRANET_URL="https://login.des.caixa/auth/realms/intranet"
2026-09-01T23:31:37.8889315Z RELEASE_RELEASENAME=SISPI-med-orquestrador-20260831.1402-1.0.0-SNAPSHOT(16)
2026-09-01T23:31:37.8889508Z BUILD_BUILDURI=vstfs:///Build/Build/812365
2026-09-01T23:31:37.8889661Z AGENT_JOBNAME=Agent job
2026-09-01T23:31:37.8889842Z ARGOCD_APPLICATIONSET_CONTROLLER_PORT_7000_TCP=tcp://25.128.33.89:7000
2026-09-01T23:31:37.8890053Z _ENV_MQ_ANTIFRAUDE_HOSTNAME=10.116.95.99
2026-09-01T23:31:37.8890218Z ALOCAIP_RED_NUM_OCP_PRD=6053
2026-09-01T23:31:37.8890419Z DIR_LOGS=/opt/ads-agent/esteira-logs
2026-09-01T23:31:37.8890981Z _ENV_PIX_FRAMEWORK_TOKEN_URL=https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token
2026-09-01T23:31:37.8891204Z _ENV_SISPI_API_MANAGER=https://api.des.caixa:8443
2026-09-01T23:31:37.8891369Z SYSTEM_SERVERTYPE=OnPremises
2026-09-01T23:31:37.8891540Z ARGOCD_APPLICATIONSET_CONTROLLER_PORT_8080_TCP_ADDR=25.128.33.89
2026-09-01T23:31:37.8891711Z AGENT_USEWORKSPACEID=true
2026-09-01T23:31:37.8891820Z OCP_USER_SERVICE=ads
2026-09-01T23:31:37.8892011Z GRAYLOG_USERNAME=API_CLIENT
2026-09-01T23:31:37.8892177Z ARGOCD_METRICS_PORT=tcp://25.128.21.0:8082
2026-09-01T23:31:37.8892370Z ARGOCD_APPLICATIONSET_CONTROLLER_SERVICE_PORT_METRICS=8080
2026-09-01T23:31:37.8892620Z BUILD_REQUESTEDFORID=7528a3ca-63a4-4aca-bcda-53667397affe
2026-09-01T23:31:37.8892796Z _ENV_MQ_CONTROLE_TEMPO_USERID=SSPIBD01
2026-09-01T23:31:37.8892952Z ALOCAIP_AMBIENTE_OCP=Aplicacao
2026-09-01T23:31:37.8893113Z RELEASE_DEFINITIONENVIRONMENTID=29693
2026-09-01T23:31:37.8893307Z SYSTEM_JOBIDENTIFIER=Stage_98fe0311ffd2418a9d0d507043380abd_29693_1.Phase_1.__default
2026-09-01T23:31:37.8893583Z SYSTEM_ARTIFACTSDIRECTORY=/opt/ads-agent/_work/r926/a
2026-09-01T23:31:37.8893755Z ARGOCD_REDIS_HA_PORT_6379_TCP_PROTO=tcp
2026-09-01T23:31:37.8893906Z AGENT_VERSION=3.236.1
2026-09-01T23:31:37.8894048Z CGC_UNIDADE_DES=7390
2026-09-01T23:31:37.8894265Z SYSTEM_JOBDISPLAYNAME=Agent job
2026-09-01T23:31:37.8894482Z REQUESTEDFORID=f384796d-04a2-4d1c-8749-e852ce923c87
2026-09-01T23:31:37.8894722Z ARGOCD_REPO_SERVER_PORT_8081_TCP_ADDR=25.128.157.73
2026-09-01T23:31:37.8894963Z BUILD_REPOSITORY_NAME=SISPI-med-orquestrador
2026-09-01T23:31:37.8895190Z PWD=/opt/ads-agent/_work/r926/a
2026-09-01T23:31:37.8895304Z KIND_DEPLOY=deploymentconfig
2026-09-01T23:31:37.8895464Z ARGOCD_METRICS_PORT_8082_TCP_PROTO=tcp
2026-09-01T23:31:37.8895636Z ARGOCD_REDIS_HA_ANNOUNCE_0_PORT_6379_TCP_PORT=6379
2026-09-01T23:31:37.8895831Z ARGOCD_REDIS_HA_ANNOUNCE_2_PORT_6379_TCP=tcp://25.128.19.115:6379
2026-09-01T23:31:37.8896009Z ARGOCD_SERVER_SERVICE_PORT_HTTP=80
2026-09-01T23:31:37.8896160Z AGENT_ACCEPTTEEEULA=True
2026-09-01T23:31:37.8896325Z ARGOCD_SERVER_METRICS_PORT_8083_TCP_PROTO=tcp
2026-09-01T23:31:37.8896528Z BUILD_SOURCEBRANCHNAME=develop-kafka
2026-09-01T23:31:37.8896698Z TIMEOUT_DEPLOY=300
2026-09-01T23:31:37.8896853Z _ENV_MQ_CONTROLE_TEMPO_CHANNEL=SISPI.SVRCONN
2026-09-01T23:31:37.8897020Z ARGOCD_REDIS_HA_ANNOUNCE_2_PORT_6379_TCP_PORT=6379
2026-09-01T23:31:37.8897324Z _ENV_QUARKUS_DATASOURCE_JDBC_URL="jdbc:oracle:thin:@cnpexdadvm01-scan4.extra.caixa.gov.br:1521/CDBD08NGPDB017"
2026-09-01T23:31:37.8897617Z TASK_DISPLAYNAME=Exportando as variáveis do arquivo Trust Store
2026-09-01T23:31:37.8897875Z ARGOCD_REDIS_HA_HAPROXY_PORT=tcp://25.128.80.43:6379
2026-09-01T23:31:37.8898039Z AGENT_ALLOW_RUNASROOT=1
2026-09-01T23:31:37.8898199Z ARGOCD_REDIS_HA_ANNOUNCE_0_SERVICE_PORT_SENTINEL=26379
2026-09-01T23:31:37.8898378Z ALOCAIP_VERTICAL_OCP_PRD=IBC
2026-09-01T23:31:37.8898547Z ARGOCD_SERVER_PORT_80_TCP=tcp://25.128.54.194:80
2026-09-01T23:31:37.8898733Z ALOCAIP_FIM_RANGE_OCP_LOTERIAS_PRD=10.190.64.200
2026-09-01T23:31:37.8898857Z RELEASE_REASON=Manual
2026-09-01T23:31:37.8899015Z ARGOCD_REDIS_HA_ANNOUNCE_1_SERVICE_PORT_SERVER=6379
2026-09-01T23:31:37.8899175Z ALOCAIP_AMBIENTE=Aplicacao
2026-09-01T23:31:37.8899403Z RELEASE_PRIMARYARTIFACTSOURCEALIAS=_SISPI-med-orquestrador
2026-09-01T23:31:37.8899560Z AMBIENTE=des
2026-09-01T23:31:37.8899730Z ARGOCD_DEX_SERVER_PORT_5556_TCP=tcp://25.128.222.119:5556
2026-09-01T23:31:37.8899930Z RELEASE_ENVIRONMENTS_EC_PRD_STATUS=NotStarted
2026-09-01T23:31:37.8900123Z _ENV_PIX_FRAMEWORK_VALIDACAO_TOKEN_SSO_EMISSOR="https://login.des.caixa/auth/realms/intranet"
2026-09-01T23:31:37.8900334Z RELEASE_DEPLOYMENT_REQUESTEDFOREMAIL=p585600@corp.caixa.gov.br
2026-09-01T23:31:37.8900682Z AGENT_CLOUDID=
2026-09-01T23:31:37.8900941Z BUILD_PROJECTID=98fe0311-ffd2-418a-9d0d-507043380abd
2026-09-01T23:31:37.8901116Z _ENV_MQ_CONTROLE_TEMPO_HOSTNAME=10.116.95.99
2026-09-01T23:31:37.8901270Z INPUT_BASHENVVALUE=
2026-09-01T23:31:37.8901489Z TZ=America/Sao_Paulo
2026-09-01T23:31:37.8901656Z SYSTEM_STAGEDISPLAYNAME=EC DES
2026-09-01T23:31:37.8901800Z MAVEN_VERSION=3.8.5
2026-09-01T23:31:37.8902012Z SYSTEM_PLANID=9db497b2-4f45-432a-a109-1058af440829
2026-09-01T23:31:37.8902200Z ARGOCD_REDIS_HA_ANNOUNCE_1_PORT_6379_TCP_PORT=6379
2026-09-01T23:31:37.8902430Z container=oci
2026-09-01T23:31:37.8902628Z BUILD_BUILDNUMBER=20260831.1402-1.0.0-SNAPSHOT
2026-09-01T23:31:37.8902955Z _ENV_PIX_FRAMEWORK_VALIDACAO_TOKEN_SSO_URL="https://sispi-api-proxy-sso-des.apps.pixnprd4.caixa/auth/realms/intranet;https://login.des.caixa/auth/realms/intranet"
2026-09-01T23:31:37.8903182Z _ENV_MQ_ANTIFRAUDE_TIMEOUT=1000
2026-09-01T23:31:37.8903360Z ARGOCD_METRICS_PORT_8082_TCP=tcp://25.128.21.0:8082
2026-09-01T23:31:37.8903573Z _ENV_MQ_ANTIFRAUDE_CHANNEL=SISPI.SVRCONN
2026-09-01T23:31:37.8903755Z ALOCAIP_INICIO_RANGE_OPENSHIFT_LOTERIAS_NPRD=10.190.160.201
2026-09-01T23:31:37.8903946Z ARGOCD_REDIS_HA_ANNOUNCE_1_PORT=tcp://25.128.180.101:6379
2026-09-01T23:31:37.8904155Z TERRAFORM_VERSIONS=1.3.5_linux_amd64
2026-09-01T23:31:37.8904363Z RELEASE_DEFINITIONNAME=SISPI-med-orquestrador
2026-09-01T23:31:37.8904579Z REPOSITORY_LOGS=https://devops.caixa/projetos/Infraestrutura/_git/esteira-logs
2026-09-01T23:31:37.8904784Z HOME=/opt/ads-agent
2026-09-01T23:31:37.8904942Z ARGOCD_REDIS_HA_HAPROXY_SERVICE_PORT_HAPROXY=6379
2026-09-01T23:31:37.8905118Z LANG=en_US.UTF-8
2026-09-01T23:31:37.8905263Z BUILD_REPOSITORY_PROVIDER=TfsGit
2026-09-01T23:31:37.8905441Z ARGOCD_REDIS_HA_ANNOUNCE_2_PORT_6379_TCP_PROTO=tcp
2026-09-01T23:31:37.8905616Z KUBERNETES_PORT_443_TCP=tcp://25.128.0.1:443
2026-09-01T23:31:37.8905951Z AZP_AGENTPACKAGE_URL=http://binario.caixa:8081/repository/thirdparty/br/gov/caixa/vsts-agent-linux/3.236.1/vsts-agent-linux-3.236.1.tar.gz
2026-09-01T23:31:37.8906182Z ARGOCD_SERVER_METRICS_PORT_8083_TCP_PORT=8083
2026-09-01T23:31:37.8906349Z ALOCAIP_FIM_RANGE_OCP_PRD=10.118.121.250
2026-09-01T23:31:37.8906498Z FORTIFY_USER=admin
2026-09-01T23:31:37.8906930Z ARGOCD_APPLICATIONSET_CONTROLLER_PORT_8080_TCP=tcp://25.128.33.89:8080
2026-09-01T23:31:37.8907124Z _ENV_MQ_CONTROLE_TEMPO_TIMEOUT=1000
2026-09-01T23:31:37.8907277Z ARGOCD_REDIS_HA_ANNOUNCE_1_PORT_26379_TCP=tcp://25.128.180.101:26379
2026-09-01T23:31:37.8907539Z SYSTEM_TIMELINEID=9db497b2-4f45-432a-a109-1058af440829
2026-09-01T23:31:37.8907709Z ALOCAIP_VERTICAL_PRD_CANAIS=IBC
2026-09-01T23:31:37.8907865Z ISTIO_INJECTION=enabled
2026-09-01T23:31:37.8908033Z ARGOCD_REDIS_HA_ANNOUNCE_2_PORT_26379_TCP_ADDR=25.128.19.115
2026-09-01T23:31:37.8908191Z SYSTEM_PHASEDISPLAYNAME=Agent job
2026-09-01T23:31:37.8908382Z SYSTEM_TASKDEFINITIONSURI=https://devops.caixa/projetos/
2026-09-01T23:31:37.8908632Z ARGOCD_APPLICATIONSET_CONTROLLER_PORT_7000_TCP_PORT=7000
2026-09-01T23:31:37.8908805Z RELEASE_REQUESTEDFOR=Jesse Mouta Pereira Batista
2026-09-01T23:31:37.8908976Z ALOCAIP_FIM_RANGE_OPENSHIFT_LOTERIAS_NPRD=10.190.160.254
2026-09-01T23:31:37.8909139Z OCP_URL_SUFFIX=apps.pixnprd4.caixa
2026-09-01T23:31:37.8909289Z DOCKER_TLS_CERTDIR=/certs
2026-09-01T23:31:37.8909449Z RELEASE_REQUESTEDFOREMAIL=p585600@corp.caixa.gov.br
2026-09-01T23:31:37.8909616Z ARGOCD_REPO_SERVER_PORT_8084_TCP_PROTO=tcp
2026-09-01T23:31:37.8909888Z OCP_API=api.pixnprd4.caixa:6443
2026-09-01T23:31:37.8910131Z ARGOCD_REDIS_HA_ANNOUNCE_0_SERVICE_PORT_SERVER=6379
2026-09-01T23:31:37.8910292Z AZP_URL=https://devops.caixa
2026-09-01T23:31:37.8910677Z _ENV_JAVA_OPTIONS_APPEND="-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks"
2026-09-01T23:31:37.8910878Z SYSTEM_HOSTTYPE=release
2026-09-01T23:31:37.8911042Z AGENT_WORKFOLDER=/opt/ads-agent/_work
2026-09-01T23:31:37.8911223Z RELEASE_ENVIRONMENTURI=vstfs:///ReleaseManagement/Environment/2431150
2026-09-01T23:31:37.8911411Z ARGOCD_REDIS_HA_ANNOUNCE_1_SERVICE_PORT_SENTINEL=26379
2026-09-01T23:31:37.8911635Z BT_CLIENT_ID=275c2d45-5b73-446b-a336-6fcf0103ecd4
2026-09-01T23:31:37.8911837Z SONAR_URL=http://sonar.produtos.caixa
2026-09-01T23:31:37.8912011Z ARGOCD_REDIS_HA_ANNOUNCE_2_PORT_6379_TCP_ADDR=25.128.19.115
2026-09-01T23:31:37.8912245Z BT_API_URL=https://sicsn.caixa/BeyondTrust/api/public/v3
2026-09-01T23:31:37.8912471Z SYSTEM_STAGEID=4d38d38a-e2b9-58bb-e48b-c0eec28b5fe1
2026-09-01T23:31:37.8912638Z ARGOCD_REDIS_HA_PORT_26379_TCP_PORT=26379
2026-09-01T23:31:37.8912794Z TASK_PUBLISHTELEMETRY=True
2026-09-01T23:31:37.8912942Z RELEASE_RELEASEDESCRIPTION=
2026-09-01T23:31:37.8913164Z _ENV_TRUST_STORE_KAFKA_PASSWORD='${SISPI_KAFKA_TRUSTSTORE}'
2026-09-01T23:31:37.8913472Z JAVA_HOME_OPEN_8_X64=/usr/java/open-jdk-1.8.0
2026-09-01T23:31:37.8913641Z ARGOCD_REDIS_HA_SERVICE_HOST=25.128.63.5
2026-09-01T23:31:37.8913832Z PROJETOBUILD=build-images-ads
2026-09-01T23:31:37.8913996Z ALOCAIP_UNIDADE_OPENSHIFT_LOTERIAS_NPRD=CETAD
2026-09-01T23:31:37.8914212Z M2_HOME=/opt/apache-maven/apache-maven-3.8.5
2026-09-01T23:31:37.8914379Z _ENV_MQ_ANTIFRAUDE_MAXIMO_CONEXOES=1
2026-09-01T23:31:37.8914543Z SYSTEM_DEFINITIONID=6479
2026-09-01T23:31:37.8914677Z ARGOCD_REDIS_HA_ANNOUNCE_1_PORT_26379_TCP_ADDR=25.128.180.101
2026-09-01T23:31:37.8914903Z _ENV_PIX_FRAMEWORK_TOKEN_CLIENT_ID=cli-ser-spi
2026-09-01T23:31:37.8915105Z ALOCAIP_INICIO_RANGE_OPENSHIFT_LOTERIAS_PRD=10.190.255.245
2026-09-01T23:31:37.8915280Z ARGOCD_DEX_SERVER_PORT_5556_TCP_PROTO=tcp
2026-09-01T23:31:37.8915522Z _ENV_AZURE_SERVICEBUS_QUEUE_NAME="sigcn-med-atualizacaorelatosinfracao-status"
2026-09-01T23:31:37.8915694Z ALOCAIP_RED_NUM_PRD=4104
2026-09-01T23:31:37.8915841Z ALOCAIP_SITE_DTC=DTC
2026-09-01T23:31:37.8915989Z ALOCAIP_UNIDADE_OCP_LOTERIAS_PRD=CETAD
2026-09-01T23:31:37.8916256Z DOWNLOADSECUREFILE1_SECUREFILEPATH=/opt/ads-agent/_work/_temp/caixa-truststore-acteste-nprd.jks
2026-09-01T23:31:37.8916442Z ALOCAIP_UNIDADE_OCP_PRD=CETAD
2026-09-01T23:31:37.8916619Z _ENV_MQ_CONTROLE_TEMPO_QUEUE_MANAGER=XMQD1
2026-09-01T23:31:37.8916789Z AGENT_DISABLELOGPLUGIN_TESTFILEPUBLISHERPLUGIN=true
2026-09-01T23:31:37.8916955Z ALOCAIP_INICIO_RANGE_OCP_PRD=10.118.121.1
2026-09-01T23:31:37.8917100Z TF_BUILD=True
2026-09-01T23:31:37.8917259Z _ENV_MQ_CONTROLE_TEMPO_FILA_REGISTRO_ANS=SISPI.REQ.REGISTRO_ANS
2026-09-01T23:31:37.8917452Z ALOCAIP_RED_NUM_OPENSHIFT_LOTERIAS_PRD=14582
2026-09-01T23:31:37.8917604Z ALOCAIP_SITE_OCP=CTC
2026-09-01T23:31:37.8917793Z SISTEMANOME=sispi-med-orquestrador
2026-09-01T23:31:37.8917980Z AGENT_TASKRESTRICTIONSENFORCEMENTMODE=Enabled
2026-09-01T23:31:37.8918185Z AGENT_ROOTDIRECTORY=/opt/ads-agent/_work
2026-09-01T23:31:37.8918302Z SYSTEM_JOBATTEMPT=1
2026-09-01T23:31:37.8918448Z ALOCAIP_RED_NUM_PRD_DTC=5199
2026-09-01T23:31:37.8918592Z ALOCAIP_SITE_OKD4=CTC
2026-09-01T23:31:37.8918771Z ARGOCD_REDIS_HA_ANNOUNCE_0_PORT_26379_TCP=tcp://25.128.223.248:26379
2026-09-01T23:31:37.8919004Z SYSTEM_DEBUG=true
2026-09-01T23:31:37.8919158Z ALOCAIP_VERTICAL_OKD4_PRD_CTC=Vertical_Nao_PCN
2026-09-01T23:31:37.8919418Z SYSTEM_DEFINITIONNAME=SISPI-med-orquestrador
2026-09-01T23:31:37.8919606Z ARGOCD_REPO_SERVER_PORT_8084_TCP_PORT=8084
2026-09-01T23:31:37.8919763Z ALOCAIP_SITE_OKD4_PRD_CTC=CTC
2026-09-01T23:31:37.8919922Z _ENV_QUARKUS_DATASOURCE_USERNAME=SSPIBD03
2026-09-01T23:31:37.8920082Z AGENT_SKIPCERTVALIDATION=True
2026-09-01T23:31:37.8920258Z ARGOCD_REDIS_HA_ANNOUNCE_1_PORT_26379_TCP_PORT=26379
2026-09-01T23:31:37.8920429Z PROXY_URL=proxyprd.caixa:80
2026-09-01T23:31:37.8920678Z ARGOCD_REPO_SERVER_PORT=tcp://25.128.157.73:8081
2026-09-01T23:31:37.8920922Z RELEASE_DEPLOYMENT_STARTTIME=2026-09-01 23:31:27Z
2026-09-01T23:31:37.8921106Z RELEASE_ATTEMPTNUMBER=1
2026-09-01T23:31:37.8921264Z ARGOCD_REDIS_HA_ANNOUNCE_1_PORT_26379_TCP_PROTO=tcp
2026-09-01T23:31:37.8921389Z ALOCAIP_UNIDADE_OCP=CEPTI
2026-09-01T23:31:37.8921630Z _ENV_AZURE_SERVICEBUS_QUEUE_ENDPOINT=sb://servicebus-eds-nprd.servicebus.windows.net/
2026-09-01T23:31:37.8921815Z ALOCAIP_RED_NUM=3022
2026-09-01T23:31:37.8921950Z SITE=ocp_nprd
2026-09-01T23:31:37.8922099Z _ENV_MQ_CONTROLE_TEMPO_MAXIMO_CONEXOES=1
2026-09-01T23:31:37.8922266Z _ENV_MQ_CONTROLE_TEMPO_MAXIMO_SESSOES=300
2026-09-01T23:31:37.8922421Z ALOCAIP_RED_NUM_PRD_CANAIS_DTC=6055
2026-09-01T23:31:37.8922587Z SYSTEM_PHASEATTEMPT=1
2026-09-01T23:31:37.8922742Z ARGOCD_REPO_SERVER_SERVICE_PORT_METRICS=8084
2026-09-01T23:31:37.8922955Z SYSTEM_ENABLEACCESSTOKEN=False
2026-09-01T23:31:37.8923118Z FORTIFY_API=https://novocodigoseguro.caixa/ssc/api/v1
2026-09-01T23:31:37.8923297Z ARGOCD_SERVER_PORT_443_TCP=tcp://25.128.54.194:443
2026-09-01T23:31:37.8923470Z ARGOCD_SERVER_METRICS_SERVICE_PORT=8083
2026-09-01T23:31:37.8923635Z ALOCAIP_AMBIENTE_OPENSHIFT_LOTERIAS_PRD=Cloud
2026-09-01T23:31:37.8923813Z SYSTEM_TEAMFOUNDATIONSERVERURI=https://devops.caixa/projetos/
2026-09-01T23:31:37.8923993Z BUILD_BUILDID=812365
2026-09-01T23:31:37.8924233Z SYSTEM_TASKDISPLAYNAME=Exportando as variáveis do arquivo Trust Store
2026-09-01T23:31:37.8924422Z ARGOCD_SERVER_PORT_80_TCP_PROTO=tcp
2026-09-01T23:31:37.8924586Z ALOCAIP_INICIO_RANGE_PRD_CANAIS_CTC_OB=10.118.97.100
2026-09-01T23:31:37.8924786Z BUILD_REPOSITORY_ID=0e830c6f-3f8c-4b76-8202-276a3dfcc2dc
2026-09-01T23:31:37.8924954Z RELEASE_TRIGGERINGARTIFACT_ALIAS=
2026-09-01T23:31:37.8925116Z ARGOCD_REDIS_HA_HAPROXY_PORT_6379_TCP_PORT=6379
2026-09-01T23:31:37.8925383Z AGENT_NAME=azp-ads-agent-release-5cd876f98-4fmdt
2026-09-01T23:31:37.8925555Z ARGOCD_SERVER_SERVICE_HOST=25.128.54.194
2026-09-01T23:31:37.8925814Z _ENV_PIX_FRAMEWORK_TOKEN_SECRET_ID=1938b188-42c7-4889-bf3a-7d95e4432fe9
2026-09-01T23:31:37.8926047Z ALOCAIP_FIM_RANGE_OCP=10.116.223.250
2026-09-01T23:31:37.8926213Z ARGOCD_REDIS_HA_ANNOUNCE_2_PORT_26379_TCP_PORT=26379
2026-09-01T23:31:37.8926370Z SYSTEM_JOBPOSITIONINPHASE=1
2026-09-01T23:31:37.8926512Z TERM=xterm
2026-09-01T23:31:37.8926659Z ALOCAIP_AMBIENTE_PRD_DTC=Cloud
2026-09-01T23:31:37.8926846Z AZP_POOL=Release-Linux-OKD4
2026-09-01T23:31:37.8927064Z AGENT_MACHINENAME=ads-agent-release-5cd876f98-4fmdt
2026-09-01T23:31:37.8927476Z RELEASE_SKIPARTIFACTSDOWNLOAD=False
2026-09-01T23:31:37.8927661Z ALOCAIP_VERTICAL_OKD4=Desenvolvimento
2026-09-01T23:31:37.8927823Z ARGOCD_REPO_SERVER_SERVICE_HOST=25.128.157.73
2026-09-01T23:31:37.8928086Z DOWNLOADSECUREFILE3_SECUREFILEPATH=/opt/ads-agent/_work/_temp/sispi_user_keystore_kafka_des.p12
2026-09-01T23:31:37.8928274Z _ENV_SISPI_ISPB_CAIXA=00360305
2026-09-01T23:31:37.8928451Z ARGOCD_REDIS_HA_PORT_26379_TCP=tcp://25.128.63.5:26379
2026-09-01T23:31:37.8928606Z ARGOCD_REDIS_HA_ANNOUNCE_1_PORT_6379_TCP_ADDR=25.128.180.101
2026-09-01T23:31:37.8928799Z ARGOCD_REDIS_HA_HAPROXY_PORT_6379_TCP=tcp://25.128.80.43:6379
2026-09-01T23:31:37.8928985Z ALOCAIP_ID="C&t@d02"
2026-09-01T23:31:37.8929145Z _ENV_MQ_ANTIFRAUDE_USERID=SSPIBD01
2026-09-01T23:31:37.8929315Z ARGOCD_APPLICATIONSET_CONTROLLER_SERVICE_HOST=25.128.33.89
2026-09-01T23:31:37.8929510Z ARGOCD_REPO_SERVER_PORT_8084_TCP=tcp://25.128.157.73:8084
2026-09-01T23:31:37.8929733Z SYSTEM_JOBTIMEOUT=0
2026-09-01T23:31:37.8929887Z ALOCAIP_VERTICAL_OCP=Desenvolvimento
2026-09-01T23:31:37.8930051Z ARGOCD_DEX_SERVER_PORT_5557_TCP_ADDR=25.128.222.119
2026-09-01T23:31:37.8930253Z _ENV_KAFKA_PASS='${SISPI_KAFKA}'
2026-09-01T23:31:37.8930574Z SYSTEM_COLLECTIONID=7b4c9d5c-b041-4798-8dcb-fb11786a173b
2026-09-01T23:31:37.8930824Z SYSTEM_TEAMPROJECTID=98fe0311-ffd2-418a-9d0d-507043380abd
2026-09-01T23:31:37.8930996Z ALOCAIP_VERTICAL=Desenvolvimento
2026-09-01T23:31:37.8931161Z ARGOCD_APPLICATIONSET_CONTROLLER_SERVICE_PORT=7000
2026-09-01T23:31:37.8931319Z SYSTEM_TEAMPROJECT=Caixa
2026-09-01T23:31:37.8931482Z ARGOCD_REDIS_HA_ANNOUNCE_1_SERVICE_PORT=6379
2026-09-01T23:31:37.8931717Z ALOCAIP_AMBIENTE_OCP_LOTERIAS_PRD=Cloud
2026-09-01T23:31:37.8931873Z ALOCAIP_UNIDADE_PRD_DTC=CETAD
2026-09-01T23:31:37.8932070Z ARGOCD_REDIS_HA_ANNOUNCE_0_PORT_26379_TCP_ADDR=25.128.223.248
2026-09-01T23:31:37.8932204Z ARGOCD_SERVER_SERVICE_PORT=80
2026-09-01T23:31:37.8932370Z BUILD_SOURCEVERSION=1f6e88198c81225d0137b99ad8c72717e31830ed
2026-09-01T23:31:37.8932542Z ALOCAIP_CATEGORIA_OKD4_PRD_CTC=Linux
2026-09-01T23:31:37.8932700Z ARGOCD_SERVER_PORT_443_TCP_PORT=443
2026-09-01T23:31:37.8932847Z SISTEMAAMBIENTE=des
2026-09-01T23:31:37.8933005Z AGENT_DISABLELOGPLUGIN_TESTRESULTLOGPLUGIN=true
2026-09-01T23:31:37.8933179Z ARGOCD_REPO_SERVER_PORT_8084_TCP_ADDR=25.128.157.73
2026-09-01T23:31:37.8933346Z AZP_USERNAME=s736639
2026-09-01T23:31:37.8933560Z ARGOCD_METRICS_PORT_8082_TCP_PORT=8082
2026-09-01T23:31:37.8933786Z SYSTEM_PHASEID=69cb8de5-4505-5708-6b48-bb3d486760af
2026-09-01T23:31:37.8933982Z AMBIENTE_BUILD=build-images-ads
2026-09-01T23:31:37.8934141Z ALOCAIP_RED_NUM_OPENSHIFT_LOTERIAS_NPRD=14583
2026-09-01T23:31:37.8934299Z DOCKER_CERT_PATH=/certs/client
2026-09-01T23:31:37.8934456Z ARGOCD_REDIS_HA_ANNOUNCE_2_SERVICE_PORT=6379
2026-09-01T23:31:37.8934716Z _SECRET_SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS=#{VAULT_LOCATION}#
2026-09-01T23:31:37.8934907Z INPUT_ARGUMENTS=
2026-09-01T23:31:37.8935086Z ARGOCD_SERVER_METRICS_SERVICE_PORT_METRICS=8083
2026-09-01T23:31:37.8935246Z SYSTEM_STAGEATTEMPT=1
2026-09-01T23:31:37.8935442Z RELEASE_REQUESTEDFORID=f384796d-04a2-4d1c-8749-e852ce923c87
2026-09-01T23:31:37.8935596Z SHLVL=2
2026-09-01T23:31:37.8935736Z BUILD_TYPE=Build
2026-09-01T23:31:37.8935871Z SYSTEM=release
2026-09-01T23:31:37.8936020Z _ENV_MQ_ANTIFRAUDE_QUEUE_MANAGER=XMQD1
2026-09-01T23:31:37.8936332Z RELEASE_RELEASEWEBURL=https://devops.caixa/projetos/98fe0311-ffd2-418a-9d0d-507043380abd/_release?releaseId=523511&_a=release-summary
2026-09-01T23:31:37.8936550Z ARGOCD_DEX_SERVER_PORT_5557_TCP_PROTO=tcp
2026-09-01T23:31:37.8936734Z KUBERNETES_PORT_443_TCP_PROTO=tcp
2026-09-01T23:31:37.8936970Z RELEASE_DEPLOYMENT_REQUESTEDFORID=f384796d-04a2-4d1c-8749-e852ce923c87
2026-09-01T23:31:37.8937197Z BUILD_SOURCEBRANCH=refs/heads/develop-kafka
2026-09-01T23:31:37.8937458Z AZURE_HTTP_USER_AGENT=TFS_7b4c9d5c-b041-4798-8dcb-fb11786a173b_Release__523511_2431150_1
2026-09-01T23:31:37.8937641Z ALOCAIP_AMBIENTE_OKD4=Aplicacao
2026-09-01T23:31:37.8937871Z AZUSER=s736639
2026-09-01T23:31:37.8938043Z _ENV_AZURE_SERVICEBUS_QUEUE_SHAREDACCESSKEY=
2026-09-01T23:31:37.8938222Z ALOCAIP_UNIDADE_OKD4_PRD_CTC=CETAD
2026-09-01T23:31:37.8938422Z ARGOCD_DEX_SERVER_PORT_5557_TCP=tcp://25.128.222.119:5557
2026-09-01T23:31:37.8938594Z ALOCAIP_UNIDADE_OKD4=CEPTI
2026-09-01T23:31:37.8938755Z RELEASE_ENVIRONMENTS_EC_DES_STATUS=InProgress
2026-09-01T23:31:37.8938915Z ALOCAIP_RED_NUM_OKD4=4995
2026-09-01T23:31:37.8939140Z MSDEPLOY_HTTP_USER_AGENT=TFS_7b4c9d5c-b041-4798-8dcb-fb11786a173b_Release__523511_2431150_1
2026-09-01T23:31:37.8939335Z TASK_SKIPTRANSLATORFORCHECKOUT=False
2026-09-01T23:31:37.8939510Z KUBERNETES_PORT_443_TCP_ADDR=25.128.0.1
2026-09-01T23:31:37.8939681Z ARGOCD_REDIS_HA_ANNOUNCE_1_PORT_6379_TCP_PROTO=tcp
2026-09-01T23:31:37.8939836Z SYSTEM_CULTURE=en-US
2026-09-01T23:31:37.8940048Z SYSTEM_WORKFOLDER=/opt/ads-agent/_work
2026-09-01T23:31:37.8940207Z ALOCAIP_FIM_RANGE_OKD4=10.116.215.250
2026-09-01T23:31:37.8940494Z ARGOCD_REDIS_HA_ANNOUNCE_0_PORT_6379_TCP=tcp://25.128.223.248:6379
2026-09-01T23:31:37.8940699Z ALOCAIP_INICIO_RANGE_OCP_LOTERIAS_PRD=10.190.64.161
2026-09-01T23:31:37.8940876Z ARGOCD_REDIS_HA_PORT_26379_TCP_PROTO=tcp
2026-09-01T23:31:37.8941029Z AGENT_READONLYVARIABLES=true
2026-09-01T23:31:37.8941188Z _ENV_MQ_CONTROLE_TEMPO_PASSWORD=jh73wpqb
2026-09-01T23:31:37.8941342Z PASSWORD_TRUSTSTORE=changeit
2026-09-01T23:31:37.8941503Z AGENT_ID=3049
2026-09-01T23:31:37.8941671Z _ENV_KEY_STORE_KAFKA_CLIENT_LOCATION=/deployments/sispi_user_keystore_kafka_des.p12
2026-09-01T23:31:37.8941853Z ALOCAIP_SITE_OPENSHIFT_LOTERIAS_PRD=CTC
2026-09-01T23:31:37.8942025Z ALOCAIP_UNIDADE_OPENSHIFT_LOTERIAS_PRD=CETAD
2026-09-01T23:31:37.8942186Z ARGOCD_METRICS_SERVICE_PORT=8082
2026-09-01T23:31:37.8942352Z _ENV_SISPI_API_KEY=l76138e827bd9d4f87aea4ff7f54a5607c
2026-09-01T23:31:37.8942493Z ALOCAIP_FIM_RANGE_PRD_CANAIS_CTC_OB=10.118.97.254
2026-09-01T23:31:37.8942650Z ALOCAIP_CATEGORIA=Linux
2026-09-01T23:31:37.8942789Z ALOCAIP_SITE=CTC
2026-09-01T23:31:37.8942970Z ARGOCD_APPLICATIONSET_CONTROLLER_PORT_7000_TCP_PROTO=tcp
2026-09-01T23:31:37.8943231Z OCP_REGISTRY=default-route-openshift-image-registry.apps.pixnprd4.caixa
2026-09-01T23:31:37.8943419Z ARGOCD_SERVER_METRICS_PORT_8083_TCP_ADDR=25.128.30.126
2026-09-01T23:31:37.8943620Z ARGOCD_SERVER_METRICS_PORT_8083_TCP=tcp://25.128.30.126:8083
2026-09-01T23:31:37.8943911Z ALOCAIP_INICIO_RANGE_OCP=10.116.223.1
2026-09-01T23:31:37.8944074Z DOCKER_HOST=tcp://127.0.0.1:2376
2026-09-01T23:31:37.8944243Z ARGOCD_REDIS_HA_ANNOUNCE_2_PORT_26379_TCP_PROTO=tcp
2026-09-01T23:31:37.8944405Z OKD_USER_SERVICE_REGISTRY=ads-sa
2026-09-01T23:31:37.8944624Z CACHE_DIR=/opt/ads-agent/cache-tools
2026-09-01T23:31:37.8944788Z BUILD_REQUESTEDFOR=Gabriel Morais Marreiros
2026-09-01T23:31:37.8944954Z ALOCAIP_SITE_OCP_PRD=CTC
2026-09-01T23:31:37.8945097Z RELEASE_DEPLOYMENTID=824174
2026-09-01T23:31:37.8945246Z ALOCAIP_UNIDADE_PRD_CANAIS=CETAD
2026-09-01T23:31:37.8945398Z KUBERNETES_SERVICE_HOST=25.128.0.1
2026-09-01T23:31:37.8945557Z ARGOCD_REPO_SERVER_SERVICE_PORT=8081
2026-09-01T23:31:37.8945688Z OKD_API_REGISTRY=api.produtos4.caixa:6443
2026-09-01T23:31:37.8945919Z SYSTEM_DEFAULTWORKINGDIRECTORY=/opt/ads-agent/_work/r926/a
2026-09-01T23:31:37.8946098Z LC_ALL=C.UTF-8
2026-09-01T23:31:37.8946254Z ALOCAIP_AMBIENTE_OCP_PRD=Cloud
2026-09-01T23:31:37.8946418Z KUBERNETES_PORT=tcp://25.128.0.1:443
2026-09-01T23:31:37.8946579Z KUBERNETES_PORT_443_TCP_PORT=443
2026-09-01T23:31:37.8946752Z VSO_AGENT_IGNORE=AZP_TOKEN,AZP_TOKEN_FILE,AZP_PASSWORD_FILE,AZP_PASSWORD
2026-09-01T23:31:37.8946936Z ARGOCD_SERVER_METRICS_SERVICE_HOST=25.128.30.126
2026-09-01T23:31:37.8947091Z AGENT_ISSELFHOSTED=1
2026-09-01T23:31:37.8947235Z AGENT_OSARCHITECTURE=X64
2026-09-01T23:31:37.8947415Z _ENV_PIX_FRAMEWORK_VALIDACAO_TOKEN_VALIDACAO_GLOBAL=true
2026-09-01T23:31:37.8947594Z ARGOCD_DEX_SERVER_PORT_5556_TCP_PORT=5556
2026-09-01T23:31:37.8947766Z RELEASE_RELEASEURI=vstfs:///ReleaseManagement/Release/523511
2026-09-01T23:31:37.8947938Z ARGOCD_REPO_SERVER_SERVICE_PORT_SERVER=8081
2026-09-01T23:31:37.8948094Z SYSTEM_ISDOCKERCONTAINER=0
2026-09-01T23:31:37.8948245Z ALOCAIP_AMBIENTE_OKD4_PRD_CTC=Cloud
2026-09-01T23:31:37.8948410Z ARGOCD_REDIS_HA_PORT_26379_TCP_ADDR=25.128.63.5
2026-09-01T23:31:37.8948565Z SYSTEM_ISSCHEDULED=False
2026-09-01T23:31:37.8948689Z _ENV_TOPICO_MED_POLLING=PIX.MED.POLLING.EVENTO
2026-09-01T23:31:37.8948895Z ARGOCD_REDIS_HA_ANNOUNCE_0_PORT=tcp://25.128.223.248:6379
2026-09-01T23:31:37.8949185Z PATH=/opt/apache-maven/apache-maven-3.8.5/bin:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin
2026-09-01T23:31:37.8949389Z ARGOCD_REDIS_HA_HAPROXY_SERVICE_HOST=25.128.80.43
2026-09-01T23:31:37.8949635Z ARGOCD_REDIS_HA_PORT=tcp://25.128.63.5:6379
2026-09-01T23:31:37.8949865Z SYSTEM_JOBID=581fb220-dca5-5563-e177-8bdf4933c930
2026-09-01T23:31:37.8950034Z _ENV_QUARKUS_DATASOURCE_PASSWORD=sspibd0303
2026-09-01T23:31:37.8950203Z ALOCAIP_VERTICAL_OPENSHIFT_LOTERIAS_PRD=Cloud
2026-09-01T23:31:37.8950376Z ARGOCD_DEX_SERVER_PORT_5556_TCP_ADDR=25.128.222.119
2026-09-01T23:31:37.8950744Z AGENT_RELEASEDIRECTORY=/opt/ads-agent/_work/r926/a
2026-09-01T23:31:37.8950911Z ALOCAIP_INICIO_RANGE_PRD_DTC=10.221.100.100
2026-09-01T23:31:37.8951073Z ALOCAIP_FIM_RANGE_PRD_DTC=10.221.101.250
2026-09-01T23:31:37.8951240Z ALOCAIP_FIM_RANGE_PRD_CANAIS_DTC=10.220.225.255
2026-09-01T23:31:37.8951404Z ARGOCD_SERVER_PORT_443_TCP_ADDR=25.128.54.194
2026-09-01T23:31:37.8951558Z _ENV_KAFKA_USER= dev
2026-09-01T23:31:37.8951718Z ARGOCD_REDIS_HA_ANNOUNCE_0_PORT_6379_TCP_ADDR=25.128.223.248
2026-09-01T23:31:37.8951917Z SYSTEM_TEAMFOUNDATIONCOLLECTIONURI=https://devops.caixa/projetos/
2026-09-01T23:31:37.8952116Z ARGOCD_DEX_SERVER_SERVICE_HOST=25.128.222.119
2026-09-01T23:31:37.8952281Z RELEASE_ENVIRONMENTS_EC_HMP_STATUS=NotStarted
2026-09-01T23:31:37.8952445Z ARGOCD_METRICS_SERVICE_PORT_METRICS=8082
2026-09-01T23:31:37.8952612Z ARGOCD_REPO_SERVER_PORT_8081_TCP_PORT=8081
2026-09-01T23:31:37.8952760Z _ENV_AZURE_SERVICEBUS_QUEUE_SHAREDACCESSKEYNAME=RootManageSharedAccessKey
2026-09-01T23:31:37.8952951Z ARGOCD_APPLICATIONSET_CONTROLLER_PORT_8080_TCP_PORT=8080
2026-09-01T23:31:37.8953202Z PORTALIF=https://infradevops-novoportal-backend-prd.apps.produtos4.caixa
2026-09-01T23:31:37.8953426Z BT_SECRETS_LIST=SISPI_DES/SISPI_KAFKA,SISPI_DES/SISPI_KAFKA_TRUSTSTORE,SISPI_DES/SISPI_USER_KEYSTORE
2026-09-01T23:31:37.8953620Z ARGOCD_DEX_SERVER_SERVICE_PORT_HTTP=5556
2026-09-01T23:31:37.8953830Z SYSTEM_ISAZUREVM=0
2026-09-01T23:31:37.8954056Z SYSTEM_TASKINSTANCEID=d4ca3749-8fb1-5fd8-42a0-a02602a4ad92
2026-09-01T23:31:37.8954315Z _ENV_KAFKA_BOOTSTRAP_SERVER="development-kafka-bootstrap-cp4i.apps.pixnprd4.caixa"
2026-09-01T23:31:37.8954490Z AGENT_JOBSTATUS=Succeeded
2026-09-01T23:31:37.8954644Z ALOCAIP_RED_NUM_PRD_CANAIS_CTC=6053
2026-09-01T23:31:37.8954802Z GIT_TERMINAL_PROMPT=0
2026-09-01T23:31:37.8954956Z ARGOCD_REPO_SERVER_PORT_8081_TCP_PROTO=tcp
2026-09-01T23:31:37.8955123Z ARGOCD_REDIS_HA_ANNOUNCE_0_SERVICE_HOST=25.128.223.248
2026-09-01T23:31:37.8955320Z RELEASE_DEPLOYMENT_REQUESTEDFOR=Jesse Mouta Pereira Batista
2026-09-01T23:31:37.8955578Z DOWNLOADSECUREFILE2_SECUREFILEPATH=/opt/ads-agent/_work/_temp/keystore_event_streams.p12
2026-09-01T23:31:37.8955853Z ARGOCD_APPLICATIONSET_CONTROLLER_PORT_8080_TCP_PROTO=tcp
2026-09-01T23:31:37.8956013Z CGC_UNIDADE_OPS=7259
2026-09-01T23:31:37.8956219Z AGENT_TOOLSDIRECTORY=/opt/ads-agent/_work/_tool
2026-09-01T23:31:37.8956402Z ALOCAIP_FIM_RANGE_OKD4_PRD_CTC=10.121.103.250
2026-09-01T23:31:37.8956574Z ARGOCD_REDIS_HA_ANNOUNCE_0_PORT_6379_TCP_PROTO=tcp
2026-09-01T23:31:37.8956746Z ALOCAIP_VERTICAL_OPENSHIFT_LOTERIAS_NPRD=Cloud
2026-09-01T23:31:37.8956875Z ARGOCD_SERVER_PORT_443_TCP_PROTO=tcp
2026-09-01T23:31:37.8957046Z SYSTEM_PHASENAME=Phase_1
2026-09-01T23:31:37.8957192Z ALOCAIP_RED_NUM_OCP=4995
2026-09-01T23:31:37.8957369Z _ENV_TRUST_STORE_KAFKA_LOCATION=/deployments/keystore_event_streams.p12
2026-09-01T23:31:37.8957558Z ARGOCD_REDIS_HA_ANNOUNCE_0_PORT_26379_TCP_PORT=26379
2026-09-01T23:31:37.8957733Z SYSTEM_TOTALJOBSINPHASE=1
2026-09-01T23:31:37.8957910Z ARGOCD_REDIS_HA_ANNOUNCE_2_PORT=tcp://25.128.19.115:6379
2026-09-01T23:31:37.8958087Z ALOCAIP_SITE_OPENSHIFT_LOTERIAS_NPRD=CTC
2026-09-01T23:31:37.8958243Z _ENV_KAFKA_BOOTSTRAP_PORT=443
2026-09-01T23:31:37.8958424Z ARGOCD_SERVER_PORT=tcp://25.128.54.194:80
2026-09-01T23:31:37.8958602Z ARGOCD_DEX_SERVER_PORT=tcp://25.128.222.119:5556
2026-09-01T23:31:37.8958766Z BUILD_DEFINITIONID=6809
2026-09-01T23:31:37.8958919Z ALOCAIP_INICIO_RANGE_OKD4=10.116.209.0
2026-09-01T23:31:37.8959076Z _=/usr/bin/env
2026-09-01T23:31:37.8959330Z /opt/ads-agent/_work/_temp/caixa-truststore-acteste-nprd.jks
2026-09-01T23:31:37.8960183Z ##[debug]Processed: ##vso[task.setvariable variable=JKS_FILE]caixa-truststore-acteste-nprd.jks
2026-09-01T23:31:37.8960781Z ##[debug]Processed: ##vso[task.setvariable variable=JKS_FILE_PATH]/opt/ads-agent/_work/_temp/caixa-truststore-acteste-nprd.jks
2026-09-01T23:31:37.8961360Z ##[debug]Processed: ##vso[task.setvariable variable=caCertificate.secureFilePath]/opt/ads-agent/_work/_temp/caixa-truststore-acteste-nprd.jks
2026-09-01T23:31:37.8961798Z ##[debug]Exit code 0 received from tool '/usr/bin/bash'
2026-09-01T23:31:37.8962143Z ##[debug]STDIO streams have closed for tool '/usr/bin/bash'
2026-09-01T23:31:37.8962571Z ##[debug]task result: Succeeded
2026-09-01T23:31:37.8971610Z ##[debug]Processed: ##vso[task.complete result=Succeeded;done=true;]
2026-09-01T23:31:37.8973125Z ##[section]Finishing: Exportando as variáveis do arquivo Trust Store

2026-09-01T23:31:37.8997184Z ##[debug]Evaluating condition for step: 'Recuperando nome do repositório'
2026-09-01T23:31:37.8997950Z ##[debug]Evaluating: succeeded()
2026-09-01T23:31:37.8998163Z ##[debug]Evaluating succeeded:
2026-09-01T23:31:37.8998643Z ##[debug]=> True
2026-09-01T23:31:37.8998925Z ##[debug]Result: True
2026-09-01T23:31:37.8999227Z ##[section]Starting: Recuperando nome do repositório
2026-09-01T23:31:37.9004052Z ==============================================================================
2026-09-01T23:31:37.9004209Z Task         : Bash
2026-09-01T23:31:37.9004260Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-01T23:31:37.9004326Z Version      : 3.227.0
2026-09-01T23:31:37.9004409Z Author       : Microsoft Corporation
2026-09-01T23:31:37.9004465Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-01T23:31:37.9004542Z ==============================================================================
2026-09-01T23:31:38.0036353Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-09-01T23:31:38.0784935Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-09-01T23:31:38.0793495Z ##[debug]loading inputs and endpoints
2026-09-01T23:31:38.0801170Z ##[debug]loading INPUT_TARGETTYPE
2026-09-01T23:31:38.0809261Z ##[debug]loading INPUT_FILEPATH
2026-09-01T23:31:38.0810307Z ##[debug]loading INPUT_SCRIPT
2026-09-01T23:31:38.0811625Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-09-01T23:31:38.0813807Z ##[debug]loading INPUT_FAILONSTDERR
2026-09-01T23:31:38.0814569Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-09-01T23:31:38.0815111Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-09-01T23:31:38.0816889Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-09-01T23:31:38.0822702Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-09-01T23:31:38.0825347Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-09-01T23:31:38.0827403Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-09-01T23:31:38.0830274Z ##[debug]loading SECRET_AZPAT
2026-09-01T23:31:38.0833169Z ##[debug]loading SECRET_PASSWORD_CGC
2026-09-01T23:31:38.0834768Z ##[debug]loading SECRET_BT_CLIENT_SECRET
2026-09-01T23:31:38.0835538Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-09-01T23:31:38.0836585Z ##[debug]loading SECRET_OCP_TOKEN
2026-09-01T23:31:38.0837518Z ##[debug]loading SECRET_TOKEN_CRQ
2026-09-01T23:31:38.0838571Z ##[debug]loading SECRET_VAULT_LOCATION
2026-09-01T23:31:38.0839105Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-09-01T23:31:38.0839599Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-09-01T23:31:38.0841500Z ##[debug]loading SECRET_FORTIFY_PASS
2026-09-01T23:31:38.0842158Z ##[debug]loaded 21
2026-09-01T23:31:38.0847929Z ##[debug]Agent.ProxyUrl=undefined
2026-09-01T23:31:38.0848441Z ##[debug]Agent.CAInfo=undefined
2026-09-01T23:31:38.0848895Z ##[debug]Agent.ClientCert=undefined
2026-09-01T23:31:38.0849408Z ##[debug]Agent.SkipCertValidation=True
2026-09-01T23:31:38.0872323Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-01T23:31:38.0874214Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-01T23:31:38.0874781Z ##[debug]system.culture=en-US
2026-09-01T23:31:38.0886972Z ##[debug]failOnStderr=false
2026-09-01T23:31:38.0888106Z ##[debug]workingDirectory=/opt/ads-agent/_work/r926/a
2026-09-01T23:31:38.0888620Z ##[debug]check path : /opt/ads-agent/_work/r926/a
2026-09-01T23:31:38.0890888Z ##[debug]targetType=inline
2026-09-01T23:31:38.0891499Z ##[debug]bashEnvValue=undefined
2026-09-01T23:31:38.0893745Z ##[debug]script=#!/bin/bash


BUILDS_ID=`curl --connect-timeout 3 --max-time 7 --retry 5 --retry-delay 0 --retry-max-time 50 -X GET -u "s736639:***" "https://devops.caixa/projetos/Caixa/_apis/release/releases?releaseId=523511" | jq -r '.artifacts[] | select(.type == "Build") | .definitionReference.version.id'`


arrVar=("")
echo $BUILDS_ID
for build_id in $BUILDS_ID
do


LOGS=`curl --connect-timeout 3 --max-time 7 --retry 5 --retry-delay 0 --retry-max-time 50 -X GET -u "s736639:***" "https://devops.caixa/projetos/Caixa/_apis/build/builds/$build_id?api-version=5.1" | jq -r '.logs.url'`

echo $LOGS

LOG_LIST=`curl --connect-timeout 3 --max-time 7 --retry 5 --retry-delay 0 --retry-max-time 50 -X GET -u "s736639:***" "$LOGS" |  jq -r '.value[].url' | sort -k11 -r -t/ -n`

echo $LOGS

T_URL_BUILD=`for log in "$LOG_LIST"; do curl --connect-timeout 3 --max-time 7 --retry 5 --retry-delay 0 --retry-max-time 50 -X GET -u "s736639:***" $log; done | grep "Nome do repositório:" | tail -n1 | awk '{print $5}'`
arrVar+=("$T_URL_BUILD")

done

if [ -n "$T_URL_BUILD" ]; 
then
REPO_FINAL_NAME=`echo "$T_URL_BUILD"`

else
REPO_FINAL_NAME=`echo SISPI-med-orquestrador`

fi

echo $REPO_FINAL_NAME
echo "##vso[task.setvariable variable=REPO_FINAL_NAME;]$REPO_FINAL_NAME"
2026-09-01T23:31:38.0903546Z Generating script.
2026-09-01T23:31:38.0905777Z ##[debug]which 'bash'
2026-09-01T23:31:38.0912565Z ##[debug]found: '/usr/bin/bash'
2026-09-01T23:31:38.0913065Z ##[debug]Agent.Version=3.236.1
2026-09-01T23:31:38.0913404Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-09-01T23:31:38.0913738Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-09-01T23:31:38.0916308Z ========================== Starting Command Output ===========================
2026-09-01T23:31:38.0917695Z ##[debug]which '/usr/bin/bash'
2026-09-01T23:31:38.0918973Z ##[debug]found: '/usr/bin/bash'
2026-09-01T23:31:38.0919934Z ##[debug]/usr/bin/bash arg: /opt/ads-agent/_work/_temp/50abc36f-157b-43c6-8c67-4b807c8696a1.sh
2026-09-01T23:31:38.0923253Z ##[debug]exec tool: /usr/bin/bash
2026-09-01T23:31:38.0923545Z ##[debug]arguments:
2026-09-01T23:31:38.0923917Z ##[debug]   /opt/ads-agent/_work/_temp/50abc36f-157b-43c6-8c67-4b807c8696a1.sh
2026-09-01T23:31:38.0926110Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/50abc36f-157b-43c6-8c67-4b807c8696a1.sh
2026-09-01T23:31:38.1040718Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:38.1041068Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:38.1041175Z 
2026-09-01T23:31:38.2913432Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:38.2913919Z 100  543k  100  543k    0     0  2891k      0 --:--:-- --:--:-- --:--:-- 2891k
2026-09-01T23:31:38.2934580Z 812365
2026-09-01T23:31:38.2992560Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:38.2992997Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:38.2993131Z 
2026-09-01T23:31:38.3436085Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:38.3436478Z 100  4794  100  4794    0     0   106k      0 --:--:-- --:--:-- --:--:--  108k
2026-09-01T23:31:38.3448929Z https://devops.caixa/projetos/98fe0311-ffd2-418a-9d0d-507043380abd/_apis/build/builds/812365/logs
2026-09-01T23:31:38.3495446Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:38.3497783Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:38.3497856Z 
2026-09-01T23:31:38.4094145Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:38.4094600Z 100  9598  100  9598    0     0   158k      0 --:--:-- --:--:-- --:--:--  158k
2026-09-01T23:31:38.4112834Z https://devops.caixa/projetos/98fe0311-ffd2-418a-9d0d-507043380abd/_apis/build/builds/812365/logs
2026-09-01T23:31:38.4156096Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:38.4156391Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:38.4156571Z 
2026-09-01T23:31:38.5458175Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:38.5458836Z 100    37    0    37    0     0    284      0 --:--:-- --:--:-- --:--:--   286
2026-09-01T23:31:38.5459145Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:38.5459670Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:38.5459770Z 
2026-09-01T23:31:38.6312128Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:38.6312615Z 100  777k    0  777k    0     0  9142k      0 --:--:-- --:--:-- --:--:-- 9142k
2026-09-01T23:31:38.6312840Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:38.6313040Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:38.6313100Z 
2026-09-01T23:31:38.6856768Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:38.6857143Z 100   246    0   246    0     0   4555      0 --:--:-- --:--:-- --:--:--  4555
2026-09-01T23:31:38.6858002Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:38.6858787Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:38.6859285Z 
2026-09-01T23:31:38.8007572Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:38.8008094Z 100   924    0   924    0     0   8105      0 --:--:-- --:--:-- --:--:--  8034
2026-09-01T23:31:38.8008536Z 100   924    0   924    0     0   8105      0 --:--:-- --:--:-- --:--:--  8034
2026-09-01T23:31:38.8009178Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:38.8009391Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:38.8009454Z 
2026-09-01T23:31:38.8505193Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:38.8505537Z 100  1231    0  1231    0     0  25122      0 --:--:-- --:--:-- --:--:-- 25122
2026-09-01T23:31:38.8505757Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:38.8505973Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:38.8506031Z 
2026-09-01T23:31:38.9682474Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:38.9682820Z 100  8643    0  8643    0     0  73871      0 --:--:-- --:--:-- --:--:-- 73871
2026-09-01T23:31:38.9683153Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:38.9683501Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:38.9683568Z 
2026-09-01T23:31:39.0164963Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:39.0165388Z 100  1143    0  1143    0     0  24319      0 --:--:-- --:--:-- --:--:-- 24319
2026-09-01T23:31:39.0165617Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:39.0166108Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:39.0166330Z 
2026-09-01T23:31:39.0657547Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:39.0657835Z 100 31140    0 31140    0     0   620k      0 --:--:-- --:--:-- --:--:--  620k
2026-09-01T23:31:39.0658905Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:39.0659645Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:39.0659713Z 
2026-09-01T23:31:39.1131910Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:39.1132433Z 100  1691    0  1691    0     0  35978      0 --:--:-- --:--:-- --:--:-- 36760
2026-09-01T23:31:39.1132658Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:39.1135183Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:39.1135312Z 
2026-09-01T23:31:39.1604354Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:39.1605100Z 100 92350    0 92350    0     0  1960k      0 --:--:-- --:--:-- --:--:-- 1960k
2026-09-01T23:31:39.1607270Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:39.1607707Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:39.1607806Z 
2026-09-01T23:31:39.2104425Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:39.2104934Z 100  1614    0  1614    0     0  32938      0 --:--:-- --:--:-- --:--:-- 32938
2026-09-01T23:31:39.2106047Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:39.2106245Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:39.2106579Z 
2026-09-01T23:31:39.2618357Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:39.2619029Z 100  1480    0  1480    0     0  29019      0 --:--:-- --:--:-- --:--:-- 29019
2026-09-01T23:31:39.2619278Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:39.2619470Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:39.2619532Z 
2026-09-01T23:31:39.3107893Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:39.3108283Z 100  1160    0  1160    0     0  24166      0 --:--:-- --:--:-- --:--:-- 24166
2026-09-01T23:31:39.3108504Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:39.3109134Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:39.3109242Z 
2026-09-01T23:31:39.3648008Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:39.3648548Z 100  1213    0  1213    0     0  22886      0 --:--:-- --:--:-- --:--:-- 22886
2026-09-01T23:31:39.3648784Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:39.3648980Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:39.3649112Z 
2026-09-01T23:31:39.4174001Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:39.4174356Z 100  1715    0  1715    0     0  32980      0 --:--:-- --:--:-- --:--:-- 32980
2026-09-01T23:31:39.4174581Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:39.4174772Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:39.4175002Z 
2026-09-01T23:31:39.4685378Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:39.4685788Z 100  1536    0  1536    0     0  30720      0 --:--:-- --:--:-- --:--:-- 30720
2026-09-01T23:31:39.4686050Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:39.4686253Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:39.4686319Z 
2026-09-01T23:31:39.5203145Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:39.5203666Z 100 60479    0 60479    0     0  1158k      0 --:--:-- --:--:-- --:--:-- 1158k
2026-09-01T23:31:39.5203890Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:39.5204079Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:39.5204182Z 
2026-09-01T23:31:39.5725327Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:39.5725813Z 100  1060    0  1060    0     0  20784      0 --:--:-- --:--:-- --:--:-- 20784
2026-09-01T23:31:39.5726429Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:39.5726619Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:39.5726703Z 
2026-09-01T23:31:39.6362248Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:39.6362617Z 100  1105    0  1105    0     0  17539      0 --:--:-- --:--:-- --:--:-- 17539
2026-09-01T23:31:39.6362886Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:39.6363628Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:39.6363691Z 
2026-09-01T23:31:39.6878308Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:39.6878747Z 100   372    0   372    0     0   7294      0 --:--:-- --:--:-- --:--:--  7294
2026-09-01T23:31:39.6878980Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:39.6879174Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:39.6879239Z 
2026-09-01T23:31:39.7405131Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:39.7405954Z 100   446    0   446    0     0   8576      0 --:--:-- --:--:-- --:--:--  8415
2026-09-01T23:31:39.7406229Z 100   446    0   446    0     0   8576      0 --:--:-- --:--:-- --:--:--  8415
2026-09-01T23:31:39.7406472Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:39.7407148Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:39.7407247Z 
2026-09-01T23:31:39.7923982Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:39.7924573Z 100   446    0   446    0     0   8745      0 --:--:-- --:--:-- --:--:--  8745
2026-09-01T23:31:39.7924894Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:39.7925107Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:39.7925202Z 
2026-09-01T23:31:39.8461103Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:39.8461546Z 100   446    0   446    0     0   8415      0 --:--:-- --:--:-- --:--:--  8415
2026-09-01T23:31:39.8461756Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:39.8462233Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:39.8462300Z 
2026-09-01T23:31:39.8963084Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:39.8963806Z 100   446    0   446    0     0   9102      0 --:--:-- --:--:-- --:--:--  9102
2026-09-01T23:31:39.8964033Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:39.8964361Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:39.8964504Z 
2026-09-01T23:31:39.9458188Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:39.9458560Z 100   292    0   292    0     0   5959      0 --:--:-- --:--:-- --:--:--  5959
2026-09-01T23:31:39.9458963Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:39.9459245Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:39.9459334Z 
2026-09-01T23:31:39.9962152Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:39.9962631Z 100   292    0   292    0     0   5840      0 --:--:-- --:--:-- --:--:--  5840
2026-09-01T23:31:39.9964251Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:39.9964784Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:39.9964885Z 
2026-09-01T23:31:40.0474917Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:40.0475343Z 100   292    0   292    0     0   5840      0 --:--:-- --:--:-- --:--:--  5840
2026-09-01T23:31:40.0475654Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:40.0476195Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:40.0476254Z 
2026-09-01T23:31:40.0984394Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:40.0984953Z 100   366    0   366    0     0   7320      0 --:--:-- --:--:-- --:--:--  7320
2026-09-01T23:31:40.0985248Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:40.0986026Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:40.0986206Z 
2026-09-01T23:31:40.1507883Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:40.1508407Z 100  1619    0  1619    0     0  31134      0 --:--:-- --:--:-- --:--:-- 31134
2026-09-01T23:31:40.1508631Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:40.1509134Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:40.1509242Z 
2026-09-01T23:31:40.2347018Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:40.2347431Z 100  215k    0  215k    0     0  2596k      0 --:--:-- --:--:-- --:--:-- 2596k
2026-09-01T23:31:40.2347682Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:40.2347904Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:40.2347993Z 
2026-09-01T23:31:40.3177271Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:40.3177762Z 100  1111    0  1111    0     0  13548      0 --:--:-- --:--:-- --:--:-- 13548
2026-09-01T23:31:40.3178246Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:40.3178433Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:40.3178549Z 
2026-09-01T23:31:40.3646514Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:40.3647168Z 100  1768    0  1768    0     0  38434      0 --:--:-- --:--:-- --:--:-- 38434
2026-09-01T23:31:40.3647491Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:40.3647774Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:40.3647920Z 
2026-09-01T23:31:40.4148173Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:40.4148802Z 100  1002    0  1002    0     0  20448      0 --:--:-- --:--:-- --:--:-- 20448
2026-09-01T23:31:40.4149074Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:40.4149395Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:40.4149488Z 
2026-09-01T23:31:40.4757109Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:40.4757534Z 100  1022    0  1022    0     0  17033      0 --:--:-- --:--:-- --:--:-- 17033
2026-09-01T23:31:40.4757816Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:40.4758578Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:40.4758675Z 
2026-09-01T23:31:40.4956823Z ##[debug]Agent environment resources - Disk: / Available 72032.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 57.69%
2026-09-01T23:31:40.6255561Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:40.6256078Z 100  325k    0  325k    0     0  2181k      0 --:--:-- --:--:-- --:--:-- 2181k
2026-09-01T23:31:40.6256306Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:40.6256514Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:40.6256921Z 
2026-09-01T23:31:40.6781039Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:40.6781495Z 100  1169    0  1169    0     0  22480      0 --:--:-- --:--:-- --:--:-- 22480
2026-09-01T23:31:40.6781861Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:40.6783079Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:40.6783181Z 
2026-09-01T23:31:40.7255919Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:40.7256290Z 100  1026    0  1026    0     0  21829      0 --:--:-- --:--:-- --:--:-- 21375
2026-09-01T23:31:40.7256564Z 100  2322    0  2322    0     0  49404      0 --:--:-- --:--:-- --:--:-- 48375
2026-09-01T23:31:40.7256779Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:40.7257317Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:40.7257384Z 
2026-09-01T23:31:40.7914814Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:40.7922200Z 100  1174    0  1174    0     0  18061      0 --:--:-- --:--:-- --:--:-- 18061
2026-09-01T23:31:40.7922710Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:40.7922902Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:40.7922999Z 
2026-09-01T23:31:40.8446468Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:40.8446877Z 100 17703    0 17703    0     0   332k      0 --:--:-- --:--:-- --:--:--  332k
2026-09-01T23:31:40.8458795Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:40.8459739Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:40.8459890Z 
2026-09-01T23:31:40.9381513Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:40.9382089Z 100   768    0   768    0     0   8258      0 --:--:-- --:--:-- --:--:--  8258
2026-09-01T23:31:40.9382311Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:40.9382499Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:40.9382560Z 
2026-09-01T23:31:40.9895453Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:40.9895957Z 100  8394    0  8394    0     0   160k      0 --:--:-- --:--:-- --:--:--  160k
2026-09-01T23:31:40.9921952Z SISPI-med-orquestrador
2026-09-01T23:31:40.9924446Z ##[debug]Processed: ##vso[task.setvariable variable=REPO_FINAL_NAME;]SISPI-med-orquestrador
2026-09-01T23:31:40.9935685Z ##[debug]Exit code 0 received from tool '/usr/bin/bash'
2026-09-01T23:31:40.9938299Z ##[debug]STDIO streams have closed for tool '/usr/bin/bash'
2026-09-01T23:31:40.9946135Z ##[debug]task result: Succeeded
2026-09-01T23:31:40.9948441Z ##[debug]Processed: ##vso[task.complete result=Succeeded;done=true;]
2026-09-01T23:31:40.9990757Z ##[section]Finishing: Recuperando nome do repositório



2026-09-01T23:31:41.0016475Z ##[debug]Evaluating condition for step: 'Convertendo Minúsculo e Definindo nome do Projeto/Repositório'
2026-09-01T23:31:41.0017755Z ##[debug]Evaluating: succeeded()
2026-09-01T23:31:41.0018078Z ##[debug]Evaluating succeeded:
2026-09-01T23:31:41.0018554Z ##[debug]=> True
2026-09-01T23:31:41.0018878Z ##[debug]Result: True
2026-09-01T23:31:41.0019177Z ##[section]Starting: Convertendo Minúsculo e Definindo nome do Projeto/Repositório
2026-09-01T23:31:41.0025210Z ==============================================================================
2026-09-01T23:31:41.0025365Z Task         : Bash
2026-09-01T23:31:41.0025410Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-01T23:31:41.0025493Z Version      : 3.227.0
2026-09-01T23:31:41.0025576Z Author       : Microsoft Corporation
2026-09-01T23:31:41.0025630Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-01T23:31:41.0025785Z ==============================================================================
2026-09-01T23:31:41.0817444Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-09-01T23:31:41.1516525Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-09-01T23:31:41.1523427Z ##[debug]loading inputs and endpoints
2026-09-01T23:31:41.1530336Z ##[debug]loading INPUT_TARGETTYPE
2026-09-01T23:31:41.1537662Z ##[debug]loading INPUT_FILEPATH
2026-09-01T23:31:41.1538785Z ##[debug]loading INPUT_SCRIPT
2026-09-01T23:31:41.1539441Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-09-01T23:31:41.1540102Z ##[debug]loading INPUT_FAILONSTDERR
2026-09-01T23:31:41.1540936Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-09-01T23:31:41.1541621Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-09-01T23:31:41.1543846Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-09-01T23:31:41.1548177Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-09-01T23:31:41.1549822Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-09-01T23:31:41.1551222Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-09-01T23:31:41.1553221Z ##[debug]loading SECRET_AZPAT
2026-09-01T23:31:41.1554485Z ##[debug]loading SECRET_PASSWORD_CGC
2026-09-01T23:31:41.1555830Z ##[debug]loading SECRET_BT_CLIENT_SECRET
2026-09-01T23:31:41.1556233Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-09-01T23:31:41.1562766Z ##[debug]loading SECRET_OCP_TOKEN
2026-09-01T23:31:41.1563257Z ##[debug]loading SECRET_TOKEN_CRQ
2026-09-01T23:31:41.1563745Z ##[debug]loading SECRET_VAULT_LOCATION
2026-09-01T23:31:41.1564236Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-09-01T23:31:41.1564819Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-09-01T23:31:41.1565314Z ##[debug]loading SECRET_FORTIFY_PASS
2026-09-01T23:31:41.1565781Z ##[debug]loaded 21
2026-09-01T23:31:41.1566234Z ##[debug]Agent.ProxyUrl=undefined
2026-09-01T23:31:41.1566725Z ##[debug]Agent.CAInfo=undefined
2026-09-01T23:31:41.1567216Z ##[debug]Agent.ClientCert=undefined
2026-09-01T23:31:41.1567691Z ##[debug]Agent.SkipCertValidation=True
2026-09-01T23:31:41.1582061Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-01T23:31:41.1583389Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-01T23:31:41.1584275Z ##[debug]system.culture=en-US
2026-09-01T23:31:41.1592530Z ##[debug]failOnStderr=false
2026-09-01T23:31:41.1593179Z ##[debug]workingDirectory=/opt/ads-agent/_work/r926/a
2026-09-01T23:31:41.1593686Z ##[debug]check path : /opt/ads-agent/_work/r926/a
2026-09-01T23:31:41.1594451Z ##[debug]targetType=inline
2026-09-01T23:31:41.1594897Z ##[debug]bashEnvValue=undefined
2026-09-01T23:31:41.1596858Z ##[debug]script=BUILDNAME=` echo SISPI-med-orquestrador | tr '[[:upper:]]' '[[:lower:]]'`
  
echo "##vso[task.setvariable variable=BUILDNAME;]$BUILDNAME"

REPO=`echo _SISPI-med-orquestrador | sed 's/_//'`

RepositoryName=`echo "$REPO" | tr '[[:upper:]]' '[[:lower:]]'`

echo "##vso[task.setvariable variable=REPOSITORIO;]$RepositoryName"

ProjectName=`echo "$REPO" | tr '[[:upper:]]' '[[:lower:]]' | cut -f1 -d"-"`

echo "##vso[task.setvariable variable=PROJETO;]$ProjectName"

echo "Build.Repository.Name $REPO"
echo "PROJETO" $ProjectName
echo "REPOSITORIO" $RepositoryName

## Variaveis Monitoracao ##
if [[ $(sistema_ambiente) ]]
then

SistemaAmbiente=$(echo "$(sistema_ambiente)"| tr '[[:lower:]]' '[[:upper:]]')
echo "##vso[task.setvariable variable=SistemaAmbiente;]$SistemaAmbiente"

else

SistemaAmbiente=$(echo "des"| tr '[[:lower:]]' '[[:upper:]]')
echo "##vso[task.setvariable variable=SistemaAmbiente;]$SistemaAmbiente"

fi

if [[ $(sistema_nome) ]]
then

echo "##vso[task.setvariable variable=SistemaNome;]$(sistema_nome)"

else

echo "##vso[task.setvariable variable=SistemaNome;]$ProjectName"

fi

LowSistemaAmbiente=`echo $SistemaAmbiente | tr '[[:upper:]]' '[[:lower:]]'`

#if [[ -n "ocp_nprd" && "ocp_nprd" =~ "okd4" ]]
if echo "ocp_nprd" | egrep -q "^(okd4|ocp)"
then
  DEPLOYMENT="$RepositoryName-$LowSistemaAmbiente"
else
  DEPLOYMENT="$RepositoryName-$LowSistemaAmbiente-esteiras"
fi

echo "##vso[task.setvariable variable=DEPLOYMENT;]$DEPLOYMENT"
2026-09-01T23:31:41.1604583Z Generating script.
2026-09-01T23:31:41.1606459Z ##[debug]which 'bash'
2026-09-01T23:31:41.1613235Z ##[debug]found: '/usr/bin/bash'
2026-09-01T23:31:41.1613951Z ##[debug]Agent.Version=3.236.1
2026-09-01T23:31:41.1614450Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-09-01T23:31:41.1614942Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-09-01T23:31:41.1617316Z ========================== Starting Command Output ===========================
2026-09-01T23:31:41.1618415Z ##[debug]which '/usr/bin/bash'
2026-09-01T23:31:41.1619384Z ##[debug]found: '/usr/bin/bash'
2026-09-01T23:31:41.1620094Z ##[debug]/usr/bin/bash arg: /opt/ads-agent/_work/_temp/2d432f40-24a0-48d3-916b-155524b7cb39.sh
2026-09-01T23:31:41.1623067Z ##[debug]exec tool: /usr/bin/bash
2026-09-01T23:31:41.1623572Z ##[debug]arguments:
2026-09-01T23:31:41.1624057Z ##[debug]   /opt/ads-agent/_work/_temp/2d432f40-24a0-48d3-916b-155524b7cb39.sh
2026-09-01T23:31:41.1625342Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/2d432f40-24a0-48d3-916b-155524b7cb39.sh
2026-09-01T23:31:41.1724939Z ##[debug]Processed: ##vso[task.setvariable variable=BUILDNAME;]sispi-med-orquestrador
2026-09-01T23:31:41.1779667Z ##[debug]Processed: ##vso[task.setvariable variable=REPOSITORIO;]sispi-med-orquestrador
2026-09-01T23:31:41.1809032Z ##[debug]Processed: ##vso[task.setvariable variable=PROJETO;]sispi
2026-09-01T23:31:41.1809718Z Build.Repository.Name SISPI-med-orquestrador
2026-09-01T23:31:41.1810018Z PROJETO sispi
2026-09-01T23:31:41.1810914Z REPOSITORIO sispi-med-orquestrador
2026-09-01T23:31:41.1814171Z /opt/ads-agent/_work/_temp/2d432f40-24a0-48d3-916b-155524b7cb39.sh: line 20: sistema_ambiente: command not found
2026-09-01T23:31:41.1847153Z ##[debug]Processed: ##vso[task.setvariable variable=SistemaAmbiente;]DES
2026-09-01T23:31:41.1847770Z /opt/ads-agent/_work/_temp/2d432f40-24a0-48d3-916b-155524b7cb39.sh: line 33: sistema_nome: command not found
2026-09-01T23:31:41.1848259Z ##[debug]Processed: ##vso[task.setvariable variable=SistemaNome;]sispi
2026-09-01T23:31:41.1912994Z ##[debug]Processed: ##vso[task.setvariable variable=DEPLOYMENT;]sispi-med-orquestrador-des
2026-09-01T23:31:41.1920619Z ##[debug]Exit code 0 received from tool '/usr/bin/bash'
2026-09-01T23:31:41.1924009Z ##[debug]STDIO streams have closed for tool '/usr/bin/bash'
2026-09-01T23:31:41.1929547Z ##[debug]task result: Succeeded
2026-09-01T23:31:41.1931203Z ##[debug]Processed: ##vso[task.complete result=Succeeded;done=true;]
2026-09-01T23:31:41.1966283Z ##[section]Finishing: Convertendo Minúsculo e Definindo nome do Projeto/Repositório


2026-09-01T23:31:41.1989976Z ##[debug]Evaluating condition for step: 'Git clone https://devops.caixa/projetos/Infraestrutura/_git/esteira-logs'
2026-09-01T23:31:41.1990977Z ##[debug]Evaluating: succeeded()
2026-09-01T23:31:41.1991185Z ##[debug]Evaluating succeeded:
2026-09-01T23:31:41.1991591Z ##[debug]=> True
2026-09-01T23:31:41.1991800Z ##[debug]Result: True
2026-09-01T23:31:41.1992075Z ##[section]Starting: Git clone https://devops.caixa/projetos/Infraestrutura/_git/esteira-logs
2026-09-01T23:31:41.1996222Z ==============================================================================
2026-09-01T23:31:41.1996353Z Task         : Bash
2026-09-01T23:31:41.1996399Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-01T23:31:41.1996463Z Version      : 3.227.0
2026-09-01T23:31:41.1996529Z Author       : Microsoft Corporation
2026-09-01T23:31:41.1996584Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-01T23:31:41.1996715Z ==============================================================================
2026-09-01T23:31:41.2729110Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-09-01T23:31:41.3423089Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-09-01T23:31:41.3430888Z ##[debug]loading inputs and endpoints
2026-09-01T23:31:41.3438209Z ##[debug]loading INPUT_TARGETTYPE
2026-09-01T23:31:41.3446135Z ##[debug]loading INPUT_FILEPATH
2026-09-01T23:31:41.3446726Z ##[debug]loading INPUT_SCRIPT
2026-09-01T23:31:41.3447550Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-09-01T23:31:41.3448207Z ##[debug]loading INPUT_FAILONSTDERR
2026-09-01T23:31:41.3448893Z ##[debug]loading INPUT_NOPROFILE
2026-09-01T23:31:41.3449355Z ##[debug]loading INPUT_NORC
2026-09-01T23:31:41.3451766Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-09-01T23:31:41.3452503Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-09-01T23:31:41.3453889Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-09-01T23:31:41.3459396Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-09-01T23:31:41.3461532Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-09-01T23:31:41.3463679Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-09-01T23:31:41.3464282Z ##[debug]loading SECRET_AZPAT
2026-09-01T23:31:41.3464741Z ##[debug]loading SECRET_PASSWORD_CGC
2026-09-01T23:31:41.3465388Z ##[debug]loading SECRET_BT_CLIENT_SECRET
2026-09-01T23:31:41.3466729Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-09-01T23:31:41.3467113Z ##[debug]loading SECRET_OCP_TOKEN
2026-09-01T23:31:41.3467649Z ##[debug]loading SECRET_TOKEN_CRQ
2026-09-01T23:31:41.3468149Z ##[debug]loading SECRET_VAULT_LOCATION
2026-09-01T23:31:41.3468695Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-09-01T23:31:41.3469302Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-09-01T23:31:41.3469923Z ##[debug]loading SECRET_FORTIFY_PASS
2026-09-01T23:31:41.3471064Z ##[debug]loaded 23
2026-09-01T23:31:41.3475582Z ##[debug]Agent.ProxyUrl=undefined
2026-09-01T23:31:41.3476203Z ##[debug]Agent.CAInfo=undefined
2026-09-01T23:31:41.3476678Z ##[debug]Agent.ClientCert=undefined
2026-09-01T23:31:41.3477128Z ##[debug]Agent.SkipCertValidation=True
2026-09-01T23:31:41.3490313Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-01T23:31:41.3492224Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-01T23:31:41.3500938Z ##[debug]system.culture=en-US
2026-09-01T23:31:41.3501234Z ##[debug]failOnStderr=false
2026-09-01T23:31:41.3501868Z ##[debug]workingDirectory=/opt/ads-agent/_work/r926/a
2026-09-01T23:31:41.3502247Z ##[debug]check path : /opt/ads-agent/_work/r926/a
2026-09-01T23:31:41.3502805Z ##[debug]targetType=inline
2026-09-01T23:31:41.3503238Z ##[debug]bashEnvValue=undefined
2026-09-01T23:31:41.3505208Z ##[debug]script=#!/bin/bash
export HTTPS_PROXY=""
export HTTP_PROXY=""

# Defina as informações do repositório e das credenciais
repository_url="https://devops.caixa/projetos/Infraestrutura/_git/esteira-logs"
branch_name="master"
username="s736639"
password="***"
token_64=`printf '%s:%s' "$username" "$password" | base64`
token_64=`echo $token_64 | tr -d '[:blank:]'`
git_folder=`echo  ${repository_url##*/}`
git_new_folder="/opt/ads-agent/esteira-logs"

dir_prefix=`dirname $git_new_folder`

cd  $dir_prefix

rm -Rf $git_folder $git_new_folder

# Realiza o clone do repositório
echo "Clonando o repositório..."
if ! git clone -c http.sslVerify=false -c http.extraHeader="Authorization: Basic $token_64" --single-branch --branch $branch_name $repository_url; then
    echo "Erro ao clonar o repositório."
    exit 1
fi

if [[ $git_new_folder != "" ]]; then
    mv $git_folder $git_new_folder
    git_folder=$git_new_folder
fi

cd $git_folder

# Realiza o fetch apenas da branch especificada
echo "Fazendo fetch da branch $branch_name..."
if ! git -c http.sslVerify=false -c http.extraHeader="Authorization: Basic $token_64" fetch origin -u $branch_name:$branch_name; then
    echo "Erro ao fazer fetch da branch."
    exit 1
fi

# Muda para a branch
echo "Mudando para a branch $branch_name..."
if ! git checkout $branch_name; then
    echo "Erro ao mudar para a branch."
    exit 1
fi
echo "Hash: "
git rev-parse HEAD
echo "Processo concluído."
2026-09-01T23:31:41.3512503Z Generating script.
2026-09-01T23:31:41.3514202Z ##[debug]which 'bash'
2026-09-01T23:31:41.3520397Z ##[debug]found: '/usr/bin/bash'
2026-09-01T23:31:41.3520801Z ##[debug]Agent.Version=3.236.1
2026-09-01T23:31:41.3521117Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-09-01T23:31:41.3521433Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-09-01T23:31:41.3523242Z ========================== Starting Command Output ===========================
2026-09-01T23:31:41.3524304Z ##[debug]which '/usr/bin/bash'
2026-09-01T23:31:41.3525286Z ##[debug]found: '/usr/bin/bash'
2026-09-01T23:31:41.3525847Z ##[debug]/usr/bin/bash arg: /opt/ads-agent/_work/_temp/70f1a879-34a8-41a6-93f8-acf72e70064d.sh
2026-09-01T23:31:41.3528664Z ##[debug]exec tool: /usr/bin/bash
2026-09-01T23:31:41.3529115Z ##[debug]arguments:
2026-09-01T23:31:41.3529428Z ##[debug]   /opt/ads-agent/_work/_temp/70f1a879-34a8-41a6-93f8-acf72e70064d.sh
2026-09-01T23:31:41.3530930Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/70f1a879-34a8-41a6-93f8-acf72e70064d.sh
2026-09-01T23:31:41.3698288Z Clonando o repositório...
2026-09-01T23:31:41.3710295Z Cloning into 'esteira-logs'...
2026-09-01T23:31:41.5094761Z mv: cannot move 'esteira-logs' to a subdirectory of itself, '/opt/ads-agent/esteira-logs/esteira-logs'
2026-09-01T23:31:41.5095196Z Fazendo fetch da branch master...
2026-09-01T23:31:41.5818400Z Mudando para a branch master...
2026-09-01T23:31:41.5845353Z Already on 'master'
2026-09-01T23:31:41.5847719Z Your branch is up to date with 'origin/master'.
2026-09-01T23:31:41.5850151Z Hash: 
2026-09-01T23:31:41.5866070Z 0dde411503b628b365adf425b64871df8d569d93
2026-09-01T23:31:41.5867557Z Processo concluído.
2026-09-01T23:31:41.5878427Z ##[debug]Exit code 0 received from tool '/usr/bin/bash'
2026-09-01T23:31:41.5881521Z ##[debug]STDIO streams have closed for tool '/usr/bin/bash'
2026-09-01T23:31:41.5886686Z ##[debug]task result: Succeeded
2026-09-01T23:31:41.5888144Z ##[debug]Processed: ##vso[task.complete result=Succeeded;done=true;]
2026-09-01T23:31:41.5926838Z ##[section]Finishing: Git clone https://devops.caixa/projetos/Infraestrutura/_git/esteira-logs



2026-09-01T23:31:41.5952530Z ##[debug]Evaluating condition for step: 'Cria Streams Graylog'
2026-09-01T23:31:41.5953213Z ##[debug]Evaluating: succeeded()
2026-09-01T23:31:41.5953415Z ##[debug]Evaluating succeeded:
2026-09-01T23:31:41.5953886Z ##[debug]=> True
2026-09-01T23:31:41.5954098Z ##[debug]Result: True
2026-09-01T23:31:41.5954405Z ##[section]Starting: Cria Streams Graylog
2026-09-01T23:31:41.5958396Z ==============================================================================
2026-09-01T23:31:41.5958515Z Task         : Python script
2026-09-01T23:31:41.5958565Z Description  : Run a Python file or inline script
2026-09-01T23:31:41.5958634Z Version      : 0.213.0
2026-09-01T23:31:41.5958722Z Author       : Microsoft Corporation
2026-09-01T23:31:41.5958776Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/python-script
2026-09-01T23:31:41.5958895Z ==============================================================================
2026-09-01T23:31:41.6707972Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-09-01T23:31:41.7385566Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-09-01T23:31:41.7393787Z ##[debug]loading inputs and endpoints
2026-09-01T23:31:41.7400222Z ##[debug]loading INPUT_SCRIPTSOURCE
2026-09-01T23:31:41.7407448Z ##[debug]loading INPUT_SCRIPTPATH
2026-09-01T23:31:41.7408450Z ##[debug]loading INPUT_ARGUMENTS
2026-09-01T23:31:41.7409136Z ##[debug]loading INPUT_PYTHONINTERPRETER
2026-09-01T23:31:41.7409685Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-09-01T23:31:41.7410222Z ##[debug]loading INPUT_FAILONSTDERR
2026-09-01T23:31:41.7410940Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-09-01T23:31:41.7412986Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-09-01T23:31:41.7413730Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-09-01T23:31:41.7419091Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-09-01T23:31:41.7420710Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-09-01T23:31:41.7422646Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-09-01T23:31:41.7424175Z ##[debug]loading SECRET_AZPAT
2026-09-01T23:31:41.7425314Z ##[debug]loading SECRET_PASSWORD_CGC
2026-09-01T23:31:41.7425935Z ##[debug]loading SECRET_BT_CLIENT_SECRET
2026-09-01T23:31:41.7426555Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-09-01T23:31:41.7427208Z ##[debug]loading SECRET_OCP_TOKEN
2026-09-01T23:31:41.7427938Z ##[debug]loading SECRET_TOKEN_CRQ
2026-09-01T23:31:41.7428557Z ##[debug]loading SECRET_VAULT_LOCATION
2026-09-01T23:31:41.7429026Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-09-01T23:31:41.7429589Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-09-01T23:31:41.7430597Z ##[debug]loading SECRET_FORTIFY_PASS
2026-09-01T23:31:41.7431186Z ##[debug]loaded 22
2026-09-01T23:31:41.7435364Z ##[debug]Agent.ProxyUrl=undefined
2026-09-01T23:31:41.7435969Z ##[debug]Agent.CAInfo=undefined
2026-09-01T23:31:41.7436496Z ##[debug]Agent.ClientCert=undefined
2026-09-01T23:31:41.7437036Z ##[debug]Agent.SkipCertValidation=True
2026-09-01T23:31:41.7445229Z ##[debug]check path : /opt/ads-agent/_work/_tasks/PythonScript_6392f95f-7e76-4a18-b3c7-7f078d2f7700/0.213.0/task.json
2026-09-01T23:31:41.7447168Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/PythonScript_6392f95f-7e76-4a18-b3c7-7f078d2f7700/0.213.0/task.json
2026-09-01T23:31:41.7447930Z ##[debug]system.culture=en-US
2026-09-01T23:31:41.7455349Z ##[debug]scriptSource=filePath
2026-09-01T23:31:41.7456431Z ##[debug]scriptPath=/opt/ads-agent/esteira-logs/full_streams.py
2026-09-01T23:31:41.7457461Z ##[debug]script=undefined
2026-09-01T23:31:41.7458188Z ##[debug]arguments=***
2026-09-01T23:31:41.7458710Z ##[debug]pythonInterpreter=/usr/bin/python3
2026-09-01T23:31:41.7459135Z ##[debug]workingDirectory=/opt/ads-agent/_work/r926/a
2026-09-01T23:31:41.7459602Z ##[debug]failOnStderr=false
2026-09-01T23:31:41.7466827Z ##[debug]which '/usr/bin/python3'
2026-09-01T23:31:41.7469000Z ##[debug]found: '/usr/bin/python3'
2026-09-01T23:31:41.7469712Z ##[debug]/usr/bin/python3 arg: /opt/ads-agent/esteira-logs/full_streams.py
2026-09-01T23:31:41.7470377Z ##[debug]/usr/bin/python3 arg: ***
2026-09-01T23:31:41.7472010Z ##[debug]exec tool: /usr/bin/python3
2026-09-01T23:31:41.7472334Z ##[debug]arguments:
2026-09-01T23:31:41.7472715Z ##[debug]   /opt/ads-agent/esteira-logs/full_streams.py
2026-09-01T23:31:41.7473030Z ##[debug]   ***
2026-09-01T23:31:41.7473921Z [command]/usr/bin/python3 /opt/ads-agent/esteira-logs/full_streams.py ***
2026-09-01T23:31:45.0066838Z ##[debug]Processed: ##vso[task.setvariable variable=UNIDADE]BR
2026-09-01T23:31:45.0067171Z URL BASE:  http://10.122.154.249:9000/api/streams
2026-09-01T23:31:45.0067822Z ##[debug]Processed: ##vso[task.setvariable variable=ID_STREAM]692639eb7ce4c125631ce9fd
2026-09-01T23:31:45.0068356Z Stream: SISPI-OCP-DES
2026-09-01T23:31:45.0068535Z Stream ID: 692639eb7ce4c125631ce9fd
2026-09-01T23:31:45.0068683Z ====> ocp_nprd
2026-09-01T23:31:45.0068807Z URL BASE:  http://10.122.154.249:9000/api/streams
2026-09-01T23:31:45.0069299Z ##[debug]Processed: ##vso[task.setvariable variable=ID_STREAM]692639eb7ce4c125631ce9fd
2026-09-01T23:31:45.0069590Z Stream: SISPI-OCP-DES
2026-09-01T23:31:45.0069741Z Stream ID: 692639eb7ce4c125631ce9fd
2026-09-01T23:31:45.0069895Z ====> ocp_nprd
2026-09-01T23:31:45.0169868Z ##[debug]Exit code 0 received from tool '/usr/bin/python3'
2026-09-01T23:31:45.0172554Z ##[debug]STDIO streams have closed for tool '/usr/bin/python3'
2026-09-01T23:31:45.0179570Z ##[debug]task result: Succeeded
2026-09-01T23:31:45.0181649Z ##[debug]Processed: ##vso[task.complete result=Succeeded;]
2026-09-01T23:31:45.0217151Z ##[section]Finishing: Cria Streams Graylog



2026-09-01T23:31:45.0240222Z ##[debug]Evaluating condition for step: 'Recupera VEC'
2026-09-01T23:31:45.0241138Z ##[debug]Evaluating: succeeded()
2026-09-01T23:31:45.0241381Z ##[debug]Evaluating succeeded:
2026-09-01T23:31:45.0241818Z ##[debug]=> True
2026-09-01T23:31:45.0242156Z ##[debug]Result: True
2026-09-01T23:31:45.0242362Z ##[section]Starting: Recupera VEC
2026-09-01T23:31:45.0246277Z ==============================================================================
2026-09-01T23:31:45.0246361Z Task         : Bash
2026-09-01T23:31:45.0246764Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-01T23:31:45.0246853Z Version      : 3.227.0
2026-09-01T23:31:45.0246899Z Author       : Microsoft Corporation
2026-09-01T23:31:45.0246995Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-01T23:31:45.0247074Z ==============================================================================
2026-09-01T23:31:45.0653224Z ##[debug]Invoking Method: System.Threading.Tasks.Task <RunAsyncInternal>b__9(). Attempt count: 0
2026-09-01T23:31:45.1096661Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-09-01T23:31:45.1807457Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-09-01T23:31:45.1814488Z ##[debug]loading inputs and endpoints
2026-09-01T23:31:45.1822031Z ##[debug]loading INPUT_TARGETTYPE
2026-09-01T23:31:45.1829218Z ##[debug]loading INPUT_FILEPATH
2026-09-01T23:31:45.1830121Z ##[debug]loading INPUT_SCRIPT
2026-09-01T23:31:45.1831143Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-09-01T23:31:45.1833017Z ##[debug]loading INPUT_FAILONSTDERR
2026-09-01T23:31:45.1833405Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-09-01T23:31:45.1833880Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-09-01T23:31:45.1835123Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-09-01T23:31:45.1839882Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-09-01T23:31:45.1841273Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-09-01T23:31:45.1842797Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-09-01T23:31:45.1844651Z ##[debug]loading SECRET_AZPAT
2026-09-01T23:31:45.1846124Z ##[debug]loading SECRET_PASSWORD_CGC
2026-09-01T23:31:45.1848062Z ##[debug]loading SECRET_BT_CLIENT_SECRET
2026-09-01T23:31:45.1848549Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-09-01T23:31:45.1848881Z ##[debug]loading SECRET_OCP_TOKEN
2026-09-01T23:31:45.1849184Z ##[debug]loading SECRET_TOKEN_CRQ
2026-09-01T23:31:45.1849523Z ##[debug]loading SECRET_VAULT_LOCATION
2026-09-01T23:31:45.1850387Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-09-01T23:31:45.1851146Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-09-01T23:31:45.1853871Z ##[debug]loading SECRET_FORTIFY_PASS
2026-09-01T23:31:45.1854447Z ##[debug]loaded 21
2026-09-01T23:31:45.1856965Z ##[debug]Agent.ProxyUrl=undefined
2026-09-01T23:31:45.1857807Z ##[debug]Agent.CAInfo=undefined
2026-09-01T23:31:45.1858178Z ##[debug]Agent.ClientCert=undefined
2026-09-01T23:31:45.1858458Z ##[debug]Agent.SkipCertValidation=True
2026-09-01T23:31:45.1872841Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-01T23:31:45.1874293Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-01T23:31:45.1874718Z ##[debug]system.culture=en-US
2026-09-01T23:31:45.1882222Z ##[debug]failOnStderr=false
2026-09-01T23:31:45.1882997Z ##[debug]workingDirectory=/opt/ads-agent/_work/r926/a
2026-09-01T23:31:45.1884779Z ##[debug]check path : /opt/ads-agent/_work/r926/a
2026-09-01T23:31:45.1885834Z ##[debug]targetType=inline
2026-09-01T23:31:45.1886310Z ##[debug]bashEnvValue=undefined
2026-09-01T23:31:45.1887830Z ##[debug]script=#!/bin/bash

build_id=$BUILD_BUILDID
LOGS=`curl --connect-timeout 3 --max-time 7 --retry 5 --retry-delay 0 --retry-max-time 50 -X GET -u "s736639:***" "https://devops.caixa/projetos/Caixa/_apis/build/builds/$build_id?api-version=5.1" | jq -r '.logs.url'`

echo $LOGS

LOG_LIST=`curl --connect-timeout 3 --max-time 7 --retry 5 --retry-delay 0 --retry-max-time 50 -X GET -u "s736639:***" "$LOGS" |  jq -r '.value[].url' | sort -k11 -r -t/ -n`

VALIDA_VEC=`for log in "$LOG_LIST"; do curl --connect-timeout 3 --max-time 7 --retry 5 --retry-delay 0 --retry-max-time 50 -X GET -u "s736639:***" $log; done | grep "Valida VEC:" | tail -n1 | sed 's/"//g' | cut -d' ' -f 4`

echo $VALIDA_VEC
echo "##vso[task.setvariable variable=VALIDA_VEC;]$VALIDA_VEC"
2026-09-01T23:31:45.1893979Z Generating script.
2026-09-01T23:31:45.1895887Z ##[debug]which 'bash'
2026-09-01T23:31:45.1901531Z ##[debug]found: '/usr/bin/bash'
2026-09-01T23:31:45.1902183Z ##[debug]Agent.Version=3.236.1
2026-09-01T23:31:45.1903149Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-09-01T23:31:45.1903739Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-09-01T23:31:45.1905381Z ========================== Starting Command Output ===========================
2026-09-01T23:31:45.1906293Z ##[debug]which '/usr/bin/bash'
2026-09-01T23:31:45.1908250Z ##[debug]found: '/usr/bin/bash'
2026-09-01T23:31:45.1908624Z ##[debug]/usr/bin/bash arg: /opt/ads-agent/_work/_temp/80db6aaf-c22d-4cad-be1f-ee08f5a735b1.sh
2026-09-01T23:31:45.1909993Z ##[debug]exec tool: /usr/bin/bash
2026-09-01T23:31:45.1910377Z ##[debug]arguments:
2026-09-01T23:31:45.1910802Z ##[debug]   /opt/ads-agent/_work/_temp/80db6aaf-c22d-4cad-be1f-ee08f5a735b1.sh
2026-09-01T23:31:45.1912131Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/80db6aaf-c22d-4cad-be1f-ee08f5a735b1.sh
2026-09-01T23:31:45.2021573Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:45.2021898Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:45.2022216Z 
2026-09-01T23:31:45.2535396Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:45.2536060Z 100  4794  100  4794    0     0  94000      0 --:--:-- --:--:-- --:--:-- 94000
2026-09-01T23:31:45.2553316Z https://devops.caixa/projetos/98fe0311-ffd2-418a-9d0d-507043380abd/_apis/build/builds/812365/logs
2026-09-01T23:31:45.2598936Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:45.2599369Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:45.2599642Z 
2026-09-01T23:31:45.3188280Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:45.3189188Z 100  9598  100  9598    0     0   161k      0 --:--:-- --:--:-- --:--:--  161k
2026-09-01T23:31:45.3248841Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:45.3251064Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:45.3251163Z 
2026-09-01T23:31:45.3848070Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:45.3848426Z 100    37    0    37    0     0    627      0 --:--:-- --:--:-- --:--:--   627
2026-09-01T23:31:45.3848805Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:45.3849096Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:45.3849158Z 
2026-09-01T23:31:45.4967946Z ##[debug]Agent environment resources - Disk: / Available 72032.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 37.19%
2026-09-01T23:31:45.5285830Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:45.5286254Z 100  777k    0  777k    0     0  5434k      0 --:--:-- --:--:-- --:--:-- 5434k
2026-09-01T23:31:45.5286498Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:45.5286870Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:45.5287135Z 
2026-09-01T23:31:45.5704432Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:45.5706451Z 100   246    0   246    0     0   6000      0 --:--:-- --:--:-- --:--:--  6000
2026-09-01T23:31:45.5706708Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:45.5706901Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:45.5706964Z 
2026-09-01T23:31:45.6212971Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:45.6213621Z 100   924    0   924    0     0  18480      0 --:--:-- --:--:-- --:--:-- 18480
2026-09-01T23:31:45.6217036Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:45.6217360Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:45.6217502Z 
2026-09-01T23:31:45.6678358Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:45.6679037Z 100  1231    0  1231    0     0  26760      0 --:--:-- --:--:-- --:--:-- 26760
2026-09-01T23:31:45.6679501Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:45.6679686Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:45.6679746Z 
2026-09-01T23:31:45.7124209Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:45.7124564Z 100  1024    0  1024    0     0  23272      0 --:--:-- --:--:-- --:--:-- 22755
2026-09-01T23:31:45.7124831Z 100  8643    0  8643    0     0   191k      0 --:--:-- --:--:-- --:--:--  187k
2026-09-01T23:31:45.7126380Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:45.7126999Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:45.7127060Z 
2026-09-01T23:31:45.7613747Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:45.7614205Z 100  1143    0  1143    0     0  23812      0 --:--:-- --:--:-- --:--:-- 23812
2026-09-01T23:31:45.7614508Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:45.7615069Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:45.7615341Z 
2026-09-01T23:31:45.8152491Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:45.8153629Z 100 31140    0 31140    0     0   573k      0 --:--:-- --:--:-- --:--:--  573k
2026-09-01T23:31:45.8154252Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:45.8155172Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:45.8155333Z 
2026-09-01T23:31:45.8952165Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:45.8952540Z 100  1691    0  1691    0     0  21405      0 --:--:-- --:--:-- --:--:-- 21405
2026-09-01T23:31:45.8952815Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:45.8953008Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:45.8953076Z 
2026-09-01T23:31:45.9426574Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:45.9426948Z 100 92350    0 92350    0     0  1918k      0 --:--:-- --:--:-- --:--:-- 1918k
2026-09-01T23:31:45.9427169Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:45.9429028Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:45.9429130Z 
2026-09-01T23:31:45.9908598Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:45.9909100Z 100  1614    0  1614    0     0  34340      0 --:--:-- --:--:-- --:--:-- 34340
2026-09-01T23:31:45.9909326Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:45.9910863Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:45.9911092Z 
2026-09-01T23:31:46.0357116Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:46.0357611Z 100  1480    0  1480    0     0  33636      0 --:--:-- --:--:-- --:--:-- 33636
2026-09-01T23:31:46.0358029Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:46.0358240Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:46.0358445Z 
2026-09-01T23:31:46.1408018Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:46.1408439Z 100  1160    0  1160    0     0  11153      0 --:--:-- --:--:-- --:--:-- 11153
2026-09-01T23:31:46.1408655Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:46.1408845Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:46.1409217Z 
2026-09-01T23:31:46.1816032Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:46.1816391Z 100  1213    0  1213    0     0  30325      0 --:--:-- --:--:-- --:--:-- 30325
2026-09-01T23:31:46.1816627Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:46.1816920Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:46.1816985Z 
2026-09-01T23:31:46.2239952Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:46.2240782Z 100  1715    0  1715    0     0  40833      0 --:--:-- --:--:-- --:--:-- 40833
2026-09-01T23:31:46.2241025Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:46.2241226Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:46.2241286Z 
2026-09-01T23:31:46.2729571Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:46.2730136Z 100  1536    0  1536    0     0  32000      0 --:--:-- --:--:-- --:--:-- 32000
2026-09-01T23:31:46.2730358Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:46.2731847Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:46.2732274Z 
2026-09-01T23:31:46.3238628Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:46.3239290Z 100 60479    0 60479    0     0  1181k      0 --:--:-- --:--:-- --:--:-- 1181k
2026-09-01T23:31:46.3241278Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:46.3241606Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:46.3241765Z 
2026-09-01T23:31:46.3730929Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:46.3731417Z 100  1060    0  1060    0     0  22083      0 --:--:-- --:--:-- --:--:-- 22083
2026-09-01T23:31:46.3731672Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:46.3732128Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:46.3732231Z 
2026-09-01T23:31:46.4248669Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:46.4249038Z 100  1105    0  1105    0     0  21666      0 --:--:-- --:--:-- --:--:-- 21666
2026-09-01T23:31:46.4249256Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:46.4249499Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:46.4249558Z 
2026-09-01T23:31:46.4741099Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:46.4741868Z 100   372    0   372    0     0   7750      0 --:--:-- --:--:-- --:--:--  7750
2026-09-01T23:31:46.4742106Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:46.4744029Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:46.4744152Z 
2026-09-01T23:31:46.5897519Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:46.5898170Z 100   446    0   446    0     0   3878      0 --:--:-- --:--:-- --:--:--  3878
2026-09-01T23:31:46.5898464Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:46.5900813Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:46.5901034Z 
2026-09-01T23:31:46.6401154Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:46.6401519Z 100   446    0   446    0     0   9102      0 --:--:-- --:--:-- --:--:--  9102
2026-09-01T23:31:46.6401742Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:46.6402238Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:46.6402308Z 
2026-09-01T23:31:46.6874310Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:46.6875118Z 100   446    0   446    0     0   9695      0 --:--:-- --:--:-- --:--:--  9695
2026-09-01T23:31:46.6875556Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:46.6875887Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:46.6876428Z 
2026-09-01T23:31:46.7347781Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:46.7348399Z 100   446    0   446    0     0   9695      0 --:--:-- --:--:-- --:--:--  9489
2026-09-01T23:31:46.7348885Z 100   446    0   446    0     0   9489      0 --:--:-- --:--:-- --:--:--  9291
2026-09-01T23:31:46.7349807Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:46.7350618Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:46.7350813Z 
2026-09-01T23:31:46.7731837Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:46.7732512Z 100   292    0   292    0     0   7891      0 --:--:-- --:--:-- --:--:--  7891
2026-09-01T23:31:46.7732726Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:46.7732918Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:46.7732980Z 
2026-09-01T23:31:46.8025591Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:46.8026481Z 100   292    0   292    0     0  10068      0 --:--:-- --:--:-- --:--:-- 10068
2026-09-01T23:31:46.8026700Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:46.8027485Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:46.8027836Z 
2026-09-01T23:31:46.8402303Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:46.8402849Z 100   292    0   292    0     0   7891      0 --:--:-- --:--:-- --:--:--  7891
2026-09-01T23:31:46.8403191Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:46.8403707Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:46.8403953Z 
2026-09-01T23:31:46.8885242Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:46.8885622Z 100   366    0   366    0     0   7787      0 --:--:-- --:--:-- --:--:--  7787
2026-09-01T23:31:46.8885839Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:46.8886023Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:46.8886085Z 
2026-09-01T23:31:46.9380021Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:46.9380857Z 100  1619    0  1619    0     0  33040      0 --:--:-- --:--:-- --:--:-- 33040
2026-09-01T23:31:46.9381081Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:46.9381569Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:46.9381658Z 
2026-09-01T23:31:47.0406291Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:47.0406795Z 100  215k    0  215k    0     0  2113k      0 --:--:-- --:--:-- --:--:-- 2113k
2026-09-01T23:31:47.0407011Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:47.0407582Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:47.0885814Z 
2026-09-01T23:31:47.0886860Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:47.0887149Z 100  1111    0  1111    0     0  23638      0 --:--:-- --:--:-- --:--:-- 23638
2026-09-01T23:31:47.0888027Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:47.0888683Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:47.0888742Z 
2026-09-01T23:31:47.2086215Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:47.2086652Z 100  1768    0  1768    0     0  14857      0 --:--:-- --:--:-- --:--:-- 14857
2026-09-01T23:31:47.2086983Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:47.2087180Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:47.2087242Z 
2026-09-01T23:31:47.3346021Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:47.3347595Z 100  1002    0  1002    0     0   8016      0 --:--:-- --:--:-- --:--:--  8016
2026-09-01T23:31:47.3347816Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:47.3348043Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:47.3348144Z 
2026-09-01T23:31:47.3939870Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:47.3940227Z 100  1022    0  1022    0     0  17322      0 --:--:-- --:--:-- --:--:-- 17322
2026-09-01T23:31:47.3940825Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:47.3941036Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:47.3941096Z 
2026-09-01T23:31:47.5994174Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:47.5994639Z 100  325k    0  325k    0     0  1585k      0 --:--:-- --:--:-- --:--:-- 1585k
2026-09-01T23:31:47.5994893Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:47.5995283Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:47.5995668Z 
2026-09-01T23:31:47.6573530Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:47.6574002Z 100  1169    0  1169    0     0  20508      0 --:--:-- --:--:-- --:--:-- 20508
2026-09-01T23:31:47.6574231Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:47.6574421Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:47.6574482Z 
2026-09-01T23:31:47.7094462Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:47.7094822Z 100  1026    0  1026    0     0  20117      0 --:--:-- --:--:-- --:--:-- 19730
2026-09-01T23:31:47.7095132Z 100  2322    0  2322    0     0  45529      0 --:--:-- --:--:-- --:--:-- 44653
2026-09-01T23:31:47.7095692Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:47.7095976Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:47.7096448Z 
2026-09-01T23:31:47.7654074Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:47.7654589Z 100  1174    0  1174    0     0  21345      0 --:--:-- --:--:-- --:--:-- 21345
2026-09-01T23:31:47.7654819Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:47.7655060Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:47.7655158Z 
2026-09-01T23:31:47.8163753Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:47.8164331Z 100 17703    0 17703    0     0   352k      0 --:--:-- --:--:-- --:--:--  352k
2026-09-01T23:31:47.8164841Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:47.8165048Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:47.8165393Z 
2026-09-01T23:31:47.8637390Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:47.8637728Z 100   768    0   768    0     0  16000      0 --:--:-- --:--:-- --:--:-- 16000
2026-09-01T23:31:47.8637939Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-09-01T23:31:47.8639157Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-09-01T23:31:47.8639259Z 
2026-09-01T23:31:47.9174547Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-09-01T23:31:47.9174908Z 100  8394    0  8394    0     0   154k      0 --:--:-- --:--:-- --:--:--  154k
2026-09-01T23:31:47.9209608Z false
2026-09-01T23:31:47.9210355Z ##[debug]Processed: ##vso[task.setvariable variable=VALIDA_VEC;]false
2026-09-01T23:31:47.9219551Z ##[debug]Exit code 0 received from tool '/usr/bin/bash'
2026-09-01T23:31:47.9222795Z ##[debug]STDIO streams have closed for tool '/usr/bin/bash'
2026-09-01T23:31:47.9228213Z ##[debug]task result: Succeeded
2026-09-01T23:31:47.9229603Z ##[debug]Processed: ##vso[task.complete result=Succeeded;done=true;]
2026-09-01T23:31:47.9274373Z ##[debug]PERF: RetryHelper Method:System.Threading.Tasks.Task <RunAsyncInternal>b__9() : took 2862.1964 ms
2026-09-01T23:31:47.9274837Z ##[debug]PERF WARNING: RetryHelper Method:System.Threading.Tasks.Task <RunAsyncInternal>b__9() : took 2862.1964 ms
2026-09-01T23:31:47.9275615Z ##[section]Finishing: Recupera VEC

2026-09-01T23:31:47.9298961Z ##[debug]Evaluating condition for step: 'VEC - Aferição'
2026-09-01T23:31:47.9299734Z ##[debug]Evaluating: succeeded()
2026-09-01T23:31:47.9299943Z ##[debug]Evaluating succeeded:
2026-09-01T23:31:47.9300356Z ##[debug]=> True
2026-09-01T23:31:47.9300659Z ##[debug]Result: True
2026-09-01T23:31:47.9300875Z ##[section]Starting: VEC - Aferição
2026-09-01T23:31:47.9304484Z ==============================================================================
2026-09-01T23:31:47.9304621Z Task         : Bash
2026-09-01T23:31:47.9304666Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-01T23:31:47.9304743Z Version      : 3.227.0
2026-09-01T23:31:47.9304828Z Author       : Microsoft Corporation
2026-09-01T23:31:47.9304883Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-01T23:31:47.9304981Z ==============================================================================
2026-09-01T23:31:48.0086617Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-09-01T23:31:48.0805707Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-09-01T23:31:48.0812960Z ##[debug]loading inputs and endpoints
2026-09-01T23:31:48.0820159Z ##[debug]loading INPUT_TARGETTYPE
2026-09-01T23:31:48.0827853Z ##[debug]loading INPUT_FILEPATH
2026-09-01T23:31:48.0829157Z ##[debug]loading INPUT_SCRIPT
2026-09-01T23:31:48.0829980Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-09-01T23:31:48.0830850Z ##[debug]loading INPUT_FAILONSTDERR
2026-09-01T23:31:48.0831596Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-09-01T23:31:48.0832353Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-09-01T23:31:48.0834081Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-09-01T23:31:48.0838799Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-09-01T23:31:48.0840168Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-09-01T23:31:48.0841745Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-09-01T23:31:48.0843624Z ##[debug]loading SECRET_AZPAT
2026-09-01T23:31:48.0845257Z ##[debug]loading SECRET_PASSWORD_CGC
2026-09-01T23:31:48.0846456Z ##[debug]loading SECRET_BT_CLIENT_SECRET
2026-09-01T23:31:48.0846944Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-09-01T23:31:48.0847645Z ##[debug]loading SECRET_OCP_TOKEN
2026-09-01T23:31:48.0848753Z ##[debug]loading SECRET_TOKEN_CRQ
2026-09-01T23:31:48.0849063Z ##[debug]loading SECRET_VAULT_LOCATION
2026-09-01T23:31:48.0849333Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-09-01T23:31:48.0849771Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-09-01T23:31:48.0851352Z ##[debug]loading SECRET_FORTIFY_PASS
2026-09-01T23:31:48.0851746Z ##[debug]loaded 21
2026-09-01T23:31:48.0856141Z ##[debug]Agent.ProxyUrl=undefined
2026-09-01T23:31:48.0857389Z ##[debug]Agent.CAInfo=undefined
2026-09-01T23:31:48.0857970Z ##[debug]Agent.ClientCert=undefined
2026-09-01T23:31:48.0858488Z ##[debug]Agent.SkipCertValidation=True
2026-09-01T23:31:48.0872183Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-01T23:31:48.0873832Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-01T23:31:48.0874201Z ##[debug]system.culture=en-US
2026-09-01T23:31:48.0881543Z ##[debug]failOnStderr=false
2026-09-01T23:31:48.0882282Z ##[debug]workingDirectory=/opt/ads-agent/_work/r926/a
2026-09-01T23:31:48.0882664Z ##[debug]check path : /opt/ads-agent/_work/r926/a
2026-09-01T23:31:48.0883879Z ##[debug]targetType=inline
2026-09-01T23:31:48.0884161Z ##[debug]bashEnvValue=undefined
2026-09-01T23:31:48.0886411Z ##[debug]script=if [ -z "$VALIDA_VEC" ]; 
then
	echo "=============================================================================="
	echo "Checagem da VEC não se aplica, possíveis razões:"
	echo "- se trata de um produto"
	echo "- pacote foi gerado antes do lançamento da CE GEQTI 011/2024"
	echo "- a pipeline de build não utiliza uma task criada pela CESTI"
	exit 0
fi

if [ -z "$BYPASS" ]; 
then
	BYPASS="false"
fi

echo "=============================================================================="
echo "Resultado da validação: $VALIDA_VEC"
echo "Branch/Tag: $BUILD_SOURCEBRANCH"
echo "Stage selecionado: EC DES"
##echo "exibindo false"
##bypass não existirá , conforme orientação da GEQTI04 - abril/2025 
BYPASS="false"

if [[ "EC DES" =~ (PRD|HMP|TQS) ]]; then
	shopt -u nocasematch
	if [[ false == true && "$BYPASS" == "false" ]]
		then
			echo "VEC $BUILD_SOURCEBRANCHNAME dentro do padrão estabelecido no PPDS, pacote apto a ser implantado em TQS/HMP/PRD"
			echo "##vso[task.complete result=Succeeded;]"
	elif [ "$BYPASS" == "true" ]
		then
			echo "##[section]BYPASS ativado para a esteira toda, bloqueio previsto para ocorrer a partir de 21/03/2025"
		else
			echo "##[error] VEC fora do padrão estabelecido no PPDS. Este pacote não pode ser implantado em TQS/HMP/PRD
##[error] Para mais informações acesse as urls:
##[error] https://devops.caixa/projetos/Caixa/_wiki/wikis/Caixa.wiki/1689/Valida%C3%A7%C3%A3o-da-VEC
##[error] https://caixa.sharepoint.com/sites/PPDS/SitePages/GCM_Diretrizes_Padrao_Baseline.aspx ou consulte a GEQTI04"
			echo "##vso[task.complete result=Failed;]"
		fi
	elif [[ ! "EC DES" =~ (PRD|HMP|TQS) ]] && [[ false == true ]]; then
			echo "VEC dentro do padrão estabelecido no PPDS, pacote apto a ser implantado em TQS/HMP/PRD"
			echo "##vso[task.complete result=Succeeded;]"
		else
			echo "##vso[task.logissue type=warning] Este pacote é oriundo de uma branch ou tag fora do padrão estabelecido no PPDS e não poderá ser implantado nos ambientes TQS/HMP/PRD."
			echo "##[warning] Por se tratar de deploy em ambiente DES, considere isso apenas um lembrete/aviso"
			echo "##vso[task.complete result=Succeeded;]"
fi
2026-09-01T23:31:48.0893790Z Generating script.
2026-09-01T23:31:48.0895668Z ##[debug]which 'bash'
2026-09-01T23:31:48.0901122Z ##[debug]found: '/usr/bin/bash'
2026-09-01T23:31:48.0901603Z ##[debug]Agent.Version=3.236.1
2026-09-01T23:31:48.0901941Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-09-01T23:31:48.0902324Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-09-01T23:31:48.0904676Z ========================== Starting Command Output ===========================
2026-09-01T23:31:48.0905902Z ##[debug]which '/usr/bin/bash'
2026-09-01T23:31:48.0906691Z ##[debug]found: '/usr/bin/bash'
2026-09-01T23:31:48.0907668Z ##[debug]/usr/bin/bash arg: /opt/ads-agent/_work/_temp/347b5d40-775a-4572-a723-4254caad4c12.sh
2026-09-01T23:31:48.0910277Z ##[debug]exec tool: /usr/bin/bash
2026-09-01T23:31:48.0910727Z ##[debug]arguments:
2026-09-01T23:31:48.0911187Z ##[debug]   /opt/ads-agent/_work/_temp/347b5d40-775a-4572-a723-4254caad4c12.sh
2026-09-01T23:31:48.0912903Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/347b5d40-775a-4572-a723-4254caad4c12.sh
2026-09-01T23:31:48.0969377Z ==============================================================================
2026-09-01T23:31:48.0969956Z Resultado da validação: false
2026-09-01T23:31:48.0970180Z Branch/Tag: refs/heads/develop-kafka
2026-09-01T23:31:48.0970364Z Stage selecionado: EC DES
2026-09-01T23:31:48.0992195Z ##[warning] Este pacote é oriundo de uma branch ou tag fora do padrão estabelecido no PPDS e não poderá ser implantado nos ambientes TQS/HMP/PRD.
2026-09-01T23:31:48.0992957Z ##[debug]Processed: ##vso[task.logissue type=warning] Este pacote é oriundo de uma branch ou tag fora do padrão estabelecido no PPDS e não poderá ser implantado nos ambientes TQS/HMP/PRD.
2026-09-01T23:31:48.0993541Z ##[warning] Por se tratar de deploy em ambiente DES, considere isso apenas um lembrete/aviso
2026-09-01T23:31:48.0994310Z ##[debug]Processed: ##vso[task.complete result=Succeeded;]
2026-09-01T23:31:48.0994667Z ##[debug]Exit code 0 received from tool '/usr/bin/bash'
2026-09-01T23:31:48.0994990Z ##[debug]STDIO streams have closed for tool '/usr/bin/bash'
2026-09-01T23:31:48.0995330Z ##[debug]task result: Succeeded
2026-09-01T23:31:48.0996370Z ##[debug]Processed: ##vso[task.complete result=Succeeded;done=true;]
2026-09-01T23:31:48.1023438Z ##[section]Finishing: VEC - Aferição


2026-09-01T23:31:48.1060130Z ##[debug]Evaluating condition for step: 'Login OpenShift'
2026-09-01T23:31:48.1061061Z ##[debug]Evaluating: succeeded()
2026-09-01T23:31:48.1061371Z ##[debug]Evaluating succeeded:
2026-09-01T23:31:48.1061975Z ##[debug]=> True
2026-09-01T23:31:48.1062364Z ##[debug]Result: True
2026-09-01T23:31:48.1062667Z ##[section]Starting: Login OpenShift
2026-09-01T23:31:48.1067821Z ==============================================================================
2026-09-01T23:31:48.1067963Z Task         : Bash
2026-09-01T23:31:48.1068052Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-01T23:31:48.1068256Z Version      : 3.227.0
2026-09-01T23:31:48.1068334Z Author       : Microsoft Corporation
2026-09-01T23:31:48.1068476Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-01T23:31:48.1068608Z ==============================================================================
2026-09-01T23:31:48.1858650Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-09-01T23:31:48.2559525Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-09-01T23:31:48.2568253Z ##[debug]loading inputs and endpoints
2026-09-01T23:31:48.2575459Z ##[debug]loading INPUT_TARGETTYPE
2026-09-01T23:31:48.2584833Z ##[debug]loading INPUT_FILEPATH
2026-09-01T23:31:48.2587552Z ##[debug]loading INPUT_SCRIPT
2026-09-01T23:31:48.2591100Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-09-01T23:31:48.2591893Z ##[debug]loading INPUT_FAILONSTDERR
2026-09-01T23:31:48.2592366Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-09-01T23:31:48.2601309Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-09-01T23:31:48.2601653Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-09-01T23:31:48.2602056Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-09-01T23:31:48.2602390Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-09-01T23:31:48.2602673Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-09-01T23:31:48.2604994Z ##[debug]loading SECRET_AZPAT
2026-09-01T23:31:48.2607203Z ##[debug]loading SECRET_PASSWORD_CGC
2026-09-01T23:31:48.2609518Z ##[debug]loading SECRET_BT_CLIENT_SECRET
2026-09-01T23:31:48.2610313Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-09-01T23:31:48.2611657Z ##[debug]loading SECRET_OCP_TOKEN
2026-09-01T23:31:48.2612799Z ##[debug]loading SECRET_TOKEN_CRQ
2026-09-01T23:31:48.2613342Z ##[debug]loading SECRET_VAULT_LOCATION
2026-09-01T23:31:48.2614423Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-09-01T23:31:48.2615373Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-09-01T23:31:48.2617803Z ##[debug]loading SECRET_FORTIFY_PASS
2026-09-01T23:31:48.2618588Z ##[debug]loaded 21
2026-09-01T23:31:48.2623532Z ##[debug]Agent.ProxyUrl=undefined
2026-09-01T23:31:48.2624202Z ##[debug]Agent.CAInfo=undefined
2026-09-01T23:31:48.2624762Z ##[debug]Agent.ClientCert=undefined
2026-09-01T23:31:48.2625301Z ##[debug]Agent.SkipCertValidation=True
2026-09-01T23:31:48.2639165Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-01T23:31:48.2640970Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-01T23:31:48.2641321Z ##[debug]system.culture=en-US
2026-09-01T23:31:48.2649039Z ##[debug]failOnStderr=false
2026-09-01T23:31:48.2651263Z ##[debug]workingDirectory=/opt/ads-agent/_work/r926/a
2026-09-01T23:31:48.2651750Z ##[debug]check path : /opt/ads-agent/_work/r926/a
2026-09-01T23:31:48.2652435Z ##[debug]targetType=inline
2026-09-01T23:31:48.2653074Z ##[debug]bashEnvValue=undefined
2026-09-01T23:31:48.2655951Z ##[debug]script=#!/bin/bash
set -o errexit
set -o pipefail

if [ "$SITE" == ctc_nprd -a "$AMBIENTE" == prd ]
 then
   echo "A variável AMBIENTE foi informada como $AMBIENTE e SITE como $SITE"
   echo "Esse Fluxo não é permitido"
   echo "Verifique as variáveis AMBIENTE e SITE"
   exit 1
fi

shopt -s extglob
CLUSTER="${AMBIENTE}_${SITE}"

case "${CLUSTER,,}" in
  # OKD 4
  +(des|tqs|hmp)_okd4_nprd)
    echo "OKD4 NPRD - des, tqs ou hmp"
	_okd_api=$(OKD_4_API)
	_okd_token=$(OKD_4_TOKEN)
    ;;
	
  prd_okd4_prd)
    echo "ODK4 CTC_NPCN - prd"
	_okd_api=$(OKD_4_API_APL)
	_okd_token=$(OKD_4_TOKEN_APL)
    ;;

  # OCP
  +(des|tqs|hmp)_ocp_nprd)
    echo "OCP NPRD - des, tqs ou hmp"
	_okd_api=api.pixnprd4.caixa:6443
	_okd_token=***
    ;;

  prd_ocp_loterias)
    echo "OCP LOTERIAS PRD - prd"
	_okd_api=$(OCP_LOTERIAS_API_PRD)
	_okd_token=$(OCP_LOTERIAS_TOKEN_PRD)
    ;;
	
  prd_ocp_prd)
    echo "OCP PRD - prd"
	_okd_api=$(OCP_API_PRD)
	_okd_token=$(OCP_TOKEN_PRD)
    ;;

  # OPENSHIFT-LOTERIAS
  +(des|tqs|hmp)_openshift_nprd_loterias)
    echo "OPENSHIFT NPRD LOTERIAS - des, tqs ou hmp"
	_okd_api=$(OPENSHIFT_LOTERIAS_API_NPRD)
	_okd_token=$(OPENSHIFT_LOTERIAS_TOKEN_NPRD)
    ;;

  prd_openshift_prd_loterias)
    echo "OPENSHIFT LOTERIAS - prd"
	_okd_api=$(OPENSHIFT_LOTERIAS_API_PRD)
	_okd_token=$(OPENSHIFT_LOTERIAS_TOKEN_PRD)
    ;;

  # IBMCLOUD	
  *_ibmcloud)
    echo "IBM CLOUD"
	_okd_api=$(OCP_API_IBMCLOUD)
	_okd_token=$(OCP_TOKEN_IBMCLOUD)
    ;;
  *)
	echo "Não encontrei o cluster para logar"
    exit 1 ;;
esac

oc login "$_okd_api" --insecure-skip-tls-verify=true --token="$_okd_token" > /dev/null
2026-09-01T23:31:48.2662641Z Generating script.
2026-09-01T23:31:48.2664419Z ##[debug]which 'bash'
2026-09-01T23:31:48.2670041Z ##[debug]found: '/usr/bin/bash'
2026-09-01T23:31:48.2670767Z ##[debug]Agent.Version=3.236.1
2026-09-01T23:31:48.2671129Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-09-01T23:31:48.2671447Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-09-01T23:31:48.2673642Z ========================== Starting Command Output ===========================
2026-09-01T23:31:48.2674909Z ##[debug]which '/usr/bin/bash'
2026-09-01T23:31:48.2675457Z ##[debug]found: '/usr/bin/bash'
2026-09-01T23:31:48.2676200Z ##[debug]/usr/bin/bash arg: /opt/ads-agent/_work/_temp/e079bde4-8de5-44a7-b296-df7a2cfccb33.sh
2026-09-01T23:31:48.2678507Z ##[debug]exec tool: /usr/bin/bash
2026-09-01T23:31:48.2678836Z ##[debug]arguments:
2026-09-01T23:31:48.2679124Z ##[debug]   /opt/ads-agent/_work/_temp/e079bde4-8de5-44a7-b296-df7a2cfccb33.sh
2026-09-01T23:31:48.2680739Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/e079bde4-8de5-44a7-b296-df7a2cfccb33.sh
2026-09-01T23:31:48.2739557Z OCP NPRD - des, tqs ou hmp
2026-09-01T23:31:48.5267166Z ##[debug]Exit code 0 received from tool '/usr/bin/bash'
2026-09-01T23:31:48.5268841Z ##[debug]STDIO streams have closed for tool '/usr/bin/bash'
2026-09-01T23:31:48.5274617Z ##[debug]task result: Succeeded
2026-09-01T23:31:48.5276641Z ##[debug]Processed: ##vso[task.complete result=Succeeded;done=true;]
2026-09-01T23:31:48.5314312Z ##[section]Finishing: Login OpenShift



2026-09-01T23:31:48.5340277Z ##[debug]Evaluating condition for step: 'Exportando Variáveis de Ambiente "_ENV."'
2026-09-01T23:31:48.5341865Z ##[debug]Evaluating: succeeded()
2026-09-01T23:31:48.5342232Z ##[debug]Evaluating succeeded:
2026-09-01T23:31:48.5343203Z ##[debug]=> True
2026-09-01T23:31:48.5343586Z ##[debug]Result: True
2026-09-01T23:31:48.5343866Z ##[section]Starting: Exportando Variáveis de Ambiente "_ENV."
2026-09-01T23:31:48.5348979Z ==============================================================================
2026-09-01T23:31:48.5349157Z Task         : Bash
2026-09-01T23:31:48.5349215Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-01T23:31:48.5349321Z Version      : 3.227.0
2026-09-01T23:31:48.5349380Z Author       : Microsoft Corporation
2026-09-01T23:31:48.5349695Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-01T23:31:48.5349797Z ==============================================================================
2026-09-01T23:31:49.0566274Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-09-01T23:31:49.1301439Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-09-01T23:31:49.1308347Z ##[debug]loading inputs and endpoints
2026-09-01T23:31:49.1315206Z ##[debug]loading INPUT_TARGETTYPE
2026-09-01T23:31:49.1323323Z ##[debug]loading INPUT_FILEPATH
2026-09-01T23:31:49.1323815Z ##[debug]loading INPUT_SCRIPT
2026-09-01T23:31:49.1324700Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-09-01T23:31:49.1325227Z ##[debug]loading INPUT_FAILONSTDERR
2026-09-01T23:31:49.1325925Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-09-01T23:31:49.1326704Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-09-01T23:31:49.1328806Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-09-01T23:31:49.1333179Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-09-01T23:31:49.1334547Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-09-01T23:31:49.1335965Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-09-01T23:31:49.1337667Z ##[debug]loading SECRET_AZPAT
2026-09-01T23:31:49.1339107Z ##[debug]loading SECRET_PASSWORD_CGC
2026-09-01T23:31:49.1340230Z ##[debug]loading SECRET_BT_CLIENT_SECRET
2026-09-01T23:31:49.1340937Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-09-01T23:31:49.1341628Z ##[debug]loading SECRET_OCP_TOKEN
2026-09-01T23:31:49.1342202Z ##[debug]loading SECRET_TOKEN_CRQ
2026-09-01T23:31:49.1342766Z ##[debug]loading SECRET_VAULT_LOCATION
2026-09-01T23:31:49.1343320Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-09-01T23:31:49.1343880Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-09-01T23:31:49.1345300Z ##[debug]loading SECRET_FORTIFY_PASS
2026-09-01T23:31:49.1345682Z ##[debug]loaded 21
2026-09-01T23:31:49.1350125Z ##[debug]Agent.ProxyUrl=undefined
2026-09-01T23:31:49.1350373Z ##[debug]Agent.CAInfo=undefined
2026-09-01T23:31:49.1350682Z ##[debug]Agent.ClientCert=undefined
2026-09-01T23:31:49.1350926Z ##[debug]Agent.SkipCertValidation=True
2026-09-01T23:31:49.1366442Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-01T23:31:49.1367814Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-01T23:31:49.1368104Z ##[debug]system.culture=en-US
2026-09-01T23:31:49.1376162Z ##[debug]failOnStderr=false
2026-09-01T23:31:49.1377207Z ##[debug]workingDirectory=/opt/ads-agent/_work/r926/a
2026-09-01T23:31:49.1377489Z ##[debug]check path : /opt/ads-agent/_work/r926/a
2026-09-01T23:31:49.1378677Z ##[debug]targetType=inline
2026-09-01T23:31:49.1378915Z ##[debug]bashEnvValue=undefined
2026-09-01T23:31:49.1379677Z ##[debug]script=#!/bin/bash

IFS=$'\n'
var_split="-e"

for OUTPUT in `printenv | sort`
do
if [[ "$OUTPUT" =~ ^_ENV_.*  ]]; then

    Enviroment="${Enviroment} $var_split ${OUTPUT#"_ENV_"}"
    echo ${OUTPUT#"_ENV_"}
fi
done

echo "##vso[task.setvariable variable=Enviroment;]$Enviroment"
2026-09-01T23:31:49.1389589Z Generating script.
2026-09-01T23:31:49.1392494Z ##[debug]which 'bash'
2026-09-01T23:31:49.1399671Z ##[debug]found: '/usr/bin/bash'
2026-09-01T23:31:49.1400318Z ##[debug]Agent.Version=3.236.1
2026-09-01T23:31:49.1401340Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-09-01T23:31:49.1401795Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-09-01T23:31:49.1404461Z ========================== Starting Command Output ===========================
2026-09-01T23:31:49.1406080Z ##[debug]which '/usr/bin/bash'
2026-09-01T23:31:49.1407246Z ##[debug]found: '/usr/bin/bash'
2026-09-01T23:31:49.1408178Z ##[debug]/usr/bin/bash arg: /opt/ads-agent/_work/_temp/640e2502-399a-4d1c-956b-290a80a34df8.sh
2026-09-01T23:31:49.1411743Z ##[debug]exec tool: /usr/bin/bash
2026-09-01T23:31:49.1412137Z ##[debug]arguments:
2026-09-01T23:31:49.1412510Z ##[debug]   /opt/ads-agent/_work/_temp/640e2502-399a-4d1c-956b-290a80a34df8.sh
2026-09-01T23:31:49.1414462Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/640e2502-399a-4d1c-956b-290a80a34df8.sh
2026-09-01T23:31:49.1546517Z AZURE_SERVICEBUS_QUEUE_ENDPOINT=sb://servicebus-eds-nprd.servicebus.windows.net/
2026-09-01T23:31:49.1548141Z AZURE_SERVICEBUS_QUEUE_NAME="sigcn-med-atualizacaorelatosinfracao-status"
2026-09-01T23:31:49.1548638Z AZURE_SERVICEBUS_QUEUE_SHAREDACCESSKEY=
2026-09-01T23:31:49.1548865Z AZURE_SERVICEBUS_QUEUE_SHAREDACCESSKEYNAME=RootManageSharedAccessKey
2026-09-01T23:31:49.1549280Z JAVA_OPTIONS_APPEND="-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks"
2026-09-01T23:31:49.1549453Z KAFKA_BOOTSTRAP_PORT=443
2026-09-01T23:31:49.1549669Z KAFKA_BOOTSTRAP_SERVER="development-kafka-bootstrap-cp4i.apps.pixnprd4.caixa"
2026-09-01T23:31:49.1549854Z KAFKA_PASS='${SISPI_KAFKA}'
2026-09-01T23:31:49.1549969Z KAFKA_USER= dev
2026-09-01T23:31:49.1550110Z KEY_STORE_KAFKA_CLIENT_LOCATION=/deployments/sispi_user_keystore_kafka_des.p12
2026-09-01T23:31:49.1550336Z KEY_STORE_KAFKA_CLIENT_PASSWORD='${SISPI_USER_KEYSTORE}'
2026-09-01T23:31:49.1550582Z MQ_ANTIFRAUDE_CHANNEL=SISPI.SVRCONN
2026-09-01T23:31:49.1550742Z MQ_ANTIFRAUDE_FILA_NOTIFICACAO_INFRACAO=SIAAF.REQ.SISPI.PIX_NOTIFICACAO_INFRACAO
2026-09-01T23:31:49.1550962Z MQ_ANTIFRAUDE_HOSTNAME=10.116.95.99
2026-09-01T23:31:49.1551168Z MQ_ANTIFRAUDE_MAXIMO_CONEXOES=1
2026-09-01T23:31:49.1551293Z MQ_ANTIFRAUDE_MAXIMO_SESSOES=300
2026-09-01T23:31:49.1551417Z MQ_ANTIFRAUDE_PASSWORD=jh73wpqb
2026-09-01T23:31:49.1551532Z MQ_ANTIFRAUDE_PORT=1414
2026-09-01T23:31:49.1551647Z MQ_ANTIFRAUDE_QUEUE_MANAGER=XMQD1
2026-09-01T23:31:49.1551771Z MQ_ANTIFRAUDE_TIMEOUT=1000
2026-09-01T23:31:49.1551882Z MQ_ANTIFRAUDE_USERID=SSPIBD01
2026-09-01T23:31:49.1552015Z MQ_CONTROLE_TEMPO_CHANNEL=SISPI.SVRCONN
2026-09-01T23:31:49.1553743Z MQ_CONTROLE_TEMPO_FILA_REGISTRO_ANS=SISPI.REQ.REGISTRO_ANS
2026-09-01T23:31:49.1556153Z MQ_CONTROLE_TEMPO_HOSTNAME=10.116.95.99
2026-09-01T23:31:49.1556578Z MQ_CONTROLE_TEMPO_MAXIMO_CONEXOES=1
2026-09-01T23:31:49.1556733Z MQ_CONTROLE_TEMPO_MAXIMO_SESSOES=300
2026-09-01T23:31:49.1556863Z MQ_CONTROLE_TEMPO_PASSWORD=jh73wpqb
2026-09-01T23:31:49.1556988Z MQ_CONTROLE_TEMPO_PORT=1414
2026-09-01T23:31:49.1557114Z MQ_CONTROLE_TEMPO_QUEUE_MANAGER=XMQD1
2026-09-01T23:31:49.1557240Z MQ_CONTROLE_TEMPO_TIMEOUT=1000
2026-09-01T23:31:49.1557365Z MQ_CONTROLE_TEMPO_USERID=SSPIBD01
2026-09-01T23:31:49.1557581Z PIX_FRAMEWORK_TOKEN_CLIENT_ID=cli-ser-spi
2026-09-01T23:31:49.1557803Z PIX_FRAMEWORK_TOKEN_SECRET_ID=1938b188-42c7-4889-bf3a-7d95e4432fe9
2026-09-01T23:31:49.1558359Z PIX_FRAMEWORK_TOKEN_URL=https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token
2026-09-01T23:31:49.1558550Z PIX_FRAMEWORK_VALIDACAO_TOKEN_SSO_EMISSOR="https://login.des.caixa/auth/realms/intranet"
2026-09-01T23:31:49.1558871Z PIX_FRAMEWORK_VALIDACAO_TOKEN_SSO_URL="https://sispi-api-proxy-sso-des.apps.pixnprd4.caixa/auth/realms/intranet;https://login.des.caixa/auth/realms/intranet"
2026-09-01T23:31:49.1559580Z PIX_FRAMEWORK_VALIDACAO_TOKEN_VALIDACAO_GLOBAL=true
2026-09-01T23:31:49.1560082Z QUARKUS_DATASOURCE_JDBC_URL="jdbc:oracle:thin:@cnpexdadvm01-scan4.extra.caixa.gov.br:1521/CDBD08NGPDB017"
2026-09-01T23:31:49.1560907Z QUARKUS_DATASOURCE_PASSWORD=sspibd0303
2026-09-01T23:31:49.1561192Z QUARKUS_DATASOURCE_USERNAME=SSPIBD03
2026-09-01T23:31:49.1562113Z SIMPI_MED_URL=https://simpi-med-des.apps.pixnprd4.caixa
2026-09-01T23:31:49.1562577Z SISPI_API_KEY=l76138e827bd9d4f87aea4ff7f54a5607c
2026-09-01T23:31:49.1563372Z SISPI_API_MANAGER=https://api.des.caixa:8443
2026-09-01T23:31:49.1563813Z SISPI_ISPB_CAIXA=00360305
2026-09-01T23:31:49.1564700Z SISPI_LOGIN_CAIXA_INTRANET_URL="https://login.des.caixa/auth/realms/intranet"
2026-09-01T23:31:49.1566856Z TOPICO_MED_POLLING=PIX.MED.POLLING.EVENTO
2026-09-01T23:31:49.1567014Z TRUST_STORE_KAFKA_LOCATION=/deployments/keystore_event_streams.p12
2026-09-01T23:31:49.1567231Z TRUST_STORE_KAFKA_PASSWORD='${SISPI_KAFKA_TRUSTSTORE}'
2026-09-01T23:31:49.1571601Z ##[debug]Processed: ##vso[task.setvariable variable=Enviroment;] -e AZURE_SERVICEBUS_QUEUE_ENDPOINT=sb://servicebus-eds-nprd.servicebus.windows.net/ -e AZURE_SERVICEBUS_QUEUE_NAME="sigcn-med-atualizacaorelatosinfracao-status" -e AZURE_SERVICEBUS_QUEUE_SHAREDACCESSKEY== -e AZURE_SERVICEBUS_QUEUE_SHAREDACCESSKEYNAME=RootManageSharedAccessKey -e JAVA_OPTIONS_APPEND="-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks" -e KAFKA_BOOTSTRAP_PORT=443 -e KAFKA_BOOTSTRAP_SERVER="development-kafka-bootstrap-cp4i.apps.pixnprd4.caixa" -e KAFKA_PASS='${SISPI_KAFKA}' -e KAFKA_USER= dev -e KEY_STORE_KAFKA_CLIENT_LOCATION=/deployments/sispi_user_keystore_kafka_des.p12 -e KEY_STORE_KAFKA_CLIENT_PASSWORD='${SISPI_USER_KEYSTORE}' -e MQ_ANTIFRAUDE_CHANNEL=SISPI.SVRCONN -e MQ_ANTIFRAUDE_FILA_NOTIFICACAO_INFRACAO=SIAAF.REQ.SISPI.PIX_NOTIFICACAO_INFRACAO -e MQ_ANTIFRAUDE_HOSTNAME=10.116.95.99 -e MQ_ANTIFRAUDE_MAXIMO_CONEXOES=1 -e MQ_ANTIFRAUDE_MAXIMO_SESSOES=300 -e MQ_ANTIFRAUDE_PASSWORD=jh73wpqb -e MQ_ANTIFRAUDE_PORT=1414 -e MQ_ANTIFRAUDE_QUEUE_MANAGER=XMQD1 -e MQ_ANTIFRAUDE_TIMEOUT=1000 -e MQ_ANTIFRAUDE_USERID=SSPIBD01 -e MQ_CONTROLE_TEMPO_CHANNEL=SISPI.SVRCONN -e MQ_CONTROLE_TEMPO_FILA_REGISTRO_ANS=SISPI.REQ.REGISTRO_ANS -e MQ_CONTROLE_TEMPO_HOSTNAME=10.116.95.99 -e MQ_CONTROLE_TEMPO_MAXIMO_CONEXOES=1 -e MQ_CONTROLE_TEMPO_MAXIMO_SESSOES=300 -e MQ_CONTROLE_TEMPO_PASSWORD=jh73wpqb -e MQ_CONTROLE_TEMPO_PORT=1414 -e MQ_CONTROLE_TEMPO_QUEUE_MANAGER=XMQD1 -e MQ_CONTROLE_TEMPO_TIMEOUT=1000 -e MQ_CONTROLE_TEMPO_USERID=SSPIBD01 -e PIX_FRAMEWORK_TOKEN_CLIENT_ID=cli-ser-spi -e PIX_FRAMEWORK_TOKEN_SECRET_ID=1938b188-42c7-4889-bf3a-7d95e4432fe9 -e PIX_FRAMEWORK_TOKEN_URL=https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token -e PIX_FRAMEWORK_VALIDACAO_TOKEN_SSO_EMISSOR="https://login.des.caixa/auth/realms/intranet" -e PIX_FRAMEWORK_VALIDACAO_TOKEN_SSO_URL="https://sispi-api-proxy-sso-des.apps.pixnprd4.caixa/auth/realms/intranet;https://login.des.caixa/auth/realms/intranet" -e PIX_FRAMEWORK_VALIDACAO_TOKEN_VALIDACAO_GLOBAL=true -e QUARKUS_DATASOURCE_JDBC_URL="jdbc:oracle:thin:@cnpexdadvm01-scan4.extra.caixa.gov.br:1521/CDBD08NGPDB017" -e QUARKUS_DATASOURCE_PASSWORD=sspibd0303 -e QUARKUS_DATASOURCE_USERNAME=SSPIBD03 -e SIMPI_MED_URL=https://simpi-med-des.apps.pixnprd4.caixa -e SISPI_API_KEY=l76138e827bd9d4f87aea4ff7f54a5607c -e SISPI_API_MANAGER=https://api.des.caixa:8443 -e SISPI_ISPB_CAIXA=00360305 -e SISPI_LOGIN_CAIXA_INTRANET_URL="https://login.des.caixa/auth/realms/intranet" -e TOPICO_MED_POLLING=PIX.MED.POLLING.EVENTO -e TRUST_STORE_KAFKA_LOCATION=/deployments/keystore_event_streams.p12 -e TRUST_STORE_KAFKA_PASSWORD='${SISPI_KAFKA_TRUSTSTORE}'
2026-09-01T23:31:49.1576554Z ##[debug]Exit code 0 received from tool '/usr/bin/bash'
2026-09-01T23:31:49.1580037Z ##[debug]STDIO streams have closed for tool '/usr/bin/bash'
2026-09-01T23:31:49.1584666Z ##[debug]task result: Succeeded
2026-09-01T23:31:49.1585743Z ##[debug]Processed: ##vso[task.complete result=Succeeded;done=true;]
2026-09-01T23:31:49.1621246Z ##[section]Finishing: Exportando Variáveis de Ambiente "_ENV."



2026-09-01T23:31:49.1641525Z ##[debug]Evaluating condition for step: 'Criando novo Projeto'
2026-09-01T23:31:49.1642068Z ##[debug]Evaluating: succeeded()
2026-09-01T23:31:49.1642234Z ##[debug]Evaluating succeeded:
2026-09-01T23:31:49.1642550Z ##[debug]=> True
2026-09-01T23:31:49.1642719Z ##[debug]Result: True
2026-09-01T23:31:49.1642890Z ##[section]Starting: Criando novo Projeto
2026-09-01T23:31:49.1646053Z ==============================================================================
2026-09-01T23:31:49.1646141Z Task         : Bash
2026-09-01T23:31:49.1646186Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-01T23:31:49.1646251Z Version      : 3.227.0
2026-09-01T23:31:49.1646303Z Author       : Microsoft Corporation
2026-09-01T23:31:49.1646358Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-01T23:31:49.1646441Z ==============================================================================
2026-09-01T23:31:49.2269174Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-09-01T23:31:49.2957515Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-09-01T23:31:49.2964745Z ##[debug]loading inputs and endpoints
2026-09-01T23:31:49.2972056Z ##[debug]loading INPUT_TARGETTYPE
2026-09-01T23:31:49.2979258Z ##[debug]loading INPUT_FILEPATH
2026-09-01T23:31:49.2980362Z ##[debug]loading INPUT_SCRIPT
2026-09-01T23:31:49.2981163Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-09-01T23:31:49.2981836Z ##[debug]loading INPUT_FAILONSTDERR
2026-09-01T23:31:49.2982482Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-09-01T23:31:49.2983181Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-09-01T23:31:49.2985232Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-09-01T23:31:49.2990152Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-09-01T23:31:49.2991553Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-09-01T23:31:49.2992986Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-09-01T23:31:49.2994855Z ##[debug]loading SECRET_AZPAT
2026-09-01T23:31:49.2996227Z ##[debug]loading SECRET_PASSWORD_CGC
2026-09-01T23:31:49.2997463Z ##[debug]loading SECRET_BT_CLIENT_SECRET
2026-09-01T23:31:49.2997929Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-09-01T23:31:49.2998668Z ##[debug]loading SECRET_OCP_TOKEN
2026-09-01T23:31:49.2999396Z ##[debug]loading SECRET_TOKEN_CRQ
2026-09-01T23:31:49.2999781Z ##[debug]loading SECRET_VAULT_LOCATION
2026-09-01T23:31:49.3000265Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-09-01T23:31:49.3000912Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-09-01T23:31:49.3002403Z ##[debug]loading SECRET_FORTIFY_PASS
2026-09-01T23:31:49.3003437Z ##[debug]loaded 21
2026-09-01T23:31:49.3007835Z ##[debug]Agent.ProxyUrl=undefined
2026-09-01T23:31:49.3008107Z ##[debug]Agent.CAInfo=undefined
2026-09-01T23:31:49.3008370Z ##[debug]Agent.ClientCert=undefined
2026-09-01T23:31:49.3008631Z ##[debug]Agent.SkipCertValidation=True
2026-09-01T23:31:49.3022621Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-01T23:31:49.3024152Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-01T23:31:49.3024467Z ##[debug]system.culture=en-US
2026-09-01T23:31:49.3032181Z ##[debug]failOnStderr=false
2026-09-01T23:31:49.3032818Z ##[debug]workingDirectory=/opt/ads-agent/_work/r926/a
2026-09-01T23:31:49.3033109Z ##[debug]check path : /opt/ads-agent/_work/r926/a
2026-09-01T23:31:49.3034438Z ##[debug]targetType=inline
2026-09-01T23:31:49.3034703Z ##[debug]bashEnvValue=undefined
2026-09-01T23:31:49.3035630Z ##[debug]script=oc get project sispi-des
if [ "$?" -ne "0" ]; then
 oc new-project sispi-des
 oc adm policy add-scc-to-group anyuid system:serviceaccounts:sispi-des
fi
oc label namespace sispi-des createdby=ads --overwrite
oc label namespace sispi-des CGC_UNIDADE_DES=7390 --overwrite
oc label namespace sispi-des CGC_UNIDADE_OPS=7259 --overwrite

if [[ "$KIND_DEPLOY" != "deployment" ]]; then
    oc label netnamespace sispi-des projeto=sispi-des --overwrite
fi

if [ "$NODESELECTOR" == "ob" -a "des" == "prd" ]
then
    oc patch namespace sispi-des -p '{"metadata":{"annotations":{"openshift.io/node-selector":"sistema=ob"}}}'
fi

#if [[ "$AMBIENTE" == prd ]]; then
#
#   WILDCARD_APL=$(OKD_URL_SUFFIX_APL)
#   if [[ $WILDCARD_APL == ms.caixa ]]
#   then
#    echo oc label namespace sispi-des router=router-microservice
#  else
#   echo oc label namespace sispi-des router=router-default
#  fi
#fi
2026-09-01T23:31:49.3043725Z Generating script.
2026-09-01T23:31:49.3045555Z ##[debug]which 'bash'
2026-09-01T23:31:49.3051796Z ##[debug]found: '/usr/bin/bash'
2026-09-01T23:31:49.3053186Z ##[debug]Agent.Version=3.236.1
2026-09-01T23:31:49.3053469Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-09-01T23:31:49.3053747Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-09-01T23:31:49.3056536Z ========================== Starting Command Output ===========================
2026-09-01T23:31:49.3057740Z ##[debug]which '/usr/bin/bash'
2026-09-01T23:31:49.3059002Z ##[debug]found: '/usr/bin/bash'
2026-09-01T23:31:49.3059467Z ##[debug]/usr/bin/bash arg: /opt/ads-agent/_work/_temp/698b50ae-4052-4e99-96b5-c18f62bad9a1.sh
2026-09-01T23:31:49.3061955Z ##[debug]exec tool: /usr/bin/bash
2026-09-01T23:31:49.3062217Z ##[debug]arguments:
2026-09-01T23:31:49.3062492Z ##[debug]   /opt/ads-agent/_work/_temp/698b50ae-4052-4e99-96b5-c18f62bad9a1.sh
2026-09-01T23:31:49.3064040Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/698b50ae-4052-4e99-96b5-c18f62bad9a1.sh
2026-09-01T23:31:49.3940302Z NAME        DISPLAY NAME   STATUS
2026-09-01T23:31:49.3940816Z sispi-des                  Active
2026-09-01T23:31:49.4869715Z namespace/sispi-des not labeled
2026-09-01T23:31:49.6144197Z namespace/sispi-des not labeled
2026-09-01T23:31:49.7077313Z namespace/sispi-des not labeled
2026-09-01T23:31:49.7880989Z netnamespace.network.openshift.io/sispi-des not labeled
2026-09-01T23:31:49.7923850Z ##[debug]Exit code 0 received from tool '/usr/bin/bash'
2026-09-01T23:31:49.7927703Z ##[debug]STDIO streams have closed for tool '/usr/bin/bash'
2026-09-01T23:31:49.7935534Z ##[debug]task result: Succeeded
2026-09-01T23:31:49.7937266Z ##[debug]Processed: ##vso[task.complete result=Succeeded;done=true;]
2026-09-01T23:31:49.7986487Z ##[section]Finishing: Criando novo Projeto



2026-09-01T23:31:49.8006444Z ##[debug]Evaluating condition for step: 'Adicionando ISTIO_INJECTION'
2026-09-01T23:31:49.8011870Z ##[debug]Evaluating: and(succeeded(), eq(variables['ISTIO_INJECTION'], 'enabled'))
2026-09-01T23:31:49.8012094Z ##[debug]Evaluating and:
2026-09-01T23:31:49.8018269Z ##[debug]..Evaluating succeeded:
2026-09-01T23:31:49.8018690Z ##[debug]..=> True
2026-09-01T23:31:49.8018856Z ##[debug]..Evaluating eq:
2026-09-01T23:31:49.8019705Z ##[debug]....Evaluating indexer:
2026-09-01T23:31:49.8030662Z ##[debug]......Evaluating variables:
2026-09-01T23:31:49.8033152Z ##[debug]......=> Object
2026-09-01T23:31:49.8033848Z ##[debug]......Evaluating String:
2026-09-01T23:31:49.8034297Z ##[debug]......=> 'ISTIO_INJECTION'
2026-09-01T23:31:49.8036860Z ##[debug]....=> 'enabled'
2026-09-01T23:31:49.8037239Z ##[debug]....Evaluating String:
2026-09-01T23:31:49.8037461Z ##[debug]....=> 'enabled'
2026-09-01T23:31:49.8039861Z ##[debug]..=> True
2026-09-01T23:31:49.8040222Z ##[debug]=> True
2026-09-01T23:31:49.8041725Z ##[debug]Expanded: and(True, eq('enabled', 'enabled'))
2026-09-01T23:31:49.8041951Z ##[debug]Result: True
2026-09-01T23:31:49.8042158Z ##[section]Starting: Adicionando ISTIO_INJECTION
2026-09-01T23:31:49.8045539Z ==============================================================================
2026-09-01T23:31:49.8045620Z Task         : Bash
2026-09-01T23:31:49.8045665Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-01T23:31:49.8045737Z Version      : 3.227.0
2026-09-01T23:31:49.8045782Z Author       : Microsoft Corporation
2026-09-01T23:31:49.8045844Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-01T23:31:49.8046035Z ==============================================================================
2026-09-01T23:31:49.8596702Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-09-01T23:31:49.9302589Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-09-01T23:31:49.9309768Z ##[debug]loading inputs and endpoints
2026-09-01T23:31:49.9316715Z ##[debug]loading INPUT_TARGETTYPE
2026-09-01T23:31:49.9324258Z ##[debug]loading INPUT_FILEPATH
2026-09-01T23:31:49.9325276Z ##[debug]loading INPUT_SCRIPT
2026-09-01T23:31:49.9326194Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-09-01T23:31:49.9326748Z ##[debug]loading INPUT_FAILONSTDERR
2026-09-01T23:31:49.9327396Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-09-01T23:31:49.9328076Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-09-01T23:31:49.9330108Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-09-01T23:31:49.9334839Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-09-01T23:31:49.9336206Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-09-01T23:31:49.9337642Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-09-01T23:31:49.9339387Z ##[debug]loading SECRET_AZPAT
2026-09-01T23:31:49.9341012Z ##[debug]loading SECRET_PASSWORD_CGC
2026-09-01T23:31:49.9342324Z ##[debug]loading SECRET_BT_CLIENT_SECRET
2026-09-01T23:31:49.9342746Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-09-01T23:31:49.9343625Z ##[debug]loading SECRET_OCP_TOKEN
2026-09-01T23:31:49.9344015Z ##[debug]loading SECRET_TOKEN_CRQ
2026-09-01T23:31:49.9344665Z ##[debug]loading SECRET_VAULT_LOCATION
2026-09-01T23:31:49.9345206Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-09-01T23:31:49.9345767Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-09-01T23:31:49.9347332Z ##[debug]loading SECRET_FORTIFY_PASS
2026-09-01T23:31:49.9348250Z ##[debug]loaded 21
2026-09-01T23:31:49.9352363Z ##[debug]Agent.ProxyUrl=undefined
2026-09-01T23:31:49.9352624Z ##[debug]Agent.CAInfo=undefined
2026-09-01T23:31:49.9352882Z ##[debug]Agent.ClientCert=undefined
2026-09-01T23:31:49.9353121Z ##[debug]Agent.SkipCertValidation=True
2026-09-01T23:31:49.9367464Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-01T23:31:49.9369251Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-01T23:31:49.9369904Z ##[debug]system.culture=en-US
2026-09-01T23:31:49.9377373Z ##[debug]failOnStderr=false
2026-09-01T23:31:49.9378262Z ##[debug]workingDirectory=/opt/ads-agent/_work/r926/a
2026-09-01T23:31:49.9378604Z ##[debug]check path : /opt/ads-agent/_work/r926/a
2026-09-01T23:31:49.9379950Z ##[debug]targetType=inline
2026-09-01T23:31:49.9380339Z ##[debug]bashEnvValue=undefined
2026-09-01T23:31:49.9380964Z ##[debug]script=#!/bin/bash

echo "PROJETO=sispi"
echo "AMBIENTE=des"
echo "ISTIO_INJECTION=enabled"

#A label abaixo somente e adicionada ao namespace que tem a variable group ISTIO_VARIABLES
oc label namespace sispi-des istio-injection=enabled --overwrite
2026-09-01T23:31:49.9389241Z Generating script.
2026-09-01T23:31:49.9391144Z ##[debug]which 'bash'
2026-09-01T23:31:49.9401451Z ##[debug]found: '/usr/bin/bash'
2026-09-01T23:31:49.9401854Z ##[debug]Agent.Version=3.236.1
2026-09-01T23:31:49.9402137Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-09-01T23:31:49.9402425Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-09-01T23:31:49.9402636Z ========================== Starting Command Output ===========================
2026-09-01T23:31:49.9403136Z ##[debug]which '/usr/bin/bash'
2026-09-01T23:31:49.9404086Z ##[debug]found: '/usr/bin/bash'
2026-09-01T23:31:49.9404802Z ##[debug]/usr/bin/bash arg: /opt/ads-agent/_work/_temp/9d81b6f9-780c-448b-8524-97e8f0d40cc7.sh
2026-09-01T23:31:49.9407366Z ##[debug]exec tool: /usr/bin/bash
2026-09-01T23:31:49.9407757Z ##[debug]arguments:
2026-09-01T23:31:49.9408071Z ##[debug]   /opt/ads-agent/_work/_temp/9d81b6f9-780c-448b-8524-97e8f0d40cc7.sh
2026-09-01T23:31:49.9409162Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/9d81b6f9-780c-448b-8524-97e8f0d40cc7.sh
2026-09-01T23:31:49.9463816Z PROJETO=sispi
2026-09-01T23:31:49.9464135Z AMBIENTE=des
2026-09-01T23:31:49.9464664Z ISTIO_INJECTION=enabled
2026-09-01T23:31:50.0575915Z namespace/sispi-des not labeled
2026-09-01T23:31:50.0622650Z ##[debug]Exit code 0 received from tool '/usr/bin/bash'
2026-09-01T23:31:50.0625382Z ##[debug]STDIO streams have closed for tool '/usr/bin/bash'
2026-09-01T23:31:50.0630410Z ##[debug]task result: Succeeded
2026-09-01T23:31:50.0631796Z ##[debug]Processed: ##vso[task.complete result=Succeeded;done=true;]
2026-09-01T23:31:50.0668790Z ##[section]Finishing: Adicionando ISTIO_INJECTION



2026-09-01T23:31:50.0688306Z ##[debug]Evaluating condition for step: 'Criando nova APP'
2026-09-01T23:31:50.0688854Z ##[debug]Evaluating: succeeded()
2026-09-01T23:31:50.0689118Z ##[debug]Evaluating succeeded:
2026-09-01T23:31:50.0689446Z ##[debug]=> True
2026-09-01T23:31:50.0689780Z ##[debug]Result: True
2026-09-01T23:31:50.0689964Z ##[section]Starting: Criando nova APP
2026-09-01T23:31:50.0693030Z ==============================================================================
2026-09-01T23:31:50.0693111Z Task         : Bash
2026-09-01T23:31:50.0693154Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-01T23:31:50.0693226Z Version      : 3.227.0
2026-09-01T23:31:50.0693272Z Author       : Microsoft Corporation
2026-09-01T23:31:50.0693325Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-01T23:31:50.0693411Z ==============================================================================
2026-09-01T23:31:50.1231480Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-09-01T23:31:50.1917035Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-09-01T23:31:50.1924108Z ##[debug]loading inputs and endpoints
2026-09-01T23:31:50.1931118Z ##[debug]loading INPUT_TARGETTYPE
2026-09-01T23:31:50.1938445Z ##[debug]loading INPUT_FILEPATH
2026-09-01T23:31:50.1939594Z ##[debug]loading INPUT_SCRIPT
2026-09-01T23:31:50.1940346Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-09-01T23:31:50.1941311Z ##[debug]loading INPUT_FAILONSTDERR
2026-09-01T23:31:50.1941959Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-09-01T23:31:50.1942642Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-09-01T23:31:50.1944751Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-09-01T23:31:50.1949232Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-09-01T23:31:50.1950706Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-09-01T23:31:50.1952305Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-09-01T23:31:50.1954248Z ##[debug]loading SECRET_AZPAT
2026-09-01T23:31:50.1955636Z ##[debug]loading SECRET_PASSWORD_CGC
2026-09-01T23:31:50.1956817Z ##[debug]loading SECRET_BT_CLIENT_SECRET
2026-09-01T23:31:50.1957378Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-09-01T23:31:50.1958040Z ##[debug]loading SECRET_OCP_TOKEN
2026-09-01T23:31:50.1958639Z ##[debug]loading SECRET_TOKEN_CRQ
2026-09-01T23:31:50.1959247Z ##[debug]loading SECRET_VAULT_LOCATION
2026-09-01T23:31:50.1959766Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-09-01T23:31:50.1960339Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-09-01T23:31:50.1961871Z ##[debug]loading SECRET_FORTIFY_PASS
2026-09-01T23:31:50.1962275Z ##[debug]loaded 21
2026-09-01T23:31:50.1967204Z ##[debug]Agent.ProxyUrl=undefined
2026-09-01T23:31:50.1967502Z ##[debug]Agent.CAInfo=undefined
2026-09-01T23:31:50.1967746Z ##[debug]Agent.ClientCert=undefined
2026-09-01T23:31:50.1968048Z ##[debug]Agent.SkipCertValidation=True
2026-09-01T23:31:50.1981507Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-01T23:31:50.1983400Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-01T23:31:50.1983694Z ##[debug]system.culture=en-US
2026-09-01T23:31:50.1991534Z ##[debug]failOnStderr=false
2026-09-01T23:31:50.1992357Z ##[debug]workingDirectory=/opt/ads-agent/_work/r926/a
2026-09-01T23:31:50.1992620Z ##[debug]check path : /opt/ads-agent/_work/r926/a
2026-09-01T23:31:50.1994011Z ##[debug]targetType=inline
2026-09-01T23:31:50.1994251Z ##[debug]bashEnvValue=undefined
2026-09-01T23:31:50.1997760Z ##[debug]script=#!/bin/bash
set -o errexit
set -o pipefail
shopt -s extglob
shopt -s expand_aliases
CLUSTER="${AMBIENTE}_${SITE}"
epoch_now=`date +%s`
start_date=`date -d "@$epoch_now" +"%Y-%m-%dT%H:%M:%S-03:00"`
end_epoch=$((epoch_now + 300))
end_date=`date -d "@$end_epoch" +"%Y-%m-%dT%H:%M:%S-03:00"`
cmdb_sistema=`echo $REPOSITORIO | tr '[:lower:]' '[:upper:]'`
cmdb_ambiente=`echo $AMBIENTE | tr '[:lower:]' '[:upper:]'`
case "${CLUSTER,,}" in
  # OKD4
  +(des|tqs|hmp)_okd4_nprd)
    echo "OKD4 NPRD - des, tqs ou hmp"
 _app="sispi-med-orquestrador-des"
 _application_domain="sispi-med-orquestrador-des.$(OKD_URL_SUFFIX)"
    ;;
  prd_okd4_prd)
    echo "OKD4 CTC_NPCN - prd"
 _app="sispi-med-orquestrador-des"
 _application_domain="sispi-med-orquestrador-des.$(OKD_URL_SUFFIX_APL)"
    ;; 
  # OPENSHIFT NPRD LOTERIAS
  +(des|tqs|hmp)_openshift_nprd_loterias)
    echo "OPENSHIFT NPRD LOTERIAS - des, tqs ou hmp"
 _app="sispi-med-orquestrador-des"
 _application_domain="sispi-med-orquestrador-des.$(OPENSHIFT_LOTERIAS_URL_SUFFIX_NPRD)"
    ;;
  prd_openshift_prd_loterias)
    echo "OPENSHIFT PRD LOTERIAS"
 _app="sispi-med-orquestrador-des"
 _application_domain="sispi-med-orquestrador-des.$(OPENSHIFT_LOTERIAS_URL_SUFFIX_PRD)"
    ;;
  # OCP
  +(des|tqs|hmp)_ocp_nprd)
    echo "OCP NPRD - des, tqs ou hmp"
 _app="sispi-med-orquestrador-des"
 _application_domain="sispi-med-orquestrador-des.apps.pixnprd4.caixa"
    ;;
  prd_ocp_prd)
    echo "OCP PRD - prd"
 _app="sispi-med-orquestrador-des"
 _application_domain="sispi-med-orquestrador-des.$(OCP_URL_SUFFIX_PRD)"
    ;;
  prd_ocp_loterias)
    echo "OCP LOTERIAS PRD - prd"
 _app="sispi-med-orquestrador-des"
 _application_domain="sispi-med-orquestrador-des.$(OCP_LOTERIAS_URL_SUFFIX_PRD)"
    ;;
  *_ibmcloud)
    echo "IBM CLOUD"
 _app="sispi-med-orquestrador-des-esteiras"
    ;;
  *)
 echo "Não encontrei o cluster"
    exit 1 ;;
esac
if [[ -n "$SITE" && "ocp_nprd" =~ "ocp" ]]
then
arquivo="/usr/local/bin/oc-v4.13"
  if [-e "$arquivo"]; then 
    alias oc="$arquivo"
  fi
fi
oc version
is_new_app=false
is_app_created=`oc get svc,deploymentconfig,is,route -l app="$_app" -o=jsonpath='{range .items[*]}{.metadata.name}{"\n"}' -n sispi-des | wc -l`
if [ "$is_app_created" -ge "4" ]; then
   echo "Essa aplicação já está criada."
else
 echo "Iniciando criação da APP"
 is_new_app=true 
        TemplateRelease=openshift/quarkus-caixa-release
        TemplateRelease=`echo "$TemplateRelease" | sed 's,/,//,' ` 
        oc process "$TemplateRelease" --labels=app="$_app" -p NAME="$_app" -p APPLICATION_DOMAIN="$_application_domain" -p BUILD_NUMBER=20260831.1402-1.0.0-SNAPSHOT -n openshift | oc create -f - -n sispi-des
        json_data=`cat <<EOF
          {
          "Description": "Padrão DevOps Criação de Aplicação - Sistema: $cmdb_ambiente $cmdb_sistema Ambiente: $cmdb_ambiente",
          "Detailed Description": "Padrão DevOps Criação de Aplicação - Sistema: $cmdb_ambiente $cmdb_sistema Ambiente: $cmdb_ambiente",
          "Change Target Date": "$end_date",
          "Environment": "Production",
          "CI Name": "$CI_NAME",
          "Scheduled Start Date": "$start_date",
          "Scheduled End Date": "$end_date",
          "Actual Start Date": "$start_date",
          "Actual End Date": "$end_date",         
          "ambiente": "$cmdb_ambiente",
          "lista_hostnames": [ "$cmdb_sistema-$cmdb_ambiente" ],
          "Reason For Change": "New Functionality"
          }
EOF
` 
      curl  -X POST $URL_CRQ \
            -H "Authorization: $TOKEN_CRQ" \
            -H "Content-Type: application/json" \
            -d "$json_data"
fi
 if [[ deploymentconfig == deployment ]]
then 
  is_paused=`oc get deploymentconfig/"$_app" -o=jsonpath='{.spec.paused}' -n sispi-des`
  if [[ $is_paused != "true" ]]
    then 
      oc rollout pause deploymentconfig/"$_app" -n sispi-des
  fi
fi
oc patch  deploymentconfig "$_app" -p '{"metadata":{ "labels":{"CGC_DES":"7390","CGC_OPS":"7259"}},"spec": {"template": {"metadata": {"labels": {"CGC_DES":"7390","CGC_OPS":"7259"}}}}}' -n sispi-des
oc adm policy add-scc-to-group anyuid system:serviceaccounts:sispi-des
echo "##vso[task.setvariable variable=is_new_app;]$is_new_app"
echo "##vso[task.setvariable variable=resource_app;]$_app"
2026-09-01T23:31:50.2003580Z Generating script.
2026-09-01T23:31:50.2005501Z ##[debug]which 'bash'
2026-09-01T23:31:50.2010658Z ##[debug]found: '/usr/bin/bash'
2026-09-01T23:31:50.2011221Z ##[debug]Agent.Version=3.236.1
2026-09-01T23:31:50.2011851Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-09-01T23:31:50.2012387Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-09-01T23:31:50.2014283Z ========================== Starting Command Output ===========================
2026-09-01T23:31:50.2015323Z ##[debug]which '/usr/bin/bash'
2026-09-01T23:31:50.2016233Z ##[debug]found: '/usr/bin/bash'
2026-09-01T23:31:50.2016801Z ##[debug]/usr/bin/bash arg: /opt/ads-agent/_work/_temp/564f8dd8-a9fe-4ea8-8e5e-110863fbebde.sh
2026-09-01T23:31:50.2019121Z ##[debug]exec tool: /usr/bin/bash
2026-09-01T23:31:50.2019358Z ##[debug]arguments:
2026-09-01T23:31:50.2019609Z ##[debug]   /opt/ads-agent/_work/_temp/564f8dd8-a9fe-4ea8-8e5e-110863fbebde.sh
2026-09-01T23:31:50.2021619Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/564f8dd8-a9fe-4ea8-8e5e-110863fbebde.sh
2026-09-01T23:31:50.2197527Z OCP NPRD - des, tqs ou hmp
2026-09-01T23:31:50.2198962Z /opt/ads-agent/_work/_temp/564f8dd8-a9fe-4ea8-8e5e-110863fbebde.sh: line 63: [-e: command not found
2026-09-01T23:31:50.2909720Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-09-01T23:31:50.2909991Z Server Version: 4.15.59
2026-09-01T23:31:50.2910119Z Kubernetes Version: v1.28.15+d227d65
2026-09-01T23:31:50.3996771Z Warning: apps.openshift.io/v1 DeploymentConfig is deprecated in v4.14+, unavailable in v4.10000+
2026-09-01T23:31:50.4219247Z Essa aplicação já está criada.
2026-09-01T23:31:50.4978651Z ##[debug]Agent environment resources - Disk: / Available 72032.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 33.46%
2026-09-01T23:31:50.4979130Z Warning: apps.openshift.io/v1 DeploymentConfig is deprecated in v4.14+, unavailable in v4.10000+
2026-09-01T23:31:50.5075928Z deploymentconfig.apps.openshift.io/sispi-med-orquestrador-des patched (no change)
2026-09-01T23:31:50.5892638Z clusterrole.rbac.authorization.k8s.io/system:openshift:scc:anyuid added: "system:serviceaccounts:sispi-des"
2026-09-01T23:31:50.5923628Z ##[debug]Processed: ##vso[task.setvariable variable=is_new_app;]false
2026-09-01T23:31:50.5924292Z ##[debug]Processed: ##vso[task.setvariable variable=resource_app;]sispi-med-orquestrador-des
2026-09-01T23:31:50.5932361Z ##[debug]Exit code 0 received from tool '/usr/bin/bash'
2026-09-01T23:31:50.5935778Z ##[debug]STDIO streams have closed for tool '/usr/bin/bash'
2026-09-01T23:31:50.5941193Z ##[debug]task result: Succeeded
2026-09-01T23:31:50.5942947Z ##[debug]Processed: ##vso[task.complete result=Succeeded;done=true;]
2026-09-01T23:31:50.5982443Z ##[section]Finishing: Criando nova APP




2026-09-01T23:31:50.6006030Z ##[debug]Evaluating condition for step: 'Atualizando Variáveis de Ambiente'
2026-09-01T23:31:50.6006725Z ##[debug]Evaluating: succeeded()
2026-09-01T23:31:50.6006891Z ##[debug]Evaluating succeeded:
2026-09-01T23:31:50.6007238Z ##[debug]=> True
2026-09-01T23:31:50.6007413Z ##[debug]Result: True
2026-09-01T23:31:50.6007594Z ##[section]Starting: Atualizando Variáveis de Ambiente
2026-09-01T23:31:50.6011275Z ==============================================================================
2026-09-01T23:31:50.6011445Z Task         : Bash
2026-09-01T23:31:50.6011519Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-01T23:31:50.6011777Z Version      : 3.227.0
2026-09-01T23:31:50.6011868Z Author       : Microsoft Corporation
2026-09-01T23:31:50.6011963Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-01T23:31:50.6012087Z ==============================================================================
2026-09-01T23:31:50.6621191Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-09-01T23:31:50.7335125Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-09-01T23:31:50.7351509Z ##[debug]loading inputs and endpoints
2026-09-01T23:31:50.7351777Z ##[debug]loading INPUT_TARGETTYPE
2026-09-01T23:31:50.7369872Z ##[debug]loading INPUT_FILEPATH
2026-09-01T23:31:50.7370164Z ##[debug]loading INPUT_SCRIPT
2026-09-01T23:31:50.7370422Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-09-01T23:31:50.7370743Z ##[debug]loading INPUT_FAILONSTDERR
2026-09-01T23:31:50.7370992Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-09-01T23:31:50.7371264Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-09-01T23:31:50.7371537Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-09-01T23:31:50.7371799Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-09-01T23:31:50.7372041Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-09-01T23:31:50.7372280Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-09-01T23:31:50.7372523Z ##[debug]loading SECRET_AZPAT
2026-09-01T23:31:50.7373724Z ##[debug]loading SECRET_PASSWORD_CGC
2026-09-01T23:31:50.7373988Z ##[debug]loading SECRET_BT_CLIENT_SECRET
2026-09-01T23:31:50.7374235Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-09-01T23:31:50.7374485Z ##[debug]loading SECRET_OCP_TOKEN
2026-09-01T23:31:50.7375507Z ##[debug]loading SECRET_TOKEN_CRQ
2026-09-01T23:31:50.7375744Z ##[debug]loading SECRET_VAULT_LOCATION
2026-09-01T23:31:50.7375994Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-09-01T23:31:50.7376760Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-09-01T23:31:50.7378074Z ##[debug]loading SECRET_FORTIFY_PASS
2026-09-01T23:31:50.7378357Z ##[debug]loaded 21
2026-09-01T23:31:50.7401430Z ##[debug]Agent.ProxyUrl=undefined
2026-09-01T23:31:50.7401690Z ##[debug]Agent.CAInfo=undefined
2026-09-01T23:31:50.7401940Z ##[debug]Agent.ClientCert=undefined
2026-09-01T23:31:50.7402188Z ##[debug]Agent.SkipCertValidation=True
2026-09-01T23:31:50.7402472Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-01T23:31:50.7402807Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-01T23:31:50.7403088Z ##[debug]system.culture=en-US
2026-09-01T23:31:50.7411476Z ##[debug]failOnStderr=false
2026-09-01T23:31:50.7411757Z ##[debug]workingDirectory=/opt/ads-agent/_work/r926/a
2026-09-01T23:31:50.7412016Z ##[debug]check path : /opt/ads-agent/_work/r926/a
2026-09-01T23:31:50.7412258Z ##[debug]targetType=inline
2026-09-01T23:31:50.7412488Z ##[debug]bashEnvValue=undefined
2026-09-01T23:31:50.7416383Z ##[debug]script=#!/bin/bash
set -o errexit
set -o pipefail

shopt -s extglob
echo "Nova APP: false"

CONTAINER_PRINCIPAL=sispi-med-orquestrador-des  # nome do container principal da aplicação

for UNSET_VAR in $(oc set env deploymentconfig "sispi-med-orquestrador-des" -n sispi-des --list -c "$CONTAINER_PRINCIPAL" | egrep -wv '^#|TZ|INSTANCE_IP' | cut -f1 -d"=")
do 
oc set env deploymentconfig "sispi-med-orquestrador-des" -n sispi-des -c "$CONTAINER_PRINCIPAL" $UNSET_VAR- 
done

for UNSET_SECRET in $(oc set env deploymentconfig "sispi-med-orquestrador-des" -n sispi-des --list -c "$CONTAINER_PRINCIPAL" | grep 'from secret' | awk '{print $2}')
do
  if [ -n $UNSET_SECRET ]
  then
    oc set env deploymentconfig "sispi-med-orquestrador-des" -n sispi-des -c "$CONTAINER_PRINCIPAL" $UNSET_SECRET- 
  fi
done

if [[ -n ' -e AZURE_SERVICEBUS_QUEUE_ENDPOINT=sb://servicebus-eds-nprd.servicebus.windows.net/ -e AZURE_SERVICEBUS_QUEUE_NAME="sigcn-med-atualizacaorelatosinfracao-status" -e AZURE_SERVICEBUS_QUEUE_SHAREDACCESSKEY== -e AZURE_SERVICEBUS_QUEUE_SHAREDACCESSKEYNAME=RootManageSharedAccessKey -e JAVA_OPTIONS_APPEND="-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks" -e KAFKA_BOOTSTRAP_PORT=443 -e KAFKA_BOOTSTRAP_SERVER="development-kafka-bootstrap-cp4i.apps.pixnprd4.caixa" -e KAFKA_PASS='${SISPI_KAFKA}' -e KAFKA_USER= dev -e KEY_STORE_KAFKA_CLIENT_LOCATION=/deployments/sispi_user_keystore_kafka_des.p12 -e KEY_STORE_KAFKA_CLIENT_PASSWORD='${SISPI_USER_KEYSTORE}' -e MQ_ANTIFRAUDE_CHANNEL=SISPI.SVRCONN -e MQ_ANTIFRAUDE_FILA_NOTIFICACAO_INFRACAO=SIAAF.REQ.SISPI.PIX_NOTIFICACAO_INFRACAO -e MQ_ANTIFRAUDE_HOSTNAME=10.116.95.99 -e MQ_ANTIFRAUDE_MAXIMO_CONEXOES=1 -e MQ_ANTIFRAUDE_MAXIMO_SESSOES=300 -e MQ_ANTIFRAUDE_PASSWORD=jh73wpqb -e MQ_ANTIFRAUDE_PORT=1414 -e MQ_ANTIFRAUDE_QUEUE_MANAGER=XMQD1 -e MQ_ANTIFRAUDE_TIMEOUT=1000 -e MQ_ANTIFRAUDE_USERID=SSPIBD01 -e MQ_CONTROLE_TEMPO_CHANNEL=SISPI.SVRCONN -e MQ_CONTROLE_TEMPO_FILA_REGISTRO_ANS=SISPI.REQ.REGISTRO_ANS -e MQ_CONTROLE_TEMPO_HOSTNAME=10.116.95.99 -e MQ_CONTROLE_TEMPO_MAXIMO_CONEXOES=1 -e MQ_CONTROLE_TEMPO_MAXIMO_SESSOES=300 -e MQ_CONTROLE_TEMPO_PASSWORD=jh73wpqb -e MQ_CONTROLE_TEMPO_PORT=1414 -e MQ_CONTROLE_TEMPO_QUEUE_MANAGER=XMQD1 -e MQ_CONTROLE_TEMPO_TIMEOUT=1000 -e MQ_CONTROLE_TEMPO_USERID=SSPIBD01 -e PIX_FRAMEWORK_TOKEN_CLIENT_ID=cli-ser-spi -e PIX_FRAMEWORK_TOKEN_SECRET_ID=1938b188-42c7-4889-bf3a-7d95e4432fe9 -e PIX_FRAMEWORK_TOKEN_URL=https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token -e PIX_FRAMEWORK_VALIDACAO_TOKEN_SSO_EMISSOR="https://login.des.caixa/auth/realms/intranet" -e PIX_FRAMEWORK_VALIDACAO_TOKEN_SSO_URL="https://sispi-api-proxy-sso-des.apps.pixnprd4.caixa/auth/realms/intranet;https://login.des.caixa/auth/realms/intranet" -e PIX_FRAMEWORK_VALIDACAO_TOKEN_VALIDACAO_GLOBAL=true -e QUARKUS_DATASOURCE_JDBC_URL="jdbc:oracle:thin:@cnpexdadvm01-scan4.extra.caixa.gov.br:1521/CDBD08NGPDB017" -e QUARKUS_DATASOURCE_PASSWORD=sspibd0303 -e QUARKUS_DATASOURCE_USERNAME=SSPIBD03 -e SIMPI_MED_URL=https://simpi-med-des.apps.pixnprd4.caixa -e SISPI_API_KEY=l76138e827bd9d4f87aea4ff7f54a5607c -e SISPI_API_MANAGER=https://api.des.caixa:8443 -e SISPI_ISPB_CAIXA=00360305 -e SISPI_LOGIN_CAIXA_INTRANET_URL="https://login.des.caixa/auth/realms/intranet" -e TOPICO_MED_POLLING=PIX.MED.POLLING.EVENTO -e TRUST_STORE_KAFKA_LOCATION=/deployments/keystore_event_streams.p12 -e TRUST_STORE_KAFKA_PASSWORD='${SISPI_KAFKA_TRUSTSTORE}'' ]]; then 
   oc set env  -e AZURE_SERVICEBUS_QUEUE_ENDPOINT=sb://servicebus-eds-nprd.servicebus.windows.net/ -e AZURE_SERVICEBUS_QUEUE_NAME="sigcn-med-atualizacaorelatosinfracao-status" -e AZURE_SERVICEBUS_QUEUE_SHAREDACCESSKEY== -e AZURE_SERVICEBUS_QUEUE_SHAREDACCESSKEYNAME=RootManageSharedAccessKey -e JAVA_OPTIONS_APPEND="-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks" -e KAFKA_BOOTSTRAP_PORT=443 -e KAFKA_BOOTSTRAP_SERVER="development-kafka-bootstrap-cp4i.apps.pixnprd4.caixa" -e KAFKA_PASS='${SISPI_KAFKA}' -e KAFKA_USER= dev -e KEY_STORE_KAFKA_CLIENT_LOCATION=/deployments/sispi_user_keystore_kafka_des.p12 -e KEY_STORE_KAFKA_CLIENT_PASSWORD='${SISPI_USER_KEYSTORE}' -e MQ_ANTIFRAUDE_CHANNEL=SISPI.SVRCONN -e MQ_ANTIFRAUDE_FILA_NOTIFICACAO_INFRACAO=SIAAF.REQ.SISPI.PIX_NOTIFICACAO_INFRACAO -e MQ_ANTIFRAUDE_HOSTNAME=10.116.95.99 -e MQ_ANTIFRAUDE_MAXIMO_CONEXOES=1 -e MQ_ANTIFRAUDE_MAXIMO_SESSOES=300 -e MQ_ANTIFRAUDE_PASSWORD=jh73wpqb -e MQ_ANTIFRAUDE_PORT=1414 -e MQ_ANTIFRAUDE_QUEUE_MANAGER=XMQD1 -e MQ_ANTIFRAUDE_TIMEOUT=1000 -e MQ_ANTIFRAUDE_USERID=SSPIBD01 -e MQ_CONTROLE_TEMPO_CHANNEL=SISPI.SVRCONN -e MQ_CONTROLE_TEMPO_FILA_REGISTRO_ANS=SISPI.REQ.REGISTRO_ANS -e MQ_CONTROLE_TEMPO_HOSTNAME=10.116.95.99 -e MQ_CONTROLE_TEMPO_MAXIMO_CONEXOES=1 -e MQ_CONTROLE_TEMPO_MAXIMO_SESSOES=300 -e MQ_CONTROLE_TEMPO_PASSWORD=jh73wpqb -e MQ_CONTROLE_TEMPO_PORT=1414 -e MQ_CONTROLE_TEMPO_QUEUE_MANAGER=XMQD1 -e MQ_CONTROLE_TEMPO_TIMEOUT=1000 -e MQ_CONTROLE_TEMPO_USERID=SSPIBD01 -e PIX_FRAMEWORK_TOKEN_CLIENT_ID=cli-ser-spi -e PIX_FRAMEWORK_TOKEN_SECRET_ID=1938b188-42c7-4889-bf3a-7d95e4432fe9 -e PIX_FRAMEWORK_TOKEN_URL=https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token -e PIX_FRAMEWORK_VALIDACAO_TOKEN_SSO_EMISSOR="https://login.des.caixa/auth/realms/intranet" -e PIX_FRAMEWORK_VALIDACAO_TOKEN_SSO_URL="https://sispi-api-proxy-sso-des.apps.pixnprd4.caixa/auth/realms/intranet;https://login.des.caixa/auth/realms/intranet" -e PIX_FRAMEWORK_VALIDACAO_TOKEN_VALIDACAO_GLOBAL=true -e QUARKUS_DATASOURCE_JDBC_URL="jdbc:oracle:thin:@cnpexdadvm01-scan4.extra.caixa.gov.br:1521/CDBD08NGPDB017" -e QUARKUS_DATASOURCE_PASSWORD=sspibd0303 -e QUARKUS_DATASOURCE_USERNAME=SSPIBD03 -e SIMPI_MED_URL=https://simpi-med-des.apps.pixnprd4.caixa -e SISPI_API_KEY=l76138e827bd9d4f87aea4ff7f54a5607c -e SISPI_API_MANAGER=https://api.des.caixa:8443 -e SISPI_ISPB_CAIXA=00360305 -e SISPI_LOGIN_CAIXA_INTRANET_URL="https://login.des.caixa/auth/realms/intranet" -e TOPICO_MED_POLLING=PIX.MED.POLLING.EVENTO -e TRUST_STORE_KAFKA_LOCATION=/deployments/keystore_event_streams.p12 -e TRUST_STORE_KAFKA_PASSWORD='${SISPI_KAFKA_TRUSTSTORE}' deploymentconfig "sispi-med-orquestrador-des" -c "$CONTAINER_PRINCIPAL" --overwrite=true -n sispi-des
fi
2026-09-01T23:31:50.7421623Z Generating script.
2026-09-01T23:31:50.7421990Z ##[debug]which 'bash'
2026-09-01T23:31:50.7441130Z ##[debug]found: '/usr/bin/bash'
2026-09-01T23:31:50.7441386Z ##[debug]Agent.Version=3.236.1
2026-09-01T23:31:50.7441645Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-09-01T23:31:50.7441903Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-09-01T23:31:50.7442088Z ========================== Starting Command Output ===========================
2026-09-01T23:31:50.7442317Z ##[debug]which '/usr/bin/bash'
2026-09-01T23:31:50.7442545Z ##[debug]found: '/usr/bin/bash'
2026-09-01T23:31:50.7442809Z ##[debug]/usr/bin/bash arg: /opt/ads-agent/_work/_temp/69c0fa40-9c27-47cf-855e-e0abc03e982e.sh
2026-09-01T23:31:50.7443073Z ##[debug]exec tool: /usr/bin/bash
2026-09-01T23:31:50.7443297Z ##[debug]arguments:
2026-09-01T23:31:50.7443770Z ##[debug]   /opt/ads-agent/_work/_temp/69c0fa40-9c27-47cf-855e-e0abc03e982e.sh
2026-09-01T23:31:50.7444263Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/69c0fa40-9c27-47cf-855e-e0abc03e982e.sh
2026-09-01T23:31:50.7499967Z Nova APP: false
2026-09-01T23:31:50.8237357Z Warning: apps.openshift.io/v1 DeploymentConfig is deprecated in v4.14+, unavailable in v4.10000+
2026-09-01T23:31:50.9155060Z Warning: apps.openshift.io/v1 DeploymentConfig is deprecated in v4.14+, unavailable in v4.10000+
2026-09-01T23:31:51.0239382Z error: the server doesn't have a resource type "dev"
2026-09-01T23:31:51.0302860Z ##[debug]Exit code 1 received from tool '/usr/bin/bash'
2026-09-01T23:31:51.0305384Z ##[debug]STDIO streams have closed for tool '/usr/bin/bash'
2026-09-01T23:31:51.0312408Z ##[error]Bash exited with code '1'.
2026-09-01T23:31:51.0313764Z ##[debug]Processed: ##vso[task.issue type=error;]Bash exited with code '1'.
2026-09-01T23:31:51.0314145Z ##[debug]task result: Failed
2026-09-01T23:31:51.0315348Z ##[debug]Processed: ##vso[task.complete result=Failed;done=true;]
2026-09-01T23:31:51.0351178Z ##[section]Finishing: Atualizando Variáveis de Ambiente



2026-09-01T23:31:51.0887552Z ##[debug]Evaluating condition for step: 'Logs da Aplicação'
2026-09-01T23:31:51.0888146Z ##[debug]Evaluating: always()
2026-09-01T23:31:51.0888288Z ##[debug]Evaluating always:
2026-09-01T23:31:51.0889292Z ##[debug]=> True
2026-09-01T23:31:51.0889716Z ##[debug]Result: True
2026-09-01T23:31:51.0889914Z ##[section]Starting: Logs da Aplicação
2026-09-01T23:31:51.0893241Z ==============================================================================
2026-09-01T23:31:51.0893325Z Task         : Bash
2026-09-01T23:31:51.0893369Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-01T23:31:51.0893440Z Version      : 3.227.0
2026-09-01T23:31:51.0893486Z Author       : Microsoft Corporation
2026-09-01T23:31:51.0893547Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-01T23:31:51.0893633Z ==============================================================================
2026-09-01T23:31:51.1458612Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-09-01T23:31:51.2146977Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-09-01T23:31:51.2155261Z ##[debug]loading inputs and endpoints
2026-09-01T23:31:51.2162110Z ##[debug]loading INPUT_TARGETTYPE
2026-09-01T23:31:51.2169496Z ##[debug]loading INPUT_FILEPATH
2026-09-01T23:31:51.2170548Z ##[debug]loading INPUT_SCRIPT
2026-09-01T23:31:51.2171522Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-09-01T23:31:51.2172057Z ##[debug]loading INPUT_FAILONSTDERR
2026-09-01T23:31:51.2172828Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-09-01T23:31:51.2173539Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-09-01T23:31:51.2175478Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-09-01T23:31:51.2180005Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-09-01T23:31:51.2181478Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-09-01T23:31:51.2182924Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-09-01T23:31:51.2184838Z ##[debug]loading SECRET_AZPAT
2026-09-01T23:31:51.2186315Z ##[debug]loading SECRET_PASSWORD_CGC
2026-09-01T23:31:51.2187812Z ##[debug]loading SECRET_BT_CLIENT_SECRET
2026-09-01T23:31:51.2188341Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-09-01T23:31:51.2189053Z ##[debug]loading SECRET_OCP_TOKEN
2026-09-01T23:31:51.2189594Z ##[debug]loading SECRET_TOKEN_CRQ
2026-09-01T23:31:51.2190161Z ##[debug]loading SECRET_VAULT_LOCATION
2026-09-01T23:31:51.2190810Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-09-01T23:31:51.2192074Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-09-01T23:31:51.2193138Z ##[debug]loading SECRET_FORTIFY_PASS
2026-09-01T23:31:51.2193796Z ##[debug]loaded 21
2026-09-01T23:31:51.2198094Z ##[debug]Agent.ProxyUrl=undefined
2026-09-01T23:31:51.2198354Z ##[debug]Agent.CAInfo=undefined
2026-09-01T23:31:51.2198592Z ##[debug]Agent.ClientCert=undefined
2026-09-01T23:31:51.2198837Z ##[debug]Agent.SkipCertValidation=True
2026-09-01T23:31:51.2213967Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-01T23:31:51.2215776Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-01T23:31:51.2216060Z ##[debug]system.culture=en-US
2026-09-01T23:31:51.2223847Z ##[debug]failOnStderr=false
2026-09-01T23:31:51.2224753Z ##[debug]workingDirectory=/opt/ads-agent/_work/r926/a
2026-09-01T23:31:51.2225009Z ##[debug]check path : /opt/ads-agent/_work/r926/a
2026-09-01T23:31:51.2226309Z ##[debug]targetType=inline
2026-09-01T23:31:51.2226541Z ##[debug]bashEnvValue=undefined
2026-09-01T23:31:51.2227368Z ##[debug]script=#!/bin/bash
set -o errexit
set -o pipefail
set -x

shopt -s expand_aliases

if [[ -n "$SITE" && "ocp_nprd" =~ "ocp" ]]
then
  app="sispi-med-orquestrador-des"

  arquivo="/usr/local/bin/oc-v4.13"
  if [ -e "$arquivo" ]; then 
    alias oc="$arquivo"
  fi
elif [[ -n "$SITE" && "$SITE" =~ (okd4|openshift) ]];
then
app="sispi-med-orquestrador-des"
else
  app="sispi-med-orquestrador-des-esteiras"
fi

oc version

last_pod=$(oc get pod -l name="$app" -n sispi-des -o jsonpath='{range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp  | tac | grep -v '^$' | head -n1)

echo "Logs do POD: $last_pod"
oc logs $last_pod -c "$app" -n sispi-des
2026-09-01T23:31:51.2236905Z Generating script.
2026-09-01T23:31:51.2238673Z ##[debug]which 'bash'
2026-09-01T23:31:51.2244178Z ##[debug]found: '/usr/bin/bash'
2026-09-01T23:31:51.2244751Z ##[debug]Agent.Version=3.236.1
2026-09-01T23:31:51.2245009Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-09-01T23:31:51.2245263Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-09-01T23:31:51.2248022Z ========================== Starting Command Output ===========================
2026-09-01T23:31:51.2249011Z ##[debug]which '/usr/bin/bash'
2026-09-01T23:31:51.2249897Z ##[debug]found: '/usr/bin/bash'
2026-09-01T23:31:51.2250506Z ##[debug]/usr/bin/bash arg: /opt/ads-agent/_work/_temp/1100c73b-fc74-4a26-a9d3-342c670846ed.sh
2026-09-01T23:31:51.2252944Z ##[debug]exec tool: /usr/bin/bash
2026-09-01T23:31:51.2253179Z ##[debug]arguments:
2026-09-01T23:31:51.2253473Z ##[debug]   /opt/ads-agent/_work/_temp/1100c73b-fc74-4a26-a9d3-342c670846ed.sh
2026-09-01T23:31:51.2255175Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/1100c73b-fc74-4a26-a9d3-342c670846ed.sh
2026-09-01T23:31:51.2310046Z + shopt -s expand_aliases
2026-09-01T23:31:51.2310232Z + [[ -n ocp_nprd ]]
2026-09-01T23:31:51.2310343Z + [[ ocp_nprd =~ ocp ]]
2026-09-01T23:31:51.2310665Z + app=sispi-med-orquestrador-des
2026-09-01T23:31:51.2310847Z + arquivo=/usr/local/bin/oc-v4.13
2026-09-01T23:31:51.2311013Z + '[' -e /usr/local/bin/oc-v4.13 ']'
2026-09-01T23:31:51.2311125Z + oc version
2026-09-01T23:31:51.2952349Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-09-01T23:31:51.2952561Z Server Version: 4.15.59
2026-09-01T23:31:51.2952935Z Kubernetes Version: v1.28.15+d227d65
2026-09-01T23:31:51.2984796Z ++ oc get pod -l name=sispi-med-orquestrador-des -n sispi-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-09-01T23:31:51.2986071Z ++ tac
2026-09-01T23:31:51.2986783Z ++ grep -v '^$'
2026-09-01T23:31:51.2986924Z ++ head -n1
2026-09-01T23:31:51.4082037Z + last_pod=sispi-med-orquestrador-des-2-8k67g
2026-09-01T23:31:51.4082311Z + echo 'Logs do POD: sispi-med-orquestrador-des-2-8k67g'
2026-09-01T23:31:51.4082542Z + oc logs sispi-med-orquestrador-des-2-8k67g -c sispi-med-orquestrador-des -n sispi-des
2026-09-01T23:31:51.4082753Z Logs do POD: sispi-med-orquestrador-des-2-8k67g
2026-09-01T23:31:51.5100546Z exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
2026-09-01T23:31:51.5100907Z __  ____  __  _____   ___  __ ____  ______ 
2026-09-01T23:31:51.5101103Z  --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
2026-09-01T23:31:51.5101263Z  -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
2026-09-01T23:31:51.5101435Z --\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-09-01T23:31:51.5101735Z 2026-07-31 14:15:09,096 INFO   [CORRELATION-ID - ] [br.go.ca.si.in.si.ServiceBusSenderClientManager] (main) [SISPI][MED] Initializing Azure Service Bus sender client
2026-09-01T23:31:51.5102210Z 2026-07-31 14:15:09,308 INFO   [CORRELATION-ID - ] [co.az.me.se.ServiceBusClientBuilder] (main) [SISPI][MED] # of open clients using shared connection cache: 1
2026-09-01T23:31:51.5102566Z 2026-07-31 14:15:09,349 INFO   [CORRELATION-ID - ] [br.go.ca.si.in.si.ServiceBusSenderClientManager] (main) [SISPI][MED] Azure Service Bus sender client initialized successfully
2026-09-01T23:31:51.5103017Z 2026-07-31 14:15:09,495 INFO   [CORRELATION-ID - ] [io.quarkus] (main) [SISPI][MED] sispi-med-orquestrador 1.0.0-SNAPSHOT on JVM (powered by Quarkus 3.15.5.redhat-00002) started in 5.565s. Listening on: http://0.0.0.0:8080
2026-09-01T23:31:51.5103342Z 2026-07-31 14:15:09,495 INFO   [CORRELATION-ID - ] [io.quarkus] (main) [SISPI][MED] Profile prod activated. 
2026-09-01T23:31:51.5104289Z 2026-07-31 14:15:09,496 INFO   [CORRELATION-ID - ] [io.quarkus] (main) [SISPI][MED] Installed features: [agroal, cache, cdi, correlation-id, hibernate-orm, hibernate-validator, jdbc-oracle, log-request, narayana-jta, pipe-formatter, problem-details, rest, rest-client, rest-client-jackson, rest-jackson, scheduler, servlet, smallrye-context-propagation, smallrye-fault-tolerance, smallrye-health, smallrye-metrics, smallrye-openapi, swagger-ui, token-service, validacao-token, vertx]
2026-09-01T23:31:51.5145529Z ##[debug]Exit code 0 received from tool '/usr/bin/bash'
2026-09-01T23:31:51.5148906Z ##[debug]STDIO streams have closed for tool '/usr/bin/bash'
2026-09-01T23:31:51.5154406Z ##[debug]task result: Succeeded
2026-09-01T23:31:51.5155486Z ##[debug]Processed: ##vso[task.complete result=Succeeded;done=true;]
2026-09-01T23:31:51.5192258Z ##[section]Finishing: Logs da Aplicação
