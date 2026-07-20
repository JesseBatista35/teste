2026-07-20T18:10:50.9237683Z ##[debug]Evaluating condition for step: 'Deploy Config no JBOSS'
2026-07-20T18:10:50.9238114Z ##[debug]Evaluating: succeeded()
2026-07-20T18:10:50.9238271Z ##[debug]Evaluating succeeded:
2026-07-20T18:10:50.9238530Z ##[debug]=> True
2026-07-20T18:10:50.9238700Z ##[debug]Result: True
2026-07-20T18:10:50.9238868Z ##[section]Starting: Deploy Config no JBOSS
2026-07-20T18:10:50.9241555Z ==============================================================================
2026-07-20T18:10:50.9241630Z Task         : Bash
2026-07-20T18:10:50.9241669Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-20T18:10:50.9241741Z Version      : 3.227.0
2026-07-20T18:10:50.9241784Z Author       : Microsoft Corporation
2026-07-20T18:10:50.9241837Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-20T18:10:50.9241996Z ==============================================================================
2026-07-20T18:10:51.6138234Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-07-20T18:10:51.6812938Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-07-20T18:10:51.6820538Z ##[debug]loading inputs and endpoints
2026-07-20T18:10:51.6823882Z ##[debug]loading INPUT_TARGETTYPE
2026-07-20T18:10:51.6832795Z ##[debug]loading INPUT_FILEPATH
2026-07-20T18:10:51.6833067Z ##[debug]loading INPUT_SCRIPT
2026-07-20T18:10:51.6833598Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-07-20T18:10:51.6834190Z ##[debug]loading INPUT_FAILONSTDERR
2026-07-20T18:10:51.6836231Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-07-20T18:10:51.6836686Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-07-20T18:10:51.6838119Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-07-20T18:10:51.6842845Z ##[debug]loading SECRET_PW_ISILON
2026-07-20T18:10:51.6844610Z ##[debug]loading SECRET_AZPAT
2026-07-20T18:10:51.6845902Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-07-20T18:10:51.6847282Z ##[debug]loading SECRET_TOKEN_INFRAFACIL_MUDANCA
2026-07-20T18:10:51.6848647Z ##[debug]loading SECRET_FORTIFY_PASS
2026-07-20T18:10:51.6849966Z ##[debug]loading SECRET_TERRAFORM_ESX_PASSWORD
2026-07-20T18:10:51.6850490Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-07-20T18:10:51.6851110Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-07-20T18:10:51.6851648Z ##[debug]loading SECRET_TOKEN_CRQ
2026-07-20T18:10:51.6852183Z ##[debug]loading SECRET_OKD_TOKEN_PRODUTOS
2026-07-20T18:10:51.6852824Z ##[debug]loading SECRET_PW_ALOCAIP
2026-07-20T18:10:51.6854007Z ##[debug]loading SECRET_ANSIBLE_VAULT
2026-07-20T18:10:51.6854570Z ##[debug]loading SECRET_ARM_ACCESS_KEY
2026-07-20T18:10:51.6855083Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-07-20T18:10:51.6856217Z ##[debug]loaded 22
2026-07-20T18:10:51.6860720Z ##[debug]Agent.ProxyUrl=undefined
2026-07-20T18:10:51.6860946Z ##[debug]Agent.CAInfo=undefined
2026-07-20T18:10:51.6861174Z ##[debug]Agent.ClientCert=undefined
2026-07-20T18:10:51.6861407Z ##[debug]Agent.SkipCertValidation=True
2026-07-20T18:10:51.6874330Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-07-20T18:10:51.6876389Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-07-20T18:10:51.6876664Z ##[debug]system.culture=en-US
2026-07-20T18:10:51.6885084Z ##[debug]failOnStderr=false
2026-07-20T18:10:51.6885989Z ##[debug]workingDirectory=/opt/ads-agent/_work/r5319/a
2026-07-20T18:10:51.6886240Z ##[debug]check path : /opt/ads-agent/_work/r5319/a
2026-07-20T18:10:51.6886555Z ##[debug]targetType=inline
2026-07-20T18:10:51.6887250Z ##[debug]bashEnvValue=undefined
2026-07-20T18:10:51.6888263Z ##[debug]script=REPO=$(echo _SIEXC-web-aplicacao | sed 's/_//')
ansible-playbook /opt/ads-agent/_work/r5319/a/esteira-jboss-vm-v2/site.yml --tags git_conf -e sistema_ambiente=des -e sistema_nome=siexc-web-aplicacao -e default_working_directory_tfs=/opt/ads-agent/_work/r5319/a -e build_repository_name_tfs=$REPO -e quantidade_vm=$(quantidade_vm) -e package_path=/opt/ads-agent/_work/r5319/a/binario/`basename http://binario.caixa:8081/repository/thirdparty/br/com/caixa/siexc/siexc-web-aplicacao/1.1.10/siexc-web-aplicacao-1.1.10.ear` -e use_wmq=$(USE_WMQ) -e jks_file=/opt/ads-agent/_work/_temp/caixa-truststore-acteste-nprd.jks -e site=ctc_nprd -e url_deploy="`echo "http://binario.caixa:8081/repository/thirdparty/br/com/caixa/siexc/siexc-web-aplicacao/1.1.10/siexc-web-aplicacao-1.1.10.ear" | tr -d "\'"`"
2026-07-20T18:10:51.6897017Z Generating script.
2026-07-20T18:10:51.6898822Z ##[debug]which 'bash'
2026-07-20T18:10:51.6904432Z ##[debug]found: '/bin/bash'
2026-07-20T18:10:51.6904768Z ##[debug]Agent.Version=3.225.2
2026-07-20T18:10:51.6905591Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-07-20T18:10:51.6906111Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-07-20T18:10:51.6907490Z ========================== Starting Command Output ===========================
2026-07-20T18:10:51.6908580Z ##[debug]which '/bin/bash'
2026-07-20T18:10:51.6909320Z ##[debug]found: '/bin/bash'
2026-07-20T18:10:51.6910007Z ##[debug]/bin/bash arg: /opt/ads-agent/_work/_temp/efe8dd36-a1e9-4704-8fe0-d175da6b0930.sh
2026-07-20T18:10:51.6912429Z ##[debug]exec tool: /bin/bash
2026-07-20T18:10:51.6912783Z ##[debug]arguments:
2026-07-20T18:10:51.6913056Z ##[debug]   /opt/ads-agent/_work/_temp/efe8dd36-a1e9-4704-8fe0-d175da6b0930.sh
2026-07-20T18:10:51.6915564Z [command]/bin/bash /opt/ads-agent/_work/_temp/efe8dd36-a1e9-4704-8fe0-d175da6b0930.sh
2026-07-20T18:10:51.6986630Z /opt/ads-agent/_work/_temp/efe8dd36-a1e9-4704-8fe0-d175da6b0930.sh: line 2: quantidade_vm: comando não encontrado
2026-07-20T18:10:51.6996423Z /opt/ads-agent/_work/_temp/efe8dd36-a1e9-4704-8fe0-d175da6b0930.sh: line 2: USE_WMQ: comando não encontrado
2026-07-20T18:10:53.7618919Z 
2026-07-20T18:10:53.7619509Z PLAY [local] *******************************************************************
2026-07-20T18:10:53.7897834Z 
2026-07-20T18:10:53.7898517Z PLAY [Configurando o DNS] ******************************************************
2026-07-20T18:10:53.9725405Z 
2026-07-20T18:10:53.9726088Z PLAY [local] *******************************************************************
2026-07-20T18:10:53.9756893Z 
2026-07-20T18:10:53.9757797Z PLAY [Verificando serviços] ****************************************************
2026-07-20T18:10:53.9835861Z 
2026-07-20T18:10:53.9836373Z PLAY [Configuração LDAP] *******************************************************
2026-07-20T18:10:53.9863684Z [WARNING]: Found variable using reserved name: when
2026-07-20T18:10:53.9872095Z 
2026-07-20T18:10:53.9872720Z PLAY [jboss] *******************************************************************
2026-07-20T18:10:53.9961471Z 
2026-07-20T18:10:53.9962358Z PLAY [Stack Jboss] *************************************************************
2026-07-20T18:10:54.0233549Z Monday 20 July 2026  15:10:54 -0300 (0:00:00.326)       0:00:00.326 *********** 
2026-07-20T18:10:54.5329616Z 
2026-07-20T18:10:54.5330666Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-07-20T18:10:54.5334726Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-07-20T18:10:54.5334978Z caddeapllx2193.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-07-20T18:10:54.5335670Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-07-20T18:10:54.5335930Z releases. A future Ansible release will default to using the discovered 
2026-07-20T18:10:54.5336100Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-07-20T18:10:54.5336269Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-07-20T18:10:54.5336430Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-07-20T18:10:54.5336607Z setting deprecation_warnings=False in ansible.cfg.
2026-07-20T18:10:54.5336747Z ok: [caddeapllx2193.agil.nprd.caixa.gov.br]
2026-07-20T18:10:54.5369983Z 
2026-07-20T18:10:54.5370464Z PLAY [jboss] *******************************************************************
2026-07-20T18:10:54.5471810Z Monday 20 July 2026  15:10:54 -0300 (0:00:00.523)       0:00:00.850 *********** 
2026-07-20T18:10:54.8792801Z 
2026-07-20T18:10:54.8793374Z TASK [Verifica se o arquivo nfs_config.json existe] ****************************
2026-07-20T18:10:54.8819158Z ok: [caddeapllx2193.agil.nprd.caixa.gov.br]
2026-07-20T18:10:54.8819650Z Monday 20 July 2026  15:10:54 -0300 (0:00:00.335)       0:00:01.185 *********** 
2026-07-20T18:10:54.9284886Z included: /opt/ads-agent/_work/r5319/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for caddeapllx2193.agil.nprd.caixa.gov.br
2026-07-20T18:10:54.9333315Z Monday 20 July 2026  15:10:54 -0300 (0:00:00.051)       0:00:01.237 *********** 
2026-07-20T18:10:54.9894138Z 
2026-07-20T18:10:54.9896070Z TASK [nfs : Criar variáveis] ***************************************************
2026-07-20T18:10:54.9897304Z ok: [caddeapllx2193.agil.nprd.caixa.gov.br]
2026-07-20T18:10:54.9930914Z Monday 20 July 2026  15:10:54 -0300 (0:00:00.059)       0:00:01.297 *********** 
2026-07-20T18:10:55.4223180Z 
2026-07-20T18:10:55.4223906Z TASK [nfs : Coletar variáveis de ambiente] *************************************
2026-07-20T18:10:55.4224089Z ok: [caddeapllx2193.agil.nprd.caixa.gov.br]
2026-07-20T18:10:55.4251174Z Monday 20 July 2026  15:10:55 -0300 (0:00:00.431)       0:00:01.729 *********** 
2026-07-20T18:10:55.4795770Z 
2026-07-20T18:10:55.4796321Z TASK [nfs : Exibir resultado em JSON] ******************************************
2026-07-20T18:10:55.4796493Z ok: [caddeapllx2193.agil.nprd.caixa.gov.br] => {
2026-07-20T18:10:55.4796646Z     "nfs_vars_json": {
2026-07-20T18:10:55.4796780Z         "changed": false, 
2026-07-20T18:10:55.4797150Z         "cmd": "cat /opt/ads-agent/_work/r5319/a/nfs_config.json", 
2026-07-20T18:10:55.4797649Z         "delta": "0:00:00.003516", 
2026-07-20T18:10:55.4797824Z         "end": "2026-07-20 15:10:55.406733", 
2026-07-20T18:10:55.4798338Z         "failed": false, 
2026-07-20T18:10:55.4798448Z         "rc": 0, 
2026-07-20T18:10:55.4798699Z         "start": "2026-07-20 15:10:55.403217", 
2026-07-20T18:10:55.4798818Z         "stderr": "", 
2026-07-20T18:10:55.4798914Z         "stderr_lines": [], 
2026-07-20T18:10:55.4799479Z         "stdout": "[{\"NFS_ENDPOINT_VM\": \"10.116.88.160:/export/sigdb/sicql\",\"NFS_MOUNT_POINT_VM\": \"/opt/sigdb\"},{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC\",\"NFS_MOUNT_POINT_ISILON\": \"/integracoes/SIEXC\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC\",\"NFS_MOUNT_POINT_ISILON_3\": \"/integracoes/SIAPC\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_2\": \"/integracoes/SIISF\"},{\"NFS_ENDPOINT_VM_2\": \"10.116.88.160:/export/sigdb/sitec\",\"NFS_MOUNT_POINT_VM_2\": \"/opt/sigdb/sitec\"},{\"NFS_ENDPOINT_VM_3\": \"10.116.88.160:/export/sicql_bovespa\",\"NFS_MOUNT_POINT_VM_3\": \"/opt/jboss/bovespa\"},{\"NFS_ENDPOINT_VM_4\": \"10.116.88.160:/export/upload_prd\",\"NFS_MOUNT_POINT_VM_4\": \"/upload\"}]", 
2026-07-20T18:10:55.4800064Z         "stdout_lines": [
2026-07-20T18:10:55.4800611Z             "[{\"NFS_ENDPOINT_VM\": \"10.116.88.160:/export/sigdb/sicql\",\"NFS_MOUNT_POINT_VM\": \"/opt/sigdb\"},{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC\",\"NFS_MOUNT_POINT_ISILON\": \"/integracoes/SIEXC\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC\",\"NFS_MOUNT_POINT_ISILON_3\": \"/integracoes/SIAPC\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_2\": \"/integracoes/SIISF\"},{\"NFS_ENDPOINT_VM_2\": \"10.116.88.160:/export/sigdb/sitec\",\"NFS_MOUNT_POINT_VM_2\": \"/opt/sigdb/sitec\"},{\"NFS_ENDPOINT_VM_3\": \"10.116.88.160:/export/sicql_bovespa\",\"NFS_MOUNT_POINT_VM_3\": \"/opt/jboss/bovespa\"},{\"NFS_ENDPOINT_VM_4\": \"10.116.88.160:/export/upload_prd\",\"NFS_MOUNT_POINT_VM_4\": \"/upload\"}]"
2026-07-20T18:10:55.4801225Z         ]
2026-07-20T18:10:55.4801318Z     }
2026-07-20T18:10:55.4801406Z }
2026-07-20T18:10:55.4820523Z Monday 20 July 2026  15:10:55 -0300 (0:00:00.056)       0:00:01.786 *********** 
2026-07-20T18:10:55.5393803Z 
2026-07-20T18:10:55.5394559Z TASK [nfs : Criar variáveis] ***************************************************
2026-07-20T18:10:55.5394725Z ok: [caddeapllx2193.agil.nprd.caixa.gov.br]
2026-07-20T18:10:55.5441332Z Monday 20 July 2026  15:10:55 -0300 (0:00:00.061)       0:00:01.848 *********** 
2026-07-20T18:11:01.0622928Z 
2026-07-20T18:11:01.0623452Z TASK [nfs : execute montagem script] *******************************************
2026-07-20T18:11:01.0623640Z changed: [caddeapllx2193.agil.nprd.caixa.gov.br]
2026-07-20T18:11:01.0643942Z Monday 20 July 2026  15:11:01 -0300 (0:00:05.520)       0:00:07.368 *********** 
2026-07-20T18:11:01.1221550Z 
2026-07-20T18:11:01.1222207Z TASK [nfs : ansible.builtin.debug] *********************************************
2026-07-20T18:11:01.1226132Z ok: [caddeapllx2193.agil.nprd.caixa.gov.br] => {
2026-07-20T18:11:01.1226527Z     "changed": false, 
2026-07-20T18:11:01.1226782Z     "msg": {
2026-07-20T18:11:01.1226908Z         "changed": true, 
2026-07-20T18:11:01.1227032Z         "cmd": [
2026-07-20T18:11:01.1227135Z             "python", 
2026-07-20T18:11:01.1227471Z             "/opt/ads-agent/_work/r5319/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py", 
2026-07-20T18:11:01.1227611Z             "montagem", 
2026-07-20T18:11:01.1227763Z             "siexc-web-aplicacao", 
2026-07-20T18:11:01.1227873Z             "des", 
2026-07-20T18:11:01.1227973Z             "ctc_nprd", 
2026-07-20T18:11:01.1228357Z             "/opt/ads-agent/_work/r5319/a/esteira-jboss-vm-v2", 
2026-07-20T18:11:01.1228769Z             "C&t@d02", 
2026-07-20T18:11:01.1228950Z             "***", 
2026-07-20T18:11:01.1229067Z             "s736651@corp.caixa.gov.br", 
2026-07-20T18:11:01.1229206Z             "***", 
2026-07-20T18:11:01.1229674Z             "[{\"NFS_ENDPOINT_VM\": \"10.116.88.160:/export/sigdb/sicql\",\"NFS_MOUNT_POINT_VM\": \"/opt/sigdb\"},{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC\",\"NFS_MOUNT_POINT_ISILON\": \"/integracoes/SIEXC\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC\",\"NFS_MOUNT_POINT_ISILON_3\": \"/integracoes/SIAPC\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_2\": \"/integracoes/SIISF\"},{\"NFS_ENDPOINT_VM_2\": \"10.116.88.160:/export/sigdb/sitec\",\"NFS_MOUNT_POINT_VM_2\": \"/opt/sigdb/sitec\"},{\"NFS_ENDPOINT_VM_3\": \"10.116.88.160:/export/sicql_bovespa\",\"NFS_MOUNT_POINT_VM_3\": \"/opt/jboss/bovespa\"},{\"NFS_ENDPOINT_VM_4\": \"10.116.88.160:/export/upload_prd\",\"NFS_MOUNT_POINT_VM_4\": \"/upload\"}]"
2026-07-20T18:11:01.1230125Z         ], 
2026-07-20T18:11:01.1230253Z         "delta": "0:00:05.188973", 
2026-07-20T18:11:01.1230420Z         "end": "2026-07-20 15:11:01.044999", 
2026-07-20T18:11:01.1230539Z         "failed": false, 
2026-07-20T18:11:01.1230637Z         "rc": 0, 
2026-07-20T18:11:01.1230798Z         "start": "2026-07-20 15:10:55.856026", 
2026-07-20T18:11:01.1230914Z         "stderr": "", 
2026-07-20T18:11:01.1231017Z         "stderr_lines": [], 
2026-07-20T18:11:01.1235775Z         "stdout": "[{u'NFS_MOUNT_POINT_VM': u'/opt/sigdb', u'NFS_ENDPOINT_VM': u'10.116.88.160:/export/sigdb/sicql'}, {u'NFS_MOUNT_POINT_ISILON': u'/integracoes/SIEXC', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC'}, {u'NFS_MOUNT_POINT_ISILON_3': u'/integracoes/SIAPC', u'NFS_ENDPOINT_ISILON_3': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC'}, {u'NFS_MOUNT_POINT_ISILON_2': u'/integracoes/SIISF', u'NFS_ENDPOINT_ISILON_2': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF'}, {u'NFS_ENDPOINT_VM_2': u'10.116.88.160:/export/sigdb/sitec', u'NFS_MOUNT_POINT_VM_2': u'/opt/sigdb/sitec'}, {u'NFS_ENDPOINT_VM_3': u'10.116.88.160:/export/sicql_bovespa', u'NFS_MOUNT_POINT_VM_3': u'/opt/jboss/bovespa'}, {u'NFS_MOUNT_POINT_VM_4': u'/upload', u'NFS_ENDPOINT_VM_4': u'10.116.88.160:/export/upload_prd'}]\nNome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           \n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC /integracoes/SIEXC                  ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfs_path=/integracoes/SIEXC\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC /integracoes/SIEXC                  ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /opt/jboss/bovespa                  ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfs_path=/opt/jboss/bovespa\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /opt/jboss/bovespa                  ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC /opt/sigdb/sitec                    ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfs_path=/opt/sigdb/sitec\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC /opt/sigdb/sitec                    ISILON                              nfsctcnprd.ctc.caixa                des                                \n10.116.88.160                       /export/sigdb/sicql                 /upload                             VM                                  10.116.88.160                       des                                \nnfs_path=/upload\nnfs_src=10.116.88.160:/export/sigdb/sicql\n10.116.88.160                       /export/sigdb/sicql                 /upload                             VM                                  10.116.88.160                       des                                \n10.116.88.160                       /export/sigdb/sitec                 /integracoes/SIAPC                  VM                                  10.116.88.160                       des                                \nnfs_path=/integracoes/SIAPC\nnfs_src=10.116.88.160:/export/sigdb/sitec\n10.116.88.160                       /export/sigdb/sitec                 /integracoes/SIAPC                  VM                                  10.116.88.160                       des                                \n10.116.88.160                       /export/sicql_bovespa               /integracoes/SIISF                  VM                                  10.116.88.160                       des                                \nnfs_path=/integracoes/SIISF\nnfs_src=10.116.88.160:/export/sicql_bovespa\n10.116.88.160                       /export/sicql_bovespa               /integracoes/SIISF                  VM                                  10.116.88.160                       des                                \n10.116.88.160                       /export/upload_prd                  /opt/sigdb                          VM                                  10.116.88.160                       des                                \nnfs_path=/opt/sigdb\nnfs_src=10.116.88.160:/export/upload_prd\n10.116.88.160                       /export/upload_prd                  /opt/sigdb                          VM                                  10.116.88.160                       des                                ", 
2026-07-20T18:11:01.1237751Z         "stdout_lines": [
2026-07-20T18:11:01.1238761Z             "[{u'NFS_MOUNT_POINT_VM': u'/opt/sigdb', u'NFS_ENDPOINT_VM': u'10.116.88.160:/export/sigdb/sicql'}, {u'NFS_MOUNT_POINT_ISILON': u'/integracoes/SIEXC', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC'}, {u'NFS_MOUNT_POINT_ISILON_3': u'/integracoes/SIAPC', u'NFS_ENDPOINT_ISILON_3': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC'}, {u'NFS_MOUNT_POINT_ISILON_2': u'/integracoes/SIISF', u'NFS_ENDPOINT_ISILON_2': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF'}, {u'NFS_ENDPOINT_VM_2': u'10.116.88.160:/export/sigdb/sitec', u'NFS_MOUNT_POINT_VM_2': u'/opt/sigdb/sitec'}, {u'NFS_ENDPOINT_VM_3': u'10.116.88.160:/export/sicql_bovespa', u'NFS_MOUNT_POINT_VM_3': u'/opt/jboss/bovespa'}, {u'NFS_MOUNT_POINT_VM_4': u'/upload', u'NFS_ENDPOINT_VM_4': u'10.116.88.160:/export/upload_prd'}]", 
2026-07-20T18:11:01.1239350Z             "Nome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           ", 
2026-07-20T18:11:01.1239772Z             "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------", 
2026-07-20T18:11:01.1240015Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC /integracoes/SIEXC                  ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-07-20T18:11:01.1240253Z             "nfs_path=/integracoes/SIEXC", 
2026-07-20T18:11:01.1240416Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC", 
2026-07-20T18:11:01.1240603Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC /integracoes/SIEXC                  ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-07-20T18:11:01.1240845Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /opt/jboss/bovespa                  ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-07-20T18:11:01.1241031Z             "nfs_path=/opt/jboss/bovespa", 
2026-07-20T18:11:01.1241169Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF", 
2026-07-20T18:11:01.1241391Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /opt/jboss/bovespa                  ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-07-20T18:11:01.1241703Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC /opt/sigdb/sitec                    ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-07-20T18:11:01.1242013Z             "nfs_path=/opt/sigdb/sitec", 
2026-07-20T18:11:01.1242228Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC", 
2026-07-20T18:11:01.1242457Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC /opt/sigdb/sitec                    ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-07-20T18:11:01.1242646Z             "10.116.88.160                       /export/sigdb/sicql                 /upload                             VM                                  10.116.88.160                       des                                ", 
2026-07-20T18:11:01.1242818Z             "nfs_path=/upload", 
2026-07-20T18:11:01.1243022Z             "nfs_src=10.116.88.160:/export/sigdb/sicql", 
2026-07-20T18:11:01.1243175Z             "10.116.88.160                       /export/sigdb/sicql                 /upload                             VM                                  10.116.88.160                       des                                ", 
2026-07-20T18:11:01.1243353Z             "10.116.88.160                       /export/sigdb/sitec                 /integracoes/SIAPC                  VM                                  10.116.88.160                       des                                ", 
2026-07-20T18:11:01.1243568Z             "nfs_path=/integracoes/SIAPC", 
2026-07-20T18:11:01.1243683Z             "nfs_src=10.116.88.160:/export/sigdb/sitec", 
2026-07-20T18:11:01.1243842Z             "10.116.88.160                       /export/sigdb/sitec                 /integracoes/SIAPC                  VM                                  10.116.88.160                       des                                ", 
2026-07-20T18:11:01.1244073Z             "10.116.88.160                       /export/sicql_bovespa               /integracoes/SIISF                  VM                                  10.116.88.160                       des                                ", 
2026-07-20T18:11:01.1244241Z             "nfs_path=/integracoes/SIISF", 
2026-07-20T18:11:01.1244367Z             "nfs_src=10.116.88.160:/export/sicql_bovespa", 
2026-07-20T18:11:01.1244520Z             "10.116.88.160                       /export/sicql_bovespa               /integracoes/SIISF                  VM                                  10.116.88.160                       des                                ", 
2026-07-20T18:11:01.1244761Z             "10.116.88.160                       /export/upload_prd                  /opt/sigdb                          VM                                  10.116.88.160                       des                                ", 
2026-07-20T18:11:01.1244943Z             "nfs_path=/opt/sigdb", 
2026-07-20T18:11:01.1245066Z             "nfs_src=10.116.88.160:/export/upload_prd", 
2026-07-20T18:11:01.1245275Z             "10.116.88.160                       /export/upload_prd                  /opt/sigdb                          VM                                  10.116.88.160                       des                                "
2026-07-20T18:11:01.1245417Z         ]
2026-07-20T18:11:01.1245500Z     }
2026-07-20T18:11:01.1245594Z }
2026-07-20T18:11:01.1255256Z Monday 20 July 2026  15:11:01 -0300 (0:00:00.061)       0:00:07.429 *********** 
2026-07-20T18:11:01.3825646Z 
2026-07-20T18:11:01.3826136Z TASK [nfs : execute clean json] ************************************************
2026-07-20T18:11:01.3826340Z changed: [caddeapllx2193.agil.nprd.caixa.gov.br]
2026-07-20T18:11:01.3846359Z Monday 20 July 2026  15:11:01 -0300 (0:00:00.258)       0:00:07.688 *********** 
2026-07-20T18:11:01.4422616Z 
2026-07-20T18:11:01.4423154Z TASK [nfs : result_new_string_json] ********************************************
2026-07-20T18:11:01.4424572Z ok: [caddeapllx2193.agil.nprd.caixa.gov.br] => {
2026-07-20T18:11:01.4424702Z     "msg": {
2026-07-20T18:11:01.4424818Z         "changed": true, 
2026-07-20T18:11:01.4427516Z         "cmd": "echo '[{\"NFS_ENDPOINT_VM\": \"10.116.88.160:/export/sigdb/sicql\",\"NFS_MOUNT_POINT_VM\": \"/opt/sigdb\"},{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC\",\"NFS_MOUNT_POINT_ISILON\": \"/integracoes/SIEXC\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC\",\"NFS_MOUNT_POINT_ISILON_3\": \"/integracoes/SIAPC\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_2\": \"/integracoes/SIISF\"},{\"NFS_ENDPOINT_VM_2\": \"10.116.88.160:/export/sigdb/sitec\",\"NFS_MOUNT_POINT_VM_2\": \"/opt/sigdb/sitec\"},{\"NFS_ENDPOINT_VM_3\": \"10.116.88.160:/export/sicql_bovespa\",\"NFS_MOUNT_POINT_VM_3\": \"/opt/jboss/bovespa\"},{\"NFS_ENDPOINT_VM_4\": \"10.116.88.160:/export/upload_prd\",\"NFS_MOUNT_POINT_VM_4\": \"/upload\"}]' | sed 's/NFS_ENDPOINT_ISILON[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_ISILON[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_HUAWEI[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_HUAWEI[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_VM[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_VM[^\"]*/NFS_MOUNT_POINT/g'", 
2026-07-20T18:11:01.4429120Z         "delta": "0:00:00.004112", 
2026-07-20T18:11:01.4429691Z         "end": "2026-07-20 15:11:01.362648", 
2026-07-20T18:11:01.4429865Z         "failed": false, 
2026-07-20T18:11:01.4429974Z         "rc": 0, 
2026-07-20T18:11:01.4430158Z         "start": "2026-07-20 15:11:01.358536", 
2026-07-20T18:11:01.4430278Z         "stderr": "", 
2026-07-20T18:11:01.4430397Z         "stderr_lines": [], 
2026-07-20T18:11:01.4430822Z         "stdout": "[{\"NFS_ENDPOINT\": \"10.116.88.160:/export/sigdb/sicql\",\"NFS_MOUNT_POINT\": \"/opt/sigdb\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC\",\"NFS_MOUNT_POINT\": \"/integracoes/SIEXC\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC\",\"NFS_MOUNT_POINT\": \"/integracoes/SIAPC\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT\": \"/integracoes/SIISF\"},{\"NFS_ENDPOINT\": \"10.116.88.160:/export/sigdb/sitec\",\"NFS_MOUNT_POINT\": \"/opt/sigdb/sitec\"},{\"NFS_ENDPOINT\": \"10.116.88.160:/export/sicql_bovespa\",\"NFS_MOUNT_POINT\": \"/opt/jboss/bovespa\"},{\"NFS_ENDPOINT\": \"10.116.88.160:/export/upload_prd\",\"NFS_MOUNT_POINT\": \"/upload\"}]", 
2026-07-20T18:11:01.4431286Z         "stdout_lines": [
2026-07-20T18:11:01.4431710Z             "[{\"NFS_ENDPOINT\": \"10.116.88.160:/export/sigdb/sicql\",\"NFS_MOUNT_POINT\": \"/opt/sigdb\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC\",\"NFS_MOUNT_POINT\": \"/integracoes/SIEXC\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC\",\"NFS_MOUNT_POINT\": \"/integracoes/SIAPC\"},{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT\": \"/integracoes/SIISF\"},{\"NFS_ENDPOINT\": \"10.116.88.160:/export/sigdb/sitec\",\"NFS_MOUNT_POINT\": \"/opt/sigdb/sitec\"},{\"NFS_ENDPOINT\": \"10.116.88.160:/export/sicql_bovespa\",\"NFS_MOUNT_POINT\": \"/opt/jboss/bovespa\"},{\"NFS_ENDPOINT\": \"10.116.88.160:/export/upload_prd\",\"NFS_MOUNT_POINT\": \"/upload\"}]"
2026-07-20T18:11:01.4432474Z         ]
2026-07-20T18:11:01.4432569Z     }
2026-07-20T18:11:01.4432658Z }
2026-07-20T18:11:01.4448976Z Monday 20 July 2026  15:11:01 -0300 (0:00:00.060)       0:00:07.748 *********** 
2026-07-20T18:11:01.5022696Z 
2026-07-20T18:11:01.5023378Z TASK [nfs : Parse JSON data] ***************************************************
2026-07-20T18:11:01.5023579Z ok: [caddeapllx2193.agil.nprd.caixa.gov.br]
2026-07-20T18:11:01.5048040Z Monday 20 July 2026  15:11:01 -0300 (0:00:00.059)       0:00:07.808 *********** 
2026-07-20T18:11:01.5647430Z 
2026-07-20T18:11:01.5648468Z TASK [nfs : result_new_json] ***************************************************
2026-07-20T18:11:01.5650980Z ok: [caddeapllx2193.agil.nprd.caixa.gov.br] => {
2026-07-20T18:11:01.5651355Z     "msg": [
2026-07-20T18:11:01.5651531Z         {
2026-07-20T18:11:01.5651739Z             "NFS_ENDPOINT": "10.116.88.160:/export/sigdb/sicql", 
2026-07-20T18:11:01.5653004Z             "NFS_MOUNT_POINT": "/opt/sigdb"
2026-07-20T18:11:01.5654135Z         }, 
2026-07-20T18:11:01.5655245Z         {
2026-07-20T18:11:01.5656494Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC", 
2026-07-20T18:11:01.5657714Z             "NFS_MOUNT_POINT": "/integracoes/SIEXC"
2026-07-20T18:11:01.5658844Z         }, 
2026-07-20T18:11:01.5659935Z         {
2026-07-20T18:11:01.5660256Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC", 
2026-07-20T18:11:01.5660509Z             "NFS_MOUNT_POINT": "/integracoes/SIAPC"
2026-07-20T18:11:01.5661008Z         }, 
2026-07-20T18:11:01.5661241Z         {
2026-07-20T18:11:01.5661502Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF", 
2026-07-20T18:11:01.5661761Z             "NFS_MOUNT_POINT": "/integracoes/SIISF"
2026-07-20T18:11:01.5662106Z         }, 
2026-07-20T18:11:01.5662300Z         {
2026-07-20T18:11:01.5662528Z             "NFS_ENDPOINT": "10.116.88.160:/export/sigdb/sitec", 
2026-07-20T18:11:01.5662799Z             "NFS_MOUNT_POINT": "/opt/sigdb/sitec"
2026-07-20T18:11:01.5663036Z         }, 
2026-07-20T18:11:01.5663620Z         {
2026-07-20T18:11:01.5664074Z             "NFS_ENDPOINT": "10.116.88.160:/export/sicql_bovespa", 
2026-07-20T18:11:01.5664441Z             "NFS_MOUNT_POINT": "/opt/jboss/bovespa"
2026-07-20T18:11:01.5664721Z         }, 
2026-07-20T18:11:01.5665009Z         {
2026-07-20T18:11:01.5665342Z             "NFS_ENDPOINT": "10.116.88.160:/export/upload_prd", 
2026-07-20T18:11:01.5665631Z             "NFS_MOUNT_POINT": "/upload"
2026-07-20T18:11:01.5665908Z         }
2026-07-20T18:11:01.5666172Z     ]
2026-07-20T18:11:01.5666417Z }
2026-07-20T18:11:01.5678814Z Monday 20 July 2026  15:11:01 -0300 (0:00:00.063)       0:00:07.871 *********** 
2026-07-20T18:11:01.6677015Z included: /opt/ads-agent/_work/r5319/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx2193.agil.nprd.caixa.gov.br
2026-07-20T18:11:01.6790778Z included: /opt/ads-agent/_work/r5319/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx2193.agil.nprd.caixa.gov.br
2026-07-20T18:11:01.6862630Z included: /opt/ads-agent/_work/r5319/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx2193.agil.nprd.caixa.gov.br
2026-07-20T18:11:01.6933884Z included: /opt/ads-agent/_work/r5319/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx2193.agil.nprd.caixa.gov.br
2026-07-20T18:11:01.7005332Z included: /opt/ads-agent/_work/r5319/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx2193.agil.nprd.caixa.gov.br
2026-07-20T18:11:01.7080409Z included: /opt/ads-agent/_work/r5319/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx2193.agil.nprd.caixa.gov.br
2026-07-20T18:11:01.7159598Z included: /opt/ads-agent/_work/r5319/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx2193.agil.nprd.caixa.gov.br
2026-07-20T18:11:01.7228452Z Monday 20 July 2026  15:11:01 -0300 (0:00:00.154)       0:00:08.026 *********** 
2026-07-20T18:11:01.7828771Z 
2026-07-20T18:11:01.7831092Z TASK [nfs : Parse JSON data] ***************************************************
2026-07-20T18:11:01.7831424Z ok: [caddeapllx2193.agil.nprd.caixa.gov.br]
2026-07-20T18:11:01.7853890Z Monday 20 July 2026  15:11:01 -0300 (0:00:00.062)       0:00:08.089 *********** 
2026-07-20T18:11:01.8398301Z 
2026-07-20T18:11:01.8398885Z TASK [nfs : debug] *************************************************************
2026-07-20T18:11:01.8399108Z ok: [caddeapllx2193.agil.nprd.caixa.gov.br] => {
2026-07-20T18:11:01.8399256Z     "msg": {
2026-07-20T18:11:01.8399373Z         "NFS_ENDPOINT": "10.116.88.160:/export/sigdb/sicql", 
2026-07-20T18:11:01.8399587Z         "NFS_MOUNT_POINT": "/opt/sigdb"
2026-07-20T18:11:01.8399737Z     }
2026-07-20T18:11:01.8399843Z }
2026-07-20T18:11:01.8425663Z Monday 20 July 2026  15:11:01 -0300 (0:00:00.057)       0:00:08.146 *********** 
2026-07-20T18:11:01.8955954Z 
2026-07-20T18:11:01.8956481Z TASK [nfs : debug] *************************************************************
2026-07-20T18:11:01.8956663Z ok: [caddeapllx2193.agil.nprd.caixa.gov.br] => {
2026-07-20T18:11:01.8956802Z     "msg": "/opt/sigdb"
2026-07-20T18:11:01.8956903Z }
2026-07-20T18:11:01.8995904Z Monday 20 July 2026  15:11:01 -0300 (0:00:00.057)       0:00:08.203 *********** 
2026-07-20T18:11:01.9560648Z 
2026-07-20T18:11:01.9561200Z TASK [nfs : debug] *************************************************************
2026-07-20T18:11:01.9561366Z ok: [caddeapllx2193.agil.nprd.caixa.gov.br] => {
2026-07-20T18:11:01.9561517Z     "msg": "10.116.88.160:/export/sigdb/sicql"
2026-07-20T18:11:01.9563025Z }
2026-07-20T18:11:01.9601453Z Monday 20 July 2026  15:11:01 -0300 (0:00:00.060)       0:00:08.264 *********** 
2026-07-20T18:11:02.0173622Z 
2026-07-20T18:11:02.0174151Z TASK [nfs : Verificando as variaveis] ******************************************
2026-07-20T18:11:02.0174490Z ok: [caddeapllx2193.agil.nprd.caixa.gov.br] => {
2026-07-20T18:11:02.0174667Z     "changed": false, 
2026-07-20T18:11:02.0174789Z     "msg": "All assertions passed"
2026-07-20T18:11:02.0174896Z }
2026-07-20T18:11:02.0200923Z Monday 20 July 2026  15:11:02 -0300 (0:00:00.060)       0:00:08.324 *********** 
2026-07-20T18:11:05.3403733Z 
2026-07-20T18:11:05.3404489Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-07-20T18:11:05.3404696Z ok: [caddeapllx2193.agil.nprd.caixa.gov.br]
2026-07-20T18:11:05.3446078Z Monday 20 July 2026  15:11:05 -0300 (0:00:03.324)       0:00:11.648 *********** 
2026-07-20T18:11:06.3255791Z 
2026-07-20T18:11:06.3256315Z TASK [nfs : Install networker lgtoclnt_url] ************************************
2026-07-20T18:11:06.3256523Z [WARNING]: Consider using the yum, dnf or zypper module rather than running
2026-07-20T18:11:06.3256885Z 'rpm'.  If you need to use command because yum, dnf or zypper is insufficient
2026-07-20T18:11:06.3257112Z you can add 'warn: false' to this command task or set 'command_warnings=False'
2026-07-20T18:11:06.3257263Z in ansible.cfg to get rid of this message.
2026-07-20T18:11:06.3258466Z fatal: [caddeapllx2193.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.698257", "end": "2026-07-20 15:11:06.304954", "msg": "non-zero return code", "rc": 1, "start": "2026-07-20 15:11:05.606697", "stderr": "aviso: /var/tmp/rpm-tmp.9H5Exp: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.9H5Exp: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-07-20T18:11:06.3259624Z ...ignoring
2026-07-20T18:11:06.3282597Z Monday 20 July 2026  15:11:06 -0300 (0:00:00.983)       0:00:12.632 *********** 
2026-07-20T18:11:07.0312817Z 
2026-07-20T18:11:07.0313544Z TASK [nfs : Install networker lgtonmda_url] ************************************
2026-07-20T18:11:07.0319207Z fatal: [caddeapllx2193.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.454341", "end": "2026-07-20 15:11:07.010917", "msg": "non-zero return code", "rc": 1, "start": "2026-07-20 15:11:06.556576", "stderr": "aviso: /var/tmp/rpm-tmp.1e0SIe: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.1e0SIe: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-07-20T18:11:07.0320389Z ...ignoring
2026-07-20T18:11:07.0349938Z Monday 20 July 2026  15:11:07 -0300 (0:00:00.706)       0:00:13.338 *********** 
2026-07-20T18:11:07.4523329Z 
2026-07-20T18:11:07.4524508Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-07-20T18:11:07.4524723Z changed: [caddeapllx2193.agil.nprd.caixa.gov.br]
2026-07-20T18:11:07.4551382Z Monday 20 July 2026  15:11:07 -0300 (0:00:00.420)       0:00:13.759 *********** 
2026-07-20T18:11:07.6993798Z 
2026-07-20T18:11:07.6994490Z TASK [nfs : Create a symbolic link] ********************************************
2026-07-20T18:11:07.6994900Z changed: [caddeapllx2193.agil.nprd.caixa.gov.br]
2026-07-20T18:11:07.7022729Z Monday 20 July 2026  15:11:07 -0300 (0:00:00.247)       0:00:14.006 *********** 
2026-07-20T18:11:08.6342448Z 
2026-07-20T18:11:08.6343153Z TASK [nfs : Networker | Start networker] ***************************************
2026-07-20T18:11:08.6343515Z ok: [caddeapllx2193.agil.nprd.caixa.gov.br]
2026-07-20T18:11:08.6361146Z Monday 20 July 2026  15:11:08 -0300 (0:00:00.933)       0:00:14.940 *********** 
2026-07-20T18:11:09.0100938Z 
2026-07-20T18:11:09.0101782Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-07-20T18:11:09.0102512Z changed: [caddeapllx2193.agil.nprd.caixa.gov.br]
2026-07-20T18:11:09.0131193Z Monday 20 July 2026  15:11:09 -0300 (0:00:00.376)       0:00:15.317 *********** 
2026-07-20T18:11:19.4697803Z 
2026-07-20T18:11:19.4698304Z TASK [nfs : Networker | Restart networker] *************************************
2026-07-20T18:11:19.4698471Z changed: [caddeapllx2193.agil.nprd.caixa.gov.br]
2026-07-20T18:11:19.4719320Z Monday 20 July 2026  15:11:19 -0300 (0:00:10.458)       0:00:25.775 *********** 
2026-07-20T18:14:22.6087843Z 
2026-07-20T18:14:22.6088738Z TASK [nfs : Montando volume remoto] ********************************************
2026-07-20T18:14:22.6089225Z fatal: [caddeapllx2193.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "msg": "Error mounting /opt/sigdb: mount.nfs: Connection timed out\n"}
2026-07-20T18:14:22.6089877Z ...ignoring
2026-07-20T18:14:22.6113476Z Monday 20 July 2026  15:14:22 -0300 (0:03:03.139)       0:03:28.915 *********** 
2026-07-20T18:14:22.6717210Z 
2026-07-20T18:14:22.6717758Z TASK [nfs : Validando Montagem] ************************************************
2026-07-20T18:14:22.6717983Z fatal: [caddeapllx2193.agil.nprd.caixa.gov.br]: FAILED! => {
2026-07-20T18:14:22.6718316Z     "assertion": "'Connection refused' in mountnfs.msg", 
2026-07-20T18:14:22.6724355Z     "changed": false, 
2026-07-20T18:14:22.6725834Z     "evaluated_to": false, 
2026-07-20T18:14:22.6726309Z     "msg": "Erro desconhecido: Error mounting /opt/sigdb: mount.nfs: Connection timed out\n"
2026-07-20T18:14:22.6726703Z }
2026-07-20T18:14:22.6726885Z 
2026-07-20T18:14:22.6727023Z PLAY RECAP *********************************************************************
2026-07-20T18:14:22.6727441Z caddeapllx2193.agil.nprd.caixa.gov.br : ok=34   changed=8    unreachable=0    failed=1    skipped=0    rescued=0    ignored=3   
2026-07-20T18:14:22.6727595Z 
2026-07-20T18:14:22.6729850Z Monday 20 July 2026  15:14:22 -0300 (0:00:00.061)       0:03:28.976 *********** 
2026-07-20T18:14:22.6730357Z =============================================================================== 
2026-07-20T18:14:22.6731675Z nfs : Montando volume remoto ------------------------------------------ 183.14s
2026-07-20T18:14:22.6732161Z nfs : Networker | Restart networker ------------------------------------ 10.46s
2026-07-20T18:14:22.6732724Z nfs : execute montagem script ------------------------------------------- 5.52s
2026-07-20T18:14:22.6733165Z nfs : Instalando o NFS Client ------------------------------------------- 3.32s
2026-07-20T18:14:22.6733785Z nfs : Install networker lgtoclnt_url ------------------------------------ 0.98s
2026-07-20T18:14:22.6734084Z nfs : Networker | Start networker --------------------------------------- 0.93s
2026-07-20T18:14:22.6734634Z nfs : Install networker lgtonmda_url ------------------------------------ 0.71s
2026-07-20T18:14:22.6734905Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.52s
2026-07-20T18:14:22.6735128Z nfs : Coletar variáveis de ambiente ------------------------------------- 0.43s
2026-07-20T18:14:22.6735418Z nfs : Remove pacote jbcs-httpd ------------------------------------------ 0.42s
2026-07-20T18:14:22.6735639Z nfs : Executar o comando abaixo para limitar as portas ------------------ 0.38s
2026-07-20T18:14:22.6735915Z Verifica se o arquivo nfs_config.json existe ---------------------------- 0.33s
2026-07-20T18:14:22.6736131Z nfs : execute clean json ------------------------------------------------ 0.26s
2026-07-20T18:14:22.6736381Z nfs : Create a symbolic link -------------------------------------------- 0.25s
2026-07-20T18:14:22.6736663Z nfs : include_tasks ----------------------------------------------------- 0.15s
2026-07-20T18:14:22.6736884Z nfs : result_new_json --------------------------------------------------- 0.06s
2026-07-20T18:14:22.6737161Z nfs : Parse JSON data --------------------------------------------------- 0.06s
2026-07-20T18:14:22.6737378Z nfs : Criar variáveis --------------------------------------------------- 0.06s
2026-07-20T18:14:22.6737630Z nfs : Validando Montagem ------------------------------------------------ 0.06s
2026-07-20T18:14:22.6737881Z nfs : ansible.builtin.debug --------------------------------------------- 0.06s
2026-07-20T18:14:22.6738025Z Playbook run took 0 days, 0 hours, 3 minutes, 28 seconds
2026-07-20T18:14:22.7340022Z ##[debug]Exit code 2 received from tool '/bin/bash'
2026-07-20T18:14:22.7342394Z ##[debug]STDIO streams have closed for tool '/bin/bash'
2026-07-20T18:14:22.7374154Z ##[error]Bash exited with code '2'.
2026-07-20T18:14:22.7374882Z ##[debug]Processed: ##vso[task.issue type=error;]Bash exited with code '2'.
2026-07-20T18:14:22.7375408Z ##[debug]task result: Failed
2026-07-20T18:14:22.7376392Z ##[debug]Processed: ##vso[task.complete result=Failed;done=true;]
2026-07-20T18:14:22.7382017Z ##[section]Finishing: Deploy Config no JBOSS






