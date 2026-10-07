2026-10-07T14:51:13.5102921Z ##[debug]Evaluating condition for step: 'Configurando Stack de Monitoração'
2026-10-07T14:51:13.5103427Z ##[debug]Evaluating: succeeded()
2026-10-07T14:51:13.5103603Z ##[debug]Evaluating succeeded:
2026-10-07T14:51:13.5103874Z ##[debug]=> True
2026-10-07T14:51:13.5104092Z ##[debug]Result: True
2026-10-07T14:51:13.5104292Z ##[section]Starting: Configurando Stack de Monitoração
2026-10-07T14:51:13.5107419Z ==============================================================================
2026-10-07T14:51:13.5107509Z Task         : Bash
2026-10-07T14:51:13.5107553Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-07T14:51:13.5107637Z Version      : 3.227.0
2026-10-07T14:51:13.5107681Z Author       : Microsoft Corporation
2026-10-07T14:51:13.5107730Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-07T14:51:13.5107811Z ==============================================================================
2026-10-07T14:51:14.1509456Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-10-07T14:51:14.2198541Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-10-07T14:51:14.2206435Z ##[debug]loading inputs and endpoints
2026-10-07T14:51:14.2233838Z ##[debug]loading INPUT_TARGETTYPE
2026-10-07T14:51:14.2234148Z ##[debug]loading INPUT_FILEPATH
2026-10-07T14:51:14.2234399Z ##[debug]loading INPUT_SCRIPT
2026-10-07T14:51:14.2234642Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-10-07T14:51:14.2235920Z ##[debug]loading INPUT_FAILONSTDERR
2026-10-07T14:51:14.2236765Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-10-07T14:51:14.2237287Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-10-07T14:51:14.2237580Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-10-07T14:51:14.2237858Z ##[debug]loading SECRET_MQ_SID_SENHA
2026-10-07T14:51:14.2238857Z ##[debug]loading SECRET_OKD_TOKEN_PRODUTOS
2026-10-07T14:51:14.2239236Z ##[debug]loading SECRET_MQ_SPI_SENHA
2026-10-07T14:51:14.2239496Z ##[debug]loading SECRET_FORTIFY_PASS
2026-10-07T14:51:14.2239749Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-10-07T14:51:14.2239987Z ##[debug]loading SECRET_PW_ALOCAIP
2026-10-07T14:51:14.2240862Z ##[debug]loading SECRET_TOKEN_CRQ
2026-10-07T14:51:14.2241097Z ##[debug]loading SECRET_PW_ISILON
2026-10-07T14:51:14.2241338Z ##[debug]loading SECRET_SSO_SENHA
2026-10-07T14:51:14.2243004Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-10-07T14:51:14.2245109Z ##[debug]loading SECRET_ANSIBLE_VAULT
2026-10-07T14:51:14.2247189Z ##[debug]loading SECRET_MQ_CLI_SENHA
2026-10-07T14:51:14.2249324Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-10-07T14:51:14.2251443Z ##[debug]loading SECRET_ORACLE_SENHA
2026-10-07T14:51:14.2253522Z ##[debug]loading SECRET_AZPAT
2026-10-07T14:51:14.2255607Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-10-07T14:51:14.2257675Z ##[debug]loaded 24
2026-10-07T14:51:14.2259809Z ##[debug]Agent.ProxyUrl=undefined
2026-10-07T14:51:14.2261879Z ##[debug]Agent.CAInfo=undefined
2026-10-07T14:51:14.2263992Z ##[debug]Agent.ClientCert=undefined
2026-10-07T14:51:14.2266076Z ##[debug]Agent.SkipCertValidation=True
2026-10-07T14:51:14.2268217Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-10-07T14:51:14.2270437Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-10-07T14:51:14.2272554Z ##[debug]system.culture=en-US
2026-10-07T14:51:14.2274637Z ##[debug]failOnStderr=false
2026-10-07T14:51:14.2276725Z ##[debug]workingDirectory=/opt/ads-agent/_work/r15891/a
2026-10-07T14:51:14.2278813Z ##[debug]check path : /opt/ads-agent/_work/r15891/a
2026-10-07T14:51:14.2280949Z ##[debug]targetType=inline
2026-10-07T14:51:14.2283007Z ##[debug]bashEnvValue=undefined
2026-10-07T14:51:14.2285294Z ##[debug]script=set -x
REPO=$(echo _SIRTA | sed 's/_//')
ansible-playbook /opt/ads-agent/esteira-jboss-vm/site.yml --tags monitoracao --skip-tags jboss -e sistema_ambiente=des -e quantidade_vm=1 -e sistema_nome=SIRTA -e default_working_directory_tfs=/opt/ads-agent/_work/r15891/a -e build_repository_name_tfs=$REPO -e centralizadora_desenvolvimento=7390 -e centralizadora_operacoes=7259 -e fields_site=BR -e site=$(site)
2026-10-07T14:51:14.2287630Z Generating script.
2026-10-07T14:51:14.2289745Z ##[debug]which 'bash'
2026-10-07T14:51:14.2293962Z ##[debug]found: '/bin/bash'
2026-10-07T14:51:14.2296084Z ##[debug]Agent.Version=3.225.2
2026-10-07T14:51:14.2298176Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-10-07T14:51:14.2300346Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-10-07T14:51:14.2302536Z ========================== Starting Command Output ===========================
2026-10-07T14:51:14.2304658Z ##[debug]which '/bin/bash'
2026-10-07T14:51:14.2306747Z ##[debug]found: '/bin/bash'
2026-10-07T14:51:14.2308863Z ##[debug]/bin/bash arg: /opt/ads-agent/_work/_temp/0ac0c03a-c606-4091-9f3c-a94fc1f32f13.sh
2026-10-07T14:51:14.2311034Z ##[debug]exec tool: /bin/bash
2026-10-07T14:51:14.2313155Z ##[debug]arguments:
2026-10-07T14:51:14.2315256Z ##[debug]   /opt/ads-agent/_work/_temp/0ac0c03a-c606-4091-9f3c-a94fc1f32f13.sh
2026-10-07T14:51:14.2317513Z [command]/bin/bash /opt/ads-agent/_work/_temp/0ac0c03a-c606-4091-9f3c-a94fc1f32f13.sh
2026-10-07T14:51:14.2349479Z ++ echo _SIRTA
2026-10-07T14:51:14.2351181Z ++ sed s/_//
2026-10-07T14:51:14.2361707Z + REPO=SIRTA
2026-10-07T14:51:14.2366348Z ++ site
2026-10-07T14:51:14.2368425Z /opt/ads-agent/_work/_temp/0ac0c03a-c606-4091-9f3c-a94fc1f32f13.sh: line 3: site: comando não encontrado
2026-10-07T14:51:14.2369991Z + ansible-playbook /opt/ads-agent/esteira-jboss-vm/site.yml --tags monitoracao --skip-tags jboss -e sistema_ambiente=des -e quantidade_vm=1 -e sistema_nome=SIRTA -e default_working_directory_tfs=/opt/ads-agent/_work/r15891/a -e build_repository_name_tfs=SIRTA -e centralizadora_desenvolvimento=7390 -e centralizadora_operacoes=7259 -e fields_site=BR -e site=
2026-10-07T14:51:16.1588463Z 
2026-10-07T14:51:16.1589578Z PLAY [local] *******************************************************************
2026-10-07T14:51:16.2099496Z 
2026-10-07T14:51:16.2100230Z PLAY [Configurando o DNS] ******************************************************
2026-10-07T14:51:16.3627301Z 
2026-10-07T14:51:16.3628236Z PLAY [local] *******************************************************************
2026-10-07T14:51:16.3656177Z 
2026-10-07T14:51:16.3656809Z PLAY [Verificando serviços] ****************************************************
2026-10-07T14:51:16.3761056Z Wednesday 07 October 2026  11:51:16 -0300 (0:00:00.275)       0:00:00.275 ***** 
2026-10-07T14:51:18.3618706Z 
2026-10-07T14:51:18.3619672Z TASK [Gathering Facts] *********************************************************
2026-10-07T14:51:18.3620062Z ok: [caddeapllx1749.agil.nprd.caixa.gov.br]
2026-10-07T14:51:19.5768884Z ok: [caddeapllx938.agil.nprd.caixa.gov.br]
2026-10-07T14:51:19.5956085Z Wednesday 07 October 2026  11:51:19 -0300 (0:00:03.219)       0:00:03.494 ***** 
2026-10-07T14:51:20.0108456Z 
2026-10-07T14:51:20.0109361Z TASK [Verifiando o jxm_exporter esta instalado] ********************************
2026-10-07T14:51:20.0110134Z ok: [caddeapllx938.agil.nprd.caixa.gov.br]
2026-10-07T14:51:20.0191720Z ok: [caddeapllx1749.agil.nprd.caixa.gov.br]
2026-10-07T14:51:20.0335284Z Wednesday 07 October 2026  11:51:20 -0300 (0:00:00.437)       0:00:03.932 ***** 
2026-10-07T14:51:20.1046205Z Wednesday 07 October 2026  11:51:20 -0300 (0:00:00.071)       0:00:04.003 ***** 
2026-10-07T14:51:20.1753918Z Wednesday 07 October 2026  11:51:20 -0300 (0:00:00.070)       0:00:04.074 ***** 
2026-10-07T14:51:20.2470858Z Wednesday 07 October 2026  11:51:20 -0300 (0:00:00.071)       0:00:04.146 ***** 
2026-10-07T14:51:20.6939048Z 
2026-10-07T14:51:20.6939957Z TASK [Criando o grupo do "node_exporter"] **************************************
2026-10-07T14:51:20.6940618Z ok: [caddeapllx1749.agil.nprd.caixa.gov.br]
2026-10-07T14:51:20.7080489Z ok: [caddeapllx938.agil.nprd.caixa.gov.br]
2026-10-07T14:51:20.7275832Z Wednesday 07 October 2026  11:51:20 -0300 (0:00:00.480)       0:00:04.626 ***** 
2026-10-07T14:51:21.3110188Z 
2026-10-07T14:51:21.3112091Z TASK [Criando o usuario "node_exporter" vinculado ao grupo "node_exporter"] ****
2026-10-07T14:51:21.3112301Z ok: [caddeapllx1749.agil.nprd.caixa.gov.br]
2026-10-07T14:51:21.3338169Z ok: [caddeapllx938.agil.nprd.caixa.gov.br]
2026-10-07T14:51:21.3487028Z Wednesday 07 October 2026  11:51:21 -0300 (0:00:00.621)       0:00:05.247 ***** 
2026-10-07T14:51:22.0685354Z 
2026-10-07T14:51:22.0685876Z TASK [node_exporter : Copia o Apache Exporter para o servidor] *****************
2026-10-07T14:51:22.0686288Z ok: [caddeapllx1749.agil.nprd.caixa.gov.br]
2026-10-07T14:51:22.0921861Z ok: [caddeapllx938.agil.nprd.caixa.gov.br]
2026-10-07T14:51:22.1076780Z Wednesday 07 October 2026  11:51:22 -0300 (0:00:00.758)       0:00:06.006 ***** 
2026-10-07T14:51:22.9175056Z 
2026-10-07T14:51:22.9175530Z TASK [node_exporter : Criando o service do Node Exporter] **********************
2026-10-07T14:51:22.9175731Z ok: [caddeapllx1749.agil.nprd.caixa.gov.br]
2026-10-07T14:51:22.9473135Z ok: [caddeapllx938.agil.nprd.caixa.gov.br]
2026-10-07T14:51:22.9622240Z Wednesday 07 October 2026  11:51:22 -0300 (0:00:00.854)       0:00:06.861 ***** 
2026-10-07T14:51:23.4944714Z 
2026-10-07T14:51:23.4945475Z TASK [Download RPM filebeat] ***************************************************
2026-10-07T14:51:23.4945928Z changed: [caddeapllx938.agil.nprd.caixa.gov.br]
2026-10-07T14:51:23.5119309Z changed: [caddeapllx1749.agil.nprd.caixa.gov.br]
2026-10-07T14:51:23.5291135Z Wednesday 07 October 2026  11:51:23 -0300 (0:00:00.566)       0:00:07.428 ***** 
2026-10-07T14:51:24.4531073Z 
2026-10-07T14:51:24.4531640Z TASK [Instalando o filebeat versao 7.2.1] **************************************
2026-10-07T14:51:24.4531808Z ok: [caddeapllx938.agil.nprd.caixa.gov.br]
2026-10-07T14:51:24.7252455Z ok: [caddeapllx1749.agil.nprd.caixa.gov.br]
2026-10-07T14:51:24.7391622Z Wednesday 07 October 2026  11:51:24 -0300 (0:00:01.210)       0:00:08.638 ***** 
2026-10-07T14:51:25.0469483Z 
2026-10-07T14:51:25.0470454Z TASK [Delete RPM filebeat] *****************************************************
2026-10-07T14:51:25.0470670Z changed: [caddeapllx938.agil.nprd.caixa.gov.br]
2026-10-07T14:51:25.0523607Z changed: [caddeapllx1749.agil.nprd.caixa.gov.br]
2026-10-07T14:51:25.0665735Z Wednesday 07 October 2026  11:51:25 -0300 (0:00:00.327)       0:00:08.965 ***** 
2026-10-07T14:51:25.9856995Z 
2026-10-07T14:51:25.9857796Z TASK [Template a file to /etc/filebeat/filebeat.yml] ***************************
2026-10-07T14:51:25.9858527Z changed: [caddeapllx938.agil.nprd.caixa.gov.br]
2026-10-07T14:51:25.9990536Z changed: [caddeapllx1749.agil.nprd.caixa.gov.br]
2026-10-07T14:51:26.0112479Z Wednesday 07 October 2026  11:51:26 -0300 (0:00:00.944)       0:00:09.910 ***** 
2026-10-07T14:51:26.3151143Z 
2026-10-07T14:51:26.3152097Z TASK [Verificando APM Agent] ***************************************************
2026-10-07T14:51:26.3152306Z ok: [caddeapllx938.agil.nprd.caixa.gov.br]
2026-10-07T14:51:26.3171075Z ok: [caddeapllx1749.agil.nprd.caixa.gov.br]
2026-10-07T14:51:26.3323599Z Wednesday 07 October 2026  11:51:26 -0300 (0:00:00.320)       0:00:10.231 ***** 
2026-10-07T14:51:26.4058031Z Wednesday 07 October 2026  11:51:26 -0300 (0:00:00.073)       0:00:10.304 ***** 
2026-10-07T14:51:26.4803803Z Wednesday 07 October 2026  11:51:26 -0300 (0:00:00.074)       0:00:10.379 ***** 
2026-10-07T14:51:26.5543087Z Wednesday 07 October 2026  11:51:26 -0300 (0:00:00.073)       0:00:10.453 ***** 
2026-10-07T14:51:26.6251981Z Wednesday 07 October 2026  11:51:26 -0300 (0:00:00.069)       0:00:10.523 ***** 
2026-10-07T14:51:26.6956565Z Wednesday 07 October 2026  11:51:26 -0300 (0:00:00.070)       0:00:10.594 ***** 
2026-10-07T14:51:27.1501840Z 
2026-10-07T14:51:27.1502743Z TASK [Verifica se existe servico zabbix-agent] *********************************
2026-10-07T14:51:27.1503919Z fatal: [caddeapllx1749.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["systemctl", "is-active", "zabbix-agent"], "delta": "0:00:00.015874", "end": "2026-10-07 11:51:27.132484", "msg": "non-zero return code", "rc": 3, "start": "2026-10-07 11:51:27.116610", "stderr": "", "stderr_lines": [], "stdout": "unknown", "stdout_lines": ["unknown"]}
2026-10-07T14:51:27.1504704Z ...ignoring
2026-10-07T14:51:27.1542956Z fatal: [caddeapllx938.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["systemctl", "is-active", "zabbix-agent"], "delta": "0:00:00.005292", "end": "2026-10-07 11:51:27.136639", "msg": "non-zero return code", "rc": 3, "start": "2026-10-07 11:51:27.131347", "stderr": "", "stderr_lines": [], "stdout": "unknown", "stdout_lines": ["unknown"]}
2026-10-07T14:51:27.1543285Z ...ignoring
2026-10-07T14:51:27.1674487Z Wednesday 07 October 2026  11:51:27 -0300 (0:00:00.472)       0:00:11.066 ***** 
2026-10-07T14:51:27.2397913Z Wednesday 07 October 2026  11:51:27 -0300 (0:00:00.072)       0:00:11.138 ***** 
2026-10-07T14:51:27.8764553Z 
2026-10-07T14:51:27.8765525Z TASK [zabbix : Install libpcre2-8 - Red Hat 7] *********************************
2026-10-07T14:51:27.8766156Z ok: [caddeapllx938.agil.nprd.caixa.gov.br]
2026-10-07T14:51:29.2724253Z fatal: [caddeapllx1749.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "changes": {"installed": ["/root/.ansible/tmp/ansible-moduletmp-1791384687.7-Tafo4A/libpcre2-8-0-10.39-150400.2.3.x86_64Y5YPRJ.rpm"]}, "msg": "This system is not registered with RHN Classic or Red Hat Satellite.\nYou can use rhn_register to register.\nRed Hat Satellite or RHN Classic support will be disabled.\n\n\nTransaction check error:\n  file /usr/lib64/libpcre2-8.so.0 from install of libpcre2-8-0-10.39-150400.2.3.x86_64 conflicts with file from package pcre2-10.23-2.el7.x86_64\n\nError Summary\n-------------\n\n", "rc": 1, "results": ["Loaded plugins: product-id, rhnplugin, search-disabled-repos, subscription-\n              : manager\nThis system is not registered with an entitlement server. You can use subscription-manager to register.\nExamining /root/.ansible/tmp/ansible-moduletmp-1791384687.7-Tafo4A/libpcre2-8-0-10.39-150400.2.3.x86_64Y5YPRJ.rpm: libpcre2-8-0-10.39-150400.2.3.x86_64\nMarking /root/.ansible/tmp/ansible-moduletmp-1791384687.7-Tafo4A/libpcre2-8-0-10.39-150400.2.3.x86_64Y5YPRJ.rpm to be installed\nResolving Dependencies\n--> Running transaction check\n---> Package libpcre2-8-0.x86_64 0:10.39-150400.2.3 will be installed\n--> Finished Dependency Resolution\n\nDependencies Resolved\n\n================================================================================\n Package\n      Arch   Version          Repository                                   Size\n================================================================================\nInstalling:\n libpcre2-8-0\n      x86_64 10.39-150400.2.3 /libpcre2-8-0-10.39-150400.2.3.x86_64Y5YPRJ 910 k\n\nTransaction Summary\n================================================================================\nInstall  1 Package\n\nTotal size: 910 k\nInstalled size: 910 k\nDownloading packages:\nRunning transaction check\nRunning transaction test\n"]}
2026-10-07T14:51:29.2725624Z ...ignoring
2026-10-07T14:51:29.2871765Z Wednesday 07 October 2026  11:51:29 -0300 (0:00:02.047)       0:00:13.186 ***** 
2026-10-07T14:51:29.9809809Z 
2026-10-07T14:51:29.9810646Z TASK [Install zabbix agent2] ***************************************************
2026-10-07T14:51:29.9811085Z ok: [caddeapllx938.agil.nprd.caixa.gov.br] => (item=http://10.122.154.12/deploy/zabbix-agent2-plugin-mongodb-6.0.23-release1.el7.x86_64.rpm)
2026-10-07T14:51:30.2189891Z ok: [caddeapllx1749.agil.nprd.caixa.gov.br] => (item=http://10.122.154.12/deploy/zabbix-agent2-plugin-mongodb-6.0.23-release1.el7.x86_64.rpm)
2026-10-07T14:51:30.5933710Z ok: [caddeapllx938.agil.nprd.caixa.gov.br] => (item=http://10.122.154.12/deploy/zabbix-agent2-plugin-postgresql-6.0.23-release1.el7.x86_64.rpm)
2026-10-07T14:51:30.8171460Z ok: [caddeapllx1749.agil.nprd.caixa.gov.br] => (item=http://10.122.154.12/deploy/zabbix-agent2-plugin-postgresql-6.0.23-release1.el7.x86_64.rpm)
2026-10-07T14:51:31.2257045Z ok: [caddeapllx938.agil.nprd.caixa.gov.br] => (item=http://10.122.154.12/deploy/zabbix-agent2-6.0.23-release1.el7.x86_64.rpm)
2026-10-07T14:51:31.4093512Z ok: [caddeapllx1749.agil.nprd.caixa.gov.br] => (item=http://10.122.154.12/deploy/zabbix-agent2-6.0.23-release1.el7.x86_64.rpm)
2026-10-07T14:51:31.4253544Z Wednesday 07 October 2026  11:51:31 -0300 (0:00:02.138)       0:00:15.324 ***** 
2026-10-07T14:51:32.0869334Z 
2026-10-07T14:51:32.0870306Z TASK [Template a file to /etc/zabbix_zabbix_agente.d/monit_agent2.conf] ********
2026-10-07T14:51:32.0881962Z ok: [caddeapllx938.agil.nprd.caixa.gov.br]
2026-10-07T14:51:32.0882320Z ok: [caddeapllx1749.agil.nprd.caixa.gov.br]
2026-10-07T14:51:32.1031152Z Wednesday 07 October 2026  11:51:32 -0300 (0:00:00.677)       0:00:16.002 ***** 
2026-10-07T14:51:32.7206268Z 
2026-10-07T14:51:32.7208595Z TASK [Garantindo que o zabbix_agent2 esta startado] ****************************
2026-10-07T14:51:32.7208769Z ok: [caddeapllx938.agil.nprd.caixa.gov.br]
2026-10-07T14:51:32.7511849Z ok: [caddeapllx1749.agil.nprd.caixa.gov.br]
2026-10-07T14:51:32.7673516Z Wednesday 07 October 2026  11:51:32 -0300 (0:00:00.664)       0:00:16.666 ***** 
2026-10-07T14:51:32.8390357Z Wednesday 07 October 2026  11:51:32 -0300 (0:00:00.071)       0:00:16.738 ***** 
2026-10-07T14:51:32.8987884Z 
2026-10-07T14:51:32.8988637Z TASK [zabbix : Gera o nome do grupo e templates quando o ambiente não é PRD] ***
2026-10-07T14:51:32.8988812Z ok: [caddeapllx938.agil.nprd.caixa.gov.br]
2026-10-07T14:51:32.9156330Z ok: [caddeapllx1749.agil.nprd.caixa.gov.br]
2026-10-07T14:51:32.9329840Z Wednesday 07 October 2026  11:51:32 -0300 (0:00:00.094)       0:00:16.832 ***** 
2026-10-07T14:51:33.9109638Z 
2026-10-07T14:51:33.9110183Z TASK [zabbix : hostgroup create to Zabbix Az CEMOT] ****************************
2026-10-07T14:51:33.9111206Z ok: [caddeapllx1749.agil.nprd.caixa.gov.br]
2026-10-07T14:51:33.9111367Z ok: [caddeapllx938.agil.nprd.caixa.gov.br]
2026-10-07T14:51:33.9257988Z Wednesday 07 October 2026  11:51:33 -0300 (0:00:00.992)       0:00:17.824 ***** 
2026-10-07T14:51:34.6510410Z 
2026-10-07T14:51:34.6511183Z TASK [zabbix : template get to Zabbix Az CEMOT] ********************************
2026-10-07T14:51:34.6511463Z ok: [caddeapllx1749.agil.nprd.caixa.gov.br]
2026-10-07T14:51:34.6713651Z ok: [caddeapllx938.agil.nprd.caixa.gov.br]
2026-10-07T14:51:34.6889892Z Wednesday 07 October 2026  11:51:34 -0300 (0:00:00.763)       0:00:18.588 ***** 
2026-10-07T14:51:35.4019799Z 
2026-10-07T14:51:35.4020319Z TASK [zabbix : hostgroup get to Zabbix Az CEMOT] *******************************
2026-10-07T14:51:35.4020489Z ok: [caddeapllx938.agil.nprd.caixa.gov.br]
2026-10-07T14:51:35.4043063Z ok: [caddeapllx1749.agil.nprd.caixa.gov.br]
2026-10-07T14:51:35.4212209Z Wednesday 07 October 2026  11:51:35 -0300 (0:00:00.732)       0:00:19.320 ***** 
2026-10-07T14:51:36.1772085Z 
2026-10-07T14:51:36.1772683Z TASK [zabbix : proxy get to Zabbix Az CEMOT] ***********************************
2026-10-07T14:51:36.1772926Z ok: [caddeapllx1749.agil.nprd.caixa.gov.br]
2026-10-07T14:51:36.1923638Z ok: [caddeapllx938.agil.nprd.caixa.gov.br]
2026-10-07T14:51:36.2082389Z Wednesday 07 October 2026  11:51:36 -0300 (0:00:00.786)       0:00:20.107 ***** 
2026-10-07T14:51:37.0067460Z 
2026-10-07T14:51:37.0068363Z TASK [zabbix : host create to Zabbix Az CEMOT] *********************************
2026-10-07T14:51:37.0068578Z ok: [caddeapllx938.agil.nprd.caixa.gov.br]
2026-10-07T14:51:37.0110392Z ok: [caddeapllx1749.agil.nprd.caixa.gov.br]
2026-10-07T14:51:37.0241842Z Wednesday 07 October 2026  11:51:37 -0300 (0:00:00.815)       0:00:20.923 ***** 
2026-10-07T14:51:37.0959101Z Wednesday 07 October 2026  11:51:37 -0300 (0:00:00.071)       0:00:20.994 ***** 
2026-10-07T14:51:37.1558132Z 
2026-10-07T14:51:37.1558987Z TASK [zabbix : Gera o nome do grupo e define os templates quando o ambiente NPRD] ***
2026-10-07T14:51:37.1559389Z ok: [caddeapllx938.agil.nprd.caixa.gov.br]
2026-10-07T14:51:37.1720835Z ok: [caddeapllx1749.agil.nprd.caixa.gov.br]
2026-10-07T14:51:37.1869780Z Wednesday 07 October 2026  11:51:37 -0300 (0:00:00.091)       0:00:21.086 ***** 
2026-10-07T14:51:37.2471666Z 
2026-10-07T14:51:37.2472440Z TASK [zabbix : Gera os nomes de grupos e dados para tratamento dos consolidados.] ***
2026-10-07T14:51:37.2473046Z ok: [caddeapllx938.agil.nprd.caixa.gov.br]
2026-10-07T14:51:37.2608144Z ok: [caddeapllx1749.agil.nprd.caixa.gov.br]
2026-10-07T14:51:37.2778763Z Wednesday 07 October 2026  11:51:37 -0300 (0:00:00.090)       0:00:21.177 ***** 
2026-10-07T14:51:37.3369084Z /opt/ads-agent/ansible/lib/python2.7/site-packages/psycopg2/__init__.py:144: UserWarning: The psycopg2 wheel package will be renamed from release 2.8; in order to keep installing from binary please use "pip install psycopg2-binary" instead. For details see: <http://initd.org/psycopg/docs/install.html#binary-install-from-pypi>.
2026-10-07T14:51:37.3370718Z   """)
2026-10-07T14:51:40.0569482Z 
2026-10-07T14:51:40.0585945Z TASK [zabbix : Consultar os dados do sistema.] *********************************
2026-10-07T14:51:40.0586349Z fatal: [caddeapllx1749.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "msg": "unable to connect to database: FATAL:  password authentication failed for user \"monitdbadm\"\nFATAL:  no pg_hba.conf entry for host \"10.122.155.67\", user \"monitdbadm\", database \"monitordb001\", no encryption\n"}
2026-10-07T14:51:40.0631872Z fatal: [caddeapllx938.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "msg": "unable to connect to database: FATAL:  password authentication failed for user \"monitdbadm\"\nFATAL:  no pg_hba.conf entry for host \"10.122.155.67\", user \"monitdbadm\", database \"monitordb001\", no encryption\n"}
2026-10-07T14:51:40.0642000Z Wednesday 07 October 2026  11:51:40 -0300 (0:00:02.785)       0:00:23.963 ***** 
2026-10-07T14:51:40.0660849Z 
2026-10-07T14:51:40.0661330Z PLAY RECAP *********************************************************************
2026-10-07T14:51:40.0662038Z caddeapllx1749.agil.nprd.caixa.gov.br : ok=24   changed=4    unreachable=0    failed=1    skipped=11   rescued=0    ignored=2   
2026-10-07T14:51:40.0662394Z caddeapllx938.agil.nprd.caixa.gov.br : ok=24   changed=4    unreachable=0    failed=1    skipped=11   rescued=0    ignored=1   
2026-10-07T14:51:40.0662578Z 
2026-10-07T14:51:40.0663128Z Wednesday 07 October 2026  11:51:40 -0300 (0:00:00.001)       0:00:23.964 ***** 
2026-10-07T14:51:40.0663664Z =============================================================================== 
2026-10-07T14:51:40.0664089Z Gathering Facts --------------------------------------------------------- 3.22s
2026-10-07T14:51:40.0664460Z zabbix : Consultar os dados do sistema. --------------------------------- 2.79s
2026-10-07T14:51:40.0664845Z Install zabbix agent2 --------------------------------------------------- 2.14s
2026-10-07T14:51:40.0665358Z zabbix : Install libpcre2-8 - Red Hat 7 --------------------------------- 2.05s
2026-10-07T14:51:40.0665756Z Instalando o filebeat versao 7.2.1 -------------------------------------- 1.21s
2026-10-07T14:51:40.0666070Z zabbix : hostgroup create to Zabbix Az CEMOT ---------------------------- 0.99s
2026-10-07T14:51:40.0666387Z Template a file to /etc/filebeat/filebeat.yml --------------------------- 0.94s
2026-10-07T14:51:40.0666724Z node_exporter : Criando o service do Node Exporter ---------------------- 0.85s
2026-10-07T14:51:40.0667087Z zabbix : host create to Zabbix Az CEMOT --------------------------------- 0.82s
2026-10-07T14:51:40.0667448Z zabbix : proxy get to Zabbix Az CEMOT ----------------------------------- 0.79s
2026-10-07T14:51:40.0667786Z zabbix : template get to Zabbix Az CEMOT -------------------------------- 0.76s
2026-10-07T14:51:40.0668084Z node_exporter : Copia o Apache Exporter para o servidor ----------------- 0.76s
2026-10-07T14:51:40.0668403Z zabbix : hostgroup get to Zabbix Az CEMOT ------------------------------- 0.73s
2026-10-07T14:51:40.0668707Z Template a file to /etc/zabbix_zabbix_agente.d/monit_agent2.conf -------- 0.68s
2026-10-07T14:51:40.0669013Z Garantindo que o zabbix_agent2 esta startado ---------------------------- 0.66s
2026-10-07T14:51:40.0670352Z Criando o usuario "node_exporter" vinculado ao grupo "node_exporter" ---- 0.62s
2026-10-07T14:51:40.0670674Z Download RPM filebeat --------------------------------------------------- 0.57s
2026-10-07T14:51:40.0671318Z Criando o grupo do "node_exporter" -------------------------------------- 0.48s
2026-10-07T14:51:40.0671590Z Verifica se existe servico zabbix-agent --------------------------------- 0.47s
2026-10-07T14:51:40.0671823Z Verifiando o jxm_exporter esta instalado -------------------------------- 0.44s
2026-10-07T14:51:40.0671982Z Playbook run took 0 days, 0 hours, 0 minutes, 23 seconds
2026-10-07T14:51:40.1291014Z ##[debug]Exit code 2 received from tool '/bin/bash'
2026-10-07T14:51:40.1291343Z ##[debug]STDIO streams have closed for tool '/bin/bash'
2026-10-07T14:51:40.1317888Z ##[error]Bash exited with code '2'.
2026-10-07T14:51:40.1318407Z ##[debug]Processed: ##vso[task.issue type=error;]Bash exited with code '2'.
2026-10-07T14:51:40.1318886Z ##[debug]task result: Failed
2026-10-07T14:51:40.1319955Z ##[debug]Processed: ##vso[task.complete result=Failed;done=true;]
2026-10-07T14:51:40.1327883Z ##[section]Finishing: Configurando Stack de Monitoração
