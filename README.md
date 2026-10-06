2026-10-06T13:15:42.5354774Z ##[debug]Evaluating condition for step: 'Configura Control-M'
2026-10-06T13:15:42.5355303Z ##[debug]Evaluating: succeeded()
2026-10-06T13:15:42.5355470Z ##[debug]Evaluating succeeded:
2026-10-06T13:15:42.5355759Z ##[debug]=> True
2026-10-06T13:15:42.5355970Z ##[debug]Result: True
2026-10-06T13:15:42.5356178Z ##[section]Starting: Configura Control-M
2026-10-06T13:15:42.5359202Z ==============================================================================
2026-10-06T13:15:42.5359286Z Task         : Bash
2026-10-06T13:15:42.5359327Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-06T13:15:42.5359404Z Version      : 3.227.0
2026-10-06T13:15:42.5359449Z Author       : Microsoft Corporation
2026-10-06T13:15:42.5359503Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-06T13:15:42.5359587Z ==============================================================================
2026-10-06T13:15:43.3483264Z ##[debug]Invoking Method: System.Threading.Tasks.Task <RunAsync>b__9(). Attempt count: 0
2026-10-06T13:15:43.3523927Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-10-06T13:15:43.4211340Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-10-06T13:15:43.4218547Z ##[debug]loading inputs and endpoints
2026-10-06T13:15:43.4222414Z ##[debug]loading INPUT_TARGETTYPE
2026-10-06T13:15:43.4232348Z ##[debug]loading INPUT_FILEPATH
2026-10-06T13:15:43.4234101Z ##[debug]loading INPUT_SCRIPT
2026-10-06T13:15:43.4263590Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-10-06T13:15:43.4318822Z ##[debug]loading INPUT_FAILONSTDERR
2026-10-06T13:15:43.4319296Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-10-06T13:15:43.4319696Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-10-06T13:15:43.4320124Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-10-06T13:15:43.4320528Z ##[debug]loading SECRET_SENHASERVICO
2026-10-06T13:15:43.4320910Z ##[debug]loading SECRET_OKD_TOKEN_PRODUTOS
2026-10-06T13:15:43.4321296Z ##[debug]loading SECRET_TOKEN_CRQ
2026-10-06T13:15:43.4321675Z ##[debug]loading SECRET_FORTIFY_PASS
2026-10-06T13:15:43.4322056Z ##[debug]loading SECRET_AZPAT
2026-10-06T13:15:43.4322435Z ##[debug]loading SECRET_TOKEN_INFRAFACIL_MUDANCA
2026-10-06T13:15:43.4322904Z ##[debug]loading SECRET_ARM_ACCESS_KEY
2026-10-06T13:15:43.4323293Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-10-06T13:15:43.4323677Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-10-06T13:15:43.4324053Z ##[debug]loading SECRET_ANSIBLE_VAULT
2026-10-06T13:15:43.4324417Z ##[debug]loading SECRET_PW_ISILON
2026-10-06T13:15:43.4324792Z ##[debug]loading SECRET_PW_ALOCAIP
2026-10-06T13:15:43.4325200Z ##[debug]loading SECRET_CV_SENHAORACLE
2026-10-06T13:15:43.4325646Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-10-06T13:15:43.4326025Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-10-06T13:15:43.4326413Z ##[debug]loading SECRET_TERRAFORM_ESX_PASSWORD
2026-10-06T13:15:43.4326787Z ##[debug]loaded 24
2026-10-06T13:15:43.4327154Z ##[debug]Agent.ProxyUrl=undefined
2026-10-06T13:15:43.4327535Z ##[debug]Agent.CAInfo=undefined
2026-10-06T13:15:43.4327943Z ##[debug]Agent.ClientCert=undefined
2026-10-06T13:15:43.4328316Z ##[debug]Agent.SkipCertValidation=True
2026-10-06T13:15:43.4328734Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-10-06T13:15:43.4329205Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-10-06T13:15:43.4329638Z ##[debug]system.culture=en-US
2026-10-06T13:15:43.4330006Z ##[debug]failOnStderr=false
2026-10-06T13:15:43.4330378Z ##[debug]workingDirectory=/opt/ads-agent/_work/r12267/a
2026-10-06T13:15:43.4330799Z ##[debug]check path : /opt/ads-agent/_work/r12267/a
2026-10-06T13:15:43.4331178Z ##[debug]targetType=inline
2026-10-06T13:15:43.4331541Z ##[debug]bashEnvValue=undefined
2026-10-06T13:15:43.4332225Z ##[debug]script=REPO=$(echo _SICCV-batch | sed 's/_//')
ansible-playbook /opt/ads-agent/_work/r12267/a/esteira-jboss-vm-v2/site.yml --tags controlm,nfs --skip-tags "vm,dns,monitoracao,apache,git_conf,jboss,restart_jboss,stop_jboss,tsm" -e sistema_ambiente=tqs -e sistema_nome=SICCV-batch -e site=ctc_nprd -e centralizadora_operacoes=7261 -e centralizadora_desenvolvimento=7266 -e default_working_directory_tfs=/opt/ads-agent/_work/r12267/a -e build_repository_name_tfs=$REPO -e CTMSHOST=crjdeaprlx038 -e CTMPERMHOSTS=crjdeaprlx038,crjdeaprlx039 -e ATCMNDATA=18007 -e AGCMNDATA=18008
2026-10-06T13:15:43.4333004Z Generating script.
2026-10-06T13:15:43.4333415Z ##[debug]which 'bash'
2026-10-06T13:15:43.4334200Z ##[debug]found: '/bin/bash'
2026-10-06T13:15:43.4334473Z ##[debug]Agent.Version=3.225.2
2026-10-06T13:15:43.4334728Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-10-06T13:15:43.4334994Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-10-06T13:15:43.4335181Z ========================== Starting Command Output ===========================
2026-10-06T13:15:43.4335409Z ##[debug]which '/bin/bash'
2026-10-06T13:15:43.4336067Z ##[debug]found: '/bin/bash'
2026-10-06T13:15:43.4336344Z ##[debug]/bin/bash arg: /opt/ads-agent/_work/_temp/9ef6914e-59f0-4548-adc1-4879b596fd07.sh
2026-10-06T13:15:43.4336602Z ##[debug]exec tool: /bin/bash
2026-10-06T13:15:43.4336834Z ##[debug]arguments:
2026-10-06T13:15:43.4338084Z ##[debug]   /opt/ads-agent/_work/_temp/9ef6914e-59f0-4548-adc1-4879b596fd07.sh
2026-10-06T13:15:43.4338482Z [command]/bin/bash /opt/ads-agent/_work/_temp/9ef6914e-59f0-4548-adc1-4879b596fd07.sh
2026-10-06T13:15:45.4921579Z 
2026-10-06T13:15:45.4922046Z PLAY [local] *******************************************************************
2026-10-06T13:15:45.5188401Z 
2026-10-06T13:15:45.5188619Z PLAY [Configurando o DNS] ******************************************************
2026-10-06T13:15:45.7009548Z 
2026-10-06T13:15:45.7010052Z PLAY [local] *******************************************************************
2026-10-06T13:15:45.7044171Z 
2026-10-06T13:15:45.7044529Z PLAY [Verificando serviços] ****************************************************
2026-10-06T13:15:45.7131983Z 
2026-10-06T13:15:45.7132207Z PLAY [Configuração LDAP] *******************************************************
2026-10-06T13:15:45.7166370Z [WARNING]: Found variable using reserved name: when
2026-10-06T13:15:45.7171853Z 
2026-10-06T13:15:45.7172078Z PLAY [jboss] *******************************************************************
2026-10-06T13:15:45.7263611Z 
2026-10-06T13:15:45.7263873Z PLAY [Stack Jboss] *************************************************************
2026-10-06T13:15:45.7289840Z 
2026-10-06T13:15:45.7290118Z PLAY [jboss] *******************************************************************
2026-10-06T13:15:45.7330216Z 
2026-10-06T13:15:45.7330392Z PLAY [jboss] *******************************************************************
2026-10-06T13:15:45.7603981Z Tuesday 06 October 2026  10:15:45 -0300 (0:00:00.328)       0:00:00.328 ******* 
2026-10-06T13:15:46.3422225Z 
2026-10-06T13:15:46.3422666Z TASK [Verifica se o arquivo nfs_config.json existe] ****************************
2026-10-06T13:15:46.3423112Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-06T13:15:46.3438580Z Tuesday 06 October 2026  10:15:46 -0300 (0:00:00.583)       0:00:00.911 ******* 
2026-10-06T13:15:46.3906915Z included: /opt/ads-agent/_work/r12267/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for caddeapllx2821.agil.nprd.caixa.gov.br
2026-10-06T13:15:46.3948212Z Tuesday 06 October 2026  10:15:46 -0300 (0:00:00.051)       0:00:00.962 ******* 
2026-10-06T13:15:46.4527956Z 
2026-10-06T13:15:46.4528629Z TASK [nfs : Criar variáveis] ***************************************************
2026-10-06T13:15:46.4528801Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-06T13:15:46.4576124Z Tuesday 06 October 2026  10:15:46 -0300 (0:00:00.062)       0:00:01.025 ******* 
2026-10-06T13:15:46.9283944Z 
2026-10-06T13:15:46.9284986Z TASK [nfs : Coletar variáveis de ambiente] *************************************
2026-10-06T13:15:46.9285544Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-06T13:15:46.9319790Z Tuesday 06 October 2026  10:15:46 -0300 (0:00:00.474)       0:00:01.499 ******* 
2026-10-06T13:15:46.9880736Z 
2026-10-06T13:15:46.9881459Z TASK [nfs : Exibir resultado em JSON] ******************************************
2026-10-06T13:15:46.9883514Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-06T13:15:46.9883862Z     "nfs_vars_json": {
2026-10-06T13:15:46.9884527Z         "changed": false, 
2026-10-06T13:15:46.9884890Z         "cmd": "cat /opt/ads-agent/_work/r12267/a/nfs_config.json", 
2026-10-06T13:15:46.9885054Z         "delta": "0:00:00.043138", 
2026-10-06T13:15:46.9885225Z         "end": "2026-10-06 10:15:46.911683", 
2026-10-06T13:15:46.9885349Z         "failed": false, 
2026-10-06T13:15:46.9885459Z         "rc": 0, 
2026-10-06T13:15:46.9885648Z         "start": "2026-10-06 10:15:46.868545", 
2026-10-06T13:15:46.9885773Z         "stderr": "", 
2026-10-06T13:15:46.9885880Z         "stderr_lines": [], 
2026-10-06T13:15:46.9886024Z         "stdout": "[{\"NFS_ENDPOINT_VM\": \"hypernprd12.ad.caixa:/fs_siccv\",\"NFS_MOUNT_POINT_VM\": \"/SICCV\"}]", 
2026-10-06T13:15:46.9886179Z         "stdout_lines": [
2026-10-06T13:15:46.9886326Z             "[{\"NFS_ENDPOINT_VM\": \"hypernprd12.ad.caixa:/fs_siccv\",\"NFS_MOUNT_POINT_VM\": \"/SICCV\"}]"
2026-10-06T13:15:46.9886459Z         ]
2026-10-06T13:15:46.9886549Z     }
2026-10-06T13:15:46.9886641Z }
2026-10-06T13:15:46.9914647Z Tuesday 06 October 2026  10:15:46 -0300 (0:00:00.059)       0:00:01.559 ******* 
2026-10-06T13:15:47.0510195Z 
2026-10-06T13:15:47.0510895Z TASK [nfs : Criar variáveis] ***************************************************
2026-10-06T13:15:47.0511068Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-06T13:15:47.0557337Z Tuesday 06 October 2026  10:15:47 -0300 (0:00:00.064)       0:00:01.623 ******* 
2026-10-06T13:15:47.7386191Z 
2026-10-06T13:15:47.7386696Z TASK [nfs : execute montagem script] *******************************************
2026-10-06T13:15:47.7386858Z changed: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-06T13:15:47.7419282Z Tuesday 06 October 2026  10:15:47 -0300 (0:00:00.686)       0:00:02.309 ******* 
2026-10-06T13:15:47.8003661Z 
2026-10-06T13:15:47.8004114Z TASK [nfs : ansible.builtin.debug] *********************************************
2026-10-06T13:15:47.8007090Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-06T13:15:47.8007263Z     "changed": false, 
2026-10-06T13:15:47.8007419Z     "msg": {
2026-10-06T13:15:47.8007536Z         "changed": true, 
2026-10-06T13:15:47.8007646Z         "cmd": [
2026-10-06T13:15:47.8007750Z             "python", 
2026-10-06T13:15:47.8007987Z             "/opt/ads-agent/_work/r12267/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py", 
2026-10-06T13:15:47.8008136Z             "montagem", 
2026-10-06T13:15:47.8008275Z             "SICCV-batch", 
2026-10-06T13:15:47.8008380Z             "tqs", 
2026-10-06T13:15:47.8008481Z             "ctc_nprd", 
2026-10-06T13:15:47.8008662Z             "/opt/ads-agent/_work/r12267/a/esteira-jboss-vm-v2", 
2026-10-06T13:15:47.8008789Z             "C&t@d02", 
2026-10-06T13:15:47.8008963Z             "***", 
2026-10-06T13:15:47.8009075Z             "s736651@corp.caixa.gov.br", 
2026-10-06T13:15:47.8009191Z             "***", 
2026-10-06T13:15:47.8009337Z             "[{\"NFS_ENDPOINT_VM\": \"hypernprd12.ad.caixa:/fs_siccv\",\"NFS_MOUNT_POINT_VM\": \"/SICCV\"}]"
2026-10-06T13:15:47.8009469Z         ], 
2026-10-06T13:15:47.8009596Z         "delta": "0:00:00.341829", 
2026-10-06T13:15:47.8009763Z         "end": "2026-10-06 10:15:47.720963", 
2026-10-06T13:15:47.8009882Z         "failed": false, 
2026-10-06T13:15:47.8009985Z         "rc": 0, 
2026-10-06T13:15:47.8010150Z         "start": "2026-10-06 10:15:47.379134", 
2026-10-06T13:15:47.8010271Z         "stderr": "", 
2026-10-06T13:15:47.8010368Z         "stderr_lines": [], 
2026-10-06T13:15:47.8011301Z         "stdout": "[{u'NFS_MOUNT_POINT_VM': u'/SICCV', u'NFS_ENDPOINT_VM': u'hypernprd12.ad.caixa:/fs_siccv'}]\nNome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           \n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\nhypernprd12.ad.caixa                /fs_siccv                           /SICCV                              VM                                  hypernprd12.ad.caixa                tqs                                \nnfs_path=/SICCV\nnfs_src=hypernprd12.ad.caixa:/fs_siccv\nhypernprd12.ad.caixa                /fs_siccv                           /SICCV                              VM                                  hypernprd12.ad.caixa                tqs                                ", 
2026-10-06T13:15:47.8011968Z         "stdout_lines": [
2026-10-06T13:15:47.8012198Z             "[{u'NFS_MOUNT_POINT_VM': u'/SICCV', u'NFS_ENDPOINT_VM': u'hypernprd12.ad.caixa:/fs_siccv'}]", 
2026-10-06T13:15:47.8012376Z             "Nome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           ", 
2026-10-06T13:15:47.8012809Z             "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------", 
2026-10-06T13:15:47.8013110Z             "hypernprd12.ad.caixa                /fs_siccv                           /SICCV                              VM                                  hypernprd12.ad.caixa                tqs                                ", 
2026-10-06T13:15:47.8013261Z             "nfs_path=/SICCV", 
2026-10-06T13:15:47.8013383Z             "nfs_src=hypernprd12.ad.caixa:/fs_siccv", 
2026-10-06T13:15:47.8013540Z             "hypernprd12.ad.caixa                /fs_siccv                           /SICCV                              VM                                  hypernprd12.ad.caixa                tqs                                "
2026-10-06T13:15:47.8013669Z         ]
2026-10-06T13:15:47.8013760Z     }
2026-10-06T13:15:47.8013852Z }
2026-10-06T13:15:47.8038001Z Tuesday 06 October 2026  10:15:47 -0300 (0:00:00.061)       0:00:02.371 ******* 
2026-10-06T13:15:48.1409221Z 
2026-10-06T13:15:48.1409761Z TASK [nfs : execute clean json] ************************************************
2026-10-06T13:15:48.1413532Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-10-06T13:15:48.1414299Z caddeapllx2821.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-10-06T13:15:48.1414504Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-10-06T13:15:48.1414674Z releases. A future Ansible release will default to using the discovered 
2026-10-06T13:15:48.1414844Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-10-06T13:15:48.1415036Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-10-06T13:15:48.1415205Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-10-06T13:15:48.1415349Z setting deprecation_warnings=False in ansible.cfg.
2026-10-06T13:15:48.1415495Z changed: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-06T13:15:48.1445369Z Tuesday 06 October 2026  10:15:48 -0300 (0:00:00.340)       0:00:02.712 ******* 
2026-10-06T13:15:48.2026812Z 
2026-10-06T13:15:48.2027488Z TASK [nfs : result_new_string_json] ********************************************
2026-10-06T13:15:48.2030232Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-06T13:15:48.2030567Z     "msg": {
2026-10-06T13:15:48.2031023Z         "ansible_facts": {
2026-10-06T13:15:48.2031218Z             "discovered_interpreter_python": "/usr/bin/python"
2026-10-06T13:15:48.2031341Z         }, 
2026-10-06T13:15:48.2031450Z         "changed": true, 
2026-10-06T13:15:48.2032323Z         "cmd": "echo '[{\"NFS_ENDPOINT_VM\": \"hypernprd12.ad.caixa:/fs_siccv\",\"NFS_MOUNT_POINT_VM\": \"/SICCV\"}]' | sed 's/NFS_ENDPOINT_ISILON[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_ISILON[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_HUAWEI[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_HUAWEI[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_VM[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_VM[^\"]*/NFS_MOUNT_POINT/g'", 
2026-10-06T13:15:48.2032614Z         "delta": "0:00:00.003488", 
2026-10-06T13:15:48.2032835Z         "deprecations": [
2026-10-06T13:15:48.2032956Z             {
2026-10-06T13:15:48.2033504Z                 "msg": "Distribution rhel 9.3 on host caddeapllx2821.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, but is using /usr/bin/python for backward compatibility with prior Ansible releases. A future Ansible release will default to using the discovered platform python for this host. See https://docs.ansible.com/ansible/2.9/reference_appendices/interpreter_discovery.html for more information", 
2026-10-06T13:15:48.2033801Z                 "version": "2.12"
2026-10-06T13:15:48.2033903Z             }
2026-10-06T13:15:48.2033997Z         ], 
2026-10-06T13:15:48.2034161Z         "end": "2026-10-06 10:15:48.120128", 
2026-10-06T13:15:48.2034276Z         "failed": false, 
2026-10-06T13:15:48.2034382Z         "rc": 0, 
2026-10-06T13:15:48.2034548Z         "start": "2026-10-06 10:15:48.116640", 
2026-10-06T13:15:48.2034761Z         "stderr": "", 
2026-10-06T13:15:48.2034870Z         "stderr_lines": [], 
2026-10-06T13:15:48.2035021Z         "stdout": "[{\"NFS_ENDPOINT\": \"hypernprd12.ad.caixa:/fs_siccv\",\"NFS_MOUNT_POINT\": \"/SICCV\"}]", 
2026-10-06T13:15:48.2035155Z         "stdout_lines": [
2026-10-06T13:15:48.2035294Z             "[{\"NFS_ENDPOINT\": \"hypernprd12.ad.caixa:/fs_siccv\",\"NFS_MOUNT_POINT\": \"/SICCV\"}]"
2026-10-06T13:15:48.2035420Z         ]
2026-10-06T13:15:48.2035510Z     }
2026-10-06T13:15:48.2035600Z }
2026-10-06T13:15:48.2059982Z Tuesday 06 October 2026  10:15:48 -0300 (0:00:00.061)       0:00:02.773 ******* 
2026-10-06T13:15:48.2628909Z 
2026-10-06T13:15:48.2629233Z TASK [nfs : Parse JSON data] ***************************************************
2026-10-06T13:15:48.2629404Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-06T13:15:48.2657206Z Tuesday 06 October 2026  10:15:48 -0300 (0:00:00.059)       0:00:02.833 ******* 
2026-10-06T13:15:48.3217656Z 
2026-10-06T13:15:48.3218080Z TASK [nfs : result_new_json] ***************************************************
2026-10-06T13:15:48.3218962Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-06T13:15:48.3219104Z     "msg": [
2026-10-06T13:15:48.3219202Z         {
2026-10-06T13:15:48.3219322Z             "NFS_ENDPOINT": "hypernprd12.ad.caixa:/fs_siccv", 
2026-10-06T13:15:48.3219457Z             "NFS_MOUNT_POINT": "/SICCV"
2026-10-06T13:15:48.3219550Z         }
2026-10-06T13:15:48.3219643Z     ]
2026-10-06T13:15:48.3219737Z }
2026-10-06T13:15:48.3248710Z Tuesday 06 October 2026  10:15:48 -0300 (0:00:00.059)       0:00:02.892 ******* 
2026-10-06T13:15:48.3864304Z included: /opt/ads-agent/_work/r12267/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx2821.agil.nprd.caixa.gov.br
2026-10-06T13:15:48.3915446Z Tuesday 06 October 2026  10:15:48 -0300 (0:00:00.066)       0:00:02.959 ******* 
2026-10-06T13:15:48.4448027Z 
2026-10-06T13:15:48.4448263Z TASK [nfs : Parse JSON data] ***************************************************
2026-10-06T13:15:48.4448480Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-06T13:15:48.4477452Z Tuesday 06 October 2026  10:15:48 -0300 (0:00:00.056)       0:00:03.015 ******* 
2026-10-06T13:15:48.5006208Z 
2026-10-06T13:15:48.5006717Z TASK [nfs : debug] *************************************************************
2026-10-06T13:15:48.5007948Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-06T13:15:48.5008258Z     "msg": {
2026-10-06T13:15:48.5008407Z         "NFS_ENDPOINT": "hypernprd12.ad.caixa:/fs_siccv", 
2026-10-06T13:15:48.5008537Z         "NFS_MOUNT_POINT": "/SICCV"
2026-10-06T13:15:48.5008892Z     }
2026-10-06T13:15:48.5008983Z }
2026-10-06T13:15:48.5037697Z Tuesday 06 October 2026  10:15:48 -0300 (0:00:00.056)       0:00:03.071 ******* 
2026-10-06T13:15:48.5574182Z 
2026-10-06T13:15:48.5574510Z TASK [nfs : debug] *************************************************************
2026-10-06T13:15:48.5575480Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-06T13:15:48.5575925Z     "msg": "/SICCV"
2026-10-06T13:15:48.5576097Z }
2026-10-06T13:15:48.5604593Z Tuesday 06 October 2026  10:15:48 -0300 (0:00:00.056)       0:00:03.128 ******* 
2026-10-06T13:15:48.6132350Z 
2026-10-06T13:15:48.6132618Z TASK [nfs : debug] *************************************************************
2026-10-06T13:15:48.6133547Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-06T13:15:48.6133690Z     "msg": "hypernprd12.ad.caixa:/fs_siccv"
2026-10-06T13:15:48.6133810Z }
2026-10-06T13:15:48.6173547Z Tuesday 06 October 2026  10:15:48 -0300 (0:00:00.056)       0:00:03.185 ******* 
2026-10-06T13:15:48.6726531Z 
2026-10-06T13:15:48.6727043Z TASK [nfs : Verificando as variaveis] ******************************************
2026-10-06T13:15:48.6727480Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-06T13:15:48.6727615Z     "changed": false, 
2026-10-06T13:15:48.6727736Z     "msg": "All assertions passed"
2026-10-06T13:15:48.6727831Z }
2026-10-06T13:15:48.6759364Z Tuesday 06 October 2026  10:15:48 -0300 (0:00:00.058)       0:00:03.243 ******* 
2026-10-06T13:15:51.9761574Z 
2026-10-06T13:15:51.9762085Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-10-06T13:15:51.9762251Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-06T13:15:51.9797358Z Tuesday 06 October 2026  10:15:51 -0300 (0:00:03.303)       0:00:06.547 ******* 
2026-10-06T13:15:54.5960933Z 
2026-10-06T13:15:54.5961423Z TASK [nfs : Install networker lgtoclnt_url] ************************************
2026-10-06T13:15:54.6014144Z [WARNING]: Consider using the yum, dnf or zypper module rather than running
2026-10-06T13:15:54.6014531Z 'rpm'.  If you need to use command because yum, dnf or zypper is insufficient
2026-10-06T13:15:54.6014766Z you can add 'warn: false' to this command task or set 'command_warnings=False'
2026-10-06T13:15:54.6014919Z in ansible.cfg to get rid of this message.
2026-10-06T13:15:54.6015066Z changed: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-06T13:15:54.6015339Z Tuesday 06 October 2026  10:15:54 -0300 (0:00:02.619)       0:00:09.167 ******* 
2026-10-06T13:15:56.7820816Z 
2026-10-06T13:15:56.7821306Z TASK [nfs : Install networker lgtonmda_url] ************************************
2026-10-06T13:15:56.7822080Z changed: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-06T13:15:56.7859686Z Tuesday 06 October 2026  10:15:56 -0300 (0:00:02.186)       0:00:11.353 ******* 
2026-10-06T13:15:57.1795902Z 
2026-10-06T13:15:57.1796596Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-10-06T13:15:57.1796759Z changed: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-06T13:15:57.1853546Z Tuesday 06 October 2026  10:15:57 -0300 (0:00:00.396)       0:00:11.750 ******* 
2026-10-06T13:15:57.4225057Z 
2026-10-06T13:15:57.4225431Z TASK [nfs : Create a symbolic link] ********************************************
2026-10-06T13:15:57.4225598Z changed: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-06T13:15:57.4259612Z Tuesday 06 October 2026  10:15:57 -0300 (0:00:00.243)       0:00:11.993 ******* 
2026-10-06T13:15:58.5073184Z 
2026-10-06T13:15:58.5073964Z TASK [nfs : Networker | Start networker] ***************************************
2026-10-06T13:15:58.5074206Z changed: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-06T13:15:58.5111177Z Tuesday 06 October 2026  10:15:58 -0300 (0:00:01.085)       0:00:13.079 ******* 
2026-10-06T13:15:58.7565639Z 
2026-10-06T13:15:58.7566571Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-10-06T13:15:58.7566787Z changed: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-06T13:15:58.7595586Z Tuesday 06 October 2026  10:15:58 -0300 (0:00:00.248)       0:00:13.327 ******* 
2026-10-06T13:18:59.3147144Z 
2026-10-06T13:18:59.3147697Z TASK [nfs : Networker | Restart networker] *************************************
2026-10-06T13:18:59.3147893Z changed: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-06T13:18:59.3174365Z Tuesday 06 October 2026  10:18:59 -0300 (0:03:00.557)       0:03:13.885 ******* 
2026-10-06T13:21:11.8321731Z 
2026-10-06T13:21:11.8322446Z TASK [nfs : Montando volume remoto] ********************************************
2026-10-06T13:21:11.8322940Z fatal: [caddeapllx2821.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "msg": "Error mounting /SICCV: mount.nfs: No route to host\n"}
2026-10-06T13:21:11.8326596Z ...ignoring
2026-10-06T13:21:11.8358665Z Tuesday 06 October 2026  10:21:11 -0300 (0:02:12.518)       0:05:26.403 ******* 
2026-10-06T13:21:11.8974708Z 
2026-10-06T13:21:11.8975239Z TASK [nfs : Validando Montagem] ************************************************
2026-10-06T13:21:11.8975501Z fatal: [caddeapllx2821.agil.nprd.caixa.gov.br]: FAILED! => {
2026-10-06T13:21:11.8975758Z     "assertion": "'Connection refused' in mountnfs.msg", 
2026-10-06T13:21:11.8975933Z     "changed": false, 
2026-10-06T13:21:11.8976696Z     "evaluated_to": false, 
2026-10-06T13:21:11.8976837Z     "msg": "Erro desconhecido: Error mounting /SICCV: mount.nfs: No route to host\n"
2026-10-06T13:21:11.8977018Z }
2026-10-06T13:21:11.8982989Z 
2026-10-06T13:21:11.8983369Z PLAY RECAP *********************************************************************
2026-10-06T13:21:11.8983580Z caddeapllx2821.agil.nprd.caixa.gov.br : ok=27   changed=9    unreachable=0    failed=1    skipped=0    rescued=0    ignored=1   
2026-10-06T13:21:11.8983688Z 
2026-10-06T13:21:11.8984815Z Tuesday 06 October 2026  10:21:11 -0300 (0:00:00.062)       0:05:26.466 ******* 
2026-10-06T13:21:11.8985205Z =============================================================================== 
2026-10-06T13:21:11.8986416Z nfs : Networker | Restart networker ----------------------------------- 180.56s
2026-10-06T13:21:11.8986715Z nfs : Montando volume remoto ------------------------------------------ 132.52s
2026-10-06T13:21:11.8986949Z nfs : Instalando o NFS Client ------------------------------------------- 3.30s
2026-10-06T13:21:11.8987182Z nfs : Install networker lgtoclnt_url ------------------------------------ 2.62s
2026-10-06T13:21:11.8987412Z nfs : Install networker lgtonmda_url ------------------------------------ 2.19s
2026-10-06T13:21:11.8987629Z nfs : Networker | Start networker --------------------------------------- 1.09s
2026-10-06T13:21:11.8987855Z nfs : execute montagem script ------------------------------------------- 0.69s
2026-10-06T13:21:11.8988085Z Verifica se o arquivo nfs_config.json existe ---------------------------- 0.58s
2026-10-06T13:21:11.8988365Z nfs : Coletar variáveis de ambiente ------------------------------------- 0.47s
2026-10-06T13:21:11.8988607Z nfs : Remove pacote jbcs-httpd ------------------------------------------ 0.40s
2026-10-06T13:21:11.8988832Z nfs : execute clean json ------------------------------------------------ 0.34s
2026-10-06T13:21:11.8989052Z nfs : Executar o comando abaixo para limitar as portas ------------------ 0.25s
2026-10-06T13:21:11.8989267Z nfs : Create a symbolic link -------------------------------------------- 0.24s
2026-10-06T13:21:11.8989472Z nfs : include_tasks ----------------------------------------------------- 0.07s
2026-10-06T13:21:11.8989701Z nfs : Criar variáveis --------------------------------------------------- 0.06s
2026-10-06T13:21:11.8989917Z nfs : Validando Montagem ------------------------------------------------ 0.06s
2026-10-06T13:21:11.8990132Z nfs : Criar variáveis --------------------------------------------------- 0.06s
2026-10-06T13:21:11.8990347Z nfs : ansible.builtin.debug --------------------------------------------- 0.06s
2026-10-06T13:21:11.8990562Z nfs : result_new_string_json -------------------------------------------- 0.06s
2026-10-06T13:21:11.8990816Z nfs : Parse JSON data --------------------------------------------------- 0.06s
2026-10-06T13:21:11.8991158Z Playbook run took 0 days, 0 hours, 5 minutes, 26 seconds
2026-10-06T13:21:11.9635277Z ##[debug]Exit code 2 received from tool '/bin/bash'
2026-10-06T13:21:11.9638384Z ##[debug]STDIO streams have closed for tool '/bin/bash'
2026-10-06T13:21:11.9663794Z ##[error]Bash exited with code '2'.
2026-10-06T13:21:11.9664729Z ##[debug]Processed: ##vso[task.issue type=error;]Bash exited with code '2'.
2026-10-06T13:21:11.9665258Z ##[debug]task result: Failed
2026-10-06T13:21:11.9666014Z ##[debug]Processed: ##vso[task.complete result=Failed;done=true;]
2026-10-06T13:21:11.9676868Z ##[warning]RetryHelper encountered task failure, will retry (attempt #: 1 out of 2) after 1000 ms
2026-10-06T13:21:12.9678888Z ##[debug]PERF: RetryHelper Method:System.Threading.Tasks.Task <RunAsync>b__9() : took 329619.5544 ms
2026-10-06T13:21:12.9679102Z ##[debug]PERF WARNING: RetryHelper Method:System.Threading.Tasks.Task <RunAsync>b__9() : took 329619.5544 ms
2026-10-06T13:21:12.9681429Z ##[debug]Invoking Method: System.Threading.Tasks.Task <RunAsync>b__9(). Attempt count: 1
2026-10-06T13:21:12.9728995Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-10-06T13:21:13.0466189Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-10-06T13:21:13.0474191Z ##[debug]loading inputs and endpoints
2026-10-06T13:21:13.0478037Z ##[debug]loading INPUT_TARGETTYPE
2026-10-06T13:21:13.0485512Z ##[debug]loading INPUT_FILEPATH
2026-10-06T13:21:13.0486488Z ##[debug]loading INPUT_SCRIPT
2026-10-06T13:21:13.0487182Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-10-06T13:21:13.0487822Z ##[debug]loading INPUT_FAILONSTDERR
2026-10-06T13:21:13.0489373Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-10-06T13:21:13.0490222Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-10-06T13:21:13.0491575Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-10-06T13:21:13.0496468Z ##[debug]loading SECRET_SENHASERVICO
2026-10-06T13:21:13.0497836Z ##[debug]loading SECRET_OKD_TOKEN_PRODUTOS
2026-10-06T13:21:13.0499318Z ##[debug]loading SECRET_TOKEN_CRQ
2026-10-06T13:21:13.0501009Z ##[debug]loading SECRET_FORTIFY_PASS
2026-10-06T13:21:13.0502577Z ##[debug]loading SECRET_AZPAT
2026-10-06T13:21:13.0504119Z ##[debug]loading SECRET_TOKEN_INFRAFACIL_MUDANCA
2026-10-06T13:21:13.0504720Z ##[debug]loading SECRET_ARM_ACCESS_KEY
2026-10-06T13:21:13.0505335Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-10-06T13:21:13.0505903Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-10-06T13:21:13.0506399Z ##[debug]loading SECRET_ANSIBLE_VAULT
2026-10-06T13:21:13.0506977Z ##[debug]loading SECRET_PW_ISILON
2026-10-06T13:21:13.0508099Z ##[debug]loading SECRET_PW_ALOCAIP
2026-10-06T13:21:13.0508670Z ##[debug]loading SECRET_CV_SENHAORACLE
2026-10-06T13:21:13.0509289Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-10-06T13:21:13.0510467Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-10-06T13:21:13.0511037Z ##[debug]loading SECRET_TERRAFORM_ESX_PASSWORD
2026-10-06T13:21:13.0511657Z ##[debug]loaded 24
2026-10-06T13:21:13.0515973Z ##[debug]Agent.ProxyUrl=undefined
2026-10-06T13:21:13.0516575Z ##[debug]Agent.CAInfo=undefined
2026-10-06T13:21:13.0517375Z ##[debug]Agent.ClientCert=undefined
2026-10-06T13:21:13.0517738Z ##[debug]Agent.SkipCertValidation=True
2026-10-06T13:21:13.0531596Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-10-06T13:21:13.0533722Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-10-06T13:21:13.0534026Z ##[debug]system.culture=en-US
2026-10-06T13:21:13.0541964Z ##[debug]failOnStderr=false
2026-10-06T13:21:13.0542953Z ##[debug]workingDirectory=/opt/ads-agent/_work/r12267/a
2026-10-06T13:21:13.0543577Z ##[debug]check path : /opt/ads-agent/_work/r12267/a
2026-10-06T13:21:13.0544033Z ##[debug]targetType=inline
2026-10-06T13:21:13.0544288Z ##[debug]bashEnvValue=undefined
2026-10-06T13:21:13.0545345Z ##[debug]script=REPO=$(echo _SICCV-batch | sed 's/_//')
ansible-playbook /opt/ads-agent/_work/r12267/a/esteira-jboss-vm-v2/site.yml --tags controlm,nfs --skip-tags "vm,dns,monitoracao,apache,git_conf,jboss,restart_jboss,stop_jboss,tsm" -e sistema_ambiente=tqs -e sistema_nome=SICCV-batch -e site=ctc_nprd -e centralizadora_operacoes=7261 -e centralizadora_desenvolvimento=7266 -e default_working_directory_tfs=/opt/ads-agent/_work/r12267/a -e build_repository_name_tfs=$REPO -e CTMSHOST=crjdeaprlx038 -e CTMPERMHOSTS=crjdeaprlx038,crjdeaprlx039 -e ATCMNDATA=18007 -e AGCMNDATA=18008
2026-10-06T13:21:13.0554073Z Generating script.
2026-10-06T13:21:13.0556406Z ##[debug]which 'bash'
2026-10-06T13:21:13.0561864Z ##[debug]found: '/bin/bash'
2026-10-06T13:21:13.0562335Z ##[debug]Agent.Version=3.225.2
2026-10-06T13:21:13.0562638Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-10-06T13:21:13.0563080Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-10-06T13:21:13.0565058Z ========================== Starting Command Output ===========================
2026-10-06T13:21:13.0566455Z ##[debug]which '/bin/bash'
2026-10-06T13:21:13.0566871Z ##[debug]found: '/bin/bash'
2026-10-06T13:21:13.0567655Z ##[debug]/bin/bash arg: /opt/ads-agent/_work/_temp/2dfe5f26-ed9e-417a-8663-f9aca4609778.sh
2026-10-06T13:21:13.0570324Z ##[debug]exec tool: /bin/bash
2026-10-06T13:21:13.0570766Z ##[debug]arguments:
2026-10-06T13:21:13.0571226Z ##[debug]   /opt/ads-agent/_work/_temp/2dfe5f26-ed9e-417a-8663-f9aca4609778.sh
2026-10-06T13:21:13.0572496Z [command]/bin/bash /opt/ads-agent/_work/_temp/2dfe5f26-ed9e-417a-8663-f9aca4609778.sh
2026-10-06T13:21:15.1252667Z 
2026-10-06T13:21:15.1253522Z PLAY [local] *******************************************************************
2026-10-06T13:21:15.1521456Z 
2026-10-06T13:21:15.1521914Z PLAY [Configurando o DNS] ******************************************************
2026-10-06T13:21:15.3352885Z 
2026-10-06T13:21:15.3353406Z PLAY [local] *******************************************************************
2026-10-06T13:21:15.3389319Z 
2026-10-06T13:21:15.3389713Z PLAY [Verificando serviços] ****************************************************
2026-10-06T13:21:15.3475961Z 
2026-10-06T13:21:15.3476262Z PLAY [Configuração LDAP] *******************************************************
2026-10-06T13:21:15.3509956Z [WARNING]: Found variable using reserved name: when
2026-10-06T13:21:15.3515596Z 
2026-10-06T13:21:15.3516240Z PLAY [jboss] *******************************************************************
2026-10-06T13:21:15.3606337Z 
2026-10-06T13:21:15.3606693Z PLAY [Stack Jboss] *************************************************************
2026-10-06T13:21:15.3632189Z 
2026-10-06T13:21:15.3632400Z PLAY [jboss] *******************************************************************
2026-10-06T13:21:15.3671272Z 
2026-10-06T13:21:15.3671525Z PLAY [jboss] *******************************************************************
2026-10-06T13:21:15.3946334Z Tuesday 06 October 2026  10:21:15 -0300 (0:00:00.329)       0:00:00.329 ******* 
2026-10-06T13:21:15.9513412Z 
2026-10-06T13:21:15.9513923Z TASK [Verifica se o arquivo nfs_config.json existe] ****************************
2026-10-06T13:21:15.9514095Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-06T13:21:15.9540848Z Tuesday 06 October 2026  10:21:15 -0300 (0:00:00.557)       0:00:00.886 ******* 
2026-10-06T13:21:15.9993674Z included: /opt/ads-agent/_work/r12267/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for caddeapllx2821.agil.nprd.caixa.gov.br
2026-10-06T13:21:16.0032828Z Tuesday 06 October 2026  10:21:16 -0300 (0:00:00.051)       0:00:00.938 ******* 
2026-10-06T13:21:16.0593688Z 
2026-10-06T13:21:16.0593997Z TASK [nfs : Criar variáveis] ***************************************************
2026-10-06T13:21:16.0594175Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-06T13:21:16.0640938Z Tuesday 06 October 2026  10:21:16 -0300 (0:00:00.060)       0:00:00.999 ******* 
2026-10-06T13:21:16.5293744Z 
2026-10-06T13:21:16.5294457Z TASK [nfs : Coletar variáveis de ambiente] *************************************
2026-10-06T13:21:16.5294858Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-06T13:21:16.5330804Z Tuesday 06 October 2026  10:21:16 -0300 (0:00:00.468)       0:00:01.468 ******* 
2026-10-06T13:21:16.5892077Z 
2026-10-06T13:21:16.5892537Z TASK [nfs : Exibir resultado em JSON] ******************************************
2026-10-06T13:21:16.5893616Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-06T13:21:16.5893778Z     "nfs_vars_json": {
2026-10-06T13:21:16.5893897Z         "changed": false, 
2026-10-06T13:21:16.5894782Z         "cmd": "cat /opt/ads-agent/_work/r12267/a/nfs_config.json", 
2026-10-06T13:21:16.5894989Z         "delta": "0:00:00.042999", 
2026-10-06T13:21:16.5895173Z         "end": "2026-10-06 10:21:16.510643", 
2026-10-06T13:21:16.5895290Z         "failed": false, 
2026-10-06T13:21:16.5895407Z         "rc": 0, 
2026-10-06T13:21:16.5896830Z         "start": "2026-10-06 10:21:16.467644", 
2026-10-06T13:21:16.5897209Z         "stderr": "", 
2026-10-06T13:21:16.5897707Z         "stderr_lines": [], 
2026-10-06T13:21:16.5897871Z         "stdout": "[{\"NFS_ENDPOINT_VM\": \"hypernprd12.ad.caixa:/fs_siccv\",\"NFS_MOUNT_POINT_VM\": \"/SICCV\"}]", 
2026-10-06T13:21:16.5898020Z         "stdout_lines": [
2026-10-06T13:21:16.5898169Z             "[{\"NFS_ENDPOINT_VM\": \"hypernprd12.ad.caixa:/fs_siccv\",\"NFS_MOUNT_POINT_VM\": \"/SICCV\"}]"
2026-10-06T13:21:16.5899497Z         ]
2026-10-06T13:21:16.5900018Z     }
2026-10-06T13:21:16.5900151Z }
2026-10-06T13:21:16.5924462Z Tuesday 06 October 2026  10:21:16 -0300 (0:00:00.059)       0:00:01.527 ******* 
2026-10-06T13:21:16.6504595Z 
2026-10-06T13:21:16.6505292Z TASK [nfs : Criar variáveis] ***************************************************
2026-10-06T13:21:16.6505470Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-06T13:21:16.6550791Z Tuesday 06 October 2026  10:21:16 -0300 (0:00:00.062)       0:00:01.590 ******* 
2026-10-06T13:21:17.3219909Z 
2026-10-06T13:21:17.3220693Z TASK [nfs : execute montagem script] *******************************************
2026-10-06T13:21:17.3221390Z changed: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-06T13:21:17.3252671Z Tuesday 06 October 2026  10:21:17 -0300 (0:00:00.670)       0:00:02.260 ******* 
2026-10-06T13:21:17.3906026Z 
2026-10-06T13:21:17.3906497Z TASK [nfs : ansible.builtin.debug] *********************************************
2026-10-06T13:21:17.3909876Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-06T13:21:17.3910296Z     "changed": false, 
2026-10-06T13:21:17.3910511Z     "msg": {
2026-10-06T13:21:17.3910619Z         "changed": true, 
2026-10-06T13:21:17.3910730Z         "cmd": [
2026-10-06T13:21:17.3910839Z             "python", 
2026-10-06T13:21:17.3911145Z             "/opt/ads-agent/_work/r12267/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py", 
2026-10-06T13:21:17.3911288Z             "montagem", 
2026-10-06T13:21:17.3911430Z             "SICCV-batch", 
2026-10-06T13:21:17.3911542Z             "tqs", 
2026-10-06T13:21:17.3911635Z             "ctc_nprd", 
2026-10-06T13:21:17.3911834Z             "/opt/ads-agent/_work/r12267/a/esteira-jboss-vm-v2", 
2026-10-06T13:21:17.3912068Z             "C&t@d02", 
2026-10-06T13:21:17.3912319Z             "***", 
2026-10-06T13:21:17.3912435Z             "s736651@corp.caixa.gov.br", 
2026-10-06T13:21:17.3912555Z             "***", 
2026-10-06T13:21:17.3913739Z             "[{\"NFS_ENDPOINT_VM\": \"hypernprd12.ad.caixa:/fs_siccv\",\"NFS_MOUNT_POINT_VM\": \"/SICCV\"}]"
2026-10-06T13:21:17.3913919Z         ], 
2026-10-06T13:21:17.3914035Z         "delta": "0:00:00.318732", 
2026-10-06T13:21:17.3914295Z         "end": "2026-10-06 10:21:17.305608", 
2026-10-06T13:21:17.3914433Z         "failed": false, 
2026-10-06T13:21:17.3914541Z         "rc": 0, 
2026-10-06T13:21:17.3914714Z         "start": "2026-10-06 10:21:16.986876", 
2026-10-06T13:21:17.3916055Z         "stderr": "", 
2026-10-06T13:21:17.3916214Z         "stderr_lines": [], 
2026-10-06T13:21:17.3917196Z         "stdout": "[{u'NFS_MOUNT_POINT_VM': u'/SICCV', u'NFS_ENDPOINT_VM': u'hypernprd12.ad.caixa:/fs_siccv'}]\nNome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           \n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\nhypernprd12.ad.caixa                /fs_siccv                           /SICCV                              VM                                  hypernprd12.ad.caixa                tqs                                \nnfs_path=/SICCV\nnfs_src=hypernprd12.ad.caixa:/fs_siccv\nhypernprd12.ad.caixa                /fs_siccv                           /SICCV                              VM                                  hypernprd12.ad.caixa                tqs                                ", 
2026-10-06T13:21:17.3917843Z         "stdout_lines": [
2026-10-06T13:21:17.3918066Z             "[{u'NFS_MOUNT_POINT_VM': u'/SICCV', u'NFS_ENDPOINT_VM': u'hypernprd12.ad.caixa:/fs_siccv'}]", 
2026-10-06T13:21:17.3918244Z             "Nome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           ", 
2026-10-06T13:21:17.3918699Z             "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------", 
2026-10-06T13:21:17.3918925Z             "hypernprd12.ad.caixa                /fs_siccv                           /SICCV                              VM                                  hypernprd12.ad.caixa                tqs                                ", 
2026-10-06T13:21:17.3919069Z             "nfs_path=/SICCV", 
2026-10-06T13:21:17.3919189Z             "nfs_src=hypernprd12.ad.caixa:/fs_siccv", 
2026-10-06T13:21:17.3919351Z             "hypernprd12.ad.caixa                /fs_siccv                           /SICCV                              VM                                  hypernprd12.ad.caixa                tqs                                "
2026-10-06T13:21:17.3919480Z         ]
2026-10-06T13:21:17.3919570Z     }
2026-10-06T13:21:17.3919661Z }
2026-10-06T13:21:17.3940617Z Tuesday 06 October 2026  10:21:17 -0300 (0:00:00.068)       0:00:02.329 ******* 
2026-10-06T13:21:17.7718936Z 
2026-10-06T13:21:17.7719452Z TASK [nfs : execute clean json] ************************************************
2026-10-06T13:21:17.7722531Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-10-06T13:21:17.7722982Z caddeapllx2821.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-10-06T13:21:17.7723194Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-10-06T13:21:17.7723372Z releases. A future Ansible release will default to using the discovered 
2026-10-06T13:21:17.7723567Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-10-06T13:21:17.7723742Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-10-06T13:21:17.7723907Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-10-06T13:21:17.7724063Z setting deprecation_warnings=False in ansible.cfg.
2026-10-06T13:21:17.7724212Z changed: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-06T13:21:17.7753990Z Tuesday 06 October 2026  10:21:17 -0300 (0:00:00.381)       0:00:02.710 ******* 
2026-10-06T13:21:17.8335932Z 
2026-10-06T13:21:17.8336614Z TASK [nfs : result_new_string_json] ********************************************
2026-10-06T13:21:17.8338961Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-06T13:21:17.8339497Z     "msg": {
2026-10-06T13:21:17.8339627Z         "ansible_facts": {
2026-10-06T13:21:17.8339772Z             "discovered_interpreter_python": "/usr/bin/python"
2026-10-06T13:21:17.8340219Z         }, 
2026-10-06T13:21:17.8340349Z         "changed": true, 
2026-10-06T13:21:17.8340951Z         "cmd": "echo '[{\"NFS_ENDPOINT_VM\": \"hypernprd12.ad.caixa:/fs_siccv\",\"NFS_MOUNT_POINT_VM\": \"/SICCV\"}]' | sed 's/NFS_ENDPOINT_ISILON[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_ISILON[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_HUAWEI[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_HUAWEI[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_VM[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_VM[^\"]*/NFS_MOUNT_POINT/g'", 
2026-10-06T13:21:17.8341268Z         "delta": "0:00:00.003879", 
2026-10-06T13:21:17.8341386Z         "deprecations": [
2026-10-06T13:21:17.8341488Z             {
2026-10-06T13:21:17.8342039Z                 "msg": "Distribution rhel 9.3 on host caddeapllx2821.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, but is using /usr/bin/python for backward compatibility with prior Ansible releases. A future Ansible release will default to using the discovered platform python for this host. See https://docs.ansible.com/ansible/2.9/reference_appendices/interpreter_discovery.html for more information", 
2026-10-06T13:21:17.8342328Z                 "version": "2.12"
2026-10-06T13:21:17.8342432Z             }
2026-10-06T13:21:17.8342514Z         ], 
2026-10-06T13:21:17.8342681Z         "end": "2026-10-06 10:21:17.755142", 
2026-10-06T13:21:17.8342937Z         "failed": false, 
2026-10-06T13:21:17.8343132Z         "rc": 0, 
2026-10-06T13:21:17.8343308Z         "start": "2026-10-06 10:21:17.751263", 
2026-10-06T13:21:17.8343421Z         "stderr": "", 
2026-10-06T13:21:17.8343533Z         "stderr_lines": [], 
2026-10-06T13:21:17.8343683Z         "stdout": "[{\"NFS_ENDPOINT\": \"hypernprd12.ad.caixa:/fs_siccv\",\"NFS_MOUNT_POINT\": \"/SICCV\"}]", 
2026-10-06T13:21:17.8343828Z         "stdout_lines": [
2026-10-06T13:21:17.8343967Z             "[{\"NFS_ENDPOINT\": \"hypernprd12.ad.caixa:/fs_siccv\",\"NFS_MOUNT_POINT\": \"/SICCV\"}]"
2026-10-06T13:21:17.8344099Z         ]
2026-10-06T13:21:17.8344201Z     }
2026-10-06T13:21:17.8344284Z }
2026-10-06T13:21:17.8369136Z Tuesday 06 October 2026  10:21:17 -0300 (0:00:00.061)       0:00:02.772 ******* 
2026-10-06T13:21:17.8937194Z 
2026-10-06T13:21:17.8937437Z TASK [nfs : Parse JSON data] ***************************************************
2026-10-06T13:21:17.8937609Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-06T13:21:17.8966340Z Tuesday 06 October 2026  10:21:17 -0300 (0:00:00.059)       0:00:02.831 ******* 
2026-10-06T13:21:17.9534406Z 
2026-10-06T13:21:17.9534671Z TASK [nfs : result_new_json] ***************************************************
2026-10-06T13:21:17.9535846Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-06T13:21:17.9536029Z     "msg": [
2026-10-06T13:21:17.9536135Z         {
2026-10-06T13:21:17.9536262Z             "NFS_ENDPOINT": "hypernprd12.ad.caixa:/fs_siccv", 
2026-10-06T13:21:17.9536406Z             "NFS_MOUNT_POINT": "/SICCV"
2026-10-06T13:21:17.9536501Z         }
2026-10-06T13:21:17.9536599Z     ]
2026-10-06T13:21:17.9536703Z }
2026-10-06T13:21:17.9564264Z Tuesday 06 October 2026  10:21:17 -0300 (0:00:00.059)       0:00:02.891 ******* 
2026-10-06T13:21:18.0168707Z included: /opt/ads-agent/_work/r12267/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx2821.agil.nprd.caixa.gov.br
2026-10-06T13:21:18.0225936Z Tuesday 06 October 2026  10:21:18 -0300 (0:00:00.066)       0:00:02.957 ******* 
2026-10-06T13:21:18.0769757Z 
2026-10-06T13:21:18.0770020Z TASK [nfs : Parse JSON data] ***************************************************
2026-10-06T13:21:18.0770204Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-06T13:21:18.0799183Z Tuesday 06 October 2026  10:21:18 -0300 (0:00:00.057)       0:00:03.015 ******* 
2026-10-06T13:21:18.1343410Z 
2026-10-06T13:21:18.1351892Z TASK [nfs : debug] *************************************************************
2026-10-06T13:21:18.1352912Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-06T13:21:18.1353237Z     "msg": {
2026-10-06T13:21:18.1353404Z         "NFS_ENDPOINT": "hypernprd12.ad.caixa:/fs_siccv", 
2026-10-06T13:21:18.1353844Z         "NFS_MOUNT_POINT": "/SICCV"
2026-10-06T13:21:18.1353949Z     }
2026-10-06T13:21:18.1382401Z }
2026-10-06T13:21:18.1383185Z Tuesday 06 October 2026  10:21:18 -0300 (0:00:00.056)       0:00:03.071 ******* 
2026-10-06T13:21:18.1915294Z 
2026-10-06T13:21:18.1915883Z TASK [nfs : debug] *************************************************************
2026-10-06T13:21:18.1916061Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-06T13:21:18.1916179Z     "msg": "/SICCV"
2026-10-06T13:21:18.1916268Z }
2026-10-06T13:21:18.1946062Z Tuesday 06 October 2026  10:21:18 -0300 (0:00:00.057)       0:00:03.129 ******* 
2026-10-06T13:21:18.2476997Z 
2026-10-06T13:21:18.2477389Z TASK [nfs : debug] *************************************************************
2026-10-06T13:21:18.2478026Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-06T13:21:18.2478195Z     "msg": "hypernprd12.ad.caixa:/fs_siccv"
2026-10-06T13:21:18.2478309Z }
2026-10-06T13:21:18.2517709Z Tuesday 06 October 2026  10:21:18 -0300 (0:00:00.057)       0:00:03.186 ******* 
2026-10-06T13:21:18.3073500Z 
2026-10-06T13:21:18.3073765Z TASK [nfs : Verificando as variaveis] ******************************************
2026-10-06T13:21:18.3073983Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-06T13:21:18.3074120Z     "changed": false, 
2026-10-06T13:21:18.3074239Z     "msg": "All assertions passed"
2026-10-06T13:21:18.3074661Z }
2026-10-06T13:21:18.3105657Z Tuesday 06 October 2026  10:21:18 -0300 (0:00:00.058)       0:00:03.245 ******* 
2026-10-06T13:21:21.7350719Z 
2026-10-06T13:21:21.7351236Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-10-06T13:21:21.7351449Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-06T13:21:21.7389603Z Tuesday 06 October 2026  10:21:21 -0300 (0:00:03.428)       0:00:06.674 ******* 
2026-10-06T13:21:22.6032298Z 
2026-10-06T13:21:22.6033211Z TASK [nfs : Install networker lgtoclnt_url] ************************************
2026-10-06T13:21:22.6033741Z [WARNING]: Consider using the yum, dnf or zypper module rather than running
2026-10-06T13:21:22.6034278Z 'rpm'.  If you need to use command because yum, dnf or zypper is insufficient
2026-10-06T13:21:22.6034526Z you can add 'warn: false' to this command task or set 'command_warnings=False'
2026-10-06T13:21:22.6034692Z in ansible.cfg to get rid of this message.
2026-10-06T13:21:22.6037054Z fatal: [caddeapllx2821.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.620263", "end": "2026-10-06 10:21:22.586522", "msg": "non-zero return code", "rc": 1, "start": "2026-10-06 10:21:21.966259", "stderr": "aviso: /var/tmp/rpm-tmp.Sxy1x6: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.Sxy1x6: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-10-06T13:21:22.6037672Z ...ignoring
2026-10-06T13:21:22.6069827Z Tuesday 06 October 2026  10:21:22 -0300 (0:00:00.868)       0:00:07.542 ******* 
2026-10-06T13:21:23.4017223Z 
2026-10-06T13:21:23.4017672Z TASK [nfs : Install networker lgtonmda_url] ************************************
2026-10-06T13:21:23.4024897Z fatal: [caddeapllx2821.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.533851", "end": "2026-10-06 10:21:23.384705", "msg": "non-zero return code", "rc": 1, "start": "2026-10-06 10:21:22.850854", "stderr": "aviso: /var/tmp/rpm-tmp.2NI9BY: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.2NI9BY: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-10-06T13:21:23.4025936Z ...ignoring
2026-10-06T13:21:23.4066968Z Tuesday 06 October 2026  10:21:23 -0300 (0:00:00.799)       0:00:08.341 ******* 
2026-10-06T13:21:23.8094441Z 
2026-10-06T13:21:23.8095148Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-10-06T13:21:23.8095323Z changed: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-06T13:21:23.8133615Z Tuesday 06 October 2026  10:21:23 -0300 (0:00:00.406)       0:00:08.748 ******* 
2026-10-06T13:21:24.0576483Z 
2026-10-06T13:21:24.0576958Z TASK [nfs : Create a symbolic link] ********************************************
2026-10-06T13:21:24.0577128Z changed: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-06T13:21:24.0616295Z Tuesday 06 October 2026  10:21:24 -0300 (0:00:00.248)       0:00:08.996 ******* 
2026-10-06T13:21:24.9473883Z 
2026-10-06T13:21:24.9474770Z TASK [nfs : Networker | Start networker] ***************************************
2026-10-06T13:21:24.9475126Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-06T13:21:24.9519266Z Tuesday 06 October 2026  10:21:24 -0300 (0:00:00.890)       0:00:09.887 ******* 
2026-10-06T13:21:25.2028443Z 
2026-10-06T13:21:25.2029419Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-10-06T13:21:25.2029635Z changed: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-06T13:21:25.2061099Z Tuesday 06 October 2026  10:21:25 -0300 (0:00:00.254)       0:00:10.141 ******* 
2026-10-06T13:21:35.5909294Z 
2026-10-06T13:21:35.5909822Z TASK [nfs : Networker | Restart networker] *************************************
2026-10-06T13:21:35.5909995Z changed: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-06T13:21:35.5941343Z Tuesday 06 October 2026  10:21:35 -0300 (0:00:10.387)       0:00:20.529 ******* 
2026-10-06T13:23:47.8620291Z 
2026-10-06T13:23:47.8620905Z TASK [nfs : Montando volume remoto] ********************************************
2026-10-06T13:23:47.8621130Z fatal: [caddeapllx2821.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "msg": "Error mounting /SICCV: mount.nfs: No route to host\n"}
2026-10-06T13:23:47.8621318Z ...ignoring
2026-10-06T13:23:47.8658364Z Tuesday 06 October 2026  10:23:47 -0300 (0:02:12.271)       0:02:32.800 ******* 
2026-10-06T13:23:47.9296005Z 
2026-10-06T13:23:47.9296408Z TASK [nfs : Validando Montagem] ************************************************
2026-10-06T13:23:47.9298278Z fatal: [caddeapllx2821.agil.nprd.caixa.gov.br]: FAILED! => {
2026-10-06T13:23:47.9298911Z     "assertion": "'Connection refused' in mountnfs.msg", 
2026-10-06T13:23:47.9299077Z     "changed": false, 
2026-10-06T13:23:47.9299198Z     "evaluated_to": false, 
2026-10-06T13:23:47.9299350Z     "msg": "Erro desconhecido: Error mounting /SICCV: mount.nfs: No route to host\n"
2026-10-06T13:23:47.9299482Z }
2026-10-06T13:23:47.9309979Z 
2026-10-06T13:23:47.9310275Z PLAY RECAP *********************************************************************
2026-10-06T13:23:47.9310804Z caddeapllx2821.agil.nprd.caixa.gov.br : ok=27   changed=8    unreachable=0    failed=1    skipped=0    rescued=0    ignored=3   
2026-10-06T13:23:47.9311285Z 
2026-10-06T13:23:47.9312161Z Tuesday 06 October 2026  10:23:47 -0300 (0:00:00.065)       0:02:32.866 ******* 
2026-10-06T13:23:47.9312619Z =============================================================================== 
2026-10-06T13:23:47.9314408Z nfs : Montando volume remoto ------------------------------------------ 132.27s
2026-10-06T13:23:47.9314811Z nfs : Networker | Restart networker ------------------------------------ 10.39s
2026-10-06T13:23:47.9315123Z nfs : Instalando o NFS Client ------------------------------------------- 3.43s
2026-10-06T13:23:47.9315427Z nfs : Networker | Start networker --------------------------------------- 0.89s
2026-10-06T13:23:47.9315733Z nfs : Install networker lgtoclnt_url ------------------------------------ 0.87s
2026-10-06T13:23:47.9316031Z nfs : Install networker lgtonmda_url ------------------------------------ 0.80s
2026-10-06T13:23:47.9316345Z nfs : execute montagem script ------------------------------------------- 0.67s
2026-10-06T13:23:47.9316650Z Verifica se o arquivo nfs_config.json existe ---------------------------- 0.56s
2026-10-06T13:23:47.9316975Z nfs : Coletar variáveis de ambiente ------------------------------------- 0.47s
2026-10-06T13:23:47.9317280Z nfs : Remove pacote jbcs-httpd ------------------------------------------ 0.41s
2026-10-06T13:23:47.9317575Z nfs : execute clean json ------------------------------------------------ 0.38s
2026-10-06T13:23:47.9318058Z nfs : Executar o comando abaixo para limitar as portas ------------------ 0.25s
2026-10-06T13:23:47.9318361Z nfs : Create a symbolic link -------------------------------------------- 0.25s
2026-10-06T13:23:47.9318689Z nfs : ansible.builtin.debug --------------------------------------------- 0.07s
2026-10-06T13:23:47.9318972Z nfs : include_tasks ----------------------------------------------------- 0.07s
2026-10-06T13:23:47.9319195Z nfs : Validando Montagem ------------------------------------------------ 0.07s
2026-10-06T13:23:47.9319483Z nfs : Criar variáveis --------------------------------------------------- 0.06s
2026-10-06T13:23:47.9319761Z nfs : result_new_string_json -------------------------------------------- 0.06s
2026-10-06T13:23:47.9320022Z nfs : Criar variáveis --------------------------------------------------- 0.06s
2026-10-06T13:23:47.9320248Z nfs : result_new_json --------------------------------------------------- 0.06s
2026-10-06T13:23:47.9320403Z Playbook run took 0 days, 0 hours, 2 minutes, 32 seconds
2026-10-06T13:23:48.0235694Z ##[debug]Exit code 2 received from tool '/bin/bash'
2026-10-06T13:23:48.0236058Z ##[debug]STDIO streams have closed for tool '/bin/bash'
2026-10-06T13:23:48.0248661Z ##[error]Bash exited with code '2'.
2026-10-06T13:23:48.0249116Z ##[debug]Processed: ##vso[task.issue type=error;]Bash exited with code '2'.
2026-10-06T13:23:48.0249428Z ##[debug]task result: Failed
2026-10-06T13:23:48.0252114Z ##[debug]Processed: ##vso[task.complete result=Failed;done=true;]
2026-10-06T13:23:48.0265080Z ##[warning]RetryHelper encountered task failure, will retry (attempt #: 2 out of 2) after 4000 ms
2026-10-06T13:23:52.0263005Z ##[debug]PERF: RetryHelper Method:System.Threading.Tasks.Task <RunAsync>b__9() : took 159058.3197 ms
2026-10-06T13:23:52.0263309Z ##[debug]PERF WARNING: RetryHelper Method:System.Threading.Tasks.Task <RunAsync>b__9() : took 159058.3197 ms
2026-10-06T13:23:52.0263957Z ##[debug]Invoking Method: System.Threading.Tasks.Task <RunAsync>b__9(). Attempt count: 2
2026-10-06T13:23:52.0307222Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-10-06T13:23:52.0988589Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-10-06T13:23:52.0997198Z ##[debug]loading inputs and endpoints
2026-10-06T13:23:52.1000366Z ##[debug]loading INPUT_TARGETTYPE
2026-10-06T13:23:52.1007430Z ##[debug]loading INPUT_FILEPATH
2026-10-06T13:23:52.1008535Z ##[debug]loading INPUT_SCRIPT
2026-10-06T13:23:52.1009073Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-10-06T13:23:52.1009628Z ##[debug]loading INPUT_FAILONSTDERR
2026-10-06T13:23:52.1011232Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-10-06T13:23:52.1011983Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-10-06T13:23:52.1013524Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-10-06T13:23:52.1018279Z ##[debug]loading SECRET_SENHASERVICO
2026-10-06T13:23:52.1019857Z ##[debug]loading SECRET_OKD_TOKEN_PRODUTOS
2026-10-06T13:23:52.1021423Z ##[debug]loading SECRET_TOKEN_CRQ
2026-10-06T13:23:52.1022984Z ##[debug]loading SECRET_FORTIFY_PASS
2026-10-06T13:23:52.1024561Z ##[debug]loading SECRET_AZPAT
2026-10-06T13:23:52.1026613Z ##[debug]loading SECRET_TOKEN_INFRAFACIL_MUDANCA
2026-10-06T13:23:52.1026914Z ##[debug]loading SECRET_ARM_ACCESS_KEY
2026-10-06T13:23:52.1027261Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-10-06T13:23:52.1027723Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-10-06T13:23:52.1028266Z ##[debug]loading SECRET_ANSIBLE_VAULT
2026-10-06T13:23:52.1028796Z ##[debug]loading SECRET_PW_ISILON
2026-10-06T13:23:52.1030054Z ##[debug]loading SECRET_PW_ALOCAIP
2026-10-06T13:23:52.1030534Z ##[debug]loading SECRET_CV_SENHAORACLE
2026-10-06T13:23:52.1031110Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-10-06T13:23:52.1032390Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-10-06T13:23:52.1032890Z ##[debug]loading SECRET_TERRAFORM_ESX_PASSWORD
2026-10-06T13:23:52.1033417Z ##[debug]loaded 24
2026-10-06T13:23:52.1037400Z ##[debug]Agent.ProxyUrl=undefined
2026-10-06T13:23:52.1037746Z ##[debug]Agent.CAInfo=undefined
2026-10-06T13:23:52.1037992Z ##[debug]Agent.ClientCert=undefined
2026-10-06T13:23:52.1038591Z ##[debug]Agent.SkipCertValidation=True
2026-10-06T13:23:52.1053762Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-10-06T13:23:52.1055861Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-10-06T13:23:52.1056161Z ##[debug]system.culture=en-US
2026-10-06T13:23:52.1064268Z ##[debug]failOnStderr=false
2026-10-06T13:23:52.1065108Z ##[debug]workingDirectory=/opt/ads-agent/_work/r12267/a
2026-10-06T13:23:52.1065382Z ##[debug]check path : /opt/ads-agent/_work/r12267/a
2026-10-06T13:23:52.1065945Z ##[debug]targetType=inline
2026-10-06T13:23:52.1066253Z ##[debug]bashEnvValue=undefined
2026-10-06T13:23:52.1067721Z ##[debug]script=REPO=$(echo _SICCV-batch | sed 's/_//')
ansible-playbook /opt/ads-agent/_work/r12267/a/esteira-jboss-vm-v2/site.yml --tags controlm,nfs --skip-tags "vm,dns,monitoracao,apache,git_conf,jboss,restart_jboss,stop_jboss,tsm" -e sistema_ambiente=tqs -e sistema_nome=SICCV-batch -e site=ctc_nprd -e centralizadora_operacoes=7261 -e centralizadora_desenvolvimento=7266 -e default_working_directory_tfs=/opt/ads-agent/_work/r12267/a -e build_repository_name_tfs=$REPO -e CTMSHOST=crjdeaprlx038 -e CTMPERMHOSTS=crjdeaprlx038,crjdeaprlx039 -e ATCMNDATA=18007 -e AGCMNDATA=18008
2026-10-06T13:23:52.1075868Z Generating script.
2026-10-06T13:23:52.1077767Z ##[debug]which 'bash'
2026-10-06T13:23:52.1083161Z ##[debug]found: '/bin/bash'
2026-10-06T13:23:52.1083621Z ##[debug]Agent.Version=3.225.2
2026-10-06T13:23:52.1083979Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-10-06T13:23:52.1084228Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-10-06T13:23:52.1086779Z ========================== Starting Command Output ===========================
2026-10-06T13:23:52.1091736Z ##[debug]which '/bin/bash'
2026-10-06T13:23:52.1092245Z ##[debug]found: '/bin/bash'
2026-10-06T13:23:52.1092529Z ##[debug]/bin/bash arg: /opt/ads-agent/_work/_temp/577fc3c3-8720-4af6-a8c7-ed579bdd54aa.sh
2026-10-06T13:23:52.1092871Z ##[debug]exec tool: /bin/bash
2026-10-06T13:23:52.1093111Z ##[debug]arguments:
2026-10-06T13:23:52.1093366Z ##[debug]   /opt/ads-agent/_work/_temp/577fc3c3-8720-4af6-a8c7-ed579bdd54aa.sh
2026-10-06T13:23:52.1093761Z [command]/bin/bash /opt/ads-agent/_work/_temp/577fc3c3-8720-4af6-a8c7-ed579bdd54aa.sh
2026-10-06T13:23:54.2112278Z 
2026-10-06T13:23:54.2112892Z PLAY [local] *******************************************************************
2026-10-06T13:23:54.2377537Z 
2026-10-06T13:23:54.2377750Z PLAY [Configurando o DNS] ******************************************************
2026-10-06T13:23:54.4269073Z 
2026-10-06T13:23:54.4269584Z PLAY [local] *******************************************************************
2026-10-06T13:23:54.4305109Z 
2026-10-06T13:23:54.4305466Z PLAY [Verificando serviços] ****************************************************
2026-10-06T13:23:54.4392387Z 
2026-10-06T13:23:54.4392607Z PLAY [Configuração LDAP] *******************************************************
2026-10-06T13:23:54.4426998Z [WARNING]: Found variable using reserved name: when
2026-10-06T13:23:54.4432116Z 
2026-10-06T13:23:54.4432704Z PLAY [jboss] *******************************************************************
2026-10-06T13:23:54.4522379Z 
2026-10-06T13:23:54.4522533Z PLAY [Stack Jboss] *************************************************************
2026-10-06T13:23:54.4548888Z 
2026-10-06T13:23:54.4549108Z PLAY [jboss] *******************************************************************
2026-10-06T13:23:54.4589453Z 
2026-10-06T13:23:54.4589606Z PLAY [jboss] *******************************************************************
2026-10-06T13:23:54.4861820Z Tuesday 06 October 2026  10:23:54 -0300 (0:00:00.339)       0:00:00.340 ******* 
2026-10-06T13:23:55.0462907Z 
2026-10-06T13:23:55.0463493Z TASK [Verifica se o arquivo nfs_config.json existe] ****************************
2026-10-06T13:23:55.0463658Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-06T13:23:55.0484337Z Tuesday 06 October 2026  10:23:55 -0300 (0:00:00.562)       0:00:00.902 ******* 
2026-10-06T13:23:55.0959007Z included: /opt/ads-agent/_work/r12267/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for caddeapllx2821.agil.nprd.caixa.gov.br
2026-10-06T13:23:55.0999890Z Tuesday 06 October 2026  10:23:55 -0300 (0:00:00.051)       0:00:00.953 ******* 
2026-10-06T13:23:55.1579780Z 
2026-10-06T13:23:55.1580360Z TASK [nfs : Criar variáveis] ***************************************************
2026-10-06T13:23:55.1580528Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-06T13:23:55.1628169Z Tuesday 06 October 2026  10:23:55 -0300 (0:00:00.062)       0:00:01.016 ******* 
2026-10-06T13:23:55.6496531Z 
2026-10-06T13:23:55.6497242Z TASK [nfs : Coletar variáveis de ambiente] *************************************
2026-10-06T13:23:55.6497447Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-06T13:23:55.6497714Z Tuesday 06 October 2026  10:23:55 -0300 (0:00:00.484)       0:00:01.501 ******* 
2026-10-06T13:23:55.7034594Z 
2026-10-06T13:23:55.7035176Z TASK [nfs : Exibir resultado em JSON] ******************************************
2026-10-06T13:23:55.7038725Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-06T13:23:55.7039108Z     "nfs_vars_json": {
2026-10-06T13:23:55.7039494Z         "changed": false, 
2026-10-06T13:23:55.7040080Z         "cmd": "cat /opt/ads-agent/_work/r12267/a/nfs_config.json", 
2026-10-06T13:23:55.7040323Z         "delta": "0:00:00.042683", 
2026-10-06T13:23:55.7040509Z         "end": "2026-10-06 10:23:55.628192", 
2026-10-06T13:23:55.7040640Z         "failed": false, 
2026-10-06T13:23:55.7044293Z         "rc": 0, 
2026-10-06T13:23:55.7044693Z         "start": "2026-10-06 10:23:55.585509", 
2026-10-06T13:23:55.7045080Z         "stderr": "", 
2026-10-06T13:23:55.7045498Z         "stderr_lines": [], 
2026-10-06T13:23:55.7045695Z         "stdout": "[{\"NFS_ENDPOINT_VM\": \"hypernprd12.ad.caixa:/fs_siccv\",\"NFS_MOUNT_POINT_VM\": \"/SICCV\"}]", 
2026-10-06T13:23:55.7045856Z         "stdout_lines": [
2026-10-06T13:23:55.7046007Z             "[{\"NFS_ENDPOINT_VM\": \"hypernprd12.ad.caixa:/fs_siccv\",\"NFS_MOUNT_POINT_VM\": \"/SICCV\"}]"
2026-10-06T13:23:55.7046718Z         ]
2026-10-06T13:23:55.7047022Z     }
2026-10-06T13:23:55.7047120Z }
2026-10-06T13:23:55.7067555Z Tuesday 06 October 2026  10:23:55 -0300 (0:00:00.059)       0:00:01.560 ******* 
2026-10-06T13:23:55.7649643Z 
2026-10-06T13:23:55.7650302Z TASK [nfs : Criar variáveis] ***************************************************
2026-10-06T13:23:55.7650503Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-06T13:23:55.7698039Z Tuesday 06 October 2026  10:23:55 -0300 (0:00:00.062)       0:00:01.623 ******* 
2026-10-06T13:23:56.4229268Z 
2026-10-06T13:23:56.4229778Z TASK [nfs : execute montagem script] *******************************************
2026-10-06T13:23:56.4230018Z changed: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-06T13:23:56.4261300Z Tuesday 06 October 2026  10:23:56 -0300 (0:00:00.656)       0:00:02.280 ******* 
2026-10-06T13:23:56.4844544Z 
2026-10-06T13:23:56.4844914Z TASK [nfs : ansible.builtin.debug] *********************************************
2026-10-06T13:23:56.4847143Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-06T13:23:56.4847283Z     "changed": false, 
2026-10-06T13:23:56.4847405Z     "msg": {
2026-10-06T13:23:56.4847517Z         "changed": true, 
2026-10-06T13:23:56.4847647Z         "cmd": [
2026-10-06T13:23:56.4847757Z             "python", 
2026-10-06T13:23:56.4848039Z             "/opt/ads-agent/_work/r12267/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py", 
2026-10-06T13:23:56.4848199Z             "montagem", 
2026-10-06T13:23:56.4848345Z             "SICCV-batch", 
2026-10-06T13:23:56.4848519Z             "tqs", 
2026-10-06T13:23:56.4848630Z             "ctc_nprd", 
2026-10-06T13:23:56.4849004Z             "/opt/ads-agent/_work/r12267/a/esteira-jboss-vm-v2", 
2026-10-06T13:23:56.4849125Z             "C&t@d02", 
2026-10-06T13:23:56.4849308Z             "***", 
2026-10-06T13:23:56.4849537Z             "s736651@corp.caixa.gov.br", 
2026-10-06T13:23:56.4849669Z             "***", 
2026-10-06T13:23:56.4849821Z             "[{\"NFS_ENDPOINT_VM\": \"hypernprd12.ad.caixa:/fs_siccv\",\"NFS_MOUNT_POINT_VM\": \"/SICCV\"}]"
2026-10-06T13:23:56.4849962Z         ], 
2026-10-06T13:23:56.4850129Z         "delta": "0:00:00.314753", 
2026-10-06T13:23:56.4850316Z         "end": "2026-10-06 10:23:56.403914", 
2026-10-06T13:23:56.4850446Z         "failed": false, 
2026-10-06T13:23:56.4850549Z         "rc": 0, 
2026-10-06T13:23:56.4850712Z         "start": "2026-10-06 10:23:56.089161", 
2026-10-06T13:23:56.4853276Z         "stderr": "", 
2026-10-06T13:23:56.4853423Z         "stderr_lines": [], 
2026-10-06T13:23:56.4854319Z         "stdout": "[{u'NFS_MOUNT_POINT_VM': u'/SICCV', u'NFS_ENDPOINT_VM': u'hypernprd12.ad.caixa:/fs_siccv'}]\nNome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           \n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\nhypernprd12.ad.caixa                /fs_siccv                           /SICCV                              VM                                  hypernprd12.ad.caixa                tqs                                \nnfs_path=/SICCV\nnfs_src=hypernprd12.ad.caixa:/fs_siccv\nhypernprd12.ad.caixa                /fs_siccv                           /SICCV                              VM                                  hypernprd12.ad.caixa                tqs                                ", 
2026-10-06T13:23:56.4854873Z         "stdout_lines": [
2026-10-06T13:23:56.4855116Z             "[{u'NFS_MOUNT_POINT_VM': u'/SICCV', u'NFS_ENDPOINT_VM': u'hypernprd12.ad.caixa:/fs_siccv'}]", 
2026-10-06T13:23:56.4855297Z             "Nome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           ", 
2026-10-06T13:23:56.4855657Z             "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------", 
2026-10-06T13:23:56.4856022Z             "hypernprd12.ad.caixa                /fs_siccv                           /SICCV                              VM                                  hypernprd12.ad.caixa                tqs                                ", 
2026-10-06T13:23:56.4856168Z             "nfs_path=/SICCV", 
2026-10-06T13:23:56.4856293Z             "nfs_src=hypernprd12.ad.caixa:/fs_siccv", 
2026-10-06T13:23:56.4856451Z             "hypernprd12.ad.caixa                /fs_siccv                           /SICCV                              VM                                  hypernprd12.ad.caixa                tqs                                "
2026-10-06T13:23:56.4856587Z         ]
2026-10-06T13:23:56.4856682Z     }
2026-10-06T13:23:56.4856767Z }
2026-10-06T13:23:56.4879198Z Tuesday 06 October 2026  10:23:56 -0300 (0:00:00.061)       0:00:02.341 ******* 
2026-10-06T13:23:56.8745999Z 
2026-10-06T13:23:56.8746449Z TASK [nfs : execute clean json] ************************************************
2026-10-06T13:23:56.8749816Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-10-06T13:23:56.8750175Z caddeapllx2821.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-10-06T13:23:56.8750374Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-10-06T13:23:56.8750547Z releases. A future Ansible release will default to using the discovered 
2026-10-06T13:23:56.8750925Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-10-06T13:23:56.8751102Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-10-06T13:23:56.8751269Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-10-06T13:23:56.8751409Z setting deprecation_warnings=False in ansible.cfg.
2026-10-06T13:23:56.8751555Z changed: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-06T13:23:56.8780163Z Tuesday 06 October 2026  10:23:56 -0300 (0:00:00.390)       0:00:02.731 ******* 
2026-10-06T13:23:56.9359591Z 
2026-10-06T13:23:56.9359837Z TASK [nfs : result_new_string_json] ********************************************
2026-10-06T13:23:56.9362951Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-06T13:23:56.9363159Z     "msg": {
2026-10-06T13:23:56.9363275Z         "ansible_facts": {
2026-10-06T13:23:56.9363423Z             "discovered_interpreter_python": "/usr/bin/python"
2026-10-06T13:23:56.9363545Z         }, 
2026-10-06T13:23:56.9363648Z         "changed": true, 
2026-10-06T13:23:56.9364178Z         "cmd": "echo '[{\"NFS_ENDPOINT_VM\": \"hypernprd12.ad.caixa:/fs_siccv\",\"NFS_MOUNT_POINT_VM\": \"/SICCV\"}]' | sed 's/NFS_ENDPOINT_ISILON[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_ISILON[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_HUAWEI[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_HUAWEI[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_VM[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_VM[^\"]*/NFS_MOUNT_POINT/g'", 
2026-10-06T13:23:56.9364628Z         "delta": "0:00:00.003710", 
2026-10-06T13:23:56.9364733Z         "deprecations": [
2026-10-06T13:23:56.9364842Z             {
2026-10-06T13:23:56.9365387Z                 "msg": "Distribution rhel 9.3 on host caddeapllx2821.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, but is using /usr/bin/python for backward compatibility with prior Ansible releases. A future Ansible release will default to using the discovered platform python for this host. See https://docs.ansible.com/ansible/2.9/reference_appendices/interpreter_discovery.html for more information", 
2026-10-06T13:23:56.9365683Z                 "version": "2.12"
2026-10-06T13:23:56.9365783Z             }
2026-10-06T13:23:56.9365917Z         ], 
2026-10-06T13:23:56.9366096Z         "end": "2026-10-06 10:23:56.855657", 
2026-10-06T13:23:56.9366211Z         "failed": false, 
2026-10-06T13:23:56.9366318Z         "rc": 0, 
2026-10-06T13:23:56.9366486Z         "start": "2026-10-06 10:23:56.851947", 
2026-10-06T13:23:56.9366611Z         "stderr": "", 
2026-10-06T13:23:56.9366722Z         "stderr_lines": [], 
2026-10-06T13:23:56.9367016Z         "stdout": "[{\"NFS_ENDPOINT\": \"hypernprd12.ad.caixa:/fs_siccv\",\"NFS_MOUNT_POINT\": \"/SICCV\"}]", 
2026-10-06T13:23:56.9367160Z         "stdout_lines": [
2026-10-06T13:23:56.9367299Z             "[{\"NFS_ENDPOINT\": \"hypernprd12.ad.caixa:/fs_siccv\",\"NFS_MOUNT_POINT\": \"/SICCV\"}]"
2026-10-06T13:23:56.9367483Z         ]
2026-10-06T13:23:56.9367579Z     }
2026-10-06T13:23:56.9367676Z }
2026-10-06T13:23:56.9394971Z Tuesday 06 October 2026  10:23:56 -0300 (0:00:00.061)       0:00:02.793 ******* 
2026-10-06T13:23:56.9956388Z 
2026-10-06T13:23:56.9956612Z TASK [nfs : Parse JSON data] ***************************************************
2026-10-06T13:23:56.9956781Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-06T13:23:56.9984725Z Tuesday 06 October 2026  10:23:56 -0300 (0:00:00.058)       0:00:02.852 ******* 
2026-10-06T13:23:57.0549597Z 
2026-10-06T13:23:57.0549814Z TASK [nfs : result_new_json] ***************************************************
2026-10-06T13:23:57.0551667Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-06T13:23:57.0551868Z     "msg": [
2026-10-06T13:23:57.0551971Z         {
2026-10-06T13:23:57.0552109Z             "NFS_ENDPOINT": "hypernprd12.ad.caixa:/fs_siccv", 
2026-10-06T13:23:57.0552336Z             "NFS_MOUNT_POINT": "/SICCV"
2026-10-06T13:23:57.0552448Z         }
2026-10-06T13:23:57.0552530Z     ]
2026-10-06T13:23:57.0552625Z }
2026-10-06T13:23:57.0580493Z Tuesday 06 October 2026  10:23:57 -0300 (0:00:00.059)       0:00:02.912 ******* 
2026-10-06T13:23:57.1186392Z included: /opt/ads-agent/_work/r12267/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx2821.agil.nprd.caixa.gov.br
2026-10-06T13:23:57.1244605Z Tuesday 06 October 2026  10:23:57 -0300 (0:00:00.066)       0:00:02.978 ******* 
2026-10-06T13:23:57.1791614Z 
2026-10-06T13:23:57.1791994Z TASK [nfs : Parse JSON data] ***************************************************
2026-10-06T13:23:57.1792160Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-06T13:23:57.1821745Z Tuesday 06 October 2026  10:23:57 -0300 (0:00:00.057)       0:00:03.036 ******* 
2026-10-06T13:23:57.2362532Z 
2026-10-06T13:23:57.2363171Z TASK [nfs : debug] *************************************************************
2026-10-06T13:23:57.2364175Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-06T13:23:57.2364355Z     "msg": {
2026-10-06T13:23:57.2364486Z         "NFS_ENDPOINT": "hypernprd12.ad.caixa:/fs_siccv", 
2026-10-06T13:23:57.2364635Z         "NFS_MOUNT_POINT": "/SICCV"
2026-10-06T13:23:57.2364744Z     }
2026-10-06T13:23:57.2364826Z }
2026-10-06T13:23:57.2395394Z Tuesday 06 October 2026  10:23:57 -0300 (0:00:00.057)       0:00:03.093 ******* 
2026-10-06T13:23:57.2928908Z 
2026-10-06T13:23:57.2929322Z TASK [nfs : debug] *************************************************************
2026-10-06T13:23:57.2929722Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-06T13:23:57.2929991Z     "msg": "/SICCV"
2026-10-06T13:23:57.2930094Z }
2026-10-06T13:23:57.2959076Z Tuesday 06 October 2026  10:23:57 -0300 (0:00:00.056)       0:00:03.149 ******* 
2026-10-06T13:23:57.3487504Z 
2026-10-06T13:23:57.3487855Z TASK [nfs : debug] *************************************************************
2026-10-06T13:23:57.3497422Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-06T13:23:57.3497685Z     "msg": "hypernprd12.ad.caixa:/fs_siccv"
2026-10-06T13:23:57.3497807Z }
2026-10-06T13:23:57.3528829Z Tuesday 06 October 2026  10:23:57 -0300 (0:00:00.056)       0:00:03.206 ******* 
2026-10-06T13:23:57.4092004Z 
2026-10-06T13:23:57.4093141Z TASK [nfs : Verificando as variaveis] ******************************************
2026-10-06T13:23:57.4093698Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-06T13:23:57.4093895Z     "changed": false, 
2026-10-06T13:23:57.4094105Z     "msg": "All assertions passed"
2026-10-06T13:23:57.4094222Z }
2026-10-06T13:23:57.4125870Z Tuesday 06 October 2026  10:23:57 -0300 (0:00:00.059)       0:00:03.266 ******* 
2026-10-06T13:24:00.7296891Z 
2026-10-06T13:24:00.7297692Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-10-06T13:24:00.7297855Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-06T13:24:00.7311092Z Tuesday 06 October 2026  10:24:00 -0300 (0:00:03.318)       0:00:06.585 ******* 
2026-10-06T13:24:01.5651031Z 
2026-10-06T13:24:01.5651568Z TASK [nfs : Install networker lgtoclnt_url] ************************************
2026-10-06T13:24:01.5651843Z [WARNING]: Consider using the yum, dnf or zypper module rather than running
2026-10-06T13:24:01.5652191Z 'rpm'.  If you need to use command because yum, dnf or zypper is insufficient
2026-10-06T13:24:01.5652416Z you can add 'warn: false' to this command task or set 'command_warnings=False'
2026-10-06T13:24:01.5652571Z in ansible.cfg to get rid of this message.
2026-10-06T13:24:01.5656739Z fatal: [caddeapllx2821.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.600382", "end": "2026-10-06 10:24:01.549573", "msg": "non-zero return code", "rc": 1, "start": "2026-10-06 10:24:00.949191", "stderr": "aviso: /var/tmp/rpm-tmp.TqlYcz: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.TqlYcz: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-10-06T13:24:01.5657642Z ...ignoring
2026-10-06T13:24:01.5690400Z Tuesday 06 October 2026  10:24:01 -0300 (0:00:00.837)       0:00:07.422 ******* 
2026-10-06T13:24:02.3806337Z 
2026-10-06T13:24:02.3806812Z TASK [nfs : Install networker lgtonmda_url] ************************************
2026-10-06T13:24:02.3808210Z fatal: [caddeapllx2821.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.574817", "end": "2026-10-06 10:24:02.364365", "msg": "non-zero return code", "rc": 1, "start": "2026-10-06 10:24:01.789548", "stderr": "aviso: /var/tmp/rpm-tmp.c7PAXO: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.c7PAXO: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-10-06T13:24:02.3808846Z ...ignoring
2026-10-06T13:24:02.3840438Z Tuesday 06 October 2026  10:24:02 -0300 (0:00:00.815)       0:00:08.237 ******* 
2026-10-06T13:24:02.7807871Z 
2026-10-06T13:24:02.7808626Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-10-06T13:24:02.7808801Z changed: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-06T13:24:02.7842422Z Tuesday 06 October 2026  10:24:02 -0300 (0:00:00.400)       0:00:08.638 ******* 
2026-10-06T13:24:03.0241947Z 
2026-10-06T13:24:03.0242465Z TASK [nfs : Create a symbolic link] ********************************************
2026-10-06T13:24:03.0242994Z changed: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-06T13:24:03.0277660Z Tuesday 06 October 2026  10:24:03 -0300 (0:00:00.243)       0:00:08.881 ******* 
2026-10-06T13:24:03.8952578Z 
2026-10-06T13:24:03.8953170Z TASK [nfs : Networker | Start networker] ***************************************
2026-10-06T13:24:03.8953336Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-06T13:24:03.8996437Z Tuesday 06 October 2026  10:24:03 -0300 (0:00:00.871)       0:00:09.753 ******* 
2026-10-06T13:24:04.1542641Z 
2026-10-06T13:24:04.1543541Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-10-06T13:24:04.1543760Z changed: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-06T13:24:04.1576154Z Tuesday 06 October 2026  10:24:04 -0300 (0:00:00.257)       0:00:10.011 ******* 
2026-10-06T13:24:14.5398336Z 
2026-10-06T13:24:14.5398852Z TASK [nfs : Networker | Restart networker] *************************************
2026-10-06T13:24:14.5399045Z changed: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-06T13:24:14.5426317Z Tuesday 06 October 2026  10:24:14 -0300 (0:00:10.384)       0:00:20.396 ******* 
2026-10-06T13:26:26.8376915Z 
2026-10-06T13:26:26.8377961Z TASK [nfs : Montando volume remoto] ********************************************
2026-10-06T13:26:26.8378281Z fatal: [caddeapllx2821.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "msg": "Error mounting /SICCV: mount.nfs: No route to host\n"}
2026-10-06T13:26:26.8378771Z ...ignoring
2026-10-06T13:26:26.8411784Z Tuesday 06 October 2026  10:26:26 -0300 (0:02:12.298)       0:02:32.695 ******* 
2026-10-06T13:26:26.9037164Z 
2026-10-06T13:26:26.9037873Z TASK [nfs : Validando Montagem] ************************************************
2026-10-06T13:26:26.9038864Z fatal: [caddeapllx2821.agil.nprd.caixa.gov.br]: FAILED! => {
2026-10-06T13:26:26.9039583Z     "assertion": "'Connection refused' in mountnfs.msg", 
2026-10-06T13:26:26.9039788Z     "changed": false, 
2026-10-06T13:26:26.9039935Z     "evaluated_to": false, 
2026-10-06T13:26:26.9040081Z     "msg": "Erro desconhecido: Error mounting /SICCV: mount.nfs: No route to host\n"
2026-10-06T13:26:26.9043496Z }
2026-10-06T13:26:26.9046900Z 
2026-10-06T13:26:26.9047852Z PLAY RECAP *********************************************************************
2026-10-06T13:26:26.9048049Z caddeapllx2821.agil.nprd.caixa.gov.br : ok=27   changed=8    unreachable=0    failed=1    skipped=0    rescued=0    ignored=3   
2026-10-06T13:26:26.9048171Z 
2026-10-06T13:26:26.9049103Z Tuesday 06 October 2026  10:26:26 -0300 (0:00:00.063)       0:02:32.758 ******* 
2026-10-06T13:26:26.9049284Z =============================================================================== 
2026-10-06T13:26:26.9052626Z nfs : Montando volume remoto ------------------------------------------ 132.30s
2026-10-06T13:26:26.9053177Z nfs : Networker | Restart networker ------------------------------------ 10.39s
2026-10-06T13:26:26.9053510Z nfs : Instalando o NFS Client ------------------------------------------- 3.32s
2026-10-06T13:26:26.9053753Z nfs : Networker | Start networker --------------------------------------- 0.87s
2026-10-06T13:26:26.9053994Z nfs : Install networker lgtoclnt_url ------------------------------------ 0.84s
2026-10-06T13:26:26.9054218Z nfs : Install networker lgtonmda_url ------------------------------------ 0.82s
2026-10-06T13:26:26.9054522Z nfs : execute montagem script ------------------------------------------- 0.66s
2026-10-06T13:26:26.9054755Z Verifica se o arquivo nfs_config.json existe ---------------------------- 0.56s
2026-10-06T13:26:26.9054985Z nfs : Coletar variáveis de ambiente ------------------------------------- 0.48s
2026-10-06T13:26:26.9055204Z nfs : Remove pacote jbcs-httpd ------------------------------------------ 0.40s
2026-10-06T13:26:26.9058076Z nfs : execute clean json ------------------------------------------------ 0.39s
2026-10-06T13:26:26.9058428Z nfs : Executar o comando abaixo para limitar as portas ------------------ 0.26s
2026-10-06T13:26:26.9058947Z nfs : Create a symbolic link -------------------------------------------- 0.24s
2026-10-06T13:26:26.9059174Z nfs : include_tasks ----------------------------------------------------- 0.07s
2026-10-06T13:26:26.9059407Z nfs : Validando Montagem ------------------------------------------------ 0.06s
2026-10-06T13:26:26.9059646Z nfs : Criar variáveis --------------------------------------------------- 0.06s
2026-10-06T13:26:26.9059871Z nfs : Criar variáveis --------------------------------------------------- 0.06s
2026-10-06T13:26:26.9060096Z nfs : ansible.builtin.debug --------------------------------------------- 0.06s
2026-10-06T13:26:26.9060325Z nfs : result_new_string_json -------------------------------------------- 0.06s
2026-10-06T13:26:26.9060553Z nfs : Verificando as variaveis ------------------------------------------ 0.06s
2026-10-06T13:26:26.9060708Z Playbook run took 0 days, 0 hours, 2 minutes, 32 seconds
2026-10-06T13:26:26.9730624Z ##[debug]Exit code 2 received from tool '/bin/bash'
2026-10-06T13:26:26.9740840Z ##[debug]STDIO streams have closed for tool '/bin/bash'
2026-10-06T13:26:26.9741446Z ##[error]Bash exited with code '2'.
2026-10-06T13:26:26.9741943Z ##[debug]Processed: ##vso[task.issue type=error;]Bash exited with code '2'.
2026-10-06T13:26:26.9742251Z ##[debug]task result: Failed
2026-10-06T13:26:26.9744580Z ##[debug]Processed: ##vso[task.complete result=Failed;done=true;]
2026-10-06T13:26:26.9745317Z ##[debug]Failure attempting to call the restapi and retry counter is exhausted
2026-10-06T13:26:26.9745588Z ##[debug]PERF: RetryHelper Method:System.Threading.Tasks.Task <RunAsync>b__9() : took 154948.1916 ms
2026-10-06T13:26:26.9745759Z ##[debug]PERF WARNING: RetryHelper Method:System.Threading.Tasks.Task <RunAsync>b__9() : took 154948.1916 ms
2026-10-06T13:26:26.9746470Z ##[section]Finishing: Configura Control-M
