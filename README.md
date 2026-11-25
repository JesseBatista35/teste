2026-11-25T17:14:06.2344711Z ##[section]Starting: Check Deployments [JBOSS]
2026-11-25T17:14:06.2347876Z ==============================================================================
2026-11-25T17:14:06.2347961Z Task         : Bash
2026-11-25T17:14:06.2348001Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-25T17:14:06.2348065Z Version      : 3.227.0
2026-11-25T17:14:06.2348115Z Author       : Microsoft Corporation
2026-11-25T17:14:06.2348160Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-25T17:14:06.2348227Z ==============================================================================
2026-11-25T17:14:07.3304856Z Generating script.
2026-11-25T17:14:07.3312657Z Script contents:
2026-11-25T17:14:07.3313271Z ansible-playbook /opt/ads-agent/_work/r12503/a/esteira-jboss-vm-v2/site.yml --tags check_deployments -e sistema_ambiente=des -e sistema_nome=sigec-portabilidade-online -e site=ctc_nprd
2026-11-25T17:14:07.3315790Z ========================== Starting Command Output ===========================
2026-11-25T17:14:07.3325682Z [command]/bin/bash /opt/ads-agent/_work/_temp/a98daa7d-c99a-40ed-aaa4-e90fd34a0bde.sh
2026-11-25T17:14:09.5648512Z 
2026-11-25T17:14:09.5649122Z PLAY [local] *******************************************************************
2026-11-25T17:14:09.5935158Z 
2026-11-25T17:14:09.5935723Z PLAY [Configurando o DNS] ******************************************************
2026-11-25T17:14:09.8068587Z 
2026-11-25T17:14:09.8069220Z PLAY [local] *******************************************************************
2026-11-25T17:14:09.8104084Z 
2026-11-25T17:14:09.8104443Z PLAY [Verificando serviços] ****************************************************
2026-11-25T17:14:09.8198483Z 
2026-11-25T17:14:09.8199011Z PLAY [Configuração LDAP] *******************************************************
2026-11-25T17:14:09.8242238Z [WARNING]: Found variable using reserved name: when
2026-11-25T17:14:09.8247147Z 
2026-11-25T17:14:09.8247289Z PLAY [jboss] *******************************************************************
2026-11-25T17:14:09.8602775Z 
2026-11-25T17:14:09.8603252Z PLAY [Stack Jboss] *************************************************************
2026-11-25T17:14:09.8834000Z Wednesday 25 November 2026  14:14:09 -0300 (0:00:00.388)       0:00:00.388 **** 
2026-11-25T17:14:10.3798575Z 
2026-11-25T17:14:10.3799299Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-11-25T17:14:10.3800009Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-11-25T17:14:10.3800974Z caddeapllx2871.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-11-25T17:14:10.3801286Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-11-25T17:14:10.3801556Z releases. A future Ansible release will default to using the discovered 
2026-11-25T17:14:10.3801820Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-11-25T17:14:10.3802083Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-11-25T17:14:10.3802375Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-11-25T17:14:10.3802609Z setting deprecation_warnings=False in ansible.cfg.
2026-11-25T17:14:10.3802832Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-25T17:14:10.3831673Z 
2026-11-25T17:14:10.3831969Z PLAY [jboss] *******************************************************************
2026-11-25T17:14:10.3884699Z 
2026-11-25T17:14:10.3884874Z PLAY [jboss] *******************************************************************
2026-11-25T17:14:10.3930548Z 
2026-11-25T17:14:10.3930927Z PLAY [jboss] *******************************************************************
2026-11-25T17:14:10.3956843Z 
2026-11-25T17:14:10.3957064Z PLAY [Copiando deployments adicionais] *****************************************
2026-11-25T17:14:10.3985310Z 
2026-11-25T17:14:10.3985641Z PLAY [Copiando modules adicionais] *********************************************
2026-11-25T17:14:10.4012290Z 
2026-11-25T17:14:10.4012738Z PLAY [jboss] *******************************************************************
2026-11-25T17:14:10.4047402Z 
2026-11-25T17:14:10.4047553Z PLAY [jboss] *******************************************************************
2026-11-25T17:14:10.4083503Z 
2026-11-25T17:14:10.4083937Z PLAY [jboss] *******************************************************************
2026-11-25T17:14:10.4127955Z Wednesday 25 November 2026  14:14:10 -0300 (0:00:00.529)       0:00:00.918 **** 
2026-11-25T17:17:30.9807433Z 
2026-11-25T17:17:30.9807989Z TASK [Wait for Jboss Management port] ******************************************
2026-11-25T17:17:30.9808225Z fatal: [caddeapllx2871.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "elapsed": 200, "msg": "Timeout when waiting for 10.116.202.61:9990"}
2026-11-25T17:17:30.9834035Z Wednesday 25 November 2026  14:17:30 -0300 (0:03:20.570)       0:03:21.488 **** 
2026-11-25T17:17:37.7924129Z 
2026-11-25T17:17:37.7924648Z TASK [systemd] *****************************************************************
2026-11-25T17:17:37.7926673Z changed: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-25T17:17:37.7964929Z Wednesday 25 November 2026  14:17:37 -0300 (0:00:06.813)       0:03:28.302 **** 
2026-11-25T17:20:58.3430258Z 
2026-11-25T17:20:58.3431315Z TASK [Wait for Jboss Management port] ******************************************
2026-11-25T17:20:58.3432019Z fatal: [caddeapllx2871.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "elapsed": 200, "msg": "Timeout when waiting for 10.116.202.61:9990"}
2026-11-25T17:20:58.3441794Z 
2026-11-25T17:20:58.3443647Z PLAY RECAP *********************************************************************
2026-11-25T17:20:58.3443845Z caddeapllx2871.agil.nprd.caixa.gov.br : ok=2    changed=1    unreachable=0    failed=1    skipped=0    rescued=1    ignored=0   
2026-11-25T17:20:58.3443950Z 
2026-11-25T17:20:58.3444365Z Wednesday 25 November 2026  14:20:58 -0300 (0:03:20.547)       0:06:48.849 **** 
2026-11-25T17:20:58.3444545Z =============================================================================== 
2026-11-25T17:20:58.3447219Z Wait for Jboss Management port ---------------------------------------- 200.57s
2026-11-25T17:20:58.3533588Z Wait for Jboss Management port ---------------------------------------- 200.55s
2026-11-25T17:20:58.3533872Z systemd ----------------------------------------------------------------- 6.81s
2026-11-25T17:20:58.3534127Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.53s
2026-11-25T17:20:58.3534272Z Playbook run took 0 days, 0 hours, 6 minutes, 48 seconds
2026-11-25T17:20:58.4115688Z ##[error]Bash exited with code '2'.
2026-11-25T17:20:58.4135174Z ##[section]Finishing: Check Deployments [JBOSS]





