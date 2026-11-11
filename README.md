1. Levantar o destino

Confirme o hostname e o IP do servidor Control-M do BR DES - Negocial, ou seja, o nome que vai substituir o crjdeaprlx038. Pegue de um agente que já esteja funcionando nesse datacenter, ou com o time do Control-M.

2. Repositório SIMIL-precificacao-rotinas-batch-config

No etc/hosts-des, troque a linha do crjdeaprlx038 pela do servidor novo (IP, FQDN e nome curto). Faça o commit na branch que a release consome.

Para não depender da esteira na hora de validar, aplique a mesma linha no /etc/hosts do caddeapllx2501. Assim a próxima release não sobrescreve com o valor antigo.

3. No caddeapllx2501 (usuário do agente)

cd ~/ctm/data
cp CONFIG.dat CONFIG.dat.bkp_$(date +%Y%m%d)
grep -E "CTMSHOST|CTMPERMHOSTS|AGTOCTMS|CTMSTOAG" CONFIG.dat

Ajuste CTMSHOST e CTMPERMHOSTS para o servidor novo. Pode editar direto ou usar o ctmagcfg. Mantenha as portas, salvo se o Negocial usar outras.

Teste a rede antes de reiniciar:

getent hosts <servidor_novo>
nc -zv <servidor_novo> <AGTOCTMS>

Reinicie e diagnostique:

shut-ag -u <usuario> -p ALL
start-ag -u <usuario> -p ALL
ag_diag_comm
ag_ping

4. Lado servidor

Verifique se o agente caddeapllx2501 está cadastrado no BR DES - Negocial e responde ao ping do servidor (CCM/Configuration, ou ctmping no servidor). Se não estiver cadastrado, o time do Control-M precisa incluir.

Se o nc ou o ag_diag_comm falharem, provavelmente é firewall entre o 2501 e o servidor Negocial. Nesse caso, você mesmo registra a regra vinculada a essa REQ.

5. Fechar




_meta": {
2026-11-09T18:06:58.7932149Z                 "hostvars": {
2026-11-09T18:06:58.7932334Z                     "caddeapllx2501.agil.nprd.caixa.gov.br": {
2026-11-09T18:06:58.7932492Z                         "ambiente": "des",
2026-11-09T18:06:58.7932766Z                         "ansible_host": "10.116.200.250",
2026-11-09T18:06:58.7933220Z                         "cluster": null,
2026-11-09T18:06:58.7933323Z                         "cluster_principal": null,

Valide com o Iury rodando um job de teste. Depois disso eu monto a nota de encerramento.

Se quiser, cole aqui a saída do grep no CONFIG.dat e do ag_diag_comm que eu confiro antes de você reiniciar.



    │                                                                      │
    │ ⮞ For more info, ctrl+click on help or visit our website.            │
    └──────────────────────────────────────────────────────────────────────┘

Last login: Wed Nov 11 11:34:47 2026 from 10.211.12.73
[p585600@cadsvitrlx100 ~]$ ssh 10.116.200.250
p585600@10.116.200.250's password:
Last login: Fri Oct 30 14:58:30 2026 from 10.122.150.31
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$ cd ~/ctm/data
cp CONFIG.dat CONFIG.dat.bkp_$(date +%Y%m%d)
grep -E "CTMSHOST|CTMPERMHOSTS|AGTOCTMS|CTMSTOAG" CONFIG.dat
-sh: cd: /home/p585600/ctm/data: Arquivo ou diretório inexistente
cp: não foi possível obter estado de 'CONFIG.dat': Arquivo ou diretório inexistente
grep: CONFIG.dat: Arquivo ou diretório inexistente
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$







cara me paasa um pasos a pasos melhor

2026-11-09T18:06:47.9222907Z ##[section]Starting: Initialize job
2026-11-09T18:06:47.9225029Z Agent name: 'azp-ads-agent-release-5cd876f98-zxzcb'
2026-11-09T18:06:47.9225365Z Agent machine name: 'ads-agent-release-5cd876f98-zxzcb'
2026-11-09T18:06:47.9225622Z Current agent version: '3.236.1'
2026-11-09T18:06:47.9239608Z Agent running as: 'root'
2026-11-09T18:06:47.9247183Z Prepare release directory.
2026-11-09T18:06:47.9252421Z ReleaseId=552956, TeamProjectId=98fe0311-ffd2-418a-9d0d-507043380abd, ReleaseDefinitionName=SIMIL-precificacao-rotinas-batch
2026-11-09T18:06:47.9299157Z Release folder: /opt/ads-agent/_work/r37/a
2026-11-09T18:06:47.9349989Z Environment variables available are below.  Note that these environment variables can be referred to in the task (in the ReleaseDefinition) by replacing "_" with "." e.g. AGENT_NAME environment variable can be referenced using Agent.Name in the ReleaseDefinition: 
				[AGCMNDATA] --> [7016]
				[AGENT_ACCEPTTEEEULA] --> [True]
				[AGENT_CLOUDID] --> []
				[AGENT_DISABLELOGPLUGIN_TESTFILEPUBLISHERPLUGIN] --> [true]
				[AGENT_DISABLELOGPLUGIN_TESTRESULTLOGPLUGIN] --> [true]
				[AGENT_HOMEDIRECTORY] --> [/opt/ads-agent]
				[AGENT_ID] --> [3538]
				[AGENT_ISSELFHOSTED] --> [1]
				[AGENT_JOBNAME] --> [Agent job]
				[AGENT_MACHINENAME] --> [ads-agent-release-5cd876f98-zxzcb]
				[AGENT_NAME] --> [azp-ads-agent-release-5cd876f98-zxzcb]
				[AGENT_OS] --> [Linux]
				[AGENT_OSARCHITECTURE] --> [X64]
				[AGENT_READONLYVARIABLES] --> [true]
				[AGENT_RELEASEDIRECTORY] --> [/opt/ads-agent/_work/r37/a]
				[AGENT_RETAINDEFAULTENCODING] --> [false]
				[AGENT_ROOTDIRECTORY] --> [/opt/ads-agent/_work]
				[AGENT_SKIPCERTVALIDATION] --> [True]
				[AGENT_TASKRESTRICTIONSENFORCEMENTMODE] --> [Enabled]
				[AGENT_TEMPDIRECTORY] --> [/opt/ads-agent/_work/_temp]
				[AGENT_TOOLSDIRECTORY] --> [/opt/ads-agent/_work/_tool]
				[AGENT_USEWORKSPACEID] --> [true]
				[AGENT_VERSION] --> [3.236.1]
				[AGENT_WORKFOLDER] --> [/opt/ads-agent/_work]
				[AMBIENTE] --> [DES]
				[ANSIBLE_CONFIG] --> [$(System.DefaultWorkingDirectory)/esteira-jboss-vm-v2/ansible.cfg]
				[ANSIBLE_INVENTORY_ANY_UNPARSED_IS_FAILED] --> [True]
				[ATCMNDATA] --> [7015]
				[AZURE_HTTP_USER_AGENT] --> [TFS_7b4c9d5c-b041-4798-8dcb-fb11786a173b_Release__552956_2570045_1]
				[AZUSER] --> [s736639]
				[BT_API_URL] --> [https://sicsn.caixa/BeyondTrust/api/public/v3]
				[BUILD_BUILDID] --> [850941]
				[BUILD_BUILDNUMBER] --> [0.0.1-SNAPSHOT]
				[BUILD_BUILDURI] --> [vstfs:///Build/Build/850941]
				[BUILD_DEFINITIONID] --> [6334]
				[BUILD_DEFINITIONNAME] --> [SIMIL-precificacao-rotinas-batch]
				[BUILD_PROJECTID] --> [98fe0311-ffd2-418a-9d0d-507043380abd]
				[BUILD_PROJECTNAME] --> [Caixa]
				[BUILD_REPOSITORY_ID] --> [0bd6fdb1-c343-4808-ae3e-8cb58b39fd52]
				[BUILD_REPOSITORY_NAME] --> [SIMIL-precificacao-rotinas-batch]
				[BUILD_REPOSITORY_PROVIDER] --> [TfsGit]
				[BUILD_REQUESTEDFOR] --> [Karlismar George Velozo Pereira]
				[BUILD_REQUESTEDFORID] --> [7cb464f9-5928-4889-b7b7-ea670cc19c64]
				[BUILD_SOURCEBRANCH] --> [refs/heads/develop]
				[BUILD_SOURCEBRANCHNAME] --> [develop]
				[BUILD_SOURCEVERSION] --> [7162684bb2a07f01ee8d081b989c431437dee9cf]
				[BUILD_TYPE] --> [Build]
				[CGC_UNIDADE_DES] --> [7390]
				[CGC_UNIDADE_OPS] --> [7259]
				[CI_NAME] --> [7366CLU-OKD4-PRODUTOS]
				[CTMPERMHOSTS] --> [crjdeaprlx038,crjdeaprlx039]
				[CTMSHOST] --> [crjdeaprlx038]
				[DIR_ANSIBLE] --> [esteira-jboss-vm-v2]
				[DIR_LOGS] --> [/opt/ads-agent/esteira-logs]
				[FORTIFY_API] --> [https://novocodigoseguro.caixa/ssc/api/v1]
				[FORTIFY_USER] --> [admin]
				[GIT_TERMINAL_PROMPT] --> [0]
				[GRAYLOG_USERNAME] --> [API_CLIENT]
				[HOME_ADS_AGENT] --> [$(System.DefaultWorkingDirectory)]
				[HTTP_CONTEXT_ADDITIONAL] --> []
				[HTTP_CONTEXT_DEFAULT] --> [/controlm]
				[HTTP_SSO] --> [no]
				[INFRAFACIL] --> [infradevops-novoportal-backend-prd.apps.produtos4.caixa]
				[INIT] --> [Criado via api]
				[JVM_HEAP_MAX] --> [4096m]
				[JVM_HEAP_MIN] --> [4096m]
				[JVM_METASPACE_MAX] --> [512m]
				[JVM_METASPACE_MIN] --> [512M]
				[MSDEPLOY_HTTP_USER_AGENT] --> [TFS_7b4c9d5c-b041-4798-8dcb-fb11786a173b_Release__552956_2570045_1]
				[NO_PROXY] --> [10.122.144.168,10.122.144.195,10.122.144.130,10.221.144.17,devops.caixa,cadsvgerap004-1.intra.caixa.gov.br,cadsvgerap028-1.intra.caixa.gov.br,infradevops-novoportal-backend-prd.apps.produtos4.caixa,infradevops-ads-api-prd.apps.produtos4.caixa,infradevops-db-api-prd.apps.produtos4.caixa,cadsvgerap027-1.intra.caixa.gov.br]
				[OKD_API_PRODUTOS] --> [api.produtos4.caixa:6443]
				[OKD_KAFKA] --> [api.kafka-nprd.caixa:6443]
				[OKD_REGISTRY_PRODUTOS] --> [default-route-openshift-image-registry.apps.produtos4.caixa]
				[OKD_URL_SUFFIX_PRODUTOS] --> [api.produtos4.caixa:6443]
				[OKD_USER_SERVICE_PRODUTOS] --> [ads-sa]
				[PASSWORD_TRUSTSTORE] --> [changeit]
				[PATH_DESTINO] --> [/sample]
				[PATH_NFS] --> [/ifs/CADSVISISD4/SERVIDORES/CESTI/SAMPLE_DES]
				[PRODUTO_NOME_VM] --> [Jboss EAP]
				[PRODUTO_VERSAO_VM] --> [7.1]
				[RELEASE_ARTIFACTS_ESTEIRA-JBOSS-VM-V2_BUILDID] --> [32630c5b314e4d37086df7270d81e8c82dcb5011]
				[RELEASE_ARTIFACTS_ESTEIRA-JBOSS-VM-V2_BUILDNUMBER] --> [32630c5b]
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
				[RELEASE_ARTIFACTS_ESTEIRA-JBOSS-VM-V2_SOURCEVERSION] --> [32630c5b314e4d37086df7270d81e8c82dcb5011]
				[RELEASE_ARTIFACTS_ESTEIRA-JBOSS-VM-V2_TYPE] --> [Git]
				[RELEASE_ARTIFACTS_TERRAFORM-ESTEIRA_BUILDID] --> [b80af7bae3a3d50a77de8ad8319b18a0d654cb71]
				[RELEASE_ARTIFACTS_TERRAFORM-ESTEIRA_BUILDNUMBER] --> [b80af7ba]
				[RELEASE_ARTIFACTS_TERRAFORM-ESTEIRA_DEFINITIONID] --> [480084d9-f83f-41ea-a204-898969c490fd]
				[RELEASE_ARTIFACTS_TERRAFORM-ESTEIRA_DEFINITIONNAME] --> [terraform-esteira]
				[RELEASE_ARTIFACTS_TERRAFORM-ESTEIRA_DEFINTIONID] --> [480084d9-f83f-41ea-a204-898969c490fd]
				[RELEASE_ARTIFACTS_TERRAFORM-ESTEIRA_PROJECTID] --> [d90bc0d4-90c2-46f7-8c37-c656389278e8]
				[RELEASE_ARTIFACTS_TERRAFORM-ESTEIRA_PROJECTNAME] --> [Infraestrutura]
				[RELEASE_ARTIFACTS_TERRAFORM-ESTEIRA_REPOSITORY_ID] --> [480084d9-f83f-41ea-a204-898969c490fd]
				[RELEASE_ARTIFACTS_TERRAFORM-ESTEIRA_REPOSITORY_NAME] --> [terraform-esteira]
				[RELEASE_ARTIFACTS_TERRAFORM-ESTEIRA_REPOSITORY_PROVIDER] --> [Git]
				[RELEASE_ARTIFACTS_TERRAFORM-ESTEIRA_REPOSITORY_URI] --> [https://devops.caixa/projetos/Infraestrutura/_git/esteira-vm-release-terraform]
				[RELEASE_ARTIFACTS_TERRAFORM-ESTEIRA_SOURCEBRANCH] --> [main]
				[RELEASE_ARTIFACTS_TERRAFORM-ESTEIRA_SOURCEVERSION] --> [b80af7bae3a3d50a77de8ad8319b18a0d654cb71]
				[RELEASE_ARTIFACTS_TERRAFORM-ESTEIRA_TYPE] --> [Git]
				[RELEASE_ARTIFACTS__SIMIL-PRECIFICACAO-ROTINAS-BATCH-CONFIG_BUILDID] --> [d574e8917158eca2436dd405ba544286ec436f00]
				[RELEASE_ARTIFACTS__SIMIL-PRECIFICACAO-ROTINAS-BATCH-CONFIG_BUILDNUMBER] --> [d574e891]
				[RELEASE_ARTIFACTS__SIMIL-PRECIFICACAO-ROTINAS-BATCH-CONFIG_DEFINITIONID] --> [d7dbae6b-2d71-4650-9a95-ce72ce0d7323]
				[RELEASE_ARTIFACTS__SIMIL-PRECIFICACAO-ROTINAS-BATCH-CONFIG_DEFINITIONNAME] --> [SIMIL-precificacao-rotinas-batch-config]
				[RELEASE_ARTIFACTS__SIMIL-PRECIFICACAO-ROTINAS-BATCH-CONFIG_DEFINTIONID] --> [d7dbae6b-2d71-4650-9a95-ce72ce0d7323]
				[RELEASE_ARTIFACTS__SIMIL-PRECIFICACAO-ROTINAS-BATCH-CONFIG_PROJECTID] --> [98fe0311-ffd2-418a-9d0d-507043380abd]
				[RELEASE_ARTIFACTS__SIMIL-PRECIFICACAO-ROTINAS-BATCH-CONFIG_PROJECTNAME] --> [Caixa]
				[RELEASE_ARTIFACTS__SIMIL-PRECIFICACAO-ROTINAS-BATCH-CONFIG_REPOSITORY_ID] --> [d7dbae6b-2d71-4650-9a95-ce72ce0d7323]
				[RELEASE_ARTIFACTS__SIMIL-PRECIFICACAO-ROTINAS-BATCH-CONFIG_REPOSITORY_NAME] --> [SIMIL-precificacao-rotinas-batch-config]
				[RELEASE_ARTIFACTS__SIMIL-PRECIFICACAO-ROTINAS-BATCH-CONFIG_REPOSITORY_PROVIDER] --> [Git]
				[RELEASE_ARTIFACTS__SIMIL-PRECIFICACAO-ROTINAS-BATCH-CONFIG_REPOSITORY_URI] --> [https://devops.caixa/projetos/Caixa/_git/SIMIL-precificacao-rotinas-batch-config]
				[RELEASE_ARTIFACTS__SIMIL-PRECIFICACAO-ROTINAS-BATCH-CONFIG_SOURCEBRANCH] --> [main]
				[RELEASE_ARTIFACTS__SIMIL-PRECIFICACAO-ROTINAS-BATCH-CONFIG_SOURCEVERSION] --> [d574e8917158eca2436dd405ba544286ec436f00]
				[RELEASE_ARTIFACTS__SIMIL-PRECIFICACAO-ROTINAS-BATCH-CONFIG_TYPE] --> [Git]
				[RELEASE_ARTIFACTS__SIMIL-PRECIFICACAO-ROTINAS-BATCH_BUILDID] --> [850941]
				[RELEASE_ARTIFACTS__SIMIL-PRECIFICACAO-ROTINAS-BATCH_BUILDNUMBER] --> [0.0.1-SNAPSHOT]
				[RELEASE_ARTIFACTS__SIMIL-PRECIFICACAO-ROTINAS-BATCH_BUILDURI] --> [vstfs:///Build/Build/850941]
				[RELEASE_ARTIFACTS__SIMIL-PRECIFICACAO-ROTINAS-BATCH_DEFINITIONID] --> [6334]
				[RELEASE_ARTIFACTS__SIMIL-PRECIFICACAO-ROTINAS-BATCH_DEFINITIONNAME] --> [SIMIL-precificacao-rotinas-batch]
				[RELEASE_ARTIFACTS__SIMIL-PRECIFICACAO-ROTINAS-BATCH_PROJECTID] --> [98fe0311-ffd2-418a-9d0d-507043380abd]
				[RELEASE_ARTIFACTS__SIMIL-PRECIFICACAO-ROTINAS-BATCH_PROJECTNAME] --> [Caixa]
				[RELEASE_ARTIFACTS__SIMIL-PRECIFICACAO-ROTINAS-BATCH_REPOSITORY_ID] --> [0bd6fdb1-c343-4808-ae3e-8cb58b39fd52]
				[RELEASE_ARTIFACTS__SIMIL-PRECIFICACAO-ROTINAS-BATCH_REPOSITORY_NAME] --> [SIMIL-precificacao-rotinas-batch]
				[RELEASE_ARTIFACTS__SIMIL-PRECIFICACAO-ROTINAS-BATCH_REPOSITORY_PROVIDER] --> [TfsGit]
				[RELEASE_ARTIFACTS__SIMIL-PRECIFICACAO-ROTINAS-BATCH_REQUESTEDFOR] --> [Karlismar George Velozo Pereira]
				[RELEASE_ARTIFACTS__SIMIL-PRECIFICACAO-ROTINAS-BATCH_REQUESTEDFORID] --> [7cb464f9-5928-4889-b7b7-ea670cc19c64]
				[RELEASE_ARTIFACTS__SIMIL-PRECIFICACAO-ROTINAS-BATCH_SOURCEBRANCH] --> [refs/heads/develop]
				[RELEASE_ARTIFACTS__SIMIL-PRECIFICACAO-ROTINAS-BATCH_SOURCEBRANCHNAME] --> [develop]
				[RELEASE_ARTIFACTS__SIMIL-PRECIFICACAO-ROTINAS-BATCH_SOURCEVERSION] --> [7162684bb2a07f01ee8d081b989c431437dee9cf]
				[RELEASE_ARTIFACTS__SIMIL-PRECIFICACAO-ROTINAS-BATCH_TYPE] --> [Build]
				[RELEASE_ATTEMPTNUMBER] --> [1]
				[RELEASE_DEFINITIONENVIRONMENTID] --> [27782]
				[RELEASE_DEFINITIONID] --> [6041]
				[RELEASE_DEFINITIONNAME] --> [SIMIL-precificacao-rotinas-batch]
				[RELEASE_DEPLOYMENT_REQUESTEDFOR] --> [Iury Damasceno Mota]
				[RELEASE_DEPLOYMENT_REQUESTEDFOREMAIL] --> [c161214@corp.caixa.gov.br]
				[RELEASE_DEPLOYMENT_REQUESTEDFORID] --> [c23adbd4-194b-4f92-8a1b-e9a3bb8b0a37]
				[RELEASE_DEPLOYMENT_STARTTIME] --> [2026-11-09 18:06:42Z]
				[RELEASE_DEPLOYMENTID] --> [867578]
				[RELEASE_DEPLOYPHASEID] --> [853657]
				[RELEASE_ENVIRONMENTID] --> [2570045]
				[RELEASE_ENVIRONMENTNAME] --> [EC DES]
				[RELEASE_ENVIRONMENTS_EC_DES_STATUS] --> [InProgress]
				[RELEASE_ENVIRONMENTS_EC_HMP_STATUS] --> [NotStarted]
				[RELEASE_ENVIRONMENTS_EC_PRD_CTC_STATUS] --> [NotStarted]
				[RELEASE_ENVIRONMENTS_EC_PRD_DTC_STATUS] --> [NotStarted]
				[RELEASE_ENVIRONMENTS_EC_TQS_STATUS] --> [NotStarted]
				[RELEASE_ENVIRONMENTURI] --> [vstfs:///ReleaseManagement/Environment/2570045]
				[RELEASE_PRIMARYARTIFACTSOURCEALIAS] --> [_SIMIL-precificacao-rotinas-batch]
				[RELEASE_REASON] --> [Manual]
				[RELEASE_RELEASEDESCRIPTION] --> []
				[RELEASE_RELEASEID] --> [552956]
				[RELEASE_RELEASENAME] --> [SIMIL-precificacao-rotinas-batch-19]
				[RELEASE_RELEASEURI] --> [vstfs:///ReleaseManagement/Release/552956]
				[RELEASE_RELEASEWEBURL] --> [https://devops.caixa/projetos/98fe0311-ffd2-418a-9d0d-507043380abd/_release?releaseId=552956&_a=release-summary]
				[RELEASE_REQUESTEDFOR] --> [Iury Damasceno Mota]
				[RELEASE_REQUESTEDFOREMAIL] --> [c161214@corp.caixa.gov.br]
				[RELEASE_REQUESTEDFORID] --> [c23adbd4-194b-4f92-8a1b-e9a3bb8b0a37]
				[RELEASE_SKIPARTIFACTSDOWNLOAD] --> [False]
				[RELEASE_TRIGGERINGARTIFACT_ALIAS] --> []
				[REPOSITORY_LOGS] --> [https://devops.caixa/projetos/Infraestrutura/_git/esteira-logs]
				[REPO_ESTEIRA_JBOSS_VM] --> [https://devops.caixa/projetos/Infraestrutura/_git/esteira-jboss-vm-v2]
				[REPO_ESTEIRA_JBOSS_VM_BRANCH] --> [master]
				[REPO_ESTEIRA_TERRAFORM] --> [https://devops.caixa/projetos/Infraestrutura/_git/esteira-vm-release-terraform]
				[REPO_ESTEIRA_TERRAFORM_BRANCH] --> [main]
				[REQUESTEDFORID] --> [c23adbd4-194b-4f92-8a1b-e9a3bb8b0a37]
				[SERVER_NFS] --> [nfsctcnprd.ctc.caixa]
				[SISTEMA_AMBIENTE] --> [des]
				[SISTEMA_NOME] --> [simil-precificacao-rotinas-batch]
				[SITE] --> [ctc_nprd]
				[SIZE_VOLUME] --> [50Gi]
				[SONAR_URL] --> [http://sonar.produtos.caixa]
				[SPRING_APPLICATION_NAME] --> [simil-precificacao-rotinas-batch]
				[SPRING_BATCH_JDBC_INITIALIZE_SCHEMA] --> [always]
				[SPRING_DATASOURCE_DRIVERCLASSNAME] --> [org.postgresql.Driver]
				[SPRING_DATASOURCE_HIKARI_CONNECTION_TIMEOUT] --> [20000]
				[SPRING_DATASOURCE_PASSWORD] --> [mil_prd_001]
				[SPRING_DATASOURCE_URL] --> [jdbc:postgresql://SCTDEDADLX0004.DF.CAIXA:5432/DESENVOLVIMENTO]
				[SPRING_DATASOURCE_USERNAME] --> [mil_prd_001]
				[SPRING_JPA_DATABASE_PLATFORM] --> [org.hibernate.dialect.PostgreSQLDialect]
				[SPRING_JPA_HIBERNATE_DDL_AUTO] --> [validate]
				[SPRING_JPA_PROPERTIES_HIBERNATE_DEFAULT_SCHEMA] --> [milsm001]
				[SPRING_JPA_PROPERTIES_HIBERNATE_FORMAT_SQL] --> [true]
				[SPRING_JPA_PROPERTIES_HIBERNATE_SHOW_SQL] --> [false]
				[SPRING_JPA_PROPERTIES_HIBERNATE_USE_SQL_COMMENTS] --> [false]
				[SSO_URL_INTERNET] --> [https://login.des.caixa.gov.br]
				[SSO_URL_INTRANET] --> [https://login.des.caixa]
				[SYSTEM] --> [release]
				[SYSTEM_ACCESSTOKEN] --> [***]
				[SYSTEM_ARTIFACTSDIRECTORY] --> [/opt/ads-agent/_work/r37/a]
				[SYSTEM_COLLECTIONID] --> [7b4c9d5c-b041-4798-8dcb-fb11786a173b]
				[SYSTEM_COLLECTIONURI] --> [https://devops.caixa/projetos/]
				[SYSTEM_CULTURE] --> [en-US]
				[SYSTEM_DEFAULTWORKINGDIRECTORY] --> [/opt/ads-agent/_work/r37/a]
				[SYSTEM_DEFINITIONID] --> [6041]
				[SYSTEM_DEFINITIONNAME] --> [SIMIL-precificacao-rotinas-batch]
				[SYSTEM_ENABLEACCESSTOKEN] --> [True]
				[SYSTEM_HOSTTYPE] --> [release]
				[SYSTEM_ISAZUREVM] --> [0]
				[SYSTEM_ISDOCKERCONTAINER] --> [0]
				[SYSTEM_ISSCHEDULED] --> [False]
				[SYSTEM_JOBATTEMPT] --> [1]
				[SYSTEM_JOBDISPLAYNAME] --> [Agent job]
				[SYSTEM_JOBID] --> [bf9e9277-801c-5bca-dfa4-3b64f87cf0a8]
				[SYSTEM_JOBIDENTIFIER] --> [Stage_98fe0311ffd2418a9d0d507043380abd_27782_1.Phase_1.__default]
				[SYSTEM_JOBNAME] --> [__default]
				[SYSTEM_JOBPARALLELISMTAG] --> [Private]
				[SYSTEM_JOBPOSITIONINPHASE] --> [1]
				[SYSTEM_JOBTIMEOUT] --> [0]
				[SYSTEM_PHASEATTEMPT] --> [1]
				[SYSTEM_PHASEDISPLAYNAME] --> [Agent job]
				[SYSTEM_PHASEID] --> [22a71b3f-9c0b-5c04-8dc7-b74efeabf213]
				[SYSTEM_PHASENAME] --> [Phase_1]
				[SYSTEM_PIPELINESTARTTIME] --> [2026-11-09 15:06:44-03:00]
				[SYSTEM_PLANID] --> [c114e5f6-1797-44e5-b49f-9cdc6cd9c30f]
				[SYSTEM_SERVERTYPE] --> [OnPremises]
				[SYSTEM_STAGEATTEMPT] --> [1]
				[SYSTEM_STAGEDISPLAYNAME] --> [EC DES]
				[SYSTEM_STAGEID] --> [2d9ee79f-a157-5d12-ea1a-4b5732f4222a]
				[SYSTEM_STAGENAME] --> [Stage_98fe0311ffd2418a9d0d507043380abd_27782_1]
				[SYSTEM_TASKDEFINITIONSURI] --> [https://devops.caixa/projetos/]
				[SYSTEM_TEAMFOUNDATIONCOLLECTIONURI] --> [https://devops.caixa/projetos/]
				[SYSTEM_TEAMFOUNDATIONSERVERURI] --> [https://devops.caixa/projetos/]
				[SYSTEM_TEAMPROJECT] --> [Caixa]
				[SYSTEM_TEAMPROJECTID] --> [98fe0311-ffd2-418a-9d0d-507043380abd]
				[SYSTEM_TIMELINEID] --> [c114e5f6-1797-44e5-b49f-9cdc6cd9c30f]
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
				[TESTE_TRUST] --> [caixa-truststore-acteste-nprd.jks]
				[TF_HTTPS_NO_PROXY] --> [10.122.144.168,10.122.144.195,10.122.144.130,10.221.144.17,*.caixa,*.intra.caixa.gov.br,cadsvgerap030-1.intra.caixa.gov.br,cadsvgerap027-1.intra.caixa.gov.br,cadsvgerap028-1.intra.caixa.gov.br,cert-api.access.redhat.com,cadsvgerap107-1.intra.caixa.gov.br]
				[TF_HTTPS_PROXY] --> [http://proxynuvem.caixa:80]
				[TF_VAR_TEMPLATE_NAME] --> [controlm9p-openjdk17-rhel93-v038]
				[URL_CRQ] --> [https://infradevops-novoportal-backend-prd.apps.produtos4.caixa/api.php?acao=devopsCaixacriarMudancaPadrao]
				[VERSAO] --> [0.0.1-SNAPSHOT]
				[_ENV_BATCH_CHUNK_SIZE] --> [100]
				[_ENV_CAIXA_API_BASE_URL] --> [https://api.des.caixa:8443/informacoes-corporativas-publicas]
				[_ENV_SIICO_API_KEY] --> [l7206c7a21f6334eca8e9f08e50e4efa7f]
				[_ENV_SIICO_CLIENT_SECRET] --> [350fdfc0-1596-4355-ac1b-30b346c2113c]
				[_ENV_SIICO_TOKEN_URL] --> [https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token]
				[_ENV_SPRING_OAUTH2_CLIENT_ID] --> [cli-ser-mil]
2026-11-09T18:06:48.1017098Z Download all required tasks.
2026-11-09T18:06:48.2349516Z Checking job knob settings.
2026-11-09T18:06:48.2363815Z Finished checking job knob settings.
2026-11-09T18:06:48.2632201Z Start tracking orphan processes.
2026-11-09T18:06:48.2679818Z ##[section]Finishing: Initialize job


