2026-08-12T19:04:23.1902913Z ##[section]Starting: Terraform init
2026-08-12T19:04:23.1906566Z ==============================================================================
2026-08-12T19:04:23.1906647Z Task         : Bash
2026-08-12T19:04:23.1906691Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-12T19:04:23.1906777Z Version      : 3.227.0
2026-08-12T19:04:23.1906823Z Author       : Microsoft Corporation
2026-08-12T19:04:23.1906874Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-12T19:04:23.1906959Z ==============================================================================
2026-08-12T19:04:24.0892155Z Generating script.
2026-08-12T19:04:24.0903931Z ========================== Starting Command Output ===========================
2026-08-12T19:04:24.0945274Z [command]/bin/bash /opt/ads-agent/_work/_temp/6437fa30-997e-4d80-b4cf-851ed11d3803.sh
2026-08-12T19:04:24.1352495Z 
2026-08-12T19:04:24.1353250Z Initializing the backend...
2026-08-12T19:04:24.3179353Z 
2026-08-12T19:04:24.3180939Z Successfully configured the backend "azurerm"! Terraform will automatically
2026-08-12T19:04:24.3181393Z use this backend unless the backend configuration changes.
2026-08-12T19:04:24.5358199Z 
2026-08-12T19:04:24.5358690Z Initializing provider plugins...
2026-08-12T19:04:24.5359068Z - Finding latest version of hashicorp/external...
2026-08-12T19:04:24.6777079Z - Finding hashicorp/azurerm versions matching "3.0.0"...
2026-08-12T19:04:24.7542782Z - Finding latest version of hashicorp/vsphere...
2026-08-12T19:04:25.0463468Z - Installing hashicorp/vsphere v2.12.0...
2026-08-12T19:04:26.3891963Z - Installed hashicorp/vsphere v2.12.0 (signed by HashiCorp)
2026-08-12T19:04:26.6286315Z - Installing hashicorp/external v2.4.0...
2026-08-12T19:04:27.4972812Z - Installed hashicorp/external v2.4.0 (signed by HashiCorp)
2026-08-12T19:04:27.7043346Z - Installing hashicorp/azurerm v3.0.0...
2026-08-12T19:04:31.9607297Z - Installed hashicorp/azurerm v3.0.0 (signed by HashiCorp)
2026-08-12T19:04:31.9607528Z 
2026-08-12T19:04:31.9607768Z Terraform has created a lock file .terraform.lock.hcl to record the provider
2026-08-12T19:04:31.9612969Z selections it made above. Include this file in your version control repository
2026-08-12T19:04:31.9614000Z so that Terraform can guarantee to make the same selections by default when
2026-08-12T19:04:31.9614329Z you run "terraform init" in the future.
2026-08-12T19:04:31.9614627Z 
2026-08-12T19:04:31.9614902Z 
2026-08-12T19:04:31.9615176Z Warning: Additional provider information from registry
2026-08-12T19:04:31.9615336Z 
2026-08-12T19:04:31.9615615Z The remote registry returned warnings for
2026-08-12T19:04:31.9616252Z registry.terraform.io/hashicorp/vsphere:
2026-08-12T19:04:31.9616719Z - For users on Terraform 0.13 or greater, this provider has moved to
2026-08-12T19:04:31.9616988Z vmware/vsphere. Please update your source in required_providers.
2026-08-12T19:04:31.9617096Z 
2026-08-12T19:04:31.9617285Z Terraform has been successfully initialized!
2026-08-12T19:04:31.9617394Z 
2026-08-12T19:04:31.9617611Z You may now begin working with Terraform. Try running "terraform plan" to see
2026-08-12T19:04:31.9617887Z any changes that are required for your infrastructure. All Terraform commands
2026-08-12T19:04:31.9618114Z should now work.
2026-08-12T19:04:31.9618182Z 
2026-08-12T19:04:31.9618364Z If you ever set or change modules or backend configuration for Terraform,
2026-08-12T19:04:31.9618635Z rerun this command to reinitialize your working directory. If you forget, other
2026-08-12T19:04:31.9618891Z commands will detect it and remind you to do so if necessary.
2026-08-12T19:04:31.9727771Z ##[section]Finishing: Terraform init


2026-08-12T19:04:31.9752570Z ##[section]Starting: Terraform validate
2026-08-12T19:04:31.9756869Z ==============================================================================
2026-08-12T19:04:31.9756987Z Task         : Bash
2026-08-12T19:04:31.9757047Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-12T19:04:31.9757150Z Version      : 3.227.0
2026-08-12T19:04:31.9757205Z Author       : Microsoft Corporation
2026-08-12T19:04:31.9757270Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-12T19:04:31.9757370Z ==============================================================================
2026-08-12T19:04:32.8911262Z Generating script.
2026-08-12T19:04:32.8913812Z ========================== Starting Command Output ===========================
2026-08-12T19:04:32.8916951Z [command]/bin/bash /opt/ads-agent/_work/_temp/073e1e9c-b949-4ae2-b45b-8ec2cb17916f.sh
2026-08-12T19:04:33.7321909Z Success! The configuration is valid.
2026-08-12T19:04:33.7322032Z 
2026-08-12T19:04:33.7398010Z ##[section]Finishing: Terraform validate



2026-08-12T19:04:33.7425945Z ##[section]Starting: Terraform workspace
2026-08-12T19:04:33.7430212Z ==============================================================================
2026-08-12T19:04:33.7430370Z Task         : Bash
2026-08-12T19:04:33.7430417Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-12T19:04:33.7430522Z Version      : 3.227.0
2026-08-12T19:04:33.7430570Z Author       : Microsoft Corporation
2026-08-12T19:04:33.7430621Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-12T19:04:33.7430750Z ==============================================================================
2026-08-12T19:04:34.5818529Z Generating script.
2026-08-12T19:04:34.5838031Z ========================== Starting Command Output ===========================
2026-08-12T19:04:34.5841653Z [command]/bin/bash /opt/ads-agent/_work/_temp/41049531-f439-4228-8129-f1f9812ff918.sh
2026-08-12T19:04:35.4314775Z [0m[32mSwitched to workspace "des".[0m
2026-08-12T19:04:35.4379299Z ##[section]Finishing: Terraform workspace
2026-08-12T19:04:35.4402730Z ##[section]Starting: Terraform destroy
2026-08-12T19:04:35.4406440Z ==============================================================================
2026-08-12T19:04:35.4406524Z Task         : Bash
2026-08-12T19:04:35.4406569Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-12T19:04:35.4406646Z Version      : 3.227.0
2026-08-12T19:04:35.4406692Z Author       : Microsoft Corporation
2026-08-12T19:04:35.4406744Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-12T19:04:35.4406936Z ==============================================================================
2026-08-12T19:04:36.3253283Z Generating script.
2026-08-12T19:04:36.3270825Z ========================== Starting Command Output ===========================
2026-08-12T19:04:36.3285267Z [command]/bin/bash /opt/ads-agent/_work/_temp/31d5c640-66cf-489c-b390-9235471f146a.sh
2026-08-12T19:04:36.3432882Z ##[section]Finishing: Terraform destroy




2026-08-12T19:04:36.3458469Z ##[section]Starting: Terraform apply
2026-08-12T19:04:36.3461820Z ==============================================================================
2026-08-12T19:04:36.3461904Z Task         : Bash
2026-08-12T19:04:36.3461948Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-12T19:04:36.3462023Z Version      : 3.227.0
2026-08-12T19:04:36.3462066Z Author       : Microsoft Corporation
2026-08-12T19:04:36.3462117Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-12T19:04:36.3462252Z ==============================================================================
2026-08-12T19:04:37.2372543Z Generating script.
2026-08-12T19:04:37.2392127Z ========================== Starting Command Output ===========================
2026-08-12T19:04:37.2394927Z [command]/bin/bash /opt/ads-agent/_work/_temp/cdecbb3f-62e7-4e51-b9d3-ed9ab318abb0.sh
2026-08-12T19:04:39.0160261Z data.vsphere_datacenter.dc: Reading...
2026-08-12T19:04:39.0161322Z data.vsphere_folder.folder: Reading...
2026-08-12T19:04:39.0161667Z data.vsphere_tag_category.addr: Reading...
2026-08-12T19:04:39.0758825Z data.vsphere_folder.folder: Read complete after 0s [id=group-v22]
2026-08-12T19:04:39.4774407Z data.vsphere_tag_category.addr: Read complete after 0s [id=urn:vmomi:InventoryServiceCategory:40fbf91f-3227-40d6-9785-a481d122536e:GLOBAL]
2026-08-12T19:04:39.4814725Z data.external.consulta_tag: Reading...
2026-08-12T19:04:41.3306342Z data.vsphere_datacenter.dc: Read complete after 2s [id=datacenter-21]
2026-08-12T19:04:41.5977660Z data.vsphere_datastore.datastore: Reading...
2026-08-12T19:04:41.5996414Z data.vsphere_virtual_machine.template: Reading...
2026-08-12T19:04:41.6000105Z data.vsphere_resource_pool.pool: Reading...
2026-08-12T19:04:41.6009650Z data.vsphere_compute_cluster.cluster: Reading...
2026-08-12T19:04:41.6010078Z data.vsphere_network.network_bck: Reading...
2026-08-12T19:04:41.6010515Z data.vsphere_network.network: Reading...
2026-08-12T19:04:41.8873191Z data.vsphere_compute_cluster.cluster: Read complete after 0s [id=domain-c710514]
2026-08-12T19:04:41.9047007Z data.vsphere_network.network_bck: Read complete after 0s [id=dvportgroup-72342]
2026-08-12T19:04:41.9059412Z data.vsphere_resource_pool.pool: Read complete after 0s [id=resgroup-1062077]
2026-08-12T19:04:41.9784323Z data.vsphere_network.network: Read complete after 0s [id=dvportgroup-68733]
2026-08-12T19:04:42.4056690Z data.vsphere_datastore.datastore: Read complete after 0s [id=datastore-770300]
2026-08-12T19:04:45.3413444Z data.external.consulta_tag: Read complete after 6s [id=-]
2026-08-12T19:04:51.5989298Z data.vsphere_virtual_machine.template: Still reading... [10s elapsed]
2026-08-12T19:05:01.5992664Z data.vsphere_virtual_machine.template: Still reading... [20s elapsed]
2026-08-12T19:05:11.3089754Z data.vsphere_virtual_machine.template: Read complete after 29s [id=422327d7-a327-8009-e37d-598cfe1225d9]
2026-08-12T19:05:11.3177317Z vsphere_virtual_machine.vm["caddeapllx2484.agil.nprd.caixa.gov.br"]: Refreshing state... [id=42023776-146d-309c-8b74-88d667f12533]
2026-08-12T19:05:12.1014407Z 
2026-08-12T19:05:12.1015016Z No changes. Your infrastructure matches the configuration.
2026-08-12T19:05:12.1015099Z 
2026-08-12T19:05:12.1042161Z Terraform has compared your real infrastructure against your configuration
2026-08-12T19:05:12.1042376Z and found no differences, so no changes are needed.
2026-08-12T19:05:15.4139021Z data.vsphere_folder.folder: Reading...
2026-08-12T19:05:15.4148055Z data.vsphere_datacenter.dc: Reading...
2026-08-12T19:05:15.4148922Z data.vsphere_tag_category.addr: Reading...
2026-08-12T19:05:15.5186665Z data.vsphere_folder.folder: Read complete after 1s [id=group-v22]
2026-08-12T19:05:15.9944077Z data.vsphere_tag_category.addr: Read complete after 1s [id=urn:vmomi:InventoryServiceCategory:40fbf91f-3227-40d6-9785-a481d122536e:GLOBAL]
2026-08-12T19:05:15.9959194Z data.external.consulta_tag: Reading...
2026-08-12T19:05:17.7938033Z data.vsphere_datacenter.dc: Read complete after 3s [id=datacenter-21]
2026-08-12T19:05:18.0202332Z data.vsphere_network.network: Reading...
2026-08-12T19:05:18.0309641Z data.vsphere_network.network_bck: Reading...
2026-08-12T19:05:18.0344616Z data.vsphere_resource_pool.pool: Reading...
2026-08-12T19:05:18.0354835Z data.vsphere_virtual_machine.template: Reading...
2026-08-12T19:05:18.0418034Z data.vsphere_compute_cluster.cluster: Reading...
2026-08-12T19:05:18.0439442Z data.vsphere_datastore.datastore: Reading...
2026-08-12T19:05:18.2674971Z data.vsphere_resource_pool.pool: Read complete after 0s [id=resgroup-1062077]
2026-08-12T19:05:18.3055441Z data.vsphere_network.network: Read complete after 0s [id=dvportgroup-68733]
2026-08-12T19:05:18.3247912Z data.vsphere_network.network_bck: Read complete after 0s [id=dvportgroup-72342]
2026-08-12T19:05:18.3723321Z data.vsphere_compute_cluster.cluster: Read complete after 0s [id=domain-c710514]
2026-08-12T19:05:18.9166907Z data.vsphere_datastore.datastore: Read complete after 1s [id=datastore-770300]
2026-08-12T19:05:22.3498498Z data.external.consulta_tag: Read complete after 6s [id=-]
2026-08-12T19:05:28.0362669Z data.vsphere_virtual_machine.template: Still reading... [10s elapsed]
2026-08-12T19:05:38.0371576Z data.vsphere_virtual_machine.template: Still reading... [20s elapsed]
2026-08-12T19:05:40.1590419Z data.vsphere_virtual_machine.template: Read complete after 22s [id=422327d7-a327-8009-e37d-598cfe1225d9]
2026-08-12T19:05:40.1686936Z vsphere_virtual_machine.vm["caddeapllx2484.agil.nprd.caixa.gov.br"]: Refreshing state... [id=42023776-146d-309c-8b74-88d667f12533]
2026-08-12T19:05:40.6514986Z 
2026-08-12T19:05:40.6515865Z No changes. Your infrastructure matches the configuration.
2026-08-12T19:05:40.6516209Z 
2026-08-12T19:05:40.6516539Z Terraform has compared your real infrastructure against your configuration
2026-08-12T19:05:40.6516751Z and found no differences, so no changes are needed.
2026-08-12T19:05:41.0885701Z 
2026-08-12T19:05:41.0886687Z Apply complete! Resources: 0 added, 0 changed, 0 destroyed.
2026-08-12T19:05:41.0991256Z ##[section]Finishing: Terraform apply


2026-08-12T19:05:54.5417068Z ##[section]Starting: Cadastrar Servidor no Satellite
2026-08-12T19:05:54.5421299Z ==============================================================================
2026-08-12T19:05:54.5421389Z Task         : Bash
2026-08-12T19:05:54.5421436Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-12T19:05:54.5421521Z Version      : 3.227.0
2026-08-12T19:05:54.5421566Z Author       : Microsoft Corporation
2026-08-12T19:05:54.5421617Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-12T19:05:54.5421704Z ==============================================================================
2026-08-12T19:05:55.4306564Z Generating script.
2026-08-12T19:05:55.4322371Z ========================== Starting Command Output ===========================
2026-08-12T19:05:55.4336947Z [command]/bin/bash /opt/ads-agent/_work/_temp/f260cca5-6c07-45d8-8aa2-28a1dd9cf4c9.sh
2026-08-12T19:05:55.4398599Z ++ echo _SICMU-intranet-update
2026-08-12T19:05:55.4400866Z ++ sed s/_//
2026-08-12T19:05:55.4410233Z + REPO=SICMU-intranet-update
2026-08-12T19:05:55.4419357Z ++ tf_var_quant
2026-08-12T19:05:55.4420007Z /opt/ads-agent/_work/_temp/f260cca5-6c07-45d8-8aa2-28a1dd9cf4c9.sh: line 4: tf_var_quant: comando não encontrado
2026-08-12T19:05:55.4420623Z + ansible-playbook /opt/ads-agent/_work/r15163/a/esteira-jboss-vm-v2/site.yml --tags satellite -e sistema_ambiente=des -e sistema_nome=sicmu-intranet-update -e site=ctc_nprd -e quantidade_vm= -e centralizadora_operacoes=7259 -e centralizadora_desenvolvimento=7390 -e default_working_directory_tfs=/opt/ads-agent/_work/r15163/a -e build_repository_name_tfs=SICMU-intranet-update
2026-08-12T19:05:58.0179428Z 
2026-08-12T19:05:58.0181230Z PLAY [local] *******************************************************************
2026-08-12T19:05:58.0516702Z 
2026-08-12T19:05:58.0518072Z PLAY [Configurando o DNS] ******************************************************
2026-08-12T19:05:58.2379556Z 
2026-08-12T19:05:58.2380285Z PLAY [local] *******************************************************************
2026-08-12T19:05:58.2444919Z 
2026-08-12T19:05:58.2445757Z PLAY [Verificando serviços] ****************************************************
2026-08-12T19:05:58.2555878Z 
2026-08-12T19:05:58.2557106Z PLAY [Configuração LDAP] *******************************************************
2026-08-12T19:05:58.2609411Z [WARNING]: Found variable using reserved name: when
2026-08-12T19:05:58.2620327Z 
2026-08-12T19:05:58.2620795Z PLAY [jboss] *******************************************************************
2026-08-12T19:05:58.2751019Z 
2026-08-12T19:05:58.2752081Z PLAY [Stack Jboss] *************************************************************
2026-08-12T19:05:58.3042124Z Wednesday 12 August 2026  16:05:58 -0300 (0:00:00.349)       0:00:00.349 ****** 
2026-08-12T19:05:58.9165483Z 
2026-08-12T19:05:58.9166411Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-08-12T19:05:58.9166837Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-08-12T19:05:58.9194627Z 
2026-08-12T19:05:58.9195124Z PLAY [jboss] *******************************************************************
2026-08-12T19:05:58.9242854Z 
2026-08-12T19:05:58.9243302Z PLAY [jboss] *******************************************************************
2026-08-12T19:05:58.9285047Z 
2026-08-12T19:05:58.9285468Z PLAY [jboss] *******************************************************************
2026-08-12T19:05:58.9314963Z 
2026-08-12T19:05:58.9315592Z PLAY [Copiando deployments adicionais] *****************************************
2026-08-12T19:05:58.9344129Z 
2026-08-12T19:05:58.9344808Z PLAY [Copiando modules adicionais] *********************************************
2026-08-12T19:05:58.9372032Z 
2026-08-12T19:05:58.9372401Z PLAY [jboss] *******************************************************************
2026-08-12T19:05:58.9410404Z 
2026-08-12T19:05:58.9410798Z PLAY [jboss] *******************************************************************
2026-08-12T19:05:58.9439142Z 
2026-08-12T19:05:58.9439673Z PLAY [jboss] *******************************************************************
2026-08-12T19:05:58.9473609Z 
2026-08-12T19:05:58.9474338Z PLAY [jboss] *******************************************************************
2026-08-12T19:05:58.9499765Z 
2026-08-12T19:05:58.9500112Z PLAY [jboss] *******************************************************************
2026-08-12T19:05:58.9527393Z 
2026-08-12T19:05:58.9527878Z PLAY [local] *******************************************************************
2026-08-12T19:05:58.9553512Z [WARNING]: Could not match supplied host pattern, ignoring: instance_restart
2026-08-12T19:05:58.9556425Z 
2026-08-12T19:05:58.9556937Z PLAY [instance_restart] ********************************************************
2026-08-12T19:05:58.9557136Z skipping: no hosts matched
2026-08-12T19:05:58.9559913Z [WARNING]: Could not match supplied host pattern, ignoring: machine_reboot
2026-08-12T19:05:58.9562959Z 
2026-08-12T19:05:58.9563186Z PLAY [machine_reboot] **********************************************************
2026-08-12T19:05:58.9563473Z skipping: no hosts matched
2026-08-12T19:05:58.9574121Z 
2026-08-12T19:05:58.9574530Z PLAY [local] *******************************************************************
2026-08-12T19:05:58.9601168Z [WARNING]: Could not match supplied host pattern, ignoring: instance_stop
2026-08-12T19:05:58.9603011Z 
2026-08-12T19:05:58.9603309Z PLAY [instance_stop] ***********************************************************
2026-08-12T19:05:58.9603479Z skipping: no hosts matched
2026-08-12T19:05:58.9608727Z 
2026-08-12T19:05:58.9609026Z PLAY [machine_reboot] **********************************************************
2026-08-12T19:05:58.9609193Z skipping: no hosts matched
2026-08-12T19:05:58.9632739Z 
2026-08-12T19:05:58.9633411Z PLAY [Configura TSM] ***********************************************************
2026-08-12T19:05:58.9662611Z 
2026-08-12T19:05:58.9662930Z PLAY [jboss] *******************************************************************
2026-08-12T19:05:58.9692136Z 
2026-08-12T19:05:58.9693406Z PLAY [Configura Control-M] *****************************************************
2026-08-12T19:05:58.9729545Z 
2026-08-12T19:05:58.9729947Z PLAY [jboss] *******************************************************************
2026-08-12T19:05:58.9787004Z Wednesday 12 August 2026  16:05:58 -0300 (0:00:00.674)       0:00:01.024 ****** 
2026-08-12T19:06:00.0517827Z 
2026-08-12T19:06:00.0518455Z TASK [Gathering Facts] *********************************************************
2026-08-12T19:06:00.0518690Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-08-12T19:06:00.0784741Z Wednesday 12 August 2026  16:06:00 -0300 (0:00:01.099)       0:00:02.124 ****** 
2026-08-12T19:06:00.9256010Z 
2026-08-12T19:06:00.9257012Z TASK [satellite : Executar comando subscription-manager status] ****************
2026-08-12T19:06:00.9258019Z changed: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-08-12T19:06:00.9416530Z Wednesday 12 August 2026  16:06:00 -0300 (0:00:00.863)       0:00:02.987 ****** 
2026-08-12T19:06:01.0064916Z 
2026-08-12T19:06:01.0066080Z TASK [satellite : set_fact] ****************************************************
2026-08-12T19:06:01.0066303Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-08-12T19:06:01.0214956Z Wednesday 12 August 2026  16:06:01 -0300 (0:00:00.079)       0:00:03.067 ****** 
2026-08-12T19:06:01.0891713Z 
2026-08-12T19:06:01.0892893Z TASK [satellite : Extrair valor do status] *************************************
2026-08-12T19:06:01.0893141Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-08-12T19:06:01.1043337Z Wednesday 12 August 2026  16:06:01 -0300 (0:00:00.082)       0:00:03.150 ****** 
2026-08-12T19:06:01.1737290Z 
2026-08-12T19:06:01.1738086Z TASK [satellite : Exibir o valor do status] ************************************
2026-08-12T19:06:01.1739464Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br] => {
2026-08-12T19:06:01.1739715Z     "msg": [
2026-08-12T19:06:01.1740133Z         "É preciso registrar: False", 
2026-08-12T19:06:01.1740263Z         "", 
2026-08-12T19:06:01.1742630Z         {
2026-08-12T19:06:01.1745873Z             "changed": true, 
2026-08-12T19:06:01.1747999Z             "cmd": "subscription-manager identity", 
2026-08-12T19:06:01.1750002Z             "delta": "0:00:00.446428", 
2026-08-12T19:06:01.1752068Z             "end": "2026-08-12 16:06:00.907978", 
2026-08-12T19:06:01.1754251Z             "failed": false, 
2026-08-12T19:06:01.1755366Z             "rc": 0, 
2026-08-12T19:06:01.1755713Z             "start": "2026-08-12 16:06:00.461550", 
2026-08-12T19:06:01.1755998Z             "stderr": "", 
2026-08-12T19:06:01.1756287Z             "stderr_lines": [], 
2026-08-12T19:06:01.1756783Z             "stdout": "identidade do sistema: 8774f26f-d6ea-423a-8d16-111a39ce4808\nnome: caddeapllx2484.agil.nprd.caixa.gov.br\nnome da org: CEF\norg ID: CEF\nnome do ambiente: DEV/CV-RHEL-7", 
2026-08-12T19:06:01.1757241Z             "stdout_lines": [
2026-08-12T19:06:01.1757628Z                 "identidade do sistema: 8774f26f-d6ea-423a-8d16-111a39ce4808", 
2026-08-12T19:06:01.1757992Z                 "nome: caddeapllx2484.agil.nprd.caixa.gov.br", 
2026-08-12T19:06:01.1758273Z                 "nome da org: CEF", 
2026-08-12T19:06:01.1758535Z                 "org ID: CEF", 
2026-08-12T19:06:01.1758850Z                 "nome do ambiente: DEV/CV-RHEL-7"
2026-08-12T19:06:01.1759124Z             ]
2026-08-12T19:06:01.1759366Z         }
2026-08-12T19:06:01.1759610Z     ]
2026-08-12T19:06:01.1759855Z }
2026-08-12T19:06:01.1912128Z Wednesday 12 August 2026  16:06:01 -0300 (0:00:00.086)       0:00:03.236 ****** 
2026-08-12T19:06:01.2487549Z Wednesday 12 August 2026  16:06:01 -0300 (0:00:00.057)       0:00:03.294 ****** 
2026-08-12T19:06:01.3047223Z Wednesday 12 August 2026  16:06:01 -0300 (0:00:00.055)       0:00:03.350 ****** 
2026-08-12T19:06:03.5074605Z 
2026-08-12T19:06:03.5075913Z TASK [satellite : Execute subscription-manager repos Zabbix] *******************
2026-08-12T19:06:03.5079320Z fatal: [caddeapllx2484.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": "subscription-manager repos --enable=CEF_Zabbix_6_Redhat7_Zabbix_6_0_Redhat7", "delta": "0:00:01.933905", "end": "2026-08-12 16:06:03.489964", "msg": "non-zero return code", "rc": 1, "start": "2026-08-12 16:06:01.556059", "stderr": "", "stderr_lines": [], "stdout": "Erro: 'CEF_Zabbix_6_Redhat7_Zabbix_6_0_Redhat7' não corresponde a um ID de repositório válido. Use \"subscription-manager repos --list\" para ver os repositórios válidos.", "stdout_lines": ["Erro: 'CEF_Zabbix_6_Redhat7_Zabbix_6_0_Redhat7' não corresponde a um ID de repositório válido. Use \"subscription-manager repos --list\" para ver os repositórios válidos."]}
2026-08-12T19:06:03.5091708Z 
2026-08-12T19:06:03.5092369Z PLAY RECAP *********************************************************************
2026-08-12T19:06:03.5092638Z caddeapllx2484.agil.nprd.caixa.gov.br : ok=6    changed=1    unreachable=0    failed=1    skipped=2    rescued=0    ignored=0   
2026-08-12T19:06:03.5093191Z 
2026-08-12T19:06:03.5096853Z Wednesday 12 August 2026  16:06:03 -0300 (0:00:02.205)       0:00:05.555 ****** 
2026-08-12T19:06:03.5097267Z =============================================================================== 
2026-08-12T19:06:03.5097783Z satellite : Execute subscription-manager repos Zabbix ------------------- 2.21s
2026-08-12T19:06:03.5098299Z Gathering Facts --------------------------------------------------------- 1.10s
2026-08-12T19:06:03.5098602Z satellite : Executar comando subscription-manager status ---------------- 0.86s
2026-08-12T19:06:03.5098868Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.67s
2026-08-12T19:06:03.5101661Z satellite : Exibir o valor do status ------------------------------------ 0.09s
2026-08-12T19:06:03.5102138Z satellite : Extrair valor do status ------------------------------------- 0.08s
2026-08-12T19:06:03.5102548Z satellite : set_fact ---------------------------------------------------- 0.08s
2026-08-12T19:06:03.5102942Z satellite : Download RegistraSatellite-v5.sh ---------------------------- 0.06s
2026-08-12T19:06:03.5103514Z satellite : Execute RegistraSatellite-v5.sh ----------------------------- 0.06s
2026-08-12T19:06:03.5114821Z Playbook run took 0 days, 0 hours, 0 minutes, 5 seconds
2026-08-12T19:06:03.6333657Z ##[error]Bash exited with code '2'.
2026-08-12T19:06:03.6387195Z ##[section]Finishing: Cadastrar Servidor no Satellite



2026-08-12T19:08:09.0799276Z ##[section]Starting: Check Deployments [JBOSS]
2026-08-12T19:08:09.0802813Z ==============================================================================
2026-08-12T19:08:09.0802894Z Task         : Bash
2026-08-12T19:08:09.0802946Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-12T19:08:09.0803009Z Version      : 3.227.0
2026-08-12T19:08:09.0803060Z Author       : Microsoft Corporation
2026-08-12T19:08:09.0803110Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-12T19:08:09.0803181Z ==============================================================================
2026-08-12T19:08:09.8417393Z Generating script.
2026-08-12T19:08:09.8425350Z Script contents:
2026-08-12T19:08:09.8425940Z ansible-playbook /opt/ads-agent/_work/r15163/a/esteira-jboss-vm-v2/site.yml --tags check_deployments -e sistema_ambiente=des -e sistema_nome=sicmu-intranet-update -e site=ctc_nprd
2026-08-12T19:08:09.8429056Z ========================== Starting Command Output ===========================
2026-08-12T19:08:09.8444416Z [command]/bin/bash /opt/ads-agent/_work/_temp/21762260-e87f-4231-b5c6-0acc80d8e109.sh
2026-08-12T19:08:12.0899094Z 
2026-08-12T19:08:12.0899641Z PLAY [local] *******************************************************************
2026-08-12T19:08:12.1188727Z 
2026-08-12T19:08:12.1189226Z PLAY [Configurando o DNS] ******************************************************
2026-08-12T19:08:12.3175416Z 
2026-08-12T19:08:12.3176349Z PLAY [local] *******************************************************************
2026-08-12T19:08:12.3212400Z 
2026-08-12T19:08:12.3212955Z PLAY [Verificando serviços] ****************************************************
2026-08-12T19:08:12.3307712Z 
2026-08-12T19:08:12.3308389Z PLAY [Configuração LDAP] *******************************************************
2026-08-12T19:08:12.3353970Z [WARNING]: Found variable using reserved name: when
2026-08-12T19:08:12.3354077Z 
2026-08-12T19:08:12.3354232Z PLAY [jboss] *******************************************************************
2026-08-12T19:08:12.3446788Z 
2026-08-12T19:08:12.3447352Z PLAY [Stack Jboss] *************************************************************
2026-08-12T19:08:12.3698715Z Wednesday 12 August 2026  16:08:12 -0300 (0:00:00.342)       0:00:00.342 ****** 
2026-08-12T19:08:12.8948177Z 
2026-08-12T19:08:12.8948935Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-08-12T19:08:12.8949105Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-08-12T19:08:12.8965206Z 
2026-08-12T19:08:12.8965866Z PLAY [jboss] *******************************************************************
2026-08-12T19:08:12.9014140Z 
2026-08-12T19:08:12.9014618Z PLAY [jboss] *******************************************************************
2026-08-12T19:08:12.9059545Z 
2026-08-12T19:08:12.9060014Z PLAY [jboss] *******************************************************************
2026-08-12T19:08:12.9084879Z 
2026-08-12T19:08:12.9085425Z PLAY [Copiando deployments adicionais] *****************************************
2026-08-12T19:08:12.9114628Z 
2026-08-12T19:08:12.9115394Z PLAY [Copiando modules adicionais] *********************************************
2026-08-12T19:08:12.9143024Z 
2026-08-12T19:08:12.9143276Z PLAY [jboss] *******************************************************************
2026-08-12T19:08:12.9181582Z 
2026-08-12T19:08:12.9182030Z PLAY [jboss] *******************************************************************
2026-08-12T19:08:12.9209607Z 
2026-08-12T19:08:12.9210022Z PLAY [jboss] *******************************************************************
2026-08-12T19:08:12.9258478Z Wednesday 12 August 2026  16:08:12 -0300 (0:00:00.556)       0:00:00.898 ****** 
2026-08-12T19:08:13.3197325Z 
2026-08-12T19:08:13.3198298Z TASK [Wait for Jboss Management port] ******************************************
2026-08-12T19:08:13.3198667Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-08-12T19:08:13.3226559Z Wednesday 12 August 2026  16:08:13 -0300 (0:00:00.396)       0:00:01.295 ****** 
2026-08-12T19:08:13.9698215Z 
2026-08-12T19:08:13.9699270Z TASK [Check if Jboss is Running] ***********************************************
2026-08-12T19:08:13.9700055Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-08-12T19:08:13.9731971Z Wednesday 12 August 2026  16:08:13 -0300 (0:00:00.650)       0:00:01.945 ****** 
2026-08-12T19:08:14.4406404Z 
2026-08-12T19:08:14.4406891Z TASK [Check Deployment details looking for status OK] **************************
2026-08-12T19:08:14.4407108Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-08-12T19:08:14.4452815Z Wednesday 12 August 2026  16:08:14 -0300 (0:00:00.471)       0:00:02.417 ****** 
2026-08-12T19:08:14.8367641Z 
2026-08-12T19:08:14.8368557Z TASK [Procura pacotes deployados com falha] ************************************
2026-08-12T19:08:14.8369058Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-08-12T19:08:14.8396680Z Wednesday 12 August 2026  16:08:14 -0300 (0:00:00.394)       0:00:02.812 ****** 
2026-08-12T19:08:14.8988024Z 
2026-08-12T19:08:14.8989034Z TASK [Valida se existe pacotes com falha] **************************************
2026-08-12T19:08:14.8989437Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br] => {
2026-08-12T19:08:14.8989637Z     "changed": false, 
2026-08-12T19:08:14.8990191Z     "msg": "Não foram encontrados deployments com falha"
2026-08-12T19:08:14.8990628Z }
2026-08-12T19:08:14.9016724Z 
2026-08-12T19:08:14.9017259Z PLAY [jboss] *******************************************************************
2026-08-12T19:08:14.9047752Z 
2026-08-12T19:08:14.9048476Z PLAY [jboss] *******************************************************************
2026-08-12T19:08:14.9083233Z 
2026-08-12T19:08:14.9083594Z PLAY [local] *******************************************************************
2026-08-12T19:08:14.9107731Z [WARNING]: Could not match supplied host pattern, ignoring: instance_restart
2026-08-12T19:08:14.9110391Z 
2026-08-12T19:08:14.9110837Z PLAY [instance_restart] ********************************************************
2026-08-12T19:08:14.9111218Z skipping: no hosts matched
2026-08-12T19:08:14.9116491Z [WARNING]: Could not match supplied host pattern, ignoring: machine_reboot
2026-08-12T19:08:14.9119401Z 
2026-08-12T19:08:14.9119632Z PLAY [machine_reboot] **********************************************************
2026-08-12T19:08:14.9119996Z skipping: no hosts matched
2026-08-12T19:08:14.9126002Z 
2026-08-12T19:08:14.9126442Z PLAY [local] *******************************************************************
2026-08-12T19:08:14.9151862Z [WARNING]: Could not match supplied host pattern, ignoring: instance_stop
2026-08-12T19:08:14.9154671Z 
2026-08-12T19:08:14.9155169Z PLAY [instance_stop] ***********************************************************
2026-08-12T19:08:14.9155729Z skipping: no hosts matched
2026-08-12T19:08:14.9160382Z 
2026-08-12T19:08:14.9160873Z PLAY [machine_reboot] **********************************************************
2026-08-12T19:08:14.9161227Z skipping: no hosts matched
2026-08-12T19:08:14.9168028Z 
2026-08-12T19:08:14.9168493Z PLAY [Configura TSM] ***********************************************************
2026-08-12T19:08:14.9196492Z 
2026-08-12T19:08:14.9196957Z PLAY [jboss] *******************************************************************
2026-08-12T19:08:14.9226153Z 
2026-08-12T19:08:14.9226926Z PLAY [Configura Control-M] *****************************************************
2026-08-12T19:08:14.9263613Z 
2026-08-12T19:08:14.9264313Z PLAY [jboss] *******************************************************************
2026-08-12T19:08:14.9306711Z 
2026-08-12T19:08:14.9307108Z PLAY [jboss] *******************************************************************
2026-08-12T19:08:14.9332245Z 
2026-08-12T19:08:14.9333115Z PLAY [jboss] *******************************************************************
2026-08-12T19:08:14.9364664Z 
2026-08-12T19:08:14.9365103Z PLAY [localhost] ***************************************************************
2026-08-12T19:08:14.9389234Z 
2026-08-12T19:08:14.9389497Z PLAY [jboss] *******************************************************************
2026-08-12T19:08:14.9433503Z 
2026-08-12T19:08:14.9433867Z PLAY [jboss] *******************************************************************
2026-08-12T19:08:14.9472822Z 
2026-08-12T19:08:14.9474603Z PLAY [jboss] *******************************************************************
2026-08-12T19:08:14.9505487Z 
2026-08-12T19:08:14.9506006Z PLAY RECAP *********************************************************************
2026-08-12T19:08:14.9509033Z caddeapllx2484.agil.nprd.caixa.gov.br : ok=6    changed=0    unreachable=0    failed=0    skipped=0    rescued=0    ignored=0   
2026-08-12T19:08:14.9509180Z 
2026-08-12T19:08:14.9509560Z Wednesday 12 August 2026  16:08:14 -0300 (0:00:00.111)       0:00:02.923 ****** 
2026-08-12T19:08:14.9509757Z =============================================================================== 
2026-08-12T19:08:14.9510008Z Check if Jboss is Running ----------------------------------------------- 0.65s
2026-08-12T19:08:14.9510307Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.56s
2026-08-12T19:08:14.9510571Z Check Deployment details looking for status OK -------------------------- 0.47s
2026-08-12T19:08:14.9516907Z Wait for Jboss Management port ------------------------------------------ 0.40s
2026-08-12T19:08:14.9519800Z Procura pacotes deployados com falha ------------------------------------ 0.39s
2026-08-12T19:08:14.9520845Z Valida se existe pacotes com falha -------------------------------------- 0.11s
2026-08-12T19:08:14.9521227Z Playbook run took 0 days, 0 hours, 0 minutes, 2 seconds
2026-08-12T19:08:15.0220332Z ##[section]Finishing: Check Deployments [JBOSS]



2026-08-12T19:08:16.0209615Z ##[section]Starting: Resumo da release
2026-08-12T19:08:16.0212947Z ==============================================================================
2026-08-12T19:08:16.0213024Z Task         : Bash
2026-08-12T19:08:16.0213076Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-12T19:08:16.0213138Z Version      : 3.227.0
2026-08-12T19:08:16.0213191Z Author       : Microsoft Corporation
2026-08-12T19:08:16.0213241Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-12T19:08:16.0213313Z ==============================================================================
2026-08-12T19:08:16.9371292Z Generating script.
2026-08-12T19:08:16.9384324Z ========================== Starting Command Output ===========================
2026-08-12T19:08:16.9390614Z [command]/bin/bash /opt/ads-agent/_work/_temp/6d7335a2-8a4e-4f52-a0f5-b44605f8d4c7.sh
2026-08-12T19:08:16.9499038Z Foi realizado o deploy do pacote SICMU-ear-0.0.1-20260731.185324-4.ear no ambiente DES
2026-08-12T19:08:16.9499615Z APP Publicada nas URL: 
2026-08-12T19:08:16.9500482Z   - http://sicmu-intranet-update.esteiras.des.caixa,https://sicmu-intranet-update.esteiras.des.caixa/
2026-08-12T19:08:16.9500798Z   - http://sicmu-intranet-update.esteiras.des.caixa,https://sicmu-intranet-update.esteiras.des.caixa/sicmu
2026-08-12T19:08:16.9535866Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-08-12T19:08:16.9536123Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-08-12T19:08:16.9536195Z 
2026-08-12T19:08:17.9595163Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-08-12T19:08:18.9607010Z   0     0    0     0    0     0      0      0 --:--:--  0:00:01 --:--:--     0
2026-08-12T19:08:19.9548687Z   0     0    0     0    0     0      0      0 --:--:--  0:00:02 --:--:--     0
2026-08-12T19:08:19.9549784Z   0     0    0     0    0     0      0      0 --:--:--  0:00:03 --:--:--     0
2026-08-12T19:08:19.9550369Z Warning: Transient problem: timeout Will retry in 1 seconds. 5 retries left.
2026-08-12T19:08:20.9561854Z 
2026-08-12T19:08:21.9584936Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-08-12T19:08:22.9597071Z   0     0    0     0    0     0      0      0 --:--:--  0:00:01 --:--:--     0
2026-08-12T19:08:23.9579318Z   0     0    0     0    0     0      0      0 --:--:--  0:00:02 --:--:--     0
2026-08-12T19:08:23.9579681Z   0     0    0     0    0     0      0      0 --:--:--  0:00:03 --:--:--     0
2026-08-12T19:08:23.9579851Z Warning: Transient problem: timeout Will retry in 2 seconds. 4 retries left.
2026-08-12T19:08:25.9602205Z 
2026-08-12T19:08:26.9624257Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-08-12T19:08:27.9636853Z   0     0    0     0    0     0      0      0 --:--:--  0:00:01 --:--:--     0
2026-08-12T19:08:28.9618859Z   0     0    0     0    0     0      0      0 --:--:--  0:00:02 --:--:--     0
2026-08-12T19:08:28.9619975Z   0     0    0     0    0     0      0      0 --:--:--  0:00:03 --:--:--     0
2026-08-12T19:08:28.9620878Z Warning: Transient problem: timeout Will retry in 4 seconds. 3 retries left.
2026-08-12T19:08:32.9660726Z 
2026-08-12T19:08:33.9673402Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-08-12T19:08:34.9683954Z   0     0    0     0    0     0      0      0 --:--:--  0:00:01 --:--:--     0
2026-08-12T19:08:35.9676362Z   0     0    0     0    0     0      0      0 --:--:--  0:00:02 --:--:--     0
2026-08-12T19:08:35.9676710Z   0     0    0     0    0     0      0      0 --:--:--  0:00:03 --:--:--     0
2026-08-12T19:08:35.9678697Z Warning: Transient problem: timeout Will retry in 8 seconds. 2 retries left.
2026-08-12T19:08:43.9759489Z 
2026-08-12T19:08:44.9782498Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-08-12T19:08:45.9794419Z   0     0    0     0    0     0      0      0 --:--:--  0:00:01 --:--:--     0
2026-08-12T19:08:46.9775457Z   0     0    0     0    0     0      0      0 --:--:--  0:00:02 --:--:--     0
2026-08-12T19:08:46.9776611Z   0     0    0     0    0     0      0      0 --:--:--  0:00:03 --:--:--     0
2026-08-12T19:08:46.9777247Z Warning: Transient problem: timeout Will retry in 16 seconds. 1 retries left.
2026-08-12T19:09:02.9893293Z 
2026-08-12T19:09:03.9908550Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-08-12T19:09:04.9919370Z   0     0    0     0    0     0      0      0 --:--:--  0:00:01 --:--:--     0
2026-08-12T19:09:05.9913612Z   0     0    0     0    0     0      0      0 --:--:--  0:00:02 --:--:--     0
2026-08-12T19:09:05.9914472Z   0     0    0     0    0     0      0      0 --:--:--  0:00:03 --:--:--     0
2026-08-12T19:09:05.9915071Z curl: (28) Connection timed out after 3001 milliseconds
2026-08-12T19:09:05.9915303Z curl: (3) [globbing] unmatched close brace/bracket at pos 78
2026-08-12T19:09:05.9977394Z Ocorreu um erro ao atualizar a url da aplicação na API InfraDevops
2026-08-12T19:09:05.9977601Z 000
2026-08-12T19:09:05.9991065Z ##[section]Finishing: Resumo da release




Last login: Mon Aug 24 11:50:45 2026 from 10.122.150.31
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ hostname
caddeapllx2484.agil.nprd.caixa.gov.br
-sh-4.2$
-sh-4.2$
-sh-4.2$



