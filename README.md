
2026-11-17T14:06:27.8596620Z ##[section]Starting: Check Deployments [JBOSS]
2026-11-17T14:06:27.8599693Z ==============================================================================
2026-11-17T14:06:27.8599790Z Task         : Bash
2026-11-17T14:06:27.8599831Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-17T14:06:27.8599892Z Version      : 3.227.0
2026-11-17T14:06:27.8599944Z Author       : Microsoft Corporation
2026-11-17T14:06:27.8599991Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-17T14:06:27.8600059Z ==============================================================================
2026-11-17T14:06:27.9766819Z Generating script.
2026-11-17T14:06:27.9775239Z Script contents:
2026-11-17T14:06:27.9776010Z ansible-playbook /opt/ads-agent/_work/r19593/a/esteira-jboss-vm-v2/site.yml --tags check_deployments -e sistema_ambiente=des -e sistema_nome=sigec-portabilidade -e site=ctc_nprd
2026-11-17T14:06:27.9779150Z ========================== Starting Command Output ===========================
2026-11-17T14:06:27.9785602Z [command]/bin/bash /opt/ads-agent/_work/_temp/9aa0e8b1-4107-42a9-bd7f-0ac0ba280fdd.sh
2026-11-17T14:06:30.2805597Z 
2026-11-17T14:06:30.2806332Z PLAY [local] *******************************************************************
2026-11-17T14:06:30.3107255Z 
2026-11-17T14:06:30.3108014Z PLAY [Configurando o DNS] ******************************************************
2026-11-17T14:06:30.5051537Z 
2026-11-17T14:06:30.5052269Z PLAY [local] *******************************************************************
2026-11-17T14:06:30.5088964Z 
2026-11-17T14:06:30.5089562Z PLAY [Verificando serviços] ****************************************************
2026-11-17T14:06:30.5191752Z 
2026-11-17T14:06:30.5192189Z PLAY [Configuração LDAP] *******************************************************
2026-11-17T14:06:30.5238034Z [WARNING]: Found variable using reserved name: when
2026-11-17T14:06:30.5244150Z 
2026-11-17T14:06:30.5244386Z PLAY [jboss] *******************************************************************
2026-11-17T14:06:30.5626761Z 
2026-11-17T14:06:30.5627557Z PLAY [Stack Jboss] *************************************************************
2026-11-17T14:06:30.5864349Z Tuesday 17 November 2026  11:06:30 -0300 (0:00:00.367)       0:00:00.367 ****** 
2026-11-17T14:06:31.0836502Z 
2026-11-17T14:06:31.0837192Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-11-17T14:06:31.0838146Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-11-17T14:06:31.0838380Z caddeapllx2871.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-11-17T14:06:31.0838550Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-11-17T14:06:31.0839082Z releases. A future Ansible release will default to using the discovered 
2026-11-17T14:06:31.0839319Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-11-17T14:06:31.0839489Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-11-17T14:06:31.0839682Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-11-17T14:06:31.0840113Z setting deprecation_warnings=False in ansible.cfg.
2026-11-17T14:06:31.0840390Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-17T14:06:31.0869433Z 
2026-11-17T14:06:31.0869713Z PLAY [jboss] *******************************************************************
2026-11-17T14:06:31.0921273Z 
2026-11-17T14:06:31.0974408Z PLAY [jboss] *******************************************************************
2026-11-17T14:06:31.0974508Z 
2026-11-17T14:06:31.0974643Z PLAY [jboss] *******************************************************************
2026-11-17T14:06:31.1004363Z 
2026-11-17T14:06:31.1004898Z PLAY [Copiando deployments adicionais] *****************************************
2026-11-17T14:06:31.1032409Z 
2026-11-17T14:06:31.1032654Z PLAY [Copiando modules adicionais] *********************************************
2026-11-17T14:06:31.1058600Z 
2026-11-17T14:06:31.1059122Z PLAY [jboss] *******************************************************************
2026-11-17T14:06:31.1094804Z 
2026-11-17T14:06:31.1095017Z PLAY [jboss] *******************************************************************
2026-11-17T14:06:31.1131937Z 
2026-11-17T14:06:31.1132348Z PLAY [jboss] *******************************************************************
2026-11-17T14:06:31.1178065Z Tuesday 17 November 2026  11:06:31 -0300 (0:00:00.531)       0:00:00.898 ****** 
2026-11-17T14:09:51.7513035Z 
2026-11-17T14:09:51.7515358Z TASK [Wait for Jboss Management port] ******************************************
2026-11-17T14:09:51.7515629Z fatal: [caddeapllx2871.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "elapsed": 200, "msg": "Timeout when waiting for 10.116.202.61:9990"}
2026-11-17T14:09:51.7540910Z Tuesday 17 November 2026  11:09:51 -0300 (0:03:20.636)       0:03:21.534 ****** 
2026-11-17T14:09:58.6048860Z 
2026-11-17T14:09:58.6049462Z TASK [systemd] *****************************************************************
2026-11-17T14:09:58.6051651Z changed: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-17T14:09:58.6075739Z Tuesday 17 November 2026  11:09:58 -0300 (0:00:06.853)       0:03:28.388 ****** 
2026-11-17T14:13:19.3880668Z 
2026-11-17T14:13:19.3886385Z TASK [Wait for Jboss Management port] ******************************************
2026-11-17T14:13:19.3886678Z fatal: [caddeapllx2871.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "elapsed": 200, "msg": "Timeout when waiting for 10.116.202.61:9990"}
2026-11-17T14:13:19.3893956Z 
2026-11-17T14:13:19.3894139Z PLAY RECAP *********************************************************************
2026-11-17T14:13:19.3896977Z caddeapllx2871.agil.nprd.caixa.gov.br : ok=2    changed=1    unreachable=0    failed=1    skipped=0    rescued=1    ignored=0   
2026-11-17T14:13:19.3897347Z 
2026-11-17T14:13:19.3897843Z Tuesday 17 November 2026  11:13:19 -0300 (0:03:20.782)       0:06:49.170 ****** 
2026-11-17T14:13:19.3898034Z =============================================================================== 
2026-11-17T14:13:19.3898818Z Wait for Jboss Management port ---------------------------------------- 200.78s
2026-11-17T14:13:19.3899108Z Wait for Jboss Management port ---------------------------------------- 200.64s
2026-11-17T14:13:19.3899330Z systemd ----------------------------------------------------------------- 6.85s
2026-11-17T14:13:19.3899565Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.53s
2026-11-17T14:13:19.3899704Z Playbook run took 0 days, 0 hours, 6 minutes, 49 seconds
2026-11-17T14:13:19.4583254Z ##[error]Bash exited with code '2'.
2026-11-17T14:13:19.4615986Z ##[section]Finishing: Check Deployments [JBOSS]



Warning: Permanently added '10.116.202.61' (ED25519) to the list of known hosts.
p585600@10.116.202.61's password:
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$ ps -ef | grep jboss
p585600   134339  134137  0 11:04 pts/1    00:00:00 grep --color=auto jboss
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$ ps -ef | grep java
p585600   134341  134137  0 11:04 pts/1    00:00:00 grep --color=auto java
[p585600@caddeapllx2871 ~]$




