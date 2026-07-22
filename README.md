2026-07-22T14:49:29.4238615Z ##[section]Starting: Configura Control-M
2026-07-22T14:49:29.4241738Z ==============================================================================
2026-07-22T14:49:29.4241827Z Task         : Bash
2026-07-22T14:49:29.4241885Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-22T14:49:29.4241960Z Version      : 3.227.0
2026-07-22T14:49:29.4242011Z Author       : Microsoft Corporation
2026-07-22T14:49:29.4242065Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-22T14:49:29.4242147Z ==============================================================================
2026-07-22T14:49:30.2259757Z Generating script.
2026-07-22T14:49:30.2274284Z ========================== Starting Command Output ===========================
2026-07-22T14:49:30.2284368Z [command]/bin/bash /opt/ads-agent/_work/_temp/b8e134ae-b398-485f-8fbe-5d543ac3f498.sh
2026-07-22T14:49:32.2486616Z 
2026-07-22T14:49:32.2487615Z PLAY [local] *******************************************************************
2026-07-22T14:49:32.2749770Z 
2026-07-22T14:49:32.2750278Z PLAY [Configurando o DNS] ******************************************************
2026-07-22T14:49:32.4593533Z 
2026-07-22T14:49:32.4594275Z PLAY [local] *******************************************************************
2026-07-22T14:49:32.4627677Z 
2026-07-22T14:49:32.4628276Z PLAY [Verificando serviços] ****************************************************
2026-07-22T14:49:32.4705425Z 
2026-07-22T14:49:32.4706073Z PLAY [Configuração LDAP] *******************************************************
2026-07-22T14:49:32.4734713Z [WARNING]: Found variable using reserved name: when
2026-07-22T14:49:32.4741294Z 
2026-07-22T14:49:32.4741587Z PLAY [jboss] *******************************************************************
2026-07-22T14:49:32.4823675Z 
2026-07-22T14:49:32.4824516Z PLAY [Stack Jboss] *************************************************************
2026-07-22T14:49:32.4850037Z 
2026-07-22T14:49:32.4850400Z PLAY [jboss] *******************************************************************
2026-07-22T14:49:32.4887852Z 
2026-07-22T14:49:32.4888209Z PLAY [jboss] *******************************************************************
2026-07-22T14:49:32.5155037Z Wednesday 22 July 2026  11:49:32 -0300 (0:00:00.327)       0:00:00.327 ******** 
2026-07-22T14:49:32.9808040Z 
2026-07-22T14:49:32.9808553Z TASK [Verifica se o arquivo nfs_config.json existe] ****************************
2026-07-22T14:49:32.9808963Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:49:32.9833503Z Wednesday 22 July 2026  11:49:32 -0300 (0:00:00.468)       0:00:00.795 ******** 
2026-07-22T14:49:33.0289942Z included: /opt/ads-agent/_work/r3618/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for caddeapllx1572.agil.nprd.caixa.gov.br
2026-07-22T14:49:33.0327580Z Wednesday 22 July 2026  11:49:33 -0300 (0:00:00.049)       0:00:00.845 ******** 
2026-07-22T14:49:33.0897917Z 
2026-07-22T14:49:33.0898678Z TASK [nfs : Criar variáveis] ***************************************************
2026-07-22T14:49:33.0898881Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:49:33.0929908Z Wednesday 22 July 2026  11:49:33 -0300 (0:00:00.060)       0:00:00.905 ******** 
2026-07-22T14:49:33.5009233Z 
2026-07-22T14:49:33.5010161Z TASK [nfs : Coletar variáveis de ambiente] *************************************
2026-07-22T14:49:33.5010489Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:49:33.5034180Z Wednesday 22 July 2026  11:49:33 -0300 (0:00:00.410)       0:00:01.315 ******** 
2026-07-22T14:49:33.5587815Z 
2026-07-22T14:49:33.5588574Z TASK [nfs : Exibir resultado em JSON] ******************************************
2026-07-22T14:49:33.5590386Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:49:33.5590592Z     "nfs_vars_json": {
2026-07-22T14:49:33.5590855Z         "changed": false, 
2026-07-22T14:49:33.5591480Z         "cmd": "cat /opt/ads-agent/_work/r3618/a/nfs_config.json", 
2026-07-22T14:49:33.5592194Z         "delta": "0:00:00.003367", 
2026-07-22T14:49:33.5592880Z         "end": "2026-07-22 11:49:33.486517", 
2026-07-22T14:49:33.5593013Z         "failed": false, 
2026-07-22T14:49:33.5593123Z         "rc": 0, 
2026-07-22T14:49:33.5593292Z         "start": "2026-07-22 11:49:33.483150", 
2026-07-22T14:49:33.5593427Z         "stderr": "", 
2026-07-22T14:49:33.5593538Z         "stderr_lines": [], 
2026-07-22T14:49:33.5593829Z         "stdout": "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS\",\"NFS_MOUNT_POINT_ISILON\": \"/sipbs\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW\",\"NFS_MOUNT_POINT_ISILON_3\": \"/sipbs_fgw\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL\",\"NFS_MOUNT_POINT_ISILON_2\": \"/b2b\"}]", 
2026-07-22T14:49:33.5594131Z         "stdout_lines": [
2026-07-22T14:49:33.5594411Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS\",\"NFS_MOUNT_POINT_ISILON\": \"/sipbs\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW\",\"NFS_MOUNT_POINT_ISILON_3\": \"/sipbs_fgw\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL\",\"NFS_MOUNT_POINT_ISILON_2\": \"/b2b\"}]"
2026-07-22T14:49:33.5594684Z         ]
2026-07-22T14:49:33.5594779Z     }
2026-07-22T14:49:33.5594871Z }
2026-07-22T14:49:33.5616953Z Wednesday 22 July 2026  11:49:33 -0300 (0:00:00.058)       0:00:01.373 ******** 
2026-07-22T14:49:33.6207102Z 
2026-07-22T14:49:33.6207815Z TASK [nfs : Criar variáveis] ***************************************************
2026-07-22T14:49:33.6207991Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:49:33.6249467Z Wednesday 22 July 2026  11:49:33 -0300 (0:00:00.063)       0:00:01.437 ******** 
2026-07-22T14:49:39.1475854Z 
2026-07-22T14:49:39.1476353Z TASK [nfs : execute montagem script] *******************************************
2026-07-22T14:49:39.1476597Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:49:39.1504498Z Wednesday 22 July 2026  11:49:39 -0300 (0:00:05.525)       0:00:06.962 ******** 
2026-07-22T14:49:39.2085415Z 
2026-07-22T14:49:39.2086260Z TASK [nfs : ansible.builtin.debug] *********************************************
2026-07-22T14:49:39.2088431Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:49:39.2089058Z     "changed": false, 
2026-07-22T14:49:39.2089237Z     "msg": {
2026-07-22T14:49:39.2089354Z         "changed": true, 
2026-07-22T14:49:39.2089466Z         "cmd": [
2026-07-22T14:49:39.2089583Z             "python", 
2026-07-22T14:49:39.2090667Z             "/opt/ads-agent/_work/r3618/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py", 
2026-07-22T14:49:39.2090844Z             "montagem", 
2026-07-22T14:49:39.2090995Z             "sipbs-batch", 
2026-07-22T14:49:39.2091104Z             "tqs", 
2026-07-22T14:49:39.2091224Z             "ctc_nprd", 
2026-07-22T14:49:39.2091643Z             "/opt/ads-agent/_work/r3618/a/esteira-jboss-vm-v2", 
2026-07-22T14:49:39.2091793Z             "C&t@d02", 
2026-07-22T14:49:39.2091976Z             "***", 
2026-07-22T14:49:39.2092611Z             "s736651@corp.caixa.gov.br", 
2026-07-22T14:49:39.2093195Z             "***", 
2026-07-22T14:49:39.2093653Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS\",\"NFS_MOUNT_POINT_ISILON\": \"/sipbs\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW\",\"NFS_MOUNT_POINT_ISILON_3\": \"/sipbs_fgw\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL\",\"NFS_MOUNT_POINT_ISILON_2\": \"/b2b\"}]"
2026-07-22T14:49:39.2093945Z         ], 
2026-07-22T14:49:39.2094084Z         "delta": "0:00:05.215835", 
2026-07-22T14:49:39.2094276Z         "end": "2026-07-22 11:49:39.131903", 
2026-07-22T14:49:39.2094389Z         "failed": false, 
2026-07-22T14:49:39.2094497Z         "rc": 0, 
2026-07-22T14:49:39.2094666Z         "start": "2026-07-22 11:49:33.916068", 
2026-07-22T14:49:39.2094989Z         "stderr": "", 
2026-07-22T14:49:39.2095381Z         "stderr_lines": [], 
2026-07-22T14:49:39.2097853Z         "stdout": "[{u'NFS_MOUNT_POINT_ISILON': u'/sipbs', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS'}, {u'NFS_MOUNT_POINT_ISILON_3': u'/sipbs_fgw', u'NFS_ENDPOINT_ISILON_3': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW'}, {u'NFS_MOUNT_POINT_ISILON_2': u'/b2b', u'NFS_ENDPOINT_ISILON_2': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL'}]\nNome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           \n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS /sipbs                              ISILON                              nfsctcnprd.ctc.caixa                tqs                                \nnfs_path=/sipbs\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS /sipbs                              ISILON                              nfsctcnprd.ctc.caixa                tqs                                \nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL /b2b                                ISILON                              nfsctcnprd.ctc.caixa                tqs                                \nnfs_path=/b2b\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL /b2b                                ISILON                              nfsctcnprd.ctc.caixa                tqs                                \nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW /sipbs_fgw                          ISILON                              nfsctcnprd.ctc.caixa                tqs                                \nnfs_path=/sipbs_fgw\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW /sipbs_fgw                          ISILON                              nfsctcnprd.ctc.caixa                tqs                                ", 
2026-07-22T14:49:39.2098773Z         "stdout_lines": [
2026-07-22T14:49:39.2099323Z             "[{u'NFS_MOUNT_POINT_ISILON': u'/sipbs', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS'}, {u'NFS_MOUNT_POINT_ISILON_3': u'/sipbs_fgw', u'NFS_ENDPOINT_ISILON_3': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW'}, {u'NFS_MOUNT_POINT_ISILON_2': u'/b2b', u'NFS_ENDPOINT_ISILON_2': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL'}]", 
2026-07-22T14:49:39.2099633Z             "Nome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           ", 
2026-07-22T14:49:39.2100157Z             "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------", 
2026-07-22T14:49:39.2100400Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS /sipbs                              ISILON                              nfsctcnprd.ctc.caixa                tqs                                ", 
2026-07-22T14:49:39.2100558Z             "nfs_path=/sipbs", 
2026-07-22T14:49:39.2100701Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS", 
2026-07-22T14:49:39.2100950Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS /sipbs                              ISILON                              nfsctcnprd.ctc.caixa                tqs                                ", 
2026-07-22T14:49:39.2101159Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL /b2b                                ISILON                              nfsctcnprd.ctc.caixa                tqs                                ", 
2026-07-22T14:49:39.2101316Z             "nfs_path=/b2b", 
2026-07-22T14:49:39.2101457Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL", 
2026-07-22T14:49:39.2101643Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL /b2b                                ISILON                              nfsctcnprd.ctc.caixa                tqs                                ", 
2026-07-22T14:49:39.2101847Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW /sipbs_fgw                          ISILON                              nfsctcnprd.ctc.caixa                tqs                                ", 
2026-07-22T14:49:39.2102010Z             "nfs_path=/sipbs_fgw", 
2026-07-22T14:49:39.2102152Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW", 
2026-07-22T14:49:39.2102343Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW /sipbs_fgw                          ISILON                              nfsctcnprd.ctc.caixa                tqs                                "
2026-07-22T14:49:39.2102487Z         ]
2026-07-22T14:49:39.2102580Z     }
2026-07-22T14:49:39.2102672Z }
2026-07-22T14:49:39.2113232Z Wednesday 22 July 2026  11:49:39 -0300 (0:00:00.060)       0:00:07.023 ******** 
2026-07-22T14:49:39.5352836Z 
2026-07-22T14:49:39.5353589Z TASK [nfs : execute clean json] ************************************************
2026-07-22T14:49:39.5354234Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:49:39.5383407Z Wednesday 22 July 2026  11:49:39 -0300 (0:00:00.326)       0:00:07.350 ******** 
2026-07-22T14:49:39.6040157Z 
2026-07-22T14:49:39.6040741Z TASK [nfs : result_new_string_json] ********************************************
2026-07-22T14:49:39.6040900Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:49:39.6041036Z     "msg": {
2026-07-22T14:49:39.6042591Z         "ansible_facts": {
2026-07-22T14:49:39.6043068Z             "discovered_interpreter_python": "/usr/bin/python"
2026-07-22T14:49:39.6043383Z         }, 
2026-07-22T14:49:39.6043539Z         "changed": true, 
2026-07-22T14:49:39.6044523Z         "cmd": "echo '[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS\",\"NFS_MOUNT_POINT_ISILON\": \"/sipbs\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW\",\"NFS_MOUNT_POINT_ISILON_3\": \"/sipbs_fgw\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL\",\"NFS_MOUNT_POINT_ISILON_2\": \"/b2b\"}]' | sed 's/NFS_ENDPOINT_ISILON[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_ISILON[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_HUAWEI[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_HUAWEI[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_VM[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_VM[^\"]*/NFS_MOUNT_POINT/g'", 
2026-07-22T14:49:39.6045274Z         "delta": "0:00:00.009117", 
2026-07-22T14:49:39.6045465Z         "end": "2026-07-22 11:49:39.521092", 
2026-07-22T14:49:39.6045599Z         "failed": false, 
2026-07-22T14:49:39.6047726Z         "rc": 0, 
2026-07-22T14:49:39.6048228Z         "start": "2026-07-22 11:49:39.511975", 
2026-07-22T14:49:39.6048561Z         "stderr": "", 
2026-07-22T14:49:39.6049844Z         "stderr_lines": [], 
2026-07-22T14:49:39.6050509Z         "stdout": "[{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS\",\"NFS_MOUNT_POINT\": \"/sipbs\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW\",\"NFS_MOUNT_POINT\": \"/sipbs_fgw\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL\",\"NFS_MOUNT_POINT\": \"/b2b\"}]", 
2026-07-22T14:49:39.6051328Z         "stdout_lines": [
2026-07-22T14:49:39.6051880Z             "[{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS\",\"NFS_MOUNT_POINT\": \"/sipbs\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW\",\"NFS_MOUNT_POINT\": \"/sipbs_fgw\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL\",\"NFS_MOUNT_POINT\": \"/b2b\"}]"
2026-07-22T14:49:39.6052498Z         ]
2026-07-22T14:49:39.6052782Z     }
2026-07-22T14:49:39.6052895Z }
2026-07-22T14:49:39.6063677Z Wednesday 22 July 2026  11:49:39 -0300 (0:00:00.067)       0:00:07.418 ******** 
2026-07-22T14:49:39.6619066Z 
2026-07-22T14:49:39.6619864Z TASK [nfs : Parse JSON data] ***************************************************
2026-07-22T14:49:39.6620479Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:49:39.6643821Z Wednesday 22 July 2026  11:49:39 -0300 (0:00:00.058)       0:00:07.476 ******** 
2026-07-22T14:49:39.7200428Z 
2026-07-22T14:49:39.7201242Z TASK [nfs : result_new_json] ***************************************************
2026-07-22T14:49:39.7207753Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:49:39.7208019Z     "msg": [
2026-07-22T14:49:39.7208631Z         {
2026-07-22T14:49:39.7208862Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS", 
2026-07-22T14:49:39.7209019Z             "NFS_MOUNT_POINT": "/sipbs"
2026-07-22T14:49:39.7209130Z         }, 
2026-07-22T14:49:39.7209231Z         {
2026-07-22T14:49:39.7209386Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW", 
2026-07-22T14:49:39.7209538Z             "NFS_MOUNT_POINT": "/sipbs_fgw"
2026-07-22T14:49:39.7209748Z         }, 
2026-07-22T14:49:39.7209836Z         {
2026-07-22T14:49:39.7209975Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL", 
2026-07-22T14:49:39.7210125Z             "NFS_MOUNT_POINT": "/b2b"
2026-07-22T14:49:39.7210224Z         }
2026-07-22T14:49:39.7210309Z     ]
2026-07-22T14:49:39.7210423Z }
2026-07-22T14:49:39.7234972Z Wednesday 22 July 2026  11:49:39 -0300 (0:00:00.059)       0:00:07.535 ******** 
2026-07-22T14:49:39.8036049Z included: /opt/ads-agent/_work/r3618/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx1572.agil.nprd.caixa.gov.br
2026-07-22T14:49:39.8164581Z included: /opt/ads-agent/_work/r3618/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx1572.agil.nprd.caixa.gov.br
2026-07-22T14:49:39.8290604Z included: /opt/ads-agent/_work/r3618/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx1572.agil.nprd.caixa.gov.br
2026-07-22T14:49:39.8381958Z Wednesday 22 July 2026  11:49:39 -0300 (0:00:00.114)       0:00:07.650 ******** 
2026-07-22T14:49:39.8928556Z 
2026-07-22T14:49:39.8929011Z TASK [nfs : Parse JSON data] ***************************************************
2026-07-22T14:49:39.8929465Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:49:39.8965042Z Wednesday 22 July 2026  11:49:39 -0300 (0:00:00.058)       0:00:07.708 ******** 
2026-07-22T14:49:39.9510355Z 
2026-07-22T14:49:39.9511038Z TASK [nfs : debug] *************************************************************
2026-07-22T14:49:39.9511411Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:49:39.9512002Z     "msg": {
2026-07-22T14:49:39.9512233Z         "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS", 
2026-07-22T14:49:39.9512390Z         "NFS_MOUNT_POINT": "/sipbs"
2026-07-22T14:49:39.9512501Z     }
2026-07-22T14:49:39.9512597Z }
2026-07-22T14:49:39.9538648Z Wednesday 22 July 2026  11:49:39 -0300 (0:00:00.057)       0:00:07.766 ******** 
2026-07-22T14:49:40.0066673Z 
2026-07-22T14:49:40.0067623Z TASK [nfs : debug] *************************************************************
2026-07-22T14:49:40.0067847Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:49:40.0067999Z     "msg": "/sipbs"
2026-07-22T14:49:40.0068089Z }
2026-07-22T14:49:40.0092869Z Wednesday 22 July 2026  11:49:40 -0300 (0:00:00.055)       0:00:07.821 ******** 
2026-07-22T14:49:40.0638592Z 
2026-07-22T14:49:40.0639118Z TASK [nfs : debug] *************************************************************
2026-07-22T14:49:40.0639298Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:49:40.0640350Z     "msg": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS"
2026-07-22T14:49:40.0640687Z }
2026-07-22T14:49:40.0663882Z Wednesday 22 July 2026  11:49:40 -0300 (0:00:00.057)       0:00:07.878 ******** 
2026-07-22T14:49:40.1236085Z 
2026-07-22T14:49:40.1236810Z TASK [nfs : Verificando as variaveis] ******************************************
2026-07-22T14:49:40.1238012Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:49:40.1238166Z     "changed": false, 
2026-07-22T14:49:40.1238314Z     "msg": "All assertions passed"
2026-07-22T14:49:40.1238430Z }
2026-07-22T14:49:40.1262546Z Wednesday 22 July 2026  11:49:40 -0300 (0:00:00.059)       0:00:07.938 ******** 
2026-07-22T14:49:41.8374881Z 
2026-07-22T14:49:41.8375680Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-07-22T14:49:41.8375935Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:49:41.8403335Z Wednesday 22 July 2026  11:49:41 -0300 (0:00:01.714)       0:00:09.652 ******** 
2026-07-22T14:49:42.5483710Z 
2026-07-22T14:49:42.5484172Z TASK [nfs : Install networker lgtoclnt_url] ************************************
2026-07-22T14:49:42.5484533Z [WARNING]: Consider using the yum, dnf or zypper module rather than running
2026-07-22T14:49:42.5485997Z 'rpm'.  If you need to use command because yum, dnf or zypper is insufficient
2026-07-22T14:49:42.5486606Z you can add 'warn: false' to this command task or set 'command_warnings=False'
2026-07-22T14:49:42.5486842Z in ansible.cfg to get rid of this message.
2026-07-22T14:49:42.5489351Z fatal: [caddeapllx1572.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.460663", "end": "2026-07-22 11:49:42.534051", "msg": "non-zero return code", "rc": 1, "start": "2026-07-22 11:49:42.073388", "stderr": "aviso: /var/tmp/rpm-tmp.xybUFj: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.xybUFj: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm", "Preparando...                         ########################################"]}
2026-07-22T14:49:42.5490388Z ...ignoring
2026-07-22T14:49:42.5516169Z Wednesday 22 July 2026  11:49:42 -0300 (0:00:00.711)       0:00:10.364 ******** 
2026-07-22T14:49:43.2038777Z 
2026-07-22T14:49:43.2039579Z TASK [nfs : Install networker lgtonmda_url] ************************************
2026-07-22T14:49:43.2043896Z fatal: [caddeapllx1572.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.412037", "end": "2026-07-22 11:49:43.190221", "msg": "non-zero return code", "rc": 1, "start": "2026-07-22 11:49:42.778184", "stderr": "aviso: /var/tmp/rpm-tmp.DjWnA7: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.DjWnA7: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm", "Preparando...                         ########################################"]}
2026-07-22T14:49:43.2045005Z ...ignoring
2026-07-22T14:49:43.2071497Z Wednesday 22 July 2026  11:49:43 -0300 (0:00:00.655)       0:00:11.019 ******** 
2026-07-22T14:49:43.6204510Z 
2026-07-22T14:49:43.6205407Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-07-22T14:49:43.6205707Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:49:43.6238373Z Wednesday 22 July 2026  11:49:43 -0300 (0:00:00.416)       0:00:11.436 ******** 
2026-07-22T14:49:43.9047419Z 
2026-07-22T14:49:43.9048036Z TASK [nfs : Create a symbolic link] ********************************************
2026-07-22T14:49:43.9048209Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:49:43.9076069Z Wednesday 22 July 2026  11:49:43 -0300 (0:00:00.283)       0:00:11.719 ******** 
2026-07-22T14:49:44.7681870Z 
2026-07-22T14:49:44.7682790Z TASK [nfs : Networker | Start networker] ***************************************
2026-07-22T14:49:44.7683001Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:49:44.7713751Z Wednesday 22 July 2026  11:49:44 -0300 (0:00:00.863)       0:00:12.583 ******** 
2026-07-22T14:49:45.0678701Z 
2026-07-22T14:49:45.0679239Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-07-22T14:49:45.0679598Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:49:45.0700326Z Wednesday 22 July 2026  11:49:45 -0300 (0:00:00.298)       0:00:12.882 ******** 
2026-07-22T14:49:55.4948544Z 
2026-07-22T14:49:55.4949063Z TASK [nfs : Networker | Restart networker] *************************************
2026-07-22T14:49:55.4949261Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:49:55.4978316Z Wednesday 22 July 2026  11:49:55 -0300 (0:00:10.427)       0:00:23.310 ******** 
2026-07-22T14:49:55.9304502Z 
2026-07-22T14:49:55.9305011Z TASK [nfs : Montando volume remoto] ********************************************
2026-07-22T14:49:55.9305368Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:49:55.9329994Z Wednesday 22 July 2026  11:49:55 -0300 (0:00:00.435)       0:00:23.745 ******** 
2026-07-22T14:49:55.9973097Z Wednesday 22 July 2026  11:49:55 -0300 (0:00:00.063)       0:00:23.809 ******** 
2026-07-22T14:49:56.0513420Z 
2026-07-22T14:49:56.0513936Z TASK [nfs : Parse JSON data] ***************************************************
2026-07-22T14:49:56.0514105Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:49:56.0536293Z Wednesday 22 July 2026  11:49:56 -0300 (0:00:00.056)       0:00:23.865 ******** 
2026-07-22T14:49:56.1094732Z 
2026-07-22T14:49:56.1095503Z TASK [nfs : debug] *************************************************************
2026-07-22T14:49:56.1095679Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:49:56.1097788Z     "msg": {
2026-07-22T14:49:56.1098143Z         "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW", 
2026-07-22T14:49:56.1098531Z         "NFS_MOUNT_POINT": "/sipbs_fgw"
2026-07-22T14:49:56.1098968Z     }
2026-07-22T14:49:56.1099117Z }
2026-07-22T14:49:56.1132580Z Wednesday 22 July 2026  11:49:56 -0300 (0:00:00.059)       0:00:23.925 ******** 
2026-07-22T14:49:56.1674546Z 
2026-07-22T14:49:56.1675452Z TASK [nfs : debug] *************************************************************
2026-07-22T14:49:56.1675977Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:49:56.1676664Z     "msg": "/sipbs_fgw"
2026-07-22T14:49:56.1676849Z }
2026-07-22T14:49:56.1701614Z Wednesday 22 July 2026  11:49:56 -0300 (0:00:00.056)       0:00:23.982 ******** 
2026-07-22T14:49:56.2227914Z 
2026-07-22T14:49:56.2228380Z TASK [nfs : debug] *************************************************************
2026-07-22T14:49:56.2228606Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:49:56.2228790Z     "msg": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW"
2026-07-22T14:49:56.2228924Z }
2026-07-22T14:49:56.2255197Z Wednesday 22 July 2026  11:49:56 -0300 (0:00:00.055)       0:00:24.037 ******** 
2026-07-22T14:49:56.2817049Z 
2026-07-22T14:49:56.2818068Z TASK [nfs : Verificando as variaveis] ******************************************
2026-07-22T14:49:56.2818290Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:49:56.2818422Z     "changed": false, 
2026-07-22T14:49:56.2818539Z     "msg": "All assertions passed"
2026-07-22T14:49:56.2818643Z }
2026-07-22T14:49:56.2844682Z Wednesday 22 July 2026  11:49:56 -0300 (0:00:00.058)       0:00:24.096 ******** 
2026-07-22T14:49:57.2445783Z 
2026-07-22T14:49:57.2446587Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-07-22T14:49:57.2446981Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:49:57.2470972Z Wednesday 22 July 2026  11:49:57 -0300 (0:00:00.962)       0:00:25.059 ******** 
2026-07-22T14:49:57.9584895Z 
2026-07-22T14:49:57.9585313Z TASK [nfs : Install networker lgtoclnt_url] ************************************
2026-07-22T14:49:57.9592366Z fatal: [caddeapllx1572.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.461120", "end": "2026-07-22 11:49:57.944949", "msg": "non-zero return code", "rc": 1, "start": "2026-07-22 11:49:57.483829", "stderr": "aviso: /var/tmp/rpm-tmp.D0Py6o: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.D0Py6o: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm", "Preparando...                         ########################################"]}
2026-07-22T14:49:57.9593218Z ...ignoring
2026-07-22T14:49:57.9621681Z Wednesday 22 July 2026  11:49:57 -0300 (0:00:00.715)       0:00:25.774 ******** 
2026-07-22T14:49:58.6772332Z 
2026-07-22T14:49:58.6773221Z TASK [nfs : Install networker lgtonmda_url] ************************************
2026-07-22T14:49:58.6777772Z fatal: [caddeapllx1572.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.424374", "end": "2026-07-22 11:49:58.663734", "msg": "non-zero return code", "rc": 1, "start": "2026-07-22 11:49:58.239360", "stderr": "aviso: /var/tmp/rpm-tmp.6DseBb: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.6DseBb: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm", "Preparando...                         ########################################"]}
2026-07-22T14:49:58.6780574Z ...ignoring
2026-07-22T14:49:58.6805074Z Wednesday 22 July 2026  11:49:58 -0300 (0:00:00.718)       0:00:26.492 ******** 
2026-07-22T14:49:58.9289938Z 
2026-07-22T14:49:58.9290652Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-07-22T14:49:58.9290830Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:49:58.9317310Z Wednesday 22 July 2026  11:49:58 -0300 (0:00:00.251)       0:00:26.744 ******** 
2026-07-22T14:49:59.1895695Z 
2026-07-22T14:49:59.1896244Z TASK [nfs : Create a symbolic link] ********************************************
2026-07-22T14:49:59.1896508Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:49:59.1926063Z Wednesday 22 July 2026  11:49:59 -0300 (0:00:00.260)       0:00:27.004 ******** 
2026-07-22T14:49:59.7727904Z 
2026-07-22T14:49:59.7728399Z TASK [nfs : Networker | Start networker] ***************************************
2026-07-22T14:49:59.7728574Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:49:59.7759913Z Wednesday 22 July 2026  11:49:59 -0300 (0:00:00.583)       0:00:27.588 ******** 
2026-07-22T14:50:00.0561320Z 
2026-07-22T14:50:00.0562267Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-07-22T14:50:00.0562488Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:50:00.0588967Z Wednesday 22 July 2026  11:50:00 -0300 (0:00:00.282)       0:00:27.871 ******** 
2026-07-22T14:50:10.5110508Z 
2026-07-22T14:50:10.5111337Z TASK [nfs : Networker | Restart networker] *************************************
2026-07-22T14:50:10.5111970Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:50:10.5124526Z Wednesday 22 July 2026  11:50:10 -0300 (0:00:10.453)       0:00:38.324 ******** 
2026-07-22T14:50:10.7699219Z 
2026-07-22T14:50:10.7700170Z TASK [nfs : Montando volume remoto] ********************************************
2026-07-22T14:50:10.7700382Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:50:10.7719283Z Wednesday 22 July 2026  11:50:10 -0300 (0:00:00.259)       0:00:38.584 ******** 
2026-07-22T14:50:10.8177250Z Wednesday 22 July 2026  11:50:10 -0300 (0:00:00.045)       0:00:38.629 ******** 
2026-07-22T14:50:10.8719537Z 
2026-07-22T14:50:10.8720408Z TASK [nfs : Parse JSON data] ***************************************************
2026-07-22T14:50:10.8720796Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:50:10.8744585Z Wednesday 22 July 2026  11:50:10 -0300 (0:00:00.056)       0:00:38.686 ******** 
2026-07-22T14:50:10.9277329Z 
2026-07-22T14:50:10.9278132Z TASK [nfs : debug] *************************************************************
2026-07-22T14:50:10.9278613Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:50:10.9279208Z     "msg": {
2026-07-22T14:50:10.9279401Z         "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL", 
2026-07-22T14:50:10.9279544Z         "NFS_MOUNT_POINT": "/b2b"
2026-07-22T14:50:10.9279654Z     }
2026-07-22T14:50:10.9279749Z }
2026-07-22T14:50:10.9304405Z Wednesday 22 July 2026  11:50:10 -0300 (0:00:00.056)       0:00:38.742 ******** 
2026-07-22T14:50:10.9838890Z 
2026-07-22T14:50:10.9839328Z TASK [nfs : debug] *************************************************************
2026-07-22T14:50:10.9839497Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:50:10.9839637Z     "msg": "/b2b"
2026-07-22T14:50:10.9839893Z }
2026-07-22T14:50:10.9863393Z Wednesday 22 July 2026  11:50:10 -0300 (0:00:00.055)       0:00:38.798 ******** 
2026-07-22T14:50:11.0390795Z 
2026-07-22T14:50:11.0391313Z TASK [nfs : debug] *************************************************************
2026-07-22T14:50:11.0391485Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:50:11.0391655Z     "msg": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL"
2026-07-22T14:50:11.0391774Z }
2026-07-22T14:50:11.0420791Z Wednesday 22 July 2026  11:50:11 -0300 (0:00:00.055)       0:00:38.854 ******** 
2026-07-22T14:50:11.0987759Z 
2026-07-22T14:50:11.0988287Z TASK [nfs : Verificando as variaveis] ******************************************
2026-07-22T14:50:11.0988462Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:50:11.0988595Z     "changed": false, 
2026-07-22T14:50:11.0988723Z     "msg": "All assertions passed"
2026-07-22T14:50:11.0988828Z }
2026-07-22T14:50:11.1014919Z Wednesday 22 July 2026  11:50:11 -0300 (0:00:00.059)       0:00:38.913 ******** 
2026-07-22T14:50:12.1588573Z 
2026-07-22T14:50:12.1589106Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-07-22T14:50:12.1589337Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:50:12.1618678Z Wednesday 22 July 2026  11:50:12 -0300 (0:00:01.060)       0:00:39.973 ******** 
2026-07-22T14:50:12.8793365Z 
2026-07-22T14:50:12.8793906Z TASK [nfs : Install networker lgtoclnt_url] ************************************
2026-07-22T14:50:12.8797843Z fatal: [caddeapllx1572.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.469164", "end": "2026-07-22 11:50:12.865466", "msg": "non-zero return code", "rc": 1, "start": "2026-07-22 11:50:12.396302", "stderr": "aviso: /var/tmp/rpm-tmp.5WtroU: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.5WtroU: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm", "Preparando...                         ########################################"]}
2026-07-22T14:50:12.8798441Z ...ignoring
2026-07-22T14:50:12.8824121Z Wednesday 22 July 2026  11:50:12 -0300 (0:00:00.720)       0:00:40.694 ******** 
2026-07-22T14:50:13.5768267Z 
2026-07-22T14:50:13.5768790Z TASK [nfs : Install networker lgtonmda_url] ************************************
2026-07-22T14:50:13.5773950Z fatal: [caddeapllx1572.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.415269", "end": "2026-07-22 11:50:13.563338", "msg": "non-zero return code", "rc": 1, "start": "2026-07-22 11:50:13.148069", "stderr": "aviso: /var/tmp/rpm-tmp.vsAohH: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.vsAohH: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm", "Preparando...                         ########################################"]}
2026-07-22T14:50:13.5774549Z ...ignoring
2026-07-22T14:50:13.5801806Z Wednesday 22 July 2026  11:50:13 -0300 (0:00:00.697)       0:00:41.392 ******** 
2026-07-22T14:50:13.8317968Z 
2026-07-22T14:50:13.8319089Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-07-22T14:50:13.8319553Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:50:13.8344947Z Wednesday 22 July 2026  11:50:13 -0300 (0:00:00.254)       0:00:41.646 ******** 
2026-07-22T14:50:14.0769337Z 
2026-07-22T14:50:14.0770120Z TASK [nfs : Create a symbolic link] ********************************************
2026-07-22T14:50:14.0770755Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:50:14.0794660Z Wednesday 22 July 2026  11:50:14 -0300 (0:00:00.244)       0:00:41.891 ******** 
2026-07-22T14:50:14.6468202Z 
2026-07-22T14:50:14.6468723Z TASK [nfs : Networker | Start networker] ***************************************
2026-07-22T14:50:14.6468888Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:50:14.6500556Z Wednesday 22 July 2026  11:50:14 -0300 (0:00:00.570)       0:00:42.462 ******** 
2026-07-22T14:50:14.9103046Z 
2026-07-22T14:50:14.9104097Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-07-22T14:50:14.9104508Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:50:14.9128352Z Wednesday 22 July 2026  11:50:14 -0300 (0:00:00.262)       0:00:42.725 ******** 
2026-07-22T14:50:25.3684226Z 
2026-07-22T14:50:25.3685098Z TASK [nfs : Networker | Restart networker] *************************************
2026-07-22T14:50:25.3685468Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:50:25.3718335Z Wednesday 22 July 2026  11:50:25 -0300 (0:00:10.458)       0:00:53.184 ******** 
2026-07-22T14:50:25.6334755Z 
2026-07-22T14:50:25.6335538Z TASK [nfs : Montando volume remoto] ********************************************
2026-07-22T14:50:25.6336158Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:50:25.6361201Z Wednesday 22 July 2026  11:50:25 -0300 (0:00:00.264)       0:00:53.448 ******** 
2026-07-22T14:50:25.6768328Z 
2026-07-22T14:50:25.6768831Z PLAY [jboss] *******************************************************************
2026-07-22T14:50:25.6795125Z 
2026-07-22T14:50:25.6795475Z PLAY [Copiando deployments adicionais] *****************************************
2026-07-22T14:50:25.6822067Z 
2026-07-22T14:50:25.6822671Z PLAY [Copiando modules adicionais] *********************************************
2026-07-22T14:50:25.6846359Z 
2026-07-22T14:50:25.6846637Z PLAY [jboss] *******************************************************************
2026-07-22T14:50:25.6882407Z 
2026-07-22T14:50:25.6882783Z PLAY [jboss] *******************************************************************
2026-07-22T14:50:25.6909370Z 
2026-07-22T14:50:25.6909629Z PLAY [jboss] *******************************************************************
2026-07-22T14:50:25.6943279Z 
2026-07-22T14:50:25.6943752Z PLAY [jboss] *******************************************************************
2026-07-22T14:50:25.6967962Z 
2026-07-22T14:50:25.6968387Z PLAY [jboss] *******************************************************************
2026-07-22T14:50:25.6995548Z 
2026-07-22T14:50:25.6995947Z PLAY [local] *******************************************************************
2026-07-22T14:50:25.7020473Z [WARNING]: Could not match supplied host pattern, ignoring: instance_restart
2026-07-22T14:50:25.7023148Z 
2026-07-22T14:50:25.7023435Z PLAY [instance_restart] ********************************************************
2026-07-22T14:50:25.7023607Z skipping: no hosts matched
2026-07-22T14:50:25.7027540Z [WARNING]: Could not match supplied host pattern, ignoring: machine_reboot
2026-07-22T14:50:25.7028862Z 
2026-07-22T14:50:25.7029069Z PLAY [machine_reboot] **********************************************************
2026-07-22T14:50:25.7029226Z skipping: no hosts matched
2026-07-22T14:50:25.7034763Z 
2026-07-22T14:50:25.7034902Z PLAY [local] *******************************************************************
2026-07-22T14:50:25.7059517Z [WARNING]: Could not match supplied host pattern, ignoring: instance_stop
2026-07-22T14:50:25.7062296Z 
2026-07-22T14:50:25.7062578Z PLAY [instance_stop] ***********************************************************
2026-07-22T14:50:25.7062733Z skipping: no hosts matched
2026-07-22T14:50:25.7065487Z 
2026-07-22T14:50:25.7066066Z PLAY [machine_reboot] **********************************************************
2026-07-22T14:50:25.7066312Z skipping: no hosts matched
2026-07-22T14:50:25.7071391Z 
2026-07-22T14:50:25.7071793Z PLAY [local] *******************************************************************
2026-07-22T14:50:25.7093245Z [WARNING]: Could not match supplied host pattern, ignoring: escopo_execucao
2026-07-22T14:50:25.7096171Z 
2026-07-22T14:50:25.7096575Z PLAY [Executar o Start do Sirot Connector no escopo definido] ******************
2026-07-22T14:50:25.7096833Z skipping: no hosts matched
2026-07-22T14:50:25.7109010Z 
2026-07-22T14:50:25.7109319Z PLAY [local] *******************************************************************
2026-07-22T14:50:25.7129871Z 
2026-07-22T14:50:25.7130254Z PLAY [Executar o Stop do Sirot Connector] **************************************
2026-07-22T14:50:25.7130733Z skipping: no hosts matched
2026-07-22T14:50:25.7136545Z 
2026-07-22T14:50:25.7136865Z PLAY [Configura TSM] ***********************************************************
2026-07-22T14:50:25.7163424Z 
2026-07-22T14:50:25.7163729Z PLAY [jboss] *******************************************************************
2026-07-22T14:50:25.7194340Z Wednesday 22 July 2026  11:50:25 -0300 (0:00:00.083)       0:00:53.531 ******** 
2026-07-22T14:50:25.7739063Z 
2026-07-22T14:50:25.7740962Z TASK [Cria variável build_repository_name] *************************************
2026-07-22T14:50:25.7742150Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:50:25.7761075Z Wednesday 22 July 2026  11:50:25 -0300 (0:00:00.056)       0:00:53.588 ******** 
2026-07-22T14:50:25.8296885Z 
2026-07-22T14:50:25.8297347Z TASK [Buscando diretorio de config] ********************************************
2026-07-22T14:50:25.8297552Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:50:25.8383504Z Wednesday 22 July 2026  11:50:25 -0300 (0:00:00.062)       0:00:53.650 ******** 
2026-07-22T14:50:26.1416984Z 
2026-07-22T14:50:26.1417989Z TASK [Verifica se o arquivo {{ item }}/etc/hosts-{{ sistema_ambiente }} existe] ***
2026-07-22T14:50:26.1418496Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r3618/a/_SIPBS-batch-relatorio-pagamentos-gepld-config)
2026-07-22T14:50:26.4212734Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r3618/a/_SIPBS-batch-relatorio-pagamentos-gepld-config/so)
2026-07-22T14:50:26.4228958Z Wednesday 22 July 2026  11:50:26 -0300 (0:00:00.584)       0:00:54.235 ******** 
2026-07-22T14:50:26.8329466Z 
2026-07-22T14:50:26.8329982Z TASK [Altera arquivo /etc/hosts] ***********************************************
2026-07-22T14:50:26.8331733Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => (item={u'item': u'/opt/ads-agent/_work/r3618/a/_SIPBS-batch-relatorio-pagamentos-gepld-config', u'stat': {u'charset': u'us-ascii', u'uid': 1000, u'exists': True, u'attr_flags': u'', u'woth': False, u'device_type': 0, u'mtime': 1784731732.779639, u'block_size': 4096, u'inode': 381906965, u'isgid': False, u'size': 59, u'wgrp': False, u'executable': False, u'isuid': False, u'readable': True, u'isreg': True, u'version': u'18446744073200936335', u'pw_name': u'sadscp01', u'gid': 1000, u'ischr': False, u'wusr': True, u'writeable': True, u'mimetype': u'text/plain', u'blocks': 8, u'xoth': False, u'islnk': False, u'nlink': 1, u'issock': False, u'rgrp': True, u'gr_name': u'sadscp01', u'path': u'/opt/ads-agent/_work/r3618/a/_SIPBS-batch-relatorio-pagamentos-gepld-config/etc/hosts-tqs', u'xusr': False, u'atime': 1784731732.779639, u'isdir': False, u'ctime': 1784731732.779639, u'isblk': False, u'checksum': u'fad615814c62f5b315bda313922f0408da944557', u'dev': 64771, u'roth': True, u'isfifo': False, u'mode': u'0644', u'xgrp': False, u'rusr': True, u'attributes': []}, u'ansible_loop_var': u'item', u'failed': False, u'invocation': {u'module_args': {u'follow': False, u'get_checksum': True, u'path': u'/opt/ads-agent/_work/r3618/a/_SIPBS-batch-relatorio-pagamentos-gepld-config/etc/hosts-tqs', u'checksum_algorithm': u'sha1', u'get_md5': False, u'get_mime': True, u'get_attributes': True}}, u'changed': False})
2026-07-22T14:50:26.8415350Z 
2026-07-22T14:50:26.8415888Z PLAY [Configura Control-M] *****************************************************
2026-07-22T14:50:26.8459829Z Wednesday 22 July 2026  11:50:26 -0300 (0:00:00.423)       0:00:54.658 ******** 
2026-07-22T14:50:27.6097106Z 
2026-07-22T14:50:27.6098078Z TASK [Gathering Facts] *********************************************************
2026-07-22T14:50:27.6098413Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:50:27.6288973Z Wednesday 22 July 2026  11:50:27 -0300 (0:00:00.782)       0:00:55.441 ******** 
2026-07-22T14:50:27.8954723Z 
2026-07-22T14:50:27.8955495Z TASK [stat] ********************************************************************
2026-07-22T14:50:27.8956131Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:50:27.9103964Z Wednesday 22 July 2026  11:50:27 -0300 (0:00:00.281)       0:00:55.722 ******** 
2026-07-22T14:50:27.9701251Z 
2026-07-22T14:50:27.9701760Z TASK [assert] ******************************************************************
2026-07-22T14:50:27.9701929Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:50:27.9702062Z     "changed": false, 
2026-07-22T14:50:27.9702191Z     "msg": "All assertions passed"
2026-07-22T14:50:27.9702684Z }
2026-07-22T14:50:27.9842594Z Wednesday 22 July 2026  11:50:27 -0300 (0:00:00.073)       0:00:55.796 ******** 
2026-07-22T14:50:28.0630585Z 
2026-07-22T14:50:28.0631522Z TASK [control_m : Cria variável ansible] ***************************************
2026-07-22T14:50:28.0631738Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:50:28.0782640Z Wednesday 22 July 2026  11:50:28 -0300 (0:00:00.093)       0:00:55.890 ******** 
2026-07-22T14:50:28.8291554Z 
2026-07-22T14:50:28.8292258Z TASK [control_m : Copiando arquivo de certificado] *****************************
2026-07-22T14:50:28.8292850Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:50:28.8430579Z Wednesday 22 July 2026  11:50:28 -0300 (0:00:00.764)       0:00:56.655 ******** 
2026-07-22T14:50:29.1049637Z 
2026-07-22T14:50:29.1050589Z TASK [control_m : Executando add-user.sh] **************************************
2026-07-22T14:50:29.1051185Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:50:29.1214055Z Wednesday 22 July 2026  11:50:29 -0300 (0:00:00.278)       0:00:56.933 ******** 
2026-07-22T14:50:29.5329212Z 
2026-07-22T14:50:29.5329918Z TASK [control_m : Removendo add-user.sh] ***************************************
2026-07-22T14:50:29.5330089Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:50:29.5449689Z Wednesday 22 July 2026  11:50:29 -0300 (0:00:00.423)       0:00:57.357 ******** 
2026-07-22T14:50:29.7955020Z 
2026-07-22T14:50:29.7955484Z TASK [control_m : Criacao diretorio /producao/carga] ***************************
2026-07-22T14:50:29.7955712Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:50:29.8096932Z Wednesday 22 July 2026  11:50:29 -0300 (0:00:00.264)       0:00:57.621 ******** 
2026-07-22T14:50:30.0869690Z 
2026-07-22T14:50:30.0870350Z TASK [control_m : Criacao diretorio /producao/suporte] *************************
2026-07-22T14:50:30.0870660Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:50:30.1017205Z Wednesday 22 July 2026  11:50:30 -0300 (0:00:00.291)       0:00:57.913 ******** 
2026-07-22T14:50:30.6412749Z 
2026-07-22T14:50:30.6413744Z TASK [control_m : Garante bash_profile] ****************************************
2026-07-22T14:50:30.6414371Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:50:30.6561709Z Wednesday 22 July 2026  11:50:30 -0300 (0:00:00.554)       0:00:58.468 ******** 
2026-07-22T14:50:30.9345992Z 
2026-07-22T14:50:30.9346777Z TASK [control_m : Cria Diretório de Scripts] ***********************************
2026-07-22T14:50:30.9346984Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:50:30.9492682Z Wednesday 22 July 2026  11:50:30 -0300 (0:00:00.293)       0:00:58.761 ******** 
2026-07-22T14:50:31.5100202Z 
2026-07-22T14:50:31.5101304Z TASK [control_m : Copia Scripts] ***********************************************
2026-07-22T14:50:31.5101763Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:50:31.5251225Z Wednesday 22 July 2026  11:50:31 -0300 (0:00:00.575)       0:00:59.337 ******** 
2026-07-22T14:50:31.7718899Z 
2026-07-22T14:50:31.7719712Z TASK [control_m : Verifica se o arquivo /producao//configuration/custom.sh existe] ***
2026-07-22T14:50:31.7720431Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:50:31.7862384Z Wednesday 22 July 2026  11:50:31 -0300 (0:00:00.261)       0:00:59.598 ******** 
2026-07-22T14:50:31.8429925Z Wednesday 22 July 2026  11:50:31 -0300 (0:00:00.056)       0:00:59.655 ******** 
2026-07-22T14:50:32.4488987Z 
2026-07-22T14:50:32.4489720Z TASK [control_m : Configuração Control-M] **************************************
2026-07-22T14:50:32.4490269Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:50:32.4625990Z Wednesday 22 July 2026  11:50:32 -0300 (0:00:00.619)       0:01:00.274 ******** 
2026-07-22T14:52:06.3415268Z 
2026-07-22T14:52:06.3415840Z TASK [control_m : Restart ControlM] ********************************************
2026-07-22T14:52:06.3416865Z fatal: [caddeapllx1572.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "msg": "Unable to restart service controlm_agent.service: Job for controlm_agent.service failed because a timeout was exceeded. See \"systemctl status controlm_agent.service\" and \"journalctl -xe\" for details.\n"}
2026-07-22T14:52:06.3422491Z 
2026-07-22T14:52:06.3423141Z PLAY RECAP *********************************************************************
2026-07-22T14:52:06.3424568Z caddeapllx1572.agil.nprd.caixa.gov.br : ok=75   changed=24   unreachable=0    failed=1    skipped=4    rescued=0    ignored=6   
2026-07-22T14:52:06.3424869Z 
2026-07-22T14:52:06.3425500Z Wednesday 22 July 2026  11:52:06 -0300 (0:01:33.880)       0:02:34.154 ******** 
2026-07-22T14:52:06.3425724Z =============================================================================== 
2026-07-22T14:52:06.3427924Z control_m : Restart ControlM ------------------------------------------- 93.88s
2026-07-22T14:52:06.3428344Z nfs : Networker | Restart networker ------------------------------------ 10.46s
2026-07-22T14:52:06.3428715Z nfs : Networker | Restart networker ------------------------------------ 10.45s
2026-07-22T14:52:06.3429336Z nfs : Networker | Restart networker ------------------------------------ 10.43s
2026-07-22T14:52:06.3429740Z nfs : execute montagem script ------------------------------------------- 5.53s
2026-07-22T14:52:06.3430097Z nfs : Instalando o NFS Client ------------------------------------------- 1.71s
2026-07-22T14:52:06.3430411Z nfs : Instalando o NFS Client ------------------------------------------- 1.06s
2026-07-22T14:52:06.3430750Z nfs : Instalando o NFS Client ------------------------------------------- 0.96s
2026-07-22T14:52:06.3431117Z nfs : Networker | Start networker --------------------------------------- 0.86s
2026-07-22T14:52:06.3431743Z Gathering Facts --------------------------------------------------------- 0.78s
2026-07-22T14:52:06.3432129Z control_m : Copiando arquivo de certificado ----------------------------- 0.76s
2026-07-22T14:52:06.3432491Z nfs : Install networker lgtoclnt_url ------------------------------------ 0.72s
2026-07-22T14:52:06.3432848Z nfs : Install networker lgtonmda_url ------------------------------------ 0.72s
2026-07-22T14:52:06.3433224Z nfs : Install networker lgtoclnt_url ------------------------------------ 0.72s
2026-07-22T14:52:06.3433584Z nfs : Install networker lgtoclnt_url ------------------------------------ 0.71s
2026-07-22T14:52:06.3433946Z nfs : Install networker lgtonmda_url ------------------------------------ 0.70s
2026-07-22T14:52:06.3434288Z nfs : Install networker lgtonmda_url ------------------------------------ 0.66s
2026-07-22T14:52:06.3434661Z control_m : Configuração Control-M -------------------------------------- 0.62s
2026-07-22T14:52:06.3435016Z Verifica se o arquivo {{ item }}/etc/hosts-{{ sistema_ambiente }} existe --- 0.58s
2026-07-22T14:52:06.3435650Z nfs : Networker | Start networker --------------------------------------- 0.58s
2026-07-22T14:52:06.3435872Z Playbook run took 0 days, 0 hours, 2 minutes, 34 seconds
2026-07-22T14:52:06.4012460Z ##[error]Bash exited with code '2'.
2026-07-22T14:52:06.4018411Z ##[warning]RetryHelper encountered task failure, will retry (attempt #: 1 out of 2) after 1000 ms
2026-07-22T14:52:07.4826216Z Generating script.
2026-07-22T14:52:07.4838366Z ========================== Starting Command Output ===========================
2026-07-22T14:52:07.4846683Z [command]/bin/bash /opt/ads-agent/_work/_temp/223e1bfb-3103-4cef-881a-6f49ea1c37c0.sh
2026-07-22T14:52:09.5181398Z 
2026-07-22T14:52:09.5182194Z PLAY [local] *******************************************************************
2026-07-22T14:52:09.5445645Z 
2026-07-22T14:52:09.5446123Z PLAY [Configurando o DNS] ******************************************************
2026-07-22T14:52:09.7467627Z 
2026-07-22T14:52:09.7468179Z PLAY [local] *******************************************************************
2026-07-22T14:52:09.7499240Z 
2026-07-22T14:52:09.7499945Z PLAY [Verificando serviços] ****************************************************
2026-07-22T14:52:09.7575633Z 
2026-07-22T14:52:09.7576339Z PLAY [Configuração LDAP] *******************************************************
2026-07-22T14:52:09.7604789Z [WARNING]: Found variable using reserved name: when
2026-07-22T14:52:09.7611510Z 
2026-07-22T14:52:09.7611756Z PLAY [jboss] *******************************************************************
2026-07-22T14:52:09.7692248Z 
2026-07-22T14:52:09.7692785Z PLAY [Stack Jboss] *************************************************************
2026-07-22T14:52:09.7718879Z 
2026-07-22T14:52:09.7719528Z PLAY [jboss] *******************************************************************
2026-07-22T14:52:09.7756247Z 
2026-07-22T14:52:09.7756651Z PLAY [jboss] *******************************************************************
2026-07-22T14:52:09.8017941Z Wednesday 22 July 2026  11:52:09 -0300 (0:00:00.345)       0:00:00.345 ******** 
2026-07-22T14:52:10.2599382Z 
2026-07-22T14:52:10.2600342Z TASK [Verifica se o arquivo nfs_config.json existe] ****************************
2026-07-22T14:52:10.2600605Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:52:10.2629355Z Wednesday 22 July 2026  11:52:10 -0300 (0:00:00.461)       0:00:00.806 ******** 
2026-07-22T14:52:10.3091331Z included: /opt/ads-agent/_work/r3618/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for caddeapllx1572.agil.nprd.caixa.gov.br
2026-07-22T14:52:10.3135572Z Wednesday 22 July 2026  11:52:10 -0300 (0:00:00.050)       0:00:00.857 ******** 
2026-07-22T14:52:10.3722418Z 
2026-07-22T14:52:10.3723094Z TASK [nfs : Criar variáveis] ***************************************************
2026-07-22T14:52:10.3723343Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:52:10.3763715Z Wednesday 22 July 2026  11:52:10 -0300 (0:00:00.062)       0:00:00.920 ******** 
2026-07-22T14:52:10.7850326Z 
2026-07-22T14:52:10.7851558Z TASK [nfs : Coletar variáveis de ambiente] *************************************
2026-07-22T14:52:10.7851818Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:52:10.7879223Z Wednesday 22 July 2026  11:52:10 -0300 (0:00:00.411)       0:00:01.331 ******** 
2026-07-22T14:52:10.8428390Z 
2026-07-22T14:52:10.8428927Z TASK [nfs : Exibir resultado em JSON] ******************************************
2026-07-22T14:52:10.8430059Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:52:10.8430737Z     "nfs_vars_json": {
2026-07-22T14:52:10.8430911Z         "changed": false, 
2026-07-22T14:52:10.8431237Z         "cmd": "cat /opt/ads-agent/_work/r3618/a/nfs_config.json", 
2026-07-22T14:52:10.8431408Z         "delta": "0:00:00.003328", 
2026-07-22T14:52:10.8434629Z         "end": "2026-07-22 11:52:10.770468", 
2026-07-22T14:52:10.8434771Z         "failed": false, 
2026-07-22T14:52:10.8435052Z         "rc": 0, 
2026-07-22T14:52:10.8435277Z         "start": "2026-07-22 11:52:10.767140", 
2026-07-22T14:52:10.8435706Z         "stderr": "", 
2026-07-22T14:52:10.8435835Z         "stderr_lines": [], 
2026-07-22T14:52:10.8436134Z         "stdout": "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS\",\"NFS_MOUNT_POINT_ISILON\": \"/sipbs\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW\",\"NFS_MOUNT_POINT_ISILON_3\": \"/sipbs_fgw\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL\",\"NFS_MOUNT_POINT_ISILON_2\": \"/b2b\"}]", 
2026-07-22T14:52:10.8436581Z         "stdout_lines": [
2026-07-22T14:52:10.8436883Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS\",\"NFS_MOUNT_POINT_ISILON\": \"/sipbs\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW\",\"NFS_MOUNT_POINT_ISILON_3\": \"/sipbs_fgw\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL\",\"NFS_MOUNT_POINT_ISILON_2\": \"/b2b\"}]"
2026-07-22T14:52:10.8437245Z         ]
2026-07-22T14:52:10.8437418Z     }
2026-07-22T14:52:10.8437517Z }
2026-07-22T14:52:10.8454840Z Wednesday 22 July 2026  11:52:10 -0300 (0:00:00.057)       0:00:01.389 ******** 
2026-07-22T14:52:10.9030839Z 
2026-07-22T14:52:10.9031650Z TASK [nfs : Criar variáveis] ***************************************************
2026-07-22T14:52:10.9031826Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:52:10.9066033Z Wednesday 22 July 2026  11:52:10 -0300 (0:00:00.061)       0:00:01.450 ******** 
2026-07-22T14:52:18.6997265Z 
2026-07-22T14:52:18.6998049Z TASK [nfs : execute montagem script] *******************************************
2026-07-22T14:52:18.6998281Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:52:18.7013723Z Wednesday 22 July 2026  11:52:18 -0300 (0:00:07.794)       0:00:09.245 ******** 
2026-07-22T14:52:18.7619695Z 
2026-07-22T14:52:18.7620236Z TASK [nfs : ansible.builtin.debug] *********************************************
2026-07-22T14:52:18.7622894Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:52:18.7623197Z     "changed": false, 
2026-07-22T14:52:18.7623747Z     "msg": {
2026-07-22T14:52:18.7623910Z         "changed": true, 
2026-07-22T14:52:18.7624023Z         "cmd": [
2026-07-22T14:52:18.7624133Z             "python", 
2026-07-22T14:52:18.7624459Z             "/opt/ads-agent/_work/r3618/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py", 
2026-07-22T14:52:18.7624616Z             "montagem", 
2026-07-22T14:52:18.7624762Z             "sipbs-batch", 
2026-07-22T14:52:18.7624868Z             "tqs", 
2026-07-22T14:52:18.7625258Z             "ctc_nprd", 
2026-07-22T14:52:18.7625465Z             "/opt/ads-agent/_work/r3618/a/esteira-jboss-vm-v2", 
2026-07-22T14:52:18.7625657Z             "C&t@d02", 
2026-07-22T14:52:18.7625854Z             "***", 
2026-07-22T14:52:18.7625973Z             "s736651@corp.caixa.gov.br", 
2026-07-22T14:52:18.7626105Z             "***", 
2026-07-22T14:52:18.7626500Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS\",\"NFS_MOUNT_POINT_ISILON\": \"/sipbs\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW\",\"NFS_MOUNT_POINT_ISILON_3\": \"/sipbs_fgw\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL\",\"NFS_MOUNT_POINT_ISILON_2\": \"/b2b\"}]"
2026-07-22T14:52:18.7626796Z         ], 
2026-07-22T14:52:18.7626933Z         "delta": "0:00:07.476326", 
2026-07-22T14:52:18.7627121Z         "end": "2026-07-22 11:52:18.681895", 
2026-07-22T14:52:18.7627245Z         "failed": false, 
2026-07-22T14:52:18.7627353Z         "rc": 0, 
2026-07-22T14:52:18.7627511Z         "start": "2026-07-22 11:52:11.205569", 
2026-07-22T14:52:18.7627636Z         "stderr": "", 
2026-07-22T14:52:18.7627745Z         "stderr_lines": [], 
2026-07-22T14:52:18.7629827Z         "stdout": "[{u'NFS_MOUNT_POINT_ISILON': u'/sipbs', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS'}, {u'NFS_MOUNT_POINT_ISILON_3': u'/sipbs_fgw', u'NFS_ENDPOINT_ISILON_3': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW'}, {u'NFS_MOUNT_POINT_ISILON_2': u'/b2b', u'NFS_ENDPOINT_ISILON_2': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL'}]\nNome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           \n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS /sipbs                              ISILON                              nfsctcnprd.ctc.caixa                tqs                                \nnfs_path=/sipbs\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS /sipbs                              ISILON                              nfsctcnprd.ctc.caixa                tqs                                \nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL /b2b                                ISILON                              nfsctcnprd.ctc.caixa                tqs                                \nnfs_path=/b2b\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL /b2b                                ISILON                              nfsctcnprd.ctc.caixa                tqs                                \nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW /sipbs_fgw                          ISILON                              nfsctcnprd.ctc.caixa                tqs                                \nnfs_path=/sipbs_fgw\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW /sipbs_fgw                          ISILON                              nfsctcnprd.ctc.caixa                tqs                                ", 
2026-07-22T14:52:18.7631245Z         "stdout_lines": [
2026-07-22T14:52:18.7632560Z             "[{u'NFS_MOUNT_POINT_ISILON': u'/sipbs', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS'}, {u'NFS_MOUNT_POINT_ISILON_3': u'/sipbs_fgw', u'NFS_ENDPOINT_ISILON_3': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW'}, {u'NFS_MOUNT_POINT_ISILON_2': u'/b2b', u'NFS_ENDPOINT_ISILON_2': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL'}]", 
2026-07-22T14:52:18.7632894Z             "Nome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           ", 
2026-07-22T14:52:18.7633311Z             "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------", 
2026-07-22T14:52:18.7633559Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS /sipbs                              ISILON                              nfsctcnprd.ctc.caixa                tqs                                ", 
2026-07-22T14:52:18.7633772Z             "nfs_path=/sipbs", 
2026-07-22T14:52:18.7633965Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS", 
2026-07-22T14:52:18.7634158Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS /sipbs                              ISILON                              nfsctcnprd.ctc.caixa                tqs                                ", 
2026-07-22T14:52:18.7634405Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL /b2b                                ISILON                              nfsctcnprd.ctc.caixa                tqs                                ", 
2026-07-22T14:52:18.7634607Z             "nfs_path=/b2b", 
2026-07-22T14:52:18.7634750Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL", 
2026-07-22T14:52:18.7634933Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL /b2b                                ISILON                              nfsctcnprd.ctc.caixa                tqs                                ", 
2026-07-22T14:52:18.7635194Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW /sipbs_fgw                          ISILON                              nfsctcnprd.ctc.caixa                tqs                                ", 
2026-07-22T14:52:18.7635357Z             "nfs_path=/sipbs_fgw", 
2026-07-22T14:52:18.7635503Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW", 
2026-07-22T14:52:18.7635745Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW /sipbs_fgw                          ISILON                              nfsctcnprd.ctc.caixa                tqs                                "
2026-07-22T14:52:18.7635901Z         ]
2026-07-22T14:52:18.7635994Z     }
2026-07-22T14:52:18.7636085Z }
2026-07-22T14:52:18.7647786Z Wednesday 22 July 2026  11:52:18 -0300 (0:00:00.063)       0:00:09.308 ******** 
2026-07-22T14:52:19.1110708Z 
2026-07-22T14:52:19.1111339Z TASK [nfs : execute clean json] ************************************************
2026-07-22T14:52:19.1111539Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:52:19.1146852Z Wednesday 22 July 2026  11:52:19 -0300 (0:00:00.349)       0:00:09.658 ******** 
2026-07-22T14:52:19.1716465Z 
2026-07-22T14:52:19.1716955Z TASK [nfs : result_new_string_json] ********************************************
2026-07-22T14:52:19.1718956Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:52:19.1719326Z     "msg": {
2026-07-22T14:52:19.1719556Z         "ansible_facts": {
2026-07-22T14:52:19.1719684Z             "discovered_interpreter_python": "/usr/bin/python"
2026-07-22T14:52:19.1719812Z         }, 
2026-07-22T14:52:19.1719925Z         "changed": true, 
2026-07-22T14:52:19.1720872Z         "cmd": "echo '[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS\",\"NFS_MOUNT_POINT_ISILON\": \"/sipbs\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW\",\"NFS_MOUNT_POINT_ISILON_3\": \"/sipbs_fgw\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL\",\"NFS_MOUNT_POINT_ISILON_2\": \"/b2b\"}]' | sed 's/NFS_ENDPOINT_ISILON[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_ISILON[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_HUAWEI[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_HUAWEI[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_VM[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_VM[^\"]*/NFS_MOUNT_POINT/g'", 
2026-07-22T14:52:19.1721552Z         "delta": "0:00:00.009106", 
2026-07-22T14:52:19.1721767Z         "end": "2026-07-22 11:52:19.095797", 
2026-07-22T14:52:19.1721897Z         "failed": false, 
2026-07-22T14:52:19.1722004Z         "rc": 0, 
2026-07-22T14:52:19.1722176Z         "start": "2026-07-22 11:52:19.086691", 
2026-07-22T14:52:19.1722294Z         "stderr": "", 
2026-07-22T14:52:19.1722407Z         "stderr_lines": [], 
2026-07-22T14:52:19.1722682Z         "stdout": "[{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS\",\"NFS_MOUNT_POINT\": \"/sipbs\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW\",\"NFS_MOUNT_POINT\": \"/sipbs_fgw\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL\",\"NFS_MOUNT_POINT\": \"/b2b\"}]", 
2026-07-22T14:52:19.1723131Z         "stdout_lines": [
2026-07-22T14:52:19.1723390Z             "[{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS\",\"NFS_MOUNT_POINT\": \"/sipbs\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW\",\"NFS_MOUNT_POINT\": \"/sipbs_fgw\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL\",\"NFS_MOUNT_POINT\": \"/b2b\"}]"
2026-07-22T14:52:19.1723644Z         ]
2026-07-22T14:52:19.1723730Z     }
2026-07-22T14:52:19.1723822Z }
2026-07-22T14:52:19.1743112Z Wednesday 22 July 2026  11:52:19 -0300 (0:00:00.059)       0:00:09.718 ******** 
2026-07-22T14:52:19.2311119Z 
2026-07-22T14:52:19.2312161Z TASK [nfs : Parse JSON data] ***************************************************
2026-07-22T14:52:19.2312484Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:52:19.2335568Z Wednesday 22 July 2026  11:52:19 -0300 (0:00:00.059)       0:00:09.777 ******** 
2026-07-22T14:52:19.2916035Z 
2026-07-22T14:52:19.2917147Z TASK [nfs : result_new_json] ***************************************************
2026-07-22T14:52:19.2918470Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:52:19.2919104Z     "msg": [
2026-07-22T14:52:19.2919282Z         {
2026-07-22T14:52:19.2919428Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS", 
2026-07-22T14:52:19.2919590Z             "NFS_MOUNT_POINT": "/sipbs"
2026-07-22T14:52:19.2919702Z         }, 
2026-07-22T14:52:19.2919800Z         {
2026-07-22T14:52:19.2919942Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW", 
2026-07-22T14:52:19.2921189Z             "NFS_MOUNT_POINT": "/sipbs_fgw"
2026-07-22T14:52:19.2921398Z         }, 
2026-07-22T14:52:19.2921498Z         {
2026-07-22T14:52:19.2921639Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL", 
2026-07-22T14:52:19.2921809Z             "NFS_MOUNT_POINT": "/b2b"
2026-07-22T14:52:19.2921922Z         }
2026-07-22T14:52:19.2922017Z     ]
2026-07-22T14:52:19.2922111Z }
2026-07-22T14:52:19.2942184Z Wednesday 22 July 2026  11:52:19 -0300 (0:00:00.060)       0:00:09.838 ******** 
2026-07-22T14:52:19.3657118Z included: /opt/ads-agent/_work/r3618/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx1572.agil.nprd.caixa.gov.br
2026-07-22T14:52:19.3737301Z included: /opt/ads-agent/_work/r3618/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx1572.agil.nprd.caixa.gov.br
2026-07-22T14:52:19.3812580Z included: /opt/ads-agent/_work/r3618/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx1572.agil.nprd.caixa.gov.br
2026-07-22T14:52:19.3871820Z Wednesday 22 July 2026  11:52:19 -0300 (0:00:00.092)       0:00:09.930 ******** 
2026-07-22T14:52:19.4444486Z 
2026-07-22T14:52:19.4445376Z TASK [nfs : Parse JSON data] ***************************************************
2026-07-22T14:52:19.4446130Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:52:19.4472642Z Wednesday 22 July 2026  11:52:19 -0300 (0:00:00.060)       0:00:09.990 ******** 
2026-07-22T14:52:19.5024722Z 
2026-07-22T14:52:19.5025368Z TASK [nfs : debug] *************************************************************
2026-07-22T14:52:19.5025596Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:52:19.5025772Z     "msg": {
2026-07-22T14:52:19.5025967Z         "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS", 
2026-07-22T14:52:19.5027230Z         "NFS_MOUNT_POINT": "/sipbs"
2026-07-22T14:52:19.5028739Z     }
2026-07-22T14:52:19.5030199Z }
2026-07-22T14:52:19.5051093Z Wednesday 22 July 2026  11:52:19 -0300 (0:00:00.057)       0:00:10.048 ******** 
2026-07-22T14:52:19.5599295Z 
2026-07-22T14:52:19.5600042Z TASK [nfs : debug] *************************************************************
2026-07-22T14:52:19.5611175Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:52:19.5611766Z     "msg": "/sipbs"
2026-07-22T14:52:19.5612363Z }
2026-07-22T14:52:19.5637310Z Wednesday 22 July 2026  11:52:19 -0300 (0:00:00.058)       0:00:10.107 ******** 
2026-07-22T14:52:19.6173895Z 
2026-07-22T14:52:19.6174694Z TASK [nfs : debug] *************************************************************
2026-07-22T14:52:19.6175381Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:52:19.6175618Z     "msg": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS"
2026-07-22T14:52:19.6175751Z }
2026-07-22T14:52:19.6202943Z Wednesday 22 July 2026  11:52:19 -0300 (0:00:00.056)       0:00:10.164 ******** 
2026-07-22T14:52:19.6778851Z 
2026-07-22T14:52:19.6779412Z TASK [nfs : Verificando as variaveis] ******************************************
2026-07-22T14:52:19.6779880Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:52:19.6780015Z     "changed": false, 
2026-07-22T14:52:19.6780136Z     "msg": "All assertions passed"
2026-07-22T14:52:19.6780246Z }
2026-07-22T14:52:19.6806750Z Wednesday 22 July 2026  11:52:19 -0300 (0:00:00.060)       0:00:10.224 ******** 
2026-07-22T14:52:21.4190904Z 
2026-07-22T14:52:21.4193029Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-07-22T14:52:21.4193200Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:52:21.4194747Z Wednesday 22 July 2026  11:52:21 -0300 (0:00:01.738)       0:00:11.963 ******** 
2026-07-22T14:52:22.1294221Z 
2026-07-22T14:52:22.1294775Z TASK [nfs : Install networker lgtoclnt_url] ************************************
2026-07-22T14:52:22.1294976Z [WARNING]: Consider using the yum, dnf or zypper module rather than running
2026-07-22T14:52:22.1295327Z 'rpm'.  If you need to use command because yum, dnf or zypper is insufficient
2026-07-22T14:52:22.1295578Z you can add 'warn: false' to this command task or set 'command_warnings=False'
2026-07-22T14:52:22.1295729Z in ansible.cfg to get rid of this message.
2026-07-22T14:52:22.1302930Z fatal: [caddeapllx1572.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.463316", "end": "2026-07-22 11:52:22.115905", "msg": "non-zero return code", "rc": 1, "start": "2026-07-22 11:52:21.652589", "stderr": "aviso: /var/tmp/rpm-tmp.BSH9zG: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.BSH9zG: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm", "Preparando...                         ########################################"]}
2026-07-22T14:52:22.1303585Z ...ignoring
2026-07-22T14:52:22.1323306Z Wednesday 22 July 2026  11:52:22 -0300 (0:00:00.712)       0:00:12.676 ******** 
2026-07-22T14:52:22.8411252Z 
2026-07-22T14:52:22.8412078Z TASK [nfs : Install networker lgtonmda_url] ************************************
2026-07-22T14:52:22.8418209Z fatal: [caddeapllx1572.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.467573", "end": "2026-07-22 11:52:22.827097", "msg": "non-zero return code", "rc": 1, "start": "2026-07-22 11:52:22.359524", "stderr": "aviso: /var/tmp/rpm-tmp.P7D6Dm: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.P7D6Dm: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm", "Preparando...                         ########################################"]}
2026-07-22T14:52:22.8419062Z ...ignoring
2026-07-22T14:52:22.8443009Z Wednesday 22 July 2026  11:52:22 -0300 (0:00:00.711)       0:00:13.388 ******** 
2026-07-22T14:52:23.2517156Z 
2026-07-22T14:52:23.2518338Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-07-22T14:52:23.2518907Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:52:23.2545786Z Wednesday 22 July 2026  11:52:23 -0300 (0:00:00.410)       0:00:13.798 ******** 
2026-07-22T14:52:23.5090555Z 
2026-07-22T14:52:23.5091342Z TASK [nfs : Create a symbolic link] ********************************************
2026-07-22T14:52:23.5091517Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:52:23.5119101Z Wednesday 22 July 2026  11:52:23 -0300 (0:00:00.257)       0:00:14.055 ******** 
2026-07-22T14:52:24.3667665Z 
2026-07-22T14:52:24.3668303Z TASK [nfs : Networker | Start networker] ***************************************
2026-07-22T14:52:24.3668590Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:52:24.3700462Z Wednesday 22 July 2026  11:52:24 -0300 (0:00:00.858)       0:00:14.913 ******** 
2026-07-22T14:52:24.6278130Z 
2026-07-22T14:52:24.6278958Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-07-22T14:52:24.6279290Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:52:24.6306551Z Wednesday 22 July 2026  11:52:24 -0300 (0:00:00.260)       0:00:15.174 ******** 
2026-07-22T14:52:35.0587750Z 
2026-07-22T14:52:35.0588257Z TASK [nfs : Networker | Restart networker] *************************************
2026-07-22T14:52:35.0588447Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:52:35.0606080Z Wednesday 22 July 2026  11:52:35 -0300 (0:00:10.429)       0:00:25.604 ******** 
2026-07-22T14:52:35.4921383Z 
2026-07-22T14:52:35.4921887Z TASK [nfs : Montando volume remoto] ********************************************
2026-07-22T14:52:35.4923069Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:52:35.4948581Z Wednesday 22 July 2026  11:52:35 -0300 (0:00:00.434)       0:00:26.038 ******** 
2026-07-22T14:52:35.5379138Z Wednesday 22 July 2026  11:52:35 -0300 (0:00:00.042)       0:00:26.081 ******** 
2026-07-22T14:52:35.5913523Z 
2026-07-22T14:52:35.5914357Z TASK [nfs : Parse JSON data] ***************************************************
2026-07-22T14:52:35.5914891Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:52:35.5947139Z Wednesday 22 July 2026  11:52:35 -0300 (0:00:00.057)       0:00:26.138 ******** 
2026-07-22T14:52:35.6497971Z 
2026-07-22T14:52:35.6498891Z TASK [nfs : debug] *************************************************************
2026-07-22T14:52:35.6499229Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:52:35.6499503Z     "msg": {
2026-07-22T14:52:35.6500026Z         "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW", 
2026-07-22T14:52:35.6500262Z         "NFS_MOUNT_POINT": "/sipbs_fgw"
2026-07-22T14:52:35.6500379Z     }
2026-07-22T14:52:35.6500478Z }
2026-07-22T14:52:35.6517429Z Wednesday 22 July 2026  11:52:35 -0300 (0:00:00.056)       0:00:26.195 ******** 
2026-07-22T14:52:35.7064448Z 
2026-07-22T14:52:35.7065179Z TASK [nfs : debug] *************************************************************
2026-07-22T14:52:35.7065913Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:52:35.7066100Z     "msg": "/sipbs_fgw"
2026-07-22T14:52:35.7066207Z }
2026-07-22T14:52:35.7088821Z Wednesday 22 July 2026  11:52:35 -0300 (0:00:00.057)       0:00:26.252 ******** 
2026-07-22T14:52:35.7623547Z 
2026-07-22T14:52:35.7624129Z TASK [nfs : debug] *************************************************************
2026-07-22T14:52:35.7624299Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:52:35.7624764Z     "msg": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW"
2026-07-22T14:52:35.7624898Z }
2026-07-22T14:52:35.7647541Z Wednesday 22 July 2026  11:52:35 -0300 (0:00:00.055)       0:00:26.308 ******** 
2026-07-22T14:52:35.8205440Z 
2026-07-22T14:52:35.8206352Z TASK [nfs : Verificando as variaveis] ******************************************
2026-07-22T14:52:35.8207440Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:52:35.8207709Z     "changed": false, 
2026-07-22T14:52:35.8207836Z     "msg": "All assertions passed"
2026-07-22T14:52:35.8207953Z }
2026-07-22T14:52:35.8231566Z Wednesday 22 July 2026  11:52:35 -0300 (0:00:00.058)       0:00:26.367 ******** 
2026-07-22T14:52:36.8385904Z 
2026-07-22T14:52:36.8386821Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-07-22T14:52:36.8387600Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:52:36.8412688Z Wednesday 22 July 2026  11:52:36 -0300 (0:00:01.018)       0:00:27.385 ******** 
2026-07-22T14:52:37.5706959Z 
2026-07-22T14:52:37.5707885Z TASK [nfs : Install networker lgtoclnt_url] ************************************
2026-07-22T14:52:37.5712441Z fatal: [caddeapllx1572.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.490170", "end": "2026-07-22 11:52:37.557108", "msg": "non-zero return code", "rc": 1, "start": "2026-07-22 11:52:37.066938", "stderr": "aviso: /var/tmp/rpm-tmp.QJEuUD: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.QJEuUD: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm", "Preparando...                         ########################################"]}
2026-07-22T14:52:37.5713264Z ...ignoring
2026-07-22T14:52:37.5738955Z Wednesday 22 July 2026  11:52:37 -0300 (0:00:00.732)       0:00:28.117 ******** 
2026-07-22T14:52:38.2396586Z 
2026-07-22T14:52:38.2397467Z TASK [nfs : Install networker lgtonmda_url] ************************************
2026-07-22T14:52:38.2398934Z fatal: [caddeapllx1572.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.422884", "end": "2026-07-22 11:52:38.224978", "msg": "non-zero return code", "rc": 1, "start": "2026-07-22 11:52:37.802094", "stderr": "aviso: /var/tmp/rpm-tmp.PtcOPz: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.PtcOPz: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm", "Preparando...                         ########################################"]}
2026-07-22T14:52:38.2399502Z ...ignoring
2026-07-22T14:52:38.2419750Z Wednesday 22 July 2026  11:52:38 -0300 (0:00:00.667)       0:00:28.785 ******** 
2026-07-22T14:52:38.4954141Z 
2026-07-22T14:52:38.4955100Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-07-22T14:52:38.4956169Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:52:38.4980877Z Wednesday 22 July 2026  11:52:38 -0300 (0:00:00.256)       0:00:29.041 ******** 
2026-07-22T14:52:38.7565311Z 
2026-07-22T14:52:38.7566155Z TASK [nfs : Create a symbolic link] ********************************************
2026-07-22T14:52:38.7566626Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:52:38.7591323Z Wednesday 22 July 2026  11:52:38 -0300 (0:00:00.261)       0:00:29.302 ******** 
2026-07-22T14:52:39.3225397Z 
2026-07-22T14:52:39.3225912Z TASK [nfs : Networker | Start networker] ***************************************
2026-07-22T14:52:39.3226107Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:52:39.3257903Z Wednesday 22 July 2026  11:52:39 -0300 (0:00:00.566)       0:00:29.869 ******** 
2026-07-22T14:52:39.6068803Z 
2026-07-22T14:52:39.6069744Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-07-22T14:52:39.6070097Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:52:39.6095189Z Wednesday 22 July 2026  11:52:39 -0300 (0:00:00.283)       0:00:30.153 ******** 
2026-07-22T14:52:50.0446458Z 
2026-07-22T14:52:50.0447355Z TASK [nfs : Networker | Restart networker] *************************************
2026-07-22T14:52:50.0447594Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:52:50.0473243Z Wednesday 22 July 2026  11:52:50 -0300 (0:00:10.437)       0:00:40.591 ******** 
2026-07-22T14:52:50.3026461Z 
2026-07-22T14:52:50.3027408Z TASK [nfs : Montando volume remoto] ********************************************
2026-07-22T14:52:50.3027715Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:52:50.3041097Z Wednesday 22 July 2026  11:52:50 -0300 (0:00:00.256)       0:00:40.847 ******** 
2026-07-22T14:52:50.3461022Z Wednesday 22 July 2026  11:52:50 -0300 (0:00:00.041)       0:00:40.889 ******** 
2026-07-22T14:52:50.4004620Z 
2026-07-22T14:52:50.4005140Z TASK [nfs : Parse JSON data] ***************************************************
2026-07-22T14:52:50.4005326Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:52:50.4028027Z Wednesday 22 July 2026  11:52:50 -0300 (0:00:00.056)       0:00:40.946 ******** 
2026-07-22T14:52:50.4582729Z 
2026-07-22T14:52:50.4583271Z TASK [nfs : debug] *************************************************************
2026-07-22T14:52:50.4583449Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:52:50.4584651Z     "msg": {
2026-07-22T14:52:50.4585892Z         "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL", 
2026-07-22T14:52:50.4587223Z         "NFS_MOUNT_POINT": "/b2b"
2026-07-22T14:52:50.4588335Z     }
2026-07-22T14:52:50.4588659Z }
2026-07-22T14:52:50.4608127Z Wednesday 22 July 2026  11:52:50 -0300 (0:00:00.057)       0:00:41.004 ******** 
2026-07-22T14:52:50.5141736Z 
2026-07-22T14:52:50.5142639Z TASK [nfs : debug] *************************************************************
2026-07-22T14:52:50.5142878Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:52:50.5143025Z     "msg": "/b2b"
2026-07-22T14:52:50.5143884Z }
2026-07-22T14:52:50.5168518Z Wednesday 22 July 2026  11:52:50 -0300 (0:00:00.056)       0:00:41.060 ******** 
2026-07-22T14:52:50.5705717Z 
2026-07-22T14:52:50.5706237Z TASK [nfs : debug] *************************************************************
2026-07-22T14:52:50.5706929Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:52:50.5707176Z     "msg": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL"
2026-07-22T14:52:50.5707309Z }
2026-07-22T14:52:50.5741276Z Wednesday 22 July 2026  11:52:50 -0300 (0:00:00.057)       0:00:41.117 ******** 
2026-07-22T14:52:50.6309730Z 
2026-07-22T14:52:50.6310245Z TASK [nfs : Verificando as variaveis] ******************************************
2026-07-22T14:52:50.6312070Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:52:50.6312383Z     "changed": false, 
2026-07-22T14:52:50.6312514Z     "msg": "All assertions passed"
2026-07-22T14:52:50.6312669Z }
2026-07-22T14:52:50.6337623Z Wednesday 22 July 2026  11:52:50 -0300 (0:00:00.059)       0:00:41.177 ******** 
2026-07-22T14:52:51.5741108Z 
2026-07-22T14:52:51.5741771Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-07-22T14:52:51.5742404Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:52:51.5759479Z Wednesday 22 July 2026  11:52:51 -0300 (0:00:00.942)       0:00:42.119 ******** 
2026-07-22T14:52:52.2803795Z 
2026-07-22T14:52:52.2804497Z TASK [nfs : Install networker lgtoclnt_url] ************************************
2026-07-22T14:52:52.2808959Z fatal: [caddeapllx1572.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.458894", "end": "2026-07-22 11:52:52.265830", "msg": "non-zero return code", "rc": 1, "start": "2026-07-22 11:52:51.806936", "stderr": "aviso: /var/tmp/rpm-tmp.oo2A09: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.oo2A09: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm", "Preparando...                         ########################################"]}
2026-07-22T14:52:52.2809973Z ...ignoring
2026-07-22T14:52:52.2835113Z Wednesday 22 July 2026  11:52:52 -0300 (0:00:00.707)       0:00:42.827 ******** 
2026-07-22T14:52:52.9583614Z 
2026-07-22T14:52:52.9584329Z TASK [nfs : Install networker lgtonmda_url] ************************************
2026-07-22T14:52:52.9588430Z fatal: [caddeapllx1572.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.415901", "end": "2026-07-22 11:52:52.944570", "msg": "non-zero return code", "rc": 1, "start": "2026-07-22 11:52:52.528669", "stderr": "aviso: /var/tmp/rpm-tmp.L2ZsDP: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.L2ZsDP: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm", "Preparando...                         ########################################"]}
2026-07-22T14:52:52.9589192Z ...ignoring
2026-07-22T14:52:52.9616578Z Wednesday 22 July 2026  11:52:52 -0300 (0:00:00.678)       0:00:43.505 ******** 
2026-07-22T14:52:53.2161061Z 
2026-07-22T14:52:53.2162097Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-07-22T14:52:53.2162354Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:52:53.2189912Z Wednesday 22 July 2026  11:52:53 -0300 (0:00:00.257)       0:00:43.762 ******** 
2026-07-22T14:52:53.4710807Z 
2026-07-22T14:52:53.4711555Z TASK [nfs : Create a symbolic link] ********************************************
2026-07-22T14:52:53.4711958Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:52:53.4739741Z Wednesday 22 July 2026  11:52:53 -0300 (0:00:00.254)       0:00:44.017 ******** 
2026-07-22T14:52:54.0408896Z 
2026-07-22T14:52:54.0409437Z TASK [nfs : Networker | Start networker] ***************************************
2026-07-22T14:52:54.0409608Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:52:54.0441848Z Wednesday 22 July 2026  11:52:54 -0300 (0:00:00.570)       0:00:44.588 ******** 
2026-07-22T14:52:54.3076773Z 
2026-07-22T14:52:54.3077388Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-07-22T14:52:54.3077620Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:52:54.3103802Z Wednesday 22 July 2026  11:52:54 -0300 (0:00:00.266)       0:00:44.854 ******** 
2026-07-22T14:53:04.7480925Z 
2026-07-22T14:53:04.7481834Z TASK [nfs : Networker | Restart networker] *************************************
2026-07-22T14:53:04.7482186Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:53:04.7523028Z Wednesday 22 July 2026  11:53:04 -0300 (0:00:10.441)       0:00:55.296 ******** 
2026-07-22T14:53:05.0540991Z 
2026-07-22T14:53:05.0541676Z TASK [nfs : Montando volume remoto] ********************************************
2026-07-22T14:53:05.0542217Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:53:05.0573553Z Wednesday 22 July 2026  11:53:05 -0300 (0:00:00.305)       0:00:55.601 ******** 
2026-07-22T14:53:05.0991237Z 
2026-07-22T14:53:05.0991955Z PLAY [jboss] *******************************************************************
2026-07-22T14:53:05.1016433Z 
2026-07-22T14:53:05.1017430Z PLAY [Copiando deployments adicionais] *****************************************
2026-07-22T14:53:05.1043427Z 
2026-07-22T14:53:05.1043763Z PLAY [Copiando modules adicionais] *********************************************
2026-07-22T14:53:05.1069051Z 
2026-07-22T14:53:05.1069735Z PLAY [jboss] *******************************************************************
2026-07-22T14:53:05.1105362Z 
2026-07-22T14:53:05.1105896Z PLAY [jboss] *******************************************************************
2026-07-22T14:53:05.1130650Z 
2026-07-22T14:53:05.1131108Z PLAY [jboss] *******************************************************************
2026-07-22T14:53:05.1161472Z 
2026-07-22T14:53:05.1161799Z PLAY [jboss] *******************************************************************
2026-07-22T14:53:05.1185674Z 
2026-07-22T14:53:05.1185916Z PLAY [jboss] *******************************************************************
2026-07-22T14:53:05.1211144Z 
2026-07-22T14:53:05.1211697Z PLAY [local] *******************************************************************
2026-07-22T14:53:05.1238033Z [WARNING]: Could not match supplied host pattern, ignoring: instance_restart
2026-07-22T14:53:05.1240811Z 
2026-07-22T14:53:05.1241166Z PLAY [instance_restart] ********************************************************
2026-07-22T14:53:05.1241552Z skipping: no hosts matched
2026-07-22T14:53:05.1243292Z [WARNING]: Could not match supplied host pattern, ignoring: machine_reboot
2026-07-22T14:53:05.1245801Z 
2026-07-22T14:53:05.1246100Z PLAY [machine_reboot] **********************************************************
2026-07-22T14:53:05.1246371Z skipping: no hosts matched
2026-07-22T14:53:05.1252426Z 
2026-07-22T14:53:05.1252660Z PLAY [local] *******************************************************************
2026-07-22T14:53:05.1278144Z [WARNING]: Could not match supplied host pattern, ignoring: instance_stop
2026-07-22T14:53:05.1280648Z 
2026-07-22T14:53:05.1280890Z PLAY [instance_stop] ***********************************************************
2026-07-22T14:53:05.1281147Z skipping: no hosts matched
2026-07-22T14:53:05.1284108Z 
2026-07-22T14:53:05.1284400Z PLAY [machine_reboot] **********************************************************
2026-07-22T14:53:05.1284557Z skipping: no hosts matched
2026-07-22T14:53:05.1290052Z 
2026-07-22T14:53:05.1290285Z PLAY [local] *******************************************************************
2026-07-22T14:53:05.1311297Z [WARNING]: Could not match supplied host pattern, ignoring: escopo_execucao
2026-07-22T14:53:05.1314356Z 
2026-07-22T14:53:05.1314665Z PLAY [Executar o Start do Sirot Connector no escopo definido] ******************
2026-07-22T14:53:05.1314815Z skipping: no hosts matched
2026-07-22T14:53:05.1326958Z 
2026-07-22T14:53:05.1327197Z PLAY [local] *******************************************************************
2026-07-22T14:53:05.1351013Z 
2026-07-22T14:53:05.1351265Z PLAY [Executar o Stop do Sirot Connector] **************************************
2026-07-22T14:53:05.1351423Z skipping: no hosts matched
2026-07-22T14:53:05.1358035Z 
2026-07-22T14:53:05.1358671Z PLAY [Configura TSM] ***********************************************************
2026-07-22T14:53:05.1387217Z 
2026-07-22T14:53:05.1387689Z PLAY [jboss] *******************************************************************
2026-07-22T14:53:05.1417758Z Wednesday 22 July 2026  11:53:05 -0300 (0:00:00.084)       0:00:55.685 ******** 
2026-07-22T14:53:05.1974701Z 
2026-07-22T14:53:05.1975671Z TASK [Cria variável build_repository_name] *************************************
2026-07-22T14:53:05.1976056Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:53:05.1997746Z Wednesday 22 July 2026  11:53:05 -0300 (0:00:00.058)       0:00:55.743 ******** 
2026-07-22T14:53:05.2548642Z 
2026-07-22T14:53:05.2549388Z TASK [Buscando diretorio de config] ********************************************
2026-07-22T14:53:05.2549811Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:53:05.2634075Z Wednesday 22 July 2026  11:53:05 -0300 (0:00:00.063)       0:00:55.807 ******** 
2026-07-22T14:53:05.5939022Z 
2026-07-22T14:53:05.5940241Z TASK [Verifica se o arquivo {{ item }}/etc/hosts-{{ sistema_ambiente }} existe] ***
2026-07-22T14:53:05.5941018Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r3618/a/_SIPBS-batch-relatorio-pagamentos-gepld-config)
2026-07-22T14:53:05.8628450Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r3618/a/_SIPBS-batch-relatorio-pagamentos-gepld-config/so)
2026-07-22T14:53:05.8663751Z Wednesday 22 July 2026  11:53:05 -0300 (0:00:00.603)       0:00:56.410 ******** 
2026-07-22T14:53:06.3065443Z 
2026-07-22T14:53:06.3065985Z TASK [Altera arquivo /etc/hosts] ***********************************************
2026-07-22T14:53:06.3068017Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => (item={u'item': u'/opt/ads-agent/_work/r3618/a/_SIPBS-batch-relatorio-pagamentos-gepld-config', u'stat': {u'charset': u'us-ascii', u'uid': 1000, u'exists': True, u'attr_flags': u'', u'woth': False, u'device_type': 0, u'mtime': 1784731732.779639, u'block_size': 4096, u'inode': 381906965, u'isgid': False, u'size': 59, u'wgrp': False, u'executable': False, u'isuid': False, u'readable': True, u'isreg': True, u'version': u'18446744073200936335', u'pw_name': u'sadscp01', u'gid': 1000, u'ischr': False, u'wusr': True, u'writeable': True, u'mimetype': u'text/plain', u'blocks': 8, u'xoth': False, u'islnk': False, u'nlink': 1, u'issock': False, u'rgrp': True, u'gr_name': u'sadscp01', u'path': u'/opt/ads-agent/_work/r3618/a/_SIPBS-batch-relatorio-pagamentos-gepld-config/etc/hosts-tqs', u'xusr': False, u'atime': 1784731826.1166553, u'isdir': False, u'ctime': 1784731732.779639, u'isblk': False, u'checksum': u'fad615814c62f5b315bda313922f0408da944557', u'dev': 64771, u'roth': True, u'isfifo': False, u'mode': u'0644', u'xgrp': False, u'rusr': True, u'attributes': []}, u'ansible_loop_var': u'item', u'failed': False, u'invocation': {u'module_args': {u'follow': False, u'get_checksum': True, u'path': u'/opt/ads-agent/_work/r3618/a/_SIPBS-batch-relatorio-pagamentos-gepld-config/etc/hosts-tqs', u'checksum_algorithm': u'sha1', u'get_md5': False, u'get_mime': True, u'get_attributes': True}}, u'changed': False})
2026-07-22T14:53:06.3149779Z 
2026-07-22T14:53:06.3150521Z PLAY [Configura Control-M] *****************************************************
2026-07-22T14:53:06.3197747Z Wednesday 22 July 2026  11:53:06 -0300 (0:00:00.453)       0:00:56.863 ******** 
2026-07-22T14:53:07.0722960Z 
2026-07-22T14:53:07.0723875Z TASK [Gathering Facts] *********************************************************
2026-07-22T14:53:07.0724091Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:53:07.0918824Z Wednesday 22 July 2026  11:53:07 -0300 (0:00:00.771)       0:00:57.635 ******** 
2026-07-22T14:53:07.3609421Z 
2026-07-22T14:53:07.3610138Z TASK [stat] ********************************************************************
2026-07-22T14:53:07.3610457Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:53:07.3744196Z Wednesday 22 July 2026  11:53:07 -0300 (0:00:00.282)       0:00:57.918 ******** 
2026-07-22T14:53:07.4313434Z 
2026-07-22T14:53:07.4314670Z TASK [assert] ******************************************************************
2026-07-22T14:53:07.4314977Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:53:07.4315120Z     "changed": false, 
2026-07-22T14:53:07.4315245Z     "msg": "All assertions passed"
2026-07-22T14:53:07.4315351Z }
2026-07-22T14:53:07.4463886Z Wednesday 22 July 2026  11:53:07 -0300 (0:00:00.071)       0:00:57.990 ******** 
2026-07-22T14:53:07.5189744Z 
2026-07-22T14:53:07.5190418Z TASK [control_m : Cria variável ansible] ***************************************
2026-07-22T14:53:07.5190728Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:53:07.5338891Z Wednesday 22 July 2026  11:53:07 -0300 (0:00:00.087)       0:00:58.077 ******** 
2026-07-22T14:53:08.2836654Z 
2026-07-22T14:53:08.2837175Z TASK [control_m : Copiando arquivo de certificado] *****************************
2026-07-22T14:53:08.2837624Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:53:08.2984661Z Wednesday 22 July 2026  11:53:08 -0300 (0:00:00.764)       0:00:58.842 ******** 
2026-07-22T14:53:08.5658801Z 
2026-07-22T14:53:08.5659635Z TASK [control_m : Executando add-user.sh] **************************************
2026-07-22T14:53:08.5659815Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:53:08.5791162Z Wednesday 22 July 2026  11:53:08 -0300 (0:00:00.280)       0:00:59.122 ******** 
2026-07-22T14:53:08.9988986Z 
2026-07-22T14:53:08.9989674Z TASK [control_m : Removendo add-user.sh] ***************************************
2026-07-22T14:53:08.9989848Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:53:09.0132118Z Wednesday 22 July 2026  11:53:09 -0300 (0:00:00.434)       0:00:59.556 ******** 
2026-07-22T14:53:09.2678793Z 
2026-07-22T14:53:09.2679951Z TASK [control_m : Criacao diretorio /producao/carga] ***************************
2026-07-22T14:53:09.2680206Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:53:09.2817651Z Wednesday 22 July 2026  11:53:09 -0300 (0:00:00.268)       0:00:59.825 ******** 
2026-07-22T14:53:09.5458199Z 
2026-07-22T14:53:09.5459195Z TASK [control_m : Criacao diretorio /producao/suporte] *************************
2026-07-22T14:53:09.5459555Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:53:09.5597615Z Wednesday 22 July 2026  11:53:09 -0300 (0:00:00.277)       0:01:00.103 ******** 
2026-07-22T14:53:10.1168354Z 
2026-07-22T14:53:10.1169435Z TASK [control_m : Garante bash_profile] ****************************************
2026-07-22T14:53:10.1169770Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:53:10.1315438Z Wednesday 22 July 2026  11:53:10 -0300 (0:00:00.571)       0:01:00.675 ******** 
2026-07-22T14:53:10.3788858Z 
2026-07-22T14:53:10.3789651Z TASK [control_m : Cria Diretório de Scripts] ***********************************
2026-07-22T14:53:10.3789824Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:53:10.3933950Z Wednesday 22 July 2026  11:53:10 -0300 (0:00:00.261)       0:01:00.937 ******** 
2026-07-22T14:53:10.9542081Z 
2026-07-22T14:53:10.9542939Z TASK [control_m : Copia Scripts] ***********************************************
2026-07-22T14:53:10.9543305Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:53:10.9721491Z Wednesday 22 July 2026  11:53:10 -0300 (0:00:00.578)       0:01:01.515 ******** 
2026-07-22T14:53:11.2502680Z 
2026-07-22T14:53:11.2503206Z TASK [control_m : Verifica se o arquivo /producao//configuration/custom.sh existe] ***
2026-07-22T14:53:11.2503378Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:53:11.2656206Z Wednesday 22 July 2026  11:53:11 -0300 (0:00:00.293)       0:01:01.809 ******** 
2026-07-22T14:53:11.3368481Z Wednesday 22 July 2026  11:53:11 -0300 (0:00:00.071)       0:01:01.880 ******** 
2026-07-22T14:53:11.9059348Z 
2026-07-22T14:53:11.9060010Z TASK [control_m : Configuração Control-M] **************************************
2026-07-22T14:53:11.9060318Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:53:11.9178813Z Wednesday 22 July 2026  11:53:11 -0300 (0:00:00.581)       0:01:02.461 ******** 
2026-07-22T14:54:42.3401436Z 
2026-07-22T14:54:42.3402245Z TASK [control_m : Restart ControlM] ********************************************
2026-07-22T14:54:42.3403024Z fatal: [caddeapllx1572.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "msg": "Unable to start service controlm_agent.service: Job for controlm_agent.service failed because a timeout was exceeded. See \"systemctl status controlm_agent.service\" and \"journalctl -xe\" for details.\n"}
2026-07-22T14:54:42.3408147Z 
2026-07-22T14:54:42.3408820Z PLAY RECAP *********************************************************************
2026-07-22T14:54:42.3409069Z caddeapllx1572.agil.nprd.caixa.gov.br : ok=75   changed=23   unreachable=0    failed=1    skipped=4    rescued=0    ignored=6   
2026-07-22T14:54:42.3409163Z 
2026-07-22T14:54:42.3416765Z Wednesday 22 July 2026  11:54:42 -0300 (0:01:30.423)       0:02:32.884 ******** 
2026-07-22T14:54:42.3417005Z =============================================================================== 
2026-07-22T14:54:42.3417260Z control_m : Restart ControlM ------------------------------------------- 90.42s
2026-07-22T14:54:42.3417495Z nfs : Networker | Restart networker ------------------------------------ 10.44s
2026-07-22T14:54:42.3417718Z nfs : Networker | Restart networker ------------------------------------ 10.44s
2026-07-22T14:54:42.3417940Z nfs : Networker | Restart networker ------------------------------------ 10.43s
2026-07-22T14:54:42.3418164Z nfs : execute montagem script ------------------------------------------- 7.79s
2026-07-22T14:54:42.3418387Z nfs : Instalando o NFS Client ------------------------------------------- 1.74s
2026-07-22T14:54:42.3418604Z nfs : Instalando o NFS Client ------------------------------------------- 1.02s
2026-07-22T14:54:42.3418876Z nfs : Instalando o NFS Client ------------------------------------------- 0.94s
2026-07-22T14:54:42.3419158Z nfs : Networker | Start networker --------------------------------------- 0.86s
2026-07-22T14:54:42.3419438Z Gathering Facts --------------------------------------------------------- 0.77s
2026-07-22T14:54:42.3419680Z control_m : Copiando arquivo de certificado ----------------------------- 0.76s
2026-07-22T14:54:42.3419907Z nfs : Install networker lgtoclnt_url ------------------------------------ 0.73s
2026-07-22T14:54:42.3420132Z nfs : Install networker lgtoclnt_url ------------------------------------ 0.71s
2026-07-22T14:54:42.3420380Z nfs : Install networker lgtonmda_url ------------------------------------ 0.71s
2026-07-22T14:54:42.3420668Z nfs : Install networker lgtoclnt_url ------------------------------------ 0.71s
2026-07-22T14:54:42.3420884Z nfs : Install networker lgtonmda_url ------------------------------------ 0.68s
2026-07-22T14:54:42.3421098Z nfs : Install networker lgtonmda_url ------------------------------------ 0.67s
2026-07-22T14:54:42.3421319Z Verifica se o arquivo {{ item }}/etc/hosts-{{ sistema_ambiente }} existe --- 0.60s
2026-07-22T14:54:42.3421559Z control_m : Configuração Control-M -------------------------------------- 0.58s
2026-07-22T14:54:42.3421787Z control_m : Copia Scripts ----------------------------------------------- 0.58s
2026-07-22T14:54:42.3421975Z Playbook run took 0 days, 0 hours, 2 minutes, 32 seconds
2026-07-22T14:54:42.4004088Z ##[error]Bash exited with code '2'.
2026-07-22T14:54:42.4031077Z ##[warning]RetryHelper encountered task failure, will retry (attempt #: 2 out of 2) after 4000 ms
2026-07-22T14:54:46.4893874Z Generating script.
2026-07-22T14:54:46.4905450Z ========================== Starting Command Output ===========================
2026-07-22T14:54:46.4912131Z [command]/bin/bash /opt/ads-agent/_work/_temp/442f9e14-59bc-4d71-b651-9ce73e3401e2.sh
2026-07-22T14:54:48.5779306Z 
2026-07-22T14:54:48.5780301Z PLAY [local] *******************************************************************
2026-07-22T14:54:48.6043401Z 
2026-07-22T14:54:48.6043908Z PLAY [Configurando o DNS] ******************************************************
2026-07-22T14:54:48.7970595Z 
2026-07-22T14:54:48.7971165Z PLAY [local] *******************************************************************
2026-07-22T14:54:48.8002723Z 
2026-07-22T14:54:48.8003477Z PLAY [Verificando serviços] ****************************************************
2026-07-22T14:54:48.8081421Z 
2026-07-22T14:54:48.8082382Z PLAY [Configuração LDAP] *******************************************************
2026-07-22T14:54:48.8114402Z [WARNING]: Found variable using reserved name: when
2026-07-22T14:54:48.8120756Z 
2026-07-22T14:54:48.8121024Z PLAY [jboss] *******************************************************************
2026-07-22T14:54:48.8203577Z 
2026-07-22T14:54:48.8204146Z PLAY [Stack Jboss] *************************************************************
2026-07-22T14:54:48.8229660Z 
2026-07-22T14:54:48.8229940Z PLAY [jboss] *******************************************************************
2026-07-22T14:54:48.8267151Z 
2026-07-22T14:54:48.8267601Z PLAY [jboss] *******************************************************************
2026-07-22T14:54:48.8530486Z Wednesday 22 July 2026  11:54:48 -0300 (0:00:00.335)       0:00:00.335 ******** 
2026-07-22T14:54:49.3297290Z 
2026-07-22T14:54:49.3297815Z TASK [Verifica se o arquivo nfs_config.json existe] ****************************
2026-07-22T14:54:49.3301010Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:54:49.3324343Z Wednesday 22 July 2026  11:54:49 -0300 (0:00:00.479)       0:00:00.815 ******** 
2026-07-22T14:54:49.3796894Z included: /opt/ads-agent/_work/r3618/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for caddeapllx1572.agil.nprd.caixa.gov.br
2026-07-22T14:54:49.3836701Z Wednesday 22 July 2026  11:54:49 -0300 (0:00:00.051)       0:00:00.866 ******** 
2026-07-22T14:54:49.4429458Z 
2026-07-22T14:54:49.4431337Z TASK [nfs : Criar variáveis] ***************************************************
2026-07-22T14:54:49.4431754Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:54:49.4484091Z Wednesday 22 July 2026  11:54:49 -0300 (0:00:00.064)       0:00:00.931 ******** 
2026-07-22T14:54:49.8871158Z 
2026-07-22T14:54:49.8872276Z TASK [nfs : Coletar variáveis de ambiente] *************************************
2026-07-22T14:54:49.8872479Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:54:49.8872756Z Wednesday 22 July 2026  11:54:49 -0300 (0:00:00.433)       0:00:01.365 ******** 
2026-07-22T14:54:49.9410334Z 
2026-07-22T14:54:49.9410892Z TASK [nfs : Exibir resultado em JSON] ******************************************
2026-07-22T14:54:49.9411061Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:54:49.9411195Z     "nfs_vars_json": {
2026-07-22T14:54:49.9411302Z         "changed": false, 
2026-07-22T14:54:49.9411707Z         "cmd": "cat /opt/ads-agent/_work/r3618/a/nfs_config.json", 
2026-07-22T14:54:49.9411872Z         "delta": "0:00:00.003595", 
2026-07-22T14:54:49.9412883Z         "end": "2026-07-22 11:54:49.861603", 
2026-07-22T14:54:49.9413049Z         "failed": false, 
2026-07-22T14:54:49.9413158Z         "rc": 0, 
2026-07-22T14:54:49.9413330Z         "start": "2026-07-22 11:54:49.858008", 
2026-07-22T14:54:49.9413462Z         "stderr": "", 
2026-07-22T14:54:49.9413571Z         "stderr_lines": [], 
2026-07-22T14:54:49.9413863Z         "stdout": "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS\",\"NFS_MOUNT_POINT_ISILON\": \"/sipbs\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW\",\"NFS_MOUNT_POINT_ISILON_3\": \"/sipbs_fgw\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL\",\"NFS_MOUNT_POINT_ISILON_2\": \"/b2b\"}]", 
2026-07-22T14:54:49.9416834Z         "stdout_lines": [
2026-07-22T14:54:49.9417625Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS\",\"NFS_MOUNT_POINT_ISILON\": \"/sipbs\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW\",\"NFS_MOUNT_POINT_ISILON_3\": \"/sipbs_fgw\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL\",\"NFS_MOUNT_POINT_ISILON_2\": \"/b2b\"}]"
2026-07-22T14:54:49.9418237Z         ]
2026-07-22T14:54:49.9418326Z     }
2026-07-22T14:54:49.9418425Z }
2026-07-22T14:54:49.9435382Z Wednesday 22 July 2026  11:54:49 -0300 (0:00:00.061)       0:00:01.426 ******** 
2026-07-22T14:54:50.0060239Z 
2026-07-22T14:54:50.0061402Z TASK [nfs : Criar variáveis] ***************************************************
2026-07-22T14:54:50.0061666Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:54:50.0094441Z Wednesday 22 July 2026  11:54:50 -0300 (0:00:00.065)       0:00:01.492 ******** 
2026-07-22T14:54:55.3774910Z 
2026-07-22T14:54:55.3775415Z TASK [nfs : execute montagem script] *******************************************
2026-07-22T14:54:55.3775666Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:54:55.3800424Z Wednesday 22 July 2026  11:54:55 -0300 (0:00:05.370)       0:00:06.862 ******** 
2026-07-22T14:54:55.4376252Z 
2026-07-22T14:54:55.4376958Z TASK [nfs : ansible.builtin.debug] *********************************************
2026-07-22T14:54:55.4379820Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:54:55.4380090Z     "changed": false, 
2026-07-22T14:54:55.4380297Z     "msg": {
2026-07-22T14:54:55.4380506Z         "changed": true, 
2026-07-22T14:54:55.4380680Z         "cmd": [
2026-07-22T14:54:55.4380819Z             "python", 
2026-07-22T14:54:55.4381261Z             "/opt/ads-agent/_work/r3618/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py", 
2026-07-22T14:54:55.4381491Z             "montagem", 
2026-07-22T14:54:55.4381701Z             "sipbs-batch", 
2026-07-22T14:54:55.4381921Z             "tqs", 
2026-07-22T14:54:55.4382072Z             "ctc_nprd", 
2026-07-22T14:54:55.4382339Z             "/opt/ads-agent/_work/r3618/a/esteira-jboss-vm-v2", 
2026-07-22T14:54:55.4382537Z             "C&t@d02", 
2026-07-22T14:54:55.4382763Z             "***", 
2026-07-22T14:54:55.4382931Z             "s736651@corp.caixa.gov.br", 
2026-07-22T14:54:55.4383109Z             "***", 
2026-07-22T14:54:55.4383527Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS\",\"NFS_MOUNT_POINT_ISILON\": \"/sipbs\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW\",\"NFS_MOUNT_POINT_ISILON_3\": \"/sipbs_fgw\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL\",\"NFS_MOUNT_POINT_ISILON_2\": \"/b2b\"}]"
2026-07-22T14:54:55.4383934Z         ], 
2026-07-22T14:54:55.4384120Z         "delta": "0:00:05.031616", 
2026-07-22T14:54:55.4384365Z         "end": "2026-07-22 11:54:55.360118", 
2026-07-22T14:54:55.4384549Z         "failed": false, 
2026-07-22T14:54:55.4384701Z         "rc": 0, 
2026-07-22T14:54:55.4384945Z         "start": "2026-07-22 11:54:50.328502", 
2026-07-22T14:54:55.4385127Z         "stderr": "", 
2026-07-22T14:54:55.4385289Z         "stderr_lines": [], 
2026-07-22T14:54:55.4388469Z         "stdout": "[{u'NFS_MOUNT_POINT_ISILON': u'/sipbs', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS'}, {u'NFS_MOUNT_POINT_ISILON_3': u'/sipbs_fgw', u'NFS_ENDPOINT_ISILON_3': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW'}, {u'NFS_MOUNT_POINT_ISILON_2': u'/b2b', u'NFS_ENDPOINT_ISILON_2': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL'}]\nNome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           \n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS /sipbs                              ISILON                              nfsctcnprd.ctc.caixa                tqs                                \nnfs_path=/sipbs\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS /sipbs                              ISILON                              nfsctcnprd.ctc.caixa                tqs                                \nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL /b2b                                ISILON                              nfsctcnprd.ctc.caixa                tqs                                \nnfs_path=/b2b\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL /b2b                                ISILON                              nfsctcnprd.ctc.caixa                tqs                                \nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW /sipbs_fgw                          ISILON                              nfsctcnprd.ctc.caixa                tqs                                \nnfs_path=/sipbs_fgw\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW /sipbs_fgw                          ISILON                              nfsctcnprd.ctc.caixa                tqs                                ", 
2026-07-22T14:54:55.4390231Z         "stdout_lines": [
2026-07-22T14:54:55.4390985Z             "[{u'NFS_MOUNT_POINT_ISILON': u'/sipbs', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS'}, {u'NFS_MOUNT_POINT_ISILON_3': u'/sipbs_fgw', u'NFS_ENDPOINT_ISILON_3': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW'}, {u'NFS_MOUNT_POINT_ISILON_2': u'/b2b', u'NFS_ENDPOINT_ISILON_2': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL'}]", 
2026-07-22T14:54:55.4391525Z             "Nome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           ", 
2026-07-22T14:54:55.4392040Z             "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------", 
2026-07-22T14:54:55.4392404Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS /sipbs                              ISILON                              nfsctcnprd.ctc.caixa                tqs                                ", 
2026-07-22T14:54:55.4392636Z             "nfs_path=/sipbs", 
2026-07-22T14:54:55.4392837Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS", 
2026-07-22T14:54:55.4393114Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS /sipbs                              ISILON                              nfsctcnprd.ctc.caixa                tqs                                ", 
2026-07-22T14:54:55.4393413Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL /b2b                                ISILON                              nfsctcnprd.ctc.caixa                tqs                                ", 
2026-07-22T14:54:55.4393637Z             "nfs_path=/b2b", 
2026-07-22T14:54:55.4393843Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL", 
2026-07-22T14:54:55.4394111Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL /b2b                                ISILON                              nfsctcnprd.ctc.caixa                tqs                                ", 
2026-07-22T14:54:55.4394424Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW /sipbs_fgw                          ISILON                              nfsctcnprd.ctc.caixa                tqs                                ", 
2026-07-22T14:54:55.4394713Z             "nfs_path=/sipbs_fgw", 
2026-07-22T14:54:55.4394908Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW", 
2026-07-22T14:54:55.4395194Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW /sipbs_fgw                          ISILON                              nfsctcnprd.ctc.caixa                tqs                                "
2026-07-22T14:54:55.4395418Z         ]
2026-07-22T14:54:55.4395551Z     }
2026-07-22T14:54:55.4395683Z }
2026-07-22T14:54:55.4406061Z Wednesday 22 July 2026  11:54:55 -0300 (0:00:00.060)       0:00:06.923 ******** 
2026-07-22T14:54:55.8395802Z 
2026-07-22T14:54:55.8396278Z TASK [nfs : execute clean json] ************************************************
2026-07-22T14:54:55.8397869Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:54:55.8420360Z Wednesday 22 July 2026  11:54:55 -0300 (0:00:00.401)       0:00:07.324 ******** 
2026-07-22T14:54:55.9024127Z 
2026-07-22T14:54:55.9024854Z TASK [nfs : result_new_string_json] ********************************************
2026-07-22T14:54:55.9025639Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:54:55.9025828Z     "msg": {
2026-07-22T14:54:55.9025933Z         "ansible_facts": {
2026-07-22T14:54:55.9026061Z             "discovered_interpreter_python": "/usr/bin/python"
2026-07-22T14:54:55.9026181Z         }, 
2026-07-22T14:54:55.9026301Z         "changed": true, 
2026-07-22T14:54:55.9027312Z         "cmd": "echo '[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS\",\"NFS_MOUNT_POINT_ISILON\": \"/sipbs\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW\",\"NFS_MOUNT_POINT_ISILON_3\": \"/sipbs_fgw\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL\",\"NFS_MOUNT_POINT_ISILON_2\": \"/b2b\"}]' | sed 's/NFS_ENDPOINT_ISILON[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_ISILON[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_HUAWEI[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_HUAWEI[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_VM[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_VM[^\"]*/NFS_MOUNT_POINT/g'", 
2026-07-22T14:54:55.9027809Z         "delta": "0:00:00.010102", 
2026-07-22T14:54:55.9027995Z         "end": "2026-07-22 11:54:55.823954", 
2026-07-22T14:54:55.9028119Z         "failed": false, 
2026-07-22T14:54:55.9028223Z         "rc": 0, 
2026-07-22T14:54:55.9028390Z         "start": "2026-07-22 11:54:55.813852", 
2026-07-22T14:54:55.9028515Z         "stderr": "", 
2026-07-22T14:54:55.9028625Z         "stderr_lines": [], 
2026-07-22T14:54:55.9028893Z         "stdout": "[{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS\",\"NFS_MOUNT_POINT\": \"/sipbs\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW\",\"NFS_MOUNT_POINT\": \"/sipbs_fgw\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL\",\"NFS_MOUNT_POINT\": \"/b2b\"}]", 
2026-07-22T14:54:55.9029205Z         "stdout_lines": [
2026-07-22T14:54:55.9029469Z             "[{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS\",\"NFS_MOUNT_POINT\": \"/sipbs\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW\",\"NFS_MOUNT_POINT\": \"/sipbs_fgw\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL\",\"NFS_MOUNT_POINT\": \"/b2b\"}]"
2026-07-22T14:54:55.9029698Z         ]
2026-07-22T14:54:55.9029793Z     }
2026-07-22T14:54:55.9029884Z }
2026-07-22T14:54:55.9042726Z Wednesday 22 July 2026  11:54:55 -0300 (0:00:00.062)       0:00:07.387 ******** 
2026-07-22T14:54:55.9621801Z 
2026-07-22T14:54:55.9622839Z TASK [nfs : Parse JSON data] ***************************************************
2026-07-22T14:54:55.9623156Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:54:55.9640702Z Wednesday 22 July 2026  11:54:55 -0300 (0:00:00.059)       0:00:07.446 ******** 
2026-07-22T14:54:56.0221869Z 
2026-07-22T14:54:56.0222390Z TASK [nfs : result_new_json] ***************************************************
2026-07-22T14:54:56.0222560Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:54:56.0222686Z     "msg": [
2026-07-22T14:54:56.0223151Z         {
2026-07-22T14:54:56.0223301Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS", 
2026-07-22T14:54:56.0223452Z             "NFS_MOUNT_POINT": "/sipbs"
2026-07-22T14:54:56.0223562Z         }, 
2026-07-22T14:54:56.0223821Z         {
2026-07-22T14:54:56.0223976Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW", 
2026-07-22T14:54:56.0224866Z             "NFS_MOUNT_POINT": "/sipbs_fgw"
2026-07-22T14:54:56.0226512Z         }, 
2026-07-22T14:54:56.0227877Z         {
2026-07-22T14:54:56.0228585Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL", 
2026-07-22T14:54:56.0228881Z             "NFS_MOUNT_POINT": "/b2b"
2026-07-22T14:54:56.0229089Z         }
2026-07-22T14:54:56.0229286Z     ]
2026-07-22T14:54:56.0229492Z }
2026-07-22T14:54:56.0242010Z Wednesday 22 July 2026  11:54:56 -0300 (0:00:00.060)       0:00:07.507 ******** 
2026-07-22T14:54:56.0946654Z included: /opt/ads-agent/_work/r3618/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx1572.agil.nprd.caixa.gov.br
2026-07-22T14:54:56.1031262Z included: /opt/ads-agent/_work/r3618/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx1572.agil.nprd.caixa.gov.br
2026-07-22T14:54:56.1127677Z included: /opt/ads-agent/_work/r3618/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx1572.agil.nprd.caixa.gov.br
2026-07-22T14:54:56.1183708Z Wednesday 22 July 2026  11:54:56 -0300 (0:00:00.094)       0:00:07.601 ******** 
2026-07-22T14:54:56.1789708Z 
2026-07-22T14:54:56.1790226Z TASK [nfs : Parse JSON data] ***************************************************
2026-07-22T14:54:56.1790938Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:54:56.1821868Z Wednesday 22 July 2026  11:54:56 -0300 (0:00:00.063)       0:00:07.664 ******** 
2026-07-22T14:54:56.2381591Z 
2026-07-22T14:54:56.2382135Z TASK [nfs : debug] *************************************************************
2026-07-22T14:54:56.2382349Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:54:56.2382476Z     "msg": {
2026-07-22T14:54:56.2382628Z         "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS", 
2026-07-22T14:54:56.2382778Z         "NFS_MOUNT_POINT": "/sipbs"
2026-07-22T14:54:56.2382887Z     }
2026-07-22T14:54:56.2382981Z }
2026-07-22T14:54:56.2407504Z Wednesday 22 July 2026  11:54:56 -0300 (0:00:00.058)       0:00:07.723 ******** 
2026-07-22T14:54:56.2947473Z 
2026-07-22T14:54:56.2948669Z TASK [nfs : debug] *************************************************************
2026-07-22T14:54:56.2948840Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:54:56.2949058Z     "msg": "/sipbs"
2026-07-22T14:54:56.2949165Z }
2026-07-22T14:54:56.2972224Z Wednesday 22 July 2026  11:54:56 -0300 (0:00:00.056)       0:00:07.780 ******** 
2026-07-22T14:54:56.3518060Z 
2026-07-22T14:54:56.3519211Z TASK [nfs : debug] *************************************************************
2026-07-22T14:54:56.3519526Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:54:56.3519778Z     "msg": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIPBS"
2026-07-22T14:54:56.3519984Z }
2026-07-22T14:54:56.3544600Z Wednesday 22 July 2026  11:54:56 -0300 (0:00:00.057)       0:00:07.837 ******** 
2026-07-22T14:54:56.4114075Z 
2026-07-22T14:54:56.4114989Z TASK [nfs : Verificando as variaveis] ******************************************
2026-07-22T14:54:56.4115189Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:54:56.4115323Z     "changed": false, 
2026-07-22T14:54:56.4115443Z     "msg": "All assertions passed"
2026-07-22T14:54:56.4115821Z }
2026-07-22T14:54:56.4145813Z Wednesday 22 July 2026  11:54:56 -0300 (0:00:00.060)       0:00:07.897 ******** 
2026-07-22T14:54:58.1416830Z 
2026-07-22T14:54:58.1417431Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-07-22T14:54:58.1417605Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:54:58.1445853Z Wednesday 22 July 2026  11:54:58 -0300 (0:00:01.730)       0:00:09.627 ******** 
2026-07-22T14:54:58.8653720Z 
2026-07-22T14:54:58.8654360Z TASK [nfs : Install networker lgtoclnt_url] ************************************
2026-07-22T14:54:58.8654540Z [WARNING]: Consider using the yum, dnf or zypper module rather than running
2026-07-22T14:54:58.8654883Z 'rpm'.  If you need to use command because yum, dnf or zypper is insufficient
2026-07-22T14:54:58.8655405Z you can add 'warn: false' to this command task or set 'command_warnings=False'
2026-07-22T14:54:58.8655557Z in ansible.cfg to get rid of this message.
2026-07-22T14:54:58.8657681Z fatal: [caddeapllx1572.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.459869", "end": "2026-07-22 11:54:58.852339", "msg": "non-zero return code", "rc": 1, "start": "2026-07-22 11:54:58.392470", "stderr": "aviso: /var/tmp/rpm-tmp.54qLu0: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.54qLu0: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm", "Preparando...                         ########################################"]}
2026-07-22T14:54:58.8658404Z ...ignoring
2026-07-22T14:54:58.8686116Z Wednesday 22 July 2026  11:54:58 -0300 (0:00:00.723)       0:00:10.351 ******** 
2026-07-22T14:54:59.5224249Z 
2026-07-22T14:54:59.5225327Z TASK [nfs : Install networker lgtonmda_url] ************************************
2026-07-22T14:54:59.5230191Z fatal: [caddeapllx1572.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.406317", "end": "2026-07-22 11:54:59.508041", "msg": "non-zero return code", "rc": 1, "start": "2026-07-22 11:54:59.101724", "stderr": "aviso: /var/tmp/rpm-tmp.RTo8KG: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.RTo8KG: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm", "Preparando...                         ########################################"]}
2026-07-22T14:54:59.5231037Z ...ignoring
2026-07-22T14:54:59.5262575Z Wednesday 22 July 2026  11:54:59 -0300 (0:00:00.657)       0:00:11.008 ******** 
2026-07-22T14:54:59.9579006Z 
2026-07-22T14:54:59.9579676Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-07-22T14:54:59.9579844Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:54:59.9608278Z Wednesday 22 July 2026  11:54:59 -0300 (0:00:00.434)       0:00:11.443 ******** 
2026-07-22T14:55:00.2180070Z 
2026-07-22T14:55:00.2180822Z TASK [nfs : Create a symbolic link] ********************************************
2026-07-22T14:55:00.2181166Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:55:00.2213398Z Wednesday 22 July 2026  11:55:00 -0300 (0:00:00.260)       0:00:11.704 ******** 
2026-07-22T14:55:01.0752504Z 
2026-07-22T14:55:01.0753373Z TASK [nfs : Networker | Start networker] ***************************************
2026-07-22T14:55:01.0753696Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:55:01.0768513Z Wednesday 22 July 2026  11:55:01 -0300 (0:00:00.855)       0:00:12.559 ******** 
2026-07-22T14:55:01.3417481Z 
2026-07-22T14:55:01.3418002Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-07-22T14:55:01.3418175Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:55:01.3441989Z Wednesday 22 July 2026  11:55:01 -0300 (0:00:00.267)       0:00:12.827 ******** 
2026-07-22T14:55:11.8029522Z 
2026-07-22T14:55:11.8030496Z TASK [nfs : Networker | Restart networker] *************************************
2026-07-22T14:55:11.8031017Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:55:11.8054314Z Wednesday 22 July 2026  11:55:11 -0300 (0:00:10.461)       0:00:23.288 ******** 
2026-07-22T14:55:12.2379168Z 
2026-07-22T14:55:12.2380163Z TASK [nfs : Montando volume remoto] ********************************************
2026-07-22T14:55:12.2380614Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:55:12.2406462Z Wednesday 22 July 2026  11:55:12 -0300 (0:00:00.435)       0:00:23.723 ******** 
2026-07-22T14:55:12.2852506Z Wednesday 22 July 2026  11:55:12 -0300 (0:00:00.044)       0:00:23.767 ******** 
2026-07-22T14:55:12.3418988Z 
2026-07-22T14:55:12.3419512Z TASK [nfs : Parse JSON data] ***************************************************
2026-07-22T14:55:12.3419697Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:55:12.3444298Z Wednesday 22 July 2026  11:55:12 -0300 (0:00:00.059)       0:00:23.827 ******** 
2026-07-22T14:55:12.3991786Z 
2026-07-22T14:55:12.3992579Z TASK [nfs : debug] *************************************************************
2026-07-22T14:55:12.3992989Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:55:12.3993134Z     "msg": {
2026-07-22T14:55:12.3993299Z         "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW", 
2026-07-22T14:55:12.3993459Z         "NFS_MOUNT_POINT": "/sipbs_fgw"
2026-07-22T14:55:12.3993565Z     }
2026-07-22T14:55:12.3993661Z }
2026-07-22T14:55:12.4026816Z Wednesday 22 July 2026  11:55:12 -0300 (0:00:00.058)       0:00:23.885 ******** 
2026-07-22T14:55:12.4595308Z 
2026-07-22T14:55:12.4595828Z TASK [nfs : debug] *************************************************************
2026-07-22T14:55:12.4596004Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:55:12.4596137Z     "msg": "/sipbs_fgw"
2026-07-22T14:55:12.4596247Z }
2026-07-22T14:55:12.4622668Z Wednesday 22 July 2026  11:55:12 -0300 (0:00:00.059)       0:00:23.945 ******** 
2026-07-22T14:55:12.5171783Z 
2026-07-22T14:55:12.5172750Z TASK [nfs : debug] *************************************************************
2026-07-22T14:55:12.5173012Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:55:12.5173195Z     "msg": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIPBS_TQS_FGW"
2026-07-22T14:55:12.5173333Z }
2026-07-22T14:55:12.5199430Z Wednesday 22 July 2026  11:55:12 -0300 (0:00:00.057)       0:00:24.002 ******** 
2026-07-22T14:55:12.5799605Z 
2026-07-22T14:55:12.5800068Z TASK [nfs : Verificando as variaveis] ******************************************
2026-07-22T14:55:12.5800277Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:55:12.5801873Z     "changed": false, 
2026-07-22T14:55:12.5803089Z     "msg": "All assertions passed"
2026-07-22T14:55:12.5804209Z }
2026-07-22T14:55:12.5833578Z Wednesday 22 July 2026  11:55:12 -0300 (0:00:00.063)       0:00:24.066 ******** 
2026-07-22T14:55:13.6153206Z 
2026-07-22T14:55:13.6153887Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-07-22T14:55:13.6154129Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:55:13.6186539Z Wednesday 22 July 2026  11:55:13 -0300 (0:00:01.035)       0:00:25.101 ******** 
2026-07-22T14:55:14.3528484Z 
2026-07-22T14:55:14.3529141Z TASK [nfs : Install networker lgtoclnt_url] ************************************
2026-07-22T14:55:14.3531313Z fatal: [caddeapllx1572.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.471575", "end": "2026-07-22 11:55:14.337160", "msg": "non-zero return code", "rc": 1, "start": "2026-07-22 11:55:13.865585", "stderr": "aviso: /var/tmp/rpm-tmp.aTg4of: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.aTg4of: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm", "Preparando...                         ########################################"]}
2026-07-22T14:55:14.3532434Z ...ignoring
2026-07-22T14:55:14.3553442Z Wednesday 22 July 2026  11:55:14 -0300 (0:00:00.736)       0:00:25.838 ******** 
2026-07-22T14:55:15.0240056Z 
2026-07-22T14:55:15.0240806Z TASK [nfs : Install networker lgtonmda_url] ************************************
2026-07-22T14:55:15.0245675Z fatal: [caddeapllx1572.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.419059", "end": "2026-07-22 11:55:15.009802", "msg": "non-zero return code", "rc": 1, "start": "2026-07-22 11:55:14.590743", "stderr": "aviso: /var/tmp/rpm-tmp.ESfagU: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.ESfagU: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm", "Preparando...                         ########################################"]}
2026-07-22T14:55:15.0247139Z ...ignoring
2026-07-22T14:55:15.0273913Z Wednesday 22 July 2026  11:55:15 -0300 (0:00:00.672)       0:00:26.510 ******** 
2026-07-22T14:55:15.2754735Z 
2026-07-22T14:55:15.2755869Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-07-22T14:55:15.2756128Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:55:15.2798164Z Wednesday 22 July 2026  11:55:15 -0300 (0:00:00.252)       0:00:26.762 ******** 
2026-07-22T14:55:15.5311162Z 
2026-07-22T14:55:15.5311644Z TASK [nfs : Create a symbolic link] ********************************************
2026-07-22T14:55:15.5312823Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:55:15.5338453Z Wednesday 22 July 2026  11:55:15 -0300 (0:00:00.254)       0:00:27.016 ******** 
2026-07-22T14:55:16.1060345Z 
2026-07-22T14:55:16.1060889Z TASK [nfs : Networker | Start networker] ***************************************
2026-07-22T14:55:16.1061061Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:55:16.1093209Z Wednesday 22 July 2026  11:55:16 -0300 (0:00:00.575)       0:00:27.592 ******** 
2026-07-22T14:55:16.3713629Z 
2026-07-22T14:55:16.3714300Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-07-22T14:55:16.3714718Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:55:16.3739141Z Wednesday 22 July 2026  11:55:16 -0300 (0:00:00.264)       0:00:27.856 ******** 
2026-07-22T14:55:26.8568635Z 
2026-07-22T14:55:26.8569164Z TASK [nfs : Networker | Restart networker] *************************************
2026-07-22T14:55:26.8569621Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:55:26.8592637Z Wednesday 22 July 2026  11:55:26 -0300 (0:00:10.485)       0:00:38.342 ******** 
2026-07-22T14:55:27.1472329Z 
2026-07-22T14:55:27.1473067Z TASK [nfs : Montando volume remoto] ********************************************
2026-07-22T14:55:27.1473396Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:55:27.1488402Z Wednesday 22 July 2026  11:55:27 -0300 (0:00:00.289)       0:00:38.631 ******** 
2026-07-22T14:55:27.1902284Z Wednesday 22 July 2026  11:55:27 -0300 (0:00:00.041)       0:00:38.672 ******** 
2026-07-22T14:55:27.2465451Z 
2026-07-22T14:55:27.2466137Z TASK [nfs : Parse JSON data] ***************************************************
2026-07-22T14:55:27.2466643Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:55:27.2490208Z Wednesday 22 July 2026  11:55:27 -0300 (0:00:00.058)       0:00:38.731 ******** 
2026-07-22T14:55:27.3028584Z 
2026-07-22T14:55:27.3029288Z TASK [nfs : debug] *************************************************************
2026-07-22T14:55:27.3029653Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:55:27.3030215Z     "msg": {
2026-07-22T14:55:27.3030436Z         "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL", 
2026-07-22T14:55:27.3030589Z         "NFS_MOUNT_POINT": "/b2b"
2026-07-22T14:55:27.3030693Z     }
2026-07-22T14:55:27.3030788Z }
2026-07-22T14:55:27.3055261Z Wednesday 22 July 2026  11:55:27 -0300 (0:00:00.056)       0:00:38.788 ******** 
2026-07-22T14:55:27.3591922Z 
2026-07-22T14:55:27.3592839Z TASK [nfs : debug] *************************************************************
2026-07-22T14:55:27.3593696Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:55:27.3593961Z     "msg": "/b2b"
2026-07-22T14:55:27.3594126Z }
2026-07-22T14:55:27.3619337Z Wednesday 22 July 2026  11:55:27 -0300 (0:00:00.056)       0:00:38.844 ******** 
2026-07-22T14:55:27.4170917Z 
2026-07-22T14:55:27.4171846Z TASK [nfs : debug] *************************************************************
2026-07-22T14:55:27.4172085Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:55:27.4172245Z     "msg": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/B2B/SIGPL"
2026-07-22T14:55:27.4172493Z }
2026-07-22T14:55:27.4198435Z Wednesday 22 July 2026  11:55:27 -0300 (0:00:00.057)       0:00:38.902 ******** 
2026-07-22T14:55:27.4757402Z 
2026-07-22T14:55:27.4757921Z TASK [nfs : Verificando as variaveis] ******************************************
2026-07-22T14:55:27.4763645Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:55:27.4764022Z     "changed": false, 
2026-07-22T14:55:27.4764296Z     "msg": "All assertions passed"
2026-07-22T14:55:27.4764429Z }
2026-07-22T14:55:27.4787252Z Wednesday 22 July 2026  11:55:27 -0300 (0:00:00.058)       0:00:38.961 ******** 
2026-07-22T14:55:28.4858725Z 
2026-07-22T14:55:28.4859462Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-07-22T14:55:28.4859865Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:55:28.4885774Z Wednesday 22 July 2026  11:55:28 -0300 (0:00:01.009)       0:00:39.971 ******** 
2026-07-22T14:55:29.1847369Z 
2026-07-22T14:55:29.1847894Z TASK [nfs : Install networker lgtoclnt_url] ************************************
2026-07-22T14:55:29.1852524Z fatal: [caddeapllx1572.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.440319", "end": "2026-07-22 11:55:29.171876", "msg": "non-zero return code", "rc": 1, "start": "2026-07-22 11:55:28.731557", "stderr": "aviso: /var/tmp/rpm-tmp.O58jGI: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.O58jGI: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm", "Preparando...                         ########################################"]}
2026-07-22T14:55:29.1853576Z ...ignoring
2026-07-22T14:55:29.1878108Z Wednesday 22 July 2026  11:55:29 -0300 (0:00:00.699)       0:00:40.670 ******** 
2026-07-22T14:55:29.8332885Z 
2026-07-22T14:55:29.8333830Z TASK [nfs : Install networker lgtonmda_url] ************************************
2026-07-22T14:55:29.8339602Z fatal: [caddeapllx1572.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.400997", "end": "2026-07-22 11:55:29.821124", "msg": "non-zero return code", "rc": 1, "start": "2026-07-22 11:55:29.420127", "stderr": "aviso: /var/tmp/rpm-tmp.lpuiLl: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.lpuiLl: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm", "Preparando...                         ########################################"]}
2026-07-22T14:55:29.8341199Z ...ignoring
2026-07-22T14:55:29.8369135Z Wednesday 22 July 2026  11:55:29 -0300 (0:00:00.649)       0:00:41.319 ******** 
2026-07-22T14:55:30.2889223Z 
2026-07-22T14:55:30.2890223Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-07-22T14:55:30.2890696Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:55:30.2927315Z Wednesday 22 July 2026  11:55:30 -0300 (0:00:00.455)       0:00:41.775 ******** 
2026-07-22T14:55:30.5349672Z 
2026-07-22T14:55:30.5350180Z TASK [nfs : Create a symbolic link] ********************************************
2026-07-22T14:55:30.5350357Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:55:30.5378090Z Wednesday 22 July 2026  11:55:30 -0300 (0:00:00.244)       0:00:42.020 ******** 
2026-07-22T14:55:31.1135168Z 
2026-07-22T14:55:31.1135966Z TASK [nfs : Networker | Start networker] ***************************************
2026-07-22T14:55:31.1136296Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:55:31.1167873Z Wednesday 22 July 2026  11:55:31 -0300 (0:00:00.578)       0:00:42.599 ******** 
2026-07-22T14:55:31.3819734Z 
2026-07-22T14:55:31.3820709Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-07-22T14:55:31.3821080Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:55:31.3847848Z Wednesday 22 July 2026  11:55:31 -0300 (0:00:00.267)       0:00:42.867 ******** 
2026-07-22T14:55:41.8568904Z 
2026-07-22T14:55:41.8569481Z TASK [nfs : Networker | Restart networker] *************************************
2026-07-22T14:55:41.8569655Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:55:41.8593466Z Wednesday 22 July 2026  11:55:41 -0300 (0:00:10.474)       0:00:53.342 ******** 
2026-07-22T14:55:42.1406325Z 
2026-07-22T14:55:42.1406872Z TASK [nfs : Montando volume remoto] ********************************************
2026-07-22T14:55:42.1407087Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:55:42.1434206Z Wednesday 22 July 2026  11:55:42 -0300 (0:00:00.283)       0:00:53.626 ******** 
2026-07-22T14:55:42.1859690Z 
2026-07-22T14:55:42.1860193Z PLAY [jboss] *******************************************************************
2026-07-22T14:55:42.1903552Z 
2026-07-22T14:55:42.1903697Z PLAY [Copiando deployments adicionais] *****************************************
2026-07-22T14:55:42.1940131Z 
2026-07-22T14:55:42.1940499Z PLAY [Copiando modules adicionais] *********************************************
2026-07-22T14:55:42.1980435Z 
2026-07-22T14:55:42.1980703Z PLAY [jboss] *******************************************************************
2026-07-22T14:55:42.2020139Z 
2026-07-22T14:55:42.2020450Z PLAY [jboss] *******************************************************************
2026-07-22T14:55:42.2048481Z 
2026-07-22T14:55:42.2048866Z PLAY [jboss] *******************************************************************
2026-07-22T14:55:42.2077151Z 
2026-07-22T14:55:42.2077570Z PLAY [jboss] *******************************************************************
2026-07-22T14:55:42.2103393Z 
2026-07-22T14:55:42.2103731Z PLAY [jboss] *******************************************************************
2026-07-22T14:55:42.2130159Z 
2026-07-22T14:55:42.2130519Z PLAY [local] *******************************************************************
2026-07-22T14:55:42.2153183Z [WARNING]: Could not match supplied host pattern, ignoring: instance_restart
2026-07-22T14:55:42.2156175Z 
2026-07-22T14:55:42.2156597Z PLAY [instance_restart] ********************************************************
2026-07-22T14:55:42.2156764Z skipping: no hosts matched
2026-07-22T14:55:42.2159367Z [WARNING]: Could not match supplied host pattern, ignoring: machine_reboot
2026-07-22T14:55:42.2161996Z 
2026-07-22T14:55:42.2162147Z PLAY [machine_reboot] **********************************************************
2026-07-22T14:55:42.2162296Z skipping: no hosts matched
2026-07-22T14:55:42.2168387Z 
2026-07-22T14:55:42.2168779Z PLAY [local] *******************************************************************
2026-07-22T14:55:42.2193553Z [WARNING]: Could not match supplied host pattern, ignoring: instance_stop
2026-07-22T14:55:42.2196506Z 
2026-07-22T14:55:42.2196721Z PLAY [instance_stop] ***********************************************************
2026-07-22T14:55:42.2196873Z skipping: no hosts matched
2026-07-22T14:55:42.2199876Z 
2026-07-22T14:55:42.2200117Z PLAY [machine_reboot] **********************************************************
2026-07-22T14:55:42.2200349Z skipping: no hosts matched
2026-07-22T14:55:42.2206252Z 
2026-07-22T14:55:42.2206507Z PLAY [local] *******************************************************************
2026-07-22T14:55:42.2235805Z [WARNING]: Could not match supplied host pattern, ignoring: escopo_execucao
2026-07-22T14:55:42.2238508Z 
2026-07-22T14:55:42.2238710Z PLAY [Executar o Start do Sirot Connector no escopo definido] ******************
2026-07-22T14:55:42.2238859Z skipping: no hosts matched
2026-07-22T14:55:42.2244595Z 
2026-07-22T14:55:42.2245522Z PLAY [local] *******************************************************************
2026-07-22T14:55:42.2265645Z 
2026-07-22T14:55:42.2266000Z PLAY [Executar o Stop do Sirot Connector] **************************************
2026-07-22T14:55:42.2266269Z skipping: no hosts matched
2026-07-22T14:55:42.2275137Z 
2026-07-22T14:55:42.2275336Z PLAY [Configura TSM] ***********************************************************
2026-07-22T14:55:42.2302523Z 
2026-07-22T14:55:42.2302804Z PLAY [jboss] *******************************************************************
2026-07-22T14:55:42.2335302Z Wednesday 22 July 2026  11:55:42 -0300 (0:00:00.090)       0:00:53.716 ******** 
2026-07-22T14:55:42.2892836Z 
2026-07-22T14:55:42.2893980Z TASK [Cria variável build_repository_name] *************************************
2026-07-22T14:55:42.2894384Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:55:42.2905117Z Wednesday 22 July 2026  11:55:42 -0300 (0:00:00.057)       0:00:53.773 ******** 
2026-07-22T14:55:42.3452229Z 
2026-07-22T14:55:42.3452778Z TASK [Buscando diretorio de config] ********************************************
2026-07-22T14:55:42.3452952Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:55:42.3537227Z Wednesday 22 July 2026  11:55:42 -0300 (0:00:00.063)       0:00:53.836 ******** 
2026-07-22T14:55:42.6688739Z 
2026-07-22T14:55:42.6689434Z TASK [Verifica se o arquivo {{ item }}/etc/hosts-{{ sistema_ambiente }} existe] ***
2026-07-22T14:55:42.6689949Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r3618/a/_SIPBS-batch-relatorio-pagamentos-gepld-config)
2026-07-22T14:55:42.9205059Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r3618/a/_SIPBS-batch-relatorio-pagamentos-gepld-config/so)
2026-07-22T14:55:42.9250642Z Wednesday 22 July 2026  11:55:42 -0300 (0:00:00.571)       0:00:54.407 ******** 
2026-07-22T14:55:43.3361990Z 
2026-07-22T14:55:43.3362505Z TASK [Altera arquivo /etc/hosts] ***********************************************
2026-07-22T14:55:43.3364264Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => (item={u'item': u'/opt/ads-agent/_work/r3618/a/_SIPBS-batch-relatorio-pagamentos-gepld-config', u'stat': {u'charset': u'us-ascii', u'uid': 1000, u'exists': True, u'attr_flags': u'', u'woth': False, u'device_type': 0, u'mtime': 1784731732.779639, u'block_size': 4096, u'inode': 381906965, u'isgid': False, u'size': 59, u'wgrp': False, u'executable': False, u'isuid': False, u'readable': True, u'isreg': True, u'version': u'18446744073200936335', u'pw_name': u'sadscp01', u'gid': 1000, u'ischr': False, u'wusr': True, u'writeable': True, u'mimetype': u'text/plain', u'blocks': 8, u'xoth': False, u'islnk': False, u'nlink': 1, u'issock': False, u'rgrp': True, u'gr_name': u'sadscp01', u'path': u'/opt/ads-agent/_work/r3618/a/_SIPBS-batch-relatorio-pagamentos-gepld-config/etc/hosts-tqs', u'xusr': False, u'atime': 1784731826.1166553, u'isdir': False, u'ctime': 1784731732.779639, u'isblk': False, u'checksum': u'fad615814c62f5b315bda313922f0408da944557', u'dev': 64771, u'roth': True, u'isfifo': False, u'mode': u'0644', u'xgrp': False, u'rusr': True, u'attributes': []}, u'ansible_loop_var': u'item', u'failed': False, u'invocation': {u'module_args': {u'follow': False, u'get_checksum': True, u'path': u'/opt/ads-agent/_work/r3618/a/_SIPBS-batch-relatorio-pagamentos-gepld-config/etc/hosts-tqs', u'checksum_algorithm': u'sha1', u'get_md5': False, u'get_mime': True, u'get_attributes': True}}, u'changed': False})
2026-07-22T14:55:43.3439176Z 
2026-07-22T14:55:43.3439827Z PLAY [Configura Control-M] *****************************************************
2026-07-22T14:55:43.3476683Z Wednesday 22 July 2026  11:55:43 -0300 (0:00:00.422)       0:00:54.830 ******** 
2026-07-22T14:55:44.0959820Z 
2026-07-22T14:55:44.0960754Z TASK [Gathering Facts] *********************************************************
2026-07-22T14:55:44.0961299Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:55:44.1154330Z Wednesday 22 July 2026  11:55:44 -0300 (0:00:00.767)       0:00:55.597 ******** 
2026-07-22T14:55:44.3869536Z 
2026-07-22T14:55:44.3870296Z TASK [stat] ********************************************************************
2026-07-22T14:55:44.3870931Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:55:44.4012776Z Wednesday 22 July 2026  11:55:44 -0300 (0:00:00.285)       0:00:55.883 ******** 
2026-07-22T14:55:44.4587626Z 
2026-07-22T14:55:44.4588145Z TASK [assert] ******************************************************************
2026-07-22T14:55:44.4588333Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br] => {
2026-07-22T14:55:44.4588460Z     "changed": false, 
2026-07-22T14:55:44.4589361Z     "msg": "All assertions passed"
2026-07-22T14:55:44.4589833Z }
2026-07-22T14:55:44.4724923Z Wednesday 22 July 2026  11:55:44 -0300 (0:00:00.071)       0:00:55.955 ******** 
2026-07-22T14:55:44.5468685Z 
2026-07-22T14:55:44.5469758Z TASK [control_m : Cria variável ansible] ***************************************
2026-07-22T14:55:44.5470023Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:55:44.5617503Z Wednesday 22 July 2026  11:55:44 -0300 (0:00:00.089)       0:00:56.044 ******** 
2026-07-22T14:55:45.3290655Z 
2026-07-22T14:55:45.3291428Z TASK [control_m : Copiando arquivo de certificado] *****************************
2026-07-22T14:55:45.3291777Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:55:45.3454937Z Wednesday 22 July 2026  11:55:45 -0300 (0:00:00.783)       0:00:56.828 ******** 
2026-07-22T14:55:45.6288963Z 
2026-07-22T14:55:45.6289815Z TASK [control_m : Executando add-user.sh] **************************************
2026-07-22T14:55:45.6290094Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:55:45.6435665Z Wednesday 22 July 2026  11:55:45 -0300 (0:00:00.298)       0:00:57.126 ******** 
2026-07-22T14:55:46.0599677Z 
2026-07-22T14:55:46.0600570Z TASK [control_m : Removendo add-user.sh] ***************************************
2026-07-22T14:55:46.0600889Z changed: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:55:46.0726317Z Wednesday 22 July 2026  11:55:46 -0300 (0:00:00.429)       0:00:57.555 ******** 
2026-07-22T14:55:46.3463981Z 
2026-07-22T14:55:46.3464936Z TASK [control_m : Criacao diretorio /producao/carga] ***************************
2026-07-22T14:55:46.3465447Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:55:46.3608798Z Wednesday 22 July 2026  11:55:46 -0300 (0:00:00.288)       0:00:57.843 ******** 
2026-07-22T14:55:46.6220222Z 
2026-07-22T14:55:46.6220723Z TASK [control_m : Criacao diretorio /producao/suporte] *************************
2026-07-22T14:55:46.6220894Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:55:46.6362166Z Wednesday 22 July 2026  11:55:46 -0300 (0:00:00.275)       0:00:58.118 ******** 
2026-07-22T14:55:47.2114570Z 
2026-07-22T14:55:47.2115370Z TASK [control_m : Garante bash_profile] ****************************************
2026-07-22T14:55:47.2115695Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:55:47.2260271Z Wednesday 22 July 2026  11:55:47 -0300 (0:00:00.589)       0:00:58.708 ******** 
2026-07-22T14:55:47.4762467Z 
2026-07-22T14:55:47.4763436Z TASK [control_m : Cria Diretório de Scripts] ***********************************
2026-07-22T14:55:47.4763772Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:55:47.4907051Z Wednesday 22 July 2026  11:55:47 -0300 (0:00:00.264)       0:00:58.973 ******** 
2026-07-22T14:55:48.0463879Z 
2026-07-22T14:55:48.0464679Z TASK [control_m : Copia Scripts] ***********************************************
2026-07-22T14:55:48.0465103Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:55:48.0617018Z Wednesday 22 July 2026  11:55:48 -0300 (0:00:00.571)       0:00:59.544 ******** 
2026-07-22T14:55:48.3167978Z 
2026-07-22T14:55:48.3168511Z TASK [control_m : Verifica se o arquivo /producao//configuration/custom.sh existe] ***
2026-07-22T14:55:48.3169626Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:55:48.3314859Z Wednesday 22 July 2026  11:55:48 -0300 (0:00:00.269)       0:00:59.814 ******** 
2026-07-22T14:55:48.3931146Z Wednesday 22 July 2026  11:55:48 -0300 (0:00:00.061)       0:00:59.875 ******** 
2026-07-22T14:55:48.9884201Z 
2026-07-22T14:55:48.9885129Z TASK [control_m : Configuração Control-M] **************************************
2026-07-22T14:55:48.9885475Z ok: [caddeapllx1572.agil.nprd.caixa.gov.br]
2026-07-22T14:55:49.0029846Z Wednesday 22 July 2026  11:55:49 -0300 (0:00:00.609)       0:01:00.485 ******** 
2026-07-22T14:57:19.5879940Z 
2026-07-22T14:57:19.5887099Z TASK [control_m : Restart ControlM] ********************************************
2026-07-22T14:57:19.5889226Z fatal: [caddeapllx1572.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "msg": "Unable to start service controlm_agent.service: Job for controlm_agent.service failed because a timeout was exceeded. See \"systemctl status controlm_agent.service\" and \"journalctl -xe\" for details.\n"}
2026-07-22T14:57:19.5889574Z 
2026-07-22T14:57:19.5891276Z PLAY RECAP *********************************************************************
2026-07-22T14:57:19.5891531Z caddeapllx1572.agil.nprd.caixa.gov.br : ok=75   changed=23   unreachable=0    failed=1    skipped=4    rescued=0    ignored=6   
2026-07-22T14:57:19.5891689Z 
2026-07-22T14:57:19.5892023Z Wednesday 22 July 2026  11:57:19 -0300 (0:01:30.586)       0:02:31.071 ******** 
2026-07-22T14:57:19.5892256Z =============================================================================== 
2026-07-22T14:57:19.5892756Z control_m : Restart ControlM ------------------------------------------- 90.59s
2026-07-22T14:57:19.5893058Z nfs : Networker | Restart networker ------------------------------------ 10.49s
2026-07-22T14:57:19.5893388Z nfs : Networker | Restart networker ------------------------------------ 10.47s
2026-07-22T14:57:19.5893621Z nfs : Networker | Restart networker ------------------------------------ 10.46s
2026-07-22T14:57:19.5893843Z nfs : execute montagem script ------------------------------------------- 5.37s
2026-07-22T14:57:19.5894075Z nfs : Instalando o NFS Client ------------------------------------------- 1.73s
2026-07-22T14:57:19.5894301Z nfs : Instalando o NFS Client ------------------------------------------- 1.04s
2026-07-22T14:57:19.5894521Z nfs : Instalando o NFS Client ------------------------------------------- 1.01s
2026-07-22T14:57:19.5894809Z nfs : Networker | Start networker --------------------------------------- 0.86s
2026-07-22T14:57:19.5895035Z control_m : Copiando arquivo de certificado ----------------------------- 0.78s
2026-07-22T14:57:19.5895262Z Gathering Facts --------------------------------------------------------- 0.77s
2026-07-22T14:57:19.5895536Z nfs : Install networker lgtoclnt_url ------------------------------------ 0.74s
2026-07-22T14:57:19.5895769Z nfs : Install networker lgtoclnt_url ------------------------------------ 0.72s
2026-07-22T14:57:19.5895980Z nfs : Install networker lgtoclnt_url ------------------------------------ 0.70s
2026-07-22T14:57:19.5896201Z nfs : Install networker lgtonmda_url ------------------------------------ 0.67s
2026-07-22T14:57:19.5896505Z nfs : Install networker lgtonmda_url ------------------------------------ 0.66s
2026-07-22T14:57:19.5896740Z nfs : Install networker lgtonmda_url ------------------------------------ 0.65s
2026-07-22T14:57:19.5896976Z control_m : Configuração Control-M -------------------------------------- 0.61s
2026-07-22T14:57:19.5897194Z control_m : Garante bash_profile ---------------------------------------- 0.59s
2026-07-22T14:57:19.5897424Z nfs : Networker | Start networker --------------------------------------- 0.58s
2026-07-22T14:57:19.5897573Z Playbook run took 0 days, 0 hours, 2 minutes, 31 seconds
2026-07-22T14:57:19.6482239Z ##[error]Bash exited with code '2'.
2026-07-22T14:57:19.6510014Z ##[section]Finishing: Configura Control-M

