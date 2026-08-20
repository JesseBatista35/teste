2026-08-20T14:17:01.6742898Z ##[section]Starting: Check Deployments [JBOSS]
2026-08-20T14:17:01.6746118Z ==============================================================================
2026-08-20T14:17:01.6746208Z Task         : Bash
2026-08-20T14:17:01.6746264Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-20T14:17:01.6746336Z Version      : 3.227.0
2026-08-20T14:17:01.6746385Z Author       : Microsoft Corporation
2026-08-20T14:17:01.6746494Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-20T14:17:01.6746578Z ==============================================================================
2026-08-20T14:17:02.7145948Z Generating script.
2026-08-20T14:17:02.7153768Z Script contents:
2026-08-20T14:17:02.7154255Z ansible-playbook /opt/ads-agent/_work/r5336/a/esteira-jboss-vm-v2/site.yml --tags check_deployments -e sistema_ambiente=des -e sistema_nome=siatd-intranet-vm -e site=ctc_nprd
2026-08-20T14:17:02.7158158Z ========================== Starting Command Output ===========================
2026-08-20T14:17:02.7164839Z [command]/bin/bash /opt/ads-agent/_work/_temp/e55d729b-7709-41c3-a77a-5f82cd1172e3.sh
2026-08-20T14:17:04.7651998Z 
2026-08-20T14:17:04.7652615Z PLAY [local] *******************************************************************
2026-08-20T14:17:04.7918442Z 
2026-08-20T14:17:04.7919149Z PLAY [Configurando o DNS] ******************************************************
2026-08-20T14:17:04.9787584Z 
2026-08-20T14:17:04.9788425Z PLAY [local] *******************************************************************
2026-08-20T14:17:04.9831022Z 
2026-08-20T14:17:04.9832072Z PLAY [Verificando serviços] ****************************************************
2026-08-20T14:17:04.9908739Z 
2026-08-20T14:17:04.9909635Z PLAY [Configuração LDAP] *******************************************************
2026-08-20T14:17:04.9942266Z [WARNING]: Found variable using reserved name: when
2026-08-20T14:17:04.9948837Z 
2026-08-20T14:17:04.9949435Z PLAY [jboss] *******************************************************************
2026-08-20T14:17:05.0027000Z 
2026-08-20T14:17:05.0027541Z PLAY [Stack Jboss] *************************************************************
2026-08-20T14:17:05.0270241Z Thursday 20 August 2026  11:17:05 -0300 (0:00:00.321)       0:00:00.321 ******* 
2026-08-20T14:17:05.5399208Z 
2026-08-20T14:17:05.5400211Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-08-20T14:17:05.5400580Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-08-20T14:17:05.5401185Z caddeapllx1992.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-08-20T14:17:05.5402039Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-08-20T14:17:05.5402314Z releases. A future Ansible release will default to using the discovered 
2026-08-20T14:17:05.5402531Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-08-20T14:17:05.5402739Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-08-20T14:17:05.5403393Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-08-20T14:17:05.5403593Z setting deprecation_warnings=False in ansible.cfg.
2026-08-20T14:17:05.5403881Z ok: [caddeapllx1992.agil.nprd.caixa.gov.br]
2026-08-20T14:17:05.5426171Z 
2026-08-20T14:17:05.5426570Z PLAY [jboss] *******************************************************************
2026-08-20T14:17:05.5473702Z 
2026-08-20T14:17:05.5474120Z PLAY [jboss] *******************************************************************
2026-08-20T14:17:05.5515819Z 
2026-08-20T14:17:05.5516160Z PLAY [jboss] *******************************************************************
2026-08-20T14:17:05.5540259Z 
2026-08-20T14:17:05.5540769Z PLAY [Copiando deployments adicionais] *****************************************
2026-08-20T14:17:05.5568714Z 
2026-08-20T14:17:05.5569153Z PLAY [Copiando modules adicionais] *********************************************
2026-08-20T14:17:05.5602150Z 
2026-08-20T14:17:05.5602544Z PLAY [jboss] *******************************************************************
2026-08-20T14:17:05.5631149Z 
2026-08-20T14:17:05.5631704Z PLAY [jboss] *******************************************************************
2026-08-20T14:17:05.5659071Z 
2026-08-20T14:17:05.5659311Z PLAY [jboss] *******************************************************************
2026-08-20T14:17:05.5694675Z Thursday 20 August 2026  11:17:05 -0300 (0:00:00.542)       0:00:00.864 ******* 
2026-08-20T14:20:26.1657674Z 
2026-08-20T14:20:26.1658391Z TASK [Wait for Jboss Management port] ******************************************
2026-08-20T14:20:26.1658698Z fatal: [caddeapllx1992.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "elapsed": 200, "msg": "Timeout when waiting for 10.116.198.244:9990"}
2026-08-20T14:20:26.1677500Z Thursday 20 August 2026  11:20:26 -0300 (0:03:20.598)       0:03:21.462 ******* 
2026-08-20T14:20:32.8817670Z 
2026-08-20T14:20:32.8818268Z TASK [systemd] *****************************************************************
2026-08-20T14:20:32.8818580Z changed: [caddeapllx1992.agil.nprd.caixa.gov.br]
2026-08-20T14:20:32.8854162Z Thursday 20 August 2026  11:20:32 -0300 (0:00:06.717)       0:03:28.180 ******* 
2026-08-20T14:23:53.3543016Z 
2026-08-20T14:23:53.3543727Z TASK [Wait for Jboss Management port] ******************************************
2026-08-20T14:23:53.3544738Z fatal: [caddeapllx1992.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "elapsed": 200, "msg": "Timeout when waiting for 10.116.198.244:9990"}
2026-08-20T14:23:53.3553259Z 
2026-08-20T14:23:53.3553621Z PLAY RECAP *********************************************************************
2026-08-20T14:23:53.3555153Z caddeapllx1992.agil.nprd.caixa.gov.br : ok=2    changed=1    unreachable=0    failed=1    skipped=0    rescued=1    ignored=0   
2026-08-20T14:23:53.3555312Z 
2026-08-20T14:23:53.3555808Z Thursday 20 August 2026  11:23:53 -0300 (0:03:20.470)       0:06:48.650 ******* 
2026-08-20T14:23:53.3556083Z =============================================================================== 
2026-08-20T14:23:53.3556390Z Wait for Jboss Management port ---------------------------------------- 200.60s
2026-08-20T14:23:53.3556984Z Wait for Jboss Management port ---------------------------------------- 200.47s
2026-08-20T14:23:53.3557237Z systemd ----------------------------------------------------------------- 6.72s
2026-08-20T14:23:53.3557494Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.54s
2026-08-20T14:23:53.3557670Z Playbook run took 0 days, 0 hours, 6 minutes, 48 seconds
2026-08-20T14:23:53.4159628Z ##[error]Bash exited with code '2'.
2026-08-20T14:23:53.4188491Z ##[section]Finishing: Check Deployments [JBOSS]




585600@cadsvitrlx100 ~]$ ssh 10.116.198.244
The authenticity of host '10.116.198.244 (10.116.198.244)' can't be established.
ED25519 key fingerprint is SHA256:aWV7gZp5OYIi52RwPts56Hp1AHSx7Q+cMSL5kBrb94E.
This host key is known by the following other names/addresses:
    ~/.ssh/known_hosts:22: 10.116.199.109
Are you sure you want to continue connecting (yes/no/[fingerprint])? yes
Warning: Permanently added '10.116.198.244' (ED25519) to the list of known hosts.
p585600@10.116.198.244's password:
[p585600@caddeapllx1992 ~]$
[p585600@caddeapllx1992 ~]$
[p585600@caddeapllx1992 ~]$
[p585600@caddeapllx1992 ~]$ ps -ef | grep jboss
p585600   134653  134578  0 11:23 pts/1    00:00:00 grep --color=auto jboss
[p585600@caddeapllx1992 ~]$ ps -ef | grep java
p585600   134673  134578  0 11:23 pts/1    00:00:00 grep --color=auto java
[p585600@caddeapllx1992 ~]$ cd /opt/jboss-eap/standalone/configuration/
[p585600@caddeapllx1992 configuration]$ ls -la
total 240
drwxrwxr-x 3 jboss jboss  4096 ago 20 11:16 .
drwxrwxr-x 8 jboss jboss    91 set 30  2024 ..
-rwxr-xr-x 1 jboss jboss   715 ago 20 11:16 applicationinsights.json
-rwxrwxr-x 1 jboss jboss   711 jun 23  2021 application-roles.properties
-rwxrwxr-x 1 jboss jboss   935 jun 23  2021 application-users.properties
-rw------- 1 jboss jboss 39055 ago 19 16:36 caixa-truststore-acteste-nprd.jks
-rwxr-xr-x 1 jboss jboss   242 ago 20 09:45 custom.sh
-rwxr-xr-x 1 jboss jboss  6018 ago 19 16:37 jcics-config.xml
-rwxrwxr-x 1 jboss jboss  2093 ago 19 17:10 logging.properties
-rwxrwxr-x 1 jboss jboss   669 jun 23  2021 mgmt-groups.properties
-rwxrwxr-x 1 jboss jboss  1111 jun 12  2023 mgmt-users.properties
-rwxrwxr-x 1 jboss jboss 48365 ago 20 09:45 standalone-full-ha.xml
-rwxrwxr-x 1 jboss jboss 33377 jun 12  2023 standalone-full.xml
-rwxrwxr-x 1 jboss jboss 34165 jun 12  2023 standalone-ha.xml
-rwxrwxr-x 1 jboss jboss  7014 jun 23  2021 standalone-load-balancer.xml
-rwxrwxr-x 1 jboss jboss 29987 jun 12  2023 standalone.xml
drwxrwxr-x 4 jboss jboss   229 ago 19 17:10 standalone_xml_history
[p585600@caddeapllx1992 configuration]$ cd /logs
[p585600@caddeapllx1992 logs]$ ls -la
total 4
drwxr-xr-x.  5 root   root     51 ago 19 16:36 .
dr-xr-xr-x. 20 root   root   4096 ago 20 11:16 ..
drwxrwxr-x   2 apache apache   89 ago 19 16:36 httpd
drwxrwxr-x   3 jboss  jboss    23 ago 19 16:37 jboss
drwxr-xr-x   2 apache apache   91 ago 19 16:36 monitoracao
[p585600@caddeapllx1992 logs]$ vim jboss
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$




