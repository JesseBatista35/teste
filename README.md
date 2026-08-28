2026-08-28T14:25:29.5519269Z ##[section]Starting: Deploy Config no JBOSS
2026-08-28T14:25:29.5522137Z ==============================================================================
2026-08-28T14:25:29.5522211Z Task         : Bash
2026-08-28T14:25:29.5522255Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-28T14:25:29.5522325Z Version      : 3.227.0
2026-08-28T14:25:29.5522369Z Author       : Microsoft Corporation
2026-08-28T14:25:29.5522509Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-28T14:25:29.5522590Z ==============================================================================
2026-08-28T14:25:30.4237160Z Generating script.
2026-08-28T14:25:30.4253811Z ========================== Starting Command Output ===========================
2026-08-28T14:25:30.4263707Z [command]/bin/bash /opt/ads-agent/_work/_temp/173d42ad-81f4-4c33-ae01-abb9aa268413.sh
2026-08-28T14:25:30.4347454Z /opt/ads-agent/_work/_temp/173d42ad-81f4-4c33-ae01-abb9aa268413.sh: line 2: quantidade_vm: comando não encontrado
2026-08-28T14:25:30.4363040Z /opt/ads-agent/_work/_temp/173d42ad-81f4-4c33-ae01-abb9aa268413.sh: line 2: USE_WMQ: comando não encontrado
2026-08-28T14:25:32.5057945Z 
2026-08-28T14:25:32.5058508Z PLAY [local] *******************************************************************
2026-08-28T14:25:32.5344887Z 
2026-08-28T14:25:32.5345475Z PLAY [Configurando o DNS] ******************************************************
2026-08-28T14:25:32.7527819Z 
2026-08-28T14:25:32.7528308Z PLAY [local] *******************************************************************
2026-08-28T14:25:32.7559713Z 
2026-08-28T14:25:32.7560376Z PLAY [Verificando serviços] ****************************************************
2026-08-28T14:25:32.7640437Z 
2026-08-28T14:25:32.7640998Z PLAY [Configuração LDAP] *******************************************************
2026-08-28T14:25:32.7671187Z [WARNING]: Found variable using reserved name: when
2026-08-28T14:25:32.7679833Z 
2026-08-28T14:25:32.7680079Z PLAY [jboss] *******************************************************************
2026-08-28T14:25:32.7763338Z 
2026-08-28T14:25:32.7763646Z PLAY [Stack Jboss] *************************************************************
2026-08-28T14:25:32.8049736Z Friday 28 August 2026  11:25:32 -0300 (0:00:00.360)       0:00:00.360 ********* 
2026-08-28T14:25:33.3089253Z 
2026-08-28T14:25:33.3090379Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-08-28T14:25:33.3090600Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-28T14:25:33.3102134Z 
2026-08-28T14:25:33.3102809Z PLAY [jboss] *******************************************************************
2026-08-28T14:25:33.3172301Z Friday 28 August 2026  11:25:33 -0300 (0:00:00.512)       0:00:00.873 ********* 
2026-08-28T14:25:33.6566796Z 
2026-08-28T14:25:33.6567698Z TASK [Verifica se o arquivo nfs_config.json existe] ****************************
2026-08-28T14:25:33.6567902Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-28T14:25:33.6597321Z Friday 28 August 2026  11:25:33 -0300 (0:00:00.342)       0:00:01.215 ********* 
2026-08-28T14:25:33.7050028Z included: /opt/ads-agent/_work/r11944/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for caddeapllx2529.agil.nprd.caixa.gov.br
2026-08-28T14:25:33.7094428Z Friday 28 August 2026  11:25:33 -0300 (0:00:00.049)       0:00:01.265 ********* 
2026-08-28T14:25:33.7668748Z 
2026-08-28T14:25:33.7669591Z TASK [nfs : Criar variáveis] ***************************************************
2026-08-28T14:25:33.7669764Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-28T14:25:33.7707215Z Friday 28 August 2026  11:25:33 -0300 (0:00:00.061)       0:00:01.326 ********* 
2026-08-28T14:25:34.2043832Z 
2026-08-28T14:25:34.2044705Z TASK [nfs : Coletar variáveis de ambiente] *************************************
2026-08-28T14:25:34.2044887Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-28T14:25:34.2074207Z Friday 28 August 2026  11:25:34 -0300 (0:00:00.436)       0:00:01.763 ********* 
2026-08-28T14:25:34.2649148Z 
2026-08-28T14:25:34.2650295Z TASK [nfs : Exibir resultado em JSON] ******************************************
2026-08-28T14:25:34.2651923Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br] => {
2026-08-28T14:25:34.2652047Z     "nfs_vars_json": {
2026-08-28T14:25:34.2652378Z         "changed": false, 
2026-08-28T14:25:34.2652772Z         "cmd": "cat /opt/ads-agent/_work/r11944/a/nfs_config.json", 
2026-08-28T14:25:34.2653089Z         "delta": "0:00:00.003178", 
2026-08-28T14:25:34.2653307Z         "end": "2026-08-28 11:25:34.189501", 
2026-08-28T14:25:34.2653427Z         "failed": false, 
2026-08-28T14:25:34.2653522Z         "rc": 0, 
2026-08-28T14:25:34.2653686Z         "start": "2026-08-28 11:25:34.186323", 
2026-08-28T14:25:34.2654179Z         "stderr": "", 
2026-08-28T14:25:34.2654358Z         "stderr_lines": [], 
2026-08-28T14:25:34.2654582Z         "stdout": "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI\",\"NFS_MOUNT_POINT_ISILON\": \"/opt/sistemas\"}]", 
2026-08-28T14:25:34.2654750Z         "stdout_lines": [
2026-08-28T14:25:34.2654901Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI\",\"NFS_MOUNT_POINT_ISILON\": \"/opt/sistemas\"}]"
2026-08-28T14:25:34.2655054Z         ]
2026-08-28T14:25:34.2655216Z     }
2026-08-28T14:25:34.2655324Z }
2026-08-28T14:25:34.2683837Z Friday 28 August 2026  11:25:34 -0300 (0:00:00.061)       0:00:01.824 ********* 
2026-08-28T14:25:34.3278495Z 
2026-08-28T14:25:34.3279420Z TASK [nfs : Criar variáveis] ***************************************************
2026-08-28T14:25:34.3279807Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-28T14:25:34.3314922Z Friday 28 August 2026  11:25:34 -0300 (0:00:00.063)       0:00:01.887 ********* 
2026-08-28T14:25:36.8262061Z 
2026-08-28T14:25:36.8262855Z TASK [nfs : execute montagem script] *******************************************
2026-08-28T14:25:36.8263338Z changed: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-28T14:25:36.8290233Z Friday 28 August 2026  11:25:36 -0300 (0:00:02.497)       0:00:04.385 ********* 
2026-08-28T14:25:36.8884323Z 
2026-08-28T14:25:36.8884893Z TASK [nfs : ansible.builtin.debug] *********************************************
2026-08-28T14:25:36.8886914Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br] => {
2026-08-28T14:25:36.8888095Z     "changed": false, 
2026-08-28T14:25:36.8888394Z     "msg": {
2026-08-28T14:25:36.8888589Z         "changed": true, 
2026-08-28T14:25:36.8888767Z         "cmd": [
2026-08-28T14:25:36.8890060Z             "python", 
2026-08-28T14:25:36.8892821Z             "/opt/ads-agent/_work/r11944/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py", 
2026-08-28T14:25:36.8893272Z             "montagem", 
2026-08-28T14:25:36.8893750Z             "siopi-ws-tge-3", 
2026-08-28T14:25:36.8893922Z             "des", 
2026-08-28T14:25:36.8894071Z             "ctc_nprd", 
2026-08-28T14:25:36.8894354Z             "/opt/ads-agent/_work/r11944/a/esteira-jboss-vm-v2", 
2026-08-28T14:25:36.8894573Z             "C&t@d02", 
2026-08-28T14:25:36.8894742Z             "@ut0m@c@0!", 
2026-08-28T14:25:36.8895060Z             "s736651@corp.caixa.gov.br", 
2026-08-28T14:25:36.8895230Z             "8As4jL6Q", 
2026-08-28T14:25:36.8895486Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI\",\"NFS_MOUNT_POINT_ISILON\": \"/opt/sistemas\"}]"
2026-08-28T14:25:36.8895727Z         ], 
2026-08-28T14:25:36.8895920Z         "delta": "0:00:02.160271", 
2026-08-28T14:25:36.8896194Z         "end": "2026-08-28 11:25:36.809108", 
2026-08-28T14:25:36.8896371Z         "failed": false, 
2026-08-28T14:25:36.8896532Z         "rc": 0, 
2026-08-28T14:25:36.8896898Z         "start": "2026-08-28 11:25:34.648837", 
2026-08-28T14:25:36.8897087Z         "stderr": "", 
2026-08-28T14:25:36.8897248Z         "stderr_lines": [], 
2026-08-28T14:25:36.8898827Z         "stdout": "[{u'NFS_MOUNT_POINT_ISILON': u'/opt/sistemas', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI'}]\nNome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           \n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI /opt/sistemas                       ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfs_path=/opt/sistemas\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI /opt/sistemas                       ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-08-28T14:25:36.8900807Z         "stdout_lines": [
2026-08-28T14:25:36.8901294Z             "[{u'NFS_MOUNT_POINT_ISILON': u'/opt/sistemas', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI'}]", 
2026-08-28T14:25:36.8901622Z             "Nome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           ", 
2026-08-28T14:25:36.8902187Z             "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------", 
2026-08-28T14:25:36.8902607Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI /opt/sistemas                       ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-08-28T14:25:36.8902885Z             "nfs_path=/opt/sistemas", 
2026-08-28T14:25:36.8903133Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI", 
2026-08-28T14:25:36.8903466Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI /opt/sistemas                       ISILON                              nfsctcnprd.ctc.caixa                des                                "
2026-08-28T14:25:36.8903720Z         ]
2026-08-28T14:25:36.8903879Z     }
2026-08-28T14:25:36.8904022Z }
2026-08-28T14:25:36.8912610Z Friday 28 August 2026  11:25:36 -0300 (0:00:00.062)       0:00:04.447 ********* 
2026-08-28T14:25:37.1589533Z 
2026-08-28T14:25:37.1590712Z TASK [nfs : execute clean json] ************************************************
2026-08-28T14:25:37.1591580Z changed: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-28T14:25:37.1617656Z Friday 28 August 2026  11:25:37 -0300 (0:00:00.270)       0:00:04.717 ********* 
2026-08-28T14:25:37.2201175Z 
2026-08-28T14:25:37.2202094Z TASK [nfs : result_new_string_json] ********************************************
2026-08-28T14:25:37.2202794Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br] => {
2026-08-28T14:25:37.2203088Z     "msg": {
2026-08-28T14:25:37.2203811Z         "changed": true, 
2026-08-28T14:25:37.2204500Z         "cmd": "echo '[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI\",\"NFS_MOUNT_POINT_ISILON\": \"/opt/sistemas\"}]' | sed 's/NFS_ENDPOINT_ISILON[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_ISILON[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_HUAWEI[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_HUAWEI[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_VM[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_VM[^\"]*/NFS_MOUNT_POINT/g'", 
2026-08-28T14:25:37.2205134Z         "delta": "0:00:00.008456", 
2026-08-28T14:25:37.2205433Z         "end": "2026-08-28 11:25:37.144448", 
2026-08-28T14:25:37.2205624Z         "failed": false, 
2026-08-28T14:25:37.2205781Z         "rc": 0, 
2026-08-28T14:25:37.2206013Z         "start": "2026-08-28 11:25:37.135992", 
2026-08-28T14:25:37.2206176Z         "stderr": "", 
2026-08-28T14:25:37.2206803Z         "stderr_lines": [], 
2026-08-28T14:25:37.2207081Z         "stdout": "[{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI\",\"NFS_MOUNT_POINT\": \"/opt/sistemas\"}]", 
2026-08-28T14:25:37.2207362Z         "stdout_lines": [
2026-08-28T14:25:37.2207518Z             "[{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI\",\"NFS_MOUNT_POINT\": \"/opt/sistemas\"}]"
2026-08-28T14:25:37.2207745Z         ]
2026-08-28T14:25:37.2207828Z     }
2026-08-28T14:25:37.2207921Z }
2026-08-28T14:25:37.2228805Z Friday 28 August 2026  11:25:37 -0300 (0:00:00.061)       0:00:04.779 ********* 
2026-08-28T14:25:37.2808386Z 
2026-08-28T14:25:37.2810545Z TASK [nfs : Parse JSON data] ***************************************************
2026-08-28T14:25:37.2810996Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-28T14:25:37.2834603Z Friday 28 August 2026  11:25:37 -0300 (0:00:00.060)       0:00:04.839 ********* 
2026-08-28T14:25:37.3401168Z 
2026-08-28T14:25:37.3401864Z TASK [nfs : result_new_json] ***************************************************
2026-08-28T14:25:37.3402270Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br] => {
2026-08-28T14:25:37.3402918Z     "msg": [
2026-08-28T14:25:37.3403077Z         {
2026-08-28T14:25:37.3403205Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI", 
2026-08-28T14:25:37.3403377Z             "NFS_MOUNT_POINT": "/opt/sistemas"
2026-08-28T14:25:37.3403484Z         }
2026-08-28T14:25:37.3403584Z     ]
2026-08-28T14:25:37.3403673Z }
2026-08-28T14:25:37.3426104Z Friday 28 August 2026  11:25:37 -0300 (0:00:00.059)       0:00:04.898 ********* 
2026-08-28T14:25:37.4048477Z included: /opt/ads-agent/_work/r11944/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx2529.agil.nprd.caixa.gov.br
2026-08-28T14:25:37.4104109Z Friday 28 August 2026  11:25:37 -0300 (0:00:00.067)       0:00:04.966 ********* 
2026-08-28T14:25:37.4659155Z 
2026-08-28T14:25:37.4659902Z TASK [nfs : Parse JSON data] ***************************************************
2026-08-28T14:25:37.4660317Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-28T14:25:37.4684534Z Friday 28 August 2026  11:25:37 -0300 (0:00:00.058)       0:00:05.024 ********* 
2026-08-28T14:25:37.5243659Z 
2026-08-28T14:25:37.5244279Z TASK [nfs : debug] *************************************************************
2026-08-28T14:25:37.5244773Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br] => {
2026-08-28T14:25:37.5245295Z     "msg": {
2026-08-28T14:25:37.5245565Z         "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI", 
2026-08-28T14:25:37.5245716Z         "NFS_MOUNT_POINT": "/opt/sistemas"
2026-08-28T14:25:37.5245811Z     }
2026-08-28T14:25:37.5245913Z }
2026-08-28T14:25:37.5278489Z Friday 28 August 2026  11:25:37 -0300 (0:00:00.059)       0:00:05.084 ********* 
2026-08-28T14:25:37.5861383Z 
2026-08-28T14:25:37.5862502Z TASK [nfs : debug] *************************************************************
2026-08-28T14:25:37.5863061Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br] => {
2026-08-28T14:25:37.5863680Z     "msg": "/opt/sistemas"
2026-08-28T14:25:37.5863910Z }
2026-08-28T14:25:37.5895035Z Friday 28 August 2026  11:25:37 -0300 (0:00:00.061)       0:00:05.145 ********* 
2026-08-28T14:25:37.6443682Z 
2026-08-28T14:25:37.6444427Z TASK [nfs : debug] *************************************************************
2026-08-28T14:25:37.6445594Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br] => {
2026-08-28T14:25:37.6445910Z     "msg": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI"
2026-08-28T14:25:37.6446545Z }
2026-08-28T14:25:37.6477043Z Friday 28 August 2026  11:25:37 -0300 (0:00:00.058)       0:00:05.203 ********* 
2026-08-28T14:25:37.7039259Z 
2026-08-28T14:25:37.7039739Z TASK [nfs : Verificando as variaveis] ******************************************
2026-08-28T14:25:37.7039970Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br] => {
2026-08-28T14:25:37.7040101Z     "changed": false, 
2026-08-28T14:25:37.7040544Z     "msg": "All assertions passed"
2026-08-28T14:25:37.7040646Z }
2026-08-28T14:25:37.7068063Z Friday 28 August 2026  11:25:37 -0300 (0:00:00.059)       0:00:05.262 ********* 
2026-08-28T14:25:45.2485739Z 
2026-08-28T14:25:45.2486345Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-08-28T14:25:45.2486733Z changed: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-28T14:25:45.2517490Z Friday 28 August 2026  11:25:45 -0300 (0:00:07.544)       0:00:12.807 ********* 
2026-08-28T14:25:47.2552883Z 
2026-08-28T14:25:47.2553545Z TASK [nfs : Install networker lgtoclnt_url] ************************************
2026-08-28T14:25:47.2553729Z [WARNING]: Consider using the yum, dnf or zypper module rather than running
2026-08-28T14:25:47.2554079Z 'rpm'.  If you need to use command because yum, dnf or zypper is insufficient
2026-08-28T14:25:47.2554295Z you can add 'warn: false' to this command task or set 'command_warnings=False'
2026-08-28T14:25:47.2554448Z in ansible.cfg to get rid of this message.
2026-08-28T14:25:47.2554600Z changed: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-28T14:25:47.2581577Z Friday 28 August 2026  11:25:47 -0300 (0:00:02.006)       0:00:14.814 ********* 
2026-08-28T14:25:49.3090211Z 
2026-08-28T14:25:49.3090978Z TASK [nfs : Install networker lgtonmda_url] ************************************
2026-08-28T14:25:49.3092585Z changed: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-28T14:25:49.3141611Z Friday 28 August 2026  11:25:49 -0300 (0:00:02.055)       0:00:16.870 ********* 
2026-08-28T14:25:49.7282599Z 
2026-08-28T14:25:49.7283852Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-08-28T14:25:49.7284193Z changed: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-28T14:25:49.7314445Z Friday 28 August 2026  11:25:49 -0300 (0:00:00.417)       0:00:17.287 ********* 
2026-08-28T14:25:49.9948105Z 
2026-08-28T14:25:49.9948654Z TASK [nfs : Create a symbolic link] ********************************************
2026-08-28T14:25:49.9949087Z changed: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-28T14:25:49.9979328Z Friday 28 August 2026  11:25:49 -0300 (0:00:00.266)       0:00:17.553 ********* 
2026-08-28T14:25:51.0730427Z 
2026-08-28T14:25:51.0752712Z TASK [nfs : Networker | Start networker] ***************************************
2026-08-28T14:25:51.0753177Z changed: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-28T14:25:51.0786380Z Friday 28 August 2026  11:25:51 -0300 (0:00:01.078)       0:00:18.632 ********* 
2026-08-28T14:25:51.3589470Z 
2026-08-28T14:25:51.3590037Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-08-28T14:25:51.3590200Z changed: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-28T14:25:51.3616866Z Friday 28 August 2026  11:25:51 -0300 (0:00:00.285)       0:00:18.917 ********* 
2026-08-28T14:28:52.0120281Z 
2026-08-28T14:28:52.0121423Z TASK [nfs : Networker | Restart networker] *************************************
2026-08-28T14:28:52.0121819Z changed: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-28T14:28:52.0145904Z Friday 28 August 2026  11:28:52 -0300 (0:03:00.652)       0:03:19.570 ********* 
2026-08-28T14:33:10.2021010Z 
2026-08-28T14:33:10.2022002Z TASK [nfs : Montando volume remoto] ********************************************
2026-08-28T14:33:10.2022393Z fatal: [caddeapllx2529.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "msg": "Error mounting /opt/sistemas: mount.nfs: Connection timed out\n"}
2026-08-28T14:33:10.2022821Z ...ignoring
2026-08-28T14:33:10.2031590Z Friday 28 August 2026  11:33:10 -0300 (0:04:18.188)       0:07:37.759 ********* 
2026-08-28T14:33:10.2736324Z 
2026-08-28T14:33:10.2736899Z TASK [nfs : Validando Montagem] ************************************************
2026-08-28T14:33:10.2737106Z fatal: [caddeapllx2529.agil.nprd.caixa.gov.br]: FAILED! => {
2026-08-28T14:33:10.2741607Z     "assertion": "'Connection refused' in mountnfs.msg", 
2026-08-28T14:33:10.2741927Z     "changed": false, 
2026-08-28T14:33:10.2742114Z     "evaluated_to": false, 
2026-08-28T14:33:10.2742595Z     "msg": "Erro desconhecido: Error mounting /opt/sistemas: mount.nfs: Connection timed out\n"
2026-08-28T14:33:10.2742724Z }
2026-08-28T14:33:10.2749113Z 
2026-08-28T14:33:10.2749428Z PLAY RECAP *********************************************************************
2026-08-28T14:33:10.2749657Z caddeapllx2529.agil.nprd.caixa.gov.br : ok=28   changed=10   unreachable=0    failed=1    skipped=0    rescued=0    ignored=1   
2026-08-28T14:33:10.2749996Z 
2026-08-28T14:33:10.2750325Z Friday 28 August 2026  11:33:10 -0300 (0:00:00.070)       0:07:37.830 ********* 
2026-08-28T14:33:10.2750492Z =============================================================================== 
2026-08-28T14:33:10.2750720Z nfs : Montando volume remoto ------------------------------------------ 258.19s
2026-08-28T14:33:10.2750948Z nfs : Networker | Restart networker ----------------------------------- 180.65s
2026-08-28T14:33:10.2751170Z nfs : Instalando o NFS Client ------------------------------------------- 7.54s
2026-08-28T14:33:10.2751408Z nfs : execute montagem script ------------------------------------------- 2.50s
2026-08-28T14:33:10.2751626Z nfs : Install networker lgtonmda_url ------------------------------------ 2.06s
2026-08-28T14:33:10.2751834Z nfs : Install networker lgtoclnt_url ------------------------------------ 2.01s
2026-08-28T14:33:10.2752125Z nfs : Networker | Start networker --------------------------------------- 1.08s
2026-08-28T14:33:10.2752361Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.51s
2026-08-28T14:33:10.2752580Z nfs : Coletar variáveis de ambiente ------------------------------------- 0.44s
2026-08-28T14:33:10.2752797Z nfs : Remove pacote jbcs-httpd ------------------------------------------ 0.42s
2026-08-28T14:33:10.2753015Z Verifica se o arquivo nfs_config.json existe ---------------------------- 0.34s
2026-08-28T14:33:10.2753225Z nfs : Executar o comando abaixo para limitar as portas ------------------ 0.29s
2026-08-28T14:33:10.2753449Z nfs : execute clean json ------------------------------------------------ 0.27s
2026-08-28T14:33:10.2753661Z nfs : Create a symbolic link -------------------------------------------- 0.27s
2026-08-28T14:33:10.2753872Z nfs : Validando Montagem ------------------------------------------------ 0.07s
2026-08-28T14:33:10.2754082Z nfs : include_tasks ----------------------------------------------------- 0.07s
2026-08-28T14:33:10.2754294Z nfs : Criar variáveis --------------------------------------------------- 0.06s
2026-08-28T14:33:10.2754502Z nfs : ansible.builtin.debug --------------------------------------------- 0.06s
2026-08-28T14:33:10.2754710Z nfs : debug ------------------------------------------------------------- 0.06s
2026-08-28T14:33:10.2754920Z nfs : Criar variáveis --------------------------------------------------- 0.06s
2026-08-28T14:33:10.2755068Z Playbook run took 0 days, 0 hours, 7 minutes, 37 seconds
2026-08-28T14:33:10.3466826Z ##[error]Bash exited with code '2'.
2026-08-28T14:33:10.3470348Z ##[section]Finishing: Deploy Config no JBOSS




antes de mudar o ip pássava

2026-08-12T19:25:50.1072599Z ##[section]Starting: Deploy Config no JBOSS
2026-08-12T19:25:50.1075503Z ==============================================================================
2026-08-12T19:25:50.1075595Z Task         : Bash
2026-08-12T19:25:50.1075648Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-12T19:25:50.1075713Z Version      : 3.227.0
2026-08-12T19:25:50.1075767Z Author       : Microsoft Corporation
2026-08-12T19:25:50.1075822Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-12T19:25:50.1075906Z ==============================================================================
2026-08-12T19:25:51.0880836Z Generating script.
2026-08-12T19:25:51.0891868Z ========================== Starting Command Output ===========================
2026-08-12T19:25:51.0899112Z [command]/bin/bash /opt/ads-agent/_work/_temp/b5ad72f6-a576-4c87-815c-ff6d9172b32c.sh
2026-08-12T19:25:51.0975340Z /opt/ads-agent/_work/_temp/b5ad72f6-a576-4c87-815c-ff6d9172b32c.sh: line 2: quantidade_vm: comando não encontrado
2026-08-12T19:25:51.0987996Z /opt/ads-agent/_work/_temp/b5ad72f6-a576-4c87-815c-ff6d9172b32c.sh: line 2: USE_WMQ: comando não encontrado
2026-08-12T19:25:53.1199092Z 
2026-08-12T19:25:53.1199647Z PLAY [local] *******************************************************************
2026-08-12T19:25:53.1473551Z 
2026-08-12T19:25:53.1474143Z PLAY [Configurando o DNS] ******************************************************
2026-08-12T19:25:53.3343890Z 
2026-08-12T19:25:53.3344571Z PLAY [local] *******************************************************************
2026-08-12T19:25:53.3374010Z 
2026-08-12T19:25:53.3374969Z PLAY [Verificando serviços] ****************************************************
2026-08-12T19:25:53.3471292Z 
2026-08-12T19:25:53.3471958Z PLAY [Configuração LDAP] *******************************************************
2026-08-12T19:25:53.3498571Z [WARNING]: Found variable using reserved name: when
2026-08-12T19:25:53.3505566Z 
2026-08-12T19:25:53.3506259Z PLAY [jboss] *******************************************************************
2026-08-12T19:25:53.3585894Z 
2026-08-12T19:25:53.3819468Z PLAY [Stack Jboss] *************************************************************
2026-08-12T19:25:53.3819968Z Wednesday 12 August 2026  16:25:53 -0300 (0:00:00.322)       0:00:00.322 ****** 
2026-08-12T19:25:53.8640077Z 
2026-08-12T19:25:53.8641032Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-08-12T19:25:53.8641286Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:25:53.8654455Z 
2026-08-12T19:25:53.8655206Z PLAY [jboss] *******************************************************************
2026-08-12T19:25:53.8717503Z Wednesday 12 August 2026  16:25:53 -0300 (0:00:00.489)       0:00:00.812 ****** 
2026-08-12T19:25:54.1833239Z 
2026-08-12T19:25:54.1834005Z TASK [Verifica se o arquivo nfs_config.json existe] ****************************
2026-08-12T19:25:54.1834695Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:25:54.1863439Z Wednesday 12 August 2026  16:25:54 -0300 (0:00:00.314)       0:00:01.127 ****** 
2026-08-12T19:25:54.2318943Z included: /opt/ads-agent/_work/r17133/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for caddeapllx2529.agil.nprd.caixa.gov.br
2026-08-12T19:25:54.2361594Z Wednesday 12 August 2026  16:25:54 -0300 (0:00:00.049)       0:00:01.177 ****** 
2026-08-12T19:25:54.2929250Z 
2026-08-12T19:25:54.2930229Z TASK [nfs : Criar variáveis] ***************************************************
2026-08-12T19:25:54.2930961Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:25:54.2969567Z Wednesday 12 August 2026  16:25:54 -0300 (0:00:00.060)       0:00:01.238 ****** 
2026-08-12T19:25:54.7043896Z 
2026-08-12T19:25:54.7045213Z TASK [nfs : Coletar variáveis de ambiente] *************************************
2026-08-12T19:25:54.7045659Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:25:54.7070221Z Wednesday 12 August 2026  16:25:54 -0300 (0:00:00.410)       0:00:01.648 ****** 
2026-08-12T19:25:54.7613011Z 
2026-08-12T19:25:54.7613895Z TASK [nfs : Exibir resultado em JSON] ******************************************
2026-08-12T19:25:54.7614048Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br] => {
2026-08-12T19:25:54.7614238Z     "nfs_vars_json": {
2026-08-12T19:25:54.7614359Z         "changed": false, 
2026-08-12T19:25:54.7614701Z         "cmd": "cat /opt/ads-agent/_work/r17133/a/nfs_config.json", 
2026-08-12T19:25:54.7615237Z         "delta": "0:00:00.003119", 
2026-08-12T19:25:54.7615441Z         "end": "2026-08-12 16:25:54.689880", 
2026-08-12T19:25:54.7615567Z         "failed": false, 
2026-08-12T19:25:54.7615674Z         "rc": 0, 
2026-08-12T19:25:54.7615847Z         "start": "2026-08-12 16:25:54.686761", 
2026-08-12T19:25:54.7615974Z         "stderr": "", 
2026-08-12T19:25:54.7616080Z         "stderr_lines": [], 
2026-08-12T19:25:54.7616245Z         "stdout": "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI\",\"NFS_MOUNT_POINT_ISILON\": \"/opt/sistemas\"}]", 
2026-08-12T19:25:54.7616410Z         "stdout_lines": [
2026-08-12T19:25:54.7616578Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI\",\"NFS_MOUNT_POINT_ISILON\": \"/opt/sistemas\"}]"
2026-08-12T19:25:54.7616729Z         ]
2026-08-12T19:25:54.7616821Z     }
2026-08-12T19:25:54.7616909Z }
2026-08-12T19:25:54.7640398Z Wednesday 12 August 2026  16:25:54 -0300 (0:00:00.056)       0:00:01.705 ****** 
2026-08-12T19:25:54.8217932Z 
2026-08-12T19:25:54.8218794Z TASK [nfs : Criar variáveis] ***************************************************
2026-08-12T19:25:54.8218955Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:25:54.8265380Z Wednesday 12 August 2026  16:25:54 -0300 (0:00:00.062)       0:00:01.767 ****** 
2026-08-12T19:25:58.8446875Z 
2026-08-12T19:25:58.8447650Z TASK [nfs : execute montagem script] *******************************************
2026-08-12T19:25:58.8447966Z changed: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:25:58.8487550Z Wednesday 12 August 2026  16:25:58 -0300 (0:00:04.022)       0:00:05.789 ****** 
2026-08-12T19:25:58.9100576Z 
2026-08-12T19:25:58.9102405Z TASK [nfs : ansible.builtin.debug] *********************************************
2026-08-12T19:25:58.9102909Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br] => {
2026-08-12T19:25:58.9103525Z     "changed": false, 
2026-08-12T19:25:58.9103719Z     "msg": {
2026-08-12T19:25:58.9103874Z         "changed": true, 
2026-08-12T19:25:58.9103984Z         "cmd": [
2026-08-12T19:25:58.9104113Z             "python", 
2026-08-12T19:25:58.9104487Z             "/opt/ads-agent/_work/r17133/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py", 
2026-08-12T19:25:58.9105552Z             "montagem", 
2026-08-12T19:25:58.9106045Z             "siopi-ws-tge-3", 
2026-08-12T19:25:58.9107447Z             "des", 
2026-08-12T19:25:58.9107731Z             "ctc_nprd", 
2026-08-12T19:25:58.9108070Z             "/opt/ads-agent/_work/r17133/a/esteira-jboss-vm-v2", 
2026-08-12T19:25:58.9108196Z             "C&t@d02", 
2026-08-12T19:25:58.9108319Z             "@ut0m@c@0!", 
2026-08-12T19:25:58.9108444Z             "s736651@corp.caixa.gov.br", 
2026-08-12T19:25:58.9108548Z             "8As4jL6Q", 
2026-08-12T19:25:58.9108711Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI\",\"NFS_MOUNT_POINT_ISILON\": \"/opt/sistemas\"}]"
2026-08-12T19:25:58.9108868Z         ], 
2026-08-12T19:25:58.9108994Z         "delta": "0:00:03.686875", 
2026-08-12T19:25:58.9109451Z         "end": "2026-08-12 16:25:58.827972", 
2026-08-12T19:25:58.9109584Z         "failed": false, 
2026-08-12T19:25:58.9109680Z         "rc": 0, 
2026-08-12T19:25:58.9109840Z         "start": "2026-08-12 16:25:55.141097", 
2026-08-12T19:25:58.9109960Z         "stderr": "", 
2026-08-12T19:25:58.9110066Z         "stderr_lines": [], 
2026-08-12T19:25:58.9111109Z         "stdout": "[{u'NFS_MOUNT_POINT_ISILON': u'/opt/sistemas', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI'}]\nNome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           \n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI /opt/sistemas                       ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfs_path=/opt/sistemas\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI /opt/sistemas                       ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-08-12T19:25:58.9111660Z         "stdout_lines": [
2026-08-12T19:25:58.9111935Z             "[{u'NFS_MOUNT_POINT_ISILON': u'/opt/sistemas', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI'}]", 
2026-08-12T19:25:58.9112123Z             "Nome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           ", 
2026-08-12T19:25:58.9112475Z             "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------", 
2026-08-12T19:25:58.9112763Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI /opt/sistemas                       ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-08-12T19:25:58.9113006Z             "nfs_path=/opt/sistemas", 
2026-08-12T19:25:58.9113177Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI", 
2026-08-12T19:25:58.9113364Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI /opt/sistemas                       ISILON                              nfsctcnprd.ctc.caixa                des                                "
2026-08-12T19:25:58.9113510Z         ]
2026-08-12T19:25:58.9113622Z     }
2026-08-12T19:25:58.9113743Z }
2026-08-12T19:25:58.9127169Z Wednesday 12 August 2026  16:25:58 -0300 (0:00:00.064)       0:00:05.853 ****** 
2026-08-12T19:25:59.1682227Z 
2026-08-12T19:25:59.1682811Z TASK [nfs : execute clean json] ************************************************
2026-08-12T19:25:59.1683024Z changed: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:25:59.1711818Z Wednesday 12 August 2026  16:25:59 -0300 (0:00:00.258)       0:00:06.112 ****** 
2026-08-12T19:25:59.2287492Z 
2026-08-12T19:25:59.2288160Z TASK [nfs : result_new_string_json] ********************************************
2026-08-12T19:25:59.2289259Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br] => {
2026-08-12T19:25:59.2289633Z     "msg": {
2026-08-12T19:25:59.2289833Z         "changed": true, 
2026-08-12T19:25:59.2290504Z         "cmd": "echo '[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI\",\"NFS_MOUNT_POINT_ISILON\": \"/opt/sistemas\"}]' | sed 's/NFS_ENDPOINT_ISILON[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_ISILON[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_HUAWEI[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_HUAWEI[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_VM[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_VM[^\"]*/NFS_MOUNT_POINT/g'", 
2026-08-12T19:25:59.2291236Z         "delta": "0:00:00.009063", 
2026-08-12T19:25:59.2291463Z         "end": "2026-08-12 16:25:59.539982", 
2026-08-12T19:25:59.2291590Z         "failed": false, 
2026-08-12T19:25:59.2291700Z         "rc": 0, 
2026-08-12T19:25:59.2292966Z         "start": "2026-08-12 16:25:59.530919", 
2026-08-12T19:25:59.2293127Z         "stderr": "", 
2026-08-12T19:25:59.2293437Z         "stderr_lines": [], 
2026-08-12T19:25:59.2293596Z         "stdout": "[{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI\",\"NFS_MOUNT_POINT\": \"/opt/sistemas\"}]", 
2026-08-12T19:25:59.2293765Z         "stdout_lines": [
2026-08-12T19:25:59.2294524Z             "[{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI\",\"NFS_MOUNT_POINT\": \"/opt/sistemas\"}]"
2026-08-12T19:25:59.2294742Z         ]
2026-08-12T19:25:59.2294971Z     }
2026-08-12T19:25:59.2295066Z }
2026-08-12T19:25:59.2313710Z Wednesday 12 August 2026  16:25:59 -0300 (0:00:00.060)       0:00:06.172 ****** 
2026-08-12T19:25:59.2905609Z 
2026-08-12T19:25:59.2906600Z TASK [nfs : Parse JSON data] ***************************************************
2026-08-12T19:25:59.2907347Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:25:59.2931761Z Wednesday 12 August 2026  16:25:59 -0300 (0:00:00.061)       0:00:06.234 ****** 
2026-08-12T19:25:59.3499237Z 
2026-08-12T19:25:59.3499787Z TASK [nfs : result_new_json] ***************************************************
2026-08-12T19:25:59.3500010Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br] => {
2026-08-12T19:25:59.3500129Z     "msg": [
2026-08-12T19:25:59.3500231Z         {
2026-08-12T19:25:59.3501537Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI", 
2026-08-12T19:25:59.3502794Z             "NFS_MOUNT_POINT": "/opt/sistemas"
2026-08-12T19:25:59.3504193Z         }
2026-08-12T19:25:59.3505461Z     ]
2026-08-12T19:25:59.3505615Z }
2026-08-12T19:25:59.3529332Z Wednesday 12 August 2026  16:25:59 -0300 (0:00:00.059)       0:00:06.293 ****** 
2026-08-12T19:25:59.4146910Z included: /opt/ads-agent/_work/r17133/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx2529.agil.nprd.caixa.gov.br
2026-08-12T19:25:59.4199340Z Wednesday 12 August 2026  16:25:59 -0300 (0:00:00.067)       0:00:06.361 ****** 
2026-08-12T19:25:59.4753223Z 
2026-08-12T19:25:59.4754111Z TASK [nfs : Parse JSON data] ***************************************************
2026-08-12T19:25:59.4754432Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:25:59.4778161Z Wednesday 12 August 2026  16:25:59 -0300 (0:00:00.057)       0:00:06.418 ****** 
2026-08-12T19:25:59.5326329Z 
2026-08-12T19:25:59.5326872Z TASK [nfs : debug] *************************************************************
2026-08-12T19:25:59.5327052Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br] => {
2026-08-12T19:25:59.5327186Z     "msg": {
2026-08-12T19:25:59.5327337Z         "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI", 
2026-08-12T19:25:59.5327488Z         "NFS_MOUNT_POINT": "/opt/sistemas"
2026-08-12T19:25:59.5327600Z     }
2026-08-12T19:25:59.5327697Z }
2026-08-12T19:25:59.5351722Z Wednesday 12 August 2026  16:25:59 -0300 (0:00:00.057)       0:00:06.476 ****** 
2026-08-12T19:25:59.5888893Z 
2026-08-12T19:25:59.5889417Z TASK [nfs : debug] *************************************************************
2026-08-12T19:25:59.5889649Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br] => {
2026-08-12T19:25:59.5889783Z     "msg": "/opt/sistemas"
2026-08-12T19:25:59.5889894Z }
2026-08-12T19:25:59.5910238Z Wednesday 12 August 2026  16:25:59 -0300 (0:00:00.055)       0:00:06.532 ****** 
2026-08-12T19:25:59.6450439Z 
2026-08-12T19:25:59.6451555Z TASK [nfs : debug] *************************************************************
2026-08-12T19:25:59.6452213Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br] => {
2026-08-12T19:25:59.6452746Z     "msg": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI"
2026-08-12T19:25:59.6452880Z }
2026-08-12T19:25:59.6491077Z Wednesday 12 August 2026  16:25:59 -0300 (0:00:00.057)       0:00:06.589 ****** 
2026-08-12T19:25:59.7046652Z 
2026-08-12T19:25:59.7048461Z TASK [nfs : Verificando as variaveis] ******************************************
2026-08-12T19:25:59.7049715Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br] => {
2026-08-12T19:25:59.7050883Z     "changed": false, 
2026-08-12T19:25:59.7053999Z     "msg": "All assertions passed"
2026-08-12T19:25:59.7055299Z }
2026-08-12T19:25:59.7073577Z Wednesday 12 August 2026  16:25:59 -0300 (0:00:00.058)       0:00:06.648 ****** 
2026-08-12T19:26:01.3776421Z 
2026-08-12T19:26:01.3777207Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-08-12T19:26:01.3777777Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:26:01.3812919Z Wednesday 12 August 2026  16:26:01 -0300 (0:00:01.673)       0:00:08.322 ****** 
2026-08-12T19:26:02.1335663Z 
2026-08-12T19:26:02.1336217Z TASK [nfs : Install networker lgtoclnt_url] ************************************
2026-08-12T19:26:02.1337285Z [WARNING]: Consider using the yum, dnf or zypper module rather than running
2026-08-12T19:26:02.1337716Z 'rpm'.  If you need to use command because yum, dnf or zypper is insufficient
2026-08-12T19:26:02.1337954Z you can add 'warn: false' to this command task or set 'command_warnings=False'
2026-08-12T19:26:02.1338093Z in ansible.cfg to get rid of this message.
2026-08-12T19:26:02.1342483Z fatal: [caddeapllx2529.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.474185", "end": "2026-08-12 16:26:02.506780", "msg": "non-zero return code", "rc": 1, "start": "2026-08-12 16:26:02.032595", "stderr": "aviso: /var/tmp/rpm-tmp.Z4v7ki: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.Z4v7ki: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm", "Preparando...                         ########################################"]}
2026-08-12T19:26:02.1343276Z ...ignoring
2026-08-12T19:26:02.1374185Z Wednesday 12 August 2026  16:26:02 -0300 (0:00:00.755)       0:00:09.078 ****** 
2026-08-12T19:26:02.8825218Z 
2026-08-12T19:26:02.8825954Z TASK [nfs : Install networker lgtonmda_url] ************************************
2026-08-12T19:26:02.8832144Z fatal: [caddeapllx2529.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.422037", "end": "2026-08-12 16:26:03.254041", "msg": "non-zero return code", "rc": 1, "start": "2026-08-12 16:26:02.832004", "stderr": "aviso: /var/tmp/rpm-tmp.MDdyqi: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.MDdyqi: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm", "Preparando...                         ########################################"]}
2026-08-12T19:26:02.8832909Z ...ignoring
2026-08-12T19:26:02.8862607Z Wednesday 12 August 2026  16:26:02 -0300 (0:00:00.748)       0:00:09.827 ****** 
2026-08-12T19:26:03.3379021Z 
2026-08-12T19:26:03.3380268Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-08-12T19:26:03.3380758Z changed: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:26:03.3390205Z Wednesday 12 August 2026  16:26:03 -0300 (0:00:00.452)       0:00:10.280 ****** 
2026-08-12T19:26:03.6188802Z 
2026-08-12T19:26:03.6189559Z TASK [nfs : Create a symbolic link] ********************************************
2026-08-12T19:26:03.6190131Z changed: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:26:03.6217813Z Wednesday 12 August 2026  16:26:03 -0300 (0:00:00.282)       0:00:10.562 ****** 
2026-08-12T19:26:04.5147181Z 
2026-08-12T19:26:04.5148241Z TASK [nfs : Networker | Start networker] ***************************************
2026-08-12T19:26:04.5148547Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:26:04.5181331Z Wednesday 12 August 2026  16:26:04 -0300 (0:00:00.896)       0:00:11.459 ****** 
2026-08-12T19:26:04.8243699Z 
2026-08-12T19:26:04.8244686Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-08-12T19:26:04.8245233Z changed: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:26:04.8271767Z Wednesday 12 August 2026  16:26:04 -0300 (0:00:00.309)       0:00:11.768 ****** 
2026-08-12T19:26:15.3103970Z 
2026-08-12T19:26:15.3104689Z TASK [nfs : Networker | Restart networker] *************************************
2026-08-12T19:26:15.3104980Z changed: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:26:15.3127463Z Wednesday 12 August 2026  16:26:15 -0300 (0:00:10.485)       0:00:22.253 ****** 
2026-08-12T19:27:15.1528222Z 
2026-08-12T19:27:15.1529014Z TASK [nfs : Montando volume remoto] ********************************************
2026-08-12T19:27:15.1531159Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:27:15.1555389Z Wednesday 12 August 2026  16:27:15 -0300 (0:00:59.842)       0:01:22.096 ****** 
2026-08-12T19:27:15.2019391Z 
2026-08-12T19:27:15.2020275Z PLAY [jboss] *******************************************************************
2026-08-12T19:27:15.2070441Z 
2026-08-12T19:27:15.2071008Z PLAY [jboss] *******************************************************************
2026-08-12T19:27:15.2108933Z Wednesday 12 August 2026  16:27:15 -0300 (0:00:00.055)       0:01:22.151 ****** 
2026-08-12T19:27:16.0090002Z 
2026-08-12T19:27:16.0090736Z TASK [Gathering Facts] *********************************************************
2026-08-12T19:27:16.0091047Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:27:16.0282400Z Wednesday 12 August 2026  16:27:16 -0300 (0:00:00.817)       0:01:22.969 ****** 
2026-08-12T19:27:17.6674095Z 
2026-08-12T19:27:17.6675214Z TASK [Gerando fatos de servicos] ***********************************************
2026-08-12T19:27:17.6675723Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:27:17.6991832Z Wednesday 12 August 2026  16:27:17 -0300 (0:00:01.670)       0:01:24.640 ****** 
2026-08-12T19:27:17.7596602Z 
2026-08-12T19:27:17.7597242Z TASK [Gerando lista de units jboss] ********************************************
2026-08-12T19:27:17.7597525Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:27:17.7861452Z Wednesday 12 August 2026  16:27:17 -0300 (0:00:00.086)       0:01:24.726 ****** 
2026-08-12T19:27:17.8527258Z Wednesday 12 August 2026  16:27:17 -0300 (0:00:00.066)       0:01:24.793 ****** 
2026-08-12T19:27:17.8657753Z 
2026-08-12T19:27:17.8658662Z PLAY [Copiando deployments adicionais] *****************************************
2026-08-12T19:27:17.8958714Z Wednesday 12 August 2026  16:27:17 -0300 (0:00:00.043)       0:01:24.836 ****** 
2026-08-12T19:27:17.9512001Z 
2026-08-12T19:27:17.9512783Z TASK [Cria variável build_repository_name] *************************************
2026-08-12T19:27:17.9512958Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:27:17.9779882Z Wednesday 12 August 2026  16:27:17 -0300 (0:00:00.082)       0:01:24.918 ****** 
2026-08-12T19:27:18.0349120Z 
2026-08-12T19:27:18.0349730Z TASK [Buscando diretorio de config] ********************************************
2026-08-12T19:27:18.0350325Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:27:18.0629860Z Wednesday 12 August 2026  16:27:18 -0300 (0:00:00.084)       0:01:25.003 ****** 
2026-08-12T19:27:18.1171858Z 
2026-08-12T19:27:18.1172395Z TASK [Buscando diretorio de config] ********************************************
2026-08-12T19:27:18.1172565Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:27:18.1493850Z Wednesday 12 August 2026  16:27:18 -0300 (0:00:00.086)       0:01:25.090 ****** 
2026-08-12T19:27:18.6475055Z 
2026-08-12T19:27:18.6477474Z TASK [Create a symbolic link] **************************************************
2026-08-12T19:27:18.6478256Z changed: [caddeapllx2529.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r17133/a/_SIOPI-ws-config)
2026-08-12T19:27:18.9286559Z changed: [caddeapllx2529.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r17133/a/_SIOPI-ws-config/jboss)
2026-08-12T19:27:18.9571415Z Wednesday 12 August 2026  16:27:18 -0300 (0:00:00.807)       0:01:25.897 ****** 
2026-08-12T19:27:19.2956990Z 
2026-08-12T19:27:19.2957868Z TASK [Verifica se o arquivo  existe] *******************************************
2026-08-12T19:27:19.2958461Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r17133/a/_SIOPI-ws-config)
2026-08-12T19:27:19.5816313Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r17133/a/_SIOPI-ws-config/jboss)
2026-08-12T19:27:19.6170741Z Wednesday 12 August 2026  16:27:19 -0300 (0:00:00.659)       0:01:26.557 ****** 
2026-08-12T19:27:19.7068263Z included: /opt/ads-agent/_work/r17133/a/esteira-jboss-vm-v2/roles/jboss/tasks/stack_deployments_custom_block.yml for caddeapllx2529.agil.nprd.caixa.gov.br
2026-08-12T19:27:19.7370601Z Wednesday 12 August 2026  16:27:19 -0300 (0:00:00.119)       0:01:26.677 ****** 
2026-08-12T19:27:20.2586923Z 
2026-08-12T19:27:20.2587497Z TASK [Lendo artefatos do arquivo CSV] ******************************************
2026-08-12T19:27:20.2587692Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:27:20.2886187Z Wednesday 12 August 2026  16:27:20 -0300 (0:00:00.551)       0:01:27.229 ****** 
2026-08-12T19:27:20.2998180Z [WARNING]: The loop variable 'item' is already in use. You should set the
2026-08-12T19:27:20.2998711Z `loop_var` value in the `loop_control` option for the task to something else to
2026-08-12T19:27:20.2999357Z avoid variable collisions and unexpected behavior.
2026-08-12T19:27:20.3397807Z 
2026-08-12T19:27:20.3398820Z TASK [Mostra artefatos] ********************************************************
2026-08-12T19:27:20.3399949Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br] => (item={u'version': u'9.3.3.0', u'group_id': u'br.gov.caixa.wmq.jmsra', u'extension': u'rar', u'artifact_id': u'wmq.jmsra'}) => {
2026-08-12T19:27:20.3400333Z     "msg": "Artefato: wmq.jmsra - versao 9.3.3.0"
2026-08-12T19:27:20.3400503Z }
2026-08-12T19:27:20.3711638Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br] => (item={u'version': u'1.1.1', u'group_id': u'br.gov.caixa', u'extension': u'jar', u'artifact_id': u'framework'}) => {
2026-08-12T19:27:20.3711987Z     "msg": "Artefato: framework - versao 1.1.1"
2026-08-12T19:27:20.3712102Z }
2026-08-12T19:27:20.4053966Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br] => (item={u'version': u'3.3.1', u'group_id': u'com.microsoft.azure', u'extension': u'jar', u'artifact_id': u'applicationinsights-agent'}) => {
2026-08-12T19:27:20.4054357Z     "msg": "Artefato: applicationinsights-agent - versao 3.3.1"
2026-08-12T19:27:20.4054499Z }
2026-08-12T19:27:20.4426687Z Wednesday 12 August 2026  16:27:20 -0300 (0:00:00.154)       0:01:27.383 ****** 
2026-08-12T19:27:21.1409462Z 
2026-08-12T19:27:21.1410415Z TASK [maven_artifact] **********************************************************
2026-08-12T19:27:21.1411090Z changed: [caddeapllx2529.agil.nprd.caixa.gov.br] => (item={u'version': u'9.3.3.0', u'group_id': u'br.gov.caixa.wmq.jmsra', u'extension': u'rar', u'artifact_id': u'wmq.jmsra'})
2026-08-12T19:27:21.4941247Z changed: [caddeapllx2529.agil.nprd.caixa.gov.br] => (item={u'version': u'1.1.1', u'group_id': u'br.gov.caixa', u'extension': u'jar', u'artifact_id': u'framework'})
2026-08-12T19:27:22.0338538Z changed: [caddeapllx2529.agil.nprd.caixa.gov.br] => (item={u'version': u'3.3.1', u'group_id': u'com.microsoft.azure', u'extension': u'jar', u'artifact_id': u'applicationinsights-agent'})
2026-08-12T19:27:22.0665432Z Wednesday 12 August 2026  16:27:22 -0300 (0:00:01.623)       0:01:29.007 ****** 
2026-08-12T19:27:23.6423825Z 
2026-08-12T19:27:23.6425060Z TASK [Copiando artefatos para o(s) servidor(es) Jboss] *************************
2026-08-12T19:27:23.6426244Z changed: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:27:23.6722678Z Wednesday 12 August 2026  16:27:23 -0300 (0:00:01.605)       0:01:30.613 ****** 
2026-08-12T19:27:23.7140782Z 
2026-08-12T19:27:23.7141316Z PLAY [Copiando modules adicionais] *********************************************
2026-08-12T19:27:23.7436175Z Wednesday 12 August 2026  16:27:23 -0300 (0:00:00.071)       0:01:30.684 ****** 
2026-08-12T19:27:23.7990162Z 
2026-08-12T19:27:23.7991141Z TASK [Cria variável build_repository_name] *************************************
2026-08-12T19:27:23.7991834Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:27:23.8255695Z Wednesday 12 August 2026  16:27:23 -0300 (0:00:00.081)       0:01:30.766 ****** 
2026-08-12T19:27:23.8818309Z 
2026-08-12T19:27:23.8818860Z TASK [Buscando diretorio de config] ********************************************
2026-08-12T19:27:23.8819040Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:27:23.9154454Z Wednesday 12 August 2026  16:27:23 -0300 (0:00:00.089)       0:01:30.856 ****** 
2026-08-12T19:27:23.9667751Z 
2026-08-12T19:27:23.9669479Z TASK [Buscando diretorio de config] ********************************************
2026-08-12T19:27:23.9670682Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:27:23.9973093Z Wednesday 12 August 2026  16:27:23 -0300 (0:00:00.081)       0:01:30.938 ****** 
2026-08-12T19:27:24.3308468Z 
2026-08-12T19:27:24.3309196Z TASK [Create a directory] ******************************************************
2026-08-12T19:27:24.3309760Z changed: [caddeapllx2529.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r17133/a/_SIOPI-ws-config)
2026-08-12T19:27:24.6056339Z changed: [caddeapllx2529.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r17133/a/_SIOPI-ws-config/jboss)
2026-08-12T19:27:24.6370192Z Wednesday 12 August 2026  16:27:24 -0300 (0:00:00.639)       0:01:31.577 ****** 
2026-08-12T19:27:24.9565796Z 
2026-08-12T19:27:24.9566561Z TASK [Verifica se o arquivo  existe] *******************************************
2026-08-12T19:27:24.9567558Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r17133/a/_SIOPI-ws-config)
2026-08-12T19:27:25.2353672Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r17133/a/_SIOPI-ws-config/jboss)
2026-08-12T19:27:25.2653575Z Wednesday 12 August 2026  16:27:25 -0300 (0:00:00.628)       0:01:32.206 ****** 
2026-08-12T19:27:25.3632764Z included: /opt/ads-agent/_work/r17133/a/esteira-jboss-vm-v2/roles/jboss/tasks/stack_modules_custom_block.yml for caddeapllx2529.agil.nprd.caixa.gov.br
2026-08-12T19:27:25.3942370Z Wednesday 12 August 2026  16:27:25 -0300 (0:00:00.128)       0:01:32.335 ****** 
2026-08-12T19:27:25.7265803Z 
2026-08-12T19:27:25.7266346Z TASK [Lendo artefatos do arquivo CSV] ******************************************
2026-08-12T19:27:25.7266518Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:27:25.7570537Z Wednesday 12 August 2026  16:27:25 -0300 (0:00:00.362)       0:01:32.697 ****** 
2026-08-12T19:27:25.7676263Z [WARNING]: The loop variable 'item' is already in use. You should set the
2026-08-12T19:27:25.7676502Z `loop_var` value in the `loop_control` option for the task to something else to
2026-08-12T19:27:25.7676655Z avoid variable collisions and unexpected behavior.
2026-08-12T19:27:25.8067940Z 
2026-08-12T19:27:25.8068475Z TASK [Mostra lista de artefatos] ***********************************************
2026-08-12T19:27:25.8069279Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br] => (item={u'version': u'4', u'group_id': u'com.sybase', u'extension': u'jar', u'artifact_id': u'jconn4'}) => {
2026-08-12T19:27:25.8070182Z     "msg": "Artefato: jconn4 - versao 4"
2026-08-12T19:27:25.8070516Z }
2026-08-12T19:27:25.8369782Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br] => (item={u'version': u'4.0', u'group_id': u'com.microsoft.sqlserver', u'extension': u'jar', u'artifact_id': u'sqljdbc4'}) => {
2026-08-12T19:27:25.8370614Z     "msg": "Artefato: sqljdbc4 - versao 4.0"
2026-08-12T19:27:25.8371553Z }
2026-08-12T19:27:25.8682342Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br] => (item={u'version': u'11.5.8.0', u'group_id': u'com.ibm.db2', u'extension': u'jar', u'artifact_id': u'jcc'}) => {
2026-08-12T19:27:25.8682644Z     "msg": "Artefato: jcc - versao 11.5.8.0"
2026-08-12T19:27:25.8682756Z }
2026-08-12T19:27:25.8958961Z Wednesday 12 August 2026  16:27:25 -0300 (0:00:00.138)       0:01:32.836 ****** 
2026-08-12T19:27:26.3338608Z 
2026-08-12T19:27:26.3339849Z TASK [Listar arquivos no diretório baixados anteriormente] *********************
2026-08-12T19:27:26.3340179Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:27:26.3784057Z Wednesday 12 August 2026  16:27:26 -0300 (0:00:00.482)       0:01:33.319 ****** 
2026-08-12T19:27:26.4189139Z [WARNING]: conditional statements should not include jinja2 templating
2026-08-12T19:27:26.4192302Z delimiters such as {{ }} or {% %}. Found: '{{ inner_item.artifact_id }}-{{
2026-08-12T19:27:26.4192701Z inner_item.version }}.{{ inner_item.extension|default('jar',true) }}' not in
2026-08-12T19:27:26.4193003Z files_found.files | map(attribute='path') | map('basename') | list
2026-08-12T19:27:26.5339696Z Wednesday 12 August 2026  16:27:26 -0300 (0:00:00.155)       0:01:33.474 ****** 
2026-08-12T19:27:26.8605299Z 
2026-08-12T19:27:26.8606250Z TASK [Verifica se o arquivo jboss-modules-custom tem conteudo] *****************
2026-08-12T19:27:26.8606744Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:27:26.8891087Z Wednesday 12 August 2026  16:27:26 -0300 (0:00:00.355)       0:01:33.829 ****** 
2026-08-12T19:27:27.0742193Z 
2026-08-12T19:27:27.0742869Z TASK [Copiando artefatos (Modules) para o(s) servidor(es) Jboss] ***************
2026-08-12T19:27:27.0743142Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:27:27.1016717Z Wednesday 12 August 2026  16:27:27 -0300 (0:00:00.212)       0:01:34.042 ****** 
2026-08-12T19:27:27.6713218Z 
2026-08-12T19:27:27.6714069Z TASK [Copiando artefato (jboss-custom.cli) para o(s) servidor(es) Jboss] *******
2026-08-12T19:27:27.6714416Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:27:27.6988622Z Wednesday 12 August 2026  16:27:27 -0300 (0:00:00.597)       0:01:34.639 ****** 
2026-08-12T19:27:27.7707905Z Wednesday 12 August 2026  16:27:27 -0300 (0:00:00.071)       0:01:34.711 ****** 
2026-08-12T19:27:27.8426992Z Wednesday 12 August 2026  16:27:27 -0300 (0:00:00.071)       0:01:34.783 ****** 
2026-08-12T19:27:27.9119574Z Wednesday 12 August 2026  16:27:27 -0300 (0:00:00.069)       0:01:34.852 ****** 
2026-08-12T19:27:27.9813501Z Wednesday 12 August 2026  16:27:27 -0300 (0:00:00.069)       0:01:34.922 ****** 
2026-08-12T19:27:28.0525820Z Wednesday 12 August 2026  16:27:28 -0300 (0:00:00.071)       0:01:34.993 ****** 
2026-08-12T19:27:28.0967835Z 
2026-08-12T19:27:28.0968578Z PLAY [jboss] *******************************************************************
2026-08-12T19:27:28.1252314Z Wednesday 12 August 2026  16:27:28 -0300 (0:00:00.072)       0:01:35.066 ****** 
2026-08-12T19:27:28.1988475Z 
2026-08-12T19:27:28.1989235Z TASK [Setando a versão do Jboss] ***********************************************
2026-08-12T19:27:28.1989397Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:27:28.2405544Z Wednesday 12 August 2026  16:27:28 -0300 (0:00:00.115)       0:01:35.181 ****** 
2026-08-12T19:27:28.3002063Z 
2026-08-12T19:27:28.3003237Z TASK [Cria variável build_repository_name_tfs] *********************************
2026-08-12T19:27:28.3003815Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:27:28.3271762Z Wednesday 12 August 2026  16:27:28 -0300 (0:00:00.086)       0:01:35.268 ****** 
2026-08-12T19:27:28.3835934Z 
2026-08-12T19:27:28.3836473Z TASK [Buscando diretorio de config] ********************************************
2026-08-12T19:27:28.3836632Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:27:28.4118649Z Wednesday 12 August 2026  16:27:28 -0300 (0:00:00.084)       0:01:35.352 ****** 
2026-08-12T19:27:28.9848676Z 
2026-08-12T19:27:28.9849477Z TASK [Copy common_start.sh] ****************************************************
2026-08-12T19:27:28.9851000Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:27:29.0139290Z Wednesday 12 August 2026  16:27:29 -0300 (0:00:00.602)       0:01:35.954 ****** 
2026-08-12T19:27:29.6200439Z 
2026-08-12T19:27:29.6201042Z TASK [Copy template script] ****************************************************
2026-08-12T19:27:29.6202361Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:27:29.6578735Z Wednesday 12 August 2026  16:27:29 -0300 (0:00:00.643)       0:01:36.598 ****** 
2026-08-12T19:27:30.2523586Z 
2026-08-12T19:27:30.2524139Z TASK [JBoss systemd wrapper for sysvinit script mode domain] *******************
2026-08-12T19:27:30.2524301Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:27:30.2807766Z Wednesday 12 August 2026  16:27:30 -0300 (0:00:00.622)       0:01:37.221 ****** 
2026-08-12T19:27:31.0488849Z 
2026-08-12T19:27:31.0489638Z TASK [Realiza copia do arquivo de Trust Store] *********************************
2026-08-12T19:27:31.0490311Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:27:31.0763449Z Wednesday 12 August 2026  16:27:31 -0300 (0:00:00.795)       0:01:38.017 ****** 
2026-08-12T19:27:31.1470568Z Wednesday 12 August 2026  16:27:31 -0300 (0:00:00.070)       0:01:38.087 ****** 
2026-08-12T19:27:31.2336189Z Wednesday 12 August 2026  16:27:31 -0300 (0:00:00.086)       0:01:38.174 ****** 
2026-08-12T19:27:31.5638813Z 
2026-08-12T19:27:31.5639294Z TASK [Check directory configuration exists] ************************************
2026-08-12T19:27:31.5639766Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r17133/a/_SIOPI-ws-config)
2026-08-12T19:27:31.8419127Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r17133/a/_SIOPI-ws-config/jboss)
2026-08-12T19:27:31.8732089Z Wednesday 12 August 2026  16:27:31 -0300 (0:00:00.639)       0:01:38.813 ****** 
2026-08-12T19:27:38.4139074Z 
2026-08-12T19:27:38.4139682Z TASK [Copiando arquivos para jboss.server.config.dir] **************************
2026-08-12T19:27:38.4141248Z changed: [caddeapllx2529.agil.nprd.caixa.gov.br] => (item={u'item': u'/opt/ads-agent/_work/r17133/a/_SIOPI-ws-config', u'stat': {u'charset': u'binary', u'uid': 1000, u'exists': True, u'attr_flags': u'', u'woth': False, u'device_type': 0, u'mtime': 1786562697.3065906, u'block_size': 4096, u'inode': 4194407, u'isgid': False, u'size': 234, u'wgrp': False, u'executable': True, u'isuid': False, u'readable': True, u'isreg': False, u'version': u'1399511014', u'pw_name': u'sadscp01', u'gid': 1000, u'ischr': False, u'wusr': True, u'writeable': True, u'mimetype': u'inode/directory', u'blocks': 0, u'xoth': True, u'islnk': False, u'nlink': 5, u'issock': False, u'rgrp': True, u'gr_name': u'sadscp01', u'path': u'/opt/ads-agent/_work/r17133/a/_SIOPI-ws-config/configuration', u'xusr': True, u'atime': 1786562698.0515807, u'isdir': True, u'ctime': 1786562697.3065906, u'isblk': False, u'xgrp': True, u'dev': 64771, u'roth': True, u'isfifo': False, u'mode': u'0755', u'rusr': True, u'attributes': []}, u'ansible_loop_var': u'item', u'failed': False, u'invocation': {u'module_args': {u'follow': False, u'get_checksum': True, u'path': u'/opt/ads-agent/_work/r17133/a/_SIOPI-ws-config/configuration', u'checksum_algorithm': u'sha1', u'get_md5': False, u'get_mime': True, u'get_attributes': True}}, u'changed': False})
2026-08-12T19:27:38.4517239Z Wednesday 12 August 2026  16:27:38 -0300 (0:00:06.578)       0:01:45.392 ****** 
2026-08-12T19:27:38.7711333Z 
2026-08-12T19:27:38.7712277Z TASK [Get standalone-full-ha.xml status] ***************************************
2026-08-12T19:27:38.7713313Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r17133/a/_SIOPI-ws-config)
2026-08-12T19:27:39.0496343Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r17133/a/_SIOPI-ws-config/jboss)
2026-08-12T19:27:39.0807556Z Wednesday 12 August 2026  16:27:39 -0300 (0:00:00.629)       0:01:46.021 ****** 
2026-08-12T19:27:39.6583429Z 
2026-08-12T19:27:39.6584505Z TASK [Copiando arquivo standalone-full-ha.xml] *********************************
2026-08-12T19:27:39.6586418Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br] => (item={u'item': u'/opt/ads-agent/_work/r17133/a/_SIOPI-ws-config', u'stat': {u'charset': u'us-ascii', u'uid': 1000, u'exists': True, u'attr_flags': u'', u'woth': False, u'device_type': 0, u'mtime': 1786562698.0715804, u'block_size': 4096, u'inode': 683687256, u'isgid': False, u'size': 110383, u'wgrp': False, u'executable': False, u'isuid': False, u'readable': True, u'isreg': True, u'version': u'171196550', u'pw_name': u'sadscp01', u'gid': 1000, u'ischr': False, u'wusr': True, u'writeable': True, u'mimetype': u'application/xml', u'blocks': 216, u'xoth': False, u'islnk': False, u'nlink': 1, u'issock': False, u'rgrp': True, u'gr_name': u'sadscp01', u'path': u'/opt/ads-agent/_work/r17133/a/_SIOPI-ws-config/standalone-full-ha.xml', u'xusr': False, u'atime': 1786562698.0725803, u'isdir': False, u'ctime': 1786562698.0715804, u'isblk': False, u'checksum': u'21bca60d2b058135321e70dce09eda789e488b77', u'dev': 64771, u'roth': True, u'isfifo': False, u'mode': u'0644', u'xgrp': False, u'rusr': True, u'attributes': []}, u'ansible_loop_var': u'item', u'failed': False, u'invocation': {u'module_args': {u'follow': False, u'get_checksum': True, u'path': u'/opt/ads-agent/_work/r17133/a/_SIOPI-ws-config/standalone-full-ha.xml', u'checksum_algorithm': u'sha1', u'get_md5': False, u'get_mime': True, u'get_attributes': True}}, u'changed': False})
2026-08-12T19:27:39.6990932Z Wednesday 12 August 2026  16:27:39 -0300 (0:00:00.618)       0:01:46.639 ****** 
2026-08-12T19:27:40.0112420Z 
2026-08-12T19:27:40.0113338Z TASK [Get standalone-ha.xml status] ********************************************
2026-08-12T19:27:40.0113771Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r17133/a/_SIOPI-ws-config)
2026-08-12T19:27:40.2746668Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r17133/a/_SIOPI-ws-config/jboss)
2026-08-12T19:27:40.2970605Z Wednesday 12 August 2026  16:27:40 -0300 (0:00:00.597)       0:01:47.237 ****** 
2026-08-12T19:27:40.3766890Z Wednesday 12 August 2026  16:27:40 -0300 (0:00:00.079)       0:01:47.317 ****** 
2026-08-12T19:27:40.7008208Z 
2026-08-12T19:27:40.7008803Z TASK [Get standalone.xml status] ***********************************************
2026-08-12T19:27:40.7009441Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r17133/a/_SIOPI-ws-config)
2026-08-12T19:27:40.9535902Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r17133/a/_SIOPI-ws-config/jboss)
2026-08-12T19:27:40.9811904Z Wednesday 12 August 2026  16:27:40 -0300 (0:00:00.604)       0:01:47.922 ****** 
2026-08-12T19:27:41.0609292Z Wednesday 12 August 2026  16:27:41 -0300 (0:00:00.079)       0:01:48.001 ****** 
2026-08-12T19:27:41.3930355Z 
2026-08-12T19:27:41.3931094Z TASK [Get standalone.conf status] **********************************************
2026-08-12T19:27:41.3931705Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r17133/a/_SIOPI-ws-config)
2026-08-12T19:27:41.6476699Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r17133/a/_SIOPI-ws-config/jboss)
2026-08-12T19:27:41.6736994Z Wednesday 12 August 2026  16:27:41 -0300 (0:00:00.612)       0:01:48.614 ****** 
2026-08-12T19:27:42.2503588Z 
2026-08-12T19:27:42.2504376Z TASK [Copiando arquivo standalone.conf] ****************************************
2026-08-12T19:27:42.2506792Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br] => (item={u'item': u'/opt/ads-agent/_work/r17133/a/_SIOPI-ws-config', u'stat': {u'charset': u'utf-8', u'uid': 1000, u'exists': True, u'attr_flags': u'', u'woth': False, u'device_type': 0, u'mtime': 1786562698.1375794, u'block_size': 4096, u'inode': 683687263, u'isgid': False, u'size': 4762, u'wgrp': False, u'executable': False, u'isuid': False, u'readable': True, u'isreg': True, u'version': u'1259689053', u'pw_name': u'sadscp01', u'gid': 1000, u'ischr': False, u'wusr': True, u'writeable': True, u'mimetype': u'text/plain', u'blocks': 16, u'xoth': False, u'islnk': False, u'nlink': 1, u'issock': False, u'rgrp': True, u'gr_name': u'sadscp01', u'path': u'/opt/ads-agent/_work/r17133/a/_SIOPI-ws-config/standalone.conf', u'xusr': False, u'atime': 1786562698.1385794, u'isdir': False, u'ctime': 1786562698.1375794, u'isblk': False, u'checksum': u'7fa606e163edcdaa6fbf0c5951b6dca9811267e2', u'dev': 64771, u'roth': True, u'isfifo': False, u'mode': u'0644', u'xgrp': False, u'rusr': True, u'attributes': []}, u'ansible_loop_var': u'item', u'failed': False, u'invocation': {u'module_args': {u'follow': False, u'get_checksum': True, u'path': u'/opt/ads-agent/_work/r17133/a/_SIOPI-ws-config/standalone.conf', u'checksum_algorithm': u'sha1', u'get_md5': False, u'get_mime': True, u'get_attributes': True}}, u'changed': False})
2026-08-12T19:27:42.2845267Z Wednesday 12 August 2026  16:27:42 -0300 (0:00:00.610)       0:01:49.225 ****** 
2026-08-12T19:27:42.6042245Z 
2026-08-12T19:27:42.6042832Z TASK [Restart Zabbix] **********************************************************
2026-08-12T19:27:42.6043279Z fatal: [caddeapllx2529.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "msg": "Could not find the requested service zabbix-agent: host"}
2026-08-12T19:27:42.6043436Z ...ignoring
2026-08-12T19:27:42.6332736Z Wednesday 12 August 2026  16:27:42 -0300 (0:00:00.348)       0:01:49.574 ****** 
2026-08-12T19:27:42.7017499Z Wednesday 12 August 2026  16:27:42 -0300 (0:00:00.068)       0:01:49.642 ****** 
2026-08-12T19:27:42.7388238Z [WARNING]: conditional statements should not include jinja2 templating
2026-08-12T19:27:42.7388727Z delimiters such as {{ }} or {% %}. Found: {{ lookup('env','HSM') |
2026-08-12T19:27:42.7388902Z default('false', true) | bool }}
2026-08-12T19:27:42.7509777Z Wednesday 12 August 2026  16:27:42 -0300 (0:00:00.049)       0:01:49.691 ****** 
2026-08-12T19:27:51.1965439Z 
2026-08-12T19:27:51.1965982Z RUNNING HANDLER [Restart Jboss] ************************************************
2026-08-12T19:27:51.1966164Z changed: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:27:51.1991869Z 
2026-08-12T19:27:51.1992268Z PLAY [jboss] *******************************************************************
2026-08-12T19:27:51.2020313Z 
2026-08-12T19:27:51.2020858Z PLAY [jboss] *******************************************************************
2026-08-12T19:27:51.2057324Z 
2026-08-12T19:27:51.2057662Z PLAY [jboss] *******************************************************************
2026-08-12T19:27:51.2341019Z Wednesday 12 August 2026  16:27:51 -0300 (0:00:08.482)       0:01:58.174 ****** 
2026-08-12T19:27:51.2898244Z 
2026-08-12T19:27:51.2899304Z TASK [Cria variável build_repository_name] *************************************
2026-08-12T19:27:51.2899571Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:27:51.3155582Z Wednesday 12 August 2026  16:27:51 -0300 (0:00:00.081)       0:01:58.256 ****** 
2026-08-12T19:27:51.3710603Z 
2026-08-12T19:27:51.3711415Z TASK [Buscando diretorio de config] ********************************************
2026-08-12T19:27:51.3711907Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:27:51.4013427Z Wednesday 12 August 2026  16:27:51 -0300 (0:00:00.085)       0:01:58.342 ****** 
2026-08-12T19:27:51.7240036Z 
2026-08-12T19:27:51.7241123Z TASK [Verifica se o arquivo {{ item }}/etc/hosts-{{ sistema_ambiente }} existe] ***
2026-08-12T19:27:51.7241485Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r17133/a/_SIOPI-ws-config)
2026-08-12T19:27:51.9986342Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r17133/a/_SIOPI-ws-config/so)
2026-08-12T19:27:52.0282531Z Wednesday 12 August 2026  16:27:52 -0300 (0:00:00.626)       0:01:58.969 ****** 
2026-08-12T19:27:52.0889560Z 
2026-08-12T19:27:52.0890506Z PLAY [jboss] *******************************************************************
2026-08-12T19:27:52.1193532Z Wednesday 12 August 2026  16:27:52 -0300 (0:00:00.091)       0:01:59.060 ****** 
2026-08-12T19:27:52.4015326Z 
2026-08-12T19:27:52.4016127Z TASK [Verifica se o arquivo /opt/jboss-eap/standalone/configuration/custom.sh existe] ***
2026-08-12T19:27:52.4016293Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:27:52.4264632Z Wednesday 12 August 2026  16:27:52 -0300 (0:00:00.307)       0:01:59.367 ****** 
2026-08-12T19:27:52.7416117Z 
2026-08-12T19:27:52.7416942Z TASK [Executa shell customizada (jboss_home)] **********************************
2026-08-12T19:27:52.7417136Z changed: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:27:52.7890786Z Wednesday 12 August 2026  16:27:52 -0300 (0:00:00.362)       0:01:59.729 ****** 
2026-08-12T19:27:53.0508762Z 
2026-08-12T19:27:53.0509476Z TASK [Verifica se o arquivo /opt/batch/config/configuration/custom.sh existe] ***
2026-08-12T19:27:53.0509703Z ok: [caddeapllx2529.agil.nprd.caixa.gov.br]
2026-08-12T19:27:53.0771597Z Wednesday 12 August 2026  16:27:53 -0300 (0:00:00.288)       0:02:00.018 ****** 
2026-08-12T19:27:53.1388616Z 
2026-08-12T19:27:53.1389179Z PLAY [local] *******************************************************************
2026-08-12T19:27:53.1426460Z [WARNING]: Could not match supplied host pattern, ignoring: instance_restart
2026-08-12T19:27:53.1430788Z 
2026-08-12T19:27:53.1431177Z PLAY [instance_restart] ********************************************************
2026-08-12T19:27:53.1431404Z skipping: no hosts matched
2026-08-12T19:27:53.1436468Z [WARNING]: Could not match supplied host pattern, ignoring: machine_reboot
2026-08-12T19:27:53.1440800Z 
2026-08-12T19:27:53.1441490Z PLAY [machine_reboot] **********************************************************
2026-08-12T19:27:53.1441775Z skipping: no hosts matched
2026-08-12T19:27:53.1455653Z 
2026-08-12T19:27:53.1456022Z PLAY [local] *******************************************************************
2026-08-12T19:27:53.1493264Z [WARNING]: Could not match supplied host pattern, ignoring: instance_stop
2026-08-12T19:27:53.1498401Z 
2026-08-12T19:27:53.1498937Z PLAY [instance_stop] ***********************************************************
2026-08-12T19:27:53.1499142Z skipping: no hosts matched
2026-08-12T19:27:53.1502942Z 
2026-08-12T19:27:53.1503119Z PLAY [machine_reboot] **********************************************************
2026-08-12T19:27:53.1503262Z skipping: no hosts matched
2026-08-12T19:27:53.1517355Z 
2026-08-12T19:27:53.1517728Z PLAY [local] *******************************************************************
2026-08-12T19:27:53.1552610Z [WARNING]: Could not match supplied host pattern, ignoring: escopo_execucao
2026-08-12T19:27:53.1556599Z 
2026-08-12T19:27:53.1557036Z PLAY [Executar o Start do Sirot Connector no escopo definido] ******************
2026-08-12T19:27:53.1557217Z skipping: no hosts matched
2026-08-12T19:27:53.1568739Z 
2026-08-12T19:27:53.1569362Z PLAY [local] *******************************************************************
2026-08-12T19:27:53.1605856Z 
2026-08-12T19:27:53.1606304Z PLAY [Executar o Stop do Sirot Connector] **************************************
2026-08-12T19:27:53.1606482Z skipping: no hosts matched
2026-08-12T19:27:53.1616998Z 
2026-08-12T19:27:53.1617659Z PLAY [Configura TSM] ***********************************************************
2026-08-12T19:27:53.1660555Z 
2026-08-12T19:27:53.1660976Z PLAY [jboss] *******************************************************************
2026-08-12T19:27:53.1704484Z 
2026-08-12T19:27:53.1705456Z PLAY [Configura Control-M] *****************************************************
2026-08-12T19:27:53.1745150Z 
2026-08-12T19:27:53.1745674Z PLAY [jboss] *******************************************************************
2026-08-12T19:27:53.1785996Z 
2026-08-12T19:27:53.1786325Z PLAY [jboss] *******************************************************************
2026-08-12T19:27:53.1825745Z 
2026-08-12T19:27:53.1826063Z PLAY [jboss] *******************************************************************
2026-08-12T19:27:53.1847629Z 
2026-08-12T19:27:53.1848754Z PLAY [jboss] *******************************************************************
2026-08-12T19:27:53.1877796Z 
2026-08-12T19:27:53.1878194Z PLAY [localhost] ***************************************************************
2026-08-12T19:27:53.1900902Z 
2026-08-12T19:27:53.1901212Z PLAY [jboss] *******************************************************************
2026-08-12T19:27:53.1942208Z 
2026-08-12T19:27:53.1942779Z PLAY [jboss] *******************************************************************
2026-08-12T19:27:53.1980509Z 
2026-08-12T19:27:53.1980847Z PLAY [jboss] *******************************************************************
2026-08-12T19:27:53.2009948Z 
2026-08-12T19:27:53.2010430Z PLAY RECAP *********************************************************************
2026-08-12T19:27:53.2010830Z caddeapllx2529.agil.nprd.caixa.gov.br : ok=76   changed=15   unreachable=0    failed=0    skipped=19   rescued=0    ignored=3   
2026-08-12T19:27:53.2010989Z 
2026-08-12T19:27:53.2011882Z Wednesday 12 August 2026  16:27:53 -0300 (0:00:00.124)       0:02:00.142 ****** 
2026-08-12T19:27:53.2012229Z =============================================================================== 
2026-08-12T19:27:53.2015614Z nfs : Montando volume remoto ------------------------------------------- 59.84s
2026-08-12T19:27:53.2015999Z nfs : Networker | Restart networker ------------------------------------ 10.49s
2026-08-12T19:27:53.2016313Z Restart Jboss ----------------------------------------------------------- 8.48s
2026-08-12T19:27:53.2016824Z Copiando arquivos para jboss.server.config.dir -------------------------- 6.58s
2026-08-12T19:27:53.2017091Z nfs : execute montagem script ------------------------------------------- 4.02s
2026-08-12T19:27:53.2017318Z nfs : Instalando o NFS Client ------------------------------------------- 1.67s
2026-08-12T19:27:53.2017547Z Gerando fatos de servicos ----------------------------------------------- 1.67s
2026-08-12T19:27:53.2017856Z maven_artifact ---------------------------------------------------------- 1.62s
2026-08-12T19:27:53.2019040Z Copiando artefatos para o(s) servidor(es) Jboss ------------------------- 1.61s
2026-08-12T19:27:53.2019682Z nfs : Networker | Start networker --------------------------------------- 0.90s
2026-08-12T19:27:53.2020131Z Gathering Facts --------------------------------------------------------- 0.82s
2026-08-12T19:27:53.2020455Z Create a symbolic link -------------------------------------------------- 0.81s
2026-08-12T19:27:53.2020778Z Realiza copia do arquivo de Trust Store --------------------------------- 0.80s
2026-08-12T19:27:53.2021060Z nfs : Install networker lgtoclnt_url ------------------------------------ 0.76s
2026-08-12T19:27:53.2021282Z nfs : Install networker lgtonmda_url ------------------------------------ 0.75s
2026-08-12T19:27:53.2026756Z Verifica se o arquivo  existe ------------------------------------------- 0.66s
2026-08-12T19:27:53.2027014Z Copy template script ---------------------------------------------------- 0.64s
2026-08-12T19:27:53.2027259Z Create a directory ------------------------------------------------------ 0.64s
2026-08-12T19:27:53.2027497Z Check directory configuration exists ------------------------------------ 0.64s
2026-08-12T19:27:53.2027717Z Get standalone-full-ha.xml status --------------------------------------- 0.63s
2026-08-12T19:27:53.2027871Z Playbook run took 0 days, 0 hours, 2 minutes, 0 seconds
2026-08-12T19:27:53.2758725Z ##[section]Finishing: Deploy Config no JBOSS
