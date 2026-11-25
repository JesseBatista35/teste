2026-11-25T17:09:57.6334164Z ##[section]Starting: Initialize job
2026-11-25T17:09:57.6335902Z Agent name: 'cadsvaprlx213.intra.caixa.gov.br'
2026-11-25T17:09:57.6336101Z Agent machine name: 'cadsvaprlx213'
2026-11-25T17:09:57.6336194Z Current agent version: '3.225.2'
2026-11-25T17:09:57.6349079Z Agent running as: 'sadscp01'
2026-11-25T17:09:57.6355882Z Prepare release directory.
2026-11-25T17:09:57.6360731Z ReleaseId=561212, TeamProjectId=98fe0311-ffd2-418a-9d0d-507043380abd, ReleaseDefinitionName=SIGEC-portabilidade-online
2026-11-25T17:09:57.6401349Z Release folder: /opt/ads-agent/_work/r12503/a
2026-11-25T17:09:57.6477979Z Environment variables available are below.  Note that these environment variables can be referred to in the task (in the ReleaseDefinition) by replacing "_" with "." e.g. AGENT_NAME environment variable can be referenced using Agent.Name in the ReleaseDefinition: 
				[AGENT_ACCEPTTEEEULA] --> [True]
				[AGENT_CLOUDID] --> []
				[AGENT_DISABLELOGPLUGIN_TESTFILEPUBLISHERPLUGIN] --> [true]
				[AGENT_DISABLELOGPLUGIN_TESTRESULTLOGPLUGIN] --> [true]
				[AGENT_HOMEDIRECTORY] --> [/opt/ads-agent]
				[AGENT_ID] --> [635]
				[AGENT_ISSELFHOSTED] --> [1]
				[AGENT_JOBNAME] --> [Agent job]
				[AGENT_MACHINENAME] --> [cadsvaprlx213]
				[AGENT_NAME] --> [cadsvaprlx213.intra.caixa.gov.br]
				[AGENT_OS] --> [Linux]
				[AGENT_OSARCHITECTURE] --> [X64]
				[AGENT_READONLYVARIABLES] --> [true]
				[AGENT_RELEASEDIRECTORY] --> [/opt/ads-agent/_work/r12503/a]
				[AGENT_RETAINDEFAULTENCODING] --> [false]
				[AGENT_ROOTDIRECTORY] --> [/opt/ads-agent/_work]
				[AGENT_SKIPCERTVALIDATION] --> [True]
				[AGENT_TASKRESTRICTIONSENFORCEMENTMODE] --> [Enabled]
				[AGENT_TEMPDIRECTORY] --> [/opt/ads-agent/_work/_temp]
				[AGENT_TOOLSDIRECTORY] --> [/opt/ads-agent/_work/_tool]
				[AGENT_USEWORKSPACEID] --> [true]
				[AGENT_VERSION] --> [3.225.2]
				[AGENT_WORKFOLDER] --> [/opt/ads-agent/_work]
				[ANSIBLE_CONFIG] --> [$(System.DefaultWorkingDirectory)/esteira-jboss-vm-v2/ansible.cfg]
				[ANSIBLE_INVENTORY_ANY_UNPARSED_IS_FAILED] --> [True]
				[API_MANAGER_API_KEY] --> [l714f9532275eb495c85015a769ab99181]
				[API_MANAGER_URL_BASE] --> [https://api.des.caixa:8443]
				[AZURE_HTTP_USER_AGENT] --> [TFS_7b4c9d5c-b041-4798-8dcb-fb11786a173b_Release__561212_2609565_1]
				[AZUSER] --> [s736639]
				[BARRAMENTO_URL_BASE] --> [http://tqs.barramento.caixa]
				[BT_API_URL] --> [https://sicsn.caixa/BeyondTrust/api/public/v3]
				[BUILD_BUILDID] --> [878866]
				[BUILD_BUILDNUMBER] --> [5.0.0-BATCH-SNAPSHOT]
				[BUILD_BUILDURI] --> [vstfs:///Build/Build/878866]
				[BUILD_DEFINITIONID] --> [6648]
				[BUILD_DEFINITIONNAME] --> [SIGEC-portabilidade-online]
				[BUILD_PROJECTID] --> [98fe0311-ffd2-418a-9d0d-507043380abd]
				[BUILD_PROJECTNAME] --> [Caixa]
				[BUILD_REPOSITORY_ID] --> [67d0ebc7-0979-497b-8e44-dc44db19f321]
				[BUILD_REPOSITORY_NAME] --> [SIGEC-portabilidade]
				[BUILD_REPOSITORY_PROVIDER] --> [TfsGit]
				[BUILD_REQUESTEDFOR] --> [Fabio Pereira Siqueira]
				[BUILD_REQUESTEDFORID] --> [fab5a8e2-3e14-4f1f-8b3d-d95d39867525]
				[BUILD_SOURCEBRANCH] --> [refs/heads/rtc/STRY00052082_migracao_java_17]
				[BUILD_SOURCEBRANCHNAME] --> [STRY00052082_migracao_java_17]
				[BUILD_SOURCEVERSION] --> [d1542e94da186de5f6b5e740956ddf57d6686c56]
				[BUILD_TYPE] --> [Build]
				[CGC_UNIDADE_DES] --> [7390]
				[CGC_UNIDADE_OPS] --> [7259]
				[CI_NAME] --> [7366CLU-OKD4-PRODUTOS]
				[CLIENT_SECRET] --> [385c6032-c152-465c-97cf-7ac351649caa]
				[CLIENT_APP_ID] --> [cli-ser-gec]
				[CLIENT_APP_SECRET] --> [385c6032-c152-465c-97cf-7ac351649caa]
				[DIR_ANSIBLE] --> [esteira-jboss-vm-v2]
				[DIR_LOGS] --> [/opt/ads-agent/esteira-logs]
				[FORTIFY_API] --> [https://novocodigoseguro.caixa/ssc/api/v1]
				[FORTIFY_USER] --> [admin]
				[GIT_TERMINAL_PROMPT] --> [0]
				[GRAYLOG_USERNAME] --> [API_CLIENT]
				[HOME_ADS_AGENT] --> [$(System.DefaultWorkingDirectory)]
				[HTTP_CONTEXT_ADDITIONAL] --> []
				[HTTP_CONTEXT_DEFAULT] --> [sigec_portabilidade]
				[HTTP_SSO] --> [no]
				[INFRAFACIL] --> [infradevops-novoportal-backend-prd.apps.produtos4.caixa]
				[JVM_HEAP_MAX] --> [2048m]
				[JVM_HEAP_MIN] --> [1024m]
				[JVM_METASPACE_MAX] --> [512m]
				[JVM_METASPACE_MIN] --> [96m]
				[MSDEPLOY_HTTP_USER_AGENT] --> [TFS_7b4c9d5c-b041-4798-8dcb-fb11786a173b_Release__561212_2609565_1]
				[NO_PROXY] --> [10.122.144.168,10.122.144.195,10.122.144.130,10.221.144.17,devops.caixa,cadsvgerap004-1.intra.caixa.gov.br,cadsvgerap028-1.intra.caixa.gov.br,infradevops-novoportal-backend-prd.apps.produtos4.caixa,infradevops-ads-api-prd.apps.produtos4.caixa,infradevops-db-api-prd.apps.produtos4.caixa,cadsvgerap027-1.intra.caixa.gov.br]
				[OKD_API_PRODUTOS] --> [api.produtos4.caixa:6443]
				[OKD_KAFKA] --> [api.kafka-nprd.caixa:6443]
				[OKD_REGISTRY_PRODUTOS] --> [default-route-openshift-image-registry.apps.produtos4.caixa]
				[OKD_URL_SUFFIX_PRODUTOS] --> [api.produtos4.caixa:6443]
				[OKD_USER_SERVICE_PRODUTOS] --> [ads-sa]
				[OUTDIR] --> [C:/Desenvolvimento/SIGEC/demandas/XML_Fluxos/ARCC]
				[PASSWORD_TRUSTSTORE] --> [changeit]
				[PASTA_PUBLICA_APX] --> [\\NBTITMA141426/Desenvolvimento/SIGEC/demandas/XML_Fluxos]
				[PRODUTO_NOME_VM] --> [Jboss]
				[PRODUTO_VERSAO_VM] --> [7.4]
				[RELEASE_ARTIFACTS_ESTEIRA-JBOSS-VM-V2_BUILDID] --> [aecfa713a3169c2d3977e6ff7cf1a127a296197d]
				[RELEASE_ARTIFACTS_ESTEIRA-JBOSS-VM-V2_BUILDNUMBER] --> [aecfa713]
				[RELEASE_ARTIFACTS_ESTEIRA-JBOSS-VM-V2_DEFINITIONID] --> [a7cb53b6-b5a3-49bf-b1e5-1f68233e8704]
				[RELEASE_ARTIFACTS_ESTEIRA-JBOSS-VM-V2_DEFINITIONNAME] --> [esteira-jboss-vm-v2]
				[RELEASE_ARTIFACTS_ESTEIRA-JBOSS-VM-V2_DEFINTIONID] --> [a7cb53b6-b5a3-49bf-b1e5-1f68233e8704]
				[RELEASE_ARTIFACTS_ESTEIRA-JBOSS-VM-V2_PROJECTID] --> [d90bc0d4-90c2-46f7-8c37-c656389278e8]
				[RELEASE_ARTIFACTS_ESTEIRA-JBOSS-VM-V2_PROJECTNAME] --> [Infraestrutura]
				[RELEASE_ARTIFACTS_ESTEIRA-JBOSS-VM-V2_REPOSITORY_ID] --> [a7cb53b6-b5a3-49bf-b1e5-1f68233e8704]
				[RELEASE_ARTIFACTS_ESTEIRA-JBOSS-VM-V2_REPOSITORY_NAME] --> [esteira-jboss-vm-v2]
				[RELEASE_ARTIFACTS_ESTEIRA-JBOSS-VM-V2_REPOSITORY_PROVIDER] --> [Git]
				[RELEASE_ARTIFACTS_ESTEIRA-JBOSS-VM-V2_REPOSITORY_URI] --> [https://devops.caixa/projetos/Infraestrutura/_git/esteira-jboss-vm-v2]
				[RELEASE_ARTIFACTS_ESTEIRA-JBOSS-VM-V2_SOURCEBRANCH] --> [master]
				[RELEASE_ARTIFACTS_ESTEIRA-JBOSS-VM-V2_SOURCEVERSION] --> [aecfa713a3169c2d3977e6ff7cf1a127a296197d]
				[RELEASE_ARTIFACTS_ESTEIRA-JBOSS-VM-V2_TYPE] --> [Git]
				[RELEASE_ARTIFACTS_TERRAFORM-ESTEIRA_BUILDID] --> [b80af7bae3a3d50a77de8ad8319b18a0d654cb71]
				[RELEASE_ARTIFACTS_TERRAFORM-ESTEIRA_BUILDNUMBER] --> [b80af7ba]
				[RELEASE_ARTIFACTS_TERRAFORM-ESTEIRA_DEFINITIONID] --> [480084d9-f83f-41ea-a204-898969c490fd]
				[RELEASE_ARTIFACTS_TERRAFORM-ESTEIRA_DEFINITIONNAME] --> [esteira-vm-release-terraform]
				[RELEASE_ARTIFACTS_TERRAFORM-ESTEIRA_DEFINTIONID] --> [480084d9-f83f-41ea-a204-898969c490fd]
				[RELEASE_ARTIFACTS_TERRAFORM-ESTEIRA_PROJECTID] --> [d90bc0d4-90c2-46f7-8c37-c656389278e8]
				[RELEASE_ARTIFACTS_TERRAFORM-ESTEIRA_PROJECTNAME] --> [Infraestrutura]
				[RELEASE_ARTIFACTS_TERRAFORM-ESTEIRA_REPOSITORY_ID] --> [480084d9-f83f-41ea-a204-898969c490fd]
				[RELEASE_ARTIFACTS_TERRAFORM-ESTEIRA_REPOSITORY_NAME] --> [esteira-vm-release-terraform]
				[RELEASE_ARTIFACTS_TERRAFORM-ESTEIRA_REPOSITORY_PROVIDER] --> [Git]
				[RELEASE_ARTIFACTS_TERRAFORM-ESTEIRA_REPOSITORY_URI] --> [https://devops.caixa/projetos/Infraestrutura/_git/esteira-vm-release-terraform]
				[RELEASE_ARTIFACTS_TERRAFORM-ESTEIRA_SOURCEBRANCH] --> [main]
				[RELEASE_ARTIFACTS_TERRAFORM-ESTEIRA_SOURCEVERSION] --> [b80af7bae3a3d50a77de8ad8319b18a0d654cb71]
				[RELEASE_ARTIFACTS_TERRAFORM-ESTEIRA_TYPE] --> [Git]
				[RELEASE_ARTIFACTS__SIGEC-PORTABILIDADE-CONFIG_BUILDID] --> [c18e675f6d8214c45184a56bb9a9d755d110ab23]
				[RELEASE_ARTIFACTS__SIGEC-PORTABILIDADE-CONFIG_BUILDNUMBER] --> [c18e675f]
				[RELEASE_ARTIFACTS__SIGEC-PORTABILIDADE-CONFIG_DEFINITIONID] --> [6085770a-83a7-401c-a111-1ca2b99ec6c8]
				[RELEASE_ARTIFACTS__SIGEC-PORTABILIDADE-CONFIG_DEFINITIONNAME] --> [SIGEC-portabilidade-config]
				[RELEASE_ARTIFACTS__SIGEC-PORTABILIDADE-CONFIG_DEFINTIONID] --> [6085770a-83a7-401c-a111-1ca2b99ec6c8]
				[RELEASE_ARTIFACTS__SIGEC-PORTABILIDADE-CONFIG_PROJECTID] --> [98fe0311-ffd2-418a-9d0d-507043380abd]
				[RELEASE_ARTIFACTS__SIGEC-PORTABILIDADE-CONFIG_PROJECTNAME] --> [Caixa]
				[RELEASE_ARTIFACTS__SIGEC-PORTABILIDADE-CONFIG_REPOSITORY_ID] --> [6085770a-83a7-401c-a111-1ca2b99ec6c8]
				[RELEASE_ARTIFACTS__SIGEC-PORTABILIDADE-CONFIG_REPOSITORY_NAME] --> [SIGEC-portabilidade-config]
				[RELEASE_ARTIFACTS__SIGEC-PORTABILIDADE-CONFIG_REPOSITORY_PROVIDER] --> [Git]
				[RELEASE_ARTIFACTS__SIGEC-PORTABILIDADE-CONFIG_REPOSITORY_URI] --> [https://devops.caixa/projetos/Caixa/_git/SIGEC-portabilidade-config]
				[RELEASE_ARTIFACTS__SIGEC-PORTABILIDADE-CONFIG_SOURCEBRANCH] --> [master]
				[RELEASE_ARTIFACTS__SIGEC-PORTABILIDADE-CONFIG_SOURCEVERSION] --> [c18e675f6d8214c45184a56bb9a9d755d110ab23]
				[RELEASE_ARTIFACTS__SIGEC-PORTABILIDADE-CONFIG_TYPE] --> [Git]
				[RELEASE_ARTIFACTS__SIGEC-PORTABILIDADE-ONLINE_BUILDID] --> [878866]
				[RELEASE_ARTIFACTS__SIGEC-PORTABILIDADE-ONLINE_BUILDNUMBER] --> [5.0.0-BATCH-SNAPSHOT]
				[RELEASE_ARTIFACTS__SIGEC-PORTABILIDADE-ONLINE_BUILDURI] --> [vstfs:///Build/Build/878866]
				[RELEASE_ARTIFACTS__SIGEC-PORTABILIDADE-ONLINE_DEFINITIONID] --> [6648]
				[RELEASE_ARTIFACTS__SIGEC-PORTABILIDADE-ONLINE_DEFINITIONNAME] --> [SIGEC-portabilidade-online]
				[RELEASE_ARTIFACTS__SIGEC-PORTABILIDADE-ONLINE_PROJECTID] --> [98fe0311-ffd2-418a-9d0d-507043380abd]
				[RELEASE_ARTIFACTS__SIGEC-PORTABILIDADE-ONLINE_PROJECTNAME] --> [Caixa]
				[RELEASE_ARTIFACTS__SIGEC-PORTABILIDADE-ONLINE_REPOSITORY_ID] --> [67d0ebc7-0979-497b-8e44-dc44db19f321]
				[RELEASE_ARTIFACTS__SIGEC-PORTABILIDADE-ONLINE_REPOSITORY_NAME] --> [SIGEC-portabilidade]
				[RELEASE_ARTIFACTS__SIGEC-PORTABILIDADE-ONLINE_REPOSITORY_PROVIDER] --> [TfsGit]
				[RELEASE_ARTIFACTS__SIGEC-PORTABILIDADE-ONLINE_REQUESTEDFOR] --> [Fabio Pereira Siqueira]
				[RELEASE_ARTIFACTS__SIGEC-PORTABILIDADE-ONLINE_REQUESTEDFORID] --> [fab5a8e2-3e14-4f1f-8b3d-d95d39867525]
				[RELEASE_ARTIFACTS__SIGEC-PORTABILIDADE-ONLINE_SOURCEBRANCH] --> [refs/heads/rtc/STRY00052082_migracao_java_17]
				[RELEASE_ARTIFACTS__SIGEC-PORTABILIDADE-ONLINE_SOURCEBRANCHNAME] --> [STRY00052082_migracao_java_17]
				[RELEASE_ARTIFACTS__SIGEC-PORTABILIDADE-ONLINE_SOURCEVERSION] --> [d1542e94da186de5f6b5e740956ddf57d6686c56]
				[RELEASE_ARTIFACTS__SIGEC-PORTABILIDADE-ONLINE_TYPE] --> [Build]
				[RELEASE_ATTEMPTNUMBER] --> [1]
				[RELEASE_DEFINITIONENVIRONMENTID] --> [29037]
				[RELEASE_DEFINITIONID] --> [6332]
				[RELEASE_DEFINITIONNAME] --> [SIGEC-portabilidade-online]
				[RELEASE_DEPLOYMENT_REQUESTEDFOR] --> [Jesse Mouta Pereira Batista]
				[RELEASE_DEPLOYMENT_REQUESTEDFOREMAIL] --> [p585600@corp.caixa.gov.br]
				[RELEASE_DEPLOYMENT_REQUESTEDFORID] --> [f384796d-04a2-4d1c-8749-e852ce923c87]
				[RELEASE_DEPLOYMENT_STARTTIME] --> [2026-11-25 17:09:50Z]
				[RELEASE_DEPLOYMENTID] --> [879726]
				[RELEASE_DEPLOYPHASEID] --> [865724]
				[RELEASE_ENVIRONMENTID] --> [2609565]
				[RELEASE_ENVIRONMENTNAME] --> [EC DES]
				[RELEASE_ENVIRONMENTS_EC_DES_STATUS] --> [InProgress]
				[RELEASE_ENVIRONMENTS_EC_HMP_STATUS] --> [NotStarted]
				[RELEASE_ENVIRONMENTS_EC_PRD_CTC_STATUS] --> [NotStarted]
				[RELEASE_ENVIRONMENTS_EC_PRD_DTC_STATUS] --> [NotStarted]
				[RELEASE_ENVIRONMENTS_EC_TQS_STATUS] --> [NotStarted]
				[RELEASE_ENVIRONMENTURI] --> [vstfs:///ReleaseManagement/Environment/2609565]
				[RELEASE_PRIMARYARTIFACTSOURCEALIAS] --> [_SIGEC-portabilidade-online]
				[RELEASE_REASON] --> [Manual]
				[RELEASE_RELEASEDESCRIPTION] --> []
				[RELEASE_RELEASEID] --> [561212]
				[RELEASE_RELEASENAME] --> [SIGEC-portabilidade-online-5]
				[RELEASE_RELEASEURI] --> [vstfs:///ReleaseManagement/Release/561212]
				[RELEASE_RELEASEWEBURL] --> [https://devops.caixa/projetos/98fe0311-ffd2-418a-9d0d-507043380abd/_release?releaseId=561212&_a=release-summary]
				[RELEASE_REQUESTEDFOR] --> [Jesse Mouta Pereira Batista]
				[RELEASE_REQUESTEDFOREMAIL] --> [p585600@corp.caixa.gov.br]
				[RELEASE_REQUESTEDFORID] --> [f384796d-04a2-4d1c-8749-e852ce923c87]
				[RELEASE_SKIPARTIFACTSDOWNLOAD] --> [False]
				[RELEASE_TRIGGERINGARTIFACT_ALIAS] --> []
				[REPOSITORY_LOGS] --> [https://devops.caixa/projetos/Infraestrutura/_git/esteira-logs]
				[REPO_ESTEIRA_JBOSS_VM] --> [https://devops.caixa/projetos/Infraestrutura/_git/esteira-jboss-vm-v2]
				[REPO_ESTEIRA_JBOSS_VM_BRANCH] --> [master]
				[REPO_ESTEIRA_TERRAFORM] --> [https://devops.caixa/projetos/Infraestrutura/_git/esteira-vm-release-terraform]
				[REPO_ESTEIRA_TERRAFORM_BRANCH] --> [main]
				[REQUESTEDFORID] --> [f384796d-04a2-4d1c-8749-e852ce923c87]
				[SIMTR_BASE_URL] --> [/simtr]
				[SISTEMA_AMBIENTE] --> [des]
				[SISTEMA_NOME] --> [sigec-portabilidade-online]
				[SITE] --> [ctc_nprd]
				[SONAR_URL] --> [http://sonar.produtos.caixa]
				[SSL_DEBUG] --> [true]
				[SSL_TRUST_ALL_CERTIFICATES] --> [true]
				[SSL_VERIFY_HOSTNAME] --> [false]
				[SSO_INTERNET2_TYPE_OF_SSL_REQUIRED] --> [external]
				[SSO_INTERNET_TYPE_OF_SSL_REQUIRED] --> [external]
				[SSO_INTRANET_SECRET] --> [897f0b68-56da-4a9e-9f94-17feb26d4e56]
				[SSO_INTRANET_TYPE_OF_SSL_REQUIRED] --> [external]
				[SSO_SERVICO_URL_BASE_INTRANET] --> [https://login.des.caixa]
				[SYSTEM] --> [release]
				[SYSTEM_ACCESSTOKEN] --> [***]
				[SYSTEM_ARTIFACTSDIRECTORY] --> [/opt/ads-agent/_work/r12503/a]
				[SYSTEM_COLLECTIONID] --> [7b4c9d5c-b041-4798-8dcb-fb11786a173b]
				[SYSTEM_COLLECTIONURI] --> [https://devops.caixa/projetos/]
				[SYSTEM_CULTURE] --> [en-US]
				[SYSTEM_DEFAULTWORKINGDIRECTORY] --> [/opt/ads-agent/_work/r12503/a]
				[SYSTEM_DEFINITIONID] --> [6332]
				[SYSTEM_DEFINITIONNAME] --> [SIGEC-portabilidade-online]
				[SYSTEM_ENABLEACCESSTOKEN] --> [True]
				[SYSTEM_HOSTTYPE] --> [release]
				[SYSTEM_ISDOCKERCONTAINER] --> [0]
				[SYSTEM_ISSCHEDULED] --> [False]
				[SYSTEM_JOBATTEMPT] --> [1]
				[SYSTEM_JOBDISPLAYNAME] --> [Agent job]
				[SYSTEM_JOBID] --> [c4cbdc92-1c2d-5c71-6866-2032c44b3d50]
				[SYSTEM_JOBIDENTIFIER] --> [Stage_98fe0311ffd2418a9d0d507043380abd_29037_1.Phase_1.__default]
				[SYSTEM_JOBNAME] --> [__default]
				[SYSTEM_JOBPARALLELISMTAG] --> [Private]
				[SYSTEM_JOBPOSITIONINPHASE] --> [1]
				[SYSTEM_JOBTIMEOUT] --> [0]
				[SYSTEM_PHASEATTEMPT] --> [1]
				[SYSTEM_PHASEDISPLAYNAME] --> [Agent job]
				[SYSTEM_PHASEID] --> [f7c2f6e8-210d-5ee9-43ec-66d414eeddda]
				[SYSTEM_PHASENAME] --> [Phase_1]
				[SYSTEM_PIPELINESTARTTIME] --> [2026-11-25 14:09:53-03:00]
				[SYSTEM_PLANID] --> [74fc316c-ecc1-44e6-891b-3fe2018f1094]
				[SYSTEM_SERVERTYPE] --> [OnPremises]
				[SYSTEM_STAGEATTEMPT] --> [1]
				[SYSTEM_STAGEDISPLAYNAME] --> [EC DES]
				[SYSTEM_STAGEID] --> [3187ccfb-fcf2-5a7f-fad4-1c681697b126]
				[SYSTEM_STAGENAME] --> [Stage_98fe0311ffd2418a9d0d507043380abd_29037_1]
				[SYSTEM_TASKDEFINITIONSURI] --> [http://apidevops.caixa/projetos/]
				[SYSTEM_TEAMFOUNDATIONCOLLECTIONURI] --> [http://apidevops.caixa/projetos/]
				[SYSTEM_TEAMFOUNDATIONSERVERURI] --> [http://apidevops.caixa/projetos/]
				[SYSTEM_TEAMPROJECT] --> [Caixa]
				[SYSTEM_TEAMPROJECTID] --> [98fe0311-ffd2-418a-9d0d-507043380abd]
				[SYSTEM_TIMELINEID] --> [74fc316c-ecc1-44e6-891b-3fe2018f1094]
				[SYSTEM_TOTALJOBSINPHASE] --> [1]
				[SYSTEM_WORKFOLDER] --> [/opt/ads-agent/_work]
				[TERRAFORM_CLUSTER] --> [CTC_NPRDXF2488HV7_NPRD]
				[TERRAFORM_DATACENTER] --> [NPRD]
				[TERRAFORM_DATASTORE] --> [CTCHWNPRDC011_0259]
				[TERRAFORM_ESX_NETWORK] --> [tn-NPRD+NPRD_AUTO_DES_BSB-ap+VL3676-ep+10.116.192.0]
				[TERRAFORM_ESX_NETWORK_BCK] --> [tn-NPRD|NPRD_BKP-ap|VL3697-ep]
				[TERRAFORM_ESX_NETWORK_BCK_1] --> [tn-BACKUP|BACKUP-NPRD-ap|BACKUP-NPRD-ep]
				[TERRAFORM_ESX_USERNAME] --> [s736660]
				[TERRAFORM_ESX_VCENTER_SERVER] --> [10.122.144.195]
				[TERRAFORM_NET_ADAPTER_TYPE] --> [vmxnet3]
				[TERRAFORM_VM_DNS] --> [["10.116.193.77", "10.116.193.78"]]
				[TERRAFORM_VM_DOMAIN] --> [agil.nprd.caixa.gov.br]
				[TERRAFORM_VM_IPNETMASK] --> [19]
				[TERRAFORM_VM_IPNETMASK_BCK] --> [19]
				[TERRAFORM_VM_IPNETMASK_BCK_1] --> [16]
				[TERRAFORM_VSPHERE_FOLDER] --> [/vm]
				[TERRAFORM_VSPHERE_POOL] --> [/Resources/RP_TERRAFORM_NPRD]
				[TF_HTTPS_NO_PROXY] --> [10.122.144.168,10.122.144.195,10.122.144.130,10.221.144.17,*.caixa,*.intra.caixa.gov.br,cadsvgerap030-1.intra.caixa.gov.br,cadsvgerap027-1.intra.caixa.gov.br,cadsvgerap028-1.intra.caixa.gov.br,cert-api.access.redhat.com,cadsvgerap107-1.intra.caixa.gov.br]
				[TF_HTTPS_PROXY] --> [http://proxynuvem.caixa:80]
				[TF_VAR_TEMPLATE_NAME] --> [eap74-openjdk17-apache24-rhel93-v012]
				[UNIDADE] --> []
				[URL_APM_SERVER] --> [http://apm-server-devops.produtos.caixa]
				[URL_CRQ] --> [https://infradevops-novoportal-backend-prd.apps.produtos4.caixa/api.php?acao=devopsCaixacriarMudancaPadrao]
				[USUARIO_SILCR] --> [SGECLCRQ]
				[VM_DESTROY_BEFORE_CREATE] --> []
				[VM_SERVERS_RECREATE] --> []
2026-11-25T17:09:58.4876840Z Download all required tasks.
2026-11-25T17:09:58.5687562Z Checking job knob settings.
2026-11-25T17:09:58.5698207Z Finished checking job knob settings.
2026-11-25T17:09:58.5969168Z Start tracking orphan processes.
2026-11-25T17:09:58.6411505Z ##[section]Finishing: Initialize job




2026-11-25T17:09:59.7240026Z ##[section]Starting: Download Artifacts
2026-11-25T17:09:59.7291649Z Creating artifacts directory: /opt/ads-agent/_work/r12503/a
2026-11-25T17:09:59.7310225Z Created artifacts directory: /opt/ads-agent/_work/r12503/a
2026-11-25T17:09:59.7310400Z Downloading artifact
2026-11-25T17:09:59.7318610Z Starting artifacts download...
2026-11-25T17:09:59.7323671Z Downloading linked artifact _SIGEC-portabilidade-config of type TFGit...
2026-11-25T17:09:59.7341528Z Ensuring artifact folder /opt/ads-agent/_work/r12503/a/_SIGEC-portabilidade-config exists and is clean.
2026-11-25T17:09:59.7427386Z Syncing repository: 6085770a-83a7-401c-a111-1ca2b99ec6c8 (Git)
2026-11-25T17:09:59.7532413Z ##[command]git version
2026-11-25T17:09:59.7577470Z git version 2.22.1
2026-11-25T17:09:59.7607172Z ##[command]git init "/opt/ads-agent/_work/r12503/a/_SIGEC-portabilidade-config"
2026-11-25T17:09:59.7646068Z Initialized empty Git repository in /opt/ads-agent/_work/r12503/a/_SIGEC-portabilidade-config/.git/
2026-11-25T17:09:59.7657071Z ##[command]git remote add origin http://apidevops.caixa/projetos/Caixa/_git/SIGEC-portabilidade-config
2026-11-25T17:09:59.7789143Z ##[command]git config gc.auto 0
2026-11-25T17:09:59.7827681Z ##[command]git config --get-all http.http://apidevops.caixa/projetos/Caixa/_git/SIGEC-portabilidade-config.extraheader
2026-11-25T17:09:59.7860181Z ##[command]git config --get-all http.proxy
2026-11-25T17:09:59.7903990Z ##[command]git -c http.extraheader="AUTHORIZATION: bearer ***" -c http.sslVerify=false fetch --tags --prune --prune-tags --progress --no-recurse-submodules origin
2026-11-25T17:09:59.8216397Z remote: Azure Repos        
2026-11-25T17:09:59.8228213Z remote: 
2026-11-25T17:09:59.8228352Z remote: Found 79 objects to send. (1 ms)        
2026-11-25T17:09:59.8541478Z From http://apidevops.caixa/projetos/Caixa/_git/SIGEC-portabilidade-config
2026-11-25T17:09:59.8542314Z  * [new branch]      develop    -> origin/develop
2026-11-25T17:09:59.8542459Z  * [new branch]      master     -> origin/master
2026-11-25T17:09:59.8580696Z ##[command]git checkout --progress --force c18e675f6d8214c45184a56bb9a9d755d110ab23
2026-11-25T17:09:59.8634596Z Note: checking out 'c18e675f6d8214c45184a56bb9a9d755d110ab23'.
2026-11-25T17:09:59.8634723Z 
2026-11-25T17:09:59.8635489Z You are in 'detached HEAD' state. You can look around, make experimental
2026-11-25T17:09:59.8635721Z changes and commit them, and you can discard any commits you make in this
2026-11-25T17:09:59.8635897Z state without impacting any branches by performing another checkout.
2026-11-25T17:09:59.8636013Z 
2026-11-25T17:09:59.8636567Z If you want to create a new branch to retain commits you create, you may
2026-11-25T17:09:59.8637195Z do so (now or later) by using -b with the checkout command again. Example:
2026-11-25T17:09:59.8637431Z 
2026-11-25T17:09:59.8637609Z   git checkout -b <new-branch-name>
2026-11-25T17:09:59.8637695Z 
2026-11-25T17:09:59.8637882Z HEAD is now at c18e675 Updated standalone-full-ha.xml
2026-11-25T17:09:59.8656900Z ##[command]git config http.http://apidevops.caixa/projetos/Caixa/_git/SIGEC-portabilidade-config.extraheader "AUTHORIZATION: placeholder_ef26684b-012d-4bbd-a608-da2f223000bd"
2026-11-25T17:09:59.8835349Z ##[command]git config http.sslVerify "false"
2026-11-25T17:09:59.8886415Z Downloaded linked artifact _SIGEC-portabilidade-config
2026-11-25T17:09:59.8887661Z Starting artifacts download...
2026-11-25T17:09:59.8895350Z Downloading linked artifact _SIGEC-portabilidade-online of type Build...
2026-11-25T17:09:59.8895580Z Ensuring artifact folder /opt/ads-agent/_work/r12503/a/_SIGEC-portabilidade-online exists and is clean.
2026-11-25T17:09:59.8944823Z Preparing to get the list of available artifacts from build
2026-11-25T17:10:00.8114256Z ##[warning]No artifacts are available in the build 878866.
2026-11-25T17:10:00.8145913Z Downloaded linked artifact _SIGEC-portabilidade-online
2026-11-25T17:10:00.8147138Z Starting artifacts download...
2026-11-25T17:10:00.8147572Z Downloading linked artifact terraform-esteira of type TFGit...
2026-11-25T17:10:00.8147926Z Ensuring artifact folder /opt/ads-agent/_work/r12503/a/terraform-esteira exists and is clean.
2026-11-25T17:10:00.8149350Z Syncing repository: 480084d9-f83f-41ea-a204-898969c490fd (Git)
2026-11-25T17:10:00.8179681Z ##[command]git version
2026-11-25T17:10:00.8209120Z git version 2.22.1
2026-11-25T17:10:00.8218822Z ##[command]git init "/opt/ads-agent/_work/r12503/a/terraform-esteira"
2026-11-25T17:10:00.8257238Z Initialized empty Git repository in /opt/ads-agent/_work/r12503/a/terraform-esteira/.git/
2026-11-25T17:10:00.8261367Z ##[command]git remote add origin http://apidevops.caixa/projetos/Infraestrutura/_git/esteira-vm-release-terraform
2026-11-25T17:10:00.8294420Z ##[command]git config gc.auto 0
2026-11-25T17:10:00.8324663Z ##[command]git config --get-all http.http://apidevops.caixa/projetos/Infraestrutura/_git/esteira-vm-release-terraform.extraheader
2026-11-25T17:10:00.8353188Z ##[command]git config --get-all http.proxy
2026-11-25T17:10:00.8381824Z ##[command]git -c http.extraheader="AUTHORIZATION: bearer ***" -c http.sslVerify=false fetch --tags --prune --prune-tags --progress --no-recurse-submodules origin
2026-11-25T17:10:00.8643693Z remote: Azure Repos        
2026-11-25T17:10:00.8682417Z remote: 
2026-11-25T17:10:00.8682595Z remote: Found 1801 objects to send. (3 ms)        
2026-11-25T17:10:00.8725306Z 
2026-11-25T17:10:00.8725438Z                                                                                 
2026-11-25T17:10:00.8727961Z Receiving objects:   0% (1/1801)
2026-11-25T17:10:00.8728092Z 
2026-11-25T17:10:00.8728146Z                                                                                 
2026-11-25T17:10:00.8730275Z Receiving objects:   1% (19/1801)
2026-11-25T17:10:00.8730323Z 
2026-11-25T17:10:00.8730558Z                                                                                 
2026-11-25T17:10:00.8733192Z Receiving objects:   2% (37/1801)
2026-11-25T17:10:00.8733246Z 
2026-11-25T17:10:00.8733342Z                                                                                 
2026-11-25T17:10:00.8736167Z Receiving objects:   3% (55/1801)
2026-11-25T17:10:00.8736249Z 
2026-11-25T17:10:00.8736331Z                                                                                 
2026-11-25T17:10:00.8738672Z Receiving objects:   4% (73/1801)
2026-11-25T17:10:00.8738734Z 
2026-11-25T17:10:00.8738815Z                                                                                 
2026-11-25T17:10:00.8741218Z Receiving objects:   5% (91/1801)
2026-11-25T17:10:00.8741264Z 
2026-11-25T17:10:00.8741386Z                                                                                 
2026-11-25T17:10:00.8743386Z Receiving objects:   6% (109/1801)
2026-11-25T17:10:00.8743435Z 
2026-11-25T17:10:00.8743565Z                                                                                 
2026-11-25T17:10:00.8746542Z Receiving objects:   7% (127/1801)
2026-11-25T17:10:00.8746713Z 
2026-11-25T17:10:00.8746804Z                                                                                 
2026-11-25T17:10:00.8749584Z Receiving objects:   8% (145/1801)
2026-11-25T17:10:00.8749666Z 
2026-11-25T17:10:00.8749729Z                                                                                 
2026-11-25T17:10:00.8752500Z Receiving objects:   9% (163/1801)
2026-11-25T17:10:00.8752583Z 
2026-11-25T17:10:00.8752658Z                                                                                 
2026-11-25T17:10:00.8755296Z Receiving objects:  10% (181/1801)
2026-11-25T17:10:00.8757352Z 
2026-11-25T17:10:00.8757423Z                                                                                 
2026-11-25T17:10:00.8757721Z Receiving objects:  11% (199/1801)
2026-11-25T17:10:00.8757768Z 
2026-11-25T17:10:00.8757889Z                                                                                 
2026-11-25T17:10:00.8760508Z Receiving objects:  12% (217/1801)
2026-11-25T17:10:00.8760556Z 
2026-11-25T17:10:00.8760697Z                                                                                 
2026-11-25T17:10:00.8762021Z Receiving objects:  13% (235/1801)
2026-11-25T17:10:00.8762068Z 
2026-11-25T17:10:00.8762213Z                                                                                 
2026-11-25T17:10:00.8763782Z Receiving objects:  14% (253/1801)
2026-11-25T17:10:00.8763830Z 
2026-11-25T17:10:00.8763985Z                                                                                 
2026-11-25T17:10:00.8767603Z Receiving objects:  15% (271/1801)
2026-11-25T17:10:00.8767695Z 
2026-11-25T17:10:00.8767778Z                                                                                 
2026-11-25T17:10:00.8768090Z Receiving objects:  16% (289/1801)
2026-11-25T17:10:00.8768152Z 
2026-11-25T17:10:00.8768199Z                                                                                 
2026-11-25T17:10:00.8770260Z Receiving objects:  17% (307/1801)
2026-11-25T17:10:00.8770342Z 
2026-11-25T17:10:00.8770456Z                                                                                 
2026-11-25T17:10:00.8773038Z Receiving objects:  18% (325/1801)
2026-11-25T17:10:00.8773085Z 
2026-11-25T17:10:00.8773206Z                                                                                 
2026-11-25T17:10:00.8774839Z Receiving objects:  19% (343/1801)
2026-11-25T17:10:00.8774883Z 
2026-11-25T17:10:00.8774986Z                                                                                 
2026-11-25T17:10:00.8777111Z Receiving objects:  20% (361/1801)
2026-11-25T17:10:00.8777157Z 
2026-11-25T17:10:00.8777300Z                                                                                 
2026-11-25T17:10:00.8779486Z Receiving objects:  21% (379/1801)
2026-11-25T17:10:00.8779549Z 
2026-11-25T17:10:00.8779625Z                                                                                 
2026-11-25T17:10:00.8782522Z Receiving objects:  22% (397/1801)
2026-11-25T17:10:00.8782581Z 
2026-11-25T17:10:00.8782722Z                                                                                 
2026-11-25T17:10:00.8785602Z Receiving objects:  23% (415/1801)
2026-11-25T17:10:00.8785669Z 
2026-11-25T17:10:00.8785927Z                                                                                 
2026-11-25T17:10:00.8788116Z Receiving objects:  24% (433/1801)
2026-11-25T17:10:00.8788204Z 
2026-11-25T17:10:00.8788260Z                                                                                 
2026-11-25T17:10:00.8790155Z Receiving objects:  25% (451/1801)
2026-11-25T17:10:00.8790202Z 
2026-11-25T17:10:00.8790334Z                                                                                 
2026-11-25T17:10:00.8791771Z Receiving objects:  26% (469/1801)
2026-11-25T17:10:00.8791861Z 
2026-11-25T17:10:00.8791936Z                                                                                 
2026-11-25T17:10:00.8794760Z Receiving objects:  27% (487/1801)
2026-11-25T17:10:00.8794808Z 
2026-11-25T17:10:00.8794856Z                                                                                 
2026-11-25T17:10:00.8797499Z Receiving objects:  28% (505/1801)
2026-11-25T17:10:00.8797553Z 
2026-11-25T17:10:00.8797613Z                                                                                 
2026-11-25T17:10:00.8799847Z Receiving objects:  29% (523/1801)
2026-11-25T17:10:00.8799906Z 
2026-11-25T17:10:00.8800030Z                                                                                 
2026-11-25T17:10:00.8803002Z Receiving objects:  30% (541/1801)
2026-11-25T17:10:00.8803050Z 
2026-11-25T17:10:00.8803167Z                                                                                 
2026-11-25T17:10:00.8805552Z Receiving objects:  31% (559/1801)
2026-11-25T17:10:00.8805600Z 
2026-11-25T17:10:00.8805726Z                                                                                 
2026-11-25T17:10:00.8808002Z Receiving objects:  32% (577/1801)
2026-11-25T17:10:00.8808048Z 
2026-11-25T17:10:00.8808179Z                                                                                 
2026-11-25T17:10:00.8810916Z Receiving objects:  33% (595/1801)
2026-11-25T17:10:00.8810962Z 
2026-11-25T17:10:00.8811125Z                                                                                 
2026-11-25T17:10:00.8814258Z Receiving objects:  34% (613/1801)
2026-11-25T17:10:00.8814320Z 
2026-11-25T17:10:00.8814403Z                                                                                 
2026-11-25T17:10:00.8816173Z Receiving objects:  35% (631/1801)
2026-11-25T17:10:00.8816233Z 
2026-11-25T17:10:00.8816358Z                                                                                 
2026-11-25T17:10:00.8818984Z Receiving objects:  36% (649/1801)
2026-11-25T17:10:00.8819032Z 
2026-11-25T17:10:00.8819150Z                                                                                 
2026-11-25T17:10:00.8821040Z Receiving objects:  37% (667/1801)
2026-11-25T17:10:00.8821086Z 
2026-11-25T17:10:00.8821227Z                                                                                 
2026-11-25T17:10:00.8823917Z Receiving objects:  38% (685/1801)
2026-11-25T17:10:00.8823965Z 
2026-11-25T17:10:00.8824081Z                                                                                 
2026-11-25T17:10:00.8826543Z Receiving objects:  39% (703/1801)
2026-11-25T17:10:00.8826674Z 
2026-11-25T17:10:00.8826799Z                                                                                 
2026-11-25T17:10:00.8830256Z Receiving objects:  40% (721/1801)
2026-11-25T17:10:00.8830313Z 
2026-11-25T17:10:00.8830423Z                                                                                 
2026-11-25T17:10:00.8834190Z Receiving objects:  41% (739/1801)
2026-11-25T17:10:00.8834234Z 
2026-11-25T17:10:00.8834384Z                                                                                 
2026-11-25T17:10:00.8835896Z Receiving objects:  42% (757/1801)
2026-11-25T17:10:00.8835941Z 
2026-11-25T17:10:00.8836062Z                                                                                 
2026-11-25T17:10:00.8837508Z Receiving objects:  43% (775/1801)
2026-11-25T17:10:00.8837555Z 
2026-11-25T17:10:00.8837664Z                                                                                 
2026-11-25T17:10:00.8839501Z Receiving objects:  44% (793/1801)
2026-11-25T17:10:00.8839586Z 
2026-11-25T17:10:00.8839660Z                                                                                 
2026-11-25T17:10:00.8842152Z Receiving objects:  45% (811/1801)
2026-11-25T17:10:00.8842207Z 
2026-11-25T17:10:00.8842325Z                                                                                 
2026-11-25T17:10:00.8844685Z Receiving objects:  46% (829/1801)
2026-11-25T17:10:00.8844768Z 
2026-11-25T17:10:00.8844827Z                                                                                 
2026-11-25T17:10:00.8846323Z Receiving objects:  47% (847/1801)
2026-11-25T17:10:00.8846368Z 
2026-11-25T17:10:00.8846487Z                                                                                 
2026-11-25T17:10:00.8849155Z Receiving objects:  48% (865/1801)
2026-11-25T17:10:00.8849216Z 
2026-11-25T17:10:00.8849329Z                                                                                 
2026-11-25T17:10:00.8851408Z Receiving objects:  49% (883/1801)
2026-11-25T17:10:00.8851468Z 
2026-11-25T17:10:00.8851574Z                                                                                 
2026-11-25T17:10:00.8854185Z Receiving objects:  50% (901/1801)
2026-11-25T17:10:00.8854229Z 
2026-11-25T17:10:00.8854358Z                                                                                 
2026-11-25T17:10:00.8857730Z Receiving objects:  51% (919/1801)
2026-11-25T17:10:00.8857829Z 
2026-11-25T17:10:00.8857889Z                                                                                 
2026-11-25T17:10:00.8860764Z Receiving objects:  52% (937/1801)
2026-11-25T17:10:00.8860815Z 
2026-11-25T17:10:00.8860893Z                                                                                 
2026-11-25T17:10:00.8864020Z Receiving objects:  53% (955/1801)
2026-11-25T17:10:00.8864067Z 
2026-11-25T17:10:00.8864203Z                                                                                 
2026-11-25T17:10:00.8867507Z Receiving objects:  54% (973/1801)
2026-11-25T17:10:00.8867564Z 
2026-11-25T17:10:00.8867689Z                                                                                 
2026-11-25T17:10:00.8869745Z Receiving objects:  55% (991/1801)
2026-11-25T17:10:00.8869803Z 
2026-11-25T17:10:00.8869909Z                                                                                 
2026-11-25T17:10:00.8873014Z Receiving objects:  56% (1009/1801)
2026-11-25T17:10:00.8873063Z 
2026-11-25T17:10:00.8873161Z                                                                                 
2026-11-25T17:10:00.8876764Z Receiving objects:  57% (1027/1801)
2026-11-25T17:10:00.8876839Z 
2026-11-25T17:10:00.8876941Z                                                                                 
2026-11-25T17:10:00.8879384Z Receiving objects:  58% (1045/1801)
2026-11-25T17:10:00.8879451Z 
2026-11-25T17:10:00.8879524Z                                                                                 
2026-11-25T17:10:00.8882646Z Receiving objects:  59% (1063/1801)
2026-11-25T17:10:00.8882705Z 
2026-11-25T17:10:00.8882811Z                                                                                 
2026-11-25T17:10:00.8885987Z Receiving objects:  60% (1081/1801)
2026-11-25T17:10:00.8886035Z 
2026-11-25T17:10:00.8886159Z                                                                                 
2026-11-25T17:10:00.8889838Z Receiving objects:  61% (1099/1801)
2026-11-25T17:10:00.8889884Z 
2026-11-25T17:10:00.8890026Z                                                                                 
2026-11-25T17:10:00.8893281Z Receiving objects:  62% (1117/1801)
2026-11-25T17:10:00.8893340Z 
2026-11-25T17:10:00.8893468Z                                                                                 
2026-11-25T17:10:00.8896498Z Receiving objects:  63% (1135/1801)
2026-11-25T17:10:00.8896679Z 
2026-11-25T17:10:00.8896777Z                                                                                 
2026-11-25T17:10:00.8900130Z Receiving objects:  64% (1153/1801)
2026-11-25T17:10:00.8900211Z 
2026-11-25T17:10:00.8900263Z                                                                                 
2026-11-25T17:10:00.8903121Z Receiving objects:  65% (1171/1801)
2026-11-25T17:10:00.8903172Z 
2026-11-25T17:10:00.8903291Z                                                                                 
2026-11-25T17:10:00.8906318Z Receiving objects:  66% (1189/1801)
2026-11-25T17:10:00.8906377Z 
2026-11-25T17:10:00.8906490Z                                                                                 
2026-11-25T17:10:00.8909083Z Receiving objects:  67% (1207/1801)
2026-11-25T17:10:00.8909131Z 
2026-11-25T17:10:00.8909248Z                                                                                 
2026-11-25T17:10:00.8909934Z Receiving objects:  68% (1225/1801)
2026-11-25T17:10:00.8909983Z 
2026-11-25T17:10:00.8910027Z                                                                                 
2026-11-25T17:10:00.8913452Z Receiving objects:  69% (1243/1801)
2026-11-25T17:10:00.8913499Z 
2026-11-25T17:10:00.8913631Z                                                                                 
2026-11-25T17:10:00.8916664Z Receiving objects:  70% (1261/1801)
2026-11-25T17:10:00.8916728Z 
2026-11-25T17:10:00.8916830Z                                                                                 
2026-11-25T17:10:00.8920428Z Receiving objects:  71% (1279/1801)
2026-11-25T17:10:00.8920492Z 
2026-11-25T17:10:00.8920618Z                                                                                 
2026-11-25T17:10:00.8924494Z Receiving objects:  72% (1297/1801)
2026-11-25T17:10:00.8924585Z 
2026-11-25T17:10:00.8924637Z                                                                                 
2026-11-25T17:10:00.8927148Z Receiving objects:  73% (1315/1801)
2026-11-25T17:10:00.8927197Z 
2026-11-25T17:10:00.8927368Z                                                                                 
2026-11-25T17:10:00.8930372Z Receiving objects:  74% (1333/1801)
2026-11-25T17:10:00.8930432Z 
2026-11-25T17:10:00.8930556Z                                                                                 
2026-11-25T17:10:00.8933589Z Receiving objects:  75% (1351/1801)
2026-11-25T17:10:00.8933809Z 
2026-11-25T17:10:00.8933876Z                                                                                 
2026-11-25T17:10:00.8936677Z Receiving objects:  76% (1369/1801)
2026-11-25T17:10:00.8936724Z 
2026-11-25T17:10:00.8936856Z                                                                                 
2026-11-25T17:10:00.8939434Z Receiving objects:  77% (1387/1801)
2026-11-25T17:10:00.8939479Z 
2026-11-25T17:10:00.8939625Z                                                                                 
2026-11-25T17:10:00.8943157Z Receiving objects:  78% (1405/1801)
2026-11-25T17:10:00.8943205Z 
2026-11-25T17:10:00.8943361Z                                                                                 
2026-11-25T17:10:00.8947191Z Receiving objects:  79% (1423/1801)
2026-11-25T17:10:00.8947314Z 
2026-11-25T17:10:00.8947377Z                                                                                 
2026-11-25T17:10:00.8950580Z Receiving objects:  80% (1441/1801)
2026-11-25T17:10:00.8950668Z 
2026-11-25T17:10:00.8950743Z                                                                                 
2026-11-25T17:10:00.8954690Z Receiving objects:  81% (1459/1801)
2026-11-25T17:10:00.8954736Z 
2026-11-25T17:10:00.8954888Z                                                                                 
2026-11-25T17:10:00.8959523Z Receiving objects:  82% (1477/1801)
2026-11-25T17:10:00.8959639Z 
2026-11-25T17:10:00.8959710Z                                                                                 
2026-11-25T17:10:00.8963704Z Receiving objects:  83% (1495/1801)
2026-11-25T17:10:00.8963794Z 
2026-11-25T17:10:00.8963854Z                                                                                 
2026-11-25T17:10:00.8968074Z Receiving objects:  84% (1513/1801)
2026-11-25T17:10:00.8968187Z 
2026-11-25T17:10:00.8968265Z                                                                                 
2026-11-25T17:10:00.8972259Z Receiving objects:  85% (1531/1801)
2026-11-25T17:10:00.8972338Z 
2026-11-25T17:10:00.8972427Z                                                                                 
2026-11-25T17:10:00.8975460Z Receiving objects:  86% (1549/1801)
2026-11-25T17:10:00.8975553Z 
2026-11-25T17:10:00.8975744Z                                                                                 
2026-11-25T17:10:00.8979883Z Receiving objects:  87% (1567/1801)
2026-11-25T17:10:00.8979954Z 
2026-11-25T17:10:00.8980145Z                                                                                 
2026-11-25T17:10:00.8984730Z Receiving objects:  88% (1585/1801)
2026-11-25T17:10:00.8984837Z 
2026-11-25T17:10:00.8985123Z                                                                                 
2026-11-25T17:10:00.8987930Z Receiving objects:  89% (1603/1801)
2026-11-25T17:10:00.8988031Z 
2026-11-25T17:10:00.8988117Z                                                                                 
2026-11-25T17:10:00.8991801Z Receiving objects:  90% (1621/1801)
2026-11-25T17:10:00.8991892Z 
2026-11-25T17:10:00.8991990Z                                                                                 
2026-11-25T17:10:00.8997488Z Receiving objects:  91% (1639/1801)
2026-11-25T17:10:00.8997597Z 
2026-11-25T17:10:00.8997696Z                                                                                 
2026-11-25T17:10:00.9002489Z Receiving objects:  92% (1657/1801)
2026-11-25T17:10:00.9002583Z 
2026-11-25T17:10:00.9002659Z                                                                                 
2026-11-25T17:10:00.9006797Z Receiving objects:  93% (1675/1801)
2026-11-25T17:10:00.9006857Z 
2026-11-25T17:10:00.9007002Z                                                                                 
2026-11-25T17:10:00.9011544Z Receiving objects:  94% (1693/1801)
2026-11-25T17:10:00.9011689Z 
2026-11-25T17:10:00.9011811Z                                                                                 
2026-11-25T17:10:00.9016542Z Receiving objects:  95% (1711/1801)
2026-11-25T17:10:00.9016708Z 
2026-11-25T17:10:00.9016791Z                                                                                 
2026-11-25T17:10:00.9021087Z Receiving objects:  96% (1729/1801)
2026-11-25T17:10:00.9021159Z 
2026-11-25T17:10:00.9021240Z                                                                                 
2026-11-25T17:10:00.9025542Z Receiving objects:  97% (1747/1801)
2026-11-25T17:10:00.9025626Z 
2026-11-25T17:10:00.9025712Z                                                                                 
2026-11-25T17:10:00.9030065Z Receiving objects:  98% (1765/1801)
2026-11-25T17:10:00.9030159Z 
2026-11-25T17:10:00.9030263Z                                                                                 
2026-11-25T17:10:00.9034665Z Receiving objects:  99% (1783/1801)
2026-11-25T17:10:00.9034761Z 
2026-11-25T17:10:00.9034849Z                                                                                 
2026-11-25T17:10:00.9034966Z Receiving objects: 100% (1801/1801)
2026-11-25T17:10:00.9035039Z 
2026-11-25T17:10:00.9035110Z                                                                                 
2026-11-25T17:10:00.9035243Z Receiving objects: 100% (1801/1801), 1.03 MiB | 34.05 MiB/s, done.
2026-11-25T17:10:00.9036232Z 
2026-11-25T17:10:00.9036315Z                                                                                 
2026-11-25T17:10:00.9037877Z Resolving deltas:   0% (0/46)
2026-11-25T17:10:00.9037971Z 
2026-11-25T17:10:00.9038043Z                                                                                 
2026-11-25T17:10:00.9038151Z Resolving deltas:   8% (4/46)
2026-11-25T17:10:00.9038217Z 
2026-11-25T17:10:00.9038297Z                                                                                 
2026-11-25T17:10:00.9038391Z Resolving deltas:  10% (5/46)
2026-11-25T17:10:00.9038476Z 
2026-11-25T17:10:00.9038543Z                                                                                 
2026-11-25T17:10:00.9038651Z Resolving deltas:  13% (6/46)
2026-11-25T17:10:00.9038715Z 
2026-11-25T17:10:00.9038780Z                                                                                 
2026-11-25T17:10:00.9042384Z Resolving deltas:  15% (7/46)
2026-11-25T17:10:00.9042522Z 
2026-11-25T17:10:00.9042869Z                                                                                 
2026-11-25T17:10:00.9042988Z Resolving deltas:  17% (8/46)
2026-11-25T17:10:00.9043057Z 
2026-11-25T17:10:00.9043125Z                                                                                 
2026-11-25T17:10:00.9043228Z Resolving deltas:  19% (9/46)
2026-11-25T17:10:00.9043302Z 
2026-11-25T17:10:00.9043380Z                                                                                 
2026-11-25T17:10:00.9043467Z Resolving deltas:  36% (17/46)
2026-11-25T17:10:00.9043542Z 
2026-11-25T17:10:00.9043605Z                                                                                 
2026-11-25T17:10:00.9043708Z Resolving deltas:  45% (21/46)
2026-11-25T17:10:00.9043871Z 
2026-11-25T17:10:00.9043992Z                                                                                 
2026-11-25T17:10:00.9044059Z Resolving deltas:  47% (22/46)
2026-11-25T17:10:00.9044102Z 
2026-11-25T17:10:00.9044163Z                                                                                 
2026-11-25T17:10:00.9044235Z Resolving deltas:  50% (23/46)
2026-11-25T17:10:00.9044298Z 
2026-11-25T17:10:00.9044347Z                                                                                 
2026-11-25T17:10:00.9044425Z Resolving deltas:  52% (24/46)
2026-11-25T17:10:00.9044609Z 
2026-11-25T17:10:00.9044666Z                                                                                 
2026-11-25T17:10:00.9044723Z Resolving deltas:  54% (25/46)
2026-11-25T17:10:00.9044766Z 
2026-11-25T17:10:00.9044822Z                                                                                 
2026-11-25T17:10:00.9044891Z Resolving deltas:  56% (26/46)
2026-11-25T17:10:00.9044933Z 
2026-11-25T17:10:00.9044992Z                                                                                 
2026-11-25T17:10:00.9045058Z Resolving deltas:  58% (27/46)
2026-11-25T17:10:00.9045097Z 
2026-11-25T17:10:00.9045151Z                                                                                 
2026-11-25T17:10:00.9045209Z Resolving deltas:  60% (28/46)
2026-11-25T17:10:00.9045264Z 
2026-11-25T17:10:00.9045310Z                                                                                 
2026-11-25T17:10:00.9045378Z Resolving deltas:  63% (29/46)
2026-11-25T17:10:00.9045420Z 
2026-11-25T17:10:00.9045464Z                                                                                 
2026-11-25T17:10:00.9045529Z Resolving deltas:  65% (30/46)
2026-11-25T17:10:00.9045569Z 
2026-11-25T17:10:00.9045621Z                                                                                 
2026-11-25T17:10:00.9045680Z Resolving deltas:  67% (31/46)
2026-11-25T17:10:00.9045730Z 
2026-11-25T17:10:00.9045775Z                                                                                 
2026-11-25T17:10:00.9045842Z Resolving deltas:  69% (32/46)
2026-11-25T17:10:00.9045882Z 
2026-11-25T17:10:00.9045933Z                                                                                 
2026-11-25T17:10:00.9045989Z Resolving deltas:  71% (33/46)
2026-11-25T17:10:00.9046086Z 
2026-11-25T17:10:00.9046141Z                                                                                 
2026-11-25T17:10:00.9046199Z Resolving deltas:  73% (34/46)
2026-11-25T17:10:00.9046248Z 
2026-11-25T17:10:00.9046294Z                                                                                 
2026-11-25T17:10:00.9046358Z Resolving deltas:  76% (35/46)
2026-11-25T17:10:00.9046398Z 
2026-11-25T17:10:00.9046448Z                                                                                 
2026-11-25T17:10:00.9046512Z Resolving deltas:  78% (36/46)
2026-11-25T17:10:00.9046560Z 
2026-11-25T17:10:00.9046692Z                                                                                 
2026-11-25T17:10:00.9046824Z Resolving deltas:  89% (41/46)
2026-11-25T17:10:00.9046870Z 
2026-11-25T17:10:00.9046914Z                                                                                 
2026-11-25T17:10:00.9047016Z Resolving deltas:  91% (42/46)
2026-11-25T17:10:00.9047059Z 
2026-11-25T17:10:00.9047152Z                                                                                 
2026-11-25T17:10:00.9047212Z Resolving deltas:  93% (43/46)
2026-11-25T17:10:00.9047295Z 
2026-11-25T17:10:00.9047345Z                                                                                 
2026-11-25T17:10:00.9047446Z Resolving deltas:  95% (44/46)
2026-11-25T17:10:00.9047491Z 
2026-11-25T17:10:00.9047534Z                                                                                 
2026-11-25T17:10:00.9047617Z Resolving deltas:  97% (45/46)
2026-11-25T17:10:00.9047795Z 
2026-11-25T17:10:00.9047840Z                                                                                 
2026-11-25T17:10:00.9047941Z Resolving deltas: 100% (46/46)
2026-11-25T17:10:00.9047983Z 
2026-11-25T17:10:00.9048067Z                                                                                 
2026-11-25T17:10:00.9048132Z Resolving deltas: 100% (46/46), done.
2026-11-25T17:10:00.9289473Z From http://apidevops.caixa/projetos/Infraestrutura/_git/esteira-vm-release-terraform
2026-11-25T17:10:00.9289648Z  * [new branch]      20019f3d-revert-from-main -> origin/20019f3d-revert-from-main
2026-11-25T17:10:00.9289807Z  * [new branch]      Backup-main             -> origin/Backup-main
2026-11-25T17:10:00.9290501Z  * [new branch]      Fix_2_VLAN_BACKUP       -> origin/Fix_2_VLAN_BACKUP
2026-11-25T17:10:00.9291126Z  * [new branch]      branch-from-821ff582    -> origin/branch-from-821ff582
2026-11-25T17:10:00.9292095Z  * [new branch]      datastore-id            -> origin/datastore-id
2026-11-25T17:10:00.9292793Z  * [new branch]      datastore_cluster       -> origin/datastore_cluster
2026-11-25T17:10:00.9299939Z  * [new branch]      develop                 -> origin/develop
2026-11-25T17:10:00.9300596Z  * [new branch]      feature/resolve-network-bck-1 -> origin/feature/resolve-network-bck-1
2026-11-25T17:10:00.9300712Z  * [new branch]      fix-oracle-cli-v2       -> origin/fix-oracle-cli-v2
2026-11-25T17:10:00.9300872Z  * [new branch]      fix_disco_logs          -> origin/fix_disco_logs
2026-11-25T17:10:00.9300967Z  * [new branch]      fix_insights_2          -> origin/fix_insights_2
2026-11-25T17:10:00.9301110Z  * [new branch]      fix_insigths            -> origin/fix_insigths
2026-11-25T17:10:00.9301202Z  * [new branch]      fix_msg_notes           -> origin/fix_msg_notes
2026-11-25T17:10:00.9301376Z  * [new branch]      fix_satellite           -> origin/fix_satellite
2026-11-25T17:10:00.9323785Z  * [new branch]      fix_subscription_manager -> origin/fix_subscription_manager
2026-11-25T17:10:00.9324033Z  * [new branch]      fix_tag_addr_categoria  -> origin/fix_tag_addr_categoria
2026-11-25T17:10:00.9324352Z  * [new branch]      fix_tags_vcenter_2      -> origin/fix_tags_vcenter_2
2026-11-25T17:10:00.9324616Z  * [new branch]      fix_url_satellite       -> origin/fix_url_satellite
2026-11-25T17:10:00.9324772Z  * [new branch]      logs                    -> origin/logs
2026-11-25T17:10:00.9324957Z  * [new branch]      logs2                   -> origin/logs2
2026-11-25T17:10:00.9325291Z  * [new branch]      main                    -> origin/main
2026-11-25T17:10:00.9325593Z  * [new branch]      num_cores_per_socket    -> origin/num_cores_per_socket
2026-11-25T17:10:00.9325765Z  * [new branch]      silce_dsc               -> origin/silce_dsc
2026-11-25T17:10:00.9325964Z  * [new branch]      teste-bkp               -> origin/teste-bkp
2026-11-25T17:10:00.9326120Z  * [new branch]      teste-maintf            -> origin/teste-maintf
2026-11-25T17:10:00.9326346Z  * [new branch]      teste-rede-bkp          -> origin/teste-rede-bkp
2026-11-25T17:10:00.9326518Z  * [new branch]      teste-sh-vcenter-group2 -> origin/teste-sh-vcenter-group2
2026-11-25T17:10:00.9326855Z  * [new branch]      teste-sh-vcenter-group6 -> origin/teste-sh-vcenter-group6
2026-11-25T17:10:00.9327076Z  * [new branch]      teste-vsphere-uri       -> origin/teste-vsphere-uri
2026-11-25T17:10:00.9356172Z ##[command]git checkout --progress --force b80af7bae3a3d50a77de8ad8319b18a0d654cb71
2026-11-25T17:10:00.9439232Z Note: checking out 'b80af7bae3a3d50a77de8ad8319b18a0d654cb71'.
2026-11-25T17:10:00.9439406Z 
2026-11-25T17:10:00.9439552Z You are in 'detached HEAD' state. You can look around, make experimental
2026-11-25T17:10:00.9439764Z changes and commit them, and you can discard any commits you make in this
2026-11-25T17:10:00.9439956Z state without impacting any branches by performing another checkout.
2026-11-25T17:10:00.9440064Z 
2026-11-25T17:10:00.9440209Z If you want to create a new branch to retain commits you create, you may
2026-11-25T17:10:00.9440390Z do so (now or later) by using -b with the checkout command again. Example:
2026-11-25T17:10:00.9440500Z 
2026-11-25T17:10:00.9440611Z   git checkout -b <new-branch-name>
2026-11-25T17:10:00.9440691Z 
2026-11-25T17:10:00.9440859Z HEAD is now at b80af7b Merged PR 158183: Updated get_tag_vcenter.py
2026-11-25T17:10:00.9442500Z ##[command]git config http.http://apidevops.caixa/projetos/Infraestrutura/_git/esteira-vm-release-terraform.extraheader "AUTHORIZATION: placeholder_9aed759e-4299-42ee-988b-bd18e24e4247"
2026-11-25T17:10:00.9485464Z ##[command]git config http.sslVerify "false"
2026-11-25T17:10:00.9523536Z Downloaded linked artifact terraform-esteira
2026-11-25T17:10:00.9524358Z Starting artifacts download...
2026-11-25T17:10:00.9524798Z Downloading linked artifact esteira-jboss-vm-v2 of type TFGit...
2026-11-25T17:10:00.9524976Z Ensuring artifact folder /opt/ads-agent/_work/r12503/a/esteira-jboss-vm-v2 exists and is clean.
2026-11-25T17:10:00.9526059Z Syncing repository: a7cb53b6-b5a3-49bf-b1e5-1f68233e8704 (Git)
2026-11-25T17:10:00.9556439Z ##[command]git version
2026-11-25T17:10:00.9582712Z git version 2.22.1
2026-11-25T17:10:00.9587351Z ##[command]git init "/opt/ads-agent/_work/r12503/a/esteira-jboss-vm-v2"
2026-11-25T17:10:00.9623171Z Initialized empty Git repository in /opt/ads-agent/_work/r12503/a/esteira-jboss-vm-v2/.git/
2026-11-25T17:10:00.9624462Z ##[command]git remote add origin http://apidevops.caixa/projetos/Infraestrutura/_git/esteira-jboss-vm-v2
2026-11-25T17:10:00.9655351Z ##[command]git config gc.auto 0
2026-11-25T17:10:00.9682857Z ##[command]git config --get-all http.http://apidevops.caixa/projetos/Infraestrutura/_git/esteira-jboss-vm-v2.extraheader
2026-11-25T17:10:00.9710958Z ##[command]git config --get-all http.proxy
2026-11-25T17:10:00.9740412Z ##[command]git -c http.extraheader="AUTHORIZATION: bearer ***" -c http.sslVerify=false fetch --tags --prune --prune-tags --progress --no-recurse-submodules origin
2026-11-25T17:10:01.0029798Z remote: Azure Repos        
2026-11-25T17:10:01.0473366Z remote: 
2026-11-25T17:10:01.0473458Z remote: Found 16897 objects to send. (44 ms)        
2026-11-25T17:10:01.0654240Z 
2026-11-25T17:10:01.0654424Z                                                                                 
2026-11-25T17:10:01.0663096Z Receiving objects:   0% (1/16897)
2026-11-25T17:10:01.0663166Z 
2026-11-25T17:10:01.0663238Z                                                                                 
2026-11-25T17:10:01.0667110Z Receiving objects:   1% (169/16897)
2026-11-25T17:10:01.0667270Z 
2026-11-25T17:10:01.0667341Z                                                                                 
2026-11-25T17:10:01.0675291Z Receiving objects:   2% (338/16897)
2026-11-25T17:10:01.0675414Z 
2026-11-25T17:10:01.0675714Z                                                                                 
2026-11-25T17:10:01.0683980Z Receiving objects:   3% (507/16897)
2026-11-25T17:10:01.0684149Z 
2026-11-25T17:10:01.0684226Z                                                                                 
2026-11-25T17:10:01.0697988Z Receiving objects:   4% (676/16897)
2026-11-25T17:10:01.0698157Z 
2026-11-25T17:10:01.0698242Z                                                                                 
2026-11-25T17:10:01.0720052Z Receiving objects:   5% (845/16897)
2026-11-25T17:10:01.0720211Z 
2026-11-25T17:10:01.0720277Z                                                                                 
2026-11-25T17:10:01.0741074Z Receiving objects:   6% (1014/16897)
2026-11-25T17:10:01.0741225Z 
2026-11-25T17:10:01.0741292Z                                                                                 
2026-11-25T17:10:01.0763958Z Receiving objects:   7% (1183/16897)
2026-11-25T17:10:01.0764081Z 
2026-11-25T17:10:01.0764264Z                                                                                 
2026-11-25T17:10:01.0799743Z Receiving objects:   8% (1352/16897)
2026-11-25T17:10:01.0799867Z 
2026-11-25T17:10:01.0800043Z                                                                                 
2026-11-25T17:10:01.0830583Z Receiving objects:   9% (1521/16897)
2026-11-25T17:10:01.0830808Z 
2026-11-25T17:10:01.0830888Z                                                                                 
2026-11-25T17:10:01.0859140Z Receiving objects:  10% (1690/16897)
2026-11-25T17:10:01.0859187Z 
2026-11-25T17:10:01.0859387Z                                                                                 
2026-11-25T17:10:01.0886781Z Receiving objects:  11% (1859/16897)
2026-11-25T17:10:01.0886914Z 
2026-11-25T17:10:01.0887008Z                                                                                 
2026-11-25T17:10:01.0910940Z Receiving objects:  12% (2028/16897)
2026-11-25T17:10:01.0911112Z 
2026-11-25T17:10:01.0911301Z                                                                                 
2026-11-25T17:10:01.0938176Z Receiving objects:  13% (2197/16897)
2026-11-25T17:10:01.0938232Z 
2026-11-25T17:10:01.0938448Z                                                                                 
2026-11-25T17:10:01.0968065Z Receiving objects:  14% (2366/16897)
2026-11-25T17:10:01.0968226Z 
2026-11-25T17:10:01.0968280Z                                                                                 
2026-11-25T17:10:01.0994169Z Receiving objects:  15% (2535/16897)
2026-11-25T17:10:01.0994256Z 
2026-11-25T17:10:01.0994309Z                                                                                 
2026-11-25T17:10:01.1013495Z Receiving objects:  16% (2704/16897)
2026-11-25T17:10:01.1013551Z 
2026-11-25T17:10:01.1013813Z                                                                                 
2026-11-25T17:10:01.1033466Z Receiving objects:  17% (2873/16897)
2026-11-25T17:10:01.1033641Z 
2026-11-25T17:10:01.1033705Z                                                                                 
2026-11-25T17:10:01.1054818Z Receiving objects:  18% (3042/16897)
2026-11-25T17:10:01.1054988Z 
2026-11-25T17:10:01.1055057Z                                                                                 
2026-11-25T17:10:01.1082082Z Receiving objects:  19% (3211/16897)
2026-11-25T17:10:01.1082185Z 
2026-11-25T17:10:01.1082293Z                                                                                 
2026-11-25T17:10:01.1110471Z Receiving objects:  20% (3380/16897)
2026-11-25T17:10:01.1110646Z 
2026-11-25T17:10:01.1110859Z                                                                                 
2026-11-25T17:10:01.1137492Z Receiving objects:  21% (3549/16897)
2026-11-25T17:10:01.1137603Z 
2026-11-25T17:10:01.1137840Z                                                                                 
2026-11-25T17:10:01.1163415Z Receiving objects:  22% (3718/16897)
2026-11-25T17:10:01.1163479Z 
2026-11-25T17:10:01.1163761Z                                                                                 
2026-11-25T17:10:01.1170984Z Receiving objects:  23% (3887/16897)
2026-11-25T17:10:01.1171330Z 
2026-11-25T17:10:01.1171509Z                                                                                 
2026-11-25T17:10:01.1177405Z Receiving objects:  24% (4056/16897)
2026-11-25T17:10:01.1177521Z 
2026-11-25T17:10:01.1177634Z                                                                                 
2026-11-25T17:10:01.1183921Z Receiving objects:  25% (4225/16897)
2026-11-25T17:10:01.1184031Z 
2026-11-25T17:10:01.1184142Z                                                                                 
2026-11-25T17:10:01.1187721Z Receiving objects:  26% (4394/16897)
2026-11-25T17:10:01.1187823Z 
2026-11-25T17:10:01.1188003Z                                                                                 
2026-11-25T17:10:01.1200476Z Receiving objects:  27% (4563/16897)
2026-11-25T17:10:01.1200566Z 
2026-11-25T17:10:01.1200736Z                                                                                 
2026-11-25T17:10:01.1209948Z Receiving objects:  28% (4732/16897)
2026-11-25T17:10:01.1210044Z 
2026-11-25T17:10:01.1210160Z                                                                                 
2026-11-25T17:10:01.1227337Z Receiving objects:  29% (4901/16897)
2026-11-25T17:10:01.1292268Z 
2026-11-25T17:10:01.1292558Z                                                                                 
2026-11-25T17:10:01.1292848Z Receiving objects:  30% (5070/16897)
2026-11-25T17:10:01.1292956Z 
2026-11-25T17:10:01.1293066Z                                                                                 
2026-11-25T17:10:01.1293229Z Receiving objects:  31% (5239/16897)
2026-11-25T17:10:01.1293328Z 
2026-11-25T17:10:01.1293416Z                                                                                 
2026-11-25T17:10:01.1293886Z Receiving objects:  32% (5408/16897)
2026-11-25T17:10:01.1293981Z 
2026-11-25T17:10:01.1294078Z                                                                                 
2026-11-25T17:10:01.1294197Z Receiving objects:  33% (5577/16897)
2026-11-25T17:10:01.1294300Z 
2026-11-25T17:10:01.1294389Z                                                                                 
2026-11-25T17:10:01.1294516Z Receiving objects:  34% (5745/16897)
2026-11-25T17:10:01.1294607Z 
2026-11-25T17:10:01.1294700Z                                                                                 
2026-11-25T17:10:01.1294826Z Receiving objects:  35% (5914/16897)
2026-11-25T17:10:01.1294919Z 
2026-11-25T17:10:01.1295014Z                                                                                 
2026-11-25T17:10:01.1295330Z Receiving objects:  36% (6083/16897)
2026-11-25T17:10:01.1295402Z 
2026-11-25T17:10:01.1295483Z                                                                                 
2026-11-25T17:10:01.1344861Z Receiving objects:  37% (6252/16897)
2026-11-25T17:10:01.1344974Z 
2026-11-25T17:10:01.1345044Z                                                                                 
2026-11-25T17:10:01.1436838Z Receiving objects:  38% (6421/16897)
2026-11-25T17:10:01.1436960Z 
2026-11-25T17:10:01.1437204Z                                                                                 
2026-11-25T17:10:01.1461291Z Receiving objects:  39% (6590/16897)
2026-11-25T17:10:01.1461366Z 
2026-11-25T17:10:01.1461483Z                                                                                 
2026-11-25T17:10:01.1476784Z Receiving objects:  40% (6759/16897)
2026-11-25T17:10:01.1476845Z 
2026-11-25T17:10:01.1476955Z                                                                                 
2026-11-25T17:10:01.1494117Z Receiving objects:  41% (6928/16897)
2026-11-25T17:10:01.1494170Z 
2026-11-25T17:10:01.1494453Z                                                                                 
2026-11-25T17:10:01.3515729Z Receiving objects:  42% (7097/16897)
2026-11-25T17:10:01.3515853Z 
2026-11-25T17:10:01.3516508Z                                                                                 
2026-11-25T17:10:01.3528019Z Receiving objects:  43% (7266/16897)
2026-11-25T17:10:01.3528076Z 
2026-11-25T17:10:01.3528285Z                                                                                 
2026-11-25T17:10:01.3539880Z Receiving objects:  44% (7435/16897)
2026-11-25T17:10:01.3540126Z 
2026-11-25T17:10:01.3540262Z                                                                                 
2026-11-25T17:10:01.3550909Z Receiving objects:  45% (7604/16897)
2026-11-25T17:10:01.3550960Z 
2026-11-25T17:10:01.3551095Z                                                                                 
2026-11-25T17:10:01.3595993Z Receiving objects:  46% (7773/16897)
2026-11-25T17:10:01.3596139Z 
2026-11-25T17:10:01.3596211Z                                                                                 
2026-11-25T17:10:01.3625543Z Receiving objects:  47% (7942/16897)
2026-11-25T17:10:01.3625701Z 
2026-11-25T17:10:01.3625826Z                                                                                 
2026-11-25T17:10:01.3648114Z Receiving objects:  48% (8111/16897)
2026-11-25T17:10:01.3648218Z 
2026-11-25T17:10:01.3681278Z                                                                                 
2026-11-25T17:10:01.3681409Z Receiving objects:  49% (8280/16897)
2026-11-25T17:10:01.3681482Z 
2026-11-25T17:10:01.3681548Z                                                                                 
2026-11-25T17:10:01.3700723Z Receiving objects:  50% (8449/16897)
2026-11-25T17:10:01.3700810Z 
2026-11-25T17:10:01.3700989Z                                                                                 
2026-11-25T17:10:01.3726856Z Receiving objects:  51% (8618/16897)
2026-11-25T17:10:01.3726937Z 
2026-11-25T17:10:01.3727037Z                                                                                 
2026-11-25T17:10:01.3758090Z Receiving objects:  52% (8787/16897)
2026-11-25T17:10:01.3758195Z 
2026-11-25T17:10:01.3758264Z                                                                                 
2026-11-25T17:10:01.3801544Z Receiving objects:  53% (8956/16897)
2026-11-25T17:10:01.3801617Z 
2026-11-25T17:10:01.3801693Z                                                                                 
2026-11-25T17:10:01.3851802Z Receiving objects:  54% (9125/16897)
2026-11-25T17:10:01.3851876Z 
2026-11-25T17:10:01.3852047Z                                                                                 
2026-11-25T17:10:01.3908254Z Receiving objects:  55% (9294/16897)
2026-11-25T17:10:01.3908377Z 
2026-11-25T17:10:01.3908443Z                                                                                 
2026-11-25T17:10:01.3949067Z Receiving objects:  56% (9463/16897)
2026-11-25T17:10:01.3949172Z 
2026-11-25T17:10:01.3949276Z                                                                                 
2026-11-25T17:10:01.3978983Z Receiving objects:  57% (9632/16897)
2026-11-25T17:10:01.3979066Z 
2026-11-25T17:10:01.3979117Z                                                                                 
2026-11-25T17:10:01.4001686Z Receiving objects:  58% (9801/16897)
2026-11-25T17:10:01.4001826Z 
2026-11-25T17:10:01.4001878Z                                                                                 
2026-11-25T17:10:01.4011699Z Receiving objects:  59% (9970/16897)
2026-11-25T17:10:01.4011938Z 
2026-11-25T17:10:01.4012201Z                                                                                 
2026-11-25T17:10:01.4028768Z Receiving objects:  60% (10139/16897)
2026-11-25T17:10:01.4028834Z 
2026-11-25T17:10:01.4029233Z                                                                                 
2026-11-25T17:10:01.4054783Z Receiving objects:  61% (10308/16897)
2026-11-25T17:10:01.4054872Z 
2026-11-25T17:10:01.4055013Z                                                                                 
2026-11-25T17:10:01.4124269Z Receiving objects:  62% (10477/16897)
2026-11-25T17:10:01.4124467Z 
2026-11-25T17:10:01.4124525Z                                                                                 
2026-11-25T17:10:01.4135883Z Receiving objects:  63% (10646/16897)
2026-11-25T17:10:01.4135978Z 
2026-11-25T17:10:01.4136046Z                                                                                 
2026-11-25T17:10:01.4167286Z Receiving objects:  64% (10815/16897)
2026-11-25T17:10:01.4167381Z 
2026-11-25T17:10:01.4167436Z                                                                                 
2026-11-25T17:10:01.4188243Z Receiving objects:  65% (10984/16897)
2026-11-25T17:10:01.4188311Z 
2026-11-25T17:10:01.4188464Z                                                                                 
2026-11-25T17:10:01.4207709Z Receiving objects:  66% (11153/16897)
2026-11-25T17:10:01.4207797Z 
2026-11-25T17:10:01.4207862Z                                                                                 
2026-11-25T17:10:01.4488180Z Receiving objects:  67% (11321/16897)
2026-11-25T17:10:01.4488355Z 
2026-11-25T17:10:01.4488447Z                                                                                 
2026-11-25T17:10:01.4503842Z Receiving objects:  68% (11490/16897)
2026-11-25T17:10:01.4503956Z 
2026-11-25T17:10:01.4504038Z                                                                                 
2026-11-25T17:10:01.4518680Z Receiving objects:  69% (11659/16897)
2026-11-25T17:10:01.4518761Z 
2026-11-25T17:10:01.4518838Z                                                                                 
2026-11-25T17:10:01.4537273Z Receiving objects:  70% (11828/16897)
2026-11-25T17:10:01.4537364Z 
2026-11-25T17:10:01.4537462Z                                                                                 
2026-11-25T17:10:01.4550832Z Receiving objects:  71% (11997/16897)
2026-11-25T17:10:01.4551045Z 
2026-11-25T17:10:01.4551410Z                                                                                 
2026-11-25T17:10:01.4563378Z Receiving objects:  72% (12166/16897)
2026-11-25T17:10:01.4563453Z 
2026-11-25T17:10:01.4563575Z                                                                                 
2026-11-25T17:10:01.4580704Z Receiving objects:  73% (12335/16897)
2026-11-25T17:10:01.4580885Z 
2026-11-25T17:10:01.4581002Z                                                                                 
2026-11-25T17:10:01.4595221Z Receiving objects:  74% (12504/16897)
2026-11-25T17:10:01.4595328Z 
2026-11-25T17:10:01.4595398Z                                                                                 
2026-11-25T17:10:01.4610829Z Receiving objects:  75% (12673/16897)
2026-11-25T17:10:01.4610992Z 
2026-11-25T17:10:01.4611051Z                                                                                 
2026-11-25T17:10:01.4627701Z Receiving objects:  76% (12842/16897)
2026-11-25T17:10:01.4627777Z 
2026-11-25T17:10:01.4627889Z                                                                                 
2026-11-25T17:10:01.4644557Z Receiving objects:  77% (13011/16897)
2026-11-25T17:10:01.4644647Z 
2026-11-25T17:10:01.4644962Z                                                                                 
2026-11-25T17:10:01.4662394Z Receiving objects:  78% (13180/16897)
2026-11-25T17:10:01.4662458Z 
2026-11-25T17:10:01.4662742Z                                                                                 
2026-11-25T17:10:01.4676942Z Receiving objects:  79% (13349/16897)
2026-11-25T17:10:01.4677004Z 
2026-11-25T17:10:01.4677140Z                                                                                 
2026-11-25T17:10:01.4688197Z Receiving objects:  80% (13518/16897)
2026-11-25T17:10:01.4688458Z 
2026-11-25T17:10:01.4688525Z                                                                                 
2026-11-25T17:10:01.4704625Z Receiving objects:  81% (13687/16897)
2026-11-25T17:10:01.4704773Z 
2026-11-25T17:10:01.4704920Z                                                                                 
2026-11-25T17:10:01.4723644Z Receiving objects:  82% (13856/16897)
2026-11-25T17:10:01.4723740Z 
2026-11-25T17:10:01.4723906Z                                                                                 
2026-11-25T17:10:01.4752036Z Receiving objects:  83% (14025/16897)
2026-11-25T17:10:01.4752107Z 
2026-11-25T17:10:01.4752347Z                                                                                 
2026-11-25T17:10:01.4785886Z Receiving objects:  84% (14194/16897)
2026-11-25T17:10:01.4785981Z 
2026-11-25T17:10:01.4786036Z                                                                                 
2026-11-25T17:10:01.4801817Z Receiving objects:  85% (14363/16897)
2026-11-25T17:10:01.4801893Z 
2026-11-25T17:10:01.4801964Z                                                                                 
2026-11-25T17:10:01.4820202Z Receiving objects:  86% (14532/16897)
2026-11-25T17:10:01.4820299Z 
2026-11-25T17:10:01.4820368Z                                                                                 
2026-11-25T17:10:01.4859034Z Receiving objects:  87% (14701/16897)
2026-11-25T17:10:01.4859094Z 
2026-11-25T17:10:01.4859148Z                                                                                 
2026-11-25T17:10:01.4889882Z Receiving objects:  88% (14870/16897)
2026-11-25T17:10:01.4889953Z 
2026-11-25T17:10:01.4890029Z                                                                                 
2026-11-25T17:10:01.4915492Z Receiving objects:  89% (15039/16897)
2026-11-25T17:10:01.4915576Z 
2026-11-25T17:10:01.4915632Z                                                                                 
2026-11-25T17:10:01.4932414Z Receiving objects:  90% (15208/16897)
2026-11-25T17:10:01.4932529Z 
2026-11-25T17:10:01.4932598Z                                                                                 
2026-11-25T17:10:01.4961916Z Receiving objects:  91% (15377/16897)
2026-11-25T17:10:01.4962242Z 
2026-11-25T17:10:01.4962327Z                                                                                 
2026-11-25T17:10:01.5003747Z Receiving objects:  92% (15546/16897)
2026-11-25T17:10:01.5003825Z 
2026-11-25T17:10:01.5003878Z                                                                                 
2026-11-25T17:10:01.5025031Z Receiving objects:  93% (15715/16897)
2026-11-25T17:10:01.5025102Z 
2026-11-25T17:10:01.5025177Z                                                                                 
2026-11-25T17:10:01.5058264Z Receiving objects:  94% (15884/16897)
2026-11-25T17:10:01.5058541Z 
2026-11-25T17:10:01.5058852Z                                                                                 
2026-11-25T17:10:01.5086655Z Receiving objects:  95% (16053/16897)
2026-11-25T17:10:01.5086736Z 
2026-11-25T17:10:01.5086884Z                                                                                 
2026-11-25T17:10:01.5106393Z Receiving objects:  96% (16222/16897)
2026-11-25T17:10:01.5106512Z 
2026-11-25T17:10:01.5106691Z                                                                                 
2026-11-25T17:10:01.5125933Z Receiving objects:  97% (16391/16897)
2026-11-25T17:10:01.5126038Z 
2026-11-25T17:10:01.5126095Z                                                                                 
2026-11-25T17:10:01.5144033Z Receiving objects:  98% (16560/16897)
2026-11-25T17:10:01.5144103Z 
2026-11-25T17:10:01.5144225Z                                                                                 
2026-11-25T17:10:01.5161238Z Receiving objects:  99% (16729/16897)
2026-11-25T17:10:01.5161343Z 
2026-11-25T17:10:01.5161610Z                                                                                 
2026-11-25T17:10:01.5161963Z Receiving objects: 100% (16897/16897)
2026-11-25T17:10:01.5162277Z 
2026-11-25T17:10:01.5162363Z                                                                                 
2026-11-25T17:10:01.5162445Z Receiving objects: 100% (16897/16897), 29.52 MiB | 65.58 MiB/s, done.
2026-11-25T17:10:01.5172840Z 
2026-11-25T17:10:01.5173034Z                                                                                 
2026-11-25T17:10:01.5174603Z Resolving deltas:   0% (0/2735)
2026-11-25T17:10:01.5174648Z 
2026-11-25T17:10:01.5174853Z                                                                                 
2026-11-25T17:10:01.5175546Z Resolving deltas:   1% (28/2735)
2026-11-25T17:10:01.5175618Z 
2026-11-25T17:10:01.5175667Z                                                                                 
2026-11-25T17:10:01.5177444Z Resolving deltas:   2% (59/2735)
2026-11-25T17:10:01.5178077Z 
2026-11-25T17:10:01.5178147Z                                                                                 
2026-11-25T17:10:01.5178321Z Resolving deltas:   3% (83/2735)
2026-11-25T17:10:01.5182454Z 
2026-11-25T17:10:01.5185217Z                                                                                 
2026-11-25T17:10:01.5187399Z Resolving deltas:   4% (116/2735)
2026-11-25T17:10:01.5187839Z 
2026-11-25T17:10:01.5187986Z                                                                                 
2026-11-25T17:10:01.5188054Z Resolving deltas:   5% (140/2735)
2026-11-25T17:10:01.5188156Z 
2026-11-25T17:10:01.5188205Z                                                                                 
2026-11-25T17:10:01.5188275Z Resolving deltas:   6% (165/2735)
2026-11-25T17:10:01.5188318Z 
2026-11-25T17:10:01.5188362Z                                                                                 
2026-11-25T17:10:01.5188437Z Resolving deltas:   7% (197/2735)
2026-11-25T17:10:01.5188477Z 
2026-11-25T17:10:01.5188529Z                                                                                 
2026-11-25T17:10:01.5188590Z Resolving deltas:   8% (225/2735)
2026-11-25T17:10:01.5188636Z 
2026-11-25T17:10:01.5188678Z                                                                                 
2026-11-25T17:10:01.5188748Z Resolving deltas:   9% (247/2735)
2026-11-25T17:10:01.5188959Z 
2026-11-25T17:10:01.5189016Z                                                                                 
2026-11-25T17:10:01.5189075Z Resolving deltas:  10% (279/2735)
2026-11-25T17:10:01.5189137Z 
2026-11-25T17:10:01.5189183Z                                                                                 
2026-11-25T17:10:01.5189252Z Resolving deltas:  11% (301/2735)
2026-11-25T17:10:01.5189296Z 
2026-11-25T17:10:01.5189340Z                                                                                 
2026-11-25T17:10:01.5189408Z Resolving deltas:  12% (336/2735)
2026-11-25T17:10:01.5189449Z 
2026-11-25T17:10:01.5189503Z                                                                                 
2026-11-25T17:10:01.5189565Z Resolving deltas:  13% (366/2735)
2026-11-25T17:10:01.5189616Z 
2026-11-25T17:10:01.5189659Z                                                                                 
2026-11-25T17:10:01.5189727Z Resolving deltas:  14% (385/2735)
2026-11-25T17:10:01.5189769Z 
2026-11-25T17:10:01.5189814Z                                                                                 
2026-11-25T17:10:01.5189880Z Resolving deltas:  15% (424/2735)
2026-11-25T17:10:01.5189923Z 
2026-11-25T17:10:01.5189975Z                                                                                 
2026-11-25T17:10:01.5190035Z Resolving deltas:  16% (441/2735)
2026-11-25T17:10:01.5190085Z 
2026-11-25T17:10:01.5190129Z                                                                                 
2026-11-25T17:10:01.5190807Z Resolving deltas:  17% (465/2735)
2026-11-25T17:10:01.5190853Z 
2026-11-25T17:10:01.5190911Z                                                                                 
2026-11-25T17:10:01.5193123Z Resolving deltas:  18% (493/2735)
2026-11-25T17:10:01.5193235Z 
2026-11-25T17:10:01.5193358Z                                                                                 
2026-11-25T17:10:01.5194269Z Resolving deltas:  19% (523/2735)
2026-11-25T17:10:01.5194364Z 
2026-11-25T17:10:01.5194420Z                                                                                 
2026-11-25T17:10:01.5195442Z Resolving deltas:  20% (547/2735)
2026-11-25T17:10:01.5195489Z 
2026-11-25T17:10:01.5195624Z                                                                                 
2026-11-25T17:10:01.5200861Z Resolving deltas:  21% (575/2735)
2026-11-25T17:10:01.5200933Z 
2026-11-25T17:10:01.5201096Z                                                                                 
2026-11-25T17:10:01.5201730Z Resolving deltas:  22% (602/2735)
2026-11-25T17:10:01.5201808Z 
2026-11-25T17:10:01.5201856Z                                                                                 
2026-11-25T17:10:01.5203222Z Resolving deltas:  23% (630/2735)
2026-11-25T17:10:01.5203295Z 
2026-11-25T17:10:01.5203425Z                                                                                 
2026-11-25T17:10:01.5203610Z Resolving deltas:  25% (706/2735)
2026-11-25T17:10:01.5203664Z 
2026-11-25T17:10:01.5203711Z                                                                                 
2026-11-25T17:10:01.5204683Z Resolving deltas:  26% (718/2735)
2026-11-25T17:10:01.5204740Z 
2026-11-25T17:10:01.5204911Z                                                                                 
2026-11-25T17:10:01.5204991Z Resolving deltas:  27% (762/2735)
2026-11-25T17:10:01.5205034Z 
2026-11-25T17:10:01.5205090Z                                                                                 
2026-11-25T17:10:01.5205885Z Resolving deltas:  28% (770/2735)
2026-11-25T17:10:01.5205928Z 
2026-11-25T17:10:01.5206047Z                                                                                 
2026-11-25T17:10:01.5206351Z Resolving deltas:  29% (814/2735)
2026-11-25T17:10:01.5206416Z 
2026-11-25T17:10:01.5206465Z                                                                                 
2026-11-25T17:10:01.5207046Z Resolving deltas:  30% (834/2735)
2026-11-25T17:10:01.5207279Z 
2026-11-25T17:10:01.5207345Z                                                                                 
2026-11-25T17:10:01.5208005Z Resolving deltas:  31% (854/2735)
2026-11-25T17:10:01.5208058Z 
2026-11-25T17:10:01.5208117Z                                                                                 
2026-11-25T17:10:01.5208399Z Resolving deltas:  32% (898/2735)
2026-11-25T17:10:01.5208447Z 
2026-11-25T17:10:01.5208491Z                                                                                 
2026-11-25T17:10:01.5208967Z Resolving deltas:  33% (909/2735)
2026-11-25T17:10:01.5209012Z 
2026-11-25T17:10:01.5209070Z                                                                                 
2026-11-25T17:10:01.5210222Z Resolving deltas:  34% (936/2735)
2026-11-25T17:10:01.5210285Z 
2026-11-25T17:10:01.5210330Z                                                                                 
2026-11-25T17:10:01.5210593Z Resolving deltas:  35% (974/2735)
2026-11-25T17:10:01.5210654Z 
2026-11-25T17:10:01.5210704Z                                                                                 
2026-11-25T17:10:01.5211087Z Resolving deltas:  36% (1000/2735)
2026-11-25T17:10:01.5211133Z 
2026-11-25T17:10:01.5211191Z                                                                                 
2026-11-25T17:10:01.5211793Z Resolving deltas:  37% (1022/2735)
2026-11-25T17:10:01.5211856Z 
2026-11-25T17:10:01.5211903Z                                                                                 
2026-11-25T17:10:01.5212451Z Resolving deltas:  38% (1054/2735)
2026-11-25T17:10:01.5212495Z 
2026-11-25T17:10:01.5212542Z                                                                                 
2026-11-25T17:10:01.5212773Z Resolving deltas:  39% (1091/2735)
2026-11-25T17:10:01.5212883Z 
2026-11-25T17:10:01.5212945Z                                                                                 
2026-11-25T17:10:01.5213512Z Resolving deltas:  40% (1102/2735)
2026-11-25T17:10:01.5213566Z 
2026-11-25T17:10:01.5213611Z                                                                                 
2026-11-25T17:10:01.5214507Z Resolving deltas:  41% (1128/2735)
2026-11-25T17:10:01.5214555Z 
2026-11-25T17:10:01.5214611Z                                                                                 
2026-11-25T17:10:01.5215565Z Resolving deltas:  42% (1149/2735)
2026-11-25T17:10:01.5215617Z 
2026-11-25T17:10:01.5215671Z                                                                                 
2026-11-25T17:10:01.5216097Z Resolving deltas:  43% (1182/2735)
2026-11-25T17:10:01.5216159Z 
2026-11-25T17:10:01.5216204Z                                                                                 
2026-11-25T17:10:01.5217269Z Resolving deltas:  44% (1205/2735)
2026-11-25T17:10:01.5217324Z 
2026-11-25T17:10:01.5217380Z                                                                                 
2026-11-25T17:10:01.5218397Z Resolving deltas:  46% (1263/2735)
2026-11-25T17:10:01.5218464Z 
2026-11-25T17:10:01.5218513Z                                                                                 
2026-11-25T17:10:01.5219039Z Resolving deltas:  48% (1320/2735)
2026-11-25T17:10:01.5219093Z 
2026-11-25T17:10:01.5219152Z                                                                                 
2026-11-25T17:10:01.5220159Z Resolving deltas:  49% (1343/2735)
2026-11-25T17:10:01.5220216Z 
2026-11-25T17:10:01.5220262Z                                                                                 
2026-11-25T17:10:01.5220540Z Resolving deltas:  50% (1389/2735)
2026-11-25T17:10:01.5220591Z 
2026-11-25T17:10:01.5220648Z                                                                                 
2026-11-25T17:10:01.5222059Z Resolving deltas:  51% (1397/2735)
2026-11-25T17:10:01.5222110Z 
2026-11-25T17:10:01.5222163Z                                                                                 
2026-11-25T17:10:01.5222769Z Resolving deltas:  53% (1470/2735)
2026-11-25T17:10:01.5222841Z 
2026-11-25T17:10:01.5223014Z                                                                                 
2026-11-25T17:10:01.5223766Z Resolving deltas:  54% (1499/2735)
2026-11-25T17:10:01.5223813Z 
2026-11-25T17:10:01.5223857Z                                                                                 
2026-11-25T17:10:01.5224696Z Resolving deltas:  55% (1508/2735)
2026-11-25T17:10:01.5224767Z 
2026-11-25T17:10:01.5224825Z                                                                                 
2026-11-25T17:10:01.5253595Z Resolving deltas:  56% (1533/2735)
2026-11-25T17:10:01.5259115Z 
2026-11-25T17:10:01.5267632Z                                                                                 
2026-11-25T17:10:01.5284166Z Resolving deltas:  57% (1571/2735)
2026-11-25T17:10:01.5298166Z 
2026-11-25T17:10:01.5300639Z                                                                                 
2026-11-25T17:10:01.5303056Z Resolving deltas:  58% (1591/2735)
2026-11-25T17:10:01.5305111Z 
2026-11-25T17:10:01.5305350Z                                                                                 
2026-11-25T17:10:01.5305425Z Resolving deltas:  59% (1614/2735)
2026-11-25T17:10:01.5305718Z 
2026-11-25T17:10:01.5315413Z                                                                                 
2026-11-25T17:10:01.5315557Z Resolving deltas:  60% (1658/2735)
2026-11-25T17:10:01.5315601Z 
2026-11-25T17:10:01.5315869Z                                                                                 
2026-11-25T17:10:01.5315966Z Resolving deltas:  61% (1669/2735)
2026-11-25T17:10:01.5316027Z 
2026-11-25T17:10:01.5316088Z                                                                                 
2026-11-25T17:10:01.5316161Z Resolving deltas:  62% (1697/2735)
2026-11-25T17:10:01.5316311Z 
2026-11-25T17:10:01.5316385Z                                                                                 
2026-11-25T17:10:01.5316459Z Resolving deltas:  63% (1726/2735)
2026-11-25T17:10:01.5316503Z 
2026-11-25T17:10:01.5316562Z                                                                                 
2026-11-25T17:10:01.5316703Z Resolving deltas:  64% (1752/2735)
2026-11-25T17:10:01.5316784Z 
2026-11-25T17:10:01.5316887Z                                                                                 
2026-11-25T17:10:01.5316956Z Resolving deltas:  65% (1779/2735)
2026-11-25T17:10:01.5316998Z 
2026-11-25T17:10:01.5317052Z                                                                                 
2026-11-25T17:10:01.5317112Z Resolving deltas:  66% (1809/2735)
2026-11-25T17:10:01.5317153Z 
2026-11-25T17:10:01.5317207Z                                                                                 
2026-11-25T17:10:01.5317267Z Resolving deltas:  67% (1834/2735)
2026-11-25T17:10:01.5317324Z 
2026-11-25T17:10:01.5317370Z                                                                                 
2026-11-25T17:10:01.5317436Z Resolving deltas:  68% (1863/2735)
2026-11-25T17:10:01.5317478Z 
2026-11-25T17:10:01.5317534Z                                                                                 
2026-11-25T17:10:01.5317592Z Resolving deltas:  69% (1888/2735)
2026-11-25T17:10:01.5317633Z 
2026-11-25T17:10:01.5317685Z                                                                                 
2026-11-25T17:10:01.5317741Z Resolving deltas:  70% (1915/2735)
2026-11-25T17:10:01.5317793Z 
2026-11-25T17:10:01.5317836Z                                                                                 
2026-11-25T17:10:01.5317902Z Resolving deltas:  71% (1943/2735)
2026-11-25T17:10:01.5317945Z 
2026-11-25T17:10:01.5318038Z                                                                                 
2026-11-25T17:10:01.5318094Z Resolving deltas:  72% (1976/2735)
2026-11-25T17:10:01.5318145Z 
2026-11-25T17:10:01.5318187Z                                                                                 
2026-11-25T17:10:01.5318251Z Resolving deltas:  73% (1997/2735)
2026-11-25T17:10:01.5318293Z 
2026-11-25T17:10:01.5318399Z                                                                                 
2026-11-25T17:10:01.5318464Z Resolving deltas:  74% (2025/2735)
2026-11-25T17:10:01.5318504Z 
2026-11-25T17:10:01.5318553Z                                                                                 
2026-11-25T17:10:01.5318609Z Resolving deltas:  75% (2052/2735)
2026-11-25T17:10:01.5318657Z 
2026-11-25T17:10:01.5318699Z                                                                                 
2026-11-25T17:10:01.5318762Z Resolving deltas:  76% (2079/2735)
2026-11-25T17:10:01.5318802Z 
2026-11-25T17:10:01.5318843Z                                                                                 
2026-11-25T17:10:01.5318903Z Resolving deltas:  77% (2108/2735)
2026-11-25T17:10:01.5318946Z 
2026-11-25T17:10:01.5318997Z                                                                                 
2026-11-25T17:10:01.5319051Z Resolving deltas:  78% (2141/2735)
2026-11-25T17:10:01.5319128Z 
2026-11-25T17:10:01.5319171Z                                                                                 
2026-11-25T17:10:01.5319235Z Resolving deltas:  79% (2161/2735)
2026-11-25T17:10:01.5319275Z 
2026-11-25T17:10:01.5319325Z                                                                                 
2026-11-25T17:10:01.5319384Z Resolving deltas:  80% (2197/2735)
2026-11-25T17:10:01.5319431Z 
2026-11-25T17:10:01.5319473Z                                                                                 
2026-11-25T17:10:01.5319538Z Resolving deltas:  81% (2219/2735)
2026-11-25T17:10:01.5319578Z 
2026-11-25T17:10:01.5319620Z                                                                                 
2026-11-25T17:10:01.5319685Z Resolving deltas:  82% (2248/2735)
2026-11-25T17:10:01.5319725Z 
2026-11-25T17:10:01.5319824Z                                                                                 
2026-11-25T17:10:01.5319881Z Resolving deltas:  83% (2278/2735)
2026-11-25T17:10:01.5319929Z 
2026-11-25T17:10:01.5319975Z                                                                                 
2026-11-25T17:10:01.5320040Z Resolving deltas:  84% (2300/2735)
2026-11-25T17:10:01.5320080Z 
2026-11-25T17:10:01.5320129Z                                                                                 
2026-11-25T17:10:01.5320183Z Resolving deltas:  85% (2327/2735)
2026-11-25T17:10:01.5320223Z 
2026-11-25T17:10:01.5320273Z                                                                                 
2026-11-25T17:10:01.5320328Z Resolving deltas:  86% (2353/2735)
2026-11-25T17:10:01.5320376Z 
2026-11-25T17:10:01.5320418Z                                                                                 
2026-11-25T17:10:01.5320479Z Resolving deltas:  87% (2386/2735)
2026-11-25T17:10:01.5320520Z 
2026-11-25T17:10:01.5320570Z                                                                                 
2026-11-25T17:10:01.5320624Z Resolving deltas:  88% (2428/2735)
2026-11-25T17:10:01.5320664Z 
2026-11-25T17:10:01.5320715Z                                                                                 
2026-11-25T17:10:01.5320770Z Resolving deltas:  89% (2439/2735)
2026-11-25T17:10:01.5320820Z 
2026-11-25T17:10:01.5320861Z                                                                                 
2026-11-25T17:10:01.5320926Z Resolving deltas:  90% (2468/2735)
2026-11-25T17:10:01.5320967Z 
2026-11-25T17:10:01.5321017Z                                                                                 
2026-11-25T17:10:01.5321073Z Resolving deltas:  91% (2489/2735)
2026-11-25T17:10:01.5321112Z 
2026-11-25T17:10:01.5321163Z                                                                                 
2026-11-25T17:10:01.5321227Z Resolving deltas:  92% (2517/2735)
2026-11-25T17:10:01.5321268Z 
2026-11-25T17:10:01.5321312Z                                                                                 
2026-11-25T17:10:01.5321377Z Resolving deltas:  93% (2545/2735)
2026-11-25T17:10:01.5321419Z 
2026-11-25T17:10:01.5321472Z                                                                                 
2026-11-25T17:10:01.5321577Z Resolving deltas:  95% (2602/2735)
2026-11-25T17:10:01.5321628Z 
2026-11-25T17:10:01.5321670Z                                                                                 
2026-11-25T17:10:01.5321733Z Resolving deltas:  96% (2628/2735)
2026-11-25T17:10:01.5321773Z 
2026-11-25T17:10:01.5321814Z                                                                                 
2026-11-25T17:10:01.5321879Z Resolving deltas:  97% (2653/2735)
2026-11-25T17:10:01.5321920Z 
2026-11-25T17:10:01.5321969Z                                                                                 
2026-11-25T17:10:01.5322025Z Resolving deltas:  98% (2681/2735)
2026-11-25T17:10:01.5322072Z 
2026-11-25T17:10:01.5322116Z                                                                                 
2026-11-25T17:10:01.5322180Z Resolving deltas:  99% (2710/2735)
2026-11-25T17:10:01.5322221Z 
2026-11-25T17:10:01.5322262Z                                                                                 
2026-11-25T17:10:01.5322326Z Resolving deltas: 100% (2735/2735)
2026-11-25T17:10:01.5322368Z 
2026-11-25T17:10:01.5322417Z                                                                                 
2026-11-25T17:10:01.5322479Z Resolving deltas: 100% (2735/2735), done.
2026-11-25T17:10:01.6945260Z From http://apidevops.caixa/projetos/Infraestrutura/_git/esteira-jboss-vm-v2
2026-11-25T17:10:01.6945562Z  * [new branch]      8d109378-revert-from-guardrail_infraestrutura -> origin/8d109378-revert-from-guardrail_infraestrutura
2026-11-25T17:10:01.6945716Z  * [new branch]      AzureArc                -> origin/AzureArc
2026-11-25T17:10:01.6955641Z  * [new branch]      Cesti-test001           -> origin/Cesti-test001
2026-11-25T17:10:01.6956236Z  * [new branch]      FIX_SIGCX               -> origin/FIX_SIGCX
2026-11-25T17:10:01.6956370Z  * [new branch]      OpentelemetryV2         -> origin/OpentelemetryV2
2026-11-25T17:10:01.6956573Z  * [new branch]      Zabbix-group-CEMOT      -> origin/Zabbix-group-CEMOT
2026-11-25T17:10:01.6956848Z  * [new branch]      Zabbiz_postgress_via_dns -> origin/Zabbiz_postgress_via_dns
2026-11-25T17:10:01.6957016Z  * [new branch]      agent-master            -> origin/agent-master
2026-11-25T17:10:01.6957160Z  * [new branch]      application-guardrails  -> origin/application-guardrails
2026-11-25T17:10:01.6957315Z  * [new branch]      batch                   -> origin/batch
2026-11-25T17:10:01.6957466Z  * [new branch]      check_deployments_jboss -> origin/check_deployments_jboss
2026-11-25T17:10:01.6957659Z  * [new branch]      corrige_posicao_ip-backup -> origin/corrige_posicao_ip-backup
2026-11-25T17:10:01.7036296Z  * [new branch]      ctc_canais_pix          -> origin/ctc_canais_pix
2026-11-25T17:10:01.7036503Z  * [new branch]      datagrid                -> origin/datagrid
2026-11-25T17:10:01.7036947Z  * [new branch]      domain                  -> origin/domain
2026-11-25T17:10:01.7037129Z  * [new branch]      dynatrace               -> origin/dynatrace
2026-11-25T17:10:01.7037309Z  * [new branch]      feat/logrotate          -> origin/feat/logrotate
2026-11-25T17:10:01.7037494Z  * [new branch]      feature-agent           -> origin/feature-agent
2026-11-25T17:10:01.7037661Z  * [new branch]      feature-controlm-vault  -> origin/feature-controlm-vault
2026-11-25T17:10:01.7037822Z  * [new branch]      fix-apache              -> origin/fix-apache
2026-11-25T17:10:01.7037957Z  * [new branch]      fix-jboss-permission2   -> origin/fix-jboss-permission2
2026-11-25T17:10:01.7038125Z  * [new branch]      fix-nfs-https           -> origin/fix-nfs-https
2026-11-25T17:10:01.7038303Z  * [new branch]      fix-nfs-https-revert-from-master -> origin/fix-nfs-https-revert-from-master
2026-11-25T17:10:01.7038487Z  * [new branch]      fix-teste/apm-jar       -> origin/fix-teste/apm-jar
2026-11-25T17:10:01.7038625Z  * [new branch]      fix/REQ000142076893     -> origin/fix/REQ000142076893
2026-11-25T17:10:01.7038776Z  * [new branch]      fix/WO0000074180840     -> origin/fix/WO0000074180840
2026-11-25T17:10:01.7039049Z  * [new branch]      fix/WO0000076720578     -> origin/fix/WO0000076720578
2026-11-25T17:10:01.7039198Z  * [new branch]      fix/WO0000076720578.1   -> origin/fix/WO0000076720578.1
2026-11-25T17:10:01.7039368Z  * [new branch]      fix/WO0000079987976     -> origin/fix/WO0000079987976
2026-11-25T17:10:01.7039461Z  * [new branch]      fix/WO0000080371184     -> origin/fix/WO0000080371184
2026-11-25T17:10:01.7039569Z  * [new branch]      fix/ip_bck_duplicado    -> origin/fix/ip_bck_duplicado
2026-11-25T17:10:01.7039663Z  * [new branch]      fix/teste-cesti         -> origin/fix/teste-cesti
2026-11-25T17:10:01.7039757Z  * [new branch]      fix_hosts               -> origin/fix_hosts
2026-11-25T17:10:01.7039892Z  * [new branch]      fix_monitoracao_batch   -> origin/fix_monitoracao_batch
2026-11-25T17:10:01.7039984Z  * [new branch]      fix_sinbc               -> origin/fix_sinbc
2026-11-25T17:10:01.7040080Z  * [new branch]      fix_sirot_connector     -> origin/fix_sirot_connector
2026-11-25T17:10:01.7040196Z  * [new branch]      guardrail_infraestrutura -> origin/guardrail_infraestrutura
2026-11-25T17:10:01.7040298Z  * [new branch]      master                  -> origin/master
2026-11-25T17:10:01.7040382Z  * [new branch]      migra_agente            -> origin/migra_agente
2026-11-25T17:10:01.7040472Z  * [new branch]      nfs-v4                  -> origin/nfs-v4
2026-11-25T17:10:01.7040549Z  * [new branch]      nsf-owner               -> origin/nsf-owner
2026-11-25T17:10:01.7040644Z  * [new branch]      opentelemetry           -> origin/opentelemetry
2026-11-25T17:10:01.7040732Z  * [new branch]      pullrequest-agent       -> origin/pullrequest-agent
2026-11-25T17:10:01.7040830Z  * [new branch]      redeBackup              -> origin/redeBackup
2026-11-25T17:10:01.7041023Z  * [new branch]      silce_instalação_dynatrace -> origin/silce_instalação_dynatrace
2026-11-25T17:10:01.7041119Z  * [new branch]      sisde                   -> origin/sisde
2026-11-25T17:10:01.7041214Z  * [new branch]      teste-dns               -> origin/teste-dns
2026-11-25T17:10:01.7041295Z  * [new branch]      vcx-ajuste              -> origin/vcx-ajuste
2026-11-25T17:10:01.7041383Z  * [new branch]      vcx-master              -> origin/vcx-master
2026-11-25T17:10:01.7041462Z  * [new branch]      vcx-visa                -> origin/vcx-visa
2026-11-25T17:10:01.7041552Z  * [new branch]      vcx_teste               -> origin/vcx_teste
2026-11-25T17:10:01.7041638Z  * [new tag]         esteira-jboss-vm-v2     -> esteira-jboss-vm-v2
2026-11-25T17:10:01.7042852Z ##[command]git checkout --progress --force aecfa713a3169c2d3977e6ff7cf1a127a296197d
2026-11-25T17:10:01.7307137Z Note: checking out 'aecfa713a3169c2d3977e6ff7cf1a127a296197d'.
2026-11-25T17:10:01.7307310Z 
2026-11-25T17:10:01.7307402Z You are in 'detached HEAD' state. You can look around, make experimental
2026-11-25T17:10:01.7307522Z changes and commit them, and you can discard any commits you make in this
2026-11-25T17:10:01.7307650Z state without impacting any branches by performing another checkout.
2026-11-25T17:10:01.7307712Z 
2026-11-25T17:10:01.7308035Z If you want to create a new branch to retain commits you create, you may
2026-11-25T17:10:01.7308234Z do so (now or later) by using -b with the checkout command again. Example:
2026-11-25T17:10:01.7308299Z 
2026-11-25T17:10:01.7308372Z   git checkout -b <new-branch-name>
2026-11-25T17:10:01.7308418Z 
2026-11-25T17:10:01.7308524Z HEAD is now at aecfa713 Merged PR 169774: Correção de performace na task alocaip
2026-11-25T17:10:01.7313272Z ##[command]git config http.http://apidevops.caixa/projetos/Infraestrutura/_git/esteira-jboss-vm-v2.extraheader "AUTHORIZATION: placeholder_330f1749-bfaf-4d43-aafb-e2b6da0b739e"
2026-11-25T17:10:01.7351815Z ##[command]git config http.sslVerify "false"
2026-11-25T17:10:01.7401136Z Downloaded linked artifact esteira-jboss-vm-v2
2026-11-25T17:10:01.7401484Z Finished artifacts download
2026-11-25T17:10:01.7432384Z ##[section]Finishing: Download Artifacts


2026-11-25T17:13:28.6219774Z ##[section]Starting: Deploy Config no JBOSS
2026-11-25T17:13:28.6222666Z ==============================================================================
2026-11-25T17:13:28.6222751Z Task         : Bash
2026-11-25T17:13:28.6222793Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-25T17:13:28.6222852Z Version      : 3.227.0
2026-11-25T17:13:28.6222902Z Author       : Microsoft Corporation
2026-11-25T17:13:28.6222948Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-25T17:13:28.6223015Z ==============================================================================
2026-11-25T17:13:29.5231325Z Generating script.
2026-11-25T17:13:29.5241610Z ========================== Starting Command Output ===========================
2026-11-25T17:13:29.5248954Z [command]/bin/bash /opt/ads-agent/_work/_temp/8ce50a40-497b-4489-9e57-76b6d3c2e967.sh
2026-11-25T17:13:29.5328977Z /opt/ads-agent/_work/_temp/8ce50a40-497b-4489-9e57-76b6d3c2e967.sh: line 2: quantidade_vm: comando não encontrado
2026-11-25T17:13:29.5342248Z /opt/ads-agent/_work/_temp/8ce50a40-497b-4489-9e57-76b6d3c2e967.sh: line 2: USE_WMQ: comando não encontrado
2026-11-25T17:13:31.7426419Z 
2026-11-25T17:13:31.7427060Z PLAY [local] *******************************************************************
2026-11-25T17:13:31.7700573Z 
2026-11-25T17:13:31.7701234Z PLAY [Configurando o DNS] ******************************************************
2026-11-25T17:13:31.9576339Z 
2026-11-25T17:13:31.9577059Z PLAY [local] *******************************************************************
2026-11-25T17:13:31.9611753Z 
2026-11-25T17:13:31.9612500Z PLAY [Verificando serviços] ****************************************************
2026-11-25T17:13:31.9709925Z 
2026-11-25T17:13:31.9710264Z PLAY [Configuração LDAP] *******************************************************
2026-11-25T17:13:31.9751871Z [WARNING]: Found variable using reserved name: when
2026-11-25T17:13:31.9757665Z 
2026-11-25T17:13:31.9757902Z PLAY [jboss] *******************************************************************
2026-11-25T17:13:32.0184504Z 
2026-11-25T17:13:32.0185077Z PLAY [Stack Jboss] *************************************************************
2026-11-25T17:13:32.0431369Z Wednesday 25 November 2026  14:13:32 -0300 (0:00:00.361)       0:00:00.361 **** 
2026-11-25T17:13:32.5067554Z 
2026-11-25T17:13:32.5068246Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-11-25T17:13:32.5070373Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-11-25T17:13:32.5070602Z caddeapllx2871.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-11-25T17:13:32.5070789Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-11-25T17:13:32.5070940Z releases. A future Ansible release will default to using the discovered 
2026-11-25T17:13:32.5071095Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-11-25T17:13:32.5071249Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-11-25T17:13:32.5071399Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-11-25T17:13:32.5071546Z setting deprecation_warnings=False in ansible.cfg.
2026-11-25T17:13:32.5071674Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-25T17:13:32.5098655Z 
2026-11-25T17:13:32.5099211Z PLAY [jboss] *******************************************************************
2026-11-25T17:13:32.5178390Z Wednesday 25 November 2026  14:13:32 -0300 (0:00:00.474)       0:00:00.836 **** 
2026-11-25T17:13:32.9439919Z 
2026-11-25T17:13:32.9440392Z TASK [Verifica se o arquivo nfs_config.json existe] ****************************
2026-11-25T17:13:32.9440558Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-25T17:13:32.9475300Z Wednesday 25 November 2026  14:13:32 -0300 (0:00:00.429)       0:00:01.266 **** 
2026-11-25T17:13:32.9976388Z included: /opt/ads-agent/_work/r12503/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for caddeapllx2871.agil.nprd.caixa.gov.br
2026-11-25T17:13:33.0025969Z Wednesday 25 November 2026  14:13:33 -0300 (0:00:00.054)       0:00:01.321 **** 
2026-11-25T17:13:33.0626413Z 
2026-11-25T17:13:33.0627432Z TASK [nfs : Criar variáveis] ***************************************************
2026-11-25T17:13:33.0627693Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-25T17:13:33.0686323Z Wednesday 25 November 2026  14:13:33 -0300 (0:00:00.066)       0:00:01.387 **** 
2026-11-25T17:13:33.5990572Z 
2026-11-25T17:13:33.5991279Z TASK [nfs : Coletar variáveis de ambiente] *************************************
2026-11-25T17:13:33.5991426Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-25T17:13:33.6025019Z Wednesday 25 November 2026  14:13:33 -0300 (0:00:00.533)       0:00:01.921 **** 
2026-11-25T17:13:33.6457034Z Wednesday 25 November 2026  14:13:33 -0300 (0:00:00.042)       0:00:01.964 **** 
2026-11-25T17:13:33.7052459Z 
2026-11-25T17:13:33.7053065Z TASK [nfs : Criar variáveis] ***************************************************
2026-11-25T17:13:33.7053252Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-25T17:13:33.7106759Z Wednesday 25 November 2026  14:13:33 -0300 (0:00:00.065)       0:00:02.029 **** 
2026-11-25T17:13:33.7554192Z Wednesday 25 November 2026  14:13:33 -0300 (0:00:00.044)       0:00:02.074 **** 
2026-11-25T17:13:33.8008296Z Wednesday 25 November 2026  14:13:33 -0300 (0:00:00.045)       0:00:02.119 **** 
2026-11-25T17:13:33.8449652Z Wednesday 25 November 2026  14:13:33 -0300 (0:00:00.044)       0:00:02.163 **** 
2026-11-25T17:13:33.8901558Z Wednesday 25 November 2026  14:13:33 -0300 (0:00:00.045)       0:00:02.208 **** 
2026-11-25T17:13:33.9345549Z Wednesday 25 November 2026  14:13:33 -0300 (0:00:00.044)       0:00:02.253 **** 
2026-11-25T17:13:33.9783119Z Wednesday 25 November 2026  14:13:33 -0300 (0:00:00.043)       0:00:02.297 **** 
2026-11-25T17:13:34.0220192Z Wednesday 25 November 2026  14:13:34 -0300 (0:00:00.043)       0:00:02.340 **** 
2026-11-25T17:13:34.0655922Z Wednesday 25 November 2026  14:13:34 -0300 (0:00:00.043)       0:00:02.384 **** 
2026-11-25T17:13:34.1096511Z 
2026-11-25T17:13:34.1097127Z PLAY [jboss] *******************************************************************
2026-11-25T17:13:34.1142957Z 
2026-11-25T17:13:34.1143120Z PLAY [jboss] *******************************************************************
2026-11-25T17:13:34.1183147Z Wednesday 25 November 2026  14:13:34 -0300 (0:00:00.052)       0:00:02.437 **** 
2026-11-25T17:13:34.9638420Z 
2026-11-25T17:13:34.9638974Z TASK [Gathering Facts] *********************************************************
2026-11-25T17:13:34.9639228Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-25T17:13:34.9810106Z Wednesday 25 November 2026  14:13:34 -0300 (0:00:00.862)       0:00:03.299 **** 
2026-11-25T17:13:36.3145695Z 
2026-11-25T17:13:36.3146220Z TASK [Gerando fatos de servicos] ***********************************************
2026-11-25T17:13:36.3146398Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-25T17:13:36.3451355Z Wednesday 25 November 2026  14:13:36 -0300 (0:00:01.364)       0:00:04.663 **** 
2026-11-25T17:13:36.4043897Z 
2026-11-25T17:13:36.4044336Z TASK [Gerando lista de units jboss] ********************************************
2026-11-25T17:13:36.4044530Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-25T17:13:36.4303961Z Wednesday 25 November 2026  14:13:36 -0300 (0:00:00.085)       0:00:04.749 **** 
2026-11-25T17:13:36.4975998Z Wednesday 25 November 2026  14:13:36 -0300 (0:00:00.067)       0:00:04.816 **** 
2026-11-25T17:13:36.5104061Z 
2026-11-25T17:13:36.5104344Z PLAY [Copiando deployments adicionais] *****************************************
2026-11-25T17:13:36.5366888Z Wednesday 25 November 2026  14:13:36 -0300 (0:00:00.039)       0:00:04.855 **** 
2026-11-25T17:13:36.5925719Z 
2026-11-25T17:13:36.5926260Z TASK [Cria variável build_repository_name] *************************************
2026-11-25T17:13:36.5926416Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-25T17:13:36.6178854Z Wednesday 25 November 2026  14:13:36 -0300 (0:00:00.081)       0:00:04.936 **** 
2026-11-25T17:13:36.6742504Z 
2026-11-25T17:13:36.6742972Z TASK [Buscando diretorio de config] ********************************************
2026-11-25T17:13:36.6743115Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-25T17:13:36.6998500Z Wednesday 25 November 2026  14:13:36 -0300 (0:00:00.081)       0:00:05.018 **** 
2026-11-25T17:13:36.7539949Z 
2026-11-25T17:13:36.7540672Z TASK [Buscando diretorio de config] ********************************************
2026-11-25T17:13:36.7540932Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-25T17:13:36.7855448Z Wednesday 25 November 2026  14:13:36 -0300 (0:00:00.085)       0:00:05.104 **** 
2026-11-25T17:13:37.2875422Z 
2026-11-25T17:13:37.2875919Z TASK [Create a symbolic link] **************************************************
2026-11-25T17:13:37.2876338Z changed: [caddeapllx2871.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r12503/a/_SIGEC-portabilidade-online-config)
2026-11-25T17:13:37.6013773Z changed: [caddeapllx2871.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r12503/a/_SIGEC-portabilidade-online-config/jboss)
2026-11-25T17:13:37.6313476Z Wednesday 25 November 2026  14:13:37 -0300 (0:00:00.845)       0:00:05.949 **** 
2026-11-25T17:13:37.9691028Z 
2026-11-25T17:13:37.9691472Z TASK [Verifica se o arquivo  existe] *******************************************
2026-11-25T17:13:37.9691874Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r12503/a/_SIGEC-portabilidade-online-config)
2026-11-25T17:13:38.2531628Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r12503/a/_SIGEC-portabilidade-online-config/jboss)
2026-11-25T17:13:38.2787103Z Wednesday 25 November 2026  14:13:38 -0300 (0:00:00.647)       0:00:06.597 **** 
2026-11-25T17:13:38.3308909Z 
2026-11-25T17:13:38.3309249Z PLAY [Copiando modules adicionais] *********************************************
2026-11-25T17:13:38.3576277Z Wednesday 25 November 2026  14:13:38 -0300 (0:00:00.078)       0:00:06.676 **** 
2026-11-25T17:13:38.4139913Z 
2026-11-25T17:13:38.4140514Z TASK [Cria variável build_repository_name] *************************************
2026-11-25T17:13:38.4140707Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-25T17:13:38.4394413Z Wednesday 25 November 2026  14:13:38 -0300 (0:00:00.081)       0:00:06.758 **** 
2026-11-25T17:13:38.4960444Z 
2026-11-25T17:13:38.4961030Z TASK [Buscando diretorio de config] ********************************************
2026-11-25T17:13:38.4961230Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-25T17:13:38.5227404Z Wednesday 25 November 2026  14:13:38 -0300 (0:00:00.083)       0:00:06.841 **** 
2026-11-25T17:13:38.5762332Z 
2026-11-25T17:13:38.5762940Z TASK [Buscando diretorio de config] ********************************************
2026-11-25T17:13:38.5763177Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-25T17:13:38.6053124Z Wednesday 25 November 2026  14:13:38 -0300 (0:00:00.082)       0:00:06.924 **** 
2026-11-25T17:13:38.9518456Z 
2026-11-25T17:13:38.9518894Z TASK [Create a directory] ******************************************************
2026-11-25T17:13:38.9519342Z changed: [caddeapllx2871.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r12503/a/_SIGEC-portabilidade-online-config)
2026-11-25T17:13:39.2604016Z changed: [caddeapllx2871.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r12503/a/_SIGEC-portabilidade-online-config/jboss)
2026-11-25T17:13:39.2902244Z Wednesday 25 November 2026  14:13:39 -0300 (0:00:00.684)       0:00:07.608 **** 
2026-11-25T17:13:39.6212326Z 
2026-11-25T17:13:39.6212767Z TASK [Verifica se o arquivo  existe] *******************************************
2026-11-25T17:13:39.6213248Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r12503/a/_SIGEC-portabilidade-online-config)
2026-11-25T17:13:39.9000113Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r12503/a/_SIGEC-portabilidade-online-config/jboss)
2026-11-25T17:13:39.9258464Z Wednesday 25 November 2026  14:13:39 -0300 (0:00:00.635)       0:00:08.244 **** 
2026-11-25T17:13:39.9781380Z 
2026-11-25T17:13:39.9781725Z PLAY [jboss] *******************************************************************
2026-11-25T17:13:40.0057211Z Wednesday 25 November 2026  14:13:40 -0300 (0:00:00.079)       0:00:08.324 **** 
2026-11-25T17:13:40.0659980Z 
2026-11-25T17:13:40.0660831Z TASK [Setando a versão do Jboss] ***********************************************
2026-11-25T17:13:40.0661059Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-25T17:13:40.0915483Z Wednesday 25 November 2026  14:13:40 -0300 (0:00:00.085)       0:00:08.410 **** 
2026-11-25T17:13:40.1468662Z 
2026-11-25T17:13:40.1469299Z TASK [Cria variável build_repository_name_tfs] *********************************
2026-11-25T17:13:40.1469797Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-25T17:13:40.1727388Z Wednesday 25 November 2026  14:13:40 -0300 (0:00:00.080)       0:00:08.491 **** 
2026-11-25T17:13:40.2293660Z 
2026-11-25T17:13:40.2294385Z TASK [Buscando diretorio de config] ********************************************
2026-11-25T17:13:40.2294643Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-25T17:13:40.2547769Z Wednesday 25 November 2026  14:13:40 -0300 (0:00:00.082)       0:00:08.573 **** 
2026-11-25T17:13:40.7890238Z 
2026-11-25T17:13:40.7891290Z TASK [Copy common_start.sh] ****************************************************
2026-11-25T17:13:40.7891596Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-25T17:13:40.8149011Z Wednesday 25 November 2026  14:13:40 -0300 (0:00:00.560)       0:00:09.133 **** 
2026-11-25T17:13:41.3523815Z 
2026-11-25T17:13:41.3524424Z TASK [Copy template script] ****************************************************
2026-11-25T17:13:41.3524660Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-25T17:13:41.3783390Z Wednesday 25 November 2026  14:13:41 -0300 (0:00:00.563)       0:00:09.697 **** 
2026-11-25T17:13:41.9189972Z 
2026-11-25T17:13:41.9190436Z TASK [JBoss systemd wrapper for sysvinit script mode domain] *******************
2026-11-25T17:13:41.9190632Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-25T17:13:41.9451408Z Wednesday 25 November 2026  14:13:41 -0300 (0:00:00.566)       0:00:10.263 **** 
2026-11-25T17:13:42.6490893Z 
2026-11-25T17:13:42.6491868Z TASK [Realiza copia do arquivo de Trust Store] *********************************
2026-11-25T17:13:42.6492206Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-25T17:13:42.6768932Z Wednesday 25 November 2026  14:13:42 -0300 (0:00:00.731)       0:00:10.995 **** 
2026-11-25T17:13:42.7481683Z Wednesday 25 November 2026  14:13:42 -0300 (0:00:00.071)       0:00:11.066 **** 
2026-11-25T17:13:42.8337069Z Wednesday 25 November 2026  14:13:42 -0300 (0:00:00.085)       0:00:11.152 **** 
2026-11-25T17:13:43.1759998Z 
2026-11-25T17:13:43.1760500Z TASK [Check directory configuration exists] ************************************
2026-11-25T17:13:43.1761327Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r12503/a/_SIGEC-portabilidade-online-config)
2026-11-25T17:13:43.4586996Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r12503/a/_SIGEC-portabilidade-online-config/jboss)
2026-11-25T17:13:43.4852926Z Wednesday 25 November 2026  14:13:43 -0300 (0:00:00.651)       0:00:11.804 **** 
2026-11-25T17:13:43.5702993Z Wednesday 25 November 2026  14:13:43 -0300 (0:00:00.084)       0:00:11.888 **** 
2026-11-25T17:13:43.8941426Z 
2026-11-25T17:13:43.8942103Z TASK [Get standalone-full-ha.xml status] ***************************************
2026-11-25T17:13:43.8942390Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r12503/a/_SIGEC-portabilidade-online-config)
2026-11-25T17:13:44.1878492Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r12503/a/_SIGEC-portabilidade-online-config/jboss)
2026-11-25T17:13:44.2141789Z Wednesday 25 November 2026  14:13:44 -0300 (0:00:00.643)       0:00:12.532 **** 
2026-11-25T17:13:44.2925544Z Wednesday 25 November 2026  14:13:44 -0300 (0:00:00.078)       0:00:12.611 **** 
2026-11-25T17:13:44.6263811Z 
2026-11-25T17:13:44.6265016Z TASK [Get standalone-ha.xml status] ********************************************
2026-11-25T17:13:44.6265471Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r12503/a/_SIGEC-portabilidade-online-config)
2026-11-25T17:13:44.9072974Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r12503/a/_SIGEC-portabilidade-online-config/jboss)
2026-11-25T17:13:44.9330111Z Wednesday 25 November 2026  14:13:44 -0300 (0:00:00.640)       0:00:13.251 **** 
2026-11-25T17:13:45.0500310Z Wednesday 25 November 2026  14:13:45 -0300 (0:00:00.116)       0:00:13.368 **** 
2026-11-25T17:13:45.3882880Z 
2026-11-25T17:13:45.3883648Z TASK [Get standalone.xml status] ***********************************************
2026-11-25T17:13:45.3884362Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r12503/a/_SIGEC-portabilidade-online-config)
2026-11-25T17:13:45.6568440Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r12503/a/_SIGEC-portabilidade-online-config/jboss)
2026-11-25T17:13:45.6845795Z Wednesday 25 November 2026  14:13:45 -0300 (0:00:00.634)       0:00:14.003 **** 
2026-11-25T17:13:45.7645915Z Wednesday 25 November 2026  14:13:45 -0300 (0:00:00.079)       0:00:14.083 **** 
2026-11-25T17:13:46.0929537Z 
2026-11-25T17:13:46.0930041Z TASK [Get standalone.conf status] **********************************************
2026-11-25T17:13:46.0930450Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r12503/a/_SIGEC-portabilidade-online-config)
2026-11-25T17:13:46.3766448Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r12503/a/_SIGEC-portabilidade-online-config/jboss)
2026-11-25T17:13:46.4028666Z Wednesday 25 November 2026  14:13:46 -0300 (0:00:00.638)       0:00:14.721 **** 
2026-11-25T17:13:46.4777074Z Wednesday 25 November 2026  14:13:46 -0300 (0:00:00.074)       0:00:14.796 **** 
2026-11-25T17:13:47.0717104Z 
2026-11-25T17:13:47.0717647Z TASK [Restart Zabbix] **********************************************************
2026-11-25T17:13:47.0718108Z fatal: [caddeapllx2871.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "msg": "Could not find the requested service zabbix-agent: host"}
2026-11-25T17:13:47.0718265Z ...ignoring
2026-11-25T17:13:47.0978194Z Wednesday 25 November 2026  14:13:47 -0300 (0:00:00.620)       0:00:15.416 **** 
2026-11-25T17:13:47.1653393Z Wednesday 25 November 2026  14:13:47 -0300 (0:00:00.067)       0:00:15.484 **** 
2026-11-25T17:13:47.1992081Z [WARNING]: conditional statements should not include jinja2 templating
2026-11-25T17:13:47.1992460Z delimiters such as {{ }} or {% %}. Found: {{ lookup('env','HSM') |
2026-11-25T17:13:47.1992650Z default('false', true) | bool }}
2026-11-25T17:13:47.2118355Z 
2026-11-25T17:13:47.2118615Z PLAY [jboss] *******************************************************************
2026-11-25T17:13:47.2152220Z 
2026-11-25T17:13:47.2152648Z PLAY [jboss] *******************************************************************
2026-11-25T17:13:47.2184496Z 
2026-11-25T17:13:47.2184740Z PLAY [jboss] *******************************************************************
2026-11-25T17:13:47.2439481Z Wednesday 25 November 2026  14:13:47 -0300 (0:00:00.078)       0:00:15.562 **** 
2026-11-25T17:13:47.3010350Z 
2026-11-25T17:13:47.3010992Z TASK [Cria variável build_repository_name] *************************************
2026-11-25T17:13:47.3011239Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-25T17:13:47.3262077Z Wednesday 25 November 2026  14:13:47 -0300 (0:00:00.082)       0:00:15.644 **** 
2026-11-25T17:13:47.3825359Z 
2026-11-25T17:13:47.3825788Z TASK [Buscando diretorio de config] ********************************************
2026-11-25T17:13:47.3825968Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-25T17:13:47.4128173Z Wednesday 25 November 2026  14:13:47 -0300 (0:00:00.086)       0:00:15.731 **** 
2026-11-25T17:13:47.7538358Z 
2026-11-25T17:13:47.7539040Z TASK [Verifica se o arquivo {{ item }}/etc/hosts-{{ sistema_ambiente }} existe] ***
2026-11-25T17:13:47.7539572Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r12503/a/_SIGEC-portabilidade-online-config)
2026-11-25T17:13:48.0400864Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r12503/a/_SIGEC-portabilidade-online-config/so)
2026-11-25T17:13:48.0656536Z Wednesday 25 November 2026  14:13:48 -0300 (0:00:00.652)       0:00:16.384 **** 
2026-11-25T17:13:48.1192044Z 
2026-11-25T17:13:48.1192469Z PLAY [jboss] *******************************************************************
2026-11-25T17:13:48.1475894Z Wednesday 25 November 2026  14:13:48 -0300 (0:00:00.081)       0:00:16.466 **** 
2026-11-25T17:13:48.3852649Z 
2026-11-25T17:13:48.3853331Z TASK [Verifica se o arquivo /opt/jboss-eap/standalone/configuration/custom.sh existe] ***
2026-11-25T17:13:48.3853534Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-25T17:13:48.4105964Z Wednesday 25 November 2026  14:13:48 -0300 (0:00:00.263)       0:00:16.729 **** 
2026-11-25T17:13:48.4775671Z Wednesday 25 November 2026  14:13:48 -0300 (0:00:00.066)       0:00:16.796 **** 
2026-11-25T17:13:48.7114052Z 
2026-11-25T17:13:48.7114582Z TASK [Verifica se o arquivo /opt/batch/config/configuration/custom.sh existe] ***
2026-11-25T17:13:48.7114734Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-25T17:13:48.7373951Z Wednesday 25 November 2026  14:13:48 -0300 (0:00:00.259)       0:00:17.055 **** 
2026-11-25T17:13:48.7791671Z 
2026-11-25T17:13:48.7820324Z PLAY [local] *******************************************************************
2026-11-25T17:13:48.7820517Z [WARNING]: Could not match supplied host pattern, ignoring: instance_restart
2026-11-25T17:13:48.7823131Z 
2026-11-25T17:13:48.7823309Z PLAY [instance_restart] ********************************************************
2026-11-25T17:13:48.7823433Z skipping: no hosts matched
2026-11-25T17:13:48.7826401Z [WARNING]: Could not match supplied host pattern, ignoring: machine_reboot
2026-11-25T17:13:48.7829345Z 
2026-11-25T17:13:48.7829625Z PLAY [machine_reboot] **********************************************************
2026-11-25T17:13:48.7829775Z skipping: no hosts matched
2026-11-25T17:13:48.7838634Z 
2026-11-25T17:13:48.7838787Z PLAY [local] *******************************************************************
2026-11-25T17:13:48.7861040Z [WARNING]: Could not match supplied host pattern, ignoring: instance_stop
2026-11-25T17:13:48.7864207Z 
2026-11-25T17:13:48.7864378Z PLAY [instance_stop] ***********************************************************
2026-11-25T17:13:48.7867851Z skipping: no hosts matched
2026-11-25T17:13:48.7867893Z 
2026-11-25T17:13:48.7868107Z PLAY [machine_reboot] **********************************************************
2026-11-25T17:13:48.7868342Z skipping: no hosts matched
2026-11-25T17:13:48.7875946Z 
2026-11-25T17:13:48.7876120Z PLAY [local] *******************************************************************
2026-11-25T17:13:48.7897435Z [WARNING]: Could not match supplied host pattern, ignoring: escopo_execucao
2026-11-25T17:13:48.7900450Z 
2026-11-25T17:13:48.7900685Z PLAY [Executar o Start do Sirot Connector no escopo definido] ******************
2026-11-25T17:13:48.7900817Z skipping: no hosts matched
2026-11-25T17:13:48.7907062Z 
2026-11-25T17:13:48.7907282Z PLAY [local] *******************************************************************
2026-11-25T17:13:48.7933262Z 
2026-11-25T17:13:48.7933498Z PLAY [Executar o Stop do Sirot Connector] **************************************
2026-11-25T17:13:48.7933836Z skipping: no hosts matched
2026-11-25T17:13:48.7940604Z 
2026-11-25T17:13:48.7940738Z PLAY [Configura TSM] ***********************************************************
2026-11-25T17:13:48.7966172Z 
2026-11-25T17:13:48.7966336Z PLAY [jboss] *******************************************************************
2026-11-25T17:13:48.7992996Z 
2026-11-25T17:13:48.7993407Z PLAY [Configura Control-M] *****************************************************
2026-11-25T17:13:48.8029835Z 
2026-11-25T17:13:48.8030080Z PLAY [jboss] *******************************************************************
2026-11-25T17:13:48.8071803Z 
2026-11-25T17:13:48.8071990Z PLAY [jboss] *******************************************************************
2026-11-25T17:13:48.8118320Z 
2026-11-25T17:13:48.8118479Z PLAY [jboss] *******************************************************************
2026-11-25T17:13:48.8161756Z 
2026-11-25T17:13:48.8161914Z PLAY [jboss] *******************************************************************
2026-11-25T17:13:48.8185743Z 
2026-11-25T17:13:48.8185934Z PLAY [jboss] *******************************************************************
2026-11-25T17:13:48.8215180Z 
2026-11-25T17:13:48.8215505Z PLAY [localhost] ***************************************************************
2026-11-25T17:13:48.8242315Z 
2026-11-25T17:13:48.8242481Z PLAY [jboss] *******************************************************************
2026-11-25T17:13:48.8303501Z 
2026-11-25T17:13:48.8303773Z PLAY [jboss] *******************************************************************
2026-11-25T17:13:48.8352281Z 
2026-11-25T17:13:48.8352568Z PLAY [jboss] *******************************************************************
2026-11-25T17:13:48.8398588Z 
2026-11-25T17:13:48.8399434Z PLAY RECAP *********************************************************************
2026-11-25T17:13:48.8400154Z caddeapllx2871.agil.nprd.caixa.gov.br : ok=37   changed=2    unreachable=0    failed=0    skipped=26   rescued=0    ignored=1   
2026-11-25T17:13:48.8400525Z 
2026-11-25T17:13:48.8401465Z Wednesday 25 November 2026  14:13:48 -0300 (0:00:00.102)       0:00:17.158 **** 
2026-11-25T17:13:48.8401625Z =============================================================================== 
2026-11-25T17:13:48.8408796Z Gerando fatos de servicos ----------------------------------------------- 1.36s
2026-11-25T17:13:48.8409039Z Gathering Facts --------------------------------------------------------- 0.86s
2026-11-25T17:13:48.8409267Z Create a symbolic link -------------------------------------------------- 0.85s
2026-11-25T17:13:48.8409489Z Realiza copia do arquivo de Trust Store --------------------------------- 0.73s
2026-11-25T17:13:48.8409696Z Create a directory ------------------------------------------------------ 0.68s
2026-11-25T17:13:48.8409917Z Verifica se o arquivo {{ item }}/etc/hosts-{{ sistema_ambiente }} existe --- 0.65s
2026-11-25T17:13:48.8411032Z Check directory configuration exists ------------------------------------ 0.65s
2026-11-25T17:13:48.8413204Z Verifica se o arquivo  existe ------------------------------------------- 0.65s
2026-11-25T17:13:48.8413435Z Get standalone-full-ha.xml status --------------------------------------- 0.64s
2026-11-25T17:13:48.8413669Z Get standalone-ha.xml status -------------------------------------------- 0.64s
2026-11-25T17:13:48.8413893Z Get standalone.conf status ---------------------------------------------- 0.64s
2026-11-25T17:13:48.8414121Z Verifica se o arquivo  existe ------------------------------------------- 0.64s
2026-11-25T17:13:48.8414338Z Get standalone.xml status ----------------------------------------------- 0.63s
2026-11-25T17:13:48.8414563Z Restart Zabbix ---------------------------------------------------------- 0.62s
2026-11-25T17:13:48.8414771Z JBoss systemd wrapper for sysvinit script mode domain ------------------- 0.57s
2026-11-25T17:13:48.8414988Z Copy template script ---------------------------------------------------- 0.56s
2026-11-25T17:13:48.8416571Z Copy common_start.sh ---------------------------------------------------- 0.56s
2026-11-25T17:13:48.8417140Z nfs : Coletar variáveis de ambiente ------------------------------------- 0.53s
2026-11-25T17:13:48.8417561Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.47s
2026-11-25T17:13:48.8417943Z Verifica se o arquivo nfs_config.json existe ---------------------------- 0.43s
2026-11-25T17:13:48.8418189Z Playbook run took 0 days, 0 hours, 0 minutes, 17 seconds
2026-11-25T17:13:48.9242085Z ##[section]Finishing: Deploy Config no JBOSS





2026-11-25T17:11:36.8731479Z ##[section]Starting: Recuperando nome do repositório
2026-11-25T17:11:36.8734512Z ==============================================================================
2026-11-25T17:11:36.8734597Z Task         : Bash
2026-11-25T17:11:36.8734638Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-25T17:11:36.8734698Z Version      : 3.227.0
2026-11-25T17:11:36.8734755Z Author       : Microsoft Corporation
2026-11-25T17:11:36.8734803Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-25T17:11:36.8734869Z ==============================================================================
2026-11-25T17:11:37.6902979Z Generating script.
2026-11-25T17:11:37.6913969Z ========================== Starting Command Output ===========================
2026-11-25T17:11:37.6921482Z [command]/bin/bash /opt/ads-agent/_work/_temp/0458fd83-b84a-45ff-a719-f6bcd33e6bdb.sh
2026-11-25T17:11:37.7013425Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-11-25T17:11:37.7013669Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-11-25T17:11:37.7013721Z 
2026-11-25T17:11:37.7345331Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-11-25T17:11:37.7346193Z 100  406k  100  406k    0     0  11.7M      0 --:--:-- --:--:-- --:--:-- 12.0M
2026-11-25T17:11:37.7362779Z 878866
2026-11-25T17:11:37.7403135Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-11-25T17:11:37.7403492Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-11-25T17:11:37.7403558Z 
2026-11-25T17:11:37.7538000Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-11-25T17:11:37.7538995Z 100  4888  100  4888    0     0   349k      0 --:--:-- --:--:-- --:--:--  367k
2026-11-25T17:11:37.7546001Z http://apidevops.caixa/projetos/98fe0311-ffd2-418a-9d0d-507043380abd/_apis/build/builds/878866/logs
2026-11-25T17:11:37.7583530Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-11-25T17:11:37.7586232Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-11-25T17:11:37.7586330Z 
2026-11-25T17:11:37.7717579Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-11-25T17:11:37.7718523Z 100  8065  100  8065    0     0   579k      0 --:--:-- --:--:-- --:--:--  605k
2026-11-25T17:11:37.7727506Z http://apidevops.caixa/projetos/98fe0311-ffd2-418a-9d0d-507043380abd/_apis/build/builds/878866/logs
2026-11-25T17:11:37.7770560Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-11-25T17:11:37.7772271Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-11-25T17:11:37.7772341Z 
2026-11-25T17:11:37.7917109Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-11-25T17:11:37.7917356Z 100    37    0    37    0     0   2506      0 --:--:-- --:--:-- --:--:--  2642
2026-11-25T17:11:37.8048140Z 
2026-11-25T17:11:37.8048941Z 100   246    0   246    0     0  18924      0 --:--:-- --:--:-- --:--:-- 18924
2026-11-25T17:11:37.8202366Z 
2026-11-25T17:11:37.8203175Z 100  1634    0  1634    0     0   104k      0 --:--:-- --:--:-- --:--:--  104k
2026-11-25T17:11:37.9773557Z 
2026-11-25T17:11:37.9774942Z 100 7577k    0 7577k    0     0  47.1M      0 --:--:-- --:--:-- --:--:-- 47.1M
2026-11-25T17:11:38.0226818Z 
2026-11-25T17:11:38.0227606Z 100 1517k    0 1517k    0     0  32.7M      0 --:--:-- --:--:-- --:--:-- 32.7M
2026-11-25T17:11:38.0377842Z 
2026-11-25T17:11:38.0378573Z 100 23468    0 23468    0     0  1533k      0 --:--:-- --:--:-- --:--:-- 1533k
2026-11-25T17:11:38.0522134Z 
2026-11-25T17:11:38.0522848Z 100  6019    0  6019    0     0   409k      0 --:--:-- --:--:-- --:--:--  409k
2026-11-25T17:11:38.0655835Z 
2026-11-25T17:11:38.0656387Z 100  1583    0  1583    0     0   117k      0 --:--:-- --:--:-- --:--:--  117k
2026-11-25T17:11:38.0809905Z 
2026-11-25T17:11:38.0810143Z 100  1576    0  1576    0     0    99k      0 --:--:-- --:--:-- --:--:--   99k
2026-11-25T17:11:38.0937011Z 
2026-11-25T17:11:38.0937298Z 100  1726    0  1726    0     0   134k      0 --:--:-- --:--:-- --:--:--  134k
2026-11-25T17:11:38.1102162Z 
2026-11-25T17:11:38.1102386Z 100  1723    0  1723    0     0   102k      0 --:--:-- --:--:-- --:--:--  102k
2026-11-25T17:11:38.1234875Z 
2026-11-25T17:11:38.1235386Z 100  1728    0  1728    0     0   128k      0 --:--:-- --:--:-- --:--:--  128k
2026-11-25T17:11:38.1407616Z 
2026-11-25T17:11:38.1407916Z 100  1725    0  1725    0     0    98k      0 --:--:-- --:--:-- --:--:--   98k
2026-11-25T17:11:38.1535616Z 
2026-11-25T17:11:38.1536088Z 100  1412    0  1412    0     0   108k      0 --:--:-- --:--:-- --:--:--  108k
2026-11-25T17:11:38.1674383Z 
2026-11-25T17:11:38.1674732Z 100  1406    0  1406    0     0   100k      0 --:--:-- --:--:-- --:--:--  100k
2026-11-25T17:11:38.1801070Z 
2026-11-25T17:11:38.1801693Z 100  1407    0  1407    0     0   108k      0 --:--:-- --:--:-- --:--:--  108k
2026-11-25T17:11:38.1947700Z 
2026-11-25T17:11:38.1948103Z 100  1555    0  1555    0     0   104k      0 --:--:-- --:--:-- --:--:--  104k
2026-11-25T17:11:38.2078315Z 
2026-11-25T17:11:38.2078755Z 100 13641    0 13641    0     0  1029k      0 --:--:-- --:--:-- --:--:-- 1029k
2026-11-25T17:11:38.3391180Z 
2026-11-25T17:11:38.3392295Z 100 5010k    0 5010k    0     0  37.3M      0 --:--:-- --:--:-- --:--:-- 37.3M
2026-11-25T17:11:38.4560085Z 
2026-11-25T17:11:38.6251762Z 100  6151    0  6151    0     0  52612      0 --:--:-- --:--:-- --:--:-- 52612
2026-11-25T17:11:38.6252123Z 100 18.1M    0 18.1M    0     0  63.5M      0 --:--:-- --:--:-- --:--:--  108M
2026-11-25T17:11:38.6426074Z 
2026-11-25T17:11:38.6426863Z 100  6557    0  6557    0     0   364k      0 --:--:-- --:--:-- --:--:--  364k
2026-11-25T17:11:38.6574102Z 
2026-11-25T17:11:38.6574595Z 100  7616    0  7616    0     0   509k      0 --:--:-- --:--:-- --:--:--  509k
2026-11-25T17:11:38.6735198Z 
2026-11-25T17:11:38.6735681Z 100  5875    0  5875    0     0   359k      0 --:--:-- --:--:-- --:--:--  359k
2026-11-25T17:11:38.6885661Z 
2026-11-25T17:11:38.6885938Z 100 11130    0 11130    0     0   723k      0 --:--:-- --:--:-- --:--:--  723k
2026-11-25T17:11:38.7109824Z 
2026-11-25T17:11:38.7110549Z 100  238k    0  238k    0     0  10.5M      0 --:--:-- --:--:-- --:--:-- 10.5M
2026-11-25T17:11:38.7849317Z 
2026-11-25T17:11:38.7850043Z 100 4050k    0 4050k    0     0  53.6M      0 --:--:-- --:--:-- --:--:-- 53.6M
2026-11-25T17:11:38.8068549Z 
2026-11-25T17:11:38.8069322Z 100  7096    0  7096    0     0   315k      0 --:--:-- --:--:-- --:--:--  315k
2026-11-25T17:11:38.8213746Z 
2026-11-25T17:11:38.8214431Z 100  7882    0  7882    0     0   536k      0 --:--:-- --:--:-- --:--:--  536k
2026-11-25T17:11:38.8410249Z 
2026-11-25T17:11:38.8411077Z 100  9028    0  9028    0     0   449k      0 --:--:-- --:--:-- --:--:--  449k
2026-11-25T17:11:38.8546906Z 
2026-11-25T17:11:38.8547419Z 100  6206    0  6206    0     0   448k      0 --:--:-- --:--:-- --:--:--  448k
2026-11-25T17:11:38.8710429Z 
2026-11-25T17:11:38.8711124Z 100 47720    0 47720    0     0  2878k      0 --:--:-- --:--:-- --:--:-- 2878k
2026-11-25T17:11:38.8862956Z 
2026-11-25T17:11:38.8863331Z 100  5199    0  5199    0     0   334k      0 --:--:-- --:--:-- --:--:--  334k
2026-11-25T17:11:38.9020266Z 
2026-11-25T17:11:38.9020738Z 100 31845    0 31845    0     0  1991k      0 --:--:-- --:--:-- --:--:-- 1991k
2026-11-25T17:11:38.9164516Z 
2026-11-25T17:11:38.9164784Z 100  7506    0  7506    0     0   512k      0 --:--:-- --:--:-- --:--:--  512k
2026-11-25T17:11:38.9183760Z SIGEC-portabilidade
2026-11-25T17:11:38.9239367Z ##[section]Finishing: Recuperando nome do repositório

