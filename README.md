2026-10-20T18:01:37.4762696Z ##[section]Starting: Check Deployments [JBOSS]
2026-10-20T18:01:37.4765434Z ==============================================================================
2026-10-20T18:01:37.4765508Z Task         : Bash
2026-10-20T18:01:37.4765557Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-20T18:01:37.4765616Z Version      : 3.227.0
2026-10-20T18:01:37.4765660Z Author       : Microsoft Corporation
2026-10-20T18:01:37.4765716Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-20T18:01:37.4765793Z ==============================================================================
2026-10-20T18:01:38.3009405Z Generating script.
2026-10-20T18:01:38.3017090Z Script contents:
2026-10-20T18:01:38.3017650Z ansible-playbook /opt/ads-agent/_work/r6119/a/esteira-jboss-vm-v2/site.yml --tags check_deployments -e sistema_ambiente=des -e sistema_nome=sigsj-intranet -e site=ctc_nprd
2026-10-20T18:01:38.3020868Z ========================== Starting Command Output ===========================
2026-10-20T18:01:38.3027719Z [command]/bin/bash /opt/ads-agent/_work/_temp/febdbd08-d5a1-4192-b821-0b7c0f206b88.sh
2026-10-20T18:01:40.2852431Z 
2026-10-20T18:01:40.2852942Z PLAY [local] *******************************************************************
2026-10-20T18:01:40.3122964Z 
2026-10-20T18:01:40.3123253Z PLAY [Configurando o DNS] ******************************************************
2026-10-20T18:01:40.4948164Z 
2026-10-20T18:01:40.4948998Z PLAY [local] *******************************************************************
2026-10-20T18:01:40.4976879Z 
2026-10-20T18:01:40.4977615Z PLAY [Verificando serviços] ****************************************************
2026-10-20T18:01:40.5054989Z 
2026-10-20T18:01:40.5055426Z PLAY [Configuração LDAP] *******************************************************
2026-10-20T18:01:40.5086819Z [WARNING]: Found variable using reserved name: when
2026-10-20T18:01:40.5091969Z 
2026-10-20T18:01:40.5092222Z PLAY [jboss] *******************************************************************
2026-10-20T18:01:40.5172496Z 
2026-10-20T18:01:40.5172770Z PLAY [Stack Jboss] *************************************************************
2026-10-20T18:01:40.5394540Z Tuesday 20 October 2026  15:01:40 -0300 (0:00:00.314)       0:00:00.314 ******* 
2026-10-20T18:01:41.0047041Z 
2026-10-20T18:01:41.0047721Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-10-20T18:01:41.0047898Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-10-20T18:01:41.0048150Z caddeapllx955.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-10-20T18:01:41.0048329Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-10-20T18:01:41.0048487Z releases. A future Ansible release will default to using the discovered 
2026-10-20T18:01:41.0048644Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-10-20T18:01:41.0048805Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-10-20T18:01:41.0048962Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-10-20T18:01:41.0049104Z setting deprecation_warnings=False in ansible.cfg.
2026-10-20T18:01:41.0050058Z ok: [caddeapllx955.agil.nprd.caixa.gov.br]
2026-10-20T18:01:41.0071468Z 
2026-10-20T18:01:41.0071993Z PLAY [jboss] *******************************************************************
2026-10-20T18:01:41.0114046Z 
2026-10-20T18:01:41.0114392Z PLAY [jboss] *******************************************************************
2026-10-20T18:01:41.0152919Z 
2026-10-20T18:01:41.0153169Z PLAY [jboss] *******************************************************************
2026-10-20T18:01:41.0179106Z 
2026-10-20T18:01:41.0179351Z PLAY [Copiando deployments adicionais] *****************************************
2026-10-20T18:01:41.0203921Z 
2026-10-20T18:01:41.0204934Z PLAY [Copiando modules adicionais] *********************************************
2026-10-20T18:01:41.0230529Z 
2026-10-20T18:01:41.0230691Z PLAY [jboss] *******************************************************************
2026-10-20T18:01:41.0263861Z 
2026-10-20T18:01:41.0264146Z PLAY [jboss] *******************************************************************
2026-10-20T18:01:41.0293555Z 
2026-10-20T18:01:41.0293755Z PLAY [jboss] *******************************************************************
2026-10-20T18:01:41.0332834Z Tuesday 20 October 2026  15:01:41 -0300 (0:00:00.493)       0:00:00.808 ******* 
2026-10-20T18:05:01.5950894Z 
2026-10-20T18:05:01.5951509Z TASK [Wait for Jboss Management port] ******************************************
2026-10-20T18:05:01.5952553Z fatal: [caddeapllx955.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "elapsed": 200, "msg": "Timeout when waiting for 10.116.194.179:9990"}
2026-10-20T18:05:01.5975166Z Tuesday 20 October 2026  15:05:01 -0300 (0:03:20.564)       0:03:21.372 ******* 
2026-10-20T18:05:08.3309140Z 
2026-10-20T18:05:08.3309696Z TASK [systemd] *****************************************************************
2026-10-20T18:05:08.3309876Z changed: [caddeapllx955.agil.nprd.caixa.gov.br]
2026-10-20T18:05:08.3364527Z Tuesday 20 October 2026  15:05:08 -0300 (0:00:06.738)       0:03:28.111 ******* 
2026-10-20T18:08:28.7961629Z 
2026-10-20T18:08:28.7962285Z TASK [Wait for Jboss Management port] ******************************************
2026-10-20T18:08:28.7964342Z fatal: [caddeapllx955.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "elapsed": 200, "msg": "Timeout when waiting for 10.116.194.179:9990"}
2026-10-20T18:08:28.7970119Z 
2026-10-20T18:08:28.7970467Z PLAY RECAP *********************************************************************
2026-10-20T18:08:28.7971659Z caddeapllx955.agil.nprd.caixa.gov.br : ok=2    changed=1    unreachable=0    failed=1    skipped=0    rescued=1    ignored=0   
2026-10-20T18:08:28.7972018Z 
2026-10-20T18:08:28.7972724Z Tuesday 20 October 2026  15:08:28 -0300 (0:03:20.460)       0:06:48.572 ******* 
2026-10-20T18:08:28.7972938Z =============================================================================== 
2026-10-20T18:08:28.7973184Z Wait for Jboss Management port ---------------------------------------- 200.56s
2026-10-20T18:08:28.7973414Z Wait for Jboss Management port ---------------------------------------- 200.46s
2026-10-20T18:08:28.7973642Z systemd ----------------------------------------------------------------- 6.74s
2026-10-20T18:08:28.7973876Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.49s
2026-10-20T18:08:28.7974026Z Playbook run took 0 days, 0 hours, 6 minutes, 48 seconds
2026-10-20T18:08:28.8552680Z ##[error]Bash exited with code '2'.
2026-10-20T18:08:28.8582400Z ##[section]Finishing: Check Deployments [JBOSS]
