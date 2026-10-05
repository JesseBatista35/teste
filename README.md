Gostaria de solicitar a correção do problema apontado na release do projeto SISME-Rotinas no step Configura Control M, está sendo exibida e mensagem de erro abaixo no momento da montagem do NFS:

2026-10-05T13:44:18.7178564Z TASK [nfs : Validando Montagem] ************************************************
2026-10-05T13:44:18.7178844Z fatal: [caddeapllx2781.agil.nprd.caixa.gov.br]: FAILED! => {
2026-10-05T13:44:18.7179912Z     "assertion": "'Connection refused' in mountnfs.msg", 
2026-10-05T13:44:18.7180094Z     "changed": false, 
2026-10-05T13:44:18.7180214Z     "evaluated_to": false, 
2026-10-05T13:44:18.7180353Z     "msg": "Erro desconhecido: Error mounting /sisme_fgw: mount.nfs: Connection timed out\n"
2026-10-05T13:44:18.7180501Z }


Link da release com erro:
https://devops.caixa/projetos/Caixa/_releaseProgress?releaseId=535994&_a=release-environment-logs&environmentId=2490401


2026-10-05T13:40:50.0008153Z ##[section]Starting: Configura Control-M
2026-10-05T13:40:50.0010844Z ==============================================================================
2026-10-05T13:40:50.0010923Z Task         : Bash
2026-10-05T13:40:50.0010966Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-05T13:40:50.0011038Z Version      : 3.227.0
2026-10-05T13:40:50.0011082Z Author       : Microsoft Corporation
2026-10-05T13:40:50.0011131Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-05T13:40:50.0011212Z ==============================================================================
2026-10-05T13:40:51.0174083Z Generating script.
2026-10-05T13:40:51.0183864Z ========================== Starting Command Output ===========================
2026-10-05T13:40:51.0213220Z [command]/bin/bash /opt/ads-agent/_work/_temp/f9a6755a-b55a-46ba-936c-f679e529e4d9.sh
2026-10-05T13:40:52.9398874Z 
2026-10-05T13:40:52.9399410Z PLAY [local] *******************************************************************
2026-10-05T13:40:52.9648444Z 
2026-10-05T13:40:52.9649050Z PLAY [Configurando o DNS] ******************************************************
2026-10-05T13:40:53.1349419Z 
2026-10-05T13:40:53.1349859Z PLAY [local] *******************************************************************
2026-10-05T13:40:53.1378106Z 
2026-10-05T13:40:53.1378536Z PLAY [Verificando serviços] ****************************************************
2026-10-05T13:40:53.1454143Z 
2026-10-05T13:40:53.1454358Z PLAY [Configuração LDAP] *******************************************************
2026-10-05T13:40:53.1485347Z [WARNING]: Found variable using reserved name: when
2026-10-05T13:40:53.1490511Z 
2026-10-05T13:40:53.1490718Z PLAY [jboss] *******************************************************************
2026-10-05T13:40:53.1571233Z 
2026-10-05T13:40:53.1571480Z PLAY [Stack Jboss] *************************************************************
2026-10-05T13:40:53.1595920Z 
2026-10-05T13:40:53.1596063Z PLAY [jboss] *******************************************************************
2026-10-05T13:40:53.1637334Z 
2026-10-05T13:40:53.1637532Z PLAY [jboss] *******************************************************************
2026-10-05T13:40:53.1884232Z Monday 05 October 2026  10:40:53 -0300 (0:00:00.307)       0:00:00.307 ******** 
2026-10-05T13:40:53.6178876Z 
2026-10-05T13:40:53.6179487Z TASK [Verifica se o arquivo nfs_config.json existe] ****************************
2026-10-05T13:40:53.6179949Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-05T13:40:53.6201470Z Monday 05 October 2026  10:40:53 -0300 (0:00:00.431)       0:00:00.738 ******** 
2026-10-05T13:40:53.6632542Z included: /opt/ads-agent/_work/r5945/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for caddeapllx2781.agil.nprd.caixa.gov.br
2026-10-05T13:40:53.6667309Z Monday 05 October 2026  10:40:53 -0300 (0:00:00.046)       0:00:00.785 ******** 
2026-10-05T13:40:53.7203221Z 
2026-10-05T13:40:53.7203907Z TASK [nfs : Criar variáveis] ***************************************************
2026-10-05T13:40:53.7204313Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-05T13:40:53.7238334Z Monday 05 October 2026  10:40:53 -0300 (0:00:00.057)       0:00:00.842 ******** 
2026-10-05T13:40:54.1124990Z 
2026-10-05T13:40:54.1125704Z TASK [nfs : Coletar variáveis de ambiente] *************************************
2026-10-05T13:40:54.1125919Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-05T13:40:54.1150624Z Monday 05 October 2026  10:40:54 -0300 (0:00:00.391)       0:00:01.233 ******** 
2026-10-05T13:40:54.1660795Z 
2026-10-05T13:40:54.1661316Z TASK [nfs : Exibir resultado em JSON] ******************************************
2026-10-05T13:40:54.1662948Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br] => {
2026-10-05T13:40:54.1663586Z     "nfs_vars_json": {
2026-10-05T13:40:54.1663798Z         "changed": false, 
2026-10-05T13:40:54.1664061Z         "cmd": "cat /opt/ads-agent/_work/r5945/a/nfs_config.json", 
2026-10-05T13:40:54.1664246Z         "delta": "0:00:00.003103", 
2026-10-05T13:40:54.1664644Z         "end": "2026-10-05 10:40:54.098162", 
2026-10-05T13:40:54.1664795Z         "failed": false, 
2026-10-05T13:40:54.1665014Z         "rc": 0, 
2026-10-05T13:40:54.1665300Z         "start": "2026-10-05 10:40:54.095059", 
2026-10-05T13:40:54.1665457Z         "stderr": "", 
2026-10-05T13:40:54.1665565Z         "stderr_lines": [], 
2026-10-05T13:40:54.1665740Z         "stdout": "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW\",\"NFS_MOUNT_POINT_ISILON\": \"/sisme_fgw\"}]", 
2026-10-05T13:40:54.1665910Z         "stdout_lines": [
2026-10-05T13:40:54.1666076Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW\",\"NFS_MOUNT_POINT_ISILON\": \"/sisme_fgw\"}]"
2026-10-05T13:40:54.1666720Z         ]
2026-10-05T13:40:54.1666807Z     }
2026-10-05T13:40:54.1666895Z }
2026-10-05T13:40:54.1686330Z Monday 05 October 2026  10:40:54 -0300 (0:00:00.053)       0:00:01.287 ******** 
2026-10-05T13:40:54.2234530Z 
2026-10-05T13:40:54.2235039Z TASK [nfs : Criar variáveis] ***************************************************
2026-10-05T13:40:54.2235203Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-05T13:40:54.2269029Z Monday 05 October 2026  10:40:54 -0300 (0:00:00.058)       0:00:01.345 ******** 
2026-10-05T13:40:58.0578808Z 
2026-10-05T13:40:58.0588979Z TASK [nfs : execute montagem script] *******************************************
2026-10-05T13:40:58.0589141Z changed: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-05T13:40:58.0601704Z Monday 05 October 2026  10:40:58 -0300 (0:00:03.832)       0:00:05.177 ******** 
2026-10-05T13:40:58.1130919Z 
2026-10-05T13:40:58.1131368Z TASK [nfs : ansible.builtin.debug] *********************************************
2026-10-05T13:40:58.1133923Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br] => {
2026-10-05T13:40:58.1134070Z     "changed": false, 
2026-10-05T13:40:58.1134178Z     "msg": {
2026-10-05T13:40:58.1134283Z         "changed": true, 
2026-10-05T13:40:58.1134391Z         "cmd": [
2026-10-05T13:40:58.1134504Z             "python", 
2026-10-05T13:40:58.1134776Z             "/opt/ads-agent/_work/r5945/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py", 
2026-10-05T13:40:58.1134917Z             "montagem", 
2026-10-05T13:40:58.1135060Z             "sisme-rotinas", 
2026-10-05T13:40:58.1135164Z             "tqs", 
2026-10-05T13:40:58.1135263Z             "ctc_nprd", 
2026-10-05T13:40:58.1135440Z             "/opt/ads-agent/_work/r5945/a/esteira-jboss-vm-v2", 
2026-10-05T13:40:58.1139615Z             "C&t@d02", 
2026-10-05T13:40:58.1140994Z             "***", 
2026-10-05T13:40:58.1141406Z             "s736651@corp.caixa.gov.br", 
2026-10-05T13:40:58.1141976Z             "***", 
2026-10-05T13:40:58.1142412Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW\",\"NFS_MOUNT_POINT_ISILON\": \"/sisme_fgw\"}]"
2026-10-05T13:40:58.1142796Z         ], 
2026-10-05T13:40:58.1143121Z         "delta": "0:00:03.525167", 
2026-10-05T13:40:58.1143518Z         "end": "2026-10-05 10:40:58.042562", 
2026-10-05T13:40:58.1143732Z         "failed": false, 
2026-10-05T13:40:58.1143947Z         "rc": 0, 
2026-10-05T13:40:58.1144211Z         "start": "2026-10-05 10:40:54.517395", 
2026-10-05T13:40:58.1144518Z         "stderr": "", 
2026-10-05T13:40:58.1144722Z         "stderr_lines": [], 
2026-10-05T13:40:58.1145818Z         "stdout": "[{u'NFS_MOUNT_POINT_ISILON': u'/sisme_fgw', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW'}]\nNome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           \n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW /sisme_fgw                          ISILON                              nfsctcnprd.ctc.caixa                tqs                                \nnfs_path=/sisme_fgw\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW /sisme_fgw                          ISILON                              nfsctcnprd.ctc.caixa                tqs                                ", 
2026-10-05T13:40:58.1146501Z         "stdout_lines": [
2026-10-05T13:40:58.1146770Z             "[{u'NFS_MOUNT_POINT_ISILON': u'/sisme_fgw', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW'}]", 
2026-10-05T13:40:58.1146965Z             "Nome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           ", 
2026-10-05T13:40:58.1147314Z             "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------", 
2026-10-05T13:40:58.1147562Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW /sisme_fgw                          ISILON                              nfsctcnprd.ctc.caixa                tqs                                ", 
2026-10-05T13:40:58.1147725Z             "nfs_path=/sisme_fgw", 
2026-10-05T13:40:58.1147863Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW", 
2026-10-05T13:40:58.1148127Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW /sisme_fgw                          ISILON                              nfsctcnprd.ctc.caixa                tqs                                "
2026-10-05T13:40:58.1148282Z         ]
2026-10-05T13:40:58.1148373Z     }
2026-10-05T13:40:58.1148461Z }
2026-10-05T13:40:58.1155678Z Monday 05 October 2026  10:40:58 -0300 (0:00:00.056)       0:00:05.234 ******** 
2026-10-05T13:40:58.4412291Z 
2026-10-05T13:40:58.4413070Z TASK [nfs : execute clean json] ************************************************
2026-10-05T13:40:58.4415972Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-10-05T13:40:58.4416326Z caddeapllx2781.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-10-05T13:40:58.4416558Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-10-05T13:40:58.4416721Z releases. A future Ansible release will default to using the discovered 
2026-10-05T13:40:58.4417104Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-10-05T13:40:58.4417274Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-10-05T13:40:58.4417433Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-10-05T13:40:58.4417592Z setting deprecation_warnings=False in ansible.cfg.
2026-10-05T13:40:58.4417721Z changed: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-05T13:40:58.4440527Z Monday 05 October 2026  10:40:58 -0300 (0:00:00.328)       0:00:05.562 ******** 
2026-10-05T13:40:58.4978240Z 
2026-10-05T13:40:58.4978627Z TASK [nfs : result_new_string_json] ********************************************
2026-10-05T13:40:58.4981115Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br] => {
2026-10-05T13:40:58.4981263Z     "msg": {
2026-10-05T13:40:58.4982419Z         "ansible_facts": {
2026-10-05T13:40:58.4983383Z             "discovered_interpreter_python": "/usr/bin/python"
2026-10-05T13:40:58.4983630Z         }, 
2026-10-05T13:40:58.4983842Z         "changed": true, 
2026-10-05T13:40:58.4984567Z         "cmd": "echo '[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW\",\"NFS_MOUNT_POINT_ISILON\": \"/sisme_fgw\"}]' | sed 's/NFS_ENDPOINT_ISILON[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_ISILON[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_HUAWEI[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_HUAWEI[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_VM[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_VM[^\"]*/NFS_MOUNT_POINT/g'", 
2026-10-05T13:40:58.4985235Z         "delta": "0:00:00.003735", 
2026-10-05T13:40:58.4985465Z         "deprecations": [
2026-10-05T13:40:58.4985567Z             {
2026-10-05T13:40:58.4986147Z                 "msg": "Distribution rhel 9.3 on host caddeapllx2781.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, but is using /usr/bin/python for backward compatibility with prior Ansible releases. A future Ansible release will default to using the discovered platform python for this host. See https://docs.ansible.com/ansible/2.9/reference_appendices/interpreter_discovery.html for more information", 
2026-10-05T13:40:58.4986460Z                 "version": "2.12"
2026-10-05T13:40:58.4986551Z             }
2026-10-05T13:40:58.4986641Z         ], 
2026-10-05T13:40:58.4986812Z         "end": "2026-10-05 10:40:58.426241", 
2026-10-05T13:40:58.4986939Z         "failed": false, 
2026-10-05T13:40:58.4988905Z         "rc": 0, 
2026-10-05T13:40:58.4989442Z         "start": "2026-10-05 10:40:58.422506", 
2026-10-05T13:40:58.4989615Z         "stderr": "", 
2026-10-05T13:40:58.4989727Z         "stderr_lines": [], 
2026-10-05T13:40:58.4989904Z         "stdout": "[{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW\",\"NFS_MOUNT_POINT\": \"/sisme_fgw\"}]", 
2026-10-05T13:40:58.4990063Z         "stdout_lines": [
2026-10-05T13:40:58.4990222Z             "[{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW\",\"NFS_MOUNT_POINT\": \"/sisme_fgw\"}]"
2026-10-05T13:40:58.4990379Z         ]
2026-10-05T13:40:58.4990471Z     }
2026-10-05T13:40:58.4990563Z }
2026-10-05T13:40:58.5003512Z Monday 05 October 2026  10:40:58 -0300 (0:00:00.056)       0:00:05.619 ******** 
2026-10-05T13:40:58.5542311Z 
2026-10-05T13:40:58.5542615Z TASK [nfs : Parse JSON data] ***************************************************
2026-10-05T13:40:58.5542785Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-05T13:40:58.5563397Z Monday 05 October 2026  10:40:58 -0300 (0:00:00.055)       0:00:05.675 ******** 
2026-10-05T13:40:58.6085969Z 
2026-10-05T13:40:58.6086273Z TASK [nfs : result_new_json] ***************************************************
2026-10-05T13:40:58.6087533Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br] => {
2026-10-05T13:40:58.6087665Z     "msg": [
2026-10-05T13:40:58.6087763Z         {
2026-10-05T13:40:58.6089101Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW", 
2026-10-05T13:40:58.6090461Z             "NFS_MOUNT_POINT": "/sisme_fgw"
2026-10-05T13:40:58.6091566Z         }
2026-10-05T13:40:58.6092686Z     ]
2026-10-05T13:40:58.6093771Z }
2026-10-05T13:40:58.6109102Z Monday 05 October 2026  10:40:58 -0300 (0:00:00.054)       0:00:05.729 ******** 
2026-10-05T13:40:58.6657865Z included: /opt/ads-agent/_work/r5945/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx2781.agil.nprd.caixa.gov.br
2026-10-05T13:40:58.6711770Z Monday 05 October 2026  10:40:58 -0300 (0:00:00.060)       0:00:05.790 ******** 
2026-10-05T13:40:58.7215574Z 
2026-10-05T13:40:58.7216208Z TASK [nfs : Parse JSON data] ***************************************************
2026-10-05T13:40:58.7216412Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-05T13:40:58.7237392Z Monday 05 October 2026  10:40:58 -0300 (0:00:00.052)       0:00:05.842 ******** 
2026-10-05T13:40:58.7745804Z 
2026-10-05T13:40:58.7746364Z TASK [nfs : debug] *************************************************************
2026-10-05T13:40:58.7747174Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br] => {
2026-10-05T13:40:58.7747464Z     "msg": {
2026-10-05T13:40:58.7748050Z         "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW", 
2026-10-05T13:40:58.7748255Z         "NFS_MOUNT_POINT": "/sisme_fgw"
2026-10-05T13:40:58.7748348Z     }
2026-10-05T13:40:58.7748671Z }
2026-10-05T13:40:58.7768576Z Monday 05 October 2026  10:40:58 -0300 (0:00:00.053)       0:00:05.895 ******** 
2026-10-05T13:40:58.8269201Z 
2026-10-05T13:40:58.8269763Z TASK [nfs : debug] *************************************************************
2026-10-05T13:40:58.8270675Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br] => {
2026-10-05T13:40:58.8271169Z     "msg": "/sisme_fgw"
2026-10-05T13:40:58.8271297Z }
2026-10-05T13:40:58.8292093Z Monday 05 October 2026  10:40:58 -0300 (0:00:00.052)       0:00:05.948 ******** 
2026-10-05T13:40:58.8791383Z 
2026-10-05T13:40:58.8792104Z TASK [nfs : debug] *************************************************************
2026-10-05T13:40:58.8792323Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br] => {
2026-10-05T13:40:58.8792468Z     "msg": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW"
2026-10-05T13:40:58.8792592Z }
2026-10-05T13:40:58.8814581Z Monday 05 October 2026  10:40:58 -0300 (0:00:00.052)       0:00:06.000 ******** 
2026-10-05T13:40:58.9338714Z 
2026-10-05T13:40:58.9339084Z TASK [nfs : Verificando as variaveis] ******************************************
2026-10-05T13:40:58.9339244Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br] => {
2026-10-05T13:40:58.9339377Z     "changed": false, 
2026-10-05T13:40:58.9339492Z     "msg": "All assertions passed"
2026-10-05T13:40:58.9339592Z }
2026-10-05T13:40:58.9361297Z Monday 05 October 2026  10:40:58 -0300 (0:00:00.054)       0:00:06.054 ******** 
2026-10-05T13:41:02.4322535Z 
2026-10-05T13:41:02.4323020Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-10-05T13:41:02.4323178Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-05T13:41:02.4349298Z Monday 05 October 2026  10:41:02 -0300 (0:00:03.498)       0:00:09.553 ******** 
2026-10-05T13:41:03.2513553Z 
2026-10-05T13:41:03.2514364Z TASK [nfs : Install networker lgtoclnt_url] ************************************
2026-10-05T13:41:03.2515077Z [WARNING]: Consider using the yum, dnf or zypper module rather than running
2026-10-05T13:41:03.2515524Z 'rpm'.  If you need to use command because yum, dnf or zypper is insufficient
2026-10-05T13:41:03.2515756Z you can add 'warn: false' to this command task or set 'command_warnings=False'
2026-10-05T13:41:03.2515905Z in ansible.cfg to get rid of this message.
2026-10-05T13:41:03.2517871Z fatal: [caddeapllx2781.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.572132", "end": "2026-10-05 10:41:03.235849", "msg": "non-zero return code", "rc": 1, "start": "2026-10-05 10:41:02.663717", "stderr": "aviso: /var/tmp/rpm-tmp.jjjkGd: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.jjjkGd: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-10-05T13:41:03.2519236Z ...ignoring
2026-10-05T13:41:03.2543520Z Monday 05 October 2026  10:41:03 -0300 (0:00:00.819)       0:00:10.373 ******** 
2026-10-05T13:41:03.9140240Z 
2026-10-05T13:41:03.9140878Z TASK [nfs : Install networker lgtonmda_url] ************************************
2026-10-05T13:41:03.9145558Z fatal: [caddeapllx2781.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.426201", "end": "2026-10-05 10:41:03.898788", "msg": "non-zero return code", "rc": 1, "start": "2026-10-05 10:41:03.472587", "stderr": "aviso: /var/tmp/rpm-tmp.qjMkb6: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.qjMkb6: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-10-05T13:41:03.9146917Z ...ignoring
2026-10-05T13:41:03.9173471Z Monday 05 October 2026  10:41:03 -0300 (0:00:00.662)       0:00:11.036 ******** 
2026-10-05T13:41:04.3030980Z 
2026-10-05T13:41:04.3031854Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-10-05T13:41:04.3032245Z changed: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-05T13:41:04.3046609Z Monday 05 October 2026  10:41:04 -0300 (0:00:00.387)       0:00:11.423 ******** 
2026-10-05T13:41:04.5391113Z 
2026-10-05T13:41:04.5391813Z TASK [nfs : Create a symbolic link] ********************************************
2026-10-05T13:41:04.5392433Z changed: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-05T13:41:04.5417947Z Monday 05 October 2026  10:41:04 -0300 (0:00:00.237)       0:00:11.660 ******** 
2026-10-05T13:41:05.3906672Z 
2026-10-05T13:41:05.3907367Z TASK [nfs : Networker | Start networker] ***************************************
2026-10-05T13:41:05.3907807Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-05T13:41:05.3942728Z Monday 05 October 2026  10:41:05 -0300 (0:00:00.852)       0:00:12.513 ******** 
2026-10-05T13:41:05.6410749Z 
2026-10-05T13:41:05.6411309Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-10-05T13:41:05.6411846Z changed: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-05T13:41:05.6435494Z Monday 05 October 2026  10:41:05 -0300 (0:00:00.249)       0:00:12.762 ******** 
2026-10-05T13:41:16.0281708Z 
2026-10-05T13:41:16.0282409Z TASK [nfs : Networker | Restart networker] *************************************
2026-10-05T13:41:16.0282721Z changed: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-05T13:41:16.0305761Z Monday 05 October 2026  10:41:16 -0300 (0:00:10.387)       0:00:23.149 ******** 
2026-10-05T13:44:18.6581553Z 
2026-10-05T13:44:18.6582151Z TASK [nfs : Montando volume remoto] ********************************************
2026-10-05T13:44:18.6584139Z fatal: [caddeapllx2781.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "msg": "Error mounting /sisme_fgw: mount.nfs: Connection timed out\n"}
2026-10-05T13:44:18.6584323Z ...ignoring
2026-10-05T13:44:18.6604657Z Monday 05 October 2026  10:44:18 -0300 (0:03:02.629)       0:03:25.779 ******** 
2026-10-05T13:44:18.7178103Z 
2026-10-05T13:44:18.7178564Z TASK [nfs : Validando Montagem] ************************************************
2026-10-05T13:44:18.7178844Z fatal: [caddeapllx2781.agil.nprd.caixa.gov.br]: FAILED! => {
2026-10-05T13:44:18.7179912Z     "assertion": "'Connection refused' in mountnfs.msg", 
2026-10-05T13:44:18.7180094Z     "changed": false, 
2026-10-05T13:44:18.7180214Z     "evaluated_to": false, 
2026-10-05T13:44:18.7180353Z     "msg": "Erro desconhecido: Error mounting /sisme_fgw: mount.nfs: Connection timed out\n"
2026-10-05T13:44:18.7180501Z }
2026-10-05T13:44:18.7181377Z 
2026-10-05T13:44:18.7181960Z PLAY RECAP *********************************************************************
2026-10-05T13:44:18.7182152Z caddeapllx2781.agil.nprd.caixa.gov.br : ok=27   changed=8    unreachable=0    failed=1    skipped=0    rescued=0    ignored=3   
2026-10-05T13:44:18.7182465Z 
2026-10-05T13:44:18.7182708Z Monday 05 October 2026  10:44:18 -0300 (0:00:00.057)       0:03:25.837 ******** 
2026-10-05T13:44:18.7182879Z =============================================================================== 
2026-10-05T13:44:18.7188256Z nfs : Montando volume remoto ------------------------------------------ 182.63s
2026-10-05T13:44:18.7189479Z nfs : Networker | Restart networker ------------------------------------ 10.39s
2026-10-05T13:44:18.7189725Z nfs : execute montagem script ------------------------------------------- 3.83s
2026-10-05T13:44:18.7190149Z nfs : Instalando o NFS Client ------------------------------------------- 3.50s
2026-10-05T13:44:18.7190461Z nfs : Networker | Start networker --------------------------------------- 0.85s
2026-10-05T13:44:18.7190705Z nfs : Install networker lgtoclnt_url ------------------------------------ 0.82s
2026-10-05T13:44:18.7190927Z nfs : Install networker lgtonmda_url ------------------------------------ 0.66s
2026-10-05T13:44:18.7191152Z Verifica se o arquivo nfs_config.json existe ---------------------------- 0.43s
2026-10-05T13:44:18.7191389Z nfs : Coletar variáveis de ambiente ------------------------------------- 0.39s
2026-10-05T13:44:18.7191631Z nfs : Remove pacote jbcs-httpd ------------------------------------------ 0.39s
2026-10-05T13:44:18.7191841Z nfs : execute clean json ------------------------------------------------ 0.33s
2026-10-05T13:44:18.7192066Z nfs : Executar o comando abaixo para limitar as portas ------------------ 0.25s
2026-10-05T13:44:18.7192285Z nfs : Create a symbolic link -------------------------------------------- 0.24s
2026-10-05T13:44:18.7192524Z nfs : include_tasks ----------------------------------------------------- 0.06s
2026-10-05T13:44:18.7192743Z nfs : Criar variáveis --------------------------------------------------- 0.06s
2026-10-05T13:44:18.7192961Z nfs : Validando Montagem ------------------------------------------------ 0.06s
2026-10-05T13:44:18.7193198Z nfs : Criar variáveis --------------------------------------------------- 0.06s
2026-10-05T13:44:18.7193414Z nfs : ansible.builtin.debug --------------------------------------------- 0.06s
2026-10-05T13:44:18.7193643Z nfs : result_new_string_json -------------------------------------------- 0.06s
2026-10-05T13:44:18.7193858Z nfs : Parse JSON data --------------------------------------------------- 0.06s
2026-10-05T13:44:18.7194007Z Playbook run took 0 days, 0 hours, 3 minutes, 25 seconds
2026-10-05T13:44:18.7715027Z ##[error]Bash exited with code '2'.
2026-10-05T13:44:18.7717787Z ##[warning]RetryHelper encountered task failure, will retry (attempt #: 1 out of 2) after 1000 ms
2026-10-05T13:44:19.8496221Z Generating script.
2026-10-05T13:44:19.8506314Z ========================== Starting Command Output ===========================
2026-10-05T13:44:19.8513267Z [command]/bin/bash /opt/ads-agent/_work/_temp/aa56a05f-d832-420b-89a5-4682d6cccb26.sh
2026-10-05T13:44:21.7855547Z 
2026-10-05T13:44:21.7856131Z PLAY [local] *******************************************************************
2026-10-05T13:44:21.8112332Z 
2026-10-05T13:44:21.8112763Z PLAY [Configurando o DNS] ******************************************************
2026-10-05T13:44:21.9798391Z 
2026-10-05T13:44:21.9798726Z PLAY [local] *******************************************************************
2026-10-05T13:44:21.9826927Z 
2026-10-05T13:44:21.9827285Z PLAY [Verificando serviços] ****************************************************
2026-10-05T13:44:21.9903644Z 
2026-10-05T13:44:21.9903983Z PLAY [Configuração LDAP] *******************************************************
2026-10-05T13:44:21.9934741Z [WARNING]: Found variable using reserved name: when
2026-10-05T13:44:21.9939635Z 
2026-10-05T13:44:21.9939868Z PLAY [jboss] *******************************************************************
2026-10-05T13:44:22.0021563Z 
2026-10-05T13:44:22.0021812Z PLAY [Stack Jboss] *************************************************************
2026-10-05T13:44:22.0046301Z 
2026-10-05T13:44:22.0046860Z PLAY [jboss] *******************************************************************
2026-10-05T13:44:22.0084744Z 
2026-10-05T13:44:22.0085011Z PLAY [jboss] *******************************************************************
2026-10-05T13:44:22.0332793Z Monday 05 October 2026  10:44:22 -0300 (0:00:00.306)       0:00:00.306 ******** 
2026-10-05T13:44:22.4518661Z 
2026-10-05T13:44:22.4519900Z TASK [Verifica se o arquivo nfs_config.json existe] ****************************
2026-10-05T13:44:22.4520604Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-05T13:44:22.4524837Z Monday 05 October 2026  10:44:22 -0300 (0:00:00.419)       0:00:00.725 ******** 
2026-10-05T13:44:22.4946952Z included: /opt/ads-agent/_work/r5945/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for caddeapllx2781.agil.nprd.caixa.gov.br
2026-10-05T13:44:22.4984936Z Monday 05 October 2026  10:44:22 -0300 (0:00:00.046)       0:00:00.772 ******** 
2026-10-05T13:44:22.5520658Z 
2026-10-05T13:44:22.5521487Z TASK [nfs : Criar variáveis] ***************************************************
2026-10-05T13:44:22.5521816Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-05T13:44:22.5560022Z Monday 05 October 2026  10:44:22 -0300 (0:00:00.057)       0:00:00.829 ******** 
2026-10-05T13:44:22.9431113Z 
2026-10-05T13:44:22.9431756Z TASK [nfs : Coletar variáveis de ambiente] *************************************
2026-10-05T13:44:22.9431969Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-05T13:44:22.9444796Z Monday 05 October 2026  10:44:22 -0300 (0:00:00.388)       0:00:01.217 ******** 
2026-10-05T13:44:22.9971722Z 
2026-10-05T13:44:22.9972267Z TASK [nfs : Exibir resultado em JSON] ******************************************
2026-10-05T13:44:22.9972469Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br] => {
2026-10-05T13:44:22.9972592Z     "nfs_vars_json": {
2026-10-05T13:44:22.9972710Z         "changed": false, 
2026-10-05T13:44:22.9973008Z         "cmd": "cat /opt/ads-agent/_work/r5945/a/nfs_config.json", 
2026-10-05T13:44:22.9973166Z         "delta": "0:00:00.003150", 
2026-10-05T13:44:22.9973353Z         "end": "2026-10-05 10:44:22.927942", 
2026-10-05T13:44:22.9975699Z         "failed": false, 
2026-10-05T13:44:22.9975861Z         "rc": 0, 
2026-10-05T13:44:22.9976124Z         "start": "2026-10-05 10:44:22.924792", 
2026-10-05T13:44:22.9976252Z         "stderr": "", 
2026-10-05T13:44:22.9976369Z         "stderr_lines": [], 
2026-10-05T13:44:22.9976551Z         "stdout": "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW\",\"NFS_MOUNT_POINT_ISILON\": \"/sisme_fgw\"}]", 
2026-10-05T13:44:22.9976730Z         "stdout_lines": [
2026-10-05T13:44:22.9976891Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW\",\"NFS_MOUNT_POINT_ISILON\": \"/sisme_fgw\"}]"
2026-10-05T13:44:22.9977471Z         ]
2026-10-05T13:44:22.9977563Z     }
2026-10-05T13:44:22.9977646Z }
2026-10-05T13:44:22.9990531Z Monday 05 October 2026  10:44:22 -0300 (0:00:00.054)       0:00:01.272 ******** 
2026-10-05T13:44:23.0552238Z 
2026-10-05T13:44:23.0552956Z TASK [nfs : Criar variáveis] ***************************************************
2026-10-05T13:44:23.0553137Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-05T13:44:23.0589575Z Monday 05 October 2026  10:44:23 -0300 (0:00:00.059)       0:00:01.332 ******** 
2026-10-05T13:44:25.4031206Z 
2026-10-05T13:44:25.4031702Z TASK [nfs : execute montagem script] *******************************************
2026-10-05T13:44:25.4031865Z changed: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-05T13:44:25.4047708Z Monday 05 October 2026  10:44:25 -0300 (0:00:02.345)       0:00:03.678 ******** 
2026-10-05T13:44:25.4620217Z 
2026-10-05T13:44:25.4620804Z TASK [nfs : ansible.builtin.debug] *********************************************
2026-10-05T13:44:25.4622512Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br] => {
2026-10-05T13:44:25.4622932Z     "changed": false, 
2026-10-05T13:44:25.4623489Z     "msg": {
2026-10-05T13:44:25.4623641Z         "changed": true, 
2026-10-05T13:44:25.4623983Z         "cmd": [
2026-10-05T13:44:25.4624086Z             "python", 
2026-10-05T13:44:25.4624395Z             "/opt/ads-agent/_work/r5945/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py", 
2026-10-05T13:44:25.4624537Z             "montagem", 
2026-10-05T13:44:25.4624681Z             "sisme-rotinas", 
2026-10-05T13:44:25.4624889Z             "tqs", 
2026-10-05T13:44:25.4624991Z             "ctc_nprd", 
2026-10-05T13:44:25.4625171Z             "/opt/ads-agent/_work/r5945/a/esteira-jboss-vm-v2", 
2026-10-05T13:44:25.4625295Z             "C&t@d02", 
2026-10-05T13:44:25.4625485Z             "***", 
2026-10-05T13:44:25.4625596Z             "s736651@corp.caixa.gov.br", 
2026-10-05T13:44:25.4625720Z             "***", 
2026-10-05T13:44:25.4625879Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW\",\"NFS_MOUNT_POINT_ISILON\": \"/sisme_fgw\"}]"
2026-10-05T13:44:25.4626035Z         ], 
2026-10-05T13:44:25.4626151Z         "delta": "0:00:02.051200", 
2026-10-05T13:44:25.4626327Z         "end": "2026-10-05 10:44:25.388286", 
2026-10-05T13:44:25.4626447Z         "failed": false, 
2026-10-05T13:44:25.4626538Z         "rc": 0, 
2026-10-05T13:44:25.4626709Z         "start": "2026-10-05 10:44:23.337086", 
2026-10-05T13:44:25.4626827Z         "stderr": "", 
2026-10-05T13:44:25.4626924Z         "stderr_lines": [], 
2026-10-05T13:44:25.4628114Z         "stdout": "[{u'NFS_MOUNT_POINT_ISILON': u'/sisme_fgw', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW'}]\nNome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           \n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW /sisme_fgw                          ISILON                              nfsctcnprd.ctc.caixa                tqs                                \nnfs_path=/sisme_fgw\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW /sisme_fgw                          ISILON                              nfsctcnprd.ctc.caixa                tqs                                ", 
2026-10-05T13:44:25.4628603Z         "stdout_lines": [
2026-10-05T13:44:25.4628876Z             "[{u'NFS_MOUNT_POINT_ISILON': u'/sisme_fgw', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW'}]", 
2026-10-05T13:44:25.4629143Z             "Nome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           ", 
2026-10-05T13:44:25.4629503Z             "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------", 
2026-10-05T13:44:25.4629747Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW /sisme_fgw                          ISILON                              nfsctcnprd.ctc.caixa                tqs                                ", 
2026-10-05T13:44:25.4629911Z             "nfs_path=/sisme_fgw", 
2026-10-05T13:44:25.4630054Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW", 
2026-10-05T13:44:25.4630248Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW /sisme_fgw                          ISILON                              nfsctcnprd.ctc.caixa                tqs                                "
2026-10-05T13:44:25.4630392Z         ]
2026-10-05T13:44:25.4630506Z     }
2026-10-05T13:44:25.4630593Z }
2026-10-05T13:44:25.4645012Z Monday 05 October 2026  10:44:25 -0300 (0:00:00.059)       0:00:03.738 ******** 
2026-10-05T13:44:25.8417404Z 
2026-10-05T13:44:25.8417946Z TASK [nfs : execute clean json] ************************************************
2026-10-05T13:44:25.8418410Z changed: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-05T13:44:25.8418892Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-10-05T13:44:25.8419308Z caddeapllx2781.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-10-05T13:44:25.8419482Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-10-05T13:44:25.8419660Z releases. A future Ansible release will default to using the discovered 
2026-10-05T13:44:25.8419830Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-10-05T13:44:25.8419985Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-10-05T13:44:25.8420154Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-10-05T13:44:25.8420300Z setting deprecation_warnings=False in ansible.cfg.
2026-10-05T13:44:25.8434127Z Monday 05 October 2026  10:44:25 -0300 (0:00:00.378)       0:00:04.116 ******** 
2026-10-05T13:44:25.8980849Z 
2026-10-05T13:44:25.8981144Z TASK [nfs : result_new_string_json] ********************************************
2026-10-05T13:44:25.8983377Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br] => {
2026-10-05T13:44:25.8983502Z     "msg": {
2026-10-05T13:44:25.8983609Z         "ansible_facts": {
2026-10-05T13:44:25.8983742Z             "discovered_interpreter_python": "/usr/bin/python"
2026-10-05T13:44:25.8983875Z         }, 
2026-10-05T13:44:25.8983978Z         "changed": true, 
2026-10-05T13:44:25.8984543Z         "cmd": "echo '[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW\",\"NFS_MOUNT_POINT_ISILON\": \"/sisme_fgw\"}]' | sed 's/NFS_ENDPOINT_ISILON[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_ISILON[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_HUAWEI[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_HUAWEI[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_VM[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_VM[^\"]*/NFS_MOUNT_POINT/g'", 
2026-10-05T13:44:25.8984863Z         "delta": "0:00:00.003452", 
2026-10-05T13:44:25.8984963Z         "deprecations": [
2026-10-05T13:44:25.8985061Z             {
2026-10-05T13:44:25.8985580Z                 "msg": "Distribution rhel 9.3 on host caddeapllx2781.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, but is using /usr/bin/python for backward compatibility with prior Ansible releases. A future Ansible release will default to using the discovered platform python for this host. See https://docs.ansible.com/ansible/2.9/reference_appendices/interpreter_discovery.html for more information", 
2026-10-05T13:44:25.8986086Z                 "version": "2.12"
2026-10-05T13:44:25.8986194Z             }
2026-10-05T13:44:25.8986285Z         ], 
2026-10-05T13:44:25.8986452Z         "end": "2026-10-05 10:44:25.825997", 
2026-10-05T13:44:25.8986568Z         "failed": false, 
2026-10-05T13:44:25.8986658Z         "rc": 0, 
2026-10-05T13:44:25.8986820Z         "start": "2026-10-05 10:44:25.822545", 
2026-10-05T13:44:25.8986940Z         "stderr": "", 
2026-10-05T13:44:25.8987042Z         "stderr_lines": [], 
2026-10-05T13:44:25.8987204Z         "stdout": "[{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW\",\"NFS_MOUNT_POINT\": \"/sisme_fgw\"}]", 
2026-10-05T13:44:25.8987362Z         "stdout_lines": [
2026-10-05T13:44:25.8987506Z             "[{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW\",\"NFS_MOUNT_POINT\": \"/sisme_fgw\"}]"
2026-10-05T13:44:25.8987650Z         ]
2026-10-05T13:44:25.8987736Z     }
2026-10-05T13:44:25.8987824Z }
2026-10-05T13:44:25.9005367Z Monday 05 October 2026  10:44:25 -0300 (0:00:00.057)       0:00:04.174 ******** 
2026-10-05T13:44:25.9537469Z 
2026-10-05T13:44:25.9537843Z TASK [nfs : Parse JSON data] ***************************************************
2026-10-05T13:44:25.9538058Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-05T13:44:25.9558922Z Monday 05 October 2026  10:44:25 -0300 (0:00:00.055)       0:00:04.229 ******** 
2026-10-05T13:44:26.0098284Z 
2026-10-05T13:44:26.0098863Z TASK [nfs : result_new_json] ***************************************************
2026-10-05T13:44:26.0099555Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br] => {
2026-10-05T13:44:26.0099683Z     "msg": [
2026-10-05T13:44:26.0099858Z         {
2026-10-05T13:44:26.0100010Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW", 
2026-10-05T13:44:26.0100170Z             "NFS_MOUNT_POINT": "/sisme_fgw"
2026-10-05T13:44:26.0100282Z         }
2026-10-05T13:44:26.0100372Z     ]
2026-10-05T13:44:26.0100460Z }
2026-10-05T13:44:26.0121055Z Monday 05 October 2026  10:44:26 -0300 (0:00:00.056)       0:00:04.285 ******** 
2026-10-05T13:44:26.0671150Z included: /opt/ads-agent/_work/r5945/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx2781.agil.nprd.caixa.gov.br
2026-10-05T13:44:26.0721692Z Monday 05 October 2026  10:44:26 -0300 (0:00:00.060)       0:00:04.345 ******** 
2026-10-05T13:44:26.1231629Z 
2026-10-05T13:44:26.1232173Z TASK [nfs : Parse JSON data] ***************************************************
2026-10-05T13:44:26.1275438Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-05T13:44:26.1277017Z Monday 05 October 2026  10:44:26 -0300 (0:00:00.053)       0:00:04.398 ******** 
2026-10-05T13:44:26.1759082Z 
2026-10-05T13:44:26.1759624Z TASK [nfs : debug] *************************************************************
2026-10-05T13:44:26.1760145Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br] => {
2026-10-05T13:44:26.1760309Z     "msg": {
2026-10-05T13:44:26.1760449Z         "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW", 
2026-10-05T13:44:26.1760607Z         "NFS_MOUNT_POINT": "/sisme_fgw"
2026-10-05T13:44:26.1760716Z     }
2026-10-05T13:44:26.1760808Z }
2026-10-05T13:44:26.1781210Z Monday 05 October 2026  10:44:26 -0300 (0:00:00.052)       0:00:04.451 ******** 
2026-10-05T13:44:26.2289447Z 
2026-10-05T13:44:26.2289759Z TASK [nfs : debug] *************************************************************
2026-10-05T13:44:26.2289989Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br] => {
2026-10-05T13:44:26.2290120Z     "msg": "/sisme_fgw"
2026-10-05T13:44:26.2290220Z }
2026-10-05T13:44:26.2304598Z Monday 05 October 2026  10:44:26 -0300 (0:00:00.052)       0:00:04.503 ******** 
2026-10-05T13:44:26.2803129Z 
2026-10-05T13:44:26.2803395Z TASK [nfs : debug] *************************************************************
2026-10-05T13:44:26.2804192Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br] => {
2026-10-05T13:44:26.2804388Z     "msg": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW"
2026-10-05T13:44:26.2804517Z }
2026-10-05T13:44:26.2827384Z Monday 05 October 2026  10:44:26 -0300 (0:00:00.052)       0:00:04.556 ******** 
2026-10-05T13:44:26.3357831Z 
2026-10-05T13:44:26.3358421Z TASK [nfs : Verificando as variaveis] ******************************************
2026-10-05T13:44:26.3358636Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br] => {
2026-10-05T13:44:26.3358759Z     "changed": false, 
2026-10-05T13:44:26.3358864Z     "msg": "All assertions passed"
2026-10-05T13:44:26.3358970Z }
2026-10-05T13:44:26.3381887Z Monday 05 October 2026  10:44:26 -0300 (0:00:00.055)       0:00:04.611 ******** 
2026-10-05T13:44:29.7461468Z 
2026-10-05T13:44:29.7462127Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-10-05T13:44:29.7462539Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-05T13:44:29.7480356Z Monday 05 October 2026  10:44:29 -0300 (0:00:03.409)       0:00:08.021 ******** 
2026-10-05T13:44:30.4912009Z 
2026-10-05T13:44:30.4912569Z TASK [nfs : Install networker lgtoclnt_url] ************************************
2026-10-05T13:44:30.4912754Z [WARNING]: Consider using the yum, dnf or zypper module rather than running
2026-10-05T13:44:30.4913375Z 'rpm'.  If you need to use command because yum, dnf or zypper is insufficient
2026-10-05T13:44:30.4913608Z you can add 'warn: false' to this command task or set 'command_warnings=False'
2026-10-05T13:44:30.4913840Z in ansible.cfg to get rid of this message.
2026-10-05T13:44:30.4915856Z fatal: [caddeapllx2781.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.507461", "end": "2026-10-05 10:44:30.475265", "msg": "non-zero return code", "rc": 1, "start": "2026-10-05 10:44:29.967804", "stderr": "aviso: /var/tmp/rpm-tmp.jFRIX6: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.jFRIX6: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-10-05T13:44:30.4916538Z ...ignoring
2026-10-05T13:44:30.4940757Z Monday 05 October 2026  10:44:30 -0300 (0:00:00.746)       0:00:08.767 ******** 
2026-10-05T13:44:31.1498385Z 
2026-10-05T13:44:31.1499316Z TASK [nfs : Install networker lgtonmda_url] ************************************
2026-10-05T13:44:31.1503601Z fatal: [caddeapllx2781.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.423830", "end": "2026-10-05 10:44:31.135098", "msg": "non-zero return code", "rc": 1, "start": "2026-10-05 10:44:30.711268", "stderr": "aviso: /var/tmp/rpm-tmp.aI9uAu: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.aI9uAu: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-10-05T13:44:31.1504686Z ...ignoring
2026-10-05T13:44:31.1531583Z Monday 05 October 2026  10:44:31 -0300 (0:00:00.658)       0:00:09.426 ******** 
2026-10-05T13:44:31.5315090Z 
2026-10-05T13:44:31.5315990Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-10-05T13:44:31.5316359Z changed: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-05T13:44:31.5342029Z Monday 05 October 2026  10:44:31 -0300 (0:00:00.381)       0:00:09.807 ******** 
2026-10-05T13:44:31.7682639Z 
2026-10-05T13:44:31.7683132Z TASK [nfs : Create a symbolic link] ********************************************
2026-10-05T13:44:31.7683302Z changed: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-05T13:44:31.7709456Z Monday 05 October 2026  10:44:31 -0300 (0:00:00.236)       0:00:10.044 ******** 
2026-10-05T13:44:32.6102210Z 
2026-10-05T13:44:32.6102723Z TASK [nfs : Networker | Start networker] ***************************************
2026-10-05T13:44:32.6102873Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-05T13:44:32.6138783Z Monday 05 October 2026  10:44:32 -0300 (0:00:00.842)       0:00:10.887 ******** 
2026-10-05T13:44:32.8555582Z 
2026-10-05T13:44:32.8556243Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-10-05T13:44:32.8556471Z changed: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-05T13:44:32.8579210Z Monday 05 October 2026  10:44:32 -0300 (0:00:00.244)       0:00:11.131 ******** 
2026-10-05T13:44:43.2391736Z 
2026-10-05T13:44:43.2392233Z TASK [nfs : Networker | Restart networker] *************************************
2026-10-05T13:44:43.2392430Z changed: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-05T13:44:43.2415870Z Monday 05 October 2026  10:44:43 -0300 (0:00:10.383)       0:00:21.515 ******** 
2026-10-05T13:47:47.5531050Z 
2026-10-05T13:47:47.5533319Z TASK [nfs : Montando volume remoto] ********************************************
2026-10-05T13:47:47.5533584Z fatal: [caddeapllx2781.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "msg": "Error mounting /sisme_fgw: mount.nfs: Connection timed out\n"}
2026-10-05T13:47:47.5533767Z ...ignoring
2026-10-05T13:47:47.5555450Z Monday 05 October 2026  10:47:47 -0300 (0:03:04.313)       0:03:25.829 ******** 
2026-10-05T13:47:47.6137720Z 
2026-10-05T13:47:47.6138353Z TASK [nfs : Validando Montagem] ************************************************
2026-10-05T13:47:47.6139254Z fatal: [caddeapllx2781.agil.nprd.caixa.gov.br]: FAILED! => {
2026-10-05T13:47:47.6139685Z     "assertion": "'Connection refused' in mountnfs.msg", 
2026-10-05T13:47:47.6139846Z     "changed": false, 
2026-10-05T13:47:47.6140755Z     "evaluated_to": false, 
2026-10-05T13:47:47.6141111Z     "msg": "Erro desconhecido: Error mounting /sisme_fgw: mount.nfs: Connection timed out\n"
2026-10-05T13:47:47.6141328Z }
2026-10-05T13:47:47.6145617Z 
2026-10-05T13:47:47.6145780Z PLAY RECAP *********************************************************************
2026-10-05T13:47:47.6145973Z caddeapllx2781.agil.nprd.caixa.gov.br : ok=27   changed=8    unreachable=0    failed=1    skipped=0    rescued=0    ignored=3   
2026-10-05T13:47:47.6146281Z 
2026-10-05T13:47:47.6146822Z Monday 05 October 2026  10:47:47 -0300 (0:00:00.059)       0:03:25.888 ******** 
2026-10-05T13:47:47.6147132Z =============================================================================== 
2026-10-05T13:47:47.6149325Z nfs : Montando volume remoto ------------------------------------------ 184.31s
2026-10-05T13:47:47.6149904Z nfs : Networker | Restart networker ------------------------------------ 10.38s
2026-10-05T13:47:47.6150263Z nfs : Instalando o NFS Client ------------------------------------------- 3.41s
2026-10-05T13:47:47.6150609Z nfs : execute montagem script ------------------------------------------- 2.35s
2026-10-05T13:47:47.6151212Z nfs : Networker | Start networker --------------------------------------- 0.84s
2026-10-05T13:47:47.6151557Z nfs : Install networker lgtoclnt_url ------------------------------------ 0.75s
2026-10-05T13:47:47.6151900Z nfs : Install networker lgtonmda_url ------------------------------------ 0.66s
2026-10-05T13:47:47.6152248Z Verifica se o arquivo nfs_config.json existe ---------------------------- 0.42s
2026-10-05T13:47:47.6152685Z nfs : Coletar variáveis de ambiente ------------------------------------- 0.39s
2026-10-05T13:47:47.6153041Z nfs : Remove pacote jbcs-httpd ------------------------------------------ 0.38s
2026-10-05T13:47:47.6153447Z nfs : execute clean json ------------------------------------------------ 0.38s
2026-10-05T13:47:47.6153789Z nfs : Executar o comando abaixo para limitar as portas ------------------ 0.24s
2026-10-05T13:47:47.6154123Z nfs : Create a symbolic link -------------------------------------------- 0.24s
2026-10-05T13:47:47.6154471Z nfs : include_tasks ----------------------------------------------------- 0.06s
2026-10-05T13:47:47.6154795Z nfs : ansible.builtin.debug --------------------------------------------- 0.06s
2026-10-05T13:47:47.6155133Z nfs : Criar variáveis --------------------------------------------------- 0.06s
2026-10-05T13:47:47.6155480Z nfs : Validando Montagem ------------------------------------------------ 0.06s
2026-10-05T13:47:47.6155980Z nfs : Criar variáveis --------------------------------------------------- 0.06s
2026-10-05T13:47:47.6156317Z nfs : result_new_string_json -------------------------------------------- 0.06s
2026-10-05T13:47:47.6156648Z nfs : result_new_json --------------------------------------------------- 0.06s
2026-10-05T13:47:47.6156891Z Playbook run took 0 days, 0 hours, 3 minutes, 25 seconds
2026-10-05T13:47:47.6639283Z ##[error]Bash exited with code '2'.
2026-10-05T13:47:47.6658079Z ##[warning]RetryHelper encountered task failure, will retry (attempt #: 2 out of 2) after 4000 ms
2026-10-05T13:47:51.7454800Z Generating script.
2026-10-05T13:47:51.7465583Z ========================== Starting Command Output ===========================
2026-10-05T13:47:51.7472825Z [command]/bin/bash /opt/ads-agent/_work/_temp/9b1886f6-8853-4c81-b85d-113dff304ffd.sh
2026-10-05T13:47:53.7171067Z 
2026-10-05T13:47:53.7171565Z PLAY [local] *******************************************************************
2026-10-05T13:47:53.7424713Z 
2026-10-05T13:47:53.7426110Z PLAY [Configurando o DNS] ******************************************************
2026-10-05T13:47:53.9149541Z 
2026-10-05T13:47:53.9150267Z PLAY [local] *******************************************************************
2026-10-05T13:47:53.9181165Z 
2026-10-05T13:47:53.9181696Z PLAY [Verificando serviços] ****************************************************
2026-10-05T13:47:53.9260772Z 
2026-10-05T13:47:53.9261070Z PLAY [Configuração LDAP] *******************************************************
2026-10-05T13:47:53.9292443Z [WARNING]: Found variable using reserved name: when
2026-10-05T13:47:53.9296883Z 
2026-10-05T13:47:53.9297176Z PLAY [jboss] *******************************************************************
2026-10-05T13:47:53.9379074Z 
2026-10-05T13:47:53.9379376Z PLAY [Stack Jboss] *************************************************************
2026-10-05T13:47:53.9405924Z 
2026-10-05T13:47:53.9406275Z PLAY [jboss] *******************************************************************
2026-10-05T13:47:53.9444019Z 
2026-10-05T13:47:53.9444281Z PLAY [jboss] *******************************************************************
2026-10-05T13:47:53.9690776Z Monday 05 October 2026  10:47:53 -0300 (0:00:00.311)       0:00:00.311 ******** 
2026-10-05T13:47:54.3878275Z 
2026-10-05T13:47:54.3880009Z TASK [Verifica se o arquivo nfs_config.json existe] ****************************
2026-10-05T13:47:54.3885845Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-05T13:47:54.3901835Z Monday 05 October 2026  10:47:54 -0300 (0:00:00.420)       0:00:00.732 ******** 
2026-10-05T13:47:54.4344660Z included: /opt/ads-agent/_work/r5945/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for caddeapllx2781.agil.nprd.caixa.gov.br
2026-10-05T13:47:54.4382115Z Monday 05 October 2026  10:47:54 -0300 (0:00:00.048)       0:00:00.780 ******** 
2026-10-05T13:47:54.4921395Z 
2026-10-05T13:47:54.4922124Z TASK [nfs : Criar variáveis] ***************************************************
2026-10-05T13:47:54.4922515Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-05T13:47:54.4955229Z Monday 05 October 2026  10:47:54 -0300 (0:00:00.057)       0:00:00.837 ******** 
2026-10-05T13:47:54.8702138Z 
2026-10-05T13:47:54.8702836Z TASK [nfs : Coletar variáveis de ambiente] *************************************
2026-10-05T13:47:54.8703003Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-05T13:47:54.8716684Z Monday 05 October 2026  10:47:54 -0300 (0:00:00.376)       0:00:01.213 ******** 
2026-10-05T13:47:54.9232658Z 
2026-10-05T13:47:54.9233265Z TASK [nfs : Exibir resultado em JSON] ******************************************
2026-10-05T13:47:54.9235350Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br] => {
2026-10-05T13:47:54.9235592Z     "nfs_vars_json": {
2026-10-05T13:47:54.9235897Z         "changed": false, 
2026-10-05T13:47:54.9236284Z         "cmd": "cat /opt/ads-agent/_work/r5945/a/nfs_config.json", 
2026-10-05T13:47:54.9236528Z         "delta": "0:00:00.002709", 
2026-10-05T13:47:54.9236973Z         "end": "2026-10-05 10:47:54.856779", 
2026-10-05T13:47:54.9237458Z         "failed": false, 
2026-10-05T13:47:54.9240437Z         "rc": 0, 
2026-10-05T13:47:54.9240834Z         "start": "2026-10-05 10:47:54.854070", 
2026-10-05T13:47:54.9240966Z         "stderr": "", 
2026-10-05T13:47:54.9241076Z         "stderr_lines": [], 
2026-10-05T13:47:54.9241254Z         "stdout": "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW\",\"NFS_MOUNT_POINT_ISILON\": \"/sisme_fgw\"}]", 
2026-10-05T13:47:54.9241775Z         "stdout_lines": [
2026-10-05T13:47:54.9242313Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW\",\"NFS_MOUNT_POINT_ISILON\": \"/sisme_fgw\"}]"
2026-10-05T13:47:54.9242471Z         ]
2026-10-05T13:47:54.9242562Z     }
2026-10-05T13:47:54.9242651Z }
2026-10-05T13:47:54.9257079Z Monday 05 October 2026  10:47:54 -0300 (0:00:00.054)       0:00:01.267 ******** 
2026-10-05T13:47:54.9815992Z 
2026-10-05T13:47:54.9816546Z TASK [nfs : Criar variáveis] ***************************************************
2026-10-05T13:47:54.9817008Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-05T13:47:54.9850341Z Monday 05 October 2026  10:47:54 -0300 (0:00:00.059)       0:00:01.327 ******** 
2026-10-05T13:47:57.9941992Z 
2026-10-05T13:47:57.9942512Z TASK [nfs : execute montagem script] *******************************************
2026-10-05T13:47:57.9942663Z changed: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-05T13:47:57.9969412Z Monday 05 October 2026  10:47:57 -0300 (0:00:03.011)       0:00:04.338 ******** 
2026-10-05T13:47:58.0524157Z 
2026-10-05T13:47:58.0524646Z TASK [nfs : ansible.builtin.debug] *********************************************
2026-10-05T13:47:58.0526902Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br] => {
2026-10-05T13:47:58.0527173Z     "changed": false, 
2026-10-05T13:47:58.0527366Z     "msg": {
2026-10-05T13:47:58.0527486Z         "changed": true, 
2026-10-05T13:47:58.0527608Z         "cmd": [
2026-10-05T13:47:58.0527694Z             "python", 
2026-10-05T13:47:58.0528072Z             "/opt/ads-agent/_work/r5945/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py", 
2026-10-05T13:47:58.0528226Z             "montagem", 
2026-10-05T13:47:58.0530007Z             "sisme-rotinas", 
2026-10-05T13:47:58.0530520Z             "tqs", 
2026-10-05T13:47:58.0530663Z             "ctc_nprd", 
2026-10-05T13:47:58.0530930Z             "/opt/ads-agent/_work/r5945/a/esteira-jboss-vm-v2", 
2026-10-05T13:47:58.0531070Z             "C&t@d02", 
2026-10-05T13:47:58.0531246Z             "***", 
2026-10-05T13:47:58.0531528Z             "s736651@corp.caixa.gov.br", 
2026-10-05T13:47:58.0531649Z             "***", 
2026-10-05T13:47:58.0531813Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW\",\"NFS_MOUNT_POINT_ISILON\": \"/sisme_fgw\"}]"
2026-10-05T13:47:58.0531971Z         ], 
2026-10-05T13:47:58.0532094Z         "delta": "0:00:02.721147", 
2026-10-05T13:47:58.0533069Z         "end": "2026-10-05 10:47:57.978826", 
2026-10-05T13:47:58.0533223Z         "failed": false, 
2026-10-05T13:47:58.0533328Z         "rc": 0, 
2026-10-05T13:47:58.0533502Z         "start": "2026-10-05 10:47:55.257679", 
2026-10-05T13:47:58.0533619Z         "stderr": "", 
2026-10-05T13:47:58.0533715Z         "stderr_lines": [], 
2026-10-05T13:47:58.0534775Z         "stdout": "[{u'NFS_MOUNT_POINT_ISILON': u'/sisme_fgw', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW'}]\nNome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           \n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW /sisme_fgw                          ISILON                              nfsctcnprd.ctc.caixa                tqs                                \nnfs_path=/sisme_fgw\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW /sisme_fgw                          ISILON                              nfsctcnprd.ctc.caixa                tqs                                ", 
2026-10-05T13:47:58.0535465Z         "stdout_lines": [
2026-10-05T13:47:58.0535747Z             "[{u'NFS_MOUNT_POINT_ISILON': u'/sisme_fgw', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW'}]", 
2026-10-05T13:47:58.0535944Z             "Nome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           ", 
2026-10-05T13:47:58.0536303Z             "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------", 
2026-10-05T13:47:58.0536546Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW /sisme_fgw                          ISILON                              nfsctcnprd.ctc.caixa                tqs                                ", 
2026-10-05T13:47:58.0536766Z             "nfs_path=/sisme_fgw", 
2026-10-05T13:47:58.0536905Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW", 
2026-10-05T13:47:58.0537098Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW /sisme_fgw                          ISILON                              nfsctcnprd.ctc.caixa                tqs                                "
2026-10-05T13:47:58.0537248Z         ]
2026-10-05T13:47:58.0537337Z     }
2026-10-05T13:47:58.0537418Z }
2026-10-05T13:47:58.0550271Z Monday 05 October 2026  10:47:58 -0300 (0:00:00.058)       0:00:04.397 ******** 
2026-10-05T13:47:58.4211504Z 
2026-10-05T13:47:58.4212295Z TASK [nfs : execute clean json] ************************************************
2026-10-05T13:47:58.4214476Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-10-05T13:47:58.4215289Z caddeapllx2781.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-10-05T13:47:58.4215516Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-10-05T13:47:58.4215945Z releases. A future Ansible release will default to using the discovered 
2026-10-05T13:47:58.4216123Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-10-05T13:47:58.4216278Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-10-05T13:47:58.4216436Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-10-05T13:47:58.4216597Z setting deprecation_warnings=False in ansible.cfg.
2026-10-05T13:47:58.4216739Z changed: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-05T13:47:58.4238223Z Monday 05 October 2026  10:47:58 -0300 (0:00:00.368)       0:00:04.765 ******** 
2026-10-05T13:47:58.4788514Z 
2026-10-05T13:47:58.4788884Z TASK [nfs : result_new_string_json] ********************************************
2026-10-05T13:47:58.4791718Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br] => {
2026-10-05T13:47:58.4791896Z     "msg": {
2026-10-05T13:47:58.4792004Z         "ansible_facts": {
2026-10-05T13:47:58.4792131Z             "discovered_interpreter_python": "/usr/bin/python"
2026-10-05T13:47:58.4792288Z         }, 
2026-10-05T13:47:58.4792390Z         "changed": true, 
2026-10-05T13:47:58.4792980Z         "cmd": "echo '[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW\",\"NFS_MOUNT_POINT_ISILON\": \"/sisme_fgw\"}]' | sed 's/NFS_ENDPOINT_ISILON[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_ISILON[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_HUAWEI[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_HUAWEI[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_VM[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_VM[^\"]*/NFS_MOUNT_POINT/g'", 
2026-10-05T13:47:58.4793687Z         "delta": "0:00:00.003385", 
2026-10-05T13:47:58.4793804Z         "deprecations": [
2026-10-05T13:47:58.4793892Z             {
2026-10-05T13:47:58.4794432Z                 "msg": "Distribution rhel 9.3 on host caddeapllx2781.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, but is using /usr/bin/python for backward compatibility with prior Ansible releases. A future Ansible release will default to using the discovered platform python for this host. See https://docs.ansible.com/ansible/2.9/reference_appendices/interpreter_discovery.html for more information", 
2026-10-05T13:47:58.4794723Z                 "version": "2.12"
2026-10-05T13:47:58.4794876Z             }
2026-10-05T13:47:58.4794972Z         ], 
2026-10-05T13:47:58.4795141Z         "end": "2026-10-05 10:47:58.405662", 
2026-10-05T13:47:58.4795264Z         "failed": false, 
2026-10-05T13:47:58.4795357Z         "rc": 0, 
2026-10-05T13:47:58.4795522Z         "start": "2026-10-05 10:47:58.402277", 
2026-10-05T13:47:58.4795643Z         "stderr": "", 
2026-10-05T13:47:58.4795748Z         "stderr_lines": [], 
2026-10-05T13:47:58.4795916Z         "stdout": "[{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW\",\"NFS_MOUNT_POINT\": \"/sisme_fgw\"}]", 
2026-10-05T13:47:58.4796071Z         "stdout_lines": [
2026-10-05T13:47:58.4796219Z             "[{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW\",\"NFS_MOUNT_POINT\": \"/sisme_fgw\"}]"
2026-10-05T13:47:58.4796361Z         ]
2026-10-05T13:47:58.4796449Z     }
2026-10-05T13:47:58.4796534Z }
2026-10-05T13:47:58.4813929Z Monday 05 October 2026  10:47:58 -0300 (0:00:00.057)       0:00:04.823 ******** 
2026-10-05T13:47:58.5350100Z 
2026-10-05T13:47:58.5350369Z TASK [nfs : Parse JSON data] ***************************************************
2026-10-05T13:47:58.5350525Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-05T13:47:58.5369605Z Monday 05 October 2026  10:47:58 -0300 (0:00:00.055)       0:00:04.879 ******** 
2026-10-05T13:47:58.5912592Z 
2026-10-05T13:47:58.5912882Z TASK [nfs : result_new_json] ***************************************************
2026-10-05T13:47:58.5913571Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br] => {
2026-10-05T13:47:58.5913692Z     "msg": [
2026-10-05T13:47:58.5913790Z         {
2026-10-05T13:47:58.5913928Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW", 
2026-10-05T13:47:58.5914328Z             "NFS_MOUNT_POINT": "/sisme_fgw"
2026-10-05T13:47:58.5914436Z         }
2026-10-05T13:47:58.5914526Z     ]
2026-10-05T13:47:58.5914616Z }
2026-10-05T13:47:58.5935451Z Monday 05 October 2026  10:47:58 -0300 (0:00:00.056)       0:00:04.935 ******** 
2026-10-05T13:47:58.6495817Z included: /opt/ads-agent/_work/r5945/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx2781.agil.nprd.caixa.gov.br
2026-10-05T13:47:58.6546254Z Monday 05 October 2026  10:47:58 -0300 (0:00:00.061)       0:00:04.996 ******** 
2026-10-05T13:47:58.7058575Z 
2026-10-05T13:47:58.7059194Z TASK [nfs : Parse JSON data] ***************************************************
2026-10-05T13:47:58.7059417Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-05T13:47:58.7079837Z Monday 05 October 2026  10:47:58 -0300 (0:00:00.053)       0:00:05.050 ******** 
2026-10-05T13:47:58.7589472Z 
2026-10-05T13:47:58.7590126Z TASK [nfs : debug] *************************************************************
2026-10-05T13:47:58.7590305Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br] => {
2026-10-05T13:47:58.7590422Z     "msg": {
2026-10-05T13:47:58.7590571Z         "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW", 
2026-10-05T13:47:58.7590722Z         "NFS_MOUNT_POINT": "/sisme_fgw"
2026-10-05T13:47:58.7591057Z     }
2026-10-05T13:47:58.7591138Z }
2026-10-05T13:47:58.7611824Z Monday 05 October 2026  10:47:58 -0300 (0:00:00.053)       0:00:05.103 ******** 
2026-10-05T13:47:58.8119083Z 
2026-10-05T13:47:58.8119785Z TASK [nfs : debug] *************************************************************
2026-10-05T13:47:58.8120052Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br] => {
2026-10-05T13:47:58.8120248Z     "msg": "/sisme_fgw"
2026-10-05T13:47:58.8120338Z }
2026-10-05T13:47:58.8141109Z Monday 05 October 2026  10:47:58 -0300 (0:00:00.052)       0:00:05.156 ******** 
2026-10-05T13:47:58.8639222Z 
2026-10-05T13:47:58.8639588Z TASK [nfs : debug] *************************************************************
2026-10-05T13:47:58.8640031Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br] => {
2026-10-05T13:47:58.8640192Z     "msg": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW"
2026-10-05T13:47:58.8640328Z }
2026-10-05T13:47:58.8663452Z Monday 05 October 2026  10:47:58 -0300 (0:00:00.052)       0:00:05.208 ******** 
2026-10-05T13:47:58.9193563Z 
2026-10-05T13:47:58.9193916Z TASK [nfs : Verificando as variaveis] ******************************************
2026-10-05T13:47:58.9194315Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br] => {
2026-10-05T13:47:58.9194442Z     "changed": false, 
2026-10-05T13:47:58.9194558Z     "msg": "All assertions passed"
2026-10-05T13:47:58.9194648Z }
2026-10-05T13:47:58.9219140Z Monday 05 October 2026  10:47:58 -0300 (0:00:00.055)       0:00:05.263 ******** 
2026-10-05T13:48:02.3236884Z 
2026-10-05T13:48:02.3237704Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-10-05T13:48:02.3238487Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-05T13:48:02.3270275Z Monday 05 October 2026  10:48:02 -0300 (0:00:03.403)       0:00:08.666 ******** 
2026-10-05T13:48:03.0671598Z 
2026-10-05T13:48:03.0672287Z TASK [nfs : Install networker lgtoclnt_url] ************************************
2026-10-05T13:48:03.0673839Z fatal: [caddeapllx2781.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.508523", "end": "2026-10-05 10:48:03.048477", "msg": "non-zero return code", "rc": 1, "start": "2026-10-05 10:48:02.539954", "stderr": "aviso: /var/tmp/rpm-tmp.TBjiEO: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.TBjiEO: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-10-05T13:48:03.0674886Z ...ignoring
2026-10-05T13:48:03.0675658Z Monday 05 October 2026  10:48:03 -0300 (0:00:00.741)       0:00:09.408 ******** 
2026-10-05T13:48:03.0675892Z [WARNING]: Consider using the yum, dnf or zypper module rather than running
2026-10-05T13:48:03.0676123Z 'rpm'.  If you need to use command because yum, dnf or zypper is insufficient
2026-10-05T13:48:03.0676342Z you can add 'warn: false' to this command task or set 'command_warnings=False'
2026-10-05T13:48:03.0676497Z in ansible.cfg to get rid of this message.
2026-10-05T13:48:03.7389209Z 
2026-10-05T13:48:03.7389735Z TASK [nfs : Install networker lgtonmda_url] ************************************
2026-10-05T13:48:03.7393789Z fatal: [caddeapllx2781.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.436120", "end": "2026-10-05 10:48:03.723991", "msg": "non-zero return code", "rc": 1, "start": "2026-10-05 10:48:03.287871", "stderr": "aviso: /var/tmp/rpm-tmp.F0gb42: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.F0gb42: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-10-05T13:48:03.7394658Z ...ignoring
2026-10-05T13:48:03.7419549Z Monday 05 October 2026  10:48:03 -0300 (0:00:00.675)       0:00:10.084 ******** 
2026-10-05T13:48:04.1240283Z 
2026-10-05T13:48:04.1240962Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-10-05T13:48:04.1241201Z changed: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-05T13:48:04.1266194Z Monday 05 October 2026  10:48:04 -0300 (0:00:00.384)       0:00:10.468 ******** 
2026-10-05T13:48:04.3618728Z 
2026-10-05T13:48:04.3619215Z TASK [nfs : Create a symbolic link] ********************************************
2026-10-05T13:48:04.3619377Z changed: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-05T13:48:04.3644680Z Monday 05 October 2026  10:48:04 -0300 (0:00:00.237)       0:00:10.706 ******** 
2026-10-05T13:48:05.2111247Z 
2026-10-05T13:48:05.2112015Z TASK [nfs : Networker | Start networker] ***************************************
2026-10-05T13:48:05.2112216Z ok: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-05T13:48:05.2147964Z Monday 05 October 2026  10:48:05 -0300 (0:00:00.850)       0:00:11.556 ******** 
2026-10-05T13:48:05.4596648Z 
2026-10-05T13:48:05.4597129Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-10-05T13:48:05.4597295Z changed: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-05T13:48:05.4620649Z Monday 05 October 2026  10:48:05 -0300 (0:00:00.247)       0:00:11.804 ******** 
2026-10-05T13:48:15.8550415Z 
2026-10-05T13:48:15.8550895Z TASK [nfs : Networker | Restart networker] *************************************
2026-10-05T13:48:15.8551072Z changed: [caddeapllx2781.agil.nprd.caixa.gov.br]
2026-10-05T13:48:15.8573832Z Monday 05 October 2026  10:48:15 -0300 (0:00:10.395)       0:00:22.199 ******** 
2026-10-05T13:51:16.4509666Z 
2026-10-05T13:51:16.4510254Z TASK [nfs : Montando volume remoto] ********************************************
2026-10-05T13:51:16.4510474Z fatal: [caddeapllx2781.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "msg": "Error mounting /sisme_fgw: mount.nfs: Connection timed out\n"}
2026-10-05T13:51:16.4513017Z ...ignoring
2026-10-05T13:51:16.4533140Z Monday 05 October 2026  10:51:16 -0300 (0:03:00.595)       0:03:22.795 ******** 
2026-10-05T13:51:16.5106335Z 
2026-10-05T13:51:16.5107042Z TASK [nfs : Validando Montagem] ************************************************
2026-10-05T13:51:16.5108497Z fatal: [caddeapllx2781.agil.nprd.caixa.gov.br]: FAILED! => {
2026-10-05T13:51:16.5108763Z     "assertion": "'Connection refused' in mountnfs.msg", 
2026-10-05T13:51:16.5108926Z     "changed": false, 
2026-10-05T13:51:16.5109045Z     "evaluated_to": false, 
2026-10-05T13:51:16.5109186Z     "msg": "Erro desconhecido: Error mounting /sisme_fgw: mount.nfs: Connection timed out\n"
2026-10-05T13:51:16.5109323Z }
2026-10-05T13:51:16.5109709Z 
2026-10-05T13:51:16.5109849Z PLAY RECAP *********************************************************************
2026-10-05T13:51:16.5110383Z caddeapllx2781.agil.nprd.caixa.gov.br : ok=27   changed=8    unreachable=0    failed=1    skipped=0    rescued=0    ignored=3   
2026-10-05T13:51:16.5110842Z 
2026-10-05T13:51:16.5111160Z Monday 05 October 2026  10:51:16 -0300 (0:00:00.057)       0:03:22.853 ******** 
2026-10-05T13:51:16.5111348Z =============================================================================== 
2026-10-05T13:51:16.5113704Z nfs : Montando volume remoto ------------------------------------------ 180.60s
2026-10-05T13:51:16.5114009Z nfs : Networker | Restart networker ------------------------------------ 10.40s
2026-10-05T13:51:16.5114240Z nfs : Instalando o NFS Client ------------------------------------------- 3.40s
2026-10-05T13:51:16.5114473Z nfs : execute montagem script ------------------------------------------- 3.01s
2026-10-05T13:51:16.5114710Z nfs : Networker | Start networker --------------------------------------- 0.85s
2026-10-05T13:51:16.5114934Z nfs : Install networker lgtoclnt_url ------------------------------------ 0.74s
2026-10-05T13:51:16.5115143Z nfs : Install networker lgtonmda_url ------------------------------------ 0.68s
2026-10-05T13:51:16.5115369Z Verifica se o arquivo nfs_config.json existe ---------------------------- 0.42s
2026-10-05T13:51:16.5115598Z nfs : Remove pacote jbcs-httpd ------------------------------------------ 0.38s
2026-10-05T13:51:16.5115829Z nfs : Coletar variáveis de ambiente ------------------------------------- 0.38s
2026-10-05T13:51:16.5116049Z nfs : execute clean json ------------------------------------------------ 0.37s
2026-10-05T13:51:16.5116269Z nfs : Executar o comando abaixo para limitar as portas ------------------ 0.25s
2026-10-05T13:51:16.5116493Z nfs : Create a symbolic link -------------------------------------------- 0.24s
2026-10-05T13:51:16.5116726Z nfs : include_tasks ----------------------------------------------------- 0.06s
2026-10-05T13:51:16.5116932Z nfs : Criar variáveis --------------------------------------------------- 0.06s
2026-10-05T13:51:16.5117243Z nfs : ansible.builtin.debug --------------------------------------------- 0.06s
2026-10-05T13:51:16.5117469Z nfs : Validando Montagem ------------------------------------------------ 0.06s
2026-10-05T13:51:16.5117685Z nfs : result_new_string_json -------------------------------------------- 0.06s
2026-10-05T13:51:16.5117897Z nfs : Criar variáveis --------------------------------------------------- 0.06s
2026-10-05T13:51:16.5118254Z nfs : result_new_json --------------------------------------------------- 0.06s
2026-10-05T13:51:16.5118411Z Playbook run took 0 days, 0 hours, 3 minutes, 22 seconds
2026-10-05T13:51:16.5587580Z ##[error]Bash exited with code '2'.
2026-10-05T13:51:16.5614141Z ##[section]Finishing: Configura Control-M




Are you sure you want to continue connecting (yes/no/[fingerprint])? yes
Warning: Permanently added '10.116.201.252' (ED25519) to the list of known hosts                                                                                                                    .
p585600@10.116.201.252's password:
[p585600@caddeapllx2781 ~]$
[p585600@caddeapllx2781 ~]$
[p585600@caddeapllx2781 ~]$
[p585600@caddeapllx2781 ~]$
[p585600@caddeapllx2781 ~]$ ps -ef | grep sisme
p585600    44589   44560  0 15:51 pts/0    00:00:00 grep --color=auto sisme
[p585600@caddeapllx2781 ~]$
[p585600@caddeapllx2781 ~]$
[p585600@caddeapllx2781 ~]$



