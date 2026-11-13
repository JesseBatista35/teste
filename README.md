2026-11-13T20:00:13.8901426Z ##[section]Starting: Configura Control-M
2026-11-13T20:00:13.8904765Z ==============================================================================
2026-11-13T20:00:13.8904852Z Task         : Bash
2026-11-13T20:00:13.8904902Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-13T20:00:13.8904972Z Version      : 3.227.0
2026-11-13T20:00:13.8905029Z Author       : Microsoft Corporation
2026-11-13T20:00:13.8905081Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-13T20:00:13.8905160Z ==============================================================================
2026-11-13T20:00:14.5254596Z Generating script.
2026-11-13T20:00:14.5265555Z ========================== Starting Command Output ===========================
2026-11-13T20:00:14.5274187Z [command]/bin/bash /opt/ads-agent/_work/_temp/72c6346f-9c54-4ace-bf54-bbec1d0e19a4.sh
2026-11-13T20:00:16.8953229Z 
2026-11-13T20:00:16.8953742Z PLAY [local] *******************************************************************
2026-11-13T20:00:16.9267922Z 
2026-11-13T20:00:16.9268443Z PLAY [Configurando o DNS] ******************************************************
2026-11-13T20:00:17.1555705Z 
2026-11-13T20:00:17.1556213Z PLAY [local] *******************************************************************
2026-11-13T20:00:17.1593636Z 
2026-11-13T20:00:17.1594228Z PLAY [Verificando serviços] ****************************************************
2026-11-13T20:00:17.1689625Z 
2026-11-13T20:00:17.1690104Z PLAY [Configuração LDAP] *******************************************************
2026-11-13T20:00:17.1734462Z [WARNING]: Found variable using reserved name: when
2026-11-13T20:00:17.1739134Z 
2026-11-13T20:00:17.1739270Z PLAY [jboss] *******************************************************************
2026-11-13T20:00:17.2139493Z 
2026-11-13T20:00:17.2139998Z PLAY [Stack Jboss] *************************************************************
2026-11-13T20:00:17.2165255Z 
2026-11-13T20:00:17.2165543Z PLAY [jboss] *******************************************************************
2026-11-13T20:00:17.2212946Z 
2026-11-13T20:00:17.2213122Z PLAY [jboss] *******************************************************************
2026-11-13T20:00:17.2498923Z Friday 13 November 2026  17:00:17 -0300 (0:00:00.416)       0:00:00.416 ******* 
2026-11-13T20:00:17.7470000Z 
2026-11-13T20:00:17.7470484Z TASK [Verifica se o arquivo nfs_config.json existe] ****************************
2026-11-13T20:00:17.7470691Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:00:17.7525951Z Friday 13 November 2026  17:00:17 -0300 (0:00:00.502)       0:00:00.919 ******* 
2026-11-13T20:00:17.8052702Z included: /opt/ads-agent/_work/r16140/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for caddeapllx2876.agil.nprd.caixa.gov.br
2026-11-13T20:00:17.8104073Z Friday 13 November 2026  17:00:17 -0300 (0:00:00.057)       0:00:00.977 ******* 
2026-11-13T20:00:17.8716044Z 
2026-11-13T20:00:17.8716703Z TASK [nfs : Criar variáveis] ***************************************************
2026-11-13T20:00:17.8716938Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:00:17.8759880Z Friday 13 November 2026  17:00:17 -0300 (0:00:00.065)       0:00:01.042 ******* 
2026-11-13T20:00:18.3635391Z 
2026-11-13T20:00:18.3636461Z TASK [nfs : Coletar variáveis de ambiente] *************************************
2026-11-13T20:00:18.3636940Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:00:18.3676850Z Friday 13 November 2026  17:00:18 -0300 (0:00:00.491)       0:00:01.534 ******* 
2026-11-13T20:00:18.4141036Z Friday 13 November 2026  17:00:18 -0300 (0:00:00.046)       0:00:01.580 ******* 
2026-11-13T20:00:18.4756912Z 
2026-11-13T20:00:18.4757676Z TASK [nfs : Criar variáveis] ***************************************************
2026-11-13T20:00:18.4757847Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:00:18.4813219Z Friday 13 November 2026  17:00:18 -0300 (0:00:00.067)       0:00:01.647 ******* 
2026-11-13T20:00:22.3494477Z 
2026-11-13T20:00:22.3495075Z TASK [nfs : execute montagem script] *******************************************
2026-11-13T20:00:22.3495498Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:00:22.3533295Z Friday 13 November 2026  17:00:22 -0300 (0:00:03.872)       0:00:05.520 ******* 
2026-11-13T20:00:22.4012284Z Friday 13 November 2026  17:00:22 -0300 (0:00:00.047)       0:00:05.567 ******* 
2026-11-13T20:00:22.4642952Z 
2026-11-13T20:00:22.4643611Z TASK [nfs : Normalize NFS keys] ************************************************
2026-11-13T20:00:22.4643879Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:00:22.4674434Z Friday 13 November 2026  17:00:22 -0300 (0:00:00.066)       0:00:05.634 ******* 
2026-11-13T20:00:22.5160428Z Friday 13 November 2026  17:00:22 -0300 (0:00:00.048)       0:00:05.682 ******* 
2026-11-13T20:00:22.5624763Z Friday 13 November 2026  17:00:22 -0300 (0:00:00.046)       0:00:05.728 ******* 
2026-11-13T20:00:22.6246415Z 
2026-11-13T20:00:22.6247174Z TASK [nfs : Parse JSON data from structured value] *****************************
2026-11-13T20:00:22.6247696Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:00:22.6280627Z Friday 13 November 2026  17:00:22 -0300 (0:00:00.065)       0:00:05.794 ******* 
2026-11-13T20:00:22.6773186Z Friday 13 November 2026  17:00:22 -0300 (0:00:00.047)       0:00:05.842 ******* 
2026-11-13T20:00:22.7341168Z included: /opt/ads-agent/_work/r16140/a/esteira-jboss-vm-v2/roles/nfs/tasks/prepare_networker.yml for caddeapllx2876.agil.nprd.caixa.gov.br
2026-11-13T20:00:22.7412462Z Friday 13 November 2026  17:00:22 -0300 (0:00:00.065)       0:00:05.907 ******* 
2026-11-13T20:00:26.3124233Z 
2026-11-13T20:00:26.3125116Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-11-13T20:00:26.3127478Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-11-13T20:00:26.3128041Z caddeapllx2876.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-11-13T20:00:26.3128215Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-11-13T20:00:26.3128398Z releases. A future Ansible release will default to using the discovered 
2026-11-13T20:00:26.3128561Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-11-13T20:00:26.3128722Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-11-13T20:00:26.3128892Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-11-13T20:00:26.3129035Z setting deprecation_warnings=False in ansible.cfg.
2026-11-13T20:00:26.3129176Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:00:26.3164519Z Friday 13 November 2026  17:00:26 -0300 (0:00:03.575)       0:00:09.483 ******* 
2026-11-13T20:00:26.5746088Z 
2026-11-13T20:00:26.5746730Z TASK [nfs : Verificar lgtoclnt] ************************************************
2026-11-13T20:00:26.5746922Z [WARNING]: Consider using the yum, dnf or zypper module rather than running
2026-11-13T20:00:26.5747266Z 'rpm'.  If you need to use command because yum, dnf or zypper is insufficient
2026-11-13T20:00:26.5747500Z you can add 'warn: false' to this command task or set 'command_warnings=False'
2026-11-13T20:00:26.5747642Z in ansible.cfg to get rid of this message.
2026-11-13T20:00:26.5747775Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:00:26.5786286Z Friday 13 November 2026  17:00:26 -0300 (0:00:00.262)       0:00:09.745 ******* 
2026-11-13T20:00:26.6247365Z Friday 13 November 2026  17:00:26 -0300 (0:00:00.045)       0:00:09.791 ******* 
2026-11-13T20:00:26.8812270Z 
2026-11-13T20:00:26.8812912Z TASK [nfs : Verificar lgtonmda] ************************************************
2026-11-13T20:00:26.8813077Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:00:26.8851018Z Friday 13 November 2026  17:00:26 -0300 (0:00:00.260)       0:00:10.051 ******* 
2026-11-13T20:00:26.9325342Z Friday 13 November 2026  17:00:26 -0300 (0:00:00.047)       0:00:10.099 ******* 
2026-11-13T20:00:27.3613613Z 
2026-11-13T20:00:27.3614335Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-11-13T20:00:27.3614834Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:00:27.3650095Z Friday 13 November 2026  17:00:27 -0300 (0:00:00.432)       0:00:10.531 ******* 
2026-11-13T20:00:27.6180004Z 
2026-11-13T20:00:27.6180506Z TASK [nfs : Create a symbolic link] ********************************************
2026-11-13T20:00:27.6180696Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:00:27.6220248Z Friday 13 November 2026  17:00:27 -0300 (0:00:00.256)       0:00:10.788 ******* 
2026-11-13T20:00:28.5583530Z 
2026-11-13T20:00:28.5584479Z TASK [nfs : Networker | Ensure networker started] ******************************
2026-11-13T20:00:28.5584681Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:00:28.5630523Z Friday 13 November 2026  17:00:28 -0300 (0:00:00.941)       0:00:11.729 ******* 
2026-11-13T20:00:28.8272864Z 
2026-11-13T20:00:28.8273698Z TASK [nfs : Networker | Verificar portas configuradas] *************************
2026-11-13T20:00:28.8273945Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:00:28.8310272Z Friday 13 November 2026  17:00:28 -0300 (0:00:00.267)       0:00:11.997 ******* 
2026-11-13T20:00:29.0981391Z 
2026-11-13T20:00:29.0981927Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-11-13T20:00:29.0982113Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:00:29.1016536Z Friday 13 November 2026  17:00:29 -0300 (0:00:00.270)       0:00:12.268 ******* 
2026-11-13T20:00:29.1729254Z included: /opt/ads-agent/_work/r16140/a/esteira-jboss-vm-v2/roles/nfs/tasks/mount_nfs.yml for caddeapllx2876.agil.nprd.caixa.gov.br
2026-11-13T20:00:29.1799526Z included: /opt/ads-agent/_work/r16140/a/esteira-jboss-vm-v2/roles/nfs/tasks/mount_nfs.yml for caddeapllx2876.agil.nprd.caixa.gov.br
2026-11-13T20:00:29.1886435Z Friday 13 November 2026  17:00:29 -0300 (0:00:00.086)       0:00:12.355 ******* 
2026-11-13T20:00:29.2484244Z 
2026-11-13T20:00:29.2484810Z TASK [nfs : Parse JSON data] ***************************************************
2026-11-13T20:00:29.2484982Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:00:29.2517770Z Friday 13 November 2026  17:00:29 -0300 (0:00:00.063)       0:00:12.418 ******* 
2026-11-13T20:00:29.2956046Z Friday 13 November 2026  17:00:29 -0300 (0:00:00.043)       0:00:12.462 ******* 
2026-11-13T20:00:29.3593469Z 
2026-11-13T20:00:29.3594124Z TASK [nfs : Verificando as variaveis] ******************************************
2026-11-13T20:00:29.3594302Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br] => {
2026-11-13T20:00:29.3594430Z     "changed": false, 
2026-11-13T20:00:29.3594547Z     "msg": "All assertions passed"
2026-11-13T20:00:29.3594635Z }
2026-11-13T20:00:29.3632719Z Friday 13 November 2026  17:00:29 -0300 (0:00:00.067)       0:00:12.530 ******* 
2026-11-13T20:00:41.8124755Z 
2026-11-13T20:00:41.8125330Z TASK [nfs : Validando conectividade TCP com servidor NFS] **********************
2026-11-13T20:00:41.8125947Z fatal: [caddeapllx2876.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "elapsed": 12, "msg": "Timeout when waiting for nfsctcnprd.ctc.caixa:2049"}
2026-11-13T20:00:41.8126194Z ...ignoring
2026-11-13T20:00:41.8165289Z Friday 13 November 2026  17:00:41 -0300 (0:00:12.453)       0:00:24.983 ******* 
2026-11-13T20:00:41.8763436Z 
2026-11-13T20:00:41.8763929Z TASK [nfs : Falhar quando endpoint NFS estiver indisponivel] *******************
2026-11-13T20:00:41.8764424Z fatal: [caddeapllx2876.agil.nprd.caixa.gov.br]: FAILED! => {
2026-11-13T20:00:41.8764568Z     "assertion": "nfs_tcp_check is succeeded", 
2026-11-13T20:00:41.8764686Z     "changed": false, 
2026-11-13T20:00:41.8764797Z     "evaluated_to": false, 
2026-11-13T20:00:41.8765289Z     "msg": "Endpoint NFS indisponivel (TCP/2049) a partir de caddeapllx2876.agil.nprd.caixa.gov.br: nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH - Timeout when waiting for nfsctcnprd.ctc.caixa:2049"
2026-11-13T20:00:41.8765488Z }
2026-11-13T20:00:41.8769461Z Friday 13 November 2026  17:00:41 -0300 (0:00:00.060)       0:00:25.043 ******* 
2026-11-13T20:00:41.8778254Z 
2026-11-13T20:00:41.8778433Z PLAY RECAP *********************************************************************
2026-11-13T20:00:41.8779363Z caddeapllx2876.agil.nprd.caixa.gov.br : ok=22   changed=4    unreachable=0    failed=1    skipped=8    rescued=0    ignored=1   
2026-11-13T20:00:41.8779554Z 
2026-11-13T20:00:41.8780094Z Friday 13 November 2026  17:00:41 -0300 (0:00:00.001)       0:00:25.044 ******* 
2026-11-13T20:00:41.8780260Z =============================================================================== 
2026-11-13T20:00:41.8784417Z nfs : Validando conectividade TCP com servidor NFS --------------------- 12.45s
2026-11-13T20:00:41.8784854Z nfs : execute montagem script ------------------------------------------- 3.87s
2026-11-13T20:00:41.8785183Z nfs : Instalando o NFS Client ------------------------------------------- 3.58s
2026-11-13T20:00:41.8785423Z nfs : Networker | Ensure networker started ------------------------------ 0.94s
2026-11-13T20:00:41.8785661Z Verifica se o arquivo nfs_config.json existe ---------------------------- 0.50s
2026-11-13T20:00:41.8786006Z nfs : Coletar variáveis de ambiente ------------------------------------- 0.49s
2026-11-13T20:00:41.8786322Z nfs : Remove pacote jbcs-httpd ------------------------------------------ 0.43s
2026-11-13T20:00:41.8786656Z nfs : Executar o comando abaixo para limitar as portas ------------------ 0.27s
2026-11-13T20:00:41.8786941Z nfs : Networker | Verificar portas configuradas ------------------------- 0.27s
2026-11-13T20:00:41.8787179Z nfs : Verificar lgtoclnt ------------------------------------------------ 0.26s
2026-11-13T20:00:41.8787399Z nfs : Verificar lgtonmda ------------------------------------------------ 0.26s
2026-11-13T20:00:41.8787623Z nfs : Create a symbolic link -------------------------------------------- 0.26s
2026-11-13T20:00:41.8787842Z nfs : include_tasks ----------------------------------------------------- 0.09s
2026-11-13T20:00:41.8788068Z nfs : Verificando as variaveis ------------------------------------------ 0.07s
2026-11-13T20:00:41.8788286Z nfs : Criar variáveis --------------------------------------------------- 0.07s
2026-11-13T20:00:41.8788510Z nfs : Normalize NFS keys ------------------------------------------------ 0.07s
2026-11-13T20:00:41.8788728Z nfs : Parse JSON data from structured value ----------------------------- 0.07s
2026-11-13T20:00:41.8788939Z nfs : Criar variáveis --------------------------------------------------- 0.07s
2026-11-13T20:00:41.8789189Z nfs : include_tasks ----------------------------------------------------- 0.07s
2026-11-13T20:00:41.8789511Z nfs : Parse JSON data --------------------------------------------------- 0.06s
2026-11-13T20:00:41.8789661Z Playbook run took 0 days, 0 hours, 0 minutes, 25 seconds
2026-11-13T20:00:41.9528876Z ##[error]Bash exited with code '2'.
2026-11-13T20:00:41.9531985Z ##[warning]RetryHelper encountered task failure, will retry (attempt #: 1 out of 2) after 1000 ms
2026-11-13T20:00:43.0436746Z Generating script.
2026-11-13T20:00:43.0453678Z ========================== Starting Command Output ===========================
2026-11-13T20:00:43.0459563Z [command]/bin/bash /opt/ads-agent/_work/_temp/945eab4b-4f56-4f2e-8850-c13d0a315d8e.sh
2026-11-13T20:00:45.4163391Z 
2026-11-13T20:00:45.4163847Z PLAY [local] *******************************************************************
2026-11-13T20:00:45.4467533Z 
2026-11-13T20:00:45.4468188Z PLAY [Configurando o DNS] ******************************************************
2026-11-13T20:00:45.6485604Z 
2026-11-13T20:00:45.6486275Z PLAY [local] *******************************************************************
2026-11-13T20:00:45.6525393Z 
2026-11-13T20:00:45.6526047Z PLAY [Verificando serviços] ****************************************************
2026-11-13T20:00:45.6620046Z 
2026-11-13T20:00:45.6620620Z PLAY [Configuração LDAP] *******************************************************
2026-11-13T20:00:45.6669171Z [WARNING]: Found variable using reserved name: when
2026-11-13T20:00:45.6673936Z 
2026-11-13T20:00:45.6674121Z PLAY [jboss] *******************************************************************
2026-11-13T20:00:45.7085891Z 
2026-11-13T20:00:45.7086381Z PLAY [Stack Jboss] *************************************************************
2026-11-13T20:00:45.7110781Z 
2026-11-13T20:00:45.7111315Z PLAY [jboss] *******************************************************************
2026-11-13T20:00:45.7155705Z 
2026-11-13T20:00:45.7156085Z PLAY [jboss] *******************************************************************
2026-11-13T20:00:45.7444604Z Friday 13 November 2026  17:00:45 -0300 (0:00:00.389)       0:00:00.389 ******* 
2026-11-13T20:00:46.2563004Z 
2026-11-13T20:00:46.2563554Z TASK [Verifica se o arquivo nfs_config.json existe] ****************************
2026-11-13T20:00:46.2563714Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:00:46.2602579Z Friday 13 November 2026  17:00:46 -0300 (0:00:00.516)       0:00:00.905 ******* 
2026-11-13T20:00:46.3094633Z included: /opt/ads-agent/_work/r16140/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for caddeapllx2876.agil.nprd.caixa.gov.br
2026-11-13T20:00:46.3144878Z Friday 13 November 2026  17:00:46 -0300 (0:00:00.054)       0:00:00.959 ******* 
2026-11-13T20:00:46.3737065Z 
2026-11-13T20:00:46.3737812Z TASK [nfs : Criar variáveis] ***************************************************
2026-11-13T20:00:46.3738031Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:00:46.3797642Z Friday 13 November 2026  17:00:46 -0300 (0:00:00.065)       0:00:01.024 ******* 
2026-11-13T20:00:47.0691574Z 
2026-11-13T20:00:47.0692290Z TASK [nfs : Coletar variáveis de ambiente] *************************************
2026-11-13T20:00:47.0692537Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:00:47.0733289Z Friday 13 November 2026  17:00:47 -0300 (0:00:00.693)       0:00:01.718 ******* 
2026-11-13T20:00:47.1174411Z Friday 13 November 2026  17:00:47 -0300 (0:00:00.043)       0:00:01.762 ******* 
2026-11-13T20:00:47.1794118Z 
2026-11-13T20:00:47.1794756Z TASK [nfs : Criar variáveis] ***************************************************
2026-11-13T20:00:47.1795728Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:00:47.1845443Z Friday 13 November 2026  17:00:47 -0300 (0:00:00.067)       0:00:01.829 ******* 
2026-11-13T20:00:51.1848424Z 
2026-11-13T20:00:51.1848877Z TASK [nfs : execute montagem script] *******************************************
2026-11-13T20:00:51.1849076Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:00:51.1901242Z Friday 13 November 2026  17:00:51 -0300 (0:00:04.005)       0:00:05.835 ******* 
2026-11-13T20:00:51.2397012Z Friday 13 November 2026  17:00:51 -0300 (0:00:00.049)       0:00:05.884 ******* 
2026-11-13T20:00:51.3027501Z 
2026-11-13T20:00:51.3027963Z TASK [nfs : Normalize NFS keys] ************************************************
2026-11-13T20:00:51.3028227Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:00:51.3060590Z Friday 13 November 2026  17:00:51 -0300 (0:00:00.066)       0:00:05.951 ******* 
2026-11-13T20:00:51.3533333Z Friday 13 November 2026  17:00:51 -0300 (0:00:00.047)       0:00:05.998 ******* 
2026-11-13T20:00:51.4003584Z Friday 13 November 2026  17:00:51 -0300 (0:00:00.046)       0:00:06.045 ******* 
2026-11-13T20:00:51.4628119Z 
2026-11-13T20:00:51.4628643Z TASK [nfs : Parse JSON data from structured value] *****************************
2026-11-13T20:00:51.4629147Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:00:51.4664404Z Friday 13 November 2026  17:00:51 -0300 (0:00:00.066)       0:00:06.111 ******* 
2026-11-13T20:00:51.5142476Z Friday 13 November 2026  17:00:51 -0300 (0:00:00.047)       0:00:06.159 ******* 
2026-11-13T20:00:51.5720447Z included: /opt/ads-agent/_work/r16140/a/esteira-jboss-vm-v2/roles/nfs/tasks/prepare_networker.yml for caddeapllx2876.agil.nprd.caixa.gov.br
2026-11-13T20:00:51.5783138Z Friday 13 November 2026  17:00:51 -0300 (0:00:00.064)       0:00:06.223 ******* 
2026-11-13T20:00:55.1789676Z 
2026-11-13T20:00:55.1790527Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-11-13T20:00:55.1792229Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-11-13T20:00:55.1792961Z caddeapllx2876.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-11-13T20:00:55.1793138Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-11-13T20:00:55.1793312Z releases. A future Ansible release will default to using the discovered 
2026-11-13T20:00:55.1793474Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-11-13T20:00:55.1793631Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-11-13T20:00:55.1793795Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-11-13T20:00:55.1793940Z setting deprecation_warnings=False in ansible.cfg.
2026-11-13T20:00:55.1794072Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:00:55.1826281Z Friday 13 November 2026  17:00:55 -0300 (0:00:03.604)       0:00:09.827 ******* 
2026-11-13T20:00:55.4395966Z 
2026-11-13T20:00:55.4397007Z TASK [nfs : Verificar lgtoclnt] ************************************************
2026-11-13T20:00:55.4397260Z [WARNING]: Consider using the yum, dnf or zypper module rather than running
2026-11-13T20:00:55.4397600Z 'rpm'.  If you need to use command because yum, dnf or zypper is insufficient
2026-11-13T20:00:55.4397846Z you can add 'warn: false' to this command task or set 'command_warnings=False'
2026-11-13T20:00:55.4397994Z in ansible.cfg to get rid of this message.
2026-11-13T20:00:55.4398126Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:00:55.4436908Z Friday 13 November 2026  17:00:55 -0300 (0:00:00.260)       0:00:10.088 ******* 
2026-11-13T20:00:55.4897234Z Friday 13 November 2026  17:00:55 -0300 (0:00:00.045)       0:00:10.134 ******* 
2026-11-13T20:00:55.7427725Z 
2026-11-13T20:00:55.7428644Z TASK [nfs : Verificar lgtonmda] ************************************************
2026-11-13T20:00:55.7428921Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:00:55.7468912Z Friday 13 November 2026  17:00:55 -0300 (0:00:00.257)       0:00:10.392 ******* 
2026-11-13T20:00:55.7924710Z Friday 13 November 2026  17:00:55 -0300 (0:00:00.045)       0:00:10.437 ******* 
2026-11-13T20:00:56.2187429Z 
2026-11-13T20:00:56.2188122Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-11-13T20:00:56.2188331Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:00:56.2225729Z Friday 13 November 2026  17:00:56 -0300 (0:00:00.430)       0:00:10.867 ******* 
2026-11-13T20:00:56.4958115Z 
2026-11-13T20:00:56.4958575Z TASK [nfs : Create a symbolic link] ********************************************
2026-11-13T20:00:56.4958746Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:00:56.4997842Z Friday 13 November 2026  17:00:56 -0300 (0:00:00.277)       0:00:11.144 ******* 
2026-11-13T20:00:57.4290012Z 
2026-11-13T20:00:57.4290524Z TASK [nfs : Networker | Ensure networker started] ******************************
2026-11-13T20:00:57.4290708Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:00:57.4340427Z Friday 13 November 2026  17:00:57 -0300 (0:00:00.934)       0:00:12.079 ******* 
2026-11-13T20:00:57.6961070Z 
2026-11-13T20:00:57.6961592Z TASK [nfs : Networker | Verificar portas configuradas] *************************
2026-11-13T20:00:57.6962086Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:00:57.6997503Z Friday 13 November 2026  17:00:57 -0300 (0:00:00.265)       0:00:12.344 ******* 
2026-11-13T20:00:57.9602212Z 
2026-11-13T20:00:57.9602916Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-11-13T20:00:57.9603168Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:00:57.9639302Z Friday 13 November 2026  17:00:57 -0300 (0:00:00.264)       0:00:12.609 ******* 
2026-11-13T20:00:58.0336526Z included: /opt/ads-agent/_work/r16140/a/esteira-jboss-vm-v2/roles/nfs/tasks/mount_nfs.yml for caddeapllx2876.agil.nprd.caixa.gov.br
2026-11-13T20:00:58.0401803Z included: /opt/ads-agent/_work/r16140/a/esteira-jboss-vm-v2/roles/nfs/tasks/mount_nfs.yml for caddeapllx2876.agil.nprd.caixa.gov.br
2026-11-13T20:00:58.0490970Z Friday 13 November 2026  17:00:58 -0300 (0:00:00.085)       0:00:12.694 ******* 
2026-11-13T20:00:58.1099345Z 
2026-11-13T20:00:58.1099890Z TASK [nfs : Parse JSON data] ***************************************************
2026-11-13T20:00:58.1100057Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:00:58.1133497Z Friday 13 November 2026  17:00:58 -0300 (0:00:00.064)       0:00:12.758 ******* 
2026-11-13T20:00:58.1583960Z Friday 13 November 2026  17:00:58 -0300 (0:00:00.044)       0:00:12.803 ******* 
2026-11-13T20:00:58.2222537Z 
2026-11-13T20:00:58.2223033Z TASK [nfs : Verificando as variaveis] ******************************************
2026-11-13T20:00:58.2223208Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br] => {
2026-11-13T20:00:58.2223334Z     "changed": false, 
2026-11-13T20:00:58.2223469Z     "msg": "All assertions passed"
2026-11-13T20:00:58.2223566Z }
2026-11-13T20:00:58.2259607Z Friday 13 November 2026  17:00:58 -0300 (0:00:00.067)       0:00:12.871 ******* 
2026-11-13T20:01:10.6685758Z 
2026-11-13T20:01:10.6686759Z TASK [nfs : Validando conectividade TCP com servidor NFS] **********************
2026-11-13T20:01:10.6688515Z fatal: [caddeapllx2876.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "elapsed": 12, "msg": "Timeout when waiting for nfsctcnprd.ctc.caixa:2049"}
2026-11-13T20:01:10.6688731Z ...ignoring
2026-11-13T20:01:10.6724429Z Friday 13 November 2026  17:01:10 -0300 (0:00:12.446)       0:00:25.317 ******* 
2026-11-13T20:01:10.7335918Z 
2026-11-13T20:01:10.7336421Z TASK [nfs : Falhar quando endpoint NFS estiver indisponivel] *******************
2026-11-13T20:01:10.7336585Z fatal: [caddeapllx2876.agil.nprd.caixa.gov.br]: FAILED! => {
2026-11-13T20:01:10.7336734Z     "assertion": "nfs_tcp_check is succeeded", 
2026-11-13T20:01:10.7336854Z     "changed": false, 
2026-11-13T20:01:10.7336982Z     "evaluated_to": false, 
2026-11-13T20:01:10.7342589Z     "msg": "Endpoint NFS indisponivel (TCP/2049) a partir de caddeapllx2876.agil.nprd.caixa.gov.br: nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH - Timeout when waiting for nfsctcnprd.ctc.caixa:2049"
2026-11-13T20:01:10.7342872Z }
2026-11-13T20:01:10.7343110Z Friday 13 November 2026  17:01:10 -0300 (0:00:00.061)       0:00:25.379 ******* 
2026-11-13T20:01:10.7348890Z 
2026-11-13T20:01:10.7349039Z PLAY RECAP *********************************************************************
2026-11-13T20:01:10.7349226Z caddeapllx2876.agil.nprd.caixa.gov.br : ok=22   changed=4    unreachable=0    failed=1    skipped=8    rescued=0    ignored=1   
2026-11-13T20:01:10.7349327Z 
2026-11-13T20:01:10.7349915Z Friday 13 November 2026  17:01:10 -0300 (0:00:00.000)       0:00:25.380 ******* 
2026-11-13T20:01:10.7350171Z =============================================================================== 
2026-11-13T20:01:10.7351495Z nfs : Validando conectividade TCP com servidor NFS --------------------- 12.45s
2026-11-13T20:01:10.7351751Z nfs : execute montagem script ------------------------------------------- 4.01s
2026-11-13T20:01:10.7351973Z nfs : Instalando o NFS Client ------------------------------------------- 3.60s
2026-11-13T20:01:10.7352200Z nfs : Networker | Ensure networker started ------------------------------ 0.93s
2026-11-13T20:01:10.7352790Z nfs : Coletar variáveis de ambiente ------------------------------------- 0.69s
2026-11-13T20:01:10.7353018Z Verifica se o arquivo nfs_config.json existe ---------------------------- 0.52s
2026-11-13T20:01:10.7353240Z nfs : Remove pacote jbcs-httpd ------------------------------------------ 0.43s
2026-11-13T20:01:10.7353464Z nfs : Create a symbolic link -------------------------------------------- 0.28s
2026-11-13T20:01:10.7353689Z nfs : Networker | Verificar portas configuradas ------------------------- 0.27s
2026-11-13T20:01:10.7353952Z nfs : Executar o comando abaixo para limitar as portas ------------------ 0.26s
2026-11-13T20:01:10.7354307Z nfs : Verificar lgtoclnt ------------------------------------------------ 0.26s
2026-11-13T20:01:10.7354567Z nfs : Verificar lgtonmda ------------------------------------------------ 0.26s
2026-11-13T20:01:10.7354786Z nfs : include_tasks ----------------------------------------------------- 0.09s
2026-11-13T20:01:10.7355043Z nfs : Verificando as variaveis ------------------------------------------ 0.07s
2026-11-13T20:01:10.7355275Z nfs : Criar variáveis --------------------------------------------------- 0.07s
2026-11-13T20:01:10.7355487Z nfs : Normalize NFS keys ------------------------------------------------ 0.07s
2026-11-13T20:01:10.7355700Z nfs : Parse JSON data from structured value ----------------------------- 0.07s
2026-11-13T20:01:10.7355902Z nfs : Criar variáveis --------------------------------------------------- 0.07s
2026-11-13T20:01:10.7356130Z nfs : Parse JSON data --------------------------------------------------- 0.06s
2026-11-13T20:01:10.7356377Z nfs : include_tasks ----------------------------------------------------- 0.06s
2026-11-13T20:01:10.7356523Z Playbook run took 0 days, 0 hours, 0 minutes, 25 seconds
2026-11-13T20:01:10.8025579Z ##[error]Bash exited with code '2'.
2026-11-13T20:01:10.8055617Z ##[warning]RetryHelper encountered task failure, will retry (attempt #: 2 out of 2) after 4000 ms
2026-11-13T20:01:14.8996634Z Generating script.
2026-11-13T20:01:14.9008092Z ========================== Starting Command Output ===========================
2026-11-13T20:01:14.9015415Z [command]/bin/bash /opt/ads-agent/_work/_temp/eadfc802-6cec-49d8-b957-19411eae7fde.sh
2026-11-13T20:01:17.2433934Z 
2026-11-13T20:01:17.2443807Z PLAY [local] *******************************************************************
2026-11-13T20:01:17.2747052Z 
2026-11-13T20:01:17.2747597Z PLAY [Configurando o DNS] ******************************************************
2026-11-13T20:01:17.4678913Z 
2026-11-13T20:01:17.4679355Z PLAY [local] *******************************************************************
2026-11-13T20:01:17.4719580Z 
2026-11-13T20:01:17.4720113Z PLAY [Verificando serviços] ****************************************************
2026-11-13T20:01:17.4823259Z 
2026-11-13T20:01:17.4823541Z PLAY [Configuração LDAP] *******************************************************
2026-11-13T20:01:17.4868796Z [WARNING]: Found variable using reserved name: when
2026-11-13T20:01:17.4873779Z 
2026-11-13T20:01:17.4874029Z PLAY [jboss] *******************************************************************
2026-11-13T20:01:17.5253107Z 
2026-11-13T20:01:17.5254017Z PLAY [Stack Jboss] *************************************************************
2026-11-13T20:01:17.5279241Z 
2026-11-13T20:01:17.5279822Z PLAY [jboss] *******************************************************************
2026-11-13T20:01:17.5325077Z 
2026-11-13T20:01:17.5325516Z PLAY [jboss] *******************************************************************
2026-11-13T20:01:17.5607226Z Friday 13 November 2026  17:01:17 -0300 (0:00:00.379)       0:00:00.379 ******* 
2026-11-13T20:01:18.0584916Z 
2026-11-13T20:01:18.0585427Z TASK [Verifica se o arquivo nfs_config.json existe] ****************************
2026-11-13T20:01:18.0587173Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:01:18.0627894Z Friday 13 November 2026  17:01:18 -0300 (0:00:00.501)       0:00:00.880 ******* 
2026-11-13T20:01:18.1130997Z included: /opt/ads-agent/_work/r16140/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for caddeapllx2876.agil.nprd.caixa.gov.br
2026-11-13T20:01:18.1175036Z Friday 13 November 2026  17:01:18 -0300 (0:00:00.055)       0:00:00.936 ******* 
2026-11-13T20:01:18.1791813Z 
2026-11-13T20:01:18.1792671Z TASK [nfs : Criar variáveis] ***************************************************
2026-11-13T20:01:18.1792847Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:01:18.1845039Z Friday 13 November 2026  17:01:18 -0300 (0:00:00.066)       0:00:01.003 ******* 
2026-11-13T20:01:18.6663583Z 
2026-11-13T20:01:18.6664750Z TASK [nfs : Coletar variáveis de ambiente] *************************************
2026-11-13T20:01:18.6665014Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:01:18.6702059Z Friday 13 November 2026  17:01:18 -0300 (0:00:00.485)       0:00:01.488 ******* 
2026-11-13T20:01:18.7169071Z Friday 13 November 2026  17:01:18 -0300 (0:00:00.046)       0:00:01.535 ******* 
2026-11-13T20:01:18.7793155Z 
2026-11-13T20:01:18.7793916Z TASK [nfs : Criar variáveis] ***************************************************
2026-11-13T20:01:18.7794081Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:01:18.7843863Z Friday 13 November 2026  17:01:18 -0300 (0:00:00.067)       0:00:01.603 ******* 
2026-11-13T20:01:24.7785859Z 
2026-11-13T20:01:24.7794939Z TASK [nfs : execute montagem script] *******************************************
2026-11-13T20:01:24.7795104Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:01:24.7824347Z Friday 13 November 2026  17:01:24 -0300 (0:00:05.996)       0:00:07.599 ******* 
2026-11-13T20:01:24.8296126Z Friday 13 November 2026  17:01:24 -0300 (0:00:00.047)       0:00:07.647 ******* 
2026-11-13T20:01:24.8928380Z 
2026-11-13T20:01:24.8929241Z TASK [nfs : Normalize NFS keys] ************************************************
2026-11-13T20:01:24.8929466Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:01:24.8961483Z Friday 13 November 2026  17:01:24 -0300 (0:00:00.067)       0:00:07.714 ******* 
2026-11-13T20:01:24.9468059Z Friday 13 November 2026  17:01:24 -0300 (0:00:00.050)       0:00:07.765 ******* 
2026-11-13T20:01:24.9953480Z Friday 13 November 2026  17:01:24 -0300 (0:00:00.048)       0:00:07.813 ******* 
2026-11-13T20:01:25.0582096Z 
2026-11-13T20:01:25.0582829Z TASK [nfs : Parse JSON data from structured value] *****************************
2026-11-13T20:01:25.0583039Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:01:25.0614957Z Friday 13 November 2026  17:01:25 -0300 (0:00:00.066)       0:00:07.880 ******* 
2026-11-13T20:01:25.1103042Z Friday 13 November 2026  17:01:25 -0300 (0:00:00.048)       0:00:07.928 ******* 
2026-11-13T20:01:25.1706296Z included: /opt/ads-agent/_work/r16140/a/esteira-jboss-vm-v2/roles/nfs/tasks/prepare_networker.yml for caddeapllx2876.agil.nprd.caixa.gov.br
2026-11-13T20:01:25.1768952Z Friday 13 November 2026  17:01:25 -0300 (0:00:00.066)       0:00:07.995 ******* 
2026-11-13T20:01:28.7560987Z 
2026-11-13T20:01:28.7561446Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-11-13T20:01:28.7563556Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-11-13T20:01:28.7563916Z caddeapllx2876.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-11-13T20:01:28.7564105Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-11-13T20:01:28.7564262Z releases. A future Ansible release will default to using the discovered 
2026-11-13T20:01:28.7564426Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-11-13T20:01:28.7564589Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-11-13T20:01:28.7564776Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-11-13T20:01:28.7564911Z setting deprecation_warnings=False in ansible.cfg.
2026-11-13T20:01:28.7565057Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:01:28.7599716Z Friday 13 November 2026  17:01:28 -0300 (0:00:03.583)       0:00:11.578 ******* 
2026-11-13T20:01:29.0137475Z 
2026-11-13T20:01:29.0138048Z TASK [nfs : Verificar lgtoclnt] ************************************************
2026-11-13T20:01:29.0139544Z [WARNING]: Consider using the yum, dnf or zypper module rather than running
2026-11-13T20:01:29.0139897Z 'rpm'.  If you need to use command because yum, dnf or zypper is insufficient
2026-11-13T20:01:29.0140108Z you can add 'warn: false' to this command task or set 'command_warnings=False'
2026-11-13T20:01:29.0140257Z in ansible.cfg to get rid of this message.
2026-11-13T20:01:29.0140390Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:01:29.0176951Z Friday 13 November 2026  17:01:29 -0300 (0:00:00.257)       0:00:11.836 ******* 
2026-11-13T20:01:29.0745008Z Friday 13 November 2026  17:01:29 -0300 (0:00:00.056)       0:00:11.893 ******* 
2026-11-13T20:01:29.3368395Z 
2026-11-13T20:01:29.3368899Z TASK [nfs : Verificar lgtonmda] ************************************************
2026-11-13T20:01:29.3369489Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:01:29.3408435Z Friday 13 November 2026  17:01:29 -0300 (0:00:00.266)       0:00:12.159 ******* 
2026-11-13T20:01:29.3867529Z Friday 13 November 2026  17:01:29 -0300 (0:00:00.045)       0:00:12.205 ******* 
2026-11-13T20:01:29.8415536Z 
2026-11-13T20:01:29.8416491Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-11-13T20:01:29.8416751Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:01:29.8460654Z Friday 13 November 2026  17:01:29 -0300 (0:00:00.459)       0:00:12.664 ******* 
2026-11-13T20:01:30.0969717Z 
2026-11-13T20:01:30.0970825Z TASK [nfs : Create a symbolic link] ********************************************
2026-11-13T20:01:30.0971038Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:01:30.1008967Z Friday 13 November 2026  17:01:30 -0300 (0:00:00.254)       0:00:12.919 ******* 
2026-11-13T20:01:31.0338825Z 
2026-11-13T20:01:31.0339339Z TASK [nfs : Networker | Ensure networker started] ******************************
2026-11-13T20:01:31.0339501Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:01:31.0387593Z Friday 13 November 2026  17:01:31 -0300 (0:00:00.937)       0:00:13.857 ******* 
2026-11-13T20:01:31.3040665Z 
2026-11-13T20:01:31.3041211Z TASK [nfs : Networker | Verificar portas configuradas] *************************
2026-11-13T20:01:31.3041443Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:01:31.3082246Z Friday 13 November 2026  17:01:31 -0300 (0:00:00.269)       0:00:14.126 ******* 
2026-11-13T20:01:31.5720658Z 
2026-11-13T20:01:31.5721163Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-11-13T20:01:31.5721350Z changed: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:01:31.5756375Z Friday 13 November 2026  17:01:31 -0300 (0:00:00.267)       0:00:14.394 ******* 
2026-11-13T20:01:31.6447277Z included: /opt/ads-agent/_work/r16140/a/esteira-jboss-vm-v2/roles/nfs/tasks/mount_nfs.yml for caddeapllx2876.agil.nprd.caixa.gov.br
2026-11-13T20:01:31.6508158Z included: /opt/ads-agent/_work/r16140/a/esteira-jboss-vm-v2/roles/nfs/tasks/mount_nfs.yml for caddeapllx2876.agil.nprd.caixa.gov.br
2026-11-13T20:01:31.6594246Z Friday 13 November 2026  17:01:31 -0300 (0:00:00.083)       0:00:14.478 ******* 
2026-11-13T20:01:31.7207158Z 
2026-11-13T20:01:31.7207667Z TASK [nfs : Parse JSON data] ***************************************************
2026-11-13T20:01:31.7207826Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br]
2026-11-13T20:01:31.7242313Z Friday 13 November 2026  17:01:31 -0300 (0:00:00.064)       0:00:14.542 ******* 
2026-11-13T20:01:31.7717795Z Friday 13 November 2026  17:01:31 -0300 (0:00:00.047)       0:00:14.590 ******* 
2026-11-13T20:01:31.8379245Z 
2026-11-13T20:01:31.8380090Z TASK [nfs : Verificando as variaveis] ******************************************
2026-11-13T20:01:31.8380338Z ok: [caddeapllx2876.agil.nprd.caixa.gov.br] => {
2026-11-13T20:01:31.8380799Z     "changed": false, 
2026-11-13T20:01:31.8380918Z     "msg": "All assertions passed"
2026-11-13T20:01:31.8381018Z }
2026-11-13T20:01:31.8416860Z Friday 13 November 2026  17:01:31 -0300 (0:00:00.070)       0:00:14.660 ******* 
2026-11-13T20:01:44.3289632Z 
2026-11-13T20:01:44.3290182Z TASK [nfs : Validando conectividade TCP com servidor NFS] **********************
2026-11-13T20:01:44.3291412Z fatal: [caddeapllx2876.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "elapsed": 12, "msg": "Timeout when waiting for nfsctcnprd.ctc.caixa:2049"}
2026-11-13T20:01:44.3291590Z ...ignoring
2026-11-13T20:01:44.3328005Z Friday 13 November 2026  17:01:44 -0300 (0:00:12.491)       0:00:27.151 ******* 
2026-11-13T20:01:44.3928580Z 
2026-11-13T20:01:44.3929341Z TASK [nfs : Falhar quando endpoint NFS estiver indisponivel] *******************
2026-11-13T20:01:44.3930035Z fatal: [caddeapllx2876.agil.nprd.caixa.gov.br]: FAILED! => {
2026-11-13T20:01:44.3930227Z     "assertion": "nfs_tcp_check is succeeded", 
2026-11-13T20:01:44.3930366Z     "changed": false, 
2026-11-13T20:01:44.3930473Z     "evaluated_to": false, 
2026-11-13T20:01:44.3930983Z     "msg": "Endpoint NFS indisponivel (TCP/2049) a partir de caddeapllx2876.agil.nprd.caixa.gov.br: nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH - Timeout when waiting for nfsctcnprd.ctc.caixa:2049"
2026-11-13T20:01:44.3931178Z }
2026-11-13T20:01:44.3935529Z Friday 13 November 2026  17:01:44 -0300 (0:00:00.060)       0:00:27.212 ******* 
2026-11-13T20:01:44.3943218Z 
2026-11-13T20:01:44.3943352Z PLAY RECAP *********************************************************************
2026-11-13T20:01:44.3944169Z caddeapllx2876.agil.nprd.caixa.gov.br : ok=22   changed=4    unreachable=0    failed=1    skipped=8    rescued=0    ignored=1   
2026-11-13T20:01:44.3944289Z 
2026-11-13T20:01:44.3945233Z Friday 13 November 2026  17:01:44 -0300 (0:00:00.000)       0:00:27.213 ******* 
2026-11-13T20:01:44.3945419Z =============================================================================== 
2026-11-13T20:01:44.3948908Z nfs : Validando conectividade TCP com servidor NFS --------------------- 12.49s
2026-11-13T20:01:44.3949130Z nfs : execute montagem script ------------------------------------------- 6.00s
2026-11-13T20:01:44.3949347Z nfs : Instalando o NFS Client ------------------------------------------- 3.58s
2026-11-13T20:01:44.3949578Z nfs : Networker | Ensure networker started ------------------------------ 0.94s
2026-11-13T20:01:44.3949948Z Verifica se o arquivo nfs_config.json existe ---------------------------- 0.50s
2026-11-13T20:01:44.3950217Z nfs : Coletar variáveis de ambiente ------------------------------------- 0.49s
2026-11-13T20:01:44.3950462Z nfs : Remove pacote jbcs-httpd ------------------------------------------ 0.46s
2026-11-13T20:01:44.3950677Z nfs : Networker | Verificar portas configuradas ------------------------- 0.27s
2026-11-13T20:01:44.3950894Z nfs : Executar o comando abaixo para limitar as portas ------------------ 0.27s
2026-11-13T20:01:44.3951119Z nfs : Verificar lgtonmda ------------------------------------------------ 0.27s
2026-11-13T20:01:44.3951333Z nfs : Verificar lgtoclnt ------------------------------------------------ 0.26s
2026-11-13T20:01:44.3951534Z nfs : Create a symbolic link -------------------------------------------- 0.25s
2026-11-13T20:01:44.3951749Z nfs : include_tasks ----------------------------------------------------- 0.08s
2026-11-13T20:01:44.3951966Z nfs : Verificando as variaveis ------------------------------------------ 0.07s
2026-11-13T20:01:44.3952182Z nfs : Criar variáveis --------------------------------------------------- 0.07s
2026-11-13T20:01:44.3952511Z nfs : Normalize NFS keys ------------------------------------------------ 0.07s
2026-11-13T20:01:44.3952737Z nfs : Criar variáveis --------------------------------------------------- 0.07s
2026-11-13T20:01:44.3952951Z nfs : include_tasks ----------------------------------------------------- 0.07s
2026-11-13T20:01:44.3953162Z nfs : Parse JSON data from structured value ----------------------------- 0.07s
2026-11-13T20:01:44.3953644Z nfs : Parse JSON data --------------------------------------------------- 0.06s
2026-11-13T20:01:44.3953782Z Playbook run took 0 days, 0 hours, 0 minutes, 27 seconds
2026-11-13T20:01:44.4663944Z ##[error]Bash exited with code '2'.
2026-11-13T20:01:44.4695720Z ##[section]Finishing: Configura Control-M
