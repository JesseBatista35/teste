2026-08-20T19:53:01.3411893Z ##[debug]Evaluating condition for step: 'Terraform apply'
2026-08-20T19:53:01.3412536Z ##[debug]Evaluating: succeeded()
2026-08-20T19:53:01.3412888Z ##[debug]Evaluating succeeded:
2026-08-20T19:53:01.3413217Z ##[debug]=> True
2026-08-20T19:53:01.3413443Z ##[debug]Result: True
2026-08-20T19:53:01.3413664Z ##[section]Starting: Terraform apply
2026-08-20T19:53:01.3416775Z ==============================================================================
2026-08-20T19:53:01.3416854Z Task         : Bash
2026-08-20T19:53:01.3416989Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-20T19:53:01.3417076Z Version      : 3.227.0
2026-08-20T19:53:01.3417123Z Author       : Microsoft Corporation
2026-08-20T19:53:01.3417175Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-20T19:53:01.3417258Z ==============================================================================
2026-08-20T19:53:02.2754755Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-08-20T19:53:02.3478866Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-08-20T19:53:02.3481753Z ##[debug]loading inputs and endpoints
2026-08-20T19:53:02.3483974Z ##[debug]loading INPUT_TARGETTYPE
2026-08-20T19:53:02.3489631Z ##[debug]loading INPUT_FILEPATH
2026-08-20T19:53:02.3491774Z ##[debug]loading INPUT_SCRIPT
2026-08-20T19:53:02.3493882Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-08-20T19:53:02.3496007Z ##[debug]loading INPUT_FAILONSTDERR
2026-08-20T19:53:02.3542041Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-08-20T19:53:02.3542654Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-08-20T19:53:02.3543137Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-08-20T19:53:02.3545422Z ##[debug]loading SECRET_TOKEN_CRQ
2026-08-20T19:53:02.3545780Z ##[debug]loading SECRET_AZPAT
2026-08-20T19:53:02.3546140Z ##[debug]loading SECRET_ARM_ACCESS_KEY
2026-08-20T19:53:02.3546481Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-08-20T19:53:02.3547064Z ##[debug]loading SECRET_PW_ISILON
2026-08-20T19:53:02.3549193Z ##[debug]loading SECRET_TOKEN_INFRAFACIL_MUDANCA
2026-08-20T19:53:02.3549537Z ##[debug]loading SECRET_ANSIBLE_VAULT
2026-08-20T19:53:02.3549890Z ##[debug]loading SECRET_PW_ALOCAIP
2026-08-20T19:53:02.3552128Z ##[debug]loading SECRET_FORTIFY_PASS
2026-08-20T19:53:02.3552469Z ##[debug]loading SECRET_OKD_TOKEN_PRODUTOS
2026-08-20T19:53:02.3552826Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-08-20T19:53:02.3554932Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-08-20T19:53:02.3555254Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-08-20T19:53:02.3555593Z ##[debug]loading SECRET_CV_SENHAORACLE
2026-08-20T19:53:02.3557805Z ##[debug]loading SECRET_SENHASERVICO
2026-08-20T19:53:02.3558140Z ##[debug]loading SECRET_TERRAFORM_ESX_PASSWORD
2026-08-20T19:53:02.3558559Z ##[debug]loaded 24
2026-08-20T19:53:02.3560643Z ##[debug]Agent.ProxyUrl=undefined
2026-08-20T19:53:02.3560967Z ##[debug]Agent.CAInfo=undefined
2026-08-20T19:53:02.3561312Z ##[debug]Agent.ClientCert=undefined
2026-08-20T19:53:02.3563421Z ##[debug]Agent.SkipCertValidation=True
2026-08-20T19:53:02.3563777Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-08-20T19:53:02.3564210Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-08-20T19:53:02.3566346Z ##[debug]system.culture=en-US
2026-08-20T19:53:02.3566663Z ##[debug]failOnStderr=true
2026-08-20T19:53:02.3567097Z ##[debug]workingDirectory=/opt/ads-agent/_work/r15264/a
2026-08-20T19:53:02.3569214Z ##[debug]check path : /opt/ads-agent/_work/r15264/a
2026-08-20T19:53:02.3569543Z ##[debug]targetType=inline
2026-08-20T19:53:02.3569882Z ##[debug]bashEnvValue=undefined
2026-08-20T19:53:02.3572632Z ##[debug]script=export HTTPS_PROXY=$TF_HTTPS_PROXY
export NO_PROXY=$TF_HTTPS_NO_PROXY,infradevops-novoportal-backend-prd.apps.produtos4.caixa

# export TF_LOG=DEBUG

dir_terraform=$(ls "/opt/ads-agent/_work/r15264/a" | grep terraform | head -1)

cd "/opt/ads-agent/_work/r15264/a/$dir_terraform" || exit 1

terraform plan -no-color -out=tfplan.binary && \
terraform show -json tfplan.binary > tfplan.json

if grep -E -q '"(create|delete)"' tfplan.json; then
  echo "Recursos serão alterados. Abrindo mudança de HSI!"

  terraform plan -no-color | grep -B2 -E '[ +-] resource ' > tfplan.txt

  REPO=$(echo "_SICCV-batch" | sed 's/_//')

  lista_hostnames=`grep -o -E '\["[^"]*"\]' tfplan.txt | sed 's/\..*"/"/' | cut -d'"' -f2 | jq -R . | jq -s -c .`

  ansible-playbook "/opt/ads-agent/_work/r15264/a/esteira-jboss-vm-v2/hsi.yml" \
    -i localhost, \
    -e TOKEN_INFRAFACIL_MUDANCA="***" \
    -e sistema_ambiente="des" \
    -e sistema_nome="SICCV-batch" \
    -e site="ctc_nprd" \
    -e dir_terraform="`pwd`" \
    -e lista_hostnames="$lista_hostnames"
fi

terraform apply -no-color -auto-approve
2026-08-20T19:53:02.3573643Z Generating script.
2026-08-20T19:53:02.3573953Z ##[debug]which 'bash'
2026-08-20T19:53:02.3576135Z ##[debug]found: '/bin/bash'
2026-08-20T19:53:02.3576474Z ##[debug]Agent.Version=3.225.2
2026-08-20T19:53:02.3576838Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-08-20T19:53:02.3579396Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-08-20T19:53:02.3579713Z ========================== Starting Command Output ===========================
2026-08-20T19:53:02.3580038Z ##[debug]which '/bin/bash'
2026-08-20T19:53:02.3582130Z ##[debug]found: '/bin/bash'
2026-08-20T19:53:02.3582487Z ##[debug]/bin/bash arg: /opt/ads-agent/_work/_temp/bc3bafa5-69a8-4977-83a2-95096dee1eae.sh
2026-08-20T19:53:02.3582863Z ##[debug]exec tool: /bin/bash
2026-08-20T19:53:02.3584947Z ##[debug]arguments:
2026-08-20T19:53:02.3585294Z ##[debug]   /opt/ads-agent/_work/_temp/bc3bafa5-69a8-4977-83a2-95096dee1eae.sh
2026-08-20T19:53:02.3585804Z [command]/bin/bash /opt/ads-agent/_work/_temp/bc3bafa5-69a8-4977-83a2-95096dee1eae.sh
2026-08-20T19:53:33.9716673Z data.vsphere_tag_category.addr: Reading...
2026-08-20T19:53:33.9718451Z data.vsphere_folder.folder: Reading...
2026-08-20T19:53:33.9720287Z data.vsphere_datacenter.dc: Reading...
2026-08-20T19:53:33.9770756Z data.vsphere_folder.folder: Read complete after 0s [id=group-v22]
2026-08-20T19:53:34.3689510Z data.vsphere_datacenter.dc: Read complete after 0s [id=datacenter-21]
2026-08-20T19:53:34.3765844Z data.vsphere_tag_category.addr: Read complete after 0s [id=urn:vmomi:InventoryServiceCategory:40fbf91f-3227-40d6-9785-a481d122536e:GLOBAL]
2026-08-20T19:53:34.3784786Z data.external.consulta_tag: Reading...
2026-08-20T19:53:34.5978239Z data.vsphere_compute_cluster.cluster: Reading...
2026-08-20T19:53:34.6023483Z data.vsphere_resource_pool.pool: Reading...
2026-08-20T19:53:34.6044279Z data.vsphere_network.network_bck: Reading...
2026-08-20T19:53:34.6047230Z data.vsphere_virtual_machine.template: Reading...
2026-08-20T19:53:34.6102370Z data.vsphere_datastore.datastore: Reading...
2026-08-20T19:53:34.6103004Z data.vsphere_network.network: Reading...
2026-08-20T19:53:34.6291391Z data.vsphere_resource_pool.pool: Read complete after 0s [id=resgroup-1062077]
2026-08-20T19:53:34.6295506Z data.vsphere_network.network_bck: Read complete after 0s [id=dvportgroup-72342]
2026-08-20T19:53:34.6308176Z data.vsphere_network.network: Read complete after 0s [id=dvportgroup-68733]
2026-08-20T19:53:34.6375157Z data.vsphere_compute_cluster.cluster: Read complete after 0s [id=domain-c710514]
2026-08-20T19:53:34.6527496Z data.vsphere_datastore.datastore: Read complete after 0s [id=datastore-770300]
2026-08-20T19:53:36.0672637Z data.vsphere_virtual_machine.template: Read complete after 1s [id=421d69ff-84c5-7f69-2c8d-41d2ceb6fcbc]
2026-08-20T19:53:39.5930164Z data.external.consulta_tag: Read complete after 6s [id=-]
2026-08-20T19:53:39.6019305Z vsphere_virtual_machine.vm["caddeapllx2560.agil.nprd.caixa.gov.br"]: Refreshing state... [id=4202019d-92a6-d0be-696d-3017a92f12e2]
2026-08-20T19:53:39.7451800Z 
2026-08-20T19:53:39.7452325Z No changes. Your infrastructure matches the configuration.
2026-08-20T19:53:39.7452394Z 
2026-08-20T19:53:39.7452790Z Terraform has compared your real infrastructure against your configuration
2026-08-20T19:53:39.7453422Z and found no differences, so no changes are needed.
2026-08-20T19:53:42.5386370Z data.vsphere_folder.folder: Reading...
2026-08-20T19:53:42.5396069Z data.vsphere_datacenter.dc: Reading...
2026-08-20T19:53:42.5397697Z data.vsphere_tag_category.addr: Reading...
2026-08-20T19:53:42.5454643Z data.vsphere_folder.folder: Read complete after 0s [id=group-v22]
2026-08-20T19:53:42.9080887Z data.vsphere_datacenter.dc: Read complete after 0s [id=datacenter-21]
2026-08-20T19:53:42.9683913Z data.vsphere_tag_category.addr: Read complete after 0s [id=urn:vmomi:InventoryServiceCategory:40fbf91f-3227-40d6-9785-a481d122536e:GLOBAL]
2026-08-20T19:53:42.9690466Z data.external.consulta_tag: Reading...
2026-08-20T19:53:43.1350682Z data.vsphere_resource_pool.pool: Reading...
2026-08-20T19:53:43.1407940Z data.vsphere_datastore.datastore: Reading...
2026-08-20T19:53:43.1472699Z data.vsphere_network.network_bck: Reading...
2026-08-20T19:53:43.1473332Z data.vsphere_network.network: Reading...
2026-08-20T19:53:43.1473706Z data.vsphere_compute_cluster.cluster: Reading...
2026-08-20T19:53:43.1476812Z data.vsphere_virtual_machine.template: Reading...
2026-08-20T19:53:43.1585901Z data.vsphere_resource_pool.pool: Read complete after 0s [id=resgroup-1062077]
2026-08-20T19:53:43.1689554Z data.vsphere_network.network: Read complete after 0s [id=dvportgroup-68733]
2026-08-20T19:53:43.1781596Z data.vsphere_network.network_bck: Read complete after 0s [id=dvportgroup-72342]
2026-08-20T19:53:43.1818605Z data.vsphere_compute_cluster.cluster: Read complete after 0s [id=domain-c710514]
2026-08-20T19:53:43.2067479Z data.vsphere_datastore.datastore: Read complete after 0s [id=datastore-770300]
2026-08-20T19:53:44.5576131Z data.vsphere_virtual_machine.template: Read complete after 2s [id=421d69ff-84c5-7f69-2c8d-41d2ceb6fcbc]
2026-08-20T19:53:48.1054173Z data.external.consulta_tag: Read complete after 5s [id=-]
2026-08-20T19:53:48.1146143Z vsphere_virtual_machine.vm["caddeapllx2560.agil.nprd.caixa.gov.br"]: Refreshing state... [id=4202019d-92a6-d0be-696d-3017a92f12e2]
2026-08-20T19:53:48.2567813Z 
2026-08-20T19:53:48.2568402Z No changes. Your infrastructure matches the configuration.
2026-08-20T19:53:48.2568518Z 
2026-08-20T19:53:48.2568676Z Terraform has compared your real infrastructure against your configuration
2026-08-20T19:53:48.2568926Z and found no differences, so no changes are needed.
2026-08-20T19:53:48.6456644Z 
2026-08-20T19:53:48.6457697Z Apply complete! Resources: 0 added, 0 changed, 0 destroyed.
2026-08-20T19:53:48.6499734Z ##[debug]Exit code 0 received from tool '/bin/bash'
2026-08-20T19:53:48.6502559Z ##[debug]STDIO streams have closed for tool '/bin/bash'
2026-08-20T19:53:48.6508358Z ##[debug]task result: Succeeded
2026-08-20T19:53:48.6519283Z ##[debug]Processed: ##vso[task.complete result=Succeeded;done=true;]
2026-08-20T19:53:48.6540621Z ##[section]Finishing: Terraform apply




2026-08-20T19:54:20.0430639Z ##[debug]Evaluating condition for step: 'Configura Control-M'
2026-08-20T19:54:20.0431464Z ##[debug]Evaluating: succeeded()
2026-08-20T19:54:20.0431802Z ##[debug]Evaluating succeeded:
2026-08-20T19:54:20.0432300Z ##[debug]=> True
2026-08-20T19:54:20.0432645Z ##[debug]Result: True
2026-08-20T19:54:20.0432971Z ##[section]Starting: Configura Control-M
2026-08-20T19:54:20.0437751Z ==============================================================================
2026-08-20T19:54:20.0437930Z Task         : Bash
2026-08-20T19:54:20.0438021Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-20T19:54:20.0438183Z Version      : 3.227.0
2026-08-20T19:54:20.0438277Z Author       : Microsoft Corporation
2026-08-20T19:54:20.0438387Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-20T19:54:20.0438562Z ==============================================================================
2026-08-20T19:54:21.0117234Z ##[debug]Invoking Method: System.Threading.Tasks.Task <RunAsync>b__9(). Attempt count: 0
2026-08-20T19:54:21.0158317Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-08-20T19:54:21.0890003Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-08-20T19:54:21.0898374Z ##[debug]loading inputs and endpoints
2026-08-20T19:54:21.0901107Z ##[debug]loading INPUT_TARGETTYPE
2026-08-20T19:54:21.0909229Z ##[debug]loading INPUT_FILEPATH
2026-08-20T19:54:21.0910251Z ##[debug]loading INPUT_SCRIPT
2026-08-20T19:54:21.0911113Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-08-20T19:54:21.0911755Z ##[debug]loading INPUT_FAILONSTDERR
2026-08-20T19:54:21.0913238Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-08-20T19:54:21.0914081Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-08-20T19:54:21.0915404Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-08-20T19:54:21.0920286Z ##[debug]loading SECRET_TOKEN_CRQ
2026-08-20T19:54:21.0921918Z ##[debug]loading SECRET_AZPAT
2026-08-20T19:54:21.0923375Z ##[debug]loading SECRET_ARM_ACCESS_KEY
2026-08-20T19:54:21.0924872Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-08-20T19:54:21.0926574Z ##[debug]loading SECRET_PW_ISILON
2026-08-20T19:54:21.0927812Z ##[debug]loading SECRET_TOKEN_INFRAFACIL_MUDANCA
2026-08-20T19:54:21.0928504Z ##[debug]loading SECRET_ANSIBLE_VAULT
2026-08-20T19:54:21.0929103Z ##[debug]loading SECRET_PW_ALOCAIP
2026-08-20T19:54:21.0929657Z ##[debug]loading SECRET_FORTIFY_PASS
2026-08-20T19:54:21.0930229Z ##[debug]loading SECRET_OKD_TOKEN_PRODUTOS
2026-08-20T19:54:21.0930825Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-08-20T19:54:21.0931901Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-08-20T19:54:21.0932539Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-08-20T19:54:21.0933069Z ##[debug]loading SECRET_CV_SENHAORACLE
2026-08-20T19:54:21.0934219Z ##[debug]loading SECRET_SENHASERVICO
2026-08-20T19:54:21.0934736Z ##[debug]loading SECRET_TERRAFORM_ESX_PASSWORD
2026-08-20T19:54:21.0935265Z ##[debug]loaded 24
2026-08-20T19:54:21.0939314Z ##[debug]Agent.ProxyUrl=undefined
2026-08-20T19:54:21.0939771Z ##[debug]Agent.CAInfo=undefined
2026-08-20T19:54:21.0940281Z ##[debug]Agent.ClientCert=undefined
2026-08-20T19:54:21.0941163Z ##[debug]Agent.SkipCertValidation=True
2026-08-20T19:54:21.0955056Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-08-20T19:54:21.0967429Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-08-20T19:54:21.0968040Z ##[debug]system.culture=en-US
2026-08-20T19:54:21.0968308Z ##[debug]failOnStderr=false
2026-08-20T19:54:21.0968572Z ##[debug]workingDirectory=/opt/ads-agent/_work/r15264/a
2026-08-20T19:54:21.0968847Z ##[debug]check path : /opt/ads-agent/_work/r15264/a
2026-08-20T19:54:21.0969204Z ##[debug]targetType=inline
2026-08-20T19:54:21.0969475Z ##[debug]bashEnvValue=undefined
2026-08-20T19:54:21.0978135Z ##[debug]script=REPO=$(echo _SICCV-batch | sed 's/_//')
ansible-playbook /opt/ads-agent/_work/r15264/a/esteira-jboss-vm-v2/site.yml --tags controlm,nfs --skip-tags "vm,dns,monitoracao,apache,git_conf,jboss,restart_jboss,stop_jboss,tsm" -e sistema_ambiente=des -e sistema_nome=SICCV-batch -e site=ctc_nprd -e centralizadora_operacoes=7261 -e centralizadora_desenvolvimento=7266 -e default_working_directory_tfs=/opt/ads-agent/_work/r15264/a -e build_repository_name_tfs=$REPO -e CTMSHOST=crjdeaprlx038 -e CTMPERMHOSTS=crjdeaprlx038,crjdeaprlx039 -e ATCMNDATA=7005 -e AGCMNDATA=7006
2026-08-20T19:54:21.0978791Z Generating script.
2026-08-20T19:54:21.0979375Z ##[debug]which 'bash'
2026-08-20T19:54:21.0985200Z ##[debug]found: '/bin/bash'
2026-08-20T19:54:21.0985580Z ##[debug]Agent.Version=3.225.2
2026-08-20T19:54:21.0986382Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-08-20T19:54:21.0986974Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-08-20T19:54:21.1000306Z ========================== Starting Command Output ===========================
2026-08-20T19:54:21.1007725Z ##[debug]which '/bin/bash'
2026-08-20T19:54:21.1007998Z ##[debug]found: '/bin/bash'
2026-08-20T19:54:21.1008285Z ##[debug]/bin/bash arg: /opt/ads-agent/_work/_temp/5c4dd3e8-48de-4a21-8b83-53e22eb759e7.sh
2026-08-20T19:54:21.1008756Z ##[debug]exec tool: /bin/bash
2026-08-20T19:54:21.1009040Z ##[debug]arguments:
2026-08-20T19:54:21.1009416Z ##[debug]   /opt/ads-agent/_work/_temp/5c4dd3e8-48de-4a21-8b83-53e22eb759e7.sh
2026-08-20T19:54:21.1009934Z [command]/bin/bash /opt/ads-agent/_work/_temp/5c4dd3e8-48de-4a21-8b83-53e22eb759e7.sh
2026-08-20T19:54:23.2837216Z 
2026-08-20T19:54:23.2838224Z PLAY [local] *******************************************************************
2026-08-20T19:54:23.3127189Z 
2026-08-20T19:54:23.3127894Z PLAY [Configurando o DNS] ******************************************************
2026-08-20T19:54:23.5080861Z 
2026-08-20T19:54:23.5081360Z PLAY [local] *******************************************************************
2026-08-20T19:54:23.5116018Z 
2026-08-20T19:54:23.5117089Z PLAY [Verificando serviços] ****************************************************
2026-08-20T19:54:23.5198928Z 
2026-08-20T19:54:23.5199695Z PLAY [Configuração LDAP] *******************************************************
2026-08-20T19:54:23.5230225Z [WARNING]: Found variable using reserved name: when
2026-08-20T19:54:23.5238339Z 
2026-08-20T19:54:23.5238813Z PLAY [jboss] *******************************************************************
2026-08-20T19:54:23.5321559Z 
2026-08-20T19:54:23.5322176Z PLAY [Stack Jboss] *************************************************************
2026-08-20T19:54:23.5345709Z 
2026-08-20T19:54:23.5346147Z PLAY [jboss] *******************************************************************
2026-08-20T19:54:23.5387581Z 
2026-08-20T19:54:23.5387817Z PLAY [jboss] *******************************************************************
2026-08-20T19:54:23.5669539Z Thursday 20 August 2026  16:54:23 -0300 (0:00:00.344)       0:00:00.344 ******* 
2026-08-20T19:54:24.1205418Z 
2026-08-20T19:54:24.1206248Z TASK [Verifica se o arquivo nfs_config.json existe] ****************************
2026-08-20T19:54:24.1206664Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br]
2026-08-20T19:54:24.1254166Z Thursday 20 August 2026  16:54:24 -0300 (0:00:00.558)       0:00:00.902 ******* 
2026-08-20T19:54:24.1737927Z included: /opt/ads-agent/_work/r15264/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for caddeapllx2560.agil.nprd.caixa.gov.br
2026-08-20T19:54:24.1780486Z Thursday 20 August 2026  16:54:24 -0300 (0:00:00.053)       0:00:00.956 ******* 
2026-08-20T19:54:24.2389458Z 
2026-08-20T19:54:24.2390091Z TASK [nfs : Criar variáveis] ***************************************************
2026-08-20T19:54:24.2390270Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br]
2026-08-20T19:54:24.2435151Z Thursday 20 August 2026  16:54:24 -0300 (0:00:00.065)       0:00:01.021 ******* 
2026-08-20T19:54:24.7229828Z 
2026-08-20T19:54:24.7230871Z TASK [nfs : Coletar variáveis de ambiente] *************************************
2026-08-20T19:54:24.7231305Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br]
2026-08-20T19:54:24.7265641Z Thursday 20 August 2026  16:54:24 -0300 (0:00:00.482)       0:00:01.504 ******* 
2026-08-20T19:54:24.7834225Z 
2026-08-20T19:54:24.7834748Z TASK [nfs : Exibir resultado em JSON] ******************************************
2026-08-20T19:54:24.7836198Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br] => {
2026-08-20T19:54:24.7836500Z     "nfs_vars_json": {
2026-08-20T19:54:24.7836629Z         "changed": false, 
2026-08-20T19:54:24.7837167Z         "cmd": "cat /opt/ads-agent/_work/r15264/a/nfs_config.json", 
2026-08-20T19:54:24.7837657Z         "delta": "0:00:00.006536", 
2026-08-20T19:54:24.7837863Z         "end": "2026-08-20 16:54:24.702325", 
2026-08-20T19:54:24.7838008Z         "failed": false, 
2026-08-20T19:54:24.7838104Z         "rc": 0, 
2026-08-20T19:54:24.7838284Z         "start": "2026-08-20 16:54:24.695789", 
2026-08-20T19:54:24.7838414Z         "stderr": "", 
2026-08-20T19:54:24.7838529Z         "stderr_lines": [], 
2026-08-20T19:54:24.7838704Z         "stdout": "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV\",\"NFS_MOUNT_POINT_ISILON\": \"/SICCV\"}]", 
2026-08-20T19:54:24.7839185Z         "stdout_lines": [
2026-08-20T19:54:24.7839355Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV\",\"NFS_MOUNT_POINT_ISILON\": \"/SICCV\"}]"
2026-08-20T19:54:24.7839511Z         ]
2026-08-20T19:54:24.7839608Z     }
2026-08-20T19:54:24.7839707Z }
2026-08-20T19:54:24.7868959Z Thursday 20 August 2026  16:54:24 -0300 (0:00:00.060)       0:00:01.565 ******* 
2026-08-20T19:54:24.8480288Z 
2026-08-20T19:54:24.8481271Z TASK [nfs : Criar variáveis] ***************************************************
2026-08-20T19:54:24.8481556Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br]
2026-08-20T19:54:24.8528479Z Thursday 20 August 2026  16:54:24 -0300 (0:00:00.065)       0:00:01.630 ******* 
2026-08-20T19:54:27.0950175Z 
2026-08-20T19:54:27.0950918Z TASK [nfs : execute montagem script] *******************************************
2026-08-20T19:54:27.0951282Z changed: [caddeapllx2560.agil.nprd.caixa.gov.br]
2026-08-20T19:54:27.0977303Z Thursday 20 August 2026  16:54:27 -0300 (0:00:02.244)       0:00:03.875 ******* 
2026-08-20T19:54:27.1591161Z 
2026-08-20T19:54:27.1592243Z TASK [nfs : ansible.builtin.debug] *********************************************
2026-08-20T19:54:27.1595227Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br] => {
2026-08-20T19:54:27.1595485Z     "changed": false, 
2026-08-20T19:54:27.1595691Z     "msg": {
2026-08-20T19:54:27.1595811Z         "changed": true, 
2026-08-20T19:54:27.1595925Z         "cmd": [
2026-08-20T19:54:27.1596034Z             "python", 
2026-08-20T19:54:27.1596390Z             "/opt/ads-agent/_work/r15264/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py", 
2026-08-20T19:54:27.1596593Z             "montagem", 
2026-08-20T19:54:27.1596743Z             "SICCV-batch", 
2026-08-20T19:54:27.1596860Z             "des", 
2026-08-20T19:54:27.1597131Z             "ctc_nprd", 
2026-08-20T19:54:27.1597330Z             "/opt/ads-agent/_work/r15264/a/esteira-jboss-vm-v2", 
2026-08-20T19:54:27.1597475Z             "C&t@d02", 
2026-08-20T19:54:27.1597704Z             "***", 
2026-08-20T19:54:27.1597855Z             "s736651@corp.caixa.gov.br", 
2026-08-20T19:54:27.1598009Z             "***", 
2026-08-20T19:54:27.1598174Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV\",\"NFS_MOUNT_POINT_ISILON\": \"/SICCV\"}]"
2026-08-20T19:54:27.1598334Z         ], 
2026-08-20T19:54:27.1598506Z         "delta": "0:00:01.868206", 
2026-08-20T19:54:27.1598764Z         "end": "2026-08-20 16:54:27.068523", 
2026-08-20T19:54:27.1598960Z         "failed": false, 
2026-08-20T19:54:27.1599128Z         "rc": 0, 
2026-08-20T19:54:27.1599380Z         "start": "2026-08-20 16:54:25.200317", 
2026-08-20T19:54:27.1599549Z         "stderr": "", 
2026-08-20T19:54:27.1599734Z         "stderr_lines": [], 
2026-08-20T19:54:27.1600804Z         "stdout": "[{u'NFS_MOUNT_POINT_ISILON': u'/SICCV', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV'}]\nNome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           \n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV /SICCV                              ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfs_path=/SICCV\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV /SICCV                              ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-08-20T19:54:27.1601733Z         "stdout_lines": [
2026-08-20T19:54:27.1602132Z             "[{u'NFS_MOUNT_POINT_ISILON': u'/SICCV', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV'}]", 
2026-08-20T19:54:27.1602349Z             "Nome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           ", 
2026-08-20T19:54:27.1602720Z             "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------", 
2026-08-20T19:54:27.1602964Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV /SICCV                              ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-08-20T19:54:27.1603124Z             "nfs_path=/SICCV", 
2026-08-20T19:54:27.1603265Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV", 
2026-08-20T19:54:27.1603455Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV /SICCV                              ISILON                              nfsctcnprd.ctc.caixa                des                                "
2026-08-20T19:54:27.1603605Z         ]
2026-08-20T19:54:27.1603701Z     }
2026-08-20T19:54:27.1603795Z }
2026-08-20T19:54:27.1627388Z Thursday 20 August 2026  16:54:27 -0300 (0:00:00.065)       0:00:03.940 ******* 
2026-08-20T19:54:27.5329249Z 
2026-08-20T19:54:27.5330061Z TASK [nfs : execute clean json] ************************************************
2026-08-20T19:54:27.5330424Z changed: [caddeapllx2560.agil.nprd.caixa.gov.br]
2026-08-20T19:54:27.5330830Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-08-20T19:54:27.5331856Z caddeapllx2560.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-08-20T19:54:27.5332106Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-08-20T19:54:27.5332282Z releases. A future Ansible release will default to using the discovered 
2026-08-20T19:54:27.5332443Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-08-20T19:54:27.5332617Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-08-20T19:54:27.5332783Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-08-20T19:54:27.5332939Z setting deprecation_warnings=False in ansible.cfg.
2026-08-20T19:54:27.5360784Z Thursday 20 August 2026  16:54:27 -0300 (0:00:00.373)       0:00:04.314 ******* 
2026-08-20T19:54:27.5972147Z 
2026-08-20T19:54:27.5973110Z TASK [nfs : result_new_string_json] ********************************************
2026-08-20T19:54:27.5975982Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br] => {
2026-08-20T19:54:27.5976566Z     "msg": {
2026-08-20T19:54:27.5976747Z         "ansible_facts": {
2026-08-20T19:54:27.5977059Z             "discovered_interpreter_python": "/usr/bin/python"
2026-08-20T19:54:27.5977245Z         }, 
2026-08-20T19:54:27.5977396Z         "changed": true, 
2026-08-20T19:54:27.5978267Z         "cmd": "echo '[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV\",\"NFS_MOUNT_POINT_ISILON\": \"/SICCV\"}]' | sed 's/NFS_ENDPOINT_ISILON[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_ISILON[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_HUAWEI[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_HUAWEI[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_VM[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_VM[^\"]*/NFS_MOUNT_POINT/g'", 
2026-08-20T19:54:27.5978725Z         "delta": "0:00:00.004166", 
2026-08-20T19:54:27.5978889Z         "deprecations": [
2026-08-20T19:54:27.5979042Z             {
2026-08-20T19:54:27.5979604Z                 "msg": "Distribution rhel 9.3 on host caddeapllx2560.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, but is using /usr/bin/python for backward compatibility with prior Ansible releases. A future Ansible release will default to using the discovered platform python for this host. See https://docs.ansible.com/ansible/2.9/reference_appendices/interpreter_discovery.html for more information", 
2026-08-20T19:54:27.5980001Z                 "version": "2.12"
2026-08-20T19:54:27.5980105Z             }
2026-08-20T19:54:27.5980202Z         ], 
2026-08-20T19:54:27.5980378Z         "end": "2026-08-20 16:54:27.515103", 
2026-08-20T19:54:27.5980505Z         "failed": false, 
2026-08-20T19:54:27.5980615Z         "rc": 0, 
2026-08-20T19:54:27.5980777Z         "start": "2026-08-20 16:54:27.510937", 
2026-08-20T19:54:27.5980904Z         "stderr": "", 
2026-08-20T19:54:27.5981013Z         "stderr_lines": [], 
2026-08-20T19:54:27.5981184Z         "stdout": "[{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV\",\"NFS_MOUNT_POINT\": \"/SICCV\"}]", 
2026-08-20T19:54:27.5981348Z         "stdout_lines": [
2026-08-20T19:54:27.5981505Z             "[{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV\",\"NFS_MOUNT_POINT\": \"/SICCV\"}]"
2026-08-20T19:54:27.5981651Z         ]
2026-08-20T19:54:27.5981748Z     }
2026-08-20T19:54:27.5981846Z }
2026-08-20T19:54:27.6009166Z Thursday 20 August 2026  16:54:27 -0300 (0:00:00.064)       0:00:04.379 ******* 
2026-08-20T19:54:27.6615388Z 
2026-08-20T19:54:27.6615969Z TASK [nfs : Parse JSON data] ***************************************************
2026-08-20T19:54:27.6616153Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br]
2026-08-20T19:54:27.6652318Z Thursday 20 August 2026  16:54:27 -0300 (0:00:00.064)       0:00:04.443 ******* 
2026-08-20T19:54:27.7271203Z 
2026-08-20T19:54:27.7272277Z TASK [nfs : result_new_json] ***************************************************
2026-08-20T19:54:27.7273821Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br] => {
2026-08-20T19:54:27.7274579Z     "msg": [
2026-08-20T19:54:27.7274806Z         {
2026-08-20T19:54:27.7275019Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV", 
2026-08-20T19:54:27.7275196Z             "NFS_MOUNT_POINT": "/SICCV"
2026-08-20T19:54:27.7275306Z         }
2026-08-20T19:54:27.7275407Z     ]
2026-08-20T19:54:27.7275502Z }
2026-08-20T19:54:27.7305687Z Thursday 20 August 2026  16:54:27 -0300 (0:00:00.065)       0:00:04.508 ******* 
2026-08-20T19:54:27.7941341Z included: /opt/ads-agent/_work/r15264/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx2560.agil.nprd.caixa.gov.br
2026-08-20T19:54:27.8001833Z Thursday 20 August 2026  16:54:27 -0300 (0:00:00.069)       0:00:04.578 ******* 
2026-08-20T19:54:27.8582747Z 
2026-08-20T19:54:27.8583550Z TASK [nfs : Parse JSON data] ***************************************************
2026-08-20T19:54:27.8584091Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br]
2026-08-20T19:54:27.8614027Z Thursday 20 August 2026  16:54:27 -0300 (0:00:00.061)       0:00:04.639 ******* 
2026-08-20T19:54:27.9174117Z 
2026-08-20T19:54:27.9174897Z TASK [nfs : debug] *************************************************************
2026-08-20T19:54:27.9178145Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br] => {
2026-08-20T19:54:27.9178432Z     "msg": {
2026-08-20T19:54:27.9180436Z         "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV", 
2026-08-20T19:54:27.9184920Z         "NFS_MOUNT_POINT": "/SICCV"
2026-08-20T19:54:27.9185081Z     }
2026-08-20T19:54:27.9185176Z }
2026-08-20T19:54:27.9220588Z Thursday 20 August 2026  16:54:27 -0300 (0:00:00.060)       0:00:04.700 ******* 
2026-08-20T19:54:27.9790964Z 
2026-08-20T19:54:27.9791947Z TASK [nfs : debug] *************************************************************
2026-08-20T19:54:27.9793125Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br] => {
2026-08-20T19:54:27.9793340Z     "msg": "/SICCV"
2026-08-20T19:54:27.9793444Z }
2026-08-20T19:54:27.9824979Z Thursday 20 August 2026  16:54:27 -0300 (0:00:00.060)       0:00:04.760 ******* 
2026-08-20T19:54:28.0402008Z 
2026-08-20T19:54:28.0405069Z TASK [nfs : debug] *************************************************************
2026-08-20T19:54:28.0406059Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br] => {
2026-08-20T19:54:28.0406711Z     "msg": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV"
2026-08-20T19:54:28.0406980Z }
2026-08-20T19:54:28.0437975Z Thursday 20 August 2026  16:54:28 -0300 (0:00:00.061)       0:00:04.821 ******* 
2026-08-20T19:54:28.1025243Z 
2026-08-20T19:54:28.1026238Z TASK [nfs : Verificando as variaveis] ******************************************
2026-08-20T19:54:28.1029292Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br] => {
2026-08-20T19:54:28.1029680Z     "changed": false, 
2026-08-20T19:54:28.1030290Z     "msg": "All assertions passed"
2026-08-20T19:54:28.1030446Z }
2026-08-20T19:54:28.1067290Z Thursday 20 August 2026  16:54:28 -0300 (0:00:00.062)       0:00:04.884 ******* 
2026-08-20T19:54:31.3680484Z 
2026-08-20T19:54:31.3681315Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-08-20T19:54:31.3681742Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br]
2026-08-20T19:54:31.3714076Z Thursday 20 August 2026  16:54:31 -0300 (0:00:03.264)       0:00:08.149 ******* 
2026-08-20T19:54:32.3007571Z 
2026-08-20T19:54:32.3008339Z TASK [nfs : Install networker lgtoclnt_url] ************************************
2026-08-20T19:54:32.3009034Z [WARNING]: Consider using the yum, dnf or zypper module rather than running
2026-08-20T19:54:32.3009494Z 'rpm'.  If you need to use command because yum, dnf or zypper is insufficient
2026-08-20T19:54:32.3009739Z you can add 'warn: false' to this command task or set 'command_warnings=False'
2026-08-20T19:54:32.3009897Z in ansible.cfg to get rid of this message.
2026-08-20T19:54:32.3011096Z fatal: [caddeapllx2560.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.668553", "end": "2026-08-20 16:54:32.284639", "msg": "non-zero return code", "rc": 1, "start": "2026-08-20 16:54:31.616086", "stderr": "aviso: /var/tmp/rpm-tmp.VOv992: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.VOv992: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-08-20T19:54:32.3011712Z ...ignoring
2026-08-20T19:54:32.3043320Z Thursday 20 August 2026  16:54:32 -0300 (0:00:00.933)       0:00:09.082 ******* 
2026-08-20T19:54:33.1661417Z 
2026-08-20T19:54:33.1663041Z TASK [nfs : Install networker lgtonmda_url] ************************************
2026-08-20T19:54:33.1666773Z fatal: [caddeapllx2560.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.583216", "end": "2026-08-20 16:54:33.149065", "msg": "non-zero return code", "rc": 1, "start": "2026-08-20 16:54:32.565849", "stderr": "aviso: /var/tmp/rpm-tmp.zRBBho: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.zRBBho: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-08-20T19:54:33.1668512Z ...ignoring
2026-08-20T19:54:33.1701819Z Thursday 20 August 2026  16:54:33 -0300 (0:00:00.865)       0:00:09.948 ******* 
2026-08-20T19:54:33.5997707Z 
2026-08-20T19:54:33.5998518Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-08-20T19:54:33.5998701Z changed: [caddeapllx2560.agil.nprd.caixa.gov.br]
2026-08-20T19:54:33.6001560Z Thursday 20 August 2026  16:54:33 -0300 (0:00:00.429)       0:00:10.378 ******* 
2026-08-20T19:54:33.8619461Z 
2026-08-20T19:54:33.8620025Z TASK [nfs : Create a symbolic link] ********************************************
2026-08-20T19:54:33.8620220Z changed: [caddeapllx2560.agil.nprd.caixa.gov.br]
2026-08-20T19:54:33.8647175Z Thursday 20 August 2026  16:54:33 -0300 (0:00:00.264)       0:00:10.642 ******* 
2026-08-20T19:54:34.8023727Z 
2026-08-20T19:54:34.8024687Z TASK [nfs : Networker | Start networker] ***************************************
2026-08-20T19:54:34.8024900Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br]
2026-08-20T19:54:34.8071214Z Thursday 20 August 2026  16:54:34 -0300 (0:00:00.942)       0:00:11.585 ******* 
2026-08-20T19:54:35.0761311Z 
2026-08-20T19:54:35.0762074Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-08-20T19:54:35.0763130Z changed: [caddeapllx2560.agil.nprd.caixa.gov.br]
2026-08-20T19:54:35.0797947Z Thursday 20 August 2026  16:54:35 -0300 (0:00:00.272)       0:00:11.857 ******* 
2026-08-20T19:54:45.5277106Z 
2026-08-20T19:54:45.5278145Z TASK [nfs : Networker | Restart networker] *************************************
2026-08-20T19:54:45.5278384Z changed: [caddeapllx2560.agil.nprd.caixa.gov.br]
2026-08-20T19:54:45.5311435Z Thursday 20 August 2026  16:54:45 -0300 (0:00:10.451)       0:00:22.309 ******* 
2026-08-20T19:54:45.9820154Z 
2026-08-20T19:54:45.9820962Z TASK [nfs : Montando volume remoto] ********************************************
2026-08-20T19:54:45.9821275Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br]
2026-08-20T19:54:45.9854043Z Thursday 20 August 2026  16:54:45 -0300 (0:00:00.454)       0:00:22.763 ******* 
2026-08-20T19:54:46.0293745Z 
2026-08-20T19:54:46.0294244Z PLAY [jboss] *******************************************************************
2026-08-20T19:54:46.0325539Z 
2026-08-20T19:54:46.0326228Z PLAY [Copiando deployments adicionais] *****************************************
2026-08-20T19:54:46.0351675Z 
2026-08-20T19:54:46.0352266Z PLAY [Copiando modules adicionais] *********************************************
2026-08-20T19:54:46.0380148Z 
2026-08-20T19:54:46.0380667Z PLAY [jboss] *******************************************************************
2026-08-20T19:54:46.0416025Z 
2026-08-20T19:54:46.0416648Z PLAY [jboss] *******************************************************************
2026-08-20T19:54:46.0447773Z 
2026-08-20T19:54:46.0448289Z PLAY [jboss] *******************************************************************
2026-08-20T19:54:46.0479367Z 
2026-08-20T19:54:46.0479888Z PLAY [jboss] *******************************************************************
2026-08-20T19:54:46.0506780Z 
2026-08-20T19:54:46.0507500Z PLAY [jboss] *******************************************************************
2026-08-20T19:54:46.0536217Z 
2026-08-20T19:54:46.0536829Z PLAY [local] *******************************************************************
2026-08-20T19:54:46.0561826Z [WARNING]: Could not match supplied host pattern, ignoring: instance_restart
2026-08-20T19:54:46.0564749Z 
2026-08-20T19:54:46.0565074Z PLAY [instance_restart] ********************************************************
2026-08-20T19:54:46.0565267Z skipping: no hosts matched
2026-08-20T19:54:46.0567835Z [WARNING]: Could not match supplied host pattern, ignoring: machine_reboot
2026-08-20T19:54:46.0570697Z 
2026-08-20T19:54:46.0571120Z PLAY [machine_reboot] **********************************************************
2026-08-20T19:54:46.0571388Z skipping: no hosts matched
2026-08-20T19:54:46.0577590Z 
2026-08-20T19:54:46.0578005Z PLAY [local] *******************************************************************
2026-08-20T19:54:46.0603905Z [WARNING]: Could not match supplied host pattern, ignoring: instance_stop
2026-08-20T19:54:46.0606570Z 
2026-08-20T19:54:46.0606942Z PLAY [instance_stop] ***********************************************************
2026-08-20T19:54:46.0607120Z skipping: no hosts matched
2026-08-20T19:54:46.0610186Z 
2026-08-20T19:54:46.0610622Z PLAY [machine_reboot] **********************************************************
2026-08-20T19:54:46.0610857Z skipping: no hosts matched
2026-08-20T19:54:46.0616518Z 
2026-08-20T19:54:46.0617018Z PLAY [local] *******************************************************************
2026-08-20T19:54:46.0642471Z [WARNING]: Could not match supplied host pattern, ignoring: escopo_execucao
2026-08-20T19:54:46.0644362Z 
2026-08-20T19:54:46.0644737Z PLAY [Executar o Start do Sirot Connector no escopo definido] ******************
2026-08-20T19:54:46.0645004Z skipping: no hosts matched
2026-08-20T19:54:46.0651085Z 
2026-08-20T19:54:46.0651334Z PLAY [local] *******************************************************************
2026-08-20T19:54:46.0674442Z 
2026-08-20T19:54:46.0674636Z PLAY [Executar o Stop do Sirot Connector] **************************************
2026-08-20T19:54:46.0674982Z skipping: no hosts matched
2026-08-20T19:54:46.0684356Z 
2026-08-20T19:54:46.0684557Z PLAY [Configura TSM] ***********************************************************
2026-08-20T19:54:46.0711341Z 
2026-08-20T19:54:46.0711568Z PLAY [jboss] *******************************************************************
2026-08-20T19:54:46.0751957Z Thursday 20 August 2026  16:54:46 -0300 (0:00:00.089)       0:00:22.853 ******* 
2026-08-20T19:54:46.1399430Z 
2026-08-20T19:54:46.1400256Z TASK [Cria variável build_repository_name] *************************************
2026-08-20T19:54:46.1400439Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br]
2026-08-20T19:54:46.1431128Z Thursday 20 August 2026  16:54:46 -0300 (0:00:00.067)       0:00:22.921 ******* 
2026-08-20T19:54:46.2026582Z 
2026-08-20T19:54:46.2027459Z TASK [Buscando diretorio de config] ********************************************
2026-08-20T19:54:46.2028169Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br]
2026-08-20T19:54:46.2136151Z Thursday 20 August 2026  16:54:46 -0300 (0:00:00.070)       0:00:22.991 ******* 
2026-08-20T19:54:46.5804722Z 
2026-08-20T19:54:46.5805765Z TASK [Verifica se o arquivo {{ item }}/etc/hosts-{{ sistema_ambiente }} existe] ***
2026-08-20T19:54:46.5807275Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r15264/a/_SICCV-batch-config)
2026-08-20T19:54:46.8761805Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r15264/a/_SICCV-batch-config/so)
2026-08-20T19:54:46.8790601Z Thursday 20 August 2026  16:54:46 -0300 (0:00:00.665)       0:00:23.657 ******* 
2026-08-20T19:54:46.9320552Z 
2026-08-20T19:54:46.9321503Z PLAY [Configura Control-M] *****************************************************
2026-08-20T19:54:46.9373903Z Thursday 20 August 2026  16:54:46 -0300 (0:00:00.058)       0:00:23.715 ******* 
2026-08-20T19:54:47.5853026Z 
2026-08-20T19:54:47.5855275Z TASK [Gathering Facts] *********************************************************
2026-08-20T19:54:47.5855650Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br]
2026-08-20T19:54:47.6054625Z Thursday 20 August 2026  16:54:47 -0300 (0:00:00.667)       0:00:24.383 ******* 
2026-08-20T19:54:47.8668589Z 
2026-08-20T19:54:47.8669548Z TASK [stat] ********************************************************************
2026-08-20T19:54:47.8669813Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br]
2026-08-20T19:54:47.8823728Z Thursday 20 August 2026  16:54:47 -0300 (0:00:00.276)       0:00:24.660 ******* 
2026-08-20T19:54:47.9429510Z 
2026-08-20T19:54:47.9430745Z TASK [assert] ******************************************************************
2026-08-20T19:54:47.9431006Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br] => {
2026-08-20T19:54:47.9431144Z     "changed": false, 
2026-08-20T19:54:47.9431280Z     "msg": "All assertions passed"
2026-08-20T19:54:47.9431397Z }
2026-08-20T19:54:47.9581267Z Thursday 20 August 2026  16:54:47 -0300 (0:00:00.075)       0:00:24.736 ******* 
2026-08-20T19:54:48.0324638Z 
2026-08-20T19:54:48.0326061Z TASK [control_m : Cria variável ansible] ***************************************
2026-08-20T19:54:48.0326294Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br]
2026-08-20T19:54:48.0479036Z Thursday 20 August 2026  16:54:48 -0300 (0:00:00.089)       0:00:24.825 ******* 
2026-08-20T19:54:48.8849968Z 
2026-08-20T19:54:48.8850807Z TASK [control_m : Copiando arquivo de certificado] *****************************
2026-08-20T19:54:48.8851084Z changed: [caddeapllx2560.agil.nprd.caixa.gov.br]
2026-08-20T19:54:48.8996366Z Thursday 20 August 2026  16:54:48 -0300 (0:00:00.851)       0:00:25.677 ******* 
2026-08-20T19:54:49.1764786Z 
2026-08-20T19:54:49.1766231Z TASK [control_m : Executando add-user.sh] **************************************
2026-08-20T19:54:49.1766452Z changed: [caddeapllx2560.agil.nprd.caixa.gov.br]
2026-08-20T19:54:49.1912674Z Thursday 20 August 2026  16:54:49 -0300 (0:00:00.291)       0:00:25.969 ******* 
2026-08-20T19:54:49.6299810Z 
2026-08-20T19:54:49.6300833Z TASK [control_m : Removendo add-user.sh] ***************************************
2026-08-20T19:54:49.6301520Z changed: [caddeapllx2560.agil.nprd.caixa.gov.br]
2026-08-20T19:54:49.6451850Z Thursday 20 August 2026  16:54:49 -0300 (0:00:00.453)       0:00:26.423 ******* 
2026-08-20T19:54:49.9229651Z 
2026-08-20T19:54:49.9230446Z TASK [control_m : Criacao diretorio /producao/carga] ***************************
2026-08-20T19:54:49.9230908Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br]
2026-08-20T19:54:49.9372808Z Thursday 20 August 2026  16:54:49 -0300 (0:00:00.292)       0:00:26.715 ******* 
2026-08-20T19:54:50.2100516Z 
2026-08-20T19:54:50.2101308Z TASK [control_m : Criacao diretorio /producao/suporte] *************************
2026-08-20T19:54:50.2101698Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br]
2026-08-20T19:54:50.2253113Z Thursday 20 August 2026  16:54:50 -0300 (0:00:00.287)       0:00:27.003 ******* 
2026-08-20T19:54:50.8332574Z 
2026-08-20T19:54:50.8333160Z TASK [control_m : Garante bash_profile] ****************************************
2026-08-20T19:54:50.8333320Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br]
2026-08-20T19:54:50.8487224Z Thursday 20 August 2026  16:54:50 -0300 (0:00:00.623)       0:00:27.626 ******* 
2026-08-20T19:54:51.1106109Z 
2026-08-20T19:54:51.1107191Z TASK [control_m : Cria Diretório de Scripts] ***********************************
2026-08-20T19:54:51.1107426Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br]
2026-08-20T19:54:51.1257895Z Thursday 20 August 2026  16:54:51 -0300 (0:00:00.277)       0:00:27.903 ******* 
2026-08-20T19:54:51.9984337Z 
2026-08-20T19:54:51.9984855Z TASK [control_m : Copia Scripts] ***********************************************
2026-08-20T19:54:51.9985083Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br]
2026-08-20T19:54:52.0179569Z Thursday 20 August 2026  16:54:52 -0300 (0:00:00.892)       0:00:28.795 ******* 
2026-08-20T19:54:52.2931182Z 
2026-08-20T19:54:52.2931972Z TASK [control_m : Verifica se o arquivo /producao//configuration/custom.sh existe] ***
2026-08-20T19:54:52.2932444Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br]
2026-08-20T19:54:52.3089495Z Thursday 20 August 2026  16:54:52 -0300 (0:00:00.291)       0:00:29.087 ******* 
2026-08-20T19:54:52.7449537Z 
2026-08-20T19:54:52.7450083Z TASK [control_m : Executa shell customizada] ***********************************
2026-08-20T19:54:52.7450261Z changed: [caddeapllx2560.agil.nprd.caixa.gov.br]
2026-08-20T19:54:52.7599069Z Thursday 20 August 2026  16:54:52 -0300 (0:00:00.450)       0:00:29.537 ******* 
2026-08-20T19:54:53.4518389Z 
2026-08-20T19:54:53.4519555Z TASK [control_m : Configuração Control-M] **************************************
2026-08-20T19:54:53.4520135Z changed: [caddeapllx2560.agil.nprd.caixa.gov.br]
2026-08-20T19:54:53.4668102Z Thursday 20 August 2026  16:54:53 -0300 (0:00:00.706)       0:00:30.244 ******* 
2026-08-20T19:54:54.9923467Z 
2026-08-20T19:54:54.9924276Z TASK [control_m : Restart ControlM] ********************************************
2026-08-20T19:54:54.9924839Z changed: [caddeapllx2560.agil.nprd.caixa.gov.br]
2026-08-20T19:54:54.9963293Z 
2026-08-20T19:54:54.9963728Z PLAY [jboss] *******************************************************************
2026-08-20T19:54:55.0010207Z 
2026-08-20T19:54:55.0010769Z PLAY [jboss] *******************************************************************
2026-08-20T19:54:55.0051094Z 
2026-08-20T19:54:55.0051564Z PLAY [jboss] *******************************************************************
2026-08-20T19:54:55.0076050Z 
2026-08-20T19:54:55.0076468Z PLAY [jboss] *******************************************************************
2026-08-20T19:54:55.0108141Z 
2026-08-20T19:54:55.0108464Z PLAY [localhost] ***************************************************************
2026-08-20T19:54:55.0133106Z 
2026-08-20T19:54:55.0133406Z PLAY [jboss] *******************************************************************
2026-08-20T19:54:55.0183463Z 
2026-08-20T19:54:55.0184066Z PLAY [jboss] *******************************************************************
2026-08-20T19:54:55.0226156Z 
2026-08-20T19:54:55.0226486Z PLAY [jboss] *******************************************************************
2026-08-20T19:54:55.0257936Z 
2026-08-20T19:54:55.0258498Z PLAY RECAP *********************************************************************
2026-08-20T19:54:55.0258857Z caddeapllx2560.agil.nprd.caixa.gov.br : ok=46   changed=14   unreachable=0    failed=0    skipped=2    rescued=0    ignored=2   
2026-08-20T19:54:55.0258958Z 
2026-08-20T19:54:55.0259972Z Thursday 20 August 2026  16:54:55 -0300 (0:00:01.559)       0:00:31.804 ******* 
2026-08-20T19:54:55.0260186Z =============================================================================== 
2026-08-20T19:54:55.0264377Z nfs : Networker | Restart networker ------------------------------------ 10.45s
2026-08-20T19:54:55.0264678Z nfs : Instalando o NFS Client ------------------------------------------- 3.26s
2026-08-20T19:54:55.0264938Z nfs : execute montagem script ------------------------------------------- 2.24s
2026-08-20T19:54:55.0265233Z control_m : Restart ControlM -------------------------------------------- 1.56s
2026-08-20T19:54:55.0265479Z nfs : Networker | Start networker --------------------------------------- 0.94s
2026-08-20T19:54:55.0265731Z nfs : Install networker lgtoclnt_url ------------------------------------ 0.93s
2026-08-20T19:54:55.0266038Z control_m : Copia Scripts ----------------------------------------------- 0.89s
2026-08-20T19:54:55.0266264Z nfs : Install networker lgtonmda_url ------------------------------------ 0.87s
2026-08-20T19:54:55.0266828Z control_m : Copiando arquivo de certificado ----------------------------- 0.85s
2026-08-20T19:54:55.0267245Z control_m : Configuração Control-M -------------------------------------- 0.71s
2026-08-20T19:54:55.0267497Z Gathering Facts --------------------------------------------------------- 0.67s
2026-08-20T19:54:55.0267744Z Verifica se o arquivo {{ item }}/etc/hosts-{{ sistema_ambiente }} existe --- 0.67s
2026-08-20T19:54:55.0267981Z control_m : Garante bash_profile ---------------------------------------- 0.62s
2026-08-20T19:54:55.0268248Z Verifica se o arquivo nfs_config.json existe ---------------------------- 0.56s
2026-08-20T19:54:55.0268528Z nfs : Coletar variáveis de ambiente ------------------------------------- 0.48s
2026-08-20T19:54:55.0268794Z nfs : Montando volume remoto -------------------------------------------- 0.45s
2026-08-20T19:54:55.0269025Z control_m : Removendo add-user.sh --------------------------------------- 0.45s
2026-08-20T19:54:55.0269261Z control_m : Executa shell customizada ----------------------------------- 0.45s
2026-08-20T19:54:55.0269647Z nfs : Remove pacote jbcs-httpd ------------------------------------------ 0.43s
2026-08-20T19:54:55.0269879Z nfs : execute clean json ------------------------------------------------ 0.37s
2026-08-20T19:54:55.0270039Z Playbook run took 0 days, 0 hours, 0 minutes, 31 seconds
2026-08-20T19:54:55.0989012Z ##[debug]Exit code 0 received from tool '/bin/bash'
2026-08-20T19:54:55.0989371Z ##[debug]STDIO streams have closed for tool '/bin/bash'
2026-08-20T19:54:55.0989639Z ##[debug]task result: Succeeded
2026-08-20T19:54:55.0999694Z ##[debug]Processed: ##vso[task.complete result=Succeeded;done=true;]
2026-08-20T19:54:55.1019585Z ##[debug]PERF: RetryHelper Method:System.Threading.Tasks.Task <RunAsync>b__9() : took 34090.2282 ms
2026-08-20T19:54:55.1019780Z ##[debug]PERF WARNING: RetryHelper Method:System.Threading.Tasks.Task <RunAsync>b__9() : took 34090.2282 ms
2026-08-20T19:54:55.1020381Z ##[section]Finishing: Configura Control-M



2026-08-20T19:55:23.4720472Z ##[debug]Evaluating condition for step: 'Deploy Pacote'
2026-08-20T19:55:23.4721011Z ##[debug]Evaluating: succeeded()
2026-08-20T19:55:23.4721189Z ##[debug]Evaluating succeeded:
2026-08-20T19:55:23.4721475Z ##[debug]=> True
2026-08-20T19:55:23.4721686Z ##[debug]Result: True
2026-08-20T19:55:23.4721897Z ##[section]Starting: Deploy Pacote
2026-08-20T19:55:23.4725101Z ==============================================================================
2026-08-20T19:55:23.4725183Z Task         : Bash
2026-08-20T19:55:23.4725229Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-20T19:55:23.4725308Z Version      : 3.227.0
2026-08-20T19:55:23.4725355Z Author       : Microsoft Corporation
2026-08-20T19:55:23.4725406Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-20T19:55:23.4725489Z ==============================================================================
2026-08-20T19:55:24.2850205Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-08-20T19:55:24.3568674Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-08-20T19:55:24.3576304Z ##[debug]loading inputs and endpoints
2026-08-20T19:55:24.3579726Z ##[debug]loading INPUT_TARGETTYPE
2026-08-20T19:55:24.3587271Z ##[debug]loading INPUT_FILEPATH
2026-08-20T19:55:24.3588601Z ##[debug]loading INPUT_SCRIPT
2026-08-20T19:55:24.3589251Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-08-20T19:55:24.3589851Z ##[debug]loading INPUT_FAILONSTDERR
2026-08-20T19:55:24.3591496Z ##[debug]loading INPUT_NOPROFILE
2026-08-20T19:55:24.3592157Z ##[debug]loading INPUT_NORC
2026-08-20T19:55:24.3593662Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-08-20T19:55:24.3594242Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-08-20T19:55:24.3595664Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-08-20T19:55:24.3601320Z ##[debug]loading SECRET_TOKEN_CRQ
2026-08-20T19:55:24.3603271Z ##[debug]loading SECRET_AZPAT
2026-08-20T19:55:24.3604872Z ##[debug]loading SECRET_ARM_ACCESS_KEY
2026-08-20T19:55:24.3606697Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-08-20T19:55:24.3607060Z ##[debug]loading SECRET_PW_ISILON
2026-08-20T19:55:24.3607607Z ##[debug]loading SECRET_TOKEN_INFRAFACIL_MUDANCA
2026-08-20T19:55:24.3608159Z ##[debug]loading SECRET_ANSIBLE_VAULT
2026-08-20T19:55:24.3608667Z ##[debug]loading SECRET_PW_ALOCAIP
2026-08-20T19:55:24.3609163Z ##[debug]loading SECRET_FORTIFY_PASS
2026-08-20T19:55:24.3609703Z ##[debug]loading SECRET_OKD_TOKEN_PRODUTOS
2026-08-20T19:55:24.3612338Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-08-20T19:55:24.3612646Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-08-20T19:55:24.3612897Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-08-20T19:55:24.3613669Z ##[debug]loading SECRET_CV_SENHAORACLE
2026-08-20T19:55:24.3614143Z ##[debug]loading SECRET_SENHASERVICO
2026-08-20T19:55:24.3614402Z ##[debug]loading SECRET_TERRAFORM_ESX_PASSWORD
2026-08-20T19:55:24.3614634Z ##[debug]loaded 26
2026-08-20T19:55:24.3619036Z ##[debug]Agent.ProxyUrl=undefined
2026-08-20T19:55:24.3619976Z ##[debug]Agent.CAInfo=undefined
2026-08-20T19:55:24.3620341Z ##[debug]Agent.ClientCert=undefined
2026-08-20T19:55:24.3620731Z ##[debug]Agent.SkipCertValidation=True
2026-08-20T19:55:24.3634892Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-08-20T19:55:24.3636765Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-08-20T19:55:24.3637321Z ##[debug]system.culture=en-US
2026-08-20T19:55:24.3645378Z ##[debug]failOnStderr=false
2026-08-20T19:55:24.3646999Z ##[debug]workingDirectory=/opt/ads-agent/_work/r15264/a
2026-08-20T19:55:24.3647272Z ##[debug]check path : /opt/ads-agent/_work/r15264/a
2026-08-20T19:55:24.3647662Z ##[debug]targetType=inline
2026-08-20T19:55:24.3647908Z ##[debug]bashEnvValue=undefined
2026-08-20T19:55:24.3649351Z ##[debug]script=REPO=$(echo _SICCV-batch | sed 's/_//')
echo ansible-playbook /opt/ads-agent/_work/r15264/a/esteira-jboss-vm-v2/site.yml --tags batch --skip-tags "vm,monitoracao,autenticacao,git_conf,tsm,controlm" -e sistema_ambiente=des -e sistema_nome=SICCV-batch  -e default_working_directory_tfs=/opt/ads-agent/_work/r15264/a -e build_repository_name_tfs=$REPO -e quantidade_vm=$(quantidade_vm) -e url_deploy="`echo "http://binario.caixa:8081/repository/snapshots/br/gov/caixa/siccv/siccv-intra-standalone/2.0.239-16-SNAPSHOT/siccv-intra-standalone-2.0.239-16-20260728.142650-13.jar" | tr -d "\'"`" -e package_path=/opt/ads-agent/_work/r15264/a/binario/`basename http://binario.caixa:8081/repository/snapshots/br/gov/caixa/siccv/siccv-intra-standalone/2.0.239-16-SNAPSHOT/siccv-intra-standalone-2.0.239-16-20260728.142650-13.jar` -e site=ctc_nprd -e batch_deploy=true


ansible-playbook /opt/ads-agent/_work/r15264/a/esteira-jboss-vm-v2/site.yml --tags batch --skip-tags "vm,monitoracao,autenticacao,git_conf,tsm,controlm" -e sistema_ambiente=des -e sistema_nome=SICCV-batch  -e default_working_directory_tfs=/opt/ads-agent/_work/r15264/a -e build_repository_name_tfs=$REPO -e quantidade_vm=$(quantidade_vm) -e url_deploy="`echo "http://binario.caixa:8081/repository/snapshots/br/gov/caixa/siccv/siccv-intra-standalone/2.0.239-16-SNAPSHOT/siccv-intra-standalone-2.0.239-16-20260728.142650-13.jar" | tr -d "\'"`" -e package_path=/opt/ads-agent/_work/r15264/a/binario/`basename http://binario.caixa:8081/repository/snapshots/br/gov/caixa/siccv/siccv-intra-standalone/2.0.239-16-SNAPSHOT/siccv-intra-standalone-2.0.239-16-20260728.142650-13.jar` -e site=ctc_nprd -e batch_deploy=true
2026-08-20T19:55:24.3657017Z Generating script.
2026-08-20T19:55:24.3659390Z ##[debug]which 'bash'
2026-08-20T19:55:24.3665285Z ##[debug]found: '/bin/bash'
2026-08-20T19:55:24.3667767Z ##[debug]Agent.Version=3.225.2
2026-08-20T19:55:24.3668077Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-08-20T19:55:24.3668345Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-08-20T19:55:24.3670940Z ========================== Starting Command Output ===========================
2026-08-20T19:55:24.3671429Z ##[debug]which '/bin/bash'
2026-08-20T19:55:24.3672374Z ##[debug]found: '/bin/bash'
2026-08-20T19:55:24.3673007Z ##[debug]/bin/bash arg: /opt/ads-agent/_work/_temp/d78a4d46-9901-450e-bad7-5d90ef6bd5f1.sh
2026-08-20T19:55:24.3675564Z ##[debug]exec tool: /bin/bash
2026-08-20T19:55:24.3675923Z ##[debug]arguments:
2026-08-20T19:55:24.3676504Z ##[debug]   /opt/ads-agent/_work/_temp/d78a4d46-9901-450e-bad7-5d90ef6bd5f1.sh
2026-08-20T19:55:24.3678416Z [command]/bin/bash /opt/ads-agent/_work/_temp/d78a4d46-9901-450e-bad7-5d90ef6bd5f1.sh
2026-08-20T19:55:24.3769242Z /opt/ads-agent/_work/_temp/d78a4d46-9901-450e-bad7-5d90ef6bd5f1.sh: line 2: quantidade_vm: comando não encontrado
2026-08-20T19:55:24.3801119Z ansible-playbook /opt/ads-agent/_work/r15264/a/esteira-jboss-vm-v2/site.yml --tags batch --skip-tags vm,monitoracao,autenticacao,git_conf,tsm,controlm -e sistema_ambiente=des -e sistema_nome=SICCV-batch -e default_working_directory_tfs=/opt/ads-agent/_work/r15264/a -e build_repository_name_tfs=SICCV-batch -e quantidade_vm= -e url_deploy=http://binario.caixa:8081/repository/snapshots/br/gov/caixa/siccv/siccv-intra-standalone/2.0.239-16-SNAPSHOT/siccv-intra-standalone-2.0.239-16-20260728.142650-13.jar -e package_path=/opt/ads-agent/_work/r15264/a/binario/siccv-intra-standalone-2.0.239-16-20260728.142650-13.jar -e site=ctc_nprd -e batch_deploy=true
2026-08-20T19:55:24.3808553Z /opt/ads-agent/_work/_temp/d78a4d46-9901-450e-bad7-5d90ef6bd5f1.sh: line 5: quantidade_vm: comando não encontrado
2026-08-20T19:55:26.5259789Z 
2026-08-20T19:55:26.5260332Z PLAY [local] *******************************************************************
2026-08-20T19:55:26.5560249Z 
2026-08-20T19:55:26.5561220Z PLAY [Configurando o DNS] ******************************************************
2026-08-20T19:55:26.7606304Z 
2026-08-20T19:55:26.7607343Z PLAY [local] *******************************************************************
2026-08-20T19:55:26.7645099Z 
2026-08-20T19:55:26.7646148Z PLAY [Verificando serviços] ****************************************************
2026-08-20T19:55:26.7729318Z 
2026-08-20T19:55:26.7729909Z PLAY [Configuração LDAP] *******************************************************
2026-08-20T19:55:26.7760333Z [WARNING]: Found variable using reserved name: when
2026-08-20T19:55:26.7768692Z 
2026-08-20T19:55:26.7769003Z PLAY [jboss] *******************************************************************
2026-08-20T19:55:26.7851588Z 
2026-08-20T19:55:26.7851946Z PLAY [Stack Jboss] *************************************************************
2026-08-20T19:55:26.8098975Z Thursday 20 August 2026  16:55:26 -0300 (0:00:00.344)       0:00:00.344 ******* 
2026-08-20T19:55:27.3409191Z 
2026-08-20T19:55:27.3410287Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-08-20T19:55:27.3410721Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br]
2026-08-20T19:55:27.3414419Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-08-20T19:55:27.3414839Z caddeapllx2560.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-08-20T19:55:27.3415034Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-08-20T19:55:27.3415209Z releases. A future Ansible release will default to using the discovered 
2026-08-20T19:55:27.3418012Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-08-20T19:55:27.3418270Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-08-20T19:55:27.3418446Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-08-20T19:55:27.3418611Z setting deprecation_warnings=False in ansible.cfg.
2026-08-20T19:55:27.3428979Z 
2026-08-20T19:55:27.3429335Z PLAY [jboss] *******************************************************************
2026-08-20T19:55:27.3474086Z 
2026-08-20T19:55:27.3474424Z PLAY [jboss] *******************************************************************
2026-08-20T19:55:27.3515102Z 
2026-08-20T19:55:27.3515440Z PLAY [jboss] *******************************************************************
2026-08-20T19:55:27.3542731Z 
2026-08-20T19:55:27.3543111Z PLAY [Copiando deployments adicionais] *****************************************
2026-08-20T19:55:27.3570065Z 
2026-08-20T19:55:27.3570506Z PLAY [Copiando modules adicionais] *********************************************
2026-08-20T19:55:27.3598244Z 
2026-08-20T19:55:27.3598537Z PLAY [jboss] *******************************************************************
2026-08-20T19:55:27.3635047Z 
2026-08-20T19:55:27.3635593Z PLAY [jboss] *******************************************************************
2026-08-20T19:55:27.3666098Z 
2026-08-20T19:55:27.3666423Z PLAY [jboss] *******************************************************************
2026-08-20T19:55:27.3701325Z 
2026-08-20T19:55:27.3701732Z PLAY [jboss] *******************************************************************
2026-08-20T19:55:27.3732087Z 
2026-08-20T19:55:27.3732636Z PLAY [jboss] *******************************************************************
2026-08-20T19:55:27.3759542Z 
2026-08-20T19:55:27.3759855Z PLAY [local] *******************************************************************
2026-08-20T19:55:27.3784925Z [WARNING]: Could not match supplied host pattern, ignoring: instance_restart
2026-08-20T19:55:27.3787138Z 
2026-08-20T19:55:27.3787464Z PLAY [instance_restart] ********************************************************
2026-08-20T19:55:27.3787761Z skipping: no hosts matched
2026-08-20T19:55:27.3790690Z [WARNING]: Could not match supplied host pattern, ignoring: machine_reboot
2026-08-20T19:55:27.3796096Z 
2026-08-20T19:55:27.3796319Z PLAY [machine_reboot] **********************************************************
2026-08-20T19:55:27.3796478Z skipping: no hosts matched
2026-08-20T19:55:27.3802287Z 
2026-08-20T19:55:27.3802451Z PLAY [local] *******************************************************************
2026-08-20T19:55:27.3824493Z [WARNING]: Could not match supplied host pattern, ignoring: instance_stop
2026-08-20T19:55:27.3827678Z 
2026-08-20T19:55:27.3827973Z PLAY [instance_stop] ***********************************************************
2026-08-20T19:55:27.3828125Z skipping: no hosts matched
2026-08-20T19:55:27.3831356Z 
2026-08-20T19:55:27.3831700Z PLAY [machine_reboot] **********************************************************
2026-08-20T19:55:27.3831892Z skipping: no hosts matched
2026-08-20T19:55:27.3839804Z 
2026-08-20T19:55:27.3839966Z PLAY [local] *******************************************************************
2026-08-20T19:55:27.3860603Z [WARNING]: Could not match supplied host pattern, ignoring: escopo_execucao
2026-08-20T19:55:27.3863953Z 
2026-08-20T19:55:27.3864249Z PLAY [Executar o Start do Sirot Connector no escopo definido] ******************
2026-08-20T19:55:27.3864479Z skipping: no hosts matched
2026-08-20T19:55:27.3870145Z 
2026-08-20T19:55:27.3870298Z PLAY [local] *******************************************************************
2026-08-20T19:55:27.3902750Z 
2026-08-20T19:55:27.3903073Z PLAY [Executar o Stop do Sirot Connector] **************************************
2026-08-20T19:55:27.3903291Z skipping: no hosts matched
2026-08-20T19:55:27.3908895Z 
2026-08-20T19:55:27.3909145Z PLAY [Configura TSM] ***********************************************************
2026-08-20T19:55:27.3936527Z 
2026-08-20T19:55:27.3937160Z PLAY [jboss] *******************************************************************
2026-08-20T19:55:27.3960651Z 
2026-08-20T19:55:27.3961035Z PLAY [Configura Control-M] *****************************************************
2026-08-20T19:55:27.3996579Z 
2026-08-20T19:55:27.3996993Z PLAY [jboss] *******************************************************************
2026-08-20T19:55:27.4036038Z 
2026-08-20T19:55:27.4036356Z PLAY [jboss] *******************************************************************
2026-08-20T19:55:27.4074808Z 
2026-08-20T19:55:27.4074965Z PLAY [jboss] *******************************************************************
2026-08-20T19:55:27.4111552Z Thursday 20 August 2026  16:55:27 -0300 (0:00:00.601)       0:00:00.946 ******* 
2026-08-20T19:55:29.0544311Z 
2026-08-20T19:55:29.0545285Z TASK [Gathering Facts] *********************************************************
2026-08-20T19:55:29.0545497Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br]
2026-08-20T19:55:29.0897034Z Thursday 20 August 2026  16:55:29 -0300 (0:00:01.678)       0:00:02.624 ******* 
2026-08-20T19:55:29.1354850Z 
2026-08-20T19:55:29.1355562Z TASK [Gerando lista de secure files] *******************************************
2026-08-20T19:55:29.1355750Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br]
2026-08-20T19:55:29.1377575Z 
2026-08-20T19:55:29.1378286Z PLAY [jboss] *******************************************************************
2026-08-20T19:55:29.1652880Z Thursday 20 August 2026  16:55:29 -0300 (0:00:00.074)       0:00:02.698 ******* 
2026-08-20T19:55:29.8316467Z 
2026-08-20T19:55:29.8317956Z TASK [Gathering Facts] *********************************************************
2026-08-20T19:55:29.8318668Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br]
2026-08-20T19:55:29.8856835Z Thursday 20 August 2026  16:55:29 -0300 (0:00:00.721)       0:00:03.420 ******* 
2026-08-20T19:55:30.3295830Z 
2026-08-20T19:55:30.3297092Z TASK [Cria Diretórios em /opt/batch/] ******************************************
2026-08-20T19:55:30.3297323Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br] => (item=/opt/batch)
2026-08-20T19:55:30.5470396Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br] => (item=/opt/batch/config)
2026-08-20T19:55:30.7719258Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br] => (item=/opt/batch/deploy)
2026-08-20T19:55:30.9940882Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br] => (item=/opt/batch/securefiles)
2026-08-20T19:55:31.0208644Z Thursday 20 August 2026  16:55:31 -0300 (0:00:01.135)       0:00:04.555 ******* 
2026-08-20T19:55:31.0849166Z Thursday 20 August 2026  16:55:31 -0300 (0:00:00.063)       0:00:04.619 ******* 
2026-08-20T19:55:31.1577756Z included: /opt/ads-agent/_work/r15264/a/esteira-jboss-vm-v2/roles/batch/tasks/batch_deploy.yml for caddeapllx2560.agil.nprd.caixa.gov.br
2026-08-20T19:55:31.1817269Z Thursday 20 August 2026  16:55:31 -0300 (0:00:00.096)       0:00:04.716 ******* 
2026-08-20T19:55:31.2368890Z 
2026-08-20T19:55:31.2369847Z TASK [Cria variáveis] **********************************************************
2026-08-20T19:55:31.2370045Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br]
2026-08-20T19:55:31.2607574Z Thursday 20 August 2026  16:55:31 -0300 (0:00:00.079)       0:00:04.795 ******* 
2026-08-20T19:55:31.6904668Z 
2026-08-20T19:55:31.6905627Z TASK [Get path of deploy] ******************************************************
2026-08-20T19:55:31.6906298Z changed: [caddeapllx2560.agil.nprd.caixa.gov.br] => (item=http://binario.caixa:8081/repository/snapshots/br/gov/caixa/siccv/siccv-intra-standalone/2.0.239-16-SNAPSHOT/siccv-intra-standalone-2.0.239-16-20260728.142650-13.jar)
2026-08-20T19:55:31.7170897Z Thursday 20 August 2026  16:55:31 -0300 (0:00:00.456)       0:00:05.252 ******* 
2026-08-20T19:55:31.7748363Z 
2026-08-20T19:55:31.7749297Z TASK [set package_urls] ********************************************************
2026-08-20T19:55:31.7749558Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br]
2026-08-20T19:55:31.8066849Z Thursday 20 August 2026  16:55:31 -0300 (0:00:00.089)       0:00:05.341 ******* 
2026-08-20T19:55:32.1905335Z 
2026-08-20T19:55:32.1906329Z TASK [Verifica o se package existe] ********************************************
2026-08-20T19:55:32.1907173Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r15264/a/binario/siccv-intra-standalone-2.0.239-16-20260728.142650-13.jar)
2026-08-20T19:55:32.2155727Z Thursday 20 August 2026  16:55:32 -0300 (0:00:00.408)       0:00:05.750 ******* 
2026-08-20T19:55:32.8320147Z 
2026-08-20T19:55:32.8321248Z TASK [Deploy do Pacote] ********************************************************
2026-08-20T19:55:32.8321800Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r15264/a/binario/siccv-intra-standalone-2.0.239-16-20260728.142650-13.jar)
2026-08-20T19:55:32.8592122Z Thursday 20 August 2026  16:55:32 -0300 (0:00:00.643)       0:00:06.394 ******* 
2026-08-20T19:55:33.1208337Z 
2026-08-20T19:55:33.1209524Z TASK [Verifica se o arquivo /producao//configuration/custom-deploy.sh existe] ***
2026-08-20T19:55:33.1209773Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br]
2026-08-20T19:55:33.1450849Z Thursday 20 August 2026  16:55:33 -0300 (0:00:00.285)       0:00:06.680 ******* 
2026-08-20T19:55:33.2113419Z Thursday 20 August 2026  16:55:33 -0300 (0:00:00.066)       0:00:06.746 ******* 
2026-08-20T19:55:33.2777937Z Thursday 20 August 2026  16:55:33 -0300 (0:00:00.066)       0:00:06.812 ******* 
2026-08-20T19:55:33.3452973Z included: /opt/ads-agent/_work/r15264/a/esteira-jboss-vm-v2/roles/batch/tasks/batch_logs.yml for caddeapllx2560.agil.nprd.caixa.gov.br
2026-08-20T19:55:33.3708946Z Thursday 20 August 2026  16:55:33 -0300 (0:00:00.093)       0:00:06.905 ******* 
2026-08-20T19:55:33.8169739Z 
2026-08-20T19:55:33.8170561Z TASK [Criacao diretorio /logs/batch] *******************************************
2026-08-20T19:55:33.8171294Z ok: [caddeapllx2560.agil.nprd.caixa.gov.br]
2026-08-20T19:55:33.8199792Z 
2026-08-20T19:55:33.8200405Z PLAY [localhost] ***************************************************************
2026-08-20T19:55:33.8229288Z 
2026-08-20T19:55:33.8229776Z PLAY [jboss] *******************************************************************
2026-08-20T19:55:33.8272484Z 
2026-08-20T19:55:33.8273138Z PLAY [jboss] *******************************************************************
2026-08-20T19:55:33.8310579Z 
2026-08-20T19:55:33.8310790Z PLAY [jboss] *******************************************************************
2026-08-20T19:55:33.8340339Z 
2026-08-20T19:55:33.8340830Z PLAY RECAP *********************************************************************
2026-08-20T19:55:33.8341187Z caddeapllx2560.agil.nprd.caixa.gov.br : ok=14   changed=1    unreachable=0    failed=0    skipped=3    rescued=0    ignored=0   
2026-08-20T19:55:33.8341659Z 
2026-08-20T19:55:33.8345028Z Thursday 20 August 2026  16:55:33 -0300 (0:00:00.463)       0:00:07.369 ******* 
2026-08-20T19:55:33.8345721Z =============================================================================== 
2026-08-20T19:55:33.8346179Z Gathering Facts --------------------------------------------------------- 1.68s
2026-08-20T19:55:33.8346849Z Cria Diretórios em /opt/batch/ ------------------------------------------ 1.14s
2026-08-20T19:55:33.8347267Z Gathering Facts --------------------------------------------------------- 0.72s
2026-08-20T19:55:33.8347507Z Deploy do Pacote -------------------------------------------------------- 0.64s
2026-08-20T19:55:33.8347743Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.60s
2026-08-20T19:55:33.8348769Z Criacao diretorio /logs/batch ------------------------------------------- 0.46s
2026-08-20T19:55:33.8354357Z Get path of deploy ------------------------------------------------------ 0.46s
2026-08-20T19:55:33.8354882Z Verifica o se package existe -------------------------------------------- 0.41s
2026-08-20T19:55:33.8355190Z Verifica se o arquivo /producao//configuration/custom-deploy.sh existe --- 0.29s
2026-08-20T19:55:33.8355434Z include_tasks ----------------------------------------------------------- 0.10s
2026-08-20T19:55:33.8355667Z include_tasks ----------------------------------------------------------- 0.09s
2026-08-20T19:55:33.8355895Z set package_urls -------------------------------------------------------- 0.09s
2026-08-20T19:55:33.8356144Z Cria variáveis ---------------------------------------------------------- 0.08s
2026-08-20T19:55:33.8357261Z Gerando lista de secure files ------------------------------------------- 0.07s
2026-08-20T19:55:33.8357501Z include_tasks ----------------------------------------------------------- 0.07s
2026-08-20T19:55:33.8357801Z Executa shell customizada ----------------------------------------------- 0.07s
2026-08-20T19:55:33.8358049Z include_tasks ----------------------------------------------------------- 0.06s
2026-08-20T19:55:33.8358220Z Playbook run took 0 days, 0 hours, 0 minutes, 7 seconds
2026-08-20T19:55:33.9039371Z ##[debug]Exit code 0 received from tool '/bin/bash'
2026-08-20T19:55:33.9041755Z ##[debug]STDIO streams have closed for tool '/bin/bash'
2026-08-20T19:55:33.9047171Z ##[debug]task result: Succeeded
2026-08-20T19:55:33.9049324Z ##[debug]Processed: ##vso[task.complete result=Succeeded;done=true;]
2026-08-20T19:55:33.9076276Z ##[section]Finishing: Deploy Pacote


