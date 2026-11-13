2026-11-13T15:37:34.0243114Z ##[section]Starting: Correção Artefato Final SIIFX-CAIXINHAS-BATCH
2026-11-13T15:37:34.0247049Z ==============================================================================
2026-11-13T15:37:34.0247208Z Task         : Bash
2026-11-13T15:37:34.0247255Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-13T15:37:34.0247318Z Version      : 3.227.0
2026-11-13T15:37:34.0247405Z Author       : Microsoft Corporation
2026-11-13T15:37:34.0247457Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-13T15:37:34.0247528Z ==============================================================================
2026-11-13T15:37:34.1413385Z Generating script.
2026-11-13T15:37:34.1424991Z ========================== Starting Command Output ===========================
2026-11-13T15:37:34.1432473Z [command]/bin/bash /opt/ads-agent/_work/_temp/e9714f60-6ad6-45e8-bae4-5530b004fced.sh
2026-11-13T15:37:34.1608741Z Versão: 0.0.181-SNAPSHOT
2026-11-13T15:37:34.1720169Z Artefato: http://binario.caixa:8081/repository/snapshots/br/gov/caixa/siifx/caixinhas/siifx-caixinhas-batch/0.0.181-SNAPSHOT/siifx-caixinhas-batch-0.0.181-20261113.145735-4.jar
2026-11-13T15:37:34.1769425Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-11-13T15:37:34.1769640Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-11-13T15:37:34.1769700Z 
2026-11-13T15:37:34.2415355Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-11-13T15:37:34.2415704Z 100 42.5M  100 42.5M    0     0   658M      0 --:--:-- --:--:-- --:--:--  665M
2026-11-13T15:37:34.2442937Z total 43664
2026-11-13T15:37:34.2443197Z -rw-r--r-- 1 sadscp01 sadscp01    60819 Nov 13 12:37 core-starter-0.0.182.1.jar
2026-11-13T15:37:34.2443711Z -rw-r--r-- 1 sadscp01 sadscp01 44647731 Nov 13 12:37 siifx-caixinhas-batch-0.0.181-20261113.145735-4.jar
2026-11-13T15:37:34.2498307Z ##[section]Finishing: Correção Artefato Final SIIFX-CAIXINHAS-BATCH



2026-11-13T15:38:04.2271318Z ##[section]Starting: Deploy Pacote
2026-11-13T15:38:04.2274583Z ==============================================================================
2026-11-13T15:38:04.2274664Z Task         : Bash
2026-11-13T15:38:04.2274707Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-13T15:38:04.2274785Z Version      : 3.227.0
2026-11-13T15:38:04.2274829Z Author       : Microsoft Corporation
2026-11-13T15:38:04.2274880Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-13T15:38:04.2274968Z ==============================================================================
2026-11-13T15:38:04.3562753Z Generating script.
2026-11-13T15:38:04.3573445Z ========================== Starting Command Output ===========================
2026-11-13T15:38:04.3580641Z [command]/bin/bash /opt/ads-agent/_work/_temp/3314c394-b3e0-4ddb-8be8-a50bd5fdb261.sh
2026-11-13T15:38:04.3671021Z /opt/ads-agent/_work/_temp/3314c394-b3e0-4ddb-8be8-a50bd5fdb261.sh: line 2: quantidade_vm: comando não encontrado
2026-11-13T15:38:04.3695813Z ansible-playbook /opt/ads-agent/_work/r19403/a/esteira-jboss-vm-v2/site.yml --tags batch --skip-tags vm,monitoracao,autenticacao,git_conf,tsm,controlm -e sistema_ambiente=tqs -e sistema_nome=siifx-caixinhas-batch -e default_working_directory_tfs=/opt/ads-agent/_work/r19403/a -e build_repository_name_tfs=SIIFX-caixinhas-batch -e quantidade_vm= -e url_deploy=http://binario.caixa:8081/repository/snapshots/br/gov/caixa/siifx/caixinhas/siifx-caixinhas-batch/0.0.181-SNAPSHOT/siifx-caixinhas-batch-0.0.181-20261113.145735-4.jar -e package_path=/opt/ads-agent/_work/r19403/a/binario/siifx-caixinhas-batch-0.0.181-20261113.145735-4.jar -e site=ctc_nprd -e batch_deploy=true
2026-11-13T15:38:04.3701726Z /opt/ads-agent/_work/_temp/3314c394-b3e0-4ddb-8be8-a50bd5fdb261.sh: line 5: quantidade_vm: comando não encontrado
2026-11-13T15:38:06.6270619Z 
2026-11-13T15:38:06.6271467Z PLAY [local] *******************************************************************
2026-11-13T15:38:06.6563597Z 
2026-11-13T15:38:06.6564081Z PLAY [Configurando o DNS] ******************************************************
2026-11-13T15:38:06.8537083Z 
2026-11-13T15:38:06.8537560Z PLAY [local] *******************************************************************
2026-11-13T15:38:06.8572475Z 
2026-11-13T15:38:06.8573152Z PLAY [Verificando serviços] ****************************************************
2026-11-13T15:38:06.8668510Z 
2026-11-13T15:38:06.8669133Z PLAY [Configuração LDAP] *******************************************************
2026-11-13T15:38:06.8711709Z [WARNING]: Found variable using reserved name: when
2026-11-13T15:38:06.8717271Z 
2026-11-13T15:38:06.8717427Z PLAY [jboss] *******************************************************************
2026-11-13T15:38:06.9092668Z 
2026-11-13T15:38:06.9093180Z PLAY [Stack Jboss] *************************************************************
2026-11-13T15:38:06.9322599Z Friday 13 November 2026  12:38:06 -0300 (0:00:00.365)       0:00:00.365 ******* 
2026-11-13T15:38:07.4034298Z 
2026-11-13T15:38:07.4035031Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-11-13T15:38:07.4036179Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-11-13T15:38:07.4036416Z caddeapllx2876.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-11-13T15:38:07.4036584Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-11-13T15:38:07.4036750Z releases. A future Ansible release will default to using the discovered 
2026-11-13T15:38:07.4036918Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-11-13T15:38:07.4037083Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-11-13T15:38:07.4041114Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-11-13T15:38:07.4041440Z setting deprecation_warnings=False in ansible.cfg.
2026-11-13T15:38:07.4041701Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:38:07.4068625Z 
2026-11-13T15:38:07.4069443Z PLAY [jboss] *******************************************************************
2026-11-13T15:38:07.4119736Z 
2026-11-13T15:38:07.4120116Z PLAY [jboss] *******************************************************************
2026-11-13T15:38:07.4162541Z 
2026-11-13T15:38:07.4162931Z PLAY [jboss] *******************************************************************
2026-11-13T15:38:07.4189001Z 
2026-11-13T15:38:07.4189305Z PLAY [Copiando deployments adicionais] *****************************************
2026-11-13T15:38:07.4217655Z 
2026-11-13T15:38:07.4218075Z PLAY [Copiando modules adicionais] *********************************************
2026-11-13T15:38:07.4245679Z 
2026-11-13T15:38:07.4246036Z PLAY [jboss] *******************************************************************
2026-11-13T15:38:07.4282746Z 
2026-11-13T15:38:07.4283034Z PLAY [jboss] *******************************************************************
2026-11-13T15:38:07.4316967Z 
2026-11-13T15:38:07.4317376Z PLAY [jboss] *******************************************************************
2026-11-13T15:38:07.4347638Z 
2026-11-13T15:38:07.4347955Z PLAY [jboss] *******************************************************************
2026-11-13T15:38:07.4375699Z 
2026-11-13T15:38:07.4376227Z PLAY [jboss] *******************************************************************
2026-11-13T15:38:07.4400723Z 
2026-11-13T15:38:07.4400869Z PLAY [local] *******************************************************************
2026-11-13T15:38:07.4427554Z [WARNING]: Could not match supplied host pattern, ignoring: instance_restart
2026-11-13T15:38:07.4430465Z 
2026-11-13T15:38:07.4430738Z PLAY [instance_restart] ********************************************************
2026-11-13T15:38:07.4430893Z skipping: no hosts matched
2026-11-13T15:38:07.4433188Z [WARNING]: Could not match supplied host pattern, ignoring: machine_reboot
2026-11-13T15:38:07.4436446Z 
2026-11-13T15:38:07.4436698Z PLAY [machine_reboot] **********************************************************
2026-11-13T15:38:07.4436983Z skipping: no hosts matched
2026-11-13T15:38:07.4442842Z 
2026-11-13T15:38:07.4443060Z PLAY [local] *******************************************************************
2026-11-13T15:38:07.4470281Z [WARNING]: Could not match supplied host pattern, ignoring: instance_stop
2026-11-13T15:38:07.4472218Z 
2026-11-13T15:38:07.4472559Z PLAY [instance_stop] ***********************************************************
2026-11-13T15:38:07.4472704Z skipping: no hosts matched
2026-11-13T15:38:07.4475412Z 
2026-11-13T15:38:07.4475563Z PLAY [machine_reboot] **********************************************************
2026-11-13T15:38:07.4475706Z skipping: no hosts matched
2026-11-13T15:38:07.4481585Z 
2026-11-13T15:38:07.4481891Z PLAY [local] *******************************************************************
2026-11-13T15:38:07.4505832Z [WARNING]: Could not match supplied host pattern, ignoring: escopo_execucao
2026-11-13T15:38:07.4509172Z 
2026-11-13T15:38:07.4509503Z PLAY [Executar o Start do Sirot Connector no escopo definido] ******************
2026-11-13T15:38:07.4509769Z skipping: no hosts matched
2026-11-13T15:38:07.4515331Z 
2026-11-13T15:38:07.4515527Z PLAY [local] *******************************************************************
2026-11-13T15:38:07.4541025Z 
2026-11-13T15:38:07.4541354Z PLAY [Executar o Stop do Sirot Connector] **************************************
2026-11-13T15:38:07.4541613Z skipping: no hosts matched
2026-11-13T15:38:07.4549912Z 
2026-11-13T15:38:07.4550103Z PLAY [Configura TSM] ***********************************************************
2026-11-13T15:38:07.4576491Z 
2026-11-13T15:38:07.4576815Z PLAY [jboss] *******************************************************************
2026-11-13T15:38:07.4603686Z 
2026-11-13T15:38:07.4604302Z PLAY [Configura Control-M] *****************************************************
2026-11-13T15:38:07.4639943Z 
2026-11-13T15:38:07.4640300Z PLAY [jboss] *******************************************************************
2026-11-13T15:38:07.4684039Z 
2026-11-13T15:38:07.4684378Z PLAY [jboss] *******************************************************************
2026-11-13T15:38:07.4730903Z 
2026-11-13T15:38:07.4731222Z PLAY [jboss] *******************************************************************
2026-11-13T15:38:07.4774018Z 
2026-11-13T15:38:07.4774353Z PLAY [jboss] *******************************************************************
2026-11-13T15:38:07.4811401Z Friday 13 November 2026  12:38:07 -0300 (0:00:00.548)       0:00:00.914 ******* 
2026-11-13T15:38:09.1342935Z 
2026-11-13T15:38:09.1343396Z TASK [Gathering Facts] *********************************************************
2026-11-13T15:38:09.1343674Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:38:09.1730276Z Friday 13 November 2026  12:38:09 -0300 (0:00:01.691)       0:00:02.606 ******* 
2026-11-13T15:38:09.2186867Z 
2026-11-13T15:38:09.2187347Z TASK [Gerando lista de secure files] *******************************************
2026-11-13T15:38:09.2187520Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:38:09.2208882Z 
2026-11-13T15:38:09.2209146Z PLAY [jboss] *******************************************************************
2026-11-13T15:38:09.2487617Z Friday 13 November 2026  12:38:09 -0300 (0:00:00.075)       0:00:02.681 ******* 
2026-11-13T15:38:09.8668147Z 
2026-11-13T15:38:09.8668817Z TASK [Gathering Facts] *********************************************************
2026-11-13T15:38:09.8669085Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:38:09.8947030Z Friday 13 November 2026  12:38:09 -0300 (0:00:00.645)       0:00:03.327 ******* 
2026-11-13T15:38:10.3178389Z 
2026-11-13T15:38:10.3179437Z TASK [Cria Diretórios em /opt/batch/] ******************************************
2026-11-13T15:38:10.3180171Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br] => (item=/opt/batch)
2026-11-13T15:38:10.5551697Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br] => (item=/opt/batch/config)
2026-11-13T15:38:10.7605022Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br] => (item=/opt/batch/deploy)
2026-11-13T15:38:10.9682944Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br] => (item=/opt/batch/securefiles)
2026-11-13T15:38:10.9949714Z Friday 13 November 2026  12:38:10 -0300 (0:00:01.100)       0:00:04.428 ******* 
2026-11-13T15:38:11.0612020Z Friday 13 November 2026  12:38:11 -0300 (0:00:00.066)       0:00:04.494 ******* 
2026-11-13T15:38:11.1340165Z included: /opt/ads-agent/_work/r19403/a/esteira-jboss-vm-v2/roles/batch/tasks/batch_deploy.yml for caddeapllx2876.agil.nprd.caixa.gov.br
2026-11-13T15:38:11.1677270Z Friday 13 November 2026  12:38:11 -0300 (0:00:00.106)       0:00:04.600 ******* 
2026-11-13T15:38:11.2241957Z 
2026-11-13T15:38:11.2242836Z TASK [Cria variáveis] **********************************************************
2026-11-13T15:38:11.2243046Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:38:11.2487442Z Friday 13 November 2026  12:38:11 -0300 (0:00:00.080)       0:00:04.681 ******* 
2026-11-13T15:38:11.6595146Z 
2026-11-13T15:38:11.6595837Z TASK [Get path of deploy] ******************************************************
2026-11-13T15:38:11.6596449Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br] => (item=http://binario.caixa:8081/repository/snapshots/br/gov/caixa/siifx/caixinhas/siifx-caixinhas-batch/0.0.181-SNAPSHOT/siifx-caixinhas-batch-0.0.181-20261113.145735-4.jar)
2026-11-13T15:38:11.6889738Z Friday 13 November 2026  12:38:11 -0300 (0:00:00.440)       0:00:05.121 ******* 
2026-11-13T15:38:11.7469137Z 
2026-11-13T15:38:11.7469606Z TASK [set package_urls] ********************************************************
2026-11-13T15:38:11.7469774Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:38:11.7789824Z Friday 13 November 2026  12:38:11 -0300 (0:00:00.090)       0:00:05.212 ******* 
2026-11-13T15:38:12.1927146Z 
2026-11-13T15:38:12.1927821Z TASK [Verifica o se package existe] ********************************************
2026-11-13T15:38:12.1928484Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r19403/a/binario/siifx-caixinhas-batch-0.0.181-20261113.145735-4.jar)
2026-11-13T15:38:12.2190224Z Friday 13 November 2026  12:38:12 -0300 (0:00:00.440)       0:00:05.652 ******* 
2026-11-13T15:38:12.8818184Z 
2026-11-13T15:38:12.8818798Z TASK [Deploy do Pacote] ********************************************************
2026-11-13T15:38:12.8819420Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r19403/a/binario/siifx-caixinhas-batch-0.0.181-20261113.145735-4.jar)
2026-11-13T15:38:12.9092792Z Friday 13 November 2026  12:38:12 -0300 (0:00:00.690)       0:00:06.342 ******* 
2026-11-13T15:38:13.1573931Z 
2026-11-13T15:38:13.1575090Z TASK [Verifica se o arquivo /producao//configuration/custom-deploy.sh existe] ***
2026-11-13T15:38:13.1575444Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:38:13.1823460Z Friday 13 November 2026  12:38:13 -0300 (0:00:00.273)       0:00:06.615 ******* 
2026-11-13T15:38:13.2477561Z Friday 13 November 2026  12:38:13 -0300 (0:00:00.065)       0:00:06.680 ******* 
2026-11-13T15:38:13.3129340Z Friday 13 November 2026  12:38:13 -0300 (0:00:00.065)       0:00:06.746 ******* 
2026-11-13T15:38:13.3784321Z included: /opt/ads-agent/_work/r19403/a/esteira-jboss-vm-v2/roles/batch/tasks/batch_logs.yml for caddeapllx2876.agil.nprd.caixa.gov.br
2026-11-13T15:38:13.4042203Z Friday 13 November 2026  12:38:13 -0300 (0:00:00.091)       0:00:06.837 ******* 
2026-11-13T15:38:13.8281677Z 
2026-11-13T15:38:13.8282195Z TASK [Criacao diretorio /logs/batch] *******************************************
2026-11-13T15:38:13.8282366Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:38:13.8312067Z 
2026-11-13T15:38:13.8312473Z PLAY [localhost] ***************************************************************
2026-11-13T15:38:13.8343849Z 
2026-11-13T15:38:13.8344122Z PLAY [jboss] *******************************************************************
2026-11-13T15:38:13.8403419Z 
2026-11-13T15:38:13.8403786Z PLAY [jboss] *******************************************************************
2026-11-13T15:38:13.8441861Z 
2026-11-13T15:38:13.8442332Z PLAY [jboss] *******************************************************************
2026-11-13T15:38:13.8478273Z 
2026-11-13T15:38:13.8480411Z PLAY RECAP *********************************************************************
2026-11-13T15:38:13.8480822Z caddeapllx2876.agil.nprd.caixa.gov.br : ok=14   changed=1    unreachable=0    failed=0    skipped=3    rescued=0    ignored=0   
2026-11-13T15:38:13.8480963Z 
2026-11-13T15:38:13.8481439Z Friday 13 November 2026  12:38:13 -0300 (0:00:00.443)       0:00:07.281 ******* 
2026-11-13T15:38:13.8481694Z =============================================================================== 
2026-11-13T15:38:13.8482001Z Gathering Facts --------------------------------------------------------- 1.69s
2026-11-13T15:38:13.8482339Z Cria Diretórios em /opt/batch/ ------------------------------------------ 1.10s
2026-11-13T15:38:13.8482648Z Deploy do Pacote -------------------------------------------------------- 0.69s
2026-11-13T15:38:13.8482953Z Gathering Facts --------------------------------------------------------- 0.65s
2026-11-13T15:38:13.8483265Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.55s
2026-11-13T15:38:13.8483567Z Criacao diretorio /logs/batch ------------------------------------------- 0.44s
2026-11-13T15:38:13.8483858Z Get path of deploy ------------------------------------------------------ 0.44s
2026-11-13T15:38:13.8484158Z Verifica o se package existe -------------------------------------------- 0.44s
2026-11-13T15:38:13.8484434Z Verifica se o arquivo /producao//configuration/custom-deploy.sh existe --- 0.27s
2026-11-13T15:38:13.8484660Z include_tasks ----------------------------------------------------------- 0.11s
2026-11-13T15:38:13.8484879Z include_tasks ----------------------------------------------------------- 0.09s
2026-11-13T15:38:13.8485104Z set package_urls -------------------------------------------------------- 0.09s
2026-11-13T15:38:13.8485417Z Cria variáveis ---------------------------------------------------------- 0.08s
2026-11-13T15:38:13.8485856Z Gerando lista de secure files ------------------------------------------- 0.08s
2026-11-13T15:38:13.8486071Z include_tasks ----------------------------------------------------------- 0.07s
2026-11-13T15:38:13.8486291Z include_tasks ----------------------------------------------------------- 0.07s
2026-11-13T15:38:13.8486519Z Executa shell customizada ----------------------------------------------- 0.07s
2026-11-13T15:38:13.8486671Z Playbook run took 0 days, 0 hours, 0 minutes, 7 seconds
2026-11-13T15:38:13.9229141Z ##[section]Finishing: Deploy Pacote


nova execução copm o scritp corrigido





2026-11-13T15:38:23.0144456Z ##[section]Starting: Configura Control-M
2026-11-13T15:38:23.0147959Z ==============================================================================
2026-11-13T15:38:23.0148038Z Task         : Bash
2026-11-13T15:38:23.0148082Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-13T15:38:23.0148157Z Version      : 3.227.0
2026-11-13T15:38:23.0148202Z Author       : Microsoft Corporation
2026-11-13T15:38:23.0148253Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-13T15:38:23.0148338Z ==============================================================================
2026-11-13T15:38:23.1301386Z Generating script.
2026-11-13T15:38:23.1312479Z ========================== Starting Command Output ===========================
2026-11-13T15:38:23.1323745Z [command]/bin/bash /opt/ads-agent/_work/_temp/df9932e9-1c15-4bb9-b551-7a8ea842aea6.sh
2026-11-13T15:38:25.3815687Z 
2026-11-13T15:38:25.3816198Z PLAY [local] *******************************************************************
2026-11-13T15:38:25.4103777Z 
2026-11-13T15:38:25.4104345Z PLAY [Configurando o DNS] ******************************************************
2026-11-13T15:38:25.5983127Z 
2026-11-13T15:38:25.5983648Z PLAY [local] *******************************************************************
2026-11-13T15:38:25.6015421Z 
2026-11-13T15:38:25.6015806Z PLAY [Verificando serviços] ****************************************************
2026-11-13T15:38:25.6112046Z 
2026-11-13T15:38:25.6112452Z PLAY [Configuração LDAP] *******************************************************
2026-11-13T15:38:25.6158330Z [WARNING]: Found variable using reserved name: when
2026-11-13T15:38:25.6164352Z 
2026-11-13T15:38:25.6164749Z PLAY [jboss] *******************************************************************
2026-11-13T15:38:25.6530755Z 
2026-11-13T15:38:25.6531286Z PLAY [Stack Jboss] *************************************************************
2026-11-13T15:38:25.6556242Z 
2026-11-13T15:38:25.6556629Z PLAY [jboss] *******************************************************************
2026-11-13T15:38:25.6600330Z 
2026-11-13T15:38:25.6600551Z PLAY [jboss] *******************************************************************
2026-11-13T15:38:25.6879430Z Friday 13 November 2026  12:38:25 -0300 (0:00:00.366)       0:00:00.366 ******* 
2026-11-13T15:38:26.1765929Z 
2026-11-13T15:38:26.1766462Z TASK [Verifica se o arquivo nfs_config.json existe] ****************************
2026-11-13T15:38:26.1766632Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:38:26.1799314Z Friday 13 November 2026  12:38:26 -0300 (0:00:00.492)       0:00:00.858 ******* 
2026-11-13T15:38:26.2279049Z included: /opt/ads-agent/_work/r19403/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for caddeapllx2876.agil.nprd.caixa.gov.br
2026-11-13T15:38:26.2323902Z Friday 13 November 2026  12:38:26 -0300 (0:00:00.052)       0:00:00.911 ******* 
2026-11-13T15:38:26.2921667Z 
2026-11-13T15:38:26.2922405Z TASK [nfs : Criar variáveis] ***************************************************
2026-11-13T15:38:26.2922603Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:38:26.2970051Z Friday 13 November 2026  12:38:26 -0300 (0:00:00.064)       0:00:00.975 ******* 
2026-11-13T15:38:26.7677521Z 
2026-11-13T15:38:26.7678253Z TASK [nfs : Coletar variáveis de ambiente] *************************************
2026-11-13T15:38:26.7678439Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:38:26.7711450Z Friday 13 November 2026  12:38:26 -0300 (0:00:00.474)       0:00:01.450 ******* 
2026-11-13T15:38:26.8155702Z Friday 13 November 2026  12:38:26 -0300 (0:00:00.044)       0:00:01.494 ******* 
2026-11-13T15:38:26.8766264Z 
2026-11-13T15:38:26.8766930Z TASK [nfs : Criar variáveis] ***************************************************
2026-11-13T15:38:26.8767107Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:38:26.8815312Z Friday 13 November 2026  12:38:26 -0300 (0:00:00.066)       0:00:01.560 ******* 
2026-11-13T15:38:31.1660560Z 
2026-11-13T15:38:31.1661517Z TASK [nfs : execute montagem script] *******************************************
2026-11-13T15:38:31.1661975Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:38:31.1698041Z Friday 13 November 2026  12:38:31 -0300 (0:00:04.288)       0:00:05.848 ******* 
2026-11-13T15:38:31.2173742Z Friday 13 November 2026  12:38:31 -0300 (0:00:00.047)       0:00:05.896 ******* 
2026-11-13T15:38:31.2810420Z 
2026-11-13T15:38:31.2811329Z TASK [nfs : Normalize NFS keys] ************************************************
2026-11-13T15:38:31.2811974Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:38:31.2840097Z Friday 13 November 2026  12:38:31 -0300 (0:00:00.066)       0:00:05.962 ******* 
2026-11-13T15:38:31.3305859Z Friday 13 November 2026  12:38:31 -0300 (0:00:00.046)       0:00:06.009 ******* 
2026-11-13T15:38:31.3766615Z Friday 13 November 2026  12:38:31 -0300 (0:00:00.046)       0:00:06.055 ******* 
2026-11-13T15:38:31.4379387Z 
2026-11-13T15:38:31.4379879Z TASK [nfs : Parse JSON data from structured value] *****************************
2026-11-13T15:38:31.4380067Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:38:31.4408528Z Friday 13 November 2026  12:38:31 -0300 (0:00:00.064)       0:00:06.119 ******* 
2026-11-13T15:38:31.4871876Z Friday 13 November 2026  12:38:31 -0300 (0:00:00.046)       0:00:06.165 ******* 
2026-11-13T15:38:31.5438461Z included: /opt/ads-agent/_work/r19403/a/esteira-jboss-vm-v2/roles/nfs/tasks/prepare_networker.yml for caddeapllx2876.agil.nprd.caixa.gov.br
2026-11-13T15:38:31.5503928Z Friday 13 November 2026  12:38:31 -0300 (0:00:00.063)       0:00:06.229 ******* 
2026-11-13T15:38:35.1240444Z 
2026-11-13T15:38:35.1241033Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-11-13T15:38:35.1244460Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-11-13T15:38:35.1245573Z caddeapllx2876.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-11-13T15:38:35.1245783Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-11-13T15:38:35.1245968Z releases. A future Ansible release will default to using the discovered 
2026-11-13T15:38:35.1246138Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-11-13T15:38:35.1246304Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-11-13T15:38:35.1246457Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-11-13T15:38:35.1246609Z setting deprecation_warnings=False in ansible.cfg.
2026-11-13T15:38:35.1246749Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:38:35.1290442Z Friday 13 November 2026  12:38:35 -0300 (0:00:03.578)       0:00:09.807 ******* 
2026-11-13T15:38:35.3887764Z 
2026-11-13T15:38:35.3888271Z TASK [nfs : Verificar lgtoclnt] ************************************************
2026-11-13T15:38:35.3888847Z [WARNING]: Consider using the yum, dnf or zypper module rather than running
2026-11-13T15:38:35.3889273Z 'rpm'.  If you need to use command because yum, dnf or zypper is insufficient
2026-11-13T15:38:35.3889520Z you can add 'warn: false' to this command task or set 'command_warnings=False'
2026-11-13T15:38:35.3889677Z in ansible.cfg to get rid of this message.
2026-11-13T15:38:35.3889818Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:38:35.3926606Z Friday 13 November 2026  12:38:35 -0300 (0:00:00.263)       0:00:10.071 ******* 
2026-11-13T15:38:35.4362516Z Friday 13 November 2026  12:38:35 -0300 (0:00:00.043)       0:00:10.114 ******* 
2026-11-13T15:38:35.6899239Z 
2026-11-13T15:38:35.6900284Z TASK [nfs : Verificar lgtonmda] ************************************************
2026-11-13T15:38:35.6900585Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:38:35.6930936Z Friday 13 November 2026  12:38:35 -0300 (0:00:00.257)       0:00:10.371 ******* 
2026-11-13T15:38:35.7390918Z Friday 13 November 2026  12:38:35 -0300 (0:00:00.045)       0:00:10.417 ******* 
2026-11-13T15:38:36.1579097Z 
2026-11-13T15:38:36.1579765Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-11-13T15:38:36.1580350Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:38:36.1614320Z Friday 13 November 2026  12:38:36 -0300 (0:00:00.422)       0:00:10.840 ******* 
2026-11-13T15:38:36.4123553Z 
2026-11-13T15:38:36.4124110Z TASK [nfs : Create a symbolic link] ********************************************
2026-11-13T15:38:36.4124275Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:38:36.4164234Z Friday 13 November 2026  12:38:36 -0300 (0:00:00.254)       0:00:11.095 ******* 
2026-11-13T15:38:37.3303351Z 
2026-11-13T15:38:37.3303871Z TASK [nfs : Networker | Ensure networker started] ******************************
2026-11-13T15:38:37.3304046Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:38:37.3348231Z Friday 13 November 2026  12:38:37 -0300 (0:00:00.918)       0:00:12.013 ******* 
2026-11-13T15:38:37.6000557Z 
2026-11-13T15:38:37.6001103Z TASK [nfs : Networker | Verificar portas configuradas] *************************
2026-11-13T15:38:37.6001279Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:38:37.6034149Z Friday 13 November 2026  12:38:37 -0300 (0:00:00.268)       0:00:12.282 ******* 
2026-11-13T15:38:37.8645088Z 
2026-11-13T15:38:37.8645698Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-11-13T15:38:37.8645880Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:38:37.8679793Z Friday 13 November 2026  12:38:37 -0300 (0:00:00.264)       0:00:12.546 ******* 
2026-11-13T15:38:37.9361893Z included: /opt/ads-agent/_work/r19403/a/esteira-jboss-vm-v2/roles/nfs/tasks/mount_nfs.yml for caddeapllx2876.agil.nprd.caixa.gov.br
2026-11-13T15:38:37.9422668Z included: /opt/ads-agent/_work/r19403/a/esteira-jboss-vm-v2/roles/nfs/tasks/mount_nfs.yml for caddeapllx2876.agil.nprd.caixa.gov.br
2026-11-13T15:38:37.9509237Z Friday 13 November 2026  12:38:37 -0300 (0:00:00.082)       0:00:12.629 ******* 
2026-11-13T15:38:38.0088022Z 
2026-11-13T15:38:38.0088685Z TASK [nfs : Parse JSON data] ***************************************************
2026-11-13T15:38:38.0088876Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:38:38.0113597Z Friday 13 November 2026  12:38:38 -0300 (0:00:00.060)       0:00:12.690 ******* 
2026-11-13T15:38:38.0541452Z Friday 13 November 2026  12:38:38 -0300 (0:00:00.042)       0:00:12.732 ******* 
2026-11-13T15:38:38.1172508Z 
2026-11-13T15:38:38.1173139Z TASK [nfs : Verificando as variaveis] ******************************************
2026-11-13T15:38:38.1173309Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br] => {
2026-11-13T15:38:38.1173444Z     "changed": false, 
2026-11-13T15:38:38.1173564Z     "msg": "All assertions passed"
2026-11-13T15:38:38.1173672Z }
2026-11-13T15:38:38.1208796Z Friday 13 November 2026  12:38:38 -0300 (0:00:00.066)       0:00:12.799 ******* 
2026-11-13T15:38:50.5656561Z 
2026-11-13T15:38:50.5657100Z TASK [nfs : Validando conectividade TCP com servidor NFS] **********************
2026-11-13T15:38:50.5657372Z fatal: [caddeapllx2876.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "elapsed": 12, "msg": "Timeout when waiting for nfsctcnprd.ctc.caixa:2049"}
2026-11-13T15:38:50.5657558Z ...ignoring
2026-11-13T15:38:50.5693179Z Friday 13 November 2026  12:38:50 -0300 (0:00:12.448)       0:00:25.248 ******* 
2026-11-13T15:38:50.6309226Z 
2026-11-13T15:38:50.6309750Z TASK [nfs : Falhar quando endpoint NFS estiver indisponivel] *******************
2026-11-13T15:38:50.6309930Z fatal: [caddeapllx2876.agil.nprd.caixa.gov.br]: FAILED! => {
2026-11-13T15:38:50.6310584Z     "assertion": "nfs_tcp_check is succeeded", 
2026-11-13T15:38:50.6310888Z     "changed": false, 
2026-11-13T15:38:50.6311007Z     "evaluated_to": false, 
2026-11-13T15:38:50.6311530Z     "msg": "Endpoint NFS indisponivel (TCP/2049) a partir de caddeapllx2876.agil.nprd.caixa.gov.br: nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH - Timeout when waiting for nfsctcnprd.ctc.caixa:2049"
2026-11-13T15:38:50.6312068Z }
2026-11-13T15:38:50.6313821Z Friday 13 November 2026  12:38:50 -0300 (0:00:00.062)       0:00:25.310 ******* 
2026-11-13T15:38:50.6323047Z 
2026-11-13T15:38:50.6323198Z PLAY RECAP *********************************************************************
2026-11-13T15:38:50.6323404Z caddeapllx2876.agil.nprd.caixa.gov.br : ok=22   changed=4    unreachable=0    failed=1    skipped=8    rescued=0    ignored=1   
2026-11-13T15:38:50.6323510Z 
2026-11-13T15:38:50.6323739Z Friday 13 November 2026  12:38:50 -0300 (0:00:00.000)       0:00:25.311 ******* 
2026-11-13T15:38:50.6323918Z =============================================================================== 
2026-11-13T15:38:50.6328411Z nfs : Validando conectividade TCP com servidor NFS --------------------- 12.45s
2026-11-13T15:38:50.6328815Z nfs : execute montagem script ------------------------------------------- 4.29s
2026-11-13T15:38:50.6329045Z nfs : Instalando o NFS Client ------------------------------------------- 3.58s
2026-11-13T15:38:50.6329286Z nfs : Networker | Ensure networker started ------------------------------ 0.92s
2026-11-13T15:38:50.6329519Z Verifica se o arquivo nfs_config.json existe ---------------------------- 0.49s
2026-11-13T15:38:50.6329744Z nfs : Coletar variáveis de ambiente ------------------------------------- 0.47s
2026-11-13T15:38:50.6329980Z nfs : Remove pacote jbcs-httpd ------------------------------------------ 0.42s
2026-11-13T15:38:50.6330207Z nfs : Networker | Verificar portas configuradas ------------------------- 0.27s
2026-11-13T15:38:50.6330442Z nfs : Executar o comando abaixo para limitar as portas ------------------ 0.26s
2026-11-13T15:38:50.6330663Z nfs : Verificar lgtoclnt ------------------------------------------------ 0.26s
2026-11-13T15:38:50.6330880Z nfs : Verificar lgtonmda ------------------------------------------------ 0.26s
2026-11-13T15:38:50.6331096Z nfs : Create a symbolic link -------------------------------------------- 0.25s
2026-11-13T15:38:50.6331322Z nfs : include_tasks ----------------------------------------------------- 0.08s
2026-11-13T15:38:50.6331543Z nfs : Normalize NFS keys ------------------------------------------------ 0.07s
2026-11-13T15:38:50.6331760Z nfs : Verificando as variaveis ------------------------------------------ 0.07s
2026-11-13T15:38:50.6331975Z nfs : Criar variáveis --------------------------------------------------- 0.07s
2026-11-13T15:38:50.6332185Z nfs : Criar variáveis --------------------------------------------------- 0.06s
2026-11-13T15:38:50.6332402Z nfs : Parse JSON data from structured value ----------------------------- 0.06s
2026-11-13T15:38:50.6332617Z nfs : include_tasks ----------------------------------------------------- 0.06s
2026-11-13T15:38:50.6332826Z nfs : Falhar quando endpoint NFS estiver indisponivel ------------------- 0.06s
2026-11-13T15:38:50.6332973Z Playbook run took 0 days, 0 hours, 0 minutes, 25 seconds
2026-11-13T15:38:50.7061697Z ##[error]Bash exited with code '2'.
2026-11-13T15:38:50.7064520Z ##[warning]RetryHelper encountered task failure, will retry (attempt #: 1 out of 2) after 1000 ms
2026-11-13T15:38:51.8100164Z Generating script.
2026-11-13T15:38:51.8115636Z ========================== Starting Command Output ===========================
2026-11-13T15:38:51.8124702Z [command]/bin/bash /opt/ads-agent/_work/_temp/8729817a-3e14-4167-95a6-e5ffeb452096.sh
2026-11-13T15:38:54.0827446Z 
2026-11-13T15:38:54.0827977Z PLAY [local] *******************************************************************
2026-11-13T15:38:54.1117110Z 
2026-11-13T15:38:54.1118146Z PLAY [Configurando o DNS] ******************************************************
2026-11-13T15:38:54.3025463Z 
2026-11-13T15:38:54.3026041Z PLAY [local] *******************************************************************
2026-11-13T15:38:54.3061628Z 
2026-11-13T15:38:54.3062020Z PLAY [Verificando serviços] ****************************************************
2026-11-13T15:38:54.3158387Z 
2026-11-13T15:38:54.3158848Z PLAY [Configuração LDAP] *******************************************************
2026-11-13T15:38:54.3205276Z [WARNING]: Found variable using reserved name: when
2026-11-13T15:38:54.3210512Z 
2026-11-13T15:38:54.3211170Z PLAY [jboss] *******************************************************************
2026-11-13T15:38:54.3598328Z 
2026-11-13T15:38:54.3598796Z PLAY [Stack Jboss] *************************************************************
2026-11-13T15:38:54.3623474Z 
2026-11-13T15:38:54.3623624Z PLAY [jboss] *******************************************************************
2026-11-13T15:38:54.3668608Z 
2026-11-13T15:38:54.3669038Z PLAY [jboss] *******************************************************************
2026-11-13T15:38:54.3951296Z Friday 13 November 2026  12:38:54 -0300 (0:00:00.372)       0:00:00.372 ******* 
2026-11-13T15:38:54.9098116Z 
2026-11-13T15:38:54.9098625Z TASK [Verifica se o arquivo nfs_config.json existe] ****************************
2026-11-13T15:38:54.9098777Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:38:54.9137705Z Friday 13 November 2026  12:38:54 -0300 (0:00:00.518)       0:00:00.891 ******* 
2026-11-13T15:38:54.9624721Z included: /opt/ads-agent/_work/r19403/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for caddeapllx2876.agil.nprd.caixa.gov.br
2026-11-13T15:38:54.9677990Z Friday 13 November 2026  12:38:54 -0300 (0:00:00.053)       0:00:00.945 ******* 
2026-11-13T15:38:55.0280518Z 
2026-11-13T15:38:55.0281225Z TASK [nfs : Criar variáveis] ***************************************************
2026-11-13T15:38:55.0281395Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:38:55.0332317Z Friday 13 November 2026  12:38:55 -0300 (0:00:00.065)       0:00:01.011 ******* 
2026-11-13T15:38:55.4969015Z 
2026-11-13T15:38:55.4970171Z TASK [nfs : Coletar variáveis de ambiente] *************************************
2026-11-13T15:38:55.4970379Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:38:55.5003753Z Friday 13 November 2026  12:38:55 -0300 (0:00:00.467)       0:00:01.478 ******* 
2026-11-13T15:38:55.5482455Z Friday 13 November 2026  12:38:55 -0300 (0:00:00.047)       0:00:01.525 ******* 
2026-11-13T15:38:55.6118007Z 
2026-11-13T15:38:55.6118933Z TASK [nfs : Criar variáveis] ***************************************************
2026-11-13T15:38:55.6119219Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:38:55.6169723Z Friday 13 November 2026  12:38:55 -0300 (0:00:00.068)       0:00:01.594 ******* 
2026-11-13T15:38:59.4139037Z 
2026-11-13T15:38:59.4139599Z TASK [nfs : execute montagem script] *******************************************
2026-11-13T15:38:59.4139773Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:38:59.4178210Z Friday 13 November 2026  12:38:59 -0300 (0:00:03.801)       0:00:05.395 ******* 
2026-11-13T15:38:59.4646108Z Friday 13 November 2026  12:38:59 -0300 (0:00:00.046)       0:00:05.442 ******* 
2026-11-13T15:38:59.5260515Z 
2026-11-13T15:38:59.5261397Z TASK [nfs : Normalize NFS keys] ************************************************
2026-11-13T15:38:59.5261675Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:38:59.5292623Z Friday 13 November 2026  12:38:59 -0300 (0:00:00.064)       0:00:05.507 ******* 
2026-11-13T15:38:59.5759738Z Friday 13 November 2026  12:38:59 -0300 (0:00:00.046)       0:00:05.553 ******* 
2026-11-13T15:38:59.6223365Z Friday 13 November 2026  12:38:59 -0300 (0:00:00.046)       0:00:05.599 ******* 
2026-11-13T15:38:59.6843609Z 
2026-11-13T15:38:59.6844146Z TASK [nfs : Parse JSON data from structured value] *****************************
2026-11-13T15:38:59.6844317Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:38:59.6874606Z Friday 13 November 2026  12:38:59 -0300 (0:00:00.065)       0:00:05.665 ******* 
2026-11-13T15:38:59.7337306Z Friday 13 November 2026  12:38:59 -0300 (0:00:00.046)       0:00:05.711 ******* 
2026-11-13T15:38:59.7902801Z included: /opt/ads-agent/_work/r19403/a/esteira-jboss-vm-v2/roles/nfs/tasks/prepare_networker.yml for caddeapllx2876.agil.nprd.caixa.gov.br
2026-11-13T15:38:59.7962589Z Friday 13 November 2026  12:38:59 -0300 (0:00:00.062)       0:00:05.774 ******* 
2026-11-13T15:39:03.3306609Z 
2026-11-13T15:39:03.3307557Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-11-13T15:39:03.3308953Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-11-13T15:39:03.3309408Z caddeapllx2876.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-11-13T15:39:03.3309652Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-11-13T15:39:03.3309806Z releases. A future Ansible release will default to using the discovered 
2026-11-13T15:39:03.3309976Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-11-13T15:39:03.3310144Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-11-13T15:39:03.3310305Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-11-13T15:39:03.3310455Z setting deprecation_warnings=False in ansible.cfg.
2026-11-13T15:39:03.3310603Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:39:03.3342107Z Friday 13 November 2026  12:39:03 -0300 (0:00:03.537)       0:00:09.312 ******* 
2026-11-13T15:39:03.5993030Z 
2026-11-13T15:39:03.5993565Z TASK [nfs : Verificar lgtoclnt] ************************************************
2026-11-13T15:39:03.5993738Z [WARNING]: Consider using the yum, dnf or zypper module rather than running
2026-11-13T15:39:03.5994095Z 'rpm'.  If you need to use command because yum, dnf or zypper is insufficient
2026-11-13T15:39:03.5994333Z you can add 'warn: false' to this command task or set 'command_warnings=False'
2026-11-13T15:39:03.5994488Z in ansible.cfg to get rid of this message.
2026-11-13T15:39:03.5994628Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:39:03.6032599Z Friday 13 November 2026  12:39:03 -0300 (0:00:00.268)       0:00:09.581 ******* 
2026-11-13T15:39:03.6466600Z Friday 13 November 2026  12:39:03 -0300 (0:00:00.043)       0:00:09.624 ******* 
2026-11-13T15:39:03.9086756Z 
2026-11-13T15:39:03.9087757Z TASK [nfs : Verificar lgtonmda] ************************************************
2026-11-13T15:39:03.9087996Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:39:03.9124556Z Friday 13 November 2026  12:39:03 -0300 (0:00:00.266)       0:00:09.890 ******* 
2026-11-13T15:39:03.9563696Z Friday 13 November 2026  12:39:03 -0300 (0:00:00.043)       0:00:09.933 ******* 
2026-11-13T15:39:04.3752867Z 
2026-11-13T15:39:04.3753562Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-11-13T15:39:04.3753735Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:39:04.3784807Z Friday 13 November 2026  12:39:04 -0300 (0:00:00.422)       0:00:10.356 ******* 
2026-11-13T15:39:04.6319439Z 
2026-11-13T15:39:04.6319991Z TASK [nfs : Create a symbolic link] ********************************************
2026-11-13T15:39:04.6320299Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:39:04.6356991Z Friday 13 November 2026  12:39:04 -0300 (0:00:00.257)       0:00:10.613 ******* 
2026-11-13T15:39:05.5440725Z 
2026-11-13T15:39:05.5441268Z TASK [nfs : Networker | Ensure networker started] ******************************
2026-11-13T15:39:05.5441456Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:39:05.5486573Z Friday 13 November 2026  12:39:05 -0300 (0:00:00.912)       0:00:11.526 ******* 
2026-11-13T15:39:05.8122682Z 
2026-11-13T15:39:05.8123528Z TASK [nfs : Networker | Verificar portas configuradas] *************************
2026-11-13T15:39:05.8123741Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:39:05.8158638Z Friday 13 November 2026  12:39:05 -0300 (0:00:00.267)       0:00:11.793 ******* 
2026-11-13T15:39:06.0803793Z 
2026-11-13T15:39:06.0804314Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-11-13T15:39:06.0804486Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:39:06.0837196Z Friday 13 November 2026  12:39:06 -0300 (0:00:00.267)       0:00:12.061 ******* 
2026-11-13T15:39:06.1510538Z included: /opt/ads-agent/_work/r19403/a/esteira-jboss-vm-v2/roles/nfs/tasks/mount_nfs.yml for caddeapllx2876.agil.nprd.caixa.gov.br
2026-11-13T15:39:06.1571624Z included: /opt/ads-agent/_work/r19403/a/esteira-jboss-vm-v2/roles/nfs/tasks/mount_nfs.yml for caddeapllx2876.agil.nprd.caixa.gov.br
2026-11-13T15:39:06.1653089Z Friday 13 November 2026  12:39:06 -0300 (0:00:00.081)       0:00:12.143 ******* 
2026-11-13T15:39:06.2244791Z 
2026-11-13T15:39:06.2245417Z TASK [nfs : Parse JSON data] ***************************************************
2026-11-13T15:39:06.2245595Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:39:06.2276775Z Friday 13 November 2026  12:39:06 -0300 (0:00:00.062)       0:00:12.205 ******* 
2026-11-13T15:39:06.2704787Z Friday 13 November 2026  12:39:06 -0300 (0:00:00.042)       0:00:12.248 ******* 
2026-11-13T15:39:06.3330768Z 
2026-11-13T15:39:06.3331275Z TASK [nfs : Verificando as variaveis] ******************************************
2026-11-13T15:39:06.3331486Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br] => {
2026-11-13T15:39:06.3331615Z     "changed": false, 
2026-11-13T15:39:06.3331746Z     "msg": "All assertions passed"
2026-11-13T15:39:06.3331851Z }
2026-11-13T15:39:06.3364901Z Friday 13 November 2026  12:39:06 -0300 (0:00:00.066)       0:00:12.314 ******* 
2026-11-13T15:39:18.7791433Z 
2026-11-13T15:39:18.7791979Z TASK [nfs : Validando conectividade TCP com servidor NFS] **********************
2026-11-13T15:39:18.7792216Z fatal: [caddeapllx2876.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "elapsed": 12, "msg": "Timeout when waiting for nfsctcnprd.ctc.caixa:2049"}
2026-11-13T15:39:18.7792403Z ...ignoring
2026-11-13T15:39:18.7828011Z Friday 13 November 2026  12:39:18 -0300 (0:00:12.446)       0:00:24.760 ******* 
2026-11-13T15:39:18.8460963Z 
2026-11-13T15:39:18.8461489Z TASK [nfs : Falhar quando endpoint NFS estiver indisponivel] *******************
2026-11-13T15:39:18.8461669Z fatal: [caddeapllx2876.agil.nprd.caixa.gov.br]: FAILED! => {
2026-11-13T15:39:18.8461847Z     "assertion": "nfs_tcp_check is succeeded", 
2026-11-13T15:39:18.8461976Z     "changed": false, 
2026-11-13T15:39:18.8462092Z     "evaluated_to": false, 
2026-11-13T15:39:18.8462603Z     "msg": "Endpoint NFS indisponivel (TCP/2049) a partir de caddeapllx2876.agil.nprd.caixa.gov.br: nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH - Timeout when waiting for nfsctcnprd.ctc.caixa:2049"
2026-11-13T15:39:18.8462819Z }
2026-11-13T15:39:18.8465044Z Friday 13 November 2026  12:39:18 -0300 (0:00:00.063)       0:00:24.824 ******* 
2026-11-13T15:39:18.8472812Z 
2026-11-13T15:39:18.8473641Z PLAY RECAP *********************************************************************
2026-11-13T15:39:18.8473914Z caddeapllx2876.agil.nprd.caixa.gov.br : ok=22   changed=4    unreachable=0    failed=1    skipped=8    rescued=0    ignored=1   
2026-11-13T15:39:18.8474022Z 
2026-11-13T15:39:18.8474346Z Friday 13 November 2026  12:39:18 -0300 (0:00:00.000)       0:00:24.825 ******* 
2026-11-13T15:39:18.8474546Z =============================================================================== 
2026-11-13T15:39:18.8478148Z nfs : Validando conectividade TCP com servidor NFS --------------------- 12.45s
2026-11-13T15:39:18.8478832Z nfs : execute montagem script ------------------------------------------- 3.80s
2026-11-13T15:39:18.8479208Z nfs : Instalando o NFS Client ------------------------------------------- 3.54s
2026-11-13T15:39:18.8479524Z nfs : Networker | Ensure networker started ------------------------------ 0.91s
2026-11-13T15:39:18.8479888Z Verifica se o arquivo nfs_config.json existe ---------------------------- 0.52s
2026-11-13T15:39:18.8480194Z nfs : Coletar variáveis de ambiente ------------------------------------- 0.47s
2026-11-13T15:39:18.8480426Z nfs : Remove pacote jbcs-httpd ------------------------------------------ 0.42s
2026-11-13T15:39:18.8480652Z nfs : Verificar lgtoclnt ------------------------------------------------ 0.27s
2026-11-13T15:39:18.8480874Z nfs : Executar o comando abaixo para limitar as portas ------------------ 0.27s
2026-11-13T15:39:18.8481364Z nfs : Networker | Verificar portas configuradas ------------------------- 0.27s
2026-11-13T15:39:18.8481685Z nfs : Verificar lgtonmda ------------------------------------------------ 0.27s
2026-11-13T15:39:18.8481906Z nfs : Create a symbolic link -------------------------------------------- 0.26s
2026-11-13T15:39:18.8482126Z nfs : include_tasks ----------------------------------------------------- 0.08s
2026-11-13T15:39:18.8482346Z nfs : Criar variáveis --------------------------------------------------- 0.07s
2026-11-13T15:39:18.8482570Z nfs : Verificando as variaveis ------------------------------------------ 0.07s
2026-11-13T15:39:18.8482786Z nfs : Criar variáveis --------------------------------------------------- 0.07s
2026-11-13T15:39:18.8483008Z nfs : Parse JSON data from structured value ----------------------------- 0.07s
2026-11-13T15:39:18.8483227Z nfs : Normalize NFS keys ------------------------------------------------ 0.06s
2026-11-13T15:39:18.8483450Z nfs : Falhar quando endpoint NFS estiver indisponivel ------------------- 0.06s
2026-11-13T15:39:18.8483663Z nfs : include_tasks ----------------------------------------------------- 0.06s
2026-11-13T15:39:18.8483812Z Playbook run took 0 days, 0 hours, 0 minutes, 24 seconds
2026-11-13T15:39:18.9166391Z ##[error]Bash exited with code '2'.
2026-11-13T15:39:18.9203731Z ##[warning]RetryHelper encountered task failure, will retry (attempt #: 2 out of 2) after 4000 ms
2026-11-13T15:39:23.0062331Z Generating script.
2026-11-13T15:39:23.0074551Z ========================== Starting Command Output ===========================
2026-11-13T15:39:23.0081735Z [command]/bin/bash /opt/ads-agent/_work/_temp/5eae9afe-d052-4b50-acc5-262d01fe83f7.sh
2026-11-13T15:39:25.2682235Z 
2026-11-13T15:39:25.2683753Z PLAY [local] *******************************************************************
2026-11-13T15:39:25.2974507Z 
2026-11-13T15:39:25.2975043Z PLAY [Configurando o DNS] ******************************************************
2026-11-13T15:39:25.4973455Z 
2026-11-13T15:39:25.4973987Z PLAY [local] *******************************************************************
2026-11-13T15:39:25.5011935Z 
2026-11-13T15:39:25.5012717Z PLAY [Verificando serviços] ****************************************************
2026-11-13T15:39:25.5108723Z 
2026-11-13T15:39:25.5109182Z PLAY [Configuração LDAP] *******************************************************
2026-11-13T15:39:25.5154401Z [WARNING]: Found variable using reserved name: when
2026-11-13T15:39:25.5160470Z 
2026-11-13T15:39:25.5160625Z PLAY [jboss] *******************************************************************
2026-11-13T15:39:25.5544502Z 
2026-11-13T15:39:25.5545088Z PLAY [Stack Jboss] *************************************************************
2026-11-13T15:39:25.5569895Z 
2026-11-13T15:39:25.5570094Z PLAY [jboss] *******************************************************************
2026-11-13T15:39:25.5614814Z 
2026-11-13T15:39:25.5615095Z PLAY [jboss] *******************************************************************
2026-11-13T15:39:25.5899220Z Friday 13 November 2026  12:39:25 -0300 (0:00:00.382)       0:00:00.382 ******* 
2026-11-13T15:39:26.0615980Z 
2026-11-13T15:39:26.0616399Z TASK [Verifica se o arquivo nfs_config.json existe] ****************************
2026-11-13T15:39:26.0616574Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:39:26.0650671Z Friday 13 November 2026  12:39:26 -0300 (0:00:00.475)       0:00:00.858 ******* 
2026-11-13T15:39:26.1131765Z included: /opt/ads-agent/_work/r19403/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for caddeapllx2876.agil.nprd.caixa.gov.br
2026-11-13T15:39:26.1179515Z Friday 13 November 2026  12:39:26 -0300 (0:00:00.052)       0:00:00.911 ******* 
2026-11-13T15:39:26.1777268Z 
2026-11-13T15:39:26.1777989Z TASK [nfs : Criar variáveis] ***************************************************
2026-11-13T15:39:26.1778161Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:39:26.1822302Z Friday 13 November 2026  12:39:26 -0300 (0:00:00.064)       0:00:00.975 ******* 
2026-11-13T15:39:26.6744435Z 
2026-11-13T15:39:26.6745532Z TASK [nfs : Coletar variáveis de ambiente] *************************************
2026-11-13T15:39:26.6745761Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:39:26.6780245Z Friday 13 November 2026  12:39:26 -0300 (0:00:00.495)       0:00:01.471 ******* 
2026-11-13T15:39:26.7227657Z Friday 13 November 2026  12:39:26 -0300 (0:00:00.044)       0:00:01.515 ******* 
2026-11-13T15:39:26.7831133Z 
2026-11-13T15:39:26.7831757Z TASK [nfs : Criar variáveis] ***************************************************
2026-11-13T15:39:26.7831931Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:39:26.7881396Z Friday 13 November 2026  12:39:26 -0300 (0:00:00.065)       0:00:01.581 ******* 
2026-11-13T15:39:31.7717157Z 
2026-11-13T15:39:31.7717707Z TASK [nfs : execute montagem script] *******************************************
2026-11-13T15:39:31.7717877Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:39:31.7752539Z Friday 13 November 2026  12:39:31 -0300 (0:00:04.987)       0:00:06.568 ******* 
2026-11-13T15:39:31.8218182Z Friday 13 November 2026  12:39:31 -0300 (0:00:00.046)       0:00:06.614 ******* 
2026-11-13T15:39:31.8848350Z 
2026-11-13T15:39:31.8848869Z TASK [nfs : Normalize NFS keys] ************************************************
2026-11-13T15:39:31.8849030Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:39:31.8880650Z Friday 13 November 2026  12:39:31 -0300 (0:00:00.066)       0:00:06.681 ******* 
2026-11-13T15:39:31.9355949Z Friday 13 November 2026  12:39:31 -0300 (0:00:00.047)       0:00:06.728 ******* 
2026-11-13T15:39:31.9833350Z Friday 13 November 2026  12:39:31 -0300 (0:00:00.047)       0:00:06.776 ******* 
2026-11-13T15:39:32.0454023Z 
2026-11-13T15:39:32.0454501Z TASK [nfs : Parse JSON data from structured value] *****************************
2026-11-13T15:39:32.0454713Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:39:32.0485648Z Friday 13 November 2026  12:39:32 -0300 (0:00:00.065)       0:00:06.841 ******* 
2026-11-13T15:39:32.0958552Z Friday 13 November 2026  12:39:32 -0300 (0:00:00.047)       0:00:06.888 ******* 
2026-11-13T15:39:32.1539933Z included: /opt/ads-agent/_work/r19403/a/esteira-jboss-vm-v2/roles/nfs/tasks/prepare_networker.yml for caddeapllx2876.agil.nprd.caixa.gov.br
2026-11-13T15:39:32.1602431Z Friday 13 November 2026  12:39:32 -0300 (0:00:00.064)       0:00:06.953 ******* 
2026-11-13T15:39:35.7038143Z 
2026-11-13T15:39:35.7040345Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-11-13T15:39:35.7046927Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-11-13T15:39:35.7047352Z caddeapllx2876.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-11-13T15:39:35.7047574Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-11-13T15:39:35.7047751Z releases. A future Ansible release will default to using the discovered 
2026-11-13T15:39:35.7047926Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-11-13T15:39:35.7048091Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-11-13T15:39:35.7048264Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-11-13T15:39:35.7048417Z setting deprecation_warnings=False in ansible.cfg.
2026-11-13T15:39:35.7048712Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:39:35.7074952Z Friday 13 November 2026  12:39:35 -0300 (0:00:03.547)       0:00:10.500 ******* 
2026-11-13T15:39:35.9599938Z 
2026-11-13T15:39:35.9601237Z TASK [nfs : Verificar lgtoclnt] ************************************************
2026-11-13T15:39:35.9601519Z [WARNING]: Consider using the yum, dnf or zypper module rather than running
2026-11-13T15:39:35.9601986Z 'rpm'.  If you need to use command because yum, dnf or zypper is insufficient
2026-11-13T15:39:35.9602317Z you can add 'warn: false' to this command task or set 'command_warnings=False'
2026-11-13T15:39:35.9602811Z in ansible.cfg to get rid of this message.
2026-11-13T15:39:35.9602952Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:39:35.9640349Z Friday 13 November 2026  12:39:35 -0300 (0:00:00.256)       0:00:10.757 ******* 
2026-11-13T15:39:36.0079949Z Friday 13 November 2026  12:39:36 -0300 (0:00:00.043)       0:00:10.800 ******* 
2026-11-13T15:39:36.2605908Z 
2026-11-13T15:39:36.2606817Z TASK [nfs : Verificar lgtonmda] ************************************************
2026-11-13T15:39:36.2607078Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:39:36.2645612Z Friday 13 November 2026  12:39:36 -0300 (0:00:00.256)       0:00:11.057 ******* 
2026-11-13T15:39:36.3091648Z Friday 13 November 2026  12:39:36 -0300 (0:00:00.044)       0:00:11.102 ******* 
2026-11-13T15:39:36.7268714Z 
2026-11-13T15:39:36.7269452Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-11-13T15:39:36.7269627Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:39:36.7301738Z Friday 13 November 2026  12:39:36 -0300 (0:00:00.421)       0:00:11.523 ******* 
2026-11-13T15:39:36.9843936Z 
2026-11-13T15:39:36.9844452Z TASK [nfs : Create a symbolic link] ********************************************
2026-11-13T15:39:36.9844635Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:39:36.9883147Z Friday 13 November 2026  12:39:36 -0300 (0:00:00.258)       0:00:11.781 ******* 
2026-11-13T15:39:37.8961058Z 
2026-11-13T15:39:37.8961644Z TASK [nfs : Networker | Ensure networker started] ******************************
2026-11-13T15:39:37.8961810Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:39:37.9005660Z Friday 13 November 2026  12:39:37 -0300 (0:00:00.912)       0:00:12.693 ******* 
2026-11-13T15:39:38.1632618Z 
2026-11-13T15:39:38.1633108Z TASK [nfs : Networker | Verificar portas configuradas] *************************
2026-11-13T15:39:38.1633271Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:39:38.1670074Z Friday 13 November 2026  12:39:38 -0300 (0:00:00.266)       0:00:12.960 ******* 
2026-11-13T15:39:38.4265556Z 
2026-11-13T15:39:38.4266107Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-11-13T15:39:38.4266300Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:39:38.4298722Z Friday 13 November 2026  12:39:38 -0300 (0:00:00.262)       0:00:13.223 ******* 
2026-11-13T15:39:38.4969217Z included: /opt/ads-agent/_work/r19403/a/esteira-jboss-vm-v2/roles/nfs/tasks/mount_nfs.yml for caddeapllx2876.agil.nprd.caixa.gov.br
2026-11-13T15:39:38.5031826Z included: /opt/ads-agent/_work/r19403/a/esteira-jboss-vm-v2/roles/nfs/tasks/mount_nfs.yml for caddeapllx2876.agil.nprd.caixa.gov.br
2026-11-13T15:39:38.5120033Z Friday 13 November 2026  12:39:38 -0300 (0:00:00.082)       0:00:13.305 ******* 
2026-11-13T15:39:38.5707880Z 
2026-11-13T15:39:38.5708381Z TASK [nfs : Parse JSON data] ***************************************************
2026-11-13T15:39:38.5708536Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:39:38.5739236Z Friday 13 November 2026  12:39:38 -0300 (0:00:00.061)       0:00:13.367 ******* 
2026-11-13T15:39:38.6184506Z Friday 13 November 2026  12:39:38 -0300 (0:00:00.044)       0:00:13.411 ******* 
2026-11-13T15:39:38.6825372Z 
2026-11-13T15:39:38.6825793Z TASK [nfs : Verificando as variaveis] ******************************************
2026-11-13T15:39:38.6825973Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br] => {
2026-11-13T15:39:38.6826100Z     "changed": false, 
2026-11-13T15:39:38.6826217Z     "msg": "All assertions passed"
2026-11-13T15:39:38.6826319Z }
2026-11-13T15:39:38.6859907Z Friday 13 November 2026  12:39:38 -0300 (0:00:00.067)       0:00:13.479 ******* 
2026-11-13T15:39:51.1169874Z 
2026-11-13T15:39:51.1170519Z TASK [nfs : Validando conectividade TCP com servidor NFS] **********************
2026-11-13T15:39:51.1170920Z fatal: [caddeapllx2876.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "elapsed": 12, "msg": "Timeout when waiting for nfsctcnprd.ctc.caixa:2049"}
2026-11-13T15:39:51.1171547Z ...ignoring
2026-11-13T15:39:51.1206067Z Friday 13 November 2026  12:39:51 -0300 (0:00:12.434)       0:00:25.913 ******* 
2026-11-13T15:39:51.1798708Z 
2026-11-13T15:39:51.1799124Z TASK [nfs : Falhar quando endpoint NFS estiver indisponivel] *******************
2026-11-13T15:39:51.1799301Z fatal: [caddeapllx2876.agil.nprd.caixa.gov.br]: FAILED! => {
2026-11-13T15:39:51.1799461Z     "assertion": "nfs_tcp_check is succeeded", 
2026-11-13T15:39:51.1799582Z     "changed": false, 
2026-11-13T15:39:51.1799697Z     "evaluated_to": false, 
2026-11-13T15:39:51.1800190Z     "msg": "Endpoint NFS indisponivel (TCP/2049) a partir de caddeapllx2876.agil.nprd.caixa.gov.br: nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH - Timeout when waiting for nfsctcnprd.ctc.caixa:2049"
2026-11-13T15:39:51.1805194Z }
2026-11-13T15:39:51.1806099Z Friday 13 November 2026  12:39:51 -0300 (0:00:00.059)       0:00:25.973 ******* 
2026-11-13T15:39:51.1810565Z 
2026-11-13T15:39:51.1811345Z PLAY RECAP *********************************************************************
2026-11-13T15:39:51.1811574Z caddeapllx2876.agil.nprd.caixa.gov.br : ok=22   changed=4    unreachable=0    failed=1    skipped=8    rescued=0    ignored=1   
2026-11-13T15:39:51.1811729Z 
2026-11-13T15:39:51.1812020Z Friday 13 November 2026  12:39:51 -0300 (0:00:00.000)       0:00:25.974 ******* 
2026-11-13T15:39:51.1812190Z =============================================================================== 
2026-11-13T15:39:51.1815803Z nfs : Validando conectividade TCP com servidor NFS --------------------- 12.43s
2026-11-13T15:39:51.1816047Z nfs : execute montagem script ------------------------------------------- 4.99s
2026-11-13T15:39:51.1816284Z nfs : Instalando o NFS Client ------------------------------------------- 3.55s
2026-11-13T15:39:51.1816516Z nfs : Networker | Ensure networker started ------------------------------ 0.91s
2026-11-13T15:39:51.1816764Z nfs : Coletar variáveis de ambiente ------------------------------------- 0.50s
2026-11-13T15:39:51.1817007Z Verifica se o arquivo nfs_config.json existe ---------------------------- 0.48s
2026-11-13T15:39:51.1817243Z nfs : Remove pacote jbcs-httpd ------------------------------------------ 0.42s
2026-11-13T15:39:51.1817470Z nfs : Networker | Verificar portas configuradas ------------------------- 0.27s
2026-11-13T15:39:51.1817697Z nfs : Executar o comando abaixo para limitar as portas ------------------ 0.26s
2026-11-13T15:39:51.1817921Z nfs : Create a symbolic link -------------------------------------------- 0.26s
2026-11-13T15:39:51.1818146Z nfs : Verificar lgtonmda ------------------------------------------------ 0.26s
2026-11-13T15:39:51.1818367Z nfs : Verificar lgtoclnt ------------------------------------------------ 0.26s
2026-11-13T15:39:51.1818587Z nfs : include_tasks ----------------------------------------------------- 0.08s
2026-11-13T15:39:51.1818812Z nfs : Verificando as variaveis ------------------------------------------ 0.07s
2026-11-13T15:39:51.1819039Z nfs : Normalize NFS keys ------------------------------------------------ 0.07s
2026-11-13T15:39:51.1819263Z nfs : Criar variáveis --------------------------------------------------- 0.07s
2026-11-13T15:39:51.1819483Z nfs : Parse JSON data from structured value ----------------------------- 0.07s
2026-11-13T15:39:51.1819707Z nfs : include_tasks ----------------------------------------------------- 0.06s
2026-11-13T15:39:51.1819927Z nfs : Criar variáveis --------------------------------------------------- 0.06s
2026-11-13T15:39:51.1820148Z nfs : Parse JSON data --------------------------------------------------- 0.06s
2026-11-13T15:39:51.1820299Z Playbook run took 0 days, 0 hours, 0 minutes, 25 seconds
2026-11-13T15:39:51.2464109Z ##[error]Bash exited with code '2'.
2026-11-13T15:39:51.2508066Z ##[section]Finishing: Configura Control-M



queboru aqui mais acho que é um erro diferente 
