2026-09-03T16:29:12.4695860Z ##[section]Starting: Alterando Valores placeholders nos arquivos de config
2026-09-03T16:29:12.4698854Z ==============================================================================
2026-09-03T16:29:12.4698930Z Task         : Replace Tokens
2026-09-03T16:29:12.4698975Z Description  : Replace tokens in files
2026-09-03T16:29:12.4699038Z Version      : 3.3.1
2026-09-03T16:29:12.4699079Z Author       : Guillaume Rouchon
2026-09-03T16:29:12.4699131Z Help         : v3.3.1 - [More Information](https://github.com/qetza/vsts-replacetokens-task#readme)
2026-09-03T16:29:12.4699222Z ==============================================================================
2026-09-03T16:29:13.5333196Z ##[section]Finishing: Alterando Valores placeholders nos arquivos de config

2026-09-03T16:29:13.5351435Z ##[section]Starting: Arquivos de Configuração
2026-09-03T16:29:13.5354356Z ==============================================================================
2026-09-03T16:29:13.5354434Z Task         : Bash
2026-09-03T16:29:13.5354475Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-03T16:29:13.5354548Z Version      : 3.227.0
2026-09-03T16:29:13.5354590Z Author       : Microsoft Corporation
2026-09-03T16:29:13.5354638Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-03T16:29:13.5354714Z ==============================================================================
2026-09-03T16:29:14.2863051Z Generating script.
2026-09-03T16:29:14.2877104Z ========================== Starting Command Output ===========================
2026-09-03T16:29:14.2920166Z [command]/bin/bash /opt/ads-agent/_work/_temp/2d7bd34e-b142-4feb-ae8d-ecf81504d820.sh
2026-09-03T16:29:14.2964606Z /opt/ads-agent/_work/_temp/2d7bd34e-b142-4feb-ae8d-ecf81504d820.sh: line 2: quantidade_vm: comando não encontrado
2026-09-03T16:29:16.3997719Z 
2026-09-03T16:29:16.3998220Z PLAY [local] *******************************************************************
2026-09-03T16:29:16.4300197Z 
2026-09-03T16:29:16.4300635Z PLAY [Configurando o DNS] ******************************************************
2026-09-03T16:29:16.6040375Z 
2026-09-03T16:29:16.6040848Z PLAY [local] *******************************************************************
2026-09-03T16:29:16.6069052Z 
2026-09-03T16:29:16.6069825Z PLAY [Verificando serviços] ****************************************************
2026-09-03T16:29:16.6146015Z 
2026-09-03T16:29:16.6146503Z PLAY [Configuração LDAP] *******************************************************
2026-09-03T16:29:16.6175519Z [WARNING]: Found variable using reserved name: when
2026-09-03T16:29:16.6182948Z 
2026-09-03T16:29:16.6183107Z PLAY [jboss] *******************************************************************
2026-09-03T16:29:16.6261425Z 
2026-09-03T16:29:16.6261723Z PLAY [Stack Jboss] *************************************************************
2026-09-03T16:29:16.6495362Z Thursday 03 September 2026  13:29:16 -0300 (0:00:00.310)       0:00:00.310 **** 
2026-09-03T16:29:17.1160300Z 
2026-09-03T16:29:17.1161096Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-09-03T16:29:17.1161247Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-09-03T16:29:17.1161492Z caddeapllx2801.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-09-03T16:29:17.1161657Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-09-03T16:29:17.1161813Z releases. A future Ansible release will default to using the discovered 
2026-09-03T16:29:17.1161972Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-09-03T16:29:17.1162127Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-09-03T16:29:17.1162272Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-09-03T16:29:17.1162449Z setting deprecation_warnings=False in ansible.cfg.
2026-09-03T16:29:17.1162581Z ok: [caddeapllx2801.agil.nprd.caixa.gov.br]
2026-09-03T16:29:17.1176799Z 
2026-09-03T16:29:17.1177033Z PLAY [jboss] *******************************************************************
2026-09-03T16:29:17.1218532Z 
2026-09-03T16:29:17.1218767Z PLAY [jboss] *******************************************************************
2026-09-03T16:29:17.1255509Z 
2026-09-03T16:29:17.1255758Z PLAY [jboss] *******************************************************************
2026-09-03T16:29:17.1278917Z 
2026-09-03T16:29:17.1279058Z PLAY [Copiando deployments adicionais] *****************************************
2026-09-03T16:29:17.1305939Z 
2026-09-03T16:29:17.1306278Z PLAY [Copiando modules adicionais] *********************************************
2026-09-03T16:29:17.1331882Z 
2026-09-03T16:29:17.1332018Z PLAY [jboss] *******************************************************************
2026-09-03T16:29:17.1364173Z 
2026-09-03T16:29:17.1364700Z PLAY [jboss] *******************************************************************
2026-09-03T16:29:17.1392834Z 
2026-09-03T16:29:17.1393001Z PLAY [jboss] *******************************************************************
2026-09-03T16:29:17.1421657Z 
2026-09-03T16:29:17.1421840Z PLAY [jboss] *******************************************************************
2026-09-03T16:29:17.1447290Z 
2026-09-03T16:29:17.1447462Z PLAY [jboss] *******************************************************************
2026-09-03T16:29:17.1472856Z 
2026-09-03T16:29:17.1473023Z PLAY [local] *******************************************************************
2026-09-03T16:29:17.1494909Z [WARNING]: Could not match supplied host pattern, ignoring: instance_restart
2026-09-03T16:29:17.1498089Z 
2026-09-03T16:29:17.1498238Z PLAY [instance_restart] ********************************************************
2026-09-03T16:29:17.1498382Z skipping: no hosts matched
2026-09-03T16:29:17.1501038Z [WARNING]: Could not match supplied host pattern, ignoring: machine_reboot
2026-09-03T16:29:17.1504500Z 
2026-09-03T16:29:17.1504720Z PLAY [machine_reboot] **********************************************************
2026-09-03T16:29:17.1505682Z skipping: no hosts matched
2026-09-03T16:29:17.1510560Z 
2026-09-03T16:29:17.1511013Z PLAY [local] *******************************************************************
2026-09-03T16:29:17.1534584Z [WARNING]: Could not match supplied host pattern, ignoring: instance_stop
2026-09-03T16:29:17.1537571Z 
2026-09-03T16:29:17.1537797Z PLAY [instance_stop] ***********************************************************
2026-09-03T16:29:17.1537940Z skipping: no hosts matched
2026-09-03T16:29:17.1540975Z 
2026-09-03T16:29:17.1541135Z PLAY [machine_reboot] **********************************************************
2026-09-03T16:29:17.1541272Z skipping: no hosts matched
2026-09-03T16:29:17.1546861Z 
2026-09-03T16:29:17.1547041Z PLAY [local] *******************************************************************
2026-09-03T16:29:17.1570088Z [WARNING]: Could not match supplied host pattern, ignoring: escopo_execucao
2026-09-03T16:29:17.1573088Z 
2026-09-03T16:29:17.1573217Z PLAY [Executar o Start do Sirot Connector no escopo definido] ******************
2026-09-03T16:29:17.1573352Z skipping: no hosts matched
2026-09-03T16:29:17.1579421Z 
2026-09-03T16:29:17.1579748Z PLAY [local] *******************************************************************
2026-09-03T16:29:17.1602572Z 
2026-09-03T16:29:17.1602894Z PLAY [Executar o Stop do Sirot Connector] **************************************
2026-09-03T16:29:17.1603043Z skipping: no hosts matched
2026-09-03T16:29:17.1609238Z 
2026-09-03T16:29:17.1609410Z PLAY [Configura TSM] ***********************************************************
2026-09-03T16:29:17.1634384Z 
2026-09-03T16:29:17.1634741Z PLAY [jboss] *******************************************************************
2026-09-03T16:29:17.1666331Z 
2026-09-03T16:29:17.1666732Z PLAY [Configura Control-M] *****************************************************
2026-09-03T16:29:17.1698245Z 
2026-09-03T16:29:17.1698531Z PLAY [jboss] *******************************************************************
2026-09-03T16:29:17.1738283Z 
2026-09-03T16:29:17.1738549Z PLAY [jboss] *******************************************************************
2026-09-03T16:29:17.1776714Z 
2026-09-03T16:29:17.1777070Z PLAY [jboss] *******************************************************************
2026-09-03T16:29:17.1807221Z Thursday 03 September 2026  13:29:17 -0300 (0:00:00.531)       0:00:00.842 **** 
2026-09-03T16:29:18.7266479Z 
2026-09-03T16:29:18.7267028Z TASK [Gathering Facts] *********************************************************
2026-09-03T16:29:18.7267188Z ok: [caddeapllx2801.agil.nprd.caixa.gov.br]
2026-09-03T16:29:18.7615629Z Thursday 03 September 2026  13:29:18 -0300 (0:00:01.580)       0:00:02.423 **** 
2026-09-03T16:29:18.8049444Z 
2026-09-03T16:29:18.8050351Z TASK [Gerando lista de secure files] *******************************************
2026-09-03T16:29:18.8050938Z ok: [caddeapllx2801.agil.nprd.caixa.gov.br]
2026-09-03T16:29:18.8071426Z 
2026-09-03T16:29:18.8071831Z PLAY [jboss] *******************************************************************
2026-09-03T16:29:18.8390777Z Thursday 03 September 2026  13:29:18 -0300 (0:00:00.077)       0:00:02.500 **** 
2026-09-03T16:29:19.4260084Z 
2026-09-03T16:29:19.4260630Z TASK [Gathering Facts] *********************************************************
2026-09-03T16:29:19.4260839Z ok: [caddeapllx2801.agil.nprd.caixa.gov.br]
2026-09-03T16:29:19.4521299Z Thursday 03 September 2026  13:29:19 -0300 (0:00:00.613)       0:00:03.113 **** 
2026-09-03T16:29:19.8535838Z 
2026-09-03T16:29:19.8536623Z TASK [Cria Diretórios em /opt/batch/] ******************************************
2026-09-03T16:29:19.8536796Z ok: [caddeapllx2801.agil.nprd.caixa.gov.br] => (item=/opt/batch)
2026-09-03T16:29:20.0506839Z ok: [caddeapllx2801.agil.nprd.caixa.gov.br] => (item=/opt/batch/config)
2026-09-03T16:29:20.2470978Z ok: [caddeapllx2801.agil.nprd.caixa.gov.br] => (item=/opt/batch/deploy)
2026-09-03T16:29:20.4441888Z ok: [caddeapllx2801.agil.nprd.caixa.gov.br] => (item=/opt/batch/securefiles)
2026-09-03T16:29:20.4698558Z Thursday 03 September 2026  13:29:20 -0300 (0:00:01.017)       0:00:04.130 **** 
2026-09-03T16:29:20.5328871Z included: /opt/ads-agent/_work/r17630/a/esteira-jboss-vm-v2/roles/batch/tasks/batch_config.yml for caddeapllx2801.agil.nprd.caixa.gov.br
2026-09-03T16:29:20.5548899Z Thursday 03 September 2026  13:29:20 -0300 (0:00:00.085)       0:00:04.216 **** 
2026-09-03T16:29:20.6107486Z 
2026-09-03T16:29:20.6108485Z TASK [Cria variável build_repository_name] *************************************
2026-09-03T16:29:20.6108694Z ok: [caddeapllx2801.agil.nprd.caixa.gov.br]
2026-09-03T16:29:20.6310555Z Thursday 03 September 2026  13:29:20 -0300 (0:00:00.076)       0:00:04.292 **** 
2026-09-03T16:29:20.7998731Z 
2026-09-03T16:29:20.7999489Z TASK [Copia Arquivos do Repositório de Config] *********************************
2026-09-03T16:29:20.7999878Z An exception occurred during task execution. To see the full traceback, use -vvv. The error was: If you are using a module and expect the file to exist on the remote, see the remote_src option
2026-09-03T16:29:20.8000344Z fatal: [caddeapllx2801.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "msg": "Could not find or access '/opt/ads-agent/_work/r17630/a/_esteira-jboss-vm-v2-config/' on the Ansible Controller.\nIf you are using a module and expect the file to exist on the remote, see the remote_src option"}
2026-09-03T16:29:20.8006061Z 
2026-09-03T16:29:20.8006792Z PLAY RECAP *********************************************************************
2026-09-03T16:29:20.8007060Z caddeapllx2801.agil.nprd.caixa.gov.br : ok=7    changed=0    unreachable=0    failed=1    skipped=0    rescued=0    ignored=0   
2026-09-03T16:29:20.8007164Z 
2026-09-03T16:29:20.8007529Z Thursday 03 September 2026  13:29:20 -0300 (0:00:00.169)       0:00:04.462 **** 
2026-09-03T16:29:20.8007693Z =============================================================================== 
2026-09-03T16:29:20.8007941Z Gathering Facts --------------------------------------------------------- 1.58s
2026-09-03T16:29:20.8008175Z Cria Diretórios em /opt/batch/ ------------------------------------------ 1.02s
2026-09-03T16:29:20.8008407Z Gathering Facts --------------------------------------------------------- 0.61s
2026-09-03T16:29:20.8008640Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.53s
2026-09-03T16:29:20.8008855Z Copia Arquivos do Repositório de Config --------------------------------- 0.17s
2026-09-03T16:29:20.8009063Z include_tasks ----------------------------------------------------------- 0.09s
2026-09-03T16:29:20.8009277Z Gerando lista de secure files ------------------------------------------- 0.08s
2026-09-03T16:29:20.8009492Z Cria variável build_repository_name ------------------------------------- 0.08s
2026-09-03T16:29:20.8009643Z Playbook run took 0 days, 0 hours, 0 minutes, 4 seconds
2026-09-03T16:29:20.8658807Z ##[error]Bash exited with code '2'.
2026-09-03T16:29:20.8661349Z ##[section]Finishing: Arquivos de Configuração



<img width="1857" height="895" alt="image" src="https://github.com/user-attachments/assets/38054601-a28b-4737-9355-cded9275a413" />
