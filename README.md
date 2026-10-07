2026-10-07T14:35:23.4917007Z ##[section]Starting: Deploy Pacote
2026-10-07T14:35:23.4920328Z ==============================================================================
2026-10-07T14:35:23.4920417Z Task         : Bash
2026-10-07T14:35:23.4920459Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-07T14:35:23.4920523Z Version      : 3.227.0
2026-10-07T14:35:23.4920585Z Author       : Microsoft Corporation
2026-10-07T14:35:23.4920637Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-07T14:35:23.4920708Z ==============================================================================
2026-10-07T14:35:24.0045456Z Generating script.
2026-10-07T14:35:24.0056292Z ========================== Starting Command Output ===========================
2026-10-07T14:35:24.0073717Z [command]/bin/bash /opt/ads-agent/_work/_temp/95163295-d10e-4270-81f4-dcc7a883003b.sh
2026-10-07T14:35:24.0151843Z /opt/ads-agent/_work/_temp/95163295-d10e-4270-81f4-dcc7a883003b.sh: line 2: quantidade_vm: comando não encontrado
2026-10-07T14:35:24.0175684Z ansible-playbook /opt/ads-agent/_work/r15760/a/esteira-jboss-vm-v2/site.yml --tags batch --skip-tags vm,monitoracao,autenticacao,git_conf,tsm,controlm -e sistema_ambiente=tqs -e sistema_nome=sisme-rotinas -e default_working_directory_tfs=/opt/ads-agent/_work/r15760/a -e build_repository_name_tfs=SISME-rotinas -e quantidade_vm= -e url_deploy=http://binario.caixa:8081/repository/releases/br/gov/caixa/sisme/sisme-rotinas/0.0.0.0/sisme-rotinas-0.0.0.0.jar -e package_path=/opt/ads-agent/_work/r15760/a/binario/sisme-rotinas-0.0.0.0.jar -e site=ctc_nprd -e batch_deploy=true
2026-10-07T14:35:24.0180993Z /opt/ads-agent/_work/_temp/95163295-d10e-4270-81f4-dcc7a883003b.sh: line 5: quantidade_vm: comando não encontrado
2026-10-07T14:35:26.1607173Z 
2026-10-07T14:35:26.1607692Z PLAY [local] *******************************************************************
2026-10-07T14:35:26.1887072Z 
2026-10-07T14:35:26.1887425Z PLAY [Configurando o DNS] ******************************************************
2026-10-07T14:35:26.3742310Z 
2026-10-07T14:35:26.3742936Z PLAY [local] *******************************************************************
2026-10-07T14:35:26.3780298Z 
2026-10-07T14:35:26.3780865Z PLAY [Verificando serviços] ****************************************************
2026-10-07T14:35:26.3866453Z 
2026-10-07T14:35:26.3867177Z PLAY [Configuração LDAP] *******************************************************
2026-10-07T14:35:26.3901308Z [WARNING]: Found variable using reserved name: when
2026-10-07T14:35:26.3907094Z 
2026-10-07T14:35:26.3907512Z PLAY [jboss] *******************************************************************
2026-10-07T14:35:26.4001159Z 
2026-10-07T14:35:26.4001611Z PLAY [Stack Jboss] *************************************************************
2026-10-07T14:35:26.4241482Z Wednesday 07 October 2026  11:35:26 -0300 (0:00:00.323)       0:00:00.323 ***** 
2026-10-07T14:35:26.8960439Z 
2026-10-07T14:35:26.8961919Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-10-07T14:35:26.8962253Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-10-07T14:35:26.8962570Z caddeapllx2781.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-10-07T14:35:26.8962745Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-10-07T14:35:26.8963713Z releases. A future Ansible release will default to using the discovered 
2026-10-07T14:35:26.8963880Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-10-07T14:35:26.8964044Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-10-07T14:35:26.8964230Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-10-07T14:35:26.8967241Z setting deprecation_warnings=False in ansible.cfg.
2026-10-07T14:35:26.8967376Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-07T14:35:26.8973654Z 
2026-10-07T14:35:26.8973927Z PLAY [jboss] *******************************************************************
2026-10-07T14:35:26.9013709Z 
2026-10-07T14:35:26.9013936Z PLAY [jboss] *******************************************************************
2026-10-07T14:35:26.9052038Z 
2026-10-07T14:35:26.9052276Z PLAY [jboss] *******************************************************************
2026-10-07T14:35:26.9075574Z 
2026-10-07T14:35:26.9075776Z PLAY [Copiando deployments adicionais] *****************************************
2026-10-07T14:35:26.9105035Z 
2026-10-07T14:35:26.9105219Z PLAY [Copiando modules adicionais] *********************************************
2026-10-07T14:35:26.9131708Z 
2026-10-07T14:35:26.9131916Z PLAY [jboss] *******************************************************************
2026-10-07T14:35:26.9165648Z 
2026-10-07T14:35:26.9166045Z PLAY [jboss] *******************************************************************
2026-10-07T14:35:26.9200415Z 
2026-10-07T14:35:26.9200620Z PLAY [jboss] *******************************************************************
2026-10-07T14:35:26.9230979Z 
2026-10-07T14:35:26.9231201Z PLAY [jboss] *******************************************************************
2026-10-07T14:35:26.9262841Z 
2026-10-07T14:35:26.9263044Z PLAY [jboss] *******************************************************************
2026-10-07T14:35:26.9288645Z 
2026-10-07T14:35:26.9288861Z PLAY [local] *******************************************************************
2026-10-07T14:35:26.9311604Z [WARNING]: Could not match supplied host pattern, ignoring: instance_restart
2026-10-07T14:35:26.9314810Z 
2026-10-07T14:35:26.9315042Z PLAY [instance_restart] ********************************************************
2026-10-07T14:35:26.9315194Z skipping: no hosts matched
2026-10-07T14:35:26.9317518Z [WARNING]: Could not match supplied host pattern, ignoring: machine_reboot
2026-10-07T14:35:26.9320569Z 
2026-10-07T14:35:26.9320745Z PLAY [machine_reboot] **********************************************************
2026-10-07T14:35:26.9320920Z skipping: no hosts matched
2026-10-07T14:35:26.9326646Z 
2026-10-07T14:35:26.9329237Z PLAY [local] *******************************************************************
2026-10-07T14:35:26.9355514Z [WARNING]: Could not match supplied host pattern, ignoring: instance_stop
2026-10-07T14:35:26.9360174Z 
2026-10-07T14:35:26.9360696Z PLAY [instance_stop] ***********************************************************
2026-10-07T14:35:26.9361004Z skipping: no hosts matched
2026-10-07T14:35:26.9363365Z 
2026-10-07T14:35:26.9363752Z PLAY [machine_reboot] **********************************************************
2026-10-07T14:35:26.9364016Z skipping: no hosts matched
2026-10-07T14:35:26.9368152Z 
2026-10-07T14:35:26.9368548Z PLAY [local] *******************************************************************
2026-10-07T14:35:26.9391162Z [WARNING]: Could not match supplied host pattern, ignoring: escopo_execucao
2026-10-07T14:35:26.9394313Z 
2026-10-07T14:35:26.9394687Z PLAY [Executar o Start do Sirot Connector no escopo definido] ******************
2026-10-07T14:35:26.9394918Z skipping: no hosts matched
2026-10-07T14:35:26.9400262Z 
2026-10-07T14:35:26.9400657Z PLAY [local] *******************************************************************
2026-10-07T14:35:26.9421206Z 
2026-10-07T14:35:26.9421626Z PLAY [Executar o Stop do Sirot Connector] **************************************
2026-10-07T14:35:26.9421913Z skipping: no hosts matched
2026-10-07T14:35:26.9430253Z 
2026-10-07T14:35:26.9430410Z PLAY [Configura TSM] ***********************************************************
2026-10-07T14:35:26.9455317Z 
2026-10-07T14:35:26.9455731Z PLAY [jboss] *******************************************************************
2026-10-07T14:35:26.9483091Z 
2026-10-07T14:35:26.9483656Z PLAY [Configura Control-M] *****************************************************
2026-10-07T14:35:26.9517128Z 
2026-10-07T14:35:26.9517534Z PLAY [jboss] *******************************************************************
2026-10-07T14:35:26.9558904Z 
2026-10-07T14:35:26.9559389Z PLAY [jboss] *******************************************************************
2026-10-07T14:35:26.9597582Z 
2026-10-07T14:35:26.9597962Z PLAY [jboss] *******************************************************************
2026-10-07T14:35:26.9630921Z Wednesday 07 October 2026  11:35:26 -0300 (0:00:00.539)       0:00:00.862 ***** 
2026-10-07T14:35:28.5121054Z 
2026-10-07T14:35:28.5121522Z TASK [Gathering Facts] *********************************************************
2026-10-07T14:35:28.5121735Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-07T14:35:28.5465404Z Wednesday 07 October 2026  11:35:28 -0300 (0:00:01.583)       0:00:02.445 ***** 
2026-10-07T14:35:28.5924439Z 
2026-10-07T14:35:28.5926908Z TASK [Gerando lista de secure files] *******************************************
2026-10-07T14:35:28.5928234Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-07T14:35:28.5945582Z 
2026-10-07T14:35:28.5945904Z PLAY [jboss] *******************************************************************
2026-10-07T14:35:28.6200400Z Wednesday 07 October 2026  11:35:28 -0300 (0:00:00.073)       0:00:02.518 ***** 
2026-10-07T14:35:29.2218789Z 
2026-10-07T14:35:29.2219338Z TASK [Gathering Facts] *********************************************************
2026-10-07T14:35:29.2219548Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-07T14:35:29.2496466Z Wednesday 07 October 2026  11:35:29 -0300 (0:00:00.629)       0:00:03.148 ***** 
2026-10-07T14:35:29.6583331Z 
2026-10-07T14:35:29.6584039Z TASK [Cria Diretórios em /opt/batch/] ******************************************
2026-10-07T14:35:29.6584218Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br] => (item=/opt/batch)
2026-10-07T14:35:29.8584404Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br] => (item=/opt/batch/config)
2026-10-07T14:35:30.0556341Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br] => (item=/opt/batch/deploy)
2026-10-07T14:35:30.2600635Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br] => (item=/opt/batch/securefiles)
2026-10-07T14:35:30.2828910Z Wednesday 07 October 2026  11:35:30 -0300 (0:00:01.033)       0:00:04.181 ***** 
2026-10-07T14:35:30.3484919Z Wednesday 07 October 2026  11:35:30 -0300 (0:00:00.065)       0:00:04.247 ***** 
2026-10-07T14:35:30.4198548Z included: /opt/ads-agent/_work/r15760/a/esteira-jboss-vm-v2/roles/batch/tasks/batch_deploy.yml for caddeapllx2781.agil.nprd.caixa.gov.br
2026-10-07T14:35:30.4434564Z Wednesday 07 October 2026  11:35:30 -0300 (0:00:00.095)       0:00:04.342 ***** 
2026-10-07T14:35:30.4965469Z 
2026-10-07T14:35:30.4966377Z TASK [Cria variáveis] **********************************************************
2026-10-07T14:35:30.4966891Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-07T14:35:30.5197835Z Wednesday 07 October 2026  11:35:30 -0300 (0:00:00.076)       0:00:04.418 ***** 
2026-10-07T14:35:30.9149296Z 
2026-10-07T14:35:30.9149794Z TASK [Get path of deploy] ******************************************************
2026-10-07T14:35:30.9150351Z changed: [caddeapllx2781.agil.nprd.caixa.gov.br] => (item=http://binario.caixa:8081/repository/releases/br/gov/caixa/sisme/sisme-rotinas/0.0.0.0/sisme-rotinas-0.0.0.0.jar)
2026-10-07T14:35:30.9384850Z Wednesday 07 October 2026  11:35:30 -0300 (0:00:00.418)       0:00:04.837 ***** 
2026-10-07T14:35:30.9949831Z 
2026-10-07T14:35:30.9950538Z TASK [set package_urls] ********************************************************
2026-10-07T14:35:30.9951521Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-07T14:35:31.0250277Z Wednesday 07 October 2026  11:35:31 -0300 (0:00:00.086)       0:00:04.923 ***** 
2026-10-07T14:35:31.4865024Z 
2026-10-07T14:35:31.4865526Z TASK [Verifica o se package existe] ********************************************
2026-10-07T14:35:31.4865956Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r15760/a/binario/sisme-rotinas-0.0.0.0.jar)
2026-10-07T14:35:31.5119589Z Wednesday 07 October 2026  11:35:31 -0300 (0:00:00.486)       0:00:05.410 ***** 
2026-10-07T14:35:35.0039996Z 
2026-10-07T14:35:35.0040531Z TASK [Deploy do Pacote] ********************************************************
2026-10-07T14:35:35.0040948Z changed: [caddeapllx2781.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r15760/a/binario/sisme-rotinas-0.0.0.0.jar)
2026-10-07T14:35:35.0279207Z Wednesday 07 October 2026  11:35:35 -0300 (0:00:03.516)       0:00:08.926 ***** 
2026-10-07T14:35:35.2631760Z 
2026-10-07T14:35:35.2632457Z TASK [Verifica se o arquivo /producao//configuration/custom-deploy.sh existe] ***
2026-10-07T14:35:35.2632612Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-07T14:35:35.2867313Z Wednesday 07 October 2026  11:35:35 -0300 (0:00:00.258)       0:00:09.185 ***** 
2026-10-07T14:35:35.3502687Z Wednesday 07 October 2026  11:35:35 -0300 (0:00:00.063)       0:00:09.249 ***** 
2026-10-07T14:35:35.4149572Z Wednesday 07 October 2026  11:35:35 -0300 (0:00:00.064)       0:00:09.313 ***** 
2026-10-07T14:35:35.4777077Z included: /opt/ads-agent/_work/r15760/a/esteira-jboss-vm-v2/roles/batch/tasks/batch_logs.yml for caddeapllx2781.agil.nprd.caixa.gov.br
2026-10-07T14:35:35.5027448Z Wednesday 07 October 2026  11:35:35 -0300 (0:00:00.087)       0:00:09.401 ***** 
2026-10-07T14:35:35.9101190Z 
2026-10-07T14:35:35.9101684Z TASK [Criacao diretorio /logs/batch] *******************************************
2026-10-07T14:35:35.9101852Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-07T14:35:35.9128839Z 
2026-10-07T14:35:35.9128993Z PLAY [localhost] ***************************************************************
2026-10-07T14:35:35.9156718Z 
2026-10-07T14:35:35.9157284Z PLAY [jboss] *******************************************************************
2026-10-07T14:35:35.9201989Z 
2026-10-07T14:35:35.9202466Z PLAY [jboss] *******************************************************************
2026-10-07T14:35:35.9240117Z 
2026-10-07T14:35:35.9240536Z PLAY [jboss] *******************************************************************
2026-10-07T14:35:35.9270076Z 
2026-10-07T14:35:35.9270569Z PLAY RECAP *********************************************************************
2026-10-07T14:35:35.9270827Z caddeapllx2781.agil.nprd.caixa.gov.br : ok=14   changed=2    unreachable=0    failed=0    skipped=3    rescued=0    ignored=0   
2026-10-07T14:35:35.9270941Z 
2026-10-07T14:35:35.9271788Z Wednesday 07 October 2026  11:35:35 -0300 (0:00:00.424)       0:00:09.826 ***** 
2026-10-07T14:35:35.9271990Z =============================================================================== 
2026-10-07T14:35:35.9272221Z Deploy do Pacote -------------------------------------------------------- 3.52s
2026-10-07T14:35:35.9272453Z Gathering Facts --------------------------------------------------------- 1.58s
2026-10-07T14:35:35.9272694Z Cria Diretórios em /opt/batch/ ------------------------------------------ 1.03s
2026-10-07T14:35:35.9272915Z Gathering Facts --------------------------------------------------------- 0.63s
2026-10-07T14:35:35.9273158Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.54s
2026-10-07T14:35:35.9273376Z Verifica o se package existe -------------------------------------------- 0.49s
2026-10-07T14:35:35.9273599Z Criacao diretorio /logs/batch ------------------------------------------- 0.42s
2026-10-07T14:35:35.9273823Z Get path of deploy ------------------------------------------------------ 0.42s
2026-10-07T14:35:35.9274048Z Verifica se o arquivo /producao//configuration/custom-deploy.sh existe --- 0.26s
2026-10-07T14:35:35.9274283Z include_tasks ----------------------------------------------------------- 0.10s
2026-10-07T14:35:35.9274500Z include_tasks ----------------------------------------------------------- 0.09s
2026-10-07T14:35:35.9274718Z set package_urls -------------------------------------------------------- 0.09s
2026-10-07T14:35:35.9274926Z Cria variáveis ---------------------------------------------------------- 0.08s
2026-10-07T14:35:35.9275150Z Gerando lista de secure files ------------------------------------------- 0.07s
2026-10-07T14:35:35.9275367Z include_tasks ----------------------------------------------------------- 0.07s
2026-10-07T14:35:35.9275580Z include_tasks ----------------------------------------------------------- 0.06s
2026-10-07T14:35:35.9276104Z Executa shell customizada ----------------------------------------------- 0.06s
2026-10-07T14:35:35.9276261Z Playbook run took 0 days, 0 hours, 0 minutes, 9 seconds
2026-10-07T14:35:35.9949694Z ##[section]Finishing: Deploy Pacote


2026-10-07T14:35:44.1108094Z ##[section]Starting: Configura Control-M
2026-10-07T14:35:44.1111441Z ==============================================================================
2026-10-07T14:35:44.1111520Z Task         : Bash
2026-10-07T14:35:44.1111566Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-07T14:35:44.1111639Z Version      : 3.227.0
2026-10-07T14:35:44.1111683Z Author       : Microsoft Corporation
2026-10-07T14:35:44.1111734Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-07T14:35:44.1111818Z ==============================================================================
2026-10-07T14:35:45.0740125Z Generating script.
2026-10-07T14:35:45.0750488Z ========================== Starting Command Output ===========================
2026-10-07T14:35:45.0757548Z [command]/bin/bash /opt/ads-agent/_work/_temp/f031efa6-0ec7-4900-a905-7c902dce5dc5.sh
2026-10-07T14:35:47.1625640Z 
2026-10-07T14:35:47.1626503Z PLAY [local] *******************************************************************
2026-10-07T14:35:47.1907157Z 
2026-10-07T14:35:47.1907757Z PLAY [Configurando o DNS] ******************************************************
2026-10-07T14:35:47.3762938Z 
2026-10-07T14:35:47.3763692Z PLAY [local] *******************************************************************
2026-10-07T14:35:47.3797872Z 
2026-10-07T14:35:47.3798452Z PLAY [Verificando serviços] ****************************************************
2026-10-07T14:35:47.3886217Z 
2026-10-07T14:35:47.3886776Z PLAY [Configuração LDAP] *******************************************************
2026-10-07T14:35:47.3920397Z [WARNING]: Found variable using reserved name: when
2026-10-07T14:35:47.3925321Z 
2026-10-07T14:35:47.3925656Z PLAY [jboss] *******************************************************************
2026-10-07T14:35:47.4019435Z 
2026-10-07T14:35:47.4019833Z PLAY [Stack Jboss] *************************************************************
2026-10-07T14:35:47.4046039Z 
2026-10-07T14:35:47.4046746Z PLAY [jboss] *******************************************************************
2026-10-07T14:35:47.4086644Z 
2026-10-07T14:35:47.4087117Z PLAY [jboss] *******************************************************************
2026-10-07T14:35:47.4363225Z Wednesday 07 October 2026  11:35:47 -0300 (0:00:00.333)       0:00:00.333 ***** 
2026-10-07T14:35:47.9450314Z 
2026-10-07T14:35:47.9450839Z TASK [Verifica se o arquivo nfs_config.json existe] ****************************
2026-10-07T14:35:47.9451003Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-07T14:35:47.9459852Z Wednesday 07 October 2026  11:35:47 -0300 (0:00:00.509)       0:00:00.843 ***** 
2026-10-07T14:35:47.9930303Z included: /opt/ads-agent/_work/r15760/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for caddeapllx2781.agil.nprd.caixa.gov.br
2026-10-07T14:35:47.9974684Z Wednesday 07 October 2026  11:35:47 -0300 (0:00:00.051)       0:00:00.894 ***** 
2026-10-07T14:35:48.0551183Z 
2026-10-07T14:35:48.0552145Z TASK [nfs : Criar variáveis] ***************************************************
2026-10-07T14:35:48.0552523Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-07T14:35:48.0602029Z Wednesday 07 October 2026  11:35:48 -0300 (0:00:00.062)       0:00:00.957 ***** 
2026-10-07T14:35:48.5021319Z 
2026-10-07T14:35:48.5022346Z TASK [nfs : Coletar variáveis de ambiente] *************************************
2026-10-07T14:35:48.5022835Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-07T14:35:48.5062304Z Wednesday 07 October 2026  11:35:48 -0300 (0:00:00.445)       0:00:01.403 ***** 
2026-10-07T14:35:48.5631099Z 
2026-10-07T14:35:48.5631955Z TASK [nfs : Exibir resultado em JSON] ******************************************
2026-10-07T14:35:48.5632170Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br] => {
2026-10-07T14:35:48.5632590Z     "nfs_vars_json": {
2026-10-07T14:35:48.5633328Z         "changed": false, 
2026-10-07T14:35:48.5633803Z         "cmd": "cat /opt/ads-agent/_work/r15760/a/nfs_config.json", 
2026-10-07T14:35:48.5633958Z         "delta": "0:00:00.005946", 
2026-10-07T14:35:48.5634268Z         "end": "2026-10-07 11:35:48.486058", 
2026-10-07T14:35:48.5634406Z         "failed": false, 
2026-10-07T14:35:48.5635194Z         "rc": 0, 
2026-10-07T14:35:48.5635365Z         "start": "2026-10-07 11:35:48.480112", 
2026-10-07T14:35:48.5635491Z         "stderr": "", 
2026-10-07T14:35:48.5635598Z         "stderr_lines": [], 
2026-10-07T14:35:48.5635762Z         "stdout": "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW\",\"NFS_MOUNT_POINT_ISILON\": \"/sisme_fgw\"}]", 
2026-10-07T14:35:48.5635933Z         "stdout_lines": [
2026-10-07T14:35:48.5636105Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW\",\"NFS_MOUNT_POINT_ISILON\": \"/sisme_fgw\"}]"
2026-10-07T14:35:48.5636259Z         ]
2026-10-07T14:35:48.5636349Z     }
2026-10-07T14:35:48.5636437Z }
2026-10-07T14:35:48.5663628Z Wednesday 07 October 2026  11:35:48 -0300 (0:00:00.060)       0:00:01.463 ***** 
2026-10-07T14:35:48.6258668Z 
2026-10-07T14:35:48.6259879Z TASK [nfs : Criar variáveis] ***************************************************
2026-10-07T14:35:48.6260532Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-07T14:35:48.6310551Z Wednesday 07 October 2026  11:35:48 -0300 (0:00:00.064)       0:00:01.528 ***** 
2026-10-07T14:35:52.4640176Z 
2026-10-07T14:35:52.4640866Z TASK [nfs : execute montagem script] *******************************************
2026-10-07T14:35:52.4641325Z changed: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-07T14:35:52.4679056Z Wednesday 07 October 2026  11:35:52 -0300 (0:00:03.836)       0:00:05.365 ***** 
2026-10-07T14:35:52.5290514Z 
2026-10-07T14:35:52.5291007Z TASK [nfs : ansible.builtin.debug] *********************************************
2026-10-07T14:35:52.5292500Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br] => {
2026-10-07T14:35:52.5292688Z     "changed": false, 
2026-10-07T14:35:52.5292843Z     "msg": {
2026-10-07T14:35:52.5292956Z         "changed": true, 
2026-10-07T14:35:52.5293078Z         "cmd": [
2026-10-07T14:35:52.5293201Z             "python", 
2026-10-07T14:35:52.5293532Z             "/opt/ads-agent/_work/r15760/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py", 
2026-10-07T14:35:52.5293674Z             "montagem", 
2026-10-07T14:35:52.5293806Z             "sisme-rotinas", 
2026-10-07T14:35:52.5293906Z             "tqs", 
2026-10-07T14:35:52.5294007Z             "ctc_nprd", 
2026-10-07T14:35:52.5294183Z             "/opt/ads-agent/_work/r15760/a/esteira-jboss-vm-v2", 
2026-10-07T14:35:52.5294308Z             "C&t@d02", 
2026-10-07T14:35:52.5294489Z             "***", 
2026-10-07T14:35:52.5294592Z             "s736651@corp.caixa.gov.br", 
2026-10-07T14:35:52.5294713Z             "***", 
2026-10-07T14:35:52.5294881Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW\",\"NFS_MOUNT_POINT_ISILON\": \"/sisme_fgw\"}]"
2026-10-07T14:35:52.5295037Z         ], 
2026-10-07T14:35:52.5295161Z         "delta": "0:00:03.476554", 
2026-10-07T14:35:52.5295339Z         "end": "2026-10-07 11:35:52.444076", 
2026-10-07T14:35:52.5295459Z         "failed": false, 
2026-10-07T14:35:52.5295550Z         "rc": 0, 
2026-10-07T14:35:52.5295710Z         "start": "2026-10-07 11:35:48.967522", 
2026-10-07T14:35:52.5295828Z         "stderr": "", 
2026-10-07T14:35:52.5295930Z         "stderr_lines": [], 
2026-10-07T14:35:52.5296954Z         "stdout": "[{u'NFS_MOUNT_POINT_ISILON': u'/sisme_fgw', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW'}]\nNome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           \n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW /sisme_fgw                          ISILON                              nfsctcnprd.ctc.caixa                tqs                                \nnfs_path=/sisme_fgw\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW /sisme_fgw                          ISILON                              nfsctcnprd.ctc.caixa                tqs                                ", 
2026-10-07T14:35:52.5297796Z         "stdout_lines": [
2026-10-07T14:35:52.5298073Z             "[{u'NFS_MOUNT_POINT_ISILON': u'/sisme_fgw', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW'}]", 
2026-10-07T14:35:52.5298266Z             "Nome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           ", 
2026-10-07T14:35:52.5298629Z             "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------", 
2026-10-07T14:35:52.5298876Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW /sisme_fgw                          ISILON                              nfsctcnprd.ctc.caixa                tqs                                ", 
2026-10-07T14:35:52.5299043Z             "nfs_path=/sisme_fgw", 
2026-10-07T14:35:52.5299271Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW", 
2026-10-07T14:35:52.5299473Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW /sisme_fgw                          ISILON                              nfsctcnprd.ctc.caixa                tqs                                "
2026-10-07T14:35:52.5299616Z         ]
2026-10-07T14:35:52.5299703Z     }
2026-10-07T14:35:52.5299791Z }
2026-10-07T14:35:52.5322584Z Wednesday 07 October 2026  11:35:52 -0300 (0:00:00.064)       0:00:05.429 ***** 
2026-10-07T14:35:52.8783214Z 
2026-10-07T14:35:52.8784079Z TASK [nfs : execute clean json] ************************************************
2026-10-07T14:35:52.8784290Z changed: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-07T14:35:52.8784436Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-10-07T14:35:52.8784792Z caddeapllx2781.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-10-07T14:35:52.8786274Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-10-07T14:35:52.8786579Z releases. A future Ansible release will default to using the discovered 
2026-10-07T14:35:52.8786908Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-10-07T14:35:52.8787285Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-10-07T14:35:52.8787549Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-10-07T14:35:52.8787729Z setting deprecation_warnings=False in ansible.cfg.
2026-10-07T14:35:52.8811493Z Wednesday 07 October 2026  11:35:52 -0300 (0:00:00.348)       0:00:05.778 ***** 
2026-10-07T14:35:52.9406056Z 
2026-10-07T14:35:52.9406806Z TASK [nfs : result_new_string_json] ********************************************
2026-10-07T14:35:52.9410439Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br] => {
2026-10-07T14:35:52.9410781Z     "msg": {
2026-10-07T14:35:52.9411311Z         "ansible_facts": {
2026-10-07T14:35:52.9411517Z             "discovered_interpreter_python": "/usr/bin/python"
2026-10-07T14:35:52.9411636Z         }, 
2026-10-07T14:35:52.9412016Z         "changed": true, 
2026-10-07T14:35:52.9412669Z         "cmd": "echo '[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW\",\"NFS_MOUNT_POINT_ISILON\": \"/sisme_fgw\"}]' | sed 's/NFS_ENDPOINT_ISILON[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_ISILON[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_HUAWEI[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_HUAWEI[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_VM[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_VM[^\"]*/NFS_MOUNT_POINT/g'", 
2026-10-07T14:35:52.9413115Z         "delta": "0:00:00.003628", 
2026-10-07T14:35:52.9414361Z         "deprecations": [
2026-10-07T14:35:52.9414460Z             {
2026-10-07T14:35:52.9415010Z                 "msg": "Distribution rhel 9.3 on host caddeapllx2781.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, but is using /usr/bin/python for backward compatibility with prior Ansible releases. A future Ansible release will default to using the discovered platform python for this host. See https://docs.ansible.com/ansible/2.9/reference_appendices/interpreter_discovery.html for more information", 
2026-10-07T14:35:52.9415306Z                 "version": "2.12"
2026-10-07T14:35:52.9415395Z             }
2026-10-07T14:35:52.9415484Z         ], 
2026-10-07T14:35:52.9415652Z         "end": "2026-10-07 11:35:52.861133", 
2026-10-07T14:35:52.9417401Z         "failed": false, 
2026-10-07T14:35:52.9417563Z         "rc": 0, 
2026-10-07T14:35:52.9417827Z         "start": "2026-10-07 11:35:52.857505", 
2026-10-07T14:35:52.9417954Z         "stderr": "", 
2026-10-07T14:35:52.9418051Z         "stderr_lines": [], 
2026-10-07T14:35:52.9418228Z         "stdout": "[{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW\",\"NFS_MOUNT_POINT\": \"/sisme_fgw\"}]", 
2026-10-07T14:35:52.9418403Z         "stdout_lines": [
2026-10-07T14:35:52.9419956Z             "[{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW\",\"NFS_MOUNT_POINT\": \"/sisme_fgw\"}]"
2026-10-07T14:35:52.9420128Z         ]
2026-10-07T14:35:52.9420222Z     }
2026-10-07T14:35:52.9420313Z }
2026-10-07T14:35:52.9439906Z Wednesday 07 October 2026  11:35:52 -0300 (0:00:00.062)       0:00:05.841 ***** 
2026-10-07T14:35:53.0025359Z 
2026-10-07T14:35:53.0025848Z TASK [nfs : Parse JSON data] ***************************************************
2026-10-07T14:35:53.0026034Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-07T14:35:53.0054750Z Wednesday 07 October 2026  11:35:53 -0300 (0:00:00.061)       0:00:05.902 ***** 
2026-10-07T14:35:53.0635830Z 
2026-10-07T14:35:53.0636303Z TASK [nfs : result_new_json] ***************************************************
2026-10-07T14:35:53.0637386Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br] => {
2026-10-07T14:35:53.0637565Z     "msg": [
2026-10-07T14:35:53.0637663Z         {
2026-10-07T14:35:53.0637814Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW", 
2026-10-07T14:35:53.0637967Z             "NFS_MOUNT_POINT": "/sisme_fgw"
2026-10-07T14:35:53.0638080Z         }
2026-10-07T14:35:53.0638170Z     ]
2026-10-07T14:35:53.0638260Z }
2026-10-07T14:35:53.0668801Z Wednesday 07 October 2026  11:35:53 -0300 (0:00:00.061)       0:00:05.964 ***** 
2026-10-07T14:35:53.1293921Z included: /opt/ads-agent/_work/r15760/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx2781.agil.nprd.caixa.gov.br
2026-10-07T14:35:53.1351820Z Wednesday 07 October 2026  11:35:53 -0300 (0:00:00.068)       0:00:06.032 ***** 
2026-10-07T14:35:53.1904906Z 
2026-10-07T14:35:53.1905818Z TASK [nfs : Parse JSON data] ***************************************************
2026-10-07T14:35:53.1906030Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-07T14:35:53.1936013Z Wednesday 07 October 2026  11:35:53 -0300 (0:00:00.058)       0:00:06.091 ***** 
2026-10-07T14:35:53.2492059Z 
2026-10-07T14:35:53.2492607Z TASK [nfs : debug] *************************************************************
2026-10-07T14:35:53.2492830Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br] => {
2026-10-07T14:35:53.2494866Z     "msg": {
2026-10-07T14:35:53.2495062Z         "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW", 
2026-10-07T14:35:53.2495218Z         "NFS_MOUNT_POINT": "/sisme_fgw"
2026-10-07T14:35:53.2495325Z     }
2026-10-07T14:35:53.2495630Z }
2026-10-07T14:35:53.2515554Z Wednesday 07 October 2026  11:35:53 -0300 (0:00:00.057)       0:00:06.149 ***** 
2026-10-07T14:35:53.3081803Z 
2026-10-07T14:35:53.3082313Z TASK [nfs : debug] *************************************************************
2026-10-07T14:35:53.3082464Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br] => {
2026-10-07T14:35:53.3082599Z     "msg": "/sisme_fgw"
2026-10-07T14:35:53.3082856Z }
2026-10-07T14:35:53.3106952Z Wednesday 07 October 2026  11:35:53 -0300 (0:00:00.059)       0:00:06.208 ***** 
2026-10-07T14:35:53.3644548Z 
2026-10-07T14:35:53.3644907Z TASK [nfs : debug] *************************************************************
2026-10-07T14:35:53.3646892Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br] => {
2026-10-07T14:35:53.3647052Z     "msg": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW"
2026-10-07T14:35:53.3647180Z }
2026-10-07T14:35:53.3681075Z Wednesday 07 October 2026  11:35:53 -0300 (0:00:00.057)       0:00:06.265 ***** 
2026-10-07T14:35:53.4262382Z 
2026-10-07T14:35:53.4263150Z TASK [nfs : Verificando as variaveis] ******************************************
2026-10-07T14:35:53.4263403Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br] => {
2026-10-07T14:35:53.4263543Z     "changed": false, 
2026-10-07T14:35:53.4263666Z     "msg": "All assertions passed"
2026-10-07T14:35:53.4263756Z }
2026-10-07T14:35:53.4296564Z Wednesday 07 October 2026  11:35:53 -0300 (0:00:00.061)       0:00:06.327 ***** 
2026-10-07T14:35:56.6273828Z 
2026-10-07T14:35:56.6274302Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-10-07T14:35:56.6274467Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-07T14:35:56.6311708Z Wednesday 07 October 2026  11:35:56 -0300 (0:00:03.201)       0:00:09.528 ***** 
2026-10-07T14:35:59.4827839Z 
2026-10-07T14:35:59.4828337Z TASK [nfs : Install networker lgtoclnt_url] ************************************
2026-10-07T14:35:59.4828503Z changed: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-07T14:35:59.4828670Z [WARNING]: Consider using the yum, dnf or zypper module rather than running
2026-10-07T14:35:59.4829000Z 'rpm'.  If you need to use command because yum, dnf or zypper is insufficient
2026-10-07T14:35:59.4829306Z you can add 'warn: false' to this command task or set 'command_warnings=False'
2026-10-07T14:35:59.4829456Z in ansible.cfg to get rid of this message.
2026-10-07T14:35:59.4858815Z Wednesday 07 October 2026  11:35:59 -0300 (0:00:02.854)       0:00:12.383 ***** 
2026-10-07T14:36:01.9036456Z 
2026-10-07T14:36:01.9037333Z TASK [nfs : Install networker lgtonmda_url] ************************************
2026-10-07T14:36:01.9037643Z changed: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-07T14:36:01.9077004Z Wednesday 07 October 2026  11:36:01 -0300 (0:00:02.421)       0:00:14.805 ***** 
2026-10-07T14:36:02.3088737Z 
2026-10-07T14:36:02.3089488Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-10-07T14:36:02.3089705Z changed: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-07T14:36:02.3125806Z Wednesday 07 October 2026  11:36:02 -0300 (0:00:00.404)       0:00:15.210 ***** 
2026-10-07T14:36:02.5528919Z 
2026-10-07T14:36:02.5529812Z TASK [nfs : Create a symbolic link] ********************************************
2026-10-07T14:36:02.5530255Z changed: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-07T14:36:02.5566505Z Wednesday 07 October 2026  11:36:02 -0300 (0:00:00.244)       0:00:15.454 ***** 
2026-10-07T14:36:03.5756178Z 
2026-10-07T14:36:03.5756686Z TASK [nfs : Networker | Start networker] ***************************************
2026-10-07T14:36:03.5757075Z changed: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-07T14:36:03.5801400Z Wednesday 07 October 2026  11:36:03 -0300 (0:00:01.023)       0:00:16.477 ***** 
2026-10-07T14:36:03.8289989Z 
2026-10-07T14:36:03.8291106Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-10-07T14:36:03.8291571Z changed: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-07T14:36:03.8323637Z Wednesday 07 October 2026  11:36:03 -0300 (0:00:00.252)       0:00:16.729 ***** 
2026-10-07T14:36:14.2106055Z 
2026-10-07T14:36:14.2106708Z TASK [nfs : Networker | Restart networker] *************************************
2026-10-07T14:36:14.2106986Z changed: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-07T14:36:14.2141169Z Wednesday 07 October 2026  11:36:14 -0300 (0:00:10.381)       0:00:27.111 ***** 
2026-10-07T14:36:14.9604649Z 
2026-10-07T14:36:14.9605498Z TASK [nfs : Montando volume remoto] ********************************************
2026-10-07T14:36:14.9605753Z changed: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-07T14:36:14.9629659Z Wednesday 07 October 2026  11:36:14 -0300 (0:00:00.748)       0:00:27.860 ***** 
2026-10-07T14:36:15.0061889Z 
2026-10-07T14:36:15.0062298Z PLAY [jboss] *******************************************************************
2026-10-07T14:36:15.0088329Z 
2026-10-07T14:36:15.0088875Z PLAY [Copiando deployments adicionais] *****************************************
2026-10-07T14:36:15.0116624Z 
2026-10-07T14:36:15.0117025Z PLAY [Copiando modules adicionais] *********************************************
2026-10-07T14:36:15.0142673Z 
2026-10-07T14:36:15.0143078Z PLAY [jboss] *******************************************************************
2026-10-07T14:36:15.0180805Z 
2026-10-07T14:36:15.0181310Z PLAY [jboss] *******************************************************************
2026-10-07T14:36:15.0209223Z 
2026-10-07T14:36:15.0209606Z PLAY [jboss] *******************************************************************
2026-10-07T14:36:15.0241781Z 
2026-10-07T14:36:15.0242158Z PLAY [jboss] *******************************************************************
2026-10-07T14:36:15.0269673Z 
2026-10-07T14:36:15.0270033Z PLAY [jboss] *******************************************************************
2026-10-07T14:36:15.0296599Z 
2026-10-07T14:36:15.0296972Z PLAY [local] *******************************************************************
2026-10-07T14:36:15.0325118Z [WARNING]: Could not match supplied host pattern, ignoring: instance_restart
2026-10-07T14:36:15.0328256Z 
2026-10-07T14:36:15.0328990Z PLAY [instance_restart] ********************************************************
2026-10-07T14:36:15.0329618Z skipping: no hosts matched
2026-10-07T14:36:15.0331350Z [WARNING]: Could not match supplied host pattern, ignoring: machine_reboot
2026-10-07T14:36:15.0334245Z 
2026-10-07T14:36:15.0334599Z PLAY [machine_reboot] **********************************************************
2026-10-07T14:36:15.0334824Z skipping: no hosts matched
2026-10-07T14:36:15.0340997Z 
2026-10-07T14:36:15.0341351Z PLAY [local] *******************************************************************
2026-10-07T14:36:15.0367573Z [WARNING]: Could not match supplied host pattern, ignoring: instance_stop
2026-10-07T14:36:15.0370803Z 
2026-10-07T14:36:15.0371256Z PLAY [instance_stop] ***********************************************************
2026-10-07T14:36:15.0371463Z skipping: no hosts matched
2026-10-07T14:36:15.0374169Z 
2026-10-07T14:36:15.0374551Z PLAY [machine_reboot] **********************************************************
2026-10-07T14:36:15.0374829Z skipping: no hosts matched
2026-10-07T14:36:15.0380318Z 
2026-10-07T14:36:15.0380671Z PLAY [local] *******************************************************************
2026-10-07T14:36:15.0404406Z [WARNING]: Could not match supplied host pattern, ignoring: escopo_execucao
2026-10-07T14:36:15.0407560Z 
2026-10-07T14:36:15.0407913Z PLAY [Executar o Start do Sirot Connector no escopo definido] ******************
2026-10-07T14:36:15.0408252Z skipping: no hosts matched
2026-10-07T14:36:15.0413910Z 
2026-10-07T14:36:15.0414266Z PLAY [local] *******************************************************************
2026-10-07T14:36:15.0437158Z 
2026-10-07T14:36:15.0437530Z PLAY [Executar o Stop do Sirot Connector] **************************************
2026-10-07T14:36:15.0437828Z skipping: no hosts matched
2026-10-07T14:36:15.0450980Z 
2026-10-07T14:36:15.0451240Z PLAY [Configura TSM] ***********************************************************
2026-10-07T14:36:15.0476427Z 
2026-10-07T14:36:15.0476640Z PLAY [jboss] *******************************************************************
2026-10-07T14:36:15.0514661Z Wednesday 07 October 2026  11:36:15 -0300 (0:00:00.088)       0:00:27.948 ***** 
2026-10-07T14:36:15.1082386Z 
2026-10-07T14:36:15.1083362Z TASK [Cria variável build_repository_name] *************************************
2026-10-07T14:36:15.1083916Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-07T14:36:15.1107712Z Wednesday 07 October 2026  11:36:15 -0300 (0:00:00.059)       0:00:28.008 ***** 
2026-10-07T14:36:15.1660308Z 
2026-10-07T14:36:15.1660750Z TASK [Buscando diretorio de config] ********************************************
2026-10-07T14:36:15.1660932Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-07T14:36:15.1759533Z Wednesday 07 October 2026  11:36:15 -0300 (0:00:00.065)       0:00:28.073 ***** 
2026-10-07T14:36:15.5325417Z 
2026-10-07T14:36:15.5326130Z TASK [Verifica se o arquivo {{ item }}/etc/hosts-{{ sistema_ambiente }} existe] ***
2026-10-07T14:36:15.5326446Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r15760/a/_SISME-rotinas-config)
2026-10-07T14:36:15.8458760Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r15760/a/_SISME-rotinas-config/so)
2026-10-07T14:36:15.8499071Z Wednesday 07 October 2026  11:36:15 -0300 (0:00:00.673)       0:00:28.747 ***** 
2026-10-07T14:36:16.2504434Z 
2026-10-07T14:36:16.2504938Z TASK [Altera arquivo /etc/hosts] ***********************************************
2026-10-07T14:36:16.2506580Z changed: [caddeapllx2781.agil.nprd.caixa.gov.br] => (item={u'item': u'/opt/ads-agent/_work/r15760/a/_SISME-rotinas-config', u'stat': {u'charset': u'us-ascii', u'uid': 1000, u'exists': True, u'attr_flags': u'', u'woth': False, u'device_type': 0, u'mtime': 1791383696.7003918, u'block_size': 4096, u'inode': 507540527, u'isgid': False, u'size': 59, u'wgrp': False, u'executable': False, u'isuid': False, u'readable': True, u'isreg': True, u'version': u'18446744073363778804', u'pw_name': u'sadscp01', u'gid': 1000, u'ischr': False, u'wusr': True, u'writeable': True, u'mimetype': u'text/plain', u'blocks': 8, u'xoth': False, u'islnk': False, u'nlink': 1, u'issock': False, u'rgrp': True, u'gr_name': u'sadscp01', u'path': u'/opt/ads-agent/_work/r15760/a/_SISME-rotinas-config/etc/hosts-tqs', u'xusr': False, u'atime': 1791383696.7013917, u'isdir': False, u'ctime': 1791383696.7003918, u'isblk': False, u'checksum': u'ac3cde31a92644800a4846c071421130feca72e5', u'dev': 64771, u'roth': True, u'isfifo': False, u'mode': u'0644', u'xgrp': False, u'rusr': True, u'attributes': []}, u'ansible_loop_var': u'item', u'failed': False, u'invocation': {u'module_args': {u'follow': False, u'get_checksum': True, u'path': u'/opt/ads-agent/_work/r15760/a/_SISME-rotinas-config/etc/hosts-tqs', u'checksum_algorithm': u'sha1', u'get_md5': False, u'get_mime': True, u'get_attributes': True}}, u'changed': False})
2026-10-07T14:36:16.2595444Z 
2026-10-07T14:36:16.2595774Z PLAY [Configura Control-M] *****************************************************
2026-10-07T14:36:16.2651051Z Wednesday 07 October 2026  11:36:16 -0300 (0:00:00.415)       0:00:29.162 ***** 
2026-10-07T14:36:16.8671809Z 
2026-10-07T14:36:16.8672830Z TASK [Gathering Facts] *********************************************************
2026-10-07T14:36:16.8673053Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-07T14:36:16.8872421Z Wednesday 07 October 2026  11:36:16 -0300 (0:00:00.620)       0:00:29.783 ***** 
2026-10-07T14:36:17.1282045Z 
2026-10-07T14:36:17.1282602Z TASK [stat] ********************************************************************
2026-10-07T14:36:17.1283052Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-07T14:36:17.1430971Z Wednesday 07 October 2026  11:36:17 -0300 (0:00:00.256)       0:00:30.040 ***** 
2026-10-07T14:36:17.2008060Z 
2026-10-07T14:36:17.2008602Z TASK [assert] ******************************************************************
2026-10-07T14:36:17.2009116Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br] => {
2026-10-07T14:36:17.2011154Z     "changed": false, 
2026-10-07T14:36:17.2011323Z     "msg": "All assertions passed"
2026-10-07T14:36:17.2011427Z }
2026-10-07T14:36:17.2150242Z Wednesday 07 October 2026  11:36:17 -0300 (0:00:00.071)       0:00:30.112 ***** 
2026-10-07T14:36:17.2876852Z 
2026-10-07T14:36:17.2877738Z TASK [control_m : Cria variável ansible] ***************************************
2026-10-07T14:36:17.2878373Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-07T14:36:17.3025976Z Wednesday 07 October 2026  11:36:17 -0300 (0:00:00.087)       0:00:30.200 ***** 
2026-10-07T14:36:18.0588091Z 
2026-10-07T14:36:18.0588537Z TASK [control_m : Copiando arquivo de certificado] *****************************
2026-10-07T14:36:18.0588748Z changed: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-07T14:36:18.0734995Z Wednesday 07 October 2026  11:36:18 -0300 (0:00:00.770)       0:00:30.970 ***** 
2026-10-07T14:36:18.3191946Z 
2026-10-07T14:36:18.3192656Z TASK [control_m : Executando add-user.sh] **************************************
2026-10-07T14:36:18.3192823Z changed: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-07T14:36:18.3337861Z Wednesday 07 October 2026  11:36:18 -0300 (0:00:00.260)       0:00:31.231 ***** 
2026-10-07T14:36:18.7364876Z 
2026-10-07T14:36:18.7365759Z TASK [control_m : Removendo add-user.sh] ***************************************
2026-10-07T14:36:18.7366177Z changed: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-07T14:36:18.7516557Z Wednesday 07 October 2026  11:36:18 -0300 (0:00:00.417)       0:00:31.649 ***** 
2026-10-07T14:36:19.0032290Z 
2026-10-07T14:36:19.0032801Z TASK [control_m : Criacao diretorio /producao/carga] ***************************
2026-10-07T14:36:19.0032985Z changed: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-07T14:36:19.0174139Z Wednesday 07 October 2026  11:36:19 -0300 (0:00:00.265)       0:00:31.914 ***** 
2026-10-07T14:36:19.2622046Z 
2026-10-07T14:36:19.2623061Z TASK [control_m : Criacao diretorio /producao/suporte] *************************
2026-10-07T14:36:19.2623462Z changed: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-07T14:36:19.2768805Z Wednesday 07 October 2026  11:36:19 -0300 (0:00:00.259)       0:00:32.174 ***** 
2026-10-07T14:36:19.8747366Z 
2026-10-07T14:36:19.8748243Z TASK [control_m : Garante bash_profile] ****************************************
2026-10-07T14:36:19.8748451Z changed: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-07T14:36:19.8892507Z Wednesday 07 October 2026  11:36:19 -0300 (0:00:00.612)       0:00:32.786 ***** 
2026-10-07T14:36:20.1324746Z 
2026-10-07T14:36:20.1325466Z TASK [control_m : Cria Diretório de Scripts] ***********************************
2026-10-07T14:36:20.1325659Z changed: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-07T14:36:20.1475349Z Wednesday 07 October 2026  11:36:20 -0300 (0:00:00.258)       0:00:33.044 ***** 
2026-10-07T14:36:22.1899575Z 
2026-10-07T14:36:22.1900486Z TASK [control_m : Copia Scripts] ***********************************************
2026-10-07T14:36:22.1900711Z changed: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-07T14:36:22.2057977Z Wednesday 07 October 2026  11:36:22 -0300 (0:00:02.058)       0:00:35.103 ***** 
2026-10-07T14:36:22.4596333Z 
2026-10-07T14:36:22.4597423Z TASK [control_m : Verifica se o arquivo /producao//configuration/custom.sh existe] ***
2026-10-07T14:36:22.4597798Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-07T14:36:22.4745632Z Wednesday 07 October 2026  11:36:22 -0300 (0:00:00.268)       0:00:35.371 ***** 
2026-10-07T14:36:22.7182112Z 
2026-10-07T14:36:22.7183038Z TASK [control_m : Executa shell customizada] ***********************************
2026-10-07T14:36:22.7183280Z changed: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-07T14:36:22.7328101Z Wednesday 07 October 2026  11:36:22 -0300 (0:00:00.258)       0:00:35.630 ***** 
2026-10-07T14:36:23.3912754Z 
2026-10-07T14:36:23.3913447Z TASK [control_m : Configuração Control-M] **************************************
2026-10-07T14:36:23.3913874Z changed: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-07T14:36:23.4058938Z Wednesday 07 October 2026  11:36:23 -0300 (0:00:00.673)       0:00:36.303 ***** 
2026-10-07T14:36:27.3919327Z 
2026-10-07T14:36:27.3920218Z TASK [control_m : Restart ControlM] ********************************************
2026-10-07T14:36:27.3920500Z changed: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-07T14:36:27.3956122Z 
2026-10-07T14:36:27.3956297Z PLAY [jboss] *******************************************************************
2026-10-07T14:36:27.4004222Z 
2026-10-07T14:36:27.4004720Z PLAY [jboss] *******************************************************************
2026-10-07T14:36:27.4046821Z 
2026-10-07T14:36:27.4047303Z PLAY [jboss] *******************************************************************
2026-10-07T14:36:27.4069684Z 
2026-10-07T14:36:27.4070083Z PLAY [jboss] *******************************************************************
2026-10-07T14:36:27.4100304Z 
2026-10-07T14:36:27.4100723Z PLAY [localhost] ***************************************************************
2026-10-07T14:36:27.4128278Z 
2026-10-07T14:36:27.4128685Z PLAY [jboss] *******************************************************************
2026-10-07T14:36:27.4173194Z 
2026-10-07T14:36:27.4173550Z PLAY [jboss] *******************************************************************
2026-10-07T14:36:27.4212648Z 
2026-10-07T14:36:27.4212963Z PLAY [jboss] *******************************************************************
2026-10-07T14:36:27.4247247Z 
2026-10-07T14:36:27.4247443Z PLAY RECAP *********************************************************************
2026-10-07T14:36:27.4247638Z caddeapllx2781.agil.nprd.caixa.gov.br : ok=47   changed=22   unreachable=0    failed=0    skipped=1    rescued=0    ignored=0   
2026-10-07T14:36:27.4249889Z 
2026-10-07T14:36:27.4252109Z Wednesday 07 October 2026  11:36:27 -0300 (0:00:04.018)       0:00:40.322 ***** 
2026-10-07T14:36:27.4252322Z =============================================================================== 
2026-10-07T14:36:27.4252572Z nfs : Networker | Restart networker ------------------------------------ 10.38s
2026-10-07T14:36:27.4252804Z control_m : Restart ControlM -------------------------------------------- 4.02s
2026-10-07T14:36:27.4253030Z nfs : execute montagem script ------------------------------------------- 3.84s
2026-10-07T14:36:27.4253246Z nfs : Instalando o NFS Client ------------------------------------------- 3.20s
2026-10-07T14:36:27.4253470Z nfs : Install networker lgtoclnt_url ------------------------------------ 2.85s
2026-10-07T14:36:27.4253688Z nfs : Install networker lgtonmda_url ------------------------------------ 2.42s
2026-10-07T14:36:27.4272863Z control_m : Copia Scripts ----------------------------------------------- 2.06s
2026-10-07T14:36:27.4277636Z nfs : Networker | Start networker --------------------------------------- 1.02s
2026-10-07T14:36:27.4278166Z control_m : Copiando arquivo de certificado ----------------------------- 0.77s
2026-10-07T14:36:27.4278585Z nfs : Montando volume remoto -------------------------------------------- 0.75s
2026-10-07T14:36:27.4281893Z Verifica se o arquivo {{ item }}/etc/hosts-{{ sistema_ambiente }} existe --- 0.67s
2026-10-07T14:36:27.4282333Z control_m : Configuração Control-M -------------------------------------- 0.67s
2026-10-07T14:36:27.4282869Z Gathering Facts --------------------------------------------------------- 0.62s
2026-10-07T14:36:27.4283152Z control_m : Garante bash_profile ---------------------------------------- 0.61s
2026-10-07T14:36:27.4283385Z Verifica se o arquivo nfs_config.json existe ---------------------------- 0.51s
2026-10-07T14:36:27.4283622Z nfs : Coletar variáveis de ambiente ------------------------------------- 0.45s
2026-10-07T14:36:27.4284022Z control_m : Removendo add-user.sh --------------------------------------- 0.42s
2026-10-07T14:36:27.4284246Z Altera arquivo /etc/hosts ----------------------------------------------- 0.42s
2026-10-07T14:36:27.4284476Z nfs : Remove pacote jbcs-httpd ------------------------------------------ 0.40s
2026-10-07T14:36:27.4284831Z nfs : execute clean json ------------------------------------------------ 0.35s
2026-10-07T14:36:27.4285015Z Playbook run took 0 days, 0 hours, 0 minutes, 40 seconds
2026-10-07T14:36:27.4923486Z ##[section]Finishing: Configura Control-M
