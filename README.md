A pipeline de release do sistema SIGPD-Backend está dando sucesso nas releases, porém não está trocando o pacote.

URL da pipeline: https://devops.caixa/projetos/Caixa/_releaseProgress?releaseId=490483&_a=release-pipeline-progress

no terminal lança este erro:
 
2026-06-23 17:14:18,583 ERROR [org.jboss.modcluster] (UndertowEventHandlerAdapter - 1) MODCLUSTER000042: Error MEM sending STATUS command to caddeapllx135.extra.caixa.gov.br/10.116.223.231:6666, configuration will be reset: MEM: Can't read node with "caddeapllx929" JVMRoute

2026-06-23 17:14:18,586 ERROR [org.jboss.modcluster] (UndertowEventHandlerAdapter - 1) MODCLUSTER000042: Error MEM sending STATUS command to caddeapllx136.extra.caixa.gov.br/10.116.223.232:6666, configuration will be reset: MEM: Can't read node with "caddeapllx929" JVMRoute



Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
/
Releases
/
SIGPD-backend
/
SIGPD-backend-1305
Search


Caixa

Overview

Boards

Repos

Pipelines
Pipelines
Environments
Releases
Library
Task groups
Deployment groups
Portal Infra

Test Plans

Artifacts
Project settings
SIGPD-backend

SIGPD-backend-1305


EC DES

Succeeded


Pipeline

Tasks

Variables

Logs

Tests
Agent job
Started: 23/06/2026, 17:14:04
Pool:
Release-Linux
·
Agent: cadsvaprlx068.intra.caixa.gov.br

2m 28s

Initialize job
·
succeeded
<1s

Pre-job: Download secure file
·
succeeded

<1s

Pre-job: Download secure file
·
succeeded
<1s

Download Artifacts
·
succeeded
1 warning
<1s

Exportando as variáveis do arquivo Trust Store
·
succeeded
<1s

Valida Variáveis Obrigatórias
·
succeeded
<1s

Recuperando URL Pacote Nexus
·
succeeded
<1s

Recupera Pacote
·
succeeded
<1s

Convertendo Minúsculo e Definindo nome do Projeto/Repositório
·
succeeded
<1s

Corrigindo Codificação Arquivos dos2unix
·
succeeded
<1s

Alterando Valores placeholders nos arquivos de config
·
succeeded
<1s

Valida XML JBOSS
·
succeeded
<1s

Git clone https://devops.caixa/projetos/Infraestrutura/_git/esteira-logs
·
succeeded
<1s

Cria Streams Graylog
·
succeeded
1s

Configurando o Apache
·
succeeded
8s

Criando as VMs
·
succeeded
34s

Configurando DNS
·
succeeded
7s

Deploy Secure Files [JBOSS]
·
succeeded
7s

Deploy Config no JBOSS
·
succeeded
22s

Deploy Pacote no JBOSS
·
succeeded
7s

Check Deployments [JBOSS]
·
succeeded
6s

Atualizando versão no PortalIF
·
succeeded
<1s

Resumo da release
·
succeeded

49s

Finalize Job
·
succeeded
<1s
Row 2

Row 3


2026-06-23T20:15:30.0790987Z ##[section]Starting: Deploy Pacote no JBOSS
2026-06-23T20:15:30.0794546Z ==============================================================================
2026-06-23T20:15:30.0794626Z Task         : Bash
2026-06-23T20:15:30.0794683Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-23T20:15:30.0794743Z Version      : 3.227.0
2026-06-23T20:15:30.0794785Z Author       : Microsoft Corporation
2026-06-23T20:15:30.0794846Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-23T20:15:30.0794915Z ==============================================================================
2026-06-23T20:15:30.2164223Z Generating script.
2026-06-23T20:15:30.2164691Z Script contents:
2026-06-23T20:15:30.2165268Z ansible-playbook /opt/ads-agent/esteira-jboss-vm/site.yml --tags deploy -e sistema_ambiente=des -e quantidade_vm=1 -e url_deploy="`echo "" | tr -d "\'"`" -e package_path=/opt/ads-agent/_work/r18540/a/binario/`basename ` -e package_hash=$(HASH_BUILD) -e http_context_default=sigpd-api/v1/health-check/live -e site=$(site)
2026-06-23T20:15:30.2166022Z ========================== Starting Command Output ===========================
2026-06-23T20:15:30.2172355Z [command]/bin/bash /opt/ads-agent/_work/_temp/9c94bbd2-86d9-4e9b-bd77-1aec7f7041c5.sh
2026-06-23T20:15:30.2262300Z basename: falta operando
2026-06-23T20:15:30.2264490Z Try 'basename --help' for more information.
2026-06-23T20:15:30.2264985Z /opt/ads-agent/_work/_temp/9c94bbd2-86d9-4e9b-bd77-1aec7f7041c5.sh: line 1: HASH_BUILD: comando não encontrado
2026-06-23T20:15:30.2273927Z /opt/ads-agent/_work/_temp/9c94bbd2-86d9-4e9b-bd77-1aec7f7041c5.sh: line 1: site: comando não encontrado
2026-06-23T20:15:32.3288926Z 
2026-06-23T20:15:32.3289477Z PLAY [local] *******************************************************************
2026-06-23T20:15:32.3846522Z 
2026-06-23T20:15:32.3847322Z PLAY [Configurando o DNS] ******************************************************
2026-06-23T20:15:32.6020993Z 
2026-06-23T20:15:32.6021947Z PLAY [local] *******************************************************************
2026-06-23T20:15:32.6053862Z 
2026-06-23T20:15:32.6054463Z PLAY [local] *******************************************************************
2026-06-23T20:15:32.6088549Z 
2026-06-23T20:15:32.6089750Z PLAY [Verificando serviços] ****************************************************
2026-06-23T20:15:32.6173950Z 
2026-06-23T20:15:32.6174836Z PLAY [Configuração LDAP] *******************************************************
2026-06-23T20:15:32.6247997Z 
2026-06-23T20:15:32.6248992Z PLAY [apache_des] **************************************************************
2026-06-23T20:15:32.6283929Z 
2026-06-23T20:15:32.6284896Z PLAY [jboss] *******************************************************************
2026-06-23T20:15:32.6335488Z 
2026-06-23T20:15:32.6336356Z PLAY [Instalando stack Jboss] **************************************************
2026-06-23T20:15:32.6460114Z Tuesday 23 June 2026  17:15:32 -0300 (0:00:00.378)       0:00:00.378 ********** 
2026-06-23T20:15:33.1611331Z 
2026-06-23T20:15:33.1612752Z TASK [Verificando o java versão esta instalado: 1.8.0_221] *********************
2026-06-23T20:15:33.1612973Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-23T20:15:33.1649002Z Tuesday 23 June 2026  17:15:33 -0300 (0:00:00.519)       0:00:00.897 ********** 
2026-06-23T20:15:33.6126096Z 
2026-06-23T20:15:33.6127054Z TASK [Verificando a versão do Java] ********************************************
2026-06-23T20:15:33.6127300Z changed: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-23T20:15:33.6143105Z Tuesday 23 June 2026  17:15:33 -0300 (0:00:00.449)       0:00:01.346 ********** 
2026-06-23T20:15:33.6680431Z Tuesday 23 June 2026  17:15:33 -0300 (0:00:00.053)       0:00:01.400 ********** 
2026-06-23T20:15:33.9318602Z 
2026-06-23T20:15:33.9319830Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-06-23T20:15:33.9320087Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-23T20:15:33.9344270Z Tuesday 23 June 2026  17:15:33 -0300 (0:00:00.266)       0:00:01.666 ********** 
2026-06-23T20:15:33.9974633Z 
2026-06-23T20:15:33.9975750Z TASK [Setando a versão do Jboss] ***********************************************
2026-06-23T20:15:33.9975993Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-23T20:15:34.0005351Z Tuesday 23 June 2026  17:15:33 -0300 (0:00:00.066)       0:00:01.733 ********** 
2026-06-23T20:15:34.0457468Z Tuesday 23 June 2026  17:15:34 -0300 (0:00:00.044)       0:00:01.777 ********** 
2026-06-23T20:15:34.0925343Z Tuesday 23 June 2026  17:15:34 -0300 (0:00:00.046)       0:00:01.824 ********** 
2026-06-23T20:15:34.1359018Z Tuesday 23 June 2026  17:15:34 -0300 (0:00:00.043)       0:00:01.868 ********** 
2026-06-23T20:15:34.1838282Z Tuesday 23 June 2026  17:15:34 -0300 (0:00:00.047)       0:00:01.916 ********** 
2026-06-23T20:15:34.2286499Z Tuesday 23 June 2026  17:15:34 -0300 (0:00:00.044)       0:00:01.961 ********** 
2026-06-23T20:15:34.2753332Z Tuesday 23 June 2026  17:15:34 -0300 (0:00:00.046)       0:00:02.007 ********** 
2026-06-23T20:15:34.3300840Z Tuesday 23 June 2026  17:15:34 -0300 (0:00:00.054)       0:00:02.062 ********** 
2026-06-23T20:15:34.3740689Z 
2026-06-23T20:15:34.3741316Z PLAY [jboss] *******************************************************************
2026-06-23T20:15:34.3772732Z 
2026-06-23T20:15:34.3773084Z PLAY [jboss] *******************************************************************
2026-06-23T20:15:34.3807107Z 
2026-06-23T20:15:34.3807385Z PLAY [jboss] *******************************************************************
2026-06-23T20:15:34.3854473Z Tuesday 23 June 2026  17:15:34 -0300 (0:00:00.055)       0:00:02.118 ********** 
2026-06-23T20:15:35.8650170Z 
2026-06-23T20:15:35.8651044Z TASK [Gathering Facts] *********************************************************
2026-06-23T20:15:35.8651303Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-23T20:15:35.8873025Z Tuesday 23 June 2026  17:15:35 -0300 (0:00:01.501)       0:00:03.619 ********** 
2026-06-23T20:15:35.9776541Z 
2026-06-23T20:15:35.9777789Z TASK [Setando a versão do Jboss] ***********************************************
2026-06-23T20:15:35.9778002Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-23T20:15:35.9916072Z Tuesday 23 June 2026  17:15:35 -0300 (0:00:00.104)       0:00:03.723 ********** 
2026-06-23T20:15:36.6190863Z 
2026-06-23T20:15:36.6191745Z TASK [Garante que o Jboss esteja startado] *************************************
2026-06-23T20:15:36.6191975Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-23T20:15:36.6352725Z Tuesday 23 June 2026  17:15:36 -0300 (0:00:00.643)       0:00:04.367 ********** 
2026-06-23T20:15:37.0486668Z 
2026-06-23T20:15:37.0487098Z TASK [Verifica o se package existe] ********************************************
2026-06-23T20:15:37.0487313Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-23T20:15:37.0634431Z Tuesday 23 June 2026  17:15:37 -0300 (0:00:00.428)       0:00:04.795 ********** 
2026-06-23T20:15:37.2319369Z 
2026-06-23T20:15:37.2319908Z TASK [Deploy do pacote Local] **************************************************
2026-06-23T20:15:37.2320134Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-23T20:15:37.2348611Z 
2026-06-23T20:15:37.2349235Z PLAY [local] *******************************************************************
2026-06-23T20:15:37.2387578Z 
2026-06-23T20:15:37.2388281Z PLAY [jboss] *******************************************************************
2026-06-23T20:15:37.2423712Z 
2026-06-23T20:15:37.2423946Z PLAY [jboss] *******************************************************************
2026-06-23T20:15:37.2467222Z 
2026-06-23T20:15:37.2467642Z PLAY [Copiando deployments adicionais] *****************************************
2026-06-23T20:15:37.2503950Z 
2026-06-23T20:15:37.2505999Z PLAY [Copiando modules adicionais] *********************************************
2026-06-23T20:15:37.2542962Z 
2026-06-23T20:15:37.2543228Z PLAY [local] *******************************************************************
2026-06-23T20:15:37.2577885Z [WARNING]: Could not match supplied host pattern, ignoring: instance_restart
2026-06-23T20:15:37.2580118Z 
2026-06-23T20:15:37.2580653Z PLAY [instance_restart] ********************************************************
2026-06-23T20:15:37.2580851Z skipping: no hosts matched
2026-06-23T20:15:37.2583420Z [WARNING]: Could not match supplied host pattern, ignoring: machine_reboot
2026-06-23T20:15:37.2586558Z 
2026-06-23T20:15:37.2587173Z PLAY [machine_reboot] **********************************************************
2026-06-23T20:15:37.2587528Z skipping: no hosts matched
2026-06-23T20:15:37.2592624Z 
2026-06-23T20:15:37.2592970Z PLAY [local] *******************************************************************
2026-06-23T20:15:37.2618978Z [WARNING]: Could not match supplied host pattern, ignoring: instance_stop
2026-06-23T20:15:37.2621366Z 
2026-06-23T20:15:37.2621781Z PLAY [instance_stop] ***********************************************************
2026-06-23T20:15:37.2622189Z skipping: no hosts matched
2026-06-23T20:15:37.2624899Z 
2026-06-23T20:15:37.2625335Z PLAY [machine_reboot] **********************************************************
2026-06-23T20:15:37.2625505Z skipping: no hosts matched
2026-06-23T20:15:37.2632435Z 
2026-06-23T20:15:37.2633021Z PLAY [Configura TSM] ***********************************************************
2026-06-23T20:15:37.2663112Z 
2026-06-23T20:15:37.2663659Z PLAY [Configura Control-M] *****************************************************
2026-06-23T20:15:37.2683288Z 
2026-06-23T20:15:37.2683679Z PLAY RECAP *********************************************************************
2026-06-23T20:15:37.2684099Z caddeapllx929.agil.nprd.caixa.gov.br : ok=9    changed=1    unreachable=0    failed=0    skipped=9    rescued=0    ignored=0   
2026-06-23T20:15:37.2684234Z 
2026-06-23T20:15:37.2685008Z Tuesday 23 June 2026  17:15:37 -0300 (0:00:00.205)       0:00:05.001 ********** 
2026-06-23T20:15:37.2685265Z =============================================================================== 
2026-06-23T20:15:37.2688395Z Gathering Facts --------------------------------------------------------- 1.50s
2026-06-23T20:15:37.2688814Z Garante que o Jboss esteja startado ------------------------------------- 0.64s
2026-06-23T20:15:37.2689166Z Verificando o java versão esta instalado: 1.8.0_221 --------------------- 0.52s
2026-06-23T20:15:37.2689509Z Verificando a versão do Java -------------------------------------------- 0.45s
2026-06-23T20:15:37.2689830Z Verifica o se package existe -------------------------------------------- 0.43s
2026-06-23T20:15:37.2690203Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.27s
2026-06-23T20:15:37.2691640Z Deploy do pacote Local -------------------------------------------------- 0.21s
2026-06-23T20:15:37.2691982Z Setando a versão do Jboss ----------------------------------------------- 0.10s
2026-06-23T20:15:37.2692215Z Setando a versão do Jboss ----------------------------------------------- 0.07s
2026-06-23T20:15:37.2692621Z jboss : Copy template script -------------------------------------------- 0.06s
2026-06-23T20:15:37.2692872Z jboss : Domain | Set service name --------------------------------------- 0.05s
2026-06-23T20:15:37.2693153Z java : include ---------------------------------------------------------- 0.05s
2026-06-23T20:15:37.2693372Z jboss : Set file config to use domain.xml subsystem management ---------- 0.05s
2026-06-23T20:15:37.2693589Z Determine variable jboss_domain_instance HC ----------------------------- 0.05s
2026-06-23T20:15:37.2693870Z jboss : Standalone | Set service name ----------------------------------- 0.05s
2026-06-23T20:15:37.2694088Z Determine variable jboss_domain_instance DC ----------------------------- 0.04s
2026-06-23T20:15:37.2694343Z jboss : Update domain.xml to use LDAP ----------------------------------- 0.04s
2026-06-23T20:15:37.2694791Z Determine variable jboss_domain_instance standalone --------------------- 0.04s
2026-06-23T20:15:37.2695015Z Playbook run took 0 days, 0 hours, 0 minutes, 4 seconds
2026-06-23T20:15:37.3415167Z ##[section]Finishing: Deploy Pacote no JBOSS

2026-06-23T20:15:30.0790987Z ##[section]Starting: Deploy Pacote no JBOSS
2026-06-23T20:15:30.0794546Z ==============================================================================
2026-06-23T20:15:30.0794626Z Task         : Bash
2026-06-23T20:15:30.0794683Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-23T20:15:30.0794743Z Version      : 3.227.0
2026-06-23T20:15:30.0794785Z Author       : Microsoft Corporation
2026-06-23T20:15:30.0794846Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-23T20:15:30.0794915Z ==============================================================================
2026-06-23T20:15:30.2164223Z Generating script.
2026-06-23T20:15:30.2164691Z Script contents:
2026-06-23T20:15:30.2165268Z ansible-playbook /opt/ads-agent/esteira-jboss-vm/site.yml --tags deploy -e sistema_ambiente=des -e quantidade_vm=1 -e url_deploy="`echo "" | tr -d "\'"`" -e package_path=/opt/ads-agent/_work/r18540/a/binario/`basename ` -e package_hash=$(HASH_BUILD) -e http_context_default=sigpd-api/v1/health-check/live -e site=$(site)
2026-06-23T20:15:30.2166022Z ========================== Starting Command Output ===========================
2026-06-23T20:15:30.2172355Z [command]/bin/bash /opt/ads-agent/_work/_temp/9c94bbd2-86d9-4e9b-bd77-1aec7f7041c5.sh
2026-06-23T20:15:30.2262300Z basename: falta operando
2026-06-23T20:15:30.2264490Z Try 'basename --help' for more information.
2026-06-23T20:15:30.2264985Z /opt/ads-agent/_work/_temp/9c94bbd2-86d9-4e9b-bd77-1aec7f7041c5.sh: line 1: HASH_BUILD: comando não encontrado
2026-06-23T20:15:30.2273927Z /opt/ads-agent/_work/_temp/9c94bbd2-86d9-4e9b-bd77-1aec7f7041c5.sh: line 1: site: comando não encontrado
2026-06-23T20:15:32.3288926Z 
2026-06-23T20:15:32.3289477Z PLAY [local] *******************************************************************
2026-06-23T20:15:32.3846522Z 
2026-06-23T20:15:32.3847322Z PLAY [Configurando o DNS] ******************************************************
2026-06-23T20:15:32.6020993Z 
2026-06-23T20:15:32.6021947Z PLAY [local] *******************************************************************
2026-06-23T20:15:32.6053862Z 
2026-06-23T20:15:32.6054463Z PLAY [local] *******************************************************************
2026-06-23T20:15:32.6088549Z 
2026-06-23T20:15:32.6089750Z PLAY [Verificando serviços] ****************************************************
2026-06-23T20:15:32.6173950Z 
2026-06-23T20:15:32.6174836Z PLAY [Configuração LDAP] *******************************************************
2026-06-23T20:15:32.6247997Z 
2026-06-23T20:15:32.6248992Z PLAY [apache_des] **************************************************************
2026-06-23T20:15:32.6283929Z 
2026-06-23T20:15:32.6284896Z PLAY [jboss] *******************************************************************
2026-06-23T20:15:32.6335488Z 
2026-06-23T20:15:32.6336356Z PLAY [Instalando stack Jboss] **************************************************
2026-06-23T20:15:32.6460114Z Tuesday 23 June 2026  17:15:32 -0300 (0:00:00.378)       0:00:00.378 ********** 
2026-06-23T20:15:33.1611331Z 
2026-06-23T20:15:33.1612752Z TASK [Verificando o java versão esta instalado: 1.8.0_221] *********************
2026-06-23T20:15:33.1612973Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-23T20:15:33.1649002Z Tuesday 23 June 2026  17:15:33 -0300 (0:00:00.519)       0:00:00.897 ********** 
2026-06-23T20:15:33.6126096Z 
2026-06-23T20:15:33.6127054Z TASK [Verificando a versão do Java] ********************************************
2026-06-23T20:15:33.6127300Z changed: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-23T20:15:33.6143105Z Tuesday 23 June 2026  17:15:33 -0300 (0:00:00.449)       0:00:01.346 ********** 
2026-06-23T20:15:33.6680431Z Tuesday 23 June 2026  17:15:33 -0300 (0:00:00.053)       0:00:01.400 ********** 
2026-06-23T20:15:33.9318602Z 
2026-06-23T20:15:33.9319830Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-06-23T20:15:33.9320087Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-23T20:15:33.9344270Z Tuesday 23 June 2026  17:15:33 -0300 (0:00:00.266)       0:00:01.666 ********** 
2026-06-23T20:15:33.9974633Z 
2026-06-23T20:15:33.9975750Z TASK [Setando a versão do Jboss] ***********************************************
2026-06-23T20:15:33.9975993Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-23T20:15:34.0005351Z Tuesday 23 June 2026  17:15:33 -0300 (0:00:00.066)       0:00:01.733 ********** 
2026-06-23T20:15:34.0457468Z Tuesday 23 June 2026  17:15:34 -0300 (0:00:00.044)       0:00:01.777 ********** 
2026-06-23T20:15:34.0925343Z Tuesday 23 June 2026  17:15:34 -0300 (0:00:00.046)       0:00:01.824 ********** 
2026-06-23T20:15:34.1359018Z Tuesday 23 June 2026  17:15:34 -0300 (0:00:00.043)       0:00:01.868 ********** 
2026-06-23T20:15:34.1838282Z Tuesday 23 June 2026  17:15:34 -0300 (0:00:00.047)       0:00:01.916 ********** 
2026-06-23T20:15:34.2286499Z Tuesday 23 June 2026  17:15:34 -0300 (0:00:00.044)       0:00:01.961 ********** 
2026-06-23T20:15:34.2753332Z Tuesday 23 June 2026  17:15:34 -0300 (0:00:00.046)       0:00:02.007 ********** 
2026-06-23T20:15:34.3300840Z Tuesday 23 June 2026  17:15:34 -0300 (0:00:00.054)       0:00:02.062 ********** 
2026-06-23T20:15:34.3740689Z 
2026-06-23T20:15:34.3741316Z PLAY [jboss] *******************************************************************
2026-06-23T20:15:34.3772732Z 
2026-06-23T20:15:34.3773084Z PLAY [jboss] *******************************************************************
2026-06-23T20:15:34.3807107Z 
2026-06-23T20:15:34.3807385Z PLAY [jboss] *******************************************************************
2026-06-23T20:15:34.3854473Z Tuesday 23 June 2026  17:15:34 -0300 (0:00:00.055)       0:00:02.118 ********** 
2026-06-23T20:15:35.8650170Z 
2026-06-23T20:15:35.8651044Z TASK [Gathering Facts] *********************************************************
2026-06-23T20:15:35.8651303Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-23T20:15:35.8873025Z Tuesday 23 June 2026  17:15:35 -0300 (0:00:01.501)       0:00:03.619 ********** 
2026-06-23T20:15:35.9776541Z 
2026-06-23T20:15:35.9777789Z TASK [Setando a versão do Jboss] ***********************************************
2026-06-23T20:15:35.9778002Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-23T20:15:35.9916072Z Tuesday 23 June 2026  17:15:35 -0300 (0:00:00.104)       0:00:03.723 ********** 
2026-06-23T20:15:36.6190863Z 
2026-06-23T20:15:36.6191745Z TASK [Garante que o Jboss esteja startado] *************************************
2026-06-23T20:15:36.6191975Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-23T20:15:36.6352725Z Tuesday 23 June 2026  17:15:36 -0300 (0:00:00.643)       0:00:04.367 ********** 
2026-06-23T20:15:37.0486668Z 
2026-06-23T20:15:37.0487098Z TASK [Verifica o se package existe] ********************************************
2026-06-23T20:15:37.0487313Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-23T20:15:37.0634431Z Tuesday 23 June 2026  17:15:37 -0300 (0:00:00.428)       0:00:04.795 ********** 
2026-06-23T20:15:37.2319369Z 
2026-06-23T20:15:37.2319908Z TASK [Deploy do pacote Local] **************************************************
2026-06-23T20:15:37.2320134Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-23T20:15:37.2348611Z 
2026-06-23T20:15:37.2349235Z PLAY [local] *******************************************************************
2026-06-23T20:15:37.2387578Z 
2026-06-23T20:15:37.2388281Z PLAY [jboss] *******************************************************************
2026-06-23T20:15:37.2423712Z 
2026-06-23T20:15:37.2423946Z PLAY [jboss] *******************************************************************
2026-06-23T20:15:37.2467222Z 
2026-06-23T20:15:37.2467642Z PLAY [Copiando deployments adicionais] *****************************************
2026-06-23T20:15:37.2503950Z 
2026-06-23T20:15:37.2505999Z PLAY [Copiando modules adicionais] *********************************************
2026-06-23T20:15:37.2542962Z 
2026-06-23T20:15:37.2543228Z PLAY [local] *******************************************************************
2026-06-23T20:15:37.2577885Z [WARNING]: Could not match supplied host pattern, ignoring: instance_restart
2026-06-23T20:15:37.2580118Z 
2026-06-23T20:15:37.2580653Z PLAY [instance_restart] ********************************************************
2026-06-23T20:15:37.2580851Z skipping: no hosts matched
2026-06-23T20:15:37.2583420Z [WARNING]: Could not match supplied host pattern, ignoring: machine_reboot
2026-06-23T20:15:37.2586558Z 
2026-06-23T20:15:37.2587173Z PLAY [machine_reboot] **********************************************************
2026-06-23T20:15:37.2587528Z skipping: no hosts matched
2026-06-23T20:15:37.2592624Z 
2026-06-23T20:15:37.2592970Z PLAY [local] *******************************************************************
2026-06-23T20:15:37.2618978Z [WARNING]: Could not match supplied host pattern, ignoring: instance_stop
2026-06-23T20:15:37.2621366Z 
2026-06-23T20:15:37.2621781Z PLAY [instance_stop] ***********************************************************
2026-06-23T20:15:37.2622189Z skipping: no hosts matched
2026-06-23T20:15:37.2624899Z 
2026-06-23T20:15:37.2625335Z PLAY [machine_reboot] **********************************************************
2026-06-23T20:15:37.2625505Z skipping: no hosts matched
2026-06-23T20:15:37.2632435Z 
2026-06-23T20:15:37.2633021Z PLAY [Configura TSM] ***********************************************************
2026-06-23T20:15:37.2663112Z 
2026-06-23T20:15:37.2663659Z PLAY [Configura Control-M] *****************************************************
2026-06-23T20:15:37.2683288Z 
2026-06-23T20:15:37.2683679Z PLAY RECAP *********************************************************************
2026-06-23T20:15:37.2684099Z caddeapllx929.agil.nprd.caixa.gov.br : ok=9    changed=1    unreachable=0    failed=0    skipped=9    rescued=0    ignored=0   
2026-06-23T20:15:37.2684234Z 
2026-06-23T20:15:37.2685008Z Tuesday 23 June 2026  17:15:37 -0300 (0:00:00.205)       0:00:05.001 ********** 
2026-06-23T20:15:37.2685265Z =============================================================================== 
2026-06-23T20:15:37.2688395Z Gathering Facts --------------------------------------------------------- 1.50s
2026-06-23T20:15:37.2688814Z Garante que o Jboss esteja startado ------------------------------------- 0.64s
2026-06-23T20:15:37.2689166Z Verificando o java versão esta instalado: 1.8.0_221 --------------------- 0.52s
2026-06-23T20:15:37.2689509Z Verificando a versão do Java -------------------------------------------- 0.45s
2026-06-23T20:15:37.2689830Z Verifica o se package existe -------------------------------------------- 0.43s
2026-06-23T20:15:37.2690203Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.27s
2026-06-23T20:15:37.2691640Z Deploy do pacote Local -------------------------------------------------- 0.21s
2026-06-23T20:15:37.2691982Z Setando a versão do Jboss ----------------------------------------------- 0.10s
2026-06-23T20:15:37.2692215Z Setando a versão do Jboss ----------------------------------------------- 0.07s
2026-06-23T20:15:37.2692621Z jboss : Copy template script -------------------------------------------- 0.06s
2026-06-23T20:15:37.2692872Z jboss : Domain | Set service name --------------------------------------- 0.05s
2026-06-23T20:15:37.2693153Z java : include ---------------------------------------------------------- 0.05s
2026-06-23T20:15:37.2693372Z jboss : Set file config to use domain.xml subsystem management ---------- 0.05s
2026-06-23T20:15:37.2693589Z Determine variable jboss_domain_instance HC ----------------------------- 0.05s
2026-06-23T20:15:37.2693870Z jboss : Standalone | Set service name ----------------------------------- 0.05s
2026-06-23T20:15:37.2694088Z Determine variable jboss_domain_instance DC ----------------------------- 0.04s
2026-06-23T20:15:37.2694343Z jboss : Update domain.xml to use LDAP ----------------------------------- 0.04s
2026-06-23T20:15:37.2694791Z Determine variable jboss_domain_instance standalone --------------------- 0.04s
2026-06-23T20:15:37.2695015Z Playbook run took 0 days, 0 hours, 0 minutes, 4 seconds
2026-06-23T20:15:37.3415167Z ##[section]Finishing: Deploy Pacote no JBOSS



2026-06-23T20:15:43.5297984Z ##[section]Starting: Resumo da release
2026-06-23T20:15:43.5301244Z ==============================================================================
2026-06-23T20:15:43.5301323Z Task         : Bash
2026-06-23T20:15:43.5301365Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-23T20:15:43.5301436Z Version      : 3.227.0
2026-06-23T20:15:43.5301478Z Author       : Microsoft Corporation
2026-06-23T20:15:43.5301525Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-23T20:15:43.5301602Z ==============================================================================
2026-06-23T20:15:43.6618510Z Generating script.
2026-06-23T20:15:43.6630499Z ========================== Starting Command Output ===========================
2026-06-23T20:15:43.6638287Z [command]/bin/bash /opt/ads-agent/_work/_temp/f5ccd6cf-b226-4ed3-ba66-4fcbc973de81.sh
2026-06-23T20:15:43.6727501Z basename: falta operando
2026-06-23T20:15:43.6728330Z Try 'basename --help' for more information.
2026-06-23T20:15:43.6742397Z Foi realizado o deploy do pacote  no ambiente DES
2026-06-23T20:15:43.6743815Z APP Publicada nas URL: 
2026-06-23T20:15:43.6744371Z   - http://sigpd-backend.esteiras.des.caixa/
2026-06-23T20:15:43.6744965Z   - http://sigpd-backend.esteiras.des.caixa/sigpd-api/v1/health-check/live
2026-06-23T20:15:43.6786683Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-06-23T20:15:43.6787214Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-06-23T20:15:43.6787904Z 
2026-06-23T20:15:44.6854759Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-06-23T20:15:45.6866995Z   0     0    0     0    0     0      0      0 --:--:--  0:00:01 --:--:--     0
2026-06-23T20:15:46.6797591Z   0     0    0     0    0     0      0      0 --:--:--  0:00:02 --:--:--     0
2026-06-23T20:15:46.6797909Z   0     0    0     0    0     0      0      0 --:--:--  0:00:03 --:--:--     0
2026-06-23T20:15:46.6798054Z Warning: Transient problem: timeout Will retry in 1 seconds. 5 retries left.
2026-06-23T20:15:47.6808852Z 
2026-06-23T20:15:48.6828804Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-06-23T20:15:49.6840780Z   0     0    0     0    0     0      0      0 --:--:--  0:00:01 --:--:--     0
2026-06-23T20:15:50.6816943Z   0     0    0     0    0     0      0      0 --:--:--  0:00:02 --:--:--     0
2026-06-23T20:15:50.6817352Z   0     0    0     0    0     0      0      0 --:--:--  0:00:03 --:--:--     0
2026-06-23T20:15:50.6817625Z Warning: Transient problem: timeout Will retry in 2 seconds. 4 retries left.
2026-06-23T20:15:52.6840125Z 
2026-06-23T20:15:53.6858492Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-06-23T20:15:54.6871213Z   0     0    0     0    0     0      0      0 --:--:--  0:00:01 --:--:--     0
2026-06-23T20:15:55.6854445Z   0     0    0     0    0     0      0      0 --:--:--  0:00:02 --:--:--     0
2026-06-23T20:15:55.6854925Z   0     0    0     0    0     0      0      0 --:--:--  0:00:03 --:--:--     0
2026-06-23T20:15:55.6855207Z Warning: Transient problem: timeout Will retry in 4 seconds. 3 retries left.
2026-06-23T20:15:59.6895883Z 
2026-06-23T20:16:00.6918870Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-06-23T20:16:01.6930254Z   0     0    0     0    0     0      0      0 --:--:--  0:00:01 --:--:--     0
2026-06-23T20:16:02.6902754Z   0     0    0     0    0     0      0      0 --:--:--  0:00:02 --:--:--     0
2026-06-23T20:16:02.6903106Z   0     0    0     0    0     0      0      0 --:--:--  0:00:03 --:--:--     0
2026-06-23T20:16:02.6903273Z Warning: Transient problem: timeout Will retry in 8 seconds. 2 retries left.
2026-06-23T20:16:10.6908806Z 
2026-06-23T20:16:11.6928741Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-06-23T20:16:12.6940910Z   0     0    0     0    0     0      0      0 --:--:--  0:00:01 --:--:--     0
2026-06-23T20:16:13.6923354Z   0     0    0     0    0     0      0      0 --:--:--  0:00:02 --:--:--     0
2026-06-23T20:16:13.6924373Z   0     0    0     0    0     0      0      0 --:--:--  0:00:03 --:--:--     0
2026-06-23T20:16:13.6924674Z Warning: Transient problem: timeout Will retry in 16 seconds. 1 retries left.
2026-06-23T20:16:29.7085964Z 
2026-06-23T20:16:30.7108768Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-06-23T20:16:31.7120950Z   0     0    0     0    0     0      0      0 --:--:--  0:00:01 --:--:--     0
2026-06-23T20:16:32.7094725Z   0     0    0     0    0     0      0      0 --:--:--  0:00:02 --:--:--     0
2026-06-23T20:16:32.7095074Z   0     0    0     0    0     0      0      0 --:--:--  0:00:03 --:--:--     0
2026-06-23T20:16:32.7095226Z curl: (28) Connection timed out after 3000 milliseconds
2026-06-23T20:16:32.7126721Z Ocorreu um erro ao atualizar a url da aplicação na API InfraDevops
2026-06-23T20:16:32.7127436Z 000
2026-06-23T20:16:32.7175975Z ##[section]Finishing: Resumo da release



Warning: Permanently added '10.116.194.156' (ED25519) to the list of known hosts.
p585600@10.116.194.156's password:
Creating home directory for p585600.
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ hostanme
-sh: hostanme: comando não encontrado
-sh-4.2$ hostname
caddeapllx929.extra.caixa.gov.br
-sh-4.2$

esto uconectado tabe mno servidor



