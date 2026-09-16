2026-09-16T14:14:13.7412311Z ##[section]Starting: Configura Control-M
2026-09-16T14:14:13.7416007Z ==============================================================================
2026-09-16T14:14:13.7416112Z Task         : Bash
2026-09-16T14:14:13.7416159Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-16T14:14:13.7416239Z Version      : 3.227.0
2026-09-16T14:14:13.7416289Z Author       : Microsoft Corporation
2026-09-16T14:14:13.7416343Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-16T14:14:13.7416437Z ==============================================================================
2026-09-16T14:14:14.8429237Z Generating script.
2026-09-16T14:14:14.8430389Z ========================== Starting Command Output ===========================
2026-09-16T14:14:14.8434159Z [command]/bin/bash /opt/ads-agent/_work/_temp/3f72f8c8-2aef-45a0-bb78-92cee301f735.sh
2026-09-16T14:14:17.2284952Z 
2026-09-16T14:14:17.2285732Z PLAY [local] *******************************************************************
2026-09-16T14:14:17.2626080Z 
2026-09-16T14:14:17.2626971Z PLAY [Configurando o DNS] ******************************************************
2026-09-16T14:14:17.4724992Z 
2026-09-16T14:14:17.4725637Z PLAY [local] *******************************************************************
2026-09-16T14:14:17.4758119Z 
2026-09-16T14:14:17.4759014Z PLAY [Verificando serviços] ****************************************************
2026-09-16T14:14:17.4852623Z 
2026-09-16T14:14:17.4853228Z PLAY [Configuração LDAP] *******************************************************
2026-09-16T14:14:17.4889010Z [WARNING]: Found variable using reserved name: when
2026-09-16T14:14:17.4894667Z 
2026-09-16T14:14:17.4895686Z PLAY [jboss] *******************************************************************
2026-09-16T14:14:17.4997790Z 
2026-09-16T14:14:17.4998663Z PLAY [Stack Jboss] *************************************************************
2026-09-16T14:14:17.5024528Z 
2026-09-16T14:14:17.5069535Z PLAY [jboss] *******************************************************************
2026-09-16T14:14:17.5069698Z 
2026-09-16T14:14:17.5069857Z PLAY [jboss] *******************************************************************
2026-09-16T14:14:17.5365410Z Wednesday 16 September 2026  11:14:17 -0300 (0:00:00.370)       0:00:00.370 *** 
2026-09-16T14:14:18.1131363Z 
2026-09-16T14:14:18.1132457Z TASK [Verifica se o arquivo nfs_config.json existe] ****************************
2026-09-16T14:14:18.1132923Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T14:14:18.1197240Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:14:18.1222202Z Wednesday 16 September 2026  11:14:18 -0300 (0:00:00.585)       0:00:00.956 *** 
2026-09-16T14:14:18.1801124Z included: /opt/ads-agent/_work/r13215/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for caddeapllx1214.agil.nprd.caixa.gov.br, caddeapllx2798.agil.nprd.caixa.gov.br
2026-09-16T14:14:18.1858311Z Wednesday 16 September 2026  11:14:18 -0300 (0:00:00.063)       0:00:01.019 *** 
2026-09-16T14:14:18.2471911Z 
2026-09-16T14:14:18.2473129Z TASK [nfs : Criar variáveis] ***************************************************
2026-09-16T14:14:18.2473381Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T14:14:18.2519133Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:14:18.2574692Z Wednesday 16 September 2026  11:14:18 -0300 (0:00:00.071)       0:00:01.091 *** 
2026-09-16T14:14:18.7539624Z 
2026-09-16T14:14:18.7541002Z TASK [nfs : Coletar variáveis de ambiente] *************************************
2026-09-16T14:14:18.7541491Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T14:14:18.7542080Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:14:18.7574463Z Wednesday 16 September 2026  11:14:18 -0300 (0:00:00.499)       0:00:01.591 *** 
2026-09-16T14:14:18.8181776Z 
2026-09-16T14:14:18.8182521Z TASK [nfs : Exibir resultado em JSON] ******************************************
2026-09-16T14:14:18.8183093Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br] => {
2026-09-16T14:14:18.8183239Z     "nfs_vars_json": {
2026-09-16T14:14:18.8183864Z         "changed": false, 
2026-09-16T14:14:18.8184259Z         "cmd": "cat /opt/ads-agent/_work/r13215/a/nfs_config.json", 
2026-09-16T14:14:18.8184431Z         "delta": "0:00:00.006513", 
2026-09-16T14:14:18.8184627Z         "end": "2026-09-16 11:14:18.731010", 
2026-09-16T14:14:18.8184754Z         "failed": false, 
2026-09-16T14:14:18.8184866Z         "rc": 0, 
2026-09-16T14:14:18.8185039Z         "start": "2026-09-16 11:14:18.724497", 
2026-09-16T14:14:18.8185169Z         "stderr": "", 
2026-09-16T14:14:18.8185272Z         "stderr_lines": [], 
2026-09-16T14:14:18.8185998Z         "stdout": "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT_ISILON\": \"/SIIFX\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_3\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT_ISILON_2\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT_ISILON_4\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT_ISILON_4\": \"/SIIFX_SIGMS\"}]", 
2026-09-16T14:14:18.8186420Z         "stdout_lines": [
2026-09-16T14:14:18.8187231Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT_ISILON\": \"/SIIFX\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_3\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT_ISILON_2\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT_ISILON_4\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT_ISILON_4\": \"/SIIFX_SIGMS\"}]"
2026-09-16T14:14:18.8187672Z         ]
2026-09-16T14:14:18.8187777Z     }
2026-09-16T14:14:18.8187879Z }
2026-09-16T14:14:18.8237521Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:14:18.8237711Z     "nfs_vars_json": {
2026-09-16T14:14:18.8237849Z         "changed": false, 
2026-09-16T14:14:18.8240130Z         "cmd": "cat /opt/ads-agent/_work/r13215/a/nfs_config.json", 
2026-09-16T14:14:18.8240372Z         "delta": "0:00:00.006623", 
2026-09-16T14:14:18.8240565Z         "end": "2026-09-16 11:14:18.731120", 
2026-09-16T14:14:18.8240710Z         "failed": false, 
2026-09-16T14:14:18.8240826Z         "rc": 0, 
2026-09-16T14:14:18.8241024Z         "start": "2026-09-16 11:14:18.724497", 
2026-09-16T14:14:18.8241155Z         "stderr": "", 
2026-09-16T14:14:18.8241274Z         "stderr_lines": [], 
2026-09-16T14:14:18.8242003Z         "stdout": "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT_ISILON\": \"/SIIFX\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_3\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT_ISILON_2\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT_ISILON_4\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT_ISILON_4\": \"/SIIFX_SIGMS\"}]", 
2026-09-16T14:14:18.8242376Z         "stdout_lines": [
2026-09-16T14:14:18.8243059Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT_ISILON\": \"/SIIFX\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_3\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT_ISILON_2\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT_ISILON_4\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT_ISILON_4\": \"/SIIFX_SIGMS\"}]"
2026-09-16T14:14:18.8243412Z         ]
2026-09-16T14:14:18.8243779Z     }
2026-09-16T14:14:18.8243884Z }
2026-09-16T14:14:18.8278015Z Wednesday 16 September 2026  11:14:18 -0300 (0:00:00.070)       0:00:01.661 *** 
2026-09-16T14:14:18.8970407Z 
2026-09-16T14:14:18.8971436Z TASK [nfs : Criar variáveis] ***************************************************
2026-09-16T14:14:18.8971629Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T14:14:18.9042556Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:14:18.9100577Z Wednesday 16 September 2026  11:14:18 -0300 (0:00:00.082)       0:00:01.744 *** 
2026-09-16T14:14:29.3318051Z 
2026-09-16T14:14:29.3318844Z TASK [nfs : execute montagem script] *******************************************
2026-09-16T14:14:29.3319093Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T14:14:29.4373061Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:14:29.4418169Z Wednesday 16 September 2026  11:14:29 -0300 (0:00:10.531)       0:00:12.276 *** 
2026-09-16T14:14:29.5115349Z 
2026-09-16T14:14:29.5116159Z TASK [nfs : ansible.builtin.debug] *********************************************
2026-09-16T14:14:29.5125037Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br] => {
2026-09-16T14:14:29.5125529Z     "changed": false, 
2026-09-16T14:14:29.5126321Z     "msg": {
2026-09-16T14:14:29.5126582Z         "changed": true, 
2026-09-16T14:14:29.5126708Z         "cmd": [
2026-09-16T14:14:29.5126821Z             "python", 
2026-09-16T14:14:29.5127238Z             "/opt/ads-agent/_work/r13215/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py", 
2026-09-16T14:14:29.5127464Z             "montagem", 
2026-09-16T14:14:29.5127616Z             "siifx-batch-vm", 
2026-09-16T14:14:29.5127733Z             "des", 
2026-09-16T14:14:29.5128230Z             "ctc_nprd", 
2026-09-16T14:14:29.5128429Z             "/opt/ads-agent/_work/r13215/a/esteira-jboss-vm-v2", 
2026-09-16T14:14:29.5128552Z             "C&t@d02", 
2026-09-16T14:14:29.5128776Z             "***", 
2026-09-16T14:14:29.5128889Z             "s736651@corp.caixa.gov.br", 
2026-09-16T14:14:29.5129043Z             "***", 
2026-09-16T14:14:29.5129749Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT_ISILON\": \"/SIIFX\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_3\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT_ISILON_2\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT_ISILON_4\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT_ISILON_4\": \"/SIIFX_SIGMS\"}]"
2026-09-16T14:14:29.5130140Z         ], 
2026-09-16T14:14:29.5130285Z         "delta": "0:00:09.982665", 
2026-09-16T14:14:29.5130474Z         "end": "2026-09-16 11:14:29.298267", 
2026-09-16T14:14:29.5130608Z         "failed": false, 
2026-09-16T14:14:29.5130720Z         "rc": 0, 
2026-09-16T14:14:29.5130899Z         "start": "2026-09-16 11:14:19.315602", 
2026-09-16T14:14:29.5131035Z         "stderr": "", 
2026-09-16T14:14:29.5131147Z         "stderr_lines": [], 
2026-09-16T14:14:29.5136038Z         "stdout": "[{u'NFS_MOUNT_POINT_ISILON': u'/SIIFX', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH'}, {u'NFS_MOUNT_POINT_ISILON_3': u'/SIIFX_SIISF', u'NFS_ENDPOINT_ISILON_3': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF'}, {u'NFS_MOUNT_POINT_ISILON_2': u'/SIIFX_B2B', u'NFS_ENDPOINT_ISILON_2': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX'}, {u'NFS_ENDPOINT_ISILON_4': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA', u'NFS_MOUNT_POINT_ISILON_4': u'/SIIFX_SIGMS'}]\nNome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           \n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH /SIIFX                              ISILON                              nfsctcnprd.ctc.caixa                des                                \nException when callin ProtocolsApi->get_nfs_expor: (500)\nReason: Internal Server Error\nHTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 14:14:20 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})\nHTTP response body: \n{\n\"errors\" : \n[\n\n{\n\"code\" : \"AEC_EXCEPTION\",\n\"message\" : \"bad hostname 192.168.213.137,10.188.254.113\"\n}\n]\n}\n\n\n\nnfs_path=/SIIFX\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH /SIIFX                              ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX /SIIFX_B2B                          ISILON                              nfsctcnprd.ctc.caixa                des                                \nException when callin ProtocolsApi->get_nfs_expor: (500)\nReason: Internal Server Error\nHTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 14:14:23 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})\nHTTP response body: \n{\n\"errors\" : \n[\n\n{\n\"code\" : \"AEC_EXCEPTION\",\n\"message\" : \"bad hostname 192.168.213.137,10.188.254.113\"\n}\n]\n}\n\n\n\nnfs_path=/SIIFX_B2B\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX /SIIFX_B2B                          ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /SIIFX_SIISF                        ISILON                              nfsctcnprd.ctc.caixa                des                                \nException when callin ProtocolsApi->get_nfs_expor: (500)\nReason: Internal Server Error\nHTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 14:14:26 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})\nHTTP response body: \n{\n\"errors\" : \n[\n\n{\n\"code\" : \"AEC_EXCEPTION\",\n\"message\" : \"bad hostname 192.168.213.137,10.188.254.113\"\n}\n]\n}\n\n\n\nnfs_path=/SIIFX_SIISF\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /SIIFX_SIISF                        ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA /SIIFX_SIGMS                        ISILON                              nfsctcnprd.ctc.caixa                des                                \nException when callin ProtocolsApi->get_nfs_expor: (500)\nReason: Internal Server Error\nHTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 14:14:28 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})\nHTTP response body: \n{\n\"errors\" : \n[\n\n{\n\"code\" : \"AEC_EXCEPTION\",\n\"message\" : \"bad hostname 192.168.213.137,10.188.254.113\"\n}\n]\n}\n\n\n\nnfs_path=/SIIFX_SIGMS\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA /SIIFX_SIGMS                        ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T14:14:29.5138540Z         "stdout_lines": [
2026-09-16T14:14:29.5139256Z             "[{u'NFS_MOUNT_POINT_ISILON': u'/SIIFX', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH'}, {u'NFS_MOUNT_POINT_ISILON_3': u'/SIIFX_SIISF', u'NFS_ENDPOINT_ISILON_3': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF'}, {u'NFS_MOUNT_POINT_ISILON_2': u'/SIIFX_B2B', u'NFS_ENDPOINT_ISILON_2': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX'}, {u'NFS_ENDPOINT_ISILON_4': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA', u'NFS_MOUNT_POINT_ISILON_4': u'/SIIFX_SIGMS'}]", 
2026-09-16T14:14:29.5139649Z             "Nome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           ", 
2026-09-16T14:14:29.5140020Z             "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------", 
2026-09-16T14:14:29.5140426Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH /SIIFX                              ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T14:14:29.5140734Z             "Exception when callin ProtocolsApi->get_nfs_expor: (500)", 
2026-09-16T14:14:29.5140889Z             "Reason: Internal Server Error", 
2026-09-16T14:14:29.5141317Z             "HTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 14:14:20 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})", 
2026-09-16T14:14:29.5141564Z             "HTTP response body: ", 
2026-09-16T14:14:29.5141682Z             "{", 
2026-09-16T14:14:29.5141800Z             "\"errors\" : ", 
2026-09-16T14:14:29.5141913Z             "[", 
2026-09-16T14:14:29.5142019Z             "", 
2026-09-16T14:14:29.5142119Z             "{", 
2026-09-16T14:14:29.5191863Z             "\"code\" : \"AEC_EXCEPTION\",", 
2026-09-16T14:14:29.5192183Z             "\"message\" : \"bad hostname 192.168.213.137,10.188.254.113\"", 
2026-09-16T14:14:29.5192348Z             "}", 
2026-09-16T14:14:29.5192458Z             "]", 
2026-09-16T14:14:29.5192563Z             "}", 
2026-09-16T14:14:29.5192669Z             "", 
2026-09-16T14:14:29.5192777Z             "", 
2026-09-16T14:14:29.5192876Z             "", 
2026-09-16T14:14:29.5192973Z             "nfs_path=/SIIFX", 
2026-09-16T14:14:29.5193360Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH", 
2026-09-16T14:14:29.5193705Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH /SIIFX                              ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T14:14:29.5193949Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX /SIIFX_B2B                          ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T14:14:29.5194197Z             "Exception when callin ProtocolsApi->get_nfs_expor: (500)", 
2026-09-16T14:14:29.5194353Z             "Reason: Internal Server Error", 
2026-09-16T14:14:29.5194798Z             "HTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 14:14:23 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})", 
2026-09-16T14:14:29.5195424Z             "HTTP response body: ", 
2026-09-16T14:14:29.5195538Z             "{", 
2026-09-16T14:14:29.5195646Z             "\"errors\" : ", 
2026-09-16T14:14:29.5195739Z             "[", 
2026-09-16T14:14:29.5195843Z             "", 
2026-09-16T14:14:29.5195944Z             "{", 
2026-09-16T14:14:29.5196055Z             "\"code\" : \"AEC_EXCEPTION\",", 
2026-09-16T14:14:29.5196191Z             "\"message\" : \"bad hostname 192.168.213.137,10.188.254.113\"", 
2026-09-16T14:14:29.5196317Z             "}", 
2026-09-16T14:14:29.5196414Z             "]", 
2026-09-16T14:14:29.5196606Z             "}", 
2026-09-16T14:14:29.5196707Z             "", 
2026-09-16T14:14:29.5196807Z             "", 
2026-09-16T14:14:29.5196903Z             "", 
2026-09-16T14:14:29.5197015Z             "nfs_path=/SIIFX_B2B", 
2026-09-16T14:14:29.5197165Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX", 
2026-09-16T14:14:29.5197367Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX /SIIFX_B2B                          ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T14:14:29.5197585Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /SIIFX_SIISF                        ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T14:14:29.5197829Z             "Exception when callin ProtocolsApi->get_nfs_expor: (500)", 
2026-09-16T14:14:29.5198070Z             "Reason: Internal Server Error", 
2026-09-16T14:14:29.5198506Z             "HTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 14:14:26 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})", 
2026-09-16T14:14:29.5198756Z             "HTTP response body: ", 
2026-09-16T14:14:29.5198873Z             "{", 
2026-09-16T14:14:29.5199036Z             "\"errors\" : ", 
2026-09-16T14:14:29.5199160Z             "[", 
2026-09-16T14:14:29.5199831Z             "", 
2026-09-16T14:14:29.5200193Z             "{", 
2026-09-16T14:14:29.5200311Z             "\"code\" : \"AEC_EXCEPTION\",", 
2026-09-16T14:14:29.5200464Z             "\"message\" : \"bad hostname 192.168.213.137,10.188.254.113\"", 
2026-09-16T14:14:29.5200605Z             "}", 
2026-09-16T14:14:29.5200709Z             "]", 
2026-09-16T14:14:29.5200813Z             "}", 
2026-09-16T14:14:29.5200930Z             "", 
2026-09-16T14:14:29.5201032Z             "", 
2026-09-16T14:14:29.5201133Z             "", 
2026-09-16T14:14:29.5201251Z             "nfs_path=/SIIFX_SIISF", 
2026-09-16T14:14:29.5201403Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF", 
2026-09-16T14:14:29.5202839Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /SIIFX_SIISF                        ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T14:14:29.5203155Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA /SIIFX_SIGMS                        ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T14:14:29.5203509Z             "Exception when callin ProtocolsApi->get_nfs_expor: (500)", 
2026-09-16T14:14:29.5203668Z             "Reason: Internal Server Error", 
2026-09-16T14:14:29.5204103Z             "HTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 14:14:28 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})", 
2026-09-16T14:14:29.5204606Z             "HTTP response body: ", 
2026-09-16T14:14:29.5204723Z             "{", 
2026-09-16T14:14:29.5204838Z             "\"errors\" : ", 
2026-09-16T14:14:29.5204945Z             "[", 
2026-09-16T14:14:29.5205051Z             "", 
2026-09-16T14:14:29.5205151Z             "{", 
2026-09-16T14:14:29.5205265Z             "\"code\" : \"AEC_EXCEPTION\",", 
2026-09-16T14:14:29.5205409Z             "\"message\" : \"bad hostname 192.168.213.137,10.188.254.113\"", 
2026-09-16T14:14:29.5205536Z             "}", 
2026-09-16T14:14:29.5205637Z             "]", 
2026-09-16T14:14:29.5205725Z             "}", 
2026-09-16T14:14:29.5205826Z             "", 
2026-09-16T14:14:29.5205929Z             "", 
2026-09-16T14:14:29.5206275Z             "", 
2026-09-16T14:14:29.5206389Z             "nfs_path=/SIIFX_SIGMS", 
2026-09-16T14:14:29.5206687Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA", 
2026-09-16T14:14:29.5206896Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA /SIIFX_SIGMS                        ISILON                              nfsctcnprd.ctc.caixa                des                                "
2026-09-16T14:14:29.5207062Z         ]
2026-09-16T14:14:29.5207161Z     }
2026-09-16T14:14:29.5207259Z }
2026-09-16T14:14:29.5207760Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:14:29.5207902Z     "changed": false, 
2026-09-16T14:14:29.5208017Z     "msg": {
2026-09-16T14:14:29.5208126Z         "changed": true, 
2026-09-16T14:14:29.5208404Z         "cmd": [
2026-09-16T14:14:29.5208515Z             "python", 
2026-09-16T14:14:29.5208741Z             "/opt/ads-agent/_work/r13215/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py", 
2026-09-16T14:14:29.5209186Z             "montagem", 
2026-09-16T14:14:29.5209359Z             "siifx-batch-vm", 
2026-09-16T14:14:29.5209470Z             "des", 
2026-09-16T14:14:29.5209577Z             "ctc_nprd", 
2026-09-16T14:14:29.5209763Z             "/opt/ads-agent/_work/r13215/a/esteira-jboss-vm-v2", 
2026-09-16T14:14:29.5209968Z             "C&t@d02", 
2026-09-16T14:14:29.5210173Z             "***", 
2026-09-16T14:14:29.5210282Z             "s736651@corp.caixa.gov.br", 
2026-09-16T14:14:29.5210418Z             "***", 
2026-09-16T14:14:29.5211178Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT_ISILON\": \"/SIIFX\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_3\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT_ISILON_2\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT_ISILON_4\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT_ISILON_4\": \"/SIIFX_SIGMS\"}]"
2026-09-16T14:14:29.5211573Z         ], 
2026-09-16T14:14:29.5211736Z         "delta": "0:00:10.097487", 
2026-09-16T14:14:29.5211993Z         "end": "2026-09-16 11:14:29.413094", 
2026-09-16T14:14:29.5212163Z         "failed": false, 
2026-09-16T14:14:29.5212319Z         "rc": 0, 
2026-09-16T14:14:29.5212550Z         "start": "2026-09-16 11:14:19.315607", 
2026-09-16T14:14:29.5212729Z         "stderr": "", 
2026-09-16T14:14:29.5212881Z         "stderr_lines": [], 
2026-09-16T14:14:29.5218739Z         "stdout": "[{u'NFS_MOUNT_POINT_ISILON': u'/SIIFX', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH'}, {u'NFS_MOUNT_POINT_ISILON_3': u'/SIIFX_SIISF', u'NFS_ENDPOINT_ISILON_3': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF'}, {u'NFS_MOUNT_POINT_ISILON_2': u'/SIIFX_B2B', u'NFS_ENDPOINT_ISILON_2': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX'}, {u'NFS_ENDPOINT_ISILON_4': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA', u'NFS_MOUNT_POINT_ISILON_4': u'/SIIFX_SIGMS'}]\nNome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           \n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH /SIIFX                              ISILON                              nfsctcnprd.ctc.caixa                des                                \nException when callin ProtocolsApi->get_nfs_expor: (500)\nReason: Internal Server Error\nHTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 14:14:20 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})\nHTTP response body: \n{\n\"errors\" : \n[\n\n{\n\"code\" : \"AEC_EXCEPTION\",\n\"message\" : \"bad hostname 192.168.213.137,10.188.254.113\"\n}\n]\n}\n\n\n\nnfs_path=/SIIFX\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH /SIIFX                              ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX /SIIFX_B2B                          ISILON                              nfsctcnprd.ctc.caixa                des                                \nException when callin ProtocolsApi->get_nfs_expor: (500)\nReason: Internal Server Error\nHTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 14:14:23 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})\nHTTP response body: \n{\n\"errors\" : \n[\n\n{\n\"code\" : \"AEC_EXCEPTION\",\n\"message\" : \"bad hostname 192.168.213.137,10.188.254.113\"\n}\n]\n}\n\n\n\nnfs_path=/SIIFX_B2B\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX /SIIFX_B2B                          ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /SIIFX_SIISF                        ISILON                              nfsctcnprd.ctc.caixa                des                                \nException when callin ProtocolsApi->get_nfs_expor: (500)\nReason: Internal Server Error\nHTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 14:14:26 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})\nHTTP response body: \n{\n\"errors\" : \n[\n\n{\n\"code\" : \"AEC_EXCEPTION\",\n\"message\" : \"bad hostname 192.168.213.137,10.188.254.113\"\n}\n]\n}\n\n\n\nnfs_path=/SIIFX_SIISF\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /SIIFX_SIISF                        ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA /SIIFX_SIGMS                        ISILON                              nfsctcnprd.ctc.caixa                des                                \nException when callin ProtocolsApi->get_nfs_expor: (500)\nReason: Internal Server Error\nHTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 14:14:28 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})\nHTTP response body: \n{\n\"errors\" : \n[\n\n{\n\"code\" : \"AEC_EXCEPTION\",\n\"message\" : \"bad hostname 192.168.213.137,10.188.254.113\"\n}\n]\n}\n\n\n\nnfs_path=/SIIFX_SIGMS\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA /SIIFX_SIGMS                        ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T14:14:29.5221941Z         "stdout_lines": [
2026-09-16T14:14:29.5222763Z             "[{u'NFS_MOUNT_POINT_ISILON': u'/SIIFX', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH'}, {u'NFS_MOUNT_POINT_ISILON_3': u'/SIIFX_SIISF', u'NFS_ENDPOINT_ISILON_3': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF'}, {u'NFS_MOUNT_POINT_ISILON_2': u'/SIIFX_B2B', u'NFS_ENDPOINT_ISILON_2': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX'}, {u'NFS_ENDPOINT_ISILON_4': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA', u'NFS_MOUNT_POINT_ISILON_4': u'/SIIFX_SIGMS'}]", 
2026-09-16T14:14:29.5223174Z             "Nome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           ", 
2026-09-16T14:14:29.5223562Z             "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------", 
2026-09-16T14:14:29.5224116Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH /SIIFX                              ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T14:14:29.5224363Z             "Exception when callin ProtocolsApi->get_nfs_expor: (500)", 
2026-09-16T14:14:29.5224515Z             "Reason: Internal Server Error", 
2026-09-16T14:14:29.5224940Z             "HTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 14:14:20 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})", 
2026-09-16T14:14:29.5225185Z             "HTTP response body: ", 
2026-09-16T14:14:29.5225300Z             "{", 
2026-09-16T14:14:29.5225408Z             "\"errors\" : ", 
2026-09-16T14:14:29.5225520Z             "[", 
2026-09-16T14:14:29.5225622Z             "", 
2026-09-16T14:14:29.5225712Z             "{", 
2026-09-16T14:14:29.5225826Z             "\"code\" : \"AEC_EXCEPTION\",", 
2026-09-16T14:14:29.5225969Z             "\"message\" : \"bad hostname 192.168.213.137,10.188.254.113\"", 
2026-09-16T14:14:29.5226093Z             "}", 
2026-09-16T14:14:29.5226193Z             "]", 
2026-09-16T14:14:29.5226405Z             "}", 
2026-09-16T14:14:29.5226637Z             "", 
2026-09-16T14:14:29.5227012Z             "", 
2026-09-16T14:14:29.5227129Z             "", 
2026-09-16T14:14:29.5227237Z             "nfs_path=/SIIFX", 
2026-09-16T14:14:29.5227487Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH", 
2026-09-16T14:14:29.5227899Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH /SIIFX                              ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T14:14:29.5228129Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX /SIIFX_B2B                          ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T14:14:29.5228388Z             "Exception when callin ProtocolsApi->get_nfs_expor: (500)", 
2026-09-16T14:14:29.5228636Z             "Reason: Internal Server Error", 
2026-09-16T14:14:29.5229070Z             "HTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 14:14:23 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})", 
2026-09-16T14:14:29.5229309Z             "HTTP response body: ", 
2026-09-16T14:14:29.5229420Z             "{", 
2026-09-16T14:14:29.5229528Z             "\"errors\" : ", 
2026-09-16T14:14:29.5229633Z             "[", 
2026-09-16T14:14:29.5229737Z             "", 
2026-09-16T14:14:29.5229836Z             "{", 
2026-09-16T14:14:29.5229949Z             "\"code\" : \"AEC_EXCEPTION\",", 
2026-09-16T14:14:29.5230097Z             "\"message\" : \"bad hostname 192.168.213.137,10.188.254.113\"", 
2026-09-16T14:14:29.5230232Z             "}", 
2026-09-16T14:14:29.5230321Z             "]", 
2026-09-16T14:14:29.5230424Z             "}", 
2026-09-16T14:14:29.5230518Z             "", 
2026-09-16T14:14:29.5230623Z             "", 
2026-09-16T14:14:29.5230726Z             "", 
2026-09-16T14:14:29.5230837Z             "nfs_path=/SIIFX_B2B", 
2026-09-16T14:14:29.5230989Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX", 
2026-09-16T14:14:29.5231192Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX /SIIFX_B2B                          ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T14:14:29.5231408Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /SIIFX_SIISF                        ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T14:14:29.5231746Z             "Exception when callin ProtocolsApi->get_nfs_expor: (500)", 
2026-09-16T14:14:29.5231894Z             "Reason: Internal Server Error", 
2026-09-16T14:14:29.5232293Z             "HTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 14:14:26 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})", 
2026-09-16T14:14:29.5232535Z             "HTTP response body: ", 
2026-09-16T14:14:29.5232705Z             "{", 
2026-09-16T14:14:29.5232914Z             "\"errors\" : ", 
2026-09-16T14:14:29.5233022Z             "[", 
2026-09-16T14:14:29.5233120Z             "", 
2026-09-16T14:14:29.5233224Z             "{", 
2026-09-16T14:14:29.5233334Z             "\"code\" : \"AEC_EXCEPTION\",", 
2026-09-16T14:14:29.5233474Z             "\"message\" : \"bad hostname 192.168.213.137,10.188.254.113\"", 
2026-09-16T14:14:29.5233600Z             "}", 
2026-09-16T14:14:29.5233703Z             "]", 
2026-09-16T14:14:29.5233802Z             "}", 
2026-09-16T14:14:29.5233901Z             "", 
2026-09-16T14:14:29.5233987Z             "", 
2026-09-16T14:14:29.5234091Z             "", 
2026-09-16T14:14:29.5234216Z             "nfs_path=/SIIFX_SIISF", 
2026-09-16T14:14:29.5234362Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF", 
2026-09-16T14:14:29.5234564Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /SIIFX_SIISF                        ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T14:14:29.5234783Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA /SIIFX_SIGMS                        ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T14:14:29.5235049Z             "Exception when callin ProtocolsApi->get_nfs_expor: (500)", 
2026-09-16T14:14:29.5235196Z             "Reason: Internal Server Error", 
2026-09-16T14:14:29.5235623Z             "HTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 14:14:28 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})", 
2026-09-16T14:14:29.5236105Z             "HTTP response body: ", 
2026-09-16T14:14:29.5236220Z             "{", 
2026-09-16T14:14:29.5236327Z             "\"errors\" : ", 
2026-09-16T14:14:29.5236555Z             "[", 
2026-09-16T14:14:29.5236663Z             "", 
2026-09-16T14:14:29.5236761Z             "{", 
2026-09-16T14:14:29.5236870Z             "\"code\" : \"AEC_EXCEPTION\",", 
2026-09-16T14:14:29.5237009Z             "\"message\" : \"bad hostname 192.168.213.137,10.188.254.113\"", 
2026-09-16T14:14:29.5237135Z             "}", 
2026-09-16T14:14:29.5237231Z             "]", 
2026-09-16T14:14:29.5237329Z             "}", 
2026-09-16T14:14:29.5237429Z             "", 
2026-09-16T14:14:29.5237528Z             "", 
2026-09-16T14:14:29.5237628Z             "", 
2026-09-16T14:14:29.5237740Z             "nfs_path=/SIIFX_SIGMS", 
2026-09-16T14:14:29.5237876Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA", 
2026-09-16T14:14:29.5238075Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA /SIIFX_SIGMS                        ISILON                              nfsctcnprd.ctc.caixa                des                                "
2026-09-16T14:14:29.5238245Z         ]
2026-09-16T14:14:29.5238331Z     }
2026-09-16T14:14:29.5238430Z }
2026-09-16T14:14:29.5238710Z Wednesday 16 September 2026  11:14:29 -0300 (0:00:00.078)       0:00:12.354 *** 
2026-09-16T14:14:29.8866232Z 
2026-09-16T14:14:29.8867490Z TASK [nfs : execute clean json] ************************************************
2026-09-16T14:14:29.8867670Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-09-16T14:14:29.8868135Z caddeapllx2798.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-09-16T14:14:29.8868800Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-09-16T14:14:29.8868991Z releases. A future Ansible release will default to using the discovered 
2026-09-16T14:14:29.8869166Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-09-16T14:14:29.8869348Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-09-16T14:14:29.8869518Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-09-16T14:14:29.8869680Z setting deprecation_warnings=False in ansible.cfg.
2026-09-16T14:14:29.8869827Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:14:29.8990555Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-09-16T14:14:29.8991153Z caddeapllx1214.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-09-16T14:14:29.8991455Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-09-16T14:14:29.8991727Z releases. A future Ansible release will default to using the discovered 
2026-09-16T14:14:29.8992089Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-09-16T14:14:29.8993706Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-09-16T14:14:29.8994184Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-09-16T14:14:29.8994564Z setting deprecation_warnings=False in ansible.cfg.
2026-09-16T14:14:29.8994815Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T14:14:29.9028074Z Wednesday 16 September 2026  11:14:29 -0300 (0:00:00.382)       0:00:12.737 *** 
2026-09-16T14:14:29.9672397Z 
2026-09-16T14:14:29.9673076Z TASK [nfs : result_new_string_json] ********************************************
2026-09-16T14:14:29.9673320Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br] => {
2026-09-16T14:14:29.9673486Z     "msg": {
2026-09-16T14:14:29.9673604Z         "ansible_facts": {
2026-09-16T14:14:29.9673744Z             "discovered_interpreter_python": "/usr/bin/python"
2026-09-16T14:14:29.9674320Z         }, 
2026-09-16T14:14:29.9674433Z         "changed": true, 
2026-09-16T14:14:29.9675560Z         "cmd": "echo '[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT_ISILON\": \"/SIIFX\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_3\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT_ISILON_2\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT_ISILON_4\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT_ISILON_4\": \"/SIIFX_SIGMS\"}]' | sed 's/NFS_ENDPOINT_ISILON[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_ISILON[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_HUAWEI[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_HUAWEI[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_VM[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_VM[^\"]*/NFS_MOUNT_POINT/g'", 
2026-09-16T14:14:29.9676127Z         "delta": "0:00:00.003565", 
2026-09-16T14:14:29.9676261Z         "deprecations": [
2026-09-16T14:14:29.9676377Z             {
2026-09-16T14:14:29.9677179Z                 "msg": "Distribution rhel 9.3 on host caddeapllx1214.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, but is using /usr/bin/python for backward compatibility with prior Ansible releases. A future Ansible release will default to using the discovered platform python for this host. See https://docs.ansible.com/ansible/2.9/reference_appendices/interpreter_discovery.html for more information", 
2026-09-16T14:14:29.9677472Z                 "version": "2.12"
2026-09-16T14:14:29.9677594Z             }
2026-09-16T14:14:29.9677830Z         ], 
2026-09-16T14:14:29.9678105Z         "end": "2026-09-16 11:14:29.881035", 
2026-09-16T14:14:29.9678288Z         "failed": false, 
2026-09-16T14:14:29.9678448Z         "rc": 0, 
2026-09-16T14:14:29.9678657Z         "start": "2026-09-16 11:14:29.877470", 
2026-09-16T14:14:29.9678830Z         "stderr": "", 
2026-09-16T14:14:29.9679052Z         "stderr_lines": [], 
2026-09-16T14:14:29.9679705Z         "stdout": "[{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT\": \"/SIIFX\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT\": \"/SIIFX_SIGMS\"}]", 
2026-09-16T14:14:29.9680013Z         "stdout_lines": [
2026-09-16T14:14:29.9680626Z             "[{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT\": \"/SIIFX\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT\": \"/SIIFX_SIGMS\"}]"
2026-09-16T14:14:29.9680938Z         ]
2026-09-16T14:14:29.9681041Z     }
2026-09-16T14:14:29.9681140Z }
2026-09-16T14:14:29.9819920Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:14:29.9820139Z     "msg": {
2026-09-16T14:14:29.9820245Z         "ansible_facts": {
2026-09-16T14:14:29.9820385Z             "discovered_interpreter_python": "/usr/bin/python"
2026-09-16T14:14:29.9820518Z         }, 
2026-09-16T14:14:29.9820629Z         "changed": true, 
2026-09-16T14:14:29.9821710Z         "cmd": "echo '[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT_ISILON\": \"/SIIFX\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_3\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT_ISILON_2\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT_ISILON_4\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT_ISILON_4\": \"/SIIFX_SIGMS\"}]' | sed 's/NFS_ENDPOINT_ISILON[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_ISILON[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_HUAWEI[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_HUAWEI[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_VM[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_VM[^\"]*/NFS_MOUNT_POINT/g'", 
2026-09-16T14:14:29.9822533Z         "delta": "0:00:00.003234", 
2026-09-16T14:14:29.9822670Z         "deprecations": [
2026-09-16T14:14:29.9822781Z             {
2026-09-16T14:14:29.9823330Z                 "msg": "Distribution rhel 9.3 on host caddeapllx2798.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, but is using /usr/bin/python for backward compatibility with prior Ansible releases. A future Ansible release will default to using the discovered platform python for this host. See https://docs.ansible.com/ansible/2.9/reference_appendices/interpreter_discovery.html for more information", 
2026-09-16T14:14:29.9823615Z                 "version": "2.12"
2026-09-16T14:14:29.9823727Z             }
2026-09-16T14:14:29.9823823Z         ], 
2026-09-16T14:14:29.9823999Z         "end": "2026-09-16 11:14:29.866877", 
2026-09-16T14:14:29.9824126Z         "failed": false, 
2026-09-16T14:14:29.9824240Z         "rc": 0, 
2026-09-16T14:14:29.9824412Z         "start": "2026-09-16 11:14:29.863643", 
2026-09-16T14:14:29.9824528Z         "stderr": "", 
2026-09-16T14:14:29.9824640Z         "stderr_lines": [], 
2026-09-16T14:14:29.9825404Z         "stdout": "[{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT\": \"/SIIFX\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT\": \"/SIIFX_SIGMS\"}]", 
2026-09-16T14:14:29.9825731Z         "stdout_lines": [
2026-09-16T14:14:29.9826642Z             "[{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT\": \"/SIIFX\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT\": \"/SIIFX_SIGMS\"}]"
2026-09-16T14:14:29.9827017Z         ]
2026-09-16T14:14:29.9827120Z     }
2026-09-16T14:14:29.9827219Z }
2026-09-16T14:14:29.9845888Z Wednesday 16 September 2026  11:14:29 -0300 (0:00:00.081)       0:00:12.818 *** 
2026-09-16T14:14:30.0467293Z 
2026-09-16T14:14:30.0467979Z TASK [nfs : Parse JSON data] ***************************************************
2026-09-16T14:14:30.0468168Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T14:14:30.0515760Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:14:30.0551142Z Wednesday 16 September 2026  11:14:30 -0300 (0:00:00.070)       0:00:12.889 *** 
2026-09-16T14:14:30.1187781Z 
2026-09-16T14:14:30.1188629Z TASK [nfs : result_new_json] ***************************************************
2026-09-16T14:14:30.1189008Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br] => {
2026-09-16T14:14:30.1189178Z     "msg": [
2026-09-16T14:14:30.1189361Z         {
2026-09-16T14:14:30.1189887Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH", 
2026-09-16T14:14:30.1190128Z             "NFS_MOUNT_POINT": "/SIIFX"
2026-09-16T14:14:30.1190292Z         }, 
2026-09-16T14:14:30.1190429Z         {
2026-09-16T14:14:30.1191108Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF", 
2026-09-16T14:14:30.1191321Z             "NFS_MOUNT_POINT": "/SIIFX_SIISF"
2026-09-16T14:14:30.1191439Z         }, 
2026-09-16T14:14:30.1191542Z         {
2026-09-16T14:14:30.1191690Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX", 
2026-09-16T14:14:30.1191851Z             "NFS_MOUNT_POINT": "/SIIFX_B2B"
2026-09-16T14:14:30.1191966Z         }, 
2026-09-16T14:14:30.1192063Z         {
2026-09-16T14:14:30.1192208Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA", 
2026-09-16T14:14:30.1192369Z             "NFS_MOUNT_POINT": "/SIIFX_SIGMS"
2026-09-16T14:14:30.1192482Z         }
2026-09-16T14:14:30.1192584Z     ]
2026-09-16T14:14:30.1192668Z }
2026-09-16T14:14:30.1232720Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:14:30.1232942Z     "msg": [
2026-09-16T14:14:30.1233114Z         {
2026-09-16T14:14:30.1233465Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH", 
2026-09-16T14:14:30.1233696Z             "NFS_MOUNT_POINT": "/SIIFX"
2026-09-16T14:14:30.1233858Z         }, 
2026-09-16T14:14:30.1234002Z         {
2026-09-16T14:14:30.1234205Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF", 
2026-09-16T14:14:30.1234439Z             "NFS_MOUNT_POINT": "/SIIFX_SIISF"
2026-09-16T14:14:30.1234603Z         }, 
2026-09-16T14:14:30.1234742Z         {
2026-09-16T14:14:30.1234940Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX", 
2026-09-16T14:14:30.1235365Z             "NFS_MOUNT_POINT": "/SIIFX_B2B"
2026-09-16T14:14:30.1235529Z         }, 
2026-09-16T14:14:30.1235677Z         {
2026-09-16T14:14:30.1235880Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA", 
2026-09-16T14:14:30.1236107Z             "NFS_MOUNT_POINT": "/SIIFX_SIGMS"
2026-09-16T14:14:30.1236270Z         }
2026-09-16T14:14:30.1236403Z     ]
2026-09-16T14:14:30.1236643Z }
2026-09-16T14:14:30.1269108Z Wednesday 16 September 2026  11:14:30 -0300 (0:00:00.071)       0:00:12.961 *** 
2026-09-16T14:14:30.2334482Z included: /opt/ads-agent/_work/r13215/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx1214.agil.nprd.caixa.gov.br, caddeapllx2798.agil.nprd.caixa.gov.br
2026-09-16T14:14:30.2408661Z included: /opt/ads-agent/_work/r13215/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx1214.agil.nprd.caixa.gov.br, caddeapllx2798.agil.nprd.caixa.gov.br
2026-09-16T14:14:30.2482404Z included: /opt/ads-agent/_work/r13215/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx1214.agil.nprd.caixa.gov.br, caddeapllx2798.agil.nprd.caixa.gov.br
2026-09-16T14:14:30.2562788Z included: /opt/ads-agent/_work/r13215/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx1214.agil.nprd.caixa.gov.br, caddeapllx2798.agil.nprd.caixa.gov.br
2026-09-16T14:14:30.2646284Z Wednesday 16 September 2026  11:14:30 -0300 (0:00:00.137)       0:00:13.098 *** 
2026-09-16T14:14:30.3237379Z 
2026-09-16T14:14:30.3238033Z TASK [nfs : Parse JSON data] ***************************************************
2026-09-16T14:14:30.3238234Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T14:14:30.3295456Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:14:30.3332360Z Wednesday 16 September 2026  11:14:30 -0300 (0:00:00.068)       0:00:13.167 *** 
2026-09-16T14:14:30.3910566Z 
2026-09-16T14:14:30.3911280Z TASK [nfs : debug] *************************************************************
2026-09-16T14:14:30.3911464Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br] => {
2026-09-16T14:14:30.3911627Z     "msg": {
2026-09-16T14:14:30.3912067Z         "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH", 
2026-09-16T14:14:30.3914245Z         "NFS_MOUNT_POINT": "/SIIFX"
2026-09-16T14:14:30.3916294Z     }
2026-09-16T14:14:30.3920228Z }
2026-09-16T14:14:30.3973431Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:14:30.3975505Z     "msg": {
2026-09-16T14:14:30.3977771Z         "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH", 
2026-09-16T14:14:30.3978191Z         "NFS_MOUNT_POINT": "/SIIFX"
2026-09-16T14:14:30.3978705Z     }
2026-09-16T14:14:30.3978883Z }
2026-09-16T14:14:30.4011152Z Wednesday 16 September 2026  11:14:30 -0300 (0:00:00.067)       0:00:13.235 *** 
2026-09-16T14:14:30.4592527Z 
2026-09-16T14:14:30.4593215Z TASK [nfs : debug] *************************************************************
2026-09-16T14:14:30.4593499Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br] => {
2026-09-16T14:14:30.4593661Z     "msg": "/SIIFX"
2026-09-16T14:14:30.4593773Z }
2026-09-16T14:14:30.4642739Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:14:30.4643358Z     "msg": "/SIIFX"
2026-09-16T14:14:30.4643553Z }
2026-09-16T14:14:30.4678679Z Wednesday 16 September 2026  11:14:30 -0300 (0:00:00.066)       0:00:13.302 *** 
2026-09-16T14:14:30.5255595Z 
2026-09-16T14:14:30.5256325Z TASK [nfs : debug] *************************************************************
2026-09-16T14:14:30.5256595Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br] => {
2026-09-16T14:14:30.5257039Z     "msg": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH"
2026-09-16T14:14:30.5257199Z }
2026-09-16T14:14:30.5351393Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:14:30.5351781Z     "msg": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH"
2026-09-16T14:14:30.5351938Z }
2026-09-16T14:14:30.5391242Z Wednesday 16 September 2026  11:14:30 -0300 (0:00:00.071)       0:00:13.373 *** 
2026-09-16T14:14:30.5998693Z 
2026-09-16T14:14:30.5999346Z TASK [nfs : Verificando as variaveis] ******************************************
2026-09-16T14:14:30.5999605Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br] => {
2026-09-16T14:14:30.5999750Z     "changed": false, 
2026-09-16T14:14:30.5999936Z     "msg": "All assertions passed"
2026-09-16T14:14:30.6000049Z }
2026-09-16T14:14:30.6060966Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:14:30.6066827Z     "changed": false, 
2026-09-16T14:14:30.6067215Z     "msg": "All assertions passed"
2026-09-16T14:14:30.6067480Z }
2026-09-16T14:14:30.6103131Z Wednesday 16 September 2026  11:14:30 -0300 (0:00:00.071)       0:00:13.444 *** 
2026-09-16T14:14:33.9538890Z 
2026-09-16T14:14:33.9539532Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-09-16T14:14:33.9539720Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:14:34.1531187Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T14:14:34.1566345Z Wednesday 16 September 2026  11:14:34 -0300 (0:00:03.546)       0:00:16.990 *** 
2026-09-16T14:14:34.9032221Z 
2026-09-16T14:14:34.9033339Z TASK [nfs : Install networker lgtoclnt_url] ************************************
2026-09-16T14:14:34.9034585Z [WARNING]: Consider using the yum, dnf or zypper module rather than running
2026-09-16T14:14:34.9035509Z 'rpm'.  If you need to use command because yum, dnf or zypper is insufficient
2026-09-16T14:14:34.9035807Z you can add 'warn: false' to this command task or set 'command_warnings=False'
2026-09-16T14:14:34.9035979Z in ansible.cfg to get rid of this message.
2026-09-16T14:14:34.9040384Z fatal: [caddeapllx2798.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.479936", "end": "2026-09-16 11:14:34.886323", "msg": "non-zero return code", "rc": 1, "start": "2026-09-16 11:14:34.406387", "stderr": "aviso: /var/tmp/rpm-tmp.4YDb7K: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.4YDb7K: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-09-16T14:14:34.9042101Z ...ignoring
2026-09-16T14:14:38.0198859Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T14:14:38.0236891Z Wednesday 16 September 2026  11:14:38 -0300 (0:00:03.866)       0:00:20.857 *** 
2026-09-16T14:14:38.7095594Z 
2026-09-16T14:14:38.7096722Z TASK [nfs : Install networker lgtonmda_url] ************************************
2026-09-16T14:14:38.7101146Z fatal: [caddeapllx2798.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.432349", "end": "2026-09-16 11:14:38.692536", "msg": "non-zero return code", "rc": 1, "start": "2026-09-16 11:14:38.260187", "stderr": "aviso: /var/tmp/rpm-tmp.O3dmHt: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.O3dmHt: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-09-16T14:14:38.7102257Z ...ignoring
2026-09-16T14:14:41.4159291Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T14:14:41.4204532Z Wednesday 16 September 2026  11:14:41 -0300 (0:00:03.396)       0:00:24.254 *** 
2026-09-16T14:14:41.8568485Z 
2026-09-16T14:14:41.8569729Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-09-16T14:14:41.8570153Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:14:41.9252176Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T14:14:41.9293945Z Wednesday 16 September 2026  11:14:41 -0300 (0:00:00.508)       0:00:24.763 *** 
2026-09-16T14:14:42.1800997Z 
2026-09-16T14:14:42.1801896Z TASK [nfs : Create a symbolic link] ********************************************
2026-09-16T14:14:42.1802086Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T14:14:42.1802239Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:14:42.1832971Z Wednesday 16 September 2026  11:14:42 -0300 (0:00:00.253)       0:00:25.017 *** 
2026-09-16T14:14:43.0997536Z 
2026-09-16T14:14:43.0998604Z TASK [nfs : Networker | Start networker] ***************************************
2026-09-16T14:14:43.0998840Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:14:43.4591733Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T14:14:43.4631498Z Wednesday 16 September 2026  11:14:43 -0300 (0:00:01.279)       0:00:26.297 *** 
2026-09-16T14:14:43.7343819Z 
2026-09-16T14:14:43.7344467Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-09-16T14:14:43.7344659Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T14:14:43.7570946Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:14:43.7617548Z Wednesday 16 September 2026  11:14:43 -0300 (0:00:00.298)       0:00:26.595 *** 
2026-09-16T14:14:54.1676274Z 
2026-09-16T14:14:54.1677099Z TASK [nfs : Networker | Restart networker] *************************************
2026-09-16T14:14:54.1677286Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:15:04.2561419Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T14:15:04.2592010Z Wednesday 16 September 2026  11:15:04 -0300 (0:00:20.497)       0:00:47.093 *** 
2026-09-16T14:15:04.7159846Z 
2026-09-16T14:15:04.7160408Z TASK [nfs : Montando volume remoto] ********************************************
2026-09-16T14:15:04.7160587Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:18:08.7076973Z fatal: [caddeapllx1214.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "msg": "Error mounting /SIIFX: mount.nfs: Connection timed out\n"}
2026-09-16T14:18:08.7080457Z ...ignoring
2026-09-16T14:18:08.7107489Z Wednesday 16 September 2026  11:18:08 -0300 (0:03:04.451)       0:03:51.544 *** 
2026-09-16T14:18:08.7744572Z 
2026-09-16T14:18:08.7746238Z TASK [nfs : Validando Montagem] ************************************************
2026-09-16T14:18:08.7746608Z fatal: [caddeapllx1214.agil.nprd.caixa.gov.br]: FAILED! => {
2026-09-16T14:18:08.7746995Z     "assertion": "'Connection refused' in mountnfs.msg", 
2026-09-16T14:18:08.7747129Z     "changed": false, 
2026-09-16T14:18:08.7747254Z     "evaluated_to": false, 
2026-09-16T14:18:08.7747781Z     "msg": "Erro desconhecido: Error mounting /SIIFX: mount.nfs: Connection timed out\n"
2026-09-16T14:18:08.7747920Z }
2026-09-16T14:18:08.7781276Z Wednesday 16 September 2026  11:18:08 -0300 (0:00:00.067)       0:03:51.612 *** 
2026-09-16T14:18:08.8372494Z 
2026-09-16T14:18:08.8373478Z TASK [nfs : Parse JSON data] ***************************************************
2026-09-16T14:18:08.8373931Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:18:08.8406817Z Wednesday 16 September 2026  11:18:08 -0300 (0:00:00.062)       0:03:51.674 *** 
2026-09-16T14:18:08.8999471Z 
2026-09-16T14:18:08.9000186Z TASK [nfs : debug] *************************************************************
2026-09-16T14:18:08.9000398Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:18:08.9000528Z     "msg": {
2026-09-16T14:18:08.9000699Z         "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF", 
2026-09-16T14:18:08.9000845Z         "NFS_MOUNT_POINT": "/SIIFX_SIISF"
2026-09-16T14:18:08.9000965Z     }
2026-09-16T14:18:08.9001490Z }
2026-09-16T14:18:08.9035011Z Wednesday 16 September 2026  11:18:08 -0300 (0:00:00.062)       0:03:51.737 *** 
2026-09-16T14:18:08.9617450Z 
2026-09-16T14:18:08.9618025Z TASK [nfs : debug] *************************************************************
2026-09-16T14:18:08.9618195Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:18:08.9618338Z     "msg": "/SIIFX_SIISF"
2026-09-16T14:18:08.9618449Z }
2026-09-16T14:18:08.9654078Z Wednesday 16 September 2026  11:18:08 -0300 (0:00:00.061)       0:03:51.799 *** 
2026-09-16T14:18:09.0213947Z 
2026-09-16T14:18:09.0214519Z TASK [nfs : debug] *************************************************************
2026-09-16T14:18:09.0214708Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:18:09.0214868Z     "msg": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF"
2026-09-16T14:18:09.0215023Z }
2026-09-16T14:18:09.0248918Z Wednesday 16 September 2026  11:18:09 -0300 (0:00:00.059)       0:03:51.859 *** 
2026-09-16T14:18:09.0854080Z 
2026-09-16T14:18:09.0855070Z TASK [nfs : Verificando as variaveis] ******************************************
2026-09-16T14:18:09.0855576Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:18:09.0856002Z     "changed": false, 
2026-09-16T14:18:09.0856627Z     "msg": "All assertions passed"
2026-09-16T14:18:09.0856778Z }
2026-09-16T14:18:09.0898109Z Wednesday 16 September 2026  11:18:09 -0300 (0:00:00.064)       0:03:51.924 *** 
2026-09-16T14:18:11.9271286Z 
2026-09-16T14:18:11.9272319Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-09-16T14:18:11.9272585Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:18:11.9310167Z Wednesday 16 September 2026  11:18:11 -0300 (0:00:02.841)       0:03:54.765 *** 
2026-09-16T14:18:12.6515552Z 
2026-09-16T14:18:12.6516689Z TASK [nfs : Install networker lgtoclnt_url] ************************************
2026-09-16T14:18:12.6522169Z fatal: [caddeapllx2798.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.479946", "end": "2026-09-16 11:18:12.636571", "msg": "non-zero return code", "rc": 1, "start": "2026-09-16 11:18:12.156625", "stderr": "aviso: /var/tmp/rpm-tmp.rFSLMU: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.rFSLMU: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-09-16T14:18:12.6523251Z ...ignoring
2026-09-16T14:18:12.6557292Z Wednesday 16 September 2026  11:18:12 -0300 (0:00:00.724)       0:03:55.490 *** 
2026-09-16T14:18:13.3405771Z 
2026-09-16T14:18:13.3406385Z TASK [nfs : Install networker lgtonmda_url] ************************************
2026-09-16T14:18:13.3411151Z fatal: [caddeapllx2798.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.439514", "end": "2026-09-16 11:18:13.325274", "msg": "non-zero return code", "rc": 1, "start": "2026-09-16 11:18:12.885760", "stderr": "aviso: /var/tmp/rpm-tmp.CejLem: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.CejLem: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-09-16T14:18:13.3412417Z ...ignoring
2026-09-16T14:18:13.3457471Z Wednesday 16 September 2026  11:18:13 -0300 (0:00:00.689)       0:03:56.179 *** 
2026-09-16T14:18:13.5899865Z 
2026-09-16T14:18:13.5900637Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-09-16T14:18:13.5900854Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:18:13.5937911Z Wednesday 16 September 2026  11:18:13 -0300 (0:00:00.248)       0:03:56.427 *** 
2026-09-16T14:18:13.8410671Z 
2026-09-16T14:18:13.8411254Z TASK [nfs : Create a symbolic link] ********************************************
2026-09-16T14:18:13.8411435Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:18:13.8445926Z Wednesday 16 September 2026  11:18:13 -0300 (0:00:00.250)       0:03:56.678 *** 
2026-09-16T14:18:14.4544504Z 
2026-09-16T14:18:14.4545073Z TASK [nfs : Networker | Start networker] ***************************************
2026-09-16T14:18:14.4545356Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:18:14.4594998Z Wednesday 16 September 2026  11:18:14 -0300 (0:00:00.614)       0:03:57.293 *** 
2026-09-16T14:18:14.7183009Z 
2026-09-16T14:18:14.7183578Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-09-16T14:18:14.7184179Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:18:14.7221788Z Wednesday 16 September 2026  11:18:14 -0300 (0:00:00.262)       0:03:57.556 *** 
2026-09-16T14:18:25.1200050Z 
2026-09-16T14:18:25.1200915Z TASK [nfs : Networker | Restart networker] *************************************
2026-09-16T14:18:25.1201523Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:18:25.1232114Z Wednesday 16 September 2026  11:18:25 -0300 (0:00:10.400)       0:04:07.957 *** 
2026-09-16T14:18:25.4268188Z 
2026-09-16T14:18:25.4268931Z TASK [nfs : Montando volume remoto] ********************************************
2026-09-16T14:18:25.4269362Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:18:25.4308347Z Wednesday 16 September 2026  11:18:25 -0300 (0:00:00.307)       0:04:08.265 *** 
2026-09-16T14:18:25.4765354Z Wednesday 16 September 2026  11:18:25 -0300 (0:00:00.045)       0:04:08.310 *** 
2026-09-16T14:18:25.5359527Z 
2026-09-16T14:18:25.5360106Z TASK [nfs : Parse JSON data] ***************************************************
2026-09-16T14:18:25.5360305Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:18:25.5392886Z Wednesday 16 September 2026  11:18:25 -0300 (0:00:00.063)       0:04:08.373 *** 
2026-09-16T14:18:25.5991656Z 
2026-09-16T14:18:25.5992706Z TASK [nfs : debug] *************************************************************
2026-09-16T14:18:25.5995579Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:18:25.5995853Z     "msg": {
2026-09-16T14:18:25.5996694Z         "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX", 
2026-09-16T14:18:25.5997029Z         "NFS_MOUNT_POINT": "/SIIFX_B2B"
2026-09-16T14:18:25.5997638Z     }
2026-09-16T14:18:25.5997886Z }
2026-09-16T14:18:25.6042231Z Wednesday 16 September 2026  11:18:25 -0300 (0:00:00.064)       0:04:08.438 *** 
2026-09-16T14:18:25.6650953Z 
2026-09-16T14:18:25.6651979Z TASK [nfs : debug] *************************************************************
2026-09-16T14:18:25.6652678Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:18:25.6652977Z     "msg": "/SIIFX_B2B"
2026-09-16T14:18:25.6653095Z }
2026-09-16T14:18:25.6687950Z Wednesday 16 September 2026  11:18:25 -0300 (0:00:00.064)       0:04:08.503 *** 
2026-09-16T14:18:25.7270862Z 
2026-09-16T14:18:25.7271414Z TASK [nfs : debug] *************************************************************
2026-09-16T14:18:25.7274417Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:18:25.7274968Z     "msg": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX"
2026-09-16T14:18:25.7275144Z }
2026-09-16T14:18:25.7312283Z Wednesday 16 September 2026  11:18:25 -0300 (0:00:00.062)       0:04:08.565 *** 
2026-09-16T14:18:25.7921042Z 
2026-09-16T14:18:25.7922190Z TASK [nfs : Verificando as variaveis] ******************************************
2026-09-16T14:18:25.7922425Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:18:25.7922568Z     "changed": false, 
2026-09-16T14:18:25.7923746Z     "msg": "All assertions passed"
2026-09-16T14:18:25.7924319Z }
2026-09-16T14:18:25.7959487Z Wednesday 16 September 2026  11:18:25 -0300 (0:00:00.064)       0:04:08.630 *** 
2026-09-16T14:18:28.2759158Z 
2026-09-16T14:18:28.2760137Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-09-16T14:18:28.2760739Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:18:28.2778575Z Wednesday 16 September 2026  11:18:28 -0300 (0:00:02.481)       0:04:11.112 *** 
2026-09-16T14:18:29.0210279Z 
2026-09-16T14:18:29.0211002Z TASK [nfs : Install networker lgtoclnt_url] ************************************
2026-09-16T14:18:29.0212740Z fatal: [caddeapllx2798.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.482287", "end": "2026-09-16 11:18:29.003911", "msg": "non-zero return code", "rc": 1, "start": "2026-09-16 11:18:28.521624", "stderr": "aviso: /var/tmp/rpm-tmp.dHJ1IS: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.dHJ1IS: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-09-16T14:18:29.0213795Z ...ignoring
2026-09-16T14:18:29.0249550Z Wednesday 16 September 2026  11:18:29 -0300 (0:00:00.747)       0:04:11.859 *** 
2026-09-16T14:18:29.7413028Z 
2026-09-16T14:18:29.7414067Z TASK [nfs : Install networker lgtonmda_url] ************************************
2026-09-16T14:18:29.7418712Z fatal: [caddeapllx2798.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.468624", "end": "2026-09-16 11:18:29.725712", "msg": "non-zero return code", "rc": 1, "start": "2026-09-16 11:18:29.257088", "stderr": "aviso: /var/tmp/rpm-tmp.htE3ZD: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.htE3ZD: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-09-16T14:18:29.7419787Z ...ignoring
2026-09-16T14:18:29.7455952Z Wednesday 16 September 2026  11:18:29 -0300 (0:00:00.720)       0:04:12.579 *** 
2026-09-16T14:18:29.9915224Z 
2026-09-16T14:18:29.9916081Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-09-16T14:18:29.9916260Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:18:29.9953566Z Wednesday 16 September 2026  11:18:29 -0300 (0:00:00.249)       0:04:12.829 *** 
2026-09-16T14:18:30.2430190Z 
2026-09-16T14:18:30.2430807Z TASK [nfs : Create a symbolic link] ********************************************
2026-09-16T14:18:30.2431081Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:18:30.2466991Z Wednesday 16 September 2026  11:18:30 -0300 (0:00:00.251)       0:04:13.080 *** 
2026-09-16T14:18:31.1119394Z 
2026-09-16T14:18:31.1120691Z TASK [nfs : Networker | Start networker] ***************************************
2026-09-16T14:18:31.1122314Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:18:31.1196968Z Wednesday 16 September 2026  11:18:31 -0300 (0:00:00.872)       0:04:13.953 *** 
2026-09-16T14:18:31.3720576Z 
2026-09-16T14:18:31.3721489Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-09-16T14:18:31.3722232Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:18:31.3749779Z Wednesday 16 September 2026  11:18:31 -0300 (0:00:00.255)       0:04:14.209 *** 
2026-09-16T14:18:41.7809945Z 
2026-09-16T14:18:41.7810489Z TASK [nfs : Networker | Restart networker] *************************************
2026-09-16T14:18:41.7810814Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:18:41.7847804Z Wednesday 16 September 2026  11:18:41 -0300 (0:00:10.409)       0:04:24.618 *** 
2026-09-16T14:18:42.0425471Z 
2026-09-16T14:18:42.0426107Z TASK [nfs : Montando volume remoto] ********************************************
2026-09-16T14:18:42.0426295Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:18:42.0460074Z Wednesday 16 September 2026  11:18:42 -0300 (0:00:00.261)       0:04:24.880 *** 
2026-09-16T14:18:42.0944954Z Wednesday 16 September 2026  11:18:42 -0300 (0:00:00.048)       0:04:24.928 *** 
2026-09-16T14:18:42.1535788Z 
2026-09-16T14:18:42.1537028Z TASK [nfs : Parse JSON data] ***************************************************
2026-09-16T14:18:42.1537251Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:18:42.1569580Z Wednesday 16 September 2026  11:18:42 -0300 (0:00:00.062)       0:04:24.991 *** 
2026-09-16T14:18:42.2180129Z 
2026-09-16T14:18:42.2180996Z TASK [nfs : debug] *************************************************************
2026-09-16T14:18:42.2182237Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:18:42.2182895Z     "msg": {
2026-09-16T14:18:42.2183138Z         "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA", 
2026-09-16T14:18:42.2183456Z         "NFS_MOUNT_POINT": "/SIIFX_SIGMS"
2026-09-16T14:18:42.2183588Z     }
2026-09-16T14:18:42.2183694Z }
2026-09-16T14:18:42.2219154Z Wednesday 16 September 2026  11:18:42 -0300 (0:00:00.064)       0:04:25.056 *** 
2026-09-16T14:18:42.2837247Z 
2026-09-16T14:18:42.2837912Z TASK [nfs : debug] *************************************************************
2026-09-16T14:18:42.2838161Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:18:42.2838380Z     "msg": "/SIIFX_SIGMS"
2026-09-16T14:18:42.2838501Z }
2026-09-16T14:18:42.2872255Z Wednesday 16 September 2026  11:18:42 -0300 (0:00:00.065)       0:04:25.121 *** 
2026-09-16T14:18:42.3476065Z 
2026-09-16T14:18:42.3477059Z TASK [nfs : debug] *************************************************************
2026-09-16T14:18:42.3477253Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:18:42.3477469Z     "msg": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA"
2026-09-16T14:18:42.3477610Z }
2026-09-16T14:18:42.3512337Z Wednesday 16 September 2026  11:18:42 -0300 (0:00:00.063)       0:04:25.185 *** 
2026-09-16T14:18:42.4132043Z 
2026-09-16T14:18:42.4132692Z TASK [nfs : Verificando as variaveis] ******************************************
2026-09-16T14:18:42.4132881Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:18:42.4134588Z     "changed": false, 
2026-09-16T14:18:42.4136757Z     "msg": "All assertions passed"
2026-09-16T14:18:42.4138705Z }
2026-09-16T14:18:42.4166340Z Wednesday 16 September 2026  11:18:42 -0300 (0:00:00.065)       0:04:25.250 *** 
2026-09-16T14:18:45.0715487Z 
2026-09-16T14:18:45.0716222Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-09-16T14:18:45.0716566Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:18:45.0735380Z Wednesday 16 September 2026  11:18:45 -0300 (0:00:02.656)       0:04:27.907 *** 
2026-09-16T14:18:45.8643569Z 
2026-09-16T14:18:45.8644125Z TASK [nfs : Install networker lgtoclnt_url] ************************************
2026-09-16T14:18:45.8649631Z fatal: [caddeapllx2798.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.548839", "end": "2026-09-16 11:18:45.848034", "msg": "non-zero return code", "rc": 1, "start": "2026-09-16 11:18:45.299195", "stderr": "aviso: /var/tmp/rpm-tmp.yyK8bs: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.yyK8bs: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-09-16T14:18:45.8650620Z ...ignoring
2026-09-16T14:18:45.8686441Z Wednesday 16 September 2026  11:18:45 -0300 (0:00:00.795)       0:04:28.702 *** 
2026-09-16T14:18:46.5562086Z 
2026-09-16T14:18:46.5563109Z TASK [nfs : Install networker lgtonmda_url] ************************************
2026-09-16T14:18:46.5569153Z fatal: [caddeapllx2798.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.423174", "end": "2026-09-16 11:18:46.540310", "msg": "non-zero return code", "rc": 1, "start": "2026-09-16 11:18:46.117136", "stderr": "aviso: /var/tmp/rpm-tmp.hJ5BUl: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.hJ5BUl: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-09-16T14:18:46.5570236Z ...ignoring
2026-09-16T14:18:46.5614069Z Wednesday 16 September 2026  11:18:46 -0300 (0:00:00.692)       0:04:29.395 *** 
2026-09-16T14:18:46.8070775Z 
2026-09-16T14:18:46.8071560Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-09-16T14:18:46.8071771Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:18:46.8111900Z Wednesday 16 September 2026  11:18:46 -0300 (0:00:00.249)       0:04:29.645 *** 
2026-09-16T14:18:47.0730181Z 
2026-09-16T14:18:47.0731103Z TASK [nfs : Create a symbolic link] ********************************************
2026-09-16T14:18:47.0731753Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:18:47.0762215Z Wednesday 16 September 2026  11:18:47 -0300 (0:00:00.265)       0:04:29.910 *** 
2026-09-16T14:18:47.7049845Z 
2026-09-16T14:18:47.7050447Z TASK [nfs : Networker | Start networker] ***************************************
2026-09-16T14:18:47.7050649Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:18:47.7095678Z Wednesday 16 September 2026  11:18:47 -0300 (0:00:00.633)       0:04:30.543 *** 
2026-09-16T14:18:47.9629045Z 
2026-09-16T14:18:47.9630025Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-09-16T14:18:47.9630305Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:18:47.9668406Z Wednesday 16 September 2026  11:18:47 -0300 (0:00:00.257)       0:04:30.800 *** 
2026-09-16T14:18:58.3551451Z 
2026-09-16T14:18:58.3552231Z TASK [nfs : Networker | Restart networker] *************************************
2026-09-16T14:18:58.3552498Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:18:58.3589593Z Wednesday 16 September 2026  11:18:58 -0300 (0:00:10.392)       0:04:41.193 *** 
2026-09-16T14:18:58.6366630Z 
2026-09-16T14:18:58.6367561Z TASK [nfs : Montando volume remoto] ********************************************
2026-09-16T14:18:58.6367923Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:18:58.6405535Z Wednesday 16 September 2026  11:18:58 -0300 (0:00:00.281)       0:04:41.474 *** 
2026-09-16T14:18:58.6863676Z 
2026-09-16T14:18:58.6864572Z PLAY [jboss] *******************************************************************
2026-09-16T14:18:58.6893471Z 
2026-09-16T14:18:58.6894129Z PLAY [Copiando deployments adicionais] *****************************************
2026-09-16T14:18:58.6922461Z 
2026-09-16T14:18:58.6922928Z PLAY [Copiando modules adicionais] *********************************************
2026-09-16T14:18:58.6952639Z 
2026-09-16T14:18:58.6953179Z PLAY [jboss] *******************************************************************
2026-09-16T14:18:58.6991083Z 
2026-09-16T14:18:58.6991690Z PLAY [jboss] *******************************************************************
2026-09-16T14:18:58.7021237Z 
2026-09-16T14:18:58.7021756Z PLAY [jboss] *******************************************************************
2026-09-16T14:18:58.7055675Z 
2026-09-16T14:18:58.7056180Z PLAY [jboss] *******************************************************************
2026-09-16T14:18:58.7085540Z 
2026-09-16T14:18:58.7086218Z PLAY [jboss] *******************************************************************
2026-09-16T14:18:58.7112528Z 
2026-09-16T14:18:58.7113042Z PLAY [local] *******************************************************************
2026-09-16T14:18:58.7141963Z [WARNING]: Could not match supplied host pattern, ignoring: instance_restart
2026-09-16T14:18:58.7143736Z 
2026-09-16T14:18:58.7144209Z PLAY [instance_restart] ********************************************************
2026-09-16T14:18:58.7144832Z skipping: no hosts matched
2026-09-16T14:18:58.7146724Z [WARNING]: Could not match supplied host pattern, ignoring: machine_reboot
2026-09-16T14:18:58.7149905Z 
2026-09-16T14:18:58.7150371Z PLAY [machine_reboot] **********************************************************
2026-09-16T14:18:58.7150559Z skipping: no hosts matched
2026-09-16T14:18:58.7157610Z 
2026-09-16T14:18:58.7158172Z PLAY [local] *******************************************************************
2026-09-16T14:18:58.7185516Z [WARNING]: Could not match supplied host pattern, ignoring: instance_stop
2026-09-16T14:18:58.7188005Z 
2026-09-16T14:18:58.7188409Z PLAY [instance_stop] ***********************************************************
2026-09-16T14:18:58.7188603Z skipping: no hosts matched
2026-09-16T14:18:58.7191015Z 
2026-09-16T14:18:58.7191166Z PLAY [machine_reboot] **********************************************************
2026-09-16T14:18:58.7191699Z skipping: no hosts matched
2026-09-16T14:18:58.7198122Z 
2026-09-16T14:18:58.7198293Z PLAY [local] *******************************************************************
2026-09-16T14:18:58.7223414Z [WARNING]: Could not match supplied host pattern, ignoring: escopo_execucao
2026-09-16T14:18:58.7227275Z 
2026-09-16T14:18:58.7227578Z PLAY [Executar o Start do Sirot Connector no escopo definido] ******************
2026-09-16T14:18:58.7227819Z skipping: no hosts matched
2026-09-16T14:18:58.7233882Z 
2026-09-16T14:18:58.7234027Z PLAY [local] *******************************************************************
2026-09-16T14:18:58.7257550Z 
2026-09-16T14:18:58.7257794Z PLAY [Executar o Stop do Sirot Connector] **************************************
2026-09-16T14:18:58.7258021Z skipping: no hosts matched
2026-09-16T14:18:58.7273463Z 
2026-09-16T14:18:58.7273957Z PLAY [Configura TSM] ***********************************************************
2026-09-16T14:18:58.7300274Z 
2026-09-16T14:18:58.7300488Z PLAY [jboss] *******************************************************************
2026-09-16T14:18:58.7340837Z Wednesday 16 September 2026  11:18:58 -0300 (0:00:00.093)       0:04:41.568 *** 
2026-09-16T14:18:58.7956885Z 
2026-09-16T14:18:58.7957660Z TASK [Cria variável build_repository_name] *************************************
2026-09-16T14:18:58.7957839Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:18:58.7987063Z Wednesday 16 September 2026  11:18:58 -0300 (0:00:00.064)       0:04:41.632 *** 
2026-09-16T14:18:58.8588053Z 
2026-09-16T14:18:58.8589011Z TASK [Buscando diretorio de config] ********************************************
2026-09-16T14:18:58.8589673Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:18:58.8708520Z Wednesday 16 September 2026  11:18:58 -0300 (0:00:00.071)       0:04:41.704 *** 
2026-09-16T14:18:59.2798278Z 
2026-09-16T14:18:59.2799014Z TASK [Verifica se o arquivo {{ item }}/etc/hosts-{{ sistema_ambiente }} existe] ***
2026-09-16T14:18:59.2799319Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r13215/a/_SIIFX-batch-config)
2026-09-16T14:18:59.5766178Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r13215/a/_SIIFX-batch-config/so)
2026-09-16T14:18:59.5809748Z Wednesday 16 September 2026  11:18:59 -0300 (0:00:00.710)       0:04:42.415 *** 
2026-09-16T14:19:00.0096422Z 
2026-09-16T14:19:00.0097672Z TASK [Altera arquivo /etc/hosts] ***********************************************
2026-09-16T14:19:00.0099404Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => (item={u'item': u'/opt/ads-agent/_work/r13215/a/_SIIFX-batch-config', u'stat': {u'charset': u'us-ascii', u'uid': 1000, u'exists': True, u'attr_flags': u'', u'woth': False, u'device_type': 0, u'mtime': 1789568052.2861485, u'block_size': 4096, u'inode': 343951365, u'isgid': False, u'size': 175, u'wgrp': False, u'executable': False, u'isuid': False, u'readable': True, u'isreg': True, u'version': u'839559688', u'pw_name': u'sadscp01', u'gid': 1000, u'ischr': False, u'wusr': True, u'writeable': True, u'mimetype': u'text/plain', u'blocks': 8, u'xoth': False, u'islnk': False, u'nlink': 1, u'issock': False, u'rgrp': True, u'gr_name': u'sadscp01', u'path': u'/opt/ads-agent/_work/r13215/a/_SIIFX-batch-config/etc/hosts-des', u'xusr': False, u'atime': 1789568052.3101485, u'isdir': False, u'ctime': 1789568052.2861485, u'isblk': False, u'checksum': u'b189d1cdee317ad9f292a99c63b64d9c07bc0b06', u'dev': 64771, u'roth': True, u'isfifo': False, u'mode': u'0644', u'xgrp': False, u'rusr': True, u'attributes': []}, u'ansible_loop_var': u'item', u'failed': False, u'invocation': {u'module_args': {u'follow': False, u'get_checksum': True, u'path': u'/opt/ads-agent/_work/r13215/a/_SIIFX-batch-config/etc/hosts-des', u'checksum_algorithm': u'sha1', u'get_md5': False, u'get_mime': True, u'get_attributes': True}}, u'changed': False})
2026-09-16T14:19:00.0176097Z 
2026-09-16T14:19:00.0178842Z PLAY [Configura Control-M] *****************************************************
2026-09-16T14:19:00.0240387Z Wednesday 16 September 2026  11:19:00 -0300 (0:00:00.442)       0:04:42.858 *** 
2026-09-16T14:19:00.6465688Z 
2026-09-16T14:19:00.6466895Z TASK [Gathering Facts] *********************************************************
2026-09-16T14:19:00.6467237Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:19:00.6680034Z Wednesday 16 September 2026  11:19:00 -0300 (0:00:00.643)       0:04:43.501 *** 
2026-09-16T14:19:00.9160831Z 
2026-09-16T14:19:00.9161446Z TASK [stat] ********************************************************************
2026-09-16T14:19:00.9161617Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:19:00.9310608Z Wednesday 16 September 2026  11:19:00 -0300 (0:00:00.263)       0:04:43.765 *** 
2026-09-16T14:19:00.9940338Z 
2026-09-16T14:19:00.9941300Z TASK [assert] ******************************************************************
2026-09-16T14:19:00.9941993Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:19:00.9942197Z     "changed": false, 
2026-09-16T14:19:00.9942327Z     "msg": "All assertions passed"
2026-09-16T14:19:00.9942439Z }
2026-09-16T14:19:01.0090315Z Wednesday 16 September 2026  11:19:01 -0300 (0:00:00.077)       0:04:43.843 *** 
2026-09-16T14:19:01.0855600Z 
2026-09-16T14:19:01.0856885Z TASK [control_m : Cria variável ansible] ***************************************
2026-09-16T14:19:01.0857535Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:19:01.1030669Z Wednesday 16 September 2026  11:19:01 -0300 (0:00:00.094)       0:04:43.937 *** 
2026-09-16T14:19:01.8943475Z 
2026-09-16T14:19:01.8944255Z TASK [control_m : Copiando arquivo de certificado] *****************************
2026-09-16T14:19:01.8944911Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:19:01.9104757Z Wednesday 16 September 2026  11:19:01 -0300 (0:00:00.807)       0:04:44.744 *** 
2026-09-16T14:19:02.1618244Z 
2026-09-16T14:19:02.1619127Z TASK [control_m : Executando add-user.sh] **************************************
2026-09-16T14:19:02.1619484Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:19:02.1784662Z Wednesday 16 September 2026  11:19:02 -0300 (0:00:00.268)       0:04:45.012 *** 
2026-09-16T14:19:02.6189485Z 
2026-09-16T14:19:02.6190380Z TASK [control_m : Removendo add-user.sh] ***************************************
2026-09-16T14:19:02.6190633Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:19:02.6392267Z Wednesday 16 September 2026  11:19:02 -0300 (0:00:00.460)       0:04:45.473 *** 
2026-09-16T14:19:02.8912525Z 
2026-09-16T14:19:02.8913464Z TASK [control_m : Criacao diretorio /producao/carga] ***************************
2026-09-16T14:19:02.8914185Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:19:02.9079715Z Wednesday 16 September 2026  11:19:02 -0300 (0:00:00.268)       0:04:45.742 *** 
2026-09-16T14:19:03.1570118Z 
2026-09-16T14:19:03.1570786Z TASK [control_m : Criacao diretorio /producao/suporte] *************************
2026-09-16T14:19:03.1570959Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:19:03.1727246Z Wednesday 16 September 2026  11:19:03 -0300 (0:00:00.264)       0:04:46.006 *** 
2026-09-16T14:19:03.7336218Z 
2026-09-16T14:19:03.7336916Z TASK [control_m : Garante bash_profile] ****************************************
2026-09-16T14:19:03.7337094Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:19:03.7498880Z Wednesday 16 September 2026  11:19:03 -0300 (0:00:00.577)       0:04:46.584 *** 
2026-09-16T14:19:03.9975780Z 
2026-09-16T14:19:03.9977040Z TASK [control_m : Cria Diretório de Scripts] ***********************************
2026-09-16T14:19:03.9977218Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:19:04.0143084Z Wednesday 16 September 2026  11:19:04 -0300 (0:00:00.264)       0:04:46.848 *** 
2026-09-16T14:19:55.6471132Z 
2026-09-16T14:19:55.6472585Z TASK [control_m : Copia Scripts] ***********************************************
2026-09-16T14:19:55.6473257Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:19:55.6618407Z Wednesday 16 September 2026  11:19:55 -0300 (0:00:51.647)       0:05:38.495 *** 
2026-09-16T14:19:55.9212690Z 
2026-09-16T14:19:55.9213552Z TASK [control_m : Verifica se o arquivo /producao//configuration/custom.sh existe] ***
2026-09-16T14:19:55.9214425Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:19:55.9395894Z Wednesday 16 September 2026  11:19:55 -0300 (0:00:00.277)       0:05:38.773 *** 
2026-09-16T14:19:56.1895862Z 
2026-09-16T14:19:56.1897188Z TASK [control_m : Executa shell customizada] ***********************************
2026-09-16T14:19:56.1897904Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:19:56.2075073Z Wednesday 16 September 2026  11:19:56 -0300 (0:00:00.267)       0:05:39.041 *** 
2026-09-16T14:19:56.8442032Z 
2026-09-16T14:19:56.8443439Z TASK [control_m : Configuração Control-M] **************************************
2026-09-16T14:19:56.8444210Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:19:56.8619233Z Wednesday 16 September 2026  11:19:56 -0300 (0:00:00.654)       0:05:39.695 *** 
2026-09-16T14:20:02.9778109Z 
2026-09-16T14:20:02.9779172Z TASK [control_m : Restart ControlM] ********************************************
2026-09-16T14:20:02.9779485Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:20:02.9836404Z 
2026-09-16T14:20:02.9837300Z PLAY [jboss] *******************************************************************
2026-09-16T14:20:02.9913416Z 
2026-09-16T14:20:02.9914060Z PLAY [jboss] *******************************************************************
2026-09-16T14:20:02.9978094Z 
2026-09-16T14:20:02.9978685Z PLAY [jboss] *******************************************************************
2026-09-16T14:20:03.0010375Z 
2026-09-16T14:20:03.0010883Z PLAY [jboss] *******************************************************************
2026-09-16T14:20:03.0057686Z 
2026-09-16T14:20:03.0058149Z PLAY [localhost] ***************************************************************
2026-09-16T14:20:03.0090541Z 
2026-09-16T14:20:03.0090961Z PLAY [jboss] *******************************************************************
2026-09-16T14:20:03.0145340Z 
2026-09-16T14:20:03.0145767Z PLAY [jboss] *******************************************************************
2026-09-16T14:20:03.0209029Z 
2026-09-16T14:20:03.0209467Z PLAY [jboss] *******************************************************************
2026-09-16T14:20:03.0241348Z 
2026-09-16T14:20:03.0241792Z PLAY RECAP *********************************************************************
2026-09-16T14:20:03.0242044Z caddeapllx1214.agil.nprd.caixa.gov.br : ok=30   changed=9    unreachable=0    failed=1    skipped=0    rescued=0    ignored=1   
2026-09-16T14:20:03.0242276Z caddeapllx2798.agil.nprd.caixa.gov.br : ok=92   changed=32   unreachable=0    failed=0    skipped=4    rescued=0    ignored=8   
2026-09-16T14:20:03.0242408Z 
2026-09-16T14:20:03.0243525Z Wednesday 16 September 2026  11:20:03 -0300 (0:00:06.162)       0:05:45.858 *** 
2026-09-16T14:20:03.0243720Z =============================================================================== 
2026-09-16T14:20:03.0247973Z nfs : Montando volume remoto ------------------------------------------ 184.45s
2026-09-16T14:20:03.0248444Z control_m : Copia Scripts ---------------------------------------------- 51.65s
2026-09-16T14:20:03.0248839Z nfs : Networker | Restart networker ------------------------------------ 20.50s
2026-09-16T14:20:03.0249182Z nfs : execute montagem script ------------------------------------------ 10.53s
2026-09-16T14:20:03.0249518Z nfs : Networker | Restart networker ------------------------------------ 10.41s
2026-09-16T14:20:03.0250607Z nfs : Networker | Restart networker ------------------------------------ 10.40s
2026-09-16T14:20:03.0255511Z nfs : Networker | Restart networker ------------------------------------ 10.39s
2026-09-16T14:20:03.0255844Z control_m : Restart ControlM -------------------------------------------- 6.16s
2026-09-16T14:20:03.0256114Z nfs : Install networker lgtoclnt_url ------------------------------------ 3.87s
2026-09-16T14:20:03.0256346Z nfs : Instalando o NFS Client ------------------------------------------- 3.55s
2026-09-16T14:20:03.0256692Z nfs : Install networker lgtonmda_url ------------------------------------ 3.40s
2026-09-16T14:20:03.0256934Z nfs : Instalando o NFS Client ------------------------------------------- 2.84s
2026-09-16T14:20:03.0257165Z nfs : Instalando o NFS Client ------------------------------------------- 2.66s
2026-09-16T14:20:03.0257421Z nfs : Instalando o NFS Client ------------------------------------------- 2.48s
2026-09-16T14:20:03.0257703Z nfs : Networker | Start networker --------------------------------------- 1.28s
2026-09-16T14:20:03.0258005Z nfs : Networker | Start networker --------------------------------------- 0.87s
2026-09-16T14:20:03.0258289Z control_m : Copiando arquivo de certificado ----------------------------- 0.81s
2026-09-16T14:20:03.0258600Z nfs : Install networker lgtoclnt_url ------------------------------------ 0.80s
2026-09-16T14:20:03.0258909Z nfs : Install networker lgtoclnt_url ------------------------------------ 0.75s
2026-09-16T14:20:03.0259140Z nfs : Install networker lgtoclnt_url ------------------------------------ 0.72s
2026-09-16T14:20:03.0259301Z Playbook run took 0 days, 0 hours, 5 minutes, 45 seconds
2026-09-16T14:20:03.1690639Z ##[error]Bash exited with code '2'.
2026-09-16T14:20:03.1697025Z ##[warning]RetryHelper encountered task failure, will retry (attempt #: 1 out of 2) after 1000 ms
2026-09-16T14:20:04.2661687Z Generating script.
2026-09-16T14:20:04.2677616Z ========================== Starting Command Output ===========================
2026-09-16T14:20:04.2686878Z [command]/bin/bash /opt/ads-agent/_work/_temp/ef8830ec-d115-459d-9c4e-a9696be22a46.sh
2026-09-16T14:20:06.5864119Z 
2026-09-16T14:20:06.5865067Z PLAY [local] *******************************************************************
2026-09-16T14:20:06.6198506Z 
2026-09-16T14:20:06.6199147Z PLAY [Configurando o DNS] ******************************************************
2026-09-16T14:20:06.9672503Z 
2026-09-16T14:20:06.9673219Z PLAY [local] *******************************************************************
2026-09-16T14:20:06.9708708Z 
2026-09-16T14:20:06.9709543Z PLAY [Verificando serviços] ****************************************************
2026-09-16T14:20:06.9810207Z 
2026-09-16T14:20:06.9811179Z PLAY [Configuração LDAP] *******************************************************
2026-09-16T14:20:06.9847342Z [WARNING]: Found variable using reserved name: when
2026-09-16T14:20:06.9851498Z 
2026-09-16T14:20:06.9852254Z PLAY [jboss] *******************************************************************
2026-09-16T14:20:06.9953541Z 
2026-09-16T14:20:06.9953798Z PLAY [Stack Jboss] *************************************************************
2026-09-16T14:20:06.9983093Z 
2026-09-16T14:20:06.9983655Z PLAY [jboss] *******************************************************************
2026-09-16T14:20:07.0026271Z 
2026-09-16T14:20:07.0026770Z PLAY [jboss] *******************************************************************
2026-09-16T14:20:07.0320383Z Wednesday 16 September 2026  11:20:07 -0300 (0:00:00.508)       0:00:00.508 *** 
2026-09-16T14:20:07.6176934Z 
2026-09-16T14:20:07.6177743Z TASK [Verifica se o arquivo nfs_config.json existe] ****************************
2026-09-16T14:20:07.6177923Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T14:20:07.6212512Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:20:07.6229654Z Wednesday 16 September 2026  11:20:07 -0300 (0:00:00.591)       0:00:01.099 *** 
2026-09-16T14:20:07.6806726Z included: /opt/ads-agent/_work/r13215/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for caddeapllx1214.agil.nprd.caixa.gov.br, caddeapllx2798.agil.nprd.caixa.gov.br
2026-09-16T14:20:07.6862726Z Wednesday 16 September 2026  11:20:07 -0300 (0:00:00.063)       0:00:01.163 *** 
2026-09-16T14:20:07.7470686Z 
2026-09-16T14:20:07.7471881Z TASK [nfs : Criar variáveis] ***************************************************
2026-09-16T14:20:07.7472258Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T14:20:07.7549128Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:20:07.7607094Z Wednesday 16 September 2026  11:20:07 -0300 (0:00:00.074)       0:00:01.237 *** 
2026-09-16T14:20:08.2635825Z 
2026-09-16T14:20:08.2637336Z TASK [nfs : Coletar variáveis de ambiente] *************************************
2026-09-16T14:20:08.2638282Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:20:08.2640039Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T14:20:08.2684357Z Wednesday 16 September 2026  11:20:08 -0300 (0:00:00.507)       0:00:01.745 *** 
2026-09-16T14:20:08.3283446Z 
2026-09-16T14:20:08.3284484Z TASK [nfs : Exibir resultado em JSON] ******************************************
2026-09-16T14:20:08.3287600Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br] => {
2026-09-16T14:20:08.3288245Z     "nfs_vars_json": {
2026-09-16T14:20:08.3288457Z         "changed": false, 
2026-09-16T14:20:08.3288884Z         "cmd": "cat /opt/ads-agent/_work/r13215/a/nfs_config.json", 
2026-09-16T14:20:08.3289095Z         "delta": "0:00:00.006132", 
2026-09-16T14:20:08.3289295Z         "end": "2026-09-16 11:20:08.240595", 
2026-09-16T14:20:08.3289427Z         "failed": false, 
2026-09-16T14:20:08.3289561Z         "rc": 0, 
2026-09-16T14:20:08.3289988Z         "start": "2026-09-16 11:20:08.234463", 
2026-09-16T14:20:08.3290178Z         "stderr": "", 
2026-09-16T14:20:08.3290296Z         "stderr_lines": [], 
2026-09-16T14:20:08.3291007Z         "stdout": "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT_ISILON\": \"/SIIFX\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_3\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT_ISILON_2\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT_ISILON_4\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT_ISILON_4\": \"/SIIFX_SIGMS\"}]", 
2026-09-16T14:20:08.3291842Z         "stdout_lines": [
2026-09-16T14:20:08.3292554Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT_ISILON\": \"/SIIFX\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_3\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT_ISILON_2\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT_ISILON_4\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT_ISILON_4\": \"/SIIFX_SIGMS\"}]"
2026-09-16T14:20:08.3292963Z         ]
2026-09-16T14:20:08.3293076Z     }
2026-09-16T14:20:08.3293179Z }
2026-09-16T14:20:08.3347806Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:20:08.3348007Z     "nfs_vars_json": {
2026-09-16T14:20:08.3348133Z         "changed": false, 
2026-09-16T14:20:08.3348372Z         "cmd": "cat /opt/ads-agent/_work/r13215/a/nfs_config.json", 
2026-09-16T14:20:08.3348548Z         "delta": "0:00:00.006470", 
2026-09-16T14:20:08.3348729Z         "end": "2026-09-16 11:20:08.240430", 
2026-09-16T14:20:08.3348949Z         "failed": false, 
2026-09-16T14:20:08.3349104Z         "rc": 0, 
2026-09-16T14:20:08.3349344Z         "start": "2026-09-16 11:20:08.233960", 
2026-09-16T14:20:08.3349541Z         "stderr": "", 
2026-09-16T14:20:08.3349670Z         "stderr_lines": [], 
2026-09-16T14:20:08.3350586Z         "stdout": "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT_ISILON\": \"/SIIFX\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_3\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT_ISILON_2\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT_ISILON_4\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT_ISILON_4\": \"/SIIFX_SIGMS\"}]", 
2026-09-16T14:20:08.3350957Z         "stdout_lines": [
2026-09-16T14:20:08.3351662Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT_ISILON\": \"/SIIFX\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_3\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT_ISILON_2\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT_ISILON_4\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT_ISILON_4\": \"/SIIFX_SIGMS\"}]"
2026-09-16T14:20:08.3352017Z         ]
2026-09-16T14:20:08.3352120Z     }
2026-09-16T14:20:08.3352216Z }
2026-09-16T14:20:08.3394512Z Wednesday 16 September 2026  11:20:08 -0300 (0:00:00.071)       0:00:01.816 *** 
2026-09-16T14:20:08.4024044Z 
2026-09-16T14:20:08.4025057Z TASK [nfs : Criar variáveis] ***************************************************
2026-09-16T14:20:08.4045441Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T14:20:08.4100592Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:20:08.4146130Z Wednesday 16 September 2026  11:20:08 -0300 (0:00:00.075)       0:00:01.891 *** 
2026-09-16T14:20:21.9286174Z 
2026-09-16T14:20:21.9287510Z TASK [nfs : execute montagem script] *******************************************
2026-09-16T14:20:21.9287773Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:20:22.5858093Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T14:20:22.5884646Z Wednesday 16 September 2026  11:20:22 -0300 (0:00:14.173)       0:00:16.065 *** 
2026-09-16T14:20:22.6522166Z 
2026-09-16T14:20:22.6523156Z TASK [nfs : ansible.builtin.debug] *********************************************
2026-09-16T14:20:22.6531709Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br] => {
2026-09-16T14:20:22.6531955Z     "changed": false, 
2026-09-16T14:20:22.6532153Z     "msg": {
2026-09-16T14:20:22.6534128Z         "changed": true, 
2026-09-16T14:20:22.6534501Z         "cmd": [
2026-09-16T14:20:22.6536626Z             "python", 
2026-09-16T14:20:22.6537328Z             "/opt/ads-agent/_work/r13215/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py", 
2026-09-16T14:20:22.6537530Z             "montagem", 
2026-09-16T14:20:22.6537695Z             "siifx-batch-vm", 
2026-09-16T14:20:22.6537903Z             "des", 
2026-09-16T14:20:22.6538053Z             "ctc_nprd", 
2026-09-16T14:20:22.6538836Z             "/opt/ads-agent/_work/r13215/a/esteira-jboss-vm-v2", 
2026-09-16T14:20:22.6539168Z             "C&t@d02", 
2026-09-16T14:20:22.6539501Z             "***", 
2026-09-16T14:20:22.6539870Z             "s736651@corp.caixa.gov.br", 
2026-09-16T14:20:22.6540494Z             "***", 
2026-09-16T14:20:22.6541273Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT_ISILON\": \"/SIIFX\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_3\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT_ISILON_2\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT_ISILON_4\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT_ISILON_4\": \"/SIIFX_SIGMS\"}]"
2026-09-16T14:20:22.6541906Z         ], 
2026-09-16T14:20:22.6542035Z         "delta": "0:00:13.792303", 
2026-09-16T14:20:22.6542240Z         "end": "2026-09-16 11:20:22.562210", 
2026-09-16T14:20:22.6542397Z         "failed": false, 
2026-09-16T14:20:22.6542522Z         "rc": 0, 
2026-09-16T14:20:22.6542708Z         "start": "2026-09-16 11:20:08.769907", 
2026-09-16T14:20:22.6542846Z         "stderr": "", 
2026-09-16T14:20:22.6542964Z         "stderr_lines": [], 
2026-09-16T14:20:22.6547619Z         "stdout": "[{u'NFS_MOUNT_POINT_ISILON': u'/SIIFX', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH'}, {u'NFS_MOUNT_POINT_ISILON_3': u'/SIIFX_SIISF', u'NFS_ENDPOINT_ISILON_3': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF'}, {u'NFS_MOUNT_POINT_ISILON_2': u'/SIIFX_B2B', u'NFS_ENDPOINT_ISILON_2': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX'}, {u'NFS_ENDPOINT_ISILON_4': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA', u'NFS_MOUNT_POINT_ISILON_4': u'/SIIFX_SIGMS'}]\nNome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           \n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH /SIIFX                              ISILON                              nfsctcnprd.ctc.caixa                des                                \nException when callin ProtocolsApi->get_nfs_expor: (500)\nReason: Internal Server Error\nHTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 14:20:10 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})\nHTTP response body: \n{\n\"errors\" : \n[\n\n{\n\"code\" : \"AEC_EXCEPTION\",\n\"message\" : \"bad hostname 192.168.213.137,10.188.254.113\"\n}\n]\n}\n\n\n\nnfs_path=/SIIFX\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH /SIIFX                              ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX /SIIFX_B2B                          ISILON                              nfsctcnprd.ctc.caixa                des                                \nException when callin ProtocolsApi->get_nfs_expor: (500)\nReason: Internal Server Error\nHTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 14:20:13 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})\nHTTP response body: \n{\n\"errors\" : \n[\n\n{\n\"code\" : \"AEC_EXCEPTION\",\n\"message\" : \"bad hostname 192.168.213.137,10.188.254.113\"\n}\n]\n}\n\n\n\nnfs_path=/SIIFX_B2B\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX /SIIFX_B2B                          ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /SIIFX_SIISF                        ISILON                              nfsctcnprd.ctc.caixa                des                                \nException when callin ProtocolsApi->get_nfs_expor: (500)\nReason: Internal Server Error\nHTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 14:20:17 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})\nHTTP response body: \n{\n\"errors\" : \n[\n\n{\n\"code\" : \"AEC_EXCEPTION\",\n\"message\" : \"bad hostname 192.168.213.137,10.188.254.113\"\n}\n]\n}\n\n\n\nnfs_path=/SIIFX_SIISF\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /SIIFX_SIISF                        ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA /SIIFX_SIGMS                        ISILON                              nfsctcnprd.ctc.caixa                des                                \nException when callin ProtocolsApi->get_nfs_expor: (500)\nReason: Internal Server Error\nHTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 14:20:21 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})\nHTTP response body: \n{\n\"errors\" : \n[\n\n{\n\"code\" : \"AEC_EXCEPTION\",\n\"message\" : \"bad hostname 192.168.213.137,10.188.254.113\"\n}\n]\n}\n\n\n\nnfs_path=/SIIFX_SIGMS\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA /SIIFX_SIGMS                        ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T14:20:22.6550051Z         "stdout_lines": [
2026-09-16T14:20:22.6550767Z             "[{u'NFS_MOUNT_POINT_ISILON': u'/SIIFX', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH'}, {u'NFS_MOUNT_POINT_ISILON_3': u'/SIIFX_SIISF', u'NFS_ENDPOINT_ISILON_3': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF'}, {u'NFS_MOUNT_POINT_ISILON_2': u'/SIIFX_B2B', u'NFS_ENDPOINT_ISILON_2': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX'}, {u'NFS_ENDPOINT_ISILON_4': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA', u'NFS_MOUNT_POINT_ISILON_4': u'/SIIFX_SIGMS'}]", 
2026-09-16T14:20:22.6551366Z             "Nome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           ", 
2026-09-16T14:20:22.6551813Z             "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------", 
2026-09-16T14:20:22.6552225Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH /SIIFX                              ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T14:20:22.6552481Z             "Exception when callin ProtocolsApi->get_nfs_expor: (500)", 
2026-09-16T14:20:22.6552637Z             "Reason: Internal Server Error", 
2026-09-16T14:20:22.6553071Z             "HTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 14:20:10 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})", 
2026-09-16T14:20:22.6553373Z             "HTTP response body: ", 
2026-09-16T14:20:22.6553538Z             "{", 
2026-09-16T14:20:22.6553673Z             "\"errors\" : ", 
2026-09-16T14:20:22.6553783Z             "[", 
2026-09-16T14:20:22.6553930Z             "", 
2026-09-16T14:20:22.6554049Z             "{", 
2026-09-16T14:20:22.6554168Z             "\"code\" : \"AEC_EXCEPTION\",", 
2026-09-16T14:20:22.6554298Z             "\"message\" : \"bad hostname 192.168.213.137,10.188.254.113\"", 
2026-09-16T14:20:22.6554561Z             "}", 
2026-09-16T14:20:22.6554667Z             "]", 
2026-09-16T14:20:22.6554769Z             "}", 
2026-09-16T14:20:22.6554874Z             "", 
2026-09-16T14:20:22.6554961Z             "", 
2026-09-16T14:20:22.6555065Z             "", 
2026-09-16T14:20:22.6555179Z             "nfs_path=/SIIFX", 
2026-09-16T14:20:22.6555413Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH", 
2026-09-16T14:20:22.6555783Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH /SIIFX                              ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T14:20:22.6556012Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX /SIIFX_B2B                          ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T14:20:22.6556266Z             "Exception when callin ProtocolsApi->get_nfs_expor: (500)", 
2026-09-16T14:20:22.6556413Z             "Reason: Internal Server Error", 
2026-09-16T14:20:22.6556928Z             "HTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 14:20:13 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})", 
2026-09-16T14:20:22.6557164Z             "HTTP response body: ", 
2026-09-16T14:20:22.6557275Z             "{", 
2026-09-16T14:20:22.6557383Z             "\"errors\" : ", 
2026-09-16T14:20:22.6557538Z             "[", 
2026-09-16T14:20:22.6557693Z             "", 
2026-09-16T14:20:22.6557791Z             "{", 
2026-09-16T14:20:22.6557950Z             "\"code\" : \"AEC_EXCEPTION\",", 
2026-09-16T14:20:22.6558137Z             "\"message\" : \"bad hostname 192.168.213.137,10.188.254.113\"", 
2026-09-16T14:20:22.6558284Z             "}", 
2026-09-16T14:20:22.6558380Z             "]", 
2026-09-16T14:20:22.6558477Z             "}", 
2026-09-16T14:20:22.6558574Z             "", 
2026-09-16T14:20:22.6558759Z             "", 
2026-09-16T14:20:22.6558872Z             "", 
2026-09-16T14:20:22.6558983Z             "nfs_path=/SIIFX_B2B", 
2026-09-16T14:20:22.6559121Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX", 
2026-09-16T14:20:22.6559379Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX /SIIFX_B2B                          ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T14:20:22.6559604Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /SIIFX_SIISF                        ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T14:20:22.6559894Z             "Exception when callin ProtocolsApi->get_nfs_expor: (500)", 
2026-09-16T14:20:22.6560052Z             "Reason: Internal Server Error", 
2026-09-16T14:20:22.6560508Z             "HTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 14:20:17 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})", 
2026-09-16T14:20:22.6560871Z             "HTTP response body: ", 
2026-09-16T14:20:22.6561012Z             "{", 
2026-09-16T14:20:22.6561116Z             "\"errors\" : ", 
2026-09-16T14:20:22.6561216Z             "[", 
2026-09-16T14:20:22.6561487Z             "", 
2026-09-16T14:20:22.6561635Z             "{", 
2026-09-16T14:20:22.6561809Z             "\"code\" : \"AEC_EXCEPTION\",", 
2026-09-16T14:20:22.6561963Z             "\"message\" : \"bad hostname 192.168.213.137,10.188.254.113\"", 
2026-09-16T14:20:22.6562087Z             "}", 
2026-09-16T14:20:22.6562184Z             "]", 
2026-09-16T14:20:22.6562279Z             "}", 
2026-09-16T14:20:22.6562436Z             "", 
2026-09-16T14:20:22.6562590Z             "", 
2026-09-16T14:20:22.6562696Z             "", 
2026-09-16T14:20:22.6562810Z             "nfs_path=/SIIFX_SIISF", 
2026-09-16T14:20:22.6562960Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF", 
2026-09-16T14:20:22.6563162Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /SIIFX_SIISF                        ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T14:20:22.6563433Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA /SIIFX_SIGMS                        ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T14:20:22.6563745Z             "Exception when callin ProtocolsApi->get_nfs_expor: (500)", 
2026-09-16T14:20:22.6563893Z             "Reason: Internal Server Error", 
2026-09-16T14:20:22.6564310Z             "HTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 14:20:21 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})", 
2026-09-16T14:20:22.6564543Z             "HTTP response body: ", 
2026-09-16T14:20:22.6564697Z             "{", 
2026-09-16T14:20:22.6564809Z             "\"errors\" : ", 
2026-09-16T14:20:22.6564911Z             "[", 
2026-09-16T14:20:22.6565004Z             "", 
2026-09-16T14:20:22.6565098Z             "{", 
2026-09-16T14:20:22.6565207Z             "\"code\" : \"AEC_EXCEPTION\",", 
2026-09-16T14:20:22.6565330Z             "\"message\" : \"bad hostname 192.168.213.137,10.188.254.113\"", 
2026-09-16T14:20:22.6565456Z             "}", 
2026-09-16T14:20:22.6565613Z             "]", 
2026-09-16T14:20:22.6565709Z             "}", 
2026-09-16T14:20:22.6565805Z             "", 
2026-09-16T14:20:22.6565955Z             "", 
2026-09-16T14:20:22.6566052Z             "", 
2026-09-16T14:20:22.6566162Z             "nfs_path=/SIIFX_SIGMS", 
2026-09-16T14:20:22.6566307Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA", 
2026-09-16T14:20:22.6566581Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA /SIIFX_SIGMS                        ISILON                              nfsctcnprd.ctc.caixa                des                                "
2026-09-16T14:20:22.6566794Z         ]
2026-09-16T14:20:22.6566891Z     }
2026-09-16T14:20:22.6566983Z }
2026-09-16T14:20:22.6611536Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:20:22.6611671Z     "changed": false, 
2026-09-16T14:20:22.6611962Z     "msg": {
2026-09-16T14:20:22.6612084Z         "changed": true, 
2026-09-16T14:20:22.6612195Z         "cmd": [
2026-09-16T14:20:22.6612303Z             "python", 
2026-09-16T14:20:22.6612530Z             "/opt/ads-agent/_work/r13215/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py", 
2026-09-16T14:20:22.6612672Z             "montagem", 
2026-09-16T14:20:22.6612831Z             "siifx-batch-vm", 
2026-09-16T14:20:22.6612942Z             "des", 
2026-09-16T14:20:22.6613051Z             "ctc_nprd", 
2026-09-16T14:20:22.6613237Z             "/opt/ads-agent/_work/r13215/a/esteira-jboss-vm-v2", 
2026-09-16T14:20:22.6613416Z             "C&t@d02", 
2026-09-16T14:20:22.6613604Z             "***", 
2026-09-16T14:20:22.6613772Z             "s736651@corp.caixa.gov.br", 
2026-09-16T14:20:22.6613957Z             "***", 
2026-09-16T14:20:22.6614727Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT_ISILON\": \"/SIIFX\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_3\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT_ISILON_2\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT_ISILON_4\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT_ISILON_4\": \"/SIIFX_SIGMS\"}]"
2026-09-16T14:20:22.6615171Z         ], 
2026-09-16T14:20:22.6615294Z         "delta": "0:00:13.131876", 
2026-09-16T14:20:22.6615481Z         "end": "2026-09-16 11:20:21.905513", 
2026-09-16T14:20:22.6615596Z         "failed": false, 
2026-09-16T14:20:22.6615704Z         "rc": 0, 
2026-09-16T14:20:22.6615875Z         "start": "2026-09-16 11:20:08.773637", 
2026-09-16T14:20:22.6616009Z         "stderr": "", 
2026-09-16T14:20:22.6616122Z         "stderr_lines": [], 
2026-09-16T14:20:22.6621331Z         "stdout": "[{u'NFS_MOUNT_POINT_ISILON': u'/SIIFX', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH'}, {u'NFS_MOUNT_POINT_ISILON_3': u'/SIIFX_SIISF', u'NFS_ENDPOINT_ISILON_3': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF'}, {u'NFS_MOUNT_POINT_ISILON_2': u'/SIIFX_B2B', u'NFS_ENDPOINT_ISILON_2': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX'}, {u'NFS_ENDPOINT_ISILON_4': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA', u'NFS_MOUNT_POINT_ISILON_4': u'/SIIFX_SIGMS'}]\nNome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           \n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH /SIIFX                              ISILON                              nfsctcnprd.ctc.caixa                des                                \nException when callin ProtocolsApi->get_nfs_expor: (500)\nReason: Internal Server Error\nHTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 14:20:10 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})\nHTTP response body: \n{\n\"errors\" : \n[\n\n{\n\"code\" : \"AEC_EXCEPTION\",\n\"message\" : \"bad hostname 192.168.213.137,10.188.254.113\"\n}\n]\n}\n\n\n\nnfs_path=/SIIFX\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH /SIIFX                              ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX /SIIFX_B2B                          ISILON                              nfsctcnprd.ctc.caixa                des                                \nException when callin ProtocolsApi->get_nfs_expor: (500)\nReason: Internal Server Error\nHTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 14:20:13 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})\nHTTP response body: \n{\n\"errors\" : \n[\n\n{\n\"code\" : \"AEC_EXCEPTION\",\n\"message\" : \"bad hostname 192.168.213.137,10.188.254.113\"\n}\n]\n}\n\n\n\nnfs_path=/SIIFX_B2B\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX /SIIFX_B2B                          ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /SIIFX_SIISF                        ISILON                              nfsctcnprd.ctc.caixa                des                                \nException when callin ProtocolsApi->get_nfs_expor: (500)\nReason: Internal Server Error\nHTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 14:20:16 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})\nHTTP response body: \n{\n\"errors\" : \n[\n\n{\n\"code\" : \"AEC_EXCEPTION\",\n\"message\" : \"bad hostname 192.168.213.137,10.188.254.113\"\n}\n]\n}\n\n\n\nnfs_path=/SIIFX_SIISF\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /SIIFX_SIISF                        ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA /SIIFX_SIGMS                        ISILON                              nfsctcnprd.ctc.caixa                des                                \nException when callin ProtocolsApi->get_nfs_expor: (500)\nReason: Internal Server Error\nHTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 14:20:20 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})\nHTTP response body: \n{\n\"errors\" : \n[\n\n{\n\"code\" : \"AEC_EXCEPTION\",\n\"message\" : \"bad hostname 192.168.213.137,10.188.254.113\"\n}\n]\n}\n\n\n\nnfs_path=/SIIFX_SIGMS\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA /SIIFX_SIGMS                        ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T14:20:22.6623620Z         "stdout_lines": [
2026-09-16T14:20:22.6624309Z             "[{u'NFS_MOUNT_POINT_ISILON': u'/SIIFX', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH'}, {u'NFS_MOUNT_POINT_ISILON_3': u'/SIIFX_SIISF', u'NFS_ENDPOINT_ISILON_3': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF'}, {u'NFS_MOUNT_POINT_ISILON_2': u'/SIIFX_B2B', u'NFS_ENDPOINT_ISILON_2': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX'}, {u'NFS_ENDPOINT_ISILON_4': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA', u'NFS_MOUNT_POINT_ISILON_4': u'/SIIFX_SIGMS'}]", 
2026-09-16T14:20:22.6624792Z             "Nome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           ", 
2026-09-16T14:20:22.6625191Z             "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------", 
2026-09-16T14:20:22.6625645Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH /SIIFX                              ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T14:20:22.6625889Z             "Exception when callin ProtocolsApi->get_nfs_expor: (500)", 
2026-09-16T14:20:22.6626039Z             "Reason: Internal Server Error", 
2026-09-16T14:20:22.6626439Z             "HTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 14:20:10 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})", 
2026-09-16T14:20:22.6626813Z             "HTTP response body: ", 
2026-09-16T14:20:22.6626931Z             "{", 
2026-09-16T14:20:22.6627040Z             "\"errors\" : ", 
2026-09-16T14:20:22.6627143Z             "[", 
2026-09-16T14:20:22.6627248Z             "", 
2026-09-16T14:20:22.6627408Z             "{", 
2026-09-16T14:20:22.6627522Z             "\"code\" : \"AEC_EXCEPTION\",", 
2026-09-16T14:20:22.6627651Z             "\"message\" : \"bad hostname 192.168.213.137,10.188.254.113\"", 
2026-09-16T14:20:22.6627780Z             "}", 
2026-09-16T14:20:22.6627878Z             "]", 
2026-09-16T14:20:22.6628027Z             "}", 
2026-09-16T14:20:22.6628127Z             "", 
2026-09-16T14:20:22.6628216Z             "", 
2026-09-16T14:20:22.6628316Z             "", 
2026-09-16T14:20:22.6628427Z             "nfs_path=/SIIFX", 
2026-09-16T14:20:22.6628648Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH", 
2026-09-16T14:20:22.6629002Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH /SIIFX                              ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T14:20:22.6629224Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX /SIIFX_B2B                          ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T14:20:22.6629475Z             "Exception when callin ProtocolsApi->get_nfs_expor: (500)", 
2026-09-16T14:20:22.6629625Z             "Reason: Internal Server Error", 
2026-09-16T14:20:22.6630041Z             "HTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 14:20:13 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})", 
2026-09-16T14:20:22.6630283Z             "HTTP response body: ", 
2026-09-16T14:20:22.6630394Z             "{", 
2026-09-16T14:20:22.6630544Z             "\"errors\" : ", 
2026-09-16T14:20:22.6630698Z             "[", 
2026-09-16T14:20:22.6630799Z             "", 
2026-09-16T14:20:22.6630893Z             "{", 
2026-09-16T14:20:22.6631005Z             "\"code\" : \"AEC_EXCEPTION\",", 
2026-09-16T14:20:22.6631137Z             "\"message\" : \"bad hostname 192.168.213.137,10.188.254.113\"", 
2026-09-16T14:20:22.6631255Z             "}", 
2026-09-16T14:20:22.6631349Z             "]", 
2026-09-16T14:20:22.6631447Z             "}", 
2026-09-16T14:20:22.6631602Z             "", 
2026-09-16T14:20:22.6631698Z             "", 
2026-09-16T14:20:22.6631793Z             "", 
2026-09-16T14:20:22.6631907Z             "nfs_path=/SIIFX_B2B", 
2026-09-16T14:20:22.6632046Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX", 
2026-09-16T14:20:22.6632241Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX /SIIFX_B2B                          ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T14:20:22.6632471Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /SIIFX_SIISF                        ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T14:20:22.6632719Z             "Exception when callin ProtocolsApi->get_nfs_expor: (500)", 
2026-09-16T14:20:22.6632860Z             "Reason: Internal Server Error", 
2026-09-16T14:20:22.6633286Z             "HTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 14:20:16 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})", 
2026-09-16T14:20:22.6633622Z             "HTTP response body: ", 
2026-09-16T14:20:22.6633794Z             "{", 
2026-09-16T14:20:22.6633955Z             "\"errors\" : ", 
2026-09-16T14:20:22.6634107Z             "[", 
2026-09-16T14:20:22.6634244Z             "", 
2026-09-16T14:20:22.6634346Z             "{", 
2026-09-16T14:20:22.6634454Z             "\"code\" : \"AEC_EXCEPTION\",", 
2026-09-16T14:20:22.6634657Z             "\"message\" : \"bad hostname 192.168.213.137,10.188.254.113\"", 
2026-09-16T14:20:22.6634783Z             "}", 
2026-09-16T14:20:22.6634878Z             "]", 
2026-09-16T14:20:22.6634973Z             "}", 
2026-09-16T14:20:22.6635068Z             "", 
2026-09-16T14:20:22.6635167Z             "", 
2026-09-16T14:20:22.6635265Z             "", 
2026-09-16T14:20:22.6635378Z             "nfs_path=/SIIFX_SIISF", 
2026-09-16T14:20:22.6635523Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF", 
2026-09-16T14:20:22.6635717Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /SIIFX_SIISF                        ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T14:20:22.6636026Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA /SIIFX_SIGMS                        ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T14:20:22.6636287Z             "Exception when callin ProtocolsApi->get_nfs_expor: (500)", 
2026-09-16T14:20:22.6636431Z             "Reason: Internal Server Error", 
2026-09-16T14:20:22.6636921Z             "HTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Wed, 16 Sep 2026 14:20:20 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})", 
2026-09-16T14:20:22.6637155Z             "HTTP response body: ", 
2026-09-16T14:20:22.6637264Z             "{", 
2026-09-16T14:20:22.6637368Z             "\"errors\" : ", 
2026-09-16T14:20:22.6637468Z             "[", 
2026-09-16T14:20:22.6637565Z             "", 
2026-09-16T14:20:22.6637663Z             "{", 
2026-09-16T14:20:22.6637775Z             "\"code\" : \"AEC_EXCEPTION\",", 
2026-09-16T14:20:22.6637899Z             "\"message\" : \"bad hostname 192.168.213.137,10.188.254.113\"", 
2026-09-16T14:20:22.6638025Z             "}", 
2026-09-16T14:20:22.6638123Z             "]", 
2026-09-16T14:20:22.6638221Z             "}", 
2026-09-16T14:20:22.6638336Z             "", 
2026-09-16T14:20:22.6638435Z             "", 
2026-09-16T14:20:22.6638536Z             "", 
2026-09-16T14:20:22.6638744Z             "nfs_path=/SIIFX_SIGMS", 
2026-09-16T14:20:22.6638893Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA", 
2026-09-16T14:20:22.6639090Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA /SIIFX_SIGMS                        ISILON                              nfsctcnprd.ctc.caixa                des                                "
2026-09-16T14:20:22.6639245Z         ]
2026-09-16T14:20:22.6639343Z     }
2026-09-16T14:20:22.6639439Z }
2026-09-16T14:20:22.6648268Z Wednesday 16 September 2026  11:20:22 -0300 (0:00:00.076)       0:00:16.142 *** 
2026-09-16T14:20:23.0275986Z 
2026-09-16T14:20:23.0276372Z TASK [nfs : execute clean json] ************************************************
2026-09-16T14:20:23.0280383Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-09-16T14:20:23.0280763Z caddeapllx2798.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-09-16T14:20:23.0281060Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-09-16T14:20:23.0281227Z releases. A future Ansible release will default to using the discovered 
2026-09-16T14:20:23.0281396Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-09-16T14:20:23.0281566Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-09-16T14:20:23.0281733Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-09-16T14:20:23.0281886Z setting deprecation_warnings=False in ansible.cfg.
2026-09-16T14:20:23.0282110Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:20:23.3659908Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-09-16T14:20:23.3660963Z caddeapllx1214.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-09-16T14:20:23.3661156Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-09-16T14:20:23.3661568Z releases. A future Ansible release will default to using the discovered 
2026-09-16T14:20:23.3661758Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-09-16T14:20:23.3662047Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-09-16T14:20:23.3662346Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-09-16T14:20:23.3662594Z setting deprecation_warnings=False in ansible.cfg.
2026-09-16T14:20:23.3662813Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T14:20:23.3684747Z Wednesday 16 September 2026  11:20:23 -0300 (0:00:00.703)       0:00:16.845 *** 
2026-09-16T14:20:23.4337839Z 
2026-09-16T14:20:23.4338410Z TASK [nfs : result_new_string_json] ********************************************
2026-09-16T14:20:23.4338635Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br] => {
2026-09-16T14:20:23.4338769Z     "msg": {
2026-09-16T14:20:23.4339058Z         "ansible_facts": {
2026-09-16T14:20:23.4339235Z             "discovered_interpreter_python": "/usr/bin/python"
2026-09-16T14:20:23.4339370Z         }, 
2026-09-16T14:20:23.4339482Z         "changed": true, 
2026-09-16T14:20:23.4340592Z         "cmd": "echo '[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT_ISILON\": \"/SIIFX\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_3\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT_ISILON_2\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT_ISILON_4\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT_ISILON_4\": \"/SIIFX_SIGMS\"}]' | sed 's/NFS_ENDPOINT_ISILON[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_ISILON[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_HUAWEI[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_HUAWEI[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_VM[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_VM[^\"]*/NFS_MOUNT_POINT/g'", 
2026-09-16T14:20:23.4341450Z         "delta": "0:00:00.003553", 
2026-09-16T14:20:23.4341570Z         "deprecations": [
2026-09-16T14:20:23.4341729Z             {
2026-09-16T14:20:23.4342278Z                 "msg": "Distribution rhel 9.3 on host caddeapllx1214.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, but is using /usr/bin/python for backward compatibility with prior Ansible releases. A future Ansible release will default to using the discovered platform python for this host. See https://docs.ansible.com/ansible/2.9/reference_appendices/interpreter_discovery.html for more information", 
2026-09-16T14:20:23.4342576Z                 "version": "2.12"
2026-09-16T14:20:23.4342686Z             }
2026-09-16T14:20:23.4342794Z         ], 
2026-09-16T14:20:23.4343036Z         "end": "2026-09-16 11:20:23.348078", 
2026-09-16T14:20:23.4343168Z         "failed": false, 
2026-09-16T14:20:23.4343278Z         "rc": 0, 
2026-09-16T14:20:23.4343450Z         "start": "2026-09-16 11:20:23.344525", 
2026-09-16T14:20:23.4343579Z         "stderr": "", 
2026-09-16T14:20:23.4343746Z         "stderr_lines": [], 
2026-09-16T14:20:23.4344376Z         "stdout": "[{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT\": \"/SIIFX\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT\": \"/SIIFX_SIGMS\"}]", 
2026-09-16T14:20:23.4344749Z         "stdout_lines": [
2026-09-16T14:20:23.4345473Z             "[{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT\": \"/SIIFX\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT\": \"/SIIFX_SIGMS\"}]"
2026-09-16T14:20:23.4345785Z         ]
2026-09-16T14:20:23.4345894Z     }
2026-09-16T14:20:23.4345992Z }
2026-09-16T14:20:23.4374718Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:20:23.4374927Z     "msg": {
2026-09-16T14:20:23.4375113Z         "ansible_facts": {
2026-09-16T14:20:23.4375286Z             "discovered_interpreter_python": "/usr/bin/python"
2026-09-16T14:20:23.4375410Z         }, 
2026-09-16T14:20:23.4375524Z         "changed": true, 
2026-09-16T14:20:23.4376808Z         "cmd": "echo '[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT_ISILON\": \"/SIIFX\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_3\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT_ISILON_2\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT_ISILON_4\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT_ISILON_4\": \"/SIIFX_SIGMS\"}]' | sed 's/NFS_ENDPOINT_ISILON[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_ISILON[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_HUAWEI[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_HUAWEI[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_VM[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_VM[^\"]*/NFS_MOUNT_POINT/g'", 
2026-09-16T14:20:23.4377611Z         "delta": "0:00:00.003291", 
2026-09-16T14:20:23.4377795Z         "deprecations": [
2026-09-16T14:20:23.4377950Z             {
2026-09-16T14:20:23.4378732Z                 "msg": "Distribution rhel 9.3 on host caddeapllx2798.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, but is using /usr/bin/python for backward compatibility with prior Ansible releases. A future Ansible release will default to using the discovered platform python for this host. See https://docs.ansible.com/ansible/2.9/reference_appendices/interpreter_discovery.html for more information", 
2026-09-16T14:20:23.4379207Z                 "version": "2.12"
2026-09-16T14:20:23.4379317Z             }
2026-09-16T14:20:23.4379430Z         ], 
2026-09-16T14:20:23.4379604Z         "end": "2026-09-16 11:20:23.010842", 
2026-09-16T14:20:23.4379771Z         "failed": false, 
2026-09-16T14:20:23.4379967Z         "rc": 0, 
2026-09-16T14:20:23.4380149Z         "start": "2026-09-16 11:20:23.007551", 
2026-09-16T14:20:23.4380275Z         "stderr": "", 
2026-09-16T14:20:23.4380388Z         "stderr_lines": [], 
2026-09-16T14:20:23.4381039Z         "stdout": "[{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT\": \"/SIIFX\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT\": \"/SIIFX_SIGMS\"}]", 
2026-09-16T14:20:23.4381365Z         "stdout_lines": [
2026-09-16T14:20:23.4381989Z             "[{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT\": \"/SIIFX\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT\": \"/SIIFX_SIGMS\"}]"
2026-09-16T14:20:23.4382392Z         ]
2026-09-16T14:20:23.4382492Z     }
2026-09-16T14:20:23.4382587Z }
2026-09-16T14:20:23.4406750Z Wednesday 16 September 2026  11:20:23 -0300 (0:00:00.072)       0:00:16.917 *** 
2026-09-16T14:20:23.5018205Z 
2026-09-16T14:20:23.5018790Z TASK [nfs : Parse JSON data] ***************************************************
2026-09-16T14:20:23.5018969Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T14:20:23.5068198Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:20:23.5103282Z Wednesday 16 September 2026  11:20:23 -0300 (0:00:00.069)       0:00:16.987 *** 
2026-09-16T14:20:23.5708105Z 
2026-09-16T14:20:23.5708993Z TASK [nfs : result_new_json] ***************************************************
2026-09-16T14:20:23.5709249Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br] => {
2026-09-16T14:20:23.5709403Z     "msg": [
2026-09-16T14:20:23.5709510Z         {
2026-09-16T14:20:23.5709868Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH", 
2026-09-16T14:20:23.5710034Z             "NFS_MOUNT_POINT": "/SIIFX"
2026-09-16T14:20:23.5710153Z         }, 
2026-09-16T14:20:23.5710263Z         {
2026-09-16T14:20:23.5710470Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF", 
2026-09-16T14:20:23.5710629Z             "NFS_MOUNT_POINT": "/SIIFX_SIISF"
2026-09-16T14:20:23.5710743Z         }, 
2026-09-16T14:20:23.5710873Z         {
2026-09-16T14:20:23.5711053Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX", 
2026-09-16T14:20:23.5711205Z             "NFS_MOUNT_POINT": "/SIIFX_B2B"
2026-09-16T14:20:23.5711313Z         }, 
2026-09-16T14:20:23.5711404Z         {
2026-09-16T14:20:23.5711543Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA", 
2026-09-16T14:20:23.5711702Z             "NFS_MOUNT_POINT": "/SIIFX_SIGMS"
2026-09-16T14:20:23.5711811Z         }
2026-09-16T14:20:23.5711905Z     ]
2026-09-16T14:20:23.5712002Z }
2026-09-16T14:20:23.5834063Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:20:23.5834368Z     "msg": [
2026-09-16T14:20:23.5834831Z         {
2026-09-16T14:20:23.5835219Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH", 
2026-09-16T14:20:23.5835378Z             "NFS_MOUNT_POINT": "/SIIFX"
2026-09-16T14:20:23.5835494Z         }, 
2026-09-16T14:20:23.5835592Z         {
2026-09-16T14:20:23.5835734Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF", 
2026-09-16T14:20:23.5835894Z             "NFS_MOUNT_POINT": "/SIIFX_SIISF"
2026-09-16T14:20:23.5836008Z         }, 
2026-09-16T14:20:23.5836233Z         {
2026-09-16T14:20:23.5836382Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX", 
2026-09-16T14:20:23.5836686Z             "NFS_MOUNT_POINT": "/SIIFX_B2B"
2026-09-16T14:20:23.5836799Z         }, 
2026-09-16T14:20:23.5836892Z         {
2026-09-16T14:20:23.5837033Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA", 
2026-09-16T14:20:23.5837192Z             "NFS_MOUNT_POINT": "/SIIFX_SIGMS"
2026-09-16T14:20:23.5837303Z         }
2026-09-16T14:20:23.5837399Z     ]
2026-09-16T14:20:23.5837496Z }
2026-09-16T14:20:23.5879379Z Wednesday 16 September 2026  11:20:23 -0300 (0:00:00.077)       0:00:17.065 *** 
2026-09-16T14:20:23.6790809Z included: /opt/ads-agent/_work/r13215/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx1214.agil.nprd.caixa.gov.br, caddeapllx2798.agil.nprd.caixa.gov.br
2026-09-16T14:20:23.6866947Z included: /opt/ads-agent/_work/r13215/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx1214.agil.nprd.caixa.gov.br, caddeapllx2798.agil.nprd.caixa.gov.br
2026-09-16T14:20:23.6942227Z included: /opt/ads-agent/_work/r13215/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx1214.agil.nprd.caixa.gov.br, caddeapllx2798.agil.nprd.caixa.gov.br
2026-09-16T14:20:23.7020087Z included: /opt/ads-agent/_work/r13215/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx1214.agil.nprd.caixa.gov.br, caddeapllx2798.agil.nprd.caixa.gov.br
2026-09-16T14:20:23.7112358Z Wednesday 16 September 2026  11:20:23 -0300 (0:00:00.123)       0:00:17.188 *** 
2026-09-16T14:20:23.7698752Z 
2026-09-16T14:20:23.7699835Z TASK [nfs : Parse JSON data] ***************************************************
2026-09-16T14:20:23.7702330Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T14:20:23.7757897Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:20:23.7793487Z Wednesday 16 September 2026  11:20:23 -0300 (0:00:00.068)       0:00:17.256 *** 
2026-09-16T14:20:23.8383885Z 
2026-09-16T14:20:23.8384936Z TASK [nfs : debug] *************************************************************
2026-09-16T14:20:23.8386161Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br] => {
2026-09-16T14:20:23.8386617Z     "msg": {
2026-09-16T14:20:23.8387101Z         "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH", 
2026-09-16T14:20:23.8387296Z         "NFS_MOUNT_POINT": "/SIIFX"
2026-09-16T14:20:23.8387493Z     }
2026-09-16T14:20:23.8387643Z }
2026-09-16T14:20:23.8428650Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:20:23.8428917Z     "msg": {
2026-09-16T14:20:23.8429416Z         "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH", 
2026-09-16T14:20:23.8429658Z         "NFS_MOUNT_POINT": "/SIIFX"
2026-09-16T14:20:23.8429818Z     }
2026-09-16T14:20:23.8429955Z }
2026-09-16T14:20:23.8463413Z Wednesday 16 September 2026  11:20:23 -0300 (0:00:00.066)       0:00:17.323 *** 
2026-09-16T14:20:23.9037778Z 
2026-09-16T14:20:23.9038326Z TASK [nfs : debug] *************************************************************
2026-09-16T14:20:23.9038500Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br] => {
2026-09-16T14:20:23.9038664Z     "msg": "/SIIFX"
2026-09-16T14:20:23.9038773Z }
2026-09-16T14:20:23.9086619Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:20:23.9086810Z     "msg": "/SIIFX"
2026-09-16T14:20:23.9086917Z }
2026-09-16T14:20:23.9120668Z Wednesday 16 September 2026  11:20:23 -0300 (0:00:00.065)       0:00:17.389 *** 
2026-09-16T14:20:23.9691968Z 
2026-09-16T14:20:23.9693092Z TASK [nfs : debug] *************************************************************
2026-09-16T14:20:23.9693345Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br] => {
2026-09-16T14:20:23.9693817Z     "msg": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH"
2026-09-16T14:20:23.9694008Z }
2026-09-16T14:20:23.9754807Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:20:23.9755505Z     "msg": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH"
2026-09-16T14:20:23.9755970Z }
2026-09-16T14:20:23.9792060Z Wednesday 16 September 2026  11:20:23 -0300 (0:00:00.067)       0:00:17.456 *** 
2026-09-16T14:20:24.0395045Z 
2026-09-16T14:20:24.0396090Z TASK [nfs : Verificando as variaveis] ******************************************
2026-09-16T14:20:24.0396423Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br] => {
2026-09-16T14:20:24.0396784Z     "changed": false, 
2026-09-16T14:20:24.0397018Z     "msg": "All assertions passed"
2026-09-16T14:20:24.0397181Z }
2026-09-16T14:20:24.0467604Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:20:24.0467816Z     "changed": false, 
2026-09-16T14:20:24.0467945Z     "msg": "All assertions passed"
2026-09-16T14:20:24.0468144Z }
2026-09-16T14:20:24.0494588Z Wednesday 16 September 2026  11:20:24 -0300 (0:00:00.070)       0:00:17.526 *** 
2026-09-16T14:20:27.4920036Z 
2026-09-16T14:20:27.4920721Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-09-16T14:20:27.4920894Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T14:20:28.1520301Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:20:28.1565197Z Wednesday 16 September 2026  11:20:28 -0300 (0:00:04.107)       0:00:21.633 *** 
2026-09-16T14:20:28.8824370Z 
2026-09-16T14:20:28.8825293Z TASK [nfs : Install networker lgtoclnt_url] ************************************
2026-09-16T14:20:28.8825688Z [WARNING]: Consider using the yum, dnf or zypper module rather than running
2026-09-16T14:20:28.8826168Z 'rpm'.  If you need to use command because yum, dnf or zypper is insufficient
2026-09-16T14:20:28.8826412Z you can add 'warn: false' to this command task or set 'command_warnings=False'
2026-09-16T14:20:28.8827301Z in ansible.cfg to get rid of this message.
2026-09-16T14:20:28.8832379Z fatal: [caddeapllx1214.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.481603", "end": "2026-09-16 11:20:28.866634", "msg": "non-zero return code", "rc": 1, "start": "2026-09-16 11:20:28.385031", "stderr": "aviso: /var/tmp/rpm-tmp.lckLRY: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.lckLRY: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-09-16T14:20:28.8833370Z ...ignoring
2026-09-16T14:20:28.8895874Z fatal: [caddeapllx2798.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.485513", "end": "2026-09-16 11:20:28.874433", "msg": "non-zero return code", "rc": 1, "start": "2026-09-16 11:20:28.388920", "stderr": "aviso: /var/tmp/rpm-tmp.tk0WGi: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.tk0WGi: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-09-16T14:20:28.8897244Z ...ignoring
2026-09-16T14:20:28.8935669Z Wednesday 16 September 2026  11:20:28 -0300 (0:00:00.737)       0:00:22.370 *** 
2026-09-16T14:20:29.5761878Z 
2026-09-16T14:20:29.5763062Z TASK [nfs : Install networker lgtonmda_url] ************************************
2026-09-16T14:20:29.5771892Z fatal: [caddeapllx2798.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.426286", "end": "2026-09-16 11:20:29.558827", "msg": "non-zero return code", "rc": 1, "start": "2026-09-16 11:20:29.132541", "stderr": "aviso: /var/tmp/rpm-tmp.hBeCxz: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.hBeCxz: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-09-16T14:20:29.5773801Z ...ignoring
2026-09-16T14:20:29.5873626Z fatal: [caddeapllx1214.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.440438", "end": "2026-09-16 11:20:29.572115", "msg": "non-zero return code", "rc": 1, "start": "2026-09-16 11:20:29.131677", "stderr": "aviso: /var/tmp/rpm-tmp.RaxitF: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.RaxitF: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-09-16T14:20:29.5874242Z ...ignoring
2026-09-16T14:20:29.5911579Z Wednesday 16 September 2026  11:20:29 -0300 (0:00:00.697)       0:00:23.068 *** 
2026-09-16T14:20:30.0105557Z 
2026-09-16T14:20:30.0135823Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-09-16T14:20:30.0136078Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:20:30.0136232Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T14:20:30.0163595Z Wednesday 16 September 2026  11:20:30 -0300 (0:00:00.424)       0:00:23.493 *** 
2026-09-16T14:20:30.2606302Z 
2026-09-16T14:20:30.2607184Z TASK [nfs : Create a symbolic link] ********************************************
2026-09-16T14:20:30.2609714Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T14:20:30.2629098Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:20:30.2670503Z Wednesday 16 September 2026  11:20:30 -0300 (0:00:00.250)       0:00:23.744 *** 
2026-09-16T14:20:31.1777939Z 
2026-09-16T14:20:31.1778510Z TASK [nfs : Networker | Start networker] ***************************************
2026-09-16T14:20:31.1778687Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:20:31.1809233Z ok: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T14:20:31.1861732Z Wednesday 16 September 2026  11:20:31 -0300 (0:00:00.918)       0:00:24.663 *** 
2026-09-16T14:20:31.4454373Z 
2026-09-16T14:20:31.4454987Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-09-16T14:20:31.4455163Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T14:20:31.4459028Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:20:31.4500677Z Wednesday 16 September 2026  11:20:31 -0300 (0:00:00.264)       0:00:24.927 *** 
2026-09-16T14:20:41.8579427Z 
2026-09-16T14:20:41.8580552Z TASK [nfs : Networker | Restart networker] *************************************
2026-09-16T14:20:41.8580765Z changed: [caddeapllx1214.agil.nprd.caixa.gov.br]
2026-09-16T14:20:41.8757615Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:20:41.8789882Z Wednesday 16 September 2026  11:20:41 -0300 (0:00:10.428)       0:00:35.356 *** 
2026-09-16T14:20:42.3667397Z 
2026-09-16T14:20:42.3668847Z TASK [nfs : Montando volume remoto] ********************************************
2026-09-16T14:20:42.3669362Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:23:44.5829331Z fatal: [caddeapllx1214.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "msg": "Error mounting /SIIFX: mount.nfs: Connection timed out\n"}
2026-09-16T14:23:44.5829639Z ...ignoring
2026-09-16T14:23:44.5869632Z Wednesday 16 September 2026  11:23:44 -0300 (0:03:02.707)       0:03:38.063 *** 
2026-09-16T14:23:44.6528452Z 
2026-09-16T14:23:44.6529172Z TASK [nfs : Validando Montagem] ************************************************
2026-09-16T14:23:44.6529365Z fatal: [caddeapllx1214.agil.nprd.caixa.gov.br]: FAILED! => {
2026-09-16T14:23:44.6529775Z     "assertion": "'Connection refused' in mountnfs.msg", 
2026-09-16T14:23:44.6531939Z     "changed": false, 
2026-09-16T14:23:44.6532121Z     "evaluated_to": false, 
2026-09-16T14:23:44.6532362Z     "msg": "Erro desconhecido: Error mounting /SIIFX: mount.nfs: Connection timed out\n"
2026-09-16T14:23:44.6532571Z }
2026-09-16T14:23:44.6566565Z Wednesday 16 September 2026  11:23:44 -0300 (0:00:00.069)       0:03:38.133 *** 
2026-09-16T14:23:44.7163224Z 
2026-09-16T14:23:44.7164322Z TASK [nfs : Parse JSON data] ***************************************************
2026-09-16T14:23:44.7164590Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:23:44.7196785Z Wednesday 16 September 2026  11:23:44 -0300 (0:00:00.063)       0:03:38.196 *** 
2026-09-16T14:23:44.7791253Z 
2026-09-16T14:23:44.7792536Z TASK [nfs : debug] *************************************************************
2026-09-16T14:23:44.7792788Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:23:44.7793151Z     "msg": {
2026-09-16T14:23:44.7793295Z         "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF", 
2026-09-16T14:23:44.7794284Z         "NFS_MOUNT_POINT": "/SIIFX_SIISF"
2026-09-16T14:23:44.7794419Z     }
2026-09-16T14:23:44.7794614Z }
2026-09-16T14:23:44.7826899Z Wednesday 16 September 2026  11:23:44 -0300 (0:00:00.062)       0:03:38.259 *** 
2026-09-16T14:23:44.8403612Z 
2026-09-16T14:23:44.8404692Z TASK [nfs : debug] *************************************************************
2026-09-16T14:23:44.8404942Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:23:44.8405085Z     "msg": "/SIIFX_SIISF"
2026-09-16T14:23:44.8405201Z }
2026-09-16T14:23:44.8439344Z Wednesday 16 September 2026  11:23:44 -0300 (0:00:00.061)       0:03:38.321 *** 
2026-09-16T14:23:44.9023171Z 
2026-09-16T14:23:44.9023888Z TASK [nfs : debug] *************************************************************
2026-09-16T14:23:44.9024069Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:23:44.9025099Z     "msg": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF"
2026-09-16T14:23:44.9025377Z }
2026-09-16T14:23:44.9059791Z Wednesday 16 September 2026  11:23:44 -0300 (0:00:00.061)       0:03:38.383 *** 
2026-09-16T14:23:44.9683449Z 
2026-09-16T14:23:44.9684500Z TASK [nfs : Verificando as variaveis] ******************************************
2026-09-16T14:23:44.9684691Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:23:44.9684938Z     "changed": false, 
2026-09-16T14:23:44.9685069Z     "msg": "All assertions passed"
2026-09-16T14:23:44.9685179Z }
2026-09-16T14:23:44.9719663Z Wednesday 16 September 2026  11:23:44 -0300 (0:00:00.065)       0:03:38.449 *** 
2026-09-16T14:23:47.6952525Z 
2026-09-16T14:23:47.6953457Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-09-16T14:23:47.6953723Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:23:47.6990525Z Wednesday 16 September 2026  11:23:47 -0300 (0:00:02.727)       0:03:41.176 *** 
2026-09-16T14:23:48.4087875Z 
2026-09-16T14:23:48.4088610Z TASK [nfs : Install networker lgtoclnt_url] ************************************
2026-09-16T14:23:48.4093669Z fatal: [caddeapllx2798.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.466679", "end": "2026-09-16 11:23:48.392630", "msg": "non-zero return code", "rc": 1, "start": "2026-09-16 11:23:47.925951", "stderr": "aviso: /var/tmp/rpm-tmp.h5QBqP: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.h5QBqP: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-09-16T14:23:48.4094838Z ...ignoring
2026-09-16T14:23:48.4132102Z Wednesday 16 September 2026  11:23:48 -0300 (0:00:00.714)       0:03:41.890 *** 
2026-09-16T14:23:49.0856143Z 
2026-09-16T14:23:49.0857228Z TASK [nfs : Install networker lgtonmda_url] ************************************
2026-09-16T14:23:49.0861355Z fatal: [caddeapllx2798.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.428415", "end": "2026-09-16 11:23:49.069323", "msg": "non-zero return code", "rc": 1, "start": "2026-09-16 11:23:48.640908", "stderr": "aviso: /var/tmp/rpm-tmp.1SIcXM: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.1SIcXM: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-09-16T14:23:49.0862491Z ...ignoring
2026-09-16T14:23:49.0901159Z Wednesday 16 September 2026  11:23:49 -0300 (0:00:00.676)       0:03:42.567 *** 
2026-09-16T14:23:49.3489898Z 
2026-09-16T14:23:49.3490860Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-09-16T14:23:49.3491052Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:23:49.3531626Z Wednesday 16 September 2026  11:23:49 -0300 (0:00:00.263)       0:03:42.830 *** 
2026-09-16T14:23:49.5971554Z 
2026-09-16T14:23:49.5972368Z TASK [nfs : Create a symbolic link] ********************************************
2026-09-16T14:23:49.5972559Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:23:49.6010986Z Wednesday 16 September 2026  11:23:49 -0300 (0:00:00.247)       0:03:43.078 *** 
2026-09-16T14:23:50.2206617Z 
2026-09-16T14:23:50.2207621Z TASK [nfs : Networker | Start networker] ***************************************
2026-09-16T14:23:50.2207884Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:23:50.2257092Z Wednesday 16 September 2026  11:23:50 -0300 (0:00:00.624)       0:03:43.702 *** 
2026-09-16T14:23:50.4814812Z 
2026-09-16T14:23:50.4816648Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-09-16T14:23:50.4817471Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:23:50.4858798Z Wednesday 16 September 2026  11:23:50 -0300 (0:00:00.259)       0:03:43.962 *** 
2026-09-16T14:24:00.8834295Z 
2026-09-16T14:24:00.8835388Z TASK [nfs : Networker | Restart networker] *************************************
2026-09-16T14:24:00.8836406Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:24:00.8871550Z Wednesday 16 September 2026  11:24:00 -0300 (0:00:10.401)       0:03:54.364 *** 
2026-09-16T14:24:01.1548203Z 
2026-09-16T14:24:01.1549345Z TASK [nfs : Montando volume remoto] ********************************************
2026-09-16T14:24:01.1549576Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:24:01.1587563Z Wednesday 16 September 2026  11:24:01 -0300 (0:00:00.271)       0:03:54.635 *** 
2026-09-16T14:24:01.2072703Z Wednesday 16 September 2026  11:24:01 -0300 (0:00:00.048)       0:03:54.683 *** 
2026-09-16T14:24:01.2657859Z 
2026-09-16T14:24:01.2658811Z TASK [nfs : Parse JSON data] ***************************************************
2026-09-16T14:24:01.2659042Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:24:01.2695861Z Wednesday 16 September 2026  11:24:01 -0300 (0:00:00.062)       0:03:54.746 *** 
2026-09-16T14:24:01.3301123Z 
2026-09-16T14:24:01.3301996Z TASK [nfs : debug] *************************************************************
2026-09-16T14:24:01.3302220Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:24:01.3302386Z     "msg": {
2026-09-16T14:24:01.3302554Z         "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX", 
2026-09-16T14:24:01.3303981Z         "NFS_MOUNT_POINT": "/SIIFX_B2B"
2026-09-16T14:24:01.3304219Z     }
2026-09-16T14:24:01.3304333Z }
2026-09-16T14:24:01.3334745Z Wednesday 16 September 2026  11:24:01 -0300 (0:00:00.063)       0:03:54.810 *** 
2026-09-16T14:24:01.3916230Z 
2026-09-16T14:24:01.3917098Z TASK [nfs : debug] *************************************************************
2026-09-16T14:24:01.3918291Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:24:01.3918465Z     "msg": "/SIIFX_B2B"
2026-09-16T14:24:01.3918584Z }
2026-09-16T14:24:01.3953808Z Wednesday 16 September 2026  11:24:01 -0300 (0:00:00.061)       0:03:54.872 *** 
2026-09-16T14:24:01.4558507Z 
2026-09-16T14:24:01.4559212Z TASK [nfs : debug] *************************************************************
2026-09-16T14:24:01.4559436Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:24:01.4559666Z     "msg": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX"
2026-09-16T14:24:01.4559814Z }
2026-09-16T14:24:01.4594277Z Wednesday 16 September 2026  11:24:01 -0300 (0:00:00.063)       0:03:54.936 *** 
2026-09-16T14:24:01.5206807Z 
2026-09-16T14:24:01.5207630Z TASK [nfs : Verificando as variaveis] ******************************************
2026-09-16T14:24:01.5207897Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:24:01.5208139Z     "changed": false, 
2026-09-16T14:24:01.5208313Z     "msg": "All assertions passed"
2026-09-16T14:24:01.5208496Z }
2026-09-16T14:24:01.5241802Z Wednesday 16 September 2026  11:24:01 -0300 (0:00:00.064)       0:03:55.001 *** 
2026-09-16T14:24:04.0737785Z 
2026-09-16T14:24:04.0738691Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-09-16T14:24:04.0738884Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:24:04.0778387Z Wednesday 16 September 2026  11:24:04 -0300 (0:00:02.553)       0:03:57.554 *** 
2026-09-16T14:24:04.7991617Z 
2026-09-16T14:24:04.7992320Z TASK [nfs : Install networker lgtoclnt_url] ************************************
2026-09-16T14:24:04.7993893Z fatal: [caddeapllx2798.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.476454", "end": "2026-09-16 11:24:04.781436", "msg": "non-zero return code", "rc": 1, "start": "2026-09-16 11:24:04.304982", "stderr": "aviso: /var/tmp/rpm-tmp.z04kcy: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.z04kcy: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-09-16T14:24:04.7994996Z ...ignoring
2026-09-16T14:24:04.8023827Z Wednesday 16 September 2026  11:24:04 -0300 (0:00:00.724)       0:03:58.279 *** 
2026-09-16T14:24:05.4855976Z 
2026-09-16T14:24:05.4856787Z TASK [nfs : Install networker lgtonmda_url] ************************************
2026-09-16T14:24:05.4861436Z fatal: [caddeapllx2798.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.437717", "end": "2026-09-16 11:24:05.469179", "msg": "non-zero return code", "rc": 1, "start": "2026-09-16 11:24:05.031462", "stderr": "aviso: /var/tmp/rpm-tmp.xZBUTv: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.xZBUTv: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-09-16T14:24:05.4862299Z ...ignoring
2026-09-16T14:24:05.4901687Z Wednesday 16 September 2026  11:24:05 -0300 (0:00:00.687)       0:03:58.967 *** 
2026-09-16T14:24:05.7333479Z 
2026-09-16T14:24:05.7334487Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-09-16T14:24:05.7334683Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:24:05.7374857Z Wednesday 16 September 2026  11:24:05 -0300 (0:00:00.247)       0:03:59.214 *** 
2026-09-16T14:24:05.9834601Z 
2026-09-16T14:24:05.9835992Z TASK [nfs : Create a symbolic link] ********************************************
2026-09-16T14:24:05.9836235Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:24:05.9877754Z Wednesday 16 September 2026  11:24:05 -0300 (0:00:00.250)       0:03:59.464 *** 
2026-09-16T14:24:06.6019797Z 
2026-09-16T14:24:06.6020984Z TASK [nfs : Networker | Start networker] ***************************************
2026-09-16T14:24:06.6021646Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:24:06.6072337Z Wednesday 16 September 2026  11:24:06 -0300 (0:00:00.619)       0:04:00.084 *** 
2026-09-16T14:24:06.8695003Z 
2026-09-16T14:24:06.8696368Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-09-16T14:24:06.8696880Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:24:06.8734941Z Wednesday 16 September 2026  11:24:06 -0300 (0:00:00.266)       0:04:00.350 *** 
2026-09-16T14:24:17.2911324Z 
2026-09-16T14:24:17.2912912Z TASK [nfs : Networker | Restart networker] *************************************
2026-09-16T14:24:17.2913443Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:24:17.2943203Z Wednesday 16 September 2026  11:24:17 -0300 (0:00:10.420)       0:04:10.771 *** 
2026-09-16T14:24:17.5694831Z 
2026-09-16T14:24:17.5696420Z TASK [nfs : Montando volume remoto] ********************************************
2026-09-16T14:24:17.5696936Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:24:17.5732923Z Wednesday 16 September 2026  11:24:17 -0300 (0:00:00.278)       0:04:11.050 *** 
2026-09-16T14:24:17.6213245Z Wednesday 16 September 2026  11:24:17 -0300 (0:00:00.046)       0:04:11.097 *** 
2026-09-16T14:24:17.6805235Z 
2026-09-16T14:24:17.6805692Z TASK [nfs : Parse JSON data] ***************************************************
2026-09-16T14:24:17.6805903Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:24:17.6840526Z Wednesday 16 September 2026  11:24:17 -0300 (0:00:00.063)       0:04:11.161 *** 
2026-09-16T14:24:17.7419288Z 
2026-09-16T14:24:17.7419944Z TASK [nfs : debug] *************************************************************
2026-09-16T14:24:17.7420269Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:24:17.7420549Z     "msg": {
2026-09-16T14:24:17.7420718Z         "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA", 
2026-09-16T14:24:17.7420896Z         "NFS_MOUNT_POINT": "/SIIFX_SIGMS"
2026-09-16T14:24:17.7421029Z     }
2026-09-16T14:24:17.7421147Z }
2026-09-16T14:24:17.7462659Z Wednesday 16 September 2026  11:24:17 -0300 (0:00:00.061)       0:04:11.223 *** 
2026-09-16T14:24:17.8064201Z 
2026-09-16T14:24:17.8064912Z TASK [nfs : debug] *************************************************************
2026-09-16T14:24:17.8066842Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:24:17.8070236Z     "msg": "/SIIFX_SIGMS"
2026-09-16T14:24:17.8072645Z }
2026-09-16T14:24:17.8101035Z Wednesday 16 September 2026  11:24:17 -0300 (0:00:00.063)       0:04:11.287 *** 
2026-09-16T14:24:17.8691143Z 
2026-09-16T14:24:17.8692206Z TASK [nfs : debug] *************************************************************
2026-09-16T14:24:17.8693000Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:24:17.8693230Z     "msg": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA"
2026-09-16T14:24:17.8693391Z }
2026-09-16T14:24:17.8724782Z Wednesday 16 September 2026  11:24:17 -0300 (0:00:00.062)       0:04:11.349 *** 
2026-09-16T14:24:17.9351058Z 
2026-09-16T14:24:17.9352132Z TASK [nfs : Verificando as variaveis] ******************************************
2026-09-16T14:24:17.9352952Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:24:17.9353196Z     "changed": false, 
2026-09-16T14:24:17.9353361Z     "msg": "All assertions passed"
2026-09-16T14:24:17.9353493Z }
2026-09-16T14:24:17.9391405Z Wednesday 16 September 2026  11:24:17 -0300 (0:00:00.066)       0:04:11.416 *** 
2026-09-16T14:24:20.4547313Z 
2026-09-16T14:24:20.4548063Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-09-16T14:24:20.4548249Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:24:20.4577199Z Wednesday 16 September 2026  11:24:20 -0300 (0:00:02.518)       0:04:13.934 *** 
2026-09-16T14:24:21.1768091Z 
2026-09-16T14:24:21.1769311Z TASK [nfs : Install networker lgtoclnt_url] ************************************
2026-09-16T14:24:21.1773234Z fatal: [caddeapllx2798.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.464561", "end": "2026-09-16 11:24:21.160275", "msg": "non-zero return code", "rc": 1, "start": "2026-09-16 11:24:20.695714", "stderr": "aviso: /var/tmp/rpm-tmp.YxoW2x: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.YxoW2x: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-09-16T14:24:21.1773915Z ...ignoring
2026-09-16T14:24:21.1812632Z Wednesday 16 September 2026  11:24:21 -0300 (0:00:00.723)       0:04:14.658 *** 
2026-09-16T14:24:21.8695876Z 
2026-09-16T14:24:21.8697209Z TASK [nfs : Install networker lgtonmda_url] ************************************
2026-09-16T14:24:21.8701713Z fatal: [caddeapllx2798.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.442485", "end": "2026-09-16 11:24:21.853211", "msg": "non-zero return code", "rc": 1, "start": "2026-09-16 11:24:21.410726", "stderr": "aviso: /var/tmp/rpm-tmp.RkkR5k: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.RkkR5k: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-09-16T14:24:21.8702750Z ...ignoring
2026-09-16T14:24:21.8742502Z Wednesday 16 September 2026  11:24:21 -0300 (0:00:00.692)       0:04:15.351 *** 
2026-09-16T14:24:22.1190396Z 
2026-09-16T14:24:22.1191395Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-09-16T14:24:22.1191572Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:24:22.1383797Z Wednesday 16 September 2026  11:24:22 -0300 (0:00:00.263)       0:04:15.615 *** 
2026-09-16T14:24:22.3850545Z 
2026-09-16T14:24:22.3851530Z TASK [nfs : Create a symbolic link] ********************************************
2026-09-16T14:24:22.3852492Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:24:22.3889651Z Wednesday 16 September 2026  11:24:22 -0300 (0:00:00.250)       0:04:15.866 *** 
2026-09-16T14:24:23.0071929Z 
2026-09-16T14:24:23.0073204Z TASK [nfs : Networker | Start networker] ***************************************
2026-09-16T14:24:23.0073915Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:24:23.0123400Z Wednesday 16 September 2026  11:24:23 -0300 (0:00:00.623)       0:04:16.489 *** 
2026-09-16T14:24:23.2681706Z 
2026-09-16T14:24:23.2683326Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-09-16T14:24:23.2683812Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:24:23.2724023Z Wednesday 16 September 2026  11:24:23 -0300 (0:00:00.260)       0:04:16.749 *** 
2026-09-16T14:24:33.6815811Z 
2026-09-16T14:24:33.6817283Z TASK [nfs : Networker | Restart networker] *************************************
2026-09-16T14:24:33.6817514Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:24:33.6860509Z Wednesday 16 September 2026  11:24:33 -0300 (0:00:10.413)       0:04:27.163 *** 
2026-09-16T14:24:33.9731102Z 
2026-09-16T14:24:33.9731999Z TASK [nfs : Montando volume remoto] ********************************************
2026-09-16T14:24:33.9733121Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:24:33.9777383Z Wednesday 16 September 2026  11:24:33 -0300 (0:00:00.291)       0:04:27.454 *** 
2026-09-16T14:24:34.0230204Z 
2026-09-16T14:24:34.0230782Z PLAY [jboss] *******************************************************************
2026-09-16T14:24:34.0264457Z 
2026-09-16T14:24:34.0264928Z PLAY [Copiando deployments adicionais] *****************************************
2026-09-16T14:24:34.0302406Z 
2026-09-16T14:24:34.0302962Z PLAY [Copiando modules adicionais] *********************************************
2026-09-16T14:24:34.0336944Z 
2026-09-16T14:24:34.0337411Z PLAY [jboss] *******************************************************************
2026-09-16T14:24:34.0392770Z 
2026-09-16T14:24:34.0393312Z PLAY [jboss] *******************************************************************
2026-09-16T14:24:34.0436152Z 
2026-09-16T14:24:34.0436758Z PLAY [jboss] *******************************************************************
2026-09-16T14:24:34.0472341Z 
2026-09-16T14:24:34.0473962Z PLAY [jboss] *******************************************************************
2026-09-16T14:24:34.0502825Z 
2026-09-16T14:24:34.0503261Z PLAY [jboss] *******************************************************************
2026-09-16T14:24:34.0529624Z 
2026-09-16T14:24:34.0530070Z PLAY [local] *******************************************************************
2026-09-16T14:24:34.0561598Z [WARNING]: Could not match supplied host pattern, ignoring: instance_restart
2026-09-16T14:24:34.0565234Z 
2026-09-16T14:24:34.0565682Z PLAY [instance_restart] ********************************************************
2026-09-16T14:24:34.0566242Z skipping: no hosts matched
2026-09-16T14:24:34.0569676Z [WARNING]: Could not match supplied host pattern, ignoring: machine_reboot
2026-09-16T14:24:34.0572372Z 
2026-09-16T14:24:34.0572537Z PLAY [machine_reboot] **********************************************************
2026-09-16T14:24:34.0572699Z skipping: no hosts matched
2026-09-16T14:24:34.0580532Z 
2026-09-16T14:24:34.0580914Z PLAY [local] *******************************************************************
2026-09-16T14:24:34.0614872Z [WARNING]: Could not match supplied host pattern, ignoring: instance_stop
2026-09-16T14:24:34.0618279Z 
2026-09-16T14:24:34.0618484Z PLAY [instance_stop] ***********************************************************
2026-09-16T14:24:34.0618926Z skipping: no hosts matched
2026-09-16T14:24:34.0621846Z 
2026-09-16T14:24:34.0622387Z PLAY [machine_reboot] **********************************************************
2026-09-16T14:24:34.0622638Z skipping: no hosts matched
2026-09-16T14:24:34.0628330Z 
2026-09-16T14:24:34.0628826Z PLAY [local] *******************************************************************
2026-09-16T14:24:34.0654553Z [WARNING]: Could not match supplied host pattern, ignoring: escopo_execucao
2026-09-16T14:24:34.0657683Z 
2026-09-16T14:24:34.0658157Z PLAY [Executar o Start do Sirot Connector no escopo definido] ******************
2026-09-16T14:24:34.0658782Z skipping: no hosts matched
2026-09-16T14:24:34.0664236Z 
2026-09-16T14:24:34.0664667Z PLAY [local] *******************************************************************
2026-09-16T14:24:34.0687085Z 
2026-09-16T14:24:34.0687526Z PLAY [Executar o Stop do Sirot Connector] **************************************
2026-09-16T14:24:34.0687720Z skipping: no hosts matched
2026-09-16T14:24:34.0697782Z 
2026-09-16T14:24:34.0698206Z PLAY [Configura TSM] ***********************************************************
2026-09-16T14:24:34.0725153Z 
2026-09-16T14:24:34.0726223Z PLAY [jboss] *******************************************************************
2026-09-16T14:24:34.0766916Z Wednesday 16 September 2026  11:24:34 -0300 (0:00:00.098)       0:04:27.553 *** 
2026-09-16T14:24:34.1390226Z 
2026-09-16T14:24:34.1391022Z TASK [Cria variável build_repository_name] *************************************
2026-09-16T14:24:34.1391204Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:24:34.1411966Z Wednesday 16 September 2026  11:24:34 -0300 (0:00:00.064)       0:04:27.618 *** 
2026-09-16T14:24:34.2026006Z 
2026-09-16T14:24:34.2026686Z TASK [Buscando diretorio de config] ********************************************
2026-09-16T14:24:34.2026909Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:24:34.2134064Z Wednesday 16 September 2026  11:24:34 -0300 (0:00:00.072)       0:04:27.690 *** 
2026-09-16T14:24:34.5943570Z 
2026-09-16T14:24:34.5944698Z TASK [Verifica se o arquivo {{ item }}/etc/hosts-{{ sistema_ambiente }} existe] ***
2026-09-16T14:24:34.5945046Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r13215/a/_SIIFX-batch-config)
2026-09-16T14:24:34.9009466Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r13215/a/_SIIFX-batch-config/so)
2026-09-16T14:24:34.9053591Z Wednesday 16 September 2026  11:24:34 -0300 (0:00:00.691)       0:04:28.382 *** 
2026-09-16T14:24:35.3714709Z 
2026-09-16T14:24:35.3715365Z TASK [Altera arquivo /etc/hosts] ***********************************************
2026-09-16T14:24:35.3717140Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => (item={u'item': u'/opt/ads-agent/_work/r13215/a/_SIIFX-batch-config', u'stat': {u'charset': u'us-ascii', u'uid': 1000, u'exists': True, u'attr_flags': u'', u'woth': False, u'device_type': 0, u'mtime': 1789568052.2861485, u'block_size': 4096, u'inode': 343951365, u'isgid': False, u'size': 175, u'wgrp': False, u'executable': False, u'isuid': False, u'readable': True, u'isreg': True, u'version': u'839559688', u'pw_name': u'sadscp01', u'gid': 1000, u'ischr': False, u'wusr': True, u'writeable': True, u'mimetype': u'text/plain', u'blocks': 8, u'xoth': False, u'islnk': False, u'nlink': 1, u'issock': False, u'rgrp': True, u'gr_name': u'sadscp01', u'path': u'/opt/ads-agent/_work/r13215/a/_SIIFX-batch-config/etc/hosts-des', u'xusr': False, u'atime': 1789568052.3101485, u'isdir': False, u'ctime': 1789568052.2861485, u'isblk': False, u'checksum': u'b189d1cdee317ad9f292a99c63b64d9c07bc0b06', u'dev': 64771, u'roth': True, u'isfifo': False, u'mode': u'0644', u'xgrp': False, u'rusr': True, u'attributes': []}, u'ansible_loop_var': u'item', u'failed': False, u'invocation': {u'module_args': {u'follow': False, u'get_checksum': True, u'path': u'/opt/ads-agent/_work/r13215/a/_SIIFX-batch-config/etc/hosts-des', u'checksum_algorithm': u'sha1', u'get_md5': False, u'get_mime': True, u'get_attributes': True}}, u'changed': False})
2026-09-16T14:24:35.3805129Z 
2026-09-16T14:24:35.3805545Z PLAY [Configura Control-M] *****************************************************
2026-09-16T14:24:35.3863189Z Wednesday 16 September 2026  11:24:35 -0300 (0:00:00.480)       0:04:28.863 *** 
2026-09-16T14:24:36.0174957Z 
2026-09-16T14:24:36.0175812Z TASK [Gathering Facts] *********************************************************
2026-09-16T14:24:36.0176337Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:24:36.0415291Z Wednesday 16 September 2026  11:24:36 -0300 (0:00:00.654)       0:04:29.518 *** 
2026-09-16T14:24:36.2859959Z 
2026-09-16T14:24:36.2860854Z TASK [stat] ********************************************************************
2026-09-16T14:24:36.2861696Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:24:36.3017250Z Wednesday 16 September 2026  11:24:36 -0300 (0:00:00.260)       0:04:29.778 *** 
2026-09-16T14:24:36.3637809Z 
2026-09-16T14:24:36.3638519Z TASK [assert] ******************************************************************
2026-09-16T14:24:36.3638879Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:24:36.3639083Z     "changed": false, 
2026-09-16T14:24:36.3639242Z     "msg": "All assertions passed"
2026-09-16T14:24:36.3639396Z }
2026-09-16T14:24:36.3802358Z Wednesday 16 September 2026  11:24:36 -0300 (0:00:00.078)       0:04:29.857 *** 
2026-09-16T14:24:36.4593220Z 
2026-09-16T14:24:36.4594023Z TASK [control_m : Cria variável ansible] ***************************************
2026-09-16T14:24:36.4594201Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:24:36.4757479Z Wednesday 16 September 2026  11:24:36 -0300 (0:00:00.095)       0:04:29.952 *** 
2026-09-16T14:24:37.2853225Z 
2026-09-16T14:24:37.2853933Z TASK [control_m : Copiando arquivo de certificado] *****************************
2026-09-16T14:24:37.2854111Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:24:37.2986729Z Wednesday 16 September 2026  11:24:37 -0300 (0:00:00.822)       0:04:30.775 *** 
2026-09-16T14:24:37.5494998Z 
2026-09-16T14:24:37.5496115Z TASK [control_m : Executando add-user.sh] **************************************
2026-09-16T14:24:37.5497171Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:24:37.5654337Z Wednesday 16 September 2026  11:24:37 -0300 (0:00:00.266)       0:04:31.042 *** 
2026-09-16T14:24:38.0180671Z 
2026-09-16T14:24:38.0181914Z TASK [control_m : Removendo add-user.sh] ***************************************
2026-09-16T14:24:38.0182307Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:24:38.0340784Z Wednesday 16 September 2026  11:24:38 -0300 (0:00:00.468)       0:04:31.510 *** 
2026-09-16T14:24:38.2894519Z 
2026-09-16T14:24:38.2895651Z TASK [control_m : Criacao diretorio /producao/carga] ***************************
2026-09-16T14:24:38.2895961Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:24:38.3062218Z Wednesday 16 September 2026  11:24:38 -0300 (0:00:00.272)       0:04:31.783 *** 
2026-09-16T14:24:38.5554050Z 
2026-09-16T14:24:38.5554786Z TASK [control_m : Criacao diretorio /producao/suporte] *************************
2026-09-16T14:24:38.5554997Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:24:38.5717870Z Wednesday 16 September 2026  11:24:38 -0300 (0:00:00.265)       0:04:32.048 *** 
2026-09-16T14:24:39.1196386Z 
2026-09-16T14:24:39.1197068Z TASK [control_m : Garante bash_profile] ****************************************
2026-09-16T14:24:39.1197271Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:24:39.1460064Z Wednesday 16 September 2026  11:24:39 -0300 (0:00:00.574)       0:04:32.622 *** 
2026-09-16T14:24:39.3985647Z 
2026-09-16T14:24:39.3986708Z TASK [control_m : Cria Diretório de Scripts] ***********************************
2026-09-16T14:24:39.3986923Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:24:39.4153921Z Wednesday 16 September 2026  11:24:39 -0300 (0:00:00.269)       0:04:32.892 *** 
2026-09-16T14:25:31.7480844Z 
2026-09-16T14:25:31.7481948Z TASK [control_m : Copia Scripts] ***********************************************
2026-09-16T14:25:31.7484139Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:25:31.7660957Z Wednesday 16 September 2026  11:25:31 -0300 (0:00:52.350)       0:05:25.242 *** 
2026-09-16T14:25:32.0215707Z 
2026-09-16T14:25:32.0216655Z TASK [control_m : Verifica se o arquivo /producao//configuration/custom.sh existe] ***
2026-09-16T14:25:32.0216972Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:25:32.0428093Z Wednesday 16 September 2026  11:25:32 -0300 (0:00:00.276)       0:05:25.519 *** 
2026-09-16T14:25:32.3210792Z 
2026-09-16T14:25:32.3211532Z TASK [control_m : Executa shell customizada] ***********************************
2026-09-16T14:25:32.3212279Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:25:32.3378452Z Wednesday 16 September 2026  11:25:32 -0300 (0:00:00.295)       0:05:25.814 *** 
2026-09-16T14:25:32.9887984Z 
2026-09-16T14:25:32.9888972Z TASK [control_m : Configuração Control-M] **************************************
2026-09-16T14:25:32.9890436Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:25:33.0052248Z Wednesday 16 September 2026  11:25:33 -0300 (0:00:00.667)       0:05:26.482 *** 
2026-09-16T14:25:39.1008792Z 
2026-09-16T14:25:39.1009860Z TASK [control_m : Restart ControlM] ********************************************
2026-09-16T14:25:39.1010059Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:25:39.1055511Z 
2026-09-16T14:25:39.1055901Z PLAY [jboss] *******************************************************************
2026-09-16T14:25:39.1106923Z 
2026-09-16T14:25:39.1107378Z PLAY [jboss] *******************************************************************
2026-09-16T14:25:39.1151494Z 
2026-09-16T14:25:39.1151922Z PLAY [jboss] *******************************************************************
2026-09-16T14:25:39.1176510Z 
2026-09-16T14:25:39.1176765Z PLAY [jboss] *******************************************************************
2026-09-16T14:25:39.1423148Z 
2026-09-16T14:25:39.1423882Z PLAY [localhost] ***************************************************************
2026-09-16T14:25:39.1449615Z 
2026-09-16T14:25:39.1450036Z PLAY [jboss] *******************************************************************
2026-09-16T14:25:39.1494903Z 
2026-09-16T14:25:39.1495380Z PLAY [jboss] *******************************************************************
2026-09-16T14:25:39.1538037Z 
2026-09-16T14:25:39.1538600Z PLAY [jboss] *******************************************************************
2026-09-16T14:25:39.1572518Z 
2026-09-16T14:25:39.1572970Z PLAY RECAP *********************************************************************
2026-09-16T14:25:39.1574807Z caddeapllx1214.agil.nprd.caixa.gov.br : ok=30   changed=8    unreachable=0    failed=1    skipped=0    rescued=0    ignored=3   
2026-09-16T14:25:39.1575306Z caddeapllx2798.agil.nprd.caixa.gov.br : ok=92   changed=32   unreachable=0    failed=0    skipped=4    rescued=0    ignored=8   
2026-09-16T14:25:39.1575612Z 
2026-09-16T14:25:39.1576254Z Wednesday 16 September 2026  11:25:39 -0300 (0:00:06.152)       0:05:32.634 *** 
2026-09-16T14:25:39.1576529Z =============================================================================== 
2026-09-16T14:25:39.1581867Z nfs : Montando volume remoto ------------------------------------------ 182.71s
2026-09-16T14:25:39.1582362Z control_m : Copia Scripts ---------------------------------------------- 52.35s
2026-09-16T14:25:39.1582714Z nfs : execute montagem script ------------------------------------------ 14.17s
2026-09-16T14:25:39.1583189Z nfs : Networker | Restart networker ------------------------------------ 10.43s
2026-09-16T14:25:39.1583884Z nfs : Networker | Restart networker ------------------------------------ 10.42s
2026-09-16T14:25:39.1584174Z nfs : Networker | Restart networker ------------------------------------ 10.41s
2026-09-16T14:25:39.1584418Z nfs : Networker | Restart networker ------------------------------------ 10.40s
2026-09-16T14:25:39.1584661Z control_m : Restart ControlM -------------------------------------------- 6.15s
2026-09-16T14:25:39.1584897Z nfs : Instalando o NFS Client ------------------------------------------- 4.11s
2026-09-16T14:25:39.1594600Z nfs : Instalando o NFS Client ------------------------------------------- 2.73s
2026-09-16T14:25:39.1594879Z nfs : Instalando o NFS Client ------------------------------------------- 2.55s
2026-09-16T14:25:39.1595129Z nfs : Instalando o NFS Client ------------------------------------------- 2.52s
2026-09-16T14:25:39.1595424Z nfs : Networker | Start networker --------------------------------------- 0.92s
2026-09-16T14:25:39.1595670Z control_m : Copiando arquivo de certificado ----------------------------- 0.82s
2026-09-16T14:25:39.1596117Z nfs : Install networker lgtoclnt_url ------------------------------------ 0.74s
2026-09-16T14:25:39.1596351Z nfs : Install networker lgtoclnt_url ------------------------------------ 0.72s
2026-09-16T14:25:39.1596726Z nfs : Install networker lgtoclnt_url ------------------------------------ 0.72s
2026-09-16T14:25:39.1596965Z nfs : Install networker lgtoclnt_url ------------------------------------ 0.71s
2026-09-16T14:25:39.1597199Z nfs : execute clean json ------------------------------------------------ 0.70s
2026-09-16T14:25:39.1597431Z nfs : Install networker lgtonmda_url ------------------------------------ 0.70s
2026-09-16T14:25:39.1597592Z Playbook run took 0 days, 0 hours, 5 minutes, 32 seconds
2026-09-16T14:25:39.2668538Z ##[error]Bash exited with code '2'.
2026-09-16T14:25:39.2712548Z ##[warning]RetryHelper encountered task failure, will retry (attempt #: 2 out of 2) after 4000 ms
2026-09-16T14:25:43.3612099Z Generating script.
2026-09-16T14:25:43.3624596Z ========================== Starting Command Output ===========================
2026-09-16T14:25:43.3631119Z [command]/bin/bash /opt/ads-agent/_work/_temp/fba84cb8-45b3-46a9-a07c-665e58644302.sh
2026-09-16T14:25:45.6608954Z 
2026-09-16T14:25:45.6610136Z PLAY [local] *******************************************************************
2026-09-16T14:25:45.6915053Z 
2026-09-16T14:25:45.6915661Z PLAY [Configurando o DNS] ******************************************************
2026-09-16T14:25:45.8887654Z 
2026-09-16T14:25:45.8888751Z PLAY [local] *******************************************************************
2026-09-16T14:25:45.8923586Z 
2026-09-16T14:25:45.8924317Z PLAY [Verificando serviços] ****************************************************
2026-09-16T14:25:45.9015408Z 
2026-09-16T14:25:45.9015940Z PLAY [Configuração LDAP] *******************************************************
2026-09-16T14:25:45.9051477Z [WARNING]: Found variable using reserved name: when
2026-09-16T14:25:45.9056071Z 
2026-09-16T14:25:45.9056439Z PLAY [jboss] *******************************************************************
2026-09-16T14:25:45.9155990Z 
2026-09-16T14:25:45.9156389Z PLAY [Stack Jboss] *************************************************************
2026-09-16T14:25:45.9183438Z 
2026-09-16T14:25:45.9184144Z PLAY [jboss] *******************************************************************
2026-09-16T14:25:45.9226399Z 
2026-09-16T14:25:45.9227145Z PLAY [jboss] *******************************************************************
2026-09-16T14:25:45.9516678Z Wednesday 16 September 2026  11:25:45 -0300 (0:00:00.352)       0:00:00.352 *** 
2026-09-16T14:25:46.5351692Z 
2026-09-16T14:25:46.5352575Z TASK [Verifica se o arquivo nfs_config.json existe] ****************************
2026-09-16T14:25:46.5353339Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:25:46.5383856Z Wednesday 16 September 2026  11:25:46 -0300 (0:00:00.586)       0:00:00.939 *** 
2026-09-16T14:25:46.5910552Z included: /opt/ads-agent/_work/r13215/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for caddeapllx2798.agil.nprd.caixa.gov.br
2026-09-16T14:25:46.5940280Z Wednesday 16 September 2026  11:25:46 -0300 (0:00:00.055)       0:00:00.995 *** 
2026-09-16T14:25:46.6566164Z 
2026-09-16T14:25:46.6567033Z TASK [nfs : Criar variáveis] ***************************************************
2026-09-16T14:25:46.6567220Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:25:46.6623167Z Wednesday 16 September 2026  11:25:46 -0300 (0:00:00.068)       0:00:01.063 *** 
2026-09-16T14:25:47.1627352Z 
2026-09-16T14:25:47.1628827Z TASK [nfs : Coletar variáveis de ambiente] *************************************
2026-09-16T14:25:47.1629562Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:25:47.1670450Z Wednesday 16 September 2026  11:25:47 -0300 (0:00:00.504)       0:00:01.568 *** 
2026-09-16T14:25:47.2271009Z 
2026-09-16T14:25:47.2271704Z TASK [nfs : Exibir resultado em JSON] ******************************************
2026-09-16T14:25:47.2271947Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:25:47.2272624Z     "nfs_vars_json": {
2026-09-16T14:25:47.2272775Z         "changed": false, 
2026-09-16T14:25:47.2273223Z         "cmd": "cat /opt/ads-agent/_work/r13215/a/nfs_config.json", 
2026-09-16T14:25:47.2273399Z         "delta": "0:00:00.026383", 
2026-09-16T14:25:47.2273589Z         "end": "2026-09-16 11:25:47.141277", 
2026-09-16T14:25:47.2273716Z         "failed": false, 
2026-09-16T14:25:47.2273829Z         "rc": 0, 
2026-09-16T14:25:47.2274015Z         "start": "2026-09-16 11:25:47.114894", 
2026-09-16T14:25:47.2274144Z         "stderr": "", 
2026-09-16T14:25:47.2274263Z         "stderr_lines": [], 
2026-09-16T14:25:47.2274963Z         "stdout": "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT_ISILON\": \"/SIIFX\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_3\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT_ISILON_2\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT_ISILON_4\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT_ISILON_4\": \"/SIIFX_SIGMS\"}]", 
2026-09-16T14:25:47.2275448Z         "stdout_lines": [
2026-09-16T14:25:47.2276180Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT_ISILON\": \"/SIIFX\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_3\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT_ISILON_2\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT_ISILON_4\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT_ISILON_4\": \"/SIIFX_SIGMS\"}]"
2026-09-16T14:25:47.2276725Z         ]
2026-09-16T14:25:47.2276828Z     }
2026-09-16T14:25:47.2276927Z }
2026-09-16T14:25:47.2300479Z Wednesday 16 September 2026  11:25:47 -0300 (0:00:00.063)       0:00:01.631 *** 
2026-09-16T14:25:47.2972213Z 
2026-09-16T14:25:47.2973082Z TASK [nfs : Criar variáveis] ***************************************************
2026-09-16T14:25:47.2973277Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:25:47.3020934Z Wednesday 16 September 2026  11:25:47 -0300 (0:00:00.071)       0:00:01.703 *** 
2026-09-16T14:25:54.9169341Z 
2026-09-16T14:25:54.9169872Z TASK [nfs : execute montagem script] *******************************************
2026-09-16T14:25:54.9170099Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:25:54.9191694Z Wednesday 16 September 2026  11:25:54 -0300 (0:00:07.617)       0:00:09.320 *** 
2026-09-16T14:25:54.9830286Z 
2026-09-16T14:25:54.9831119Z TASK [nfs : ansible.builtin.debug] *********************************************
2026-09-16T14:25:54.9833602Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:25:54.9833841Z     "changed": false, 
2026-09-16T14:25:54.9834003Z     "msg": {
2026-09-16T14:25:54.9834129Z         "changed": true, 
2026-09-16T14:25:54.9834247Z         "cmd": [
2026-09-16T14:25:54.9834357Z             "python", 
2026-09-16T14:25:54.9834764Z             "/opt/ads-agent/_work/r13215/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py", 
2026-09-16T14:25:54.9834924Z             "montagem", 
2026-09-16T14:25:54.9835102Z             "siifx-batch-vm", 
2026-09-16T14:25:54.9835239Z             "des", 
2026-09-16T14:25:54.9835351Z             "ctc_nprd", 
2026-09-16T14:25:54.9835540Z             "/opt/ads-agent/_work/r13215/a/esteira-jboss-vm-v2", 
2026-09-16T14:25:54.9835681Z             "C&t@d02", 
2026-09-16T14:25:54.9836008Z             "***", 
2026-09-16T14:25:54.9836148Z             "s736651@corp.caixa.gov.br", 
2026-09-16T14:25:54.9836322Z             "***", 
2026-09-16T14:25:54.9837245Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT_ISILON\": \"/SIIFX\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_3\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT_ISILON_2\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT_ISILON_4\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT_ISILON_4\": \"/SIIFX_SIGMS\"}]"
2026-09-16T14:25:54.9838119Z         ], 
2026-09-16T14:25:54.9838330Z         "delta": "0:00:07.228201", 
2026-09-16T14:25:54.9838530Z         "end": "2026-09-16 11:25:54.894265", 
2026-09-16T14:25:54.9838662Z         "failed": false, 
2026-09-16T14:25:54.9838821Z         "rc": 0, 
2026-09-16T14:25:54.9839060Z         "start": "2026-09-16 11:25:47.666064", 
2026-09-16T14:25:54.9839219Z         "stderr": "", 
2026-09-16T14:25:54.9839331Z         "stderr_lines": [], 
2026-09-16T14:25:54.9842216Z         "stdout": "[{u'NFS_MOUNT_POINT_ISILON': u'/SIIFX', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH'}, {u'NFS_MOUNT_POINT_ISILON_3': u'/SIIFX_SIISF', u'NFS_ENDPOINT_ISILON_3': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF'}, {u'NFS_MOUNT_POINT_ISILON_2': u'/SIIFX_B2B', u'NFS_ENDPOINT_ISILON_2': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX'}, {u'NFS_ENDPOINT_ISILON_4': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA', u'NFS_MOUNT_POINT_ISILON_4': u'/SIIFX_SIGMS'}]\nNome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           \n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH /SIIFX                              ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfs_path=/SIIFX\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH /SIIFX                              ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX /SIIFX_B2B                          ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfs_path=/SIIFX_B2B\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX /SIIFX_B2B                          ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /SIIFX_SIISF                        ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfs_path=/SIIFX_SIISF\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /SIIFX_SIISF                        ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA /SIIFX_SIGMS                        ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfs_path=/SIIFX_SIGMS\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA /SIIFX_SIGMS                        ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T14:25:54.9843916Z         "stdout_lines": [
2026-09-16T14:25:54.9844661Z             "[{u'NFS_MOUNT_POINT_ISILON': u'/SIIFX', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH'}, {u'NFS_MOUNT_POINT_ISILON_3': u'/SIIFX_SIISF', u'NFS_ENDPOINT_ISILON_3': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF'}, {u'NFS_MOUNT_POINT_ISILON_2': u'/SIIFX_B2B', u'NFS_ENDPOINT_ISILON_2': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX'}, {u'NFS_ENDPOINT_ISILON_4': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA', u'NFS_MOUNT_POINT_ISILON_4': u'/SIIFX_SIGMS'}]", 
2026-09-16T14:25:54.9845102Z             "Nome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           ", 
2026-09-16T14:25:54.9845472Z             "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------", 
2026-09-16T14:25:54.9845868Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH /SIIFX                              ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T14:25:54.9846036Z             "nfs_path=/SIIFX", 
2026-09-16T14:25:54.9846336Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH", 
2026-09-16T14:25:54.9846851Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH /SIIFX                              ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T14:25:54.9847082Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX /SIIFX_B2B                          ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T14:25:54.9847251Z             "nfs_path=/SIIFX_B2B", 
2026-09-16T14:25:54.9847402Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX", 
2026-09-16T14:25:54.9847598Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX /SIIFX_B2B                          ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T14:25:54.9847810Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /SIIFX_SIISF                        ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T14:25:54.9848052Z             "nfs_path=/SIIFX_SIISF", 
2026-09-16T14:25:54.9848189Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF", 
2026-09-16T14:25:54.9848383Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /SIIFX_SIISF                        ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T14:25:54.9848607Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA /SIIFX_SIGMS                        ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T14:25:54.9848776Z             "nfs_path=/SIIFX_SIGMS", 
2026-09-16T14:25:54.9848929Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA", 
2026-09-16T14:25:54.9849125Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA /SIIFX_SIGMS                        ISILON                              nfsctcnprd.ctc.caixa                des                                "
2026-09-16T14:25:54.9849331Z         ]
2026-09-16T14:25:54.9849427Z     }
2026-09-16T14:25:54.9849514Z }
2026-09-16T14:25:54.9867371Z Wednesday 16 September 2026  11:25:54 -0300 (0:00:00.067)       0:00:09.388 *** 
2026-09-16T14:25:55.3422147Z 
2026-09-16T14:25:55.3423212Z TASK [nfs : execute clean json] ************************************************
2026-09-16T14:25:55.3423935Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:25:55.3424272Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-09-16T14:25:55.3424971Z caddeapllx2798.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-09-16T14:25:55.3425323Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-09-16T14:25:55.3425602Z releases. A future Ansible release will default to using the discovered 
2026-09-16T14:25:55.3425785Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-09-16T14:25:55.3425972Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-09-16T14:25:55.3426315Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-09-16T14:25:55.3426612Z setting deprecation_warnings=False in ansible.cfg.
2026-09-16T14:25:55.3451656Z Wednesday 16 September 2026  11:25:55 -0300 (0:00:00.358)       0:00:09.746 *** 
2026-09-16T14:25:55.4078602Z 
2026-09-16T14:25:55.4079464Z TASK [nfs : result_new_string_json] ********************************************
2026-09-16T14:25:55.4082194Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:25:55.4082701Z     "msg": {
2026-09-16T14:25:55.4082925Z         "ansible_facts": {
2026-09-16T14:25:55.4083065Z             "discovered_interpreter_python": "/usr/bin/python"
2026-09-16T14:25:55.4083198Z         }, 
2026-09-16T14:25:55.4083307Z         "changed": true, 
2026-09-16T14:25:55.4084404Z         "cmd": "echo '[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT_ISILON\": \"/SIIFX\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_3\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT_ISILON_2\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT_ISILON_4\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT_ISILON_4\": \"/SIIFX_SIGMS\"}]' | sed 's/NFS_ENDPOINT_ISILON[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_ISILON[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_HUAWEI[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_HUAWEI[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_VM[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_VM[^\"]*/NFS_MOUNT_POINT/g'", 
2026-09-16T14:25:55.4085011Z         "delta": "0:00:00.003255", 
2026-09-16T14:25:55.4085134Z         "deprecations": [
2026-09-16T14:25:55.4085231Z             {
2026-09-16T14:25:55.4085814Z                 "msg": "Distribution rhel 9.3 on host caddeapllx2798.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, but is using /usr/bin/python for backward compatibility with prior Ansible releases. A future Ansible release will default to using the discovered platform python for this host. See https://docs.ansible.com/ansible/2.9/reference_appendices/interpreter_discovery.html for more information", 
2026-09-16T14:25:55.4086225Z                 "version": "2.12"
2026-09-16T14:25:55.4086386Z             }
2026-09-16T14:25:55.4086655Z         ], 
2026-09-16T14:25:55.4086852Z         "end": "2026-09-16 11:25:55.324486", 
2026-09-16T14:25:55.4086988Z         "failed": false, 
2026-09-16T14:25:55.4087106Z         "rc": 0, 
2026-09-16T14:25:55.4087278Z         "start": "2026-09-16 11:25:55.321231", 
2026-09-16T14:25:55.4087393Z         "stderr": "", 
2026-09-16T14:25:55.4087510Z         "stderr_lines": [], 
2026-09-16T14:25:55.4088142Z         "stdout": "[{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT\": \"/SIIFX\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT\": \"/SIIFX_SIGMS\"}]", 
2026-09-16T14:25:55.4088592Z         "stdout_lines": [
2026-09-16T14:25:55.4089352Z             "[{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT\": \"/SIIFX\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT\": \"/SIIFX_SIGMS\"}]"
2026-09-16T14:25:55.4089685Z         ]
2026-09-16T14:25:55.4089784Z     }
2026-09-16T14:25:55.4089882Z }
2026-09-16T14:25:55.4116644Z Wednesday 16 September 2026  11:25:55 -0300 (0:00:00.066)       0:00:09.812 *** 
2026-09-16T14:25:55.4737308Z 
2026-09-16T14:25:55.4737927Z TASK [nfs : Parse JSON data] ***************************************************
2026-09-16T14:25:55.4738111Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:25:55.4772319Z Wednesday 16 September 2026  11:25:55 -0300 (0:00:00.065)       0:00:09.878 *** 
2026-09-16T14:25:55.5379368Z 
2026-09-16T14:25:55.5379981Z TASK [nfs : result_new_json] ***************************************************
2026-09-16T14:25:55.5380514Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:25:55.5380650Z     "msg": [
2026-09-16T14:25:55.5380912Z         {
2026-09-16T14:25:55.5381295Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH", 
2026-09-16T14:25:55.5381465Z             "NFS_MOUNT_POINT": "/SIIFX"
2026-09-16T14:25:55.5381645Z         }, 
2026-09-16T14:25:55.5382968Z         {
2026-09-16T14:25:55.5383211Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF", 
2026-09-16T14:25:55.5383384Z             "NFS_MOUNT_POINT": "/SIIFX_SIISF"
2026-09-16T14:25:55.5383502Z         }, 
2026-09-16T14:25:55.5383601Z         {
2026-09-16T14:25:55.5383753Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX", 
2026-09-16T14:25:55.5384004Z             "NFS_MOUNT_POINT": "/SIIFX_B2B"
2026-09-16T14:25:55.5384117Z         }, 
2026-09-16T14:25:55.5384223Z         {
2026-09-16T14:25:55.5384365Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA", 
2026-09-16T14:25:55.5384522Z             "NFS_MOUNT_POINT": "/SIIFX_SIGMS"
2026-09-16T14:25:55.5384631Z         }
2026-09-16T14:25:55.5384731Z     ]
2026-09-16T14:25:55.5384881Z }
2026-09-16T14:25:55.5412860Z Wednesday 16 September 2026  11:25:55 -0300 (0:00:00.064)       0:00:09.942 *** 
2026-09-16T14:25:55.6200362Z included: /opt/ads-agent/_work/r13215/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx2798.agil.nprd.caixa.gov.br
2026-09-16T14:25:55.6278918Z included: /opt/ads-agent/_work/r13215/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx2798.agil.nprd.caixa.gov.br
2026-09-16T14:25:55.6350952Z included: /opt/ads-agent/_work/r13215/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx2798.agil.nprd.caixa.gov.br
2026-09-16T14:25:55.6428437Z included: /opt/ads-agent/_work/r13215/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx2798.agil.nprd.caixa.gov.br
2026-09-16T14:25:55.6501445Z Wednesday 16 September 2026  11:25:55 -0300 (0:00:00.108)       0:00:10.051 *** 
2026-09-16T14:25:55.7100713Z 
2026-09-16T14:25:55.7101342Z TASK [nfs : Parse JSON data] ***************************************************
2026-09-16T14:25:55.7101887Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:25:55.7129786Z Wednesday 16 September 2026  11:25:55 -0300 (0:00:00.063)       0:00:10.114 *** 
2026-09-16T14:25:55.7950845Z 
2026-09-16T14:25:55.7951694Z TASK [nfs : debug] *************************************************************
2026-09-16T14:25:55.7951910Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:25:55.7952105Z     "msg": {
2026-09-16T14:25:55.7952492Z         "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH", 
2026-09-16T14:25:55.7952654Z         "NFS_MOUNT_POINT": "/SIIFX"
2026-09-16T14:25:55.7952763Z     }
2026-09-16T14:25:55.7952891Z }
2026-09-16T14:25:55.7987110Z Wednesday 16 September 2026  11:25:55 -0300 (0:00:00.085)       0:00:10.200 *** 
2026-09-16T14:25:55.8648194Z 
2026-09-16T14:25:55.8648828Z TASK [nfs : debug] *************************************************************
2026-09-16T14:25:55.8649008Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:25:55.8649184Z     "msg": "/SIIFX"
2026-09-16T14:25:55.8649288Z }
2026-09-16T14:25:55.8690939Z Wednesday 16 September 2026  11:25:55 -0300 (0:00:00.070)       0:00:10.270 *** 
2026-09-16T14:25:55.9272747Z 
2026-09-16T14:25:55.9273712Z TASK [nfs : debug] *************************************************************
2026-09-16T14:25:55.9274401Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:25:55.9274856Z     "msg": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH"
2026-09-16T14:25:55.9274994Z }
2026-09-16T14:25:55.9309379Z Wednesday 16 September 2026  11:25:55 -0300 (0:00:00.061)       0:00:10.332 *** 
2026-09-16T14:25:55.9924659Z 
2026-09-16T14:25:55.9925658Z TASK [nfs : Verificando as variaveis] ******************************************
2026-09-16T14:25:55.9929647Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:25:55.9930003Z     "changed": false, 
2026-09-16T14:25:55.9930685Z     "msg": "All assertions passed"
2026-09-16T14:25:55.9930879Z }
2026-09-16T14:25:55.9962070Z Wednesday 16 September 2026  11:25:55 -0300 (0:00:00.065)       0:00:10.397 *** 
2026-09-16T14:25:59.2830882Z 
2026-09-16T14:25:59.2831883Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-09-16T14:25:59.2832152Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:25:59.2869126Z Wednesday 16 September 2026  11:25:59 -0300 (0:00:03.290)       0:00:13.688 *** 
2026-09-16T14:26:00.0208550Z 
2026-09-16T14:26:00.0209573Z TASK [nfs : Install networker lgtoclnt_url] ************************************
2026-09-16T14:26:00.0210174Z [WARNING]: Consider using the yum, dnf or zypper module rather than running
2026-09-16T14:26:00.0211476Z 'rpm'.  If you need to use command because yum, dnf or zypper is insufficient
2026-09-16T14:26:00.0211857Z you can add 'warn: false' to this command task or set 'command_warnings=False'
2026-09-16T14:26:00.0212075Z in ansible.cfg to get rid of this message.
2026-09-16T14:26:00.0213639Z fatal: [caddeapllx2798.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.489745", "end": "2026-09-16 11:26:00.004592", "msg": "non-zero return code", "rc": 1, "start": "2026-09-16 11:25:59.514847", "stderr": "aviso: /var/tmp/rpm-tmp.UnQgN9: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.UnQgN9: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-09-16T14:26:00.0214707Z ...ignoring
2026-09-16T14:26:00.0249009Z Wednesday 16 September 2026  11:26:00 -0300 (0:00:00.738)       0:00:14.426 *** 
2026-09-16T14:26:00.7015392Z 
2026-09-16T14:26:00.7016018Z TASK [nfs : Install networker lgtonmda_url] ************************************
2026-09-16T14:26:00.7020809Z fatal: [caddeapllx2798.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.432089", "end": "2026-09-16 11:26:00.683454", "msg": "non-zero return code", "rc": 1, "start": "2026-09-16 11:26:00.251365", "stderr": "aviso: /var/tmp/rpm-tmp.XlzmOx: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.XlzmOx: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-09-16T14:26:00.7021826Z ...ignoring
2026-09-16T14:26:00.7059019Z Wednesday 16 September 2026  11:26:00 -0300 (0:00:00.680)       0:00:15.107 *** 
2026-09-16T14:26:01.1337230Z 
2026-09-16T14:26:01.1338098Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-09-16T14:26:01.1338280Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:26:01.1374994Z Wednesday 16 September 2026  11:26:01 -0300 (0:00:00.431)       0:00:15.538 *** 
2026-09-16T14:26:01.4104890Z 
2026-09-16T14:26:01.4105524Z TASK [nfs : Create a symbolic link] ********************************************
2026-09-16T14:26:01.4105699Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:26:01.4144955Z Wednesday 16 September 2026  11:26:01 -0300 (0:00:00.276)       0:00:15.815 *** 
2026-09-16T14:26:02.3512744Z 
2026-09-16T14:26:02.3513348Z TASK [nfs : Networker | Start networker] ***************************************
2026-09-16T14:26:02.3513515Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:26:02.3560906Z Wednesday 16 September 2026  11:26:02 -0300 (0:00:00.941)       0:00:16.757 *** 
2026-09-16T14:26:02.6067040Z 
2026-09-16T14:26:02.6068014Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-09-16T14:26:02.6068310Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:26:02.6102424Z Wednesday 16 September 2026  11:26:02 -0300 (0:00:00.254)       0:00:17.011 *** 
2026-09-16T14:26:13.0035131Z 
2026-09-16T14:26:13.0036199Z TASK [nfs : Networker | Restart networker] *************************************
2026-09-16T14:26:13.0036604Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:26:13.0071704Z Wednesday 16 September 2026  11:26:13 -0300 (0:00:10.396)       0:00:27.408 *** 
2026-09-16T14:26:13.4759259Z 
2026-09-16T14:26:13.4760238Z TASK [nfs : Montando volume remoto] ********************************************
2026-09-16T14:26:13.4760534Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:26:13.4794668Z Wednesday 16 September 2026  11:26:13 -0300 (0:00:00.472)       0:00:27.880 *** 
2026-09-16T14:26:13.5261724Z Wednesday 16 September 2026  11:26:13 -0300 (0:00:00.046)       0:00:27.927 *** 
2026-09-16T14:26:13.5849837Z 
2026-09-16T14:26:13.5850452Z TASK [nfs : Parse JSON data] ***************************************************
2026-09-16T14:26:13.5850631Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:26:13.5882813Z Wednesday 16 September 2026  11:26:13 -0300 (0:00:00.062)       0:00:27.989 *** 
2026-09-16T14:26:13.6503889Z 
2026-09-16T14:26:13.6504922Z TASK [nfs : debug] *************************************************************
2026-09-16T14:26:13.6505732Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:26:13.6505915Z     "msg": {
2026-09-16T14:26:13.6506105Z         "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF", 
2026-09-16T14:26:13.6506304Z         "NFS_MOUNT_POINT": "/SIIFX_SIISF"
2026-09-16T14:26:13.6506944Z     }
2026-09-16T14:26:13.6507091Z }
2026-09-16T14:26:13.6542275Z Wednesday 16 September 2026  11:26:13 -0300 (0:00:00.065)       0:00:28.055 *** 
2026-09-16T14:26:13.7115964Z 
2026-09-16T14:26:13.7116703Z TASK [nfs : debug] *************************************************************
2026-09-16T14:26:13.7116882Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:26:13.7117019Z     "msg": "/SIIFX_SIISF"
2026-09-16T14:26:13.7117144Z }
2026-09-16T14:26:13.7150794Z Wednesday 16 September 2026  11:26:13 -0300 (0:00:00.061)       0:00:28.116 *** 
2026-09-16T14:26:13.7715743Z 
2026-09-16T14:26:13.7716375Z TASK [nfs : debug] *************************************************************
2026-09-16T14:26:13.7716685Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:26:13.7716855Z     "msg": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF"
2026-09-16T14:26:13.7716989Z }
2026-09-16T14:26:13.7750534Z Wednesday 16 September 2026  11:26:13 -0300 (0:00:00.060)       0:00:28.176 *** 
2026-09-16T14:26:13.8348327Z 
2026-09-16T14:26:13.8349015Z TASK [nfs : Verificando as variaveis] ******************************************
2026-09-16T14:26:13.8349548Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:26:13.8349728Z     "changed": false, 
2026-09-16T14:26:13.8349853Z     "msg": "All assertions passed"
2026-09-16T14:26:13.8349963Z }
2026-09-16T14:26:13.8390118Z Wednesday 16 September 2026  11:26:13 -0300 (0:00:00.063)       0:00:28.240 *** 
2026-09-16T14:26:16.3042504Z 
2026-09-16T14:26:16.3043297Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-09-16T14:26:16.3043470Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:26:16.3081045Z Wednesday 16 September 2026  11:26:16 -0300 (0:00:02.469)       0:00:30.709 *** 
2026-09-16T14:26:17.0210077Z 
2026-09-16T14:26:17.0210687Z TASK [nfs : Install networker lgtoclnt_url] ************************************
2026-09-16T14:26:17.0212237Z fatal: [caddeapllx2798.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.473407", "end": "2026-09-16 11:26:17.003508", "msg": "non-zero return code", "rc": 1, "start": "2026-09-16 11:26:16.530101", "stderr": "aviso: /var/tmp/rpm-tmp.2QfgMt: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.2QfgMt: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-09-16T14:26:17.0242297Z ...ignoring
2026-09-16T14:26:17.0242555Z Wednesday 16 September 2026  11:26:17 -0300 (0:00:00.716)       0:00:31.425 *** 
2026-09-16T14:26:17.7141967Z 
2026-09-16T14:26:17.7142818Z TASK [nfs : Install networker lgtonmda_url] ************************************
2026-09-16T14:26:17.7148490Z fatal: [caddeapllx2798.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.448428", "end": "2026-09-16 11:26:17.698381", "msg": "non-zero return code", "rc": 1, "start": "2026-09-16 11:26:17.249953", "stderr": "aviso: /var/tmp/rpm-tmp.QPUQUu: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.QPUQUu: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-09-16T14:26:17.7149519Z ...ignoring
2026-09-16T14:26:17.7186167Z Wednesday 16 September 2026  11:26:17 -0300 (0:00:00.694)       0:00:32.120 *** 
2026-09-16T14:26:17.9607873Z 
2026-09-16T14:26:17.9608879Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-09-16T14:26:17.9609150Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:26:17.9651531Z Wednesday 16 September 2026  11:26:17 -0300 (0:00:00.246)       0:00:32.366 *** 
2026-09-16T14:26:18.2097618Z 
2026-09-16T14:26:18.2098273Z TASK [nfs : Create a symbolic link] ********************************************
2026-09-16T14:26:18.2098786Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:26:18.2128967Z Wednesday 16 September 2026  11:26:18 -0300 (0:00:00.247)       0:00:32.614 *** 
2026-09-16T14:26:18.8276257Z 
2026-09-16T14:26:18.8277721Z TASK [nfs : Networker | Start networker] ***************************************
2026-09-16T14:26:18.8278416Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:26:18.8323961Z Wednesday 16 September 2026  11:26:18 -0300 (0:00:00.619)       0:00:33.233 *** 
2026-09-16T14:26:19.0841757Z 
2026-09-16T14:26:19.0842637Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-09-16T14:26:19.0843154Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:26:19.0891869Z Wednesday 16 September 2026  11:26:19 -0300 (0:00:00.256)       0:00:33.490 *** 
2026-09-16T14:26:29.4932614Z 
2026-09-16T14:26:29.4933940Z TASK [nfs : Networker | Restart networker] *************************************
2026-09-16T14:26:29.4934696Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:26:29.4969580Z Wednesday 16 September 2026  11:26:29 -0300 (0:00:10.407)       0:00:43.898 *** 
2026-09-16T14:26:29.7804400Z 
2026-09-16T14:26:29.7805334Z TASK [nfs : Montando volume remoto] ********************************************
2026-09-16T14:26:29.7805842Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:26:29.7839593Z Wednesday 16 September 2026  11:26:29 -0300 (0:00:00.286)       0:00:44.185 *** 
2026-09-16T14:26:29.8303903Z Wednesday 16 September 2026  11:26:29 -0300 (0:00:00.046)       0:00:44.231 *** 
2026-09-16T14:26:29.8936937Z 
2026-09-16T14:26:29.8938276Z TASK [nfs : Parse JSON data] ***************************************************
2026-09-16T14:26:29.8938498Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:26:29.8972877Z Wednesday 16 September 2026  11:26:29 -0300 (0:00:00.067)       0:00:44.298 *** 
2026-09-16T14:26:29.9556065Z 
2026-09-16T14:26:29.9556822Z TASK [nfs : debug] *************************************************************
2026-09-16T14:26:29.9557033Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:26:29.9557269Z     "msg": {
2026-09-16T14:26:29.9558914Z         "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX", 
2026-09-16T14:26:29.9560991Z         "NFS_MOUNT_POINT": "/SIIFX_B2B"
2026-09-16T14:26:29.9561773Z     }
2026-09-16T14:26:29.9562015Z }
2026-09-16T14:26:29.9590044Z Wednesday 16 September 2026  11:26:29 -0300 (0:00:00.061)       0:00:44.360 *** 
2026-09-16T14:26:30.0165950Z 
2026-09-16T14:26:30.0167064Z TASK [nfs : debug] *************************************************************
2026-09-16T14:26:30.0167727Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:26:30.0168032Z     "msg": "/SIIFX_B2B"
2026-09-16T14:26:30.0168565Z }
2026-09-16T14:26:30.0200861Z Wednesday 16 September 2026  11:26:30 -0300 (0:00:00.061)       0:00:44.421 *** 
2026-09-16T14:26:30.0772977Z 
2026-09-16T14:26:30.0774008Z TASK [nfs : debug] *************************************************************
2026-09-16T14:26:30.0774531Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:26:30.0774946Z     "msg": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX"
2026-09-16T14:26:30.0775179Z }
2026-09-16T14:26:30.0807101Z Wednesday 16 September 2026  11:26:30 -0300 (0:00:00.060)       0:00:44.482 *** 
2026-09-16T14:26:30.1405287Z 
2026-09-16T14:26:30.1405908Z TASK [nfs : Verificando as variaveis] ******************************************
2026-09-16T14:26:30.1406086Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:26:30.1406238Z     "changed": false, 
2026-09-16T14:26:30.1406362Z     "msg": "All assertions passed"
2026-09-16T14:26:30.1406601Z }
2026-09-16T14:26:30.1438324Z Wednesday 16 September 2026  11:26:30 -0300 (0:00:00.063)       0:00:44.545 *** 
2026-09-16T14:26:32.6665632Z 
2026-09-16T14:26:32.6666233Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-09-16T14:26:32.6667247Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:26:32.6701420Z Wednesday 16 September 2026  11:26:32 -0300 (0:00:02.526)       0:00:47.071 *** 
2026-09-16T14:26:33.3848653Z 
2026-09-16T14:26:33.3849369Z TASK [nfs : Install networker lgtoclnt_url] ************************************
2026-09-16T14:26:33.3854969Z fatal: [caddeapllx2798.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.471965", "end": "2026-09-16 11:26:33.369144", "msg": "non-zero return code", "rc": 1, "start": "2026-09-16 11:26:32.897179", "stderr": "aviso: /var/tmp/rpm-tmp.ZP5rWO: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.ZP5rWO: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-09-16T14:26:33.3855633Z ...ignoring
2026-09-16T14:26:33.3893932Z Wednesday 16 September 2026  11:26:33 -0300 (0:00:00.719)       0:00:47.790 *** 
2026-09-16T14:26:34.0717490Z 
2026-09-16T14:26:34.0718094Z TASK [nfs : Install networker lgtonmda_url] ************************************
2026-09-16T14:26:34.0723093Z fatal: [caddeapllx2798.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.424592", "end": "2026-09-16 11:26:34.055679", "msg": "non-zero return code", "rc": 1, "start": "2026-09-16 11:26:33.631087", "stderr": "aviso: /var/tmp/rpm-tmp.45oAKP: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.45oAKP: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-09-16T14:26:34.0724095Z ...ignoring
2026-09-16T14:26:34.0775232Z Wednesday 16 September 2026  11:26:34 -0300 (0:00:00.687)       0:00:48.478 *** 
2026-09-16T14:26:34.3194630Z 
2026-09-16T14:26:34.3195459Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-09-16T14:26:34.3195637Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:26:34.3241589Z Wednesday 16 September 2026  11:26:34 -0300 (0:00:00.246)       0:00:48.725 *** 
2026-09-16T14:26:34.5799647Z 
2026-09-16T14:26:34.5800359Z TASK [nfs : Create a symbolic link] ********************************************
2026-09-16T14:26:34.5800648Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:26:34.5835674Z Wednesday 16 September 2026  11:26:34 -0300 (0:00:00.259)       0:00:48.984 *** 
2026-09-16T14:26:35.1927187Z 
2026-09-16T14:26:35.1927938Z TASK [nfs : Networker | Start networker] ***************************************
2026-09-16T14:26:35.1928167Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:26:35.1964144Z Wednesday 16 September 2026  11:26:35 -0300 (0:00:00.612)       0:00:49.597 *** 
2026-09-16T14:26:35.4594805Z 
2026-09-16T14:26:35.4595875Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-09-16T14:26:35.4596390Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:26:35.4634953Z Wednesday 16 September 2026  11:26:35 -0300 (0:00:00.266)       0:00:49.864 *** 
2026-09-16T14:26:45.8560184Z 
2026-09-16T14:26:45.8561041Z TASK [nfs : Networker | Restart networker] *************************************
2026-09-16T14:26:45.8561553Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:26:45.8592682Z Wednesday 16 September 2026  11:26:45 -0300 (0:00:10.395)       0:01:00.260 *** 
2026-09-16T14:26:46.1289594Z 
2026-09-16T14:26:46.1290585Z TASK [nfs : Montando volume remoto] ********************************************
2026-09-16T14:26:46.1291094Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:26:46.1323942Z Wednesday 16 September 2026  11:26:46 -0300 (0:00:00.273)       0:01:00.533 *** 
2026-09-16T14:26:46.1778226Z Wednesday 16 September 2026  11:26:46 -0300 (0:00:00.045)       0:01:00.578 *** 
2026-09-16T14:26:46.2361857Z 
2026-09-16T14:26:46.2362894Z TASK [nfs : Parse JSON data] ***************************************************
2026-09-16T14:26:46.2363831Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:26:46.2401046Z Wednesday 16 September 2026  11:26:46 -0300 (0:00:00.062)       0:01:00.641 *** 
2026-09-16T14:26:46.2989158Z 
2026-09-16T14:26:46.2990096Z TASK [nfs : debug] *************************************************************
2026-09-16T14:26:46.2990509Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:26:46.2990796Z     "msg": {
2026-09-16T14:26:46.2991134Z         "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA", 
2026-09-16T14:26:46.2991437Z         "NFS_MOUNT_POINT": "/SIIFX_SIGMS"
2026-09-16T14:26:46.2991694Z     }
2026-09-16T14:26:46.2992056Z }
2026-09-16T14:26:46.3025050Z Wednesday 16 September 2026  11:26:46 -0300 (0:00:00.062)       0:01:00.703 *** 
2026-09-16T14:26:46.3604522Z 
2026-09-16T14:26:46.3605126Z TASK [nfs : debug] *************************************************************
2026-09-16T14:26:46.3605308Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:26:46.3605448Z     "msg": "/SIIFX_SIGMS"
2026-09-16T14:26:46.3606023Z }
2026-09-16T14:26:46.3644633Z Wednesday 16 September 2026  11:26:46 -0300 (0:00:00.061)       0:01:00.765 *** 
2026-09-16T14:26:46.4229924Z 
2026-09-16T14:26:46.4230562Z TASK [nfs : debug] *************************************************************
2026-09-16T14:26:46.4230744Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:26:46.4230914Z     "msg": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA"
2026-09-16T14:26:46.4231069Z }
2026-09-16T14:26:46.4264287Z Wednesday 16 September 2026  11:26:46 -0300 (0:00:00.062)       0:01:00.827 *** 
2026-09-16T14:26:46.4858475Z 
2026-09-16T14:26:46.4859055Z TASK [nfs : Verificando as variaveis] ******************************************
2026-09-16T14:26:46.4859313Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:26:46.4859457Z     "changed": false, 
2026-09-16T14:26:46.4859584Z     "msg": "All assertions passed"
2026-09-16T14:26:46.4859929Z }
2026-09-16T14:26:46.4891881Z Wednesday 16 September 2026  11:26:46 -0300 (0:00:00.062)       0:01:00.890 *** 
2026-09-16T14:26:49.0222256Z 
2026-09-16T14:26:49.0223249Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-09-16T14:26:49.0223815Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:26:49.0232889Z Wednesday 16 September 2026  11:26:49 -0300 (0:00:02.534)       0:01:03.424 *** 
2026-09-16T14:26:49.7494494Z 
2026-09-16T14:26:49.7495686Z TASK [nfs : Install networker lgtoclnt_url] ************************************
2026-09-16T14:26:49.7518998Z fatal: [caddeapllx2798.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.478789", "end": "2026-09-16 11:26:49.732935", "msg": "non-zero return code", "rc": 1, "start": "2026-09-16 11:26:49.254146", "stderr": "aviso: /var/tmp/rpm-tmp.nMtIrt: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.nMtIrt: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-09-16T14:26:49.7520196Z ...ignoring
2026-09-16T14:26:49.7540565Z Wednesday 16 September 2026  11:26:49 -0300 (0:00:00.730)       0:01:04.155 *** 
2026-09-16T14:26:50.4670939Z 
2026-09-16T14:26:50.4671879Z TASK [nfs : Install networker lgtonmda_url] ************************************
2026-09-16T14:26:50.4675586Z fatal: [caddeapllx2798.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.470910", "end": "2026-09-16 11:26:50.450957", "msg": "non-zero return code", "rc": 1, "start": "2026-09-16 11:26:49.980047", "stderr": "aviso: /var/tmp/rpm-tmp.rFHm3m: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.rFHm3m: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-09-16T14:26:50.4676919Z ...ignoring
2026-09-16T14:26:50.4717644Z Wednesday 16 September 2026  11:26:50 -0300 (0:00:00.717)       0:01:04.873 *** 
2026-09-16T14:26:50.7163558Z 
2026-09-16T14:26:50.7165012Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-09-16T14:26:50.7165406Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:26:50.7220950Z Wednesday 16 September 2026  11:26:50 -0300 (0:00:00.249)       0:01:05.122 *** 
2026-09-16T14:26:50.9949763Z 
2026-09-16T14:26:50.9950360Z TASK [nfs : Create a symbolic link] ********************************************
2026-09-16T14:26:50.9950574Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:26:50.9984414Z Wednesday 16 September 2026  11:26:50 -0300 (0:00:00.277)       0:01:05.399 *** 
2026-09-16T14:26:51.7059951Z 
2026-09-16T14:26:51.7060573Z TASK [nfs : Networker | Start networker] ***************************************
2026-09-16T14:26:51.7060883Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:26:51.7108572Z Wednesday 16 September 2026  11:26:51 -0300 (0:00:00.712)       0:01:06.112 *** 
2026-09-16T14:26:51.9630390Z 
2026-09-16T14:26:51.9630994Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-09-16T14:26:51.9631311Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:26:51.9660054Z Wednesday 16 September 2026  11:26:51 -0300 (0:00:00.254)       0:01:06.367 *** 
2026-09-16T14:27:02.3886864Z 
2026-09-16T14:27:02.3888552Z TASK [nfs : Networker | Restart networker] *************************************
2026-09-16T14:27:02.3889164Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:27:02.3929502Z Wednesday 16 September 2026  11:27:02 -0300 (0:00:10.427)       0:01:16.794 *** 
2026-09-16T14:27:02.6819696Z 
2026-09-16T14:27:02.6820370Z TASK [nfs : Montando volume remoto] ********************************************
2026-09-16T14:27:02.6820581Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:27:02.6873448Z Wednesday 16 September 2026  11:27:02 -0300 (0:00:00.294)       0:01:17.088 *** 
2026-09-16T14:27:02.7367187Z 
2026-09-16T14:27:02.7367777Z PLAY [jboss] *******************************************************************
2026-09-16T14:27:02.7395349Z 
2026-09-16T14:27:02.7396064Z PLAY [Copiando deployments adicionais] *****************************************
2026-09-16T14:27:02.7426327Z 
2026-09-16T14:27:02.7426826Z PLAY [Copiando modules adicionais] *********************************************
2026-09-16T14:27:02.7451427Z 
2026-09-16T14:27:02.7451645Z PLAY [jboss] *******************************************************************
2026-09-16T14:27:02.7491431Z 
2026-09-16T14:27:02.7491793Z PLAY [jboss] *******************************************************************
2026-09-16T14:27:02.7521207Z 
2026-09-16T14:27:02.7521429Z PLAY [jboss] *******************************************************************
2026-09-16T14:27:02.7556243Z 
2026-09-16T14:27:02.7556583Z PLAY [jboss] *******************************************************************
2026-09-16T14:27:02.7585429Z 
2026-09-16T14:27:02.7585671Z PLAY [jboss] *******************************************************************
2026-09-16T14:27:02.7612396Z 
2026-09-16T14:27:02.7612733Z PLAY [local] *******************************************************************
2026-09-16T14:27:02.7641174Z [WARNING]: Could not match supplied host pattern, ignoring: instance_restart
2026-09-16T14:27:02.7643786Z 
2026-09-16T14:27:02.7644077Z PLAY [instance_restart] ********************************************************
2026-09-16T14:27:02.7644261Z skipping: no hosts matched
2026-09-16T14:27:02.7647637Z [WARNING]: Could not match supplied host pattern, ignoring: machine_reboot
2026-09-16T14:27:02.7650028Z 
2026-09-16T14:27:02.7650384Z PLAY [machine_reboot] **********************************************************
2026-09-16T14:27:02.7650554Z skipping: no hosts matched
2026-09-16T14:27:02.7657583Z 
2026-09-16T14:27:02.7657743Z PLAY [local] *******************************************************************
2026-09-16T14:27:02.7684480Z [WARNING]: Could not match supplied host pattern, ignoring: instance_stop
2026-09-16T14:27:02.7687719Z 
2026-09-16T14:27:02.7687920Z PLAY [instance_stop] ***********************************************************
2026-09-16T14:27:02.7688083Z skipping: no hosts matched
2026-09-16T14:27:02.7691628Z 
2026-09-16T14:27:02.7692195Z PLAY [machine_reboot] **********************************************************
2026-09-16T14:27:02.7692511Z skipping: no hosts matched
2026-09-16T14:27:02.7698110Z 
2026-09-16T14:27:02.7698544Z PLAY [local] *******************************************************************
2026-09-16T14:27:02.7731674Z [WARNING]: Could not match supplied host pattern, ignoring: escopo_execucao
2026-09-16T14:27:02.7734753Z 
2026-09-16T14:27:02.7735152Z PLAY [Executar o Start do Sirot Connector no escopo definido] ******************
2026-09-16T14:27:02.7735477Z skipping: no hosts matched
2026-09-16T14:27:02.7741695Z 
2026-09-16T14:27:02.7742098Z PLAY [local] *******************************************************************
2026-09-16T14:27:02.7764286Z 
2026-09-16T14:27:02.7764813Z PLAY [Executar o Stop do Sirot Connector] **************************************
2026-09-16T14:27:02.7765069Z skipping: no hosts matched
2026-09-16T14:27:02.7773754Z 
2026-09-16T14:27:02.7774174Z PLAY [Configura TSM] ***********************************************************
2026-09-16T14:27:02.7801924Z 
2026-09-16T14:27:02.7802676Z PLAY [jboss] *******************************************************************
2026-09-16T14:27:02.7843664Z Wednesday 16 September 2026  11:27:02 -0300 (0:00:00.097)       0:01:17.185 *** 
2026-09-16T14:27:02.8450722Z 
2026-09-16T14:27:02.8451930Z TASK [Cria variável build_repository_name] *************************************
2026-09-16T14:27:02.8452540Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:27:02.8479490Z Wednesday 16 September 2026  11:27:02 -0300 (0:00:00.063)       0:01:17.249 *** 
2026-09-16T14:27:02.9077213Z 
2026-09-16T14:27:02.9077854Z TASK [Buscando diretorio de config] ********************************************
2026-09-16T14:27:02.9078036Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:27:02.9193550Z Wednesday 16 September 2026  11:27:02 -0300 (0:00:00.071)       0:01:17.320 *** 
2026-09-16T14:27:03.3219921Z 
2026-09-16T14:27:03.3220708Z TASK [Verifica se o arquivo {{ item }}/etc/hosts-{{ sistema_ambiente }} existe] ***
2026-09-16T14:27:03.3221001Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r13215/a/_SIIFX-batch-config)
2026-09-16T14:27:03.6354025Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r13215/a/_SIIFX-batch-config/so)
2026-09-16T14:27:03.6384777Z Wednesday 16 September 2026  11:27:03 -0300 (0:00:00.719)       0:01:18.039 *** 
2026-09-16T14:27:04.0720543Z 
2026-09-16T14:27:04.0721297Z TASK [Altera arquivo /etc/hosts] ***********************************************
2026-09-16T14:27:04.0722975Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => (item={u'item': u'/opt/ads-agent/_work/r13215/a/_SIIFX-batch-config', u'stat': {u'charset': u'us-ascii', u'uid': 1000, u'exists': True, u'attr_flags': u'', u'woth': False, u'device_type': 0, u'mtime': 1789568052.2861485, u'block_size': 4096, u'inode': 343951365, u'isgid': False, u'size': 175, u'wgrp': False, u'executable': False, u'isuid': False, u'readable': True, u'isreg': True, u'version': u'839559688', u'pw_name': u'sadscp01', u'gid': 1000, u'ischr': False, u'wusr': True, u'writeable': True, u'mimetype': u'text/plain', u'blocks': 8, u'xoth': False, u'islnk': False, u'nlink': 1, u'issock': False, u'rgrp': True, u'gr_name': u'sadscp01', u'path': u'/opt/ads-agent/_work/r13215/a/_SIIFX-batch-config/etc/hosts-des', u'xusr': False, u'atime': 1789568052.3101485, u'isdir': False, u'ctime': 1789568052.2861485, u'isblk': False, u'checksum': u'b189d1cdee317ad9f292a99c63b64d9c07bc0b06', u'dev': 64771, u'roth': True, u'isfifo': False, u'mode': u'0644', u'xgrp': False, u'rusr': True, u'attributes': []}, u'ansible_loop_var': u'item', u'failed': False, u'invocation': {u'module_args': {u'follow': False, u'get_checksum': True, u'path': u'/opt/ads-agent/_work/r13215/a/_SIIFX-batch-config/etc/hosts-des', u'checksum_algorithm': u'sha1', u'get_md5': False, u'get_mime': True, u'get_attributes': True}}, u'changed': False})
2026-09-16T14:27:04.0835992Z 
2026-09-16T14:27:04.0836784Z PLAY [Configura Control-M] *****************************************************
2026-09-16T14:27:04.0895457Z Wednesday 16 September 2026  11:27:04 -0300 (0:00:00.451)       0:01:18.490 *** 
2026-09-16T14:27:04.7070364Z 
2026-09-16T14:27:04.7071705Z TASK [Gathering Facts] *********************************************************
2026-09-16T14:27:04.7071935Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:27:04.7275332Z Wednesday 16 September 2026  11:27:04 -0300 (0:00:00.637)       0:01:19.128 *** 
2026-09-16T14:27:04.9721581Z 
2026-09-16T14:27:04.9722481Z TASK [stat] ********************************************************************
2026-09-16T14:27:04.9723135Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:27:04.9892786Z Wednesday 16 September 2026  11:27:04 -0300 (0:00:00.261)       0:01:19.390 *** 
2026-09-16T14:27:05.0522712Z 
2026-09-16T14:27:05.0523328Z TASK [assert] ******************************************************************
2026-09-16T14:27:05.0523507Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br] => {
2026-09-16T14:27:05.0523661Z     "changed": false, 
2026-09-16T14:27:05.0523789Z     "msg": "All assertions passed"
2026-09-16T14:27:05.0525076Z }
2026-09-16T14:27:05.0684018Z Wednesday 16 September 2026  11:27:05 -0300 (0:00:00.078)       0:01:19.469 *** 
2026-09-16T14:27:05.1497593Z 
2026-09-16T14:27:05.1499150Z TASK [control_m : Cria variável ansible] ***************************************
2026-09-16T14:27:05.1499344Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:27:05.1729333Z Wednesday 16 September 2026  11:27:05 -0300 (0:00:00.104)       0:01:19.574 *** 
2026-09-16T14:27:05.9639422Z 
2026-09-16T14:27:05.9640062Z TASK [control_m : Copiando arquivo de certificado] *****************************
2026-09-16T14:27:05.9640251Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:27:05.9791150Z Wednesday 16 September 2026  11:27:05 -0300 (0:00:00.806)       0:01:20.380 *** 
2026-09-16T14:27:06.2292564Z 
2026-09-16T14:27:06.2294104Z TASK [control_m : Executando add-user.sh] **************************************
2026-09-16T14:27:06.2294411Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:27:06.2458510Z Wednesday 16 September 2026  11:27:06 -0300 (0:00:00.266)       0:01:20.647 *** 
2026-09-16T14:27:06.6795665Z 
2026-09-16T14:27:06.6796928Z TASK [control_m : Removendo add-user.sh] ***************************************
2026-09-16T14:27:06.6797163Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:27:06.6963621Z Wednesday 16 September 2026  11:27:06 -0300 (0:00:00.450)       0:01:21.097 *** 
2026-09-16T14:27:06.9463744Z 
2026-09-16T14:27:06.9464826Z TASK [control_m : Criacao diretorio /producao/carga] ***************************
2026-09-16T14:27:06.9465041Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:27:06.9644089Z Wednesday 16 September 2026  11:27:06 -0300 (0:00:00.268)       0:01:21.365 *** 
2026-09-16T14:27:07.2136960Z 
2026-09-16T14:27:07.2138104Z TASK [control_m : Criacao diretorio /producao/suporte] *************************
2026-09-16T14:27:07.2138319Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:27:07.2327798Z Wednesday 16 September 2026  11:27:07 -0300 (0:00:00.268)       0:01:21.633 *** 
2026-09-16T14:27:07.8015263Z 
2026-09-16T14:27:07.8016198Z TASK [control_m : Garante bash_profile] ****************************************
2026-09-16T14:27:07.8016981Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:27:07.8192077Z Wednesday 16 September 2026  11:27:07 -0300 (0:00:00.586)       0:01:22.220 *** 
2026-09-16T14:27:08.0710808Z 
2026-09-16T14:27:08.0711769Z TASK [control_m : Cria Diretório de Scripts] ***********************************
2026-09-16T14:27:08.0711959Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:27:08.0884470Z Wednesday 16 September 2026  11:27:08 -0300 (0:00:00.269)       0:01:22.489 *** 
2026-09-16T14:27:59.7494536Z 
2026-09-16T14:27:59.7498569Z TASK [control_m : Copia Scripts] ***********************************************
2026-09-16T14:27:59.7498978Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:27:59.7666404Z Wednesday 16 September 2026  11:27:59 -0300 (0:00:51.678)       0:02:14.167 *** 
2026-09-16T14:28:00.0246384Z 
2026-09-16T14:28:00.0247722Z TASK [control_m : Verifica se o arquivo /producao//configuration/custom.sh existe] ***
2026-09-16T14:28:00.0248038Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:28:00.0422388Z Wednesday 16 September 2026  11:28:00 -0300 (0:00:00.275)       0:02:14.443 *** 
2026-09-16T14:28:00.3273728Z 
2026-09-16T14:28:00.3274446Z TASK [control_m : Executa shell customizada] ***********************************
2026-09-16T14:28:00.3440744Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:28:00.3441380Z Wednesday 16 September 2026  11:28:00 -0300 (0:00:00.301)       0:02:14.745 *** 
2026-09-16T14:28:00.9018558Z 
2026-09-16T14:28:00.9019681Z TASK [control_m : Configuração Control-M] **************************************
2026-09-16T14:28:00.9019883Z ok: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:28:00.9206412Z Wednesday 16 September 2026  11:28:00 -0300 (0:00:00.576)       0:02:15.321 *** 
2026-09-16T14:28:07.0117308Z 
2026-09-16T14:28:07.0118285Z TASK [control_m : Restart ControlM] ********************************************
2026-09-16T14:28:07.0118945Z changed: [caddeapllx2798.agil.nprd.caixa.gov.br]
2026-09-16T14:28:07.0158322Z 
2026-09-16T14:28:07.0158586Z PLAY [jboss] *******************************************************************
2026-09-16T14:28:07.0207093Z 
2026-09-16T14:28:07.0207366Z PLAY [jboss] *******************************************************************
2026-09-16T14:28:07.0251816Z 
2026-09-16T14:28:07.0252082Z PLAY [jboss] *******************************************************************
2026-09-16T14:28:07.0275536Z 
2026-09-16T14:28:07.0275808Z PLAY [jboss] *******************************************************************
2026-09-16T14:28:07.0310469Z 
2026-09-16T14:28:07.0310856Z PLAY [localhost] ***************************************************************
2026-09-16T14:28:07.0336124Z 
2026-09-16T14:28:07.0336360Z PLAY [jboss] *******************************************************************
2026-09-16T14:28:07.0383423Z 
2026-09-16T14:28:07.0383674Z PLAY [jboss] *******************************************************************
2026-09-16T14:28:07.0426371Z 
2026-09-16T14:28:07.0426706Z PLAY [jboss] *******************************************************************
2026-09-16T14:28:07.0460146Z 
2026-09-16T14:28:07.0460342Z PLAY RECAP *********************************************************************
2026-09-16T14:28:07.0460640Z caddeapllx2798.agil.nprd.caixa.gov.br : ok=92   changed=31   unreachable=0    failed=0    skipped=4    rescued=0    ignored=8   
2026-09-16T14:28:07.0460788Z 
2026-09-16T14:28:07.0462002Z Wednesday 16 September 2026  11:28:07 -0300 (0:00:06.125)       0:02:21.447 *** 
2026-09-16T14:28:07.0462364Z =============================================================================== 
2026-09-16T14:28:07.0467298Z control_m : Copia Scripts ---------------------------------------------- 51.68s
2026-09-16T14:28:07.0467628Z nfs : Networker | Restart networker ------------------------------------ 10.43s
2026-09-16T14:28:07.0467939Z nfs : Networker | Restart networker ------------------------------------ 10.41s
2026-09-16T14:28:07.0468250Z nfs : Networker | Restart networker ------------------------------------ 10.40s
2026-09-16T14:28:07.0471938Z nfs : Networker | Restart networker ------------------------------------ 10.40s
2026-09-16T14:28:07.0472370Z nfs : execute montagem script ------------------------------------------- 7.62s
2026-09-16T14:28:07.0473775Z control_m : Restart ControlM -------------------------------------------- 6.13s
2026-09-16T14:28:07.0474256Z nfs : Instalando o NFS Client ------------------------------------------- 3.29s
2026-09-16T14:28:07.0474625Z nfs : Instalando o NFS Client ------------------------------------------- 2.53s
2026-09-16T14:28:07.0474974Z nfs : Instalando o NFS Client ------------------------------------------- 2.53s
2026-09-16T14:28:07.0475323Z nfs : Instalando o NFS Client ------------------------------------------- 2.47s
2026-09-16T14:28:07.0475650Z nfs : Networker | Start networker --------------------------------------- 0.94s
2026-09-16T14:28:07.0477191Z control_m : Copiando arquivo de certificado ----------------------------- 0.81s
2026-09-16T14:28:07.0477436Z nfs : Install networker lgtoclnt_url ------------------------------------ 0.74s
2026-09-16T14:28:07.0477670Z nfs : Install networker lgtoclnt_url ------------------------------------ 0.73s
2026-09-16T14:28:07.0477903Z nfs : Install networker lgtoclnt_url ------------------------------------ 0.72s
2026-09-16T14:28:07.0478135Z Verifica se o arquivo {{ item }}/etc/hosts-{{ sistema_ambiente }} existe --- 0.72s
2026-09-16T14:28:07.0478373Z nfs : Install networker lgtonmda_url ------------------------------------ 0.72s
2026-09-16T14:28:07.0478752Z nfs : Install networker lgtoclnt_url ------------------------------------ 0.72s
2026-09-16T14:28:07.0478980Z nfs : Networker | Start networker --------------------------------------- 0.71s
2026-09-16T14:28:07.0479139Z Playbook run took 0 days, 0 hours, 2 minutes, 21 seconds
2026-09-16T14:28:07.1670281Z ##[section]Finishing: Configura Control-M
