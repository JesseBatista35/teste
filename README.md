2026-10-07T14:43:41.4267015Z ##[debug]Evaluating condition for step: 'Configurando Stack de Monitoração'
2026-10-07T14:43:41.4267567Z ##[debug]Evaluating: succeeded()
2026-10-07T14:43:41.4267748Z ##[debug]Evaluating succeeded:
2026-10-07T14:43:41.4268041Z ##[debug]=> True
2026-10-07T14:43:41.4268311Z ##[debug]Result: True
2026-10-07T14:43:41.4268549Z ##[section]Starting: Configurando Stack de Monitoração
2026-10-07T14:43:41.4271351Z ==============================================================================
2026-10-07T14:43:41.4271428Z Task         : Bash
2026-10-07T14:43:41.4271469Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-07T14:43:41.4271541Z Version      : 3.227.0
2026-10-07T14:43:41.4271583Z Author       : Microsoft Corporation
2026-10-07T14:43:41.4271632Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-07T14:43:41.4271710Z ==============================================================================
2026-10-07T14:43:42.1663334Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-10-07T14:43:42.2343530Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-10-07T14:43:42.2353393Z ##[debug]loading inputs and endpoints
2026-10-07T14:43:42.2379616Z ##[debug]loading INPUT_TARGETTYPE
2026-10-07T14:43:42.2380418Z ##[debug]loading INPUT_FILEPATH
2026-10-07T14:43:42.2380676Z ##[debug]loading INPUT_SCRIPT
2026-10-07T14:43:42.2380923Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-10-07T14:43:42.2381148Z ##[debug]loading INPUT_FAILONSTDERR
2026-10-07T14:43:42.2381396Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-10-07T14:43:42.2381650Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-10-07T14:43:42.2381917Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-10-07T14:43:42.2382167Z ##[debug]loading SECRET_FORTIFY_PASS
2026-10-07T14:43:42.2382392Z ##[debug]loading SECRET_PW_ISILON
2026-10-07T14:43:42.2382619Z ##[debug]loading SECRET_MQ_CLI_SENHA
2026-10-07T14:43:42.2382851Z ##[debug]loading SECRET_OKD_TOKEN_PRODUTOS
2026-10-07T14:43:42.2383210Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-10-07T14:43:42.2383450Z ##[debug]loading SECRET_PW_ALOCAIP
2026-10-07T14:43:42.2383663Z ##[debug]loading SECRET_MQ_SPI_SENHA
2026-10-07T14:43:42.2383886Z ##[debug]loading SECRET_TOKEN_CRQ
2026-10-07T14:43:42.2384110Z ##[debug]loading SECRET_ORACLE_SENHA
2026-10-07T14:43:42.2384329Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-10-07T14:43:42.2384553Z ##[debug]loading SECRET_ANSIBLE_VAULT
2026-10-07T14:43:42.2384785Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-10-07T14:43:42.2385009Z ##[debug]loading SECRET_MQ_SID_SENHA
2026-10-07T14:43:42.2393781Z ##[debug]loading SECRET_SSO_SENHA
2026-10-07T14:43:42.2394029Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-10-07T14:43:42.2394269Z ##[debug]loading SECRET_AZPAT
2026-10-07T14:43:42.2394476Z ##[debug]loaded 24
2026-10-07T14:43:42.2394695Z ##[debug]Agent.ProxyUrl=undefined
2026-10-07T14:43:42.2394917Z ##[debug]Agent.CAInfo=undefined
2026-10-07T14:43:42.2395128Z ##[debug]Agent.ClientCert=undefined
2026-10-07T14:43:42.2395564Z ##[debug]Agent.SkipCertValidation=True
2026-10-07T14:43:42.2403555Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-10-07T14:43:42.2405574Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-10-07T14:43:42.2406037Z ##[debug]system.culture=en-US
2026-10-07T14:43:42.2413580Z ##[debug]failOnStderr=false
2026-10-07T14:43:42.2423706Z ##[debug]workingDirectory=/opt/ads-agent/_work/r4224/a
2026-10-07T14:43:42.2423969Z ##[debug]check path : /opt/ads-agent/_work/r4224/a
2026-10-07T14:43:42.2424208Z ##[debug]targetType=inline
2026-10-07T14:43:42.2424427Z ##[debug]bashEnvValue=undefined
2026-10-07T14:43:42.2424857Z ##[debug]script=set -x
REPO=$(echo _SIRTA | sed 's/_//')
ansible-playbook /opt/ads-agent/esteira-jboss-vm/site.yml --tags monitoracao --skip-tags jboss -e sistema_ambiente=tqs -e quantidade_vm=1 -e sistema_nome=SIRTA -e default_working_directory_tfs=/opt/ads-agent/_work/r4224/a -e build_repository_name_tfs=$REPO -e centralizadora_desenvolvimento=7390 -e centralizadora_operacoes=7259 -e fields_site=BR -e site=ctc_nprd
2026-10-07T14:43:42.2425408Z Generating script.
2026-10-07T14:43:42.2426681Z ##[debug]which 'bash'
2026-10-07T14:43:42.2432644Z ##[debug]found: '/bin/bash'
2026-10-07T14:43:42.2433203Z ##[debug]Agent.Version=3.225.2
2026-10-07T14:43:42.2433624Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-10-07T14:43:42.2434035Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-10-07T14:43:42.2434761Z ========================== Starting Command Output ===========================
2026-10-07T14:43:42.2436357Z ##[debug]which '/bin/bash'
2026-10-07T14:43:42.2436636Z ##[debug]found: '/bin/bash'
2026-10-07T14:43:42.2437263Z ##[debug]/bin/bash arg: /opt/ads-agent/_work/_temp/24e448d9-8065-4aad-ac5a-74942e18f3d4.sh
2026-10-07T14:43:42.2444070Z ##[debug]exec tool: /bin/bash
2026-10-07T14:43:42.2445131Z ##[debug]arguments:
2026-10-07T14:43:42.2445402Z ##[debug]   /opt/ads-agent/_work/_temp/24e448d9-8065-4aad-ac5a-74942e18f3d4.sh
2026-10-07T14:43:42.2446127Z [command]/bin/bash /opt/ads-agent/_work/_temp/24e448d9-8065-4aad-ac5a-74942e18f3d4.sh
2026-10-07T14:43:42.2490769Z ++ echo _SIRTA
2026-10-07T14:43:42.2490912Z ++ sed s/_//
2026-10-07T14:43:42.2499834Z + REPO=SIRTA
2026-10-07T14:43:42.2500775Z + ansible-playbook /opt/ads-agent/esteira-jboss-vm/site.yml --tags monitoracao --skip-tags jboss -e sistema_ambiente=tqs -e quantidade_vm=1 -e sistema_nome=SIRTA -e default_working_directory_tfs=/opt/ads-agent/_work/r4224/a -e build_repository_name_tfs=SIRTA -e centralizadora_desenvolvimento=7390 -e centralizadora_operacoes=7259 -e fields_site=BR -e site=ctc_nprd
2026-10-07T14:43:44.1076766Z 
2026-10-07T14:43:44.1077268Z PLAY [local] *******************************************************************
2026-10-07T14:43:44.1766011Z 
2026-10-07T14:43:44.1766641Z PLAY [Configurando o DNS] ******************************************************
2026-10-07T14:43:44.3665455Z 
2026-10-07T14:43:44.3665973Z PLAY [local] *******************************************************************
2026-10-07T14:43:44.3684388Z 
2026-10-07T14:43:44.3684588Z PLAY [local] *******************************************************************
2026-10-07T14:43:44.3711762Z 
2026-10-07T14:43:44.3712332Z PLAY [Verificando serviços] ****************************************************
2026-10-07T14:43:44.3804788Z Wednesday 07 October 2026  11:43:44 -0300 (0:00:00.331)       0:00:00.331 ***** 
2026-10-07T14:43:46.1289438Z 
2026-10-07T14:43:46.1290443Z TASK [Gathering Facts] *********************************************************
2026-10-07T14:43:46.1290696Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br]
2026-10-07T14:43:46.1445817Z Wednesday 07 October 2026  11:43:46 -0300 (0:00:01.763)       0:00:02.095 ***** 
2026-10-07T14:43:46.5355441Z 
2026-10-07T14:43:46.5356184Z TASK [Verifiando o jxm_exporter esta instalado] ********************************
2026-10-07T14:43:46.5357071Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br]
2026-10-07T14:43:46.5488296Z Wednesday 07 October 2026  11:43:46 -0300 (0:00:00.404)       0:00:02.500 ***** 
2026-10-07T14:43:46.6018120Z Wednesday 07 October 2026  11:43:46 -0300 (0:00:00.052)       0:00:02.553 ***** 
2026-10-07T14:43:46.6538512Z Wednesday 07 October 2026  11:43:46 -0300 (0:00:00.052)       0:00:02.605 ***** 
2026-10-07T14:43:46.7091999Z Wednesday 07 October 2026  11:43:46 -0300 (0:00:00.055)       0:00:02.660 ***** 
2026-10-07T14:43:47.1110359Z 
2026-10-07T14:43:47.1111077Z TASK [Criando o grupo do "node_exporter"] **************************************
2026-10-07T14:43:47.1111426Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br]
2026-10-07T14:43:47.1257117Z Wednesday 07 October 2026  11:43:47 -0300 (0:00:00.416)       0:00:03.077 ***** 
2026-10-07T14:43:47.6630137Z 
2026-10-07T14:43:47.6630688Z TASK [Criando o usuario "node_exporter" vinculado ao grupo "node_exporter"] ****
2026-10-07T14:43:47.6630856Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br]
2026-10-07T14:43:47.6746115Z Wednesday 07 October 2026  11:43:47 -0300 (0:00:00.548)       0:00:03.625 ***** 
2026-10-07T14:43:48.3718462Z 
2026-10-07T14:43:48.3719065Z TASK [node_exporter : Copia o Apache Exporter para o servidor] *****************
2026-10-07T14:43:48.3719325Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br]
2026-10-07T14:43:48.3886050Z Wednesday 07 October 2026  11:43:48 -0300 (0:00:00.714)       0:00:04.340 ***** 
2026-10-07T14:43:49.1715365Z 
2026-10-07T14:43:49.1716091Z TASK [node_exporter : Criando o service do Node Exporter] **********************
2026-10-07T14:43:49.1716285Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br]
2026-10-07T14:43:49.1826901Z Wednesday 07 October 2026  11:43:49 -0300 (0:00:00.794)       0:00:05.134 ***** 
2026-10-07T14:43:49.6666099Z 
2026-10-07T14:43:49.6667043Z TASK [Download RPM filebeat] ***************************************************
2026-10-07T14:43:49.6668050Z changed: [caddeapllx1858.agil.nprd.caixa.gov.br]
2026-10-07T14:43:49.6799986Z Wednesday 07 October 2026  11:43:49 -0300 (0:00:00.497)       0:00:05.631 ***** 
2026-10-07T14:43:50.5326936Z 
2026-10-07T14:43:50.5327447Z TASK [Instalando o filebeat versao 7.2.1] **************************************
2026-10-07T14:43:50.5327616Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br]
2026-10-07T14:43:50.5456584Z Wednesday 07 October 2026  11:43:50 -0300 (0:00:00.864)       0:00:06.496 ***** 
2026-10-07T14:43:50.8223453Z 
2026-10-07T14:43:50.8223939Z TASK [Delete RPM filebeat] *****************************************************
2026-10-07T14:43:50.8224146Z changed: [caddeapllx1858.agil.nprd.caixa.gov.br]
2026-10-07T14:43:50.8348263Z Wednesday 07 October 2026  11:43:50 -0300 (0:00:00.290)       0:00:06.786 ***** 
2026-10-07T14:43:51.4277652Z 
2026-10-07T14:43:51.4278153Z TASK [Template a file to /etc/filebeat/filebeat.yml] ***************************
2026-10-07T14:43:51.4278317Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br]
2026-10-07T14:43:51.4400355Z Wednesday 07 October 2026  11:43:51 -0300 (0:00:00.605)       0:00:07.391 ***** 
2026-10-07T14:43:51.7216628Z 
2026-10-07T14:43:51.7217769Z TASK [Verificando APM Agent] ***************************************************
2026-10-07T14:43:51.7218010Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br]
2026-10-07T14:43:51.7331056Z Wednesday 07 October 2026  11:43:51 -0300 (0:00:00.292)       0:00:07.684 ***** 
2026-10-07T14:43:51.7924453Z Wednesday 07 October 2026  11:43:51 -0300 (0:00:00.059)       0:00:07.743 ***** 
2026-10-07T14:43:51.8449959Z Wednesday 07 October 2026  11:43:51 -0300 (0:00:00.052)       0:00:07.796 ***** 
2026-10-07T14:43:51.8959512Z Wednesday 07 October 2026  11:43:51 -0300 (0:00:00.050)       0:00:07.847 ***** 
2026-10-07T14:43:51.9494798Z Wednesday 07 October 2026  11:43:51 -0300 (0:00:00.053)       0:00:07.900 ***** 
2026-10-07T14:43:51.9995554Z Wednesday 07 October 2026  11:43:51 -0300 (0:00:00.050)       0:00:07.950 ***** 
2026-10-07T14:43:52.4384084Z 
2026-10-07T14:43:52.4384810Z TASK [Verifica se existe servico zabbix-agent] *********************************
2026-10-07T14:43:52.4385845Z fatal: [caddeapllx1858.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["systemctl", "is-active", "zabbix-agent"], "delta": "0:00:00.004965", "end": "2026-10-07 11:43:52.424458", "msg": "non-zero return code", "rc": 3, "start": "2026-10-07 11:43:52.419493", "stderr": "", "stderr_lines": [], "stdout": "unknown", "stdout_lines": ["unknown"]}
2026-10-07T14:43:52.4386109Z ...ignoring
2026-10-07T14:43:52.4507614Z Wednesday 07 October 2026  11:43:52 -0300 (0:00:00.451)       0:00:08.402 ***** 
2026-10-07T14:43:52.5191952Z Wednesday 07 October 2026  11:43:52 -0300 (0:00:00.068)       0:00:08.470 ***** 
2026-10-07T14:43:53.1021878Z 
2026-10-07T14:43:53.1022787Z TASK [zabbix : Install libpcre2-8 - Red Hat 7] *********************************
2026-10-07T14:43:53.1023167Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br]
2026-10-07T14:43:53.1128286Z Wednesday 07 October 2026  11:43:53 -0300 (0:00:00.593)       0:00:09.064 ***** 
2026-10-07T14:43:53.7125730Z 
2026-10-07T14:43:53.7126730Z TASK [Install zabbix agent2] ***************************************************
2026-10-07T14:43:53.7127319Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br] => (item=http://10.122.154.12/deploy/zabbix-agent2-plugin-mongodb-6.0.23-release1.el7.x86_64.rpm)
2026-10-07T14:43:54.2604857Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br] => (item=http://10.122.154.12/deploy/zabbix-agent2-plugin-postgresql-6.0.23-release1.el7.x86_64.rpm)
2026-10-07T14:43:54.8187988Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br] => (item=http://10.122.154.12/deploy/zabbix-agent2-6.0.23-release1.el7.x86_64.rpm)
2026-10-07T14:43:54.8313775Z Wednesday 07 October 2026  11:43:54 -0300 (0:00:01.718)       0:00:10.782 ***** 
2026-10-07T14:43:55.4312694Z 
2026-10-07T14:43:55.4313591Z TASK [Template a file to /etc/zabbix_zabbix_agente.d/monit_agent2.conf] ********
2026-10-07T14:43:55.4314256Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br]
2026-10-07T14:43:55.4424744Z Wednesday 07 October 2026  11:43:55 -0300 (0:00:00.611)       0:00:11.393 ***** 
2026-10-07T14:43:56.0649671Z 
2026-10-07T14:43:56.0650195Z TASK [Garantindo que o zabbix_agent2 esta startado] ****************************
2026-10-07T14:43:56.0650606Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br]
2026-10-07T14:43:56.0777151Z Wednesday 07 October 2026  11:43:56 -0300 (0:00:00.635)       0:00:12.029 ***** 
2026-10-07T14:43:56.1266263Z Wednesday 07 October 2026  11:43:56 -0300 (0:00:00.048)       0:00:12.078 ***** 
2026-10-07T14:43:56.1854775Z 
2026-10-07T14:43:56.1855497Z TASK [zabbix : Gera o nome do grupo e templates quando o ambiente não é PRD] ***
2026-10-07T14:43:56.1855709Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br]
2026-10-07T14:43:56.1985675Z Wednesday 07 October 2026  11:43:56 -0300 (0:00:00.072)       0:00:12.150 ***** 
2026-10-07T14:43:56.9915839Z 
2026-10-07T14:43:56.9916417Z TASK [zabbix : hostgroup create to Zabbix Az CEMOT] ****************************
2026-10-07T14:43:56.9916734Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br]
2026-10-07T14:43:57.0021495Z Wednesday 07 October 2026  11:43:57 -0300 (0:00:00.803)       0:00:12.953 ***** 
2026-10-07T14:43:57.6114099Z 
2026-10-07T14:43:57.6114622Z TASK [zabbix : template get to Zabbix Az CEMOT] ********************************
2026-10-07T14:43:57.6114788Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br]
2026-10-07T14:43:57.6251183Z Wednesday 07 October 2026  11:43:57 -0300 (0:00:00.622)       0:00:13.576 ***** 
2026-10-07T14:43:58.2407063Z 
2026-10-07T14:43:58.2407688Z TASK [zabbix : hostgroup get to Zabbix Az CEMOT] *******************************
2026-10-07T14:43:58.2408046Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br]
2026-10-07T14:43:58.2543195Z Wednesday 07 October 2026  11:43:58 -0300 (0:00:00.629)       0:00:14.205 ***** 
2026-10-07T14:43:58.8855788Z 
2026-10-07T14:43:58.8856553Z TASK [zabbix : proxy get to Zabbix Az CEMOT] ***********************************
2026-10-07T14:43:58.8856894Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br]
2026-10-07T14:43:58.8991455Z Wednesday 07 October 2026  11:43:58 -0300 (0:00:00.644)       0:00:14.850 ***** 
2026-10-07T14:43:59.5559796Z 
2026-10-07T14:43:59.5560497Z TASK [zabbix : host create to Zabbix Az CEMOT] *********************************
2026-10-07T14:43:59.5560793Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br]
2026-10-07T14:43:59.5680737Z Wednesday 07 October 2026  11:43:59 -0300 (0:00:00.668)       0:00:15.519 ***** 
2026-10-07T14:43:59.6181158Z Wednesday 07 October 2026  11:43:59 -0300 (0:00:00.049)       0:00:15.569 ***** 
2026-10-07T14:43:59.6758938Z 
2026-10-07T14:43:59.6759436Z TASK [zabbix : Gera o nome do grupo e define os templates quando o ambiente NPRD] ***
2026-10-07T14:43:59.6759607Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br]
2026-10-07T14:43:59.6869220Z Wednesday 07 October 2026  11:43:59 -0300 (0:00:00.068)       0:00:15.638 ***** 
2026-10-07T14:43:59.7419206Z 
2026-10-07T14:43:59.7419889Z TASK [zabbix : Gera os nomes de grupos e dados para tratamento dos consolidados.] ***
2026-10-07T14:43:59.7420228Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br]
2026-10-07T14:43:59.7548710Z Wednesday 07 October 2026  11:43:59 -0300 (0:00:00.067)       0:00:15.706 ***** 
2026-10-07T14:43:59.8093798Z /opt/ads-agent/ansible/lib/python2.7/site-packages/psycopg2/__init__.py:144: UserWarning: The psycopg2 wheel package will be renamed from release 2.8; in order to keep installing from binary please use "pip install psycopg2-binary" instead. For details see: <http://initd.org/psycopg/docs/install.html#binary-install-from-pypi>.
2026-10-07T14:43:59.8094182Z   """)
2026-10-07T14:44:02.4750230Z 
2026-10-07T14:44:02.4751029Z TASK [zabbix : Consultar os dados do sistema.] *********************************
2026-10-07T14:44:02.4751763Z fatal: [caddeapllx1858.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "msg": "unable to connect to database: FATAL:  password authentication failed for user \"monitdbadm\"\nFATAL:  no pg_hba.conf entry for host \"10.122.156.86\", user \"monitdbadm\", database \"monitordb001\", no encryption\n"}
2026-10-07T14:44:02.4752032Z 
2026-10-07T14:44:02.4752172Z PLAY RECAP *********************************************************************
2026-10-07T14:44:02.4752385Z caddeapllx1858.agil.nprd.caixa.gov.br : ok=24   changed=3    unreachable=0    failed=1    skipped=11   rescued=0    ignored=1   
2026-10-07T14:44:02.4752471Z 
2026-10-07T14:44:02.4752843Z Wednesday 07 October 2026  11:44:02 -0300 (0:00:02.720)       0:00:18.426 ***** 
2026-10-07T14:44:02.4753172Z =============================================================================== 
2026-10-07T14:44:02.4753726Z zabbix : Consultar os dados do sistema. --------------------------------- 2.72s
2026-10-07T14:44:02.4754130Z Gathering Facts --------------------------------------------------------- 1.76s
2026-10-07T14:44:02.4754362Z Install zabbix agent2 --------------------------------------------------- 1.72s
2026-10-07T14:44:02.4754586Z Instalando o filebeat versao 7.2.1 -------------------------------------- 0.86s
2026-10-07T14:44:02.4754849Z zabbix : hostgroup create to Zabbix Az CEMOT ---------------------------- 0.80s
2026-10-07T14:44:02.4755075Z node_exporter : Criando o service do Node Exporter ---------------------- 0.79s
2026-10-07T14:44:02.4755299Z node_exporter : Copia o Apache Exporter para o servidor ----------------- 0.71s
2026-10-07T14:44:02.4755520Z zabbix : host create to Zabbix Az CEMOT --------------------------------- 0.67s
2026-10-07T14:44:02.4755759Z zabbix : proxy get to Zabbix Az CEMOT ----------------------------------- 0.64s
2026-10-07T14:44:02.4755994Z Garantindo que o zabbix_agent2 esta startado ---------------------------- 0.64s
2026-10-07T14:44:02.4756215Z zabbix : hostgroup get to Zabbix Az CEMOT ------------------------------- 0.63s
2026-10-07T14:44:02.4756459Z zabbix : template get to Zabbix Az CEMOT -------------------------------- 0.62s
2026-10-07T14:44:02.4756769Z Template a file to /etc/zabbix_zabbix_agente.d/monit_agent2.conf -------- 0.61s
2026-10-07T14:44:02.4756990Z Template a file to /etc/filebeat/filebeat.yml --------------------------- 0.61s
2026-10-07T14:44:02.4757203Z zabbix : Install libpcre2-8 - Red Hat 7 --------------------------------- 0.59s
2026-10-07T14:44:02.4757723Z Criando o usuario "node_exporter" vinculado ao grupo "node_exporter" ---- 0.55s
2026-10-07T14:44:02.4757940Z Download RPM filebeat --------------------------------------------------- 0.50s
2026-10-07T14:44:02.4758206Z Verifica se existe servico zabbix-agent --------------------------------- 0.45s
2026-10-07T14:44:02.4758426Z Criando o grupo do "node_exporter" -------------------------------------- 0.42s
2026-10-07T14:44:02.4758664Z Verifiando o jxm_exporter esta instalado -------------------------------- 0.40s
2026-10-07T14:44:02.4758883Z Playbook run took 0 days, 0 hours, 0 minutes, 18 seconds
2026-10-07T14:44:02.5385054Z ##[debug]Exit code 2 received from tool '/bin/bash'
2026-10-07T14:44:02.5385388Z ##[debug]STDIO streams have closed for tool '/bin/bash'
2026-10-07T14:44:02.5412275Z ##[error]Bash exited with code '2'.
2026-10-07T14:44:02.5412765Z ##[debug]Processed: ##vso[task.issue type=error;]Bash exited with code '2'.
2026-10-07T14:44:02.5413600Z ##[debug]task result: Failed
2026-10-07T14:44:02.5414588Z ##[debug]Processed: ##vso[task.complete result=Failed;done=true;]
2026-10-07T14:44:02.5416994Z ##[section]Finishing: Configurando Stack de Monitoração
