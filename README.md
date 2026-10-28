2026-10-28T19:47:29.2917654Z ##[section]Starting: Check Deployments [JBOSS]
2026-10-28T19:47:29.2921537Z ==============================================================================
2026-10-28T19:47:29.2921650Z Task         : Bash
2026-10-28T19:47:29.2921716Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-28T19:47:29.2921793Z Version      : 3.227.0
2026-10-28T19:47:29.2921941Z Author       : Microsoft Corporation
2026-10-28T19:47:29.2922013Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-28T19:47:29.2922136Z ==============================================================================
2026-10-28T19:47:30.2183993Z Generating script.
2026-10-28T19:47:30.2191613Z Script contents:
2026-10-28T19:47:30.2192151Z ansible-playbook /opt/ads-agent/_work/r18036/a/esteira-jboss-vm-v2/site.yml --tags check_deployments -e sistema_ambiente=des -e sistema_nome=sigsj-intranet -e site=ctc_nprd
2026-10-28T19:47:30.2195439Z ========================== Starting Command Output ===========================
2026-10-28T19:47:30.2207482Z [command]/bin/bash /opt/ads-agent/_work/_temp/8739315c-0bad-4e0f-b10c-68936bd132f2.sh
2026-10-28T19:47:32.3059790Z 
2026-10-28T19:47:32.3060299Z PLAY [local] *******************************************************************
2026-10-28T19:47:32.3325482Z 
2026-10-28T19:47:32.3325967Z PLAY [Configurando o DNS] ******************************************************
2026-10-28T19:47:32.5049399Z 
2026-10-28T19:47:32.5049914Z PLAY [local] *******************************************************************
2026-10-28T19:47:32.5082985Z 
2026-10-28T19:47:32.5083727Z PLAY [Verificando serviços] ****************************************************
2026-10-28T19:47:32.5168826Z 
2026-10-28T19:47:32.5169267Z PLAY [Configuração LDAP] *******************************************************
2026-10-28T19:47:32.5201098Z [WARNING]: Found variable using reserved name: when
2026-10-28T19:47:32.5205772Z 
2026-10-28T19:47:32.5206190Z PLAY [jboss] *******************************************************************
2026-10-28T19:47:32.5282631Z 
2026-10-28T19:47:32.5282939Z PLAY [Stack Jboss] *************************************************************
2026-10-28T19:47:32.5509914Z Wednesday 28 October 2026  16:47:32 -0300 (0:00:00.304)       0:00:00.304 ***** 
2026-10-28T19:47:33.0603272Z 
2026-10-28T19:47:33.0606718Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-10-28T19:47:33.0606930Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-10-28T19:47:33.0607158Z caddeapllx955.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-10-28T19:47:33.0607326Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-10-28T19:47:33.0607485Z releases. A future Ansible release will default to using the discovered 
2026-10-28T19:47:33.0607647Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-10-28T19:47:33.0607808Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-10-28T19:47:33.0607977Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-10-28T19:47:33.0608120Z setting deprecation_warnings=False in ansible.cfg.
2026-10-28T19:47:33.0608255Z ok: [caddeapllx955.agil.nprd.caixa.gov.br]
2026-10-28T19:47:33.0626930Z 
2026-10-28T19:47:33.0627446Z PLAY [jboss] *******************************************************************
2026-10-28T19:47:33.0669940Z 
2026-10-28T19:47:33.0670207Z PLAY [jboss] *******************************************************************
2026-10-28T19:47:33.0708650Z 
2026-10-28T19:47:33.0708946Z PLAY [jboss] *******************************************************************
2026-10-28T19:47:33.0733930Z 
2026-10-28T19:47:33.0734230Z PLAY [Copiando deployments adicionais] *****************************************
2026-10-28T19:47:33.0757736Z 
2026-10-28T19:47:33.0758121Z PLAY [Copiando modules adicionais] *********************************************
2026-10-28T19:47:33.0785137Z 
2026-10-28T19:47:33.0785313Z PLAY [jboss] *******************************************************************
2026-10-28T19:47:33.0816844Z 
2026-10-28T19:47:33.0817037Z PLAY [jboss] *******************************************************************
2026-10-28T19:47:33.0845258Z 
2026-10-28T19:47:33.0845427Z PLAY [jboss] *******************************************************************
2026-10-28T19:47:33.0885974Z Wednesday 28 October 2026  16:47:33 -0300 (0:00:00.537)       0:00:00.842 ***** 
2026-10-28T19:47:33.5020065Z 
2026-10-28T19:47:33.5020611Z TASK [Wait for Jboss Management port] ******************************************
2026-10-28T19:47:33.5020784Z ok: [caddeapllx955.agil.nprd.caixa.gov.br]
2026-10-28T19:47:33.5050099Z Wednesday 28 October 2026  16:47:33 -0300 (0:00:00.416)       0:00:01.258 ***** 
2026-10-28T19:47:34.2213051Z 
2026-10-28T19:47:34.2213689Z TASK [Check if Jboss is Running] ***********************************************
2026-10-28T19:47:34.2214167Z ok: [caddeapllx955.agil.nprd.caixa.gov.br]
2026-10-28T19:47:34.2242380Z Wednesday 28 October 2026  16:47:34 -0300 (0:00:00.719)       0:00:01.978 ***** 
2026-10-28T19:47:34.7097536Z FAILED - RETRYING: Check Deployment details looking for status OK (60 retries left).
2026-10-28T19:47:40.0706726Z FAILED - RETRYING: Check Deployment details looking for status OK (59 retries left).
2026-10-28T19:47:47.9392084Z 
2026-10-28T19:47:47.9392641Z TASK [Check Deployment details looking for status OK] **************************
2026-10-28T19:47:47.9392810Z ok: [caddeapllx955.agil.nprd.caixa.gov.br]
2026-10-28T19:47:47.9424924Z Wednesday 28 October 2026  16:47:47 -0300 (0:00:13.718)       0:00:15.696 ***** 
2026-10-28T19:47:48.3383716Z 
2026-10-28T19:47:48.3384222Z TASK [Procura pacotes com falha ou undeployed] *********************************
2026-10-28T19:47:48.3384606Z ok: [caddeapllx955.agil.nprd.caixa.gov.br]
2026-10-28T19:47:48.3421829Z Wednesday 28 October 2026  16:47:48 -0300 (0:00:00.399)       0:00:16.096 ***** 
2026-10-28T19:47:48.3985868Z 
2026-10-28T19:47:48.3986804Z TASK [Valida deployments] ******************************************************
2026-10-28T19:47:48.3987093Z fatal: [caddeapllx955.agil.nprd.caixa.gov.br]: FAILED! => {
2026-10-28T19:47:48.3987265Z     "assertion": "files_failed.matched == 0", 
2026-10-28T19:47:48.3987387Z     "changed": false, 
2026-10-28T19:47:48.3987491Z     "evaluated_to": false, 
2026-10-28T19:47:48.3987883Z     "msg": "Deployments com problema: [u'/opt/jboss-eap/standalone/deployments/sirotcon-ejb.jar.undeployed']"
2026-10-28T19:47:48.3988026Z }
2026-10-28T19:47:48.3992302Z 
2026-10-28T19:47:48.3992719Z PLAY RECAP *********************************************************************
2026-10-28T19:47:48.3993099Z caddeapllx955.agil.nprd.caixa.gov.br : ok=5    changed=0    unreachable=0    failed=1    skipped=0    rescued=0    ignored=0   
2026-10-28T19:47:48.3993327Z 
2026-10-28T19:47:48.3994379Z Wednesday 28 October 2026  16:47:48 -0300 (0:00:00.057)       0:00:16.153 ***** 
2026-10-28T19:47:48.3994562Z =============================================================================== 
2026-10-28T19:47:48.3995879Z Check Deployment details looking for status OK ------------------------- 13.72s
2026-10-28T19:47:48.3996108Z Check if Jboss is Running ----------------------------------------------- 0.72s
2026-10-28T19:47:48.3996353Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.54s
2026-10-28T19:47:48.3996598Z Wait for Jboss Management port ------------------------------------------ 0.42s
2026-10-28T19:47:48.3996829Z Procura pacotes com falha ou undeployed --------------------------------- 0.40s
2026-10-28T19:47:48.3997054Z Valida deployments ------------------------------------------------------ 0.06s
2026-10-28T19:47:48.3997203Z Playbook run took 0 days, 0 hours, 0 minutes, 16 seconds
2026-10-28T19:47:48.4564298Z ##[error]Bash exited with code '2'.
2026-10-28T19:47:48.4578663Z ##[section]Finishing: Check Deployments [JBOSS]





mais o deploy flaha
