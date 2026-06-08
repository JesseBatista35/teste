2026-06-08T13:55:26.9291547Z ##[section]Starting: Terraform apply
2026-06-08T13:55:26.9295009Z ==============================================================================
2026-06-08T13:55:26.9295097Z Task         : Bash
2026-06-08T13:55:26.9295145Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-08T13:55:26.9295219Z Version      : 3.227.0
2026-06-08T13:55:26.9295266Z Author       : Microsoft Corporation
2026-06-08T13:55:26.9295320Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-08T13:55:26.9295404Z ==============================================================================
2026-06-08T13:55:27.0728369Z Generating script.
2026-06-08T13:55:27.0740803Z ========================== Starting Command Output ===========================
2026-06-08T13:55:27.0749061Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/3cbd7a22-448e-43e3-a92c-b864eb7cf430.sh
2026-06-08T13:56:58.7448824Z data.vsphere_datacenter.dc: Reading...
2026-06-08T13:56:58.7449087Z data.vsphere_tag_category.addr: Reading...
2026-06-08T13:56:58.7450983Z data.vsphere_folder.folder: Reading...
2026-06-08T13:56:58.7535171Z data.vsphere_folder.folder: Read complete after 0s [id=group-v22]
2026-06-08T13:56:59.1672014Z data.vsphere_datacenter.dc: Read complete after 0s [id=datacenter-21]
2026-06-08T13:56:59.1776485Z data.vsphere_tag_category.addr: Read complete after 0s [id=urn:vmomi:InventoryServiceCategory:40fbf91f-3227-40d6-9785-a481d122536e:GLOBAL]
2026-06-08T13:56:59.1788614Z data.external.consulta_tag: Reading...
2026-06-08T13:56:59.3763042Z data.vsphere_network.network: Reading...
2026-06-08T13:56:59.3779669Z data.vsphere_datastore.datastore: Reading...
2026-06-08T13:56:59.3780827Z data.vsphere_resource_pool.pool: Reading...
2026-06-08T13:56:59.3780981Z data.vsphere_network.network_bck: Reading...
2026-06-08T13:56:59.3790289Z data.vsphere_virtual_machine.template: Reading...
2026-06-08T13:56:59.3811594Z data.vsphere_compute_cluster.cluster: Reading...
2026-06-08T13:56:59.4573755Z data.vsphere_network.network: Read complete after 0s [id=dvportgroup-68733]
2026-06-08T13:56:59.4574390Z data.vsphere_network.network_bck: Read complete after 0s [id=dvportgroup-72342]
2026-06-08T13:56:59.4577931Z data.vsphere_compute_cluster.cluster: Read complete after 0s [id=domain-c710514]
2026-06-08T13:56:59.4651694Z data.vsphere_resource_pool.pool: Read complete after 0s [id=resgroup-1062077]
2026-06-08T13:56:59.5276339Z data.vsphere_datastore.datastore: Read complete after 1s [id=datastore-770300]
2026-06-08T13:57:01.7681230Z data.vsphere_virtual_machine.template: Read complete after 3s [id=422327d7-a327-8009-e37d-598cfe1225d9]
2026-06-08T13:57:07.3906048Z data.external.consulta_tag: Read complete after 8s [id=-]
2026-06-08T13:57:07.6533892Z 
2026-06-08T13:57:07.6534408Z Terraform used the selected providers to generate the following execution
2026-06-08T13:57:07.6534586Z plan. Resource actions are indicated with the following symbols:
2026-06-08T13:57:07.6537617Z   + create
2026-06-08T13:57:07.6537697Z 
2026-06-08T13:57:07.6537836Z Terraform will perform the following actions:
2026-06-08T13:57:07.6537926Z 
2026-06-08T13:57:07.6627828Z   # vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] will be created
2026-06-08T13:57:07.6628069Z   + resource "vsphere_virtual_machine" "vm" {
2026-06-08T13:57:07.6628687Z       + annotation                              = "Gerenciado pelo Packer/Terraform - Esteiras Ageis - SICMU-INTRANET-UPDATE-TQS - Template: eap74-openjdk8-apache24-rhel79-v018 - caddeapllx2540.agil.nprd.caixa.gov.br"
2026-06-08T13:57:07.6628908Z       + boot_retry_delay                        = 10000
2026-06-08T13:57:07.6629065Z       + change_version                          = (known after apply)
2026-06-08T13:57:07.6629199Z       + cpu_limit                               = -1
2026-06-08T13:57:07.6629329Z       + cpu_share_count                         = (known after apply)
2026-06-08T13:57:07.6629460Z       + cpu_share_level                         = "normal"
2026-06-08T13:57:07.6629663Z       + datastore_id                            = "datastore-770300"
2026-06-08T13:57:07.6630148Z       + default_ip_address                      = (known after apply)
2026-06-08T13:57:07.6630284Z       + ept_rvi_mode                            = (known after apply)
2026-06-08T13:57:07.6630399Z       + extra_config                            = {
2026-06-08T13:57:07.6630526Z           + "default_ip"       = "10.116.201.150"
2026-06-08T13:57:07.6630665Z           + "default_password" = (sensitive value)
2026-06-08T13:57:07.6630796Z           + "default_user"     = (sensitive value)
2026-06-08T13:57:07.6630902Z         }
2026-06-08T13:57:07.6631027Z       + extra_config_reboot_required            = true
2026-06-08T13:57:07.6631255Z       + firmware                                = "bios"
2026-06-08T13:57:07.6631381Z       + force_power_off                         = true
2026-06-08T13:57:07.6631507Z       + guest_id                                = "rhel7_64Guest"
2026-06-08T13:57:07.6631647Z       + guest_ip_addresses                      = (known after apply)
2026-06-08T13:57:07.6631790Z       + hardware_version                        = (known after apply)
2026-06-08T13:57:07.6631917Z       + host_system_id                          = (known after apply)
2026-06-08T13:57:07.6632055Z       + hv_mode                                 = (known after apply)
2026-06-08T13:57:07.6632180Z       + id                                      = (known after apply)
2026-06-08T13:57:07.6632304Z       + ide_controller_count                    = 2
2026-06-08T13:57:07.6632430Z       + imported                                = (known after apply)
2026-06-08T13:57:07.6632742Z       + latency_sensitivity                     = "normal"
2026-06-08T13:57:07.6632871Z       + memory                                  = 4096
2026-06-08T13:57:07.6632987Z       + memory_limit                            = -1
2026-06-08T13:57:07.6633115Z       + memory_share_count                      = (known after apply)
2026-06-08T13:57:07.6633248Z       + memory_share_level                      = "normal"
2026-06-08T13:57:07.6633377Z       + migrate_wait_timeout                    = 30
2026-06-08T13:57:07.6633500Z       + moid                                    = (known after apply)
2026-06-08T13:57:07.6633728Z       + name                                    = "CADDEAPLLX2540"
2026-06-08T13:57:07.6633852Z       + num_cores_per_socket                    = 1
2026-06-08T13:57:07.6633965Z       + num_cpus                                = 2
2026-06-08T13:57:07.6634070Z       + nvme_controller_count                   = 0
2026-06-08T13:57:07.6634193Z       + power_state                             = (known after apply)
2026-06-08T13:57:07.6634319Z       + poweron_timeout                         = 300
2026-06-08T13:57:07.6634443Z       + reboot_required                         = (known after apply)
2026-06-08T13:57:07.6634645Z       + resource_pool_id                        = "resgroup-1062077"
2026-06-08T13:57:07.6634784Z       + run_tools_scripts_after_power_on        = true
2026-06-08T13:57:07.6634922Z       + run_tools_scripts_after_resume          = true
2026-06-08T13:57:07.6635059Z       + run_tools_scripts_before_guest_shutdown = true
2026-06-08T13:57:07.6635195Z       + run_tools_scripts_before_guest_standby  = true
2026-06-08T13:57:07.6635327Z       + sata_controller_count                   = 0
2026-06-08T13:57:07.6635455Z       + scsi_bus_sharing                        = "noSharing"
2026-06-08T13:57:07.6635578Z       + scsi_controller_count                   = 1
2026-06-08T13:57:07.6635690Z       + scsi_type                               = "pvscsi"
2026-06-08T13:57:07.6635811Z       + shutdown_wait_timeout                   = 3
2026-06-08T13:57:07.6635939Z       + storage_policy_id                       = (known after apply)
2026-06-08T13:57:07.6636070Z       + swap_placement_policy                   = "inherit"
2026-06-08T13:57:07.6636195Z       + sync_time_with_host                     = true
2026-06-08T13:57:07.6636325Z       + tools_upgrade_policy                    = "manual"
2026-06-08T13:57:07.6636531Z       + uuid                                    = (known after apply)
2026-06-08T13:57:07.6636660Z       + vapp_transport                          = (known after apply)
2026-06-08T13:57:07.6636797Z       + vmware_tools_status                     = (known after apply)
2026-06-08T13:57:07.6636933Z       + vmx_path                                = (known after apply)
2026-06-08T13:57:07.6637062Z       + wait_for_guest_ip_timeout               = 0
2026-06-08T13:57:07.6637181Z       + wait_for_guest_net_routable             = true
2026-06-08T13:57:07.6637310Z       + wait_for_guest_net_timeout              = 5
2026-06-08T13:57:07.6637368Z 
2026-06-08T13:57:07.6637468Z       + clone {
2026-06-08T13:57:07.6637663Z           + template_uuid = "422327d7-a327-8009-e37d-598cfe1225d9"
2026-06-08T13:57:07.6637787Z           + timeout       = 30
2026-06-08T13:57:07.6637841Z 
2026-06-08T13:57:07.6637946Z           + customize {
2026-06-08T13:57:07.6638060Z               + dns_server_list = [
2026-06-08T13:57:07.6638173Z                   + "10.116.193.77",
2026-06-08T13:57:07.6638285Z                   + "10.116.193.78",
2026-06-08T13:57:07.6638389Z                 ]
2026-06-08T13:57:07.6638505Z               + ipv4_gateway    = "10.116.192.1"
2026-06-08T13:57:07.6638626Z               + timeout         = 10
2026-06-08T13:57:07.6638666Z 
2026-06-08T13:57:07.6638767Z               + linux_options {
2026-06-08T13:57:07.6638889Z                   + domain       = "agil.nprd.caixa.gov.br"
2026-06-08T13:57:07.6639019Z                   + host_name    = "caddeapllx2540"
2026-06-08T13:57:07.6639137Z                   + hw_clock_utc = true
2026-06-08T13:57:07.6639327Z                 }
2026-06-08T13:57:07.6639366Z 
2026-06-08T13:57:07.6639472Z               + network_interface {
2026-06-08T13:57:07.6639594Z                   + ipv4_address = "10.116.201.150"
2026-06-08T13:57:07.6639715Z                   + ipv4_netmask = 19
2026-06-08T13:57:07.6639819Z                 }
2026-06-08T13:57:07.6639915Z             }
2026-06-08T13:57:07.6640006Z         }
2026-06-08T13:57:07.6640052Z 
2026-06-08T13:57:07.6640148Z       + disk {
2026-06-08T13:57:07.6640261Z           + attach            = false
2026-06-08T13:57:07.6640373Z           + controller_type   = "scsi"
2026-06-08T13:57:07.6640552Z           + datastore_id      = "datastore-770300"
2026-06-08T13:57:07.6640685Z           + device_address    = (known after apply)
2026-06-08T13:57:07.6640810Z           + disk_mode         = "persistent"
2026-06-08T13:57:07.6640935Z           + disk_sharing      = "sharingNone"
2026-06-08T13:57:07.6641057Z           + eagerly_scrub     = false
2026-06-08T13:57:07.6641172Z           + io_limit          = -1
2026-06-08T13:57:07.6641284Z           + io_reservation    = 0
2026-06-08T13:57:07.6641395Z           + io_share_count    = 0
2026-06-08T13:57:07.6641516Z           + io_share_level    = "normal"
2026-06-08T13:57:07.6641626Z           + keep_on_remove    = false
2026-06-08T13:57:07.6641737Z           + key               = 0
2026-06-08T13:57:07.6641847Z           + label             = "disk0"
2026-06-08T13:57:07.6641969Z           + path              = (known after apply)
2026-06-08T13:57:07.6642087Z           + size              = 32
2026-06-08T13:57:07.6642206Z           + storage_policy_id = (known after apply)
2026-06-08T13:57:07.6642331Z           + thin_provisioned  = true
2026-06-08T13:57:07.6642438Z           + unit_number       = 0
2026-06-08T13:57:07.6642609Z           + uuid              = (known after apply)
2026-06-08T13:57:07.6642740Z           + write_through     = false
2026-06-08T13:57:07.6642834Z         }
2026-06-08T13:57:07.6642936Z       + disk {
2026-06-08T13:57:07.6643041Z           + attach            = false
2026-06-08T13:57:07.6643153Z           + controller_type   = "scsi"
2026-06-08T13:57:07.6643330Z           + datastore_id      = "datastore-770300"
2026-06-08T13:57:07.6643464Z           + device_address    = (known after apply)
2026-06-08T13:57:07.6643587Z           + disk_mode         = "persistent"
2026-06-08T13:57:07.6643753Z           + disk_sharing      = "sharingNone"
2026-06-08T13:57:07.6643871Z           + eagerly_scrub     = false
2026-06-08T13:57:07.6643975Z           + io_limit          = -1
2026-06-08T13:57:07.6644082Z           + io_reservation    = 0
2026-06-08T13:57:07.6644196Z           + io_share_count    = 0
2026-06-08T13:57:07.6644314Z           + io_share_level    = "normal"
2026-06-08T13:57:07.6644435Z           + keep_on_remove    = false
2026-06-08T13:57:07.6644543Z           + key               = 0
2026-06-08T13:57:07.6644652Z           + label             = "disk1"
2026-06-08T13:57:07.6644773Z           + path              = (known after apply)
2026-06-08T13:57:07.6644885Z           + size              = 1
2026-06-08T13:57:07.6645004Z           + storage_policy_id = (known after apply)
2026-06-08T13:57:07.6645123Z           + thin_provisioned  = true
2026-06-08T13:57:07.6645234Z           + unit_number       = 2
2026-06-08T13:57:07.6645349Z           + uuid              = (known after apply)
2026-06-08T13:57:07.6645466Z           + write_through     = false
2026-06-08T13:57:07.6645566Z         }
2026-06-08T13:57:07.6645604Z 
2026-06-08T13:57:07.6645706Z       + network_interface {
2026-06-08T13:57:07.6645829Z           + adapter_type          = "vmxnet3"
2026-06-08T13:57:07.6645948Z           + bandwidth_limit       = -1
2026-06-08T13:57:07.6646065Z           + bandwidth_reservation = 0
2026-06-08T13:57:07.6646196Z           + bandwidth_share_count = (known after apply)
2026-06-08T13:57:07.6646328Z           + bandwidth_share_level = "normal"
2026-06-08T13:57:07.6646457Z           + device_address        = (known after apply)
2026-06-08T13:57:07.6646634Z           + key                   = (known after apply)
2026-06-08T13:57:07.6646751Z           + mac_address           = (known after apply)
2026-06-08T13:57:07.6646932Z           + network_id            = "dvportgroup-68733"
2026-06-08T13:57:07.6647037Z         }
2026-06-08T13:57:07.6647211Z     }
2026-06-08T13:57:07.6647251Z 
2026-06-08T13:57:07.6647365Z Plan: 1 to add, 0 to change, 0 to destroy.
2026-06-08T13:57:07.6647425Z 
2026-06-08T13:57:07.6647806Z ─────────────────────────────────────────────────────────────────────────────
2026-06-08T13:57:07.6647873Z 
2026-06-08T13:57:07.6647982Z Saved the plan to: tfplan.binary
2026-06-08T13:57:07.6648042Z 
2026-06-08T13:57:07.6648176Z To perform exactly these actions, run the following command to apply:
2026-06-08T13:57:07.6648321Z     terraform apply "tfplan.binary"
2026-06-08T13:57:08.8266030Z Recursos serão alterados. Abrindo mudança de HSI!
2026-06-08T13:57:19.9684342Z [DEPRECATION WARNING]: [defaults]callback_whitelist option, normalizing names 
2026-06-08T13:57:19.9684685Z to new standard, use callbacks_enabled instead. This feature will be removed 
2026-06-08T13:57:19.9685177Z from ansible-core in version 2.15. Deprecation warnings can be disabled by 
2026-06-08T13:57:19.9685345Z setting deprecation_warnings=False in ansible.cfg.
2026-06-08T13:57:20.1664481Z 
2026-06-08T13:57:20.1665386Z PLAY [Mudança de HSI] **********************************************************
2026-06-08T13:57:20.1665724Z Monday 08 June 2026  10:57:20 -0300 (0:00:00.012)       0:00:00.012 *********** 
2026-06-08T13:57:24.4818443Z [WARNING]: Unhandled error in Python interpreter discovery for host localhost:
2026-06-08T13:57:24.4818895Z Failed to connect to the host via ssh: ssh: connect to host localhost port 22:
2026-06-08T13:57:24.4819572Z Connection refused
2026-06-08T13:57:28.5301120Z 
2026-06-08T13:57:28.5301843Z TASK [Gathering Facts] *********************************************************
2026-06-08T13:57:28.5302286Z fatal: [localhost]: UNREACHABLE! => {"changed": false, "msg": "Data could not be sent to remote host \"localhost\". Make sure this host can be reached over ssh: ssh: connect to host localhost port 22: Connection refused\r\n", "unreachable": true}
2026-06-08T13:57:28.5302858Z 
2026-06-08T13:57:28.5303107Z PLAY RECAP *********************************************************************
2026-06-08T13:57:28.5303414Z localhost                  : ok=0    changed=0    unreachable=1    failed=0    skipped=0    rescued=0    ignored=0   
2026-06-08T13:57:28.5303937Z 
2026-06-08T13:57:28.5304153Z Playbook run took 0 days, 0 hours, 0 minutes, 8 seconds
2026-06-08T13:57:28.5304846Z Monday 08 June 2026  10:57:28 -0300 (0:00:08.364)       0:00:08.376 *********** 
2026-06-08T13:57:28.5305156Z =============================================================================== 
2026-06-08T13:57:28.5305543Z Gathering Facts --------------------------------------------------------- 8.36s
2026-06-08T13:58:00.1231994Z data.vsphere_folder.folder: Reading...
2026-06-08T13:58:00.1234835Z data.vsphere_tag_category.addr: Reading...
2026-06-08T13:58:00.1235190Z data.vsphere_datacenter.dc: Reading...
2026-06-08T13:58:00.1350971Z data.vsphere_folder.folder: Read complete after 0s [id=group-v22]
2026-06-08T13:58:00.5354660Z data.vsphere_tag_category.addr: Read complete after 1s [id=urn:vmomi:InventoryServiceCategory:40fbf91f-3227-40d6-9785-a481d122536e:GLOBAL]
2026-06-08T13:58:00.5372795Z data.external.consulta_tag: Reading...
2026-06-08T13:58:00.7001433Z data.vsphere_datacenter.dc: Read complete after 1s [id=datacenter-21]
2026-06-08T13:58:00.9080318Z data.vsphere_network.network_bck: Reading...
2026-06-08T13:58:00.9080885Z data.vsphere_resource_pool.pool: Reading...
2026-06-08T13:58:00.9092423Z data.vsphere_compute_cluster.cluster: Reading...
2026-06-08T13:58:00.9092694Z data.vsphere_network.network: Reading...
2026-06-08T13:58:00.9100340Z data.vsphere_datastore.datastore: Reading...
2026-06-08T13:58:00.9100564Z data.vsphere_virtual_machine.template: Reading...
2026-06-08T13:58:01.0019895Z data.vsphere_resource_pool.pool: Read complete after 0s [id=resgroup-1062077]
2026-06-08T13:58:01.0033928Z data.vsphere_compute_cluster.cluster: Read complete after 0s [id=domain-c710514]
2026-06-08T13:58:01.0248414Z data.vsphere_network.network_bck: Read complete after 0s [id=dvportgroup-72342]
2026-06-08T13:58:01.0255293Z data.vsphere_network.network: Read complete after 0s [id=dvportgroup-68733]
2026-06-08T13:58:01.1124058Z data.vsphere_datastore.datastore: Read complete after 0s [id=datastore-770300]
2026-06-08T13:58:04.8015082Z data.vsphere_virtual_machine.template: Read complete after 4s [id=422327d7-a327-8009-e37d-598cfe1225d9]
2026-06-08T13:58:09.0205634Z data.external.consulta_tag: Read complete after 8s [id=-]
2026-06-08T13:58:09.3118312Z 
2026-06-08T13:58:09.3118909Z Terraform used the selected providers to generate the following execution
2026-06-08T13:58:09.3119088Z plan. Resource actions are indicated with the following symbols:
2026-06-08T13:58:09.3122820Z   + create
2026-06-08T13:58:09.3122990Z 
2026-06-08T13:58:09.3123133Z Terraform will perform the following actions:
2026-06-08T13:58:09.3123199Z 
2026-06-08T13:58:09.3208658Z   # vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] will be created
2026-06-08T13:58:09.3209315Z   + resource "vsphere_virtual_machine" "vm" {
2026-06-08T13:58:09.3210476Z       + annotation                              = "Gerenciado pelo Packer/Terraform - Esteiras Ageis - SICMU-INTRANET-UPDATE-TQS - Template: eap74-openjdk8-apache24-rhel79-v018 - caddeapllx2540.agil.nprd.caixa.gov.br"
2026-06-08T13:58:09.3210798Z       + boot_retry_delay                        = 10000
2026-06-08T13:58:09.3210942Z       + change_version                          = (known after apply)
2026-06-08T13:58:09.3211078Z       + cpu_limit                               = -1
2026-06-08T13:58:09.3211231Z       + cpu_share_count                         = (known after apply)
2026-06-08T13:58:09.3211370Z       + cpu_share_level                         = "normal"
2026-06-08T13:58:09.3211576Z       + datastore_id                            = "datastore-770300"
2026-06-08T13:58:09.3211719Z       + default_ip_address                      = (known after apply)
2026-06-08T13:58:09.3211854Z       + ept_rvi_mode                            = (known after apply)
2026-06-08T13:58:09.3211986Z       + extra_config                            = {
2026-06-08T13:58:09.3212431Z           + "default_ip"       = "10.116.201.150"
2026-06-08T13:58:09.3212668Z           + "default_password" = (sensitive value)
2026-06-08T13:58:09.3212819Z           + "default_user"     = (sensitive value)
2026-06-08T13:58:09.3212920Z         }
2026-06-08T13:58:09.3213042Z       + extra_config_reboot_required            = true
2026-06-08T13:58:09.3213174Z       + firmware                                = "bios"
2026-06-08T13:58:09.3213298Z       + force_power_off                         = true
2026-06-08T13:58:09.3213427Z       + guest_id                                = "rhel7_64Guest"
2026-06-08T13:58:09.3213568Z       + guest_ip_addresses                      = (known after apply)
2026-06-08T13:58:09.3213713Z       + hardware_version                        = (known after apply)
2026-06-08T13:58:09.3213855Z       + host_system_id                          = (known after apply)
2026-06-08T13:58:09.3213984Z       + hv_mode                                 = (known after apply)
2026-06-08T13:58:09.3214108Z       + id                                      = (known after apply)
2026-06-08T13:58:09.3214228Z       + ide_controller_count                    = 2
2026-06-08T13:58:09.3214354Z       + imported                                = (known after apply)
2026-06-08T13:58:09.3214475Z       + latency_sensitivity                     = "normal"
2026-06-08T13:58:09.3214601Z       + memory                                  = 4096
2026-06-08T13:58:09.3214722Z       + memory_limit                            = -1
2026-06-08T13:58:09.3214852Z       + memory_share_count                      = (known after apply)
2026-06-08T13:58:09.3215077Z       + memory_share_level                      = "normal"
2026-06-08T13:58:09.3215215Z       + migrate_wait_timeout                    = 30
2026-06-08T13:58:09.3215346Z       + moid                                    = (known after apply)
2026-06-08T13:58:09.3215475Z       + name                                    = "CADDEAPLLX2540"
2026-06-08T13:58:09.3215602Z       + num_cores_per_socket                    = 1
2026-06-08T13:58:09.3215724Z       + num_cpus                                = 2
2026-06-08T13:58:09.3215845Z       + nvme_controller_count                   = 0
2026-06-08T13:58:09.3215970Z       + power_state                             = (known after apply)
2026-06-08T13:58:09.3216092Z       + poweron_timeout                         = 300
2026-06-08T13:58:09.3216220Z       + reboot_required                         = (known after apply)
2026-06-08T13:58:09.3216426Z       + resource_pool_id                        = "resgroup-1062077"
2026-06-08T13:58:09.3216566Z       + run_tools_scripts_after_power_on        = true
2026-06-08T13:58:09.3216707Z       + run_tools_scripts_after_resume          = true
2026-06-08T13:58:09.3216872Z       + run_tools_scripts_before_guest_shutdown = true
2026-06-08T13:58:09.3217009Z       + run_tools_scripts_before_guest_standby  = true
2026-06-08T13:58:09.3217138Z       + sata_controller_count                   = 0
2026-06-08T13:58:09.3217263Z       + scsi_bus_sharing                        = "noSharing"
2026-06-08T13:58:09.3217392Z       + scsi_controller_count                   = 1
2026-06-08T13:58:09.3217511Z       + scsi_type                               = "pvscsi"
2026-06-08T13:58:09.3217633Z       + shutdown_wait_timeout                   = 3
2026-06-08T13:58:09.3217761Z       + storage_policy_id                       = (known after apply)
2026-06-08T13:58:09.3217897Z       + swap_placement_policy                   = "inherit"
2026-06-08T13:58:09.3218024Z       + sync_time_with_host                     = true
2026-06-08T13:58:09.3218144Z       + tools_upgrade_policy                    = "manual"
2026-06-08T13:58:09.3218270Z       + uuid                                    = (known after apply)
2026-06-08T13:58:09.3218397Z       + vapp_transport                          = (known after apply)
2026-06-08T13:58:09.3218535Z       + vmware_tools_status                     = (known after apply)
2026-06-08T13:58:09.3218667Z       + vmx_path                                = (known after apply)
2026-06-08T13:58:09.3218884Z       + wait_for_guest_ip_timeout               = 0
2026-06-08T13:58:09.3219018Z       + wait_for_guest_net_routable             = true
2026-06-08T13:58:09.3219148Z       + wait_for_guest_net_timeout              = 5
2026-06-08T13:58:09.3219203Z 
2026-06-08T13:58:09.3219307Z       + clone {
2026-06-08T13:58:09.3219503Z           + template_uuid = "422327d7-a327-8009-e37d-598cfe1225d9"
2026-06-08T13:58:09.3219640Z           + timeout       = 30
2026-06-08T13:58:09.3219685Z 
2026-06-08T13:58:09.3219786Z           + customize {
2026-06-08T13:58:09.3219901Z               + dns_server_list = [
2026-06-08T13:58:09.3220019Z                   + "10.116.193.77",
2026-06-08T13:58:09.3220134Z                   + "10.116.193.78",
2026-06-08T13:58:09.3220243Z                 ]
2026-06-08T13:58:09.3220360Z               + ipv4_gateway    = "10.116.192.1"
2026-06-08T13:58:09.3220473Z               + timeout         = 10
2026-06-08T13:58:09.3220522Z 
2026-06-08T13:58:09.3220634Z               + linux_options {
2026-06-08T13:58:09.3220761Z                   + domain       = "agil.nprd.caixa.gov.br"
2026-06-08T13:58:09.3220888Z                   + host_name    = "caddeapllx2540"
2026-06-08T13:58:09.3221008Z                   + hw_clock_utc = true
2026-06-08T13:58:09.3221117Z                 }
2026-06-08T13:58:09.3221162Z 
2026-06-08T13:58:09.3221259Z               + network_interface {
2026-06-08T13:58:09.3221385Z                   + ipv4_address = "10.116.201.150"
2026-06-08T13:58:09.3221504Z                   + ipv4_netmask = 19
2026-06-08T13:58:09.3221635Z                 }
2026-06-08T13:58:09.3221730Z             }
2026-06-08T13:58:09.3221825Z         }
2026-06-08T13:58:09.3221865Z 
2026-06-08T13:58:09.3221964Z       + disk {
2026-06-08T13:58:09.3222074Z           + attach            = false
2026-06-08T13:58:09.3222192Z           + controller_type   = "scsi"
2026-06-08T13:58:09.3222378Z           + datastore_id      = "datastore-770300"
2026-06-08T13:58:09.3222515Z           + device_address    = (known after apply)
2026-06-08T13:58:09.3222722Z           + disk_mode         = "persistent"
2026-06-08T13:58:09.3222852Z           + disk_sharing      = "sharingNone"
2026-06-08T13:58:09.3222971Z           + eagerly_scrub     = false
2026-06-08T13:58:09.3223087Z           + io_limit          = -1
2026-06-08T13:58:09.3223198Z           + io_reservation    = 0
2026-06-08T13:58:09.3223312Z           + io_share_count    = 0
2026-06-08T13:58:09.3223431Z           + io_share_level    = "normal"
2026-06-08T13:58:09.3223551Z           + keep_on_remove    = false
2026-06-08T13:58:09.3223663Z           + key               = 0
2026-06-08T13:58:09.3223773Z           + label             = "disk0"
2026-06-08T13:58:09.3223894Z           + path              = (known after apply)
2026-06-08T13:58:09.3224004Z           + size              = 32
2026-06-08T13:58:09.3224126Z           + storage_policy_id = (known after apply)
2026-06-08T13:58:09.3224254Z           + thin_provisioned  = true
2026-06-08T13:58:09.3224367Z           + unit_number       = 0
2026-06-08T13:58:09.3224489Z           + uuid              = (known after apply)
2026-06-08T13:58:09.3224606Z           + write_through     = false
2026-06-08T13:58:09.3224709Z         }
2026-06-08T13:58:09.3224810Z       + disk {
2026-06-08T13:58:09.3224917Z           + attach            = false
2026-06-08T13:58:09.3225033Z           + controller_type   = "scsi"
2026-06-08T13:58:09.3225208Z           + datastore_id      = "datastore-770300"
2026-06-08T13:58:09.3225343Z           + device_address    = (known after apply)
2026-06-08T13:58:09.3225468Z           + disk_mode         = "persistent"
2026-06-08T13:58:09.3225593Z           + disk_sharing      = "sharingNone"
2026-06-08T13:58:09.3225761Z           + eagerly_scrub     = false
2026-06-08T13:58:09.3225912Z           + io_limit          = -1
2026-06-08T13:58:09.3226077Z           + io_reservation    = 0
2026-06-08T13:58:09.3226235Z           + io_share_count    = 0
2026-06-08T13:58:09.3226468Z           + io_share_level    = "normal"
2026-06-08T13:58:09.3226650Z           + keep_on_remove    = false
2026-06-08T13:58:09.3226825Z           + key               = 0
2026-06-08T13:58:09.3226985Z           + label             = "disk1"
2026-06-08T13:58:09.3227155Z           + path              = (known after apply)
2026-06-08T13:58:09.3227316Z           + size              = 1
2026-06-08T13:58:09.3227503Z           + storage_policy_id = (known after apply)
2026-06-08T13:58:09.3227810Z           + thin_provisioned  = true
2026-06-08T13:58:09.3227994Z           + unit_number       = 2
2026-06-08T13:58:09.3228193Z           + uuid              = (known after apply)
2026-06-08T13:58:09.3228397Z           + write_through     = false
2026-06-08T13:58:09.3228561Z         }
2026-06-08T13:58:09.3228622Z 
2026-06-08T13:58:09.3228789Z       + network_interface {
2026-06-08T13:58:09.3228972Z           + adapter_type          = "vmxnet3"
2026-06-08T13:58:09.3229151Z           + bandwidth_limit       = -1
2026-06-08T13:58:09.3229327Z           + bandwidth_reservation = 0
2026-06-08T13:58:09.3229528Z           + bandwidth_share_count = (known after apply)
2026-06-08T13:58:09.3229695Z           + bandwidth_share_level = "normal"
2026-06-08T13:58:09.3229829Z           + device_address        = (known after apply)
2026-06-08T13:58:09.3229961Z           + key                   = (known after apply)
2026-06-08T13:58:09.3230090Z           + mac_address           = (known after apply)
2026-06-08T13:58:09.3230339Z           + network_id            = "dvportgroup-68733"
2026-06-08T13:58:09.3230456Z         }
2026-06-08T13:58:09.3230663Z     }
2026-06-08T13:58:09.3230703Z 
2026-06-08T13:58:09.3230825Z Plan: 1 to add, 0 to change, 0 to destroy.
2026-06-08T13:58:09.8527176Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"]: Creating...
2026-06-08T13:58:19.8530639Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"]: Still creating... [10s elapsed]
2026-06-08T13:58:29.8535038Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"]: Still creating... [20s elapsed]
2026-06-08T13:58:39.8538141Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"]: Still creating... [30s elapsed]
2026-06-08T13:58:49.8545776Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"]: Still creating... [40s elapsed]
2026-06-08T13:58:59.8551986Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"]: Still creating... [50s elapsed]
2026-06-08T13:59:09.8554376Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"]: Still creating... [1m0s elapsed]
2026-06-08T13:59:19.8563761Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"]: Still creating... [1m10s elapsed]
2026-06-08T13:59:29.8566804Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"]: Still creating... [1m20s elapsed]
2026-06-08T13:59:39.8579245Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"]: Still creating... [1m30s elapsed]
2026-06-08T13:59:49.8587098Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"]: Still creating... [1m40s elapsed]
2026-06-08T13:59:59.8596300Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"]: Still creating... [1m50s elapsed]
2026-06-08T14:00:09.8597326Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"]: Still creating... [2m0s elapsed]
2026-06-08T14:00:19.4116528Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"]: Provisioning with 'remote-exec'...
2026-06-08T14:00:19.4117274Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Connecting to remote host via SSH...
2026-06-08T14:00:19.4117793Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):   Host: 10.116.201.150
2026-06-08T14:00:19.4118156Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):   User: root
2026-06-08T14:00:19.4118722Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):   Password: true
2026-06-08T14:00:19.4120113Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):   Private key: false
2026-06-08T14:00:19.4120555Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):   Certificate: false
2026-06-08T14:00:19.4120958Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):   SSH Agent: false
2026-06-08T14:00:19.4121364Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):   Checking Host Key: false
2026-06-08T14:00:19.4128712Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):   Target Platform: unix
2026-06-08T14:00:19.4724236Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Connected!
2026-06-08T14:00:19.8078187Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):   Physical volume "/dev/sdb" successfully created.
2026-06-08T14:00:19.8407740Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):   Volume group "VG_PRINCIPAL" successfully extended
2026-06-08T14:00:19.8535633Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):   --size may not be zero.
2026-06-08T14:00:19.8536392Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):   Run `lvextend --help' for more information.
2026-06-08T14:00:19.8571339Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):   --size may not be zero.
2026-06-08T14:00:19.8571653Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):   Run `lvextend --help' for more information.
2026-06-08T14:00:19.8601577Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"]: Still creating... [2m10s elapsed]
2026-06-08T14:00:19.8616868Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): meta-data=/dev/mapper/VG_PRINCIPAL-LV_OPT isize=512    agcount=4, agsize=655360 blks
2026-06-08T14:00:19.8617598Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):          =                       sectsz=512   attr=2, projid32bit=1
2026-06-08T14:00:19.8618013Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):          =                       crc=1        finobt=0 spinodes=0
2026-06-08T14:00:19.8619757Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): data     =                       bsize=4096   blocks=2621440, imaxpct=25
2026-06-08T14:00:19.8620794Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):          =                       sunit=0      swidth=0 blks
2026-06-08T14:00:19.8621299Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): naming   =version 2              bsize=4096   ascii-ci=0 ftype=1
2026-06-08T14:00:19.8621633Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): log      =internal               bsize=4096   blocks=2560, version=2
2026-06-08T14:00:19.8622105Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):          =                       sectsz=512   sunit=0 blks, lazy-count=1
2026-06-08T14:00:19.8622499Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): realtime =none                   extsz=4096   blocks=0, rtextents=0
2026-06-08T14:00:19.8626252Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): meta-data=/dev/mapper/VG_PRINCIPAL-LV_LOGS isize=512    agcount=4, agsize=131072 blks
2026-06-08T14:00:19.8626641Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):          =                       sectsz=512   attr=2, projid32bit=1
2026-06-08T14:00:19.8627228Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):          =                       crc=1        finobt=0 spinodes=0
2026-06-08T14:00:19.8627592Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): data     =                       bsize=4096   blocks=524288, imaxpct=25
2026-06-08T14:00:19.8628202Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):          =                       sunit=0      swidth=0 blks
2026-06-08T14:00:19.8628959Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): naming   =version 2              bsize=4096   ascii-ci=0 ftype=1
2026-06-08T14:00:19.8629787Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): log      =internal               bsize=4096   blocks=2560, version=2
2026-06-08T14:00:19.8630479Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):          =                       sectsz=512   sunit=0 blks, lazy-count=1
2026-06-08T14:00:19.8630817Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): realtime =none                   extsz=4096   blocks=0, rtextents=0
2026-06-08T14:00:19.8680951Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-06-08T14:00:19.8681459Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):                                  Dload  Upload   Total   Spent    Left  Speed
2026-06-08T14:00:19.8723471Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-06-08T14:00:19.8724351Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): 100   439  100   439    0     0    98k      0 --:--:-- --:--:-- --:--:--  107k
2026-06-08T14:00:19.8724836Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): eap74-openjdk8-apache24-rhel79-v018
2026-06-08T14:00:19.8747319Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-06-08T14:00:19.8747736Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):                                  Dload  Upload   Total   Spent    Left  Speed
2026-06-08T14:00:19.9644264Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-06-08T14:00:19.9644737Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-06-08T14:00:19.9645130Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): curl: (60) Peer's certificate issuer has been marked as not trusted by the user.
2026-06-08T14:00:19.9645470Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): More details here: http://curl.haxx.se/docs/sslcerts.html
2026-06-08T14:00:19.9645589Z 
2026-06-08T14:00:19.9645860Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): curl performs SSL certificate verification by default, using a "bundle"
2026-06-08T14:00:19.9646193Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):  of Certificate Authority (CA) public keys (CA certs). If the default
2026-06-08T14:00:19.9646527Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):  bundle file isn't adequate, you can specify an alternate file
2026-06-08T14:00:19.9646822Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):  using the --cacert option.
2026-06-08T14:00:19.9647137Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): If this HTTPS server uses a certificate signed by a CA represented in
2026-06-08T14:00:19.9647468Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):  the bundle, the certificate verification probably failed due to a
2026-06-08T14:00:19.9648141Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):  problem with the certificate (it might be expired, or the name might
2026-06-08T14:00:19.9648441Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):  not match the domain name in the URL).
2026-06-08T14:00:19.9648758Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): If you'd like to turn off curl's verification of the certificate, use
2026-06-08T14:00:19.9649052Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):  the -k (or --insecure) option.
2026-06-08T14:00:19.9758620Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Failed to execute operation: No such file or directory
2026-06-08T14:00:19.9827550Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Failed to stop sssd.service: Unit sssd.service not loaded.
2026-06-08T14:00:20.4056822Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Plugins carregados: langpacks, product-
2026-06-08T14:00:20.4057190Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):                   : id, search-disabled-
2026-06-08T14:00:20.4057481Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):                   : repos, subscription-
2026-06-08T14:00:20.4057756Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):                   : manager
2026-06-08T14:00:20.4664806Z 
2026-06-08T14:00:20.4666120Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): This system is not registered with an entitlement server. You can use subscription-manager to register.
2026-06-08T14:00:20.4666297Z 
2026-06-08T14:00:20.6712929Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Nenhuma correspondência para o argumento: sssd-common-pac
2026-06-08T14:00:20.8111357Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Nenhuma correspondência para o argumento: sssd-proxy
2026-06-08T14:00:20.9581783Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Nenhuma correspondência para o argumento: python-sssdconfig
2026-06-08T14:00:21.0872141Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Nenhuma correspondência para o argumento: sssd-krb5-common
2026-06-08T14:00:21.2134899Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Nenhuma correspondência para o argumento: sssd-ipa
2026-06-08T14:00:21.3392032Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Nenhuma correspondência para o argumento: sssd-krb5
2026-06-08T14:00:21.4662411Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Nenhuma correspondência para o argumento: sssd-ad
2026-06-08T14:00:21.5903958Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Nenhuma correspondência para o argumento: sssd-common
2026-06-08T14:00:21.7141933Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Nenhuma correspondência para o argumento: sssd-ldap
2026-06-08T14:00:21.8391672Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Nenhuma correspondência para o argumento: sssd-dbus
2026-06-08T14:00:21.9091980Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Resolvendo dependências
2026-06-08T14:00:21.9098501Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): --> Executando verificação da transação
2026-06-08T14:00:21.9098943Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ---> O pacote sssd-client.x86_64 0:1.16.5-10.el7 será removido
2026-06-08T14:00:22.0652206Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): --> Resolução de dependências finalizada
2026-06-08T14:00:22.1871115Z 
2026-06-08T14:00:22.1872790Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Dependências resolvidas
2026-06-08T14:00:22.1873065Z 
2026-06-08T14:00:22.1873442Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ========================================
2026-06-08T14:00:22.1873843Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):  Package
2026-06-08T14:00:22.1874220Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):        Arq.   Versão
2026-06-08T14:00:22.1874662Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):                     Repo           Tam.
2026-06-08T14:00:22.1875083Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ========================================
2026-06-08T14:00:22.1875492Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Removendo:
2026-06-08T14:00:22.1875864Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):  sssd-client
2026-06-08T14:00:22.1876264Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):        x86_64 1.16.5-10.el7
2026-06-08T14:00:22.1876804Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):                     @anaconda/7.9 223 k
2026-06-08T14:00:22.1876946Z 
2026-06-08T14:00:22.1877266Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Resumo da transação
2026-06-08T14:00:22.1878081Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ========================================
2026-06-08T14:00:22.1878486Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Remove  1 Package
2026-06-08T14:00:22.1878621Z 
2026-06-08T14:00:22.1878964Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Tamanho depois de instalado: 223 k
2026-06-08T14:00:22.1879361Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Downloading packages:
2026-06-08T14:00:22.1924146Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Running transaction check
2026-06-08T14:00:22.1924736Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Running transaction test
2026-06-08T14:00:22.2774110Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Transaction test succeeded
2026-06-08T14:00:22.2774483Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Running transaction
2026-06-08T14:00:22.3551405Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):   Apagando     : sssd-client-1.16   1/1
2026-06-08T14:00:22.4350120Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):   Verifying    : sssd-client-1.16   1/1
2026-06-08T14:00:22.6049729Z 
2026-06-08T14:00:22.6050944Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Removido(s):
2026-06-08T14:00:22.6051356Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):   sssd-client.x86_64 0:1.16.5-10.el7
2026-06-08T14:00:22.6051471Z 
2026-06-08T14:00:22.6051706Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Concluído!
2026-06-08T14:00:22.7481999Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Plugins carregados: langpacks, product-
2026-06-08T14:00:22.7483350Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):                   : id, search-disabled-
2026-06-08T14:00:22.7483978Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):                   : repos, subscription-
2026-06-08T14:00:22.7484868Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):                   : manager
2026-06-08T14:00:22.7705271Z 
2026-06-08T14:00:22.7706918Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): This system is not registered with an entitlement server. You can use subscription-manager to register.
2026-06-08T14:00:22.7707341Z 
2026-06-08T14:00:22.8716271Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): O pacote openldap-2.4.44-22.el7.x86_64 já está instalado em sua última versão
2026-06-08T14:00:22.8873387Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): O pacote openldap-clients-2.4.44-22.el7.x86_64 já está instalado em sua última versão
2026-06-08T14:00:22.9072283Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): O pacote nss-pam-ldapd-0.8.13-25.el7.x86_64 já está instalado em sua última versão
2026-06-08T14:00:22.9141025Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): O pacote oddjob-mkhomedir-0.31.5-4.el7.x86_64 já está instalado em sua última versão
2026-06-08T14:00:22.9141781Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Nada a ser feito
2026-06-08T14:00:22.9362951Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): --2026-06-08 11:00:23--  http://10.122.154.12/repos/rhel7/openldap/nslcd.conf
2026-06-08T14:00:22.9374139Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Conectando-se a 10.122.154.12:80... conectado.
2026-06-08T14:00:22.9388328Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): A requisição HTTP foi enviada, aguardando resposta... 200 OK
2026-06-08T14:00:22.9389324Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Tamanho: 6172 (6,0K) [text/plain]
2026-06-08T14:00:22.9392866Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Salvando em: “/etc/nslcd.conf”
2026-06-08T14:00:22.9393059Z 
2026-06-08T14:00:22.9393538Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):  0%  0           --.-K/s
2026-06-08T14:00:22.9393840Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): 100% 6.172       --.-K/s   em 0s
2026-06-08T14:00:22.9393927Z 
2026-06-08T14:00:22.9394222Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): 2026-06-08 11:00:23 (484 MB/s) - “/etc/nslcd.conf” salvo [6172/6172]
2026-06-08T14:00:22.9394347Z 
2026-06-08T14:00:22.9430618Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): --2026-06-08 11:00:23--  http://10.122.154.12/repos/rhel7/openldap/ldapclient.pem
2026-06-08T14:00:22.9437985Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Conectando-se a 10.122.154.12:80... conectado.
2026-06-08T14:00:22.9447831Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): A requisição HTTP foi enviada, aguardando resposta... 200 OK
2026-06-08T14:00:22.9448448Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Tamanho: 884
2026-06-08T14:00:22.9449314Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Salvando em: “/etc/ssl/certs/ldapclient.pem”
2026-06-08T14:00:22.9449486Z 
2026-06-08T14:00:22.9449732Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):  0%  0           --.-K/s
2026-06-08T14:00:22.9450020Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): 100% 884         --.-K/s   em 0s
2026-06-08T14:00:22.9450137Z 
2026-06-08T14:00:22.9450437Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): 2026-06-08 11:00:23 (459 MB/s) - “/etc/ssl/certs/ldapclient.pem” salvo [884/884]
2026-06-08T14:00:22.9450561Z 
2026-06-08T14:00:22.9468710Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): --2026-06-08 11:00:23--  http://10.122.154.12/repos/rhel7/openldap/sudo-ldap.conf
2026-06-08T14:00:22.9472311Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Conectando-se a 10.122.154.12:80... conectado.
2026-06-08T14:00:22.9488814Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): A requisição HTTP foi enviada, aguardando resposta... 200 OK
2026-06-08T14:00:22.9489187Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Tamanho: 3294 (3,2K) [text/plain]
2026-06-08T14:00:22.9489517Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Salvando em: “/etc/sudo-ldap.conf”
2026-06-08T14:00:22.9489621Z 
2026-06-08T14:00:22.9489847Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):  0%  0           --.-K/s
2026-06-08T14:00:22.9490121Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): 100% 3.294       --.-K/s   em 0s
2026-06-08T14:00:22.9490267Z 
2026-06-08T14:00:22.9490715Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): 2026-06-08 11:00:23 (659 MB/s) - “/etc/sudo-ldap.conf” salvo [3294/3294]
2026-06-08T14:00:22.9490836Z 
2026-06-08T14:00:22.9536005Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ## BINDDN DN
2026-06-08T14:00:22.9536454Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  The BINDDN parameter specifies the identity, in the form of a Dis‐
2026-06-08T14:00:22.9537119Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  tinguished Name (DN), to use when performing LDAP operations.  If
2026-06-08T14:00:22.9537519Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  not specified, LDAP operations are performed with an anonymous
2026-06-08T14:00:22.9537954Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  identity.  By default, most LDAP servers will allow anonymous
2026-06-08T14:00:22.9538319Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  access.
2026-06-08T14:00:22.9538583Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##
2026-06-08T14:00:22.9538941Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #binddn uid=sudo,cn=sysaccounts,cn=etc,dc=example,dc=com
2026-06-08T14:00:22.9539094Z 
2026-06-08T14:00:22.9539704Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ## BINDPW secret
2026-06-08T14:00:22.9540302Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  The BINDPW parameter specifies the password to use when performing
2026-06-08T14:00:22.9540925Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  LDAP operations.  This is typically used in conjunction with the
2026-06-08T14:00:22.9541320Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  BINDDN parameter.
2026-06-08T14:00:22.9541585Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##
2026-06-08T14:00:22.9541838Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #bindpw secret
2026-06-08T14:00:22.9541926Z 
2026-06-08T14:00:22.9542149Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ## SSL start_tls
2026-06-08T14:00:22.9542466Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  If the SSL parameter is set to start_tls, the LDAP server connec‐
2026-06-08T14:00:22.9543103Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  tion is initiated normally and TLS encryption is begun before the
2026-06-08T14:00:22.9543648Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  bind credentials are sent.  This has the advantage of not requiring
2026-06-08T14:00:22.9544348Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  a dedicated port for encrypted communications.  This parameter is
2026-06-08T14:00:22.9544963Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  only supported by LDAP servers that honor the start_tls extension,
2026-06-08T14:00:22.9545301Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  such as the OpenLDAP and Tivoli Directory servers.
2026-06-08T14:00:22.9545614Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##
2026-06-08T14:00:22.9545878Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #ssl start_tls
2026-06-08T14:00:22.9545961Z 
2026-06-08T14:00:22.9546192Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ## TLS_CACERTFILE file name
2026-06-08T14:00:22.9546780Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  The path to a certificate authority bundle which contains the cer‐
2026-06-08T14:00:22.9547741Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  tificates for all the Certificate Authorities the client knows to
2026-06-08T14:00:22.9548228Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  be valid, e.g. /etc/ssl/ca-bundle.pem.  This option is only sup‐
2026-06-08T14:00:22.9548851Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  ported by the OpenLDAP libraries.  Netscape-derived LDAP libraries
2026-06-08T14:00:22.9549447Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  use the same certificate database for CA and client certificates
2026-06-08T14:00:22.9549831Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  (see TLS_CERT).
2026-06-08T14:00:22.9550158Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##
2026-06-08T14:00:22.9550430Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #tls_cacertfile /path/to/CA.crt
2026-06-08T14:00:22.9550816Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): tls_cacertdir /etc/ssl/certs/
2026-06-08T14:00:22.9550958Z 
2026-06-08T14:00:22.9551318Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ## TLS_CHECKPEER on/true/yes/off/false/no
2026-06-08T14:00:22.9551818Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  If enabled, TLS_CHECKPEER will cause the LDAP server's TLS certifi‐
2026-06-08T14:00:22.9552319Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  cated to be verified.  If the server's TLS certificate cannot be
2026-06-08T14:00:22.9553068Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  verified (usually because it is signed by an unknown certificate
2026-06-08T14:00:22.9553571Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  authority), sudo will be unable to connect to it.  If TLS_CHECKPEER
2026-06-08T14:00:22.9553985Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  is disabled, no check is made.  Note that disabling the check cre‐
2026-06-08T14:00:22.9554314Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  ates an opportunity for man-in-the-middle attacks since the
2026-06-08T14:00:22.9554697Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  server's identity will not be authenticated.  If possible, the CA's
2026-06-08T14:00:22.9555110Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  certificate should be installed locally so it can be verified.
2026-06-08T14:00:22.9555680Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  This option is not supported by the Tivoli Directory Server LDAP
2026-06-08T14:00:22.9556094Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  libraries.
2026-06-08T14:00:22.9556391Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): tls_checkpeer no
2026-06-08T14:00:22.9556475Z 
2026-06-08T14:00:22.9556843Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##
2026-06-08T14:00:22.9557265Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ## URI ldap[s]://[hostname[:port]] ...
2026-06-08T14:00:22.9557940Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  Specifies a whitespace-delimited list of one or more
2026-06-08T14:00:22.9558252Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  URIs describing the LDAP server(s) to connect to.
2026-06-08T14:00:22.9558928Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##
2026-06-08T14:00:22.9559247Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #uri ldap://ldapserver
2026-06-08T14:00:22.9559534Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): uri ldaps://10.192.192.78/
2026-06-08T14:00:22.9559659Z 
2026-06-08T14:00:22.9559867Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##
2026-06-08T14:00:22.9560301Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ## SUDOERS_BASE base
2026-06-08T14:00:22.9561026Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  The base DN to use when performing sudo LDAP queries.
2026-06-08T14:00:22.9561613Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  Multiple SUDOERS_BASE lines may be specified, in which
2026-06-08T14:00:22.9561944Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  case they are queried in the order specified.
2026-06-08T14:00:22.9562212Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##
2026-06-08T14:00:22.9562536Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #sudoers_base ou=SUDOers,dc=example,dc=com
2026-06-08T14:00:22.9563029Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): sudoers_base ou=Sudo,o=caixa
2026-06-08T14:00:22.9563159Z 
2026-06-08T14:00:22.9563368Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##
2026-06-08T14:00:22.9563629Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ## BIND_TIMELIMIT seconds
2026-06-08T14:00:22.9563937Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  The BIND_TIMELIMIT parameter specifies the amount of
2026-06-08T14:00:22.9564261Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  time to wait while trying to connect to an LDAP server.
2026-06-08T14:00:22.9564618Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##
2026-06-08T14:00:22.9564878Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #bind_timelimit 30
2026-06-08T14:00:22.9565142Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): bind_timelimit 3
2026-06-08T14:00:22.9565261Z 
2026-06-08T14:00:22.9565529Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##
2026-06-08T14:00:22.9565893Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ## TIMELIMIT seconds
2026-06-08T14:00:22.9566195Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  The TIMELIMIT parameter specifies the amount of time
2026-06-08T14:00:22.9566585Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  to wait for a response to an LDAP query.
2026-06-08T14:00:22.9566838Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##
2026-06-08T14:00:22.9567098Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #timelimit 30
2026-06-08T14:00:22.9567423Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): timelimit 3
2026-06-08T14:00:22.9567528Z 
2026-06-08T14:00:22.9567731Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##
2026-06-08T14:00:22.9567994Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ## SUDOERS_DEBUG debug_level
2026-06-08T14:00:22.9568400Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  This sets the debug level for sudo LDAP queries. Debugging
2026-06-08T14:00:22.9568790Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  information is printed to the standard error. A value of 1
2026-06-08T14:00:22.9569107Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  results in a moderate amount of debugging information.
2026-06-08T14:00:22.9569420Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  A value of 2 shows the results of the matches themselves.
2026-06-08T14:00:22.9569723Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##
2026-06-08T14:00:22.9570031Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #sudoers_debug 1
2026-06-08T14:00:22.9570289Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ## BINDDN DN
2026-06-08T14:00:22.9570702Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  The BINDDN parameter specifies the identity, in the form of a Dis‐
2026-06-08T14:00:22.9571228Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  tinguished Name (DN), to use when performing LDAP operations.  If
2026-06-08T14:00:22.9571569Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  not specified, LDAP operations are performed with an anonymous
2026-06-08T14:00:22.9571892Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  identity.  By default, most LDAP servers will allow anonymous
2026-06-08T14:00:22.9572162Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  access.
2026-06-08T14:00:22.9572442Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##
2026-06-08T14:00:22.9572807Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #binddn uid=sudo,cn=sysaccounts,cn=etc,dc=example,dc=com
2026-06-08T14:00:22.9572916Z 
2026-06-08T14:00:22.9573216Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ## BINDPW secret
2026-06-08T14:00:22.9573528Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  The BINDPW parameter specifies the password to use when performing
2026-06-08T14:00:22.9573853Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  LDAP operations.  This is typically used in conjunction with the
2026-06-08T14:00:22.9574145Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  BINDDN parameter.
2026-06-08T14:00:22.9574428Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##
2026-06-08T14:00:22.9574697Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #bindpw secret
2026-06-08T14:00:22.9574779Z 
2026-06-08T14:00:22.9575053Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ## SSL start_tls
2026-06-08T14:00:22.9575575Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  If the SSL parameter is set to start_tls, the LDAP server connec‐
2026-06-08T14:00:22.9575908Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  tion is initiated normally and TLS encryption is begun before the
2026-06-08T14:00:22.9576234Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  bind credentials are sent.  This has the advantage of not requiring
2026-06-08T14:00:22.9576609Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  a dedicated port for encrypted communications.  This parameter is
2026-06-08T14:00:22.9576943Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  only supported by LDAP servers that honor the start_tls extension,
2026-06-08T14:00:22.9577261Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  such as the OpenLDAP and Tivoli Directory servers.
2026-06-08T14:00:22.9577587Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##
2026-06-08T14:00:22.9577838Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #ssl start_tls
2026-06-08T14:00:22.9577917Z 
2026-06-08T14:00:22.9578150Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ## TLS_CACERTFILE file name
2026-06-08T14:00:22.9578492Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  The path to a certificate authority bundle which contains the cer‐
2026-06-08T14:00:22.9580103Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  tificates for all the Certificate Authorities the client knows to
2026-06-08T14:00:22.9580626Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  be valid, e.g. /etc/ssl/ca-bundle.pem.  This option is only sup‐
2026-06-08T14:00:22.9580998Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  ported by the OpenLDAP libraries.  Netscape-derived LDAP libraries
2026-06-08T14:00:22.9581335Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  use the same certificate database for CA and client certificates
2026-06-08T14:00:22.9581616Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  (see TLS_CERT).
2026-06-08T14:00:22.9581908Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##
2026-06-08T14:00:22.9582202Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #tls_cacertfile /path/to/CA.crt
2026-06-08T14:00:22.9582480Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): tls_cacertdir /etc/ssl/certs/
2026-06-08T14:00:22.9582652Z 
2026-06-08T14:00:22.9582891Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ## TLS_CHECKPEER on/true/yes/off/false/no
2026-06-08T14:00:22.9583669Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  If enabled, TLS_CHECKPEER will cause the LDAP server's TLS certifi‐
2026-06-08T14:00:22.9584401Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  cated to be verified.  If the server's TLS certificate cannot be
2026-06-08T14:00:22.9584744Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  verified (usually because it is signed by an unknown certificate
2026-06-08T14:00:22.9585172Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  authority), sudo will be unable to connect to it.  If TLS_CHECKPEER
2026-06-08T14:00:22.9585718Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  is disabled, no check is made.  Note that disabling the check cre‐
2026-06-08T14:00:22.9586043Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  ates an opportunity for man-in-the-middle attacks since the
2026-06-08T14:00:22.9586788Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  server's identity will not be authenticated.  If possible, the CA's
2026-06-08T14:00:22.9587117Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  certificate should be installed locally so it can be verified.
2026-06-08T14:00:22.9587448Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  This option is not supported by the Tivoli Directory Server LDAP
2026-06-08T14:00:22.9587733Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  libraries.
2026-06-08T14:00:22.9587991Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): tls_checkpeer no
2026-06-08T14:00:22.9588074Z 
2026-06-08T14:00:22.9588576Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##
2026-06-08T14:00:22.9588987Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ## URI ldap[s]://[hostname[:port]] ...
2026-06-08T14:00:22.9589703Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  Specifies a whitespace-delimited list of one or more
2026-06-08T14:00:22.9590123Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  URIs describing the LDAP server(s) to connect to.
2026-06-08T14:00:22.9590398Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##
2026-06-08T14:00:22.9590812Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #uri ldap://ldapserver
2026-06-08T14:00:22.9591087Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): uri ldaps://10.192.192.78/
2026-06-08T14:00:22.9591183Z 
2026-06-08T14:00:22.9591393Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##
2026-06-08T14:00:22.9591655Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ## SUDOERS_BASE base
2026-06-08T14:00:22.9591954Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  The base DN to use when performing sudo LDAP queries.
2026-06-08T14:00:22.9592438Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  Multiple SUDOERS_BASE lines may be specified, in which
2026-06-08T14:00:22.9593065Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  case they are queried in the order specified.
2026-06-08T14:00:22.9593365Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##
2026-06-08T14:00:22.9593652Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #sudoers_base ou=SUDOers,dc=example,dc=com
2026-06-08T14:00:22.9593942Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): sudoers_base ou=Sudo,o=caixa
2026-06-08T14:00:22.9594035Z 
2026-06-08T14:00:22.9594239Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##
2026-06-08T14:00:22.9595088Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ## BIND_TIMELIMIT seconds
2026-06-08T14:00:22.9595397Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  The BIND_TIMELIMIT parameter specifies the amount of
2026-06-08T14:00:22.9595970Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  time to wait while trying to connect to an LDAP server.
2026-06-08T14:00:22.9596318Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##
2026-06-08T14:00:22.9596577Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #bind_timelimit 30
2026-06-08T14:00:22.9596865Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): bind_timelimit 3
2026-06-08T14:00:22.9597033Z 
2026-06-08T14:00:22.9597238Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##
2026-06-08T14:00:22.9597497Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ## TIMELIMIT seconds
2026-06-08T14:00:22.9597877Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  The TIMELIMIT parameter specifies the amount of time
2026-06-08T14:00:22.9598186Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  to wait for a response to an LDAP query.
2026-06-08T14:00:22.9598448Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##
2026-06-08T14:00:22.9598699Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #timelimit 30
2026-06-08T14:00:22.9598991Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): timelimit 3
2026-06-08T14:00:22.9599075Z 
2026-06-08T14:00:22.9599279Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##
2026-06-08T14:00:22.9599585Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ## SUDOERS_DEBUG debug_level
2026-06-08T14:00:22.9599890Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  This sets the debug level for sudo LDAP queries. Debugging
2026-06-08T14:00:22.9601222Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  information is printed to the standard error. A value of 1
2026-06-08T14:00:22.9601746Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  results in a moderate amount of debugging information.
2026-06-08T14:00:22.9602304Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##  A value of 2 shows the results of the matches themselves.
2026-06-08T14:00:22.9602733Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ##
2026-06-08T14:00:22.9603079Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #sudoers_debug 1
2026-06-08T14:00:22.9604255Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): --2026-06-08 11:00:23--  http://10.122.154.12/repos/rhel7/openldap/nsswitch.conf
2026-06-08T14:00:22.9604624Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Conectando-se a 10.122.154.12:80... conectado.
2026-06-08T14:00:22.9605410Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): A requisição HTTP foi enviada, aguardando resposta... 200 OK
2026-06-08T14:00:22.9605837Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Tamanho: 1902 (1,9K) [text/plain]
2026-06-08T14:00:22.9606153Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Salvando em: “/etc/nsswitch.conf”
2026-06-08T14:00:22.9606257Z 
2026-06-08T14:00:22.9607446Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):  0%  0           --.-K/s
2026-06-08T14:00:22.9607750Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): 100% 1.902       --.-K/s   em 0s
2026-06-08T14:00:22.9607841Z 
2026-06-08T14:00:22.9608299Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): 2026-06-08 11:00:23 (651 MB/s) - “/etc/nsswitch.conf” salvo [1902/1902]
2026-06-08T14:00:22.9608417Z 
2026-06-08T14:00:22.9617144Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #
2026-06-08T14:00:22.9617441Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): # /etc/nsswitch.conf
2026-06-08T14:00:22.9617695Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #
2026-06-08T14:00:22.9619434Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): # An example Name Service Switch config file. This file should be
2026-06-08T14:00:22.9620239Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): # sorted with the most-used services at the beginning.
2026-06-08T14:00:22.9620678Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #
2026-06-08T14:00:22.9621165Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): # The entry '[NOTFOUND=return]' means that the search for an
2026-06-08T14:00:22.9621702Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): # entry should stop if the search in the previous entry turned
2026-06-08T14:00:22.9622252Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): # up nothing. Note that if the search failed due to some other reason
2026-06-08T14:00:22.9622897Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): # (like no NIS server responding) then the search continues with the
2026-06-08T14:00:22.9623380Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): # next entry.
2026-06-08T14:00:22.9623808Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #
2026-06-08T14:00:22.9624251Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): # Valid entries include:
2026-06-08T14:00:22.9624645Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #
2026-06-08T14:00:22.9625052Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #       nisplus                 Use NIS+ (NIS version 3)
2026-06-08T14:00:22.9625672Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #       nis                     Use NIS (NIS version 2), also called YP
2026-06-08T14:00:22.9626193Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #       dns                     Use DNS (Domain Name Service)
2026-06-08T14:00:22.9626687Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #       files                   Use the local files
2026-06-08T14:00:22.9627191Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #       db                      Use the local database (.db) files
2026-06-08T14:00:22.9627687Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #       compat                  Use NIS on compat mode
2026-06-08T14:00:22.9628186Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #       hesiod                  Use Hesiod for user lookups
2026-06-08T14:00:22.9628709Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #       [NOTFOUND=return]       Stop searching if not found so far
2026-06-08T14:00:22.9629156Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #
2026-06-08T14:00:22.9629294Z 
2026-06-08T14:00:22.9629724Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): # To use db, put the "db" in front of "files" for entries you want to be
2026-06-08T14:00:22.9630225Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): # looked up first in the databases
2026-06-08T14:00:22.9630645Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #
2026-06-08T14:00:22.9631075Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): # Example:
2026-06-08T14:00:22.9631529Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #passwd:    db files nisplus nis
2026-06-08T14:00:22.9631966Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #shadow:    db files nisplus nis
2026-06-08T14:00:22.9632404Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #group:     db files nisplus nis
2026-06-08T14:00:22.9632660Z 
2026-06-08T14:00:22.9633041Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): passwd:     files ldap
2026-06-08T14:00:22.9633493Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): shadow:     files ldap
2026-06-08T14:00:22.9633873Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): group:      files ldap
2026-06-08T14:00:22.9634207Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #initgroups: files
2026-06-08T14:00:22.9634294Z 
2026-06-08T14:00:22.9634531Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #hosts:     db files nisplus nis dns
2026-06-08T14:00:22.9634806Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): hosts:      files dns
2026-06-08T14:00:22.9634890Z 
2026-06-08T14:00:22.9635135Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): # Example - obey only what nisplus tells us...
2026-06-08T14:00:22.9635582Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #services:   nisplus [NOTFOUND=return] files
2026-06-08T14:00:22.9635923Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #networks:   nisplus [NOTFOUND=return] files
2026-06-08T14:00:22.9636210Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #protocols:  nisplus [NOTFOUND=return] files
2026-06-08T14:00:22.9636502Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #rpc:        nisplus [NOTFOUND=return] files
2026-06-08T14:00:22.9636869Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #ethers:     nisplus [NOTFOUND=return] files
2026-06-08T14:00:22.9637156Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #netmasks:   nisplus [NOTFOUND=return] files
2026-06-08T14:00:22.9637295Z 
2026-06-08T14:00:22.9637627Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): bootparams: nisplus [NOTFOUND=return] files
2026-06-08T14:00:22.9637787Z 
2026-06-08T14:00:22.9638094Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ethers:     files
2026-06-08T14:00:22.9638568Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): netmasks:   files
2026-06-08T14:00:22.9638943Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): networks:   files
2026-06-08T14:00:22.9639321Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): protocols:  files
2026-06-08T14:00:22.9639665Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): rpc:        files
2026-06-08T14:00:22.9639925Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): services:   files
2026-06-08T14:00:22.9640004Z 
2026-06-08T14:00:22.9640223Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): netgroup:   files ldap
2026-06-08T14:00:22.9640308Z 
2026-06-08T14:00:22.9640525Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): publickey:  nisplus
2026-06-08T14:00:22.9640624Z 
2026-06-08T14:00:22.9640831Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): automount:  files ldap
2026-06-08T14:00:22.9641097Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): aliases:    files nisplus
2026-06-08T14:00:22.9641355Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): sudoers:    ldap
2026-06-08T14:00:22.9641609Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #
2026-06-08T14:00:22.9641864Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): # /etc/nsswitch.conf
2026-06-08T14:00:22.9642107Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #
2026-06-08T14:00:22.9642410Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): # An example Name Service Switch config file. This file should be
2026-06-08T14:00:22.9642962Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): # sorted with the most-used services at the beginning.
2026-06-08T14:00:22.9643221Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #
2026-06-08T14:00:22.9643622Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): # The entry '[NOTFOUND=return]' means that the search for an
2026-06-08T14:00:22.9644094Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): # entry should stop if the search in the previous entry turned
2026-06-08T14:00:22.9644573Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): # up nothing. Note that if the search failed due to some other reason
2026-06-08T14:00:22.9645065Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): # (like no NIS server responding) then the search continues with the
2026-06-08T14:00:22.9645576Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): # next entry.
2026-06-08T14:00:22.9646037Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #
2026-06-08T14:00:22.9646429Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): # Valid entries include:
2026-06-08T14:00:22.9646801Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #
2026-06-08T14:00:22.9647341Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #       nisplus                 Use NIS+ (NIS version 3)
2026-06-08T14:00:22.9647829Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #       nis                     Use NIS (NIS version 2), also called YP
2026-06-08T14:00:22.9648349Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #       dns                     Use DNS (Domain Name Service)
2026-06-08T14:00:22.9648774Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #       files                   Use the local files
2026-06-08T14:00:22.9649226Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #       db                      Use the local database (.db) files
2026-06-08T14:00:22.9649664Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #       compat                  Use NIS on compat mode
2026-06-08T14:00:22.9650118Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #       hesiod                  Use Hesiod for user lookups
2026-06-08T14:00:22.9650579Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #       [NOTFOUND=return]       Stop searching if not found so far
2026-06-08T14:00:22.9650940Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #
2026-06-08T14:00:22.9651051Z 
2026-06-08T14:00:22.9651419Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): # To use db, put the "db" in front of "files" for entries you want to be
2026-06-08T14:00:22.9651875Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): # looked up first in the databases
2026-06-08T14:00:22.9652273Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #
2026-06-08T14:00:22.9652786Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): # Example:
2026-06-08T14:00:22.9653303Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #passwd:    db files nisplus nis
2026-06-08T14:00:22.9653758Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #shadow:    db files nisplus nis
2026-06-08T14:00:22.9654217Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #group:     db files nisplus nis
2026-06-08T14:00:22.9654594Z 
2026-06-08T14:00:22.9654962Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): passwd:     files ldap
2026-06-08T14:00:22.9655511Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): shadow:     files ldap
2026-06-08T14:00:22.9655960Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): group:      files ldap
2026-06-08T14:00:22.9656407Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #initgroups: files
2026-06-08T14:00:22.9656534Z 
2026-06-08T14:00:22.9656865Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #hosts:     db files nisplus nis dns
2026-06-08T14:00:22.9657255Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): hosts:      files dns
2026-06-08T14:00:22.9657349Z 
2026-06-08T14:00:22.9657596Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): # Example - obey only what nisplus tells us...
2026-06-08T14:00:22.9657900Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #services:   nisplus [NOTFOUND=return] files
2026-06-08T14:00:22.9658181Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #networks:   nisplus [NOTFOUND=return] files
2026-06-08T14:00:22.9658475Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #protocols:  nisplus [NOTFOUND=return] files
2026-06-08T14:00:22.9658766Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #rpc:        nisplus [NOTFOUND=return] files
2026-06-08T14:00:22.9659178Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #ethers:     nisplus [NOTFOUND=return] files
2026-06-08T14:00:22.9659462Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #netmasks:   nisplus [NOTFOUND=return] files
2026-06-08T14:00:22.9659561Z 
2026-06-08T14:00:22.9659813Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): bootparams: nisplus [NOTFOUND=return] files
2026-06-08T14:00:22.9659904Z 
2026-06-08T14:00:22.9660117Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ethers:     files
2026-06-08T14:00:22.9660374Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): netmasks:   files
2026-06-08T14:00:22.9660630Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): networks:   files
2026-06-08T14:00:22.9660886Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): protocols:  files
2026-06-08T14:00:22.9661136Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): rpc:        files
2026-06-08T14:00:22.9661378Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): services:   files
2026-06-08T14:00:22.9661456Z 
2026-06-08T14:00:22.9661668Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): netgroup:   files ldap
2026-06-08T14:00:22.9661749Z 
2026-06-08T14:00:22.9661961Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): publickey:  nisplus
2026-06-08T14:00:22.9662100Z 
2026-06-08T14:00:22.9662339Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): automount:  files ldap
2026-06-08T14:00:22.9662676Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): aliases:    files nisplus
2026-06-08T14:00:22.9662956Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): sudoers:    ldap
2026-06-08T14:00:22.9663321Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): --2026-06-08 11:00:23--  http://10.122.154.12/repos/rhel7/openldap/system-auth-ac
2026-06-08T14:00:22.9663654Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Conectando-se a 10.122.154.12:80... conectado.
2026-06-08T14:00:22.9664039Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): A requisição HTTP foi enviada, aguardando resposta... 200 OK
2026-06-08T14:00:22.9664345Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Tamanho: 1259 (1,2K) [text/plain]
2026-06-08T14:00:22.9664652Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Salvando em: “/etc/pam.d/system-auth-ac”
2026-06-08T14:00:22.9664752Z 
2026-06-08T14:00:22.9664985Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):  0%  0           --.-K/s
2026-06-08T14:00:22.9665250Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): 100% 1.259       --.-K/s   em 0s
2026-06-08T14:00:22.9665335Z 
2026-06-08T14:00:22.9665612Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): 2026-06-08 11:00:23 (591 MB/s) - “/etc/pam.d/system-auth-ac” salvo [1259/1259]
2026-06-08T14:00:22.9665732Z 
2026-06-08T14:00:22.9697309Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #%PAM-1.0
2026-06-08T14:00:22.9697628Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): # This file is auto-generated.
2026-06-08T14:00:22.9697945Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): # User changes will be destroyed the next time authconfig is run.
2026-06-08T14:00:22.9698250Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): auth        required      pam_env.so
2026-06-08T14:00:22.9699370Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): auth        sufficient    pam_unix.so nullok try_first_pass
2026-06-08T14:00:22.9700176Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): auth        requisite     pam_succeed_if.so uid >= 1000 quiet_success
2026-06-08T14:00:22.9700821Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): auth        sufficient    pam_ldap.so use_first_pass
2026-06-08T14:00:22.9701266Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): auth        required      pam_deny.so
2026-06-08T14:00:22.9701408Z 
2026-06-08T14:00:22.9701655Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): account     required      pam_unix.so broken_shadow
2026-06-08T14:00:22.9702017Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): account     sufficient    pam_localuser.so
2026-06-08T14:00:22.9702328Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): account     sufficient    pam_succeed_if.so uid < 1000 quiet
2026-06-08T14:00:22.9702746Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): account     [default=bad success=ok user_unknown=ignore] pam_ldap.so
2026-06-08T14:00:22.9703065Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): account     required      pam_permit.so
2026-06-08T14:00:22.9703162Z 
2026-06-08T14:00:22.9703542Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): password    requisite     pam_pwquality.so try_first_pass local_users_only retry=3 authtok_type=
2026-06-08T14:00:22.9703986Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): password    sufficient    pam_unix.so sha512 shadow nullok try_first_pass use_authtok
2026-06-08T14:00:22.9704356Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): password    sufficient    pam_ldap.so use_authtok
2026-06-08T14:00:22.9704744Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): password    required      pam_deny.so
2026-06-08T14:00:22.9704831Z 
2026-06-08T14:00:22.9705162Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): session     optional      pam_keyinit.so revoke
2026-06-08T14:00:22.9705542Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): session     required      pam_limits.so
2026-06-08T14:00:22.9705827Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): -session     optional      pam_systemd.so
2026-06-08T14:00:22.9706286Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): session     optional      pam_oddjob_mkhomedir.so umask=0077
2026-06-08T14:00:22.9706792Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): session     [success=1 default=ignore] pam_succeed_if.so service in crond quiet use_uid
2026-06-08T14:00:22.9707107Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): session     required      pam_unix.so
2026-06-08T14:00:22.9707391Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): session     optional      pam_ldap.so
2026-06-08T14:00:22.9707652Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #%PAM-1.0
2026-06-08T14:00:22.9707925Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): # This file is auto-generated.
2026-06-08T14:00:22.9712253Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): # User changes will be destroyed the next time authconfig is run.
2026-06-08T14:00:22.9712922Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): auth        required      pam_env.so
2026-06-08T14:00:22.9713310Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): auth        sufficient    pam_unix.so nullok try_first_pass
2026-06-08T14:00:22.9713627Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): auth        requisite     pam_succeed_if.so uid >= 1000 quiet_success
2026-06-08T14:00:22.9713934Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): auth        sufficient    pam_ldap.so use_first_pass
2026-06-08T14:00:22.9714218Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): auth        required      pam_deny.so
2026-06-08T14:00:22.9714301Z 
2026-06-08T14:00:22.9714541Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): account     required      pam_unix.so broken_shadow
2026-06-08T14:00:22.9714830Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): account     sufficient    pam_localuser.so
2026-06-08T14:00:22.9715131Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): account     sufficient    pam_succeed_if.so uid < 1000 quiet
2026-06-08T14:00:22.9715443Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): account     [default=bad success=ok user_unknown=ignore] pam_ldap.so
2026-06-08T14:00:22.9715738Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): account     required      pam_permit.so
2026-06-08T14:00:22.9715827Z 
2026-06-08T14:00:22.9716121Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): password    requisite     pam_pwquality.so try_first_pass local_users_only retry=3 authtok_type=
2026-06-08T14:00:22.9716480Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): password    sufficient    pam_unix.so sha512 shadow nullok try_first_pass use_authtok
2026-06-08T14:00:22.9716797Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): password    sufficient    pam_ldap.so use_authtok
2026-06-08T14:00:22.9717084Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): password    required      pam_deny.so
2026-06-08T14:00:22.9717175Z 
2026-06-08T14:00:22.9717413Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): session     optional      pam_keyinit.so revoke
2026-06-08T14:00:22.9717738Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): session     required      pam_limits.so
2026-06-08T14:00:22.9718021Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): -session     optional      pam_systemd.so
2026-06-08T14:00:22.9718319Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): session     optional      pam_oddjob_mkhomedir.so umask=0077
2026-06-08T14:00:22.9718810Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): session     [success=1 default=ignore] pam_succeed_if.so service in crond quiet use_uid
2026-06-08T14:00:22.9719122Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): session     required      pam_unix.so
2026-06-08T14:00:22.9719399Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): session     optional      pam_ldap.so
2026-06-08T14:00:22.9719939Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): --2026-06-08 11:00:23--  http://10.122.154.12/repos/rhel7/openldap/password-auth-ac
2026-06-08T14:00:22.9728612Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Conectando-se a 10.122.154.12:80... conectado.
2026-06-08T14:00:22.9741975Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): A requisição HTTP foi enviada, aguardando resposta... 200 OK
2026-06-08T14:00:22.9742484Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Tamanho: 1259 (1,2K) [text/plain]
2026-06-08T14:00:22.9743378Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): Salvando em: “/etc/pam.d/password-auth-ac”
2026-06-08T14:00:22.9743534Z 
2026-06-08T14:00:22.9743864Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec):  0%  0           --.-K/s
2026-06-08T14:00:22.9744285Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): 100% 1.259       --.-K/s   em 0s
2026-06-08T14:00:22.9744429Z 
2026-06-08T14:00:22.9744870Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): 2026-06-08 11:00:23 (644 MB/s) - “/etc/pam.d/password-auth-ac” salvo [1259/1259]
2026-06-08T14:00:22.9745062Z 
2026-06-08T14:00:22.9788040Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #%PAM-1.0
2026-06-08T14:00:22.9788380Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): # This file is auto-generated.
2026-06-08T14:00:22.9788715Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): # User changes will be destroyed the next time authconfig is run.
2026-06-08T14:00:22.9789020Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): auth        required      pam_env.so
2026-06-08T14:00:22.9790429Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): auth        sufficient    pam_unix.so nullok try_first_pass
2026-06-08T14:00:22.9790821Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): auth        requisite     pam_succeed_if.so uid >= 1000 quiet_success
2026-06-08T14:00:22.9791151Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): auth        sufficient    pam_ldap.so use_first_pass
2026-06-08T14:00:22.9791446Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): auth        required      pam_deny.so
2026-06-08T14:00:22.9791646Z 
2026-06-08T14:00:22.9791915Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): account     required      pam_unix.so broken_shadow
2026-06-08T14:00:22.9792699Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): account     sufficient    pam_localuser.so
2026-06-08T14:00:22.9793024Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): account     sufficient    pam_succeed_if.so uid < 1000 quiet
2026-06-08T14:00:22.9793548Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): account     [default=bad success=ok user_unknown=ignore] pam_ldap.so
2026-06-08T14:00:22.9793854Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): account     required      pam_permit.so
2026-06-08T14:00:22.9794086Z 
2026-06-08T14:00:22.9794434Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): password    requisite     pam_pwquality.so try_first_pass local_users_only retry=3 authtok_type=
2026-06-08T14:00:22.9794805Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): password    sufficient    pam_unix.so sha512 shadow nullok try_first_pass use_authtok
2026-06-08T14:00:22.9795252Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): password    sufficient    pam_ldap.so use_authtok
2026-06-08T14:00:22.9795695Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): password    required      pam_deny.so
2026-06-08T14:00:22.9795853Z 
2026-06-08T14:00:22.9796218Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): session     optional      pam_keyinit.so revoke
2026-06-08T14:00:22.9813075Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): session     required      pam_limits.so
2026-06-08T14:00:22.9813414Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): -session     optional      pam_systemd.so
2026-06-08T14:00:22.9813953Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): session     optional      pam_oddjob_mkhomedir.so umask=0077
2026-06-08T14:00:22.9814291Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): session     [success=1 default=ignore] pam_succeed_if.so service in crond quiet use_uid
2026-06-08T14:00:22.9814610Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): session     required      pam_unix.so
2026-06-08T14:00:22.9814884Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): session     optional      pam_ldap.so
2026-06-08T14:00:22.9815160Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): #%PAM-1.0
2026-06-08T14:00:22.9815432Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): # This file is auto-generated.
2026-06-08T14:00:22.9815742Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): # User changes will be destroyed the next time authconfig is run.
2026-06-08T14:00:22.9816039Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): auth        required      pam_env.so
2026-06-08T14:00:22.9816335Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): auth        sufficient    pam_unix.so nullok try_first_pass
2026-06-08T14:00:22.9816653Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): auth        requisite     pam_succeed_if.so uid >= 1000 quiet_success
2026-06-08T14:00:22.9816955Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): auth        sufficient    pam_ldap.so use_first_pass
2026-06-08T14:00:22.9817346Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): auth        required      pam_deny.so
2026-06-08T14:00:22.9817458Z 
2026-06-08T14:00:22.9817737Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): account     required      pam_unix.so broken_shadow
2026-06-08T14:00:22.9818151Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): account     sufficient    pam_localuser.so
2026-06-08T14:00:22.9818547Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): account     sufficient    pam_succeed_if.so uid < 1000 quiet
2026-06-08T14:00:22.9818940Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): account     [default=bad success=ok user_unknown=ignore] pam_ldap.so
2026-06-08T14:00:22.9819241Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): account     required      pam_permit.so
2026-06-08T14:00:22.9819340Z 
2026-06-08T14:00:22.9820059Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): password    requisite     pam_pwquality.so try_first_pass local_users_only retry=3 authtok_type=
2026-06-08T14:00:22.9826416Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): password    sufficient    pam_unix.so sha512 shadow nullok try_first_pass use_authtok
2026-06-08T14:00:22.9826801Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): password    sufficient    pam_ldap.so use_authtok
2026-06-08T14:00:22.9827090Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): password    required      pam_deny.so
2026-06-08T14:00:22.9827197Z 
2026-06-08T14:00:22.9827445Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): session     optional      pam_keyinit.so revoke
2026-06-08T14:00:22.9827738Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): session     required      pam_limits.so
2026-06-08T14:00:22.9828028Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): -session     optional      pam_systemd.so
2026-06-08T14:00:22.9828340Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): session     optional      pam_oddjob_mkhomedir.so umask=0077
2026-06-08T14:00:22.9829116Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): session     [success=1 default=ignore] pam_succeed_if.so service in crond quiet use_uid
2026-06-08T14:00:22.9829437Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): session     required      pam_unix.so
2026-06-08T14:00:22.9829722Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): session     optional      pam_ldap.so
2026-06-08T14:00:23.2409142Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): getsebool:  SELinux is disabled
2026-06-08T14:00:23.3909739Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): root:x:0:0:root:/root:/bin/bash
2026-06-08T14:00:23.3910201Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): bin:x:1:1:bin:/bin:/sbin/nologin
2026-06-08T14:00:23.3910718Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): daemon:x:2:2:daemon:/sbin:/sbin/nologin
2026-06-08T14:00:23.3911148Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): adm:x:3:4:adm:/var/adm:/sbin/nologin
2026-06-08T14:00:23.3911450Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): lp:x:4:7:lp:/var/spool/lpd:/sbin/nologin
2026-06-08T14:00:23.3911755Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): sync:x:5:0:sync:/sbin:/bin/sync
2026-06-08T14:00:23.3912118Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): shutdown:x:6:0:shutdown:/sbin:/sbin/shutdown
2026-06-08T14:00:23.3912408Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): halt:x:7:0:halt:/sbin:/sbin/halt
2026-06-08T14:00:23.3912964Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): mail:x:8:12:mail:/var/spool/mail:/sbin/nologin
2026-06-08T14:00:23.3913296Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): operator:x:11:0:operator:/root:/sbin/nologin
2026-06-08T14:00:23.3913701Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): games:x:12:100:games:/usr/games:/sbin/nologin
2026-06-08T14:00:23.3914503Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ftp:x:14:50:FTP User:/var/ftp:/sbin/nologin
2026-06-08T14:00:23.3914875Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): nobody:x:99:99:Nobody:/:/sbin/nologin
2026-06-08T14:00:23.3915228Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): systemd-network:x:192:192:systemd Network Management:/:/sbin/nologin
2026-06-08T14:00:23.3915558Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): dbus:x:81:81:System message bus:/:/sbin/nologin
2026-06-08T14:00:23.3915879Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): polkitd:x:999:998:User for polkitd:/:/sbin/nologin
2026-06-08T14:00:23.3916230Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): libstoragemgmt:x:998:997:daemon account for libstoragemgmt:/var/run/lsm:/sbin/nologin
2026-06-08T14:00:23.3916599Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): abrt:x:173:173::/etc/abrt:/sbin/nologin
2026-06-08T14:00:23.3916969Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): saslauth:x:997:76:Saslauthd user:/run/saslauthd:/sbin/nologin
2026-06-08T14:00:23.3917302Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): rpc:x:32:32:Rpcbind Daemon:/var/lib/rpcbind:/sbin/nologin
2026-06-08T14:00:23.3917617Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): nscd:x:28:28:NSCD Daemon:/:/sbin/nologin
2026-06-08T14:00:23.3918020Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): nslcd:x:65:55:LDAP Client User:/:/sbin/nologin
2026-06-08T14:00:23.3918778Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): sshd:x:74:74:Privilege-separated SSH:/var/empty/sshd:/sbin/nologin
2026-06-08T14:00:23.3919329Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): postfix:x:89:89::/var/spool/postfix:/sbin/nologin
2026-06-08T14:00:23.3919653Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): chrony:x:996:995::/var/lib/chrony:/sbin/nologin
2026-06-08T14:00:23.3920413Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ntp:x:38:38::/etc/ntp:/sbin/nologin
2026-06-08T14:00:23.3920709Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): tcpdump:x:72:72::/:/sbin/nologin
2026-06-08T14:00:23.3921149Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): admin:x:1000:1000:admin:/home/admin:/bin/bash
2026-06-08T14:00:23.3921699Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): jboss:x:9999:9999::/home/jboss:/bin/bash
2026-06-08T14:00:23.3923066Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): apache:x:48:48::/home/apache:/bin/bash
2026-06-08T14:00:23.3923497Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): prometheus:x:9998:9998::/home/prometheus:/bin/bash
2026-06-08T14:00:23.3923958Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): zabbix:x:995:994:Zabbix Monitoring System:/var/lib/zabbix:/sbin/nologin
2026-06-08T14:00:23.3995962Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spaddbp2:x:30000490:30000489:Conta de servico para acessar a Role do ADDM:/home/spaddbp2:/bin/bash
2026-06-08T14:00:23.3996423Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): jboss:x:30000115:30000115:Conta.de.instalacao.do.JBoss:/home/jboss:/bin/bash
2026-06-08T14:00:23.3996870Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): saospb01:x:20002515:30000004:Usuario de monitoracao de Ativos - CEPTIBR21:/home/saospb01:/bin/bash
2026-06-08T14:00:23.3997256Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a037033:x:10037033:30000004:Emilio Hirasawa - CNOPEBR21 - Analista:/home/a037033:/bin/bash
2026-06-08T14:00:23.3997989Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a054346:x:10054346:30000001:Luiz Eduardo Prata de Pinho Tavares:/home/a054346:/bin/bash
2026-06-08T14:00:23.3998397Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a060739:x:10060739:30000004:Flavio Tulio Cortes dos Santos Machado:/home/a060739:/bin/bash
2026-06-08T14:00:23.3998779Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a065023:x:10065023:30000001:Andre Luis Castro Nascimento - CNOPEBR05:/home/a065023:/bin/bash
2026-06-08T14:00:23.3999184Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a078609:x:10078609:30000004:Elaine Fernades Albernaz Ferreira:/home/a078609:/bin/bash
2026-06-08T14:00:23.3999580Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a080014:x:10080014:30000004:Andrea Karla de Oliveira Sodre - CNOPEBR21 - Analista:/home/a080014:/bin/bash
2026-06-08T14:00:23.3999969Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a081005:x:10081005:30000001:Emerson de Souza Albuquerque:/home/a081005:/bin/bash
2026-06-08T14:00:23.4000525Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a098753:x:10098753:30000004:Guilherme Roberto Alves Shiga:/home/a098753:/bin/bash
2026-06-08T14:00:23.4002705Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a111834:x:10111834:30000001:Elano Falcao Lima Filho:/home/a111834:/bin/bash
2026-06-08T14:00:23.4003374Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a113771:x:10113771:30000001:Nayanne Teixeira Canuto - REROPBR05 - TBN:/home/a113771:/bin/bash
2026-06-08T14:00:23.4003807Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a127227:x:10127227:30000004:Felipe Roberto Silva - CNOPEBR21 - Analista:/home/a127227:/bin/bash
2026-06-08T14:00:23.4004186Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a129784:x:10129784:30000004:Elaine Almeida Xavier Oliveira:/home/a129784:/bin/bash
2026-06-08T14:00:23.4004669Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a134299:x:10134299:30000004:Miguel de Sousa Santos:/home/a134299:/bin/bash
2026-06-08T14:00:23.4005113Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a609410:x:10609410:30000004:Leonardo Greyner Rodrigues dos Reis Viana:/home/a609410:/bin/bash
2026-06-08T14:00:23.4005476Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a614849:x:10614849:30000004:Marcus Vinicius Freitas:/home/a614849:/bin/bash
2026-06-08T14:00:23.4008293Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a652214:x:10652214:30000004:Dyelson Karlos do Nascimento Castro:/home/a652214:/bin/bash
2026-06-08T14:00:23.4009052Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a658275:x:10658275:30000004:Jalisson Pereira da Silva Xavier:/home/a658275:/bin/bash
2026-06-08T14:00:23.4009721Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a697456:x:10697456:30000004:William Teixeira Botelho:/home/a697456:/bin/bash
2026-06-08T14:00:23.4010186Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a707358:x:10707358:30000004:Jose Roberto Carvalho do Nascimento:/home/a707358:/bin/bash
2026-06-08T14:00:23.4010660Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a712753:x:10712753:30000004:Jonathan da Conceicao Carvalho:/home/a712753:/bin/bash
2026-06-08T14:00:23.4011062Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a741324:x:10741324:30000004:Alex de Oliveira Sousa:/home/a741324:/bin/bash
2026-06-08T14:00:23.4012979Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a745682:x:10745682:30000004:Jose Vidal de Melo:/home/a745682:/bin/bash
2026-06-08T14:00:23.4013649Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a747342:x:10747342:30000004:Rodrigo Almeida Santos:/home/a747342:/bin/bash
2026-06-08T14:00:23.4014238Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p773242:x:10773242:30000207:Alan Lucas de Jesus Silva:/home/p773242:/bin/bash
2026-06-08T14:00:23.4014884Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a919255:x:10919255:30000004:Alexandre Duarte Vilela:/home/a919255:/bin/bash
2026-06-08T14:00:23.4015513Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a935558:x:10935558:30000004:Charles Alves Barbosa:/home/a935558:/bin/bash
2026-06-08T14:00:23.4016225Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a947092:x:10947092:30000004:Edilson de Oliveira Bassul - CEPTIBR21 - Analista:/home/a947092:/bin/bash
2026-06-08T14:00:23.4016917Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a963749:x:10963749:30000004:Antonio Porfirio Junior:/home/a963749:/bin/bash
2026-06-08T14:00:23.4019883Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a972797:x:10972797:30000004:Jeandre Bernadelli Guerra:/home/a972797:/bin/bash
2026-06-08T14:00:23.4020613Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c019874:x:10019874:20001097:JOSE MARCELO NUNES MOURAO:/home/c019874:/bin/bash
2026-06-08T14:00:23.4021540Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c025849:x:10025849:20001097:Fabio de Oliveira Miranda:/home/c025849:/bin/bash
2026-06-08T14:00:23.4022212Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c032226:x:10032226:20001097:Verlani Hanada:/home/c032226:/bin/bash
2026-06-08T14:00:23.4022954Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c033325:x:10033325:20001097:Gerson Kaiser:/home/c033325:/bin/bash
2026-06-08T14:00:23.4023619Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c034518:x:10034518:30000065:Jose Marcelo Rodrigues:/home/c034518:/bin/bash
2026-06-08T14:00:23.4024335Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c034781:x:10034781:30000115:Jose Roberto de Melo Franco Junior - CEDES:/home/c034781:/bin/bash
2026-06-08T14:00:23.4025029Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c034942:x:10034942:20001097:Jose Galba Adeodato:/home/c034942:/bin/bash
2026-06-08T14:00:23.4025662Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c035400:x:10035400:20001097:Nelson de Almeida Rodrigues:/home/c035400:/bin/bash
2026-06-08T14:00:23.4026546Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c035433:x:10035433:20001097:Paulo Roberto Nunes Antunes:/home/c035433:/bin/bash
2026-06-08T14:00:23.4027195Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c035516:x:10035516:20001097:Wagner Fernandes Serra:/home/c035516:/bin/bash
2026-06-08T14:00:23.4027861Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c044646:x:10044646:20001097:Alexandre Walter:/home/c044646:/bin/bash
2026-06-08T14:00:23.4028492Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c046543:x:10046543:20001097:Silvio Ricardo Terato:/home/c046543:/bin/bash
2026-06-08T14:00:23.4029086Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c047557:x:10047557:20001097:Marcio Crivari Francica:/home/c047557:/bin/bash
2026-06-08T14:00:23.4029706Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c050755:x:10050755:20001097:Joao Vicente de Almeida Seabra:/home/c050755:/bin/bash
2026-06-08T14:00:23.4030297Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c051711:x:10051711:20001097:Marcos Paulo Sigg:/home/c051711:/bin/bash
2026-06-08T14:00:23.4030727Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c052958:x:10052958:20001097:Luciano Seite Nishikawa:/home/c052958:/bin/bash
2026-06-08T14:00:23.4031291Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c054153:x:10054153:20001097:Everaldo da Silva Homem:/home/c054153:/bin/bash
2026-06-08T14:00:23.4031808Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c055281:x:10055281:20001097:Rodrigo Antunes Martins do Nascimento:/home/c055281:/bin/bash
2026-06-08T14:00:23.4032168Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c056474:x:10056474:20001097:Kiyoshi Mada:/home/c056474:/bin/bash
2026-06-08T14:00:23.4032682Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c057657:x:10057657:30000009:Rafael Quirino de Paula Silveira:/home/c057657:/bin/bash
2026-06-08T14:00:23.4033267Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c059025:x:10059025:30000009:Andre Luis Ricardo Reis:/home/c059025:/bin/bash
2026-06-08T14:00:23.4033710Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c059190:x:10059190:30000065:Ana Tereza Galindo da Rocha - REROPBR41 - Analista:/home/c059190:/bin/bash
2026-06-08T14:00:23.4034095Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c060060:x:10060060:30000009:Filipe da Silva e Souza:/home/c060060:/bin/bash
2026-06-08T14:00:23.4034641Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c060546:x:10060546:20001097:Evandro Aredes de Faria:/home/c060546:/bin/bash
2026-06-08T14:00:23.4035096Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c062398:x:10062398:30000207:IVO XAVIER DE SOUZA:/home/c062398:/bin/bash
2026-06-08T14:00:23.4037873Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c064131:x:10064131:30000004:Alexandre Botelho Oliveira:/home/c064131:/bin/bash
2026-06-08T14:00:23.4038290Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c064444:x:10064444:20001097:Rafael Santos Faria:/home/c064444:/bin/bash
2026-06-08T14:00:23.4038669Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c064725:x:10064725:20001097:Fabricio Eduardo Kubota:/home/c064725:/bin/bash
2026-06-08T14:00:23.4039032Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c064896:x:10064896:20001097:Alexandre Borges Smania:/home/c064896:/bin/bash
2026-06-08T14:00:23.4039393Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c066367:x:10066367:20001097:Rodrigo Loureto de Rezende:/home/c066367:/bin/bash
2026-06-08T14:00:23.4039761Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c066522:x:10066522:20001097:Abner Jonathas Soares Cortinhas:/home/c066522:/bin/bash
2026-06-08T14:00:23.4040166Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c066576:x:10066576:30000009:EMERSON FELIZ SILVA SANTOS:/home/c066576:/bin/bash
2026-06-08T14:00:23.4040545Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): C066984:x:10066984:20001097:Cristiano do Nascimento Amorim CEDESBR04:/home/c066984:/bin/bash
2026-06-08T14:00:23.4040923Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c067223:x:10067223:20001097:Suzana Kawamura - REDEASP - TBN:/home/c067223:/bin/bash
2026-06-08T14:00:23.4041396Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c067277:x:10067277:20001097:Fernando Tadeu Rodrigues:/home/c067277:/bin/bash
2026-06-08T14:00:23.4041824Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c067284:x:10067284:30000225:Bruno Nicolau Ferreira:/home/c067284:/bin/bash
2026-06-08T14:00:23.4042441Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c067710:x:10067710:20001097:MARILZA MIRANDA MUNIZ DE ARAUJO:/home/c067710:/bin/bash
2026-06-08T14:00:23.4042975Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c068554:x:10068554:20001097:Luciano Dias Neto:/home/c068554:/bin/bash
2026-06-08T14:00:23.4043356Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c070257:x:10070257:20001097:Euler Carvalho Silva Chavarri Gomes:/home/c070257:/bin/bash
2026-06-08T14:00:23.4045311Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c070345:x:10070345:20001097:Liney Rodrigues dos Reis:/home/c070345:/bin/bash
2026-06-08T14:00:23.4045874Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c070667:x:10070667:20001097:Roberto Ramos Monteiro Junior - CNDESRJ:/home/c070667:/bin/bash
2026-06-08T14:00:23.4046300Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c071002:x:10071002:20001097:Andre Taishi Yamaguchi - REDEASP - TBN:/home/c071002:/bin/bash
2026-06-08T14:00:23.4046678Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c071242:x:10071242:20001097:Fabio Vladimir Calixto de Araujo:/home/c071242:/bin/bash
2026-06-08T14:00:23.4051867Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c071335:x:10071335:20001097:Ricardo Castanheira Gomes Davi Filho - REDEABR312 - Analista:/home/c071335:/bin/bash
2026-06-08T14:00:23.4052832Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c071526:x:10071526:20001097:Claudio Rosa de Camargo Junior:/home/c071526:/bin/bash
2026-06-08T14:00:23.4053237Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c071935:x:10071935:20001097:Paulo Schmidtke:/home/c071935:/bin/bash
2026-06-08T14:00:23.4053603Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c072664:x:10072664:20001097:EDUARDO DE FREITAS SILVA:/home/c072664:/bin/bash
2026-06-08T14:00:23.4053964Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c072688:x:10072688:20001097:Douglas Pires de Saboia Lima:/home/c072688:/bin/bash
2026-06-08T14:00:23.4054327Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c072782:x:10072782:20001097:Antonio Paulo Castro Correa:/home/c072782:/bin/bash
2026-06-08T14:00:23.4054705Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c073271:x:10073271:30000009:Rogerio Soares dos Santos - REROPBR34 - TBN:/home/c073271:/bin/bash
2026-06-08T14:00:23.4055103Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c073466:x:10073466:30000207:Wesley Ribeiro Goncalves Neiva - CNOPEBR41 - Analista:/home/c073466:/bin/bash
2026-06-08T14:00:23.4055466Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c074256:x:10074256:20001097:Roberto Leite Pereira:/home/c074256:/bin/bash
2026-06-08T14:00:23.4055813Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c074642:x:10074642:30000009:Patrick Mazoni Cavalcanti:/home/c074642:/bin/bash
2026-06-08T14:00:23.4056170Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c075689:x:10075689:20001097:Debora da Silva Barros:/home/c075689:/bin/bash
2026-06-08T14:00:23.4056528Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c075779:x:10075779:30000009:Thiago de Assuncao Cerqueira:/home/c075779:/bin/bash
2026-06-08T14:00:23.4056874Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c076537:x:10076537:30000065:Vitor Lima Carneiro:/home/c076537:/bin/bash
2026-06-08T14:00:23.4057361Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c076779:x:10076779:20001097:Felipe Worney Tavares:/home/c076779:/bin/bash
2026-06-08T14:00:23.4057813Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c076781:x:10076781:20001097:Carlos Alexandre Vilela de Serpa:/home/c076781:/bin/bash
2026-06-08T14:00:23.4058179Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c076792:x:10076792:20001097:Welington Oliveira dos Santos:/home/c076792:/bin/bash
2026-06-08T14:00:23.4058539Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c077037:x:10077037:20001097:Jose Carlos Pacheco Soares:/home/c077037:/bin/bash
2026-06-08T14:00:23.4059093Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c078087:x:10078087:20001097:Marcelo Pereira Leite Gomes:/home/c078087:/bin/bash
2026-06-08T14:00:23.4059917Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c078270:x:10078270:20001097:Paulo Cezar Cayres Ramos:/home/c078270:/bin/bash
2026-06-08T14:00:23.4060274Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c078497:x:10078497:20001097:Wladimir Vieira de Souza:/home/c078497:/bin/bash
2026-06-08T14:00:23.4060625Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c078882:x:10078882:30000009:Alex Barbosa Baudson:/home/c078882:/bin/bash
2026-06-08T14:00:23.4060994Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c079424:x:10079424:20001097:Wendel Lopes dos Santos - REDEASP - Analista:/home/c079424:/bin/bash
2026-06-08T14:00:23.4061395Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c079974:x:10079974:30000009:Bruno Bezerra Andre:/home/c079974:/bin/bash
2026-06-08T14:00:23.4061751Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c079975:x:10079975:20001097:Cicero Erisvaldo Silva Bezerra:/home/c079975:/bin/bash
2026-06-08T14:00:23.4062107Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c080001:x:10080001:30000222:Leonardo Jordao Dias:/home/c080001:/bin/bash
2026-06-08T14:00:23.4062451Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c080110:x:10080110:30000009:Ovidio Pires da Rocha:/home/c080110:/bin/bash
2026-06-08T14:00:23.4063110Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c080197:x:10080197:30000009:Lidiana Gomes Bezerra:/home/c080197:/bin/bash
2026-06-08T14:00:23.4063484Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c080683:x:10080683:20001097:Felipe Vargas da Costa:/home/c080683:/bin/bash
2026-06-08T14:00:23.4064391Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c080827:x:10080827:30000009:Claudia Veronica Martins Lima:/home/c080827:/bin/bash
2026-06-08T14:00:23.4065026Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c081566:x:10081566:20001097:Joao Henrique Aroldi:/home/c081566:/bin/bash
2026-06-08T14:00:23.4065484Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c081887:x:10081887:20001097:Alessandro Dombroski Santos:/home/c081887:/bin/bash
2026-06-08T14:00:23.4065851Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c082471:x:10082471:20001097:RAFAEL ROSENDO PIMENTEL:/home/c082471:/bin/bash
2026-06-08T14:00:23.4066478Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c082785:x:10082785:20001097:Marcos Daniel Freitas Hortelao Oliveira:/home/c082785:/bin/bash
2026-06-08T14:00:23.4066907Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c083059:x:10083059:20001097:CELIO HENRIQUE MAIA DO VALE - CNDESBR:/home/c083059:/bin/bash
2026-06-08T14:00:23.4072822Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c084268:x:10084268:30000207:Inara Santos Matos:/home/c084268:/bin/bash
2026-06-08T14:00:23.4073377Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c085066:x:10085066:20001097:Vinicius Wanderley de Queiroz:/home/c085066:/bin/bash
2026-06-08T14:00:23.4073800Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c085466:x:10085466:20000000:Anderson Souza Campos:/home/c085466:/bin/bash
2026-06-08T14:00:23.4074183Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c085470:x:10085470:30000065:Eliane Araujo Quintao - REROPBR41 - Analista Sr:/home/c085470:/bin/bash
2026-06-08T14:00:23.4074560Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c086411:x:10086411:20001097:Sylvio Rezende Junqueira:/home/c086411:/bin/bash
2026-06-08T14:00:23.4074918Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c086594:x:10086594:20001097:Ricardo Rocha Cianfrone:/home/c086594:/bin/bash
2026-06-08T14:00:23.4075336Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c088836:x:10088836:20001097:Fabiano Araujo de Moura Belmiro Neves:/home/c088836:/bin/bash
2026-06-08T14:00:23.4075712Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c090053:x:10090053:20001097:Mauricio Tarla Menezes:/home/c090053:/bin/bash
2026-06-08T14:00:23.4076069Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c090751:x:10090751:20000088:Marcos de Almeida Verri:/home/c090751:/bin/bash
2026-06-08T14:00:23.4076576Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c090887:x:10090887:20001097:KARINE DE SOUZA ROZAS:/home/c090887:/bin/bash
2026-06-08T14:00:23.4076997Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c091363:x:10091363:20001097:Anna Paula do Rego Alves e Silva:/home/c091363:/bin/bash
2026-06-08T14:00:23.4077413Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c092581:x:10092581:20001097:Anderson Pinheiro Balbo:/home/c092581:/bin/bash
2026-06-08T14:00:23.4077823Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c092776:x:10092776:30000505:Viviane Sevegnani:/home/c092776:/bin/bash
2026-06-08T14:00:23.4078178Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c092897:x:10092897:20001097:Carlos Harari:/home/c092897:/bin/bash
2026-06-08T14:00:23.4078527Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c092912:x:10092912:20001097:Rogerio de Franca Pimentel:/home/c092912:/bin/bash
2026-06-08T14:00:23.4078928Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c092959:x:10092959:30000065:Andreia Regina de Noronha Lisboa - REROPBR41 - Analista:/home/c092959:/bin/bash
2026-06-08T14:00:23.4079306Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c093546:x:10093546:30000009:Diogo de Paula Ferreira:/home/c093546:/bin/bash
2026-06-08T14:00:23.4079756Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c093561:x:10093561:20001097:Luis Antonio Lima de Siqueira Campos - CNDES045:/home/c093561:/bin/bash
2026-06-08T14:00:23.4080233Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c093765:x:10093765:20001097:Isaias Aires de Santana:/home/c093765:/bin/bash
2026-06-08T14:00:23.4080948Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c093819:x:10093819:20001097:Joao Paulo da Silva - CEDESSP333:/home/c093819:/bin/bash
2026-06-08T14:00:23.4081398Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c094700:x:10094700:20001097:Ronaldo Francisco Pereira da Silva:/home/c094700:/bin/bash
2026-06-08T14:00:23.4082445Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c094914:x:10094914:30000009:Danielle Cristina Vieira de Souza:/home/c094914:/bin/bash
2026-06-08T14:00:23.4083141Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c095090:x:10095090:20001097:Joeudo Santana Ferreira - REDEASP66:/home/c095090:/bin/bash
2026-06-08T14:00:23.4083525Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c095186:x:10095186:30000009:Giancarlo Missias Andrea Vecci:/home/c095186:/bin/bash
2026-06-08T14:00:23.4083888Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c095195:x:10095195:30000222:Ricardo Ferreira Martins:/home/c095195:/bin/bash
2026-06-08T14:00:23.4092151Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c097121:x:10097121:20001097:Fabiano Monteiro de Carvalho:/home/c097121:/bin/bash
2026-06-08T14:00:23.4092642Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c097789:x:10097789:30000009:Rafael Braga Gomes - CEPTIBR35:/home/c097789:/bin/bash
2026-06-08T14:00:23.4093035Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c098443:x:10098443:20001097:Nelson Francisco Muniz Alves:/home/c098443:/bin/bash
2026-06-08T14:00:23.4093420Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c098678:x:10098678:30000009:Thiago Nogueira Baptistella - REROPBR32 - TBN:/home/c098678:/bin/bash
2026-06-08T14:00:23.4093787Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c099187:x:10099187:20001097:Bianca Diamante Spinola:/home/c099187:/bin/bash
2026-06-08T14:00:23.4094315Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c099234:x:10099234:20001097:Atomario Almeida Mourao:/home/c099234:/bin/bash
2026-06-08T14:00:23.4094700Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c101043:x:10101043:20001097:Marcelo Rangel Bezerra de Sousa:/home/c101043:/bin/bash
2026-06-08T14:00:23.4095057Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c101139:x:10101139:20001097:Rodrigo Lemes Rodrigues:/home/c101139:/bin/bash
2026-06-08T14:00:23.4095498Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c101211:x:10101211:20001097:Fabio Dominitini:/home/c101211:/bin/bash
2026-06-08T14:00:23.4095928Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c101280:x:10101280:20001097:Jose Nelson Costa Allemand:/home/c101280:/bin/bash
2026-06-08T14:00:23.4096279Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c101286:x:10101286:20001097:Roberto Davi Silva:/home/c101286:/bin/bash
2026-06-08T14:00:23.4096634Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c101481:x:10101481:20001097:Watson Junior Felipe de Sousa:/home/c101481:/bin/bash
2026-06-08T14:00:23.4097002Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c101482:x:10101482:20001097:Vinicius Ferraz Campos Florentino:/home/c101482:/bin/bash
2026-06-08T14:00:23.4097363Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c101486:x:10101486:20001097:Thiago Luiz de Sousa:/home/c101486:/bin/bash
2026-06-08T14:00:23.4097716Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c101488:x:10101488:20001097:Rodrigo Casimiro Formiga:/home/c101488:/bin/bash
2026-06-08T14:00:23.4098073Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c101497:x:10101497:20001097:Marilia Santos Tavares Almeida:/home/c101497:/bin/bash
2026-06-08T14:00:23.4098449Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c101686:x:10101686:20001097:CARLOS FREDERICO RODRIGUES DE OLIVEIRA:/home/c101686:/bin/bash
2026-06-08T14:00:23.4100684Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c101697:x:10101697:30000009:MARCOS MAGALHAES DE ALMEIDA:/home/c101697:/bin/bash
2026-06-08T14:00:23.4101275Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c102062:x:10102062:20001097:Andre Augusto Faria dos Santos:/home/c102062:/bin/bash
2026-06-08T14:00:23.4101672Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c103838:x:10103838:20001097:Claudio Yutaka Ueda - REDEABR - Analista:/home/c103838:/bin/bash
2026-06-08T14:00:23.4102053Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c103885:x:10103885:20001097:Andre Felipe Gonsalves de Macedo:/home/c103885:/bin/bash
2026-06-08T14:00:23.4102422Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c104568:x:10104568:20001097:Alexandre Henrique Cardoso:/home/c104568:/bin/bash
2026-06-08T14:00:23.4102954Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c104649:x:10104649:20001097:CAMILA MACHADO VILELA:/home/c104649:/bin/bash
2026-06-08T14:00:23.4109388Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c105118:x:10105118:20001097:Vinicius Tavares Lobato Gama:/home/c105118:/bin/bash
2026-06-08T14:00:23.4110027Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c105244:x:10105244:20001097:Saymom de Oliveira Ramalho:/home/c105244:/bin/bash
2026-06-08T14:00:23.4110597Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c107547:x:10107547:30000065:Ismar Marques Teixeira - REROPBR41 - Analista:/home/c107547:/bin/bash
2026-06-08T14:00:23.4111143Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c107848:x:10107848:20001097:Edvan dos Santos Souza:/home/c107848:/bin/bash
2026-06-08T14:00:23.4112219Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c108346:x:10108346:20001097:Sandra Mara Chemin:/home/c108346:/bin/bash
2026-06-08T14:00:23.4112677Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c108547:x:10108547:30000009:Bruno Zumba de Amorim:/home/c108547:/bin/bash
2026-06-08T14:00:23.4113152Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c108804:x:10108804:20001097:Cesar Mizuno:/home/c108804:/bin/bash
2026-06-08T14:00:23.4113513Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c108949:x:10108949:30000065:AUREO CARNEIRO RIOS NETO:/home/c108949:/bin/bash
2026-06-08T14:00:23.4113877Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c109782:x:10109782:20001097:Allan Bruno Porto:/home/c109782:/bin/bash
2026-06-08T14:00:23.4114283Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c109799:x:10109799:30000065:Andrey Nicolas Assis de Magalhaes - CEPTIBR41 - Assistente Junior:/home/c109799:/bin/bash
2026-06-08T14:00:23.4114852Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c110019:x:10110019:20001008:Roberto Goncalves Teixeira:/home/c110019:/bin/bash
2026-06-08T14:00:23.4115593Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c110109:x:10110109:20001097:Gustavo Candido Delis Alvarenga:/home/c110109:/bin/bash
2026-06-08T14:00:23.4116131Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c110503:x:10110503:20001097:Humphrey Correa da Fonseca:/home/c110503:/bin/bash
2026-06-08T14:00:23.4116682Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c110505:x:10110505:20001097:Fabiana Torres Guimaraes:/home/c110505:/bin/bash
2026-06-08T14:00:23.4117257Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c110507:x:10110507:20001097:Elcio Gomes Pereira Martins - CNDESBR:/home/c110507:/bin/bash
2026-06-08T14:00:23.4117858Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c110509:x:10110509:20001097:Henrique Cesar dos Reis Nascimento - REDEABR403:/home/c110509:/bin/bash
2026-06-08T14:00:23.4118621Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c110515:x:10110515:20001097:Rodrigo Aparecido Domingues:/home/c110515:/bin/bash
2026-06-08T14:00:23.4119431Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c110518:x:10110518:20001097:Rafael Moraes de Sousa:/home/c110518:/bin/bash
2026-06-08T14:00:23.4119824Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c111230:x:10111230:20001097:Franco Andre Lopes Dantas:/home/c111230:/bin/bash
2026-06-08T14:00:23.4120328Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c111235:x:10111235:20001097:Igor Bassi Cruz:/home/c111235:/bin/bash
2026-06-08T14:00:23.4121195Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c111244:x:10111244:20001097:Alessandro Ludgero Ferreira:/home/c111244:/bin/bash
2026-06-08T14:00:23.4121934Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c111750:x:10111750:20001097:Rogerio de Faria Silva:/home/c111750:/bin/bash
2026-06-08T14:00:23.4122764Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c111770:x:10111770:20001097:Glaimertton Blank Silva:/home/c111770:/bin/bash
2026-06-08T14:00:23.4123301Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c111792:x:10111792:20001097:BRUNO NUNES MOREIRA RODRIGUES:/home/c111792:/bin/bash
2026-06-08T14:00:23.4123864Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c111798:x:10111798:20001097:Marcio Roberto de Sousa Ferreira - REDEABR403:/home/c111798:/bin/bash
2026-06-08T14:00:23.4124594Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c111840:x:10111840:30000009:Anderson Alexandre Soares Vieira:/home/c111840:/bin/bash
2026-06-08T14:00:23.4125542Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c112143:x:10112143:30000009:Igor Frederico Araujo de Andrade - REROPBR34 - TBN:/home/c112143:/bin/bash
2026-06-08T14:00:23.4126242Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c112312:x:10112312:20001097:Liliane Saemy Tsukamoto:/home/c112312:/bin/bash
2026-06-08T14:00:23.4126670Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c113273:x:10113273:30000009:Marcos Antonio da Silva Junior - CN OPERACOES TI BRASILIA, DF:/home/c113273:/bin/bash
2026-06-08T14:00:23.4127070Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c113723:x:10113723:30000009:Gerferson Ferreira da Silva:/home/c113723:/bin/bash
2026-06-08T14:00:23.4127558Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c113735:x:10113735:30000065:Rhadan Rodrigues Silva:/home/c113735:/bin/bash
2026-06-08T14:00:23.4128151Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c113781:x:10113781:20001097:Felix Carneiro de Souza Neto:/home/c113781:/bin/bash
2026-06-08T14:00:23.4128709Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c113793:x:10113793:20001097:Eduardo Goncalves Campolina:/home/c113793:/bin/bash
2026-06-08T14:00:23.4129170Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c117343:x:10117343:20000000:Giovane da Silva Dutra:/home/c117343:/bin/bash
2026-06-08T14:00:23.4129544Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c120613:x:10120613:30000009:Victor Thiago Batista da Silva:/home/c120613:/bin/bash
2026-06-08T14:00:23.4129999Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c126032:x:10126032:20001097:Mauro Pereira de Almeida Junior:/home/c126032:/bin/bash
2026-06-08T14:00:23.4130534Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c127225:x:10127225:20000000:Rogerio de Oliveira:/home/c127225:/bin/bash
2026-06-08T14:00:23.4130988Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c127240:x:10127240:20001097:Marcus Vinicius Martins Oliveira Souza:/home/c127240:/bin/bash
2026-06-08T14:00:23.4131487Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c127242:x:10127242:20001097:David da Sivla Teles:/home/c127242:/bin/bash
2026-06-08T14:00:23.4131849Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c127246:x:10127246:20001097:Alisson Melo Nascimento:/home/c127246:/bin/bash
2026-06-08T14:00:23.4132882Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c127247:x:10127247:20001097:Alex Cardoso Galvao:/home/c127247:/bin/bash
2026-06-08T14:00:23.4133241Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c127266:x:10127266:20001097:RAFAEL MANGUEIRA BORGES:/home/c127266:/bin/bash
2026-06-08T14:00:23.4133585Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c127295:x:10127295:20001097:Marcos Alessandro Finco:/home/c127295:/bin/bash
2026-06-08T14:00:23.4133998Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c129773:x:10129773:20001097:Carlos Antonio Carnauba Barros:/home/c129773:/bin/bash
2026-06-08T14:00:23.4134446Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c129774:x:10129774:20001097:Marla Cristina de Avila:/home/c129774:/bin/bash
2026-06-08T14:00:23.4135265Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c129775:x:10129775:20001097:Diego Machado de Carvalho:/home/c129775:/bin/bash
2026-06-08T14:00:23.4138253Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c129776:x:10129776:20001097:Marcio Augusto Soeiro:/home/c129776:/bin/bash
2026-06-08T14:00:23.4139120Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c129814:x:10129814:30000115:Salviano Santana Bacelar:/home/c129814:/bin/bash
2026-06-08T14:00:23.4139677Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c129845:x:10129845:30000222:Sandra Moura Benvindo da Fe:/home/c129845:/bin/bash
2026-06-08T14:00:23.4140348Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c129871:x:10129871:20001097:Luiz Carlos de Souza Neves Junior:/home/c129871:/bin/bash
2026-06-08T14:00:23.4140880Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c131153:x:10131153:20001097:Barbara Franca Abreu de Oliveira:/home/c131153:/bin/bash
2026-06-08T14:00:23.4145007Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c131155:x:10131155:20001097:Rodrigo Galdino dos Reis:/home/c131155:/bin/bash
2026-06-08T14:00:23.4145469Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c132779:x:10132779:20001097:YURE STARLONE SANTOS DANTAS:/home/c132779:/bin/bash
2026-06-08T14:00:23.4145885Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c132782:x:10132782:20001097:Reginaldo Ribeiro Araujo:/home/c132782:/bin/bash
2026-06-08T14:00:23.4146307Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c133358:x:10133358:30000222:Leonan Alves dos Anjos:/home/c133358:/bin/bash
2026-06-08T14:00:23.4146715Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c134266:x:10134266:30000009:Fernando Marinho Vasconcelos de Araujo:/home/c134266:/bin/bash
2026-06-08T14:00:23.4147187Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c134268:x:10134268:20001097:Maria Eugenia de Paula Correa:/home/c134268:/bin/bash
2026-06-08T14:00:23.4147594Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c134272:x:10134272:20001097:Leandro Ofugi:/home/c134272:/bin/bash
2026-06-08T14:00:23.4147958Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c134278:x:10134278:20001097:Eric Miranda Ribeiro:/home/c134278:/bin/bash
2026-06-08T14:00:23.4148511Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c134285:x:10134285:30000009:Reginaldo Franco Filho:/home/c134285:/bin/bash
2026-06-08T14:00:23.4149017Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c134289:x:10134289:30000009:Matheus Vinicius Soares Campos:/home/c134289:/bin/bash
2026-06-08T14:00:23.4149399Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c134293:x:10134293:30000009:Welzicley Ferreira Lopes:/home/c134293:/bin/bash
2026-06-08T14:00:23.4149766Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c134537:x:10134537:30000009:Ruy Leonardo Aparecido Furtado:/home/c134537:/bin/bash
2026-06-08T14:00:23.4150147Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c134542:x:10134542:30000009:Tiago Ferreira Luz - REROPBR34 - TBN:/home/c134542:/bin/bash
2026-06-08T14:00:23.4150592Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c134547:x:10134547:30000009:Thiago Erivan da Cunha Silva:/home/c134547:/bin/bash
2026-06-08T14:00:23.4150954Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c134551:x:10134551:20001097:Raphael da Silva Oliveira:/home/c134551:/bin/bash
2026-06-08T14:00:23.4151510Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c134554:x:10134554:30000009:Samuel Lorentz Gomes Barbosa:/home/c134554:/bin/bash
2026-06-08T14:00:23.4152333Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c134567:x:10134567:20001097:Adeilton da Paz Souza:/home/c134567:/bin/bash
2026-06-08T14:00:23.4153284Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c134581:x:10134581:30000009:Rafael Castro da Silva:/home/c134581:/bin/bash
2026-06-08T14:00:23.4153913Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c134582:x:10134582:30000009:Andre Gomes de Paiva:/home/c134582:/bin/bash
2026-06-08T14:00:23.4154764Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c134596:x:10134596:30000009:Caio Yuri da Silva Costa:/home/c134596:/bin/bash
2026-06-08T14:00:23.4155261Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c134597:x:10134597:30000077:Marcelo Cid Valerio:/home/c134597:/bin/bash
2026-06-08T14:00:23.4155634Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c137130:x:10137130:20001097:Maria Cristina Silva Branquinho:/home/c137130:/bin/bash
2026-06-08T14:00:23.4156202Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c137135:x:10137135:20001097:Patricia Leonardo Coimbra:/home/c137135:/bin/bash
2026-06-08T14:00:23.4157610Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c137152:x:10137152:20001097:Jorge Luiz Pinto de Oliveira:/home/c137152:/bin/bash
2026-06-08T14:00:23.4158129Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c139518:x:10139518:30000065:MARCELO LEONARDO CAMARGOS SILVA:/home/c139518:/bin/bash
2026-06-08T14:00:23.4159218Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c139520:x:10139520:30000222:Handerson Gomes Dias- REROPBR34 - TBN:/home/c139520:/bin/bash
2026-06-08T14:00:23.4159873Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c139526:x:10139526:20001097:Patricia Martins Gomes:/home/c139526:/bin/bash
2026-06-08T14:00:23.4160631Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c139531:x:10139531:20001097:IRIS SOUZA DOS SANTOS CARDOSO:/home/c139531:/bin/bash
2026-06-08T14:00:23.4161012Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c139532:x:10139532:20001097:Juliano Ferreira Hallac:/home/c139532:/bin/bash
2026-06-08T14:00:23.4161658Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c139535:x:10139535:20001097:Sarah Regina Bittencourt Arado:/home/c139535:/bin/bash
2026-06-08T14:00:23.4162030Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c139546:x:10139546:20001097:Rodrigo Gomes Ferreira:/home/c139546:/bin/bash
2026-06-08T14:00:23.4162784Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c140932:x:10140932:20001097:Pedro Henrique de Brito Chaves:/home/c140932:/bin/bash
2026-06-08T14:00:23.4163360Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c140961:x:10140961:20001097:Alipio Getulio Krohn Junior:/home/c140961:/bin/bash
2026-06-08T14:00:23.4163881Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c140967:x:10140967:20001097:Paulo Henrique de Araujo Soares:/home/c140967:/bin/bash
2026-06-08T14:00:23.4164345Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c142002:x:10142002:20001097:Carlos Jose Mogadouro:/home/c142002:/bin/bash
2026-06-08T14:00:23.4165108Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c142036:x:10142036:20001097:Rubens Odan da Silva:/home/c142036:/bin/bash
2026-06-08T14:00:23.4165576Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c142782:x:10142782:20001097:Adriano dos Remedios Rodrigues:/home/c142782:/bin/bash
2026-06-08T14:00:23.4166944Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c142828:x:10142828:30000065:Michele Ferreira de Matos:/home/c142828:/bin/bash
2026-06-08T14:00:23.4167668Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c142838:x:10142838:20001097:Atiely Pereira de Freitas:/home/c142838:/bin/bash
2026-06-08T14:00:23.4168788Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c142858:x:10142858:20001097:Mardes Ferreira da Vitoria:/home/c142858:/bin/bash
2026-06-08T14:00:23.4169741Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c142864:x:10142864:20001097:Felipe Vieira borba:/home/c142864:/bin/bash
2026-06-08T14:00:23.4170617Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c142868:x:10142868:20001097:Flavio Gutierre Barbosa da Costa:/home/c142868:/bin/bash
2026-06-08T14:00:23.4171218Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c142924:x:10142924:20001097:THIAGO RODRIGUES FERNANDES:/home/c142924:/bin/bash
2026-06-08T14:00:23.4171741Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c142926:x:10142926:20000000:Marcelo Afonso Alves:/home/c142926:/bin/bash
2026-06-08T14:00:23.4172664Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c142927:x:10142927:20001097:Paulo Henrique Barros Santos:/home/c142927:/bin/bash
2026-06-08T14:00:23.4173200Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f529056:x:10529056:20001097:Jose Leonardo Clemente:/home/f529056:/bin/bash
2026-06-08T14:00:23.4174799Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f598938:x:10598938:20001097:Philipe Augusto do Nascimento Martinsa:/home/f598938:/bin/bash
2026-06-08T14:00:23.4175177Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f598939:x:10598939:20001097:Roberto Mendes:/home/f598939:/bin/bash
2026-06-08T14:00:23.4175540Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f672727:x:10672727:20001097:THIAGO FERNANDES MENDES:/home/f672727:/bin/bash
2026-06-08T14:00:23.4176688Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f688739:x:10688739:20001097:ANDERSON LUIS SILVA BORGES:/home/f688739:/bin/bash
2026-06-08T14:00:23.4177259Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f727032:x:10727032:20001097:Leonardo Emannuel Silva:/home/f727032:/bin/bash
2026-06-08T14:00:23.4177983Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f752388:x:10752388:20001097:JOSE OTAVIO SILVEIRA PAULA:/home/f752388:/bin/bash
2026-06-08T14:00:23.4178521Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f779811:x:10779811:20001097:ANTONIO SANTOS DE ARAUJO:/home/f779811:/bin/bash
2026-06-08T14:00:23.4179283Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f915278:x:10915278:20001097:Alexandre Nucci:/home/f915278:/bin/bash
2026-06-08T14:00:23.4179949Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f932471:x:10932471:20001097:LEONARDO VIEIRA INACIO:/home/f932471:/bin/bash
2026-06-08T14:00:23.4180316Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f940004:x:10940004:20001097:Waldir de Freitas Filho:/home/f940004:/bin/bash
2026-06-08T14:00:23.4180775Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f975512:x:10975512:20001097:EDUARDO ANTONIO MELO TORRES:/home/f975512:/bin/bash
2026-06-08T14:00:23.4181142Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f976872:x:10976872:20001097:Ricardo Ventura de Almeida:/home/f976872:/bin/bash
2026-06-08T14:00:23.4182207Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f978047:x:10978047:20001097:Gilberto Wilson Barbosa da Silva - DESBR401:/home/f978047:/bin/bash
2026-06-08T14:00:23.4183356Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p546948:x:10546948:20000987:Rafael Pereira de Souza - REROPBR904 - Prestador:/home/p546948:/bin/bash
2026-06-08T14:00:23.4184186Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p563333:x:10563333:20000025:Augusto Cezar de Figueiredo Ribeiro - REROPBR31 - Prestador:/home/p563333:/bin/bash
2026-06-08T14:00:23.4184704Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p564122:x:10564122:30000065:Vanessa Yumi Kobayashi - Prestador:/home/p564122:/bin/bash
2026-06-08T14:00:23.4185361Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p571743:x:10571743:20000987:Rafael Nunes Oliveira:/home/p571743:/bin/bash
2026-06-08T14:00:23.4186107Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p601148:x:10601148:30000009:RODRIGO ALVES VIEIRA:/home/p601148:/bin/bash
2026-06-08T14:00:23.4186940Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p606865:x:10606865:30000222:Gustavo Lima dos Santos:/home/p606865:/bin/bash
2026-06-08T14:00:23.4187504Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p616353:x:10616353:30000207:Edgar de Jesus Nogueira Menezes:/home/p616353:/bin/bash
2026-06-08T14:00:23.4188879Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p631823:x:10631823:30000009:Raimundo Nonato Gomes Leite - REROPBR41 - Prestador:/home/p631823:/bin/bash
2026-06-08T14:00:23.4189442Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p642763:x:10642763:30000009:Mauricio Vilela de Carvalho - CNOPEBR081 - Prestador:/home/p642763:/bin/bash
2026-06-08T14:00:23.4190089Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p649175:x:10649175:30000222:Fabricio Martins da Silva - REROPBR31 - Prestador:/home/p649175:/bin/bash
2026-06-08T14:00:23.4190797Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p654940:x:10654940:30000009:Pablo Souza Victor:/home/p654940:/bin/bash
2026-06-08T14:00:23.4192076Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p701267:x:10701267:30000009:VALTER CAVALCANTE DOS SANTOS:/home/p701267:/bin/bash
2026-06-08T14:00:23.4192704Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p768755:x:10768755:30000009:Thiago de Souza Mileski:/home/p768755:/bin/bash
2026-06-08T14:00:23.4193373Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p911474:x:10911474:30000065:Erli da Costa Marim:/home/p911474:/bin/bash
2026-06-08T14:00:23.4194565Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p923108:x:10923108:30000009:Nubia Cristina da Silva - CNOPEBR081 - Prestador:/home/p923108:/bin/bash
2026-06-08T14:00:23.4195786Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p927150:x:10927150:30000009:Valdirene do Espirito Santo Dias:/home/p927150:/bin/bash
2026-06-08T14:00:23.4196448Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p938048:x:10938048:30000009:Carlyle da Silva:/home/p938048:/bin/bash
2026-06-08T14:00:23.4197155Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p974897:x:10974897:30000115:Renato Ferreira de Andrade:/home/p974897:/bin/bash
2026-06-08T14:00:23.4198055Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p990408:x:10990408:30000222:Ivan da Silva Bezerra - REROPBR32 - Analista:/home/p990408:/bin/bash
2026-06-08T14:00:23.4199767Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p993501:x:10993501:30000009:Robson de Queiroz Cavalvanti:/home/p993501:/bin/bash
2026-06-08T14:00:23.4203959Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c134549:x:10134549:20001097:Rodrigo Alves Reis:/home/c134549:/bin/bash
2026-06-08T14:00:23.4204837Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c134575:x:10134575:20001097:Diego Gottselig:/home/c134575:/bin/bash
2026-06-08T14:00:23.4205399Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c111752:x:10111752:20001097:Roseane Vasconcelos de Almeida - REDEABR754:/home/c111752:/bin/bash
2026-06-08T14:00:23.4205980Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c056203:x:10056203:20001097:Cleiton Garcia de Moraes:/home/c056203:/bin/bash
2026-06-08T14:00:23.4206514Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c108829:x:10108829:30000115:Rodrigo Oliveira de Sousa:/home/c108829:/bin/bash
2026-06-08T14:00:23.4207500Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): jbosslnx:x:20000292:30000115:conta do jboss servidores linux:/home/jbosslnx:/bin/bash
2026-06-08T14:00:23.4208107Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ctmagelx:x:20003596:20000299:conta do control m agent - linux:/opt/ctmage:/bin/csh
2026-06-08T14:00:23.4208728Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ctmage:x:30000018:30000018:Conta.de.Servico.Control-M.Agent:/opt/ctmage:/bin/csh
2026-06-08T14:00:23.4209326Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f780329:x:10780329:20001097:ORLANDO LEITE DE SOUZA:/home/f780329:/bin/ksh
2026-06-08T14:00:23.4209879Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f612381:x:10612381:20001097:ADRIANA DE ARAUJO MOURA SILVA:/home/f612381:/bin/ksh
2026-06-08T14:00:23.4210439Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c115927:x:10115927:20001097:Fernando campos de Sousa Liporoni:/home/c115927:/bin/bash
2026-06-08T14:00:23.4211019Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c116833:x:10116833:20001097:CALEBE GONCALVES DA SILVA:/home/c116833:/bin/bash
2026-06-08T14:00:23.4211612Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c105234:x:10105234:20000000:GIRLENO PASSARINHO BEZERRA PINTO:/home/c105234:/bin/bash
2026-06-08T14:00:23.4212185Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c083347:x:10083347:20001097:Daniel Goncalves Marini:/home/c083347:/bin/bash
2026-06-08T14:00:23.4213093Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c113156:x:10113156:20001097:Luciana Mayumi Nakahara:/home/c113156:/bin/bash
2026-06-08T14:00:23.4213625Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c139516:x:10139516:20000000:Anderson Moura Clementino:/home/c139516:/bin/bash
2026-06-08T14:00:23.4214173Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c082824:x:10082824:30000009:Giovanni de Moraes Aviani:/home/c082824:/bin/bash
2026-06-08T14:00:23.4214902Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c072470:x:10072470:30000505:Ronaldo Fernandes a Cruz Pereira Machado:/home/c072470:/bin/bash
2026-06-08T14:00:23.4215451Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c116361:x:10116361:20000000:LENARTS RAMOS RODRIGUES DO NASCIMENTO:/home/c116361:/bin/bash
2026-06-08T14:00:23.4215974Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c127237:x:10127237:20001097:RINALDO PITZER JUNIOR:/home/c127237:/bin/bash
2026-06-08T14:00:23.4217084Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c077911:x:10077911:20000000:HENRIQUE CARNEIRO DOS SANTOS:/home/c077911:/bin/bash
2026-06-08T14:00:23.4223619Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c093560:x:10093560:20001008:Erico Vinicius Macedo de Oliveira Rebelo:/home/c093560:/bin/bash
2026-06-08T14:00:23.4224196Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c092252:x:10092252:20000063:Tatiana Olival Ferreira Xavier S Finco - GEMOR:/home/c092252:/bin/bash
2026-06-08T14:00:23.4224564Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c061290:x:10061290:20001097:Symone Navarro Resio Amorim:/home/c061290:/bin/bash
2026-06-08T14:00:23.4224921Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c081772:x:10081772:20000063:Valquiria Aparecida Germani:/home/c081772:/bin/bash
2026-06-08T14:00:23.4225279Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c072468:x:10072468:20000056:Igor Bastos Correia:/home/c072468:/bin/bash
2026-06-08T14:00:23.4225626Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c023481:x:10023481:30000223:Arthur Braz Pinheiro:/home/c023481:/bin/bash
2026-06-08T14:00:23.4225976Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c099404:x:10099404:20001097:HELOISA GUEDES DA CUNHA OKUMURA:/home/c099404:/bin/bash
2026-06-08T14:00:23.4226333Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c111495:x:10111495:20000056:CLAUDIO POVOAS PEREIRA JUNIOR:/home/c111495:/bin/bash
2026-06-08T14:00:23.4226681Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c144687:x:10144687:30000009:THIAGO RIBEIRO GUIDA:/home/c144687:/bin/bash
2026-06-08T14:00:23.4227040Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c021832:x:10021832:30000009:Roger Cristiano Brock:/home/c021832:/bin/bash
2026-06-08T14:00:23.4227393Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f559876:x:10559876:20001097:CARLOS FERNANDO CALDEIRA BRANT:/home/f559876:/bin/bash
2026-06-08T14:00:23.4227941Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a513265:x:10513265:30000004:Jaldo Paz da Silva - CNOPEBR21:/home/a513265:/bin/bash
2026-06-08T14:00:23.4228302Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a050378:x:10050378:30000004:Juliana Segantini:/home/a050378:/bin/bash
2026-06-08T14:00:23.4228676Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f932986:x:10932986:20001097:SIMONE ZENIR PESSOA C. TOLENTINO:/home/f932986:/bin/bash
2026-06-08T14:00:23.4229116Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c110508:x:10110508:20001097:Evangelista Batista de Oliveira - CEDESBR:/home/c110508:/bin/bash
2026-06-08T14:00:23.4229478Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c101492:x:10101492:20001097:Eugenio Alves Martins:/home/c101492:/bin/bash
2026-06-08T14:00:23.4230142Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c111807:x:10111807:20001097:Rafael Costa Braga:/home/c111807:/bin/bash
2026-06-08T14:00:23.4230502Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c101489:x:10101489:20001097:Sergio Martins Dealtry:/home/c101489:/bin/bash
2026-06-08T14:00:23.4234929Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c129426:x:10129426:20001097:Marcelo de Araujo Maximiano:/home/c129426:/bin/bash
2026-06-08T14:00:23.4235848Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c104086:x:10104086:20001097:Gessica Cachoeira dos Santos:/home/c104086:/bin/bash
2026-06-08T14:00:23.4236250Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c141990:x:10141990:20001097:DENISE SAYURI SAKAI:/home/c141990:/bin/bash
2026-06-08T14:00:23.4236612Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c074517:x:10074517:20001097:Rodrigo Ramos Palma:/home/c074517:/bin/bash
2026-06-08T14:00:23.4236971Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c112141:x:10112141:20000953:Rafael Augusto Soares:/home/c112141:/bin/bash
2026-06-08T14:00:23.4237517Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c079590:x:10079590:20001097:Eric Pignaton:/home/c079590:/bin/bash
2026-06-08T14:00:23.4237906Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c094675:x:10094675:30000009:Adriana Lima dos Santos:/home/c094675:/bin/bash
2026-06-08T14:00:23.4238273Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c072733:x:10072733:30000009:Carlos Virginio dos Santos:/home/c072733:/bin/bash
2026-06-08T14:00:23.4238631Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a736568:x:10736568:30000004:GIOVANE DO MONTE FURTADO NETO:/home/a736568:/bin/bash
2026-06-08T14:00:23.4239014Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f610692:x:10610692:20001097:RODRIGO MEDEIROS RAMALHO LUZ:/home/f610692:/bin/bash
2026-06-08T14:00:23.4240767Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f699848:x:10699848:20001097:LUCAS DANIEL DE MELO:/home/f699848:/bin/bash
2026-06-08T14:00:23.4241123Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a095610:x:10095610:30000004:Monique Alves de Morais:/home/a095610:/bin/bash
2026-06-08T14:00:23.4241487Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c088911:x:10088911:20000062:EWERTON ROFRAN DOS SANTOS ANDRADE:/home/c088911:/bin/bash
2026-06-08T14:00:23.4243655Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p657816:x:10657816:30000115:Marcos Antonio Ferreira:/home/p657816:/bin/bash
2026-06-08T14:00:23.4244078Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c105245:x:10105245:20001097:MARCELO DE CASTRO AREAL:/home/c105245:/bin/bash
2026-06-08T14:00:23.4244672Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c098816:x:10098816:20001097:GISELE SOUZA HALBIG:/home/c098816:/bin/bash
2026-06-08T14:00:23.4245423Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c144861:x:10144861:20000000:TULIO BERNARDES DOS SANTOS:/home/c144861:/bin/bash
2026-06-08T14:00:23.4246055Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f918260:x:10918260:20001097:RAIMUNDO CARLOS DE JESUS DA SILVA:/home/f918260:/bin/bash
2026-06-08T14:00:23.4246786Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c144410:x:10144410:20001097:ISABELLA AUGUSTA CAVALCANTI MOREIRA:/home/c144410:/bin/bash
2026-06-08T14:00:23.4247393Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): zabbix:x:20000271:20001100:Role.para.Administracao do zabbix:/opt/zabbix:/bin/pfksh
2026-06-08T14:00:23.4247976Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): boadmin:x:30000032:30000032:Role.para.Administrar.o.Business.Objects:/opt/boxir2:/bin/pfksh
2026-06-08T14:00:23.4248541Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c123526:x:10123526:20001097:TATIANA SANCHES BISCARI NAGASE:/home/c123526:/bin/bash
2026-06-08T14:00:23.4249089Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c062177:x:10062177:20001097:Luciana Cerqueira da Costa:/home/c062177:/bin/bash
2026-06-08T14:00:23.4254386Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f630904:x:10630904:20001097:MARISA YUMI TAKAGI:/home/f630904:
2026-06-08T14:00:23.4254996Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a109739:x:10109739:30000004:Vagner Leis de Araujo:/home/a109739:/bin/bash
2026-06-08T14:00:23.4255621Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c144987:x:10144987:30000004:Henrique Coutinho Guimaraes:/home/c144987:/bin/bash
2026-06-08T14:00:23.4256389Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c084329:x:10084329:20001097:Liziane Yasue Miyata:/home/c084329:/bin/bash
2026-06-08T14:00:23.4256966Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a794836:x:10794836:30000004:Lucas Claver Gomes Freire:/home/a794836:/bin/bash
2026-06-08T14:00:23.4257606Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a502073:x:10502073:30000004:LUIZ AFONSO BEMFICA:/home/a502073:/bin/bash
2026-06-08T14:00:23.4258479Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): prdadmin:x:20003760:30000009:Conta de servico da producao para agendamento de rotinas no ControlM:/home/prdadmin:/bin/bash
2026-06-08T14:00:23.4259297Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p712192:x:10712192:30000009:Airton Nunes de Sousa:/home/p712192:/bin/bash
2026-06-08T14:00:23.4259889Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c117757:x:10117757:20001097:Maria Jose da Silva:/home/c117757:/bin/bash
2026-06-08T14:00:23.4260466Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c145212:x:10145212:30000222:Camila Feitosa Bezerra:/home/c145212:/bin/bash
2026-06-08T14:00:23.4261039Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c140968:x:10140968:20001097:Denise Gomes Fernandes e Guimaraes:/home/c140968:/bin/bash
2026-06-08T14:00:23.4261594Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p695606:x:10695606:30000009:Cassio Tome Queiroz:/home/p695606:/bin/bash
2026-06-08T14:00:23.4261963Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p791314:x:10791314:30000009:Ricardo Lopes de Bastos:/home/p791314:/bin/bash
2026-06-08T14:00:23.4262496Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c091454:x:10091454:20001097:Sandra Fretes Mendes:/home/c091454:/bin/bash
2026-06-08T14:00:23.4263173Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a087014:x:10087014:30000001:Andre Luis Couto Cavalcanti:/home/a087014:/bin/bash
2026-06-08T14:00:23.4263631Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c145137:x:10145137:30000009:Gustavo Duarte Lepesteur da Costa:/home/c145137:/bin/bash
2026-06-08T14:00:23.4264356Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c064401:x:10064401:20001097:STEFANIA ORNELLAS ALVES DE ARAUJO LIRA:/home/c064401:/bin/bash
2026-06-08T14:00:23.4264718Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c130101:x:10130101:20000000:VINICIUS ANGELOZZI SILVA:/home/c130101:/bin/bash
2026-06-08T14:00:23.4265111Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c077691:x:10077691:20000000:ROQUE ROMELLI JUNIOR:/home/c077691:/bin/bash
2026-06-08T14:00:23.4265577Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c081891:x:10081891:20001097:Raphael Alves Bruce:/home/c081891:/bin/bash
2026-06-08T14:00:23.4265935Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f945747:x:10945747:20001097:PATRICIA DE OLIVEIRA SANTOS:/home/f945747:/bin/bash
2026-06-08T14:00:23.4266296Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c094923:x:10094923:30000009:Matheus Souto Vidal:/home/c094923:/bin/bash
2026-06-08T14:00:23.4266647Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c134541:x:10134541:20001097:IVAN FERREIRA DE LIMA:/home/c134541:/bin/bash
2026-06-08T14:00:23.4266996Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c134295:x:10134295:20001097:LUIZ FERNANDO MAIA GUIMARAES:/home/c134295:/bin/bash
2026-06-08T14:00:23.4267345Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c139937:x:10139937:20001097:RICARDO LOUZA LIRA:/home/c139937:/bin/bash
2026-06-08T14:00:23.4267755Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p731969:x:10731969:20001097:MARCOS AUGUSTO DE CAMPOS:/home/p731969:/bin/bash
2026-06-08T14:00:23.4268113Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f744113:x:10744113:20001097:ROMULO DA SILVA PENHA:/home/f744113:/bin/bash
2026-06-08T14:00:23.4268527Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c079513:x:10079513:20001097:Belizio Feitosa Beserra:/home/c079513:/bin/bash
2026-06-08T14:00:23.4269034Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f663441:x:10663441:20001097:MARCIO CASSIMIRO GOUVEA:/home/f663441:/bin/bash
2026-06-08T14:00:23.4269603Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f760461:x:10760461:20001097:DANILO FERREIRA PRADOS:/home/f760461:/bin/bash
2026-06-08T14:00:23.4270152Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p727181:x:10727181:30000222:Danilo Augusto Barbosa Ferreira:/home/p727181:/bin/bash
2026-06-08T14:00:23.4270673Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f981138:x:10981138:20001097:ADRIANA GUANAIS ALVESR:/home/f981138:/bin/bash
2026-06-08T14:00:23.4271084Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c102616:x:10102616:20001097:MURILLO HIGOR FERNANDES CARVALHAES:/home/c102616:
2026-06-08T14:00:23.4271498Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c052439:x:10052439:20001097:RICARDO DEODATO NEGRINI:/home/c052439:/bin/bash
2026-06-08T14:00:23.4271844Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f526879:x:10526879:20001097:ROSEMARY PASSOS SILVA:/home/f526879:
2026-06-08T14:00:23.4273509Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f631334:x:10631334:20001097:LEANDRO FERREIRA LIMA:/home/f631334:/bin/bash
2026-06-08T14:00:23.4274013Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f526082:x:10526082:20001097:EDMAR DA SILVA BARROS:/home/f526082:/bin/bash
2026-06-08T14:00:23.4274626Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c141930:x:10141930:30000009:Elson Bezerra Costa:/home/c141930:/bin/bash
2026-06-08T14:00:23.4275136Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p923816:x:10923816:30000065:DANIEL RODRIGUES MARQUES:/home/p923816:/bin/bash
2026-06-08T14:00:23.4275586Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f930649:x:10930649:20001097:JHONATAN KOLEN ALVES VIANA:/home/f930649:
2026-06-08T14:00:23.4276252Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c085489:x:10085489:20001097:REGINA XAVIER DE CASTRO:/home/c085489:/bin/bash
2026-06-08T14:00:23.4277303Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c145097:x:10145097:30000009:FELIPE RODRIGUES COSTA:/home/c145097:/bin/bash
2026-06-08T14:00:23.4277663Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c101037:x:10101037:30000009:Francisco Jose Gomide Romulo:/home/c101037:/bin/bash
2026-06-08T14:00:23.4279356Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a733355:x:10733355:20000000:Atila Nunes da Silva:/home/a733355:/bin/bash
2026-06-08T14:00:23.4279766Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c036215:x:10036215:20001097:ANTONIO MARCOS ARAUJO BORGES:/home/c036215:/bin/bash
2026-06-08T14:00:23.4280141Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f916448:x:10916448:20001097:SIBELE RODRIGUES MIYASAKA:/home/f916448:/bin/bash
2026-06-08T14:00:23.4280576Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a746309:x:10746309:30000004:Leandro da Silva Lima:/home/a746309:/bin/bash
2026-06-08T14:00:23.4281036Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a516838:x:10516838:30000004:FRANCISCO DE MEDEIROS FILHO:/home/a516838:/bin/bash
2026-06-08T14:00:23.4281424Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a785217:x:10785217:30000004:LUIZ CESAR SIMIAO:/home/a785217:/bin/bash
2026-06-08T14:00:23.4281798Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a991061:x:10991061:30000004:ARILSON PEREIRA BARBOSA:/home/a991061:/bin/bash
2026-06-08T14:00:23.4283039Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ssppbp01:x:20003770:20000985:Conta de BACKUP da ferramenta Spectrum Protect Plus:/home/ssppbp01:/bin/bash
2026-06-08T14:00:23.4283947Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f541182:x:10541182:20001097:EDUARDO AZEVEDO FILHO:/home/f541182:/bin/bash
2026-06-08T14:00:23.4284646Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a051417:x:10051417:30000004:Joao Fabiano Berlim Melo:/home/a051417:/bin/bash
2026-06-08T14:00:23.4285190Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a134534:x:10134534:20000000:ANDRE DAS CHAGAS SOUZA:/home/a134534:/bin/bash
2026-06-08T14:00:23.4286120Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c111772:x:10111772:20001097:SARA CARDOSO DA SILVA:/home/c111772:
2026-06-08T14:00:23.4286900Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a508919:x:10508919:30000004:Roverson Lima da Costa:/home/a508919:/bin/bash
2026-06-08T14:00:23.4288459Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f652821:x:10652821:20001097:DENISE BIANCHI SCALDAFERRI:/home/f652821:/bin/bash
2026-06-08T14:00:23.4288831Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c087355:x:10087355:20001097:HEBERT LUIZ DE SOUSA CIRINO:/home/c087355:/bin/bash
2026-06-08T14:00:23.4289200Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c083932:x:10083932:20001097:AMERICO VASS FILHO:/home/c083932:/bin/bash
2026-06-08T14:00:23.4289741Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f525277:x:10525277:20001097:LUIS MAURICIO SANTOS VILA:/home/f525277:/bin/bash
2026-06-08T14:00:23.4290381Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c145149:x:10145149:20001097:ARISTEU RORIZ NETO:/home/c145149:
2026-06-08T14:00:23.4290728Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f523814:x:10523814:20001097:ANTONIO PAULINO MORAES FILHO:/home/f523814:
2026-06-08T14:00:23.4291088Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f793872:x:10793872:20001097:SUZEL MARINHO DE SOUZA:/home/f793872:
2026-06-08T14:00:23.4291449Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c071346:x:10071346:30000222:Fabricio Simoes dos Santos:/home/c071346:/bin/bash
2026-06-08T14:00:23.4294047Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a050830:x:10050830:30000001:Mauricio de Lira Filgueiras:/home/a050830:/bin/bash
2026-06-08T14:00:23.4294434Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p734321:x:10734321:30000009:MANOEL PEREIRA DA SILVA FILHO:/home/p734321:/bin/bash
2026-06-08T14:00:23.4294806Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c081005:x:90081005:20000000:Emerson de Souza Albuquerque:/home/c081005:/bin/bash
2026-06-08T14:00:23.4295188Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c037033:x:10037033:30000004:Emilio Hirasawa - CNOPEBR21 - Analista:/home/c037033:/bin/bash
2026-06-08T14:00:23.4295633Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c050378:x:10050378:30000004:Juliana Segantini:/home/c050378:/bin/bash
2026-06-08T14:00:23.4296136Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c051417:x:10051417:30000004:Joao Fabiano Berlim Melo:/home/c051417:/bin/bash
2026-06-08T14:00:23.4296588Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c060739:x:10060739:30000004:Flavio Tulio Cortes dos Santos Machado:/home/c060739:/bin/bash
2026-06-08T14:00:23.4297160Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c078609:x:10078609:30000004:Elaine Fernades Albernaz Ferreira:/home/c078609:/bin/bash
2026-06-08T14:00:23.4298178Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c080014:x:10080014:30000004:Andrea Karla de Oliveira Sodre - CNOPEBR21 - Analista:/home/c080014:/bin/bash
2026-06-08T14:00:23.4299124Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c095610:x:10095610:30000004:Monique Alves de Morais:/home/c095610:/bin/bash
2026-06-08T14:00:23.4299489Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c098753:x:10098753:30000004:Guilherme Roberto Alves Shiga:/home/c098753:/bin/bash
2026-06-08T14:00:23.4300790Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c103837:x:10103837:30000004:Reinaldo Barboza dos Santos - CEPTIBR21:/home/c103837:/bin/bash
2026-06-08T14:00:23.4304277Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c127227:x:10127227:30000004:Felipe Roberto Silva - CNOPEBR21 - Analista:/home/c127227:/bin/bash
2026-06-08T14:00:23.4304672Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c129784:x:10129784:30000004:Elaine Almeida Xavier Oliveira:/home/c129784:/bin/bash
2026-06-08T14:00:23.4305031Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c134299:x:10134299:30000004:Miguel de Sousa Santos:/home/c134299:/bin/bash
2026-06-08T14:00:23.4305379Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c134577:x:10134577:30000009:Janio Viana:/home/c134577:/bin/bash
2026-06-08T14:00:23.4305837Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p502073:x:10502073:30000004:LUIZ AFONSO BEMFICA:/home/p502073:/bin/bash
2026-06-08T14:00:23.4317049Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p508919:x:10508919:30000004:Roverson Lima da Costa:/home/p508919:/bin/bash
2026-06-08T14:00:23.4317451Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p513265:x:10513265:30000004:Jaldo Paz da Silva - CNOPEBR21:/home/p513265:/bin/bash
2026-06-08T14:00:23.4317831Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p609410:x:10609410:30000004:Leonardo Greyner Rodrigues dos Reis Viana:/home/p609410:/bin/bash
2026-06-08T14:00:23.4326483Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p614849:x:10614849:30000004:Marcus Vinicius Freitas:/home/p614849:/bin/bash
2026-06-08T14:00:23.4327075Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p652214:x:10652214:30000004:Dyelson Karlos do Nascimento Castro:/home/p652214:/bin/bash
2026-06-08T14:00:23.4327501Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p658275:x:10658275:30000004:Jalisson Pereira da Silva Xavier:/home/p658275:/bin/bash
2026-06-08T14:00:23.4327942Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p697456:x:10697456:30000004:William Teixeira Botelho:/home/p697456:/bin/bash
2026-06-08T14:00:23.4328469Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p712753:x:10712753:30000004:Jonathan da Conceicao Carvalho:/home/p712753:/bin/bash
2026-06-08T14:00:23.4329319Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p733355:x:10733355:30000004:Atila Nunes da Silva:/home/p733355:/bin/bash
2026-06-08T14:00:23.4329872Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p736568:x:10736568:30000004:GIOVANE DO MONTE FURTADO NETO:/home/p736568:/bin/bash
2026-06-08T14:00:23.4330453Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p741324:x:10741324:30000004:Alex de Oliveira Sousa:/home/p741324:/bin/bash
2026-06-08T14:00:23.4331018Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p745682:x:10745682:30000004:Jose Vidal de Melo:/home/p745682:/bin/bash
2026-06-08T14:00:23.4331591Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p746309:x:10746309:30000004:Leandro da Silva Lima:/home/p746309:/bin/bash
2026-06-08T14:00:23.4332084Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p747342:x:10747342:30000004:Rodrigo Almeida Santos:/home/p747342:/bin/bash
2026-06-08T14:00:23.4332465Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p794836:x:10794836:30000004:Lucas Claver Gomes Freire:/home/p794836:/bin/bash
2026-06-08T14:00:23.4333043Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p919255:x:10919255:30000004:Alexandre Duarte Vilela:/home/p919255:/bin/bash
2026-06-08T14:00:23.4333401Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p935558:x:10935558:30000004:Charles Alves Barbosa:/home/p935558:/bin/bash
2026-06-08T14:00:23.4333790Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p947092:x:10947092:30000004:Edilson de Oliveira Bassul - CEPTIBR21 - Analista:/home/p947092:/bin/bash
2026-06-08T14:00:23.4334161Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p963749:x:10963749:30000004:Antonio Porfirio Junior:/home/p963749:/bin/bash
2026-06-08T14:00:23.4334517Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p972797:x:10972797:30000004:Jeandre Bernadelli Guerra:/home/p972797:/bin/bash
2026-06-08T14:00:23.4334962Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c101676:x:10101676:20001097:KAMY LIMA FORMIGA PONCE:/home/c101676:/bin/bash
2026-06-08T14:00:23.4337473Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f913286:x:10913286:20001097:SAVIO DA SILVA BARROS:/home/f913286:/bin/bash
2026-06-08T14:00:23.4337838Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f785639:x:10785639:20001097:ERIKA SOUSA MIRANDA:/home/f785639:/bin/bash
2026-06-08T14:00:23.4338510Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c077033:x:10077033:20001097:Jair Jose dos Santos:/home/c077033:/bin/bash
2026-06-08T14:00:23.4338874Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c080470:x:10080470:20001097:HARUMI KIMURA TAKAHASHI:/home/c080470:/bin/bash
2026-06-08T14:00:23.4339875Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c139522:x:10139522:20001097:Antonio Coelho Guimaraes Filho:/home/c139522:/bin/bash
2026-06-08T14:00:23.4340239Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f545285:x:10545285:20001097:RICARDO SIMOES KLEIN:/home/f545285:/bin/bash
2026-06-08T14:00:23.4340864Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f586477:x:10586477:20001097:TONI ALVES CUNHA:/home/f586477:/bin/bash
2026-06-08T14:00:23.4342894Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c144893:x:10144893:30000065:SHELTON ALESSANDRO TEIXEIRA DE MORAIS:/home/c144893:/bin/bash
2026-06-08T14:00:23.4343656Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c097280:x:10097280:30000001:VANESSA VASCONCELOS DIAS:/home/c097280:/bin/bash
2026-06-08T14:00:23.4344106Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c101277:x:10101277:20001097:CARLOS EDUARDO SANTOS MACHADO:/home/c101277:/bin/bash
2026-06-08T14:00:23.4344518Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p763993:x:10763993:20000000:MARCOS DE SOUSA BEZERRA:/home/p763993:
2026-06-08T14:00:23.4344962Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c127296:x:10127296:20001097:DEVALCI GERONIMO DOS SANTOS:/home/c127296:/bin/bash
2026-06-08T14:00:23.4345323Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c036978:x:10036978:20001097:CLAUDIO BONINI MARQUES:/home/c036978:
2026-06-08T14:00:23.4345681Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c339520:x:10339520:30000065:HUGO FONSECA FERNANDES:/home/c339520:/bin/bash
2026-06-08T14:00:23.4346610Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c134584:x:10134584:20001097:DANIEL DE PAULA LIMA:/home/c134584:
2026-06-08T14:00:23.4348246Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): F904311:x:10906145:20001097:ANTONIO JUNIO FARIAS CARREIRO:/home/f904311:/bin/bash
2026-06-08T14:00:23.4348971Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c113773:x:10113773:20001097:Gilberto Emanuel de Moraes Silva:/home/c113773:/bin/bash
2026-06-08T14:00:23.4349584Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c134585:x:10134585:20001097:Miqueias de Sousa Bezerra:/home/c134585:/bin/bash
2026-06-08T14:00:23.4350164Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c117307:x:10117307:20001097:Rene da Costa Assuncao:/home/c117307:/bin/bash
2026-06-08T14:00:23.4350760Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c128134:x:10128134:20001097:Waleska Christiane Ferreira Nunes:/home/c128134:/bin/bash
2026-06-08T14:00:23.4351794Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c068833:x:10068833:20001097:Erik Vieira Rodrigues:/home/c068833:/bin/bash
2026-06-08T14:00:23.4354400Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c102432:x:10102432:30000115:Henrique Pedra Jaber:/home/c102432:/bin/bash
2026-06-08T14:00:23.4358853Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c062667:x:10062667:30000207:JOSENILDO ANTONIO CIRIACO DE SOUZA:/home/c062667:/bin/bash
2026-06-08T14:00:23.4359540Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c115471:x:10115471:20000365:Hugo Cavalcanti Hatano:/home/c115471:/bin/bash
2026-06-08T14:00:23.4360116Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c065527:x:10065527:20001097:Nubio La Terza Revoredo:/home/c065527:/bin/bash
2026-06-08T14:00:23.4360684Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c112126:x:10112126:20000953:Cristina de Sousa Guimaraes:/home/c112126:/bin/bash
2026-06-08T14:00:23.4361122Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c128556:x:10128556:20001097:JOSE EDUARDO FERREIRA DA SILVA:/home/c128556:/bin/bash
2026-06-08T14:00:23.4361617Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c134275:x:10134275:20001097:Ricardo Silva de Aguiar:/home/c134275:/bin/bash
2026-06-08T14:00:23.4361984Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c134271:x:10134271:20001097:Luis Fernando Vizin:/home/c134271:/bin/bash
2026-06-08T14:00:23.4362351Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f957603:x:10957603:20001097:Tomaz de Aquino Mendes Neto:/home/f957603:/bin/bash
2026-06-08T14:00:23.4362804Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c131481:x:10131481:20001097:HELEN REIS SANTOS FREITAS:/home/c131481:/bin/bash
2026-06-08T14:00:23.4363365Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c122839:x:10122839:30000009:LINIELLE EVANGELISTA SANTOS GERARDINI:/home/c122839:
2026-06-08T14:00:23.4363725Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f750610:x:10750610:20001097:MAURICIO GOBOR:/home/f750610:/bin/bash
2026-06-08T14:00:23.4364090Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c109896:x:10109896:20001097:ALLYSSON DE OLIVEIRA VIEIRA:/home/c109896:/bin/bash
2026-06-08T14:00:23.4364446Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f793357:x:10793357:20001097:PAULO RICARDO DOS SANTOS:/home/f793357:/bin/bash
2026-06-08T14:00:23.4364830Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c135738:x:10135738:20001034:MARCELO ALESSANDRO SANTANA:/home/c135738:/bin/bash
2026-06-08T14:00:23.4365182Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p593149:x:10593149:30000009:TIAGO RODRIGUES MARQUES:/home/p593149:/bin/bash
2026-06-08T14:00:23.4365532Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p715874:x:10715874:30000009:WANDERSON SOUZA FONSECA:/home/p715874:/bin/bash
2026-06-08T14:00:23.4365900Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p719543:x:10719543:30000009:ULISSES JEFFERSON COSTA E SILVA:/home/p719543:/bin/bash
2026-06-08T14:00:23.4366252Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f594929:x:10594929:20001097:RAFAEL MORETTI DE FREITAS:/home/f594929:/bin/bash
2026-06-08T14:00:23.4366603Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c137459:x:10137459:20001097:Thiago da Silva Menezes:/home/c137459:/bin/bash
2026-06-08T14:00:23.4366962Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a751570:x:10751570:30000004:Felix Garcia Neiva Molina:/home/a751570:/bin/bash
2026-06-08T14:00:23.4367332Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c137136:x:10137136:30000065:Bruno Judson de Almeida do Lago:/home/c137136:/bin/bash
2026-06-08T14:00:23.4367700Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f999160:x:10999160:20001097:Alexandre Morais Silva:/home/f999160:/bin/bash
2026-06-08T14:00:23.4368166Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p928648:x:10928648:30000009:Helio Ricardo Matos C Pinto:/home/p928648:/bin/bash
2026-06-08T14:00:23.4368516Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f797083:x:10797083:20001097:PAULA PEREIRA LEMES:/home/f797083:/bin/bash
2026-06-08T14:00:23.4368877Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c112931:x:10112931:20001097:ZELIA CAROLINE SILVA DOS SANTOS AMARAL:/home/c112931:/bin/bash
2026-06-08T14:00:23.4369233Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c140607:x:10140607:20001097:LARISSA FERNANDES DE OLIVEIRA:/home/c140607:
2026-06-08T14:00:23.4369590Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c113780:x:10113780:20001097:Dijalma Antonio de Carvalho:/home/c113780:/bin/bash
2026-06-08T14:00:23.4369955Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f996594:x:10996594:20001094:IURI ANDREI FEITOSA PETROLA:/home/f996594:/bin/bash
2026-06-08T14:00:23.4370379Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p762564:x:10762564:30000115:JONATAS LOPES FERREIRA:/home/p762564:/bin/bash
2026-06-08T14:00:23.4370770Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c142829:x:10142829:20001097:NAYARA GASTON SANTANA:/home/c142829:
2026-06-08T14:00:23.4371166Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c142930:x:10142930:20001097:JOSE ADEMAR PEIXOTO DE SOUZA:/home/c142930:/bin/bash
2026-06-08T14:00:23.4371515Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c051738:x:10051738:20001097:Peterson Lomba Soldati:/home/c051738:/bin/bash
2026-06-08T14:00:23.4372136Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c061045:x:10061045:20001097:Felipe Ferreira Garcia:/home/c061045:/bin/bash
2026-06-08T14:00:23.4374694Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c126033:x:10126033:20001097:Leonam Goncalves Teixeira Silva:/home/c126033:/bin/bash
2026-06-08T14:00:23.4375074Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c072655:x:10072655:20001097:BITTER ARAUJO GONCALVES CRUZ:/home/c072655:
2026-06-08T14:00:23.4375652Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c071723:x:10071723:30000009:GUILHERME DA COSTA MORAES:/home/c071723:
2026-06-08T14:00:23.4376747Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c021965:x:10021965:20001097:CARLOS AUGUSTO STEHLING:/home/c021965:
2026-06-08T14:00:23.4377100Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c070680:x:10070680:20001097:ROBSON SANTOS MIRANDA:/home/c070680:
2026-06-08T14:00:23.4377444Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c111338:x:10111338:20001097:LAIS BRUM CARACIKI:/home/c111338:
2026-06-08T14:00:23.4377882Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c094882:x:10094882:20001097:DANIELLY ALDE LEONI:/home/c094882:
2026-06-08T14:00:23.4379510Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c076578:x:10076578:20000000:FLAVIANE FERNANDES ALVES WILLEMAM:/home/c076578:
2026-06-08T14:00:23.4380040Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c079244:x:10079244:20001097:ANDREA NUNES LAGE:/home/c079244:
2026-06-08T14:00:23.4380561Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c133699:x:10133699:20001097:FABIO MONTEIRO MATEUS:/home/c133699:
2026-06-08T14:00:23.4381303Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c086998:x:10086998:20001097:BRUNO AZEVEDO MAIA:/home/c086998:
2026-06-08T14:00:23.4382013Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c134469:x:10134469:20001097:LUCIANA ANTUNES GARCIA CASILHA:/home/c134469:
2026-06-08T14:00:23.4383292Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c083585:x:10083585:20001097:LEANDRO CASTRO DOS SANTOS:/home/c083585:
2026-06-08T14:00:23.4383960Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c141845:x:10141845:20001097:JOAO CARLOS VEIGA DA SILVA:/home/c141845:
2026-06-08T14:00:23.4384597Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c090630:x:10090630:20001097:PAULO FERNANDO MIRANDA SINETTI:/home/c090630:/bin/bash
2026-06-08T14:00:23.4385234Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c071134:x:10071134:20001097:RODOLFO ZIBORDI GIAO:/home/c071134:/bin/bash
2026-06-08T14:00:23.4385851Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c077162:x:10077162:20001097:FERNANDO PEREIRA ROSA:/home/c077162:/bin/bash
2026-06-08T14:00:23.4386479Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c104418:x:10104418:30000004:MARIO LUIZ COSTA MARINHO DA SILVA:/home/c104418:
2026-06-08T14:00:23.4387063Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c127162:x:10127162:20001097:IZAC LINS DOS SANTOS:/home/c127162:
2026-06-08T14:00:23.4387663Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c060172:x:10060172:20001097:KLEBER FREITAS BARBOSA:/home/c060172:
2026-06-08T14:00:23.4388495Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c083805:x:10083805:20001108:FLAVIO DE ALMEIDA GAGLIARDI:/home/c083805:
2026-06-08T14:00:23.4389101Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c105762:x:10105762:20001097:LAWRENCE NAKAMURA:/home/c105762:/bin/bash
2026-06-08T14:00:23.4389725Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c126039:x:10126039:20001097:VINICIUS GOMES DE CASTRO ABRANTES FERRAO:/home/c126039:
2026-06-08T14:00:23.4390344Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c112109:x:10112109:20001097:DIOGO ARAUJO PACHECO WANZELLER:/home/c112109:
2026-06-08T14:00:23.4390959Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c025788:x:10025788:20001097:JUNIO CESAR DA SILVA:/home/c025788:/bin/bash
2026-06-08T14:00:23.4391571Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c070833:x:10070833:20001097:NELSON MACHADO JUNIOR:/home/c070833:
2026-06-08T14:00:23.4392209Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a081121:x:10081121:30000004:LEANDRO NOGUEIRA DE MEDEIROS:/home/a081121:/bin/bash
2026-06-08T14:00:23.4392918Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c081112:x:10081112:20001097:ALEX JANELLI DE MORAIS:/home/c081112:
2026-06-08T14:00:23.4393756Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c146812:x:10146812:20001097:GUSTAVO ANDRE FONTES LOPES:/home/c146812:
2026-06-08T14:00:23.4394380Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c139508:x:10139508:20001097:GILDECY JUNIOR LISBOA CALABRO:/home/c139508:
2026-06-08T14:00:23.4395151Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c082405:x:10082405:20000000:OSMAR MASIERO DIAS:/home/c082405:/bin/bash
2026-06-08T14:00:23.4395783Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c081073:x:10081073:20000000:GABRIEL THOME LINDOSO:/home/c081073:/bin/bash
2026-06-08T14:00:23.4396801Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c065440:x:10065440:20001097:WELBER MACHADO DE GOUVEIA:/home/c065440:/bin/bash
2026-06-08T14:00:23.4397549Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f620971:x:10620971:20001097:VINICIUS DE OLIVEIRA:/home/f620971:
2026-06-08T14:00:23.4398680Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c141931:x:10141931:20001097:ANDRE TAVARES ADORNO:/home/c141931:
2026-06-08T14:00:23.4399335Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c060010:x:10060010:30000004:THIAGO HENRIQUE RIGHETTI E SILVA:/home/c060010:/bin/bash
2026-06-08T14:00:23.4399934Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c148682:x:10148682:30000004:HEITOR OLIVEIRA DA SILVA FILHO:/home/c148682:/bin/bash
2026-06-08T14:00:23.4400501Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c148701:x:10148701:30000004:FABIANO NUNES VELOSO:/home/c148701:/bin/bash
2026-06-08T14:00:23.4401304Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c066893:x:10066893:20001097:RICARDO LINDON MARQUES DA SILVA:/home/c066893:/bin/bash
2026-06-08T14:00:23.4401857Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c072424:x:10072424:20001097:FABIO ROMAO PRADO:/home/c072424:
2026-06-08T14:00:23.4402391Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c148672:x:10148672:30000360:ROSIMAR DE MELO:/home/c148672:/bin/bash
2026-06-08T14:00:23.4403038Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c148677:x:10148677:30000360:IVANOR PEREIRA REIS JUNIOR:/home/c148677:/bin/bash
2026-06-08T14:00:23.4404866Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p987659:x:10987659:30000009:DOUGLAS ROBERTO DOS SANTOS:/home/p987659:
2026-06-08T14:00:23.4405391Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c061028:x:10061028:20001097:MARCIO GIGLIO:/home/c061028:
2026-06-08T14:00:23.4405947Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c148674:x:10148674:20001097:ALESSANDRO JOSE DOS SANTOS:/home/c148674:/bin/bash
2026-06-08T14:00:23.4406484Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c134546:x:10134546:20001097:PAULO HENRIQUE CARDOSO DA SILVA:/home/c134546:
2026-06-08T14:00:23.4407033Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c109784:x:10109784:20001097:LUIS ESPINDOLA DE CARVALHO SOBRINHO:/home/c109784:
2026-06-08T14:00:23.4407570Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p932363:x:10932363:30000009:ELAINE CRISTINA AZEVEDO DE OLIVEIRA:/home/p932363:
2026-06-08T14:00:23.4408123Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p914334:x:10914334:20001097:MARCIA CRISTINA FONTOURA PEREIRA:/home/p914334:
2026-06-08T14:00:23.4408669Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c075099:x:10075099:20001097:FELIX SILVA DE OLIVEIRA JUNIOR:/home/c075099:
2026-06-08T14:00:23.4409207Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c083474:x:10083474:20001097:CINTHIA TIEMY LIAUGAUDAS:/home/c083474:
2026-06-08T14:00:23.4410172Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c067581:x:10067581:30000009:DANIELA PERNG:/home/c067581:
2026-06-08T14:00:23.4410796Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c079593:x:10079593:20001097:ALEXANDRA AVILAR PEREIRA:/home/c079593:
2026-06-08T14:00:23.4411418Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c127183:x:10127183:20001097:CICERO ANTONIO DE ANDRADE:/home/c127183:
2026-06-08T14:00:23.4412035Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c073082:x:10073082:20001097:MARCELO AMOSIS CORREIA DEFREITAS:/home/c073082:
2026-06-08T14:00:23.4413145Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c082237:x:10082237:20001097:FELIPE SERGIO MARUJO:/home/c082237:
2026-06-08T14:00:23.4413746Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c029091:x:10029091:20001097:REGINA HAMASAKI:/home/c029091:
2026-06-08T14:00:23.4414343Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c129733:x:10129733:20001097:CAROLINA INFANTI PEDROSO:/home/c129733:
2026-06-08T14:00:23.4415375Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p531014:x:10531014:20001097:FRANCISCO WEBISTEMACIO DE LIMA:/home/p531014:
2026-06-08T14:00:23.4415972Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p798334:x:10798334:20001097:GERSON ALUISIO PEREIRA DA SILVA:/home/p798334:
2026-06-08T14:00:23.4416810Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c129424:x:10129424:20001097:ANTONIO SAES CACERES JUNIOR:/home/c129424:
2026-06-08T14:00:23.4417484Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c144656:x:10144656:20001097:ANTONIO RUMMENIGG BENTO PAIVA:/home/c144656:
2026-06-08T14:00:23.4418008Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c076707:x:10076707:20001097:PABLO LEAL PIRES:/home/c076707:
2026-06-08T14:00:23.4418807Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c104994:x:10104994:20001097:ALYSSON GOMES SILVA:/home/c104994:
2026-06-08T14:00:23.4419472Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c081122:x:10081122:20001097:DANIELE PEREIRA DE OLIVEIRA:/home/c081122:
2026-06-08T14:00:23.4420194Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c148772:x:10148772:20001097:TIAGO DE MORAIS AGUIAR PELLES:/home/c148772:
2026-06-08T14:00:23.4420873Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c077214:x:10077214:20001097:ALEXANDRE DE CARVALHO FORTES:/home/c077214:
2026-06-08T14:00:23.4421494Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c062308:x:10062308:20001097:KATIA MARCELINO LEITE:/home/c062308:
2026-06-08T14:00:23.4422090Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f684623:x:10684623:20001097:KELVIN MARQUES ROCHA:/home/f684623:
2026-06-08T14:00:23.4423095Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c052102:x:10052102:30000207:EDUARDO NAGAI:/home/c052102:/bin/bash
2026-06-08T14:00:23.4423688Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c120279:x:10120279:20001097:NEY BRAGA DE CARVALHO:/home/c120279:
2026-06-08T14:00:23.4424429Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p910178:x:10910178:20001097:MARCELO CELESTINO DOS SANTOS:/home/p910178:
2026-06-08T14:00:23.4424979Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c142830:x:10142830:20001097:WANDERSON RAMOS BACELO:/home/c142830:
2026-06-08T14:00:23.4425526Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c104388:x:10104388:20001097:PAULO VINICIUS DE MIRANDA CORAL:/home/c104388:
2026-06-08T14:00:23.4426093Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c108809:x:10108809:20000063:MARCO AURELIO ROMAO MESQUITA:/home/c108809:/bin/bash
2026-06-08T14:00:23.4426636Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c069074:x:10069074:20001097:FABIO FEITOSA SILVA:/home/c069074:
2026-06-08T14:00:23.4427668Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c148697:x:10148697:20001097:LUIZ CARLOS DOS SANTOS NETO:/home/c148697:/bin/bash
2026-06-08T14:00:23.4428222Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f615764:x:10615764:20001097:PAULO ROBERTO DE SOUSA JUNIOR:/home/f615764:
2026-06-08T14:00:23.4428889Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c035491:x:10035491:20000000:JOSELITO MONDADORI DE OLIVEIRA:/home/c035491:/bin/bash
2026-06-08T14:00:23.4429446Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c104333:x:10104333:20001097:RAFAEL MAGNO DE CARVALHO RIBEIRO:/home/c104333:
2026-06-08T14:00:23.4429971Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c081204:x:10081204:20001097:FELIPE DE ABREU CORREA:/home/c081204:
2026-06-08T14:00:23.4430510Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c084792:x:10084792:20000000:EMILIA DE SIQUEIRA GONCALVES:/home/c084792:/bin/bash
2026-06-08T14:00:23.4431037Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c093704:x:10093704:20001097:ROMULO FRAGA DE OLIVEIRA:/home/c093704:
2026-06-08T14:00:23.4431573Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c051318:x:10051318:20001097:CLAUDIO ROBERTO DE CARVALHO:/home/c051318:
2026-06-08T14:00:23.4432098Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c048546:x:10048546:20001097:MARCELO LUCINDO DE SOUZA:/home/c048546:
2026-06-08T14:00:23.4432678Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c148667:x:10148667:20001097:DIEGO DO NASCIMENTO:/home/c148667:
2026-06-08T14:00:23.4433204Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c069441:x:10069441:20001097:LISIANE LIMBERGER:/home/c069441:
2026-06-08T14:00:23.4433798Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f940271:x:10940271:20001097:EDOARDO BIANCO:/home/f940271:
2026-06-08T14:00:23.4434323Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c078822:x:10078822:20001097:MARCOS COUTINHO MARTINS:/home/c078822:
2026-06-08T14:00:23.4434888Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): sansbp01:x:20003846:20001077:Usuario do Ansible - WO0000049756814:/home/sansbp01:/bin/bash
2026-06-08T14:00:23.4435658Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p563620:x:10563620:20001008:LEANDRO SALVADOR DE VASCONCELOS:/home/p563620:/bin/bash
2026-06-08T14:00:23.4436191Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c111761:x:10111761:20001097:EDUARDO SHOIJI TANAKA:/home/c111761:
2026-06-08T14:00:23.4436709Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c087086:x:10087086:20001097:PATRICIA PEREIRA DA SILVA:/home/c087086:
2026-06-08T14:00:23.4437207Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c112680:x:10112680:20000000:LARYSSA MORAES DOS SANTOS:/home/c112680:
2026-06-08T14:00:23.4437720Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c050761:x:10050761:20001097:MARCUS VINICIUS MARCONDES RAMALHO:/home/c050761:
2026-06-08T14:00:23.4438231Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f962988:x:10962988:20001097:JULIANA SILVEIRA DA SILVA:/home/f962988:
2026-06-08T14:00:23.4438969Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c100993:x:10100993:20001097:RAPHAEL EPIFANIO:/home/c100993:
2026-06-08T14:00:23.4439529Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c079626:x:10079626:20001097:HENRIQUE RIGONI GONSALVES:/home/c079626:
2026-06-08T14:00:23.4440063Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c086948:x:10086948:20001097:BRUNO MARQUES COSTA:/home/c086948:
2026-06-08T14:00:23.4440600Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c142869:x:10142869:20001097:UBIRAJARA BANDEIRA BARROS:/home/c142869:
2026-06-08T14:00:23.4441515Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c131543:x:10131543:20001097:GUSTAVO REBELATO PAVAN:/home/c131543:
2026-06-08T14:00:23.4442070Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c062510:x:10062510:20001097:ROSSI MEDEIROS DA SILVA:/home/c062510:
2026-06-08T14:00:23.4442743Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c058369:x:10058369:20001097:RICARDO PASCHOETO DOS SANTOS:/home/c058369:
2026-06-08T14:00:23.4443313Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f784448:x:10784448:20001097:LEONARDO DA SILVA DINIZ SOBRINHO:/home/f784448:
2026-06-08T14:00:23.4443932Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c059002:x:10059002:20001097:VALCI PORTO DE ALMEIDA JUNIOR:/home/c059002:
2026-06-08T14:00:23.4444525Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c113383:x:10113383:20001097:PRISCILA PEREIRA DA SILVA BRAZ:/home/c113383:
2026-06-08T14:00:23.4445139Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p973269:x:10973269:20001097:EVERTON PIRES DE OLIVEIRA:/home/p973269:
2026-06-08T14:00:23.4445739Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p791223:x:10791223:20001097:JORGE SIOZO TSOUKAMOTO:/home/p791223:
2026-06-08T14:00:23.4446328Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p641940:x:10641940:20001097:ALEXANDRE SILVA HARAKAWA:/home/p641940:
2026-06-08T14:00:23.4447051Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p759903:x:10759903:20001097:EDERALDO LUIS HERNANDES:/home/p759903:
2026-06-08T14:00:23.4447581Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p595356:x:10595356:20001097:EDUARDO DE ARAUJO:/home/p595356:
2026-06-08T14:00:23.4448118Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p532159:x:10532159:20001097:FLAVIANO FERNANDES DE OLIVEIRA:/home/p532159:
2026-06-08T14:00:23.4448735Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p743107:x:10743107:20001097:CARLOS EDUARDO DE JESUS ONIBENI:/home/p743107:
2026-06-08T14:00:23.4449334Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p930704:x:10930704:20001097:ANDRE DA SILVA RAMIRO:/home/p930704:
2026-06-08T14:00:23.4449907Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p703787:x:10703787:20001097:CELSO ALVES DE DEUS:/home/p703787:
2026-06-08T14:00:23.4450520Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p517038:x:10517038:20001097:FABIO CESAR DA CONCEICAO ARAUJO:/home/p517038:
2026-06-08T14:00:23.4451114Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p733367:x:10733367:20001097:ISRAEL DA SILVA DAMASCENO:/home/p733367:
2026-06-08T14:00:23.4451717Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p563911:x:10563911:20001097:ROGERIO DAS NEVES PEREIRA:/home/p563911:
2026-06-08T14:00:23.4452317Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p795029:x:10795029:20001097:MAURICIO RICARDO DE MENEZES:/home/p795029:
2026-06-08T14:00:23.4453026Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c111751:x:10111751:20001097:ELAINE ANDRADE PIRES:/home/c111751:
2026-06-08T14:00:23.4453640Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f561593:x:10561593:20001097:PABLO RAPHAEL QUEIROZ DE ANDRADE:/home/f561593:
2026-06-08T14:00:23.4454257Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f589916:x:10589916:20001097:MARCELO LUIZ DO AMARAL SANTOS:/home/f589916:
2026-06-08T14:00:23.4454850Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f558039:x:10558039:20001097:MARCELO SENA PINTO:/home/f558039:
2026-06-08T14:00:23.4455614Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c072646:x:10072646:20001097:CLAUDIMIR MARTINS PINTO:/home/c072646:
2026-06-08T14:00:23.4456205Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p513758:x:10513758:20001097:FERNANDO SASSI MASCAGNI:/home/p513758:
2026-06-08T14:00:23.4456801Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c139563:x:10139563:20001097:EDUARDO SCHETTINI GUIMARAES:/home/c139563:
2026-06-08T14:00:23.4457398Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f695989:x:10695989:20001097:HEIDER BERNARDES SILVEIRA:/home/f695989:
2026-06-08T14:00:23.4457993Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f910540:x:10910540:20001097:NATHALIA TEIXEIRA DE MELLO:/home/f910540:
2026-06-08T14:00:23.4458575Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f664854:x:10664854:20001097:ERIK FERREIRA NUNES:/home/f664854:
2026-06-08T14:00:23.4459170Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f743924:x:10743924:20001097:IVAN MADEIRA CARVALHO:/home/f743924:
2026-06-08T14:00:23.4459761Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p971504:x:10971504:20001097:WILLIAM FARIA DE OLIVEIRA:/home/p971504:
2026-06-08T14:00:23.4460331Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p735780:x:10735780:20001097:ALEX PRIETO:/home/p735780:
2026-06-08T14:00:23.4460961Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c077611:x:10077611:20001097:BARBARA BATISTA PIRES:/home/c077611:
2026-06-08T14:00:23.4461556Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c081827:x:10081827:20001097:ALEXSANDER MENDONCA TRAGEL:/home/c081827:
2026-06-08T14:00:23.4462128Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p745573:x:10745573:30000004:CID HIKARO DE SOUSA SASAKI:/home/p745573:
2026-06-08T14:00:23.4462804Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p767931:x:10767931:20001097:MARCIO AFFONSO RAMOS:/home/p767931:
2026-06-08T14:00:23.4463423Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c077902:x:10077902:20001097:OLYZI MARIA AMARAL DE MIRANDA:/home/c077902:
2026-06-08T14:00:23.4464041Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p995893:x:10995893:20001004:ANDERSON OLIVEIRA LIMA:/home/p995893:/bin/bash
2026-06-08T14:00:23.4464662Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c135326:x:10135326:20000056:ACYR FREDERICO LEOCADIO:/home/c135326:/bin/bash
2026-06-08T14:00:23.4465334Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c109049:x:10109049:20001097:ALSIONI RITA MARTINS LUPPI:/home/c109049:
2026-06-08T14:00:23.4465979Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c074092:x:10074092:20001097:JORGE LEANDRO DA SILVA PEREIRA:/home/c074092:
2026-06-08T14:00:23.4466570Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c071605:x:10071605:20001097:RAFAEL COSTA CYSNEIROS:/home/c071605:
2026-06-08T14:00:23.4467204Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c139544:x:10139544:30000009:LUIZ CARLOS FONTES FERREIRA DA CUNHA:/home/c139544:/bin/bash
2026-06-08T14:00:23.4467849Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a082368:x:10082368:30000001:GLEIDES MARILIA DOS SANTOS:/home/a082368:/bin/bash
2026-06-08T14:00:23.4468468Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c093540:x:10093540:20001097:RAFAEL FLORIPES MANGUEIRA:/home/c093540:
2026-06-08T14:00:23.4469077Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c089981:x:10089981:20001097:MARY DE FREITAS SILVA FERREIRA:/home/c089981:
2026-06-08T14:00:23.4469737Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c148754:x:10148754:20001097:HUGO LEONARDO LIMA DA SILVA:/home/c148754:
2026-06-08T14:00:23.4470325Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c126151:x:10126151:20001097:ANDERSON FRANCISCO DA SILVA:/home/c126151:
2026-06-08T14:00:23.4470942Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c083245:x:10083245:20001097:RICARDO ALEX SANTOS DE MORAES:/home/c083245:
2026-06-08T14:00:23.4471567Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c069797:x:10069797:20001097:THIAGO EUFRASIO CARREIRO TATAGIBA:/home/c069797:
2026-06-08T14:00:23.4472184Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c052336:x:10052336:20001097:LEONARDO ARAUJO FERREIRA DA SILVA:/home/c052336:
2026-06-08T14:00:23.4472876Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c104377:x:10104377:20001097:MARCELO DE SOUZA GUIMARAES:/home/c104377:
2026-06-08T14:00:23.4473509Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c113753:x:10113753:20001097:PALOMA BUARQUE SOARES DE GUSMAO:/home/c113753:/bin/bash
2026-06-08T14:00:23.4474118Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c051078:x:10051078:20001097:FABIANA GOES SALLES:/home/c051078:
2026-06-08T14:00:23.4474759Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c115722:x:10115722:20001097:MOEMA VIEIRA FERNANDES:/home/c115722:
2026-06-08T14:00:23.4475340Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c129857:x:10129857:20001097:VANESSA MARQUES DE CARVALHO RIBEIRO:/home/c129857:
2026-06-08T14:00:23.4475923Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c120190:x:10120190:20001097:WILLIAN TOMAZ NIECKARZ:/home/c120190:
2026-06-08T14:00:23.4476530Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c134156:x:10134156:20001097:EDUARDO NASCIMENTO DA SILVA:/home/c134156:
2026-06-08T14:00:23.4477128Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c137133:x:10137133:20001097:MARCIO JOSE ARAUJO DA SILVEIRA:/home/c137133:
2026-06-08T14:00:23.4477715Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f927449:x:10927449:20001097:PEDRO DE SOUZA LYNCH:/home/f927449:
2026-06-08T14:00:23.4478327Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p774921:x:10774921:30000009:DARLAN NUNES DO NASCIMENTO:/home/p774921:/bin/bash
2026-06-08T14:00:23.4478918Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p936957:x:10936957:20001097:MARCELO BATISTA DE GODOI:/home/p936957:
2026-06-08T14:00:23.4479526Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c053963:x:10053963:20001097:CARLOS CESAR DE OLIVEIRA POLO:/home/c053963:
2026-06-08T14:00:23.4480115Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f542067:x:10542067:20001097:RONALDO ALVES RIOS:/home/f542067:
2026-06-08T14:00:23.4485962Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c091459:x:10091459:20001097:SHIRLEI SOARES MEDEIROS BRAGHETTO:/home/c091459:
2026-06-08T14:00:23.4486618Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c142835:x:10142835:20001097:MICHAEL LOURANT DE OLIVEIRA FERREIRA:/home/c142835:/bin/bash
2026-06-08T14:00:23.4487367Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f661111:x:10661111:20001097:DOUGLAS SOARES CAVALCANTE CALDAS:/home/f661111:
2026-06-08T14:00:23.4487967Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f729254:x:10729254:20001097:DELEON MESQUITA SIMONI:/home/f729254:
2026-06-08T14:00:23.4488745Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c112460:x:10112460:20001097:CARLOS ALBERTO MARQUES ILDEFONSO:/home/c112460:
2026-06-08T14:00:23.4489346Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f979611:x:10979611:20001097:RICARDO RODRIGUES DINIZ:/home/f979611:
2026-06-08T14:00:23.4489932Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c074579:x:10074579:20001097:ALEXANDRE ISHIDA OKABAYASHI:/home/c074579:
2026-06-08T14:00:23.4490528Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c142951:x:10142951:20001097:RAFAEL VICTOR MELO RESENDE:/home/c142951:
2026-06-08T14:00:23.4491151Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c113779:x:10113779:20000000:RAIBATAN FELIPE GONCALVES NEIVA:/home/c113779:/bin/bash
2026-06-08T14:00:23.4491759Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c051171:x:10051171:20001097:DIEGO DE SOUZA VON SOHSTEN:/home/c051171:
2026-06-08T14:00:23.4492353Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c083600:x:10083600:20001097:SARAH RAQUEL DE LIMA FERNANDES:/home/c083600:
2026-06-08T14:00:23.4493018Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c086611:x:10086611:20001097:RICARDO MENDONCA MATIAS:/home/c086611:
2026-06-08T14:00:23.4493600Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c126307:x:10126307:20001097:JORGE MICHEL KIM:/home/c126307:
2026-06-08T14:00:23.4494282Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c129766:x:10129766:30000222:GIORDANO BRUNO GUEDES VIANA:/home/c129766:/bin/bash
2026-06-08T14:00:23.4494871Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c142834:x:10142834:20001097:LUCIMAR RODRIGUES DE ARAUJO:/home/c142834:
2026-06-08T14:00:23.4495453Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f516574:x:10516574:20001097:ALAN FARIAS DE MENEZES:/home/f516574:
2026-06-08T14:00:23.4496039Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c080028:x:10080028:20001097:MADSON COELHO DA SILVA:/home/c080028:
2026-06-08T14:00:23.4496641Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c148665:x:10148665:20001097:HEVERSON RIBEIRO CAMPELO:/home/c148665:
2026-06-08T14:00:23.4497230Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c086266:x:10086266:20001097:VITOR BAPTISTA DE SOUZA:/home/c086266:
2026-06-08T14:00:23.4497842Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f503860:x:10503860:20001097:FERNANDO FERREIRA REIS DE SOUZA:/home/f503860:
2026-06-08T14:00:23.4498422Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f929256:x:10929256:20001097:ERNESTO PINZAN NETO:/home/f929256:
2026-06-08T14:00:23.4499007Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c117031:x:10117031:20001097:RAPHAEL CARDOSO SOBRINHO:/home/c117031:
2026-06-08T14:00:23.4499582Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f567286:x:10567286:20001097:MILTON FRANCA FILHO:/home/f567286:
2026-06-08T14:00:23.4500176Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c139519:x:10139519:20001097:PAULO HENRIQUE ALVES DO AMARAL:/home/c139519:
2026-06-08T14:00:23.4500778Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c094575:x:10094575:20001097:LUCIA HELENA RIBEIRO PINTO:/home/c094575:
2026-06-08T14:00:23.4501379Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c094917:x:10094917:20000000:PAULO HENRIQUE VASCONCELOS DA SILVA:/home/c094917:/bin/bash
2026-06-08T14:00:23.4502060Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c070508:x:10070508:20001097:PATRICIA DA CONCEICAO DE LIMA:/home/c070508:
2026-06-08T14:00:23.4502751Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p620841:x:10620841:30000004:WELLINGTON SANTOS CANDIDO:/home/p620841:/bin/bash
2026-06-08T14:00:23.4503445Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p610088:x:10610088:30000065:DIOGO CARVALHO PITALUGA:/home/p610088:/bin/bash
2026-06-08T14:00:23.4504066Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c104849:x:10104849:20001097:LUIZ FILIPE DA SILVA AZEVEDO:/home/c104849:
2026-06-08T14:00:23.4504660Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f570718:x:10570718:20001097:ULISSES DE CASTRO LOURENCO:/home/f570718:
2026-06-08T14:00:23.4505258Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c115920:x:10115920:20001097:JEFFERSON DE LIMA ALENCAR:/home/c115920:/bin/bash
2026-06-08T14:00:23.4505839Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f718588:x:10718588:20001097:RAMON MUNIZ DOS SANTOS:/home/f718588:
2026-06-08T14:00:23.4506453Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f648928:x:10648928:20001097:MARCOS ANTONIO DA COSTA GUIMARAES:/home/f648928:/bin/bash
2026-06-08T14:00:23.4507081Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c090272:x:10090272:20000063:CARLOS BORBA DE CARVALHO FILHO:/home/c090272:/bin/bash
2026-06-08T14:00:23.4507772Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f923226:x:10923226:20001097:NATAN LARA FERREIRA:/home/f923226:
2026-06-08T14:00:23.4508366Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c102886:x:10102886:20001097:ROGER NOGUEIRA RAMOS:/home/c102886:/bin/bach
2026-06-08T14:00:23.4508944Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c114375:x:10114375:20001097:LILIANE LOPES LEAL:/home/c114375:
2026-06-08T14:00:23.4509528Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p768845:x:10768845:30000207:JOSE MILTON DA SILVA:/home/p768845:/bin/bash
2026-06-08T14:00:23.4510122Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p771888:x:10771888:20001097:LANDERSON SICOLI:/home/p771888:/bin/bash
2026-06-08T14:00:23.4510715Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p944471:x:10944471:20000000:MARINA KURINOWAKI:/home/p944471:/bin/bash
2026-06-08T14:00:23.4511307Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f970187:x:10970187:20001097:ZAIRA LUCIA CRUZ DE SOUSA:/home/f970187:
2026-06-08T14:00:23.4511870Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c109167:x:10109167:20001097:MAYCON DIAS COSTA:/home/c109167:
2026-06-08T14:00:23.4512482Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p685703:x:10685703:30000009:RODRIGO ARAUJO DE OLIVEIRA:/home/p685703:/bin/bash
2026-06-08T14:00:23.4513171Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c067098:x:10067098:20001097:FABIO AUGUSTO PORTO CARNICELLI:/home/c067098:
2026-06-08T14:00:23.4513776Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c149132:x:10149132:20001097:CLEOMAR BARROS DE OLIVEIRA JUNIOR:/home/c149132:
2026-06-08T14:00:23.4514369Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p976090:x:10976090:20000000:CESAR AUGUSTO DE OLIVEIRA:/home/p976090:
2026-06-08T14:00:23.4514958Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c102385:x:10102385:20001097:PEDRO GUSTAVO DA SILVA GOES:/home/c102385:
2026-06-08T14:00:23.4515652Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c134580:x:10134580:30000009:THIAGO DE OLIVEIRA VALERIANO:/home/c134580:/bin/bash
2026-06-08T14:00:23.4516316Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c064378:x:10064378:20001097:SIMONE ROMAO NAVARRO:/home/c064378:
2026-06-08T14:00:23.4516903Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p563871:x:10563871:20001097:ADRIANA MAFRA FIGUEIREDO:/home/p563871:
2026-06-08T14:00:23.4517482Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p982528:x:10982528:30000065:KARINA MONTEIRO SAMPAIO:/home/p982528:
2026-06-08T14:00:23.4518077Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c059703:x:10059703:30000004:ANISIO RIBEIRO BOUDRAKOFF:/home/c059703:
2026-06-08T14:00:23.4518678Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c095926:x:10095926:30000004:ERIKA PINHEIRO CANDIDO:/home/c095926:
2026-06-08T14:00:23.4519282Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f763549:x:10763549:30000004:LUZIRENE MARIA CORREIA TORRES:/home/f763549:
2026-06-08T14:00:23.4519874Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c097826:x:10097826:20001097:RENATO VIEIRA GALVAO:/home/c097826:/bin/bash
2026-06-08T14:00:23.4520478Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c056378:x:10056378:30000004:PATRICIA MENDES PINHEIRO VALENTE:/home/c056378:
2026-06-08T14:00:23.4521132Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a127217:x:10127217:30000004:LUIZ EDUARDO CAMPOS MARQUES:/home/a127217:
2026-06-08T14:00:23.4521728Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c053988:x:10053988:30000004:GERSON JOSE QUINTILIANO LADEIRA:/home/c053988:
2026-06-08T14:00:23.4522313Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c136125:x:10136125:30000004:VINICIUS MORAES LOURENCO:/home/c136125:
2026-06-08T14:00:23.4523035Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c096521:x:10096521:30000009:DANIELLA RESTREPO FRANCA:/home/c096521:
2026-06-08T14:00:23.4523601Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c112467:x:10112467:30000004:ISABELLA FRANCO RICCI:/home/c112467:
2026-06-08T14:00:23.4524182Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c111494:x:10111494:30000004:MARCELO MINAMI POLLINI:/home/c111494:
2026-06-08T14:00:23.4524764Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c084942:x:10084942:30000004:SANDRO CARVALHO DE ABREU:/home/c084942:
2026-06-08T14:00:23.4525355Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f990950:x:10990950:30000004:FERNANDO JOSE DE PAULA:/home/f990950:
2026-06-08T14:00:23.4525941Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f990949:x:10990949:20001097:FELIPE PAGLIUCO MIRANDA:/home/f990949:
2026-06-08T14:00:23.4526544Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c100385:x:10100385:30000004:CRISTIANE CARMO IGLESIAS MENDES:/home/c100385:
2026-06-08T14:00:23.4527163Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c140939:x:10140939:20001097:Leandro Augusto Silva de Abreu:/home/c140939:/bin/bash
2026-06-08T14:00:23.4527754Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f753124:x:10753124:30000004:MURILO MARTINS DA SILVA:/home/f753124:
2026-06-08T14:00:23.4528351Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f695110:x:10695110:30000004:CARLA MIRIAM CALDEIRA SANTIAGO:/home/f695110:
2026-06-08T14:00:23.4528946Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f989737:x:10989737:30000004:RENATA FIGUEIREDO PEREIRA:/home/f989737:/bin/bash
2026-06-08T14:00:23.4529734Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c149127:x:10149127:30000004:ADOLFO GABRIEL CAPPARELLI DE OLIVEIRA:/home/c149127:
2026-06-08T14:00:23.4530349Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c151348:x:10151348:30000004:MARCIO CORREIA DE OLIVEIRA:/home/c151348:/bin/bash
2026-06-08T14:00:23.4530966Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p593155:x:10593155:30000009:GRACILDO PEREIRA FIGUEIREDO:/home/p593155:/bin/bash
2026-06-08T14:00:23.4531582Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c083604:x:10083604:30000004:ANDREA DE OLIVEIRA MAGALHAES:/home/c083604:
2026-06-08T14:00:23.4532164Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f542167:x:10542167:30000004:GUILHERME JOSE GOMES SILVA:/home/f542167:
2026-06-08T14:00:23.4532833Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f554627:x:10554627:30000004:GIORDANO AMARAL DO NASCIMENTO:/home/f554627:
2026-06-08T14:00:23.4533421Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c084816:x:10084816:30000004:LUIS HENRIQUE DONDA:/home/c084816:
2026-06-08T14:00:23.4534013Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p720512:x:10720512:20000000:MEIRE COSTA DE SA DOS SANTOS:/home/p720512:/bin/bash
2026-06-08T14:00:23.4534602Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c150722:x:10150722:20001097:SIDNEY JOSE DE FARIA:/home/c150722:
2026-06-08T14:00:23.4535275Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c109000:x:10109000:30000004:GUILHERME MEDEIROS VIEIRA:/home/c109000:
2026-06-08T14:00:23.4535860Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p972013:x:10972013:20000000:WAGNER NUNES LIMA:/home/972013:
2026-06-08T14:00:23.4536449Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f624829:x:10624829:30000004:GILMAR FERNANDES RIBEIRO:/home/f624829:/bin/bash
2026-06-08T14:00:23.4537036Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c149134:x:10149134:30000004:FRANCIS MARTINS VIEIRA:/home/c149134:
2026-06-08T14:00:23.4537618Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c053059:x:10053059:30000004:HENRIQUE DOS SANTOS VIANA:/home/c053059:
2026-06-08T14:00:23.4538204Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f997468:x:10997468:30000004:WILKER NORONHA VITOR:/home/f997468:
2026-06-08T14:00:23.4538800Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c096915:x:10096915:30000004:ALYNE MACHADO FILGUEIRAS:/home/c096915:
2026-06-08T14:00:23.4539389Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c150335:x:10150335:30000009:ROGERIO RODRIGUES AMORIM:/home/c150335:/bin/bash
2026-06-08T14:00:23.4539993Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c078154:x:10078154:30000004:CATIA REGINA DELAVALD THOMAS:/home/c078154:
2026-06-08T14:00:23.4540603Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c149138:x:10149138:30000004:LEANDRO COSTA DE OLIVEIRA:/home/c149138:/bin/bash
2026-06-08T14:00:23.4541193Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f595054:x:10595054:30000004:MARCOS FERREIRA TAVARES:/home/f595054:
2026-06-08T14:00:23.4541972Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spadspb3:x:20003851:20001089:Conta de bind para ser inserida nos Macs utilizados como agente de build da Esteira DevOps - WO0000053643326_REQ000048937997:/home/spadspb3:/bin/ksh
2026-06-08T14:00:23.4543076Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f560167:x:10560167:30000004:ELOY OLIVEIRA GUIMARAES:/home/f560167:
2026-06-08T14:00:23.4543849Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): C091714:x:10091714:20000000:MARCELO MINEY MENDES:/home/c091714:/bin/bash
2026-06-08T14:00:23.4544464Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a150336:x:10150336:30000004:MAYRON RAIMUNDO DOS REIS COSTA:/home/a150336:/bin/bash
2026-06-08T14:00:23.4545067Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f591826:x:10591826:30000004:LEOPOLDO LUIZ DE ARAUJO COSTA:/home/f591826:
2026-06-08T14:00:23.4545637Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c096273:x:10096273:20001097:DANIEL VARGAS:/home/c096273:/bin/bash
2026-06-08T14:00:23.4546222Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p527488:x:10527488:30000009:JOESLEY SOARES SILVA:/home/p527488:/bin/bash
2026-06-08T14:00:23.4546809Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c073400:x:10073400:30000004:RAFAEL ALVES DE MEDEIROS:/home/c073400:
2026-06-08T14:00:23.4547399Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c079563:x:10079563:20001050:VALDIR DE SOUZA JUNIOR:/home/c079563:
2026-06-08T14:00:23.4547991Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c149124:x:10149124:20001041:DARIO MALTA MONTEIRO:/home/c149124:/bin/bash
2026-06-08T14:00:23.4548659Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c072627:x:10072627:30000009:ALESSANDRO LASMAR MOURAO:/home/c072627:/bin/bash
2026-06-08T14:00:23.4554959Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c076474:x:10076474:30000004:HELLEN APARECIDA SOUTO DOMINGOS:/home/c076474:
2026-06-08T14:00:23.4555567Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c034756:x:10034756:30000004:ROSANE DEGANELI DE BRITO:/home/c034756:
2026-06-08T14:00:23.4556169Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c129423:x:10129423:30000004:FERNANDO CANDIA:/home/c129423:
2026-06-08T14:00:23.4556745Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c055715:x:10055715:30000004:LUIZ HENRIQUE SAMEJIMA:/home/c055715:
2026-06-08T14:00:23.4557335Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c079249:x:10079249:30000004:ANTONIO FELIPE SANTIAGO FILHO:/home/c079249:
2026-06-08T14:00:23.4557913Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f657822:x:10657822:30000004:FRANCISCO GOMES MOTA:/home/f657822:
2026-06-08T14:00:23.4558489Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c151543:x:10151543:20001097:RAFAEL CHAGAS BARBOSA:/home/c151543:
2026-06-08T14:00:23.4559115Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a110508:x:10110508:20000000:Evangelista Batista de Oliveira - CEDESBR:/home/a110508:/bin/bash
2026-06-08T14:00:23.4559731Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c105474:x:10105474:20001048:REGIVALDO ALMEIDA NOBRE:/home/c105474:
2026-06-08T14:00:23.4560312Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c046083:x:10046083:30000004:VITOR BRANCO CAMPOS:/home/c046083:
2026-06-08T14:00:23.4560905Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a112141:x:10112141:20000000:Rafael Augusto Soares:/home/a112141:/bin/bash
2026-06-08T14:00:23.4561496Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c085055:x:10085055:20000000:URIAMA CASTANHA RODRIGUES:/home/c085055:
2026-06-08T14:00:23.4562068Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f934907:x:10934907:20001097:BRUNO BERNARDO FONSECA:/home/f934907:/bin/bash
2026-06-08T14:00:23.4562873Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c122875:x:10122875:20001097:AISLAN DA SILVA GONCALVES:/home/c122875:/bin/bash
2026-06-08T14:00:23.4563460Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f957907:x:10957907:20001097:EDSON PROKOT:/home/f957907:/bin/bash
2026-06-08T14:00:23.4564042Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f695184:x:10695184:30000004:ANGELO FRANCISCO DA SILVA:/home/f695184:
2026-06-08T14:00:23.4564631Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f791181:x:10791181:30000004:FABRICIO FERNANDES FREITAS:/home/f791181:
2026-06-08T14:00:23.4565218Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p998782:x:10998782:30000009:ADRIANO ALBERNAZ GOLEBIOWSKI:/home/a998782:/bin/bash
2026-06-08T14:00:23.4565823Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p733493:x:10733493:30000009:VICTOR VENTURA DE SOUZA:/home/p733493:
2026-06-08T14:00:23.4566411Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c054414:x:10054414:20001097:GILBERTO GOMES PINHEIRO:/home/c054414:
2026-06-08T14:00:23.4566996Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c101597:x:10101597:20001097:RAFAEL CARVALHO DE GUSMAO:/home/c101597:/bin/bash
2026-06-08T14:00:23.4567702Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c032291:x:10032291:30000004:PAULO CESAR DE ALMEIDA PIRES:/home/c032291:
2026-06-08T14:00:23.4568383Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f926122:x:10926122:30000004:CATIA MARIA DE CARVALHO E SOUSA:/home/f926122:
2026-06-08T14:00:23.4568972Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p534128:x:10534128:30000009:RAFAEL ANTUNES E SILVA:/home/p534128:
2026-06-08T14:00:23.4569558Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p949443:x:10949443:30000009:MARCOS DE FRANCA SANTOS:/home/p949443:
2026-06-08T14:00:23.4570162Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c076366:x:10076366:20001097:CATICIANE DA SILVA SANTOS:/home/c076366:
2026-06-08T14:00:23.4570750Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p561280:x:10561280:20001041:MARCELO MAINARDI GUIMARAES ARTESE:/home/p561280:
2026-06-08T14:00:23.4571367Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f759705:x:10759705:20001097:FELIPPE LEONAM CREMONA MENDES:/home/f759705:/bin/bash
2026-06-08T14:00:23.4571975Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c074493:x:10074493:20001097:CAROLINA LADEIA DE AGUSTINI:/home/c074493:/bin/bash
2026-06-08T14:00:23.4572652Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c074342:x:10074342:30000004:LUIS RICARDO DA SILVA CONCEICAO:/home/c074342:
2026-06-08T14:00:23.4573263Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c070247:x:10070247:30000009:ANA PAULA DA COSTA PEREIRA:/home/c070247:
2026-06-08T14:00:23.4573848Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c135737:x:10135737:20000000:WILSON REGES CASADO:/home/c135737:/bin/bash
2026-06-08T14:00:23.4574461Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c049204:x:10049204:30000009:MAURICIO DORFMAN:/home/c049204:
2026-06-08T14:00:23.4575025Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c092211:x:10092211:20001097:FELIPE OLIMPIO NETO DE OLIVEIRA:/home/c092211:
2026-06-08T14:00:23.4575616Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c078090:x:10078090:30000004:ALAN DIAMANTINO MATIAS:/home/c078090:
2026-06-08T14:00:23.4576255Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c056497:x:10056497:30000009:DAVISON MARCEL PASQUALINI:/home/c056497:
2026-06-08T14:00:23.4576855Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c110821:x:10110821:30000004:JOSE ANTONIO VABO IBIAPINA:/home/c110821:
2026-06-08T14:00:23.4577446Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p757328:x:10757328:20000000:ANSELMO EDUARDO FELIX:/home/p757328:
2026-06-08T14:00:23.4578036Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f769698:x:10769698:20001097:JEFERSSON MARTINS SANTOS:/home/f769698:
2026-06-08T14:00:23.4578646Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f956340:x:10956340:20001097:ANGELA CRISTINA SOUZA FERREIRA:/home/f956340:/bin/bash
2026-06-08T14:00:23.4579259Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f751158:x:10751158:20001097:ROBSON BARBOSA MACHADO:/home/f751158:bin/bash
2026-06-08T14:00:23.4579864Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f785283:x:10785283:30000004:LUCIANO FERREIRA DA SILVA:/home/f785283:
2026-06-08T14:00:23.4580470Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c082477:x:10082477:20001097:THIAGO NAGAO DE OLIVEIRA:/home/c082477:/bin/bash
2026-06-08T14:00:23.4581054Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f535167:x:10535167:20001097:PATRIK DE OLIVEIRA FRANCA:/home/f535167:
2026-06-08T14:00:23.4581737Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c031077:x:10031077:30000004:EDUARDO AUGUSTO FARIA DE SOUSA:/home/c031077:
2026-06-08T14:00:23.4582351Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a786866:x:10786866:30000004:MAIKE WILLIAN MARTINS DA ROCHA:/home/a786866:/bin/bash
2026-06-08T14:00:23.4583049Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): C085441:x:10085441:20001097:VINICIUS MOTTA DOS SANTOS:/home/c085441:/bin/bash
2026-06-08T14:00:23.4583650Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p595506:x:10595506:30000009:ALFREDO LAURISIO OLIVEIRA MOURAO:/home/p595506:
2026-06-08T14:00:23.4584250Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p545832:x:10545832:30000009:RICARDO LAGO JUNIOR:/home/p545832:
2026-06-08T14:00:23.4584842Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c035825:x:10035825:30000004:JACQUELINE VIGARIO PORTO:/home/c035825:
2026-06-08T14:00:23.4585409Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p671741:x:10671741:30000009:LINDOLFO PEREIRA:/home/p671741:
2026-06-08T14:00:23.4585979Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p915554:x:10915554:30000009:LUCIANO ELIAS DIAS:/home/p915554:
2026-06-08T14:00:23.4586563Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p659783:x:10659783:30000009:ROSELI SUARES DA SILVA SANTOS:/home/p659783:
2026-06-08T14:00:23.4587159Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p543591:x:10543591:30000009:LORI DE DEUS RODRIGUES JORGE:/home/p543591:
2026-06-08T14:00:23.4587777Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c057597:x:10057597:20001109:CESAR ASVOLINSQUE DIOGO DE FARIA:/home/c057597:/bin/bash
2026-06-08T14:00:23.4588375Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p719476:x:10719476:20000000:MARCOS THIAGO BARONE ANDRADE:/home/p719476:
2026-06-08T14:00:23.4588954Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p719129:x:10719129:30000009:RUBENS DA SILVA LIMA:/home/p719129:
2026-06-08T14:00:23.4589593Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p796512:x:10796512:30000009:CARLOS FERNANDO CAVALCANTE:/home/p796512:
2026-06-08T14:00:23.4590194Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p734384:x:10734384:30000009:EVANDRO DOS SANTOS LEMOS:/home/p734384:/bin/bash
2026-06-08T14:00:23.4590778Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c062315:x:10062315:30000004:MARCIO DOINE:/home/c062315:
2026-06-08T14:00:23.4591354Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c077158:x:10077158:30000004:SERGIO FAUSTINO MARREIROS:/home/c077158:
2026-06-08T14:00:23.4591939Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c075247:x:10075247:30000004:EDSON PEREIRA DE BARBARA:/home/c075247:
2026-06-08T14:00:23.4592641Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p796264:x:10796264:20000000:DIOGO DOS SANTOS BISPO:/home/p796264:/bin/bash
2026-06-08T14:00:23.4593247Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p747034:x:10747034:30000009:MOISES DA SILVA LIMA:/home/p747034:
2026-06-08T14:00:23.4593828Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c134528:x:10134528:30000004:DANIEL GOMES MACHADO E SILVA:/home/c134528:
2026-06-08T14:00:23.4594412Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p916569:x:10916569:30000009:Maura dos Santos Araujo:/home/p916569:
2026-06-08T14:00:23.4594987Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p518812:x:10518812:30000009:ROSANA MACHADO:/home/p518812:
2026-06-08T14:00:23.4601142Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c092952:x:10092952:20000000:THIAGO CARVALHO ABREU:/home/c092952:/bin/bash
2026-06-08T14:00:23.4601740Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c134676:x:10134676:20000000:LIVIO CRAVO MARTINS:/home/c134676:/bin/bash
2026-06-08T14:00:23.4602298Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p915456:x:10915456:20001097:MARIO KENITI HIRATA:/home/p915456:
2026-06-08T14:00:23.4602990Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c140515:x:10140515:30000004:CHRISTIAN TAVEIRA ESTEVEZ:/home/c140515:
2026-06-08T14:00:23.4603572Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c149717:x:10149717:30000004:DANIEL ELIAS ARAUJO:/home/c149717:
2026-06-08T14:00:23.4604140Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c149157:x:10149157:30000004:ELVIS IRINEU ELIAS:/home/c149157:
2026-06-08T14:00:23.4604722Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c149126:x:10149126:30000004:WANDERSON FREITAS DALTRO:/home/c149126:
2026-06-08T14:00:23.4605313Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c151847:x:10151847:30000004:MAURICIO DE CARVALHO PENNAFORT:/home/c151847:
2026-06-08T14:00:23.4605929Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c087025:x:10087025:30000009:ROMULO LUIZ FERREIRA SOUZA:/home/c087025:/bin/bash
2026-06-08T14:00:23.4606532Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c095087:x:10095087:30000004:NILSON DONIZETI MASSARENTI JUNIOR:/home/c095087:
2026-06-08T14:00:23.4607133Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c125513:x:10125513:30000004:ANDRE LUIZ CORGO FERREIRA LIMA:/home/c125513:
2026-06-08T14:00:23.4607735Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a736514:x:10736514:30000004:RAFAEL ALVES LIMA:/home/a736514:/bin/bash
2026-06-08T14:00:23.4608332Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a590589:x:10590589:30000004:CLEDSON MOREIRA PARENTE:/home/p590589:/bin/bash
2026-06-08T14:00:23.4609057Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c151811:x:10151811:30000004:THIAGO TEIXEIRA SALES:/home/c151811:
2026-06-08T14:00:23.4609651Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f554654:x:10554654:30000004:BRUNO PIMENTA GUIMARAES:/home/f554654:
2026-06-08T14:00:23.4610241Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c068752:x:10068752:20001097:MARCUS VINICIUS MACIEL MOREIRA:/home/c068752:
2026-06-08T14:00:23.4610834Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f743063:x:10743063:30000004:JENIFFER DA NOBREGA BANDEIRA:/home/f743063:
2026-06-08T14:00:23.4611445Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a134169:x:10134169:30000001:DANIEL CRISTOFE FELIX DA SILVA:/home/a134169:/bin/bash
2026-06-08T14:00:23.4612134Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.4612867Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c070813:x:10070813:30000004:LEANDRO BATISTA LEGORA:/home/c070813:
2026-06-08T14:00:23.4613457Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c105515:x:10105515:30000009:FABIANA MIYUKI OSAWA:/home/c105515:
2026-06-08T14:00:23.4614106Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c037600:x:10037600:30000009:NILDEU RAIMUNDO SANTOS:/home/c037600:
2026-06-08T14:00:23.4614820Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c059313:x:10059313:30000004:FERNANDO TRINDADE MARTINS:/home/c059313:
2026-06-08T14:00:23.4615432Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f512068:x:10512068:30000004:ANDRE DE ARAUJO SARAIVA:/home/f512068:
2026-06-08T14:00:23.4616035Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c075239:x:10075239:30000004:JOSIANE ROSA DA SILVA PATRICIO:/home/c075239:
2026-06-08T14:00:23.4616630Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c116962:x:10116962:20001097:SIMONE MARIA SIMOES D OLIVEIRA:/home/c116962:
2026-06-08T14:00:23.4617239Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c075118:x:10075118:30000009:MAIARA DE SOUZA GUIZI FREITAS:/home/c075118:/bin/bash
2026-06-08T14:00:23.4617839Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a620841:x:10620841:30000004:WELLINGTON SANTOS CANDIDO:/home/a620841:/bin/bash
2026-06-08T14:00:23.4618466Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): sansbp02:x:20003858:20001077:Usuario do Ansible - CECMI:/home/sansbp02:/bin/bash
2026-06-08T14:00:23.4619052Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p766065:x:10766065:30000009:ORLANDO JOSE PEREZ:/home/p766065:
2026-06-08T14:00:23.4619650Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c148704:x:10148704:20000960:SANDY DA SILVA SANTOS:/home/c148704:/bin/bash
2026-06-08T14:00:23.4620243Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c091491:x:10091491:30000004:JOANA ROCHA FIGUEIREDO COUTO:/home/c091491:
2026-06-08T14:00:23.4620847Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c053993:x:10053993:30000004:ROSEMEIRE DA CONSOLACAO OLIVEIRA PENA:/home/c053993:
2026-06-08T14:00:23.4621403Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c099747:x:10099747:30000004:RAUL LUIZ GONCALVES DA SILVA:/home/c099747:
2026-06-08T14:00:23.4621974Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c079422:x:10079422:30000004:ELTON DOS SANTOS:/home/c079422:
2026-06-08T14:00:23.4622700Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p603695:x:10603695:30000004:PEDRO HENRIQUE SILVA CONDE AGUIAR:/home/p603695:/bin/bash
2026-06-08T14:00:23.4623316Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p564029:x:10564029:30000009:EDSON HIROSHI MATSUASHI:/home/p564029:
2026-06-08T14:00:23.4623898Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f731421:x:10731421:30000004:ROBERTO ROSA ALVES:/home/f731421:
2026-06-08T14:00:23.4624473Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f758670:x:10758670:30000004:RAISSA GOMES REBOLHO:/home/f758670:
2026-06-08T14:00:23.4625072Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a089638:x:10089638:20000000:MARCO AURELIO MENDES DA SILVA:/home/a089638:/bin/bash
2026-06-08T14:00:23.4625737Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c128605:x:10128605:30000004:FERNANDA MESQUITA SOARES:/home/c128605:
2026-06-08T14:00:23.4626333Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p774032:x:10774032:30000009:JOAO CARLOS BELMIRO DE OLIVEIRA:/home/p774032:
2026-06-08T14:00:23.4626969Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p700731:x:10700731:30000009:EMANUEL GESSE ESCOSTEGUY SARDENBERG:/home/p700731:
2026-06-08T14:00:23.4627569Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p541114:x:10541114:30000009:PAULO FIGUEIREDO ROTHOLZ:/home/p541114:
2026-06-08T14:00:23.4628213Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p506516:x:10506516:30000009:HAMILTON JORGE GASPAR DE CARVALHO:/home/p506516:
2026-06-08T14:00:23.4628813Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p910212:x:10910212:30000009:HELIO LUCIO TORRES JUNIOR:/home/p910212:
2026-06-08T14:00:23.4629394Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c069121:x:10069121:30000004:ROBERTO FLAVIO REZENDE:/home/c069121:
2026-06-08T14:00:23.4629978Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c077268:x:10077268:30000004:TAIS SALU REGO DA SILVA:/home/c077268:
2026-06-08T14:00:23.4630560Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c091282:x:10091282:30000004:ANDERSON SILVA MALAFAIA:/home/c091282:
2026-06-08T14:00:23.4631154Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c118996:x:10118996:20000000:EMILIO LUIZ RIBEIRO:/home/c118996:/bin/bash
2026-06-08T14:00:23.4631736Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f702107:x:10702107:30000004:THIAGO BORGES DA MOTTA:/home/f702107:
2026-06-08T14:00:23.4632340Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c077176:x:10077176:30000004:MARCUS VINICIUS VIEIRA DE FARIAS:/home/c077176:
2026-06-08T14:00:23.4633008Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f633156:x:10633156:20001097:JOSIVAM RODRIGUES DE OLIVEIRA:/home/f633156:
2026-06-08T14:00:23.4633724Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f936501:x:10936501:30000004:MARIA DE FATIMA GOMES DE PAIVA ARTHUR:/home/f936501:
2026-06-08T14:00:23.4634338Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f653011:x:10653011:30000004:FILIPE LUIZ E SOUZA:/home/f653011:
2026-06-08T14:00:23.4634932Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c141146:x:10141146:30000004:NUBIA LIRA DOS SANTOS PELEGRINI:/home/c141146:
2026-06-08T14:00:23.4635558Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c152728:x:10152728:30000009:LEONARDO COSTA MAUES PEREIRA:/home/c152728:
2026-06-08T14:00:23.4636209Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c053130:x:10053130:30000004:LEONARDO BRUNO CAHETE BATISTA:/home/c053130:
2026-06-08T14:00:23.4636809Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p669058:x:10669058:30000004:FABIO AUGUSTO NUNES GONCALVES:/home/p669058:
2026-06-08T14:00:23.4637395Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f512424:x:10512424:20001097:KARLISMAR GEORGE VELOZO PEREIRA:/home/f512424:
2026-06-08T14:00:23.4637987Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c122034:x:10122034:30000004:LORENA DE OLIVEIRA ARAUJO:/home/c122034:
2026-06-08T14:00:23.4638588Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c094076:x:10094076:20000000:ELSIO LUIZ ANDRETTA FILHO:/home/c094076:/bin/bash
2026-06-08T14:00:23.4639170Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c108409:x:10108409:30000004:GERIVAN SILVA DE SOUSA:/home/c108409:
2026-06-08T14:00:23.4639753Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c056698:x:10056698:30000004:MANUEL NUNES PEREIRA:/home/c056698:
2026-06-08T14:00:23.4640325Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p593323:x:10593323:30000009:SERGIO DELLA POSSA:/home/p593323:
2026-06-08T14:00:23.4640905Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f754699:x:10754699:30000004:ALAN ZARPELON BERNARDI:/home/f754699:
2026-06-08T14:00:23.4641551Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c101684:x:10101684:20001097:CARLOS ALEXANDRE CHANDRETTI:/home/c101684:/bin/bash
2026-06-08T14:00:23.4642108Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c075480:x:10075480:30000009:CAMILA MELLO PEREIRA:/home/c075480:
2026-06-08T14:00:23.4642762Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c149151:x:10149151:30000004:TATIANA COSTA RODRIGUES:/home/c149151:
2026-06-08T14:00:23.4643358Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c079058:x:10079058:30000004:RAFAEL DE MELLO SANTOS:/home/c079058:
2026-06-08T14:00:23.4643935Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f977616:x:10977616:30000004:RODRIGO CASSIMIRO MARTINS:/home/f977616:
2026-06-08T14:00:23.4644517Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f939927:x:10939927:30000004:IVAN NERY DE CARVALHO:/home/f939927:
2026-06-08T14:00:23.4645087Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f979789:x:10979789:30000004:EDUARDO CORREA:/home/f979789:
2026-06-08T14:00:23.4645671Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c083072:x:10083072:30000004:PAULO ROBERTO MARCHESIN:/home/c083072:
2026-06-08T14:00:23.4646220Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c053063:x:10053063:20000000:TAYNA NERY CORREA LOBO:/home/c053063:/bin/bash
2026-06-08T14:00:23.4646697Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c029179:x:10029179:30000004:BRUNO GONCALVES FILHO:/home/c029179:
2026-06-08T14:00:23.4647178Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a144987:x:10144987:30000004:Henrique Coutinho Guimaraes:/home/c144987:/bin/bash
2026-06-08T14:00:23.4647680Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c148752:x:10148752:20000000:LUCAS STRAUSS HOLSBACH:/home/c148752:/bin/bash
2026-06-08T14:00:23.4648196Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p540406:x:10540406:30000009:IGOR OLIVEIRA NAVA:/home/p540406:
2026-06-08T14:00:23.4648702Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p765294:x:10765294:30000009:ANDRE LUIZ FERREIRA NOBERTO:/home/p765294:
2026-06-08T14:00:23.4649317Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c074106:x:10074106:30000009:SERGIO LUIS RODRIGUES:/home/c074106:
2026-06-08T14:00:23.4649801Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c081836:x:10081836:30000009:CASSIO ARRUDA MAGALHAES:/home/c081836:
2026-06-08T14:00:23.4650321Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c151810:x:10151810:20000000:WENDELL RODRIGUES PORTELA:/home/c151810:/bin/bash
2026-06-08T14:00:23.4650928Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c151555:x:10151555:20000000:DEBORA RODRIGUES REBELLO:/home/c151555:/bin/bash
2026-06-08T14:00:23.4651525Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c150338:x:10150338:30000004:LAENNE SAMARA DE ARAUJO DIAS SANTANA:/home/c150338:
2026-06-08T14:00:23.4652146Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p962400:x:10962400:20000000:FABRICIO VIEIRA CEZARIO:/home/p962400:/bin/bash
2026-06-08T14:00:23.4652846Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f625556:x:10625556:30000004:FELIPE COTTA NASCIMENTO:/home/f625556:
2026-06-08T14:00:23.4653402Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a151305:x:10151305:30000001:LUCAS VINICIUS DE ALMEIDA SANTOS:/home/a151305:/bin/bash
2026-06-08T14:00:23.4653916Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f761732:x:10761732:30000004:JULIO CESAR DE MORAIS:/home/f761732:
2026-06-08T14:00:23.4654552Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c135289:x:10135289:30000004:FELIPE DE PAULA SANTOS:/home/c135289:
2026-06-08T14:00:23.4655061Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c153824:x:10153824:20001097:ROMULO ALVES DE SOUZA SILVA:/home/c153824:/bin/bash
2026-06-08T14:00:23.4655678Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c070969:x:10070969:20001097:CARLOS JOSE GONCALVES DOS SANTOS:/home/c070969:
2026-06-08T14:00:23.4656234Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a998782:x:10998782:30000009:ADRIANO ALBERNAZ GOLEBIOWSKI:/home/a998782:/bin/bash
2026-06-08T14:00:23.4656831Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c133632:x:10133632:20000000:ELISANGELA ALVES PERBONI DE SOUZA:/home/c133632:/bin/bash
2026-06-08T14:00:23.4657427Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c152729:x:10152729:30000009:FABIO STUCHI:/home/c152729:
2026-06-08T14:00:23.4657988Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c153034:x:10153034:30000004:MARCIO IZIDORO RIBEIRO:/home/c153034:
2026-06-08T14:00:23.4658587Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p633684:x:10633684:30000009:AFONSO LUIZ RODRIGUES DOS SANTOS:/home/p633684:
2026-06-08T14:00:23.4659200Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c094133:x:10094133:30000004:RODRIGO DE AGUIAR LOPES BILLA:/home/c094133:
2026-06-08T14:00:23.4659796Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c148664:x:10148664:20000000:SANDRA REGINA BENDINI:/home/c148664:/bin/bash
2026-06-08T14:00:23.4660391Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p991234:x:10991234:30000004:RODRIGO DE OLIVEIRA MELO:/home/p991234:
2026-06-08T14:00:23.4660991Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c149154:x:10149154:20001097:ROGERIO ANDERSON PEREIRA DE SOUZA:/home/c149154:/bin/bash
2026-06-08T14:00:23.4661587Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a991234:x:10991234:30000004:RODRIGO DE OLIVEIRA MELO:/home/p991234:
2026-06-08T14:00:23.4662312Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c021729:x:10021729:20001097:ALEXANDRE LIMA HAUER:/home/c021729:/bin/bash
2026-06-08T14:00:23.4663048Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p937112:x:10937112:20000000:GUILHERME MENDES MONTEIRO:/home/p937112:/bin/bash
2026-06-08T14:00:23.4663642Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f552259:x:10552259:20001097:ALESSANDRO RICARDO LIMA:/home/f552259:
2026-06-08T14:00:23.4664225Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p543247:x:10543247:30000004:DEOMAR DE SOUSA COSTA JUNIOR:/home/p543247:
2026-06-08T14:00:23.4664826Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p724040:x:10724040:30000009:ROBISON NEVES DOS ANJOS SILVA:/home/p724040:
2026-06-08T14:00:23.4665406Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f630307:x:10630307:20001097:MARCELO LOPES PORTO:/home/f630307:
2026-06-08T14:00:23.4665981Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c152734:x:10152734:20000000:BRUNO DE OLIVEIRA MENEZES:/home/c152734:
2026-06-08T14:00:23.4666490Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c141601:x:10141601:20001097:JULIANO TSUNEKI ARAUJO HAYATA:/home/c141601:
2026-06-08T14:00:23.4667013Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c075681:x:10075681:30000004:MARCELO MARIANO TEDESCHI:/home/c075681:
2026-06-08T14:00:23.4667605Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f751917:x:10751917:30000004:ANA PAULA NUNES DA SILVA:/home/f751917:
2026-06-08T14:00:23.4668175Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c134277:x:10134277:30000004:ADRIANO BARBOSA TAVARES:/home/c134277:
2026-06-08T14:00:23.4668782Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f566343:x:10566343:20001097:ARIADNA APARECIDA FERREIRA SANTOS:/home/f566343:
2026-06-08T14:00:23.4669390Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f697535:x:10697535:20001097:CAMILLA JORDANA BARBOSA KASSAOKA:/home/f697535:
2026-06-08T14:00:23.4669974Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c137257:x:10137257:30000004:FELIPE CICOTTI GALLESCO:/home/c137257:
2026-06-08T14:00:23.4670568Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c076803:x:10076803:30000004:LEANDRO TADEU DIAS DE OLIVEIRA:/home/c076803:
2026-06-08T14:00:23.4671143Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f579773:x:10579773:20001097:EMERSON RODRIGUES BRUNO:/home/f579773:
2026-06-08T14:00:23.4671736Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c096489:x:10096489:30000004:KAZUMITSU THIAGO BUGS WAKASSA:/home/c096489:
2026-06-08T14:00:23.4672354Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f627986:x:10627986:20001097:HERALDO CARLOS DE SOUSA JUNIOR:/home/f627986:
2026-06-08T14:00:23.4673037Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c148227:x:10148227:30000004:SANDRA DE SOUSA SANTOS:/home/c148227:
2026-06-08T14:00:23.4673615Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c128431:x:10128431:30000004:MARILIA PEREIRA SAMPAIO:/home/c128431:
2026-06-08T14:00:23.4674213Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p921688:x:10921688:30000004:ALLAN SIMAS GONCALVES PENA:/home/p921688:
2026-06-08T14:00:23.4674811Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p945364:x:10945364:20000000:PAULO DAVI ALVES SENA:/home/p945364:/bin/bash
2026-06-08T14:00:23.4675360Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c139550:x:10139550:30000004:THIEGO FERRAZ DA CUNHA:/home/c139550:/bin/bash
2026-06-08T14:00:23.4676062Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f616500:x:10616500:30000004:MARCUS DIMITRI BARBOSA DA COSTA:/home/f616500:
2026-06-08T14:00:23.4676656Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f649898:x:10649898:20001097:DANIEL COSTA GONCALVES:/home/f649898:/bin/bash
2026-06-08T14:00:23.4677226Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c110611:x:10110611:20001097:MAURO YUKIO ARIMA:/home/c110611:
2026-06-08T14:00:23.4677809Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c134624:x:10134624:30000004:MARCOS GONCALVES DE OLIVEIRA:/home/c134624:
2026-06-08T14:00:23.4678403Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a090166:x:10090166:30000001:DANIEL MIONI:/home/a090166:/bin/bash
2026-06-08T14:00:23.4678978Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p912633:x:10912633:30000009:JAIR DE TOLEDO:/home/p912633:
2026-06-08T14:00:23.4679554Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c099243:x:10099243:30000004:PAULA CARDOSO MEDEIROS:/home/c099243:
2026-06-08T14:00:23.4680145Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c139517:x:10139517:20001097:VICTOR NEVES EVANGELISTA:/home/c139517:
2026-06-08T14:00:23.4680719Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c140537:x:10140537:30000004:WESLLEY DOURADO DA SILVA:/home/c140537:
2026-06-08T14:00:23.4681367Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c084057:x:10084057:20000000:MARCIO SANTOS GOMES BASILIO:/home/c084057:
2026-06-08T14:00:23.4681958Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c126117:x:10126117:30000004:WELLINGTON DE FARIAS CAVALCANTE:/home/c126117:
2026-06-08T14:00:23.4682619Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c142929:x:10142929:30000004:CARLOS AUGUSTO SANTANA LEAO:/home/c142929:
2026-06-08T14:00:23.4683183Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c154029:x:10154029:30000004:RENATO DE ALENCAR VIANA:/home/c154029:
2026-06-08T14:00:23.4683680Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c112557:x:10112557:30000004:MIREILLE DELGADO BAPTISTA:/home/c112557:
2026-06-08T14:00:23.4684186Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c076797:x:10076797:20001097:FABIO SOUSA SOARES:/home/c076797:/bin/bash
2026-06-08T14:00:23.4684715Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f635670:x:10635670:20001005:LEANDRO DA SILVEIRA DA SILVA:/home/f635670:/bin/bash
2026-06-08T14:00:23.4685294Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c153865:x:10153865:30000004:ALEX PABLO CAMARGO DOS SANTOS:/home/c153865:
2026-06-08T14:00:23.4685815Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c145249:x:10145249:30000009:VERONICA LEITE CAVALCANTE:/home/c145249:
2026-06-08T14:00:23.4686391Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p911751:x:10911751:30000004:WANDERSON FARIAS FRANCA:/home/p911751:/bin/bash
2026-06-08T14:00:23.4686924Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p636000:x:10636000:20001045:REINALDO HENRIQUE DE LIMA:/home/p636000:
2026-06-08T14:00:23.4687417Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c080700:x:10080700:20001121:DANIEL CORTINHAS:/home/c080700:/bin/bash
2026-06-08T14:00:23.4687973Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c152733:x:10152733:30000004:HENRIETTE NOGUEIRA ALVES MOITA:/home/c152733:
2026-06-08T14:00:23.4688726Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f576170:x:10576170:30000004:ANTONIO CESAR ROSA JUNIOR:/home/f576170:
2026-06-08T14:00:23.4689308Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c105805:x:10105805:20001097:SAMUEL ELIAS XAVIER:/home/c105805:
2026-06-08T14:00:23.4689893Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p795499:x:10795499:30000009:CARLOS ROBERTO GARUTTI:/home/p795499:
2026-06-08T14:00:23.4690500Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c087022:x:10087022:30000004:MARCELO TIAGO MIRANDA TRANQUEIRA:/home/c087022:
2026-06-08T14:00:23.4691102Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f609386:x:10609386:20001097:ALEXANDRE BRUM:/home/f609386:/bin/bash
2026-06-08T14:00:23.4691694Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p738631:x:10738631:30000004:ALYSSON FILIPE:/home/p738631:/bin/bash
2026-06-08T14:00:23.4692304Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p947976:x:10947976:30000004:ARNALDO CARRILHO MENDES JUNIOR:/home/p947976:/bin/bash
2026-06-08T14:00:23.4693008Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c090166:x:10090166:30000001:DANIEL MIONI:/home/c090166:/bin/bash
2026-06-08T14:00:23.4693633Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p785218:x:10785218:30000004:LUCIA MARIA BARBOSA DOS SANTOS SILVA:/home/p785218:/bin/bash
2026-06-08T14:00:23.4694328Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a947976:x:10947976:30000004:ARNALDO CARRILHO MENDES JUNIOR:/home/a947976:/bin/bash
2026-06-08T14:00:23.4694926Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f745275:x:10745275:30000004:JANIO TOME CORREIA ANDRADE:/home/f745275:
2026-06-08T14:00:23.4695519Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f745619:x:10745619:30000004:ELAYNE CRISTINNA FREITAS DE ALBUQUERQUE:/home/f745619:
2026-06-08T14:00:23.4696118Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f901077:x:10901077:30000004:JORGE ALFREDO KAIUCA:/home/f901077:
2026-06-08T14:00:23.4696694Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f900626:x:10900626:30000004:CARLOS EDUARDO GASULLA:/home/f900626:
2026-06-08T14:00:23.4697281Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f591950:x:10591950:30000004:NELSON SILVA DOS SANTOS:/home/f591950:
2026-06-08T14:00:23.4697863Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f618638:x:10618638:30000004:ROBERTO DE SOUZA RODRIGUES:/home/f618638:
2026-06-08T14:00:23.4698470Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f566876:x:10566876:30000004:FRANCISCO ROSENVELTY SANTOS BRASIL:/home/f566876:
2026-06-08T14:00:23.4699067Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p542284:x:10542284:30000004:MARCO ANTONIO DE SOUZA:/home/p542284:
2026-06-08T14:00:23.4699812Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f601891:x:10601891:20001097:RAFAEL BERNARDES PEREIRA:/home/f601891:/bin/bash
2026-06-08T14:00:23.4700413Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p792250:x:10792250:30000004:JULIANO JOSE CECILIO:/home/p792250:/bin/bash
2026-06-08T14:00:23.4701046Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c088298:x:10088298:30000004:KARINE TAVEIRA DA COSTA VASCONCELOS:/home/c088298:/bin/bash
2026-06-08T14:00:23.4701655Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p580789:x:10580789:20000000:ADRIANO DA SILVA SANTOS:/home/p580789:
2026-06-08T14:00:23.4702304Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c084790:x:10084790:20001097:FRANCISCO SANTANA DOS SANTOS:/home/c084790:
2026-06-08T14:00:23.4702985Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f939026:x:10939026:30000004:RAFAEL KOVHAUTT SALVADOR:/home/f939026:/bin/bash
2026-06-08T14:00:23.4703600Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f669264:x:10669264:30000004:BRUNA THAIS DE ALMEIDA SILVA:/home/f669264:/bin/bash
2026-06-08T14:00:23.4704222Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f771564:x:10771564:30000004:MAIRTON SILVIANO RODRIGUES LEAL:/home/f771564:/bin/bash
2026-06-08T14:00:23.4704837Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p736514:x:10736514:30000004:RAFAEL ALVES LIMA:/home/p736514:/bin/bash
2026-06-08T14:00:23.4705437Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c095744:x:10095744:30000004:ANDRE FREIRE DE OLIVEIRA:/home/c095744:/bin/bash
2026-06-08T14:00:23.4706027Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p744064:x:10744064:30000004:WELLINGTON DA SILVA:/home/p744064:/bin/bash
2026-06-08T14:00:23.4706709Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c073404:x:10073404:30000004:VITOR MENDES GUEDES:/home/c073404:/bin/bash
2026-06-08T14:00:23.4707305Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a149121:x:10149121:30000004:VALDIR ALVES CARDOSO:/home/a149121:/bin/bash
2026-06-08T14:00:23.4707963Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p790662:x:10790662:30000009:ANDERSON SILVA COSTA:/home/p790662:/bin/bash
2026-06-08T14:00:23.4708478Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c149152:x:10149152:20001097:TERCIO OLIVEIRA MISAEL:/home/c149152:/bin/bash
2026-06-08T14:00:23.4709081Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c096233:x:10096233:30000004:JOSE RICARDO DOS SANTOS:/home/c096233:/bin/bash
2026-06-08T14:00:23.4709687Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f723102:x:10723102:30000004:RODRIGO VASCONCELOS DA ROCHA:/home/f723102:/bin/bash
2026-06-08T14:00:23.4710287Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c148666:x:10148666:30000004:Luciano Lopes Sobral:/home/c148666:
2026-06-08T14:00:23.4710880Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c134535:x:10134535:30000004:SERGIO DE OLIVEIRA E SILVA:/home/c134535:/bin/bash
2026-06-08T14:00:23.4711490Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p904768:x:10904768:30000009:JOSE HUMBERTO GOMES DE MATOS:/home/p904768:/bin/bash
2026-06-08T14:00:23.4712095Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c066286:x:10066286:30000004:FABIO RENATO TANAKA:/home/c066286:/bin/bash
2026-06-08T14:00:23.4712791Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p703956:x:10703956:30000009:PAULO RENATO SILVA GOVEIA:/home/p703956:/bin/bash
2026-06-08T14:00:23.4713441Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p794500:x:10794500:20000000:Nicky Anderson Melo da Silva - Prestador:/home/p794500:/bin/bash
2026-06-08T14:00:23.4713981Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c149141:x:10149141:20001097:CAYO PRADO DE CARVALHO QUEIROZ:/home/c149141:/bin/bash
2026-06-08T14:00:23.4714503Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f629844:x:10629844:30000004:RAFAEL SAMPAIO DA SILVA:/home/f629844:/bin/bash
2026-06-08T14:00:23.4715080Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p984222:x:10984222:30000004:EVANDRO ALVES DE SOUZA:/home/p984222:/bin/bash
2026-06-08T14:00:23.4715748Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p940372:x:10940372:30000004:Weydson Velasco de Azevedo:/home/p940372:/bin/bash
2026-06-08T14:00:23.4716354Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f952993:x:10952993:30000004:YOUSSEF CALLED YOUSSEF:/home/f952993:/bin/bash
2026-06-08T14:00:23.4716947Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f635943:x:10635943:20001097:SUZANA MIDORY TAKAO:/home/f635943:
2026-06-08T14:00:23.4719079Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f933154:x:10933154:20001097:SERGIO ANTONIO DE SOUZA LIMA:/home/f933154:
2026-06-08T14:00:23.4719968Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f661691:x:10661691:30000004:JEFFERSON CARLOS LUCINDO DE SOUSA:/home/f661691:/bin/bash
2026-06-08T14:00:23.4720729Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c083196:x:10083196:30000004:LEONARDO JOSE BRASIL DE CARVALHO:/home/c083196:/bin/bash
2026-06-08T14:00:23.4721491Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f581364:x:10581364:20001097:BEATRIZ SAUER DA CONCEICAO DE LIMA:/home/f581364:/bin/bash
2026-06-08T14:00:23.4722087Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a567498:x:10567498:30000004:JAILSON MARTINS ALVES:/home/a567498:/bin/bash
2026-06-08T14:00:23.4723831Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a940372:x:10940372:30000004:Weydson Velasco de Azevedo:/home/a940372:/bin/bash
2026-06-08T14:00:23.4725093Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f713491:x:10713491:30000004:CAIC SOUZA PASSOS:/home/f713491:/bin/bash
2026-06-08T14:00:23.4725583Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f602264:x:10602264:20001097:CLAUDIA FLORISBELA FREITAS:/home/f602264:/bin/bash
2026-06-08T14:00:23.4726129Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f613451:x:10613451:30000004:LUANA DE ALMEIDA DA COSTA CARNEIRO:/home/f613451:/bin/bash
2026-06-08T14:00:23.4726500Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f694781:x:10694781:30000004:FABRICIA DA SILVA:/home/f694781:/bin/bash
2026-06-08T14:00:23.4726941Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f521842:x:10521842:30000004:MIQUEIAS DE MELO SILVA:/home/f521842:/bin/bash
2026-06-08T14:00:23.4727287Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a093795:x:10093795:30000001:ITAMAR LUCAS:/home/a093795:
2026-06-08T14:00:23.4727943Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f528725:x:10528725:30000004:RAFAEL DE CARVALHO OLIVEIRA:/home/f528725:/bin/bash
2026-06-08T14:00:23.4728863Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f592597:x:10592597:20001097:CAIO PAIVA POUSA SOARES:/home/f592597:/bin/bash
2026-06-08T14:00:23.4730235Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a061211:x:10061211:30000004:Ferdinando Mesquita e Silva:/home/a061211:/bin/bash
2026-06-08T14:00:23.4730727Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c050046:x:10050046:30000004:JOMAR ALEXANDRE DAMATO DE CARVALHO:/home/c050046:/bin/bash
2026-06-08T14:00:23.4731213Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c094488:x:10094488:20000000:FABIO WLADIMIR SANTOS PAIVA:/home/c094488:/bin/bash
2026-06-08T14:00:23.4731909Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f705583:x:10705583:20001097:PEDRO GABRIEL DE OLIVEIRA CARRANO:/home/f705583:
2026-06-08T14:00:23.4732691Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f576616:x:10576616:30000004:LUCAS DE SANTANA RODRIGUES:/home/f576616:/bin/bash
2026-06-08T14:00:23.4733311Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p913024:x:10913024:20000000:ANA CLAUDIA A BORGES:/home/p913024:/bin/bash
2026-06-08T14:00:23.4734018Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c103882:x:10103882:30000004:CARLOS ALMIRO GONCALVES DA SILVA:/home/c103882:/bin/bash
2026-06-08T14:00:23.4735781Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c124261:x:10124261:20001097:WELINTON DA SILVA OLIVEIRA:/home/c124261:/bin/bash
2026-06-08T14:00:23.4736163Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p505287:x:10505287:30000009:SIDNEY LEMES DE ALMEIDA:/home/p505287:/bin/bash
2026-06-08T14:00:23.4736526Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c071909:x:10071909:20000000:JOAO PEDRO ALVES FERREIRA:/home/c071909:/bin/bash
2026-06-08T14:00:23.4737219Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c136658:x:10136658:30000004:ALESSANDRO SILVA DE SOUSA:/home/c136658:/bin/bash
2026-06-08T14:00:23.4737773Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c149145:x:10149145:30000004:ELDER DA ROCHA FABRI:/home/c149145:/bin/bash
2026-06-08T14:00:23.4738534Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p767463:x:10767463:30000207:Antonio Carlos Martins Lopes:/home/p767463:/bin/bash
2026-06-08T14:00:23.4739689Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f635883:x:10635883:20001097:ELISSON BOMFIM DO AMARAL FILHO:/home/f635883:/bin/bash
2026-06-08T14:00:23.4740144Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f628978:x:10628978:30000004:TAYNA SANTANA DE ABREU:/home/f628978:/bin/bash
2026-06-08T14:00:23.4740603Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c077219:x:10077219:30000004:CAROLINA MIYASHIRO:/home/c077219:/bin/bash
2026-06-08T14:00:23.4741573Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f653082:x:10653082:30000004:RODRIGO FERREIRA LIMA:/home/f653082:/bin/bash
2026-06-08T14:00:23.4741958Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a151556:x:10151556:20000000:Rodrigo Gomes Alves de Oliveira:/home/a151556:/bin/bash
2026-06-08T14:00:23.4742409Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f551607:x:10551607:30000004:FELIPE PEREIRA COLONETTI:/home/f551607:/bin/bash
2026-06-08T14:00:23.4744247Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a151562:x:10151562:20000000:Roberto Pereira Matos:/home/a151562:/bin/bash
2026-06-08T14:00:23.4744639Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c139553:x:10139553:30000009:VICTOR HUGO BRAVO ESCOBAR:/home/c139553:/bin/bash
2026-06-08T14:00:23.4745008Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c054096:x:10054096:30000009:CLAUDIO MARCOS DA SILVA:/home/c054096:/bin/bash
2026-06-08T14:00:23.4745365Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c121277:x:10121277:20000000:HELMUT MECHIS NAKASHIMA:/home/c121277:/bin/bash
2026-06-08T14:00:23.4745775Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c154004:x:10154004:30000004:ALEXSANDRO CASIMIRO:/home/c154004:/bin/bash
2026-06-08T14:00:23.4746271Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c154006:x:10154006:20001045:JOSE LUIZ QUATIS:/home/c154006:/bin/bash
2026-06-08T14:00:23.4747009Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c066528:x:10066528:30000004:GISLAINE APARECIDA ROJAS:/home/c066528:/bin/bash
2026-06-08T14:00:23.4748129Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f650080:x:10650080:30000004:NATHALIA HIRTH:/home/f650080:/bin/bash
2026-06-08T14:00:23.4748715Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c094713:x:10094713:20001097:CISELY SIMOES DIAS:/home/c094713:/bin/bash
2026-06-08T14:00:23.4749277Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f684833:x:10684833:30000004:RENATO ALMEIDA BRITO:/home/f684833:/bin/bash
2026-06-08T14:00:23.4749809Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p685430:x:10685430:30000004:THIAGO MOUTA BATISTA BARBOSA:/home/p685430:/bin/bash
2026-06-08T14:00:23.4750379Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a623670:x:10623670:30000004:JEHUEL ALVES CASTRO SANTOS:/home/a623670:/bin/bash
2026-06-08T14:00:23.4750929Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f649923:x:10649923:30000004:PATRICK AVILA FERREIRA DA COSTA:/home/f649923:/bin/bash
2026-06-08T14:00:23.4751476Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f668065:x:10668065:30000004:LUCAS DE ALMEIDA NATAL:/home/f668065:/bin/bash
2026-06-08T14:00:23.4752006Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c139349:x:10139349:30000009:THAIAN SOARES DE MORAES:/home/c139349:
2026-06-08T14:00:23.4752895Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c105897:x:10105897:30000009:EDSON TEIXEIRA DE CARVALHO JUNIOR:/home/c105897:
2026-06-08T14:00:23.4753693Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c066388:x:10066388:30000009:ROBSON RODRIGUES DOS SANTOS:/home/c066388:
2026-06-08T14:00:23.4754362Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c074557:x:10074557:20001097:MARCELO ROBERTO DE MIRANDA MESQUITA:/home/c074557:
2026-06-08T14:00:23.4755137Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f729569:x:10729569:30000004:LUCAS FERREIRA DE AGUIAR:/home/f729569:
2026-06-08T14:00:23.4755650Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f548145:x:10548145:30000004:CIRO MARQUES SILVA:/home/f548145:
2026-06-08T14:00:23.4756155Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c081860:x:10081860:30000004:JOHNNY HESS:/home/c081860:
2026-06-08T14:00:23.4756830Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f941566:x:10941566:20001097:DAIANE CRISTINA FERREIRA DA SILVA:/home/f941566:/bin/bash
2026-06-08T14:00:23.4757388Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): F552874:x:10552874:20001097:GUTEMBERG LUCAS VIEIRA LIMA:/home/F552874:/bin/bash
2026-06-08T14:00:23.4757915Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c090397:x:10090397:30000004:THIAGO ANDRE SILVA DE SOUZA:/home/c090397:
2026-06-08T14:00:23.4758589Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p644161:x:10644161:30000009:GLAUCIA MARIA ALEXANDRE DE NORONHA:/home/p644161:/bin/bash
2026-06-08T14:00:23.4759553Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c069122:x:10069122:30000004:LUIZA GONCALVES DE PAULA:/home/c069122:
2026-06-08T14:00:23.4760072Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c084421:x:10084421:30000009:REGINA DO CARMO CORREA:/home/c084421:
2026-06-08T14:00:23.4760612Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f694337:x:10694337:30000004:LUIZ HENRIQUE CORRADINI DE SOUZA:/home/f694337:
2026-06-08T14:00:23.4761219Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f685536:x:10685536:30000004:CHRISTIAN MARTYNES BARRETO VIANNA:/home/f685536:
2026-06-08T14:00:23.4761652Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c148676:x:10148676:30000004:EMERSON LEAL LUZ:/home/c148676:
2026-06-08T14:00:23.4762118Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f783905:x:10783905:30000004:REBECA BARBOSA CABRAL FITZNER:/home/f783905:
2026-06-08T14:00:23.4762680Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f987587:x:10987587:30000004:ROMMEL PRATA DOS SANTOS:/home/f987587:
2026-06-08T14:00:23.4764118Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p646658:x:10646658:30000009:ANDREA DE AGUIAR LIMA:/home/p646658:
2026-06-08T14:00:23.4764464Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p916088:x:10916088:30000009:REGIANE RODRIGUES:/home/p916088:
2026-06-08T14:00:23.4764807Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c149585:x:10149585:30000004:THIAGO URIAS HIRAE:/home/c149585:
2026-06-08T14:00:23.4765200Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f781544:x:10781544:30000004:FABIANO LUIZ COELHO PINTO BEZERRA:/home/f781544:
2026-06-08T14:00:23.4765559Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p519319:x:10519319:20000000:WENDEL CASTRO DE BRITO:/home/p519319:
2026-06-08T14:00:23.4765912Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f567454:x:10567454:30000004:MAURICIO LUIZ COLLA:/home/f567454:
2026-06-08T14:00:23.4766312Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f592919:x:10592919:30000004:EDSON WALTER PERRONI:/home/f592919:
2026-06-08T14:00:23.4766795Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f954925:x:10954925:30000004:RENATO CARBONESI:/home/f954925:
2026-06-08T14:00:23.4767384Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f940833:x:10940833:30000004:MARCOS HENRIQUE FERREIRA:/home/f940833:
2026-06-08T14:00:23.4768287Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f502571:x:10502571:30000004:DANILO DE SOUZA:/home/f502571:
2026-06-08T14:00:23.4769043Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f603581:x:10603581:30000004:DANILO DE LIMA POLASTRI:/home/f603581:
2026-06-08T14:00:23.4769399Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f535116:x:10535116:30000004:LUIZ FILIPE DE CASTRO MEDEIROS:/home/f535116:
2026-06-08T14:00:23.4770565Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f570559:x:10570559:30000004:BRENO DOMINGOS FREITAS:/home/f570559:
2026-06-08T14:00:23.4770960Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p504867:x:10504867:30000009:ANTONIO ZANONI JUNIOR:/home/p504867:
2026-06-08T14:00:23.4771354Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f676816:x:10676816:30000004:BRUNO LENIO RODRIGUES FEIJO DE OLIVEIRA:/home/f676816:
2026-06-08T14:00:23.4771827Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c072830:x:10072830:20001097:CLAUDIONOR CARPINA DE MATOS:/home/c072830:
2026-06-08T14:00:23.4772173Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c040485:x:10040485:30000004:ELDIO TEIXEIRA JUNIOR:/home/c040485:
2026-06-08T14:00:23.4773312Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f676869:x:10676869:30000004:RAQUEL VAZ PADILHA:/home/f676869:
2026-06-08T14:00:23.4773952Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f958065:x:10958065:30000004:MAILA DA SILVA MARTINS:/home/f958065:
2026-06-08T14:00:23.4774561Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f656372:x:10656372:30000004:EDUARDO HENRIQUE NICOLETE AUGUSTO:/home/f656372:
2026-06-08T14:00:23.4775357Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p765064:x:10765064:30000009:MARCELO PIRES DA FONSECA:/home/p765064:
2026-06-08T14:00:23.4775962Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c080489:x:10080489:30000009:ARIANE RAPOSO NOGUEIRA SOARES:/home/c080489:
2026-06-08T14:00:23.4776571Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f781695:x:10781695:20001097:PLINIO LEITE COSTA:/home/f781695:/bin/bash
2026-06-08T14:00:23.4777178Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p926638:x:10926638:30000009:CATYA CRISTINA DUARTE:/home/p926638:
2026-06-08T14:00:23.4777779Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f566867:x:10566867:20001097:DARIO DOUGLAS ALVES ARAUJO:/home/f566867:/bin/bash
2026-06-08T14:00:23.4778385Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c074630:x:10074630:30000004:MARCOS ALEXANDRE CHIU MARIANO DA SILVA:/home/c074630:
2026-06-08T14:00:23.4778978Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c111226:x:10111226:30000004:WENDER SANTOS GUIMARAES:/home/c111226:
2026-06-08T14:00:23.4779574Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f665923:x:10665923:20001097:RHUAN JOSE ABBUD DE ALMEIDA SILVA:/home/f665923:
2026-06-08T14:00:23.4780118Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a148670:x:10148670:30000004:GUILHERME GOMES SOARES DA SILVA:/home/a148670:/bin/bash
2026-06-08T14:00:23.4780790Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a134536:x:10134536:30000004:IVAN ALVES DE OLIVEIRA:/home/a134536:/bin/bash
2026-06-08T14:00:23.4783871Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f592428:x:10592428:30000004:GREGORIO DE ALMEIDA PRADO NETO:/home/f592428:
2026-06-08T14:00:23.4784528Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c110727:x:10110727:20001097:ODANTE RIBEIRO SWERTS JUNIOR:/home/c110727:/bin/bash
2026-06-08T14:00:23.4785132Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c146167:x:10146167:30000004:WINTER SANTANA MIGUEL DA FONSECA:/home/c146167:
2026-06-08T14:00:23.4785726Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c153867:x:10153867:30000009:ALDO RIVELLINO CARLINI:/home/c153867:
2026-06-08T14:00:23.4786319Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f926871:x:10926871:30000004:DIEGO POTIGUARA LOPES:/home/f926871:
2026-06-08T14:00:23.4786900Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c070640:x:10070640:30000004:NUBIA MIRANDA NUNES:/home/c070640:
2026-06-08T14:00:23.4787473Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c152737:x:10152737:30000009:WILLIAM LIMA:/home/c152737:
2026-06-08T14:00:23.4788057Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c073637:x:10073637:30000009:FERNANDO CESAR CAMILO:/home/c073637:
2026-06-08T14:00:23.4788650Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f648679:x:10648679:30000004:MARCELO DE MELLO GONCALVES:/home/f648679:
2026-06-08T14:00:23.4789210Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c101340:x:10101340:30000009:DIOGO DUARTE PINOTTI:/home/c101340:
2026-06-08T14:00:23.4789699Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a105762:x:10105762:30000004:LAWRENCE NAKAMURA:/home/a105762:/bin/bash
2026-06-08T14:00:23.4790314Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f739176:x:10739176:20001097:JOSE VINICIUS LIMA CAMINHA:/home/f739176:/bin/bash
2026-06-08T14:00:23.4790907Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p956571:x:10956571:20000000:SABRINA TOGAWA:/home/p956571:/bin/bash
2026-06-08T14:00:23.4791621Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f918590:x:10918590:30000004:TIAGO PAULINO DE ALMEIDA:/home/f918590:/bin/bash
2026-06-08T14:00:23.4792226Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f764309:x:10764309:20001097:JULIO CEZAR FERREIRA ROCHA:/home/f764309:/bin/bash
2026-06-08T14:00:23.4792927Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f745607:x:10745607:30000004:FELIPE RODRIGUES SILVA:/home/f745607:/bin/bash
2026-06-08T14:00:23.4793570Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f573596:x:10573596:20001097:CHRISTIANO VINICIUS ALVES DE SANTANA BOR:/home/f573596:/bin/bash
2026-06-08T14:00:23.4794170Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f757952:x:10757952:20001097:ALLAN SHINDY NUMATA:/home/f757952:/bin/bash
2026-06-08T14:00:23.4794791Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p694570:x:10694570:30000009:ANDRE LUIZ BORGES DE OLIVEIRA:/home/p694570:/bin/bash
2026-06-08T14:00:23.4795397Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p598360:x:10598360:30000009:FERNANDO SILVA SOARES:/home/p598360:/bin/bash
2026-06-08T14:00:23.4795979Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f946743:x:10946743:30000004:CAROLINA SIQUEIRA:/home/f946743:/bin/bash
2026-06-08T14:00:23.4796689Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c148695:x:10148695:20001097:THALES DE MELO E ARAUJO:/home/c148695:
2026-06-08T14:00:23.4797307Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c143369:x:10143369:30000004:AVIVA FREITAS DOS REIS DE OLIVEIRA:/home/c143369:/bin/bash
2026-06-08T14:00:23.4797910Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f787795:x:10787795:20001097:PABLO LEITE COSTA:/home/f787795:/bin/bash
2026-06-08T14:00:23.4798607Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f708797:x:10708797:20000955:BRUNO VIANA HOTTES:/home/f708797:/bin/bash
2026-06-08T14:00:23.4799210Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c093833:x:10093833:30000004:ADRIANA ONAGA:/home/c093833:/bin/bash
2026-06-08T14:00:23.4799808Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f767406:x:10767406:30000004:DANTE CARVALHO COSTA:/home/f767406:/bin/bash
2026-06-08T14:00:23.4800426Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f908665:x:10908665:30000004:PAULO ROBERTO RODRIGUES PEREIRA:/home/f908665:/bin/bash
2026-06-08T14:00:23.4801054Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f937899:x:10937899:30000004:ROZILENI VIEIRA SOARES FONSECA:/home/f937899:/bin/bash
2026-06-08T14:00:23.4801687Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p973030:x:10973030:30000009:MARIA ELZA ALVES DOS SANTOS:/home/p973030:/bin/bash
2026-06-08T14:00:23.4802301Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c082402:x:10082402:30000004:ANDERSON DIEGO BARBOSA DE LIMA:/home/c082402:/bin/bash
2026-06-08T14:00:23.4802990Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p649714:x:10649714:20000000:ALEXSANDRO MATTOS COUTO:/home/p649714:/bin/bash
2026-06-08T14:00:23.4803594Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c123116:x:10123116:20000000:RODRIGO DO AMARAL MELO:/home/c123116:/bin/bash
2026-06-08T14:00:23.4804212Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p606167:x:10606167:30000009:ELIANE DIAS DA COSTA OLIVEIRA:/home/p606167:/bin/bash
2026-06-08T14:00:23.4804905Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f529681:x:10529681:30000004:IVAN JOEMIR NUNES GONDIM:/home/f529681:/bin/bash
2026-06-08T14:00:23.4805512Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c111312:x:10111312:30000004:ROOSEVELT FREIRE FILHO:/home/c111312:/bin/bash
2026-06-08T14:00:23.4806092Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c074174:x:10074174:30000004:ELMO CRUZ PESSANHA:/home/c074174:/bin/bash
2026-06-08T14:00:23.4806714Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c127473:x:10127473:30000004:MARCO ANTONIO BARREIRAS RIBEIRO DA SILVA:/home/c127473:/bin/bash
2026-06-08T14:00:23.4807330Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c129427:x:10129427:30000004:GILBERTO OLIMPIO DOS SANTOS:/home/c129427:/bin/bash
2026-06-08T14:00:23.4807938Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c065054:x:10065054:30000009:ANDREA RODRIGUES MARQUES:/home/c065054:/bin/bash
2026-06-08T14:00:23.4808531Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p724154:x:10724154:20001097:LEONARDO LEAL ALVES:/home/p724154:
2026-06-08T14:00:23.4809251Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c148741:x:10148741:20001097:STEFANY AYU CHAVES KIMURA:/home/c148741:
2026-06-08T14:00:23.4809881Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f703384:x:10703384:30000004:PAULO SERGIO NUNES LIMA:/home/f703384:/bin/bash
2026-06-08T14:00:23.4812846Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f584909:x:10584909:30000004:IGOR FERNANDES SEIXAS:/home/f584909:/bin/bash
2026-06-08T14:00:23.4813472Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f549072:x:10549072:30000004:FLAVIO MELO DA SILVA:/home/f549072:/bin/bash
2026-06-08T14:00:23.4814068Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c019987:x:10019987:30000004:KAZUO SAKURAI:/home/c019987:/bin/bash
2026-06-08T14:00:23.4814671Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f548879:x:10548879:30000004:RENATO DE VASCONCELLOS COSTA:/home/f548879:/bin/bash
2026-06-08T14:00:23.4815268Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f553565:x:10553565:20001097:REINALDO MIRANDA SANTANA:/home/f553565:
2026-06-08T14:00:23.4815873Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c142851:x:10142851:30000004:CHRISTOPHER JOSE DE SOUZA E SILVA:/home/c142851:/bin/bash
2026-06-08T14:00:23.4816481Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c075673:x:10075673:30000004:LAUDO EIJI OGATA:/home/c075673:/bin/bash
2026-06-08T14:00:23.4817090Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c113752:x:10113752:30000004:WELLINGTON RODRIGUES DE CARVALHO:/home/c113752:/bin/bash
2026-06-08T14:00:23.4817692Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f536789:x:10536789:30000004:ALINE AZEVEDO HUBNER:/home/f536789:/bin/bash
2026-06-08T14:00:23.4818282Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c151874:x:10151874:30000004:WILSON PAZ DA SILVA:/home/c151874:/bin/bash
2026-06-08T14:00:23.4818885Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c138958:x:10138958:30000004:LAERCIO DE LEMOS PEREIRA:/home/c138958:/bin/bash
2026-06-08T14:00:23.4819479Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c060941:x:10060941:30000004:LEDERMAN DE PAULA LIMA:/home/c060941:/bin/bash
2026-06-08T14:00:23.4820076Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p984666:x:10984666:20001097:MARCO ANTONIO MARVILA MESQUITA:/home/p984666:
2026-06-08T14:00:23.4820791Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f998497:x:10998497:30000004:JUNIO DE SOUZA FERNANDES:/home/f998497:/bin/bash
2026-06-08T14:00:23.4821362Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f715636:x:10715636:30000004:SARAH CAVALHEIRO POSTERNAK:/home/f715636:/bin/bash
2026-06-08T14:00:23.4821966Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f791597:x:10791597:30000004:EDUARDO MATAMOROS DE ALMEIDA:/home/f791597:/bin/bash
2026-06-08T14:00:23.4822652Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f702106:x:10702106:30000004:JULIO CESAR RODRIGUES DE SA SANTIAGO:/home/f702106:/bin/bash
2026-06-08T14:00:23.4823292Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c138908:x:10138908:20001097:GABRIEL SAMPAIO DA SILVA CORDEIRO:/home/c138908:
2026-06-08T14:00:23.4823908Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c111476:x:10111476:30000004:CELIA DOS SANTOS RODRIGUES ANDRADE:/home/c111476:/bin/bash
2026-06-08T14:00:23.4824516Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f511896:x:10511896:20001097:PAULO JORGE DOS SANTOS SOARES:/home/f511896:
2026-06-08T14:00:23.4825108Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c101033:x:10101033:30000004:ANDRE VIANA OLIVEIRA:/home/c101033:/bin/bash
2026-06-08T14:00:23.4825715Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f567754:x:10567754:30000004:MARCOS AURELIO FERREIRA:/home/f567754:/bin/bash
2026-06-08T14:00:23.4826430Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p703475:x:10703475:30000004:EDGAR ALVES NASCIMENTO:/home/p703475:/bin/bash
2026-06-08T14:00:23.4827032Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f692416:x:10692416:20000000:ROMULO LIMA FAGUNDES DE MORAIS:/home/f692416:/bin/bash
2026-06-08T14:00:23.4827629Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c077203:x:10077203:30000004:JOSE MILTON SANTOS:/home/c077203:/bin/bash
2026-06-08T14:00:23.4828220Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c076760:x:10076760:30000004:EDVALDO PEREIRA DA SILVA:/home/c076760:/bin/bash
2026-06-08T14:00:23.4828816Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p695114:x:10695114:30000004:CLEITON MACHADO DA SILVA:/home/p695114:/bin/bash
2026-06-08T14:00:23.4829421Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p976713:x:10976713:30000004:FRANCISCO VIEIRA GONCALVES JUNIOR:/home/p976713:/bin/bash
2026-06-08T14:00:23.4830021Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p785469:x:10785469:30000004:ZAQUEU ALMEIDA NOBRE:/home/p785469:/bin/bash
2026-06-08T14:00:23.4830638Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f729349:x:10729349:30000004:GLEIDIMAR LUIZ DE DEUS JUNIOR:/home/f729349:/bin/bash
2026-06-08T14:00:23.4831245Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f687265:x:10687265:30000004:FREDERICO RODRIGUES VALE:/home/f687265:/bin/bash
2026-06-08T14:00:23.4855259Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f779273:x:10779273:20001097:FABRICIO MONTINEGRO E COSTA:/home/f779273:/bin/bash
2026-06-08T14:00:23.4855948Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f665924:x:10665924:30000004:ELVIS RICARDO DA SILVA GONCALVES:/home/f665924:/bin/bash
2026-06-08T14:00:23.4856606Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c088691:x:10088691:30000004:ALESSANDRA RIBEIRO OLIVEIRA CORREA:/home/c088691:/bin/bash
2026-06-08T14:00:23.4857215Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p903662:x:10903662:30000004:ROBERTO FERREIRA SOARES:/home/p903662:/bin/bash
2026-06-08T14:00:23.4860849Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f506702:x:10506702:30000004:DANIELLY LEMOS DE OLIVEIRA FRANCA:/home/f506702:/bin/bash
2026-06-08T14:00:23.4861690Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p534105:x:10534105:30000004:PAULO ASSUMPCAO LEITE JUNIOR:/home/p534105:/bin/bash
2026-06-08T14:00:23.4862268Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p551680:x:10551680:30000004:MARCIO DOS SANTOS BENCID:/home/p551680:/bin/bash
2026-06-08T14:00:23.4863374Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p951017:x:10951017:30000004:ALAN CORTES LEIROZ:/home/p951017:/bin/bash
2026-06-08T14:00:23.4863994Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p903171:x:10903171:30000004:AYRAM NAMI FERNANDES:/home/p903171:/bin/bash
2026-06-08T14:00:23.4864629Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c151558:x:10151558:30000004:ROSANE PERPETUO SOCORRO PINHEIRO SMITH:/home/c151558:/bin/bash
2026-06-08T14:00:23.4865170Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p991288:x:10991288:30000004:ERSON DINIZ SIMOES:/home/p991288:/bin/bash
2026-06-08T14:00:23.4865727Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p910209:x:10910209:30000004:JOSE RICARDO PASSOS BENTO:/home/p910209:/bin/bash
2026-06-08T14:00:23.4866380Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c111489:x:10111489:30000004:JOHNATA WILLIAM ZORZI:/home/c111489:/bin/bash
2026-06-08T14:00:23.4866748Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c087320:x:10087320:20001050:ROGERIO PEDARNIG STAPAIT:/home/c087320:/bin/bash
2026-06-08T14:00:23.4867098Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c137050:x:10137050:20001097:DANILO SOUSA DE OLIVEIRA:/home/c137050:
2026-06-08T14:00:23.4867449Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c115057:x:10115057:30000004:LIGIA BARBOZA REIS:/home/c115057:/bin/bash
2026-06-08T14:00:23.4867798Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c118860:x:10118860:30000009:THIAGO OLIVEIRA DA SILVA:/home/c118860:/bin/bash
2026-06-08T14:00:23.4868154Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c079463:x:10079463:30000004:PAULO ROCHA FERREIRA:/home/c079463:/bin/bash
2026-06-08T14:00:23.4868508Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): C125061:x:10125061:30000009:WELLINGTON DOS SANTOS RIBEIRO:/home/c125061:
2026-06-08T14:00:23.4872647Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f507222:x:10507222:30000004:JEFFERSON CARLOS MARTINS:/home/f507222:/bin/bash
2026-06-08T14:00:23.4873239Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c149496:x:10149496:30000004:SERGIO ZANETONI JUNIOR:/home/c149496:/bin/bash
2026-06-08T14:00:23.4873769Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f628883:x:10628883:20001097:CRISTIANO SAUL:/home/f628883:/bin/bash
2026-06-08T14:00:23.4874449Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c144986:x:10144986:20001097:MARCOS VINICIUS MENDONCA DO NASCIMENTO:/home/c144986:
2026-06-08T14:00:23.4875240Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f527920:x:10527920:30000004:GUILHERME CARVALHO BRANDAO VIANA:/home/f527920:/bin/bash
2026-06-08T14:00:23.4876966Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c148703:x:10148703:30000004:AUGUSTO VINICIUS GOMES DE AVELAR:/home/c148703:/bin/bash
2026-06-08T14:00:23.4877744Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f587369:x:10587369:30000004:HEYDER ALBERTO VALENTE MOORE:/home/f587369:/bin/bash
2026-06-08T14:00:23.4879970Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f633169:x:10633169:30000004:ALEKSIAN GUTENBERG FERREIRA JUNIOR:/home/f633169:/bin/bash
2026-06-08T14:00:23.4881389Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f586737:x:10586737:30000004:MATHEUS GOMES QUEIROZ:/home/f586737:/bin/bash
2026-06-08T14:00:23.4882067Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f618561:x:10618561:30000004:TIAGO GARCIA SOUTO:/home/f618561:/bin/bash
2026-06-08T14:00:23.4883951Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c152736:x:10152736:30000004:LUIS ALBERTO DOS REIS:/home/c152736:/bin/bash
2026-06-08T14:00:23.4884706Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c095880:x:10095880:20000000:DIEGO NOLASCO SOUZA PEREIRA:/home/c095880:/bin/bash
2026-06-08T14:00:23.4886234Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f566944:x:10566944:20001097:ELI DE ASSIS JUNIOR:/home/f566944:/bin/bash
2026-06-08T14:00:23.4887179Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p707358:x:10707358:30000004:JOSE ROBERTO CARVALHO DO NASCIMENTO:/home/p707358:/bin/bash
2026-06-08T14:00:23.4889019Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f727260:x:10727260:20001097:TIAGO CHAVES PINHEIRO GAVAZZA:/home/f727260:
2026-06-08T14:00:23.4889904Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c095070:x:10095070:30000004:ROBSON RICARDO DE MACEDO:/home/c095070:/bin/bash
2026-06-08T14:00:23.4890877Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c081515:x:10081515:30000004:FLAVIO RICARDO ROSA:/home/c081515:/bin/bash
2026-06-08T14:00:23.4891378Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p784811:x:10784811:30000004:ANDRE LUIZ REIS MARQUES:/home/p784811:/bin/bash
2026-06-08T14:00:23.4891830Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p793226:x:10793226:30000004:IMRE KISS JUNIOR:/home/p793226:/bin/bash
2026-06-08T14:00:23.4892193Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p949686:x:10949686:30000004:ELAINE DO VALE FARIA GARCIA:/home/p949686:/bin/bash
2026-06-08T14:00:23.4893112Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c110528:x:10110528:30000009:LAURA CRISTINA MACHADO COELHO:/home/c110528:/bin/bash
2026-06-08T14:00:23.4894616Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c129856:x:10129856:30000004:ALINE HOLANDA DOS SANTOS GONCALVES:/home/c129856:/bin/bash
2026-06-08T14:00:23.4895254Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f746849:x:10746849:20001097:ANTONIO CARLOS DOS SANTOS JUNIOR:/home/f746849:/bin/bash
2026-06-08T14:00:23.4895868Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f747852:x:10747852:20001097:PEDRO FELIX NUNES DE JESUS LEITE:/home/f747852:
2026-06-08T14:00:23.4897422Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c081885:x:10081885:30000004:MIRIAN MARCIA MATEUS:/home/c081885:/bin/bash
2026-06-08T14:00:23.4898066Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f637059:x:10637059:30000004:JEAN CARLOS PENAS:/home/f637059:/bin/bash
2026-06-08T14:00:23.4898663Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f547100:x:10547100:20001097:JOSE RODOLFO DA SILVA:/home/f547100:/bin/bash
2026-06-08T14:00:23.4899837Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p763455:x:10763455:30000004:LUIZ GUSTAVO RODRIGUES DE OLIVEIRA:/home/p763455:/bin/bash
2026-06-08T14:00:23.4900631Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c070927:x:10070927:20000000:RODRIGO PAVAO DE OLIVEIRA:/home/c070927:/bin/bash
2026-06-08T14:00:23.4902074Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f734159:x:10734159:30000004:GUSTAVO SANTOS DE OLIVEIRA:/home/f734159:/bin/bash
2026-06-08T14:00:23.4902785Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c134002:x:10134002:20001097:LEANDRO CORDEIRO NEVES CAVALCANTI:/home/c134002:/bin/bash
2026-06-08T14:00:23.4903411Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f661515:x:10661515:30000004:MARILIA COSTA DOS SANTOS:/home/f661515:/bin/bash
2026-06-08T14:00:23.4904010Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f631990:x:10631990:30000004:PEDRO HENRIQUE DE ARAUJO DA SILVA:/home/f631990:/bin/bash
2026-06-08T14:00:23.4904670Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a090290:x:10090290:30000004:Luiz Eduardo Barbosa de Oliveira - REDEABR111 - Analista:/home/c090290:/bin/bash
2026-06-08T14:00:23.4905306Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f760321:x:10760321:30000004:MARIO HENRIQUE RODRIGUES LOPES:/home/f760321:/bin/bash
2026-06-08T14:00:23.4905859Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f781979:x:10781979:30000004:SAMUEL VELTER TELES:/home/f781979:/bin/bash
2026-06-08T14:00:23.4906358Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p635388:x:10635388:30000004:JORGE MILIS DE ALMEIDA JUNIOR:/home/p635388:/bin/bash
2026-06-08T14:00:23.4906896Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f903429:x:10903429:30000004:LEANDRO OLIVEIRA MESQUITA:/home/f903429:/bin/bash
2026-06-08T14:00:23.4907500Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a065717:x:10065717:30000004:Jaqueline Teodoro Bastos:/home/a065717:/bin/bash
2026-06-08T14:00:23.4908078Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f734027:x:10734027:30000004:FLAVIO SOUSA SANTANA:/home/f734027:/bin/bash
2026-06-08T14:00:23.4908653Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f939575:x:10939575:30000004:HELDER SILVA DE FARIA:/home/f939575:/bin/bash
2026-06-08T14:00:23.4909257Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f722309:x:10722309:20001097:WANBASTER SOARES RODRIGUES FARIAS:/home/f722309:/bin/bash
2026-06-08T14:00:23.4909874Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f985786:x:10985786:30000004:GLAUBER GONCALVES DA SILVA SANTOS:/home/f985786:/bin/bash
2026-06-08T14:00:23.4910479Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c091456:x:10091456:30000009:ADRIANA VICENTE MODA DE CARVALHO:/home/c091456:/bin/bash
2026-06-08T14:00:23.4911060Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a520093:x:10520093:30000009:RUI HITOSHI ASSAMI:/home/p520093:
2026-06-08T14:00:23.4911620Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c056857:x:10056857:30000004:JORGE TIJUNELIS:/home/c056857:/bin/bash
2026-06-08T14:00:23.4912210Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f914771:x:10914771:30000004:MAICK ARAUJO DE SOUZA:/home/f914771:/bin/bash
2026-06-08T14:00:23.4912963Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p704575:x:10704575:20001097:LUCAS FRANCO TAVARES DA SILVA:/home/p704575:
2026-06-08T14:00:23.4913551Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c064628:x:10064628:20001097:DANIELE ESPIRITO SANTO FERREIRA:/home/c064628:
2026-06-08T14:00:23.4914187Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f703947:x:10703947:30000004:ALBERTO MOREIRA LOPES:/home/f703947:/bin/bash
2026-06-08T14:00:23.4914551Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f981250:x:10981250:30000004:ELIAS PAULO ROSA:/home/f981250:/bin/bash
2026-06-08T14:00:23.4915123Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f902853:x:10902853:30000004:ELAINE DA CONCEICAO LOURENCO:/home/f902853:/bin/bash
2026-06-08T14:00:23.4915607Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f998501:x:10998501:30000004:JEAN CARLOS FERNANDES GODINHO:/home/f998501:/bin/bash
2026-06-08T14:00:23.4916061Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f611040:x:10611040:30000004:CARLOS ALBERTO BARROS MADEIRA FILHO:/home/f611040:/bin/bash
2026-06-08T14:00:23.4916652Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f711853:x:10711853:30000004:RONDINELLI DE OLIVEIRA SILVA:/home/f711853:/bin/bash
2026-06-08T14:00:23.4917195Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p764887:x:10764887:30000009:ROGER CARVALHO SOARES:/home/p764887:/bin/bash
2026-06-08T14:00:23.4917734Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c084752:x:10084752:30000004:THIAGO DAS NEVES CARDOSO:/home/c084752:/bin/bash
2026-06-08T14:00:23.4918279Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c057390:x:10057390:30000004:ROGERIO ALVES COUTINHO:/home/c057390:/bin/bash
2026-06-08T14:00:23.4918940Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p765002:x:10765002:30000009:EMERSON JOSE FERREIRA PINTO:/home/p765002:/bin/bash
2026-06-08T14:00:23.4919421Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f631189:x:10631189:30000004:NIVALDO JOSE DA SILVA JUNIOR:/home/f631189:/bin/bash
2026-06-08T14:00:23.4919777Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c051009:x:10051009:30000004:SUZANA DELGADO:/home/c051009:/bin/bash
2026-06-08T14:00:23.4920127Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f690149:x:10690149:30000004:RONDINELLI FORTALESA BORGES:/home/f690149:/bin/bash
2026-06-08T14:00:23.4920481Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f723226:x:10723226:30000004:ILSON FOGACA DE SOUZA:/home/f723226:/bin/bash
2026-06-08T14:00:23.4920833Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c064576:x:10064576:20001049:BRUNO CARLO ABREU CORINGA:/home/c064576:/bin/bash
2026-06-08T14:00:23.4921873Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f759712:x:10759712:30000004:BRENO GERALDO DALL OLMO:/home/f759712:/bin/bash
2026-06-08T14:00:23.4922489Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c090699:x:10090699:30000004:MARCIO MAGNO CHAVES:/home/c090699:/bin/bash
2026-06-08T14:00:23.4960317Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p938514:x:10938514:30000004:CLAUDIO MONTEIRO LIMA:/home/p938514:/bin/bash
2026-06-08T14:00:23.4960864Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c153233:x:10153233:30000009:DANILO DE ARAUJO DA SILVA:/home/c153233:/bin/bash
2026-06-08T14:00:23.4975479Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p985338:x:10985338:30000222:Andre Lima dos Santos - REROPBR32 - Analista:/home/p985338:/bin/bash
2026-06-08T14:00:23.4976019Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p519880:x:10519880:30000009:ALEXANDRE MAGNO CARDEAL BATISTA:/home/p519880:/bin/bash
2026-06-08T14:00:23.4976447Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p637089:x:10637089:30000009:WILLIAM HORT BRIONE:/home/p637089:/bin/bash
2026-06-08T14:00:23.4977110Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c040241:x:10040241:30000004:JEFERSON DE AMORIM COELHO:/home/c040241:/bin/bash
2026-06-08T14:00:23.4977465Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p412947:x:10412947:30000004:LAERTE GOMES FILHO:/home/p412947:/bin/bash
2026-06-08T14:00:23.4977837Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f536544:x:10536544:30000004:NICOLAS ANDREAS MARIA JOO E SILVA:/home/f536544:/bin/bash
2026-06-08T14:00:23.4978201Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p761481:x:10761481:30000009:Fabio Branco da Silva:/home/p761481:/bin/bash
2026-06-08T14:00:23.4978560Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f538736:x:10538736:30000004:FELLIPE ESSER MACIEL:/home/f538736:/bin/bash
2026-06-08T14:00:23.4978929Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p992900:x:10992900:20000000:Rodrigo de Azevedo Gutierrez:/home/p992900:/bin/bash
2026-06-08T14:00:23.4979340Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f536745:x:10536745:30000004:LEONARDO SILVEIRA DE FRANCA:/home/f536745:/bin/bash
2026-06-08T14:00:23.4979689Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f538729:x:10538729:30000004:AGILSON DE CAMARGO:/home/f538729:/bin/bash
2026-06-08T14:00:23.4980046Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f572199:x:10572199:30000004:ALEXANDRE RODRIGUES DOS SANTOS:/home/f572199:/bin/bash
2026-06-08T14:00:23.4980471Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c105989:x:10105989:30000004:DANIEL BOMFIM:/home/c105989:/bin/bash
2026-06-08T14:00:23.4980814Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p734588:x:10734588:20000000:ANDERSON DE OLIVEIRA HAUA:/home/p734588:
2026-06-08T14:00:23.4981203Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p516931:x:10516931:30000009:KLEYTON ANSELMO RODRIGUES:/home/p516931:/bin/bash
2026-06-08T14:00:23.4981710Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spcsnpb1:x:20003881:20001165:Conta de servico para o cofre de senhas SICSN:/home/spcsnpb1:/bin/bash
2026-06-08T14:00:23.4982144Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f575640:x:10575640:30000004:MARCELA PAOLA ALDEA VEGA:/home/f575640:/bin/bash
2026-06-08T14:00:23.4982489Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c152731:x:10152731:30000009:RICARDO ZAIDAN ROSSI:/home/c152731:/bin/bash
2026-06-08T14:00:23.4982940Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c132185:x:10132185:30000004:MAICON FERREIRA TEIXEIRA:/home/c132185:/bin/bash
2026-06-08T14:00:23.4983290Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f533454:x:10533454:30000004:THIAGO COELHO RODRIGUES:/home/f533454:/bin/bash
2026-06-08T14:00:23.4983646Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p627728:x:10627728:30000004:KENNED FRAZAO GOMES DE OLIVEIRA:/home/p627728:/bin/bash
2026-06-08T14:00:23.4983998Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p520093:x:10520093:30000009:RUI HITOSHI ASSAMI:/home/p520093:/bin/bash
2026-06-08T14:00:23.4984357Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f703646:x:10703646:20001097:RODRIGO NUNES PESSOA DE ALBUQUERQUE:/home/f703646:/bin/bash
2026-06-08T14:00:23.4984711Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c113925:x:10113925:20001097:LEANDRO DE MENEZES MARTINS:/home/c113925:/bin/bash
2026-06-08T14:00:23.4985140Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c105513:x:10105513:30000004:ANDRE MARCELO DE LOURDES:/home/c105513:/bin/bash
2026-06-08T14:00:23.4985503Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spcsnpb1:x:20003881:20001165:Conta de servico para o cofre de senhas SICSN:/home/spcsnpb1:/bin/bash
2026-06-08T14:00:23.4985865Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f742394:x:10742394:20001097:SANTIL KEFERSON DE SANTANA LEAL SANTOS:/home/f742394:
2026-06-08T14:00:23.4986204Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f590912:x:10590912:20001080:DANILLO BEZERRA DE MELLO:/home/f590912:
2026-06-08T14:00:23.4986543Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f535613:x:10535613:20001080:EDERSON ROBERTO DE SOUZA:/home/f535613:
2026-06-08T14:00:23.4986885Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f687177:x:10687177:20001080:FRANCISCO EDIMOR DA SILVA JUNIOR:/home/f687177:
2026-06-08T14:00:23.4987227Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c074096:x:10074096:30000004:DANIELLE PEPE FERREIRA:/home/c074096:/bin/bash
2026-06-08T14:00:23.4987582Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f791953:x:10791953:30000004:VINICIUS ANDRE FERREIRA COUTINHO:/home/f791953:/bin/bash
2026-06-08T14:00:23.4987935Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f526226:x:10526226:30000004:MARCELO SANTOS FOURNIER:/home/f526226:/bin/bash
2026-06-08T14:00:23.4988354Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c095065:x:10095065:30000004:JAQUELINE GUIMARAES YAMAMOTO:/home/c095065:/bin/bash
2026-06-08T14:00:23.4988945Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ssetrd01:x:20003887:20001097:Conta de servico para acessar e realizar deploy AZURE - REQ60098811:/home/ssetrd01:/bin/bash
2026-06-08T14:00:23.4989430Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): ssetrt01:x:20003888:20001097:Conta de servico para acessar e realizar deploy AZURE - REQ60098824:/home/ssetrt01:/bin/bash
2026-06-08T14:00:23.4989801Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f765175:x:10765175:30000004:CHARLES ZDEPSKI:/home/f765175:/bin/bash
2026-06-08T14:00:23.4990146Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c142585:x:10142585:20001097:Leonel Petena Furlanetto:/home/c142585:/bin/bash
2026-06-08T14:00:23.4990505Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f668650:x:10668650:30000004:RAMON MESSIAS CORREA DE ANDRADE:/home/f668650:/bin/bash
2026-06-08T14:00:23.4990854Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p908873:x:10908873:20001097:GILSON FILGUEIRA DA SILVA:/home/p908873:
2026-06-08T14:00:23.4991207Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c063082:x:10063082:30000009:LUIZ MAGNO DE MENEZES COSSICH:/home/c063082:/bin/bash
2026-06-08T14:00:23.4991558Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p910898:x:10910898:30000009:GILMAR DE OLIVEIRA CAMPOS:/home/p910898:/bin/bash
2026-06-08T14:00:23.4991903Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f720657:x:10720657:30000004:ARTUR FERREIRA OLIVEIRA:/home/f720657:/bin/bash
2026-06-08T14:00:23.4992240Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f721494:x:10721494:30000004:ALBERTO BONA JUNIOR:/home/f721494:/bin/bash
2026-06-08T14:00:23.4992689Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f750724:x:10750724:30000004:GUSTAVO BERNARDES ADRIAO DE SOUZA:/home/f750724:/bin/bash
2026-06-08T14:00:23.4993051Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p949013:x:10949013:30000004:TATIANE DE OLIVEIRA SILVA:/home/p949013:/bin/bash
2026-06-08T14:00:23.4993439Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p922425:x:10922425:20000000:WANDERSON VINHAL MACEDO:/home/p922425:/bin/bash
2026-06-08T14:00:23.4993830Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f904691:x:10904691:30000004:CESAR ALVES VECCHIO:/home/f904691:/bin/bash
2026-06-08T14:00:23.4994181Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c120853:x:10120853:30000004:PEDRO PAULO DE ALENCAR FILGUEIRAS:/home/c120853:/bin/bash
2026-06-08T14:00:23.4994546Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f780378:x:10780378:30000004:LEANDRO HENRIQUE DOS SANTOS PEREIRA:/home/f780378:/bin/bash
2026-06-08T14:00:23.4994902Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p751570:x:10751570:30000004:FELIX GARCIA NEIVA MOLINA:/home/p751570:/bin/bash
2026-06-08T14:00:23.4995306Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a534171:x:10534171:30000004:LUCIANO MARTINS PESSANHA:/home/a534171:/bin/bash
2026-06-08T14:00:23.4995671Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a777448:x:10777448:30000004:JOEDSON DE SOUZA NOGUEIRA:/home/a777448:/bin/bash
2026-06-08T14:00:23.4996015Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a765006:x:10765006:30000004:KELSON JOSE DUARTE:/home/a765006:/bin/bash
2026-06-08T14:00:23.4996401Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a519666:x:10519666:30000004:MANOEL MESSIAS IZIDRO TRAJANO:/home/a519666:/bin/bash
2026-06-08T14:00:23.4996739Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c150286:x:10150286:20001097:MARCOS VINICIUS VIEIRA:/home/c150286:
2026-06-08T14:00:23.4997074Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c110954:x:10110954:30000004:BRUNO KAPPEL JORDAO:/home/c110954:/bin/bash
2026-06-08T14:00:23.4997407Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f624586:x:10624586:30000004:TELMO GOMES CARDEAL:/home/f624586:/bin/bash
2026-06-08T14:00:23.4997754Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f963981:x:10963981:30000004:LUIZ CARLOS FONTES DOS SANTOS:/home/f963981:/bin/bash
2026-06-08T14:00:23.4998100Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a727826:x:10727826:30000004:MILADY DIAS DE OLIVEIRA:/home/a727826:/bin/bash
2026-06-08T14:00:23.4998456Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a947841:x:10947841:30000004:SILAS PEREIRA DA COSTA NETO:/home/a947841:/bin/bash
2026-06-08T14:00:23.4998800Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a689732:x:10689732:30000004:JAIRO MATEUS ALVES:/home/a689732:/bin/bash
2026-06-08T14:00:23.4999208Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f995353:x:10995353:30000004:ANA KARLA DA CRUZ PAIVA:/home/f995353:/bin/bash
2026-06-08T14:00:23.4999558Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p558249:x:10558249:20000000:OLIVAL CRISTIANO DA SILVA:/home/p558249:/bin/bash
2026-06-08T14:00:23.4999911Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p765544:x:10765544:30000009:Davidson Abrantes de Oliveira:/home/p765544:/bin/bash
2026-06-08T14:00:23.5000260Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p796037:x:10796037:20000000:JONAS ALMEIDA TERCEIRO:/home/p796037:/bin/bash
2026-06-08T14:00:23.5000605Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a939695:x:10939695:30000004:EDSON MESQUITA FIGUEIREDO:/home/a939695:/bin/bash
2026-06-08T14:00:23.5000988Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f971320:x:10971320:30000004:RONY DE LUCCA OLIVEIRA:/home/f971320:/bin/bash
2026-06-08T14:00:23.5001327Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c069924:x:10069924:30000004:EDUARDO JAKEL:/home/c069924:/bin/bash
2026-06-08T14:00:23.5001678Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p793543:x:10793543:30000009:IARA DE PONTES MENDES DOS SANTOS:/home/p793543:/bin/bash
2026-06-08T14:00:23.5002029Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c144461:x:10144461:30000004:GABRIEL MATOS DOS SANTOS:/home/c144461:/bin/bash
2026-06-08T14:00:23.5002459Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c148746:x:10148746:30000004:HELCIO ARAUJO RIBEIRO:/home/c148746:/bin/bash
2026-06-08T14:00:23.5002958Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c078608:x:10078608:30000004:FRANKLIN ALECASSANDRO DIAS SANTOS:/home/c078608:/bin/bash
2026-06-08T14:00:23.5003313Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p715774:x:10715774:30000004:Rebert Tomaz de Aquino:/home/p715774:/bin/bash
2026-06-08T14:00:23.5003663Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f988156:x:10988156:30000004:MARCELO DE CARVALHO FILHO:/home/f988156:/bin/bash
2026-06-08T14:00:23.5004003Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c094501:x:10094501:30000004:JOELI DOS SANTOS:/home/c094501:/bin/bash
2026-06-08T14:00:23.5004389Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p933424:x:10933424:20001004:CRISTIANE ALVES DE AQUINO:/home/p933424:/bin/bash
2026-06-08T14:00:23.5004738Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c078969:x:10078969:20001097:RAMON MARQUES COUTINHO:/home/c078969:/bin/bash
2026-06-08T14:00:23.5005080Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f692708:x:10692708:30000004:MAURICIO BRINSTEIN:/home/f692708:/bin/bash
2026-06-08T14:00:23.5005421Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c133665:x:10133665:30000004:WILSON JUNIOR ALVES:/home/c133665:/bin/bash
2026-06-08T14:00:23.5005776Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f992348:x:10992348:30000004:LIDIANE DE CASTRO FERREIRA RIBEIRO:/home/f992348:/bin/bash
2026-06-08T14:00:23.5006131Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f516797:x:10516797:30000004:EDUARDO VIDEIRA PAULO:/home/f516797:/bin/bash
2026-06-08T14:00:23.5006464Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c137155:x:10137155:20001097:JACY FERREIRA:/home/c137155:/bin/bash
2026-06-08T14:00:23.5006807Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p681773:x:10681773:30000004:ELCIMAR DIAS DE FREITAS:/home/p681773:/bin/bash
2026-06-08T14:00:23.5007160Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a533367:x:10533367:30000004:ALEXANDRE DE FREITAS QUEIROZ:/home/a533367:/bin/bash
2026-06-08T14:00:23.5007507Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f593268:x:10593268:30000004:ALEX CESAR SOUZA:/home/f593268:/bin/bash
2026-06-08T14:00:23.5007859Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c149136:x:10149136:20001097:Geraldo Candido Fernandes:/home/c149136:/bin/bash
2026-06-08T14:00:23.5008218Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c053039:x:10053039:30000004:ROBERTO AUGUSTO ALVES JUNIOR:/home/c053039:/bin/bash
2026-06-08T14:00:23.5008571Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p930398:x:10930398:30000009:Fabio Luis de Brito:/home/p930398:/bin/bash
2026-06-08T14:00:23.5008959Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c141258:x:10141258:30000004:THALES MENDES MILANESE:/home/c141258:/bin/bash
2026-06-08T14:00:23.5009439Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f663469:x:10663469:30000004:ANDRE SOUZA LOPES DA SILVA:/home/f663469:/bin/bash
2026-06-08T14:00:23.5009786Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f942576:x:10942576:30000004:IRENY DA SILVA PEREIRA:/home/f942576:/bin/bash
2026-06-08T14:00:23.5010140Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f650978:x:10650978:30000004:CHARLES MARQUES RODRIGUES:/home/f650978:/bin/bash
2026-06-08T14:00:23.5010626Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f942587:x:10942587:30000004:ERICO RIBEIRO NOBRE:/home/f942587:/bin/bash
2026-06-08T14:00:23.5011133Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c134269:x:10134269:30000004:PAOLA REZENDE CARDOZO:/home/c134269:/bin/bash
2026-06-08T14:00:23.5011689Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p512737:x:10512737:20001097:CLAUDEMIR CAMPOS:/home/p512737:
2026-06-08T14:00:23.5012201Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f674992:x:10674992:30000004:ALIFE ALBERTO DE SOUZA PEREIRA:/home/f674992:/bin/bash
2026-06-08T14:00:23.5012812Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c095703:x:10095703:30000004:ROBERTO CAMPOS DOS SANTOS:/home/c095703:/bin/bash
2026-06-08T14:00:23.5013428Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f674827:x:10674827:30000004:JOAO MARCOS ALMEIDA SILVA DE JESUS:/home/f674827:/bin/bash
2026-06-08T14:00:23.5013877Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c112307:x:10112307:30000009:ALEXANDRE YUKISHIGUE HIGA:/home/c112307:/bin/bash
2026-06-08T14:00:23.5014231Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c068847:x:10068847:30000004:DAVI FACUNDO DE SA NOBREGA:/home/c068847:/bin/bash
2026-06-08T14:00:23.5014578Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c089284:x:10089284:30000004:FERNANDO MINORU KOGA:/home/c089284:/bin/bash
2026-06-08T14:00:23.5014919Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c080168:x:10080168:30000004:ANDRE DE MOURA MARTINS:/home/c080168:/bin/bash
2026-06-08T14:00:23.5015280Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p737066:x:10737066:30000009:EDUARDO GONCALVES DA SILVA SANTOS:/home/p737066:/bin/bash
2026-06-08T14:00:23.5015629Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c141195:x:10141195:30000009:DIVINO PEREIRA DE SOUZA:/home/c141195:/bin/bash
2026-06-08T14:00:23.5015980Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f727267:x:10727267:30000004:VIVIANE HELENA PEREIRA SILVA:/home/f727267:/bin/bash
2026-06-08T14:00:23.5016329Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f725569:x:10725569:30000004:ELISANDRO SILVA DE OLIVEIRA:/home/f725569:/bin/bash
2026-06-08T14:00:23.5016672Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f663251:x:10663251:30000004:LUCAS ANDRE LEMOS PEREIRA:/home/f663251:/bin/bash
2026-06-08T14:00:23.5017015Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f725560:x:10725560:30000004:RODRIGO VALENTINI:/home/f725560:/bin/bash
2026-06-08T14:00:23.5017370Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c100701:x:10100701:30000004:LUCIANA PAGANELA OSORIO MARQUES:/home/c100701:/bin/bash
2026-06-08T14:00:23.5017715Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p985520:x:10985520:30000009:ALLAN BASTOS ALMEIDA:/home/p985520:/bin/bash
2026-06-08T14:00:23.5018109Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a919724:x:10919724:30000004:THIAGO JORGE ARAUJO:/home/a919724:/bin/bash
2026-06-08T14:00:23.5018463Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p639366:x:10639366:20000000:EMANOEL CARLOS MOREIRA CORREA:/home/p639366:/bin/bash
2026-06-08T14:00:23.5018817Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f524340:x:10524340:30000004:FRANCISCO VITOR ALVES NUNES:/home/f524340:/bin/bash
2026-06-08T14:00:23.5019178Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f728689:x:10728689:30000004:VICTOR VASCONCELOS DE MEDEIROS MOURA:/home/f728689:/bin/bash
2026-06-08T14:00:23.5019785Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f756981:x:10756981:30000004:MARCOS WIENANDTS:/home/f756981:/bin/bash
2026-06-08T14:00:23.5020264Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f569772:x:10569772:30000004:EDMUNDO HENRQUE MAJEAU:/home/f569772:/bin/bash
2026-06-08T14:00:23.5020627Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a153267:x:10153267:30000001:ANDREIA FEITOSA DA FONSECA:/home/a153267:/bin/bash
2026-06-08T14:00:23.5020975Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c050611:x:10050611:20001097:ALEXIS COELHO PINHEIRO:/home/c050611:/bin/bash
2026-06-08T14:00:23.5021362Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c081900:x:10081900:20001097:ALEXANDRE AUGUSTO DE PINHO SILVA:/home/c081900:
2026-06-08T14:00:23.5021713Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f759408:x:10759408:30000004:GRACIELLE GONCALVES SILVA:/home/f759408:/bin/bash
2026-06-08T14:00:23.5022057Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c138870:x:10138870:30000009:DANILO GOMES ROSA:/home/c138870:/bin/bash
2026-06-08T14:00:23.5022417Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c053037:x:10053037:30000004:MARCOS PAULO JANUARIO DE SOUSA:/home/c053037:/bin/bash
2026-06-08T14:00:23.5022840Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p752104:x:10752104:30000009:RICARDO BRIGAGAO LIMA:/home/p752104:/bin/bash
2026-06-08T14:00:23.5023193Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c105429:x:10105429:20000000:ANA RAFFAELA PINHO CAPELAO:/home/c105429:/bin/bash
2026-06-08T14:00:23.5023547Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c123571:x:10123571:30000004:DEBORA CRISTINA MONTEIRO PAGANINI:/home/c123571:/bin/bash
2026-06-08T14:00:23.5023904Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c094494:x:10094494:30000004:SOLANGE PEREIRA BARBOSA DA SILVA:/home/c094494:/bin/bash
2026-06-08T14:00:23.5024262Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c128321:x:10128321:30000004:RICARDO GONCALVES BERTO:/home/c128321:/bin/bash
2026-06-08T14:00:23.5024608Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f998520:x:10998520:20001013:ANTONIO JOSE DE ARAUJO PIRES:/home/f998520:
2026-06-08T14:00:23.5024967Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c152735:x:10152735:30000004:JOSE RICARDO DE LIMA AZEVEDO:/home/c152735:/bin/bash
2026-06-08T14:00:23.5025317Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f723039:x:10723039:30000004:ANDRE LUIZ SIMOES GOMES:/home/f723039:/bin/bash
2026-06-08T14:00:23.5025662Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c076331:x:10076331:30000004:ADRIANA OLIVEIRA DA SILVA:/home/c076331:/bin/bash
2026-06-08T14:00:23.5026163Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f719393:x:10719393:30000004:ANDRE VITORINO:/home/f719393:/bin/bash
2026-06-08T14:00:23.5026533Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c153858:x:10153858:30000004:EDINILSON DAFONTE:/home/c153858:/bin/bash
2026-06-08T14:00:23.5026882Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p768728:x:10768728:20001097:PATRICIA VOURAKIS BARBOSA BRAGA:/home/p768728:
2026-06-08T14:00:23.5027239Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f941387:x:10941387:30000004:NATALIA BANDEIRA DE SOUZA E SILVA:/home/f941387:/bin/bash
2026-06-08T14:00:23.5027602Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f761152:x:10761152:20001097:ANTONIO AILTON NASCIMENTO FERREIRA:/home/f761152:/bin/bash
2026-06-08T14:00:23.5028000Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f749212:x:10749212:30000004:VITOR CASECA MARINHO:/home/f749212:/bin/bash
2026-06-08T14:00:23.5028354Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c087681:x:10087681:20001097:LUCIANO FRANCIOLE CEDRAZ DE MATOS:/home/c087681:/bin/bash
2026-06-08T14:00:23.5028705Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c125486:x:10125486:30000004:FELIPE ARAKAKI BARRETO:/home/c125486:/bin/bash
2026-06-08T14:00:23.5029054Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c132179:x:10132179:30000004:LUIZ HENRIQUE FREITAS BEZERRA:/home/c132179:/bin/bash
2026-06-08T14:00:23.5029456Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p678812:x:10678812:30000004:RODRIGO ARMENIO CAMILO CRUZ:/home/p678812:/bin/bash
2026-06-08T14:00:23.5029793Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c074707:x:10074707:20001097:GERSON COSTA FERREIRA:/home/c074707:
2026-06-08T14:00:23.5030133Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f793233:x:10793233:20001097:NAILTON GONCALVES ALVES:/home/f793233:
2026-06-08T14:00:23.5030475Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f677456:x:10677456:30000004:MIKE SILVEIRA LIMA:/home/f677456:/bin/bash
2026-06-08T14:00:23.5030923Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f562376:x:10562376:30000004:ALEX SANTOS LOPES:/home/f562376:/bin/bash
2026-06-08T14:00:23.5031282Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p764597:x:10764597:30000004:CARLOS EDUARDO MATOS MOREIRA:/home/p764597:/bin/bash
2026-06-08T14:00:23.5031626Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p699871:x:10699871:30000004:DAVI ALVES DE PAULA:/home/p699871:/bin/bash
2026-06-08T14:00:23.5031975Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c146608:x:10146608:30000004:PAULO DONIZETI GARDINALLI FILHO:/home/c146608:/bin/bash
2026-06-08T14:00:23.5032334Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c059911:x:10059911:30000004:PRISCILA RIBEIRO FAILLACE:/home/c059911:/bin/bash
2026-06-08T14:00:23.5032763Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c120046:x:10120046:30000004:LUCYENNE CAMPOS DE OLIVEIRA DA SILVA:/home/c120046:/bin/bash
2026-06-08T14:00:23.5033126Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f413265:x:10413265:30000004:IAN LUCA NUNES SALES:/home/f413265:/bin/bash
2026-06-08T14:00:23.5033478Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f938410:x:10938410:30000004:PAULO ROBERTO DOS SANTOS:/home/f938410:/bin/bash
2026-06-08T14:00:23.5033836Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f916295:x:10916295:30000004:BRUNO HENRIQUE DE OLIVEIRA:/home/f916295:/bin/bash
2026-06-08T14:00:23.5034262Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c149506:x:10149506:30000004:FABIO SILVA DA ROCHA APARECIDO:/home/c149506:/bin/bash
2026-06-08T14:00:23.5034672Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c083445:x:10083445:30000004:ARTHUR ROBERTO MONZANI:/home/c083445:/bin/bash
2026-06-08T14:00:23.5035200Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p626693:x:10626693:20000000:MARCELO XAVIER SANTANA - Prestador:/home/p626693:/bin/bash
2026-06-08T14:00:23.5035690Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c152620:x:10152620:30000009:BRUNO COSTA RAMOS:/home/c152620:
2026-06-08T14:00:23.5036062Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spjssbp1:x:20001202:20001202:Conta.do.Sherlock.ponto.controle.CI.6488:/home/spjssbp1:/bin/bash
2026-06-08T14:00:23.5036426Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p793381:x:10793381:30000009:MARCO ANTONIO FOLLA:/home/p793381:/bin/bash
2026-06-08T14:00:23.5036784Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p725347:x:10725347:30000004:JORGE DO NASCIMENTO SILVA:/home/p725347:/bin/bash
2026-06-08T14:00:23.5037140Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p412756:x:10412756:30000004:KAMILLA DELMONDES DE FREITAS:/home/p412756:/bin/bash
2026-06-08T14:00:23.5037480Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): C103771:x:10103771:20001097:JOSE VICTOR DE MACEDO:/home/c103771:
2026-06-08T14:00:23.5040803Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p696486:x:10696486:30000004:THIAGO DOS REIS BARCELOS DA SILVA:/home/p696486:/bin/bash
2026-06-08T14:00:23.5041331Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p565823:x:10565823:30000004:VITOR MONTEIRO BORGES:/home/p565823:/bin/bash
2026-06-08T14:00:23.5041831Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f952762:x:10952762:30000004:MOISES DUTRA DA COSTA:/home/f952762:/bin/bash
2026-06-08T14:00:23.5042319Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f995045:x:10995045:30000004:JORGE PAULO DOS SANTOS:/home/f995045:/bin/bash
2026-06-08T14:00:23.5043009Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spftppbn:x:30000868:30000868:Conta.de.FTP.para.transmissao.de.arquivos.da.Producao:/home/spftppbn:/bin/bash
2026-06-08T14:00:23.5043572Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c155387:x:10155387:30000004:RODRIGO VITORINO DE SOUZA:/home/c155387:/bin/bash
2026-06-08T14:00:23.5043943Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c145084:x:10145084:30000004:JOAO VICTOR PETRUCELI PAES:/home/c145084:/bin/bash
2026-06-08T14:00:23.5044290Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p972886:x:10972886:30000009:JORGE LUIZ DOS SANTOS:/home/p972886:/bin/bash
2026-06-08T14:00:23.5044629Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f500239:x:10500239:30000004:TAKASHI SAITO:/home/f500239:/bin/bash
2026-06-08T14:00:23.5044980Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f518978:x:10518978:30000004:JOSE ROBERTO ALVES FERREIRA:/home/f518978:/bin/bash
2026-06-08T14:00:23.5045340Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c076514:x:10076514:30000004:VAGNER FABIO GUILHERME DA SILVA:/home/c076514:/bin/bash
2026-06-08T14:00:23.5045684Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f932071:x:10932071:30000004:BIANCA CAMARA PERES:/home/f932071:/bin/bash
2026-06-08T14:00:23.5046042Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p578571:x:10578571:20001044:GIOVANNI LAFONTAINE CASTEDO BISIO:/home/p578571:/bin/bash
2026-06-08T14:00:23.5046537Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f758593:x:10758593:20001097:Raphael Nunes Carretero:/home/f758593:/bin/bash
2026-06-08T14:00:23.5046887Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f793002:x:10793002:30000004:CAUAN HENRIQUE CUNHA MENDONCA:/home/f793002:/bin/bash
2026-06-08T14:00:23.5047246Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f668798:x:10668798:30000004:MIQUEIAS AMARO EVANGELISTA:/home/f668798:/bin/bash
2026-06-08T14:00:23.5047592Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f594606:x:10594606:30000004:GABRIEL DE BRITO SILVA:/home/f594606:/bin/bash
2026-06-08T14:00:23.5047927Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p509401:x:10504867:30000009:VANDER CESAR CARAMORI:/home/p509401:
2026-06-08T14:00:23.5048268Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p913293:x:10913293:30000009:MATEUS MORATO LUSTOSA:/home/p913293:/bin/bash
2026-06-08T14:00:23.5048644Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c124253:x:10124253:30000004:TIAGO BRITO MERCURI:/home/c124253:/bin/bash
2026-06-08T14:00:23.5048981Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p634282:x:10634282:20000000:FABIO DE MELO LOULY CAMPOS:/home/p634282:
2026-06-08T14:00:23.5049411Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c067712:x:10067712:30000004:WIRLINDA BRASIL MAIA MOTA:/home/c067712:/bin/bash
2026-06-08T14:00:23.5049758Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p551063:x:10551063:30000009:FABIO NASCIMENTO DE MELO:/home/p551063:/bin/bash
2026-06-08T14:00:23.5050104Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p649071:x:10649071:30000004:LUCIO PRETO RODRIGUES:/home/p649071:/bin/bash
2026-06-08T14:00:23.5050565Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c050873:x:10050873:20001097:FERNANDO PELLISARIO DE GODOY:/home/c050873:
2026-06-08T14:00:23.5050918Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c058886:x:10058886:20000000:MARCELO DE OLIVEIRA SIMOES:/home/c058886:/bin/bash
2026-06-08T14:00:23.5051265Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f591385:x:10591385:30000004:RODRIGO DE SOUZA LINS:/home/f591385:/bin/bash
2026-06-08T14:00:23.5051613Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p960288:x:10960288:30000009:VANESSA PIRES DOMINGUES:/home/p960288:/bin/bash
2026-06-08T14:00:23.5051954Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f595794:x:10595794:30000004:HELDER JOSE DA SILVA:/home/f595794:/bin/bash
2026-06-08T14:00:23.5052306Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c111475:x:10111475:30000004:VANESSA CRISTINA HILARIO GAIA:/home/c111475:/bin/bash
2026-06-08T14:00:23.5052733Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c132878:x:10132878:30000004:MARIANA ESTEVO PIO DOS SANTOS:/home/c132878:/bin/bash
2026-06-08T14:00:23.5053089Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f502095:x:10502095:30000004:MARCUS VERAS FURTUNA:/home/f502095:/bin/bash
2026-06-08T14:00:23.5053435Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c137416:x:10137416:30000004:THIAGO LUIZ DE OLIVEIRA:/home/c137416:/bin/bash
2026-06-08T14:00:23.5053778Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f612159:x:10612159:20001097:DANIEL OLIMPIO GOMES:/home/f612159:/bin/bash
2026-06-08T14:00:23.5054217Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c151000:x:10151000:30000004:CARLOS ANDRE DE SOUZA:/home/c151000:/bin/bash
2026-06-08T14:00:23.5054722Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f618799:x:10618799:20001097:JOSE WAGNER FERNANDES MOSCHIONI:/home/f618799:/bin/bash
2026-06-08T14:00:23.5055230Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f592162:x:10592162:20001097:CARLOS EDUARDO FERREIRA PEREIRA:/home/f592162:/bin/bash
2026-06-08T14:00:23.5055590Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f950971:x:10950971:20001097:FABIO BRANDAO DE MEDEIROS:/home/f950971:
2026-06-08T14:00:23.5055924Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f776294:x:10776294:20001097:JAMES FERREIRA DE MELO:/home/f776294:
2026-06-08T14:00:23.5056254Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f558587:x:10558587:20001097:MARCELO JESUS DOS SANTOS:/home/f558587:
2026-06-08T14:00:23.5056589Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f554949:x:10554949:20001097:TONY STEWERS OLIVEIRA:/home/f554949:
2026-06-08T14:00:23.5056921Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f712867:x:10712867:20001097:RODRIGO DA HORA SILVA:/home/f712867:
2026-06-08T14:00:23.5057245Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f792448:x:10792448:20001097:JANAINA PIOVANI:/home/f792448:
2026-06-08T14:00:23.5057621Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f777291:x:10777291:20001097:CARLOS VIEIRA DE ARAUJO:/home/f777291:
2026-06-08T14:00:23.5057950Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f729827:x:10729827:20001097:KEVIN GUTIERREZ GOMES:/home/f729827:
2026-06-08T14:00:23.5058295Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f723937:x:10723937:20001097:RENATO DE OLIVEIRA SANTOS E SILVA:/home/f723937:
2026-06-08T14:00:23.5058649Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f525636:x:10525636:30000004:PRISCILLA MARQUES FIGUEIREDO:/home/f525636:/bin/bash
2026-06-08T14:00:23.5059005Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f609227:x:10609227:30000004:JOAO BOSCO CAVALCANTE ALBUQUERQUE:/home/f609227:/bin/bash
2026-06-08T14:00:23.5059418Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f707966:x:10707966:20001097:CESAR DE ASSIS VOGINSKI JUNIOR:/home/f707966:
2026-06-08T14:00:23.5059781Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f763980:x:10763980:20001097:CLEBER ROBERTO BAPTISTELA:/home/f763980:
2026-06-08T14:00:23.5060118Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f754378:x:10754378:20001097:MARCIA MARIA GRANUSSO:/home/f754378:
2026-06-08T14:00:23.5060549Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f526552:x:10526552:20001097:KELVIN EPPINGHAUS FERREIRA:/home/f526552:
2026-06-08T14:00:23.5060881Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f719009:x:10719009:20001097:ANDRE KYOSHI MIYAMOTO:/home/f719009:
2026-06-08T14:00:23.5061207Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f687877:x:10687877:20001097:TATIANE SOUZA BARROS:/home/f687877:
2026-06-08T14:00:23.5061542Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f964052:x:10964052:30000004:MATEUS DUTRA DA COSTA:/home/f964052:/bin/bash
2026-06-08T14:00:23.5061877Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f747914:x:10747914:30000004:FERNANDO GONCALVES:/home/f747914:/bin/bash
2026-06-08T14:00:23.5062219Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f641182:x:10641182:30000004:WESLENE CAVALCANTE SABOIA:/home/f641182:/bin/bash
2026-06-08T14:00:23.5062655Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p926712:x:10926712:30000004:JULIANO LEAO BENASSI:/home/p926712:/bin/bash
2026-06-08T14:00:23.5063012Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p573005:x:10573005:30000004:ALFREDO RIBEIRO DE ALMEIDA:/home/p573005:/bin/bash
2026-06-08T14:00:23.5063361Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f581029:x:10581029:30000004:JOSE ANTONIO SOARES CARQUEJEIRO:/home/f581029:/bin/bash
2026-06-08T14:00:23.5063708Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f566263:x:10566263:30000004:ANDREA PONS FERREIRA:/home/f566263:/bin/bash
2026-06-08T14:00:23.5064043Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a725476:x:10725476:20000000:ROGER COSTA MACHADO:/home/a725476:/bin/bash
2026-06-08T14:00:23.5064478Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p799982:x:10799982:30000009:MARCOS HELI DA SILVA CAETANO:/home/p799982:/bin/bash
2026-06-08T14:00:23.5064817Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p725476:x:10725476:30000004:ROGER COSTA MACHADO:/home/p725476:/bin/bash
2026-06-08T14:00:23.5065158Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f591848:x:10591848:30000004:DIVINO LUIZ BARBOSA MOREIRA:/home/f591848:/bin/bash
2026-06-08T14:00:23.5065555Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f985120:x:10985120:30000004:RITA DE CASSIA PERROT DE MELO:/home/f985120:/bin/bash
2026-06-08T14:00:23.5065896Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f941139:x:10941139:30000004:DENIS SOUTO DE JESUS:/home/f941139:/bin/bash
2026-06-08T14:00:23.5066242Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f693607:x:10693607:30000004:KATIA MARTINS CASTRO DE ARAUJO:/home/f693607:/bin/bash
2026-06-08T14:00:23.5066576Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c054158:x:10054158:20001097:MAURICIO MINORU SAITO:/home/c054158:
2026-06-08T14:00:23.5067009Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f797014:x:10797014:30000004:FILEMON TEOFILO SILVA JUNIOR:/home/f797014:/bin/bash
2026-06-08T14:00:23.5067469Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c148749:x:10148749:20001097:Assis Pereira dos Passos:/home/c148749:
2026-06-08T14:00:23.5067894Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f586313:x:10586313:20001097:ISRAEL CORREIA DE CASTRO:/home/f586313:
2026-06-08T14:00:23.5068414Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f605354:x:10605354:30000004:NICOLLAS GABRIEL CUBA FARO CIULDIN:/home/f605354:/bin/bash
2026-06-08T14:00:23.5068924Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p970686:x:10970686:20000000:FLAVIO RICARDO GIRONDA:/home/p970686:/bin/bash
2026-06-08T14:00:23.5069445Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p749124:x:10749124:30000004:FERNANDO PERASSOLE:/home/p749124:/bin/bash
2026-06-08T14:00:23.5069946Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f562820:x:10562820:30000004:ALBERTO DE SOUZA VIEGAS:/home/f562820:/bin/bash
2026-06-08T14:00:23.5070468Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f985639:x:10985639:30000004:VANDO GOMES FERREIRA:/home/f985639:/bin/bash
2026-06-08T14:00:23.5070948Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p790668:x:10790668:30000004:SERGIO LUIZ GARCIA:/home/p790668:/bin/bash
2026-06-08T14:00:23.5071453Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f961074:x:10961074:20001097:LEANDRO EIJI NISIYAMA:/home/f961074:/bin/bash
2026-06-08T14:00:23.5072080Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p965933:x:10965933:30000004:ISAAC ALEXANDRE PREDROZANI:/home/p965933:/bin/bash
2026-06-08T14:00:23.5072707Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f563512:x:10563512:20001097:JONES WILLIAN TREVISAN FERREIRA:/home/f563512:/bin/bash
2026-06-08T14:00:23.5073245Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f563472:x:10563472:20001097:Armando Raposo Neto:/home/f563472:/bin/bash
2026-06-08T14:00:23.5073716Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c137830:x:10137830:20001097:DENIS SOARES ARNOLD:/home/c137830:
2026-06-08T14:00:23.5074224Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p799822:x:10799822:30000009:SILVIO MITSUAKI YAMASHITA:/home/p799822:/bin/bash
2026-06-08T14:00:23.5074719Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f767192:x:10767192:20001097:Fatima Rosario Braga:/home/f767192:
2026-06-08T14:00:23.5075222Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f651797:x:10651797:20001097:RODRIGO NERES DA SILVA:/home/f651797:
2026-06-08T14:00:23.5075693Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f757934:x:10757934:30000004:WENDELL CAMPOS VERAS:/home/f757934:/bin/bash
2026-06-08T14:00:23.5076296Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f789521:x:10789521:30000004:RODRIGO MOURA NUNES:/home/f789521:/bin/bash
2026-06-08T14:00:23.5076652Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f642488:x:10642488:30000004:ALEXANDRE DIAS BRIGIDO:/home/f642488:/bin/bash
2026-06-08T14:00:23.5077004Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f655387:x:10655387:30000004:FERNANDO DA CONCEICAO DO NASCIMENTO:/home/f655387:/bin/bash
2026-06-08T14:00:23.5077362Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c101354:x:10101354:30000004:CRISTIANE ARAUJO GARCIA:/home/c101354:/bin/bash
2026-06-08T14:00:23.5077858Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f956832:x:10956832:30000004:BEATRIZ ALMEIDA SOBRINHO:/home/f956832:/bin/bash
2026-06-08T14:00:23.5078345Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p570773:x:10570773:30000004:LEANDRO ALEXANDRE ZUZA:/home/p570773:/bin/bash
2026-06-08T14:00:23.5078828Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f956708:x:10956708:30000004:ARTUR DE MEIRA RODRIGUES:/home/f956708:/bin/bash
2026-06-08T14:00:23.5079327Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f629839:x:10629839:30000004:RODRIGO MEURER MELO:/home/f629839:/bin/bash
2026-06-08T14:00:23.5079846Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p988842:x:10988842:20001097:IVANILDO MAIA DIAS JUNIOR:/home/p988842:
2026-06-08T14:00:23.5080355Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f597767:x:10597767:20001097:RUBENS TAVARES SILVA:/home/f597767:
2026-06-08T14:00:23.5080836Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f647074:x:10647074:20001097:ROBERTO DIAS DA SILVA:/home/f647074:
2026-06-08T14:00:23.5081371Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f782504:x:10782504:30000004:DOUGLAS TELES DE OLIVEIRA:/home/f782504:/bin/bash
2026-06-08T14:00:23.5081880Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p907272:x:10907272:30000004:WILLIAN HIROSE LOBATO:/home/p907272:/bin/bash
2026-06-08T14:00:23.5082249Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c083101:x:10083101:30000004:KARINA MARIM ALVES:/home/c083101:/bin/bash
2026-06-08T14:00:23.5082958Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f537604:x:10537604:20001097:MARCELO DE ALMEIDA MARTINS:/home/f537604:
2026-06-08T14:00:23.5083334Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f611492:x:10611492:30000004:GEOVANNE DA SILVA ANDRADE:/home/f611492:/bin/bash
2026-06-08T14:00:23.5083673Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f714880:x:10714880:30000004:THEDY SEBEN:/home/f714880:/bin/bash
2026-06-08T14:00:23.5084015Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f611519:x:10611519:30000004:JONATHAN LUIZ REIS DA SILVA:/home/f611519:/bin/bash
2026-06-08T14:00:23.5084362Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f626712:x:10626712:30000004:LUIZ TIAGO ALVES DO NASCIMENTO:/home/f626712:/bin/bash
2026-06-08T14:00:23.5084715Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f530404:x:10530404:20001050:FREDERICO ANTONIO BERTOLIN SIERVO:/home/f530404:
2026-06-08T14:00:23.5085052Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c061850:x:10061850:20001097:WILLIAM ANDERSON NASCIMENTO:/home/c061850:
2026-06-08T14:00:23.5085476Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f560897:x:10560897:30000004:JONATAS FERREIRA DE SOUSA:/home/f560897:/bin/bash
2026-06-08T14:00:23.5085980Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f969429:x:10969429:20001097:RAFAEL PESSOA TEIXEIRA:/home/f969429:
2026-06-08T14:00:23.5086328Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p767145:x:10767145:30000004:ERICK ALEX COUTINHO DE SOUZA:/home/p767145:/bin/bash
2026-06-08T14:00:23.5086672Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f788864:x:10788864:30000004:VIVIANE CABRAL DA SILVA:/home/f788864:/bin/bash
2026-06-08T14:00:23.5087019Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f796846:x:10796846:30000004:DAVID CREI DA SILVA:/home/f796846:/bin/bash
2026-06-08T14:00:23.5087352Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f972926:x:10972926:20001097:ERIC LEONARDO SANTOS RANGEL:/home/f972926:
2026-06-08T14:00:23.5087695Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c076580:x:10076580:30000009:MARCIA APARECIDA GONCALVES DE CARVALHO:/home/c076580:
2026-06-08T14:00:23.5088046Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f612961:x:10612961:30000004:GILBERTO XAVIER RODRIGUES:/home/f612961:/bin/bash
2026-06-08T14:00:23.5088387Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f574747:x:10574747:20001097:ALEXSANDRA FERNANDES MAIA:/home/f574747:/bin/bash
2026-06-08T14:00:23.5088740Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a706380:x:10706380:30000004:LUCAS ROCHA DE FIGUEIREDO TAVARES:/home/a706380:/bin/bash
2026-06-08T14:00:23.5089377Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p790909:x:10790909:30000004:ANTONIO VIANA DA COSTA FILHO:/home/p790909:/bin/bash
2026-06-08T14:00:23.5089848Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f607432:x:10607432:20001097:ALESSANDRA ALVES DE AGUIAR FLORES:/home/f607432:
2026-06-08T14:00:23.5090596Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spshepb1:x:20003906:30000870:Usuario do SHERLOCK - TAS000040081287_CRQ000000816247_REQ000072823992:/home/spshepb1:/bin/bash
2026-06-08T14:00:23.5091191Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c131754:x:10131754:30000004:ANDRE RODRIGUES DE OLIVEIRA:/home/c131754:/bin/bash
2026-06-08T14:00:23.5091629Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f754469:x:10754469:20001050:JULIANA RODRIGUES:/home/f754469:/bin/bash
2026-06-08T14:00:23.5091969Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f945155:x:10945155:20001097:JARDIANO DE QUEIROZ SILVA:/home/f945155:
2026-06-08T14:00:23.5092306Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f605295:x:10605295:20001097:Michelle Lopes Pessanha:/home/f605295:
2026-06-08T14:00:23.5093030Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p640931:x:10640931:30000009:CESAR AUGUSTO FLORIAN:/home/p640931:/bin/bash
2026-06-08T14:00:23.5093902Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p667436:x:10667436:20000987:DIOGO DE OLIVEIRA ALMEIDA:/home/p667436:/bin/bash
2026-06-08T14:00:23.5094744Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f609858:x:10609858:30000004:LEANDRO DA SILVA LARA:/home/f609858:/bin/bash
2026-06-08T14:00:23.5095478Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f578213:x:10578213:30000004:ROMMEL ALEXANDRE VASCONCELOS DOS SANTOS:/home/f578213:/bin/bash
2026-06-08T14:00:23.5096016Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c092758:x:10092758:30000004:JOAO PAULO PIMENTEL:/home/c092758:/bin/bash
2026-06-08T14:00:23.5096533Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f576759:x:10576759:20001097:MURILO GABRIEL RODRIGUES:/home/f576759:
2026-06-08T14:00:23.5097006Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p978986:x:10978986:30000004:MOISES HENRIQUE DA SILVA:/home/p978986:/bin/bash
2026-06-08T14:00:23.5097365Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c136716:x:10136716:20001048:MATEUS BARRETO NOBREGA DE LUCENA:/home/c136716:/bin/bash
2026-06-08T14:00:23.5097726Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c098838:x:10098838:30000004:DENIS GUTIERREZ CASTRO:/home/c098838:/bin/bash
2026-06-08T14:00:23.5098672Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p667320:x:10667320:30000009:FELIPE RAFAEL LEITE ANTUNES:/home/p667320:/bin/bash
2026-06-08T14:00:23.5100434Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f747535:x:10747535:20001097:MARCOS DE SANTIS:/home/f747535:
2026-06-08T14:00:23.5101263Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f706540:x:10706540:20000000:ANDERSON SILVA DA CONCEICAO:/home/f706540:/bin/bash
2026-06-08T14:00:23.5101924Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f734985:x:10734985:30000004:RONALDO DA SILVA BARROS:/home/f734985:/bin/bash
2026-06-08T14:00:23.5102811Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f734974:x:10734974:30000004:JOAO VINICIUS FERNANDES OLIVEIRA:/home/f734974:/bin/bash
2026-06-08T14:00:23.5103377Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f650086:x:10650086:30000004:JOSE MARIA DE ALMEIDA JUNIOR:/home/f650086:/bin/bash
2026-06-08T14:00:23.5103932Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c079716:x:10079716:20001097:KELLY DOS SANTOS BAUMGRATZ:/home/c079716:
2026-06-08T14:00:23.5104489Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f704511:x:10704511:30000004:FELIPE CABRAL OLIVEIRA DORTA:/home/f704511:/bin/bash
2026-06-08T14:00:23.5105512Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f638045:x:10638045:20001097:JOAO VICENTE GAIDZINSKI COUTINHO DO NASC:/home/f638045:
2026-06-08T14:00:23.5105899Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f908257:x:10908257:30000004:MARCOS RAMOS DUARTE:/home/f908257:/bin/bash
2026-06-08T14:00:23.5106403Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f653373:x:10653373:20001097:GUILHERME AUGUSTO SOARES FERREIRA CANCAD:/home/f653373:/bin/bash
2026-06-08T14:00:23.5106757Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f652643:x:10652643:30000004:THIAGO ANDERSON MARTINS:/home/f652643:/bin/bash
2026-06-08T14:00:23.5107106Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f501519:x:10501519:30000004:LUCAS GOMES PEREIRA:/home/f501519:/bin/bash
2026-06-08T14:00:23.5107459Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p785544:x:10785544:30000004:WELLINGTON DE OLIVEIRA SOUSA:/home/p785544:/bin/bash
2026-06-08T14:00:23.5107936Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p755162:x:10755162:30000009:ROMILSON MARQUES FERREIRA:/home/p755162:/bin/bash
2026-06-08T14:00:23.5109058Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f781627:x:10781627:30000004:NOELI DA FONSECA PEREIRA FERNANDES:/home/f781627:/bin/bash
2026-06-08T14:00:23.5109752Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f658071:x:10658071:20001097:MARCOS DOUGLAS PEREIRA DA COSTA:/home/f658071:/bin/bash
2026-06-08T14:00:23.5110133Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f635040:x:10635040:30000004:ANA EULALIA DANTAS DE FREITAS:/home/f635040:/bin/bash
2026-06-08T14:00:23.5111721Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f587115:x:10587115:30000004:PATRICIA OLIVEIRA LIMA:/home/f587115:/bin/bash
2026-06-08T14:00:23.5112080Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f603026:x:10603026:30000004:EDUARDO PIROZZOLO PINTO:/home/f603026:/bin/bash
2026-06-08T14:00:23.5112533Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a573448:x:10573448:30000004:FLAVIO LONGUE GUIMARAES:/home/a573448:/bin/bash
2026-06-08T14:00:23.5113062Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f932749:x:10932749:30000004:DOUGLAS HENRIQUE EMILIANO DE OLIVEIRA LI:/home/f932749:/bin/bash
2026-06-08T14:00:23.5113593Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f902417:x:10902417:30000004:THOMAS JEFERSON SILVA DE OLIVEIRA:/home/f902417:/bin/bash
2026-06-08T14:00:23.5116000Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f637011:x:10637011:30000004:DIEGO AUGUSTO BEZERRA PESSOA:/home/f637011:/bin/bash
2026-06-08T14:00:23.5116626Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f763565:x:10763565:30000004:OSCAR FERREIRA DA SILVA NETO:/home/f763565:/bin/bash
2026-06-08T14:00:23.5117197Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f789301:x:10789301:30000004:WILLIAMS MELQUIADES COSTA:/home/f789301:/bin/bash
2026-06-08T14:00:23.5117740Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c064526:x:10064526:30000004:EDUARDO CALDAS DIAS:/home/c064526:/bin/bash
2026-06-08T14:00:23.5118587Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c147525:x:10147525:20001097:FABIO ALEXANDRE CASSIDORI COUTO:/home/c147525:
2026-06-08T14:00:23.5118951Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f599325:x:10599325:20001050:KESSYA DE FARIAS SOUZA:/home/f599325:/bin/bash
2026-06-08T14:00:23.5119319Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f782611:x:10782611:30000004:RAFAEL BRAGA:/home/f782611:/bin/bash
2026-06-08T14:00:23.5119685Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c039530:x:10039530:30000009:EUNICE TOSHIE YAMAMOTO SAMANO:/home/c039530:/bin/bash
2026-06-08T14:00:23.5120212Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c141997:x:10141997:20001097:JOSE ALEXANDRE FERREIRA BITENCOURT:/home/c141997:
2026-06-08T14:00:23.5120765Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f772529:x:10772529:30000004:TELMO RICARDO ROSA NASCIMENTO:/home/f772529:/bin/bash
2026-06-08T14:00:23.5121288Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f666949:x:10666949:30000004:PAULO TADEU RIBEIRO DA SILVA JUNIOR:/home/f666949:/bin/bash
2026-06-08T14:00:23.5121659Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f757509:x:10757509:30000004:JONATAN RIBEIRO DE MOURA:/home/f757509:/bin/bash
2026-06-08T14:00:23.5122105Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c071624:x:10071624:30000004:ANDRE BAVARESCO PESSA:/home/c071624:/bin/bash
2026-06-08T14:00:23.5122783Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f623702:x:10623702:30000004:EMERSON ROGERIO FERREIRA:/home/f623702:/bin/bash
2026-06-08T14:00:23.5123170Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f609700:x:10609700:20001097:MAXWELL LEAL DOS SANTOS:/home/f609700:
2026-06-08T14:00:23.5124448Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c109785:x:10109785:20001097:LUIZ EDUARDO LIRA RIBEIRO PIMENTA:/home/c109785:
2026-06-08T14:00:23.5126416Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f753750:x:10753750:30000004:HALLEF BRUNO LOPES DA SILVA:/home/f753750:/bin/bash
2026-06-08T14:00:23.5127262Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f714947:x:10714947:30000004:FABIO SOARES DE SOUZA:/home/f714947:/bin/bash
2026-06-08T14:00:23.5128646Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f711325:x:10711325:30000004:RODRIGO JOSE BEZERRA DE MELO SILVA:/home/f711325:/bin/bash
2026-06-08T14:00:23.5135203Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f742641:x:10742641:30000004:WILLIAN MALTUS DE SOUZA CARDOSO:/home/f742641:/bin/bash
2026-06-08T14:00:23.5135860Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f770260:x:10770260:20001097:MARCOS PAULO ARAUJO DE SOUSA:/home/f770260:
2026-06-08T14:00:23.5136344Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f990175:x:10990175:30000004:ALEXSANDRO LAU KASSAWARA:/home/f990175:/bin/bash
2026-06-08T14:00:23.5136911Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c130323:x:10130323:20001097:TIAGO SANTOS FERNANDES:/home/c130323:
2026-06-08T14:00:23.5137342Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f560151:x:10560151:30000004:RODOLFO KLEBER DA SILVA SANTOS JUNIOR:/home/f560151:/bin/bash
2026-06-08T14:00:23.5137731Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f779919:x:10779919:30000004:MATHEUS TELES BARBOSA DA SILVA MESQUITA:/home/f779919:/bin/bash
2026-06-08T14:00:23.5138097Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f998915:x:10998915:30000004:EDUARDO ASAFE VALVERDE LOPES:/home/f998915:/bin/bash
2026-06-08T14:00:23.5138481Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p947841:x:10947841:30000004:SILAS PEREIRA DA COSTA NETO:/home/p947841:/bin/bash
2026-06-08T14:00:23.5138840Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p762287:x:10762287:30000004:RAFAELA CRISTINA DE SOUZA MOREIRA:/home/p762287:
2026-06-08T14:00:23.5139193Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f553531:x:10553531:30000004:PATRICIA NASCIMENTO:/home/f553531:/bin/bash
2026-06-08T14:00:23.5139543Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f703054:x:10703054:30000004:FABIO ARAUJO GAUNA:/home/f703054:/bin/bash
2026-06-08T14:00:23.5140069Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c069999:x:10069999:20001097:FERNANDO HENRIQUE DOS SANTOS CRUZ:/home/c069999:
2026-06-08T14:00:23.5140423Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c154283:x:10154283:20001097:DANIELA RODRIGUES DE MIRANDA:/home/c154283:
2026-06-08T14:00:23.5140773Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c052955:x:10052955:30000004:WILTON DE ALMEIDA BENTES:/home/c052955:/bin/bash
2026-06-08T14:00:23.5141175Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): sshebp01:x:20003907:20001210:conta.de.servico.do.sherlock.CRQ000000816269.REQ000076069324:/home/sshebp01:/bin/bash
2026-06-08T14:00:23.5141546Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f607127:x:10607127:30000004:RAFAEL MARQUES DA PAIXAO:/home/f607127:/bin/bash
2026-06-08T14:00:23.5141896Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f992723:x:10992723:30000004:SAMARA DINIZ LISBOA:/home/f992723:/bin/bash
2026-06-08T14:00:23.5142250Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p759853:x:10759853:30000004:ANDRE HENRIQUE DA SILVA WANDERLEY:/home/p759853:/bin/bash
2026-06-08T14:00:23.5142711Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f695653:x:10695653:20001097:VERONICA RODRIGUES COSTA:/home/f695653:
2026-06-08T14:00:23.5143134Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f598179:x:10598179:30000004:GILBERTO SETUBAL RODRIGUES:/home/f598179:/bin/bash
2026-06-08T14:00:23.5143483Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f549945:x:10549945:30000004:RENAN LEITE PEREIRA:/home/f549945:/bin/bash
2026-06-08T14:00:23.5143829Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p694326:x:10694326:30000009:KLEBER ALMEIDA SOUZA:/home/p694326:/bin/bash
2026-06-08T14:00:23.5144171Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f950031:x:10950031:20001097:FLAVIO PIRES CAMPITELI:/home/f950031:
2026-06-08T14:00:23.5144525Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c149156:x:10149156:20001097:ANDREA CAVALCANTE DE AMORIM PINHEIRO:/home/c149156:/bin/bash
2026-06-08T14:00:23.5144888Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c102408:x:10102408:30000004:JULIO HENRIQUE FERREIRA DE MELO:/home/c102408:/bin/bash
2026-06-08T14:00:23.5145248Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f782514:x:10782514:20001097:JEFFERSON DA SILVA OLIVEIRA:/home/f782514:/bin/bash
2026-06-08T14:00:23.5145594Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f627727:x:10627727:20001097:FABIO PAULEK MACHADO:/home/f627727:
2026-06-08T14:00:23.5145938Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c134476:x:10134476:30000004:MARCELA GOMES DA SILVA:/home/c134476:/bin/bash
2026-06-08T14:00:23.5146297Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p570765:x:10570765:30000009:Mauro de Abreu Galdino :/home/p570765:
2026-06-08T14:00:23.5146645Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f984007:x:10984007:30000004:SANDRO MARTINS DOS SANTOS:/home/f984007:/bin/bash
2026-06-08T14:00:23.5146995Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f756595:x:10756595:30000004:IVAN MARQUES MELLO:/home/f756595:/bin/bash
2026-06-08T14:00:23.5147346Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p704726:x:10704726:30000004:JORGE LUIS CHAGAS OLIVEIRA JUNIOR:/home/p704726:
2026-06-08T14:00:23.5147695Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c148734:x:10148734:30000004:RAMON MARTINEZ PIMENTA:/home/c148734:/bin/bash
2026-06-08T14:00:23.5148088Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c148738:x:10148738:30000004:THIAGO ELIAS CHIANCA:/home/c148738:/bin/bash
2026-06-08T14:00:23.5148433Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f727834:x:10727834:20001097:LEONARDO OLIVEIRA MESQUITA:/home/f727834:
2026-06-08T14:00:23.5148767Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f744107:x:10744107:20001097:BRUNO PINHEIRO MARTINS:/home/f744107:
2026-06-08T14:00:23.5149115Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p978390:x:10978390:20000000:PEDRO DE OLIVEIRA RUBIO:/home/p978390:/bin/bash
2026-06-08T14:00:23.5149980Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c027778:x:10027778:20001097:MARCUS VINICIUS SILVEIRA BULHOSA:/home/c027778:
2026-06-08T14:00:23.5150645Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f792201:x:10792201:30000004:DIVA GABRIELA SIQUEIRA RODRIGUES:/home/f792201:/bin/bash
2026-06-08T14:00:23.5151306Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f920770:x:10920770:20001097:RODRIGO DIAS DA ROCHA:/home/f920770:/bin/bash
2026-06-08T14:00:23.5151923Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f745395:x:10745395:20001097:ANTONIO LAZARO RIBEIRO DOS SANTOS:/home/f745395:/bin/bash
2026-06-08T14:00:23.5152790Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f683095:x:10683095:30000004:FABIO SILVA CARDOSO:/home/f683095:/bin/bash
2026-06-08T14:00:23.5153373Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f926358:x:10926358:30000004:CELIA MARISA DOS SANTOS:/home/f926358:/bin/bash
2026-06-08T14:00:23.5153931Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f950353:x:10950353:30000004:BRUNA NASCIMENTO TRINDADE:/home/f950353:/bin/bash
2026-06-08T14:00:23.5154616Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c153822:x:10153822:30000004:EDUARDO DA SILVEIRA SILVA:/home/c153822:/bin/bash
2026-06-08T14:00:23.5155188Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f770855:x:10770855:30000004:ERIK DA SILVA PAIXAO REIS:/home/f770855:/bin/bash
2026-06-08T14:00:23.5155808Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c139450:x:10139450:30000004:MARCIO FLORES MARTINEZ:/home/c139450:/bin/bash
2026-06-08T14:00:23.5156453Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c126903:x:10126903:30000004:DENIS MARCEL FERNANDES:/home/c126903:/bin/bash
2026-06-08T14:00:23.5157117Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f551205:x:10551205:30000004:ANA CRISTINA GOMES MADEIRA ALVES:/home/f551205:/bin/bash
2026-06-08T14:00:23.5157772Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f514281:x:10514281:30000004:ROSANGELA APARECIDA MENHA:/home/f514281:/bin/bash
2026-06-08T14:00:23.5158402Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f531246:x:10531246:30000004:RAFAEL CORTEZ PEREIRA:/home/f531246:/bin/bash
2026-06-08T14:00:23.5159035Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f956693:x:10956693:30000004:LEONARDO GRANDISOLI:/home/f956693:/bin/bash
2026-06-08T14:00:23.5162069Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f756592:x:10756592:20001097:ANTENOR WENDLER MACIEL:/home/f756592:
2026-06-08T14:00:23.5162828Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f777506:x:10777506:20001097:MARKS WILLIAM DUARTE DE SOUZA:/home/f777506:
2026-06-08T14:00:23.5163699Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f793288:x:10793288:30000004:RAFAEL STASIEVSKI LIPPMANN:/home/f793288:/bin/bash
2026-06-08T14:00:23.5164345Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f970298:x:10970298:20001097:VITOR JACINTO SULZBACH:/home/f970298:
2026-06-08T14:00:23.5164979Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c135282:x:10135282:20001097:Caio Rodrigues Leite:/home/c135282:/bin/bash
2026-06-08T14:00:23.5165611Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f774953:x:10774953:20001097:ARTHUR ALECSANDER PORTO PRACA:/home/f774953:
2026-06-08T14:00:23.5166260Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f727469:x:10727469:30000004:RODOLFO RODRIGUES BORTOLOZO:/home/f727469:/bin/bash
2026-06-08T14:00:23.5166897Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f973425:x:10973425:30000004:EVELLYN DE ASSIS PINTO:/home/f973425:/bin/bash
2026-06-08T14:00:23.5167551Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c102996:x:10102996:30000004:DOUGLAS JUNDI KATAYAMA KOYAMA:/home/c102996:/bin/bash
2026-06-08T14:00:23.5168191Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c101534:x:10101534:30000004:ITALO MARINHO CIPPICIANI:/home/c101534:/bin/bash
2026-06-08T14:00:23.5168808Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f998938:x:10998938:30000004:MALBA JACOB PRUDENTE:/home/f998938:/bin/bash
2026-06-08T14:00:23.5169538Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c086993:x:10086993:20001097:ROSEMARY DE MELO CASTRO MANSUR:/home/c086993:
2026-06-08T14:00:23.5170089Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f793731:x:10793731:20001097:LEONARDO PINHEIRO LOPES:/home/f793731:
2026-06-08T14:00:23.5170619Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f501766:x:10501766:30000004:AGUINALDO ALVES BARBOSA SILVA:/home/f501766:/bin/bash
2026-06-08T14:00:23.5171180Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f588663:x:10588663:30000004:PAULO CEZAR MOURA TEIXEIRA JUNIOR:/home/f588663:/bin/bash
2026-06-08T14:00:23.5171714Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c051230:x:10051230:20001097:ANTONIO DE CASTRO ALVES:/home/c051230:
2026-06-08T14:00:23.5172082Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c131812:x:10131812:20001097:DOUGLAS MOREIRA BASTOS:/home/c131812:
2026-06-08T14:00:23.5172443Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f988326:x:10988326:30000004:RAFAEL RODRIGUES DE MORAES:/home/f988326:/bin/bash
2026-06-08T14:00:23.5172983Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f598526:x:10598526:30000004:NOBUMI TSUGUTA MATSUMOTO:/home/f598526:/bin/bash
2026-06-08T14:00:23.5173345Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f957225:x:10957225:20001097:JHONATAN JOSE DA SILVA:/home/f957225:
2026-06-08T14:00:23.5173719Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f551927:x:10551927:30000004:MARIA RAIMUNDA DE ALMEIDA BORGES:/home/f551927:/bin/bash
2026-06-08T14:00:23.5174077Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f715464:x:10715464:20001097:VERONICA DE JESUS GONCALVES:/home/f715464:
2026-06-08T14:00:23.5174427Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c089573:x:10089573:30000009:GLEISSON RIBEIRO ALVES:/home/c089573:/bin/bash
2026-06-08T14:00:23.5174785Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a789016:x:10789016:30000004:FRANCISCO JUNIO RODRIGUES OLIVEIRA:/home/p789016:/bin/bash
2026-06-08T14:00:23.5175235Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c080186:x:10080186:30000004:LEANDRO DERRICO:/home/c080186:/bin/bash
2026-06-08T14:00:23.5175586Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f724277:x:10724277:20001097:GLAUCO AGUIAR TAVARES DA CAMARA:/home/f724277:/bin/bash
2026-06-08T14:00:23.5175940Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f558591:x:10558591:30000004:RAFAEL SALVEGO DOS SANTOS:/home/f558591:/bin/bash
2026-06-08T14:00:23.5176293Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f620459:x:10620459:30000004:GUSTAVO JOSE DE SOUZA:/home/f620459:/bin/bash
2026-06-08T14:00:23.5176638Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c060954:x:10060954:30000004:MARCOS PERAZO VIANA:/home/c060954:/bin/bash
2026-06-08T14:00:23.5176980Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f634134:x:10634134:20001097:LEVI LUDE LEITE DA SILVA:/home/f634134:
2026-06-08T14:00:23.5177335Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f540832:x:10540832:30000004:GEOVANI JOSE MALAQUIAS:/home/f540832:/bin/bash
2026-06-08T14:00:23.5177694Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f703898:x:10703898:30000004:DEIVISSON MENDES MOREIRA DA PAIXAO:/home/f703898:/bin/bash
2026-06-08T14:00:23.5178048Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f668025:x:10668025:30000004:DIEGO BERNARDES PRADO:/home/f668025:/bin/bash
2026-06-08T14:00:23.5178441Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f773174:x:10773174:30000004:GUSTAVO LUCAS BARBOZA MIRANDA:/home/f773174:/bin/bash
2026-06-08T14:00:23.5178935Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c065708:x:10065708:30000004:CAIO FLAVIO SANTANA DELGADO:/home/c065708:/bin/bash
2026-06-08T14:00:23.5179321Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f715120:x:10715120:30000004:LUCAS FARIAS SIQUEIRA:/home/f715120:/bin/bash
2026-06-08T14:00:23.5180581Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c116597:x:10116597:30000004:CAIO ROBERTO MAXIMO DE AGUIAR:/home/c116597:/bin/bash
2026-06-08T14:00:23.5180957Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f628180:x:10628180:30000004:JOSE IRAPOAN NICASSIO DE LIMA:/home/f628180:/bin/bash
2026-06-08T14:00:23.5181378Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c124244:x:10124244:30000004:WILLIAM DA ROCHA ADRIANO:/home/c124244:/bin/bash
2026-06-08T14:00:23.5181721Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c110832:x:10110832:30000009:MINORU ONO:/home/c110832:/bin/bash
2026-06-08T14:00:23.5182142Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p668870:x:10668870:30000004:RADJALMA COSTA JUNIOR:/home/p668870:/bin/bash
2026-06-08T14:00:23.5182502Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p676613:x:10676613:30000004:PEDRO GOMES DA SILVA:/home/p676613:/bin/bash
2026-06-08T14:00:23.5184145Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f672972:x:10672972:30000004:MARCOS MOREIRA SILVA:/home/f672972:/bin/bash
2026-06-08T14:00:23.5184501Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f676815:x:10676815:30000004:SIDNEY JHONY DIAS DA SILVA:/home/f676815:/bin/bash
2026-06-08T14:00:23.5185014Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f944082:x:10944082:30000004:LIVIA GARCIA DA SILVA BRAZIL:/home/f944082:/bin/bash
2026-06-08T14:00:23.5185452Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f605694:x:10605694:30000004:SIDICLEY BARTOLOMEU PEREIRA DE LIMA:/home/f605694:/bin/bash
2026-06-08T14:00:23.5185969Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f989032:x:10989032:30000004:WILDSON SANTOS ALVES DA SILVA:/home/f989032:/bin/bash
2026-06-08T14:00:23.5186326Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f636940:x:10636940:30000004:ENDRIL CASTILHO DA SILVEIRA:/home/f636940:/bin/bash
2026-06-08T14:00:23.5186746Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f968490:x:10968490:30000004:MAURICIO CORREA:/home/f968490:/bin/bash
2026-06-08T14:00:23.5187114Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p795627:x:10795627:20001097:RAMMY OLIVEIRA MATIAS:/home/p795627:
2026-06-08T14:00:23.5187563Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f796290:x:10796290:30000004:CICERO VIEIRA DA SILVA:/home/f796290:/bin/bash
2026-06-08T14:00:23.5187955Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f635939:x:10635939:30000004:LUCAS BARRETO DE NOVAES:/home/f635939:/bin/bash
2026-06-08T14:00:23.5188302Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p592679:x:10592679:30000006:FRANCO MORALE JUNIOR:/home/p592679:/bin/bash
2026-06-08T14:00:23.5188659Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f619381:x:10619381:30000004:ERIK RITCHELY BARCELOS DA SILVA:/home/f619381:/bin/bash
2026-06-08T14:00:23.5189060Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f597820:x:10597820:30000004:RUAN LUCAS SOARES DO NASCIMENTO:/home/f597820:/bin/bash
2026-06-08T14:00:23.5189486Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f686769:x:10686769:20001097:MARCUS VINICIUS NASCIMENTO SILVA:/home/f686769:/bin/bash
2026-06-08T14:00:23.5189981Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c099135:x:10099135:30000004:RICARDO GOMES BARBOSA:/home/c099135:/bin/bash
2026-06-08T14:00:23.5191186Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p972121:x:10972121:30000009:Nathan Alsan Alves de Aguiar:/home/p972121:/bin/bash
2026-06-08T14:00:23.5191625Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f558522:x:10558522:30000004:FERNANDO DE ABREU SILVA:/home/f558522:/bin/bash
2026-06-08T14:00:23.5191982Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f717790:x:10717790:30000004:WALKYRIA DA PENHA OLIVEIRA GARCIA:/home/f717790:/bin/bash
2026-06-08T14:00:23.5192338Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p719371:x:10719371:30000004:RAFAEL FERREIRA SAMPAIO:/home/p719371:/bin/bash
2026-06-08T14:00:23.5192765Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f768557:x:10768557:30000004:GUSTAVO DA SILVA:/home/f768557:/bin/bash
2026-06-08T14:00:23.5193158Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p618434:x:10618434:30000009:FABIANO LUCENA DA SILVA:/home/p618434:/bin/bash
2026-06-08T14:00:23.5193855Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p575562:x:10575562:20000000:DAYSE LUCIE ALVES FERREIRA:/home/p575562:/bin/bash
2026-06-08T14:00:23.5194205Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p751860:x:10751860:30000004:WILLIAN JOSE LIMA:/home/p751860:/bin/bash
2026-06-08T14:00:23.5195420Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f739956:x:10739956:30000004:ALEXANDRE KAZUO SATO:/home/f739956:/bin/bash
2026-06-08T14:00:23.5195782Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f710794:x:10710794:30000004:PAULO ALEXANDRE BORGES CORDEIRO:/home/f710794:/bin/bash
2026-06-08T14:00:23.5196914Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f647645:x:10647645:30000004:SAMUEL TERRA VIEIRA:/home/f647645:/bin/bash
2026-06-08T14:00:23.5197322Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c136157:x:10136157:20001097:WAGNER JAKUBAVICIUS FERREIRA:/home/c136157:
2026-06-08T14:00:23.5197664Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c075486:x:10075486:30000009:ALLAN OLIVEIRA TRISTAO:/home/c075486:/bin/bash
2026-06-08T14:00:23.5198014Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f708258:x:10708258:20001097:PATRIC KENNETH RIBEIRO SILVA:/home/f708258:
2026-06-08T14:00:23.5198463Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f943858:x:10943858:30000004:LUCIO ENEAS KUHL:/home/f943858:/bin/bash
2026-06-08T14:00:23.5198972Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f961475:x:10961475:20001097:MICHAEL RHYAN SILVA DE LIMA:/home/f961475:
2026-06-08T14:00:23.5199751Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f737394:x:10737394:30000004:MARCIO GABRIEL VAZ DE SOUZA:/home/f737394:/bin/bash
2026-06-08T14:00:23.5200340Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c137157:x:10137157:20001097:ANALICE DA COSTA OLIVEIRA ALVES:/home/c137157:
2026-06-08T14:00:23.5200944Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f761158:x:10761158:30000004:LUIS HENRIQUE FERRAREZI:/home/f761158:/bin/bash
2026-06-08T14:00:23.5201747Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c093691:x:10093691:20000000:SERGIO RAMPAZZO JUNIOR:/home/c093691:/bin/bash
2026-06-08T14:00:23.5202347Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f770800:x:10770800:30000004:TIAGO MARTINS BARRETO:/home/f770800:/bin/bash
2026-06-08T14:00:23.5203064Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c034483:x:10034483:20001097:KHERLHES MARQUES:/home/c034483:
2026-06-08T14:00:23.5203671Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c139932:x:10139932:30000004:REBECCA SIX ZAMAGNA:/home/c139932:/bin/bash
2026-06-08T14:00:23.5204254Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f793587:x:10793587:30000004:ANA PAULA NOGUEIRA CANOVA RUBINO:/home/f793587:/bin/bash
2026-06-08T14:00:23.5204847Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p573448:x:10573448:30000004:FLAVIO LONGUE GUIMARAES:/home/p573448:/bin/bash
2026-06-08T14:00:23.5205528Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p691436:x:10691436:30000004:ROGER EDGARD MALTA:/home/p691436:/bin/bash
2026-06-08T14:00:23.5206244Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p968005:x:10968005:30000004:JUDSON DE ABREU FILGUEIRA:/home/p968005:/bin/bash
2026-06-08T14:00:23.5207208Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c091242:x:10091242:30000004:LEONARDO KAKAZU:/home/c091242:/bin/bash
2026-06-08T14:00:23.5207793Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f761342:x:10761342:30000004:FELIPE CORREA SILVA:/home/f761342:/bin/bash
2026-06-08T14:00:23.5208356Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c140030:x:10140030:20001097:RONALDO CANDIDO DE OLIVEIRA:/home/c140030:
2026-06-08T14:00:23.5208912Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f761146:x:10761146:30000004:NELSON NUNES ANDRE JUNIOR:/home/f761146:/bin/bash
2026-06-08T14:00:23.5209413Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f756678:x:10756678:30000004:WELLEN DOS SANTOS COUTO:/home/f756678:/bin/bash
2026-06-08T14:00:23.5209965Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f996445:x:10996445:30000004:LEANDERSON COELHO DOS SANTOS:/home/f996445:/bin/bash
2026-06-08T14:00:23.5210668Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f995608:x:10995608:30000004:ROMULO PEREIRA DANTAS FERREIRA:/home/f995608:/bin/bash
2026-06-08T14:00:23.5211201Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f759133:x:10759133:20001097:LINDENBERG CARNEIRO ROSENO:/home/f759133:
2026-06-08T14:00:23.5211700Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p768958:x:10768958:30000009:GLEISON GONCALVES JORDAO:/home/p768958:/bin/bash
2026-06-08T14:00:23.5212074Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p945127:x:10945127:30000009:ISABELLA CRISTINE VASCONCELOS:/home/p945127:/bin/bash
2026-06-08T14:00:23.5212435Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f650582:x:10650582:30000004:LEANDRO DE SOUZA FERREIRA:/home/f650582:/bin/bash
2026-06-08T14:00:23.5212906Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c027287:x:10027287:20000000:VALTER EIITI TAKATA:/home/c027287:/bin/bash
2026-06-08T14:00:23.5213252Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c069754:x:10069754:30000004:MARISA REIS BEZERRA:/home/c069754:/bin/bash
2026-06-08T14:00:23.5213596Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p796189:x:10796189:30000004:CLAYTON ROBERTO LEITE:/home/p796189:
2026-06-08T14:00:23.5216338Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p796405:x:10796405:20001097:RICARDO PEREIRA RODRIGUES:/home/p796405:
2026-06-08T14:00:23.5216712Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f904353:x:10904353:30000004:MATHEUS VIEIRA DA SILVA SANTOS:/home/f904353:/bin/bash
2026-06-08T14:00:23.5217075Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p758637:x:10758637:30000004:JEOVAH DE SOUZA SENA JUNIOR:/home/p758637:/bin/bash
2026-06-08T14:00:23.5217443Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f622656:x:10622656:30000004:GABRIEL AUGUSTO DOS SANTOS LIMA:/home/f622656:/bin/bash
2026-06-08T14:00:23.5217797Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f608020:x:10608020:20001050:BRUNO RONET GONCALVES:/home/f608020:/bin/bash
2026-06-08T14:00:23.5218140Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p660199:x:10660199:30000004:FABIO KOITI NAKAZA:/home/p660199:/bin/bash
2026-06-08T14:00:23.5218494Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f655232:x:10655232:30000004:MATHEUS RICARDO LUIZ PEREIRA:/home/f655232:/bin/bash
2026-06-08T14:00:23.5218894Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c141927:x:10141927:30000009:VILSON ARAUJO DE FREITAS:/home/c141927:/bin/bash
2026-06-08T14:00:23.5219402Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c128161:x:10128161:30000009:ULYSSES GUSTAVO MARTINS LIMA:/home/c128161:/bin/bash
2026-06-08T14:00:23.5219936Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f701414:x:10701414:20001097:FELIPE CAVALCANTE DE ANDRADE:/home/f701414:
2026-06-08T14:00:23.5220298Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f600806:x:10600806:30000004:RODRIGO LEONARDO PERES MELCHIOR:/home/f600806:/bin/bash
2026-06-08T14:00:23.5220811Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a083805:x:10083805:20001108:FLAVIO DE ALMEIDA GAGLIARDI:/home/c083805:
2026-06-08T14:00:23.5221300Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c073227:x:10073227:20001097:ATHALIBA DIAS MACIEL DAVILA:/home/c073227:
2026-06-08T14:00:23.5221928Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f729772:x:10729772:30000004:THUANY CANDIDA DE MENDONCA:/home/f729772:/bin/bash
2026-06-08T14:00:23.5222456Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p780480:x:10780480:30000009:Filiphe Soares de Andrade:/home/p780480:/bin/bash
2026-06-08T14:00:23.5223152Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f737072:x:10737072:30000004:EFRAIM TENORIO OLIMPIO DA SILVA:/home/f737072:/bin/bash
2026-06-08T14:00:23.5223711Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f647514:x:10647514:30000004:NYK MATTHEUS CASSEANO ANDRADE:/home/f647514:/bin/bash
2026-06-08T14:00:23.5224097Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f667998:x:10667998:30000004:FILIPE NASCIMENTO DA COSTA SILVA:/home/f667998:/bin/bash
2026-06-08T14:00:23.5224451Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c114376:x:10114376:30000009:OCTAVIO UCHOA CORDEIRO:/home/c114376:/bin/bash
2026-06-08T14:00:23.5225398Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f646347:x:10646347:30000004:VINICIUS BALTAZAR BARROS SANTOS:/home/f646347:/bin/bash
2026-06-08T14:00:23.5225775Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c133886:x:10133886:30000004:LUCILENE APARECIDA FEDALTO:/home/c133886:/bin/bash
2026-06-08T14:00:23.5226334Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c149842:x:10149842:20000000:WILLIAM EDY NOGUEIRA PATRICIO:/home/c149842:
2026-06-08T14:00:23.5226790Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f596348:x:10596348:20000000:SHEILA SILVA OLIVEIRA:/home/f596348:/bin/bash
2026-06-08T14:00:23.5227523Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f723523:x:10723523:20000000:ANDRE LUIZ MONDINI:/home/f723523:/bin/bash
2026-06-08T14:00:23.5228805Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f956616:x:10956616:20000000:RENILSON PICININ:/home/f956616:/bin/bash
2026-06-08T14:00:23.5229597Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c056257:x:10056257:20000000:PAULO CEZAR SARMENTO DE MORAES:/home/c056257:/bin/bash
2026-06-08T14:00:23.5230014Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c117813:x:10117813:20000000:DAVID JEIEL DE ARAUJO ROCHA:/home/c117813:
2026-06-08T14:00:23.5230797Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c070521:x:10070521:20000000:JULIO CESAR SILVA RODRIGUES:/home/c070521:/bin/bash
2026-06-08T14:00:23.5231160Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f665908:x:10665908:20000000:BRUNO HENRIQUE SILVA CONTENTE:/home/f665908:
2026-06-08T14:00:23.5233637Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c080042:x:10080042:20000000:FLAVIO JUNIOR CARLOS NUNES:/home/c080042:
2026-06-08T14:00:23.5234019Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c101476:x:10101476:20000000:MARGARETH MOSCARDINI DE OLIVEIRA:/home/c101476:/bin/bash
2026-06-08T14:00:23.5234372Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f667291:x:10667291:20001148:MATEUS DE SOUZA CARNEIRO:/home/f667291:
2026-06-08T14:00:23.5234720Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f981673:x:10981673:20000000:ANDERSON BELO DE MOURA:/home/f981673:/bin/bash
2026-06-08T14:00:23.5235087Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f949792:x:10949792:20000000:MARCELO AUGUSTO MUNIZ TEIXEIRA:/home/f949792:/bin/bash
2026-06-08T14:00:23.5235466Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c127100:x:10127100:20000000:ELSON MASSAHAKI OKA:/home/c127100:/bin/bash
2026-06-08T14:00:23.5235973Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f796444:x:10796444:20000000:GUTEMBERGUE DA SILVA LIMA:/home/f796444:
2026-06-08T14:00:23.5236315Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f590599:x:10590599:20000000:JEFFERSON VIEIRA ALVES:/home/f590599:
2026-06-08T14:00:23.5236851Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f912394:x:10912394:20000000:JULIANO ROBERTO BATALHA DA SILVA:/home/f912394:
2026-06-08T14:00:23.5237313Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f580967:x:10580967:20000000:JULIANA DE CARVALHO FERNANDES:/home/f580967:
2026-06-08T14:00:23.5237755Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c066190:x:10066190:20000000:DANILLO MULATI BITTENCOURT:/home/c066190:/bin/bash
2026-06-08T14:00:23.5238452Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p772799:x:10772799:20000000:LEANDRO VIEIRA BORGES DA ROCHA LOPES:/home/p772799:/bin/bash
2026-06-08T14:00:23.5242620Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a075694:x:10075694:30000001:Herica Helisa Silva dos Santos:/home/a075694:
2026-06-08T14:00:23.5243216Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f569498:x:10569498:20000000:YASMIN DO CARMO COSTA:/home/f569498:
2026-06-08T14:00:23.5243759Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c096984:x:10096984:20000000:ITALO GALDINO DOS SANTOS:/home/c096984:/bin/bash
2026-06-08T14:00:23.5244491Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f995423:x:10995423:20000000:JULIANA DOMINGUES DE SOUZA ALVES:/home/f995423:
2026-06-08T14:00:23.5244849Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p744791:x:10744791:20000000:EDUARDO CRESSONI:/home/p744791:/bin/bash
2026-06-08T14:00:23.5245322Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f571688:x:10571688:20000000:MARCIO FERNANDO LA PUMA:/home/f571688:/bin/bash
2026-06-08T14:00:23.5245829Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p983189:x:10983189:20000000:ODIRLEI ARAUJO DE AGUIAR:/home/p983189:/bin/bash
2026-06-08T14:00:23.5246376Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c052996:x:10052996:20000000:MARCEL FIGUEIREDO ROCHA:/home/c052996:/bin/bash
2026-06-08T14:00:23.5246908Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f592789:x:10592789:20000000:RICARDO KALE PIMENTEL:/home/f592789:/bin/bash
2026-06-08T14:00:23.5247270Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p789224:x:10789224:20001004:RENATO CORREIA CUNHA:/home/p789224:/bin/bash
2026-06-08T14:00:23.5247631Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p936652:x:10936652:20000000:ROBSON BATISTA DA COSTA:/home/p936652:/bin/bash
2026-06-08T14:00:23.5247993Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f572045:x:10572045:20001097:Marcos Anthero da Silva:/home/f572045:/bin/bash
2026-06-08T14:00:23.5248333Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f732798:x:10732798:20000000:MARCOS COIMBRA OSORIO:/home/f732798:
2026-06-08T14:00:23.5248710Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f666866:x:10666866:20001093:ALEXANDER RENAULT DE SOUZA SILVA:/home/f666866:
2026-06-08T14:00:23.5249245Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f769818:x:10769818:20001097:RAPHAEL HERNANDES GUIMENES:/home/f769818:/bin/bash
2026-06-08T14:00:23.5249601Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f640391:x:10640391:20000000:ROGERIO MARTINS DE SANTANA:/home/f640391:
2026-06-08T14:00:23.5250064Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p697626:x:10697626:20000000:JHONATAN PEREIRA BATISTA:/home/p697626:/bin/bash
2026-06-08T14:00:23.5250410Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p645610:x:10645610:20000000:FABIO SHINDY KUAMOTO:/home/p645610:
2026-06-08T14:00:23.5253589Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c148673:x:10148673:20000000:WELLINGTON STANLEY DA SILVA SOUSA:/home/c148673:/bin/bash
2026-06-08T14:00:23.5253961Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f996225:x:10996225:20000000:BRUNO KINGMA CLEMENTE:/home/f996225:/bin/bash
2026-06-08T14:00:23.5254309Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a052927:x:10052927:30000001:RODRIGO PERES PAIVA LACERDA:/home/a052927:/bin/bash
2026-06-08T14:00:23.5254659Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f602349:x:10602349:20000000:LINCOLN CAETANO DIAS:/home/f602349:/bin/bash
2026-06-08T14:00:23.5255003Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f606540:x:10606540:20001097:RENAN APARECIDO GOMES:/home/f606540:/bin/bash
2026-06-08T14:00:23.5255342Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f606636:x:10606636:20000000:LUIZ CLAUDIO REZENDE ALCENO:/home/f606636:
2026-06-08T14:00:23.5255690Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f988153:x:10988153:20000000:THIAGO FARINA DE SOUSA:/home/f988153:/bin/bash
2026-06-08T14:00:23.5256120Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f795301:x:10795301:20001097:JEAN CARLOS ANTONIO SILVA:/home/f795301:/bin/bash
2026-06-08T14:00:23.5256472Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c151557:x:10151557:20000000:DANIEL TEIXEIRA DE OLIVEIRA:/home/c151557:/bin/bash
2026-06-08T14:00:23.5256977Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f685665:x:10685665:20000000:ERIKA SILVA DANTAS DE OLIVEIRA:/home/f685665:
2026-06-08T14:00:23.5257497Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f904167:x:10904167:20000000:MARCOS AURELIO NOBRE CARDOSO:/home/f904167:
2026-06-08T14:00:23.5258013Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f726282:x:10726282:20001097:Kris Labriola Piccione:/home/f726282:
2026-06-08T14:00:23.5258501Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f680079:x:10680079:20000000:CARLOS JULIO FERREIRA ALFERES:/home/f680079:/bin/bash
2026-06-08T14:00:23.5258860Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p679398:x:10679398:20000000:CARLOS AUGUSTO SILVA SANTIAGO:/home/p679398:
2026-06-08T14:00:23.5265297Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c333430:x:10333430:20000000:HELIO YASSUNORI IWAMOTO:/home/c333430:
2026-06-08T14:00:23.5265919Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c068732:x:10068732:20000000:CARLOS FABIANO SANTOS ANDREOLI:/home/c068732:/bin/bash
2026-06-08T14:00:23.5266494Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f557517:x:10557517:20000000:SYLMARA THOMAZ LOPES:/home/f557517:/bin/bash
2026-06-08T14:00:23.5267032Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p680416:x:10680416:30000009:FELIPE DE OLIVEIRA ROCHA:/home/p680416:
2026-06-08T14:00:23.5267571Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c124414:x:10124414:20000000:ANDRE RICARDO SANTOS SILVEIRA:/home/c124414:/bin/bash
2026-06-08T14:00:23.5268096Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f667693:x:10667693:20000000:JOHN HERBETH MADEIRA GOMES:/home/f667693:/bin/bash
2026-06-08T14:00:23.5268825Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f618174:x:10618174:20000000:EDUARDO PINHEIRO BRANDAO:/home/f618174:/bin/bash
2026-06-08T14:00:23.5269400Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f635896:x:10635896:20000000:PHILIPPE TADEU DE CARVALHO:/home/f635896:
2026-06-08T14:00:23.5269955Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c103841:x:10103841:20000000:CARLOS ALBERTO DOS SANTOS:/home/c103841:
2026-06-08T14:00:23.5270477Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c148183:x:10148183:20000000:ROBSON VENTURIN:/home/c148183:/bin/bash
2026-06-08T14:00:23.5271008Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f794629:x:10794629:20000000:DANIEL GALDINO SANTANA:/home/f794629:
2026-06-08T14:00:23.5271547Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f657298:x:10657298:20000000:JADSON PAMPLONA VIANA:/home/f657298:/bin/bash
2026-06-08T14:00:23.5272095Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p979414:x:10979414:20000000:DIOGO CAMPOS DE CARVALHO:/home/p979414:/bin/bash
2026-06-08T14:00:23.5272770Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p785324:x:10785324:20000000:WESLEY DE SOUSA:/home/p785324:/bin/bash
2026-06-08T14:00:23.5273352Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p603647:x:10603647:20000000:OTAVIO BATISTA MONTEIRO:/home/p603647:/bin/bash
2026-06-08T14:00:23.5274017Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p563742:x:10563742:20000000:CALEBE ANGELO ROCHA DE SOUZA:/home/p563742:
2026-06-08T14:00:23.5274554Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f624264:x:10624264:20000000:ODERLEI ANDERSON DE PAULA:/home/f624264:/bin/bash
2026-06-08T14:00:23.5275090Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c100401:x:10100401:20000000:DIEGO CASTILHO IMENES:/home/c100401:
2026-06-08T14:00:23.5275614Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f572539:x:10572539:20001097:Lucas Noronha Vitor:/home/f572539:
2026-06-08T14:00:23.5276186Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c122374:x:10122374:20000000:TIAGO ANDRADE BRAGA:/home/c122374:/bin/bash
2026-06-08T14:00:23.5276772Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f686199:x:10686199:20000000:THIAGO DE MORAES PIFFER:/home/f686199:/bin/bash
2026-06-08T14:00:23.5277368Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f516198:x:10516198:20000000:SERGIO HENRIQUE WEBER QUEIROZ:/home/f516198:/bin/bash
2026-06-08T14:00:23.5277967Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f956834:x:10956834:20000000:VITORIA MATTOS SILVA NETA:/home/f956834:/bin/bash
2026-06-08T14:00:23.5278577Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f558920:x:10558920:20001097:Bruna Barreto Nunes Rosa:/home/f558920:
2026-06-08T14:00:23.5279167Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c116256:x:10116256:20000000:DAVID BITTENCOURT PIRES:/home/c116256:/bin/bash
2026-06-08T14:00:23.5279750Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f685108:x:10685108:20000000:CRISTIANO RICARDO LIMA COSTA:/home/f685108:
2026-06-08T14:00:23.5280309Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f759217:x:10759217:20000000:WELLINGTON ARAUNA DE ASEVEDO:/home/f759217:/bin/bash
2026-06-08T14:00:23.5280853Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c086414:x:10086414:30000872:Vitor da Silva Gusmao:/home/c086414:/bin/bash
2026-06-08T14:00:23.5281694Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c077508:x:10077508:20000000:MARCELO AUGUSTO NEME HERVAS:/home/c077508:
2026-06-08T14:00:23.5282384Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f731749:x:10731749:20000000:FABIO PEREIRA SIQUEIRA:/home/f731749:/bin/bash
2026-06-08T14:00:23.5283126Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c136582:x:10136582:20000000:LAURENCE VIEIRA ESCOBAR:/home/c136582:/bin/bash
2026-06-08T14:00:23.5283723Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c081512:x:10081512:20000000:JEAN SANCHES BINO:/home/c081512:/bin/bash
2026-06-08T14:00:23.5284340Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p784378:x:10784378:20000000:JULIO CESAR NASCIMENTO DE ALBUQUERQUE:/home/p784378:/bin/bash
2026-06-08T14:00:23.5284923Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f777492:x:10777492:20000000:JOSE FABRICIO MENEZES DOS SANTOS:/home/f777492:
2026-06-08T14:00:23.5285641Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p738925:x:10738925:20000000:JOHNATAN DOTTO ARIOTTI:/home/p738925:/bin/bash
2026-06-08T14:00:23.5286417Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p518900:x:10518900:20000000:DIEGO DA SILVA LIMA:/home/p518900:/bin/bash
2026-06-08T14:00:23.5287002Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f635279:x:10635279:20000000:DANIEL BITTENCOURT GOUVEA:/home/f635279:/bin/bash
2026-06-08T14:00:23.5287733Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f790312:x:10790312:20000000:JULIANO DE AGUIAR BISPO:/home/f790312:/bin/bash
2026-06-08T14:00:23.5288326Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c099406:x:10099406:20000000:NATHALY DE JESUS ALEXANDRINO:/home/c099406:/bin/bash
2026-06-08T14:00:23.5288913Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f966348:x:10966348:20000000:JOAQUIM AURELIO CREMA:/home/f966348:/bin/bash
2026-06-08T14:00:23.5289465Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f664024:x:10664024:20000000:RODRIGO BARRETO DA FONSECA:/home/f664024:
2026-06-08T14:00:23.5290016Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p696035:x:10696035:20000000:RODRIGO ALVES JACOME FILHO:/home/p696035:/bin/bash
2026-06-08T14:00:23.5290575Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f756891:x:10756891:20000000:JESSICA PABLINE DA SILVA:/home/f756891:/bin/bash
2026-06-08T14:00:23.5291115Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c073955:x:10073955:20000000:ISIS SOUSA LIMA:/home/c073955:/bin/bash
2026-06-08T14:00:23.5291788Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f531247:x:10531247:20001097:Arthur Vinicius Neri Mendes:/home/f531247:/bin/bash
2026-06-08T14:00:23.5292459Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c147804:x:10147804:20000000:MARCOS GONCALVES JUNIOR:/home/c147804:/bin/bash
2026-06-08T14:00:23.5293239Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f703034:x:10703034:20000000:ANDRESSA LOPES RIBEIRO:/home/f703034:/bin/bash
2026-06-08T14:00:23.5293773Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c033086:x:10033086:20000000:LEONARDO TADEU DE PAULA:/home/c033086:
2026-06-08T14:00:23.5294328Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f658514:x:10658514:20000000:RENE NUNES DOS SANTOS FILHO:/home/f658514:/bin/bash
2026-06-08T14:00:23.5294882Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f515565:x:10515565:20000000:RAFAEL HENRIQUE RODRIGUES SILVA:/home/f515565:/bin/bash
2026-06-08T14:00:23.5295596Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c124404:x:10124404:20000000:JULIO ANTONIO PEREIRA BASTOS:/home/c124404:/bin/bash
2026-06-08T14:00:23.5296132Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c111482:x:10111482:20000000:DANIELA SANTOS:/home/c111482:
2026-06-08T14:00:23.5296678Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c080143:x:10080143:20001097:Rodney Alves Feitosa:/home/c080143:/bin/bash
2026-06-08T14:00:23.5297246Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c152826:x:10152826:20000000:FABIANO MOREIRA DE PINHO:/home/c152826:/bin/bash
2026-06-08T14:00:23.5297834Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f609493:x:10609493:20000000:PAULO ROBERTO DE SOUZA ROCHA:/home/f609493:/bin/bash
2026-06-08T14:00:23.5298438Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p513951:x:10513951:20000000:JOAO VITOR SILVA SANTOS:/home/p513951:/bin/bash
2026-06-08T14:00:23.5298999Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c129779:x:10129779:20000000:MARCIO JORDAO DE SOUSA:/home/c129779:
2026-06-08T14:00:23.5299585Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f573864:x:10573864:20000000:DANILO CARDOSO LESSA:/home/f573864:/bin/bash
2026-06-08T14:00:23.5300147Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f633164:x:10633164:20000000:WAGNER DE OLIVEIRA PEQUENO JUNIOR:/home/f633164:
2026-06-08T14:00:23.5300791Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f518940:x:10518940:20000000:ELAINE CRISTINA CRUZ DE JESUS:/home/f518940:
2026-06-08T14:00:23.5301301Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c066268:x:10066268:20000000:GABRIEL PEREIRA LYRA MILLIAN:/home/c066268:
2026-06-08T14:00:23.5301842Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f956768:x:10956768:20000000:RENAN ARGUELHO CHAPARRO:/home/f956768:/bin/bash
2026-06-08T14:00:23.5302374Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a113766:x:10113766:30000001:KELLITON PABLO CARDOSO MENDES:/home/a113766:/bin/bash
2026-06-08T14:00:23.5303069Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a126555:x:10126555:30000001:MARCELO BASTOS PETRELLI:/home/a126555:
2026-06-08T14:00:23.5303623Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a134169:x:10134169:30000001:DANIEL CRISTOFE FELIX DA SILVA:/home/a134169:/bin/bash
2026-06-08T14:00:23.5304214Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a137156:x:10137156:30000001:WENDERSON JOSE DE OLIVEIRA SAMPAIO:/home/a137156:/bin/bash
2026-06-08T14:00:23.5304761Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a145100:x:10145100:30000001:JANILDO ALVES DA COSTA:/home/a145100:
2026-06-08T14:00:23.5305320Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f649667:x:10649667:20000000:RUAN ALVES FERREIRA DE BESSA:/home/f649667:/bin/bash
2026-06-08T14:00:23.5305880Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a069920:x:10069920:30000001:LUIS FERNANDO ALVES DE LIMA:/home/a069920:/bin/bash
2026-06-08T14:00:23.5306430Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c081118:x:10081118:20000000:GABRIEL DE CASTRO ABRANTES FERRAO:/home/c081118:
2026-06-08T14:00:23.5306943Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f609374:x:10609374:20000000:ALEXSANDRO GONCALVES MENDES:/home/f609374:
2026-06-08T14:00:23.5310578Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f781578:x:10781578:20000000:PAULO CESAR SOUSA DOS SANTOS JUNIOR:/home/f781578:
2026-06-08T14:00:23.5311377Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p559971:x:10559971:30000004:JONAS RODRIGUES DA ROSA:/home/p559971:
2026-06-08T14:00:23.5311904Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c081510:x:10081510:20000000:RAFAEL DE SOUZA BONETTI:/home/c081510:
2026-06-08T14:00:23.5312439Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c146577:x:10146577:20000000:RAPHAEL ARAUJO BENTES:/home/c146577:/bin/bash
2026-06-08T14:00:23.5313227Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p554059:x:10554059:20000000:DENIO PEREIRA DA ROCHA:/home/p554059:/bin/bash
2026-06-08T14:00:23.5313797Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a151305:x:10151305:30000001:LUCAS VINICIUS DE ALMEIDA SANTOS:/home/a151305:/bin/bash
2026-06-08T14:00:23.5314357Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p573455:x:10573455:20000000:RODRIGO DA SILVA MORAES:/home/p573455:/bin/bash
2026-06-08T14:00:23.5314898Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f647992:x:10647992:20000000:GABRIEL TARANTELLI CRESTANI:/home/f647992:/bin/bash
2026-06-08T14:00:23.5315434Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p720996:x:10720996:20000000:ROBERTO DE LIMA SALIMENA:/home/p720996:/bin/bash
2026-06-08T14:00:23.5316113Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c111340:x:10111340:20000000:EDGAR TAKASHI MAKI:/home/c111340:
2026-06-08T14:00:23.5316820Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f933836:x:10933836:20000000:MILENE PEREIRA GONCALVES:/home/f933836:
2026-06-08T14:00:23.5317377Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f994266:x:10994266:20000000:REBECA CRISTIANE OLIVEIRA DO NASCIMENTO:/home/f994266:
2026-06-08T14:00:23.5317968Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f668401:x:10668401:20000000:GUILHERME DA FONSECA BITES:/home/f668401:
2026-06-08T14:00:23.5318543Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f785520:x:10785520:20000000:DAYANA LUCIA NUNES ESTEVES BORGES:/home/f785520:/bin/bash
2026-06-08T14:00:23.5319148Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f542952:x:10542952:20000000:ANDRE LUIZ MENDES FRANCISCO:/home/f542952:/bin/bash
2026-06-08T14:00:23.5319668Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f672682:x:10672682:20000000:JACSON CRISTIANO DOS SANTOS:/home/f672682:
2026-06-08T14:00:23.5320207Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f569166:x:10569166:20000000:TIAGO SILVA ASSUMPCAO DE QUEIROZ:/home/f569166:
2026-06-08T14:00:23.5320767Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p703653:x:10703653:20000000:RICHARD ROVIGATI:/home/p703653:/bin/bash
2026-06-08T14:00:23.5321302Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f649041:x:10649041:20000000:ELTON RAFAEL VIEIRA DA SILVA MELO:/home/f649041:/bin/bash
2026-06-08T14:00:23.5321830Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c119835:x:10119835:20000000:EVANDRO GOMES DA SILVA:/home/c119835:/bin/bash
2026-06-08T14:00:23.5322404Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f979043:x:10979043:20000000:RAFAEL THOMASE CONCEICAO DO NASCIMENTO:/home/f979043:
2026-06-08T14:00:23.5323149Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c062702:x:10062702:20000000:JOSE ELI DE GODOI:/home/c062702:
2026-06-08T14:00:23.5323732Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f513372:x:10513372:20000000:MAICON MARTINS ANDRADE:/home/f513372:/bin/bash
2026-06-08T14:00:23.5324457Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p998667:x:10998667:20000000:JULIANA ALVIM JUSWIAK:/home/p998667:
2026-06-08T14:00:23.5325049Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f932309:x:10932309:20000000:CESIO MALTA MAGALHAES:/home/f932309:/bin/bash
2026-06-08T14:00:23.5325604Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c059459:x:10059459:20000000:DANIELA MACHADO RIBEIRO:/home/c059459:
2026-06-08T14:00:23.5326147Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p516622:x:10516622:20000000:IGOR PORTELLA PEREIRA LOPES:/home/p516622:/bin/bash
2026-06-08T14:00:23.5326684Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f731607:x:10731607:20000000:MARCIO APARECIDO SITONI:/home/f731607:/bin/bash
2026-06-08T14:00:23.5327241Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p963295:x:10963295:20000000:BRUNO GRAVE DE BRITTO:/home/p963295:
2026-06-08T14:00:23.5327777Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f516629:x:10516629:20000000:SERGIO GOMES DA SILVA FILHO:/home/f516629:
2026-06-08T14:00:23.5328337Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f761339:x:10761339:20000000:ADRIANO BISPO DOS SANTOS:/home/f761339:/bin/bash
2026-06-08T14:00:23.5329036Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f714927:x:10714927:20000000:MARCUS VINICIUS RANGEL RAMOS:/home/f714927:
2026-06-08T14:00:23.5329891Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f617016:x:10617016:20000000:CARLOS SANTIAGO ANDRES CARCELEN CORNEJO:/home/f617016:/bin/bash
2026-06-08T14:00:23.5330474Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c066314:x:10066314:20000000:MARCELO CESAR PANUNTO:/home/c066314:
2026-06-08T14:00:23.5331031Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p758485:x:10758485:20000000:PAULO HUTTERER JUNIOR:/home/p758485:/bin/bash
2026-06-08T14:00:23.5331560Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f516709:x:10516709:20000000:FABIO MUSSUMECI PEREZ:/home/f516709:/bin/bash
2026-06-08T14:00:23.5332085Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f909672:x:10909672:20000000:THIAGO DA SILVA MACEDO:/home/f909672:/bin/bash
2026-06-08T14:00:23.5332765Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f535711:x:10535711:20000000:LUIS FERNANDO SILVA DE OLIVEIRA:/home/f535711:
2026-06-08T14:00:23.5333312Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f744537:x:10744537:20000000:JAQUELINE KENNEDY ALVES SOARES:/home/f744537:/bin/bash
2026-06-08T14:00:23.5333859Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c153036:x:10153036:20000000:ALEXANDRE PERLINGEIRO REGULA:/home/c153036:/bin/bash
2026-06-08T14:00:23.5334491Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c140491:x:10140491:20000000:BRUNA TEODORO DE AMORIM BORGES:/home/c140491:
2026-06-08T14:00:23.5335082Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f950563:x:10950563:20000000:MARCIO ALEXANDRE SILVA MONTEIRO:/home/f950563:/bin/bash
2026-06-08T14:00:23.5335708Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c123530:x:10123530:20000000:ROBERTO MORITO KATAYAMA JUNIOR:/home/c123530:
2026-06-08T14:00:23.5336273Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p794795:x:10794795:20000000:MATHEUS GOMES DA SILVA:/home/p794795:/bin/bash
2026-06-08T14:00:23.5337015Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f979052:x:10979052:20000000:FELIPE DE LIMA COSTA:/home/f979052:/bin/bash
2026-06-08T14:00:23.5337910Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f756828:x:10756828:20000000:FABRICIO VILLELA ANDRADE:/home/f756828:/bin/bash
2026-06-08T14:00:23.5338488Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f639066:x:10639066:20000000:HAMILTON FRANCISCO DOS SANTOS JUNIOR:/home/f639066:
2026-06-08T14:00:23.5339109Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p692791:x:10692791:20000000:JEFFERSON FERREIRA DO NASCIMENTO:/home/p692791:/bin/bash
2026-06-08T14:00:23.5339867Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f761491:x:10761491:20000000:MAURO LUIZ XAVIER DE AMORIM:/home/f761491:/bin/bash
2026-06-08T14:00:23.5340465Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f679935:x:10679935:20000000:FABIO LUCIANO GOES DOS SANTOS:/home/f679935:/bin/bash
2026-06-08T14:00:23.5340986Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f690097:x:10690097:20000000:ANTONIO JOSE DOS SANTOS MELAO:/home/f690097:/bin/bash
2026-06-08T14:00:23.5341476Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p540659:x:10540659:20000000:FABIANO ALCANTARA DE LIMA:/home/p540659:/bin/bash
2026-06-08T14:00:23.5342012Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f761706:x:10761706:20000000:CAIO FREITAS FERREIRA DE LIMA:/home/f761706:/bin/bash
2026-06-08T14:00:23.5342519Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f516122:x:10516122:20000000:CARLOS BRUNO GONCALVES BRITO:/home/f516122:/bin/bash
2026-06-08T14:00:23.5343018Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c073767:x:10073767:20000000:LEONARDO RODRIGUES:/home/c073767:
2026-06-08T14:00:23.5343374Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f569988:x:10569988:20000000:GUILHERME GUIMARAES:/home/f569988:/bin/bash
2026-06-08T14:00:23.5343728Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f727220:x:10727220:20000000:ANDRE GUILHERME SERAFIM:/home/f727220:/bin/bash
2026-06-08T14:00:23.5344114Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f506365:x:10506365:20000000:WEVERTON DA SILVA TAVARES DOS SANTOS:/home/f506365:/bin/bash
2026-06-08T14:00:23.5344481Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f550048:x:10550048:20000000:ADRIAN NEGREIROS DE SOUZA SILVA:/home/f550048:/bin/bash
2026-06-08T14:00:23.5344833Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f651940:x:10651940:20000000:ERALDO JOSE DA SILVA:/home/f651940:
2026-06-08T14:00:23.5345258Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f574031:x:10574031:20000000:TATIANE ISMAEL TEIXEIRA CARDOSO:/home/f574031:/bin/bash
2026-06-08T14:00:23.5345636Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f608380:x:10608380:20000000:JEFFERSON FABRICIO FERREIRA DO NASCIMENT:/home/f608380:/bin/bash
2026-06-08T14:00:23.5345991Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f637618:x:10637618:20000000:MAURICE AINON:/home/f637618:/bin/bash
2026-06-08T14:00:23.5346340Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f520792:x:10520792:20000000:TEOGENES RODRIGO E SILVA:/home/f520792:/bin/bash
2026-06-08T14:00:23.5346787Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a111834:x:10111834:30000001:ELANO FALCAO LIMA FILHO:/home/a111834:/bin/bash
2026-06-08T14:00:23.5347751Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f750716:x:10750716:20000000:RUAN MARCEL DE OLIVEIRA CAMPOS:/home/f750716:/bin/bash
2026-06-08T14:00:23.5348404Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f729378:x:10729378:20000000:ELISVALDO PEREIRA DOS SANTOS:/home/f729378:/bin/bash
2026-06-08T14:00:23.5348966Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c134159:x:10134159:20000000:LUIZ GUSTAVO ALVES DO PRADO:/home/c134159:/bin/bash
2026-06-08T14:00:23.5349538Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c056128:x:10056128:20000000:RONALDO MOREIRA FIRPO DE ANDRADE:/home/c056128:/bin/bash
2026-06-08T14:00:23.5350078Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c091451:x:10091451:20000000:ADYLLA DE OLIVEIRA TOTA:/home/c091451:
2026-06-08T14:00:23.5350587Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p745680:x:10745680:20000000:WILLINGTON CALDAS LIMA:/home/p745680:
2026-06-08T14:00:23.5351820Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p978186:x:10978186:20000000:VICTOR DE SIQUEIRA CABRAL:/home/p978186:
2026-06-08T14:00:23.5352668Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f633404:x:10633404:20001097:Leandro Mendes:/home/f633404:/bin/bash
2026-06-08T14:00:23.5353253Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f582723:x:10582723:20000000:LEANDRO TERRA DOS REIS:/home/f582723:
2026-06-08T14:00:23.5353825Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f769329:x:10769329:20000000:RICARDO CAMILLO PEREIRA:/home/f769329:
2026-06-08T14:00:23.5354571Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f616509:x:10616509:20000000:JORGE ROBERTO LOPES IZABEL:/home/f616509:/bin/bash
2026-06-08T14:00:23.5355140Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c070468:x:10070468:20000000:RENATO DOURADO DINIZ:/home/c070468:/bin/bash
2026-06-08T14:00:23.5355724Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f984425:x:10984425:20000000:MATHEUS FERREIRA COTA:/home/f984425:/bin/bash
2026-06-08T14:00:23.5356538Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f729758:x:10729758:20000000:RAFAEL DE JESUS MENDES:/home/f729758:/bin/bash
2026-06-08T14:00:23.5357124Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p581880:x:10581880:20000000:THIAGO BISPO DOS SANTOS:/home/p581880:
2026-06-08T14:00:23.5357705Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f580131:x:10580131:20000000:IVAN AMADO CARDOSO:/home/f580131:/bin/bash
2026-06-08T14:00:23.5358306Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f948893:x:10948893:20000000:MAURICIO ALEXANDRE TOSTA:/home/f948893:/bin/bash
2026-06-08T14:00:23.5358893Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c117753:x:10117753:20000000:RODRIGO GONCALVES DE MORAES SILVA:/home/c117753:
2026-06-08T14:00:23.5359431Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f748675:x:10748675:20000000:KLAYTON SILVA VASCONCELOS JUNIOR:/home/f748675:/bin/bash
2026-06-08T14:00:23.5360407Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f699618:x:10699618:20000000:ADILZA GRACIELE GONCALVES MATTOS:/home/f699618:
2026-06-08T14:00:23.5360966Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f566570:x:10566570:20000000:SABRINA SOUZA PASSOS CARNEIRO:/home/f566570:/bin/bash
2026-06-08T14:00:23.5361733Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f702273:x:10702273:20000000:ANA LUCIA MENDES DE SOUZA GOMES:/home/f702273:/bin/bash
2026-06-08T14:00:23.5362296Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f571795:x:10571795:20000000:BRUNO SOARES DE JESUS BATISTA:/home/f571795:/bin/bash
2026-06-08T14:00:23.5363191Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c072073:x:10072073:20000000:LIVIA PEREIRA OLIVEIRA SANTOS:/home/c072073:/bin/bash
2026-06-08T14:00:23.5363787Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f778515:x:10778515:20000000:TACIANA APARECIDA DOS SANTOS RAMOS:/home/f778515:
2026-06-08T14:00:23.5364371Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f733487:x:10733487:20000000:RONEY CARLOS DONATO CAMILO:/home/f733487:/bin/bash
2026-06-08T14:00:23.5364959Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c155579:x:10155579:20000000:ERCILIA MARIA GOMES MUXAGATA CONRADO:/home/c155579:/bin/bash
2026-06-08T14:00:23.5365527Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f732193:x:10732193:20000000:LUCAS ESTANISLAU ALVES DE LUCENA:/home/f732193:/bin/bash
2026-06-08T14:00:23.5366074Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f598227:x:10598227:20000000:JUCENY DO AMARAL SALES:/home/f598227:/bin/bash
2026-06-08T14:00:23.5366576Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c096210:x:10096210:20000000:RICARDO MONTEIRO RAMOS:/home/c096210:/bin/bash
2026-06-08T14:00:23.5367272Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f734254:x:10734254:20000000:ANDERSON DE OLIVEIRA BARBOSA:/home/f734254:/bin/bash
2026-06-08T14:00:23.5368012Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f908770:x:10908770:20000000:ADILSON SILVA SAMPAIO GONZAGA:/home/f908770:/bin/bash
2026-06-08T14:00:23.5368481Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f656153:x:10656153:20000000:JACQUES OLIVEIRA SANTOS:/home/f656153:/bin/bash
2026-06-08T14:00:23.5368919Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f761741:x:10761741:20000000:MARCUS VINICIUS SALVADOR:/home/f761741:/bin/bash
2026-06-08T14:00:23.5369743Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f704497:x:10704497:20000000:CARMEN LEILA DA COSTA TERRA DAS NEVES MA:/home/f704497:/bin/bash
2026-06-08T14:00:23.5370567Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f651870:x:10651870:20000000:NIVALDO ANTONIO RIBEIRO FILHO:/home/f651870:
2026-06-08T14:00:23.5371124Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f523344:x:10523344:20000000:LUIS AGLICIO PEREIRA DE SOUZA JUNIOR:/home/f523344:/bin/bash
2026-06-08T14:00:23.5371651Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p948137:x:10948137:20000000:ERICK ADAM SOARES ARAUJO:/home/p948137:
2026-06-08T14:00:23.5372280Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f526848:x:10526848:20000000:JOSE MARCOS VILAS BOAS MORAES:/home/f526848:/bin/bash
2026-06-08T14:00:23.5373214Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f769771:x:10769771:20000000:GOETHE CARVALHO DO NASCIMENTO:/home/f769771:/bin/bash
2026-06-08T14:00:23.5373772Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f658434:x:10658434:20000000:ALAN BAPTISTA CALAZANS:/home/f658434:/bin/bash
2026-06-08T14:00:23.5374346Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f762193:x:10762193:20000000:CARLOS EDUARDO GARCIA DE OLIVEIRA:/home/f762193:/bin/bash
2026-06-08T14:00:23.5375190Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f537264:x:10537264:20000000:KELIA OLIVEIRA SILVA:/home/f537264:
2026-06-08T14:00:23.5375929Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f767276:x:10767276:20000000:EDILSON BENICIO DO VALE:/home/f767276:/bin/bash
2026-06-08T14:00:23.5376725Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f659207:x:10659207:20000000:RAFAEL RODRIGUES DE MARIZ:/home/f659207:/bin/bash
2026-06-08T14:00:23.5377356Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f778630:x:10778630:20000000:RAFAEL SALES DOS SANTOS:/home/f778630:/bin/bash
2026-06-08T14:00:23.5377882Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c144435:x:10144435:20000000:RENATA DE PAULA ZULATTO:/home/c144435:
2026-06-08T14:00:23.5378690Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f515556:x:10515556:20000000:JONATAS MATOS DE ALMEIDA JUNIOR:/home/f515556:/bin/bash
2026-06-08T14:00:23.5379235Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f527414:x:10527414:20000000:CLAUDIO FREIRE FRANCO:/home/f527414:/bin/bash
2026-06-08T14:00:23.5379767Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p759523:x:10759523:20000000:DAVID JAMES SOUZA DOS SANTOS:/home/p759523:/bin/bash
2026-06-08T14:00:23.5380284Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f727716:x:10727716:20000000:CLAUDIO DE CARVALHO:/home/f727716:
2026-06-08T14:00:23.5380815Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f527369:x:10527369:20000000:MARIO ROBERTO COSTA JUNIOR:/home/f527369:/bin/bash
2026-06-08T14:00:23.5381744Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c139204:x:10139204:20000000:MARIANA DE OLIVEIRA GALVAO:/home/c139204:/bin/bash
2026-06-08T14:00:23.5382354Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f690043:x:10690043:20000000:FAGNER CICERO DE SOUZA:/home/f690043:/bin/bash
2026-06-08T14:00:23.5383004Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f782195:x:10782195:20000000:CARLOS RENATO COUTINHO PINHEIRO:/home/f782195:/bin/bash
2026-06-08T14:00:23.5383570Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p743007:x:10743007:20000000:JOAO MARCOS SANTOS FERREIRA:/home/p743007:/bin/bash
2026-06-08T14:00:23.5384112Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c103527:x:10103527:20000000:RAFAEL AUGUSTO TANAAMI GALANTE:/home/c103527:
2026-06-08T14:00:23.5384651Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c127178:x:10127178:20000000:MILENA REGINA OLIVEIRA MIRANDA:/home/c127178:/bin/bash
2026-06-08T14:00:23.5385562Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f537127:x:10537127:20000000:CARLOS AUGUSTO RODRIGUES JUNIOR:/home/f537127:/bin/bash
2026-06-08T14:00:23.5386101Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f526934:x:10526934:20000000:ROGER JUNG TAKARA:/home/f526934:/bin/bash
2026-06-08T14:00:23.5388512Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f950842:x:10950842:20000000:PEDRO VUVU ALVARO:/home/f950842:/bin/bash
2026-06-08T14:00:23.5389075Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p534395:x:10534395:20000000:GLENDA FERREIRA FERNANDES:/home/p534395:/bin/bash
2026-06-08T14:00:23.5389616Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f958420:x:10958420:20000000:REINALDO GUILHERME DA SILVA:/home/f958420:/bin/bash
2026-06-08T14:00:23.5390162Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f520606:x:10520606:20000000:YAN DAMASCENO MAIA DE SOUZA:/home/f520606:/bin/bash
2026-06-08T14:00:23.5390699Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f532056:x:10532056:20000000:WILLIAN PIMENTA TAMASO:/home/f532056:/bin/bash
2026-06-08T14:00:23.5391244Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f537176:x:10537176:20000000:ALEX SANDRO OLIVEIRA MARQUES:/home/f537176:/bin/bash
2026-06-08T14:00:23.5391854Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f674584:x:10674584:20000000:MATHEUS CAVALCANTE DE OLIVEIRA:/home/f674584:
2026-06-08T14:00:23.5392373Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f660262:x:10660262:20000000:JOSE PORTELLA CONRADO LOPES:/home/f660262:/bin/bash
2026-06-08T14:00:23.5393002Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c082647:x:10082647:20000000:BERNARDO AUGUSTO DAL CORNO:/home/c082647:/bin/bash
2026-06-08T14:00:23.5393597Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a082368:x:10082368:30000001:GLEIDES MARILIA DOS SANTOS:/home/a082368:/bin/bash
2026-06-08T14:00:23.5394176Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a075694:x:10075694:30000001:HERICA HELISA SILVA DOS SANTOS:/home/a075694:/bin/bash
2026-06-08T14:00:23.5394753Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a535178:x:10535178:30000001:RAPHAEL RIBEIRO GOMES:/home/a535178:/bin/bash
2026-06-08T14:00:23.5397673Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f542402:x:10542402:20000000:CARLOS EDUARDO CARVALHO:/home/f542402:
2026-06-08T14:00:23.5398210Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f670457:x:10670457:20000000:RAFAEL SILVA GONCALVES:/home/f670457:/bin/bash
2026-06-08T14:00:23.5398716Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f524865:x:10524865:20000000:EDUARDO BRAGA:/home/f524865:/bin/bash
2026-06-08T14:00:23.5399319Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f721153:x:10721153:20000000:GILSON SEBASTIAO COELHO:/home/f721153:/bin/bash
2026-06-08T14:00:23.5399873Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f586291:x:10586291:20000000:BRENO RYAN DE OLIVEIRA LIMA:/home/f586291:/bin/bash
2026-06-08T14:00:23.5400425Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f730420:x:10730420:20000000:SAMUEL PEREIRA LIMA:/home/f730420:
2026-06-08T14:00:23.5400991Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p998463:x:10998463:20000000:GABRIEL CABRAL FERNANDES:/home/p998463:/bin/bash
2026-06-08T14:00:23.5401524Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c054284:x:10054284:20000000:CRISTIANE MOREIRA DO AMARAL LUZ:/home/c054284:
2026-06-08T14:00:23.5402051Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c145031:x:10145031:20000000:HUMBERTO CORCINO DA NOBREGA:/home/c145031:
2026-06-08T14:00:23.5402692Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c067242:x:10067242:20000000:HENRIQUE BAUER:/home/c067242:
2026-06-08T14:00:23.5403275Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f506388:x:10506388:20000000:MARCELO GRAVA:/home/f506388:/bin/bash
2026-06-08T14:00:23.5403892Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p615673:x:10615673:20000000:LUIS ANDRE VIANA ARAUJO DE ALENCAR:/home/p615673:/bin/bash
2026-06-08T14:00:23.5404499Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p562950:x:10562950:20000000:SAMUEL FERNANDES DA SILVEIRA JALES:/home/p562950:/bin/bash
2026-06-08T14:00:23.5404991Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f719452:x:10719452:20000000:AUGUSTO LOPES ALVES:/home/f719452:/bin/bash
2026-06-08T14:00:23.5405558Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p651873:x:10651873:20000000:ANTONIO JOAQUIM ANJO NETO:/home/p651873:/bin/bash
2026-06-08T14:00:23.5406139Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f901986:x:10901986:20000000:JONATA MATHEUS DE SOUZA BARBOSA:/home/f901986:/bin/bash
2026-06-08T14:00:23.5406732Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c081007:x:10081007:20000000:NARA ROSA BARROS RIOS:/home/c081007:/bin/bash
2026-06-08T14:00:23.5407240Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c089016:x:10089016:20000000:FERNANDA DALLA CORTE:/home/c089016:
2026-06-08T14:00:23.5407733Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f573353:x:10573353:20000000:MARCELO PEREIRA DA SILVA:/home/f573353:/bin/bash
2026-06-08T14:00:23.5408298Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f674501:x:10674501:20000000:JONATHAN DENIS RUFINO DA COSTA:/home/f674501:
2026-06-08T14:00:23.5408878Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f518768:x:10518768:20000000:FRANCISCO VIEIRA NETO:/home/f518768:/bin/bash
2026-06-08T14:00:23.5409453Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f914548:x:10914548:20000000:MARCELO GABRIEL:/home/f914548:/bin/bash
2026-06-08T14:00:23.5409986Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c129421:x:10129421:20000000:JOSE MARCELO BUFARAH CARONI:/home/c129421:
2026-06-08T14:00:23.5410530Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f603375:x:10603375:20000000:CLAUDIO HENRIQUE DE ARAUJO COUTINHO:/home/f603375:
2026-06-08T14:00:23.5411234Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a762512:x:10762512:30000001:VITOR RODRIGUES CASSIMIRO DOS SANTOS:/home/a762512:/bin/bash
2026-06-08T14:00:23.5412106Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f744268:x:10744268:20000000:SAVIO NONATO LOPES:/home/f744268:
2026-06-08T14:00:23.5412884Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c073453:x:10073453:20000000:EDUARDO BANDEL TUSCO:/home/c073453:/bin/bash
2026-06-08T14:00:23.5413484Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f585999:x:10585999:20000000:EDSON ROBERTO COBO TERUEL:/home/f585999:
2026-06-08T14:00:23.5414065Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p602927:x:10602927:20000000:VICTOR MURILO VASCONCELOS GONCALVES:/home/p602927:/bin/bash
2026-06-08T14:00:23.5414635Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f684816:x:10684816:20000000:MARCOS BONTEMPO DOS SANTOS:/home/f684816:
2026-06-08T14:00:23.5415210Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f504909:x:10504909:20000000:WILLIAN GARCIA DE ALMEIDA:/home/f504909:/bin/bash
2026-06-08T14:00:23.5415867Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c153682:x:10153682:20000000:RELDER MAIA DA SILVA BATISTA:/home/c153682:/bin/bash
2026-06-08T14:00:23.5416658Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f759557:x:10759557:20000000:RAFAEL BARBOSA ALVES COSTA:/home/f759557:/bin/bash
2026-06-08T14:00:23.5417227Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c124650:x:10124650:20000000:VICTOR SOUSA MENDES:/home/c124650:/bin/bash
2026-06-08T14:00:23.5417768Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f650084:x:10650084:20000000:JACKSON FERREIRA ANDRADE:/home/f650084:/bin/bash
2026-06-08T14:00:23.5418320Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f689341:x:10689341:20000000:PAULO ROBERTO DA SILVA TEODORO:/home/f689341:/bin/bash
2026-06-08T14:00:23.5418935Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f955721:x:10955721:20000000:LUCAS RAPHAEL PIRES DO AMARAL:/home/f955721:/bin/bash
2026-06-08T14:00:23.5419522Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f764369:x:10764369:20000000:ANDREI AIRES MARTINS:/home/f764369:/bin/bash
2026-06-08T14:00:23.5420603Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f961342:x:10961342:20000000:FELIPE MASSANEIRO DE OLIVEIRA:/home/f961342:/bin/bash
2026-06-08T14:00:23.5421154Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f723516:x:10723516:20000000:NEIDE SOARES SALES MELO:/home/f723516:/bin/bash
2026-06-08T14:00:23.5421736Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c149144:x:10149144:20000000:PAULO UEINER MOREIRA DE ASSIS:/home/c149144:/bin/bash
2026-06-08T14:00:23.5422329Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c108268:x:10108268:20000000:LUIZ FERNANDO MESASHI:/home/c108268:/bin/bash
2026-06-08T14:00:23.5423041Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c129481:x:10129481:20000000:MAYCON JEFFERSON MASCELLONI:/home/c129481:/bin/bash
2026-06-08T14:00:23.5423824Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f956566:x:10956566:20000000:FERNANDO XAVIER DE ALENCAR:/home/f956566:/bin/bash
2026-06-08T14:00:23.5424408Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a554276:x:10554276:30000001:SILVIA EVELINE GOMES BORGES:/home/a554276:/bin/bash
2026-06-08T14:00:23.5424997Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f982663:x:10982663:20000000:ROBSON ARTHUR DE SOUZA:/home/f982663:/bin/bash
2026-06-08T14:00:23.5425602Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f604166:x:10604166:20000000:VALDEMAR ALEXANDRE DA SILVA FILHO:/home/f604166:/bin/bash
2026-06-08T14:00:23.5426310Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a628147:x:10628147:30000001:RAFAEL DOS SANTOS RODRIGUES GUIMARAES:/home/a628147:/bin/bash
2026-06-08T14:00:23.5426907Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f951857:x:10951857:20000000:SILVIO LUIZ PENNA DE MORAES:/home/f951857:/bin/bash
2026-06-08T14:00:23.5427655Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a052927:x:10052927:30000001:RODRIGO PERES PAIVA LACERDA:/home/a052927:/bin/bash
2026-06-08T14:00:23.5428176Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a554859:x:10554859:30000001:RODRIGO DOURADO DA SILVA:/home/a554859:/bin/bash
2026-06-08T14:00:23.5428708Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f759320:x:10759320:20000000:MARCIO FERNANDES ALVES:/home/f759320:/bin/bash
2026-06-08T14:00:23.5429236Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c070669:x:10070669:20000000:EDUARDO CALHEIROS DE FIGUEIREDO:/home/c070669:
2026-06-08T14:00:23.5429795Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f771215:x:10771215:20000000:RUBENS OBAYASHI:/home/f771215:/bin/bash
2026-06-08T14:00:23.5430636Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f539880:x:10539880:20000000:HEITOR SILVA RODRIGUES:/home/f539880:
2026-06-08T14:00:23.5431228Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p572838:x:10572838:20000000:LUIZ GUILHERME DE ARAUJO:/home/p572838:/bin/bash
2026-06-08T14:00:23.5431810Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f635635:x:10635635:20000000:JAMARIO BATISTA NASCIMENTO:/home/f635635:/bin/bash
2026-06-08T14:00:23.5432659Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f569474:x:10569474:20000000:KARINA ROBERTA DOS SANTOS BRAGA:/home/f569474:/bin/bash
2026-06-08T14:00:23.5433383Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f772660:x:10772660:20000000:FELIPE TAVARES MESQUITA:/home/f772660:/bin/bash
2026-06-08T14:00:23.5433958Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c059460:x:10059460:20000000:ELCIO ANDRADE BRAGA:/home/c059460:/bin/bash
2026-06-08T14:00:23.5434657Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c140543:x:10140543:20000000:ANA KAROLINA VERAS SERRAO:/home/c140543:
2026-06-08T14:00:23.5435252Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f729333:x:10729333:20000000:ANTONIO CARLOS TARONI:/home/f729333:/bin/bash
2026-06-08T14:00:23.5435834Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c062802:x:10062802:20001097:Leonardo Linhares Ruivo:/home/c062802:/bin/bash
2026-06-08T14:00:23.5436348Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f514902:x:10514902:20000000:LUCAS DALCOLMO DA SILVA:/home/f514902:/bin/bash
2026-06-08T14:00:23.5436853Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c069605:x:10069605:20000000:TATIANA PINHEIRO LACERDA:/home/c069605:
2026-06-08T14:00:23.5437397Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p757518:x:10757518:20000000:AILTON SILVA DOS SANTOS:/home/p757518:/bin/bash
2026-06-08T14:00:23.5437974Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f793541:x:10793541:20000000:ELOI CAMPOS TEIXEIRA:/home/f793541:/bin/bash
2026-06-08T14:00:23.5438557Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c155161:x:10155161:20000000:THIAGO FRANCISCO DE SOUZA ARECO:/home/c155161:
2026-06-08T14:00:23.5439674Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f540094:x:10540094:20000000:FABIANO FERREIRA DE SOUSA:/home/f540094:/bin/bash
2026-06-08T14:00:23.5440107Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f643020:x:10643020:20000000:HELIO ALVES DO NASCIMENTO:/home/f643020:/bin/bash
2026-06-08T14:00:23.5440477Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c074084:x:10074084:20000000:VICTOR BARROZO BRANDAO AZAMBUJA:/home/c074084:
2026-06-08T14:00:23.5440861Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a980612:x:10980612:30000001:GILMAR SILVA DE SOUZA:/home/a980612:/bin/bash
2026-06-08T14:00:23.5441221Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f729095:x:10729095:20000000:CRISTIANO VASCONCELOS BARBOSA:/home/f729095:
2026-06-08T14:00:23.5441853Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c071099:x:10071099:20000000:WILSON MADI PIMENTEL:/home/c071099:
2026-06-08T14:00:23.5442538Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f664486:x:10664486:20000000:DAYENE RIBEIRO MARY:/home/f664486:
2026-06-08T14:00:23.5443533Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a550113:x:10550113:30000001:JOSE WELLISON TORRES:/home/a550113:/bin/bash
2026-06-08T14:00:23.5443907Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c096220:x:10096220:20000000:ROBERTA ALINE NISHIMURA BARROSO:/home/c096220:/bin/bash
2026-06-08T14:00:23.5444559Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a533555:x:10533555:30000001:GIUSEPE BATISTA DIAS:/home/a533555:/bin/bash
2026-06-08T14:00:23.5445162Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c058946:x:10058946:20000000:PAULO DE TARSO RODRIGUES DOS SANTOS:/home/c058946:
2026-06-08T14:00:23.5445760Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c099678:x:10099678:20000000:FELIPE CESAR FERREIRA:/home/c099678:
2026-06-08T14:00:23.5446532Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spbkpd01:x:20003945:20001259:Conta de BACKUP da ferramenta :/home/spbkpd01:/bin/bash
2026-06-08T14:00:23.5447232Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f959609:x:10959609:20000000:LUCAS BATISTA MOREIRA:/home/f959609:/bin/bash
2026-06-08T14:00:23.5447943Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f554997:x:10554997:20000000:ANDRE DE PAULA CASTRO:/home/f554997:/bin/bash
2026-06-08T14:00:23.5448488Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f793342:x:10793342:20000000:GIOVANNI ALMEIDA GUISELINI:/home/f793342:/bin/bash
2026-06-08T14:00:23.5449238Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f749848:x:10749848:20000000:EMANUEL NOGUEIRA DE OLIVEIRA:/home/f749848:/bin/bash
2026-06-08T14:00:23.5450267Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f538546:x:10538546:20000000:GUILHERME DE GODOY OLIVEIRA:/home/f538546:/bin/bash
2026-06-08T14:00:23.5450636Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f938708:x:10938708:20000000:MICHAEL PEREIRA SANTANA:/home/f938708:/bin/bash
2026-06-08T14:00:23.5451605Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f523283:x:10523283:20000000:DIONNI GOMES DA SILVA:/home/f523283:/bin/bash
2026-06-08T14:00:23.5451966Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p914622:x:10914622:30000004:ROBSON RIBEIRO MIRANDA:/home/p914622:
2026-06-08T14:00:23.5452507Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f560227:x:10560227:20000000:SILVIO MONCORES COSTA:/home/f560227:/bin/bash
2026-06-08T14:00:23.5454223Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c128626:x:10128626:20000000:MARCIO CARDOSO GUILHERME JUNIOR:/home/c128626:
2026-06-08T14:00:23.5454790Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f518851:x:10518851:20000000:RAPHAEL ARAUJO OLIVEIRA:/home/f518851:
2026-06-08T14:00:23.5456802Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158380:x:10158380:20000000:LUIS GUILHERME PINHEIRO DE ALMEIDA:/home/c158380:/bin/bash
2026-06-08T14:00:23.5457190Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158474:x:10158474:20000000:LUCAS DA SILVA PAZ:/home/c158474:/bin/bash
2026-06-08T14:00:23.5457897Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f609393:x:10609393:20000000:LUCAS RAMOS HISSA:/home/f609393:
2026-06-08T14:00:23.5459419Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): smtxpb01:x:20003942:30000018:conta do SIMTX para uso do ControlM TAS000043536997-CRQ000001022593:/home/smtxpb01:/bin/bash
2026-06-08T14:00:23.5459964Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p589437:x:10589437:20000000:RICHARD MENDES ALMEIDA:/home/p589437:/bin/bash
2026-06-08T14:00:23.5460370Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f956952:x:10956952:20000000:MATHEUS ZANATTA:/home/f956952:
2026-06-08T14:00:23.5461127Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p529736:x:10529736:20000000:MARCOS ALBERTO ALVES DOS ANJOS:/home/p529736:/bin/bash
2026-06-08T14:00:23.5461537Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158498:x:10158498:20000000:CHARLES RODRIGUES GOMES:/home/c158498:/bin/bash
2026-06-08T14:00:23.5462106Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158457:x:10158457:20000000:MATHEUS GONCALVES DE FREITAS:/home/c158457:/bin/bash
2026-06-08T14:00:23.5462475Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158449:x:10158449:20000000:CARLOS EDUARDO BARROS CORREIA:/home/c158449:/bin/bash
2026-06-08T14:00:23.5463689Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158423:x:10158423:20000000:JULIO JOSE MOREIRA FERREIRA:/home/c158423:/bin/bash
2026-06-08T14:00:23.5464256Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158378:x:10158378:20000000:RENAN RODRIGUES LACERDA:/home/c158378:/bin/bash
2026-06-08T14:00:23.5464815Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158476:x:10158476:20000000:VINICIUS SILVA VIRGILLI:/home/c158476:/bin/bash
2026-06-08T14:00:23.5465167Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158407:x:10158407:20000000:GABRIEL CHAGAS SUZUKI:/home/c158407:/bin/bash
2026-06-08T14:00:23.5465683Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158401:x:10158401:20000000:GABRIEL HENRIQUE DO NASCIMENTO NERES:/home/c158401:/bin/bash
2026-06-08T14:00:23.5467001Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158402:x:10158402:20000000:LEONARDO AMORIM GONCALVES:/home/c158402:/bin/bash
2026-06-08T14:00:23.5467557Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158385:x:10158385:20000000:LUCAS MELHEM GOBBI:/home/c158385:/bin/bash
2026-06-08T14:00:23.5467976Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158433:x:10158433:20000000:MIGUEL COSTA ANJO:/home/c158433:/bin/bash
2026-06-08T14:00:23.5469342Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158484:x:10158484:20000000:HELLOYSA PIRES DE ALMEIDA:/home/c158484:/bin/bash
2026-06-08T14:00:23.5469701Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158486:x:10158486:20000000:LUCIANO AYMONE RODRIGUES:/home/c158486:/bin/bash
2026-06-08T14:00:23.5470139Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158431:x:10158431:20000000:ANGELO GIORDANO SILVEIRA ALVES:/home/c158431:
2026-06-08T14:00:23.5470788Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158797:x:10158797:20000000:BRUNO MATOS DE ARAUJO E SILVA:/home/c158797:
2026-06-08T14:00:23.5471798Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158787:x:10158787:20000000:GABRIEL DAMICO DOS SANTOS:/home/c158787:
2026-06-08T14:00:23.5472413Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158800:x:10158800:20000000:KEVIN DOS SANTOS ASSIS:/home/c158800:
2026-06-08T14:00:23.5472942Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158789:x:10158789:20000000:MAURICIO POLLIS DAVIS:/home/c158789:
2026-06-08T14:00:23.5473328Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158810:x:10158810:20000000:LEONARDO SANTIAGO DE FRAGA:/home/c158810:
2026-06-08T14:00:23.5473799Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158832:x:10158832:20000000:PEDRO HENRIQUE BEZERRA DE MELO SAUNDERS:/home/c158832:/bin/bash
2026-06-08T14:00:23.5474164Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158898:x:10158898:20000000:VINICIUS SILVA DE OLIVEIRA:/home/c158898:
2026-06-08T14:00:23.5474634Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c108464:x:10108464:20000000:VINICIUS BARBOSA LIRA:/home/c108464:
2026-06-08T14:00:23.5475273Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f532960:x:10532960:20000000:ADRIAN CHAVES OLIVEIRA:/home/f532960:
2026-06-08T14:00:23.5475843Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158390:x:10158390:20000000:YURI BARCELLOS GALLI:/home/c158390:
2026-06-08T14:00:23.5476703Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f715960:x:10715960:20000000:LUIS AUGUSTO DE OLIVEIRA:/home/f715960:/bin/bash
2026-06-08T14:00:23.5477453Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f724327:x:10724327:20000000:EDUARDO BARBOSA MOREIRA:/home/f724327:
2026-06-08T14:00:23.5478451Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158440:x:10158440:20000000:WILLIAN WERNER DA SILVA NEIBERT BEZERRA:/home/c158440:
2026-06-08T14:00:23.5479288Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158398:x:10158398:20000000:LUCIANO DE ARAUJO LIRA:/home/c158398:
2026-06-08T14:00:23.5479858Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158465:x:10158465:20000000:AELTON SOUSA DAS VIRGENS:/home/c158465:
2026-06-08T14:00:23.5480427Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f937153:x:10937153:20000000:GUSTAVO PINHEIRO E SOUSA:/home/f937153:/bin/bash
2026-06-08T14:00:23.5487484Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f750688:x:10750688:20000000:DOUGLAS MARQUES RAMOS RODRIGUES AMARAL:/home/f750688:/bin/bash
2026-06-08T14:00:23.5487915Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c119514:x:10119514:20000000:LEANDRO COSTA MORAES:/home/c119514:/bin/bash
2026-06-08T14:00:23.5488300Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f725637:x:10725637:20000000:LUIS HENRIQUE DE SOUZA MEDEIROS MACEDO:/home/f725637:
2026-06-08T14:00:23.5488655Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158809:x:10158809:20000000:ALICE FONTES:/home/c158809:/bin/bash
2026-06-08T14:00:23.5489007Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p949847:x:10949847:20000000:CARLOS MAGNO RANGEL SOARES:/home/p949847:/bin/bash
2026-06-08T14:00:23.5489690Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p796713:x:10796713:20000000:RAPHAEL ANTONY LIMA DA SILVA:/home/p796713:/bin/bash
2026-06-08T14:00:23.5490045Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158804:x:10158804:20000000:MARCELLE MORAES DANTAS:/home/c158804:/bin/bash
2026-06-08T14:00:23.5490402Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f669619:x:10669619:20000000:PATRICIA SANTOS DE CARVALHO VIEIRA:/home/f669619:
2026-06-08T14:00:23.5490755Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a139517:x:10139517:30000001:VICTOR NEVES EVANGELISTA:/home/a139517:/bin/bash
2026-06-08T14:00:23.5491132Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158998:x:10158998:20000000:ITALLO ALEXSANDER DA FONSECA RIBEIRO:/home/c158998:
2026-06-08T14:00:23.5491474Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158784:x:10158784:20000000:LUIZ FELIPE SIMOES RIBEIRO:/home/c158784:
2026-06-08T14:00:23.5491827Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158844:x:10158844:20000000:DANIEL LOBO MONTEIRO SILVA:/home/c158844:/bin/bash
2026-06-08T14:00:23.5492170Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158885:x:10158885:20000000:RAFAEL GOMES VIEIRA:/home/c158885:/bin/bash
2026-06-08T14:00:23.5492512Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f605311:x:10605311:20000000:JONATHAN COSTA:/home/f605311:
2026-06-08T14:00:23.5492943Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p542542:x:10542542:20000000:GEOFFREY ITALO SOLOVIOFF DOS SANTOS MATI:/home/p542542:/bin/bash
2026-06-08T14:00:23.5493294Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158997:x:10158997:20000000:GABRIEL ALVES PINHEIRO LIMA:/home/c158997:
2026-06-08T14:00:23.5493642Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159047:x:10159047:20000000:MATEUS FRANCISCO DE SA SANDERS:/home/c159047:
2026-06-08T14:00:23.5493997Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158842:x:10158842:20000000:JORGE EDUARDO SANTOS MOURA NIMRICHTER:/home/c158842:
2026-06-08T14:00:23.5494394Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158820:x:10158820:20000000:RAFAEL MENEZES VILLAR:/home/c158820:
2026-06-08T14:00:23.5494750Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158854:x:10158854:20000000:LUIZ FERNANDO PEIXOTO PEREIRA JUNIOR:/home/c158854:
2026-06-08T14:00:23.5495429Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158798:x:10158798:20000000:SERGIO SANTOS BARROS:/home/c158798:/bin/bash
2026-06-08T14:00:23.5496328Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f613680:x:10613680:20000000:NATHALIA PRISCILA LINS DE ASSUNCAO:/home/f613680:/bin/bash
2026-06-08T14:00:23.5496712Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158806:x:10158806:20000000:LUIZ CARLOS MENDES SOUZA:/home/c158806:/bin/bash
2026-06-08T14:00:23.5497161Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p568640:x:10568640:20000000:DARIO ROCHA CALDAS:/home/p568640:
2026-06-08T14:00:23.5498173Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158993:x:10158993:20000000:GUILHERME DE OLIVEIRA CAVALCANTI:/home/c158993:
2026-06-08T14:00:23.5498539Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159085:x:10159085:20000000:GABRIEL MORENO MAGALHAES:/home/c159085:/bin/bash
2026-06-08T14:00:23.5498979Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159088:x:10159088:20000000:LUIS FELIPE BARROS DOS SANTOS:/home/c159088:
2026-06-08T14:00:23.5499618Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159048:x:10159048:20000000:FELIPE MOREZUELA GIMENEZ DOMINGOS:/home/c159048:
2026-06-08T14:00:23.5500576Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159057:x:10159057:20000000:RAFAEL SEIJI OKAMOTO:/home/c159057:
2026-06-08T14:00:23.5501093Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159014:x:10159014:20000000:FELIPE VIEIRA STOFFEL:/home/c159014:
2026-06-08T14:00:23.5502268Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159120:x:10159120:20000000:YAN VIEIRA DE MACEDO:/home/c159120:
2026-06-08T14:00:23.5503118Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p650110:x:10650110:20000000:MARCUS VINICIUS DA SILVA:/home/p650110:/bin/bash
2026-06-08T14:00:23.5503481Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c107051:x:10107051:20000000:LEANDRO DA SILVA PITTA:/home/c107051:/bin/bash
2026-06-08T14:00:23.5504188Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c061678:x:10061678:20000000:WANDERSON DIAS FERREIRA:/home/c061678:
2026-06-08T14:00:23.5504694Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c149121:x:10149121:20000000:VALDIR ALVES CARDOSO:/home/c149121:/bin/bash
2026-06-08T14:00:23.5505291Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c114143:x:10114143:20000000:PRISCILA CLARA DA FONSECA FERRAZ PINOTTI:/home/c114143:
2026-06-08T14:00:23.5505757Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p564267:x:10564267:20000000:CRISTIANO RODRIGUES ROSA:/home/p564267:/bin/bash
2026-06-08T14:00:23.5506438Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p527470:x:10527470:20000000:LUCAS SOARES DE OLIVEIRA:/home/p527470:/bin/bash
2026-06-08T14:00:23.5507651Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159006:x:10159006:20000000:ANTHONY RAPHAEL PIRES DE MELO YATABE:/home/c159006:
2026-06-08T14:00:23.5508010Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p779682:x:10779682:20000000:EMERSON ARAUJO DA SILVA:/home/p779682:/bin/bash
2026-06-08T14:00:23.5508630Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p962174:x:10962174:20000000:CARLOS ALBERTO MOREIRA DE SOUSA JUNIOR:/home/p962174:/bin/bash
2026-06-08T14:00:23.5509629Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c076483:x:10076483:20000000:RAQUEL AMANO YOSHISATO KASSA:/home/c076483:/bin/bash
2026-06-08T14:00:23.5510785Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f768105:x:10768105:20000000:MARCO ANTONIO PARANHOS SILVA:/home/f768105:
2026-06-08T14:00:23.5511141Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159001:x:10159001:20000000:KENNEDY EDMILSON CUNHA MELO:/home/c159001:
2026-06-08T14:00:23.5511726Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159102:x:10159102:20000000:DANIEL MATHEUS DE OLIVEIRA:/home/c159102:
2026-06-08T14:00:23.5513781Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159036:x:10159036:20000000:ABNER EDUARDO RAMOS FERREIRA:/home/c159036:
2026-06-08T14:00:23.5514146Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159118:x:10159118:20000000:THIAGO CARDOZO DE ABREU:/home/c159118:
2026-06-08T14:00:23.5514613Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159009:x:10159009:20000000:VICTOR BONETTI PEGORARO:/home/c159009:
2026-06-08T14:00:23.5514970Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159098:x:10159098:20000000:MATEUS BONASSA EDERLI:/home/c159098:/bin/bash
2026-06-08T14:00:23.5515763Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159021:x:10159021:20000000:MATHEUS FELIPE RODRIGUES DE CARVALHO:/home/c159021:/bin/bash
2026-06-08T14:00:23.5516463Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159126:x:10159126:20000000:ROBERTO ANDIARA DA SILVA ROSA:/home/c159126:/bin/bash
2026-06-08T14:00:23.5516917Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159078:x:10159078:20000000:DERICK LIMA ALVES:/home/c159078:
2026-06-08T14:00:23.5517492Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159022:x:10159022:20000000:AHMAD KAMEL ABDOUNI:/home/c159022:
2026-06-08T14:00:23.5518018Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159060:x:10159060:20000000:NICOLAS CIUFFI DE MOURA:/home/c159060:
2026-06-08T14:00:23.5519002Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159082:x:10159082:20000000:GABRIEL MOREIRA GAMA:/home/c159082:
2026-06-08T14:00:23.5519453Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159042:x:10159042:20000000:ENZO KUSUKI SANTANA:/home/c159042:
2026-06-08T14:00:23.5519973Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159049:x:10159049:20000000:RICARDO YOICHI TSUTSUMIUCHI:/home/c159049:
2026-06-08T14:00:23.5521048Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159081:x:10159081:20000000:ARTUR RODRIGUES DE LIMA:/home/c159081:
2026-06-08T14:00:23.5521394Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159033:x:10159033:20000000:GILVANE DA SILVA SOUSA:/home/c159033:
2026-06-08T14:00:23.5521826Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159122:x:10159122:20000000:VINICIUS SANTOS OLIVEIRA:/home/c159122:
2026-06-08T14:00:23.5523257Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f715844:x:10715844:20000000:ANDERSON ALMEIDA CHAGAS:/home/f715844:/bin/bash
2026-06-08T14:00:23.5523613Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159066:x:10159066:20000000:MATHEUS MILANEZ:/home/c159066:/bin/bash
2026-06-08T14:00:23.5524786Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159067:x:10159067:20000000:LUIZ EDUARDO MERLI DE OLIVEIRA:/home/c159067:
2026-06-08T14:00:23.5525146Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f909003:x:10909003:20000000:RENATO GOMES DA CUNHA RIBEIRO:/home/f909003:/bin/bash
2026-06-08T14:00:23.5525508Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f953069:x:10953069:20000000:FERNANDO MATEUS PEREIRA:/home/f953069:/bin/bash
2026-06-08T14:00:23.5525967Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f938743:x:10938743:20000000:MAXIMINA LEITE BORGES CAMARA:/home/f938743:/bin/bash
2026-06-08T14:00:23.5526531Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158617:x:10158617:20000000:LUIZ YOKOYAMA FELIX DE SOUZA:/home/c158617:/bin/bash
2026-06-08T14:00:23.5529151Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158429:x:10158429:20000000:FELIPE ALEF PEREIRA RODRIGUES:/home/c158429:/bin/bash
2026-06-08T14:00:23.5529531Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158437:x:10158437:20000000:CARLOS EDUARDO HABIB BAPTISTA LIMA:/home/c158437:/bin/bash
2026-06-08T14:00:23.5529880Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159097:x:10159097:20000000:DANYLO EXPEDITO DE SABINO:/home/c159097:
2026-06-08T14:00:23.5531544Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158995:x:10158995:20000000:JOSE LUCAS CORREIA ACIOLY:/home/c158995:
2026-06-08T14:00:23.5531946Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p950149:x:10950149:20000000:RODRIGO DE FRANCA:/home/p950149:
2026-06-08T14:00:23.5533122Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c149949:x:10149949:20000000:ANTONIO DANIEL DE JESUS FONSECA:/home/c149949:/bin/bash
2026-06-08T14:00:23.5533491Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159063:x:10159063:20000000:LINCOLN SILVEIRA DOS SANTOS:/home/c159063:/bin/bash
2026-06-08T14:00:23.5533928Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158831:x:10158831:20000000:THAIS GADIOLE SCHONTAG:/home/c158831:
2026-06-08T14:00:23.5534926Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158896:x:10158896:20000000:THIAGO FIGUEIROA OLIVEIRA:/home/c158896:/bin/bash
2026-06-08T14:00:23.5535596Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158796:x:10158796:20000000:JONATHA SALLES MENEZES:/home/c158796:/bin/bash
2026-06-08T14:00:23.5536849Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158843:x:10158843:20000000:RAPHAEL CAMELO SANTANA:/home/c158843:/bin/bash
2026-06-08T14:00:23.5537212Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f692324:x:10692324:20000000:GUILHERME BATISTA SOARES:/home/f692324:/bin/bash
2026-06-08T14:00:23.5537578Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158494:x:10158494:20000000:ROBERT CARDOSO CANTARES MARTINS:/home/c158494:/bin/bash
2026-06-08T14:00:23.5538183Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p536927:x:10536927:20000000:MARCOS MARTINS ARRUDA:/home/p536927:/bin/bash
2026-06-08T14:00:23.5538547Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p789342:x:10789342:20000000:UILSON GOMES FERREIRA:/home/p789342:/bin/bash
2026-06-08T14:00:23.5539764Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159121:x:10159121:20000000:JULIO CESAR INACIO MACHADO:/home/c159121:
2026-06-08T14:00:23.5540122Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159000:x:10159000:20000000:TITO KENZO GUIMARAES:/home/c159000:/bin/bash
2026-06-08T14:00:23.5540541Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158996:x:10158996:20000000:IGOR ALEXANDRE STEFAN:/home/c158996:/bin/bash
2026-06-08T14:00:23.5541049Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p513536:x:10513536:20000000:TERCIO LUIZ NEVES:/home/p513536:/bin/bash
2026-06-08T14:00:23.5541734Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158425:x:10158425:20000000:IGOR DREHER SPARRENBERGER:/home/c158425:
2026-06-08T14:00:23.5542335Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f761156:x:10761156:20000000:ADRIANA PAULA NUNES DUARTE RODRIGUES:/home/f761156:/bin/bash
2026-06-08T14:00:23.5542769Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159103:x:10159103:20000000:MATEUS FELIPE BULLERJAHN:/home/c159103:
2026-06-08T14:00:23.5543372Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158872:x:10158872:20000000:CARLOS HENRIQUE DE OLIVEIRA PEREIRA:/home/c158872:
2026-06-08T14:00:23.5543730Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158841:x:10158841:20000000:MATHEUS DA SILVA RODRIGUES:/home/c158841:
2026-06-08T14:00:23.5544130Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p508508:x:10508508:20000000:DAVID SOUTO DE SOUZA:/home/p508508:/bin/bash
2026-06-08T14:00:23.5545445Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159012:x:10159012:20000000:FELIPE SANTOS MENDES:/home/c159012:
2026-06-08T14:00:23.5545849Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159089:x:10159089:20000000:IZABELA VICENTINI TERRIN:/home/c159089:
2026-06-08T14:00:23.5546201Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f958279:x:10958279:20000000:JORGE LUIS SANTOS SOUZA:/home/f958279:/bin/bash
2026-06-08T14:00:23.5546936Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): saffrp02:x:20003948:30000018:Conta de servico do SIAFF via Control M CRQ000001054672_CRQ000001053273:/home/saffrp02:/bin/bash
2026-06-08T14:00:23.5548200Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f524398:x:10524398:20000000:CAMILA EVELYN GONCALO ROMUALDO:/home/f524398:/bin/bash
2026-06-08T14:00:23.5549446Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158877:x:10158877:20000000:VINICIUS DA SILVA EVANGELISTA:/home/c158877:/bin/bash
2026-06-08T14:00:23.5550098Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158533:x:10158533:20000000:RUAN PERONDI URBANJOS:/home/c158533:/bin/bash
2026-06-08T14:00:23.5550516Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158422:x:10158422:20000000:RAMON DE MELO SOUSA:/home/c158422:/bin/bash
2026-06-08T14:00:23.5551196Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158835:x:10158835:20000000:DANIEL RIBEIRO PAIVA:/home/c158835:/bin/bash
2026-06-08T14:00:23.5551905Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158891:x:10158891:20000000:KARLA DOS SANTOS SILVA:/home/c158891:/bin/bash
2026-06-08T14:00:23.5552612Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p412846:x:10412846:20000000:TONY ANDERSON FERRAZ TIRAPELLI:/home/p412846:/bin/bash
2026-06-08T14:00:23.5553175Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158814:x:10158814:20000000:RAFAEL SCHMIDT:/home/c158814:/bin/bash
2026-06-08T14:00:23.5554353Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f780572:x:10780572:20000000:CARLOS ALBERTO YOSHIO GONDO:/home/f780572:/bin/bash
2026-06-08T14:00:23.5554708Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158780:x:10158780:20000000:CAIO LUIZ ALONSO SANTANA:/home/c158780:
2026-06-08T14:00:23.5555140Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f594001:x:10594001:20000000:OSMAR AGUIAR RIBEIRO JUNIOR:/home/f594001:
2026-06-08T14:00:23.5555598Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f654943:x:10654943:20000000:FRANCISCO DE AZEVEDO GAMARRA:/home/f654943:
2026-06-08T14:00:23.5556225Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f777012:x:10777012:20000000:IGOR MARCEL PEREIRA LIMA:/home/f777012:/bin/bash
2026-06-08T14:00:23.5557555Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159037:x:10159037:20000000:THIAGO GARCIA DOS SANTOS:/home/c159037:/bin/bash
2026-06-08T14:00:23.5558128Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158839:x:10158839:20000000:LUCAS SOARES DE OLIVEIRA PAIXAO:/home/c158839:/bin/bash
2026-06-08T14:00:23.5558862Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159050:x:10159050:20000000:GABRIELA ALCANTARA LIBERO:/home/c159050:/bin/bash
2026-06-08T14:00:23.5559552Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f795305:x:10795305:20000000:DENIS LACERDA DE ARAUJO:/home/f795305:
2026-06-08T14:00:23.5559905Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f584405:x:10584405:20000000:LEANDRO VIEIRA DE OLIVEIRA:/home/f584405:/bin/bash
2026-06-08T14:00:23.5560598Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c077689:x:10077689:20000000:LUANDA LOPES DE ANDRADE BARCA MARTINS:/home/c077689:
2026-06-08T14:00:23.5561016Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c092071:x:10092071:20000000:THIAGO SAUER GOVEA:/home/c092071:/bin/bash
2026-06-08T14:00:23.5561363Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f574072:x:10574072:20000000:DAVI PEREIRA DOS SANTOS:/home/f574072:/bin/bash
2026-06-08T14:00:23.5561823Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158833:x:10158833:20000000:SANTIAGO PACHECO HEUER:/home/c158833:/bin/bash
2026-06-08T14:00:23.5562627Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158811:x:10158811:20000000:ALLAN DOS SANTOS FERNANDES:/home/c158811:/bin/bash
2026-06-08T14:00:23.5563236Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158855:x:10158855:20000000:RAFAEL CABRAL BRIZUENA:/home/c158855:/bin/bash
2026-06-08T14:00:23.5563832Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158793:x:10158793:20000000:ANDERSON FERREIRA SANTOS:/home/c158793:/bin/bash
2026-06-08T14:00:23.5564580Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159468:x:10159468:20000000:ALAN PATRICK FRANCO DA VITORIA:/home/c159468:
2026-06-08T14:00:23.5565254Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159491:x:10159491:20000000:JOHANN MONTEIRO LOPES SOUSA:/home/c159491:
2026-06-08T14:00:23.5565637Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159463:x:10159463:20000000:ELYONAY PEREIRA DE SOUZA:/home/c159463:
2026-06-08T14:00:23.5566292Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c150280:x:10150280:20000000:AUGUSTO FRANCO SOARES DE MOURA:/home/c150280:
2026-06-08T14:00:23.5567067Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159494:x:10159494:20000000:JULIA NUNES MONTEIRO:/home/c159494:/bin/bash
2026-06-08T14:00:23.5567450Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159448:x:10159448:20000000:LUIZ MARCELO PEREIRA TORRE:/home/c159448:/bin/bash
2026-06-08T14:00:23.5568083Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f523727:x:10523727:20000000:LANDER BARROS DE ANDRADE:/home/f523727:/bin/bash
2026-06-08T14:00:23.5568680Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158992:x:10158992:20000000:VITOR MENDES CARVALHO:/home/c158992:/bin/bash
2026-06-08T14:00:23.5569259Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158856:x:10158856:20000000:RAFAEL FIGUEIREDO KAWAKUBO:/home/c158856:/bin/bash
2026-06-08T14:00:23.5569871Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158879:x:10158879:20000000:THAMYRES NEVES POGIAN AMORIM:/home/c158879:/bin/bash
2026-06-08T14:00:23.5573720Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158840:x:10158840:20000000:RAPHAEL ALMEIDA ANDRADE:/home/c158840:/bin/bash
2026-06-08T14:00:23.5574068Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159558:x:10159558:20000000:LUCAS MELO DA SILVA:/home/c159558:/bin/bash
2026-06-08T14:00:23.5574428Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159553:x:10159553:20000000:JOAO MARCOS GABRIEL SANTOS:/home/c159553:/bin/bash
2026-06-08T14:00:23.5574792Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158786:x:10158786:20000000:WANDO HENRIQUE BARROS DE JESUS:/home/c158786:/bin/bash
2026-06-08T14:00:23.5575214Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159541:x:10159541:20000000:BRUNA MELLONI ROMERO:/home/c159541:/bin/bash
2026-06-08T14:00:23.5575590Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159529:x:10159529:20000000:ARTUR BORGES CERQUEIRA DE ANDRADE:/home/c159529:/bin/bash
2026-06-08T14:00:23.5576028Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c149182:x:10149182:20000000:ADRIANO VALE DE OLIVEIRA:/home/c149182:/bin/bash
2026-06-08T14:00:23.5576381Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159438:x:10159438:20000000:ENZO SUZART PINTO:/home/c159438:/bin/bash
2026-06-08T14:00:23.5576748Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159537:x:10159537:20000000:LORINE PIMENTA MARTINS:/home/c159537:
2026-06-08T14:00:23.5577177Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159588:x:10159588:20000000:LUCAS BELO FRANCA PEREIRA:/home/c159588:
2026-06-08T14:00:23.5577605Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159557:x:10159557:20000000:LUCAS NOGUEIRA DE CARVALHO:/home/c159557:
2026-06-08T14:00:23.5577952Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159580:x:10159580:20000000:CAMILA FERREIRA D AVILA LETIER:/home/c159580:
2026-06-08T14:00:23.5578298Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158375:x:10158375:20000000:CAUA MATHEUS ALVES CORREA:/home/c158375:
2026-06-08T14:00:23.5579391Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159485:x:10159485:20000000:DANIEL LOURENCO DA COSTA CALDAS:/home/c159485:
2026-06-08T14:00:23.5579745Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c078043:x:10078043:20000000:WILSON PIMENTA GARCIA:/home/c078043:/bin/bash
2026-06-08T14:00:23.5580501Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159473:x:10159473:20000000:VINICIUS PEREIRA D AMICO:/home/c159473:
2026-06-08T14:00:23.5580848Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159513:x:10159513:20000000:JOSE PORTELA SOARES NETO:/home/c159513:
2026-06-08T14:00:23.5586845Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p667224:x:10667224:20000000:ANDREY OLIVEIRA CAMARA:/home/p667224:/bin/bash
2026-06-08T14:00:23.5587287Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158424:x:10158424:20000000:THIAGO GOMES SILVA:/home/c158424:/bin/bash
2026-06-08T14:00:23.5589000Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158475:x:10158475:20000000:EMERSON MARTINS DE SOUZA:/home/c158475:/bin/bash
2026-06-08T14:00:23.5590566Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c050794:x:10050794:20000000:PATRICIA SOUSA QUINTINO DA SILVA:/home/c050794:/bin/bash
2026-06-08T14:00:23.5590943Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p540333:x:10540333:20000000:RODRIGO MARQUES BUENO DE MORAIS:/home/p540333:
2026-06-08T14:00:23.5597008Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158420:x:10158420:20000000:RAFAEL RODRIGUES GAMAS DOMINGOS ARAGAO:/home/c158420:
2026-06-08T14:00:23.5597405Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158404:x:10158404:20000000:LEANDRO PEREIRA SAMPAIO:/home/c158404:/bin/bash
2026-06-08T14:00:23.5597863Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158880:x:10158880:20000000:MATHEUS FELIPE FERREIRA DA SILVA:/home/c158880:/bin/bash
2026-06-08T14:00:23.5598291Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f518460:x:10518460:20000000:ANTONIO EDSON DE SOUZA JUNIOR:/home/f518460:
2026-06-08T14:00:23.5598662Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p558217:x:10558217:20000000:THIAGO RAFAEL CAVALCANTE PEREIRA:/home/p558217:/bin/bash
2026-06-08T14:00:23.5599228Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c116561:x:10116561:20000000:TALITA MENDES DE MORAES MUTTO:/home/c116561:
2026-06-08T14:00:23.5600489Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158471:x:10158471:20000000:CAIO ALEXANDRE ORNELAS SILVA:/home/c158471:
2026-06-08T14:00:23.5600843Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159497:x:10159497:20000000:ERICK BRITO RABELLO:/home/c159497:
2026-06-08T14:00:23.5601200Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f680381:x:10680381:20000000:ANTONIO CARLOS CORREIA DA SILVA:/home/f680381:
2026-06-08T14:00:23.5603795Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c131110:x:10131110:20000000:EUDERMES EUSTAQUIO DE ALMEIDA:/home/c131110:
2026-06-08T14:00:23.5604154Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159542:x:10159542:20000000:GABRIEL VICENTE FERREIRA:/home/c159542:
2026-06-08T14:00:23.5604547Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f769828:x:10769828:20000000:MOACIR DOS SANTOS DIMAS JUNIOR:/home/f769828:
2026-06-08T14:00:23.5612515Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159571:x:10159571:20000000:THIAGO PEREIRA DE MATTOS:/home/c159571:
2026-06-08T14:00:23.5614114Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159547:x:10159547:20000000:PEDRO HENRIQUE ALMEIDA BURGER:/home/c159547:
2026-06-08T14:00:23.5614469Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159025:x:10159025:20000000:FELIPE MARQUES:/home/c159025:/bin/bash
2026-06-08T14:00:23.5614963Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159476:x:10159476:20000000:PEDRO GABRIEL AFFONSO PACHECO PEREIRA:/home/c159476:
2026-06-08T14:00:23.5615329Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158536:x:10158536:20000000:JOAO RIBEIRO DANTAS NICASTRI:/home/c158536:
2026-06-08T14:00:23.5615683Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158466:x:10158466:20000000:GABRIEL PUPPIN CHAVES FULBER:/home/c158466:
2026-06-08T14:00:23.5616038Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158537:x:10158537:20000000:JOAO VITOR DE FREITAS VASCONCELOS:/home/c158537:
2026-06-08T14:00:23.5616591Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158448:x:10158448:20000000:LUCAS RESENDE DE SOUSA AMARAL:/home/c158448:
2026-06-08T14:00:23.5616937Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158441:x:10158441:20000000:ANDRE MACEDO RODRIGUES ALVES:/home/c158441:
2026-06-08T14:00:23.5617289Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158374:x:10158374:20000000:VICTOR VENDRAMINI RODRIGUES PEREIRA:/home/c158374:
2026-06-08T14:00:23.5617659Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159482:x:10159482:20000000:LUIZ HENRIQUE GONCALVES DANTAS:/home/c159482:/bin/bash
2026-06-08T14:00:23.5618006Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158860:x:10158860:20000000:SAMUEL CAVALCANTI:/home/c158860:/bin/bash
2026-06-08T14:00:23.5618370Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158477:x:10158477:20000000:ELKE SAMANTHA DA SILVA DOMINGOS:/home/c158477:/bin/bash
2026-06-08T14:00:23.5618712Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159441:x:10159441:20000000:LUCAS FERNANDES RAMOS:/home/c159441:
2026-06-08T14:00:23.5619223Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159093:x:10159093:20000000:JOAO PAULO CAMARGO DOS SANTOS:/home/c159093:
2026-06-08T14:00:23.5619729Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c105198:x:10105198:20000000:RICARDO BERNARDES COELHO:/home/c105198:/bin/bash
2026-06-08T14:00:23.5622660Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158540:x:10158540:20000000:FABRICIO DO PRADO BELBETH:/home/c158540:
2026-06-08T14:00:23.5623037Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158805:x:10158805:20000000:GABRIEL MESQUITA GUSMAO:/home/c158805:/bin/bash
2026-06-08T14:00:23.5623393Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f795848:x:10795848:20000000:GUILHERME DA COSTA GOMES:/home/f795848:
2026-06-08T14:00:23.5624806Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159032:x:10159032:20000000:MARCOS PAULO GUARIENTO BASTIDA:/home/c159032:/bin/bash
2026-06-08T14:00:23.5625154Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159112:x:10159112:20000000:EVERTON ANDRE:/home/c159112:
2026-06-08T14:00:23.5625647Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158883:x:10158883:20000000:WILLIAM SANTOS DA SILVA MARTINS:/home/c158883:
2026-06-08T14:00:23.5626349Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159555:x:10159555:20000000:ROBSON LOPES SOARES:/home/c159555:
2026-06-08T14:00:23.5627576Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158455:x:10158455:20000000:KEVIN DE FREITAS SALES:/home/c158455:/bin/bash
2026-06-08T14:00:23.5627924Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159730:x:10159730:20000000:GABRIEL MESQUITA OLIVEIRA:/home/c159730:
2026-06-08T14:00:23.5629915Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159690:x:10159690:20000000:DAVI GONCALVES KAIPPER:/home/c159690:
2026-06-08T14:00:23.5630277Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159642:x:10159642:20000000:VITOR ORNELAS ALVIM:/home/c159642:
2026-06-08T14:00:23.5631951Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159680:x:10159680:20000000:VINICIUS SAKAI ROQUE:/home/c159680:
2026-06-08T14:00:23.5632452Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f520203:x:10520203:20000000:RODRIGO BRINCKMANN MATOS DE SOUZA:/home/f520203:
2026-06-08T14:00:23.5635694Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158847:x:10158847:20000000:JOSE MACARIO MONTEIRO PASSALINI:/home/c158847:/bin/bash
2026-06-08T14:00:23.5636069Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f778897:x:10778897:20000000:PEDRO HENRIQUE BERNARDES SOLVELINO:/home/f778897:/bin/bash
2026-06-08T14:00:23.5636419Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c130820:x:10130820:20000000:ARIANE SANTANA BARROS:/home/c130820:
2026-06-08T14:00:23.5636773Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159758:x:10159758:20000000:DANIEL ANTONIO MIRANDA BASTOS:/home/c159758:
2026-06-08T14:00:23.5637111Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159773:x:10159773:20000000:BRUNO CARVALHO CABRAL:/home/c159773:
2026-06-08T14:00:23.5637449Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159759:x:10159759:20000000:JOAO PEDRO SILVA SOUSA:/home/c159759:
2026-06-08T14:00:23.5639377Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c096117:x:10096117:20000000:LUIZ AUGUSTO DINAMARCA BARNA:/home/c096117:
2026-06-08T14:00:23.5639744Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c024450:x:10024450:20000000:PAULO DE TARSO CAROZZI DE MIRANDA:/home/c024450:
2026-06-08T14:00:23.5640351Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159002:x:10159002:20000000:IAGO INTERAMINENSE GOMES:/home/c159002:/bin/bash
2026-06-08T14:00:23.5641038Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159008:x:10159008:20000000:ROMULO DE OLIVEIRA CARVALHO:/home/c159008:/bin/bash
2026-06-08T14:00:23.5645961Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c130147:x:10130147:20000000:DANTE GOMES DANTAS DE MENEZES:/home/c130147:/bin/bash
2026-06-08T14:00:23.5646473Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c081918:x:10081918:20000000:CARLOS ROBERTO NEVES SELES:/home/c081918:
2026-06-08T14:00:23.5646831Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159586:x:10159586:20000000:EDIGAR PIEROTT TORRES:/home/c159586:/bin/bash
2026-06-08T14:00:23.5647179Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159811:x:10159811:20000000:GABRIELA DE ARAUJO MACEDO:/home/c159811:
2026-06-08T14:00:23.5647537Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158782:x:10158782:20000000:TIAGO SILVA MACHADO:/home/c158782:/bin/bash
2026-06-08T14:00:23.5647908Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158870:x:10158870:20000000:CASSIANO MEDEIROS VIEIRA JUNIOR:/home/c158870:/bin/bash
2026-06-08T14:00:23.5648290Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158827:x:10158827:20000000:DOUGLAS HENRIQUE LEMOS LEAL:/home/c158827:/bin/bash
2026-06-08T14:00:23.5648655Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a500324:x:10500324:30000001:WANDERSON CARLOS MARTINS SILVA:/home/a500324:/bin/bash
2026-06-08T14:00:23.5649097Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f554992:x:10554992:20000000:EDUARDO MACHADO DE OLIVEIRA:/home/f554992:/bin/bash
2026-06-08T14:00:23.5649474Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159459:x:10159459:20000000:PEDRO HENRIQUE BOSE XIMENES PEDROSA:/home/c159459:/bin/bash
2026-06-08T14:00:23.5649829Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159520:x:10159520:20000000:MAIRA NUNES ROCHA:/home/c159520:
2026-06-08T14:00:23.5650170Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159524:x:10159524:20000000:LUCAS OLIVEIRA NADIER:/home/c159524:
2026-06-08T14:00:23.5650630Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f731719:x:10731719:20000000:ALVARO PEREIRA DO NASCIMENTO:/home/f731719:/bin/bash
2026-06-08T14:00:23.5651995Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159550:x:10159550:20000000:PHILIPE ABREU RIBEIRO MENDES:/home/c159550:/bin/bash
2026-06-08T14:00:23.5652842Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159573:x:10159573:20000000:EDUARDO DA SILVA RODRIGUES:/home/c159573:/bin/bash
2026-06-08T14:00:23.5653237Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159574:x:10159574:20000000:JUAN PATRICK BARAO DE MENEZES:/home/c159574:/bin/bash
2026-06-08T14:00:23.5654294Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159540:x:10159540:20000000:JUAN SILVA DO NASCIMENTO:/home/c159540:/bin/bash
2026-06-08T14:00:23.5662910Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159526:x:10159526:20000000:CHRISTOPHER ALBINO CORREA:/home/c159526:/bin/bash
2026-06-08T14:00:23.5663392Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159763:x:10159763:20000000:THIAGO SIQUEIRA GOMES:/home/c159763:
2026-06-08T14:00:23.5663823Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c128484:x:10128484:20000000:RAFAEL BARBOZA DA SILVA:/home/c128484:/bin/bash
2026-06-08T14:00:23.5664180Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c051797:x:10051797:20000000:DIEGO LOUBACK RUFINO:/home/c051797:/bin/bash
2026-06-08T14:00:23.5664765Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f603334:x:10603334:20000000:SILAS REINHOLD HEIN:/home/f603334:/bin/bash
2026-06-08T14:00:23.5665127Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p939695:x:10939695:20000000:EDSON MESQUITA FIGUEIREDO:/home/p939695:/bin/bash
2026-06-08T14:00:23.5665493Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c157576:x:10157576:20000000:IRAECIO DE SOUSA CARVALHO:/home/c157576:/bin/bash
2026-06-08T14:00:23.5665842Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159481:x:10159481:20000000:PEDRO ALMEIDA SOARES:/home/c159481:/bin/bash
2026-06-08T14:00:23.5666280Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159044:x:10159044:20000000:GUILHERME SANTOS CAMPOS:/home/c159044:/bin/bash
2026-06-08T14:00:23.5666670Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c149120:x:10149120:20000000:WENDEL SILVA SANTOS:/home/c149120:/bin/bash
2026-06-08T14:00:23.5667021Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159087:x:10159087:20000000:GUILHERME HONORIO BORSARI:/home/c159087:/bin/bash
2026-06-08T14:00:23.5667377Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159080:x:10159080:20000000:MURILO DOS SANTOS AMARAL:/home/c159080:/bin/bash
2026-06-08T14:00:23.5667720Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159728:x:10159728:20000000:TERCIO GABRIEL DE JESUS:/home/c159728:
2026-06-08T14:00:23.5668066Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159623:x:10159623:20000000:NIVALDO QUIDUTE DE SOUSA NETO:/home/c159623:
2026-06-08T14:00:23.5668514Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f999843:x:10999843:20000000:EDEHILTON ALVES AZEVEDO CARDOSO:/home/f999843:/bin/bash
2026-06-08T14:00:23.5668902Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159454:x:10159454:20000000:ALEXANDRE AUGUSTO GUIMARAES TAVEIRA:/home/c159454:
2026-06-08T14:00:23.5669261Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159549:x:10159549:20000000:GABRIEL THEOPHILO DE SOUZA FIGUEIRA:/home/c159549:/bin/bash
2026-06-08T14:00:23.5669685Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158818:x:10158818:20000000:ILBER MENDES MAIA:/home/c158818:/bin/bash
2026-06-08T14:00:23.5670029Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158815:x:10158815:20000000:VINICIUS BATISTA FERREIRA:/home/c158815:
2026-06-08T14:00:23.5670466Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f779837:x:10779837:20000000:BRUNO ALVES CARNEIRO:/home/f779837:
2026-06-08T14:00:23.5670929Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159640:x:10159640:20000000:LEONARDO MAXIMO SILVA:/home/c159640:/bin/bash
2026-06-08T14:00:23.5671271Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159434:x:10159434:20000000:JOAO GABRIEL RIBEIRO RANGEL:/home/c159434:
2026-06-08T14:00:23.5671621Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158895:x:10158895:20000000:MARCELO YPIRANGA DOS GUARANYS:/home/c158895:
2026-06-08T14:00:23.5671959Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159813:x:10159813:20000000:JOAO BATISTA MATOS DE LIRA:/home/c159813:
2026-06-08T14:00:23.5673833Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159660:x:10159660:20000000:LUCAS KISHIMA DOS SANTOS:/home/c159660:/bin/bash
2026-06-08T14:00:23.5674193Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158892:x:10158892:20000000:MATHEUS FERNANDES GONCALVES BOECHAT:/home/c158892:
2026-06-08T14:00:23.5674633Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f754483:x:10754483:20000000:ELIEZER REZENDE BALDENEBRO:/home/f754483:
2026-06-08T14:00:23.5675040Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159804:x:10159804:20000000:DANILO DOS REIS AMARAL:/home/c159804:/bin/bash
2026-06-08T14:00:23.5675649Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159531:x:10159531:20000000:THAYNA PINTO FAGUNDES:/home/c159531:/bin/bash
2026-06-08T14:00:23.5675997Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159046:x:10159046:20000000:LUCAS MINE NACAOCA:/home/c159046:
2026-06-08T14:00:23.5676342Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c051701:x:10051701:20000000:RAFAEL MITSURU CAVALCANTI YOSHIDA:/home/c051701:
2026-06-08T14:00:23.5676697Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159783:x:10159783:20000000:MATEUS LUIZ NONATO SANTA CRUZ:/home/c159783:
2026-06-08T14:00:23.5677059Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p730574:x:10730574:30000004:DANILO ALBUQUERQUE DOS SANTOS E SOUZA:/home/p730574:
2026-06-08T14:00:23.5677410Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f707618:x:10707618:20000000:MARCIO LUIZ MORAIS:/home/f707618:/bin/bash
2026-06-08T14:00:23.5677751Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159567:x:10159567:20000000:VINICIUS PEIXOTO LIMA:/home/c159567:
2026-06-08T14:00:23.5678222Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159554:x:10159554:20000000:GIOVANNI ALVES RIBEIRO DUARTE:/home/c159554:
2026-06-08T14:00:23.5678656Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f929540:x:10929540:20000000:MARINALDO OLIVEIRA SANTOS JUNIOR:/home/f929540:/bin/bash
2026-06-08T14:00:23.5679018Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f509436:x:10509436:20000000:PEDRO DIAMICO PRACA:/home/f509436:/bin/bash
2026-06-08T14:00:23.5679358Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158795:x:10158795:20000000:PEDRO HENRIQUE GOMES DE SOUSA:/home/c158795:
2026-06-08T14:00:23.5679800Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159670:x:10159670:20000000:MATHEUS LACERDA DA SILVEIRA:/home/c159670:
2026-06-08T14:00:23.5680148Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159634:x:10159634:20000000:ERIC VINICIUS FELIX SILVA:/home/c159634:/bin/bash
2026-06-08T14:00:23.5680565Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159738:x:10159738:20000000:GABRIEL RIBEIRO DA SILVA:/home/c159738:/bin/bash
2026-06-08T14:00:23.5680978Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c114155:x:10114155:20000000:ADRIANO AUGUSTO AMORIM:/home/c114155:/bin/bash
2026-06-08T14:00:23.5681328Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159772:x:10159772:20000000:GABRIEL DA SILVA MENDES DE MORAES:/home/c159772:
2026-06-08T14:00:23.5681677Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159011:x:10159011:20000000:JOAO VITOR BUENO DA SILVA:/home/c159011:/bin/bash
2026-06-08T14:00:23.5682032Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a089638:x:10089638:30000001:MARCO AURELIO MENDES DA SILVA:/home/a089638:/bin/bash
2026-06-08T14:00:23.5682397Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159052:x:10159052:20000000:AMANDA REGINA DE OLIVEIRA MAZUROK:/home/c159052:/bin/bash
2026-06-08T14:00:23.5683158Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159101:x:10159101:20000000:MARINA YUMI KANADANI:/home/c159101:/bin/bash
2026-06-08T14:00:23.5684392Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c071615:x:10071615:20000000:ULISSES MOREIRA PAROLA:/home/c071615:/bin/bash
2026-06-08T14:00:23.5684740Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p759393:x:10759393:20000000:MARCELO PEREIRA DOS REIS:/home/p759393:/bin/bash
2026-06-08T14:00:23.5685180Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p585678:x:10585678:20000000:FABIO CIRIACO DOS SANTOS:/home/p585678:/bin/bash
2026-06-08T14:00:23.5685641Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158852:x:10158852:20000000:IGOR PACHECO PEREIRA:/home/c158852:/bin/bash
2026-06-08T14:00:23.5686230Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f652215:x:10652215:20000000:LUIZ EDUARDO PIMPAO SILVA:/home/f652215:
2026-06-08T14:00:23.5686585Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p595916:x:10595916:20000000:LUIZ HENRIQUE COUTINHO MARIANO:/home/p595916:/bin/bash
2026-06-08T14:00:23.5687508Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159625:x:10159625:20000000:JOAO PEDRO SILVA DE CARVALHO:/home/c159625:
2026-06-08T14:00:23.5688213Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159711:x:10159711:20000000:JULIO CESAR NOYA CASTIGLIONI:/home/c159711:/bin/bash
2026-06-08T14:00:23.5688670Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159712:x:10159712:20000000:VALDENOR MARTINS DE MORAIS JUNIOR:/home/c159712:/bin/bash
2026-06-08T14:00:23.5689119Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a779823:x:10779823:30000001:BRUNO RODRIGUES DE CARVALHO:/home/a779823:/bin/bash
2026-06-08T14:00:23.5691583Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158413:x:10158413:20000000:PABLO BOAVENTURA MENEZES ASSUNCAO:/home/c158413:/bin/bash
2026-06-08T14:00:23.5691990Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159632:x:10159632:20000000:LEANDRO VELOSO RODRIGUES:/home/c159632:/bin/bash
2026-06-08T14:00:23.5692607Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f548767:x:10548767:20000000:ANDERSON MATOS BONAVIDES:/home/f548767:
2026-06-08T14:00:23.5692987Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159614:x:10159614:20000000:DANIEL GIACOMIN RAMPINELLI:/home/c159614:/bin/bash
2026-06-08T14:00:23.5693352Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159684:x:10159684:20000000:ANDRE KENZO OSHIRO CALDEIRA:/home/c159684:/bin/bash
2026-06-08T14:00:23.5693708Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159749:x:10159749:20000000:MATHEUS DE SA DE SOUZA:/home/c159749:/bin/bash
2026-06-08T14:00:23.5694230Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159691:x:10159691:20000000:LEONARDO MILOMES VITORIANO:/home/c159691:/bin/bash
2026-06-08T14:00:23.5694600Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p583026:x:10583026:20000000:MARINETE DE HOLANDA AGUIAR:/home/p583026:/bin/bash
2026-06-08T14:00:23.5694955Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f782691:x:10782691:20000000:LEONARDO LIMA DE OLIVEIRA:/home/f782691:/bin/bash
2026-06-08T14:00:23.5695298Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f541286:x:10541286:20000000:WELTON DE OLIVEIRA LIMA:/home/f541286:
2026-06-08T14:00:23.5695887Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c083238:x:10083238:20000000:RENATA DE LIMA LOPES:/home/c083238:/bin/bash
2026-06-08T14:00:23.5696467Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f530369:x:10530369:20000000:JAQUELINE PEREIRA DA SILVA:/home/f530369:/bin/bash
2026-06-08T14:00:23.5697694Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p564449:x:10564449:20000000:KALLEBE MONTEIRO VIEIRA:/home/p564449:/bin/bash
2026-06-08T14:00:23.5698039Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159734:x:10159734:20000000:DAVI LIMA NOGUEIRA:/home/c159734:
2026-06-08T14:00:23.5698466Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159696:x:10159696:20000000:ANA CAROLINE MANSO DE CARVALHO:/home/c159696:/bin/bash
2026-06-08T14:00:23.5699179Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p780925:x:10780925:20000000:LEANDRO SILVEIRA DE MEDEIROS:/home/p780925:/bin/bash
2026-06-08T14:00:23.5699552Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159732:x:10159732:20000000:KAIQUE NOGUEIRA SOUZA DOS SANTOS:/home/c159732:
2026-06-08T14:00:23.5700140Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159665:x:10159665:20000000:IAN MARCO GONTIJO RAPOSO:/home/c159665:
2026-06-08T14:00:23.5701407Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159761:x:10159761:20000000:RONIVELTON LEMES DE CARVALHO FILHO:/home/c159761:
2026-06-08T14:00:23.5701766Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158468:x:10158468:20000000:GABRIEL MAURICIO CHAGAS SILVA:/home/c158468:/bin/bash
2026-06-08T14:00:23.5702425Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158859:x:10158859:20000000:SUELLEN DE SOUZA RIBEIRO:/home/c158859:
2026-06-08T14:00:23.5702927Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158397:x:10158397:20000000:LETONIO JOSE DA SILVA:/home/c158397:
2026-06-08T14:00:23.5703669Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159432:x:10159432:20000000:RODRIGO OLIVEIRA DO MONTE REGATO:/home/c159432:/bin/bash
2026-06-08T14:00:23.5704040Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159570:x:10159570:20000000:KAUA ANASTACIO DOS SANTOS:/home/c159570:/bin/bash
2026-06-08T14:00:23.5704604Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159552:x:10159552:20000000:PATRICK LOUREIRO DA SILVA:/home/c159552:/bin/bash
2026-06-08T14:00:23.5705086Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c078309:x:10078309:20000000:EDGARD GUIMARAES REIS:/home/c078309:
2026-06-08T14:00:23.5705869Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f514870:x:10514870:20000000:FABIANO GUIMARAES LAURO VIEIRA:/home/f514870:/bin/bash
2026-06-08T14:00:23.5706234Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159679:x:10159679:20000000:GABRIEL TERRY DE SOUZA CAVALCANTE:/home/c159679:
2026-06-08T14:00:23.5706657Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159615:x:10159615:20000000:GRAYCE GABRIELLE DE OLIVEIRA LIMA:/home/c159615:/bin/bash
2026-06-08T14:00:23.5707010Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159645:x:10159645:20000000:DANIEL GARCEZ DE SOUSA:/home/c159645:/bin/bash
2026-06-08T14:00:23.5707551Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159697:x:10159697:20000000:DAVI BESSA DE SOUSA:/home/c159697:/bin/bash
2026-06-08T14:00:23.5707888Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c051619:x:10051619:20000000:FABIO NATALI:/home/c051619:
2026-06-08T14:00:23.5708644Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158845:x:10158845:20000000:FABIO DE AGUIAR GUEDES:/home/c158845:
2026-06-08T14:00:23.5709073Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159741:x:10159741:20000000:JOAO GUSTAVO MATOS MARANHAO:/home/c159741:/bin/bash
2026-06-08T14:00:23.5710063Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159687:x:10159687:20000000:PEDRO AUGUSTO MORETTI MOREIRA:/home/c159687:/bin/bash
2026-06-08T14:00:23.5710470Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159700:x:10159700:20000000:GABRIEL ELEUTERIO PRADO:/home/c159700:
2026-06-08T14:00:23.5710826Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159576:x:10159576:20000000:GUSTAVO RIBEIRO DA SILVA DOS REIS:/home/c159576:/bin/bash
2026-06-08T14:00:23.5711873Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159519:x:10159519:20000000:RAFAEL DA SILVA CORDEIRO:/home/c159519:
2026-06-08T14:00:23.5712211Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159472:x:10159472:20000000:MARIANA VICTOR FERREIRA:/home/c159472:
2026-06-08T14:00:23.5712960Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159488:x:10159488:20000000:DIOGO BOECHAT LESSA:/home/c159488:
2026-06-08T14:00:23.5714174Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159919:x:10159919:20000000:FERNANDO ROSENDO DE ARAUJO NETO:/home/c159919:
2026-06-08T14:00:23.5714524Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159917:x:10159917:20000000:LEONARDO SOUZA SANTOS ALENCAR:/home/c159917:/bin/bash
2026-06-08T14:00:23.5715133Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159924:x:10159924:20000000:LUCAS VINICIUS DA SILVA:/home/c159924:
2026-06-08T14:00:23.5715710Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159930:x:10159930:20000000:VINICIUS VITOR DAS NEVES SILVA:/home/c159930:
2026-06-08T14:00:23.5716177Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159900:x:10159900:20000000:ARTHUR MOURA DE ARRUDA:/home/c159900:
2026-06-08T14:00:23.5716577Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159915:x:10159915:20000000:IVSON DE ASSIS CAVALCANTI:/home/c159915:
2026-06-08T14:00:23.5717272Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159682:x:10159682:20000000:THIAGO BARBOSA NAVARRO:/home/c159682:/bin/bash
2026-06-08T14:00:23.5717836Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159805:x:10159805:20000000:MAXWELL RIBEIRO RODRIGUES:/home/c159805:/bin/bash
2026-06-08T14:00:23.5718401Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159621:x:10159621:20000000:RAFAEL BECHELLI PAVIATO:/home/c159621:/bin/bash
2026-06-08T14:00:23.5718834Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159908:x:10159908:20000000:LEANDRO KHALEL PIMENTEL DOS SANTOS:/home/c159908:
2026-06-08T14:00:23.5719495Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159714:x:10159714:20000000:BRENNO PEREIRA CORDEIRO:/home/c159714:/bin/bash
2026-06-08T14:00:23.5720040Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159629:x:10159629:20000000:CAIQUE CESAR GARGEL DE OLIVEIRA:/home/c159629:
2026-06-08T14:00:23.5720398Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159641:x:10159641:20000000:PEDRO LUCAS BRUNO:/home/c159641:/bin/bash
2026-06-08T14:00:23.5721314Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159566:x:10159566:20000000:FABIANA MARIA IGNACIO DA SILVA:/home/c159566:
2026-06-08T14:00:23.5721771Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159913:x:10159913:20000000:DAVI FERNANDEZ FRANCA ARAGAO:/home/c159913:
2026-06-08T14:00:23.5722312Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f696525:x:10696525:20000000:DENNER RIBEIRO BACELAR:/home/f696525:
2026-06-08T14:00:23.5722950Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159532:x:10159532:20000000:PAULO ALBERTO DE OLIVEIRA LIMA:/home/c159532:
2026-06-08T14:00:23.5723517Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159528:x:10159528:20000000:FERNANDO MARINHO DE ARAUJO:/home/c159528:
2026-06-08T14:00:23.5723949Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159791:x:10159791:20000000:ERIK LOPES DA SILVA:/home/c159791:/bin/bash
2026-06-08T14:00:23.5724387Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159431:x:10159431:20000000:PEDRO LIDIO DA SILVA:/home/c159431:
2026-06-08T14:00:23.5725080Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159878:x:10159878:20000000:VICENTE DO CARMO SA E SILVA:/home/c159878:/bin/bash
2026-06-08T14:00:23.5725561Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159868:x:10159868:20000000:FELIPE ANDRADE BARBOSA:/home/c159868:/bin/bash
2026-06-08T14:00:23.5726456Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159882:x:10159882:20000000:RAFAEL FELIPE VIANA ALVES:/home/c159882:/bin/bash
2026-06-08T14:00:23.5727000Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159889:x:10159889:20000000:ANTONIO HENRIQUES PEREIRA:/home/c159889:
2026-06-08T14:00:23.5727414Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159858:x:10159858:20000000:RAFAEL MOREIRA MELO:/home/c159858:
2026-06-08T14:00:23.5727761Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159694:x:10159694:20000000:ISRAEL BORGES ROQUETE DE MELO:/home/c159694:
2026-06-08T14:00:23.5728363Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f781426:x:10781426:20000000:FLAVIO ARAUJO DA SILVA:/home/f781426:/bin/bash
2026-06-08T14:00:23.5728930Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f947732:x:10947732:20000000:JORDANA ELISANDRA VITORINO NADUR:/home/f947732:/bin/bash
2026-06-08T14:00:23.5729490Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159942:x:10159942:20000000:LUCAS NATAN DE ALMEIDA MELO:/home/c159942:
2026-06-08T14:00:23.5729947Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159575:x:10159575:20000000:MATHEUS VICTOR GOMES DUARTE RIBEIRO:/home/c159575:/bin/bash
2026-06-08T14:00:23.5730402Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159077:x:10159077:20000000:BRUNA DA SILVA PIRES:/home/c159077:/bin/bash
2026-06-08T14:00:23.5731083Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158387:x:10158387:20000000:MATHEUS NERIS ROMEIRO:/home/c158387:/bin/bash
2026-06-08T14:00:23.5732140Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p730714:x:10730714:20000000:MARCILLIO ANDRE BOMSUCCESSO MOREIRA:/home/p730714:/bin/bash
2026-06-08T14:00:23.5732852Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158808:x:10158808:20000000:FERNANDO FERNANDES DE SOUZA:/home/c158808:/bin/bash
2026-06-08T14:00:23.5733407Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f664092:x:10664092:20000000:ALESSANDRO MARCANTE NARCISO:/home/f664092:
2026-06-08T14:00:23.5734047Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159710:x:10159710:20000000:KAUA OTAVIANO TEIXEIRA:/home/c159710:
2026-06-08T14:00:23.5734406Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159949:x:10159949:20000000:IGOR THIAGO DE ANDRADE LIMA:/home/c159949:/bin/bash
2026-06-08T14:00:23.5734955Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f625012:x:10625012:20000000:ANA MARA DE SOUZA:/home/f625012:/bin/bash
2026-06-08T14:00:23.5735499Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f589418:x:10589418:20000000:ELAINE CRISTINA SEIXAS DEPIERI:/home/f589418:/bin/bash
2026-06-08T14:00:23.5736132Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f927133:x:10927133:20000000:LAILA CAROLINE COSTA DE OLIVEIRA:/home/f927133:/bin/bash
2026-06-08T14:00:23.5736655Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f753195:x:10753195:20000000:MARCELO CARVALHO FERNANDES CANHAMERO:/home/f753195:/bin/bash
2026-06-08T14:00:23.5737143Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c080684:x:10080684:20000000:RODRIGO DO NASCIMENTO PAZ:/home/c080684:/bin/bash
2026-06-08T14:00:23.5737814Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f578727:x:10578727:20000000:RAPHAEL JUNEO CASTRO DE SOUZA:/home/f578727:/bin/bash
2026-06-08T14:00:23.5738191Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159947:x:10159947:20000000:MARCO ANTONIO COSTA BASTOS:/home/c159947:
2026-06-08T14:00:23.5738676Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c126908:x:10126908:20000000:LUIS FELIPE VELOSO DE ARAUJO:/home/c126908:/bin/bash
2026-06-08T14:00:23.5739650Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159688:x:10159688:20000000:LUAN RODRIGUES PAZ:/home/c159688:/bin/bash
2026-06-08T14:00:23.5740472Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159864:x:10159864:20000000:JEFFERSON YURI LIMA:/home/c159864:/bin/bash
2026-06-08T14:00:23.5740934Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159616:x:10159616:20000000:PEDRO VITOR VILAR PITZER CLEIS:/home/c159616:/bin/bash
2026-06-08T14:00:23.5741437Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c073395:x:10073395:20000000:BRUNO LEONARDO OTERO DA SILVA:/home/c073395:/bin/bash
2026-06-08T14:00:23.5741911Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c095680:x:10095680:20000000:VILMAR BATISTA DA SILVA:/home/c095680:
2026-06-08T14:00:23.5742535Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159840:x:10159840:20000000:VICTOR GONCALVES DOS SANTOS:/home/c159840:
2026-06-08T14:00:23.5743099Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159743:x:10159743:20000000:ANDERSON SILVA DE LIMA ROCHA:/home/c159743:/bin/bash
2026-06-08T14:00:23.5743451Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c153002:x:10153002:20000000:JESSICA SANTOS LIMA:/home/c153002:
2026-06-08T14:00:23.5744107Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158838:x:10158838:20000000:FERNANDO LOBO RIBEIRO:/home/c158838:/bin/bash
2026-06-08T14:00:23.5744559Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159785:x:10159785:20000000:CLAUDIO BERTINI BATISTA:/home/c159785:/bin/bash
2026-06-08T14:00:23.5744963Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159782:x:10159782:20000000:ROBERTO MURILO MARTINS CORDEIRO:/home/c159782:/bin/bash
2026-06-08T14:00:23.5745438Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159038:x:10159038:20000000:CAIO ROBERTO SANCHES FLORENCIO:/home/c159038:/bin/bash
2026-06-08T14:00:23.5746045Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159987:x:10159987:20000000:GLORIA ANDRADE VAZ CURADO B FARRAPEIRA:/home/c159987:
2026-06-08T14:00:23.5746611Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159794:x:10159794:20000000:VANDERSON QUIRINO DOS SANTOS:/home/c159794:/bin/bash
2026-06-08T14:00:23.5747088Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159444:x:10159444:20000000:TALLISON DERICK DE CASTRO DA SILVA:/home/c159444:
2026-06-08T14:00:23.5747544Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f785720:x:10785720:20000000:MATHEUS MATTIOLI MORO:/home/f785720:
2026-06-08T14:00:23.5748262Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p901146:x:10901146:20000000:KARISTON GOYA SUGIMOTO:/home/p901146:/bin/bash
2026-06-08T14:00:23.5748636Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a159674:x:10159674:30000001:JOAO PAULO MARCONI D OLIVEIRA:/home/a159674:/bin/bash
2026-06-08T14:00:23.5749710Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f793332:x:10793332:20000000:FABIANO SANTOS DA SILVA:/home/f793332:
2026-06-08T14:00:23.5750081Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p781430:x:10781430:20000000:STEFAN PIRES DE ALMEIDA:/home/p781430:/bin/bash
2026-06-08T14:00:23.5750568Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p790903:x:10790903:20000000:JOAO RAFAEL FREITAS BONILHA:/home/p790903:/bin/bash
2026-06-08T14:00:23.5750933Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159954:x:10159954:20000000:LUCAS ALMEIDA TROVAO:/home/c159954:/bin/bash
2026-06-08T14:00:23.5752207Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159939:x:10159939:20000000:EDUARDO PERES DE LIMA:/home/c159939:/bin/bash
2026-06-08T14:00:23.5752616Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159962:x:10159962:20000000:RAISSA DOS SANTOS SALES:/home/c159962:/bin/bash
2026-06-08T14:00:23.5753233Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159950:x:10159950:20000000:FELIPE CUNHA LIMA:/home/c159950:/bin/bash
2026-06-08T14:00:23.5753600Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159863:x:10159863:20000000:JOAO VICTOR SANTOS SILVA:/home/c159863:/bin/bash
2026-06-08T14:00:23.5754030Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f907008:x:10907008:20000000:JHONATAN FLORENCIO COSTA:/home/f907008:
2026-06-08T14:00:23.5754444Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159843:x:10159843:20000000:MATEUS PEVIDOR REIS:/home/c159843:
2026-06-08T14:00:23.5754869Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159935:x:10159935:20000000:ISRAEL SOUSA DA SILVA:/home/c159935:
2026-06-08T14:00:23.5755371Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159914:x:10159914:20000000:GABRIEL VINICIUS ARAUJO DE LIMA:/home/c159914:/bin/bash
2026-06-08T14:00:23.5757043Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p596698:x:10596698:20000000:MICHELE DUARTE MIRANDA ROSA:/home/p596698:/bin/bash
2026-06-08T14:00:23.5757415Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159841:x:10159841:20000000:WELLISON MORAIS DIAS:/home/c159841:/bin/bash
2026-06-08T14:00:23.5757946Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159838:x:10159838:20000000:MATHEUS FEDERICI ABRAS:/home/c159838:/bin/bash
2026-06-08T14:00:23.5758550Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f526225:x:10526225:20000000:LEANDRO PARANHOS CARVALHO DE SOUZA:/home/f526225:
2026-06-08T14:00:23.5759522Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159637:x:10159637:20000000:JOSE ROBERTO INTERAMINENSE SOARES:/home/c159637:/bin/bash
2026-06-08T14:00:23.5760316Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f653400:x:10653400:20000000:SOLLON RODRIGUES SOARES:/home/f653400:/bin/bash
2026-06-08T14:00:23.5761220Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c084642:x:10084642:20000000:FABIANO LIMA BARBOSA:/home/c084642:/bin/bash
2026-06-08T14:00:23.5763610Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158488:x:10158488:20000000:DAVID COUTO BITENCOURT:/home/c158488:/bin/bash
2026-06-08T14:00:23.5764207Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159445:x:10159445:20000000:MATEUS DA SILVA MARIANO:/home/c159445:/bin/bash
2026-06-08T14:00:23.5764715Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c097591:x:10097591:20000000:ALEXANDRE HELFRICH:/home/c097591:/bin/bash
2026-06-08T14:00:23.5765486Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159885:x:10159885:20000000:VINICIUS NORONHA ALMEIDA:/home/c159885:
2026-06-08T14:00:23.5766341Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158799:x:10158799:20000000:LUCAS PEREIRA DAMICO:/home/c158799:/bin/bash
2026-06-08T14:00:23.5767021Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159916:x:10159916:20000000:DAVID ESDRAS FERREIRA DA SILVA:/home/c159916:/bin/bash
2026-06-08T14:00:23.5767507Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158863:x:10158863:20000000:ALEXANDRE PATRIOTA DE LIMA:/home/c158863:/bin/bash
2026-06-08T14:00:23.5767957Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158426:x:10158426:20000000:GUY NEVES BARRETO:/home/c158426:/bin/bash
2026-06-08T14:00:23.5769991Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p718707:x:10718707:20000000:EWERTON DE JESUS CARVALHO:/home/p718707:/bin/bash
2026-06-08T14:00:23.5770612Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159969:x:10159969:20000000:CAIO AUGUSTO BARBOSA VERAS:/home/c159969:
2026-06-08T14:00:23.5771510Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159956:x:10159956:20000000:LARISSA ROQUE CARVALHO:/home/c159956:/bin/bash
2026-06-08T14:00:23.5771938Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159944:x:10159944:20000000:LIVIA SILVA DE OLIVEIRA:/home/c159944:/bin/bash
2026-06-08T14:00:23.5772679Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159765:x:10159765:20000000:PEDRO PAULO DIAS DOS SANTOS:/home/c159765:
2026-06-08T14:00:23.5773051Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159768:x:10159768:20000000:GUSTAVO MARQUES REIS:/home/c159768:
2026-06-08T14:00:23.5773413Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158543:x:10158543:20000000:AILTON ANTONIO DE ARAUJO:/home/c158543:
2026-06-08T14:00:23.5773779Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159074:x:10159074:20000000:KENZO MAGLIOCCA TANIZAKI:/home/c159074:/bin/bash
2026-06-08T14:00:23.5774132Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f933802:x:10933802:20000000:JOEDSON COSTA DOS SANTOS GAMA:/home/f933802:
2026-06-08T14:00:23.5774501Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159972:x:10159972:20000000:GUILHERME FERNANDES E SILVA:/home/c159972:/bin/bash
2026-06-08T14:00:23.5774972Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c139551:x:10139551:20000000:LUANA FERREIRA SILVA:/home/c139551:/bin/bash
2026-06-08T14:00:23.5775327Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f795874:x:10795874:20000000:RODRIGO OLIVEIRA COELHO:/home/f795874:/bin/bash
2026-06-08T14:00:23.5775684Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f930527:x:10930527:20000000:ARTHUR PARAISO JUNIOR DA COSTA:/home/f930527:/bin/bash
2026-06-08T14:00:23.5776117Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p925583:x:10925583:20000000:SUSI GOMES DE ALMEIDA DOLLAY:/home/p925583:/bin/bash
2026-06-08T14:00:23.5776477Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159499:x:10159499:20000000:GUSTAVO HENRIQUE RODRIGUES B M LIMA:/home/c159499:
2026-06-08T14:00:23.5776826Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159125:x:10159125:30000004:LUIS FELIPE DE OLIVEIRA ARAUJO:/home/c159125:
2026-06-08T14:00:23.5777404Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f932980:x:10932980:20000000:ERNESTO FLORES BARREIRA:/home/f932980:
2026-06-08T14:00:23.5777915Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f542474:x:10542474:20000000:TELMA OLINDINA DE LIMA:/home/f542474:
2026-06-08T14:00:23.5779121Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c053102:x:10053102:20000000:VICTOR OSSAILLE FILHO:/home/c053102:/bin/bash
2026-06-08T14:00:23.5779482Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158886:x:10158886:20000000:JOAO PEDRO ROLDAN DA SILVA:/home/c158886:
2026-06-08T14:00:23.5779837Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159965:x:10159965:20000000:ANTHONY GABRIEL ANDRADE SANTOS:/home/c159965:/bin/bash
2026-06-08T14:00:23.5780289Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159955:x:10159955:20000000:WESLEY FELIPE RODRIGUES DA SILVA:/home/c159955:/bin/bash
2026-06-08T14:00:23.5780654Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159879:x:10159879:20000000:LARISSA VALADARES SILQUEIRA:/home/c159879:
2026-06-08T14:00:23.5780989Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159846:x:10159846:20000000:THIAGO SOUZA SANTOS:/home/c159846:
2026-06-08T14:00:23.5781477Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p906598:x:10906598:20000000:JOSE MARIANO FILHO:/home/p906598:/bin/bash
2026-06-08T14:00:23.5781837Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p780939:x:10780939:20000000:FERNANDO HENRIQUE BENATTI:/home/p780939:/bin/bash
2026-06-08T14:00:23.5782240Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159104:x:10159104:20000000:IGOR HUTSON DIAS FONTES:/home/c159104:/bin/bash
2026-06-08T14:00:23.5783354Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158803:x:10158803:20000000:PATRICK WARLEY TELLES DA SILVA:/home/c158803:/bin/bash
2026-06-08T14:00:23.5783715Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159887:x:10159887:20000000:RITA DE CASSIA BRANDAO:/home/c159887:/bin/bash
2026-06-08T14:00:23.5784077Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159442:x:10159442:20000000:REINALDO ALBUQUERQUE SIMOES:/home/c159442:/bin/bash
2026-06-08T14:00:23.5784823Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159518:x:10159518:20000000:ANTONIO LUCAS DA SILVA MERENCIO:/home/c159518:/bin/bash
2026-06-08T14:00:23.5785182Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p749917:x:10749917:20000000:SERGIO CARNEIRO DA SILVA:/home/p749917:/bin/bash
2026-06-08T14:00:23.5785527Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158807:x:10158807:20000000:IGOR CARVALHO RAMOS LEAL:/home/c158807:
2026-06-08T14:00:23.5786184Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159460:x:10159460:20000000:LUCAS SCIALFA GARCIA FUSCO DE OLIVEIRA:/home/c159460:/bin/bash
2026-06-08T14:00:23.5786678Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f674424:x:10674424:20000000:RAFAEL AMARO:/home/f674424:/bin/bash
2026-06-08T14:00:23.5787564Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159940:x:10159940:20000000:CARLOS ALEXANDRE FERNANDES FACANHA:/home/c159940:
2026-06-08T14:00:23.5789153Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f530425:x:10530425:20000000:SERGIO MURILO SANTOS DE ANDRADE:/home/f530425:
2026-06-08T14:00:23.5789896Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f799947:x:10799947:20000000:SERGIO ALEXANDRE DE AGUIAR VAZ:/home/f799947:/bin/bash
2026-06-08T14:00:23.5790244Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f590574:x:10590574:20000000:JOHN WANDERSON VIANA DA LUZ:/home/f590574:
2026-06-08T14:00:23.5790596Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159945:x:10159945:20000000:MARCO ANTONIO GUEDES BANDEIRA:/home/c159945:/bin/bash
2026-06-08T14:00:23.5790978Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158816:x:10158816:20000000:GUSTAVO VIEGAS JUCA DANTAS:/home/c158816:
2026-06-08T14:00:23.5791433Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159800:x:10159800:20000000:MARCOS PAULO DE OLIVEIRA:/home/c159800:/bin/bash
2026-06-08T14:00:23.5792212Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159113:x:10159113:20000000:ANDRE LUIZ MENDES DE MENEZES:/home/c159113:/bin/bash
2026-06-08T14:00:23.5792685Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159867:x:10159867:20000000:DIOGO CUNHA CISAR PINHEIRO:/home/c159867:/bin/bash
2026-06-08T14:00:23.5793072Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159685:x:10159685:20000000:JOSE WELLINGTON ALVES ROCHA JUNIOR:/home/c159685:/bin/bash
2026-06-08T14:00:23.5793445Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159881:x:10159881:20000000:VINICIUS MORAIS MURTA:/home/c159881:
2026-06-08T14:00:23.5794002Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159483:x:10159483:20000000:MAX DE SA SANTOS:/home/c159483:/bin/bash
2026-06-08T14:00:23.5794374Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f569906:x:10569906:20000000:RAFAEL ANGELO VIVALDI COSTA:/home/f569906:/bin/bash
2026-06-08T14:00:23.5794929Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f539250:x:10539250:20000000:LUIZ VANDERLAN MARQUES PINTO:/home/f539250:/bin/bash
2026-06-08T14:00:23.5795282Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f786967:x:10786967:20000000:LUCAS DE SOUSA SANTOS:/home/f786967:/bin/bash
2026-06-08T14:00:23.5795731Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159072:x:10159072:20000000:JOSE AUGUSTO QUEIROZ COMPAROTTO GOMES:/home/c159072:/bin/bash
2026-06-08T14:00:23.5796186Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159880:x:10159880:20000000:CRISTIANE ALVES BATISTA:/home/c159880:
2026-06-08T14:00:23.5796641Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159119:x:10159119:20000000:VLADIMIR JESUS FARIAS:/home/c159119:/bin/bash
2026-06-08T14:00:23.5796998Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159564:x:10159564:20000000:DIOGO LUIS DE FREITAS CORREA:/home/c159564:/bin/bash
2026-06-08T14:00:23.5797474Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159883:x:10159883:20000000:TACIO DE LIMA QUEIROZ:/home/c159883:/bin/bash
2026-06-08T14:00:23.5797969Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159023:x:10159023:20000000:LEANDRO BORTOLOTTO CAMARGO:/home/c159023:/bin/bash
2026-06-08T14:00:23.5798686Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c054093:x:10054093:20000000:ROBERTA CERSOSIMO SANTOS MENEZES:/home/c054093:
2026-06-08T14:00:23.5799241Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159039:x:10159039:20000000:VANESSA SOARES BORGES DA SILVA:/home/c159039:/bin/bash
2026-06-08T14:00:23.5799632Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c091628:x:10091628:2000000:ALESSANDRA BOSQUILHA:/home/c091628:/bin/bash
2026-06-08T14:00:23.5800435Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f772776:x:10772776:20000000:MARCELO CORDEIRO BASILIO:/home/f772776:/bin/bash
2026-06-08T14:00:23.5800896Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f994937:x:10994937:20000000:JOYCE ANNE PINTO RODRIGUES:/home/f994937:/bin/bash
2026-06-08T14:00:23.5801255Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f617906:x:10617906:20000000:ABRAAO HOLANDA LOPES:/home/f617906:/bin/bash
2026-06-08T14:00:23.5801612Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159893:x:10159893:20000000:RODRIGO PYRRHO NASCIMENTO:/home/c159893:/bin/bash
2026-06-08T14:00:23.5802015Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f599802:x:10599802:20000000:FABIO HELENO SOUZA DE SOUZA:/home/f599802:
2026-06-08T14:00:23.5802363Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f558655:x:10558655:20000000:GUILHERME SIMIONI WASKIEVICZ:/home/f558655:
2026-06-08T14:00:23.5802986Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159876:x:10159876:20000000:RAFAELLA FERREIRA LADEIRA GOMES:/home/c159876:/bin/bash
2026-06-08T14:00:23.5803746Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p918226:x:10918226:20000000:PEDRO VITOR RODRIGUES LEAO BEZERRA:/home/p918226:/bin/bash
2026-06-08T14:00:23.5804307Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p930526:x:10930526:20000000:MATHEUS AMERICANO:/home/p930526:/bin/bash
2026-06-08T14:00:23.5804979Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159895:x:10159895:20000000:DIEGO RAFAEL CARVALHO FARIAS:/home/c159895:/bin/bash
2026-06-08T14:00:23.5805465Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158389:x:10158389:20000000:THIAGO FERNANDES CARVALHO DE SOUZA:/home/c158389:/bin/bash
2026-06-08T14:00:23.5805974Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159862:x:10159862:20000000:PEDRO RIBEIRO MAIA:/home/c159862:/bin/bash
2026-06-08T14:00:23.5806338Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f723688:x:10723688:20000000:ANNITA RAYSSA DE FRANCA BONAVIDES:/home/f723688:/bin/bash
2026-06-08T14:00:23.5807123Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a054346:x:10054346:30000001:LUIZ EDUARDO PRATA DE PINHO TAVARES:/home/a054346:/bin/bash
2026-06-08T14:00:23.5807629Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159779:x:10159779:20000000:PEDRO CESAR ROCHA:/home/c159779:
2026-06-08T14:00:23.5807966Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159790:x:10159790:20000000:RAFAEL GOMES RIBEIRO:/home/c159790:
2026-06-08T14:00:23.5808434Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159848:x:10159848:20000000:BRUNO ESTEVES CAMPOI:/home/c159848:/bin/bash
2026-06-08T14:00:23.5808804Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c109473:x:10109473:20000000:LEANDRO GAMELEIRA DO REGO:/home/c109473:/bin/bash
2026-06-08T14:00:23.5809221Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159771:x:10159771:20000000:LUCAS LOBO ROSA DA SILVA:/home/c159771:
2026-06-08T14:00:23.5809860Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f663915:x:10663915:20000000:ARTHUR HENRIQUE SANTANA DOS SANTOS:/home/f663915:/bin/bash
2026-06-08T14:00:23.5810276Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159776:x:10159776:20000000:MATHEUS NAVES BORGES:/home/c159776:
2026-06-08T14:00:23.5811063Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f969671:x:10969671:20000000:CHARLLENE DE SOUSA GUERREIRO:/home/f969671:/bin/bash
2026-06-08T14:00:23.5811477Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160356:x:10160356:20000000:ALGEU ADELAR FERRAZ PEPES JUNIOR:/home/c160356:/bin/bash
2026-06-08T14:00:23.5812697Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a537007:x:10537007:30000001:EDUARDO COSTA E SILVA:/home/a537007:/bin/bash
2026-06-08T14:00:23.5813078Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f966660:x:10966660:20000000:ROSA MARIA RODRIGUES SOARES:/home/f966660:/bin/bash
2026-06-08T14:00:23.5813609Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160368:x:10160368:20000000:ARTHUR MESQUITA DE LIMA:/home/c160368:
2026-06-08T14:00:23.5813958Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160398:x:10160398:20000000:CESAR KIYOSHI OKADA:/home/c160398:
2026-06-08T14:00:23.5814766Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160379:x:10160379:20000000:GABRIEL OLIVEIRA BRINDO DA CRUZ:/home/c160379:
2026-06-08T14:00:23.5815251Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160439:x:10160439:20000000:GUSTAVO RODRIGUES DE BRITO:/home/c160439:
2026-06-08T14:00:23.5815771Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160359:x:10160359:20000000:ARTHUR GARCIA TAKAHASHI:/home/c160359:
2026-06-08T14:00:23.5817283Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160370:x:10160370:20000000:HELENA CRISTINA SOUTO FONSECA:/home/c160370:
2026-06-08T14:00:23.5817891Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160404:x:10160404:20000000:VICTOR RODRIGO NUNES LOPES E SILVA:/home/c160404:
2026-06-08T14:00:23.5818588Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160416:x:10160416:20000000:DAVI DO NASCIMENTO SOUZA:/home/c160416:
2026-06-08T14:00:23.5819196Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f685162:x:10685162:20000000:OLIMPIO KAIO RODRIGUES SILVA:/home/f685162:/bin/bash
2026-06-08T14:00:23.5822170Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f578963:x:10578963:20000000:ADEILTON SANTANA AGUIAR FILHO:/home/f578963:/bin/bash
2026-06-08T14:00:23.5822836Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160387:x:10160387:20000000:LUCAS ARTUR BARTOLO:/home/c160387:
2026-06-08T14:00:23.5823337Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160331:x:10160331:20000000:LUCAS DE SA ESTEVES:/home/c160331:
2026-06-08T14:00:23.5823851Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160382:x:10160382:20000000:PEDRO HENRIQUE LOPES DE OLIVEIRA:/home/c160382:
2026-06-08T14:00:23.5824847Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160347:x:10160347:20000000:THIAGO BANFI CREDICO:/home/c160347:
2026-06-08T14:00:23.5825359Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159578:x:10159578:20000000:RUY GEORGE OTONI VIEIRA SOBRINHO:/home/c159578:
2026-06-08T14:00:23.5825983Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160330:x:10160330:20000000:ISABELA PEREIRA RODRIGUES:/home/c160330:/bin/bash
2026-06-08T14:00:23.5826893Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160373:x:10160373:20000000:FELIPE CAVALCANTE TOLENTINO GONCALVES:/home/c160373:/bin/bash
2026-06-08T14:00:23.5827514Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160336:x:10160336:20000000:DIEGO BARRETO SANTOS:/home/c160336:/bin/bash
2026-06-08T14:00:23.5828119Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160325:x:10160325:20000000:FABIO LUIS ARRUDA FERNANDES:/home/c160325:/bin/bash
2026-06-08T14:00:23.5828655Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f723287:x:10723287:20000000:LUCAS ALVES RIBEIRO:/home/f723287:/bin/bash
2026-06-08T14:00:23.5829533Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159897:x:10159897:20000000:VICTOR CESAR MATIAS DA SILVA:/home/c159897:/bin/bash
2026-06-08T14:00:23.5829977Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f728761:x:10728761:20000000:PAULO ROBERTO SANTOS LEITE:/home/f728761:
2026-06-08T14:00:23.5830495Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f631539:x:10631539:20000000:PAULO FELIPE FONSECA LIMA:/home/f631539:/bin/bash
2026-06-08T14:00:23.5830855Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f639427:x:10639427:20000000:DAVIDSON BARRETO DA SILVA:/home/f639427:/bin/bash
2026-06-08T14:00:23.5831218Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160342:x:10160342:20000000:LAURO DIAS MEIRELES:/home/c160342:
2026-06-08T14:00:23.5831663Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160335:x:10160335:20000000:FELIPE DA CRUZ LIMA:/home/c160335:
2026-06-08T14:00:23.5832002Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f756661:x:10756661:20000000:ALLYSON SOUSA LIMA:/home/f756661:/bin/bash
2026-06-08T14:00:23.5834887Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159910:x:10159910:20000000:LEANDRO CORREIA DA SILVA:/home/c159910:/bin/bash
2026-06-08T14:00:23.5835658Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159918:x:10159918:20000000:GABRIEL DE CARVALHO SILVA:/home/c159918:/bin/bash
2026-06-08T14:00:23.5836214Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f570365:x:10570365:20000000:FABRICIO FONSECA SRDIC:/home/f570365:/bin/bash
2026-06-08T14:00:23.5836572Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f537954:x:10537954:20000000:EMANUEL DE SOUZA ALVES:/home/f537954:/bin/bash
2026-06-08T14:00:23.5836926Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f900728:x:10900728:20000000:SANDRA DE MELO BATISTA:/home/f900728:/bin/bash
2026-06-08T14:00:23.5837269Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c088299:x:10088299:20000000:CRISTIANE ANSELMO TAVARES:/home/c088299:
2026-06-08T14:00:23.5837830Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f533336:x:10533336:20000000:FERNANDA SANTOS MONTEIRO:/home/f533336:/bin/bash
2026-06-08T14:00:23.5838195Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f777246:x:10777246:20000000:DANILO CARVALHO E SILVA:/home/f777246:/bin/bash
2026-06-08T14:00:23.5838804Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f587492:x:10587492:20000000:ALANE ALMEIDA DOS SANTOS:/home/f587492:/bin/bash
2026-06-08T14:00:23.5839160Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159854:x:10159854:20000000:MATHEUS BENEDITO MENDES:/home/c159854:
2026-06-08T14:00:23.5839512Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c134429:x:10134429:20000000:EVELIN GUIMARAES SANTANA:/home/c134429:/bin/bash
2026-06-08T14:00:23.5839937Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c056044:x:10056044:20000000:KELLY CRISTINA DE AZEVEDO MELO:/home/c056044:/bin/bash
2026-06-08T14:00:23.5840288Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160436:x:10160436:20000000:JOSE ISRAEL DE ASSIS FILHO:/home/c160436:/bin/bash
2026-06-08T14:00:23.5840647Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158495:x:10158495:20000000:ADRIEL SANTOS RAMOS FERREIRA:/home/c158495:/bin/bash
2026-06-08T14:00:23.5841008Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f523646:x:10523646:20000000:JESSICA LINA ALVES LEITE:/home/f523646:/bin/bash
2026-06-08T14:00:23.5841350Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c131698:x:10131698:20000000:MARCEL FERRADAS QUADROS:/home/c131698:
2026-06-08T14:00:23.5841828Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f517678:x:10517678:20000000:PEDRO VICTOR CABRAL DOS SANTOS:/home/f517678:/bin/bash
2026-06-08T14:00:23.5849507Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f574799:x:10574799:20000000:FERNANDA MARA BATSCHKE:/home/f574799:/bin/bash
2026-06-08T14:00:23.5850191Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f513354:x:10513354:20000000:GRAZIANY ALVES FERNANDES:/home/f513354:/bin/bash
2026-06-08T14:00:23.5850574Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f541170:x:10541170:20000000:ANDERSON PIOTTO LEITE:/home/f541170:/bin/bash
2026-06-08T14:00:23.5850953Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c117294:x:10117294:20000000:MARIA DE JESUS CARDOSO DE ALENCAR:/home/c117294:
2026-06-08T14:00:23.5851309Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f713850:x:10713850:20000000:KARL WENDLINGER MAIA DE FREITAS:/home/f713850:/bin/bash
2026-06-08T14:00:23.5851677Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c066588:x:10066588:20000000:HELIO SERRANO BRANDAO JUNIOR:/home/c066588:
2026-06-08T14:00:23.5852027Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160390:x:10160390:20000000:RICARDO FERREIRA MARQUES:/home/c160390:
2026-06-08T14:00:23.5852696Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160363:x:10160363:20000000:GUILHERME BASTOS LEONE:/home/c160363:
2026-06-08T14:00:23.5853064Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p572102:x:10572102:20000000:ARISTEU JUSTINO AYRES DA SILVA:/home/p572102:
2026-06-08T14:00:23.5853416Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f774901:x:10774901:20000000:SILVIA TEODORO SENA:/home/f774901:/bin/bash
2026-06-08T14:00:23.5853767Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159735:x:10159735:20000000:JOAO VICTOR DE OLIVEIRA MATOS:/home/c159735:
2026-06-08T14:00:23.5854122Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p924403:x:10924403:20000000:FLAVIO ALAN NASCIMENTO AMANCIO:/home/p924403:/bin/bash
2026-06-08T14:00:23.5854481Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p790714:x:10790714:20000000:MAURICIO ALMEIDA MARTINS:/home/p790714:/bin/bash
2026-06-08T14:00:23.5854832Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f538198:x:10538198:20000000:ROBERTA RENALLY DA SILVA MELO:/home/f538198:
2026-06-08T14:00:23.5855187Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p588070:x:10588070:20000000:WILLIAM FERREIRA LEANDRO:/home/p588070:/bin/bash
2026-06-08T14:00:23.5855539Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f634049:x:10634049:20000000:CEFAS DIEGO DA CUNHA PAIXAO:/home/f634049:/bin/bash
2026-06-08T14:00:23.5855962Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160413:x:10160413:20000000:JOAO GABRIEL DIAS FERNANDES:/home/c160413:/bin/bash
2026-06-08T14:00:23.5856315Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f502200:x:10502200:20000000:DAVID TEIXEIRA DE MASIN:/home/f502200:/bin/bash
2026-06-08T14:00:23.5856684Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f503410:x:10503410:20000000:RAFAEL TAVARES AQUINO DOS SANTOS:/home/f503410:/bin/bash
2026-06-08T14:00:23.5857051Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f529104:x:10529104:20000000:GUSTAVO FERREIRA DE AZEVEDO CLEMENTE:/home/f529104:/bin/bash
2026-06-08T14:00:23.5857426Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f590967:x:10590967:20000000:NATALIA RESENDE DAYRELL DA CUNHA PEREIRA:/home/f590967:/bin/bash
2026-06-08T14:00:23.5857790Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f540608:x:10540608:20000000:JOAO VITOR MARQUES PEREIRA:/home/f540608:/bin/bash
2026-06-08T14:00:23.5858151Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f748297:x:10748297:20000000:DIEGO BRAZ REIS DO NASCIMENTO:/home/f748297:/bin/bash
2026-06-08T14:00:23.5858510Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f668363:x:10668363:20000000:EVERTON PIRES DOS SANTOS:/home/f668363:/bin/bash
2026-06-08T14:00:23.5858861Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f956303:x:10956303:20000000:IRIS DE ARAUJO GONCALVES:/home/f956303:/bin/bash
2026-06-08T14:00:23.5859215Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f658848:x:10658848:20000000:LUISA BORGES MENDONCA:/home/f658848:/bin/bash
2026-06-08T14:00:23.5859562Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f714715:x:10714715:20000000:EVELISE SANTANA SANTOS:/home/f714715:/bin/bash
2026-06-08T14:00:23.5859915Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f571787:x:10571787:20000000:ANIBAL DE MEDEIROS BATISTA FILHO:/home/f571787:/bin/bash
2026-06-08T14:00:23.5860262Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f669757:x:10669757:20000000:JOSE GUSTHAVO SOARES:/home/f669757:/bin/bash
2026-06-08T14:00:23.5860664Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f730659:x:10730659:20000000:MICHAEL ROOSEVELT DA GLORIA:/home/f730659:/bin/bash
2026-06-08T14:00:23.5861022Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f613523:x:10613523:20000000:CARLOS EDUARDO WIECHETECK WATANABE:/home/f613523:/bin/bash
2026-06-08T14:00:23.5861388Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f915141:x:10915141:20000000:JACQUELINE DE MOURA OLIVEIRA NEGREIROS:/home/f915141:/bin/bash
2026-06-08T14:00:23.5861744Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f730824:x:10730824:20000000:JAMES CARLOS DA SILVA MARCAL:/home/f730824:/bin/bash
2026-06-08T14:00:23.5862085Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c157999:x:10157999:20000000:MATHEUS HENRIQUE PEREIRA VAZ:/home/c157999:
2026-06-08T14:00:23.5862430Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f540338:x:10540338:20000000:JAIR ESTANISLAU DA SILVA:/home/f540338:
2026-06-08T14:00:23.5862886Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f668204:x:10668204:20000000:BRUNA ARAUJO ALMEIDA:/home/f668204:/bin/bash
2026-06-08T14:00:23.5863229Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160334:x:10160334:20000000:TIAGO ANDRADE FERREIRA:/home/c160334:
2026-06-08T14:00:23.5863628Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p678627:x:10678627:20000000:ROMULO ALEXSSANDER VELOSO COSTA:/home/p678627:/bin/bash
2026-06-08T14:00:23.5863979Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f694375:x:10694375:20000000:RENITON OLIVEIRA FEITOSA:/home/f694375:/bin/bash
2026-06-08T14:00:23.5864334Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f603851:x:10603851:20000000:KLEBER BATISTA SOARES DE OLIVEIRA:/home/f603851:/bin/bash
2026-06-08T14:00:23.5864681Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f658838:x:10658838:20000000:GISELE CRISTINA DIAS:/home/f658838:
2026-06-08T14:00:23.5865012Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f590573:x:10590573:20000000:GUILHERME COSTA LOPES:/home/f590573:
2026-06-08T14:00:23.5865347Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c093811:x:10093811:20000000:THIAGO VINICIUS DE SOUZA SANTOS:/home/c093811:
2026-06-08T14:00:23.5865690Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f615924:x:10615924:20000000:JOAO MARCIO ANDRADE SILVA:/home/f615924:
2026-06-08T14:00:23.5866021Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f692790:x:10692790:20000000:NEREU COSTA NOGUEIRA:/home/f692790:
2026-06-08T14:00:23.5866364Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c030344:x:10030344:20000000:MARIA CLAUDIA GARCIA:/home/c030344:/bin/bash
2026-06-08T14:00:23.5866707Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f601522:x:10601522:20000000:PAULO RIBEIRO LEMOS DE MELLO JUNIOR:/home/f601522:
2026-06-08T14:00:23.5867042Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c073412:x:10073412:20000000:RENATA DA CRUZ:/home/c073412:
2026-06-08T14:00:23.5867374Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f554867:x:10554867:20000000:RAFAEL FERREIRA BARBOZA:/home/f554867:
2026-06-08T14:00:23.5867708Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160414:x:10160414:20000000:LUCIANO VIEGAS TEIXEIRA:/home/c160414:
2026-06-08T14:00:23.5868046Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160443:x:10160443:20000000:LEONARDO GARCIA MELO:/home/c160443:/bin/bash
2026-06-08T14:00:23.5868756Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f527444:x:10527444:20000000:HERBERT SILVA MELO DE LIMA:/home/f527444:/bin/bash
2026-06-08T14:00:23.5869201Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c077628:x:10077628:20000000:MAURICIO SHINTAKU:/home/c077628:
2026-06-08T14:00:23.5869887Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f579279:x:10579279:20000000:WALLACEN RIBEIRO VELOSO:/home/f579279:/bin/bash
2026-06-08T14:00:23.5870775Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f576666:x:10576666:20000000:RUAN MATEUS DE SOUZA NUNES:/home/f576666:/bin/bash
2026-06-08T14:00:23.5871205Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f546259:x:10546259:20000000:VICTOR RODRIGUES MARQUES:/home/f546259:
2026-06-08T14:00:23.5871586Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f953587:x:10953587:20000000:VALERIA BETANIA NUNES DA SILVA:/home/f953587:
2026-06-08T14:00:23.5871936Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160445:x:10160445:20000000:JOSE DA ROSA SILVEIRA JUNIOR:/home/c160445:
2026-06-08T14:00:23.5872280Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160344:x:10160344:20000000:VICTOR SHINDI TAGUCHI:/home/c160344:
2026-06-08T14:00:23.5872701Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c092979:x:10092979:20000000:DANIEL VICTOR DE SOUZA PRADO:/home/c092979:/bin/bash
2026-06-08T14:00:23.5873260Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159967:x:10159967:20000000:ALEXANDER RIVAS DE MELO JUNIOR:/home/c159967:/bin/bash
2026-06-08T14:00:23.5873621Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160440:x:10160440:20000000:SAMUEL DO AMARAL PIMENTEL:/home/c160440:/bin/bash
2026-06-08T14:00:23.5873975Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160384:x:10160384:20000000:SAVIO SILVA IPIRANGA:/home/c160384:/bin/bash
2026-06-08T14:00:23.5874475Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f957573:x:10957573:20000000:RODRIGO CUNHA NETO DA FONSECA:/home/f957573:/bin/bash
2026-06-08T14:00:23.5874828Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160402:x:10160402:20000000:AMANDA CARRIJO VIANA FIGUR:/home/c160402:
2026-06-08T14:00:23.5877331Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c091455:x:10091455:20000000:THAIS MEIRA BENEVIDES:/home/c091455:/bin/bash
2026-06-08T14:00:23.5877711Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159490:x:10159490:20000000:DANILLO DE OLIVEIRA FARIA DE SOUZA:/home/c159490:/bin/bash
2026-06-08T14:00:23.5878082Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p792767:x:10792767:20000000:SOLANGE ALVES MAIO MARQUES:/home/p792767:/bin/bash
2026-06-08T14:00:23.5878426Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f518455:x:10518455:20000000:ERICK CANDIDO DA LUZ:/home/f518455:
2026-06-08T14:00:23.5878772Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159837:x:10159837:20000000:PEDRO GABRIEL CARVALHO ARAUJO:/home/c159837:
2026-06-08T14:00:23.5879129Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160433:x:10160433:20000000:FELIPE MATOS BARBOSA:/home/c160433:/bin/bash
2026-06-08T14:00:23.5879522Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159844:x:10159844:20000000:GUSTAVO LUIS GONCALVES FERREIRA:/home/c159844:/bin/bash
2026-06-08T14:00:23.5879878Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c154263:x:10154263:20000000:DANIELE BARBOSA LIVORATO:/home/c154263:/bin/bash
2026-06-08T14:00:23.5880708Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160388:x:10160388:20000000:JORGE HENRIQUE SHINITI OSIRO:/home/c160388:
2026-06-08T14:00:23.5881123Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160452:x:10160452:20000000:ANA JULIA DE OLIVEIRA:/home/c160452:/bin/bash
2026-06-08T14:00:23.5881853Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160426:x:10160426:20000000:JOANA VIDON NOGUEIRA BLOISE:/home/c160426:/bin/bash
2026-06-08T14:00:23.5882268Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160453:x:10160453:20000000:LUIZ FELIPE ORNELAS PASSONI:/home/c160453:/bin/bash
2026-06-08T14:00:23.5884408Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p789016:x:10789016:20000000:FRANCISCO JUNIO RODRIGUES OLIVEIRA:/home/p789016:/bin/bash
2026-06-08T14:00:23.5884881Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c131454:x:10131454:20000000:MICHELLE FERREIRA CANOAS:/home/c131454:
2026-06-08T14:00:23.5885259Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160386:x:10160386:20000000:JULIANO JERONIMO DA SILVA TAVARES:/home/c160386:
2026-06-08T14:00:23.5885607Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f755257:x:10755257:20000000:ANDRE DIAS VIEIRA DA SILVA:/home/f755257:
2026-06-08T14:00:23.5886029Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160407:x:10160407:20000000:PAULO HENRIQUE SOARES DE ARAUJO:/home/c160407:/bin/bash
2026-06-08T14:00:23.5886383Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160406:x:10160406:20000000:JESSICA DE OLIVEIRA RIOS:/home/c160406:/bin/bash
2026-06-08T14:00:23.5886738Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p944350:x:10944350:20000000:GUSTAVO JOSE CARVALHO DE MELO:/home/p944350:/bin/bash
2026-06-08T14:00:23.5887090Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158539:x:10158539:20000000:ANDRE MOURO D ANGIOLI:/home/c158539:
2026-06-08T14:00:23.5887754Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159446:x:10159446:20000000:JOAO GABRIEL FERNANDES MONIZ DE ARAGAO:/home/c159446:/bin/bash
2026-06-08T14:00:23.5888112Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159705:x:10159705:20000000:FERNANDO AUGUSTO ARANTES:/home/c159705:/bin/bash
2026-06-08T14:00:23.5888928Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159577:x:10159577:20000000:DIEGO INACIO SILVA DA ROSA:/home/c159577:
2026-06-08T14:00:23.5889515Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f799624:x:10799624:20000000:REGINALDO LIMA CONCEICAO:/home/f799624:/bin/bash
2026-06-08T14:00:23.5890026Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c125932:x:10125932:20000000:LUIS FERNANDO OLIVEIRA CALDEIRA:/home/c125932:
2026-06-08T14:00:23.5890445Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160380:x:10160380:20000000:ADRIANA VILANOVA DOS SANTOS:/home/c160380:
2026-06-08T14:00:23.5890930Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160706:x:10160706:20000000:GUILHERME MEIRA DE SANTANA:/home/c160706:/bin/bash
2026-06-08T14:00:23.5891499Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160693:x:10160693:20000000:JOAO VITOR ROCHA SILVA:/home/c160693:/bin/bash
2026-06-08T14:00:23.5892254Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160790:x:10160790:20000000:HUGO GUSTAVO DOS SANTOS PINTO:/home/c160790:/bin/bash
2026-06-08T14:00:23.5893014Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160720:x:10160720:20000000:DAVI LIMA DA SILVA:/home/c160720:/bin/bash
2026-06-08T14:00:23.5893398Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160748:x:10160748:20000000:LEANDRO SILVA FERREIRA:/home/c160748:/bin/bash
2026-06-08T14:00:23.5893973Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c112954:x:10112954:20000000:BRUNO FELIPE DE SOUZA BARBOSA:/home/c112954:/bin/bash
2026-06-08T14:00:23.5894574Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c078331:x:10078331:20000000:rebeca pastl montarroyos vieira da costa:/home/c078331:/bin/bash
2026-06-08T14:00:23.5894986Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p582167:x:10582167:20000000:ITALO TEIXEIRA DA SILVA:/home/p582167:
2026-06-08T14:00:23.5895457Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f972925:x:10972925:20000000:PRISCILA DA NOBREGA:/home/f972925:/bin/bash
2026-06-08T14:00:23.5896001Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160714:x:10160714:20000000:TASSIO MELO LINHARES:/home/c160714:
2026-06-08T14:00:23.5896406Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160711:x:10160711:20000000:THEO MARQUES DA ROCHA:/home/c160711:
2026-06-08T14:00:23.5896749Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f584546:x:10584546:20000000:JOSE LUIS AMANCIO:/home/f584546:
2026-06-08T14:00:23.5897403Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f547304:x:10547304:20000000:CAROLINE TEODORO SOARES:/home/f547304:/bin/bash
2026-06-08T14:00:23.5897967Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160673:x:10160673:20000000:MATHEUS HENRIQUE DE SOUSA BRITO:/home/c160673:
2026-06-08T14:00:23.5898385Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160820:x:10160820:20000000:VITOR ZAFFARI:/home/c160820:
2026-06-08T14:00:23.5898826Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160826:x:10160826:20000000:NATALI DANILO ANZANELLO:/home/c160826:
2026-06-08T14:00:23.5899382Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160713:x:10160713:20000000:RODRIGO ARAUJO DE LIMA:/home/c160713:/bin/bash
2026-06-08T14:00:23.5899880Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f591021:x:10591021:20000000:GABRIEL SANTOS BRANDAO:/home/f591021:
2026-06-08T14:00:23.5900232Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160674:x:10160674:20000000:GABRIEL ROCHA FONTENELE:/home/c160674:/bin/bash
2026-06-08T14:00:23.5900650Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f592888:x:10592888:20000000:MATHEUS DOUGLAS PRUDENCIO DA SILVA:/home/f592888:/bin/bash
2026-06-08T14:00:23.5901132Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p595789:x:10595789:20000000:AMANDA LOPES DOS SANTOS:/home/p595789:/bin/bash
2026-06-08T14:00:23.5901477Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160718:x:10160718:20000000:ERICK FELIPE BORGES:/home/c160718:/bin/bash
2026-06-08T14:00:23.5903639Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c109739:x:10109739:20000000:VAGNER LELIS DE ARAUJO:/home/c109739:/bin/bash
2026-06-08T14:00:23.5903994Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f667975:x:10667975:20000000:GEORGE DA SILVA SANTOS:/home/f667975:/bin/bash
2026-06-08T14:00:23.5905142Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160709:x:10160709:20000000:FELIPE MARINS VILELA DE ANDRADE MENDES:/home/c160709:/bin/bash
2026-06-08T14:00:23.5905573Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p512399:x:10512399:20000000:RONALDO AMYSTERDAM ALVES NERES:/home/p512399:/bin/bash
2026-06-08T14:00:23.5906050Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160697:x:10160697:20000000:DANIEL LIMA GRANCE:/home/c160697:/bin/bash
2026-06-08T14:00:23.5906547Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160739:x:10160739:20000000:ROMULO AUGUSTO GIOMO DELALATA:/home/c160739:
2026-06-08T14:00:23.5907246Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160696:x:10160696:20000000:RODRIGO ALCANTARA POYARES:/home/c160696:
2026-06-08T14:00:23.5907673Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p693935:x:10693935:20000000:ALAN LUCAS FERNANDES MAGALHAES:/home/p693935:/bin/bash
2026-06-08T14:00:23.5908131Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160394:x:10160394:20000000:DJAIR BARRAL PIRES:/home/c160394:/bin/bash
2026-06-08T14:00:23.5908681Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f660792:x:10660792:20000000:GUSTAVO DIAS DOS SANTOS:/home/f660792:/bin/bash
2026-06-08T14:00:23.5909279Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c111827:x:10111827:20000000:CARLA DENISE SANTOS DE OLIVEIRA ANDRADE:/home/c111827:/bin/bash
2026-06-08T14:00:23.5909888Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f602772:x:10602772:20000000:MATHEUS MESQUITA NASCIMENTO DOS SANTOS:/home/f602772:/bin/bash
2026-06-08T14:00:23.5910748Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f602238:x:10602238:20000000:ANDERSON ERALDO DA SILVA:/home/f602238:/bin/bash
2026-06-08T14:00:23.5911461Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f655081:x:10655081:20000000:LEONARDO FERREIRA GUIMARAES DE OLIVEIRA:/home/f655081:/bin/bash
2026-06-08T14:00:23.5911827Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f571033:x:10571033:20000000:MORGANA GWENDOLYN BENNETT:/home/f571033:/bin/bash
2026-06-08T14:00:23.5912648Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f648057:x:10648057:20000000:ANDRESSA LETICIA PONTES CANTELLI:/home/f648057:/bin/bash
2026-06-08T14:00:23.5913514Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f559043:x:10559043:20000000:CAROLINA ANTONIO MENESCAL CARNEIRO GAMA:/home/f559043:/bin/bash
2026-06-08T14:00:23.5913957Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f588271:x:10588271:20000000:MARIA DE LOURDES CORREA MOCELIN:/home/f588271:/bin/bash
2026-06-08T14:00:23.5914329Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f632070:x:10632070:20000000:GUILHERME SILVA FERREIRA:/home/f632070:/bin/bash
2026-06-08T14:00:23.5914693Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160757:x:10160757:20000000:ALEXANDRE MACHADO ROSA FILHO:/home/c160757:/bin/bash
2026-06-08T14:00:23.5915675Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160716:x:10160716:20000000:WILLIAM ALVES DOS SANTOS JUNIOR:/home/c160716:/bin/bash
2026-06-08T14:00:23.5916048Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160776:x:10160776:20000000:MATEUS SANTOS NEGRINI:/home/c160776:/bin/bash
2026-06-08T14:00:23.5916403Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c095902:x:10095902:20000000:EDUARDO DOS ANJOS SOUZA:/home/c095902:/bin/bash
2026-06-08T14:00:23.5917336Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160799:x:10160799:20000000:MARCELO HENRIQUE ARAUJO DO BOMFIM:/home/c160799:/bin/bash
2026-06-08T14:00:23.5917865Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f571669:x:10571669:20000000:RAFAEL CASTRO DE OLIVEIRA:/home/f571669:
2026-06-08T14:00:23.5918597Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160450:x:10160450:20000000:ANDRE HENRIQUE MENDES LAGE:/home/c160450:/bin/bash
2026-06-08T14:00:23.5918966Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f644126:x:10644126:20000000:ISAC PONCIANO BANDEIRA:/home/f644126:/bin/bash
2026-06-08T14:00:23.5919325Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160438:x:10160438:20000000:CARLOS FELIX DE SOUZA CARDOZO:/home/c160438:/bin/bash
2026-06-08T14:00:23.5919768Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160371:x:10160371:20000000:EDSON BITTENCORT SILVA:/home/c160371:/bin/bash
2026-06-08T14:00:23.5920348Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f731620:x:10731620:20000000:EDMILSON ALMEIDA PEREIRA:/home/f731620:/bin/bash
2026-06-08T14:00:23.5923187Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f616024:x:10616024:20000000:EDUARDO FERRI PAIXAO:/home/f616024:/bin/bash
2026-06-08T14:00:23.5923658Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f515009:x:10515009:20000000:FELIPE DA SILVA COSTA FEITOSA:/home/f515009:/bin/bash
2026-06-08T14:00:23.5924018Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f554526:x:10554526:20000000:MARCELO RIBEIRO DA SILVA DE MORAIS:/home/f554526:/bin/bash
2026-06-08T14:00:23.5924451Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f558057:x:10558057:20000000:THIAGO RIOS COSTA:/home/f558057:/bin/bash
2026-06-08T14:00:23.5924809Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f563667:x:10563667:20000000:ROMULO SANTANA DA COSTA:/home/f563667:/bin/bash
2026-06-08T14:00:23.5957280Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f621309:x:10621309:20000000:VINICIUS RAFAEL DE OLIVEIRA MARTINS:/home/f621309:/bin/bash
2026-06-08T14:00:23.5964251Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f721590:x:10721590:20000000:TIAGO LUIS CESA SEIBEL:/home/f721590:/bin/bash
2026-06-08T14:00:23.5964929Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160353:x:10160353:20000000:PEDRO ROBERTO FERNANDES NORONHA:/home/c160353:/bin/bash
2026-06-08T14:00:23.5965527Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160415:x:10160415:20000000:THIAGO DIAS BARBOZA:/home/c160415:/bin/bash
2026-06-08T14:00:23.5966168Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f630116:x:10630116:20000000:RUAN ANDRADE RAMOS:/home/f630116:/bin/bash
2026-06-08T14:00:23.5966843Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f514585:x:10514585:20000000:JOIL DUARTE BAPTISTA:/home/f514585:/bin/bash
2026-06-08T14:00:23.5967552Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f931547:x:10931547:20000000:SAMUEL CRISTIANO SILVA XAVIER:/home/f931547:/bin/bash
2026-06-08T14:00:23.5968151Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f556201:x:10556201:20000000:RODRIGO DA CUNHA GERONIMO:/home/f556201:/bin/bash
2026-06-08T14:00:23.5968762Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p782658:x:10782658:20000000:WILSON GOMES ORNELAS NETO:/home/p782658:/bin/bash
2026-06-08T14:00:23.5969385Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f984873:x:10984873:20000000:MARCELO VINICIOS DE SOUZA OLIVEIRA:/home/f984873:/bin/bash
2026-06-08T14:00:23.5970088Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159568:x:10159568:20000000:RODRIGO CARDOSO DALMASCHIO:/home/c159568:/bin/bash
2026-06-08T14:00:23.5971036Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159440:x:10159440:20000000:DANIEL LESSA BASTOS:/home/c159440:/bin/bash
2026-06-08T14:00:23.5971626Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f985730:x:10985730:20000000:FLAVIO RABELO CHAVES:/home/f985730:/bin/bash
2026-06-08T14:00:23.5972231Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p580905:x:10580905:20000000:JONATHAN LUIZ DE SOUZA MAXIMO:/home/p580905:/bin/bash
2026-06-08T14:00:23.5973058Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c152732:x:10152732:20000000:PAULA RENATA ASSUNCAO RODRIGUES SANTOS:/home/c152732:/bin/bash
2026-06-08T14:00:23.5973619Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c110842:x:10110842:20000000:HELOISA AUGUSTO LESSA FIGUEIRA:/home/c110842:/bin/bash
2026-06-08T14:00:23.5974199Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160687:x:10160687:20000000:RAFAEL LEAO TEIXEIRA DE MAGALHAES:/home/c160687:
2026-06-08T14:00:23.5974761Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a160743:x:10160743:30000001:KALEW SILVA PIVETA:/home/a160743:/bin/bash
2026-06-08T14:00:23.5975326Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f616792:x:10616792:20000000:LEONARDO HENRIQUE LOPES CARDOZO:/home/f616792:/bin/bash
2026-06-08T14:00:23.5975878Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f618137:x:10618137:20000000:THIAGO AZEVEDO SOARES:/home/f618137:/bin/bash
2026-06-08T14:00:23.5976650Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159452:x:10159452:20000000:PEDRO PAULO BASTOS TEIXEIRA:/home/c159452:/bin/bash
2026-06-08T14:00:23.5977232Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159484:x:10159484:20000000:CAUA PASCOAL SANTOS JUNGER:/home/c159484:/bin/bash
2026-06-08T14:00:23.5977805Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f668880:x:10668880:20000000:HIANK WESLEY DE JESUS SILVA:/home/f668880:/bin/bash
2026-06-08T14:00:23.5978368Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f538954:x:10538954:20000000:MATHEUS VICTOR MARQUES ALVES:/home/f538954:/bin/bash
2026-06-08T14:00:23.5978884Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f936354:x:10936354:20000000:KENI FERREIRA KINUP:/home/f936354:/bin/bash
2026-06-08T14:00:23.5979407Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f592531:x:10592531:20000000:HIGOR ROBERTO DA SILVA:/home/f592531:/bin/bash
2026-06-08T14:00:23.5979938Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160327:x:10160327:20000000:IAN PEREIRA DA SILVA:/home/c160327:/bin/bash
2026-06-08T14:00:23.5980491Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c146164:x:10146164:20000000:MAYCON AGUIAR SOARES:/home/c146164:/bin/bash
2026-06-08T14:00:23.5981088Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159793:x:10159793:20000000:EDUARDO LUIS GONCALVES DE AZEVEDO:/home/c159793:/bin/bash
2026-06-08T14:00:23.5981635Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f517263:x:10517263:20000000:FELIPE SANTOS CARREIRA:/home/f517263:/bin/bash
2026-06-08T14:00:23.5982208Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p989322:x:10989322:20000000:EDIMAR MARTINS RODRIGUES:/home/p989322:/bin/bash
2026-06-08T14:00:23.5982914Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160804:x:10160804:20000000:THIAGO DE ALMEIDA PEREIRA:/home/c160804:/bin/bash
2026-06-08T14:00:23.5983474Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f669471:x:10669471:20000000:ISRAEL RAMOS QUEIROZ:/home/f669471:/bin/bash
2026-06-08T14:00:23.5984240Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f550466:x:10550466:20000000:TIAGO AUGUSTO DOS SANTOS SCHRAIBER:/home/f550466:/bin/bash
2026-06-08T14:00:23.5984810Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f600058:x:10600058:20000000:BRUNO LIMA ALVES:/home/f600058:/bin/bash
2026-06-08T14:00:23.5985498Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p670424:x:10670424:20000000:RAPHAEL DE SOUSA ARAUJO CONCEICAO:/home/p670424:/bin/bash
2026-06-08T14:00:23.5986129Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f703004:x:10703004:20000000:THIAGO DALICIO CORDEIRO FREIRE:/home/f703004:/bin/bash
2026-06-08T14:00:23.5986852Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f539572:x:10539572:20000000:DANIEL CORREA PAULA:/home/f539572:/bin/bash
2026-06-08T14:00:23.5987448Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c134536:x:10134536:20000000:IVAN ALVES DE OLIVEIRA:/home/c134536:/bin/bash
2026-06-08T14:00:23.5988015Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f595206:x:10595206:20000000:ANA PAULA SILVA DE SOUSA:/home/f595206:/bin/bash
2026-06-08T14:00:23.5988539Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f562219:x:10562219:20000000:DANIEL OLIVEIRA CARDOZO:/home/f562219:/bin/bash
2026-06-08T14:00:23.5989202Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f987670:x:10987670:20000000:MARCELO AUGUSTO DE ALMEIDA:/home/f987670:/bin/bash
2026-06-08T14:00:23.5989769Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f667236:x:10667236:20000000:LUCAS AUGUSTO GRISOLIA DE ASSIS:/home/f667236:/bin/bash
2026-06-08T14:00:23.5990322Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f543962:x:10543962:20000000:MATHEUS NED DE SOUZA SILVEIRA:/home/f543962:/bin/bash
2026-06-08T14:00:23.5990893Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f669320:x:10669320:20000000:ROBERTA DE ALMEIDA SIMONE:/home/f669320:/bin/bash
2026-06-08T14:00:23.5991498Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f549989:x:10549989:20000000:ROGERIO FERNANDES DA COSTA:/home/f549989:/bin/bash
2026-06-08T14:00:23.5992272Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f691866:x:10691866:20000000:RODRIGO GOMES DE ALBUQUERQUE:/home/f691866:/bin/bash
2026-06-08T14:00:23.5993006Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f724291:x:10724291:20000000:YONA SABINO:/home/f724291:/bin/bash
2026-06-08T14:00:23.5993536Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f579202:x:10579202:20000000:FRANCISCO RICARDO LEAO:/home/f579202:/bin/bash
2026-06-08T14:00:23.5994133Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f794219:x:10794219:20000000:EDIMILSON FERNANDES DA SILVA:/home/f794219:/bin/bash
2026-06-08T14:00:23.5994718Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f589303:x:10589303:20000000:LUIZ FERNANDO FREITAS RAMOS:/home/f589303:
2026-06-08T14:00:23.5995302Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f603977:x:10603977:20000000:CASSIO RAIJONH MACHADO MARTINS:/home/f603977:/bin/bash
2026-06-08T14:00:23.5995872Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f995640:x:10995640:20000000:EUCLIDES PAES DE MELO JUNIOR:/home/f995640:/bin/bash
2026-06-08T14:00:23.5996582Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f643487:x:10643487:20000000:WEVERTON GOMES ALEXANDRINO:/home/f643487:/bin/bash
2026-06-08T14:00:23.5997505Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c071775:x:10071775:20000000:RENATO LEANDRO PEREIRA DE ANDRADE:/home/c071775:/bin/bash
2026-06-08T14:00:23.5998078Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f767745:x:10767745:20000000:VANESSA VIEIRA DOS SANTOS:/home/f767745:
2026-06-08T14:00:23.5998661Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f649056:x:10649056:20000000:JONAS DAVILA DA SILVA:/home/f649056:/bin/bash
2026-06-08T14:00:23.5999249Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f510153:x:10510153:20000000:JACKELINE VALENTIN MESQUITA:/home/f510153:/bin/bash
2026-06-08T14:00:23.5999841Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f950654:x:10950654:20000000:VITORIA BEATRIZ DE LIMA CAMPOS:/home/f950654:/bin/bash
2026-06-08T14:00:23.6000359Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160374:x:10160374:20000000:MATEUS MONTEIRO DA SILVA:/home/c160374:/bin/bash
2026-06-08T14:00:23.6000744Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f566821:x:10566821:20000000:ANTONIO EDUARDO REZENDE DOS SANTOS:/home/f566821:/bin/bash
2026-06-08T14:00:23.6001100Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c102078:x:10102078:20000000:PEDRO RICARDO BONFIM FILHO:/home/c102078:
2026-06-08T14:00:23.6001453Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f956810:x:10956810:20000000:RONALDO SHINTAKU DE ARAUJO:/home/f956810:/bin/bash
2026-06-08T14:00:23.6001888Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160834:x:10160834:20000000:LEONARDO CASSIANO KLAUS:/home/c160834:
2026-06-08T14:00:23.6002312Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160823:x:10160823:20000000:DIOGO CAMPOS DA SILVA:/home/c160823:
2026-06-08T14:00:23.6002771Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160827:x:10160827:20000000:lua schneider pittelkow:/home/c160827:
2026-06-08T14:00:23.6003328Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160829:x:10160829:20000000:EDSON LUIZ MENDES DA SILVA:/home/c160829:
2026-06-08T14:00:23.6003866Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f629829:x:10629829:20000000:VANDER ALEXANDRE TEIXEIRA:/home/f629829:/bin/bash
2026-06-08T14:00:23.6004391Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160797:x:10160797:20000000:ALEXANDRE DOS SANTOS DE SOUZA:/home/c160797:/bin/bash
2026-06-08T14:00:23.6004963Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f563036:x:10563036:20000000:PEDRO PAULO FURTADO NAZARE:/home/f563036:/bin/bash
2026-06-08T14:00:23.6005417Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f592139:x:10592139:20000000:TIAGO PASTOR DA SILVA:/home/f592139:/bin/bash
2026-06-08T14:00:23.6005849Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f669078:x:10669078:20000000:LUCCA CASANOVA SGARIA:/home/f669078:/bin/bash
2026-06-08T14:00:23.6006319Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c132722:x:10132722:20000000:DEBORA CARRARA DA SILVA:/home/c132722:/bin/bash
2026-06-08T14:00:23.6006753Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f736756:x:10736756:20000000:LUIZ HENRIQUE GUIMARAES SOARES:/home/f736756:/bin/bash
2026-06-08T14:00:23.6007288Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f654913:x:10654913:20000000:MAYANA DUARTE ARAUJO:/home/f654913:
2026-06-08T14:00:23.6007758Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f710039:x:10710039:20000000:MATHEUS TEIXEIRA DE SOUZA:/home/f710039:/bin/bash
2026-06-08T14:00:23.6008381Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f520753:x:10520753:20000000:MARCOS ANDERSON ALMEIDA OLIVEIRA:/home/f520753:/bin/bash
2026-06-08T14:00:23.6008874Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160842:x:10160842:20000000:JONATAS DE CANDIO RODRIGUES:/home/c160842:
2026-06-08T14:00:23.6009350Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c153032:x:10153032:20000000:MARCOS DA SILVA FERREIRA:/home/c153032:/bin/bash
2026-06-08T14:00:23.6009770Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f539703:x:10539703:20000000:LUIS FERNANDO GOMES SALES:/home/f539703:/bin/bash
2026-06-08T14:00:23.6010122Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f646058:x:10646058:20000000:BRUNO SCHERER VIEGAS:/home/f646058:/bin/bash
2026-06-08T14:00:23.6010521Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f697840:x:10697840:20000000:CLOVIS GARGIONE RODRIGUES:/home/f697840:/bin/bash
2026-06-08T14:00:23.6010864Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f661740:x:10661740:20000000:ANDRE SIMOES DA SILVA:/home/f661740:
2026-06-08T14:00:23.6011257Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c083132:x:10083132:20000000:LEANDRO GOMES MACHADO:/home/c083132:/bin/bash
2026-06-08T14:00:23.6011646Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160838:x:10160838:20000000:MARIO LEOPOLDO FROES DA SILVA:/home/c160838:
2026-06-08T14:00:23.6012053Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160397:x:10160397:20000000:RENAN SARTO GREGORIO:/home/c160397:/bin/bash
2026-06-08T14:00:23.6012403Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p525433:x:10525433:20000000:VICTOR HUGO BUFFON:/home/p525433:/bin/bash
2026-06-08T14:00:23.6012850Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159860:x:10159860:20000000:MAXMILIAN MORAIS DE PAULA:/home/c159860:/bin/bash
2026-06-08T14:00:23.6013212Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f725850:x:10725850:20000000:JORGE KLEBER RABELO DOS SANTOS:/home/f725850:/bin/bash
2026-06-08T14:00:23.6013572Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p781382:x:10781382:20000000:JULIO CESAR SILVA RODRIGUES:/home/p781382:/bin/bash
2026-06-08T14:00:23.6013937Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p983084:x:10983084:20000000:VICTOR HUGO AUGUSTO DO VALLE:/home/p983084:/bin/bash
2026-06-08T14:00:23.6014297Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160721:x:10160721:20000000:CARLOS ROBERTO DE ALMEIDA JUNIOR:/home/c160721:
2026-06-08T14:00:23.6014679Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p541863:x:10541863:20000000:SEBASTIAO DANIEL MEDEIROS DE FARIAS:/home/p541863:/bin/bash
2026-06-08T14:00:23.6015086Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p791825:x:10791825:20000000:ANDERSON DE PAULA SILVA:/home/p791825:/bin/bash
2026-06-08T14:00:23.6015671Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160801:x:10160801:20000000:ROBSON CICERO DA SILVA:/home/c160801:/bin/bash
2026-06-08T14:00:23.6016034Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160732:x:10160732:20000000:EDUARDO ALVES GODE:/home/c160732:/bin/bash
2026-06-08T14:00:23.6016376Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c093315:x:10093315:20000000:FLAVIO SANTOS COSTA:/home/c093315:/bin/bash
2026-06-08T14:00:23.6016746Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160773:x:10160773:20000000:PEDRO FERNANDES DE ARAUJO:/home/c160773:
2026-06-08T14:00:23.6017138Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f565876:x:10565876:20000000:RUBENS RIBEIRO DE MATOS:/home/f565876:/bin/bash
2026-06-08T14:00:23.6017484Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160729:x:10160729:20000000:KRISTIANO PASINI DE OLIVEIRA:/home/c160729:/bin/bash
2026-06-08T14:00:23.6017894Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c115056:x:10115056:20000000:THIAGO SOUSA DA SILVA:/home/c115056:/bin/bash
2026-06-08T14:00:23.6018318Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f593364:x:10593364:20000000:PHILLIP EDUARDO PIMENTA FORTE:/home/f593364:
2026-06-08T14:00:23.6018704Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f595143:x:10595143:20000000:DOUGLAS RIBEIRO DA SILVA:/home/f595143:/bin/bash
2026-06-08T14:00:23.6019104Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f648068:x:10648068:20000000:LEONARDO DOS SANTOS ARAUJO:/home/f648068:/bin/bash
2026-06-08T14:00:23.6019509Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f541376:x:10541376:20000000:KLEITON MENDES DE BRITO:/home/f541376:/bin/bash
2026-06-08T14:00:23.6019924Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f661614:x:10661614:20000000:DIOGENES VILA NOVA PEREIRA:/home/f661614:/bin/bash
2026-06-08T14:00:23.6020276Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f719006:x:10719006:20000000:JOBSON MATEUS ALVES MACEDO:/home/f719006:/bin/bash
2026-06-08T14:00:23.6020661Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f915459:x:10915459:20000000:EDNA FRANCA TITO:/home/f915459:/bin/bash
2026-06-08T14:00:23.6021001Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161189:x:10161189:20000000:CAIO PADILHA AGUIAR:/home/c161189:/bin/bash
2026-06-08T14:00:23.6021344Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159622:x:10159622:20000000:GUILHERME DUARTE SANTOS:/home/c159622:/bin/bash
2026-06-08T14:00:23.6021689Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161138:x:10161138:20000000:AURICIO SANTOS LEITE:/home/c161138:/bin/bash
2026-06-08T14:00:23.6022023Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159852:x:10159852:20000000:LUCAS PINHEIRO MORAES:/home/c159852:
2026-06-08T14:00:23.6022452Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158439:x:10158439:20000000:SERGIO VICTOR DA SILVA SOARES:/home/c158439:/bin/bash
2026-06-08T14:00:23.6022876Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160787:x:10160787:20000000:EDER DE AMARAL AMORIM:/home/c160787:/bin/bash
2026-06-08T14:00:23.6023290Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c064679:x:10064679:20000000:MAURICIO ANGELO ZAGO:/home/c064679:/bin/bash
2026-06-08T14:00:23.6023636Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c052289:x:10052289:20000000:ALBERTO FONSECA SOBRAL:/home/c052289:/bin/bash
2026-06-08T14:00:23.6024110Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161233:x:10161233:20000000:LUIZ GUSTAVO SANTOS AMARANTE:/home/c161233:/bin/bash
2026-06-08T14:00:23.6024560Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f798482:x:10798482:20000000:HIGOR ANTONIO DELSOTO:/home/f798482:/bin/bash
2026-06-08T14:00:23.6024998Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c092263:x:10092263:20000000:MARINA FELICIANA DOS SANTOS:/home/c092263:
2026-06-08T14:00:23.6025450Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f540665:x:10540665:20000000:RENATO LIRA CAMARAO:/home/f540665:
2026-06-08T14:00:23.6025905Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f575660:x:10575660:20000000:GUILHERME BILIBIO:/home/f575660:/bin/bash
2026-06-08T14:00:23.6026306Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160372:x:10160372:20000000:THIAGO KALLEB PORTELA BARROSO:/home/c160372:/bin/bash
2026-06-08T14:00:23.6026721Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p692396:x:10692396:20000000:ADOLPHO COSTA BISNETO:/home/p692396:/bin/bash
2026-06-08T14:00:23.6027115Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f725788:x:10725788:20000000:ANDREI DUARTE DE LIMA:/home/f725788:/bin/bash
2026-06-08T14:00:23.6027468Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f702565:x:10702565:20000000:WALTENES PLACIDO SARDINHA JUNIOR:/home/f702565:/bin/bash
2026-06-08T14:00:23.6027861Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161122:x:10161122:20000000:VINICIUS TORRES DOS SANTOS:/home/c161122:/bin/bash
2026-06-08T14:00:23.6028204Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161214:x:10161214:20000000:IURY DAMASCENO MOTA:/home/c161214:/bin/bash
2026-06-08T14:00:23.6028589Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f725668:x:10725668:20000000:NELSON LUIZ CORREIA:/home/f725668:/bin/bash
2026-06-08T14:00:23.6029011Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f704557:x:10704557:20000000:LIDIANE FERREIRA MACHADO:/home/f704557:
2026-06-08T14:00:23.6029411Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f543331:x:10543331:20000000:PEDRO FELIX DE MENEZES JUNIOR:/home/f543331:/bin/bash
2026-06-08T14:00:23.6029870Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p757380:x:10757380:20000000:WENDER EMILIO ASSIS ALMEIDA:/home/p757380:/bin/bash
2026-06-08T14:00:23.6030232Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f586798:x:10586798:20000000:DOUGLAS VIEIRA DA SILVA:/home/f586798:
2026-06-08T14:00:23.6030731Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p515324:x:10515324:20000000:MURILO SILVA ANDRADE SOUZA:/home/p515324:/bin/bash
2026-06-08T14:00:23.6031196Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f641765:x:10641765:20000000:ELLEN LUANA FERNANDES:/home/f641765:/bin/bash
2026-06-08T14:00:23.6031556Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f724645:x:10724645:20000000:CRISTIANO RENAN DE BARROS:/home/f724645:
2026-06-08T14:00:23.6032043Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f586308:x:10586308:20000000:NEUBER PAIVA DE SOUZA:/home/f586308:
2026-06-08T14:00:23.6032513Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f776453:x:10776453:20000000:MICHELLE APARECIDA OSTINOWSKY:/home/f776453:/bin/bash
2026-06-08T14:00:23.6032985Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f561997:x:10561997:20000000:ROBERTO FERNANDES DA SILVA JUNIOR:/home/f561997:
2026-06-08T14:00:23.6033329Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f561088:x:10561088:20000000:VICTOR RODRIGUES PEREIRA:/home/f561088:
2026-06-08T14:00:23.6033715Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161121:x:10161121:20000000:PEDRO CORTEZ MAIA:/home/c161121:
2026-06-08T14:00:23.6034091Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161193:x:10161193:20000000:CLAUDIO FERNANDES BEZERRA:/home/c161193:/bin/bash
2026-06-08T14:00:23.6034446Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161290:x:10161290:20000000:DEBORA BARBOSA LEITE SILVA:/home/c161290:/bin/bash
2026-06-08T14:00:23.6034878Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161245:x:10161245:20000000:VICTOR GOMES DOS SANTOS:/home/c161245:/bin/bash
2026-06-08T14:00:23.6035329Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161260:x:10161260:20000000:BRUNO FOGACA DE ALMEIDA SCACHETTI:/home/c161260:/bin/bash
2026-06-08T14:00:23.6035821Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161288:x:10161288:20000000:PEDRO CARDOSO DA SILVA:/home/c161288:/bin/bash
2026-06-08T14:00:23.6036230Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161156:x:10161156:20000000:HECTOR ROCHA MARGITTAY:/home/c161156:/bin/bash
2026-06-08T14:00:23.6036653Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161194:x:10161194:20000000:RAFAEL GOMES PEREIRA:/home/c161194:/bin/bash
2026-06-08T14:00:23.6037044Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p668185:x:10668185:20000000:FERNANDO SOBRAL:/home/p668185:/bin/bash
2026-06-08T14:00:23.6037403Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a097280:x:10097280:30000001:VANESSA VASCONCELOS DIAS:/home/a097280:/bin/bash
2026-06-08T14:00:23.6037770Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f940444:x:10940444:20000000:DOUGLAS DE SA NASCIMENTO:/home/f940444:
2026-06-08T14:00:23.6038157Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p557378:x:10557378:20000000:JOSE EDUARDO DOS SANTOS:/home/p557378:/bin/bash
2026-06-08T14:00:23.6038574Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f615834:x:10615834:20000000:EDUARDO NASCIMENTO PESSOA:/home/f615834:/bin/bash
2026-06-08T14:00:23.6038984Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c151462:x:10151462:20000000:ADEMIR RODRIGUES DE CARVALHO:/home/c151462:
2026-06-08T14:00:23.6039455Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p655761:x:10655761:20000000:CID DE JESUS REIS:/home/p655761:/bin/bash
2026-06-08T14:00:23.6039896Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p541274:x:10541274:20000000:FELIPE SOARES DE OLIVEIRA:/home/p541274:/bin/bash
2026-06-08T14:00:23.6040283Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160764:x:10160764:20000000:RAQUEL BORELI DE OLIVEIRA:/home/c160764:
2026-06-08T14:00:23.6040675Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161163:x:10161163:20000000:ADRIANO AMARO PIGNATA SOARES:/home/c161163:
2026-06-08T14:00:23.6041108Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159083:x:10159083:20000000:MARIANA GOMES DE ALMEIDA:/home/c159083:/bin/bash
2026-06-08T14:00:23.6041531Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p965748:x:10965748:20000000:LUIZ CARLOS BARALDO:/home/p965748:/bin/bash
2026-06-08T14:00:23.6041961Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p561121:x:10561121:20000000:DANILO CALIL LUCHESI:/home/p561121:/bin/bash
2026-06-08T14:00:23.6042311Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158766:x:10158766:20000000:THALES AUGUSTO ROCHA FERNANDES:/home/c158766:/bin/bash
2026-06-08T14:00:23.6042802Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f586453:x:10586453:20000000:FERNANDO CUNHA SIQUEIRA FILHO:/home/f586453:
2026-06-08T14:00:23.6043197Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161152:x:10161152:20000000:FERNANDO SOBRAL NOBREGA:/home/c161152:/bin/bash
2026-06-08T14:00:23.6043575Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161291:x:10161291:20000000:GABRIEL GONCALVES DO NASCIMENTO:/home/c161291:/bin/bash
2026-06-08T14:00:23.6044021Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161209:x:10161209:20000000:GUSTAVO FEITOSA HAUBERT:/home/c161209:/bin/bash
2026-06-08T14:00:23.6044361Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f504697:x:10504697:20000000:VINICIUS RIBEIRO DA SILVA:/home/f504697:
2026-06-08T14:00:23.6044776Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161129:x:10161129:20000000:LUCAS DA SILVA FERREIRA:/home/c161129:/bin/bash
2026-06-08T14:00:23.6045276Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161143:x:10161143:20000000:LUCAS ROCHA DOS SANTOS:/home/c161143:/bin/bash
2026-06-08T14:00:23.6045638Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161246:x:10161246:20000000:ANGELO GRANAI NETO:/home/c161246:
2026-06-08T14:00:23.6046155Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161217:x:10161217:20000000:MARIA CLARA RODRIGUES SILVA:/home/c161217:/bin/bash
2026-06-08T14:00:23.6046577Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f671140:x:10671140:20000000:ANDRE LUIZ SANTIAGO CAVALEIRO:/home/f671140:
2026-06-08T14:00:23.6046965Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f654276:x:10654276:20000000:EZEQUIEL CORREA SARGES:/home/f654276:/bin/bash
2026-06-08T14:00:23.6047383Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f554793:x:10554793:20000000:RALPH ALBERT SOMMER:/home/f554793:/bin/bash
2026-06-08T14:00:23.6047819Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f553825:x:10553825:20000000:RHUAN PABLO CESARIO SILVA:/home/f553825:/bin/bash
2026-06-08T14:00:23.6048174Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160760:x:10160760:20000000:ANDERSON LUIZ BARBOSA PEREIRA:/home/c160760:/bin/bash
2026-06-08T14:00:23.6048559Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c126065:x:10126065:20000000:ROBSON MARTINS FERREIRA:/home/c126065:/bin/bash
2026-06-08T14:00:23.6048915Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c081894:x:10081894:20000000:MESSIAS MARRA DE CASTRO JUNIOR:/home/c081894:/bin/bash
2026-06-08T14:00:23.6049257Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161242:x:10161242:20000000:DAVI DOS SANTOS JULIAO:/home/c161242:
2026-06-08T14:00:23.6049665Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161248:x:10161248:20000000:NATHAN SANTOS RIGOLEI:/home/c161248:
2026-06-08T14:00:23.6050048Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f581398:x:10581398:20000000:CARLOS MATHEUS FERREIRA DE OLIVEIRA:/home/f581398:
2026-06-08T14:00:23.6050605Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160734:x:10160734:20000000:HENRIQUE CAMPANHARO SEABRA:/home/c160734:/bin/bash
2026-06-08T14:00:23.6051152Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p533367:x:10533367:20000000:ALEXANDRE DE FREITAS QUEIROZ:/home/p533367:/bin/bash
2026-06-08T14:00:23.6051594Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f648871:x:10648871:20000000:LUANA BARBOSA DE MELO:/home/f648871:/bin/bash
2026-06-08T14:00:23.6051964Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f666076:x:10666076:20000000:GUILHERME LIMA DA SILVA:/home/f666076:/bin/bash
2026-06-08T14:00:23.6053055Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161133:x:10161133:20000000:JOSE ANDRE RABELO ROCHA:/home/c161133:/bin/bash
2026-06-08T14:00:23.6053463Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161221:x:10161221:20000000:JOAO MAIERON MARTINS:/home/c161221:
2026-06-08T14:00:23.6053942Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161277:x:10161277:20000000:BRYAN COSTA AZEVEDO DE SA:/home/c161277:
2026-06-08T14:00:23.6054290Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161225:x:10161225:20000000:FELIPE ESTIMO BERTAGLIA:/home/c161225:/bin/bash
2026-06-08T14:00:23.6057904Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p736925:x:10736925:20000000:DIEGO PEREIRA DE OLIVEIRA:/home/p736925:/bin/bash
2026-06-08T14:00:23.6058285Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p645601:x:10645601:20000000:RODRIGO SOARES DE SOUZA:/home/p645601:/bin/bash
2026-06-08T14:00:23.6058745Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f518008:x:10518008:20000000:GUSTAVO HENRIQUE GARRIDO DE MELO:/home/f518008:
2026-06-08T14:00:23.6059170Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f684346:x:10684346:20000000:VICENTE HENRIQUE QUEIROZ MOREIRA DE LIMA:/home/f684346:/bin/bash
2026-06-08T14:00:23.6059528Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159946:x:10159946:20000000:KRISTHIAN ALBUQUERQUE DA SILVA:/home/c159946:
2026-06-08T14:00:23.6059874Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f570270:x:10570270:20000000:HESDRAS RODRIGUES DE SOUZA:/home/f570270:/bin/bash
2026-06-08T14:00:23.6060470Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c152327:x:10152327:20000000:ISAIAS GONCALVES DA SILVA:/home/c152327:/bin/bash
2026-06-08T14:00:23.6060873Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159928:x:10159928:20000000:LUCAS BATISTA DO NASCIMENTO:/home/c159928:/bin/bash
2026-06-08T14:00:23.6061223Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p590589:x:10590589:20000000:CLEDSON MOREIRA PARENTE:/home/p590589:/bin/bash
2026-06-08T14:00:23.6061570Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f577814:x:10577814:20000000:WILLAMS BERNARDO DE LIMA SOUZA:/home/f577814:
2026-06-08T14:00:23.6063179Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c070627:x:10070627:20000000:ADILSON RODRIGUES:/home/c070627:/bin/bash
2026-06-08T14:00:23.6067202Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f585715:x:10585715:20000000:FABRICIO DA SILVA MEDEIROS:/home/f585715:/bin/bash
2026-06-08T14:00:23.6067565Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161230:x:10161230:20000000:CAIO TATSUYA IKENA:/home/c161230:/bin/bash
2026-06-08T14:00:23.6067920Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a139981:x:10139981:30000001:EDUARDO DOS SANTOS CAETANO:/home/a139981:/bin/bash
2026-06-08T14:00:23.6068269Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f918009:x:10918009:20000000:BEZALEEL LIRA DA SILVA:/home/f918009:/bin/bash
2026-06-08T14:00:23.6068615Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c076505:x:10076505:20000000:VANIA DA SILVA RODRIGUES:/home/c076505:/bin/bash
2026-06-08T14:00:23.6068970Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p962837:x:10962837:20000000:ANDERSON APOLINARIO OLIVEIRA SILVA:/home/p962837:/bin/bash
2026-06-08T14:00:23.6069330Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160807:x:10160807:20000000:LIVERSON PAULO FURTADO SEVERO:/home/c160807:/bin/bash
2026-06-08T14:00:23.6069669Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c150182:x:10150182:20000000:LEONARDO LOPES MIRANDA:/home/c150182:
2026-06-08T14:00:23.6070104Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p784837:x:10784837:20000000:CARLOS EDUARDO CHAVENCO FERNANDES:/home/p784837:/bin/bash
2026-06-08T14:00:23.6070610Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159892:x:10159892:20000000:RAFAEL FRANCISCO DE OLIVEIRA:/home/c159892:
2026-06-08T14:00:23.6070995Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f627563:x:10627563:20000000:DOUGLAS SOARES DE SOUZA FERREIRA:/home/f627563:
2026-06-08T14:00:23.6071338Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p585600:x:10585600:20000000:JESSE MOUTA PEREIRA BATISTA:/home/p585600:
2026-06-08T14:00:23.6071682Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f626909:x:10626909:20000000:MARIA GABRIELA DA SILVA CARVALHO:/home/f626909:
2026-06-08T14:00:23.6072017Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f626401:x:10626401:20000000:RUBENS CYSNE NOVAES RANGEL:/home/f626401:
2026-06-08T14:00:23.6072361Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f730640:x:10730640:20000000:WENDELL SANTOS BARBOSA:/home/f730640:
2026-06-08T14:00:23.6073018Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f985121:x:10985121:20000000:ANNA CAROLINA AVILA GUIMARAES:/home/f985121:/bin/bash
2026-06-08T14:00:23.6073541Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f733271:x:10733271:20000000:JANE BEATRIZ KOETZ:/home/f733271:/bin/bash
2026-06-08T14:00:23.6074018Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161249:x:10161249:20000000:MATHEUS ALEXANDRE BENITES SCOTTI:/home/c161249:/bin/bash
2026-06-08T14:00:23.6074411Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158383:x:10158383:20000000:RODRIGO CAVALCANTI FERRAZ:/home/c158383:/bin/bash
2026-06-08T14:00:23.6074819Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161192:x:10161192:20000000:ANDRE VINICIUS NASCIMENTO DA COSTA:/home/c161192:/bin/bash
2026-06-08T14:00:23.6075211Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p919724:x:10919724:20000000:THIAGO JORGE ARAUJO:/home/p919724:/bin/bash
2026-06-08T14:00:23.6075563Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f557682:x:10557682:20000000:PENHA OLIVEIRA LIMA:/home/f557682:/bin/bash
2026-06-08T14:00:23.6075918Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p589398:x:10589398:20000000:FREDERICK SIMIAO ABRANTES E SILVA:/home/p589398:/bin/bash
2026-06-08T14:00:23.6076306Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159636:x:10159636:20000000:GABRIEL TARGINO DA SILVEIRA CHAVES:/home/c159636:/bin/bash
2026-06-08T14:00:23.6076732Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p610755:x:10610755:20000000:ODNUMIAR VANCERLI RODRIGUES DE SOUSA:/home/p610755:/bin/bash
2026-06-08T14:00:23.6077111Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f759551:x:10759551:20000000:HEITOR GONCALVES COSTA:/home/f759551:/bin/bash
2026-06-08T14:00:23.6077524Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f761451:x:10761451:20000000:ICARO THIAGO DE CAMPOS:/home/f761451:/bin/bash
2026-06-08T14:00:23.6077919Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f585988:x:10585988:20000000:KAROLINE ANDRADE PACHECO:/home/f585988:/bin/bash
2026-06-08T14:00:23.6078299Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161250:x:10161250:20000000:ANDREAS DE OLIVEIRA KOPEZKY:/home/c161250:/bin/bash
2026-06-08T14:00:23.6078638Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f510122:x:10510122:20000000:EDUARDO DE SOUZA SANTOS:/home/f510122:
2026-06-08T14:00:23.6079063Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f510061:x:10510061:20000000:CARLOS EDUARDO PEREIRA SANTANA:/home/f510061:/bin/bash
2026-06-08T14:00:23.6079419Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f945109:x:10945109:20000000:CARLOS DANIEL F BASTOS:/home/f945109:/bin/bash
2026-06-08T14:00:23.6079763Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f741532:x:10741532:20000000:SERGIO HENRIQUE SILVA:/home/f741532:/bin/bash
2026-06-08T14:00:23.6080142Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p523235:x:10523235:20000000:EMERSON ROCHA DE ALMEIDA:/home/p523235:/bin/bash
2026-06-08T14:00:23.6080497Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f553651:x:10553651:20000000:GABRIEL BARROS RODRIGUES DE SOUSA:/home/f553651:/bin/bash
2026-06-08T14:00:23.6080845Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160703:x:10160703:20000000:JACKSON MARQUES NUNES:/home/c160703:/bin/bash
2026-06-08T14:00:23.6081208Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f564132:x:10564132:20000000:MARA CRISTINA FERREIRA COSTA DE MORAES:/home/f564132:/bin/bash
2026-06-08T14:00:23.6081655Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161251:x:10161251:20000000:PEDRO BARRELLA VASCONCELLOS:/home/c161251:/bin/bash
2026-06-08T14:00:23.6082091Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161227:x:10161227:20000000:VITOR DE ALMEIDA DAL BELO:/home/c161227:/bin/bash
2026-06-08T14:00:23.6083768Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158822:x:10158822:20000000:ALEXANDRE BOUTAUD VALARINI:/home/c158822:/bin/bash
2026-06-08T14:00:23.6084840Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161226:x:10161226:20000000:ALLAN VICTOR GONCALVES EVANGELISTA:/home/c161226:
2026-06-08T14:00:23.6085194Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161281:x:10161281:20000000:ANDRE AUGUSTO DOS SANTOS LIMA:/home/c161281:
2026-06-08T14:00:23.6085550Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161259:x:10161259:20000000:VITOR HENRIQUE PERCINCULA PINHEIRO:/home/c161259:
2026-06-08T14:00:23.6085901Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161280:x:10161280:20000000:PAULO HENRIQUE DOS SANTOS MAGALHAES:/home/c161280:
2026-06-08T14:00:23.6086292Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c068438:x:10068438:20000000:CLEYTON ALVES DA SILVA:/home/c068438:/bin/bash
2026-06-08T14:00:23.6086645Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f562654:x:10562654:20000000:ROBSON AUGUSTO MATOS:/home/f562654:/bin/bash
2026-06-08T14:00:23.6086993Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161252:x:10161252:20000000:ALEXANDER BEIS CORREA:/home/c161252:/bin/bash
2026-06-08T14:00:23.6087337Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161240:x:10161240:20000000:JOSE LUCIANO SOARES FILHO:/home/c161240:/bin/bash
2026-06-08T14:00:23.6087682Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161247:x:10161247:20000000:JULIA AYUMI DE ALMEIDA UNO:/home/c161247:/bin/bash
2026-06-08T14:00:23.6089365Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161285:x:10161285:20000000:SERGIO HENRIQUE BASILIO REIS:/home/c161285:/bin/bash
2026-06-08T14:00:23.6089717Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161283:x:10161283:20000000:LUCA RIBEIRO DE CASTRO:/home/c161283:/bin/bash
2026-06-08T14:00:23.6090059Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161267:x:10161267:20000000:VINICIUS MAZON VITURINO:/home/c161267:/bin/bash
2026-06-08T14:00:23.6090476Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f577823:x:10981823:20001097:FERNANDES STIVAL FILHO:/home/f577823:
2026-06-08T14:00:23.6090989Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161276:x:10161276:20000000:EDUARDO FEITOSA DO NASCIMENTO:/home/c161276:/bin/bash
2026-06-08T14:00:23.6092420Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f688444:x:10688444:20000000:CASSIO RODRIGO BRASILEIRO DE ALMEIDA:/home/f688444:/bin/bash
2026-06-08T14:00:23.6093096Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f501666:x:10501666:20000000:DANIEL I HUANG CHIANG:/home/f501666:
2026-06-08T14:00:23.6093649Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159487:x:10159487:20000000:MARCOS PAULO CASTILHO COSTA:/home/c159487:/bin/bash
2026-06-08T14:00:23.6094630Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158899:x:10158899:20000000:JOAO VITOR SILVA BARBOSA:/home/c158899:/bin/bash
2026-06-08T14:00:23.6095085Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f584886:x:10584886:20000000:JORGE ROSIVAN RODRIGUES BATISTA:/home/f584886:/bin/bash
2026-06-08T14:00:23.6095477Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p540319:x:10540319:20000000:MATHEUS RODRIGUES XAVIER DOS REIS:/home/p540319:/bin/bash
2026-06-08T14:00:23.6096094Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160360:x:10160360:20000000:LUCAS GOMES PARLAGRECO REDIGOLO:/home/c160360:
2026-06-08T14:00:23.6096455Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f917245:x:10917245:20000000:KLEBER AUGUSTO DOS SANTOS:/home/f917245:/bin/bash
2026-06-08T14:00:23.6096817Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f546581:x:10546581:20000000:GUILHERME GERALDO DE QUEIROZ:/home/f546581:
2026-06-08T14:00:23.6097175Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p580712:x:10580712:20000000:JOSE DO NASCIMENTO SOUSA:/home/p580712:/bin/bash
2026-06-08T14:00:23.6098405Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f538162:x:10538162:20000000:BARBARA TEREZA DE VIVEIROS ALVES:/home/f538162:/bin/bash
2026-06-08T14:00:23.6098778Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p561896:x:10561896:20000000:VIVIANE ANDALECIO:/home/p561896:/bin/bash
2026-06-08T14:00:23.6099564Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p723878:x:10723878:20000000:ROGERIO FERREIRA DANTAS:/home/p723878:/bin/bash
2026-06-08T14:00:23.6099988Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p946525:x:10946525:20000000:EMANUEL BONFIM MOURA SOUSA:/home/p946525:/bin/bash
2026-06-08T14:00:23.6107981Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c142233:x:10142233:20000000:EVERTON NASCIMENTO SENA:/home/c142233:
2026-06-08T14:00:23.6108426Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f589451:x:10589451:20000000:FABIO GASPARI MADUREIRA MOUTINHO BARRETO:/home/f589451:/bin/bash
2026-06-08T14:00:23.6108792Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f593786:x:10593786:20000000:WILLIAN EVANGELISTA SILVA:/home/f593786:
2026-06-08T14:00:23.6109182Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c139883:x:10139883:20000000:JOEL APARECIDO DA SILVA PICCIONI:/home/c139883:/bin/bash
2026-06-08T14:00:23.6109547Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160733:x:10160733:20000000:BRUNO SANTOS CHAVES:/home/c160733:/bin/bash
2026-06-08T14:00:23.6110158Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160675:x:10160675:20000000:ALEXANDRE JUNQUEIRA CORREIA LIMA:/home/c160675:/bin/bash
2026-06-08T14:00:23.6110518Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f799052:x:10799052:20000000:AUGUSTO LUIZ CARDIM JUNIOR:/home/f799052:/bin/bash
2026-06-08T14:00:23.6111005Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p590391:x:10590391:20000000:HERBERT CARDOSO DE CALDAS:/home/p590391:
2026-06-08T14:00:23.6111367Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f672494:x:10672494:20000000:PAOLA SANTOS DE ASSIS:/home/f672494:/bin/bash
2026-06-08T14:00:23.6111715Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f754639:x:10754639:20000000:MESSIAS PEREIRA DE SOUZA:/home/f754639:
2026-06-08T14:00:23.6112083Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a572334:x:10572334:30000001:JHENISSON REINALDO DA SILVA BRITO:/home/a572334:/bin/bash
2026-06-08T14:00:23.6112437Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f585249:x:10585249:20000000:MARCEL MOISES ALEIXO:/home/f585249:/bin/bash
2026-06-08T14:00:23.6112907Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159613:x:10159613:20000000:DAVYD DO CARMO CABRAL:/home/c159613:/bin/bash
2026-06-08T14:00:23.6113365Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f594100:x:10594100:20000000:DANIEL BARROS CAETANO:/home/f594100:/bin/bash
2026-06-08T14:00:23.6113877Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161265:x:10161265:20000000:RAPHAEL YUKIO KOGA BARBOSA DOS SANTOS:/home/c161265:
2026-06-08T14:00:23.6114228Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f639477:x:10639477:20000000:OSMAR JOAQUIM DE LIMA FILHO:/home/f639477:/bin/bash
2026-06-08T14:00:23.6114605Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f556565:x:10556565:20000000:PABLO MESSIAS RODRIGUES DOS SANTOS:/home/f556565:/bin/bash
2026-06-08T14:00:23.6114960Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f500669:x:10500669:20000000:ANDRESSA DE OLIVEIRA FERREIRA:/home/f500669:/bin/bash
2026-06-08T14:00:23.6115314Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f593242:x:10593242:20000000:ANDERSON SILVA DA CONCEICAO:/home/f593242:/bin/bash
2026-06-08T14:00:23.6115665Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f592579:x:10592579:20000000:GABRIELA BRAZ DOS SANTOS SOUZA:/home/f592579:/bin/bash
2026-06-08T14:00:23.6116015Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f566456:x:10566456:20000000:JONATHAN VICENTE MOTA:/home/f566456:/bin/bash
2026-06-08T14:00:23.6116374Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f510204:x:10510204:20000000:GLAUCIA CRISTINA SANTOS DE ANDRADE:/home/f510204:/bin/bash
2026-06-08T14:00:23.6117571Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f546286:x:10546286:20000000:ALDRIA DALILA DOMINGUES BATISTA:/home/f546286:/bin/bash
2026-06-08T14:00:23.6117932Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f672526:x:10672526:20000000:DAVI DORNA DE OLIVEIRA:/home/f672526:/bin/bash
2026-06-08T14:00:23.6118382Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f642727:x:10642727:20000000:WILLIAN RODRIGUES STECH:/home/f642727:/bin/bash
2026-06-08T14:00:23.6119182Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f609233:x:10609233:20000000:RAFAEL KERTISCHKA RIBEIRO MENDES:/home/f609233:/bin/bash
2026-06-08T14:00:23.6120179Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f582171:x:10582171:20000000:IVAN LOPES ALONSO:/home/f582171:/bin/bash
2026-06-08T14:00:23.6120882Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f583082:x:10583082:20000000:PAULO LISBOA DE ALMEIDA JUNIOR:/home/f583082:/bin/bash
2026-06-08T14:00:23.6121367Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f585043:x:10585043:20000000:RAYAN MARCUS RAMOS DOS SANTOS:/home/f585043:/bin/bash
2026-06-08T14:00:23.6122275Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f582688:x:10582688:20000000:KEVIN NOGALES FERREIRA DA SILVA:/home/f582688:/bin/bash
2026-06-08T14:00:23.6122750Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c149714:x:10149714:20000000:CARLOS EDUARDO LOPES PINTO:/home/c149714:/bin/bash
2026-06-08T14:00:23.6123126Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159906:x:10159906:20000000:RAYANT EMANNUEL FERREIRA GURGEL:/home/c159906:/bin/bash
2026-06-08T14:00:23.6124380Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160726:x:10160726:20000000:LEIMAR FERREIRA DE OLIVEIRA:/home/c160726:/bin/bash
2026-06-08T14:00:23.6124736Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159563:x:10159563:20000000:DANIELLE MARTINS DE MOURA:/home/c159563:/bin/bash
2026-06-08T14:00:23.6125346Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f590632:x:10590632:20000000:RENAN ALYSON FERREIRA CAMARA:/home/f590632:/bin/bash
2026-06-08T14:00:23.6126694Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f539494:x:10539494:20000000:JULIANA ALMEIDA ALVES DE GODOY:/home/f539494:
2026-06-08T14:00:23.6127290Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161236:x:10161236:20000000:VINICIUS CASSEMIRO DE OLIVEIRA:/home/c161236:/bin/bash
2026-06-08T14:00:23.6130209Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f662471:x:10662471:20000000:FABIANO SAMPAIO GONCALVES:/home/f662471:
2026-06-08T14:00:23.6130689Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p509340:x:10509340:20000000:WILSON LEAL DA SILVA:/home/p509340:/bin/bash
2026-06-08T14:00:23.6131061Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159517:x:10159517:20000000:ITALO LUIGI CERQUEIRA DOVERA:/home/c159517:/bin/bash
2026-06-08T14:00:23.6131429Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f791672:x:10791672:20000000:ALVARO CAMPELO DA SILVA:/home/f791672:/bin/bash
2026-06-08T14:00:23.6132091Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p695115:x:10695115:20000000:MARCOS AURELIO DA SILVA CAVACO:/home/p695115:/bin/bash
2026-06-08T14:00:23.6132465Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f660280:x:10660280:20000000:THIAGO BESSA ROSSETTO:/home/f660280:/bin/bash
2026-06-08T14:00:23.6133122Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f657829:x:10657829:20000000:JOHN CHARLLES NOGUEIRA BARBOSA JUNIOR:/home/f657829:/bin/bash
2026-06-08T14:00:23.6133547Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161264:x:10161264:20000000:VITOR SADAO FUGITA:/home/c161264:/bin/bash
2026-06-08T14:00:23.6134113Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a629793:x:10629793:30000001:MARCONE JOSE DE OLIVEIRA JUNIOR:/home/a629793:/bin/bash
2026-06-08T14:00:23.6134880Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f629584:x:10629584:20000000:VINICIUS SERGIO LOURENCO RIBEIRO:/home/f629584:/bin/bash
2026-06-08T14:00:23.6136303Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a159743:x:10159743:30000001:ANDERSON SILVA DE LIMA ROCHA:/home/a159743:/bin/bash
2026-06-08T14:00:23.6136974Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c081895:x:10081895:20000000:ANDREIA DE LIMA CAMPOS:/home/c081895:/bin/bash
2026-06-08T14:00:23.6137329Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160792:x:10160792:20000000:ERICK TAVARES NUNES:/home/c160792:/bin/bash
2026-06-08T14:00:23.6137884Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f766237:x:10766237:20000000:MARCELO RAVENGAR CUNHA GARCIA:/home/f766237:/bin/bash
2026-06-08T14:00:23.6138399Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f936968:x:10936968:20000000:VERA LUCIA FERRARI SALAROLI:/home/f936968:/bin/bash
2026-06-08T14:00:23.6138934Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161551:x:10161551:20000000:MATIAS MONTEIRO DANTAS:/home/c161551:/bin/bash
2026-06-08T14:00:23.6139340Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161553:x:10161553:20000000:RAFAEL JOB PEREIRA:/home/c161553:
2026-06-08T14:00:23.6139976Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161621:x:10161621:20000000:RAFAEL IRADES SILVESTRE DE OLIVEIRA:/home/c161621:
2026-06-08T14:00:23.6141486Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f639697:x:10639697:20000000:FABRICIO SAVIO MATEUS ARAUJO DE ASSIS BA:/home/f639697:/bin/bash
2026-06-08T14:00:23.6141878Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161513:x:10161513:20000000:VICTOR HUGO SOARES SANTOS:/home/c161513:
2026-06-08T14:00:23.6142695Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161228:x:10161228:20000000:GABRIEL CEZAR SALATA:/home/c161228:/bin/bash
2026-06-08T14:00:23.6143333Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f682811:x:10682811:20000000:EDWARD BELMONDO BUTRON ITURRE:/home/f682811:/bin/bash
2026-06-08T14:00:23.6144096Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f799580:x:10799580:20000000:FABIANO TEIXEIRA DA SILVA:/home/f799580:/bin/bash
2026-06-08T14:00:23.6144721Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f727473:x:10727473:20000000:MARCELO MAGANIN ANDREATTA:/home/f727473:/bin/bash
2026-06-08T14:00:23.6145133Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f557231:x:10557231:20000000:WELINTON BENEDITO BORGES:/home/f557231:/bin/bash
2026-06-08T14:00:23.6146426Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161460:x:10161460:20000000:BRUNO REILI BISPO DE FARIAS:/home/c161460:/bin/bash
2026-06-08T14:00:23.6147190Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f968679:x:10968679:20000000:MARCELO MACHADO SERAFINI:/home/f968679:/bin/bash
2026-06-08T14:00:23.6147549Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161485:x:10161485:20000000:GABRIEL MORAIS MARREIROS:/home/c161485:/bin/bash
2026-06-08T14:00:23.6147984Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161566:x:10161566:20000000:JULIO ITALO LIARTE DINIZ:/home/c161566:
2026-06-08T14:00:23.6148673Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f587908:x:10587908:20000000:ALEFE PATRICK DIAS RAMOS:/home/f587908:/bin/bash
2026-06-08T14:00:23.6149598Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f784203:x:10784203:20000000:ARIOVALDO FREDDO JUNIOR:/home/f784203:/bin/bash
2026-06-08T14:00:23.6150470Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c068944:x:10068944:20000000:RAFAEL COELHO DE OLIVEIRA:/home/c068944:/bin/bash
2026-06-08T14:00:23.6151056Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161532:x:10161532:20000000:ESDRAS ABREU SILVA:/home/c161532:
2026-06-08T14:00:23.6151519Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c058935:x:10058935:20000000:LUCIANO RICARDO DE SOUSA MONTEIRO:/home/c058935:
2026-06-08T14:00:23.6151874Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159565:x:10159565:20000000:ANDERSON SARAIVA DE ANDRADE:/home/c159565:/bin/bash
2026-06-08T14:00:23.6152702Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f670009:x:10670009:20000000:BRUNO HENRIQUE ARAUJO CAVALCANTI:/home/f670009:/bin/bash
2026-06-08T14:00:23.6153608Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161261:x:10161261:20000000:CINTIA DE PAOLA MACCHIA PARUSSOLO:/home/c161261:/bin/bash
2026-06-08T14:00:23.6154010Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f699126:x:10699126:20000000:TARCISIO BEZERRA:/home/f699126:
2026-06-08T14:00:23.6154788Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p604204:x:10604204:20000000:GUILHERME CHERSONI PEREIRA DA SILVA:/home/p604204:/bin/bash
2026-06-08T14:00:23.6155165Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160822:x:10160822:20000000:JONAS PIRES DA COSTA:/home/c160822:/bin/bash
2026-06-08T14:00:23.6155655Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f777904:x:10777904:20000000:LUCIANO SILVA DA ROCHA:/home/f777904:
2026-06-08T14:00:23.6156569Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f545209:x:10545209:20000000:CEILTON LEAL MARINHO:/home/f545209:/bin/bash
2026-06-08T14:00:23.6157356Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161477:x:10161477:20000000:EDUARDO LUCIO DE QUEIROZ:/home/c161477:/bin/bash
2026-06-08T14:00:23.6157960Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p642912:x:10642912:20000000:ARTUR GOMES DOS SANTOS:/home/p642912:/bin/bash
2026-06-08T14:00:23.6158783Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f585111:x:10585111:20000000:ADRIANO PEREIRA DE JESUS:/home/f585111:
2026-06-08T14:00:23.6159418Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c042556:x:10042556:20000000:SONIA DE CARVALHO PALHARES BEIRA:/home/c042556:/bin/bash
2026-06-08T14:00:23.6160003Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f710695:x:10710695:20000000:RONALDO MOTA GERALDINO:/home/f710695:
2026-06-08T14:00:23.6160452Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f624587:x:10624587:20000000:VINICIUS RIBEIRO FLAUSINO DA SILVA:/home/f624587:/bin/bash
2026-06-08T14:00:23.6160993Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p975918:x:10975918:20000000:FABIANA APARECIDA ALVES BETTONI:/home/p975918:/bin/bash
2026-06-08T14:00:23.6161458Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c122020:x:10122020:20000000:JUDEMBERG DONIZETE NASCIMENTO:/home/c122020:/bin/bash
2026-06-08T14:00:23.6162260Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159051:x:10159051:20000000:RENAN MATEUS SOUSA SILVA:/home/c159051:/bin/bash
2026-06-08T14:00:23.6163145Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f695839:x:10695839:20000000:GABRIEL GONZAGA FERNANDES:/home/f695839:/bin/bash
2026-06-08T14:00:23.6163515Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f575232:x:10575232:20000000:TIAGO MALAQUIAS DA SILVA:/home/f575232:/bin/bash
2026-06-08T14:00:23.6164015Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161505:x:10161505:20000000:VASCO RODRIGUES MONTEIRO NETO:/home/c161505:
2026-06-08T14:00:23.6164384Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f509663:x:10509663:20000000:EDUARDO HENRIQUE LOBO:/home/f509663:/bin/bash
2026-06-08T14:00:23.6165776Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161565:x:10161565:20000000:JOAO GABRIEL SALVADOR ITO:/home/c161565:/bin/bash
2026-06-08T14:00:23.6166219Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161546:x:10161546:20000000:HENRIQUE WALACE ALVES SANTANA:/home/c161546:/bin/bash
2026-06-08T14:00:23.6166829Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161562:x:10161562:20000000:CASSIO BORGES DA SILVA:/home/c161562:/bin/bash
2026-06-08T14:00:23.6167334Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161195:x:10161195:20000000:FELIPE ANTUNES ARCANJO DE SOUZA:/home/c161195:/bin/bash
2026-06-08T14:00:23.6167738Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f571931:x:10571931:20000000:GILIARD SOUSA DOS SANTOS:/home/f571931:/bin/bash
2026-06-08T14:00:23.6168103Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f598553:x:10598553:20000000:FELIPE CAMARA BARRETO:/home/f598553:/bin/bash
2026-06-08T14:00:23.6168882Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161202:x:10161202:20000000:CAIO ANTONIO DE ALMEIDA RUIZ:/home/c161202:
2026-06-08T14:00:23.6169437Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a158450:x:10158450:30000001:RENAN CESAR PINTO SILVA ANDRADE DE LIMA:/home/a158450:/bin/bash
2026-06-08T14:00:23.6170256Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): sptnrp01:x:20006020:20009979:conta de servico do Sistema SIPTN - TAS000046942690:/home/sptnrp01:/bin/bash
2026-06-08T14:00:23.6170674Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6171929Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6172509Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6173461Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6173887Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6174638Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6175431Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6176499Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6176910Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6178186Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6178903Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6180663Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6181276Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6183343Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6183995Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6184416Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6184808Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6185604Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6186126Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6187158Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6188050Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6188753Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6189542Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6190075Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6190605Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6191668Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6192295Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6197071Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6200938Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6201721Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6202362Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6203146Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6203780Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6204393Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6205055Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6205844Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6206451Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6207095Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6207721Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6208363Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6209197Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6209884Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6210517Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6211156Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6211800Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6212429Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6213323Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6213971Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6214738Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6215397Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6216070Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6216646Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6217067Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6217959Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6218380Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6218957Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6219524Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6221667Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6222074Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6223136Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6227187Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6227938Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6228356Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6228953Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6229503Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6229938Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6230591Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6231232Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6231750Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6232685Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6233421Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6234672Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6236141Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6237288Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6237698Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6238344Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6238886Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6240134Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6240693Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6242010Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6242611Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6243775Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6244266Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6246426Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6246836Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6247239Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6247648Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6248408Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6249527Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6249993Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6250530Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6251078Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6251614Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6253265Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6253688Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6254450Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6254860Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6255460Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6256065Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6257292Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6257691Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6258224Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6258837Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6259616Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6260182Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6261461Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6261932Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6262936Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6263330Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6263951Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6264457Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6265395Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6265895Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6266853Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6267246Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6268009Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6268750Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6269282Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6270286Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6270690Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6271880Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6272878Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6274024Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6274418Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6275493Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6275889Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6276594Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6278017Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6278427Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6279502Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6280031Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6281150Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6281889Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6282505Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6285712Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6291140Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6291810Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6292455Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6293321Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6293988Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6294589Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6295244Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6296174Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6296822Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6297440Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6298031Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6298640Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6299153Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6299545Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6299928Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6300315Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6300711Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6301225Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6301615Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6301997Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6302388Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6304795Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6305197Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6306510Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6307203Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6308026Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6308775Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6311265Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6312495Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6313635Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6314330Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6316222Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6316929Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6317819Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6318441Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6321577Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6322340Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6323299Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6324055Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6324637Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6325230Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6325843Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6326909Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6327502Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6328254Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6328943Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6329732Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6330707Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6331537Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6332353Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6333321Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6334120Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6335528Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6337825Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6338645Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6340969Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6341782Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6342530Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6343374Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6344235Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6345274Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6346127Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6346870Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6347491Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6348306Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6349137Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6349998Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6350814Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6351638Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6352379Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6353384Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6354380Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6355013Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6355778Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6356586Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6357254Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6357983Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6358609Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6360283Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6360893Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6361488Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6362130Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6366098Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6366987Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6367743Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6368369Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6368961Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6369599Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6370206Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6370999Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6371610Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6372245Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6373102Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6373745Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6374355Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6375848Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6376816Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6377754Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6379331Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6379946Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6384221Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6384921Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6385572Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6386211Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6386634Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6387056Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6387526Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6388225Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6388630Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6389038Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6389692Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6390923Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6391434Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6392424Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6393015Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6394249Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6394873Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6395650Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6396753Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6397315Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6398108Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6399121Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6399642Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6400862Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6401616Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6403377Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6404069Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6404888Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6406323Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6407712Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6408140Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6409063Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6409479Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6411262Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6411681Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6413546Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6414253Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6415009Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6415973Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6416911Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6417370Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6418130Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6418821Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6420021Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6420645Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6421591Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6422316Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6423365Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6423780Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6425091Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6425510Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6426272Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6426957Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6428345Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6429201Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6430806Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6431205Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6431886Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6432650Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6434216Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6435037Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6437273Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6437967Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6438634Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6439324Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6440374Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6442038Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6442956Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6444002Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6444799Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6446650Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6447565Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6448902Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6450024Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6451270Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6452313Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6453516Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6454222Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6454984Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6456872Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6457959Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6458696Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6459793Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6460218Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6461165Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6461769Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6463360Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6463785Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6465605Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6466013Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spqpcpb:x:20003857:20001092:conta de servico do produdo QPC - WO0000055376519_REQ000050727425:/home/spqpcpb:/bin/bash
2026-06-08T14:00:23.6466501Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c149824:x:10149824:20000000:SAMUEL RIBEIRO BORGES:/home/c149824:
2026-06-08T14:00:23.6466866Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p649600:x:10649600:20000000:MARLON DE LIMA SILVA:/home/p649600:/bin/bash
2026-06-08T14:00:23.6467683Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c147599:x:10147599:20000000:CINTHIA GIBERTONI KANAAN:/home/c147599:
2026-06-08T14:00:23.6468110Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161489:x:10161489:20000000:MARCOS EMANUEL CARVALHO DOS S D FARIAS:/home/c161489:/bin/bash
2026-06-08T14:00:23.6468476Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161490:x:10161490:20000000:mikaela rocha:/home/c161490:/bin/bash
2026-06-08T14:00:23.6468920Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161452:x:10161452:20000000:ROMULO PEREIRA NISHIYAMA:/home/c161452:/bin/bash
2026-06-08T14:00:23.6470832Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161488:x:10161488:20000000:EDGAR GUIMARAES DAMAZIO JUNIOR:/home/c161488:/bin/bash
2026-06-08T14:00:23.6471439Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f930551:x:10930551:20000000:GUILHERME FORTUNATO GOMES SOUSA:/home/f930551:/bin/bash
2026-06-08T14:00:23.6471803Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161596:x:10161596:20000000:ANDRE DA SILVA FORTES:/home/c161596:/bin/bash
2026-06-08T14:00:23.6472169Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161593:x:10161593:20000000:ARTHUR NACHTIGALL HERNANDEZ:/home/c161593:/bin/bash
2026-06-08T14:00:23.6472712Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161594:x:10161594:20000000:GABRIELA PIRES KLASSMANN:/home/c161594:/bin/bash
2026-06-08T14:00:23.6473795Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161609:x:10161609:20000000:MARCUS VINICIUS HERNANDES R SCHEBEK:/home/c161609:/bin/bash
2026-06-08T14:00:23.6474185Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p618711:x:10618711:20000000:EDUARDO WAGNER DA SILVA DAVID:/home/p618711:/bin/bash
2026-06-08T14:00:23.6474546Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f651198:x:10651198:20000000:PHILIPE PRADO PALADIA:/home/f651198:/bin/bash
2026-06-08T14:00:23.6475189Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f668584:x:10668584:20000000:EDUARDO HIDALGO MACENA PEREIRA:/home/f668584:/bin/bash
2026-06-08T14:00:23.6475756Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f798970:x:10798970:20000000:ADEMIR DE OLIVEIRA:/home/f798970:/bin/bash
2026-06-08T14:00:23.6476227Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161529:x:10161529:20000000:JONATAS DO VALE NUNES:/home/c161529:/bin/bash
2026-06-08T14:00:23.6477988Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161543:x:10161543:20000000:CAIO GABRIEL SILVA CARNEIRO:/home/c161543:/bin/bash
2026-06-08T14:00:23.6478364Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c140984:x:10140984:20000000:EDUARDO GOMES DA SILVA MOTTA:/home/c140984:/bin/bash
2026-06-08T14:00:23.6479449Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161547:x:10161547:20000000:SAULO ARAUJO CORREIA:/home/c161547:/bin/bash
2026-06-08T14:00:23.6480659Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f581373:x:10581373:20000000:DIEGO DELEVEDOVE DE OLIVEIRA:/home/f581373:/bin/bash
2026-06-08T14:00:23.6481773Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p649560:x:10649560:20000000:MANUEL PARIS LEMA JUNIOR:/home/p649560:
2026-06-08T14:00:23.6482172Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p601177:x:10601177:20000000:LAZARO DO ESPIRITO SANTO DE FREITAS:/home/p601177:
2026-06-08T14:00:23.6482618Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f611181:x:10611181:20000000:MAIK LUAN MACEDO SOUSA:/home/f611181:/bin/bash
2026-06-08T14:00:23.6482996Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f611396:x:10611396:20000000:RICARDO SILVA BASTOS:/home/f611396:/bin/bash
2026-06-08T14:00:23.6483441Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f697386:x:10697386:20001097:ROBERTO BUSSE MAGALHAES:/home/f697386:/bin/bash
2026-06-08T14:00:23.6484186Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f684737:x:10684737:20000000:ALAN DE SOUSA CARVALHO:/home/f684737:/bin/bash
2026-06-08T14:00:23.6484634Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c108369:x:10108369:20000000:WILLIAM DOS SANTOS OLIVEIRA:/home/c108369:
2026-06-08T14:00:23.6494584Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spansp20:x:20006021:30000879:spansp20:/home/spansp20:/bin/bash
2026-06-08T14:00:23.6494971Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f701702:x:10701702:20000000:TAISE CRISTINA DE SOUZA:/home/f701702:/bin/bash
2026-06-08T14:00:23.6495322Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f582064:x:10582064:20000000:JADE DE SOUZA PEREIRA:/home/f582064:/bin/bash
2026-06-08T14:00:23.6495674Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f590609:x:10590609:20000000:THAMIRES VASCONCELOS DA SILVA:/home/f590609:
2026-06-08T14:00:23.6496050Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a159723:x:10159723:30000001:GABRIEL CARRASCO QUEIROZ:/home/a159723:/bin/bash
2026-06-08T14:00:23.6496510Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f567607:x:10567607:20000000:BRENDON OLSE ILHA:/home/f567607:/bin/bash
2026-06-08T14:00:23.6496884Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a160428:x:10160428:30000001:DANILO PEDROSO DE MORAES:/home/a160428:/bin/bash
2026-06-08T14:00:23.6497248Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f543932:x:10543932:20000000:RAFAEL VIEIRA DA SILVA NASCIMENTO:/home/f543932:/bin/bash
2026-06-08T14:00:23.6497722Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c079497:x:10079497:20000000:FABIO LUIS DOS SANTOS:/home/c079497:/bin/bash
2026-06-08T14:00:23.6498260Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c066524:x:10066524:20000000:PEDRO MARCIO BIAZON:/home/c066524:/bin/bash
2026-06-08T14:00:23.6498610Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c043217:x:10043217:20000000:CIRVALDO ANTONIO PEREIRA:/home/c043217:/bin/bash
2026-06-08T14:00:23.6498978Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c046090:x:10046090:20000000:ERNANI PEREIRA DE SOUZA FILHO:/home/c046090:/bin/bash
2026-06-08T14:00:23.6499335Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c076746:x:10076746:20000000:MARCO ANTONIO LOPES MOREIRA:/home/c076746:/bin/bash
2026-06-08T14:00:23.6499680Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c021454:x:10021454:20000000:MARCOS HIDEYO UMEZAKI:/home/c021454:/bin/bash
2026-06-08T14:00:23.6500023Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c082404:x:10082404:20000000:RODNEI DA SILVA:/home/c082404:/bin/bash
2026-06-08T14:00:23.6500472Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c091894:x:10091894:20000000:SARON COLONA CARDOZO:/home/c091894:/bin/bash
2026-06-08T14:00:23.6500849Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c070899:x:10070899:20000000:MARCOS PAULO DE SOUZA BERNARDES:/home/c070899:/bin/bash
2026-06-08T14:00:23.6501210Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c081673:x:10081673:20000000:PATRICK AIRES OLIVEIRA FRANCO:/home/c081673:/bin/bash
2026-06-08T14:00:23.6501571Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c068162:x:10068162:20000000:CARLOS JOSE PEREIRA BELMONTE:/home/c068162:/bin/bash
2026-06-08T14:00:23.6502116Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spdcpb07:x:20006022:20009980:Conta.owner.arquivos.SIPDC.aplicacao.docker_TAS000047127381_CRQ000001288495_REQ000142394211:/home/spdcpb07:/bin/bash
2026-06-08T14:00:23.6502722Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f772914:x:10772914:20000000:DANIEL TEIXEIRA NOGUEIROL:/home/f772914:/bin/bash
2026-06-08T14:00:23.6503090Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161509:x:10161509:20000000:GABRIEL PORTELA GOMES:/home/c161509:/bin/bash
2026-06-08T14:00:23.6503502Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161533:x:10161533:20000000:JOAO GABRIEL BARRETO CARDOSO:/home/c161533:/bin/bash
2026-06-08T14:00:23.6503954Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f585482:x:10585482:20000000:JOSE RODOLFO DO NASCIMENTO ROZENDO:/home/f585482:/bin/bash
2026-06-08T14:00:23.6504334Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161486:x:10161486:20000000:RONALDO MIRANDA DA SILVA:/home/c161486:/bin/bash
2026-06-08T14:00:23.6504698Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161449:x:10161449:20000000:MARCUS FELIPE MAGALHAES MENDES:/home/c161449:/bin/bash
2026-06-08T14:00:23.6505054Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c032660:x:10032660:20000000:HERBERT DOS SANTOS FERREIRA:/home/c032660:/bin/bash
2026-06-08T14:00:23.6505417Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c023885:x:10023885:20000000:VALDEMIRO FURTADO DE LUCCA:/home/c023885:/bin/bash
2026-06-08T14:00:23.6505770Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f540410:x:10540410:20000000:EVERSON JOSE DE SOUZA HOLANDA:/home/f540410:
2026-06-08T14:00:23.6506116Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f535058:x:10535058:20000000:FREDERICO DE QUEIROZ REIS:/home/f535058:/bin/bash
2026-06-08T14:00:23.6506517Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c077152:x:10077152:20000000:MARIANA ANDRADE DOS SANTOS:/home/c077152:/bin/bash
2026-06-08T14:00:23.6506970Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159020:x:10159020:20000000:LUCAS GUIMARAES GASSERT:/home/c159020:/bin/bash
2026-06-08T14:00:23.6507356Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161253:x:10161253:20000000:ANDRE FELIPE CORRADI BOTELHO:/home/c161253:
2026-06-08T14:00:23.6508374Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161500:x:10161500:20000000:EDUARDO MAIA REZENDE:/home/c161500:/bin/bash
2026-06-08T14:00:23.6509572Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f929588:x:10929588:20000000:DIEGO LEONARDO FRANCA ABBADE:/home/f929588:/bin/bash
2026-06-08T14:00:23.6510199Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161455:x:10161455:20000000:ARTHUR WILLIAM DOREA MELO:/home/c161455:/bin/bash
2026-06-08T14:00:23.6510842Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f947645:x:10947645:20000000:ROGERIO LUIZ DE OLIVEIRA:/home/f947645:/bin/bash
2026-06-08T14:00:23.6511657Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c105982:x:10105982:20000000:HULIANNE VIRGINIA MAGALHAES S MARTINHO:/home/c105982:
2026-06-08T14:00:23.6512239Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f662182:x:10662182:20000000:ELIELMA SALGADO SILVEIRA:/home/f662182:/bin/bash
2026-06-08T14:00:23.6513144Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p506207:x:10506207:20000000:DENILSON DO CARMO CASTELLO:/home/p506207:/bin/bash
2026-06-08T14:00:23.6513733Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f550971:x:10550971:20000000:GIOVANE SOARES DE OLIVEIRA:/home/f550971:
2026-06-08T14:00:23.6514373Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f565840:x:10565840:20000000:ALAN FRANCIS DA SILVA HIGINO:/home/f565840:/bin/bash
2026-06-08T14:00:23.6514743Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f939110:x:10939110:20000000:GUILHERME JOSE RAMOS DE SOUZA:/home/f939110:/bin/bash
2026-06-08T14:00:23.6515291Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c090347:x:10090347:20000000:FABIO SEIXAS SALES:/home/c090347:/bin/bash
2026-06-08T14:00:23.6515652Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161530:x:10161530:20000000:MATEUS OLIVEIRA SANTOS:/home/c161530:/bin/bash
2026-06-08T14:00:23.6516014Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p981778:x:10981778:20000000:THIAGO JEFERSON DE SOUSA SILVA:/home/p981778:/bin/bash
2026-06-08T14:00:23.6521335Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161187:x:10161187:20000000:JONATAN AUGUSTO SILVA AMORIM:/home/c161187:/bin/bash
2026-06-08T14:00:23.6521722Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f518689:x:10518689:20000000:LUCAS DE CARVALHO FELIZARDO:/home/f518689:/bin/bash
2026-06-08T14:00:23.6523629Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f546953:x:10546953:20000000:DEYVISON GOMES DE OLIVEIRA:/home/f546953:/bin/bash
2026-06-08T14:00:23.6524777Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161497:x:10161497:20000000:ROGER CURTI:/home/c161497:/bin/bash
2026-06-08T14:00:23.6525278Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f525039:x:10525039:20000000:RAPHAEL CORREA HAUSSMANN:/home/f525039:/bin/bash
2026-06-08T14:00:23.6525809Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f586625:x:10586625:20000000:GUSTAVO RODRIGUES COIMBRA:/home/f586625:
2026-06-08T14:00:23.6526952Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161284:x:10161284:20000000:CLAUDIO ROBERTO ASSAD CRUDO DA SILVA:/home/c161284:
2026-06-08T14:00:23.6527543Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161476:x:10161476:20000000:ERALDO CARLOS RODRIGUES DA SILVA:/home/c161476:/bin/bash
2026-06-08T14:00:23.6530094Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161467:x:10161467:20000000:JOAO PEDRO GUIMARAES DOS SANTOS SANTANA:/home/c161467:/bin/bash
2026-06-08T14:00:23.6537606Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161590:x:10161590:20000000:FELIPE ROCHA SILVEIRA:/home/c161590:/bin/bash
2026-06-08T14:00:23.6538027Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p585147:x:10585147:20000000:EMERSON SALES DA COSTA:/home/p585147:/bin/bash
2026-06-08T14:00:23.6538395Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p548031:x:10548031:20000000:WALISON DOS SANTOS MORALES:/home/p548031:
2026-06-08T14:00:23.6538757Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f527546:x:10527546:20000000:FRANCISCO JEFFERSON SILVA EUZEBIO:/home/f527546:/bin/bash
2026-06-08T14:00:23.6539135Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a054088:x:10054088:30000001:EDUARDO FLEMING DE AZEVEDO COSTA:/home/a054088:/bin/bash
2026-06-08T14:00:23.6539512Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c108138:x:10108138:20000000:TERESA CRISTINA PIMENTA TEIXEIRA:/home/c108138:/bin/bash
2026-06-08T14:00:23.6539876Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f616169:x:10616169:20000000:PAULO HENRIQUE PEREIRA DA SILVA:/home/f616169:/bin/bash
2026-06-08T14:00:23.6540233Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161591:x:10161591:20000000:ANGELO FERNANDES OLIVEIRA:/home/c161591:/bin/bash
2026-06-08T14:00:23.6540591Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c082366:x:10082366:20000000:NUBIA DE CASSIA SILVA OLIVEIRA:/home/c082366:/bin/bash
2026-06-08T14:00:23.6540948Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c090442:x:10090442:20000000:MARIA DE FATIMA DA COSTA VIANNA:/home/c090442:/bin/bash
2026-06-08T14:00:23.6541934Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161463:x:10161463:20000000:BENJAMIN DA NOBREGA BEZERRA:/home/c161463:
2026-06-08T14:00:23.6543710Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f504356:x:10504356:20000000:LEANDRO PEREIRA DE AZEVEDO:/home/f504356:/bin/bash
2026-06-08T14:00:23.6552517Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159855:x:10159855:20000000:RENATO DA CUNHA FREITAS:/home/c159855:/bin/bash
2026-06-08T14:00:23.6552975Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p572009:x:10572009:20000000:ESTEVAO VERISSIMO BORGES:/home/p572009:/bin/bash
2026-06-08T14:00:23.6553331Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159436:x:10159436:20000000:LUIZ FELIPE DA CRUZ SIMAS VAZ:/home/c159436:
2026-06-08T14:00:23.6553692Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f545480:x:10545480:20000000:GEAN VITOR MACEDO DE SOUSA:/home/f545480:/bin/bash
2026-06-08T14:00:23.6554059Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f610044:x:10610044:20000000:JOAO VICTOR BERNARDINO DA SILVA REIS:/home/f610044:/bin/bash
2026-06-08T14:00:23.6554424Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f567419:x:10567419:20000000:THIAGO HENRIQUE DOMINGUES BOTELHO:/home/f567419:/bin/bash
2026-06-08T14:00:23.6554900Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f670465:x:10670465:20000000:BRUNO XAVIER PEIXOTO DA ROCHA:/home/f670465:/bin/bash
2026-06-08T14:00:23.6555252Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f591522:x:10591522:20000000:DANIEL XAVIER DOS REIS:/home/f591522:/bin/bash
2026-06-08T14:00:23.6555605Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a159659:x:10159659:30000001:ISMAEL TEIXEIRA SILVA:/home/a159659:/bin/bash
2026-06-08T14:00:23.6556509Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159673:x:10159673:20000000:FILIPE DE OLIVEIRA SOUZA:/home/c159673:/bin/bash
2026-06-08T14:00:23.6556855Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p794912:x:10794912:20000000:RICARDO DE ANDRADE:/home/p794912:/bin/bash
2026-06-08T14:00:23.6557221Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f512193:x:10512193:20000000:EUDESLENE CRISTINA MENDES DA ROCHA:/home/f512193:/bin/bash
2026-06-08T14:00:23.6558213Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161243:x:10161243:20000000:LEONARDO LAIA ARPINI:/home/c161243:/bin/bash
2026-06-08T14:00:23.6558639Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f935694:x:10935694:20000000:ITALO VASCONCELOS DE FRANCA:/home/f935694:
2026-06-08T14:00:23.6560438Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f753560:x:10753560:20000000:FABRICIO CRUZ MOREIRA:/home/f753560:/bin/bash
2026-06-08T14:00:23.6563324Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159548:x:10159548:20000000:NATHAN RODRIGUES FERREIRA GONCALVES:/home/c159548:/bin/bash
2026-06-08T14:00:23.6563711Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f618809:x:10618809:20000000:DANILO BAPTISTA DE OLIVEIRA NEVES:/home/f618809:/bin/bash
2026-06-08T14:00:23.6564431Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f663619:x:10663619:20000000:JOAO HIGO SOUSA NUNES:/home/f663619:
2026-06-08T14:00:23.6564940Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f584047:x:10584047:20000000:KERLYSON DOS SANTOS SILVA:/home/f584047:
2026-06-08T14:00:23.6569344Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f512076:x:10512076:20000000:CARLOS ALBERTO JUSTE GONZALEZ:/home/f512076:/bin/bash
2026-06-08T14:00:23.6569901Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f534542:x:10534542:20000000:TIAGO EMILIO DA SILVA:/home/f534542:/bin/bash
2026-06-08T14:00:23.6570461Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f549188:x:10549188:20000000:MARCOS DE FARIA FILHO:/home/f549188:/bin/bash
2026-06-08T14:00:23.6571321Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f966820:x:10966820:20000000:PEDRO AUGUSTO DE BRITTO BARCELLOS:/home/f966820:/bin/bash
2026-06-08T14:00:23.6571698Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158794:x:10158794:20000000:LEONARDO LAGE CERQUEIRA CARDOSO:/home/c158794:
2026-06-08T14:00:23.6573257Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p606962:x:10606962:20000000:JEFFERSON GONCALVES FARIAS:/home/p606962:/bin/bash
2026-06-08T14:00:23.6573631Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f562822:x:10562822:20000000:RONALDO PALMA GONCALVES:/home/f562822:/bin/bash
2026-06-08T14:00:23.6573982Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f685705:x:10685705:20000000:FABIO SANTOS POLIDO:/home/f685705:/bin/bash
2026-06-08T14:00:23.6574386Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f958348:x:10958348:20000000:LUIZ CLAUDIO TOLEDO DE ALMEIDA:/home/f958348:/bin/bash
2026-06-08T14:00:23.6574956Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p910166:x:10910166:20000000:PAULO FERNANDO DA CONCEICAO:/home/p910166:/bin/bash
2026-06-08T14:00:23.6575577Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f938868:x:10938868:20000000:ELIZANGELA PINHEIRO BORGES:/home/f938868:/bin/bash
2026-06-08T14:00:23.6576208Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a087014:x:10087014:30000001:ANDRE LUIS COUTO CAVALCANTI:/home/a087014:/bin/bash
2026-06-08T14:00:23.6576675Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f533960:x:10533960:20000000:JOAO PEDRO AGUIAR MARTINS:/home/f533960:/bin/bash
2026-06-08T14:00:23.6577293Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f589119:x:10589119:20000000:WICTOR LEANDRO SILVA ROLEMBERG:/home/f589119:/bin/bash
2026-06-08T14:00:23.6577869Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p653294:x:10653294:20000000:VINICIUS FERNANDES PINHEIRO DA SILVA:/home/p653294:/bin/bash
2026-06-08T14:00:23.6585692Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f554365:x:10554365:20000000:DAYSE CRISTIANE DA SILVA CASTRO:/home/f554365:/bin/bash
2026-06-08T14:00:23.6586079Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f613559:x:10613559:20000000:DANIEL SILVA SOUSA DE OLIVEIRA:/home/f613559:/bin/bash
2026-06-08T14:00:23.6586438Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c063681:x:10063681:20000000:ANDRE AUGUSTO DE ARAUJO COSTA:/home/c063681:
2026-06-08T14:00:23.6586798Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f662819:x:10662819:20000000:NILO HENRIQUE LOPES CHAVES:/home/f662819:
2026-06-08T14:00:23.6587146Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f596332:x:10596332:20000000:SABRINA FERREIRA SILVA:/home/f596332:/bin/bash
2026-06-08T14:00:23.6588937Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c095884:x:10095884:20000000:MARIANA DOS SANTOS PIRES:/home/c095884:/bin/bash
2026-06-08T14:00:23.6589317Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161520:x:10161520:20000000:TAUA VALENTIM DE ALBUQUERQUE M FRADE:/home/c161520:/bin/bash
2026-06-08T14:00:23.6589895Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c092577:x:10092577:20000000:RENATO ARNALDO DA SILVA:/home/c092577:/bin/bash
2026-06-08T14:00:23.6590246Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f591365:x:10591365:20000000:FABIANO NOVAES DE ANDRADE:/home/f591365:/bin/bash
2026-06-08T14:00:23.6590609Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f607003:x:10607003:20000000:PAULO HENRIQUE PEREIRA ALBUQUERQUE:/home/f607003:/bin/bash
2026-06-08T14:00:23.6590971Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p512077:x:10512077:20000000:DYEGO DOS SANTOS BARROS:/home/p512077:/bin/bash
2026-06-08T14:00:23.6591312Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f662970:x:10662970:20000000:DOUGLAS MATIAS DREER:/home/f662970:
2026-06-08T14:00:23.6591829Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f662610:x:10662610:20000000:RAFAEL CARLOS DIAS:/home/f662610:/bin/bash
2026-06-08T14:00:23.6592348Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f556213:x:10556213:20000000:ANDREI DA SILVA ESPIRITO SANTO:/home/f556213:/bin/bash
2026-06-08T14:00:23.6592952Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f926041:x:10926041:20000000:JOSENE MARIANO PACHECO:/home/f926041:/bin/bash
2026-06-08T14:00:23.6593443Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p602532:x:10602532:20000000:HUGO DE SOUSA OLIVEIRA:/home/p602532:
2026-06-08T14:00:23.6594009Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161514:x:10161514:20000000:CHRISTIAN BRAGA DE ALMEIDA PIRES:/home/c161514:/bin/bash
2026-06-08T14:00:23.6594487Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f581055:x:10581055:20000000:GUSTAVO GOMES DOS SANTOS:/home/f581055:
2026-06-08T14:00:23.6595010Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f576019:x:10576019:20000000:THIAGO FREITAS DA SILVA:/home/f576019:
2026-06-08T14:00:23.6595410Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f639008:x:10639008:20000000:EVERTON OLIVEIRA BERNASKI:/home/f639008:/bin/bash
2026-06-08T14:00:23.6595766Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f669298:x:10669298:20000000:FILIPE CASTRO SANTOS:/home/f669298:/bin/bash
2026-06-08T14:00:23.6596129Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f531774:x:10531774:20000000:MATHEUS ALBERT OLIVEIRA DOS SANTOS:/home/f531774:/bin/bash
2026-06-08T14:00:23.6596490Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f615721:x:10615721:20000000:ANA LUIZA GOMIDE DO NASCIMENTO:/home/f615721:/bin/bash
2026-06-08T14:00:23.6596847Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f719858:x:10719858:20000000:PABLO WANIERY GONCALVES:/home/f719858:/bin/bash
2026-06-08T14:00:23.6597203Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f535795:x:10535795:20000000:FABIO BRANDAO DAMASCENO:/home/f535795:/bin/bash
2026-06-08T14:00:23.6597559Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f677192:x:10677192:20000000:LUIZ HENRIQUE CERQUEIRA CHAVES FILHO:/home/f677192:/bin/bash
2026-06-08T14:00:23.6599170Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f704369:x:10704369:20000000:PEDRO HENRIQUE FONSECA MARTINS:/home/f704369:/bin/bash
2026-06-08T14:00:23.6599527Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p618519:x:10618519:20000000:DIEGO SILVA DE SOUZA:/home/p618519:/bin/bash
2026-06-08T14:00:23.6599880Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f729309:x:10729309:20000000:MICHELLE MARIA DA SILVA:/home/f729309:/bin/bash
2026-06-08T14:00:23.6600317Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f531777:x:10531777:20000000:WERBERTH BARBOSA GUIMARAES:/home/f531777:/bin/bash
2026-06-08T14:00:23.6600744Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p526060:x:10526060:20000000:ALESSANDRO ALVES DOS SANTOS:/home/p526060:/bin/bash
2026-06-08T14:00:23.6601448Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f524606:x:10524606:20000000:ITALO DE MOURA LOPES:/home/f524606:/bin/bash
2026-06-08T14:00:23.6604453Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161624:x:10161624:20000000:BRUNA ALMEIDA SANTOS:/home/c161624:
2026-06-08T14:00:23.6604968Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f575885:x:10575885:20000000:JESSICA DOS SANTOS SILVANO:/home/f575885:
2026-06-08T14:00:23.6605589Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f956085:x:10956085:20000000:GERONIMO RODRIGO FERCONDINI:/home/f956085:/bin/bash
2026-06-08T14:00:23.6606080Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c131457:x:10131457:20000000:FELIPE MARTINS RODRIGUES:/home/c131457:/bin/bash
2026-06-08T14:00:23.6606428Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f755377:x:10755377:20000000:MARCIO LIMA BARBOSA:/home/f755377:
2026-06-08T14:00:23.6606897Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f592359:x:10592359:20000000:ALAN CREI DA SILVA:/home/f592359:/bin/bash
2026-06-08T14:00:23.6608114Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f638747:x:10638747:20000000:LADYLAINE CAROLINA DOS SANTOS:/home/f638747:/bin/bash
2026-06-08T14:00:23.6608837Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p768339:x:10768339:20000000:DHAVID DE MELO RIBEIRO:/home/p768339:/bin/bash
2026-06-08T14:00:23.6609474Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f587590:x:10587590:20000000:ANTONIO WILLIAMS DE OLIVEIRA NETO:/home/f587590:/bin/bash
2026-06-08T14:00:23.6610074Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c021643:x:10021643:20000000:CHRISTIANE MARTINS VIEIRA:/home/c021643:/bin/bash
2026-06-08T14:00:23.6610850Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161539:x:10161539:20000000:VALDERSON PONTES DA SILVA JUNIOR:/home/c161539:/bin/bash
2026-06-08T14:00:23.6611585Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f716877:x:10716877:20000000:DANILO DA SILVA ROCHA:/home/f716877:/bin/bash
2026-06-08T14:00:23.6613424Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f723696:x:10723696:20000000:ELBER FERNANDES DE LIMA:/home/f723696:/bin/bash
2026-06-08T14:00:23.6614021Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f654205:x:10654205:20000000:INAJARA OLIVEIRA ORIONE PONTES:/home/f654205:/bin/bash
2026-06-08T14:00:23.6614900Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f522420:x:10522420:20000000:HUGO VINICIUS BRITO FERREIRA DE AZEVEDO:/home/f522420:/bin/bash
2026-06-08T14:00:23.6615438Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f665926:x:10665926:20000000:CAMILA ALVES FERNANDES:/home/f665926:/bin/bash
2026-06-08T14:00:23.6615849Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f621468:x:10621468:20000000:DANUBIA FERNANDES DOS SANTOS:/home/f621468:/bin/bash
2026-06-08T14:00:23.6616614Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f621827:x:10621827:20000000:ISABELA MAMEDE SILVA:/home/f621827:/bin/bash
2026-06-08T14:00:23.6617323Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f672073:x:10672073:20000000:JOAO BATISTA FERREIRA JUNIOR:/home/f672073:
2026-06-08T14:00:23.6622218Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161861:x:10161861:20000000:RUI BRAGA DAS CHAGAS JUNIOR:/home/c161861:
2026-06-08T14:00:23.6622815Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161783:x:10161783:20000000:SAMUEL ABREU DE OLIVEIRA:/home/c161783:
2026-06-08T14:00:23.6623414Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f591261:x:10591261:20000000:MAGNO ASSIS RIBEIRO:/home/f591261:/bin/bash
2026-06-08T14:00:23.6623867Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161803:x:10161803:20000000:ARTHUR DE OLIVEIRA CAVALCANTI:/home/c161803:
2026-06-08T14:00:23.6624336Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spnowd01:x:20006027:20009985:Conta.servico.ServiceNow.NPRD.WO0000079324894_REQ000142975779:/home/spnowd01:/bin/bash
2026-06-08T14:00:23.6624785Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c081121:x:10081121:20000000:LEANDRO NOGUEIRA DE MEDEIROS:/home/c081121:/bin/bash
2026-06-08T14:00:23.6625341Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f648102:x:10648102:20000000:JOAO GUEDES DE BRITO:/home/f648102:
2026-06-08T14:00:23.6625930Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f562763:x:10562763:20000000:JEFFERSON CLEMENTINO FERREIRA:/home/f562763:/bin/bash
2026-06-08T14:00:23.6626573Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f770142:x:10770142:20000000:RHAYK VINICIUS DAMACENA ALVES:/home/f770142:/bin/bash
2026-06-08T14:00:23.6627056Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c114332:x:10114332:20000000:FABIANA CARVALHO COUTO NONAKA:/home/c114332:
2026-06-08T14:00:23.6627469Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159870:x:10159870:20000000:DIEGO REIS CHAIN:/home/c159870:/bin/bash
2026-06-08T14:00:23.6627858Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f648865:x:10648865:20000000:ROGERIO PONTES HENRIQUES JUNIOR:/home/f648865:/bin/bash
2026-06-08T14:00:23.6628225Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c077159:x:10077159:20000000:MARCELO LOPES CAMELO:/home/c077159:/bin/bash
2026-06-08T14:00:23.6628650Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c089191:x:10089191:20000000:CARLOS ANTONIO SARI MOREIRA DA SILVA:/home/c089191:/bin/bash
2026-06-08T14:00:23.6629036Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p656058:x:10656058:20000000:BEATRIZ VITORIA DA SILVA TORRES:/home/p656058:/bin/bash
2026-06-08T14:00:23.6629470Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161554:x:10161554:20000000:ANGELO ALBERTO LEITE SOUZA:/home/c161554:/bin/bash
2026-06-08T14:00:23.6629834Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f579079:x:10579079:20000000:RENAN FERREIRA DE SOUZA AUER:/home/f579079:/bin/bash
2026-06-08T14:00:23.6630182Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f915942:x:10915942:20000000:LEONN DENIS DAMACENO:/home/f915942:/bin/bash
2026-06-08T14:00:23.6630539Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c137993:x:10137993:20000000:LUIZ ANTONIO RICCI DOS SANTOS:/home/c137993:/bin/bash
2026-06-08T14:00:23.6630953Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f670135:x:10670135:20000000:FILIPE DOS REIS LOPES:/home/f670135:/bin/bash
2026-06-08T14:00:23.6631408Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f575318:x:10575318:20000000:RENER FERREIRA LEMOS:/home/f575318:/bin/bash
2026-06-08T14:00:23.6631990Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161836:x:10161836:20000000:DONALD WILLIANS CARDOSO SERAFIM:/home/c161836:/bin/bash
2026-06-08T14:00:23.6632352Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f736171:x:10736171:20000000:ARTHU BARROS DE OLIVEIRA:/home/f736171:/bin/bash
2026-06-08T14:00:23.6632890Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159545:x:10159545:20000000:GABRIEL FRANCO BARRETO CAVALCANTI:/home/c159545:/bin/bash
2026-06-08T14:00:23.6633262Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158825:x:10158825:20000000:FILIPE DE MELO MESQUITA:/home/c158825:/bin/bash
2026-06-08T14:00:23.6633634Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161805:x:10161805:20000000:GABRIEL DO NASCIMENTO ARAUJO ESTEVAM:/home/c161805:/bin/bash
2026-06-08T14:00:23.6634222Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161750:x:10161750:20000000:ANTONIO DAVID BRENO SOUZA LIMA:/home/c161750:/bin/bash
2026-06-08T14:00:23.6634667Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161538:x:10161538:20000000:CRISTIAN SOUZA ASSIS FURTADO:/home/c161538:/bin/bash
2026-06-08T14:00:23.6635432Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f710005:x:10710005:20000000:CLEYTON DE JESUS SALES PRUDENCIO:/home/f710005:/bin/bash
2026-06-08T14:00:23.6638804Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161755:x:10161755:20000000:JOAO VICTOR CABRAL DE MELO:/home/c161755:/bin/bash
2026-06-08T14:00:23.6639273Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161815:x:10161815:20000000:THIAGO AUGUSTO PEREIRA AMARAL:/home/c161815:/bin/bash
2026-06-08T14:00:23.6639706Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f620927:x:10620927:20000000:JOSE DE RIBAMAR JANSEN FERREIRA FILHO:/home/f620927:/bin/bash
2026-06-08T14:00:23.6640101Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161798:x:10161798:20000000:CAIO HENRIQUE CIRIACO DE MEDEIROS:/home/c161798:
2026-06-08T14:00:23.6640498Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161807:x:10161807:20000000:JORGE AUGUSTO ROCHA DE CARVALHO:/home/c161807:/bin/bash
2026-06-08T14:00:23.6641010Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f709654:x:10709654:20000000:GUSTAVO MATEUS DE SOUSA DE SANTANA:/home/f709654:/bin/bash
2026-06-08T14:00:23.6641587Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161779:x:10161779:20000000:JOAO PEDRO CORREIA NOGUEIRA MOTA:/home/c161779:
2026-06-08T14:00:23.6641947Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f551942:x:10551942:20000000:DANIEL MONTEIRO DE SOUSA:/home/f551942:/bin/bash
2026-06-08T14:00:23.6643738Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158865:x:10158865:20000000:LUIZ SERGIO PAMPLONA BASTOS:/home/c158865:/bin/bash
2026-06-08T14:00:23.6644181Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f701518:x:10701518:20000000:EDVAN OLIVEIRA CAETANO JUNIOR:/home/f701518:/bin/bash
2026-06-08T14:00:23.6644625Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f585733:x:10585733:20000000:GILBERTO TAVARES DE FRANCO NERY:/home/f585733:/bin/bash
2026-06-08T14:00:23.6645620Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c051064:x:10051064:20000000:PEDRO JAMAS:/home/c051064:/bin/bash
2026-06-08T14:00:23.6645992Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158849:x:10158849:20000000:ADRIELLY DA SILVA BALBINO:/home/c158849:/bin/bash
2026-06-08T14:00:23.6647048Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c118793:x:10118793:20000000:JONES ALVES GUIMARAES:/home/c118793:/bin/bash
2026-06-08T14:00:23.6647413Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p727929:x:10727929:20000000:DIOGO MELO BARROS:/home/p727929:/bin/bash
2026-06-08T14:00:23.6651429Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f556291:x:10556291:20000000:CLEITON CARNEIRO DE MELO:/home/f556291:/bin/bash
2026-06-08T14:00:23.6651871Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c073949:x:10073949:20000000:ANDRE DE SOUZA MORAES:/home/c073949:/bin/bash
2026-06-08T14:00:23.6652236Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161780:x:10161780:20000000:PEDRO HENRIQUE CABRAL JERSEY:/home/c161780:/bin/bash
2026-06-08T14:00:23.6652937Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f770803:x:10770803:20000000:GUILHERME DIAS LOPES:/home/f770803:/bin/bash
2026-06-08T14:00:23.6653311Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f733890:x:10733890:20000000:RODRIGO NASCIMENTO DE ALBUQUERQUE:/home/f733890:
2026-06-08T14:00:23.6654432Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c127109:x:10127109:20000000:SANDRA BENVENUTI:/home/c127109:/bin/bash
2026-06-08T14:00:23.6654866Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f695062:x:10695062:20000000:EDUARDO FELIPE DAS NEVES ABIDO:/home/f695062:/bin/bash
2026-06-08T14:00:23.6655771Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p514731:x:10514731:20000000:TADEU LOPES FAUSTINO:/home/p514731:/bin/bash
2026-06-08T14:00:23.6656337Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f788775:x:10788775:20000000:GUILHERME BARBOSA SALES DA ROCHA:/home/f788775:
2026-06-08T14:00:23.6656713Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f693489:x:10693489:20000000:CARLOS EDUARDO ROCHA ARAUJO:/home/f693489:
2026-06-08T14:00:23.6657136Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p665982:x:10665982:20000000:OLAVO FERREIRA DE FARIA:/home/p665982:/bin/bash
2026-06-08T14:00:23.6657741Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161484:x:10161484:20000000:WALLISSON FRANCA DA SILVA:/home/c161484:/bin/bash
2026-06-08T14:00:23.6658284Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f589311:x:10589311:20000000:ADRIANA PERES DE OLIVEIRA:/home/f589311:
2026-06-08T14:00:23.6659165Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a159076:x:10159076:30000001:MARCOS VINICIOS DA CRUZ DE SA:/home/a159076:/bin/bash
2026-06-08T14:00:23.6659586Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f522683:x:10522683:20000000:WALISSON LEAL GONTIJO:/home/f522683:/bin/bash
2026-06-08T14:00:23.6660183Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161268:x:10161268:20000000:MARCOS VINICIUS FERNANDES VIEIRA:/home/c161268:/bin/bash
2026-06-08T14:00:23.6660712Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f535941:x:10535941:20000000:EDUARDO ALVES DOS SANTOS:/home/f535941:
2026-06-08T14:00:23.6661385Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f793716:x:10793716:20000000:FERNANDO DOS SANTOS RIBEIRO:/home/f793716:/bin/bash
2026-06-08T14:00:23.6661956Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161865:x:10161865:20000000:GABRIEL LUCAS FRANCA DO NASCIMENTO:/home/c161865:/bin/bash
2026-06-08T14:00:23.6662454Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161811:x:10161811:20000000:DANIEL CARVALHO DE RESENDE QUEIROZ:/home/c161811:/bin/bash
2026-06-08T14:00:23.6663310Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161481:x:10161481:20000000:ERISTON LIMA DE PAULA:/home/c161481:/bin/bash
2026-06-08T14:00:23.6663680Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161775:x:10161775:20000000:ALEXANDRE GABRIEL GOMES LUSTOSA:/home/c161775:/bin/bash
2026-06-08T14:00:23.6664108Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f570179:x:10570179:20000000:WILLIANS SOARES:/home/f570179:
2026-06-08T14:00:23.6664839Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c160442:x:10160442:20000000:LUIZ HENRIQUE APARECIDO DE SOUZA:/home/c160442:
2026-06-08T14:00:23.6665309Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a158826:x:10158826:30000001:LUA GUIMARAES SANTIAGO:/home/a158826:/bin/bash
2026-06-08T14:00:23.6665693Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f746619:x:10746619:20000000:THAIS DE LIMA SANTOS CAVALCANTE:/home/f746619:/bin/bash
2026-06-08T14:00:23.6666049Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161784:x:10161784:20000000:HUDSON OLIVEIRA SENA:/home/c161784:/bin/bash
2026-06-08T14:00:23.6666446Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c084911:x:10084911:20000000:MARCELO ZACHEU CONTI:/home/c084911:/bin/bash
2026-06-08T14:00:23.6667873Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a152798:x:10152798:30000001:JEFFERSON RICARDO SILVA DE SOUZA:/home/a152798:/bin/bash
2026-06-08T14:00:23.6668279Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f959414:x:10959414:20000000:SANDRO DOS SANTOS SAGINI:/home/f959414:/bin/bash
2026-06-08T14:00:23.6668620Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f748541:x:10748541:20000000:ELTON MACHADO GOMES:/home/f748541:
2026-06-08T14:00:23.6669923Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a161765:x:10161765:30000001:DANIEL CARVALHO DE OLIVEIRA:/home/a161765:/bin/bash
2026-06-08T14:00:23.6670373Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c157125:x:10157125:20000000:FABIANA MARTINS DE OLIVEIRA:/home/c157125:/bin/bash
2026-06-08T14:00:23.6670731Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f613633:x:10613633:20000000:MATEUS FIGUEIREDO BRAZ:/home/f613633:/bin/bash
2026-06-08T14:00:23.6674413Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f526890:x:10526890:20000000:RANYEL DE PAULA LELIS:/home/f526890:
2026-06-08T14:00:23.6674804Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f744223:x:10744223:20000000:BRUNO NASCIMENTO TAVARES:/home/f744223:/bin/bash
2026-06-08T14:00:23.6675191Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f698199:x:10698199:20000000:GEORGE LUIS BEZERRA DE ARAUJO SILVA TERR:/home/f698199:/bin/bash
2026-06-08T14:00:23.6675541Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f650979:x:10650979:20000000:IAGO FARIA DOS REIS:/home/f650979:/bin/bash
2026-06-08T14:00:23.6676030Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f749520:x:10749520:20000000:ALAN CEZAR PINHEIRO FIGUEIREDO:/home/f749520:/bin/bash
2026-06-08T14:00:23.6676416Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f992565:x:10992565:20000000:FELIPE MOTA DE GODOY:/home/f992565:/bin/bash
2026-06-08T14:00:23.6676763Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f642364:x:10642364:20000000:IRVING DA SILVA PENHA:/home/f642364:/bin/bash
2026-06-08T14:00:23.6677126Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f694806:x:10694806:20000000:THIAGO LUCAS DOS SANTOS SANDI:/home/f694806:
2026-06-08T14:00:23.6677882Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c106232:x:10106232:20000000:ALBERTO AKIO KYONO:/home/c106232:
2026-06-08T14:00:23.6678442Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p693404:x:10693404:20000000:FERNANDINO MESQUITA E SILVA:/home/p693404:/bin/bash
2026-06-08T14:00:23.6678973Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161796:x:10161796:20000000:JEAN MATEUS VASCONCELOS DE OLIVEIRA:/home/c161796:/bin/bash
2026-06-08T14:00:23.6681782Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161778:x:10161778:20000000:EDUARDO DA SILVA XAVIER:/home/c161778:
2026-06-08T14:00:23.6682133Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161878:x:10161878:20000000:GUILHERME SEGOLIN SELMI:/home/c161878:
2026-06-08T14:00:23.6682503Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f757638:x:10757638:20000000:THIAGO MESQUITA MACHADO:/home/f757638:/bin/bash
2026-06-08T14:00:23.6683157Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f760219:x:10760219:20000000:CLEICY PRISCILLA ARAGAO DOS SANTOS:/home/f760219:/bin/bash
2026-06-08T14:00:23.6683931Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f933728:x:10933728:20000000:CESAR ROMERO ALVES CARVALHO:/home/f933728:/bin/bash
2026-06-08T14:00:23.6684510Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f756677:x:10756677:20000000:MARIO LIMA NASCIMENTO:/home/f756677:/bin/bash
2026-06-08T14:00:23.6684873Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f755619:x:10755619:20000000:JOSE RENATO FELIX DA SILVA:/home/f755619:/bin/bash
2026-06-08T14:00:23.6685222Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f585960:x:10585960:20000000:VINICIUS MATTOS FERREIRA:/home/f585960:
2026-06-08T14:00:23.6686060Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f958494:x:10958494:20000000:JESSICA BRAZ CARVALHO:/home/f958494:/bin/bash
2026-06-08T14:00:23.6686513Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p794925:x:10794925:20000000:RUI MAGS FERREIRA DE ALMEIDA:/home/p794925:/bin/bash
2026-06-08T14:00:23.6686870Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f746032:x:10746032:20000000:CARLOS FELIX PENHA:/home/f746032:/bin/bash
2026-06-08T14:00:23.6687354Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f792536:x:10792536:20000000:BRYAN DE HOLANDA FERNANDES:/home/f792536:/bin/bash
2026-06-08T14:00:23.6687716Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c085446:x:10085446:20000000:SUZIE LANE FELIX DE SOUZA LYRA:/home/c085446:/bin/bash
2026-06-08T14:00:23.6688350Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f754848:x:10754848:20000000:JOAO HUGO ROCHA DE SOUSA:/home/f754848:
2026-06-08T14:00:23.6689197Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f755537:x:10755537:20000000:RENAN RAMOS BARBOSA:/home/f755537:/bin/bash
2026-06-08T14:00:23.6691481Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f574999:x:10574999:20000000:ANA BEATRIZ MENDONCA MEATO FERNANDES:/home/f574999:/bin/bash
2026-06-08T14:00:23.6691866Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161797:x:10161797:20000000:MIGUEL PEREIRA CANDIDO:/home/c161797:/bin/bash
2026-06-08T14:00:23.6693504Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f760497:x:10760497:20000000:LUCAS ISSAMU IGAWA:/home/f760497:/bin/bash
2026-06-08T14:00:23.6694119Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161791:x:10161791:20000000:HARRYSON CAMPOS MARTINS:/home/c161791:/bin/bash
2026-06-08T14:00:23.6694493Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f979337:x:10979337:20000000:FABIO LUIZ PAIVA DE FIGUEIREDO:/home/f979337:/bin/bash
2026-06-08T14:00:23.6696713Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f756611:x:10756611:20000000:WESLEY JEFFERSON SANTOS DE MELO:/home/f756611:/bin/bash
2026-06-08T14:00:23.6697080Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f901281:x:10901281:20000000:GILSON RIBEIRO DE LIMA:/home/f901281:
2026-06-08T14:00:23.6697439Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f932468:x:10932468:20000000:MAURICIO ASSIS DE HOLANDA:/home/f932468:
2026-06-08T14:00:23.6697815Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f570413:x:10570413:20000000:MICHELINE CRISTIANE ALVES DAS NEVES:/home/f570413:/bin/bash
2026-06-08T14:00:23.6698183Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f593115:x:10593115:20000000:LUCAS FARIA RIBEIRO:/home/f593115:/bin/bash
2026-06-08T14:00:23.6698549Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f734404:x:10734404:20000000:RICARDO CELSO MICHELETTO JUNIOR:/home/f734404:/bin/bash
2026-06-08T14:00:23.6702678Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p749633:x:10749633:20000000:RAFAEL OLIVEIRA FAITAO:/home/p749633:/bin/bash
2026-06-08T14:00:23.6703309Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p755139:x:10755139:20000000:CARLOS EDUARDO FERREIRA E SILVA:/home/p755139:/bin/bash
2026-06-08T14:00:23.6703686Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p755098:x:10755098:20000000:GIANPAOLO CUNHA DO NASCIMENTO:/home/p755098:/bin/bash
2026-06-08T14:00:23.6704055Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p544858:x:10544858:20000000:THIAGO AUGUSTO JARDIM:/home/p544858:
2026-06-08T14:00:23.6704412Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f512461:x:10512461:20000000:WESLLEY DA SILVA QUITERIO:/home/f512461:/bin/bash
2026-06-08T14:00:23.6704770Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f667008:x:10667008:20000000:KAROLINE OLIVEIRA MACIEL:/home/f667008:/bin/bash
2026-06-08T14:00:23.6706479Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f708978:x:10708978:20000000:CESAR QUINTANILHA DE ALMEIDA:/home/f708978:/bin/bash
2026-06-08T14:00:23.6706845Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161817:x:10161817:20000000:MARCUS VINICIUS DE SOUZA ALMEIDA:/home/c161817:
2026-06-08T14:00:23.6707191Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f547596:x:10547596:20000000:HELIOMAR WESLEY COSTA:/home/f547596:/bin/bash
2026-06-08T14:00:23.6707557Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f763694:x:10763694:20000000:VIKTOR RIBEIRO DOS SANTOS CUNHA:/home/f763694:/bin/bash
2026-06-08T14:00:23.6707915Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f791252:x:10791252:20000000:RAFAEL MENDES DE SOUZA:/home/f791252:/bin/bash
2026-06-08T14:00:23.6709619Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f725516:x:10725516:20000000:JOAO LUCAS SOUZA DA FONSECA:/home/f725516:/bin/bash
2026-06-08T14:00:23.6709986Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f509465:x:10509465:20000000:JOAO EDUARDO ANDRADE ANDRADE:/home/f509465:
2026-06-08T14:00:23.6710338Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f555216:x:10555216:20000000:FABIO HENRIQUE RONQUI:/home/f555216:/bin/bash
2026-06-08T14:00:23.6710770Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f606902:x:10606902:20000000:GUSTAVO SANTANA DA SILVA:/home/f606902:/bin/bash
2026-06-08T14:00:23.6711114Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c120068:x:10120068:20000000:RENAN ARAUJO SILVA:/home/c120068:/bin/bash
2026-06-08T14:00:23.6711471Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f596136:x:10596136:20000000:VICTORIA NAOMI DOS SANTOS AOKI:/home/f596136:/bin/bash
2026-06-08T14:00:23.6711816Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f771377:x:10771377:20000000:RAY DE CASTRO:/home/f771377:/bin/bash
2026-06-08T14:00:23.6712160Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p758786:x:10758786:20000000:FELIPE LIMA VIRGINI:/home/p758786:/bin/bash
2026-06-08T14:00:23.6712524Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f758363:x:10758363:20000000:JEFFERSON JUNIOR ALVES DA SILVA:/home/f758363:/bin/bash
2026-06-08T14:00:23.6712979Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f690810:x:10690810:20000000:HEBERT INACIO DA CUNHA:/home/f690810:/bin/bash
2026-06-08T14:00:23.6713331Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f768588:x:10768588:20000000:NICOLY AMANDA FELIPE:/home/f768588:/bin/bash
2026-06-08T14:00:23.6713695Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a159802:x:10159802:30000001:CARLOS EDUARDO DE SOUSA ARNAUD:/home/a159802:/bin/bash
2026-06-08T14:00:23.6714131Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f695163:x:10695163:20000000:JOSE AUGUSTO DE OLIVEIRA RAMOS:/home/f695163:/bin/bash
2026-06-08T14:00:23.6714661Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f649646:x:10649646:20000000:REGIS EDUARDO MAGALHAES:/home/f649646:/bin/bash
2026-06-08T14:00:23.6715217Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c135636:x:10135636:20000000:LILIAN PAULA PRADO GOMES LEITAO:/home/c135636:/bin/bash
2026-06-08T14:00:23.6717826Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c053192:x:10053192:20000000:ANA CLAUDIA DANTAS DE AQUINO:/home/c053192:/bin/bash
2026-06-08T14:00:23.6718217Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f567008:x:10567008:20000000:LUIS GUSTAVO CARVALHO DE SOUSA:/home/f567008:/bin/bash
2026-06-08T14:00:23.6719954Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c141293:x:10141293:20000000:MARIANA MACHADO DE LIMA:/home/c141293:/bin/bash
2026-06-08T14:00:23.6720400Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f671765:x:10671765:20000000:MAGDA MARIA FALCAO CORDEIRO:/home/f671765:/bin/bash
2026-06-08T14:00:23.6721096Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f673964:x:10673964:20000000:JONCILANE BRANDAO DE OLIVEIRA:/home/f673964:/bin/bash
2026-06-08T14:00:23.6721464Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p733147:x:10733147:20000000:EZEQUIEL DE SOUSA FARIAS:/home/p733147:/bin/bash
2026-06-08T14:00:23.6724978Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f522406:x:10522406:20000000:FELIPE MAIA CHAVES:/home/f522406:/bin/bash
2026-06-08T14:00:23.6725353Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f571301:x:10571301:20000000:JOAO VICTOR TEIXEIRA ARANTES:/home/f571301:/bin/bash
2026-06-08T14:00:23.6725743Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f638146:x:10638146:20000000:EDUARDO TOBIAS MARSOLLA PEREIRA:/home/f638146:/bin/bash
2026-06-08T14:00:23.6726103Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f600250:x:10600250:20000000:FLAVIA DE AVILA PEREIRA:/home/f600250:/bin/bash
2026-06-08T14:00:23.6727594Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c108973:x:10108973:20000000:CARLOS ANTONIO MOLINA AZEVEDO:/home/c108973:/bin/bash
2026-06-08T14:00:23.6728035Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): spnowp01:x:20006032:20009988:Conta.servico.ServiceNow.PRD.TAS000048411835_CRQ000001375833_REQ000143859390:/home/spnowp01:/bin/bash
2026-06-08T14:00:23.6728428Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f558611:x:10558611:20000000:ELIAS DE MOURA:/home/f558611:/bin/bash
2026-06-08T14:00:23.6729464Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161849:x:10161849:20000000:FRANCISCO ALVES DE OLIVEIRA NETO:/home/c161849:/bin/bash
2026-06-08T14:00:23.6730061Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f619926:x:10619926:20000000:ANA PAULA MEDEIROS:/home/f619926:/bin/bash
2026-06-08T14:00:23.6730570Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f583726:x:10583726:20000000:ILANA SZAJNFARBER:/home/f583726:/bin/bash
2026-06-08T14:00:23.6731105Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f771869:x:10771869:20000000:MARCOS VINICIUS DE OLIVEIRA NUNES:/home/f771869:/bin/bash
2026-06-08T14:00:23.6731554Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f730205:x:10730205:20000000:IGOR COLEN SANTOS:/home/f730205:/bin/bash
2026-06-08T14:00:23.6732079Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f765789:x:10765789:20000000:ALINE DOS SANTOS LIMA:/home/f765789:/bin/bash
2026-06-08T14:00:23.6736014Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f553187:x:10553187:20000000:OSCAR JOSE DA SILVA JUNIOR:/home/f553187:/bin/bash
2026-06-08T14:00:23.6736390Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f545019:x:10545019:20000000:ANA PAULA LOPES DE SOUZA:/home/f545019:/bin/bash
2026-06-08T14:00:23.6736750Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f695353:x:10695353:20000000:CHRYSTIAN DO ESPIRITO SANTO NASCIMENTO:/home/f695353:/bin/bash
2026-06-08T14:00:23.6737139Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f762481:x:10762481:20000000:FERNANDO COSME DE MATTOS RAFAEL:/home/f762481:/bin/bash
2026-06-08T14:00:23.6737660Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f765777:x:10765777:20000000:AILTON ARANTES DE SOUSA JUNIOR:/home/f765777:/bin/bash
2026-06-08T14:00:23.6738175Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f515819:x:10515819:20000000:THAMIRES GUALANDI GOMES CORREIA:/home/f515819:/bin/bash
2026-06-08T14:00:23.6738545Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f587073:x:10587073:20000000:DENIS DANTES CAVALCANTI GUERRA:/home/f587073:/bin/bash
2026-06-08T14:00:23.6738895Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f551795:x:10551795:20000000:ADRIANE CHAVES DA SILVA:/home/f551795:
2026-06-08T14:00:23.6739246Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f969772:x:10969772:20000000:VIVIANNE GOMES DE OLIVEIRA:/home/f969772:/bin/bash
2026-06-08T14:00:23.6739657Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f609496:x:10609496:20000000:VANILDE LIMA DA SILVA:/home/f609496:/bin/bash
2026-06-08T14:00:23.6740022Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f688816:x:10688816:20000000:EDICLEY HENRIQUE BEZERRA:/home/f688816:/bin/bash
2026-06-08T14:00:23.6740380Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f698760:x:10698760:20000000:JULIANO JULIO DA COSTA:/home/f698760:/bin/bash
2026-06-08T14:00:23.6740857Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f538184:x:10538184:20000000:MAURO JORGE CORREA DOS SANTOS:/home/f538184:/bin/bash
2026-06-08T14:00:23.6742191Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f741278:x:10741278:20000000:MANOEL LUIZ PEREIRA DUARTE LEAL:/home/f741278:/bin/bash
2026-06-08T14:00:23.6742893Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f760580:x:10760580:20000000:LINCOLN ALBERTO FERREIRA DE SOUZA:/home/f760580:/bin/bash
2026-06-08T14:00:23.6743531Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f564762:x:10564762:20000000:CAMILA GARCIA DE OLIVEIRA:/home/f564762:/bin/bash
2026-06-08T14:00:23.6744030Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f727998:x:10727998:20000000:ANDREI SANTETTI PERUZZO:/home/f727998:/bin/bash
2026-06-08T14:00:23.6744457Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f771545:x:10771545:20000000:MARCELO MIRANDA DA CUNHA:/home/f771545:/bin/bash
2026-06-08T14:00:23.6745022Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f746011:x:10746011:20000000:ROGERIO FERNANDES LIMA:/home/f746011:/bin/bash
2026-06-08T14:00:23.6745465Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f697773:x:10697773:20000000:ALAN DE MATTOS:/home/f697773:/bin/bash
2026-06-08T14:00:23.6745941Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f537100:x:10537100:20000000:FABIO REIS GONCALVES DA SILVA:/home/f537100:/bin/bash
2026-06-08T14:00:23.6746979Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f667599:x:10667599:20000000:GUSTAVO BRASIL PIRES OCTAVIANO:/home/f667599:/bin/bash
2026-06-08T14:00:23.6747531Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f667755:x:10667755:20000000:LUCAS ROCHA DOS SANTOS NUSS:/home/f667755:/bin/bash
2026-06-08T14:00:23.6748029Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f989918:x:10989918:20000000:WAGNER CLARK KAIZAWA:/home/f989918:/bin/bash
2026-06-08T14:00:23.6749438Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f928328:x:10928328:20000000:PAULO VINICIUS DE BRITTO DA SILVA:/home/f928328:/bin/bash
2026-06-08T14:00:23.6749818Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c051045:x:10051045:20000000:ANDRE LUIZ DOS SANTOS JULIANI:/home/c051045:/bin/bash
2026-06-08T14:00:23.6750186Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161743:x:10161743:20000000:ARIANE CLEDJA FERREIRA DOS SANTOS:/home/c161743:/bin/bash
2026-06-08T14:00:23.6750558Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161753:x:10161753:20000000:LEVY WASHINGTON ROCHA MOREIRA:/home/c161753:/bin/bash
2026-06-08T14:00:23.6751027Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161864:x:10161864:20000000:RICARDO ANANIAS NOGUEIRA DE JESUS:/home/c161864:/bin/bash
2026-06-08T14:00:23.6751385Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161854:x:10161854:20000000:ULYSSES DE SOUSA PEREIRA:/home/c161854:/bin/bash
2026-06-08T14:00:23.6751876Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f635157:x:10635157:20000000:RAFAEL LUSITANO CUNHA QUEIROZ:/home/f635157:/bin/bash
2026-06-08T14:00:23.6753249Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f691210:x:10691210:20000000:FERNANDO HENRIQUE ROCHA BRITO:/home/f691210:/bin/bash
2026-06-08T14:00:23.6753926Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p531006:x:10531006:20000000:SAMUEL VITOR COELHO MIRANDA:/home/p531006:/bin/bash
2026-06-08T14:00:23.6754950Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f679971:x:10679971:20000000:TELMA LUCIA DANIEL:/home/f679971:/bin/bash
2026-06-08T14:00:23.6755510Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f572161:x:10572161:20000000:HELTON KUENEDE DIAS DE MOURA:/home/f572161:/bin/bash
2026-06-08T14:00:23.6756256Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p735699:x:10735699:20000000:GABRIEL LUIZ VALENCA DE ARAUJO:/home/p735699:/bin/bash
2026-06-08T14:00:23.6756817Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159668:x:10159668:20000000:EFRAIM SANTANA LEITE FILHO:/home/c159668:/bin/bash
2026-06-08T14:00:23.6757386Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f501100:x:10501100:20000000:MONIQUE FERNANDES RIBEIRO COUTINHO DA SI:/home/f501100:/bin/bash
2026-06-08T14:00:23.6757913Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f662602:x:10662602:20000000:DANIEL BARBOSA DE FREITAS RIBEIRO:/home/f662602:/bin/bash
2026-06-08T14:00:23.6758622Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a161812:x:10161812:30000001:ISRAEL ALMEIDA PEDREIRA:/home/a161812:/bin/bash
2026-06-08T14:00:23.6758989Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f765004:x:10765004:20000000:GUILHERME PROTTA LANNA:/home/f765004:/bin/bash
2026-06-08T14:00:23.6759618Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f666046:x:10666046:20000000:LEONARDO RODRIGUES DE RIBAMAR DA SILVA:/home/f666046:/bin/bash
2026-06-08T14:00:23.6760804Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c108273:x:10108273:20000000:ARTHUR MARTINS ALVES:/home/c108273:/bin/bash
2026-06-08T14:00:23.6761453Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c126326:x:10126326:20000000:ANDRESA REIS FERNANDES:/home/c126326:/bin/bash
2026-06-08T14:00:23.6762253Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c123751:x:10123751:20000000:ESTELA APARECIDA PINTO BETTARELLO:/home/c123751:/bin/bash
2026-06-08T14:00:23.6762724Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c144908:x:10144908:20000000:EMERSON FARIA FIDANZA:/home/c144908:/bin/bash
2026-06-08T14:00:23.6763549Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f728910:x:10728910:20000000:ANILTO JOSE CARVALHO ERNESTO:/home/f728910:/bin/bash
2026-06-08T14:00:23.6763970Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f562941:x:10562941:20000000:BRUNO MARQUES MEDEIROS:/home/f562941:/bin/bash
2026-06-08T14:00:23.6764475Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a151559:x:10151559:30000001:JORGE LUIS DE CARVALHO SILVA:/home/a151559:/bin/bash
2026-06-08T14:00:23.6765806Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f628047:x:10628047:20000000:BRUNA LACERDA FELIX:/home/f628047:/bin/bash
2026-06-08T14:00:23.6766151Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f981823:x:10981823:20000000:RODRIGO DA SILVA QUINHONES:/home/f981823:
2026-06-08T14:00:23.6767088Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f743604:x:10743604:20000000:VANIA SILVEIRA COSTA:/home/f743604:/bin/bash
2026-06-08T14:00:23.6768373Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f640339:x:10640339:20000000:LUIZ FERNANDO OLIVEIRA AMARAL:/home/f640339:/bin/bash
2026-06-08T14:00:23.6771010Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p695908:x:10695908:20000000:RONALDO RIBEIRO DA SILVA:/home/p695908:/bin/bash
2026-06-08T14:00:23.6771738Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f569694:x:10569694:20000000:LUCAS EDUARDO BENINCA:/home/f569694:/bin/bash
2026-06-08T14:00:23.6772806Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f797098:x:10797098:20000000:ALINE CRISTINE BARBOSA:/home/f797098:/bin/bash
2026-06-08T14:00:23.6773401Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c122114:x:10122114:20000000:LUCAS LANDIN DE LIMA:/home/c122114:/bin/bash
2026-06-08T14:00:23.6773973Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c143904:x:10143904:20000000:SAULO SENA CAIRES:/home/c143904:/bin/bash
2026-06-08T14:00:23.6774693Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f650788:x:10650788:20000000:DIOGO BARROS ALVES DA SILVA:/home/f650788:/bin/bash
2026-06-08T14:00:23.6775281Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f575792:x:10575792:20000000:JOSE EDSON DE OLIVEIRA:/home/f575792:/bin/bash
2026-06-08T14:00:23.6775884Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f577468:x:10577468:20000000:LAISE RIBEIRO LOPES DE MENDONCA:/home/f577468:/bin/bash
2026-06-08T14:00:23.6776471Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f577750:x:10577750:20000000:MELISSA REZENDE BORGES:/home/f577750:/bin/bash
2026-06-08T14:00:23.6777183Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f685312:x:10685312:20000000:WDARLES LEIVAS FERNANDES SOARES:/home/f685312:/bin/bash
2026-06-08T14:00:23.6777871Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f780726:x:10780726:20000000:RAPHAEL CARDOSO PRADO:/home/f780726:/bin/bash
2026-06-08T14:00:23.6778434Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p730656:x:10730656:20000000:WAGNER FERREIRA DE SOUZA:/home/p730656:
2026-06-08T14:00:23.6778977Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f644612:x:10644612:20000000:BRUNO PAIVA CALDAS:/home/f644612:/bin/bash
2026-06-08T14:00:23.6779550Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f590164:x:10590164:20000000:CLODOMIR SOARES SOUZA JUNIOR:/home/f590164:/bin/bash
2026-06-08T14:00:23.6780128Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f597425:x:10597425:20000000:KAIO HENRIQUE DE SOUSA:/home/f597425:/bin/bash
2026-06-08T14:00:23.6780694Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f559653:x:10559653:20000000:ARIADNER SILVA BORGES:/home/f559653:/bin/bash
2026-06-08T14:00:23.6781276Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f520018:x:10520018:20000000:FELLIPE CAVALCANTE AMORIM:/home/f520018:/bin/bash
2026-06-08T14:00:23.6781875Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a159073:x:10159073:30000001:PEDRO HENRIQUE PAIVA DE SOUZA:/home/a159073:/bin/bash
2026-06-08T14:00:23.6782692Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f586254:x:10586254:20000000:JUNIOR OLIVEIRA DA SILVA:/home/f586254:/bin/bash
2026-06-08T14:00:23.6783089Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161758:x:10161758:20000000:KEMILLY BARBOSA ATAIDES:/home/c161758:
2026-06-08T14:00:23.6783453Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f606821:x:10606821:20000000:GILSON SILVA DOS SANTOS:/home/f606821:/bin/bash
2026-06-08T14:00:23.6783823Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f626904:x:10626904:20000000:ANDERSON CONTERNO DAL MAGRO:/home/f626904:/bin/bash
2026-06-08T14:00:23.6784189Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f679783:x:10679783:20000000:RAFAEL ALMEIDA PARA ASSU:/home/f679783:/bin/bash
2026-06-08T14:00:23.6784708Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f747147:x:10747147:20000000:EMIR TEOFILO CALIFE NETO:/home/f747147:/bin/bash
2026-06-08T14:00:23.6785402Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): sfggrt02:x:20009980:20009980:sfggrt02:/home/sfggrt02:/bin/bash
2026-06-08T14:00:23.6785747Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f607752:x:10607752:20000000:MARCIO WILSON GALANTE:/home/f607752:/bin/bash
2026-06-08T14:00:23.6786797Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f672107:x:10672107:20000000:ABIMAEL TEDESCO DE SOUZA:/home/f672107:/bin/bash
2026-06-08T14:00:23.6787153Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a565574:x:10565574:30000001:JONATAS SANTOS PESSOA:/home/a565574:/bin/bash
2026-06-08T14:00:23.6788207Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f712914:x:10712914:20000000:GUSTAVO SERMUCCHNIS GALLI:/home/f712914:/bin/bash
2026-06-08T14:00:23.6790312Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161782:x:10161782:20000000:JESSE LUCAS ALVES DIAS:/home/c161782:/bin/bash
2026-06-08T14:00:23.6790665Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161787:x:10161787:20000000:ISAQUE DOS SANTOS VELOZO:/home/c161787:/bin/bash
2026-06-08T14:00:23.6791018Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161847:x:10161847:20000000:ADRIEL DA COSTA MADUREIRA:/home/c161847:/bin/bash
2026-06-08T14:00:23.6794490Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f531729:x:10531729:20000000:KAROLINE BOTELHO FERNANDES COELHO:/home/f531729:
2026-06-08T14:00:23.6794860Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f657518:x:10657518:20000000:BERNARDO CONSTANCIA DOS SANTOS:/home/f657518:/bin/bash
2026-06-08T14:00:23.6795219Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161478:x:10161478:20000000:LUIS FERNANDO FREITAS LAMELLAS:/home/c161478:/bin/bash
2026-06-08T14:00:23.6795587Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f514301:x:10514301:20000000:MARIA CLARA REGIS ALMEIDA SILVA SANTOS:/home/f514301:/bin/bash
2026-06-08T14:00:23.6795948Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f709306:x:10709306:20000000:GABRIEL FERNANDES SILVA GONDIM:/home/f709306:/bin/bash
2026-06-08T14:00:23.6796293Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f712317:x:10712317:20000000:KENEDY GOMES CAMARGO:/home/f712317:/bin/bash
2026-06-08T14:00:23.6796633Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f728797:x:10728797:20000000:HARISON NUNES SANTOS:/home/f728797:/bin/bash
2026-06-08T14:00:23.6802618Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c161845:x:10161845:20000000:lunna cipher oliveira:/home/c161845:/bin/bash
2026-06-08T14:00:23.6803001Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a161144:x:10161144:30000001:RAFAEL TEIXEIRA BARBOSA:/home/a161144:/bin/bash
2026-06-08T14:00:23.6803370Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p729907:x:10729907:20000000:CESAR AUGUSTO SARAIVA DOS SANTOS:/home/p729907:/bin/bash
2026-06-08T14:00:23.6803735Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): a161165:x:10161165:30000001:ANDRE GUSTAVO RABELO DO NASCIMENTO:/home/a161165:/bin/bash
2026-06-08T14:00:23.6804101Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p745150:x:10745150:20000000:LUDMYLLA CRISTYNA NASCIMENTO DA SILVA:/home/p745150:/bin/bash
2026-06-08T14:00:23.6804466Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f912563:x:10912563:20000000:RENATO FERNANDES DA NOBREGA:/home/f912563:/bin/bash
2026-06-08T14:00:23.6804913Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c125762:x:10125762:20000000:DANIELA FIDELES JULIAO RAZZINO:/home/c125762:/bin/bash
2026-06-08T14:00:23.6805258Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p756853:x:10756853:20000000:LEONARDO LEAL BICUDO:/home/p756853:/bin/bash
2026-06-08T14:00:23.6805602Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f717902:x:10717902:20000000:CLEBER RUFINO:/home/f717902:/bin/bash
2026-06-08T14:00:23.6805946Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f535221:x:10535221:20000000:MARCIO XIMENES COELHO:/home/f535221:/bin/bash
2026-06-08T14:00:23.6806287Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f740060:x:10740060:20000000:PRYSCILLA SOARES MARTINS:/home/f740060:/bin/bash
2026-06-08T14:00:23.6806643Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c127345:x:10127345:20000000:RODRIGO HENRIQUE DOS SANTOS BRANCO:/home/c127345:/bin/bash
2026-06-08T14:00:23.6807001Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c136200:x:10136200:20000000:CLAUDINEI ROCHA LOPES FILHO:/home/c136200:/bin/bash
2026-06-08T14:00:23.6807350Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c151159:x:10151159:20000000:JOAO OTAVIO SEGANTINI:/home/c151159:/bin/bash
2026-06-08T14:00:23.6807716Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c075053:x:10075053:20000000:ILANNA KARLA NASCIMENTO CARVALHO:/home/c075053:/bin/bash
2026-06-08T14:00:23.6808122Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c154933:x:10154933:20000000:LEONARDO CRUZ DE OLIVEIRA:/home/c154933:/bin/bash
2026-06-08T14:00:23.6808479Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c158788:x:10158788:20000000:CARLOS EDUARDO CARDOSO CORREA PORTO:/home/c158788:/bin/bash
2026-06-08T14:00:23.6808906Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c129435:x:10129435:20000000:VIVIENE ARRUDA JOSE:/home/c129435:/bin/bash
2026-06-08T14:00:23.6809250Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c159504:x:10159504:20000000:RICK OLIVEIRA ALVES:/home/c159504:/bin/bash
2026-06-08T14:00:23.6809602Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): c126172:x:10126172:20000000:GABRIEL NAZARENO BARRETO CUNHA DA CRUZ:/home/c126172:/bin/bash
2026-06-08T14:00:23.6809966Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p643368:x:10643368:20000000:NEWTON COIMBRA NETO:/home/p643368:/bin/bash
2026-06-08T14:00:23.6810319Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f911036:x:10911036:20000000:DICSON PEREIRA TENORIO DE ARAUJO:/home/f911036:/bin/bash
2026-06-08T14:00:23.6810677Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p686198:x:10686198:20000000:RAINIER BARBOSA DOS SANTOS VIANA:/home/p686198:/bin/bash
2026-06-08T14:00:23.6811035Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f729287:x:10729287:20000000:LUIZ CARLOS ALVES DE OLIVEIRA JUNIOR:/home/f729287:/bin/bash
2026-06-08T14:00:23.6811531Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f579595:x:10579595:20000000:RODRIGO LUIZ DOS SANTOS GONCALVES:/home/f579595:/bin/bash
2026-06-08T14:00:23.6811967Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f714477:x:10714477:20000000:ANSELMO NUNES DE OLIVEIRA:/home/f714477:/bin/bash
2026-06-08T14:00:23.6812319Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f933687:x:10933687:20000000:CARLA VILLAR CHIANCA:/home/f933687:/bin/bash
2026-06-08T14:00:23.6812996Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f714415:x:10714415:20000000:LUANA DE SOUSA ALVES:/home/f714415:/bin/bash
2026-06-08T14:00:23.6813372Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f579016:x:10579016:20000000:PAULO NOLBERTO DOS SANTOS ALARCON:/home/f579016:/bin/bash
2026-06-08T14:00:23.6813980Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f713806:x:10713806:20000000:TIAGO RIBEIRO SANTOS:/home/f713806:/bin/bash
2026-06-08T14:00:23.6814468Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f741032:x:10741032:20000000:RENZO DEULEFEU TAVARES:/home/f741032:/bin/bash
2026-06-08T14:00:23.6814943Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f584339:x:10584339:20000000:GABRIEL MOLINA DE LEON:/home/f584339:/bin/bash
2026-06-08T14:00:23.6815463Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p718767:x:10718767:20000000:NIVALDO PEREIRA DOS SANTOS:/home/p718767:/bin/bash
2026-06-08T14:00:23.6815825Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f967685:x:10967685:20000000:GUSTAVO NAKASIMA:/home/f967685:/bin/bash
2026-06-08T14:00:23.6816308Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f594184:x:10594184:20000000:EMERSON MONTEIRO DE SOUZA:/home/f594184:/bin/bash
2026-06-08T14:00:23.6816706Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f776439:x:10776439:20000000:FLAUBERTI CERQUEIRA SILVA:/home/f776439:/bin/bash
2026-06-08T14:00:23.6817505Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): f568911:x:10568911:20000000:LEONARDO DOS SANTOS BONFIM:/home/f568911:/bin/bash
2026-06-08T14:00:23.6818293Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"] (remote-exec): p735207:x:10735207:20000000:FREDERICO FREIRE DE MELLO:/home/p735207:/bin/bash
2026-06-08T14:00:23.6926083Z vsphere_virtual_machine.vm["caddeapllx2540.agil.nprd.caixa.gov.br"]: Creation complete after 2m14s [id=42020f03-e7b0-8b69-a1b4-5790fe27d62e]
2026-06-08T14:00:24.0145616Z 
2026-06-08T14:00:24.0146367Z Apply complete! Resources: 1 added, 0 changed, 0 destroyed.
2026-06-08T14:00:24.0288395Z ##[error]Bash wrote one or more lines to the standard error stream.
2026-06-08T14:00:24.0290254Z ##[error][DEPRECATION WARNING]: [defaults]callback_whitelist option, normalizing names 
to new standard, use callbacks_enabled instead. This feature will be removed 
from ansible-core in version 2.15. Deprecation warnings can be disabled by 
setting deprecation_warnings=False in ansible.cfg.

2026-06-08T14:00:24.0291320Z ##[error][WARNING]: Unhandled error in Python interpreter discovery for host localhost:
Failed to connect to the host via ssh: ssh: connect to host localhost port 22:
Connection refused

2026-06-08T14:00:24.0311401Z ##[section]Finishing: Terraform apply
