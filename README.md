Solicito por gentileza a avaliação das configurações da pipeline de release, aparentemente o step de configuração de monitoramento não está conseguindo completar com exito.

Segue URL da pipeline:

https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=536034&environmentId=2490593

Mensagem de erro: unable to connect to database: 
FATAL:  password authentication failed for user "monitdbadm"
FATAL:  no pg_hba.conf entry for host "10.122.155.67", user "monitdbadm", database "monitordb001", no encryption


2026-10-05T16:35:43.2553132Z ##[section]Starting: Configurando Stack de Monitoração
2026-10-05T16:35:43.2556301Z ==============================================================================
2026-10-05T16:35:43.2556385Z Task         : Bash
2026-10-05T16:35:43.2556428Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-05T16:35:43.2556497Z Version      : 3.227.0
2026-10-05T16:35:43.2556639Z Author       : Microsoft Corporation
2026-10-05T16:35:43.2556691Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-05T16:35:43.2556762Z ==============================================================================
2026-10-05T16:35:44.0292961Z Generating script.
2026-10-05T16:35:44.0310635Z ========================== Starting Command Output ===========================
2026-10-05T16:35:44.0312303Z [command]/bin/bash /opt/ads-agent/_work/_temp/def4010a-881f-4b0e-82d8-54949ecadd03.sh
2026-10-05T16:35:44.0361038Z ++ echo _SIGPD-backend
2026-10-05T16:35:44.0361173Z ++ sed s/_//
2026-10-05T16:35:44.0370613Z + REPO=SIGPD-backend
2026-10-05T16:35:44.0374251Z ++ site
2026-10-05T16:35:44.0377035Z /opt/ads-agent/_work/_temp/def4010a-881f-4b0e-82d8-54949ecadd03.sh: line 3: site: comando não encontrado
2026-10-05T16:35:44.0380437Z + ansible-playbook /opt/ads-agent/esteira-jboss-vm/site.yml --tags monitoracao --skip-tags jboss -e sistema_ambiente=tqs -e quantidade_vm=1 -e sistema_nome=sigpd-backend -e default_working_directory_tfs=/opt/ads-agent/_work/r15820/a -e build_repository_name_tfs=SIGPD-backend -e centralizadora_desenvolvimento=7390 -e centralizadora_operacoes=7259 -e fields_site=BR -e site=
2026-10-05T16:35:45.9539535Z 
2026-10-05T16:35:45.9540083Z PLAY [local] *******************************************************************
2026-10-05T16:35:46.0047825Z 
2026-10-05T16:35:46.0048248Z PLAY [Configurando o DNS] ******************************************************
2026-10-05T16:35:46.1655724Z 
2026-10-05T16:35:46.1656174Z PLAY [local] *******************************************************************
2026-10-05T16:35:46.1684704Z 
2026-10-05T16:35:46.1685474Z PLAY [Verificando serviços] ****************************************************
2026-10-05T16:35:46.1789070Z Monday 05 October 2026  13:35:46 -0300 (0:00:00.282)       0:00:00.282 ******** 
2026-10-05T16:35:48.1489256Z 
2026-10-05T16:35:48.1489748Z TASK [Gathering Facts] *********************************************************
2026-10-05T16:35:48.1489963Z ok: [caddeapllx930.agil.nprd.caixa.gov.br]
2026-10-05T16:35:48.1657079Z Monday 05 October 2026  13:35:48 -0300 (0:00:01.986)       0:00:02.269 ******** 
2026-10-05T16:35:48.5454050Z 
2026-10-05T16:35:48.5454587Z TASK [Verifiando o jxm_exporter esta instalado] ********************************
2026-10-05T16:35:48.5454742Z ok: [caddeapllx930.agil.nprd.caixa.gov.br]
2026-10-05T16:35:48.5586694Z Monday 05 October 2026  13:35:48 -0300 (0:00:00.392)       0:00:02.662 ******** 
2026-10-05T16:35:48.6115259Z Monday 05 October 2026  13:35:48 -0300 (0:00:00.052)       0:00:02.715 ******** 
2026-10-05T16:35:48.6647980Z Monday 05 October 2026  13:35:48 -0300 (0:00:00.053)       0:00:02.768 ******** 
2026-10-05T16:35:48.7201290Z Monday 05 October 2026  13:35:48 -0300 (0:00:00.055)       0:00:02.823 ******** 
2026-10-05T16:35:49.1219074Z 
2026-10-05T16:35:49.1220108Z TASK [Criando o grupo do "node_exporter"] **************************************
2026-10-05T16:35:49.1220551Z ok: [caddeapllx930.agil.nprd.caixa.gov.br]
2026-10-05T16:35:49.1363243Z Monday 05 October 2026  13:35:49 -0300 (0:00:00.416)       0:00:03.240 ******** 
2026-10-05T16:35:49.6612851Z 
2026-10-05T16:35:49.6613630Z TASK [Criando o usuario "node_exporter" vinculado ao grupo "node_exporter"] ****
2026-10-05T16:35:49.6614378Z ok: [caddeapllx930.agil.nprd.caixa.gov.br]
2026-10-05T16:35:49.6743506Z Monday 05 October 2026  13:35:49 -0300 (0:00:00.538)       0:00:03.778 ******** 
2026-10-05T16:35:50.3503464Z 
2026-10-05T16:35:50.3503926Z TASK [node_exporter : Copia o Apache Exporter para o servidor] *****************
2026-10-05T16:35:50.3504075Z ok: [caddeapllx930.agil.nprd.caixa.gov.br]
2026-10-05T16:35:50.3640434Z Monday 05 October 2026  13:35:50 -0300 (0:00:00.689)       0:00:04.467 ******** 
2026-10-05T16:35:51.1597935Z 
2026-10-05T16:35:51.1598416Z TASK [node_exporter : Criando o service do Node Exporter] **********************
2026-10-05T16:35:51.1598579Z ok: [caddeapllx930.agil.nprd.caixa.gov.br]
2026-10-05T16:35:51.1710270Z Monday 05 October 2026  13:35:51 -0300 (0:00:00.806)       0:00:05.274 ******** 
2026-10-05T16:35:51.6372462Z 
2026-10-05T16:35:51.6372982Z TASK [Download RPM filebeat] ***************************************************
2026-10-05T16:35:51.6373147Z changed: [caddeapllx930.agil.nprd.caixa.gov.br]
2026-10-05T16:35:51.6501806Z Monday 05 October 2026  13:35:51 -0300 (0:00:00.479)       0:00:05.753 ******** 
2026-10-05T16:35:52.4993886Z 
2026-10-05T16:35:52.4994980Z TASK [Instalando o filebeat versao 7.2.1] **************************************
2026-10-05T16:35:52.4995368Z ok: [caddeapllx930.agil.nprd.caixa.gov.br]
2026-10-05T16:35:52.5129812Z Monday 05 October 2026  13:35:52 -0300 (0:00:00.862)       0:00:06.616 ******** 
2026-10-05T16:35:52.7781216Z 
2026-10-05T16:35:52.7782075Z TASK [Delete RPM filebeat] *****************************************************
2026-10-05T16:35:52.7782319Z changed: [caddeapllx930.agil.nprd.caixa.gov.br]
2026-10-05T16:35:52.7914038Z Monday 05 October 2026  13:35:52 -0300 (0:00:00.278)       0:00:06.895 ******** 
2026-10-05T16:35:53.5070303Z 
2026-10-05T16:35:53.5070816Z TASK [Template a file to /etc/filebeat/filebeat.yml] ***************************
2026-10-05T16:35:53.5070990Z ok: [caddeapllx930.agil.nprd.caixa.gov.br]
2026-10-05T16:35:53.5198455Z Monday 05 October 2026  13:35:53 -0300 (0:00:00.728)       0:00:07.623 ******** 
2026-10-05T16:35:53.8111121Z 
2026-10-05T16:35:53.8111644Z TASK [Verificando APM Agent] ***************************************************
2026-10-05T16:35:53.8111801Z ok: [caddeapllx930.agil.nprd.caixa.gov.br]
2026-10-05T16:35:53.8245354Z Monday 05 October 2026  13:35:53 -0300 (0:00:00.304)       0:00:07.928 ******** 
2026-10-05T16:35:53.8797042Z Monday 05 October 2026  13:35:53 -0300 (0:00:00.054)       0:00:07.983 ******** 
2026-10-05T16:35:53.9346373Z Monday 05 October 2026  13:35:53 -0300 (0:00:00.054)       0:00:08.038 ******** 
2026-10-05T16:35:53.9882619Z Monday 05 October 2026  13:35:53 -0300 (0:00:00.053)       0:00:08.091 ******** 
2026-10-05T16:35:54.0411326Z Monday 05 October 2026  13:35:54 -0300 (0:00:00.052)       0:00:08.144 ******** 
2026-10-05T16:35:54.0942480Z Monday 05 October 2026  13:35:54 -0300 (0:00:00.053)       0:00:08.197 ******** 
2026-10-05T16:35:54.5271636Z 
2026-10-05T16:35:54.5272384Z TASK [Verifica se existe servico zabbix-agent] *********************************
2026-10-05T16:35:54.5272915Z fatal: [caddeapllx930.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["systemctl", "is-active", "zabbix-agent"], "delta": "0:00:00.005554", "end": "2026-10-05 13:35:54.510377", "msg": "non-zero return code", "rc": 3, "start": "2026-10-05 13:35:54.504823", "stderr": "", "stderr_lines": [], "stdout": "unknown", "stdout_lines": ["unknown"]}
2026-10-05T16:35:54.5273182Z ...ignoring
2026-10-05T16:35:54.5393693Z Monday 05 October 2026  13:35:54 -0300 (0:00:00.445)       0:00:08.643 ******** 
2026-10-05T16:35:54.5942974Z Monday 05 October 2026  13:35:54 -0300 (0:00:00.054)       0:00:08.697 ******** 
2026-10-05T16:35:55.8092719Z 
2026-10-05T16:35:55.8093415Z TASK [zabbix : Install libpcre2-8 - Red Hat 7] *********************************
2026-10-05T16:35:55.8097657Z fatal: [caddeapllx930.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "changes": {"installed": ["/root/.ansible/tmp/ansible-moduletmp-1791218155.04-0nqWTL/libpcre2-8-0-10.39-150400.2.3.x86_64nj3bh4.rpm"]}, "msg": "This system is not registered with RHN Classic or Red Hat Satellite.\nYou can use rhn_register to register.\nRed Hat Satellite or RHN Classic support will be disabled.\n\n\nTransaction check error:\n  file /usr/lib64/libpcre2-8.so.0 from install of libpcre2-8-0-10.39-150400.2.3.x86_64 conflicts with file from package pcre2-10.23-2.el7.x86_64\n\nError Summary\n-------------\n\n", "rc": 1, "results": ["Loaded plugins: product-id, rhnplugin, search-disabled-repos, subscription-\n              : manager\nThis system is not registered with an entitlement server. You can use subscription-manager to register.\nExamining /root/.ansible/tmp/ansible-moduletmp-1791218155.04-0nqWTL/libpcre2-8-0-10.39-150400.2.3.x86_64nj3bh4.rpm: libpcre2-8-0-10.39-150400.2.3.x86_64\nMarking /root/.ansible/tmp/ansible-moduletmp-1791218155.04-0nqWTL/libpcre2-8-0-10.39-150400.2.3.x86_64nj3bh4.rpm to be installed\nResolving Dependencies\n--> Running transaction check\n---> Package libpcre2-8-0.x86_64 0:10.39-150400.2.3 will be installed\n--> Finished Dependency Resolution\n\nDependencies Resolved\n\n================================================================================\n Package\n      Arch   Version          Repository                                   Size\n================================================================================\nInstalling:\n libpcre2-8-0\n      x86_64 10.39-150400.2.3 /libpcre2-8-0-10.39-150400.2.3.x86_64nj3bh4 910 k\n\nTransaction Summary\n================================================================================\nInstall  1 Package\n\nTotal size: 910 k\nInstalled size: 910 k\nDownloading packages:\nRunning transaction check\nRunning transaction test\n"]}
2026-10-05T16:35:55.8099203Z ...ignoring
2026-10-05T16:35:55.8232377Z Monday 05 October 2026  13:35:55 -0300 (0:00:01.228)       0:00:09.927 ******** 
2026-10-05T16:35:56.4422651Z 
2026-10-05T16:35:56.4423231Z TASK [Install zabbix agent2] ***************************************************
2026-10-05T16:35:56.4423685Z ok: [caddeapllx930.agil.nprd.caixa.gov.br] => (item=http://10.122.154.12/deploy/zabbix-agent2-plugin-mongodb-6.0.23-release1.el7.x86_64.rpm)
2026-10-05T16:35:57.0290082Z ok: [caddeapllx930.agil.nprd.caixa.gov.br] => (item=http://10.122.154.12/deploy/zabbix-agent2-plugin-postgresql-6.0.23-release1.el7.x86_64.rpm)
2026-10-05T16:35:57.5945213Z ok: [caddeapllx930.agil.nprd.caixa.gov.br] => (item=http://10.122.154.12/deploy/zabbix-agent2-6.0.23-release1.el7.x86_64.rpm)
2026-10-05T16:35:57.6119813Z Monday 05 October 2026  13:35:57 -0300 (0:00:01.788)       0:00:11.715 ******** 
2026-10-05T16:35:58.2396052Z 
2026-10-05T16:35:58.2396514Z TASK [Template a file to /etc/zabbix_zabbix_agente.d/monit_agent2.conf] ********
2026-10-05T16:35:58.2396698Z ok: [caddeapllx930.agil.nprd.caixa.gov.br]
2026-10-05T16:35:58.2527227Z Monday 05 October 2026  13:35:58 -0300 (0:00:00.640)       0:00:12.356 ******** 
2026-10-05T16:35:58.8603043Z 
2026-10-05T16:35:58.8603802Z TASK [Garantindo que o zabbix_agent2 esta startado] ****************************
2026-10-05T16:35:58.8604179Z ok: [caddeapllx930.agil.nprd.caixa.gov.br]
2026-10-05T16:35:58.8746449Z Monday 05 October 2026  13:35:58 -0300 (0:00:00.621)       0:00:12.978 ******** 
2026-10-05T16:35:58.9289218Z Monday 05 October 2026  13:35:58 -0300 (0:00:00.054)       0:00:13.032 ******** 
2026-10-05T16:35:58.9888904Z 
2026-10-05T16:35:58.9889744Z TASK [zabbix : Gera o nome do grupo e templates quando o ambiente não é PRD] ***
2026-10-05T16:35:58.9889901Z ok: [caddeapllx930.agil.nprd.caixa.gov.br]
2026-10-05T16:35:59.0038297Z Monday 05 October 2026  13:35:59 -0300 (0:00:00.075)       0:00:13.107 ******** 
2026-10-05T16:35:59.8826942Z 
2026-10-05T16:35:59.8827492Z TASK [zabbix : hostgroup create to Zabbix Az CEMOT] ****************************
2026-10-05T16:35:59.8828801Z ok: [caddeapllx930.agil.nprd.caixa.gov.br]
2026-10-05T16:35:59.8979846Z Monday 05 October 2026  13:35:59 -0300 (0:00:00.894)       0:00:14.001 ******** 
2026-10-05T16:36:00.6347761Z 
2026-10-05T16:36:00.6348303Z TASK [zabbix : template get to Zabbix Az CEMOT] ********************************
2026-10-05T16:36:00.6348471Z ok: [caddeapllx930.agil.nprd.caixa.gov.br]
2026-10-05T16:36:00.6503502Z Monday 05 October 2026  13:36:00 -0300 (0:00:00.752)       0:00:14.754 ******** 
2026-10-05T16:36:01.4509779Z 
2026-10-05T16:36:01.4510528Z TASK [zabbix : hostgroup get to Zabbix Az CEMOT] *******************************
2026-10-05T16:36:01.4511332Z ok: [caddeapllx930.agil.nprd.caixa.gov.br]
2026-10-05T16:36:01.4666891Z Monday 05 October 2026  13:36:01 -0300 (0:00:00.816)       0:00:15.570 ******** 
2026-10-05T16:36:02.2148437Z 
2026-10-05T16:36:02.2148953Z TASK [zabbix : proxy get to Zabbix Az CEMOT] ***********************************
2026-10-05T16:36:02.2149497Z ok: [caddeapllx930.agil.nprd.caixa.gov.br]
2026-10-05T16:36:02.2310316Z Monday 05 October 2026  13:36:02 -0300 (0:00:00.764)       0:00:16.334 ******** 
2026-10-05T16:36:02.9657835Z 
2026-10-05T16:36:02.9658346Z TASK [zabbix : host create to Zabbix Az CEMOT] *********************************
2026-10-05T16:36:02.9658510Z ok: [caddeapllx930.agil.nprd.caixa.gov.br]
2026-10-05T16:36:02.9797280Z Monday 05 October 2026  13:36:02 -0300 (0:00:00.748)       0:00:17.083 ******** 
2026-10-05T16:36:03.0334720Z Monday 05 October 2026  13:36:03 -0300 (0:00:00.053)       0:00:17.137 ******** 
2026-10-05T16:36:03.0931919Z 
2026-10-05T16:36:03.0932448Z TASK [zabbix : Gera o nome do grupo e define os templates quando o ambiente NPRD] ***
2026-10-05T16:36:03.0932648Z ok: [caddeapllx930.agil.nprd.caixa.gov.br]
2026-10-05T16:36:03.1058437Z Monday 05 October 2026  13:36:03 -0300 (0:00:00.072)       0:00:17.209 ******** 
2026-10-05T16:36:03.1629811Z 
2026-10-05T16:36:03.1630335Z TASK [zabbix : Gera os nomes de grupos e dados para tratamento dos consolidados.] ***
2026-10-05T16:36:03.1630494Z ok: [caddeapllx930.agil.nprd.caixa.gov.br]
2026-10-05T16:36:03.1780659Z Monday 05 October 2026  13:36:03 -0300 (0:00:00.072)       0:00:17.281 ******** 
2026-10-05T16:36:03.2371327Z /opt/ads-agent/ansible/lib/python2.7/site-packages/psycopg2/__init__.py:144: UserWarning: The psycopg2 wheel package will be renamed from release 2.8; in order to keep installing from binary please use "pip install psycopg2-binary" instead. For details see: <http://initd.org/psycopg/docs/install.html#binary-install-from-pypi>.
2026-10-05T16:36:03.2371702Z   """)
2026-10-05T16:36:05.9325861Z 
2026-10-05T16:36:05.9326601Z TASK [zabbix : Consultar os dados do sistema.] *********************************
2026-10-05T16:36:05.9327135Z fatal: [caddeapllx930.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "msg": "unable to connect to database: FATAL:  password authentication failed for user \"monitdbadm\"\nFATAL:  no pg_hba.conf entry for host \"10.122.155.67\", user \"monitdbadm\", database \"monitordb001\", no encryption\n"}
2026-10-05T16:36:05.9346369Z 
2026-10-05T16:36:05.9347004Z PLAY RECAP *********************************************************************
2026-10-05T16:36:05.9347442Z caddeapllx930.agil.nprd.caixa.gov.br : ok=24   changed=3    unreachable=0    failed=1    skipped=11   rescued=0    ignored=2   
2026-10-05T16:36:05.9347770Z 
2026-10-05T16:36:05.9348369Z Monday 05 October 2026  13:36:05 -0300 (0:00:02.755)       0:00:20.037 ******** 
2026-10-05T16:36:05.9348583Z =============================================================================== 
2026-10-05T16:36:05.9348827Z zabbix : Consultar os dados do sistema. --------------------------------- 2.76s
2026-10-05T16:36:05.9349054Z Gathering Facts --------------------------------------------------------- 1.99s
2026-10-05T16:36:05.9349376Z Install zabbix agent2 --------------------------------------------------- 1.79s
2026-10-05T16:36:05.9349604Z zabbix : Install libpcre2-8 - Red Hat 7 --------------------------------- 1.23s
2026-10-05T16:36:05.9349811Z zabbix : hostgroup create to Zabbix Az CEMOT ---------------------------- 0.89s
2026-10-05T16:36:05.9350031Z Instalando o filebeat versao 7.2.1 -------------------------------------- 0.86s
2026-10-05T16:36:05.9350244Z zabbix : hostgroup get to Zabbix Az CEMOT ------------------------------- 0.82s
2026-10-05T16:36:05.9350456Z node_exporter : Criando o service do Node Exporter ---------------------- 0.81s
2026-10-05T16:36:05.9350669Z zabbix : proxy get to Zabbix Az CEMOT ----------------------------------- 0.76s
2026-10-05T16:36:05.9350879Z zabbix : template get to Zabbix Az CEMOT -------------------------------- 0.75s
2026-10-05T16:36:05.9351322Z zabbix : host create to Zabbix Az CEMOT --------------------------------- 0.75s
2026-10-05T16:36:05.9351548Z Template a file to /etc/filebeat/filebeat.yml --------------------------- 0.73s
2026-10-05T16:36:05.9351768Z node_exporter : Copia o Apache Exporter para o servidor ----------------- 0.69s
2026-10-05T16:36:05.9352068Z Template a file to /etc/zabbix_zabbix_agente.d/monit_agent2.conf -------- 0.64s
2026-10-05T16:36:05.9352292Z Garantindo que o zabbix_agent2 esta startado ---------------------------- 0.62s
2026-10-05T16:36:05.9352500Z Criando o usuario "node_exporter" vinculado ao grupo "node_exporter" ---- 0.54s
2026-10-05T16:36:05.9352712Z Download RPM filebeat --------------------------------------------------- 0.48s
2026-10-05T16:36:05.9352928Z Verifica se existe servico zabbix-agent --------------------------------- 0.45s
2026-10-05T16:36:05.9353140Z Criando o grupo do "node_exporter" -------------------------------------- 0.42s
2026-10-05T16:36:05.9353358Z Verifiando o jxm_exporter esta instalado -------------------------------- 0.39s
2026-10-05T16:36:05.9353490Z Playbook run took 0 days, 0 hours, 0 minutes, 19 seconds
2026-10-05T16:36:05.9999843Z ##[error]Bash exited with code '2'.
2026-10-05T16:36:06.0002491Z ##[section]Finishing: Configurando Stack de Monitoração
