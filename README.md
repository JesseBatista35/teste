2026-11-06T16:12:16.4427803Z ##[section]Starting: Terraform apply
2026-11-06T16:12:16.4431148Z ==============================================================================
2026-11-06T16:12:16.4431236Z Task         : Bash
2026-11-06T16:12:16.4431288Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-06T16:12:16.4431347Z Version      : 3.227.0
2026-11-06T16:12:16.4431387Z Author       : Microsoft Corporation
2026-11-06T16:12:16.4431441Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-06T16:12:16.4431509Z ==============================================================================
2026-11-06T16:12:17.3750050Z Generating script.
2026-11-06T16:12:17.3761208Z ========================== Starting Command Output ===========================
2026-11-06T16:12:17.3769020Z [command]/bin/bash /opt/ads-agent/_work/_temp/c2a72998-6952-4d6d-a563-bc6fb1d610a6.sh
2026-11-06T16:12:18.8398079Z data.vsphere_tag_category.addr: Reading...
2026-11-06T16:12:18.8400579Z data.vsphere_folder.folder: Reading...
2026-11-06T16:12:18.8401120Z data.vsphere_datacenter.dc: Reading...
2026-11-06T16:12:18.8483061Z data.vsphere_folder.folder: Read complete after 0s [id=group-v22]
2026-11-06T16:12:19.2222751Z data.vsphere_tag_category.addr: Read complete after 0s [id=urn:vmomi:InventoryServiceCategory:40fbf91f-3227-40d6-9785-a481d122536e:GLOBAL]
2026-11-06T16:12:19.2236936Z data.external.consulta_tag: Reading...
2026-11-06T16:12:19.2475773Z data.vsphere_datacenter.dc: Read complete after 0s [id=datacenter-21]
2026-11-06T16:12:19.4717654Z data.vsphere_datastore.datastore: Reading...
2026-11-06T16:12:19.4750901Z data.vsphere_resource_pool.pool: Reading...
2026-11-06T16:12:19.4774345Z data.vsphere_network.network_bck: Reading...
2026-11-06T16:12:19.4774495Z data.vsphere_compute_cluster.cluster: Reading...
2026-11-06T16:12:19.4777704Z data.vsphere_network.network_bck_1: Reading...
2026-11-06T16:12:19.4803272Z data.vsphere_network.network: Reading...
2026-11-06T16:12:19.4807788Z data.vsphere_virtual_machine.template: Reading...
2026-11-06T16:12:19.5127083Z data.vsphere_network.network_bck_1: Read complete after 1s [id=dvportgroup-1065714]
2026-11-06T16:12:19.5207205Z data.vsphere_resource_pool.pool: Read complete after 1s [id=resgroup-1062077]
2026-11-06T16:12:19.5344093Z data.vsphere_network.network: Read complete after 1s [id=dvportgroup-68733]
2026-11-06T16:12:19.5344390Z data.vsphere_network.network_bck: Read complete after 1s [id=dvportgroup-72342]
2026-11-06T16:12:19.5370155Z data.vsphere_compute_cluster.cluster: Read complete after 1s [id=domain-c710514]
2026-11-06T16:12:19.5658130Z data.vsphere_datastore.datastore: Read complete after 1s [id=datastore-770300]
2026-11-06T16:12:29.2243411Z data.external.consulta_tag: Still reading... [10s elapsed]
2026-11-06T16:12:29.4822073Z data.vsphere_virtual_machine.template: Still reading... [10s elapsed]
2026-11-06T16:12:39.2244508Z data.external.consulta_tag: Still reading... [20s elapsed]
2026-11-06T16:12:39.4828857Z data.vsphere_virtual_machine.template: Still reading... [20s elapsed]
2026-11-06T16:12:49.2254635Z data.external.consulta_tag: Still reading... [30s elapsed]
2026-11-06T16:12:49.4839775Z data.vsphere_virtual_machine.template: Still reading... [30s elapsed]
2026-11-06T16:12:54.5163507Z data.external.consulta_tag: Read complete after 36s [id=-]
2026-11-06T16:12:54.5211156Z 
2026-11-06T16:12:54.5211661Z Error: error fetching virtual machine: vm 'eap74-openjdk17-apache24-rhel93-v013' not found
2026-11-06T16:12:54.5214023Z 
2026-11-06T16:12:54.5214623Z   with data.vsphere_virtual_machine.template,
2026-11-06T16:12:54.5214812Z   on main.tf line 39, in data "vsphere_virtual_machine" "template":
2026-11-06T16:12:54.5214960Z   39: data "vsphere_virtual_machine" "template" {
2026-11-06T16:12:54.5215015Z 
2026-11-06T16:12:54.6601668Z grep: tfplan.json: Arquivo ou diretório não encontrado
2026-11-06T16:12:56.2084700Z data.vsphere_tag_category.addr: Reading...
2026-11-06T16:12:56.2085030Z data.vsphere_datacenter.dc: Reading...
2026-11-06T16:12:56.2085155Z data.vsphere_folder.folder: Reading...
2026-11-06T16:12:56.2145261Z data.vsphere_folder.folder: Read complete after 0s [id=group-v22]
2026-11-06T16:12:56.5934594Z data.vsphere_tag_category.addr: Read complete after 1s [id=urn:vmomi:InventoryServiceCategory:40fbf91f-3227-40d6-9785-a481d122536e:GLOBAL]
2026-11-06T16:12:56.5950950Z data.external.consulta_tag: Reading...
2026-11-06T16:12:56.6368457Z data.vsphere_datacenter.dc: Read complete after 1s [id=datacenter-21]
2026-11-06T16:12:56.8702472Z data.vsphere_network.network_bck_1: Reading...
2026-11-06T16:12:56.8746473Z data.vsphere_datastore.datastore: Reading...
2026-11-06T16:12:56.8747718Z data.vsphere_compute_cluster.cluster: Reading...
2026-11-06T16:12:56.8756048Z data.vsphere_virtual_machine.template: Reading...
2026-11-06T16:12:56.8766553Z data.vsphere_network.network_bck: Reading...
2026-11-06T16:12:56.8790835Z data.vsphere_resource_pool.pool: Reading...
2026-11-06T16:12:56.8794964Z data.vsphere_network.network: Reading...
2026-11-06T16:12:56.9265497Z data.vsphere_network.network_bck_1: Read complete after 0s [id=dvportgroup-1065714]
2026-11-06T16:12:56.9340834Z data.vsphere_network.network_bck: Read complete after 0s [id=dvportgroup-72342]
2026-11-06T16:12:56.9383465Z data.vsphere_compute_cluster.cluster: Read complete after 0s [id=domain-c710514]
2026-11-06T16:12:56.9456546Z data.vsphere_network.network: Read complete after 0s [id=dvportgroup-68733]
2026-11-06T16:12:56.9463494Z data.vsphere_resource_pool.pool: Read complete after 0s [id=resgroup-1062077]
2026-11-06T16:12:56.9835921Z data.vsphere_datastore.datastore: Read complete after 0s [id=datastore-770300]
2026-11-06T16:13:01.7249517Z data.external.consulta_tag: Read complete after 5s [id=-]
2026-11-06T16:13:01.7289821Z 
2026-11-06T16:13:01.7290228Z Error: error fetching virtual machine: vm 'eap74-openjdk17-apache24-rhel93-v013' not found
2026-11-06T16:13:01.7290319Z 
2026-11-06T16:13:01.7292104Z   with data.vsphere_virtual_machine.template,
2026-11-06T16:13:01.7292324Z   on main.tf line 39, in data "vsphere_virtual_machine" "template":
2026-11-06T16:13:01.7292584Z   39: data "vsphere_virtual_machine" "template" {
2026-11-06T16:13:01.7292891Z 
2026-11-06T16:13:01.8938643Z ##[error]Bash exited with code '1'.
2026-11-06T16:13:01.8939615Z ##[error]Bash wrote one or more lines to the standard error stream.
2026-11-06T16:13:01.8943134Z ##[error]
Error: error fetching virtual machine: vm 'eap74-openjdk17-apache24-rhel93-v013' not found

  with data.vsphere_virtual_machine.template,
  on main.tf line 39, in data "vsphere_virtual_machine" "template":
  39: data "vsphere_virtual_machine" "template" {


2026-11-06T16:13:01.8943654Z ##[error]grep: tfplan.json
2026-11-06T16:13:01.8944017Z ##[error]: Arquivo ou diretório não encontrado

2026-11-06T16:13:01.8944566Z ##[error]
Error: error fetching virtual machine: vm 'eap74-openjdk17-apache24-rhel93-v013' not found

  with data.vsphere_virtual_machine.template,
  on main.tf line 39, in data "vsphere_virtual_machine" "template":
  39: data "vsphere_virtual_machine" "template" {


2026-11-06T16:13:01.8967157Z ##[section]Finishing: Terraform apply
