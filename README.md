2026-09-16T17:18:11.8605180Z ##[section]Starting: Configura Control-M
2026-09-16T17:18:11.8609159Z ==============================================================================
2026-09-16T17:18:11.8609245Z Task         : Bash
2026-09-16T17:18:11.8609293Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-16T17:18:11.8609371Z Version      : 3.227.0
2026-09-16T17:18:11.8609419Z Author       : Microsoft Corporation
2026-09-16T17:18:11.8609493Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-16T17:18:11.8609570Z ==============================================================================
2026-09-16T17:18:12.8498209Z Generating script.
2026-09-16T17:18:12.8576773Z ========================== Starting Command Output ===========================
2026-09-16T17:18:12.8582454Z [command]/bin/bash /opt/ads-agent/_work/_temp/6bfd667c-22c3-4653-a650-260205fbd638.sh
2026-09-16T17:18:15.2433868Z 
2026-09-16T17:18:15.2434620Z PLAY [local] *******************************************************************
2026-09-16T17:18:15.2748402Z 
2026-09-16T17:18:15.2749029Z PLAY [Configurando o DNS] ******************************************************
2026-09-16T17:18:15.4848428Z 
2026-09-16T17:18:15.4849627Z PLAY [local] *******************************************************************
2026-09-16T17:18:15.4885947Z 
2026-09-16T17:18:15.4886639Z PLAY [Verificando serviços] ****************************************************
2026-09-16T17:18:15.4979370Z 
2026-09-16T17:18:15.4979816Z PLAY [Configuração LDAP] *******************************************************
2026-09-16T17:18:15.5021488Z [WARNING]: Found variable using reserved name: when
2026-09-16T17:18:15.5025629Z 
2026-09-16T17:18:15.5026014Z PLAY [jboss] *******************************************************************
2026-09-16T17:18:15.5128745Z 
2026-09-16T17:18:15.5129649Z PLAY [Stack Jboss] *************************************************************
2026-09-16T17:18:15.5156236Z 
2026-09-16T17:18:15.5156711Z PLAY [jboss] *******************************************************************
2026-09-16T17:18:15.5201363Z 
2026-09-16T17:18:15.5201792Z PLAY [jboss] *******************************************************************
2026-09-16T17:18:15.5496303Z Wednesday 16 September 2026  14:18:15 -0300 (0:00:00.368)       0:00:00.368 *** 
2026-09-16T17:18:16.1649827Z 
2026-09-16T17:18:16.1650905Z TASK [Verifica se o arquivo nfs_config.json existe] ****************************
2026-09-16T17:18:16.1651204Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:18:16.1665241Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:18:16.1696755Z Wednesday 16 September 2026  14:18:16 -0300 (0:00:00.620)       0:00:00.989 *** 
2026-09-16T17:18:16.2326012Z included: /opt/ads-agent/_work/r13215/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for caddeapllx1214.agil.nprd.caixa.gov.br, caddeapllx2798.agil.nprd.caixa.gov.br
2026-09-16T17:18:16.2391813Z Wednesday 16 September 2026  14:18:16 -0300 (0:00:00.069)       0:00:01.058 *** 
2026-09-16T17:18:16.3031867Z 
2026-09-16T17:18:16.3032793Z TASK [nfs : Criar variáveis] ***************************************************
2026-09-16T17:18:16.3033036Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:18:16.3205276Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:18:16.3262576Z Wednesday 16 September 2026  14:18:16 -0300 (0:00:00.086)       0:00:01.145 *** 
2026-09-16T17:18:16.8360970Z 
2026-09-16T17:18:16.8361988Z TASK [nfs : Coletar variáveis de ambiente] *************************************
2026-09-16T17:18:16.8362168Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:18:16.8383445Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:18:16.8429181Z Wednesday 16 September 2026  14:18:16 -0300 (0:00:00.516)       0:00:01.662 *** 
2026-09-16T17:18:16.9045589Z 
2026-09-16T17:18:16.9046324Z TASK [nfs : Exibir resultado em JSON] ******************************************
2026-09-16T17:18:16.9046958Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br] => {
2026-09-16T17:18:16.9047149Z     "nfs_vars_json": {
2026-09-16T17:18:16.9047756Z         "changed": false, 
2026-09-16T17:18:16.9048186Z         "cmd": "cat /opt/ads-agent/_work/r13215/a/nfs_config.json", 
2026-09-16T17:18:16.9048367Z         "delta": "0:00:00.006623", 
2026-09-16T17:18:16.9048561Z         "end": "2026-09-16 14:18:16.812570", 
2026-09-16T17:18:16.9048693Z         "failed": false, 
2026-09-16T17:18:16.9048809Z         "rc": 0, 
2026-09-16T17:18:16.9048978Z         "start": "2026-09-16 14:18:16.805947", 
2026-09-16T17:18:16.9049108Z         "stderr": "", 
2026-09-16T17:18:16.9049223Z         "stderr_lines": [], 
2026-09-16T17:18:16.9049916Z         "stdout": "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT_ISILON\": \"/SIIFX\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_3\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT_ISILON_2\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT_ISILON_4\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT_ISILON_4\": \"/SIIFX_SIGMS\"}]", 
2026-09-16T17:18:16.9050336Z         "stdout_lines": [
2026-09-16T17:18:16.9050993Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT_ISILON\": \"/SIIFX\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_3\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT_ISILON_2\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT_ISILON_4\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT_ISILON_4\": \"/SIIFX_SIGMS\"}]"
2026-09-16T17:18:16.9051343Z         ]
2026-09-16T17:18:16.9051443Z     }
2026-09-16T17:18:16.9051541Z }
2026-09-16T17:18:16.9113583Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T17:18:16.9113738Z     "nfs_vars_json": {
2026-09-16T17:18:16.9113860Z         "changed": false, 
2026-09-16T17:18:16.9114739Z         "cmd": "cat /opt/ads-agent/_work/r13215/a/nfs_config.json", 
2026-09-16T17:18:16.9114976Z         "delta": "0:00:00.006811", 
2026-09-16T17:18:16.9115175Z         "end": "2026-09-16 14:18:16.812428", 
2026-09-16T17:18:16.9115308Z         "failed": false, 
2026-09-16T17:18:16.9115426Z         "rc": 0, 
2026-09-16T17:18:16.9115602Z         "start": "2026-09-16 14:18:16.805617", 
2026-09-16T17:18:16.9115738Z         "stderr": "", 
2026-09-16T17:18:16.9115854Z         "stderr_lines": [], 
2026-09-16T17:18:16.9116714Z         "stdout": "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT_ISILON\": \"/SIIFX\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_3\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT_ISILON_2\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT_ISILON_4\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT_ISILON_4\": \"/SIIFX_SIGMS\"}]", 
2026-09-16T17:18:16.9117403Z         "stdout_lines": [
2026-09-16T17:18:16.9118325Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT_ISILON\": \"/SIIFX\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_3\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT_ISILON_2\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT_ISILON_4\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT_ISILON_4\": \"/SIIFX_SIGMS\"}]"
2026-09-16T17:18:16.9118930Z         ]
2026-09-16T17:18:16.9119229Z     }
2026-09-16T17:18:16.9119409Z }
2026-09-16T17:18:16.9152127Z Wednesday 16 September 2026  14:18:16 -0300 (0:00:00.072)       0:00:01.734 *** 
2026-09-16T17:18:16.9801102Z 
2026-09-16T17:18:16.9802129Z TASK [nfs : Criar variáveis] ***************************************************
2026-09-16T17:18:16.9802299Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:18:16.9893898Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:18:16.9953082Z Wednesday 16 September 2026  14:18:16 -0300 (0:00:00.080)       0:00:01.814 *** 
2026-09-16T17:18:25.9103159Z 
2026-09-16T17:18:25.9103908Z TASK [nfs : execute montagem script] *******************************************
2026-09-16T17:18:25.9104096Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:18:25.9807014Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:18:25.9850327Z Wednesday 16 September 2026  14:18:25 -0300 (0:00:08.989)       0:00:10.804 *** 
2026-09-16T17:18:26.0625575Z 
2026-09-16T17:18:26.0626257Z TASK [nfs : ansible.builtin.debug] *********************************************
2026-09-16T17:18:26.0633273Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br] => {
2026-09-16T17:18:26.0633436Z     "changed": false, 
2026-09-16T17:18:26.0633567Z     "msg": {
2026-09-16T17:18:26.0633686Z         "changed": true, 
2026-09-16T17:18:26.0633804Z         "cmd": [
2026-09-16T17:18:26.0633923Z             "python", 
2026-09-16T17:18:26.0637572Z             "/opt/ads-agent/_work/r13215/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py", 
2026-09-16T17:18:26.0637974Z             "montagem", 
2026-09-16T17:18:26.0639974Z             "siifx-batch-vm", 
2026-09-16T17:18:26.0640327Z             "des", 
2026-09-16T17:18:26.0642266Z             "ctc_nprd", 
2026-09-16T17:18:26.0642649Z             "/opt/ads-agent/_work/r13215/a/esteira-jboss-vm-v2", 
2026-09-16T17:18:26.0643116Z             "C&t@d02", 
2026-09-16T17:18:26.0643388Z             "***", 
2026-09-16T17:18:26.0643518Z             "s736651@corp.caixa.gov.br", 
2026-09-16T17:18:26.0643667Z             "***", 
2026-09-16T17:18:26.0644428Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT_ISILON\": \"/SIIFX\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_3\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT_ISILON_2\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT_ISILON_4\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT_ISILON_4\": \"/SIIFX_SIGMS\"}]"
2026-09-16T17:18:26.0645173Z         ], 
2026-09-16T17:18:26.0645316Z         "delta": "0:00:08.481539", 
2026-09-16T17:18:26.0645522Z         "end": "2026-09-16 14:18:25.884429", 
2026-09-16T17:18:26.0646083Z         "failed": false, 
2026-09-16T17:18:26.0647604Z         "rc": 0, 
2026-09-16T17:18:26.0647888Z         "start": "2026-09-16 14:18:17.402890", 
2026-09-16T17:18:26.0648034Z         "stderr": "", 
2026-09-16T17:18:26.0648152Z         "stderr_lines": [], 
2026-09-16T17:18:26.0652815Z         "stdout": "[{u'NFS_MOUNT_POINT_ISILON': u'/SIIFX', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH'}, {u'NFS_MOUNT_POINT_ISILON_3': u'/SIIFX_SIISF', u'NFS_ENDPOINT_ISILON_3': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF'}, {u'NFS_MOUNT_POINT_ISILON_2': u'/SIIFX_B2B', u'NFS_ENDPOINT_ISILON_2': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX'}, {u'NFS_ENDPOINT_ISILON_4': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA', u'NFS_MOUNT_POINT_ISILON_4': u'/SIIFX_SIGMS'}]\nNome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           \n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH /SIIFX                              ISILON                              nfsctcnprd.ctc.caixa                des                                \nException when callin ProtocolsApi->get_nfs_expor: (500)\nReason: Internal Server Error\nHTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 17:18:18 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})\nHTTP response body: \n{\n\"errors\" : \n[\n\n{\n\"code\" : \"AEC_EXCEPTION\",\n\"message\" : \"bad hostname 192.168.231.137,10.188.254.113\"\n}\n]\n}\n\n\n\nnfs_path=/SIIFX\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH /SIIFX                              ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX /SIIFX_B2B                          ISILON                              nfsctcnprd.ctc.caixa                des                                \nException when callin ProtocolsApi->get_nfs_expor: (500)\nReason: Internal Server Error\nHTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 17:18:20 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})\nHTTP response body: \n{\n\"errors\" : \n[\n\n{\n\"code\" : \"AEC_EXCEPTION\",\n\"message\" : \"bad hostname 192.168.231.137,10.188.254.113\"\n}\n]\n}\n\n\n\nnfs_path=/SIIFX_B2B\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX /SIIFX_B2B                          ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /SIIFX_SIISF                        ISILON                              nfsctcnprd.ctc.caixa                des                                \nException when callin ProtocolsApi->get_nfs_expor: (500)\nReason: Internal Server Error\nHTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 17:18:22 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})\nHTTP response body: \n{\n\"errors\" : \n[\n\n{\n\"code\" : \"AEC_EXCEPTION\",\n\"message\" : \"bad hostname 192.168.231.137,10.188.254.113\"\n}\n]\n}\n\n\n\nnfs_path=/SIIFX_SIISF\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /SIIFX_SIISF                        ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA /SIIFX_SIGMS                        ISILON                              nfsctcnprd.ctc.caixa                des                                \nException when callin ProtocolsApi->get_nfs_expor: (500)\nReason: Internal Server Error\nHTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 17:18:24 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})\nHTTP response body: \n{\n\"errors\" : \n[\n\n{\n\"code\" : \"AEC_EXCEPTION\",\n\"message\" : \"bad hostname 192.168.231.137,10.188.254.113\"\n}\n]\n}\n\n\n\nnfs_path=/SIIFX_SIGMS\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA /SIIFX_SIGMS                        ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T17:18:26.0655473Z         "stdout_lines": [
2026-09-16T17:18:26.0656220Z             "[{u'NFS_MOUNT_POINT_ISILON': u'/SIIFX', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH'}, {u'NFS_MOUNT_POINT_ISILON_3': u'/SIIFX_SIISF', u'NFS_ENDPOINT_ISILON_3': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF'}, {u'NFS_MOUNT_POINT_ISILON_2': u'/SIIFX_B2B', u'NFS_ENDPOINT_ISILON_2': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX'}, {u'NFS_ENDPOINT_ISILON_4': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA', u'NFS_MOUNT_POINT_ISILON_4': u'/SIIFX_SIGMS'}]", 
2026-09-16T17:18:26.0656724Z             "Nome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           ", 
2026-09-16T17:18:26.0657114Z             "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------", 
2026-09-16T17:18:26.0657523Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH /SIIFX                              ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T17:18:26.0657770Z             "Exception when callin ProtocolsApi->get_nfs_expor: (500)", 
2026-09-16T17:18:26.0657922Z             "Reason: Internal Server Error", 
2026-09-16T17:18:26.0658342Z             "HTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 17:18:18 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})", 
2026-09-16T17:18:26.0658590Z             "HTTP response body: ", 
2026-09-16T17:18:26.0658749Z             "{", 
2026-09-16T17:18:26.0658907Z             "\"errors\" : ", 
2026-09-16T17:18:26.0659045Z             "[", 
2026-09-16T17:18:26.0659150Z             "", 
2026-09-16T17:18:26.0659250Z             "{", 
2026-09-16T17:18:26.0659360Z             "\"code\" : \"AEC_EXCEPTION\",", 
2026-09-16T17:18:26.0659504Z             "\"message\" : \"bad hostname 192.168.231.137,10.188.254.113\"", 
2026-09-16T17:18:26.0659629Z             "}", 
2026-09-16T17:18:26.0659729Z             "]", 
2026-09-16T17:18:26.0659816Z             "}", 
2026-09-16T17:18:26.0660006Z             "", 
2026-09-16T17:18:26.0660107Z             "", 
2026-09-16T17:18:26.0660207Z             "", 
2026-09-16T17:18:26.0660320Z             "nfs_path=/SIIFX", 
2026-09-16T17:18:26.0660636Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH", 
2026-09-16T17:18:26.0661023Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH /SIIFX                              ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T17:18:26.0661249Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX /SIIFX_B2B                          ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T17:18:26.0661510Z             "Exception when callin ProtocolsApi->get_nfs_expor: (500)", 
2026-09-16T17:18:26.0661720Z             "Reason: Internal Server Error", 
2026-09-16T17:18:26.0662309Z             "HTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 17:18:20 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})", 
2026-09-16T17:18:26.0662804Z             "HTTP response body: ", 
2026-09-16T17:18:26.0662977Z             "{", 
2026-09-16T17:18:26.0663148Z             "\"errors\" : ", 
2026-09-16T17:18:26.0663310Z             "[", 
2026-09-16T17:18:26.0663467Z             "", 
2026-09-16T17:18:26.0663616Z             "{", 
2026-09-16T17:18:26.0663753Z             "\"code\" : \"AEC_EXCEPTION\",", 
2026-09-16T17:18:26.0663945Z             "\"message\" : \"bad hostname 192.168.231.137,10.188.254.113\"", 
2026-09-16T17:18:26.0664107Z             "}", 
2026-09-16T17:18:26.0664235Z             "]", 
2026-09-16T17:18:26.0664360Z             "}", 
2026-09-16T17:18:26.0664486Z             "", 
2026-09-16T17:18:26.0664614Z             "", 
2026-09-16T17:18:26.0664752Z             "", 
2026-09-16T17:18:26.0664911Z             "nfs_path=/SIIFX_B2B", 
2026-09-16T17:18:26.0665126Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX", 
2026-09-16T17:18:26.0665415Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX /SIIFX_B2B                          ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T17:18:26.0665653Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /SIIFX_SIISF                        ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T17:18:26.0665912Z             "Exception when callin ProtocolsApi->get_nfs_expor: (500)", 
2026-09-16T17:18:26.0666055Z             "Reason: Internal Server Error", 
2026-09-16T17:18:26.0666562Z             "HTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 17:18:22 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})", 
2026-09-16T17:18:26.0666814Z             "HTTP response body: ", 
2026-09-16T17:18:26.0666924Z             "{", 
2026-09-16T17:18:26.0667032Z             "\"errors\" : ", 
2026-09-16T17:18:26.0667125Z             "[", 
2026-09-16T17:18:26.0667231Z             "", 
2026-09-16T17:18:26.0667331Z             "{", 
2026-09-16T17:18:26.0667444Z             "\"code\" : \"AEC_EXCEPTION\",", 
2026-09-16T17:18:26.0667644Z             "\"message\" : \"bad hostname 192.168.231.137,10.188.254.113\"", 
2026-09-16T17:18:26.0667817Z             "}", 
2026-09-16T17:18:26.0667948Z             "]", 
2026-09-16T17:18:26.0668078Z             "}", 
2026-09-16T17:18:26.0668209Z             "", 
2026-09-16T17:18:26.0668357Z             "", 
2026-09-16T17:18:26.0668507Z             "", 
2026-09-16T17:18:26.0668791Z             "nfs_path=/SIIFX_SIISF", 
2026-09-16T17:18:26.0668934Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF", 
2026-09-16T17:18:26.0669210Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /SIIFX_SIISF                        ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T17:18:26.0669502Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA /SIIFX_SIGMS                        ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T17:18:26.0669822Z             "Exception when callin ProtocolsApi->get_nfs_expor: (500)", 
2026-09-16T17:18:26.0670026Z             "Reason: Internal Server Error", 
2026-09-16T17:18:26.0670725Z             "HTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 17:18:24 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})", 
2026-09-16T17:18:26.0671213Z             "HTTP response body: ", 
2026-09-16T17:18:26.0671389Z             "{", 
2026-09-16T17:18:26.0671561Z             "\"errors\" : ", 
2026-09-16T17:18:26.0671712Z             "[", 
2026-09-16T17:18:26.0671856Z             "", 
2026-09-16T17:18:26.0672002Z             "{", 
2026-09-16T17:18:26.0672154Z             "\"code\" : \"AEC_EXCEPTION\",", 
2026-09-16T17:18:26.0672339Z             "\"message\" : \"bad hostname 192.168.231.137,10.188.254.113\"", 
2026-09-16T17:18:26.0672527Z             "}", 
2026-09-16T17:18:26.0672679Z             "]", 
2026-09-16T17:18:26.0672852Z             "}", 
2026-09-16T17:18:26.0673016Z             "", 
2026-09-16T17:18:26.0673152Z             "", 
2026-09-16T17:18:26.0673299Z             "", 
2026-09-16T17:18:26.0673428Z             "nfs_path=/SIIFX_SIGMS", 
2026-09-16T17:18:26.0673580Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA", 
2026-09-16T17:18:26.0673785Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA /SIIFX_SIGMS                        ISILON                              nfsctcnprd.ctc.caixa                des                                "
2026-09-16T17:18:26.0673946Z         ]
2026-09-16T17:18:26.0674043Z     }
2026-09-16T17:18:26.0674136Z }
2026-09-16T17:18:26.0760603Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T17:18:26.0760794Z     "changed": false, 
2026-09-16T17:18:26.0760913Z     "msg": {
2026-09-16T17:18:26.0761028Z         "changed": true, 
2026-09-16T17:18:26.0761155Z         "cmd": [
2026-09-16T17:18:26.0761267Z             "python", 
2026-09-16T17:18:26.0761546Z             "/opt/ads-agent/_work/r13215/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py", 
2026-09-16T17:18:26.0761734Z             "montagem", 
2026-09-16T17:18:26.0761874Z             "siifx-batch-vm", 
2026-09-16T17:18:26.0762003Z             "des", 
2026-09-16T17:18:26.0762114Z             "ctc_nprd", 
2026-09-16T17:18:26.0762301Z             "/opt/ads-agent/_work/r13215/a/esteira-jboss-vm-v2", 
2026-09-16T17:18:26.0762446Z             "C&t@d02", 
2026-09-16T17:18:26.0762636Z             "***", 
2026-09-16T17:18:26.0762761Z             "s736651@corp.caixa.gov.br", 
2026-09-16T17:18:26.0762883Z             "***", 
2026-09-16T17:18:26.0763583Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT_ISILON\": \"/SIIFX\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_3\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT_ISILON_2\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT_ISILON_4\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT_ISILON_4\": \"/SIIFX_SIGMS\"}]"
2026-09-16T17:18:26.0764244Z         ], 
2026-09-16T17:18:26.0764385Z         "delta": "0:00:08.552596", 
2026-09-16T17:18:26.0764586Z         "end": "2026-09-16 14:18:25.955486", 
2026-09-16T17:18:26.0764721Z         "failed": false, 
2026-09-16T17:18:26.0764831Z         "rc": 0, 
2026-09-16T17:18:26.0765005Z         "start": "2026-09-16 14:18:17.402890", 
2026-09-16T17:18:26.0765136Z         "stderr": "", 
2026-09-16T17:18:26.0765254Z         "stderr_lines": [], 
2026-09-16T17:18:26.0770131Z         "stdout": "[{u'NFS_MOUNT_POINT_ISILON': u'/SIIFX', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH'}, {u'NFS_MOUNT_POINT_ISILON_3': u'/SIIFX_SIISF', u'NFS_ENDPOINT_ISILON_3': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF'}, {u'NFS_MOUNT_POINT_ISILON_2': u'/SIIFX_B2B', u'NFS_ENDPOINT_ISILON_2': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX'}, {u'NFS_ENDPOINT_ISILON_4': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA', u'NFS_MOUNT_POINT_ISILON_4': u'/SIIFX_SIGMS'}]\nNome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           \n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH /SIIFX                              ISILON                              nfsctcnprd.ctc.caixa                des                                \nException when callin ProtocolsApi->get_nfs_expor: (500)\nReason: Internal Server Error\nHTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 17:18:18 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})\nHTTP response body: \n{\n\"errors\" : \n[\n\n{\n\"code\" : \"AEC_EXCEPTION\",\n\"message\" : \"bad hostname 192.168.231.137,10.188.254.113\"\n}\n]\n}\n\n\n\nnfs_path=/SIIFX\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH /SIIFX                              ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX /SIIFX_B2B                          ISILON                              nfsctcnprd.ctc.caixa                des                                \nException when callin ProtocolsApi->get_nfs_expor: (500)\nReason: Internal Server Error\nHTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 17:18:20 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})\nHTTP response body: \n{\n\"errors\" : \n[\n\n{\n\"code\" : \"AEC_EXCEPTION\",\n\"message\" : \"bad hostname 192.168.231.137,10.188.254.113\"\n}\n]\n}\n\n\n\nnfs_path=/SIIFX_B2B\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX /SIIFX_B2B                          ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /SIIFX_SIISF                        ISILON                              nfsctcnprd.ctc.caixa                des                                \nException when callin ProtocolsApi->get_nfs_expor: (500)\nReason: Internal Server Error\nHTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 17:18:22 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})\nHTTP response body: \n{\n\"errors\" : \n[\n\n{\n\"code\" : \"AEC_EXCEPTION\",\n\"message\" : \"bad hostname 192.168.231.137,10.188.254.113\"\n}\n]\n}\n\n\n\nnfs_path=/SIIFX_SIISF\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /SIIFX_SIISF                        ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA /SIIFX_SIGMS                        ISILON                              nfsctcnprd.ctc.caixa                des                                \nException when callin ProtocolsApi->get_nfs_expor: (500)\nReason: Internal Server Error\nHTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 17:18:24 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})\nHTTP response body: \n{\n\"errors\" : \n[\n\n{\n\"code\" : \"AEC_EXCEPTION\",\n\"message\" : \"bad hostname 192.168.231.137,10.188.254.113\"\n}\n]\n}\n\n\n\nnfs_path=/SIIFX_SIGMS\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA /SIIFX_SIGMS                        ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T17:18:26.0772384Z         "stdout_lines": [
2026-09-16T17:18:26.0773108Z             "[{u'NFS_MOUNT_POINT_ISILON': u'/SIIFX', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH'}, {u'NFS_MOUNT_POINT_ISILON_3': u'/SIIFX_SIISF', u'NFS_ENDPOINT_ISILON_3': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF'}, {u'NFS_MOUNT_POINT_ISILON_2': u'/SIIFX_B2B', u'NFS_ENDPOINT_ISILON_2': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX'}, {u'NFS_ENDPOINT_ISILON_4': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA', u'NFS_MOUNT_POINT_ISILON_4': u'/SIIFX_SIGMS'}]", 
2026-09-16T17:18:26.0773507Z             "Nome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           ", 
2026-09-16T17:18:26.0773884Z             "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------", 
2026-09-16T17:18:26.0774293Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH /SIIFX                              ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T17:18:26.0774546Z             "Exception when callin ProtocolsApi->get_nfs_expor: (500)", 
2026-09-16T17:18:26.0774706Z             "Reason: Internal Server Error", 
2026-09-16T17:18:26.0775134Z             "HTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 17:18:18 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})", 
2026-09-16T17:18:26.0775368Z             "HTTP response body: ", 
2026-09-16T17:18:26.0775479Z             "{", 
2026-09-16T17:18:26.0775592Z             "\"errors\" : ", 
2026-09-16T17:18:26.0775699Z             "[", 
2026-09-16T17:18:26.0775800Z             "", 
2026-09-16T17:18:26.0775890Z             "{", 
2026-09-16T17:18:26.0776002Z             "\"code\" : \"AEC_EXCEPTION\",", 
2026-09-16T17:18:26.0776143Z             "\"message\" : \"bad hostname 192.168.231.137,10.188.254.113\"", 
2026-09-16T17:18:26.0776332Z             "}", 
2026-09-16T17:18:26.0776429Z             "]", 
2026-09-16T17:18:26.0776596Z             "}", 
2026-09-16T17:18:26.0776696Z             "", 
2026-09-16T17:18:26.0776793Z             "", 
2026-09-16T17:18:26.0776890Z             "", 
2026-09-16T17:18:26.0776998Z             "nfs_path=/SIIFX", 
2026-09-16T17:18:26.0777223Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH", 
2026-09-16T17:18:26.0777585Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH /SIIFX                              ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T17:18:26.0777806Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX /SIIFX_B2B                          ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T17:18:26.0778052Z             "Exception when callin ProtocolsApi->get_nfs_expor: (500)", 
2026-09-16T17:18:26.0778257Z             "Reason: Internal Server Error", 
2026-09-16T17:18:26.0778689Z             "HTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 17:18:20 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})", 
2026-09-16T17:18:26.0778946Z             "HTTP response body: ", 
2026-09-16T17:18:26.0779057Z             "{", 
2026-09-16T17:18:26.0779164Z             "\"errors\" : ", 
2026-09-16T17:18:26.0779264Z             "[", 
2026-09-16T17:18:26.0779352Z             "", 
2026-09-16T17:18:26.0779449Z             "{", 
2026-09-16T17:18:26.0779559Z             "\"code\" : \"AEC_EXCEPTION\",", 
2026-09-16T17:18:26.0779699Z             "\"message\" : \"bad hostname 192.168.231.137,10.188.254.113\"", 
2026-09-16T17:18:26.0779828Z             "}", 
2026-09-16T17:18:26.0779927Z             "]", 
2026-09-16T17:18:26.0780021Z             "}", 
2026-09-16T17:18:26.0780119Z             "", 
2026-09-16T17:18:26.0780220Z             "", 
2026-09-16T17:18:26.0780316Z             "", 
2026-09-16T17:18:26.0780428Z             "nfs_path=/SIIFX_B2B", 
2026-09-16T17:18:26.0780564Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX", 
2026-09-16T17:18:26.0780832Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX /SIIFX_B2B                          ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T17:18:26.0781063Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /SIIFX_SIISF                        ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T17:18:26.0781313Z             "Exception when callin ProtocolsApi->get_nfs_expor: (500)", 
2026-09-16T17:18:26.0781457Z             "Reason: Internal Server Error", 
2026-09-16T17:18:26.0781862Z             "HTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 17:18:22 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})", 
2026-09-16T17:18:26.0782111Z             "HTTP response body: ", 
2026-09-16T17:18:26.0782207Z             "{", 
2026-09-16T17:18:26.0782309Z             "\"errors\" : ", 
2026-09-16T17:18:26.0782412Z             "[", 
2026-09-16T17:18:26.0782509Z             "", 
2026-09-16T17:18:26.0782606Z             "{", 
2026-09-16T17:18:26.0782715Z             "\"code\" : \"AEC_EXCEPTION\",", 
2026-09-16T17:18:26.0782856Z             "\"message\" : \"bad hostname 192.168.231.137,10.188.254.113\"", 
2026-09-16T17:18:26.0782981Z             "}", 
2026-09-16T17:18:26.0783169Z             "]", 
2026-09-16T17:18:26.0783267Z             "}", 
2026-09-16T17:18:26.0783364Z             "", 
2026-09-16T17:18:26.0783449Z             "", 
2026-09-16T17:18:26.0783550Z             "", 
2026-09-16T17:18:26.0783662Z             "nfs_path=/SIIFX_SIISF", 
2026-09-16T17:18:26.0783805Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF", 
2026-09-16T17:18:26.0783993Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /SIIFX_SIISF                        ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T17:18:26.0784282Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA /SIIFX_SIGMS                        ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T17:18:26.0784616Z             "Exception when callin ProtocolsApi->get_nfs_expor: (500)", 
2026-09-16T17:18:26.0784822Z             "Reason: Internal Server Error", 
2026-09-16T17:18:26.0785371Z             "HTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 17:18:24 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})", 
2026-09-16T17:18:26.0785814Z             "HTTP response body: ", 
2026-09-16T17:18:26.0785975Z             "{", 
2026-09-16T17:18:26.0786113Z             "\"errors\" : ", 
2026-09-16T17:18:26.0786222Z             "[", 
2026-09-16T17:18:26.0786322Z             "", 
2026-09-16T17:18:26.0786420Z             "{", 
2026-09-16T17:18:26.0786629Z             "\"code\" : \"AEC_EXCEPTION\",", 
2026-09-16T17:18:26.0786775Z             "\"message\" : \"bad hostname 192.168.231.137,10.188.254.113\"", 
2026-09-16T17:18:26.0786946Z             "}", 
2026-09-16T17:18:26.0787096Z             "]", 
2026-09-16T17:18:26.0787227Z             "}", 
2026-09-16T17:18:26.0787366Z             "", 
2026-09-16T17:18:26.0787465Z             "", 
2026-09-16T17:18:26.0787564Z             "", 
2026-09-16T17:18:26.0787679Z             "nfs_path=/SIIFX_SIGMS", 
2026-09-16T17:18:26.0787829Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA", 
2026-09-16T17:18:26.0788105Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA /SIIFX_SIGMS                        ISILON                              nfsctcnprd.ctc.caixa                des                                "
2026-09-16T17:18:26.0788267Z         ]
2026-09-16T17:18:26.0788365Z     }
2026-09-16T17:18:26.0788463Z }
2026-09-16T17:18:26.0809242Z Wednesday 16 September 2026  14:18:26 -0300 (0:00:00.095)       0:00:10.900 *** 
2026-09-16T17:18:26.4494334Z 
2026-09-16T17:18:26.4495066Z TASK [nfs : execute clean json] ************************************************
2026-09-16T17:18:26.4498468Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-09-16T17:18:26.4499080Z caddeapllx1214.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-09-16T17:18:26.4499276Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-09-16T17:18:26.4499478Z releases. A future Ansible release will default to using the discovered 
2026-09-16T17:18:26.4500830Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-09-16T17:18:26.4501073Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-09-16T17:18:26.4501258Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-09-16T17:18:26.4501421Z setting deprecation_warnings=False in ansible.cfg.
2026-09-16T17:18:26.4501584Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:18:26.4600715Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-09-16T17:18:26.4601143Z caddeapllx2798.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-09-16T17:18:26.4601786Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-09-16T17:18:26.4601963Z releases. A future Ansible release will default to using the discovered 
2026-09-16T17:18:26.4602153Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-09-16T17:18:26.4602334Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-09-16T17:18:26.4602507Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-09-16T17:18:26.4602670Z setting deprecation_warnings=False in ansible.cfg.
2026-09-16T17:18:26.4602820Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:18:26.4636775Z Wednesday 16 September 2026  14:18:26 -0300 (0:00:00.382)       0:00:11.283 *** 
2026-09-16T17:18:26.5281281Z 
2026-09-16T17:18:26.5282002Z TASK [nfs : result_new_string_json] ********************************************
2026-09-16T17:18:26.5284266Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br] => {
2026-09-16T17:18:26.5286800Z     "msg": {
2026-09-16T17:18:26.5287308Z         "ansible_facts": {
2026-09-16T17:18:26.5287636Z             "discovered_interpreter_python": "/usr/bin/python"
2026-09-16T17:18:26.5288352Z         }, 
2026-09-16T17:18:26.5288803Z         "changed": true, 
2026-09-16T17:18:26.5289997Z         "cmd": "echo '[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT_ISILON\": \"/SIIFX\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_3\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT_ISILON_2\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT_ISILON_4\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT_ISILON_4\": \"/SIIFX_SIGMS\"}]' | sed 's/NFS_ENDPOINT_ISILON[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_ISILON[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_HUAWEI[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_HUAWEI[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_VM[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_VM[^\"]*/NFS_MOUNT_POINT/g'", 
2026-09-16T17:18:26.5290713Z         "delta": "0:00:00.003615", 
2026-09-16T17:18:26.5290847Z         "deprecations": [
2026-09-16T17:18:26.5290961Z             {
2026-09-16T17:18:26.5291498Z                 "msg": "Distribution rhel 9.3 on host caddeapllx1214.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, but is using /usr/bin/python for backward compatibility with prior Ansible releases. A future Ansible release will default to using the discovered platform python for this host. See https://docs.ansible.com/ansible/2.9/reference_appendices/interpreter_discovery.html for more information", 
2026-09-16T17:18:26.5291810Z                 "version": "2.12"
2026-09-16T17:18:26.5291926Z             }
2026-09-16T17:18:26.5292032Z         ], 
2026-09-16T17:18:26.5292211Z         "end": "2026-09-16 14:18:26.430434", 
2026-09-16T17:18:26.5292345Z         "failed": false, 
2026-09-16T17:18:26.5292463Z         "rc": 0, 
2026-09-16T17:18:26.5292626Z         "start": "2026-09-16 14:18:26.426819", 
2026-09-16T17:18:26.5292758Z         "stderr": "", 
2026-09-16T17:18:26.5292885Z         "stderr_lines": [], 
2026-09-16T17:18:26.5293541Z         "stdout": "[{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT\": \"/SIIFX\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT\": \"/SIIFX_SIGMS\"}]", 
2026-09-16T17:18:26.5293867Z         "stdout_lines": [
2026-09-16T17:18:26.5294501Z             "[{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT\": \"/SIIFX\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT\": \"/SIIFX_SIGMS\"}]"
2026-09-16T17:18:26.5295083Z         ]
2026-09-16T17:18:26.5295184Z     }
2026-09-16T17:18:26.5295270Z }
2026-09-16T17:18:26.5376422Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T17:18:26.5377096Z     "msg": {
2026-09-16T17:18:26.5377672Z         "ansible_facts": {
2026-09-16T17:18:26.5377868Z             "discovered_interpreter_python": "/usr/bin/python"
2026-09-16T17:18:26.5378039Z         }, 
2026-09-16T17:18:26.5378180Z         "changed": true, 
2026-09-16T17:18:26.5379359Z         "cmd": "echo '[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT_ISILON\": \"/SIIFX\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_3\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT_ISILON_2\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT_ISILON_4\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT_ISILON_4\": \"/SIIFX_SIGMS\"}]' | sed 's/NFS_ENDPOINT_ISILON[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_ISILON[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_HUAWEI[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_HUAWEI[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_VM[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_VM[^\"]*/NFS_MOUNT_POINT/g'", 
2026-09-16T17:18:26.5380246Z         "delta": "0:00:00.003229", 
2026-09-16T17:18:26.5380367Z         "deprecations": [
2026-09-16T17:18:26.5380479Z             {
2026-09-16T17:18:26.5381036Z                 "msg": "Distribution rhel 9.3 on host caddeapllx2798.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, but is using /usr/bin/python for backward compatibility with prior Ansible releases. A future Ansible release will default to using the discovered platform python for this host. See https://docs.ansible.com/ansible/2.9/reference_appendices/interpreter_discovery.html for more information", 
2026-09-16T17:18:26.5381405Z                 "version": "2.12"
2026-09-16T17:18:26.5381546Z             }
2026-09-16T17:18:26.5381653Z         ], 
2026-09-16T17:18:26.5381833Z         "end": "2026-09-16 14:18:26.441631", 
2026-09-16T17:18:26.5381966Z         "failed": false, 
2026-09-16T17:18:26.5382080Z         "rc": 0, 
2026-09-16T17:18:26.5382256Z         "start": "2026-09-16 14:18:26.438402", 
2026-09-16T17:18:26.5382381Z         "stderr": "", 
2026-09-16T17:18:26.5382497Z         "stderr_lines": [], 
2026-09-16T17:18:26.5383187Z         "stdout": "[{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT\": \"/SIIFX\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT\": \"/SIIFX_SIGMS\"}]", 
2026-09-16T17:18:26.5383609Z         "stdout_lines": [
2026-09-16T17:18:26.5384253Z             "[{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT\": \"/SIIFX\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT\": \"/SIIFX_SIGMS\"}]"
2026-09-16T17:18:26.5384747Z         ]
2026-09-16T17:18:26.5384850Z     }
2026-09-16T17:18:26.5384952Z }
2026-09-16T17:18:26.5415995Z Wednesday 16 September 2026  14:18:26 -0300 (0:00:00.077)       0:00:11.361 *** 
2026-09-16T17:18:26.6063114Z 
2026-09-16T17:18:26.6063954Z TASK [nfs : Parse JSON data] ***************************************************
2026-09-16T17:18:26.6064297Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:18:26.6137625Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:18:26.6178100Z Wednesday 16 September 2026  14:18:26 -0300 (0:00:00.076)       0:00:11.437 *** 
2026-09-16T17:18:26.6820345Z 
2026-09-16T17:18:26.6821255Z TASK [nfs : result_new_json] ***************************************************
2026-09-16T17:18:26.6822562Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br] => {
2026-09-16T17:18:26.6822863Z     "msg": [
2026-09-16T17:18:26.6823535Z         {
2026-09-16T17:18:26.6824060Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH", 
2026-09-16T17:18:26.6824257Z             "NFS_MOUNT_POINT": "/SIIFX"
2026-09-16T17:18:26.6824386Z         }, 
2026-09-16T17:18:26.6824499Z         {
2026-09-16T17:18:26.6825020Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF", 
2026-09-16T17:18:26.6825199Z             "NFS_MOUNT_POINT": "/SIIFX_SIISF"
2026-09-16T17:18:26.6825323Z         }, 
2026-09-16T17:18:26.6825433Z         {
2026-09-16T17:18:26.6825588Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX", 
2026-09-16T17:18:26.6825761Z             "NFS_MOUNT_POINT": "/SIIFX_B2B"
2026-09-16T17:18:26.6825865Z         }, 
2026-09-16T17:18:26.6825979Z         {
2026-09-16T17:18:26.6826134Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA", 
2026-09-16T17:18:26.6826305Z             "NFS_MOUNT_POINT": "/SIIFX_SIGMS"
2026-09-16T17:18:26.6826418Z         }
2026-09-16T17:18:26.6826618Z     ]
2026-09-16T17:18:26.6826731Z }
2026-09-16T17:18:26.6877169Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T17:18:26.6877354Z     "msg": [
2026-09-16T17:18:26.6877466Z         {
2026-09-16T17:18:26.6877800Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH", 
2026-09-16T17:18:26.6877978Z             "NFS_MOUNT_POINT": "/SIIFX"
2026-09-16T17:18:26.6878097Z         }, 
2026-09-16T17:18:26.6878184Z         {
2026-09-16T17:18:26.6878338Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF", 
2026-09-16T17:18:26.6878496Z             "NFS_MOUNT_POINT": "/SIIFX_SIISF"
2026-09-16T17:18:26.6878617Z         }, 
2026-09-16T17:18:26.6878728Z         {
2026-09-16T17:18:26.6878879Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX", 
2026-09-16T17:18:26.6879034Z             "NFS_MOUNT_POINT": "/SIIFX_B2B"
2026-09-16T17:18:26.6879154Z         }, 
2026-09-16T17:18:26.6879252Z         {
2026-09-16T17:18:26.6879405Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA", 
2026-09-16T17:18:26.6879568Z             "NFS_MOUNT_POINT": "/SIIFX_SIGMS"
2026-09-16T17:18:26.6879689Z         }
2026-09-16T17:18:26.6879788Z     ]
2026-09-16T17:18:26.6879877Z }
2026-09-16T17:18:26.6908065Z Wednesday 16 September 2026  14:18:26 -0300 (0:00:00.073)       0:00:11.510 *** 
2026-09-16T17:18:26.7795122Z included: /opt/ads-agent/_work/r13215/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx1214.agil.nprd.caixa.gov.br, caddeapllx2798.agil.nprd.caixa.gov.br
2026-09-16T17:18:26.7871050Z included: /opt/ads-agent/_work/r13215/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx1214.agil.nprd.caixa.gov.br, caddeapllx2798.agil.nprd.caixa.gov.br
2026-09-16T17:18:26.7943621Z included: /opt/ads-agent/_work/r13215/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx1214.agil.nprd.caixa.gov.br, caddeapllx2798.agil.nprd.caixa.gov.br
2026-09-16T17:18:26.8015632Z included: /opt/ads-agent/_work/r13215/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx1214.agil.nprd.caixa.gov.br, caddeapllx2798.agil.nprd.caixa.gov.br
2026-09-16T17:18:26.8103644Z Wednesday 16 September 2026  14:18:26 -0300 (0:00:00.119)       0:00:11.629 *** 
2026-09-16T17:18:26.8699028Z 
2026-09-16T17:18:26.8699725Z TASK [nfs : Parse JSON data] ***************************************************
2026-09-16T17:18:26.8699906Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:18:26.8770095Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:18:26.8808061Z Wednesday 16 September 2026  14:18:26 -0300 (0:00:00.070)       0:00:11.700 *** 
2026-09-16T17:18:26.9390318Z 
2026-09-16T17:18:26.9391055Z TASK [nfs : debug] *************************************************************
2026-09-16T17:18:26.9391244Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br] => {
2026-09-16T17:18:26.9391394Z     "msg": {
2026-09-16T17:18:26.9391861Z         "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH", 
2026-09-16T17:18:26.9392075Z         "NFS_MOUNT_POINT": "/SIIFX"
2026-09-16T17:18:26.9392210Z     }
2026-09-16T17:18:26.9392809Z }
2026-09-16T17:18:26.9474531Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T17:18:26.9474717Z     "msg": {
2026-09-16T17:18:26.9478424Z         "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH", 
2026-09-16T17:18:26.9478643Z         "NFS_MOUNT_POINT": "/SIIFX"
2026-09-16T17:18:26.9478769Z     }
2026-09-16T17:18:26.9478874Z }
2026-09-16T17:18:26.9512570Z Wednesday 16 September 2026  14:18:26 -0300 (0:00:00.070)       0:00:11.770 *** 
2026-09-16T17:18:27.0230911Z 
2026-09-16T17:18:27.0231833Z TASK [nfs : debug] *************************************************************
2026-09-16T17:18:27.0232084Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T17:18:27.0232333Z     "msg": "/SIIFX"
2026-09-16T17:18:27.0232495Z }
2026-09-16T17:18:27.0232694Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br] => {
2026-09-16T17:18:27.0232933Z     "msg": "/SIIFX"
2026-09-16T17:18:27.0233084Z }
2026-09-16T17:18:27.0271637Z Wednesday 16 September 2026  14:18:27 -0300 (0:00:00.075)       0:00:11.846 *** 
2026-09-16T17:18:27.0872070Z 
2026-09-16T17:18:27.0872882Z TASK [nfs : debug] *************************************************************
2026-09-16T17:18:27.0873078Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br] => {
2026-09-16T17:18:27.0873537Z     "msg": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH"
2026-09-16T17:18:27.0873686Z }
2026-09-16T17:18:27.0940406Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T17:18:27.0940869Z     "msg": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH"
2026-09-16T17:18:27.0941013Z }
2026-09-16T17:18:27.0985067Z Wednesday 16 September 2026  14:18:27 -0300 (0:00:00.071)       0:00:11.917 *** 
2026-09-16T17:18:27.1661100Z 
2026-09-16T17:18:27.1661832Z TASK [nfs : Verificando as variaveis] ******************************************
2026-09-16T17:18:27.1662055Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br] => {
2026-09-16T17:18:27.1662200Z     "changed": false, 
2026-09-16T17:18:27.1662349Z     "msg": "All assertions passed"
2026-09-16T17:18:27.1662466Z }
2026-09-16T17:18:27.1709472Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T17:18:27.1709647Z     "changed": false, 
2026-09-16T17:18:27.1709784Z     "msg": "All assertions passed"
2026-09-16T17:18:27.1709896Z }
2026-09-16T17:18:27.1751709Z Wednesday 16 September 2026  14:18:27 -0300 (0:00:00.076)       0:00:11.994 *** 
2026-09-16T17:18:30.3887418Z 
2026-09-16T17:18:30.3888132Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-09-16T17:18:30.3888320Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:18:30.5985520Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:18:30.6031033Z Wednesday 16 September 2026  14:18:30 -0300 (0:00:03.428)       0:00:15.422 *** 
2026-09-16T17:18:31.3472393Z 
2026-09-16T17:18:31.3473951Z TASK [nfs : Install networker lgtoclnt_url] ************************************
2026-09-16T17:18:31.3474706Z [WARNING]: Consider using the yum, dnf or zypper module rather than running
2026-09-16T17:18:31.3475235Z 'rpm'.  If you need to use command because yum, dnf or zypper is insufficient
2026-09-16T17:18:31.3475473Z you can add 'warn: false' to this command task or set 'command_warnings=False'
2026-09-16T17:18:31.3475665Z in ansible.cfg to get rid of this message.
2026-09-16T17:18:31.3477009Z fatal: [caddeapllx2798.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.477223", "end": "2026-09-16 14:18:31.327199", "msg": "non-zero return code", "rc": 1, "start": "2026-09-16 14:18:30.849976", "stderr": "aviso: /var/tmp/rpm-tmp.KdwUTY: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.KdwUTY: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-09-16T17:18:31.3478076Z ...ignoring
2026-09-16T17:18:33.4591434Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:18:33.4630213Z Wednesday 16 September 2026  14:18:33 -0300 (0:00:02.859)       0:00:18.282 *** 
2026-09-16T17:18:34.1442840Z 
2026-09-16T17:18:34.1443855Z TASK [nfs : Install networker lgtonmda_url] ************************************
2026-09-16T17:18:34.1448457Z fatal: [caddeapllx2798.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.420449", "end": "2026-09-16 14:18:34.126409", "msg": "non-zero return code", "rc": 1, "start": "2026-09-16 14:18:33.705960", "stderr": "aviso: /var/tmp/rpm-tmp.MlgrH0: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.MlgrH0: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-09-16T17:18:34.1449297Z ...ignoring
2026-09-16T17:18:35.9384845Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:18:35.9429539Z Wednesday 16 September 2026  14:18:35 -0300 (0:00:02.479)       0:00:20.762 *** 
2026-09-16T17:18:36.4042825Z 
2026-09-16T17:18:36.4044240Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-09-16T17:18:36.4044465Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:18:36.4050276Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:18:36.4095282Z Wednesday 16 September 2026  14:18:36 -0300 (0:00:00.466)       0:00:21.229 *** 
2026-09-16T17:18:36.6603881Z 
2026-09-16T17:18:36.6605016Z TASK [nfs : Create a symbolic link] ********************************************
2026-09-16T17:18:36.6605681Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:18:36.6608787Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:18:36.6655542Z Wednesday 16 September 2026  14:18:36 -0300 (0:00:00.255)       0:00:21.485 *** 
2026-09-16T17:18:37.6137772Z 
2026-09-16T17:18:37.6139066Z TASK [nfs : Networker | Start networker] ***************************************
2026-09-16T17:18:37.6139522Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:18:37.7712594Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:18:37.7760720Z Wednesday 16 September 2026  14:18:37 -0300 (0:00:01.110)       0:00:22.595 *** 
2026-09-16T17:18:38.0427380Z 
2026-09-16T17:18:38.0428640Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-09-16T17:18:38.0428877Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:18:38.0538197Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:18:38.0562517Z Wednesday 16 September 2026  14:18:38 -0300 (0:00:00.280)       0:00:22.875 *** 
2026-09-16T17:18:48.4509801Z 
2026-09-16T17:18:48.4510379Z TASK [nfs : Networker | Restart networker] *************************************
2026-09-16T17:18:48.4510558Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:18:48.4787376Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:18:48.4821153Z Wednesday 16 September 2026  14:18:48 -0300 (0:00:10.425)       0:00:33.301 *** 
2026-09-16T17:18:48.9187695Z 
2026-09-16T17:18:48.9188432Z TASK [nfs : Montando volume remoto] ********************************************
2026-09-16T17:18:48.9188708Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:18:49.2248545Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:18:49.2282725Z Wednesday 16 September 2026  14:18:49 -0300 (0:00:00.746)       0:00:34.047 *** 
2026-09-16T17:18:49.2807536Z Wednesday 16 September 2026  14:18:49 -0300 (0:00:00.052)       0:00:34.100 *** 
2026-09-16T17:18:49.3403891Z 
2026-09-16T17:18:49.3404853Z TASK [nfs : Parse JSON data] ***************************************************
2026-09-16T17:18:49.3405537Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:18:49.3441646Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:18:49.3480763Z Wednesday 16 September 2026  14:18:49 -0300 (0:00:00.067)       0:00:34.167 *** 
2026-09-16T17:18:49.4055856Z 
2026-09-16T17:18:49.4057334Z TASK [nfs : debug] *************************************************************
2026-09-16T17:18:49.4057867Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br] => {
2026-09-16T17:18:49.4058004Z     "msg": {
2026-09-16T17:18:49.4058162Z         "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF", 
2026-09-16T17:18:49.4058327Z         "NFS_MOUNT_POINT": "/SIIFX_SIISF"
2026-09-16T17:18:49.4058504Z     }
2026-09-16T17:18:49.4058604Z }
2026-09-16T17:18:49.4130713Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T17:18:49.4130921Z     "msg": {
2026-09-16T17:18:49.4131086Z         "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF", 
2026-09-16T17:18:49.4131278Z         "NFS_MOUNT_POINT": "/SIIFX_SIISF"
2026-09-16T17:18:49.4131394Z     }
2026-09-16T17:18:49.4131493Z }
2026-09-16T17:18:49.4166342Z Wednesday 16 September 2026  14:18:49 -0300 (0:00:00.068)       0:00:34.236 *** 
2026-09-16T17:18:49.4762752Z 
2026-09-16T17:18:49.4763346Z TASK [nfs : debug] *************************************************************
2026-09-16T17:18:49.4763598Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br] => {
2026-09-16T17:18:49.4763762Z     "msg": "/SIIFX_SIISF"
2026-09-16T17:18:49.4763869Z }
2026-09-16T17:18:49.4800589Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T17:18:49.4800740Z     "msg": "/SIIFX_SIISF"
2026-09-16T17:18:49.4800837Z }
2026-09-16T17:18:49.4836387Z Wednesday 16 September 2026  14:18:49 -0300 (0:00:00.066)       0:00:34.303 *** 
2026-09-16T17:18:49.5411278Z 
2026-09-16T17:18:49.5411830Z TASK [nfs : debug] *************************************************************
2026-09-16T17:18:49.5412007Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br] => {
2026-09-16T17:18:49.5412517Z     "msg": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF"
2026-09-16T17:18:49.5412668Z }
2026-09-16T17:18:49.5450270Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T17:18:49.5450475Z     "msg": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF"
2026-09-16T17:18:49.5450620Z }
2026-09-16T17:18:49.5485491Z Wednesday 16 September 2026  14:18:49 -0300 (0:00:00.064)       0:00:34.368 *** 
2026-09-16T17:18:49.6084731Z 
2026-09-16T17:18:49.6085559Z TASK [nfs : Verificando as variaveis] ******************************************
2026-09-16T17:18:49.6085894Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br] => {
2026-09-16T17:18:49.6087085Z     "changed": false, 
2026-09-16T17:18:49.6087261Z     "msg": "All assertions passed"
2026-09-16T17:18:49.6087375Z }
2026-09-16T17:18:49.6155259Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T17:18:49.6155428Z     "changed": false, 
2026-09-16T17:18:49.6155585Z     "msg": "All assertions passed"
2026-09-16T17:18:49.6155702Z }
2026-09-16T17:18:49.6201262Z Wednesday 16 September 2026  14:18:49 -0300 (0:00:00.070)       0:00:34.438 *** 
2026-09-16T17:18:52.1066678Z 
2026-09-16T17:18:52.1067325Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-09-16T17:18:52.1067504Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:18:52.1590134Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:18:52.1622478Z Wednesday 16 September 2026  14:18:52 -0300 (0:00:02.543)       0:00:36.981 *** 
2026-09-16T17:18:52.8860637Z 
2026-09-16T17:18:52.8861749Z TASK [nfs : Install networker lgtoclnt_url] ************************************
2026-09-16T17:18:52.8866675Z fatal: [caddeapllx1214.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.482168", "end": "2026-09-16 14:18:52.870090", "msg": "non-zero return code", "rc": 1, "start": "2026-09-16 14:18:52.387922", "stderr": "aviso: /var/tmp/rpm-tmp.YgCGyd: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.YgCGyd: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-09-16T17:18:52.8867339Z ...ignoring
2026-09-16T17:18:52.9629367Z fatal: [caddeapllx2798.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.532894", "end": "2026-09-16 14:18:52.946530", "msg": "non-zero return code", "rc": 1, "start": "2026-09-16 14:18:52.413636", "stderr": "aviso: /var/tmp/rpm-tmp.JWq4Tb: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.JWq4Tb: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-09-16T17:18:52.9630487Z ...ignoring
2026-09-16T17:18:52.9662489Z Wednesday 16 September 2026  14:18:52 -0300 (0:00:00.804)       0:00:37.785 *** 
2026-09-16T17:18:53.6593548Z 
2026-09-16T17:18:53.6594745Z TASK [nfs : Install networker lgtonmda_url] ************************************
2026-09-16T17:18:53.6600320Z fatal: [caddeapllx1214.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.438435", "end": "2026-09-16 14:18:53.643016", "msg": "non-zero return code", "rc": 1, "start": "2026-09-16 14:18:53.204581", "stderr": "aviso: /var/tmp/rpm-tmp.dc5emk: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.dc5emk: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-09-16T17:18:53.6602341Z ...ignoring
2026-09-16T17:18:54.6597391Z fatal: [caddeapllx2798.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:01.436247", "end": "2026-09-16 14:18:54.642298", "msg": "non-zero return code", "rc": 1, "start": "2026-09-16 14:18:53.206051", "stderr": "aviso: /var/tmp/rpm-tmp.VOOqlJ: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.VOOqlJ: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-09-16T17:18:54.6598382Z ...ignoring
2026-09-16T17:18:54.6635547Z Wednesday 16 September 2026  14:18:54 -0300 (0:00:01.697)       0:00:39.482 *** 
2026-09-16T17:18:54.9110851Z 
2026-09-16T17:18:54.9112015Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-09-16T17:18:54.9112290Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:18:54.9159374Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:18:54.9188385Z Wednesday 16 September 2026  14:18:54 -0300 (0:00:00.255)       0:00:39.738 *** 
2026-09-16T17:18:55.1635155Z 
2026-09-16T17:18:55.1636679Z TASK [nfs : Create a symbolic link] ********************************************
2026-09-16T17:18:55.1636861Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:18:55.1658200Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:18:55.1690092Z Wednesday 16 September 2026  14:18:55 -0300 (0:00:00.250)       0:00:39.988 *** 
2026-09-16T17:18:55.7827797Z 
2026-09-16T17:18:55.7828750Z TASK [nfs : Networker | Start networker] ***************************************
2026-09-16T17:18:55.7828959Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:18:55.7915487Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:18:55.7965590Z Wednesday 16 September 2026  14:18:55 -0300 (0:00:00.627)       0:00:40.616 *** 
2026-09-16T17:18:56.0500556Z 
2026-09-16T17:18:56.0501562Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-09-16T17:18:56.0501801Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:18:56.0640036Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:18:56.0671685Z Wednesday 16 September 2026  14:18:56 -0300 (0:00:00.270)       0:00:40.886 *** 
2026-09-16T17:19:06.4622481Z 
2026-09-16T17:19:06.4623617Z TASK [nfs : Networker | Restart networker] *************************************
2026-09-16T17:19:06.4623885Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:19:06.4963636Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:19:06.5012884Z Wednesday 16 September 2026  14:19:06 -0300 (0:00:10.434)       0:00:51.320 *** 
2026-09-16T17:19:06.7797399Z 
2026-09-16T17:19:06.7797725Z TASK [nfs : Montando volume remoto] ********************************************
2026-09-16T17:19:06.7797905Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:19:07.0230322Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:19:07.0266183Z Wednesday 16 September 2026  14:19:07 -0300 (0:00:00.525)       0:00:51.846 *** 
2026-09-16T17:19:07.0780211Z Wednesday 16 September 2026  14:19:07 -0300 (0:00:00.051)       0:00:51.897 *** 
2026-09-16T17:19:07.1343580Z 
2026-09-16T17:19:07.1344117Z TASK [nfs : Parse JSON data] ***************************************************
2026-09-16T17:19:07.1344341Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:19:07.1424645Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:19:07.1457866Z Wednesday 16 September 2026  14:19:07 -0300 (0:00:00.068)       0:00:51.965 *** 
2026-09-16T17:19:07.2013777Z 
2026-09-16T17:19:07.2014417Z TASK [nfs : debug] *************************************************************
2026-09-16T17:19:07.2014612Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br] => {
2026-09-16T17:19:07.2014766Z     "msg": {
2026-09-16T17:19:07.2014926Z         "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX", 
2026-09-16T17:19:07.2015100Z         "NFS_MOUNT_POINT": "/SIIFX_B2B"
2026-09-16T17:19:07.2017711Z     }
2026-09-16T17:19:07.2017902Z }
2026-09-16T17:19:07.2089366Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T17:19:07.2089538Z     "msg": {
2026-09-16T17:19:07.2089697Z         "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX", 
2026-09-16T17:19:07.2089868Z         "NFS_MOUNT_POINT": "/SIIFX_B2B"
2026-09-16T17:19:07.2089985Z     }
2026-09-16T17:19:07.2090085Z }
2026-09-16T17:19:07.2124611Z Wednesday 16 September 2026  14:19:07 -0300 (0:00:00.066)       0:00:52.031 *** 
2026-09-16T17:19:07.2673385Z 
2026-09-16T17:19:07.2674362Z TASK [nfs : debug] *************************************************************
2026-09-16T17:19:07.2674776Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br] => {
2026-09-16T17:19:07.2674948Z     "msg": "/SIIFX_B2B"
2026-09-16T17:19:07.2675059Z }
2026-09-16T17:19:07.2737619Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T17:19:07.2737815Z     "msg": "/SIIFX_B2B"
2026-09-16T17:19:07.2737944Z }
2026-09-16T17:19:07.2774377Z Wednesday 16 September 2026  14:19:07 -0300 (0:00:00.064)       0:00:52.096 *** 
2026-09-16T17:19:07.3333075Z 
2026-09-16T17:19:07.3333710Z TASK [nfs : debug] *************************************************************
2026-09-16T17:19:07.3333904Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br] => {
2026-09-16T17:19:07.3334074Z     "msg": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX"
2026-09-16T17:19:07.3334215Z }
2026-09-16T17:19:07.3404949Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T17:19:07.3405164Z     "msg": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX"
2026-09-16T17:19:07.3405307Z }
2026-09-16T17:19:07.3438573Z Wednesday 16 September 2026  14:19:07 -0300 (0:00:00.066)       0:00:52.163 *** 
2026-09-16T17:19:07.4041441Z 
2026-09-16T17:19:07.4042053Z TASK [nfs : Verificando as variaveis] ******************************************
2026-09-16T17:19:07.4042264Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br] => {
2026-09-16T17:19:07.4042408Z     "changed": false, 
2026-09-16T17:19:07.4042536Z     "msg": "All assertions passed"
2026-09-16T17:19:07.4042649Z }
2026-09-16T17:19:07.4112820Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T17:19:07.4113330Z     "changed": false, 
2026-09-16T17:19:07.4113612Z     "msg": "All assertions passed"
2026-09-16T17:19:07.4113730Z }
2026-09-16T17:19:07.4146744Z Wednesday 16 September 2026  14:19:07 -0300 (0:00:00.070)       0:00:52.234 *** 
2026-09-16T17:19:09.8362993Z 
2026-09-16T17:19:09.8363590Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-09-16T17:19:09.8363760Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:19:09.9694819Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:19:09.9734519Z Wednesday 16 September 2026  14:19:09 -0300 (0:00:02.558)       0:00:54.792 *** 
2026-09-16T17:19:10.7129485Z 
2026-09-16T17:19:10.7130227Z TASK [nfs : Install networker lgtoclnt_url] ************************************
2026-09-16T17:19:10.7134279Z fatal: [caddeapllx1214.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.479582", "end": "2026-09-16 14:19:10.695220", "msg": "non-zero return code", "rc": 1, "start": "2026-09-16 14:19:10.215638", "stderr": "aviso: /var/tmp/rpm-tmp.79c7UG: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.79c7UG: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-09-16T17:19:10.7135354Z ...ignoring
2026-09-16T17:19:10.7488204Z fatal: [caddeapllx2798.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.486463", "end": "2026-09-16 14:19:10.731418", "msg": "non-zero return code", "rc": 1, "start": "2026-09-16 14:19:10.244955", "stderr": "aviso: /var/tmp/rpm-tmp.J851ww: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.J851ww: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-09-16T17:19:10.7489427Z ...ignoring
2026-09-16T17:19:10.7540806Z Wednesday 16 September 2026  14:19:10 -0300 (0:00:00.780)       0:00:55.573 *** 
2026-09-16T17:19:11.4468808Z 
2026-09-16T17:19:11.4469736Z TASK [nfs : Install networker lgtonmda_url] ************************************
2026-09-16T17:19:11.4475664Z fatal: [caddeapllx1214.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.424364", "end": "2026-09-16 14:19:11.429575", "msg": "non-zero return code", "rc": 1, "start": "2026-09-16 14:19:11.005211", "stderr": "aviso: /var/tmp/rpm-tmp.VMBTLt: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.VMBTLt: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-09-16T17:19:11.4477094Z ...ignoring
2026-09-16T17:19:11.4534257Z fatal: [caddeapllx2798.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.423808", "end": "2026-09-16 14:19:11.436500", "msg": "non-zero return code", "rc": 1, "start": "2026-09-16 14:19:11.012692", "stderr": "aviso: /var/tmp/rpm-tmp.6b5Btc: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.6b5Btc: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-09-16T17:19:11.4535107Z ...ignoring
2026-09-16T17:19:11.4573354Z Wednesday 16 September 2026  14:19:11 -0300 (0:00:00.703)       0:00:56.276 *** 
2026-09-16T17:19:11.7054138Z 
2026-09-16T17:19:11.7055360Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-09-16T17:19:11.7055589Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:19:11.7063011Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:19:11.7104317Z Wednesday 16 September 2026  14:19:11 -0300 (0:00:00.253)       0:00:56.529 *** 
2026-09-16T17:19:11.9569832Z 
2026-09-16T17:19:11.9570948Z TASK [nfs : Create a symbolic link] ********************************************
2026-09-16T17:19:11.9571177Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:19:11.9605752Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:19:11.9648708Z Wednesday 16 September 2026  14:19:11 -0300 (0:00:00.254)       0:00:56.784 *** 
2026-09-16T17:19:12.5923770Z 
2026-09-16T17:19:12.5924820Z TASK [nfs : Networker | Start networker] ***************************************
2026-09-16T17:19:12.5925075Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:19:12.6132015Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:19:12.6191545Z Wednesday 16 September 2026  14:19:12 -0300 (0:00:00.654)       0:00:57.438 *** 
2026-09-16T17:19:12.8733436Z 
2026-09-16T17:19:12.8734079Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-09-16T17:19:12.8734261Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:19:12.8809131Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:19:12.8846242Z Wednesday 16 September 2026  14:19:12 -0300 (0:00:00.265)       0:00:57.704 *** 
2026-09-16T17:19:23.2772014Z 
2026-09-16T17:19:23.2772586Z TASK [nfs : Networker | Restart networker] *************************************
2026-09-16T17:19:23.2772772Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:19:23.3091310Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:19:23.3127480Z Wednesday 16 September 2026  14:19:23 -0300 (0:00:10.428)       0:01:08.132 *** 
2026-09-16T17:19:23.5978501Z 
2026-09-16T17:19:23.5979540Z TASK [nfs : Montando volume remoto] ********************************************
2026-09-16T17:19:23.5980246Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:19:23.6490582Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:19:23.6521404Z Wednesday 16 September 2026  14:19:23 -0300 (0:00:00.339)       0:01:08.471 *** 
2026-09-16T17:19:23.7101904Z Wednesday 16 September 2026  14:19:23 -0300 (0:00:00.057)       0:01:08.529 *** 
2026-09-16T17:19:23.7677250Z 
2026-09-16T17:19:23.7677833Z TASK [nfs : Parse JSON data] ***************************************************
2026-09-16T17:19:23.7678033Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:19:23.7752522Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:19:23.7787766Z Wednesday 16 September 2026  14:19:23 -0300 (0:00:00.068)       0:01:08.598 *** 
2026-09-16T17:19:23.8374383Z 
2026-09-16T17:19:23.8375111Z TASK [nfs : debug] *************************************************************
2026-09-16T17:19:23.8375286Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br] => {
2026-09-16T17:19:23.8375418Z     "msg": {
2026-09-16T17:19:23.8377430Z         "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA", 
2026-09-16T17:19:23.8377665Z         "NFS_MOUNT_POINT": "/SIIFX_SIGMS"
2026-09-16T17:19:23.8377786Z     }
2026-09-16T17:19:23.8377991Z }
2026-09-16T17:19:23.8438339Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T17:19:23.8438865Z     "msg": {
2026-09-16T17:19:23.8439393Z         "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA", 
2026-09-16T17:19:23.8439624Z         "NFS_MOUNT_POINT": "/SIIFX_SIGMS"
2026-09-16T17:19:23.8439740Z     }
2026-09-16T17:19:23.8439849Z }
2026-09-16T17:19:23.8475225Z Wednesday 16 September 2026  14:19:23 -0300 (0:00:00.068)       0:01:08.666 *** 
2026-09-16T17:19:23.9058818Z 
2026-09-16T17:19:23.9059724Z TASK [nfs : debug] *************************************************************
2026-09-16T17:19:23.9071016Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br] => {
2026-09-16T17:19:23.9071244Z     "msg": "/SIIFX_SIGMS"
2026-09-16T17:19:23.9071461Z }
2026-09-16T17:19:23.9133837Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T17:19:23.9134446Z     "msg": "/SIIFX_SIGMS"
2026-09-16T17:19:23.9134585Z }
2026-09-16T17:19:23.9168304Z Wednesday 16 September 2026  14:19:23 -0300 (0:00:00.069)       0:01:08.736 *** 
2026-09-16T17:19:23.9753293Z 
2026-09-16T17:19:23.9753859Z TASK [nfs : debug] *************************************************************
2026-09-16T17:19:23.9754058Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br] => {
2026-09-16T17:19:23.9754233Z     "msg": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA"
2026-09-16T17:19:23.9756691Z }
2026-09-16T17:19:23.9818177Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T17:19:23.9818495Z     "msg": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA"
2026-09-16T17:19:23.9818713Z }
2026-09-16T17:19:23.9856161Z Wednesday 16 September 2026  14:19:23 -0300 (0:00:00.068)       0:01:08.805 *** 
2026-09-16T17:19:24.0470036Z 
2026-09-16T17:19:24.0470792Z TASK [nfs : Verificando as variaveis] ******************************************
2026-09-16T17:19:24.0471077Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br] => {
2026-09-16T17:19:24.0472722Z     "changed": false, 
2026-09-16T17:19:24.0473046Z     "msg": "All assertions passed"
2026-09-16T17:19:24.0473233Z }
2026-09-16T17:19:24.0554580Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T17:19:24.0556999Z     "changed": false, 
2026-09-16T17:19:24.0559303Z     "msg": "All assertions passed"
2026-09-16T17:19:24.0561238Z }
2026-09-16T17:19:24.0597699Z Wednesday 16 September 2026  14:19:24 -0300 (0:00:00.074)       0:01:08.879 *** 
2026-09-16T17:19:26.5145799Z 
2026-09-16T17:19:26.5147024Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-09-16T17:19:26.5147310Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:19:26.5991086Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:19:26.6028817Z Wednesday 16 September 2026  14:19:26 -0300 (0:00:02.542)       0:01:11.422 *** 
2026-09-16T17:19:27.3556593Z 
2026-09-16T17:19:27.3557198Z TASK [nfs : Install networker lgtoclnt_url] ************************************
2026-09-16T17:19:27.3563341Z fatal: [caddeapllx2798.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.492821", "end": "2026-09-16 14:19:27.337613", "msg": "non-zero return code", "rc": 1, "start": "2026-09-16 14:19:26.844792", "stderr": "aviso: /var/tmp/rpm-tmp.wPHRZ3: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.wPHRZ3: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-09-16T17:19:27.3564324Z ...ignoring
2026-09-16T17:19:27.5295881Z fatal: [caddeapllx1214.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.680148", "end": "2026-09-16 14:19:27.512272", "msg": "non-zero return code", "rc": 1, "start": "2026-09-16 14:19:26.832124", "stderr": "aviso: /var/tmp/rpm-tmp.mySFu8: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.mySFu8: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-09-16T17:19:27.5297194Z ...ignoring
2026-09-16T17:19:27.5334356Z Wednesday 16 September 2026  14:19:27 -0300 (0:00:00.930)       0:01:12.352 *** 
2026-09-16T17:19:28.2258878Z 
2026-09-16T17:19:28.2259446Z TASK [nfs : Install networker lgtonmda_url] ************************************
2026-09-16T17:19:28.2264953Z fatal: [caddeapllx2798.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.439312", "end": "2026-09-16 14:19:28.209324", "msg": "non-zero return code", "rc": 1, "start": "2026-09-16 14:19:27.770012", "stderr": "aviso: /var/tmp/rpm-tmp.IyPZgV: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.IyPZgV: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-09-16T17:19:28.2266093Z ...ignoring
2026-09-16T17:19:28.2404807Z fatal: [caddeapllx1214.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.441070", "end": "2026-09-16 14:19:28.220835", "msg": "non-zero return code", "rc": 1, "start": "2026-09-16 14:19:27.779765", "stderr": "aviso: /var/tmp/rpm-tmp.9dD8GN: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.9dD8GN: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-09-16T17:19:28.2406309Z ...ignoring
2026-09-16T17:19:28.2441828Z Wednesday 16 September 2026  14:19:28 -0300 (0:00:00.710)       0:01:13.063 *** 
2026-09-16T17:19:28.4975868Z 
2026-09-16T17:19:28.4976789Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-09-16T17:19:28.4976977Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:19:28.4984203Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:19:28.5027617Z Wednesday 16 September 2026  14:19:28 -0300 (0:00:00.258)       0:01:13.322 *** 
2026-09-16T17:19:28.7544540Z 
2026-09-16T17:19:28.7545112Z TASK [nfs : Create a symbolic link] ********************************************
2026-09-16T17:19:28.7545283Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:19:28.7578404Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:19:28.7632838Z Wednesday 16 September 2026  14:19:28 -0300 (0:00:00.260)       0:01:13.582 *** 
2026-09-16T17:19:29.3872790Z 
2026-09-16T17:19:29.3873887Z TASK [nfs : Networker | Start networker] ***************************************
2026-09-16T17:19:29.3874311Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:19:29.4058810Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:19:29.4110610Z Wednesday 16 September 2026  14:19:29 -0300 (0:00:00.647)       0:01:14.230 *** 
2026-09-16T17:19:29.6666280Z 
2026-09-16T17:19:29.6667444Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-09-16T17:19:29.6667673Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:19:29.6873773Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:19:29.6913028Z Wednesday 16 September 2026  14:19:29 -0300 (0:00:00.280)       0:01:14.510 *** 
2026-09-16T17:19:40.0771352Z 
2026-09-16T17:19:40.0771945Z TASK [nfs : Networker | Restart networker] *************************************
2026-09-16T17:19:40.0772106Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:19:40.1188259Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:19:40.1210682Z Wednesday 16 September 2026  14:19:40 -0300 (0:00:10.429)       0:01:24.940 *** 
2026-09-16T17:19:40.4000036Z 
2026-09-16T17:19:40.4001055Z TASK [nfs : Montando volume remoto] ********************************************
2026-09-16T17:19:40.4001906Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:19:40.4570444Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:19:40.4596061Z Wednesday 16 September 2026  14:19:40 -0300 (0:00:00.338)       0:01:25.279 *** 
2026-09-16T17:19:40.5151914Z 
2026-09-16T17:19:40.5152858Z PLAY [jboss] *******************************************************************
2026-09-16T17:19:40.5181225Z 
2026-09-16T17:19:40.5181662Z PLAY [Copiando deployments adicionais] *****************************************
2026-09-16T17:19:40.5212525Z 
2026-09-16T17:19:40.5212946Z PLAY [Copiando modules adicionais] *********************************************
2026-09-16T17:19:40.5241368Z 
2026-09-16T17:19:40.5241929Z PLAY [jboss] *******************************************************************
2026-09-16T17:19:40.5282597Z 
2026-09-16T17:19:40.5283062Z PLAY [jboss] *******************************************************************
2026-09-16T17:19:40.5314174Z 
2026-09-16T17:19:40.5315054Z PLAY [jboss] *******************************************************************
2026-09-16T17:19:40.5353104Z 
2026-09-16T17:19:40.5354149Z PLAY [jboss] *******************************************************************
2026-09-16T17:19:40.5384207Z 
2026-09-16T17:19:40.5384786Z PLAY [jboss] *******************************************************************
2026-09-16T17:19:40.5411518Z 
2026-09-16T17:19:40.5412000Z PLAY [local] *******************************************************************
2026-09-16T17:19:40.5438924Z [WARNING]: Could not match supplied host pattern, ignoring: instance_restart
2026-09-16T17:19:40.5442030Z 
2026-09-16T17:19:40.5442521Z PLAY [instance_restart] ********************************************************
2026-09-16T17:19:40.5443101Z skipping: no hosts matched
2026-09-16T17:19:40.5445200Z [WARNING]: Could not match supplied host pattern, ignoring: machine_reboot
2026-09-16T17:19:40.5448381Z 
2026-09-16T17:19:40.5448779Z PLAY [machine_reboot] **********************************************************
2026-09-16T17:19:40.5449035Z skipping: no hosts matched
2026-09-16T17:19:40.5455005Z 
2026-09-16T17:19:40.5455524Z PLAY [local] *******************************************************************
2026-09-16T17:19:40.5480102Z [WARNING]: Could not match supplied host pattern, ignoring: instance_stop
2026-09-16T17:19:40.5483539Z 
2026-09-16T17:19:40.5484050Z PLAY [instance_stop] ***********************************************************
2026-09-16T17:19:40.5484417Z skipping: no hosts matched
2026-09-16T17:19:40.5487221Z 
2026-09-16T17:19:40.5487678Z PLAY [machine_reboot] **********************************************************
2026-09-16T17:19:40.5487928Z skipping: no hosts matched
2026-09-16T17:19:40.5493331Z 
2026-09-16T17:19:40.5493788Z PLAY [local] *******************************************************************
2026-09-16T17:19:40.5518027Z [WARNING]: Could not match supplied host pattern, ignoring: escopo_execucao
2026-09-16T17:19:40.5521195Z 
2026-09-16T17:19:40.5521672Z PLAY [Executar o Start do Sirot Connector no escopo definido] ******************
2026-09-16T17:19:40.5521983Z skipping: no hosts matched
2026-09-16T17:19:40.5527833Z 
2026-09-16T17:19:40.5528974Z PLAY [local] *******************************************************************
2026-09-16T17:19:40.5550982Z 
2026-09-16T17:19:40.5551590Z PLAY [Executar o Stop do Sirot Connector] **************************************
2026-09-16T17:19:40.5551945Z skipping: no hosts matched
2026-09-16T17:19:40.5561329Z 
2026-09-16T17:19:40.5561940Z PLAY [Configura TSM] ***********************************************************
2026-09-16T17:19:40.5589020Z 
2026-09-16T17:19:40.5589834Z PLAY [jboss] *******************************************************************
2026-09-16T17:19:40.5630366Z Wednesday 16 September 2026  14:19:40 -0300 (0:00:00.103)       0:01:25.382 *** 
2026-09-16T17:19:40.6219539Z 
2026-09-16T17:19:40.6220665Z TASK [Cria variável build_repository_name] *************************************
2026-09-16T17:19:40.6221391Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:19:40.6277638Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:19:40.6309903Z Wednesday 16 September 2026  14:19:40 -0300 (0:00:00.067)       0:01:25.450 *** 
2026-09-16T17:19:40.6886905Z 
2026-09-16T17:19:40.6887927Z TASK [Buscando diretorio de config] ********************************************
2026-09-16T17:19:40.6888139Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:19:40.6967404Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:19:40.7088323Z Wednesday 16 September 2026  14:19:40 -0300 (0:00:00.077)       0:01:25.528 *** 
2026-09-16T17:19:41.1009953Z 
2026-09-16T17:19:41.1010712Z TASK [Verifica se o arquivo {{ item }}/etc/hosts-{{ sistema_ambiente }} existe] ***
2026-09-16T17:19:41.1010998Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r13215/a/_SIIFX-batch-config)
2026-09-16T17:19:41.1081114Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r13215/a/_SIIFX-batch-config)
2026-09-16T17:19:41.4088632Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r13215/a/_SIIFX-batch-config/so)
2026-09-16T17:19:41.4219728Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r13215/a/_SIIFX-batch-config/so)
2026-09-16T17:19:41.4261218Z Wednesday 16 September 2026  14:19:41 -0300 (0:00:00.717)       0:01:26.245 *** 
2026-09-16T17:19:41.8502007Z 
2026-09-16T17:19:41.8502826Z TASK [Altera arquivo /etc/hosts] ***********************************************
2026-09-16T17:19:41.8504550Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => (item={u'item': u'/opt/ads-agent/_work/r13215/a/_SIIFX-batch-config', u'stat': {u'charset': u'us-ascii', u'uid': 1000, u'exists': True, u'attr_flags': u'', u'woth': False, u'device_type': 0, u'mtime': 1789579090.7122803, u'block_size': 4096, u'inode': 637571015, u'isgid': False, u'size': 175, u'wgrp': False, u'executable': False, u'isuid': False, u'readable': True, u'isreg': True, u'version': u'18446744073265314348', u'pw_name': u'sadscp01', u'gid': 1000, u'ischr': False, u'wusr': True, u'writeable': True, u'mimetype': u'text/plain', u'blocks': 8, u'xoth': False, u'islnk': False, u'nlink': 1, u'issock': False, u'rgrp': True, u'gr_name': u'sadscp01', u'path': u'/opt/ads-agent/_work/r13215/a/_SIIFX-batch-config/etc/hosts-des', u'xusr': False, u'atime': 1789579090.7132802, u'isdir': False, u'ctime': 1789579090.7122803, u'isblk': False, u'checksum': u'b189d1cdee317ad9f292a99c63b64d9c07bc0b06', u'dev': 64771, u'roth': True, u'isfifo': False, u'mode': u'0644', u'xgrp': False, u'rusr': True, u'attributes': []}, u'ansible_loop_var': u'item', u'failed': False, u'invocation': {u'module_args': {u'follow': False, u'get_checksum': True, u'path': u'/opt/ads-agent/_work/r13215/a/_SIIFX-batch-config/etc/hosts-des', u'checksum_algorithm': u'sha1', u'get_md5': False, u'get_mime': True, u'get_attributes': True}}, u'changed': False})
2026-09-16T17:19:41.8586419Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br] => (item={u'item': u'/opt/ads-agent/_work/r13215/a/_SIIFX-batch-config', u'stat': {u'charset': u'us-ascii', u'uid': 1000, u'exists': True, u'attr_flags': u'', u'woth': False, u'device_type': 0, u'mtime': 1789579090.7122803, u'block_size': 4096, u'inode': 637571015, u'isgid': False, u'size': 175, u'wgrp': False, u'executable': False, u'isuid': False, u'readable': True, u'isreg': True, u'version': u'18446744073265314348', u'pw_name': u'sadscp01', u'gid': 1000, u'ischr': False, u'wusr': True, u'writeable': True, u'mimetype': u'text/plain', u'blocks': 8, u'xoth': False, u'islnk': False, u'nlink': 1, u'issock': False, u'rgrp': True, u'gr_name': u'sadscp01', u'path': u'/opt/ads-agent/_work/r13215/a/_SIIFX-batch-config/etc/hosts-des', u'xusr': False, u'atime': 1789579090.7132802, u'isdir': False, u'ctime': 1789579090.7122803, u'isblk': False, u'checksum': u'b189d1cdee317ad9f292a99c63b64d9c07bc0b06', u'dev': 64771, u'roth': True, u'isfifo': False, u'mode': u'0644', u'xgrp': False, u'rusr': True, u'attributes': []}, u'ansible_loop_var': u'item', u'failed': False, u'invocation': {u'module_args': {u'follow': False, u'get_checksum': True, u'path': u'/opt/ads-agent/_work/r13215/a/_SIIFX-batch-config/etc/hosts-des', u'checksum_algorithm': u'sha1', u'get_md5': False, u'get_mime': True, u'get_attributes': True}}, u'changed': False})
2026-09-16T17:19:41.8657227Z 
2026-09-16T17:19:41.8657623Z PLAY [Configura Control-M] *****************************************************
2026-09-16T17:19:41.8712545Z Wednesday 16 September 2026  14:19:41 -0300 (0:00:00.445)       0:01:26.690 *** 
2026-09-16T17:19:42.5019350Z 
2026-09-16T17:19:42.5020085Z TASK [Gathering Facts] *********************************************************
2026-09-16T17:19:42.5020383Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:19:42.5128705Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:19:42.5354950Z Wednesday 16 September 2026  14:19:42 -0300 (0:00:00.663)       0:01:27.354 *** 
2026-09-16T17:19:42.7893506Z 
2026-09-16T17:19:42.7894519Z TASK [stat] ********************************************************************
2026-09-16T17:19:42.7894861Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:19:42.8027070Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:19:42.8199394Z Wednesday 16 September 2026  14:19:42 -0300 (0:00:00.284)       0:01:27.639 *** 
2026-09-16T17:19:42.8815305Z 
2026-09-16T17:19:42.8816368Z TASK [assert] ******************************************************************
2026-09-16T17:19:42.8816786Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br] => {
2026-09-16T17:19:42.8816928Z     "changed": false, 
2026-09-16T17:19:42.8817067Z     "msg": "All assertions passed"
2026-09-16T17:19:42.8817167Z }
2026-09-16T17:19:42.8990652Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T17:19:42.8990885Z     "changed": false, 
2026-09-16T17:19:42.8991016Z     "msg": "All assertions passed"
2026-09-16T17:19:42.8992791Z }
2026-09-16T17:19:42.9161080Z Wednesday 16 September 2026  14:19:42 -0300 (0:00:00.096)       0:01:27.735 *** 
2026-09-16T17:19:43.0405182Z 
2026-09-16T17:19:43.0406765Z TASK [control_m : Cria variável ansible] ***************************************
2026-09-16T17:19:43.0407128Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:19:43.0680938Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:19:43.0850013Z Wednesday 16 September 2026  14:19:43 -0300 (0:00:00.168)       0:01:27.904 *** 
2026-09-16T17:19:43.8352011Z 
2026-09-16T17:19:43.8352701Z TASK [control_m : Copiando arquivo de certificado] *****************************
2026-09-16T17:19:43.8352986Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:19:43.8368107Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:19:43.8547853Z Wednesday 16 September 2026  14:19:43 -0300 (0:00:00.769)       0:01:28.673 *** 
2026-09-16T17:19:44.1064926Z 
2026-09-16T17:19:44.1066005Z TASK [control_m : Executando add-user.sh] **************************************
2026-09-16T17:19:44.1066733Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:19:44.1277352Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:19:44.1480057Z Wednesday 16 September 2026  14:19:44 -0300 (0:00:00.293)       0:01:28.967 *** 
2026-09-16T17:19:44.5342664Z 
2026-09-16T17:19:44.5346782Z TASK [control_m : Removendo add-user.sh] ***************************************
2026-09-16T17:19:44.5346978Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:19:44.5367457Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:19:44.5557752Z Wednesday 16 September 2026  14:19:44 -0300 (0:00:00.407)       0:01:29.375 *** 
2026-09-16T17:19:44.8148217Z 
2026-09-16T17:19:44.8148736Z TASK [control_m : Criacao diretorio /producao/carga] ***************************
2026-09-16T17:19:44.8148958Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:19:44.8407700Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:19:44.8588651Z Wednesday 16 September 2026  14:19:44 -0300 (0:00:00.303)       0:01:29.678 *** 
2026-09-16T17:19:45.1314215Z 
2026-09-16T17:19:45.1314774Z TASK [control_m : Criacao diretorio /producao/suporte] *************************
2026-09-16T17:19:45.1314951Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:19:45.1352025Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:19:45.1534546Z Wednesday 16 September 2026  14:19:45 -0300 (0:00:00.294)       0:01:29.972 *** 
2026-09-16T17:19:45.7334620Z 
2026-09-16T17:19:45.7336037Z TASK [control_m : Garante bash_profile] ****************************************
2026-09-16T17:19:45.7336315Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:19:45.7878361Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:19:45.8187715Z Wednesday 16 September 2026  14:19:45 -0300 (0:00:00.665)       0:01:30.637 *** 
2026-09-16T17:19:46.0800490Z 
2026-09-16T17:19:46.0801295Z TASK [control_m : Cria Diretório de Scripts] ***********************************
2026-09-16T17:19:46.0801474Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:19:46.1160563Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:19:46.1336760Z Wednesday 16 September 2026  14:19:46 -0300 (0:00:00.314)       0:01:30.952 *** 
2026-09-16T17:20:38.4513976Z 
2026-09-16T17:20:38.4516270Z TASK [control_m : Copia Scripts] ***********************************************
2026-09-16T17:20:38.4517108Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:20:49.9026296Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:20:49.9243256Z Wednesday 16 September 2026  14:20:49 -0300 (0:01:03.790)       0:02:34.743 *** 
2026-09-16T17:20:50.2042262Z 
2026-09-16T17:20:50.2043072Z TASK [control_m : Verifica se o arquivo /producao//configuration/custom.sh existe] ***
2026-09-16T17:20:50.2043264Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:20:50.2340561Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:20:50.2501688Z Wednesday 16 September 2026  14:20:50 -0300 (0:00:00.325)       0:02:35.069 *** 
2026-09-16T17:20:50.5158336Z 
2026-09-16T17:20:50.5159086Z TASK [control_m : Executa shell customizada] ***********************************
2026-09-16T17:20:50.5159282Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:20:50.5465404Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:20:50.5650084Z Wednesday 16 September 2026  14:20:50 -0300 (0:00:00.314)       0:02:35.384 *** 
2026-09-16T17:20:51.2285978Z 
2026-09-16T17:20:51.2287567Z TASK [control_m : Configuração Control-M] **************************************
2026-09-16T17:20:51.2288020Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:20:51.2306787Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:20:51.2512197Z Wednesday 16 September 2026  14:20:51 -0300 (0:00:00.686)       0:02:36.070 *** 
2026-09-16T17:20:55.3129235Z 
2026-09-16T17:20:55.3130832Z TASK [control_m : Restart ControlM] ********************************************
2026-09-16T17:20:55.3131441Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T17:20:57.3795065Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T17:20:57.3841691Z 
2026-09-16T17:20:57.3842147Z PLAY [jboss] *******************************************************************
2026-09-16T17:20:57.3892991Z 
2026-09-16T17:20:57.3893208Z PLAY [jboss] *******************************************************************
2026-09-16T17:20:57.3942624Z 
2026-09-16T17:20:57.3943114Z PLAY [jboss] *******************************************************************
2026-09-16T17:20:57.3967919Z 
2026-09-16T17:20:57.3968115Z PLAY [jboss] *******************************************************************
2026-09-16T17:20:57.4003608Z 
2026-09-16T17:20:57.4004445Z PLAY [localhost] ***************************************************************
2026-09-16T17:20:57.4028741Z 
2026-09-16T17:20:57.4029098Z PLAY [jboss] *******************************************************************
2026-09-16T17:20:57.4077472Z 
2026-09-16T17:20:57.4077772Z PLAY [jboss] *******************************************************************
2026-09-16T17:20:57.4121650Z 
2026-09-16T17:20:57.4122272Z PLAY [jboss] *******************************************************************
2026-09-16T17:20:57.4158616Z 
2026-09-16T17:20:57.4159260Z PLAY RECAP *********************************************************************
2026-09-16T17:20:57.4159740Z caddeapllx1214.agil.nprd.caixa.gov.br : ok=92   changed=43   unreachable=0    failed=0    skipped=4    rescued=0    ignored=6   
2026-09-16T17:20:57.4159976Z caddeapllx2798.agil.nprd.caixa.gov.br : ok=92   changed=32   unreachable=0    failed=0    skipped=4    rescued=0    ignored=8   
2026-09-16T17:20:57.4167438Z 
2026-09-16T17:20:57.4168500Z Wednesday 16 September 2026  14:20:57 -0300 (0:00:06.164)       0:02:42.235 *** 
2026-09-16T17:20:57.4168739Z =============================================================================== 
2026-09-16T17:20:57.4168992Z control_m : Copia Scripts ---------------------------------------------- 63.79s
2026-09-16T17:20:57.4169250Z nfs : Networker | Restart networker ------------------------------------ 10.43s
2026-09-16T17:20:57.4169503Z nfs : Networker | Restart networker ------------------------------------ 10.43s
2026-09-16T17:20:57.4170686Z nfs : Networker | Restart networker ------------------------------------ 10.43s
2026-09-16T17:20:57.4171237Z nfs : Networker | Restart networker ------------------------------------ 10.43s
2026-09-16T17:20:57.4171507Z nfs : execute montagem script ------------------------------------------- 8.99s
2026-09-16T17:20:57.4171750Z control_m : Restart ControlM -------------------------------------------- 6.16s
2026-09-16T17:20:57.4172005Z nfs : Instalando o NFS Client ------------------------------------------- 3.43s
2026-09-16T17:20:57.4172239Z nfs : Install networker lgtoclnt_url ------------------------------------ 2.86s
2026-09-16T17:20:57.4172458Z nfs : Instalando o NFS Client ------------------------------------------- 2.56s
2026-09-16T17:20:57.4172700Z nfs : Instalando o NFS Client ------------------------------------------- 2.54s
2026-09-16T17:20:57.4172942Z nfs : Instalando o NFS Client ------------------------------------------- 2.54s
2026-09-16T17:20:57.4173173Z nfs : Install networker lgtonmda_url ------------------------------------ 2.48s
2026-09-16T17:20:57.4173412Z nfs : Install networker lgtonmda_url ------------------------------------ 1.70s
2026-09-16T17:20:57.4173646Z nfs : Networker | Start networker --------------------------------------- 1.11s
2026-09-16T17:20:57.4173873Z nfs : Install networker lgtoclnt_url ------------------------------------ 0.93s
2026-09-16T17:20:57.4174107Z nfs : Install networker lgtoclnt_url ------------------------------------ 0.80s
2026-09-16T17:20:57.4174336Z nfs : Install networker lgtoclnt_url ------------------------------------ 0.78s
2026-09-16T17:20:57.4174569Z control_m : Copiando arquivo de certificado ----------------------------- 0.77s
2026-09-16T17:20:57.4174875Z nfs : Montando volume remoto -------------------------------------------- 0.75s
2026-09-16T17:20:57.4175039Z Playbook run took 0 days, 0 hours, 2 minutes, 42 seconds
2026-09-16T17:20:57.5451447Z ##[section]Finishing: Configura Control-M
