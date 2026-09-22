2026-09-22T20:21:56.1158082Z ##[debug]Evaluating condition for step: 'Deploy Config no JBOSS'
2026-09-22T20:21:56.1158484Z ##[debug]Evaluating: succeeded()
2026-09-22T20:21:56.1158634Z ##[debug]Evaluating succeeded:
2026-09-22T20:21:56.1158876Z ##[debug]=> True
2026-09-22T20:21:56.1159075Z ##[debug]Result: True
2026-09-22T20:21:56.1159347Z ##[section]Starting: Deploy Config no JBOSS
2026-09-22T20:21:56.1162264Z ==============================================================================
2026-09-22T20:21:56.1162339Z Task         : Bash
2026-09-22T20:21:56.1162379Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-22T20:21:56.1162450Z Version      : 3.227.0
2026-09-22T20:21:56.1162491Z Author       : Microsoft Corporation
2026-09-22T20:21:56.1162538Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-22T20:21:56.1162616Z ==============================================================================
2026-09-22T20:21:56.8573328Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-09-22T20:21:56.9254867Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-09-22T20:21:56.9262222Z ##[debug]loading inputs and endpoints
2026-09-22T20:21:56.9265921Z ##[debug]loading INPUT_TARGETTYPE
2026-09-22T20:21:56.9274060Z ##[debug]loading INPUT_FILEPATH
2026-09-22T20:21:56.9274521Z ##[debug]loading INPUT_SCRIPT
2026-09-22T20:21:56.9275227Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-09-22T20:21:56.9275835Z ##[debug]loading INPUT_FAILONSTDERR
2026-09-22T20:21:56.9277645Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-09-22T20:21:56.9278358Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-09-22T20:21:56.9280160Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-09-22T20:21:56.9285298Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-09-22T20:21:56.9286892Z ##[debug]loading SECRET_FORTIFY_PASS
2026-09-22T20:21:56.9288439Z ##[debug]loading SECRET_OKD_TOKEN_PRODUTOS
2026-09-22T20:21:56.9290102Z ##[debug]loading SECRET_PW_ALOCAIP
2026-09-22T20:21:56.9291671Z ##[debug]loading SECRET_TERRAFORM_ESX_PASSWORD
2026-09-22T20:21:56.9293032Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-09-22T20:21:56.9293590Z ##[debug]loading SECRET_TOKEN_INFRAFACIL_MUDANCA
2026-09-22T20:21:56.9294214Z ##[debug]loading SECRET_TOKEN_CRQ
2026-09-22T20:21:56.9294762Z ##[debug]loading SECRET_PW_ISILON
2026-09-22T20:21:56.9295303Z ##[debug]loading SECRET_ARM_ACCESS_KEY
2026-09-22T20:21:56.9295806Z ##[debug]loading SECRET_ANSIBLE_VAULT
2026-09-22T20:21:56.9296988Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-09-22T20:21:56.9297531Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-09-22T20:21:56.9298112Z ##[debug]loading SECRET_AZPAT
2026-09-22T20:21:56.9299426Z ##[debug]loaded 22
2026-09-22T20:21:56.9303893Z ##[debug]Agent.ProxyUrl=undefined
2026-09-22T20:21:56.9304286Z ##[debug]Agent.CAInfo=undefined
2026-09-22T20:21:56.9304514Z ##[debug]Agent.ClientCert=undefined
2026-09-22T20:21:56.9304738Z ##[debug]Agent.SkipCertValidation=True
2026-09-22T20:21:56.9318353Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-22T20:21:56.9320656Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-22T20:21:56.9321101Z ##[debug]system.culture=en-US
2026-09-22T20:21:56.9329549Z ##[debug]failOnStderr=false
2026-09-22T20:21:56.9330450Z ##[debug]workingDirectory=/opt/ads-agent/_work/r15661/a
2026-09-22T20:21:56.9330689Z ##[debug]check path : /opt/ads-agent/_work/r15661/a
2026-09-22T20:21:56.9331181Z ##[debug]targetType=inline
2026-09-22T20:21:56.9331867Z ##[debug]bashEnvValue=undefined
2026-09-22T20:21:56.9333338Z ##[debug]script=REPO=$(echo _SIEXC-web-aplicacao | sed 's/_//')
ansible-playbook /opt/ads-agent/_work/r15661/a/esteira-jboss-vm-v2/site.yml --tags git_conf -e sistema_ambiente=des -e sistema_nome=siexc-web-aplicacao -e default_working_directory_tfs=/opt/ads-agent/_work/r15661/a -e build_repository_name_tfs=$REPO -e quantidade_vm=$(quantidade_vm) -e package_path=/opt/ads-agent/_work/r15661/a/binario/`basename http://binario.caixa:8081/repository/thirdparty/br/com/caixa/siexc/siexc-web-aplicacao/1.1.13/siexc-web-aplicacao-1.1.13.ear` -e use_wmq=$(USE_WMQ) -e jks_file=/opt/ads-agent/_work/_temp/caixa-truststore-acteste-nprd.jks -e site=ctc_nprd -e url_deploy="`echo "http://binario.caixa:8081/repository/thirdparty/br/com/caixa/siexc/siexc-web-aplicacao/1.1.13/siexc-web-aplicacao-1.1.13.ear" | tr -d "\'"`"
2026-09-22T20:21:56.9341163Z Generating script.
2026-09-22T20:21:56.9343081Z ##[debug]which 'bash'
2026-09-22T20:21:56.9348329Z ##[debug]found: '/bin/bash'
2026-09-22T20:21:56.9348793Z ##[debug]Agent.Version=3.225.2
2026-09-22T20:21:56.9349083Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-09-22T20:21:56.9349442Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-09-22T20:21:56.9351599Z ========================== Starting Command Output ===========================
2026-09-22T20:21:56.9352397Z ##[debug]which '/bin/bash'
2026-09-22T20:21:56.9369831Z ##[debug]found: '/bin/bash'
2026-09-22T20:21:56.9370185Z ##[debug]/bin/bash arg: /opt/ads-agent/_work/_temp/9c5c3255-0c31-497d-8674-aa2a1e91a93e.sh
2026-09-22T20:21:56.9370452Z ##[debug]exec tool: /bin/bash
2026-09-22T20:21:56.9370668Z ##[debug]arguments:
2026-09-22T20:21:56.9370907Z ##[debug]   /opt/ads-agent/_work/_temp/9c5c3255-0c31-497d-8674-aa2a1e91a93e.sh
2026-09-22T20:21:56.9371315Z [command]/bin/bash /opt/ads-agent/_work/_temp/9c5c3255-0c31-497d-8674-aa2a1e91a93e.sh
2026-09-22T20:21:56.9437086Z /opt/ads-agent/_work/_temp/9c5c3255-0c31-497d-8674-aa2a1e91a93e.sh: line 2: quantidade_vm: comando não encontrado
2026-09-22T20:21:56.9450883Z /opt/ads-agent/_work/_temp/9c5c3255-0c31-497d-8674-aa2a1e91a93e.sh: line 2: USE_WMQ: comando não encontrado
2026-09-22T20:21:59.0156297Z 
2026-09-22T20:21:59.0156760Z PLAY [local] *******************************************************************
2026-09-22T20:21:59.0439192Z 
2026-09-22T20:21:59.0439549Z PLAY [Configurando o DNS] ******************************************************
2026-09-22T20:21:59.2265081Z 
2026-09-22T20:21:59.2265578Z PLAY [local] *******************************************************************
2026-09-22T20:21:59.2299732Z 
2026-09-22T20:21:59.2300152Z PLAY [Verificando serviços] ****************************************************
2026-09-22T20:21:59.2386291Z 
2026-09-22T20:21:59.2386585Z PLAY [Configuração LDAP] *******************************************************
2026-09-22T20:21:59.2419475Z [WARNING]: Found variable using reserved name: when
2026-09-22T20:21:59.2425602Z 
2026-09-22T20:21:59.2425828Z PLAY [jboss] *******************************************************************
2026-09-22T20:21:59.2516726Z 
2026-09-22T20:21:59.2517335Z PLAY [Stack Jboss] *************************************************************
2026-09-22T20:21:59.2757618Z Tuesday 22 September 2026  17:21:59 -0300 (0:00:00.320)       0:00:00.320 ***** 
2026-09-22T20:21:59.7637706Z 
2026-09-22T20:21:59.7638859Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-09-22T20:21:59.7643818Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-09-22T20:21:59.7644306Z caddeapllx2193.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-09-22T20:21:59.7644924Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-09-22T20:21:59.7645252Z releases. A future Ansible release will default to using the discovered 
2026-09-22T20:21:59.7645577Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-09-22T20:21:59.7645962Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-09-22T20:21:59.7648058Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-09-22T20:21:59.7648286Z setting deprecation_warnings=False in ansible.cfg.
2026-09-22T20:21:59.7648497Z ok: [caddeapllx2193.agil.nprd.caixa.gov.br]
2026-09-22T20:21:59.7664433Z 
2026-09-22T20:21:59.7664823Z PLAY [jboss] *******************************************************************
2026-09-22T20:21:59.7736620Z Tuesday 22 September 2026  17:21:59 -0300 (0:00:00.497)       0:00:00.817 ***** 
2026-09-22T20:22:00.1379787Z 
2026-09-22T20:22:00.1425515Z TASK [Verifica se o arquivo nfs_config.json existe] ****************************
2026-09-22T20:22:00.1425961Z ok: [caddeapllx2193.agil.nprd.caixa.gov.br]
2026-09-22T20:22:00.1426600Z Tuesday 22 September 2026  17:22:00 -0300 (0:00:00.363)       0:00:01.181 ***** 
2026-09-22T20:22:00.1864541Z included: /opt/ads-agent/_work/r15661/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for caddeapllx2193.agil.nprd.caixa.gov.br
2026-09-22T20:22:00.1937630Z Tuesday 22 September 2026  17:22:00 -0300 (0:00:00.051)       0:00:01.233 ***** 
2026-09-22T20:22:00.2487876Z 
2026-09-22T20:22:00.2488790Z TASK [nfs : Criar variáveis] ***************************************************
2026-09-22T20:22:00.2489212Z ok: [caddeapllx2193.agil.nprd.caixa.gov.br]
2026-09-22T20:22:00.2533781Z Tuesday 22 September 2026  17:22:00 -0300 (0:00:00.063)       0:00:01.297 ***** 
2026-09-22T20:22:00.6970339Z 
2026-09-22T20:22:00.6970981Z TASK [nfs : Coletar variáveis de ambiente] *************************************
2026-09-22T20:22:00.6971194Z ok: [caddeapllx2193.agil.nprd.caixa.gov.br]
2026-09-22T20:22:00.7004163Z Tuesday 22 September 2026  17:22:00 -0300 (0:00:00.447)       0:00:01.744 ***** 
2026-09-22T20:22:00.7570055Z 
2026-09-22T20:22:00.7570550Z TASK [nfs : Exibir resultado em JSON] ******************************************
2026-09-22T20:22:00.7573829Z ok: [caddeapllx2193.agil.nprd.caixa.gov.br] => {
2026-09-22T20:22:00.7574098Z     "nfs_vars_json": {
2026-09-22T20:22:00.7574225Z         "changed": false, 
2026-09-22T20:22:00.7574536Z         "cmd": "cat /opt/ads-agent/_work/r15661/a/nfs_config.json", 
2026-09-22T20:22:00.7574697Z         "delta": "0:00:00.005814", 
2026-09-22T20:22:00.7574868Z         "end": "2026-09-22 17:22:00.676650", 
2026-09-22T20:22:00.7574985Z         "failed": false, 
2026-09-22T20:22:00.7575086Z         "rc": 0, 
2026-09-22T20:22:00.7575278Z         "start": "2026-09-22 17:22:00.670836", 
2026-09-22T20:22:00.7575390Z         "stderr": "", 
2026-09-22T20:22:00.7575481Z         "stderr_lines": [], 
2026-09-22T20:22:00.7576264Z         "stdout": "[{\"NFS_ENDPOINT_VM\": \"192.168.227.59:/export/sigdb/sicql\",\"NFS_MOUNT_POINT_VM\": \"/opt/sigdb\"},{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC\",\"NFS_MOUNT_POINT_ISILON\": \"/integracoes/SIEXC\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC\",\"NFS_MOUNT_POINT_ISILON_3\": \"/integracoes/SIAPC\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_2\": \"/integracoes/SIISF\"},{\"NFS_ENDPOINT_ISILON_4\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC/SWIFT\",\"NFS_MOUNT_POINT_ISILON_4\": \"/SWIFT\"},{\"NFS_ENDPOINT_VM_2\": \"192.168.227.59:/export/sigdb/sitec\",\"NFS_MOUNT_POINT_VM_2\": \"/opt/sigdb/sitec\"},{\"NFS_ENDPOINT_VM_3\": \"192.168.227.59:/export/sicql_bovespa\",\"NFS_MOUNT_POINT_VM_3\": \"/opt/jboss/bovespa\"},{\"NFS_ENDPOINT_VM_4\": \"192.168.227.59:/export/upload_prd\",\"NFS_MOUNT_POINT_VM_4\": \"/upload\"}]", 
2026-09-22T20:22:00.7576869Z         "stdout_lines": [
2026-09-22T20:22:00.7577674Z             "[{\"NFS_ENDPOINT_VM\": \"192.168.227.59:/export/sigdb/sicql\",\"NFS_MOUNT_POINT_VM\": \"/opt/sigdb\"},{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC\",\"NFS_MOUNT_POINT_ISILON\": \"/integracoes/SIEXC\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC\",\"NFS_MOUNT_POINT_ISILON_3\": \"/integracoes/SIAPC\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_2\": \"/integracoes/SIISF\"},{\"NFS_ENDPOINT_ISILON_4\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC/SWIFT\",\"NFS_MOUNT_POINT_ISILON_4\": \"/SWIFT\"},{\"NFS_ENDPOINT_VM_2\": \"192.168.227.59:/export/sigdb/sitec\",\"NFS_MOUNT_POINT_VM_2\": \"/opt/sigdb/sitec\"},{\"NFS_ENDPOINT_VM_3\": \"192.168.227.59:/export/sicql_bovespa\",\"NFS_MOUNT_POINT_VM_3\": \"/opt/jboss/bovespa\"},{\"NFS_ENDPOINT_VM_4\": \"192.168.227.59:/export/upload_prd\",\"NFS_MOUNT_POINT_VM_4\": \"/upload\"}]"
2026-09-22T20:22:00.7578275Z         ]
2026-09-22T20:22:00.7578363Z     }
2026-09-22T20:22:00.7578440Z }
2026-09-22T20:22:00.7604997Z Tuesday 22 September 2026  17:22:00 -0300 (0:00:00.060)       0:00:01.804 ***** 
2026-09-22T20:22:00.8196406Z 
2026-09-22T20:22:00.8197195Z TASK [nfs : Criar variáveis] ***************************************************
2026-09-22T20:22:00.8197545Z ok: [caddeapllx2193.agil.nprd.caixa.gov.br]
2026-09-22T20:22:00.8245940Z Tuesday 22 September 2026  17:22:00 -0300 (0:00:00.064)       0:00:01.868 ***** 
2026-09-22T20:22:09.2761830Z 
2026-09-22T20:22:09.2762546Z TASK [nfs : execute montagem script] *******************************************
2026-09-22T20:22:09.2771470Z fatal: [caddeapllx2193.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["python", "/opt/ads-agent/_work/r15661/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py", "montagem", "siexc-web-aplicacao", "des", "ctc_nprd", "/opt/ads-agent/_work/r15661/a/esteira-jboss-vm-v2", "C&t@d02", "***", "s736651@corp.caixa.gov.br", "***", "[{\"NFS_ENDPOINT_VM\": \"192.168.227.59:/export/sigdb/sicql\",\"NFS_MOUNT_POINT_VM\": \"/opt/sigdb\"},{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC\",\"NFS_MOUNT_POINT_ISILON\": \"/integracoes/SIEXC\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC\",\"NFS_MOUNT_POINT_ISILON_3\": \"/integracoes/SIAPC\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_2\": \"/integracoes/SIISF\"},{\"NFS_ENDPOINT_ISILON_4\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC/SWIFT\",\"NFS_MOUNT_POINT_ISILON_4\": \"/SWIFT\"},{\"NFS_ENDPOINT_VM_2\": \"192.168.227.59:/export/sigdb/sitec\",\"NFS_MOUNT_POINT_VM_2\": \"/opt/sigdb/sitec\"},{\"NFS_ENDPOINT_VM_3\": \"192.168.227.59:/export/sicql_bovespa\",\"NFS_MOUNT_POINT_VM_3\": \"/opt/jboss/bovespa\"},{\"NFS_ENDPOINT_VM_4\": \"192.168.227.59:/export/upload_prd\",\"NFS_MOUNT_POINT_VM_4\": \"/upload\"}]"], "delta": "0:00:08.096362", "end": "2026-09-22 17:22:09.256657", "msg": "non-zero return code", "rc": 1, "start": "2026-09-22 17:22:01.160295", "stderr": "Traceback (most recent call last):\n  File \"/opt/ads-agent/_work/r15661/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py\", line 612, in <module>\n    mount(nfs_endpoints,nfs_mount_points)\n  File \"/opt/ads-agent/_work/r15661/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py\", line 475, in mount\n    configuracao_nfs, nfs_id = getConfiguracao(zona, endpoint)\n  File \"/opt/ads-agent/_work/r15661/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py\", line 531, in getConfiguracao\n    nfs_export_id = getExportId(zone,path)\n  File \"/opt/ads-agent/_work/r15661/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py\", line 528, in getExportId\n    return api_response_id.exports[0].id\nIndexError: list index out of range", "stderr_lines": ["Traceback (most recent call last):", "  File \"/opt/ads-agent/_work/r15661/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py\", line 612, in <module>", "    mount(nfs_endpoints,nfs_mount_points)", "  File \"/opt/ads-agent/_work/r15661/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py\", line 475, in mount", "    configuracao_nfs, nfs_id = getConfiguracao(zona, endpoint)", "  File \"/opt/ads-agent/_work/r15661/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py\", line 531, in getConfiguracao", "    nfs_export_id = getExportId(zone,path)", "  File \"/opt/ads-agent/_work/r15661/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py\", line 528, in getExportId", "    return api_response_id.exports[0].id", "IndexError: list index out of range"], "stdout": "[{u'NFS_MOUNT_POINT_VM': u'/opt/sigdb', u'NFS_ENDPOINT_VM': u'192.168.227.59:/export/sigdb/sicql'}, {u'NFS_MOUNT_POINT_ISILON': u'/integracoes/SIEXC', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC'}, {u'NFS_MOUNT_POINT_ISILON_3': u'/integracoes/SIAPC', u'NFS_ENDPOINT_ISILON_3': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC'}, {u'NFS_MOUNT_POINT_ISILON_2': u'/integracoes/SIISF', u'NFS_ENDPOINT_ISILON_2': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF'}, {u'NFS_ENDPOINT_ISILON_4': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC/SWIFT', u'NFS_MOUNT_POINT_ISILON_4': u'/SWIFT'}, {u'NFS_ENDPOINT_VM_2': u'192.168.227.59:/export/sigdb/sitec', u'NFS_MOUNT_POINT_VM_2': u'/opt/sigdb/sitec'}, {u'NFS_ENDPOINT_VM_3': u'192.168.227.59:/export/sicql_bovespa', u'NFS_MOUNT_POINT_VM_3': u'/opt/jboss/bovespa'}, {u'NFS_MOUNT_POINT_VM_4': u'/upload', u'NFS_ENDPOINT_VM_4': u'192.168.227.59:/export/upload_prd'}]\nNome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           \n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC /SWIFT                              ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfs_path=/SWIFT\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC /SWIFT                              ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /opt/sigdb/sitec                    ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfs_path=/opt/sigdb/sitec\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /opt/sigdb/sitec                    ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC /integracoes/SIEXC                  ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfs_path=/integracoes/SIEXC\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC /integracoes/SIEXC                  ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC/SWIFT /upload                             ISILON                              nfsctcnprd.ctc.caixa                des                                ", "stdout_lines": ["[{u'NFS_MOUNT_POINT_VM': u'/opt/sigdb', u'NFS_ENDPOINT_VM': u'192.168.227.59:/export/sigdb/sicql'}, {u'NFS_MOUNT_POINT_ISILON': u'/integracoes/SIEXC', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC'}, {u'NFS_MOUNT_POINT_ISILON_3': u'/integracoes/SIAPC', u'NFS_ENDPOINT_ISILON_3': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC'}, {u'NFS_MOUNT_POINT_ISILON_2': u'/integracoes/SIISF', u'NFS_ENDPOINT_ISILON_2': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF'}, {u'NFS_ENDPOINT_ISILON_4': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC/SWIFT', u'NFS_MOUNT_POINT_ISILON_4': u'/SWIFT'}, {u'NFS_ENDPOINT_VM_2': u'192.168.227.59:/export/sigdb/sitec', u'NFS_MOUNT_POINT_VM_2': u'/opt/sigdb/sitec'}, {u'NFS_ENDPOINT_VM_3': u'192.168.227.59:/export/sicql_bovespa', u'NFS_MOUNT_POINT_VM_3': u'/opt/jboss/bovespa'}, {u'NFS_MOUNT_POINT_VM_4': u'/upload', u'NFS_ENDPOINT_VM_4': u'192.168.227.59:/export/upload_prd'}]", "Nome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           ", "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------", "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC /SWIFT                              ISILON                              nfsctcnprd.ctc.caixa                des                                ", "nfs_path=/SWIFT", "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC", "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC /SWIFT                              ISILON                              nfsctcnprd.ctc.caixa                des                                ", "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /opt/sigdb/sitec                    ISILON                              nfsctcnprd.ctc.caixa                des                                ", "nfs_path=/opt/sigdb/sitec", "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF", "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /opt/sigdb/sitec                    ISILON                              nfsctcnprd.ctc.caixa                des                                ", "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC /integracoes/SIEXC                  ISILON                              nfsctcnprd.ctc.caixa                des                                ", "nfs_path=/integracoes/SIEXC", "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC", "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC /integracoes/SIEXC                  ISILON                              nfsctcnprd.ctc.caixa                des                                ", "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC/SWIFT /upload                             ISILON                              nfsctcnprd.ctc.caixa                des                                "]}
2026-09-22T20:22:09.2779634Z 
2026-09-22T20:22:09.2779894Z PLAY RECAP *********************************************************************
2026-09-22T20:22:09.2780104Z caddeapllx2193.agil.nprd.caixa.gov.br : ok=7    changed=0    unreachable=0    failed=1    skipped=0    rescued=0    ignored=0   
2026-09-22T20:22:09.2781988Z 
2026-09-22T20:22:09.2785457Z Tuesday 22 September 2026  17:22:09 -0300 (0:00:08.453)       0:00:10.322 ***** 
2026-09-22T20:22:09.2786392Z =============================================================================== 
2026-09-22T20:22:09.2787695Z nfs : execute montagem script ------------------------------------------- 8.45s
2026-09-22T20:22:09.2787959Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.50s
2026-09-22T20:22:09.2788195Z nfs : Coletar variáveis de ambiente ------------------------------------- 0.45s
2026-09-22T20:22:09.2788416Z Verifica se o arquivo nfs_config.json existe ---------------------------- 0.36s
2026-09-22T20:22:09.2788806Z nfs : Criar variáveis --------------------------------------------------- 0.06s
2026-09-22T20:22:09.2789025Z nfs : Criar variáveis --------------------------------------------------- 0.06s
2026-09-22T20:22:09.2789342Z nfs : Exibir resultado em JSON ------------------------------------------ 0.06s
2026-09-22T20:22:09.2789568Z nfs : include_tasks ----------------------------------------------------- 0.05s
2026-09-22T20:22:09.2789713Z Playbook run took 0 days, 0 hours, 0 minutes, 10 seconds
2026-09-22T20:22:09.3356217Z ##[debug]Exit code 2 received from tool '/bin/bash'
2026-09-22T20:22:09.3358930Z ##[debug]STDIO streams have closed for tool '/bin/bash'
2026-09-22T20:22:09.3386306Z ##[error]Bash exited with code '2'.
2026-09-22T20:22:09.3387040Z ##[debug]Processed: ##vso[task.issue type=error;]Bash exited with code '2'.
2026-09-22T20:22:09.3387454Z ##[debug]task result: Failed
2026-09-22T20:22:09.3388845Z ##[debug]Processed: ##vso[task.complete result=Failed;done=true;]
2026-09-22T20:22:09.3390253Z ##[section]Finishing: Deploy Config no JBOSS
