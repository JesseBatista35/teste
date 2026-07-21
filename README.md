<img width="1890" height="950" alt="image" src="https://github.com/user-attachments/assets/0490b7a6-2016-47c6-8891-3bfc0a9ca88a" />


<img width="1889" height="919" alt="image" src="https://github.com/user-attachments/assets/0bf8d7ef-4ffb-4cca-8273-32a5da8c1cff" />



2026-07-17T12:44:50.7524962Z ##[debug]Evaluating condition for step: 'Deploy Pacote'
2026-07-17T12:44:50.7525579Z ##[debug]Evaluating: succeeded()
2026-07-17T12:44:50.7525774Z ##[debug]Evaluating succeeded:
2026-07-17T12:44:50.7526070Z ##[debug]=> True
2026-07-17T12:44:50.7526249Z ##[debug]Result: True
2026-07-17T12:44:50.7526617Z ##[section]Starting: Deploy Pacote
2026-07-17T12:44:50.7529921Z ==============================================================================
2026-07-17T12:44:50.7530039Z Task         : Bash
2026-07-17T12:44:50.7530102Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-17T12:44:50.7530194Z Version      : 3.227.0
2026-07-17T12:44:50.7530277Z Author       : Microsoft Corporation
2026-07-17T12:44:50.7530346Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-17T12:44:50.7530465Z ==============================================================================
2026-07-17T12:44:51.3442414Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-07-17T12:44:51.4098839Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-07-17T12:44:51.4106044Z ##[debug]loading inputs and endpoints
2026-07-17T12:44:51.4108534Z ##[debug]loading INPUT_TARGETTYPE
2026-07-17T12:44:51.4115849Z ##[debug]loading INPUT_FILEPATH
2026-07-17T12:44:51.4116807Z ##[debug]loading INPUT_SCRIPT
2026-07-17T12:44:51.4118297Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-07-17T12:44:51.4119435Z ##[debug]loading INPUT_FAILONSTDERR
2026-07-17T12:44:51.4119889Z ##[debug]loading INPUT_NOPROFILE
2026-07-17T12:44:51.4120705Z ##[debug]loading INPUT_NORC
2026-07-17T12:44:51.4121941Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-07-17T12:44:51.4122437Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-07-17T12:44:51.4123717Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-07-17T12:44:51.4128565Z ##[debug]loading SECRET_PW_ISILON
2026-07-17T12:44:51.4129863Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-07-17T12:44:51.4131287Z ##[debug]loading SECRET_PW_ALOCAIP
2026-07-17T12:44:51.4132719Z ##[debug]loading SECRET_API_KEY_SIRSA
2026-07-17T12:44:51.4133400Z ##[debug]loading SECRET_AZPAT
2026-07-17T12:44:51.4133817Z ##[debug]loading SECRET_CLISECRET
2026-07-17T12:44:51.4134302Z ##[debug]loading SECRET_OKD_TOKEN_PRODUTOS
2026-07-17T12:44:51.4134720Z ##[debug]loading SECRET_FORTIFY_PASS
2026-07-17T12:44:51.4135275Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-07-17T12:44:51.4135741Z ##[debug]loading SECRET_TOKEN_CRQ
2026-07-17T12:44:51.4137102Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-07-17T12:44:51.4137418Z ##[debug]loading SECRET_API_KEY_SIICO
2026-07-17T12:44:51.4137929Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-07-17T12:44:51.4138951Z ##[debug]loading SECRET_DB_PASS
2026-07-17T12:44:51.4139427Z ##[debug]loading SECRET_ANSIBLE_VAULT
2026-07-17T12:44:51.4139874Z ##[debug]loaded 25
2026-07-17T12:44:51.4143263Z ##[debug]Agent.ProxyUrl=undefined
2026-07-17T12:44:51.4143686Z ##[debug]Agent.CAInfo=undefined
2026-07-17T12:44:51.4144160Z ##[debug]Agent.ClientCert=undefined
2026-07-17T12:44:51.4144416Z ##[debug]Agent.SkipCertValidation=True
2026-07-17T12:44:51.4158736Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-07-17T12:44:51.4160606Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-07-17T12:44:51.4160876Z ##[debug]system.culture=en-US
2026-07-17T12:44:51.4168828Z ##[debug]failOnStderr=false
2026-07-17T12:44:51.4169482Z ##[debug]workingDirectory=/opt/ads-agent/_work/r3609/a
2026-07-17T12:44:51.4169872Z ##[debug]check path : /opt/ads-agent/_work/r3609/a
2026-07-17T12:44:51.4170799Z ##[debug]targetType=inline
2026-07-17T12:44:51.4171033Z ##[debug]bashEnvValue=undefined
2026-07-17T12:44:51.4172938Z ##[debug]script=REPO=$(echo _SIRSA-batch | sed 's/_//')
echo ansible-playbook /opt/ads-agent/esteira-batch/site.yml --tags batch --skip-tags "vm,monitoracao,autenticacao,git_conf,tsm,controlm" -e sistema_ambiente=des -e sistema_nome=sirsa-batch  -e default_working_directory_tfs=/opt/ads-agent/_work/r3609/a -e build_repository_name_tfs=$REPO -e quantidade_vm=1 -e url_deploy="`echo "http://binario.caixa:8081/repository/releases/br/gov/caixa/sirsa-batch/01.17.00.11/sirsa-batch-01.17.00.11.jar" | tr -d "\'"`" -e package_path=/opt/ads-agent/_work/r3609/a/binario/`basename http://binario.caixa:8081/repository/releases/br/gov/caixa/sirsa-batch/01.17.00.11/sirsa-batch-01.17.00.11.jar` -e site=$(site) -e batch_deploy=true


ansible-playbook /opt/ads-agent/esteira-batch/site.yml --tags batch --skip-tags "vm,monitoracao,autenticacao,git_conf,tsm,controlm" -e sistema_ambiente=des -e sistema_nome=sirsa-batch  -e default_working_directory_tfs=/opt/ads-agent/_work/r3609/a -e build_repository_name_tfs=$REPO -e quantidade_vm=1 -e url_deploy="`echo "http://binario.caixa:8081/repository/releases/br/gov/caixa/sirsa-batch/01.17.00.11/sirsa-batch-01.17.00.11.jar" | tr -d "\'"`" -e package_path=/opt/ads-agent/_work/r3609/a/binario/`basename http://binario.caixa:8081/repository/releases/br/gov/caixa/sirsa-batch/01.17.00.11/sirsa-batch-01.17.00.11.jar` -e site=$(site) -e batch_deploy=true
2026-07-17T12:44:51.4179875Z Generating script.
2026-07-17T12:44:51.4181869Z ##[debug]which 'bash'
2026-07-17T12:44:51.4186851Z ##[debug]found: '/bin/bash'
2026-07-17T12:44:51.4187172Z ##[debug]Agent.Version=3.225.2
2026-07-17T12:44:51.4187553Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-07-17T12:44:51.4187823Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-07-17T12:44:51.4190117Z ========================== Starting Command Output ===========================
2026-07-17T12:44:51.4191071Z ##[debug]which '/bin/bash'
2026-07-17T12:44:51.4191692Z ##[debug]found: '/bin/bash'
2026-07-17T12:44:51.4192270Z ##[debug]/bin/bash arg: /opt/ads-agent/_work/_temp/a179dcc9-efeb-4993-9d8d-e62ef4a1f860.sh
2026-07-17T12:44:51.4194798Z ##[debug]exec tool: /bin/bash
2026-07-17T12:44:51.4195177Z ##[debug]arguments:
2026-07-17T12:44:51.4195510Z ##[debug]   /opt/ads-agent/_work/_temp/a179dcc9-efeb-4993-9d8d-e62ef4a1f860.sh
2026-07-17T12:44:51.4196825Z [command]/bin/bash /opt/ads-agent/_work/_temp/a179dcc9-efeb-4993-9d8d-e62ef4a1f860.sh
2026-07-17T12:44:51.4290982Z /opt/ads-agent/_work/_temp/a179dcc9-efeb-4993-9d8d-e62ef4a1f860.sh: line 2: site: comando não encontrado
2026-07-17T12:44:51.4291829Z ansible-playbook /opt/ads-agent/esteira-batch/site.yml --tags batch --skip-tags vm,monitoracao,autenticacao,git_conf,tsm,controlm -e sistema_ambiente=des -e sistema_nome=sirsa-batch -e default_working_directory_tfs=/opt/ads-agent/_work/r3609/a -e build_repository_name_tfs=SIRSA-batch -e quantidade_vm=1 -e url_deploy=http://binario.caixa:8081/repository/releases/br/gov/caixa/sirsa-batch/01.17.00.11/sirsa-batch-01.17.00.11.jar -e package_path=/opt/ads-agent/_work/r3609/a/binario/sirsa-batch-01.17.00.11.jar -e site= -e batch_deploy=true
2026-07-17T12:44:51.4312761Z /opt/ads-agent/_work/_temp/a179dcc9-efeb-4993-9d8d-e62ef4a1f860.sh: line 5: site: comando não encontrado
2026-07-17T12:44:52.9101479Z 
2026-07-17T12:44:52.9102258Z PLAY [local] *******************************************************************
2026-07-17T12:44:52.9582291Z 
2026-07-17T12:44:52.9582796Z PLAY [Configurando o DNS] ******************************************************
2026-07-17T12:44:53.1027263Z 
2026-07-17T12:44:53.1028258Z PLAY [local] *******************************************************************
2026-07-17T12:44:53.1062501Z 
2026-07-17T12:44:53.1063032Z PLAY [Verificando serviços] ****************************************************
2026-07-17T12:44:53.1095800Z 
2026-07-17T12:44:53.1096191Z PLAY [Configuração LDAP] *******************************************************
2026-07-17T12:44:53.1123769Z 
2026-07-17T12:44:53.1124302Z PLAY [batch] *******************************************************************
2026-07-17T12:44:53.1150890Z 
2026-07-17T12:44:53.1151074Z PLAY [Configura TSM] ***********************************************************
2026-07-17T12:44:53.1178812Z 
2026-07-17T12:44:53.1179565Z PLAY [Configura Control-M] *****************************************************
2026-07-17T12:44:53.1204754Z 
2026-07-17T12:44:53.1205170Z PLAY [batch] *******************************************************************
2026-07-17T12:44:53.1239348Z Friday 17 July 2026  09:44:53 -0300 (0:00:00.278)       0:00:00.278 *********** 
2026-07-17T12:44:54.6160523Z 
2026-07-17T12:44:54.6161393Z TASK [Gathering Facts] *********************************************************
2026-07-17T12:44:54.6162089Z ok: [caddeapllx1369.agil.nprd.caixa.gov.br]
2026-07-17T12:44:54.6509455Z Friday 17 July 2026  09:44:54 -0300 (0:00:01.526)       0:00:01.805 *********** 
2026-07-17T12:44:54.6948524Z 
2026-07-17T12:44:54.6949480Z TASK [Gerando lista de secure files] *******************************************
2026-07-17T12:44:54.6949810Z ok: [caddeapllx1369.agil.nprd.caixa.gov.br]
2026-07-17T12:44:54.6965627Z 
2026-07-17T12:44:54.6966241Z PLAY [batch] *******************************************************************
2026-07-17T12:44:54.7209842Z Friday 17 July 2026  09:44:54 -0300 (0:00:00.070)       0:00:01.875 *********** 
2026-07-17T12:44:55.3375889Z 
2026-07-17T12:44:55.3376442Z TASK [Gathering Facts] *********************************************************
2026-07-17T12:44:55.3376602Z ok: [caddeapllx1369.agil.nprd.caixa.gov.br]
2026-07-17T12:44:55.3646062Z Friday 17 July 2026  09:44:55 -0300 (0:00:00.643)       0:00:02.518 *********** 
2026-07-17T12:44:55.7822609Z 
2026-07-17T12:44:55.7823527Z TASK [Cria Diretórios em /opt/batch/] ******************************************
2026-07-17T12:44:55.7823815Z ok: [caddeapllx1369.agil.nprd.caixa.gov.br] => (item=/opt/batch)
2026-07-17T12:44:55.9940935Z ok: [caddeapllx1369.agil.nprd.caixa.gov.br] => (item=/opt/batch/config)
2026-07-17T12:44:56.2159517Z ok: [caddeapllx1369.agil.nprd.caixa.gov.br] => (item=/opt/batch/deploy)
2026-07-17T12:44:56.4415796Z ok: [caddeapllx1369.agil.nprd.caixa.gov.br] => (item=/opt/batch/securefiles)
2026-07-17T12:44:56.4663692Z Friday 17 July 2026  09:44:56 -0300 (0:00:01.101)       0:00:03.620 *********** 
2026-07-17T12:44:56.5366103Z Friday 17 July 2026  09:44:56 -0300 (0:00:00.070)       0:00:03.690 *********** 
2026-07-17T12:44:56.6005079Z included: /opt/ads-agent/esteira-batch/batch_deploy.yml for caddeapllx1369.agil.nprd.caixa.gov.br
2026-07-17T12:44:56.6245898Z Friday 17 July 2026  09:44:56 -0300 (0:00:00.087)       0:00:03.778 *********** 
2026-07-17T12:45:01.5050840Z 
2026-07-17T12:45:01.5051702Z TASK [Deploy do Pacote] ********************************************************
2026-07-17T12:45:01.5052102Z changed: [caddeapllx1369.agil.nprd.caixa.gov.br]
2026-07-17T12:45:01.5293072Z Friday 17 July 2026  09:45:01 -0300 (0:00:04.904)       0:00:08.683 *********** 
2026-07-17T12:45:01.5702278Z 
2026-07-17T12:45:01.5703008Z PLAY RECAP *********************************************************************
2026-07-17T12:45:01.5703788Z caddeapllx1369.agil.nprd.caixa.gov.br : ok=6    changed=1    unreachable=0    failed=0    skipped=2    rescued=0    ignored=0   
2026-07-17T12:45:01.5703985Z 
2026-07-17T12:45:01.5704448Z Friday 17 July 2026  09:45:01 -0300 (0:00:00.041)       0:00:08.724 *********** 
2026-07-17T12:45:01.5705108Z =============================================================================== 
2026-07-17T12:45:01.5705622Z Deploy do Pacote -------------------------------------------------------- 4.90s
2026-07-17T12:45:01.5707574Z Gathering Facts --------------------------------------------------------- 1.53s
2026-07-17T12:45:01.5707878Z Cria Diretórios em /opt/batch/ ------------------------------------------ 1.10s
2026-07-17T12:45:01.5708130Z Gathering Facts --------------------------------------------------------- 0.64s
2026-07-17T12:45:01.5708451Z include_tasks ----------------------------------------------------------- 0.09s
2026-07-17T12:45:01.5708768Z include_tasks ----------------------------------------------------------- 0.07s
2026-07-17T12:45:01.5709176Z Gerando lista de secure files ------------------------------------------- 0.07s
2026-07-17T12:45:01.5709671Z include_tasks ----------------------------------------------------------- 0.04s
2026-07-17T12:45:01.5709825Z Playbook run took 0 days, 0 hours, 0 minutes, 8 seconds
2026-07-17T12:45:01.6195583Z ##[debug]Exit code 0 received from tool '/bin/bash'
2026-07-17T12:45:01.6197877Z ##[debug]STDIO streams have closed for tool '/bin/bash'
2026-07-17T12:45:01.6204149Z ##[debug]task result: Succeeded
2026-07-17T12:45:01.6205265Z ##[debug]Processed: ##vso[task.complete result=Succeeded;done=true;]
2026-07-17T12:45:01.6231078Z ##[section]Finishing: Deploy Pacote


Ir para Conteúdo Principal
SINCC
#INTERNO.TODOS
VMs
Linhas

50
1 - 1 de 1
VCenter
Cluster
VM Name
DNS Name
VM Host
Serial Number
Datacenter
Datastores
Resource Pool
Folder
Status
IPs
Subnets
Tipos
Nr. de CPUs
Memória (GB)
Sistema Operacional
Tamanho de Disco (GB)
Notas
Data da Coleta
VCenter
Cluster
VM Name
DNS Name
VM Host
Serial Number
Datacenter
Datastores
Resource Pool
Folder
Status
IPs
Subnets
Tipos
Nr. de CPUs
Memória (GB)
Sistema Operacional
Tamanho de Disco (GB)
Notas
Data da Coleta
cadsvgerap030-1.intra.caixa.gov.br	CTC_NPRDXF2488HV7_NPRD	CADDEAPLLX1369	caddeapllx1369	cadsvgersh613.intra.caixa.gov.br	PI00988800000249	NPRD	CTCHWNPRDPC03_0014	RP_NPRD_001	vm	Ligado	10.116.196.109, 192.168.236.89	10.116.192.0/19, 192.168.224.0/19	Vmxnet3, Vmxnet3	2	4	Red Hat Enterprise Linux 7 (64-bit)	36,08	
Build via Packer

21/07/2026 14:04:06
1 - 1 de 1
v1.2.0 - 12/08/2024 :: v1.9.5 - 09/07/2026
