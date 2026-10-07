Prezado(a)s,

O SIRTA está falhando no deploy de TQS no passo "Configurando Stack de Monitoração".

https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=537141&environmentId=2495646


2026-10-06T21:06:07.4097472Z ##[debug]Evaluating condition for step: 'Configurando Stack de Monitoração'
2026-10-06T21:06:07.4098138Z ##[debug]Evaluating: succeeded()
2026-10-06T21:06:07.4098345Z ##[debug]Evaluating succeeded:
2026-10-06T21:06:07.4098697Z ##[debug]=> True
2026-10-06T21:06:07.4098925Z ##[debug]Result: True
2026-10-06T21:06:07.4099155Z ##[section]Starting: Configurando Stack de Monitoração
2026-10-06T21:06:07.4102289Z ==============================================================================
2026-10-06T21:06:07.4102413Z Task         : Bash
2026-10-06T21:06:07.4102456Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-06T21:06:07.4102519Z Version      : 3.227.0
2026-10-06T21:06:07.4102575Z Author       : Microsoft Corporation
2026-10-06T21:06:07.4102625Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-06T21:06:07.4102707Z ==============================================================================
2026-10-06T21:06:08.0509565Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-10-06T21:06:08.1210540Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-10-06T21:06:08.1218158Z ##[debug]loading inputs and endpoints
2026-10-06T21:06:08.1221021Z ##[debug]loading INPUT_TARGETTYPE
2026-10-06T21:06:08.1228719Z ##[debug]loading INPUT_FILEPATH
2026-10-06T21:06:08.1229914Z ##[debug]loading INPUT_SCRIPT
2026-10-06T21:06:08.1245989Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-10-06T21:06:08.1246292Z ##[debug]loading INPUT_FAILONSTDERR
2026-10-06T21:06:08.1246540Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-10-06T21:06:08.1246818Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-10-06T21:06:08.1247078Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-10-06T21:06:08.1247337Z ##[debug]loading SECRET_SSO_SENHA
2026-10-06T21:06:08.1247577Z ##[debug]loading SECRET_MQ_CLI_SENHA
2026-10-06T21:06:08.1247807Z ##[debug]loading SECRET_ORACLE_SENHA
2026-10-06T21:06:08.1248115Z ##[debug]loading SECRET_PW_ALOCAIP
2026-10-06T21:06:08.1248368Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-10-06T21:06:08.1248609Z ##[debug]loading SECRET_FORTIFY_PASS
2026-10-06T21:06:08.1248836Z ##[debug]loading SECRET_PW_ISILON
2026-10-06T21:06:08.1249051Z ##[debug]loading SECRET_AZPAT
2026-10-06T21:06:08.1249595Z ##[debug]loading SECRET_MQ_SPI_SENHA
2026-10-06T21:06:08.1249894Z ##[debug]loading SECRET_ANSIBLE_VAULT
2026-10-06T21:06:08.1251383Z ##[debug]loading SECRET_OKD_TOKEN_PRODUTOS
2026-10-06T21:06:08.1252658Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-10-06T21:06:08.1253979Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-10-06T21:06:08.1255245Z ##[debug]loading SECRET_MQ_SID_SENHA
2026-10-06T21:06:08.1256651Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-10-06T21:06:08.1257975Z ##[debug]loading SECRET_TOKEN_CRQ
2026-10-06T21:06:08.1259375Z ##[debug]loaded 24
2026-10-06T21:06:08.1260716Z ##[debug]Agent.ProxyUrl=undefined
2026-10-06T21:06:08.1261955Z ##[debug]Agent.CAInfo=undefined
2026-10-06T21:06:08.1263177Z ##[debug]Agent.ClientCert=undefined
2026-10-06T21:06:08.1264407Z ##[debug]Agent.SkipCertValidation=True
2026-10-06T21:06:08.1271826Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-10-06T21:06:08.1273927Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-10-06T21:06:08.1275230Z ##[debug]system.culture=en-US
2026-10-06T21:06:08.1282316Z ##[debug]failOnStderr=false
2026-10-06T21:06:08.1283608Z ##[debug]workingDirectory=/opt/ads-agent/_work/r5997/a
2026-10-06T21:06:08.1284930Z ##[debug]check path : /opt/ads-agent/_work/r5997/a
2026-10-06T21:06:08.1286640Z ##[debug]targetType=inline
2026-10-06T21:06:08.1287898Z ##[debug]bashEnvValue=undefined
2026-10-06T21:06:08.1289483Z ##[debug]script=set -x
REPO=$(echo _SIRTA | sed 's/_//')
ansible-playbook /opt/ads-agent/esteira-jboss-vm/site.yml --tags monitoracao --skip-tags jboss -e sistema_ambiente=tqs -e quantidade_vm=1 -e sistema_nome=SIRTA -e default_working_directory_tfs=/opt/ads-agent/_work/r5997/a -e build_repository_name_tfs=$REPO -e centralizadora_desenvolvimento=7390 -e centralizadora_operacoes=7259 -e fields_site=BR -e site=$(site)
2026-10-06T21:06:08.1293010Z Generating script.
2026-10-06T21:06:08.1295000Z ##[debug]which 'bash'
2026-10-06T21:06:08.1300215Z ##[debug]found: '/bin/bash'
2026-10-06T21:06:08.1301458Z ##[debug]Agent.Version=3.225.2
2026-10-06T21:06:08.1302842Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-10-06T21:06:08.1304246Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-10-06T21:06:08.1307118Z ========================== Starting Command Output ===========================
2026-10-06T21:06:08.1308683Z ##[debug]which '/bin/bash'
2026-10-06T21:06:08.1309948Z ##[debug]found: '/bin/bash'
2026-10-06T21:06:08.1311289Z ##[debug]/bin/bash arg: /opt/ads-agent/_work/_temp/81ed2bff-67d7-4742-a02d-106b72cee2c1.sh
2026-10-06T21:06:08.1312580Z ##[debug]exec tool: /bin/bash
2026-10-06T21:06:08.1313962Z ##[debug]arguments:
2026-10-06T21:06:08.1315312Z ##[debug]   /opt/ads-agent/_work/_temp/81ed2bff-67d7-4742-a02d-106b72cee2c1.sh
2026-10-06T21:06:08.1316712Z [command]/bin/bash /opt/ads-agent/_work/_temp/81ed2bff-67d7-4742-a02d-106b72cee2c1.sh
2026-10-06T21:06:08.1355694Z ++ echo _SIRTA
2026-10-06T21:06:08.1356952Z ++ sed s/_//
2026-10-06T21:06:08.1364365Z + REPO=SIRTA
2026-10-06T21:06:08.1367752Z ++ site
2026-10-06T21:06:08.1370295Z /opt/ads-agent/_work/_temp/81ed2bff-67d7-4742-a02d-106b72cee2c1.sh: line 3: site: comando não encontrado
2026-10-06T21:06:08.1371946Z + ansible-playbook /opt/ads-agent/esteira-jboss-vm/site.yml --tags monitoracao --skip-tags jboss -e sistema_ambiente=tqs -e quantidade_vm=1 -e sistema_nome=SIRTA -e default_working_directory_tfs=/opt/ads-agent/_work/r5997/a -e build_repository_name_tfs=SIRTA -e centralizadora_desenvolvimento=7390 -e centralizadora_operacoes=7259 -e fields_site=BR -e site=
2026-10-06T21:06:10.1064118Z 
2026-10-06T21:06:10.1064576Z PLAY [local] *******************************************************************
2026-10-06T21:06:10.1621491Z 
2026-10-06T21:06:10.1621992Z PLAY [Configurando o DNS] ******************************************************
2026-10-06T21:06:10.3759796Z 
2026-10-06T21:06:10.3760445Z PLAY [local] *******************************************************************
2026-10-06T21:06:10.3783316Z 
2026-10-06T21:06:10.3783761Z PLAY [local] *******************************************************************
2026-10-06T21:06:10.3810734Z 
2026-10-06T21:06:10.3811401Z PLAY [Verificando serviços] ****************************************************
2026-10-06T21:06:10.3907455Z Tuesday 06 October 2026  18:06:10 -0300 (0:00:00.341)       0:00:00.341 ******* 
2026-10-06T21:06:12.3507750Z 
2026-10-06T21:06:12.3508316Z TASK [Gathering Facts] *********************************************************
2026-10-06T21:06:12.3508487Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br]
2026-10-06T21:06:12.3652090Z Tuesday 06 October 2026  18:06:12 -0300 (0:00:01.974)       0:00:02.316 ******* 
2026-10-06T21:06:12.7731423Z 
2026-10-06T21:06:12.7731922Z TASK [Verifiando o jxm_exporter esta instalado] ********************************
2026-10-06T21:06:12.7732090Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br]
2026-10-06T21:06:12.7848259Z Tuesday 06 October 2026  18:06:12 -0300 (0:00:00.419)       0:00:02.735 ******* 
2026-10-06T21:06:12.8345752Z Tuesday 06 October 2026  18:06:12 -0300 (0:00:00.049)       0:00:02.785 ******* 
2026-10-06T21:06:12.8845794Z Tuesday 06 October 2026  18:06:12 -0300 (0:00:00.050)       0:00:02.835 ******* 
2026-10-06T21:06:12.9369933Z Tuesday 06 October 2026  18:06:12 -0300 (0:00:00.052)       0:00:02.887 ******* 
2026-10-06T21:06:13.3527791Z 
2026-10-06T21:06:13.3528596Z TASK [Criando o grupo do "node_exporter"] **************************************
2026-10-06T21:06:13.3529264Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br]
2026-10-06T21:06:13.3664985Z Tuesday 06 October 2026  18:06:13 -0300 (0:00:00.429)       0:00:03.317 ******* 
2026-10-06T21:06:13.9273572Z 
2026-10-06T21:06:13.9274363Z TASK [Criando o usuario "node_exporter" vinculado ao grupo "node_exporter"] ****
2026-10-06T21:06:13.9274529Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br]
2026-10-06T21:06:13.9390239Z Tuesday 06 October 2026  18:06:13 -0300 (0:00:00.572)       0:00:03.890 ******* 
2026-10-06T21:06:14.6253357Z 
2026-10-06T21:06:14.6254130Z TASK [node_exporter : Copia o Apache Exporter para o servidor] *****************
2026-10-06T21:06:14.6369208Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br]
2026-10-06T21:06:14.6369669Z Tuesday 06 October 2026  18:06:14 -0300 (0:00:00.697)       0:00:04.588 ******* 
2026-10-06T21:06:15.4351887Z 
2026-10-06T21:06:15.4352955Z TASK [node_exporter : Criando o service do Node Exporter] **********************
2026-10-06T21:06:15.4353168Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br]
2026-10-06T21:06:15.4445684Z Tuesday 06 October 2026  18:06:15 -0300 (0:00:00.807)       0:00:05.395 ******* 
2026-10-06T21:06:15.9812468Z 
2026-10-06T21:06:15.9813359Z TASK [Download RPM filebeat] ***************************************************
2026-10-06T21:06:15.9813591Z changed: [caddeapllx1858.agil.nprd.caixa.gov.br]
2026-10-06T21:06:15.9966641Z Tuesday 06 October 2026  18:06:15 -0300 (0:00:00.551)       0:00:05.947 ******* 
2026-10-06T21:06:16.9202953Z 
2026-10-06T21:06:16.9203764Z TASK [Instalando o filebeat versao 7.2.1] **************************************
2026-10-06T21:06:16.9204673Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br]
2026-10-06T21:06:16.9306072Z Tuesday 06 October 2026  18:06:16 -0300 (0:00:00.934)       0:00:06.881 ******* 
2026-10-06T21:06:17.2292919Z 
2026-10-06T21:06:17.2294731Z TASK [Delete RPM filebeat] *****************************************************
2026-10-06T21:06:17.2295473Z changed: [caddeapllx1858.agil.nprd.caixa.gov.br]
2026-10-06T21:06:17.2408796Z Tuesday 06 October 2026  18:06:17 -0300 (0:00:00.310)       0:00:07.191 ******* 
2026-10-06T21:06:18.1070394Z 
2026-10-06T21:06:18.1072012Z TASK [Template a file to /etc/filebeat/filebeat.yml] ***************************
2026-10-06T21:06:18.1072837Z changed: [caddeapllx1858.agil.nprd.caixa.gov.br]
2026-10-06T21:06:18.1189069Z Tuesday 06 October 2026  18:06:18 -0300 (0:00:00.878)       0:00:08.069 ******* 
2026-10-06T21:06:18.4233953Z 
2026-10-06T21:06:18.4234897Z TASK [Verificando APM Agent] ***************************************************
2026-10-06T21:06:18.4235155Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br]
2026-10-06T21:06:18.4374430Z Tuesday 06 October 2026  18:06:18 -0300 (0:00:00.318)       0:00:08.388 ******* 
2026-10-06T21:06:18.4967552Z Tuesday 06 October 2026  18:06:18 -0300 (0:00:00.059)       0:00:08.447 ******* 
2026-10-06T21:06:18.5520554Z Tuesday 06 October 2026  18:06:18 -0300 (0:00:00.055)       0:00:08.502 ******* 
2026-10-06T21:06:18.6049414Z Tuesday 06 October 2026  18:06:18 -0300 (0:00:00.052)       0:00:08.555 ******* 
2026-10-06T21:06:18.6566176Z Tuesday 06 October 2026  18:06:18 -0300 (0:00:00.051)       0:00:08.607 ******* 
2026-10-06T21:06:18.7138472Z Tuesday 06 October 2026  18:06:18 -0300 (0:00:00.057)       0:00:08.664 ******* 
2026-10-06T21:06:19.1592215Z 
2026-10-06T21:06:19.1593055Z TASK [Verifica se existe servico zabbix-agent] *********************************
2026-10-06T21:06:19.1593779Z fatal: [caddeapllx1858.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["systemctl", "is-active", "zabbix-agent"], "delta": "0:00:00.005090", "end": "2026-10-06 18:06:19.144115", "msg": "non-zero return code", "rc": 3, "start": "2026-10-06 18:06:19.139025", "stderr": "", "stderr_lines": [], "stdout": "unknown", "stdout_lines": ["unknown"]}
2026-10-06T21:06:19.1594677Z ...ignoring
2026-10-06T21:06:19.1717440Z Tuesday 06 October 2026  18:06:19 -0300 (0:00:00.457)       0:00:09.122 ******* 
2026-10-06T21:06:19.2264353Z Tuesday 06 October 2026  18:06:19 -0300 (0:00:00.054)       0:00:09.177 ******* 
2026-10-06T21:06:19.8208539Z 
2026-10-06T21:06:19.8209481Z TASK [zabbix : Install libpcre2-8 - Red Hat 7] *********************************
2026-10-06T21:06:19.8209826Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br]
2026-10-06T21:06:19.8306752Z Tuesday 06 October 2026  18:06:19 -0300 (0:00:00.604)       0:00:09.781 ******* 
2026-10-06T21:06:20.4290554Z 
2026-10-06T21:06:20.4291187Z TASK [Install zabbix agent2] ***************************************************
2026-10-06T21:06:20.4291894Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br] => (item=http://10.122.154.12/deploy/zabbix-agent2-plugin-mongodb-6.0.23-release1.el7.x86_64.rpm)
2026-10-06T21:06:21.0133739Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br] => (item=http://10.122.154.12/deploy/zabbix-agent2-plugin-postgresql-6.0.23-release1.el7.x86_64.rpm)
2026-10-06T21:06:21.5729099Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br] => (item=http://10.122.154.12/deploy/zabbix-agent2-6.0.23-release1.el7.x86_64.rpm)
2026-10-06T21:06:21.5881868Z Tuesday 06 October 2026  18:06:21 -0300 (0:00:01.756)       0:00:11.538 ******* 
2026-10-06T21:06:22.2248245Z 
2026-10-06T21:06:22.2249134Z TASK [Template a file to /etc/zabbix_zabbix_agente.d/monit_agent2.conf] ********
2026-10-06T21:06:22.2249478Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br]
2026-10-06T21:06:22.2444407Z Tuesday 06 October 2026  18:06:22 -0300 (0:00:00.656)       0:00:12.195 ******* 
2026-10-06T21:06:22.9624001Z 
2026-10-06T21:06:22.9624827Z TASK [Garantindo que o zabbix_agent2 esta startado] ****************************
2026-10-06T21:06:22.9625068Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br]
2026-10-06T21:06:22.9747792Z Tuesday 06 October 2026  18:06:22 -0300 (0:00:00.730)       0:00:12.925 ******* 
2026-10-06T21:06:23.0286607Z Tuesday 06 October 2026  18:06:23 -0300 (0:00:00.053)       0:00:12.979 ******* 
2026-10-06T21:06:23.0862317Z 
2026-10-06T21:06:23.0863020Z TASK [zabbix : Gera o nome do grupo e templates quando o ambiente não é PRD] ***
2026-10-06T21:06:23.0863194Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br]
2026-10-06T21:06:23.0986801Z Tuesday 06 October 2026  18:06:23 -0300 (0:00:00.070)       0:00:13.049 ******* 
2026-10-06T21:06:23.9700900Z 
2026-10-06T21:06:23.9701351Z TASK [zabbix : hostgroup create to Zabbix Az CEMOT] ****************************
2026-10-06T21:06:23.9701580Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br]
2026-10-06T21:06:23.9882447Z Tuesday 06 October 2026  18:06:23 -0300 (0:00:00.889)       0:00:13.939 ******* 
2026-10-06T21:06:24.6341400Z 
2026-10-06T21:06:24.6342068Z TASK [zabbix : template get to Zabbix Az CEMOT] ********************************
2026-10-06T21:06:24.6342273Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br]
2026-10-06T21:06:24.6477535Z Tuesday 06 October 2026  18:06:24 -0300 (0:00:00.659)       0:00:14.598 ******* 
2026-10-06T21:06:25.2641654Z 
2026-10-06T21:06:25.2642162Z TASK [zabbix : hostgroup get to Zabbix Az CEMOT] *******************************
2026-10-06T21:06:25.2642327Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br]
2026-10-06T21:06:25.2772954Z Tuesday 06 October 2026  18:06:25 -0300 (0:00:00.629)       0:00:15.228 ******* 
2026-10-06T21:06:25.8864304Z 
2026-10-06T21:06:25.8865049Z TASK [zabbix : proxy get to Zabbix Az CEMOT] ***********************************
2026-10-06T21:06:25.8865258Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br]
2026-10-06T21:06:25.9013376Z Tuesday 06 October 2026  18:06:25 -0300 (0:00:00.623)       0:00:15.852 ******* 
2026-10-06T21:06:26.5441275Z 
2026-10-06T21:06:26.5442237Z TASK [zabbix : host create to Zabbix Az CEMOT] *********************************
2026-10-06T21:06:26.5442515Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br]
2026-10-06T21:06:26.5561406Z Tuesday 06 October 2026  18:06:26 -0300 (0:00:00.654)       0:00:16.507 ******* 
2026-10-06T21:06:26.6068636Z Tuesday 06 October 2026  18:06:26 -0300 (0:00:00.050)       0:00:16.557 ******* 
2026-10-06T21:06:26.6661154Z 
2026-10-06T21:06:26.6661652Z TASK [zabbix : Gera o nome do grupo e define os templates quando o ambiente NPRD] ***
2026-10-06T21:06:26.6661813Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br]
2026-10-06T21:06:26.6767881Z Tuesday 06 October 2026  18:06:26 -0300 (0:00:00.069)       0:00:16.627 ******* 
2026-10-06T21:06:26.7409075Z 
2026-10-06T21:06:26.7409584Z TASK [zabbix : Gera os nomes de grupos e dados para tratamento dos consolidados.] ***
2026-10-06T21:06:26.7410062Z ok: [caddeapllx1858.agil.nprd.caixa.gov.br]
2026-10-06T21:06:26.7532258Z Tuesday 06 October 2026  18:06:26 -0300 (0:00:00.076)       0:00:16.704 ******* 
2026-10-06T21:06:26.8086267Z /opt/ads-agent/ansible/lib/python2.7/site-packages/psycopg2/__init__.py:144: UserWarning: The psycopg2 wheel package will be renamed from release 2.8; in order to keep installing from binary please use "pip install psycopg2-binary" instead. For details see: <http://initd.org/psycopg/docs/install.html#binary-install-from-pypi>.
2026-10-06T21:06:26.8086599Z   """)
2026-10-06T21:06:29.4516306Z 
2026-10-06T21:06:29.4516825Z TASK [zabbix : Consultar os dados do sistema.] *********************************
2026-10-06T21:06:29.4527391Z fatal: [caddeapllx1858.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "msg": "unable to connect to database: FATAL:  password authentication failed for user \"monitdbadm\"\nFATAL:  no pg_hba.conf entry for host \"10.122.156.84\", user \"monitdbadm\", database \"monitordb001\", no encryption\n"}
2026-10-06T21:06:29.4527961Z Tuesday 06 October 2026  18:06:29 -0300 (0:00:02.699)       0:00:19.403 ******* 
2026-10-06T21:06:29.4529409Z 
2026-10-06T21:06:29.4529782Z PLAY RECAP *********************************************************************
2026-10-06T21:06:29.4530135Z caddeapllx1858.agil.nprd.caixa.gov.br : ok=24   changed=4    unreachable=0    failed=1    skipped=11   rescued=0    ignored=1   
2026-10-06T21:06:29.4530250Z 
2026-10-06T21:06:29.4530930Z Tuesday 06 October 2026  18:06:29 -0300 (0:00:00.000)       0:00:19.404 ******* 
2026-10-06T21:06:29.4531112Z =============================================================================== 
2026-10-06T21:06:29.4537854Z zabbix : Consultar os dados do sistema. --------------------------------- 2.70s
2026-10-06T21:06:29.4538225Z Gathering Facts --------------------------------------------------------- 1.97s
2026-10-06T21:06:29.4538460Z Install zabbix agent2 --------------------------------------------------- 1.76s
2026-10-06T21:06:29.4538703Z Instalando o filebeat versao 7.2.1 -------------------------------------- 0.93s
2026-10-06T21:06:29.4538918Z zabbix : hostgroup create to Zabbix Az CEMOT ---------------------------- 0.89s
2026-10-06T21:06:29.4539153Z Template a file to /etc/filebeat/filebeat.yml --------------------------- 0.88s
2026-10-06T21:06:29.4539382Z node_exporter : Criando o service do Node Exporter ---------------------- 0.81s
2026-10-06T21:06:29.4539736Z Garantindo que o zabbix_agent2 esta startado ---------------------------- 0.73s
2026-10-06T21:06:29.4540034Z node_exporter : Copia o Apache Exporter para o servidor ----------------- 0.70s
2026-10-06T21:06:29.4540252Z zabbix : template get to Zabbix Az CEMOT -------------------------------- 0.66s
2026-10-06T21:06:29.4540475Z Template a file to /etc/zabbix_zabbix_agente.d/monit_agent2.conf -------- 0.66s
2026-10-06T21:06:29.4540699Z zabbix : host create to Zabbix Az CEMOT --------------------------------- 0.65s
2026-10-06T21:06:29.4540934Z zabbix : hostgroup get to Zabbix Az CEMOT ------------------------------- 0.63s
2026-10-06T21:06:29.4541144Z zabbix : proxy get to Zabbix Az CEMOT ----------------------------------- 0.62s
2026-10-06T21:06:29.4541529Z zabbix : Install libpcre2-8 - Red Hat 7 --------------------------------- 0.60s
2026-10-06T21:06:29.4541793Z Criando o usuario "node_exporter" vinculado ao grupo "node_exporter" ---- 0.57s
2026-10-06T21:06:29.4542140Z Download RPM filebeat --------------------------------------------------- 0.55s
2026-10-06T21:06:29.4542718Z Verifica se existe servico zabbix-agent --------------------------------- 0.46s
2026-10-06T21:06:29.4542954Z Criando o grupo do "node_exporter" -------------------------------------- 0.43s
2026-10-06T21:06:29.4543169Z Verifiando o jxm_exporter esta instalado -------------------------------- 0.42s
2026-10-06T21:06:29.4543317Z Playbook run took 0 days, 0 hours, 0 minutes, 19 seconds
2026-10-06T21:06:29.5190212Z ##[debug]Exit code 2 received from tool '/bin/bash'
2026-10-06T21:06:29.5190899Z ##[debug]STDIO streams have closed for tool '/bin/bash'
2026-10-06T21:06:29.5221601Z ##[error]Bash exited with code '2'.
2026-10-06T21:06:29.5222119Z ##[debug]Processed: ##vso[task.issue type=error;]Bash exited with code '2'.
2026-10-06T21:06:29.5222605Z ##[debug]task result: Failed
2026-10-06T21:06:29.5223417Z ##[debug]Processed: ##vso[task.complete result=Failed;done=true;]
2026-10-06T21:06:29.5224506Z ##[section]Finishing: Configurando Stack de Monitoração
