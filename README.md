2026-07-16T15:23:27.0475210Z ##[section]Starting: Deploy Config no JBOSS
2026-07-16T15:23:27.0478365Z ==============================================================================
2026-07-16T15:23:27.0478446Z Task         : Bash
2026-07-16T15:23:27.0478490Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-16T15:23:27.0478571Z Version      : 3.227.0
2026-07-16T15:23:27.0478615Z Author       : Microsoft Corporation
2026-07-16T15:23:27.0478674Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-16T15:23:27.0478748Z ==============================================================================
2026-07-16T15:23:27.8405151Z Generating script.
2026-07-16T15:23:27.8418441Z ========================== Starting Command Output ===========================
2026-07-16T15:23:27.8422849Z [command]/bin/bash /opt/ads-agent/_work/_temp/94df3e11-9d15-491c-a506-1d0dad3021a2.sh
2026-07-16T15:23:27.8490156Z /opt/ads-agent/_work/_temp/94df3e11-9d15-491c-a506-1d0dad3021a2.sh: line 2: quantidade_vm: comando não encontrado
2026-07-16T15:23:27.8501155Z /opt/ads-agent/_work/_temp/94df3e11-9d15-491c-a506-1d0dad3021a2.sh: line 2: USE_WMQ: comando não encontrado
2026-07-16T15:23:29.8848278Z 
2026-07-16T15:23:29.8848789Z PLAY [local] *******************************************************************
2026-07-16T15:23:29.9122759Z 
2026-07-16T15:23:29.9123466Z PLAY [Configurando o DNS] ******************************************************
2026-07-16T15:23:30.0921421Z 
2026-07-16T15:23:30.0922726Z PLAY [local] *******************************************************************
2026-07-16T15:23:30.0958462Z 
2026-07-16T15:23:30.0959374Z PLAY [Verificando serviços] ****************************************************
2026-07-16T15:23:30.1046064Z 
2026-07-16T15:23:30.1046951Z PLAY [Configuração LDAP] *******************************************************
2026-07-16T15:23:30.1083033Z [WARNING]: Found variable using reserved name: when
2026-07-16T15:23:30.1087936Z 
2026-07-16T15:23:30.1088687Z PLAY [jboss] *******************************************************************
2026-07-16T15:23:30.1187899Z 
2026-07-16T15:23:30.1188553Z PLAY [Stack Jboss] *************************************************************
2026-07-16T15:23:30.1532400Z Thursday 16 July 2026  12:23:30 -0300 (0:00:00.327)       0:00:00.327 ********* 
2026-07-16T15:23:30.6410510Z 
2026-07-16T15:23:30.6411655Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-07-16T15:23:30.6411908Z ok: [caddeapllx1950.agil.nprd.caixa.gov.br]
2026-07-16T15:23:30.6428202Z 
2026-07-16T15:23:30.6428513Z PLAY [jboss] *******************************************************************
2026-07-16T15:23:30.6493804Z Thursday 16 July 2026  12:23:30 -0300 (0:00:00.496)       0:00:00.824 ********* 
2026-07-16T15:23:30.9628150Z 
2026-07-16T15:23:30.9628681Z TASK [Verifica se o arquivo nfs_config.json existe] ****************************
2026-07-16T15:23:30.9628851Z ok: [caddeapllx1950.agil.nprd.caixa.gov.br]
2026-07-16T15:23:30.9663010Z Thursday 16 July 2026  12:23:30 -0300 (0:00:00.316)       0:00:01.141 ********* 
2026-07-16T15:23:31.0127315Z included: /opt/ads-agent/_work/r17120/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for caddeapllx1950.agil.nprd.caixa.gov.br
2026-07-16T15:23:31.0168720Z Thursday 16 July 2026  12:23:31 -0300 (0:00:00.050)       0:00:01.191 ********* 
2026-07-16T15:23:31.0724037Z 
2026-07-16T15:23:31.0725097Z TASK [nfs : Criar variáveis] ***************************************************
2026-07-16T15:23:31.0725404Z ok: [caddeapllx1950.agil.nprd.caixa.gov.br]
2026-07-16T15:23:31.0763181Z Thursday 16 July 2026  12:23:31 -0300 (0:00:00.059)       0:00:01.251 ********* 
2026-07-16T15:23:31.4707090Z 
2026-07-16T15:23:31.4707925Z TASK [nfs : Coletar variáveis de ambiente] *************************************
2026-07-16T15:23:31.4708100Z ok: [caddeapllx1950.agil.nprd.caixa.gov.br]
2026-07-16T15:23:31.4717428Z Thursday 16 July 2026  12:23:31 -0300 (0:00:00.395)       0:00:01.646 ********* 
2026-07-16T15:23:31.5257613Z 
2026-07-16T15:23:31.5258235Z TASK [nfs : Exibir resultado em JSON] ******************************************
2026-07-16T15:23:31.5258401Z ok: [caddeapllx1950.agil.nprd.caixa.gov.br] => {
2026-07-16T15:23:31.5258529Z     "nfs_vars_json": {
2026-07-16T15:23:31.5258645Z         "changed": false, 
2026-07-16T15:23:31.5258976Z         "cmd": "cat /opt/ads-agent/_work/r17120/a/nfs_config.json", 
2026-07-16T15:23:31.5259140Z         "delta": "0:00:00.002982", 
2026-07-16T15:23:31.5259324Z         "end": "2026-07-16 12:23:31.454809", 
2026-07-16T15:23:31.5259450Z         "failed": false, 
2026-07-16T15:23:31.5259559Z         "rc": 0, 
2026-07-16T15:23:31.5259728Z         "start": "2026-07-16 12:23:31.451827", 
2026-07-16T15:23:31.5259841Z         "stderr": "", 
2026-07-16T15:23:31.5259954Z         "stderr_lines": [], 
2026-07-16T15:23:31.5260129Z         "stdout": "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMIL_DES\",\"NFS_MOUNT_POINT_ISILON\": \"/SIMIL_DES\"}]", 
2026-07-16T15:23:31.5260300Z         "stdout_lines": [
2026-07-16T15:23:31.5260470Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMIL_DES\",\"NFS_MOUNT_POINT_ISILON\": \"/SIMIL_DES\"}]"
2026-07-16T15:23:31.5260623Z         ]
2026-07-16T15:23:31.5260782Z     }
2026-07-16T15:23:31.5260876Z }
2026-07-16T15:23:31.5272689Z Thursday 16 July 2026  12:23:31 -0300 (0:00:00.055)       0:00:01.702 ********* 
2026-07-16T15:23:31.5855867Z 
2026-07-16T15:23:31.5856575Z TASK [nfs : Criar variáveis] ***************************************************
2026-07-16T15:23:31.5856743Z ok: [caddeapllx1950.agil.nprd.caixa.gov.br]
2026-07-16T15:23:31.5896085Z Thursday 16 July 2026  12:23:31 -0300 (0:00:00.062)       0:00:01.764 ********* 
2026-07-16T15:23:33.7488399Z 
2026-07-16T15:23:33.7488859Z TASK [nfs : execute montagem script] *******************************************
2026-07-16T15:23:33.7489029Z changed: [caddeapllx1950.agil.nprd.caixa.gov.br]
2026-07-16T15:23:33.7524722Z Thursday 16 July 2026  12:23:33 -0300 (0:00:02.162)       0:00:03.927 ********* 
2026-07-16T15:23:33.8101179Z 
2026-07-16T15:23:33.8102041Z TASK [nfs : ansible.builtin.debug] *********************************************
2026-07-16T15:23:33.8102229Z ok: [caddeapllx1950.agil.nprd.caixa.gov.br] => {
2026-07-16T15:23:33.8102396Z     "changed": false, 
2026-07-16T15:23:33.8102506Z     "msg": {
2026-07-16T15:23:33.8102611Z         "changed": true, 
2026-07-16T15:23:33.8102728Z         "cmd": [
2026-07-16T15:23:33.8102860Z             "python", 
2026-07-16T15:23:33.8103208Z             "/opt/ads-agent/_work/r17120/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py", 
2026-07-16T15:23:33.8103358Z             "montagem", 
2026-07-16T15:23:33.8103513Z             "simil-internet", 
2026-07-16T15:23:33.8103622Z             "des", 
2026-07-16T15:23:33.8105930Z             "ctc_nprd", 
2026-07-16T15:23:33.8106519Z             "/opt/ads-agent/_work/r17120/a/esteira-jboss-vm-v2", 
2026-07-16T15:23:33.8107086Z             "C&t@d02", 
2026-07-16T15:23:33.8107428Z             "***", 
2026-07-16T15:23:33.8107629Z             "s736651@corp.caixa.gov.br", 
2026-07-16T15:23:33.8107834Z             "***", 
2026-07-16T15:23:33.8110750Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMIL_DES\",\"NFS_MOUNT_POINT_ISILON\": \"/SIMIL_DES\"}]"
2026-07-16T15:23:33.8112183Z         ], 
2026-07-16T15:23:33.8112462Z         "delta": "0:00:01.842361", 
2026-07-16T15:23:33.8112780Z         "end": "2026-07-16 12:23:33.733543", 
2026-07-16T15:23:33.8113034Z         "failed": false, 
2026-07-16T15:23:33.8113286Z         "rc": 0, 
2026-07-16T15:23:33.8113622Z         "start": "2026-07-16 12:23:31.891182", 
2026-07-16T15:23:33.8113967Z         "stderr": "", 
2026-07-16T15:23:33.8114123Z         "stderr_lines": [], 
2026-07-16T15:23:33.8115336Z         "stdout": "[{u'NFS_MOUNT_POINT_ISILON': u'/SIMIL_DES', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMIL_DES'}]\nNome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           \n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIMIL_DES /SIMIL_DES                          ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfs_path=/SIMIL_DES\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMIL_DES\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIMIL_DES /SIMIL_DES                          ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-07-16T15:23:33.8116105Z         "stdout_lines": [
2026-07-16T15:23:33.8116417Z             "[{u'NFS_MOUNT_POINT_ISILON': u'/SIMIL_DES', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMIL_DES'}]", 
2026-07-16T15:23:33.8116612Z             "Nome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           ", 
2026-07-16T15:23:33.8117058Z             "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------", 
2026-07-16T15:23:33.8117300Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIMIL_DES /SIMIL_DES                          ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-07-16T15:23:33.8117463Z             "nfs_path=/SIMIL_DES", 
2026-07-16T15:23:33.8117608Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMIL_DES", 
2026-07-16T15:23:33.8117795Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIMIL_DES /SIMIL_DES                          ISILON                              nfsctcnprd.ctc.caixa                des                                "
2026-07-16T15:23:33.8117939Z         ]
2026-07-16T15:23:33.8118033Z     }
2026-07-16T15:23:33.8118126Z }
2026-07-16T15:23:33.8128708Z Thursday 16 July 2026  12:23:33 -0300 (0:00:00.060)       0:00:03.987 ********* 
2026-07-16T15:23:34.0753170Z 
2026-07-16T15:23:34.0755309Z TASK [nfs : execute clean json] ************************************************
2026-07-16T15:23:34.0755662Z changed: [caddeapllx1950.agil.nprd.caixa.gov.br]
2026-07-16T15:23:34.0777218Z Thursday 16 July 2026  12:23:34 -0300 (0:00:00.264)       0:00:04.252 ********* 
2026-07-16T15:23:34.1372198Z 
2026-07-16T15:23:34.1372803Z TASK [nfs : result_new_string_json] ********************************************
2026-07-16T15:23:34.1373252Z ok: [caddeapllx1950.agil.nprd.caixa.gov.br] => {
2026-07-16T15:23:34.1373551Z     "msg": {
2026-07-16T15:23:34.1373810Z         "changed": true, 
2026-07-16T15:23:34.1374925Z         "cmd": "echo '[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMIL_DES\",\"NFS_MOUNT_POINT_ISILON\": \"/SIMIL_DES\"}]' | sed 's/NFS_ENDPOINT_ISILON[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_ISILON[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_HUAWEI[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_HUAWEI[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_VM[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_VM[^\"]*/NFS_MOUNT_POINT/g'", 
2026-07-16T15:23:34.1375415Z         "delta": "0:00:00.010639", 
2026-07-16T15:23:34.1375608Z         "end": "2026-07-16 12:23:34.058591", 
2026-07-16T15:23:34.1375736Z         "failed": false, 
2026-07-16T15:23:34.1375842Z         "rc": 0, 
2026-07-16T15:23:34.1376016Z         "start": "2026-07-16 12:23:34.047952", 
2026-07-16T15:23:34.1376417Z         "stderr": "", 
2026-07-16T15:23:34.1376530Z         "stderr_lines": [], 
2026-07-16T15:23:34.1376697Z         "stdout": "[{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMIL_DES\",\"NFS_MOUNT_POINT\": \"/SIMIL_DES\"}]", 
2026-07-16T15:23:34.1376862Z         "stdout_lines": [
2026-07-16T15:23:34.1377018Z             "[{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMIL_DES\",\"NFS_MOUNT_POINT\": \"/SIMIL_DES\"}]"
2026-07-16T15:23:34.1377167Z         ]
2026-07-16T15:23:34.1377251Z     }
2026-07-16T15:23:34.1377348Z }
2026-07-16T15:23:34.1395230Z Thursday 16 July 2026  12:23:34 -0300 (0:00:00.062)       0:00:04.314 ********* 
2026-07-16T15:23:34.1982057Z 
2026-07-16T15:23:34.1982561Z TASK [nfs : Parse JSON data] ***************************************************
2026-07-16T15:23:34.1982816Z ok: [caddeapllx1950.agil.nprd.caixa.gov.br]
2026-07-16T15:23:34.1999780Z Thursday 16 July 2026  12:23:34 -0300 (0:00:00.060)       0:00:04.375 ********* 
2026-07-16T15:23:34.2568028Z 
2026-07-16T15:23:34.2569772Z TASK [nfs : result_new_json] ***************************************************
2026-07-16T15:23:34.2570702Z ok: [caddeapllx1950.agil.nprd.caixa.gov.br] => {
2026-07-16T15:23:34.2571002Z     "msg": [
2026-07-16T15:23:34.2571507Z         {
2026-07-16T15:23:34.2571764Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMIL_DES", 
2026-07-16T15:23:34.2572050Z             "NFS_MOUNT_POINT": "/SIMIL_DES"
2026-07-16T15:23:34.2572258Z         }
2026-07-16T15:23:34.2572457Z     ]
2026-07-16T15:23:34.2572667Z }
2026-07-16T15:23:34.2592566Z Thursday 16 July 2026  12:23:34 -0300 (0:00:00.059)       0:00:04.434 ********* 
2026-07-16T15:23:34.3231444Z included: /opt/ads-agent/_work/r17120/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx1950.agil.nprd.caixa.gov.br
2026-07-16T15:23:34.3285237Z Thursday 16 July 2026  12:23:34 -0300 (0:00:00.069)       0:00:04.503 ********* 
2026-07-16T15:23:34.3946176Z 
2026-07-16T15:23:34.3946938Z TASK [nfs : Parse JSON data] ***************************************************
2026-07-16T15:23:34.3947205Z ok: [caddeapllx1950.agil.nprd.caixa.gov.br]
2026-07-16T15:23:34.3972821Z Thursday 16 July 2026  12:23:34 -0300 (0:00:00.068)       0:00:04.572 ********* 
2026-07-16T15:23:34.4524115Z 
2026-07-16T15:23:34.4524701Z TASK [nfs : debug] *************************************************************
2026-07-16T15:23:34.4524939Z ok: [caddeapllx1950.agil.nprd.caixa.gov.br] => {
2026-07-16T15:23:34.4525078Z     "msg": {
2026-07-16T15:23:34.4525970Z         "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMIL_DES", 
2026-07-16T15:23:34.4526283Z         "NFS_MOUNT_POINT": "/SIMIL_DES"
2026-07-16T15:23:34.4526823Z     }
2026-07-16T15:23:34.4526929Z }
2026-07-16T15:23:34.4548201Z Thursday 16 July 2026  12:23:34 -0300 (0:00:00.057)       0:00:04.629 ********* 
2026-07-16T15:23:34.5079085Z 
2026-07-16T15:23:34.5079852Z TASK [nfs : debug] *************************************************************
2026-07-16T15:23:34.5080497Z ok: [caddeapllx1950.agil.nprd.caixa.gov.br] => {
2026-07-16T15:23:34.5080706Z     "msg": "/SIMIL_DES"
2026-07-16T15:23:34.5080812Z }
2026-07-16T15:23:34.5100817Z Thursday 16 July 2026  12:23:34 -0300 (0:00:00.055)       0:00:04.685 ********* 
2026-07-16T15:23:34.5640908Z 
2026-07-16T15:23:34.5641701Z TASK [nfs : debug] *************************************************************
2026-07-16T15:23:34.5642056Z ok: [caddeapllx1950.agil.nprd.caixa.gov.br] => {
2026-07-16T15:23:34.5643312Z     "msg": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMIL_DES"
2026-07-16T15:23:34.5643518Z }
2026-07-16T15:23:34.5670259Z Thursday 16 July 2026  12:23:34 -0300 (0:00:00.056)       0:00:04.742 ********* 
2026-07-16T15:23:34.6255968Z 
2026-07-16T15:23:34.6256496Z TASK [nfs : Verificando as variaveis] ******************************************
2026-07-16T15:23:34.6256670Z ok: [caddeapllx1950.agil.nprd.caixa.gov.br] => {
2026-07-16T15:23:34.6257250Z     "changed": false, 
2026-07-16T15:23:34.6257656Z     "msg": "All assertions passed"
2026-07-16T15:23:34.6257771Z }
2026-07-16T15:23:34.6285759Z Thursday 16 July 2026  12:23:34 -0300 (0:00:00.061)       0:00:04.803 ********* 
2026-07-16T15:23:36.3499615Z 
2026-07-16T15:23:36.3500127Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-07-16T15:23:36.3500295Z ok: [caddeapllx1950.agil.nprd.caixa.gov.br]
2026-07-16T15:23:36.3537653Z Thursday 16 July 2026  12:23:36 -0300 (0:00:01.723)       0:00:06.526 ********* 
2026-07-16T15:23:36.9714192Z 
2026-07-16T15:23:36.9714698Z TASK [nfs : Install networker lgtoclnt_url] ************************************
2026-07-16T15:23:36.9717578Z [WARNING]: Consider using the yum, dnf or zypper module rather than running
2026-07-16T15:23:36.9718211Z 'rpm'.  If you need to use command because yum, dnf or zypper is insufficient
2026-07-16T15:23:36.9718452Z you can add 'warn: false' to this command task or set 'command_warnings=False'
2026-07-16T15:23:36.9718633Z in ansible.cfg to get rid of this message.
2026-07-16T15:23:36.9721859Z fatal: [caddeapllx1950.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.375533", "end": "2026-07-16 12:23:36.955890", "msg": "non-zero return code", "rc": 1, "start": "2026-07-16 12:23:36.580357", "stderr": "aviso: /var/tmp/rpm-tmp.94G8Wk: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.94G8Wk: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm", "Preparando...                         ########################################"]}
2026-07-16T15:23:36.9722808Z ...ignoring
2026-07-16T15:23:36.9750137Z Thursday 16 July 2026  12:23:36 -0300 (0:00:00.623)       0:00:07.150 ********* 
2026-07-16T15:23:37.5842502Z 
2026-07-16T15:23:37.5843282Z TASK [nfs : Install networker lgtonmda_url] ************************************
2026-07-16T15:23:37.5847133Z fatal: [caddeapllx1950.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.352107", "end": "2026-07-16 12:23:37.568653", "msg": "non-zero return code", "rc": 1, "start": "2026-07-16 12:23:37.216546", "stderr": "aviso: /var/tmp/rpm-tmp.GNkOWW: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.GNkOWW: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm", "Preparando...                         ########################################"]}
2026-07-16T15:23:37.5847901Z ...ignoring
2026-07-16T15:23:37.5872975Z Thursday 16 July 2026  12:23:37 -0300 (0:00:00.612)       0:00:07.762 ********* 
2026-07-16T15:23:38.0117143Z 
2026-07-16T15:23:38.0118246Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-07-16T15:23:38.0118487Z changed: [caddeapllx1950.agil.nprd.caixa.gov.br]
2026-07-16T15:23:38.0146372Z Thursday 16 July 2026  12:23:38 -0300 (0:00:00.427)       0:00:08.189 ********* 
2026-07-16T15:23:38.2698226Z 
2026-07-16T15:23:38.2698944Z TASK [nfs : Create a symbolic link] ********************************************
2026-07-16T15:23:38.2699841Z changed: [caddeapllx1950.agil.nprd.caixa.gov.br]
2026-07-16T15:23:38.2726099Z Thursday 16 July 2026  12:23:38 -0300 (0:00:00.257)       0:00:08.447 ********* 
2026-07-16T15:23:39.1068598Z 
2026-07-16T15:23:39.1069301Z TASK [nfs : Networker | Start networker] ***************************************
2026-07-16T15:23:39.1069609Z ok: [caddeapllx1950.agil.nprd.caixa.gov.br]
2026-07-16T15:23:39.1109203Z Thursday 16 July 2026  12:23:39 -0300 (0:00:00.838)       0:00:09.285 ********* 
2026-07-16T15:23:39.3785174Z 
2026-07-16T15:23:39.3786045Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-07-16T15:23:39.3786297Z changed: [caddeapllx1950.agil.nprd.caixa.gov.br]
2026-07-16T15:23:39.3810635Z Thursday 16 July 2026  12:23:39 -0300 (0:00:00.270)       0:00:09.556 ********* 
2026-07-16T15:23:49.8261016Z 
2026-07-16T15:23:49.8261705Z TASK [nfs : Networker | Restart networker] *************************************
2026-07-16T15:23:49.8262035Z changed: [caddeapllx1950.agil.nprd.caixa.gov.br]
2026-07-16T15:23:49.8284689Z Thursday 16 July 2026  12:23:49 -0300 (0:00:10.447)       0:00:20.003 ********* 
2026-07-16T15:23:50.2505563Z 
2026-07-16T15:23:50.2506213Z TASK [nfs : Montando volume remoto] ********************************************
2026-07-16T15:23:50.2506754Z ok: [caddeapllx1950.agil.nprd.caixa.gov.br]
2026-07-16T15:23:50.2512089Z Thursday 16 July 2026  12:23:50 -0300 (0:00:00.422)       0:00:20.426 ********* 
2026-07-16T15:23:50.2915601Z 
2026-07-16T15:23:50.2916152Z PLAY [jboss] *******************************************************************
2026-07-16T15:23:50.2957370Z 
2026-07-16T15:23:50.2957637Z PLAY [jboss] *******************************************************************
2026-07-16T15:23:50.2990074Z Thursday 16 July 2026  12:23:50 -0300 (0:00:00.047)       0:00:20.474 ********* 
2026-07-16T15:23:51.0708303Z 
2026-07-16T15:23:51.0709234Z TASK [Gathering Facts] *********************************************************
2026-07-16T15:23:51.0709689Z ok: [caddeapllx1950.agil.nprd.caixa.gov.br]
2026-07-16T15:23:51.0876530Z Thursday 16 July 2026  12:23:51 -0300 (0:00:00.788)       0:00:21.262 ********* 
2026-07-16T15:23:52.5086441Z 
2026-07-16T15:23:52.5086948Z TASK [Gerando fatos de servicos] ***********************************************
2026-07-16T15:23:52.5087138Z ok: [caddeapllx1950.agil.nprd.caixa.gov.br]
2026-07-16T15:23:52.5411819Z Thursday 16 July 2026  12:23:52 -0300 (0:00:01.453)       0:00:22.716 ********* 
2026-07-16T15:23:52.5994605Z 
2026-07-16T15:23:52.5995078Z TASK [Gerando lista de units jboss] ********************************************
2026-07-16T15:23:52.5995241Z ok: [caddeapllx1950.agil.nprd.caixa.gov.br]
2026-07-16T15:23:52.6264106Z Thursday 16 July 2026  12:23:52 -0300 (0:00:00.085)       0:00:22.801 ********* 
2026-07-16T15:23:52.6916899Z Thursday 16 July 2026  12:23:52 -0300 (0:00:00.065)       0:00:22.866 ********* 
2026-07-16T15:23:52.7025383Z 
2026-07-16T15:23:52.7026026Z PLAY [Copiando deployments adicionais] *****************************************
2026-07-16T15:23:52.7296016Z Thursday 16 July 2026  12:23:52 -0300 (0:00:00.037)       0:00:22.904 ********* 
2026-07-16T15:23:52.7841735Z 
2026-07-16T15:23:52.7842745Z TASK [Cria variável build_repository_name] *************************************
2026-07-16T15:23:52.7843384Z ok: [caddeapllx1950.agil.nprd.caixa.gov.br]
2026-07-16T15:23:52.8101242Z Thursday 16 July 2026  12:23:52 -0300 (0:00:00.080)       0:00:22.985 ********* 
2026-07-16T15:23:52.8648928Z 
2026-07-16T15:23:52.8649757Z TASK [Buscando diretorio de config] ********************************************
2026-07-16T15:23:52.8650371Z ok: [caddeapllx1950.agil.nprd.caixa.gov.br]
2026-07-16T15:23:52.8908752Z Thursday 16 July 2026  12:23:52 -0300 (0:00:00.080)       0:00:23.065 ********* 
2026-07-16T15:23:52.9452041Z 
2026-07-16T15:23:52.9452940Z TASK [Buscando diretorio de config] ********************************************
2026-07-16T15:23:52.9453146Z ok: [caddeapllx1950.agil.nprd.caixa.gov.br]
2026-07-16T15:23:52.9976859Z Thursday 16 July 2026  12:23:52 -0300 (0:00:00.106)       0:00:23.172 ********* 
2026-07-16T15:23:53.5346779Z 
2026-07-16T15:23:53.5348219Z TASK [Create a symbolic link] **************************************************
2026-07-16T15:23:53.5348658Z changed: [caddeapllx1950.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r17120/a/_SIMIL-internet-config)
2026-07-16T15:23:53.8166263Z changed: [caddeapllx1950.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r17120/a/_SIMIL-internet-config/jboss)
2026-07-16T15:23:53.8489175Z Thursday 16 July 2026  12:23:53 -0300 (0:00:00.851)       0:00:24.023 ********* 
2026-07-16T15:23:54.1541872Z 
2026-07-16T15:23:54.1542402Z TASK [Verifica se o arquivo  existe] *******************************************
2026-07-16T15:23:54.1542811Z ok: [caddeapllx1950.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r17120/a/_SIMIL-internet-config)
2026-07-16T15:23:54.4052266Z ok: [caddeapllx1950.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r17120/a/_SIMIL-internet-config/jboss)
2026-07-16T15:23:54.4331563Z Thursday 16 July 2026  12:23:54 -0300 (0:00:00.584)       0:00:24.608 ********* 
2026-07-16T15:23:54.5172371Z included: /opt/ads-agent/_work/r17120/a/esteira-jboss-vm-v2/roles/jboss/tasks/stack_deployments_custom_block.yml for caddeapllx1950.agil.nprd.caixa.gov.br
2026-07-16T15:23:54.5476201Z Thursday 16 July 2026  12:23:54 -0300 (0:00:00.114)       0:00:24.722 ********* 
2026-07-16T15:23:55.0075376Z 
2026-07-16T15:23:55.0076363Z TASK [Lendo artefatos do arquivo CSV] ******************************************
2026-07-16T15:23:55.0076665Z ok: [caddeapllx1950.agil.nprd.caixa.gov.br]
2026-07-16T15:23:55.0378881Z Thursday 16 July 2026  12:23:55 -0300 (0:00:00.490)       0:00:25.212 ********* 
2026-07-16T15:23:55.0452472Z [WARNING]: The loop variable 'item' is already in use. You should set the
2026-07-16T15:23:55.0452970Z `loop_var` value in the `loop_control` option for the task to something else to
2026-07-16T15:23:55.0453667Z avoid variable collisions and unexpected behavior.
2026-07-16T15:23:55.0837422Z 
2026-07-16T15:23:55.0838162Z TASK [Mostra artefatos] ********************************************************
2026-07-16T15:23:55.0839051Z ok: [caddeapllx1950.agil.nprd.caixa.gov.br] => (item={u'version': u'3.3.1', u'group_id': u'com.microsoft.azure', u'extension': u'jar', u'artifact_id': u'applicationinsights-agent'}) => {
2026-07-16T15:23:55.0839432Z     "msg": "Artefato: applicationinsights-agent - versao 3.3.1"
2026-07-16T15:23:55.0839692Z }
2026-07-16T15:23:55.1137308Z Thursday 16 July 2026  12:23:55 -0300 (0:00:00.075)       0:00:25.288 ********* 
2026-07-16T15:23:55.8015482Z 
2026-07-16T15:23:55.8016134Z TASK [maven_artifact] **********************************************************
2026-07-16T15:23:55.8016850Z changed: [caddeapllx1950.agil.nprd.caixa.gov.br] => (item={u'version': u'3.3.1', u'group_id': u'com.microsoft.azure', u'extension': u'jar', u'artifact_id': u'applicationinsights-agent'})
2026-07-16T15:23:55.8278489Z Thursday 16 July 2026  12:23:55 -0300 (0:00:00.714)       0:00:26.002 ********* 
2026-07-16T15:23:56.4779767Z 
2026-07-16T15:23:56.4780418Z TASK [Copiando artefatos para o(s) servidor(es) Jboss] *************************
2026-07-16T15:23:56.4780676Z ok: [caddeapllx1950.agil.nprd.caixa.gov.br]
2026-07-16T15:23:56.5110297Z Thursday 16 July 2026  12:23:56 -0300 (0:00:00.683)       0:00:26.685 ********* 
2026-07-16T15:23:56.5524266Z 
2026-07-16T15:23:56.5524833Z PLAY [Copiando modules adicionais] *********************************************
2026-07-16T15:23:56.5803649Z Thursday 16 July 2026  12:23:56 -0300 (0:00:00.069)       0:00:26.755 ********* 
2026-07-16T15:23:56.6356326Z 
2026-07-16T15:23:56.6357338Z TASK [Cria variável build_repository_name] *************************************
2026-07-16T15:23:56.6357535Z ok: [caddeapllx1950.agil.nprd.caixa.gov.br]
2026-07-16T15:23:56.6689127Z Thursday 16 July 2026  12:23:56 -0300 (0:00:00.088)       0:00:26.843 ********* 
2026-07-16T15:23:56.7225845Z 
2026-07-16T15:23:56.7226512Z TASK [Buscando diretorio de config] ********************************************
2026-07-16T15:23:56.7227155Z ok: [caddeapllx1950.agil.nprd.caixa.gov.br]
2026-07-16T15:23:56.7484053Z Thursday 16 July 2026  12:23:56 -0300 (0:00:00.079)       0:00:26.923 ********* 
2026-07-16T15:23:56.8006076Z 
2026-07-16T15:23:56.8006832Z TASK [Buscando diretorio de config] ********************************************
2026-07-16T15:23:56.8007201Z ok: [caddeapllx1950.agil.nprd.caixa.gov.br]
2026-07-16T15:23:56.8301580Z Thursday 16 July 2026  12:23:56 -0300 (0:00:00.081)       0:00:27.005 ********* 
2026-07-16T15:23:57.1335734Z 
2026-07-16T15:23:57.1336240Z TASK [Create a directory] ******************************************************
2026-07-16T15:23:57.1336651Z changed: [caddeapllx1950.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r17120/a/_SIMIL-internet-config)
2026-07-16T15:23:57.3844213Z changed: [caddeapllx1950.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r17120/a/_SIMIL-internet-config/jboss)
2026-07-16T15:23:57.4154321Z Thursday 16 July 2026  12:23:57 -0300 (0:00:00.585)       0:00:27.590 ********* 
2026-07-16T15:23:57.7298030Z 
2026-07-16T15:23:57.7298742Z TASK [Verifica se o arquivo  existe] *******************************************
2026-07-16T15:23:57.7299333Z ok: [caddeapllx1950.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r17120/a/_SIMIL-internet-config)
2026-07-16T15:23:57.9713677Z ok: [caddeapllx1950.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r17120/a/_SIMIL-internet-config/jboss)
2026-07-16T15:23:57.9998861Z Thursday 16 July 2026  12:23:57 -0300 (0:00:00.584)       0:00:28.174 ********* 
2026-07-16T15:23:58.0929127Z included: /opt/ads-agent/_work/r17120/a/esteira-jboss-vm-v2/roles/jboss/tasks/stack_modules_custom_block.yml for caddeapllx1950.agil.nprd.caixa.gov.br
2026-07-16T15:23:58.1217008Z Thursday 16 July 2026  12:23:58 -0300 (0:00:00.121)       0:00:28.296 ********* 
2026-07-16T15:23:58.4466543Z 
2026-07-16T15:23:58.4467309Z TASK [Lendo artefatos do arquivo CSV] ******************************************
2026-07-16T15:23:58.4467654Z ok: [caddeapllx1950.agil.nprd.caixa.gov.br]
2026-07-16T15:23:58.4751755Z Thursday 16 July 2026  12:23:58 -0300 (0:00:00.353)       0:00:28.650 ********* 
2026-07-16T15:23:58.4828325Z [WARNING]: The loop variable 'item' is already in use. You should set the
2026-07-16T15:23:58.4828534Z `loop_var` value in the `loop_control` option for the task to something else to
2026-07-16T15:23:58.4828704Z avoid variable collisions and unexpected behavior.
2026-07-16T15:23:58.5207153Z 
2026-07-16T15:23:58.5208196Z TASK [Mostra lista de artefatos] ***********************************************
2026-07-16T15:23:58.5208888Z ok: [caddeapllx1950.agil.nprd.caixa.gov.br] => (item={u'version': u'6.4.0', u'group_id': u'com.microsoft.sqlserver', u'extension': u'jar', u'artifact_id': u'mssql-jdbc'}) => {
2026-07-16T15:23:58.5209292Z     "msg": "Artefato: mssql-jdbc - versao 6.4.0"
2026-07-16T15:23:58.5209836Z }
2026-07-16T15:23:58.5516910Z ok: [caddeapllx1950.agil.nprd.caixa.gov.br] => (item={u'version': u'9.1-901.jdbc4', u'group_id': u'postgresql', u'extension': u'jar', u'artifact_id': u'postgresql-9.1-901.jdbc4.jar'}) => {
2026-07-16T15:23:58.5517605Z     "msg": "Artefato: postgresql-9.1-901.jdbc4.jar - versao 9.1-901.jdbc4"
2026-07-16T15:23:58.5518176Z }
2026-07-16T15:23:58.5777844Z Thursday 16 July 2026  12:23:58 -0300 (0:00:00.102)       0:00:28.752 ********* 
2026-07-16T15:23:58.9403423Z 
2026-07-16T15:23:58.9404142Z TASK [Listar arquivos no diretório baixados anteriormente] *********************
2026-07-16T15:23:58.9404304Z ok: [caddeapllx1950.agil.nprd.caixa.gov.br]
2026-07-16T15:23:58.9700693Z Thursday 16 July 2026  12:23:58 -0300 (0:00:00.392)       0:00:29.144 ********* 
2026-07-16T15:23:59.0086372Z [WARNING]: conditional statements should not include jinja2 templating
2026-07-16T15:23:59.0086805Z delimiters such as {{ }} or {% %}. Found: '{{ inner_item.artifact_id }}-{{
2026-07-16T15:23:59.0087033Z inner_item.version }}.{{ inner_item.extension|default('jar',true) }}' not in
2026-07-16T15:23:59.0087245Z files_found.files | map(attribute='path') | map('basename') | list
2026-07-16T15:23:59.0787054Z Thursday 16 July 2026  12:23:59 -0300 (0:00:00.108)       0:00:29.253 ********* 
2026-07-16T15:23:59.3777577Z 
2026-07-16T15:23:59.3778285Z TASK [Verifica se o arquivo jboss-modules-custom tem conteudo] *****************
2026-07-16T15:23:59.3778815Z ok: [caddeapllx1950.agil.nprd.caixa.gov.br]
2026-07-16T15:23:59.4046580Z Thursday 16 July 2026  12:23:59 -0300 (0:00:00.325)       0:00:29.579 ********* 
2026-07-16T15:23:59.5508282Z 
2026-07-16T15:23:59.5508888Z TASK [Copiando artefatos (Modules) para o(s) servidor(es) Jboss] ***************
2026-07-16T15:23:59.5509059Z ok: [caddeapllx1950.agil.nprd.caixa.gov.br]
2026-07-16T15:23:59.5759547Z Thursday 16 July 2026  12:23:59 -0300 (0:00:00.171)       0:00:29.750 ********* 
2026-07-16T15:24:00.1206649Z 
2026-07-16T15:24:00.1208533Z TASK [Copiando artefato (jboss-custom.cli) para o(s) servidor(es) Jboss] *******
2026-07-16T15:24:00.1208931Z ok: [caddeapllx1950.agil.nprd.caixa.gov.br]
2026-07-16T15:24:00.1484100Z Thursday 16 July 2026  12:24:00 -0300 (0:00:00.572)       0:00:30.323 ********* 
2026-07-16T15:24:02.4983293Z 
2026-07-16T15:24:02.4984145Z TASK [Executando o jboss-custom.cli] *******************************************
2026-07-16T15:24:02.4986292Z fatal: [caddeapllx1950.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": "./jboss-cli.sh --file=/tmp/src/jboss-custom.cli", "delta": "0:00:02.099463", "end": "2026-07-16 12:24:02.482496", "msg": "non-zero return code", "rc": 1, "start": "2026-07-16 12:24:00.383033", "stderr": "", "stderr_lines": [], "stdout": "Cannot start embedded server: WFLYEMB0021: Não foi possível iniciar o processo incorporado: JBTHR00005: Operation failed: WFLYSRV0056: A inicialização do servidor falhou numa maneira irrecuperável: encerrando. Consulte mensagens anteriores para maiores detalhes.", "stdout_lines": ["Cannot start embedded server: WFLYEMB0021: Não foi possível iniciar o processo incorporado: JBTHR00005: Operation failed: WFLYSRV0056: A inicialização do servidor falhou numa maneira irrecuperável: encerrando. Consulte mensagens anteriores para maiores detalhes."]}
2026-07-16T15:24:02.4991427Z 
2026-07-16T15:24:02.4992096Z PLAY RECAP *********************************************************************
2026-07-16T15:24:02.4992433Z caddeapllx1950.agil.nprd.caixa.gov.br : ok=53   changed=11   unreachable=0    failed=1    skipped=5    rescued=0    ignored=2   
2026-07-16T15:24:02.4992597Z 
2026-07-16T15:24:02.4993194Z Thursday 16 July 2026  12:24:02 -0300 (0:00:02.351)       0:00:32.674 ********* 
2026-07-16T15:24:02.4993492Z =============================================================================== 
2026-07-16T15:24:02.4996871Z nfs : Networker | Restart networker ------------------------------------ 10.45s
2026-07-16T15:24:02.4997298Z Executando o jboss-custom.cli ------------------------------------------- 2.35s
2026-07-16T15:24:02.4997660Z nfs : execute montagem script ------------------------------------------- 2.16s
2026-07-16T15:24:02.4998024Z nfs : Instalando o NFS Client ------------------------------------------- 1.72s
2026-07-16T15:24:02.4998377Z Gerando fatos de servicos ----------------------------------------------- 1.45s
2026-07-16T15:24:02.4998738Z Create a symbolic link -------------------------------------------------- 0.85s
2026-07-16T15:24:02.4999096Z nfs : Networker | Start networker --------------------------------------- 0.84s
2026-07-16T15:24:02.4999436Z Gathering Facts --------------------------------------------------------- 0.79s
2026-07-16T15:24:02.4999795Z maven_artifact ---------------------------------------------------------- 0.71s
2026-07-16T15:24:02.5000155Z Copiando artefatos para o(s) servidor(es) Jboss ------------------------- 0.68s
2026-07-16T15:24:02.5000509Z nfs : Install networker lgtoclnt_url ------------------------------------ 0.62s
2026-07-16T15:24:02.5000860Z nfs : Install networker lgtonmda_url ------------------------------------ 0.61s
2026-07-16T15:24:02.5001213Z Create a directory ------------------------------------------------------ 0.59s
2026-07-16T15:24:02.5001700Z Verifica se o arquivo  existe ------------------------------------------- 0.58s
2026-07-16T15:24:02.5002044Z Verifica se o arquivo  existe ------------------------------------------- 0.58s
2026-07-16T15:24:02.5002403Z Copiando artefato (jboss-custom.cli) para o(s) servidor(es) Jboss ------- 0.57s
2026-07-16T15:24:02.5002763Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.50s
2026-07-16T15:24:02.5003117Z Lendo artefatos do arquivo CSV ------------------------------------------ 0.49s
2026-07-16T15:24:02.5003478Z nfs : Remove pacote jbcs-httpd ------------------------------------------ 0.43s
2026-07-16T15:24:02.5003831Z nfs : Montando volume remoto -------------------------------------------- 0.42s
2026-07-16T15:24:02.5004083Z Playbook run took 0 days, 0 hours, 0 minutes, 32 seconds
2026-07-16T15:24:02.5620448Z ##[error]Bash exited with code '2'.
2026-07-16T15:24:02.5622994Z ##[section]Finishing: Deploy Config no JBOSS



-sh-4.2$
-sh-4.2$
-sh-4.2$ ps -ef | grep jboss
p585600  11831 19534  0 12:27 pts/0    00:00:00 grep --color=auto jboss
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ ps -ef | grep jboss
p585600  11845 19534  0 12:27 pts/0    00:00:00 grep --color=auto jboss
-sh-4.2$ systemctl status jboss
Unit jboss.service could not be found.
-sh-4.2$ systemctl status jboss
Unit jboss.service could not be found.
-sh-4.2$ ps -ef | grep jboss
p585600  11870 19534  0 12:27 pts/0    00:00:00 grep --color=auto jboss
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$

