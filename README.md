
[p585600@caddeapllx955 ~]$ ls -la /opt/jboss-eap/standalone/deployments/
total 46268
drwxrwxr-x 2 jboss jboss       54 out 20 11:26 .
drwxrwxr-x 8 jboss jboss       91 set 30  2024 ..
-rwxrwxr-x 1 jboss jboss     8888 jun 23  2021 README.txt
-rwxrw-rw- 1 jboss jboss 47365809 out 20 11:26 sigsj_intranet-ear.ear
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$ cat /opt/jboss-eap/standalone/deployments/*.failed
cat: '/opt/jboss-eap/standalone/deployments/*.failed': Arquivo ou diretório inexistente
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$ grep -n "Xmx" /opt/jboss-eap/bin/standalone.conf
50:   JAVA_OPTS="-Xms1024m -Xmx2048m -XX:MetaspaceSize=256m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true"
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$ sudo journalctl -u jboss-eap-standalone --since "14:00" --no-pager | tail -20
[sudo] senha para p585600:
out 20 14:06:44 caddeapllx955.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[50402]: /opt/jboss-eap/bin/common_start.sh: linha 85: success: comando não encontrado
out 20 14:06:44 caddeapllx955.agil.nprd.caixa.gov.br systemd[1]: jboss-eap-standalone.service: Deactivated successfully.
out 20 14:06:44 caddeapllx955.agil.nprd.caixa.gov.br systemd[1]: Started JBoss EAP Systemctl - STANDALONE.
out 20 14:06:44 caddeapllx955.agil.nprd.caixa.gov.br systemd[1]: jboss-eap-standalone.service: Consumed 6.167s CPU time.
out 20 14:10:19 caddeapllx955.agil.nprd.caixa.gov.br systemd[1]: Starting JBoss EAP Systemctl - STANDALONE...
out 20 14:10:19 caddeapllx955.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[51452]: /opt/jboss-eap/bin/init.d/jboss-eap-standalone.sh: linha 4: /etc/init.d/functions: Arquivo ou diretório inexistente
out 20 14:10:19 caddeapllx955.agil.nprd.caixa.gov.br runuser[51454]: pam_unix(runuser:session): session opened for user jboss(uid=30000115) by (uid=0)
out 20 14:10:19 caddeapllx955.agil.nprd.caixa.gov.br runuser[51454]: pam_unix(runuser:session): session closed for user jboss
out 20 14:10:19 caddeapllx955.agil.nprd.caixa.gov.br runuser[51458]: pam_unix(runuser:session): session opened for user jboss(uid=30000115) by (uid=0)
out 20 14:10:19 caddeapllx955.agil.nprd.caixa.gov.br runuser[51458]: pam_unix(runuser:session): session closed for user jboss
out 20 14:10:19 caddeapllx955.agil.nprd.caixa.gov.br runuser[51462]: pam_unix(runuser:session): session opened for user jboss(uid=30000115) by (uid=0)
out 20 14:10:22 caddeapllx955.agil.nprd.caixa.gov.br runuser[51462]: pam_unix(runuser:session): session closed for user jboss
out 20 14:10:25 caddeapllx955.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[51452]: Starting JBoss EAP:
out 20 14:10:25 caddeapllx955.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[51749]: /opt/jboss-eap/bin/common_start.sh: linha 58: success: comando não encontrado
out 20 14:10:25 caddeapllx955.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[51750]: /opt/jboss-eap/bin/init.d/jboss-eap-standalone.sh: linha 4: /etc/init.d/functions: Arquivo ou diretório inexistente
out 20 14:10:25 caddeapllx955.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[51750]: Stopping JBoss EAP:
out 20 14:10:25 caddeapllx955.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[51752]: /opt/jboss-eap/bin/common_start.sh: linha 85: success: comando não encontrado
out 20 14:10:25 caddeapllx955.agil.nprd.caixa.gov.br systemd[1]: jboss-eap-standalone.service: Deactivated successfully.
out 20 14:10:25 caddeapllx955.agil.nprd.caixa.gov.br systemd[1]: Started JBoss EAP Systemctl - STANDALONE.
out 20 14:10:25 caddeapllx955.agil.nprd.caixa.gov.br systemd[1]: jboss-eap-standalone.service: Consumed 5.581s CPU time.
[p585600@caddeapllx955 ~]$



2026-10-20T17:06:54.2882286Z ##[section]Starting: Check Deployments [JBOSS]
2026-10-20T17:06:54.2886664Z ==============================================================================
2026-10-20T17:06:54.2886831Z Task         : Bash
2026-10-20T17:06:54.2886903Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-20T17:06:54.2887028Z Version      : 3.227.0
2026-10-20T17:06:54.2887100Z Author       : Microsoft Corporation
2026-10-20T17:06:54.2887187Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-20T17:06:54.2887330Z ==============================================================================
2026-10-20T17:06:55.0243277Z Generating script.
2026-10-20T17:06:55.0246074Z Script contents:
2026-10-20T17:06:55.0246951Z ansible-playbook /opt/ads-agent/_work/r12465/a/esteira-jboss-vm-v2/site.yml --tags check_deployments -e sistema_ambiente=des -e sistema_nome=sigsj-intranet -e site=ctc_nprd
2026-10-20T17:06:55.0251053Z ========================== Starting Command Output ===========================
2026-10-20T17:06:55.0264104Z [command]/bin/bash /opt/ads-agent/_work/_temp/2dd701df-0abe-4aaa-a355-0fcdf51f37eb.sh
2026-10-20T17:06:57.1272969Z 
2026-10-20T17:06:57.1273478Z PLAY [local] *******************************************************************
2026-10-20T17:06:57.1554188Z 
2026-10-20T17:06:57.1554717Z PLAY [Configurando o DNS] ******************************************************
2026-10-20T17:06:57.3380967Z 
2026-10-20T17:06:57.3381457Z PLAY [local] *******************************************************************
2026-10-20T17:06:57.3411180Z 
2026-10-20T17:06:57.3412156Z PLAY [Verificando serviços] ****************************************************
2026-10-20T17:06:57.3490261Z 
2026-10-20T17:06:57.3490778Z PLAY [Configuração LDAP] *******************************************************
2026-10-20T17:06:57.3524386Z [WARNING]: Found variable using reserved name: when
2026-10-20T17:06:57.3528037Z 
2026-10-20T17:06:57.3528275Z PLAY [jboss] *******************************************************************
2026-10-20T17:06:57.3613980Z 
2026-10-20T17:06:57.3614366Z PLAY [Stack Jboss] *************************************************************
2026-10-20T17:06:57.3839575Z Tuesday 20 October 2026  14:06:57 -0300 (0:00:00.316)       0:00:00.316 ******* 
2026-10-20T17:06:57.8700755Z 
2026-10-20T17:06:57.8701455Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-10-20T17:06:57.8703480Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-10-20T17:06:57.8703729Z caddeapllx955.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-10-20T17:06:57.8703893Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-10-20T17:06:57.8704060Z releases. A future Ansible release will default to using the discovered 
2026-10-20T17:06:57.8704220Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-10-20T17:06:57.8704379Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-10-20T17:06:57.8704565Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-10-20T17:06:57.8704709Z setting deprecation_warnings=False in ansible.cfg.
2026-10-20T17:06:57.8705479Z ok: [caddeapllx955.agil.nprd.caixa.gov.br]
2026-10-20T17:06:57.8741658Z 
2026-10-20T17:06:57.8741866Z PLAY [jboss] *******************************************************************
2026-10-20T17:06:57.8804912Z 
2026-10-20T17:06:57.8805274Z PLAY [jboss] *******************************************************************
2026-10-20T17:06:57.8844440Z 
2026-10-20T17:06:57.8844801Z PLAY [jboss] *******************************************************************
2026-10-20T17:06:57.8870031Z 
2026-10-20T17:06:57.8870435Z PLAY [Copiando deployments adicionais] *****************************************
2026-10-20T17:06:57.8893926Z 
2026-10-20T17:06:57.8894214Z PLAY [Copiando modules adicionais] *********************************************
2026-10-20T17:06:57.8921293Z 
2026-10-20T17:06:57.8921706Z PLAY [jboss] *******************************************************************
2026-10-20T17:06:57.8953188Z 
2026-10-20T17:06:57.8953459Z PLAY [jboss] *******************************************************************
2026-10-20T17:06:57.8983369Z 
2026-10-20T17:06:57.8983851Z PLAY [jboss] *******************************************************************
2026-10-20T17:06:57.9022492Z Tuesday 20 October 2026  14:06:57 -0300 (0:00:00.518)       0:00:00.834 ******* 
2026-10-20T17:10:18.5116460Z 
2026-10-20T17:10:18.5117047Z TASK [Wait for Jboss Management port] ******************************************
2026-10-20T17:10:18.5119865Z fatal: [caddeapllx955.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "elapsed": 200, "msg": "Timeout when waiting for 10.116.194.179:9990"}
2026-10-20T17:10:18.5153823Z Tuesday 20 October 2026  14:10:18 -0300 (0:03:20.611)       0:03:21.446 ******* 
2026-10-20T17:10:25.2429316Z 
2026-10-20T17:10:25.2429854Z TASK [systemd] *****************************************************************
2026-10-20T17:10:25.2433251Z changed: [caddeapllx955.agil.nprd.caixa.gov.br]
2026-10-20T17:10:25.2467594Z Tuesday 20 October 2026  14:10:25 -0300 (0:00:06.732)       0:03:28.179 ******* 
2026-10-20T17:13:45.7033546Z 
2026-10-20T17:13:45.7034095Z TASK [Wait for Jboss Management port] ******************************************
2026-10-20T17:13:45.7036281Z fatal: [caddeapllx955.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "elapsed": 200, "msg": "Timeout when waiting for 10.116.194.179:9990"}
2026-10-20T17:13:45.7043156Z 
2026-10-20T17:13:45.7043397Z PLAY RECAP *********************************************************************
2026-10-20T17:13:45.7043592Z caddeapllx955.agil.nprd.caixa.gov.br : ok=2    changed=1    unreachable=0    failed=1    skipped=0    rescued=1    ignored=0   
2026-10-20T17:13:45.7043695Z 
2026-10-20T17:13:45.7044911Z Tuesday 20 October 2026  14:13:45 -0300 (0:03:20.457)       0:06:48.637 ******* 
2026-10-20T17:13:45.7045101Z =============================================================================== 
2026-10-20T17:13:45.7045445Z Wait for Jboss Management port ---------------------------------------- 200.61s
2026-10-20T17:13:45.7046043Z Wait for Jboss Management port ---------------------------------------- 200.46s
2026-10-20T17:13:45.7046322Z systemd ----------------------------------------------------------------- 6.73s
2026-10-20T17:13:45.7046687Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.52s
2026-10-20T17:13:45.7046850Z Playbook run took 0 days, 0 hours, 6 minutes, 48 seconds
2026-10-20T17:13:45.7793172Z ##[error]Bash exited with code '2'.
2026-10-20T17:13:45.7820875Z ##[section]Finishing: Check Deployments [JBOSS]
