2026-11-13T15:45:30.1627072Z ##[section]Starting: Configura Control-M
2026-11-13T15:45:30.1631963Z ==============================================================================
2026-11-13T15:45:30.1632060Z Task         : Bash
2026-11-13T15:45:30.1632104Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-13T15:45:30.1632167Z Version      : 3.227.0
2026-11-13T15:45:30.1632322Z Author       : Microsoft Corporation
2026-11-13T15:45:30.1632378Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-13T15:45:30.1632453Z ==============================================================================
2026-11-13T15:45:30.2783198Z Generating script.
2026-11-13T15:45:30.2793925Z ========================== Starting Command Output ===========================
2026-11-13T15:45:30.2806924Z [command]/bin/bash /opt/ads-agent/_work/_temp/f4f73d2c-e479-45cd-bb5f-4bd06e2c9ba1.sh
2026-11-13T15:45:32.5448030Z 
2026-11-13T15:45:32.5448696Z PLAY [local] *******************************************************************
2026-11-13T15:45:32.5740904Z 
2026-11-13T15:45:32.5741435Z PLAY [Configurando o DNS] ******************************************************
2026-11-13T15:45:32.7618377Z 
2026-11-13T15:45:32.7618919Z PLAY [local] *******************************************************************
2026-11-13T15:45:32.7654874Z 
2026-11-13T15:45:32.7655724Z PLAY [Verificando serviços] ****************************************************
2026-11-13T15:45:32.7751198Z 
2026-11-13T15:45:32.7751633Z PLAY [Configuração LDAP] *******************************************************
2026-11-13T15:45:32.7796220Z [WARNING]: Found variable using reserved name: when
2026-11-13T15:45:32.7801694Z 
2026-11-13T15:45:32.7801867Z PLAY [jboss] *******************************************************************
2026-11-13T15:45:32.8194592Z 
2026-11-13T15:45:32.8195469Z PLAY [Stack Jboss] *************************************************************
2026-11-13T15:45:32.8220505Z 
2026-11-13T15:45:32.8220722Z PLAY [jboss] *******************************************************************
2026-11-13T15:45:32.8265638Z 
2026-11-13T15:45:32.8265860Z PLAY [jboss] *******************************************************************
2026-11-13T15:45:32.8547349Z Friday 13 November 2026  12:45:32 -0300 (0:00:00.370)       0:00:00.370 ******* 
2026-11-13T15:45:33.3351642Z 
2026-11-13T15:45:33.3354618Z TASK [Verifica se o arquivo nfs_config.json existe] ****************************
2026-11-13T15:45:33.3357106Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:45:33.3385780Z Friday 13 November 2026  12:45:33 -0300 (0:00:00.484)       0:00:00.854 ******* 
2026-11-13T15:45:33.3925115Z included: /opt/ads-agent/_work/r19403/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for caddeapllx2876.agil.nprd.caixa.gov.br
2026-11-13T15:45:33.3971557Z Friday 13 November 2026  12:45:33 -0300 (0:00:00.058)       0:00:00.913 ******* 
2026-11-13T15:45:33.4660884Z 
2026-11-13T15:45:33.4661659Z TASK [nfs : Criar variáveis] ***************************************************
2026-11-13T15:45:33.4661856Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:45:33.4711884Z Friday 13 November 2026  12:45:33 -0300 (0:00:00.073)       0:00:00.987 ******* 
2026-11-13T15:45:33.9351305Z 
2026-11-13T15:45:33.9352046Z TASK [nfs : Coletar variáveis de ambiente] *************************************
2026-11-13T15:45:33.9352229Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:45:33.9385616Z Friday 13 November 2026  12:45:33 -0300 (0:00:00.467)       0:00:01.454 ******* 
2026-11-13T15:45:33.9830339Z Friday 13 November 2026  12:45:33 -0300 (0:00:00.044)       0:00:01.498 ******* 
2026-11-13T15:45:34.0437334Z 
2026-11-13T15:45:34.0438039Z TASK [nfs : Criar variáveis] ***************************************************
2026-11-13T15:45:34.0438213Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:45:34.0486487Z Friday 13 November 2026  12:45:34 -0300 (0:00:00.065)       0:00:01.564 ******* 
2026-11-13T15:45:38.1660659Z 
2026-11-13T15:45:38.1661202Z TASK [nfs : execute montagem script] *******************************************
2026-11-13T15:45:38.1661603Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:45:38.1697315Z Friday 13 November 2026  12:45:38 -0300 (0:00:04.121)       0:00:05.685 ******* 
2026-11-13T15:45:38.2162213Z Friday 13 November 2026  12:45:38 -0300 (0:00:00.046)       0:00:05.732 ******* 
2026-11-13T15:45:38.2780377Z 
2026-11-13T15:45:38.2780883Z TASK [nfs : Normalize NFS keys] ************************************************
2026-11-13T15:45:38.2781051Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:45:38.2814037Z Friday 13 November 2026  12:45:38 -0300 (0:00:00.065)       0:00:05.797 ******* 
2026-11-13T15:45:38.3275929Z Friday 13 November 2026  12:45:38 -0300 (0:00:00.045)       0:00:05.843 ******* 
2026-11-13T15:45:38.3739136Z Friday 13 November 2026  12:45:38 -0300 (0:00:00.046)       0:00:05.889 ******* 
2026-11-13T15:45:38.4357798Z 
2026-11-13T15:45:38.4358254Z TASK [nfs : Parse JSON data from structured value] *****************************
2026-11-13T15:45:38.4358442Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:45:38.4389089Z Friday 13 November 2026  12:45:38 -0300 (0:00:00.065)       0:00:05.955 ******* 
2026-11-13T15:45:38.4866708Z Friday 13 November 2026  12:45:38 -0300 (0:00:00.047)       0:00:06.002 ******* 
2026-11-13T15:45:38.5430867Z included: /opt/ads-agent/_work/r19403/a/esteira-jboss-vm-v2/roles/nfs/tasks/prepare_networker.yml for caddeapllx2876.agil.nprd.caixa.gov.br
2026-11-13T15:45:38.5497284Z Friday 13 November 2026  12:45:38 -0300 (0:00:00.063)       0:00:06.065 ******* 
2026-11-13T15:45:42.1005758Z 
2026-11-13T15:45:42.1006710Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-11-13T15:45:42.1007326Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-11-13T15:45:42.1007699Z caddeapllx2876.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-11-13T15:45:42.1007891Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-11-13T15:45:42.1008075Z releases. A future Ansible release will default to using the discovered 
2026-11-13T15:45:42.1008247Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-11-13T15:45:42.1008418Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-11-13T15:45:42.1008587Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-11-13T15:45:42.1008752Z setting deprecation_warnings=False in ansible.cfg.
2026-11-13T15:45:42.1010401Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:45:42.1041410Z Friday 13 November 2026  12:45:42 -0300 (0:00:03.554)       0:00:09.620 ******* 
2026-11-13T15:45:42.3600395Z 
2026-11-13T15:45:42.3601323Z TASK [nfs : Verificar lgtoclnt] ************************************************
2026-11-13T15:45:42.3602909Z [WARNING]: Consider using the yum, dnf or zypper module rather than running
2026-11-13T15:45:42.3603290Z 'rpm'.  If you need to use command because yum, dnf or zypper is insufficient
2026-11-13T15:45:42.3603543Z you can add 'warn: false' to this command task or set 'command_warnings=False'
2026-11-13T15:45:42.3603698Z in ansible.cfg to get rid of this message.
2026-11-13T15:45:42.3603836Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:45:42.3639502Z Friday 13 November 2026  12:45:42 -0300 (0:00:00.259)       0:00:09.880 ******* 
2026-11-13T15:45:42.4091102Z Friday 13 November 2026  12:45:42 -0300 (0:00:00.044)       0:00:09.924 ******* 
2026-11-13T15:45:42.6641154Z 
2026-11-13T15:45:42.6642248Z TASK [nfs : Verificar lgtonmda] ************************************************
2026-11-13T15:45:42.6642454Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:45:42.6682707Z Friday 13 November 2026  12:45:42 -0300 (0:00:00.259)       0:00:10.184 ******* 
2026-11-13T15:45:42.7115459Z Friday 13 November 2026  12:45:42 -0300 (0:00:00.043)       0:00:10.227 ******* 
2026-11-13T15:45:43.1213309Z 
2026-11-13T15:45:43.1214054Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-11-13T15:45:43.1214569Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:45:43.1247529Z Friday 13 November 2026  12:45:43 -0300 (0:00:00.413)       0:00:10.640 ******* 
2026-11-13T15:45:43.3773643Z 
2026-11-13T15:45:43.3774191Z TASK [nfs : Create a symbolic link] ********************************************
2026-11-13T15:45:43.3774701Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:45:43.3811655Z Friday 13 November 2026  12:45:43 -0300 (0:00:00.256)       0:00:10.897 ******* 
2026-11-13T15:45:44.2876681Z 
2026-11-13T15:45:44.2877729Z TASK [nfs : Networker | Ensure networker started] ******************************
2026-11-13T15:45:44.2877994Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:45:44.2926927Z Friday 13 November 2026  12:45:44 -0300 (0:00:00.911)       0:00:11.808 ******* 
2026-11-13T15:45:44.5607091Z 
2026-11-13T15:45:44.5607989Z TASK [nfs : Networker | Verificar portas configuradas] *************************
2026-11-13T15:45:44.5608641Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:45:44.5646233Z Friday 13 November 2026  12:45:44 -0300 (0:00:00.271)       0:00:12.080 ******* 
2026-11-13T15:45:44.8226510Z 
2026-11-13T15:45:44.8226999Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-11-13T15:45:44.8227182Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:45:44.8259902Z Friday 13 November 2026  12:45:44 -0300 (0:00:00.261)       0:00:12.342 ******* 
2026-11-13T15:45:44.8938515Z included: /opt/ads-agent/_work/r19403/a/esteira-jboss-vm-v2/roles/nfs/tasks/mount_nfs.yml for caddeapllx2876.agil.nprd.caixa.gov.br
2026-11-13T15:45:44.9000632Z included: /opt/ads-agent/_work/r19403/a/esteira-jboss-vm-v2/roles/nfs/tasks/mount_nfs.yml for caddeapllx2876.agil.nprd.caixa.gov.br
2026-11-13T15:45:44.9086109Z Friday 13 November 2026  12:45:44 -0300 (0:00:00.082)       0:00:12.424 ******* 
2026-11-13T15:45:44.9690910Z 
2026-11-13T15:45:44.9691678Z TASK [nfs : Parse JSON data] ***************************************************
2026-11-13T15:45:44.9691919Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:45:44.9723054Z Friday 13 November 2026  12:45:44 -0300 (0:00:00.063)       0:00:12.488 ******* 
2026-11-13T15:45:45.0210321Z Friday 13 November 2026  12:45:45 -0300 (0:00:00.048)       0:00:12.536 ******* 
2026-11-13T15:45:45.0863511Z 
2026-11-13T15:45:45.0864582Z TASK [nfs : Verificando as variaveis] ******************************************
2026-11-13T15:45:45.0864911Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br] => {
2026-11-13T15:45:45.0865116Z     "changed": false, 
2026-11-13T15:45:45.0865457Z     "msg": "All assertions passed"
2026-11-13T15:45:45.0865646Z }
2026-11-13T15:45:45.0901492Z Friday 13 November 2026  12:45:45 -0300 (0:00:00.069)       0:00:12.606 ******* 
2026-11-13T15:45:57.5445486Z 
2026-11-13T15:45:57.5446489Z TASK [nfs : Validando conectividade TCP com servidor NFS] **********************
2026-11-13T15:45:57.5446785Z fatal: [caddeapllx2876.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "elapsed": 12, "msg": "Timeout when waiting for nfsctcnprd.ctc.caixa:2049"}
2026-11-13T15:45:57.5446990Z ...ignoring
2026-11-13T15:45:57.5480942Z Friday 13 November 2026  12:45:57 -0300 (0:00:12.458)       0:00:25.064 ******* 
2026-11-13T15:45:57.6088920Z 
2026-11-13T15:45:57.6089455Z TASK [nfs : Falhar quando endpoint NFS estiver indisponivel] *******************
2026-11-13T15:45:57.6089656Z fatal: [caddeapllx2876.agil.nprd.caixa.gov.br]: FAILED! => {
2026-11-13T15:45:57.6089811Z     "assertion": "nfs_tcp_check is succeeded", 
2026-11-13T15:45:57.6089940Z     "changed": false, 
2026-11-13T15:45:57.6090064Z     "evaluated_to": false, 
2026-11-13T15:45:57.6090581Z     "msg": "Endpoint NFS indisponivel (TCP/2049) a partir de caddeapllx2876.agil.nprd.caixa.gov.br: nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH - Timeout when waiting for nfsctcnprd.ctc.caixa:2049"
2026-11-13T15:45:57.6090797Z }
2026-11-13T15:45:57.6092661Z Friday 13 November 2026  12:45:57 -0300 (0:00:00.061)       0:00:25.125 ******* 
2026-11-13T15:45:57.6101142Z 
2026-11-13T15:45:57.6101568Z PLAY RECAP *********************************************************************
2026-11-13T15:45:57.6101767Z caddeapllx2876.agil.nprd.caixa.gov.br : ok=22   changed=4    unreachable=0    failed=1    skipped=8    rescued=0    ignored=1   
2026-11-13T15:45:57.6102317Z 
2026-11-13T15:45:57.6102862Z Friday 13 November 2026  12:45:57 -0300 (0:00:00.000)       0:00:25.126 ******* 
2026-11-13T15:45:57.6103074Z =============================================================================== 
2026-11-13T15:45:57.6106543Z nfs : Validando conectividade TCP com servidor NFS --------------------- 12.46s
2026-11-13T15:45:57.6106992Z nfs : execute montagem script ------------------------------------------- 4.12s
2026-11-13T15:45:57.6107313Z nfs : Instalando o NFS Client ------------------------------------------- 3.55s
2026-11-13T15:45:57.6107642Z nfs : Networker | Ensure networker started ------------------------------ 0.91s
2026-11-13T15:45:57.6108004Z Verifica se o arquivo nfs_config.json existe ---------------------------- 0.48s
2026-11-13T15:45:57.6108322Z nfs : Coletar variáveis de ambiente ------------------------------------- 0.47s
2026-11-13T15:45:57.6108554Z nfs : Remove pacote jbcs-httpd ------------------------------------------ 0.41s
2026-11-13T15:45:57.6108790Z nfs : Networker | Verificar portas configuradas ------------------------- 0.27s
2026-11-13T15:45:57.6109011Z nfs : Executar o comando abaixo para limitar as portas ------------------ 0.26s
2026-11-13T15:45:57.6109233Z nfs : Verificar lgtoclnt ------------------------------------------------ 0.26s
2026-11-13T15:45:57.6109445Z nfs : Verificar lgtonmda ------------------------------------------------ 0.26s
2026-11-13T15:45:57.6109664Z nfs : Create a symbolic link -------------------------------------------- 0.26s
2026-11-13T15:45:57.6109879Z nfs : include_tasks ----------------------------------------------------- 0.08s
2026-11-13T15:45:57.6110211Z nfs : Criar variáveis --------------------------------------------------- 0.07s
2026-11-13T15:45:57.6110431Z nfs : Verificando as variaveis ------------------------------------------ 0.07s
2026-11-13T15:45:57.6110660Z nfs : Criar variáveis --------------------------------------------------- 0.07s
2026-11-13T15:45:57.6110886Z nfs : Normalize NFS keys ------------------------------------------------ 0.07s
2026-11-13T15:45:57.6111114Z nfs : Parse JSON data from structured value ----------------------------- 0.07s
2026-11-13T15:45:57.6111336Z nfs : Parse JSON data --------------------------------------------------- 0.06s
2026-11-13T15:45:57.6111554Z nfs : include_tasks ----------------------------------------------------- 0.06s
2026-11-13T15:45:57.6111709Z Playbook run took 0 days, 0 hours, 0 minutes, 25 seconds
2026-11-13T15:45:57.6806909Z ##[error]Bash exited with code '2'.
2026-11-13T15:45:57.6821497Z ##[warning]RetryHelper encountered task failure, will retry (attempt #: 1 out of 2) after 1000 ms
2026-11-13T15:45:58.7683398Z Generating script.
2026-11-13T15:45:58.7694090Z ========================== Starting Command Output ===========================
2026-11-13T15:45:58.7701386Z [command]/bin/bash /opt/ads-agent/_work/_temp/9a861e04-7061-4a03-9f9d-0a19fc9d0375.sh
2026-11-13T15:46:01.0253920Z 
2026-11-13T15:46:01.0254663Z PLAY [local] *******************************************************************
2026-11-13T15:46:01.0547819Z 
2026-11-13T15:46:01.0548263Z PLAY [Configurando o DNS] ******************************************************
2026-11-13T15:46:01.2479902Z 
2026-11-13T15:46:01.2480522Z PLAY [local] *******************************************************************
2026-11-13T15:46:01.2512835Z 
2026-11-13T15:46:01.2513596Z PLAY [Verificando serviços] ****************************************************
2026-11-13T15:46:01.2612593Z 
2026-11-13T15:46:01.2613302Z PLAY [Configuração LDAP] *******************************************************
2026-11-13T15:46:01.2657819Z [WARNING]: Found variable using reserved name: when
2026-11-13T15:46:01.2662996Z 
2026-11-13T15:46:01.2663172Z PLAY [jboss] *******************************************************************
2026-11-13T15:46:01.3042657Z 
2026-11-13T15:46:01.3043151Z PLAY [Stack Jboss] *************************************************************
2026-11-13T15:46:01.3065951Z 
2026-11-13T15:46:01.3066232Z PLAY [jboss] *******************************************************************
2026-11-13T15:46:01.3110372Z 
2026-11-13T15:46:01.3110558Z PLAY [jboss] *******************************************************************
2026-11-13T15:46:01.3389659Z Friday 13 November 2026  12:46:01 -0300 (0:00:00.374)       0:00:00.374 ******* 
2026-11-13T15:46:01.8204070Z 
2026-11-13T15:46:01.8204736Z TASK [Verifica se o arquivo nfs_config.json existe] ****************************
2026-11-13T15:46:01.8204950Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:46:01.8237814Z Friday 13 November 2026  12:46:01 -0300 (0:00:00.485)       0:00:00.859 ******* 
2026-11-13T15:46:01.8727017Z included: /opt/ads-agent/_work/r19403/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for caddeapllx2876.agil.nprd.caixa.gov.br
2026-11-13T15:46:01.8776537Z Friday 13 November 2026  12:46:01 -0300 (0:00:00.053)       0:00:00.913 ******* 
2026-11-13T15:46:01.9409998Z 
2026-11-13T15:46:01.9411077Z TASK [nfs : Criar variáveis] ***************************************************
2026-11-13T15:46:01.9411363Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:46:01.9464444Z Friday 13 November 2026  12:46:01 -0300 (0:00:00.068)       0:00:00.982 ******* 
2026-11-13T15:46:02.4270189Z 
2026-11-13T15:46:02.4271025Z TASK [nfs : Coletar variáveis de ambiente] *************************************
2026-11-13T15:46:02.4271201Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:46:02.4305432Z Friday 13 November 2026  12:46:02 -0300 (0:00:00.484)       0:00:01.466 ******* 
2026-11-13T15:46:02.4736118Z Friday 13 November 2026  12:46:02 -0300 (0:00:00.042)       0:00:01.509 ******* 
2026-11-13T15:46:02.5336194Z 
2026-11-13T15:46:02.5336934Z TASK [nfs : Criar variáveis] ***************************************************
2026-11-13T15:46:02.5337118Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:46:02.5388502Z Friday 13 November 2026  12:46:02 -0300 (0:00:00.065)       0:00:01.574 ******* 
2026-11-13T15:46:07.2484678Z 
2026-11-13T15:46:07.2485462Z TASK [nfs : execute montagem script] *******************************************
2026-11-13T15:46:07.2485792Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:46:07.2520162Z Friday 13 November 2026  12:46:07 -0300 (0:00:04.713)       0:00:06.287 ******* 
2026-11-13T15:46:07.3005812Z Friday 13 November 2026  12:46:07 -0300 (0:00:00.048)       0:00:06.336 ******* 
2026-11-13T15:46:07.3621374Z 
2026-11-13T15:46:07.3621897Z TASK [nfs : Normalize NFS keys] ************************************************
2026-11-13T15:46:07.3622060Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:46:07.3650983Z Friday 13 November 2026  12:46:07 -0300 (0:00:00.064)       0:00:06.401 ******* 
2026-11-13T15:46:07.4107045Z Friday 13 November 2026  12:46:07 -0300 (0:00:00.045)       0:00:06.446 ******* 
2026-11-13T15:46:07.4577631Z Friday 13 November 2026  12:46:07 -0300 (0:00:00.047)       0:00:06.493 ******* 
2026-11-13T15:46:07.5184380Z 
2026-11-13T15:46:07.5184844Z TASK [nfs : Parse JSON data from structured value] *****************************
2026-11-13T15:46:07.5185044Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:46:07.5214901Z Friday 13 November 2026  12:46:07 -0300 (0:00:00.063)       0:00:06.557 ******* 
2026-11-13T15:46:07.5676231Z Friday 13 November 2026  12:46:07 -0300 (0:00:00.045)       0:00:06.603 ******* 
2026-11-13T15:46:07.6239980Z included: /opt/ads-agent/_work/r19403/a/esteira-jboss-vm-v2/roles/nfs/tasks/prepare_networker.yml for caddeapllx2876.agil.nprd.caixa.gov.br
2026-11-13T15:46:07.6302893Z Friday 13 November 2026  12:46:07 -0300 (0:00:00.062)       0:00:06.666 ******* 
2026-11-13T15:46:11.1521712Z 
2026-11-13T15:46:11.1522584Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-11-13T15:46:11.1524951Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-11-13T15:46:11.1525620Z caddeapllx2876.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-11-13T15:46:11.1525811Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-11-13T15:46:11.1526198Z releases. A future Ansible release will default to using the discovered 
2026-11-13T15:46:11.1526377Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-11-13T15:46:11.1526544Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-11-13T15:46:11.1526708Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-11-13T15:46:11.1526859Z setting deprecation_warnings=False in ansible.cfg.
2026-11-13T15:46:11.1527002Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:46:11.1558611Z Friday 13 November 2026  12:46:11 -0300 (0:00:03.525)       0:00:10.191 ******* 
2026-11-13T15:46:11.4200760Z 
2026-11-13T15:46:11.4201416Z TASK [nfs : Verificar lgtoclnt] ************************************************
2026-11-13T15:46:11.4201605Z [WARNING]: Consider using the yum, dnf or zypper module rather than running
2026-11-13T15:46:11.4201988Z 'rpm'.  If you need to use command because yum, dnf or zypper is insufficient
2026-11-13T15:46:11.4202257Z you can add 'warn: false' to this command task or set 'command_warnings=False'
2026-11-13T15:46:11.4202421Z in ansible.cfg to get rid of this message.
2026-11-13T15:46:11.4202563Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:46:11.4238488Z Friday 13 November 2026  12:46:11 -0300 (0:00:00.267)       0:00:10.459 ******* 
2026-11-13T15:46:11.4730808Z Friday 13 November 2026  12:46:11 -0300 (0:00:00.048)       0:00:10.508 ******* 
2026-11-13T15:46:11.7278352Z 
2026-11-13T15:46:11.7278953Z TASK [nfs : Verificar lgtonmda] ************************************************
2026-11-13T15:46:11.7279158Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:46:11.7314590Z Friday 13 November 2026  12:46:11 -0300 (0:00:00.258)       0:00:10.767 ******* 
2026-11-13T15:46:11.7759597Z Friday 13 November 2026  12:46:11 -0300 (0:00:00.044)       0:00:10.811 ******* 
2026-11-13T15:46:12.1964387Z 
2026-11-13T15:46:12.1965113Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-11-13T15:46:12.1965423Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:46:12.1999446Z Friday 13 November 2026  12:46:12 -0300 (0:00:00.424)       0:00:11.235 ******* 
2026-11-13T15:46:12.4522208Z 
2026-11-13T15:46:12.4522693Z TASK [nfs : Create a symbolic link] ********************************************
2026-11-13T15:46:12.4522922Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:46:12.4560316Z Friday 13 November 2026  12:46:12 -0300 (0:00:00.256)       0:00:11.492 ******* 
2026-11-13T15:46:13.3744241Z 
2026-11-13T15:46:13.3744776Z TASK [nfs : Networker | Ensure networker started] ******************************
2026-11-13T15:46:13.3745016Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:46:13.3789083Z Friday 13 November 2026  12:46:13 -0300 (0:00:00.922)       0:00:12.414 ******* 
2026-11-13T15:46:13.6508525Z 
2026-11-13T15:46:13.6509070Z TASK [nfs : Networker | Verificar portas configuradas] *************************
2026-11-13T15:46:13.6509255Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:46:13.6544085Z Friday 13 November 2026  12:46:13 -0300 (0:00:00.275)       0:00:12.690 ******* 
2026-11-13T15:46:13.9161180Z 
2026-11-13T15:46:13.9162168Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-11-13T15:46:13.9162387Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:46:13.9194719Z Friday 13 November 2026  12:46:13 -0300 (0:00:00.264)       0:00:12.955 ******* 
2026-11-13T15:46:13.9902192Z included: /opt/ads-agent/_work/r19403/a/esteira-jboss-vm-v2/roles/nfs/tasks/mount_nfs.yml for caddeapllx2876.agil.nprd.caixa.gov.br
2026-11-13T15:46:13.9964044Z included: /opt/ads-agent/_work/r19403/a/esteira-jboss-vm-v2/roles/nfs/tasks/mount_nfs.yml for caddeapllx2876.agil.nprd.caixa.gov.br
2026-11-13T15:46:14.0047613Z Friday 13 November 2026  12:46:14 -0300 (0:00:00.085)       0:00:13.040 ******* 
2026-11-13T15:46:14.0649621Z 
2026-11-13T15:46:14.0650294Z TASK [nfs : Parse JSON data] ***************************************************
2026-11-13T15:46:14.0650811Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:46:14.0683162Z Friday 13 November 2026  12:46:14 -0300 (0:00:00.063)       0:00:13.104 ******* 
2026-11-13T15:46:14.1153855Z Friday 13 November 2026  12:46:14 -0300 (0:00:00.046)       0:00:13.151 ******* 
2026-11-13T15:46:14.1804710Z 
2026-11-13T15:46:14.1805428Z TASK [nfs : Verificando as variaveis] ******************************************
2026-11-13T15:46:14.1805614Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br] => {
2026-11-13T15:46:14.1805752Z     "changed": false, 
2026-11-13T15:46:14.1805897Z     "msg": "All assertions passed"
2026-11-13T15:46:14.1806005Z }
2026-11-13T15:46:14.1840607Z Friday 13 November 2026  12:46:14 -0300 (0:00:00.068)       0:00:13.220 ******* 
2026-11-13T15:46:26.6359105Z 
2026-11-13T15:46:26.6360175Z TASK [nfs : Validando conectividade TCP com servidor NFS] **********************
2026-11-13T15:46:26.6360476Z fatal: [caddeapllx2876.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "elapsed": 12, "msg": "Timeout when waiting for nfsctcnprd.ctc.caixa:2049"}
2026-11-13T15:46:26.6360680Z ...ignoring
2026-11-13T15:46:26.6395960Z Friday 13 November 2026  12:46:26 -0300 (0:00:12.455)       0:00:25.675 ******* 
2026-11-13T15:46:26.6984157Z 
2026-11-13T15:46:26.6985059Z TASK [nfs : Falhar quando endpoint NFS estiver indisponivel] *******************
2026-11-13T15:46:26.6985407Z fatal: [caddeapllx2876.agil.nprd.caixa.gov.br]: FAILED! => {
2026-11-13T15:46:26.6985564Z     "assertion": "nfs_tcp_check is succeeded", 
2026-11-13T15:46:26.6985700Z     "changed": false, 
2026-11-13T15:46:26.6985840Z     "evaluated_to": false, 
2026-11-13T15:46:26.6986346Z     "msg": "Endpoint NFS indisponivel (TCP/2049) a partir de caddeapllx2876.agil.nprd.caixa.gov.br: nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH - Timeout when waiting for nfsctcnprd.ctc.caixa:2049"
2026-11-13T15:46:26.6986554Z }
2026-11-13T15:46:26.6988869Z Friday 13 November 2026  12:46:26 -0300 (0:00:00.059)       0:00:25.734 ******* 
2026-11-13T15:46:26.6996478Z 
2026-11-13T15:46:26.6997759Z PLAY RECAP *********************************************************************
2026-11-13T15:46:26.6997957Z caddeapllx2876.agil.nprd.caixa.gov.br : ok=22   changed=4    unreachable=0    failed=1    skipped=8    rescued=0    ignored=1   
2026-11-13T15:46:26.6998045Z 
2026-11-13T15:46:26.6998271Z Friday 13 November 2026  12:46:26 -0300 (0:00:00.000)       0:00:25.735 ******* 
2026-11-13T15:46:26.6998455Z =============================================================================== 
2026-11-13T15:46:26.7001865Z nfs : Validando conectividade TCP com servidor NFS --------------------- 12.46s
2026-11-13T15:46:26.7002519Z nfs : execute montagem script ------------------------------------------- 4.71s
2026-11-13T15:46:26.7002781Z nfs : Instalando o NFS Client ------------------------------------------- 3.53s
2026-11-13T15:46:26.7003067Z nfs : Networker | Ensure networker started ------------------------------ 0.92s
2026-11-13T15:46:26.7003355Z Verifica se o arquivo nfs_config.json existe ---------------------------- 0.49s
2026-11-13T15:46:26.7003623Z nfs : Coletar variáveis de ambiente ------------------------------------- 0.48s
2026-11-13T15:46:26.7003856Z nfs : Remove pacote jbcs-httpd ------------------------------------------ 0.42s
2026-11-13T15:46:26.7004085Z nfs : Networker | Verificar portas configuradas ------------------------- 0.28s
2026-11-13T15:46:26.7004310Z nfs : Verificar lgtoclnt ------------------------------------------------ 0.27s
2026-11-13T15:46:26.7004536Z nfs : Executar o comando abaixo para limitar as portas ------------------ 0.26s
2026-11-13T15:46:26.7005062Z nfs : Verificar lgtonmda ------------------------------------------------ 0.26s
2026-11-13T15:46:26.7005438Z nfs : Create a symbolic link -------------------------------------------- 0.26s
2026-11-13T15:46:26.7005670Z nfs : include_tasks ----------------------------------------------------- 0.09s
2026-11-13T15:46:26.7005992Z nfs : Verificando as variaveis ------------------------------------------ 0.07s
2026-11-13T15:46:26.7006228Z nfs : Criar variáveis --------------------------------------------------- 0.07s
2026-11-13T15:46:26.7006452Z nfs : Criar variáveis --------------------------------------------------- 0.07s
2026-11-13T15:46:26.7006675Z nfs : Normalize NFS keys ------------------------------------------------ 0.06s
2026-11-13T15:46:26.7006888Z nfs : Parse JSON data from structured value ----------------------------- 0.06s
2026-11-13T15:46:26.7007115Z nfs : Parse JSON data --------------------------------------------------- 0.06s
2026-11-13T15:46:26.7007342Z nfs : include_tasks ----------------------------------------------------- 0.06s
2026-11-13T15:46:26.7007495Z Playbook run took 0 days, 0 hours, 0 minutes, 25 seconds
2026-11-13T15:46:26.7648365Z ##[error]Bash exited with code '2'.
2026-11-13T15:46:26.7674481Z ##[warning]RetryHelper encountered task failure, will retry (attempt #: 2 out of 2) after 4000 ms
2026-11-13T15:46:30.8578200Z Generating script.
2026-11-13T15:46:30.8589312Z ========================== Starting Command Output ===========================
2026-11-13T15:46:30.8600132Z [command]/bin/bash /opt/ads-agent/_work/_temp/392e9205-6218-467c-9c62-f0d17f9ad563.sh
2026-11-13T15:46:33.1271246Z 
2026-11-13T15:46:33.1271949Z PLAY [local] *******************************************************************
2026-11-13T15:46:33.1574694Z 
2026-11-13T15:46:33.1575346Z PLAY [Configurando o DNS] ******************************************************
2026-11-13T15:46:33.3447847Z 
2026-11-13T15:46:33.3448327Z PLAY [local] *******************************************************************
2026-11-13T15:46:33.3484171Z 
2026-11-13T15:46:33.3484568Z PLAY [Verificando serviços] ****************************************************
2026-11-13T15:46:33.3581831Z 
2026-11-13T15:46:33.3582291Z PLAY [Configuração LDAP] *******************************************************
2026-11-13T15:46:33.3627568Z [WARNING]: Found variable using reserved name: when
2026-11-13T15:46:33.3632452Z 
2026-11-13T15:46:33.3632622Z PLAY [jboss] *******************************************************************
2026-11-13T15:46:33.4025879Z 
2026-11-13T15:46:33.4026409Z PLAY [Stack Jboss] *************************************************************
2026-11-13T15:46:33.4053154Z 
2026-11-13T15:46:33.4053695Z PLAY [jboss] *******************************************************************
2026-11-13T15:46:33.4099352Z 
2026-11-13T15:46:33.4101265Z PLAY [jboss] *******************************************************************
2026-11-13T15:46:33.4382019Z Friday 13 November 2026  12:46:33 -0300 (0:00:00.374)       0:00:00.374 ******* 
2026-11-13T15:46:33.9217071Z 
2026-11-13T15:46:33.9217663Z TASK [Verifica se o arquivo nfs_config.json existe] ****************************
2026-11-13T15:46:33.9217839Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:46:33.9253090Z Friday 13 November 2026  12:46:33 -0300 (0:00:00.487)       0:00:00.861 ******* 
2026-11-13T15:46:33.9746020Z included: /opt/ads-agent/_work/r19403/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for caddeapllx2876.agil.nprd.caixa.gov.br
2026-11-13T15:46:33.9792217Z Friday 13 November 2026  12:46:33 -0300 (0:00:00.053)       0:00:00.915 ******* 
2026-11-13T15:46:34.0396031Z 
2026-11-13T15:46:34.0396805Z TASK [nfs : Criar variáveis] ***************************************************
2026-11-13T15:46:34.0396991Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:46:34.0451692Z Friday 13 November 2026  12:46:34 -0300 (0:00:00.065)       0:00:00.981 ******* 
2026-11-13T15:46:34.5153134Z 
2026-11-13T15:46:34.5154040Z TASK [nfs : Coletar variáveis de ambiente] *************************************
2026-11-13T15:46:34.5154228Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:46:34.5190457Z Friday 13 November 2026  12:46:34 -0300 (0:00:00.473)       0:00:01.455 ******* 
2026-11-13T15:46:34.5638320Z Friday 13 November 2026  12:46:34 -0300 (0:00:00.044)       0:00:01.499 ******* 
2026-11-13T15:46:34.6255493Z 
2026-11-13T15:46:34.6256321Z TASK [nfs : Criar variáveis] ***************************************************
2026-11-13T15:46:34.6256599Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:46:34.6307330Z Friday 13 November 2026  12:46:34 -0300 (0:00:00.067)       0:00:01.566 ******* 
2026-11-13T15:46:38.5374274Z 
2026-11-13T15:46:38.5374830Z TASK [nfs : execute montagem script] *******************************************
2026-11-13T15:46:38.5375012Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:46:38.5410336Z Friday 13 November 2026  12:46:38 -0300 (0:00:03.910)       0:00:05.477 ******* 
2026-11-13T15:46:38.5878451Z Friday 13 November 2026  12:46:38 -0300 (0:00:00.046)       0:00:05.523 ******* 
2026-11-13T15:46:38.6493799Z 
2026-11-13T15:46:38.6494305Z TASK [nfs : Normalize NFS keys] ************************************************
2026-11-13T15:46:38.6494469Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:46:38.6523989Z Friday 13 November 2026  12:46:38 -0300 (0:00:00.064)       0:00:05.588 ******* 
2026-11-13T15:46:38.6985580Z Friday 13 November 2026  12:46:38 -0300 (0:00:00.045)       0:00:05.634 ******* 
2026-11-13T15:46:38.7444376Z Friday 13 November 2026  12:46:38 -0300 (0:00:00.045)       0:00:05.680 ******* 
2026-11-13T15:46:38.8068218Z 
2026-11-13T15:46:38.8068752Z TASK [nfs : Parse JSON data from structured value] *****************************
2026-11-13T15:46:38.8068925Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:46:38.8100513Z Friday 13 November 2026  12:46:38 -0300 (0:00:00.065)       0:00:05.745 ******* 
2026-11-13T15:46:38.8565012Z Friday 13 November 2026  12:46:38 -0300 (0:00:00.046)       0:00:05.792 ******* 
2026-11-13T15:46:38.9165896Z included: /opt/ads-agent/_work/r19403/a/esteira-jboss-vm-v2/roles/nfs/tasks/prepare_networker.yml for caddeapllx2876.agil.nprd.caixa.gov.br
2026-11-13T15:46:38.9230454Z Friday 13 November 2026  12:46:38 -0300 (0:00:00.066)       0:00:05.858 ******* 
2026-11-13T15:46:42.4803989Z 
2026-11-13T15:46:42.4804695Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-11-13T15:46:42.4809456Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-11-13T15:46:42.4810195Z caddeapllx2876.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-11-13T15:46:42.4810551Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-11-13T15:46:42.4810728Z releases. A future Ansible release will default to using the discovered 
2026-11-13T15:46:42.4811045Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-11-13T15:46:42.4811338Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-11-13T15:46:42.4811520Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-11-13T15:46:42.4811677Z setting deprecation_warnings=False in ansible.cfg.
2026-11-13T15:46:42.4811821Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:46:42.4840814Z Friday 13 November 2026  12:46:42 -0300 (0:00:03.561)       0:00:09.420 ******* 
2026-11-13T15:46:42.7528005Z 
2026-11-13T15:46:42.7528990Z TASK [nfs : Verificar lgtoclnt] ************************************************
2026-11-13T15:46:42.7532195Z [WARNING]: Consider using the yum, dnf or zypper module rather than running
2026-11-13T15:46:42.7532725Z 'rpm'.  If you need to use command because yum, dnf or zypper is insufficient
2026-11-13T15:46:42.7533763Z you can add 'warn: false' to this command task or set 'command_warnings=False'
2026-11-13T15:46:42.7534098Z in ansible.cfg to get rid of this message.
2026-11-13T15:46:42.7534326Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:46:42.7566455Z Friday 13 November 2026  12:46:42 -0300 (0:00:00.272)       0:00:09.692 ******* 
2026-11-13T15:46:42.8005116Z Friday 13 November 2026  12:46:42 -0300 (0:00:00.043)       0:00:09.736 ******* 
2026-11-13T15:46:43.0555706Z 
2026-11-13T15:46:43.0556264Z TASK [nfs : Verificar lgtonmda] ************************************************
2026-11-13T15:46:43.0556769Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:46:43.0593182Z Friday 13 November 2026  12:46:43 -0300 (0:00:00.258)       0:00:09.995 ******* 
2026-11-13T15:46:43.1064891Z Friday 13 November 2026  12:46:43 -0300 (0:00:00.047)       0:00:10.042 ******* 
2026-11-13T15:46:43.5243002Z 
2026-11-13T15:46:43.5243769Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-11-13T15:46:43.5243953Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:46:43.5277251Z Friday 13 November 2026  12:46:43 -0300 (0:00:00.421)       0:00:10.463 ******* 
2026-11-13T15:46:43.7826893Z 
2026-11-13T15:46:43.7827634Z TASK [nfs : Create a symbolic link] ********************************************
2026-11-13T15:46:43.7828346Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:46:43.7865165Z Friday 13 November 2026  12:46:43 -0300 (0:00:00.258)       0:00:10.722 ******* 
2026-11-13T15:46:44.7275907Z 
2026-11-13T15:46:44.7276428Z TASK [nfs : Networker | Ensure networker started] ******************************
2026-11-13T15:46:44.7276623Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:46:44.7320757Z Friday 13 November 2026  12:46:44 -0300 (0:00:00.945)       0:00:11.668 ******* 
2026-11-13T15:46:45.0001605Z 
2026-11-13T15:46:45.0002131Z TASK [nfs : Networker | Verificar portas configuradas] *************************
2026-11-13T15:46:45.0002310Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:46:45.0038083Z Friday 13 November 2026  12:46:45 -0300 (0:00:00.271)       0:00:11.939 ******* 
2026-11-13T15:46:45.2803915Z 
2026-11-13T15:46:45.2804488Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-11-13T15:46:45.2804688Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:46:45.2837760Z Friday 13 November 2026  12:46:45 -0300 (0:00:00.279)       0:00:12.219 ******* 
2026-11-13T15:46:45.3526792Z included: /opt/ads-agent/_work/r19403/a/esteira-jboss-vm-v2/roles/nfs/tasks/mount_nfs.yml for caddeapllx2876.agil.nprd.caixa.gov.br
2026-11-13T15:46:45.3587041Z included: /opt/ads-agent/_work/r19403/a/esteira-jboss-vm-v2/roles/nfs/tasks/mount_nfs.yml for caddeapllx2876.agil.nprd.caixa.gov.br
2026-11-13T15:46:45.3673813Z Friday 13 November 2026  12:46:45 -0300 (0:00:00.083)       0:00:12.303 ******* 
2026-11-13T15:46:45.4263746Z 
2026-11-13T15:46:45.4264214Z TASK [nfs : Parse JSON data] ***************************************************
2026-11-13T15:46:45.4264387Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T15:46:45.4297527Z Friday 13 November 2026  12:46:45 -0300 (0:00:00.062)       0:00:12.365 ******* 
2026-11-13T15:46:45.4741921Z Friday 13 November 2026  12:46:45 -0300 (0:00:00.044)       0:00:12.410 ******* 
2026-11-13T15:46:45.5389248Z 
2026-11-13T15:46:45.5390009Z TASK [nfs : Verificando as variaveis] ******************************************
2026-11-13T15:46:45.5390183Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br] => {
2026-11-13T15:46:45.5390316Z     "changed": false, 
2026-11-13T15:46:45.5390457Z     "msg": "All assertions passed"
2026-11-13T15:46:45.5390568Z }
2026-11-13T15:46:45.5423748Z Friday 13 November 2026  12:46:45 -0300 (0:00:00.068)       0:00:12.478 ******* 
2026-11-13T15:46:57.9977290Z 
2026-11-13T15:46:57.9978230Z TASK [nfs : Validando conectividade TCP com servidor NFS] **********************
2026-11-13T15:46:57.9978559Z fatal: [caddeapllx2876.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "elapsed": 12, "msg": "Timeout when waiting for nfsctcnprd.ctc.caixa:2049"}
2026-11-13T15:46:57.9978825Z ...ignoring
2026-11-13T15:46:58.0016022Z Friday 13 November 2026  12:46:57 -0300 (0:00:12.459)       0:00:24.937 ******* 
2026-11-13T15:46:58.0628080Z 
2026-11-13T15:46:58.0628906Z TASK [nfs : Falhar quando endpoint NFS estiver indisponivel] *******************
2026-11-13T15:46:58.0629225Z fatal: [caddeapllx2876.agil.nprd.caixa.gov.br]: FAILED! => {
2026-11-13T15:46:58.0629386Z     "assertion": "nfs_tcp_check is succeeded", 
2026-11-13T15:46:58.0629520Z     "changed": false, 
2026-11-13T15:46:58.0629975Z     "evaluated_to": false, 
2026-11-13T15:46:58.0630481Z     "msg": "Endpoint NFS indisponivel (TCP/2049) a partir de caddeapllx2876.agil.nprd.caixa.gov.br: nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH - Timeout when waiting for nfsctcnprd.ctc.caixa:2049"
2026-11-13T15:46:58.0630692Z }
2026-11-13T15:46:58.0632948Z Friday 13 November 2026  12:46:58 -0300 (0:00:00.061)       0:00:24.999 ******* 
2026-11-13T15:46:58.0640583Z 
2026-11-13T15:46:58.0641324Z PLAY RECAP *********************************************************************
2026-11-13T15:46:58.0641526Z caddeapllx2876.agil.nprd.caixa.gov.br : ok=22   changed=4    unreachable=0    failed=1    skipped=8    rescued=0    ignored=1   
2026-11-13T15:46:58.0641632Z 
2026-11-13T15:46:58.0642463Z Friday 13 November 2026  12:46:58 -0300 (0:00:00.000)       0:00:25.000 ******* 
2026-11-13T15:46:58.0642689Z =============================================================================== 
2026-11-13T15:46:58.0646251Z nfs : Validando conectividade TCP com servidor NFS --------------------- 12.46s
2026-11-13T15:46:58.0646935Z nfs : execute montagem script ------------------------------------------- 3.91s
2026-11-13T15:46:58.0647232Z nfs : Instalando o NFS Client ------------------------------------------- 3.56s
2026-11-13T15:46:58.0647476Z nfs : Networker | Ensure networker started ------------------------------ 0.95s
2026-11-13T15:46:58.0647710Z Verifica se o arquivo nfs_config.json existe ---------------------------- 0.49s
2026-11-13T15:46:58.0647976Z nfs : Coletar variáveis de ambiente ------------------------------------- 0.47s
2026-11-13T15:46:58.0648227Z nfs : Remove pacote jbcs-httpd ------------------------------------------ 0.42s
2026-11-13T15:46:58.0648457Z nfs : Executar o comando abaixo para limitar as portas ------------------ 0.28s
2026-11-13T15:46:58.0648686Z nfs : Verificar lgtoclnt ------------------------------------------------ 0.27s
2026-11-13T15:46:58.0648908Z nfs : Networker | Verificar portas configuradas ------------------------- 0.27s
2026-11-13T15:46:58.0649131Z nfs : Verificar lgtonmda ------------------------------------------------ 0.26s
2026-11-13T15:46:58.0649358Z nfs : Create a symbolic link -------------------------------------------- 0.26s
2026-11-13T15:46:58.0649593Z nfs : include_tasks ----------------------------------------------------- 0.08s
2026-11-13T15:46:58.0649821Z nfs : Verificando as variaveis ------------------------------------------ 0.07s
2026-11-13T15:46:58.0650049Z nfs : Criar variáveis --------------------------------------------------- 0.07s
2026-11-13T15:46:58.0650274Z nfs : include_tasks ----------------------------------------------------- 0.07s
2026-11-13T15:46:58.0650500Z nfs : Criar variáveis --------------------------------------------------- 0.07s
2026-11-13T15:46:58.0650732Z nfs : Parse JSON data from structured value ----------------------------- 0.07s
2026-11-13T15:46:58.0650956Z nfs : Normalize NFS keys ------------------------------------------------ 0.06s
2026-11-13T15:46:58.0651183Z nfs : Parse JSON data --------------------------------------------------- 0.06s
2026-11-13T15:46:58.0651341Z Playbook run took 0 days, 0 hours, 0 minutes, 24 seconds
2026-11-13T15:46:58.1305597Z ##[error]Bash exited with code '2'.
2026-11-13T15:46:58.1320209Z ##[section]Finishing: Configura Control-M


Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
/
Releases
/
SIIFX-caixinhas-batch
/
SIIFX-caixinhas-batch-72
Search


Caixa

Overview

Boards

Repos

Pipelines
Pipelines
Environments
Releases
Library
Task groups
Deployment groups
Portal Infra

Test Plans

Artifacts
Project settings
SIIFX-caixinhas-batch

SIIFX-caixinhas-batch-72


EC TQS

Failed


Pipeline

Tasks

Variables

Logs

Tests
Predefined variables
Filter by keywords
Release (+1)


AG_JAVA_HOME
/opt/ctmage/JRE
AGCMNDATA
18008
ATCMNDATA
18007
CGC_UNIDADE_DES
7390
CGC_UNIDADE_OPS
7259
CM_64_LIST
OS | AI | DATABASE
CM_LIST_SENT2CTMS
OS | AI | DATABASE
CMLIST
OS | AI | DATABASE
CODE_VERSION
9.0.21.200
CTMPERMHOSTS
ctm.caixa
CTMPERMHOSTS
sspdeaprlx0028
CTMSHOST
sspdeaprlx0028
FD_NUMBER
DRKAI.9.0.21.200
http_context_additional
http_context_default
/siifx-caixinhas-batch
http_sso
no
produto_nome_vm
Jboss EAP
produto_versao_vm
7.1
sistema_ambiente
tqs
sistema_nome
siifx-caixinhas-batch
SITE
ctc_nprd
tf_var_template_name
controlm-21.300-AG-DATA-openjdk21-rhel93-v003
vm_destroy_before_create
Row 2

Row 2

Showing 26 deployments

Row 2

EC TQSDeploy release

Row 3

Row 2

Showing 26 deployments

Row 2

Expanded

Showing 26 deployments

Row 2

EC TQSDeploy release

Showing 26 deployments

Showing 26 deployments

Row 3

Row 3

Showing filters 1 through 2


