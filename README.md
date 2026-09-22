2026-09-22T20:28:12.7166031Z ##[debug]Evaluating condition for step: 'Deploy Config no JBOSS'
2026-09-22T20:28:12.7166453Z ##[debug]Evaluating: succeeded()
2026-09-22T20:28:12.7166668Z ##[debug]Evaluating succeeded:
2026-09-22T20:28:12.7166915Z ##[debug]=> True
2026-09-22T20:28:12.7167099Z ##[debug]Result: True
2026-09-22T20:28:12.7167260Z ##[section]Starting: Deploy Config no JBOSS
2026-09-22T20:28:12.7170147Z ==============================================================================
2026-09-22T20:28:12.7170220Z Task         : Bash
2026-09-22T20:28:12.7170261Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-22T20:28:12.7170336Z Version      : 3.227.0
2026-09-22T20:28:12.7170379Z Author       : Microsoft Corporation
2026-09-22T20:28:12.7170425Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-22T20:28:12.7170597Z ==============================================================================
2026-09-22T20:28:13.3800242Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-09-22T20:28:13.4443532Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-09-22T20:28:13.4451051Z ##[debug]loading inputs and endpoints
2026-09-22T20:28:13.4454364Z ##[debug]loading INPUT_TARGETTYPE
2026-09-22T20:28:13.4461541Z ##[debug]loading INPUT_FILEPATH
2026-09-22T20:28:13.4462487Z ##[debug]loading INPUT_SCRIPT
2026-09-22T20:28:13.4463196Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-09-22T20:28:13.4463782Z ##[debug]loading INPUT_FAILONSTDERR
2026-09-22T20:28:13.4465490Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-09-22T20:28:13.4466034Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-09-22T20:28:13.4467509Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-09-22T20:28:13.4472667Z ##[debug]loading SECRET_FORTIFY_PASS
2026-09-22T20:28:13.4474274Z ##[debug]loading SECRET_TERRAFORM_ESX_PASSWORD
2026-09-22T20:28:13.4475700Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-09-22T20:28:13.4477847Z ##[debug]loading SECRET_TOKEN_INFRAFACIL_MUDANCA
2026-09-22T20:28:13.4478839Z ##[debug]loading SECRET_OKD_TOKEN_PRODUTOS
2026-09-22T20:28:13.4480223Z ##[debug]loading SECRET_PW_ALOCAIP
2026-09-22T20:28:13.4480889Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-09-22T20:28:13.4481467Z ##[debug]loading SECRET_ANSIBLE_VAULT
2026-09-22T20:28:13.4482011Z ##[debug]loading SECRET_ARM_ACCESS_KEY
2026-09-22T20:28:13.4482506Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-09-22T20:28:13.4483049Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-09-22T20:28:13.4484065Z ##[debug]loading SECRET_AZPAT
2026-09-22T20:28:13.4484748Z ##[debug]loading SECRET_PW_ISILON
2026-09-22T20:28:13.4485297Z ##[debug]loading SECRET_TOKEN_CRQ
2026-09-22T20:28:13.4486407Z ##[debug]loaded 22
2026-09-22T20:28:13.4490866Z ##[debug]Agent.ProxyUrl=undefined
2026-09-22T20:28:13.4491333Z ##[debug]Agent.CAInfo=undefined
2026-09-22T20:28:13.4491697Z ##[debug]Agent.ClientCert=undefined
2026-09-22T20:28:13.4491924Z ##[debug]Agent.SkipCertValidation=True
2026-09-22T20:28:13.4504823Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-22T20:28:13.4506910Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-22T20:28:13.4507192Z ##[debug]system.culture=en-US
2026-09-22T20:28:13.4515776Z ##[debug]failOnStderr=false
2026-09-22T20:28:13.4516289Z ##[debug]workingDirectory=/opt/ads-agent/_work/r11946/a
2026-09-22T20:28:13.4516552Z ##[debug]check path : /opt/ads-agent/_work/r11946/a
2026-09-22T20:28:13.4517159Z ##[debug]targetType=inline
2026-09-22T20:28:13.4517798Z ##[debug]bashEnvValue=undefined
2026-09-22T20:28:13.4519071Z ##[debug]script=REPO=$(echo _SIEXC-web-aplicacao | sed 's/_//')
ansible-playbook /opt/ads-agent/_work/r11946/a/esteira-jboss-vm-v2/site.yml --tags git_conf -e sistema_ambiente=des -e sistema_nome=siexc-web-aplicacao -e default_working_directory_tfs=/opt/ads-agent/_work/r11946/a -e build_repository_name_tfs=$REPO -e quantidade_vm=$(quantidade_vm) -e package_path=/opt/ads-agent/_work/r11946/a/binario/`basename http://binario.caixa:8081/repository/thirdparty/br/com/caixa/siexc/siexc-web-aplicacao/1.1.13/siexc-web-aplicacao-1.1.13.ear` -e use_wmq=$(USE_WMQ) -e jks_file=/opt/ads-agent/_work/_temp/caixa-truststore-acteste-nprd.jks -e site=ctc_nprd -e url_deploy="`echo "http://binario.caixa:8081/repository/thirdparty/br/com/caixa/siexc/siexc-web-aplicacao/1.1.13/siexc-web-aplicacao-1.1.13.ear" | tr -d "\'"`"
2026-09-22T20:28:13.4526758Z Generating script.
2026-09-22T20:28:13.4528756Z ##[debug]which 'bash'
2026-09-22T20:28:13.4533989Z ##[debug]found: '/bin/bash'
2026-09-22T20:28:13.4534464Z ##[debug]Agent.Version=3.225.2
2026-09-22T20:28:13.4535224Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-09-22T20:28:13.4535615Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-09-22T20:28:13.4537515Z ========================== Starting Command Output ===========================
2026-09-22T20:28:13.4538616Z ##[debug]which '/bin/bash'
2026-09-22T20:28:13.4539655Z ##[debug]found: '/bin/bash'
2026-09-22T20:28:13.4540078Z ##[debug]/bin/bash arg: /opt/ads-agent/_work/_temp/ea46147b-b344-44a3-9340-5dfa604a0c41.sh
2026-09-22T20:28:13.4542243Z ##[debug]exec tool: /bin/bash
2026-09-22T20:28:13.4542566Z ##[debug]arguments:
2026-09-22T20:28:13.4542818Z ##[debug]   /opt/ads-agent/_work/_temp/ea46147b-b344-44a3-9340-5dfa604a0c41.sh
2026-09-22T20:28:13.4544406Z [command]/bin/bash /opt/ads-agent/_work/_temp/ea46147b-b344-44a3-9340-5dfa604a0c41.sh
2026-09-22T20:28:13.4612704Z /opt/ads-agent/_work/_temp/ea46147b-b344-44a3-9340-5dfa604a0c41.sh: line 2: quantidade_vm: comando não encontrado
2026-09-22T20:28:13.4623375Z /opt/ads-agent/_work/_temp/ea46147b-b344-44a3-9340-5dfa604a0c41.sh: line 2: USE_WMQ: comando não encontrado
2026-09-22T20:28:15.4014426Z 
2026-09-22T20:28:15.4014930Z PLAY [local] *******************************************************************
2026-09-22T20:28:15.4279678Z 
2026-09-22T20:28:15.4279869Z PLAY [Configurando o DNS] ******************************************************
2026-09-22T20:28:15.6705581Z 
2026-09-22T20:28:15.6706244Z PLAY [local] *******************************************************************
2026-09-22T20:28:15.6735551Z 
2026-09-22T20:28:15.6736288Z PLAY [Verificando serviços] ****************************************************
2026-09-22T20:28:15.6813747Z 
2026-09-22T20:28:15.6814079Z PLAY [Configuração LDAP] *******************************************************
2026-09-22T20:28:15.6844708Z [WARNING]: Found variable using reserved name: when
2026-09-22T20:28:15.6850209Z 
2026-09-22T20:28:15.6850374Z PLAY [jboss] *******************************************************************
2026-09-22T20:28:15.6934875Z 
2026-09-22T20:28:15.6935286Z PLAY [Stack Jboss] *************************************************************
2026-09-22T20:28:15.7157055Z Tuesday 22 September 2026  17:28:15 -0300 (0:00:00.373)       0:00:00.373 ***** 
2026-09-22T20:28:16.1857722Z 
2026-09-22T20:28:16.1858439Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-09-22T20:28:16.1860341Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-09-22T20:28:16.1860563Z caddeapllx2193.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-09-22T20:28:16.1860923Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-09-22T20:28:16.1861168Z releases. A future Ansible release will default to using the discovered 
2026-09-22T20:28:16.1861419Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-09-22T20:28:16.1861664Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-09-22T20:28:16.1861909Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-09-22T20:28:16.1862064Z setting deprecation_warnings=False in ansible.cfg.
2026-09-22T20:28:16.1862207Z ok: [caddeapllx2193.agil.nprd.caixa.gov.br]
2026-09-22T20:28:16.1891152Z 
2026-09-22T20:28:16.1891491Z PLAY [jboss] *******************************************************************
2026-09-22T20:28:16.1978472Z Tuesday 22 September 2026  17:28:16 -0300 (0:00:00.482)       0:00:00.855 ***** 
2026-09-22T20:28:16.4889235Z 
2026-09-22T20:28:16.4890008Z TASK [Verifica se o arquivo nfs_config.json existe] ****************************
2026-09-22T20:28:16.4890378Z ok: [caddeapllx2193.agil.nprd.caixa.gov.br]
2026-09-22T20:28:16.4916202Z Tuesday 22 September 2026  17:28:16 -0300 (0:00:00.293)       0:00:01.149 ***** 
2026-09-22T20:28:16.5354951Z included: /opt/ads-agent/_work/r11946/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for caddeapllx2193.agil.nprd.caixa.gov.br
2026-09-22T20:28:16.5393302Z Tuesday 22 September 2026  17:28:16 -0300 (0:00:00.047)       0:00:01.197 ***** 
2026-09-22T20:28:16.5946675Z 
2026-09-22T20:28:16.5947082Z TASK [nfs : Criar variáveis] ***************************************************
2026-09-22T20:28:16.5947524Z ok: [caddeapllx2193.agil.nprd.caixa.gov.br]
2026-09-22T20:28:16.5984032Z Tuesday 22 September 2026  17:28:16 -0300 (0:00:00.059)       0:00:01.256 ***** 
2026-09-22T20:28:16.9963452Z 
2026-09-22T20:28:16.9964693Z TASK [nfs : Coletar variáveis de ambiente] *************************************
2026-09-22T20:28:16.9964954Z ok: [caddeapllx2193.agil.nprd.caixa.gov.br]
2026-09-22T20:28:16.9989202Z Tuesday 22 September 2026  17:28:16 -0300 (0:00:00.400)       0:00:01.656 ***** 
2026-09-22T20:28:17.0549902Z 
2026-09-22T20:28:17.0550630Z TASK [nfs : Exibir resultado em JSON] ******************************************
2026-09-22T20:28:17.0551798Z ok: [caddeapllx2193.agil.nprd.caixa.gov.br] => {
2026-09-22T20:28:17.0552440Z     "nfs_vars_json": {
2026-09-22T20:28:17.0552602Z         "changed": false, 
2026-09-22T20:28:17.0552931Z         "cmd": "cat /opt/ads-agent/_work/r11946/a/nfs_config.json", 
2026-09-22T20:28:17.0553090Z         "delta": "0:00:00.002884", 
2026-09-22T20:28:17.0553289Z         "end": "2026-09-22 17:28:16.982036", 
2026-09-22T20:28:17.0553415Z         "failed": false, 
2026-09-22T20:28:17.0553522Z         "rc": 0, 
2026-09-22T20:28:17.0553718Z         "start": "2026-09-22 17:28:16.979152", 
2026-09-22T20:28:17.0553836Z         "stderr": "", 
2026-09-22T20:28:17.0553946Z         "stderr_lines": [], 
2026-09-22T20:28:17.0554476Z         "stdout": "[{\"NFS_ENDPOINT_VM\": \"192.168.227.59:/export/sigdb/sicql\",\"NFS_MOUNT_POINT_VM\": \"/opt/sigdb\"},{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC\",\"NFS_MOUNT_POINT_ISILON\": \"/integracoes/SIEXC\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC\",\"NFS_MOUNT_POINT_ISILON_3\": \"/integracoes/SIAPC\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_2\": \"/integracoes/SIISF\"},{\"NFS_ENDPOINT_ISILON_4\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC/SWIFT\",\"NFS_MOUNT_POINT_ISILON_4\": \"/SWIFT\"},{\"NFS_ENDPOINT_VM_2\": \"192.168.227.59:/export/sigdb/sitec\",\"NFS_MOUNT_POINT_VM_2\": \"/opt/sigdb/sitec\"},{\"NFS_ENDPOINT_VM_3\": \"192.168.227.59:/export/sicql_bovespa\",\"NFS_MOUNT_POINT_VM_3\": \"/opt/jboss/bovespa\"},{\"NFS_ENDPOINT_VM_4\": \"192.168.227.59:/export/upload_prd\",\"NFS_MOUNT_POINT_VM_4\": \"/upload\"}]", 
2026-09-22T20:28:17.0555022Z         "stdout_lines": [
2026-09-22T20:28:17.0555544Z             "[{\"NFS_ENDPOINT_VM\": \"192.168.227.59:/export/sigdb/sicql\",\"NFS_MOUNT_POINT_VM\": \"/opt/sigdb\"},{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC\",\"NFS_MOUNT_POINT_ISILON\": \"/integracoes/SIEXC\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC\",\"NFS_MOUNT_POINT_ISILON_3\": \"/integracoes/SIAPC\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_2\": \"/integracoes/SIISF\"},{\"NFS_ENDPOINT_ISILON_4\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC/SWIFT\",\"NFS_MOUNT_POINT_ISILON_4\": \"/SWIFT\"},{\"NFS_ENDPOINT_VM_2\": \"192.168.227.59:/export/sigdb/sitec\",\"NFS_MOUNT_POINT_VM_2\": \"/opt/sigdb/sitec\"},{\"NFS_ENDPOINT_VM_3\": \"192.168.227.59:/export/sicql_bovespa\",\"NFS_MOUNT_POINT_VM_3\": \"/opt/jboss/bovespa\"},{\"NFS_ENDPOINT_VM_4\": \"192.168.227.59:/export/upload_prd\",\"NFS_MOUNT_POINT_VM_4\": \"/upload\"}]"
2026-09-22T20:28:17.0556334Z         ]
2026-09-22T20:28:17.0556414Z     }
2026-09-22T20:28:17.0556507Z }
2026-09-22T20:28:17.0576903Z Tuesday 22 September 2026  17:28:17 -0300 (0:00:00.058)       0:00:01.715 ***** 
2026-09-22T20:28:17.1146296Z 
2026-09-22T20:28:17.1148254Z TASK [nfs : Criar variáveis] ***************************************************
2026-09-22T20:28:17.1149445Z ok: [caddeapllx2193.agil.nprd.caixa.gov.br]
2026-09-22T20:28:17.1185375Z Tuesday 22 September 2026  17:28:17 -0300 (0:00:00.060)       0:00:01.776 ***** 
2026-09-22T20:28:22.9735625Z 
2026-09-22T20:28:22.9736114Z TASK [nfs : execute montagem script] *******************************************
2026-09-22T20:28:22.9745684Z fatal: [caddeapllx2193.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["python", "/opt/ads-agent/_work/r11946/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py", "montagem", "siexc-web-aplicacao", "des", "ctc_nprd", "/opt/ads-agent/_work/r11946/a/esteira-jboss-vm-v2", "C&t@d02", "***", "s736651@corp.caixa.gov.br", "***", "[{\"NFS_ENDPOINT_VM\": \"192.168.227.59:/export/sigdb/sicql\",\"NFS_MOUNT_POINT_VM\": \"/opt/sigdb\"},{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC\",\"NFS_MOUNT_POINT_ISILON\": \"/integracoes/SIEXC\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC\",\"NFS_MOUNT_POINT_ISILON_3\": \"/integracoes/SIAPC\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_2\": \"/integracoes/SIISF\"},{\"NFS_ENDPOINT_ISILON_4\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC/SWIFT\",\"NFS_MOUNT_POINT_ISILON_4\": \"/SWIFT\"},{\"NFS_ENDPOINT_VM_2\": \"192.168.227.59:/export/sigdb/sitec\",\"NFS_MOUNT_POINT_VM_2\": \"/opt/sigdb/sitec\"},{\"NFS_ENDPOINT_VM_3\": \"192.168.227.59:/export/sicql_bovespa\",\"NFS_MOUNT_POINT_VM_3\": \"/opt/jboss/bovespa\"},{\"NFS_ENDPOINT_VM_4\": \"192.168.227.59:/export/upload_prd\",\"NFS_MOUNT_POINT_VM_4\": \"/upload\"}]"], "delta": "0:00:05.561083", "end": "2026-09-22 17:28:22.957065", "msg": "non-zero return code", "rc": 1, "start": "2026-09-22 17:28:17.395982", "stderr": "Traceback (most recent call last):\n  File \"/opt/ads-agent/_work/r11946/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py\", line 612, in <module>\n    mount(nfs_endpoints,nfs_mount_points)\n  File \"/opt/ads-agent/_work/r11946/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py\", line 475, in mount\n    configuracao_nfs, nfs_id = getConfiguracao(zona, endpoint)\n  File \"/opt/ads-agent/_work/r11946/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py\", line 531, in getConfiguracao\n    nfs_export_id = getExportId(zone,path)\n  File \"/opt/ads-agent/_work/r11946/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py\", line 528, in getExportId\n    return api_response_id.exports[0].id\nIndexError: list index out of range", "stderr_lines": ["Traceback (most recent call last):", "  File \"/opt/ads-agent/_work/r11946/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py\", line 612, in <module>", "    mount(nfs_endpoints,nfs_mount_points)", "  File \"/opt/ads-agent/_work/r11946/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py\", line 475, in mount", "    configuracao_nfs, nfs_id = getConfiguracao(zona, endpoint)", "  File \"/opt/ads-agent/_work/r11946/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py\", line 531, in getConfiguracao", "    nfs_export_id = getExportId(zone,path)", "  File \"/opt/ads-agent/_work/r11946/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py\", line 528, in getExportId", "    return api_response_id.exports[0].id", "IndexError: list index out of range"], "stdout": "[{u'NFS_MOUNT_POINT_VM': u'/opt/sigdb', u'NFS_ENDPOINT_VM': u'192.168.227.59:/export/sigdb/sicql'}, {u'NFS_MOUNT_POINT_ISILON': u'/integracoes/SIEXC', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC'}, {u'NFS_MOUNT_POINT_ISILON_3': u'/integracoes/SIAPC', u'NFS_ENDPOINT_ISILON_3': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC'}, {u'NFS_MOUNT_POINT_ISILON_2': u'/integracoes/SIISF', u'NFS_ENDPOINT_ISILON_2': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF'}, {u'NFS_ENDPOINT_ISILON_4': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC/SWIFT', u'NFS_MOUNT_POINT_ISILON_4': u'/SWIFT'}, {u'NFS_ENDPOINT_VM_2': u'192.168.227.59:/export/sigdb/sitec', u'NFS_MOUNT_POINT_VM_2': u'/opt/sigdb/sitec'}, {u'NFS_ENDPOINT_VM_3': u'192.168.227.59:/export/sicql_bovespa', u'NFS_MOUNT_POINT_VM_3': u'/opt/jboss/bovespa'}, {u'NFS_MOUNT_POINT_VM_4': u'/upload', u'NFS_ENDPOINT_VM_4': u'192.168.227.59:/export/upload_prd'}]\nNome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           \n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC /SWIFT                              ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfs_path=/SWIFT\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC /SWIFT                              ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /opt/sigdb/sitec                    ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfs_path=/opt/sigdb/sitec\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /opt/sigdb/sitec                    ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC /integracoes/SIEXC                  ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfs_path=/integracoes/SIEXC\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC /integracoes/SIEXC                  ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC/SWIFT /upload                             ISILON                              nfsctcnprd.ctc.caixa                des                                ", "stdout_lines": ["[{u'NFS_MOUNT_POINT_VM': u'/opt/sigdb', u'NFS_ENDPOINT_VM': u'192.168.227.59:/export/sigdb/sicql'}, {u'NFS_MOUNT_POINT_ISILON': u'/integracoes/SIEXC', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC'}, {u'NFS_MOUNT_POINT_ISILON_3': u'/integracoes/SIAPC', u'NFS_ENDPOINT_ISILON_3': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC'}, {u'NFS_MOUNT_POINT_ISILON_2': u'/integracoes/SIISF', u'NFS_ENDPOINT_ISILON_2': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF'}, {u'NFS_ENDPOINT_ISILON_4': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC/SWIFT', u'NFS_MOUNT_POINT_ISILON_4': u'/SWIFT'}, {u'NFS_ENDPOINT_VM_2': u'192.168.227.59:/export/sigdb/sitec', u'NFS_MOUNT_POINT_VM_2': u'/opt/sigdb/sitec'}, {u'NFS_ENDPOINT_VM_3': u'192.168.227.59:/export/sicql_bovespa', u'NFS_MOUNT_POINT_VM_3': u'/opt/jboss/bovespa'}, {u'NFS_MOUNT_POINT_VM_4': u'/upload', u'NFS_ENDPOINT_VM_4': u'192.168.227.59:/export/upload_prd'}]", "Nome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           ", "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------", "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC /SWIFT                              ISILON                              nfsctcnprd.ctc.caixa                des                                ", "nfs_path=/SWIFT", "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC", "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC /SWIFT                              ISILON                              nfsctcnprd.ctc.caixa                des                                ", "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /opt/sigdb/sitec                    ISILON                              nfsctcnprd.ctc.caixa                des                                ", "nfs_path=/opt/sigdb/sitec", "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF", "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /opt/sigdb/sitec                    ISILON                              nfsctcnprd.ctc.caixa                des                                ", "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC /integracoes/SIEXC                  ISILON                              nfsctcnprd.ctc.caixa                des                                ", "nfs_path=/integracoes/SIEXC", "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC", "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC /integracoes/SIEXC                  ISILON                              nfsctcnprd.ctc.caixa                des                                ", "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC/SWIFT /upload                             ISILON                              nfsctcnprd.ctc.caixa                des                                "]}
2026-09-22T20:28:22.9749772Z 
2026-09-22T20:28:22.9749919Z PLAY RECAP *********************************************************************
2026-09-22T20:28:22.9750104Z caddeapllx2193.agil.nprd.caixa.gov.br : ok=7    changed=0    unreachable=0    failed=1    skipped=0    rescued=0    ignored=0   
2026-09-22T20:28:22.9750190Z 
2026-09-22T20:28:22.9750415Z Tuesday 22 September 2026  17:28:22 -0300 (0:00:05.855)       0:00:07.631 ***** 
2026-09-22T20:28:22.9750589Z =============================================================================== 
2026-09-22T20:28:22.9750814Z nfs : execute montagem script ------------------------------------------- 5.86s
2026-09-22T20:28:22.9751038Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.48s
2026-09-22T20:28:22.9751261Z nfs : Coletar variáveis de ambiente ------------------------------------- 0.40s
2026-09-22T20:28:22.9751484Z Verifica se o arquivo nfs_config.json existe ---------------------------- 0.29s
2026-09-22T20:28:22.9751699Z nfs : Criar variáveis --------------------------------------------------- 0.06s
2026-09-22T20:28:22.9751916Z nfs : Criar variáveis --------------------------------------------------- 0.06s
2026-09-22T20:28:22.9752132Z nfs : Exibir resultado em JSON ------------------------------------------ 0.06s
2026-09-22T20:28:22.9752343Z nfs : include_tasks ----------------------------------------------------- 0.05s
2026-09-22T20:28:22.9752484Z Playbook run took 0 days, 0 hours, 0 minutes, 7 seconds
2026-09-22T20:28:23.0260806Z ##[debug]Exit code 2 received from tool '/bin/bash'
2026-09-22T20:28:23.0262987Z ##[debug]STDIO streams have closed for tool '/bin/bash'
2026-09-22T20:28:23.0289133Z ##[error]Bash exited with code '2'.
2026-09-22T20:28:23.0289959Z ##[debug]Processed: ##vso[task.issue type=error;]Bash exited with code '2'.
2026-09-22T20:28:23.0290380Z ##[debug]task result: Failed
2026-09-22T20:28:23.0291186Z ##[debug]Processed: ##vso[task.complete result=Failed;done=true;]
2026-09-22T20:28:23.0305876Z ##[section]Finishing: Deploy Config no JBOSS
