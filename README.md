2026-11-25T14:25:58.8288307Z ##[section]Starting: Terraform apply
2026-11-25T14:25:58.8291768Z ==============================================================================
2026-11-25T14:25:58.8291864Z Task         : Bash
2026-11-25T14:25:58.8291907Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-25T14:25:58.8291969Z Version      : 3.227.0
2026-11-25T14:25:58.8292033Z Author       : Microsoft Corporation
2026-11-25T14:25:58.8292081Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-25T14:25:58.8292149Z ==============================================================================
2026-11-25T14:25:59.6198862Z Generating script.
2026-11-25T14:25:59.6209880Z ========================== Starting Command Output ===========================
2026-11-25T14:25:59.6217222Z [command]/bin/bash /opt/ads-agent/_work/_temp/23b9f128-c6bc-4abf-95b5-1e9d5ab878b3.sh
2026-11-25T14:26:01.1411131Z data.vsphere_folder.folder: Reading...
2026-11-25T14:26:01.1411761Z data.vsphere_datacenter.dc: Reading...
2026-11-25T14:26:01.1412317Z data.vsphere_tag_category.addr: Reading...
2026-11-25T14:26:01.1479615Z data.vsphere_folder.folder: Read complete after 0s [id=group-v22]
2026-11-25T14:26:01.6005485Z data.vsphere_datacenter.dc: Read complete after 1s [id=datacenter-21]
2026-11-25T14:26:01.6857355Z data.vsphere_tag_category.addr: Read complete after 1s [id=urn:vmomi:InventoryServiceCategory:40fbf91f-3227-40d6-9785-a481d122536e:GLOBAL]
2026-11-25T14:26:01.6868366Z data.external.consulta_tag: Reading...
2026-11-25T14:26:01.8313400Z data.vsphere_network.network_bck_1: Reading...
2026-11-25T14:26:01.8322849Z data.vsphere_compute_cluster.cluster: Reading...
2026-11-25T14:26:01.8324044Z data.vsphere_network.network: Reading...
2026-11-25T14:26:01.8326255Z data.vsphere_datastore.datastore: Reading...
2026-11-25T14:26:01.8334503Z data.vsphere_network.network_bck: Reading...
2026-11-25T14:26:01.8334818Z data.vsphere_virtual_machine.template: Reading...
2026-11-25T14:26:01.8345392Z data.vsphere_resource_pool.pool: Reading...
2026-11-25T14:26:01.8792050Z data.vsphere_resource_pool.pool: Read complete after 0s [id=resgroup-1062077]
2026-11-25T14:26:01.8792430Z data.vsphere_network.network_bck_1: Read complete after 0s [id=dvportgroup-1065714]
2026-11-25T14:26:01.8792695Z data.vsphere_network.network_bck: Read complete after 0s [id=dvportgroup-72342]
2026-11-25T14:26:01.8792930Z data.vsphere_network.network: Read complete after 0s [id=dvportgroup-68733]
2026-11-25T14:26:01.8803455Z data.vsphere_compute_cluster.cluster: Read complete after 0s [id=domain-c710514]
2026-11-25T14:26:01.9039323Z data.vsphere_datastore.datastore: Read complete after 0s [id=datastore-770300]
2026-11-25T14:26:03.0368627Z data.vsphere_virtual_machine.template: Read complete after 1s [id=42234b41-c23e-3e5d-f2cf-c4303c4eb71e]
2026-11-25T14:26:06.9116626Z data.external.consulta_tag: Read complete after 5s [id=-]
2026-11-25T14:26:07.2090165Z 
2026-11-25T14:26:07.2090850Z Terraform used the selected providers to generate the following execution
2026-11-25T14:26:07.2091057Z plan. Resource actions are indicated with the following symbols:
2026-11-25T14:26:07.2091190Z   + create
2026-11-25T14:26:07.2091227Z 
2026-11-25T14:26:07.2091344Z Terraform will perform the following actions:
2026-11-25T14:26:07.2091395Z 
2026-11-25T14:26:07.2188588Z   # vsphere_virtual_machine.vm["caddeapllx2871.agil.nprd.caixa.gov.br"] will be created
2026-11-25T14:26:07.2188760Z   + resource "vsphere_virtual_machine" "vm" {
2026-11-25T14:26:07.2189316Z       + annotation                              = "Provisionado via automação : Terraform/Packer - Esteiras Ageis - SIGEC-PORTABILIDADE-ONLINE-DES - Template: eap74-openjdk17-apache24-rhel93-v012 - caddeapllx2871.agil.nprd.caixa.gov.br"
2026-11-25T14:26:07.2189594Z       + boot_retry_delay                        = 10000
2026-11-25T14:26:07.2189705Z       + change_version                          = (known after apply)
2026-11-25T14:26:07.2189825Z       + cpu_limit                               = -1
2026-11-25T14:26:07.2190024Z       + cpu_share_count                         = (known after apply)
2026-11-25T14:26:07.2190490Z       + cpu_share_level                         = "normal"
2026-11-25T14:26:07.2191029Z       + datastore_id                            = "datastore-770300"
2026-11-25T14:26:07.2191179Z       + default_ip_address                      = (known after apply)
2026-11-25T14:26:07.2191311Z       + ept_rvi_mode                            = (known after apply)
2026-11-25T14:26:07.2191425Z       + extra_config                            = {
2026-11-25T14:26:07.2191539Z           + "default_ip"                 = "10.116.202.61"
2026-11-25T14:26:07.2191644Z           + "default_password"           = (sensitive value)
2026-11-25T14:26:07.2191781Z           + "default_satellite_password" = (sensitive value)
2026-11-25T14:26:07.2191912Z           + "default_satellite_url"      = (sensitive value)
2026-11-25T14:26:07.2192039Z           + "default_satellite_user"     = (sensitive value)
2026-11-25T14:26:07.2192246Z           + "default_user"               = (sensitive value)
2026-11-25T14:26:07.2192350Z         }
2026-11-25T14:26:07.2192462Z       + extra_config_reboot_required            = true
2026-11-25T14:26:07.2192649Z       + firmware                                = "bios"
2026-11-25T14:26:07.2192767Z       + force_power_off                         = true
2026-11-25T14:26:07.2192885Z       + guest_id                                = "rhel9_64Guest"
2026-11-25T14:26:07.2193005Z       + guest_ip_addresses                      = (known after apply)
2026-11-25T14:26:07.2193116Z       + hardware_version                        = (known after apply)
2026-11-25T14:26:07.2193241Z       + host_system_id                          = (known after apply)
2026-11-25T14:26:07.2193363Z       + hv_mode                                 = (known after apply)
2026-11-25T14:26:07.2193477Z       + id                                      = (known after apply)
2026-11-25T14:26:07.2193571Z       + ide_controller_count                    = 2
2026-11-25T14:26:07.2193695Z       + imported                                = (known after apply)
2026-11-25T14:26:07.2193815Z       + latency_sensitivity                     = "normal"
2026-11-25T14:26:07.2193929Z       + memory                                  = 4096
2026-11-25T14:26:07.2194032Z       + memory_limit                            = -1
2026-11-25T14:26:07.2194131Z       + memory_share_count                      = (known after apply)
2026-11-25T14:26:07.2194254Z       + memory_share_level                      = "normal"
2026-11-25T14:26:07.2194368Z       + migrate_wait_timeout                    = 30
2026-11-25T14:26:07.2194483Z       + moid                                    = (known after apply)
2026-11-25T14:26:07.2194580Z       + name                                    = "CADDEAPLLX2871"
2026-11-25T14:26:07.2194693Z       + num_cores_per_socket                    = 1
2026-11-25T14:26:07.2194799Z       + num_cpus                                = 2
2026-11-25T14:26:07.2194909Z       + nvme_controller_count                   = 0
2026-11-25T14:26:07.2195111Z       + power_state                             = (known after apply)
2026-11-25T14:26:07.2195238Z       + poweron_timeout                         = 300
2026-11-25T14:26:07.2195358Z       + reboot_required                         = (known after apply)
2026-11-25T14:26:07.2195545Z       + resource_pool_id                        = "resgroup-1062077"
2026-11-25T14:26:07.2195673Z       + run_tools_scripts_after_power_on        = true
2026-11-25T14:26:07.2195781Z       + run_tools_scripts_after_resume          = true
2026-11-25T14:26:07.2195919Z       + run_tools_scripts_before_guest_shutdown = true
2026-11-25T14:26:07.2196044Z       + run_tools_scripts_before_guest_standby  = true
2026-11-25T14:26:07.2196162Z       + sata_controller_count                   = 0
2026-11-25T14:26:07.2196260Z       + scsi_bus_sharing                        = "noSharing"
2026-11-25T14:26:07.2196377Z       + scsi_controller_count                   = 1
2026-11-25T14:26:07.2196492Z       + scsi_type                               = "pvscsi"
2026-11-25T14:26:07.2196670Z       + shutdown_wait_timeout                   = 3
2026-11-25T14:26:07.2196793Z       + storage_policy_id                       = (known after apply)
2026-11-25T14:26:07.2196900Z       + swap_placement_policy                   = "inherit"
2026-11-25T14:26:07.2197019Z       + sync_time_with_host                     = true
2026-11-25T14:26:07.2197134Z       + tools_upgrade_policy                    = "manual"
2026-11-25T14:26:07.2197252Z       + uuid                                    = (known after apply)
2026-11-25T14:26:07.2197352Z       + vapp_transport                          = (known after apply)
2026-11-25T14:26:07.2197475Z       + vmware_tools_status                     = (known after apply)
2026-11-25T14:26:07.2197598Z       + vmx_path                                = (known after apply)
2026-11-25T14:26:07.2197714Z       + wait_for_guest_ip_timeout               = 0
2026-11-25T14:26:07.2197858Z       + wait_for_guest_net_routable             = true
2026-11-25T14:26:07.2197976Z       + wait_for_guest_net_timeout              = 5
2026-11-25T14:26:07.2198035Z 
2026-11-25T14:26:07.2198109Z       + clone {
2026-11-25T14:26:07.2198294Z           + template_uuid = "42234b41-c23e-3e5d-f2cf-c4303c4eb71e"
2026-11-25T14:26:07.2198414Z           + timeout       = 30
2026-11-25T14:26:07.2198453Z 
2026-11-25T14:26:07.2198543Z           + customize {
2026-11-25T14:26:07.2198646Z               + dns_server_list = [
2026-11-25T14:26:07.2198738Z                   + "10.116.193.77",
2026-11-25T14:26:07.2198841Z                   + "10.116.193.78",
2026-11-25T14:26:07.2198938Z                 ]
2026-11-25T14:26:07.2199039Z               + ipv4_gateway    = "10.116.192.1"
2026-11-25T14:26:07.2199133Z               + timeout         = 10
2026-11-25T14:26:07.2199186Z 
2026-11-25T14:26:07.2199263Z               + linux_options {
2026-11-25T14:26:07.2199378Z                   + domain       = "agil.nprd.caixa.gov.br"
2026-11-25T14:26:07.2199503Z                   + host_name    = "caddeapllx2871"
2026-11-25T14:26:07.2199614Z                   + hw_clock_utc = true
2026-11-25T14:26:07.2199696Z                 }
2026-11-25T14:26:07.2199740Z 
2026-11-25T14:26:07.2199822Z               + network_interface {
2026-11-25T14:26:07.2199930Z                   + ipv4_address = "10.116.202.61"
2026-11-25T14:26:07.2200042Z                   + ipv4_netmask = 19
2026-11-25T14:26:07.2200135Z                 }
2026-11-25T14:26:07.2200207Z             }
2026-11-25T14:26:07.2200293Z         }
2026-11-25T14:26:07.2200333Z 
2026-11-25T14:26:07.2200458Z       + disk {
2026-11-25T14:26:07.2200616Z           + attach            = false
2026-11-25T14:26:07.2200770Z           + controller_type   = "scsi"
2026-11-25T14:26:07.2200922Z           + datastore_id      = "datastore-770300"
2026-11-25T14:26:07.2201043Z           + device_address    = (known after apply)
2026-11-25T14:26:07.2201153Z           + disk_mode         = "persistent"
2026-11-25T14:26:07.2201267Z           + disk_sharing      = "sharingNone"
2026-11-25T14:26:07.2201363Z           + eagerly_scrub     = false
2026-11-25T14:26:07.2201466Z           + io_limit          = -1
2026-11-25T14:26:07.2201578Z           + io_reservation    = 0
2026-11-25T14:26:07.2201680Z           + io_share_count    = 0
2026-11-25T14:26:07.2201771Z           + io_share_level    = "normal"
2026-11-25T14:26:07.2201878Z           + keep_on_remove    = false
2026-11-25T14:26:07.2201979Z           + key               = 0
2026-11-25T14:26:07.2202085Z           + label             = "disk0"
2026-11-25T14:26:07.2202193Z           + path              = (known after apply)
2026-11-25T14:26:07.2202282Z           + size              = 32
2026-11-25T14:26:07.2202390Z           + storage_policy_id = (known after apply)
2026-11-25T14:26:07.2202502Z           + thin_provisioned  = true
2026-11-25T14:26:07.2202605Z           + unit_number       = 0
2026-11-25T14:26:07.2202694Z           + uuid              = (known after apply)
2026-11-25T14:26:07.2202799Z           + write_through     = false
2026-11-25T14:26:07.2202939Z         }
2026-11-25T14:26:07.2203030Z       + disk {
2026-11-25T14:26:07.2203112Z           + attach            = false
2026-11-25T14:26:07.2203225Z           + controller_type   = "scsi"
2026-11-25T14:26:07.2203389Z           + datastore_id      = "datastore-770300"
2026-11-25T14:26:07.2203511Z           + device_address    = (known after apply)
2026-11-25T14:26:07.2203609Z           + disk_mode         = "persistent"
2026-11-25T14:26:07.2203720Z           + disk_sharing      = "sharingNone"
2026-11-25T14:26:07.2203826Z           + eagerly_scrub     = false
2026-11-25T14:26:07.2203927Z           + io_limit          = -1
2026-11-25T14:26:07.2204012Z           + io_reservation    = 0
2026-11-25T14:26:07.2204113Z           + io_share_count    = 0
2026-11-25T14:26:07.2204219Z           + io_share_level    = "normal"
2026-11-25T14:26:07.2204323Z           + keep_on_remove    = false
2026-11-25T14:26:07.2204500Z           + key               = 0
2026-11-25T14:26:07.2204602Z           + label             = "disk1"
2026-11-25T14:26:07.2204708Z           + path              = (known after apply)
2026-11-25T14:26:07.2204808Z           + size              = 1
2026-11-25T14:26:07.2204901Z           + storage_policy_id = (known after apply)
2026-11-25T14:26:07.2205087Z           + thin_provisioned  = true
2026-11-25T14:26:07.2205197Z           + unit_number       = 2
2026-11-25T14:26:07.2205297Z           + uuid              = (known after apply)
2026-11-25T14:26:07.2205390Z           + write_through     = false
2026-11-25T14:26:07.2205482Z         }
2026-11-25T14:26:07.2205514Z 
2026-11-25T14:26:07.2205608Z       + network_interface {
2026-11-25T14:26:07.2205717Z           + adapter_type          = "vmxnet3"
2026-11-25T14:26:07.2205827Z           + bandwidth_limit       = -1
2026-11-25T14:26:07.2205918Z           + bandwidth_reservation = 0
2026-11-25T14:26:07.2206035Z           + bandwidth_share_count = (known after apply)
2026-11-25T14:26:07.2206159Z           + bandwidth_share_level = "normal"
2026-11-25T14:26:07.2206280Z           + device_address        = (known after apply)
2026-11-25T14:26:07.2206406Z           + key                   = (known after apply)
2026-11-25T14:26:07.2206504Z           + mac_address           = (known after apply)
2026-11-25T14:26:07.2206686Z           + network_id            = "dvportgroup-68733"
2026-11-25T14:26:07.2206788Z         }
2026-11-25T14:26:07.2206875Z     }
2026-11-25T14:26:07.2206906Z 
2026-11-25T14:26:07.2207010Z Plan: 1 to add, 0 to change, 0 to destroy.
2026-11-25T14:26:07.2207058Z 
2026-11-25T14:26:07.2207150Z Changes to Outputs:
2026-11-25T14:26:07.2207241Z   + log_consulta_tag = <<-EOT
2026-11-25T14:26:07.2207351Z         Response: <Response [201]>
2026-11-25T14:26:07.2207523Z         Autenticação realizada com sucesso v-center
2026-11-25T14:26:07.2207644Z         Response: <Response [200]>
2026-11-25T14:26:07.2207826Z          Headers:  {'vmware-api-session-id': '5b7d802e0fe16fbc2e22eac7a8550a4a'}
2026-11-25T14:26:07.2207971Z         Url Vcenter: 10.122.144.195
2026-11-25T14:26:07.2208085Z         Total de Categorias encontradas: 495
2026-11-25T14:26:07.2208205Z         Total de itens verificados: 495
2026-11-25T14:26:07.2208369Z         Sistema não encontrada na categoria ADDR
2026-11-25T14:26:07.2208461Z     EOT
2026-11-25T14:26:07.2208509Z 
2026-11-25T14:26:07.2210587Z ─────────────────────────────────────────────────────────────────────────────
2026-11-25T14:26:07.2210702Z 
2026-11-25T14:26:07.2210804Z Saved the plan to: tfplan.binary
2026-11-25T14:26:07.2210863Z 
2026-11-25T14:26:07.2210974Z To perform exactly these actions, run the following command to apply:
2026-11-25T14:26:07.2211114Z     terraform apply "tfplan.binary"
2026-11-25T14:26:08.4434176Z Recursos serão alterados. Abrindo mudança de HSI!
2026-11-25T14:27:17.6729552Z 
2026-11-25T14:27:17.6730617Z PLAY [Mudança de HSI] **********************************************************
2026-11-25T14:27:17.6990282Z Wednesday 25 November 2026  11:27:17 -0300 (0:00:00.089)       0:00:00.089 **** 
2026-11-25T14:27:49.0829381Z 
2026-11-25T14:27:49.0831785Z TASK [Gathering Facts] *********************************************************
2026-11-25T14:27:49.0832144Z ok: [localhost]
2026-11-25T14:27:49.1152847Z Wednesday 25 November 2026  11:27:49 -0300 (0:00:31.416)       0:00:31.506 **** 
2026-11-25T14:27:49.7216093Z 
2026-11-25T14:27:49.7217027Z TASK [Lendo arquivo tfplan.txt] ************************************************
2026-11-25T14:27:49.7217261Z ok: [localhost]
2026-11-25T14:27:49.7450111Z Wednesday 25 November 2026  11:27:49 -0300 (0:00:00.629)       0:00:32.135 **** 
2026-11-25T14:27:49.8468523Z 
2026-11-25T14:27:49.8469012Z TASK [Decodiciar conteudo do arquivo] ******************************************
2026-11-25T14:27:49.8469196Z ok: [localhost]
2026-11-25T14:27:49.8706450Z Wednesday 25 November 2026  11:27:49 -0300 (0:00:00.126)       0:00:32.261 **** 
2026-11-25T14:27:49.9542319Z 
2026-11-25T14:27:49.9543403Z TASK [Definindo variáveis de horários] *****************************************
2026-11-25T14:27:49.9543551Z ok: [localhost]
2026-11-25T14:27:49.9773997Z Wednesday 25 November 2026  11:27:49 -0300 (0:00:00.106)       0:00:32.368 **** 
2026-11-25T14:27:52.2000268Z 
2026-11-25T14:27:52.2000988Z TASK [Registrando Mudança de HSI] **********************************************
2026-11-25T14:27:52.2001139Z ok: [localhost]
2026-11-25T14:27:52.2226470Z Wednesday 25 November 2026  11:27:52 -0300 (0:00:02.245)       0:00:34.613 **** 
2026-11-25T14:27:52.3086744Z 
2026-11-25T14:27:52.3087971Z TASK [Mudança criada] **********************************************************
2026-11-25T14:27:52.3088218Z ok: [localhost] => {
2026-11-25T14:27:52.3088395Z     "msg": "Criado a Mudança de número: CRQ000001543807"
2026-11-25T14:27:52.3099210Z }
2026-11-25T14:27:52.3099278Z 
2026-11-25T14:27:52.3099422Z PLAY RECAP *********************************************************************
2026-11-25T14:27:52.3099620Z localhost                  : ok=6    changed=0    unreachable=0    failed=0    skipped=0    rescued=0    ignored=0   
2026-11-25T14:27:52.3099702Z 
2026-11-25T14:27:52.3100159Z Wednesday 25 November 2026  11:27:52 -0300 (0:00:00.087)       0:00:34.701 **** 
2026-11-25T14:27:52.3100397Z =============================================================================== 
2026-11-25T14:27:52.3100668Z Gathering Facts -------------------------------------------------------- 31.42s
2026-11-25T14:27:52.3100924Z Registrando Mudança de HSI ---------------------------------------------- 2.25s
2026-11-25T14:27:52.3101149Z Lendo arquivo tfplan.txt ------------------------------------------------ 0.63s
2026-11-25T14:27:52.3101426Z Decodiciar conteudo do arquivo ------------------------------------------ 0.13s
2026-11-25T14:27:52.3101648Z Definindo variáveis de horários ----------------------------------------- 0.11s
2026-11-25T14:27:52.3101921Z Mudança criada ---------------------------------------------------------- 0.09s
2026-11-25T14:27:52.3102076Z Playbook run took 0 days, 0 hours, 0 minutes, 34 seconds
2026-11-25T14:27:53.8150987Z data.vsphere_folder.folder: Reading...
2026-11-25T14:27:53.8151718Z data.vsphere_datacenter.dc: Reading...
2026-11-25T14:27:53.8151929Z data.vsphere_tag_category.addr: Reading...
2026-11-25T14:27:53.8216898Z data.vsphere_folder.folder: Read complete after 0s [id=group-v22]
2026-11-25T14:27:54.1688373Z data.vsphere_datacenter.dc: Read complete after 0s [id=datacenter-21]
2026-11-25T14:27:54.1697817Z data.vsphere_tag_category.addr: Read complete after 0s [id=urn:vmomi:InventoryServiceCategory:40fbf91f-3227-40d6-9785-a481d122536e:GLOBAL]
2026-11-25T14:27:54.1715432Z data.external.consulta_tag: Reading...
2026-11-25T14:27:54.4033753Z data.vsphere_resource_pool.pool: Reading...
2026-11-25T14:27:54.4034054Z data.vsphere_network.network_bck: Reading...
2026-11-25T14:27:54.4039576Z data.vsphere_network.network_bck_1: Reading...
2026-11-25T14:27:54.4043425Z data.vsphere_datastore.datastore: Reading...
2026-11-25T14:27:54.4056802Z data.vsphere_compute_cluster.cluster: Reading...
2026-11-25T14:27:54.4057292Z data.vsphere_network.network: Reading...
2026-11-25T14:27:54.4078108Z data.vsphere_virtual_machine.template: Reading...
2026-11-25T14:27:54.4309898Z data.vsphere_resource_pool.pool: Read complete after 0s [id=resgroup-1062077]
2026-11-25T14:27:54.4310215Z data.vsphere_network.network: Read complete after 0s [id=dvportgroup-68733]
2026-11-25T14:27:54.4331196Z data.vsphere_network.network_bck: Read complete after 0s [id=dvportgroup-72342]
2026-11-25T14:27:54.4343477Z data.vsphere_network.network_bck_1: Read complete after 0s [id=dvportgroup-1065714]
2026-11-25T14:27:54.4430950Z data.vsphere_compute_cluster.cluster: Read complete after 0s [id=domain-c710514]
2026-11-25T14:27:54.4572862Z data.vsphere_datastore.datastore: Read complete after 0s [id=datastore-770300]
2026-11-25T14:27:55.7878249Z data.vsphere_virtual_machine.template: Read complete after 2s [id=42234b41-c23e-3e5d-f2cf-c4303c4eb71e]
2026-11-25T14:27:59.3873970Z data.external.consulta_tag: Read complete after 5s [id=-]
2026-11-25T14:27:59.6691047Z 
2026-11-25T14:27:59.6691577Z Terraform used the selected providers to generate the following execution
2026-11-25T14:27:59.6691813Z plan. Resource actions are indicated with the following symbols:
2026-11-25T14:27:59.6691935Z   + create
2026-11-25T14:27:59.6691971Z 
2026-11-25T14:27:59.6692158Z Terraform will perform the following actions:
2026-11-25T14:27:59.6694900Z 
2026-11-25T14:27:59.6802858Z   # vsphere_virtual_machine.vm["caddeapllx2871.agil.nprd.caixa.gov.br"] will be created
2026-11-25T14:27:59.6803072Z   + resource "vsphere_virtual_machine" "vm" {
2026-11-25T14:27:59.6803578Z       + annotation                              = "Provisionado via automação : Terraform/Packer - Esteiras Ageis - SIGEC-PORTABILIDADE-ONLINE-DES - Template: eap74-openjdk17-apache24-rhel93-v012 - caddeapllx2871.agil.nprd.caixa.gov.br"
2026-11-25T14:27:59.6803870Z       + boot_retry_delay                        = 10000
2026-11-25T14:27:59.6804016Z       + change_version                          = (known after apply)
2026-11-25T14:27:59.6804135Z       + cpu_limit                               = -1
2026-11-25T14:27:59.6804252Z       + cpu_share_count                         = (known after apply)
2026-11-25T14:27:59.6804372Z       + cpu_share_level                         = "normal"
2026-11-25T14:27:59.6804556Z       + datastore_id                            = "datastore-770300"
2026-11-25T14:27:59.6804682Z       + default_ip_address                      = (known after apply)
2026-11-25T14:27:59.6804792Z       + ept_rvi_mode                            = (known after apply)
2026-11-25T14:27:59.6804902Z       + extra_config                            = {
2026-11-25T14:27:59.6805089Z           + "default_ip"                 = "10.116.202.61"
2026-11-25T14:27:59.6805218Z           + "default_password"           = (sensitive value)
2026-11-25T14:27:59.6805333Z           + "default_satellite_password" = (sensitive value)
2026-11-25T14:27:59.6805463Z           + "default_satellite_url"      = (sensitive value)
2026-11-25T14:27:59.6805587Z           + "default_satellite_user"     = (sensitive value)
2026-11-25T14:27:59.6805709Z           + "default_user"               = (sensitive value)
2026-11-25T14:27:59.6805793Z         }
2026-11-25T14:27:59.6805901Z       + extra_config_reboot_required            = true
2026-11-25T14:27:59.6806010Z       + firmware                                = "bios"
2026-11-25T14:27:59.6806115Z       + force_power_off                         = true
2026-11-25T14:27:59.6806317Z       + guest_id                                = "rhel9_64Guest"
2026-11-25T14:27:59.6806442Z       + guest_ip_addresses                      = (known after apply)
2026-11-25T14:27:59.6806565Z       + hardware_version                        = (known after apply)
2026-11-25T14:27:59.6806686Z       + host_system_id                          = (known after apply)
2026-11-25T14:27:59.6806799Z       + hv_mode                                 = (known after apply)
2026-11-25T14:27:59.6806903Z       + id                                      = (known after apply)
2026-11-25T14:27:59.6807299Z       + ide_controller_count                    = 2
2026-11-25T14:27:59.6807411Z       + imported                                = (known after apply)
2026-11-25T14:27:59.6807523Z       + latency_sensitivity                     = "normal"
2026-11-25T14:27:59.6807637Z       + memory                                  = 4096
2026-11-25T14:27:59.6807728Z       + memory_limit                            = -1
2026-11-25T14:27:59.6807843Z       + memory_share_count                      = (known after apply)
2026-11-25T14:27:59.6807962Z       + memory_share_level                      = "normal"
2026-11-25T14:27:59.6808073Z       + migrate_wait_timeout                    = 30
2026-11-25T14:27:59.6808173Z       + moid                                    = (known after apply)
2026-11-25T14:27:59.6808282Z       + name                                    = "CADDEAPLLX2871"
2026-11-25T14:27:59.6808448Z       + num_cores_per_socket                    = 1
2026-11-25T14:27:59.6808552Z       + num_cpus                                = 2
2026-11-25T14:27:59.6808652Z       + nvme_controller_count                   = 0
2026-11-25T14:27:59.6808750Z       + power_state                             = (known after apply)
2026-11-25T14:27:59.6808858Z       + poweron_timeout                         = 300
2026-11-25T14:27:59.6816133Z       + reboot_required                         = (known after apply)
2026-11-25T14:27:59.6816611Z       + resource_pool_id                        = "resgroup-1062077"
2026-11-25T14:27:59.6816820Z       + run_tools_scripts_after_power_on        = true
2026-11-25T14:27:59.6816998Z       + run_tools_scripts_after_resume          = true
2026-11-25T14:27:59.6817205Z       + run_tools_scripts_before_guest_shutdown = true
2026-11-25T14:27:59.6817404Z       + run_tools_scripts_before_guest_standby  = true
2026-11-25T14:27:59.6817897Z       + sata_controller_count                   = 0
2026-11-25T14:27:59.6818094Z       + scsi_bus_sharing                        = "noSharing"
2026-11-25T14:27:59.6818539Z       + scsi_controller_count                   = 1
2026-11-25T14:27:59.6818758Z       + scsi_type                               = "pvscsi"
2026-11-25T14:27:59.6818937Z       + shutdown_wait_timeout                   = 3
2026-11-25T14:27:59.6819117Z       + storage_policy_id                       = (known after apply)
2026-11-25T14:27:59.6819304Z       + swap_placement_policy                   = "inherit"
2026-11-25T14:27:59.6819462Z       + sync_time_with_host                     = true
2026-11-25T14:27:59.6819819Z       + tools_upgrade_policy                    = "manual"
2026-11-25T14:27:59.6819996Z       + uuid                                    = (known after apply)
2026-11-25T14:27:59.6820175Z       + vapp_transport                          = (known after apply)
2026-11-25T14:27:59.6820356Z       + vmware_tools_status                     = (known after apply)
2026-11-25T14:27:59.6820537Z       + vmx_path                                = (known after apply)
2026-11-25T14:27:59.6820706Z       + wait_for_guest_ip_timeout               = 0
2026-11-25T14:27:59.6820883Z       + wait_for_guest_net_routable             = true
2026-11-25T14:27:59.6821043Z       + wait_for_guest_net_timeout              = 5
2026-11-25T14:27:59.6821100Z 
2026-11-25T14:27:59.6821187Z       + clone {
2026-11-25T14:27:59.6821379Z           + template_uuid = "42234b41-c23e-3e5d-f2cf-c4303c4eb71e"
2026-11-25T14:27:59.6821498Z           + timeout       = 30
2026-11-25T14:27:59.6821535Z 
2026-11-25T14:27:59.6821623Z           + customize {
2026-11-25T14:27:59.6821720Z               + dns_server_list = [
2026-11-25T14:27:59.6821822Z                   + "10.116.193.77",
2026-11-25T14:27:59.6821911Z                   + "10.116.193.78",
2026-11-25T14:27:59.6822006Z                 ]
2026-11-25T14:27:59.6822105Z               + ipv4_gateway    = "10.116.192.1"
2026-11-25T14:27:59.6822209Z               + timeout         = 10
2026-11-25T14:27:59.6822248Z 
2026-11-25T14:27:59.6822334Z               + linux_options {
2026-11-25T14:27:59.6822629Z                   + domain       = "agil.nprd.caixa.gov.br"
2026-11-25T14:27:59.6822759Z                   + host_name    = "caddeapllx2871"
2026-11-25T14:27:59.6822867Z                   + hw_clock_utc = true
2026-11-25T14:27:59.6822957Z                 }
2026-11-25T14:27:59.6822991Z 
2026-11-25T14:27:59.6823084Z               + network_interface {
2026-11-25T14:27:59.6823191Z                   + ipv4_address = "10.116.202.61"
2026-11-25T14:27:59.6823287Z                   + ipv4_netmask = 19
2026-11-25T14:27:59.6823379Z                 }
2026-11-25T14:27:59.6823462Z             }
2026-11-25T14:27:59.6823544Z         }
2026-11-25T14:27:59.6823578Z 
2026-11-25T14:27:59.6823663Z       + disk {
2026-11-25T14:27:59.6823747Z           + attach            = false
2026-11-25T14:27:59.6823846Z           + controller_type   = "scsi"
2026-11-25T14:27:59.6824010Z           + datastore_id      = "datastore-770300"
2026-11-25T14:27:59.6824188Z           + device_address    = (known after apply)
2026-11-25T14:27:59.6824318Z           + disk_mode         = "persistent"
2026-11-25T14:27:59.6824488Z           + disk_sharing      = "sharingNone"
2026-11-25T14:27:59.6824655Z           + eagerly_scrub     = false
2026-11-25T14:27:59.6824816Z           + io_limit          = -1
2026-11-25T14:27:59.6824964Z           + io_reservation    = 0
2026-11-25T14:27:59.6825229Z           + io_share_count    = 0
2026-11-25T14:27:59.6825397Z           + io_share_level    = "normal"
2026-11-25T14:27:59.6825585Z           + keep_on_remove    = false
2026-11-25T14:27:59.6825737Z           + key               = 0
2026-11-25T14:27:59.6825877Z           + label             = "disk0"
2026-11-25T14:27:59.6826039Z           + path              = (known after apply)
2026-11-25T14:27:59.6826198Z           + size              = 32
2026-11-25T14:27:59.6826368Z           + storage_policy_id = (known after apply)
2026-11-25T14:27:59.6826526Z           + thin_provisioned  = true
2026-11-25T14:27:59.6826627Z           + unit_number       = 0
2026-11-25T14:27:59.6826726Z           + uuid              = (known after apply)
2026-11-25T14:27:59.6826826Z           + write_through     = false
2026-11-25T14:27:59.6826902Z         }
2026-11-25T14:27:59.6826987Z       + disk {
2026-11-25T14:27:59.6827163Z           + attach            = false
2026-11-25T14:27:59.6827267Z           + controller_type   = "scsi"
2026-11-25T14:27:59.6827441Z           + datastore_id      = "datastore-770300"
2026-11-25T14:27:59.6827621Z           + device_address    = (known after apply)
2026-11-25T14:27:59.6827778Z           + disk_mode         = "persistent"
2026-11-25T14:27:59.6827926Z           + disk_sharing      = "sharingNone"
2026-11-25T14:27:59.6828082Z           + eagerly_scrub     = false
2026-11-25T14:27:59.6828227Z           + io_limit          = -1
2026-11-25T14:27:59.6828359Z           + io_reservation    = 0
2026-11-25T14:27:59.6828539Z           + io_share_count    = 0
2026-11-25T14:27:59.6828699Z           + io_share_level    = "normal"
2026-11-25T14:27:59.6828860Z           + keep_on_remove    = false
2026-11-25T14:27:59.6829010Z           + key               = 0
2026-11-25T14:27:59.6829111Z           + label             = "disk1"
2026-11-25T14:27:59.6829213Z           + path              = (known after apply)
2026-11-25T14:27:59.6829300Z           + size              = 1
2026-11-25T14:27:59.6829431Z           + storage_policy_id = (known after apply)
2026-11-25T14:27:59.6829683Z           + thin_provisioned  = true
2026-11-25T14:27:59.6829806Z           + unit_number       = 2
2026-11-25T14:27:59.6829921Z           + uuid              = (known after apply)
2026-11-25T14:27:59.6830109Z           + write_through     = false
2026-11-25T14:27:59.6830241Z         }
2026-11-25T14:27:59.6830274Z 
2026-11-25T14:27:59.6830369Z       + network_interface {
2026-11-25T14:27:59.6830476Z           + adapter_type          = "vmxnet3"
2026-11-25T14:27:59.6830577Z           + bandwidth_limit       = -1
2026-11-25T14:27:59.6830865Z           + bandwidth_reservation = 0
2026-11-25T14:27:59.6831107Z           + bandwidth_share_count = (known after apply)
2026-11-25T14:27:59.6831317Z           + bandwidth_share_level = "normal"
2026-11-25T14:27:59.6831432Z           + device_address        = (known after apply)
2026-11-25T14:27:59.6831573Z           + key                   = (known after apply)
2026-11-25T14:27:59.6831720Z           + mac_address           = (known after apply)
2026-11-25T14:27:59.6831916Z           + network_id            = "dvportgroup-68733"
2026-11-25T14:27:59.6832002Z         }
2026-11-25T14:27:59.6832215Z     }
2026-11-25T14:27:59.6832270Z 
2026-11-25T14:27:59.6832451Z Plan: 1 to add, 0 to change, 0 to destroy.
2026-11-25T14:27:59.6832504Z 
2026-11-25T14:27:59.6832626Z Changes to Outputs:
2026-11-25T14:27:59.6832772Z   + log_consulta_tag = <<-EOT
2026-11-25T14:27:59.6832963Z         Response: <Response [201]>
2026-11-25T14:27:59.6833232Z         Autenticação realizada com sucesso v-center
2026-11-25T14:27:59.6833487Z         Response: <Response [200]>
2026-11-25T14:27:59.6833711Z          Headers:  {'vmware-api-session-id': '65004d66f6a3362fcaa30ff7dea0aa94'}
2026-11-25T14:27:59.6833961Z         Url Vcenter: 10.122.144.195
2026-11-25T14:27:59.6834121Z         Total de Categorias encontradas: 495
2026-11-25T14:27:59.6834333Z         Total de itens verificados: 495
2026-11-25T14:27:59.6834559Z         Sistema não encontrada na categoria ADDR
2026-11-25T14:27:59.6834654Z     EOT
2026-11-25T14:28:00.1823716Z vsphere_virtual_machine.vm["caddeapllx2871.agil.nprd.caixa.gov.br"]: Creating...
2026-11-25T14:28:00.5824448Z 
2026-11-25T14:28:00.5825329Z Error: error cloning virtual machine: The name 'CADDEAPLLX2871' already exists.
2026-11-25T14:28:00.5825436Z 
2026-11-25T14:28:00.5825564Z   with vsphere_virtual_machine.vm["caddeapllx2871.agil.nprd.caixa.gov.br"],
2026-11-25T14:28:00.5825722Z   on main.tf line 88, in resource "vsphere_virtual_machine" "vm":
2026-11-25T14:28:00.5825884Z   88: resource "vsphere_virtual_machine" "vm" {
2026-11-25T14:28:00.5825942Z 
2026-11-25T14:28:00.7012406Z ##[error]Bash exited with code '1'.
2026-11-25T14:28:00.7013202Z ##[error]Bash wrote one or more lines to the standard error stream.
2026-11-25T14:28:00.7013809Z ##[error]
Error: error cloning virtual machine: The name 'CADDEAPLLX2871' already exists.

  with vsphere_virtual_machine.vm["caddeapllx2871.agil.nprd.caixa.gov.br"],
  on main.tf line 88, in resource "vsphere_virtual_machine" "vm":
  88: resource "vsphere_virtual_machine" "vm" {


2026-11-25T14:28:00.7015984Z ##[section]Finishing: Terraform apply




deu esse erro auqi mais e so ir la no azure ae apagar né?
