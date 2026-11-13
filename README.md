2026-11-13T15:25:18.8490354Z ##[section]Starting: Definir size como executado
2026-11-13T15:25:18.8496626Z ==============================================================================
2026-11-13T15:25:18.8496732Z Task         : Bash
2026-11-13T15:25:18.8496778Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-13T15:25:18.8496857Z Version      : 3.227.0
2026-11-13T15:25:18.8496903Z Author       : Microsoft Corporation
2026-11-13T15:25:18.8496966Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-13T15:25:18.8497041Z ==============================================================================
2026-11-13T15:25:19.7176069Z Generating script.
2026-11-13T15:25:19.7188224Z ========================== Starting Command Output ===========================
2026-11-13T15:25:19.7195949Z [command]/bin/bash /opt/ads-agent/_work/_temp/e48d4cae-ccb2-4917-a73b-1a5035573a3a.sh
2026-11-13T15:25:19.7247775Z ++ echo _SIIFX-caixinhas-batch
2026-11-13T15:25:19.7248911Z ++ sed s/_//
2026-11-13T15:25:19.7259417Z + REPO=SIIFX-caixinhas-batch
2026-11-13T15:25:19.7262755Z ++ tf_var_quant
2026-11-13T15:25:19.7266966Z /opt/ads-agent/_work/_temp/e48d4cae-ccb2-4917-a73b-1a5035573a3a.sh: line 4: tf_var_quant: comando não encontrado
2026-11-13T15:25:19.7268108Z + ansible-playbook /opt/ads-agent/_work/r12596/a/esteira-jboss-vm-v2/site.yml --tags size_executado -e sistema_ambiente=tqs -e sistema_nome=siifx-caixinhas-batch -e site=ctc_nprd -e quantidade_vm= -e centralizadora_operacoes=7259 -e centralizadora_desenvolvimento=7390 -e default_working_directory_tfs=/opt/ads-agent/_work/r12596/a -e build_repository_name_tfs=SIIFX-caixinhas-batch
2026-11-13T15:25:20.4290425Z [WARNING]:  * Failed to parse /opt/ads-agent/_work/r12596/a/esteira-jboss-
2026-11-13T15:25:20.4290911Z vm-v2/inventory/inventory_portal.py with script plugin: Inventory script (/opt
2026-11-13T15:25:20.4291276Z /ads-agent/_work/r12596/a/esteira-jboss-vm-v2/inventory/inventory_portal.py)
2026-11-13T15:25:20.4291502Z had an execution error:
2026-11-13T15:25:20.4291748Z [WARNING]:  * Failed to parse /opt/ads-agent/_work/r12596/a/esteira-jboss-
2026-11-13T15:25:20.4292078Z vm-v2/inventory/inventory_portal.py with ini plugin: /opt/ads-
2026-11-13T15:25:20.4292341Z agent/_work/r12596/a/esteira-jboss-vm-v2/inventory/inventory_portal.py:2:
2026-11-13T15:25:20.4292500Z Expected key=value host variable assignment, got: os
2026-11-13T15:25:20.4292876Z ERROR! Completely failed to parse inventory source /opt/ads-agent/_work/r12596/a/esteira-jboss-vm-v2/inventory/inventory_portal.py
2026-11-13T15:25:20.4515796Z ##[error]Bash exited with code '1'.
2026-11-13T15:25:20.4526255Z ##[warning]RetryHelper encountered task failure, will retry (attempt #: 1 out of 5) after 1000 ms
2026-11-13T15:25:21.5391133Z Generating script.
2026-11-13T15:25:21.5402600Z ========================== Starting Command Output ===========================
2026-11-13T15:25:21.5409947Z [command]/bin/bash /opt/ads-agent/_work/_temp/3d40077f-4346-40c6-b420-dcccff145741.sh
2026-11-13T15:25:21.5463530Z ++ echo _SIIFX-caixinhas-batch
2026-11-13T15:25:21.5464252Z ++ sed s/_//
2026-11-13T15:25:21.5475223Z + REPO=SIIFX-caixinhas-batch
2026-11-13T15:25:21.5477954Z ++ tf_var_quant
2026-11-13T15:25:21.5481071Z /opt/ads-agent/_work/_temp/3d40077f-4346-40c6-b420-dcccff145741.sh: line 4: tf_var_quant: comando não encontrado
2026-11-13T15:25:21.5482695Z + ansible-playbook /opt/ads-agent/_work/r12596/a/esteira-jboss-vm-v2/site.yml --tags size_executado -e sistema_ambiente=tqs -e sistema_nome=siifx-caixinhas-batch -e site=ctc_nprd -e quantidade_vm= -e centralizadora_operacoes=7259 -e centralizadora_desenvolvimento=7390 -e default_working_directory_tfs=/opt/ads-agent/_work/r12596/a -e build_repository_name_tfs=SIIFX-caixinhas-batch
2026-11-13T15:25:22.2229753Z [WARNING]:  * Failed to parse /opt/ads-agent/_work/r12596/a/esteira-jboss-
2026-11-13T15:25:22.2230317Z vm-v2/inventory/inventory_portal.py with script plugin: Inventory script (/opt
2026-11-13T15:25:22.2230597Z /ads-agent/_work/r12596/a/esteira-jboss-vm-v2/inventory/inventory_portal.py)
2026-11-13T15:25:22.2231074Z had an execution error:
2026-11-13T15:25:22.2231447Z [WARNING]:  * Failed to parse /opt/ads-agent/_work/r12596/a/esteira-jboss-
2026-11-13T15:25:22.2231745Z vm-v2/inventory/inventory_portal.py with ini plugin: /opt/ads-
2026-11-13T15:25:22.2232144Z agent/_work/r12596/a/esteira-jboss-vm-v2/inventory/inventory_portal.py:2:
2026-11-13T15:25:22.2232396Z Expected key=value host variable assignment, got: os
2026-11-13T15:25:22.2232688Z ERROR! Completely failed to parse inventory source /opt/ads-agent/_work/r12596/a/esteira-jboss-vm-v2/inventory/inventory_portal.py
2026-11-13T15:25:22.2449817Z ##[error]Bash exited with code '1'.
2026-11-13T15:25:22.2483711Z ##[warning]RetryHelper encountered task failure, will retry (attempt #: 2 out of 5) after 4000 ms
2026-11-13T15:25:26.3323168Z Generating script.
2026-11-13T15:25:26.3334319Z ========================== Starting Command Output ===========================
2026-11-13T15:25:26.3341487Z [command]/bin/bash /opt/ads-agent/_work/_temp/e0634279-5de7-4f08-b379-7b4c052158b8.sh
2026-11-13T15:25:26.3393583Z ++ echo _SIIFX-caixinhas-batch
2026-11-13T15:25:26.3394731Z ++ sed s/_//
2026-11-13T15:25:26.3407399Z + REPO=SIIFX-caixinhas-batch
2026-11-13T15:25:26.3409594Z ++ tf_var_quant
2026-11-13T15:25:26.3412705Z /opt/ads-agent/_work/_temp/e0634279-5de7-4f08-b379-7b4c052158b8.sh: line 4: tf_var_quant: comando não encontrado
2026-11-13T15:25:26.3413970Z + ansible-playbook /opt/ads-agent/_work/r12596/a/esteira-jboss-vm-v2/site.yml --tags size_executado -e sistema_ambiente=tqs -e sistema_nome=siifx-caixinhas-batch -e site=ctc_nprd -e quantidade_vm= -e centralizadora_operacoes=7259 -e centralizadora_desenvolvimento=7390 -e default_working_directory_tfs=/opt/ads-agent/_work/r12596/a -e build_repository_name_tfs=SIIFX-caixinhas-batch
2026-11-13T15:25:26.9980849Z [WARNING]:  * Failed to parse /opt/ads-agent/_work/r12596/a/esteira-jboss-
2026-11-13T15:25:26.9981171Z vm-v2/inventory/inventory_portal.py with script plugin: Inventory script (/opt
2026-11-13T15:25:26.9981436Z /ads-agent/_work/r12596/a/esteira-jboss-vm-v2/inventory/inventory_portal.py)
2026-11-13T15:25:26.9981584Z had an execution error:
2026-11-13T15:25:26.9981787Z [WARNING]:  * Failed to parse /opt/ads-agent/_work/r12596/a/esteira-jboss-
2026-11-13T15:25:26.9982056Z vm-v2/inventory/inventory_portal.py with ini plugin: /opt/ads-
2026-11-13T15:25:26.9982318Z agent/_work/r12596/a/esteira-jboss-vm-v2/inventory/inventory_portal.py:2:
2026-11-13T15:25:26.9982468Z Expected key=value host variable assignment, got: os
2026-11-13T15:25:26.9982749Z ERROR! Completely failed to parse inventory source /opt/ads-agent/_work/r12596/a/esteira-jboss-vm-v2/inventory/inventory_portal.py
2026-11-13T15:25:27.0194530Z ##[error]Bash exited with code '1'.
2026-11-13T15:25:27.0228532Z ##[warning]RetryHelper encountered task failure, will retry (attempt #: 3 out of 5) after 9000 ms
2026-11-13T15:25:36.1092177Z Generating script.
2026-11-13T15:25:36.1103563Z ========================== Starting Command Output ===========================
2026-11-13T15:25:36.1110639Z [command]/bin/bash /opt/ads-agent/_work/_temp/4cab1161-6da6-4274-af72-b3dc1f435184.sh
2026-11-13T15:25:36.1165612Z ++ echo _SIIFX-caixinhas-batch
2026-11-13T15:25:36.1166597Z ++ sed s/_//
2026-11-13T15:25:36.1175661Z + REPO=SIIFX-caixinhas-batch
2026-11-13T15:25:36.1182241Z ++ tf_var_quant
2026-11-13T15:25:36.1182572Z /opt/ads-agent/_work/_temp/4cab1161-6da6-4274-af72-b3dc1f435184.sh: line 4: tf_var_quant: comando não encontrado
2026-11-13T15:25:36.1183988Z + ansible-playbook /opt/ads-agent/_work/r12596/a/esteira-jboss-vm-v2/site.yml --tags size_executado -e sistema_ambiente=tqs -e sistema_nome=siifx-caixinhas-batch -e site=ctc_nprd -e quantidade_vm= -e centralizadora_operacoes=7259 -e centralizadora_desenvolvimento=7390 -e default_working_directory_tfs=/opt/ads-agent/_work/r12596/a -e build_repository_name_tfs=SIIFX-caixinhas-batch
2026-11-13T15:25:36.7645316Z [WARNING]:  * Failed to parse /opt/ads-agent/_work/r12596/a/esteira-jboss-
2026-11-13T15:25:36.7646038Z vm-v2/inventory/inventory_portal.py with script plugin: Inventory script (/opt
2026-11-13T15:25:36.7646335Z /ads-agent/_work/r12596/a/esteira-jboss-vm-v2/inventory/inventory_portal.py)
2026-11-13T15:25:36.7646486Z had an execution error:
2026-11-13T15:25:36.7646762Z [WARNING]:  * Failed to parse /opt/ads-agent/_work/r12596/a/esteira-jboss-
2026-11-13T15:25:36.7646978Z vm-v2/inventory/inventory_portal.py with ini plugin: /opt/ads-
2026-11-13T15:25:36.7647224Z agent/_work/r12596/a/esteira-jboss-vm-v2/inventory/inventory_portal.py:2:
2026-11-13T15:25:36.7647384Z Expected key=value host variable assignment, got: os
2026-11-13T15:25:36.7647664Z ERROR! Completely failed to parse inventory source /opt/ads-agent/_work/r12596/a/esteira-jboss-vm-v2/inventory/inventory_portal.py
2026-11-13T15:25:36.7857492Z ##[error]Bash exited with code '1'.
2026-11-13T15:25:36.7892361Z ##[warning]RetryHelper encountered task failure, will retry (attempt #: 4 out of 5) after 16000 ms
2026-11-13T15:25:52.8766588Z Generating script.
2026-11-13T15:25:52.8779490Z ========================== Starting Command Output ===========================
2026-11-13T15:25:52.8788177Z [command]/bin/bash /opt/ads-agent/_work/_temp/d0d3bd82-cf29-49ef-99e9-d70a8acb0bd7.sh
2026-11-13T15:25:52.8850420Z ++ echo _SIIFX-caixinhas-batch
2026-11-13T15:25:52.8852135Z ++ sed s/_//
2026-11-13T15:25:52.8863155Z + REPO=SIIFX-caixinhas-batch
2026-11-13T15:25:52.8866151Z ++ tf_var_quant
2026-11-13T15:25:52.8870492Z /opt/ads-agent/_work/_temp/d0d3bd82-cf29-49ef-99e9-d70a8acb0bd7.sh: line 4: tf_var_quant: comando não encontrado
2026-11-13T15:25:52.8871275Z + ansible-playbook /opt/ads-agent/_work/r12596/a/esteira-jboss-vm-v2/site.yml --tags size_executado -e sistema_ambiente=tqs -e sistema_nome=siifx-caixinhas-batch -e site=ctc_nprd -e quantidade_vm= -e centralizadora_operacoes=7259 -e centralizadora_desenvolvimento=7390 -e default_working_directory_tfs=/opt/ads-agent/_work/r12596/a -e build_repository_name_tfs=SIIFX-caixinhas-batch
2026-11-13T15:25:53.5714374Z [WARNING]:  * Failed to parse /opt/ads-agent/_work/r12596/a/esteira-jboss-
2026-11-13T15:25:53.5714803Z vm-v2/inventory/inventory_portal.py with script plugin: Inventory script (/opt
2026-11-13T15:25:53.5715595Z /ads-agent/_work/r12596/a/esteira-jboss-vm-v2/inventory/inventory_portal.py)
2026-11-13T15:25:53.5715760Z had an execution error:
2026-11-13T15:25:53.5715974Z [WARNING]:  * Failed to parse /opt/ads-agent/_work/r12596/a/esteira-jboss-
2026-11-13T15:25:53.5716189Z vm-v2/inventory/inventory_portal.py with ini plugin: /opt/ads-
2026-11-13T15:25:53.5716438Z agent/_work/r12596/a/esteira-jboss-vm-v2/inventory/inventory_portal.py:2:
2026-11-13T15:25:53.5716601Z Expected key=value host variable assignment, got: os
2026-11-13T15:25:53.5716881Z ERROR! Completely failed to parse inventory source /opt/ads-agent/_work/r12596/a/esteira-jboss-vm-v2/inventory/inventory_portal.py
2026-11-13T15:25:53.5915167Z ##[error]Bash exited with code '1'.
2026-11-13T15:25:53.5947673Z ##[warning]RetryHelper encountered task failure, will retry (attempt #: 5 out of 5) after 25000 ms
2026-11-13T15:26:18.6924242Z Generating script.
2026-11-13T15:26:18.6938791Z ========================== Starting Command Output ===========================
2026-11-13T15:26:18.6947451Z [command]/bin/bash /opt/ads-agent/_work/_temp/22bb49f5-4be1-49ca-b502-b1de2dc91583.sh
2026-11-13T15:26:18.7007202Z ++ echo _SIIFX-caixinhas-batch
2026-11-13T15:26:18.7009045Z ++ sed s/_//
2026-11-13T15:26:18.7018111Z + REPO=SIIFX-caixinhas-batch
2026-11-13T15:26:18.7020727Z ++ tf_var_quant
2026-11-13T15:26:18.7024778Z /opt/ads-agent/_work/_temp/22bb49f5-4be1-49ca-b502-b1de2dc91583.sh: line 4: tf_var_quant: comando não encontrado
2026-11-13T15:26:18.7025813Z + ansible-playbook /opt/ads-agent/_work/r12596/a/esteira-jboss-vm-v2/site.yml --tags size_executado -e sistema_ambiente=tqs -e sistema_nome=siifx-caixinhas-batch -e site=ctc_nprd -e quantidade_vm= -e centralizadora_operacoes=7259 -e centralizadora_desenvolvimento=7390 -e default_working_directory_tfs=/opt/ads-agent/_work/r12596/a -e build_repository_name_tfs=SIIFX-caixinhas-batch
2026-11-13T15:26:21.0258329Z 
2026-11-13T15:26:21.0259195Z PLAY [local] *******************************************************************
2026-11-13T15:26:21.0645612Z 
2026-11-13T15:26:21.0646558Z PLAY [Configurando o DNS] ******************************************************
2026-11-13T15:26:21.2848066Z 
2026-11-13T15:26:21.2848612Z PLAY [local] *******************************************************************
2026-11-13T15:26:21.2880934Z 
2026-11-13T15:26:21.2881854Z PLAY [Verificando serviços] ****************************************************
2026-11-13T15:26:21.2975218Z 
2026-11-13T15:26:21.2975919Z PLAY [Configuração LDAP] *******************************************************
2026-11-13T15:26:21.3020924Z [WARNING]: Found variable using reserved name: when
2026-11-13T15:26:21.3025336Z 
2026-11-13T15:26:21.3026054Z PLAY [jboss] *******************************************************************
2026-11-13T15:26:21.3440906Z 
2026-11-13T15:26:21.3441514Z PLAY [Stack Jboss] *************************************************************
2026-11-13T15:26:21.3682575Z Friday 13 November 2026  12:26:21 -0300 (0:00:00.407)       0:00:00.407 ******* 
2026-11-13T15:26:22.2369501Z 
2026-11-13T15:26:22.2370325Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-11-13T15:26:22.2373312Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-11-13T15:26:22.2373614Z caddeapllx2876.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-11-13T15:26:22.2373795Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-11-13T15:26:22.2373961Z releases. A future Ansible release will default to using the discovered 
2026-11-13T15:26:22.2374147Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-11-13T15:26:22.2374313Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-11-13T15:26:22.2374482Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-11-13T15:26:22.2374639Z setting deprecation_warnings=False in ansible.cfg.
2026-11-13T15:26:22.2375075Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:26:22.2403864Z 
2026-11-13T15:26:22.2404367Z PLAY [jboss] *******************************************************************
2026-11-13T15:26:22.2466648Z 
2026-11-13T15:26:22.2467131Z PLAY [jboss] *******************************************************************
2026-11-13T15:26:22.2514056Z 
2026-11-13T15:26:22.2514385Z PLAY [jboss] *******************************************************************
2026-11-13T15:26:22.2547214Z 
2026-11-13T15:26:22.2547988Z PLAY [Copiando deployments adicionais] *****************************************
2026-11-13T15:26:22.2583200Z 
2026-11-13T15:26:22.2583709Z PLAY [Copiando modules adicionais] *********************************************
2026-11-13T15:26:22.2609536Z 
2026-11-13T15:26:22.2610138Z PLAY [jboss] *******************************************************************
2026-11-13T15:26:22.2648556Z 
2026-11-13T15:26:22.2649316Z PLAY [jboss] *******************************************************************
2026-11-13T15:26:22.2683658Z 
2026-11-13T15:26:22.2684033Z PLAY [jboss] *******************************************************************
2026-11-13T15:26:22.2718018Z 
2026-11-13T15:26:22.2718325Z PLAY [jboss] *******************************************************************
2026-11-13T15:26:22.2743099Z 
2026-11-13T15:26:22.2743453Z PLAY [jboss] *******************************************************************
2026-11-13T15:26:22.2771080Z 
2026-11-13T15:26:22.2771450Z PLAY [local] *******************************************************************
2026-11-13T15:26:22.2796211Z [WARNING]: Could not match supplied host pattern, ignoring: instance_restart
2026-11-13T15:26:22.2798586Z 
2026-11-13T15:26:22.2798913Z PLAY [instance_restart] ********************************************************
2026-11-13T15:26:22.2799065Z skipping: no hosts matched
2026-11-13T15:26:22.2803195Z [WARNING]: Could not match supplied host pattern, ignoring: machine_reboot
2026-11-13T15:26:22.2815020Z 
2026-11-13T15:26:22.2823870Z PLAY [machine_reboot] **********************************************************
2026-11-13T15:26:22.2824064Z skipping: no hosts matched
2026-11-13T15:26:22.2824114Z 
2026-11-13T15:26:22.2824317Z PLAY [local] *******************************************************************
2026-11-13T15:26:22.2851231Z [WARNING]: Could not match supplied host pattern, ignoring: instance_stop
2026-11-13T15:26:22.2853257Z 
2026-11-13T15:26:22.2853811Z PLAY [instance_stop] ***********************************************************
2026-11-13T15:26:22.2854009Z skipping: no hosts matched
2026-11-13T15:26:22.2857350Z 
2026-11-13T15:26:22.2857561Z PLAY [machine_reboot] **********************************************************
2026-11-13T15:26:22.2857727Z skipping: no hosts matched
2026-11-13T15:26:22.2867337Z 
2026-11-13T15:26:22.2867594Z PLAY [local] *******************************************************************
2026-11-13T15:26:22.2890543Z [WARNING]: Could not match supplied host pattern, ignoring: escopo_execucao
2026-11-13T15:26:22.2893710Z 
2026-11-13T15:26:22.2894067Z PLAY [Executar o Start do Sirot Connector no escopo definido] ******************
2026-11-13T15:26:22.2894284Z skipping: no hosts matched
2026-11-13T15:26:22.2901312Z 
2026-11-13T15:26:22.2901593Z PLAY [local] *******************************************************************
2026-11-13T15:26:22.2927295Z 
2026-11-13T15:26:22.2927720Z PLAY [Executar o Stop do Sirot Connector] **************************************
2026-11-13T15:26:22.2927959Z skipping: no hosts matched
2026-11-13T15:26:22.2933706Z 
2026-11-13T15:26:22.2934032Z PLAY [Configura TSM] ***********************************************************
2026-11-13T15:26:22.2965671Z 
2026-11-13T15:26:22.2966145Z PLAY [jboss] *******************************************************************
2026-11-13T15:26:22.2989738Z 
2026-11-13T15:26:22.2990390Z PLAY [Configura Control-M] *****************************************************
2026-11-13T15:26:22.3026351Z 
2026-11-13T15:26:22.3026871Z PLAY [jboss] *******************************************************************
2026-11-13T15:26:22.3070449Z 
2026-11-13T15:26:22.3070954Z PLAY [jboss] *******************************************************************
2026-11-13T15:26:22.3132956Z 
2026-11-13T15:26:22.3133562Z PLAY [jboss] *******************************************************************
2026-11-13T15:26:22.3179969Z 
2026-11-13T15:26:22.3180524Z PLAY [jboss] *******************************************************************
2026-11-13T15:26:22.3206676Z 
2026-11-13T15:26:22.3207411Z PLAY [jboss] *******************************************************************
2026-11-13T15:26:22.3242556Z 
2026-11-13T15:26:22.3243450Z PLAY [localhost] ***************************************************************
2026-11-13T15:26:22.3281795Z Friday 13 November 2026  12:26:22 -0300 (0:00:00.959)       0:00:01.367 ******* 
2026-11-13T15:26:22.3720753Z included: /opt/ads-agent/_work/r12596/a/esteira-jboss-vm-v2/roles/vm/tasks/size/executed.yml for 127.0.0.1
2026-11-13T15:26:22.3745672Z Friday 13 November 2026  12:26:22 -0300 (0:00:00.046)       0:00:01.414 ******* 
2026-11-13T15:26:22.4216377Z included: /opt/ads-agent/_work/r12596/a/esteira-jboss-vm-v2/roles/vm/tasks/size/approved.yml for 127.0.0.1
2026-11-13T15:26:22.4254686Z Friday 13 November 2026  12:26:22 -0300 (0:00:00.050)       0:00:01.465 ******* 
2026-11-13T15:26:23.0896829Z 
2026-11-13T15:26:23.0897448Z TASK [Consultar API] ***********************************************************
2026-11-13T15:26:23.0897686Z ok: [127.0.0.1]
2026-11-13T15:26:23.0931309Z Friday 13 November 2026  12:26:23 -0300 (0:00:00.667)       0:00:02.132 ******* 
2026-11-13T15:26:23.1412699Z 
2026-11-13T15:26:23.1413375Z TASK [Parse JSON] **************************************************************
2026-11-13T15:26:23.1413536Z ok: [127.0.0.1]
2026-11-13T15:26:23.1440738Z Friday 13 November 2026  12:26:23 -0300 (0:00:00.050)       0:00:02.183 ******* 
2026-11-13T15:26:23.1869051Z Friday 13 November 2026  12:26:23 -0300 (0:00:00.042)       0:00:02.226 ******* 
2026-11-13T15:26:23.2339967Z 
2026-11-13T15:26:23.2340890Z PLAY [jboss] *******************************************************************
2026-11-13T15:26:23.2412859Z Friday 13 November 2026  12:26:23 -0300 (0:00:00.054)       0:00:02.280 ******* 
2026-11-13T15:26:24.1386568Z 
2026-11-13T15:26:24.1387084Z TASK [Gathering Facts] *********************************************************
2026-11-13T15:26:24.1387255Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:26:24.1570123Z Friday 13 November 2026  12:26:24 -0300 (0:00:00.915)       0:00:03.196 ******* 
2026-11-13T15:26:24.9998598Z 
2026-11-13T15:26:24.9999591Z TASK [relogio : Copy chrony.conf] **********************************************
2026-11-13T15:26:24.9999810Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:26:25.0137342Z Friday 13 November 2026  12:26:25 -0300 (0:00:00.856)       0:00:04.053 ******* 
2026-11-13T15:26:25.4459348Z 
2026-11-13T15:26:25.4459866Z TASK [relogio : Refresh chronyd] ***********************************************
2026-11-13T15:26:25.4460051Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:26:25.4626943Z Friday 13 November 2026  12:26:25 -0300 (0:00:00.449)       0:00:04.502 ******* 
2026-11-13T15:26:31.8568020Z 
2026-11-13T15:26:31.8568551Z TASK [tunning : Install tuned] *************************************************
2026-11-13T15:26:31.8568724Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:26:31.8713133Z Friday 13 November 2026  12:26:31 -0300 (0:00:06.408)       0:00:10.910 ******* 
2026-11-13T15:26:32.2902559Z 
2026-11-13T15:26:32.2903502Z TASK [tunning : Remover o arquivo (/etc/sysctl.d/30-nproc-nofile.conf) se ele existir] ***
2026-11-13T15:26:32.2903826Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:26:32.3032111Z Friday 13 November 2026  12:26:32 -0300 (0:00:00.431)       0:00:11.342 ******* 
2026-11-13T15:26:32.5544521Z 
2026-11-13T15:26:32.5545740Z TASK [tunning : Remover o arquivo (/etc/security/limits.d/20-nproc.conf) se ele existir] ***
2026-11-13T15:26:32.5545982Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:26:32.5677941Z Friday 13 November 2026  12:26:32 -0300 (0:00:00.264)       0:00:11.607 ******* 
2026-11-13T15:26:33.1395654Z 
2026-11-13T15:26:33.1396374Z TASK [tunning : Copy 90-rhel-sysctl.conf] **************************************
2026-11-13T15:26:33.1396544Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:26:33.1528607Z Friday 13 November 2026  12:26:33 -0300 (0:00:00.585)       0:00:12.192 ******* 
2026-11-13T15:26:33.7436641Z 
2026-11-13T15:26:33.7437384Z TASK [tunning : Copy 30-nproc-nofile.conf] *************************************
2026-11-13T15:26:33.7437582Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:26:33.7574702Z Friday 13 November 2026  12:26:33 -0300 (0:00:00.604)       0:00:12.797 ******* 
2026-11-13T15:26:34.1707481Z 
2026-11-13T15:26:34.1708309Z TASK [tunning : Add tcp_keepalive_time to sysctl.conf] *************************
2026-11-13T15:26:34.1709193Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:26:34.1835444Z Friday 13 November 2026  12:26:34 -0300 (0:00:00.426)       0:00:13.223 ******* 
2026-11-13T15:26:34.4368273Z 
2026-11-13T15:26:34.4369082Z TASK [tunning : Refresh sysctl.conf] *******************************************
2026-11-13T15:26:34.4369346Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:26:34.4496595Z Friday 13 November 2026  12:26:34 -0300 (0:00:00.266)       0:00:13.489 ******* 
2026-11-13T15:26:35.0638561Z 
2026-11-13T15:26:35.0639250Z TASK [tunning : Change tuned profile] ******************************************
2026-11-13T15:26:35.0640008Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:26:35.0810076Z Friday 13 November 2026  12:26:35 -0300 (0:00:00.631)       0:00:14.120 ******* 
2026-11-13T15:26:42.5641032Z 
2026-11-13T15:26:42.5642613Z TASK [qualys : Instalação do Qualys] *******************************************
2026-11-13T15:26:42.5643205Z [WARNING]: Module remote_tmp /root/.ansible/tmp did not exist and was created
2026-11-13T15:26:42.5643382Z with a mode of 0700, this may cause issues when running as another user. To
2026-11-13T15:26:42.5643549Z avoid this, create the remote_tmp dir with the correct permissions manually
2026-11-13T15:26:42.5645991Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:26:42.5781924Z Friday 13 November 2026  12:26:42 -0300 (0:00:07.497)       0:00:21.617 ******* 
2026-11-13T15:26:42.8518615Z 
2026-11-13T15:26:42.8519442Z TASK [Create directory /logs/qualys] *******************************************
2026-11-13T15:26:42.8519822Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:26:42.8710333Z Friday 13 November 2026  12:26:42 -0300 (0:00:00.292)       0:00:21.910 ******* 
2026-11-13T15:29:43.9619510Z 
2026-11-13T15:29:43.9621779Z TASK [qualys : Configura Agent Qualys] *****************************************
2026-11-13T15:29:43.9622172Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:29:43.9770851Z Friday 13 November 2026  12:29:43 -0300 (0:03:01.105)       0:03:23.016 ******* 
2026-11-13T15:29:44.7327097Z 
2026-11-13T15:29:44.7327757Z TASK [Criar arquivo de proxy do qualys] ****************************************
2026-11-13T15:29:44.7328034Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:29:44.7468114Z Friday 13 November 2026  12:29:44 -0300 (0:00:00.769)       0:03:23.786 ******* 
2026-11-13T15:29:45.3835439Z 
2026-11-13T15:29:45.3836391Z TASK [Start qualys] ************************************************************
2026-11-13T15:29:45.3836734Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:29:45.3975337Z Friday 13 November 2026  12:29:45 -0300 (0:00:00.650)       0:03:24.437 ******* 
2026-11-13T15:29:46.7948178Z 
2026-11-13T15:29:46.7948751Z TASK [qualys : Coletar facts dos servicos] *************************************
2026-11-13T15:29:46.7948938Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:29:46.8260323Z Friday 13 November 2026  12:29:46 -0300 (0:00:01.428)       0:03:25.865 ******* 
2026-11-13T15:29:46.8880100Z 
2026-11-13T15:29:46.8881039Z TASK [qualys : Validar servico do Qualys em execucao] **************************
2026-11-13T15:29:46.8881218Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br] => {
2026-11-13T15:29:46.8881359Z     "changed": false, 
2026-11-13T15:29:46.8881656Z     "msg": "Servico qualys-cloud-agent esta em execucao."
2026-11-13T15:29:46.8881899Z }
2026-11-13T15:29:46.9133137Z Friday 13 November 2026  12:29:46 -0300 (0:00:00.087)       0:03:25.952 ******* 
2026-11-13T15:29:47.1665476Z 
2026-11-13T15:29:47.1665998Z TASK [qualys : Coletar status detalhado do Qualys para log] ********************
2026-11-13T15:29:47.1666192Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:29:47.1922940Z Friday 13 November 2026  12:29:47 -0300 (0:00:00.279)       0:03:26.231 ******* 
2026-11-13T15:29:47.2487314Z 
2026-11-13T15:29:47.2488326Z TASK [qualys : Exibir status detalhado do Qualys] ******************************
2026-11-13T15:29:47.2488968Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br] => {
2026-11-13T15:29:47.2489117Z     "status_output.stdout_lines": [
2026-11-13T15:29:47.2489472Z         "● qualys-cloud-agent.service - Qualys cloud agent daemon", 
2026-11-13T15:29:47.2489747Z         "     Loaded: loaded (/usr/lib/systemd/system/qualys-cloud-agent.service; enabled; preset: disabled)", 
2026-11-13T15:29:47.2490035Z         "     Active: active (running) since Fri 2026-11-13 12:29:43 -03; 3s ago", 
2026-11-13T15:29:47.2490376Z         "   Main PID: 10877 (qualys-cloud-ag)", 
2026-11-13T15:29:47.2490557Z         "      Tasks: 6 (limit: 23075)", 
2026-11-13T15:29:47.2490682Z         "     Memory: 5.9M", 
2026-11-13T15:29:47.2492092Z         "        CPU: 412ms", 
2026-11-13T15:29:47.2492919Z         "     CGroup: /system.slice/qualys-cloud-agent.service", 
2026-11-13T15:29:47.2493419Z         "             ├─10877 /usr/local/qualys/cloud-agent/bin/qualys-cloud-agent", 
2026-11-13T15:29:47.2493982Z         "             ├─11470 sh", 
2026-11-13T15:29:47.2494444Z         "             └─11473 curl --noproxy \"*\" -w \"\\\\n%{http_code}\\\\n\" -H Metadata:true \"http://169.254.169.254/metadata/instance/compute/vmId?api-version=2017-08-01&format=text\"", 
2026-11-13T15:29:47.2494752Z         "", 
2026-11-13T15:29:47.2494988Z         "nov 13 12:29:43 caddeapllx2876.agil.nprd.caixa.gov.br systemd[1]: Started Qualys cloud agent daemon."
2026-11-13T15:29:47.2495203Z     ]
2026-11-13T15:29:47.2495354Z }
2026-11-13T15:29:47.2495605Z Friday 13 November 2026  12:29:47 -0300 (0:00:00.057)       0:03:26.289 ******* 
2026-11-13T15:31:17.7210278Z 
2026-11-13T15:31:17.7211087Z RUNNING HANDLER [Restart qualys cloud agent] ***********************************
2026-11-13T15:31:17.7211349Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:31:17.7247743Z 
2026-11-13T15:31:17.7248140Z PLAY [jboss] *******************************************************************
2026-11-13T15:31:17.7290861Z 
2026-11-13T15:31:17.7291255Z PLAY [jboss] *******************************************************************
2026-11-13T15:31:17.7330506Z 
2026-11-13T15:31:17.7331097Z PLAY RECAP *********************************************************************
2026-11-13T15:31:17.7333806Z 127.0.0.1                  : ok=4    changed=0    unreachable=0    failed=0    skipped=2    rescued=0    ignored=0   
2026-11-13T15:31:17.7334320Z caddeapllx2876.agil.nprd.caixa.gov.br : ok=22   changed=10   unreachable=0    failed=0    skipped=0    rescued=0    ignored=0   
2026-11-13T15:31:17.7334480Z 
2026-11-13T15:31:17.7334985Z Friday 13 November 2026  12:31:17 -0300 (0:01:30.483)       0:04:56.772 ******* 
2026-11-13T15:31:17.7335371Z =============================================================================== 
2026-11-13T15:31:17.7336010Z qualys : Configura Agent Qualys --------------------------------------- 181.11s
2026-11-13T15:31:17.7336480Z Restart qualys cloud agent --------------------------------------------- 90.48s
2026-11-13T15:31:17.7337554Z qualys : Instalação do Qualys ------------------------------------------- 7.50s
2026-11-13T15:31:17.7338441Z tunning : Install tuned ------------------------------------------------- 6.41s
2026-11-13T15:31:17.7338852Z qualys : Coletar facts dos servicos ------------------------------------- 1.43s
2026-11-13T15:31:17.7339239Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.96s
2026-11-13T15:31:17.7339526Z Gathering Facts --------------------------------------------------------- 0.92s
2026-11-13T15:31:17.7339756Z relogio : Copy chrony.conf ---------------------------------------------- 0.86s
2026-11-13T15:31:17.7340022Z Criar arquivo de proxy do qualys ---------------------------------------- 0.77s
2026-11-13T15:31:17.7340376Z Consultar API ----------------------------------------------------------- 0.67s
2026-11-13T15:31:17.7340751Z Start qualys ------------------------------------------------------------ 0.65s
2026-11-13T15:31:17.7341119Z tunning : Change tuned profile ------------------------------------------ 0.63s
2026-11-13T15:31:17.7341447Z tunning : Copy 30-nproc-nofile.conf ------------------------------------- 0.60s
2026-11-13T15:31:17.7341764Z tunning : Copy 90-rhel-sysctl.conf -------------------------------------- 0.59s
2026-11-13T15:31:17.7342193Z relogio : Refresh chronyd ----------------------------------------------- 0.45s
2026-11-13T15:31:17.7342530Z tunning : Remover o arquivo (/etc/sysctl.d/30-nproc-nofile.conf) se ele existir --- 0.43s
2026-11-13T15:31:17.7342865Z tunning : Add tcp_keepalive_time to sysctl.conf ------------------------- 0.43s
2026-11-13T15:31:17.7343575Z Create directory /logs/qualys ------------------------------------------- 0.29s
2026-11-13T15:31:17.7344237Z qualys : Coletar status detalhado do Qualys para log -------------------- 0.28s
2026-11-13T15:31:17.7344561Z tunning : Refresh sysctl.conf ------------------------------------------- 0.27s
2026-11-13T15:31:17.7344846Z Playbook run took 0 days, 0 hours, 4 minutes, 56 seconds
2026-11-13T15:31:17.8146447Z ##[section]Finishing: Definir size como executado
